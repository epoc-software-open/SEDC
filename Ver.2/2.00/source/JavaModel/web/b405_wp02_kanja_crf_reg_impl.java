/*
               File: b405_wp02_kanja_crf_reg_impl
        Description: ä≥é“ï égópCRFìoò^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:18:2.83
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b405_wp02_kanja_crf_reg_impl extends GXWebPanel
{
   public b405_wp02_kanja_crf_reg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b405_wp02_kanja_crf_reg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b405_wp02_kanja_crf_reg_impl.class ));
   }

   public b405_wp02_kanja_crf_reg_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavD_grd2_crf_status = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_46 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_46_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_46_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrd_title_newrow( nRC_GXsfl_46, nGXsfl_46_idx, sGXsfl_46_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_66 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_66_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_66_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_GXsfl_66, nGXsfl_66_idx, sGXsfl_66_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_55 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_55_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_55_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_55, nGXsfl_55_idx, sGXsfl_55_idx) ;
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
            AV17P_COL_COUNT = (short)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_COL_COUNT", GXutil.ltrim( GXutil.str( AV17P_COL_COUNT, 4, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV20P_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20P_SESSION_ID", AV20P_SESSION_ID);
               AV16P_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16P_APP_ID", AV16P_APP_ID);
               AV18P_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18P_DISP_DATETIME", AV18P_DISP_DATETIME);
               AV19P_SEL_LINE_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19P_SEL_LINE_NO", GXutil.ltrim( GXutil.str( AV19P_SEL_LINE_NO, 4, 0)));
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
         pa1E2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1E2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1E2( ) ;
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
      httpContext.writeValue( "ä≥é“ï égópCRFìoò^") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?2017731718294");
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
      GXEncryptionTmp = "b405_wp02_kanja_crf_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_COL_COUNT,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV20P_SESSION_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16P_APP_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_DISP_DATETIME)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19P_SEL_LINE_NO,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b405_wp02_kanja_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1E2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_46, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_55, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_TAM02_APP_ID", GXutil.rtrim( AV8C_TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_TAM02_APP_ID", GetHash( "", String.valueOf(AV8C_TAM02_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STATUS", GXutil.rtrim( A643TBM31_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DEL_FLG", GXutil.rtrim( A397TBM31_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV23W_A821_JS));
      GxWebStd.gx_hidden_field( httpContext, "vW_A819_JS", GXutil.rtrim( AV22W_A819_JS));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B405_WP01_SD01", AV24W_B405_WP01_SD01);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B405_WP01_SD01", AV24W_B405_WP01_SD01);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_SNM", GXutil.rtrim( A642TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "vP_SESSION_ID", GXutil.rtrim( AV20P_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "vP_APP_ID", GXutil.rtrim( AV16P_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "vP_DISP_DATETIME", GXutil.rtrim( AV18P_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "vP_SEL_LINE_NO", GXutil.ltrim( localUtil.ntoc( AV19P_SEL_LINE_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TXT_BTN_REG_Visible", GXutil.ltrim( localUtil.ntoc( lblTxt_btn_reg_Visible, (byte)(5), (byte)(0), ".", "")));
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
      return "B405_WP02_KANJA_CRF_REG" ;
   }

   public String getPgmdesc( )
   {
      return "ä≥é“ï égópCRFìoò^" ;
   }

   public void wb1E0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1E2( true) ;
      }
      else
      {
         wb_table1_2_1E2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_78_1E2( true) ;
      }
      else
      {
         wb_table2_78_1E2( false) ;
      }
      return  ;
   }

   public void wb_table2_78_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1E2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "ä≥é“ï égópCRFìoò^", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0076") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0076", "");
         }
      }
      wbErr = false ;
      strup1E0( ) ;
   }

   public void ws1E2( )
   {
      start1E2( ) ;
      evt1E2( ) ;
   }

   public void evt1E2( )
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
                        /* Execute user event: e111E2 */
                        e111E2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121E2 */
                        e121E2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131E2 */
                        e131E2 ();
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
                        dynload_actions( ) ;
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "GRD_TITLE.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_46_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_462( ) ;
                        AV9D_CRFSNM = httpContext.cgiGet( edtavD_crfsnm_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0076") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0076", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0076") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0076", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e141E2 */
                              e141E2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e151E2 */
                              e151E2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRD_TITLE.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e161E2 */
                              e161E2 ();
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
                     else if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) )
                     {
                        nGXsfl_55_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_554( ) ;
                        AV11D_GRD1_HIKENSHA = httpContext.cgiGet( edtavD_grd1_hikensha_Internalname) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e171E4 */
                              e171E4 ();
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
                              nGXsfl_66_idx = (short)(GXutil.lval( sEvtType)) ;
                              sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") + sGXsfl_55_idx ;
                              subsflControlProps_665( ) ;
                              AV12D_GRD2_CRF_STATUS = GXutil.strtobool( httpContext.cgiGet( chkavD_grd2_crf_status.getInternalname())) ;
                              if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd1_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd1_crf_id_Internalname), ".", ",") > 9999 ) ) )
                              {
                                 httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD1_CRF_ID");
                                 GX_FocusControl = edtavD_grd1_crf_id_Internalname ;
                                 httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                 wbErr = true ;
                                 AV10D_GRD1_CRF_ID = (short)(0) ;
                              }
                              else
                              {
                                 AV10D_GRD1_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd1_crf_id_Internalname), ".", ",")) ;
                              }
                              sEvtType = GXutil.right( sEvt, 1) ;
                              if ( GXutil.strcmp(sEvtType, ".") == 0 )
                              {
                                 sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                                 if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    dynload_actions( ) ;
                                    /* Execute user event: e181E5 */
                                    e181E5 ();
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
                  else if ( nCmpId == 76 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0076") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0076", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1E2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1E2( ) ;
         }
      }
   }

   public void pa1E2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b405_wp02_kanja_crf_reg")), "b405_wp02_kanja_crf_reg") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b405_wp02_kanja_crf_reg"))) ;
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
                  AV17P_COL_COUNT = (short)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17P_COL_COUNT", GXutil.ltrim( GXutil.str( AV17P_COL_COUNT, 4, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV20P_SESSION_ID = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV20P_SESSION_ID", AV20P_SESSION_ID);
                     AV16P_APP_ID = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16P_APP_ID", AV16P_APP_ID);
                     AV18P_DISP_DATETIME = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18P_DISP_DATETIME", AV18P_DISP_DATETIME);
                     AV19P_SEL_LINE_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV19P_SEL_LINE_NO", GXutil.ltrim( GXutil.str( AV19P_SEL_LINE_NO, 4, 0)));
                  }
               }
            }
         }
         GXCCtl = "vD_GRD2_CRF_STATUS_" + sGXsfl_66_idx ;
         chkavD_grd2_crf_status.setName( GXCCtl );
         chkavD_grd2_crf_status.setWebtags( "" );
         chkavD_grd2_crf_status.setCaption( "" );
         chkavD_grd2_crf_status.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrd_title_newrow( short nRC_GXsfl_46 ,
                                     short nGXsfl_46_idx ,
                                     String sGXsfl_46_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_462( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         sendrow_462( ) ;
         nGXsfl_46_idx = (short)(((subGrd_title_Islastpage==1)&&(nGXsfl_46_idx+1>subgrd_title_recordsperpage( )) ? 1 : nGXsfl_46_idx+1)) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      httpContext.GX_webresponse.addString(Grd_titleContainer.ToJavascriptSource());
      /* End function gxnrGrd_title_newrow */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_55 ,
                                 short nGXsfl_55_idx ,
                                 String sGXsfl_55_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_554( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         sendrow_554( ) ;
         nGXsfl_55_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_55_idx+1)) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_554( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( short nRC_GXsfl_66 ,
                                 short nGXsfl_66_idx ,
                                 String sGXsfl_66_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_665( ) ;
      while ( nGXsfl_66_idx <= nRC_GXsfl_66 )
      {
         sendrow_665( ) ;
         nGXsfl_66_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_66_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_66_idx+1)) ;
         sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") + sGXsfl_55_idx ;
         subsflControlProps_665( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void refresh( )
   {
      rf1E2( ) ;
      rf1E4( ) ;
      /* End function Refresh */
   }

   public void rf1E2( )
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
      wbStart = (short)(46) ;
      nGXsfl_46_idx = (short)(1) ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_462( ) ;
      nGXsfl_46_Refreshing = (short)(1) ;
      /* Execute user event: e151E2 */
      e151E2 ();
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
         subsflControlProps_462( ) ;
         /* Execute user event: e161E2 */
         e161E2 ();
         wbEnd = (short)(46) ;
         wb1E0( ) ;
      }
      nGXsfl_46_Refreshing = (short)(0) ;
   }

   public void rf1E4( )
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
      wbStart = (short)(55) ;
      nGXsfl_55_idx = (short)(1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_554( ) ;
      nGXsfl_55_Refreshing = (short)(1) ;
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_554( ) ;
         /* Execute user event: e171E4 */
         e171E4 ();
         wbEnd = (short)(55) ;
         wb1E0( ) ;
      }
      nGXsfl_55_Refreshing = (short)(0) ;
   }

   public void rf1E5( )
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
      wbStart = (short)(66) ;
      nGXsfl_66_idx = (short)(1) ;
      sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") + sGXsfl_55_idx ;
      subsflControlProps_665( ) ;
      nGXsfl_66_Refreshing = (short)(1) ;
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_665( ) ;
         /* Execute user event: e181E5 */
         e181E5 ();
         wbEnd = (short)(66) ;
         wb1E0( ) ;
      }
      nGXsfl_66_Refreshing = (short)(0) ;
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
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 2*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      GRID1_IsPaging = 1 ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
         GRID1_IsPaging = 1 ;
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
      subGrid1_Islastpage = 1 ;
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

   public void strup1E0( )
   {
      /* Before Start, stand alone formulas. */
      AV33Pgmname = "B405_WP02_KANJA_CRF_REG" ;
      Gx_err = (short)(0) ;
      edtavD_study_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_study_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_study_nm_Enabled, 5, 0)));
      edtavD_grd1_hikensha_Enabled = 0 ;
      chkavD_grd2_crf_status.setEnabled( 0 );
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e141E2 */
      e141E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV13D_STUDY_NM = httpContext.cgiGet( edtavD_study_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13D_STUDY_NM", AV13D_STUDY_NM);
         AV14H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         AV15H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
         AV29W_TBW01_FREE_SAVE_1 = httpContext.cgiGet( edtavW_tbw01_free_save_1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_TBW01_FREE_SAVE_1", AV29W_TBW01_FREE_SAVE_1);
         AV30W_TBW01_FREE_SAVE_1_BAK = httpContext.cgiGet( edtavW_tbw01_free_save_1_bak_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30W_TBW01_FREE_SAVE_1_BAK", AV30W_TBW01_FREE_SAVE_1_BAK);
         /* Read saved values. */
         nRC_GXsfl_46 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), ".", ",")) ;
         nRC_GXsfl_55 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), ".", ",")) ;
         AV20P_SESSION_ID = httpContext.cgiGet( "vP_SESSION_ID") ;
         AV16P_APP_ID = httpContext.cgiGet( "vP_APP_ID") ;
         AV18P_DISP_DATETIME = httpContext.cgiGet( "vP_DISP_DATETIME") ;
         AV19P_SEL_LINE_NO = (short)(localUtil.ctol( httpContext.cgiGet( "vP_SEL_LINE_NO"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0076") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0076", "");
         }
         lblTxt_btn_reg_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "TXT_BTN_REG_Visible"), ".", ",")) ;
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
      /* Execute user event: e141E2 */
      e141E2 ();
      if (returnInSub) return;
   }

   public void e141E2( )
   {
      /* Start Routine */
      AV8C_TAM02_APP_ID = "B405" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
      AV7C_GAMEN_TITLE = "ä≥é“ï égópCRFìoò^" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_GAMEN_TITLE", AV7C_GAMEN_TITLE);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV21W_A_LOGIN_SDT,AV8C_TAM02_APP_ID,AV7C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0076",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      tblTbl_list_Width = (int)(100+150*AV17P_COL_COUNT) ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Width", GXutil.ltrim( GXutil.str( tblTbl_list_Width, 9, 0)));
   }

   public void e151E2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV14H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV33Pgmname, "INFO", "âÊñ ãNìÆ") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV14H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   private void e161E2( )
   {
      /* Grd_title_Load Routine */
      AV34GXV1 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrim( GXutil.str( AV34GXV1, 8, 0)));
      while ( AV34GXV1 <= AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
      {
         AV25W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV34GXV1));
         /* Using cursor H001E2 */
         pr_default.execute(0, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id()), new Short(AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id())});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A397TBM31_DEL_FLG = H001E2_A397TBM31_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
            n397TBM31_DEL_FLG = H001E2_n397TBM31_DEL_FLG[0] ;
            A643TBM31_STATUS = H001E2_A643TBM31_STATUS[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
            n643TBM31_STATUS = H001E2_n643TBM31_STATUS[0] ;
            A69TBM31_CRF_ID = H001E2_A69TBM31_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
            A68TBM31_STUDY_ID = H001E2_A68TBM31_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
            A642TBM31_CRF_SNM = H001E2_A642TBM31_CRF_SNM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
            n642TBM31_CRF_SNM = H001E2_n642TBM31_CRF_SNM[0] ;
            AV9D_CRFSNM = A642TBM31_CRF_SNM ;
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(46) ;
            }
            sendrow_462( ) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV34GXV1 = (int)(AV34GXV1+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrim( GXutil.str( AV34GXV1, 8, 0)));
      }
   }

   public void e111E2( )
   {
      /* 'BTN_REG' Routine */
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      if ( ( lblTxt_btn_reg_Visible == ( 1 )) )
      {
         if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV15H_KNGN_FLG, "") )
         {
            /* Execute user subroutine: S162 */
            S162 ();
            if (returnInSub) return;
            AV30W_TBW01_FREE_SAVE_1_BAK = AV29W_TBW01_FREE_SAVE_1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30W_TBW01_FREE_SAVE_1_BAK", AV30W_TBW01_FREE_SAVE_1_BAK);
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
            b405_wp02_kanja_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            GXt_char1 = AV23W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
            b405_wp02_kanja_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            AV23W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23W_A821_JS", AV23W_A821_JS);
         }
      }
   }

   public void e131E2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      AV24W_B405_WP01_SD01.fromxml(AV29W_TBW01_FREE_SAVE_1, "");
      AV37GXV3 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37GXV3", GXutil.ltrim( GXutil.str( AV37GXV3, 8, 0)));
      while ( AV37GXV3 <= AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
      {
         AV25W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV37GXV3));
         if ( AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Status_n() == 0 )
         {
            /* Using cursor H001E3 */
            pr_default.execute(1, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id()), new Integer(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id()), new Short(AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id())});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A91TBT02_CRF_ID = H001E3_A91TBT02_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
               A90TBT02_SUBJECT_ID = H001E3_A90TBT02_SUBJECT_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
               A89TBT02_STUDY_ID = H001E3_A89TBT02_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
               A935TBT02_CRF_EDA_NO = H001E3_A935TBT02_CRF_EDA_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
               AV6BC_TBT02_CRF.Load(A89TBT02_STUDY_ID, A90TBT02_SUBJECT_ID, A91TBT02_CRF_ID, A935TBT02_CRF_EDA_NO);
               AV6BC_TBT02_CRF.Delete();
               if ( AV6BC_TBT02_CRF.Success() )
               {
               }
               else
               {
                  GXt_char1 = AV27W_ERRMSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char2) ;
                  b405_wp02_kanja_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV27W_ERRMSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRMSG", AV27W_ERRMSG);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         else if ( AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Status_n() == 1 )
         {
            AV39GXLvl218 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39GXLvl218", GXutil.str( AV39GXLvl218, 1, 0));
            /* Using cursor H001E4 */
            pr_default.execute(2, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id()), new Integer(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id()), new Short(AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id())});
            if ( Gx_err != 0 )
            {
               AV39GXLvl218 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39GXLvl218", GXutil.str( AV39GXLvl218, 1, 0));
            }
            while ( (pr_default.getStatus(2) != 101) )
            {
               A935TBT02_CRF_EDA_NO = H001E4_A935TBT02_CRF_EDA_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
               A91TBT02_CRF_ID = H001E4_A91TBT02_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
               A90TBT02_SUBJECT_ID = H001E4_A90TBT02_SUBJECT_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
               A89TBT02_STUDY_ID = H001E4_A89TBT02_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
               AV39GXLvl218 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39GXLvl218", GXutil.str( AV39GXLvl218, 1, 0));
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            if ( AV39GXLvl218 == 0 )
            {
               AV6BC_TBT02_CRF = (SdtTBT02_CRF)new SdtTBT02_CRF( remoteHandle, context);
               AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( AV33Pgmname );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
               AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_study_id( AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
               AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
               AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id() );
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
                  GXt_char1 = AV27W_ERRMSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char2) ;
                  b405_wp02_kanja_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV27W_ERRMSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRMSG", AV27W_ERRMSG);
               }
            }
         }
         if ( GXutil.strcmp(AV27W_ERRMSG, "") != 0 )
         {
            if (true) break;
         }
         AV37GXV3 = (int)(AV37GXV3+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37GXV3", GXutil.ltrim( GXutil.str( AV37GXV3, 8, 0)));
      }
      if ( GXutil.strcmp(AV27W_ERRMSG, "") == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b405_wp02_kanja_crf_reg");
         new b805_pc01_work_del(remoteHandle, context).execute( AV16P_APP_ID, AV18P_DISP_DATETIME) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16P_APP_ID", AV16P_APP_ID);
         httpContext.ajax_rsp_assign_attri("", false, "AV18P_DISP_DATETIME", AV18P_DISP_DATETIME);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b405_wp01_kanja_crf_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_COL_COUNT,4,0))) ;
         httpContext.wjLoc = formatLink("b405_wp01_kanja_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp02_kanja_crf_reg");
         httpContext.GX_msglist.addItem(AV27W_ERRMSG);
      }
   }

   public void e121E2( )
   {
      /* 'BTN_CAN' Routine */
      new b805_pc01_work_del(remoteHandle, context).execute( AV16P_APP_ID, AV18P_DISP_DATETIME) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_APP_ID", AV16P_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_DISP_DATETIME", AV18P_DISP_DATETIME);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b405_wp01_kanja_crf_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_COL_COUNT,4,0))) ;
      httpContext.wjLoc = formatLink("b405_wp01_kanja_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S162( )
   {
      /* 'SUB_GRD_TO_SDT' Routine */
      AV24W_B405_WP01_SD01.fromxml(AV29W_TBW01_FREE_SAVE_1, "");
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_55 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), ".", ",")) ;
      nGXsfl_55_fel_idx = (short)(0) ;
      while ( nGXsfl_55_fel_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_55_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_55_fel_idx+1)) ;
         sGXsfl_55_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_554( ) ;
         AV11D_GRD1_HIKENSHA = httpContext.cgiGet( edtavD_grd1_hikensha_Internalname) ;
         /* Start For Each Line in Grid2 */
         GXCCtl = "nRC_GXsfl_66_" + sGXsfl_55_fel_idx ;
         nRC_GXsfl_66 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",")) ;
         nGXsfl_66_fel_idx = (short)(0) ;
         while ( nGXsfl_66_fel_idx < nRC_GXsfl_66 )
         {
            nGXsfl_66_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_66_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_66_fel_idx+1)) ;
            sGXsfl_66_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_fel_idx, 4, 0)), (short)(4), "0") + sGXsfl_55_fel_idx ;
            subsflControlProps_fel_665( ) ;
            AV12D_GRD2_CRF_STATUS = GXutil.strtobool( httpContext.cgiGet( chkavD_grd2_crf_status.getInternalname())) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd1_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd1_crf_id_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD1_CRF_ID");
               GX_FocusControl = edtavD_grd1_crf_id_Internalname ;
               wbErr = true ;
               AV10D_GRD1_CRF_ID = (short)(0) ;
            }
            else
            {
               AV10D_GRD1_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd1_crf_id_Internalname), ".", ",")) ;
            }
            AV42GXV4 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42GXV4", GXutil.ltrim( GXutil.str( AV42GXV4, 8, 0)));
            while ( AV42GXV4 <= AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
            {
               AV25W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV42GXV4));
               if ( AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id() == AV10D_GRD1_CRF_ID )
               {
                  if ( AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Status_n() == 2 )
                  {
                  }
                  else
                  {
                     if ( ! AV12D_GRD2_CRF_STATUS )
                     {
                        AV25W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status_n( (byte)(0) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_B405_WP01_SD01_CRF_ITEM", AV25W_B405_WP01_SD01_CRF_ITEM);
                     }
                     else
                     {
                        AV25W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status_n( (byte)(1) );
                        httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_B405_WP01_SD01_CRF_ITEM", AV25W_B405_WP01_SD01_CRF_ITEM);
                     }
                  }
               }
               AV42GXV4 = (int)(AV42GXV4+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42GXV4", GXutil.ltrim( GXutil.str( AV42GXV4, 8, 0)));
            }
            /* End For Each Line */
         }
         if ( nGXsfl_66_fel_idx == 0 )
         {
            nGXsfl_66_idx = (short)(1) ;
            sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") + sGXsfl_55_idx ;
            subsflControlProps_665( ) ;
         }
         nGXsfl_66_fel_idx = (short)(1) ;
         /* End For Each Line */
      }
      if ( nGXsfl_55_fel_idx == 0 )
      {
         nGXsfl_55_idx = (short)(1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_554( ) ;
      }
      nGXsfl_55_fel_idx = (short)(1) ;
      AV29W_TBW01_FREE_SAVE_1 = AV24W_B405_WP01_SD01.toxml(false, true, "B405_SD01", "tablet-EDC_GXXEV3U3") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29W_TBW01_FREE_SAVE_1", AV29W_TBW01_FREE_SAVE_1);
   }

   public void S142( )
   {
      /* 'CRF_CHECK' Routine */
      AV24W_B405_WP01_SD01.fromxml(AV29W_TBW01_FREE_SAVE_1, "");
      AV43GXV5 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43GXV5", GXutil.ltrim( GXutil.str( AV43GXV5, 8, 0)));
      while ( AV43GXV5 <= AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
      {
         AV25W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV43GXV5));
         AV44GXLvl342 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44GXLvl342", GXutil.str( AV44GXLvl342, 1, 0));
         /* Using cursor H001E5 */
         pr_default.execute(3, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id()), new Short(AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id())});
         if ( Gx_err != 0 )
         {
            AV44GXLvl342 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44GXLvl342", GXutil.str( AV44GXLvl342, 1, 0));
         }
         while ( (pr_default.getStatus(3) != 101) )
         {
            A397TBM31_DEL_FLG = H001E5_A397TBM31_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
            n397TBM31_DEL_FLG = H001E5_n397TBM31_DEL_FLG[0] ;
            A643TBM31_STATUS = H001E5_A643TBM31_STATUS[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
            n643TBM31_STATUS = H001E5_n643TBM31_STATUS[0] ;
            A69TBM31_CRF_ID = H001E5_A69TBM31_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
            A68TBM31_STUDY_ID = H001E5_A68TBM31_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
            AV44GXLvl342 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44GXLvl342", GXutil.str( AV44GXLvl342, 1, 0));
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( AV44GXLvl342 == 0 )
         {
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
            b405_wp02_kanja_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
            tblTbl_list_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
            lblTxt_btn_reg_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
         }
         AV43GXV5 = (int)(AV43GXV5+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43GXV5", GXutil.ltrim( GXutil.str( AV43GXV5, 8, 0)));
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV21W_A_LOGIN_SDT;
      GXv_char2[0] = AV26W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV21W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b405_wp02_kanja_crf_reg_impl.this.AV26W_ERRCD = GXv_char2[0] ;
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
      AV5BC_FREE_WORK.Load(AV20P_SESSION_ID, AV16P_APP_ID, AV18P_DISP_DATETIME, AV19P_SEL_LINE_NO);
      if ( AV5BC_FREE_WORK.Fail() )
      {
         GXt_char1 = AV27W_ERRMSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char2) ;
         b405_wp02_kanja_crf_reg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27W_ERRMSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERRMSG", AV27W_ERRMSG);
      }
      if ( GXutil.strcmp(AV27W_ERRMSG, "") == 0 )
      {
         AV24W_B405_WP01_SD01.fromxml(AV5BC_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1(), "");
         /* Using cursor H001E6 */
         pr_default.execute(4, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id())});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A63TBM21_STUDY_ID = H001E6_A63TBM21_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
            A367TBM21_STUDY_NM = H001E6_A367TBM21_STUDY_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
            n367TBM21_STUDY_NM = H001E6_n367TBM21_STUDY_NM[0] ;
            AV13D_STUDY_NM = A367TBM21_STUDY_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13D_STUDY_NM", AV13D_STUDY_NM);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
   }

   public void S152( )
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
      if ( ! (GXutil.strcmp("", AV22W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV22W_A819_JS ;
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
      GXv_char2[0] = AV15H_KNGN_FLG ;
      GXv_char4[0] = AV26W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV8C_TAM02_APP_ID, GXv_char2, GXv_char4) ;
      b405_wp02_kanja_crf_reg_impl.this.AV15H_KNGN_FLG = GXv_char2[0] ;
      b405_wp02_kanja_crf_reg_impl.this.AV26W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_ERRCD", AV26W_ERRCD);
      if ( GXutil.strcmp(AV26W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S172( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV33Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp02_kanja_crf_reg");
   }

   private void e171E4( )
   {
      /* Grid1_Load Routine */
      AV24W_B405_WP01_SD01.fromxml(AV29W_TBW01_FREE_SAVE_1, "");
      AV11D_GRD1_HIKENSHA = AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Hikensha_id() ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(55) ;
      }
      if ( ( subGrid1_Islastpage == 1 ) || ( 2 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_554( ) ;
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
   }

   private void e181E5( )
   {
      /* Grid2_Load Routine */
      AV36GXV2 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36GXV2", GXutil.ltrim( GXutil.str( AV36GXV2, 8, 0)));
      while ( AV36GXV2 <= AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
      {
         AV25W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV36GXV2));
         chkavD_grd2_crf_status.setEnabled( 1 );
         if ( AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Status_n() == 0 )
         {
            AV12D_GRD2_CRF_STATUS = false ;
         }
         else
         {
            AV12D_GRD2_CRF_STATUS = true ;
         }
         if ( AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Status_n() == 2 )
         {
            chkavD_grd2_crf_status.setEnabled( 0 );
         }
         AV10D_GRD1_CRF_ID = AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id() ;
         edtavD_grd1_crf_id_Visible = 0 ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(66) ;
         }
         sendrow_665( ) ;
         AV36GXV2 = (int)(AV36GXV2+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXV2", GXutil.ltrim( GXutil.str( AV36GXV2, 8, 0)));
      }
   }

   public void wb_table2_78_1E2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV14H_INIT_FLG), GXutil.rtrim( localUtil.format( AV14H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV15H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV15H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "<p>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "BTN_REG_EXEC", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavP_col_count_Internalname, GXutil.ltrim( localUtil.ntoc( AV17P_COL_COUNT, (byte)(4), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV17P_COL_COUNT), "ZZZ9"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavP_col_count_Jsonclick, 0, "Attribute", "", "", "", 1, 0, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "<p>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtavW_tbw01_free_save_1_Internalname, AV29W_TBW01_FREE_SAVE_1, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(86);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, "", "", (byte)(-1), true, "", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "<p>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtavW_tbw01_free_save_1_bak_Internalname, AV30W_TBW01_FREE_SAVE_1_BAK, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(87);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, "", "", (byte)(-1), true, "", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "<p></p>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_78_1E2e( true) ;
      }
      else
      {
         wb_table2_78_1E2e( false) ;
      }
   }

   public void wb_table1_2_1E2( boolean wbgen )
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
         wb_table3_6_1E2( true) ;
      }
      else
      {
         wb_table3_6_1E2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1E2e( boolean wbgen )
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
         wb_table1_2_1E2e( true) ;
      }
      else
      {
         wb_table1_2_1E2e( false) ;
      }
   }

   public void wb_table3_6_1E2( boolean wbgen )
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
         wb_table4_12_1E2( true) ;
      }
      else
      {
         wb_table4_12_1E2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_20_1E2( true) ;
      }
      else
      {
         wb_table5_20_1E2( false) ;
      }
      return  ;
   }

   public void wb_table5_20_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0076"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0076"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0076"+"");
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
         wb_table3_6_1E2e( true) ;
      }
      else
      {
         wb_table3_6_1E2e( false) ;
      }
   }

   public void wb_table5_20_1E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:35px\">") ;
         wb_table6_26_1E2( true) ;
      }
      else
      {
         wb_table6_26_1E2( false) ;
      }
      return  ;
   }

   public void wb_table6_26_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:(Unknown);width:964px\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 964, "px", 350, "px", "SectionScroll_NoLine", "");
         wb_table7_35_1E2( true) ;
      }
      else
      {
         wb_table7_35_1E2( false) ;
      }
      return  ;
   }

   public void wb_table7_35_1E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_20_1E2e( true) ;
      }
      else
      {
         wb_table5_20_1E2e( false) ;
      }
   }

   public void wb_table7_35_1E2( boolean wbgen )
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
         httpContext.writeText( "<td colspan=\"2\"  style=\"vertical-align:top\">") ;
         wb_table8_38_1E2( true) ;
      }
      else
      {
         wb_table8_38_1E2( false) ;
      }
      return  ;
   }

   public void wb_table8_38_1E2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"55\">") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV11D_GRD1_HIKENSHA));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_hikensha_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      if ( wbEnd == 55 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_55 = (short)(nGXsfl_55_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
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
         wb_table7_35_1E2e( true) ;
      }
      else
      {
         wb_table7_35_1E2e( false) ;
      }
   }

   public void wb_table8_38_1E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table9_41_1E2( true) ;
      }
      else
      {
         wb_table9_41_1E2( false) ;
      }
      return  ;
   }

   public void wb_table9_41_1E2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grd_titleContainer"+"DivS\" gxgridid=\"46\">") ;
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
            Grd_titleColumn.AddObjectProperty("Value", GXutil.rtrim( AV9D_CRFSNM));
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrd_title_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrd_title_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrd_title_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrd_title_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrd_title_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrd_title_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 46 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_46 = (short)(nGXsfl_46_idx-1) ;
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
         wb_table8_38_1E2e( true) ;
      }
      else
      {
         wb_table8_38_1E2e( false) ;
      }
   }

   public void wb_table9_41_1E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 35, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 70, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_in_grid_header_Internalname, tblTbl_in_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "îÌå±é“ID", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_41_1E2e( true) ;
      }
      else
      {
         wb_table9_41_1E2e( false) ;
      }
   }

   public void wb_table6_26_1E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "ééå±ñº", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_study_nm_Internalname, GXutil.rtrim( AV13D_STUDY_NM), GXutil.rtrim( localUtil.format( AV13D_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_study_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_study_nm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_26_1E2e( true) ;
      }
      else
      {
         wb_table6_26_1E2e( false) ;
      }
   }

   public void wb_table4_12_1E2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "ìoò^ÅiF3Åj", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "ñﬂÇÈÅiF11Åj", "", "", lblTxt_btn_can_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_1E2e( true) ;
      }
      else
      {
         wb_table4_12_1E2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV17P_COL_COUNT = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_COL_COUNT", GXutil.ltrim( GXutil.str( AV17P_COL_COUNT, 4, 0)));
      AV20P_SESSION_ID = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20P_SESSION_ID", AV20P_SESSION_ID);
      AV16P_APP_ID = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_APP_ID", AV16P_APP_ID);
      AV18P_DISP_DATETIME = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_DISP_DATETIME", AV18P_DISP_DATETIME);
      AV19P_SEL_LINE_NO = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19P_SEL_LINE_NO", GXutil.ltrim( GXutil.str( AV19P_SEL_LINE_NO, 4, 0)));
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
      pa1E2( ) ;
      ws1E2( ) ;
      we1E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2017731718532");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b405_wp02_kanja_crf_reg.js", "?2017731718532");
      /* End function include_jscripts */
   }

   public void subsflControlProps_462( )
   {
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_462( )
   {
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_46_fel_idx ;
   }

   public void sendrow_462( )
   {
      subsflControlProps_462( ) ;
      wb1E0( ) ;
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
         if ( ((int)(((nGXsfl_46_idx-1)/ (double) (0)) % (2))) == 0 )
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
      Grd_titleRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_in_grid_header2_Internalname+"_"+sGXsfl_46_idx,new Integer(1),"TableGridHeaderLM-1","","","","","","",new Integer(0),new Integer(1),new Integer(35),new Integer(150),"","px","px"});
      Grd_titleRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grd_titleRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      Grd_titleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_crfsnm_Internalname,GXutil.rtrim( AV9D_CRFSNM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_crfsnm_Jsonclick,new Integer(0),"ReadonlyAttribute","font-family:'ÇlÇr ÇoÉSÉVÉbÉN'; font-size:10.0pt; font-weight:bold; font-style:normal;",ROClassString,"",new Integer(1),new Integer(0),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(46),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
      nGXsfl_46_idx = (short)(((subGrd_title_Islastpage==1)&&(nGXsfl_46_idx+1>subgrd_title_recordsperpage( )) ? 1 : nGXsfl_46_idx+1)) ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_46_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_462( ) ;
      /* End function sendrow_462 */
   }

   public void subsflControlProps_665( )
   {
      chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_66_idx );
      edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_66_idx ;
   }

   public void subsflControlProps_fel_665( )
   {
      chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_66_fel_idx );
      edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_66_fel_idx ;
   }

   public void sendrow_665( )
   {
      subsflControlProps_665( ) ;
      wb1E0( ) ;
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
         if ( ((int)(((nGXsfl_66_idx-1)/ (double) (0)) % (2))) == 0 )
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
      Grid2Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_in_grid3_Internalname+"_"+sGXsfl_66_idx,new Integer(1),"TableGridTLM1","","","","","","",new Integer(0),new Integer(1),new Integer(31),new Integer(150),"","px","px"});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Check box */
      TempTags = " " + ((chkavD_grd2_crf_status.getEnabled()!=0)&&(chkavD_grd2_crf_status.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'',false,'"+sGXsfl_66_idx+"',66)\"" : " ") ;
      ClassString = "ReadonlyAttributeImeOff" ;
      StyleString = "" ;
      Grid2Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavD_grd2_crf_status.getInternalname(),GXutil.booltostr( AV12D_GRD2_CRF_STATUS),"",new Integer(1),new Integer(chkavD_grd2_crf_status.getEnabled()),"true","",StyleString,ClassString,"",TempTags+((chkavD_grd2_crf_status.getEnabled()!=0)&&(chkavD_grd2_crf_status.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(72, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd2_crf_status.getEnabled()!=0)&&(chkavD_grd2_crf_status.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(72);\"" : " ")});
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
      /* Single line edit */
      TempTags = " " + ((edtavD_grd1_crf_id_Enabled!=0)&&(edtavD_grd1_crf_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'',false,'"+sGXsfl_66_idx+"',66)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd1_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV10D_GRD1_CRF_ID, (byte)(4), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10D_GRD1_CRF_ID), "ZZZ9")),TempTags+((edtavD_grd1_crf_id_Enabled!=0)&&(edtavD_grd1_crf_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd1_crf_id_Enabled!=0)&&(edtavD_grd1_crf_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(73);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd1_crf_id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(edtavD_grd1_crf_id_Visible),new Integer(1),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(66),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
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
      nGXsfl_66_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_66_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_66_idx+1)) ;
      sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") + sGXsfl_55_idx ;
      subsflControlProps_665( ) ;
      /* End function sendrow_665 */
   }

   public void subsflControlProps_554( )
   {
      edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_55_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_554( )
   {
      edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_55_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_55_fel_idx ;
   }

   public void sendrow_554( )
   {
      subsflControlProps_554( ) ;
      wb1E0( ) ;
      if ( ( 2 * 1 == 0 ) || ( nGXsfl_55_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_55_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_55_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_55_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_55_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_55_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grid_Internalname+"_"+sGXsfl_55_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"vertical-align:top\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_in_grid2_Internalname+"_"+sGXsfl_55_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),new Integer(31),new Integer(70),"","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd1_hikensha_Internalname,GXutil.rtrim( AV11D_GRD1_HIKENSHA),"",TempTags+((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(64);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd1_hikensha_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd1_hikensha_Enabled),new Integer(0),"text","",new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(55),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"66\">") ;
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
            Grid2Column.AddObjectProperty("Value", GXutil.booltostr( AV12D_GRD2_CRF_STATUS));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavD_grd2_crf_status.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV10D_GRD1_CRF_ID, (byte)(4), (byte)(0), ".", "")));
            Grid2Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_crf_id_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
         rf1E5( ) ;
         nRC_GXsfl_66 = (short)(nGXsfl_66_idx-1) ;
         GXCCtl = "nRC_GXsfl_66_" + sGXsfl_55_idx ;
         GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_66, (byte)(4), (byte)(0), ".", "")));
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
         }
         else
         {
            if ( ! isAjaxCallMode( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_55_idx, Grid2Container.ToJavascriptSource());
            }
            if ( isAjaxCallMode( ) )
            {
               Grid1Row.AddGrid("Grid2", Grid2Container);
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_55_idx, Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_55_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'>") ;
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
               if ( ((int)((nGXsfl_55_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_55_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_55_idx+1)) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_55_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_554( ) ;
      }
      /* End function sendrow_554 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavD_study_nm_Internalname = "vD_STUDY_NM" ;
      tblTable10_Internalname = "TABLE10" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      tblTbl_in_grid_header_Internalname = "TBL_IN_GRID_HEADER" ;
      tblTbl_in_grid_header2_Internalname = "TBL_IN_GRID_HEADER2" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTbl_in_grid2_Internalname = "TBL_IN_GRID2" ;
      tblTbl_in_grid3_Internalname = "TBL_IN_GRID3" ;
      tblTbl_grid_Internalname = "TBL_GRID" ;
      tblTbl_list_Internalname = "TBL_LIST" ;
      divSection1_Internalname = "SECTION1" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavP_col_count_Internalname = "vP_COL_COUNT" ;
      edtavW_tbw01_free_save_1_Internalname = "vW_TBW01_FREE_SAVE_1" ;
      edtavW_tbw01_free_save_1_bak_Internalname = "vW_TBW01_FREE_SAVE_1_BAK" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrd_title_Internalname = "GRD_TITLE" ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_55_idx ;
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      edtavD_grd1_hikensha_Jsonclick = "" ;
      edtavD_grd1_hikensha_Visible = 1 ;
      subGrid1_Class = "FreeStyleGridBase" ;
      edtavD_grd1_crf_id_Jsonclick = "" ;
      edtavD_grd1_crf_id_Enabled = 1 ;
      edtavD_grd1_crf_id_Visible = 1 ;
      chkavD_grd2_crf_status.setVisible( 1 );
      chkavD_grd2_crf_status.setEnabled( 1 );
      subGrid2_Class = "FreeStyleGridBase" ;
      edtavD_crfsnm_Jsonclick = "" ;
      subGrd_title_Class = "FreeStyleGridBase" ;
      lblTxt_btn_reg_Visible = 1 ;
      edtavD_study_nm_Jsonclick = "" ;
      edtavD_study_nm_Enabled = 1 ;
      subGrd_title_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd1_hikensha_Enabled = 1 ;
      tblTbl_list_Width = 0 ;
      edtavP_col_count_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      tblTbl_list_Visible = 1 ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid2_Borderwidth = (short)(0) ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      subGrd_title_Borderwidth = (short)(0) ;
      subGrd_title_Backcolorstyle = (byte)(0) ;
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
                  /* Execute user subroutine: S172 */
                  S172 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV20P_SESSION_ID = "" ;
      wcpOAV16P_APP_ID = "" ;
      wcpOAV18P_DISP_DATETIME = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV20P_SESSION_ID = "" ;
      AV16P_APP_ID = "" ;
      AV18P_DISP_DATETIME = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV33Pgmname = "" ;
      AV8C_TAM02_APP_ID = "" ;
      A643TBM31_STATUS = "" ;
      A397TBM31_DEL_FLG = "" ;
      AV23W_A821_JS = "" ;
      AV22W_A819_JS = "" ;
      AV24W_B405_WP01_SD01 = new SdtB405_SD01(remoteHandle, context);
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
      AV9D_CRFSNM = "" ;
      edtavD_crfsnm_Internalname = "" ;
      AV11D_GRD1_HIKENSHA = "" ;
      edtavD_grd1_hikensha_Internalname = "" ;
      edtavD_grd1_crf_id_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grd_titleContainer = new com.genexus.webpanels.GXWebGrid(context);
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      AV13D_STUDY_NM = "" ;
      AV14H_INIT_FLG = "" ;
      AV15H_KNGN_FLG = "" ;
      AV29W_TBW01_FREE_SAVE_1 = "" ;
      AV30W_TBW01_FREE_SAVE_1_BAK = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV21W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV25W_B405_WP01_SD01_CRF_ITEM = new SdtB405_SD01_CRF_Item(remoteHandle, context);
      scmdbuf = "" ;
      H001E2_A397TBM31_DEL_FLG = new String[] {""} ;
      H001E2_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H001E2_A643TBM31_STATUS = new String[] {""} ;
      H001E2_n643TBM31_STATUS = new boolean[] {false} ;
      H001E2_A69TBM31_CRF_ID = new short[1] ;
      H001E2_A68TBM31_STUDY_ID = new long[1] ;
      H001E2_A642TBM31_CRF_SNM = new String[] {""} ;
      H001E2_n642TBM31_CRF_SNM = new boolean[] {false} ;
      AV28W_MSG = "" ;
      H001E3_A91TBT02_CRF_ID = new short[1] ;
      H001E3_A90TBT02_SUBJECT_ID = new int[1] ;
      H001E3_A89TBT02_STUDY_ID = new long[1] ;
      H001E3_A935TBT02_CRF_EDA_NO = new byte[1] ;
      AV6BC_TBT02_CRF = new SdtTBT02_CRF(remoteHandle);
      AV27W_ERRMSG = "" ;
      H001E4_A935TBT02_CRF_EDA_NO = new byte[1] ;
      H001E4_A91TBT02_CRF_ID = new short[1] ;
      H001E4_A90TBT02_SUBJECT_ID = new int[1] ;
      H001E4_A89TBT02_STUDY_ID = new long[1] ;
      H001E5_A397TBM31_DEL_FLG = new String[] {""} ;
      H001E5_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H001E5_A643TBM31_STATUS = new String[] {""} ;
      H001E5_n643TBM31_STATUS = new boolean[] {false} ;
      H001E5_A69TBM31_CRF_ID = new short[1] ;
      H001E5_A68TBM31_STUDY_ID = new long[1] ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV26W_ERRCD = "" ;
      AV5BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      GXt_char1 = "" ;
      H001E6_A63TBM21_STUDY_ID = new long[1] ;
      H001E6_A367TBM21_STUDY_NM = new String[] {""} ;
      H001E6_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A367TBM21_STUDY_NM = "" ;
      GXv_char2 = new String [1] ;
      GXv_char4 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock2_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grd_titleColumn = new com.genexus.webpanels.GXWebColumn();
      lblTextblock13_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grd_titleRow = new com.genexus.webpanels.GXWebRow();
      subGrd_title_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b405_wp02_kanja_crf_reg__default(),
         new Object[] {
             new Object[] {
            H001E2_A397TBM31_DEL_FLG, H001E2_n397TBM31_DEL_FLG, H001E2_A643TBM31_STATUS, H001E2_n643TBM31_STATUS, H001E2_A69TBM31_CRF_ID, H001E2_A68TBM31_STUDY_ID, H001E2_A642TBM31_CRF_SNM, H001E2_n642TBM31_CRF_SNM
            }
            , new Object[] {
            H001E3_A91TBT02_CRF_ID, H001E3_A90TBT02_SUBJECT_ID, H001E3_A89TBT02_STUDY_ID, H001E3_A935TBT02_CRF_EDA_NO
            }
            , new Object[] {
            H001E4_A935TBT02_CRF_EDA_NO, H001E4_A91TBT02_CRF_ID, H001E4_A90TBT02_SUBJECT_ID, H001E4_A89TBT02_STUDY_ID
            }
            , new Object[] {
            H001E5_A397TBM31_DEL_FLG, H001E5_n397TBM31_DEL_FLG, H001E5_A643TBM31_STATUS, H001E5_n643TBM31_STATUS, H001E5_A69TBM31_CRF_ID, H001E5_A68TBM31_STUDY_ID
            }
            , new Object[] {
            H001E6_A63TBM21_STUDY_ID, H001E6_A367TBM21_STUDY_NM, H001E6_n367TBM21_STUDY_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV33Pgmname = "B405_WP02_KANJA_CRF_REG" ;
      /* GeneXus formulas. */
      AV33Pgmname = "B405_WP02_KANJA_CRF_REG" ;
      Gx_err = (short)(0) ;
      edtavD_study_nm_Enabled = 0 ;
      edtavD_grd1_hikensha_Enabled = 0 ;
      chkavD_grd2_crf_status.setEnabled( 0 );
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrd_title_Backcolorstyle ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte AV39GXLvl218 ;
   private byte AV44GXLvl342 ;
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
   private short wcpOAV17P_COL_COUNT ;
   private short wcpOAV19P_SEL_LINE_NO ;
   private short nRC_GXsfl_46 ;
   private short nGXsfl_46_idx=1 ;
   private short nRC_GXsfl_66 ;
   private short nGXsfl_66_idx=1 ;
   private short nRC_GXsfl_55 ;
   private short nGXsfl_55_idx=1 ;
   private short AV17P_COL_COUNT ;
   private short AV19P_SEL_LINE_NO ;
   private short A69TBM31_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV10D_GRD1_CRF_ID ;
   private short nCmpId ;
   private short subGrd_title_Borderwidth ;
   private short nGXsfl_46_Refreshing=0 ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_55_Refreshing=0 ;
   private short subGrid2_Borderwidth ;
   private short nGXsfl_66_Refreshing=0 ;
   private short Gx_err ;
   private short A91TBT02_CRF_ID ;
   private short nGXsfl_55_fel_idx=1 ;
   private short nGXsfl_66_fel_idx=1 ;
   private int lblTxt_btn_reg_Visible ;
   private int subGrd_title_Islastpage ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int GRID1_IsPaging ;
   private int edtavD_study_nm_Enabled ;
   private int edtavD_grd1_hikensha_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int tblTbl_list_Width ;
   private int AV34GXV1 ;
   private int AV37GXV3 ;
   private int A90TBT02_SUBJECT_ID ;
   private int AV42GXV4 ;
   private int AV43GXV5 ;
   private int tblTbl_list_Visible ;
   private int GXActiveErrHndl ;
   private int AV36GXV2 ;
   private int edtavD_grd1_crf_id_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrd_title_Selectioncolor ;
   private int subGrd_title_Hoveringcolor ;
   private int idxLst ;
   private int subGrd_title_Backcolor ;
   private int subGrd_title_Allbackcolor ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int edtavD_grd1_crf_id_Enabled ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd1_hikensha_Visible ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid1_Rows ;
   private long GRID1_nFirstRecordOnPage ;
   private long A68TBM31_STUDY_ID ;
   private long GRID1_nRecordCount ;
   private long A89TBT02_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long GRID1_nCurrentRecord ;
   private long GRD_TITLE_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_46_idx="0001" ;
   private String sGXsfl_66_idx="0001" ;
   private String sGXsfl_55_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV33Pgmname ;
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
   private String edtavD_grd1_crf_id_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String edtavD_study_nm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavW_tbw01_free_save_1_Internalname ;
   private String edtavW_tbw01_free_save_1_bak_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String tblTbl_list_Internalname ;
   private String scmdbuf ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String sGXsfl_66_fel_idx="0001" ;
   private String lblTxt_btn_reg_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavP_col_count_Internalname ;
   private String edtavP_col_count_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable4_Internalname ;
   private String divSection1_Internalname ;
   private String subGrid1_Internalname ;
   private String tblTbl_grid_header_Internalname ;
   private String subGrd_title_Internalname ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtavD_study_nm_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String subGrd_title_Class ;
   private String subGrd_title_Linesclass ;
   private String tblTbl_in_grid_header2_Internalname ;
   private String ROClassString ;
   private String edtavD_crfsnm_Jsonclick ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String tblTbl_in_grid3_Internalname ;
   private String edtavD_grd1_crf_id_Jsonclick ;
   private String subGrid2_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_Internalname ;
   private String tblTbl_in_grid2_Internalname ;
   private String edtavD_grd1_hikensha_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV12D_GRD2_CRF_STATUS ;
   private boolean returnInSub ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n643TBM31_STATUS ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n367TBM21_STUDY_NM ;
   private String AV29W_TBW01_FREE_SAVE_1 ;
   private String AV30W_TBW01_FREE_SAVE_1_BAK ;
   private String wcpOAV20P_SESSION_ID ;
   private String wcpOAV16P_APP_ID ;
   private String wcpOAV18P_DISP_DATETIME ;
   private String AV20P_SESSION_ID ;
   private String AV16P_APP_ID ;
   private String AV18P_DISP_DATETIME ;
   private String AV8C_TAM02_APP_ID ;
   private String A643TBM31_STATUS ;
   private String A397TBM31_DEL_FLG ;
   private String AV23W_A821_JS ;
   private String AV22W_A819_JS ;
   private String A642TBM31_CRF_SNM ;
   private String AV9D_CRFSNM ;
   private String AV11D_GRD1_HIKENSHA ;
   private String AV13D_STUDY_NM ;
   private String AV14H_INIT_FLG ;
   private String AV15H_KNGN_FLG ;
   private String AV7C_GAMEN_TITLE ;
   private String AV28W_MSG ;
   private String AV27W_ERRMSG ;
   private String AV26W_ERRCD ;
   private String A367TBM21_STUDY_NM ;
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
   private ICheckbox chkavD_grd2_crf_status ;
   private IDataStoreProvider pr_default ;
   private String[] H001E2_A397TBM31_DEL_FLG ;
   private boolean[] H001E2_n397TBM31_DEL_FLG ;
   private String[] H001E2_A643TBM31_STATUS ;
   private boolean[] H001E2_n643TBM31_STATUS ;
   private short[] H001E2_A69TBM31_CRF_ID ;
   private long[] H001E2_A68TBM31_STUDY_ID ;
   private String[] H001E2_A642TBM31_CRF_SNM ;
   private boolean[] H001E2_n642TBM31_CRF_SNM ;
   private short[] H001E3_A91TBT02_CRF_ID ;
   private int[] H001E3_A90TBT02_SUBJECT_ID ;
   private long[] H001E3_A89TBT02_STUDY_ID ;
   private byte[] H001E3_A935TBT02_CRF_EDA_NO ;
   private byte[] H001E4_A935TBT02_CRF_EDA_NO ;
   private short[] H001E4_A91TBT02_CRF_ID ;
   private int[] H001E4_A90TBT02_SUBJECT_ID ;
   private long[] H001E4_A89TBT02_STUDY_ID ;
   private String[] H001E5_A397TBM31_DEL_FLG ;
   private boolean[] H001E5_n397TBM31_DEL_FLG ;
   private String[] H001E5_A643TBM31_STATUS ;
   private boolean[] H001E5_n643TBM31_STATUS ;
   private short[] H001E5_A69TBM31_CRF_ID ;
   private long[] H001E5_A68TBM31_STUDY_ID ;
   private long[] H001E6_A63TBM21_STUDY_ID ;
   private String[] H001E6_A367TBM21_STUDY_NM ;
   private boolean[] H001E6_n367TBM21_STUDY_NM ;
   private SdtTBW01_FREE_WORK AV5BC_FREE_WORK ;
   private SdtTBT02_CRF AV6BC_TBT02_CRF ;
   private SdtA_LOGIN_SDT AV21W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB405_SD01 AV24W_B405_WP01_SD01 ;
   private SdtB405_SD01_CRF_Item AV25W_B405_WP01_SD01_CRF_ITEM ;
}

final  class b405_wp02_kanja_crf_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001E2", "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1') AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001E3", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_CRF_EDA_NO` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001E4", "SELECT `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = 1 ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001E5", "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1') AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001E6", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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

