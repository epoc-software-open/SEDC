/*
               File: b713_wp01_subject_sink_impl
        Description: ä≥é“êVãKìoò^âÊñ 
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:18:56.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b713_wp01_subject_sink_impl extends GXWebPanel
{
   public b713_wp01_subject_sink_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b713_wp01_subject_sink_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b713_wp01_subject_sink_impl.class ));
   }

   public b713_wp01_subject_sink_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_site_id = new HTMLChoice();
      chkavCtlsel_flg = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_145 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_145_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_145_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_145, nGXsfl_145_idx, sGXsfl_145_idx) ;
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
            AV16P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16P_STUDY_ID", GXutil.ltrim( GXutil.str( AV16P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV27W_RTN_CD = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27W_RTN_CD", GXutil.str( AV27W_RTN_CD, 1, 0));
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
         pa1M2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1M2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1M2( ) ;
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
      httpContext.writeValue( "ä≥é“êVãKìoò^âÊñ ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317185683");
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
      GXEncryptionTmp = "b713_wp01_subject_sink"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV27W_RTN_CD,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b713_wp01_subject_sink") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1M2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_b713_sd01_subject_sink_list", AV20W_B713_SD01_SUBJECT_SINK_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_b713_sd01_subject_sink_list", AV20W_B713_SD01_SUBJECT_SINK_LIST);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV12H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV12H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_145", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_145, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV61Pgmname));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_ORDER", GXutil.ltrim( localUtil.ntoc( A395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV16P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DEL_FLG", GXutil.rtrim( A397TBM31_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_REPEAT_FLG", GXutil.ltrim( localUtil.ntoc( A943TBM31_REPEAT_FLG, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_NM", GXutil.rtrim( A393TBM31_CRF_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DEF_VISIT_NO", GXutil.ltrim( localUtil.ntoc( A528TBM31_DEF_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A945TBM44_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_ID", GXutil.ltrim( localUtil.ntoc( A946TBM44_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A947TBM44_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_VISIT_NO", GXutil.ltrim( localUtil.ntoc( A948TBM44_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM22_SITE_ID", GXutil.rtrim( A18TBM22_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "TBM22_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A17TBM22_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM22_DEL_FLG", GXutil.rtrim( A377TBM22_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_SITE_NM", GXutil.rtrim( A319TAM08_SITE_NM));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV19W_A821_JS));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV23W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "vW_RTN_CD", GXutil.ltrim( localUtil.ntoc( AV27W_RTN_CD, (byte)(1), (byte)(0), ".", "")));
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
      return "B713_WP01_SUBJECT_SINK" ;
   }

   public String getPgmdesc( )
   {
      return "ä≥é“êVãKìoò^âÊñ " ;
   }

   public void wb1M0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1M2( true) ;
      }
      else
      {
         wb_table1_2_1M2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_167_1M2( true) ;
      }
      else
      {
         wb_table2_167_1M2( false) ;
      }
      return  ;
   }

   public void wb_table2_167_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1M2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "ä≥é“êVãKìoò^âÊñ ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1M0( ) ;
   }

   public void ws1M2( )
   {
      start1M2( ) ;
      evt1M2( ) ;
   }

   public void evt1M2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111M2 */
                        e111M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121M2 */
                        e121M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CANCEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131M2 */
                        e131M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141M2 */
                        e141M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151M2 */
                        e151M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161M2 */
                        e161M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171M2 */
                        e171M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181M2 */
                        e181M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191M2 */
                        e191M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201M2 */
                        e201M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211M2 */
                        e211M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221M2 */
                        e221M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231M2 */
                        e231M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241M2 */
                        e241M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251M2 */
                        e251M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261M2 */
                        e261M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271M2 */
                        e271M2 ();
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
                        nGXsfl_145_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1452( ) ;
                        AV30GXV1 = (short)(nGXsfl_145_idx+GRID1_nFirstRecordOnPage) ;
                        if ( ( AV20W_B713_SD01_SUBJECT_SINK_LIST.size() >= AV30GXV1 ) && ( AV30GXV1 > 0 ) )
                        {
                           AV20W_B713_SD01_SUBJECT_SINK_LIST.currentItem( ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)) );
                           ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg.getInternalname())) );
                           ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
                           ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e281M2 */
                              e281M2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e291M2 */
                              e291M2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e301M2 */
                              e301M2 ();
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

   public void we1M2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1M2( ) ;
         }
      }
   }

   public void pa1M2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b713_wp01_subject_sink")), "b713_wp01_subject_sink") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b713_wp01_subject_sink"))) ;
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
                  AV16P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16P_STUDY_ID", GXutil.ltrim( GXutil.str( AV16P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV27W_RTN_CD = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27W_RTN_CD", GXutil.str( AV27W_RTN_CD, 1, 0));
                  }
               }
            }
         }
         cmbavD_site_id.setName( "vD_SITE_ID" );
         cmbavD_site_id.setWebtags( "" );
         if ( cmbavD_site_id.getItemCount() > 0 )
         {
            AV10D_SITE_ID = cmbavD_site_id.getValidValue(AV10D_SITE_ID) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10D_SITE_ID", AV10D_SITE_ID);
         }
         GXCCtl = "CTLSEL_FLG_" + sGXsfl_145_idx ;
         chkavCtlsel_flg.setName( GXCCtl );
         chkavCtlsel_flg.setWebtags( "" );
         chkavCtlsel_flg.setCaption( "" );
         chkavCtlsel_flg.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_145 ,
                                 short nGXsfl_145_idx ,
                                 String sGXsfl_145_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1452( ) ;
      while ( nGXsfl_145_idx <= nRC_GXsfl_145 )
      {
         sendrow_1452( ) ;
         nGXsfl_145_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_145_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_145_idx+1)) ;
         sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1452( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1M2( ) ;
      /* End function Refresh */
   }

   public void rf1M2( )
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
      wbStart = (short)(145) ;
      nGXsfl_145_idx = (short)(1) ;
      sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1452( ) ;
      nGXsfl_145_Refreshing = (short)(1) ;
      /* Execute user event: e291M2 */
      e291M2 ();
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1452( ) ;
         /* Execute user event: e301M2 */
         e301M2 ();
         wbEnd = (short)(145) ;
         wb1M0( ) ;
      }
      nGXsfl_145_Refreshing = (short)(0) ;
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
      return AV20W_B713_SD01_SUBJECT_SINK_LIST.size() ;
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

   public void strup1M0( )
   {
      /* Before Start, stand alone formulas. */
      AV61Pgmname = "B713_WP01_SUBJECT_SINK" ;
      AV60Pgmdesc = "ä≥é“êVãKìoò^âÊñ " ;
      Gx_err = (short)(0) ;
      edtavCtltbm31_crf_snm_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e281M2 */
      e281M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b713_sd01_subject_sink_list"), AV20W_B713_SD01_SUBJECT_SINK_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV12H_A_PAGING_SDT);
         /* Read variables values. */
         AV11D_SUBJECT_ID = httpContext.cgiGet( edtavD_subject_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_SUBJECT_ID", AV11D_SUBJECT_ID);
         cmbavD_site_id.setName( cmbavD_site_id.getInternalname() );
         cmbavD_site_id.setValue( httpContext.cgiGet( cmbavD_site_id.getInternalname()) );
         AV10D_SITE_ID = httpContext.cgiGet( cmbavD_site_id.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_SITE_ID", AV10D_SITE_ID);
         AV13H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         AV14H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_Internalname), ".", ",") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SUBJECT_ID");
            GX_FocusControl = edtavH_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15H_SUBJECT_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV15H_SUBJECT_ID, 6, 0)));
         }
         else
         {
            AV15H_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtavH_subject_id_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV15H_SUBJECT_ID, 6, 0)));
         }
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
         nRC_GXsfl_145 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_145"), ".", ",")) ;
         AV16P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV27W_RTN_CD = (byte)(localUtil.ctol( httpContext.cgiGet( "vW_RTN_CD"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_GXsfl_145 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_145"), ".", ",")) ;
         nGXsfl_145_fel_idx = (short)(0) ;
         while ( nGXsfl_145_fel_idx < nRC_GXsfl_145 )
         {
            nGXsfl_145_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_145_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_145_fel_idx+1)) ;
            sGXsfl_145_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1452( ) ;
            AV30GXV1 = (short)(nGXsfl_145_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV30GXV1 = (short)(nGXsfl_145_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV20W_B713_SD01_SUBJECT_SINK_LIST.size() >= AV30GXV1 ) && ( AV30GXV1 > 0 ) )
            {
               AV20W_B713_SD01_SUBJECT_SINK_LIST.currentItem( ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)) );
               ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg( GXutil.strtobool( httpContext.cgiGet( chkavCtlsel_flg.getInternalname())) );
               ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
               ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
            }
            AV20W_B713_SD01_SUBJECT_SINK_LIST.currentItem( ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)) );
         }
         if ( nGXsfl_145_fel_idx == 0 )
         {
            nGXsfl_145_idx = (short)(1) ;
            sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1452( ) ;
         }
         nGXsfl_145_fel_idx = (short)(1) ;
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
      /* Execute user event: e281M2 */
      e281M2 ();
      if (returnInSub) return;
   }

   public void e281M2( )
   {
      /* Start Routine */
      AV7C_APP_ID = "B713" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_APP_ID", AV7C_APP_ID);
      AV8C_GAMEN_TITLE = AV60Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_GAMEN_TITLE", AV8C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV13H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      edtavCtltbm31_crf_id_Visible = 0 ;
   }

   public void e291M2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV13H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV61Pgmname, "INFO", "âÊñ ãNìÆ") ;
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
   }

   private void e301M2( )
   {
      /* Grid1_Load Routine */
      AV30GXV1 = (short)(1) ;
      while ( AV30GXV1 <= AV20W_B713_SD01_SUBJECT_SINK_LIST.size() )
      {
         AV20W_B713_SD01_SUBJECT_SINK_LIST.currentItem( ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20W_B713_SD01_SUBJECT_SINK_LIST", AV20W_B713_SD01_SUBJECT_SINK_LIST);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(145) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1452( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         AV30GXV1 = (short)(AV30GXV1+1) ;
      }
   }

   public void e111M2( )
   {
      /* 'BTN_REG' Routine */
      AV15H_SUBJECT_ID = (int)(GXutil.lval( AV11D_SUBJECT_ID)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV15H_SUBJECT_ID, 6, 0)));
      AV23W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( ! AV23W_ERRFLG )
      {
         GXt_char1 = AV24W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
         b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         GXt_char1 = AV19W_A821_JS ;
         GXv_char2[0] = GXt_char1 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV24W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
         b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         AV19W_A821_JS = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19W_A821_JS", AV19W_A821_JS);
      }
   }

   public void e121M2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV24W_MSG)==0) )
      {
         AV24W_MSG = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         AV6BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_study_id( AV16P_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_SUBJECT", AV6BC_SUBJECT);
         AV6BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_subject_id( AV15H_SUBJECT_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_SUBJECT", AV6BC_SUBJECT);
         AV6BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id( AV11D_SUBJECT_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_SUBJECT", AV6BC_SUBJECT);
         AV6BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_site_id( AV10D_SITE_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_SUBJECT", AV6BC_SUBJECT);
         AV6BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_del_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_SUBJECT", AV6BC_SUBJECT);
         AV6BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm( AV61Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_SUBJECT", AV6BC_SUBJECT);
         AV6BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm( AV61Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_SUBJECT", AV6BC_SUBJECT);
         AV6BC_SUBJECT.Save();
         if ( AV6BC_SUBJECT.Success() )
         {
         }
         else
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_SUBJECT.GetMessages(), (byte)(0), GXv_char2) ;
            b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         }
         if ( (GXutil.strcmp("", AV24W_MSG)==0) )
         {
            AV62GXV32 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62GXV32", GXutil.ltrim( GXutil.str( AV62GXV32, 8, 0)));
            while ( AV62GXV32 <= AV20W_B713_SD01_SUBJECT_SINK_LIST.size() )
            {
               AV21W_B713_SD01_SUBJECT_SINK_LIST_Item = (SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV62GXV32));
               if ( AV21W_B713_SD01_SUBJECT_SINK_LIST_Item.getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg() )
               {
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_study_id( AV16P_STUDY_ID );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( AV15H_SUBJECT_ID );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( AV21W_B713_SD01_SUBJECT_SINK_LIST_Item.getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no( (byte)(1) );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( (short)(0) );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( (byte)(1) );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_del_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( AV61Pgmname );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( AV61Pgmname );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
                  AV5BC_CRF.Save();
                  if ( AV5BC_CRF.Success() )
                  {
                  }
                  else
                  {
                     GXt_char1 = AV24W_MSG ;
                     GXv_char2[0] = GXt_char1 ;
                     new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF.GetMessages(), (byte)(0), GXv_char2) ;
                     b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
                     AV24W_MSG = GXt_char1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
                     if (true) break;
                  }
               }
               AV62GXV32 = (int)(AV62GXV32+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62GXV32", GXutil.ltrim( GXutil.str( AV62GXV32, 8, 0)));
            }
         }
      }
      if ( (GXutil.strcmp("", AV24W_MSG)==0) )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b713_wp01_subject_sink");
         AV27W_RTN_CD = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_RTN_CD", GXutil.str( AV27W_RTN_CD, 1, 0));
         httpContext.setWebReturnParms(new Object[] {new Byte(AV27W_RTN_CD)});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b713_wp01_subject_sink");
         httpContext.GX_msglist.addItem(AV24W_MSG);
      }
   }

   public void e131M2( )
   {
      /* 'BTN_CANCEL' Routine */
      AV27W_RTN_CD = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_RTN_CD", GXutil.str( AV27W_RTN_CD, 1, 0));
      httpContext.setWebReturnParms(new Object[] {new Byte(AV27W_RTN_CD)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
   }

   public void S152( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavD_site_id.removeAllItems();
      /* Using cursor H001M2 */
      pr_default.execute(0, new Object[] {new Long(AV16P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A377TBM22_DEL_FLG = H001M2_A377TBM22_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A377TBM22_DEL_FLG", A377TBM22_DEL_FLG);
         n377TBM22_DEL_FLG = H001M2_n377TBM22_DEL_FLG[0] ;
         A17TBM22_STUDY_ID = H001M2_A17TBM22_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A17TBM22_STUDY_ID, 10, 0)));
         A319TAM08_SITE_NM = H001M2_A319TAM08_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
         n319TAM08_SITE_NM = H001M2_n319TAM08_SITE_NM[0] ;
         A18TBM22_SITE_ID = H001M2_A18TBM22_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18TBM22_SITE_ID", A18TBM22_SITE_ID);
         A319TAM08_SITE_NM = H001M2_A319TAM08_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
         n319TAM08_SITE_NM = H001M2_n319TAM08_SITE_NM[0] ;
         cmbavD_site_id.addItem(A18TBM22_SITE_ID, A319TAM08_SITE_NM, (short)(0));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S142( )
   {
      /* 'SUB_SRCH' Routine */
      AV23W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      AV20W_B713_SD01_SUBJECT_SINK_LIST.clear();
      gx_BV145 = true ;
      /* Using cursor H001M3 */
      pr_default.execute(1, new Object[] {new Long(AV16P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A68TBM31_STUDY_ID = H001M3_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A397TBM31_DEL_FLG = H001M3_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = H001M3_n397TBM31_DEL_FLG[0] ;
         A69TBM31_CRF_ID = H001M3_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A393TBM31_CRF_NM = H001M3_A393TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
         n393TBM31_CRF_NM = H001M3_n393TBM31_CRF_NM[0] ;
         A643TBM31_STATUS = H001M3_A643TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
         n643TBM31_STATUS = H001M3_n643TBM31_STATUS[0] ;
         A943TBM31_REPEAT_FLG = H001M3_A943TBM31_REPEAT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A943TBM31_REPEAT_FLG", GXutil.str( A943TBM31_REPEAT_FLG, 1, 0));
         n943TBM31_REPEAT_FLG = H001M3_n943TBM31_REPEAT_FLG[0] ;
         A528TBM31_DEF_VISIT_NO = H001M3_A528TBM31_DEF_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A528TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A528TBM31_DEF_VISIT_NO, 6, 0)));
         n528TBM31_DEF_VISIT_NO = H001M3_n528TBM31_DEF_VISIT_NO[0] ;
         A395TBM31_ORDER = H001M3_A395TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
         n395TBM31_ORDER = H001M3_n395TBM31_ORDER[0] ;
         if ( A943TBM31_REPEAT_FLG == 0 )
         {
            AV21W_B713_SD01_SUBJECT_SINK_LIST_Item = (SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)new SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem(remoteHandle, context);
            AV21W_B713_SD01_SUBJECT_SINK_LIST_Item.setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg( false );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_B713_SD01_SUBJECT_SINK_LIST_Item", AV21W_B713_SD01_SUBJECT_SINK_LIST_Item);
            AV21W_B713_SD01_SUBJECT_SINK_LIST_Item.setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id( A69TBM31_CRF_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_B713_SD01_SUBJECT_SINK_LIST_Item", AV21W_B713_SD01_SUBJECT_SINK_LIST_Item);
            AV21W_B713_SD01_SUBJECT_SINK_LIST_Item.setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm( A393TBM31_CRF_NM+"("+GXutil.trim( GXutil.str( A528TBM31_DEF_VISIT_NO, 10, 0))+")" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_B713_SD01_SUBJECT_SINK_LIST_Item", AV21W_B713_SD01_SUBJECT_SINK_LIST_Item);
            AV20W_B713_SD01_SUBJECT_SINK_LIST.add(AV21W_B713_SD01_SUBJECT_SINK_LIST_Item, 0);
            gx_BV145 = true ;
         }
         else
         {
            /* Using cursor H001M4 */
            pr_default.execute(2, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A945TBM44_STUDY_ID = H001M4_A945TBM44_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
               A946TBM44_CRF_ID = H001M4_A946TBM44_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
               A947TBM44_CRF_EDA_NO = H001M4_A947TBM44_CRF_EDA_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
               A948TBM44_VISIT_NO = H001M4_A948TBM44_VISIT_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
               n948TBM44_VISIT_NO = H001M4_n948TBM44_VISIT_NO[0] ;
               AV21W_B713_SD01_SUBJECT_SINK_LIST_Item = (SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)new SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem(remoteHandle, context);
               AV21W_B713_SD01_SUBJECT_SINK_LIST_Item.setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg( false );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_B713_SD01_SUBJECT_SINK_LIST_Item", AV21W_B713_SD01_SUBJECT_SINK_LIST_Item);
               AV21W_B713_SD01_SUBJECT_SINK_LIST_Item.setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id( A69TBM31_CRF_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_B713_SD01_SUBJECT_SINK_LIST_Item", AV21W_B713_SD01_SUBJECT_SINK_LIST_Item);
               AV21W_B713_SD01_SUBJECT_SINK_LIST_Item.setgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm( A393TBM31_CRF_NM+"("+GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 10, 0))+")" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21W_B713_SD01_SUBJECT_SINK_LIST_Item", AV21W_B713_SD01_SUBJECT_SINK_LIST_Item);
               AV20W_B713_SD01_SUBJECT_SINK_LIST.add(AV21W_B713_SD01_SUBJECT_SINK_LIST_Item, 0);
               gx_BV145 = true ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", AV24W_MSG)==0) )
      {
         httpContext.GX_msglist.addItem(AV24W_MSG);
      }
      edtavD_subject_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_subject_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_subject_id_Backcolor, 9, 0)));
      if ( ! AV23W_ERRFLG )
      {
         if ( (GXutil.strcmp("", AV11D_SUBJECT_ID)==0) )
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00001", "ä≥é“ID", "", "", "", "", GXv_char2) ;
            b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            httpContext.GX_msglist.addItem(AV24W_MSG);
            edtavD_subject_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_subject_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_subject_id_Backcolor, 9, 0)));
            GX_FocusControl = edtavD_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            AV23W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
         }
      }
      if ( ! AV23W_ERRFLG )
      {
         if ( GxRegex.IsMatch(AV11D_SUBJECT_ID,"[^0-9]") )
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00019", "ä≥é“ID", "", "", "", "", GXv_char2) ;
            b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            httpContext.GX_msglist.addItem(AV24W_MSG);
            edtavD_subject_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_subject_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_subject_id_Backcolor, 9, 0)));
            GX_FocusControl = edtavD_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            AV23W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
         }
      }
      if ( ! AV23W_ERRFLG )
      {
         /* Using cursor H001M5 */
         pr_default.execute(3, new Object[] {new Long(AV16P_STUDY_ID), new Integer(AV15H_SUBJECT_ID)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A88TBT01_SUBJECT_ID = H001M5_A88TBT01_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A88TBT01_SUBJECT_ID, 6, 0)));
            A87TBT01_STUDY_ID = H001M5_A87TBT01_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A87TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A87TBT01_STUDY_ID, 10, 0)));
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00006", "ä≥é“ID", "", "", "", "", GXv_char2) ;
            b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            httpContext.GX_msglist.addItem(AV24W_MSG);
            edtavD_subject_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_subject_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_subject_id_Backcolor, 9, 0)));
            GX_FocusControl = edtavD_subject_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            AV23W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      if ( (GXutil.strcmp("", AV10D_SITE_ID)==0) )
      {
         GXt_char1 = AV24W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "ä≥é“èäëÆé{ê›", "", "", "", "", GXv_char2) ;
         b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         httpContext.GX_msglist.addItem(AV24W_MSG);
         cmbavD_site_id.setIBackground( UIFactory.getColor( 255, 192, 203) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_site_id.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavD_site_id.getIBackground(), 9, 0)));
         GX_FocusControl = cmbavD_site_id.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV23W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
      }
      if ( ! AV23W_ERRFLG )
      {
         AV25W_SEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_SEL_FLG", AV25W_SEL_FLG);
         AV67GXV33 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67GXV33", GXutil.ltrim( GXutil.str( AV67GXV33, 8, 0)));
         while ( AV67GXV33 <= AV20W_B713_SD01_SUBJECT_SINK_LIST.size() )
         {
            AV21W_B713_SD01_SUBJECT_SINK_LIST_Item = (SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV67GXV33));
            if ( AV21W_B713_SD01_SUBJECT_SINK_LIST_Item.getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg() )
            {
               AV25W_SEL_FLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_SEL_FLG", AV25W_SEL_FLG);
               if (true) break;
            }
            AV67GXV33 = (int)(AV67GXV33+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67GXV33", GXutil.ltrim( GXutil.str( AV67GXV33, 8, 0)));
         }
         if ( ! AV25W_SEL_FLG )
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "égópÇ∑ÇÈCRF", "", "", "", "", GXv_char2) ;
            b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            httpContext.GX_msglist.addItem(AV24W_MSG);
            AV23W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
         }
      }
   }

   public void S192( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV68GXLvl390 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68GXLvl390", GXutil.str( AV68GXLvl390, 1, 0));
      /* Using cursor H001M6 */
      pr_default.execute(4, new Object[] {new Long(AV16P_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV68GXLvl390 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68GXLvl390", GXutil.str( AV68GXLvl390, 1, 0));
      }
      while ( (pr_default.getStatus(4) != 101) )
      {
         A369TBM21_DEL_FLG = H001M6_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H001M6_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = H001M6_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A607TBM21_STATUS = H001M6_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = H001M6_n607TBM21_STATUS[0] ;
         AV68GXLvl390 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68GXLvl390", GXutil.str( AV68GXLvl390, 1, 0));
         if ( GXutil.strcmp(A607TBM21_STATUS, "2") == 0 )
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "ééå±ÇÃèÛë‘", "ÅuèIóπÅv", "í«â¡", "", "", GXv_char2) ;
            b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            AV23W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
         }
         else if ( GXutil.strcmp(A607TBM21_STATUS, "9") == 0 )
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "ééå±ÇÃèÛë‘", "ÅuíÜé~Åv", "í«â¡", "", "", GXv_char2) ;
            b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            AV23W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV68GXLvl390 == 0 )
      {
         GXt_char1 = AV24W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "ëIëÇ≥ÇÍÇΩééå±", "óòópïsâ¬", "í«â¡", "", "", GXv_char2) ;
         b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         AV23W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRFLG", AV23W_ERRFLG);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV22W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b713_wp01_subject_sink_impl.this.AV22W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_ERRCD", AV22W_ERRCD);
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
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
      AV11D_SUBJECT_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_SUBJECT_ID", AV11D_SUBJECT_ID);
      AV10D_SITE_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_SITE_ID", AV10D_SITE_ID);
      AV15H_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SUBJECT_ID", GXutil.ltrim( GXutil.str( AV15H_SUBJECT_ID, 6, 0)));
      AV18W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18W_A819_JS", AV18W_A819_JS);
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
      if ( ! (GXutil.strcmp("", AV19W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV19W_A821_JS ;
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

   public void S202( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV61Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b713_wp01_subject_sink");
   }

   public void e141M2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e151M2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      }
      else
      {
         AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e161M2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e171M2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e181M2( )
   {
      /* 'PAGE01' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e191M2( )
   {
      /* 'PAGE02' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201M2( )
   {
      /* 'PAGE03' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211M2( )
   {
      /* 'PAGE04' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221M2( )
   {
      /* 'PAGE05' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231M2( )
   {
      /* 'PAGE06' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241M2( )
   {
      /* 'PAGE07' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251M2( )
   {
      /* 'PAGE08' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261M2( )
   {
      /* 'PAGE09' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271M2( )
   {
      /* 'PAGE10' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      AV12H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12H_A_PAGING_SDT", AV12H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT4[0] = AV12H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT4) ;
      AV12H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT4[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         if ( ! AV23W_ERRFLG )
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
            b713_wp01_subject_sink_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            httpContext.GX_msglist.addItem(AV24W_MSG);
         }
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(ëS"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+"åè)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void wb_table2_167_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B713_WP01_SUBJECT_SINK.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_exec_Internalname, "TXT_BTN_REG_EXEC", "", "", lblTxt_btn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV13H_INIT_FLG), GXutil.rtrim( localUtil.format( AV13H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(172);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV14H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV14H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_subject_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV15H_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15H_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_subject_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "<br>") ;
         httpContext.writeText( "<span></span>") ;
         wb_table3_175_1M2( true) ;
      }
      else
      {
         wb_table3_175_1M2( false) ;
      }
      return  ;
   }

   public void wb_table3_175_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_167_1M2e( true) ;
      }
      else
      {
         wb_table2_167_1M2e( false) ;
      }
   }

   public void wb_table3_175_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "MAX_ROW", "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(180);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "REC_CNT", "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "PAGE_KBN", "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "PAGE_NO", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(195);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_no_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "PAGE01", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage01_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(200);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage01_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "PAGE02", "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage02_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(205);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage02_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "PAGE03", "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage03_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(210);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage03_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "PAGE04", "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage04_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage04_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "PAGE05", "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 220,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage05_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(220);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage05_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "PAGE06", "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage06_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(225);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage06_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, "PAGE07", "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 230,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage07_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(230);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage07_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, "PAGE08", "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage08_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(235);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage08_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "PAGE09", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 240,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage09_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(240);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage09_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, "PAGE10", "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage10_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(245);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage10_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "PAGE_DISP01", "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 250,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp01_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(250);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp01_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "PAGE_DISP02", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 255,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp02_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(255);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp02_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "PAGE_DISP03", "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 260,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp03_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(260);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp03_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "PAGE_DISP04", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 265,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp04_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(265);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp04_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, "PAGE_DISP05", "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 270,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp05_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(270);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp05_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, "PAGE_DISP06", "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 275,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp06_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(275);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp06_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, "PAGE_DISP07", "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 280,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp07_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(280);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp07_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, "PAGE_DISP08", "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 285,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp08_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(285);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp08_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, "PAGE_DISP09", "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 290,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp09_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(290);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp09_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, "PAGE_DISP10", "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 295,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp10_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(295);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp10_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, "PAGE_DISP_BACK", "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 300,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_back_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(300);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp_back_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, "PAGE_DISP_NEXT", "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 305,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_next_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(305);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp_next_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, "PAGE_DISP_AREA", "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 310,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_area_Internalname, GXutil.ltrim( localUtil.ntoc( AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), (byte)(1), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(310);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlpage_disp_area_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_175_1M2e( true) ;
      }
      else
      {
         wb_table3_175_1M2e( false) ;
      }
   }

   public void wb_table1_2_1M2( boolean wbgen )
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
         httpContext.writeText( "<td align=\"center\"  style=\"height:100%;width:1187px\">") ;
         wb_table4_6_1M2( true) ;
      }
      else
      {
         wb_table4_6_1M2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1M2e( boolean wbgen )
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
         wb_table1_2_1M2e( true) ;
      }
      else
      {
         wb_table1_2_1M2e( false) ;
      }
   }

   public void wb_table4_6_1M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 650, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table5_11_1M2( true) ;
      }
      else
      {
         wb_table5_11_1M2( false) ;
      }
      return  ;
   }

   public void wb_table5_11_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"vertical-align:top;height:100%\">") ;
         wb_table6_18_1M2( true) ;
      }
      else
      {
         wb_table6_18_1M2( false) ;
      }
      return  ;
   }

   public void wb_table6_18_1M2e( boolean wbgen )
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
         httpContext.writeText( "<td align=\"right\" colspan=\"3\" >") ;
         wb_table7_156_1M2( true) ;
      }
      else
      {
         wb_table7_156_1M2( false) ;
      }
      return  ;
   }

   public void wb_table7_156_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_6_1M2e( true) ;
      }
      else
      {
         wb_table4_6_1M2e( false) ;
      }
   }

   public void wb_table7_156_1M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_reg_Internalname, "OK", "", "", lblBtn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "ÉLÉÉÉìÉZÉã", "", "", lblBtn_cancel_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CANCEL\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_156_1M2e( true) ;
      }
      else
      {
         wb_table7_156_1M2e( false) ;
      }
   }

   public void wb_table6_18_1M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_21_1M2( true) ;
      }
      else
      {
         wb_table8_21_1M2( false) ;
      }
      return  ;
   }

   public void wb_table8_21_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_18_1M2e( true) ;
      }
      else
      {
         wb_table6_18_1M2e( false) ;
      }
   }

   public void wb_table8_21_1M2( boolean wbgen )
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
         wb_table9_27_1M2( true) ;
      }
      else
      {
         wb_table9_27_1M2( false) ;
      }
      return  ;
   }

   public void wb_table9_27_1M2e( boolean wbgen )
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
         httpContext.writeText( "<td>") ;
         wb_table10_42_1M2( true) ;
      }
      else
      {
         wb_table10_42_1M2( false) ;
      }
      return  ;
   }

   public void wb_table10_42_1M2e( boolean wbgen )
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
         wb_table11_138_1M2( true) ;
      }
      else
      {
         wb_table11_138_1M2( false) ;
      }
      return  ;
   }

   public void wb_table11_138_1M2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"145\">") ;
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
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_id_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 145 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_145 = (short)(nGXsfl_145_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV30GXV1 = nGXsfl_145_idx ;
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
         wb_table8_21_1M2e( true) ;
      }
      else
      {
         wb_table8_21_1M2e( false) ;
      }
   }

   public void wb_table11_138_1M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:560px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "égópÇ∑ÇÈCRF ÅiVISITî‘çÜÅj", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_138_1M2e( true) ;
      }
      else
      {
         wb_table11_138_1M2e( false) ;
      }
   }

   public void wb_table10_42_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_48_1M2( true) ;
      }
      else
      {
         wb_table12_48_1M2( false) ;
      }
      return  ;
   }

   public void wb_table12_48_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_42_1M2e( true) ;
      }
      else
      {
         wb_table10_42_1M2e( false) ;
      }
   }

   public void wb_table12_48_1M2( boolean wbgen )
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
         wb_table13_51_1M2( true) ;
      }
      else
      {
         wb_table13_51_1M2( false) ;
      }
      return  ;
   }

   public void wb_table13_51_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table14_57_1M2( true) ;
      }
      else
      {
         wb_table14_57_1M2( false) ;
      }
      return  ;
   }

   public void wb_table14_57_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_63_1M2( true) ;
      }
      else
      {
         wb_table15_63_1M2( false) ;
      }
      return  ;
   }

   public void wb_table15_63_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_69_1M2( true) ;
      }
      else
      {
         wb_table16_69_1M2( false) ;
      }
      return  ;
   }

   public void wb_table16_69_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_75_1M2( true) ;
      }
      else
      {
         wb_table17_75_1M2( false) ;
      }
      return  ;
   }

   public void wb_table17_75_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_81_1M2( true) ;
      }
      else
      {
         wb_table18_81_1M2( false) ;
      }
      return  ;
   }

   public void wb_table18_81_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_87_1M2( true) ;
      }
      else
      {
         wb_table19_87_1M2( false) ;
      }
      return  ;
   }

   public void wb_table19_87_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_93_1M2( true) ;
      }
      else
      {
         wb_table20_93_1M2( false) ;
      }
      return  ;
   }

   public void wb_table20_93_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_99_1M2( true) ;
      }
      else
      {
         wb_table21_99_1M2( false) ;
      }
      return  ;
   }

   public void wb_table21_99_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_105_1M2( true) ;
      }
      else
      {
         wb_table22_105_1M2( false) ;
      }
      return  ;
   }

   public void wb_table22_105_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_111_1M2( true) ;
      }
      else
      {
         wb_table23_111_1M2( false) ;
      }
      return  ;
   }

   public void wb_table23_111_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_117_1M2( true) ;
      }
      else
      {
         wb_table24_117_1M2( false) ;
      }
      return  ;
   }

   public void wb_table24_117_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_123_1M2( true) ;
      }
      else
      {
         wb_table25_123_1M2( false) ;
      }
      return  ;
   }

   public void wb_table25_123_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_129_1M2( true) ;
      }
      else
      {
         wb_table26_129_1M2( false) ;
      }
      return  ;
   }

   public void wb_table26_129_1M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_48_1M2e( true) ;
      }
      else
      {
         wb_table12_48_1M2e( false) ;
      }
   }

   public void wb_table26_129_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "ç≈å„Ç÷", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_129_1M2e( true) ;
      }
      else
      {
         wb_table26_129_1M2e( false) ;
      }
   }

   public void wb_table25_123_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "éüÇ÷", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_123_1M2e( true) ;
      }
      else
      {
         wb_table25_123_1M2e( false) ;
      }
   }

   public void wb_table24_117_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_117_1M2e( true) ;
      }
      else
      {
         wb_table24_117_1M2e( false) ;
      }
   }

   public void wb_table23_111_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_111_1M2e( true) ;
      }
      else
      {
         wb_table23_111_1M2e( false) ;
      }
   }

   public void wb_table22_105_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_105_1M2e( true) ;
      }
      else
      {
         wb_table22_105_1M2e( false) ;
      }
   }

   public void wb_table21_99_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_99_1M2e( true) ;
      }
      else
      {
         wb_table21_99_1M2e( false) ;
      }
   }

   public void wb_table20_93_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_93_1M2e( true) ;
      }
      else
      {
         wb_table20_93_1M2e( false) ;
      }
   }

   public void wb_table19_87_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_87_1M2e( true) ;
      }
      else
      {
         wb_table19_87_1M2e( false) ;
      }
   }

   public void wb_table18_81_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_81_1M2e( true) ;
      }
      else
      {
         wb_table18_81_1M2e( false) ;
      }
   }

   public void wb_table17_75_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_75_1M2e( true) ;
      }
      else
      {
         wb_table17_75_1M2e( false) ;
      }
   }

   public void wb_table16_69_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_69_1M2e( true) ;
      }
      else
      {
         wb_table16_69_1M2e( false) ;
      }
   }

   public void wb_table15_63_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_63_1M2e( true) ;
      }
      else
      {
         wb_table15_63_1M2e( false) ;
      }
   }

   public void wb_table14_57_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "ëOÇ÷", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_57_1M2e( true) ;
      }
      else
      {
         wb_table14_57_1M2e( false) ;
      }
   }

   public void wb_table13_51_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "ç≈èâÇ÷", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_51_1M2e( true) ;
      }
      else
      {
         wb_table13_51_1M2e( false) ;
      }
   }

   public void wb_table9_27_1M2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "ä≥é“ID", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:260px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_subject_id_Internalname, GXutil.rtrim( AV11D_SUBJECT_ID), GXutil.rtrim( localUtil.format( AV11D_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_subject_id_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavD_subject_id_Backcolor)+";", "", "", 1, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "ä≥é“èäëÆé{ê›", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_145_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_site_id, cmbavD_site_id.getInternalname(), GXutil.rtrim( AV10D_SITE_ID), 1, cmbavD_site_id.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 20, "chr", 0, "", "background:"+WebUtils.getHTMLColor( cmbavD_site_id.getIBackground())+";", "Attribute_s", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(37);\"", "", true, "HLP_B713_WP01_SUBJECT_SINK.htm");
         cmbavD_site_id.setValue( GXutil.rtrim( AV10D_SITE_ID) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_site_id.getInternalname(), "Values", cmbavD_site_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_27_1M2e( true) ;
      }
      else
      {
         wb_table9_27_1M2e( false) ;
      }
   }

   public void wb_table5_11_1M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "ä≥é“êVãKçÏê¨", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockPTitle", 0, "", 1, 1, (short)(0), "HLP_B713_WP01_SUBJECT_SINK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_11_1M2e( true) ;
      }
      else
      {
         wb_table5_11_1M2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV16P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_STUDY_ID", GXutil.ltrim( GXutil.str( AV16P_STUDY_ID, 10, 0)));
      AV27W_RTN_CD = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_RTN_CD", GXutil.str( AV27W_RTN_CD, 1, 0));
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
      pa1M2( ) ;
      ws1M2( ) ;
      we1M2( ) ;
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
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317194262");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b713_wp01_subject_sink.js", "?20177317194264");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1452( )
   {
      chkavCtlsel_flg.setInternalname( "CTLSEL_FLG_"+sGXsfl_145_idx );
      edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_145_idx ;
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_145_idx ;
   }

   public void subsflControlProps_fel_1452( )
   {
      chkavCtlsel_flg.setInternalname( "CTLSEL_FLG_"+sGXsfl_145_fel_idx );
      edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM_"+sGXsfl_145_fel_idx ;
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_145_fel_idx ;
   }

   public void sendrow_1452( )
   {
      subsflControlProps_1452( ) ;
      wb1M0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_145_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_145_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_145_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_145_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_145_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_145_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
         /* Check box */
         TempTags = " " + ((chkavCtlsel_flg.getEnabled()!=0)&&(chkavCtlsel_flg.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 148,'',false,'"+sGXsfl_145_idx+"',145)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlsel_flg.getInternalname(),GXutil.booltostr( ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavCtlsel_flg.getEnabled()!=0)&&(chkavCtlsel_flg.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(148, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlsel_flg.getEnabled()!=0)&&(chkavCtlsel_flg.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(148);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:560px\""});
         /* Single line edit */
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_snm_Internalname,GXutil.rtrim( ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm31_crf_snm_Jsonclick,new Integer(0),"Attribute_s","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm31_crf_snm_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Single line edit */
         ROClassString = "Attribute_s" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id(), (byte)(4), (byte)(0), ".", "")),((edtavCtltbm31_crf_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem)AV20W_B713_SD01_SUBJECT_SINK_LIST.elementAt(-1+AV30GXV1)).getgxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id()), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm31_crf_id_Jsonclick,new Integer(0),"Attribute_s","color:#FF0000;",ROClassString,"",new Integer(edtavCtltbm31_crf_id_Visible),new Integer(edtavCtltbm31_crf_id_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(145),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
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
               if ( ((int)((nGXsfl_145_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_145_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_145_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_145_idx+1)) ;
         sGXsfl_145_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_145_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1452( ) ;
      }
      /* End function sendrow_1452 */
   }

   public void init_default_properties( )
   {
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      tblTable9_Internalname = "TABLE9" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavD_subject_id_Internalname = "vD_SUBJECT_ID" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      cmbavD_site_id.setInternalname( "vD_SITE_ID" );
      tblTable6_Internalname = "TABLE6" ;
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
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      lblBtn_reg_Internalname = "BTN_REG" ;
      lblBtn_cancel_Internalname = "BTN_CANCEL" ;
      tblTable5_Internalname = "TABLE5" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_btn_reg_exec_Internalname = "TXT_BTN_REG_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_subject_id_Internalname = "vH_SUBJECT_ID" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
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
      edtavCtltbm31_crf_id_Jsonclick = "" ;
      edtavCtltbm31_crf_snm_Jsonclick = "" ;
      chkavCtlsel_flg.setVisible( 1 );
      chkavCtlsel_flg.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      cmbavD_site_id.setJsonclick( "" );
      cmbavD_site_id.setBackstyle( (byte)(-1) );
      edtavD_subject_id_Jsonclick = "" ;
      edtavD_subject_id_Backstyle = (byte)(-1) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltbm31_crf_id_Visible = 1 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltbm31_crf_snm_Enabled = 0 ;
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
      edtavH_subject_id_Jsonclick = "" ;
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
      cmbavD_site_id.setIBackground( (int)(0xFFFFFF) );
      edtavD_subject_id_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
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
                  /* Execute user subroutine: S202 */
                  S202 ();
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
      AV20W_B713_SD01_SUBJECT_SINK_LIST = new GxObjectCollection(SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem.class, "B713_SD01_SUBJECT_SINK_LIST.B713_SD01_SUBJECT_SINK_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV12H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV61Pgmname = "" ;
      A397TBM31_DEL_FLG = "" ;
      A393TBM31_CRF_NM = "" ;
      A18TBM22_SITE_ID = "" ;
      A377TBM22_DEL_FLG = "" ;
      A319TAM08_SITE_NM = "" ;
      AV19W_A821_JS = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      edtavCtltbm31_crf_snm_Internalname = "" ;
      edtavCtltbm31_crf_id_Internalname = "" ;
      GXDecQS = "" ;
      AV10D_SITE_ID = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV60Pgmdesc = "" ;
      AV11D_SUBJECT_ID = "" ;
      AV13H_INIT_FLG = "" ;
      AV14H_KNGN_FLG = "" ;
      AV7C_APP_ID = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV24W_MSG = "" ;
      AV6BC_SUBJECT = new SdtTBT01_SUBJECT(remoteHandle);
      AV21W_B713_SD01_SUBJECT_SINK_LIST_Item = new SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem(remoteHandle, context);
      AV5BC_CRF = new SdtTBT02_CRF(remoteHandle);
      scmdbuf = "" ;
      H001M2_A377TBM22_DEL_FLG = new String[] {""} ;
      H001M2_n377TBM22_DEL_FLG = new boolean[] {false} ;
      H001M2_A17TBM22_STUDY_ID = new long[1] ;
      H001M2_A319TAM08_SITE_NM = new String[] {""} ;
      H001M2_n319TAM08_SITE_NM = new boolean[] {false} ;
      H001M2_A18TBM22_SITE_ID = new String[] {""} ;
      H001M3_A68TBM31_STUDY_ID = new long[1] ;
      H001M3_A397TBM31_DEL_FLG = new String[] {""} ;
      H001M3_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H001M3_A69TBM31_CRF_ID = new short[1] ;
      H001M3_A393TBM31_CRF_NM = new String[] {""} ;
      H001M3_n393TBM31_CRF_NM = new boolean[] {false} ;
      H001M3_A643TBM31_STATUS = new String[] {""} ;
      H001M3_n643TBM31_STATUS = new boolean[] {false} ;
      H001M3_A943TBM31_REPEAT_FLG = new byte[1] ;
      H001M3_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      H001M3_A528TBM31_DEF_VISIT_NO = new int[1] ;
      H001M3_n528TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      H001M3_A395TBM31_ORDER = new int[1] ;
      H001M3_n395TBM31_ORDER = new boolean[] {false} ;
      A643TBM31_STATUS = "" ;
      H001M4_A945TBM44_STUDY_ID = new long[1] ;
      H001M4_A946TBM44_CRF_ID = new short[1] ;
      H001M4_A947TBM44_CRF_EDA_NO = new byte[1] ;
      H001M4_A948TBM44_VISIT_NO = new int[1] ;
      H001M4_n948TBM44_VISIT_NO = new boolean[] {false} ;
      A607TBM21_STATUS = "" ;
      H001M5_A88TBT01_SUBJECT_ID = new int[1] ;
      H001M5_A87TBT01_STUDY_ID = new long[1] ;
      H001M6_A369TBM21_DEL_FLG = new String[] {""} ;
      H001M6_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H001M6_A63TBM21_STUDY_ID = new long[1] ;
      H001M6_A607TBM21_STATUS = new String[] {""} ;
      H001M6_n607TBM21_STATUS = new boolean[] {false} ;
      A369TBM21_DEL_FLG = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV22W_ERRCD = "" ;
      AV18W_A819_JS = "" ;
      GXv_SdtA_PAGING_SDT4 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_reg_exec_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
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
      lblBtn_reg_Jsonclick = "" ;
      lblBtn_cancel_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock3_Jsonclick = "" ;
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
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b713_wp01_subject_sink__default(),
         new Object[] {
             new Object[] {
            H001M2_A377TBM22_DEL_FLG, H001M2_n377TBM22_DEL_FLG, H001M2_A17TBM22_STUDY_ID, H001M2_A319TAM08_SITE_NM, H001M2_n319TAM08_SITE_NM, H001M2_A18TBM22_SITE_ID
            }
            , new Object[] {
            H001M3_A68TBM31_STUDY_ID, H001M3_A397TBM31_DEL_FLG, H001M3_n397TBM31_DEL_FLG, H001M3_A69TBM31_CRF_ID, H001M3_A393TBM31_CRF_NM, H001M3_n393TBM31_CRF_NM, H001M3_A643TBM31_STATUS, H001M3_n643TBM31_STATUS, H001M3_A943TBM31_REPEAT_FLG, H001M3_n943TBM31_REPEAT_FLG,
            H001M3_A528TBM31_DEF_VISIT_NO, H001M3_n528TBM31_DEF_VISIT_NO, H001M3_A395TBM31_ORDER, H001M3_n395TBM31_ORDER
            }
            , new Object[] {
            H001M4_A945TBM44_STUDY_ID, H001M4_A946TBM44_CRF_ID, H001M4_A947TBM44_CRF_EDA_NO, H001M4_A948TBM44_VISIT_NO, H001M4_n948TBM44_VISIT_NO
            }
            , new Object[] {
            H001M5_A88TBT01_SUBJECT_ID, H001M5_A87TBT01_STUDY_ID
            }
            , new Object[] {
            H001M6_A369TBM21_DEL_FLG, H001M6_n369TBM21_DEL_FLG, H001M6_A63TBM21_STUDY_ID, H001M6_A607TBM21_STATUS, H001M6_n607TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV61Pgmname = "B713_WP01_SUBJECT_SINK" ;
      AV60Pgmdesc = "ä≥é“êVãKìoò^âÊñ " ;
      /* GeneXus formulas. */
      AV61Pgmname = "B713_WP01_SUBJECT_SINK" ;
      AV60Pgmdesc = "ä≥é“êVãKìoò^âÊñ " ;
      Gx_err = (short)(0) ;
      edtavCtltbm31_crf_snm_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV27W_RTN_CD ;
   private byte GRID1_nEOF ;
   private byte A943TBM31_REPEAT_FLG ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV68GXLvl390 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavD_subject_id_Backstyle ;
   private short nRC_GXsfl_145 ;
   private short nGXsfl_145_idx=1 ;
   private short A69TBM31_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV30GXV1 ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_145_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_145_fel_idx=1 ;
   private int A395TBM31_ORDER ;
   private int A528TBM31_DEF_VISIT_NO ;
   private int A948TBM44_VISIT_NO ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int edtavCtltbm31_crf_snm_Enabled ;
   private int edtavCtltbm31_crf_id_Enabled ;
   private int AV15H_SUBJECT_ID ;
   private int tblTbl_hidden_Visible ;
   private int edtavCtltbm31_crf_id_Visible ;
   private int AV62GXV32 ;
   private int edtavD_subject_id_Backcolor ;
   private int A88TBT01_SUBJECT_ID ;
   private int AV67GXV33 ;
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
   private long wcpOAV16P_STUDY_ID ;
   private long AV16P_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long A68TBM31_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A17TBM22_STUDY_ID ;
   private long GRID1_nRecordCount ;
   private long GRID1_nCurrentRecord ;
   private long A87TBT01_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_145_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV61Pgmname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCtltbm31_crf_snm_Internalname ;
   private String edtavCtltbm31_crf_id_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV60Pgmdesc ;
   private String edtavD_subject_id_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_subject_id_Internalname ;
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
   private String sGXsfl_145_fel_idx="0001" ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_btn_reg_exec_Internalname ;
   private String lblTxt_btn_reg_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_subject_id_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
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
   private String tblTable5_Internalname ;
   private String lblBtn_reg_Internalname ;
   private String lblBtn_reg_Jsonclick ;
   private String lblBtn_cancel_Internalname ;
   private String lblBtn_cancel_Jsonclick ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
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
   private String tblTable6_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavD_subject_id_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavCtltbm31_crf_snm_Jsonclick ;
   private String edtavCtltbm31_crf_id_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV23W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n377TBM22_DEL_FLG ;
   private boolean n319TAM08_SITE_NM ;
   private boolean gx_BV145 ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n643TBM31_STATUS ;
   private boolean n943TBM31_REPEAT_FLG ;
   private boolean n528TBM31_DEF_VISIT_NO ;
   private boolean n395TBM31_ORDER ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean AV25W_SEL_FLG ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private String A397TBM31_DEL_FLG ;
   private String A393TBM31_CRF_NM ;
   private String A18TBM22_SITE_ID ;
   private String A377TBM22_DEL_FLG ;
   private String A319TAM08_SITE_NM ;
   private String AV19W_A821_JS ;
   private String AV10D_SITE_ID ;
   private String AV11D_SUBJECT_ID ;
   private String AV13H_INIT_FLG ;
   private String AV14H_KNGN_FLG ;
   private String AV7C_APP_ID ;
   private String AV8C_GAMEN_TITLE ;
   private String AV24W_MSG ;
   private String A643TBM31_STATUS ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private String AV22W_ERRCD ;
   private String AV18W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBT02_CRF AV5BC_CRF ;
   private SdtTBT01_SUBJECT AV6BC_SUBJECT ;
   private HTMLChoice cmbavD_site_id ;
   private ICheckbox chkavCtlsel_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H001M2_A377TBM22_DEL_FLG ;
   private boolean[] H001M2_n377TBM22_DEL_FLG ;
   private long[] H001M2_A17TBM22_STUDY_ID ;
   private String[] H001M2_A319TAM08_SITE_NM ;
   private boolean[] H001M2_n319TAM08_SITE_NM ;
   private String[] H001M2_A18TBM22_SITE_ID ;
   private long[] H001M3_A68TBM31_STUDY_ID ;
   private String[] H001M3_A397TBM31_DEL_FLG ;
   private boolean[] H001M3_n397TBM31_DEL_FLG ;
   private short[] H001M3_A69TBM31_CRF_ID ;
   private String[] H001M3_A393TBM31_CRF_NM ;
   private boolean[] H001M3_n393TBM31_CRF_NM ;
   private String[] H001M3_A643TBM31_STATUS ;
   private boolean[] H001M3_n643TBM31_STATUS ;
   private byte[] H001M3_A943TBM31_REPEAT_FLG ;
   private boolean[] H001M3_n943TBM31_REPEAT_FLG ;
   private int[] H001M3_A528TBM31_DEF_VISIT_NO ;
   private boolean[] H001M3_n528TBM31_DEF_VISIT_NO ;
   private int[] H001M3_A395TBM31_ORDER ;
   private boolean[] H001M3_n395TBM31_ORDER ;
   private long[] H001M4_A945TBM44_STUDY_ID ;
   private short[] H001M4_A946TBM44_CRF_ID ;
   private byte[] H001M4_A947TBM44_CRF_EDA_NO ;
   private int[] H001M4_A948TBM44_VISIT_NO ;
   private boolean[] H001M4_n948TBM44_VISIT_NO ;
   private int[] H001M5_A88TBT01_SUBJECT_ID ;
   private long[] H001M5_A87TBT01_STUDY_ID ;
   private String[] H001M6_A369TBM21_DEL_FLG ;
   private boolean[] H001M6_n369TBM21_DEL_FLG ;
   private long[] H001M6_A63TBM21_STUDY_ID ;
   private String[] H001M6_A607TBM21_STATUS ;
   private boolean[] H001M6_n607TBM21_STATUS ;
   private GxObjectCollection AV20W_B713_SD01_SUBJECT_SINK_LIST ;
   private SdtA_PAGING_SDT AV12H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT4[] ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem AV21W_B713_SD01_SUBJECT_SINK_LIST_Item ;
}

final  class b713_wp01_subject_sink__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001M2", "SELECT T1.`TBM22_DEL_FLG`, T1.`TBM22_STUDY_ID`, T2.`TAM08_SITE_NM`, T1.`TBM22_SITE_ID` AS TBM22_SITE_ID FROM (`TBM22_STUDY_SITE` T1 INNER JOIN `TAM08_SITE` T2 ON T2.`TAM08_SITE_ID` = T1.`TBM22_SITE_ID`) WHERE (T1.`TBM22_STUDY_ID` = ?) AND (T1.`TBM22_DEL_FLG` = '0') ORDER BY T1.`TBM22_STUDY_ID`, T1.`TBM22_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001M3", "SELECT `TBM31_STUDY_ID`, `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_CRF_NM`, `TBM31_STATUS`, `TBM31_REPEAT_FLG`, `TBM31_DEF_VISIT_NO`, `TBM31_ORDER` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_STATUS` IN ('0','1')) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001M4", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = 1 ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001M5", "SELECT `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ? ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001M6", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 4 :
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
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

