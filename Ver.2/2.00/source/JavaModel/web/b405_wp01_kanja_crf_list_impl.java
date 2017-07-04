/*
               File: b405_wp01_kanja_crf_list_impl
        Description: 患者別使用CRF選択
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:18:7.22
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b405_wp01_kanja_crf_list_impl extends GXWebPanel
{
   public b405_wp01_kanja_crf_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b405_wp01_kanja_crf_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b405_wp01_kanja_crf_list_impl.class ));
   }

   public b405_wp01_kanja_crf_list_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_study_id = new HTMLChoice();
      chkavW_crf_sel_only = UIFactory.getCheckbox(this);
      chkavD_grd_chk_all = UIFactory.getCheckbox(this);
      chkavD_grd1_check = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grd_title") == 0 )
         {
            nRC_GXsfl_167 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_167_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_167_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrd_title_newrow( nRC_GXsfl_167, nGXsfl_167_idx, sGXsfl_167_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_195 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_195_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_195_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_GXsfl_195, nGXsfl_195_idx, sGXsfl_195_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_176 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_176_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_176_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_176, nGXsfl_176_idx, sGXsfl_176_idx) ;
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
            AV24P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24P_MOVE_KBN", GXutil.str( AV24P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV23P_COL_COUNT = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23P_COL_COUNT", GXutil.ltrim( GXutil.str( AV23P_COL_COUNT, 4, 0)));
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
         pa1D2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1D2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1D2( ) ;
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
      httpContext.writeValue( "患者別使用CRF選択") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?2017731718762");
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
      GXEncryptionTmp = "b405_wp01_kanja_crf_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV24P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_COL_COUNT,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b405_wp01_kanja_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1D2( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV22H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DISP_DATETIME", GXutil.rtrim( AV19H_DISP_DATETIME));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV17H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV17H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_167", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_167, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_176", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_176, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV50Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_TAM02_APP_ID", GXutil.rtrim( AV8C_TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV24P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_DEL_FLG", GXutil.rtrim( A369TBM21_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A88TBT01_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A87TBT01_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_OUTER_SUBJECT_ID", GXutil.rtrim( A647TBT01_OUTER_SUBJECT_ID));
      GxWebStd.gx_hidden_field( httpContext, "TBT01_DEL_FLG", GXutil.rtrim( A441TBT01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STATUS", GXutil.rtrim( A643TBM31_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DEL_FLG", GXutil.rtrim( A397TBM31_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A89TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( A90TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_ID", GXutil.ltrim( localUtil.ntoc( A91TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A935TBT02_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT02_CRF_LATEST_VERSION", GXutil.ltrim( localUtil.ntoc( A498TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_A_LOGIN_SDT", AV25W_A_LOGIN_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_A_LOGIN_SDT", AV25W_A_LOGIN_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "vW_ERR_MSG", GXutil.rtrim( AV34W_ERR_MSG));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_SNM", GXutil.rtrim( A642TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "vP_COL_COUNT", GXutil.ltrim( localUtil.ntoc( AV23P_COL_COUNT, (byte)(4), (byte)(0), ".", "")));
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
      return "B405_WP01_KANJA_CRF_LIST" ;
   }

   public String getPgmdesc( )
   {
      return "患者別使用CRF選択" ;
   }

   public void wb1D0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1D2( true) ;
      }
      else
      {
         wb_table1_2_1D2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_206_1D2( true) ;
      }
      else
      {
         wb_table2_206_1D2( false) ;
      }
      return  ;
   }

   public void wb_table2_206_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1D2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "患者別使用CRF選択", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0204") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0204", "");
         }
      }
      wbErr = false ;
      strup1D0( ) ;
   }

   public void ws1D2( )
   {
      start1D2( ) ;
      evt1D2( ) ;
   }

   public void evt1D2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_AUTO_SEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111D2 */
                        e111D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121D2 */
                        e121D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131D2 */
                        e131D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD_CHK_ALL.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141D2 */
                        e141D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151D2 */
                        e151D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161D2 */
                        e161D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171D2 */
                        e171D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181D2 */
                        e181D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191D2 */
                        e191D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201D2 */
                        e201D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211D2 */
                        e211D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221D2 */
                        e221D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231D2 */
                        e231D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241D2 */
                        e241D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251D2 */
                        e251D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261D2 */
                        e261D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271D2 */
                        e271D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281D2 */
                        e281D2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "GRD_TITLE.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_167_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_167_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_167_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1672( ) ;
                        AV10D_CRFSNM = httpContext.cgiGet( edtavD_crfsnm_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0204") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0204", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0204") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0204", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e291D2 */
                              e291D2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e301D2 */
                              e301D2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRD_TITLE.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e311D2 */
                              e311D2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 /* Set Refresh If H_srch_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV22H_SRCH_FLG) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_disp_datetime Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DISP_DATETIME"), AV19H_DISP_DATETIME) != 0 )
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
                     else if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "BTN_SEL.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "BTN_SEL.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) )
                     {
                        nGXsfl_176_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1764( ) ;
                        AV12D_GRD1_CHECK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd1_check.getInternalname())) ;
                        AV13D_GRD1_HIKENSHA = httpContext.cgiGet( edtavD_grd1_hikensha_Internalname) ;
                        A54TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e321D4 */
                              e321D4 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "BTN_SEL.CLICK") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e331D2 */
                              e331D2 ();
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
                           if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 )
                           {
                              nGXsfl_195_idx = (short)(GXutil.lval( sEvtType)) ;
                              sGXsfl_195_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_195_idx, 4, 0)), (short)(4), "0") + sGXsfl_176_idx ;
                              subsflControlProps_1955( ) ;
                              AV14D_GRD2_CRF_STATUS = httpContext.cgiGet( edtavD_grd2_crf_status_Internalname) ;
                              sEvtType = GXutil.right( sEvt, 1) ;
                              if ( GXutil.strcmp(sEvtType, ".") == 0 )
                              {
                                 sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                                 if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    dynload_actions( ) ;
                                    /* Execute user event: e341D5 */
                                    e341D5 ();
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
                  else if ( nCmpId == 204 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0204") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0204", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1D2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1D2( ) ;
         }
      }
   }

   public void pa1D2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b405_wp01_kanja_crf_list")), "b405_wp01_kanja_crf_list") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b405_wp01_kanja_crf_list"))) ;
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
                  AV24P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV24P_MOVE_KBN", GXutil.str( AV24P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV23P_COL_COUNT = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV23P_COL_COUNT", GXutil.ltrim( GXutil.str( AV23P_COL_COUNT, 4, 0)));
                  }
               }
            }
         }
         cmbavD_study_id.setName( "vD_STUDY_ID" );
         cmbavD_study_id.setWebtags( "" );
         if ( cmbavD_study_id.getItemCount() > 0 )
         {
            AV15D_STUDY_ID = GXutil.lval( cmbavD_study_id.getValidValue(GXutil.trim( GXutil.str( AV15D_STUDY_ID, 10, 0)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15D_STUDY_ID", GXutil.ltrim( GXutil.str( AV15D_STUDY_ID, 10, 0)));
         }
         chkavW_crf_sel_only.setName( "vW_CRF_SEL_ONLY" );
         chkavW_crf_sel_only.setWebtags( "" );
         chkavW_crf_sel_only.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavW_crf_sel_only.getInternalname(), "Caption", chkavW_crf_sel_only.getCaption());
         chkavW_crf_sel_only.setCheckedValue( "false" );
         chkavD_grd_chk_all.setName( "vD_GRD_CHK_ALL" );
         chkavD_grd_chk_all.setWebtags( "" );
         chkavD_grd_chk_all.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd_chk_all.getInternalname(), "Caption", chkavD_grd_chk_all.getCaption());
         chkavD_grd_chk_all.setCheckedValue( "false" );
         GXCCtl = "vD_GRD1_CHECK_" + sGXsfl_176_idx ;
         chkavD_grd1_check.setName( GXCCtl );
         chkavD_grd1_check.setWebtags( "" );
         chkavD_grd1_check.setCaption( "" );
         chkavD_grd1_check.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrd_title_newrow( short nRC_GXsfl_167 ,
                                     short nGXsfl_167_idx ,
                                     String sGXsfl_167_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1672( ) ;
      while ( nGXsfl_167_idx <= nRC_GXsfl_167 )
      {
         sendrow_1672( ) ;
         nGXsfl_167_idx = (short)(((subGrd_title_Islastpage==1)&&(nGXsfl_167_idx+1>subgrd_title_recordsperpage( )) ? 1 : nGXsfl_167_idx+1)) ;
         sGXsfl_167_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_167_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1672( ) ;
      }
      httpContext.GX_webresponse.addString(Grd_titleContainer.ToJavascriptSource());
      /* End function gxnrGrd_title_newrow */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_176 ,
                                 short nGXsfl_176_idx ,
                                 String sGXsfl_176_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1764( ) ;
      while ( nGXsfl_176_idx <= nRC_GXsfl_176 )
      {
         sendrow_1764( ) ;
         nGXsfl_176_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_176_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_176_idx+1)) ;
         sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1764( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( short nRC_GXsfl_195 ,
                                 short nGXsfl_195_idx ,
                                 String sGXsfl_195_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1955( ) ;
      while ( nGXsfl_195_idx <= nRC_GXsfl_195 )
      {
         sendrow_1955( ) ;
         nGXsfl_195_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_195_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_195_idx+1)) ;
         sGXsfl_195_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_195_idx, 4, 0)), (short)(4), "0") + sGXsfl_176_idx ;
         subsflControlProps_1955( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void refresh( )
   {
      rf1D2( ) ;
      rf1D4( ) ;
      /* End function Refresh */
   }

   public void rf1D2( )
   {
      Grd_titleContainer.AddObjectProperty("GridName", "Grd_title");
      Grd_titleContainer.AddObjectProperty("CmpContext", "");
      Grd_titleContainer.AddObjectProperty("InMasterPage", "false");
      Grd_titleContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
      Grd_titleContainer.AddObjectProperty("Align", GXutil.rtrim( "left"));
      Grd_titleContainer.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grd_titleContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grd_titleContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grd_titleContainer.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grd_titleContainer.AddObjectProperty("Class", "FreeStyleGridBase");
      Grd_titleContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grd_titleContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grd_titleContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrd_title_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grd_titleContainer.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrd_title_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(167) ;
      nGXsfl_167_idx = (short)(1) ;
      sGXsfl_167_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_167_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1672( ) ;
      nGXsfl_167_Refreshing = (short)(1) ;
      /* Execute user event: e301D2 */
      e301D2 ();
      Grd_titleContainer.setPageSize( subgrd_title_recordsperpage( ) );
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
         subsflControlProps_1672( ) ;
         /* Execute user event: e311D2 */
         e311D2 ();
         wbEnd = (short)(167) ;
         wb1D0( ) ;
      }
      nGXsfl_167_Refreshing = (short)(0) ;
   }

   public void rf1D4( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGridBase");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(176) ;
      nGXsfl_176_idx = (short)(1) ;
      sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1764( ) ;
      nGXsfl_176_Refreshing = (short)(1) ;
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1764( ) ;
         GXPagingFrom4 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo4 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         /* Using cursor H001D2 */
         pr_default.execute(0, new Object[] {AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME, AV22H_SRCH_FLG, new Integer(GXPagingFrom4), new Long(GXPagingTo4)});
         nGXsfl_176_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A53TBW01_DISP_DATETIME = H001D2_A53TBW01_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
            A52TBW01_APP_ID = H001D2_A52TBW01_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
            A51TBW01_SESSION_ID = H001D2_A51TBW01_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
            A685TBW01_FREE_SAVE_1 = H001D2_A685TBW01_FREE_SAVE_1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A685TBW01_FREE_SAVE_1", A685TBW01_FREE_SAVE_1);
            n685TBW01_FREE_SAVE_1 = H001D2_n685TBW01_FREE_SAVE_1[0] ;
            A54TBW01_LINE_NO = H001D2_A54TBW01_LINE_NO[0] ;
            /* Execute user event: e321D4 */
            e321D4 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(176) ;
         wb1D0( ) ;
      }
      nGXsfl_176_Refreshing = (short)(0) ;
   }

   public void rf1D5( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
      Grid2Container.AddObjectProperty("Align", GXutil.rtrim( "left"));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid2Container.AddObjectProperty("Class", "FreeStyleGridBase");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(195) ;
      nGXsfl_195_idx = (short)(1) ;
      sGXsfl_195_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_195_idx, 4, 0)), (short)(4), "0") + sGXsfl_176_idx ;
      subsflControlProps_1955( ) ;
      nGXsfl_195_Refreshing = (short)(1) ;
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1955( ) ;
         /* Execute user event: e341D5 */
         e341D5 ();
         wbEnd = (short)(195) ;
         wb1D0( ) ;
      }
      nGXsfl_195_Refreshing = (short)(0) ;
   }

   public int subgrd_title_pagecount( )
   {
      return -1 ;
   }

   public int subgrd_title_recordcount( )
   {
      return -1 ;
   }

   public int subgrd_title_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrd_title_currentpage( )
   {
      return -1 ;
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
      /* Using cursor H001D3 */
      pr_default.execute(1, new Object[] {AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME, AV22H_SRCH_FLG});
      GRID1_nRecordCount = H001D3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
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
      GRID1_IsPaging = 1 ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
         GRID1_IsPaging = 1 ;
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
         GRID1_IsPaging = 1 ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_IsPaging = 1 ;
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
      GRID1_IsPaging = 1 ;
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

   public void strup1D0( )
   {
      /* Before Start, stand alone formulas. */
      AV50Pgmname = "B405_WP01_KANJA_CRF_LIST" ;
      Gx_err = (short)(0) ;
      edtavD_crfsnm_Enabled = 0 ;
      edtavD_grd1_hikensha_Enabled = 0 ;
      edtavD_grd2_crf_status_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e291D2 */
      e291D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV17H_A_PAGING_SDT);
         /* Read variables values. */
         cmbavD_study_id.setName( cmbavD_study_id.getInternalname() );
         cmbavD_study_id.setValue( httpContext.cgiGet( cmbavD_study_id.getInternalname()) );
         AV15D_STUDY_ID = GXutil.lval( httpContext.cgiGet( cmbavD_study_id.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15D_STUDY_ID", GXutil.ltrim( GXutil.str( AV15D_STUDY_ID, 10, 0)));
         AV16D_TBT01_OUTER_SUBJECT_ID = httpContext.cgiGet( edtavD_tbt01_outer_subject_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16D_TBT01_OUTER_SUBJECT_ID", AV16D_TBT01_OUTER_SUBJECT_ID);
         AV9W_CRF_SEL_ONLY = GXutil.strtobool( httpContext.cgiGet( chkavW_crf_sel_only.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9W_CRF_SEL_ONLY", AV9W_CRF_SEL_ONLY);
         AV11D_GRD_CHK_ALL = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_chk_all.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_CHK_ALL", AV11D_GRD_CHK_ALL);
         AV20H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
         AV22H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22H_SRCH_FLG", AV22H_SRCH_FLG);
         AV21H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
         AV19H_DISP_DATETIME = httpContext.cgiGet( edtavH_disp_datetime_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_col_count_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_col_count_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_COL_COUNT");
            GX_FocusControl = edtavH_col_count_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18H_COL_COUNT = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18H_COL_COUNT", GXutil.ltrim( GXutil.str( AV18H_COL_COUNT, 4, 0)));
         }
         else
         {
            AV18H_COL_COUNT = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_col_count_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18H_COL_COUNT", GXutil.ltrim( GXutil.str( AV18H_COL_COUNT, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         /* Read saved values. */
         nRC_GXsfl_167 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_167"), ".", ",")) ;
         nRC_GXsfl_176 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_176"), ".", ",")) ;
         AV24P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV23P_COL_COUNT = (short)(localUtil.ctol( httpContext.cgiGet( "vP_COL_COUNT"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0204") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0204", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV22H_SRCH_FLG) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DISP_DATETIME"), AV19H_DISP_DATETIME) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e291D2 */
      e291D2 ();
      if (returnInSub) return;
   }

   public void e291D2( )
   {
      /* Start Routine */
      AV8C_TAM02_APP_ID = "B405" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
      AV7C_GAMEN_TITLE = "患者別使用CRF選択" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_GAMEN_TITLE", AV7C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV20H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( (GXutil.strcmp("", AV19H_DISP_DATETIME)==0) )
      {
         GXt_char1 = AV19H_DISP_DATETIME ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
         b405_wp01_kanja_crf_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19H_DISP_DATETIME = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
      }
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Object Property */
      if ( GXutil.strcmp(GXutil.lower( WebComp_Webcomp1_Component), GXutil.lower( "A104_WP01_HEADER")) != 0 )
      {
         WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "a104_wp01_header_impl", remoteHandle, context);
         WebComp_Webcomp1_Component = "A104_WP01_HEADER" ;
      }
      if ( GXutil.strcmp(GXutil.lower( OldWebcomp1), GXutil.lower( WebComp_Webcomp1_Component)) != 0 )
      {
         WebComp_Webcomp1.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV25W_A_LOGIN_SDT,AV8C_TAM02_APP_ID,AV7C_GAMEN_TITLE,AV19H_DISP_DATETIME});
         WebComp_Webcomp1.componentbind(new Object[] {"","","","vH_DISP_DATETIME"});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0204",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      tblTbl_list_Width = (int)(200+150*AV23P_COL_COUNT) ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Width", GXutil.ltrim( GXutil.str( tblTbl_list_Width, 9, 0)));
   }

   public void e301D2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV20H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV50Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV20H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
   }

   private void e311D2( )
   {
      /* Grd_title_Load Routine */
      AV18H_COL_COUNT = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_COL_COUNT", GXutil.ltrim( GXutil.str( AV18H_COL_COUNT, 4, 0)));
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           new Long(AV15D_STUDY_ID) ,
                                           new Long(A68TBM31_STUDY_ID) ,
                                           new Short(A69TBM31_CRF_ID) ,
                                           A643TBM31_STATUS ,
                                           A397TBM31_DEL_FLG },
                                           new int[] {
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H001D4 */
      pr_default.execute(2, new Object[] {new Long(AV15D_STUDY_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A397TBM31_DEL_FLG = H001D4_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = H001D4_n397TBM31_DEL_FLG[0] ;
         A643TBM31_STATUS = H001D4_A643TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
         n643TBM31_STATUS = H001D4_n643TBM31_STATUS[0] ;
         A69TBM31_CRF_ID = H001D4_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A68TBM31_STUDY_ID = H001D4_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A642TBM31_CRF_SNM = H001D4_A642TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
         n642TBM31_CRF_SNM = H001D4_n642TBM31_CRF_SNM[0] ;
         AV18H_COL_COUNT = (short)(AV18H_COL_COUNT+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_COL_COUNT", GXutil.ltrim( GXutil.str( AV18H_COL_COUNT, 4, 0)));
         AV10D_CRFSNM = A642TBM31_CRF_SNM ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(167) ;
         }
         sendrow_1672( ) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      tblTbl_list_Width = (int)(200+150*AV18H_COL_COUNT) ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Width", GXutil.ltrim( GXutil.str( tblTbl_list_Width, 9, 0)));
   }

   public void e111D2( )
   {
      /* 'BTN_AUTO_SEL' Routine */
      AV34W_ERR_MSG = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34W_ERR_MSG", AV34W_ERR_MSG);
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      /* Using cursor H001D5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A58TBM01_SYS_ID = H001D5_A58TBM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
         A608TBM01_SYS_VALUE = H001D5_A608TBM01_SYS_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
         n608TBM01_SYS_VALUE = H001D5_n608TBM01_SYS_VALUE[0] ;
         AV42W_SYS_CRFID = A608TBM01_SYS_VALUE ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42W_SYS_CRFID", AV42W_SYS_CRFID);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV33W_CRFID_COLS.clear();
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           new Long(AV15D_STUDY_ID) ,
                                           new Long(A68TBM31_STUDY_ID) ,
                                           new Short(A69TBM31_CRF_ID) ,
                                           A643TBM31_STATUS ,
                                           A397TBM31_DEL_FLG },
                                           new int[] {
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H001D6 */
      pr_default.execute(4, new Object[] {new Long(AV15D_STUDY_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A397TBM31_DEL_FLG = H001D6_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = H001D6_n397TBM31_DEL_FLG[0] ;
         A643TBM31_STATUS = H001D6_A643TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
         n643TBM31_STATUS = H001D6_n643TBM31_STATUS[0] ;
         A69TBM31_CRF_ID = H001D6_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A68TBM31_STUDY_ID = H001D6_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         AV33W_CRFID_COLS.add((short)(A69TBM31_CRF_ID), 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor H001D7 */
      pr_default.execute(5, new Object[] {AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A53TBW01_DISP_DATETIME = H001D7_A53TBW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
         A52TBW01_APP_ID = H001D7_A52TBW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
         A51TBW01_SESSION_ID = H001D7_A51TBW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
         A685TBW01_FREE_SAVE_1 = H001D7_A685TBW01_FREE_SAVE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685TBW01_FREE_SAVE_1", A685TBW01_FREE_SAVE_1);
         n685TBW01_FREE_SAVE_1 = H001D7_n685TBW01_FREE_SAVE_1[0] ;
         AV27W_B405_WP01_SD01.fromxml(A685TBW01_FREE_SAVE_1, "");
         if ( ( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Chk() ) && ( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Chk_visbale() ) )
         {
            AV31W_COND_OK = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31W_COND_OK", AV31W_COND_OK);
            /* Using cursor H001D8 */
            pr_default.execute(6, new Object[] {AV42W_SYS_CRFID, new Long(AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id())});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A76TBM33_STUDY_ID = H001D8_A76TBM33_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A76TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A76TBM33_STUDY_ID, 10, 0)));
               A416TBM33_DEL_FLG = H001D8_A416TBM33_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A416TBM33_DEL_FLG", A416TBM33_DEL_FLG);
               n416TBM33_DEL_FLG = H001D8_n416TBM33_DEL_FLG[0] ;
               A78TBM33_COND_NO = H001D8_A78TBM33_COND_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A78TBM33_COND_NO", GXutil.ltrim( GXutil.str( A78TBM33_COND_NO, 4, 0)));
               A77TBM33_CRF_ID = H001D8_A77TBM33_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A77TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A77TBM33_CRF_ID, 4, 0)));
               A414TBM33_EXPRESSION = H001D8_A414TBM33_EXPRESSION[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A414TBM33_EXPRESSION", A414TBM33_EXPRESSION);
               n414TBM33_EXPRESSION = H001D8_n414TBM33_EXPRESSION[0] ;
               A415TBM33_PRIOR_NO = H001D8_A415TBM33_PRIOR_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A415TBM33_PRIOR_NO", GXutil.ltrim( GXutil.str( A415TBM33_PRIOR_NO, 2, 0)));
               n415TBM33_PRIOR_NO = H001D8_n415TBM33_PRIOR_NO[0] ;
               AV30W_COND_HYOKA = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30W_COND_HYOKA", GXutil.ltrim( GXutil.str( AV30W_COND_HYOKA, 4, 0)));
               if ( ! (GXutil.strcmp("", A414TBM33_EXPRESSION)==0) )
               {
                  GXv_int3[0] = AV30W_COND_HYOKA ;
                  GXv_char2[0] = "" ;
                  new b405_pc01_cond_hyoka(remoteHandle, context).execute( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id(), AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id(), A414TBM33_EXPRESSION, GXv_int3, GXv_char2) ;
                  b405_wp01_kanja_crf_list_impl.this.AV30W_COND_HYOKA = GXv_int3[0] ;
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
                  httpContext.ajax_rsp_assign_attri("", false, "A414TBM33_EXPRESSION", A414TBM33_EXPRESSION);
                  httpContext.ajax_rsp_assign_attri("", false, "AV30W_COND_HYOKA", GXutil.ltrim( GXutil.str( AV30W_COND_HYOKA, 4, 0)));
               }
               if ( ( AV30W_COND_HYOKA > 0 ) || (GXutil.strcmp("", A414TBM33_EXPRESSION)==0) )
               {
                  pr_default.dynParam(7, new Object[]{ new Object[]{
                                                       new Short(A38TBM36_SELECT_CRF_ID) ,
                                                       AV33W_CRFID_COLS ,
                                                       A589TBM36_DEL_FLG ,
                                                       new Long(A76TBM33_STUDY_ID) ,
                                                       new Short(A77TBM33_CRF_ID) ,
                                                       new Short(A78TBM33_COND_NO) ,
                                                       new Long(A35TBM36_STUDY_ID) ,
                                                       new Short(A36TBM36_CRF_ID) ,
                                                       new Short(A37TBM36_COND_NO) },
                                                       new int[] {
                                                       TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.SHORT
                                                       }
                  });
                  /* Using cursor H001D9 */
                  pr_default.execute(7, new Object[] {new Long(A76TBM33_STUDY_ID), new Short(A77TBM33_CRF_ID), new Short(A78TBM33_COND_NO)});
                  while ( (pr_default.getStatus(7) != 101) )
                  {
                     A35TBM36_STUDY_ID = H001D9_A35TBM36_STUDY_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A35TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A35TBM36_STUDY_ID, 10, 0)));
                     A36TBM36_CRF_ID = H001D9_A36TBM36_CRF_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A36TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A36TBM36_CRF_ID, 4, 0)));
                     A37TBM36_COND_NO = H001D9_A37TBM36_COND_NO[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A37TBM36_COND_NO", GXutil.ltrim( GXutil.str( A37TBM36_COND_NO, 4, 0)));
                     A38TBM36_SELECT_CRF_ID = H001D9_A38TBM36_SELECT_CRF_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A38TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A38TBM36_SELECT_CRF_ID, 4, 0)));
                     A589TBM36_DEL_FLG = H001D9_A589TBM36_DEL_FLG[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A589TBM36_DEL_FLG", A589TBM36_DEL_FLG);
                     n589TBM36_DEL_FLG = H001D9_n589TBM36_DEL_FLG[0] ;
                     AV6BC_TBT02_CRF = (SdtTBT02_CRF)new SdtTBT02_CRF( remoteHandle, context);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( AV50Pgmname );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_study_id( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( A38TBM36_SELECT_CRF_ID );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no( (byte)(1) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( (short)(0) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( (byte)(1) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( "0" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg( "0" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( "0" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_del_flg( "0" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.Save();
                     if ( AV6BC_TBT02_CRF.Success() )
                     {
                     }
                     else
                     {
                        GXt_char1 = AV34W_ERR_MSG ;
                        GXv_char2[0] = GXt_char1 ;
                        new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char2) ;
                        b405_wp01_kanja_crf_list_impl.this.GXt_char1 = GXv_char2[0] ;
                        AV34W_ERR_MSG = GXt_char1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV34W_ERR_MSG", AV34W_ERR_MSG);
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                     pr_default.readNext(7);
                  }
                  pr_default.close(7);
                  AV31W_COND_OK = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV31W_COND_OK", AV31W_COND_OK);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(6);
            }
            pr_default.close(6);
            if ( ! AV31W_COND_OK && ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 ) )
            {
               AV58GXV3 = 1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58GXV3", GXutil.ltrim( GXutil.str( AV58GXV3, 8, 0)));
               while ( AV58GXV3 <= AV33W_CRFID_COLS.size() )
               {
                  AV32W_CRFID_COL = ((Number) AV33W_CRFID_COLS.elementAt(-1+AV58GXV3)).shortValue() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32W_CRFID_COL", GXutil.ltrim( GXutil.str( AV32W_CRFID_COL, 4, 0)));
                  AV6BC_TBT02_CRF = (SdtTBT02_CRF)new SdtTBT02_CRF( remoteHandle, context);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( AV50Pgmname );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_study_id( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( AV32W_CRFID_COL );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no( (byte)(1) );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( (short)(0) );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( (byte)(1) );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_del_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.Save();
                  if ( AV6BC_TBT02_CRF.Success() )
                  {
                  }
                  else
                  {
                     GXt_char1 = AV34W_ERR_MSG ;
                     GXv_char2[0] = GXt_char1 ;
                     new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char2) ;
                     b405_wp01_kanja_crf_list_impl.this.GXt_char1 = GXv_char2[0] ;
                     AV34W_ERR_MSG = GXt_char1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV34W_ERR_MSG", AV34W_ERR_MSG);
                     if (true) break;
                  }
                  AV58GXV3 = (int)(AV58GXV3+1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV58GXV3", GXutil.ltrim( GXutil.str( AV58GXV3, 8, 0)));
               }
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         new b805_pc01_work_del(remoteHandle, context).execute( AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
      }
   }

   public void e121D2( )
   {
      /* 'BTN_SRCH' Routine */
      new b805_pc01_work_del(remoteHandle, context).execute( AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
      AV22H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22H_SRCH_FLG", AV22H_SRCH_FLG);
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
   }

   public void e131D2( )
   {
      /* 'BTN_CLER' Routine */
      new b805_pc01_work_del(remoteHandle, context).execute( AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
   }

   public void e331D2( )
   {
      /* Btn_sel_Click Routine */
      AV40W_SEL_LINE_NO = (short)(A54TBW01_LINE_NO) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40W_SEL_LINE_NO", GXutil.ltrim( GXutil.str( AV40W_SEL_LINE_NO, 4, 0)));
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
      {
         AV41W_SESSION.setValue(AV50Pgmname+"_PAGE", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b405_wp02_kanja_crf_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18H_COL_COUNT,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id())) + "," + GXutil.URLEncode(GXutil.rtrim(AV8C_TAM02_APP_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV19H_DISP_DATETIME)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV40W_SEL_LINE_NO,4,0))) ;
         httpContext.wjLoc = formatLink("b405_wp02_kanja_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
      }
   }

   public void e141D2( )
   {
      /* D_grd_chk_all_Click Routine */
      /* Using cursor H001D10 */
      pr_default.execute(8, new Object[] {AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A53TBW01_DISP_DATETIME = H001D10_A53TBW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
         A52TBW01_APP_ID = H001D10_A52TBW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
         A51TBW01_SESSION_ID = H001D10_A51TBW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
         A54TBW01_LINE_NO = H001D10_A54TBW01_LINE_NO[0] ;
         AV27W_B405_WP01_SD01 = (SdtB405_SD01)new SdtB405_SD01(remoteHandle, context);
         AV5BC_FREE_WORK.Load(AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME, A54TBW01_LINE_NO);
         if ( AV5BC_FREE_WORK.Fail() )
         {
            GXt_char1 = AV34W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
            b405_wp01_kanja_crf_list_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34W_ERR_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34W_ERR_MSG", AV34W_ERR_MSG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV27W_B405_WP01_SD01.fromxml(AV5BC_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1(), "");
         AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk( AV11D_GRD_CHK_ALL );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
         AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV27W_B405_WP01_SD01.toxml(false, true, "B405_SD01", "tablet-EDC_GXXEV3U3") );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
         AV5BC_FREE_WORK.Save();
         if ( AV5BC_FREE_WORK.Fail() )
         {
            GXt_char1 = AV34W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
            b405_wp01_kanja_crf_list_impl.this.GXt_char1 = GXv_char2[0] ;
            AV34W_ERR_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34W_ERR_MSG", AV34W_ERR_MSG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
         Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
      }
   }

   public void e151D2( )
   {
      /* 'PAGE_FIRST' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e161D2( )
   {
      /* 'PAGE_LAST' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() < 1 )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      else
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e171D2( )
   {
      /* 'PAGE_BACK' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e181D2( )
   {
      /* 'PAGE_NEXT' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e191D2( )
   {
      /* 'PAGE01' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201D2( )
   {
      /* 'PAGE02' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211D2( )
   {
      /* 'PAGE03' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221D2( )
   {
      /* 'PAGE04' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231D2( )
   {
      /* 'PAGE05' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241D2( )
   {
      /* 'PAGE06' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251D2( )
   {
      /* 'PAGE07' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261D2( )
   {
      /* 'PAGE08' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271D2( )
   {
      /* 'PAGE09' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e281D2( )
   {
      /* 'PAGE10' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      if ( ((int)((AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()) % (AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()))) == 0 )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()/ (double) (AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row())) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      else
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()/ (double) (AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row())+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      GXv_SdtA_PAGING_SDT4[0] = AV17H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT4) ;
      AV17H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT4[0] ;
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
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_list_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         if ( GXutil.strcmp(AV22H_SRCH_FLG, "1") == 0 )
         {
            GXt_char1 = AV37W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
            b405_wp01_kanja_crf_list_impl.this.GXt_char1 = GXv_char2[0] ;
            AV37W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37W_MSG", AV37W_MSG);
            httpContext.GX_msglist.addItem(AV37W_MSG);
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

   public void S192( )
   {
      /* 'SUB_QUERY' Routine */
      if ( GXutil.strcmp(AV22H_SRCH_FLG, "1") == 0 )
      {
         AV29W_CNT = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_CNT", GXutil.ltrim( GXutil.str( AV29W_CNT, 10, 0)));
         pr_default.dynParam(9, new Object[]{ new Object[]{
                                              new Long(AV15D_STUDY_ID) ,
                                              AV16D_TBT01_OUTER_SUBJECT_ID ,
                                              new Long(A87TBT01_STUDY_ID) ,
                                              A647TBT01_OUTER_SUBJECT_ID ,
                                              A441TBT01_DEL_FLG },
                                              new int[] {
                                              TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         /* Using cursor H001D11 */
         pr_default.execute(9, new Object[] {new Long(AV15D_STUDY_ID), AV16D_TBT01_OUTER_SUBJECT_ID});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A441TBT01_DEL_FLG = H001D11_A441TBT01_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A441TBT01_DEL_FLG", A441TBT01_DEL_FLG);
            n441TBT01_DEL_FLG = H001D11_n441TBT01_DEL_FLG[0] ;
            A647TBT01_OUTER_SUBJECT_ID = H001D11_A647TBT01_OUTER_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A647TBT01_OUTER_SUBJECT_ID", A647TBT01_OUTER_SUBJECT_ID);
            n647TBT01_OUTER_SUBJECT_ID = H001D11_n647TBT01_OUTER_SUBJECT_ID[0] ;
            A87TBT01_STUDY_ID = H001D11_A87TBT01_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A87TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A87TBT01_STUDY_ID, 10, 0)));
            A88TBT01_SUBJECT_ID = H001D11_A88TBT01_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A88TBT01_SUBJECT_ID, 6, 0)));
            AV27W_B405_WP01_SD01 = (SdtB405_SD01)new SdtB405_SD01(remoteHandle, context);
            AV28W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)new SdtB405_SD01_CRF_Item(remoteHandle, context);
            if ( AV11D_GRD_CHK_ALL )
            {
               AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            }
            AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Tbt01_study_id( A87TBT01_STUDY_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Tbt01_subject_id( A88TBT01_SUBJECT_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Hikensha_id( A647TBT01_OUTER_SUBJECT_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            AV44W_TBT01_STUDY_ID = A87TBT01_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44W_TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( AV44W_TBT01_STUDY_ID, 10, 0)));
            AV45W_TBT01_SUBJECT_ID = A88TBT01_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV45W_TBT01_SUBJECT_ID, 6, 0)));
            AV38W_NO_SEL_CRF = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38W_NO_SEL_CRF", AV38W_NO_SEL_CRF);
            AV39W_RES_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39W_RES_FLG", AV39W_RES_FLG);
            pr_default.dynParam(10, new Object[]{ new Object[]{
                                                 new Long(AV15D_STUDY_ID) ,
                                                 new Long(A68TBM31_STUDY_ID) ,
                                                 new Short(A69TBM31_CRF_ID) ,
                                                 A643TBM31_STATUS ,
                                                 A397TBM31_DEL_FLG },
                                                 new int[] {
                                                 TypeConstants.LONG, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                                 }
            });
            /* Using cursor H001D12 */
            pr_default.execute(10, new Object[] {new Long(AV15D_STUDY_ID)});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A397TBM31_DEL_FLG = H001D12_A397TBM31_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
               n397TBM31_DEL_FLG = H001D12_n397TBM31_DEL_FLG[0] ;
               A643TBM31_STATUS = H001D12_A643TBM31_STATUS[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
               n643TBM31_STATUS = H001D12_n643TBM31_STATUS[0] ;
               A69TBM31_CRF_ID = H001D12_A69TBM31_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
               A68TBM31_STUDY_ID = H001D12_A68TBM31_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
               AV43W_TBM31_CRF_ID = A69TBM31_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43W_TBM31_CRF_ID", GXutil.ltrim( GXutil.str( AV43W_TBM31_CRF_ID, 4, 0)));
               AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id( A69TBM31_CRF_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
               AV62GXLvl747 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62GXLvl747", GXutil.str( AV62GXLvl747, 1, 0));
               /* Using cursor H001D13 */
               pr_default.execute(11, new Object[] {new Long(AV44W_TBT01_STUDY_ID), new Integer(AV45W_TBT01_SUBJECT_ID), new Short(AV43W_TBM31_CRF_ID)});
               if ( Gx_err != 0 )
               {
                  AV62GXLvl747 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV62GXLvl747", GXutil.str( AV62GXLvl747, 1, 0));
               }
               while ( (pr_default.getStatus(11) != 101) )
               {
                  A935TBT02_CRF_EDA_NO = H001D13_A935TBT02_CRF_EDA_NO[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
                  A91TBT02_CRF_ID = H001D13_A91TBT02_CRF_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
                  A90TBT02_SUBJECT_ID = H001D13_A90TBT02_SUBJECT_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
                  A89TBT02_STUDY_ID = H001D13_A89TBT02_STUDY_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
                  A498TBT02_CRF_LATEST_VERSION = H001D13_A498TBT02_CRF_LATEST_VERSION[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A498TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)));
                  n498TBT02_CRF_LATEST_VERSION = H001D13_n498TBT02_CRF_LATEST_VERSION[0] ;
                  AV62GXLvl747 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV62GXLvl747", GXutil.str( AV62GXLvl747, 1, 0));
                  AV38W_NO_SEL_CRF = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV38W_NO_SEL_CRF", AV38W_NO_SEL_CRF);
                  if ( A498TBT02_CRF_LATEST_VERSION == 0 )
                  {
                     AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status( "○" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                     AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status_n( (byte)(1) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                  }
                  else
                  {
                     AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status( "●" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                     AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status_n( (byte)(2) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                  }
                  AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version( A498TBT02_CRF_LATEST_VERSION );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(11);
               if ( AV62GXLvl747 == 0 )
               {
                  AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status( "" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                  AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status_n( (byte)(0) );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
               }
               AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().add(AV28W_B405_WP01_SD01_CRF_ITEM.Clone(), 0);
               pr_default.readNext(10);
            }
            pr_default.close(10);
            if ( AV9W_CRF_SEL_ONLY )
            {
               if ( AV38W_NO_SEL_CRF )
               {
                  AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk_visbale( true );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
                  AV39W_RES_FLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV39W_RES_FLG", AV39W_RES_FLG);
               }
            }
            else
            {
               if ( AV38W_NO_SEL_CRF )
               {
                  AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk_visbale( true );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
               }
               else
               {
                  AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk_visbale( false );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
               }
               AV39W_RES_FLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39W_RES_FLG", AV39W_RES_FLG);
            }
            if ( AV39W_RES_FLG )
            {
               AV29W_CNT = (long)(AV29W_CNT+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29W_CNT", GXutil.ltrim( GXutil.str( AV29W_CNT, 10, 0)));
               AV5BC_FREE_WORK = (SdtTBW01_FREE_WORK)new SdtTBW01_FREE_WORK( remoteHandle, context);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( AV8C_TAM02_APP_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( AV19H_DISP_DATETIME );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( AV29W_CNT );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV27W_B405_WP01_SD01.toxml(false, true, "B405_SD01", "tablet-EDC_GXXEV3U3") );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.Save();
               if ( AV5BC_FREE_WORK.Fail() )
               {
                  GXt_char1 = AV34W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
                  b405_wp01_kanja_crf_list_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV34W_ERR_MSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV34W_ERR_MSG", AV34W_ERR_MSG);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            pr_default.readNext(9);
         }
         pr_default.close(9);
         if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         }
         else
         {
            httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
            Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         }
      }
   }

   public void S182( )
   {
      /* 'SUB_GRID_TO_WORK' Routine */
      if ( ! AV36W_GRID_READ_FLG )
      {
         AV36W_GRID_READ_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36W_GRID_READ_FLG", AV36W_GRID_READ_FLG);
         AV27W_B405_WP01_SD01 = (SdtB405_SD01)new SdtB405_SD01(remoteHandle, context);
         /* Start For Each Line in Grid1 */
         nRC_GXsfl_176 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_176"), ".", ",")) ;
         nGXsfl_176_fel_idx = (short)(0) ;
         while ( nGXsfl_176_fel_idx < nRC_GXsfl_176 )
         {
            nGXsfl_176_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_176_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_176_fel_idx+1)) ;
            sGXsfl_176_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1764( ) ;
            AV12D_GRD1_CHECK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd1_check.getInternalname())) ;
            AV13D_GRD1_HIKENSHA = httpContext.cgiGet( edtavD_grd1_hikensha_Internalname) ;
            A54TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") ;
            AV5BC_FREE_WORK.Load(AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME, A54TBW01_LINE_NO);
            if ( AV5BC_FREE_WORK.Fail() )
            {
               GXt_char1 = AV34W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
               b405_wp01_kanja_crf_list_impl.this.GXt_char1 = GXv_char2[0] ;
               AV34W_ERR_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34W_ERR_MSG", AV34W_ERR_MSG);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV27W_B405_WP01_SD01.fromxml(AV5BC_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1(), "");
            AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk( AV12D_GRD1_CHECK );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV27W_B405_WP01_SD01.toxml(false, true, "B405_SD01", "tablet-EDC_GXXEV3U3") );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
            AV5BC_FREE_WORK.Save();
            if ( AV5BC_FREE_WORK.Fail() )
            {
               GXt_char1 = AV34W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
               b405_wp01_kanja_crf_list_impl.this.GXt_char1 = GXv_char2[0] ;
               AV34W_ERR_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34W_ERR_MSG", AV34W_ERR_MSG);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_176_fel_idx == 0 )
         {
            nGXsfl_176_idx = (short)(1) ;
            sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1764( ) ;
         }
         nGXsfl_176_fel_idx = (short)(1) ;
         if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         }
         else
         {
            httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
            Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV24P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV41W_SESSION.getValue(AV50Pgmname+"_PAGE"))) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      else
      {
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S202( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV41W_SESSION.setValue(AV50Pgmname+"_STUDY_ID", GXutil.str( AV15D_STUDY_ID, 10, 0));
      AV41W_SESSION.setValue(AV50Pgmname+"_OUTER_SUBJECT_ID", AV16D_TBT01_OUTER_SUBJECT_ID);
      AV41W_SESSION.setValue(AV50Pgmname+"_CRF_SEL_ONLY", GXutil.booltostr( AV9W_CRF_SEL_ONLY));
      AV41W_SESSION.setValue(AV50Pgmname+"_GRD_CHK_ALL", GXutil.booltostr( AV11D_GRD_CHK_ALL));
      AV41W_SESSION.setValue(AV50Pgmname+"_SRCH_FLG", AV22H_SRCH_FLG);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV15D_STUDY_ID = GXutil.lval( AV41W_SESSION.getValue(AV50Pgmname+"_STUDY_ID")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15D_STUDY_ID", GXutil.ltrim( GXutil.str( AV15D_STUDY_ID, 10, 0)));
      AV16D_TBT01_OUTER_SUBJECT_ID = AV41W_SESSION.getValue(AV50Pgmname+"_OUTER_SUBJECT_ID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16D_TBT01_OUTER_SUBJECT_ID", AV16D_TBT01_OUTER_SUBJECT_ID);
      if ( GXutil.strcmp(AV41W_SESSION.getValue(AV50Pgmname+"_CRF_SEL_ONLY"), "true") == 0 )
      {
         AV9W_CRF_SEL_ONLY = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9W_CRF_SEL_ONLY", AV9W_CRF_SEL_ONLY);
      }
      else
      {
         AV9W_CRF_SEL_ONLY = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9W_CRF_SEL_ONLY", AV9W_CRF_SEL_ONLY);
      }
      if ( GXutil.strcmp(AV41W_SESSION.getValue(AV50Pgmname+"_GRD_CHK_ALL"), "true") == 0 )
      {
         AV11D_GRD_CHK_ALL = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_CHK_ALL", AV11D_GRD_CHK_ALL);
      }
      else
      {
         AV11D_GRD_CHK_ALL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_CHK_ALL", AV11D_GRD_CHK_ALL);
      }
      AV22H_SRCH_FLG = AV41W_SESSION.getValue(AV50Pgmname+"_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22H_SRCH_FLG", AV22H_SRCH_FLG);
   }

   public void S212( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV41W_SESSION.remove(AV50Pgmname+"_STUDY_ID");
      AV41W_SESSION.remove(AV50Pgmname+"_OUTER_SUBJECT_ID");
      AV41W_SESSION.remove(AV50Pgmname+"_CRF_SEL_ONLY");
      AV41W_SESSION.remove(AV50Pgmname+"_GRD_CHK_ALL");
      AV41W_SESSION.remove(AV50Pgmname+"_SRCH_FLG");
   }

   public void S152( )
   {
      /* 'SUB_EDIT_COMBO' Routine */
      cmbavD_study_id.removeAllItems();
      cmbavD_study_id.addItem("0", " ", (short)(0));
      /* Using cursor H001D14 */
      pr_default.execute(12);
      while ( (pr_default.getStatus(12) != 101) )
      {
         A369TBM21_DEL_FLG = H001D14_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H001D14_n369TBM21_DEL_FLG[0] ;
         A607TBM21_STATUS = H001D14_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = H001D14_n607TBM21_STATUS[0] ;
         A367TBM21_STUDY_NM = H001D14_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H001D14_n367TBM21_STUDY_NM[0] ;
         A63TBM21_STUDY_ID = H001D14_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         cmbavD_study_id.addItem(GXutil.trim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)), GXutil.str( A63TBM21_STUDY_ID, 10, 0)+" "+A367TBM21_STUDY_NM, (short)(0));
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV25W_A_LOGIN_SDT;
      GXv_char2[0] = AV35W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV25W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b405_wp01_kanja_crf_list_impl.this.AV35W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35W_ERRCD", AV35W_ERRCD);
      if ( GXutil.strcmp(AV35W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      Form.getJscriptsrc().add("js/acom.js") ;
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV16D_TBT01_OUTER_SUBJECT_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16D_TBT01_OUTER_SUBJECT_ID", AV16D_TBT01_OUTER_SUBJECT_ID);
      AV9W_CRF_SEL_ONLY = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9W_CRF_SEL_ONLY", AV9W_CRF_SEL_ONLY);
      AV11D_GRD_CHK_ALL = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_CHK_ALL", AV11D_GRD_CHK_ALL);
      AV22H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22H_SRCH_FLG", AV22H_SRCH_FLG);
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
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
      GXv_char2[0] = AV21H_KNGN_FLG ;
      GXv_char6[0] = AV35W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV8C_TAM02_APP_ID, GXv_char2, GXv_char6) ;
      b405_wp01_kanja_crf_list_impl.this.AV21H_KNGN_FLG = GXv_char2[0] ;
      b405_wp01_kanja_crf_list_impl.this.AV35W_ERRCD = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV35W_ERRCD", AV35W_ERRCD);
      if ( GXutil.strcmp(AV35W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S232( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV50Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
   }

   private void e321D4( )
   {
      /* Grid1_Load Routine */
      tblTbl_grd1_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd1_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd1_hidden_Visible, 5, 0)));
      AV27W_B405_WP01_SD01.fromxml(A685TBW01_FREE_SAVE_1, "");
      AV12D_GRD1_CHECK = AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Chk() ;
      chkavD_grd1_check.setVisible( (AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Chk_visbale() ? 1 : 0) );
      AV13D_GRD1_HIKENSHA = AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Hikensha_id() ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(176) ;
      }
      sendrow_1764( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   private void e341D5( )
   {
      /* Grid2_Load Routine */
      AV52GXV2 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52GXV2", GXutil.ltrim( GXutil.str( AV52GXV2, 8, 0)));
      while ( AV52GXV2 <= AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
      {
         AV28W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV52GXV2));
         AV14D_GRD2_CRF_STATUS = AV28W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Status() ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(195) ;
         }
         sendrow_1955( ) ;
         AV52GXV2 = (int)(AV52GXV2+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52GXV2", GXutil.ltrim( GXutil.str( AV52GXV2, 8, 0)));
      }
   }

   public void wb_table2_206_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV20H_INIT_FLG), GXutil.rtrim( localUtil.format( AV20H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(210);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV22H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV22H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 212,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV21H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV21H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(212);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_disp_datetime_Internalname, GXutil.rtrim( AV19H_DISP_DATETIME), GXutil.rtrim( localUtil.format( AV19H_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(213);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_disp_datetime_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_col_count_Internalname, GXutil.ltrim( localUtil.ntoc( AV18H_COL_COUNT, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18H_COL_COUNT), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_col_count_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_206_1D2e( true) ;
      }
      else
      {
         wb_table2_206_1D2e( false) ;
      }
   }

   public void wb_table1_2_1D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table3_6_1D2( true) ;
      }
      else
      {
         wb_table3_6_1D2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1D2e( boolean wbgen )
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
         wb_table1_2_1D2e( true) ;
      }
      else
      {
         wb_table1_2_1D2e( false) ;
      }
   }

   public void wb_table3_6_1D2( boolean wbgen )
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
         wb_table4_12_1D2( true) ;
      }
      else
      {
         wb_table4_12_1D2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table5_18_1D2( true) ;
      }
      else
      {
         wb_table5_18_1D2( false) ;
      }
      return  ;
   }

   public void wb_table5_18_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0204"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0204"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0204"+"");
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
         wb_table3_6_1D2e( true) ;
      }
      else
      {
         wb_table3_6_1D2e( false) ;
      }
   }

   public void wb_table5_18_1D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_21_1D2( true) ;
      }
      else
      {
         wb_table6_21_1D2( false) ;
      }
      return  ;
   }

   public void wb_table6_21_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_18_1D2e( true) ;
      }
      else
      {
         wb_table5_18_1D2e( false) ;
      }
   }

   public void wb_table6_21_1D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_24_1D2( true) ;
      }
      else
      {
         wb_table7_24_1D2( false) ;
      }
      return  ;
   }

   public void wb_table7_24_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:5px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 942, "px", 397, "px", "SectionScroll_NoLine", "");
         wb_table8_56_1D2( true) ;
      }
      else
      {
         wb_table8_56_1D2( false) ;
      }
      return  ;
   }

   public void wb_table8_56_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_21_1D2e( true) ;
      }
      else
      {
         wb_table6_21_1D2e( false) ;
      }
   }

   public void wb_table8_56_1D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_list_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( tblTbl_list_Width, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_list_Internalname, tblTbl_list_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_59_1D2( true) ;
      }
      else
      {
         wb_table9_59_1D2( false) ;
      }
      return  ;
   }

   public void wb_table9_59_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"vertical-align:top\">") ;
         wb_table10_155_1D2( true) ;
      }
      else
      {
         wb_table10_155_1D2( false) ;
      }
      return  ;
   }

   public void wb_table10_155_1D2e( boolean wbgen )
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
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
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
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridBase");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
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
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.booltostr( AV12D_GRD1_CHECK));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavD_grd1_check.getVisible(), (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV13D_GRD1_HIKENSHA));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_hikensha_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_sel_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 176 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_176 = (short)(nGXsfl_176_idx-1) ;
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
         wb_table8_56_1D2e( true) ;
      }
      else
      {
         wb_table8_56_1D2e( false) ;
      }
   }

   public void wb_table10_155_1D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table11_158_1D2( true) ;
      }
      else
      {
         wb_table11_158_1D2( false) ;
      }
      return  ;
   }

   public void wb_table11_158_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /*  Grid Control  */
         Grd_titleContainer.SetIsFreestyle(true);
         Grd_titleContainer.SetWrapped(nGXWrapped);
         if ( Grd_titleContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grd_titleContainer"+"DivS\" gxgridid=\"167\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrd_title_Internalname, subGrd_title_Internalname, "", "FreeStyleGridBase", 0, "left", "", 0, 0, sStyleString, "none", 0);
            Grd_titleContainer.AddObjectProperty("GridName", "Grd_title");
         }
         else
         {
            Grd_titleContainer.AddObjectProperty("GridName", "Grd_title");
            Grd_titleContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
            Grd_titleContainer.AddObjectProperty("Align", GXutil.rtrim( "left"));
            Grd_titleContainer.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grd_titleContainer.AddObjectProperty("Class", "FreeStyleGridBase");
            Grd_titleContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrd_title_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrd_title_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("CmpContext", "");
            Grd_titleContainer.AddObjectProperty("InMasterPage", "false");
            Grd_titleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grd_titleColumn.AddObjectProperty("Value", GXutil.rtrim( AV10D_CRFSNM));
            Grd_titleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_crfsnm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrd_title_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrd_title_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrd_title_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrd_title_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrd_title_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrd_title_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 167 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_167 = (short)(nGXsfl_167_idx-1) ;
         if ( Grd_titleContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grd_titleContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grd_title", Grd_titleContainer);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grd_titleContainerData", Grd_titleContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grd_titleContainerData"+"V", Grd_titleContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grd_titleContainerData"+"V"+"\" value='"+Grd_titleContainer.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_155_1D2e( true) ;
      }
      else
      {
         wb_table10_155_1D2e( false) ;
      }
   }

   public void wb_table11_158_1D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 35, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_in_grid_header_Internalname, tblTbl_in_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:28px;width:60px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd_chk_all.getInternalname(), GXutil.booltostr( AV11D_GRD_CHK_ALL), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(161, this, 'true', 'false');gx.ajax.executeCliEvent('e141d2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(161);\"");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "全て", "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:70px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "被験者ID", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_158_1D2e( true) ;
      }
      else
      {
         wb_table11_158_1D2e( false) ;
      }
   }

   public void wb_table9_59_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_65_1D2( true) ;
      }
      else
      {
         wb_table12_65_1D2( false) ;
      }
      return  ;
   }

   public void wb_table12_65_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_59_1D2e( true) ;
      }
      else
      {
         wb_table9_59_1D2e( false) ;
      }
   }

   public void wb_table12_65_1D2( boolean wbgen )
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
         wb_table13_68_1D2( true) ;
      }
      else
      {
         wb_table13_68_1D2( false) ;
      }
      return  ;
   }

   public void wb_table13_68_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_74_1D2( true) ;
      }
      else
      {
         wb_table14_74_1D2( false) ;
      }
      return  ;
   }

   public void wb_table14_74_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_80_1D2( true) ;
      }
      else
      {
         wb_table15_80_1D2( false) ;
      }
      return  ;
   }

   public void wb_table15_80_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_86_1D2( true) ;
      }
      else
      {
         wb_table16_86_1D2( false) ;
      }
      return  ;
   }

   public void wb_table16_86_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_92_1D2( true) ;
      }
      else
      {
         wb_table17_92_1D2( false) ;
      }
      return  ;
   }

   public void wb_table17_92_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_98_1D2( true) ;
      }
      else
      {
         wb_table18_98_1D2( false) ;
      }
      return  ;
   }

   public void wb_table18_98_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_104_1D2( true) ;
      }
      else
      {
         wb_table19_104_1D2( false) ;
      }
      return  ;
   }

   public void wb_table19_104_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_110_1D2( true) ;
      }
      else
      {
         wb_table20_110_1D2( false) ;
      }
      return  ;
   }

   public void wb_table20_110_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_116_1D2( true) ;
      }
      else
      {
         wb_table21_116_1D2( false) ;
      }
      return  ;
   }

   public void wb_table21_116_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_122_1D2( true) ;
      }
      else
      {
         wb_table22_122_1D2( false) ;
      }
      return  ;
   }

   public void wb_table22_122_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_128_1D2( true) ;
      }
      else
      {
         wb_table23_128_1D2( false) ;
      }
      return  ;
   }

   public void wb_table23_128_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_134_1D2( true) ;
      }
      else
      {
         wb_table24_134_1D2( false) ;
      }
      return  ;
   }

   public void wb_table24_134_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_140_1D2( true) ;
      }
      else
      {
         wb_table25_140_1D2( false) ;
      }
      return  ;
   }

   public void wb_table25_140_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_146_1D2( true) ;
      }
      else
      {
         wb_table26_146_1D2( false) ;
      }
      return  ;
   }

   public void wb_table26_146_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_65_1D2e( true) ;
      }
      else
      {
         wb_table12_65_1D2e( false) ;
      }
   }

   public void wb_table26_146_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_146_1D2e( true) ;
      }
      else
      {
         wb_table26_146_1D2e( false) ;
      }
   }

   public void wb_table25_140_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_140_1D2e( true) ;
      }
      else
      {
         wb_table25_140_1D2e( false) ;
      }
   }

   public void wb_table24_134_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_134_1D2e( true) ;
      }
      else
      {
         wb_table24_134_1D2e( false) ;
      }
   }

   public void wb_table23_128_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_128_1D2e( true) ;
      }
      else
      {
         wb_table23_128_1D2e( false) ;
      }
   }

   public void wb_table22_122_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_122_1D2e( true) ;
      }
      else
      {
         wb_table22_122_1D2e( false) ;
      }
   }

   public void wb_table21_116_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_116_1D2e( true) ;
      }
      else
      {
         wb_table21_116_1D2e( false) ;
      }
   }

   public void wb_table20_110_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_110_1D2e( true) ;
      }
      else
      {
         wb_table20_110_1D2e( false) ;
      }
   }

   public void wb_table19_104_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_104_1D2e( true) ;
      }
      else
      {
         wb_table19_104_1D2e( false) ;
      }
   }

   public void wb_table18_98_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_98_1D2e( true) ;
      }
      else
      {
         wb_table18_98_1D2e( false) ;
      }
   }

   public void wb_table17_92_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_92_1D2e( true) ;
      }
      else
      {
         wb_table17_92_1D2e( false) ;
      }
   }

   public void wb_table16_86_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_86_1D2e( true) ;
      }
      else
      {
         wb_table16_86_1D2e( false) ;
      }
   }

   public void wb_table15_80_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_80_1D2e( true) ;
      }
      else
      {
         wb_table15_80_1D2e( false) ;
      }
   }

   public void wb_table14_74_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_74_1D2e( true) ;
      }
      else
      {
         wb_table14_74_1D2e( false) ;
      }
   }

   public void wb_table13_68_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_68_1D2e( true) ;
      }
      else
      {
         wb_table13_68_1D2e( false) ;
      }
   }

   public void wb_table7_24_1D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 942, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験名", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:155px\">") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_study_id, cmbavD_study_id.getInternalname(), GXutil.trim( GXutil.str( AV15D_STUDY_ID, 10, 0)), 1, cmbavD_study_id.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, 1, 0, (short)(0), 489, "px", 0, "", "", "AttributeImeOff", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "", true, "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         cmbavD_study_id.setValue( GXutil.trim( GXutil.str( AV15D_STUDY_ID, 10, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_study_id.getInternalname(), "Values", cmbavD_study_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "被験者ID", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tbt01_outer_subject_id_Internalname, GXutil.rtrim( AV16D_TBT01_OUTER_SUBJECT_ID), GXutil.rtrim( localUtil.format( AV16D_TBT01_OUTER_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tbt01_outer_subject_id_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table27_35_1D2( true) ;
      }
      else
      {
         wb_table27_35_1D2( false) ;
      }
      return  ;
   }

   public void wb_table27_35_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"5\" >") ;
         wb_table28_43_1D2( true) ;
      }
      else
      {
         wb_table28_43_1D2( false) ;
      }
      return  ;
   }

   public void wb_table28_43_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_24_1D2e( true) ;
      }
      else
      {
         wb_table7_24_1D2e( false) ;
      }
   }

   public void wb_table28_43_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "検索（F5）", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "クリア（F6）", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_43_1D2e( true) ;
      }
      else
      {
         wb_table28_43_1D2e( false) ;
      }
   }

   public void wb_table27_35_1D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_167_idx + "',0)\"" ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavW_crf_sel_only.getInternalname(), GXutil.booltostr( AV9W_CRF_SEL_ONLY), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(38, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(38);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "CRF未選択のみ", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_35_1D2e( true) ;
      }
      else
      {
         wb_table27_35_1D2e( false) ;
      }
   }

   public void wb_table4_12_1D2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auto_sel_Internalname, "自動選択（F3）", "", "", lblTxt_auto_sel_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_AUTO_SEL\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_1D2e( true) ;
      }
      else
      {
         wb_table4_12_1D2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV24P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24P_MOVE_KBN", GXutil.str( AV24P_MOVE_KBN, 1, 0));
      AV23P_COL_COUNT = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23P_COL_COUNT", GXutil.ltrim( GXutil.str( AV23P_COL_COUNT, 4, 0)));
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
      pa1D2( ) ;
      ws1D2( ) ;
      we1D2( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317181764");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b405_wp01_kanja_crf_list.js", "?20177317181765");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1672( )
   {
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_167_idx ;
   }

   public void subsflControlProps_fel_1672( )
   {
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_167_fel_idx ;
   }

   public void sendrow_1672( )
   {
      subsflControlProps_1672( ) ;
      wb1D0( ) ;
      Grd_titleRow = GXWebRow.GetNew(context,Grd_titleContainer) ;
      if ( subGrd_title_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrd_title_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrd_title_Class, "") != 0 )
         {
            subGrd_title_Linesclass = subGrd_title_Class+"Odd" ;
         }
      }
      else if ( subGrd_title_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrd_title_Backstyle = (byte)(0) ;
         subGrd_title_Backcolor = subGrd_title_Allbackcolor ;
         if ( GXutil.strcmp(subGrd_title_Class, "") != 0 )
         {
            subGrd_title_Linesclass = subGrd_title_Class+"Uniform" ;
         }
      }
      else if ( subGrd_title_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrd_title_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrd_title_Class, "") != 0 )
         {
            subGrd_title_Linesclass = subGrd_title_Class+"Odd" ;
         }
         subGrd_title_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrd_title_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrd_title_Backstyle = (byte)(1) ;
         if ( ((int)(((nGXsfl_167_idx-1)/ (double) (0)) % (2))) == 0 )
         {
            subGrd_title_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrd_title_Class, "") != 0 )
            {
               subGrd_title_Linesclass = subGrd_title_Class+"Odd" ;
            }
         }
         else
         {
            subGrd_title_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrd_title_Class, "") != 0 )
            {
               subGrd_title_Linesclass = subGrd_title_Class+"Even" ;
            }
         }
      }
      /* Start of Columns property logic. */
      Grd_titleRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrd_title_Linesclass,""});
      Grd_titleRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Table start */
      Grd_titleRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_in_grid_header2_Internalname+"_"+sGXsfl_167_idx,new Integer(1),"TableGridHeaderLM-1","","","","","","",new Integer(0),new Integer(1),new Integer(35),new Integer(150),"","px","px"});
      Grd_titleRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grd_titleRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      Grd_titleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_crfsnm_Internalname,GXutil.rtrim( AV10D_CRFSNM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_crfsnm_Jsonclick,new Integer(0),"ReadonlyAttribute","font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:bold; font-style:normal;",ROClassString,"",new Integer(1),new Integer(edtavD_crfsnm_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(167),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      if ( Grd_titleContainer.GetWrapped() == 1 )
      {
         Grd_titleContainer.CloseTag("cell");
      }
      if ( Grd_titleContainer.GetWrapped() == 1 )
      {
         Grd_titleContainer.CloseTag("row");
      }
      if ( Grd_titleContainer.GetWrapped() == 1 )
      {
         Grd_titleContainer.CloseTag("table");
      }
      /* End of table */
      if ( Grd_titleContainer.GetWrapped() == 1 )
      {
         Grd_titleContainer.CloseTag("cell");
      }
      if ( Grd_titleContainer.GetWrapped() == 1 )
      {
         Grd_titleContainer.CloseTag("row");
      }
      /* End of Columns property logic. */
      Grd_titleContainer.AddRow(Grd_titleRow);
      nGXsfl_167_idx = (short)(((subGrd_title_Islastpage==1)&&(nGXsfl_167_idx+1>subgrd_title_recordsperpage( )) ? 1 : nGXsfl_167_idx+1)) ;
      sGXsfl_167_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_167_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1672( ) ;
      /* End function sendrow_1672 */
   }

   public void subsflControlProps_1955( )
   {
      edtavD_grd2_crf_status_Internalname = "vD_GRD2_CRF_STATUS_"+sGXsfl_195_idx ;
   }

   public void subsflControlProps_fel_1955( )
   {
      edtavD_grd2_crf_status_Internalname = "vD_GRD2_CRF_STATUS_"+sGXsfl_195_fel_idx ;
   }

   public void sendrow_1955( )
   {
      subsflControlProps_1955( ) ;
      wb1D0( ) ;
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
         if ( ((int)(((nGXsfl_195_idx-1)/ (double) (0)) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
      }
      /* Start of Columns property logic. */
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid2_Linesclass,""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Table start */
      Grid2Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_in_grid3_Internalname+"_"+sGXsfl_195_idx,new Integer(1),"TableGridTLM1","","","","","","",new Integer(0),new Integer(1),new Integer(35),new Integer(150),"","px","px"});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:35px\""});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd2_crf_status_Internalname,GXutil.rtrim( AV14D_GRD2_CRF_STATUS),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd2_crf_status_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd2_crf_status_Enabled),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(195),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
      if ( Grid2Container.GetWrapped() == 1 )
      {
         Grid2Container.CloseTag("row");
      }
      /* End of Columns property logic. */
      Grid2Container.AddRow(Grid2Row);
      nGXsfl_195_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_195_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_195_idx+1)) ;
      sGXsfl_195_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_195_idx, 4, 0)), (short)(4), "0") + sGXsfl_176_idx ;
      subsflControlProps_1955( ) ;
      /* End function sendrow_1955 */
   }

   public void subsflControlProps_1764( )
   {
      chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_176_idx );
      edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_176_idx ;
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_176_idx ;
      edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_176_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_176_idx ;
   }

   public void subsflControlProps_fel_1764( )
   {
      chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_176_fel_idx );
      edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_176_fel_idx ;
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_176_fel_idx ;
      edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_176_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_176_fel_idx ;
   }

   public void sendrow_1764( )
   {
      subsflControlProps_1764( ) ;
      wb1D0( ) ;
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
            if ( ((int)(((nGXsfl_176_idx-1)/ (double) (1)) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
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
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_176_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_176_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grid_Internalname+"_"+sGXsfl_176_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"vertical-align:top\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_in_grid2_Internalname+"_"+sGXsfl_176_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:31px;width:60px\""});
         /* Check box */
         TempTags = " " + ((chkavD_grd1_check.getEnabled()!=0)&&(chkavD_grd1_check.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 185,'',false,'"+sGXsfl_176_idx+"',176)\"" : " ") ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavD_grd1_check.getInternalname(),GXutil.booltostr( AV12D_GRD1_CHECK),"",new Integer(chkavD_grd1_check.getVisible()),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavD_grd1_check.getEnabled()!=0)&&(chkavD_grd1_check.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(185, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd1_check.getEnabled()!=0)&&(chkavD_grd1_check.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(185);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:70px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 187,'',false,'"+sGXsfl_176_idx+"',176)\"" : " ") ;
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd1_hikensha_Internalname,GXutil.rtrim( AV13D_GRD1_HIKENSHA),"",TempTags+((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(187);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd1_hikensha_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd1_hikensha_Enabled),new Integer(0),"text","",new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:35px;width:45px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"'"+""+"'"+",false,"+"'"+"EBTN_SEL.CLICK."+sGXsfl_176_idx+"'","","TextBlockBtn040s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
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
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grd1_hidden_Internalname+"_"+sGXsfl_176_idx,new Integer(tblTbl_grd1_hidden_Visible),"TableHidden","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBW01_LINE_NO_Internalname,GXutil.ltrim( localUtil.ntoc( A54TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A54TBW01_LINE_NO), "ZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBW01_LINE_NO_Jsonclick,new Integer(0),"Attribute","color:#FF0000;",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(176),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /*  Child Grid Control  */
         Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
         if ( isAjaxCallMode( ) )
         {
            Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            Grid2Container.Clear();
         }
         Grid2Container.SetIsFreestyle(true);
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"195\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "FreeStyleGridBase", 0, "left", "", 0, 0, sStyleString, "none", 0);
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
            Grid2Container.AddObjectProperty("Align", GXutil.rtrim( "left"));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid2Container.AddObjectProperty("Class", "FreeStyleGridBase");
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
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
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV14D_GRD2_CRF_STATUS));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_crf_status_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
         rf1D5( ) ;
         nRC_GXsfl_195 = (short)(nGXsfl_195_idx-1) ;
         GXCCtl = "nRC_GXsfl_195_" + sGXsfl_176_idx ;
         GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_195, (byte)(4), (byte)(0), ".", "")));
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
         }
         else
         {
            if ( ! isAjaxCallMode( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_176_idx, Grid2Container.ToJavascriptSource());
            }
            if ( isAjaxCallMode( ) )
            {
               Grid1Row.AddGrid("Grid2", Grid2Container);
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_176_idx, Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_176_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'>") ;
            }
         }
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
         /* End of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( 1 > 0 )
            {
               if ( ((int)((nGXsfl_176_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_176_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_176_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_176_idx+1)) ;
         sGXsfl_176_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_176_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1764( ) ;
      }
      /* End function sendrow_1764 */
   }

   public void init_default_properties( )
   {
      lblTxt_auto_sel_Internalname = "TXT_AUTO_SEL" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      cmbavD_study_id.setInternalname( "vD_STUDY_ID" );
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavD_tbt01_outer_subject_id_Internalname = "vD_TBT01_OUTER_SUBJECT_ID" ;
      chkavW_crf_sel_only.setInternalname( "vW_CRF_SEL_ONLY" );
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      tblTable7_Internalname = "TABLE7" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
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
      chkavD_grd_chk_all.setInternalname( "vD_GRD_CHK_ALL" );
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      tblTbl_in_grid_header_Internalname = "TBL_IN_GRID_HEADER" ;
      tblTbl_in_grid_header2_Internalname = "TBL_IN_GRID_HEADER2" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTbl_in_grid2_Internalname = "TBL_IN_GRID2" ;
      tblTbl_grd1_hidden_Internalname = "TBL_GRD1_HIDDEN" ;
      tblTbl_in_grid3_Internalname = "TBL_IN_GRID3" ;
      tblTbl_grid_Internalname = "TBL_GRID" ;
      tblTbl_list_Internalname = "TBL_LIST" ;
      divSection1_Internalname = "SECTION1" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_disp_datetime_Internalname = "vH_DISP_DATETIME" ;
      edtavH_col_count_Internalname = "vH_COL_COUNT" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrd_title_Internalname = "GRD_TITLE" ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_176_idx ;
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      edtTBW01_LINE_NO_Jsonclick = "" ;
      edtavD_grd1_hikensha_Jsonclick = "" ;
      edtavD_grd1_hikensha_Visible = 1 ;
      chkavD_grd1_check.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridBase" ;
      edtavD_grd2_crf_status_Jsonclick = "" ;
      edtavD_grd2_crf_status_Enabled = 0 ;
      subGrid2_Class = "FreeStyleGridBase" ;
      edtavD_crfsnm_Jsonclick = "" ;
      subGrd_title_Class = "FreeStyleGridBase" ;
      edtavD_tbt01_outer_subject_id_Jsonclick = "" ;
      cmbavD_study_id.setJsonclick( "" );
      subGrd_title_Allowcollapsing = (byte)(0) ;
      edtavD_crfsnm_Enabled = 0 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblBtn_sel_Caption = "選択" ;
      edtavD_grd1_hikensha_Enabled = 1 ;
      chkavD_grd1_check.setVisible( 1 );
      tblTbl_list_Width = 0 ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_col_count_Jsonclick = "" ;
      edtavH_disp_datetime_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      tblTbl_grd1_hidden_Visible = 1 ;
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
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid2_Borderwidth = (short)(0) ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      subGrd_title_Borderwidth = (short)(0) ;
      subGrd_title_Backcolorstyle = (byte)(0) ;
      chkavD_grd_chk_all.setCaption( "" );
      chkavW_crf_sel_only.setCaption( "" );
      subGrid1_Rows = 10 ;
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
                  /* Execute user subroutine: S232 */
                  S232 ();
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
      AV22H_SRCH_FLG = "" ;
      AV19H_DISP_DATETIME = "" ;
      AV17H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV50Pgmname = "" ;
      AV8C_TAM02_APP_ID = "" ;
      A369TBM21_DEL_FLG = "" ;
      A367TBM21_STUDY_NM = "" ;
      A647TBT01_OUTER_SUBJECT_ID = "" ;
      A441TBT01_DEL_FLG = "" ;
      A643TBM31_STATUS = "" ;
      A397TBM31_DEL_FLG = "" ;
      AV25W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV34W_ERR_MSG = "" ;
      A642TBM31_CRF_SNM = "" ;
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
      AV10D_CRFSNM = "" ;
      edtavD_crfsnm_Internalname = "" ;
      AV13D_GRD1_HIKENSHA = "" ;
      edtavD_grd1_hikensha_Internalname = "" ;
      edtTBW01_LINE_NO_Internalname = "" ;
      AV14D_GRD2_CRF_STATUS = "" ;
      edtavD_grd2_crf_status_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grd_titleContainer = new com.genexus.webpanels.GXWebGrid(context);
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      H001D2_A53TBW01_DISP_DATETIME = new String[] {""} ;
      H001D2_A52TBW01_APP_ID = new String[] {""} ;
      H001D2_A51TBW01_SESSION_ID = new String[] {""} ;
      H001D2_A685TBW01_FREE_SAVE_1 = new String[] {""} ;
      H001D2_n685TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      H001D2_A54TBW01_LINE_NO = new long[1] ;
      A53TBW01_DISP_DATETIME = "" ;
      A52TBW01_APP_ID = "" ;
      A51TBW01_SESSION_ID = "" ;
      A685TBW01_FREE_SAVE_1 = "" ;
      H001D3_AGRID1_nRecordCount = new long[1] ;
      AV16D_TBT01_OUTER_SUBJECT_ID = "" ;
      AV20H_INIT_FLG = "" ;
      AV21H_KNGN_FLG = "" ;
      AV7C_GAMEN_TITLE = "" ;
      H001D4_A397TBM31_DEL_FLG = new String[] {""} ;
      H001D4_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H001D4_A643TBM31_STATUS = new String[] {""} ;
      H001D4_n643TBM31_STATUS = new boolean[] {false} ;
      H001D4_A69TBM31_CRF_ID = new short[1] ;
      H001D4_A68TBM31_STUDY_ID = new long[1] ;
      H001D4_A642TBM31_CRF_SNM = new String[] {""} ;
      H001D4_n642TBM31_CRF_SNM = new boolean[] {false} ;
      H001D5_A58TBM01_SYS_ID = new String[] {""} ;
      H001D5_A608TBM01_SYS_VALUE = new String[] {""} ;
      H001D5_n608TBM01_SYS_VALUE = new boolean[] {false} ;
      A58TBM01_SYS_ID = "" ;
      A608TBM01_SYS_VALUE = "" ;
      AV42W_SYS_CRFID = "" ;
      AV33W_CRFID_COLS = new GxObjectCollection(Short.class, "internal", "");
      H001D6_A397TBM31_DEL_FLG = new String[] {""} ;
      H001D6_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H001D6_A643TBM31_STATUS = new String[] {""} ;
      H001D6_n643TBM31_STATUS = new boolean[] {false} ;
      H001D6_A69TBM31_CRF_ID = new short[1] ;
      H001D6_A68TBM31_STUDY_ID = new long[1] ;
      H001D7_A54TBW01_LINE_NO = new long[1] ;
      H001D7_A53TBW01_DISP_DATETIME = new String[] {""} ;
      H001D7_A52TBW01_APP_ID = new String[] {""} ;
      H001D7_A51TBW01_SESSION_ID = new String[] {""} ;
      H001D7_A685TBW01_FREE_SAVE_1 = new String[] {""} ;
      H001D7_n685TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      AV27W_B405_WP01_SD01 = new SdtB405_SD01(remoteHandle, context);
      H001D8_A76TBM33_STUDY_ID = new long[1] ;
      H001D8_A416TBM33_DEL_FLG = new String[] {""} ;
      H001D8_n416TBM33_DEL_FLG = new boolean[] {false} ;
      H001D8_A78TBM33_COND_NO = new short[1] ;
      H001D8_A77TBM33_CRF_ID = new short[1] ;
      H001D8_A414TBM33_EXPRESSION = new String[] {""} ;
      H001D8_n414TBM33_EXPRESSION = new boolean[] {false} ;
      H001D8_A415TBM33_PRIOR_NO = new byte[1] ;
      H001D8_n415TBM33_PRIOR_NO = new boolean[] {false} ;
      A416TBM33_DEL_FLG = "" ;
      A414TBM33_EXPRESSION = "" ;
      GXv_int3 = new short [1] ;
      A589TBM36_DEL_FLG = "" ;
      H001D9_A35TBM36_STUDY_ID = new long[1] ;
      H001D9_A36TBM36_CRF_ID = new short[1] ;
      H001D9_A37TBM36_COND_NO = new short[1] ;
      H001D9_A38TBM36_SELECT_CRF_ID = new short[1] ;
      H001D9_A589TBM36_DEL_FLG = new String[] {""} ;
      H001D9_n589TBM36_DEL_FLG = new boolean[] {false} ;
      AV6BC_TBT02_CRF = new SdtTBT02_CRF(remoteHandle);
      AV41W_SESSION = httpContext.getWebSession();
      H001D10_A53TBW01_DISP_DATETIME = new String[] {""} ;
      H001D10_A52TBW01_APP_ID = new String[] {""} ;
      H001D10_A51TBW01_SESSION_ID = new String[] {""} ;
      H001D10_A54TBW01_LINE_NO = new long[1] ;
      AV5BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      GXv_SdtA_PAGING_SDT4 = new SdtA_PAGING_SDT [1] ;
      AV37W_MSG = "" ;
      H001D11_A441TBT01_DEL_FLG = new String[] {""} ;
      H001D11_n441TBT01_DEL_FLG = new boolean[] {false} ;
      H001D11_A647TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      H001D11_n647TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      H001D11_A87TBT01_STUDY_ID = new long[1] ;
      H001D11_A88TBT01_SUBJECT_ID = new int[1] ;
      AV28W_B405_WP01_SD01_CRF_ITEM = new SdtB405_SD01_CRF_Item(remoteHandle, context);
      H001D12_A397TBM31_DEL_FLG = new String[] {""} ;
      H001D12_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H001D12_A643TBM31_STATUS = new String[] {""} ;
      H001D12_n643TBM31_STATUS = new boolean[] {false} ;
      H001D12_A69TBM31_CRF_ID = new short[1] ;
      H001D12_A68TBM31_STUDY_ID = new long[1] ;
      H001D13_A935TBT02_CRF_EDA_NO = new byte[1] ;
      H001D13_A91TBT02_CRF_ID = new short[1] ;
      H001D13_A90TBT02_SUBJECT_ID = new int[1] ;
      H001D13_A89TBT02_STUDY_ID = new long[1] ;
      H001D13_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      H001D13_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      GXt_char1 = "" ;
      H001D14_A369TBM21_DEL_FLG = new String[] {""} ;
      H001D14_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H001D14_A607TBM21_STATUS = new String[] {""} ;
      H001D14_n607TBM21_STATUS = new boolean[] {false} ;
      H001D14_A367TBM21_STUDY_NM = new String[] {""} ;
      H001D14_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H001D14_A63TBM21_STUDY_ID = new long[1] ;
      A607TBM21_STATUS = "" ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV35W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXv_char6 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grd_titleColumn = new com.genexus.webpanels.GXWebColumn();
      lblTextblock36_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
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
      lblTextblock18_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTxt_auto_sel_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grd_titleRow = new com.genexus.webpanels.GXWebRow();
      subGrd_title_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      lblBtn_sel_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblBtn_sel_Jsonclick = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b405_wp01_kanja_crf_list__default(),
         new Object[] {
             new Object[] {
            H001D2_A53TBW01_DISP_DATETIME, H001D2_A52TBW01_APP_ID, H001D2_A51TBW01_SESSION_ID, H001D2_A685TBW01_FREE_SAVE_1, H001D2_n685TBW01_FREE_SAVE_1, H001D2_A54TBW01_LINE_NO
            }
            , new Object[] {
            H001D3_AGRID1_nRecordCount
            }
            , new Object[] {
            H001D4_A397TBM31_DEL_FLG, H001D4_n397TBM31_DEL_FLG, H001D4_A643TBM31_STATUS, H001D4_n643TBM31_STATUS, H001D4_A69TBM31_CRF_ID, H001D4_A68TBM31_STUDY_ID, H001D4_A642TBM31_CRF_SNM, H001D4_n642TBM31_CRF_SNM
            }
            , new Object[] {
            H001D5_A58TBM01_SYS_ID, H001D5_A608TBM01_SYS_VALUE, H001D5_n608TBM01_SYS_VALUE
            }
            , new Object[] {
            H001D6_A397TBM31_DEL_FLG, H001D6_n397TBM31_DEL_FLG, H001D6_A643TBM31_STATUS, H001D6_n643TBM31_STATUS, H001D6_A69TBM31_CRF_ID, H001D6_A68TBM31_STUDY_ID
            }
            , new Object[] {
            H001D7_A54TBW01_LINE_NO, H001D7_A53TBW01_DISP_DATETIME, H001D7_A52TBW01_APP_ID, H001D7_A51TBW01_SESSION_ID, H001D7_A685TBW01_FREE_SAVE_1, H001D7_n685TBW01_FREE_SAVE_1
            }
            , new Object[] {
            H001D8_A76TBM33_STUDY_ID, H001D8_A416TBM33_DEL_FLG, H001D8_n416TBM33_DEL_FLG, H001D8_A78TBM33_COND_NO, H001D8_A77TBM33_CRF_ID, H001D8_A414TBM33_EXPRESSION, H001D8_n414TBM33_EXPRESSION, H001D8_A415TBM33_PRIOR_NO, H001D8_n415TBM33_PRIOR_NO
            }
            , new Object[] {
            H001D9_A35TBM36_STUDY_ID, H001D9_A36TBM36_CRF_ID, H001D9_A37TBM36_COND_NO, H001D9_A38TBM36_SELECT_CRF_ID, H001D9_A589TBM36_DEL_FLG, H001D9_n589TBM36_DEL_FLG
            }
            , new Object[] {
            H001D10_A53TBW01_DISP_DATETIME, H001D10_A52TBW01_APP_ID, H001D10_A51TBW01_SESSION_ID, H001D10_A54TBW01_LINE_NO
            }
            , new Object[] {
            H001D11_A441TBT01_DEL_FLG, H001D11_n441TBT01_DEL_FLG, H001D11_A647TBT01_OUTER_SUBJECT_ID, H001D11_n647TBT01_OUTER_SUBJECT_ID, H001D11_A87TBT01_STUDY_ID, H001D11_A88TBT01_SUBJECT_ID
            }
            , new Object[] {
            H001D12_A397TBM31_DEL_FLG, H001D12_n397TBM31_DEL_FLG, H001D12_A643TBM31_STATUS, H001D12_n643TBM31_STATUS, H001D12_A69TBM31_CRF_ID, H001D12_A68TBM31_STUDY_ID
            }
            , new Object[] {
            H001D13_A935TBT02_CRF_EDA_NO, H001D13_A91TBT02_CRF_ID, H001D13_A90TBT02_SUBJECT_ID, H001D13_A89TBT02_STUDY_ID, H001D13_A498TBT02_CRF_LATEST_VERSION, H001D13_n498TBT02_CRF_LATEST_VERSION
            }
            , new Object[] {
            H001D14_A369TBM21_DEL_FLG, H001D14_n369TBM21_DEL_FLG, H001D14_A607TBM21_STATUS, H001D14_n607TBM21_STATUS, H001D14_A367TBM21_STUDY_NM, H001D14_n367TBM21_STUDY_NM, H001D14_A63TBM21_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV50Pgmname = "B405_WP01_KANJA_CRF_LIST" ;
      /* GeneXus formulas. */
      AV50Pgmname = "B405_WP01_KANJA_CRF_LIST" ;
      Gx_err = (short)(0) ;
      edtavD_crfsnm_Enabled = 0 ;
      edtavD_grd1_hikensha_Enabled = 0 ;
      edtavD_grd2_crf_status_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV24P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV24P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte nDonePA ;
   private byte subGrd_title_Backcolorstyle ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte A415TBM33_PRIOR_NO ;
   private byte AV62GXLvl747 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrd_title_Allowselection ;
   private byte subGrd_title_Allowhovering ;
   private byte subGrd_title_Allowcollapsing ;
   private byte subGrd_title_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrd_title_Backstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte GRD_TITLE_nEOF ;
   private byte GRID2_nEOF ;
   private short wcpOAV23P_COL_COUNT ;
   private short nRC_GXsfl_167 ;
   private short nGXsfl_167_idx=1 ;
   private short nRC_GXsfl_195 ;
   private short nGXsfl_195_idx=1 ;
   private short nRC_GXsfl_176 ;
   private short nGXsfl_176_idx=1 ;
   private short AV23P_COL_COUNT ;
   private short A69TBM31_CRF_ID ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short subGrd_title_Borderwidth ;
   private short nGXsfl_167_Refreshing=0 ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_176_Refreshing=0 ;
   private short subGrid2_Borderwidth ;
   private short nGXsfl_195_Refreshing=0 ;
   private short Gx_err ;
   private short AV18H_COL_COUNT ;
   private short A78TBM33_COND_NO ;
   private short A77TBM33_CRF_ID ;
   private short AV30W_COND_HYOKA ;
   private short GXv_int3[] ;
   private short A38TBM36_SELECT_CRF_ID ;
   private short A36TBM36_CRF_ID ;
   private short A37TBM36_COND_NO ;
   private short AV32W_CRFID_COL ;
   private short AV40W_SEL_LINE_NO ;
   private short AV43W_TBM31_CRF_ID ;
   private short nGXsfl_176_fel_idx=1 ;
   private int A88TBT01_SUBJECT_ID ;
   private int A90TBT02_SUBJECT_ID ;
   private int subGrid1_Rows ;
   private int subGrd_title_Islastpage ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int GXPagingFrom4 ;
   private int GRID1_IsPaging ;
   private int edtavD_crfsnm_Enabled ;
   private int edtavD_grd1_hikensha_Enabled ;
   private int edtavD_grd2_crf_status_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int tblTbl_list_Width ;
   private int AV58GXV3 ;
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
   private int AV45W_TBT01_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private int tblTbl_grd1_hidden_Visible ;
   private int AV52GXV2 ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrd_title_Selectioncolor ;
   private int subGrd_title_Hoveringcolor ;
   private int idxLst ;
   private int subGrd_title_Backcolor ;
   private int subGrd_title_Allbackcolor ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd1_hikensha_Visible ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long A63TBM21_STUDY_ID ;
   private long A87TBT01_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A54TBW01_LINE_NO ;
   private long AV15D_STUDY_ID ;
   private long GXPagingTo4 ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long A76TBM33_STUDY_ID ;
   private long A35TBM36_STUDY_ID ;
   private long AV29W_CNT ;
   private long AV44W_TBT01_STUDY_ID ;
   private long GRD_TITLE_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_167_idx="0001" ;
   private String sGXsfl_195_idx="0001" ;
   private String sGXsfl_176_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV50Pgmname ;
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
   private String edtavD_crfsnm_Internalname ;
   private String edtavD_grd1_hikensha_Internalname ;
   private String edtTBW01_LINE_NO_Internalname ;
   private String edtavD_grd2_crf_status_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String edtavD_tbt01_outer_subject_id_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_disp_datetime_Internalname ;
   private String edtavH_col_count_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String tblTbl_list_Internalname ;
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
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sGXsfl_176_fel_idx="0001" ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String tblTbl_grd1_hidden_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_disp_datetime_Jsonclick ;
   private String edtavH_col_count_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divSection1_Internalname ;
   private String subGrid1_Internalname ;
   private String lblBtn_sel_Caption ;
   private String tblTbl_grid_header_Internalname ;
   private String subGrd_title_Internalname ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
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
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtavD_tbt01_outer_subject_id_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_auto_sel_Internalname ;
   private String lblTxt_auto_sel_Jsonclick ;
   private String sGXsfl_167_fel_idx="0001" ;
   private String subGrd_title_Class ;
   private String subGrd_title_Linesclass ;
   private String tblTbl_in_grid_header2_Internalname ;
   private String ROClassString ;
   private String edtavD_crfsnm_Jsonclick ;
   private String sGXsfl_195_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String tblTbl_in_grid3_Internalname ;
   private String edtavD_grd2_crf_status_Jsonclick ;
   private String lblBtn_sel_Internalname ;
   private String subGrid2_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_Internalname ;
   private String tblTbl_in_grid2_Internalname ;
   private String edtavD_grd1_hikensha_Jsonclick ;
   private String lblBtn_sel_Jsonclick ;
   private String edtTBW01_LINE_NO_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV12D_GRD1_CHECK ;
   private boolean n685TBW01_FREE_SAVE_1 ;
   private boolean AV9W_CRF_SEL_ONLY ;
   private boolean AV11D_GRD_CHK_ALL ;
   private boolean returnInSub ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n643TBM31_STATUS ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n608TBM01_SYS_VALUE ;
   private boolean AV31W_COND_OK ;
   private boolean n416TBM33_DEL_FLG ;
   private boolean n414TBM33_EXPRESSION ;
   private boolean n415TBM33_PRIOR_NO ;
   private boolean n589TBM36_DEL_FLG ;
   private boolean n441TBT01_DEL_FLG ;
   private boolean n647TBT01_OUTER_SUBJECT_ID ;
   private boolean AV38W_NO_SEL_CRF ;
   private boolean AV39W_RES_FLG ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean AV36W_GRID_READ_FLG ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private boolean n367TBM21_STUDY_NM ;
   private String A685TBW01_FREE_SAVE_1 ;
   private String AV22H_SRCH_FLG ;
   private String AV19H_DISP_DATETIME ;
   private String AV8C_TAM02_APP_ID ;
   private String A369TBM21_DEL_FLG ;
   private String A367TBM21_STUDY_NM ;
   private String A647TBT01_OUTER_SUBJECT_ID ;
   private String A441TBT01_DEL_FLG ;
   private String A643TBM31_STATUS ;
   private String A397TBM31_DEL_FLG ;
   private String AV34W_ERR_MSG ;
   private String A642TBM31_CRF_SNM ;
   private String AV10D_CRFSNM ;
   private String AV13D_GRD1_HIKENSHA ;
   private String AV14D_GRD2_CRF_STATUS ;
   private String A53TBW01_DISP_DATETIME ;
   private String A52TBW01_APP_ID ;
   private String A51TBW01_SESSION_ID ;
   private String AV16D_TBT01_OUTER_SUBJECT_ID ;
   private String AV20H_INIT_FLG ;
   private String AV21H_KNGN_FLG ;
   private String AV7C_GAMEN_TITLE ;
   private String A58TBM01_SYS_ID ;
   private String A608TBM01_SYS_VALUE ;
   private String AV42W_SYS_CRFID ;
   private String A416TBM33_DEL_FLG ;
   private String A414TBM33_EXPRESSION ;
   private String A589TBM36_DEL_FLG ;
   private String AV37W_MSG ;
   private String A607TBM21_STATUS ;
   private String AV35W_ERRCD ;
   private com.genexus.webpanels.GXWebGrid Grd_titleContainer ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grd_titleRow ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grd_titleColumn ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice cmbavD_study_id ;
   private ICheckbox chkavW_crf_sel_only ;
   private ICheckbox chkavD_grd_chk_all ;
   private ICheckbox chkavD_grd1_check ;
   private IDataStoreProvider pr_default ;
   private String[] H001D2_A53TBW01_DISP_DATETIME ;
   private String[] H001D2_A52TBW01_APP_ID ;
   private String[] H001D2_A51TBW01_SESSION_ID ;
   private String[] H001D2_A685TBW01_FREE_SAVE_1 ;
   private boolean[] H001D2_n685TBW01_FREE_SAVE_1 ;
   private long[] H001D2_A54TBW01_LINE_NO ;
   private long[] H001D3_AGRID1_nRecordCount ;
   private String[] H001D4_A397TBM31_DEL_FLG ;
   private boolean[] H001D4_n397TBM31_DEL_FLG ;
   private String[] H001D4_A643TBM31_STATUS ;
   private boolean[] H001D4_n643TBM31_STATUS ;
   private short[] H001D4_A69TBM31_CRF_ID ;
   private long[] H001D4_A68TBM31_STUDY_ID ;
   private String[] H001D4_A642TBM31_CRF_SNM ;
   private boolean[] H001D4_n642TBM31_CRF_SNM ;
   private String[] H001D5_A58TBM01_SYS_ID ;
   private String[] H001D5_A608TBM01_SYS_VALUE ;
   private boolean[] H001D5_n608TBM01_SYS_VALUE ;
   private String[] H001D6_A397TBM31_DEL_FLG ;
   private boolean[] H001D6_n397TBM31_DEL_FLG ;
   private String[] H001D6_A643TBM31_STATUS ;
   private boolean[] H001D6_n643TBM31_STATUS ;
   private short[] H001D6_A69TBM31_CRF_ID ;
   private long[] H001D6_A68TBM31_STUDY_ID ;
   private long[] H001D7_A54TBW01_LINE_NO ;
   private String[] H001D7_A53TBW01_DISP_DATETIME ;
   private String[] H001D7_A52TBW01_APP_ID ;
   private String[] H001D7_A51TBW01_SESSION_ID ;
   private String[] H001D7_A685TBW01_FREE_SAVE_1 ;
   private boolean[] H001D7_n685TBW01_FREE_SAVE_1 ;
   private long[] H001D8_A76TBM33_STUDY_ID ;
   private String[] H001D8_A416TBM33_DEL_FLG ;
   private boolean[] H001D8_n416TBM33_DEL_FLG ;
   private short[] H001D8_A78TBM33_COND_NO ;
   private short[] H001D8_A77TBM33_CRF_ID ;
   private String[] H001D8_A414TBM33_EXPRESSION ;
   private boolean[] H001D8_n414TBM33_EXPRESSION ;
   private byte[] H001D8_A415TBM33_PRIOR_NO ;
   private boolean[] H001D8_n415TBM33_PRIOR_NO ;
   private long[] H001D9_A35TBM36_STUDY_ID ;
   private short[] H001D9_A36TBM36_CRF_ID ;
   private short[] H001D9_A37TBM36_COND_NO ;
   private short[] H001D9_A38TBM36_SELECT_CRF_ID ;
   private String[] H001D9_A589TBM36_DEL_FLG ;
   private boolean[] H001D9_n589TBM36_DEL_FLG ;
   private String[] H001D10_A53TBW01_DISP_DATETIME ;
   private String[] H001D10_A52TBW01_APP_ID ;
   private String[] H001D10_A51TBW01_SESSION_ID ;
   private long[] H001D10_A54TBW01_LINE_NO ;
   private String[] H001D11_A441TBT01_DEL_FLG ;
   private boolean[] H001D11_n441TBT01_DEL_FLG ;
   private String[] H001D11_A647TBT01_OUTER_SUBJECT_ID ;
   private boolean[] H001D11_n647TBT01_OUTER_SUBJECT_ID ;
   private long[] H001D11_A87TBT01_STUDY_ID ;
   private int[] H001D11_A88TBT01_SUBJECT_ID ;
   private String[] H001D12_A397TBM31_DEL_FLG ;
   private boolean[] H001D12_n397TBM31_DEL_FLG ;
   private String[] H001D12_A643TBM31_STATUS ;
   private boolean[] H001D12_n643TBM31_STATUS ;
   private short[] H001D12_A69TBM31_CRF_ID ;
   private long[] H001D12_A68TBM31_STUDY_ID ;
   private byte[] H001D13_A935TBT02_CRF_EDA_NO ;
   private short[] H001D13_A91TBT02_CRF_ID ;
   private int[] H001D13_A90TBT02_SUBJECT_ID ;
   private long[] H001D13_A89TBT02_STUDY_ID ;
   private short[] H001D13_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] H001D13_n498TBT02_CRF_LATEST_VERSION ;
   private String[] H001D14_A369TBM21_DEL_FLG ;
   private boolean[] H001D14_n369TBM21_DEL_FLG ;
   private String[] H001D14_A607TBM21_STATUS ;
   private boolean[] H001D14_n607TBM21_STATUS ;
   private String[] H001D14_A367TBM21_STUDY_NM ;
   private boolean[] H001D14_n367TBM21_STUDY_NM ;
   private long[] H001D14_A63TBM21_STUDY_ID ;
   private com.genexus.webpanels.WebSession AV41W_SESSION ;
   private GxObjectCollection AV33W_CRFID_COLS ;
   private SdtTBW01_FREE_WORK AV5BC_FREE_WORK ;
   private SdtTBT02_CRF AV6BC_TBT02_CRF ;
   private SdtA_PAGING_SDT AV17H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT4[] ;
   private SdtA_LOGIN_SDT AV25W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtB405_SD01 AV27W_B405_WP01_SD01 ;
   private SdtB405_SD01_CRF_Item AV28W_B405_WP01_SD01_CRF_ITEM ;
}

final  class b405_wp01_kanja_crf_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001D4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV15D_STUDY_ID ,
                                          long A68TBM31_STUDY_ID ,
                                          short A69TBM31_CRF_ID ,
                                          String A643TBM31_STATUS ,
                                          String A397TBM31_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int7 ;
      GXv_int7 = new byte [1] ;
      Object[] GXv_Object8 ;
      GXv_Object8 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM`" ;
      scmdbuf = scmdbuf + " FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_CRF_ID` <> 0)" ;
      scmdbuf = scmdbuf + " and (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1')" ;
      scmdbuf = scmdbuf + " and (`TBM31_DEL_FLG` = '0')" ;
      if ( ! (0==AV15D_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBM31_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int7[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_H001D6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV15D_STUDY_ID ,
                                          long A68TBM31_STUDY_ID ,
                                          short A69TBM31_CRF_ID ,
                                          String A643TBM31_STATUS ,
                                          String A397TBM31_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int9 ;
      GXv_int9 = new byte [1] ;
      Object[] GXv_Object10 ;
      GXv_Object10 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_CRF_ID` <> 0)" ;
      scmdbuf = scmdbuf + " and (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1')" ;
      scmdbuf = scmdbuf + " and (`TBM31_DEL_FLG` = '0')" ;
      if ( ! (0==AV15D_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBM31_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H001D9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          short A38TBM36_SELECT_CRF_ID ,
                                          GxObjectCollection AV33W_CRFID_COLS ,
                                          String A589TBM36_DEL_FLG ,
                                          long A76TBM33_STUDY_ID ,
                                          short A77TBM33_CRF_ID ,
                                          short A78TBM33_COND_NO ,
                                          long A35TBM36_STUDY_ID ,
                                          short A36TBM36_CRF_ID ,
                                          short A37TBM36_COND_NO )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int11 ;
      GXv_int11 = new byte [3] ;
      Object[] GXv_Object12 ;
      GXv_Object12 = new Object [2] ;
      scmdbuf = "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`," ;
      scmdbuf = scmdbuf + " `TBM36_DEL_FLG` FROM `TBM36_CRF_SELECT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` = ? and `TBM36_COND_NO` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV33W_CRFID_COLS, "`TBM36_SELECT_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + " and (`TBM36_DEL_FLG` = '0')" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H001D11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           long AV15D_STUDY_ID ,
                                           String AV16D_TBT01_OUTER_SUBJECT_ID ,
                                           long A87TBT01_STUDY_ID ,
                                           String A647TBT01_OUTER_SUBJECT_ID ,
                                           String A441TBT01_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int14 ;
      GXv_int14 = new byte [2] ;
      Object[] GXv_Object15 ;
      GXv_Object15 = new Object [2] ;
      scmdbuf = "SELECT `TBT01_DEL_FLG`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`" ;
      scmdbuf = scmdbuf + " FROM `TBT01_SUBJECT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT01_DEL_FLG` = '0')" ;
      if ( ! (0==AV15D_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBT01_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16D_TBT01_OUTER_SUBJECT_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT01_OUTER_SUBJECT_ID` = ?)" ;
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT01_SUBJECT_ID`" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H001D12( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.internet.HttpContext httpContext ,
                                           long AV15D_STUDY_ID ,
                                           long A68TBM31_STUDY_ID ,
                                           short A69TBM31_CRF_ID ,
                                           String A643TBM31_STATUS ,
                                           String A397TBM31_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int16 ;
      GXv_int16 = new byte [1] ;
      Object[] GXv_Object17 ;
      GXv_Object17 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_CRF_ID` <> 0)" ;
      scmdbuf = scmdbuf + " and (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1')" ;
      scmdbuf = scmdbuf + " and (`TBM31_DEL_FLG` = '0')" ;
      if ( ! (0==AV15D_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBM31_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_H001D4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 4 :
                  return conditional_H001D6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 7 :
                  return conditional_H001D9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() );
            case 9 :
                  return conditional_H001D11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 10 :
                  return conditional_H001D12(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001D2", "SELECT `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_FREE_SAVE_1`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE (`TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ?) AND (? = '1') ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`  LIMIT ?, ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001D3", "SELECT COUNT(*) FROM `TBW01_FREE_WORK` WHERE (`TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ?) AND (? = '1') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H001D4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001D5", "SELECT `TBM01_SYS_ID`, `TBM01_SYS_VALUE` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = '016' ORDER BY `TBM01_SYS_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001D6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001D7", "SELECT `TBW01_LINE_NO`, `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_FREE_SAVE_1` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ? ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001D8", "SELECT `TBM33_STUDY_ID`, `TBM33_DEL_FLG`, `TBM33_COND_NO`, `TBM33_CRF_ID`, `TBM33_EXPRESSION`, `TBM33_PRIOR_NO` FROM `TBM33_CRF_COND` WHERE (`TBM33_CRF_ID` = ?) AND (`TBM33_STUDY_ID` = ?) AND (`TBM33_DEL_FLG` = '0') ORDER BY `TBM33_PRIOR_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001D9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001D10", "SELECT `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ? ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001D11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001D12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001D13", "SELECT `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_CRF_LATEST_VERSION` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = 1 ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001D14", "SELECT `TBM21_DEL_FLG`, `TBM21_STATUS`, `TBM21_STUDY_NM`, `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE (`TBM21_STATUS` IN ('0','1')) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getLongVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
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
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               stmt.setVarchar(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               stmt.setVarchar(4, (String)parms[3], 1);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[5]).shortValue());
               }
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 6);
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

