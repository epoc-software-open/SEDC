/*
               File: b402_wp08_crf_reg_impl
        Description: 試験登録（CRF登録）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:24:30.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp08_crf_reg_impl extends GXWebPanel
{
   public b402_wp08_crf_reg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp08_crf_reg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp08_crf_reg_impl.class ));
   }

   public b402_wp08_crf_reg_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavCtltbm31_status = new HTMLChoice();
      chkavCtltbm31_dm_excp_no_disp_flg = UIFactory.getCheckbox(this);
      radavCtltbm31_del_flg = new HTMLChoice();
      radavCtltbm31_repeat_flg = new HTMLChoice();
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
            nRC_GXsfl_115 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_115_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_115_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_115, nGXsfl_115_idx, sGXsfl_115_idx) ;
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
            AV14P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV13P_CRF_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", AV13P_CRF_ID);
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
         pa1B2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1B2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1B2( ) ;
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
      httpContext.writeValue( "試験登録（CRF登録）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513243028");
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
      GXEncryptionTmp = "b402_wp08_crf_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV13P_CRF_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp08_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1B2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_crf", AV5BC_CRF);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_crf", AV5BC_CRF);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sd_b402_sd07_crf_visit_c", AV34SD_B402_SD07_CRF_VISIT_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sd_b402_sd07_crf_visit_c", AV34SD_B402_SD07_CRF_VISIT_C);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_115", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_115, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV61Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV6C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_APP_ID", GetHash( "", String.valueOf(AV6C_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV14P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_ID", GXutil.rtrim( AV13P_CRF_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_ID", GXutil.rtrim( A55TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_NM", GXutil.rtrim( A205TAM07_USER_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A945TBM44_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_ID", GXutil.ltrim( localUtil.ntoc( A946TBM44_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( A947TBM44_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM44_VISIT_NO", GXutil.ltrim( localUtil.ntoc( A948TBM44_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_B402_SD07_CRF_VISIT_C", AV34SD_B402_SD07_CRF_VISIT_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_B402_SD07_CRF_VISIT_C", AV34SD_B402_SD07_CRF_VISIT_C);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBC_CRF", AV5BC_CRF);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBC_CRF", AV5BC_CRF);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV21W_A821_JS));
      GxWebStd.gx_hidden_field( httpContext, "vW_A819_JS", GXutil.rtrim( AV20W_A819_JS));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_REG_ENABEL", AV29W_REG_ENABEL);
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_UPD_ENABEL", AV30W_UPD_ENABEL);
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_DLT_ENABEL", AV24W_DLT_ENABEL);
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
      return "B402_WP08_CRF_REG" ;
   }

   public String getPgmdesc( )
   {
      return "試験登録（CRF登録）" ;
   }

   public void wb1B0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1B2( true) ;
      }
      else
      {
         wb_table1_2_1B2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_164_1B2( true) ;
      }
      else
      {
         wb_table2_164_1B2( false) ;
      }
      return  ;
   }

   public void wb_table2_164_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1B2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験登録（CRF登録）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0162") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0162", "");
         }
      }
      wbErr = false ;
      strup1B0( ) ;
   }

   public void ws1B2( )
   {
      start1B2( ) ;
      evt1B2( ) ;
   }

   public void evt1B2( )
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
                        /* Execute user event: e111B2 */
                        e111B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121B2 */
                        e121B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131B2 */
                        e131B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141B2 */
                        e141B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151B2 */
                        e151B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161B2 */
                        e161B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171B2 */
                        e171B2 ();
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
                        nGXsfl_115_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1152( ) ;
                        AV53GXV12 = nGXsfl_115_idx ;
                        if ( ( AV34SD_B402_SD07_CRF_VISIT_C.size() >= AV53GXV12 ) && ( AV53GXV12 > 0 ) )
                        {
                           AV34SD_B402_SD07_CRF_VISIT_C.currentItem( ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)) );
                           ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)).setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm44_crf_eda_no_Internalname), ".", ",")) );
                           ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)).setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm44_visit_no_Internalname), ".", ",")) );
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0162") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0162", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0162") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0162", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e181B2 */
                              e181B2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e191B2 */
                              e191B2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e201B2 */
                              e201B2 ();
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
                  else if ( nCmpId == 162 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0162") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0162", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1B2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1B2( ) ;
         }
      }
   }

   public void pa1B2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp08_crf_reg")), "b402_wp08_crf_reg") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp08_crf_reg"))) ;
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
                  AV14P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV13P_CRF_ID = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", AV13P_CRF_ID);
                  }
               }
            }
         }
         radavCtltbm31_status.setName( "CTLTBM31_STATUS" );
         radavCtltbm31_status.setWebtags( "" );
         chkavCtltbm31_dm_excp_no_disp_flg.setName( "CTLTBM31_DM_EXCP_NO_DISP_FLG" );
         chkavCtltbm31_dm_excp_no_disp_flg.setWebtags( "" );
         chkavCtltbm31_dm_excp_no_disp_flg.setCaption( "DM以外非表示" );
         httpContext.ajax_rsp_assign_prop("", false, chkavCtltbm31_dm_excp_no_disp_flg.getInternalname(), "Caption", chkavCtltbm31_dm_excp_no_disp_flg.getCaption());
         chkavCtltbm31_dm_excp_no_disp_flg.setCheckedValue( "0" );
         radavCtltbm31_del_flg.setName( "CTLTBM31_DEL_FLG" );
         radavCtltbm31_del_flg.setWebtags( "" );
         radavCtltbm31_repeat_flg.setName( "CTLTBM31_REPEAT_FLG" );
         radavCtltbm31_repeat_flg.setWebtags( "" );
         radavCtltbm31_repeat_flg.addItem("0", "不可", (short)(0));
         radavCtltbm31_repeat_flg.addItem("1", "可", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_115 ,
                                 short nGXsfl_115_idx ,
                                 String sGXsfl_115_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1152( ) ;
      while ( nGXsfl_115_idx <= nRC_GXsfl_115 )
      {
         sendrow_1152( ) ;
         nGXsfl_115_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_115_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_115_idx+1)) ;
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1152( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1B2( ) ;
      /* End function Refresh */
   }

   public void rf1B2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridLTM-1"));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGridLTM-1");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(115) ;
      nGXsfl_115_idx = (short)(1) ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1152( ) ;
      nGXsfl_115_Refreshing = (short)(1) ;
      /* Execute user event: e191B2 */
      e191B2 ();
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
         subsflControlProps_1152( ) ;
         /* Execute user event: e201B2 */
         e201B2 ();
         wbEnd = (short)(115) ;
         wb1B0( ) ;
      }
      nGXsfl_115_Refreshing = (short)(0) ;
   }

   public int subgrid1_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public void strup1B0( )
   {
      /* Before Start, stand alone formulas. */
      AV61Pgmname = "B402_WP08_CRF_REG" ;
      AV60Pgmdesc = "試験登録（CRF登録）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm31_study_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_study_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_study_id_Enabled, 5, 0)));
      edtavCtltbm44_crf_eda_no_Enabled = 0 ;
      edtavCtltbm31_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_crt_datetime_Enabled, 5, 0)));
      edtavCtltbm31_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_upd_datetime_Enabled, 5, 0)));
      edtavD_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crt_user_nm_Enabled, 5, 0)));
      edtavD_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_upd_user_nm_Enabled, 5, 0)));
      edtavCtltbm31_crt_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crt_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_crt_prog_nm_Enabled, 5, 0)));
      edtavCtltbm31_upd_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_upd_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_upd_prog_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e181B2 */
      e181B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_crf"), AV5BC_CRF);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sd_b402_sd07_crf_visit_c"), AV34SD_B402_SD07_CRF_VISIT_C);
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_STUDY_ID");
            GX_FocusControl = edtavCtltbm31_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_study_id( 0 );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_study_id( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_study_id_Internalname), ".", ",") );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_CRF_ID");
            GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_id( (short)(0) );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname), ".", ",")) );
         }
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_nm( httpContext.cgiGet( edtavCtltbm31_crf_nm_Internalname) );
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_snm( httpContext.cgiGet( edtavCtltbm31_crf_snm_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_order_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_order_Internalname), ".", ",") > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_ORDER");
            GX_FocusControl = edtavCtltbm31_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_order( 0 );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_order( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_order_Internalname), ".", ",")) );
         }
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_status( httpContext.cgiGet( radavCtltbm31_status.getInternalname()) );
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_note( httpContext.cgiGet( edtavCtltbm31_note_Internalname) );
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg( ((GXutil.strcmp(httpContext.cgiGet( chkavCtltbm31_dm_excp_no_disp_flg.getInternalname()), "1")==0) ? "1" : "0") );
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_del_flg( httpContext.cgiGet( radavCtltbm31_del_flg.getInternalname()) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( radavCtltbm31_repeat_flg.getInternalname()), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( radavCtltbm31_repeat_flg.getInternalname()), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_REPEAT_FLG");
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg( (byte)(0) );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg( (byte)(localUtil.ctol( httpContext.cgiGet( radavCtltbm31_repeat_flg.getInternalname()), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_repeat_max_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_repeat_max_Internalname), ".", ",") > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM31_REPEAT_MAX");
            GX_FocusControl = edtavCtltbm31_repeat_max_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_repeat_max( (byte)(0) );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_repeat_max( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm31_repeat_max_Internalname), ".", ",")) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm31_crt_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM31_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm31_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm31_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm31_upd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM31_UPD_DATETIME");
            GX_FocusControl = edtavCtltbm31_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm31_upd_datetime_Internalname)) );
         }
         AV8D_CRT_USER_NM = httpContext.cgiGet( edtavD_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
         AV9D_UPD_USER_NM = httpContext.cgiGet( edtavD_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm( httpContext.cgiGet( edtavCtltbm31_crt_prog_nm_Internalname) );
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( httpContext.cgiGet( edtavCtltbm31_upd_prog_nm_Internalname) );
         AV10H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
         AV12H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         AV11H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
         /* Read saved values. */
         nRC_GXsfl_115 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), ".", ",")) ;
         AV14P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV13P_CRF_ID = httpContext.cgiGet( "vP_CRF_ID") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0162") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0162", "");
         }
         nRC_GXsfl_115 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), ".", ",")) ;
         nGXsfl_115_fel_idx = (short)(0) ;
         while ( nGXsfl_115_fel_idx < nRC_GXsfl_115 )
         {
            nGXsfl_115_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_115_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_115_fel_idx+1)) ;
            sGXsfl_115_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1152( ) ;
            AV53GXV12 = nGXsfl_115_fel_idx ;
            AV53GXV12 = nGXsfl_115_fel_idx ;
            if ( ( AV34SD_B402_SD07_CRF_VISIT_C.size() >= AV53GXV12 ) && ( AV53GXV12 > 0 ) )
            {
               AV34SD_B402_SD07_CRF_VISIT_C.currentItem( ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)) );
               ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)).setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm44_crf_eda_no_Internalname), ".", ",")) );
               ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)).setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm44_visit_no_Internalname), ".", ",")) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0162") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0162", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0162") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0162", "");
            }
            AV34SD_B402_SD07_CRF_VISIT_C.currentItem( ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)) );
         }
         if ( nGXsfl_115_fel_idx == 0 )
         {
            nGXsfl_115_idx = (short)(1) ;
            sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1152( ) ;
         }
         nGXsfl_115_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e181B2 */
      e181B2 ();
      if (returnInSub) return;
   }

   public void e181B2( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      AV7C_GAMEN_TITLE = AV60Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_GAMEN_TITLE", AV7C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV10H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV17W_A_LOGIN_SDT,AV6C_APP_ID,AV7C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0162",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e191B2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV10H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV61Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV10H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_INIT_FLG", AV10H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void e111B2( )
   {
      /* 'BTN_REG' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV29W_REG_ENABEL )
      {
         AV27W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRFLG", AV27W_ERRFLG);
         AV23W_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23W_DEL_FLG", AV23W_DEL_FLG);
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         if ( ! AV27W_ERRFLG )
         {
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
            b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            GXt_char1 = AV21W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
            b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            AV21W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
         }
      }
   }

   public void e151B2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV29W_REG_ENABEL )
      {
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no( ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+1)).getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm( AV61Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( AV61Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.Save();
         if ( AV5BC_CRF.Success() )
         {
            AV62GXV19 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62GXV19", GXutil.ltrim( GXutil.str( AV62GXV19, 8, 0)));
            while ( AV62GXV19 <= AV34SD_B402_SD07_CRF_VISIT_C.size() )
            {
               AV35SD_B402_SD07_CRF_VISIT_I = (SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV62GXV19));
               AV33BC_TBM44 = (SdtTBM44_CRF_VISIT)new SdtTBM44_CRF_VISIT( remoteHandle, context);
               AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id( AV14P_STUDY_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no( AV35SD_B402_SD07_CRF_VISIT_I.getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no( AV35SD_B402_SD07_CRF_VISIT_I.getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg( "0" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm( AV61Pgmname );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm( AV61Pgmname );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               AV33BC_TBM44.Save();
               if ( AV33BC_TBM44.Success() )
               {
               }
               else
               {
                  GXt_char1 = AV28W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV33BC_TBM44.GetMessages(), (byte)(0), GXv_char2) ;
                  b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV28W_MSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
                  if (true) break;
               }
               if ( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg() == 0 )
               {
                  if (true) break;
               }
               else
               {
                  if ( AV35SD_B402_SD07_CRF_VISIT_I.getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no() >= AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_max() )
                  {
                     if (true) break;
                  }
               }
               AV62GXV19 = (int)(AV62GXV19+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62GXV19", GXutil.ltrim( GXutil.str( AV62GXV19, 8, 0)));
            }
            if ( (GXutil.strcmp("", AV28W_MSG)==0) )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
               GXKey = context.getSiteKey( ) ;
               GXEncryptionTmp = "b402_wp08_crf_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
               httpContext.wjLoc = formatLink("b402_wp08_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
            else
            {
               Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
               httpContext.GX_msglist.addItem(AV28W_MSG);
            }
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF.GetMessages(), (byte)(0), GXv_char2) ;
            b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
   }

   public void e121B2( )
   {
      /* 'BTN_UPD' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV30W_UPD_ENABEL )
      {
         AV27W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRFLG", AV27W_ERRFLG);
         AV23W_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23W_DEL_FLG", AV23W_DEL_FLG);
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         if ( ! AV27W_ERRFLG )
         {
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char2) ;
            b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            GXt_char1 = AV21W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_UPD_EXEC", "", GXv_char2) ;
            b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            AV21W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
         }
      }
   }

   public void e161B2( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV30W_UPD_ENABEL )
      {
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no( ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+1)).getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( AV61Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV5BC_CRF.Save();
         if ( AV5BC_CRF.Success() )
         {
            /* Using cursor H001B2 */
            pr_default.execute(0, new Object[] {new Long(AV14P_STUDY_ID), new Short(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id())});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A946TBM44_CRF_ID = H001B2_A946TBM44_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
               A945TBM44_STUDY_ID = H001B2_A945TBM44_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
               A947TBM44_CRF_EDA_NO = H001B2_A947TBM44_CRF_EDA_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
               AV33BC_TBM44.Load(A945TBM44_STUDY_ID, A946TBM44_CRF_ID, A947TBM44_CRF_EDA_NO);
               if ( AV33BC_TBM44.Fail() )
               {
               }
               else
               {
                  AV33BC_TBM44.Delete();
               }
               pr_default.readNext(0);
            }
            pr_default.close(0);
            AV64GXV20 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64GXV20", GXutil.ltrim( GXutil.str( AV64GXV20, 8, 0)));
            while ( AV64GXV20 <= AV34SD_B402_SD07_CRF_VISIT_C.size() )
            {
               AV35SD_B402_SD07_CRF_VISIT_I = (SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV64GXV20));
               AV33BC_TBM44.Load(AV14P_STUDY_ID, AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id(), AV35SD_B402_SD07_CRF_VISIT_I.getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no());
               if ( AV33BC_TBM44.Fail() )
               {
                  AV33BC_TBM44 = (SdtTBM44_CRF_VISIT)new SdtTBM44_CRF_VISIT( remoteHandle, context);
                  AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_study_id( AV14P_STUDY_ID );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
                  AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_id( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
                  AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crf_eda_no( AV35SD_B402_SD07_CRF_VISIT_I.getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
                  AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no( AV35SD_B402_SD07_CRF_VISIT_I.getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
                  AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_del_flg( "0" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
                  AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_crt_prog_nm( AV61Pgmname );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               }
               else
               {
                  AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_visit_no( AV35SD_B402_SD07_CRF_VISIT_I.getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               }
               AV33BC_TBM44.setgxTv_SdtTBM44_CRF_VISIT_Tbm44_upd_prog_nm( AV61Pgmname );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33BC_TBM44", AV33BC_TBM44);
               AV33BC_TBM44.Save();
               if ( AV33BC_TBM44.Success() )
               {
               }
               else
               {
                  GXt_char1 = AV28W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV33BC_TBM44.GetMessages(), (byte)(0), GXv_char2) ;
                  b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV28W_MSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
                  if (true) break;
               }
               if ( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg() == 0 )
               {
                  if (true) break;
               }
               else
               {
                  if ( AV35SD_B402_SD07_CRF_VISIT_I.getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no() >= AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_max() )
                  {
                     if (true) break;
                  }
               }
               AV64GXV20 = (int)(AV64GXV20+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64GXV20", GXutil.ltrim( GXutil.str( AV64GXV20, 8, 0)));
            }
            if ( (GXutil.strcmp("", AV28W_MSG)==0) )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
               GXKey = context.getSiteKey( ) ;
               GXEncryptionTmp = "b402_wp07_crf_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) ;
               httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
            else
            {
               Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
               httpContext.GX_msglist.addItem(AV28W_MSG);
            }
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF.GetMessages(), (byte)(0), GXv_char2) ;
            b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
   }

   public void e131B2( )
   {
      /* 'BTN_DLT' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV24W_DLT_ENABEL )
      {
         AV27W_ERRFLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRFLG", AV27W_ERRFLG);
         AV23W_DEL_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23W_DEL_FLG", AV23W_DEL_FLG);
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
         if ( ! AV27W_ERRFLG )
         {
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
            b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            GXt_char1 = AV21W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_DLT_EXEC", "", GXv_char2) ;
            b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            AV21W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
         }
      }
   }

   public void e171B2( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      if ( AV24W_DLT_ENABEL )
      {
         GXv_int3[0] = AV25W_ERR_CD ;
         GXv_char2[0] = AV28W_MSG ;
         new b402_pc23_crf_del(remoteHandle, context).execute( AV5BC_CRF, GXv_int3, GXv_char2) ;
         b402_wp08_crf_reg_impl.this.AV25W_ERR_CD = (byte)((byte)(GXv_int3[0])) ;
         b402_wp08_crf_reg_impl.this.AV28W_MSG = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_ERR_CD", GXutil.str( AV25W_ERR_CD, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
         if ( AV25W_ERR_CD == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "b402_wp07_crf_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) ;
            httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
   }

   public void e141B2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp07_crf_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S152( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
      radavCtltbm31_status.removeAllItems();
      radavCtltbm31_status.addItem("0", gxdomainct_status.getDescription(httpContext,(String)"0"), (short)(0));
      radavCtltbm31_status.addItem("1", gxdomainct_status.getDescription(httpContext,(String)"1"), (short)(0));
      radavCtltbm31_status.addItem("9", gxdomainct_status.getDescription(httpContext,(String)"9"), (short)(0));
      radavCtltbm31_del_flg.removeAllItems();
      radavCtltbm31_del_flg.addItem("0", gxdomainct_del_flg.getDescription(httpContext,(String)"0"), (short)(0));
      radavCtltbm31_del_flg.addItem("1", gxdomainct_del_flg.getDescription(httpContext,(String)"1"), (short)(0));
   }

   public void S182( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] = AV15W_A_CHK_RESULT_SDT ;
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] = AV18W_A_RESULT_MSG_SDT ;
      new b402_pc15_crf_mst_chk(remoteHandle, context).execute( AV5BC_CRF, AV23W_DEL_FLG, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5) ;
      AV15W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] ;
      AV18W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_DEL_FLG", AV23W_DEL_FLG);
      if ( AV18W_A_RESULT_MSG_SDT.size() > 0 )
      {
         AV27W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRFLG", AV27W_ERRFLG);
         AV65GXV21 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65GXV21", GXutil.ltrim( GXutil.str( AV65GXV21, 8, 0)));
         while ( AV65GXV21 <= AV18W_A_RESULT_MSG_SDT.size() )
         {
            AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV18W_A_RESULT_MSG_SDT.elementAt(-1+AV65GXV21));
            httpContext.GX_msglist.addItem(AV19W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
            AV65GXV21 = (int)(AV65GXV21+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65GXV21", GXutil.ltrim( GXutil.str( AV65GXV21, 8, 0)));
         }
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S192( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavCtltbm31_crf_id_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_id_Backcolor, 9, 0)));
      edtavCtltbm31_crf_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_nm_Backcolor, 9, 0)));
      edtavCtltbm31_crf_snm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_snm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_snm_Backcolor, 9, 0)));
      edtavCtltbm31_order_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_order_Backcolor, 9, 0)));
      edtavCtltbm31_note_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_note_Backcolor, 9, 0)));
   }

   public void S202( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV66GXV22 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66GXV22", GXutil.ltrim( GXutil.str( AV66GXV22, 8, 0)));
      while ( AV66GXV22 <= AV15W_A_CHK_RESULT_SDT.size() )
      {
         AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV15W_A_CHK_RESULT_SDT.elementAt(-1+AV66GXV22));
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         AV66GXV22 = (int)(AV66GXV22+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66GXV22", GXutil.ltrim( GXutil.str( AV66GXV22, 8, 0)));
      }
   }

   public void S212( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_CRF_ID") == 0 )
      {
         edtavCtltbm31_crf_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_id_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_CRF_NM") == 0 )
      {
         edtavCtltbm31_crf_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_nm_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_crf_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_CRF_SNM") == 0 )
      {
         edtavCtltbm31_crf_snm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_snm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_snm_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_crf_snm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_ORDER") == 0 )
      {
         edtavCtltbm31_order_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_order_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_order_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_order_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM31_NOTE") == 0 )
      {
         edtavCtltbm31_note_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_note_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm31_note_Backcolor, 9, 0)));
         if ( AV16W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm31_note_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( ! (0==AV14P_STUDY_ID) && ! (GXutil.strcmp("", AV13P_CRF_ID)==0) )
      {
         AV12H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         AV22W_CRF_ID = (short)(GXutil.lval( AV13P_CRF_ID)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22W_CRF_ID", GXutil.ltrim( GXutil.str( AV22W_CRF_ID, 4, 0)));
         AV5BC_CRF.Load(AV14P_STUDY_ID, AV22W_CRF_ID);
         if ( AV5BC_CRF.Fail() )
         {
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
         else
         {
            AV67GXLvl483 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67GXLvl483", GXutil.str( AV67GXLvl483, 1, 0));
            /* Using cursor H001B3 */
            pr_default.execute(1, new Object[] {AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id()});
            if ( Gx_err != 0 )
            {
               AV67GXLvl483 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67GXLvl483", GXutil.str( AV67GXLvl483, 1, 0));
            }
            while ( (pr_default.getStatus(1) != 101) )
            {
               A55TAM07_USER_ID = H001B3_A55TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
               A205TAM07_USER_NM = H001B3_A205TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               n205TAM07_USER_NM = H001B3_n205TAM07_USER_NM[0] ;
               AV67GXLvl483 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67GXLvl483", GXutil.str( AV67GXLvl483, 1, 0));
               GXt_char1 = AV8D_CRT_USER_NM ;
               GXv_char2[0] = GXt_char1 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
               b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               AV8D_CRT_USER_NM = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            if ( AV67GXLvl483 == 0 )
            {
               AV8D_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id(), AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id()) == 0 )
            {
               AV9D_UPD_USER_NM = AV8D_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
            }
            else
            {
               AV68GXLvl498 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68GXLvl498", GXutil.str( AV68GXLvl498, 1, 0));
               /* Using cursor H001B4 */
               pr_default.execute(2, new Object[] {AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id()});
               if ( Gx_err != 0 )
               {
                  AV68GXLvl498 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV68GXLvl498", GXutil.str( AV68GXLvl498, 1, 0));
               }
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A55TAM07_USER_ID = H001B4_A55TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
                  A205TAM07_USER_NM = H001B4_A205TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  n205TAM07_USER_NM = H001B4_n205TAM07_USER_NM[0] ;
                  AV68GXLvl498 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV68GXLvl498", GXutil.str( AV68GXLvl498, 1, 0));
                  GXt_char1 = AV9D_UPD_USER_NM ;
                  GXv_char2[0] = GXt_char1 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
                  b402_wp08_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  AV9D_UPD_USER_NM = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
               if ( AV68GXLvl498 == 0 )
               {
                  AV9D_UPD_USER_NM = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
               }
            }
         }
         /* Using cursor H001B5 */
         pr_default.execute(3, new Object[] {new Long(AV14P_STUDY_ID), new Short(AV22W_CRF_ID)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A946TBM44_CRF_ID = H001B5_A946TBM44_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A946TBM44_CRF_ID", GXutil.ltrim( GXutil.str( A946TBM44_CRF_ID, 4, 0)));
            A945TBM44_STUDY_ID = H001B5_A945TBM44_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945TBM44_STUDY_ID", GXutil.ltrim( GXutil.str( A945TBM44_STUDY_ID, 10, 0)));
            A947TBM44_CRF_EDA_NO = H001B5_A947TBM44_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A947TBM44_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A947TBM44_CRF_EDA_NO, 2, 0)));
            A948TBM44_VISIT_NO = H001B5_A948TBM44_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A948TBM44_VISIT_NO", GXutil.ltrim( GXutil.str( A948TBM44_VISIT_NO, 6, 0)));
            n948TBM44_VISIT_NO = H001B5_n948TBM44_VISIT_NO[0] ;
            AV35SD_B402_SD07_CRF_VISIT_I = (SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)new SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem(remoteHandle, context);
            AV35SD_B402_SD07_CRF_VISIT_I.setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no( A947TBM44_CRF_EDA_NO );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B402_SD07_CRF_VISIT_I", AV35SD_B402_SD07_CRF_VISIT_I);
            AV35SD_B402_SD07_CRF_VISIT_I.setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no( A948TBM44_VISIT_NO );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B402_SD07_CRF_VISIT_I", AV35SD_B402_SD07_CRF_VISIT_I);
            AV34SD_B402_SD07_CRF_VISIT_C.add(AV35SD_B402_SD07_CRF_VISIT_I, 0);
            gx_BV115 = true ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV38W_CNT_ST = (short)(AV34SD_B402_SD07_CRF_VISIT_C.size()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT_ST", GXutil.ltrim( GXutil.str( AV38W_CNT_ST, 4, 0)));
         AV37W_CNT_MAX = (short)(99-AV38W_CNT_ST) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37W_CNT_MAX", GXutil.ltrim( GXutil.str( AV37W_CNT_MAX, 4, 0)));
         AV36W_CNT = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36W_CNT", GXutil.ltrim( GXutil.str( AV36W_CNT, 4, 0)));
         while ( AV36W_CNT <= AV37W_CNT_MAX )
         {
            AV38W_CNT_ST = (short)(AV38W_CNT_ST+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38W_CNT_ST", GXutil.ltrim( GXutil.str( AV38W_CNT_ST, 4, 0)));
            AV35SD_B402_SD07_CRF_VISIT_I = (SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)new SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem(remoteHandle, context);
            AV35SD_B402_SD07_CRF_VISIT_I.setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no( (byte)(AV38W_CNT_ST) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B402_SD07_CRF_VISIT_I", AV35SD_B402_SD07_CRF_VISIT_I);
            AV34SD_B402_SD07_CRF_VISIT_C.add(AV35SD_B402_SD07_CRF_VISIT_I, 0);
            gx_BV115 = true ;
            AV36W_CNT = (short)(AV36W_CNT+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36W_CNT", GXutil.ltrim( GXutil.str( AV36W_CNT, 4, 0)));
         }
         edtavCtltbm31_crf_id_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_id_Enabled, 5, 0)));
         radavCtltbm31_status.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, radavCtltbm31_status.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radavCtltbm31_status.getEnabled(), 5, 0)));
         edtavCtltbm31_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm31_crt_datetime_Visible, 5, 0)));
         edtavCtltbm31_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm31_upd_datetime_Visible, 5, 0)));
         if ( new b402_pc22_is_study_run(remoteHandle, context).executeUdp( AV14P_STUDY_ID) )
         {
            radavCtltbm31_del_flg.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, radavCtltbm31_del_flg.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radavCtltbm31_del_flg.getEnabled(), 5, 0)));
         }
         GX_FocusControl = edtavCtltbm31_crf_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV12H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_MODE", AV12H_MODE);
         AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_study_id( AV14P_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
         AV36W_CNT = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36W_CNT", GXutil.ltrim( GXutil.str( AV36W_CNT, 4, 0)));
         while ( AV36W_CNT <= 99 )
         {
            AV35SD_B402_SD07_CRF_VISIT_I = (SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)new SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem(remoteHandle, context);
            AV35SD_B402_SD07_CRF_VISIT_I.setgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no( (byte)(AV36W_CNT) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SD_B402_SD07_CRF_VISIT_I", AV35SD_B402_SD07_CRF_VISIT_I);
            AV34SD_B402_SD07_CRF_VISIT_C.add(AV35SD_B402_SD07_CRF_VISIT_I, 0);
            gx_BV115 = true ;
            AV36W_CNT = (short)(AV36W_CNT+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36W_CNT", GXutil.ltrim( GXutil.str( AV36W_CNT, 4, 0)));
         }
         edtavCtltbm31_crf_id_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crf_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm31_crf_id_Enabled, 5, 0)));
         radavCtltbm31_status.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, radavCtltbm31_status.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radavCtltbm31_status.getEnabled(), 5, 0)));
         edtavCtltbm31_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm31_crt_datetime_Visible, 5, 0)));
         edtavCtltbm31_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm31_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm31_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltbm31_crf_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /* Using cursor H001B6 */
      pr_default.execute(4, new Object[] {new Long(AV14P_STUDY_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A63TBM21_STUDY_ID = H001B6_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H001B6_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H001B6_n367TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S172( )
   {
      /* 'SUB_GET_PROC_ENABLE' Routine */
      GXt_boolean6 = AV29W_REG_ENABEL ;
      GXv_boolean7[0] = GXt_boolean6 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV11H_KNGN_FLG, "", GXv_boolean7) ;
      b402_wp08_crf_reg_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      AV29W_REG_ENABEL = GXt_boolean6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29W_REG_ENABEL", AV29W_REG_ENABEL);
      GXt_boolean6 = AV24W_DLT_ENABEL ;
      GXv_boolean7[0] = GXt_boolean6 ;
      new b402_pc22_is_study_run(remoteHandle, context).execute( AV14P_STUDY_ID, GXv_boolean7) ;
      b402_wp08_crf_reg_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
      GXt_boolean8 = AV24W_DLT_ENABEL ;
      GXv_boolean9[0] = GXt_boolean8 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV11H_KNGN_FLG, "", GXv_boolean9) ;
      b402_wp08_crf_reg_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      AV24W_DLT_ENABEL = (GXt_boolean6 ? false : GXt_boolean8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_DLT_ENABEL", AV24W_DLT_ENABEL);
      GXt_boolean8 = AV30W_UPD_ENABEL ;
      GXv_boolean9[0] = GXt_boolean8 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV11H_KNGN_FLG, "", GXv_boolean9) ;
      b402_wp08_crf_reg_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      AV30W_UPD_ENABEL = GXt_boolean8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30W_UPD_ENABEL", AV30W_UPD_ENABEL);
      AV29W_REG_ENABEL = ((GXutil.strcmp(AV12H_MODE, "1")==0) ? false : AV29W_REG_ENABEL) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29W_REG_ENABEL", AV29W_REG_ENABEL);
      AV24W_DLT_ENABEL = ((GXutil.strcmp(AV12H_MODE, "1")==0) ? AV24W_DLT_ENABEL : false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_DLT_ENABEL", AV24W_DLT_ENABEL);
      AV30W_UPD_ENABEL = ((GXutil.strcmp(AV12H_MODE, "1")==0) ? AV30W_UPD_ENABEL : false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30W_UPD_ENABEL", AV30W_UPD_ENABEL);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT10[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV26W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT10, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT10[0] ;
      b402_wp08_crf_reg_impl.this.AV26W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRCD", AV26W_ERRCD);
      if ( GXutil.strcmp(AV26W_ERRCD, "0") != 0 )
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
      AV21W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
      AV20W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_A819_JS", AV20W_A819_JS);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_study_id( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_id( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crf_snm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_grid_size( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_order( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_status( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_note( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_del_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      GXt_dtime11 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime( GXt_dtime11 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      GXt_dtime11 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime( GXt_dtime11 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV5BC_CRF.setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF", AV5BC_CRF);
      AV8D_CRT_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
      AV9D_UPD_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPD_USER_NM", AV9D_UPD_USER_NM);
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV21W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV21W_A821_JS ;
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
      if ( ! (GXutil.strcmp("", AV20W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV20W_A819_JS ;
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
      GXv_char2[0] = AV11H_KNGN_FLG ;
      GXv_char12[0] = AV26W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char2, GXv_char12) ;
      b402_wp08_crf_reg_impl.this.AV11H_KNGN_FLG = GXv_char2[0] ;
      b402_wp08_crf_reg_impl.this.AV26W_ERRCD = GXv_char12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_KNGN_FLG", AV11H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRCD", AV26W_ERRCD);
      if ( GXutil.strcmp(AV26W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV61Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp08_crf_reg");
   }

   public void S222( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      lblTxt_btn_reg_Visible = (AV29W_REG_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_upd_Visible = (AV30W_UPD_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
      lblTxt_btn_dlt_Visible = (AV24W_DLT_ENABEL ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
   }

   private void e201B2( )
   {
      /* Grid1_Load Routine */
      AV53GXV12 = (short)(1) ;
      while ( AV53GXV12 <= AV34SD_B402_SD07_CRF_VISIT_C.size() )
      {
         AV34SD_B402_SD07_CRF_VISIT_C.currentItem( ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34SD_B402_SD07_CRF_VISIT_C", AV34SD_B402_SD07_CRF_VISIT_C);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(115) ;
         }
         sendrow_1152( ) ;
         AV53GXV12 = (short)(AV53GXV12+1) ;
      }
   }

   public void wb_table2_164_1B2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP08_CRF_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_reg_exec_Internalname, "BTN_REG_EXEC", "", "", lblBtn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_upd_exec_Internalname, "BTN_UPD_EXEC", "", "", lblBtn_upd_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_dlt_exec_Internalname, "BTN_DLT_EXEC", "", "", lblBtn_dlt_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV10H_INIT_FLG), GXutil.rtrim( localUtil.format( AV10H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV12H_MODE), GXutil.rtrim( localUtil.format( AV12H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(172);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_mode_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV11H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV11H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_164_1B2e( true) ;
      }
      else
      {
         wb_table2_164_1B2e( false) ;
      }
   }

   public void wb_table1_2_1B2( boolean wbgen )
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
         wb_table3_6_1B2( true) ;
      }
      else
      {
         wb_table3_6_1B2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1B2e( boolean wbgen )
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
         wb_table1_2_1B2e( true) ;
      }
      else
      {
         wb_table1_2_1B2e( false) ;
      }
   }

   public void wb_table3_6_1B2( boolean wbgen )
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
         wb_table4_12_1B2( true) ;
      }
      else
      {
         wb_table4_12_1B2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_24_1B2( true) ;
      }
      else
      {
         wb_table5_24_1B2( false) ;
      }
      return  ;
   }

   public void wb_table5_24_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0162"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0162"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0162"+"");
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
         wb_table3_6_1B2e( true) ;
      }
      else
      {
         wb_table3_6_1B2e( false) ;
      }
   }

   public void wb_table5_24_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         wb_table6_30_1B2( true) ;
      }
      else
      {
         wb_table6_30_1B2( false) ;
      }
      return  ;
   }

   public void wb_table6_30_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_81_1B2( true) ;
      }
      else
      {
         wb_table7_81_1B2( false) ;
      }
      return  ;
   }

   public void wb_table7_81_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table8_98_1B2( true) ;
      }
      else
      {
         wb_table8_98_1B2( false) ;
      }
      return  ;
   }

   public void wb_table8_98_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table9_130_1B2( true) ;
      }
      else
      {
         wb_table9_130_1B2( false) ;
      }
      return  ;
   }

   public void wb_table9_130_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_24_1B2e( true) ;
      }
      else
      {
         wb_table5_24_1B2e( false) ;
      }
   }

   public void wb_table9_130_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 945, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableFormTM-1", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼管理情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, "作成日時", "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm31_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crt_datetime_Internalname, localUtil.format(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_crt_datetime_Jsonclick, 0, "ReadonlyAttributeImeOff", "", "", "", edtavCtltbm31_crt_datetime_Visible, edtavCtltbm31_crt_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP08_CRF_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm31_crt_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltbm31_crt_datetime_Visible==0)||(edtavCtltbm31_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, "更新日時", "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm31_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_upd_datetime_Internalname, localUtil.format(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_upd_datetime_Jsonclick, 0, "ReadonlyAttributeImeOff", "", "", "", edtavCtltbm31_upd_datetime_Visible, edtavCtltbm31_upd_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP08_CRF_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm31_upd_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltbm31_upd_datetime_Visible==0)||(edtavCtltbm31_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, "作成ユーザー名", "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV8D_CRT_USER_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(146);\"", (short)(1), 1, edtavD_crt_user_nm_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, "", "", (byte)(-1), true, "", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, "更新ユーザー名", "", "", lblTextblock73_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV9D_UPD_USER_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(150);\"", (short)(1), 1, edtavD_upd_user_nm_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, "", "", (byte)(-1), true, "", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, "作成プログラムID", "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_crt_prog_nm_Jsonclick, 0, "ReadonlyAttributeImeOff", "", "", "", 1, edtavCtltbm31_crt_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, "更新プログラムID", "", "", lblTextblock74_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_upd_prog_nm_Jsonclick, 0, "ReadonlyAttributeImeOff", "", "", "", 1, edtavCtltbm31_upd_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_130_1B2e( true) ;
      }
      else
      {
         wb_table9_130_1B2e( false) ;
      }
   }

   public void wb_table8_98_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "TableFormTM1Base", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" rowspan=\"4\"  style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock89_Internalname, "CRF入力枚数－<br>VISIT番号対応表", "", "", lblTextblock89_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(1), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"classref\" colspan=\"2\"  style=\"height:44px\">") ;
         wb_table10_103_1B2( true) ;
      }
      else
      {
         wb_table10_103_1B2( false) ;
      }
      return  ;
   }

   public void wb_table10_103_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:28px;width:105px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock86_Internalname, "CRF入力枚数", "", "", lblTextblock86_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"itemTable\" rowspan=\"3\" >") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection2_Internalname, 1, 724, "px", 0, "px", "SectionScroll_NoLineX", "");
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"115\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridLTM-1", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridLTM-1"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridLTM-1");
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
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm44_crf_eda_no_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
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
      if ( wbEnd == 115 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_115 = (short)(nGXsfl_115_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV53GXV12 = nGXsfl_115_idx ;
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
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:28px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock87_Internalname, "適用VIST番号", "", "", lblTextblock87_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:17px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_98_1B2e( true) ;
      }
      else
      {
         wb_table8_98_1B2e( false) ;
      }
   }

   public void wb_table10_103_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "(1) CRF入力枚数=1の適用VISIT番号はCRFデザイナーのデフォルトVISIT番号に設定されます", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "(2) CRFを繰り返し使用する場合、CRFデザイナーで定義したVISIT番号を以下のVISIT番号に置き換えてCSVに出力します。", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_103_1B2e( true) ;
      }
      else
      {
         wb_table10_103_1B2e( false) ;
      }
   }

   public void wb_table7_81_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 945, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableFormTM-1", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼繰返し使用") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock82_Internalname, "繰り返し使用", "", "", lblTextblock82_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm31_repeat_flg, radavCtltbm31_repeat_flg.getInternalname(), GXutil.str( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg(), 1, 0), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavCtltbm31_repeat_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(88);\"", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock83_Internalname, "最大繰り返し数", "", "", lblTextblock83_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_92_1B2( true) ;
      }
      else
      {
         wb_table11_92_1B2( false) ;
      }
      return  ;
   }

   public void wb_table11_92_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_81_1B2e( true) ;
      }
      else
      {
         wb_table7_81_1B2e( false) ;
      }
   }

   public void wb_table11_92_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:35px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_repeat_max_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_max(), (byte)(2), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_repeat_max()), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_repeat_max_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "※最大99迄", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_92_1B2e( true) ;
      }
      else
      {
         wb_table11_92_1B2e( false) ;
      }
   }

   public void wb_table6_30_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 945, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"7\" >") ;
         httpContext.writeText( "▼基本情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage6_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, "試験ID", "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 345, "px", 0, "px", "SectionWordBreak", "");
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id(), (byte)(10), (byte)(0), ".", "")), ((edtavCtltbm31_study_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_study_id()), "ZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_study_id_Jsonclick, 0, "ReadonlyAttributeImeOff", "", "", "", 1, edtavCtltbm31_study_id_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP08_CRF_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "&nbsp;", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(2), "HLP_B402_WP08_CRF_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage8_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, "CRFID", "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crf_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_id()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_crf_id_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavCtltbm31_crf_id_Backcolor)+";", "", "", 1, edtavCtltbm31_crf_id_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, "CRF名称", "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crf_nm_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_crf_nm_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltbm31_crf_nm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 40, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage9_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, "CRF略称", "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_crf_snm_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm()), GXutil.rtrim( localUtil.format( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_crf_snm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_crf_snm_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltbm31_crf_snm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, "表示順", "", "", lblTextblock79_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm31_order_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_order(), (byte)(5), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_order()), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm31_order_Jsonclick, 0, "AttributeNum", "background:"+WebUtils.getHTMLColor( edtavCtltbm31_order_Backcolor)+";", "", "", 1, 1, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock80_Internalname, "状態", "", "", lblTextblock80_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Radio button */
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm31_status, radavCtltbm31_status.getInternalname(), GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_status()), "", 1, radavCtltbm31_status.getEnabled(), 0, 0, StyleString, ClassString, "", 0, radavCtltbm31_status.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(66);\"", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock81_Internalname, "備考", "", "", lblTextblock81_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"4\" >") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm31_note_Backcolor) + ";" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm31_note_Backcolor) + ";" ;
         GxWebStd.gx_html_textarea( httpContext, edtavCtltbm31_note_Internalname, GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_note()), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(71);\"", (short)(0), 1, 1, 0, 80, "chr", 8, "row", StyleString, ClassString, "", "1000", 1, "", "", (byte)(-1), true, "", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock85_Internalname, "DM以外非表示", "", "", lblTextblock85_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavCtltbm31_dm_excp_no_disp_flg.getInternalname(), AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg(), "", 1, 1, "1", "DM以外非表示", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(76, this, '1', '0');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(76);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, "削除", "", "", lblTextblock84_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavCtltbm31_del_flg, radavCtltbm31_del_flg.getInternalname(), GXutil.rtrim( AV5BC_CRF.getgxTv_SdtTBM31_CRF_Tbm31_del_flg()), "", 1, radavCtltbm31_del_flg.getEnabled(), 0, 0, StyleString, ClassString, "", 0, radavCtltbm31_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(80);\"", "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_30_1B2e( true) ;
      }
      else
      {
         wb_table6_30_1B2e( false) ;
      }
   }

   public void wb_table4_12_1B2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "戻る（F11）", "", "", lblTxt_btn_can_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B402_WP08_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_1B2e( true) ;
      }
      else
      {
         wb_table4_12_1B2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV14P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
      AV13P_CRF_ID = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_CRF_ID", AV13P_CRF_ID);
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
      pa1B2( ) ;
      ws1B2( ) ;
      we1B2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513243836");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp08_crf_reg.js", "?202071513243836");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1152( )
   {
      edtavCtltbm44_crf_eda_no_Internalname = "CTLTBM44_CRF_EDA_NO_"+sGXsfl_115_idx ;
      edtavCtltbm44_visit_no_Internalname = "CTLTBM44_VISIT_NO_"+sGXsfl_115_idx ;
   }

   public void subsflControlProps_fel_1152( )
   {
      edtavCtltbm44_crf_eda_no_Internalname = "CTLTBM44_CRF_EDA_NO_"+sGXsfl_115_fel_idx ;
      edtavCtltbm44_visit_no_Internalname = "CTLTBM44_VISIT_NO_"+sGXsfl_115_fel_idx ;
   }

   public void sendrow_1152( )
   {
      subsflControlProps_1152( ) ;
      wb1B0( ) ;
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
         if ( ((int)(((nGXsfl_115_idx-1)/ (double) (0)) % (2))) == 0 )
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
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable9_Internalname+"_"+sGXsfl_115_idx,new Integer(1),"TableGridLM-1","","","","","","",new Integer(0),new Integer(1),"",new Integer(67),"","px","px"});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:28px\""});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm44_crf_eda_no_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)).getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no(), (byte)(2), (byte)(0), ".", "")),((edtavCtltbm44_crf_eda_no_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)).getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no()), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)).getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_crf_eda_no()), "Z9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm44_crf_eda_no_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm44_crf_eda_no_Enabled),new Integer(0),"text","",new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(115),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:28px\""});
      /* Single line edit */
      TempTags = " " + ((edtavCtltbm44_visit_no_Enabled!=0)&&(edtavCtltbm44_visit_no_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 124,'',false,'"+sGXsfl_115_idx+"',115)\"" : " ") ;
      ROClassString = "AttributeNum" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm44_visit_no_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)).getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no(), (byte)(6), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem)AV34SD_B402_SD07_CRF_VISIT_C.elementAt(-1+AV53GXV12)).getgxTv_SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem_Tbm44_visit_no()), "ZZZZZ9")),TempTags+((edtavCtltbm44_visit_no_Enabled!=0)&&(edtavCtltbm44_visit_no_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtltbm44_visit_no_Enabled!=0)&&(edtavCtltbm44_visit_no_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(124);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm44_visit_no_Jsonclick,new Integer(0),"AttributeNum","",ROClassString,"",new Integer(1),new Integer(1),new Integer(0),"text","",new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(115),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
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
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_115_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_115_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_115_idx+1)) ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_115_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1152( ) ;
      /* End function sendrow_1152 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_upd_Internalname = "TXT_BTN_UPD" ;
      lblTxt_btn_dlt_Internalname = "TXT_BTN_DLT" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      imgImage6_Internalname = "IMAGE6" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtavCtltbm31_study_id_Internalname = "CTLTBM31_STUDY_ID" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
      divSection1_Internalname = "SECTION1" ;
      imgImage8_Internalname = "IMAGE8" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID" ;
      imgImage7_Internalname = "IMAGE7" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM" ;
      imgImage9_Internalname = "IMAGE9" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtavCtltbm31_crf_snm_Internalname = "CTLTBM31_CRF_SNM" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtavCtltbm31_order_Internalname = "CTLTBM31_ORDER" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      radavCtltbm31_status.setInternalname( "CTLTBM31_STATUS" );
      lblTextblock81_Internalname = "TEXTBLOCK81" ;
      edtavCtltbm31_note_Internalname = "CTLTBM31_NOTE" ;
      lblTextblock85_Internalname = "TEXTBLOCK85" ;
      chkavCtltbm31_dm_excp_no_disp_flg.setInternalname( "CTLTBM31_DM_EXCP_NO_DISP_FLG" );
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      radavCtltbm31_del_flg.setInternalname( "CTLTBM31_DEL_FLG" );
      tblTable5_Internalname = "TABLE5" ;
      lblTextblock82_Internalname = "TEXTBLOCK82" ;
      radavCtltbm31_repeat_flg.setInternalname( "CTLTBM31_REPEAT_FLG" );
      lblTextblock83_Internalname = "TEXTBLOCK83" ;
      edtavCtltbm31_repeat_max_Internalname = "CTLTBM31_REPEAT_MAX" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      tblTable6_Internalname = "TABLE6" ;
      tblTable10_Internalname = "TABLE10" ;
      lblTextblock89_Internalname = "TEXTBLOCK89" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      tblTable8_Internalname = "TABLE8" ;
      lblTextblock86_Internalname = "TEXTBLOCK86" ;
      cellCell_eda_no_Internalname = "CELL_EDA_NO" ;
      cellCell_visit_Internalname = "CELL_VISIT" ;
      tblTable9_Internalname = "TABLE9" ;
      divSection2_Internalname = "SECTION2" ;
      lblTextblock87_Internalname = "TEXTBLOCK87" ;
      tblTable7_Internalname = "TABLE7" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtavCtltbm31_crt_datetime_Internalname = "CTLTBM31_CRT_DATETIME" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtavCtltbm31_upd_datetime_Internalname = "CTLTBM31_UPD_DATETIME" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtavD_crt_user_nm_Internalname = "vD_CRT_USER_NM" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtavD_upd_user_nm_Internalname = "vD_UPD_USER_NM" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtavCtltbm31_crt_prog_nm_Internalname = "CTLTBM31_CRT_PROG_NM" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtavCtltbm31_upd_prog_nm_Internalname = "CTLTBM31_UPD_PROG_NM" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblBtn_reg_exec_Internalname = "BTN_REG_EXEC" ;
      lblBtn_upd_exec_Internalname = "BTN_UPD_EXEC" ;
      lblBtn_dlt_exec_Internalname = "BTN_DLT_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_mode_Internalname = "vH_MODE" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavCtltbm44_visit_no_Jsonclick = "" ;
      edtavCtltbm44_visit_no_Visible = 1 ;
      edtavCtltbm44_visit_no_Enabled = 1 ;
      edtavCtltbm44_crf_eda_no_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridLTM-1" ;
      lblTxt_btn_dlt_Visible = 1 ;
      lblTxt_btn_upd_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      radavCtltbm31_del_flg.setJsonclick( "" );
      radavCtltbm31_del_flg.setEnabled( 1 );
      edtavCtltbm31_note_Backstyle = (byte)(-1) ;
      edtavCtltbm31_note_Backcolor = (int)(0xFFFFFF) ;
      radavCtltbm31_status.setJsonclick( "" );
      radavCtltbm31_status.setEnabled( 1 );
      edtavCtltbm31_order_Jsonclick = "" ;
      edtavCtltbm31_order_Backstyle = (byte)(-1) ;
      edtavCtltbm31_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_snm_Jsonclick = "" ;
      edtavCtltbm31_crf_snm_Backstyle = (byte)(-1) ;
      edtavCtltbm31_crf_snm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_nm_Jsonclick = "" ;
      edtavCtltbm31_crf_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm31_crf_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_id_Jsonclick = "" ;
      edtavCtltbm31_crf_id_Backstyle = (byte)(-1) ;
      edtavCtltbm31_crf_id_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_id_Enabled = 1 ;
      edtavCtltbm31_study_id_Jsonclick = "" ;
      edtavCtltbm31_study_id_Enabled = 0 ;
      edtavCtltbm31_repeat_max_Jsonclick = "" ;
      radavCtltbm31_repeat_flg.setJsonclick( "" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltbm44_crf_eda_no_Enabled = 0 ;
      edtavCtltbm31_upd_prog_nm_Jsonclick = "" ;
      edtavCtltbm31_upd_prog_nm_Enabled = 0 ;
      edtavCtltbm31_crt_prog_nm_Jsonclick = "" ;
      edtavCtltbm31_crt_prog_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 1 ;
      edtavD_crt_user_nm_Enabled = 1 ;
      edtavCtltbm31_upd_datetime_Jsonclick = "" ;
      edtavCtltbm31_upd_datetime_Enabled = 0 ;
      edtavCtltbm31_upd_datetime_Visible = 1 ;
      edtavCtltbm31_crt_datetime_Jsonclick = "" ;
      edtavCtltbm31_crt_datetime_Enabled = 0 ;
      edtavCtltbm31_crt_datetime_Visible = 1 ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_study_Caption = "試験名" ;
      edtavCtltbm31_crf_id_Enabled = 1 ;
      edtavCtltbm31_note_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_order_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_snm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm31_crf_id_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltbm31_upd_prog_nm_Enabled = -1 ;
      edtavCtltbm31_crt_prog_nm_Enabled = -1 ;
      edtavCtltbm31_upd_datetime_Enabled = -1 ;
      edtavCtltbm31_crt_datetime_Enabled = -1 ;
      edtavCtltbm31_study_id_Enabled = -1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      chkavCtltbm31_dm_excp_no_disp_flg.setCaption( "" );
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
      AV5BC_CRF = new SdtTBM31_CRF(remoteHandle);
      wcpOAV13P_CRF_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV13P_CRF_ID = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV34SD_B402_SD07_CRF_VISIT_C = new GxObjectCollection(SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem.class, "B402_SD07_CRF_VISIT.B402_SD07_CRF_VISITItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV61Pgmname = "" ;
      AV6C_APP_ID = "" ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      A367TBM21_STUDY_NM = "" ;
      AV21W_A821_JS = "" ;
      AV20W_A819_JS = "" ;
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
      edtavCtltbm44_crf_eda_no_Internalname = "" ;
      edtavCtltbm44_visit_no_Internalname = "" ;
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV60Pgmdesc = "" ;
      AV8D_CRT_USER_NM = "" ;
      AV9D_UPD_USER_NM = "" ;
      AV10H_INIT_FLG = "" ;
      AV12H_MODE = "" ;
      AV11H_KNGN_FLG = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV28W_MSG = "" ;
      AV35SD_B402_SD07_CRF_VISIT_I = new SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem(remoteHandle, context);
      AV33BC_TBM44 = new SdtTBM44_CRF_VISIT(remoteHandle);
      scmdbuf = "" ;
      H001B2_A946TBM44_CRF_ID = new short[1] ;
      H001B2_A945TBM44_STUDY_ID = new long[1] ;
      H001B2_A947TBM44_CRF_EDA_NO = new byte[1] ;
      GXv_int3 = new short [1] ;
      AV15W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4 = new GxObjectCollection [1] ;
      AV18W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5 = new GxObjectCollection [1] ;
      AV19W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV16W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      H001B3_A55TAM07_USER_ID = new String[] {""} ;
      H001B3_A205TAM07_USER_NM = new String[] {""} ;
      H001B3_n205TAM07_USER_NM = new boolean[] {false} ;
      H001B4_A55TAM07_USER_ID = new String[] {""} ;
      H001B4_A205TAM07_USER_NM = new String[] {""} ;
      H001B4_n205TAM07_USER_NM = new boolean[] {false} ;
      GXt_char1 = "" ;
      H001B5_A946TBM44_CRF_ID = new short[1] ;
      H001B5_A945TBM44_STUDY_ID = new long[1] ;
      H001B5_A947TBM44_CRF_EDA_NO = new byte[1] ;
      H001B5_A948TBM44_VISIT_NO = new int[1] ;
      H001B5_n948TBM44_VISIT_NO = new boolean[] {false} ;
      H001B6_A63TBM21_STUDY_ID = new long[1] ;
      H001B6_A367TBM21_STUDY_NM = new String[] {""} ;
      H001B6_n367TBM21_STUDY_NM = new boolean[] {false} ;
      GXv_boolean7 = new boolean [1] ;
      GXv_boolean9 = new boolean [1] ;
      GXv_SdtA_LOGIN_SDT10 = new SdtA_LOGIN_SDT [1] ;
      AV26W_ERRCD = "" ;
      GXt_dtime11 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char2 = new String [1] ;
      GXv_char12 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblBtn_reg_exec_Jsonclick = "" ;
      lblBtn_upd_exec_Jsonclick = "" ;
      lblBtn_dlt_exec_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock72_Jsonclick = "" ;
      lblTextblock70_Jsonclick = "" ;
      lblTextblock73_Jsonclick = "" ;
      lblTextblock71_Jsonclick = "" ;
      lblTextblock74_Jsonclick = "" ;
      lblTextblock89_Jsonclick = "" ;
      lblTextblock86_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock87_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock82_Jsonclick = "" ;
      lblTextblock83_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTxt_study_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock69_Jsonclick = "" ;
      lblTextblock79_Jsonclick = "" ;
      lblTextblock80_Jsonclick = "" ;
      lblTextblock81_Jsonclick = "" ;
      lblTextblock85_Jsonclick = "" ;
      lblTextblock84_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_upd_Jsonclick = "" ;
      lblTxt_btn_dlt_Jsonclick = "" ;
      lblTxt_btn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp08_crf_reg__default(),
         new Object[] {
             new Object[] {
            H001B2_A946TBM44_CRF_ID, H001B2_A945TBM44_STUDY_ID, H001B2_A947TBM44_CRF_EDA_NO
            }
            , new Object[] {
            H001B3_A55TAM07_USER_ID, H001B3_A205TAM07_USER_NM, H001B3_n205TAM07_USER_NM
            }
            , new Object[] {
            H001B4_A55TAM07_USER_ID, H001B4_A205TAM07_USER_NM, H001B4_n205TAM07_USER_NM
            }
            , new Object[] {
            H001B5_A946TBM44_CRF_ID, H001B5_A945TBM44_STUDY_ID, H001B5_A947TBM44_CRF_EDA_NO, H001B5_A948TBM44_VISIT_NO, H001B5_n948TBM44_VISIT_NO
            }
            , new Object[] {
            H001B6_A63TBM21_STUDY_ID, H001B6_A367TBM21_STUDY_NM, H001B6_n367TBM21_STUDY_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV61Pgmname = "B402_WP08_CRF_REG" ;
      AV60Pgmdesc = "試験登録（CRF登録）" ;
      /* GeneXus formulas. */
      AV61Pgmname = "B402_WP08_CRF_REG" ;
      AV60Pgmdesc = "試験登録（CRF登録）" ;
      Gx_err = (short)(0) ;
      edtavCtltbm31_study_id_Enabled = 0 ;
      edtavCtltbm44_crf_eda_no_Enabled = 0 ;
      edtavCtltbm31_crt_datetime_Enabled = 0 ;
      edtavCtltbm31_upd_datetime_Enabled = 0 ;
      edtavD_crt_user_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 0 ;
      edtavCtltbm31_crt_prog_nm_Enabled = 0 ;
      edtavCtltbm31_upd_prog_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte A947TBM44_CRF_EDA_NO ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV25W_ERR_CD ;
   private byte AV67GXLvl483 ;
   private byte AV68GXLvl498 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavCtltbm31_note_Backstyle ;
   private byte edtavCtltbm31_order_Backstyle ;
   private byte edtavCtltbm31_crf_snm_Backstyle ;
   private byte edtavCtltbm31_crf_nm_Backstyle ;
   private byte edtavCtltbm31_crf_id_Backstyle ;
   private byte GRID1_nEOF ;
   private short nRC_GXsfl_115 ;
   private short nGXsfl_115_idx=1 ;
   private short A946TBM44_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV53GXV12 ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_115_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_115_fel_idx=1 ;
   private short GXv_int3[] ;
   private short AV22W_CRF_ID ;
   private short AV38W_CNT_ST ;
   private short AV37W_CNT_MAX ;
   private short AV36W_CNT ;
   private int A948TBM44_VISIT_NO ;
   private int subGrid1_Islastpage ;
   private int edtavCtltbm31_study_id_Enabled ;
   private int edtavCtltbm44_crf_eda_no_Enabled ;
   private int edtavCtltbm31_crt_datetime_Enabled ;
   private int edtavCtltbm31_upd_datetime_Enabled ;
   private int edtavD_crt_user_nm_Enabled ;
   private int edtavD_upd_user_nm_Enabled ;
   private int edtavCtltbm31_crt_prog_nm_Enabled ;
   private int edtavCtltbm31_upd_prog_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV62GXV19 ;
   private int AV64GXV20 ;
   private int AV65GXV21 ;
   private int edtavCtltbm31_crf_id_Backcolor ;
   private int edtavCtltbm31_crf_nm_Backcolor ;
   private int edtavCtltbm31_crf_snm_Backcolor ;
   private int edtavCtltbm31_order_Backcolor ;
   private int edtavCtltbm31_note_Backcolor ;
   private int AV66GXV22 ;
   private int edtavCtltbm31_crf_id_Enabled ;
   private int edtavCtltbm31_crt_datetime_Visible ;
   private int edtavCtltbm31_upd_datetime_Visible ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_upd_Visible ;
   private int lblTxt_btn_dlt_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtltbm44_visit_no_Enabled ;
   private int edtavCtltbm44_visit_no_Visible ;
   private long wcpOAV14P_STUDY_ID ;
   private long AV14P_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_115_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV61Pgmname ;
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
   private String edtavCtltbm44_crf_eda_no_Internalname ;
   private String edtavCtltbm44_visit_no_Internalname ;
   private String GXDecQS ;
   private String AV60Pgmdesc ;
   private String edtavCtltbm31_study_id_Internalname ;
   private String edtavCtltbm31_crt_datetime_Internalname ;
   private String edtavCtltbm31_upd_datetime_Internalname ;
   private String edtavD_crt_user_nm_Internalname ;
   private String edtavD_upd_user_nm_Internalname ;
   private String edtavCtltbm31_crt_prog_nm_Internalname ;
   private String edtavCtltbm31_upd_prog_nm_Internalname ;
   private String edtavCtltbm31_crf_id_Internalname ;
   private String edtavCtltbm31_crf_nm_Internalname ;
   private String edtavCtltbm31_crf_snm_Internalname ;
   private String edtavCtltbm31_order_Internalname ;
   private String edtavCtltbm31_note_Internalname ;
   private String edtavCtltbm31_repeat_max_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String sGXsfl_115_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String lblTxt_study_Caption ;
   private String lblTxt_study_Internalname ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_dlt_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblBtn_reg_exec_Internalname ;
   private String lblBtn_reg_exec_Jsonclick ;
   private String lblBtn_upd_exec_Internalname ;
   private String lblBtn_upd_exec_Jsonclick ;
   private String lblBtn_dlt_exec_Internalname ;
   private String lblBtn_dlt_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable3_Internalname ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtavCtltbm31_crt_datetime_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtavCtltbm31_upd_datetime_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtavCtltbm31_crt_prog_nm_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtavCtltbm31_upd_prog_nm_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock89_Internalname ;
   private String lblTextblock89_Jsonclick ;
   private String lblTextblock86_Internalname ;
   private String lblTextblock86_Jsonclick ;
   private String divSection2_Internalname ;
   private String subGrid1_Internalname ;
   private String lblTextblock87_Internalname ;
   private String lblTextblock87_Jsonclick ;
   private String tblTable8_Internalname ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTextblock82_Internalname ;
   private String lblTextblock82_Jsonclick ;
   private String lblTextblock83_Internalname ;
   private String lblTextblock83_Jsonclick ;
   private String tblTable6_Internalname ;
   private String edtavCtltbm31_repeat_max_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String tblTable5_Internalname ;
   private String imgImage6_Internalname ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String divSection1_Internalname ;
   private String edtavCtltbm31_study_id_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String lblTxt_study_Jsonclick ;
   private String imgImage8_Internalname ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtavCtltbm31_crf_id_Jsonclick ;
   private String imgImage7_Internalname ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtavCtltbm31_crf_nm_Jsonclick ;
   private String imgImage9_Internalname ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtavCtltbm31_crf_snm_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String edtavCtltbm31_order_Jsonclick ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock80_Jsonclick ;
   private String lblTextblock81_Internalname ;
   private String lblTextblock81_Jsonclick ;
   private String lblTextblock85_Internalname ;
   private String lblTextblock85_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_upd_Jsonclick ;
   private String lblTxt_btn_dlt_Jsonclick ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable9_Internalname ;
   private String ROClassString ;
   private String edtavCtltbm44_crf_eda_no_Jsonclick ;
   private String edtavCtltbm44_visit_no_Jsonclick ;
   private String cellCell_eda_no_Internalname ;
   private String cellCell_visit_Internalname ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime11 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV29W_REG_ENABEL ;
   private boolean AV30W_UPD_ENABEL ;
   private boolean AV24W_DLT_ENABEL ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV27W_ERRFLG ;
   private boolean AV23W_DEL_FLG ;
   private boolean n205TAM07_USER_NM ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean gx_BV115 ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean GXt_boolean6 ;
   private boolean GXv_boolean7[] ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean9[] ;
   private String wcpOAV13P_CRF_ID ;
   private String AV13P_CRF_ID ;
   private String AV6C_APP_ID ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String A367TBM21_STUDY_NM ;
   private String AV21W_A821_JS ;
   private String AV20W_A819_JS ;
   private String AV8D_CRT_USER_NM ;
   private String AV9D_UPD_USER_NM ;
   private String AV10H_INIT_FLG ;
   private String AV12H_MODE ;
   private String AV11H_KNGN_FLG ;
   private String AV7C_GAMEN_TITLE ;
   private String AV28W_MSG ;
   private String AV26W_ERRCD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTBM31_CRF AV5BC_CRF ;
   private HTMLChoice radavCtltbm31_status ;
   private ICheckbox chkavCtltbm31_dm_excp_no_disp_flg ;
   private HTMLChoice radavCtltbm31_del_flg ;
   private HTMLChoice radavCtltbm31_repeat_flg ;
   private IDataStoreProvider pr_default ;
   private short[] H001B2_A946TBM44_CRF_ID ;
   private long[] H001B2_A945TBM44_STUDY_ID ;
   private byte[] H001B2_A947TBM44_CRF_EDA_NO ;
   private String[] H001B3_A55TAM07_USER_ID ;
   private String[] H001B3_A205TAM07_USER_NM ;
   private boolean[] H001B3_n205TAM07_USER_NM ;
   private String[] H001B4_A55TAM07_USER_ID ;
   private String[] H001B4_A205TAM07_USER_NM ;
   private boolean[] H001B4_n205TAM07_USER_NM ;
   private short[] H001B5_A946TBM44_CRF_ID ;
   private long[] H001B5_A945TBM44_STUDY_ID ;
   private byte[] H001B5_A947TBM44_CRF_EDA_NO ;
   private int[] H001B5_A948TBM44_VISIT_NO ;
   private boolean[] H001B5_n948TBM44_VISIT_NO ;
   private long[] H001B6_A63TBM21_STUDY_ID ;
   private String[] H001B6_A367TBM21_STUDY_NM ;
   private boolean[] H001B6_n367TBM21_STUDY_NM ;
   private GxObjectCollection AV34SD_B402_SD07_CRF_VISIT_C ;
   private GxObjectCollection AV15W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[] ;
   private GxObjectCollection AV18W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[] ;
   private SdtTBM44_CRF_VISIT AV33BC_TBM44 ;
   private SdtB402_SD07_CRF_VISIT_B402_SD07_CRF_VISITItem AV35SD_B402_SD07_CRF_VISIT_I ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV16W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT10[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV19W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_wp08_crf_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001B2", "SELECT `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_CRF_EDA_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001B3", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001B4", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001B5", "SELECT `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_CRF_EDA_NO`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001B6", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
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
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

