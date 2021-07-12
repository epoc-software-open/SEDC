/*
               File: b711_wp01_search_study_impl
        Description: 試験検索・権限選択画面
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:25:8.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b711_wp01_search_study_impl extends GXWebPanel
{
   public b711_wp01_search_study_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b711_wp01_search_study_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b711_wp01_search_study_impl.class ));
   }

   public b711_wp01_search_study_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_auth_cd = new HTMLChoice();
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
            nRC_GXsfl_151 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_151_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_151_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_151, nGXsfl_151_idx, sGXsfl_151_idx) ;
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
            AV19P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19P_MOVE_KBN", GXutil.str( AV19P_MOVE_KBN, 1, 0));
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
         pa1I2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1I2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1I2( ) ;
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
      httpContext.writeValue( "試験検索・権限選択画面") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151325875");
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
      GXEncryptionTmp = "b711_wp01_search_study"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b711_wp01_search_study") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1I2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_b711_sd01_search_study_list", AV24W_B711_SD01_SEARCH_STUDY_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_b711_sd01_search_study_list", AV24W_B711_SD01_SEARCH_STUDY_LIST);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV11H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV11H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_151", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_151, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV19P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_A_LOGIN_SDT", AV20W_A_LOGIN_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_A_LOGIN_SDT", AV20W_A_LOGIN_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_DEL_FLG", GXutil.rtrim( A369TBM21_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM23_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A107TBM23_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM23_USER_ID", GXutil.rtrim( A108TBM23_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "TBM23_STYDY_AUTH_CD", GXutil.rtrim( A109TBM23_STYDY_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM23_DEL_FLG", GXutil.rtrim( A385TBM23_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV22W_A821_JS));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV28W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "TAM04_AUTH_CD", GXutil.rtrim( A13TAM04_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "vW_AUTH_CD", GXutil.rtrim( AV23W_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TAM04_DEL_FLG", GXutil.rtrim( A215TAM04_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TAM04_AUTH_NM", GXutil.rtrim( A285TAM04_AUTH_NM));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B711_SD01_SEARCH_STUDY_LIST", AV24W_B711_SD01_SEARCH_STUDY_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B711_SD01_SEARCH_STUDY_LIST", AV24W_B711_SD01_SEARCH_STUDY_LIST);
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
      return "B711_WP01_SEARCH_STUDY" ;
   }

   public String getPgmdesc( )
   {
      return "試験検索・権限選択画面" ;
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
         wb_table2_186_1I2( true) ;
      }
      else
      {
         wb_table2_186_1I2( false) ;
      }
      return  ;
   }

   public void wb_table2_186_1I2e( boolean wbgen )
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験検索・権限選択画面", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0184") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0184", "");
         }
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111I2 */
                        e111I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121I2 */
                        e121I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_OK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131I2 */
                        e131I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141I2 */
                        e141I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151I2 */
                        e151I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161I2 */
                        e161I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171I2 */
                        e171I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181I2 */
                        e181I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191I2 */
                        e191I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201I2 */
                        e201I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211I2 */
                        e211I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221I2 */
                        e221I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231I2 */
                        e231I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241I2 */
                        e241I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251I2 */
                        e251I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261I2 */
                        e261I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271I2 */
                        e271I2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) )
                     {
                        nGXsfl_151_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_151_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_151_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1512( ) ;
                        AV36GXV1 = (short)(nGXsfl_151_idx+GRID1_nFirstRecordOnPage) ;
                        if ( ( AV24W_B711_SD01_SEARCH_STUDY_LIST.size() >= AV36GXV1 ) && ( AV36GXV1 > 0 ) )
                        {
                           AV24W_B711_SD01_SEARCH_STUDY_LIST.currentItem( ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)) );
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM21_STUDY_ID");
                              GX_FocusControl = edtavCtltbm21_study_id_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id( 0 );
                           }
                           else
                           {
                              ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") );
                           }
                           ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm( httpContext.cgiGet( edtavCtltbm21_study_nm_Internalname) );
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0184") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0184", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0184") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0184", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e281I2 */
                              e281I2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e291I2 */
                              e291I2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e301I2 */
                              e301I2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e311I2 */
                              e311I2 ();
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
                  else if ( nCmpId == 184 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0184") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0184", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
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
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b711_wp01_search_study")), "b711_wp01_search_study") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b711_wp01_search_study"))) ;
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
                  AV19P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV19P_MOVE_KBN", GXutil.str( AV19P_MOVE_KBN, 1, 0));
               }
            }
         }
         cmbavD_auth_cd.setName( "vD_AUTH_CD" );
         cmbavD_auth_cd.setWebtags( "" );
         if ( cmbavD_auth_cd.getItemCount() > 0 )
         {
            AV7D_AUTH_CD = cmbavD_auth_cd.getValidValue(AV7D_AUTH_CD) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_AUTH_CD", AV7D_AUTH_CD);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_151 ,
                                 short nGXsfl_151_idx ,
                                 String sGXsfl_151_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1512( ) ;
      while ( nGXsfl_151_idx <= nRC_GXsfl_151 )
      {
         sendrow_1512( ) ;
         nGXsfl_151_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_151_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_151_idx+1)) ;
         sGXsfl_151_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_151_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1512( ) ;
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
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
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
      wbStart = (short)(151) ;
      nGXsfl_151_idx = (short)(1) ;
      sGXsfl_151_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_151_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1512( ) ;
      nGXsfl_151_Refreshing = (short)(1) ;
      /* Execute user event: e291I2 */
      e291I2 ();
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
         subsflControlProps_1512( ) ;
         /* Execute user event: e301I2 */
         e301I2 ();
         wbEnd = (short)(151) ;
         wb1I0( ) ;
      }
      nGXsfl_151_Refreshing = (short)(0) ;
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
      return AV24W_B711_SD01_SEARCH_STUDY_LIST.size() ;
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

   public void strup1I0( )
   {
      /* Before Start, stand alone formulas. */
      AV41Pgmname = "B711_WP01_SEARCH_STUDY" ;
      AV40Pgmdesc = "試験検索・権限選択画面" ;
      Gx_err = (short)(0) ;
      edtavCtltbm21_study_id_Enabled = 0 ;
      edtavCtltbm21_study_nm_Enabled = 0 ;
      edtavD_tbm21_study_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tbm21_study_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_tbm21_study_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e281I2 */
      e281I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b711_sd01_search_study_list"), AV24W_B711_SD01_SEARCH_STUDY_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV11H_A_PAGING_SDT);
         /* Read variables values. */
         AV8D_SRCH_TBM21_STUDY_ID = httpContext.cgiGet( edtavD_srch_tbm21_study_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_SRCH_TBM21_STUDY_ID", AV8D_SRCH_TBM21_STUDY_ID);
         AV9D_SRCH_TBM21_STUDY_NM = httpContext.cgiGet( edtavD_srch_tbm21_study_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_SRCH_TBM21_STUDY_NM", AV9D_SRCH_TBM21_STUDY_NM);
         AV10D_TBM21_STUDY_NM = httpContext.cgiGet( edtavD_tbm21_study_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_TBM21_STUDY_NM", AV10D_TBM21_STUDY_NM);
         cmbavD_auth_cd.setName( cmbavD_auth_cd.getInternalname() );
         cmbavD_auth_cd.setValue( httpContext.cgiGet( cmbavD_auth_cd.getInternalname()) );
         AV7D_AUTH_CD = httpContext.cgiGet( cmbavD_auth_cd.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_AUTH_CD", AV7D_AUTH_CD);
         AV17H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_SRCH_FLG", AV17H_SRCH_FLG);
         AV12H_DMFLG = httpContext.cgiGet( edtavH_dmflg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_DMFLG", AV12H_DMFLG);
         AV13H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         AV14H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         AV16H_SRCH_TBM21_STUDY_NM = httpContext.cgiGet( edtavH_srch_tbm21_study_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_SRCH_TBM21_STUDY_NM", AV16H_SRCH_TBM21_STUDY_NM);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_srch_tbm21_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_srch_tbm21_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SRCH_TBM21_STUDY_ID");
            GX_FocusControl = edtavH_srch_tbm21_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15H_SRCH_TBM21_STUDY_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV15H_SRCH_TBM21_STUDY_ID, 10, 0)));
         }
         else
         {
            AV15H_SRCH_TBM21_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtavH_srch_tbm21_study_id_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV15H_SRCH_TBM21_STUDY_ID, 10, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_tbm21_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_tbm21_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_TBM21_STUDY_ID");
            GX_FocusControl = edtavH_tbm21_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18H_TBM21_STUDY_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18H_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV18H_TBM21_STUDY_ID, 10, 0)));
         }
         else
         {
            AV18H_TBM21_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtavH_tbm21_study_id_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18H_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV18H_TBM21_STUDY_ID, 10, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_151 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_151"), ".", ",")) ;
         AV19P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0184") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0184", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_GXsfl_151 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_151"), ".", ",")) ;
         nGXsfl_151_fel_idx = (short)(0) ;
         while ( nGXsfl_151_fel_idx < nRC_GXsfl_151 )
         {
            nGXsfl_151_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_151_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_151_fel_idx+1)) ;
            sGXsfl_151_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_151_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1512( ) ;
            AV36GXV1 = (short)(nGXsfl_151_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV36GXV1 = (short)(nGXsfl_151_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV24W_B711_SD01_SEARCH_STUDY_LIST.size() >= AV36GXV1 ) && ( AV36GXV1 > 0 ) )
            {
               AV24W_B711_SD01_SEARCH_STUDY_LIST.currentItem( ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") > 9999999999L ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM21_STUDY_ID");
                  GX_FocusControl = edtavCtltbm21_study_id_Internalname ;
                  wbErr = true ;
                  ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id( 0 );
               }
               else
               {
                  ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") );
               }
               ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm( httpContext.cgiGet( edtavCtltbm21_study_nm_Internalname) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0184") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0184", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0184") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0184", "");
            }
            AV24W_B711_SD01_SEARCH_STUDY_LIST.currentItem( ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)) );
         }
         if ( nGXsfl_151_fel_idx == 0 )
         {
            nGXsfl_151_idx = (short)(1) ;
            sGXsfl_151_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_151_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1512( ) ;
         }
         nGXsfl_151_fel_idx = (short)(1) ;
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
      /* Execute user event: e281I2 */
      e281I2 ();
      if (returnInSub) return;
   }

   public void e281I2( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B711" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      AV6C_GAMEN_TITLE = AV40Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_GAMEN_TITLE", AV6C_GAMEN_TITLE);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV20W_A_LOGIN_SDT,AV5C_APP_ID,AV6C_GAMEN_TITLE,"",""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0184",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e291I2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV13H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV41Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      AV13H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( ! (0==AV18H_TBM21_STUDY_ID) )
      {
         cellCell_sel_study_nm_Backcolor = UIFactory.getColor( 135, 206, 250) ;
         httpContext.ajax_rsp_assign_prop("", false, cellCell_sel_study_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( cellCell_sel_study_nm_Backcolor, 9, 0)));
         cellCell_sel_auth_cd_Backcolor = UIFactory.getColor( 135, 206, 250) ;
         httpContext.ajax_rsp_assign_prop("", false, cellCell_sel_auth_cd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( cellCell_sel_auth_cd_Backcolor, 9, 0)));
      }
      else
      {
         cellCell_sel_study_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
         httpContext.ajax_rsp_assign_prop("", false, cellCell_sel_study_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( cellCell_sel_study_nm_Backcolor, 9, 0)));
         cellCell_sel_auth_cd_Backcolor = UIFactory.getColor( 255, 255, 255) ;
         httpContext.ajax_rsp_assign_prop("", false, cellCell_sel_auth_cd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( cellCell_sel_auth_cd_Backcolor, 9, 0)));
      }
   }

   private void e301I2( )
   {
      /* Grid1_Load Routine */
      AV36GXV1 = (short)(1) ;
      while ( AV36GXV1 <= AV24W_B711_SD01_SEARCH_STUDY_LIST.size() )
      {
         AV24W_B711_SD01_SEARCH_STUDY_LIST.currentItem( ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_B711_SD01_SEARCH_STUDY_LIST", AV24W_B711_SD01_SEARCH_STUDY_LIST);
         if ( subgrid1_recordcount( ) == 1 )
         {
            /* Execute user subroutine: S192 */
            S192 ();
            if (returnInSub) return;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(151) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1512( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         AV36GXV1 = (short)(AV36GXV1+1) ;
      }
   }

   public void e111I2( )
   {
      /* 'BTN_SRCH' Routine */
      edtavD_srch_tbm21_study_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_srch_tbm21_study_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_srch_tbm21_study_id_Backcolor, 9, 0)));
      if ( GxRegex.IsMatch(AV8D_SRCH_TBM21_STUDY_ID,"[^0-9]") )
      {
         GXt_char1 = AV29W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00019", "試験ID", "", "", "", "", GXv_char2) ;
         b711_wp01_search_study_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         httpContext.GX_msglist.addItem(AV29W_MSG);
         edtavD_srch_tbm21_study_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_srch_tbm21_study_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_srch_tbm21_study_id_Backcolor, 9, 0)));
         GX_FocusControl = edtavD_srch_tbm21_study_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV28W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
         AV24W_B711_SD01_SEARCH_STUDY_LIST.clear();
         gx_BV151 = true ;
      }
      if ( (GXutil.strcmp("", AV29W_MSG)==0) )
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      AV18H_TBM21_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV18H_TBM21_STUDY_ID, 10, 0)));
      AV10D_TBM21_STUDY_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_TBM21_STUDY_NM", AV10D_TBM21_STUDY_NM);
      AV7D_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_AUTH_CD", AV7D_AUTH_CD);
      cmbavD_auth_cd.removeAllItems();
      cmbavD_auth_cd.setIBackground( UIFactory.getColor( 255, 255, 255) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavD_auth_cd.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavD_auth_cd.getIBackground(), 9, 0)));
   }

   public void e121I2( )
   {
      /* 'BTN_CLER' Routine */
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void e311I2( )
   {
      /* 'BTN_SEL' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
   }

   public void e131I2( )
   {
      /* 'BTN_OK' Routine */
      if ( subgrid1_recordcount( ) > 0 )
      {
         GXt_char1 = AV29W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00007", "試験", "", "", "", "", GXv_char2) ;
         b711_wp01_search_study_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         if ( ( GXutil.strcmp(AV10D_TBM21_STUDY_NM, "") != 0 ) && ( GXutil.strcmp(AV7D_AUTH_CD, "") != 0 ) )
         {
            AV29W_MSG = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         }
         if ( (GXutil.strcmp("", AV29W_MSG)==0) )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "b712_wp01_search_crf"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18H_TBM21_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV7D_AUTH_CD)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) ;
            httpContext.wjLoc = formatLink("b712_wp01_search_crf") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV29W_MSG);
            cmbavD_auth_cd.setIBackground( UIFactory.getColor( 255, 192, 203) );
            httpContext.ajax_rsp_assign_prop("", false, cmbavD_auth_cd.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavD_auth_cd.getIBackground(), 9, 0)));
            GX_FocusControl = cmbavD_auth_cd.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV19P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
      }
   }

   public void S142( )
   {
      /* 'SUB_AUTH_CHECK' Routine */
      AV12H_DMFLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_DMFLG", AV12H_DMFLG);
      if ( ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "008"), AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn()) == 0 ) || ( GXutil.strcmp(AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(), "99") == 0 ) )
      {
         AV12H_DMFLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_DMFLG", AV12H_DMFLG);
      }
   }

   public void S212( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV30W_SESSION.setValue(AV41Pgmname+"_SRCH_STUDY_ID", AV8D_SRCH_TBM21_STUDY_ID);
      AV30W_SESSION.setValue(AV41Pgmname+"_SRCH_STUDY_NM", AV9D_SRCH_TBM21_STUDY_NM);
      AV30W_SESSION.setValue(AV41Pgmname+"_SRCH_FLG", AV17H_SRCH_FLG);
      AV30W_SESSION.setValue(AV41Pgmname+"_SEL_STUDY_ID", GXutil.str( AV18H_TBM21_STUDY_ID, 10, 0));
      AV30W_SESSION.setValue(AV41Pgmname+"_SEL_STUDY_NM", AV10D_TBM21_STUDY_NM);
      AV30W_SESSION.setValue(AV41Pgmname+"_SEL_AUTH_CD", AV7D_AUTH_CD);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV8D_SRCH_TBM21_STUDY_ID = AV30W_SESSION.getValue(AV41Pgmname+"_SRCH_STUDY_ID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_SRCH_TBM21_STUDY_ID", AV8D_SRCH_TBM21_STUDY_ID);
      AV9D_SRCH_TBM21_STUDY_NM = AV30W_SESSION.getValue(AV41Pgmname+"_SRCH_STUDY_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_SRCH_TBM21_STUDY_NM", AV9D_SRCH_TBM21_STUDY_NM);
      AV17H_SRCH_FLG = AV30W_SESSION.getValue(AV41Pgmname+"_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_SRCH_FLG", AV17H_SRCH_FLG);
      AV18H_TBM21_STUDY_ID = GXutil.lval( AV30W_SESSION.getValue(AV41Pgmname+"_SEL_STUDY_ID")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV18H_TBM21_STUDY_ID, 10, 0)));
      AV10D_TBM21_STUDY_NM = AV30W_SESSION.getValue(AV41Pgmname+"_SEL_STUDY_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_TBM21_STUDY_NM", AV10D_TBM21_STUDY_NM);
      AV7D_AUTH_CD = AV30W_SESSION.getValue(AV41Pgmname+"_SEL_AUTH_CD") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_AUTH_CD", AV7D_AUTH_CD);
   }

   public void S202( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV30W_SESSION.remove(AV41Pgmname+"_SRCH_STUDY_ID");
      AV30W_SESSION.remove(AV41Pgmname+"_SRCH_STUDY_NM");
      AV30W_SESSION.remove(AV41Pgmname+"_SRCH_FLG");
      AV30W_SESSION.remove(AV41Pgmname+"_SEL_STUDY_ID");
      AV30W_SESSION.remove(AV41Pgmname+"_SEL_STUDY_NM");
      AV30W_SESSION.remove(AV41Pgmname+"_SEL_AUTH_CD");
   }

   public void S232( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV15H_SRCH_TBM21_STUDY_ID = GXutil.lval( AV8D_SRCH_TBM21_STUDY_ID) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV15H_SRCH_TBM21_STUDY_ID, 10, 0)));
      AV16H_SRCH_TBM21_STUDY_NM = AV9D_SRCH_TBM21_STUDY_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_SRCH_TBM21_STUDY_NM", AV16H_SRCH_TBM21_STUDY_NM);
   }

   public void S152( )
   {
      /* 'SUB_SRCH' Routine */
      AV28W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
      if ( ! AV28W_ERRFLG )
      {
         AV17H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_SRCH_FLG", AV17H_SRCH_FLG);
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
         AV24W_B711_SD01_SEARCH_STUDY_LIST.clear();
         gx_BV151 = true ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A607TBM21_STATUS ,
                                              AV8D_SRCH_TBM21_STUDY_ID ,
                                              AV16H_SRCH_TBM21_STUDY_NM ,
                                              AV12H_DMFLG ,
                                              new Long(A63TBM21_STUDY_ID) ,
                                              new Long(AV15H_SRCH_TBM21_STUDY_ID) ,
                                              A367TBM21_STUDY_NM ,
                                              A369TBM21_DEL_FLG },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN
                                              }
         });
         lV16H_SRCH_TBM21_STUDY_NM = GXutil.padr( GXutil.rtrim( AV16H_SRCH_TBM21_STUDY_NM), 100, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_SRCH_TBM21_STUDY_NM", AV16H_SRCH_TBM21_STUDY_NM);
         /* Using cursor H001I2 */
         pr_default.execute(0, new Object[] {new Long(AV15H_SRCH_TBM21_STUDY_ID), lV16H_SRCH_TBM21_STUDY_NM});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A369TBM21_DEL_FLG = H001I2_A369TBM21_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
            n369TBM21_DEL_FLG = H001I2_n369TBM21_DEL_FLG[0] ;
            A607TBM21_STATUS = H001I2_A607TBM21_STATUS[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
            n607TBM21_STATUS = H001I2_n607TBM21_STATUS[0] ;
            A367TBM21_STUDY_NM = H001I2_A367TBM21_STUDY_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
            n367TBM21_STUDY_NM = H001I2_n367TBM21_STUDY_NM[0] ;
            A63TBM21_STUDY_ID = H001I2_A63TBM21_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
            AV31W_STUDY_ID = A63TBM21_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31W_STUDY_ID", GXutil.ltrim( GXutil.str( AV31W_STUDY_ID, 10, 0)));
            AV32W_STUDY_NM = A367TBM21_STUDY_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32W_STUDY_NM", AV32W_STUDY_NM);
            /* Using cursor H001I3 */
            pr_default.execute(1, new Object[] {new Long(AV31W_STUDY_ID), AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A108TBM23_USER_ID = H001I3_A108TBM23_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
               A107TBM23_STUDY_ID = H001I3_A107TBM23_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
               AV25W_B711_SD01_SEARCH_STUDY_LIST_Item = (SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)new SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem(remoteHandle, context);
               AV25W_B711_SD01_SEARCH_STUDY_LIST_Item.setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id( A107TBM23_STUDY_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_B711_SD01_SEARCH_STUDY_LIST_Item", AV25W_B711_SD01_SEARCH_STUDY_LIST_Item);
               AV25W_B711_SD01_SEARCH_STUDY_LIST_Item.setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm( AV32W_STUDY_NM );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_B711_SD01_SEARCH_STUDY_LIST_Item", AV25W_B711_SD01_SEARCH_STUDY_LIST_Item);
               AV24W_B711_SD01_SEARCH_STUDY_LIST.add(AV25W_B711_SD01_SEARCH_STUDY_LIST_Item, 0);
               gx_BV151 = true ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'STUDY_SELECT' Routine */
      AV18H_TBM21_STUDY_ID = ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)(AV24W_B711_SD01_SEARCH_STUDY_LIST.currentItem())).getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV18H_TBM21_STUDY_ID, 10, 0)));
      AV10D_TBM21_STUDY_NM = ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)(AV24W_B711_SD01_SEARCH_STUDY_LIST.currentItem())).getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_TBM21_STUDY_NM", AV10D_TBM21_STUDY_NM);
      AV7D_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_AUTH_CD", AV7D_AUTH_CD);
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void S162( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
      cmbavD_auth_cd.removeAllItems();
      /* Using cursor H001I4 */
      pr_default.execute(2, new Object[] {new Long(AV18H_TBM21_STUDY_ID), AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A385TBM23_DEL_FLG = H001I4_A385TBM23_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A385TBM23_DEL_FLG", A385TBM23_DEL_FLG);
         n385TBM23_DEL_FLG = H001I4_n385TBM23_DEL_FLG[0] ;
         A108TBM23_USER_ID = H001I4_A108TBM23_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
         A107TBM23_STUDY_ID = H001I4_A107TBM23_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
         A109TBM23_STYDY_AUTH_CD = H001I4_A109TBM23_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
         AV23W_AUTH_CD = A109TBM23_STYDY_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23W_AUTH_CD", AV23W_AUTH_CD);
         /* Execute user subroutine: S255 */
         S255 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S255( )
   {
      /* 'SUB_SEL_TAM04' Routine */
      /* Using cursor H001I5 */
      pr_default.execute(3, new Object[] {AV23W_AUTH_CD});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A215TAM04_DEL_FLG = H001I5_A215TAM04_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215TAM04_DEL_FLG", A215TAM04_DEL_FLG);
         n215TAM04_DEL_FLG = H001I5_n215TAM04_DEL_FLG[0] ;
         A13TAM04_AUTH_CD = H001I5_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         A285TAM04_AUTH_NM = H001I5_A285TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
         n285TAM04_AUTH_NM = H001I5_n285TAM04_AUTH_NM[0] ;
         cmbavD_auth_cd.addItem(A13TAM04_AUTH_CD, A285TAM04_AUTH_NM, (short)(0));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S242( )
   {
      /* 'SUB_INPUT_CHK' Routine */
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV20W_A_LOGIN_SDT;
      GXv_char2[0] = AV27W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b711_wp01_search_study_impl.this.AV27W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRCD", AV27W_ERRCD);
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
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
      AV8D_SRCH_TBM21_STUDY_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_SRCH_TBM21_STUDY_ID", AV8D_SRCH_TBM21_STUDY_ID);
      edtavD_srch_tbm21_study_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_srch_tbm21_study_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_srch_tbm21_study_id_Backcolor, 9, 0)));
      AV9D_SRCH_TBM21_STUDY_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_SRCH_TBM21_STUDY_NM", AV9D_SRCH_TBM21_STUDY_NM);
      AV15H_SRCH_TBM21_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV15H_SRCH_TBM21_STUDY_ID, 10, 0)));
      AV16H_SRCH_TBM21_STUDY_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_SRCH_TBM21_STUDY_NM", AV16H_SRCH_TBM21_STUDY_NM);
      AV18H_TBM21_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( AV18H_TBM21_STUDY_ID, 10, 0)));
      AV10D_TBM21_STUDY_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_TBM21_STUDY_NM", AV10D_TBM21_STUDY_NM);
      cmbavD_auth_cd.removeAllItems();
      cmbavD_auth_cd.setIBackground( UIFactory.getColor( 255, 255, 255) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavD_auth_cd.getInternalname(), "Backcolor", GXutil.ltrim( GXutil.str( cmbavD_auth_cd.getIBackground(), 9, 0)));
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      AV17H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_SRCH_FLG", AV17H_SRCH_FLG);
      AV21W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21W_A819_JS", AV21W_A819_JS);
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV22W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV22W_A821_JS ;
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

   public void S262( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV41Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b711_wp01_search_study");
   }

   public void e141I2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e151I2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      else
      {
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e161I2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e171I2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e181I2( )
   {
      /* 'PAGE01' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e191I2( )
   {
      /* 'PAGE02' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201I2( )
   {
      /* 'PAGE03' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211I2( )
   {
      /* 'PAGE04' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221I2( )
   {
      /* 'PAGE05' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231I2( )
   {
      /* 'PAGE06' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241I2( )
   {
      /* 'PAGE07' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251I2( )
   {
      /* 'PAGE08' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261I2( )
   {
      /* 'PAGE09' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271I2( )
   {
      /* 'PAGE10' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      AV11H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV11H_A_PAGING_SDT", AV11H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT4[0] = AV11H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT4) ;
      AV11H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT4[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV17H_SRCH_FLG, "1") == 0 ) && ! AV28W_ERRFLG )
         {
            GXt_char1 = AV29W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
            b711_wp01_search_study_impl.this.GXt_char1 = GXv_char2[0] ;
            AV29W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
            httpContext.GX_msglist.addItem(AV29W_MSG);
         }
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void wb_table2_186_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV17H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV17H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B711_WP01_SEARCH_STUDY.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dmflg_Internalname, GXutil.rtrim( AV12H_DMFLG), GXutil.rtrim( localUtil.format( AV12H_DMFLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_dmflg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B711_WP01_SEARCH_STUDY.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV13H_INIT_FLG), GXutil.rtrim( localUtil.format( AV13H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(192);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(193);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B711_WP01_SEARCH_STUDY.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV14H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV14H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B711_WP01_SEARCH_STUDY.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_tbm21_study_nm_Internalname, GXutil.rtrim( AV16H_SRCH_TBM21_STUDY_NM), GXutil.rtrim( localUtil.format( AV16H_SRCH_TBM21_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(195);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_tbm21_study_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B711_WP01_SEARCH_STUDY.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_tbm21_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV15H_SRCH_TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15H_SRCH_TBM21_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_tbm21_study_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B711_WP01_SEARCH_STUDY.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_tbm21_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV18H_TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18H_TBM21_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(197);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_tbm21_study_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_186_1I2e( true) ;
      }
      else
      {
         wb_table2_186_1I2e( false) ;
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"center\"  style=\"vertical-align:top;height:100%\">") ;
         wb_table3_6_1I2( true) ;
      }
      else
      {
         wb_table3_6_1I2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1I2e( boolean wbgen )
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
         wb_table1_2_1I2e( true) ;
      }
      else
      {
         wb_table1_2_1I2e( false) ;
      }
   }

   public void wb_table3_6_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 800, 10, 0)) + "px" + ";" ;
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table4_14_1I2( true) ;
      }
      else
      {
         wb_table4_14_1I2( false) ;
      }
      return  ;
   }

   public void wb_table4_14_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0184"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0184"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0184"+"");
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
         wb_table3_6_1I2e( true) ;
      }
      else
      {
         wb_table3_6_1I2e( false) ;
      }
   }

   public void wb_table4_14_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_17_1I2( true) ;
      }
      else
      {
         wb_table5_17_1I2( false) ;
      }
      return  ;
   }

   public void wb_table5_17_1I2e( boolean wbgen )
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
         wb_table6_163_1I2( true) ;
      }
      else
      {
         wb_table6_163_1I2( false) ;
      }
      return  ;
   }

   public void wb_table6_163_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_14_1I2e( true) ;
      }
      else
      {
         wb_table4_14_1I2e( false) ;
      }
   }

   public void wb_table6_163_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 760, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:85px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "選択された試験", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellCell_sel_study_nm_Internalname+"\"  style=\"width:380px\" class=''>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tbm21_study_nm_Internalname, GXutil.rtrim( AV10D_TBM21_STUDY_NM), GXutil.rtrim( localUtil.format( AV10D_TBM21_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(168);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tbm21_study_nm_Jsonclick, 0, "Attribute_s", "background:transparent;", "", "", 1, edtavD_tbm21_study_nm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:85px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "権限", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellCell_sel_auth_cd_Internalname+"\"  class=''>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_auth_cd, cmbavD_auth_cd.getInternalname(), GXutil.rtrim( AV7D_AUTH_CD), 1, cmbavD_auth_cd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 180, "px", 0, "", "background:"+WebUtils.getHTMLColor( cmbavD_auth_cd.getIBackground())+";", "Attribute_s", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(172);\"", "", true, "HLP_B711_WP01_SEARCH_STUDY.htm");
         cmbavD_auth_cd.setValue( GXutil.rtrim( AV7D_AUTH_CD) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_auth_cd.getInternalname(), "Values", cmbavD_auth_cd.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"4\" >") ;
         wb_table7_175_1I2( true) ;
      }
      else
      {
         wb_table7_175_1I2( false) ;
      }
      return  ;
   }

   public void wb_table7_175_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_163_1I2e( true) ;
      }
      else
      {
         wb_table6_163_1I2e( false) ;
      }
   }

   public void wb_table7_175_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable11_Internalname, tblTable11_Internalname, "", "Table", 0, "center", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, "OK", "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_OK\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_175_1I2e( true) ;
      }
      else
      {
         wb_table7_175_1I2e( false) ;
      }
   }

   public void wb_table5_17_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table8_20_1I2( true) ;
      }
      else
      {
         wb_table8_20_1I2( false) ;
      }
      return  ;
   }

   public void wb_table8_20_1I2e( boolean wbgen )
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
         httpContext.writeText( "<td style=\"height:20px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_46_1I2( true) ;
      }
      else
      {
         wb_table9_46_1I2( false) ;
      }
      return  ;
   }

   public void wb_table9_46_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table10_142_1I2( true) ;
      }
      else
      {
         wb_table10_142_1I2( false) ;
      }
      return  ;
   }

   public void wb_table10_142_1I2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"151\">") ;
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
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_sel_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm21_study_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm21_study_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 151 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_151 = (short)(nGXsfl_151_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV36GXV1 = nGXsfl_151_idx ;
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
         wb_table5_17_1I2e( true) ;
      }
      else
      {
         wb_table5_17_1I2e( false) ;
      }
   }

   public void wb_table10_142_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_grid_header_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "試験ID", "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:610px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "試験名", "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_142_1I2e( true) ;
      }
      else
      {
         wb_table10_142_1I2e( false) ;
      }
   }

   public void wb_table9_46_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_52_1I2( true) ;
      }
      else
      {
         wb_table11_52_1I2( false) ;
      }
      return  ;
   }

   public void wb_table11_52_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_46_1I2e( true) ;
      }
      else
      {
         wb_table9_46_1I2e( false) ;
      }
   }

   public void wb_table11_52_1I2( boolean wbgen )
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
         wb_table12_55_1I2( true) ;
      }
      else
      {
         wb_table12_55_1I2( false) ;
      }
      return  ;
   }

   public void wb_table12_55_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table13_61_1I2( true) ;
      }
      else
      {
         wb_table13_61_1I2( false) ;
      }
      return  ;
   }

   public void wb_table13_61_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_67_1I2( true) ;
      }
      else
      {
         wb_table14_67_1I2( false) ;
      }
      return  ;
   }

   public void wb_table14_67_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_73_1I2( true) ;
      }
      else
      {
         wb_table15_73_1I2( false) ;
      }
      return  ;
   }

   public void wb_table15_73_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_79_1I2( true) ;
      }
      else
      {
         wb_table16_79_1I2( false) ;
      }
      return  ;
   }

   public void wb_table16_79_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_85_1I2( true) ;
      }
      else
      {
         wb_table17_85_1I2( false) ;
      }
      return  ;
   }

   public void wb_table17_85_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_91_1I2( true) ;
      }
      else
      {
         wb_table18_91_1I2( false) ;
      }
      return  ;
   }

   public void wb_table18_91_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_97_1I2( true) ;
      }
      else
      {
         wb_table19_97_1I2( false) ;
      }
      return  ;
   }

   public void wb_table19_97_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_103_1I2( true) ;
      }
      else
      {
         wb_table20_103_1I2( false) ;
      }
      return  ;
   }

   public void wb_table20_103_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_109_1I2( true) ;
      }
      else
      {
         wb_table21_109_1I2( false) ;
      }
      return  ;
   }

   public void wb_table21_109_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_115_1I2( true) ;
      }
      else
      {
         wb_table22_115_1I2( false) ;
      }
      return  ;
   }

   public void wb_table22_115_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_121_1I2( true) ;
      }
      else
      {
         wb_table23_121_1I2( false) ;
      }
      return  ;
   }

   public void wb_table23_121_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_127_1I2( true) ;
      }
      else
      {
         wb_table24_127_1I2( false) ;
      }
      return  ;
   }

   public void wb_table24_127_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_133_1I2( true) ;
      }
      else
      {
         wb_table25_133_1I2( false) ;
      }
      return  ;
   }

   public void wb_table25_133_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_52_1I2e( true) ;
      }
      else
      {
         wb_table11_52_1I2e( false) ;
      }
   }

   public void wb_table25_133_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_133_1I2e( true) ;
      }
      else
      {
         wb_table25_133_1I2e( false) ;
      }
   }

   public void wb_table24_127_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_127_1I2e( true) ;
      }
      else
      {
         wb_table24_127_1I2e( false) ;
      }
   }

   public void wb_table23_121_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_121_1I2e( true) ;
      }
      else
      {
         wb_table23_121_1I2e( false) ;
      }
   }

   public void wb_table22_115_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_115_1I2e( true) ;
      }
      else
      {
         wb_table22_115_1I2e( false) ;
      }
   }

   public void wb_table21_109_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_109_1I2e( true) ;
      }
      else
      {
         wb_table21_109_1I2e( false) ;
      }
   }

   public void wb_table20_103_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_103_1I2e( true) ;
      }
      else
      {
         wb_table20_103_1I2e( false) ;
      }
   }

   public void wb_table19_97_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_97_1I2e( true) ;
      }
      else
      {
         wb_table19_97_1I2e( false) ;
      }
   }

   public void wb_table18_91_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_91_1I2e( true) ;
      }
      else
      {
         wb_table18_91_1I2e( false) ;
      }
   }

   public void wb_table17_85_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_85_1I2e( true) ;
      }
      else
      {
         wb_table17_85_1I2e( false) ;
      }
   }

   public void wb_table16_79_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_79_1I2e( true) ;
      }
      else
      {
         wb_table16_79_1I2e( false) ;
      }
   }

   public void wb_table15_73_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_73_1I2e( true) ;
      }
      else
      {
         wb_table15_73_1I2e( false) ;
      }
   }

   public void wb_table14_67_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_67_1I2e( true) ;
      }
      else
      {
         wb_table14_67_1I2e( false) ;
      }
   }

   public void wb_table13_61_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_61_1I2e( true) ;
      }
      else
      {
         wb_table13_61_1I2e( false) ;
      }
   }

   public void wb_table12_55_1I2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_55_1I2e( true) ;
      }
      else
      {
         wb_table12_55_1I2e( false) ;
      }
   }

   public void wb_table8_20_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 760, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "TableForm_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:85px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "試験ID", "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:110px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_srch_tbm21_study_id_Internalname, GXutil.rtrim( AV8D_SRCH_TBM21_STUDY_ID), GXutil.rtrim( localUtil.format( AV8D_SRCH_TBM21_STUDY_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_srch_tbm21_study_id_Jsonclick, 0, "AttributeNum", "background:"+WebUtils.getHTMLColor( edtavD_srch_tbm21_study_id_Backcolor)+";", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:85px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "試験名", "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock_s", 0, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_151_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_srch_tbm21_study_nm_Internalname, GXutil.rtrim( AV9D_SRCH_TBM21_STUDY_NM), GXutil.rtrim( localUtil.format( AV9D_SRCH_TBM21_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_srch_tbm21_study_nm_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, 1, 0, "text", "", 60, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"4\" >") ;
         wb_table26_32_1I2( true) ;
      }
      else
      {
         wb_table26_32_1I2( false) ;
      }
      return  ;
   }

   public void wb_table26_32_1I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_20_1I2e( true) ;
      }
      else
      {
         wb_table8_20_1I2e( false) ;
      }
   }

   public void wb_table26_32_1I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "center", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "検索", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, "クリア", "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B711_WP01_SEARCH_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_32_1I2e( true) ;
      }
      else
      {
         wb_table26_32_1I2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV19P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513251329");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b711_wp01_search_study.js", "?202071513251329");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1512( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_151_idx ;
      edtavCtltbm21_study_id_Internalname = "CTLTBM21_STUDY_ID_"+sGXsfl_151_idx ;
      edtavCtltbm21_study_nm_Internalname = "CTLTBM21_STUDY_NM_"+sGXsfl_151_idx ;
   }

   public void subsflControlProps_fel_1512( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_151_fel_idx ;
      edtavCtltbm21_study_id_Internalname = "CTLTBM21_STUDY_ID_"+sGXsfl_151_fel_idx ;
      edtavCtltbm21_study_nm_Internalname = "CTLTBM21_STUDY_NM_"+sGXsfl_151_fel_idx ;
   }

   public void sendrow_1512( )
   {
      subsflControlProps_1512( ) ;
      wb1I0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_151_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_151_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_151_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_151_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_151_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_151_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:30px;width:45px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_SEL\\'."+sGXsfl_151_idx+"'","font-family:'ＭＳ Ｐゴシック'; font-size:9.0pt; font-weight:normal; font-style:normal;","TextBlockBtn040",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:90px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm21_study_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id(), (byte)(10), (byte)(0), ".", "")),((edtavCtltbm21_study_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id()), "ZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm21_study_id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm21_study_id_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(151),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:610px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm21_study_nm_Internalname,GXutil.rtrim( ((SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)AV24W_B711_SD01_SEARCH_STUDY_LIST.elementAt(-1+AV36GXV1)).getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm21_study_nm_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm21_study_nm_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(151),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
               if ( ((int)((nGXsfl_151_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_151_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_151_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_151_idx+1)) ;
         sGXsfl_151_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_151_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1512( ) ;
      }
      /* End function sendrow_1512 */
   }

   public void init_default_properties( )
   {
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtavD_srch_tbm21_study_id_Internalname = "vD_SRCH_TBM21_STUDY_ID" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtavD_srch_tbm21_study_nm_Internalname = "vD_SRCH_TBM21_STUDY_NM" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      tblTable10_Internalname = "TABLE10" ;
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
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable4_Internalname = "TABLE4" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtavD_tbm21_study_nm_Internalname = "vD_TBM21_STUDY_NM" ;
      cellCell_sel_study_nm_Internalname = "CELL_SEL_STUDY_NM" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      cmbavD_auth_cd.setInternalname( "vD_AUTH_CD" );
      cellCell_sel_auth_cd_Internalname = "CELL_SEL_AUTH_CD" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      tblTable11_Internalname = "TABLE11" ;
      tblTable5_Internalname = "TABLE5" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_dmflg_Internalname = "vH_DMFLG" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_srch_tbm21_study_nm_Internalname = "vH_SRCH_TBM21_STUDY_NM" ;
      edtavH_srch_tbm21_study_id_Internalname = "vH_SRCH_TBM21_STUDY_ID" ;
      edtavH_tbm21_study_id_Internalname = "vH_TBM21_STUDY_ID" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavCtltbm21_study_nm_Jsonclick = "" ;
      edtavCtltbm21_study_id_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      edtavD_srch_tbm21_study_nm_Jsonclick = "" ;
      edtavD_srch_tbm21_study_id_Jsonclick = "" ;
      edtavD_srch_tbm21_study_id_Backstyle = (byte)(-1) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltbm21_study_nm_Enabled = 0 ;
      edtavCtltbm21_study_id_Enabled = 0 ;
      lblBtn_sel_Caption = "選択" ;
      cmbavD_auth_cd.setJsonclick( "" );
      cmbavD_auth_cd.setBackstyle( (byte)(-1) );
      edtavD_tbm21_study_nm_Jsonclick = "" ;
      edtavD_tbm21_study_nm_Enabled = 1 ;
      edtavH_tbm21_study_id_Jsonclick = "" ;
      edtavH_srch_tbm21_study_id_Jsonclick = "" ;
      edtavH_srch_tbm21_study_nm_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavH_dmflg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "TXT_REC_CNT" ;
      tblTbl_grid_header_Visible = 1 ;
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
      cmbavD_auth_cd.setIBackground( (int)(0xFFFFFF) );
      edtavD_srch_tbm21_study_id_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Width = 100 ;
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
                  /* Execute user subroutine: S262 */
                  S262 ();
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
      AV24W_B711_SD01_SEARCH_STUDY_LIST = new GxObjectCollection(SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem.class, "B711_SD01_SEARCH_STUDY_LIST.B711_SD01_SEARCH_STUDY_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV11H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV41Pgmname = "" ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      A367TBM21_STUDY_NM = "" ;
      A369TBM21_DEL_FLG = "" ;
      A108TBM23_USER_ID = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      A385TBM23_DEL_FLG = "" ;
      AV22W_A821_JS = "" ;
      A13TAM04_AUTH_CD = "" ;
      AV23W_AUTH_CD = "" ;
      A215TAM04_DEL_FLG = "" ;
      A285TAM04_AUTH_NM = "" ;
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
      edtavCtltbm21_study_id_Internalname = "" ;
      edtavCtltbm21_study_nm_Internalname = "" ;
      GXDecQS = "" ;
      AV7D_AUTH_CD = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV40Pgmdesc = "" ;
      AV8D_SRCH_TBM21_STUDY_ID = "" ;
      AV9D_SRCH_TBM21_STUDY_NM = "" ;
      AV10D_TBM21_STUDY_NM = "" ;
      AV17H_SRCH_FLG = "" ;
      AV12H_DMFLG = "" ;
      AV13H_INIT_FLG = "" ;
      AV14H_KNGN_FLG = "" ;
      AV16H_SRCH_TBM21_STUDY_NM = "" ;
      AV5C_APP_ID = "" ;
      AV6C_GAMEN_TITLE = "" ;
      AV29W_MSG = "" ;
      AV30W_SESSION = httpContext.getWebSession();
      scmdbuf = "" ;
      lV16H_SRCH_TBM21_STUDY_NM = "" ;
      A607TBM21_STATUS = "" ;
      H001I2_A369TBM21_DEL_FLG = new String[] {""} ;
      H001I2_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H001I2_A607TBM21_STATUS = new String[] {""} ;
      H001I2_n607TBM21_STATUS = new boolean[] {false} ;
      H001I2_A367TBM21_STUDY_NM = new String[] {""} ;
      H001I2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H001I2_A63TBM21_STUDY_ID = new long[1] ;
      AV32W_STUDY_NM = "" ;
      H001I3_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      H001I3_A108TBM23_USER_ID = new String[] {""} ;
      H001I3_A107TBM23_STUDY_ID = new long[1] ;
      AV25W_B711_SD01_SEARCH_STUDY_LIST_Item = new SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem(remoteHandle, context);
      H001I4_A385TBM23_DEL_FLG = new String[] {""} ;
      H001I4_n385TBM23_DEL_FLG = new boolean[] {false} ;
      H001I4_A108TBM23_USER_ID = new String[] {""} ;
      H001I4_A107TBM23_STUDY_ID = new long[1] ;
      H001I4_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      H001I5_A215TAM04_DEL_FLG = new String[] {""} ;
      H001I5_n215TAM04_DEL_FLG = new boolean[] {false} ;
      H001I5_A13TAM04_AUTH_CD = new String[] {""} ;
      H001I5_A285TAM04_AUTH_NM = new String[] {""} ;
      H001I5_n285TAM04_AUTH_NM = new boolean[] {false} ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV27W_ERRCD = "" ;
      AV21W_A819_JS = "" ;
      GXv_SdtA_PAGING_SDT4 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock48_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock32_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
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
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblBtn_sel_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblBtn_sel_Jsonclick = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b711_wp01_search_study__default(),
         new Object[] {
             new Object[] {
            H001I2_A369TBM21_DEL_FLG, H001I2_n369TBM21_DEL_FLG, H001I2_A607TBM21_STATUS, H001I2_n607TBM21_STATUS, H001I2_A367TBM21_STUDY_NM, H001I2_n367TBM21_STUDY_NM, H001I2_A63TBM21_STUDY_ID
            }
            , new Object[] {
            H001I3_A109TBM23_STYDY_AUTH_CD, H001I3_A108TBM23_USER_ID, H001I3_A107TBM23_STUDY_ID
            }
            , new Object[] {
            H001I4_A385TBM23_DEL_FLG, H001I4_n385TBM23_DEL_FLG, H001I4_A108TBM23_USER_ID, H001I4_A107TBM23_STUDY_ID, H001I4_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            H001I5_A215TAM04_DEL_FLG, H001I5_n215TAM04_DEL_FLG, H001I5_A13TAM04_AUTH_CD, H001I5_A285TAM04_AUTH_NM, H001I5_n285TAM04_AUTH_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV41Pgmname = "B711_WP01_SEARCH_STUDY" ;
      AV40Pgmdesc = "試験検索・権限選択画面" ;
      /* GeneXus formulas. */
      AV41Pgmname = "B711_WP01_SEARCH_STUDY" ;
      AV40Pgmdesc = "試験検索・権限選択画面" ;
      Gx_err = (short)(0) ;
      edtavCtltbm21_study_id_Enabled = 0 ;
      edtavCtltbm21_study_nm_Enabled = 0 ;
      edtavD_tbm21_study_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV19P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV19P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavD_srch_tbm21_study_id_Backstyle ;
   private short nRC_GXsfl_151 ;
   private short nGXsfl_151_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV36GXV1 ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_151_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_151_fel_idx=1 ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int subGrid1_Width ;
   private int edtavCtltbm21_study_id_Enabled ;
   private int edtavCtltbm21_study_nm_Enabled ;
   private int edtavD_tbm21_study_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int cellCell_sel_study_nm_Backcolor ;
   private int cellCell_sel_auth_cd_Backcolor ;
   private int edtavD_srch_tbm21_study_id_Backcolor ;
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
   private int tblTbl_grid_header_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long A63TBM21_STUDY_ID ;
   private long A107TBM23_STUDY_ID ;
   private long GRID1_nRecordCount ;
   private long AV15H_SRCH_TBM21_STUDY_ID ;
   private long AV18H_TBM21_STUDY_ID ;
   private long GRID1_nCurrentRecord ;
   private long AV31W_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_151_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV41Pgmname ;
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
   private String edtavCtltbm21_study_id_Internalname ;
   private String edtavCtltbm21_study_nm_Internalname ;
   private String GXDecQS ;
   private String AV40Pgmdesc ;
   private String edtavD_tbm21_study_nm_Internalname ;
   private String edtavD_srch_tbm21_study_id_Internalname ;
   private String edtavD_srch_tbm21_study_nm_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_dmflg_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_srch_tbm21_study_nm_Internalname ;
   private String edtavH_srch_tbm21_study_id_Internalname ;
   private String edtavH_tbm21_study_id_Internalname ;
   private String sGXsfl_151_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String cellCell_sel_study_nm_Internalname ;
   private String cellCell_sel_auth_cd_Internalname ;
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
   private String tblTbl_grid_header_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_dmflg_Jsonclick ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_srch_tbm21_study_nm_Jsonclick ;
   private String edtavH_srch_tbm21_study_id_Jsonclick ;
   private String edtavH_tbm21_study_id_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable5_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtavD_tbm21_study_nm_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String tblTable11_Internalname ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String lblBtn_sel_Caption ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
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
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtavD_srch_tbm21_study_id_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtavD_srch_tbm21_study_nm_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String lblBtn_sel_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String lblBtn_sel_Jsonclick ;
   private String ROClassString ;
   private String edtavCtltbm21_study_id_Jsonclick ;
   private String edtavCtltbm21_study_nm_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV28W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean gx_BV151 ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n385TBM23_DEL_FLG ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n285TAM04_AUTH_NM ;
   private String A367TBM21_STUDY_NM ;
   private String A369TBM21_DEL_FLG ;
   private String A108TBM23_USER_ID ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A385TBM23_DEL_FLG ;
   private String AV22W_A821_JS ;
   private String A13TAM04_AUTH_CD ;
   private String AV23W_AUTH_CD ;
   private String A215TAM04_DEL_FLG ;
   private String A285TAM04_AUTH_NM ;
   private String AV7D_AUTH_CD ;
   private String AV8D_SRCH_TBM21_STUDY_ID ;
   private String AV9D_SRCH_TBM21_STUDY_NM ;
   private String AV10D_TBM21_STUDY_NM ;
   private String AV17H_SRCH_FLG ;
   private String AV12H_DMFLG ;
   private String AV13H_INIT_FLG ;
   private String AV14H_KNGN_FLG ;
   private String AV16H_SRCH_TBM21_STUDY_NM ;
   private String AV5C_APP_ID ;
   private String AV6C_GAMEN_TITLE ;
   private String AV29W_MSG ;
   private String lV16H_SRCH_TBM21_STUDY_NM ;
   private String A607TBM21_STATUS ;
   private String AV32W_STUDY_NM ;
   private String AV27W_ERRCD ;
   private String AV21W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice cmbavD_auth_cd ;
   private IDataStoreProvider pr_default ;
   private String[] H001I2_A369TBM21_DEL_FLG ;
   private boolean[] H001I2_n369TBM21_DEL_FLG ;
   private String[] H001I2_A607TBM21_STATUS ;
   private boolean[] H001I2_n607TBM21_STATUS ;
   private String[] H001I2_A367TBM21_STUDY_NM ;
   private boolean[] H001I2_n367TBM21_STUDY_NM ;
   private long[] H001I2_A63TBM21_STUDY_ID ;
   private String[] H001I3_A109TBM23_STYDY_AUTH_CD ;
   private String[] H001I3_A108TBM23_USER_ID ;
   private long[] H001I3_A107TBM23_STUDY_ID ;
   private String[] H001I4_A385TBM23_DEL_FLG ;
   private boolean[] H001I4_n385TBM23_DEL_FLG ;
   private String[] H001I4_A108TBM23_USER_ID ;
   private long[] H001I4_A107TBM23_STUDY_ID ;
   private String[] H001I4_A109TBM23_STYDY_AUTH_CD ;
   private String[] H001I5_A215TAM04_DEL_FLG ;
   private boolean[] H001I5_n215TAM04_DEL_FLG ;
   private String[] H001I5_A13TAM04_AUTH_CD ;
   private String[] H001I5_A285TAM04_AUTH_NM ;
   private boolean[] H001I5_n285TAM04_AUTH_NM ;
   private com.genexus.webpanels.WebSession AV30W_SESSION ;
   private GxObjectCollection AV24W_B711_SD01_SEARCH_STUDY_LIST ;
   private SdtA_PAGING_SDT AV11H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT4[] ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem AV25W_B711_SD01_SEARCH_STUDY_LIST_Item ;
}

final  class b711_wp01_search_study__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String A607TBM21_STATUS ,
                                          String AV8D_SRCH_TBM21_STUDY_ID ,
                                          String AV16H_SRCH_TBM21_STUDY_NM ,
                                          String AV12H_DMFLG ,
                                          long A63TBM21_STUDY_ID ,
                                          long AV15H_SRCH_TBM21_STUDY_ID ,
                                          String A367TBM21_STUDY_NM ,
                                          String A369TBM21_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [2] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT `TBM21_DEL_FLG`, `TBM21_STATUS`, `TBM21_STUDY_NM`, `TBM21_STUDY_ID` FROM `TBM21_STUDY`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM21_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV8D_SRCH_TBM21_STUDY_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBM21_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16H_SRCH_TBM21_STUDY_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM21_STUDY_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV12H_DMFLG, "1") == 0 )
      {
         sWhereString = sWhereString + " and (`TBM21_STATUS` IN ('0','1'))" ;
      }
      if ( GXutil.strcmp(AV12H_DMFLG, "0") == 0 )
      {
         sWhereString = sWhereString + " and (`TBM21_STATUS` IN ('1'))" ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM21_STUDY_ID` DESC" ;
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
            case 0 :
                  return conditional_H001I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001I3", "SELECT `TBM23_STYDY_AUTH_CD`, `TBM23_USER_ID`, `TBM23_STUDY_ID` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? and `TBM23_USER_ID` = ? ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001I4", "SELECT `TBM23_DEL_FLG`, `TBM23_USER_ID`, `TBM23_STUDY_ID`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE (`TBM23_STUDY_ID` = ? and `TBM23_USER_ID` = ?) AND (`TBM23_DEL_FLG` = '0') ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001I5", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE (`TAM04_AUTH_CD` = ?) AND (`TAM04_DEL_FLG` = '0') ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               return;
            case 3 :
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 100);
               }
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
      }
   }

}

