/*
               File: b406_wp01_design_export_impl
        Description: 試験情報エクスポート
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:23.98
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b406_wp01_design_export_impl extends GXWebPanel
{
   public b406_wp01_design_export_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b406_wp01_design_export_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b406_wp01_design_export_impl.class ));
   }

   public b406_wp01_design_export_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_study_id = new HTMLChoice();
      chkavD_base_flg = UIFactory.getCheckbox(this);
      chkavD_site_flg = UIFactory.getCheckbox(this);
      chkavD_staff_flg = UIFactory.getCheckbox(this);
      chkavD_list_chk = UIFactory.getCheckbox(this);
      chkavD_subject_chk = UIFactory.getCheckbox(this);
      chkavD_grd_all_chk = UIFactory.getCheckbox(this);
      chkavCtlcheck = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_164 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_164_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_164_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_164, nGXsfl_164_idx, sGXsfl_164_idx) ;
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
            AV18P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18P_MOVE_KBN", GXutil.str( AV18P_MOVE_KBN, 1, 0));
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
         pa2J2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws2J2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we2J2( ) ;
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
      httpContext.writeValue( "試験情報エクスポート") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151331247");
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
      GXEncryptionTmp = "b406_wp01_design_export"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b406_wp01_design_export") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm2J2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "B406_sd01_export_list_c", AV5B406_SD01_EXPORT_LIST_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("B406_sd01_export_list_c", AV5B406_SD01_EXPORT_LIST_C);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV14H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV14H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_164", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_164, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV39Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV7C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_APP_ID", GetHash( "", String.valueOf(AV7C_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV18P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_DEL_FLG", GXutil.rtrim( A369TBM21_DEL_FLG));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_A_LOGIN_SDT", AV19W_A_LOGIN_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_A_LOGIN_SDT", AV19W_A_LOGIN_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "vH_SRCH_FLG", GXutil.rtrim( AV17H_SRCH_FLG));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV22W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV20W_A821_JS));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_ORDER", GXutil.ltrim( localUtil.ntoc( A395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_NM", GXutil.rtrim( A393TBM31_CRF_NM));
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
      return "B406_WP01_DESIGN_EXPORT" ;
   }

   public String getPgmdesc( )
   {
      return "試験情報エクスポート" ;
   }

   public void wb2J0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_2J2( true) ;
      }
      else
      {
         wb_table1_2_2J2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_183_2J2( true) ;
      }
      else
      {
         wb_table2_183_2J2( false) ;
      }
      return  ;
   }

   public void wb_table2_183_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start2J2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験情報エクスポート", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0181") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0181", "");
         }
      }
      wbErr = false ;
      strup2J0( ) ;
   }

   public void ws2J2( )
   {
      start2J2( ) ;
      evt2J2( ) ;
   }

   public void evt2J2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_EXPORT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e112J2 */
                        e112J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_EXPORT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e122J2 */
                        e122J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_STUDY_ID.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e132J2 */
                        e132J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e142J2 */
                        e142J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e152J2 */
                        e152J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e162J2 */
                        e162J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e172J2 */
                        e172J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e182J2 */
                        e182J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e192J2 */
                        e192J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e202J2 */
                        e202J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e212J2 */
                        e212J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e222J2 */
                        e222J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e232J2 */
                        e232J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e242J2 */
                        e242J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e252J2 */
                        e252J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e262J2 */
                        e262J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e272J2 */
                        e272J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD_ALL_CHK.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e282J2 */
                        e282J2 ();
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
                        nGXsfl_164_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1642( ) ;
                        AV33GXV1 = (short)(nGXsfl_164_idx+GRID1_nFirstRecordOnPage) ;
                        if ( ( AV5B406_SD01_EXPORT_LIST_C.size() >= AV33GXV1 ) && ( AV33GXV1 > 0 ) )
                        {
                           AV5B406_SD01_EXPORT_LIST_C.currentItem( ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)) );
                           ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check( GXutil.strtobool( httpContext.cgiGet( chkavCtlcheck.getInternalname())) );
                           ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
                           ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm( httpContext.cgiGet( edtavCtltbm31_crf_nm_Internalname) );
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0181") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0181", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0181") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0181", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e292J2 */
                              e292J2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e302J2 */
                              e302J2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e312J2 */
                              e312J2 ();
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
                  else if ( nCmpId == 181 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0181") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0181", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we2J2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2J2( ) ;
         }
      }
   }

   public void pa2J2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b406_wp01_design_export")), "b406_wp01_design_export") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b406_wp01_design_export"))) ;
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
                  AV18P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18P_MOVE_KBN", GXutil.str( AV18P_MOVE_KBN, 1, 0));
               }
            }
         }
         cmbavD_study_id.setName( "vD_STUDY_ID" );
         cmbavD_study_id.setWebtags( "" );
         if ( cmbavD_study_id.getItemCount() > 0 )
         {
            AV12D_STUDY_ID = GXutil.lval( cmbavD_study_id.getValidValue(GXutil.trim( GXutil.str( AV12D_STUDY_ID, 10, 0)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12D_STUDY_ID", GXutil.ltrim( GXutil.str( AV12D_STUDY_ID, 10, 0)));
         }
         chkavD_base_flg.setName( "vD_BASE_FLG" );
         chkavD_base_flg.setWebtags( "" );
         chkavD_base_flg.setCaption( "基本情報を含む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_base_flg.getInternalname(), "Caption", chkavD_base_flg.getCaption());
         chkavD_base_flg.setCheckedValue( "false" );
         chkavD_site_flg.setName( "vD_SITE_FLG" );
         chkavD_site_flg.setWebtags( "" );
         chkavD_site_flg.setCaption( "施設情報を含む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_site_flg.getInternalname(), "Caption", chkavD_site_flg.getCaption());
         chkavD_site_flg.setCheckedValue( "false" );
         chkavD_staff_flg.setName( "vD_STAFF_FLG" );
         chkavD_staff_flg.setWebtags( "" );
         chkavD_staff_flg.setCaption( "参加スタッフ情報を含む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_staff_flg.getInternalname(), "Caption", chkavD_staff_flg.getCaption());
         chkavD_staff_flg.setCheckedValue( "false" );
         chkavD_list_chk.setName( "vD_LIST_CHK" );
         chkavD_list_chk.setWebtags( "" );
         chkavD_list_chk.setCaption( "選択肢リストを含む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_list_chk.getInternalname(), "Caption", chkavD_list_chk.getCaption());
         chkavD_list_chk.setCheckedValue( "false" );
         chkavD_subject_chk.setName( "vD_SUBJECT_CHK" );
         chkavD_subject_chk.setWebtags( "" );
         chkavD_subject_chk.setCaption( "患者データを含む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_subject_chk.getInternalname(), "Caption", chkavD_subject_chk.getCaption());
         chkavD_subject_chk.setCheckedValue( "false" );
         chkavD_grd_all_chk.setName( "vD_GRD_ALL_CHK" );
         chkavD_grd_all_chk.setWebtags( "" );
         chkavD_grd_all_chk.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd_all_chk.getInternalname(), "Caption", chkavD_grd_all_chk.getCaption());
         chkavD_grd_all_chk.setCheckedValue( "false" );
         GXCCtl = "CTLCHECK_" + sGXsfl_164_idx ;
         chkavCtlcheck.setName( GXCCtl );
         chkavCtlcheck.setWebtags( "" );
         chkavCtlcheck.setCaption( "" );
         chkavCtlcheck.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_164 ,
                                 short nGXsfl_164_idx ,
                                 String sGXsfl_164_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1642( ) ;
      while ( nGXsfl_164_idx <= nRC_GXsfl_164 )
      {
         sendrow_1642( ) ;
         nGXsfl_164_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_164_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_164_idx+1)) ;
         sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1642( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf2J2( ) ;
      /* End function Refresh */
   }

   public void rf2J2( )
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
      wbStart = (short)(164) ;
      nGXsfl_164_idx = (short)(1) ;
      sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1642( ) ;
      nGXsfl_164_Refreshing = (short)(1) ;
      /* Execute user event: e302J2 */
      e302J2 ();
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
         subsflControlProps_1642( ) ;
         /* Execute user event: e312J2 */
         e312J2 ();
         wbEnd = (short)(164) ;
         wb2J0( ) ;
      }
      nGXsfl_164_Refreshing = (short)(0) ;
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
      return AV5B406_SD01_EXPORT_LIST_C.size() ;
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

   public void strup2J0( )
   {
      /* Before Start, stand alone formulas. */
      AV39Pgmname = "B406_WP01_DESIGN_EXPORT" ;
      AV38Pgmdesc = "試験情報エクスポート" ;
      Gx_err = (short)(0) ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltbm31_crf_nm_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e292J2 */
      e292J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "B406_sd01_export_list_c"), AV5B406_SD01_EXPORT_LIST_C);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV14H_A_PAGING_SDT);
         /* Read variables values. */
         cmbavD_study_id.setName( cmbavD_study_id.getInternalname() );
         cmbavD_study_id.setValue( httpContext.cgiGet( cmbavD_study_id.getInternalname()) );
         AV12D_STUDY_ID = GXutil.lval( httpContext.cgiGet( cmbavD_study_id.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_STUDY_ID", GXutil.ltrim( GXutil.str( AV12D_STUDY_ID, 10, 0)));
         AV30D_BASE_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_base_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30D_BASE_FLG", AV30D_BASE_FLG);
         AV28D_SITE_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_site_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28D_SITE_FLG", AV28D_SITE_FLG);
         AV29D_STAFF_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_staff_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29D_STAFF_FLG", AV29D_STAFF_FLG);
         AV11D_LIST_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_list_chk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_LIST_CHK", AV11D_LIST_CHK);
         AV13D_SUBJECT_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_subject_chk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13D_SUBJECT_CHK", AV13D_SUBJECT_CHK);
         AV9D_GRD_ALL_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_all_chk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_GRD_ALL_CHK", AV9D_GRD_ALL_CHK);
         AV15H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_INIT_FLG", AV15H_INIT_FLG);
         AV16H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_KNGN_FLG", AV16H_KNGN_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         /* Read saved values. */
         nRC_GXsfl_164 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_164"), ".", ",")) ;
         AV18P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0181") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0181", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_GXsfl_164 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_164"), ".", ",")) ;
         nGXsfl_164_fel_idx = (short)(0) ;
         while ( nGXsfl_164_fel_idx < nRC_GXsfl_164 )
         {
            nGXsfl_164_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_164_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_164_fel_idx+1)) ;
            sGXsfl_164_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1642( ) ;
            AV33GXV1 = (short)(nGXsfl_164_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV33GXV1 = (short)(nGXsfl_164_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV5B406_SD01_EXPORT_LIST_C.size() >= AV33GXV1 ) && ( AV33GXV1 > 0 ) )
            {
               AV5B406_SD01_EXPORT_LIST_C.currentItem( ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)) );
               ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check( GXutil.strtobool( httpContext.cgiGet( chkavCtlcheck.getInternalname())) );
               ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
               ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm( httpContext.cgiGet( edtavCtltbm31_crf_nm_Internalname) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0181") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0181", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0181") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0181", "");
            }
            AV5B406_SD01_EXPORT_LIST_C.currentItem( ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)) );
         }
         if ( nGXsfl_164_fel_idx == 0 )
         {
            nGXsfl_164_idx = (short)(1) ;
            sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1642( ) ;
         }
         nGXsfl_164_fel_idx = (short)(1) ;
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
      /* Execute user event: e292J2 */
      e292J2 ();
      if (returnInSub) return;
   }

   public void e292J2( )
   {
      /* Start Routine */
      AV7C_APP_ID = "B406" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_APP_ID", AV7C_APP_ID);
      AV8C_GAMEN_TITLE = AV38Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_GAMEN_TITLE", AV8C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV15H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_INIT_FLG", AV15H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV19W_A_LOGIN_SDT,AV7C_APP_ID,AV8C_GAMEN_TITLE,""});
         WebComp_Webcomp1.componentbind(new Object[] {"","","",""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0181",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e302J2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV15H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV39Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV15H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_INIT_FLG", AV15H_INIT_FLG);
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

   public void e112J2( )
   {
      /* 'BTN_EXPORT' Routine */
      if ( (0==AV12D_STUDY_ID) )
      {
         GXt_char1 = AV24W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00007", "エクスポートする試験", "", "", "", "", GXv_char2) ;
         b406_wp01_design_export_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         httpContext.GX_msglist.addItem(AV24W_MSG);
      }
      else
      {
         GXt_char1 = AV24W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AG00035", "エクスポート", "", "", "", "", GXv_char2) ;
         b406_wp01_design_export_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         GXt_char1 = AV20W_A821_JS ;
         GXv_char2[0] = GXt_char1 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV24W_MSG, "", "BTN_EXPORT_EXEC", "", GXv_char2) ;
         b406_wp01_design_export_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         AV20W_A821_JS = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20W_A821_JS", AV20W_A821_JS);
      }
   }

   public void e122J2( )
   {
      /* 'BTN_EXPORT_EXEC' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV24W_MSG)==0) )
      {
         GXv_char2[0] = AV21W_ERRCD ;
         GXv_char3[0] = AV24W_MSG ;
         new b406_pc01_design_export_csv(remoteHandle, context).execute( AV12D_STUDY_ID, AV5B406_SD01_EXPORT_LIST_C, AV30D_BASE_FLG, AV28D_SITE_FLG, AV29D_STAFF_FLG, AV11D_LIST_CHK, AV13D_SUBJECT_CHK, GXv_char2, GXv_char3) ;
         b406_wp01_design_export_impl.this.AV21W_ERRCD = GXv_char2[0] ;
         b406_wp01_design_export_impl.this.AV24W_MSG = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_STUDY_ID", GXutil.ltrim( GXutil.str( AV12D_STUDY_ID, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV30D_BASE_FLG", AV30D_BASE_FLG);
         httpContext.ajax_rsp_assign_attri("", false, "AV28D_SITE_FLG", AV28D_SITE_FLG);
         httpContext.ajax_rsp_assign_attri("", false, "AV29D_STAFF_FLG", AV29D_STAFF_FLG);
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_LIST_CHK", AV11D_LIST_CHK);
         httpContext.ajax_rsp_assign_attri("", false, "AV13D_SUBJECT_CHK", AV13D_SUBJECT_CHK);
         httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERRCD", AV21W_ERRCD);
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
         {
            httpContext.GX_msglist.addItem(AV24W_MSG);
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV24W_MSG);
      }
   }

   public void S182( )
   {
      /* 'SUB_CSV_CHECK' Routine */
      AV24W_MSG = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
      if ( AV5B406_SD01_EXPORT_LIST_C.size() <= 0 )
      {
         GXt_char1 = AV24W_MSG ;
         GXv_char3[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char3) ;
         b406_wp01_design_export_impl.this.GXt_char1 = GXv_char3[0] ;
         AV24W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
      }
   }

   public void e132J2( )
   {
      /* D_study_id_Click Routine */
      if ( (0==AV12D_STUDY_ID) )
      {
         /* Execute user subroutine: S122 */
         S122 ();
         if (returnInSub) return;
      }
      else
      {
         AV17H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_SRCH_FLG", AV17H_SRCH_FLG);
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
         AV30D_BASE_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30D_BASE_FLG", AV30D_BASE_FLG);
         AV28D_SITE_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28D_SITE_FLG", AV28D_SITE_FLG);
         AV29D_STAFF_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29D_STAFF_FLG", AV29D_STAFF_FLG);
         AV11D_LIST_CHK = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_LIST_CHK", AV11D_LIST_CHK);
         AV13D_SUBJECT_CHK = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13D_SUBJECT_CHK", AV13D_SUBJECT_CHK);
         AV9D_GRD_ALL_CHK = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_GRD_ALL_CHK", AV9D_GRD_ALL_CHK);
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
      }
   }

   public void S192( )
   {
      /* 'SUB_SRCH' Routine */
      AV5B406_SD01_EXPORT_LIST_C.clear();
      gx_BV164 = true ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           new Long(AV12D_STUDY_ID) ,
                                           new Long(A68TBM31_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      /* Using cursor H002J2 */
      pr_default.execute(0, new Object[] {new Long(AV12D_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A68TBM31_STUDY_ID = H002J2_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H002J2_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H002J2_n367TBM21_STUDY_NM[0] ;
         A69TBM31_CRF_ID = H002J2_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A393TBM31_CRF_NM = H002J2_A393TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
         n393TBM31_CRF_NM = H002J2_n393TBM31_CRF_NM[0] ;
         A395TBM31_ORDER = H002J2_A395TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
         n395TBM31_ORDER = H002J2_n395TBM31_ORDER[0] ;
         A367TBM21_STUDY_NM = H002J2_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H002J2_n367TBM21_STUDY_NM[0] ;
         AV6B406_SD01_EXPORT_LIST_I = (SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)new SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem(remoteHandle, context);
         AV6B406_SD01_EXPORT_LIST_I.setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check( AV9D_GRD_ALL_CHK );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B406_SD01_EXPORT_LIST_I", AV6B406_SD01_EXPORT_LIST_I);
         AV6B406_SD01_EXPORT_LIST_I.setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id( A68TBM31_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B406_SD01_EXPORT_LIST_I", AV6B406_SD01_EXPORT_LIST_I);
         AV6B406_SD01_EXPORT_LIST_I.setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm( A367TBM21_STUDY_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B406_SD01_EXPORT_LIST_I", AV6B406_SD01_EXPORT_LIST_I);
         AV6B406_SD01_EXPORT_LIST_I.setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id( A69TBM31_CRF_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B406_SD01_EXPORT_LIST_I", AV6B406_SD01_EXPORT_LIST_I);
         AV6B406_SD01_EXPORT_LIST_I.setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm( A393TBM31_CRF_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B406_SD01_EXPORT_LIST_I", AV6B406_SD01_EXPORT_LIST_I);
         AV5B406_SD01_EXPORT_LIST_C.add(AV6B406_SD01_EXPORT_LIST_I, 0);
         gx_BV164 = true ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void e282J2( )
   {
      /* D_grd_all_chk_Click Routine */
      AV41GXV6 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41GXV6", GXutil.ltrim( GXutil.str( AV41GXV6, 8, 0)));
      while ( AV41GXV6 <= AV5B406_SD01_EXPORT_LIST_C.size() )
      {
         AV6B406_SD01_EXPORT_LIST_I = (SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV41GXV6));
         AV6B406_SD01_EXPORT_LIST_I.setgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check( AV9D_GRD_ALL_CHK );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B406_SD01_EXPORT_LIST_I", AV6B406_SD01_EXPORT_LIST_I);
         AV41GXV6 = (int)(AV41GXV6+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41GXV6", GXutil.ltrim( GXutil.str( AV41GXV6, 8, 0)));
      }
   }

   public void e142J2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e152J2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      else
      {
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e162J2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e172J2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e182J2( )
   {
      /* 'PAGE01' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e192J2( )
   {
      /* 'PAGE02' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e202J2( )
   {
      /* 'PAGE03' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e212J2( )
   {
      /* 'PAGE04' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e222J2( )
   {
      /* 'PAGE05' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e232J2( )
   {
      /* 'PAGE06' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e242J2( )
   {
      /* 'PAGE07' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e252J2( )
   {
      /* 'PAGE08' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e262J2( )
   {
      /* 'PAGE09' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e272J2( )
   {
      /* 'PAGE10' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S162( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT4[0] = AV14H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT4) ;
      AV14H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT4[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_export_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_export_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_export_Visible, 5, 0)));
         tblTbl_list_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
         if ( ( GXutil.strcmp(AV17H_SRCH_FLG, "1") == 0 ) && ! AV22W_ERRFLG )
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char3[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char3) ;
            b406_wp01_design_export_impl.this.GXt_char1 = GXv_char3[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            httpContext.GX_msglist.addItem(AV24W_MSG);
         }
      }
      else
      {
         tblTbl_export_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_export_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_export_Visible, 5, 0)));
         tblTbl_list_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV18P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
         AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV25W_SESSION.getValue(AV39Pgmname+"_PAGE"))) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV19W_A_LOGIN_SDT;
      GXv_char3[0] = AV21W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char3) ;
      AV19W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b406_wp01_design_export_impl.this.AV21W_ERRCD = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERRCD", AV21W_ERRCD);
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
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
      AV12D_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12D_STUDY_ID", GXutil.ltrim( GXutil.str( AV12D_STUDY_ID, 10, 0)));
      AV30D_BASE_FLG = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30D_BASE_FLG", AV30D_BASE_FLG);
      AV28D_SITE_FLG = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28D_SITE_FLG", AV28D_SITE_FLG);
      AV29D_STAFF_FLG = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29D_STAFF_FLG", AV29D_STAFF_FLG);
      AV11D_LIST_CHK = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_LIST_CHK", AV11D_LIST_CHK);
      AV13D_SUBJECT_CHK = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13D_SUBJECT_CHK", AV13D_SUBJECT_CHK);
      AV14H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14H_A_PAGING_SDT", AV14H_A_PAGING_SDT);
      AV17H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_SRCH_FLG", AV17H_SRCH_FLG);
      AV5B406_SD01_EXPORT_LIST_C.clear();
      gx_BV164 = true ;
      AV9D_GRD_ALL_CHK = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_GRD_ALL_CHK", AV9D_GRD_ALL_CHK);
      AV20W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_A821_JS", AV20W_A821_JS);
   }

   public void S152( )
   {
      /* 'SUB_EDIT_COMBO' Routine */
      cmbavD_study_id.removeAllItems();
      cmbavD_study_id.addItem("0", " ", (short)(0));
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A607TBM21_STATUS ,
                                           new Long(A63TBM21_STUDY_ID) ,
                                           AV19W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn() ,
                                           AV19W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg() ,
                                           AV19W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_User_study_sdt().getgxTv_SdtA_USER_STUDY_SDT_Study_id() ,
                                           A369TBM21_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H002J3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A63TBM21_STUDY_ID = H002J3_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A369TBM21_DEL_FLG = H002J3_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H002J3_n369TBM21_DEL_FLG[0] ;
         A607TBM21_STATUS = H002J3_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = H002J3_n607TBM21_STATUS[0] ;
         A367TBM21_STUDY_NM = H002J3_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H002J3_n367TBM21_STUDY_NM[0] ;
         cmbavD_study_id.addItem(GXutil.trim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)), GXutil.str( A63TBM21_STUDY_ID, 10, 0)+" "+A367TBM21_STUDY_NM, (short)(0));
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S172( )
   {
      /* 'SUB_JS' Routine */
      lblTxt_js_event_Caption = "<script language=javascript>" ;
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV20W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV20W_A821_JS ;
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
      GXv_char3[0] = AV16H_KNGN_FLG ;
      GXv_char2[0] = AV21W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV7C_APP_ID, GXv_char3, GXv_char2) ;
      b406_wp01_design_export_impl.this.AV16H_KNGN_FLG = GXv_char3[0] ;
      b406_wp01_design_export_impl.this.AV21W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_APP_ID", AV7C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_KNGN_FLG", AV16H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERRCD", AV21W_ERRCD);
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S202( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV39Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b406_wp01_design_export");
   }

   private void e312J2( )
   {
      /* Grid1_Load Routine */
      AV33GXV1 = (short)(1) ;
      while ( AV33GXV1 <= AV5B406_SD01_EXPORT_LIST_C.size() )
      {
         AV5B406_SD01_EXPORT_LIST_C.currentItem( ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5B406_SD01_EXPORT_LIST_C", AV5B406_SD01_EXPORT_LIST_C);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(164) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1642( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         AV33GXV1 = (short)(AV33GXV1+1) ;
      }
   }

   public void wb_table2_183_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_export_exec_Internalname, "BTN_EXPORT_EXEC", "", "", lblBtn_export_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_EXPORT_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV15H_INIT_FLG), GXutil.rtrim( localUtil.format( AV15H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(188);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV16H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV16H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_183_2J2e( true) ;
      }
      else
      {
         wb_table2_183_2J2e( false) ;
      }
   }

   public void wb_table1_2_2J2( boolean wbgen )
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
         wb_table3_6_2J2( true) ;
      }
      else
      {
         wb_table3_6_2J2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_2J2e( boolean wbgen )
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
         wb_table1_2_2J2e( true) ;
      }
      else
      {
         wb_table1_2_2J2e( false) ;
      }
   }

   public void wb_table3_6_2J2( boolean wbgen )
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
         wb_table4_12_2J2( true) ;
      }
      else
      {
         wb_table4_12_2J2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table5_19_2J2( true) ;
      }
      else
      {
         wb_table5_19_2J2( false) ;
      }
      return  ;
   }

   public void wb_table5_19_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0181"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0181"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0181"+"");
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
         wb_table3_6_2J2e( true) ;
      }
      else
      {
         wb_table3_6_2J2e( false) ;
      }
   }

   public void wb_table5_19_2J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 950, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_22_2J2( true) ;
      }
      else
      {
         wb_table6_22_2J2( false) ;
      }
      return  ;
   }

   public void wb_table6_22_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_35_2J2( true) ;
      }
      else
      {
         wb_table7_35_2J2( false) ;
      }
      return  ;
   }

   public void wb_table7_35_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_59_2J2( true) ;
      }
      else
      {
         wb_table8_59_2J2( false) ;
      }
      return  ;
   }

   public void wb_table8_59_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_19_2J2e( true) ;
      }
      else
      {
         wb_table5_19_2J2e( false) ;
      }
   }

   public void wb_table8_59_2J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_list_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_list_Internalname, tblTbl_list_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_62_2J2( true) ;
      }
      else
      {
         wb_table9_62_2J2( false) ;
      }
      return  ;
   }

   public void wb_table9_62_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_157_2J2( true) ;
      }
      else
      {
         wb_table10_157_2J2( false) ;
      }
      return  ;
   }

   public void wb_table10_157_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"164\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
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
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 164 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_164 = (short)(nGXsfl_164_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV33GXV1 = nGXsfl_164_idx ;
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
         wb_table8_59_2J2e( true) ;
      }
      else
      {
         wb_table8_59_2J2e( false) ;
      }
   }

   public void wb_table10_157_2J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 725, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:60px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd_all_chk.getInternalname(), GXutil.booltostr( AV9D_GRD_ALL_CHK), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(160, this, 'true', 'false');gx.ajax.executeCliEvent('e282j2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(160);\"");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "選択", "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, "CRF", "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_157_2J2e( true) ;
      }
      else
      {
         wb_table10_157_2J2e( false) ;
      }
   }

   public void wb_table9_62_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_68_2J2( true) ;
      }
      else
      {
         wb_table11_68_2J2( false) ;
      }
      return  ;
   }

   public void wb_table11_68_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_62_2J2e( true) ;
      }
      else
      {
         wb_table9_62_2J2e( false) ;
      }
   }

   public void wb_table11_68_2J2( boolean wbgen )
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
         wb_table12_71_2J2( true) ;
      }
      else
      {
         wb_table12_71_2J2( false) ;
      }
      return  ;
   }

   public void wb_table12_71_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_77_2J2( true) ;
      }
      else
      {
         wb_table13_77_2J2( false) ;
      }
      return  ;
   }

   public void wb_table13_77_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_83_2J2( true) ;
      }
      else
      {
         wb_table14_83_2J2( false) ;
      }
      return  ;
   }

   public void wb_table14_83_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_89_2J2( true) ;
      }
      else
      {
         wb_table15_89_2J2( false) ;
      }
      return  ;
   }

   public void wb_table15_89_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_95_2J2( true) ;
      }
      else
      {
         wb_table16_95_2J2( false) ;
      }
      return  ;
   }

   public void wb_table16_95_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_101_2J2( true) ;
      }
      else
      {
         wb_table17_101_2J2( false) ;
      }
      return  ;
   }

   public void wb_table17_101_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_107_2J2( true) ;
      }
      else
      {
         wb_table18_107_2J2( false) ;
      }
      return  ;
   }

   public void wb_table18_107_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_113_2J2( true) ;
      }
      else
      {
         wb_table19_113_2J2( false) ;
      }
      return  ;
   }

   public void wb_table19_113_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_119_2J2( true) ;
      }
      else
      {
         wb_table20_119_2J2( false) ;
      }
      return  ;
   }

   public void wb_table20_119_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_125_2J2( true) ;
      }
      else
      {
         wb_table21_125_2J2( false) ;
      }
      return  ;
   }

   public void wb_table21_125_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_131_2J2( true) ;
      }
      else
      {
         wb_table22_131_2J2( false) ;
      }
      return  ;
   }

   public void wb_table22_131_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_137_2J2( true) ;
      }
      else
      {
         wb_table23_137_2J2( false) ;
      }
      return  ;
   }

   public void wb_table23_137_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_143_2J2( true) ;
      }
      else
      {
         wb_table24_143_2J2( false) ;
      }
      return  ;
   }

   public void wb_table24_143_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_149_2J2( true) ;
      }
      else
      {
         wb_table25_149_2J2( false) ;
      }
      return  ;
   }

   public void wb_table25_149_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"12\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_68_2J2e( true) ;
      }
      else
      {
         wb_table11_68_2J2e( false) ;
      }
   }

   public void wb_table25_149_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_149_2J2e( true) ;
      }
      else
      {
         wb_table25_149_2J2e( false) ;
      }
   }

   public void wb_table24_143_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_143_2J2e( true) ;
      }
      else
      {
         wb_table24_143_2J2e( false) ;
      }
   }

   public void wb_table23_137_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_137_2J2e( true) ;
      }
      else
      {
         wb_table23_137_2J2e( false) ;
      }
   }

   public void wb_table22_131_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_131_2J2e( true) ;
      }
      else
      {
         wb_table22_131_2J2e( false) ;
      }
   }

   public void wb_table21_125_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_125_2J2e( true) ;
      }
      else
      {
         wb_table21_125_2J2e( false) ;
      }
   }

   public void wb_table20_119_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_119_2J2e( true) ;
      }
      else
      {
         wb_table20_119_2J2e( false) ;
      }
   }

   public void wb_table19_113_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_113_2J2e( true) ;
      }
      else
      {
         wb_table19_113_2J2e( false) ;
      }
   }

   public void wb_table18_107_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_107_2J2e( true) ;
      }
      else
      {
         wb_table18_107_2J2e( false) ;
      }
   }

   public void wb_table17_101_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_101_2J2e( true) ;
      }
      else
      {
         wb_table17_101_2J2e( false) ;
      }
   }

   public void wb_table16_95_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_95_2J2e( true) ;
      }
      else
      {
         wb_table16_95_2J2e( false) ;
      }
   }

   public void wb_table15_89_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_89_2J2e( true) ;
      }
      else
      {
         wb_table15_89_2J2e( false) ;
      }
   }

   public void wb_table14_83_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_83_2J2e( true) ;
      }
      else
      {
         wb_table14_83_2J2e( false) ;
      }
   }

   public void wb_table13_77_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_77_2J2e( true) ;
      }
      else
      {
         wb_table13_77_2J2e( false) ;
      }
   }

   public void wb_table12_71_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_71_2J2e( true) ;
      }
      else
      {
         wb_table12_71_2J2e( false) ;
      }
   }

   public void wb_table7_35_2J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_export_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 725, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_export_Internalname, tblTbl_export_Internalname, "", "TableForm", 0, "", "", 1, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "エクスポートする情報を選択してください", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#FFFFFF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_41_2J2( true) ;
      }
      else
      {
         wb_table26_41_2J2( false) ;
      }
      return  ;
   }

   public void wb_table26_41_2J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_35_2J2e( true) ;
      }
      else
      {
         wb_table7_35_2J2e( false) ;
      }
   }

   public void wb_table26_41_2J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         ClassString = "AttributeChk" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_base_flg.getInternalname(), GXutil.booltostr( AV30D_BASE_FLG), "", 1, 1, "true", "基本情報を含む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(44, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(44);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         ClassString = "AttributeChk" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_site_flg.getInternalname(), GXutil.booltostr( AV28D_SITE_FLG), "", 1, 1, "true", "施設情報を含む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(46, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(46);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         ClassString = "AttributeChk" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_staff_flg.getInternalname(), GXutil.booltostr( AV29D_STAFF_FLG), "", 1, 1, "true", "参加スタッフ情報を含む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(48, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(48);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         ClassString = "Table" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_list_chk.getInternalname(), GXutil.booltostr( AV11D_LIST_CHK), "", 1, 1, "true", "選択肢リストを含む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(51, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(51);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         ClassString = "Table" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_subject_chk.getInternalname(), GXutil.booltostr( AV13D_SUBJECT_CHK), "", 1, 1, "true", "患者データを含む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(53, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(53);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_41_2J2e( true) ;
      }
      else
      {
         wb_table26_41_2J2e( false) ;
      }
   }

   public void wb_table6_22_2J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 725, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "TableForm", 0, "", "", 1, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:80px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_164_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_study_id, cmbavD_study_id.getInternalname(), GXutil.trim( GXutil.str( AV12D_STUDY_ID, 10, 0)), 1, cmbavD_study_id.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVD_STUDY_ID.CLICK."+"'", "int", "", 1, 1, 0, (short)(0), 600, "px", 0, "", "", "AttributeImeOff", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(27);\"", "", true, "HLP_B406_WP01_DESIGN_EXPORT.htm");
         cmbavD_study_id.setValue( GXutil.trim( GXutil.str( AV12D_STUDY_ID, 10, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_study_id.getInternalname(), "Values", cmbavD_study_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_22_2J2e( true) ;
      }
      else
      {
         wb_table6_22_2J2e( false) ;
      }
   }

   public void wb_table4_12_2J2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_export_Internalname, "エクスポート", "", "", lblTxt_btn_export_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_EXPORT\\'."+"'", "", "TextBlockBtnList120", 5, "", 1, 1, (short)(0), "HLP_B406_WP01_DESIGN_EXPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_2J2e( true) ;
      }
      else
      {
         wb_table4_12_2J2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV18P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_MOVE_KBN", GXutil.str( AV18P_MOVE_KBN, 1, 0));
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
      pa2J2( ) ;
      ws2J2( ) ;
      we2J2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513312796");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b406_wp01_design_export.js", "?202071513312796");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1642( )
   {
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_164_idx );
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_164_idx ;
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_164_idx ;
   }

   public void subsflControlProps_fel_1642( )
   {
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_164_fel_idx );
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_164_fel_idx ;
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_164_fel_idx ;
   }

   public void sendrow_1642( )
   {
      subsflControlProps_1642( ) ;
      wb2J0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_164_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_164_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_164_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_164_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_164_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_164_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grid_header3_Internalname+"_"+sGXsfl_164_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"",new Integer(725),"","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:60px\""});
         /* Check box */
         TempTags = " " + ((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 170,'',false,'"+sGXsfl_164_idx+"',164)\"" : " ") ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlcheck.getInternalname(),GXutil.booltostr( ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(170, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(170);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_164_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id(), (byte)(4), (byte)(0), ".", "")),((edtavCtltbm31_crf_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id()), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm31_crf_id_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm31_crf_id_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(164),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:5px\""});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_nm_Internalname,GXutil.rtrim( ((SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem)AV5B406_SD01_EXPORT_LIST_C.elementAt(-1+AV33GXV1)).getgxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm31_crf_nm_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm31_crf_nm_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(164),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("row");
         }
         /* End of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( 1 > 0 )
            {
               if ( ((int)((nGXsfl_164_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_164_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_164_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_164_idx+1)) ;
         sGXsfl_164_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_164_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1642( ) ;
      }
      /* End function sendrow_1642 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_export_Internalname = "TXT_BTN_EXPORT" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      cmbavD_study_id.setInternalname( "vD_STUDY_ID" );
      tblTable6_Internalname = "TABLE6" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      chkavD_base_flg.setInternalname( "vD_BASE_FLG" );
      chkavD_site_flg.setInternalname( "vD_SITE_FLG" );
      chkavD_staff_flg.setInternalname( "vD_STAFF_FLG" );
      chkavD_list_chk.setInternalname( "vD_LIST_CHK" );
      chkavD_subject_chk.setInternalname( "vD_SUBJECT_CHK" );
      tblTable5_Internalname = "TABLE5" ;
      tblTbl_export_Internalname = "TBL_EXPORT" ;
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
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTbl_grid_header3_Internalname = "TBL_GRID_HEADER3" ;
      tblTbl_list_Internalname = "TBL_LIST" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblBtn_export_exec_Internalname = "BTN_EXPORT_EXEC" ;
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
      edtavCtltbm31_crf_nm_Jsonclick = "" ;
      edtavCtltbm31_crf_id_Jsonclick = "" ;
      chkavCtlcheck.setVisible( 1 );
      chkavCtlcheck.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridBase" ;
      cmbavD_study_id.setJsonclick( "" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltbm31_crf_nm_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "(全100件)" ;
      tblTbl_list_Visible = 1 ;
      tblTbl_export_Visible = 1 ;
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
      subGrid1_Backcolorstyle = (byte)(0) ;
      chkavD_grd_all_chk.setCaption( "" );
      chkavD_subject_chk.setCaption( "" );
      chkavD_list_chk.setCaption( "" );
      chkavD_staff_flg.setCaption( "" );
      chkavD_site_flg.setCaption( "" );
      chkavD_base_flg.setCaption( "" );
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
      AV5B406_SD01_EXPORT_LIST_C = new GxObjectCollection(SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem.class, "B406_SD01_EXPORT_LIST.B406_SD01_EXPORT_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV14H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV39Pgmname = "" ;
      AV7C_APP_ID = "" ;
      A369TBM21_DEL_FLG = "" ;
      AV19W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      A367TBM21_STUDY_NM = "" ;
      AV17H_SRCH_FLG = "" ;
      AV20W_A821_JS = "" ;
      A393TBM31_CRF_NM = "" ;
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
      edtavCtltbm31_crf_id_Internalname = "" ;
      edtavCtltbm31_crf_nm_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV38Pgmdesc = "" ;
      AV15H_INIT_FLG = "" ;
      AV16H_KNGN_FLG = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV24W_MSG = "" ;
      AV21W_ERRCD = "" ;
      scmdbuf = "" ;
      H002J2_A68TBM31_STUDY_ID = new long[1] ;
      H002J2_A367TBM21_STUDY_NM = new String[] {""} ;
      H002J2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H002J2_A69TBM31_CRF_ID = new short[1] ;
      H002J2_A393TBM31_CRF_NM = new String[] {""} ;
      H002J2_n393TBM31_CRF_NM = new boolean[] {false} ;
      H002J2_A395TBM31_ORDER = new int[1] ;
      H002J2_n395TBM31_ORDER = new boolean[] {false} ;
      AV6B406_SD01_EXPORT_LIST_I = new SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem(remoteHandle, context);
      GXv_SdtA_PAGING_SDT4 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      AV25W_SESSION = httpContext.getWebSession();
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      A607TBM21_STATUS = "" ;
      H002J3_A63TBM21_STUDY_ID = new long[1] ;
      H002J3_A369TBM21_DEL_FLG = new String[] {""} ;
      H002J3_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H002J3_A607TBM21_STATUS = new String[] {""} ;
      H002J3_n607TBM21_STATUS = new boolean[] {false} ;
      H002J3_A367TBM21_STUDY_NM = new String[] {""} ;
      H002J3_n367TBM21_STUDY_NM = new boolean[] {false} ;
      GXv_char3 = new String [1] ;
      GXv_char2 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblBtn_export_exec_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock15_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
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
      lblTextblock18_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTxt_btn_export_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b406_wp01_design_export__default(),
         new Object[] {
             new Object[] {
            H002J2_A68TBM31_STUDY_ID, H002J2_A367TBM21_STUDY_NM, H002J2_n367TBM21_STUDY_NM, H002J2_A69TBM31_CRF_ID, H002J2_A393TBM31_CRF_NM, H002J2_n393TBM31_CRF_NM, H002J2_A395TBM31_ORDER, H002J2_n395TBM31_ORDER
            }
            , new Object[] {
            H002J3_A63TBM21_STUDY_ID, H002J3_A369TBM21_DEL_FLG, H002J3_n369TBM21_DEL_FLG, H002J3_A607TBM21_STATUS, H002J3_n607TBM21_STATUS, H002J3_A367TBM21_STUDY_NM, H002J3_n367TBM21_STUDY_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV39Pgmname = "B406_WP01_DESIGN_EXPORT" ;
      AV38Pgmdesc = "試験情報エクスポート" ;
      /* GeneXus formulas. */
      AV39Pgmname = "B406_WP01_DESIGN_EXPORT" ;
      AV38Pgmdesc = "試験情報エクスポート" ;
      Gx_err = (short)(0) ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltbm31_crf_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV18P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV18P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_164 ;
   private short nGXsfl_164_idx=1 ;
   private short A69TBM31_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV33GXV1 ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_164_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_164_fel_idx=1 ;
   private int A395TBM31_ORDER ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int edtavCtltbm31_crf_id_Enabled ;
   private int edtavCtltbm31_crf_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV41GXV6 ;
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
   private int tblTbl_export_Visible ;
   private int tblTbl_list_Visible ;
   private int GXActiveErrHndl ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long A63TBM21_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long AV12D_STUDY_ID ;
   private long GRID1_nRecordCount ;
   private long GRID1_nCurrentRecord ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_164_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV39Pgmname ;
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
   private String edtavCtltbm31_crf_id_Internalname ;
   private String edtavCtltbm31_crf_nm_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV38Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String sGXsfl_164_fel_idx="0001" ;
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
   private String tblTbl_export_Internalname ;
   private String tblTbl_list_Internalname ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblBtn_export_exec_Internalname ;
   private String lblBtn_export_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
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
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String tblTable5_Internalname ;
   private String tblTable6_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_export_Internalname ;
   private String lblTxt_btn_export_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_header3_Internalname ;
   private String tblTable3_Internalname ;
   private String ROClassString ;
   private String edtavCtltbm31_crf_id_Jsonclick ;
   private String edtavCtltbm31_crf_nm_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV22W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV30D_BASE_FLG ;
   private boolean AV28D_SITE_FLG ;
   private boolean AV29D_STAFF_FLG ;
   private boolean AV11D_LIST_CHK ;
   private boolean AV13D_SUBJECT_CHK ;
   private boolean AV9D_GRD_ALL_CHK ;
   private boolean returnInSub ;
   private boolean gx_BV164 ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n395TBM31_ORDER ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private String AV7C_APP_ID ;
   private String A369TBM21_DEL_FLG ;
   private String A367TBM21_STUDY_NM ;
   private String AV17H_SRCH_FLG ;
   private String AV20W_A821_JS ;
   private String A393TBM31_CRF_NM ;
   private String AV15H_INIT_FLG ;
   private String AV16H_KNGN_FLG ;
   private String AV8C_GAMEN_TITLE ;
   private String AV24W_MSG ;
   private String AV21W_ERRCD ;
   private String AV19W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ;
   private String AV19W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg ;
   private String A607TBM21_STATUS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.webpanels.WebSession AV25W_SESSION ;
   private HTMLChoice cmbavD_study_id ;
   private ICheckbox chkavD_base_flg ;
   private ICheckbox chkavD_site_flg ;
   private ICheckbox chkavD_staff_flg ;
   private ICheckbox chkavD_list_chk ;
   private ICheckbox chkavD_subject_chk ;
   private ICheckbox chkavD_grd_all_chk ;
   private ICheckbox chkavCtlcheck ;
   private IDataStoreProvider pr_default ;
   private long[] H002J2_A68TBM31_STUDY_ID ;
   private String[] H002J2_A367TBM21_STUDY_NM ;
   private boolean[] H002J2_n367TBM21_STUDY_NM ;
   private short[] H002J2_A69TBM31_CRF_ID ;
   private String[] H002J2_A393TBM31_CRF_NM ;
   private boolean[] H002J2_n393TBM31_CRF_NM ;
   private int[] H002J2_A395TBM31_ORDER ;
   private boolean[] H002J2_n395TBM31_ORDER ;
   private long[] H002J3_A63TBM21_STUDY_ID ;
   private String[] H002J3_A369TBM21_DEL_FLG ;
   private boolean[] H002J3_n369TBM21_DEL_FLG ;
   private String[] H002J3_A607TBM21_STATUS ;
   private boolean[] H002J3_n607TBM21_STATUS ;
   private String[] H002J3_A367TBM21_STUDY_NM ;
   private boolean[] H002J3_n367TBM21_STUDY_NM ;
   private GxObjectCollection AV5B406_SD01_EXPORT_LIST_C ;
   private GxObjectCollection AV19W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_User_study_sdt_getgxTv_SdtA_USER_STUDY_SDT_Study_id ;
   private SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem AV6B406_SD01_EXPORT_LIST_I ;
   private SdtA_PAGING_SDT AV14H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT4[] ;
   private SdtA_LOGIN_SDT AV19W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
}

