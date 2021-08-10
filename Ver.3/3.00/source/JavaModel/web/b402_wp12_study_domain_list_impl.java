/*
               File: b402_wp12_study_domain_list_impl
        Description: 試験登録（ドメイン選択）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:23:49.86
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp12_study_domain_list_impl extends GXWebPanel
{
   public b402_wp12_study_domain_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp12_study_domain_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp12_study_domain_list_impl.class ));
   }

   public b402_wp12_study_domain_list_impl( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            nRC_GXsfl_159 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_159_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_159_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_159, nGXsfl_159_idx, sGXsfl_159_idx) ;
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
         pa122( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws122( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we122( ) ;
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
      httpContext.writeValue( "試験登録（ドメイン選択）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513235014");
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
      GXEncryptionTmp = "b402_wp12_study_domain_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp12_study_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm122( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "B402_sd06_study_domain_c", AV5B402_SD06_STUDY_DOMAIN_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("B402_sd06_study_domain_c", AV5B402_SD06_STUDY_DOMAIN_C);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV15H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV15H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_159", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_159, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV45Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV9C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_APP_ID", GetHash( "", String.valueOf(AV9C_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV20P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV23W_A821_JS));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vB402_SD06_STUDY_DOMAIN_C", AV5B402_SD06_STUDY_DOMAIN_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vB402_SD06_STUDY_DOMAIN_C", AV5B402_SD06_STUDY_DOMAIN_C);
      }
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV28W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "TBM02_ORDER", GXutil.ltrim( localUtil.ntoc( A614TBM02_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM02_DEL_FLG", GXutil.rtrim( A615TBM02_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM02_DOM_CD", GXutil.rtrim( A49TBM02_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM02_DOM_JNM", GXutil.rtrim( A611TBM02_DOM_JNM));
      GxWebStd.gx_hidden_field( httpContext, "TBM42_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A203TBM42_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM42_DOM_CD", GXutil.rtrim( A204TBM42_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM42_DEL_FLG", GXutil.rtrim( A893TBM42_DEL_FLG));
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
      return "B402_WP12_STUDY_DOMAIN_LIST" ;
   }

   public String getPgmdesc( )
   {
      return "試験登録（ドメイン選択）" ;
   }

   public void wb120( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_122( true) ;
      }
      else
      {
         wb_table1_2_122( false) ;
      }
      return  ;
   }

   public void wb_table1_2_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_177_122( true) ;
      }
      else
      {
         wb_table2_177_122( false) ;
      }
      return  ;
   }

   public void wb_table2_177_122e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start122( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験登録（ドメイン選択）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0175") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0175", "");
         }
      }
      wbErr = false ;
      strup120( ) ;
   }

   public void ws122( )
   {
      start122( ) ;
      evt122( ) ;
   }

   public void evt122( )
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
                        /* Execute user event: e11122 */
                        e11122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12122 */
                        e12122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13122 */
                        e13122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD_ALL_CHK.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14122 */
                        e14122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15122 */
                        e15122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16122 */
                        e16122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e17122 */
                        e17122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e18122 */
                        e18122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e19122 */
                        e19122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e20122 */
                        e20122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e21122 */
                        e21122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e22122 */
                        e22122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e23122 */
                        e23122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e24122 */
                        e24122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e25122 */
                        e25122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e26122 */
                        e26122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e27122 */
                        e27122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e28122 */
                        e28122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e29122 */
                        e29122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT01_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e30122 */
                        e30122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT01_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e31122 */
                        e31122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT02_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e32122 */
                        e32122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT02_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e33122 */
                        e33122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT03_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e34122 */
                        e34122 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT03_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e35122 */
                        e35122 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'BTN_EDIT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "'BTN_ITEM_LIST'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'BTN_EDIT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "'BTN_ITEM_LIST'") == 0 ) )
                     {
                        nGXsfl_159_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_159_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_159_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1592( ) ;
                        AV39GXV1 = (short)(nGXsfl_159_idx+GRID1_nFirstRecordOnPage) ;
                        if ( ( AV5B402_SD06_STUDY_DOMAIN_C.size() >= AV39GXV1 ) && ( AV39GXV1 > 0 ) )
                        {
                           AV5B402_SD06_STUDY_DOMAIN_C.currentItem( ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)) );
                           ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)).setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check( GXutil.strtobool( httpContext.cgiGet( chkavCtlcheck.getInternalname())) );
                           ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)).setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd( httpContext.cgiGet( edtavCtldom_cd_Internalname) );
                           ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)).setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm( httpContext.cgiGet( edtavCtldom_jnm_Internalname) );
                           AV34D_GRD_DEL = httpContext.cgiGet( edtavD_grd_del_Internalname) ;
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0175") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0175", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0175") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0175", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e36122 */
                              e36122 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e37122 */
                              e37122 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e38122 */
                              e38122 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_EDIT'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e39122 */
                              e39122 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_ITEM_LIST'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e40122 */
                              e40122 ();
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
                  else if ( nCmpId == 175 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0175") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0175", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we122( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm122( ) ;
         }
      }
   }

   public void pa122( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp12_study_domain_list")), "b402_wp12_study_domain_list") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp12_study_domain_list"))) ;
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
               }
            }
         }
         chkavD_grd_all_chk.setName( "vD_GRD_ALL_CHK" );
         chkavD_grd_all_chk.setWebtags( "" );
         chkavD_grd_all_chk.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd_all_chk.getInternalname(), "Caption", chkavD_grd_all_chk.getCaption());
         chkavD_grd_all_chk.setCheckedValue( "false" );
         GXCCtl = "CTLCHECK_" + sGXsfl_159_idx ;
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

   public void gxnrgrid1_newrow( short nRC_GXsfl_159 ,
                                 short nGXsfl_159_idx ,
                                 String sGXsfl_159_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1592( ) ;
      while ( nGXsfl_159_idx <= nRC_GXsfl_159 )
      {
         sendrow_1592( ) ;
         nGXsfl_159_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_159_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_159_idx+1)) ;
         sGXsfl_159_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_159_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1592( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf122( ) ;
      /* End function Refresh */
   }

   public void rf122( )
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
      wbStart = (short)(159) ;
      nGXsfl_159_idx = (short)(1) ;
      sGXsfl_159_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_159_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1592( ) ;
      nGXsfl_159_Refreshing = (short)(1) ;
      /* Execute user event: e37122 */
      e37122 ();
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
         subsflControlProps_1592( ) ;
         /* Execute user event: e38122 */
         e38122 ();
         wbEnd = (short)(159) ;
         wb120( ) ;
      }
      nGXsfl_159_Refreshing = (short)(0) ;
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
      return AV5B402_SD06_STUDY_DOMAIN_C.size() ;
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

   public void strup120( )
   {
      /* Before Start, stand alone formulas. */
      AV45Pgmname = "B402_WP12_STUDY_DOMAIN_LIST" ;
      AV44Pgmdesc = "試験登録（ドメイン選択）" ;
      Gx_err = (short)(0) ;
      edtavCtldom_cd_Enabled = 0 ;
      edtavCtldom_jnm_Enabled = 0 ;
      edtavD_grd_del_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e36122 */
      e36122 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "B402_sd06_study_domain_c"), AV5B402_SD06_STUDY_DOMAIN_C);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV15H_A_PAGING_SDT);
         /* Read variables values. */
         AV11D_GRD_ALL_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_all_chk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_ALL_CHK", AV11D_GRD_ALL_CHK);
         AV17H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_INIT_FLG", AV17H_INIT_FLG);
         AV19H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_SRCH_FLG", AV19H_SRCH_FLG);
         AV18H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_KNGN_FLG", AV18H_KNGN_FLG);
         AV16H_DISP_DATETIME = httpContext.cgiGet( edtavH_disp_datetime_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_DISP_DATETIME", AV16H_DISP_DATETIME);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_asdc_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_asdc_kbn_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SORT_ASDC_KBN");
            GX_FocusControl = edtavH_sort_asdc_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35H_SORT_ASDC_KBN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ASDC_KBN, 4, 0)));
         }
         else
         {
            AV35H_SORT_ASDC_KBN = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_sort_asdc_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ASDC_KBN, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_item_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_item_kbn_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SORT_ITEM_KBN");
            GX_FocusControl = edtavH_sort_item_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36H_SORT_ITEM_KBN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV36H_SORT_ITEM_KBN, 4, 0)));
         }
         else
         {
            AV36H_SORT_ITEM_KBN = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_sort_item_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV36H_SORT_ITEM_KBN, 4, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_159 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_159"), ".", ",")) ;
         AV20P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0175") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0175", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_GXsfl_159 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_159"), ".", ",")) ;
         nGXsfl_159_fel_idx = (short)(0) ;
         while ( nGXsfl_159_fel_idx < nRC_GXsfl_159 )
         {
            nGXsfl_159_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_159_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_159_fel_idx+1)) ;
            sGXsfl_159_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_159_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1592( ) ;
            AV39GXV1 = (short)(nGXsfl_159_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV39GXV1 = (short)(nGXsfl_159_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV5B402_SD06_STUDY_DOMAIN_C.size() >= AV39GXV1 ) && ( AV39GXV1 > 0 ) )
            {
               AV5B402_SD06_STUDY_DOMAIN_C.currentItem( ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)) );
               ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)).setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check( GXutil.strtobool( httpContext.cgiGet( chkavCtlcheck.getInternalname())) );
               ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)).setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd( httpContext.cgiGet( edtavCtldom_cd_Internalname) );
               ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)).setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm( httpContext.cgiGet( edtavCtldom_jnm_Internalname) );
               AV34D_GRD_DEL = httpContext.cgiGet( edtavD_grd_del_Internalname) ;
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0175") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0175", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0175") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0175", "");
            }
            AV5B402_SD06_STUDY_DOMAIN_C.currentItem( ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)) );
         }
         if ( nGXsfl_159_fel_idx == 0 )
         {
            nGXsfl_159_idx = (short)(1) ;
            sGXsfl_159_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_159_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1592( ) ;
         }
         nGXsfl_159_fel_idx = (short)(1) ;
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
      /* Execute user event: e36122 */
      e36122 ();
      if (returnInSub) return;
   }

   public void e36122( )
   {
      /* Start Routine */
      AV9C_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_APP_ID", AV9C_APP_ID);
      AV10C_GAMEN_TITLE = AV44Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10C_GAMEN_TITLE", AV10C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV17H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_INIT_FLG", AV17H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      AV29W_GRID_READ_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29W_GRID_READ_FLG", AV29W_GRID_READ_FLG);
      if ( (GXutil.strcmp("", AV16H_DISP_DATETIME)==0) )
      {
         GXt_char1 = AV16H_DISP_DATETIME ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
         b402_wp12_study_domain_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16H_DISP_DATETIME = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_DISP_DATETIME", AV16H_DISP_DATETIME);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV21W_A_LOGIN_SDT,AV9C_APP_ID,AV10C_GAMEN_TITLE,AV16H_DISP_DATETIME});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0175",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
   }

   public void e37122( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV17H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV45Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      AV17H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17H_INIT_FLG", AV17H_INIT_FLG);
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

   private void e38122( )
   {
      /* Grid1_Load Routine */
      AV39GXV1 = (short)(1) ;
      while ( AV39GXV1 <= AV5B402_SD06_STUDY_DOMAIN_C.size() )
      {
         AV5B402_SD06_STUDY_DOMAIN_C.currentItem( ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5B402_SD06_STUDY_DOMAIN_C", AV5B402_SD06_STUDY_DOMAIN_C);
         if ( GXutil.strcmp(((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)(AV5B402_SD06_STUDY_DOMAIN_C.currentItem())).getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg(), "0") == 0 )
         {
            AV34D_GRD_DEL = "利用可能" ;
         }
         else if ( GXutil.strcmp(((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)(AV5B402_SD06_STUDY_DOMAIN_C.currentItem())).getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg(), "1") == 0 )
         {
            AV34D_GRD_DEL = "利用不可" ;
         }
         else
         {
            AV34D_GRD_DEL = "" ;
         }
         if ( ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)(AV5B402_SD06_STUDY_DOMAIN_C.currentItem())).getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg() )
         {
            lblBtn_edit_Visible = 1 ;
            lblBtn_item_list_Visible = 1 ;
         }
         else
         {
            lblBtn_edit_Visible = 0 ;
            lblBtn_item_list_Visible = 0 ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(159) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1592( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         AV39GXV1 = (short)(AV39GXV1+1) ;
      }
   }

   public void e39122( )
   {
      /* 'BTN_EDIT' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp13_domain_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)(AV5B402_SD06_STUDY_DOMAIN_C.currentItem())).getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd())) ;
      httpContext.wjLoc = formatLink("b402_wp13_domain_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e40122( )
   {
      /* 'BTN_ITEM_LIST' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp14_study_cdisc_item_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)(AV5B402_SD06_STUDY_DOMAIN_C.currentItem())).getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd())) ;
      httpContext.wjLoc = formatLink("b402_wp14_study_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e14122( )
   {
      /* D_grd_all_chk_Click Routine */
      AV46GXV6 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GXV6", GXutil.ltrim( GXutil.str( AV46GXV6, 8, 0)));
      while ( AV46GXV6 <= AV5B402_SD06_STUDY_DOMAIN_C.size() )
      {
         AV6B402_SD06_STUDY_DOMAIN_I = (SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV46GXV6));
         AV6B402_SD06_STUDY_DOMAIN_I.setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check( AV11D_GRD_ALL_CHK );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B402_SD06_STUDY_DOMAIN_I", AV6B402_SD06_STUDY_DOMAIN_I);
         AV46GXV6 = (int)(AV46GXV6+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46GXV6", GXutil.ltrim( GXutil.str( AV46GXV6, 8, 0)));
      }
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void e11122( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV18H_KNGN_FLG, "") )
      {
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         if ( AV25W_ERR_CD == 0 )
         {
            GXt_char1 = AV30W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
            b402_wp12_study_domain_list_impl.this.GXt_char1 = GXv_char2[0] ;
            AV30W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30W_MSG", AV30W_MSG);
            GXt_char1 = AV23W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV30W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
            b402_wp12_study_domain_list_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30W_MSG", AV30W_MSG);
            AV23W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_A821_JS", AV23W_A821_JS);
         }
         else
         {
            httpContext.GX_msglist.addItem(AV30W_MSG);
         }
      }
   }

   public void e15122( )
   {
      /* 'BTN_REG_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV18H_KNGN_FLG, "") )
      {
         AV28W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
         AV47GXV7 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47GXV7", GXutil.ltrim( GXutil.str( AV47GXV7, 8, 0)));
         while ( AV47GXV7 <= AV5B402_SD06_STUDY_DOMAIN_C.size() )
         {
            AV6B402_SD06_STUDY_DOMAIN_I = (SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV47GXV7));
            if ( AV6B402_SD06_STUDY_DOMAIN_I.getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg() )
            {
               if ( ! AV6B402_SD06_STUDY_DOMAIN_I.getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check() )
               {
                  /* Using cursor H00122 */
                  pr_default.execute(0, new Object[] {new Long(AV20P_STUDY_ID), AV6B402_SD06_STUDY_DOMAIN_I.getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd()});
                  while ( (pr_default.getStatus(0) != 101) )
                  {
                     A201TBM43_DOM_CD = H00122_A201TBM43_DOM_CD[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A201TBM43_DOM_CD", A201TBM43_DOM_CD);
                     A200TBM43_STUDY_ID = H00122_A200TBM43_STUDY_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A200TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A200TBM43_STUDY_ID, 10, 0)));
                     A202TBM43_DOM_VAR_NM = H00122_A202TBM43_DOM_VAR_NM[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A202TBM43_DOM_VAR_NM", A202TBM43_DOM_VAR_NM);
                     AV8BC_TBM43_STUDY_CDISC_ITEM.Load(A200TBM43_STUDY_ID, A201TBM43_DOM_CD, A202TBM43_DOM_VAR_NM);
                     if ( AV8BC_TBM43_STUDY_CDISC_ITEM.Fail() )
                     {
                     }
                     else
                     {
                        AV8BC_TBM43_STUDY_CDISC_ITEM.Delete();
                     }
                     pr_default.readNext(0);
                  }
                  pr_default.close(0);
                  AV7BC_TBM42_STUDY_DOMAIN.Load(AV20P_STUDY_ID, AV6B402_SD06_STUDY_DOMAIN_I.getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd());
                  if ( AV7BC_TBM42_STUDY_DOMAIN.Fail() )
                  {
                  }
                  else
                  {
                     AV7BC_TBM42_STUDY_DOMAIN.Delete();
                  }
               }
            }
            else
            {
               if ( AV6B402_SD06_STUDY_DOMAIN_I.getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check() )
               {
                  /* Execute user subroutine: S232 */
                  S232 ();
                  if (returnInSub) return;
                  if ( ! AV28W_ERRFLG )
                  {
                     /* Execute user subroutine: S242 */
                     S242 ();
                     if (returnInSub) return;
                  }
               }
            }
            if ( AV28W_ERRFLG )
            {
               if (true) break;
            }
            AV47GXV7 = (int)(AV47GXV7+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47GXV7", GXutil.ltrim( GXutil.str( AV47GXV7, 8, 0)));
         }
         if ( ! AV28W_ERRFLG )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp12_study_domain_list");
            /* Execute user subroutine: S252 */
            S252 ();
            if (returnInSub) return;
            /* Execute user subroutine: S202 */
            S202 ();
            if (returnInSub) return;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp12_study_domain_list");
            httpContext.GX_msglist.addItem(AV26W_ERR_MSG);
         }
      }
   }

   public void e12122( )
   {
      /* 'BTN_CSV' Routine */
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV30W_MSG)==0) )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "ab402_pc25_study_domain_csv"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV30W_MSG)) ;
         httpContext.wjLoc = formatLink("ab402_pc25_study_domain_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(0) ;
         if ( ! (GXutil.strcmp("", AV30W_MSG)==0) )
         {
            httpContext.GX_msglist.addItem(AV30W_MSG);
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV30W_MSG);
      }
   }

   public void e13122( )
   {
      /* 'BTN_CAN' Routine */
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp02_study_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp02_study_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S152( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H00123 */
      pr_default.execute(1, new Object[] {new Long(AV20P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A63TBM21_STUDY_ID = H00123_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H00123_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H00123_n367TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV19H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_SRCH_FLG", AV19H_SRCH_FLG);
   }

   public void S252( )
   {
      /* 'SUB_DATA_GET' Routine */
      AV5B402_SD06_STUDY_DOMAIN_C.clear();
      gx_BV159 = true ;
      /* Using cursor H00124 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A49TBM02_DOM_CD = H00124_A49TBM02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
         A615TBM02_DEL_FLG = H00124_A615TBM02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A615TBM02_DEL_FLG", A615TBM02_DEL_FLG);
         n615TBM02_DEL_FLG = H00124_n615TBM02_DEL_FLG[0] ;
         A611TBM02_DOM_JNM = H00124_A611TBM02_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A611TBM02_DOM_JNM", A611TBM02_DOM_JNM);
         n611TBM02_DOM_JNM = H00124_n611TBM02_DOM_JNM[0] ;
         A614TBM02_ORDER = H00124_A614TBM02_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A614TBM02_ORDER", GXutil.ltrim( GXutil.str( A614TBM02_ORDER, 5, 0)));
         n614TBM02_ORDER = H00124_n614TBM02_ORDER[0] ;
         AV6B402_SD06_STUDY_DOMAIN_I = (SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)new SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem(remoteHandle, context);
         AV6B402_SD06_STUDY_DOMAIN_I.setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd( A49TBM02_DOM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B402_SD06_STUDY_DOMAIN_I", AV6B402_SD06_STUDY_DOMAIN_I);
         AV6B402_SD06_STUDY_DOMAIN_I.setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm( A611TBM02_DOM_JNM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B402_SD06_STUDY_DOMAIN_I", AV6B402_SD06_STUDY_DOMAIN_I);
         AV6B402_SD06_STUDY_DOMAIN_I.setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Order( A614TBM02_ORDER );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B402_SD06_STUDY_DOMAIN_I", AV6B402_SD06_STUDY_DOMAIN_I);
         /* Using cursor H00125 */
         pr_default.execute(3, new Object[] {new Long(AV20P_STUDY_ID), A49TBM02_DOM_CD});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A204TBM42_DOM_CD = H00125_A204TBM42_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
            A203TBM42_STUDY_ID = H00125_A203TBM42_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
            A893TBM42_DEL_FLG = H00125_A893TBM42_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A893TBM42_DEL_FLG", A893TBM42_DEL_FLG);
            n893TBM42_DEL_FLG = H00125_n893TBM42_DEL_FLG[0] ;
            AV6B402_SD06_STUDY_DOMAIN_I.setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check( true );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B402_SD06_STUDY_DOMAIN_I", AV6B402_SD06_STUDY_DOMAIN_I);
            AV6B402_SD06_STUDY_DOMAIN_I.setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg( A893TBM42_DEL_FLG );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B402_SD06_STUDY_DOMAIN_I", AV6B402_SD06_STUDY_DOMAIN_I);
            AV6B402_SD06_STUDY_DOMAIN_I.setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg( true );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B402_SD06_STUDY_DOMAIN_I", AV6B402_SD06_STUDY_DOMAIN_I);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV5B402_SD06_STUDY_DOMAIN_C.add(AV6B402_SD06_STUDY_DOMAIN_I, 0);
         gx_BV159 = true ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S222( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      AV24W_CHK_CNT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_CHK_CNT", GXutil.ltrim( GXutil.str( AV24W_CHK_CNT, 10, 0)));
      AV52GXV8 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52GXV8", GXutil.ltrim( GXutil.str( AV52GXV8, 8, 0)));
      while ( AV52GXV8 <= AV5B402_SD06_STUDY_DOMAIN_C.size() )
      {
         AV6B402_SD06_STUDY_DOMAIN_I = (SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV52GXV8));
         if ( AV6B402_SD06_STUDY_DOMAIN_I.getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check() )
         {
            AV24W_CHK_CNT = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_CHK_CNT", GXutil.ltrim( GXutil.str( AV24W_CHK_CNT, 10, 0)));
            if (true) break;
         }
         AV52GXV8 = (int)(AV52GXV8+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52GXV8", GXutil.ltrim( GXutil.str( AV52GXV8, 8, 0)));
      }
      if ( AV24W_CHK_CNT == 0 )
      {
         GXt_char1 = AV30W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00043", "ドメインコード", "", "", "", "", GXv_char2) ;
         b402_wp12_study_domain_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30W_MSG", AV30W_MSG);
         AV25W_ERR_CD = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERR_CD", GXutil.ltrim( GXutil.str( AV25W_ERR_CD, 4, 0)));
      }
   }

   public void S212( )
   {
      /* 'SUB_SDT_UPD' Routine */
   }

   public void S202( )
   {
      /* 'SUB_SDT_SAVE' Routine */
      AV31W_SESSION.setValue("B402_WP12_STUDY_DOMAIN", AV5B402_SD06_STUDY_DOMAIN_C.toxml(false, true, "B402_SD06_STUDY_DOMAIN", "tablet-EDC_GXXEV3U3"));
   }

   public void S132( )
   {
      /* 'SUB_SDT_GET' Routine */
      AV5B402_SD06_STUDY_DOMAIN_C.fromxml(AV31W_SESSION.getValue("B402_WP12_STUDY_DOMAIN"), "");
      gx_BV159 = true ;
   }

   public void S272( )
   {
      /* 'SUB_SDT_SESSION_REMOVE' Routine */
      AV31W_SESSION.remove("B712_WP02_RESULT_DATA");
   }

   public void S232( )
   {
      /* 'SUB_TBM42_REG' Routine */
      /* Using cursor H00126 */
      pr_default.execute(4, new Object[] {AV6B402_SD06_STUDY_DOMAIN_I.getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd()});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A49TBM02_DOM_CD = H00126_A49TBM02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
         A610TBM02_DOM_ENM = H00126_A610TBM02_DOM_ENM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610TBM02_DOM_ENM", A610TBM02_DOM_ENM);
         n610TBM02_DOM_ENM = H00126_n610TBM02_DOM_ENM[0] ;
         A611TBM02_DOM_JNM = H00126_A611TBM02_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A611TBM02_DOM_JNM", A611TBM02_DOM_JNM);
         n611TBM02_DOM_JNM = H00126_n611TBM02_DOM_JNM[0] ;
         A612TBM02_DOM_GRP_NM = H00126_A612TBM02_DOM_GRP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A612TBM02_DOM_GRP_NM", A612TBM02_DOM_GRP_NM);
         n612TBM02_DOM_GRP_NM = H00126_n612TBM02_DOM_GRP_NM[0] ;
         A613TBM02_NOTE = H00126_A613TBM02_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613TBM02_NOTE", A613TBM02_NOTE);
         n613TBM02_NOTE = H00126_n613TBM02_NOTE[0] ;
         A614TBM02_ORDER = H00126_A614TBM02_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A614TBM02_ORDER", GXutil.ltrim( GXutil.str( A614TBM02_ORDER, 5, 0)));
         n614TBM02_ORDER = H00126_n614TBM02_ORDER[0] ;
         AV7BC_TBM42_STUDY_DOMAIN = (SdtTBM42_STUDY_CDISC_DOMAIN)new SdtTBM42_STUDY_CDISC_DOMAIN( remoteHandle, context);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id( AV20P_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd( A49TBM02_DOM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm( A610TBM02_DOM_ENM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm( A611TBM02_DOM_JNM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm( A612TBM02_DOM_GRP_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note( A613TBM02_NOTE );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order( A614TBM02_ORDER );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id( AV21W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm( AV45Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id( AV21W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm( AV45Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7BC_TBM42_STUDY_DOMAIN", AV7BC_TBM42_STUDY_DOMAIN);
         AV7BC_TBM42_STUDY_DOMAIN.Save();
         if ( AV7BC_TBM42_STUDY_DOMAIN.Success() )
         {
         }
         else
         {
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            GXt_char1 = AV26W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV7BC_TBM42_STUDY_DOMAIN.GetMessages(), (byte)(0), GXv_char2) ;
            b402_wp12_study_domain_list_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_ERR_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERR_MSG", AV26W_ERR_MSG);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S242( )
   {
      /* 'SUB_TBM43_REG' Routine */
      /* Using cursor H00127 */
      pr_default.execute(5, new Object[] {AV6B402_SD06_STUDY_DOMAIN_I.getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd()});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A359TBM03_DEL_FLG = H00127_A359TBM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A359TBM03_DEL_FLG", A359TBM03_DEL_FLG);
         n359TBM03_DEL_FLG = H00127_n359TBM03_DEL_FLG[0] ;
         A59TBM03_DOM_CD = H00127_A59TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
         A60TBM03_DOM_VAR_NM = H00127_A60TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
         A346TBM03_VAR_DESC = H00127_A346TBM03_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBM03_VAR_DESC", A346TBM03_VAR_DESC);
         n346TBM03_VAR_DESC = H00127_n346TBM03_VAR_DESC[0] ;
         A347TBM03_SDTM_FLG = H00127_A347TBM03_SDTM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A347TBM03_SDTM_FLG", A347TBM03_SDTM_FLG);
         n347TBM03_SDTM_FLG = H00127_n347TBM03_SDTM_FLG[0] ;
         A348TBM03_CDASH_FLG = H00127_A348TBM03_CDASH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A348TBM03_CDASH_FLG", A348TBM03_CDASH_FLG);
         n348TBM03_CDASH_FLG = H00127_n348TBM03_CDASH_FLG[0] ;
         A532TBM03_INPUT_TYPE_DIV = H00127_A532TBM03_INPUT_TYPE_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A532TBM03_INPUT_TYPE_DIV", A532TBM03_INPUT_TYPE_DIV);
         n532TBM03_INPUT_TYPE_DIV = H00127_n532TBM03_INPUT_TYPE_DIV[0] ;
         A349TBM03_REQUIRED_FLG = H00127_A349TBM03_REQUIRED_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A349TBM03_REQUIRED_FLG", A349TBM03_REQUIRED_FLG);
         n349TBM03_REQUIRED_FLG = H00127_n349TBM03_REQUIRED_FLG[0] ;
         A688TBM03_SAS_FIELD_NM = H00127_A688TBM03_SAS_FIELD_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688TBM03_SAS_FIELD_NM", A688TBM03_SAS_FIELD_NM);
         n688TBM03_SAS_FIELD_NM = H00127_n688TBM03_SAS_FIELD_NM[0] ;
         A709TBM03_ODM_DATA_TYPE = H00127_A709TBM03_ODM_DATA_TYPE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709TBM03_ODM_DATA_TYPE", A709TBM03_ODM_DATA_TYPE);
         n709TBM03_ODM_DATA_TYPE = H00127_n709TBM03_ODM_DATA_TYPE[0] ;
         A350TBM03_NOTE = H00127_A350TBM03_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A350TBM03_NOTE", A350TBM03_NOTE);
         n350TBM03_NOTE = H00127_n350TBM03_NOTE[0] ;
         A61TBM03_ORDER = H00127_A61TBM03_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61TBM03_ORDER", GXutil.ltrim( GXutil.str( A61TBM03_ORDER, 5, 0)));
         n61TBM03_ORDER = H00127_n61TBM03_ORDER[0] ;
         A932TBM03_VERSION = H00127_A932TBM03_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A932TBM03_VERSION", A932TBM03_VERSION);
         n932TBM03_VERSION = H00127_n932TBM03_VERSION[0] ;
         AV8BC_TBM43_STUDY_CDISC_ITEM = (SdtTBM43_STUDY_CDISC_ITEM)new SdtTBM43_STUDY_CDISC_ITEM( remoteHandle, context);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_study_id( AV20P_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_cd( A59TBM03_DOM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_dom_var_nm( A60TBM03_DOM_VAR_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_var_desc( A346TBM03_VAR_DESC );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sdtm_flg( A347TBM03_SDTM_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_cdash_flg( A348TBM03_CDASH_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_input_type_div( A532TBM03_INPUT_TYPE_DIV );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_required_flg( A349TBM03_REQUIRED_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_sas_field_nm( A688TBM03_SAS_FIELD_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_odm_data_type( A709TBM03_ODM_DATA_TYPE );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_note( A350TBM03_NOTE );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_order( A61TBM03_ORDER );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_version( A932TBM03_VERSION );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_del_flg( A359TBM03_DEL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_user_id( AV21W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_crt_prog_nm( AV45Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_user_id( AV21W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.setgxTv_SdtTBM43_STUDY_CDISC_ITEM_Tbm43_upd_prog_nm( AV45Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8BC_TBM43_STUDY_CDISC_ITEM", AV8BC_TBM43_STUDY_CDISC_ITEM);
         AV8BC_TBM43_STUDY_CDISC_ITEM.Save();
         if ( AV8BC_TBM43_STUDY_CDISC_ITEM.Success() )
         {
         }
         else
         {
            AV28W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRFLG", AV28W_ERRFLG);
            GXt_char1 = AV26W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_TBM43_STUDY_CDISC_ITEM.GetMessages(), (byte)(0), GXv_char2) ;
            b402_wp12_study_domain_list_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_ERR_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERR_MSG", AV26W_ERR_MSG);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S262( )
   {
      /* 'SUB_CSV_CHECK' Routine */
      AV55GXLvl533 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55GXLvl533", GXutil.str( AV55GXLvl533, 1, 0));
      /* Using cursor H00128 */
      pr_default.execute(6, new Object[] {new Long(AV20P_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV55GXLvl533 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55GXLvl533", GXutil.str( AV55GXLvl533, 1, 0));
      }
      while ( (pr_default.getStatus(6) != 101) )
      {
         A203TBM42_STUDY_ID = H00128_A203TBM42_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
         AV55GXLvl533 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55GXLvl533", GXutil.str( AV55GXLvl533, 1, 0));
         AV30W_MSG = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30W_MSG", AV30W_MSG);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( AV55GXLvl533 == 0 )
      {
         GXt_char1 = AV30W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         b402_wp12_study_domain_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30W_MSG", AV30W_MSG);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV21W_A_LOGIN_SDT;
      GXv_char2[0] = AV27W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV21W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_wp12_study_domain_list_impl.this.AV27W_ERRCD = GXv_char2[0] ;
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
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      AV19H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_SRCH_FLG", AV19H_SRCH_FLG);
      AV22W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_A819_JS", AV22W_A819_JS);
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
      if ( ! (GXutil.strcmp("", AV23W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV23W_A821_JS ;
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

   public void S142( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV18H_KNGN_FLG ;
      GXv_char4[0] = AV27W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_APP_ID, GXv_char2, GXv_char4) ;
      b402_wp12_study_domain_list_impl.this.AV18H_KNGN_FLG = GXv_char2[0] ;
      b402_wp12_study_domain_list_impl.this.AV27W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_APP_ID", AV9C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_KNGN_FLG", AV18H_KNGN_FLG);
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV45Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp12_study_domain_list");
   }

   public void e16122( )
   {
      /* 'PAGE_FIRST' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e17122( )
   {
      /* 'PAGE_LAST' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e18122( )
   {
      /* 'PAGE_BACK' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e19122( )
   {
      /* 'PAGE_NEXT' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      if ( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e20122( )
   {
      /* 'PAGE01' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e21122( )
   {
      /* 'PAGE02' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e22122( )
   {
      /* 'PAGE03' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e23122( )
   {
      /* 'PAGE04' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e24122( )
   {
      /* 'PAGE05' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e25122( )
   {
      /* 'PAGE06' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e26122( )
   {
      /* 'PAGE07' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e27122( )
   {
      /* 'PAGE08' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e28122( )
   {
      /* 'PAGE09' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e29122( )
   {
      /* 'PAGE10' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( AV5B402_SD06_STUDY_DOMAIN_C.size() );
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
      if ( AV5B402_SD06_STUDY_DOMAIN_C.size() <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV19H_SRCH_FLG, "1") == 0 ) && ! AV28W_ERRFLG )
         {
            GXt_char1 = AV30W_MSG ;
            GXv_char4[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
            b402_wp12_study_domain_list_impl.this.GXt_char1 = GXv_char4[0] ;
            AV30W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30W_MSG", AV30W_MSG);
            httpContext.GX_msglist.addItem(AV30W_MSG);
         }
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( AV5B402_SD06_STUDY_DOMAIN_C.size(), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S162( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      GXt_boolean6 = false ;
      GXv_boolean7[0] = GXt_boolean6 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV18H_KNGN_FLG, "", GXv_boolean7) ;
      b402_wp12_study_domain_list_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_KNGN_FLG", AV18H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean6 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      GXt_boolean6 = false ;
      GXv_boolean7[0] = GXt_boolean6 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV18H_KNGN_FLG, "", GXv_boolean7) ;
      b402_wp12_study_domain_list_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_KNGN_FLG", AV18H_KNGN_FLG);
      chkavCtlcheck.setEnabled( (GXt_boolean6 ? 1 : 0) );
   }

   public void e30122( )
   {
      /* 'SORT01_ASC' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV36H_SORT_ITEM_KBN = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV36H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
   }

   public void e31122( )
   {
      /* 'SORT01_DESC' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV36H_SORT_ITEM_KBN = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV36H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void e32122( )
   {
      /* 'SORT02_ASC' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV36H_SORT_ITEM_KBN = (short)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV36H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
   }

   public void e33122( )
   {
      /* 'SORT02_DESC' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV36H_SORT_ITEM_KBN = (short)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV36H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void e34122( )
   {
      /* 'SORT03_ASC' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV36H_SORT_ITEM_KBN = (short)(3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV36H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
   }

   public void e35122( )
   {
      /* 'SORT03_DESC' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV36H_SORT_ITEM_KBN = (short)(3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV36H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void S282( )
   {
      /* 'SUB_SORT_AS_RPOC' Routine */
      AV35H_SORT_ASDC_KBN = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ASDC_KBN, 4, 0)));
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      /* Execute user subroutine: S312 */
      S312 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void S292( )
   {
      /* 'SUB_SORT_DESC_RPOC' Routine */
      AV35H_SORT_ASDC_KBN = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV35H_SORT_ASDC_KBN, 4, 0)));
      AV15H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV15H_A_PAGING_SDT", AV15H_A_PAGING_SDT);
      /* Execute user subroutine: S312 */
      S312 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void S312( )
   {
      /* 'SUB_SORT_EXEC' Routine */
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
      if ( ( AV36H_SORT_ITEM_KBN == 1 ) && ( AV35H_SORT_ASDC_KBN == 0 ) )
      {
         AV5B402_SD06_STUDY_DOMAIN_C.sort("DOM_CD");
         gx_BV159 = true ;
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 1 ) && ( AV35H_SORT_ASDC_KBN == 1 ) )
      {
         AV5B402_SD06_STUDY_DOMAIN_C.sort("[DOM_CD]");
         gx_BV159 = true ;
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 2 ) && ( AV35H_SORT_ASDC_KBN == 0 ) )
      {
         AV5B402_SD06_STUDY_DOMAIN_C.sort("DOM_JNM");
         gx_BV159 = true ;
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 2 ) && ( AV35H_SORT_ASDC_KBN == 1 ) )
      {
         AV5B402_SD06_STUDY_DOMAIN_C.sort("[DOM_JNM]");
         gx_BV159 = true ;
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 3 ) && ( AV35H_SORT_ASDC_KBN == 0 ) )
      {
         AV5B402_SD06_STUDY_DOMAIN_C.sort("DEL_FLG,DOM_CD");
         gx_BV159 = true ;
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 3 ) && ( AV35H_SORT_ASDC_KBN == 1 ) )
      {
         AV5B402_SD06_STUDY_DOMAIN_C.sort("[DEL_FLG],DOM_CD");
         gx_BV159 = true ;
      }
      else
      {
         AV5B402_SD06_STUDY_DOMAIN_C.sort("ORDER");
         gx_BV159 = true ;
      }
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
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
      if ( ( AV36H_SORT_ITEM_KBN == 1 ) && ( AV35H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort01_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_asc_Internalname, "Class", lblTxt_sort01_asc_Class);
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 1 ) && ( AV35H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort01_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_desc_Internalname, "Class", lblTxt_sort01_desc_Class);
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 2 ) && ( AV35H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort02_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_asc_Internalname, "Class", lblTxt_sort02_asc_Class);
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 2 ) && ( AV35H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort02_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_desc_Internalname, "Class", lblTxt_sort02_desc_Class);
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 3 ) && ( AV35H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort03_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_asc_Internalname, "Class", lblTxt_sort03_asc_Class);
      }
      else if ( ( AV36H_SORT_ITEM_KBN == 3 ) && ( AV35H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort03_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_desc_Internalname, "Class", lblTxt_sort03_desc_Class);
      }
   }

   public void wb_table2_177_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_exec_Internalname, "TXT_BTN_REG_EXEC", "", "", lblTxt_btn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_159_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV17H_INIT_FLG), GXutil.rtrim( localUtil.format( AV17H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_159_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV19H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV19H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(183);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_159_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV18H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV18H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_159_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_disp_datetime_Internalname, GXutil.rtrim( AV16H_DISP_DATETIME), GXutil.rtrim( localUtil.format( AV16H_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_disp_datetime_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_159_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_189_122( true) ;
      }
      else
      {
         wb_table3_189_122( false) ;
      }
      return  ;
   }

   public void wb_table3_189_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_177_122e( true) ;
      }
      else
      {
         wb_table2_177_122e( false) ;
      }
   }

   public void wb_table3_189_122( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'',false,'" + sGXsfl_159_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sort_asdc_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV35H_SORT_ASDC_KBN, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35H_SORT_ASDC_KBN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(192);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sort_asdc_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'" + sGXsfl_159_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sort_item_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV36H_SORT_ITEM_KBN, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36H_SORT_ITEM_KBN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(195);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sort_item_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_189_122e( true) ;
      }
      else
      {
         wb_table3_189_122e( false) ;
      }
   }

   public void wb_table1_2_122( boolean wbgen )
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
         wb_table4_6_122( true) ;
      }
      else
      {
         wb_table4_6_122( false) ;
      }
      return  ;
   }

   public void wb_table4_6_122e( boolean wbgen )
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
         wb_table1_2_122e( true) ;
      }
      else
      {
         wb_table1_2_122e( false) ;
      }
   }

   public void wb_table4_6_122( boolean wbgen )
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
         wb_table5_12_122( true) ;
      }
      else
      {
         wb_table5_12_122( false) ;
      }
      return  ;
   }

   public void wb_table5_12_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table6_22_122( true) ;
      }
      else
      {
         wb_table6_22_122( false) ;
      }
      return  ;
   }

   public void wb_table6_22_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0175"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0175"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0175"+"");
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
         wb_table4_6_122e( true) ;
      }
      else
      {
         wb_table4_6_122e( false) ;
      }
   }

   public void wb_table6_22_122( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_25_122( true) ;
      }
      else
      {
         wb_table7_25_122( false) ;
      }
      return  ;
   }

   public void wb_table7_25_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_22_122e( true) ;
      }
      else
      {
         wb_table6_22_122e( false) ;
      }
   }

   public void wb_table7_25_122( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_28_122( true) ;
      }
      else
      {
         wb_table8_28_122( false) ;
      }
      return  ;
   }

   public void wb_table8_28_122e( boolean wbgen )
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
         wb_table9_39_122( true) ;
      }
      else
      {
         wb_table9_39_122( false) ;
      }
      return  ;
   }

   public void wb_table9_39_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_25_122e( true) ;
      }
      else
      {
         wb_table7_25_122e( false) ;
      }
   }

   public void wb_table9_39_122( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_list_Internalname, tblTbl_list_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:25px\">") ;
         wb_table10_42_122( true) ;
      }
      else
      {
         wb_table10_42_122( false) ;
      }
      return  ;
   }

   public void wb_table10_42_122e( boolean wbgen )
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
         wb_table11_138_122( true) ;
      }
      else
      {
         wb_table11_138_122( false) ;
      }
      return  ;
   }

   public void wb_table11_138_122e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"159\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridTM-1", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
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
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavCtlcheck.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtldom_cd_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtldom_jnm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV34D_GRD_DEL));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_del_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_edit_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_item_list_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 159 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_159 = (short)(nGXsfl_159_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV39GXV1 = nGXsfl_159_idx ;
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
         wb_table9_39_122e( true) ;
      }
      else
      {
         wb_table9_39_122e( false) ;
      }
   }

   public void wb_table11_138_122( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_159_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd_all_chk.getInternalname(), GXutil.booltostr( AV11D_GRD_ALL_CHK), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(141, this, 'true', 'false');gx.ajax.executeCliEvent('e14122_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(141);\"");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "選択", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:160px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "ドメインコード", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort01_desc_Internalname, "▼", "", "", lblTxt_sort01_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT01_DESC\\'."+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort01_desc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort01_asc_Internalname, "▲", "", "", lblTxt_sort01_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT01_ASC\\'."+"'", "", lblTxt_sort01_asc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:370px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "ドメイン名", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort02_desc_Internalname, "▼", "", "", lblTxt_sort02_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT02_DESC\\'."+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort02_desc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort02_asc_Internalname, "▲", "", "", lblTxt_sort02_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT02_ASC\\'."+"'", "", lblTxt_sort02_asc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "削除", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort03_desc_Internalname, "▼", "", "", lblTxt_sort03_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT03_DESC\\'."+"'", "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort03_desc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort03_asc_Internalname, "▲", "", "", lblTxt_sort03_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT03_ASC\\'."+"'", "", lblTxt_sort03_asc_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:90px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_138_122e( true) ;
      }
      else
      {
         wb_table11_138_122e( false) ;
      }
   }

   public void wb_table10_42_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_48_122( true) ;
      }
      else
      {
         wb_table12_48_122( false) ;
      }
      return  ;
   }

   public void wb_table12_48_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_42_122e( true) ;
      }
      else
      {
         wb_table10_42_122e( false) ;
      }
   }

   public void wb_table12_48_122( boolean wbgen )
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
         wb_table13_51_122( true) ;
      }
      else
      {
         wb_table13_51_122( false) ;
      }
      return  ;
   }

   public void wb_table13_51_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_57_122( true) ;
      }
      else
      {
         wb_table14_57_122( false) ;
      }
      return  ;
   }

   public void wb_table14_57_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_63_122( true) ;
      }
      else
      {
         wb_table15_63_122( false) ;
      }
      return  ;
   }

   public void wb_table15_63_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_69_122( true) ;
      }
      else
      {
         wb_table16_69_122( false) ;
      }
      return  ;
   }

   public void wb_table16_69_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_75_122( true) ;
      }
      else
      {
         wb_table17_75_122( false) ;
      }
      return  ;
   }

   public void wb_table17_75_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_81_122( true) ;
      }
      else
      {
         wb_table18_81_122( false) ;
      }
      return  ;
   }

   public void wb_table18_81_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_87_122( true) ;
      }
      else
      {
         wb_table19_87_122( false) ;
      }
      return  ;
   }

   public void wb_table19_87_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_93_122( true) ;
      }
      else
      {
         wb_table20_93_122( false) ;
      }
      return  ;
   }

   public void wb_table20_93_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_99_122( true) ;
      }
      else
      {
         wb_table21_99_122( false) ;
      }
      return  ;
   }

   public void wb_table21_99_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_105_122( true) ;
      }
      else
      {
         wb_table22_105_122( false) ;
      }
      return  ;
   }

   public void wb_table22_105_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_111_122( true) ;
      }
      else
      {
         wb_table23_111_122( false) ;
      }
      return  ;
   }

   public void wb_table23_111_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_117_122( true) ;
      }
      else
      {
         wb_table24_117_122( false) ;
      }
      return  ;
   }

   public void wb_table24_117_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_123_122( true) ;
      }
      else
      {
         wb_table25_123_122( false) ;
      }
      return  ;
   }

   public void wb_table25_123_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_129_122( true) ;
      }
      else
      {
         wb_table26_129_122( false) ;
      }
      return  ;
   }

   public void wb_table26_129_122e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_48_122e( true) ;
      }
      else
      {
         wb_table12_48_122e( false) ;
      }
   }

   public void wb_table26_129_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_129_122e( true) ;
      }
      else
      {
         wb_table26_129_122e( false) ;
      }
   }

   public void wb_table25_123_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_123_122e( true) ;
      }
      else
      {
         wb_table25_123_122e( false) ;
      }
   }

   public void wb_table24_117_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_117_122e( true) ;
      }
      else
      {
         wb_table24_117_122e( false) ;
      }
   }

   public void wb_table23_111_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_111_122e( true) ;
      }
      else
      {
         wb_table23_111_122e( false) ;
      }
   }

   public void wb_table22_105_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_105_122e( true) ;
      }
      else
      {
         wb_table22_105_122e( false) ;
      }
   }

   public void wb_table21_99_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_99_122e( true) ;
      }
      else
      {
         wb_table21_99_122e( false) ;
      }
   }

   public void wb_table20_93_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_93_122e( true) ;
      }
      else
      {
         wb_table20_93_122e( false) ;
      }
   }

   public void wb_table19_87_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_87_122e( true) ;
      }
      else
      {
         wb_table19_87_122e( false) ;
      }
   }

   public void wb_table18_81_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_81_122e( true) ;
      }
      else
      {
         wb_table18_81_122e( false) ;
      }
   }

   public void wb_table17_75_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_75_122e( true) ;
      }
      else
      {
         wb_table17_75_122e( false) ;
      }
   }

   public void wb_table16_69_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_69_122e( true) ;
      }
      else
      {
         wb_table16_69_122e( false) ;
      }
   }

   public void wb_table15_63_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_63_122e( true) ;
      }
      else
      {
         wb_table15_63_122e( false) ;
      }
   }

   public void wb_table14_57_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_57_122e( true) ;
      }
      else
      {
         wb_table14_57_122e( false) ;
      }
   }

   public void wb_table13_51_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_51_122e( true) ;
      }
      else
      {
         wb_table13_51_122e( false) ;
      }
   }

   public void wb_table8_28_122( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 735, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_28_122e( true) ;
      }
      else
      {
         wb_table8_28_122e( false) ;
      }
   }

   public void wb_table5_12_122( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_csv_Internalname, "CSV出力（F4）", "", "", lblTxt_btn_csv_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV\\'."+"'", "", "TextBlockBtnList120", 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F11）", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B402_WP12_STUDY_DOMAIN_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_122e( true) ;
      }
      else
      {
         wb_table5_12_122e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV20P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20P_STUDY_ID", GXutil.ltrim( GXutil.str( AV20P_STUDY_ID, 10, 0)));
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
      pa122( ) ;
      ws122( ) ;
      we122( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513235731");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp12_study_domain_list.js", "?202071513235731");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1592( )
   {
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_159_idx );
      edtavCtldom_cd_Internalname = "CTLDOM_CD_"+sGXsfl_159_idx ;
      edtavCtldom_jnm_Internalname = "CTLDOM_JNM_"+sGXsfl_159_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_159_idx ;
      lblBtn_edit_Internalname = "BTN_EDIT_"+sGXsfl_159_idx ;
      lblBtn_item_list_Internalname = "BTN_ITEM_LIST_"+sGXsfl_159_idx ;
   }

   public void subsflControlProps_fel_1592( )
   {
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_159_fel_idx );
      edtavCtldom_cd_Internalname = "CTLDOM_CD_"+sGXsfl_159_fel_idx ;
      edtavCtldom_jnm_Internalname = "CTLDOM_JNM_"+sGXsfl_159_fel_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_159_fel_idx ;
      lblBtn_edit_Internalname = "BTN_EDIT_"+sGXsfl_159_fel_idx ;
      lblBtn_item_list_Internalname = "BTN_ITEM_LIST_"+sGXsfl_159_fel_idx ;
   }

   public void sendrow_1592( )
   {
      subsflControlProps_1592( ) ;
      wb120( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_159_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_159_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_159_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_159_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_159_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_159_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Check box */
         TempTags = " " + ((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 162,'',false,'"+sGXsfl_159_idx+"',159)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlcheck.getInternalname(),GXutil.booltostr( ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)).getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check()),"",new Integer(1),new Integer(chkavCtlcheck.getEnabled()),"true","",StyleString,ClassString,"",TempTags+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(162, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(162);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:32px;width:160px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtldom_cd_Internalname,GXutil.rtrim( ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)).getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtldom_cd_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtldom_cd_Enabled),new Integer(0),"text","",new Integer(16),"chr",new Integer(1),"row",new Integer(16),new Integer(0),new Integer(0),new Integer(159),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:370px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtldom_jnm_Internalname,GXutil.rtrim( ((SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)AV5B402_SD06_STUDY_DOMAIN_C.elementAt(-1+AV39GXV1)).getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtldom_jnm_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtldom_jnm_Enabled),new Integer(0),"text","",new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(159),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 168,'',false,'"+sGXsfl_159_idx+"',159)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_del_Internalname,GXutil.rtrim( AV34D_GRD_DEL),"",TempTags+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(168);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_del_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_del_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(159),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_edit_Internalname,"編集","","",lblBtn_edit_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_EDIT\\'."+sGXsfl_159_idx+"'","","TextBlockBtn040s",new Integer(5),"",new Integer(lblBtn_edit_Visible),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:90px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_item_list_Internalname,"変数一覧","","",lblBtn_item_list_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_ITEM_LIST\\'."+sGXsfl_159_idx+"'","","TextBlockBtn060s",new Integer(5),"",new Integer(lblBtn_item_list_Visible),new Integer(1),new Integer(0)});
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
               if ( ((int)((nGXsfl_159_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_159_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_159_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_159_idx+1)) ;
         sGXsfl_159_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_159_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1592( ) ;
      }
      /* End function sendrow_1592 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_csv_Internalname = "TXT_BTN_CSV" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
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
      chkavD_grd_all_chk.setInternalname( "vD_GRD_ALL_CHK" );
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      lblTxt_sort01_desc_Internalname = "TXT_SORT01_DESC" ;
      lblTxt_sort01_asc_Internalname = "TXT_SORT01_ASC" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      lblTxt_sort02_desc_Internalname = "TXT_SORT02_DESC" ;
      lblTxt_sort02_asc_Internalname = "TXT_SORT02_ASC" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      lblTxt_sort03_desc_Internalname = "TXT_SORT03_DESC" ;
      lblTxt_sort03_asc_Internalname = "TXT_SORT03_ASC" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTbl_list_Internalname = "TBL_LIST" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_btn_reg_exec_Internalname = "TXT_BTN_REG_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_disp_datetime_Internalname = "vH_DISP_DATETIME" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
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
      lblBtn_item_list_Visible = 1 ;
      lblBtn_edit_Visible = 1 ;
      edtavD_grd_del_Jsonclick = "" ;
      edtavD_grd_del_Visible = 1 ;
      edtavCtldom_jnm_Jsonclick = "" ;
      edtavCtldom_cd_Jsonclick = "" ;
      chkavCtlcheck.setVisible( 1 );
      subGrid1_Class = "FreeStyleGridTM-1" ;
      lblTxt_btn_reg_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblBtn_item_list_Caption = "変数一覧" ;
      lblBtn_edit_Caption = "編集" ;
      edtavD_grd_del_Enabled = 1 ;
      edtavCtldom_jnm_Enabled = 0 ;
      edtavCtldom_cd_Enabled = 0 ;
      chkavCtlcheck.setEnabled( 1 );
      edtavH_sort_item_kbn_Jsonclick = "" ;
      edtavH_sort_asdc_kbn_Jsonclick = "" ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_disp_datetime_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_sort03_desc_Class = "TextBlockSort" ;
      lblTxt_sort03_asc_Class = "TextBlockSort" ;
      lblTxt_sort02_desc_Class = "TextBlockSort" ;
      lblTxt_sort02_asc_Class = "TextBlockSort" ;
      lblTxt_sort01_desc_Class = "TextBlockSort" ;
      lblTxt_sort01_asc_Class = "TextBlockSort" ;
      lblTxt_rec_cnt_Caption = "(全100件)" ;
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
      chkavD_grd_all_chk.setCaption( "" );
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV5B402_SD06_STUDY_DOMAIN_C = new GxObjectCollection(SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem.class, "B402_SD06_STUDY_DOMAIN.B402_SD06_STUDY_DOMAINItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV15H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV45Pgmname = "" ;
      AV9C_APP_ID = "" ;
      A367TBM21_STUDY_NM = "" ;
      AV23W_A821_JS = "" ;
      A615TBM02_DEL_FLG = "" ;
      A49TBM02_DOM_CD = "" ;
      A611TBM02_DOM_JNM = "" ;
      A204TBM42_DOM_CD = "" ;
      A893TBM42_DEL_FLG = "" ;
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
      edtavCtldom_cd_Internalname = "" ;
      edtavCtldom_jnm_Internalname = "" ;
      AV34D_GRD_DEL = "" ;
      edtavD_grd_del_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV44Pgmdesc = "" ;
      AV17H_INIT_FLG = "" ;
      AV19H_SRCH_FLG = "" ;
      AV18H_KNGN_FLG = "" ;
      AV16H_DISP_DATETIME = "" ;
      AV10C_GAMEN_TITLE = "" ;
      AV21W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV6B402_SD06_STUDY_DOMAIN_I = new SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem(remoteHandle, context);
      AV30W_MSG = "" ;
      scmdbuf = "" ;
      H00122_A201TBM43_DOM_CD = new String[] {""} ;
      H00122_A200TBM43_STUDY_ID = new long[1] ;
      H00122_A202TBM43_DOM_VAR_NM = new String[] {""} ;
      A201TBM43_DOM_CD = "" ;
      A202TBM43_DOM_VAR_NM = "" ;
      AV8BC_TBM43_STUDY_CDISC_ITEM = new SdtTBM43_STUDY_CDISC_ITEM(remoteHandle);
      AV7BC_TBM42_STUDY_DOMAIN = new SdtTBM42_STUDY_CDISC_DOMAIN(remoteHandle);
      AV26W_ERR_MSG = "" ;
      H00123_A63TBM21_STUDY_ID = new long[1] ;
      H00123_A367TBM21_STUDY_NM = new String[] {""} ;
      H00123_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H00124_A49TBM02_DOM_CD = new String[] {""} ;
      H00124_A615TBM02_DEL_FLG = new String[] {""} ;
      H00124_n615TBM02_DEL_FLG = new boolean[] {false} ;
      H00124_A611TBM02_DOM_JNM = new String[] {""} ;
      H00124_n611TBM02_DOM_JNM = new boolean[] {false} ;
      H00124_A614TBM02_ORDER = new int[1] ;
      H00124_n614TBM02_ORDER = new boolean[] {false} ;
      H00125_A204TBM42_DOM_CD = new String[] {""} ;
      H00125_A203TBM42_STUDY_ID = new long[1] ;
      H00125_A893TBM42_DEL_FLG = new String[] {""} ;
      H00125_n893TBM42_DEL_FLG = new boolean[] {false} ;
      AV31W_SESSION = httpContext.getWebSession();
      H00126_A49TBM02_DOM_CD = new String[] {""} ;
      H00126_A610TBM02_DOM_ENM = new String[] {""} ;
      H00126_n610TBM02_DOM_ENM = new boolean[] {false} ;
      H00126_A611TBM02_DOM_JNM = new String[] {""} ;
      H00126_n611TBM02_DOM_JNM = new boolean[] {false} ;
      H00126_A612TBM02_DOM_GRP_NM = new String[] {""} ;
      H00126_n612TBM02_DOM_GRP_NM = new boolean[] {false} ;
      H00126_A613TBM02_NOTE = new String[] {""} ;
      H00126_n613TBM02_NOTE = new boolean[] {false} ;
      H00126_A614TBM02_ORDER = new int[1] ;
      H00126_n614TBM02_ORDER = new boolean[] {false} ;
      A610TBM02_DOM_ENM = "" ;
      A612TBM02_DOM_GRP_NM = "" ;
      A613TBM02_NOTE = "" ;
      H00127_A359TBM03_DEL_FLG = new String[] {""} ;
      H00127_n359TBM03_DEL_FLG = new boolean[] {false} ;
      H00127_A59TBM03_DOM_CD = new String[] {""} ;
      H00127_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      H00127_A346TBM03_VAR_DESC = new String[] {""} ;
      H00127_n346TBM03_VAR_DESC = new boolean[] {false} ;
      H00127_A347TBM03_SDTM_FLG = new String[] {""} ;
      H00127_n347TBM03_SDTM_FLG = new boolean[] {false} ;
      H00127_A348TBM03_CDASH_FLG = new String[] {""} ;
      H00127_n348TBM03_CDASH_FLG = new boolean[] {false} ;
      H00127_A532TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      H00127_n532TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      H00127_A349TBM03_REQUIRED_FLG = new String[] {""} ;
      H00127_n349TBM03_REQUIRED_FLG = new boolean[] {false} ;
      H00127_A688TBM03_SAS_FIELD_NM = new String[] {""} ;
      H00127_n688TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      H00127_A709TBM03_ODM_DATA_TYPE = new String[] {""} ;
      H00127_n709TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      H00127_A350TBM03_NOTE = new String[] {""} ;
      H00127_n350TBM03_NOTE = new boolean[] {false} ;
      H00127_A61TBM03_ORDER = new int[1] ;
      H00127_n61TBM03_ORDER = new boolean[] {false} ;
      H00127_A932TBM03_VERSION = new String[] {""} ;
      H00127_n932TBM03_VERSION = new boolean[] {false} ;
      A359TBM03_DEL_FLG = "" ;
      A59TBM03_DOM_CD = "" ;
      A60TBM03_DOM_VAR_NM = "" ;
      A346TBM03_VAR_DESC = "" ;
      A347TBM03_SDTM_FLG = "" ;
      A348TBM03_CDASH_FLG = "" ;
      A532TBM03_INPUT_TYPE_DIV = "" ;
      A349TBM03_REQUIRED_FLG = "" ;
      A688TBM03_SAS_FIELD_NM = "" ;
      A709TBM03_ODM_DATA_TYPE = "" ;
      A350TBM03_NOTE = "" ;
      A932TBM03_VERSION = "" ;
      H00128_A204TBM42_DOM_CD = new String[] {""} ;
      H00128_A203TBM42_STUDY_ID = new long[1] ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV27W_ERRCD = "" ;
      AV22W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtA_PAGING_SDT5 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXv_boolean7 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_reg_exec_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock33_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTxt_sort01_desc_Jsonclick = "" ;
      lblTxt_sort01_asc_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTxt_sort02_desc_Jsonclick = "" ;
      lblTxt_sort02_asc_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTxt_sort03_desc_Jsonclick = "" ;
      lblTxt_sort03_asc_Jsonclick = "" ;
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
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_csv_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblBtn_edit_Internalname = "" ;
      lblBtn_item_list_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      lblBtn_edit_Jsonclick = "" ;
      lblBtn_item_list_Jsonclick = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp12_study_domain_list__default(),
         new Object[] {
             new Object[] {
            H00122_A201TBM43_DOM_CD, H00122_A200TBM43_STUDY_ID, H00122_A202TBM43_DOM_VAR_NM
            }
            , new Object[] {
            H00123_A63TBM21_STUDY_ID, H00123_A367TBM21_STUDY_NM, H00123_n367TBM21_STUDY_NM
            }
            , new Object[] {
            H00124_A49TBM02_DOM_CD, H00124_A615TBM02_DEL_FLG, H00124_n615TBM02_DEL_FLG, H00124_A611TBM02_DOM_JNM, H00124_n611TBM02_DOM_JNM, H00124_A614TBM02_ORDER, H00124_n614TBM02_ORDER
            }
            , new Object[] {
            H00125_A204TBM42_DOM_CD, H00125_A203TBM42_STUDY_ID, H00125_A893TBM42_DEL_FLG, H00125_n893TBM42_DEL_FLG
            }
            , new Object[] {
            H00126_A49TBM02_DOM_CD, H00126_A610TBM02_DOM_ENM, H00126_n610TBM02_DOM_ENM, H00126_A611TBM02_DOM_JNM, H00126_n611TBM02_DOM_JNM, H00126_A612TBM02_DOM_GRP_NM, H00126_n612TBM02_DOM_GRP_NM, H00126_A613TBM02_NOTE, H00126_n613TBM02_NOTE, H00126_A614TBM02_ORDER,
            H00126_n614TBM02_ORDER
            }
            , new Object[] {
            H00127_A359TBM03_DEL_FLG, H00127_n359TBM03_DEL_FLG, H00127_A59TBM03_DOM_CD, H00127_A60TBM03_DOM_VAR_NM, H00127_A346TBM03_VAR_DESC, H00127_n346TBM03_VAR_DESC, H00127_A347TBM03_SDTM_FLG, H00127_n347TBM03_SDTM_FLG, H00127_A348TBM03_CDASH_FLG, H00127_n348TBM03_CDASH_FLG,
            H00127_A532TBM03_INPUT_TYPE_DIV, H00127_n532TBM03_INPUT_TYPE_DIV, H00127_A349TBM03_REQUIRED_FLG, H00127_n349TBM03_REQUIRED_FLG, H00127_A688TBM03_SAS_FIELD_NM, H00127_n688TBM03_SAS_FIELD_NM, H00127_A709TBM03_ODM_DATA_TYPE, H00127_n709TBM03_ODM_DATA_TYPE, H00127_A350TBM03_NOTE, H00127_n350TBM03_NOTE,
            H00127_A61TBM03_ORDER, H00127_n61TBM03_ORDER, H00127_A932TBM03_VERSION, H00127_n932TBM03_VERSION
            }
            , new Object[] {
            H00128_A204TBM42_DOM_CD, H00128_A203TBM42_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV45Pgmname = "B402_WP12_STUDY_DOMAIN_LIST" ;
      AV44Pgmdesc = "試験登録（ドメイン選択）" ;
      /* GeneXus formulas. */
      AV45Pgmname = "B402_WP12_STUDY_DOMAIN_LIST" ;
      AV44Pgmdesc = "試験登録（ドメイン選択）" ;
      Gx_err = (short)(0) ;
      edtavCtldom_cd_Enabled = 0 ;
      edtavCtldom_jnm_Enabled = 0 ;
      edtavD_grd_del_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV55GXLvl533 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_159 ;
   private short nGXsfl_159_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV39GXV1 ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_159_Refreshing=0 ;
   private short Gx_err ;
   private short AV35H_SORT_ASDC_KBN ;
   private short AV36H_SORT_ITEM_KBN ;
   private short nGXsfl_159_fel_idx=1 ;
   private short AV25W_ERR_CD ;
   private int A614TBM02_ORDER ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int edtavCtldom_cd_Enabled ;
   private int edtavCtldom_jnm_Enabled ;
   private int edtavD_grd_del_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int lblBtn_edit_Visible ;
   private int lblBtn_item_list_Visible ;
   private int AV46GXV6 ;
   private int AV47GXV7 ;
   private int AV52GXV8 ;
   private int A61TBM03_ORDER ;
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
   private int lblTxt_btn_reg_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_del_Visible ;
   private long wcpOAV20P_STUDY_ID ;
   private long AV20P_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long A63TBM21_STUDY_ID ;
   private long A203TBM42_STUDY_ID ;
   private long GRID1_nRecordCount ;
   private long GRID1_nCurrentRecord ;
   private long A200TBM43_STUDY_ID ;
   private long AV24W_CHK_CNT ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_159_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV45Pgmname ;
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
   private String edtavCtldom_cd_Internalname ;
   private String edtavCtldom_jnm_Internalname ;
   private String edtavD_grd_del_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV44Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_disp_datetime_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String edtavH_sort_asdc_kbn_Internalname ;
   private String edtavH_sort_item_kbn_Internalname ;
   private String sGXsfl_159_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
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
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
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
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_btn_reg_exec_Internalname ;
   private String lblTxt_btn_reg_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_disp_datetime_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String tblTable6_Internalname ;
   private String edtavH_sort_asdc_kbn_Jsonclick ;
   private String edtavH_sort_item_kbn_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTbl_list_Internalname ;
   private String subGrid1_Internalname ;
   private String lblBtn_edit_Caption ;
   private String lblBtn_item_list_Caption ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String lblTxt_sort01_desc_Jsonclick ;
   private String lblTxt_sort01_asc_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String lblTxt_sort02_desc_Jsonclick ;
   private String lblTxt_sort02_asc_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTxt_sort03_desc_Jsonclick ;
   private String lblTxt_sort03_asc_Jsonclick ;
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
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_csv_Internalname ;
   private String lblTxt_btn_csv_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String lblBtn_edit_Internalname ;
   private String lblBtn_item_list_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavCtldom_cd_Jsonclick ;
   private String edtavCtldom_jnm_Jsonclick ;
   private String edtavD_grd_del_Jsonclick ;
   private String lblBtn_edit_Jsonclick ;
   private String lblBtn_item_list_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV28W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV11D_GRD_ALL_CHK ;
   private boolean returnInSub ;
   private boolean AV29W_GRID_READ_FLG ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean gx_BV159 ;
   private boolean n615TBM02_DEL_FLG ;
   private boolean n611TBM02_DOM_JNM ;
   private boolean n614TBM02_ORDER ;
   private boolean n893TBM42_DEL_FLG ;
   private boolean n610TBM02_DOM_ENM ;
   private boolean n612TBM02_DOM_GRP_NM ;
   private boolean n613TBM02_NOTE ;
   private boolean n359TBM03_DEL_FLG ;
   private boolean n346TBM03_VAR_DESC ;
   private boolean n347TBM03_SDTM_FLG ;
   private boolean n348TBM03_CDASH_FLG ;
   private boolean n532TBM03_INPUT_TYPE_DIV ;
   private boolean n349TBM03_REQUIRED_FLG ;
   private boolean n688TBM03_SAS_FIELD_NM ;
   private boolean n709TBM03_ODM_DATA_TYPE ;
   private boolean n350TBM03_NOTE ;
   private boolean n61TBM03_ORDER ;
   private boolean n932TBM03_VERSION ;
   private boolean GXt_boolean6 ;
   private boolean GXv_boolean7[] ;
   private String AV9C_APP_ID ;
   private String A367TBM21_STUDY_NM ;
   private String AV23W_A821_JS ;
   private String A615TBM02_DEL_FLG ;
   private String A49TBM02_DOM_CD ;
   private String A611TBM02_DOM_JNM ;
   private String A204TBM42_DOM_CD ;
   private String A893TBM42_DEL_FLG ;
   private String AV34D_GRD_DEL ;
   private String AV17H_INIT_FLG ;
   private String AV19H_SRCH_FLG ;
   private String AV18H_KNGN_FLG ;
   private String AV16H_DISP_DATETIME ;
   private String AV10C_GAMEN_TITLE ;
   private String AV30W_MSG ;
   private String A201TBM43_DOM_CD ;
   private String A202TBM43_DOM_VAR_NM ;
   private String AV26W_ERR_MSG ;
   private String A610TBM02_DOM_ENM ;
   private String A612TBM02_DOM_GRP_NM ;
   private String A613TBM02_NOTE ;
   private String A359TBM03_DEL_FLG ;
   private String A59TBM03_DOM_CD ;
   private String A60TBM03_DOM_VAR_NM ;
   private String A346TBM03_VAR_DESC ;
   private String A347TBM03_SDTM_FLG ;
   private String A348TBM03_CDASH_FLG ;
   private String A532TBM03_INPUT_TYPE_DIV ;
   private String A349TBM03_REQUIRED_FLG ;
   private String A688TBM03_SAS_FIELD_NM ;
   private String A709TBM03_ODM_DATA_TYPE ;
   private String A350TBM03_NOTE ;
   private String A932TBM03_VERSION ;
   private String AV27W_ERRCD ;
   private String AV22W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private ICheckbox chkavD_grd_all_chk ;
   private ICheckbox chkavCtlcheck ;
   private IDataStoreProvider pr_default ;
   private String[] H00122_A201TBM43_DOM_CD ;
   private long[] H00122_A200TBM43_STUDY_ID ;
   private String[] H00122_A202TBM43_DOM_VAR_NM ;
   private long[] H00123_A63TBM21_STUDY_ID ;
   private String[] H00123_A367TBM21_STUDY_NM ;
   private boolean[] H00123_n367TBM21_STUDY_NM ;
   private String[] H00124_A49TBM02_DOM_CD ;
   private String[] H00124_A615TBM02_DEL_FLG ;
   private boolean[] H00124_n615TBM02_DEL_FLG ;
   private String[] H00124_A611TBM02_DOM_JNM ;
   private boolean[] H00124_n611TBM02_DOM_JNM ;
   private int[] H00124_A614TBM02_ORDER ;
   private boolean[] H00124_n614TBM02_ORDER ;
   private String[] H00125_A204TBM42_DOM_CD ;
   private long[] H00125_A203TBM42_STUDY_ID ;
   private String[] H00125_A893TBM42_DEL_FLG ;
   private boolean[] H00125_n893TBM42_DEL_FLG ;
   private String[] H00126_A49TBM02_DOM_CD ;
   private String[] H00126_A610TBM02_DOM_ENM ;
   private boolean[] H00126_n610TBM02_DOM_ENM ;
   private String[] H00126_A611TBM02_DOM_JNM ;
   private boolean[] H00126_n611TBM02_DOM_JNM ;
   private String[] H00126_A612TBM02_DOM_GRP_NM ;
   private boolean[] H00126_n612TBM02_DOM_GRP_NM ;
   private String[] H00126_A613TBM02_NOTE ;
   private boolean[] H00126_n613TBM02_NOTE ;
   private int[] H00126_A614TBM02_ORDER ;
   private boolean[] H00126_n614TBM02_ORDER ;
   private String[] H00127_A359TBM03_DEL_FLG ;
   private boolean[] H00127_n359TBM03_DEL_FLG ;
   private String[] H00127_A59TBM03_DOM_CD ;
   private String[] H00127_A60TBM03_DOM_VAR_NM ;
   private String[] H00127_A346TBM03_VAR_DESC ;
   private boolean[] H00127_n346TBM03_VAR_DESC ;
   private String[] H00127_A347TBM03_SDTM_FLG ;
   private boolean[] H00127_n347TBM03_SDTM_FLG ;
   private String[] H00127_A348TBM03_CDASH_FLG ;
   private boolean[] H00127_n348TBM03_CDASH_FLG ;
   private String[] H00127_A532TBM03_INPUT_TYPE_DIV ;
   private boolean[] H00127_n532TBM03_INPUT_TYPE_DIV ;
   private String[] H00127_A349TBM03_REQUIRED_FLG ;
   private boolean[] H00127_n349TBM03_REQUIRED_FLG ;
   private String[] H00127_A688TBM03_SAS_FIELD_NM ;
   private boolean[] H00127_n688TBM03_SAS_FIELD_NM ;
   private String[] H00127_A709TBM03_ODM_DATA_TYPE ;
   private boolean[] H00127_n709TBM03_ODM_DATA_TYPE ;
   private String[] H00127_A350TBM03_NOTE ;
   private boolean[] H00127_n350TBM03_NOTE ;
   private int[] H00127_A61TBM03_ORDER ;
   private boolean[] H00127_n61TBM03_ORDER ;
   private String[] H00127_A932TBM03_VERSION ;
   private boolean[] H00127_n932TBM03_VERSION ;
   private String[] H00128_A204TBM42_DOM_CD ;
   private long[] H00128_A203TBM42_STUDY_ID ;
   private com.genexus.webpanels.WebSession AV31W_SESSION ;
   private GxObjectCollection AV5B402_SD06_STUDY_DOMAIN_C ;
   private SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem AV6B402_SD06_STUDY_DOMAIN_I ;
   private SdtTBM42_STUDY_CDISC_DOMAIN AV7BC_TBM42_STUDY_DOMAIN ;
   private SdtTBM43_STUDY_CDISC_ITEM AV8BC_TBM43_STUDY_CDISC_ITEM ;
   private SdtA_PAGING_SDT AV15H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT5[] ;
   private SdtA_LOGIN_SDT AV21W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b402_wp12_study_domain_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00122", "SELECT `TBM43_DOM_CD`, `TBM43_STUDY_ID`, `TBM43_DOM_VAR_NM` FROM `TBM43_STUDY_CDISC_ITEM` WHERE `TBM43_STUDY_ID` = ? and `TBM43_DOM_CD` = ? ORDER BY `TBM43_STUDY_ID`, `TBM43_DOM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00123", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00124", "SELECT `TBM02_DOM_CD`, `TBM02_DEL_FLG`, `TBM02_DOM_JNM`, `TBM02_ORDER` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DEL_FLG` <> '1' ORDER BY `TBM02_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00125", "SELECT `TBM42_DOM_CD`, `TBM42_STUDY_ID`, `TBM42_DEL_FLG` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? and `TBM42_DOM_CD` = ? ORDER BY `TBM42_STUDY_ID`, `TBM42_DOM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00126", "SELECT `TBM02_DOM_CD`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ORDER BY `TBM02_DOM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00127", "SELECT `TBM03_DEL_FLG`, `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION` FROM `TBM03_CDISC_ITEM` WHERE (`TBM03_DOM_CD` = ?) AND (`TBM03_DEL_FLG` <> '1') ORDER BY `TBM03_DOM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00128", "SELECT `TBM42_DOM_CD`, `TBM42_STUDY_ID` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? ORDER BY `TBM42_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
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
               stmt.setVarchar(2, (String)parms[1], 16);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 16);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 16);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 16);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

