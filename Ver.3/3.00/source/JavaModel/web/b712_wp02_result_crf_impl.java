/*
               File: b712_wp02_result_crf_impl
        Description: CRF検索結果
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:57:11.97
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
      cmbavD_group = new HTMLChoice();
      cmbavD_ol_disp = new HTMLChoice();
      dynavD_sort = new HTMLChoice();
      chkavD_grd_all_sel_flg = UIFactory.getCheckbox(this);
      chkavD_grd_all_sign_ok_sel_flg = UIFactory.getCheckbox(this);
      chkavD_grd_sel_flg = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vD_SORT") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvd_sort1J2( ) ;
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
            nRC_GXsfl_231 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_231_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_231_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_231, nGXsfl_231_idx, sGXsfl_231_idx) ;
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
         pa1J2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1J2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1J2( ) ;
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
      httpContext.writeValue( "CRF検索結果") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?2021579571468");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b712_wp02_result_crf") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1J2( )
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
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_b712_sd09_crf_add", AV132W_B712_SD09_CRF_ADD);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_b712_sd09_crf_add", AV132W_B712_SD09_CRF_ADD);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_231", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_231, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV193Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_SORT_NO", GXutil.ltrim( localUtil.ntoc( A335TAS01_SORT_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_DATA_KIND", GXutil.rtrim( A7TAS01_DATA_KIND));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_DEL_FLG", GXutil.rtrim( A300TAS01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_CHAR_1", GXutil.rtrim( A336TAS01_CHAR_1));
      GxWebStd.gx_hidden_field( httpContext, "TAS01_ITEM_NM", GXutil.rtrim( A9TAS01_ITEM_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A977TBM45_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_FILTER_NO", GXutil.ltrim( localUtil.ntoc( A978TBM45_FILTER_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV44P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vP_STUDY_ID", GetHash( "", String.valueOf(AV44P_STUDY_ID)));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_DEL_FLG", GXutil.rtrim( A982TBM45_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_FILETR_NM", GXutil.rtrim( A980TBM45_FILETR_NM));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vD_B712_SD06_RESULT_CRF", AV10D_B712_SD06_RESULT_CRF);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vD_B712_SD06_RESULT_CRF", AV10D_B712_SD06_RESULT_CRF);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_AUTH_CD", GXutil.rtrim( AV42P_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vP_AUTH_CD", GetHash( "", String.valueOf(AV42P_AUTH_CD)));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV55W_A821_JS));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      }
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV82W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "vW_SESSION_KEY_SUBJECT_CRF", GXutil.rtrim( AV162W_SESSION_KEY_SUBJECT_CRF));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vW_SESSION_KEY_SUBJECT_CRF", GetHash( "", String.valueOf(AV162W_SESSION_KEY_SUBJECT_CRF)));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM01_CRC_VALUE", GXutil.rtrim( AV106W_TBM01_CRC_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM01_RESEARCHER_VALUE", GXutil.rtrim( AV108W_TBM01_RESEARCHER_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM01_SITE_MG_VALUE", GXutil.rtrim( AV110W_TBM01_SITE_MG_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM01_DM_VALUE", GXutil.rtrim( AV107W_TBM01_DM_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM01_SAGYOJOHO_VALUE", GXutil.rtrim( AV109W_TBM01_SAGYOJOHO_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM01_JIMU_VALUE", GXutil.rtrim( AV180W_TBM01_JIMU_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM01_MONITOR_VALUE", GXutil.rtrim( AV181W_TBM01_MONITOR_VALUE));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD05_SEL4", AV61W_B712_SD05_SEL4);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD05_SEL4", AV61W_B712_SD05_SEL4);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD05_SEL_W", AV57W_B712_SD05_SEL_W);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD05_SEL_W", AV57W_B712_SD05_SEL_W);
      }
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_B712_SD07_INPUT_DISP", AV47SD_B712_SD07_INPUT_DISP);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_B712_SD07_INPUT_DISP", AV47SD_B712_SD07_INPUT_DISP);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD05_SEL2", AV59W_B712_SD05_SEL2);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD05_SEL2", AV59W_B712_SD05_SEL2);
      }
      GxWebStd.gx_hidden_field( httpContext, "vW_GET_SUBJECT_ID_VC", GXutil.rtrim( AV164W_GET_SUBJECT_ID_VC));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_SD_B712_SD11_C", AV160W_SD_B712_SD11_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_SD_B712_SD11_C", AV160W_SD_B712_SD11_C);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD05_SEL3", AV60W_B712_SD05_SEL3);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD05_SEL3", AV60W_B712_SD05_SEL3);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBT02_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A89TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B712_SD05_SEL1", AV58W_B712_SD05_SEL1);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B712_SD05_SEL1", AV58W_B712_SD05_SEL1);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBT02_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A90TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_P_KANI_KENSAKU", GXutil.rtrim( AV90W_P_KANI_KENSAKU));
      GxWebStd.gx_hidden_field( httpContext, "vW_SEL_PTN", GXutil.ltrim( localUtil.ntoc( AV94W_SEL_PTN, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_DM_ARRIVAL_FLG", GXutil.rtrim( A655TBT02_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_INPUT_END_FLG", GXutil.rtrim( A661TBT02_INPUT_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_DEL_FLG", GXutil.rtrim( A449TBT02_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_DEL_FLG", GXutil.rtrim( A441TBT01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_SITE_ID", GXutil.rtrim( A698TBT01_SITE_ID));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBT14_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A140TBT14_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A142TBT14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_CRF_ID", GXutil.ltrim( localUtil.ntoc( A474TBT14_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_ID", GXutil.ltrim( localUtil.ntoc( A91TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A941TBT14_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A935TBT02_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_REQUEST_AUTH_CD", GXutil.rtrim( A930TBT14_REQUEST_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_KAKUNIN_FLG", GXutil.rtrim( A927TBT14_KAKUNIN_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_KANRYO_FLG", GXutil.rtrim( A902TBT14_KANRYO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT14_DEL_FLG", GXutil.rtrim( A479TBT14_DEL_FLG));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_CRF_AUTH_FLG", AV73W_CRF_AUTH_FLG);
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_LATEST_VERSION", GXutil.ltrim( localUtil.ntoc( A498TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( localUtil.ntoc( A499TBT02_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_UPLOAD_DATETIME", localUtil.ttoc( A652TBT02_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_UPLOAD_USER_ID", GXutil.rtrim( A653TBT02_UPLOAD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_UPLOAD_AUTH_CD", GXutil.rtrim( A654TBT02_UPLOAD_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_SIGNATURE_USER_ID", GXutil.rtrim( A992TBT02_SIGNATURE_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_SIGNATURE_DATETIME", localUtil.ttoc( A991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_SIGNATURE_FLG", GXutil.rtrim( A990TBT02_SIGNATURE_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A456TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TAM07_USER_NM", GXutil.rtrim( AV104W_TAM07_USER_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A945TBM44_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_ID", GXutil.ltrim( localUtil.ntoc( A946TBM44_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A947TBM44_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_VISIT_NO", GXutil.ltrim( localUtil.ntoc( A948TBM44_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TAM08_SITE_SNM", GXutil.rtrim( AV105W_TAM08_SITE_SNM));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM31_CRF_SNM", GXutil.rtrim( AV111W_TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM31_ORDER", GXutil.ltrim( localUtil.ntoc( AV112W_TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM31_REPEAT_FLG", GXutil.ltrim( localUtil.ntoc( AV127W_TBM31_REPEAT_FLG, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM31_REPEAT_MAX", GXutil.ltrim( localUtil.ntoc( AV128W_TBM31_REPEAT_MAX, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_CRF_EDA_NO_MAX", GXutil.ltrim( localUtil.ntoc( AV126W_CRF_EDA_NO_MAX, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( A95TBT11_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A92TBT11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A93TBT11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_CRF_ID", GXutil.ltrim( localUtil.ntoc( A94TBT11_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A936TBT11_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_DM_ARRIVAL_FLG", GXutil.rtrim( A669TBT11_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A28TBM34_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_CRF_ID", GXutil.ltrim( localUtil.ntoc( A29TBM34_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM34_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV113W_TBM34_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_STYDY_AUTH_CD", GXutil.rtrim( A30TBM34_STYDY_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_DISPLAY_FLG", GXutil.rtrim( A571TBM34_DISPLAY_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM34_DEL_FLG", GXutil.rtrim( A572TBM34_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vW_TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV7W_TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DEL_FLG", GXutil.rtrim( A397TBM31_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_SNM", GXutil.rtrim( A642TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_ORDER", GXutil.ltrim( localUtil.ntoc( A395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_REPEAT_FLG", GXutil.ltrim( localUtil.ntoc( A943TBM31_REPEAT_FLG, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_REPEAT_MAX", GXutil.ltrim( localUtil.ntoc( A944TBM31_REPEAT_MAX, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_ID", GXutil.rtrim( A55TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "vW_TAM07_USER_ID", GXutil.rtrim( AV5W_TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_NM", GXutil.rtrim( A205TAM07_USER_NM));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_SITE_ID", GXutil.rtrim( A57TAM08_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "vW_TAM08_SITE_ID", GXutil.rtrim( AV6W_TAM08_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_DEL_FLG", GXutil.rtrim( A325TAM08_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_SITE_SNM", GXutil.rtrim( A320TAM08_SITE_SNM));
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
      return "B712_WP02_RESULT_CRF" ;
   }

   public String getPgmdesc( )
   {
      return "CRF検索結果" ;
   }

   public void wb1J0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1J2( true) ;
      }
      else
      {
         wb_table1_2_1J2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_396_1J2( true) ;
      }
      else
      {
         wb_table2_396_1J2( false) ;
      }
      return  ;
   }

   public void wb_table2_396_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1J2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "CRF検索結果", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0394") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0394", "");
         }
      }
      wbErr = false ;
      strup1J0( ) ;
   }

   public void ws1J2( )
   {
      start1J2( ) ;
      evt1J2( ) ;
   }

   public void evt1J2( )
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
                     else if ( GXutil.strcmp(sEvt, "VD_GROUP.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111J2 */
                        e111J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SUBJECT_ID_SEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121J2 */
                        e121J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SEARCH_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131J2 */
                        e131J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_OPEN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141J2 */
                        e141J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CHG_REKI'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151J2 */
                        e151J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SSAI_HYOJ'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161J2 */
                        e161J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_PDF_OUT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171J2 */
                        e171J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_PDF_OUT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181J2 */
                        e181J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_PDF_OUT_HIS_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191J2 */
                        e191J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_TEISYUTU'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201J2 */
                        e201J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DM_KAIJO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211J2 */
                        e211J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DM_KAIJO_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221J2 */
                        e221J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DATA_KTEI'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231J2 */
                        e231J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DATA_KTEI_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241J2 */
                        e241J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_DEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251J2 */
                        e251J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CRF_DEL_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261J2 */
                        e261J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV_OUT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271J2 */
                        e271J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV_OUT_EXEC_ALL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281J2 */
                        e281J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV_OUT_EXEC_DM'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e291J2 */
                        e291J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV_OUT_EXEC_SIGN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e301J2 */
                        e301J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV_OUT_EXEC_KTEI'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e311J2 */
                        e311J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD_ALL_SEL_FLG.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e321J2 */
                        e321J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD_ALL_SIGN_OK_SEL_FLG.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e331J2 */
                        e331J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_SORT.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e341J2 */
                        e341J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SIGN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e351J2 */
                        e351J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SIGN_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e361J2 */
                        e361J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e371J2 */
                        e371J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e381J2 */
                        e381J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e391J2 */
                        e391J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e401J2 */
                        e401J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e411J2 */
                        e411J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e421J2 */
                        e421J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e431J2 */
                        e431J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e441J2 */
                        e441J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e451J2 */
                        e451J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e461J2 */
                        e461J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e471J2 */
                        e471J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e481J2 */
                        e481J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e491J2 */
                        e491J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e501J2 */
                        e501J2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "'BTN_REPEAT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'BTN_REPEAT_DEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "'BTN_REPEAT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'BTN_REPEAT_DEL'") == 0 ) )
                     {
                        nGXsfl_231_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_231_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_231_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_2312( ) ;
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
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_eda_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_eda_no_Internalname), ".", ",") > 99 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_CRF_EDA_NO");
                           GX_FocusControl = edtavD_grd_crf_eda_no_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV124D_GRD_CRF_EDA_NO = (byte)(0) ;
                        }
                        else
                        {
                           AV124D_GRD_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_eda_no_Internalname), ".", ",")) ;
                        }
                        AV15D_GRD_CRF_SNM = httpContext.cgiGet( edtavD_grd_crf_snm_Internalname) ;
                        AV18D_GRD_LAST_UPD_DATETIME_VC = httpContext.cgiGet( edtavD_grd_last_upd_datetime_vc_Internalname) ;
                        AV23D_GRD_UPD_USER_NM = httpContext.cgiGet( edtavD_grd_upd_user_nm_Internalname) ;
                        AV17D_GRD_DM = httpContext.cgiGet( edtavD_grd_dm_Internalname) ;
                        AV147D_GRD_SIGN = httpContext.cgiGet( edtavD_grd_sign_Internalname) ;
                        AV16D_GRD_DATA_KOTE = httpContext.cgiGet( edtavD_grd_data_kote_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0394") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0394", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0394") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0394", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e511J2 */
                              e511J2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e521J2 */
                              e521J2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e531J2 */
                              e531J2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_REPEAT'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e541J2 */
                              e541J2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_REPEAT_DEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e551J2 */
                              e551J2 ();
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
                  else if ( nCmpId == 394 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0394") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0394", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1J2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1J2( ) ;
         }
      }
   }

   public void pa1J2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         cmbavD_group.setName( "vD_GROUP" );
         cmbavD_group.setWebtags( "" );
         if ( cmbavD_group.getItemCount() > 0 )
         {
            AV141D_GROUP = (short)(GXutil.lval( cmbavD_group.getValidValue(GXutil.trim( GXutil.str( AV141D_GROUP, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV141D_GROUP", GXutil.ltrim( GXutil.str( AV141D_GROUP, 4, 0)));
         }
         cmbavD_ol_disp.setName( "vD_OL_DISP" );
         cmbavD_ol_disp.setWebtags( "" );
         cmbavD_ol_disp.addItem("1", "ドメイン、ドメイン変数、選択肢", (short)(0));
         cmbavD_ol_disp.addItem("2", "参照先ID、項目ID", (short)(0));
         if ( cmbavD_ol_disp.getItemCount() > 0 )
         {
            AV24D_OL_DISP = cmbavD_ol_disp.getValidValue(AV24D_OL_DISP) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
         }
         dynavD_sort.setName( "vD_SORT" );
         dynavD_sort.setWebtags( "" );
         chkavD_grd_all_sel_flg.setName( "vD_GRD_ALL_SEL_FLG" );
         chkavD_grd_all_sel_flg.setWebtags( "" );
         chkavD_grd_all_sel_flg.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd_all_sel_flg.getInternalname(), "Caption", chkavD_grd_all_sel_flg.getCaption());
         chkavD_grd_all_sel_flg.setCheckedValue( "false" );
         chkavD_grd_all_sign_ok_sel_flg.setName( "vD_GRD_ALL_SIGN_OK_SEL_FLG" );
         chkavD_grd_all_sign_ok_sel_flg.setWebtags( "" );
         chkavD_grd_all_sign_ok_sel_flg.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd_all_sign_ok_sel_flg.getInternalname(), "Caption", chkavD_grd_all_sign_ok_sel_flg.getCaption());
         chkavD_grd_all_sign_ok_sel_flg.setCheckedValue( "false" );
         GXCCtl = "vD_GRD_SEL_FLG_" + sGXsfl_231_idx ;
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

   public void gxdlvvd_sort1J2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvd_sort_data1J2( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvd_sort_html1J2( )
   {
      String gxdynajaxvalue ;
      gxdlvvd_sort_data1J2( ) ;
      gxdynajaxindex = 1 ;
      dynavD_sort.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavD_sort.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavD_sort.getItemCount() > 0 )
      {
         AV27D_SORT = dynavD_sort.getValidValue(AV27D_SORT) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27D_SORT", AV27D_SORT);
      }
   }

   protected void gxdlvvd_sort_data1J2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H001J2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H001J2_A8TAS01_ITEM_CD[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H001J2_A9TAS01_ITEM_NM[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_231 ,
                                 short nGXsfl_231_idx ,
                                 String sGXsfl_231_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_2312( ) ;
      while ( nGXsfl_231_idx <= nRC_GXsfl_231 )
      {
         sendrow_2312( ) ;
         nGXsfl_231_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_231_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_231_idx+1)) ;
         sGXsfl_231_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_231_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_2312( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1J2( ) ;
      /* End function Refresh */
   }

   public void rf1J2( )
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
      wbStart = (short)(231) ;
      nGXsfl_231_idx = (short)(1) ;
      sGXsfl_231_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_231_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2312( ) ;
      nGXsfl_231_Refreshing = (short)(1) ;
      /* Execute user event: e521J2 */
      e521J2 ();
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
         subsflControlProps_2312( ) ;
         /* Execute user event: e531J2 */
         e531J2 ();
         wbEnd = (short)(231) ;
         wb1J0( ) ;
      }
      nGXsfl_231_Refreshing = (short)(0) ;
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
      return 15*1 ;
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

   public void strup1J0( )
   {
      /* Before Start, stand alone formulas. */
      AV193Pgmname = "B712_WP02_RESULT_CRF" ;
      AV190Pgmdesc = "CRF検索結果" ;
      Gx_err = (short)(0) ;
      edtavD_grd_subject_id_Enabled = 0 ;
      edtavD_grd_site_snm_Enabled = 0 ;
      edtavD_grd_crf_snm_Enabled = 0 ;
      edtavD_grd_last_upd_datetime_vc_Enabled = 0 ;
      edtavD_grd_upd_user_nm_Enabled = 0 ;
      edtavD_grd_dm_Enabled = 0 ;
      edtavD_grd_sign_Enabled = 0 ;
      edtavD_grd_data_kote_Enabled = 0 ;
      gxvvd_sort_html1J2( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e511J2 */
      e511J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV30H_A_PAGING_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b712_sd09_crf_add"), AV132W_B712_SD09_CRF_ADD);
         /* Read variables values. */
         cmbavD_group.setName( cmbavD_group.getInternalname() );
         cmbavD_group.setValue( httpContext.cgiGet( cmbavD_group.getInternalname()) );
         AV141D_GROUP = (short)(GXutil.lval( httpContext.cgiGet( cmbavD_group.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV141D_GROUP", GXutil.ltrim( GXutil.str( AV141D_GROUP, 4, 0)));
         AV142D_SUBJECT_ID = httpContext.cgiGet( edtavD_subject_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV142D_SUBJECT_ID", AV142D_SUBJECT_ID);
         cmbavD_ol_disp.setName( cmbavD_ol_disp.getInternalname() );
         cmbavD_ol_disp.setValue( httpContext.cgiGet( cmbavD_ol_disp.getInternalname()) );
         AV24D_OL_DISP = httpContext.cgiGet( cmbavD_ol_disp.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
         dynavD_sort.setName( dynavD_sort.getInternalname() );
         dynavD_sort.setValue( httpContext.cgiGet( dynavD_sort.getInternalname()) );
         AV27D_SORT = httpContext.cgiGet( dynavD_sort.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27D_SORT", AV27D_SORT);
         AV12D_GRD_ALL_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_all_sel_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_GRD_ALL_SEL_FLG", AV12D_GRD_ALL_SEL_FLG);
         AV183D_GRD_ALL_SIGN_OK_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_all_sign_ok_sel_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV183D_GRD_ALL_SIGN_OK_SEL_FLG", AV183D_GRD_ALL_SIGN_OK_SEL_FLG);
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_crf_eda_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_crf_eda_no_Internalname), ".", ",") > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SEL_TBT02_CRF_EDA_NO");
            GX_FocusControl = edtavH_sel_tbt02_crf_eda_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV137H_SEL_TBT02_CRF_EDA_NO = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137H_SEL_TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV137H_SEL_TBT02_CRF_EDA_NO, 2, 0)));
         }
         else
         {
            AV137H_SEL_TBT02_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_sel_tbt02_crf_eda_no_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137H_SEL_TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV137H_SEL_TBT02_CRF_EDA_NO, 2, 0)));
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
         AV31H_DEVICE = httpContext.cgiGet( edtavH_device_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31H_DEVICE", AV31H_DEVICE);
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
         AV138H_MSG_REP = httpContext.cgiGet( edtavH_msg_rep_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138H_MSG_REP", AV138H_MSG_REP);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt02_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt02_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBT02_SUBJECT_ID");
            GX_FocusControl = edtavCtltbt02_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV132W_B712_SD09_CRF_ADD.setgxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id( 0 );
         }
         else
         {
            AV132W_B712_SD09_CRF_ADD.setgxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbt02_subject_id_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavW_pdf_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavW_pdf_cnt_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vW_PDF_CNT");
            GX_FocusControl = edtavW_pdf_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV176W_PDF_CNT = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV176W_PDF_CNT", GXutil.ltrim( GXutil.str( AV176W_PDF_CNT, 4, 0)));
         }
         else
         {
            AV176W_PDF_CNT = (short)(localUtil.ctol( httpContext.cgiGet( edtavW_pdf_cnt_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV176W_PDF_CNT", GXutil.ltrim( GXutil.str( AV176W_PDF_CNT, 4, 0)));
         }
         AV121W_ZIP_FILE_PATH = httpContext.cgiGet( edtavW_zip_file_path_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV121W_ZIP_FILE_PATH", AV121W_ZIP_FILE_PATH);
         AV122W_ZIP_FILENAME = httpContext.cgiGet( edtavW_zip_filename_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV122W_ZIP_FILENAME", AV122W_ZIP_FILENAME);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavW_pdf_err_cd_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavW_pdf_err_cd_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vW_PDF_ERR_CD");
            GX_FocusControl = edtavW_pdf_err_cd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV172W_PDF_ERR_CD = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV172W_PDF_ERR_CD", GXutil.str( AV172W_PDF_ERR_CD, 1, 0));
         }
         else
         {
            AV172W_PDF_ERR_CD = (byte)(localUtil.ctol( httpContext.cgiGet( edtavW_pdf_err_cd_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV172W_PDF_ERR_CD", GXutil.str( AV172W_PDF_ERR_CD, 1, 0));
         }
         AV173W_PDF_ERR_MSG = httpContext.cgiGet( edtavW_pdf_err_msg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV173W_PDF_ERR_MSG", AV173W_PDF_ERR_MSG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_popup_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_popup_kbn_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_POPUP_KBN");
            GX_FocusControl = edtavH_popup_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV170H_POPUP_KBN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV170H_POPUP_KBN", GXutil.ltrim( GXutil.str( AV170H_POPUP_KBN, 4, 0)));
         }
         else
         {
            AV170H_POPUP_KBN = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_popup_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV170H_POPUP_KBN", GXutil.ltrim( GXutil.str( AV170H_POPUP_KBN, 4, 0)));
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
         AV143H_B712_WP05_OK = httpContext.cgiGet( edtavH_b712_wp05_ok_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV143H_B712_WP05_OK", AV143H_B712_WP05_OK);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_b712_wp05_signature_chk_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_b712_wp05_signature_chk_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_B712_WP05_SIGNATURE_CHK");
            GX_FocusControl = edtavH_b712_wp05_signature_chk_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV145H_B712_WP05_SIGNATURE_CHK = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145H_B712_WP05_SIGNATURE_CHK", GXutil.str( AV145H_B712_WP05_SIGNATURE_CHK, 1, 0));
         }
         else
         {
            AV145H_B712_WP05_SIGNATURE_CHK = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_b712_wp05_signature_chk_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145H_B712_WP05_SIGNATURE_CHK", GXutil.str( AV145H_B712_WP05_SIGNATURE_CHK, 1, 0));
         }
         AV146H_B712_WP05_SIGNATURE_USER_ID = httpContext.cgiGet( edtavH_b712_wp05_signature_user_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV146H_B712_WP05_SIGNATURE_USER_ID", AV146H_B712_WP05_SIGNATURE_USER_ID);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_pdf_cd_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_pdf_cd_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SEL_PDF_CD");
            GX_FocusControl = edtavH_sel_pdf_cd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV178H_SEL_PDF_CD = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV178H_SEL_PDF_CD", GXutil.str( AV178H_SEL_PDF_CD, 1, 0));
         }
         else
         {
            AV178H_SEL_PDF_CD = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_sel_pdf_cd_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV178H_SEL_PDF_CD", GXutil.str( AV178H_SEL_PDF_CD, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_csv_cd_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sel_csv_cd_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SEL_CSV_CD");
            GX_FocusControl = edtavH_sel_csv_cd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV182H_SEL_CSV_CD = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV182H_SEL_CSV_CD", GXutil.str( AV182H_SEL_CSV_CD, 1, 0));
         }
         else
         {
            AV182H_SEL_CSV_CD = (byte)(localUtil.ctol( httpContext.cgiGet( edtavH_sel_csv_cd_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV182H_SEL_CSV_CD", GXutil.str( AV182H_SEL_CSV_CD, 1, 0));
         }
         /* Read saved values. */
         nRC_GXsfl_231 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_231"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0394") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0394", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
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
      /* Execute user event: e511J2 */
      e511J2 ();
      if (returnInSub) return;
   }

   public void e511J2( )
   {
      /* Start Routine */
      AV8C_APP_ID = "B712" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_APP_ID", AV8C_APP_ID);
      AV9C_GAMEN_TITLE = AV190Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_GAMEN_TITLE", AV9C_GAMEN_TITLE);
      AV44P_STUDY_ID = GXutil.lval( AV95W_SESSION.getValue("B712_WP02_STUDY_ID")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      AV42P_AUTH_CD = AV95W_SESSION.getValue("B712_WP02_AUTH_CD") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42P_AUTH_CD", AV42P_AUTH_CD);
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
      /* Using cursor H001J3 */
      pr_default.execute(1, new Object[] {new Long(AV44P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A369TBM21_DEL_FLG = H001J3_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H001J3_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = H001J3_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H001J3_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H001J3_n367TBM21_STUDY_NM[0] ;
         AV99W_STUDY_NM = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99W_STUDY_NM", AV99W_STUDY_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor H001J4 */
      pr_default.execute(2, new Object[] {AV42P_AUTH_CD});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A215TAM04_DEL_FLG = H001J4_A215TAM04_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215TAM04_DEL_FLG", A215TAM04_DEL_FLG);
         n215TAM04_DEL_FLG = H001J4_n215TAM04_DEL_FLG[0] ;
         A13TAM04_AUTH_CD = H001J4_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         A285TAM04_AUTH_NM = H001J4_A285TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
         n285TAM04_AUTH_NM = H001J4_n285TAM04_AUTH_NM[0] ;
         AV56W_AUTH_NM = A285TAM04_AUTH_NM + "権限" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56W_AUTH_NM", AV56W_AUTH_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV53W_A_LOGIN_SDT,AV8C_APP_ID,AV99W_STUDY_NM,AV56W_AUTH_NM,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0394",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      AV162W_SESSION_KEY_SUBJECT_CRF = "B712_WP01_KEY_SUBJECT_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV162W_SESSION_KEY_SUBJECT_CRF", AV162W_SESSION_KEY_SUBJECT_CRF);
      GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem1[0] = AV47SD_B712_SD07_INPUT_DISP ;
      GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem2[0] = AV49SD_B712_SD08_ICON_INFO ;
      new b712_pc01_disp_info_get(remoteHandle, context).execute( GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem1, GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem2) ;
      AV47SD_B712_SD07_INPUT_DISP = GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem1[0] ;
      AV49SD_B712_SD08_ICON_INFO = GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem2[0] ;
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
      tblTbl_grd_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd_hidden_Visible, 5, 0)));
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
   }

   public void e521J2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV33H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = dynavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
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
      if ( GXutil.strcmp(AV143H_B712_WP05_OK, "B712_WP05_OK") == 0 )
      {
         /* Execute user subroutine: S172 */
         S172 ();
         if (returnInSub) return;
      }
      AV143H_B712_WP05_OK = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV143H_B712_WP05_OK", AV143H_B712_WP05_OK);
      AV145H_B712_WP05_SIGNATURE_CHK = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV145H_B712_WP05_SIGNATURE_CHK", GXutil.str( AV145H_B712_WP05_SIGNATURE_CHK, 1, 0));
      AV146H_B712_WP05_SIGNATURE_USER_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV146H_B712_WP05_SIGNATURE_USER_ID", AV146H_B712_WP05_SIGNATURE_USER_ID);
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
   }

   private void e531J2( )
   {
      /* Grid1_Load Routine */
      AV194GXV3 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV194GXV3", GXutil.ltrim( GXutil.str( AV194GXV3, 8, 0)));
      while ( AV194GXV3 <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV194GXV3));
         AV19D_GRD_SEL_FLG = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() ;
         AV22D_GRD_SUBJECT_ID = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() ;
         AV20D_GRD_SITE_ID = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id() ;
         AV21D_GRD_SITE_SNM = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm() ;
         AV14D_GRD_CRF_ID = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() ;
         AV124D_GRD_CRF_EDA_NO = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() ;
         AV15D_GRD_CRF_SNM = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm() ;
         AV23D_GRD_UPD_USER_NM = AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm() ;
         if ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg() == 1 )
         {
            tblTbl_repeat_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_repeat_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_repeat_Visible, 5, 0)));
            AV139W_CNT_REPEAT = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139W_CNT_REPEAT", GXutil.ltrim( GXutil.str( AV139W_CNT_REPEAT, 4, 0)));
            /* Optimized group. */
            /* Using cursor H001J5 */
            pr_default.execute(3, new Object[] {new Long(AV44P_STUDY_ID), new Integer(AV22D_GRD_SUBJECT_ID), new Short(AV14D_GRD_CRF_ID)});
            cV139W_CNT_REPEAT = H001J5_AV139W_CNT_REPEAT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "cV139W_CNT_REPEAT", GXutil.ltrim( GXutil.str( cV139W_CNT_REPEAT, 4, 0)));
            pr_default.close(3);
            AV139W_CNT_REPEAT = (short)(AV139W_CNT_REPEAT+cV139W_CNT_REPEAT*1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139W_CNT_REPEAT", GXutil.ltrim( GXutil.str( AV139W_CNT_REPEAT, 4, 0)));
            /* End optimized group. */
            if ( AV139W_CNT_REPEAT < AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max() )
            {
               imgBtn_repeat_Visible = 1 ;
            }
            else
            {
               imgBtn_repeat_Visible = 0 ;
            }
            if ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() == 1 )
            {
               imgBtn_repeat_del_Visible = 0 ;
            }
            else
            {
               imgBtn_repeat_del_Visible = 1 ;
            }
         }
         else
         {
            tblTbl_repeat_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_repeat_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_repeat_Visible, 5, 0)));
         }
         if ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg(), "1") == 0 )
         {
            AV17D_GRD_DM = "済" ;
            AV77W_DATA_KBN = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77W_DATA_KBN", AV77W_DATA_KBN);
         }
         else
         {
            if ( GXutil.nullDate().equals(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime()) )
            {
               AV17D_GRD_DM = "未" ;
               AV77W_DATA_KBN = "0" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV77W_DATA_KBN", AV77W_DATA_KBN);
            }
            else
            {
               AV17D_GRD_DM = "差戻" ;
               AV77W_DATA_KBN = "2" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV77W_DATA_KBN", AV77W_DATA_KBN);
            }
         }
         if ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg(), "1") == 0 )
         {
            AV147D_GRD_SIGN = "済" ;
         }
         else
         {
            AV147D_GRD_SIGN = "未" ;
         }
         if ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg(), "1") == 0 )
         {
            AV16D_GRD_DATA_KOTE = "済" ;
            AV77W_DATA_KBN = "3" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77W_DATA_KBN", AV77W_DATA_KBN);
         }
         else
         {
            AV16D_GRD_DATA_KOTE = "未" ;
         }
         AV196GXV4 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV196GXV4", GXutil.ltrim( GXutil.str( AV196GXV4, 8, 0)));
         while ( AV196GXV4 <= AV47SD_B712_SD07_INPUT_DISP.size() )
         {
            AV48SD_B712_SD07_INPUT_DISP_I = (SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV47SD_B712_SD07_INPUT_DISP.elementAt(-1+AV196GXV4));
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
               if (true) break;
            }
            AV196GXV4 = (int)(AV196GXV4+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV196GXV4", GXutil.ltrim( GXutil.str( AV196GXV4, 8, 0)));
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
            AV197GXV5 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV197GXV5", GXutil.ltrim( GXutil.str( AV197GXV5, 8, 0)));
            while ( AV197GXV5 <= AV49SD_B712_SD08_ICON_INFO.size() )
            {
               AV50SD_B712_SD08_ICON_INFO_I = (SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)((SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)AV49SD_B712_SD08_ICON_INFO.elementAt(-1+AV197GXV5));
               if ( GXutil.strcmp(AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd(), AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd()) == 0 )
               {
                  lblTxt_grd_upd_kngn_Caption = AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption() ;
                  tblTbl_grd_upd_kngn_Backcolor = UIFactory.getColor( AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g(), AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b()) ;
                  httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd_upd_kngn_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( tblTbl_grd_upd_kngn_Backcolor, 9, 0)));
                  if (true) break;
               }
               AV197GXV5 = (int)(AV197GXV5+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV197GXV5", GXutil.ltrim( GXutil.str( AV197GXV5, 8, 0)));
            }
         }
         if ( GXutil.nullDate().equals(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime()) )
         {
            AV18D_GRD_LAST_UPD_DATETIME_VC = "" ;
            AV13D_GRD_CHG = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13D_GRD_CHG", AV13D_GRD_CHG);
         }
         else
         {
            GXt_char3 = AV18D_GRD_LAST_UPD_DATETIME_VC ;
            GXv_char4[0] = GXt_char3 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime(), "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
            AV18D_GRD_LAST_UPD_DATETIME_VC = GXt_char3 ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(231) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 15 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_2312( ) ;
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
         AV194GXV3 = (int)(AV194GXV3+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV194GXV3", GXutil.ltrim( GXutil.str( AV194GXV3, 8, 0)));
      }
   }

   public void e111J2( )
   {
      /* D_group_Click Routine */
      AV151D_B712_SD06_RESULT_CRF_W.clear();
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      AV149SD_C712_SD10_C.clear();
      /* Using cursor H001J6 */
      pr_default.execute(4, new Object[] {new Long(AV44P_STUDY_ID), new Short(AV141D_GROUP)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A982TBM45_DEL_FLG = H001J6_A982TBM45_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A982TBM45_DEL_FLG", A982TBM45_DEL_FLG);
         n982TBM45_DEL_FLG = H001J6_n982TBM45_DEL_FLG[0] ;
         A978TBM45_FILTER_NO = H001J6_A978TBM45_FILTER_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
         A977TBM45_STUDY_ID = H001J6_A977TBM45_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
         A981TBM45_IN_CRF_ID = H001J6_A981TBM45_IN_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A981TBM45_IN_CRF_ID", A981TBM45_IN_CRF_ID);
         n981TBM45_IN_CRF_ID = H001J6_n981TBM45_IN_CRF_ID[0] ;
         AV149SD_C712_SD10_C.fromJSonString(A981TBM45_IN_CRF_ID);
         httpContext.ajax_rsp_assign_attri("", false, "A981TBM45_IN_CRF_ID", A981TBM45_IN_CRF_ID);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV10D_B712_SD06_RESULT_CRF.size() > 0 )
      {
         AV199GXV6 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV199GXV6", GXutil.ltrim( GXutil.str( AV199GXV6, 8, 0)));
         while ( AV199GXV6 <= AV10D_B712_SD06_RESULT_CRF.size() )
         {
            AV148W_B712_SD03_CRF_LIST_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV199GXV6));
            if ( AV141D_GROUP == 0 )
            {
               AV151D_B712_SD06_RESULT_CRF_W.add(AV148W_B712_SD03_CRF_LIST_Item, 0);
            }
            else
            {
               AV200GXV7 = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV200GXV7", GXutil.ltrim( GXutil.str( AV200GXV7, 8, 0)));
               while ( AV200GXV7 <= AV149SD_C712_SD10_C.size() )
               {
                  AV150SD_C712_SD10_I = (SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV149SD_C712_SD10_C.elementAt(-1+AV200GXV7));
                  if ( AV148W_B712_SD03_CRF_LIST_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() == AV150SD_C712_SD10_I.getgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid() )
                  {
                     AV151D_B712_SD06_RESULT_CRF_W.add(AV148W_B712_SD03_CRF_LIST_Item, 0);
                     if (true) break;
                  }
                  AV200GXV7 = (int)(AV200GXV7+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV200GXV7", GXutil.ltrim( GXutil.str( AV200GXV7, 8, 0)));
               }
            }
            AV199GXV6 = (int)(AV199GXV6+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV199GXV6", GXutil.ltrim( GXutil.str( AV199GXV6, 8, 0)));
         }
      }
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV10D_B712_SD06_RESULT_CRF.clear();
      AV10D_B712_SD06_RESULT_CRF.fromJSonString(AV151D_B712_SD06_RESULT_CRF_W.toJSonString(false));
      AV151D_B712_SD06_RESULT_CRF_W.clear();
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
   }

   public void e121J2( )
   {
      /* 'BTN_SUBJECT_ID_SEL' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV153W_SUBJECT_ID_C.clear();
      AV155W_SUBJECT_LEN = (short)(GXutil.len( AV142D_SUBJECT_ID)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV155W_SUBJECT_LEN", GXutil.ltrim( GXutil.str( AV155W_SUBJECT_LEN, 4, 0)));
      AV156W_SUBJECT_EDIT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV156W_SUBJECT_EDIT", AV156W_SUBJECT_EDIT);
      AV154W_IX1 = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV154W_IX1", GXutil.ltrim( GXutil.str( AV154W_IX1, 4, 0)));
      while ( AV154W_IX1 <= AV155W_SUBJECT_LEN )
      {
         AV157W_SUBJECT_VC = GXutil.substring( AV142D_SUBJECT_ID, AV154W_IX1, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV157W_SUBJECT_VC", AV157W_SUBJECT_VC);
         if ( GXutil.strcmp(AV157W_SUBJECT_VC, ",") == 0 )
         {
            AV152W_SUBJECT_ID_I = (int)(GXutil.lval( GXutil.trim( AV156W_SUBJECT_EDIT))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV152W_SUBJECT_ID_I", GXutil.ltrim( GXutil.str( AV152W_SUBJECT_ID_I, 6, 0)));
            if ( AV152W_SUBJECT_ID_I != 0 )
            {
               AV153W_SUBJECT_ID_C.add((int)(AV152W_SUBJECT_ID_I), 0);
            }
            AV156W_SUBJECT_EDIT = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV156W_SUBJECT_EDIT", AV156W_SUBJECT_EDIT);
         }
         else
         {
            AV156W_SUBJECT_EDIT = AV156W_SUBJECT_EDIT + AV157W_SUBJECT_VC ;
            httpContext.ajax_rsp_assign_attri("", false, "AV156W_SUBJECT_EDIT", AV156W_SUBJECT_EDIT);
         }
         AV154W_IX1 = (short)(AV154W_IX1+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV154W_IX1", GXutil.ltrim( GXutil.str( AV154W_IX1, 4, 0)));
      }
      if ( ! (GXutil.strcmp("", AV156W_SUBJECT_EDIT)==0) )
      {
         AV152W_SUBJECT_ID_I = (int)(GXutil.lval( GXutil.trim( AV156W_SUBJECT_EDIT))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV152W_SUBJECT_ID_I", GXutil.ltrim( GXutil.str( AV152W_SUBJECT_ID_I, 6, 0)));
         if ( AV152W_SUBJECT_ID_I != 0 )
         {
            AV153W_SUBJECT_ID_C.add((int)(AV152W_SUBJECT_ID_I), 0);
         }
      }
      AV201GXV8 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV201GXV8", GXutil.ltrim( GXutil.str( AV201GXV8, 8, 0)));
      while ( AV201GXV8 <= AV153W_SUBJECT_ID_C.size() )
      {
         AV152W_SUBJECT_ID_I = ((Number) AV153W_SUBJECT_ID_C.elementAt(-1+AV201GXV8)).intValue() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV152W_SUBJECT_ID_I", GXutil.ltrim( GXutil.str( AV152W_SUBJECT_ID_I, 6, 0)));
         AV202GXV9 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV202GXV9", GXutil.ltrim( GXutil.str( AV202GXV9, 8, 0)));
         while ( AV202GXV9 <= AV10D_B712_SD06_RESULT_CRF.size() )
         {
            AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV202GXV9));
            if ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() == AV152W_SUBJECT_ID_I )
            {
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
            }
            AV202GXV9 = (int)(AV202GXV9+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV202GXV9", GXutil.ltrim( GXutil.str( AV202GXV9, 8, 0)));
         }
         AV201GXV8 = (int)(AV201GXV8+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV201GXV8", GXutil.ltrim( GXutil.str( AV201GXV8, 8, 0)));
      }
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
   }

   public void e131J2( )
   {
      /* 'BTN_SEARCH_BACK' Routine */
      AV95W_SESSION.remove("B712_WP02_STUDY_ID");
      AV95W_SESSION.remove("B712_WP02_AUTH_CD");
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      AV95W_SESSION.remove("B712_WP01_SEARCH_CRF_D_OL_DISP");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b712_wp01_search_crf"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV44P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV42P_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("b712_wp01_search_crf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e141J2( )
   {
      /* 'BTN_CRF_OPEN' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV98W_STUDY_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98W_STUDY_ID", AV98W_STUDY_ID);
      AV100W_SUBJECT_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100W_SUBJECT_ID", AV100W_SUBJECT_ID);
      AV134W_CRF_ID_EDA_NO = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV134W_CRF_ID_EDA_NO", AV134W_CRF_ID_EDA_NO);
      AV75W_CRF_INPUT_LEVEL = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75W_CRF_INPUT_LEVEL", AV75W_CRF_INPUT_LEVEL);
      AV119W_UPD_CNT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119W_UPD_CNT", AV119W_UPD_CNT);
      AV82W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      if ( AV93W_SEL_CNT == 0 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
      }
      else
      {
         GXt_char3 = AV123W_SYS_VALUE ;
         GXv_char4[0] = GXt_char3 ;
         new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "024", GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         AV123W_SYS_VALUE = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV123W_SYS_VALUE", AV123W_SYS_VALUE);
         if ( GXutil.val( AV123W_SYS_VALUE, ".") > 0 )
         {
            if ( AV93W_SEL_CNT > GXutil.val( AV123W_SYS_VALUE, ".") )
            {
               GXt_char3 = AV89W_MSG ;
               GXv_char4[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00093", "CRFを開く", AV123W_SYS_VALUE, "開く", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 10, 0)), "", GXv_char4) ;
               b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV123W_SYS_VALUE", AV123W_SYS_VALUE);
               AV89W_MSG = GXt_char3 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
               httpContext.GX_msglist.addItem(AV89W_MSG);
               AV82W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
            }
         }
      }
      if ( ! AV82W_ERRFLG )
      {
         GXt_char3 = AV96W_SESSION_KEY ;
         GXv_char4[0] = GXt_char3 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53W_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
         AV96W_SESSION_KEY = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96W_SESSION_KEY", AV96W_SESSION_KEY);
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
         httpContext.ajax_rsp_assign_attri("", false, "AV72W_CNT2", GXutil.ltrim( GXutil.str( AV72W_CNT2, 4, 0)));
         while ( AV72W_CNT2 <= 100 )
         {
            GXv_char4[0] = AV97W_STR ;
            GXv_int5[0] = AV91W_RET_CD ;
            new a822_pc01_str_token(remoteHandle, context).execute( AV24D_OL_DISP, "&", AV72W_CNT2, GXv_char4, GXv_int5) ;
            b712_wp02_result_crf_impl.this.AV97W_STR = GXv_char4[0] ;
            b712_wp02_result_crf_impl.this.AV91W_RET_CD = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24D_OL_DISP", AV24D_OL_DISP);
            httpContext.ajax_rsp_assign_attri("", false, "AV72W_CNT2", GXutil.ltrim( GXutil.str( AV72W_CNT2, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV97W_STR", AV97W_STR);
            httpContext.ajax_rsp_assign_attri("", false, "AV91W_RET_CD", GXutil.str( AV91W_RET_CD, 1, 0));
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
            httpContext.ajax_rsp_assign_attri("", false, "AV72W_CNT2", GXutil.ltrim( GXutil.str( AV72W_CNT2, 4, 0)));
         }
         AV95W_SESSION.setValue(AV96W_SESSION_KEY, AV51SD_B792_SD00_HTML5_EXEC_INFO.toxml(false, true, "B792_SD00_HTML5_EXEC_INFO", "tablet-EDC_GXXEV3U3"));
         httpContext.ajax_rsp_assign_attri("", false, "AV96W_SESSION_KEY", AV96W_SESSION_KEY);
         GXt_char3 = AV96W_SESSION_KEY ;
         GXv_char4[0] = GXt_char3 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53W_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
         AV96W_SESSION_KEY = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96W_SESSION_KEY", AV96W_SESSION_KEY);
         AV95W_SESSION.remove(AV96W_SESSION_KEY);
         httpContext.ajax_rsp_assign_attri("", false, "AV96W_SESSION_KEY", AV96W_SESSION_KEY);
         AV87W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
         while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
         {
            if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
            {
               if ( (GXutil.strcmp("", AV98W_STUDY_ID)==0) )
               {
                  AV98W_STUDY_ID = "STUDY_ID=" + GXutil.trim( GXutil.str( AV44P_STUDY_ID, 10, 0)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV98W_STUDY_ID", AV98W_STUDY_ID);
               }
               else
               {
                  AV98W_STUDY_ID = AV98W_STUDY_ID + "," + GXutil.trim( GXutil.str( AV44P_STUDY_ID, 10, 0)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV98W_STUDY_ID", AV98W_STUDY_ID);
               }
               if ( (GXutil.strcmp("", AV100W_SUBJECT_ID)==0) )
               {
                  AV100W_SUBJECT_ID = "&SUBJECT_ID=" + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id(), 6, 0)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV100W_SUBJECT_ID", AV100W_SUBJECT_ID);
               }
               else
               {
                  AV100W_SUBJECT_ID = AV100W_SUBJECT_ID + "," + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id(), 6, 0)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV100W_SUBJECT_ID", AV100W_SUBJECT_ID);
               }
               AV135W_TMP_CRFID_EDANO = GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id(), 4, 0)) + "_" + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no(), 2, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV135W_TMP_CRFID_EDANO", AV135W_TMP_CRFID_EDANO);
               if ( (GXutil.strcmp("", AV134W_CRF_ID_EDA_NO)==0) )
               {
                  AV134W_CRF_ID_EDA_NO = "&CRFID=" + AV135W_TMP_CRFID_EDANO ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV134W_CRF_ID_EDA_NO", AV134W_CRF_ID_EDA_NO);
               }
               else
               {
                  AV134W_CRF_ID_EDA_NO = AV134W_CRF_ID_EDA_NO + "," + AV135W_TMP_CRFID_EDANO ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV134W_CRF_ID_EDA_NO", AV134W_CRF_ID_EDA_NO);
               }
               if ( (GXutil.strcmp("", AV75W_CRF_INPUT_LEVEL)==0) )
               {
                  AV75W_CRF_INPUT_LEVEL = "&CRF_INPUT_LEVEL=" + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version(), 4, 0)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV75W_CRF_INPUT_LEVEL", AV75W_CRF_INPUT_LEVEL);
               }
               else
               {
                  AV75W_CRF_INPUT_LEVEL = AV75W_CRF_INPUT_LEVEL + "," + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version(), 4, 0)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV75W_CRF_INPUT_LEVEL", AV75W_CRF_INPUT_LEVEL);
               }
               if ( (GXutil.strcmp("", AV119W_UPD_CNT)==0) )
               {
                  AV119W_UPD_CNT = "&CRF_UPD_CNT=" + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt(), 10, 0)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV119W_UPD_CNT", AV119W_UPD_CNT);
               }
               else
               {
                  AV119W_UPD_CNT = AV119W_UPD_CNT + "," + GXutil.trim( GXutil.str( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt(), 10, 0)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV119W_UPD_CNT", AV119W_UPD_CNT);
               }
               new b704_pc03_remove_crf_val(remoteHandle, context).execute( AV44P_STUDY_ID, ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id(), ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id(), ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
            }
            AV87W_IDX = (long)(AV87W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
         }
         AV120W_URL = AV86W_HTTPREQUEST.getBaseURL() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
         AV120W_URL = GXutil.strReplace( AV120W_URL, "servlet/", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
         AV120W_URL = AV120W_URL + "static/b701_wp01_crf_inp.jsp?" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
         AV120W_URL = AV120W_URL + AV98W_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
         AV120W_URL = AV120W_URL + AV100W_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
         AV120W_URL = AV120W_URL + AV134W_CRF_ID_EDA_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
         AV120W_URL = AV120W_URL + AV75W_CRF_INPUT_LEVEL ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
         AV120W_URL = AV120W_URL + AV119W_UPD_CNT ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
         httpContext.wjLoc = formatLink(AV120W_URL)  ;
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
   }

   public void e151J2( )
   {
      /* 'BTN_CHG_REKI' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV82W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      if ( AV93W_SEL_CNT == 0 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
      }
      if ( AV93W_SEL_CNT > 1 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "CRF", "1件", "", "", "", GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
      }
      if ( ! AV82W_ERRFLG )
      {
         GXt_char3 = AV96W_SESSION_KEY ;
         GXv_char4[0] = GXt_char3 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(1), AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53W_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
         AV96W_SESSION_KEY = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96W_SESSION_KEY", AV96W_SESSION_KEY);
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
         AV95W_SESSION.setValue(AV96W_SESSION_KEY, AV51SD_B792_SD00_HTML5_EXEC_INFO.toxml(false, true, "B792_SD00_HTML5_EXEC_INFO", "tablet-EDC_GXXEV3U3"));
         httpContext.ajax_rsp_assign_attri("", false, "AV96W_SESSION_KEY", AV96W_SESSION_KEY);
         GXt_char3 = AV96W_SESSION_KEY ;
         GXv_char4[0] = GXt_char3 ;
         new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53W_A_LOGIN_SDT", AV53W_A_LOGIN_SDT);
         AV96W_SESSION_KEY = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96W_SESSION_KEY", AV96W_SESSION_KEY);
         AV95W_SESSION.remove(AV96W_SESSION_KEY);
         httpContext.ajax_rsp_assign_attri("", false, "AV96W_SESSION_KEY", AV96W_SESSION_KEY);
         AV87W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
         while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
         {
            if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
            {
               AV116W_TBT02_STUDY_ID = AV44P_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "AV116W_TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( AV116W_TBT02_STUDY_ID, 10, 0)));
               AV117W_TBT02_SUBJECT_ID = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV117W_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV117W_TBT02_SUBJECT_ID, 6, 0)));
               AV115W_TBT02_CRF_ID = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV115W_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV115W_TBT02_CRF_ID, 4, 0)));
               AV136W_TBT02_CRF_EDA_NO = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV136W_TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV136W_TBT02_CRF_EDA_NO, 2, 0)));
               if (true) break;
            }
            AV87W_IDX = (long)(AV87W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
         }
         AV98W_STUDY_ID = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98W_STUDY_ID", AV98W_STUDY_ID);
         AV100W_SUBJECT_ID = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100W_SUBJECT_ID", AV100W_SUBJECT_ID);
         AV134W_CRF_ID_EDA_NO = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV134W_CRF_ID_EDA_NO", AV134W_CRF_ID_EDA_NO);
         AV75W_CRF_INPUT_LEVEL = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75W_CRF_INPUT_LEVEL", AV75W_CRF_INPUT_LEVEL);
         AV119W_UPD_CNT = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV119W_UPD_CNT", AV119W_UPD_CNT);
         /* Using cursor H001J7 */
         pr_default.execute(5, new Object[] {new Long(AV116W_TBT02_STUDY_ID), new Integer(AV117W_TBT02_SUBJECT_ID), new Short(AV115W_TBT02_CRF_ID), new Byte(AV136W_TBT02_CRF_EDA_NO)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A92TBT11_STUDY_ID = H001J7_A92TBT11_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
            A93TBT11_SUBJECT_ID = H001J7_A93TBT11_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
            A94TBT11_CRF_ID = H001J7_A94TBT11_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
            A936TBT11_CRF_EDA_NO = H001J7_A936TBT11_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
            A457TBT11_DEL_FLG = H001J7_A457TBT11_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457TBT11_DEL_FLG", A457TBT11_DEL_FLG);
            n457TBT11_DEL_FLG = H001J7_n457TBT11_DEL_FLG[0] ;
            A670TBT11_DM_ARRIVAL_DATETIME = H001J7_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A670TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n670TBT11_DM_ARRIVAL_DATETIME = H001J7_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
            A464TBT11_UPD_CNT = H001J7_A464TBT11_UPD_CNT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
            n464TBT11_UPD_CNT = H001J7_n464TBT11_UPD_CNT[0] ;
            A95TBT11_CRF_VERSION = H001J7_A95TBT11_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
            if ( (GXutil.strcmp("", AV98W_STUDY_ID)==0) )
            {
               AV98W_STUDY_ID = "STUDY_ID=" + GXutil.trim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV98W_STUDY_ID", AV98W_STUDY_ID);
            }
            else
            {
               AV98W_STUDY_ID = AV98W_STUDY_ID + "," + GXutil.trim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV98W_STUDY_ID", AV98W_STUDY_ID);
            }
            if ( (GXutil.strcmp("", AV100W_SUBJECT_ID)==0) )
            {
               AV100W_SUBJECT_ID = "&SUBJECT_ID=" + GXutil.trim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV100W_SUBJECT_ID", AV100W_SUBJECT_ID);
            }
            else
            {
               AV100W_SUBJECT_ID = AV100W_SUBJECT_ID + "," + GXutil.trim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV100W_SUBJECT_ID", AV100W_SUBJECT_ID);
            }
            AV135W_TMP_CRFID_EDANO = GXutil.trim( GXutil.str( A94TBT11_CRF_ID, 4, 0)) + "_" + GXutil.trim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135W_TMP_CRFID_EDANO", AV135W_TMP_CRFID_EDANO);
            if ( (GXutil.strcmp("", AV134W_CRF_ID_EDA_NO)==0) )
            {
               AV134W_CRF_ID_EDA_NO = "&CRFID=" + AV135W_TMP_CRFID_EDANO ;
               httpContext.ajax_rsp_assign_attri("", false, "AV134W_CRF_ID_EDA_NO", AV134W_CRF_ID_EDA_NO);
            }
            else
            {
               AV134W_CRF_ID_EDA_NO = AV134W_CRF_ID_EDA_NO + "," + AV135W_TMP_CRFID_EDANO ;
               httpContext.ajax_rsp_assign_attri("", false, "AV134W_CRF_ID_EDA_NO", AV134W_CRF_ID_EDA_NO);
            }
            if ( (GXutil.strcmp("", AV75W_CRF_INPUT_LEVEL)==0) )
            {
               AV75W_CRF_INPUT_LEVEL = "&CRF_INPUT_LEVEL=" + GXutil.trim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV75W_CRF_INPUT_LEVEL", AV75W_CRF_INPUT_LEVEL);
            }
            else
            {
               AV75W_CRF_INPUT_LEVEL = AV75W_CRF_INPUT_LEVEL + "," + GXutil.trim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV75W_CRF_INPUT_LEVEL", AV75W_CRF_INPUT_LEVEL);
            }
            if ( (GXutil.strcmp("", AV119W_UPD_CNT)==0) )
            {
               AV119W_UPD_CNT = "&CRF_UPD_CNT=" + GXutil.trim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV119W_UPD_CNT", AV119W_UPD_CNT);
            }
            else
            {
               AV119W_UPD_CNT = AV119W_UPD_CNT + "," + GXutil.trim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV119W_UPD_CNT", AV119W_UPD_CNT);
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
         if ( (GXutil.strcmp("", AV98W_STUDY_ID)==0) )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char4[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
         }
         else
         {
            AV120W_URL = AV86W_HTTPREQUEST.getBaseURL() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
            AV120W_URL = GXutil.strReplace( AV120W_URL, "servlet/", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
            AV120W_URL = AV120W_URL + "static/b701_wp01_crf_inp.jsp?" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
            AV120W_URL = AV120W_URL + AV98W_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
            AV120W_URL = AV120W_URL + AV100W_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
            AV120W_URL = AV120W_URL + AV134W_CRF_ID_EDA_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
            AV120W_URL = AV120W_URL + AV75W_CRF_INPUT_LEVEL ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
            AV120W_URL = AV120W_URL + AV119W_UPD_CNT ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120W_URL", AV120W_URL);
            httpContext.wjLoc = formatLink(AV120W_URL)  ;
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
      }
   }

   public void e161J2( )
   {
      /* 'BTN_SSAI_HYOJ' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV82W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      if ( AV93W_SEL_CNT == 0 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
      }
      if ( AV93W_SEL_CNT > 1 )
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "CRF", "1件", "", "", "", GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
         httpContext.GX_msglist.addItem(AV89W_MSG);
         AV82W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
      }
      if ( ! AV82W_ERRFLG )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b717_wp01_rekiinfo_crf"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV44P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV38H_SEL_TBT02_SUBJECT_ID,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV37H_SEL_TBT02_CRF_ID,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV137H_SEL_TBT02_CRF_EDA_NO,2,0))) ;
         httpContext.popup(formatLink("b717_wp01_rekiinfo_crf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {});
      }
   }

   public void e171J2( )
   {
      /* 'BTN_PDF_OUT' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV31H_DEVICE, "other") == 0 )
      {
         AV82W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         AV87W_IDX = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
         while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
         {
            if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
            {
               AV93W_SEL_CNT = (short)(AV93W_SEL_CNT+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV93W_SEL_CNT", GXutil.ltrim( GXutil.str( AV93W_SEL_CNT, 4, 0)));
               if (true) break;
            }
            AV87W_IDX = (long)(AV87W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
         }
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char4[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char4) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "b712_wp06_pdf_select"+GXutil.URLEncode(GXutil.rtrim("")) ;
            httpContext.popup(formatLink("b712_wp06_pdf_select") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"AV178H_SEL_PDF_CD"});
            httpContext.doAjaxRefresh();
         }
      }
      else
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00092", "PDF出力", "", "", "", "", GXv_char4) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char4[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
         httpContext.GX_msglist.addItem(AV89W_MSG);
      }
   }

   public void e181J2( )
   {
      /* 'BTN_PDF_OUT_EXEC' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "最新版PDF出力実行イベント開始") ;
      AV168SD_B720_SD02_CRF_INFO_C.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV169SD_B720_SD02_CRF_INFO_I = (SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem)new SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem(remoteHandle, context);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV168SD_B720_SD02_CRF_INFO_C.add(AV169SD_B720_SD02_CRF_INFO_I, 0);
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_int6[0] = AV176W_PDF_CNT ;
      GXv_int5[0] = AV79W_ERR_CD ;
      GXv_char4[0] = AV80W_ERR_MSG ;
      new b720_pc04_pdf_cnt_chk(remoteHandle, context).execute( (byte)(2), AV44P_STUDY_ID, AV168SD_B720_SD02_CRF_INFO_C, GXv_int6, GXv_int5, GXv_char4) ;
      b712_wp02_result_crf_impl.this.AV176W_PDF_CNT = (short)((short)(GXv_int6[0])) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int5[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV176W_PDF_CNT", GXutil.ltrim( GXutil.str( AV176W_PDF_CNT, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "PDF出力call実行") ;
         GXv_char4[0] = AV121W_ZIP_FILE_PATH ;
         GXv_char7[0] = AV122W_ZIP_FILENAME ;
         GXv_int8[0] = AV79W_ERR_CD ;
         GXv_char9[0] = AV80W_ERR_MSG ;
         new b720_pc01_pdf_output(remoteHandle, context).execute( AV44P_STUDY_ID, AV168SD_B720_SD02_CRF_INFO_C, GXv_char4, GXv_char7, GXv_int8, GXv_char9) ;
         b712_wp02_result_crf_impl.this.AV121W_ZIP_FILE_PATH = GXv_char4[0] ;
         b712_wp02_result_crf_impl.this.AV122W_ZIP_FILENAME = GXv_char7[0] ;
         b712_wp02_result_crf_impl.this.AV79W_ERR_CD = (byte)((byte)(GXv_int8[0])) ;
         b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV121W_ZIP_FILE_PATH", AV121W_ZIP_FILE_PATH);
         httpContext.ajax_rsp_assign_attri("", false, "AV122W_ZIP_FILENAME", AV122W_ZIP_FILENAME);
         httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
         new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "PDF出力call終了") ;
      }
      if ( AV79W_ERR_CD == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "PDFダウンロード開始") ;
         if ( ! (GXutil.strcmp("", AV122W_ZIP_FILENAME)==0) )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "aa811_pc01_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV121W_ZIP_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV122W_ZIP_FILENAME)) ;
            httpContext.wjLoc = formatLink("aa811_pc01_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "PDFダウンロード終了") ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "最新版PDF出力実行イベント終了") ;
   }

   public void e191J2( )
   {
      /* 'BTN_PDF_OUT_HIS_EXEC' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "履歴PDF出力実行イベント開始") ;
      AV168SD_B720_SD02_CRF_INFO_C.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV169SD_B720_SD02_CRF_INFO_I = (SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem)new SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem(remoteHandle, context);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_site_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Crf_name( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV169SD_B720_SD02_CRF_INFO_I.setgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Visit_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV169SD_B720_SD02_CRF_INFO_I", AV169SD_B720_SD02_CRF_INFO_I);
            AV168SD_B720_SD02_CRF_INFO_C.add(AV169SD_B720_SD02_CRF_INFO_I, 0);
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_int6[0] = AV176W_PDF_CNT ;
      GXv_int5[0] = AV79W_ERR_CD ;
      GXv_char9[0] = AV80W_ERR_MSG ;
      new b720_pc04_pdf_cnt_chk(remoteHandle, context).execute( (byte)(1), AV44P_STUDY_ID, AV168SD_B720_SD02_CRF_INFO_C, GXv_int6, GXv_int5, GXv_char9) ;
      b712_wp02_result_crf_impl.this.AV176W_PDF_CNT = (short)((short)(GXv_int6[0])) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int5[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV176W_PDF_CNT", GXutil.ltrim( GXutil.str( AV176W_PDF_CNT, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 0 )
      {
         if ( AV176W_PDF_CNT > 0 )
         {
            new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "PDF出力call実行") ;
            GXv_char9[0] = AV121W_ZIP_FILE_PATH ;
            GXv_char7[0] = AV122W_ZIP_FILENAME ;
            GXv_int8[0] = AV79W_ERR_CD ;
            GXv_char4[0] = AV80W_ERR_MSG ;
            new b720_pc11_pdf_output_his(remoteHandle, context).execute( AV44P_STUDY_ID, AV168SD_B720_SD02_CRF_INFO_C, GXv_char9, GXv_char7, GXv_int8, GXv_char4) ;
            b712_wp02_result_crf_impl.this.AV121W_ZIP_FILE_PATH = GXv_char9[0] ;
            b712_wp02_result_crf_impl.this.AV122W_ZIP_FILENAME = GXv_char7[0] ;
            b712_wp02_result_crf_impl.this.AV79W_ERR_CD = (byte)((byte)(GXv_int8[0])) ;
            b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV121W_ZIP_FILE_PATH", AV121W_ZIP_FILE_PATH);
            httpContext.ajax_rsp_assign_attri("", false, "AV122W_ZIP_FILENAME", AV122W_ZIP_FILENAME);
            httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
            new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "PDF出力call終了") ;
         }
         else
         {
            AV79W_ERR_CD = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
            GXt_char3 = AV80W_ERR_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00062", "選択したCRFにはデータ固定済のCRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV80W_ERR_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
         }
      }
      if ( AV79W_ERR_CD == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "PDFダウンロード開始") ;
         if ( ! (GXutil.strcmp("", AV122W_ZIP_FILENAME)==0) )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "aa811_pc01_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV121W_ZIP_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV122W_ZIP_FILENAME)) ;
            httpContext.wjLoc = formatLink("aa811_pc01_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "PDFダウンロード終了") ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "INFO", "履歴PDF出力実行イベント終了") ;
   }

   public void e201J2( )
   {
      /* 'BTN_CRF_TEISYUTU' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00086", "DM到着済のCRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV67W_CHK_ALLOFF_INPUT_END_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00090", "", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV82W_ERRFLG )
         {
            AV87W_IDX = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
            while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
            {
               if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
               {
                  GXv_char9[0] = AV89W_MSG ;
                  GXv_char7[0] = AV92W_RTN_CD ;
                  new b712_pc02_crf_present_chk(remoteHandle, context).execute( AV44P_STUDY_ID, ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id(), ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id(), ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no(), ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm(), AV42P_AUTH_CD, GXv_char9, GXv_char7) ;
                  b712_wp02_result_crf_impl.this.AV89W_MSG = GXv_char9[0] ;
                  b712_wp02_result_crf_impl.this.AV92W_RTN_CD = GXv_char7[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, "AV42P_AUTH_CD", AV42P_AUTH_CD);
                  httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
                  httpContext.ajax_rsp_assign_attri("", false, "AV92W_RTN_CD", AV92W_RTN_CD);
                  if ( GXutil.strcmp(AV92W_RTN_CD, "0") != 0 )
                  {
                     AV82W_ERRFLG = true ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
                     httpContext.GX_msglist.addItem(AV89W_MSG);
                  }
               }
               AV87W_IDX = (long)(AV87W_IDX+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
            }
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            AV144W_GRID_SEL_CNT = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144W_GRID_SEL_CNT", GXutil.ltrim( GXutil.str( AV144W_GRID_SEL_CNT, 8, 0)));
            AV204GXV10 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV204GXV10", GXutil.ltrim( GXutil.str( AV204GXV10, 8, 0)));
            while ( AV204GXV10 <= AV10D_B712_SD06_RESULT_CRF.size() )
            {
               AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV204GXV10));
               if ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
               {
                  AV144W_GRID_SEL_CNT = (int)(AV144W_GRID_SEL_CNT+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV144W_GRID_SEL_CNT", GXutil.ltrim( GXutil.str( AV144W_GRID_SEL_CNT, 8, 0)));
               }
               AV204GXV10 = (int)(AV204GXV10+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV204GXV10", GXutil.ltrim( GXutil.str( AV204GXV10, 8, 0)));
            }
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "b712_wp05_crf_conf"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV44P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV144W_GRID_SEL_CNT,8,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
            httpContext.popup(formatLink("b712_wp05_crf_conf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"AV143H_B712_WP05_OK","AV145H_B712_WP05_SIGNATURE_CHK","AV146H_B712_WP05_SIGNATURE_USER_ID"});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S172( )
   {
      /* 'SUB_CRF_TEISYUTU_EXEC' Routine */
      AV62W_B714_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV63W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV62W_B714_SD1_CRF_INFO.add(AV63W_B714_SD1_CRF_INFO_Item, 0);
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_int5[0] = AV79W_ERR_CD ;
      GXv_char9[0] = AV80W_ERR_MSG ;
      new b714_pc04_dm_arrival_crf(remoteHandle, context).execute( AV44P_STUDY_ID, AV42P_AUTH_CD, AV62W_B714_SD1_CRF_INFO, AV145H_B712_WP05_SIGNATURE_CHK, AV146H_B712_WP05_SIGNATURE_USER_ID, GXv_int5, GXv_char9) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int5[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV42P_AUTH_CD", AV42P_AUTH_CD);
      httpContext.ajax_rsp_assign_attri("", false, "AV145H_B712_WP05_SIGNATURE_CHK", GXutil.str( AV145H_B712_WP05_SIGNATURE_CHK, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV146H_B712_WP05_SIGNATURE_USER_ID", AV146H_B712_WP05_SIGNATURE_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = dynavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
   }

   public void e211J2( )
   {
      /* 'BTN_DM_KAIJO' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV68W_CHK_ALLON_DM_ARRIVAL_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00086", "DM未到着のCRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( GXutil.strcmp(AV34H_INPUT_END_FLG_SV, "1") == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00089", "", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00029", "選択したCRF", "DM到着解除", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)), "　", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            GXt_char3 = AV55W_A821_JS ;
            GXv_char9[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_DM_KAIJO_EXEC", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            AV55W_A821_JS = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55W_A821_JS", AV55W_A821_JS);
         }
      }
   }

   public void e221J2( )
   {
      /* 'BTN_DM_KAIJO_EXEC' Routine */
      AV62W_B714_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV63W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV62W_B714_SD1_CRF_INFO.add(AV63W_B714_SD1_CRF_INFO_Item, 0);
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_int5[0] = AV79W_ERR_CD ;
      GXv_char9[0] = AV80W_ERR_MSG ;
      new b715_pc01_set_auth(remoteHandle, context).execute( AV44P_STUDY_ID, AV62W_B714_SD1_CRF_INFO, GXv_int5, GXv_char9) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int5[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = dynavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
   }

   public void e231J2( )
   {
      /* 'BTN_DATA_KTEI' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV69W_CHK_INPUT_END_KONZAI_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00087", "", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            if ( GXutil.strcmp(AV34H_INPUT_END_FLG_SV, "1") == 0 )
            {
               GXt_char3 = AV89W_MSG ;
               GXv_char9[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AG00029", "選択したCRF", "固定解除", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)), "　", "", GXv_char9) ;
               b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
               AV89W_MSG = GXt_char3 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            }
            else
            {
               if ( AV184W_SEL_CNT_DM_ARRIVAL_OFF > 0 )
               {
                  AV185W_SEL_CNT_DM_ARRIVAL_ON = (short)(AV93W_SEL_CNT-AV184W_SEL_CNT_DM_ARRIVAL_OFF) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV185W_SEL_CNT_DM_ARRIVAL_ON", GXutil.ltrim( GXutil.str( AV185W_SEL_CNT_DM_ARRIVAL_ON, 4, 0)));
                  if ( AV185W_SEL_CNT_DM_ARRIVAL_ON > 0 )
                  {
                     AV89W_MSG = "選択したCRFを固定します。\\nDM未到着のCRFについては、固定は行われません。\\n（データ固定対象件数：" + GXutil.trim( GXutil.str( AV185W_SEL_CNT_DM_ARRIVAL_ON, 4, 0)) + "件）\\n（選択CRF件数：" + GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)) + "件）" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
                  }
                  else
                  {
                     AV89W_MSG = "選択したCRFの中に固定対象が存在しないため、\\nデータ固定は行われません。\\n（データ固定対象件数：" + GXutil.trim( GXutil.str( AV185W_SEL_CNT_DM_ARRIVAL_ON, 4, 0)) + "件）\\n（選択CRF件数：" + GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)) + "件）" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
                  }
               }
               else
               {
                  GXt_char3 = AV89W_MSG ;
                  GXv_char9[0] = GXt_char3 ;
                  new a805_pc02_msg_get(remoteHandle, context).execute( "AG00029", "選択したCRF", "固定", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)), "　", "", GXv_char9) ;
                  b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
                  AV89W_MSG = GXt_char3 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
               }
            }
            GXt_char3 = AV55W_A821_JS ;
            GXv_char9[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_DATA_KTEI_EXEC", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            AV55W_A821_JS = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55W_A821_JS", AV55W_A821_JS);
         }
      }
   }

   public void e241J2( )
   {
      /* 'BTN_DATA_KTEI_EXEC' Routine */
      AV62W_B714_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV63W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
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
               httpContext.ajax_rsp_assign_attri("", false, "AV88W_INPUT_END_FLG_SET", GXutil.str( AV88W_INPUT_END_FLG_SET, 1, 0));
            }
            else
            {
               AV88W_INPUT_END_FLG_SET = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV88W_INPUT_END_FLG_SET", GXutil.str( AV88W_INPUT_END_FLG_SET, 1, 0));
            }
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_int5[0] = AV79W_ERR_CD ;
      GXv_char9[0] = AV80W_ERR_MSG ;
      new b714_pc03_input_end_crf(remoteHandle, context).execute( AV88W_INPUT_END_FLG_SET, AV44P_STUDY_ID, AV62W_B714_SD1_CRF_INFO, GXv_int5, GXv_char9) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int5[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88W_INPUT_END_FLG_SET", GXutil.str( AV88W_INPUT_END_FLG_SET, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = dynavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
   }

   public void e251J2( )
   {
      /* 'BTN_CRF_DEL' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( AV93W_SEL_CNT > 1 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00082", "CRF", "1件", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( GXutil.strcmp(AV34H_INPUT_END_FLG_SV, "1") == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00088", "", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00027", "CRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            GXt_char3 = AV55W_A821_JS ;
            GXv_char9[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_CRF_DEL_EXEC", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            AV55W_A821_JS = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55W_A821_JS", AV55W_A821_JS);
         }
      }
   }

   public void e261J2( )
   {
      /* 'BTN_CRF_DEL_EXEC' Routine */
      GXv_int5[0] = AV79W_ERR_CD ;
      GXv_char9[0] = AV80W_ERR_MSG ;
      new b714_pc02_delete_crf(remoteHandle, context).execute( AV44P_STUDY_ID, AV38H_SEL_TBT02_SUBJECT_ID, AV37H_SEL_TBT02_CRF_ID, AV137H_SEL_TBT02_CRF_EDA_NO, GXv_int5, GXv_char9) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int5[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV38H_SEL_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV38H_SEL_TBT02_SUBJECT_ID, 6, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV37H_SEL_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV37H_SEL_TBT02_CRF_ID, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV137H_SEL_TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV137H_SEL_TBT02_CRF_EDA_NO, 2, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = dynavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
   }

   public void e271J2( )
   {
      /* 'BTN_CSV_OUT' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV31H_DEVICE, "other") == 0 )
      {
         AV82W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "b712_wp07_csv_select"+GXutil.URLEncode(GXutil.rtrim("")) ;
            httpContext.popup(formatLink("b712_wp07_csv_select") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"AV182H_SEL_CSV_CD"});
            httpContext.doAjaxRefresh();
         }
      }
      else
      {
         GXt_char3 = AV89W_MSG ;
         GXv_char9[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00092", "CSV出力", "", "", "", "", GXv_char9) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
         httpContext.GX_msglist.addItem(AV89W_MSG);
      }
   }

   public void e281J2( )
   {
      /* 'BTN_CSV_OUT_EXEC_ALL' Routine */
      AV64W_B716_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV65W_B716_SD1_CRF_INFO_Item = (SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem)new SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem(remoteHandle, context);
            AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
            AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
            AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
            AV64W_B716_SD1_CRF_INFO.add(AV65W_B716_SD1_CRF_INFO_Item, 0);
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_char9[0] = AV121W_ZIP_FILE_PATH ;
      GXv_char7[0] = AV122W_ZIP_FILENAME ;
      GXv_int8[0] = AV79W_ERR_CD ;
      GXv_char4[0] = AV80W_ERR_MSG ;
      new b716_pc01_csv_output(remoteHandle, context).execute( AV44P_STUDY_ID, AV64W_B716_SD1_CRF_INFO, GXv_char9, GXv_char7, GXv_int8, GXv_char4) ;
      b712_wp02_result_crf_impl.this.AV121W_ZIP_FILE_PATH = GXv_char9[0] ;
      b712_wp02_result_crf_impl.this.AV122W_ZIP_FILENAME = GXv_char7[0] ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = (byte)((byte)(GXv_int8[0])) ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV121W_ZIP_FILE_PATH", AV121W_ZIP_FILE_PATH);
      httpContext.ajax_rsp_assign_attri("", false, "AV122W_ZIP_FILENAME", AV122W_ZIP_FILENAME);
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 0 )
      {
         if ( ! (GXutil.strcmp("", AV122W_ZIP_FILENAME)==0) )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "aa811_pc01_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV121W_ZIP_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV122W_ZIP_FILENAME)) ;
            httpContext.wjLoc = formatLink("aa811_pc01_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
   }

   public void e291J2( )
   {
      /* 'BTN_CSV_OUT_EXEC_DM' Routine */
      AV64W_B716_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            if ( GXutil.strcmp(((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg(), "1") == 0 )
            {
               AV65W_B716_SD1_CRF_INFO_Item = (SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem)new SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem(remoteHandle, context);
               AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
               AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
               AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
               AV64W_B716_SD1_CRF_INFO.add(AV65W_B716_SD1_CRF_INFO_Item, 0);
            }
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_char9[0] = AV121W_ZIP_FILE_PATH ;
      GXv_char7[0] = AV122W_ZIP_FILENAME ;
      GXv_int8[0] = AV79W_ERR_CD ;
      GXv_char4[0] = AV80W_ERR_MSG ;
      new b716_pc01_csv_output(remoteHandle, context).execute( AV44P_STUDY_ID, AV64W_B716_SD1_CRF_INFO, GXv_char9, GXv_char7, GXv_int8, GXv_char4) ;
      b712_wp02_result_crf_impl.this.AV121W_ZIP_FILE_PATH = GXv_char9[0] ;
      b712_wp02_result_crf_impl.this.AV122W_ZIP_FILENAME = GXv_char7[0] ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = (byte)((byte)(GXv_int8[0])) ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV121W_ZIP_FILE_PATH", AV121W_ZIP_FILE_PATH);
      httpContext.ajax_rsp_assign_attri("", false, "AV122W_ZIP_FILENAME", AV122W_ZIP_FILENAME);
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 0 )
      {
         if ( ! (GXutil.strcmp("", AV122W_ZIP_FILENAME)==0) )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "aa811_pc01_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV121W_ZIP_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV122W_ZIP_FILENAME)) ;
            httpContext.wjLoc = formatLink("aa811_pc01_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
   }

   public void e301J2( )
   {
      /* 'BTN_CSV_OUT_EXEC_SIGN' Routine */
      AV64W_B716_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            if ( GXutil.strcmp(((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg(), "1") == 0 )
            {
               AV65W_B716_SD1_CRF_INFO_Item = (SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem)new SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem(remoteHandle, context);
               AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
               AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
               AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
               AV64W_B716_SD1_CRF_INFO.add(AV65W_B716_SD1_CRF_INFO_Item, 0);
            }
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_char9[0] = AV121W_ZIP_FILE_PATH ;
      GXv_char7[0] = AV122W_ZIP_FILENAME ;
      GXv_int8[0] = AV79W_ERR_CD ;
      GXv_char4[0] = AV80W_ERR_MSG ;
      new b716_pc01_csv_output(remoteHandle, context).execute( AV44P_STUDY_ID, AV64W_B716_SD1_CRF_INFO, GXv_char9, GXv_char7, GXv_int8, GXv_char4) ;
      b712_wp02_result_crf_impl.this.AV121W_ZIP_FILE_PATH = GXv_char9[0] ;
      b712_wp02_result_crf_impl.this.AV122W_ZIP_FILENAME = GXv_char7[0] ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = (byte)((byte)(GXv_int8[0])) ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV121W_ZIP_FILE_PATH", AV121W_ZIP_FILE_PATH);
      httpContext.ajax_rsp_assign_attri("", false, "AV122W_ZIP_FILENAME", AV122W_ZIP_FILENAME);
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 0 )
      {
         if ( ! (GXutil.strcmp("", AV122W_ZIP_FILENAME)==0) )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "aa811_pc01_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV121W_ZIP_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV122W_ZIP_FILENAME)) ;
            httpContext.wjLoc = formatLink("aa811_pc01_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
   }

   public void e311J2( )
   {
      /* 'BTN_CSV_OUT_EXEC_KTEI' Routine */
      AV64W_B716_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            if ( GXutil.strcmp(((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg(), "1") == 0 )
            {
               AV65W_B716_SD1_CRF_INFO_Item = (SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem)new SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem(remoteHandle, context);
               AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
               AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
               AV65W_B716_SD1_CRF_INFO_Item.setgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65W_B716_SD1_CRF_INFO_Item", AV65W_B716_SD1_CRF_INFO_Item);
               AV64W_B716_SD1_CRF_INFO.add(AV65W_B716_SD1_CRF_INFO_Item, 0);
            }
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_char9[0] = AV121W_ZIP_FILE_PATH ;
      GXv_char7[0] = AV122W_ZIP_FILENAME ;
      GXv_int8[0] = AV79W_ERR_CD ;
      GXv_char4[0] = AV80W_ERR_MSG ;
      new b716_pc01_csv_output(remoteHandle, context).execute( AV44P_STUDY_ID, AV64W_B716_SD1_CRF_INFO, GXv_char9, GXv_char7, GXv_int8, GXv_char4) ;
      b712_wp02_result_crf_impl.this.AV121W_ZIP_FILE_PATH = GXv_char9[0] ;
      b712_wp02_result_crf_impl.this.AV122W_ZIP_FILENAME = GXv_char7[0] ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = (byte)((byte)(GXv_int8[0])) ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV121W_ZIP_FILE_PATH", AV121W_ZIP_FILE_PATH);
      httpContext.ajax_rsp_assign_attri("", false, "AV122W_ZIP_FILENAME", AV122W_ZIP_FILENAME);
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 0 )
      {
         if ( ! (GXutil.strcmp("", AV122W_ZIP_FILENAME)==0) )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "aa811_pc01_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV121W_ZIP_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV122W_ZIP_FILENAME)) ;
            httpContext.wjLoc = formatLink("aa811_pc01_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
   }

   public void e321J2( )
   {
      /* D_grd_all_sel_flg_Click Routine */
      AV205GXV11 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV205GXV11", GXutil.ltrim( GXutil.str( AV205GXV11, 8, 0)));
      while ( AV205GXV11 <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV205GXV11));
         AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( AV12D_GRD_ALL_SEL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
         AV205GXV11 = (int)(AV205GXV11+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV205GXV11", GXutil.ltrim( GXutil.str( AV205GXV11, 8, 0)));
      }
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void e331J2( )
   {
      /* D_grd_all_sign_ok_sel_flg_Click Routine */
      AV206GXV12 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV206GXV12", GXutil.ltrim( GXutil.str( AV206GXV12, 8, 0)));
      while ( AV206GXV12 <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV206GXV12));
         if ( ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg(), "1") == 0 ) && ( ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg(), "0") == 0 ) || (GXutil.strcmp("", AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg())==0) ) && ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg(), "0") == 0 ) )
         {
            AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( AV183D_GRD_ALL_SIGN_OK_SEL_FLG );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
         }
         AV206GXV12 = (int)(AV206GXV12+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV206GXV12", GXutil.ltrim( GXutil.str( AV206GXV12, 8, 0)));
      }
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void e341J2( )
   {
      /* D_sort_Click Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void e541J2( )
   {
      /* 'BTN_REPEAT' Routine */
      AV38H_SEL_TBT02_SUBJECT_ID = AV22D_GRD_SUBJECT_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38H_SEL_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV38H_SEL_TBT02_SUBJECT_ID, 6, 0)));
      AV37H_SEL_TBT02_CRF_ID = AV14D_GRD_CRF_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37H_SEL_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV37H_SEL_TBT02_CRF_ID, 4, 0)));
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b714_wp01_crf_repeat"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV44P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV38H_SEL_TBT02_SUBJECT_ID,6,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV37H_SEL_TBT02_CRF_ID,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.popup(formatLink("b714_wp01_crf_repeat") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"AV36H_POPUP_ERR_CD"});
      httpContext.doAjaxRefresh();
   }

   public void e551J2( )
   {
      /* 'BTN_REPEAT_DEL' Routine */
      AV38H_SEL_TBT02_SUBJECT_ID = AV22D_GRD_SUBJECT_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38H_SEL_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV38H_SEL_TBT02_SUBJECT_ID, 6, 0)));
      AV37H_SEL_TBT02_CRF_ID = AV14D_GRD_CRF_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37H_SEL_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV37H_SEL_TBT02_CRF_ID, 4, 0)));
      AV137H_SEL_TBT02_CRF_EDA_NO = AV124D_GRD_CRF_EDA_NO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137H_SEL_TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV137H_SEL_TBT02_CRF_EDA_NO, 2, 0)));
      AV138H_MSG_REP = AV15D_GRD_CRF_SNM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138H_MSG_REP", AV138H_MSG_REP);
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         /* Using cursor H001J8 */
         pr_default.execute(6, new Object[] {new Long(AV44P_STUDY_ID), new Integer(AV38H_SEL_TBT02_SUBJECT_ID), new Short(AV37H_SEL_TBT02_CRF_ID), new Byte(AV137H_SEL_TBT02_CRF_EDA_NO)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A935TBT02_CRF_EDA_NO = H001J8_A935TBT02_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
            A91TBT02_CRF_ID = H001J8_A91TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
            A90TBT02_SUBJECT_ID = H001J8_A90TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
            A89TBT02_STUDY_ID = H001J8_A89TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
            A656TBT02_DM_ARRIVAL_DATETIME = H001J8_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A656TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            n656TBT02_DM_ARRIVAL_DATETIME = H001J8_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
            if ( ! GXutil.nullDate().equals(A656TBT02_DM_ARRIVAL_DATETIME) )
            {
               AV82W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
               GXt_char3 = AV89W_MSG ;
               GXv_char9[0] = GXt_char3 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "対象のCRF:"+AV138H_MSG_REP, "DM提出済みの", "削除", "", "", GXv_char9) ;
               b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
               AV89W_MSG = GXt_char3 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
               httpContext.GX_msglist.addItem(AV89W_MSG);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00027", AV138H_MSG_REP, "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138H_MSG_REP", AV138H_MSG_REP);
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            GXt_char3 = AV55W_A821_JS ;
            GXv_char9[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_CRF_DEL_EXEC", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            AV55W_A821_JS = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55W_A821_JS", AV55W_A821_JS);
         }
      }
   }

   public void e351J2( )
   {
      /* 'BTN_SIGN' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      if ( ! AV70W_CHK_STUDY_UPD_FLG )
      {
         AV82W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         if ( AV93W_SEL_CNT == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV68W_CHK_ALLON_DM_ARRIVAL_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00086", "DM未到着のCRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV179W_CHK_SIGN_OFF_FLG )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00086", "署名済のCRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( GXutil.strcmp(AV34H_INPUT_END_FLG_SV, "1") == 0 )
         {
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00086", "データ固定済のCRF", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
            AV82W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
         }
         if ( ! AV82W_ERRFLG )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AG00029", "署名", "実行", GXutil.trim( GXutil.str( AV93W_SEL_CNT, 4, 0)), "　", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            GXt_char3 = AV55W_A821_JS ;
            GXv_char9[0] = GXt_char3 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV89W_MSG, "", "BTN_SIGN_EXEC", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            AV55W_A821_JS = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55W_A821_JS", AV55W_A821_JS);
         }
      }
   }

   public void e361J2( )
   {
      /* 'BTN_SIGN_EXEC' Routine */
      AV62W_B714_SD1_CRF_INFO.clear();
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV63W_B714_SD1_CRF_INFO_Item = (SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem)new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_crf_eda_no( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_subject_id( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV63W_B714_SD1_CRF_INFO_Item.setgxTv_SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem_Tbt02_upd_cnt( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63W_B714_SD1_CRF_INFO_Item", AV63W_B714_SD1_CRF_INFO_Item);
            AV62W_B714_SD1_CRF_INFO.add(AV63W_B714_SD1_CRF_INFO_Item, 0);
            AV34H_INPUT_END_FLG_SV = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34H_INPUT_END_FLG_SV", AV34H_INPUT_END_FLG_SV);
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      GXv_int5[0] = AV79W_ERR_CD ;
      GXv_char9[0] = AV80W_ERR_MSG ;
      new b714_pc06_sign_crf(remoteHandle, context).execute( AV44P_STUDY_ID, AV62W_B714_SD1_CRF_INFO, AV42P_AUTH_CD, GXv_int5, GXv_char9) ;
      b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int5[0] ;
      b712_wp02_result_crf_impl.this.AV80W_ERR_MSG = GXv_char9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44P_STUDY_ID", GXutil.ltrim( GXutil.str( AV44P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV42P_AUTH_CD", AV42P_AUTH_CD);
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80W_ERR_MSG", AV80W_ERR_MSG);
      if ( AV79W_ERR_CD == 1 )
      {
         httpContext.GX_msglist.addItem(AV80W_ERR_MSG);
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GX_FocusControl = dynavD_sort.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
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
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
   }

   public void S292( )
   {
      /* 'SUB_SRCH' Routine */
      AV82W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82W_ERRFLG", AV82W_ERRFLG);
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      AV90W_P_KANI_KENSAKU = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90W_P_KANI_KENSAKU", AV90W_P_KANI_KENSAKU);
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV61W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
      {
         AV90W_P_KANI_KENSAKU = (String)AV61W_B712_SD05_SEL4.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+(int)(AV87W_IDX)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90W_P_KANI_KENSAKU", AV90W_P_KANI_KENSAKU);
         if (true) break;
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
      AV102W_SUBJECT_ID_EDT = AV41H_SUBJECT_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102W_SUBJECT_ID_EDT", AV102W_SUBJECT_ID_EDT);
      AV57W_B712_SD05_SEL_W.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().clear();
      AV79W_ERR_CD = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
      AV101W_SUBJECT_ID_CNT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101W_SUBJECT_ID_CNT", GXutil.ltrim( GXutil.str( AV101W_SUBJECT_ID_CNT, 2, 0)));
      while ( AV79W_ERR_CD == 0 )
      {
         AV101W_SUBJECT_ID_CNT = (byte)(AV101W_SUBJECT_ID_CNT+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101W_SUBJECT_ID_CNT", GXutil.ltrim( GXutil.str( AV101W_SUBJECT_ID_CNT, 2, 0)));
         GXv_char9[0] = AV103W_SUBJECT_ID_GET ;
         GXv_int5[0] = AV79W_ERR_CD ;
         new a822_pc01_str_token(remoteHandle, context).execute( AV102W_SUBJECT_ID_EDT, ",", AV101W_SUBJECT_ID_CNT, GXv_char9, GXv_int5) ;
         b712_wp02_result_crf_impl.this.AV103W_SUBJECT_ID_GET = GXv_char9[0] ;
         b712_wp02_result_crf_impl.this.AV79W_ERR_CD = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102W_SUBJECT_ID_EDT", AV102W_SUBJECT_ID_EDT);
         httpContext.ajax_rsp_assign_attri("", false, "AV101W_SUBJECT_ID_CNT", GXutil.ltrim( GXutil.str( AV101W_SUBJECT_ID_CNT, 2, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV103W_SUBJECT_ID_GET", AV103W_SUBJECT_ID_GET);
         httpContext.ajax_rsp_assign_attri("", false, "AV79W_ERR_CD", GXutil.str( AV79W_ERR_CD, 1, 0));
         if ( AV79W_ERR_CD != 9 )
         {
            AV57W_B712_SD05_SEL_W.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().add(AV103W_SUBJECT_ID_GET, 0);
         }
      }
      if ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "1") == 0 )
      {
         AV87W_IDX = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
         AV83W_FLG = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
         AV84W_FLG2[1-1] = "0" ;
         AV84W_FLG2[2-1] = "0" ;
         AV84W_FLG2[3-1] = "0" ;
         AV208GXV13 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV208GXV13", GXutil.ltrim( GXutil.str( AV208GXV13, 8, 0)));
         while ( AV208GXV13 <= AV49SD_B712_SD08_ICON_INFO.size() )
         {
            AV50SD_B712_SD08_ICON_INFO_I = (SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)((SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)AV49SD_B712_SD08_ICON_INFO.elementAt(-1+AV208GXV13));
            AV87W_IDX = (long)(AV87W_IDX+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
            if ( GXutil.strcmp(AV50SD_B712_SD08_ICON_INFO_I.getgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd(), AV42P_AUTH_CD) == 0 )
            {
               AV209GXV14 = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV209GXV14", GXutil.ltrim( GXutil.str( AV209GXV14, 8, 0)));
               while ( AV209GXV14 <= AV47SD_B712_SD07_INPUT_DISP.size() )
               {
                  AV48SD_B712_SD07_INPUT_DISP_I = (SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV47SD_B712_SD07_INPUT_DISP.elementAt(-1+AV209GXV14));
                  if ( AV87W_IDX == 1 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
                  }
                  else if ( AV87W_IDX == 2 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
                  }
                  else if ( AV87W_IDX == 3 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
                  }
                  else if ( AV87W_IDX == 4 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
                  }
                  else if ( AV87W_IDX == 5 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
                  }
                  else if ( AV87W_IDX == 6 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
                  }
                  else if ( AV87W_IDX == 7 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
                  }
                  else if ( AV87W_IDX == 8 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
                  }
                  else if ( AV87W_IDX == 9 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
                  }
                  else if ( AV87W_IDX == 10 )
                  {
                     AV83W_FLG = GXutil.trim( GXutil.str( AV48SD_B712_SD07_INPUT_DISP_I.getgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible(), 4, 0)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV83W_FLG", AV83W_FLG);
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
                  AV209GXV14 = (int)(AV209GXV14+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV209GXV14", GXutil.ltrim( GXutil.str( AV209GXV14, 8, 0)));
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "0") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV94W_SEL_PTN", GXutil.ltrim( GXutil.str( AV94W_SEL_PTN, 4, 0)));
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "0") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV94W_SEL_PTN", GXutil.ltrim( GXutil.str( AV94W_SEL_PTN, 4, 0)));
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "1") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(3) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV94W_SEL_PTN", GXutil.ltrim( GXutil.str( AV94W_SEL_PTN, 4, 0)));
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "1") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(4) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV94W_SEL_PTN", GXutil.ltrim( GXutil.str( AV94W_SEL_PTN, 4, 0)));
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "0") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(5) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV94W_SEL_PTN", GXutil.ltrim( GXutil.str( AV94W_SEL_PTN, 4, 0)));
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "1") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "1") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(6) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV94W_SEL_PTN", GXutil.ltrim( GXutil.str( AV94W_SEL_PTN, 4, 0)));
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "1") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(7) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV94W_SEL_PTN", GXutil.ltrim( GXutil.str( AV94W_SEL_PTN, 4, 0)));
               }
               if ( ( GXutil.strcmp(AV84W_FLG2[1-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[2-1], "0") == 0 ) && ( GXutil.strcmp(AV84W_FLG2[3-1], "0") == 0 ) )
               {
                  AV94W_SEL_PTN = (short)(8) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV94W_SEL_PTN", GXutil.ltrim( GXutil.str( AV94W_SEL_PTN, 4, 0)));
               }
               if (true) break;
            }
            AV208GXV13 = (int)(AV208GXV13+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV208GXV13", GXutil.ltrim( GXutil.str( AV208GXV13, 8, 0)));
         }
      }
      AV10D_B712_SD06_RESULT_CRF.clear();
      AV160W_SD_B712_SD11_C.clear();
      AV160W_SD_B712_SD11_C.fromJSonString(AV95W_SESSION.getValue(AV162W_SESSION_KEY_SUBJECT_CRF));
      AV210GXV15 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV210GXV15", GXutil.ltrim( GXutil.str( AV210GXV15, 8, 0)));
      while ( AV210GXV15 <= AV59W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
      {
         AV164W_GET_SUBJECT_ID_VC = (String)AV59W_B712_SD05_SEL2.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+AV210GXV15) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV164W_GET_SUBJECT_ID_VC", AV164W_GET_SUBJECT_ID_VC);
         if ( ! (GXutil.strcmp("", AV164W_GET_SUBJECT_ID_VC)==0) )
         {
            /* Execute user subroutine: S302 */
            S302 ();
            if (returnInSub) return;
         }
         AV210GXV15 = (int)(AV210GXV15+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV210GXV15", GXutil.ltrim( GXutil.str( AV210GXV15, 8, 0)));
      }
      AV40H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40H_SRCH_FLG", AV40H_SRCH_FLG);
   }

   public void S302( )
   {
      /* 'SUB_TBT02_GET' Routine */
      AV163W_GET_SUBJECT_ID = (int)(GXutil.lval( GXutil.trim( AV164W_GET_SUBJECT_ID_VC))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV163W_GET_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV163W_GET_SUBJECT_ID, 6, 0)));
      AV165W_GET_CRF_ID_C.clear();
      AV211GXV16 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV211GXV16", GXutil.ltrim( GXutil.str( AV211GXV16, 8, 0)));
      while ( AV211GXV16 <= AV160W_SD_B712_SD11_C.size() )
      {
         AV161W_SD_B712_SD11_I = (SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)((SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem)AV160W_SD_B712_SD11_C.elementAt(-1+AV211GXV16));
         if ( AV161W_SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_subject_id() == AV163W_GET_SUBJECT_ID )
         {
            AV158W_SD_B712_SD03_C.clear();
            AV158W_SD_B712_SD03_C.fromJSonString(AV161W_SD_B712_SD11_I.getgxTv_SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem_B712_sd03_json());
            AV212GXV17 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV212GXV17", GXutil.ltrim( GXutil.str( AV212GXV17, 8, 0)));
            while ( AV212GXV17 <= AV158W_SD_B712_SD03_C.size() )
            {
               AV159W_SD_B712_SD03_I = (SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)((SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem)AV158W_SD_B712_SD03_C.elementAt(-1+AV212GXV17));
               if ( AV159W_SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg() )
               {
                  AV165W_GET_CRF_ID_C.add((short)(AV159W_SD_B712_SD03_I.getgxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id()), 0);
               }
               AV212GXV17 = (int)(AV212GXV17+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV212GXV17", GXutil.ltrim( GXutil.str( AV212GXV17, 8, 0)));
            }
            if (true) break;
         }
         AV211GXV16 = (int)(AV211GXV16+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV211GXV16", GXutil.ltrim( GXutil.str( AV211GXV16, 8, 0)));
      }
      if ( AV165W_GET_CRF_ID_C.size() == 0 )
      {
         AV213GXV18 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV213GXV18", GXutil.ltrim( GXutil.str( AV213GXV18, 8, 0)));
         while ( AV213GXV18 <= AV60W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size() )
         {
            AV166W_GET_CRF_ID_VC = (String)AV60W_B712_SD05_SEL3.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().elementAt(-1+AV213GXV18) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV166W_GET_CRF_ID_VC", AV166W_GET_CRF_ID_VC);
            AV167W_GET_CRF_ID = (short)(GXutil.lval( GXutil.trim( AV166W_GET_CRF_ID_VC))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV167W_GET_CRF_ID", GXutil.ltrim( GXutil.str( AV167W_GET_CRF_ID, 4, 0)));
            AV165W_GET_CRF_ID_C.add((short)(AV167W_GET_CRF_ID), 0);
            AV213GXV18 = (int)(AV213GXV18+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV213GXV18", GXutil.ltrim( GXutil.str( AV213GXV18, 8, 0)));
         }
      }
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           new Short(A91TBT02_CRF_ID) ,
                                           AV165W_GET_CRF_ID_C ,
                                           A698TBT01_SITE_ID ,
                                           new Integer(AV58W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code().size()) ,
                                           AV90W_P_KANI_KENSAKU ,
                                           new Short(AV94W_SEL_PTN) ,
                                           AV58W_B712_SD05_SEL1.getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code() ,
                                           A655TBT02_DM_ARRIVAL_FLG ,
                                           A656TBT02_DM_ARRIVAL_DATETIME ,
                                           A661TBT02_INPUT_END_FLG ,
                                           A449TBT02_DEL_FLG ,
                                           A441TBT01_DEL_FLG ,
                                           new Long(AV44P_STUDY_ID) ,
                                           new Integer(AV163W_GET_SUBJECT_ID) ,
                                           new Long(A89TBT02_STUDY_ID) ,
                                           new Integer(A90TBT02_SUBJECT_ID) },
                                           new int[] {
                                           TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.INT,
                                           TypeConstants.LONG, TypeConstants.INT
                                           }
      });
      /* Using cursor H001J9 */
      pr_default.execute(7, new Object[] {new Long(AV44P_STUDY_ID), new Integer(AV163W_GET_SUBJECT_ID)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A498TBT02_CRF_LATEST_VERSION = H001J9_A498TBT02_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A498TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)));
         n498TBT02_CRF_LATEST_VERSION = H001J9_n498TBT02_CRF_LATEST_VERSION[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = H001J9_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n656TBT02_DM_ARRIVAL_DATETIME = H001J9_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A935TBT02_CRF_EDA_NO = H001J9_A935TBT02_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
         A91TBT02_CRF_ID = H001J9_A91TBT02_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
         A90TBT02_SUBJECT_ID = H001J9_A90TBT02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
         A89TBT02_STUDY_ID = H001J9_A89TBT02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
         A441TBT01_DEL_FLG = H001J9_A441TBT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A441TBT01_DEL_FLG", A441TBT01_DEL_FLG);
         n441TBT01_DEL_FLG = H001J9_n441TBT01_DEL_FLG[0] ;
         A449TBT02_DEL_FLG = H001J9_A449TBT02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A449TBT02_DEL_FLG", A449TBT02_DEL_FLG);
         n449TBT02_DEL_FLG = H001J9_n449TBT02_DEL_FLG[0] ;
         A661TBT02_INPUT_END_FLG = H001J9_A661TBT02_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661TBT02_INPUT_END_FLG", A661TBT02_INPUT_END_FLG);
         n661TBT02_INPUT_END_FLG = H001J9_n661TBT02_INPUT_END_FLG[0] ;
         A655TBT02_DM_ARRIVAL_FLG = H001J9_A655TBT02_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A655TBT02_DM_ARRIVAL_FLG", A655TBT02_DM_ARRIVAL_FLG);
         n655TBT02_DM_ARRIVAL_FLG = H001J9_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A698TBT01_SITE_ID = H001J9_A698TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBT01_SITE_ID", A698TBT01_SITE_ID);
         n698TBT01_SITE_ID = H001J9_n698TBT01_SITE_ID[0] ;
         A499TBT02_CRF_INPUT_LEVEL = H001J9_A499TBT02_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A499TBT02_CRF_INPUT_LEVEL, 2, 0)));
         n499TBT02_CRF_INPUT_LEVEL = H001J9_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A652TBT02_UPLOAD_DATETIME = H001J9_A652TBT02_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652TBT02_UPLOAD_DATETIME", localUtil.ttoc( A652TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n652TBT02_UPLOAD_DATETIME = H001J9_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = H001J9_A653TBT02_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653TBT02_UPLOAD_USER_ID", A653TBT02_UPLOAD_USER_ID);
         n653TBT02_UPLOAD_USER_ID = H001J9_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = H001J9_A654TBT02_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654TBT02_UPLOAD_AUTH_CD", A654TBT02_UPLOAD_AUTH_CD);
         n654TBT02_UPLOAD_AUTH_CD = H001J9_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A992TBT02_SIGNATURE_USER_ID = H001J9_A992TBT02_SIGNATURE_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A992TBT02_SIGNATURE_USER_ID", A992TBT02_SIGNATURE_USER_ID);
         n992TBT02_SIGNATURE_USER_ID = H001J9_n992TBT02_SIGNATURE_USER_ID[0] ;
         A991TBT02_SIGNATURE_DATETIME = H001J9_A991TBT02_SIGNATURE_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A991TBT02_SIGNATURE_DATETIME", localUtil.ttoc( A991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n991TBT02_SIGNATURE_DATETIME = H001J9_n991TBT02_SIGNATURE_DATETIME[0] ;
         A990TBT02_SIGNATURE_FLG = H001J9_A990TBT02_SIGNATURE_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A990TBT02_SIGNATURE_FLG", A990TBT02_SIGNATURE_FLG);
         n990TBT02_SIGNATURE_FLG = H001J9_n990TBT02_SIGNATURE_FLG[0] ;
         A456TBT02_UPD_CNT = H001J9_A456TBT02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
         n456TBT02_UPD_CNT = H001J9_n456TBT02_UPD_CNT[0] ;
         A441TBT01_DEL_FLG = H001J9_A441TBT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A441TBT01_DEL_FLG", A441TBT01_DEL_FLG);
         n441TBT01_DEL_FLG = H001J9_n441TBT01_DEL_FLG[0] ;
         A698TBT01_SITE_ID = H001J9_A698TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBT01_SITE_ID", A698TBT01_SITE_ID);
         n698TBT01_SITE_ID = H001J9_n698TBT01_SITE_ID[0] ;
         AV76W_DATA_GET_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76W_DATA_GET_FLG", AV76W_DATA_GET_FLG);
         if ( GXutil.strcmp(AV90W_P_KANI_KENSAKU, "2") == 0 )
         {
            if ( GXutil.strcmp(A698TBT01_SITE_ID, AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_site_id()) == 0 )
            {
               AV215GXLvl1965 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV215GXLvl1965", GXutil.str( AV215GXLvl1965, 1, 0));
               /* Using cursor H001J10 */
               pr_default.execute(8, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO), AV42P_AUTH_CD});
               if ( Gx_err != 0 )
               {
                  AV215GXLvl1965 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV215GXLvl1965", GXutil.str( AV215GXLvl1965, 1, 0));
               }
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A140TBT14_STUDY_ID = H001J10_A140TBT14_STUDY_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
                  A142TBT14_SUBJECT_ID = H001J10_A142TBT14_SUBJECT_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
                  A474TBT14_CRF_ID = H001J10_A474TBT14_CRF_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A474TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A474TBT14_CRF_ID, 4, 0)));
                  n474TBT14_CRF_ID = H001J10_n474TBT14_CRF_ID[0] ;
                  A941TBT14_CRF_EDA_NO = H001J10_A941TBT14_CRF_EDA_NO[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A941TBT14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A941TBT14_CRF_EDA_NO, 2, 0)));
                  n941TBT14_CRF_EDA_NO = H001J10_n941TBT14_CRF_EDA_NO[0] ;
                  A479TBT14_DEL_FLG = H001J10_A479TBT14_DEL_FLG[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
                  n479TBT14_DEL_FLG = H001J10_n479TBT14_DEL_FLG[0] ;
                  A902TBT14_KANRYO_FLG = H001J10_A902TBT14_KANRYO_FLG[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
                  n902TBT14_KANRYO_FLG = H001J10_n902TBT14_KANRYO_FLG[0] ;
                  A927TBT14_KAKUNIN_FLG = H001J10_A927TBT14_KAKUNIN_FLG[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
                  n927TBT14_KAKUNIN_FLG = H001J10_n927TBT14_KAKUNIN_FLG[0] ;
                  A930TBT14_REQUEST_AUTH_CD = H001J10_A930TBT14_REQUEST_AUTH_CD[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
                  n930TBT14_REQUEST_AUTH_CD = H001J10_n930TBT14_REQUEST_AUTH_CD[0] ;
                  AV215GXLvl1965 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV215GXLvl1965", GXutil.str( AV215GXLvl1965, 1, 0));
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               if ( AV215GXLvl1965 == 0 )
               {
                  AV76W_DATA_GET_FLG = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV76W_DATA_GET_FLG", AV76W_DATA_GET_FLG);
               }
            }
            else
            {
               AV76W_DATA_GET_FLG = false ;
               httpContext.ajax_rsp_assign_attri("", false, "AV76W_DATA_GET_FLG", AV76W_DATA_GET_FLG);
            }
         }
         if ( AV76W_DATA_GET_FLG )
         {
            AV113W_TBM34_CRF_ID = A91TBT02_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113W_TBM34_CRF_ID", GXutil.ltrim( GXutil.str( AV113W_TBM34_CRF_ID, 4, 0)));
            /* Execute user subroutine: S319 */
            S319 ();
            if ( returnInSub )
            {
               pr_default.close(7);
               pr_default.close(7);
               returnInSub = true;
               if (true) return;
            }
            if ( AV73W_CRF_AUTH_FLG )
            {
               AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)new SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem(remoteHandle, context);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( false );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id( A90TBT02_SUBJECT_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id( A91TBT02_CRF_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no( A935TBT02_CRF_EDA_NO );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version( A498TBT02_CRF_LATEST_VERSION );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level( A499TBT02_CRF_INPUT_LEVEL );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime( A652TBT02_UPLOAD_DATETIME );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id( A653TBT02_UPLOAD_USER_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd( A654TBT02_UPLOAD_AUTH_CD );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg( A661TBT02_INPUT_END_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id( A992TBT02_SIGNATURE_USER_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime( A991TBT02_SIGNATURE_DATETIME );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg( A990TBT02_SIGNATURE_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg( A655TBT02_DM_ARRIVAL_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime( A656TBT02_DM_ARRIVAL_DATETIME );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt( A456TBT02_UPD_CNT );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV7W_TBM31_CRF_ID = A91TBT02_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7W_TBM31_CRF_ID", GXutil.ltrim( GXutil.str( AV7W_TBM31_CRF_ID, 4, 0)));
               /* Execute user subroutine: S329 */
               S329 ();
               if ( returnInSub )
               {
                  pr_default.close(7);
                  pr_default.close(7);
                  returnInSub = true;
                  if (true) return;
               }
               AV5W_TAM07_USER_ID = A653TBT02_UPLOAD_USER_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5W_TAM07_USER_ID", AV5W_TAM07_USER_ID);
               /* Execute user subroutine: S339 */
               S339 ();
               if ( returnInSub )
               {
                  pr_default.close(7);
                  pr_default.close(7);
                  returnInSub = true;
                  if (true) return;
               }
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm( AV104W_TAM07_USER_NM );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               /* Using cursor H001J11 */
               pr_default.execute(9, new Object[] {new Long(A89TBT02_STUDY_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A945TBM44_STUDY_ID = H001J11_A945TBM44_STUDY_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
                  A946TBM44_CRF_ID = H001J11_A946TBM44_CRF_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
                  A947TBM44_CRF_EDA_NO = H001J11_A947TBM44_CRF_EDA_NO[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
                  A948TBM44_VISIT_NO = H001J11_A948TBM44_VISIT_NO[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
                  n948TBM44_VISIT_NO = H001J11_n948TBM44_VISIT_NO[0] ;
                  AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no( A948TBM44_VISIT_NO );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(9);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id( A698TBT01_SITE_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV6W_TAM08_SITE_ID = A698TBT01_SITE_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6W_TAM08_SITE_ID", AV6W_TAM08_SITE_ID);
               /* Execute user subroutine: S349 */
               S349 ();
               if ( returnInSub )
               {
                  pr_default.close(7);
                  pr_default.close(7);
                  returnInSub = true;
                  if (true) return;
               }
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm( AV105W_TAM08_SITE_SNM );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm( AV111W_TBM31_CRF_SNM+"("+GXutil.trim( GXutil.str( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no(), 10, 0))+")" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order( AV112W_TBM31_ORDER );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg( AV127W_TBM31_REPEAT_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max( AV128W_TBM31_REPEAT_MAX );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max( AV126W_CRF_EDA_NO_MAX );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm( AV104W_TAM07_USER_NM );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               if ( GXutil.nullDate().equals(A656TBT02_DM_ARRIVAL_DATETIME) )
               {
                  AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( false );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               }
               else
               {
                  AV217GXLvl2048 = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV217GXLvl2048", GXutil.str( AV217GXLvl2048, 1, 0));
                  /* Using cursor H001J12 */
                  pr_default.execute(10, new Object[] {new Long(AV44P_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
                  if ( Gx_err != 0 )
                  {
                     AV217GXLvl2048 = (byte)(1) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV217GXLvl2048", GXutil.str( AV217GXLvl2048, 1, 0));
                  }
                  while ( (pr_default.getStatus(10) != 101) )
                  {
                     A93TBT11_SUBJECT_ID = H001J12_A93TBT11_SUBJECT_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
                     A94TBT11_CRF_ID = H001J12_A94TBT11_CRF_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
                     A936TBT11_CRF_EDA_NO = H001J12_A936TBT11_CRF_EDA_NO[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
                     A669TBT11_DM_ARRIVAL_FLG = H001J12_A669TBT11_DM_ARRIVAL_FLG[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A669TBT11_DM_ARRIVAL_FLG", A669TBT11_DM_ARRIVAL_FLG);
                     n669TBT11_DM_ARRIVAL_FLG = H001J12_n669TBT11_DM_ARRIVAL_FLG[0] ;
                     A92TBT11_STUDY_ID = H001J12_A92TBT11_STUDY_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
                     A670TBT11_DM_ARRIVAL_DATETIME = H001J12_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A670TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     n670TBT11_DM_ARRIVAL_DATETIME = H001J12_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
                     A95TBT11_CRF_VERSION = H001J12_A95TBT11_CRF_VERSION[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
                     AV217GXLvl2048 = (byte)(1) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV217GXLvl2048", GXutil.str( AV217GXLvl2048, 1, 0));
                     if ( A670TBT11_DM_ARRIVAL_DATETIME.equals( A656TBT02_DM_ARRIVAL_DATETIME ) && ( A95TBT11_CRF_VERSION == A498TBT02_CRF_LATEST_VERSION ) )
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
                     pr_default.readNext(10);
                  }
                  pr_default.close(10);
                  if ( AV217GXLvl2048 == 0 )
                  {
                     AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( false );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
                  }
               }
               AV10D_B712_SD06_RESULT_CRF.add(AV11D_B712_SD06_RESULT_CRF_Item, 0);
            }
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S252( )
   {
      /* 'SUB_SORT' Routine */
      if ( GXutil.strcmp(AV27D_SORT, "1") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("TBT02_SUBJECT_ID,VISIT_NO,TBM31_ORDER,TBT02_CRF_EDA_NO");
      }
      else if ( GXutil.strcmp(AV27D_SORT, "2") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("VISIT_NO,TBM31_ORDER,TBT02_SUBJECT_ID");
      }
      else if ( GXutil.strcmp(AV27D_SORT, "3") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("TBT02_CRF_INPUT_LEVEL,VISIT_NO,TBM31_ORDER,TBT02_SUBJECT_ID");
      }
      else if ( GXutil.strcmp(AV27D_SORT, "4") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("[TBT02_DM_ARRIVAL_FLG],TBT02_SUBJECT_ID,VISIT_NO,TBM31_ORDER");
      }
      else if ( GXutil.strcmp(AV27D_SORT, "5") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("[TBT02_INPUT_END_FLG],TBT02_SUBJECT_ID,VISIT_NO,TBM31_ORDER");
      }
      else if ( GXutil.strcmp(AV27D_SORT, "6") == 0 )
      {
         AV10D_B712_SD06_RESULT_CRF.sort("[TBT02_SIGNATURE_FLG],TBT02_SUBJECT_ID,VISIT_NO,TBM31_ORDER");
      }
      else
      {
      }
   }

   public void S262( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV85W_GAMENNM_KENSAKU = "B712_WP01_SEARCH_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85W_GAMENNM_KENSAKU", AV85W_GAMENNM_KENSAKU);
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
      AV160W_SD_B712_SD11_C.fromJSonString(AV95W_SESSION.getValue(AV162W_SESSION_KEY_SUBJECT_CRF));
   }

   public void S272( )
   {
      /* 'SUB_SYOKI_DATA_GET' Routine */
      GXt_char3 = AV109W_TBM01_SAGYOJOHO_VALUE ;
      GXv_char9[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "014", GXv_char9) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
      AV109W_TBM01_SAGYOJOHO_VALUE = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109W_TBM01_SAGYOJOHO_VALUE", AV109W_TBM01_SAGYOJOHO_VALUE);
      GXt_char3 = AV107W_TBM01_DM_VALUE ;
      GXv_char9[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "008", GXv_char9) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
      AV107W_TBM01_DM_VALUE = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107W_TBM01_DM_VALUE", AV107W_TBM01_DM_VALUE);
      GXt_char3 = AV106W_TBM01_CRC_VALUE ;
      GXv_char9[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "021", GXv_char9) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
      AV106W_TBM01_CRC_VALUE = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106W_TBM01_CRC_VALUE", AV106W_TBM01_CRC_VALUE);
      GXt_char3 = AV108W_TBM01_RESEARCHER_VALUE ;
      GXv_char9[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "022", GXv_char9) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
      AV108W_TBM01_RESEARCHER_VALUE = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108W_TBM01_RESEARCHER_VALUE", AV108W_TBM01_RESEARCHER_VALUE);
      GXt_char3 = AV110W_TBM01_SITE_MG_VALUE ;
      GXv_char9[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "009", GXv_char9) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
      AV110W_TBM01_SITE_MG_VALUE = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110W_TBM01_SITE_MG_VALUE", AV110W_TBM01_SITE_MG_VALUE);
      GXt_char3 = AV180W_TBM01_JIMU_VALUE ;
      GXv_char9[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "010", GXv_char9) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
      AV180W_TBM01_JIMU_VALUE = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV180W_TBM01_JIMU_VALUE", AV180W_TBM01_JIMU_VALUE);
      GXt_char3 = AV181W_TBM01_MONITOR_VALUE ;
      GXv_char9[0] = GXt_char3 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "018", GXv_char9) ;
      b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
      AV181W_TBM01_MONITOR_VALUE = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV181W_TBM01_MONITOR_VALUE", AV181W_TBM01_MONITOR_VALUE);
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
         lblBtn_pdf_out_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_pdf_out_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblBtn_pdf_out_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(AV42P_AUTH_CD, AV106W_TBM01_CRC_VALUE) == 0 ) || ( GXutil.strcmp(AV42P_AUTH_CD, AV109W_TBM01_SAGYOJOHO_VALUE) == 0 ) || ( GXutil.strcmp(AV42P_AUTH_CD, AV180W_TBM01_JIMU_VALUE) == 0 ) || ( GXutil.strcmp(AV42P_AUTH_CD, AV181W_TBM01_MONITOR_VALUE) == 0 ) || ( GXutil.strcmp(AV42P_AUTH_CD, AV107W_TBM01_DM_VALUE) == 0 ) )
      {
         lblBtn_sign_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_sign_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblBtn_sign_Visible, 5, 0)));
         tblTbl_sign_ok_sel_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_sign_ok_sel_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_sign_ok_sel_Visible, 5, 0)));
      }
   }

   public void S162( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavD_ol_disp.removeAllItems();
      /* Using cursor H001J13 */
      pr_default.execute(11);
      while ( (pr_default.getStatus(11) != 101) )
      {
         A300TAS01_DEL_FLG = H001J13_A300TAS01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TAS01_DEL_FLG", A300TAS01_DEL_FLG);
         n300TAS01_DEL_FLG = H001J13_n300TAS01_DEL_FLG[0] ;
         A7TAS01_DATA_KIND = H001J13_A7TAS01_DATA_KIND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAS01_DATA_KIND", A7TAS01_DATA_KIND);
         A9TAS01_ITEM_NM = H001J13_A9TAS01_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9TAS01_ITEM_NM", A9TAS01_ITEM_NM);
         n9TAS01_ITEM_NM = H001J13_n9TAS01_ITEM_NM[0] ;
         A336TAS01_CHAR_1 = H001J13_A336TAS01_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A336TAS01_CHAR_1", A336TAS01_CHAR_1);
         n336TAS01_CHAR_1 = H001J13_n336TAS01_CHAR_1[0] ;
         A335TAS01_SORT_NO = H001J13_A335TAS01_SORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335TAS01_SORT_NO", GXutil.ltrim( GXutil.str( A335TAS01_SORT_NO, 3, 0)));
         n335TAS01_SORT_NO = H001J13_n335TAS01_SORT_NO[0] ;
         cmbavD_ol_disp.addItem(A336TAS01_CHAR_1, A9TAS01_ITEM_NM, (short)(0));
         pr_default.readNext(11);
      }
      pr_default.close(11);
      cmbavD_group.removeAllItems();
      cmbavD_group.addItem("0", "全表示", (short)(0));
      /* Using cursor H001J14 */
      pr_default.execute(12, new Object[] {new Long(AV44P_STUDY_ID)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A982TBM45_DEL_FLG = H001J14_A982TBM45_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A982TBM45_DEL_FLG", A982TBM45_DEL_FLG);
         n982TBM45_DEL_FLG = H001J14_n982TBM45_DEL_FLG[0] ;
         A977TBM45_STUDY_ID = H001J14_A977TBM45_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
         A980TBM45_FILETR_NM = H001J14_A980TBM45_FILETR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A980TBM45_FILETR_NM", A980TBM45_FILETR_NM);
         n980TBM45_FILETR_NM = H001J14_n980TBM45_FILETR_NM[0] ;
         A978TBM45_FILTER_NO = H001J14_A978TBM45_FILTER_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
         cmbavD_group.addItem(GXutil.trim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)), A980TBM45_FILETR_NM, (short)(0));
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S319( )
   {
      /* 'SUB_CRF_AUTH_GET' Routine */
      AV73W_CRF_AUTH_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73W_CRF_AUTH_FLG", AV73W_CRF_AUTH_FLG);
      if ( GXutil.strcmp(AV53W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(), AV109W_TBM01_SAGYOJOHO_VALUE) != 0 )
      {
         AV73W_CRF_AUTH_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73W_CRF_AUTH_FLG", AV73W_CRF_AUTH_FLG);
      }
      else
      {
         AV220GXLvl2244 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV220GXLvl2244", GXutil.str( AV220GXLvl2244, 1, 0));
         /* Using cursor H001J15 */
         pr_default.execute(13, new Object[] {new Long(AV44P_STUDY_ID), new Short(AV113W_TBM34_CRF_ID)});
         if ( Gx_err != 0 )
         {
            AV220GXLvl2244 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV220GXLvl2244", GXutil.str( AV220GXLvl2244, 1, 0));
         }
         while ( (pr_default.getStatus(13) != 101) )
         {
            A572TBM34_DEL_FLG = H001J15_A572TBM34_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A572TBM34_DEL_FLG", A572TBM34_DEL_FLG);
            n572TBM34_DEL_FLG = H001J15_n572TBM34_DEL_FLG[0] ;
            A571TBM34_DISPLAY_FLG = H001J15_A571TBM34_DISPLAY_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A571TBM34_DISPLAY_FLG", A571TBM34_DISPLAY_FLG);
            n571TBM34_DISPLAY_FLG = H001J15_n571TBM34_DISPLAY_FLG[0] ;
            A30TBM34_STYDY_AUTH_CD = H001J15_A30TBM34_STYDY_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30TBM34_STYDY_AUTH_CD", A30TBM34_STYDY_AUTH_CD);
            A29TBM34_CRF_ID = H001J15_A29TBM34_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A29TBM34_CRF_ID", GXutil.ltrim( GXutil.str( A29TBM34_CRF_ID, 4, 0)));
            A28TBM34_STUDY_ID = H001J15_A28TBM34_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A28TBM34_STUDY_ID", GXutil.ltrim( GXutil.str( A28TBM34_STUDY_ID, 10, 0)));
            AV220GXLvl2244 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV220GXLvl2244", GXutil.str( AV220GXLvl2244, 1, 0));
            AV73W_CRF_AUTH_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73W_CRF_AUTH_FLG", AV73W_CRF_AUTH_FLG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
         if ( AV220GXLvl2244 == 0 )
         {
            AV73W_CRF_AUTH_FLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73W_CRF_AUTH_FLG", AV73W_CRF_AUTH_FLG);
         }
      }
   }

   public void S349( )
   {
      /* 'SUB_SITE_NM_GET' Routine */
      AV105W_TAM08_SITE_SNM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105W_TAM08_SITE_SNM", AV105W_TAM08_SITE_SNM);
      /* Using cursor H001J16 */
      pr_default.execute(14, new Object[] {AV6W_TAM08_SITE_ID});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A325TAM08_DEL_FLG = H001J16_A325TAM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325TAM08_DEL_FLG", A325TAM08_DEL_FLG);
         n325TAM08_DEL_FLG = H001J16_n325TAM08_DEL_FLG[0] ;
         A57TAM08_SITE_ID = H001J16_A57TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
         A320TAM08_SITE_SNM = H001J16_A320TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A320TAM08_SITE_SNM", A320TAM08_SITE_SNM);
         n320TAM08_SITE_SNM = H001J16_n320TAM08_SITE_SNM[0] ;
         AV105W_TAM08_SITE_SNM = A320TAM08_SITE_SNM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105W_TAM08_SITE_SNM", AV105W_TAM08_SITE_SNM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S329( )
   {
      /* 'SUB_CRF_NM_GET' Routine */
      AV111W_TBM31_CRF_SNM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111W_TBM31_CRF_SNM", AV111W_TBM31_CRF_SNM);
      AV112W_TBM31_ORDER = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112W_TBM31_ORDER", GXutil.ltrim( GXutil.str( AV112W_TBM31_ORDER, 5, 0)));
      AV127W_TBM31_REPEAT_FLG = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127W_TBM31_REPEAT_FLG", GXutil.str( AV127W_TBM31_REPEAT_FLG, 1, 0));
      /* Using cursor H001J17 */
      pr_default.execute(15, new Object[] {new Long(AV44P_STUDY_ID), new Short(AV7W_TBM31_CRF_ID)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A397TBM31_DEL_FLG = H001J17_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = H001J17_n397TBM31_DEL_FLG[0] ;
         A69TBM31_CRF_ID = H001J17_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A68TBM31_STUDY_ID = H001J17_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A642TBM31_CRF_SNM = H001J17_A642TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
         n642TBM31_CRF_SNM = H001J17_n642TBM31_CRF_SNM[0] ;
         A395TBM31_ORDER = H001J17_A395TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
         n395TBM31_ORDER = H001J17_n395TBM31_ORDER[0] ;
         A943TBM31_REPEAT_FLG = H001J17_A943TBM31_REPEAT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A943TBM31_REPEAT_FLG", GXutil.str( A943TBM31_REPEAT_FLG, 1, 0));
         n943TBM31_REPEAT_FLG = H001J17_n943TBM31_REPEAT_FLG[0] ;
         A944TBM31_REPEAT_MAX = H001J17_A944TBM31_REPEAT_MAX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A944TBM31_REPEAT_MAX", GXutil.ltrim( GXutil.str( A944TBM31_REPEAT_MAX, 2, 0)));
         n944TBM31_REPEAT_MAX = H001J17_n944TBM31_REPEAT_MAX[0] ;
         AV111W_TBM31_CRF_SNM = A642TBM31_CRF_SNM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111W_TBM31_CRF_SNM", AV111W_TBM31_CRF_SNM);
         AV112W_TBM31_ORDER = A395TBM31_ORDER ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112W_TBM31_ORDER", GXutil.ltrim( GXutil.str( AV112W_TBM31_ORDER, 5, 0)));
         AV127W_TBM31_REPEAT_FLG = A943TBM31_REPEAT_FLG ;
         httpContext.ajax_rsp_assign_attri("", false, "AV127W_TBM31_REPEAT_FLG", GXutil.str( AV127W_TBM31_REPEAT_FLG, 1, 0));
         AV128W_TBM31_REPEAT_MAX = A944TBM31_REPEAT_MAX ;
         httpContext.ajax_rsp_assign_attri("", false, "AV128W_TBM31_REPEAT_MAX", GXutil.ltrim( GXutil.str( AV128W_TBM31_REPEAT_MAX, 2, 0)));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S339( )
   {
      /* 'SUB_USER_NM_GET' Routine */
      AV104W_TAM07_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104W_TAM07_USER_NM", AV104W_TAM07_USER_NM);
      /* Using cursor H001J18 */
      pr_default.execute(16, new Object[] {AV5W_TAM07_USER_ID});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A55TAM07_USER_ID = H001J18_A55TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
         A205TAM07_USER_NM = H001J18_A205TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
         n205TAM07_USER_NM = H001J18_n205TAM07_USER_NM[0] ;
         AV104W_TAM07_USER_NM = A205TAM07_USER_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104W_TAM07_USER_NM", AV104W_TAM07_USER_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
   }

   public void S232( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      AV93W_SEL_CNT = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93W_SEL_CNT", GXutil.ltrim( GXutil.str( AV93W_SEL_CNT, 4, 0)));
      AV184W_SEL_CNT_DM_ARRIVAL_OFF = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV184W_SEL_CNT_DM_ARRIVAL_OFF", GXutil.ltrim( GXutil.str( AV184W_SEL_CNT_DM_ARRIVAL_OFF, 4, 0)));
      AV68W_CHK_ALLON_DM_ARRIVAL_FLG = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68W_CHK_ALLON_DM_ARRIVAL_FLG", AV68W_CHK_ALLON_DM_ARRIVAL_FLG);
      AV69W_CHK_INPUT_END_KONZAI_FLG = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69W_CHK_INPUT_END_KONZAI_FLG", AV69W_CHK_INPUT_END_KONZAI_FLG);
      AV67W_CHK_ALLOFF_INPUT_END_FLG = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67W_CHK_ALLOFF_INPUT_END_FLG", AV67W_CHK_ALLOFF_INPUT_END_FLG);
      AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG", AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG);
      AV179W_CHK_SIGN_OFF_FLG = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV179W_CHK_SIGN_OFF_FLG", AV179W_CHK_SIGN_OFF_FLG);
      AV34H_INPUT_END_FLG_SV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34H_INPUT_END_FLG_SV", AV34H_INPUT_END_FLG_SV);
      AV87W_IDX = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      while ( AV87W_IDX <= AV10D_B712_SD06_RESULT_CRF.size() )
      {
         if ( ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg() )
         {
            AV93W_SEL_CNT = (short)(AV93W_SEL_CNT+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93W_SEL_CNT", GXutil.ltrim( GXutil.str( AV93W_SEL_CNT, 4, 0)));
            if ( GXutil.strcmp(((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg(), "0") == 0 )
            {
               AV68W_CHK_ALLON_DM_ARRIVAL_FLG = false ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68W_CHK_ALLON_DM_ARRIVAL_FLG", AV68W_CHK_ALLON_DM_ARRIVAL_FLG);
               AV184W_SEL_CNT_DM_ARRIVAL_OFF = (short)(AV184W_SEL_CNT_DM_ARRIVAL_OFF+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV184W_SEL_CNT_DM_ARRIVAL_OFF", GXutil.ltrim( GXutil.str( AV184W_SEL_CNT_DM_ARRIVAL_OFF, 4, 0)));
            }
            else
            {
               AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG = false ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG", AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG);
            }
            if ( GXutil.strcmp(((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg(), "1") == 0 )
            {
               AV67W_CHK_ALLOFF_INPUT_END_FLG = false ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67W_CHK_ALLOFF_INPUT_END_FLG", AV67W_CHK_ALLOFF_INPUT_END_FLG);
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
                  httpContext.ajax_rsp_assign_attri("", false, "AV69W_CHK_INPUT_END_KONZAI_FLG", AV69W_CHK_INPUT_END_KONZAI_FLG);
               }
            }
            if ( GXutil.strcmp(((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg(), "1") == 0 )
            {
               AV179W_CHK_SIGN_OFF_FLG = false ;
               httpContext.ajax_rsp_assign_attri("", false, "AV179W_CHK_SIGN_OFF_FLG", AV179W_CHK_SIGN_OFF_FLG);
            }
            AV37H_SEL_TBT02_CRF_ID = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37H_SEL_TBT02_CRF_ID", GXutil.ltrim( GXutil.str( AV37H_SEL_TBT02_CRF_ID, 4, 0)));
            AV137H_SEL_TBT02_CRF_EDA_NO = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137H_SEL_TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( AV137H_SEL_TBT02_CRF_EDA_NO, 2, 0)));
            AV38H_SEL_TBT02_SUBJECT_ID = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38H_SEL_TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV38H_SEL_TBT02_SUBJECT_ID, 6, 0)));
            AV39H_SEL_TBT02_UPD_CNT = ((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+(int)(AV87W_IDX))).getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39H_SEL_TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( AV39H_SEL_TBT02_UPD_CNT, 10, 0)));
         }
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      }
   }

   public void S242( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV70W_CHK_STUDY_UPD_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70W_CHK_STUDY_UPD_FLG", AV70W_CHK_STUDY_UPD_FLG);
      AV224GXLvl2361 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV224GXLvl2361", GXutil.str( AV224GXLvl2361, 1, 0));
      /* Using cursor H001J19 */
      pr_default.execute(17, new Object[] {new Long(AV44P_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV224GXLvl2361 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV224GXLvl2361", GXutil.str( AV224GXLvl2361, 1, 0));
      }
      while ( (pr_default.getStatus(17) != 101) )
      {
         A369TBM21_DEL_FLG = H001J19_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H001J19_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = H001J19_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A607TBM21_STATUS = H001J19_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = H001J19_n607TBM21_STATUS[0] ;
         AV224GXLvl2361 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV224GXLvl2361", GXutil.str( AV224GXLvl2361, 1, 0));
         if ( GXutil.strcmp(A607TBM21_STATUS, "2") == 0 )
         {
            AV70W_CHK_STUDY_UPD_FLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70W_CHK_STUDY_UPD_FLG", AV70W_CHK_STUDY_UPD_FLG);
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「終了」", "操作", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
         }
         else if ( GXutil.strcmp(A607TBM21_STATUS, "9") == 0 )
         {
            AV70W_CHK_STUDY_UPD_FLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70W_CHK_STUDY_UPD_FLG", AV70W_CHK_STUDY_UPD_FLG);
            GXt_char3 = AV89W_MSG ;
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「中止」", "操作", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
            httpContext.GX_msglist.addItem(AV89W_MSG);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
      if ( AV224GXLvl2361 == 0 )
      {
         AV70W_CHK_STUDY_UPD_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70W_CHK_STUDY_UPD_FLG", AV70W_CHK_STUDY_UPD_FLG);
         GXt_char3 = AV89W_MSG ;
         GXv_char9[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "選択された試験", "利用不可", "操作", "", "", GXv_char9) ;
         b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
         AV89W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
         httpContext.GX_msglist.addItem(AV89W_MSG);
      }
   }

   public void S202( )
   {
      /* 'SUB_SDT_UPD' Routine */
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_231 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_231"), ".", ",")) ;
      nGXsfl_231_fel_idx = (short)(0) ;
      while ( nGXsfl_231_fel_idx < nRC_GXsfl_231 )
      {
         nGXsfl_231_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_231_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_231_fel_idx+1)) ;
         sGXsfl_231_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_231_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_2312( ) ;
         AV19D_GRD_SEL_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_sel_flg.getInternalname())) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_SUBJECT_ID");
            GX_FocusControl = edtavD_grd_subject_id_Internalname ;
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
            wbErr = true ;
            AV14D_GRD_CRF_ID = (short)(0) ;
         }
         else
         {
            AV14D_GRD_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_id_Internalname), ".", ",")) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_eda_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_eda_no_Internalname), ".", ",") > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_CRF_EDA_NO");
            GX_FocusControl = edtavD_grd_crf_eda_no_Internalname ;
            wbErr = true ;
            AV124D_GRD_CRF_EDA_NO = (byte)(0) ;
         }
         else
         {
            AV124D_GRD_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_crf_eda_no_Internalname), ".", ",")) ;
         }
         AV15D_GRD_CRF_SNM = httpContext.cgiGet( edtavD_grd_crf_snm_Internalname) ;
         AV18D_GRD_LAST_UPD_DATETIME_VC = httpContext.cgiGet( edtavD_grd_last_upd_datetime_vc_Internalname) ;
         AV23D_GRD_UPD_USER_NM = httpContext.cgiGet( edtavD_grd_upd_user_nm_Internalname) ;
         AV17D_GRD_DM = httpContext.cgiGet( edtavD_grd_dm_Internalname) ;
         AV147D_GRD_SIGN = httpContext.cgiGet( edtavD_grd_sign_Internalname) ;
         AV16D_GRD_DATA_KOTE = httpContext.cgiGet( edtavD_grd_data_kote_Internalname) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0394") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0394", "");
         }
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0394") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0394", "");
         }
         AV226GXV19 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV226GXV19", GXutil.ltrim( GXutil.str( AV226GXV19, 8, 0)));
         while ( AV226GXV19 <= AV10D_B712_SD06_RESULT_CRF.size() )
         {
            AV11D_B712_SD06_RESULT_CRF_Item = (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)((SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)AV10D_B712_SD06_RESULT_CRF.elementAt(-1+AV226GXV19));
            if ( ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id() == AV22D_GRD_SUBJECT_ID ) && ( GXutil.strcmp(AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id(), AV20D_GRD_SITE_ID) == 0 ) && ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id() == AV14D_GRD_CRF_ID ) && ( AV11D_B712_SD06_RESULT_CRF_Item.getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no() == AV124D_GRD_CRF_EDA_NO ) )
            {
               AV11D_B712_SD06_RESULT_CRF_Item.setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( AV19D_GRD_SEL_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11D_B712_SD06_RESULT_CRF_Item", AV11D_B712_SD06_RESULT_CRF_Item);
               if (true) break;
            }
            AV226GXV19 = (int)(AV226GXV19+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV226GXV19", GXutil.ltrim( GXutil.str( AV226GXV19, 8, 0)));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_231_fel_idx == 0 )
      {
         nGXsfl_231_idx = (short)(1) ;
         sGXsfl_231_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_231_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_2312( ) ;
      }
      nGXsfl_231_fel_idx = (short)(1) ;
   }

   public void S212( )
   {
      /* 'SUB_SDT_SAVE' Routine */
      AV95W_SESSION.setValue("B712_WP02_RESULT_DATA", AV10D_B712_SD06_RESULT_CRF.toxml(false, true, "B712_SD06_RESULT_CRF", "tablet-EDC_GXXEV3U3"));
   }

   public void S142( )
   {
      /* 'SUB_SDT_GET' Routine */
      AV10D_B712_SD06_RESULT_CRF.fromxml(AV95W_SESSION.getValue("B712_WP02_RESULT_DATA"), "");
   }

   public void S222( )
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
      AV87W_IDX = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
      AV227GXV20 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV227GXV20", GXutil.ltrim( GXutil.str( AV227GXV20, 8, 0)));
      while ( AV227GXV20 <= AV49SD_B712_SD08_ICON_INFO.size() )
      {
         AV50SD_B712_SD08_ICON_INFO_I = (SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)((SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)AV49SD_B712_SD08_ICON_INFO.elementAt(-1+AV227GXV20));
         AV87W_IDX = (long)(AV87W_IDX+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87W_IDX", GXutil.ltrim( GXutil.str( AV87W_IDX, 10, 0)));
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
         if ( AV87W_IDX == 10 )
         {
            if (true) break;
         }
         AV227GXV20 = (int)(AV227GXV20+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV227GXV20", GXutil.ltrim( GXutil.str( AV227GXV20, 8, 0)));
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT10[0] = AV53W_A_LOGIN_SDT;
      GXv_char9[0] = AV81W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT10, GXv_char9) ;
      AV53W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT10[0] ;
      b712_wp02_result_crf_impl.this.AV81W_ERRCD = GXv_char9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81W_ERRCD", AV81W_ERRCD);
      if ( GXutil.strcmp(AV81W_ERRCD, "0") != 0 )
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
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      AV40H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40H_SRCH_FLG", AV40H_SRCH_FLG);
      AV54W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54W_A819_JS", AV54W_A819_JS);
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
      if ( ! (0==AV178H_SEL_PDF_CD) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!pdfoutFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         if ( AV178H_SEL_PDF_CD == 1 )
         {
            lblTxt_js_event_Caption = lblTxt_js_event_Caption+" gx.evt.execEvt('',false,'E\\'"+GXutil.trim( "BTN_PDF_OUT_HIS_EXEC")+"\\'.',this);" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         }
         else
         {
            lblTxt_js_event_Caption = lblTxt_js_event_Caption+" gx.evt.execEvt('',false,'E\\'"+GXutil.trim( "BTN_PDF_OUT_EXEC")+"\\'.',this);" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         }
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"pdfoutFlg = true;" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         AV178H_SEL_PDF_CD = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV178H_SEL_PDF_CD", GXutil.str( AV178H_SEL_PDF_CD, 1, 0));
      }
      else
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"pdfoutFlg = false;" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      if ( ! (0==AV182H_SEL_CSV_CD) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!csvOutFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         if ( AV182H_SEL_CSV_CD == 1 )
         {
            lblTxt_js_event_Caption = lblTxt_js_event_Caption+" gx.evt.execEvt('',false,'E\\'"+GXutil.trim( "BTN_CSV_OUT_EXEC_ALL")+"\\'.',this);" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         }
         if ( AV182H_SEL_CSV_CD == 2 )
         {
            lblTxt_js_event_Caption = lblTxt_js_event_Caption+" gx.evt.execEvt('',false,'E\\'"+GXutil.trim( "BTN_CSV_OUT_EXEC_DM")+"\\'.',this);" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         }
         if ( AV182H_SEL_CSV_CD == 3 )
         {
            lblTxt_js_event_Caption = lblTxt_js_event_Caption+" gx.evt.execEvt('',false,'E\\'"+GXutil.trim( "BTN_CSV_OUT_EXEC_SIGN")+"\\'.',this);" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         }
         if ( AV182H_SEL_CSV_CD == 4 )
         {
            lblTxt_js_event_Caption = lblTxt_js_event_Caption+" gx.evt.execEvt('',false,'E\\'"+GXutil.trim( "BTN_CSV_OUT_EXEC_KTEI")+"\\'.',this);" ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         }
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"csvOutFlg = true;" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         AV182H_SEL_CSV_CD = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV182H_SEL_CSV_CD", GXutil.str( AV182H_SEL_CSV_CD, 1, 0));
      }
      else
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"csvOutFlg = false;" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
   }

   public void S352( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV193Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b712_wp02_result_crf");
   }

   public void e371J2( )
   {
      /* 'PAGE_FIRST' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e381J2( )
   {
      /* 'PAGE_LAST' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e391J2( )
   {
      /* 'PAGE_BACK' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e401J2( )
   {
      /* 'PAGE_NEXT' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      if ( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e411J2( )
   {
      /* 'PAGE01' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e421J2( )
   {
      /* 'PAGE02' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e431J2( )
   {
      /* 'PAGE03' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e441J2( )
   {
      /* 'PAGE04' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e451J2( )
   {
      /* 'PAGE05' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e461J2( )
   {
      /* 'PAGE06' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e471J2( )
   {
      /* 'PAGE07' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e481J2( )
   {
      /* 'PAGE08' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e491J2( )
   {
      /* 'PAGE09' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e501J2( )
   {
      /* 'PAGE10' Routine */
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      AV30H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( AV10D_B712_SD06_RESULT_CRF.size() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30H_A_PAGING_SDT", AV30H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT11[0] = AV30H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT11) ;
      AV30H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT11[0] ;
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
            GXv_char9[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char9) ;
            b712_wp02_result_crf_impl.this.GXt_char3 = GXv_char9[0] ;
            AV89W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89W_MSG", AV89W_MSG);
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

   public void wb_table2_396_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_crf_del_exec_Internalname, "TXT_BTN_CRF_DEL_EXEC", "", "", lblTxt_btn_crf_del_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CRF_DEL_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_data_ktei_exec_Internalname, "TXT_BTN_DATA_KTEI_EXEC", "", "", lblTxt_btn_data_ktei_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DATA_KTEI_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_sign_exec_Internalname, "TXT_BTN_SIGN_EXEC", "", "", lblTxt_btn_sign_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SIGN_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dm_kaijo_exec_Internalname, "TXT_BTN_DM_KAIJO_EXEC", "", "", lblTxt_btn_dm_kaijo_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DM_KAIJO_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_pdf_out_exec_Internalname, "TXT_BTN_PDF_OUT_EXEC", "", "", lblTxt_btn_pdf_out_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_PDF_OUT_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_pdf_out_his_exec_Internalname, "TXT_BTN_PDF_OUT_HIS_EXEC", "", "", lblTxt_btn_pdf_out_his_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_PDF_OUT_HIS_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 408,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV33H_INIT_FLG), GXutil.rtrim( localUtil.format( AV33H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(408);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 409,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV40H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV40H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(409);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 410,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV35H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV35H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(410);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 411,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_subject_id_Internalname, GXutil.rtrim( AV41H_SUBJECT_ID), GXutil.rtrim( localUtil.format( AV41H_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(411);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_subject_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 412,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_input_end_flg_sv_Internalname, GXutil.rtrim( AV34H_INPUT_END_FLG_SV), GXutil.rtrim( localUtil.format( AV34H_INPUT_END_FLG_SV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(412);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_input_end_flg_sv_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 413,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sel_tbt02_crf_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV37H_SEL_TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37H_SEL_TBT02_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(413);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sel_tbt02_crf_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 414,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sel_tbt02_crf_eda_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV137H_SEL_TBT02_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV137H_SEL_TBT02_CRF_EDA_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(414);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sel_tbt02_crf_eda_no_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 415,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sel_tbt02_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV38H_SEL_TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38H_SEL_TBT02_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(415);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sel_tbt02_subject_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 416,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sel_tbt02_upd_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV39H_SEL_TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39H_SEL_TBT02_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(416);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sel_tbt02_upd_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 417,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_device_Internalname, GXutil.rtrim( AV31H_DEVICE), GXutil.rtrim( localUtil.format( AV31H_DEVICE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(417);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_device_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 418,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(418);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 419,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_msg_rep_Internalname, GXutil.rtrim( AV138H_MSG_REP), GXutil.rtrim( localUtil.format( AV138H_MSG_REP, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(419);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_msg_rep_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 420,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbt02_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV132W_B712_SD09_CRF_ADD.getgxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id(), (byte)(6), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV132W_B712_SD09_CRF_ADD.getgxTv_SdtB712_SD09_CRF_ADD_Tbt02_subject_id()), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(420);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbt02_subject_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 421,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_pdf_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV176W_PDF_CNT, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV176W_PDF_CNT), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(421);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_pdf_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 424,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_zip_file_path_Internalname, GXutil.rtrim( AV121W_ZIP_FILE_PATH), GXutil.rtrim( localUtil.format( AV121W_ZIP_FILE_PATH, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(424);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_zip_file_path_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 1000, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 425,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_zip_filename_Internalname, GXutil.rtrim( AV122W_ZIP_FILENAME), GXutil.rtrim( localUtil.format( AV122W_ZIP_FILENAME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(425);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_zip_filename_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 256, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 426,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_pdf_err_cd_Internalname, GXutil.ltrim( localUtil.ntoc( AV172W_PDF_ERR_CD, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV172W_PDF_ERR_CD), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(426);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_pdf_err_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 427,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_pdf_err_msg_Internalname, GXutil.rtrim( AV173W_PDF_ERR_MSG), GXutil.rtrim( localUtil.format( AV173W_PDF_ERR_MSG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(427);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_pdf_err_msg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 3000, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_MSG", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 428,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_popup_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV170H_POPUP_KBN, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV170H_POPUP_KBN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(428);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_popup_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 429,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_popup_err_cd_Internalname, GXutil.ltrim( localUtil.ntoc( AV36H_POPUP_ERR_CD, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36H_POPUP_ERR_CD), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(429);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_popup_err_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_crf_teisyutu_exec_Internalname, "TXT_BTN_CRF_TEISYUTU_EXEC", "", "", lblTxt_btn_crf_teisyutu_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_435_1J2( true) ;
      }
      else
      {
         wb_table3_435_1J2( false) ;
      }
      return  ;
   }

   public void wb_table3_435_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 451,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sel_pdf_cd_Internalname, GXutil.ltrim( localUtil.ntoc( AV178H_SEL_PDF_CD, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV178H_SEL_PDF_CD), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(451);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sel_pdf_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 452,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sel_csv_cd_Internalname, GXutil.ltrim( localUtil.ntoc( AV182H_SEL_CSV_CD, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV182H_SEL_CSV_CD), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(452);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sel_csv_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_out_exec_sign_Internalname, "TXT_BTN_CSV_OUT_EXEC_SIGN", "", "", lblTxt_btn_csv_out_exec_sign_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV_OUT_EXEC_SIGN\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_out_exec_dm_Internalname, "TXT_BTN_CSV_OUT_EXEC_DM", "", "", lblTxt_btn_csv_out_exec_dm_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV_OUT_EXEC_DM\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_out_exec_all_Internalname, "TXT_BTN_CSV_OUT_EXEC_ALL", "", "", lblTxt_btn_csv_out_exec_all_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV_OUT_EXEC_ALL\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_out_exec_ktei_Internalname, "TXT_BTN_CSV_OUT_EXEC_KTEI", "", "", lblTxt_btn_csv_out_exec_ktei_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV_OUT_EXEC_KTEI\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_396_1J2e( true) ;
      }
      else
      {
         wb_table2_396_1J2e( false) ;
      }
   }

   public void wb_table3_435_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "H_B712_WP05_OK", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 440,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_b712_wp05_ok_Internalname, GXutil.rtrim( AV143H_B712_WP05_OK), GXutil.rtrim( localUtil.format( AV143H_B712_WP05_OK, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(440);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_b712_wp05_ok_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "H_B712_WP05_SIGNATURE_CHK", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 445,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_b712_wp05_signature_chk_Internalname, GXutil.ltrim( localUtil.ntoc( AV145H_B712_WP05_SIGNATURE_CHK, (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV145H_B712_WP05_SIGNATURE_CHK), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(445);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_b712_wp05_signature_chk_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "H_B712_WP05_SIGNATURE_USER_ID", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 450,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_b712_wp05_signature_user_id_Internalname, GXutil.rtrim( AV146H_B712_WP05_SIGNATURE_USER_ID), GXutil.rtrim( localUtil.format( AV146H_B712_WP05_SIGNATURE_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(450);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_b712_wp05_signature_user_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_435_1J2e( true) ;
      }
      else
      {
         wb_table3_435_1J2e( false) ;
      }
   }

   public void wb_table1_2_1J2( boolean wbgen )
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
         httpContext.writeText( "<td align=\"center\" >") ;
         wb_table4_6_1J2( true) ;
      }
      else
      {
         wb_table4_6_1J2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1J2e( boolean wbgen )
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
         wb_table1_2_1J2e( true) ;
      }
      else
      {
         wb_table1_2_1J2e( false) ;
      }
   }

   public void wb_table4_6_1J2( boolean wbgen )
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
         wb_table5_12_1J2( true) ;
      }
      else
      {
         wb_table5_12_1J2( false) ;
      }
      return  ;
   }

   public void wb_table5_12_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table6_49_1J2( true) ;
      }
      else
      {
         wb_table6_49_1J2( false) ;
      }
      return  ;
   }

   public void wb_table6_49_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:15px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0394"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0394"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0394"+"");
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
         wb_table4_6_1J2e( true) ;
      }
      else
      {
         wb_table4_6_1J2e( false) ;
      }
   }

   public void wb_table6_49_1J2( boolean wbgen )
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
         wb_table7_55_1J2( true) ;
      }
      else
      {
         wb_table7_55_1J2( false) ;
      }
      return  ;
   }

   public void wb_table7_55_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_49_1J2e( true) ;
      }
      else
      {
         wb_table6_49_1J2e( false) ;
      }
   }

   public void wb_table7_55_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         wb_table8_58_1J2( true) ;
      }
      else
      {
         wb_table8_58_1J2( false) ;
      }
      return  ;
   }

   public void wb_table8_58_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table9_173_1J2( true) ;
      }
      else
      {
         wb_table9_173_1J2( false) ;
      }
      return  ;
   }

   public void wb_table9_173_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table10_194_1J2( true) ;
      }
      else
      {
         wb_table10_194_1J2( false) ;
      }
      return  ;
   }

   public void wb_table10_194_1J2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"231\">") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.booltostr( AV19D_GRD_SEL_FLG));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22D_GRD_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_subject_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV21D_GRD_SITE_SNM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_site_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV20D_GRD_SITE_ID));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV14D_GRD_CRF_ID, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV124D_GRD_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV15D_GRD_CRF_SNM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_crf_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( context.getHttpContext().getImagePath( "2f55302b-2ab6-43e9-ba6d-05debb79f883", "", context.getHttpContext().getTheme( ))));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( context.getHttpContext().getImagePath( "9acf486d-2336-4d9b-978f-befb812dbc8f", "", context.getHttpContext().getTheme( ))));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_01_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_02_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_03_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_04_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_05_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_06_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_07_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV18D_GRD_LAST_UPD_DATETIME_VC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_last_upd_datetime_vc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV23D_GRD_UPD_USER_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_upd_user_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_icon_06_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV17D_GRD_DM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_dm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV147D_GRD_SIGN));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_sign_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV16D_GRD_DATA_KOTE));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_data_kote_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 231 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_231 = (short)(nGXsfl_231_idx-1) ;
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
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" colspan=\"2\" >") ;
         wb_table11_311_1J2( true) ;
      }
      else
      {
         wb_table11_311_1J2( false) ;
      }
      return  ;
   }

   public void wb_table11_311_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_55_1J2e( true) ;
      }
      else
      {
         wb_table7_55_1J2e( false) ;
      }
   }

   public void wb_table11_311_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "※一覧のアイコンは右記の権限を示す：", "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_317_1J2( true) ;
      }
      else
      {
         wb_table12_317_1J2( false) ;
      }
      return  ;
   }

   public void wb_table12_317_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_328_1J2( true) ;
      }
      else
      {
         wb_table13_328_1J2( false) ;
      }
      return  ;
   }

   public void wb_table13_328_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_339_1J2( true) ;
      }
      else
      {
         wb_table14_339_1J2( false) ;
      }
      return  ;
   }

   public void wb_table14_339_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_350_1J2( true) ;
      }
      else
      {
         wb_table15_350_1J2( false) ;
      }
      return  ;
   }

   public void wb_table15_350_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:6px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:81px\">") ;
         wb_table16_361_1J2( true) ;
      }
      else
      {
         wb_table16_361_1J2( false) ;
      }
      return  ;
   }

   public void wb_table16_361_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_372_1J2( true) ;
      }
      else
      {
         wb_table17_372_1J2( false) ;
      }
      return  ;
   }

   public void wb_table17_372_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_383_1J2( true) ;
      }
      else
      {
         wb_table18_383_1J2( false) ;
      }
      return  ;
   }

   public void wb_table18_383_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_311_1J2e( true) ;
      }
      else
      {
         wb_table11_311_1J2e( false) ;
      }
   }

   public void wb_table18_383_1J2( boolean wbgen )
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
         wb_table19_386_1J2( true) ;
      }
      else
      {
         wb_table19_386_1J2( false) ;
      }
      return  ;
   }

   public void wb_table19_386_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_07_Internalname, lblTxt_auth_07_Caption, "", "", lblTxt_auth_07_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_383_1J2e( true) ;
      }
      else
      {
         wb_table18_383_1J2e( false) ;
      }
   }

   public void wb_table19_386_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_07_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_07_Internalname, tblTbl_icon_07_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_07_Internalname, lblTxt_icon_07_Caption, "", "", lblTxt_icon_07_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_ss", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_386_1J2e( true) ;
      }
      else
      {
         wb_table19_386_1J2e( false) ;
      }
   }

   public void wb_table17_372_1J2( boolean wbgen )
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
         wb_table20_375_1J2( true) ;
      }
      else
      {
         wb_table20_375_1J2( false) ;
      }
      return  ;
   }

   public void wb_table20_375_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_06_Internalname, lblTxt_auth_06_Caption, "", "", lblTxt_auth_06_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_372_1J2e( true) ;
      }
      else
      {
         wb_table17_372_1J2e( false) ;
      }
   }

   public void wb_table20_375_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_06_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_06_Internalname, tblTbl_icon_06_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_06_Internalname, lblTxt_icon_06_Caption, "", "", lblTxt_icon_06_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_ss", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_375_1J2e( true) ;
      }
      else
      {
         wb_table20_375_1J2e( false) ;
      }
   }

   public void wb_table16_361_1J2( boolean wbgen )
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
         wb_table21_364_1J2( true) ;
      }
      else
      {
         wb_table21_364_1J2( false) ;
      }
      return  ;
   }

   public void wb_table21_364_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_05_Internalname, lblTxt_auth_05_Caption, "", "", lblTxt_auth_05_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_361_1J2e( true) ;
      }
      else
      {
         wb_table16_361_1J2e( false) ;
      }
   }

   public void wb_table21_364_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_05_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_05_Internalname, tblTbl_icon_05_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_05_Internalname, lblTxt_icon_05_Caption, "", "", lblTxt_icon_05_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_ss", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_364_1J2e( true) ;
      }
      else
      {
         wb_table21_364_1J2e( false) ;
      }
   }

   public void wb_table15_350_1J2( boolean wbgen )
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
         wb_table22_353_1J2( true) ;
      }
      else
      {
         wb_table22_353_1J2( false) ;
      }
      return  ;
   }

   public void wb_table22_353_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_04_Internalname, lblTxt_auth_04_Caption, "", "", lblTxt_auth_04_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_350_1J2e( true) ;
      }
      else
      {
         wb_table15_350_1J2e( false) ;
      }
   }

   public void wb_table22_353_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_04_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_04_Internalname, tblTbl_icon_04_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_04_Internalname, lblTxt_icon_04_Caption, "", "", lblTxt_icon_04_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_ss", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_353_1J2e( true) ;
      }
      else
      {
         wb_table22_353_1J2e( false) ;
      }
   }

   public void wb_table14_339_1J2( boolean wbgen )
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
         wb_table23_342_1J2( true) ;
      }
      else
      {
         wb_table23_342_1J2( false) ;
      }
      return  ;
   }

   public void wb_table23_342_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_03_Internalname, lblTxt_auth_03_Caption, "", "", lblTxt_auth_03_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_339_1J2e( true) ;
      }
      else
      {
         wb_table14_339_1J2e( false) ;
      }
   }

   public void wb_table23_342_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_03_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_03_Internalname, tblTbl_icon_03_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_03_Internalname, lblTxt_icon_03_Caption, "", "", lblTxt_icon_03_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_ss", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_342_1J2e( true) ;
      }
      else
      {
         wb_table23_342_1J2e( false) ;
      }
   }

   public void wb_table13_328_1J2( boolean wbgen )
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
         wb_table24_331_1J2( true) ;
      }
      else
      {
         wb_table24_331_1J2( false) ;
      }
      return  ;
   }

   public void wb_table24_331_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_02_Internalname, lblTxt_auth_02_Caption, "", "", lblTxt_auth_02_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_328_1J2e( true) ;
      }
      else
      {
         wb_table13_328_1J2e( false) ;
      }
   }

   public void wb_table24_331_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_02_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_02_Internalname, tblTbl_icon_02_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_02_Internalname, lblTxt_icon_02_Caption, "", "", lblTxt_icon_02_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_ss", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_331_1J2e( true) ;
      }
      else
      {
         wb_table24_331_1J2e( false) ;
      }
   }

   public void wb_table12_317_1J2( boolean wbgen )
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
         wb_table25_320_1J2( true) ;
      }
      else
      {
         wb_table25_320_1J2( false) ;
      }
      return  ;
   }

   public void wb_table25_320_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_01_Internalname, lblTxt_auth_01_Caption, "", "", lblTxt_auth_01_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_317_1J2e( true) ;
      }
      else
      {
         wb_table12_317_1J2e( false) ;
      }
   }

   public void wb_table25_320_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + "background-color: " + WebUtils.getHTMLColor( tblTbl_icon_01_Backcolor) + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_icon_01_Internalname, tblTbl_icon_01_Internalname, "", "TableSymbol", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_icon_01_Internalname, lblTxt_icon_01_Caption, "", "", lblTxt_icon_01_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_ss", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_320_1J2e( true) ;
      }
      else
      {
         wb_table25_320_1J2e( false) ;
      }
   }

   public void wb_table10_194_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:75px\">") ;
         wb_table26_197_1J2( true) ;
      }
      else
      {
         wb_table26_197_1J2( false) ;
      }
      return  ;
   }

   public void wb_table26_197_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table27_203_1J2( true) ;
      }
      else
      {
         wb_table27_203_1J2( false) ;
      }
      return  ;
   }

   public void wb_table27_203_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "患者No", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:110px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "施設", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:197px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "CRF （VISIT番号）", "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:142px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, "入力可能", "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:120px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, "最終更新日時", "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:95px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, "最終更新者", "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "更新時<Br>権限", "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:35px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, "DM着", "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:35px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "署名", "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:35px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, "ﾃﾞｰﾀ固定", "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_194_1J2e( true) ;
      }
      else
      {
         wb_table10_194_1J2e( false) ;
      }
   }

   public void wb_table27_203_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_sign_ok_sel_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_sign_ok_sel_Internalname, tblTbl_sign_ok_sel_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:middle;width:20px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd_all_sign_ok_sel_flg.getInternalname(), GXutil.booltostr( AV183D_GRD_ALL_SIGN_OK_SEL_FLG), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(206, this, 'true', 'false');gx.ajax.executeCliEvent('e331j2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(206);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "署名可能<Br>CRF選択", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:7.0pt; font-weight:normal; font-style:normal;", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(1), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_203_1J2e( true) ;
      }
      else
      {
         wb_table27_203_1J2e( false) ;
      }
   }

   public void wb_table26_197_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd_all_sel_flg.getInternalname(), GXutil.booltostr( AV12D_GRD_ALL_SEL_FLG), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(200, this, 'true', 'false');gx.ajax.executeCliEvent('e321j2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(200);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:35px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "選択", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_197_1J2e( true) ;
      }
      else
      {
         wb_table26_197_1J2e( false) ;
      }
   }

   public void wb_table9_173_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table28_176_1J2( true) ;
      }
      else
      {
         wb_table28_176_1J2( false) ;
      }
      return  ;
   }

   public void wb_table28_176_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, dynavD_sort, dynavD_sort.getInternalname(), GXutil.rtrim( AV27D_SORT), 1, dynavD_sort.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVD_SORT.CLICK."+"'", "svchar", "", 1, 1, 0, (short)(0), 60, "chr", 0, "", "", "Attribute_s", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(187);\"", "", true, "HLP_B712_WP02_RESULT_CRF.htm");
         dynavD_sort.setValue( GXutil.rtrim( AV27D_SORT) );
         httpContext.ajax_rsp_assign_prop("", false, dynavD_sort.getInternalname(), "Values", dynavD_sort.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_173_1J2e( true) ;
      }
      else
      {
         wb_table9_173_1J2e( false) ;
      }
   }

   public void wb_table28_176_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "Overlay表示：", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_ol_disp, cmbavD_ol_disp.getInternalname(), GXutil.rtrim( AV24D_OL_DISP), 1, cmbavD_ol_disp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 40, "chr", 0, "", "", "Attribute_s", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(181);\"", "", true, "HLP_B712_WP02_RESULT_CRF.htm");
         cmbavD_ol_disp.setValue( GXutil.rtrim( AV24D_OL_DISP) );
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
         wb_table28_176_1J2e( true) ;
      }
      else
      {
         wb_table28_176_1J2e( false) ;
      }
   }

   public void wb_table8_58_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table29_61_1J2( true) ;
      }
      else
      {
         wb_table29_61_1J2( false) ;
      }
      return  ;
   }

   public void wb_table29_61_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table30_81_1J2( true) ;
      }
      else
      {
         wb_table30_81_1J2( false) ;
      }
      return  ;
   }

   public void wb_table30_81_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_58_1J2e( true) ;
      }
      else
      {
         wb_table8_58_1J2e( false) ;
      }
   }

   public void wb_table30_81_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table31_87_1J2( true) ;
      }
      else
      {
         wb_table31_87_1J2( false) ;
      }
      return  ;
   }

   public void wb_table31_87_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table30_81_1J2e( true) ;
      }
      else
      {
         wb_table30_81_1J2e( false) ;
      }
   }

   public void wb_table31_87_1J2( boolean wbgen )
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
         wb_table32_90_1J2( true) ;
      }
      else
      {
         wb_table32_90_1J2( false) ;
      }
      return  ;
   }

   public void wb_table32_90_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table33_96_1J2( true) ;
      }
      else
      {
         wb_table33_96_1J2( false) ;
      }
      return  ;
   }

   public void wb_table33_96_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table34_102_1J2( true) ;
      }
      else
      {
         wb_table34_102_1J2( false) ;
      }
      return  ;
   }

   public void wb_table34_102_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table35_108_1J2( true) ;
      }
      else
      {
         wb_table35_108_1J2( false) ;
      }
      return  ;
   }

   public void wb_table35_108_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table36_114_1J2( true) ;
      }
      else
      {
         wb_table36_114_1J2( false) ;
      }
      return  ;
   }

   public void wb_table36_114_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table37_120_1J2( true) ;
      }
      else
      {
         wb_table37_120_1J2( false) ;
      }
      return  ;
   }

   public void wb_table37_120_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table38_126_1J2( true) ;
      }
      else
      {
         wb_table38_126_1J2( false) ;
      }
      return  ;
   }

   public void wb_table38_126_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table39_132_1J2( true) ;
      }
      else
      {
         wb_table39_132_1J2( false) ;
      }
      return  ;
   }

   public void wb_table39_132_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table40_138_1J2( true) ;
      }
      else
      {
         wb_table40_138_1J2( false) ;
      }
      return  ;
   }

   public void wb_table40_138_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table41_144_1J2( true) ;
      }
      else
      {
         wb_table41_144_1J2( false) ;
      }
      return  ;
   }

   public void wb_table41_144_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table42_150_1J2( true) ;
      }
      else
      {
         wb_table42_150_1J2( false) ;
      }
      return  ;
   }

   public void wb_table42_150_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table43_156_1J2( true) ;
      }
      else
      {
         wb_table43_156_1J2( false) ;
      }
      return  ;
   }

   public void wb_table43_156_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table44_162_1J2( true) ;
      }
      else
      {
         wb_table44_162_1J2( false) ;
      }
      return  ;
   }

   public void wb_table44_162_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table45_168_1J2( true) ;
      }
      else
      {
         wb_table45_168_1J2( false) ;
      }
      return  ;
   }

   public void wb_table45_168_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table31_87_1J2e( true) ;
      }
      else
      {
         wb_table31_87_1J2e( false) ;
      }
   }

   public void wb_table45_168_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table45_168_1J2e( true) ;
      }
      else
      {
         wb_table45_168_1J2e( false) ;
      }
   }

   public void wb_table44_162_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table44_162_1J2e( true) ;
      }
      else
      {
         wb_table44_162_1J2e( false) ;
      }
   }

   public void wb_table43_156_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table43_156_1J2e( true) ;
      }
      else
      {
         wb_table43_156_1J2e( false) ;
      }
   }

   public void wb_table42_150_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table42_150_1J2e( true) ;
      }
      else
      {
         wb_table42_150_1J2e( false) ;
      }
   }

   public void wb_table41_144_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table41_144_1J2e( true) ;
      }
      else
      {
         wb_table41_144_1J2e( false) ;
      }
   }

   public void wb_table40_138_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table40_138_1J2e( true) ;
      }
      else
      {
         wb_table40_138_1J2e( false) ;
      }
   }

   public void wb_table39_132_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table39_132_1J2e( true) ;
      }
      else
      {
         wb_table39_132_1J2e( false) ;
      }
   }

   public void wb_table38_126_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table38_126_1J2e( true) ;
      }
      else
      {
         wb_table38_126_1J2e( false) ;
      }
   }

   public void wb_table37_120_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table37_120_1J2e( true) ;
      }
      else
      {
         wb_table37_120_1J2e( false) ;
      }
   }

   public void wb_table36_114_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table36_114_1J2e( true) ;
      }
      else
      {
         wb_table36_114_1J2e( false) ;
      }
   }

   public void wb_table35_108_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table35_108_1J2e( true) ;
      }
      else
      {
         wb_table35_108_1J2e( false) ;
      }
   }

   public void wb_table34_102_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table34_102_1J2e( true) ;
      }
      else
      {
         wb_table34_102_1J2e( false) ;
      }
   }

   public void wb_table33_96_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table33_96_1J2e( true) ;
      }
      else
      {
         wb_table33_96_1J2e( false) ;
      }
   }

   public void wb_table32_90_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table32_90_1J2e( true) ;
      }
      else
      {
         wb_table32_90_1J2e( false) ;
      }
   }

   public void wb_table29_61_1J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable13_Internalname, tblTable13_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:80px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "CRFフィルタ", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:150px\">") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_group, cmbavD_group.getInternalname(), GXutil.trim( GXutil.str( AV141D_GROUP, 4, 0)), 1, cmbavD_group.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVD_GROUP.CLICK."+"'", "int", "", 1, 1, 0, (short)(0), 140, "px", 0, "", "", "Attribute_s", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(66);\"", "", true, "HLP_B712_WP02_RESULT_CRF.htm");
         cmbavD_group.setValue( GXutil.trim( GXutil.str( AV141D_GROUP, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_group.getInternalname(), "Values", cmbavD_group.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:80px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, "患者ID選択", "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:190px\">") ;
         wb_table46_70_1J2( true) ;
      }
      else
      {
         wb_table46_70_1J2( false) ;
      }
      return  ;
   }

   public void wb_table46_70_1J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "※カンマ区切りで複数指定可能", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_ss", 0, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table29_61_1J2e( true) ;
      }
      else
      {
         wb_table29_61_1J2e( false) ;
      }
   }

   public void wb_table46_70_1J2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_231_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_subject_id_Internalname, GXutil.rtrim( AV142D_SUBJECT_ID), GXutil.rtrim( localUtil.format( AV142D_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_subject_id_Jsonclick, 0, "AttributeImeOff_s", "", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\"  style=\"width:45px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_sub_id_exec_Internalname, "実行", "", "", lblBtn_sub_id_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SUBJECT_ID_SEL\\'."+"'", "", "TextBlockBtn040s", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table46_70_1J2e( true) ;
      }
      else
      {
         wb_table46_70_1J2e( false) ;
      }
   }

   public void wb_table5_12_1J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_crf_open_Internalname, "CRFを開く", "", "", lblBtn_crf_open_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CRF_OPEN\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"4\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_chg_reki_Internalname, "変更履歴", "", "", lblBtn_chg_reki_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CHG_REKI\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_ssai_hyoj_Internalname, "詳細表示", "", "", lblBtn_ssai_hyoj_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SSAI_HYOJ\\'."+"'", "", "TextBlockBtn080", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_pdf_out_Internalname, "PDF出力", "", "", lblBtn_pdf_out_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_PDF_OUT\\'."+"'", "", "TextBlockBtn080", 5, "", lblBtn_pdf_out_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:30px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_crf_teisyutu_Internalname, "CRF提出", "", "", lblBtn_crf_teisyutu_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CRF_TEISYUTU\\'."+"'", "", "TextBlockBtn080", 5, "", lblBtn_crf_teisyutu_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_dm_kaijo_Internalname, "DM到着解除", "", "", lblBtn_dm_kaijo_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DM_KAIJO\\'."+"'", "", "TextBlockBtn080", 5, "", lblBtn_dm_kaijo_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_data_kotei_Internalname, "データ固定", "", "", lblBtn_data_kotei_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DATA_KTEI\\'."+"'", "", "TextBlockBtn080", 5, "", lblBtn_data_kotei_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_crf_del_Internalname, "CRF削除", "", "", lblBtn_crf_del_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CRF_DEL\\'."+"'", "", "TextBlockBtn080", 5, "", lblBtn_crf_del_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_csv_out_Internalname, "CSV出力", "", "", lblBtn_csv_out_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV_OUT\\'."+"'", "", "TextBlockBtn080", 5, "", lblBtn_csv_out_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:8px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_sign_Internalname, "署名", "", "", lblBtn_sign_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SIGN\\'."+"'", "", "TextBlockBtn080", 5, "", lblBtn_sign_Visible, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:32px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_search_back_Internalname, "検索条件に戻る", "", "", lblBtn_search_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SEARCH_BACK\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B712_WP02_RESULT_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_1J2e( true) ;
      }
      else
      {
         wb_table5_12_1J2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
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
      pa1J2( ) ;
      ws1J2( ) ;
      we1J2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2021579583579");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b712_wp02_result_crf.js", "?2021579583582");
      /* End function include_jscripts */
   }

   public void subsflControlProps_2312( )
   {
      chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_231_idx );
      edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_231_idx ;
      edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_231_idx ;
      edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_231_idx ;
      edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_231_idx ;
      edtavD_grd_crf_eda_no_Internalname = "vD_GRD_CRF_EDA_NO_"+sGXsfl_231_idx ;
      edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_231_idx ;
      imgBtn_repeat_Internalname = "BTN_REPEAT_"+sGXsfl_231_idx ;
      imgBtn_repeat_del_Internalname = "BTN_REPEAT_DEL_"+sGXsfl_231_idx ;
      lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_231_idx ;
      lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_231_idx ;
      lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_231_idx ;
      lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_231_idx ;
      lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_231_idx ;
      lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_231_idx ;
      lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_231_idx ;
      edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_231_idx ;
      edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_231_idx ;
      lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_231_idx ;
      edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_231_idx ;
      edtavD_grd_sign_Internalname = "vD_GRD_SIGN_"+sGXsfl_231_idx ;
      edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_231_idx ;
   }

   public void subsflControlProps_fel_2312( )
   {
      chkavD_grd_sel_flg.setInternalname( "vD_GRD_SEL_FLG_"+sGXsfl_231_fel_idx );
      edtavD_grd_subject_id_Internalname = "vD_GRD_SUBJECT_ID_"+sGXsfl_231_fel_idx ;
      edtavD_grd_site_snm_Internalname = "vD_GRD_SITE_SNM_"+sGXsfl_231_fel_idx ;
      edtavD_grd_site_id_Internalname = "vD_GRD_SITE_ID_"+sGXsfl_231_fel_idx ;
      edtavD_grd_crf_id_Internalname = "vD_GRD_CRF_ID_"+sGXsfl_231_fel_idx ;
      edtavD_grd_crf_eda_no_Internalname = "vD_GRD_CRF_EDA_NO_"+sGXsfl_231_fel_idx ;
      edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_231_fel_idx ;
      imgBtn_repeat_Internalname = "BTN_REPEAT_"+sGXsfl_231_fel_idx ;
      imgBtn_repeat_del_Internalname = "BTN_REPEAT_DEL_"+sGXsfl_231_fel_idx ;
      lblTxt_grd_kngn_01_Internalname = "TXT_GRD_KNGN_01_"+sGXsfl_231_fel_idx ;
      lblTxt_grd_kngn_02_Internalname = "TXT_GRD_KNGN_02_"+sGXsfl_231_fel_idx ;
      lblTxt_grd_kngn_03_Internalname = "TXT_GRD_KNGN_03_"+sGXsfl_231_fel_idx ;
      lblTxt_grd_kngn_04_Internalname = "TXT_GRD_KNGN_04_"+sGXsfl_231_fel_idx ;
      lblTxt_grd_kngn_05_Internalname = "TXT_GRD_KNGN_05_"+sGXsfl_231_fel_idx ;
      lblTxt_grd_kngn_06_Internalname = "TXT_GRD_KNGN_06_"+sGXsfl_231_fel_idx ;
      lblTxt_grd_kngn_07_Internalname = "TXT_GRD_KNGN_07_"+sGXsfl_231_fel_idx ;
      edtavD_grd_last_upd_datetime_vc_Internalname = "vD_GRD_LAST_UPD_DATETIME_VC_"+sGXsfl_231_fel_idx ;
      edtavD_grd_upd_user_nm_Internalname = "vD_GRD_UPD_USER_NM_"+sGXsfl_231_fel_idx ;
      lblTxt_grd_upd_kngn_Internalname = "TXT_GRD_UPD_KNGN_"+sGXsfl_231_fel_idx ;
      edtavD_grd_dm_Internalname = "vD_GRD_DM_"+sGXsfl_231_fel_idx ;
      edtavD_grd_sign_Internalname = "vD_GRD_SIGN_"+sGXsfl_231_fel_idx ;
      edtavD_grd_data_kote_Internalname = "vD_GRD_DATA_KOTE_"+sGXsfl_231_fel_idx ;
   }

   public void sendrow_2312( )
   {
      subsflControlProps_2312( ) ;
      wb1J0( ) ;
      if ( ( 15 * 1 == 0 ) || ( nGXsfl_231_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_231_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_231_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_231_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_231_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_231_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:75px\""});
         /* Check box */
         TempTags = " " + ((chkavD_grd_sel_flg.getEnabled()!=0)&&(chkavD_grd_sel_flg.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 234,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavD_grd_sel_flg.getInternalname(),GXutil.booltostr( AV19D_GRD_SEL_FLG),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavD_grd_sel_flg.getEnabled()!=0)&&(chkavD_grd_sel_flg.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(234, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd_sel_flg.getEnabled()!=0)&&(chkavD_grd_sel_flg.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(234);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_subject_id_Enabled!=0)&&(edtavD_grd_subject_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 236,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_subject_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV22D_GRD_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")),((edtavD_grd_subject_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22D_GRD_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV22D_GRD_SUBJECT_ID), "ZZZZZ9")),TempTags+((edtavD_grd_subject_id_Enabled!=0)&&(edtavD_grd_subject_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_subject_id_Enabled!=0)&&(edtavD_grd_subject_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(236);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_subject_id_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_subject_id_Enabled),new Integer(0),"text","",new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:110px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_site_snm_Enabled!=0)&&(edtavD_grd_site_snm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 238,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_site_snm_Internalname,GXutil.rtrim( AV21D_GRD_SITE_SNM),"",TempTags+((edtavD_grd_site_snm_Enabled!=0)&&(edtavD_grd_site_snm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_site_snm_Enabled!=0)&&(edtavD_grd_site_snm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(238);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_site_snm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_site_snm_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd_hidden_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_grd_hidden_Visible),"TableHidden","","","","","","",new Integer(1),new Integer(2),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_site_id_Enabled!=0)&&(edtavD_grd_site_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 242,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_site_id_Internalname,GXutil.rtrim( AV20D_GRD_SITE_ID),"",TempTags+((edtavD_grd_site_id_Enabled!=0)&&(edtavD_grd_site_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_site_id_Enabled!=0)&&(edtavD_grd_site_id_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(242);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_site_id_Jsonclick,new Integer(0),"Attribute","color:#FF0000;",ROClassString,"",new Integer(1),new Integer(1),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_crf_id_Enabled!=0)&&(edtavD_grd_crf_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 243,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV14D_GRD_CRF_ID, (byte)(4), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14D_GRD_CRF_ID), "ZZZ9")),TempTags+((edtavD_grd_crf_id_Enabled!=0)&&(edtavD_grd_crf_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_crf_id_Enabled!=0)&&(edtavD_grd_crf_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(243);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_crf_id_Jsonclick,new Integer(0),"Attribute_s","color:#FF0000;",ROClassString,"",new Integer(1),new Integer(1),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_crf_eda_no_Enabled!=0)&&(edtavD_grd_crf_eda_no_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 244,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_crf_eda_no_Internalname,GXutil.ltrim( localUtil.ntoc( AV124D_GRD_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV124D_GRD_CRF_EDA_NO), "Z9")),TempTags+((edtavD_grd_crf_eda_no_Enabled!=0)&&(edtavD_grd_crf_eda_no_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_crf_eda_no_Enabled!=0)&&(edtavD_grd_crf_eda_no_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(244);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_crf_eda_no_Jsonclick,new Integer(0),"Attribute","color:#FF0000;",ROClassString,"",new Integer(1),new Integer(1),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_CRF_EDA_NO","right"});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:155px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 246,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_crf_snm_Internalname,GXutil.rtrim( AV15D_GRD_CRF_SNM),"",TempTags+((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(246);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_crf_snm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_crf_snm_Enabled),new Integer(0),"text","",new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:37px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_repeat_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_repeat_Visible),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:18px\""});
         /* Active images/pictures */
         TempTags = " " + ((imgBtn_repeat_Enabled!=0)&&(imgBtn_repeat_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" : " ") ;
         ClassString = "Image" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgBtn_repeat_Internalname,context.getHttpContext().getImagePath( "2f55302b-2ab6-43e9-ba6d-05debb79f883", "", context.getHttpContext().getTheme( )),"","","",context.getHttpContext().getTheme( ),new Integer(imgBtn_repeat_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(18),"px",new Integer(22),"px",new Integer(0),new Integer(0),new Integer(5),imgBtn_repeat_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_REPEAT\\'."+"'",StyleString,ClassString,"","","",""+TempTags,"","",new Integer(1),new Boolean(false),new Boolean(false)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:18px\""});
         /* Active images/pictures */
         TempTags = " " + ((imgBtn_repeat_del_Enabled!=0)&&(imgBtn_repeat_del_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 253,'',false,'',0)\"" : " ") ;
         ClassString = "Image" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgBtn_repeat_del_Internalname,context.getHttpContext().getImagePath( "9acf486d-2336-4d9b-978f-befb812dbc8f", "", context.getHttpContext().getTheme( )),"","","",context.getHttpContext().getTheme( ),new Integer(imgBtn_repeat_del_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(18),"px",new Integer(22),"px",new Integer(0),new Integer(0),new Integer(5),imgBtn_repeat_del_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_REPEAT_DEL\\'."+"'",StyleString,ClassString,"","","",""+TempTags,"","",new Integer(1),new Boolean(false),new Boolean(false)});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:142px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable5_Internalname+"_"+sGXsfl_231_idx,new Integer(1),"TableBase","","","","","","",new Integer(0),new Integer(1),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:18px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_01_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_grd_kngn_01_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_01_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_01_Internalname,lblTxt_grd_kngn_01_Caption,"","",lblTxt_grd_kngn_01_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock_ss",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:18px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_02_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_grd_kngn_02_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_02_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_02_Internalname,lblTxt_grd_kngn_02_Caption,"","",lblTxt_grd_kngn_02_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock_ss",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:18px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_03_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_grd_kngn_03_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_03_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_03_Internalname,lblTxt_grd_kngn_03_Caption,"","",lblTxt_grd_kngn_03_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock_ss",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:18px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_04_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_grd_kngn_04_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_04_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_04_Internalname,lblTxt_grd_kngn_04_Caption,"","",lblTxt_grd_kngn_04_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock_ss",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:18px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_05_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_grd_kngn_05_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_05_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_05_Internalname,lblTxt_grd_kngn_05_Caption,"","",lblTxt_grd_kngn_05_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock_ss",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:18px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_06_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_grd_kngn_06_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_06_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_06_Internalname,lblTxt_grd_kngn_06_Caption,"","",lblTxt_grd_kngn_06_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock_ss",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:18px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd_kngn_07_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_grd_kngn_07_Visible),"TableSymbol","",new Integer(tblTbl_grd_kngn_07_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_grd_kngn_07_Internalname,lblTxt_grd_kngn_07_Caption,"","",lblTxt_grd_kngn_07_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock_ss",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:120px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_last_upd_datetime_vc_Enabled!=0)&&(edtavD_grd_last_upd_datetime_vc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 293,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_last_upd_datetime_vc_Internalname,GXutil.rtrim( AV18D_GRD_LAST_UPD_DATETIME_VC),"",TempTags+((edtavD_grd_last_upd_datetime_vc_Enabled!=0)&&(edtavD_grd_last_upd_datetime_vc_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_last_upd_datetime_vc_Enabled!=0)&&(edtavD_grd_last_upd_datetime_vc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(293);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_last_upd_datetime_vc_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_last_upd_datetime_vc_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:95px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_upd_user_nm_Enabled!=0)&&(edtavD_grd_upd_user_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 295,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_upd_user_nm_Internalname,GXutil.rtrim( AV23D_GRD_UPD_USER_NM),"",TempTags+((edtavD_grd_upd_user_nm_Enabled!=0)&&(edtavD_grd_upd_user_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_upd_user_nm_Enabled!=0)&&(edtavD_grd_upd_user_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(295);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_upd_user_nm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_upd_user_nm_Enabled),new Integer(0),"text","",new Integer(30),"chr",new Integer(1),"row",new Integer(30),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd_upd_kngn_Internalname+"_"+sGXsfl_231_idx,new Integer(tblTbl_grd_upd_kngn_Visible),"TableSymbol","",new Integer(tblTbl_grd_upd_kngn_Backcolor),"","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_grd_upd_kngn_Internalname,lblTxt_grd_upd_kngn_Caption,"","",lblTxt_grd_upd_kngn_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock_ss",new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:35px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_dm_Enabled!=0)&&(edtavD_grd_dm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 302,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_dm_Internalname,GXutil.rtrim( AV17D_GRD_DM),"",TempTags+((edtavD_grd_dm_Enabled!=0)&&(edtavD_grd_dm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_dm_Enabled!=0)&&(edtavD_grd_dm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(302);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_dm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_dm_Enabled),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:35px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_sign_Enabled!=0)&&(edtavD_grd_sign_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 304,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_sign_Internalname,GXutil.rtrim( AV147D_GRD_SIGN),"",TempTags+((edtavD_grd_sign_Enabled!=0)&&(edtavD_grd_sign_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_sign_Enabled!=0)&&(edtavD_grd_sign_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(304);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_sign_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_sign_Enabled),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:35px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_data_kote_Enabled!=0)&&(edtavD_grd_data_kote_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 306,'',false,'"+sGXsfl_231_idx+"',231)\"" : " ") ;
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_data_kote_Internalname,GXutil.rtrim( AV16D_GRD_DATA_KOTE),"",TempTags+((edtavD_grd_data_kote_Enabled!=0)&&(edtavD_grd_data_kote_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_data_kote_Enabled!=0)&&(edtavD_grd_data_kote_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(306);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_data_kote_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_data_kote_Enabled),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(231),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
               if ( ((int)((nGXsfl_231_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_231_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_231_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_231_idx+1)) ;
         sGXsfl_231_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_231_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_2312( ) ;
      }
      /* End function sendrow_2312 */
   }

   public void init_default_properties( )
   {
      lblBtn_crf_open_Internalname = "BTN_CRF_OPEN" ;
      lblBtn_chg_reki_Internalname = "BTN_CHG_REKI" ;
      lblBtn_ssai_hyoj_Internalname = "BTN_SSAI_HYOJ" ;
      lblBtn_pdf_out_Internalname = "BTN_PDF_OUT" ;
      lblBtn_crf_teisyutu_Internalname = "BTN_CRF_TEISYUTU" ;
      lblBtn_dm_kaijo_Internalname = "BTN_DM_KAIJO" ;
      lblBtn_data_kotei_Internalname = "BTN_DATA_KOTEI" ;
      lblBtn_crf_del_Internalname = "BTN_CRF_DEL" ;
      lblBtn_csv_out_Internalname = "BTN_CSV_OUT" ;
      lblBtn_sign_Internalname = "BTN_SIGN" ;
      lblBtn_search_back_Internalname = "BTN_SEARCH_BACK" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      cmbavD_group.setInternalname( "vD_GROUP" );
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtavD_subject_id_Internalname = "vD_SUBJECT_ID" ;
      lblBtn_sub_id_exec_Internalname = "BTN_SUB_ID_EXEC" ;
      tblTable11_Internalname = "TABLE11" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      tblTable13_Internalname = "TABLE13" ;
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
      tblTable7_Internalname = "TABLE7" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      cmbavD_ol_disp.setInternalname( "vD_OL_DISP" );
      tblTbl_ol_disp_Internalname = "TBL_OL_DISP" ;
      dynavD_sort.setInternalname( "vD_SORT" );
      tblTable9_Internalname = "TABLE9" ;
      chkavD_grd_all_sel_flg.setInternalname( "vD_GRD_ALL_SEL_FLG" );
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      tblTable10_Internalname = "TABLE10" ;
      chkavD_grd_all_sign_ok_sel_flg.setInternalname( "vD_GRD_ALL_SIGN_OK_SEL_FLG" );
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_sign_ok_sel_Internalname = "TBL_SIGN_OK_SEL" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTbl_grd_hidden_Internalname = "TBL_GRD_HIDDEN" ;
      tblTbl_repeat_Internalname = "TBL_REPEAT" ;
      tblTbl_grd_kngn_01_Internalname = "TBL_GRD_KNGN_01" ;
      tblTbl_grd_kngn_02_Internalname = "TBL_GRD_KNGN_02" ;
      tblTbl_grd_kngn_03_Internalname = "TBL_GRD_KNGN_03" ;
      tblTbl_grd_kngn_04_Internalname = "TBL_GRD_KNGN_04" ;
      tblTbl_grd_kngn_05_Internalname = "TBL_GRD_KNGN_05" ;
      tblTbl_grd_kngn_06_Internalname = "TBL_GRD_KNGN_06" ;
      tblTbl_grd_kngn_07_Internalname = "TBL_GRD_KNGN_07" ;
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
      tblTable6_Internalname = "TABLE6" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_btn_crf_del_exec_Internalname = "TXT_BTN_CRF_DEL_EXEC" ;
      lblTxt_btn_data_ktei_exec_Internalname = "TXT_BTN_DATA_KTEI_EXEC" ;
      lblTxt_btn_sign_exec_Internalname = "TXT_BTN_SIGN_EXEC" ;
      lblTxt_btn_dm_kaijo_exec_Internalname = "TXT_BTN_DM_KAIJO_EXEC" ;
      lblTxt_btn_pdf_out_exec_Internalname = "TXT_BTN_PDF_OUT_EXEC" ;
      lblTxt_btn_pdf_out_his_exec_Internalname = "TXT_BTN_PDF_OUT_HIS_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_subject_id_Internalname = "vH_SUBJECT_ID" ;
      edtavH_input_end_flg_sv_Internalname = "vH_INPUT_END_FLG_SV" ;
      edtavH_sel_tbt02_crf_id_Internalname = "vH_SEL_TBT02_CRF_ID" ;
      edtavH_sel_tbt02_crf_eda_no_Internalname = "vH_SEL_TBT02_CRF_EDA_NO" ;
      edtavH_sel_tbt02_subject_id_Internalname = "vH_SEL_TBT02_SUBJECT_ID" ;
      edtavH_sel_tbt02_upd_cnt_Internalname = "vH_SEL_TBT02_UPD_CNT" ;
      edtavH_device_Internalname = "vH_DEVICE" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      edtavH_msg_rep_Internalname = "vH_MSG_REP" ;
      edtavCtltbt02_subject_id_Internalname = "CTLTBT02_SUBJECT_ID" ;
      edtavW_pdf_cnt_Internalname = "vW_PDF_CNT" ;
      edtavW_zip_file_path_Internalname = "vW_ZIP_FILE_PATH" ;
      edtavW_zip_filename_Internalname = "vW_ZIP_FILENAME" ;
      edtavW_pdf_err_cd_Internalname = "vW_PDF_ERR_CD" ;
      edtavW_pdf_err_msg_Internalname = "vW_PDF_ERR_MSG" ;
      edtavH_popup_kbn_Internalname = "vH_POPUP_KBN" ;
      edtavH_popup_err_cd_Internalname = "vH_POPUP_ERR_CD" ;
      lblTxt_btn_crf_teisyutu_exec_Internalname = "TXT_BTN_CRF_TEISYUTU_EXEC" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavH_b712_wp05_ok_Internalname = "vH_B712_WP05_OK" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtavH_b712_wp05_signature_chk_Internalname = "vH_B712_WP05_SIGNATURE_CHK" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtavH_b712_wp05_signature_user_id_Internalname = "vH_B712_WP05_SIGNATURE_USER_ID" ;
      tblTable8_Internalname = "TABLE8" ;
      edtavH_sel_pdf_cd_Internalname = "vH_SEL_PDF_CD" ;
      edtavH_sel_csv_cd_Internalname = "vH_SEL_CSV_CD" ;
      lblTxt_btn_csv_out_exec_sign_Internalname = "TXT_BTN_CSV_OUT_EXEC_SIGN" ;
      lblTxt_btn_csv_out_exec_dm_Internalname = "TXT_BTN_CSV_OUT_EXEC_DM" ;
      lblTxt_btn_csv_out_exec_all_Internalname = "TXT_BTN_CSV_OUT_EXEC_ALL" ;
      lblTxt_btn_csv_out_exec_ktei_Internalname = "TXT_BTN_CSV_OUT_EXEC_KTEI" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_grd_data_kote_Jsonclick = "" ;
      edtavD_grd_data_kote_Visible = 1 ;
      edtavD_grd_sign_Jsonclick = "" ;
      edtavD_grd_sign_Visible = 1 ;
      edtavD_grd_dm_Jsonclick = "" ;
      edtavD_grd_dm_Visible = 1 ;
      lblTxt_grd_upd_kngn_Caption = "D" ;
      edtavD_grd_upd_user_nm_Jsonclick = "" ;
      edtavD_grd_upd_user_nm_Visible = 1 ;
      edtavD_grd_last_upd_datetime_vc_Jsonclick = "" ;
      edtavD_grd_last_upd_datetime_vc_Visible = 1 ;
      lblTxt_grd_kngn_07_Caption = "モ" ;
      lblTxt_grd_kngn_06_Caption = "D" ;
      lblTxt_grd_kngn_05_Caption = "事" ;
      lblTxt_grd_kngn_04_Caption = "施" ;
      lblTxt_grd_kngn_03_Caption = "研" ;
      lblTxt_grd_kngn_02_Caption = "C" ;
      lblTxt_grd_kngn_01_Caption = "作" ;
      imgBtn_repeat_del_Visible = 1 ;
      imgBtn_repeat_Visible = 1 ;
      edtavD_grd_crf_snm_Jsonclick = "" ;
      edtavD_grd_crf_snm_Visible = 1 ;
      edtavD_grd_crf_eda_no_Jsonclick = "" ;
      edtavD_grd_crf_eda_no_Visible = 1 ;
      edtavD_grd_crf_eda_no_Enabled = 1 ;
      edtavD_grd_crf_id_Jsonclick = "" ;
      edtavD_grd_crf_id_Visible = 1 ;
      edtavD_grd_crf_id_Enabled = 1 ;
      edtavD_grd_site_id_Jsonclick = "" ;
      edtavD_grd_site_id_Visible = 1 ;
      edtavD_grd_site_id_Enabled = 1 ;
      edtavD_grd_site_snm_Jsonclick = "" ;
      edtavD_grd_site_snm_Visible = 1 ;
      edtavD_grd_subject_id_Jsonclick = "" ;
      edtavD_grd_subject_id_Visible = 1 ;
      chkavD_grd_sel_flg.setVisible( 1 );
      chkavD_grd_sel_flg.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      lblBtn_sign_Visible = 1 ;
      lblBtn_csv_out_Visible = 1 ;
      lblBtn_crf_del_Visible = 1 ;
      lblBtn_data_kotei_Visible = 1 ;
      lblBtn_dm_kaijo_Visible = 1 ;
      lblBtn_crf_teisyutu_Visible = 1 ;
      lblBtn_pdf_out_Visible = 1 ;
      edtavD_subject_id_Jsonclick = "" ;
      cmbavD_group.setJsonclick( "" );
      cmbavD_ol_disp.setJsonclick( "" );
      dynavD_sort.setJsonclick( "" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd_data_kote_Enabled = 1 ;
      edtavD_grd_sign_Enabled = 1 ;
      edtavD_grd_dm_Enabled = 1 ;
      edtavD_grd_upd_user_nm_Enabled = 1 ;
      edtavD_grd_last_upd_datetime_vc_Enabled = 1 ;
      lblTxt_icon_07_Caption = "モ" ;
      lblTxt_icon_06_Caption = "D" ;
      lblTxt_icon_05_Caption = "事" ;
      lblTxt_icon_04_Caption = "施" ;
      lblTxt_icon_03_Caption = "研" ;
      lblTxt_icon_02_Caption = "C" ;
      lblTxt_icon_01_Caption = "作" ;
      edtavD_grd_crf_snm_Enabled = 1 ;
      edtavD_grd_site_snm_Enabled = 1 ;
      edtavD_grd_subject_id_Enabled = 1 ;
      edtavH_b712_wp05_signature_user_id_Jsonclick = "" ;
      edtavH_b712_wp05_signature_chk_Jsonclick = "" ;
      edtavH_b712_wp05_ok_Jsonclick = "" ;
      edtavH_sel_csv_cd_Jsonclick = "" ;
      edtavH_sel_pdf_cd_Jsonclick = "" ;
      edtavH_popup_err_cd_Jsonclick = "" ;
      edtavH_popup_kbn_Jsonclick = "" ;
      edtavW_pdf_err_msg_Jsonclick = "" ;
      edtavW_pdf_err_cd_Jsonclick = "" ;
      edtavW_zip_filename_Jsonclick = "" ;
      edtavW_zip_file_path_Jsonclick = "" ;
      edtavW_pdf_cnt_Jsonclick = "" ;
      edtavCtltbt02_subject_id_Jsonclick = "" ;
      edtavH_msg_rep_Jsonclick = "" ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_device_Jsonclick = "" ;
      edtavH_sel_tbt02_upd_cnt_Jsonclick = "" ;
      edtavH_sel_tbt02_subject_id_Jsonclick = "" ;
      edtavH_sel_tbt02_crf_eda_no_Jsonclick = "" ;
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
      tblTbl_icon_info_07_Visible = 1 ;
      tblTbl_icon_info_06_Visible = 1 ;
      tblTbl_icon_info_05_Visible = 1 ;
      tblTbl_icon_info_04_Visible = 1 ;
      tblTbl_icon_info_03_Visible = 1 ;
      tblTbl_icon_info_02_Visible = 1 ;
      tblTbl_icon_info_01_Visible = 1 ;
      tblTbl_sign_ok_sel_Visible = 1 ;
      tblTbl_ol_disp_Visible = 1 ;
      tblTbl_grd_upd_kngn_Backcolor = (int)(0x000000) ;
      tblTbl_grd_upd_kngn_Visible = 1 ;
      tblTbl_grd_kngn_07_Visible = 1 ;
      tblTbl_grd_kngn_06_Visible = 1 ;
      tblTbl_grd_kngn_05_Visible = 1 ;
      tblTbl_grd_kngn_04_Visible = 1 ;
      tblTbl_grd_kngn_03_Visible = 1 ;
      tblTbl_grd_kngn_02_Visible = 1 ;
      tblTbl_grd_kngn_01_Visible = 1 ;
      tblTbl_repeat_Visible = 1 ;
      tblTbl_grd_hidden_Visible = 1 ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
      chkavD_grd_all_sign_ok_sel_flg.setCaption( "" );
      chkavD_grd_all_sel_flg.setCaption( "" );
      subGrid1_Rows = 15 ;
      httpContext.GX_msglist.setDisplaymode( (short)(2) );
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
                  /* Execute user subroutine: S352 */
                  S352 ();
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
      AV30H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV132W_B712_SD09_CRF_ADD = new SdtB712_SD09_CRF_ADD(remoteHandle, context);
      AV193Pgmname = "" ;
      A7TAS01_DATA_KIND = "" ;
      A300TAS01_DEL_FLG = "" ;
      A336TAS01_CHAR_1 = "" ;
      A9TAS01_ITEM_NM = "" ;
      A982TBM45_DEL_FLG = "" ;
      A980TBM45_FILETR_NM = "" ;
      AV10D_B712_SD06_RESULT_CRF = new GxObjectCollection(SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem.class, "B712_SD06_RESULT_CRF.B712_SD06_RESULT_CRFItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV42P_AUTH_CD = "" ;
      AV55W_A821_JS = "" ;
      AV162W_SESSION_KEY_SUBJECT_CRF = "" ;
      AV106W_TBM01_CRC_VALUE = "" ;
      AV108W_TBM01_RESEARCHER_VALUE = "" ;
      AV110W_TBM01_SITE_MG_VALUE = "" ;
      AV107W_TBM01_DM_VALUE = "" ;
      AV109W_TBM01_SAGYOJOHO_VALUE = "" ;
      AV180W_TBM01_JIMU_VALUE = "" ;
      AV181W_TBM01_MONITOR_VALUE = "" ;
      AV61W_B712_SD05_SEL4 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV57W_B712_SD05_SEL_W = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV49SD_B712_SD08_ICON_INFO = new GxObjectCollection(SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem.class, "B712_SD08_ICON_INFO.B712_SD08_ICON_INFOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV47SD_B712_SD07_INPUT_DISP = new GxObjectCollection(SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem.class, "B712_SD07_INPUT_DISP.B712_SD07_INPUT_DISPItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV59W_B712_SD05_SEL2 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV164W_GET_SUBJECT_ID_VC = "" ;
      AV160W_SD_B712_SD11_C = new GxObjectCollection(SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem.class, "B712_SD11_SUBJECT_CRF.B712_SD11_SUBJECT_CRFItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV60W_B712_SD05_SEL3 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV58W_B712_SD05_SEL1 = new SdtB712_SD05_MULTI_SEL_LIST(remoteHandle, context);
      AV90W_P_KANI_KENSAKU = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A661TBT02_INPUT_END_FLG = "" ;
      A449TBT02_DEL_FLG = "" ;
      A441TBT01_DEL_FLG = "" ;
      A698TBT01_SITE_ID = "" ;
      AV53W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      A930TBT14_REQUEST_AUTH_CD = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      A902TBT14_KANRYO_FLG = "" ;
      A479TBT14_DEL_FLG = "" ;
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A653TBT02_UPLOAD_USER_ID = "" ;
      A654TBT02_UPLOAD_AUTH_CD = "" ;
      A992TBT02_SIGNATURE_USER_ID = "" ;
      A991TBT02_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A990TBT02_SIGNATURE_FLG = "" ;
      AV104W_TAM07_USER_NM = "" ;
      AV105W_TAM08_SITE_SNM = "" ;
      AV111W_TBM31_CRF_SNM = "" ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A30TBM34_STYDY_AUTH_CD = "" ;
      A571TBM34_DISPLAY_FLG = "" ;
      A572TBM34_DEL_FLG = "" ;
      A397TBM31_DEL_FLG = "" ;
      A642TBM31_CRF_SNM = "" ;
      A55TAM07_USER_ID = "" ;
      AV5W_TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      A57TAM08_SITE_ID = "" ;
      AV6W_TAM08_SITE_ID = "" ;
      A325TAM08_DEL_FLG = "" ;
      A320TAM08_SITE_SNM = "" ;
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
      AV21D_GRD_SITE_SNM = "" ;
      edtavD_grd_site_snm_Internalname = "" ;
      AV20D_GRD_SITE_ID = "" ;
      edtavD_grd_site_id_Internalname = "" ;
      edtavD_grd_crf_id_Internalname = "" ;
      edtavD_grd_crf_eda_no_Internalname = "" ;
      AV15D_GRD_CRF_SNM = "" ;
      edtavD_grd_crf_snm_Internalname = "" ;
      AV18D_GRD_LAST_UPD_DATETIME_VC = "" ;
      edtavD_grd_last_upd_datetime_vc_Internalname = "" ;
      AV23D_GRD_UPD_USER_NM = "" ;
      edtavD_grd_upd_user_nm_Internalname = "" ;
      AV17D_GRD_DM = "" ;
      edtavD_grd_dm_Internalname = "" ;
      AV147D_GRD_SIGN = "" ;
      edtavD_grd_sign_Internalname = "" ;
      AV16D_GRD_DATA_KOTE = "" ;
      edtavD_grd_data_kote_Internalname = "" ;
      GXKey = "" ;
      AV24D_OL_DISP = "" ;
      GXCCtl = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      AV27D_SORT = "" ;
      scmdbuf = "" ;
      H001J2_A8TAS01_ITEM_CD = new String[] {""} ;
      H001J2_A9TAS01_ITEM_NM = new String[] {""} ;
      H001J2_n9TAS01_ITEM_NM = new boolean[] {false} ;
      H001J2_A7TAS01_DATA_KIND = new String[] {""} ;
      H001J2_A300TAS01_DEL_FLG = new String[] {""} ;
      H001J2_n300TAS01_DEL_FLG = new boolean[] {false} ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV190Pgmdesc = "" ;
      AV142D_SUBJECT_ID = "" ;
      AV33H_INIT_FLG = "" ;
      AV40H_SRCH_FLG = "" ;
      AV35H_KNGN_FLG = "" ;
      AV41H_SUBJECT_ID = "" ;
      AV34H_INPUT_END_FLG_SV = "" ;
      AV31H_DEVICE = "" ;
      AV138H_MSG_REP = "" ;
      AV121W_ZIP_FILE_PATH = "" ;
      AV122W_ZIP_FILENAME = "" ;
      AV173W_PDF_ERR_MSG = "" ;
      AV143H_B712_WP05_OK = "" ;
      AV146H_B712_WP05_SIGNATURE_USER_ID = "" ;
      AV8C_APP_ID = "" ;
      AV9C_GAMEN_TITLE = "" ;
      AV95W_SESSION = httpContext.getWebSession();
      H001J3_A369TBM21_DEL_FLG = new String[] {""} ;
      H001J3_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H001J3_A63TBM21_STUDY_ID = new long[1] ;
      H001J3_A367TBM21_STUDY_NM = new String[] {""} ;
      H001J3_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A369TBM21_DEL_FLG = "" ;
      A367TBM21_STUDY_NM = "" ;
      AV99W_STUDY_NM = "" ;
      H001J4_A215TAM04_DEL_FLG = new String[] {""} ;
      H001J4_n215TAM04_DEL_FLG = new boolean[] {false} ;
      H001J4_A13TAM04_AUTH_CD = new String[] {""} ;
      H001J4_A285TAM04_AUTH_NM = new String[] {""} ;
      H001J4_n285TAM04_AUTH_NM = new boolean[] {false} ;
      A215TAM04_DEL_FLG = "" ;
      A13TAM04_AUTH_CD = "" ;
      A285TAM04_AUTH_NM = "" ;
      AV56W_AUTH_NM = "" ;
      GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem1 = new GxObjectCollection [1] ;
      GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem2 = new GxObjectCollection [1] ;
      AV11D_B712_SD06_RESULT_CRF_Item = new SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem(remoteHandle, context);
      H001J5_AV139W_CNT_REPEAT = new short[1] ;
      AV77W_DATA_KBN = "" ;
      AV48SD_B712_SD07_INPUT_DISP_I = new SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem(remoteHandle, context);
      AV50SD_B712_SD08_ICON_INFO_I = new SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem(remoteHandle, context);
      AV13D_GRD_CHG = "" ;
      AV151D_B712_SD06_RESULT_CRF_W = new GxObjectCollection(SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem.class, "B712_SD06_RESULT_CRF.B712_SD06_RESULT_CRFItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV149SD_C712_SD10_C = new GxObjectCollection(SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem.class, "C712_SD10_IN_CRF_ID.C712_SD10_IN_CRF_IDItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      H001J6_A982TBM45_DEL_FLG = new String[] {""} ;
      H001J6_n982TBM45_DEL_FLG = new boolean[] {false} ;
      H001J6_A978TBM45_FILTER_NO = new short[1] ;
      H001J6_A977TBM45_STUDY_ID = new long[1] ;
      H001J6_A981TBM45_IN_CRF_ID = new String[] {""} ;
      H001J6_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      A981TBM45_IN_CRF_ID = "" ;
      AV148W_B712_SD03_CRF_LIST_Item = new SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem(remoteHandle, context);
      AV150SD_C712_SD10_I = new SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem(remoteHandle, context);
      AV153W_SUBJECT_ID_C = new GxObjectCollection(Integer.class, "internal", "");
      AV156W_SUBJECT_EDIT = "" ;
      AV157W_SUBJECT_VC = "" ;
      GXEncryptionTmp = "" ;
      AV98W_STUDY_ID = "" ;
      AV100W_SUBJECT_ID = "" ;
      AV134W_CRF_ID_EDA_NO = "" ;
      AV75W_CRF_INPUT_LEVEL = "" ;
      AV119W_UPD_CNT = "" ;
      AV89W_MSG = "" ;
      AV123W_SYS_VALUE = "" ;
      AV96W_SESSION_KEY = "" ;
      AV51SD_B792_SD00_HTML5_EXEC_INFO = new SdtB792_SD00_HTML5_EXEC_INFO(remoteHandle, context);
      AV97W_STR = "" ;
      AV52SD_B792_SD03_OL_DISP_INFO_I = new SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem(remoteHandle, context);
      AV135W_TMP_CRFID_EDANO = "" ;
      AV120W_URL = "" ;
      AV86W_HTTPREQUEST = httpContext.getHttpRequest();
      H001J7_A92TBT11_STUDY_ID = new long[1] ;
      H001J7_A93TBT11_SUBJECT_ID = new int[1] ;
      H001J7_A94TBT11_CRF_ID = new short[1] ;
      H001J7_A936TBT11_CRF_EDA_NO = new byte[1] ;
      H001J7_A457TBT11_DEL_FLG = new String[] {""} ;
      H001J7_n457TBT11_DEL_FLG = new boolean[] {false} ;
      H001J7_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001J7_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      H001J7_A464TBT11_UPD_CNT = new long[1] ;
      H001J7_n464TBT11_UPD_CNT = new boolean[] {false} ;
      H001J7_A95TBT11_CRF_VERSION = new short[1] ;
      A457TBT11_DEL_FLG = "" ;
      AV168SD_B720_SD02_CRF_INFO_C = new GxObjectCollection(SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem.class, "B720_SD02_CRF_INFO.B720_SD02_CRF_INFOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV169SD_B720_SD02_CRF_INFO_I = new SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem(remoteHandle, context);
      AV80W_ERR_MSG = "" ;
      GXv_int6 = new long [1] ;
      AV92W_RTN_CD = "" ;
      AV62W_B714_SD1_CRF_INFO = new GxObjectCollection(SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem.class, "B714_SD1_CRF_INFO.B714_SD1_CRF_INFOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV63W_B714_SD1_CRF_INFO_Item = new SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem(remoteHandle, context);
      AV64W_B716_SD1_CRF_INFO = new GxObjectCollection(SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem.class, "B716_SD1_CRF_INFO.B716_SD1_CRF_INFOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV65W_B716_SD1_CRF_INFO_Item = new SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem(remoteHandle, context);
      GXv_char7 = new String [1] ;
      GXv_int8 = new short [1] ;
      GXv_char4 = new String [1] ;
      H001J8_A935TBT02_CRF_EDA_NO = new byte[1] ;
      H001J8_A91TBT02_CRF_ID = new short[1] ;
      H001J8_A90TBT02_SUBJECT_ID = new int[1] ;
      H001J8_A89TBT02_STUDY_ID = new long[1] ;
      H001J8_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001J8_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      AV102W_SUBJECT_ID_EDT = "" ;
      AV103W_SUBJECT_ID_GET = "" ;
      GXv_int5 = new byte [1] ;
      AV83W_FLG = "" ;
      AV84W_FLG2 = new String [3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV84W_FLG2[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV165W_GET_CRF_ID_C = new GxObjectCollection(Short.class, "internal", "");
      AV161W_SD_B712_SD11_I = new SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem(remoteHandle, context);
      AV158W_SD_B712_SD03_C = new GxObjectCollection(SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem.class, "B712_SD03_CRF_LIST.B712_SD03_CRF_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV159W_SD_B712_SD03_I = new SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem(remoteHandle, context);
      AV166W_GET_CRF_ID_VC = "" ;
      H001J9_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      H001J9_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      H001J9_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001J9_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      H001J9_A935TBT02_CRF_EDA_NO = new byte[1] ;
      H001J9_A91TBT02_CRF_ID = new short[1] ;
      H001J9_A90TBT02_SUBJECT_ID = new int[1] ;
      H001J9_A89TBT02_STUDY_ID = new long[1] ;
      H001J9_A441TBT01_DEL_FLG = new String[] {""} ;
      H001J9_n441TBT01_DEL_FLG = new boolean[] {false} ;
      H001J9_A449TBT02_DEL_FLG = new String[] {""} ;
      H001J9_n449TBT02_DEL_FLG = new boolean[] {false} ;
      H001J9_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      H001J9_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      H001J9_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      H001J9_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      H001J9_A698TBT01_SITE_ID = new String[] {""} ;
      H001J9_n698TBT01_SITE_ID = new boolean[] {false} ;
      H001J9_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      H001J9_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      H001J9_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001J9_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      H001J9_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      H001J9_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      H001J9_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      H001J9_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      H001J9_A992TBT02_SIGNATURE_USER_ID = new String[] {""} ;
      H001J9_n992TBT02_SIGNATURE_USER_ID = new boolean[] {false} ;
      H001J9_A991TBT02_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001J9_n991TBT02_SIGNATURE_DATETIME = new boolean[] {false} ;
      H001J9_A990TBT02_SIGNATURE_FLG = new String[] {""} ;
      H001J9_n990TBT02_SIGNATURE_FLG = new boolean[] {false} ;
      H001J9_A456TBT02_UPD_CNT = new long[1] ;
      H001J9_n456TBT02_UPD_CNT = new boolean[] {false} ;
      H001J10_A198TBT14_MEMO_NO = new short[1] ;
      H001J10_A140TBT14_STUDY_ID = new long[1] ;
      H001J10_A142TBT14_SUBJECT_ID = new int[1] ;
      H001J10_A474TBT14_CRF_ID = new short[1] ;
      H001J10_n474TBT14_CRF_ID = new boolean[] {false} ;
      H001J10_A941TBT14_CRF_EDA_NO = new byte[1] ;
      H001J10_n941TBT14_CRF_EDA_NO = new boolean[] {false} ;
      H001J10_A479TBT14_DEL_FLG = new String[] {""} ;
      H001J10_n479TBT14_DEL_FLG = new boolean[] {false} ;
      H001J10_A902TBT14_KANRYO_FLG = new String[] {""} ;
      H001J10_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      H001J10_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      H001J10_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      H001J10_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      H001J10_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      H001J11_A945TBM44_STUDY_ID = new long[1] ;
      H001J11_A946TBM44_CRF_ID = new short[1] ;
      H001J11_A947TBM44_CRF_EDA_NO = new byte[1] ;
      H001J11_A948TBM44_VISIT_NO = new int[1] ;
      H001J11_n948TBM44_VISIT_NO = new boolean[] {false} ;
      H001J12_A93TBT11_SUBJECT_ID = new int[1] ;
      H001J12_A94TBT11_CRF_ID = new short[1] ;
      H001J12_A936TBT11_CRF_EDA_NO = new byte[1] ;
      H001J12_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      H001J12_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      H001J12_A92TBT11_STUDY_ID = new long[1] ;
      H001J12_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001J12_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      H001J12_A95TBT11_CRF_VERSION = new short[1] ;
      AV85W_GAMENNM_KENSAKU = "" ;
      H001J13_A8TAS01_ITEM_CD = new String[] {""} ;
      H001J13_A300TAS01_DEL_FLG = new String[] {""} ;
      H001J13_n300TAS01_DEL_FLG = new boolean[] {false} ;
      H001J13_A7TAS01_DATA_KIND = new String[] {""} ;
      H001J13_A9TAS01_ITEM_NM = new String[] {""} ;
      H001J13_n9TAS01_ITEM_NM = new boolean[] {false} ;
      H001J13_A336TAS01_CHAR_1 = new String[] {""} ;
      H001J13_n336TAS01_CHAR_1 = new boolean[] {false} ;
      H001J13_A335TAS01_SORT_NO = new short[1] ;
      H001J13_n335TAS01_SORT_NO = new boolean[] {false} ;
      H001J14_A982TBM45_DEL_FLG = new String[] {""} ;
      H001J14_n982TBM45_DEL_FLG = new boolean[] {false} ;
      H001J14_A977TBM45_STUDY_ID = new long[1] ;
      H001J14_A980TBM45_FILETR_NM = new String[] {""} ;
      H001J14_n980TBM45_FILETR_NM = new boolean[] {false} ;
      H001J14_A978TBM45_FILTER_NO = new short[1] ;
      H001J15_A572TBM34_DEL_FLG = new String[] {""} ;
      H001J15_n572TBM34_DEL_FLG = new boolean[] {false} ;
      H001J15_A571TBM34_DISPLAY_FLG = new String[] {""} ;
      H001J15_n571TBM34_DISPLAY_FLG = new boolean[] {false} ;
      H001J15_A30TBM34_STYDY_AUTH_CD = new String[] {""} ;
      H001J15_A29TBM34_CRF_ID = new short[1] ;
      H001J15_A28TBM34_STUDY_ID = new long[1] ;
      H001J16_A325TAM08_DEL_FLG = new String[] {""} ;
      H001J16_n325TAM08_DEL_FLG = new boolean[] {false} ;
      H001J16_A57TAM08_SITE_ID = new String[] {""} ;
      H001J16_A320TAM08_SITE_SNM = new String[] {""} ;
      H001J16_n320TAM08_SITE_SNM = new boolean[] {false} ;
      H001J17_A397TBM31_DEL_FLG = new String[] {""} ;
      H001J17_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H001J17_A69TBM31_CRF_ID = new short[1] ;
      H001J17_A68TBM31_STUDY_ID = new long[1] ;
      H001J17_A642TBM31_CRF_SNM = new String[] {""} ;
      H001J17_n642TBM31_CRF_SNM = new boolean[] {false} ;
      H001J17_A395TBM31_ORDER = new int[1] ;
      H001J17_n395TBM31_ORDER = new boolean[] {false} ;
      H001J17_A943TBM31_REPEAT_FLG = new byte[1] ;
      H001J17_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      H001J17_A944TBM31_REPEAT_MAX = new byte[1] ;
      H001J17_n944TBM31_REPEAT_MAX = new boolean[] {false} ;
      H001J18_A55TAM07_USER_ID = new String[] {""} ;
      H001J18_A205TAM07_USER_NM = new String[] {""} ;
      H001J18_n205TAM07_USER_NM = new boolean[] {false} ;
      A607TBM21_STATUS = "" ;
      H001J19_A369TBM21_DEL_FLG = new String[] {""} ;
      H001J19_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H001J19_A63TBM21_STUDY_ID = new long[1] ;
      H001J19_A607TBM21_STATUS = new String[] {""} ;
      H001J19_n607TBM21_STATUS = new boolean[] {false} ;
      GXv_SdtA_LOGIN_SDT10 = new SdtA_LOGIN_SDT [1] ;
      AV81W_ERRCD = "" ;
      AV54W_A819_JS = "" ;
      GXv_SdtA_PAGING_SDT11 = new SdtA_PAGING_SDT [1] ;
      GXt_char3 = "" ;
      GXv_char9 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_crf_del_exec_Jsonclick = "" ;
      lblTxt_btn_data_ktei_exec_Jsonclick = "" ;
      lblTxt_btn_sign_exec_Jsonclick = "" ;
      lblTxt_btn_dm_kaijo_exec_Jsonclick = "" ;
      lblTxt_btn_pdf_out_exec_Jsonclick = "" ;
      lblTxt_btn_pdf_out_his_exec_Jsonclick = "" ;
      TempTags = "" ;
      lblTxt_btn_crf_teisyutu_exec_Jsonclick = "" ;
      lblTxt_btn_csv_out_exec_sign_Jsonclick = "" ;
      lblTxt_btn_csv_out_exec_dm_Jsonclick = "" ;
      lblTxt_btn_csv_out_exec_all_Jsonclick = "" ;
      lblTxt_btn_csv_out_exec_ktei_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock30_Jsonclick = "" ;
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
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
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
      lblTextblock44_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblBtn_sub_id_exec_Jsonclick = "" ;
      lblBtn_crf_open_Jsonclick = "" ;
      lblBtn_chg_reki_Jsonclick = "" ;
      lblBtn_ssai_hyoj_Jsonclick = "" ;
      lblBtn_pdf_out_Jsonclick = "" ;
      lblBtn_crf_teisyutu_Jsonclick = "" ;
      lblBtn_dm_kaijo_Jsonclick = "" ;
      lblBtn_data_kotei_Jsonclick = "" ;
      lblBtn_crf_del_Jsonclick = "" ;
      lblBtn_csv_out_Jsonclick = "" ;
      lblBtn_sign_Jsonclick = "" ;
      lblBtn_search_back_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      imgBtn_repeat_Internalname = "" ;
      imgBtn_repeat_del_Internalname = "" ;
      lblTxt_grd_kngn_01_Internalname = "" ;
      lblTxt_grd_kngn_02_Internalname = "" ;
      lblTxt_grd_kngn_03_Internalname = "" ;
      lblTxt_grd_kngn_04_Internalname = "" ;
      lblTxt_grd_kngn_05_Internalname = "" ;
      lblTxt_grd_kngn_06_Internalname = "" ;
      lblTxt_grd_kngn_07_Internalname = "" ;
      lblTxt_grd_upd_kngn_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      imgBtn_repeat_Jsonclick = "" ;
      imgBtn_repeat_del_Jsonclick = "" ;
      lblTxt_grd_kngn_01_Jsonclick = "" ;
      lblTxt_grd_kngn_02_Jsonclick = "" ;
      lblTxt_grd_kngn_03_Jsonclick = "" ;
      lblTxt_grd_kngn_04_Jsonclick = "" ;
      lblTxt_grd_kngn_05_Jsonclick = "" ;
      lblTxt_grd_kngn_06_Jsonclick = "" ;
      lblTxt_grd_kngn_07_Jsonclick = "" ;
      lblTxt_grd_upd_kngn_Jsonclick = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b712_wp02_result_crf__default(),
         new Object[] {
             new Object[] {
            H001J2_A8TAS01_ITEM_CD, H001J2_A9TAS01_ITEM_NM, H001J2_n9TAS01_ITEM_NM, H001J2_A7TAS01_DATA_KIND, H001J2_A300TAS01_DEL_FLG, H001J2_n300TAS01_DEL_FLG
            }
            , new Object[] {
            H001J3_A369TBM21_DEL_FLG, H001J3_n369TBM21_DEL_FLG, H001J3_A63TBM21_STUDY_ID, H001J3_A367TBM21_STUDY_NM, H001J3_n367TBM21_STUDY_NM
            }
            , new Object[] {
            H001J4_A215TAM04_DEL_FLG, H001J4_n215TAM04_DEL_FLG, H001J4_A13TAM04_AUTH_CD, H001J4_A285TAM04_AUTH_NM, H001J4_n285TAM04_AUTH_NM
            }
            , new Object[] {
            H001J5_AV139W_CNT_REPEAT
            }
            , new Object[] {
            H001J6_A982TBM45_DEL_FLG, H001J6_n982TBM45_DEL_FLG, H001J6_A978TBM45_FILTER_NO, H001J6_A977TBM45_STUDY_ID, H001J6_A981TBM45_IN_CRF_ID, H001J6_n981TBM45_IN_CRF_ID
            }
            , new Object[] {
            H001J7_A92TBT11_STUDY_ID, H001J7_A93TBT11_SUBJECT_ID, H001J7_A94TBT11_CRF_ID, H001J7_A936TBT11_CRF_EDA_NO, H001J7_A457TBT11_DEL_FLG, H001J7_n457TBT11_DEL_FLG, H001J7_A670TBT11_DM_ARRIVAL_DATETIME, H001J7_n670TBT11_DM_ARRIVAL_DATETIME, H001J7_A464TBT11_UPD_CNT, H001J7_n464TBT11_UPD_CNT,
            H001J7_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            H001J8_A935TBT02_CRF_EDA_NO, H001J8_A91TBT02_CRF_ID, H001J8_A90TBT02_SUBJECT_ID, H001J8_A89TBT02_STUDY_ID, H001J8_A656TBT02_DM_ARRIVAL_DATETIME, H001J8_n656TBT02_DM_ARRIVAL_DATETIME
            }
            , new Object[] {
            H001J9_A498TBT02_CRF_LATEST_VERSION, H001J9_n498TBT02_CRF_LATEST_VERSION, H001J9_A656TBT02_DM_ARRIVAL_DATETIME, H001J9_n656TBT02_DM_ARRIVAL_DATETIME, H001J9_A935TBT02_CRF_EDA_NO, H001J9_A91TBT02_CRF_ID, H001J9_A90TBT02_SUBJECT_ID, H001J9_A89TBT02_STUDY_ID, H001J9_A441TBT01_DEL_FLG, H001J9_n441TBT01_DEL_FLG,
            H001J9_A449TBT02_DEL_FLG, H001J9_n449TBT02_DEL_FLG, H001J9_A661TBT02_INPUT_END_FLG, H001J9_n661TBT02_INPUT_END_FLG, H001J9_A655TBT02_DM_ARRIVAL_FLG, H001J9_n655TBT02_DM_ARRIVAL_FLG, H001J9_A698TBT01_SITE_ID, H001J9_n698TBT01_SITE_ID, H001J9_A499TBT02_CRF_INPUT_LEVEL, H001J9_n499TBT02_CRF_INPUT_LEVEL,
            H001J9_A652TBT02_UPLOAD_DATETIME, H001J9_n652TBT02_UPLOAD_DATETIME, H001J9_A653TBT02_UPLOAD_USER_ID, H001J9_n653TBT02_UPLOAD_USER_ID, H001J9_A654TBT02_UPLOAD_AUTH_CD, H001J9_n654TBT02_UPLOAD_AUTH_CD, H001J9_A992TBT02_SIGNATURE_USER_ID, H001J9_n992TBT02_SIGNATURE_USER_ID, H001J9_A991TBT02_SIGNATURE_DATETIME, H001J9_n991TBT02_SIGNATURE_DATETIME,
            H001J9_A990TBT02_SIGNATURE_FLG, H001J9_n990TBT02_SIGNATURE_FLG, H001J9_A456TBT02_UPD_CNT, H001J9_n456TBT02_UPD_CNT
            }
            , new Object[] {
            H001J10_A198TBT14_MEMO_NO, H001J10_A140TBT14_STUDY_ID, H001J10_A142TBT14_SUBJECT_ID, H001J10_A474TBT14_CRF_ID, H001J10_n474TBT14_CRF_ID, H001J10_A941TBT14_CRF_EDA_NO, H001J10_n941TBT14_CRF_EDA_NO, H001J10_A479TBT14_DEL_FLG, H001J10_n479TBT14_DEL_FLG, H001J10_A902TBT14_KANRYO_FLG,
            H001J10_n902TBT14_KANRYO_FLG, H001J10_A927TBT14_KAKUNIN_FLG, H001J10_n927TBT14_KAKUNIN_FLG, H001J10_A930TBT14_REQUEST_AUTH_CD, H001J10_n930TBT14_REQUEST_AUTH_CD
            }
            , new Object[] {
            H001J11_A945TBM44_STUDY_ID, H001J11_A946TBM44_CRF_ID, H001J11_A947TBM44_CRF_EDA_NO, H001J11_A948TBM44_VISIT_NO, H001J11_n948TBM44_VISIT_NO
            }
            , new Object[] {
            H001J12_A93TBT11_SUBJECT_ID, H001J12_A94TBT11_CRF_ID, H001J12_A936TBT11_CRF_EDA_NO, H001J12_A669TBT11_DM_ARRIVAL_FLG, H001J12_n669TBT11_DM_ARRIVAL_FLG, H001J12_A92TBT11_STUDY_ID, H001J12_A670TBT11_DM_ARRIVAL_DATETIME, H001J12_n670TBT11_DM_ARRIVAL_DATETIME, H001J12_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            H001J13_A8TAS01_ITEM_CD, H001J13_A300TAS01_DEL_FLG, H001J13_n300TAS01_DEL_FLG, H001J13_A7TAS01_DATA_KIND, H001J13_A9TAS01_ITEM_NM, H001J13_n9TAS01_ITEM_NM, H001J13_A336TAS01_CHAR_1, H001J13_n336TAS01_CHAR_1, H001J13_A335TAS01_SORT_NO, H001J13_n335TAS01_SORT_NO
            }
            , new Object[] {
            H001J14_A982TBM45_DEL_FLG, H001J14_n982TBM45_DEL_FLG, H001J14_A977TBM45_STUDY_ID, H001J14_A980TBM45_FILETR_NM, H001J14_n980TBM45_FILETR_NM, H001J14_A978TBM45_FILTER_NO
            }
            , new Object[] {
            H001J15_A572TBM34_DEL_FLG, H001J15_n572TBM34_DEL_FLG, H001J15_A571TBM34_DISPLAY_FLG, H001J15_n571TBM34_DISPLAY_FLG, H001J15_A30TBM34_STYDY_AUTH_CD, H001J15_A29TBM34_CRF_ID, H001J15_A28TBM34_STUDY_ID
            }
            , new Object[] {
            H001J16_A325TAM08_DEL_FLG, H001J16_n325TAM08_DEL_FLG, H001J16_A57TAM08_SITE_ID, H001J16_A320TAM08_SITE_SNM, H001J16_n320TAM08_SITE_SNM
            }
            , new Object[] {
            H001J17_A397TBM31_DEL_FLG, H001J17_n397TBM31_DEL_FLG, H001J17_A69TBM31_CRF_ID, H001J17_A68TBM31_STUDY_ID, H001J17_A642TBM31_CRF_SNM, H001J17_n642TBM31_CRF_SNM, H001J17_A395TBM31_ORDER, H001J17_n395TBM31_ORDER, H001J17_A943TBM31_REPEAT_FLG, H001J17_n943TBM31_REPEAT_FLG,
            H001J17_A944TBM31_REPEAT_MAX, H001J17_n944TBM31_REPEAT_MAX
            }
            , new Object[] {
            H001J18_A55TAM07_USER_ID, H001J18_A205TAM07_USER_NM, H001J18_n205TAM07_USER_NM
            }
            , new Object[] {
            H001J19_A369TBM21_DEL_FLG, H001J19_n369TBM21_DEL_FLG, H001J19_A63TBM21_STUDY_ID, H001J19_A607TBM21_STATUS, H001J19_n607TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV193Pgmname = "B712_WP02_RESULT_CRF" ;
      AV190Pgmdesc = "CRF検索結果" ;
      /* GeneXus formulas. */
      AV193Pgmname = "B712_WP02_RESULT_CRF" ;
      AV190Pgmdesc = "CRF検索結果" ;
      Gx_err = (short)(0) ;
      edtavD_grd_subject_id_Enabled = 0 ;
      edtavD_grd_site_snm_Enabled = 0 ;
      edtavD_grd_crf_snm_Enabled = 0 ;
      edtavD_grd_last_upd_datetime_vc_Enabled = 0 ;
      edtavD_grd_upd_user_nm_Enabled = 0 ;
      edtavD_grd_dm_Enabled = 0 ;
      edtavD_grd_sign_Enabled = 0 ;
      edtavD_grd_data_kote_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte GRID1_nEOF ;
   private byte A941TBT14_CRF_EDA_NO ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A499TBT02_CRF_INPUT_LEVEL ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte AV127W_TBM31_REPEAT_FLG ;
   private byte AV128W_TBM31_REPEAT_MAX ;
   private byte AV126W_CRF_EDA_NO_MAX ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte A943TBM31_REPEAT_FLG ;
   private byte A944TBM31_REPEAT_MAX ;
   private byte AV124D_GRD_CRF_EDA_NO ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV137H_SEL_TBT02_CRF_EDA_NO ;
   private byte AV172W_PDF_ERR_CD ;
   private byte AV36H_POPUP_ERR_CD ;
   private byte AV145H_B712_WP05_SIGNATURE_CHK ;
   private byte AV178H_SEL_PDF_CD ;
   private byte AV182H_SEL_CSV_CD ;
   private byte AV91W_RET_CD ;
   private byte AV136W_TBT02_CRF_EDA_NO ;
   private byte AV79W_ERR_CD ;
   private byte AV88W_INPUT_END_FLG_SET ;
   private byte AV101W_SUBJECT_ID_CNT ;
   private byte GXv_int5[] ;
   private byte AV215GXLvl1965 ;
   private byte AV217GXLvl2048 ;
   private byte AV220GXLvl2244 ;
   private byte AV224GXLvl2361 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_231 ;
   private short nGXsfl_231_idx=1 ;
   private short A335TAS01_SORT_NO ;
   private short A978TBM45_FILTER_NO ;
   private short AV94W_SEL_PTN ;
   private short A474TBT14_CRF_ID ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short A946TBM44_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short A94TBT11_CRF_ID ;
   private short A29TBM34_CRF_ID ;
   private short AV113W_TBM34_CRF_ID ;
   private short A69TBM31_CRF_ID ;
   private short AV7W_TBM31_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV14D_GRD_CRF_ID ;
   private short nCmpId ;
   private short AV141D_GROUP ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_231_Refreshing=0 ;
   private short Gx_err ;
   private short AV37H_SEL_TBT02_CRF_ID ;
   private short AV176W_PDF_CNT ;
   private short AV170H_POPUP_KBN ;
   private short AV139W_CNT_REPEAT ;
   private short cV139W_CNT_REPEAT ;
   private short AV155W_SUBJECT_LEN ;
   private short AV154W_IX1 ;
   private short AV93W_SEL_CNT ;
   private short AV72W_CNT2 ;
   private short AV115W_TBT02_CRF_ID ;
   private short AV184W_SEL_CNT_DM_ARRIVAL_OFF ;
   private short AV185W_SEL_CNT_DM_ARRIVAL_ON ;
   private short GXv_int8[] ;
   private short AV167W_GET_CRF_ID ;
   private short nGXsfl_231_fel_idx=1 ;
   private int A90TBT02_SUBJECT_ID ;
   private int A142TBT14_SUBJECT_ID ;
   private int A948TBM44_VISIT_NO ;
   private int AV112W_TBM31_ORDER ;
   private int A93TBT11_SUBJECT_ID ;
   private int A395TBM31_ORDER ;
   private int subGrid1_Rows ;
   private int AV22D_GRD_SUBJECT_ID ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int edtavD_grd_subject_id_Enabled ;
   private int edtavD_grd_site_snm_Enabled ;
   private int edtavD_grd_crf_snm_Enabled ;
   private int edtavD_grd_last_upd_datetime_vc_Enabled ;
   private int edtavD_grd_upd_user_nm_Enabled ;
   private int edtavD_grd_dm_Enabled ;
   private int edtavD_grd_sign_Enabled ;
   private int edtavD_grd_data_kote_Enabled ;
   private int AV38H_SEL_TBT02_SUBJECT_ID ;
   private int tblTbl_hidden_Visible ;
   private int tblTbl_grd_hidden_Visible ;
   private int AV194GXV3 ;
   private int tblTbl_repeat_Visible ;
   private int imgBtn_repeat_Visible ;
   private int imgBtn_repeat_del_Visible ;
   private int AV196GXV4 ;
   private int tblTbl_grd_kngn_01_Visible ;
   private int tblTbl_grd_kngn_02_Visible ;
   private int tblTbl_grd_kngn_03_Visible ;
   private int tblTbl_grd_kngn_04_Visible ;
   private int tblTbl_grd_kngn_05_Visible ;
   private int tblTbl_grd_kngn_06_Visible ;
   private int tblTbl_grd_kngn_07_Visible ;
   private int tblTbl_grd_upd_kngn_Visible ;
   private int AV197GXV5 ;
   private int tblTbl_grd_upd_kngn_Backcolor ;
   private int AV199GXV6 ;
   private int AV200GXV7 ;
   private int AV152W_SUBJECT_ID_I ;
   private int AV201GXV8 ;
   private int AV202GXV9 ;
   private int AV117W_TBT02_SUBJECT_ID ;
   private int AV144W_GRID_SEL_CNT ;
   private int AV204GXV10 ;
   private int AV205GXV11 ;
   private int AV206GXV12 ;
   private int AV208GXV13 ;
   private int AV209GXV14 ;
   private int AV210GXV15 ;
   private int AV163W_GET_SUBJECT_ID ;
   private int AV211GXV16 ;
   private int AV212GXV17 ;
   private int AV213GXV18 ;
   private int AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ;
   private int lblBtn_crf_teisyutu_Visible ;
   private int lblBtn_dm_kaijo_Visible ;
   private int lblBtn_data_kotei_Visible ;
   private int lblBtn_crf_del_Visible ;
   private int lblBtn_csv_out_Visible ;
   private int tblTbl_ol_disp_Visible ;
   private int lblBtn_pdf_out_Visible ;
   private int lblBtn_sign_Visible ;
   private int tblTbl_sign_ok_sel_Visible ;
   private int AV226GXV19 ;
   private int tblTbl_icon_info_01_Visible ;
   private int tblTbl_icon_info_02_Visible ;
   private int tblTbl_icon_info_03_Visible ;
   private int tblTbl_icon_info_04_Visible ;
   private int tblTbl_icon_info_05_Visible ;
   private int tblTbl_icon_info_06_Visible ;
   private int tblTbl_icon_info_07_Visible ;
   private int AV227GXV20 ;
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
   private int edtavD_grd_site_id_Enabled ;
   private int edtavD_grd_site_id_Visible ;
   private int edtavD_grd_crf_id_Enabled ;
   private int edtavD_grd_crf_id_Visible ;
   private int edtavD_grd_crf_eda_no_Enabled ;
   private int edtavD_grd_crf_eda_no_Visible ;
   private int edtavD_grd_crf_snm_Visible ;
   private int imgBtn_repeat_Enabled ;
   private int imgBtn_repeat_del_Enabled ;
   private int edtavD_grd_last_upd_datetime_vc_Visible ;
   private int edtavD_grd_upd_user_nm_Visible ;
   private int edtavD_grd_dm_Visible ;
   private int edtavD_grd_sign_Visible ;
   private int edtavD_grd_data_kote_Visible ;
   private int GX_I ;
   private long GRID1_nFirstRecordOnPage ;
   private long A977TBM45_STUDY_ID ;
   private long AV44P_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A140TBT14_STUDY_ID ;
   private long A456TBT02_UPD_CNT ;
   private long A945TBM44_STUDY_ID ;
   private long A92TBT11_STUDY_ID ;
   private long A28TBM34_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long GRID1_nRecordCount ;
   private long AV39H_SEL_TBT02_UPD_CNT ;
   private long A63TBM21_STUDY_ID ;
   private long GRID1_nCurrentRecord ;
   private long AV87W_IDX ;
   private long AV116W_TBT02_STUDY_ID ;
   private long A464TBT11_UPD_CNT ;
   private long GXv_int6[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_231_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV193Pgmname ;
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
   private String edtavD_grd_crf_eda_no_Internalname ;
   private String edtavD_grd_crf_snm_Internalname ;
   private String edtavD_grd_last_upd_datetime_vc_Internalname ;
   private String edtavD_grd_upd_user_nm_Internalname ;
   private String edtavD_grd_dm_Internalname ;
   private String edtavD_grd_sign_Internalname ;
   private String edtavD_grd_data_kote_Internalname ;
   private String GXKey ;
   private String GXCCtl ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV190Pgmdesc ;
   private String edtavD_subject_id_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_subject_id_Internalname ;
   private String edtavH_input_end_flg_sv_Internalname ;
   private String edtavH_sel_tbt02_crf_id_Internalname ;
   private String edtavH_sel_tbt02_crf_eda_no_Internalname ;
   private String edtavH_sel_tbt02_subject_id_Internalname ;
   private String edtavH_sel_tbt02_upd_cnt_Internalname ;
   private String edtavH_device_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String edtavH_msg_rep_Internalname ;
   private String edtavCtltbt02_subject_id_Internalname ;
   private String edtavW_pdf_cnt_Internalname ;
   private String edtavW_zip_file_path_Internalname ;
   private String edtavW_zip_filename_Internalname ;
   private String edtavW_pdf_err_cd_Internalname ;
   private String edtavW_pdf_err_msg_Internalname ;
   private String edtavH_popup_kbn_Internalname ;
   private String edtavH_popup_err_cd_Internalname ;
   private String edtavH_b712_wp05_ok_Internalname ;
   private String edtavH_b712_wp05_signature_chk_Internalname ;
   private String edtavH_b712_wp05_signature_user_id_Internalname ;
   private String edtavH_sel_pdf_cd_Internalname ;
   private String edtavH_sel_csv_cd_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String tblTbl_grd_hidden_Internalname ;
   private String tblTbl_repeat_Internalname ;
   private String tblTbl_grd_kngn_01_Internalname ;
   private String tblTbl_grd_kngn_02_Internalname ;
   private String tblTbl_grd_kngn_03_Internalname ;
   private String tblTbl_grd_kngn_04_Internalname ;
   private String tblTbl_grd_kngn_05_Internalname ;
   private String tblTbl_grd_kngn_06_Internalname ;
   private String tblTbl_grd_kngn_07_Internalname ;
   private String tblTbl_grd_upd_kngn_Internalname ;
   private String lblTxt_grd_upd_kngn_Caption ;
   private String GXEncryptionTmp ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String lblBtn_crf_teisyutu_Internalname ;
   private String lblBtn_dm_kaijo_Internalname ;
   private String lblBtn_data_kotei_Internalname ;
   private String lblBtn_crf_del_Internalname ;
   private String lblBtn_csv_out_Internalname ;
   private String tblTbl_ol_disp_Internalname ;
   private String lblBtn_pdf_out_Internalname ;
   private String lblBtn_sign_Internalname ;
   private String tblTbl_sign_ok_sel_Internalname ;
   private String sGXsfl_231_fel_idx="0001" ;
   private String tblTbl_icon_info_01_Internalname ;
   private String tblTbl_icon_info_02_Internalname ;
   private String tblTbl_icon_info_03_Internalname ;
   private String tblTbl_icon_info_04_Internalname ;
   private String tblTbl_icon_info_05_Internalname ;
   private String tblTbl_icon_info_06_Internalname ;
   private String tblTbl_icon_info_07_Internalname ;
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
   private String GXt_char3 ;
   private String GXv_char9[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_btn_crf_del_exec_Internalname ;
   private String lblTxt_btn_crf_del_exec_Jsonclick ;
   private String lblTxt_btn_data_ktei_exec_Internalname ;
   private String lblTxt_btn_data_ktei_exec_Jsonclick ;
   private String lblTxt_btn_sign_exec_Internalname ;
   private String lblTxt_btn_sign_exec_Jsonclick ;
   private String lblTxt_btn_dm_kaijo_exec_Internalname ;
   private String lblTxt_btn_dm_kaijo_exec_Jsonclick ;
   private String lblTxt_btn_pdf_out_exec_Internalname ;
   private String lblTxt_btn_pdf_out_exec_Jsonclick ;
   private String lblTxt_btn_pdf_out_his_exec_Internalname ;
   private String lblTxt_btn_pdf_out_his_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_subject_id_Jsonclick ;
   private String edtavH_input_end_flg_sv_Jsonclick ;
   private String edtavH_sel_tbt02_crf_id_Jsonclick ;
   private String edtavH_sel_tbt02_crf_eda_no_Jsonclick ;
   private String edtavH_sel_tbt02_subject_id_Jsonclick ;
   private String edtavH_sel_tbt02_upd_cnt_Jsonclick ;
   private String edtavH_device_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String edtavH_msg_rep_Jsonclick ;
   private String edtavCtltbt02_subject_id_Jsonclick ;
   private String edtavW_pdf_cnt_Jsonclick ;
   private String edtavW_zip_file_path_Jsonclick ;
   private String edtavW_zip_filename_Jsonclick ;
   private String edtavW_pdf_err_cd_Jsonclick ;
   private String edtavW_pdf_err_msg_Jsonclick ;
   private String edtavH_popup_kbn_Jsonclick ;
   private String edtavH_popup_err_cd_Jsonclick ;
   private String lblTxt_btn_crf_teisyutu_exec_Internalname ;
   private String lblTxt_btn_crf_teisyutu_exec_Jsonclick ;
   private String edtavH_sel_pdf_cd_Jsonclick ;
   private String edtavH_sel_csv_cd_Jsonclick ;
   private String lblTxt_btn_csv_out_exec_sign_Internalname ;
   private String lblTxt_btn_csv_out_exec_sign_Jsonclick ;
   private String lblTxt_btn_csv_out_exec_dm_Internalname ;
   private String lblTxt_btn_csv_out_exec_dm_Jsonclick ;
   private String lblTxt_btn_csv_out_exec_all_Internalname ;
   private String lblTxt_btn_csv_out_exec_all_Jsonclick ;
   private String lblTxt_btn_csv_out_exec_ktei_Internalname ;
   private String lblTxt_btn_csv_out_exec_ktei_Jsonclick ;
   private String tblTable8_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavH_b712_wp05_ok_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtavH_b712_wp05_signature_chk_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtavH_b712_wp05_signature_user_id_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String subGrid1_Internalname ;
   private String tblTable6_Internalname ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
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
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String tblTable7_Internalname ;
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
   private String tblTable13_Internalname ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String tblTable11_Internalname ;
   private String edtavD_subject_id_Jsonclick ;
   private String lblBtn_sub_id_exec_Internalname ;
   private String lblBtn_sub_id_exec_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblBtn_crf_open_Internalname ;
   private String lblBtn_crf_open_Jsonclick ;
   private String lblBtn_chg_reki_Internalname ;
   private String lblBtn_chg_reki_Jsonclick ;
   private String lblBtn_ssai_hyoj_Internalname ;
   private String lblBtn_ssai_hyoj_Jsonclick ;
   private String lblBtn_pdf_out_Jsonclick ;
   private String lblBtn_crf_teisyutu_Jsonclick ;
   private String lblBtn_dm_kaijo_Jsonclick ;
   private String lblBtn_data_kotei_Jsonclick ;
   private String lblBtn_crf_del_Jsonclick ;
   private String lblBtn_csv_out_Jsonclick ;
   private String lblBtn_sign_Jsonclick ;
   private String lblBtn_search_back_Internalname ;
   private String lblBtn_search_back_Jsonclick ;
   private String imgBtn_repeat_Internalname ;
   private String imgBtn_repeat_del_Internalname ;
   private String lblTxt_grd_kngn_01_Internalname ;
   private String lblTxt_grd_kngn_02_Internalname ;
   private String lblTxt_grd_kngn_03_Internalname ;
   private String lblTxt_grd_kngn_04_Internalname ;
   private String lblTxt_grd_kngn_05_Internalname ;
   private String lblTxt_grd_kngn_06_Internalname ;
   private String lblTxt_grd_kngn_07_Internalname ;
   private String lblTxt_grd_upd_kngn_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavD_grd_subject_id_Jsonclick ;
   private String edtavD_grd_site_snm_Jsonclick ;
   private String edtavD_grd_site_id_Jsonclick ;
   private String edtavD_grd_crf_id_Jsonclick ;
   private String edtavD_grd_crf_eda_no_Jsonclick ;
   private String edtavD_grd_crf_snm_Jsonclick ;
   private String imgBtn_repeat_Jsonclick ;
   private String imgBtn_repeat_del_Jsonclick ;
   private String tblTable5_Internalname ;
   private String lblTxt_grd_kngn_01_Jsonclick ;
   private String lblTxt_grd_kngn_02_Jsonclick ;
   private String lblTxt_grd_kngn_03_Jsonclick ;
   private String lblTxt_grd_kngn_04_Jsonclick ;
   private String lblTxt_grd_kngn_05_Jsonclick ;
   private String lblTxt_grd_kngn_06_Jsonclick ;
   private String lblTxt_grd_kngn_07_Jsonclick ;
   private String edtavD_grd_last_upd_datetime_vc_Jsonclick ;
   private String edtavD_grd_upd_user_nm_Jsonclick ;
   private String lblTxt_grd_upd_kngn_Jsonclick ;
   private String edtavD_grd_dm_Jsonclick ;
   private String edtavD_grd_sign_Jsonclick ;
   private String edtavD_grd_data_kote_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A652TBT02_UPLOAD_DATETIME ;
   private java.util.Date A991TBT02_SIGNATURE_DATETIME ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV82W_ERRFLG ;
   private boolean AV73W_CRF_AUTH_FLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV19D_GRD_SEL_FLG ;
   private boolean AV12D_GRD_ALL_SEL_FLG ;
   private boolean AV183D_GRD_ALL_SIGN_OK_SEL_FLG ;
   private boolean returnInSub ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean n982TBM45_DEL_FLG ;
   private boolean n981TBM45_IN_CRF_ID ;
   private boolean n457TBT11_DEL_FLG ;
   private boolean n670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n464TBT11_UPD_CNT ;
   private boolean AV70W_CHK_STUDY_UPD_FLG ;
   private boolean AV66W_CHK_ALLOFF_DM_ARRIVAL_FLG ;
   private boolean AV67W_CHK_ALLOFF_INPUT_END_FLG ;
   private boolean AV68W_CHK_ALLON_DM_ARRIVAL_FLG ;
   private boolean AV69W_CHK_INPUT_END_KONZAI_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean AV179W_CHK_SIGN_OFF_FLG ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n441TBT01_DEL_FLG ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n499TBT02_CRF_INPUT_LEVEL ;
   private boolean n652TBT02_UPLOAD_DATETIME ;
   private boolean n653TBT02_UPLOAD_USER_ID ;
   private boolean n654TBT02_UPLOAD_AUTH_CD ;
   private boolean n992TBT02_SIGNATURE_USER_ID ;
   private boolean n991TBT02_SIGNATURE_DATETIME ;
   private boolean n990TBT02_SIGNATURE_FLG ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean AV76W_DATA_GET_FLG ;
   private boolean n474TBT14_CRF_ID ;
   private boolean n941TBT14_CRF_EDA_NO ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n300TAS01_DEL_FLG ;
   private boolean n9TAS01_ITEM_NM ;
   private boolean n336TAS01_CHAR_1 ;
   private boolean n335TAS01_SORT_NO ;
   private boolean n980TBM45_FILETR_NM ;
   private boolean n572TBM34_DEL_FLG ;
   private boolean n571TBM34_DISPLAY_FLG ;
   private boolean n325TAM08_DEL_FLG ;
   private boolean n320TAM08_SITE_SNM ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n395TBM31_ORDER ;
   private boolean n943TBM31_REPEAT_FLG ;
   private boolean n944TBM31_REPEAT_MAX ;
   private boolean n205TAM07_USER_NM ;
   private boolean n607TBM21_STATUS ;
   private String A7TAS01_DATA_KIND ;
   private String A300TAS01_DEL_FLG ;
   private String A336TAS01_CHAR_1 ;
   private String A9TAS01_ITEM_NM ;
   private String A982TBM45_DEL_FLG ;
   private String A980TBM45_FILETR_NM ;
   private String AV42P_AUTH_CD ;
   private String AV55W_A821_JS ;
   private String AV162W_SESSION_KEY_SUBJECT_CRF ;
   private String AV106W_TBM01_CRC_VALUE ;
   private String AV108W_TBM01_RESEARCHER_VALUE ;
   private String AV110W_TBM01_SITE_MG_VALUE ;
   private String AV107W_TBM01_DM_VALUE ;
   private String AV109W_TBM01_SAGYOJOHO_VALUE ;
   private String AV180W_TBM01_JIMU_VALUE ;
   private String AV181W_TBM01_MONITOR_VALUE ;
   private String AV164W_GET_SUBJECT_ID_VC ;
   private String AV90W_P_KANI_KENSAKU ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A449TBT02_DEL_FLG ;
   private String A441TBT01_DEL_FLG ;
   private String A698TBT01_SITE_ID ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A902TBT14_KANRYO_FLG ;
   private String A479TBT14_DEL_FLG ;
   private String A653TBT02_UPLOAD_USER_ID ;
   private String A654TBT02_UPLOAD_AUTH_CD ;
   private String A992TBT02_SIGNATURE_USER_ID ;
   private String A990TBT02_SIGNATURE_FLG ;
   private String AV104W_TAM07_USER_NM ;
   private String AV105W_TAM08_SITE_SNM ;
   private String AV111W_TBM31_CRF_SNM ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A30TBM34_STYDY_AUTH_CD ;
   private String A571TBM34_DISPLAY_FLG ;
   private String A572TBM34_DEL_FLG ;
   private String A397TBM31_DEL_FLG ;
   private String A642TBM31_CRF_SNM ;
   private String A55TAM07_USER_ID ;
   private String AV5W_TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String A57TAM08_SITE_ID ;
   private String AV6W_TAM08_SITE_ID ;
   private String A325TAM08_DEL_FLG ;
   private String A320TAM08_SITE_SNM ;
   private String AV21D_GRD_SITE_SNM ;
   private String AV20D_GRD_SITE_ID ;
   private String AV15D_GRD_CRF_SNM ;
   private String AV18D_GRD_LAST_UPD_DATETIME_VC ;
   private String AV23D_GRD_UPD_USER_NM ;
   private String AV17D_GRD_DM ;
   private String AV147D_GRD_SIGN ;
   private String AV16D_GRD_DATA_KOTE ;
   private String AV24D_OL_DISP ;
   private String AV27D_SORT ;
   private String AV142D_SUBJECT_ID ;
   private String AV33H_INIT_FLG ;
   private String AV40H_SRCH_FLG ;
   private String AV35H_KNGN_FLG ;
   private String AV41H_SUBJECT_ID ;
   private String AV34H_INPUT_END_FLG_SV ;
   private String AV31H_DEVICE ;
   private String AV138H_MSG_REP ;
   private String AV121W_ZIP_FILE_PATH ;
   private String AV122W_ZIP_FILENAME ;
   private String AV173W_PDF_ERR_MSG ;
   private String AV143H_B712_WP05_OK ;
   private String AV146H_B712_WP05_SIGNATURE_USER_ID ;
   private String AV8C_APP_ID ;
   private String AV9C_GAMEN_TITLE ;
   private String A369TBM21_DEL_FLG ;
   private String A367TBM21_STUDY_NM ;
   private String AV99W_STUDY_NM ;
   private String A215TAM04_DEL_FLG ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private String AV56W_AUTH_NM ;
   private String AV77W_DATA_KBN ;
   private String AV13D_GRD_CHG ;
   private String A981TBM45_IN_CRF_ID ;
   private String AV156W_SUBJECT_EDIT ;
   private String AV157W_SUBJECT_VC ;
   private String AV98W_STUDY_ID ;
   private String AV100W_SUBJECT_ID ;
   private String AV134W_CRF_ID_EDA_NO ;
   private String AV75W_CRF_INPUT_LEVEL ;
   private String AV119W_UPD_CNT ;
   private String AV89W_MSG ;
   private String AV123W_SYS_VALUE ;
   private String AV96W_SESSION_KEY ;
   private String AV97W_STR ;
   private String AV135W_TMP_CRFID_EDANO ;
   private String AV120W_URL ;
   private String A457TBT11_DEL_FLG ;
   private String AV80W_ERR_MSG ;
   private String AV92W_RTN_CD ;
   private String AV102W_SUBJECT_ID_EDT ;
   private String AV103W_SUBJECT_ID_GET ;
   private String AV83W_FLG ;
   private String AV84W_FLG2[] ;
   private String AV166W_GET_CRF_ID_VC ;
   private String AV85W_GAMENNM_KENSAKU ;
   private String A607TBM21_STATUS ;
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
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV95W_SESSION ;
   private SdtB792_SD00_HTML5_EXEC_INFO AV51SD_B792_SD00_HTML5_EXEC_INFO ;
   private HTMLChoice cmbavD_group ;
   private HTMLChoice cmbavD_ol_disp ;
   private HTMLChoice dynavD_sort ;
   private ICheckbox chkavD_grd_all_sel_flg ;
   private ICheckbox chkavD_grd_all_sign_ok_sel_flg ;
   private ICheckbox chkavD_grd_sel_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H001J2_A8TAS01_ITEM_CD ;
   private String[] H001J2_A9TAS01_ITEM_NM ;
   private boolean[] H001J2_n9TAS01_ITEM_NM ;
   private String[] H001J2_A7TAS01_DATA_KIND ;
   private String[] H001J2_A300TAS01_DEL_FLG ;
   private boolean[] H001J2_n300TAS01_DEL_FLG ;
   private String[] H001J3_A369TBM21_DEL_FLG ;
   private boolean[] H001J3_n369TBM21_DEL_FLG ;
   private long[] H001J3_A63TBM21_STUDY_ID ;
   private String[] H001J3_A367TBM21_STUDY_NM ;
   private boolean[] H001J3_n367TBM21_STUDY_NM ;
   private String[] H001J4_A215TAM04_DEL_FLG ;
   private boolean[] H001J4_n215TAM04_DEL_FLG ;
   private String[] H001J4_A13TAM04_AUTH_CD ;
   private String[] H001J4_A285TAM04_AUTH_NM ;
   private boolean[] H001J4_n285TAM04_AUTH_NM ;
   private short[] H001J5_AV139W_CNT_REPEAT ;
   private String[] H001J6_A982TBM45_DEL_FLG ;
   private boolean[] H001J6_n982TBM45_DEL_FLG ;
   private short[] H001J6_A978TBM45_FILTER_NO ;
   private long[] H001J6_A977TBM45_STUDY_ID ;
   private String[] H001J6_A981TBM45_IN_CRF_ID ;
   private boolean[] H001J6_n981TBM45_IN_CRF_ID ;
   private long[] H001J7_A92TBT11_STUDY_ID ;
   private int[] H001J7_A93TBT11_SUBJECT_ID ;
   private short[] H001J7_A94TBT11_CRF_ID ;
   private byte[] H001J7_A936TBT11_CRF_EDA_NO ;
   private String[] H001J7_A457TBT11_DEL_FLG ;
   private boolean[] H001J7_n457TBT11_DEL_FLG ;
   private java.util.Date[] H001J7_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] H001J7_n670TBT11_DM_ARRIVAL_DATETIME ;
   private long[] H001J7_A464TBT11_UPD_CNT ;
   private boolean[] H001J7_n464TBT11_UPD_CNT ;
   private short[] H001J7_A95TBT11_CRF_VERSION ;
   private byte[] H001J8_A935TBT02_CRF_EDA_NO ;
   private short[] H001J8_A91TBT02_CRF_ID ;
   private int[] H001J8_A90TBT02_SUBJECT_ID ;
   private long[] H001J8_A89TBT02_STUDY_ID ;
   private java.util.Date[] H001J8_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] H001J8_n656TBT02_DM_ARRIVAL_DATETIME ;
   private short[] H001J9_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] H001J9_n498TBT02_CRF_LATEST_VERSION ;
   private java.util.Date[] H001J9_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] H001J9_n656TBT02_DM_ARRIVAL_DATETIME ;
   private byte[] H001J9_A935TBT02_CRF_EDA_NO ;
   private short[] H001J9_A91TBT02_CRF_ID ;
   private int[] H001J9_A90TBT02_SUBJECT_ID ;
   private long[] H001J9_A89TBT02_STUDY_ID ;
   private String[] H001J9_A441TBT01_DEL_FLG ;
   private boolean[] H001J9_n441TBT01_DEL_FLG ;
   private String[] H001J9_A449TBT02_DEL_FLG ;
   private boolean[] H001J9_n449TBT02_DEL_FLG ;
   private String[] H001J9_A661TBT02_INPUT_END_FLG ;
   private boolean[] H001J9_n661TBT02_INPUT_END_FLG ;
   private String[] H001J9_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] H001J9_n655TBT02_DM_ARRIVAL_FLG ;
   private String[] H001J9_A698TBT01_SITE_ID ;
   private boolean[] H001J9_n698TBT01_SITE_ID ;
   private byte[] H001J9_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] H001J9_n499TBT02_CRF_INPUT_LEVEL ;
   private java.util.Date[] H001J9_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] H001J9_n652TBT02_UPLOAD_DATETIME ;
   private String[] H001J9_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] H001J9_n653TBT02_UPLOAD_USER_ID ;
   private String[] H001J9_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] H001J9_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] H001J9_A992TBT02_SIGNATURE_USER_ID ;
   private boolean[] H001J9_n992TBT02_SIGNATURE_USER_ID ;
   private java.util.Date[] H001J9_A991TBT02_SIGNATURE_DATETIME ;
   private boolean[] H001J9_n991TBT02_SIGNATURE_DATETIME ;
   private String[] H001J9_A990TBT02_SIGNATURE_FLG ;
   private boolean[] H001J9_n990TBT02_SIGNATURE_FLG ;
   private long[] H001J9_A456TBT02_UPD_CNT ;
   private boolean[] H001J9_n456TBT02_UPD_CNT ;
   private short[] H001J10_A198TBT14_MEMO_NO ;
   private long[] H001J10_A140TBT14_STUDY_ID ;
   private int[] H001J10_A142TBT14_SUBJECT_ID ;
   private short[] H001J10_A474TBT14_CRF_ID ;
   private boolean[] H001J10_n474TBT14_CRF_ID ;
   private byte[] H001J10_A941TBT14_CRF_EDA_NO ;
   private boolean[] H001J10_n941TBT14_CRF_EDA_NO ;
   private String[] H001J10_A479TBT14_DEL_FLG ;
   private boolean[] H001J10_n479TBT14_DEL_FLG ;
   private String[] H001J10_A902TBT14_KANRYO_FLG ;
   private boolean[] H001J10_n902TBT14_KANRYO_FLG ;
   private String[] H001J10_A927TBT14_KAKUNIN_FLG ;
   private boolean[] H001J10_n927TBT14_KAKUNIN_FLG ;
   private String[] H001J10_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] H001J10_n930TBT14_REQUEST_AUTH_CD ;
   private long[] H001J11_A945TBM44_STUDY_ID ;
   private short[] H001J11_A946TBM44_CRF_ID ;
   private byte[] H001J11_A947TBM44_CRF_EDA_NO ;
   private int[] H001J11_A948TBM44_VISIT_NO ;
   private boolean[] H001J11_n948TBM44_VISIT_NO ;
   private int[] H001J12_A93TBT11_SUBJECT_ID ;
   private short[] H001J12_A94TBT11_CRF_ID ;
   private byte[] H001J12_A936TBT11_CRF_EDA_NO ;
   private String[] H001J12_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] H001J12_n669TBT11_DM_ARRIVAL_FLG ;
   private long[] H001J12_A92TBT11_STUDY_ID ;
   private java.util.Date[] H001J12_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] H001J12_n670TBT11_DM_ARRIVAL_DATETIME ;
   private short[] H001J12_A95TBT11_CRF_VERSION ;
   private String[] H001J13_A8TAS01_ITEM_CD ;
   private String[] H001J13_A300TAS01_DEL_FLG ;
   private boolean[] H001J13_n300TAS01_DEL_FLG ;
   private String[] H001J13_A7TAS01_DATA_KIND ;
   private String[] H001J13_A9TAS01_ITEM_NM ;
   private boolean[] H001J13_n9TAS01_ITEM_NM ;
   private String[] H001J13_A336TAS01_CHAR_1 ;
   private boolean[] H001J13_n336TAS01_CHAR_1 ;
   private short[] H001J13_A335TAS01_SORT_NO ;
   private boolean[] H001J13_n335TAS01_SORT_NO ;
   private String[] H001J14_A982TBM45_DEL_FLG ;
   private boolean[] H001J14_n982TBM45_DEL_FLG ;
   private long[] H001J14_A977TBM45_STUDY_ID ;
   private String[] H001J14_A980TBM45_FILETR_NM ;
   private boolean[] H001J14_n980TBM45_FILETR_NM ;
   private short[] H001J14_A978TBM45_FILTER_NO ;
   private String[] H001J15_A572TBM34_DEL_FLG ;
   private boolean[] H001J15_n572TBM34_DEL_FLG ;
   private String[] H001J15_A571TBM34_DISPLAY_FLG ;
   private boolean[] H001J15_n571TBM34_DISPLAY_FLG ;
   private String[] H001J15_A30TBM34_STYDY_AUTH_CD ;
   private short[] H001J15_A29TBM34_CRF_ID ;
   private long[] H001J15_A28TBM34_STUDY_ID ;
   private String[] H001J16_A325TAM08_DEL_FLG ;
   private boolean[] H001J16_n325TAM08_DEL_FLG ;
   private String[] H001J16_A57TAM08_SITE_ID ;
   private String[] H001J16_A320TAM08_SITE_SNM ;
   private boolean[] H001J16_n320TAM08_SITE_SNM ;
   private String[] H001J17_A397TBM31_DEL_FLG ;
   private boolean[] H001J17_n397TBM31_DEL_FLG ;
   private short[] H001J17_A69TBM31_CRF_ID ;
   private long[] H001J17_A68TBM31_STUDY_ID ;
   private String[] H001J17_A642TBM31_CRF_SNM ;
   private boolean[] H001J17_n642TBM31_CRF_SNM ;
   private int[] H001J17_A395TBM31_ORDER ;
   private boolean[] H001J17_n395TBM31_ORDER ;
   private byte[] H001J17_A943TBM31_REPEAT_FLG ;
   private boolean[] H001J17_n943TBM31_REPEAT_FLG ;
   private byte[] H001J17_A944TBM31_REPEAT_MAX ;
   private boolean[] H001J17_n944TBM31_REPEAT_MAX ;
   private String[] H001J18_A55TAM07_USER_ID ;
   private String[] H001J18_A205TAM07_USER_NM ;
   private boolean[] H001J18_n205TAM07_USER_NM ;
   private String[] H001J19_A369TBM21_DEL_FLG ;
   private boolean[] H001J19_n369TBM21_DEL_FLG ;
   private long[] H001J19_A63TBM21_STUDY_ID ;
   private String[] H001J19_A607TBM21_STATUS ;
   private boolean[] H001J19_n607TBM21_STATUS ;
   private GxObjectCollection AV10D_B712_SD06_RESULT_CRF ;
   private GxObjectCollection AV49SD_B712_SD08_ICON_INFO ;
   private GxObjectCollection AV47SD_B712_SD07_INPUT_DISP ;
   private GxObjectCollection AV160W_SD_B712_SD11_C ;
   private GxObjectCollection GXv_objcol_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem1[] ;
   private GxObjectCollection GXv_objcol_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem2[] ;
   private GxObjectCollection AV151D_B712_SD06_RESULT_CRF_W ;
   private GxObjectCollection AV149SD_C712_SD10_C ;
   private GxObjectCollection AV153W_SUBJECT_ID_C ;
   private GxObjectCollection AV168SD_B720_SD02_CRF_INFO_C ;
   private GxObjectCollection AV62W_B714_SD1_CRF_INFO ;
   private GxObjectCollection AV64W_B716_SD1_CRF_INFO ;
   private GxObjectCollection AV165W_GET_CRF_ID_C ;
   private GxObjectCollection AV158W_SD_B712_SD03_C ;
   private GxObjectCollection AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ;
   private SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem AV11D_B712_SD06_RESULT_CRF_Item ;
   private SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem AV148W_B712_SD03_CRF_LIST_Item ;
   private SdtA_PAGING_SDT AV30H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT11[] ;
   private SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem AV48SD_B712_SD07_INPUT_DISP_I ;
   private SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem AV50SD_B712_SD08_ICON_INFO_I ;
   private SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem AV169SD_B720_SD02_CRF_INFO_I ;
   private SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem AV52SD_B792_SD03_OL_DISP_INFO_I ;
   private SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem AV150SD_C712_SD10_I ;
   private SdtA_LOGIN_SDT AV53W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT10[] ;
   private SdtB712_SD05_MULTI_SEL_LIST AV61W_B712_SD05_SEL4 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV57W_B712_SD05_SEL_W ;
   private SdtB712_SD05_MULTI_SEL_LIST AV59W_B712_SD05_SEL2 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV60W_B712_SD05_SEL3 ;
   private SdtB712_SD05_MULTI_SEL_LIST AV58W_B712_SD05_SEL1 ;
   private SdtB712_SD09_CRF_ADD AV132W_B712_SD09_CRF_ADD ;
   private SdtB714_SD1_CRF_INFO_B714_SD1_CRF_INFOItem AV63W_B714_SD1_CRF_INFO_Item ;
   private SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem AV65W_B716_SD1_CRF_INFO_Item ;
   private SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem AV159W_SD_B712_SD03_I ;
   private SdtB712_SD11_SUBJECT_CRF_B712_SD11_SUBJECT_CRFItem AV161W_SD_B712_SD11_I ;
}

final  class b712_wp02_result_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001J9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          short A91TBT02_CRF_ID ,
                                          GxObjectCollection AV165W_GET_CRF_ID_C ,
                                          String A698TBT01_SITE_ID ,
                                          int AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size ,
                                          String AV90W_P_KANI_KENSAKU ,
                                          short AV94W_SEL_PTN ,
                                          GxObjectCollection AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code ,
                                          String A655TBT02_DM_ARRIVAL_FLG ,
                                          java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ,
                                          String A661TBT02_INPUT_END_FLG ,
                                          String A449TBT02_DEL_FLG ,
                                          String A441TBT01_DEL_FLG ,
                                          long AV44P_STUDY_ID ,
                                          int AV163W_GET_SUBJECT_ID ,
                                          long A89TBT02_STUDY_ID ,
                                          int A90TBT02_SUBJECT_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int12 ;
      GXv_int12 = new byte [2] ;
      Object[] GXv_Object13 ;
      GXv_Object13 = new Object [2] ;
      scmdbuf = "SELECT T1.`TBT02_CRF_LATEST_VERSION`, T1.`TBT02_DM_ARRIVAL_DATETIME`, T1.`TBT02_CRF_EDA_NO`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_CRF_ID`, T1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, T1.`TBT02_STUDY_ID`" ;
      scmdbuf = scmdbuf + " AS TBT02_STUDY_ID, T2.`TBT01_DEL_FLG`, T1.`TBT02_DEL_FLG`, T1.`TBT02_INPUT_END_FLG`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_DM_ARRIVAL_FLG`, T2.`TBT01_SITE_ID`, T1.`TBT02_CRF_INPUT_LEVEL`, T1.`TBT02_UPLOAD_DATETIME`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_UPLOAD_USER_ID`, T1.`TBT02_UPLOAD_AUTH_CD`, T1.`TBT02_SIGNATURE_USER_ID`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_SIGNATURE_DATETIME`, T1.`TBT02_SIGNATURE_FLG`, T1.`TBT02_UPD_CNT` FROM" ;
      scmdbuf = scmdbuf + " (`TBT02_CRF` T1 INNER JOIN `TBT01_SUBJECT` T2 ON T2.`TBT01_STUDY_ID` = T1.`TBT02_STUDY_ID`" ;
      scmdbuf = scmdbuf + " AND T2.`TBT01_SUBJECT_ID` = T1.`TBT02_SUBJECT_ID`)" ;
      scmdbuf = scmdbuf + " WHERE (T1.`TBT02_STUDY_ID` = ? and T1.`TBT02_SUBJECT_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV165W_GET_CRF_ID_C, "T1.`TBT02_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + " and (T1.`TBT02_DEL_FLG` = '0')" ;
      scmdbuf = scmdbuf + " and (T2.`TBT01_DEL_FLG` = '0')" ;
      if ( AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code_size != 0 )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV58W_B712_SD05_SEL1_getgxTv_SdtB712_SD05_MULTI_SEL_LIST_Select_code, "T2.`TBT01_SITE_ID` IN (", ")") + ")" ;
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
      scmdbuf = scmdbuf + " ORDER BY T1.`TBT02_STUDY_ID`, T1.`TBT02_SUBJECT_ID`" ;
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
            case 7 :
                  return conditional_H001J9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (GxObjectCollection)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001J2", "SELECT `TAS01_ITEM_CD`, `TAS01_ITEM_NM`, `TAS01_DATA_KIND`, `TAS01_DEL_FLG` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B11') AND (`TAS01_DEL_FLG` = '0') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H001J3", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J4", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE (`TAM04_AUTH_CD` = ?) AND (`TAM04_DEL_FLG` = '0') ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J5", "SELECT COUNT(*) FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H001J6", "SELECT `TBM45_DEL_FLG`, `TBM45_FILTER_NO`, `TBM45_STUDY_ID`, `TBM45_IN_CRF_ID` FROM `TBM45_CRF_FILETR` WHERE (`TBM45_STUDY_ID` = ? and `TBM45_FILTER_NO` = ?) AND (`TBM45_DEL_FLG` = '0') ORDER BY `TBM45_STUDY_ID`, `TBM45_FILTER_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J7", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_DEL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_UPD_CNT`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (Not (`TBT11_DM_ARRIVAL_DATETIME` = '1000-01-01')) AND (`TBT11_STUDY_ID` = ?) AND (`TBT11_SUBJECT_ID` = ?) AND (`TBT11_CRF_ID` = ?) AND (`TBT11_CRF_EDA_NO` = ?) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_CRF_VERSION` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001J8", "SELECT `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_DM_ARRIVAL_DATETIME` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001J10", "SELECT `TBT14_MEMO_NO`, `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_CRF_ID`, `TBT14_CRF_EDA_NO`, `TBT14_DEL_FLG`, `TBT14_KANRYO_FLG`, `TBT14_KAKUNIN_FLG`, `TBT14_REQUEST_AUTH_CD` FROM `TBT14_CRF_MEMO` WHERE (`TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ?) AND (`TBT14_CRF_ID` = ?) AND (`TBT14_CRF_EDA_NO` = ?) AND (`TBT14_REQUEST_AUTH_CD` = ?) AND (`TBT14_KAKUNIN_FLG` = '0') AND (`TBT14_KANRYO_FLG` = '0') AND (`TBT14_DEL_FLG` = '0') ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J11", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J12", "SELECT `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_STUDY_ID`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? and `TBT11_CRF_EDA_NO` = ?) AND (`TBT11_DM_ARRIVAL_FLG` = '1') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J13", "SELECT `TAS01_ITEM_CD`, `TAS01_DEL_FLG`, `TAS01_DATA_KIND`, `TAS01_ITEM_NM`, `TAS01_CHAR_1`, `TAS01_SORT_NO` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B10') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_SORT_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001J14", "SELECT `TBM45_DEL_FLG`, `TBM45_STUDY_ID`, `TBM45_FILETR_NM`, `TBM45_FILTER_NO` FROM `TBM45_CRF_FILETR` WHERE (`TBM45_STUDY_ID` = ?) AND (`TBM45_DEL_FLG` = '0') ORDER BY `TBM45_STUDY_ID`, `TBM45_FILTER_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001J15", "SELECT `TBM34_DEL_FLG`, `TBM34_DISPLAY_FLG`, `TBM34_STYDY_AUTH_CD`, `TBM34_CRF_ID`, `TBM34_STUDY_ID` FROM `TBM34_CRF_AUTH` WHERE (`TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ? and `TBM34_STYDY_AUTH_CD` = '01') AND (`TBM34_DISPLAY_FLG` = '0') AND (`TBM34_DEL_FLG` = '0') ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`, `TBM34_STYDY_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J16", "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID`, `TAM08_SITE_SNM` FROM `TAM08_SITE` WHERE (`TAM08_SITE_ID` = ?) AND (`TAM08_DEL_FLG` = '0') ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J17", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM`, `TBM31_ORDER`, `TBM31_REPEAT_FLG`, `TBM31_REPEAT_MAX` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J18", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001J19", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8) ;
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3) ;
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((long[]) buf[32])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((long[]) buf[6])[0] = rslt.getLong(5) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
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
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 2);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