final  class b406_wp01_design_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H002J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV12D_STUDY_ID ,
                                          long A68TBM31_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int6 ;
      GXv_int6 = new byte [1] ;
      Object[] GXv_Object7 ;
      GXv_Object7 = new Object [2] ;
      scmdbuf = "SELECT T1.`TBM31_STUDY_ID` AS TBM31_STUDY_ID, T2.`TBM21_STUDY_NM`, T1.`TBM31_CRF_ID`," ;
      scmdbuf = scmdbuf + " T1.`TBM31_CRF_NM`, T1.`TBM31_ORDER` FROM (`TBM31_CRF` T1 INNER JOIN `TBM21_STUDY`" ;
      scmdbuf = scmdbuf + " T2 ON T2.`TBM21_STUDY_ID` = T1.`TBM31_STUDY_ID`)" ;
      if ( ! (0==AV12D_STUDY_ID) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.`TBM31_STUDY_ID` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.`TBM31_STUDY_ID` = ?)" ;
         }
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY T1.`TBM31_ORDER`" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_H002J3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String A607TBM21_STATUS ,
                                          long A63TBM21_STUDY_ID ,
                                          String AV19W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ,
                                          String AV19W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg ,
                                          GxObjectCollection AV19W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_User_study_sdt_getgxTv_SdtA_USER_STUDY_SDT_Study_id ,
                                          String A369TBM21_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      Object[] GXv_Object8 ;
      GXv_Object8 = new Object [2] ;
      scmdbuf = "SELECT `TBM21_STUDY_ID`, `TBM21_DEL_FLG`, `TBM21_STATUS`, `TBM21_STUDY_NM` FROM `TBM21_STUDY`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM21_STATUS` IN ('0','1'))" ;
      scmdbuf = scmdbuf + " and (`TBM21_DEL_FLG` = '0')" ;
      if ( ( GXutil.strcmp(AV19W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn, "99") != 0 ) && ( GXutil.strcmp(AV19W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg, "1") != 0 ) )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV19W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_User_study_sdt_getgxTv_SdtA_USER_STUDY_SDT_Study_id, "`TBM21_STUDY_ID` IN (", ")") + ")" ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM21_STUDY_ID`" ;
      GXv_Object8[0] = scmdbuf ;
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
            case 0 :
                  return conditional_H002J2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() );
            case 1 :
                  return conditional_H002J3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (GxObjectCollection)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H002J3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               return;
      }
   }

}

