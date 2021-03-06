/*
               File: b402_wp06_study_staff_auth_sel_impl
        Description: ±o^iQÁX^bt ÀIðj
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:4:0.85
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp06_study_staff_auth_sel_impl extends GXWebPanel
{
   public b402_wp06_study_staff_auth_sel_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp06_study_staff_auth_sel_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp06_study_staff_auth_sel_impl.class ));
   }

   public b402_wp06_study_staff_auth_sel_impl( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavD_grd_check = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_Grid1 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_144_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_144_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_144_idx, sGXsfl_144_idx) ;
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
            AV15P_APP_ID = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15P_APP_ID", AV15P_APP_ID);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV16P_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16P_DISP_DATETIME", AV16P_DISP_DATETIME);
               AV17P_LINE_NO = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17P_LINE_NO", GXutil.ltrim( GXutil.str( AV17P_LINE_NO, 10, 0)));
               AV19P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19P_STUDY_ID", GXutil.ltrim( GXutil.str( AV19P_STUDY_ID, 10, 0)));
               AV18P_SITE_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18P_SITE_ID", AV18P_SITE_ID);
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
         pa1B2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1B2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1B2( ) ;
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
      httpContext.writeText( "±o^iQÁX^bt ÀIðj") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV15P_APP_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16P_DISP_DATETIME)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_LINE_NO,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_SITE_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b402_wp06_study_staff_auth_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1B2( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV14H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DISP_DATETIME", GXutil.rtrim( AV11H_DISP_DATETIME));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_APP_ID", GXutil.rtrim( AV15P_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "vP_DISP_DATETIME", GXutil.rtrim( AV16P_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "vP_LINE_NO", GXutil.ltrim( localUtil.ntoc( AV17P_LINE_NO, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV19P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_SITE_ID", GXutil.rtrim( AV18P_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV6C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "TBW01_FREE_SAVE_1", A599TBW01_FREE_SAVE_1);
      GxWebStd.gx_hidden_field( httpContext, "vW_TOP_LINE_NO", GXutil.ltrim( localUtil.ntoc( AV31W_TOP_LINE_NO, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(3), (byte)(0), ".", "")));
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
         wb_table2_158_1B2( true) ;
      }
      else
      {
         wb_table2_158_1B2( false) ;
      }
      return  ;
   }

   public void wb_table2_158_1B2e( boolean wbgen )
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
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "±o^iQÁX^bt ÀIðj", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0156") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0156", "");
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
               /* Check if conditions changed and reset current page numbers */
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV14H_SRCH_FLG) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DISP_DATETIME"), AV11H_DISP_DATETIME) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121B2 */
                        e121B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131B2 */
                        e131B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141B2 */
                        e141B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151B2 */
                        e151B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161B2 */
                        e161B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171B2 */
                        e171B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181B2 */
                        e181B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191B2 */
                        e191B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201B2 */
                        e201B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211B2 */
                        e211B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221B2 */
                        e221B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231B2 */
                        e231B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241B2 */
                        e241B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251B2 */
                        e251B2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261B2 */
                        e261B2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_144_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
                        chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_144_idx );
                        edtavD_grd_auth_nm_Internalname = "vD_GRD_AUTH_NM_"+sGXsfl_144_idx ;
                        edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_144_idx ;
                        AV9D_GRD_CHECK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_check.getInternalname())) ;
                        AV8D_GRD_AUTH_NM = httpContext.cgiGet( edtavD_grd_auth_nm_Internalname) ;
                        A598TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0156") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0156", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0156") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0156", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e271B2 */
                              e271B2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e281B2 */
                              e281B2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e291B2 */
                              e291B2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 /* Set Refresh If H_srch_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV14H_SRCH_FLG) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_disp_datetime Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DISP_DATETIME"), AV11H_DISP_DATETIME) != 0 )
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
                  else if ( nCmpId == 156 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0156") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0156", "", sEvt);
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
                  AV15P_APP_ID = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15P_APP_ID", AV15P_APP_ID);
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV16P_DISP_DATETIME = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16P_DISP_DATETIME", AV16P_DISP_DATETIME);
                     AV17P_LINE_NO = GXutil.lval( httpContext.GetNextPar( )) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV17P_LINE_NO", GXutil.ltrim( GXutil.str( AV17P_LINE_NO, 10, 0)));
                     AV19P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV19P_STUDY_ID", GXutil.ltrim( GXutil.str( AV19P_STUDY_ID, 10, 0)));
                     AV18P_SITE_ID = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18P_SITE_ID", AV18P_SITE_ID);
                  }
               }
            }
         }
         GXCCtl = "vD_GRD_CHECK_" + sGXsfl_144_idx ;
         chkavD_grd_check.setName( GXCCtl );
         chkavD_grd_check.setWebtags( "" );
         chkavD_grd_check.setCaption( "" );
         chkavD_grd_check.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_144_idx ,
                                 String sGXsfl_144_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_144_idx );
      edtavD_grd_auth_nm_Internalname = "vD_GRD_AUTH_NM_"+sGXsfl_144_idx ;
      edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_144_idx ;
      while ( nGXsfl_144_idx <= nRC_Grid1 )
      {
         sendrow_1442( ) ;
         nGXsfl_144_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_144_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_144_idx+1)) ;
         sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
         chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_144_idx );
         edtavD_grd_auth_nm_Internalname = "vD_GRD_AUTH_NM_"+sGXsfl_144_idx ;
         edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_144_idx ;
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
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(144) ;
      nGXsfl_144_idx = (short)(1) ;
      sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
      chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_144_idx );
      edtavD_grd_auth_nm_Internalname = "vD_GRD_AUTH_NM_"+sGXsfl_144_idx ;
      edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_144_idx ;
      /* Execute user event: e281B2 */
      e281B2 ();
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
         chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_144_idx );
         edtavD_grd_auth_nm_Internalname = "vD_GRD_AUTH_NM_"+sGXsfl_144_idx ;
         edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_144_idx ;
         /* Using cursor H001B2 */
         pr_default.execute(0, new Object[] {AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV6C_APP_ID, AV11H_DISP_DATETIME, AV14H_SRCH_FLG});
         nGXsfl_144_idx = (short)(1) ;
         GRID1_nEOF = (byte)(0) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            A599TBW01_FREE_SAVE_1 = H001B2_A599TBW01_FREE_SAVE_1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A599TBW01_FREE_SAVE_1", A599TBW01_FREE_SAVE_1);
            n599TBW01_FREE_SAVE_1 = H001B2_n599TBW01_FREE_SAVE_1[0] ;
            A597TBW01_DISP_DATETIME = H001B2_A597TBW01_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597TBW01_DISP_DATETIME", A597TBW01_DISP_DATETIME);
            A596TBW01_APP_ID = H001B2_A596TBW01_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A596TBW01_APP_ID", A596TBW01_APP_ID);
            A595TBW01_SESSION_ID = H001B2_A595TBW01_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A595TBW01_SESSION_ID", A595TBW01_SESSION_ID);
            A598TBW01_LINE_NO = H001B2_A598TBW01_LINE_NO[0] ;
            /* Execute user event: e291B2 */
            e291B2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(144) ;
         wb1B0( ) ;
      }
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)(GRID1_nRecordCount) % (subgrid1_recordsperpage( ))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      /* Using cursor H001B3 */
      pr_default.execute(1, new Object[] {AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV6C_APP_ID, AV11H_DISP_DATETIME, AV14H_SRCH_FLG});
      GRID1_nRecordCount = H001B3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return GRID1_nRecordCount ;
   }

   public int subgrid1_recordsperpage( )
   {
      if ( 10 > 0 )
      {
         if ( 1 > 0 )
         {
            return 10*1 ;
         }
         else
         {
            return 10 ;
         }
      }
      return -1 ;
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
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(0) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
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
         if ( ((int)(GRID1_nRecordCount) % (subgrid1_recordsperpage( ))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (int)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (int)(GRID1_nRecordCount-((int)(GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) ;
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
         GRID1_nFirstRecordOnPage = (int)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      return 0 ;
   }

   public void strup1B0( )
   {
      /* Before Start, stand alone formulas. */
      AV64Pgmname = "B402_WP06_STUDY_STAFF_AUTH_SEL" ;
      AV63Pgmdesc = "±o^iQÁX^bt ÀIðj" ;
      Gx_err = (short)(0) ;
      edtavD_grd_auth_nm_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e271B2 */
      e271B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV10H_A_PAGING_SDT);
         /* Read variables values. */
         AV12H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         AV14H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_SRCH_FLG", AV14H_SRCH_FLG);
         AV13H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         AV11H_DISP_DATETIME = httpContext.cgiGet( edtavH_disp_datetime_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_DISP_DATETIME", AV11H_DISP_DATETIME);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_PAGE");
            GX_FocusControl = edtavCtlmax_page_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",")) );
         }
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_NO");
            GX_FocusControl = edtavCtlpage_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE01");
            GX_FocusControl = edtavCtlpage01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE02");
            GX_FocusControl = edtavCtlpage02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE03");
            GX_FocusControl = edtavCtlpage03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE04");
            GX_FocusControl = edtavCtlpage04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE05");
            GX_FocusControl = edtavCtlpage05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE06");
            GX_FocusControl = edtavCtlpage06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE07");
            GX_FocusControl = edtavCtlpage07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE08");
            GX_FocusControl = edtavCtlpage08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE09");
            GX_FocusControl = edtavCtlpage09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE10");
            GX_FocusControl = edtavCtlpage10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP01");
            GX_FocusControl = edtavCtlpage_disp01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP02");
            GX_FocusControl = edtavCtlpage_disp02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP03");
            GX_FocusControl = edtavCtlpage_disp03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP04");
            GX_FocusControl = edtavCtlpage_disp04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP05");
            GX_FocusControl = edtavCtlpage_disp05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP06");
            GX_FocusControl = edtavCtlpage_disp06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP07");
            GX_FocusControl = edtavCtlpage_disp07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP08");
            GX_FocusControl = edtavCtlpage_disp08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP09");
            GX_FocusControl = edtavCtlpage_disp09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP10");
            GX_FocusControl = edtavCtlpage_disp10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_BACK");
            GX_FocusControl = edtavCtlpage_disp_back_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_NEXT");
            GX_FocusControl = edtavCtlpage_disp_next_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_first_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_first_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_FIRST");
            GX_FocusControl = edtavCtlpage_disp_first_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_first( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_first( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_first_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_last_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_last_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_LAST");
            GX_FocusControl = edtavCtlpage_disp_last_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_last( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_last( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_last_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_AREA");
            GX_FocusControl = edtavCtlpage_disp_area_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(0) );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV15P_APP_ID = httpContext.cgiGet( "vP_APP_ID") ;
         AV16P_DISP_DATETIME = httpContext.cgiGet( "vP_DISP_DATETIME") ;
         AV17P_LINE_NO = localUtil.ctol( httpContext.cgiGet( "vP_LINE_NO"), ".", ",") ;
         AV19P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV18P_SITE_ID = httpContext.cgiGet( "vP_SITE_ID") ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0156") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0156", "");
         }
         subGrid1_Rows = (short)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
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
      /* Execute user event: e271B2 */
      e271B2 ();
      if (returnInSub) return;
   }

   public void e271B2( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B402" ;
      AV7C_GAMEN_TITLE = AV63Pgmdesc ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV12H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      AV27W_GRID_READ_FLG = false ;
      if ( (GXutil.strcmp("", AV11H_DISP_DATETIME)==0) )
      {
         GXt_char2 = AV11H_DISP_DATETIME ;
         GXv_char3[0] = GXt_char2 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char3) ;
         b402_wp06_study_staff_auth_sel_impl.this.GXt_char2 = GXv_char3[0] ;
         AV11H_DISP_DATETIME = GXt_char2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_DISP_DATETIME", AV11H_DISP_DATETIME);
      }
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV20W_A_LOGIN_SDT,AV6C_APP_ID,AV7C_GAMEN_TITLE,AV11H_DISP_DATETIME});
         WebComp_Webcomp1.componentbind(new Object[] {"","","","vH_DISP_DATETIME"});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0156",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e281B2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV12H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV64Pgmname, "INFO", "æÊN®") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      AV12H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
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
      AV31W_TOP_LINE_NO = (long)(subGrid1_Rows*(subgrid1_currentpage( )-1)+1) ;
   }

   private void e291B2( )
   {
      /* Grid1_Load Routine */
      if ( A598TBW01_LINE_NO >= AV31W_TOP_LINE_NO )
      {
         edtTBW01_LINE_NO_Visible = 0 ;
         AV30W_STUDY_STAFF_AUTH.fromxml(A599TBW01_FREE_SAVE_1, "");
         AV9D_GRD_CHECK = AV30W_STUDY_STAFF_AUTH.getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check() ;
         AV8D_GRD_AUTH_NM = AV30W_STUDY_STAFF_AUTH.getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm() ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(144) ;
      }
      if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_1442( ) ;
      }
      GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
   }

   public void e111B2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV13H_KNGN_FLG, "") )
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char3[0] = AV24W_ERR_MSG ;
         new b402_pc13_study_staff_auth_work_chk(remoteHandle, context).execute( AV6C_APP_ID, AV11H_DISP_DATETIME, GXv_int4, GXv_char3) ;
         b402_wp06_study_staff_auth_sel_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         b402_wp06_study_staff_auth_sel_impl.this.AV24W_ERR_MSG = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_DISP_DATETIME", AV11H_DISP_DATETIME);
         if ( AV23W_ERR_CD == 0 )
         {
            GXv_int4[0] = AV23W_ERR_CD ;
            GXv_char3[0] = AV24W_ERR_MSG ;
            new b402_pc14_study_staff_auth_work_reg(remoteHandle, context).execute( AV6C_APP_ID, AV11H_DISP_DATETIME, AV15P_APP_ID, AV16P_DISP_DATETIME, AV17P_LINE_NO, GXv_int4, GXv_char3) ;
            b402_wp06_study_staff_auth_sel_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
            b402_wp06_study_staff_auth_sel_impl.this.AV24W_ERR_MSG = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11H_DISP_DATETIME", AV11H_DISP_DATETIME);
            httpContext.ajax_rsp_assign_attri("", false, "AV15P_APP_ID", AV15P_APP_ID);
            httpContext.ajax_rsp_assign_attri("", false, "AV16P_DISP_DATETIME", AV16P_DISP_DATETIME);
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_LINE_NO", GXutil.ltrim( GXutil.str( AV17P_LINE_NO, 10, 0)));
         }
         if ( AV23W_ERR_CD == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp06_study_staff_auth_sel");
            new b805_pc01_work_del(remoteHandle, context).execute( AV6C_APP_ID, AV11H_DISP_DATETIME) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11H_DISP_DATETIME", AV11H_DISP_DATETIME);
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_SITE_ID)) ;
            httpContext.wjLoc = formatLink("b402_wp05_study_staff_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp06_study_staff_auth_sel");
            httpContext.GX_msglist.addItem(AV24W_ERR_MSG);
         }
      }
   }

   public void e121B2( )
   {
      /* 'BTN_CAN' Routine */
      new b805_pc01_work_del(remoteHandle, context).execute( AV6C_APP_ID, AV11H_DISP_DATETIME) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_DISP_DATETIME", AV11H_DISP_DATETIME);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV19P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18P_SITE_ID)) ;
      httpContext.wjLoc = formatLink("b402_wp05_study_staff_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      AV5BC_FREE_WORK.Load(AV20W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV15P_APP_ID, AV16P_DISP_DATETIME, AV17P_LINE_NO);
      if ( AV5BC_FREE_WORK.Fail() )
      {
         GXt_char2 = AV28W_MSG ;
         GXv_char3[0] = GXt_char2 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char3) ;
         b402_wp06_study_staff_auth_sel_impl.this.GXt_char2 = GXv_char3[0] ;
         AV28W_MSG = GXt_char2 ;
         httpContext.GX_msglist.addItem(AV28W_MSG);
      }
      else
      {
         AV29W_STUDY_STAFF.fromxml(AV5BC_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1(), "");
         lblTxt_user_Caption = AV29W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_User_nm() ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_user_Internalname, "Caption", lblTxt_user_Caption);
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char3[0] = AV24W_ERR_MSG ;
         new b402_pc11_study_staff_auth_work_init(remoteHandle, context).execute( AV6C_APP_ID, AV11H_DISP_DATETIME, AV29W_STUDY_STAFF, GXv_int4, GXv_char3) ;
         b402_wp06_study_staff_auth_sel_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         b402_wp06_study_staff_auth_sel_impl.this.AV24W_ERR_MSG = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_DISP_DATETIME", AV11H_DISP_DATETIME);
         if ( AV23W_ERR_CD == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp06_study_staff_auth_sel");
         }
         else
         {
            httpContext.GX_msglist.addItem(AV24W_ERR_MSG);
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp06_study_staff_auth_sel");
         }
      }
   }

   public void S152( )
   {
      /* 'SUB_GRID_TO_WORK' Routine */
      if ( ! AV27W_GRID_READ_FLG )
      {
         AV27W_GRID_READ_FLG = true ;
         AV30W_STUDY_STAFF_AUTH = (SdtB402_SD03_STUDY_STAFF_AUTH)new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
         /* Start For Each Line in Grid1 */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         nGXsfl_144_fel_idx = (short)(0) ;
         while ( nGXsfl_144_fel_idx < nRC_Grid1 )
         {
            nGXsfl_144_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_144_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_144_fel_idx+1)) ;
            sGXsfl_144_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_144_fel_idx );
            edtavD_grd_auth_nm_Internalname = "vD_GRD_AUTH_NM_"+sGXsfl_144_fel_idx ;
            edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_144_fel_idx ;
            AV9D_GRD_CHECK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_check.getInternalname())) ;
            AV8D_GRD_AUTH_NM = httpContext.cgiGet( edtavD_grd_auth_nm_Internalname) ;
            A598TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") ;
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0156") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0156", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0156") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0156", "");
            }
            AV30W_STUDY_STAFF_AUTH.setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( AV9D_GRD_CHECK );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30W_STUDY_STAFF_AUTH", AV30W_STUDY_STAFF_AUTH);
            GXv_int4[0] = AV23W_ERR_CD ;
            GXv_char3[0] = AV24W_ERR_MSG ;
            new b402_pc12_study_staff_auth_work_upd(remoteHandle, context).execute( AV6C_APP_ID, AV11H_DISP_DATETIME, A598TBW01_LINE_NO, AV30W_STUDY_STAFF_AUTH, GXv_int4, GXv_char3) ;
            b402_wp06_study_staff_auth_sel_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
            b402_wp06_study_staff_auth_sel_impl.this.AV24W_ERR_MSG = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11H_DISP_DATETIME", AV11H_DISP_DATETIME);
            if ( AV23W_ERR_CD != 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_144_fel_idx == 0 )
         {
            nGXsfl_144_idx = (short)(1) ;
            sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
            chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_144_idx );
            edtavD_grd_auth_nm_Internalname = "vD_GRD_AUTH_NM_"+sGXsfl_144_idx ;
            edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_144_idx ;
         }
         nGXsfl_144_fel_idx = (short)(1) ;
         if ( AV23W_ERR_CD == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp06_study_staff_auth_sel");
         }
         else
         {
            httpContext.GX_msglist.addItem(AV24W_ERR_MSG);
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp06_study_staff_auth_sel");
         }
      }
   }

   public void S162( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV20W_A_LOGIN_SDT;
      GXv_char3[0] = AV25W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char3) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b402_wp06_study_staff_auth_sel_impl.this.AV25W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV25W_ERRCD, "0") != 0 )
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
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV14H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_SRCH_FLG", AV14H_SRCH_FLG);
      AV21W_A819_JS = "" ;
   }

   public void S182( )
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

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char3[0] = AV13H_KNGN_FLG ;
      GXv_char6[0] = AV25W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char3, GXv_char6) ;
      b402_wp06_study_staff_auth_sel_impl.this.AV13H_KNGN_FLG = GXv_char3[0] ;
      b402_wp06_study_staff_auth_sel_impl.this.AV25W_ERRCD = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      if ( GXutil.strcmp(AV25W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S20362( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV64Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp06_study_staff_auth_sel");
   }

   public void e131B2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e141B2( )
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

   public void e151B2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e161B2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e171B2( )
   {
      /* 'PAGE01' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e181B2( )
   {
      /* 'PAGE02' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e191B2( )
   {
      /* 'PAGE03' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201B2( )
   {
      /* 'PAGE04' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211B2( )
   {
      /* 'PAGE05' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221B2( )
   {
      /* 'PAGE06' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231B2( )
   {
      /* 'PAGE07' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241B2( )
   {
      /* 'PAGE08' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251B2( )
   {
      /* 'PAGE09' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261B2( )
   {
      /* 'PAGE10' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( subGrid1_Rows );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT7[0] = AV10H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT7) ;
      AV10H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT7[0] ;
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
         if ( ( GXutil.strcmp(AV14H_SRCH_FLG, "1") == 0 ) && ! AV26W_ERRFLG )
         {
            GXt_char2 = AV28W_MSG ;
            GXv_char6[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char6) ;
            b402_wp06_study_staff_auth_sel_impl.this.GXt_char2 = GXv_char6[0] ;
            AV28W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
      }
      else
      {
         tblTbl_list_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(S"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+")" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S172( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      GXt_boolean8 = false ;
      GXv_boolean9[0] = GXt_boolean8 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV13H_KNGN_FLG, "", GXv_boolean9) ;
      b402_wp06_study_staff_auth_sel_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean8 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
   }

   public void wb_table2_158_1B2( boolean wbgen )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(162);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_SRCH_FLG", AV14H_SRCH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV14H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV14H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(163);\"", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV13H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV13H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(164);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_DISP_DATETIME", AV11H_DISP_DATETIME);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_disp_datetime_Internalname, GXutil.rtrim( AV11H_DISP_DATETIME), GXutil.rtrim( localUtil.format( AV11H_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(165);\"", "", "", "", "", edtavH_disp_datetime_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         wb_table3_166_1B2( true) ;
      }
      else
      {
         wb_table3_166_1B2( false) ;
      }
      return  ;
   }

   public void wb_table3_166_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_158_1B2e( true) ;
      }
      else
      {
         wb_table2_158_1B2e( false) ;
      }
   }

   public void wb_table3_166_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(171);\"", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "MAX_PAGE", "", "", lblTextblock2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_page_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(176);\"", "", "", "", "", edtavCtlmax_page_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "REC_CNT", "", "", lblTextblock3_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(181);\"", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "PAGE_NO", "", "", lblTextblock4_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(186);\"", "", "", "", "", edtavCtlpage_no_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "PAGE01", "", "", lblTextblock5_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage01_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(191);\"", "", "", "", "", edtavCtlpage01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "PAGE02", "", "", lblTextblock6_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage02_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(196);\"", "", "", "", "", edtavCtlpage02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "PAGE03", "", "", lblTextblock7_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage03_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(201);\"", "", "", "", "", edtavCtlpage03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "PAGE04", "", "", lblTextblock8_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage04_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(206);\"", "", "", "", "", edtavCtlpage04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "PAGE05", "", "", lblTextblock9_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage05_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(211);\"", "", "", "", "", edtavCtlpage05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "PAGE06", "", "", lblTextblock10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage06_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(216);\"", "", "", "", "", edtavCtlpage06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, "PAGE07", "", "", lblTextblock11_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage07_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(221);\"", "", "", "", "", edtavCtlpage07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, "PAGE08", "", "", lblTextblock12_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage08_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(226);\"", "", "", "", "", edtavCtlpage08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, "PAGE09", "", "", lblTextblock14_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage09_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(231);\"", "", "", "", "", edtavCtlpage09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "PAGE10", "", "", lblTextblock15_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()", GXutil.ltrim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage10_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(236);\"", "", "", "", "", edtavCtlpage10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "PAGE_DISP01", "", "", lblTextblock17_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp01_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(241);\"", "", "", "", "", edtavCtlpage_disp01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, "PAGE_DISP02", "", "", lblTextblock19_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp02_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(246);\"", "", "", "", "", edtavCtlpage_disp02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, "PAGE_DISP03", "", "", lblTextblock20_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp03_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(251);\"", "", "", "", "", edtavCtlpage_disp03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, "PAGE_DISP04", "", "", lblTextblock21_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp04_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(256);\"", "", "", "", "", edtavCtlpage_disp04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, "PAGE_DISP05", "", "", lblTextblock22_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp05_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(261);\"", "", "", "", "", edtavCtlpage_disp05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, "PAGE_DISP06", "", "", lblTextblock23_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp06_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(266);\"", "", "", "", "", edtavCtlpage_disp06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, "PAGE_DISP07", "", "", lblTextblock24_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp07_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(271);\"", "", "", "", "", edtavCtlpage_disp07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, "PAGE_DISP08", "", "", lblTextblock25_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp08_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(276);\"", "", "", "", "", edtavCtlpage_disp08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, "PAGE_DISP09", "", "", lblTextblock26_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp09_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(281);\"", "", "", "", "", edtavCtlpage_disp09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, "PAGE_DISP10", "", "", lblTextblock27_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp10_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(286);\"", "", "", "", "", edtavCtlpage_disp10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "PAGE_DISP_BACK", "", "", lblTextblock28_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_back_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(291);\"", "", "", "", "", edtavCtlpage_disp_back_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "PAGE_DISP_NEXT", "", "", lblTextblock29_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_next_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(296);\"", "", "", "", "", edtavCtlpage_disp_next_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "PAGE_DISP_FIRST", "", "", lblTextblock30_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_first_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(301);\"", "", "", "", "", edtavCtlpage_disp_first_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "PAGE_DISP_LAST", "", "", lblTextblock31_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_last_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(306);\"", "", "", "", "", edtavCtlpage_disp_last_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "PAGE_DISP_AREA", "", "", lblTextblock32_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'" + sGXsfl_144_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_area_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(311);\"", "", "", "", "", edtavCtlpage_disp_area_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_166_1B2e( true) ;
      }
      else
      {
         wb_table3_166_1B2e( false) ;
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
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", "Style2"))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table4_6_1B2( true) ;
      }
      else
      {
         wb_table4_6_1B2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1B2e( boolean wbgen )
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
         wb_table1_2_1B2e( true) ;
      }
      else
      {
         wb_table1_2_1B2e( false) ;
      }
   }

   public void wb_table4_6_1B2( boolean wbgen )
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
         wb_table5_12_1B2( true) ;
      }
      else
      {
         wb_table5_12_1B2( false) ;
      }
      return  ;
   }

   public void wb_table5_12_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table6_20_1B2( true) ;
      }
      else
      {
         wb_table6_20_1B2( false) ;
      }
      return  ;
   }

   public void wb_table6_20_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0156"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0156"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0156"+"");
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
         wb_table4_6_1B2e( true) ;
      }
      else
      {
         wb_table4_6_1B2e( false) ;
      }
   }

   public void wb_table6_20_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_23_1B2( true) ;
      }
      else
      {
         wb_table7_23_1B2( false) ;
      }
      return  ;
   }

   public void wb_table7_23_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_20_1B2e( true) ;
      }
      else
      {
         wb_table6_20_1B2e( false) ;
      }
   }

   public void wb_table7_23_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_26_1B2( true) ;
      }
      else
      {
         wb_table8_26_1B2( false) ;
      }
      return  ;
   }

   public void wb_table8_26_1B2e( boolean wbgen )
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
         httpContext.writeText( "<td valign=\"bottom\" >") ;
         wb_table9_37_1B2( true) ;
      }
      else
      {
         wb_table9_37_1B2( false) ;
      }
      return  ;
   }

   public void wb_table9_37_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_23_1B2e( true) ;
      }
      else
      {
         wb_table7_23_1B2e( false) ;
      }
   }

   public void wb_table9_37_1B2( boolean wbgen )
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
         wb_table10_40_1B2( true) ;
      }
      else
      {
         wb_table10_40_1B2( false) ;
      }
      return  ;
   }

   public void wb_table10_40_1B2e( boolean wbgen )
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
         wb_table11_136_1B2( true) ;
      }
      else
      {
         wb_table11_136_1B2( false) ;
      }
      return  ;
   }

   public void wb_table11_136_1B2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"144\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 400, 10, 0)) + "px" + ";" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( httpContext.isAjaxCallMode( ) )
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
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 400, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridBase");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
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
            Grid1Column.AddObjectProperty("Value", GXutil.booltostr( AV9D_GRD_CHECK));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV8D_GRD_AUTH_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_auth_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A598TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTBW01_LINE_NO_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 144 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_144_idx-1) ;
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
         wb_table9_37_1B2e( true) ;
      }
      else
      {
         wb_table9_37_1B2e( false) ;
      }
   }

   public void wb_table11_136_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 400, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "QÁÒ", "", "", lblTextblock18_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, " À", "", "", lblTextblock33_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_136_1B2e( true) ;
      }
      else
      {
         wb_table11_136_1B2e( false) ;
      }
   }

   public void wb_table10_40_1B2( boolean wbgen )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_46_1B2( true) ;
      }
      else
      {
         wb_table12_46_1B2( false) ;
      }
      return  ;
   }

   public void wb_table12_46_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_40_1B2e( true) ;
      }
      else
      {
         wb_table10_40_1B2e( false) ;
      }
   }

   public void wb_table12_46_1B2( boolean wbgen )
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
         wb_table13_49_1B2( true) ;
      }
      else
      {
         wb_table13_49_1B2( false) ;
      }
      return  ;
   }

   public void wb_table13_49_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_55_1B2( true) ;
      }
      else
      {
         wb_table14_55_1B2( false) ;
      }
      return  ;
   }

   public void wb_table14_55_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_61_1B2( true) ;
      }
      else
      {
         wb_table15_61_1B2( false) ;
      }
      return  ;
   }

   public void wb_table15_61_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_67_1B2( true) ;
      }
      else
      {
         wb_table16_67_1B2( false) ;
      }
      return  ;
   }

   public void wb_table16_67_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_73_1B2( true) ;
      }
      else
      {
         wb_table17_73_1B2( false) ;
      }
      return  ;
   }

   public void wb_table17_73_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_79_1B2( true) ;
      }
      else
      {
         wb_table18_79_1B2( false) ;
      }
      return  ;
   }

   public void wb_table18_79_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_85_1B2( true) ;
      }
      else
      {
         wb_table19_85_1B2( false) ;
      }
      return  ;
   }

   public void wb_table19_85_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_91_1B2( true) ;
      }
      else
      {
         wb_table20_91_1B2( false) ;
      }
      return  ;
   }

   public void wb_table20_91_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_97_1B2( true) ;
      }
      else
      {
         wb_table21_97_1B2( false) ;
      }
      return  ;
   }

   public void wb_table21_97_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_103_1B2( true) ;
      }
      else
      {
         wb_table22_103_1B2( false) ;
      }
      return  ;
   }

   public void wb_table22_103_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_109_1B2( true) ;
      }
      else
      {
         wb_table23_109_1B2( false) ;
      }
      return  ;
   }

   public void wb_table23_109_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_115_1B2( true) ;
      }
      else
      {
         wb_table24_115_1B2( false) ;
      }
      return  ;
   }

   public void wb_table24_115_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_121_1B2( true) ;
      }
      else
      {
         wb_table25_121_1B2( false) ;
      }
      return  ;
   }

   public void wb_table25_121_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_127_1B2( true) ;
      }
      else
      {
         wb_table26_127_1B2( false) ;
      }
      return  ;
   }

   public void wb_table26_127_1B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_46_1B2e( true) ;
      }
      else
      {
         wb_table12_46_1B2e( false) ;
      }
   }

   public void wb_table26_127_1B2( boolean wbgen )
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
         ClassString = lblTxt_last_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "ÅãÖ", "", "", lblTxt_last_Jsonclick, "E\\'PAGE_LAST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_127_1B2e( true) ;
      }
      else
      {
         wb_table26_127_1B2e( false) ;
      }
   }

   public void wb_table25_121_1B2( boolean wbgen )
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
         ClassString = lblTxt_next_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "Ö", "", "", lblTxt_next_Jsonclick, "E\\'PAGE_NEXT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_121_1B2e( true) ;
      }
      else
      {
         wb_table25_121_1B2e( false) ;
      }
   }

   public void wb_table24_115_1B2( boolean wbgen )
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
         ClassString = lblTxt_page10_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "E\\'PAGE10\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_115_1B2e( true) ;
      }
      else
      {
         wb_table24_115_1B2e( false) ;
      }
   }

   public void wb_table23_109_1B2( boolean wbgen )
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
         ClassString = lblTxt_page09_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "E\\'PAGE09\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_109_1B2e( true) ;
      }
      else
      {
         wb_table23_109_1B2e( false) ;
      }
   }

   public void wb_table22_103_1B2( boolean wbgen )
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
         ClassString = lblTxt_page08_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "E\\'PAGE08\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_103_1B2e( true) ;
      }
      else
      {
         wb_table22_103_1B2e( false) ;
      }
   }

   public void wb_table21_97_1B2( boolean wbgen )
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
         ClassString = lblTxt_page07_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "E\\'PAGE07\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_97_1B2e( true) ;
      }
      else
      {
         wb_table21_97_1B2e( false) ;
      }
   }

   public void wb_table20_91_1B2( boolean wbgen )
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
         ClassString = lblTxt_page06_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "E\\'PAGE06\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_91_1B2e( true) ;
      }
      else
      {
         wb_table20_91_1B2e( false) ;
      }
   }

   public void wb_table19_85_1B2( boolean wbgen )
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
         ClassString = lblTxt_page05_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "E\\'PAGE05\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_85_1B2e( true) ;
      }
      else
      {
         wb_table19_85_1B2e( false) ;
      }
   }

   public void wb_table18_79_1B2( boolean wbgen )
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
         ClassString = lblTxt_page04_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "E\\'PAGE04\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_79_1B2e( true) ;
      }
      else
      {
         wb_table18_79_1B2e( false) ;
      }
   }

   public void wb_table17_73_1B2( boolean wbgen )
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
         ClassString = lblTxt_page03_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "E\\'PAGE03\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_73_1B2e( true) ;
      }
      else
      {
         wb_table17_73_1B2e( false) ;
      }
   }

   public void wb_table16_67_1B2( boolean wbgen )
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
         ClassString = lblTxt_page02_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "E\\'PAGE02\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_67_1B2e( true) ;
      }
      else
      {
         wb_table16_67_1B2e( false) ;
      }
   }

   public void wb_table15_61_1B2( boolean wbgen )
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
         ClassString = lblTxt_page01_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "E\\'PAGE01\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_61_1B2e( true) ;
      }
      else
      {
         wb_table15_61_1B2e( false) ;
      }
   }

   public void wb_table14_55_1B2( boolean wbgen )
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
         ClassString = lblTxt_back_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "OÖ", "", "", lblTxt_back_Jsonclick, "E\\'PAGE_BACK\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_55_1B2e( true) ;
      }
      else
      {
         wb_table14_55_1B2e( false) ;
      }
   }

   public void wb_table13_49_1B2( boolean wbgen )
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
         ClassString = lblTxt_first_Class ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "ÅÖ", "", "", lblTxt_first_Jsonclick, "E\\'PAGE_FIRST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_49_1B2e( true) ;
      }
      else
      {
         wb_table13_49_1B2e( false) ;
      }
   }

   public void wb_table8_26_1B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 400, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "[U[", "", "", lblTextblock35_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_user_Internalname, lblTxt_user_Caption, "", "", lblTxt_user_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_26_1B2e( true) ;
      }
      else
      {
         wb_table8_26_1B2e( false) ;
      }
   }

   public void wb_table5_12_1B2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "o^iF3j", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "ßéiF11j", "", "", lblTextblock46_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B402_WP06_STUDY_STAFF_AUTH_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_1B2e( true) ;
      }
      else
      {
         wb_table5_12_1B2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV15P_APP_ID = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_APP_ID", AV15P_APP_ID);
      AV16P_DISP_DATETIME = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_DISP_DATETIME", AV16P_DISP_DATETIME);
      AV17P_LINE_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_LINE_NO", GXutil.ltrim( GXutil.str( AV17P_LINE_NO, 10, 0)));
      AV19P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19P_STUDY_ID", GXutil.ltrim( GXutil.str( AV19P_STUDY_ID, 10, 0)));
      AV18P_SITE_ID = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_SITE_ID", AV18P_SITE_ID);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1541783");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b402_wp06_study_staff_auth_sel.js", "?1541785");
      /* End function include_jscripts */
   }

   public void sendrow_1442( )
   {
      wb1B0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_144_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(nGXsfl_144_idx/ (double) (1)) % (2)) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_144_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_144_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)(nGXsfl_144_idx) % (1)) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_144_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grid_Internalname+"_"+sGXsfl_144_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"",new Integer(400),"","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";width:45px\""});
         /* Check box */
         TempTags = " " + ((chkavD_grd_check.getEnabled()!=0)&&(chkavD_grd_check.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 150,'',false,'"+sGXsfl_144_idx+"',144)\"" : " ") ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, httpContext.isAjaxCallMode( ), new Object[] {chkavD_grd_check.getInternalname(),GXutil.booltostr( AV9D_GRD_CHECK),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,TempTags+((chkavD_grd_check.getEnabled()!=0)&&(chkavD_grd_check.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(150, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd_check.getEnabled()!=0)&&(chkavD_grd_check.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(150);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_auth_nm_Enabled!=0)&&(edtavD_grd_auth_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 152,'',false,'"+sGXsfl_144_idx+"',144)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd_auth_nm_Internalname,GXutil.rtrim( AV8D_GRD_AUTH_NM),"",TempTags+((edtavD_grd_auth_nm_Enabled!=0)&&(edtavD_grd_auth_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_auth_nm_Enabled!=0)&&(edtavD_grd_auth_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(152);\"" : " "),"","","","",edtavD_grd_auth_nm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd_auth_nm_Enabled),new Integer(0),new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(144),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
         ClassString = "Attribute" ;
         StyleString = "color:#FF0000;" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBW01_LINE_NO_Internalname,GXutil.ltrim( localUtil.ntoc( A598TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A598TBW01_LINE_NO), "ZZZZZZZZZ9"),"","","","","",edtTBW01_LINE_NO_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(edtTBW01_LINE_NO_Visible),new Integer(0),new Integer(0),new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(144),new Integer(1),new Integer(1),new Boolean(true),"right"});
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
               if ( ((int)(nGXsfl_144_idx) % (1)) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_144_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_144_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_144_idx+1)) ;
         sGXsfl_144_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_144_idx, 4, 0)), (short)(4), "0") ;
         chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_144_idx );
         edtavD_grd_auth_nm_Internalname = "vD_GRD_AUTH_NM_"+sGXsfl_144_idx ;
         edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_144_idx ;
      }
      /* End function sendrow_1442 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTxt_user_Internalname = "TXT_USER" ;
      tblTable7_Internalname = "TABLE7" ;
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
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
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
      edtavH_disp_datetime_Internalname = "vH_DISP_DATETIME" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavCtlmax_page_Internalname = "CTLMAX_PAGE" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
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
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtavCtlpage09_Internalname = "CTLPAGE09" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtavCtlpage10_Internalname = "CTLPAGE10" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtavCtlpage_disp01_Internalname = "CTLPAGE_DISP01" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtavCtlpage_disp02_Internalname = "CTLPAGE_DISP02" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtavCtlpage_disp03_Internalname = "CTLPAGE_DISP03" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtavCtlpage_disp04_Internalname = "CTLPAGE_DISP04" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtavCtlpage_disp05_Internalname = "CTLPAGE_DISP05" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtavCtlpage_disp06_Internalname = "CTLPAGE_DISP06" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtavCtlpage_disp07_Internalname = "CTLPAGE_DISP07" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtavCtlpage_disp08_Internalname = "CTLPAGE_DISP08" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtavCtlpage_disp09_Internalname = "CTLPAGE_DISP09" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtavCtlpage_disp10_Internalname = "CTLPAGE_DISP10" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtavCtlpage_disp_back_Internalname = "CTLPAGE_DISP_BACK" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtavCtlpage_disp_next_Internalname = "CTLPAGE_DISP_NEXT" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtavCtlpage_disp_first_Internalname = "CTLPAGE_DISP_FIRST" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtavCtlpage_disp_last_Internalname = "CTLPAGE_DISP_LAST" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtavCtlpage_disp_area_Internalname = "CTLPAGE_DISP_AREA" ;
      tblTable6_Internalname = "TABLE6" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtTBW01_LINE_NO_Jsonclick = "" ;
      edtavD_grd_auth_nm_Jsonclick = "" ;
      edtavD_grd_auth_nm_Visible = 1 ;
      chkavD_grd_check.setVisible( 1 );
      chkavD_grd_check.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridBase" ;
      lblTxt_btn_reg_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtTBW01_LINE_NO_Visible = 1 ;
      edtavD_grd_auth_nm_Enabled = 1 ;
      subGrid1_Width = 400 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCtlpage_disp_area_Jsonclick = "" ;
      edtavCtlpage_disp_last_Jsonclick = "" ;
      edtavCtlpage_disp_first_Jsonclick = "" ;
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
      edtavCtlmax_page_Jsonclick = "" ;
      edtavCtlmax_row_Jsonclick = "" ;
      edtavH_disp_datetime_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "(S100)" ;
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
      lblTxt_user_Caption = "[U[¼" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Rows = (short)(10) ;
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
                  /* Execute user subroutine: S20362 */
                  S20362 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV15P_APP_ID = "" ;
      wcpOAV16P_DISP_DATETIME = "" ;
      wcpOAV18P_SITE_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15P_APP_ID = "" ;
      AV16P_DISP_DATETIME = "" ;
      AV18P_SITE_ID = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV14H_SRCH_FLG = "" ;
      AV11H_DISP_DATETIME = "" ;
      AV10H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV6C_APP_ID = "" ;
      A599TBW01_FREE_SAVE_1 = "" ;
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
      edtavD_grd_auth_nm_Internalname = "" ;
      edtTBW01_LINE_NO_Internalname = "" ;
      AV8D_GRD_AUTH_NM = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      H001B2_A599TBW01_FREE_SAVE_1 = new String[] {""} ;
      H001B2_n599TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      H001B2_A597TBW01_DISP_DATETIME = new String[] {""} ;
      H001B2_A596TBW01_APP_ID = new String[] {""} ;
      H001B2_A595TBW01_SESSION_ID = new String[] {""} ;
      H001B2_A598TBW01_LINE_NO = new long[1] ;
      A597TBW01_DISP_DATETIME = "" ;
      A596TBW01_APP_ID = "" ;
      A595TBW01_SESSION_ID = "" ;
      H001B3_AGRID1_nRecordCount = new int[1] ;
      AV64Pgmname = "" ;
      AV63Pgmdesc = "" ;
      AV12H_INIT_FLG = "" ;
      AV13H_KNGN_FLG = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV30W_STUDY_STAFF_AUTH = new SdtB402_SD03_STUDY_STAFF_AUTH(remoteHandle, context);
      AV24W_ERR_MSG = "" ;
      AV5BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      AV28W_MSG = "" ;
      AV29W_STUDY_STAFF = new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
      GXv_int4 = new short [1] ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV25W_ERRCD = "" ;
      AV21W_A819_JS = "" ;
      AV22W_A821_JS = "" ;
      GXv_char3 = new String [1] ;
      GXv_SdtA_PAGING_SDT7 = new SdtA_PAGING_SDT [1] ;
      GXv_char6 = new String [1] ;
      GXv_boolean9 = new boolean [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock18_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
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
      lblTextblock35_Jsonclick = "" ;
      lblTxt_user_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      GXt_char1 = "" ;
      ROClassString = "" ;
      GXt_char2 = "" ;
      GXt_char10 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp06_study_staff_auth_sel__default(),
         new Object[] {
             new Object[] {
            H001B2_A599TBW01_FREE_SAVE_1, H001B2_n599TBW01_FREE_SAVE_1, H001B2_A597TBW01_DISP_DATETIME, H001B2_A596TBW01_APP_ID, H001B2_A595TBW01_SESSION_ID, H001B2_A598TBW01_LINE_NO
            }
            , new Object[] {
            H001B3_AGRID1_nRecordCount
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV64Pgmname = "B402_WP06_STUDY_STAFF_AUTH_SEL" ;
      AV63Pgmdesc = "±o^iQÁX^bt ÀIðj" ;
      /* GeneXus formulas. */
      AV64Pgmname = "B402_WP06_STUDY_STAFF_AUTH_SEL" ;
      AV63Pgmdesc = "±o^iQÁX^bt ÀIðj" ;
      Gx_err = (short)(0) ;
      edtavD_grd_auth_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_144_idx=1 ;
   private short subGrid1_Rows ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short AV23W_ERR_CD ;
   private short nGXsfl_144_fel_idx=1 ;
   private short GXv_int4[] ;
   private short subGrid1_Borderwidth ;
   private int GRID1_nFirstRecordOnPage ;
   private int subGrid1_Islastpage ;
   private int GRID1_nCurrentRecord ;
   private int GRID1_nRecordCount ;
   private int edtavD_grd_auth_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtTBW01_LINE_NO_Visible ;
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
   private int subGrid1_Width ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_auth_nm_Visible ;
   private long wcpOAV17P_LINE_NO ;
   private long wcpOAV19P_STUDY_ID ;
   private long AV17P_LINE_NO ;
   private long AV19P_STUDY_ID ;
   private long AV31W_TOP_LINE_NO ;
   private long A598TBW01_LINE_NO ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_144_idx="0001" ;
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
   private String edtavD_grd_auth_nm_Internalname ;
   private String edtTBW01_LINE_NO_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV64Pgmname ;
   private String AV63Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_disp_datetime_Internalname ;
   private String edtavCtlmax_row_Internalname ;
   private String edtavCtlmax_page_Internalname ;
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
   private String edtavCtlpage_disp_first_Internalname ;
   private String edtavCtlpage_disp_last_Internalname ;
   private String edtavCtlpage_disp_area_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblTxt_user_Caption ;
   private String lblTxt_user_Internalname ;
   private String sGXsfl_144_fel_idx="0001" ;
   private String GXv_char3[] ;
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
   private String GXv_char6[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_disp_datetime_Jsonclick ;
   private String tblTable6_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavCtlmax_page_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
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
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtavCtlpage09_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtavCtlpage10_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtavCtlpage_disp01_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtavCtlpage_disp02_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtavCtlpage_disp03_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtavCtlpage_disp04_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtavCtlpage_disp05_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtavCtlpage_disp06_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtavCtlpage_disp07_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtavCtlpage_disp08_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtavCtlpage_disp09_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtavCtlpage_disp10_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtavCtlpage_disp_back_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtavCtlpage_disp_next_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtavCtlpage_disp_first_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtavCtlpage_disp_last_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtavCtlpage_disp_area_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String subGrid1_Internalname ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
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
   private String tblTable7_Internalname ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTxt_user_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_Internalname ;
   private String GXt_char1 ;
   private String ROClassString ;
   private String GXt_char2 ;
   private String edtavD_grd_auth_nm_Jsonclick ;
   private String edtTBW01_LINE_NO_Jsonclick ;
   private String GXt_char10 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV9D_GRD_CHECK ;
   private boolean n599TBW01_FREE_SAVE_1 ;
   private boolean returnInSub ;
   private boolean AV27W_GRID_READ_FLG ;
   private boolean AV26W_ERRFLG ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean9[] ;
   private String A599TBW01_FREE_SAVE_1 ;
   private String wcpOAV15P_APP_ID ;
   private String wcpOAV16P_DISP_DATETIME ;
   private String wcpOAV18P_SITE_ID ;
   private String AV15P_APP_ID ;
   private String AV16P_DISP_DATETIME ;
   private String AV18P_SITE_ID ;
   private String AV14H_SRCH_FLG ;
   private String AV11H_DISP_DATETIME ;
   private String AV6C_APP_ID ;
   private String AV8D_GRD_AUTH_NM ;
   private String A597TBW01_DISP_DATETIME ;
   private String A596TBW01_APP_ID ;
   private String A595TBW01_SESSION_ID ;
   private String AV12H_INIT_FLG ;
   private String AV13H_KNGN_FLG ;
   private String AV7C_GAMEN_TITLE ;
   private String AV24W_ERR_MSG ;
   private String AV28W_MSG ;
   private String AV25W_ERRCD ;
   private String AV21W_A819_JS ;
   private String AV22W_A821_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private ICheckbox chkavD_grd_check ;
   private IDataStoreProvider pr_default ;
   private String[] H001B2_A599TBW01_FREE_SAVE_1 ;
   private boolean[] H001B2_n599TBW01_FREE_SAVE_1 ;
   private String[] H001B2_A597TBW01_DISP_DATETIME ;
   private String[] H001B2_A596TBW01_APP_ID ;
   private String[] H001B2_A595TBW01_SESSION_ID ;
   private long[] H001B2_A598TBW01_LINE_NO ;
   private int[] H001B3_AGRID1_nRecordCount ;
   private SdtTBW01_FREE_WORK AV5BC_FREE_WORK ;
   private SdtA_PAGING_SDT AV10H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT7[] ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtB402_SD02_STUDY_STAFF AV29W_STUDY_STAFF ;
   private SdtB402_SD03_STUDY_STAFF_AUTH AV30W_STUDY_STAFF_AUTH ;
}

final  class b402_wp06_study_staff_auth_sel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001B2", "SELECT `TBW01_FREE_SAVE_1`, `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE (`TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ?) AND (? = '1') ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001B3", "SELECT COUNT(*) FROM `TBW01_FREE_WORK` WHERE (`TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ?) AND (? = '1') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               break;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               stmt.setVarchar(4, (String)parms[3], 1);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               stmt.setVarchar(4, (String)parms[3], 1);
               break;
      }
   }

}

