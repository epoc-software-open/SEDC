/*
               File: b405_wp02_kanja_crf_reg_impl
        Description: ä≥é“ï égópCRFìoò^
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:5:16.28
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
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
         gxfirstwebparm_bkp = gxfirstwebparm ;
         gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm, "High") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grd_title") == 0 )
         {
            nRC_Grd_title = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_45_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_45_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrd_title_newrow( nRC_Grd_title, nGXsfl_45_idx, sGXsfl_45_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_Grid2 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_65_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_65_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_Grid2, nGXsfl_65_idx, sGXsfl_65_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_Grid1 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_54_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_54_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_54_idx, sGXsfl_54_idx) ;
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
         if ( ! entryPointCalled )
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
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         pa1D2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1D2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1D2( ) ;
            }
         }
         if ( httpContext.isAjaxRequest( ) )
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "ä≥é“ï égópCRFìoò^") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      if ( ! httpContext.isSmartDevice( ) )
      {
         httpContext.AddJavascriptSource("gxgral.js", "?58720");
         httpContext.AddJavascriptSource("gxcfg.js", "?58720");
      }
      else
      {
         httpContext.AddJavascriptSource("gxapiSD.js", "?58720");
         httpContext.AddJavascriptSource("gxfxSD.js", "?58720");
         httpContext.AddJavascriptSource("gxtypesSD.js", "?58720");
         httpContext.AddJavascriptSource("gxpopupSD.js", "?58720");
         httpContext.AddJavascriptSource("gxfrmutlSD.js", "?58720");
         httpContext.AddJavascriptSource("gxgridSD.js", "?58720");
         httpContext.AddJavascriptSource("JavaScripTableSD.js", "?58720");
         httpContext.AddJavascriptSource("rijndaelSD.js", "?58720");
         httpContext.AddJavascriptSource("gxgralSD.js", "?58720");
         httpContext.AddJavascriptSource("gxcfg.js", "?58720");
      }
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,false,false)\" onkeydown=\"gx.evt.onkeypress(null,false,false)\"" ;
      httpContext.writeText( "<body") ;
      httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;") ;
      httpContext.writeText( "\""+FormProcess+">") ;
      httpContext.skipLines( 1 );
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_COL_COUNT,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV20P_SESSION_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16P_APP_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_DISP_DATETIME)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19P_SEL_LINE_NO,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b405_wp02_kanja_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1D2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grd_title", GXutil.ltrim( localUtil.ntoc( nRC_Grd_title, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_SESSION_ID", GXutil.rtrim( AV20P_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "vP_APP_ID", GXutil.rtrim( AV16P_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "vP_DISP_DATETIME", GXutil.rtrim( AV18P_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "vP_SEL_LINE_NO", GXutil.ltrim( localUtil.ntoc( AV19P_SEL_LINE_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_SNM", GXutil.rtrim( A550TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A218TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A217TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B405_WP01_SD01", AV24W_B405_WP01_SD01);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B405_WP01_SD01", AV24W_B405_WP01_SD01);
      }
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
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
         wb_table2_77_1D2( true) ;
      }
      else
      {
         wb_table2_77_1D2( false) ;
      }
      return  ;
   }

   public void wb_table2_77_1D2e( boolean wbgen )
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
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "ä≥é“ï égópCRFìoò^", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0075") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0075", "");
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
               /* Check if conditions changed and reset current page numbers */
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
                        /* Execute user event: e111D2 */
                        e111D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121D2 */
                        e121D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131D2 */
                        e131D2 ();
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
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "GRD_TITLE.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_45_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_45_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_45_idx, 4, 0)), (short)(4), "0") ;
                        edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_45_idx ;
                        AV9D_CRFSNM = httpContext.cgiGet( edtavD_crfsnm_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0075") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0075", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0075") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0075", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e141D2 */
                              e141D2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e151D2 */
                              e151D2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRD_TITLE.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e161D2 */
                              e161D2 ();
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
                        nGXsfl_54_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
                        edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_54_idx ;
                        subGrid2_Internalname = "GRID2_"+sGXsfl_54_idx ;
                        AV11D_GRD1_HIKENSHA = httpContext.cgiGet( edtavD_grd1_hikensha_Internalname) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e171D4 */
                              e171D4 ();
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
                              nGXsfl_65_idx = (short)(GXutil.lval( sEvtType)) ;
                              sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") + sGXsfl_54_idx ;
                              chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_65_idx );
                              edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_65_idx ;
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
                                    /* Execute user event: e181D5 */
                                    e181D5 ();
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
                  else if ( nCmpId == 75 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0075") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0075", "", sEvt);
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
         if ( ( GxWebError == 0 ) && ! ( httpContext.isAjaxCallMode( ) || httpContext.isFullAjaxMode( ) ) )
         {
            GXKey = context.getSiteKey( ) ;
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 )
            {
               httpContext.setQueryString( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6)) ;
            }
            else
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
            }
         }
         if ( ! ( httpContext.isAjaxCallMode( ) || httpContext.isFullAjaxMode( ) ) )
         {
            if ( nGotPars == 0 )
            {
               entryPointCalled = false ;
               gxfirstwebparm = httpContext.GetNextPar( ) ;
               if ( ! entryPointCalled )
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
         GXCCtl = "vD_GRD2_CRF_STATUS_" + sGXsfl_65_idx ;
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

   public void gxnrgrd_title_newrow( short nRC_Grd_title ,
                                     short nGXsfl_45_idx ,
                                     String sGXsfl_45_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_45_idx ;
      while ( nGXsfl_45_idx <= nRC_Grd_title )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = (short)(((subGrd_title_Islastpage==1)&&(nGXsfl_45_idx+1>subgrd_title_recordsperpage( )) ? 1 : nGXsfl_45_idx+1)) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_45_idx, 4, 0)), (short)(4), "0") ;
         edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_45_idx ;
      }
      httpContext.GX_webresponse.addString(Grd_titleContainer.ToJavascriptSource());
      /* End function gxnrGrd_title_newrow */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_54_idx ,
                                 String sGXsfl_54_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_54_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_54_idx ;
      while ( nGXsfl_54_idx <= nRC_Grid1 )
      {
         sendrow_544( ) ;
         nGXsfl_54_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_idx+1)) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_54_idx ;
         subGrid2_Internalname = "GRID2_"+sGXsfl_54_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( short nRC_Grid2 ,
                                 short nGXsfl_65_idx ,
                                 String sGXsfl_65_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_65_idx );
      edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_65_idx ;
      while ( nGXsfl_65_idx <= nRC_Grid2 )
      {
         sendrow_655( ) ;
         nGXsfl_65_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_65_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_65_idx+1)) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") + sGXsfl_54_idx ;
         chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_65_idx );
         edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_65_idx ;
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
      Grd_titleContainer.setPageSize( subgrd_title_recordsperpage( ) );
      wbStart = (short)(45) ;
      nGXsfl_45_idx = (short)(1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_45_idx, 4, 0)), (short)(4), "0") ;
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_45_idx ;
      /* Execute user event: e151D2 */
      e151D2 ();
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
         edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_45_idx ;
         /* Execute user event: e161D2 */
         e161D2 ();
         wbEnd = (short)(45) ;
         wb1D0( ) ;
      }
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

   public void rf1D4( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(54) ;
      nGXsfl_54_idx = (short)(1) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_54_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_54_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_54_idx ;
         subGrid2_Internalname = "GRID2_"+sGXsfl_54_idx ;
         /* Execute user event: e171D4 */
         e171D4 ();
         wbEnd = (short)(54) ;
         wb1D0( ) ;
      }
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
      if ( 2 > 0 )
      {
         if ( 1 > 0 )
         {
            return 2*1 ;
         }
         else
         {
            return 2 ;
         }
      }
      return -1 ;
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
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
         GRID1_IsPaging = 1 ;
      }
      return (short)(0) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
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
      return (short)(3) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      GRID1_IsPaging = 1 ;
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (int)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      return 0 ;
   }

   public void rf1D5( )
   {
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      wbStart = (short)(65) ;
      nGXsfl_65_idx = (short)(1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") + sGXsfl_54_idx ;
      chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_65_idx );
      edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_65_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_65_idx );
         edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_65_idx ;
         /* Execute user event: e181D5 */
         e181D5 ();
         wbEnd = (short)(65) ;
         wb1D0( ) ;
      }
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
      AV33Pgmname = "B405_WP02_KANJA_CRF_REG" ;
      Gx_err = (short)(0) ;
      edtavD_study_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_study_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_study_nm_Enabled, 5, 0)));
      edtavD_grd1_hikensha_Enabled = 0 ;
      chkavD_grd2_crf_status.setEnabled( 0 );
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e141D2 */
      e141D2 ();
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
         nRC_Grd_title = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grd_title"), ".", ",")) ;
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV20P_SESSION_ID = httpContext.cgiGet( "vP_SESSION_ID") ;
         AV16P_APP_ID = httpContext.cgiGet( "vP_APP_ID") ;
         AV18P_DISP_DATETIME = httpContext.cgiGet( "vP_DISP_DATETIME") ;
         AV19P_SEL_LINE_NO = (short)(localUtil.ctol( httpContext.cgiGet( "vP_SEL_LINE_NO"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0075") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0075", "");
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e141D2 */
      e141D2 ();
      if (returnInSub) return;
   }

   public void e141D2( )
   {
      /* Start Routine */
      AV8C_TAM02_APP_ID = "B405" ;
      AV7C_GAMEN_TITLE = "ä≥é“ï égópCRFìoò^" ;
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
      if ( GXutil.strcmp(WebComp_Webcomp1_Component, "A104_WP01_HEADER") != 0 )
      {
         WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "a104_wp01_header_impl", remoteHandle, context);
         WebComp_Webcomp1_Component = "A104_WP01_HEADER" ;
      }
      if ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
      {
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV21W_A_LOGIN_SDT,AV8C_TAM02_APP_ID,AV7C_GAMEN_TITLE,""});
         WebComp_Webcomp1.componentbind(new Object[] {"","","",""});
      }
      /* Object Property */
      if ( GXutil.strcmp(WebComp_Webcomp2_Component, "A104_WP02_FOOTER") != 0 )
      {
         WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "a104_wp02_footer_impl", remoteHandle, context);
         WebComp_Webcomp2_Component = "A104_WP02_FOOTER" ;
      }
      if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
      {
         WebComp_Webcomp2.setjustcreated();
      }
      if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
      {
         WebComp_Webcomp2.componentprepare(new Object[] {"W0075",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      tblTbl_list_Width = (int)(100+150*AV17P_COL_COUNT) ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Width", GXutil.ltrim( GXutil.str( tblTbl_list_Width, 9, 0)));
   }

   public void e151D2( )
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

   private void e161D2( )
   {
      /* Grd_title_Load Routine */
      AV34GXV1 = 1 ;
      while ( AV34GXV1 <= AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
      {
         AV25W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV34GXV1));
         /* Using cursor H001D2 */
         pr_default.execute(0, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id()), new Short(AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id())});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A223TBM31_DEL_FLG = H001D2_A223TBM31_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
            n223TBM31_DEL_FLG = H001D2_n223TBM31_DEL_FLG[0] ;
            A551TBM31_STATUS = H001D2_A551TBM31_STATUS[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
            n551TBM31_STATUS = H001D2_n551TBM31_STATUS[0] ;
            A218TBM31_CRF_ID = H001D2_A218TBM31_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
            A217TBM31_STUDY_ID = H001D2_A217TBM31_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
            A550TBM31_CRF_SNM = H001D2_A550TBM31_CRF_SNM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
            n550TBM31_CRF_SNM = H001D2_n550TBM31_CRF_SNM[0] ;
            AV9D_CRFSNM = A550TBM31_CRF_SNM ;
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(45) ;
            }
            sendrow_452( ) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV34GXV1 = (int)(AV34GXV1+1) ;
      }
   }

   public void e111D2( )
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
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char3) ;
            b405_wp02_kanja_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
            GXt_char2 = AV23W_A821_JS ;
            GXv_char3[0] = GXt_char2 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV28W_MSG, "", "BTN_REG_EXEC", "", GXv_char3) ;
            b405_wp02_kanja_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV23W_A821_JS = GXt_char2 ;
         }
      }
   }

   public void e131D2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      AV24W_B405_WP01_SD01.fromxml(AV29W_TBW01_FREE_SAVE_1, "");
      AV37GXV3 = 1 ;
      while ( AV37GXV3 <= AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
      {
         AV25W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV37GXV3));
         if ( AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Status_n() == 0 )
         {
            /* Using cursor H001D3 */
            pr_default.execute(1, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id()), new Integer(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id()), new Short(AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id())});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A294TBT02_CRF_ID = H001D3_A294TBT02_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
               A293TBT02_SUBJECT_ID = H001D3_A293TBT02_SUBJECT_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
               A292TBT02_STUDY_ID = H001D3_A292TBT02_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
               AV6BC_TBT02_CRF.Load(A292TBT02_STUDY_ID, A293TBT02_SUBJECT_ID, A294TBT02_CRF_ID);
               AV6BC_TBT02_CRF.Delete();
               if ( AV6BC_TBT02_CRF.Success() )
               {
               }
               else
               {
                  GXt_char2 = AV27W_ERRMSG ;
                  GXv_char3[0] = GXt_char2 ;
                  new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char3) ;
                  b405_wp02_kanja_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV27W_ERRMSG = GXt_char2 ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
         else if ( AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Status_n() == 1 )
         {
            AV39GXLvl216 = (byte)(0) ;
            /* Using cursor H001D4 */
            pr_default.execute(2, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id()), new Integer(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id()), new Short(AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id())});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A294TBT02_CRF_ID = H001D4_A294TBT02_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
               A293TBT02_SUBJECT_ID = H001D4_A293TBT02_SUBJECT_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
               A292TBT02_STUDY_ID = H001D4_A292TBT02_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
               AV39GXLvl216 = (byte)(1) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            if ( AV39GXLvl216 == 0 )
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
                  GXt_char2 = AV27W_ERRMSG ;
                  GXv_char3[0] = GXt_char2 ;
                  new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char3) ;
                  b405_wp02_kanja_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV27W_ERRMSG = GXt_char2 ;
               }
            }
         }
         if ( GXutil.strcmp(AV27W_ERRMSG, "") != 0 )
         {
            if (true) break;
         }
         AV37GXV3 = (int)(AV37GXV3+1) ;
      }
      if ( GXutil.strcmp(AV27W_ERRMSG, "") == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b405_wp02_kanja_crf_reg");
         new b805_pc01_work_del(remoteHandle, context).execute( AV16P_APP_ID, AV18P_DISP_DATETIME) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16P_APP_ID", AV16P_APP_ID);
         httpContext.ajax_rsp_assign_attri("", false, "AV18P_DISP_DATETIME", AV18P_DISP_DATETIME);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_COL_COUNT,4,0))) ;
         httpContext.wjLoc = formatLink("b405_wp01_kanja_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp02_kanja_crf_reg");
         httpContext.GX_msglist.addItem(AV27W_ERRMSG);
      }
   }

   public void e121D2( )
   {
      /* 'BTN_CAN' Routine */
      new b805_pc01_work_del(remoteHandle, context).execute( AV16P_APP_ID, AV18P_DISP_DATETIME) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_APP_ID", AV16P_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_DISP_DATETIME", AV18P_DISP_DATETIME);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_COL_COUNT,4,0))) ;
      httpContext.wjLoc = formatLink("b405_wp01_kanja_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S162( )
   {
      /* 'SUB_GRD_TO_SDT' Routine */
      AV24W_B405_WP01_SD01.fromxml(AV29W_TBW01_FREE_SAVE_1, "");
      /* Start For Each Line in Grid1 */
      nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
      nGXsfl_54_fel_idx = (short)(0) ;
      while ( nGXsfl_54_fel_idx < nRC_Grid1 )
      {
         nGXsfl_54_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_fel_idx+1)) ;
         sGXsfl_54_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_fel_idx, 4, 0)), (short)(4), "0") ;
         edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_54_fel_idx ;
         subGrid2_Internalname = "GRID2_"+sGXsfl_54_fel_idx ;
         AV11D_GRD1_HIKENSHA = httpContext.cgiGet( edtavD_grd1_hikensha_Internalname) ;
         /* Start For Each Line in Grid2 */
         GXCCtl = "nRC_Grid2_" + sGXsfl_54_fel_idx ;
         nRC_Grid2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",")) ;
         nGXsfl_65_fel_idx = (short)(0) ;
         while ( nGXsfl_65_fel_idx < nRC_Grid2 )
         {
            nGXsfl_65_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_65_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_65_fel_idx+1)) ;
            sGXsfl_65_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_fel_idx, 4, 0)), (short)(4), "0") + sGXsfl_54_fel_idx ;
            chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_65_fel_idx );
            edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_65_fel_idx ;
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
            AV42GXV4 = 1 ;
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
            }
            /* End For Each Line */
         }
         if ( nGXsfl_65_fel_idx == 0 )
         {
            nGXsfl_65_idx = (short)(1) ;
            sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") + sGXsfl_54_idx ;
            chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_65_idx );
            edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_65_idx ;
         }
         nGXsfl_65_fel_idx = (short)(1) ;
         /* End For Each Line */
      }
      if ( nGXsfl_54_fel_idx == 0 )
      {
         nGXsfl_54_idx = (short)(1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_54_idx ;
         subGrid2_Internalname = "GRID2_"+sGXsfl_54_idx ;
      }
      nGXsfl_54_fel_idx = (short)(1) ;
      AV29W_TBW01_FREE_SAVE_1 = AV24W_B405_WP01_SD01.toxml(false, "B405_SD01", "SmartEDC_SHIZUOKA") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29W_TBW01_FREE_SAVE_1", AV29W_TBW01_FREE_SAVE_1);
   }

   public void S142( )
   {
      /* 'CRF_CHECK' Routine */
      AV24W_B405_WP01_SD01.fromxml(AV29W_TBW01_FREE_SAVE_1, "");
      AV43GXV5 = 1 ;
      while ( AV43GXV5 <= AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
      {
         AV25W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV43GXV5));
         AV44GXLvl338 = (byte)(0) ;
         /* Using cursor H001D5 */
         pr_default.execute(3, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id()), new Short(AV25W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id())});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A223TBM31_DEL_FLG = H001D5_A223TBM31_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
            n223TBM31_DEL_FLG = H001D5_n223TBM31_DEL_FLG[0] ;
            A551TBM31_STATUS = H001D5_A551TBM31_STATUS[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
            n551TBM31_STATUS = H001D5_n551TBM31_STATUS[0] ;
            A218TBM31_CRF_ID = H001D5_A218TBM31_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
            A217TBM31_STUDY_ID = H001D5_A217TBM31_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
            AV44GXLvl338 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( AV44GXLvl338 == 0 )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char3) ;
            b405_wp02_kanja_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV28W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV28W_MSG);
            tblTbl_list_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
            lblTxt_btn_reg_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
         }
         AV43GXV5 = (int)(AV43GXV5+1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV21W_A_LOGIN_SDT;
      GXv_char3[0] = AV26W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV21W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b405_wp02_kanja_crf_reg_impl.this.AV26W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV26W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      Form.getJscriptsrc().add("js/acom.js");
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV5BC_FREE_WORK.Load(AV20P_SESSION_ID, AV16P_APP_ID, AV18P_DISP_DATETIME, AV19P_SEL_LINE_NO);
      if ( AV5BC_FREE_WORK.Fail() )
      {
         GXt_char2 = AV27W_ERRMSG ;
         GXv_char3[0] = GXt_char2 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char3) ;
         b405_wp02_kanja_crf_reg_impl.this.GXt_char2 = GXv_char3[0] ;
         AV27W_ERRMSG = GXt_char2 ;
      }
      if ( GXutil.strcmp(AV27W_ERRMSG, "") == 0 )
      {
         AV24W_B405_WP01_SD01.fromxml(AV5BC_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1(), "");
         /* Using cursor H001D6 */
         pr_default.execute(4, new Object[] {new Long(AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id())});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A186TBM21_STUDY_ID = H001D6_A186TBM21_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
            A187TBM21_STUDY_NM = H001D6_A187TBM21_STUDY_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
            n187TBM21_STUDY_NM = H001D6_n187TBM21_STUDY_NM[0] ;
            AV13D_STUDY_NM = A187TBM21_STUDY_NM ;
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
      GXv_char3[0] = AV15H_KNGN_FLG ;
      GXv_char5[0] = AV26W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV8C_TAM02_APP_ID, GXv_char3, GXv_char5) ;
      b405_wp02_kanja_crf_reg_impl.this.AV15H_KNGN_FLG = GXv_char3[0] ;
      b405_wp02_kanja_crf_reg_impl.this.AV26W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
      if ( GXutil.strcmp(AV26W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S17486( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV33Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp02_kanja_crf_reg");
   }

   private void e171D4( )
   {
      /* Grid1_Load Routine */
      AV24W_B405_WP01_SD01.fromxml(AV29W_TBW01_FREE_SAVE_1, "");
      AV11D_GRD1_HIKENSHA = AV24W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Hikensha_id() ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(54) ;
      }
      if ( ( subGrid1_Islastpage == 1 ) || ( 2 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_544( ) ;
         GRID1_nEOF = (byte)(1) ;
         if ( ( subGrid1_Islastpage == 1 ) && ( ((int)(GRID1_nCurrentRecord) % (subgrid1_recordsperpage( ))) == 0 ) )
         {
            GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
         }
      }
      if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
      {
         GRID1_nEOF = (byte)(0) ;
      }
      GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
   }

   private void e181D5( )
   {
      /* Grid2_Load Routine */
      AV36GXV2 = 1 ;
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
            wbStart = (short)(65) ;
         }
         sendrow_655( ) ;
         AV36GXV2 = (int)(AV36GXV2+1) ;
      }
   }

   public void wb_table2_77_1D2( boolean wbgen )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_INIT_FLG", AV14H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV14H_INIT_FLG), GXutil.rtrim( localUtil.format( AV14H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(81);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_KNGN_FLG", AV15H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV15H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV15H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(82);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "<p>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "BTN_REG_EXEC", "", "", lblTextblock2_Jsonclick, "E\\'BTN_REG_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17P_COL_COUNT", GXutil.ltrim( GXutil.str( AV17P_COL_COUNT, 4, 0)));
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavP_col_count_Internalname, GXutil.ltrim( localUtil.ntoc( AV17P_COL_COUNT, (byte)(4), (byte)(0), ".", "")), localUtil.format( DecimalUtil.doubleToDec(AV17P_COL_COUNT), "ZZZ9"), "", "", "", "", "", edtavP_col_count_Jsonclick, 0, ClassString, StyleString, "", 1, 0, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "<p>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_TBW01_FREE_SAVE_1", AV29W_TBW01_FREE_SAVE_1);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtavW_tbw01_free_save_1_Internalname, AV29W_TBW01_FREE_SAVE_1, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(85);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "2097152", -1, "", true, "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "<p>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV30W_TBW01_FREE_SAVE_1_BAK", AV30W_TBW01_FREE_SAVE_1_BAK);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtavW_tbw01_free_save_1_bak_Internalname, AV30W_TBW01_FREE_SAVE_1_BAK, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(86);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "2097152", -1, "", true, "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</p>") ;
         httpContext.writeText( "<p></p>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_77_1D2e( true) ;
      }
      else
      {
         wb_table2_77_1D2e( false) ;
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "2c4dd041-bc05-4078-b5a7-f8ce2f3cf741", "", "Style2"))+"\"  style=\"width:10px\">") ;
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
         httpContext.writeText( " id=\""+"gxHTMLWrpW0009"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp1_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0009"+"");
            }
            WebComp_Webcomp1.componentdraw();
            if ( GXutil.strcmp(OldWebcomp1, WebComp_Webcomp1_Component) != 0 )
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
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table5_20_1D2( true) ;
      }
      else
      {
         wb_table5_20_1D2( false) ;
      }
      return  ;
   }

   public void wb_table5_20_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0075"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0075"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0075"+"");
            }
            WebComp_Webcomp2.componentdraw();
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
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

   public void wb_table5_20_1D2( boolean wbgen )
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
         wb_table6_26_1D2( true) ;
      }
      else
      {
         wb_table6_26_1D2( false) ;
      }
      return  ;
   }

   public void wb_table6_26_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"(Unknown)\"  style=\"width:964px\">") ;
         httpContext.writeText( "<div style=\"WIDTH: 964px; HEIGHT: 350px\" class=\"SectionScroll_NoLine\" id=\"Section1\">") ;
         wb_table7_34_1D2( true) ;
      }
      else
      {
         wb_table7_34_1D2( false) ;
      }
      return  ;
   }

   public void wb_table7_34_1D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_20_1D2e( true) ;
      }
      else
      {
         wb_table5_20_1D2e( false) ;
      }
   }

   public void wb_table7_34_1D2( boolean wbgen )
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
         httpContext.writeText( "<td valign=\"top\" colspan=\"2\" >") ;
         wb_table8_37_1D2( true) ;
      }
      else
      {
         wb_table8_37_1D2( false) ;
      }
      return  ;
   }

   public void wb_table8_37_1D2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"54\">") ;
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
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV11D_GRD1_HIKENSHA));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_hikensha_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_54_idx-1) ;
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
            GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            if ( httpContext.isAjaxRequest( ) )
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
         wb_table7_34_1D2e( true) ;
      }
      else
      {
         wb_table7_34_1D2e( false) ;
      }
   }

   public void wb_table8_37_1D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table9_40_1D2( true) ;
      }
      else
      {
         wb_table9_40_1D2( false) ;
      }
      return  ;
   }

   public void wb_table9_40_1D2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grd_titleContainer"+"DivS\" gxgridid=\"45\">") ;
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
            Grd_titleColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grd_titleColumn.AddObjectProperty("Value", GXutil.rtrim( AV9D_CRFSNM));
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleContainer.AddObjectProperty("Allowselection", "true");
            Grd_titleContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrd_title_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Allowhover", "true");
            Grd_titleContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrd_title_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Allowcollapsing", ((subGrd_title_Allowcollapsing==1) ? "true" : "false"));
            Grd_titleContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrd_title_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_Grd_title = (short)(nGXsfl_45_idx-1) ;
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
            GxWebStd.gx_hidden_field( httpContext, "Grd_titleContainerData", Grd_titleContainer.ToJavascriptSource());
            if ( httpContext.isAjaxRequest( ) )
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
         wb_table8_37_1D2e( true) ;
      }
      else
      {
         wb_table8_37_1D2e( false) ;
      }
   }

   public void wb_table9_40_1D2( boolean wbgen )
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
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "îÌå±é“ID", "", "", lblTextblock13_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_40_1D2e( true) ;
      }
      else
      {
         wb_table9_40_1D2e( false) ;
      }
   }

   public void wb_table6_26_1D2( boolean wbgen )
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
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "ééå±ñº", "", "", lblTextblock16_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13D_STUDY_NM", AV13D_STUDY_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_study_nm_Internalname, GXutil.rtrim( AV13D_STUDY_NM), GXutil.rtrim( localUtil.format( AV13D_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(31);\"", "", "", "", "", edtavD_study_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_study_nm_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_26_1D2e( true) ;
      }
      else
      {
         wb_table6_26_1D2e( false) ;
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
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "ìoò^ÅiF3Åj", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "ñﬂÇÈÅiF11Åj", "", "", lblTxt_btn_can_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP02_KANJA_CRF_REG.htm");
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
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1551775");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b405_wp02_kanja_crf_reg.js", "?1551775");
      /* End function include_jscripts */
   }

   public void sendrow_452( )
   {
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
         httpContext.ajax_rsp_assign_prop("", false, "Grd_titleContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrd_title_Backcolor, 9, 0)));
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
         httpContext.ajax_rsp_assign_prop("", false, "Grd_titleContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrd_title_Backcolor, 9, 0)));
      }
      else if ( subGrd_title_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrd_title_Backstyle = (byte)(1) ;
         if ( ((int)(nGXsfl_45_idx/ (double) (0)) % (2)) == 0 )
         {
            subGrd_title_Backcolor = (int)(0x0) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grd_titleContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrd_title_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrd_title_Class, "") != 0 )
            {
               subGrd_title_Linesclass = subGrd_title_Class+"Even" ;
            }
         }
         else
         {
            subGrd_title_Backcolor = (int)(0xFFFFFF) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grd_titleContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrd_title_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrd_title_Class, "") != 0 )
            {
               subGrd_title_Linesclass = subGrd_title_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      Grd_titleRow.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrd_title_Linesclass,""});
      Grd_titleRow.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      /* Table start */
      Grd_titleRow.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_in_grid_header2_Internalname+"_"+sGXsfl_45_idx,new Integer(1),"TableGridHeaderLM-1","","","","","","",new Integer(0),new Integer(1),new Integer(35),new Integer(150),"","px","px"});
      Grd_titleRow.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
      Grd_titleRow.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ClassString = "ReadonlyAttribute" ;
      StyleString = "font-family:'ÇlÇr ÇoÉSÉVÉbÉN'; font-size:10.0pt; font-weight:bold; font-style:normal;" ;
      ROClassString = ClassString ;
      Grd_titleRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_crfsnm_Internalname,GXutil.rtrim( AV9D_CRFSNM),"","","","","","",edtavD_crfsnm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(45),new Integer(1),new Integer(-1),new Boolean(true),"left"});
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
      nGXsfl_45_idx = (short)(((subGrd_title_Islastpage==1)&&(nGXsfl_45_idx+1>subgrd_title_recordsperpage( )) ? 1 : nGXsfl_45_idx+1)) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_45_idx, 4, 0)), (short)(4), "0") ;
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_45_idx ;
      /* End function sendrow_452 */
   }

   public void sendrow_655( )
   {
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
         httpContext.ajax_rsp_assign_prop("", false, "Grid2ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid2_Backcolor, 9, 0)));
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
         httpContext.ajax_rsp_assign_prop("", false, "Grid2ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid2_Backcolor, 9, 0)));
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)(nGXsfl_65_idx/ (double) (0)) % (2)) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid2ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid2_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            httpContext.ajax_rsp_assign_prop("", false, "Grid2ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid2_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      Grid2Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid2_Linesclass,""});
      Grid2Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      /* Table start */
      Grid2Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_in_grid3_Internalname+"_"+sGXsfl_65_idx,new Integer(1),"TableGridTLM-1","","","","","","",new Integer(0),new Integer(1),new Integer(31),new Integer(150),"","px","px"});
      Grid2Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
      /* Check box */
      TempTags = " " + ((chkavD_grd2_crf_status.getEnabled()!=0)&&(chkavD_grd2_crf_status.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_65_idx+"',65)\"" : " ") ;
      ClassString = "ReadonlyAttributeImeOff" ;
      StyleString = "" ;
      Grid2Row.AddColumnProperties("checkbox", 1, httpContext.isAjaxCallMode( ), new Object[] {chkavD_grd2_crf_status.getInternalname(),GXutil.booltostr( AV12D_GRD2_CRF_STATUS),"",new Integer(1),new Integer(chkavD_grd2_crf_status.getEnabled()),"true","",StyleString,ClassString,TempTags+((chkavD_grd2_crf_status.getEnabled()!=0)&&(chkavD_grd2_crf_status.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(71, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd2_crf_status.getEnabled()!=0)&&(chkavD_grd2_crf_status.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(71);\"" : " ")});
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
      TempTags = " " + ((edtavD_grd1_crf_id_Enabled!=0)&&(edtavD_grd1_crf_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'',false,'"+sGXsfl_65_idx+"',65)\"" : " ") ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid2Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd1_crf_id_Internalname,GXutil.ltrim( localUtil.ntoc( AV10D_GRD1_CRF_ID, (byte)(4), (byte)(0), ".", "")),((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10D_GRD1_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10D_GRD1_CRF_ID), "ZZZ9")),TempTags+((edtavD_grd1_crf_id_Enabled!=0)&&(edtavD_grd1_crf_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd1_crf_id_Enabled!=0)&&(edtavD_grd1_crf_id_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(72);\"" : " "),"","","","",edtavD_grd1_crf_id_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtavD_grd1_crf_id_Visible),new Integer(1),new Integer(0),new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Boolean(true),"right"});
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
      nGXsfl_65_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_65_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_65_idx+1)) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") + sGXsfl_54_idx ;
      chkavD_grd2_crf_status.setInternalname( "vD_GRD2_CRF_STATUS_"+sGXsfl_65_idx );
      edtavD_grd1_crf_id_Internalname = "vD_GRD1_CRF_ID_"+sGXsfl_65_idx ;
      /* End function sendrow_655 */
   }

   public void sendrow_544( )
   {
      wb1D0( ) ;
      if ( ( 2 * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
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
            httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)(nGXsfl_54_idx/ (double) (1)) % (2)) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               httpContext.ajax_rsp_assign_prop("", false, "Grid1ContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subGrid1_Backcolor, 9, 0)));
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         /* Start of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( ( 1 == 0 ) && ( nGXsfl_54_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_54_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)(nGXsfl_54_idx) % (1)) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_54_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grid_Internalname+"_"+sGXsfl_54_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_in_grid2_Internalname+"_"+sGXsfl_54_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),new Integer(31),new Integer(70),"","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_54_idx+"',54)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd1_hikensha_Internalname,GXutil.rtrim( AV11D_GRD1_HIKENSHA),"",TempTags+((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(63);\"" : " "),"","","","",edtavD_grd1_hikensha_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd1_hikensha_Enabled),new Integer(0),new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /*  Child Grid Control  */
         Grid1Row.AddColumnProperties("subfile", -1, httpContext.isAjaxCallMode( ), new Object[] {"Grid2Container"});
         if ( httpContext.isAjaxCallMode( ) )
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
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"65\">") ;
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
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.booltostr( AV12D_GRD2_CRF_STATUS));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavD_grd2_crf_status.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV10D_GRD1_CRF_ID, (byte)(4), (byte)(0), ".", "")));
            Grid2Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_crf_id_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", "true");
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", "true");
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", ((subGrid2_Allowcollapsing==1) ? "true" : "false"));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
         rf1D5( ) ;
         nRC_Grid2 = (short)(nGXsfl_65_idx-1) ;
         GXCCtl = "nRC_Grid2_" + sGXsfl_54_idx ;
         GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRC_Grid2, (byte)(4), (byte)(0), ".", "")));
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
         }
         else
         {
            GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_54_idx, Grid2Container.ToJavascriptSource());
            if ( httpContext.isAjaxCallMode( ) )
            {
               Grid1Row.AddGrid("Grid2", Grid2Container);
            }
            if ( httpContext.isAjaxRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_54_idx, Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_54_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'>") ;
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
               if ( ((int)(nGXsfl_54_idx) % (1)) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_54_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_idx+1)) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_54_idx ;
         subGrid2_Internalname = "GRID2_"+sGXsfl_54_idx ;
      }
      /* End function sendrow_544 */
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
      subGrid2_Internalname = "GRID2_"+sGXsfl_54_idx ;
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Borderwidth = (short)(0) ;
      edtavD_grd1_hikensha_Jsonclick = "" ;
      edtavD_grd1_hikensha_Visible = 1 ;
      subGrid1_Class = "FreeStyleGridBase" ;
      edtavD_grd1_crf_id_Jsonclick = "" ;
      edtavD_grd1_crf_id_Enabled = 1 ;
      edtavD_grd1_crf_id_Visible = 1 ;
      chkavD_grd2_crf_status.setVisible( 1 );
      chkavD_grd2_crf_status.setEnabled( 1 );
      subGrid2_Class = "FreeStyleGridBase" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtavD_crfsnm_Jsonclick = "" ;
      subGrd_title_Class = "FreeStyleGridBase" ;
      lblTxt_btn_reg_Visible = 1 ;
      edtavD_study_nm_Jsonclick = "" ;
      edtavD_study_nm_Enabled = 1 ;
      subGrd_title_Allowcollapsing = (byte)(0) ;
      subGrd_title_Borderwidth = (short)(0) ;
      subGrd_title_Backcolorstyle = (byte)(0) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd1_hikensha_Enabled = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      tblTbl_list_Width = 0 ;
      edtavP_col_count_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      tblTbl_list_Visible = 1 ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
                  /* Execute user subroutine: S17486 */
                  S17486 ();
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
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      A550TBM31_CRF_SNM = "" ;
      AV24W_B405_WP01_SD01 = new SdtB405_SD01(remoteHandle, context);
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
      edtavD_crfsnm_Internalname = "" ;
      AV9D_CRFSNM = "" ;
      edtavD_grd1_hikensha_Internalname = "" ;
      AV11D_GRD1_HIKENSHA = "" ;
      edtavD_grd1_crf_id_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grd_titleContainer = new com.genexus.webpanels.GXWebGrid(context);
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      AV33Pgmname = "" ;
      AV13D_STUDY_NM = "" ;
      AV14H_INIT_FLG = "" ;
      AV15H_KNGN_FLG = "" ;
      AV29W_TBW01_FREE_SAVE_1 = "" ;
      AV30W_TBW01_FREE_SAVE_1_BAK = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV21W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV25W_B405_WP01_SD01_CRF_ITEM = new SdtB405_SD01_CRF_Item(remoteHandle, context);
      scmdbuf = "" ;
      H001D2_A223TBM31_DEL_FLG = new String[] {""} ;
      H001D2_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H001D2_A551TBM31_STATUS = new String[] {""} ;
      H001D2_n551TBM31_STATUS = new boolean[] {false} ;
      H001D2_A218TBM31_CRF_ID = new short[1] ;
      H001D2_A217TBM31_STUDY_ID = new long[1] ;
      H001D2_A550TBM31_CRF_SNM = new String[] {""} ;
      H001D2_n550TBM31_CRF_SNM = new boolean[] {false} ;
      A223TBM31_DEL_FLG = "" ;
      A551TBM31_STATUS = "" ;
      AV28W_MSG = "" ;
      AV23W_A821_JS = "" ;
      H001D3_A294TBT02_CRF_ID = new short[1] ;
      H001D3_A293TBT02_SUBJECT_ID = new int[1] ;
      H001D3_A292TBT02_STUDY_ID = new long[1] ;
      AV6BC_TBT02_CRF = new SdtTBT02_CRF(remoteHandle);
      AV27W_ERRMSG = "" ;
      H001D4_A294TBT02_CRF_ID = new short[1] ;
      H001D4_A293TBT02_SUBJECT_ID = new int[1] ;
      H001D4_A292TBT02_STUDY_ID = new long[1] ;
      H001D5_A223TBM31_DEL_FLG = new String[] {""} ;
      H001D5_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H001D5_A551TBM31_STATUS = new String[] {""} ;
      H001D5_n551TBM31_STATUS = new boolean[] {false} ;
      H001D5_A218TBM31_CRF_ID = new short[1] ;
      H001D5_A217TBM31_STUDY_ID = new long[1] ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV26W_ERRCD = "" ;
      AV5BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      H001D6_A186TBM21_STUDY_ID = new long[1] ;
      H001D6_A187TBM21_STUDY_NM = new String[] {""} ;
      H001D6_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      AV22W_A819_JS = "" ;
      GXv_char3 = new String [1] ;
      GXv_char5 = new String [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock2_Jsonclick = "" ;
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
      GXt_char1 = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char2 = "" ;
      GXt_char6 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b405_wp02_kanja_crf_reg__default(),
         new Object[] {
             new Object[] {
            H001D2_A223TBM31_DEL_FLG, H001D2_n223TBM31_DEL_FLG, H001D2_A551TBM31_STATUS, H001D2_n551TBM31_STATUS, H001D2_A218TBM31_CRF_ID, H001D2_A217TBM31_STUDY_ID, H001D2_A550TBM31_CRF_SNM, H001D2_n550TBM31_CRF_SNM
            }
            , new Object[] {
            H001D3_A294TBT02_CRF_ID, H001D3_A293TBT02_SUBJECT_ID, H001D3_A292TBT02_STUDY_ID
            }
            , new Object[] {
            H001D4_A294TBT02_CRF_ID, H001D4_A293TBT02_SUBJECT_ID, H001D4_A292TBT02_STUDY_ID
            }
            , new Object[] {
            H001D5_A223TBM31_DEL_FLG, H001D5_n223TBM31_DEL_FLG, H001D5_A551TBM31_STATUS, H001D5_n551TBM31_STATUS, H001D5_A218TBM31_CRF_ID, H001D5_A217TBM31_STUDY_ID
            }
            , new Object[] {
            H001D6_A186TBM21_STUDY_ID, H001D6_A187TBM21_STUDY_NM, H001D6_n187TBM21_STUDY_NM
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
   private byte AV39GXLvl216 ;
   private byte AV44GXLvl338 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrd_title_Backcolorstyle ;
   private byte subGrd_title_Allowcollapsing ;
   private byte subGrd_title_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrd_title_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private short wcpOAV17P_COL_COUNT ;
   private short wcpOAV19P_SEL_LINE_NO ;
   private short nRC_Grd_title ;
   private short nGXsfl_45_idx=1 ;
   private short nRC_Grid2 ;
   private short nGXsfl_65_idx=1 ;
   private short nRC_Grid1 ;
   private short nGXsfl_54_idx=1 ;
   private short AV17P_COL_COUNT ;
   private short AV19P_SEL_LINE_NO ;
   private short A218TBM31_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV10D_GRD1_CRF_ID ;
   private short nCmpId ;
   private short Gx_err ;
   private short A294TBT02_CRF_ID ;
   private short nGXsfl_54_fel_idx=1 ;
   private short nGXsfl_65_fel_idx=1 ;
   private short subGrid1_Borderwidth ;
   private short subGrd_title_Borderwidth ;
   private short subGrid2_Borderwidth ;
   private int GRID1_nFirstRecordOnPage ;
   private int subGrd_title_Islastpage ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int GRID1_IsPaging ;
   private int edtavD_study_nm_Enabled ;
   private int edtavD_grd1_hikensha_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int tblTbl_list_Width ;
   private int AV34GXV1 ;
   private int lblTxt_btn_reg_Visible ;
   private int AV37GXV3 ;
   private int A293TBT02_SUBJECT_ID ;
   private int AV42GXV4 ;
   private int AV43GXV5 ;
   private int tblTbl_list_Visible ;
   private int GXActiveErrHndl ;
   private int GRID1_nCurrentRecord ;
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
   private long A217TBM31_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_45_idx="0001" ;
   private String sGXsfl_65_idx="0001" ;
   private String sGXsfl_54_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXKey ;
   private String GXEncryptionTmp ;
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
   private String subGrid2_Internalname ;
   private String edtavD_grd1_crf_id_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV33Pgmname ;
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
   private String sGXsfl_54_fel_idx="0001" ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String lblTxt_btn_reg_Internalname ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavP_col_count_Internalname ;
   private String edtavP_col_count_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable4_Internalname ;
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
   private String subGrd_title_Class ;
   private String subGrd_title_Linesclass ;
   private String tblTbl_in_grid_header2_Internalname ;
   private String ROClassString ;
   private String edtavD_crfsnm_Jsonclick ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String tblTbl_in_grid3_Internalname ;
   private String edtavD_grd1_crf_id_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_Internalname ;
   private String tblTbl_in_grid2_Internalname ;
   private String GXt_char1 ;
   private String edtavD_grd1_hikensha_Jsonclick ;
   private String GXt_char2 ;
   private String GXt_char6 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV12D_GRD2_CRF_STATUS ;
   private boolean returnInSub ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n551TBM31_STATUS ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n187TBM21_STUDY_NM ;
   private String AV29W_TBW01_FREE_SAVE_1 ;
   private String AV30W_TBW01_FREE_SAVE_1_BAK ;
   private String wcpOAV20P_SESSION_ID ;
   private String wcpOAV16P_APP_ID ;
   private String wcpOAV18P_DISP_DATETIME ;
   private String AV20P_SESSION_ID ;
   private String AV16P_APP_ID ;
   private String AV18P_DISP_DATETIME ;
   private String A550TBM31_CRF_SNM ;
   private String AV9D_CRFSNM ;
   private String AV11D_GRD1_HIKENSHA ;
   private String AV13D_STUDY_NM ;
   private String AV14H_INIT_FLG ;
   private String AV15H_KNGN_FLG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV7C_GAMEN_TITLE ;
   private String A223TBM31_DEL_FLG ;
   private String A551TBM31_STATUS ;
   private String AV28W_MSG ;
   private String AV23W_A821_JS ;
   private String AV27W_ERRMSG ;
   private String AV26W_ERRCD ;
   private String A187TBM21_STUDY_NM ;
   private String AV22W_A819_JS ;
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
   private String[] H001D2_A223TBM31_DEL_FLG ;
   private boolean[] H001D2_n223TBM31_DEL_FLG ;
   private String[] H001D2_A551TBM31_STATUS ;
   private boolean[] H001D2_n551TBM31_STATUS ;
   private short[] H001D2_A218TBM31_CRF_ID ;
   private long[] H001D2_A217TBM31_STUDY_ID ;
   private String[] H001D2_A550TBM31_CRF_SNM ;
   private boolean[] H001D2_n550TBM31_CRF_SNM ;
   private short[] H001D3_A294TBT02_CRF_ID ;
   private int[] H001D3_A293TBT02_SUBJECT_ID ;
   private long[] H001D3_A292TBT02_STUDY_ID ;
   private short[] H001D4_A294TBT02_CRF_ID ;
   private int[] H001D4_A293TBT02_SUBJECT_ID ;
   private long[] H001D4_A292TBT02_STUDY_ID ;
   private String[] H001D5_A223TBM31_DEL_FLG ;
   private boolean[] H001D5_n223TBM31_DEL_FLG ;
   private String[] H001D5_A551TBM31_STATUS ;
   private boolean[] H001D5_n551TBM31_STATUS ;
   private short[] H001D5_A218TBM31_CRF_ID ;
   private long[] H001D5_A217TBM31_STUDY_ID ;
   private long[] H001D6_A186TBM21_STUDY_ID ;
   private String[] H001D6_A187TBM21_STUDY_NM ;
   private boolean[] H001D6_n187TBM21_STUDY_NM ;
   private SdtTBW01_FREE_WORK AV5BC_FREE_WORK ;
   private SdtTBT02_CRF AV6BC_TBT02_CRF ;
   private SdtA_LOGIN_SDT AV21W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtB405_SD01 AV24W_B405_WP01_SD01 ;
   private SdtB405_SD01_CRF_Item AV25W_B405_WP01_SD01_CRF_ITEM ;
}

final  class b405_wp02_kanja_crf_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001D2", "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1') AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001D3", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001D4", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001D5", "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1') AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001D6", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               break;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

