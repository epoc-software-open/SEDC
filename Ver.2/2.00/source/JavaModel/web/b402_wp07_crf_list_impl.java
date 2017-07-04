/*
               File: b402_wp07_crf_list_impl
        Description: 試験登録（CRF一覧）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:24.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp07_crf_list_impl extends GXWebPanel
{
   public b402_wp07_crf_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp07_crf_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp07_crf_list_impl.class ));
   }

   public b402_wp07_crf_list_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavD_status = new HTMLChoice();
      radavD_del_flg = new HTMLChoice();
      cmbTBM31_REPEAT_FLG = new HTMLChoice();
      cmbTBM31_STATUS = new HTMLChoice();
      cmbTBM31_DEL_FLG = new HTMLChoice();
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
            nRC_GXsfl_183 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_183_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_183_idx = httpContext.GetNextPar( ) ;
            AV33D_SPACE = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_183, nGXsfl_183_idx, sGXsfl_183_idx, AV33D_SPACE) ;
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
            AV17P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
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
         pa0Z2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws0Z2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we0Z2( ) ;
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
      httpContext.writeValue( "試験登録（CRF一覧）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?2017731717256");
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
      GXEncryptionTmp = "b402_wp07_crf_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0Z2( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV15H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_CRF_NM", GXutil.rtrim( AV11H_CRF_NM));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_STATUS", GXutil.rtrim( AV16H_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DEL_FLG", GXutil.rtrim( AV12H_DEL_FLG));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_183", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_183, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV18P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV40Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV5C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_APP_ID", GetHash( "", String.valueOf(AV5C_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV17P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_REG_ENABEL", AV30W_REG_ENABEL);
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV24W_A821_JS));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV28W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "TBM31_REPEAT_MAX", GXutil.ltrim( localUtil.ntoc( A944TBM31_REPEAT_MAX, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A945TBM44_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_ID", GXutil.ltrim( localUtil.ntoc( A946TBM44_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_VISIT_NO", GXutil.ltrim( localUtil.ntoc( A948TBM44_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A947TBM44_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
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
      return "B402_WP07_CRF_LIST" ;
   }

   public String getPgmdesc( )
   {
      return "試験登録（CRF一覧）" ;
   }

   public void wb0Z0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0Z2( true) ;
      }
      else
      {
         wb_table1_2_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_219_0Z2( true) ;
      }
      else
      {
         wb_table2_219_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table2_219_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0Z2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験登録（CRF一覧）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0217") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0217", "");
         }
      }
      wbErr = false ;
      strup0Z0( ) ;
   }

   public void ws0Z2( )
   {
      start0Z2( ) ;
      evt0Z2( ) ;
   }

   public void evt0Z2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_CHK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e110Z2 */
                        e110Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120Z2 */
                        e120Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130Z2 */
                        e130Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140Z2 */
                        e140Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_LSIT_IMPORT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150Z2 */
                        e150Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_PART_IMPORT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e160Z2 */
                        e160Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e170Z2 */
                        e170Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e180Z2 */
                        e180Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e190Z2 */
                        e190Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e200Z2 */
                        e200Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e210Z2 */
                        e210Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e220Z2 */
                        e220Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e230Z2 */
                        e230Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e240Z2 */
                        e240Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e250Z2 */
                        e250Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e260Z2 */
                        e260Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e270Z2 */
                        e270Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e280Z2 */
                        e280Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e290Z2 */
                        e290Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e300Z2 */
                        e300Z2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e310Z2 */
                        e310Z2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'BTN_CRF_COPY'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'BTN_CRF_COPY'") == 0 ) )
                     {
                        nGXsfl_183_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_183_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_183_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1832( ) ;
                        A395TBM31_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM31_ORDER_Internalname), ".", ",")) ;
                        n395TBM31_ORDER = false ;
                        A69TBM31_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",")) ;
                        AV33D_SPACE = httpContext.cgiGet( edtavD_space_Internalname) ;
                        A393TBM31_CRF_NM = httpContext.cgiGet( edtTBM31_CRF_NM_Internalname) ;
                        n393TBM31_CRF_NM = false ;
                        cmbTBM31_REPEAT_FLG.setName( cmbTBM31_REPEAT_FLG.getInternalname() );
                        cmbTBM31_REPEAT_FLG.setValue( httpContext.cgiGet( cmbTBM31_REPEAT_FLG.getInternalname()) );
                        A943TBM31_REPEAT_FLG = (byte)(GXutil.lval( httpContext.cgiGet( cmbTBM31_REPEAT_FLG.getInternalname()))) ;
                        n943TBM31_REPEAT_FLG = false ;
                        AV34D_GRD_REPEAT = httpContext.cgiGet( edtavD_grd_repeat_Internalname) ;
                        AV35D_GRD_VISIT_NO = httpContext.cgiGet( edtavD_grd_visit_no_Internalname) ;
                        cmbTBM31_STATUS.setName( cmbTBM31_STATUS.getInternalname() );
                        cmbTBM31_STATUS.setValue( httpContext.cgiGet( cmbTBM31_STATUS.getInternalname()) );
                        A643TBM31_STATUS = httpContext.cgiGet( cmbTBM31_STATUS.getInternalname()) ;
                        n643TBM31_STATUS = false ;
                        cmbTBM31_DEL_FLG.setName( cmbTBM31_DEL_FLG.getInternalname() );
                        cmbTBM31_DEL_FLG.setValue( httpContext.cgiGet( cmbTBM31_DEL_FLG.getInternalname()) );
                        A397TBM31_DEL_FLG = httpContext.cgiGet( cmbTBM31_DEL_FLG.getInternalname()) ;
                        n397TBM31_DEL_FLG = false ;
                        A68TBM31_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM31_STUDY_ID_Internalname), ".", ",") ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0217") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0217", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0217") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0217", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e320Z2 */
                              e320Z2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e330Z2 */
                              e330Z2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e340Z2 */
                              e340Z2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e350Z2 */
                              e350Z2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_CRF_COPY'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e360Z2 */
                              e360Z2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 /* Set Refresh If H_srch_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV15H_SRCH_FLG) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_crf_nm Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_CRF_NM"), AV11H_CRF_NM) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_status Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_STATUS"), AV16H_STATUS) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_del_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DEL_FLG"), AV12H_DEL_FLG) != 0 )
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
                  else if ( nCmpId == 217 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0217") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0217", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0Z2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0Z2( ) ;
         }
      }
   }

   public void pa0Z2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp07_crf_list")), "b402_wp07_crf_list") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp07_crf_list"))) ;
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
                  AV17P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV18P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
                  }
               }
            }
         }
         radavD_status.setName( "vD_STATUS" );
         radavD_status.setWebtags( "" );
         radavD_del_flg.setName( "vD_DEL_FLG" );
         radavD_del_flg.setWebtags( "" );
         GXCCtl = "TBM31_REPEAT_FLG_" + sGXsfl_183_idx ;
         cmbTBM31_REPEAT_FLG.setName( GXCCtl );
         cmbTBM31_REPEAT_FLG.setWebtags( "" );
         cmbTBM31_REPEAT_FLG.addItem("0", "不可", (short)(0));
         cmbTBM31_REPEAT_FLG.addItem("1", "可", (short)(0));
         if ( cmbTBM31_REPEAT_FLG.getItemCount() > 0 )
         {
            A943TBM31_REPEAT_FLG = (byte)(GXutil.lval( cmbTBM31_REPEAT_FLG.getValidValue(GXutil.trim( GXutil.str( A943TBM31_REPEAT_FLG, 1, 0))))) ;
            n943TBM31_REPEAT_FLG = false ;
         }
         GXCCtl = "TBM31_STATUS_" + sGXsfl_183_idx ;
         cmbTBM31_STATUS.setName( GXCCtl );
         cmbTBM31_STATUS.setWebtags( "" );
         if ( cmbTBM31_STATUS.getItemCount() > 0 )
         {
            A643TBM31_STATUS = cmbTBM31_STATUS.getValidValue(A643TBM31_STATUS) ;
            n643TBM31_STATUS = false ;
         }
         GXCCtl = "TBM31_DEL_FLG_" + sGXsfl_183_idx ;
         cmbTBM31_DEL_FLG.setName( GXCCtl );
         cmbTBM31_DEL_FLG.setWebtags( "" );
         if ( cmbTBM31_DEL_FLG.getItemCount() > 0 )
         {
            A397TBM31_DEL_FLG = cmbTBM31_DEL_FLG.getValidValue(A397TBM31_DEL_FLG) ;
            n397TBM31_DEL_FLG = false ;
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_183 ,
                                 short nGXsfl_183_idx ,
                                 String sGXsfl_183_idx ,
                                 String AV33D_SPACE )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1832( ) ;
      while ( nGXsfl_183_idx <= nRC_GXsfl_183 )
      {
         sendrow_1832( ) ;
         nGXsfl_183_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_183_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_183_idx+1)) ;
         sGXsfl_183_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_183_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1832( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf0Z2( ) ;
      /* End function Refresh */
   }

   public void rf0Z2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 935, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGridBase");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
      wbStart = (short)(183) ;
      nGXsfl_183_idx = (short)(1) ;
      sGXsfl_183_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_183_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1832( ) ;
      nGXsfl_183_Refreshing = (short)(1) ;
      /* Execute user event: e330Z2 */
      e330Z2 ();
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
         subsflControlProps_1832( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV11H_CRF_NM ,
                                              AV16H_STATUS ,
                                              AV12H_DEL_FLG ,
                                              A393TBM31_CRF_NM ,
                                              A643TBM31_STATUS ,
                                              A397TBM31_DEL_FLG ,
                                              AV15H_SRCH_FLG ,
                                              new Long(AV18P_STUDY_ID) ,
                                              new Long(A68TBM31_STUDY_ID) },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.LONG, TypeConstants.LONG
                                              }
         });
         lV11H_CRF_NM = GXutil.padr( GXutil.rtrim( AV11H_CRF_NM), 100, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
         /* Using cursor H000Z2 */
         pr_default.execute(0, new Object[] {new Long(AV18P_STUDY_ID), AV15H_SRCH_FLG, lV11H_CRF_NM, AV16H_STATUS, AV12H_DEL_FLG, new Integer(GXPagingFrom2), new Long(GXPagingTo2)});
         nGXsfl_183_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A68TBM31_STUDY_ID = H000Z2_A68TBM31_STUDY_ID[0] ;
            A69TBM31_CRF_ID = H000Z2_A69TBM31_CRF_ID[0] ;
            A944TBM31_REPEAT_MAX = H000Z2_A944TBM31_REPEAT_MAX[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A944TBM31_REPEAT_MAX", GXutil.ltrim( GXutil.str( A944TBM31_REPEAT_MAX, 2, 0)));
            n944TBM31_REPEAT_MAX = H000Z2_n944TBM31_REPEAT_MAX[0] ;
            A397TBM31_DEL_FLG = H000Z2_A397TBM31_DEL_FLG[0] ;
            n397TBM31_DEL_FLG = H000Z2_n397TBM31_DEL_FLG[0] ;
            A643TBM31_STATUS = H000Z2_A643TBM31_STATUS[0] ;
            n643TBM31_STATUS = H000Z2_n643TBM31_STATUS[0] ;
            A943TBM31_REPEAT_FLG = H000Z2_A943TBM31_REPEAT_FLG[0] ;
            n943TBM31_REPEAT_FLG = H000Z2_n943TBM31_REPEAT_FLG[0] ;
            A393TBM31_CRF_NM = H000Z2_A393TBM31_CRF_NM[0] ;
            n393TBM31_CRF_NM = H000Z2_n393TBM31_CRF_NM[0] ;
            A395TBM31_ORDER = H000Z2_A395TBM31_ORDER[0] ;
            n395TBM31_ORDER = H000Z2_n395TBM31_ORDER[0] ;
            /* Execute user event: e340Z2 */
            e340Z2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(183) ;
         wb0Z0( ) ;
      }
      nGXsfl_183_Refreshing = (short)(0) ;
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
                                           AV11H_CRF_NM ,
                                           AV16H_STATUS ,
                                           AV12H_DEL_FLG ,
                                           A393TBM31_CRF_NM ,
                                           A643TBM31_STATUS ,
                                           A397TBM31_DEL_FLG ,
                                           AV15H_SRCH_FLG ,
                                           new Long(AV18P_STUDY_ID) ,
                                           new Long(A68TBM31_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV11H_CRF_NM = GXutil.padr( GXutil.rtrim( AV11H_CRF_NM), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
      /* Using cursor H000Z3 */
      pr_default.execute(1, new Object[] {new Long(AV18P_STUDY_ID), AV15H_SRCH_FLG, lV11H_CRF_NM, AV16H_STATUS, AV12H_DEL_FLG});
      GRID1_nRecordCount = H000Z3_AGRID1_nRecordCount[0] ;
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

   public void strup0Z0( )
   {
      /* Before Start, stand alone formulas. */
      AV40Pgmname = "B402_WP07_CRF_LIST" ;
      AV39Pgmdesc = "試験登録（CRF一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_space_Enabled = 0 ;
      edtavD_grd_repeat_Enabled = 0 ;
      edtavD_grd_visit_no_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e320Z2 */
      e320Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV10H_A_PAGING_SDT);
         /* Read variables values. */
         AV7D_CRF_NM = httpContext.cgiGet( edtavD_crf_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_NM", AV7D_CRF_NM);
         AV9D_STATUS = httpContext.cgiGet( radavD_status.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_STATUS", AV9D_STATUS);
         AV8D_DEL_FLG = httpContext.cgiGet( radavD_del_flg.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_DEL_FLG", AV8D_DEL_FLG);
         AV13H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         AV15H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
         AV14H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
         AV11H_CRF_NM = httpContext.cgiGet( edtavH_crf_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
         AV16H_STATUS = httpContext.cgiGet( edtavH_status_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_STATUS", AV16H_STATUS);
         AV12H_DEL_FLG = httpContext.cgiGet( edtavH_del_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_DEL_FLG", AV12H_DEL_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         /* Read saved values. */
         nRC_GXsfl_183 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_183"), ".", ",")) ;
         AV17P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV18P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0217") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0217", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV15H_SRCH_FLG) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_CRF_NM"), AV11H_CRF_NM) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_STATUS"), AV16H_STATUS) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DEL_FLG"), AV12H_DEL_FLG) != 0 )
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
      /* Execute user event: e320Z2 */
      e320Z2 ();
      if (returnInSub) return;
   }

   public void e320Z2( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      AV6C_GAMEN_TITLE = AV39Pgmdesc ;
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
      AV33D_SPACE = "　" ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV20W_A_LOGIN_SDT,AV5C_APP_ID,AV6C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0217",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e330Z2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV13H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "INFO", "画面起動") ;
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
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
   }

   private void e340Z2( )
   {
      /* Grid1_Load Routine */
      edtTBM31_STUDY_ID_Visible = 0 ;
      if ( A943TBM31_REPEAT_FLG == 0 )
      {
         AV34D_GRD_REPEAT = "" ;
      }
      else
      {
         AV34D_GRD_REPEAT = "（最大：" + GXutil.trim( GXutil.str( A944TBM31_REPEAT_MAX, 10, 0)) + "）" ;
      }
      AV35D_GRD_VISIT_NO = "" ;
      /* Using cursor H000Z4 */
      pr_default.execute(2, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A945TBM44_STUDY_ID = H000Z4_A945TBM44_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
         A946TBM44_CRF_ID = H000Z4_A946TBM44_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
         A948TBM44_VISIT_NO = H000Z4_A948TBM44_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
         n948TBM44_VISIT_NO = H000Z4_n948TBM44_VISIT_NO[0] ;
         A947TBM44_CRF_EDA_NO = H000Z4_A947TBM44_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
         AV35D_GRD_VISIT_NO = AV35D_GRD_VISIT_NO + ((GXutil.strcmp("", AV35D_GRD_VISIT_NO)==0) ? "" : ",") ;
         AV35D_GRD_VISIT_NO = AV35D_GRD_VISIT_NO + GXutil.trim( GXutil.str( A948TBM44_VISIT_NO, 10, 0)) ;
         if ( A947TBM44_CRF_EDA_NO > 5 )
         {
            AV35D_GRD_VISIT_NO = AV35D_GRD_VISIT_NO + "・・・" ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV30W_REG_ENABEL && ( GXutil.strcmp(A643TBM31_STATUS, "1") != 0 ) && ( GXutil.strcmp(A397TBM31_DEL_FLG, "0") == 0 ) )
      {
         lblTxt_crf_copy_Visible = 1 ;
         lblTxt_btn_edit_Visible = 1 ;
         lblTxt_btn_edit_Linktarget = "_blank" ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp11_crf_designer"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(A68TBM31_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A69TBM31_CRF_ID,4,0))) ;
         lblTxt_btn_edit_Link = formatLink("b402_wp11_crf_designer") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         lblTxt_crf_copy_Visible = 0 ;
         lblTxt_btn_edit_Visible = 0 ;
         lblTxt_btn_edit_Linktarget = "" ;
         lblTxt_btn_edit_Link = "" ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(183) ;
      }
      sendrow_1832( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   public void e110Z2( )
   {
      /* 'BTN_CHK' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( AV30W_REG_ENABEL )
      {
         GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem1[0] = AV19W_A_CHK_RESULT_SDT ;
         GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem2[0] = AV21W_A_RESULT_MSG_SDT ;
         new b402_pc16_crf_ref_chk(remoteHandle, context).execute( AV18P_STUDY_ID, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem1, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem2) ;
         AV19W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem1[0] ;
         AV21W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
         if ( AV21W_A_RESULT_MSG_SDT.size() > 0 )
         {
            AV42GXV2 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42GXV2", GXutil.ltrim( GXutil.str( AV42GXV2, 8, 0)));
            while ( AV42GXV2 <= AV21W_A_RESULT_MSG_SDT.size() )
            {
               AV22W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV21W_A_RESULT_MSG_SDT.elementAt(-1+AV42GXV2));
               httpContext.GX_msglist.addItem(AV22W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
               AV42GXV2 = (int)(AV42GXV2+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42GXV2", GXutil.ltrim( GXutil.str( AV42GXV2, 8, 0)));
            }
         }
      }
   }

   public void e120Z2( )
   {
      /* 'BTN_REG' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( AV30W_REG_ENABEL )
      {
         AV31W_SESSION.setValue(AV40Pgmname+"_PAGE", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp08_crf_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("b402_wp08_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e130Z2( )
   {
      /* 'BTN_SRCH' Routine */
      AV15H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
   }

   public void e140Z2( )
   {
      /* 'BTN_CLER' Routine */
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
   }

   public void e150Z2( )
   {
      /* 'BTN_LSIT_IMPORT' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( AV30W_REG_ENABEL )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp09_import_csv"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(2,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) ;
         httpContext.wjLoc = formatLink("b402_wp09_import_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e160Z2( )
   {
      /* 'BTN_PART_IMPORT' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( AV30W_REG_ENABEL )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp09_import_csv"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) ;
         httpContext.wjLoc = formatLink("b402_wp09_import_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e170Z2( )
   {
      /* 'BTN_CAN' Routine */
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp02_study_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp02_study_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e350Z2( )
   {
      /* 'BTN_SEL' Routine */
      AV31W_SESSION.setValue(AV40Pgmname+"_PAGE", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp08_crf_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(A68TBM31_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(GXutil.trim( GXutil.str( A69TBM31_CRF_ID, 4, 0)))) ;
      httpContext.wjLoc = formatLink("b402_wp08_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e360Z2( )
   {
      /* 'BTN_CRF_COPY' Routine */
      AV28W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
      /* Using cursor H000Z5 */
      pr_default.execute(3, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A70TBM32_STUDY_ID = H000Z5_A70TBM32_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
         A71TBM32_CRF_ID = H000Z5_A71TBM32_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
         AV28W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Z6 */
         pr_default.execute(4, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A76TBM33_STUDY_ID = H000Z6_A76TBM33_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A76TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A76TBM33_STUDY_ID, 10, 0)));
            A77TBM33_CRF_ID = H000Z6_A77TBM33_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A77TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A77TBM33_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Z7 */
         pr_default.execute(5, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A28TBM34_STUDY_ID = H000Z7_A28TBM34_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A28TBM34_STUDY_ID", GXutil.ltrim( GXutil.str( A28TBM34_STUDY_ID, 10, 0)));
            A29TBM34_CRF_ID = H000Z7_A29TBM34_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A29TBM34_CRF_ID", GXutil.ltrim( GXutil.str( A29TBM34_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Z8 */
         pr_default.execute(6, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A31TBM35_STUDY_ID = H000Z8_A31TBM35_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
            A32TBM35_CRF_ID = H000Z8_A32TBM35_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Z9 */
         pr_default.execute(7, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A35TBM36_STUDY_ID = H000Z9_A35TBM36_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A35TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A35TBM36_STUDY_ID, 10, 0)));
            A36TBM36_CRF_ID = H000Z9_A36TBM36_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A36TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A36TBM36_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(7);
         }
         pr_default.close(7);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Z10 */
         pr_default.execute(8, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A79TBM37_STUDY_ID = H000Z10_A79TBM37_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
            A80TBM37_CRF_ID = H000Z10_A80TBM37_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(8);
         }
         pr_default.close(8);
      }
      if ( ! AV28W_ERRFLG )
      {
         /* Using cursor H000Z11 */
         pr_default.execute(9, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A19TBM41_STUDY_ID = H000Z11_A19TBM41_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A19TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A19TBM41_STUDY_ID, 10, 0)));
            A20TBM41_CRF_ID = H000Z11_A20TBM41_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A20TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A20TBM41_CRF_ID, 4, 0)));
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(9);
         }
         pr_default.close(9);
      }
      if ( ! AV28W_ERRFLG )
      {
         AV31W_SESSION.setValue(AV40Pgmname+"_PAGE", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp10_crf_ref_crt"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(A68TBM31_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A69TBM31_CRF_ID,4,0))) ;
         httpContext.wjLoc = formatLink("b402_wp10_crf_ref_crt") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         GXt_char3 = AV29W_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00065", "", "", "", "", "", GXv_char4) ;
         b402_wp07_crf_list_impl.this.GXt_char3 = GXv_char4[0] ;
         AV29W_MSG = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         GXt_char3 = AV24W_A821_JS ;
         GXv_char4[0] = GXt_char3 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK", AV29W_MSG, "", "", "", GXv_char4) ;
         b402_wp07_crf_list_impl.this.GXt_char3 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
         AV24W_A821_JS = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H000Z12 */
      pr_default.execute(10, new Object[] {new Long(AV18P_STUDY_ID)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A63TBM21_STUDY_ID = H000Z12_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H000Z12_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H000Z12_n367TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      if ( AV17P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV31W_SESSION.getValue(AV40Pgmname+"_PAGE"))) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      else
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S152( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
      cmbTBM31_STATUS.removeAllItems();
      cmbTBM31_STATUS.addItem("", "", (short)(0));
      cmbTBM31_STATUS.addItem("0", gxdomainct_status.getDescription(httpContext,(String)"0"), (short)(0));
      cmbTBM31_STATUS.addItem("1", gxdomainct_status.getDescription(httpContext,(String)"1"), (short)(0));
      cmbTBM31_STATUS.addItem("9", gxdomainct_status.getDescription(httpContext,(String)"9"), (short)(0));
      cmbTBM31_DEL_FLG.removeAllItems();
      cmbTBM31_DEL_FLG.addItem("", "", (short)(0));
      AV52GXV4 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52GXV4", GXutil.ltrim( GXutil.str( AV52GXV4, 8, 0)));
      AV51GXV3 = gxdomainct_del_flg.getValues() ;
      while ( AV52GXV4 <= AV51GXV3.size() )
      {
         AV26W_DEL_FLG = (String)AV51GXV3.elementAt(-1+AV52GXV4) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_DEL_FLG", AV26W_DEL_FLG);
         cmbTBM31_DEL_FLG.addItem(AV26W_DEL_FLG, gxdomainct_del_flg.getDescription(httpContext,(String)AV26W_DEL_FLG), (short)(0));
         AV52GXV4 = (int)(AV52GXV4+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52GXV4", GXutil.ltrim( GXutil.str( AV52GXV4, 8, 0)));
      }
      radavD_status.removeAllItems();
      radavD_status.addItem("", "全て", (short)(0));
      radavD_status.addItem("0", gxdomainct_status.getDescription(httpContext,(String)"0"), (short)(0));
      radavD_status.addItem("1", gxdomainct_status.getDescription(httpContext,(String)"1"), (short)(0));
      radavD_status.addItem("9", gxdomainct_status.getDescription(httpContext,(String)"9"), (short)(0));
      radavD_del_flg.removeAllItems();
      radavD_del_flg.addItem("", "全て", (short)(0));
      radavD_del_flg.addItem("0", gxdomainct_del_flg.getDescription(httpContext,(String)"0"), (short)(0));
      radavD_del_flg.addItem("1", gxdomainct_del_flg.getDescription(httpContext,(String)"1"), (short)(0));
   }

   public void S202( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV31W_SESSION.setValue(AV40Pgmname+"_CRF_NM", AV7D_CRF_NM);
      AV31W_SESSION.setValue(AV40Pgmname+"_STATUS", AV9D_STATUS);
      AV31W_SESSION.setValue(AV40Pgmname+"_DEL_FLG", AV8D_DEL_FLG);
      AV31W_SESSION.setValue(AV40Pgmname+"_SRCH_FLG", AV15H_SRCH_FLG);
   }

   public void S232( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV7D_CRF_NM = AV31W_SESSION.getValue(AV40Pgmname+"_CRF_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_NM", AV7D_CRF_NM);
      AV9D_STATUS = AV31W_SESSION.getValue(AV40Pgmname+"_STATUS") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_STATUS", AV9D_STATUS);
      AV8D_DEL_FLG = AV31W_SESSION.getValue(AV40Pgmname+"_DEL_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_DEL_FLG", AV8D_DEL_FLG);
      AV15H_SRCH_FLG = AV31W_SESSION.getValue(AV40Pgmname+"_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV31W_SESSION.remove(AV40Pgmname+"_CRF_NM");
      AV31W_SESSION.remove(AV40Pgmname+"_STATUS");
      AV31W_SESSION.remove(AV40Pgmname+"_DEL_FLG");
      AV31W_SESSION.remove(AV40Pgmname+"_SRCH_FLG");
   }

   public void S212( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV11H_CRF_NM = AV7D_CRF_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
      AV16H_STATUS = AV9D_STATUS ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_STATUS", AV16H_STATUS);
      AV12H_DEL_FLG = AV8D_DEL_FLG ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_DEL_FLG", AV12H_DEL_FLG);
   }

   public void S192( )
   {
      /* 'SUB_GET_PROC_ENABLE' Routine */
      GXt_boolean5 = AV30W_REG_ENABEL ;
      GXv_boolean6[0] = GXt_boolean5 ;
      new b402_pc22_is_study_run(remoteHandle, context).execute( AV18P_STUDY_ID, GXv_boolean6) ;
      b402_wp07_crf_list_impl.this.GXt_boolean5 = GXv_boolean6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
      GXt_boolean7 = AV30W_REG_ENABEL ;
      GXv_boolean8[0] = GXt_boolean7 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV14H_KNGN_FLG, "", GXv_boolean8) ;
      b402_wp07_crf_list_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
      AV30W_REG_ENABEL = (GXt_boolean5 ? false : GXt_boolean7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30W_REG_ENABEL", AV30W_REG_ENABEL);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT9[0] = AV20W_A_LOGIN_SDT;
      GXv_char4[0] = AV27W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT9, GXv_char4) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT9[0] ;
      b402_wp07_crf_list_impl.this.AV27W_ERRCD = GXv_char4[0] ;
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
      AV7D_CRF_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_CRF_NM", AV7D_CRF_NM);
      AV9D_STATUS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_STATUS", AV9D_STATUS);
      AV8D_DEL_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_DEL_FLG", AV8D_DEL_FLG);
      AV11H_CRF_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_CRF_NM", AV11H_CRF_NM);
      AV16H_STATUS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_STATUS", AV16H_STATUS);
      AV12H_DEL_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_DEL_FLG", AV12H_DEL_FLG);
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV15H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_SRCH_FLG", AV15H_SRCH_FLG);
      AV23W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_A819_JS", AV23W_A819_JS);
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
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

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char4[0] = AV14H_KNGN_FLG ;
      GXv_char10[0] = AV27W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV5C_APP_ID, GXv_char4, GXv_char10) ;
      b402_wp07_crf_list_impl.this.AV14H_KNGN_FLG = GXv_char4[0] ;
      b402_wp07_crf_list_impl.this.AV27W_ERRCD = GXv_char10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_KNGN_FLG", AV14H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRCD", AV27W_ERRCD);
      if ( GXutil.strcmp(AV27W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S242( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp07_crf_list");
   }

   public void e180Z2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e190Z2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      else
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e200Z2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e210Z2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e220Z2( )
   {
      /* 'PAGE01' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e230Z2( )
   {
      /* 'PAGE02' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e240Z2( )
   {
      /* 'PAGE03' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e250Z2( )
   {
      /* 'PAGE04' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e260Z2( )
   {
      /* 'PAGE05' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e270Z2( )
   {
      /* 'PAGE06' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e280Z2( )
   {
      /* 'PAGE07' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e290Z2( )
   {
      /* 'PAGE08' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e300Z2( )
   {
      /* 'PAGE09' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e310Z2( )
   {
      /* 'PAGE10' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT11[0] = AV10H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT11) ;
      AV10H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT11[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_list_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV15H_SRCH_FLG, "1") == 0 ) && ! AV28W_ERRFLG )
         {
            GXt_char3 = AV29W_MSG ;
            GXv_char10[0] = GXt_char3 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char10) ;
            b402_wp07_crf_list_impl.this.GXt_char3 = GXv_char10[0] ;
            AV29W_MSG = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_MSG", AV29W_MSG);
            httpContext.GX_msglist.addItem(AV29W_MSG);
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

   public void S162( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      lblTxt_btn_reg_Visible = (AV30W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_chk_Visible = (AV30W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_chk_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_chk_Visible, 5, 0)));
      lblTxt_btn_lsit_import_Visible = (AV30W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_lsit_import_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_lsit_import_Visible, 5, 0)));
      lblTxt_btn_part_import_Visible = (AV30W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_part_import_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_part_import_Visible, 5, 0)));
   }

   public void wb_table2_219_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV13H_INIT_FLG), GXutil.rtrim( localUtil.format( AV13H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(223);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV15H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV15H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV14H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV14H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(225);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP07_CRF_LIST.htm");
         wb_table3_226_0Z2( true) ;
      }
      else
      {
         wb_table3_226_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table3_226_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 242,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(242);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_219_0Z2e( true) ;
      }
      else
      {
         wb_table2_219_0Z2e( false) ;
      }
   }

   public void wb_table3_226_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "CRF名称", "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_crf_nm_Internalname, GXutil.rtrim( AV11H_CRF_NM), GXutil.rtrim( localUtil.format( AV11H_CRF_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_crf_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, "状態", "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_status_Internalname, GXutil.rtrim( AV16H_STATUS), GXutil.rtrim( localUtil.format( AV16H_STATUS, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_status_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, "削除フラグ", "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_del_flg_Internalname, GXutil.rtrim( AV12H_DEL_FLG), GXutil.rtrim( localUtil.format( AV12H_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_del_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_226_0Z2e( true) ;
      }
      else
      {
         wb_table3_226_0Z2e( false) ;
      }
   }

   public void wb_table1_2_0Z2( boolean wbgen )
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
         wb_table4_6_0Z2( true) ;
      }
      else
      {
         wb_table4_6_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_0Z2e( boolean wbgen )
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
         wb_table1_2_0Z2e( true) ;
      }
      else
      {
         wb_table1_2_0Z2e( false) ;
      }
   }

   public void wb_table4_6_0Z2( boolean wbgen )
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
         wb_table5_12_0Z2( true) ;
      }
      else
      {
         wb_table5_12_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table5_12_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table6_26_0Z2( true) ;
      }
      else
      {
         wb_table6_26_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table6_26_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0217"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0217"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0217"+"");
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
         wb_table4_6_0Z2e( true) ;
      }
      else
      {
         wb_table4_6_0Z2e( false) ;
      }
   }

   public void wb_table6_26_0Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_29_0Z2( true) ;
      }
      else
      {
         wb_table7_29_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table7_29_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_26_0Z2e( true) ;
      }
      else
      {
         wb_table6_26_0Z2e( false) ;
      }
   }

   public void wb_table7_29_0Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_32_0Z2( true) ;
      }
      else
      {
         wb_table8_32_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table8_32_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         wb_table9_65_0Z2( true) ;
      }
      else
      {
         wb_table9_65_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table9_65_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_29_0Z2e( true) ;
      }
      else
      {
         wb_table7_29_0Z2e( false) ;
      }
   }

   public void wb_table9_65_0Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_list_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_list_Internalname, tblTbl_list_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:25px\">") ;
         wb_table10_68_0Z2( true) ;
      }
      else
      {
         wb_table10_68_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table10_68_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table11_164_0Z2( true) ;
      }
      else
      {
         wb_table11_164_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table11_164_0Z2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"183\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 935, 10, 0)) + "px" + ";" ;
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
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 935, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridBase");
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
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_sel_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV33D_SPACE));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_space_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A393TBM31_CRF_NM));
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A943TBM31_REPEAT_FLG, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV34D_GRD_REPEAT));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_repeat_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV35D_GRD_VISIT_NO));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_visit_no_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A643TBM31_STATUS));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A397TBM31_DEL_FLG));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_crf_copy_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_btn_edit_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTBM31_STUDY_ID_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 183 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_183 = (short)(nGXsfl_183_idx-1) ;
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
         wb_table9_65_0Z2e( true) ;
      }
      else
      {
         wb_table9_65_0Z2e( false) ;
      }
   }

   public void wb_table11_164_0Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 1035, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_in_grid_header_Internalname, tblTbl_in_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, "表示順", "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "CRF", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, "繰返し使用", "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, "デフォルト<br>VISIT番号", "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(1), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:70px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "状態", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:70px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, "削除", "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:60px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:40px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_164_0Z2e( true) ;
      }
      else
      {
         wb_table11_164_0Z2e( false) ;
      }
   }

   public void wb_table10_68_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_74_0Z2( true) ;
      }
      else
      {
         wb_table12_74_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table12_74_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_68_0Z2e( true) ;
      }
      else
      {
         wb_table10_68_0Z2e( false) ;
      }
   }

   public void wb_table12_74_0Z2( boolean wbgen )
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
         wb_table13_77_0Z2( true) ;
      }
      else
      {
         wb_table13_77_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table13_77_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_83_0Z2( true) ;
      }
      else
      {
         wb_table14_83_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table14_83_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_89_0Z2( true) ;
      }
      else
      {
         wb_table15_89_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table15_89_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_95_0Z2( true) ;
      }
      else
      {
         wb_table16_95_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table16_95_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_101_0Z2( true) ;
      }
      else
      {
         wb_table17_101_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table17_101_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_107_0Z2( true) ;
      }
      else
      {
         wb_table18_107_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table18_107_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_113_0Z2( true) ;
      }
      else
      {
         wb_table19_113_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table19_113_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_119_0Z2( true) ;
      }
      else
      {
         wb_table20_119_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table20_119_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_125_0Z2( true) ;
      }
      else
      {
         wb_table21_125_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table21_125_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_131_0Z2( true) ;
      }
      else
      {
         wb_table22_131_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table22_131_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_137_0Z2( true) ;
      }
      else
      {
         wb_table23_137_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table23_137_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_143_0Z2( true) ;
      }
      else
      {
         wb_table24_143_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table24_143_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_149_0Z2( true) ;
      }
      else
      {
         wb_table25_149_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table25_149_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_155_0Z2( true) ;
      }
      else
      {
         wb_table26_155_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table26_155_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_74_0Z2e( true) ;
      }
      else
      {
         wb_table12_74_0Z2e( false) ;
      }
   }

   public void wb_table26_155_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_155_0Z2e( true) ;
      }
      else
      {
         wb_table26_155_0Z2e( false) ;
      }
   }

   public void wb_table25_149_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_149_0Z2e( true) ;
      }
      else
      {
         wb_table25_149_0Z2e( false) ;
      }
   }

   public void wb_table24_143_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_143_0Z2e( true) ;
      }
      else
      {
         wb_table24_143_0Z2e( false) ;
      }
   }

   public void wb_table23_137_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_137_0Z2e( true) ;
      }
      else
      {
         wb_table23_137_0Z2e( false) ;
      }
   }

   public void wb_table22_131_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_131_0Z2e( true) ;
      }
      else
      {
         wb_table22_131_0Z2e( false) ;
      }
   }

   public void wb_table21_125_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_125_0Z2e( true) ;
      }
      else
      {
         wb_table21_125_0Z2e( false) ;
      }
   }

   public void wb_table20_119_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_119_0Z2e( true) ;
      }
      else
      {
         wb_table20_119_0Z2e( false) ;
      }
   }

   public void wb_table19_113_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_113_0Z2e( true) ;
      }
      else
      {
         wb_table19_113_0Z2e( false) ;
      }
   }

   public void wb_table18_107_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_107_0Z2e( true) ;
      }
      else
      {
         wb_table18_107_0Z2e( false) ;
      }
   }

   public void wb_table17_101_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_101_0Z2e( true) ;
      }
      else
      {
         wb_table17_101_0Z2e( false) ;
      }
   }

   public void wb_table16_95_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_95_0Z2e( true) ;
      }
      else
      {
         wb_table16_95_0Z2e( false) ;
      }
   }

   public void wb_table15_89_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_89_0Z2e( true) ;
      }
      else
      {
         wb_table15_89_0Z2e( false) ;
      }
   }

   public void wb_table14_83_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_83_0Z2e( true) ;
      }
      else
      {
         wb_table14_83_0Z2e( false) ;
      }
   }

   public void wb_table13_77_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_77_0Z2e( true) ;
      }
      else
      {
         wb_table13_77_0Z2e( false) ;
      }
   }

   public void wb_table8_32_0Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 935, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px;width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"5\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "CRF名", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crf_nm_Internalname, GXutil.rtrim( AV7D_CRF_NM), GXutil.rtrim( localUtil.format( AV7D_CRF_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_crf_nm_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "状態", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Radio button */
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_status, radavD_status.getInternalname(), GXutil.rtrim( AV9D_STATUS), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavD_status.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(46);\"", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "削除", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:220px\">") ;
         /* Radio button */
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_183_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_del_flg, radavD_del_flg.getInternalname(), GXutil.rtrim( AV8D_DEL_FLG), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavD_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(50);\"", "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"6\" >") ;
         wb_table27_53_0Z2( true) ;
      }
      else
      {
         wb_table27_53_0Z2( false) ;
      }
      return  ;
   }

   public void wb_table27_53_0Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_32_0Z2e( true) ;
      }
      else
      {
         wb_table8_32_0Z2e( false) ;
      }
   }

   public void wb_table27_53_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "検索（F5）", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "クリア（F6）", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_53_0Z2e( true) ;
      }
      else
      {
         wb_table27_53_0Z2e( false) ;
      }
   }

   public void wb_table5_12_0Z2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_chk_Internalname, "整合性チェック（F2）", "", "", lblTxt_btn_chk_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CHK\\'."+"'", "", "TextBlockBtnList150", 5, "", lblTxt_btn_chk_Visible, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "新規（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_lsit_import_Internalname, "選択肢一覧取込（F7）", "", "", lblTxt_btn_lsit_import_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_LSIT_IMPORT\\'."+"'", "", "TextBlockBtnList150", 5, "", lblTxt_btn_lsit_import_Visible, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_part_import_Internalname, "部品取込（F8）", "", "", lblTxt_btn_part_import_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_PART_IMPORT\\'."+"'", "", "TextBlockBtnList120", 5, "", lblTxt_btn_part_import_Visible, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "戻る（F11）", "", "", lblTxt_btn_can_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B402_WP07_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_0Z2e( true) ;
      }
      else
      {
         wb_table5_12_0Z2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV17P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
      AV18P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
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
      pa0Z2( ) ;
      ws0Z2( ) ;
      we0Z2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2017731717333");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp07_crf_list.js", "?2017731717334");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1832( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_183_idx ;
      edtTBM31_ORDER_Internalname = "TBM31_ORDER_"+sGXsfl_183_idx ;
      edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_183_idx ;
      edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_183_idx ;
      edtTBM31_CRF_NM_Internalname = "TBM31_CRF_NM_"+sGXsfl_183_idx ;
      cmbTBM31_REPEAT_FLG.setInternalname( "TBM31_REPEAT_FLG_"+sGXsfl_183_idx );
      edtavD_grd_repeat_Internalname = "vD_GRD_REPEAT_"+sGXsfl_183_idx ;
      edtavD_grd_visit_no_Internalname = "vD_GRD_VISIT_NO_"+sGXsfl_183_idx ;
      cmbTBM31_STATUS.setInternalname( "TBM31_STATUS_"+sGXsfl_183_idx );
      cmbTBM31_DEL_FLG.setInternalname( "TBM31_DEL_FLG_"+sGXsfl_183_idx );
      lblTxt_crf_copy_Internalname = "TXT_CRF_COPY_"+sGXsfl_183_idx ;
      lblTxt_btn_edit_Internalname = "TXT_BTN_EDIT_"+sGXsfl_183_idx ;
      edtTBM31_STUDY_ID_Internalname = "TBM31_STUDY_ID_"+sGXsfl_183_idx ;
   }

   public void subsflControlProps_fel_1832( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_183_fel_idx ;
      edtTBM31_ORDER_Internalname = "TBM31_ORDER_"+sGXsfl_183_fel_idx ;
      edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_183_fel_idx ;
      edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_183_fel_idx ;
      edtTBM31_CRF_NM_Internalname = "TBM31_CRF_NM_"+sGXsfl_183_fel_idx ;
      cmbTBM31_REPEAT_FLG.setInternalname( "TBM31_REPEAT_FLG_"+sGXsfl_183_fel_idx );
      edtavD_grd_repeat_Internalname = "vD_GRD_REPEAT_"+sGXsfl_183_fel_idx ;
      edtavD_grd_visit_no_Internalname = "vD_GRD_VISIT_NO_"+sGXsfl_183_fel_idx ;
      cmbTBM31_STATUS.setInternalname( "TBM31_STATUS_"+sGXsfl_183_fel_idx );
      cmbTBM31_DEL_FLG.setInternalname( "TBM31_DEL_FLG_"+sGXsfl_183_fel_idx );
      lblTxt_crf_copy_Internalname = "TXT_CRF_COPY_"+sGXsfl_183_fel_idx ;
      lblTxt_btn_edit_Internalname = "TXT_BTN_EDIT_"+sGXsfl_183_fel_idx ;
      edtTBM31_STUDY_ID_Internalname = "TBM31_STUDY_ID_"+sGXsfl_183_fel_idx ;
   }

   public void sendrow_1832( )
   {
      subsflControlProps_1832( ) ;
      wb0Z0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_183_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_183_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_183_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_183_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_183_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_183_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grid_Internalname+"_"+sGXsfl_183_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"",new Integer(1035),"","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_SEL\\'."+sGXsfl_183_idx+"'","","TextBlockBtn040s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Single line edit */
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM31_ORDER_Internalname,GXutil.ltrim( localUtil.ntoc( A395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A395TBM31_ORDER), "ZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM31_ORDER_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(5),"chr",new Integer(1),"row",new Integer(5),new Integer(0),new Integer(0),new Integer(183),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM31_CRF_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A69TBM31_CRF_ID), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM31_CRF_ID_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(183),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_CRF_ID","right"});
         /* Single line edit */
         TempTags = " " + ((edtavD_space_Enabled!=0)&&(edtavD_space_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 194,'',false,'"+sGXsfl_183_idx+"',183)\"" : " ") ;
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_space_Internalname,GXutil.rtrim( AV33D_SPACE),"",TempTags+((edtavD_space_Enabled!=0)&&(edtavD_space_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_space_Enabled!=0)&&(edtavD_space_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(194);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_space_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavD_space_Enabled),new Integer(0),"text","",new Integer(1),"chr",new Integer(1),"row",new Integer(1),new Integer(0),new Integer(0),new Integer(183),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Single line edit */
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM31_CRF_NM_Internalname,GXutil.rtrim( A393TBM31_CRF_NM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM31_CRF_NM_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(183),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:90px\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable5_Internalname+"_"+sGXsfl_183_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         if ( ( nGXsfl_183_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TBM31_REPEAT_FLG_" + sGXsfl_183_idx ;
            cmbTBM31_REPEAT_FLG.setName( GXCCtl );
            cmbTBM31_REPEAT_FLG.setWebtags( "" );
            cmbTBM31_REPEAT_FLG.addItem("0", "不可", (short)(0));
            cmbTBM31_REPEAT_FLG.addItem("1", "可", (short)(0));
            if ( cmbTBM31_REPEAT_FLG.getItemCount() > 0 )
            {
               A943TBM31_REPEAT_FLG = (byte)(GXutil.lval( cmbTBM31_REPEAT_FLG.getValidValue(GXutil.trim( GXutil.str( A943TBM31_REPEAT_FLG, 1, 0))))) ;
               n943TBM31_REPEAT_FLG = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTBM31_REPEAT_FLG,cmbTBM31_REPEAT_FLG.getInternalname(),GXutil.trim( GXutil.str( A943TBM31_REPEAT_FLG, 1, 0)),new Integer(1),cmbTBM31_REPEAT_FLG.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",new Integer(1),new Integer(0),new Integer(0),new Integer(0),new Integer(1),"chr",new Integer(0),"","","Attribute","","","",new Boolean(true)});
         cmbTBM31_REPEAT_FLG.setValue( GXutil.trim( GXutil.str( A943TBM31_REPEAT_FLG, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTBM31_REPEAT_FLG.getInternalname(), "Values", cmbTBM31_REPEAT_FLG.ToJavascriptSource());
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_repeat_Enabled!=0)&&(edtavD_grd_repeat_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 202,'',false,'"+sGXsfl_183_idx+"',183)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_repeat_Internalname,GXutil.rtrim( AV34D_GRD_REPEAT),"",TempTags+((edtavD_grd_repeat_Enabled!=0)&&(edtavD_grd_repeat_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_repeat_Enabled!=0)&&(edtavD_grd_repeat_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(202);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_repeat_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_repeat_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(183),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Div Control */
         Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection1_Internalname+"_"+sGXsfl_183_idx,new Integer(1),new Integer(98),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_visit_no_Enabled!=0)&&(edtavD_grd_visit_no_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 205,'',false,'"+sGXsfl_183_idx+"',183)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_visit_no_Internalname,GXutil.rtrim( AV35D_GRD_VISIT_NO),"",TempTags+((edtavD_grd_visit_no_Enabled!=0)&&(edtavD_grd_visit_no_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_visit_no_Enabled!=0)&&(edtavD_grd_visit_no_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(205);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_visit_no_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_visit_no_Enabled),new Integer(0),"text","",new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(183),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:70px\""});
         if ( ( nGXsfl_183_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TBM31_STATUS_" + sGXsfl_183_idx ;
            cmbTBM31_STATUS.setName( GXCCtl );
            cmbTBM31_STATUS.setWebtags( "" );
            if ( cmbTBM31_STATUS.getItemCount() > 0 )
            {
               A643TBM31_STATUS = cmbTBM31_STATUS.getValidValue(A643TBM31_STATUS) ;
               n643TBM31_STATUS = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTBM31_STATUS,cmbTBM31_STATUS.getInternalname(),GXutil.rtrim( A643TBM31_STATUS),new Integer(1),cmbTBM31_STATUS.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(1),new Integer(0),new Integer(0),new Integer(0),new Integer(1),"chr",new Integer(0),"","","ReadonlyAttribute","","","",new Boolean(true)});
         cmbTBM31_STATUS.setValue( GXutil.rtrim( A643TBM31_STATUS) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTBM31_STATUS.getInternalname(), "Values", cmbTBM31_STATUS.ToJavascriptSource());
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:70px\""});
         if ( ( nGXsfl_183_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TBM31_DEL_FLG_" + sGXsfl_183_idx ;
            cmbTBM31_DEL_FLG.setName( GXCCtl );
            cmbTBM31_DEL_FLG.setWebtags( "" );
            if ( cmbTBM31_DEL_FLG.getItemCount() > 0 )
            {
               A397TBM31_DEL_FLG = cmbTBM31_DEL_FLG.getValidValue(A397TBM31_DEL_FLG) ;
               n397TBM31_DEL_FLG = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTBM31_DEL_FLG,cmbTBM31_DEL_FLG.getInternalname(),GXutil.rtrim( A397TBM31_DEL_FLG),new Integer(1),cmbTBM31_DEL_FLG.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(1),new Integer(0),new Integer(0),new Integer(0),new Integer(1),"chr",new Integer(0),"","","ReadonlyAttribute","","","",new Boolean(true)});
         cmbTBM31_DEL_FLG.setValue( GXutil.rtrim( A397TBM31_DEL_FLG) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTBM31_DEL_FLG.getInternalname(), "Values", cmbTBM31_DEL_FLG.ToJavascriptSource());
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:60px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_crf_copy_Internalname,"参照作成","","",lblTxt_crf_copy_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_CRF_COPY\\'."+sGXsfl_183_idx+"'","","TextBlockBtn060s",new Integer(5),"",new Integer(lblTxt_crf_copy_Visible),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:40px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_btn_edit_Internalname,"編集",lblTxt_btn_edit_Link,lblTxt_btn_edit_Linktarget,lblTxt_btn_edit_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlockBtn040s",new Integer(0),"",new Integer(lblTxt_btn_edit_Visible),new Integer(1),new Integer(0)});
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
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM31_STUDY_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A68TBM31_STUDY_ID), "ZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM31_STUDY_ID_Jsonclick,new Integer(0),"Attribute","color:#FF0000;",ROClassString,"",new Integer(edtTBM31_STUDY_ID_Visible),new Integer(0),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(183),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_STUDY_ID","right"});
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
               if ( ((int)((nGXsfl_183_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_183_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_183_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_183_idx+1)) ;
         sGXsfl_183_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_183_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1832( ) ;
      }
      /* End function sendrow_1832 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_chk_Internalname = "TXT_BTN_CHK" ;
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_lsit_import_Internalname = "TXT_BTN_LSIT_IMPORT" ;
      lblTxt_btn_part_import_Internalname = "TXT_BTN_PART_IMPORT" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavD_crf_nm_Internalname = "vD_CRF_NM" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      radavD_status.setInternalname( "vD_STATUS" );
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      radavD_del_flg.setInternalname( "vD_DEL_FLG" );
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
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
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      tblTbl_in_grid_header_Internalname = "TBL_IN_GRID_HEADER" ;
      tblTable5_Internalname = "TABLE5" ;
      divSection1_Internalname = "SECTION1" ;
      tblTbl_grid_Internalname = "TBL_GRID" ;
      tblTbl_list_Internalname = "TBL_LIST" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtavH_crf_nm_Internalname = "vH_CRF_NM" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtavH_status_Internalname = "vH_STATUS" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtavH_del_flg_Internalname = "vH_DEL_FLG" ;
      tblTable7_Internalname = "TABLE7" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtTBM31_STUDY_ID_Jsonclick = "" ;
      lblTxt_btn_edit_Linktarget = "" ;
      lblTxt_btn_edit_Link = "" ;
      lblTxt_btn_edit_Visible = 1 ;
      lblTxt_crf_copy_Visible = 1 ;
      cmbTBM31_DEL_FLG.setJsonclick( "" );
      cmbTBM31_STATUS.setJsonclick( "" );
      edtavD_grd_visit_no_Jsonclick = "" ;
      edtavD_grd_visit_no_Visible = 1 ;
      edtavD_grd_repeat_Jsonclick = "" ;
      edtavD_grd_repeat_Visible = 1 ;
      cmbTBM31_REPEAT_FLG.setJsonclick( "" );
      edtTBM31_CRF_NM_Jsonclick = "" ;
      edtavD_space_Jsonclick = "" ;
      edtavD_space_Visible = 1 ;
      edtTBM31_CRF_ID_Jsonclick = "" ;
      edtTBM31_ORDER_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridBase" ;
      lblTxt_btn_part_import_Visible = 1 ;
      lblTxt_btn_lsit_import_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      lblTxt_btn_chk_Visible = 1 ;
      radavD_del_flg.setJsonclick( "" );
      radavD_status.setJsonclick( "" );
      edtavD_crf_nm_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtTBM31_STUDY_ID_Visible = 1 ;
      lblTxt_btn_edit_Caption = "編集" ;
      lblTxt_crf_copy_Caption = "参照作成" ;
      edtavD_grd_visit_no_Enabled = 1 ;
      edtavD_grd_repeat_Enabled = 1 ;
      edtavD_space_Enabled = 1 ;
      lblBtn_sel_Caption = "選択" ;
      edtavH_del_flg_Jsonclick = "" ;
      edtavH_status_Jsonclick = "" ;
      edtavH_crf_nm_Jsonclick = "" ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
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
      lblTxt_study_Caption = "試験名" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Width = 935 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
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
                  /* Execute user subroutine: S242 */
                  S242 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV33D_SPACE = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV15H_SRCH_FLG = "" ;
      AV11H_CRF_NM = "" ;
      AV16H_STATUS = "" ;
      AV12H_DEL_FLG = "" ;
      AV10H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV40Pgmname = "" ;
      AV5C_APP_ID = "" ;
      A367TBM21_STUDY_NM = "" ;
      AV24W_A821_JS = "" ;
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
      edtTBM31_ORDER_Internalname = "" ;
      edtTBM31_CRF_ID_Internalname = "" ;
      edtavD_space_Internalname = "" ;
      A393TBM31_CRF_NM = "" ;
      edtTBM31_CRF_NM_Internalname = "" ;
      AV34D_GRD_REPEAT = "" ;
      edtavD_grd_repeat_Internalname = "" ;
      AV35D_GRD_VISIT_NO = "" ;
      edtavD_grd_visit_no_Internalname = "" ;
      A643TBM31_STATUS = "" ;
      A397TBM31_DEL_FLG = "" ;
      edtTBM31_STUDY_ID_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      lV11H_CRF_NM = "" ;
      H000Z2_A68TBM31_STUDY_ID = new long[1] ;
      H000Z2_A69TBM31_CRF_ID = new short[1] ;
      H000Z2_A944TBM31_REPEAT_MAX = new byte[1] ;
      H000Z2_n944TBM31_REPEAT_MAX = new boolean[] {false} ;
      H000Z2_A397TBM31_DEL_FLG = new String[] {""} ;
      H000Z2_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H000Z2_A643TBM31_STATUS = new String[] {""} ;
      H000Z2_n643TBM31_STATUS = new boolean[] {false} ;
      H000Z2_A943TBM31_REPEAT_FLG = new byte[1] ;
      H000Z2_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      H000Z2_A393TBM31_CRF_NM = new String[] {""} ;
      H000Z2_n393TBM31_CRF_NM = new boolean[] {false} ;
      H000Z2_A395TBM31_ORDER = new int[1] ;
      H000Z2_n395TBM31_ORDER = new boolean[] {false} ;
      H000Z3_AGRID1_nRecordCount = new long[1] ;
      AV39Pgmdesc = "" ;
      AV7D_CRF_NM = "" ;
      AV9D_STATUS = "" ;
      AV8D_DEL_FLG = "" ;
      AV13H_INIT_FLG = "" ;
      AV14H_KNGN_FLG = "" ;
      AV6C_GAMEN_TITLE = "" ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      H000Z4_A945TBM44_STUDY_ID = new long[1] ;
      H000Z4_A946TBM44_CRF_ID = new short[1] ;
      H000Z4_A948TBM44_VISIT_NO = new int[1] ;
      H000Z4_n948TBM44_VISIT_NO = new boolean[] {false} ;
      H000Z4_A947TBM44_CRF_EDA_NO = new byte[1] ;
      AV19W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem1 = new GxObjectCollection [1] ;
      AV21W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem2 = new GxObjectCollection [1] ;
      AV22W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV31W_SESSION = httpContext.getWebSession();
      H000Z5_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      H000Z5_A70TBM32_STUDY_ID = new long[1] ;
      H000Z5_A71TBM32_CRF_ID = new short[1] ;
      H000Z6_A78TBM33_COND_NO = new short[1] ;
      H000Z6_A76TBM33_STUDY_ID = new long[1] ;
      H000Z6_A77TBM33_CRF_ID = new short[1] ;
      H000Z7_A30TBM34_STYDY_AUTH_CD = new String[] {""} ;
      H000Z7_A28TBM34_STUDY_ID = new long[1] ;
      H000Z7_A29TBM34_CRF_ID = new short[1] ;
      H000Z8_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      H000Z8_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      H000Z8_A31TBM35_STUDY_ID = new long[1] ;
      H000Z8_A32TBM35_CRF_ID = new short[1] ;
      H000Z9_A37TBM36_COND_NO = new short[1] ;
      H000Z9_A38TBM36_SELECT_CRF_ID = new short[1] ;
      H000Z9_A35TBM36_STUDY_ID = new long[1] ;
      H000Z9_A36TBM36_CRF_ID = new short[1] ;
      H000Z10_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      H000Z10_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      H000Z10_A79TBM37_STUDY_ID = new long[1] ;
      H000Z10_A80TBM37_CRF_ID = new short[1] ;
      H000Z11_A21TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      H000Z11_A22TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      H000Z11_A19TBM41_STUDY_ID = new long[1] ;
      H000Z11_A20TBM41_CRF_ID = new short[1] ;
      AV29W_MSG = "" ;
      H000Z12_A63TBM21_STUDY_ID = new long[1] ;
      H000Z12_A367TBM21_STUDY_NM = new String[] {""} ;
      H000Z12_n367TBM21_STUDY_NM = new boolean[] {false} ;
      AV51GXV3 = new GxObjectCollection(String.class, "internal", "");
      AV26W_DEL_FLG = "" ;
      GXv_boolean6 = new boolean [1] ;
      GXv_boolean8 = new boolean [1] ;
      GXv_SdtA_LOGIN_SDT9 = new SdtA_LOGIN_SDT [1] ;
      AV27W_ERRCD = "" ;
      AV23W_A819_JS = "" ;
      GXv_char4 = new String [1] ;
      GXv_SdtA_PAGING_SDT11 = new SdtA_PAGING_SDT [1] ;
      GXt_char3 = "" ;
      GXv_char10 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock41_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
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
      lblTxt_study_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTxt_btn_chk_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_lsit_import_Jsonclick = "" ;
      lblTxt_btn_part_import_Jsonclick = "" ;
      lblTxt_btn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblBtn_sel_Internalname = "" ;
      lblTxt_crf_copy_Internalname = "" ;
      lblTxt_btn_edit_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblBtn_sel_Jsonclick = "" ;
      ROClassString = "" ;
      lblTxt_crf_copy_Jsonclick = "" ;
      lblTxt_btn_edit_Jsonclick = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp07_crf_list__default(),
         new Object[] {
             new Object[] {
            H000Z2_A68TBM31_STUDY_ID, H000Z2_A69TBM31_CRF_ID, H000Z2_A944TBM31_REPEAT_MAX, H000Z2_n944TBM31_REPEAT_MAX, H000Z2_A397TBM31_DEL_FLG, H000Z2_n397TBM31_DEL_FLG, H000Z2_A643TBM31_STATUS, H000Z2_n643TBM31_STATUS, H000Z2_A943TBM31_REPEAT_FLG, H000Z2_n943TBM31_REPEAT_FLG,
            H000Z2_A393TBM31_CRF_NM, H000Z2_n393TBM31_CRF_NM, H000Z2_A395TBM31_ORDER, H000Z2_n395TBM31_ORDER
            }
            , new Object[] {
            H000Z3_AGRID1_nRecordCount
            }
            , new Object[] {
            H000Z4_A945TBM44_STUDY_ID, H000Z4_A946TBM44_CRF_ID, H000Z4_A948TBM44_VISIT_NO, H000Z4_n948TBM44_VISIT_NO, H000Z4_A947TBM44_CRF_EDA_NO
            }
            , new Object[] {
            H000Z5_A72TBM32_CRF_ITEM_CD, H000Z5_A70TBM32_STUDY_ID, H000Z5_A71TBM32_CRF_ID
            }
            , new Object[] {
            H000Z6_A78TBM33_COND_NO, H000Z6_A76TBM33_STUDY_ID, H000Z6_A77TBM33_CRF_ID
            }
            , new Object[] {
            H000Z7_A30TBM34_STYDY_AUTH_CD, H000Z7_A28TBM34_STUDY_ID, H000Z7_A29TBM34_CRF_ID
            }
            , new Object[] {
            H000Z8_A33TBM35_CRF_ITEM_CD, H000Z8_A34TBM35_STUDY_AUTH_CD, H000Z8_A31TBM35_STUDY_ID, H000Z8_A32TBM35_CRF_ID
            }
            , new Object[] {
            H000Z9_A37TBM36_COND_NO, H000Z9_A38TBM36_SELECT_CRF_ID, H000Z9_A35TBM36_STUDY_ID, H000Z9_A36TBM36_CRF_ID
            }
            , new Object[] {
            H000Z10_A81TBM37_CRF_ITEM_GRP_DIV, H000Z10_A82TBM37_CRF_ITEM_GRP_CD, H000Z10_A79TBM37_STUDY_ID, H000Z10_A80TBM37_CRF_ID
            }
            , new Object[] {
            H000Z11_A21TBM41_CRF_ITEM_GRP_DIV, H000Z11_A22TBM41_CRF_ITEM_GRP_CD, H000Z11_A19TBM41_STUDY_ID, H000Z11_A20TBM41_CRF_ID
            }
            , new Object[] {
            H000Z12_A63TBM21_STUDY_ID, H000Z12_A367TBM21_STUDY_NM, H000Z12_n367TBM21_STUDY_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "B402_WP07_CRF_LIST" ;
      AV39Pgmdesc = "試験登録（CRF一覧）" ;
      /* GeneXus formulas. */
      AV40Pgmname = "B402_WP07_CRF_LIST" ;
      AV39Pgmdesc = "試験登録（CRF一覧）" ;
      Gx_err = (short)(0) ;
      edtavD_space_Enabled = 0 ;
      edtavD_grd_repeat_Enabled = 0 ;
      edtavD_grd_visit_no_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV17P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV17P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte A944TBM31_REPEAT_MAX ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte A943TBM31_REPEAT_FLG ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_183 ;
   private short nGXsfl_183_idx=1 ;
   private short A946TBM44_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short A69TBM31_CRF_ID ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_183_Refreshing=0 ;
   private short Gx_err ;
   private short A71TBM32_CRF_ID ;
   private short A77TBM33_CRF_ID ;
   private short A29TBM34_CRF_ID ;
   private short A32TBM35_CRF_ID ;
   private short A36TBM36_CRF_ID ;
   private short A80TBM37_CRF_ID ;
   private short A20TBM41_CRF_ID ;
   private int A948TBM44_VISIT_NO ;
   private int subGrid1_Rows ;
   private int A395TBM31_ORDER ;
   private int subGrid1_Islastpage ;
   private int subGrid1_Width ;
   private int GXPagingFrom2 ;
   private int edtavD_space_Enabled ;
   private int edtavD_grd_repeat_Enabled ;
   private int edtavD_grd_visit_no_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtTBM31_STUDY_ID_Visible ;
   private int lblTxt_crf_copy_Visible ;
   private int lblTxt_btn_edit_Visible ;
   private int AV42GXV2 ;
   private int AV52GXV4 ;
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
   private int tblTbl_list_Visible ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_chk_Visible ;
   private int lblTxt_btn_lsit_import_Visible ;
   private int lblTxt_btn_part_import_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_space_Visible ;
   private int edtavD_grd_repeat_Visible ;
   private int edtavD_grd_visit_no_Visible ;
   private long wcpOAV18P_STUDY_ID ;
   private long AV18P_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long A63TBM21_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long GXPagingTo2 ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long A70TBM32_STUDY_ID ;
   private long A76TBM33_STUDY_ID ;
   private long A28TBM34_STUDY_ID ;
   private long A31TBM35_STUDY_ID ;
   private long A35TBM36_STUDY_ID ;
   private long A79TBM37_STUDY_ID ;
   private long A19TBM41_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_183_idx="0001" ;
   private String AV33D_SPACE ;
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
   private String edtTBM31_ORDER_Internalname ;
   private String edtTBM31_CRF_ID_Internalname ;
   private String edtavD_space_Internalname ;
   private String edtTBM31_CRF_NM_Internalname ;
   private String edtavD_grd_repeat_Internalname ;
   private String edtavD_grd_visit_no_Internalname ;
   private String edtTBM31_STUDY_ID_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV39Pgmdesc ;
   private String edtavD_crf_nm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_crf_nm_Internalname ;
   private String edtavH_status_Internalname ;
   private String edtavH_del_flg_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblTxt_btn_edit_Linktarget ;
   private String lblTxt_btn_edit_Link ;
   private String lblTxt_study_Caption ;
   private String lblTxt_study_Internalname ;
   private String GXv_char4[] ;
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
   private String tblTbl_list_Internalname ;
   private String GXt_char3 ;
   private String GXv_char10[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_chk_Internalname ;
   private String lblTxt_btn_lsit_import_Internalname ;
   private String lblTxt_btn_part_import_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtavH_crf_nm_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtavH_status_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtavH_del_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String lblBtn_sel_Caption ;
   private String lblTxt_crf_copy_Caption ;
   private String lblTxt_btn_edit_Caption ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
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
   private String lblTxt_study_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtavD_crf_nm_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_chk_Jsonclick ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_lsit_import_Jsonclick ;
   private String lblTxt_btn_part_import_Jsonclick ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String lblBtn_sel_Internalname ;
   private String lblTxt_crf_copy_Internalname ;
   private String lblTxt_btn_edit_Internalname ;
   private String sGXsfl_183_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_Internalname ;
   private String lblBtn_sel_Jsonclick ;
   private String ROClassString ;
   private String edtTBM31_ORDER_Jsonclick ;
   private String edtTBM31_CRF_ID_Jsonclick ;
   private String edtavD_space_Jsonclick ;
   private String edtTBM31_CRF_NM_Jsonclick ;
   private String tblTable5_Internalname ;
   private String edtavD_grd_repeat_Jsonclick ;
   private String divSection1_Internalname ;
   private String edtavD_grd_visit_no_Jsonclick ;
   private String lblTxt_crf_copy_Jsonclick ;
   private String lblTxt_btn_edit_Jsonclick ;
   private String edtTBM31_STUDY_ID_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV30W_REG_ENABEL ;
   private boolean AV28W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n395TBM31_ORDER ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n943TBM31_REPEAT_FLG ;
   private boolean n643TBM31_STATUS ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n944TBM31_REPEAT_MAX ;
   private boolean returnInSub ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean GXt_boolean5 ;
   private boolean GXv_boolean6[] ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String AV15H_SRCH_FLG ;
   private String AV11H_CRF_NM ;
   private String AV16H_STATUS ;
   private String AV12H_DEL_FLG ;
   private String AV5C_APP_ID ;
   private String A367TBM21_STUDY_NM ;
   private String AV24W_A821_JS ;
   private String A393TBM31_CRF_NM ;
   private String AV34D_GRD_REPEAT ;
   private String AV35D_GRD_VISIT_NO ;
   private String A643TBM31_STATUS ;
   private String A397TBM31_DEL_FLG ;
   private String lV11H_CRF_NM ;
   private String AV7D_CRF_NM ;
   private String AV9D_STATUS ;
   private String AV8D_DEL_FLG ;
   private String AV13H_INIT_FLG ;
   private String AV14H_KNGN_FLG ;
   private String AV6C_GAMEN_TITLE ;
   private String AV29W_MSG ;
   private String AV26W_DEL_FLG ;
   private String AV27W_ERRCD ;
   private String AV23W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice radavD_status ;
   private HTMLChoice radavD_del_flg ;
   private HTMLChoice cmbTBM31_REPEAT_FLG ;
   private HTMLChoice cmbTBM31_STATUS ;
   private HTMLChoice cmbTBM31_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private long[] H000Z2_A68TBM31_STUDY_ID ;
   private short[] H000Z2_A69TBM31_CRF_ID ;
   private byte[] H000Z2_A944TBM31_REPEAT_MAX ;
   private boolean[] H000Z2_n944TBM31_REPEAT_MAX ;
   private String[] H000Z2_A397TBM31_DEL_FLG ;
   private boolean[] H000Z2_n397TBM31_DEL_FLG ;
   private String[] H000Z2_A643TBM31_STATUS ;
   private boolean[] H000Z2_n643TBM31_STATUS ;
   private byte[] H000Z2_A943TBM31_REPEAT_FLG ;
   private boolean[] H000Z2_n943TBM31_REPEAT_FLG ;
   private String[] H000Z2_A393TBM31_CRF_NM ;
   private boolean[] H000Z2_n393TBM31_CRF_NM ;
   private int[] H000Z2_A395TBM31_ORDER ;
   private boolean[] H000Z2_n395TBM31_ORDER ;
   private long[] H000Z3_AGRID1_nRecordCount ;
   private long[] H000Z4_A945TBM44_STUDY_ID ;
   private short[] H000Z4_A946TBM44_CRF_ID ;
   private int[] H000Z4_A948TBM44_VISIT_NO ;
   private boolean[] H000Z4_n948TBM44_VISIT_NO ;
   private byte[] H000Z4_A947TBM44_CRF_EDA_NO ;
   private String[] H000Z5_A72TBM32_CRF_ITEM_CD ;
   private long[] H000Z5_A70TBM32_STUDY_ID ;
   private short[] H000Z5_A71TBM32_CRF_ID ;
   private short[] H000Z6_A78TBM33_COND_NO ;
   private long[] H000Z6_A76TBM33_STUDY_ID ;
   private short[] H000Z6_A77TBM33_CRF_ID ;
   private String[] H000Z7_A30TBM34_STYDY_AUTH_CD ;
   private long[] H000Z7_A28TBM34_STUDY_ID ;
   private short[] H000Z7_A29TBM34_CRF_ID ;
   private String[] H000Z8_A33TBM35_CRF_ITEM_CD ;
   private String[] H000Z8_A34TBM35_STUDY_AUTH_CD ;
   private long[] H000Z8_A31TBM35_STUDY_ID ;
   private short[] H000Z8_A32TBM35_CRF_ID ;
   private short[] H000Z9_A37TBM36_COND_NO ;
   private short[] H000Z9_A38TBM36_SELECT_CRF_ID ;
   private long[] H000Z9_A35TBM36_STUDY_ID ;
   private short[] H000Z9_A36TBM36_CRF_ID ;
   private String[] H000Z10_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] H000Z10_A82TBM37_CRF_ITEM_GRP_CD ;
   private long[] H000Z10_A79TBM37_STUDY_ID ;
   private short[] H000Z10_A80TBM37_CRF_ID ;
   private String[] H000Z11_A21TBM41_CRF_ITEM_GRP_DIV ;
   private String[] H000Z11_A22TBM41_CRF_ITEM_GRP_CD ;
   private long[] H000Z11_A19TBM41_STUDY_ID ;
   private short[] H000Z11_A20TBM41_CRF_ID ;
   private long[] H000Z12_A63TBM21_STUDY_ID ;
   private String[] H000Z12_A367TBM21_STUDY_NM ;
   private boolean[] H000Z12_n367TBM21_STUDY_NM ;
   private com.genexus.webpanels.WebSession AV31W_SESSION ;
   private GxObjectCollection AV19W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem1[] ;
   private GxObjectCollection AV21W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem2[] ;
   private GxObjectCollection AV51GXV3 ;
   private SdtA_PAGING_SDT AV10H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT11[] ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT9[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV22W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_wp07_crf_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV11H_CRF_NM ,
                                          String AV16H_STATUS ,
                                          String AV12H_DEL_FLG ,
                                          String A393TBM31_CRF_NM ,
                                          String A643TBM31_STATUS ,
                                          String A397TBM31_DEL_FLG ,
                                          String AV15H_SRCH_FLG ,
                                          long AV18P_STUDY_ID ,
                                          long A68TBM31_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int12 ;
      GXv_int12 = new byte [7] ;
      Object[] GXv_Object13 ;
      GXv_Object13 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " `TBM31_STUDY_ID`, `TBM31_CRF_ID`, `TBM31_REPEAT_MAX`, `TBM31_DEL_FLG`, `TBM31_STATUS`," ;
      sSelectString = sSelectString + " `TBM31_REPEAT_FLG`, `TBM31_CRF_NM`, `TBM31_ORDER`" ;
      sFromString = " FROM `TBM31_CRF`" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (`TBM31_STUDY_ID` = ?)" ;
      sWhereString = sWhereString + " and (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV11H_CRF_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_CRF_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16H_STATUS)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_STATUS` = ?)" ;
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12H_DEL_FLG)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_DEL_FLG` = ?)" ;
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY `TBM31_STUDY_ID`, `TBM31_ORDER`, `TBM31_CRF_ID`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_H000Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV11H_CRF_NM ,
                                          String AV16H_STATUS ,
                                          String AV12H_DEL_FLG ,
                                          String A393TBM31_CRF_NM ,
                                          String A643TBM31_STATUS ,
                                          String A397TBM31_DEL_FLG ,
                                          String AV15H_SRCH_FLG ,
                                          long AV18P_STUDY_ID ,
                                          long A68TBM31_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int14 ;
      GXv_int14 = new byte [5] ;
      Object[] GXv_Object15 ;
      GXv_Object15 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_STUDY_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV11H_CRF_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_CRF_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16H_STATUS)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_STATUS` = ?)" ;
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12H_DEL_FLG)==0) )
      {
         sWhereString = sWhereString + " and (`TBM31_DEL_FLG` = ?)" ;
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_H000Z2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
            case 1 :
                  return conditional_H000Z3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H000Z4", "SELECT `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_VISIT_NO`, `TBM44_CRF_EDA_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H000Z5", "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_STUDY_ID`, `TBM32_CRF_ID` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Z6", "SELECT `TBM33_COND_NO`, `TBM33_STUDY_ID`, `TBM33_CRF_ID` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` = ? ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Z7", "SELECT `TBM34_STYDY_AUTH_CD`, `TBM34_STUDY_ID`, `TBM34_CRF_ID` FROM `TBM34_CRF_AUTH` WHERE `TBM34_STUDY_ID` = ? and `TBM34_CRF_ID` = ? ORDER BY `TBM34_STUDY_ID`, `TBM34_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Z8", "SELECT `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_STUDY_ID`, `TBM35_CRF_ID` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ? ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Z9", "SELECT `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_STUDY_ID`, `TBM36_CRF_ID` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` = ? ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Z10", "SELECT `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_STUDY_ID`, `TBM37_CRF_ID` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` = ? ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Z11", "SELECT `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_STUDY_ID`, `TBM41_CRF_ID` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ? ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000Z12", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 1);
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
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 1);
               }
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

