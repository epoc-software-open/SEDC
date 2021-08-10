/*
               File: b402_wp14_study_cdisc_item_list_impl
        Description: 試験登録（ドメイン変数一覧）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:29:54.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp14_study_cdisc_item_list_impl extends GXWebPanel
{
   public b402_wp14_study_cdisc_item_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp14_study_cdisc_item_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp14_study_cdisc_item_list_impl.class ));
   }

   public b402_wp14_study_cdisc_item_list_impl( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_dom_cd = new HTMLChoice();
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
            nRC_GXsfl_188 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_188_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_188_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_188, nGXsfl_188_idx, sGXsfl_188_idx) ;
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
            AV33P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33P_MOVE_KBN", GXutil.str( AV33P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV23P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23P_STUDY_ID", GXutil.ltrim( GXutil.str( AV23P_STUDY_ID, 10, 0)));
               AV22P_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22P_DOM_CD", AV22P_DOM_CD);
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
         pa1S2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1S2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1S2( ) ;
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
      httpContext.writeValue( "試験登録（ドメイン変数一覧）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513295478");
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
      GXEncryptionTmp = "b402_wp14_study_cdisc_item_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV33P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV22P_DOM_CD)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp14_study_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1S2( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV20H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DOM_CD", GXutil.rtrim( AV16H_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DOM_VAR_NM", GXutil.rtrim( AV17H_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_VAR_DESC", GXutil.rtrim( AV21H_VAR_DESC));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SORT_ASDC_KBN", GXutil.ltrim( localUtil.ntoc( AV34H_SORT_ASDC_KBN, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SORT_ITEM_KBN", GXutil.ltrim( localUtil.ntoc( AV35H_SORT_ITEM_KBN, (byte)(4), (byte)(0), ".", "")));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV15H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV15H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_188", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_188, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV23P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV40Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_TAM02_APP_ID", GXutil.rtrim( AV6C_TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_TAM02_APP_ID", GetHash( "", String.valueOf(AV6C_TAM02_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV33P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_CD", GXutil.rtrim( AV22P_DOM_CD));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM42_DOM_CD", GXutil.rtrim( A204TBM42_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM42_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A203TBM42_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM42_DOM_JNM", GXutil.rtrim( A906TBM42_DOM_JNM));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV26W_A821_JS));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV28W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "TBM43_DEL_FLG", GXutil.rtrim( A919TBM43_DEL_FLG));
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
      return "B402_WP14_STUDY_CDISC_ITEM_LIST" ;
   }

   public String getPgmdesc( )
   {
      return "試験登録（ドメイン変数一覧）" ;
   }

   public void wb1S0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1S2( true) ;
      }
      else
      {
         wb_table1_2_1S2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_210_1S2( true) ;
      }
      else
      {
         wb_table2_210_1S2( false) ;
      }
      return  ;
   }

   public void wb_table2_210_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1S2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験登録（ドメイン変数一覧）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0208") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0208", "");
         }
      }
      wbErr = false ;
      strup1S0( ) ;
   }

   public void ws1S2( )
   {
      start1S2( ) ;
      evt1S2( ) ;
   }

   public void evt1S2( )
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
                        /* Execute user event: e111S2 */
                        e111S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121S2 */
                        e121S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131S2 */
                        e131S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141S2 */
                        e141S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151S2 */
                        e151S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161S2 */
                        e161S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171S2 */
                        e171S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181S2 */
                        e181S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191S2 */
                        e191S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201S2 */
                        e201S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211S2 */
                        e211S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221S2 */
                        e221S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231S2 */
                        e231S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241S2 */
                        e241S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251S2 */
                        e251S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261S2 */
                        e261S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271S2 */
                        e271S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281S2 */
                        e281S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e291S2 */
                        e291S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT01_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e301S2 */
                        e301S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT01_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e311S2 */
                        e311S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT02_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e321S2 */
                        e321S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT02_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e331S2 */
                        e331S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT03_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e341S2 */
                        e341S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT03_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e351S2 */
                        e351S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT04_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e361S2 */
                        e361S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT04_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e371S2 */
                        e371S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT05_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e381S2 */
                        e381S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT05_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e391S2 */
                        e391S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT06_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e401S2 */
                        e401S2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT06_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e411S2 */
                        e411S2 ();
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
                        nGXsfl_188_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_188_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_188_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1882( ) ;
                        A201TBM43_DOM_CD = httpContext.cgiGet( edtTBM43_DOM_CD_Internalname) ;
                        A202TBM43_DOM_VAR_NM = httpContext.cgiGet( edtTBM43_DOM_VAR_NM_Internalname) ;
                        A910TBM43_VAR_DESC = httpContext.cgiGet( edtTBM43_VAR_DESC_Internalname) ;
                        n910TBM43_VAR_DESC = false ;
                        A918TBM43_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM43_ORDER_Internalname), ".", ",")) ;
                        n918TBM43_ORDER = false ;
                        A933TBM43_VERSION = httpContext.cgiGet( edtTBM43_VERSION_Internalname) ;
                        n933TBM43_VERSION = false ;
                        AV10D_GRD_DEL = httpContext.cgiGet( edtavD_grd_del_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0208") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0208", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0208") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0208", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e421S2 */
                              e421S2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e431S2 */
                              e431S2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e441S2 */
                              e441S2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e451S2 */
                              e451S2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 /* Set Refresh If H_srch_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV20H_SRCH_FLG) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_dom_cd Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_CD"), AV16H_DOM_CD) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_dom_var_nm Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_VAR_NM"), AV17H_DOM_VAR_NM) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_var_desc Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_VAR_DESC"), AV21H_VAR_DESC) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_sort_asdc_kbn Changed */
                                 if ( localUtil.ctol( httpContext.cgiGet( "GXH_vH_SORT_ASDC_KBN"), ".", ",") != AV34H_SORT_ASDC_KBN )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_sort_item_kbn Changed */
                                 if ( localUtil.ctol( httpContext.cgiGet( "GXH_vH_SORT_ITEM_KBN"), ".", ",") != AV35H_SORT_ITEM_KBN )
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
                  else if ( nCmpId == 208 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0208") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0208", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1S2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1S2( ) ;
         }
      }
   }

   public void pa1S2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp14_study_cdisc_item_list")), "b402_wp14_study_cdisc_item_list") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp14_study_cdisc_item_list"))) ;
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
                  AV33P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV33P_MOVE_KBN", GXutil.str( AV33P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV23P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV23P_STUDY_ID", GXutil.ltrim( GXutil.str( AV23P_STUDY_ID, 10, 0)));
                     AV22P_DOM_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV22P_DOM_CD", AV22P_DOM_CD);
                  }
               }
            }
         }
         cmbavD_dom_cd.setName( "vD_DOM_CD" );
         cmbavD_dom_cd.setWebtags( "" );
         if ( cmbavD_dom_cd.getItemCount() > 0 )
         {
            AV7D_DOM_CD = cmbavD_dom_cd.getValidValue(AV7D_DOM_CD) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_188 ,
                                 short nGXsfl_188_idx ,
                                 String sGXsfl_188_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1882( ) ;
      while ( nGXsfl_188_idx <= nRC_GXsfl_188 )
      {
         sendrow_1882( ) ;
         nGXsfl_188_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_188_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_188_idx+1)) ;
         sGXsfl_188_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_188_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1882( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1S2( ) ;
      /* End function Refresh */
   }

   public void rf1S2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1"));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(188) ;
      nGXsfl_188_idx = (short)(1) ;
      sGXsfl_188_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_188_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1882( ) ;
      nGXsfl_188_Refreshing = (short)(1) ;
      /* Execute user event: e431S2 */
      e431S2 ();
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
         subsflControlProps_1882( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV16H_DOM_CD ,
                                              AV17H_DOM_VAR_NM ,
                                              AV21H_VAR_DESC ,
                                              A201TBM43_DOM_CD ,
                                              A202TBM43_DOM_VAR_NM ,
                                              A910TBM43_VAR_DESC ,
                                              new Short(AV35H_SORT_ITEM_KBN) ,
                                              new Short(AV34H_SORT_ASDC_KBN) ,
                                              AV20H_SRCH_FLG ,
                                              new Long(A200TBM43_STUDY_ID) ,
                                              new Long(AV23P_STUDY_ID) },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.LONG, TypeConstants.LONG
                                              }
         });
         lV17H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV17H_DOM_VAR_NM), 50, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
         lV21H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV21H_VAR_DESC), 100, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
         /* Using cursor H001S2 */
         pr_default.execute(0, new Object[] {AV20H_SRCH_FLG, new Long(AV23P_STUDY_ID), AV16H_DOM_CD, lV17H_DOM_VAR_NM, lV21H_VAR_DESC, new Integer(GXPagingFrom2), new Long(GXPagingTo2)});
         nGXsfl_188_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A919TBM43_DEL_FLG = H001S2_A919TBM43_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A919TBM43_DEL_FLG", A919TBM43_DEL_FLG);
            n919TBM43_DEL_FLG = H001S2_n919TBM43_DEL_FLG[0] ;
            A200TBM43_STUDY_ID = H001S2_A200TBM43_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A200TBM43_STUDY_ID, 10, 0)));
            A933TBM43_VERSION = H001S2_A933TBM43_VERSION[0] ;
            n933TBM43_VERSION = H001S2_n933TBM43_VERSION[0] ;
            A918TBM43_ORDER = H001S2_A918TBM43_ORDER[0] ;
            n918TBM43_ORDER = H001S2_n918TBM43_ORDER[0] ;
            A910TBM43_VAR_DESC = H001S2_A910TBM43_VAR_DESC[0] ;
            n910TBM43_VAR_DESC = H001S2_n910TBM43_VAR_DESC[0] ;
            A202TBM43_DOM_VAR_NM = H001S2_A202TBM43_DOM_VAR_NM[0] ;
            A201TBM43_DOM_CD = H001S2_A201TBM43_DOM_CD[0] ;
            /* Execute user event: e441S2 */
            e441S2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(188) ;
         wb1S0( ) ;
      }
      nGXsfl_188_Refreshing = (short)(0) ;
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV16H_DOM_CD ,
                                           AV17H_DOM_VAR_NM ,
                                           AV21H_VAR_DESC ,
                                           A201TBM43_DOM_CD ,
                                           A202TBM43_DOM_VAR_NM ,
                                           A910TBM43_VAR_DESC ,
                                           new Short(AV35H_SORT_ITEM_KBN) ,
                                           new Short(AV34H_SORT_ASDC_KBN) ,
                                           AV20H_SRCH_FLG ,
                                           new Long(A200TBM43_STUDY_ID) ,
                                           new Long(AV23P_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV17H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV17H_DOM_VAR_NM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      lV21H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV21H_VAR_DESC), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
      /* Using cursor H001S3 */
      pr_default.execute(1, new Object[] {AV20H_SRCH_FLG, new Long(AV23P_STUDY_ID), AV16H_DOM_CD, lV17H_DOM_VAR_NM, lV21H_VAR_DESC});
      GRID1_nRecordCount = H001S3_AGRID1_nRecordCount[0] ;
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

   public void strup1S0( )
   {
      /* Before Start, stand alone formulas. */
      AV40Pgmname = "B402_WP14_STUDY_CDISC_ITEM_LIST" ;
      AV39Pgmdesc = "試験登録（ドメイン変数一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_del_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e421S2 */
      e421S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV15H_A_PAGING_SDT);
         /* Read variables values. */
         cmbavD_dom_cd.setName( cmbavD_dom_cd.getInternalname() );
         cmbavD_dom_cd.setValue( httpContext.cgiGet( cmbavD_dom_cd.getInternalname()) );
         AV7D_DOM_CD = httpContext.cgiGet( cmbavD_dom_cd.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         AV9D_DOM_VAR_NM = httpContext.cgiGet( edtavD_dom_var_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
         AV14D_VAR_DESC = httpContext.cgiGet( edtavD_var_desc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14D_VAR_DESC", AV14D_VAR_DESC);
         AV18H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_INIT_FLG", AV18H_INIT_FLG);
         AV20H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
         AV19H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_KNGN_FLG", AV19H_KNGN_FLG);
         AV16H_DOM_CD = httpContext.cgiGet( edtavH_dom_cd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_CD", AV16H_DOM_CD);
         AV17H_DOM_VAR_NM = httpContext.cgiGet( edtavH_dom_var_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
         AV21H_VAR_DESC = httpContext.cgiGet( edtavH_var_desc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_asdc_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_asdc_kbn_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SORT_ASDC_KBN");
            GX_FocusControl = edtavH_sort_asdc_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34H_SORT_ASDC_KBN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV34H_SORT_ASDC_KBN, 4, 0)));
         }
         else
         {
            AV34H_SORT_ASDC_KBN = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_sort_asdc_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV34H_SORT_ASDC_KBN, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_item_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_item_kbn_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SORT_ITEM_KBN");
            GX_FocusControl = edtavH_sort_item_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35H_SORT_ITEM_KBN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
         }
         else
         {
            AV35H_SORT_ITEM_KBN = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_sort_item_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_188 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_188"), ".", ",")) ;
         AV33P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV23P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV22P_DOM_CD = httpContext.cgiGet( "vP_DOM_CD") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0208") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0208", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV20H_SRCH_FLG) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_CD"), AV16H_DOM_CD) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DOM_VAR_NM"), AV17H_DOM_VAR_NM) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_VAR_DESC"), AV21H_VAR_DESC) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vH_SORT_ASDC_KBN"), ".", ",") != AV34H_SORT_ASDC_KBN )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vH_SORT_ITEM_KBN"), ".", ",") != AV35H_SORT_ITEM_KBN )
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
      /* Execute user event: e421S2 */
      e421S2 ();
      if (returnInSub) return;
   }

   public void e421S2( )
   {
      /* Start Routine */
      AV6C_TAM02_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_TAM02_APP_ID", AV6C_TAM02_APP_ID);
      AV5C_GAMEN_TITLE = AV39Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_GAMEN_TITLE", AV5C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV18H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_INIT_FLG", AV18H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV24W_A_LOGIN_SDT,AV6C_TAM02_APP_ID,AV5C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0208",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e431S2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV18H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         GX_FocusControl = edtavD_dom_var_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      AV18H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_INIT_FLG", AV18H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
   }

   private void e441S2( )
   {
      /* Grid1_Load Routine */
      if ( GXutil.strcmp(A919TBM43_DEL_FLG, "0") == 0 )
      {
         AV10D_GRD_DEL = "利用可能" ;
      }
      else if ( GXutil.strcmp(A919TBM43_DEL_FLG, "1") == 0 )
      {
         AV10D_GRD_DEL = "利用不可" ;
      }
      else
      {
         AV10D_GRD_DEL = "" ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(188) ;
      }
      sendrow_1882( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   public void e111S2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV19H_KNGN_FLG, "") )
      {
         AV31W_SESSION.setValue("B402_WP14_PAGE", GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp15_study_cdisc_item_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV16H_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("b402_wp15_study_cdisc_item_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e121S2( )
   {
      /* 'BTN_CSV' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV29W_MSG)==0) )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "ab402_pc27_study_cdisc_item_csv"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV16H_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV17H_DOM_VAR_NM)) + "," + GXutil.URLEncode(GXutil.rtrim(AV21H_VAR_DESC)) + "," + GXutil.URLEncode(GXutil.rtrim(AV29W_MSG)) ;
         httpContext.wjLoc = formatLink("ab402_pc27_study_cdisc_item_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(0) ;
         if ( ! (GXutil.strcmp("", AV29W_MSG)==0) )
         {
            httpContext.GX_msglist.addItem(AV29W_MSG);
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV29W_MSG);
      }
   }

   public void e131S2( )
   {
      /* 'BTN_SRCH' Routine */
      AV28W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      if ( ! AV28W_ERRFLG )
      {
         AV20H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
   }

   public void e141S2( )
   {
      /* 'BTN_CLER' Routine */
      AV35H_SORT_ITEM_KBN = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      AV34H_SORT_ASDC_KBN = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV34H_SORT_ASDC_KBN, 4, 0)));
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S242 */
      S242 ();
      if (returnInSub) return;
   }

   public void e451S2( )
   {
      /* 'BTN_SEL' Routine */
      AV31W_SESSION.setValue("B402_WP14_PAGE", GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp15_study_cdisc_item_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A201TBM43_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(A202TBM43_DOM_VAR_NM)) ;
      httpContext.wjLoc = formatLink("b402_wp15_study_cdisc_item_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e151S2( )
   {
      /* 'BTN_CAN' Routine */
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp12_study_domain_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp12_study_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H001S4 */
      pr_default.execute(2, new Object[] {new Long(AV23P_STUDY_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A63TBM21_STUDY_ID = H001S4_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H001S4_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H001S4_n367TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV33P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S282 */
         S282 ();
         if (returnInSub) return;
      }
      else
      {
         AV7D_DOM_CD = AV22P_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         AV20H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
   }

   public void S152( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavD_dom_cd.removeAllItems();
      cmbavD_dom_cd.addItem("", "", (short)(0));
      /* Using cursor H001S5 */
      pr_default.execute(3, new Object[] {new Long(AV23P_STUDY_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A203TBM42_STUDY_ID = H001S5_A203TBM42_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
         A906TBM42_DOM_JNM = H001S5_A906TBM42_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A906TBM42_DOM_JNM", A906TBM42_DOM_JNM);
         n906TBM42_DOM_JNM = H001S5_n906TBM42_DOM_JNM[0] ;
         A204TBM42_DOM_CD = H001S5_A204TBM42_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
         cmbavD_dom_cd.addItem(A204TBM42_DOM_CD, A204TBM42_DOM_CD+"："+A906TBM42_DOM_JNM, (short)(0));
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S242( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV31W_SESSION.setValue("B402_WP14_DOM_CD", AV16H_DOM_CD);
      AV31W_SESSION.setValue("B402_WP14_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      AV31W_SESSION.setValue("B402_WP14_VAR_DESC", AV21H_VAR_DESC);
      AV31W_SESSION.setValue("B402_WP14_SRCH_FLG", AV20H_SRCH_FLG);
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
   }

   public void S282( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV16H_DOM_CD = AV31W_SESSION.getValue("B402_WP14_DOM_CD") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_CD", AV16H_DOM_CD);
      AV17H_DOM_VAR_NM = AV31W_SESSION.getValue("B402_WP14_DOM_VAR_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      AV21H_VAR_DESC = AV31W_SESSION.getValue("B402_WP14_VAR_DESC") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
      AV7D_DOM_CD = AV16H_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV9D_DOM_VAR_NM = AV17H_DOM_VAR_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
      AV14D_VAR_DESC = AV21H_VAR_DESC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14D_VAR_DESC", AV14D_VAR_DESC);
      AV35H_SORT_ITEM_KBN = (short)(GXutil.lval( AV31W_SESSION.getValue("B402_WP14_SORT_ITEM_KBN"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      AV34H_SORT_ASDC_KBN = (short)(GXutil.lval( AV31W_SESSION.getValue("B402_WP14_SORT_ASDC_KBN"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV34H_SORT_ASDC_KBN, 4, 0)));
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV31W_SESSION.getValue("B402_WP14_PAGE"))) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      AV20H_SRCH_FLG = AV31W_SESSION.getValue("B402_WP14_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
   }

   public void S252( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV31W_SESSION.remove("B402_WP14_DOM_CD");
      AV31W_SESSION.remove("B402_WP14_DOM_VAR_NM");
      AV31W_SESSION.remove("B402_WP14_VAR_DESC");
      AV31W_SESSION.remove("B402_WP14_PAGE");
      AV31W_SESSION.remove("B402_WP14_SRCH_FLG");
      AV31W_SESSION.remove("B402_WP14_SORT_ITEM_KBN");
      AV31W_SESSION.remove("B402_WP14_SORT_ASDC_KBN");
   }

   public void S202( )
   {
      /* 'SUB_SESSION_SET_SORT' Routine */
      AV31W_SESSION.setValue("B402_WP14_SORT_ITEM_KBN", GXutil.trim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      AV31W_SESSION.setValue("B402_WP14_SORT_ASDC_KBN", GXutil.trim( GXutil.str( AV34H_SORT_ASDC_KBN, 4, 0)));
   }

   public void S232( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV16H_DOM_CD = AV7D_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_CD", AV16H_DOM_CD);
      AV17H_DOM_VAR_NM = AV9D_DOM_VAR_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      AV21H_VAR_DESC = AV14D_VAR_DESC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
   }

   public void S222( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void S292( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
   }

   public void S212( )
   {
      /* 'SUB_CSV_CHECK' Routine */
      AV43GXLvl443 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43GXLvl443", GXutil.str( AV43GXLvl443, 1, 0));
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV16H_DOM_CD ,
                                           AV17H_DOM_VAR_NM ,
                                           AV21H_VAR_DESC ,
                                           A201TBM43_DOM_CD ,
                                           A202TBM43_DOM_VAR_NM ,
                                           A910TBM43_VAR_DESC ,
                                           new Long(AV23P_STUDY_ID) ,
                                           new Long(A200TBM43_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV17H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV17H_DOM_VAR_NM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      lV21H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV21H_VAR_DESC), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
      /* Using cursor H001S6 */
      pr_default.execute(4, new Object[] {new Long(AV23P_STUDY_ID), AV16H_DOM_CD, lV17H_DOM_VAR_NM, lV21H_VAR_DESC});
      if ( Gx_err != 0 )
      {
         AV43GXLvl443 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43GXLvl443", GXutil.str( AV43GXLvl443, 1, 0));
      }
      while ( (pr_default.getStatus(4) != 101) )
      {
         A910TBM43_VAR_DESC = H001S6_A910TBM43_VAR_DESC[0] ;
         n910TBM43_VAR_DESC = H001S6_n910TBM43_VAR_DESC[0] ;
         A202TBM43_DOM_VAR_NM = H001S6_A202TBM43_DOM_VAR_NM[0] ;
         A201TBM43_DOM_CD = H001S6_A201TBM43_DOM_CD[0] ;
         A200TBM43_STUDY_ID = H001S6_A200TBM43_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A200TBM43_STUDY_ID, 10, 0)));
         AV43GXLvl443 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43GXLvl443", GXutil.str( AV43GXLvl443, 1, 0));
         AV29W_MSG = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV43GXLvl443 == 0 )
      {
         GXt_char1 = AV29W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         b402_wp14_study_cdisc_item_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV24W_A_LOGIN_SDT;
      GXv_char2[0] = AV27W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV24W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_wp14_study_cdisc_item_list_impl.this.AV27W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRCD", AV27W_ERRCD);
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
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
      AV7D_DOM_CD = AV22P_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV9D_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
      AV14D_VAR_DESC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14D_VAR_DESC", AV14D_VAR_DESC);
      AV16H_DOM_CD = AV22P_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_DOM_CD", AV16H_DOM_CD);
      AV17H_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_DOM_VAR_NM", AV17H_DOM_VAR_NM);
      AV21H_VAR_DESC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_VAR_DESC", AV21H_VAR_DESC);
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      AV20H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_SRCH_FLG", AV20H_SRCH_FLG);
      AV25W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_A819_JS", AV25W_A819_JS);
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
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
      if ( ! (GXutil.strcmp("", AV26W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV26W_A821_JS ;
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

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV19H_KNGN_FLG ;
      GXv_char4[0] = AV27W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_TAM02_APP_ID, GXv_char2, GXv_char4) ;
      b402_wp14_study_cdisc_item_list_impl.this.AV19H_KNGN_FLG = GXv_char2[0] ;
      b402_wp14_study_cdisc_item_list_impl.this.AV27W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_TAM02_APP_ID", AV6C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_KNGN_FLG", AV19H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRCD", AV27W_ERRCD);
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S302( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp14_study_cdisc_item_list");
   }

   public void e161S2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e171S2( )
   {
      /* 'PAGE_LAST' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e181S2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e191S2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e201S2( )
   {
      /* 'PAGE01' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211S2( )
   {
      /* 'PAGE02' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221S2( )
   {
      /* 'PAGE03' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231S2( )
   {
      /* 'PAGE04' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241S2( )
   {
      /* 'PAGE05' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251S2( )
   {
      /* 'PAGE06' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261S2( )
   {
      /* 'PAGE07' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271S2( )
   {
      /* 'PAGE08' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e281S2( )
   {
      /* 'PAGE09' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e291S2( )
   {
      /* 'PAGE10' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT5[0] = AV15H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT5) ;
      AV15H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT5[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV20H_SRCH_FLG, "1") == 0 ) && ! AV28W_ERRFLG )
         {
            GXt_char1 = AV29W_MSG ;
            GXv_char4[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
            b402_wp14_study_cdisc_item_list_impl.this.GXt_char1 = GXv_char4[0] ;
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

   public void S162( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      lblTxt_btn_reg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_reg2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      GXt_boolean6 = false ;
      GXv_boolean7[0] = GXt_boolean6 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV19H_KNGN_FLG, "", GXv_boolean7) ;
      b402_wp14_study_cdisc_item_list_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_KNGN_FLG", AV19H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean6 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      if ( ( lblTxt_btn_reg_Visible == ( 0 )) )
      {
         lblTxt_btn_reg2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      }
   }

   public void e301S2( )
   {
      /* 'SORT01_ASC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
   }

   public void e311S2( )
   {
      /* 'SORT01_DESC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
   }

   public void e321S2( )
   {
      /* 'SORT02_ASC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
   }

   public void e331S2( )
   {
      /* 'SORT02_DESC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
   }

   public void e341S2( )
   {
      /* 'SORT03_ASC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
   }

   public void e351S2( )
   {
      /* 'SORT03_DESC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
   }

   public void e361S2( )
   {
      /* 'SORT04_ASC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
   }

   public void e371S2( )
   {
      /* 'SORT04_DESC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
   }

   public void e381S2( )
   {
      /* 'SORT05_ASC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
   }

   public void e391S2( )
   {
      /* 'SORT05_DESC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
   }

   public void e401S2( )
   {
      /* 'SORT06_ASC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
   }

   public void e411S2( )
   {
      /* 'SORT06_DESC' Routine */
      AV35H_SORT_ITEM_KBN = (short)(6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
   }

   public void S262( )
   {
      /* 'SUB_SORT_AS_RPOC' Routine */
      AV34H_SORT_ASDC_KBN = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV34H_SORT_ASDC_KBN, 4, 0)));
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S272( )
   {
      /* 'SUB_SORT_DESC_RPOC' Routine */
      AV34H_SORT_ASDC_KBN = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV34H_SORT_ASDC_KBN, 4, 0)));
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'SUB_EDIT_SORT' Routine */
      lblTxt_sort01_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_asc_Internalname, "Class", lblTxt_sort01_asc_Class);
      lblTxt_sort01_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_desc_Internalname, "Class", lblTxt_sort01_desc_Class);
      lblTxt_sort02_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_asc_Internalname, "Class", lblTxt_sort02_asc_Class);
      lblTxt_sort02_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_desc_Internalname, "Class", lblTxt_sort02_desc_Class);
      lblTxt_sort03_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_asc_Internalname, "Class", lblTxt_sort03_asc_Class);
      lblTxt_sort03_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_desc_Internalname, "Class", lblTxt_sort03_desc_Class);
      lblTxt_sort04_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort04_asc_Internalname, "Class", lblTxt_sort04_asc_Class);
      lblTxt_sort04_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort04_desc_Internalname, "Class", lblTxt_sort04_desc_Class);
      lblTxt_sort05_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort05_asc_Internalname, "Class", lblTxt_sort05_asc_Class);
      lblTxt_sort05_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort05_desc_Internalname, "Class", lblTxt_sort05_desc_Class);
      lblTxt_sort06_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort06_asc_Internalname, "Class", lblTxt_sort06_asc_Class);
      lblTxt_sort06_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort06_desc_Internalname, "Class", lblTxt_sort06_desc_Class);
      if ( ( AV35H_SORT_ITEM_KBN == 1 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort01_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_asc_Internalname, "Class", lblTxt_sort01_asc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 1 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort01_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_desc_Internalname, "Class", lblTxt_sort01_desc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 2 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort02_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_asc_Internalname, "Class", lblTxt_sort02_asc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 2 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort02_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_desc_Internalname, "Class", lblTxt_sort02_desc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 3 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort03_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_asc_Internalname, "Class", lblTxt_sort03_asc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 3 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort03_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_desc_Internalname, "Class", lblTxt_sort03_desc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 4 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort04_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort04_asc_Internalname, "Class", lblTxt_sort04_asc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 4 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort04_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort04_desc_Internalname, "Class", lblTxt_sort04_desc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 5 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort05_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort05_asc_Internalname, "Class", lblTxt_sort05_asc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 5 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort05_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort05_desc_Internalname, "Class", lblTxt_sort05_desc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 6 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort06_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort06_asc_Internalname, "Class", lblTxt_sort06_asc_Class);
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 6 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort06_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort06_desc_Internalname, "Class", lblTxt_sort06_desc_Class);
      }
   }

   public void wb_table2_210_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV18H_INIT_FLG), GXutil.rtrim( localUtil.format( AV18H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV20H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV20H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV19H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV19H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_cd_Internalname, GXutil.rtrim( AV16H_DOM_CD), GXutil.rtrim( localUtil.format( AV16H_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(217);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_dom_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_var_nm_Internalname, GXutil.rtrim( AV17H_DOM_VAR_NM), GXutil.rtrim( localUtil.format( AV17H_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(218);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_dom_var_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_var_desc_Internalname, GXutil.rtrim( AV21H_VAR_DESC), GXutil.rtrim( localUtil.format( AV21H_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_var_desc_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         wb_table3_220_1S2( true) ;
      }
      else
      {
         wb_table3_220_1S2( false) ;
      }
      return  ;
   }

   public void wb_table3_220_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_228_1S2( true) ;
      }
      else
      {
         wb_table4_228_1S2( false) ;
      }
      return  ;
   }

   public void wb_table4_228_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_210_1S2e( true) ;
      }
      else
      {
         wb_table2_210_1S2e( false) ;
      }
   }

   public void wb_table4_228_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sort_asdc_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV34H_SORT_ASDC_KBN, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34H_SORT_ASDC_KBN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sort_asdc_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sort_item_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV35H_SORT_ITEM_KBN, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35H_SORT_ITEM_KBN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sort_item_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_228_1S2e( true) ;
      }
      else
      {
         wb_table4_228_1S2e( false) ;
      }
   }

   public void wb_table3_220_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(225);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_220_1S2e( true) ;
      }
      else
      {
         wb_table3_220_1S2e( false) ;
      }
   }

   public void wb_table1_2_1S2( boolean wbgen )
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
         wb_table5_6_1S2( true) ;
      }
      else
      {
         wb_table5_6_1S2( false) ;
      }
      return  ;
   }

   public void wb_table5_6_1S2e( boolean wbgen )
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
         wb_table1_2_1S2e( true) ;
      }
      else
      {
         wb_table1_2_1S2e( false) ;
      }
   }

   public void wb_table5_6_1S2( boolean wbgen )
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
         wb_table6_12_1S2( true) ;
      }
      else
      {
         wb_table6_12_1S2( false) ;
      }
      return  ;
   }

   public void wb_table6_12_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table7_23_1S2( true) ;
      }
      else
      {
         wb_table7_23_1S2( false) ;
      }
      return  ;
   }

   public void wb_table7_23_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0208"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0208"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0208"+"");
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
         wb_table5_6_1S2e( true) ;
      }
      else
      {
         wb_table5_6_1S2e( false) ;
      }
   }

   public void wb_table7_23_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_26_1S2( true) ;
      }
      else
      {
         wb_table8_26_1S2( false) ;
      }
      return  ;
   }

   public void wb_table8_26_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_23_1S2e( true) ;
      }
      else
      {
         wb_table7_23_1S2e( false) ;
      }
   }

   public void wb_table8_26_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table9_29_1S2( true) ;
      }
      else
      {
         wb_table9_29_1S2( false) ;
      }
      return  ;
   }

   public void wb_table9_29_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:20px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_60_1S2( true) ;
      }
      else
      {
         wb_table10_60_1S2( false) ;
      }
      return  ;
   }

   public void wb_table10_60_1S2e( boolean wbgen )
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
         wb_table11_156_1S2( true) ;
      }
      else
      {
         wb_table11_156_1S2( false) ;
      }
      return  ;
   }

   public void wb_table11_156_1S2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"188\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridTM-1", 0, "", "", 0, 1, sStyleString, "none", 0);
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
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1");
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
            Grid1Column.AddObjectProperty("Value", lblBtn_sel_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A201TBM43_DOM_CD));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A202TBM43_DOM_VAR_NM));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A910TBM43_VAR_DESC));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A918TBM43_ORDER, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A933TBM43_VERSION));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV10D_GRD_DEL));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_del_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 188 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_188 = (short)(nGXsfl_188_idx-1) ;
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
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_26_1S2e( true) ;
      }
      else
      {
         wb_table8_26_1S2e( false) ;
      }
   }

   public void wb_table11_156_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_grid_header_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_159_1S2( true) ;
      }
      else
      {
         wb_table12_159_1S2( false) ;
      }
      return  ;
   }

   public void wb_table12_159_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_156_1S2e( true) ;
      }
      else
      {
         wb_table11_156_1S2e( false) ;
      }
   }

   public void wb_table12_159_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_in_grid_header_Internalname, tblTbl_in_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:160px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "ドメインコード", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort01_desc_Internalname, "▼", "", "", lblTxt_sort01_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT01_DESC\\'."+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort01_desc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort01_asc_Internalname, "▲", "", "", lblTxt_sort01_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT01_ASC\\'."+"'", "", lblTxt_sort01_asc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "ドメイン変数名", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort02_desc_Internalname, "▼", "", "", lblTxt_sort02_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT02_DESC\\'."+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort02_desc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort02_asc_Internalname, "▲", "", "", lblTxt_sort02_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT02_ASC\\'."+"'", "", lblTxt_sort02_asc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "ドメイン変数説明", "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort03_desc_Internalname, "▼", "", "", lblTxt_sort03_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT03_DESC\\'."+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort03_desc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort03_asc_Internalname, "▲", "", "", lblTxt_sort03_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT03_ASC\\'."+"'", "", lblTxt_sort03_asc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "表示順", "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort04_desc_Internalname, "▼", "", "", lblTxt_sort04_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT04_DESC\\'."+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort04_desc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort04_asc_Internalname, "▲", "", "", lblTxt_sort04_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT04_ASC\\'."+"'", "", lblTxt_sort04_asc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "Version", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort05_desc_Internalname, "▼", "", "", lblTxt_sort05_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT05_DESC\\'."+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort05_desc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort05_asc_Internalname, "▲", "", "", lblTxt_sort05_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT05_ASC\\'."+"'", "", lblTxt_sort05_asc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "削除", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort06_desc_Internalname, "▼", "", "", lblTxt_sort06_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT06_DESC\\'."+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort06_desc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort06_asc_Internalname, "▲", "", "", lblTxt_sort06_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT06_ASC\\'."+"'", "", lblTxt_sort06_asc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_159_1S2e( true) ;
      }
      else
      {
         wb_table12_159_1S2e( false) ;
      }
   }

   public void wb_table10_60_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_66_1S2( true) ;
      }
      else
      {
         wb_table13_66_1S2( false) ;
      }
      return  ;
   }

   public void wb_table13_66_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_60_1S2e( true) ;
      }
      else
      {
         wb_table10_60_1S2e( false) ;
      }
   }

   public void wb_table13_66_1S2( boolean wbgen )
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
         wb_table14_69_1S2( true) ;
      }
      else
      {
         wb_table14_69_1S2( false) ;
      }
      return  ;
   }

   public void wb_table14_69_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table15_75_1S2( true) ;
      }
      else
      {
         wb_table15_75_1S2( false) ;
      }
      return  ;
   }

   public void wb_table15_75_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_81_1S2( true) ;
      }
      else
      {
         wb_table16_81_1S2( false) ;
      }
      return  ;
   }

   public void wb_table16_81_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_87_1S2( true) ;
      }
      else
      {
         wb_table17_87_1S2( false) ;
      }
      return  ;
   }

   public void wb_table17_87_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_93_1S2( true) ;
      }
      else
      {
         wb_table18_93_1S2( false) ;
      }
      return  ;
   }

   public void wb_table18_93_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_99_1S2( true) ;
      }
      else
      {
         wb_table19_99_1S2( false) ;
      }
      return  ;
   }

   public void wb_table19_99_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_105_1S2( true) ;
      }
      else
      {
         wb_table20_105_1S2( false) ;
      }
      return  ;
   }

   public void wb_table20_105_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_111_1S2( true) ;
      }
      else
      {
         wb_table21_111_1S2( false) ;
      }
      return  ;
   }

   public void wb_table21_111_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_117_1S2( true) ;
      }
      else
      {
         wb_table22_117_1S2( false) ;
      }
      return  ;
   }

   public void wb_table22_117_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_123_1S2( true) ;
      }
      else
      {
         wb_table23_123_1S2( false) ;
      }
      return  ;
   }

   public void wb_table23_123_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_129_1S2( true) ;
      }
      else
      {
         wb_table24_129_1S2( false) ;
      }
      return  ;
   }

   public void wb_table24_129_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_135_1S2( true) ;
      }
      else
      {
         wb_table25_135_1S2( false) ;
      }
      return  ;
   }

   public void wb_table25_135_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_141_1S2( true) ;
      }
      else
      {
         wb_table26_141_1S2( false) ;
      }
      return  ;
   }

   public void wb_table26_141_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table27_147_1S2( true) ;
      }
      else
      {
         wb_table27_147_1S2( false) ;
      }
      return  ;
   }

   public void wb_table27_147_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_66_1S2e( true) ;
      }
      else
      {
         wb_table13_66_1S2e( false) ;
      }
   }

   public void wb_table27_147_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_147_1S2e( true) ;
      }
      else
      {
         wb_table27_147_1S2e( false) ;
      }
   }

   public void wb_table26_141_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_141_1S2e( true) ;
      }
      else
      {
         wb_table26_141_1S2e( false) ;
      }
   }

   public void wb_table25_135_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_135_1S2e( true) ;
      }
      else
      {
         wb_table25_135_1S2e( false) ;
      }
   }

   public void wb_table24_129_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_129_1S2e( true) ;
      }
      else
      {
         wb_table24_129_1S2e( false) ;
      }
   }

   public void wb_table23_123_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_123_1S2e( true) ;
      }
      else
      {
         wb_table23_123_1S2e( false) ;
      }
   }

   public void wb_table22_117_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_117_1S2e( true) ;
      }
      else
      {
         wb_table22_117_1S2e( false) ;
      }
   }

   public void wb_table21_111_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_111_1S2e( true) ;
      }
      else
      {
         wb_table21_111_1S2e( false) ;
      }
   }

   public void wb_table20_105_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_105_1S2e( true) ;
      }
      else
      {
         wb_table20_105_1S2e( false) ;
      }
   }

   public void wb_table19_99_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_99_1S2e( true) ;
      }
      else
      {
         wb_table19_99_1S2e( false) ;
      }
   }

   public void wb_table18_93_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_93_1S2e( true) ;
      }
      else
      {
         wb_table18_93_1S2e( false) ;
      }
   }

   public void wb_table17_87_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_87_1S2e( true) ;
      }
      else
      {
         wb_table17_87_1S2e( false) ;
      }
   }

   public void wb_table16_81_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_81_1S2e( true) ;
      }
      else
      {
         wb_table16_81_1S2e( false) ;
      }
   }

   public void wb_table15_75_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_75_1S2e( true) ;
      }
      else
      {
         wb_table15_75_1S2e( false) ;
      }
   }

   public void wb_table14_69_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_69_1S2e( true) ;
      }
      else
      {
         wb_table14_69_1S2e( false) ;
      }
   }

   public void wb_table9_29_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         httpContext.writeText( "試験") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:580px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメインコード") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_dom_cd, cmbavD_dom_cd.getInternalname(), GXutil.rtrim( AV7D_DOM_CD), 1, cmbavD_dom_cd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 16, "chr", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(37);\"", "", true, "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         cmbavD_dom_cd.setValue( GXutil.rtrim( AV7D_DOM_CD) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_dom_cd.getInternalname(), "Values", cmbavD_dom_cd.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメイン変数名") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_dom_var_nm_Internalname, GXutil.rtrim( AV9D_DOM_VAR_NM), GXutil.rtrim( localUtil.format( AV9D_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_dom_var_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_VAR_NM", "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "ドメイン変数説明") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_188_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_var_desc_Internalname, GXutil.rtrim( AV14D_VAR_DESC), GXutil.rtrim( localUtil.format( AV14D_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_var_desc_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"2\" >") ;
         wb_table28_48_1S2( true) ;
      }
      else
      {
         wb_table28_48_1S2( false) ;
      }
      return  ;
   }

   public void wb_table28_48_1S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_29_1S2e( true) ;
      }
      else
      {
         wb_table9_29_1S2e( false) ;
      }
   }

   public void wb_table28_48_1S2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "検索（F5）", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "クリア（F6）", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_48_1S2e( true) ;
      }
      else
      {
         wb_table28_48_1S2e( false) ;
      }
   }

   public void wb_table6_12_1S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "新規（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "新規（F3）", "", "", lblTxt_btn_reg2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_Internalname, "CSV出力（F4）", "", "", lblTxt_btn_csv_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV\\'."+"'", "", "TextBlockBtnList120", 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_can_Internalname, "戻る（F11）", "", "", lblBtn_can_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList120", 5, "", 1, 1, (short)(0), "HLP_B402_WP14_STUDY_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_12_1S2e( true) ;
      }
      else
      {
         wb_table6_12_1S2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV33P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33P_MOVE_KBN", GXutil.str( AV33P_MOVE_KBN, 1, 0));
      AV23P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23P_STUDY_ID", GXutil.ltrim( GXutil.str( AV23P_STUDY_ID, 10, 0)));
      AV22P_DOM_CD = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22P_DOM_CD", AV22P_DOM_CD);
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
      pa1S2( ) ;
      ws1S2( ) ;
      we1S2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151330040");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp14_study_cdisc_item_list.js", "?20207151330040");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1882( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_188_idx ;
      edtTBM43_DOM_CD_Internalname = "TBM43_DOM_CD_"+sGXsfl_188_idx ;
      edtTBM43_DOM_VAR_NM_Internalname = "TBM43_DOM_VAR_NM_"+sGXsfl_188_idx ;
      edtTBM43_VAR_DESC_Internalname = "TBM43_VAR_DESC_"+sGXsfl_188_idx ;
      edtTBM43_ORDER_Internalname = "TBM43_ORDER_"+sGXsfl_188_idx ;
      edtTBM43_VERSION_Internalname = "TBM43_VERSION_"+sGXsfl_188_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_188_idx ;
   }

   public void subsflControlProps_fel_1882( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_188_fel_idx ;
      edtTBM43_DOM_CD_Internalname = "TBM43_DOM_CD_"+sGXsfl_188_fel_idx ;
      edtTBM43_DOM_VAR_NM_Internalname = "TBM43_DOM_VAR_NM_"+sGXsfl_188_fel_idx ;
      edtTBM43_VAR_DESC_Internalname = "TBM43_VAR_DESC_"+sGXsfl_188_fel_idx ;
      edtTBM43_ORDER_Internalname = "TBM43_ORDER_"+sGXsfl_188_fel_idx ;
      edtTBM43_VERSION_Internalname = "TBM43_VERSION_"+sGXsfl_188_fel_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_188_fel_idx ;
   }

   public void sendrow_1882( )
   {
      subsflControlProps_1882( ) ;
      wb1S0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_188_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_188_idx-1)/ (double) (1)) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
         }
         /* Start of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( ( 1 == 0 ) && ( nGXsfl_188_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_188_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_188_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_188_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_SEL\\'."+sGXsfl_188_idx+"'","","TextBlockBtn040s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:160px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM43_DOM_CD_Internalname,GXutil.rtrim( A201TBM43_DOM_CD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM43_DOM_CD_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(16),"chr",new Integer(1),"row",new Integer(16),new Integer(0),new Integer(0),new Integer(188),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_DOM_CD","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:200px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM43_DOM_VAR_NM_Internalname,GXutil.rtrim( A202TBM43_DOM_VAR_NM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM43_DOM_VAR_NM_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(188),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_DOM_VAR_NM","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:300px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM43_VAR_DESC_Internalname,GXutil.rtrim( A910TBM43_VAR_DESC),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM43_VAR_DESC_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(188),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM43_ORDER_Internalname,GXutil.ltrim( localUtil.ntoc( A918TBM43_ORDER, (byte)(5), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A918TBM43_ORDER), "ZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM43_ORDER_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(5),"chr",new Integer(1),"row",new Integer(5),new Integer(0),new Integer(0),new Integer(188),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM43_VERSION_Internalname,GXutil.rtrim( A933TBM43_VERSION),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM43_VERSION_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(188),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 203,'',false,'"+sGXsfl_188_idx+"',188)\"" : " ") ;
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_del_Internalname,GXutil.rtrim( AV10D_GRD_DEL),"",TempTags+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(203);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_del_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_del_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(188),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
               if ( ((int)((nGXsfl_188_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_188_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_188_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_188_idx+1)) ;
         sGXsfl_188_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_188_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1882( ) ;
      }
      /* End function sendrow_1882 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_reg2_Internalname = "TXT_BTN_REG2" ;
      lblTxt_btn_csv_Internalname = "TXT_BTN_CSV" ;
      lblBtn_can_Internalname = "BTN_CAN" ;
      tblTable8_Internalname = "TABLE8" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
      cmbavD_dom_cd.setInternalname( "vD_DOM_CD" );
      edtavD_dom_var_nm_Internalname = "vD_DOM_VAR_NM" ;
      edtavD_var_desc_Internalname = "vD_VAR_DESC" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      tblTable9_Internalname = "TABLE9" ;
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
      lblTxt_sort01_desc_Internalname = "TXT_SORT01_DESC" ;
      lblTxt_sort01_asc_Internalname = "TXT_SORT01_ASC" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      lblTxt_sort02_desc_Internalname = "TXT_SORT02_DESC" ;
      lblTxt_sort02_asc_Internalname = "TXT_SORT02_ASC" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      lblTxt_sort03_desc_Internalname = "TXT_SORT03_DESC" ;
      lblTxt_sort03_asc_Internalname = "TXT_SORT03_ASC" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTxt_sort04_desc_Internalname = "TXT_SORT04_DESC" ;
      lblTxt_sort04_asc_Internalname = "TXT_SORT04_ASC" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTxt_sort05_desc_Internalname = "TXT_SORT05_DESC" ;
      lblTxt_sort05_asc_Internalname = "TXT_SORT05_ASC" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      lblTxt_sort06_desc_Internalname = "TXT_SORT06_DESC" ;
      lblTxt_sort06_asc_Internalname = "TXT_SORT06_ASC" ;
      tblTbl_in_grid_header_Internalname = "TBL_IN_GRID_HEADER" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_dom_cd_Internalname = "vH_DOM_CD" ;
      edtavH_dom_var_nm_Internalname = "vH_DOM_VAR_NM" ;
      edtavH_var_desc_Internalname = "vH_VAR_DESC" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
      tblTable7_Internalname = "TABLE7" ;
      edtavH_sort_asdc_kbn_Internalname = "vH_SORT_ASDC_KBN" ;
      edtavH_sort_item_kbn_Internalname = "vH_SORT_ITEM_KBN" ;
      tblTable6_Internalname = "TABLE6" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_grd_del_Jsonclick = "" ;
      edtavD_grd_del_Visible = 1 ;
      edtTBM43_VERSION_Jsonclick = "" ;
      edtTBM43_ORDER_Jsonclick = "" ;
      edtTBM43_VAR_DESC_Jsonclick = "" ;
      edtTBM43_DOM_VAR_NM_Jsonclick = "" ;
      edtTBM43_DOM_CD_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridTM-1" ;
      lblTxt_btn_reg2_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      edtavD_var_desc_Jsonclick = "" ;
      edtavD_dom_var_nm_Jsonclick = "" ;
      cmbavD_dom_cd.setJsonclick( "" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd_del_Enabled = 1 ;
      lblBtn_sel_Caption = "選択" ;
      edtavCtlmax_row_Jsonclick = "" ;
      edtavH_sort_item_kbn_Jsonclick = "" ;
      edtavH_sort_asdc_kbn_Jsonclick = "" ;
      edtavH_var_desc_Jsonclick = "" ;
      edtavH_dom_var_nm_Jsonclick = "" ;
      edtavH_dom_cd_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_sort06_desc_Class = "TextBlockSort" ;
      lblTxt_sort06_asc_Class = "TextBlockSort" ;
      lblTxt_sort05_desc_Class = "TextBlockSort" ;
      lblTxt_sort05_asc_Class = "TextBlockSort" ;
      lblTxt_sort04_desc_Class = "TextBlockSort" ;
      lblTxt_sort04_asc_Class = "TextBlockSort" ;
      lblTxt_sort03_desc_Class = "TextBlockSort" ;
      lblTxt_sort03_asc_Class = "TextBlockSort" ;
      lblTxt_sort02_desc_Class = "TextBlockSort" ;
      lblTxt_sort02_asc_Class = "TextBlockSort" ;
      lblTxt_sort01_desc_Class = "TextBlockSort" ;
      lblTxt_sort01_asc_Class = "TextBlockSort" ;
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
      lblTxt_study_Caption = "試験名" ;
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
                  /* Execute user subroutine: S302 */
                  S302 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV22P_DOM_CD = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV22P_DOM_CD = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV20H_SRCH_FLG = "" ;
      AV16H_DOM_CD = "" ;
      AV17H_DOM_VAR_NM = "" ;
      AV21H_VAR_DESC = "" ;
      AV15H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV40Pgmname = "" ;
      AV6C_TAM02_APP_ID = "" ;
      A367TBM21_STUDY_NM = "" ;
      A204TBM42_DOM_CD = "" ;
      A906TBM42_DOM_JNM = "" ;
      AV26W_A821_JS = "" ;
      A919TBM43_DEL_FLG = "" ;
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
      A201TBM43_DOM_CD = "" ;
      edtTBM43_DOM_CD_Internalname = "" ;
      A202TBM43_DOM_VAR_NM = "" ;
      edtTBM43_DOM_VAR_NM_Internalname = "" ;
      A910TBM43_VAR_DESC = "" ;
      edtTBM43_VAR_DESC_Internalname = "" ;
      edtTBM43_ORDER_Internalname = "" ;
      A933TBM43_VERSION = "" ;
      edtTBM43_VERSION_Internalname = "" ;
      AV10D_GRD_DEL = "" ;
      edtavD_grd_del_Internalname = "" ;
      GXDecQS = "" ;
      AV7D_DOM_CD = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      lV17H_DOM_VAR_NM = "" ;
      lV21H_VAR_DESC = "" ;
      H001S2_A919TBM43_DEL_FLG = new String[] {""} ;
      H001S2_n919TBM43_DEL_FLG = new boolean[] {false} ;
      H001S2_A200TBM43_STUDY_ID = new long[1] ;
      H001S2_A933TBM43_VERSION = new String[] {""} ;
      H001S2_n933TBM43_VERSION = new boolean[] {false} ;
      H001S2_A918TBM43_ORDER = new int[1] ;
      H001S2_n918TBM43_ORDER = new boolean[] {false} ;
      H001S2_A910TBM43_VAR_DESC = new String[] {""} ;
      H001S2_n910TBM43_VAR_DESC = new boolean[] {false} ;
      H001S2_A202TBM43_DOM_VAR_NM = new String[] {""} ;
      H001S2_A201TBM43_DOM_CD = new String[] {""} ;
      H001S3_AGRID1_nRecordCount = new long[1] ;
      AV39Pgmdesc = "" ;
      AV9D_DOM_VAR_NM = "" ;
      AV14D_VAR_DESC = "" ;
      AV18H_INIT_FLG = "" ;
      AV19H_KNGN_FLG = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV24W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV31W_SESSION = httpContext.getWebSession();
      AV29W_MSG = "" ;
      H001S4_A63TBM21_STUDY_ID = new long[1] ;
      H001S4_A367TBM21_STUDY_NM = new String[] {""} ;
      H001S4_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H001S5_A203TBM42_STUDY_ID = new long[1] ;
      H001S5_A906TBM42_DOM_JNM = new String[] {""} ;
      H001S5_n906TBM42_DOM_JNM = new boolean[] {false} ;
      H001S5_A204TBM42_DOM_CD = new String[] {""} ;
      H001S6_A910TBM43_VAR_DESC = new String[] {""} ;
      H001S6_n910TBM43_VAR_DESC = new boolean[] {false} ;
      H001S6_A202TBM43_DOM_VAR_NM = new String[] {""} ;
      H001S6_A201TBM43_DOM_CD = new String[] {""} ;
      H001S6_A200TBM43_STUDY_ID = new long[1] ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV27W_ERRCD = "" ;
      AV25W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtA_PAGING_SDT5 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXv_boolean7 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock1_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock34_Jsonclick = "" ;
      lblTxt_sort01_desc_Jsonclick = "" ;
      lblTxt_sort01_asc_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTxt_sort02_desc_Jsonclick = "" ;
      lblTxt_sort02_asc_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTxt_sort03_desc_Jsonclick = "" ;
      lblTxt_sort03_asc_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTxt_sort04_desc_Jsonclick = "" ;
      lblTxt_sort04_asc_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTxt_sort05_desc_Jsonclick = "" ;
      lblTxt_sort05_asc_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTxt_sort06_desc_Jsonclick = "" ;
      lblTxt_sort06_asc_Jsonclick = "" ;
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
      lblTxt_study_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_reg2_Jsonclick = "" ;
      lblTxt_btn_csv_Jsonclick = "" ;
      lblBtn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblBtn_sel_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblBtn_sel_Jsonclick = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp14_study_cdisc_item_list__default(),
         new Object[] {
             new Object[] {
            H001S2_A919TBM43_DEL_FLG, H001S2_n919TBM43_DEL_FLG, H001S2_A200TBM43_STUDY_ID, H001S2_A933TBM43_VERSION, H001S2_n933TBM43_VERSION, H001S2_A918TBM43_ORDER, H001S2_n918TBM43_ORDER, H001S2_A910TBM43_VAR_DESC, H001S2_n910TBM43_VAR_DESC, H001S2_A202TBM43_DOM_VAR_NM,
            H001S2_A201TBM43_DOM_CD
            }
            , new Object[] {
            H001S3_AGRID1_nRecordCount
            }
            , new Object[] {
            H001S4_A63TBM21_STUDY_ID, H001S4_A367TBM21_STUDY_NM, H001S4_n367TBM21_STUDY_NM
            }
            , new Object[] {
            H001S5_A203TBM42_STUDY_ID, H001S5_A906TBM42_DOM_JNM, H001S5_n906TBM42_DOM_JNM, H001S5_A204TBM42_DOM_CD
            }
            , new Object[] {
            H001S6_A910TBM43_VAR_DESC, H001S6_n910TBM43_VAR_DESC, H001S6_A202TBM43_DOM_VAR_NM, H001S6_A201TBM43_DOM_CD, H001S6_A200TBM43_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "B402_WP14_STUDY_CDISC_ITEM_LIST" ;
      AV39Pgmdesc = "試験登録（ドメイン変数一覧）" ;
      /* GeneXus formulas. */
      AV40Pgmname = "B402_WP14_STUDY_CDISC_ITEM_LIST" ;
      AV39Pgmdesc = "試験登録（ドメイン変数一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_del_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV33P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV33P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV43GXLvl443 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_188 ;
   private short nGXsfl_188_idx=1 ;
   private short AV34H_SORT_ASDC_KBN ;
   private short AV35H_SORT_ITEM_KBN ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_188_Refreshing=0 ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int A918TBM43_ORDER ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int edtavD_grd_del_Enabled ;
   private int tblTbl_hidden_Visible ;
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
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_reg2_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_del_Visible ;
   private long wcpOAV23P_STUDY_ID ;
   private long AV23P_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long A63TBM21_STUDY_ID ;
   private long A203TBM42_STUDY_ID ;
   private long GXPagingTo2 ;
   private long A200TBM43_STUDY_ID ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_188_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV40Pgmname ;
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
   private String edtTBM43_DOM_CD_Internalname ;
   private String edtTBM43_DOM_VAR_NM_Internalname ;
   private String edtTBM43_VAR_DESC_Internalname ;
   private String edtTBM43_ORDER_Internalname ;
   private String edtTBM43_VERSION_Internalname ;
   private String edtavD_grd_del_Internalname ;
   private String GXDecQS ;
   private String scmdbuf ;
   private String AV39Pgmdesc ;
   private String edtavD_dom_var_nm_Internalname ;
   private String edtavD_var_desc_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_dom_cd_Internalname ;
   private String edtavH_dom_var_nm_Internalname ;
   private String edtavH_var_desc_Internalname ;
   private String edtavCtlmax_row_Internalname ;
   private String edtavH_sort_asdc_kbn_Internalname ;
   private String edtavH_sort_item_kbn_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblTxt_study_Caption ;
   private String lblTxt_study_Internalname ;
   private String GXv_char2[] ;
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
   private String GXv_char4[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_reg2_Internalname ;
   private String lblTxt_sort01_asc_Class ;
   private String lblTxt_sort01_asc_Internalname ;
   private String lblTxt_sort01_desc_Class ;
   private String lblTxt_sort01_desc_Internalname ;
   private String lblTxt_sort02_asc_Class ;
   private String lblTxt_sort02_asc_Internalname ;
   private String lblTxt_sort02_desc_Class ;
   private String lblTxt_sort02_desc_Internalname ;
   private String lblTxt_sort03_asc_Class ;
   private String lblTxt_sort03_asc_Internalname ;
   private String lblTxt_sort03_desc_Class ;
   private String lblTxt_sort03_desc_Internalname ;
   private String lblTxt_sort04_asc_Class ;
   private String lblTxt_sort04_asc_Internalname ;
   private String lblTxt_sort04_desc_Class ;
   private String lblTxt_sort04_desc_Internalname ;
   private String lblTxt_sort05_asc_Class ;
   private String lblTxt_sort05_asc_Internalname ;
   private String lblTxt_sort05_desc_Class ;
   private String lblTxt_sort05_desc_Internalname ;
   private String lblTxt_sort06_asc_Class ;
   private String lblTxt_sort06_asc_Internalname ;
   private String lblTxt_sort06_desc_Class ;
   private String lblTxt_sort06_desc_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_dom_cd_Jsonclick ;
   private String edtavH_dom_var_nm_Jsonclick ;
   private String edtavH_var_desc_Jsonclick ;
   private String tblTable6_Internalname ;
   private String edtavH_sort_asdc_kbn_Jsonclick ;
   private String edtavH_sort_item_kbn_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String lblBtn_sel_Caption ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTxt_sort01_desc_Jsonclick ;
   private String lblTxt_sort01_asc_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String lblTxt_sort02_desc_Jsonclick ;
   private String lblTxt_sort02_asc_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String lblTxt_sort03_desc_Jsonclick ;
   private String lblTxt_sort03_asc_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTxt_sort04_desc_Jsonclick ;
   private String lblTxt_sort04_asc_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTxt_sort05_desc_Jsonclick ;
   private String lblTxt_sort05_asc_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTxt_sort06_desc_Jsonclick ;
   private String lblTxt_sort06_asc_Jsonclick ;
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
   private String lblTxt_study_Jsonclick ;
   private String edtavD_dom_var_nm_Jsonclick ;
   private String edtavD_var_desc_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String tblTable8_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_reg2_Jsonclick ;
   private String lblTxt_btn_csv_Internalname ;
   private String lblTxt_btn_csv_Jsonclick ;
   private String lblBtn_can_Internalname ;
   private String lblBtn_can_Jsonclick ;
   private String lblBtn_sel_Internalname ;
   private String sGXsfl_188_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String lblBtn_sel_Jsonclick ;
   private String ROClassString ;
   private String edtTBM43_DOM_CD_Jsonclick ;
   private String edtTBM43_DOM_VAR_NM_Jsonclick ;
   private String edtTBM43_VAR_DESC_Jsonclick ;
   private String edtTBM43_ORDER_Jsonclick ;
   private String edtTBM43_VERSION_Jsonclick ;
   private String edtavD_grd_del_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV28W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n910TBM43_VAR_DESC ;
   private boolean n918TBM43_ORDER ;
   private boolean n933TBM43_VERSION ;
   private boolean n919TBM43_DEL_FLG ;
   private boolean returnInSub ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n906TBM42_DOM_JNM ;
   private boolean GXt_boolean6 ;
   private boolean GXv_boolean7[] ;
   private String wcpOAV22P_DOM_CD ;
   private String AV22P_DOM_CD ;
   private String AV20H_SRCH_FLG ;
   private String AV16H_DOM_CD ;
   private String AV17H_DOM_VAR_NM ;
   private String AV21H_VAR_DESC ;
   private String AV6C_TAM02_APP_ID ;
   private String A367TBM21_STUDY_NM ;
   private String A204TBM42_DOM_CD ;
   private String A906TBM42_DOM_JNM ;
   private String AV26W_A821_JS ;
   private String A919TBM43_DEL_FLG ;
   private String A201TBM43_DOM_CD ;
   private String A202TBM43_DOM_VAR_NM ;
   private String A910TBM43_VAR_DESC ;
   private String A933TBM43_VERSION ;
   private String AV10D_GRD_DEL ;
   private String AV7D_DOM_CD ;
   private String lV17H_DOM_VAR_NM ;
   private String lV21H_VAR_DESC ;
   private String AV9D_DOM_VAR_NM ;
   private String AV14D_VAR_DESC ;
   private String AV18H_INIT_FLG ;
   private String AV19H_KNGN_FLG ;
   private String AV5C_GAMEN_TITLE ;
   private String AV29W_MSG ;
   private String AV27W_ERRCD ;
   private String AV25W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice cmbavD_dom_cd ;
   private IDataStoreProvider pr_default ;
   private String[] H001S2_A919TBM43_DEL_FLG ;
   private boolean[] H001S2_n919TBM43_DEL_FLG ;
   private long[] H001S2_A200TBM43_STUDY_ID ;
   private String[] H001S2_A933TBM43_VERSION ;
   private boolean[] H001S2_n933TBM43_VERSION ;
   private int[] H001S2_A918TBM43_ORDER ;
   private boolean[] H001S2_n918TBM43_ORDER ;
   private String[] H001S2_A910TBM43_VAR_DESC ;
   private boolean[] H001S2_n910TBM43_VAR_DESC ;
   private String[] H001S2_A202TBM43_DOM_VAR_NM ;
   private String[] H001S2_A201TBM43_DOM_CD ;
   private long[] H001S3_AGRID1_nRecordCount ;
   private long[] H001S4_A63TBM21_STUDY_ID ;
   private String[] H001S4_A367TBM21_STUDY_NM ;
   private boolean[] H001S4_n367TBM21_STUDY_NM ;
   private long[] H001S5_A203TBM42_STUDY_ID ;
   private String[] H001S5_A906TBM42_DOM_JNM ;
   private boolean[] H001S5_n906TBM42_DOM_JNM ;
   private String[] H001S5_A204TBM42_DOM_CD ;
   private String[] H001S6_A910TBM43_VAR_DESC ;
   private boolean[] H001S6_n910TBM43_VAR_DESC ;
   private String[] H001S6_A202TBM43_DOM_VAR_NM ;
   private String[] H001S6_A201TBM43_DOM_CD ;
   private long[] H001S6_A200TBM43_STUDY_ID ;
   private com.genexus.webpanels.WebSession AV31W_SESSION ;
   private SdtA_PAGING_SDT AV15H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT5[] ;
   private SdtA_LOGIN_SDT AV24W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b402_wp14_study_cdisc_item_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV16H_DOM_CD ,
                                          String AV17H_DOM_VAR_NM ,
                                          String AV21H_VAR_DESC ,
                                          String A201TBM43_DOM_CD ,
                                          String A202TBM43_DOM_VAR_NM ,
                                          String A910TBM43_VAR_DESC ,
                                          short AV35H_SORT_ITEM_KBN ,
                                          short AV34H_SORT_ASDC_KBN ,
                                          String AV20H_SRCH_FLG ,
                                          long A200TBM43_STUDY_ID ,
                                          long AV23P_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int8 ;
      GXv_int8 = new byte [7] ;
      Object[] GXv_Object9 ;
      GXv_Object9 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " `TBM43_DEL_FLG`, `TBM43_STUDY_ID`, `TBM43_VERSION`, `TBM43_ORDER`, `TBM43_VAR_DESC`," ;
      sSelectString = sSelectString + " `TBM43_DOM_VAR_NM`, `TBM43_DOM_CD`" ;
      sFromString = " FROM `TBM43_STUDY_CDISC_ITEM`" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (? = '1')" ;
      sWhereString = sWhereString + " and (`TBM43_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV16H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17H_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_VAR_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21H_VAR_DESC)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_VAR_DESC` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ( AV35H_SORT_ITEM_KBN == 0 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 1 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_DOM_CD`" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 1 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_DOM_CD` DESC" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 2 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_DOM_VAR_NM`" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 2 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_DOM_VAR_NM` DESC" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 3 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_VAR_DESC`" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 3 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_VAR_DESC` DESC" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 4 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_ORDER`" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 4 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_ORDER` DESC" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 5 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_VERSION`" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 5 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_VERSION` DESC" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 6 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_DEL_FLG`" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 6 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_DEL_FLG` DESC" ;
      }
      else if ( true )
      {
         sOrderString = sOrderString + " ORDER BY `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`" ;
      }
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_H001S3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV16H_DOM_CD ,
                                          String AV17H_DOM_VAR_NM ,
                                          String AV21H_VAR_DESC ,
                                          String A201TBM43_DOM_CD ,
                                          String A202TBM43_DOM_VAR_NM ,
                                          String A910TBM43_VAR_DESC ,
                                          short AV35H_SORT_ITEM_KBN ,
                                          short AV34H_SORT_ASDC_KBN ,
                                          String AV20H_SRCH_FLG ,
                                          long A200TBM43_STUDY_ID ,
                                          long AV23P_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int10 ;
      GXv_int10 = new byte [5] ;
      Object[] GXv_Object11 ;
      GXv_Object11 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM `TBM43_STUDY_CDISC_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (? = '1')" ;
      scmdbuf = scmdbuf + " and (`TBM43_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV16H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17H_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_VAR_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21H_VAR_DESC)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_VAR_DESC` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      if ( ( AV35H_SORT_ITEM_KBN == 0 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 1 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 1 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 2 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 2 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 3 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 3 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 4 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 4 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 5 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 5 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 6 ) && ( AV34H_SORT_ASDC_KBN == 0 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( ( AV35H_SORT_ITEM_KBN == 6 ) && ( AV34H_SORT_ASDC_KBN == 1 ) )
      {
         scmdbuf = scmdbuf + "" ;
      }
      else if ( true )
      {
         scmdbuf = scmdbuf + "" ;
      }
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_H001S6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV16H_DOM_CD ,
                                          String AV17H_DOM_VAR_NM ,
                                          String AV21H_VAR_DESC ,
                                          String A201TBM43_DOM_CD ,
                                          String A202TBM43_DOM_VAR_NM ,
                                          String A910TBM43_VAR_DESC ,
                                          long AV23P_STUDY_ID ,
                                          long A200TBM43_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int12 ;
      GXv_int12 = new byte [4] ;
      Object[] GXv_Object13 ;
      GXv_Object13 = new Object [2] ;
      scmdbuf = "SELECT `TBM43_VAR_DESC`, `TBM43_DOM_VAR_NM`, `TBM43_DOM_CD`, `TBM43_STUDY_ID` FROM" ;
      scmdbuf = scmdbuf + " `TBM43_STUDY_CDISC_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM43_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV16H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17H_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_VAR_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21H_VAR_DESC)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_VAR_DESC` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM43_STUDY_ID`" ;
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
            case 0 :
                  return conditional_H001S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).longValue() );
            case 1 :
                  return conditional_H001S3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , ((Number) dynConstraints[10]).longValue() );
            case 4 :
                  return conditional_H001S6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001S3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H001S4", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001S5", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_JNM`, `TBM42_DOM_CD` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? ORDER BY `TBM42_STUDY_ID`, `TBM42_DOM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001S6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
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
                  stmt.setVarchar(sIdx, (String)parms[7], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[8]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 50);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 50);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[4]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               return;
      }
   }

}

