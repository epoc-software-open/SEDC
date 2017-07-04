/*
               File: b405_wp01_kanja_crf_list_impl
        Description: 患者別使用CRF選択
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:4:24.14
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b405_wp01_kanja_crf_list_impl extends GXWebPanel
{
   public b405_wp01_kanja_crf_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b405_wp01_kanja_crf_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b405_wp01_kanja_crf_list_impl.class ));
   }

   public b405_wp01_kanja_crf_list_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_study_id = new HTMLChoice();
      chkavW_crf_sel_only = UIFactory.getCheckbox(this);
      chkavD_grd_chk_all = UIFactory.getCheckbox(this);
      chkavD_grd1_check = UIFactory.getCheckbox(this);
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
            nGXsfl_166_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_166_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrd_title_newrow( nRC_Grd_title, nGXsfl_166_idx, sGXsfl_166_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_Grid2 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_194_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_194_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_Grid2, nGXsfl_194_idx, sGXsfl_194_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_Grid1 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_175_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_175_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_175_idx, sGXsfl_175_idx) ;
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
            AV24P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24P_MOVE_KBN", GXutil.str( AV24P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV23P_COL_COUNT = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23P_COL_COUNT", GXutil.ltrim( GXutil.str( AV23P_COL_COUNT, 4, 0)));
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
         pa1C2( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws1C2( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we1C2( ) ;
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
      httpContext.writeText( "患者別使用CRF選択") ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV24P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23P_COL_COUNT,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b405_wp01_kanja_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1C2( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV22H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DISP_DATETIME", GXutil.rtrim( AV19H_DISP_DATETIME));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV17H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV17H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grd_title", GXutil.ltrim( localUtil.ntoc( nRC_Grd_title, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV24P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_COL_COUNT", GXutil.ltrim( localUtil.ntoc( AV23P_COL_COUNT, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_SNM", GXutil.rtrim( A550TBM31_CRF_SNM));
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

   public void wb1C0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1C2( true) ;
      }
      else
      {
         wb_table1_2_1C2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_205_1C2( true) ;
      }
      else
      {
         wb_table2_205_1C2( false) ;
      }
      return  ;
   }

   public void wb_table2_205_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1C2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "患者別使用CRF選択", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0203") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0203", "");
         }
      }
      wbErr = false ;
      strup1C0( ) ;
   }

   public void ws1C2( )
   {
      start1C2( ) ;
      evt1C2( ) ;
   }

   public void evt1C2( )
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
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV22H_SRCH_FLG) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DISP_DATETIME"), AV19H_DISP_DATETIME) != 0 )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_AUTO_SEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111C2 */
                        e111C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121C2 */
                        e121C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131C2 */
                        e131C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD_CHK_ALL.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141C2 */
                        e141C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151C2 */
                        e151C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161C2 */
                        e161C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171C2 */
                        e171C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181C2 */
                        e181C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191C2 */
                        e191C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201C2 */
                        e201C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211C2 */
                        e211C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221C2 */
                        e221C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231C2 */
                        e231C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241C2 */
                        e241C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251C2 */
                        e251C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261C2 */
                        e261C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271C2 */
                        e271C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281C2 */
                        e281C2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "GRD_TITLE.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_166_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_166_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_166_idx, 4, 0)), (short)(4), "0") ;
                        edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_166_idx ;
                        AV10D_CRFSNM = httpContext.cgiGet( edtavD_crfsnm_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0203") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0203", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0203") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0203", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e291C2 */
                              e291C2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e301C2 */
                              e301C2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRD_TITLE.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e311C2 */
                              e311C2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 /* Set Refresh If H_srch_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV22H_SRCH_FLG) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_disp_datetime Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DISP_DATETIME"), AV19H_DISP_DATETIME) != 0 )
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
                     else if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "BTN_SEL.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "BTN_SEL.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) )
                     {
                        nGXsfl_175_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_175_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_175_idx, 4, 0)), (short)(4), "0") ;
                        chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_175_idx );
                        edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_175_idx ;
                        lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_175_idx ;
                        edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_175_idx ;
                        subGrid2_Internalname = "GRID2_"+sGXsfl_175_idx ;
                        AV12D_GRD1_CHECK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd1_check.getInternalname())) ;
                        AV13D_GRD1_HIKENSHA = httpContext.cgiGet( edtavD_grd1_hikensha_Internalname) ;
                        A598TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e321C4 */
                              e321C4 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "BTN_SEL.CLICK") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e331C2 */
                              e331C2 ();
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
                              nGXsfl_194_idx = (short)(GXutil.lval( sEvtType)) ;
                              sGXsfl_194_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_194_idx, 4, 0)), (short)(4), "0") + sGXsfl_175_idx ;
                              edtavD_grd2_crf_status_Internalname = "vD_GRD2_CRF_STATUS_"+sGXsfl_194_idx ;
                              AV14D_GRD2_CRF_STATUS = httpContext.cgiGet( edtavD_grd2_crf_status_Internalname) ;
                              sEvtType = GXutil.right( sEvt, 1) ;
                              if ( GXutil.strcmp(sEvtType, ".") == 0 )
                              {
                                 sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                                 if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    dynload_actions( ) ;
                                    /* Execute user event: e341C5 */
                                    e341C5 ();
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
                  else if ( nCmpId == 203 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0203") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0203", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1C2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1C2( ) ;
         }
      }
   }

   public void pa1C2( )
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
                  AV24P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV24P_MOVE_KBN", GXutil.str( AV24P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV23P_COL_COUNT = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV23P_COL_COUNT", GXutil.ltrim( GXutil.str( AV23P_COL_COUNT, 4, 0)));
                  }
               }
            }
         }
         cmbavD_study_id.setName( "vD_STUDY_ID" );
         cmbavD_study_id.setWebtags( "" );
         if ( ( cmbavD_study_id.getItemCount() > 0 ) && (0==AV15D_STUDY_ID) )
         {
            AV15D_STUDY_ID = GXutil.lval( cmbavD_study_id.getItemValue((short)(1))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15D_STUDY_ID", GXutil.ltrim( GXutil.str( AV15D_STUDY_ID, 10, 0)));
         }
         chkavW_crf_sel_only.setName( "vW_CRF_SEL_ONLY" );
         chkavW_crf_sel_only.setWebtags( "" );
         chkavW_crf_sel_only.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavW_crf_sel_only.getInternalname(), "Caption", chkavW_crf_sel_only.getCaption());
         chkavW_crf_sel_only.setCheckedValue( "false" );
         chkavD_grd_chk_all.setName( "vD_GRD_CHK_ALL" );
         chkavD_grd_chk_all.setWebtags( "" );
         chkavD_grd_chk_all.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd_chk_all.getInternalname(), "Caption", chkavD_grd_chk_all.getCaption());
         chkavD_grd_chk_all.setCheckedValue( "false" );
         GXCCtl = "vD_GRD1_CHECK_" + sGXsfl_175_idx ;
         chkavD_grd1_check.setName( GXCCtl );
         chkavD_grd1_check.setWebtags( "" );
         chkavD_grd1_check.setCaption( "" );
         chkavD_grd1_check.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrd_title_newrow( short nRC_Grd_title ,
                                     short nGXsfl_166_idx ,
                                     String sGXsfl_166_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_166_idx ;
      while ( nGXsfl_166_idx <= nRC_Grd_title )
      {
         sendrow_1662( ) ;
         nGXsfl_166_idx = (short)(((subGrd_title_Islastpage==1)&&(nGXsfl_166_idx+1>subgrd_title_recordsperpage( )) ? 1 : nGXsfl_166_idx+1)) ;
         sGXsfl_166_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_166_idx, 4, 0)), (short)(4), "0") ;
         edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_166_idx ;
      }
      httpContext.GX_webresponse.addString(Grd_titleContainer.ToJavascriptSource());
      /* End function gxnrGrd_title_newrow */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_175_idx ,
                                 String sGXsfl_175_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_175_idx );
      edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_175_idx ;
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_175_idx ;
      edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_175_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_175_idx ;
      while ( nGXsfl_175_idx <= nRC_Grid1 )
      {
         sendrow_1754( ) ;
         nGXsfl_175_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_175_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_175_idx+1)) ;
         sGXsfl_175_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_175_idx, 4, 0)), (short)(4), "0") ;
         chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_175_idx );
         edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_175_idx ;
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_175_idx ;
         edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_175_idx ;
         subGrid2_Internalname = "GRID2_"+sGXsfl_175_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( short nRC_Grid2 ,
                                 short nGXsfl_194_idx ,
                                 String sGXsfl_194_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavD_grd2_crf_status_Internalname = "vD_GRD2_CRF_STATUS_"+sGXsfl_194_idx ;
      while ( nGXsfl_194_idx <= nRC_Grid2 )
      {
         sendrow_1945( ) ;
         nGXsfl_194_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_194_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_194_idx+1)) ;
         sGXsfl_194_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_194_idx, 4, 0)), (short)(4), "0") + sGXsfl_175_idx ;
         edtavD_grd2_crf_status_Internalname = "vD_GRD2_CRF_STATUS_"+sGXsfl_194_idx ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void refresh( )
   {
      rf1C2( ) ;
      rf1C4( ) ;
      /* End function Refresh */
   }

   public void rf1C2( )
   {
      Grd_titleContainer.setPageSize( subgrd_title_recordsperpage( ) );
      wbStart = (short)(166) ;
      nGXsfl_166_idx = (short)(1) ;
      sGXsfl_166_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_166_idx, 4, 0)), (short)(4), "0") ;
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_166_idx ;
      /* Execute user event: e301C2 */
      e301C2 ();
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
         edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_166_idx ;
         /* Execute user event: e311C2 */
         e311C2 ();
         wbEnd = (short)(166) ;
         wb1C0( ) ;
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

   public void rf1C4( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(175) ;
      nGXsfl_175_idx = (short)(1) ;
      sGXsfl_175_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_175_idx, 4, 0)), (short)(4), "0") ;
      chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_175_idx );
      edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_175_idx ;
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_175_idx ;
      edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_175_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_175_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_175_idx );
         edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_175_idx ;
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_175_idx ;
         edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_175_idx ;
         subGrid2_Internalname = "GRID2_"+sGXsfl_175_idx ;
         /* Using cursor H001C2 */
         pr_default.execute(0, new Object[] {AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME, AV22H_SRCH_FLG});
         nGXsfl_175_idx = (short)(1) ;
         GRID1_nEOF = (byte)(0) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            A597TBW01_DISP_DATETIME = H001C2_A597TBW01_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A597TBW01_DISP_DATETIME", A597TBW01_DISP_DATETIME);
            A596TBW01_APP_ID = H001C2_A596TBW01_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A596TBW01_APP_ID", A596TBW01_APP_ID);
            A595TBW01_SESSION_ID = H001C2_A595TBW01_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A595TBW01_SESSION_ID", A595TBW01_SESSION_ID);
            A599TBW01_FREE_SAVE_1 = H001C2_A599TBW01_FREE_SAVE_1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A599TBW01_FREE_SAVE_1", A599TBW01_FREE_SAVE_1);
            n599TBW01_FREE_SAVE_1 = H001C2_n599TBW01_FREE_SAVE_1[0] ;
            A598TBW01_LINE_NO = H001C2_A598TBW01_LINE_NO[0] ;
            /* Execute user event: e321C4 */
            e321C4 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(175) ;
         wb1C0( ) ;
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
      /* Using cursor H001C3 */
      pr_default.execute(1, new Object[] {AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME, AV22H_SRCH_FLG});
      GRID1_nRecordCount = H001C3_AGRID1_nRecordCount[0] ;
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
      GRID1_IsPaging = 1 ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
         GRID1_IsPaging = 1 ;
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
      GRID1_IsPaging = 1 ;
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

   public void rf1C5( )
   {
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      wbStart = (short)(194) ;
      nGXsfl_194_idx = (short)(1) ;
      sGXsfl_194_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_194_idx, 4, 0)), (short)(4), "0") + sGXsfl_175_idx ;
      edtavD_grd2_crf_status_Internalname = "vD_GRD2_CRF_STATUS_"+sGXsfl_194_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         edtavD_grd2_crf_status_Internalname = "vD_GRD2_CRF_STATUS_"+sGXsfl_194_idx ;
         /* Execute user event: e341C5 */
         e341C5 ();
         wbEnd = (short)(194) ;
         wb1C0( ) ;
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

   public void strup1C0( )
   {
      /* Before Start, stand alone formulas. */
      AV78Pgmname = "B405_WP01_KANJA_CRF_LIST" ;
      Gx_err = (short)(0) ;
      edtavD_crfsnm_Enabled = 0 ;
      edtavD_grd1_hikensha_Enabled = 0 ;
      edtavD_grd2_crf_status_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e291C2 */
      e291C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV17H_A_PAGING_SDT);
         /* Read variables values. */
         cmbavD_study_id.setName( cmbavD_study_id.getInternalname() );
         cmbavD_study_id.setValue( httpContext.cgiGet( cmbavD_study_id.getInternalname()) );
         AV15D_STUDY_ID = GXutil.lval( httpContext.cgiGet( cmbavD_study_id.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15D_STUDY_ID", GXutil.ltrim( GXutil.str( AV15D_STUDY_ID, 10, 0)));
         AV16D_TBT01_OUTER_SUBJECT_ID = httpContext.cgiGet( edtavD_tbt01_outer_subject_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16D_TBT01_OUTER_SUBJECT_ID", AV16D_TBT01_OUTER_SUBJECT_ID);
         AV9W_CRF_SEL_ONLY = GXutil.strtobool( httpContext.cgiGet( chkavW_crf_sel_only.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9W_CRF_SEL_ONLY", GXutil.booltostr( AV9W_CRF_SEL_ONLY));
         AV11D_GRD_CHK_ALL = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_chk_all.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_CHK_ALL", GXutil.booltostr( AV11D_GRD_CHK_ALL));
         AV20H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
         AV22H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22H_SRCH_FLG", AV22H_SRCH_FLG);
         AV21H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
         AV19H_DISP_DATETIME = httpContext.cgiGet( edtavH_disp_datetime_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_col_count_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_col_count_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_COL_COUNT");
            GX_FocusControl = edtavH_col_count_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18H_COL_COUNT = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18H_COL_COUNT", GXutil.ltrim( GXutil.str( AV18H_COL_COUNT, 4, 0)));
         }
         else
         {
            AV18H_COL_COUNT = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_col_count_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18H_COL_COUNT", GXutil.ltrim( GXutil.str( AV18H_COL_COUNT, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_PAGE");
            GX_FocusControl = edtavCtlmax_page_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_page_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_NO");
            GX_FocusControl = edtavCtlpage_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_no_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE01");
            GX_FocusControl = edtavCtlpage01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE02");
            GX_FocusControl = edtavCtlpage02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE03");
            GX_FocusControl = edtavCtlpage03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE04");
            GX_FocusControl = edtavCtlpage04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE05");
            GX_FocusControl = edtavCtlpage05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE06");
            GX_FocusControl = edtavCtlpage06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE07");
            GX_FocusControl = edtavCtlpage07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE08");
            GX_FocusControl = edtavCtlpage08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE09");
            GX_FocusControl = edtavCtlpage09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE10");
            GX_FocusControl = edtavCtlpage10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP01");
            GX_FocusControl = edtavCtlpage_disp01_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp01_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP02");
            GX_FocusControl = edtavCtlpage_disp02_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp02_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP03");
            GX_FocusControl = edtavCtlpage_disp03_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp03_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP04");
            GX_FocusControl = edtavCtlpage_disp04_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp04_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP05");
            GX_FocusControl = edtavCtlpage_disp05_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp05_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP06");
            GX_FocusControl = edtavCtlpage_disp06_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp06_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP07");
            GX_FocusControl = edtavCtlpage_disp07_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp07_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP08");
            GX_FocusControl = edtavCtlpage_disp08_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp08_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP09");
            GX_FocusControl = edtavCtlpage_disp09_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp09_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP10");
            GX_FocusControl = edtavCtlpage_disp10_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp10_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_BACK");
            GX_FocusControl = edtavCtlpage_disp_back_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_back_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_NEXT");
            GX_FocusControl = edtavCtlpage_disp_next_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_next_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_first_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_first_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_FIRST");
            GX_FocusControl = edtavCtlpage_disp_first_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_first( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_first( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_first_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_last_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_last_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_LAST");
            GX_FocusControl = edtavCtlpage_disp_last_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_last( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_last( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_last_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",") > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLPAGE_DISP_AREA");
            GX_FocusControl = edtavCtlpage_disp_area_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtlpage_disp_area_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_Grd_title = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grd_title"), ".", ",")) ;
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV24P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV23P_COL_COUNT = (short)(localUtil.ctol( httpContext.cgiGet( "vP_COL_COUNT"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0203") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0203", "");
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
      /* Execute user event: e291C2 */
      e291C2 ();
      if (returnInSub) return;
   }

   public void e291C2( )
   {
      /* Start Routine */
      AV8C_TAM02_APP_ID = "B405" ;
      AV7C_GAMEN_TITLE = "患者別使用CRF選択" ;
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV20H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( (GXutil.strcmp("", AV19H_DISP_DATETIME)==0) )
      {
         GXt_char2 = AV19H_DISP_DATETIME ;
         GXv_char3[0] = GXt_char2 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char3) ;
         b405_wp01_kanja_crf_list_impl.this.GXt_char2 = GXv_char3[0] ;
         AV19H_DISP_DATETIME = GXt_char2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV25W_A_LOGIN_SDT,AV8C_TAM02_APP_ID,AV7C_GAMEN_TITLE,AV19H_DISP_DATETIME});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0203",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      tblTbl_list_Width = (int)(200+150*AV23P_COL_COUNT) ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Width", GXutil.ltrim( GXutil.str( tblTbl_list_Width, 9, 0)));
   }

   public void e301C2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV20H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV78Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV20H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      AV46W_TOP_LINE_NO = (long)(subGrid1_Rows*(subgrid1_currentpage( )-1)+1) ;
   }

   private void e311C2( )
   {
      /* Grd_title_Load Routine */
      AV18H_COL_COUNT = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_COL_COUNT", GXutil.ltrim( GXutil.str( AV18H_COL_COUNT, 4, 0)));
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           new Long(AV15D_STUDY_ID) ,
                                           new Long(A217TBM31_STUDY_ID) ,
                                           new Short(A218TBM31_CRF_ID) ,
                                           A551TBM31_STATUS ,
                                           A223TBM31_DEL_FLG },
                                           new int[] {
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H001C4 */
      pr_default.execute(2, new Object[] {new Long(AV15D_STUDY_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A223TBM31_DEL_FLG = H001C4_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = H001C4_n223TBM31_DEL_FLG[0] ;
         A551TBM31_STATUS = H001C4_A551TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
         n551TBM31_STATUS = H001C4_n551TBM31_STATUS[0] ;
         A218TBM31_CRF_ID = H001C4_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         A217TBM31_STUDY_ID = H001C4_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A550TBM31_CRF_SNM = H001C4_A550TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
         n550TBM31_CRF_SNM = H001C4_n550TBM31_CRF_SNM[0] ;
         AV18H_COL_COUNT = (short)(AV18H_COL_COUNT+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_COL_COUNT", GXutil.ltrim( GXutil.str( AV18H_COL_COUNT, 4, 0)));
         AV10D_CRFSNM = A550TBM31_CRF_SNM ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(166) ;
         }
         sendrow_1662( ) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      tblTbl_list_Width = (int)(200+150*AV18H_COL_COUNT) ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Width", GXutil.ltrim( GXutil.str( tblTbl_list_Width, 9, 0)));
   }

   public void e111C2( )
   {
      /* 'BTN_AUTO_SEL' Routine */
      AV34W_ERR_MSG = "" ;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      /* Using cursor H001C5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A161TBM01_SYS_ID = H001C5_A161TBM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161TBM01_SYS_ID", A161TBM01_SYS_ID);
         A514TBM01_SYS_VALUE = H001C5_A514TBM01_SYS_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A514TBM01_SYS_VALUE", A514TBM01_SYS_VALUE);
         n514TBM01_SYS_VALUE = H001C5_n514TBM01_SYS_VALUE[0] ;
         AV42W_SYS_CRFID = A514TBM01_SYS_VALUE ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV33W_CRFID_COLS.clear();
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           new Long(AV15D_STUDY_ID) ,
                                           new Long(A217TBM31_STUDY_ID) ,
                                           new Short(A218TBM31_CRF_ID) ,
                                           A551TBM31_STATUS ,
                                           A223TBM31_DEL_FLG },
                                           new int[] {
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H001C6 */
      pr_default.execute(4, new Object[] {new Long(AV15D_STUDY_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A223TBM31_DEL_FLG = H001C6_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = H001C6_n223TBM31_DEL_FLG[0] ;
         A551TBM31_STATUS = H001C6_A551TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
         n551TBM31_STATUS = H001C6_n551TBM31_STATUS[0] ;
         A218TBM31_CRF_ID = H001C6_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         A217TBM31_STUDY_ID = H001C6_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         AV33W_CRFID_COLS.add((short)(A218TBM31_CRF_ID), 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor H001C7 */
      pr_default.execute(5, new Object[] {AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A597TBW01_DISP_DATETIME = H001C7_A597TBW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597TBW01_DISP_DATETIME", A597TBW01_DISP_DATETIME);
         A596TBW01_APP_ID = H001C7_A596TBW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A596TBW01_APP_ID", A596TBW01_APP_ID);
         A595TBW01_SESSION_ID = H001C7_A595TBW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595TBW01_SESSION_ID", A595TBW01_SESSION_ID);
         A599TBW01_FREE_SAVE_1 = H001C7_A599TBW01_FREE_SAVE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A599TBW01_FREE_SAVE_1", A599TBW01_FREE_SAVE_1);
         n599TBW01_FREE_SAVE_1 = H001C7_n599TBW01_FREE_SAVE_1[0] ;
         AV27W_B405_WP01_SD01.fromxml(A599TBW01_FREE_SAVE_1, "");
         if ( ( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Chk() ) && ( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Chk_visbale() ) )
         {
            AV31W_COND_OK = false ;
            /* Using cursor H001C8 */
            pr_default.execute(6, new Object[] {AV42W_SYS_CRFID, new Long(AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id())});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A246TBM33_STUDY_ID = H001C8_A246TBM33_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
               A251TBM33_DEL_FLG = H001C8_A251TBM33_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A251TBM33_DEL_FLG", A251TBM33_DEL_FLG);
               n251TBM33_DEL_FLG = H001C8_n251TBM33_DEL_FLG[0] ;
               A248TBM33_COND_NO = H001C8_A248TBM33_COND_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
               A247TBM33_CRF_ID = H001C8_A247TBM33_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
               A249TBM33_EXPRESSION = H001C8_A249TBM33_EXPRESSION[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A249TBM33_EXPRESSION", A249TBM33_EXPRESSION);
               n249TBM33_EXPRESSION = H001C8_n249TBM33_EXPRESSION[0] ;
               A250TBM33_PRIOR_NO = H001C8_A250TBM33_PRIOR_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A250TBM33_PRIOR_NO", GXutil.ltrim( GXutil.str( A250TBM33_PRIOR_NO, 2, 0)));
               n250TBM33_PRIOR_NO = H001C8_n250TBM33_PRIOR_NO[0] ;
               AV30W_COND_HYOKA = (short)(0) ;
               if ( ! (GXutil.strcmp("", A249TBM33_EXPRESSION)==0) )
               {
                  GXv_int4[0] = AV30W_COND_HYOKA ;
                  GXv_char3[0] = "" ;
                  new b405_pc01_cond_hyoka(remoteHandle, context).execute( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id(), AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id(), A249TBM33_EXPRESSION, GXv_int4, GXv_char3) ;
                  b405_wp01_kanja_crf_list_impl.this.AV30W_COND_HYOKA = GXv_int4[0] ;
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
                  httpContext.ajax_rsp_assign_attri("", false, "A249TBM33_EXPRESSION", A249TBM33_EXPRESSION);
               }
               if ( ( AV30W_COND_HYOKA > 0 ) || (GXutil.strcmp("", A249TBM33_EXPRESSION)==0) )
               {
                  pr_default.dynParam(7, new Object[]{ new Object[]{
                                                       new Short(A487TBM36_SELECT_CRF_ID) ,
                                                       AV33W_CRFID_COLS ,
                                                       A488TBM36_DEL_FLG ,
                                                       new Long(A246TBM33_STUDY_ID) ,
                                                       new Short(A247TBM33_CRF_ID) ,
                                                       new Short(A248TBM33_COND_NO) ,
                                                       new Long(A484TBM36_STUDY_ID) ,
                                                       new Short(A485TBM36_CRF_ID) ,
                                                       new Short(A486TBM36_COND_NO) },
                                                       new int[] {
                                                       TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.SHORT
                                                       }
                  });
                  /* Using cursor H001C9 */
                  pr_default.execute(7, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
                  while ( (pr_default.getStatus(7) != 101) )
                  {
                     A484TBM36_STUDY_ID = H001C9_A484TBM36_STUDY_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
                     A485TBM36_CRF_ID = H001C9_A485TBM36_CRF_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
                     A486TBM36_COND_NO = H001C9_A486TBM36_COND_NO[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
                     A487TBM36_SELECT_CRF_ID = H001C9_A487TBM36_SELECT_CRF_ID[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
                     A488TBM36_DEL_FLG = H001C9_A488TBM36_DEL_FLG[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A488TBM36_DEL_FLG", A488TBM36_DEL_FLG);
                     n488TBM36_DEL_FLG = H001C9_n488TBM36_DEL_FLG[0] ;
                     AV6BC_TBT02_CRF = (SdtTBT02_CRF)new SdtTBT02_CRF( remoteHandle, context);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( AV78Pgmname );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_study_id( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id() );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                     AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( A487TBM36_SELECT_CRF_ID );
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
                        GXt_char2 = AV34W_ERR_MSG ;
                        GXv_char3[0] = GXt_char2 ;
                        new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char3) ;
                        b405_wp01_kanja_crf_list_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV34W_ERR_MSG = GXt_char2 ;
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                     pr_default.readNext(7);
                  }
                  pr_default.close(7);
                  AV31W_COND_OK = true ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(6);
            }
            pr_default.close(6);
            if ( ! AV31W_COND_OK && ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 ) )
            {
               AV86GXV31 = 1 ;
               while ( AV86GXV31 <= AV33W_CRFID_COLS.size() )
               {
                  AV32W_CRFID_COL = ((Number) AV33W_CRFID_COLS.elementAt(-1+AV86GXV31)).shortValue() ;
                  AV6BC_TBT02_CRF = (SdtTBT02_CRF)new SdtTBT02_CRF( remoteHandle, context);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( AV78Pgmname );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_study_id( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_study_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Tbt01_subject_id() );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6BC_TBT02_CRF", AV6BC_TBT02_CRF);
                  AV6BC_TBT02_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( AV32W_CRFID_COL );
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
                     GXt_char2 = AV34W_ERR_MSG ;
                     GXv_char3[0] = GXt_char2 ;
                     new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV6BC_TBT02_CRF.GetMessages(), (byte)(0), GXv_char3) ;
                     b405_wp01_kanja_crf_list_impl.this.GXt_char2 = GXv_char3[0] ;
                     AV34W_ERR_MSG = GXt_char2 ;
                     if (true) break;
                  }
                  AV86GXV31 = (int)(AV86GXV31+1) ;
               }
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         new b805_pc01_work_del(remoteHandle, context).execute( AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
      }
   }

   public void e121C2( )
   {
      /* 'BTN_SRCH' Routine */
      new b805_pc01_work_del(remoteHandle, context).execute( AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
      AV22H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22H_SRCH_FLG", AV22H_SRCH_FLG);
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
   }

   public void e131C2( )
   {
      /* 'BTN_CLER' Routine */
      new b805_pc01_work_del(remoteHandle, context).execute( AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
   }

   public void e331C2( )
   {
      /* Btn_sel_Click Routine */
      AV40W_SEL_LINE_NO = (short)(A598TBW01_LINE_NO) ;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
      {
         AV41W_SESSION.setValue(AV78Pgmname+"_PAGE", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18H_COL_COUNT,4,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id())) + "," + GXutil.URLEncode(GXutil.rtrim(AV8C_TAM02_APP_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV19H_DISP_DATETIME)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV40W_SEL_LINE_NO,4,0))) ;
         httpContext.wjLoc = formatLink("b405_wp02_kanja_crf_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
      }
   }

   public void e141C2( )
   {
      /* D_grd_chk_all_Click Routine */
      /* Using cursor H001C10 */
      pr_default.execute(8, new Object[] {AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A597TBW01_DISP_DATETIME = H001C10_A597TBW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597TBW01_DISP_DATETIME", A597TBW01_DISP_DATETIME);
         A596TBW01_APP_ID = H001C10_A596TBW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A596TBW01_APP_ID", A596TBW01_APP_ID);
         A595TBW01_SESSION_ID = H001C10_A595TBW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595TBW01_SESSION_ID", A595TBW01_SESSION_ID);
         A598TBW01_LINE_NO = H001C10_A598TBW01_LINE_NO[0] ;
         AV27W_B405_WP01_SD01 = (SdtB405_SD01)new SdtB405_SD01(remoteHandle, context);
         AV5BC_FREE_WORK.Load(AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME, A598TBW01_LINE_NO);
         if ( AV5BC_FREE_WORK.Fail() )
         {
            GXt_char2 = AV34W_ERR_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char3) ;
            b405_wp01_kanja_crf_list_impl.this.GXt_char2 = GXv_char3[0] ;
            AV34W_ERR_MSG = GXt_char2 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV27W_B405_WP01_SD01.fromxml(AV5BC_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1(), "");
         AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk( AV11D_GRD_CHK_ALL );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
         AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV27W_B405_WP01_SD01.toxml(false, "B405_SD01", "SmartEDC_SHIZUOKA") );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
         AV5BC_FREE_WORK.Save();
         if ( AV5BC_FREE_WORK.Fail() )
         {
            GXt_char2 = AV34W_ERR_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char3) ;
            b405_wp01_kanja_crf_list_impl.this.GXt_char2 = GXv_char3[0] ;
            AV34W_ERR_MSG = GXt_char2 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
         Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
      }
   }

   public void e151C2( )
   {
      /* 'PAGE_FIRST' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e161C2( )
   {
      /* 'PAGE_LAST' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() < 1 )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      else
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e171C2( )
   {
      /* 'PAGE_BACK' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e181C2( )
   {
      /* 'PAGE_NEXT' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e191C2( )
   {
      /* 'PAGE01' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201C2( )
   {
      /* 'PAGE02' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211C2( )
   {
      /* 'PAGE03' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221C2( )
   {
      /* 'PAGE04' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231C2( )
   {
      /* 'PAGE05' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241C2( )
   {
      /* 'PAGE06' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251C2( )
   {
      /* 'PAGE07' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261C2( )
   {
      /* 'PAGE08' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271C2( )
   {
      /* 'PAGE09' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e281C2( )
   {
      /* 'PAGE10' Routine */
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( subGrid1_Rows );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      if ( ((int)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()) % (AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row())) == 0 )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()/ (double) (AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row())) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      else
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()/ (double) (AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row())+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      GXv_SdtA_PAGING_SDT5[0] = AV17H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT5) ;
      AV17H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT5[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_list_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         if ( GXutil.strcmp(AV22H_SRCH_FLG, "1") == 0 )
         {
            GXt_char2 = AV37W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char3) ;
            b405_wp01_kanja_crf_list_impl.this.GXt_char2 = GXv_char3[0] ;
            AV37W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV37W_MSG);
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

   public void S192( )
   {
      /* 'SUB_QUERY' Routine */
      if ( GXutil.strcmp(AV22H_SRCH_FLG, "1") == 0 )
      {
         AV29W_CNT = 0 ;
         pr_default.dynParam(9, new Object[]{ new Object[]{
                                              new Long(AV15D_STUDY_ID) ,
                                              AV16D_TBT01_OUTER_SUBJECT_ID ,
                                              new Long(A282TBT01_STUDY_ID) ,
                                              A555TBT01_OUTER_SUBJECT_ID ,
                                              A284TBT01_DEL_FLG },
                                              new int[] {
                                              TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         /* Using cursor H001C11 */
         pr_default.execute(9, new Object[] {new Long(AV15D_STUDY_ID), AV16D_TBT01_OUTER_SUBJECT_ID});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A284TBT01_DEL_FLG = H001C11_A284TBT01_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
            n284TBT01_DEL_FLG = H001C11_n284TBT01_DEL_FLG[0] ;
            A555TBT01_OUTER_SUBJECT_ID = H001C11_A555TBT01_OUTER_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A555TBT01_OUTER_SUBJECT_ID", A555TBT01_OUTER_SUBJECT_ID);
            n555TBT01_OUTER_SUBJECT_ID = H001C11_n555TBT01_OUTER_SUBJECT_ID[0] ;
            A282TBT01_STUDY_ID = H001C11_A282TBT01_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
            A283TBT01_SUBJECT_ID = H001C11_A283TBT01_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
            AV27W_B405_WP01_SD01 = (SdtB405_SD01)new SdtB405_SD01(remoteHandle, context);
            AV28W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)new SdtB405_SD01_CRF_Item(remoteHandle, context);
            if ( AV11D_GRD_CHK_ALL )
            {
               AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            }
            AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Tbt01_study_id( A282TBT01_STUDY_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Tbt01_subject_id( A283TBT01_SUBJECT_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Hikensha_id( A555TBT01_OUTER_SUBJECT_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            AV44W_TBT01_STUDY_ID = A282TBT01_STUDY_ID ;
            AV45W_TBT01_SUBJECT_ID = A283TBT01_SUBJECT_ID ;
            AV38W_NO_SEL_CRF = true ;
            AV39W_RES_FLG = false ;
            pr_default.dynParam(10, new Object[]{ new Object[]{
                                                 new Long(AV15D_STUDY_ID) ,
                                                 new Long(A217TBM31_STUDY_ID) ,
                                                 new Short(A218TBM31_CRF_ID) ,
                                                 A551TBM31_STATUS ,
                                                 A223TBM31_DEL_FLG },
                                                 new int[] {
                                                 TypeConstants.LONG, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                                 }
            });
            /* Using cursor H001C12 */
            pr_default.execute(10, new Object[] {new Long(AV15D_STUDY_ID)});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A223TBM31_DEL_FLG = H001C12_A223TBM31_DEL_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
               n223TBM31_DEL_FLG = H001C12_n223TBM31_DEL_FLG[0] ;
               A551TBM31_STATUS = H001C12_A551TBM31_STATUS[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
               n551TBM31_STATUS = H001C12_n551TBM31_STATUS[0] ;
               A218TBM31_CRF_ID = H001C12_A218TBM31_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
               A217TBM31_STUDY_ID = H001C12_A217TBM31_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
               AV43W_TBM31_CRF_ID = A218TBM31_CRF_ID ;
               AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_id( A218TBM31_CRF_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
               AV90GXLvl753 = (byte)(0) ;
               /* Using cursor H001C13 */
               pr_default.execute(11, new Object[] {new Long(AV44W_TBT01_STUDY_ID), new Integer(AV45W_TBT01_SUBJECT_ID), new Short(AV43W_TBM31_CRF_ID)});
               while ( (pr_default.getStatus(11) != 101) )
               {
                  A294TBT02_CRF_ID = H001C13_A294TBT02_CRF_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
                  A293TBT02_SUBJECT_ID = H001C13_A293TBT02_SUBJECT_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
                  A292TBT02_STUDY_ID = H001C13_A292TBT02_STUDY_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
                  A370TBT02_CRF_LATEST_VERSION = H001C13_A370TBT02_CRF_LATEST_VERSION[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)));
                  n370TBT02_CRF_LATEST_VERSION = H001C13_n370TBT02_CRF_LATEST_VERSION[0] ;
                  AV90GXLvl753 = (byte)(1) ;
                  AV38W_NO_SEL_CRF = false ;
                  if ( A370TBT02_CRF_LATEST_VERSION == 0 )
                  {
                     AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status( "○" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                     AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status_n( (byte)(1) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                  }
                  else
                  {
                     AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status( "●" );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                     AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status_n( (byte)(2) );
                     httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                  }
                  AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Tbt02_crf_latest_version( A370TBT02_CRF_LATEST_VERSION );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(11);
               if ( AV90GXLvl753 == 0 )
               {
                  AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status( "" );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
                  AV28W_B405_WP01_SD01_CRF_ITEM.setgxTv_SdtB405_SD01_CRF_Item_Status_n( (byte)(0) );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_B405_WP01_SD01_CRF_ITEM", AV28W_B405_WP01_SD01_CRF_ITEM);
               }
               AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().add(AV28W_B405_WP01_SD01_CRF_ITEM.Clone(), 0);
               pr_default.readNext(10);
            }
            pr_default.close(10);
            if ( AV9W_CRF_SEL_ONLY )
            {
               if ( AV38W_NO_SEL_CRF )
               {
                  AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk_visbale( true );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
                  AV39W_RES_FLG = true ;
               }
            }
            else
            {
               if ( AV38W_NO_SEL_CRF )
               {
                  AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk_visbale( true );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
               }
               else
               {
                  AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk_visbale( false );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
               }
               AV39W_RES_FLG = true ;
            }
            if ( AV39W_RES_FLG )
            {
               AV29W_CNT = (long)(AV29W_CNT+1) ;
               AV5BC_FREE_WORK = (SdtTBW01_FREE_WORK)new SdtTBW01_FREE_WORK( remoteHandle, context);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_session_id( AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id() );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_app_id( AV8C_TAM02_APP_ID );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_disp_datetime( AV19H_DISP_DATETIME );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_line_no( AV29W_CNT );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV27W_B405_WP01_SD01.toxml(false, "B405_SD01", "SmartEDC_SHIZUOKA") );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
               AV5BC_FREE_WORK.Save();
               if ( AV5BC_FREE_WORK.Fail() )
               {
                  GXt_char2 = AV34W_ERR_MSG ;
                  GXv_char3[0] = GXt_char2 ;
                  new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char3) ;
                  b405_wp01_kanja_crf_list_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV34W_ERR_MSG = GXt_char2 ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            pr_default.readNext(9);
         }
         pr_default.close(9);
         if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         }
         else
         {
            httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
            Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         }
      }
   }

   public void S182( )
   {
      /* 'SUB_GRID_TO_WORK' Routine */
      if ( ! AV36W_GRID_READ_FLG )
      {
         AV36W_GRID_READ_FLG = true ;
         AV27W_B405_WP01_SD01 = (SdtB405_SD01)new SdtB405_SD01(remoteHandle, context);
         /* Start For Each Line in Grid1 */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         nGXsfl_175_fel_idx = (short)(0) ;
         while ( nGXsfl_175_fel_idx < nRC_Grid1 )
         {
            nGXsfl_175_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_175_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_175_fel_idx+1)) ;
            sGXsfl_175_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_175_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_175_fel_idx );
            edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_175_fel_idx ;
            lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_175_fel_idx ;
            edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_175_fel_idx ;
            subGrid2_Internalname = "GRID2_"+sGXsfl_175_fel_idx ;
            AV12D_GRD1_CHECK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd1_check.getInternalname())) ;
            AV13D_GRD1_HIKENSHA = httpContext.cgiGet( edtavD_grd1_hikensha_Internalname) ;
            A598TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") ;
            AV5BC_FREE_WORK.Load(AV25W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV8C_TAM02_APP_ID, AV19H_DISP_DATETIME, A598TBW01_LINE_NO);
            if ( AV5BC_FREE_WORK.Fail() )
            {
               GXt_char2 = AV34W_ERR_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char3) ;
               b405_wp01_kanja_crf_list_impl.this.GXt_char2 = GXv_char3[0] ;
               AV34W_ERR_MSG = GXt_char2 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV27W_B405_WP01_SD01.fromxml(AV5BC_FREE_WORK.getgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1(), "");
            AV27W_B405_WP01_SD01.setgxTv_SdtB405_SD01_Chk( AV12D_GRD1_CHECK );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27W_B405_WP01_SD01", AV27W_B405_WP01_SD01);
            AV5BC_FREE_WORK.setgxTv_SdtTBW01_FREE_WORK_Tbw01_free_save_1( AV27W_B405_WP01_SD01.toxml(false, "B405_SD01", "SmartEDC_SHIZUOKA") );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_FREE_WORK", AV5BC_FREE_WORK);
            AV5BC_FREE_WORK.Save();
            if ( AV5BC_FREE_WORK.Fail() )
            {
               GXt_char2 = AV34W_ERR_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_FREE_WORK.GetMessages(), (byte)(0), GXv_char3) ;
               b405_wp01_kanja_crf_list_impl.this.GXt_char2 = GXv_char3[0] ;
               AV34W_ERR_MSG = GXt_char2 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_175_fel_idx == 0 )
         {
            nGXsfl_175_idx = (short)(1) ;
            sGXsfl_175_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_175_idx, 4, 0)), (short)(4), "0") ;
            chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_175_idx );
            edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_175_idx ;
            lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_175_idx ;
            edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_175_idx ;
            subGrid2_Internalname = "GRID2_"+sGXsfl_175_idx ;
         }
         nGXsfl_175_fel_idx = (short)(1) ;
         if ( GXutil.strcmp(AV34W_ERR_MSG, "") == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         }
         else
         {
            httpContext.GX_msglist.addItem(AV34W_ERR_MSG);
            Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV24P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV41W_SESSION.getValue(AV78Pgmname+"_PAGE"))) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      else
      {
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S202( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV41W_SESSION.setValue(AV78Pgmname+"_STUDY_ID", GXutil.str( AV15D_STUDY_ID, 10, 0));
      AV41W_SESSION.setValue(AV78Pgmname+"_OUTER_SUBJECT_ID", AV16D_TBT01_OUTER_SUBJECT_ID);
      AV41W_SESSION.setValue(AV78Pgmname+"_CRF_SEL_ONLY", GXutil.booltostr( AV9W_CRF_SEL_ONLY));
      AV41W_SESSION.setValue(AV78Pgmname+"_GRD_CHK_ALL", GXutil.booltostr( AV11D_GRD_CHK_ALL));
      AV41W_SESSION.setValue(AV78Pgmname+"_SRCH_FLG", AV22H_SRCH_FLG);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV15D_STUDY_ID = GXutil.lval( AV41W_SESSION.getValue(AV78Pgmname+"_STUDY_ID")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15D_STUDY_ID", GXutil.ltrim( GXutil.str( AV15D_STUDY_ID, 10, 0)));
      AV16D_TBT01_OUTER_SUBJECT_ID = AV41W_SESSION.getValue(AV78Pgmname+"_OUTER_SUBJECT_ID") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16D_TBT01_OUTER_SUBJECT_ID", AV16D_TBT01_OUTER_SUBJECT_ID);
      if ( GXutil.strcmp(AV41W_SESSION.getValue(AV78Pgmname+"_CRF_SEL_ONLY"), "true") == 0 )
      {
         AV9W_CRF_SEL_ONLY = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9W_CRF_SEL_ONLY", GXutil.booltostr( AV9W_CRF_SEL_ONLY));
      }
      else
      {
         AV9W_CRF_SEL_ONLY = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9W_CRF_SEL_ONLY", GXutil.booltostr( AV9W_CRF_SEL_ONLY));
      }
      if ( GXutil.strcmp(AV41W_SESSION.getValue(AV78Pgmname+"_GRD_CHK_ALL"), "true") == 0 )
      {
         AV11D_GRD_CHK_ALL = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_CHK_ALL", GXutil.booltostr( AV11D_GRD_CHK_ALL));
      }
      else
      {
         AV11D_GRD_CHK_ALL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_CHK_ALL", GXutil.booltostr( AV11D_GRD_CHK_ALL));
      }
      AV22H_SRCH_FLG = AV41W_SESSION.getValue(AV78Pgmname+"_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22H_SRCH_FLG", AV22H_SRCH_FLG);
   }

   public void S212( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV41W_SESSION.remove(AV78Pgmname+"_STUDY_ID");
      AV41W_SESSION.remove(AV78Pgmname+"_OUTER_SUBJECT_ID");
      AV41W_SESSION.remove(AV78Pgmname+"_CRF_SEL_ONLY");
      AV41W_SESSION.remove(AV78Pgmname+"_GRD_CHK_ALL");
      AV41W_SESSION.remove(AV78Pgmname+"_SRCH_FLG");
   }

   public void S152( )
   {
      /* 'SUB_EDIT_COMBO' Routine */
      cmbavD_study_id.removeAllItems();
      cmbavD_study_id.addItem("         0", " ", (short)(0));
      /* Using cursor H001C14 */
      pr_default.execute(12);
      while ( (pr_default.getStatus(12) != 101) )
      {
         A189TBM21_DEL_FLG = H001C14_A189TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         n189TBM21_DEL_FLG = H001C14_n189TBM21_DEL_FLG[0] ;
         A513TBM21_STATUS = H001C14_A513TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
         n513TBM21_STATUS = H001C14_n513TBM21_STATUS[0] ;
         A187TBM21_STUDY_NM = H001C14_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H001C14_n187TBM21_STUDY_NM[0] ;
         A186TBM21_STUDY_ID = H001C14_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         cmbavD_study_id.addItem(GXutil.str( A186TBM21_STUDY_ID, 10, 0), GXutil.str( A186TBM21_STUDY_ID, 10, 0)+" "+A187TBM21_STUDY_NM, (short)(0));
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV25W_A_LOGIN_SDT;
      GXv_char3[0] = AV35W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char3) ;
      AV25W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b405_wp01_kanja_crf_list_impl.this.AV35W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV35W_ERRCD, "0") != 0 )
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
      AV16D_TBT01_OUTER_SUBJECT_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16D_TBT01_OUTER_SUBJECT_ID", AV16D_TBT01_OUTER_SUBJECT_ID);
      AV9W_CRF_SEL_ONLY = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9W_CRF_SEL_ONLY", GXutil.booltostr( AV9W_CRF_SEL_ONLY));
      AV11D_GRD_CHK_ALL = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_CHK_ALL", GXutil.booltostr( AV11D_GRD_CHK_ALL));
      AV22H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22H_SRCH_FLG", AV22H_SRCH_FLG);
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
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
      GXv_char3[0] = AV21H_KNGN_FLG ;
      GXv_char7[0] = AV35W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV8C_TAM02_APP_ID, GXv_char3, GXv_char7) ;
      b405_wp01_kanja_crf_list_impl.this.AV21H_KNGN_FLG = GXv_char3[0] ;
      b405_wp01_kanja_crf_list_impl.this.AV35W_ERRCD = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
      if ( GXutil.strcmp(AV35W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S231079( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV78Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b405_wp01_kanja_crf_list");
   }

   private void e321C4( )
   {
      /* Grid1_Load Routine */
      if ( A598TBW01_LINE_NO >= AV46W_TOP_LINE_NO )
      {
         tblTbl_grd1_hidden_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grd1_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grd1_hidden_Visible, 5, 0)));
         AV27W_B405_WP01_SD01.fromxml(A599TBW01_FREE_SAVE_1, "");
         AV12D_GRD1_CHECK = AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Chk() ;
         chkavD_grd1_check.setVisible( (AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Chk_visbale() ? 1 : 0) );
         AV13D_GRD1_HIKENSHA = AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Hikensha_id() ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(175) ;
      }
      if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_1754( ) ;
      }
      GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
   }

   private void e341C5( )
   {
      /* Grid2_Load Routine */
      AV80GXV30 = 1 ;
      while ( AV80GXV30 <= AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().size() )
      {
         AV28W_B405_WP01_SD01_CRF_ITEM = (SdtB405_SD01_CRF_Item)((SdtB405_SD01_CRF_Item)AV27W_B405_WP01_SD01.getgxTv_SdtB405_SD01_Crf().elementAt(-1+AV80GXV30));
         AV14D_GRD2_CRF_STATUS = AV28W_B405_WP01_SD01_CRF_ITEM.getgxTv_SdtB405_SD01_CRF_Item_Status() ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(194) ;
         }
         sendrow_1945( ) ;
         AV80GXV30 = (int)(AV80GXV30+1) ;
      }
   }

   public void wb_table2_205_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV20H_INIT_FLG), GXutil.rtrim( localUtil.format( AV20H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(209);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV22H_SRCH_FLG", AV22H_SRCH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV22H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV22H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(210);\"", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV21H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV21H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(211);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DISP_DATETIME", AV19H_DISP_DATETIME);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 212,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_disp_datetime_Internalname, GXutil.rtrim( AV19H_DISP_DATETIME), GXutil.rtrim( localUtil.format( AV19H_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(212);\"", "", "", "", "", edtavH_disp_datetime_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_COL_COUNT", GXutil.ltrim( GXutil.str( AV18H_COL_COUNT, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_col_count_Internalname, GXutil.ltrim( localUtil.ntoc( AV18H_COL_COUNT, (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18H_COL_COUNT), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV18H_COL_COUNT), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(213);\"", "", "", "", "", edtavH_col_count_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         wb_table3_214_1C2( true) ;
      }
      else
      {
         wb_table3_214_1C2( false) ;
      }
      return  ;
   }

   public void wb_table3_214_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_205_1C2e( true) ;
      }
      else
      {
         wb_table2_205_1C2e( false) ;
      }
   }

   public void wb_table3_214_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(219);\"", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:21px\">") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "MAX_PAGE", "", "", lblTextblock2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_page_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(224);\"", "", "", "", "", edtavCtlmax_page_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:21px\">") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "REC_CNT", "", "", lblTextblock3_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(229);\"", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "PAGE_NO", "", "", lblTextblock4_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(234);\"", "", "", "", "", edtavCtlpage_no_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "PAGE01", "", "", lblTextblock5_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage01_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(239);\"", "", "", "", "", edtavCtlpage01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "PAGE02", "", "", lblTextblock6_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage02_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(244);\"", "", "", "", "", edtavCtlpage02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "PAGE03", "", "", lblTextblock7_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage03_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(249);\"", "", "", "", "", edtavCtlpage03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "PAGE04", "", "", lblTextblock8_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage04_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(254);\"", "", "", "", "", edtavCtlpage04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, "PAGE05", "", "", lblTextblock9_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage05_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(259);\"", "", "", "", "", edtavCtlpage05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "PAGE06", "", "", lblTextblock10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage06_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(264);\"", "", "", "", "", edtavCtlpage06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, "PAGE07", "", "", lblTextblock11_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage07_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(269);\"", "", "", "", "", edtavCtlpage07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, "PAGE08", "", "", lblTextblock12_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage08_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(274);\"", "", "", "", "", edtavCtlpage08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, "PAGE09", "", "", lblTextblock14_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage09_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(279);\"", "", "", "", "", edtavCtlpage09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "PAGE10", "", "", lblTextblock15_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()", GXutil.ltrim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage10_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(284);\"", "", "", "", "", edtavCtlpage10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "PAGE_DISP01", "", "", lblTextblock17_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp01_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(289);\"", "", "", "", "", edtavCtlpage_disp01_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, "PAGE_DISP02", "", "", lblTextblock19_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp02_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(294);\"", "", "", "", "", edtavCtlpage_disp02_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, "PAGE_DISP03", "", "", lblTextblock20_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp03_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(299);\"", "", "", "", "", edtavCtlpage_disp03_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, "PAGE_DISP04", "", "", lblTextblock21_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp04_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(304);\"", "", "", "", "", edtavCtlpage_disp04_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, "PAGE_DISP05", "", "", lblTextblock22_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp05_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(309);\"", "", "", "", "", edtavCtlpage_disp05_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, "PAGE_DISP06", "", "", lblTextblock23_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp06_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(314);\"", "", "", "", "", edtavCtlpage_disp06_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, "PAGE_DISP07", "", "", lblTextblock24_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 319,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp07_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(319);\"", "", "", "", "", edtavCtlpage_disp07_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, "PAGE_DISP08", "", "", lblTextblock25_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 324,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp08_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(324);\"", "", "", "", "", edtavCtlpage_disp08_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, "PAGE_DISP09", "", "", lblTextblock26_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 329,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp09_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(329);\"", "", "", "", "", edtavCtlpage_disp09_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, "PAGE_DISP10", "", "", lblTextblock27_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 334,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp10_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(334);\"", "", "", "", "", edtavCtlpage_disp10_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "PAGE_DISP_BACK", "", "", lblTextblock28_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 339,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_back_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(339);\"", "", "", "", "", edtavCtlpage_disp_back_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "PAGE_DISP_NEXT", "", "", lblTextblock29_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 344,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_next_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(344);\"", "", "", "", "", edtavCtlpage_disp_next_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "PAGE_DISP_FIRST", "", "", lblTextblock30_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 349,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_first_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(349);\"", "", "", "", "", edtavCtlpage_disp_first_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "PAGE_DISP_LAST", "", "", lblTextblock31_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_last_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(354);\"", "", "", "", "", edtavCtlpage_disp_last_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "PAGE_DISP_AREA", "", "", lblTextblock32_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 359,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlpage_disp_area_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area(), (byte)(1), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")) : localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area()), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(359);\"", "", "", "", "", edtavCtlpage_disp_area_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_214_1C2e( true) ;
      }
      else
      {
         wb_table3_214_1C2e( false) ;
      }
   }

   public void wb_table1_2_1C2( boolean wbgen )
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
         wb_table4_6_1C2( true) ;
      }
      else
      {
         wb_table4_6_1C2( false) ;
      }
      return  ;
   }

   public void wb_table4_6_1C2e( boolean wbgen )
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
         wb_table1_2_1C2e( true) ;
      }
      else
      {
         wb_table1_2_1C2e( false) ;
      }
   }

   public void wb_table4_6_1C2( boolean wbgen )
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
         wb_table5_12_1C2( true) ;
      }
      else
      {
         wb_table5_12_1C2( false) ;
      }
      return  ;
   }

   public void wb_table5_12_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table6_18_1C2( true) ;
      }
      else
      {
         wb_table6_18_1C2( false) ;
      }
      return  ;
   }

   public void wb_table6_18_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0203"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0203"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0203"+"");
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
         wb_table4_6_1C2e( true) ;
      }
      else
      {
         wb_table4_6_1C2e( false) ;
      }
   }

   public void wb_table6_18_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_21_1C2( true) ;
      }
      else
      {
         wb_table7_21_1C2( false) ;
      }
      return  ;
   }

   public void wb_table7_21_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_18_1C2e( true) ;
      }
      else
      {
         wb_table6_18_1C2e( false) ;
      }
   }

   public void wb_table7_21_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_24_1C2( true) ;
      }
      else
      {
         wb_table8_24_1C2( false) ;
      }
      return  ;
   }

   public void wb_table8_24_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:5px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         httpContext.writeText( "<div style=\"WIDTH: 942px; HEIGHT: 397px\" class=\"SectionScroll_NoLine\" id=\"Section1\">") ;
         wb_table9_55_1C2( true) ;
      }
      else
      {
         wb_table9_55_1C2( false) ;
      }
      return  ;
   }

   public void wb_table9_55_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_21_1C2e( true) ;
      }
      else
      {
         wb_table7_21_1C2e( false) ;
      }
   }

   public void wb_table9_55_1C2( boolean wbgen )
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
         httpContext.writeText( "<td>") ;
         wb_table10_58_1C2( true) ;
      }
      else
      {
         wb_table10_58_1C2( false) ;
      }
      return  ;
   }

   public void wb_table10_58_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" colspan=\"2\" >") ;
         wb_table11_154_1C2( true) ;
      }
      else
      {
         wb_table11_154_1C2( false) ;
      }
      return  ;
   }

   public void wb_table11_154_1C2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"175\">") ;
            sStyleString = "" ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.booltostr( AV12D_GRD1_CHECK));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavD_grd1_check.getVisible(), (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV13D_GRD1_HIKENSHA));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd1_hikensha_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblBtn_sel_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A598TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")));
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
      if ( wbEnd == 175 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_175_idx-1) ;
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
         wb_table9_55_1C2e( true) ;
      }
      else
      {
         wb_table9_55_1C2e( false) ;
      }
   }

   public void wb_table11_154_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         wb_table12_157_1C2( true) ;
      }
      else
      {
         wb_table12_157_1C2( false) ;
      }
      return  ;
   }

   public void wb_table12_157_1C2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grd_titleContainer"+"DivS\" gxgridid=\"166\">") ;
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
            Grd_titleColumn.AddObjectProperty("Value", GXutil.rtrim( AV10D_CRFSNM));
            Grd_titleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_crfsnm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grd_titleContainer.AddColumnProperties(Grd_titleColumn);
            Grd_titleContainer.AddObjectProperty("Allowselection", "true");
            Grd_titleContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrd_title_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Allowhover", "true");
            Grd_titleContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrd_title_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grd_titleContainer.AddObjectProperty("Allowcollapsing", ((subGrd_title_Allowcollapsing==1) ? "true" : "false"));
            Grd_titleContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrd_title_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 166 )
      {
         wbEnd = (short)(0) ;
         nRC_Grd_title = (short)(nGXsfl_166_idx-1) ;
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
         wb_table11_154_1C2e( true) ;
      }
      else
      {
         wb_table11_154_1C2e( false) ;
      }
   }

   public void wb_table12_157_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 35, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_in_grid_header_Internalname, tblTbl_in_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:28px;width:60px\">") ;
         /* Check box */
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_CHK_ALL", GXutil.booltostr( AV11D_GRD_CHK_ALL));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd_chk_all.getInternalname(), GXutil.booltostr( AV11D_GRD_CHK_ALL), "", 1, 1, "true", "", StyleString, ClassString, TempTags+" onclick=\"gx.fn.checkboxClick(160, this, 'true', 'false');gx.ajax.executeCliEvent('e141c2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(160);\"");
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "全て", "", "", lblTextblock36_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:70px\">") ;
         /* Text block */
         ClassString = "TextBlockGridHeader" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "被験者ID", "", "", lblTextblock13_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_157_1C2e( true) ;
      }
      else
      {
         wb_table12_157_1C2e( false) ;
      }
   }

   public void wb_table10_58_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_64_1C2( true) ;
      }
      else
      {
         wb_table13_64_1C2( false) ;
      }
      return  ;
   }

   public void wb_table13_64_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_58_1C2e( true) ;
      }
      else
      {
         wb_table10_58_1C2e( false) ;
      }
   }

   public void wb_table13_64_1C2( boolean wbgen )
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
         wb_table14_67_1C2( true) ;
      }
      else
      {
         wb_table14_67_1C2( false) ;
      }
      return  ;
   }

   public void wb_table14_67_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_73_1C2( true) ;
      }
      else
      {
         wb_table15_73_1C2( false) ;
      }
      return  ;
   }

   public void wb_table15_73_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_79_1C2( true) ;
      }
      else
      {
         wb_table16_79_1C2( false) ;
      }
      return  ;
   }

   public void wb_table16_79_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_85_1C2( true) ;
      }
      else
      {
         wb_table17_85_1C2( false) ;
      }
      return  ;
   }

   public void wb_table17_85_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_91_1C2( true) ;
      }
      else
      {
         wb_table18_91_1C2( false) ;
      }
      return  ;
   }

   public void wb_table18_91_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_97_1C2( true) ;
      }
      else
      {
         wb_table19_97_1C2( false) ;
      }
      return  ;
   }

   public void wb_table19_97_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_103_1C2( true) ;
      }
      else
      {
         wb_table20_103_1C2( false) ;
      }
      return  ;
   }

   public void wb_table20_103_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_109_1C2( true) ;
      }
      else
      {
         wb_table21_109_1C2( false) ;
      }
      return  ;
   }

   public void wb_table21_109_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_115_1C2( true) ;
      }
      else
      {
         wb_table22_115_1C2( false) ;
      }
      return  ;
   }

   public void wb_table22_115_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_121_1C2( true) ;
      }
      else
      {
         wb_table23_121_1C2( false) ;
      }
      return  ;
   }

   public void wb_table23_121_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_127_1C2( true) ;
      }
      else
      {
         wb_table24_127_1C2( false) ;
      }
      return  ;
   }

   public void wb_table24_127_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_133_1C2( true) ;
      }
      else
      {
         wb_table25_133_1C2( false) ;
      }
      return  ;
   }

   public void wb_table25_133_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_139_1C2( true) ;
      }
      else
      {
         wb_table26_139_1C2( false) ;
      }
      return  ;
   }

   public void wb_table26_139_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table27_145_1C2( true) ;
      }
      else
      {
         wb_table27_145_1C2( false) ;
      }
      return  ;
   }

   public void wb_table27_145_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_64_1C2e( true) ;
      }
      else
      {
         wb_table13_64_1C2e( false) ;
      }
   }

   public void wb_table27_145_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "E\\'PAGE_LAST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_145_1C2e( true) ;
      }
      else
      {
         wb_table27_145_1C2e( false) ;
      }
   }

   public void wb_table26_139_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "E\\'PAGE_NEXT\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_139_1C2e( true) ;
      }
      else
      {
         wb_table26_139_1C2e( false) ;
      }
   }

   public void wb_table25_133_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "E\\'PAGE10\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_133_1C2e( true) ;
      }
      else
      {
         wb_table25_133_1C2e( false) ;
      }
   }

   public void wb_table24_127_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "E\\'PAGE09\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_127_1C2e( true) ;
      }
      else
      {
         wb_table24_127_1C2e( false) ;
      }
   }

   public void wb_table23_121_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "E\\'PAGE08\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_121_1C2e( true) ;
      }
      else
      {
         wb_table23_121_1C2e( false) ;
      }
   }

   public void wb_table22_115_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "E\\'PAGE07\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_115_1C2e( true) ;
      }
      else
      {
         wb_table22_115_1C2e( false) ;
      }
   }

   public void wb_table21_109_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "E\\'PAGE06\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_109_1C2e( true) ;
      }
      else
      {
         wb_table21_109_1C2e( false) ;
      }
   }

   public void wb_table20_103_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "E\\'PAGE05\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_103_1C2e( true) ;
      }
      else
      {
         wb_table20_103_1C2e( false) ;
      }
   }

   public void wb_table19_97_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "E\\'PAGE04\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_97_1C2e( true) ;
      }
      else
      {
         wb_table19_97_1C2e( false) ;
      }
   }

   public void wb_table18_91_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "E\\'PAGE03\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_91_1C2e( true) ;
      }
      else
      {
         wb_table18_91_1C2e( false) ;
      }
   }

   public void wb_table17_85_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "E\\'PAGE02\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_85_1C2e( true) ;
      }
      else
      {
         wb_table17_85_1C2e( false) ;
      }
   }

   public void wb_table16_79_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "E\\'PAGE01\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_79_1C2e( true) ;
      }
      else
      {
         wb_table16_79_1C2e( false) ;
      }
   }

   public void wb_table15_73_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "E\\'PAGE_BACK\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_73_1C2e( true) ;
      }
      else
      {
         wb_table15_73_1C2e( false) ;
      }
   }

   public void wb_table14_67_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "E\\'PAGE_FIRST\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_67_1C2e( true) ;
      }
      else
      {
         wb_table14_67_1C2e( false) ;
      }
   }

   public void wb_table8_24_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 942, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験名", "", "", lblTextblock16_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:155px\">") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15D_STUDY_ID", GXutil.ltrim( GXutil.str( AV15D_STUDY_ID, 10, 0)));
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_study_id, cmbavD_study_id.getInternalname(), GXutil.str( AV15D_STUDY_ID, 10, 0), 1, cmbavD_study_id.getJsonclick(), 0, "", "int", "", 1, 1, 0, (short)(0), 489, "px", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "", true, "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         cmbavD_study_id.setValue( GXutil.str( AV15D_STUDY_ID, 10, 0) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_study_id.getInternalname(), "Values", cmbavD_study_id.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "被験者ID", "", "", lblTextblock18_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV16D_TBT01_OUTER_SUBJECT_ID", AV16D_TBT01_OUTER_SUBJECT_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tbt01_outer_subject_id_Internalname, GXutil.rtrim( AV16D_TBT01_OUTER_SUBJECT_ID), GXutil.rtrim( localUtil.format( AV16D_TBT01_OUTER_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(33);\"", "", "", "", "", edtavD_tbt01_outer_subject_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table28_35_1C2( true) ;
      }
      else
      {
         wb_table28_35_1C2( false) ;
      }
      return  ;
   }

   public void wb_table28_35_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"submit\" colspan=\"5\"  style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         wb_table29_43_1C2( true) ;
      }
      else
      {
         wb_table29_43_1C2( false) ;
      }
      return  ;
   }

   public void wb_table29_43_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_24_1C2e( true) ;
      }
      else
      {
         wb_table8_24_1C2e( false) ;
      }
   }

   public void wb_table29_43_1C2( boolean wbgen )
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
         ClassString = "TextBlockBtn100" ;
         StyleString = "background:transparent;" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "検索（F5）", "", "", lblTextblock45_Jsonclick, "E\\'BTN_SRCH\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "クリア（F6）", "", "", lblTextblock44_Jsonclick, "E\\'BTN_CLER\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table29_43_1C2e( true) ;
      }
      else
      {
         wb_table29_43_1C2e( false) ;
      }
   }

   public void wb_table28_35_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         httpContext.ajax_rsp_assign_attri("", false, "AV9W_CRF_SEL_ONLY", GXutil.booltostr( AV9W_CRF_SEL_ONLY));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_166_idx + "',0)\"" ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavW_crf_sel_only.getInternalname(), GXutil.booltostr( AV9W_CRF_SEL_ONLY), "", 1, 1, "true", "", StyleString, ClassString, TempTags+" onclick=\"gx.fn.checkboxClick(38, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(38);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "CRF未選択のみ", "", "", lblTextblock35_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_35_1C2e( true) ;
      }
      else
      {
         wb_table28_35_1C2e( false) ;
      }
   }

   public void wb_table5_12_1C2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auto_sel_Internalname, "自動選択（F3）", "", "", lblTxt_auto_sel_Jsonclick, "E\\'BTN_AUTO_SEL\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B405_WP01_KANJA_CRF_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_1C2e( true) ;
      }
      else
      {
         wb_table5_12_1C2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV24P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24P_MOVE_KBN", GXutil.str( AV24P_MOVE_KBN, 1, 0));
      AV23P_COL_COUNT = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23P_COL_COUNT", GXutil.ltrim( GXutil.str( AV23P_COL_COUNT, 4, 0)));
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
      pa1C2( ) ;
      ws1C2( ) ;
      we1C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?155230");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b405_wp01_kanja_crf_list.js", "?155230");
      /* End function include_jscripts */
   }

   public void sendrow_1662( )
   {
      wb1C0( ) ;
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
         if ( ((int)(nGXsfl_166_idx/ (double) (0)) % (2)) == 0 )
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
      Grd_titleRow.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_in_grid_header2_Internalname+"_"+sGXsfl_166_idx,new Integer(1),"TableGridHeaderLM-1","","","","","","",new Integer(0),new Integer(1),new Integer(35),new Integer(150),"","px","px"});
      Grd_titleRow.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
      Grd_titleRow.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\""});
      /* Single line edit */
      ClassString = "ReadonlyAttribute" ;
      StyleString = "font-family:'ＭＳ Ｐゴシック'; font-size:10.0pt; font-weight:bold; font-style:normal;" ;
      ROClassString = ClassString ;
      Grd_titleRow.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_crfsnm_Internalname,GXutil.rtrim( AV10D_CRFSNM),"","","","","","",edtavD_crfsnm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_crfsnm_Enabled),new Integer(0),new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(166),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
      nGXsfl_166_idx = (short)(((subGrd_title_Islastpage==1)&&(nGXsfl_166_idx+1>subgrd_title_recordsperpage( )) ? 1 : nGXsfl_166_idx+1)) ;
      sGXsfl_166_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_166_idx, 4, 0)), (short)(4), "0") ;
      edtavD_crfsnm_Internalname = "vD_CRFSNM_"+sGXsfl_166_idx ;
      /* End function sendrow_1662 */
   }

   public void sendrow_1945( )
   {
      wb1C0( ) ;
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
         if ( ((int)(nGXsfl_194_idx/ (double) (0)) % (2)) == 0 )
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
      Grid2Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_in_grid3_Internalname+"_"+sGXsfl_194_idx,new Integer(1),"TableGridTLM-1","","","","","","",new Integer(0),new Integer(1),new Integer(35),new Integer(150),"","px","px"});
      Grid2Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:35px\""});
      /* Single line edit */
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid2Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd2_crf_status_Internalname,GXutil.rtrim( AV14D_GRD2_CRF_STATUS),"","","","","","",edtavD_grd2_crf_status_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd2_crf_status_Enabled),new Integer(0),new Integer(2),"chr",new Integer(1),"row",new Integer(2),new Integer(0),new Integer(0),new Integer(194),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
      nGXsfl_194_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_194_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_194_idx+1)) ;
      sGXsfl_194_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_194_idx, 4, 0)), (short)(4), "0") + sGXsfl_175_idx ;
      edtavD_grd2_crf_status_Internalname = "vD_GRD2_CRF_STATUS_"+sGXsfl_194_idx ;
      /* End function sendrow_1945 */
   }

   public void sendrow_1754( )
   {
      wb1C0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_175_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(nGXsfl_175_idx/ (double) (1)) % (2)) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_175_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_175_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)(nGXsfl_175_idx) % (1)) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_175_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grid_Internalname+"_"+sGXsfl_175_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_in_grid2_Internalname+"_"+sGXsfl_175_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:31px;width:60px\""});
         /* Check box */
         TempTags = " " + ((chkavD_grd1_check.getEnabled()!=0)&&(chkavD_grd1_check.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 184,'',false,'"+sGXsfl_175_idx+"',175)\"" : " ") ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, httpContext.isAjaxCallMode( ), new Object[] {chkavD_grd1_check.getInternalname(),GXutil.booltostr( AV12D_GRD1_CHECK),"",new Integer(chkavD_grd1_check.getVisible()),new Integer(1),"true","",StyleString,ClassString,TempTags+((chkavD_grd1_check.getEnabled()!=0)&&(chkavD_grd1_check.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(184, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd1_check.getEnabled()!=0)&&(chkavD_grd1_check.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(184);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"width:70px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 186,'',false,'"+sGXsfl_175_idx+"',175)\"" : " ") ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavD_grd1_hikensha_Internalname,GXutil.rtrim( AV13D_GRD1_HIKENSHA),"",TempTags+((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd1_hikensha_Enabled!=0)&&(edtavD_grd1_hikensha_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(186);\"" : " "),"","","","",edtavD_grd1_hikensha_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavD_grd1_hikensha_Enabled),new Integer(0),new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(175),new Integer(1),new Integer(1),new Boolean(true),"left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:35px;width:45px\""});
         /* Text block */
         ClassString = "TextBlockBtn040" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"選択","","",lblBtn_sel_Jsonclick,"EBTN_SEL.CLICK."+sGXsfl_175_idx,StyleString,ClassString,new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
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
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, httpContext.isAjaxCallMode( ), new Object[] {tblTbl_grd1_hidden_Internalname+"_"+sGXsfl_175_idx,new Integer(tblTbl_grd1_hidden_Visible),"TableHidden","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "color:#FF0000;" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTBW01_LINE_NO_Internalname,GXutil.ltrim( localUtil.ntoc( A598TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A598TBW01_LINE_NO), "ZZZZZZZZZ9"),"","","","","",edtTBW01_LINE_NO_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(0),new Integer(0),new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(175),new Integer(1),new Integer(1),new Boolean(true),"right"});
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
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"194\">") ;
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
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV14D_GRD2_CRF_STATUS));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd2_crf_status_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", "true");
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", "true");
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", ((subGrid2_Allowcollapsing==1) ? "true" : "false"));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
         rf1C5( ) ;
         nRC_Grid2 = (short)(nGXsfl_194_idx-1) ;
         GXCCtl = "nRC_Grid2_" + sGXsfl_175_idx ;
         GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRC_Grid2, (byte)(4), (byte)(0), ".", "")));
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
         }
         else
         {
            GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_175_idx, Grid2Container.ToJavascriptSource());
            if ( httpContext.isAjaxCallMode( ) )
            {
               Grid1Row.AddGrid("Grid2", Grid2Container);
            }
            if ( httpContext.isAjaxRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_175_idx, Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_175_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'>") ;
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
               if ( ((int)(nGXsfl_175_idx) % (1)) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_175_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_175_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_175_idx+1)) ;
         sGXsfl_175_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_175_idx, 4, 0)), (short)(4), "0") ;
         chkavD_grd1_check.setInternalname( "vD_GRD1_CHECK_"+sGXsfl_175_idx );
         edtavD_grd1_hikensha_Internalname = "vD_GRD1_HIKENSHA_"+sGXsfl_175_idx ;
         lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_175_idx ;
         edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_175_idx ;
         subGrid2_Internalname = "GRID2_"+sGXsfl_175_idx ;
      }
      /* End function sendrow_1754 */
   }

   public void init_default_properties( )
   {
      lblTxt_auto_sel_Internalname = "TXT_AUTO_SEL" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      cmbavD_study_id.setInternalname( "vD_STUDY_ID" );
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavD_tbt01_outer_subject_id_Internalname = "vD_TBT01_OUTER_SUBJECT_ID" ;
      chkavW_crf_sel_only.setInternalname( "vW_CRF_SEL_ONLY" );
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      tblTable7_Internalname = "TABLE7" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
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
      chkavD_grd_chk_all.setInternalname( "vD_GRD_CHK_ALL" );
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      tblTbl_in_grid_header_Internalname = "TBL_IN_GRID_HEADER" ;
      tblTbl_in_grid_header2_Internalname = "TBL_IN_GRID_HEADER2" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTbl_in_grid2_Internalname = "TBL_IN_GRID2" ;
      tblTbl_grd1_hidden_Internalname = "TBL_GRD1_HIDDEN" ;
      tblTbl_in_grid3_Internalname = "TBL_IN_GRID3" ;
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
      edtavH_col_count_Internalname = "vH_COL_COUNT" ;
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
      subGrd_title_Internalname = "GRD_TITLE" ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_175_idx ;
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Borderwidth = (short)(0) ;
      edtTBW01_LINE_NO_Jsonclick = "" ;
      edtavD_grd1_hikensha_Jsonclick = "" ;
      edtavD_grd1_hikensha_Visible = 1 ;
      chkavD_grd1_check.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridBase" ;
      edtavD_grd2_crf_status_Jsonclick = "" ;
      edtavD_grd2_crf_status_Enabled = 0 ;
      subGrid2_Class = "FreeStyleGridBase" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtavD_crfsnm_Jsonclick = "" ;
      subGrd_title_Class = "FreeStyleGridBase" ;
      edtavD_tbt01_outer_subject_id_Jsonclick = "" ;
      cmbavD_study_id.setJsonclick( "" );
      subGrd_title_Allowcollapsing = (byte)(0) ;
      edtavD_crfsnm_Enabled = 0 ;
      subGrd_title_Borderwidth = (short)(0) ;
      subGrd_title_Backcolorstyle = (byte)(0) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblBtn_sel_Caption = "選択" ;
      edtavD_grd1_hikensha_Enabled = 1 ;
      chkavD_grd1_check.setVisible( 1 );
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      tblTbl_list_Width = 0 ;
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
      edtavH_col_count_Jsonclick = "" ;
      edtavH_disp_datetime_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      tblTbl_grd1_hidden_Visible = 1 ;
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
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      chkavD_grd_chk_all.setCaption( "" );
      chkavW_crf_sel_only.setCaption( "" );
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
                  /* Execute user subroutine: S231079 */
                  S231079 ();
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
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV22H_SRCH_FLG = "" ;
      AV19H_DISP_DATETIME = "" ;
      AV17H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      A550TBM31_CRF_SNM = "" ;
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
      AV10D_CRFSNM = "" ;
      edtavD_grd1_hikensha_Internalname = "" ;
      lblBtn_sel_Internalname = "" ;
      edtTBW01_LINE_NO_Internalname = "" ;
      AV13D_GRD1_HIKENSHA = "" ;
      edtavD_grd2_crf_status_Internalname = "" ;
      AV14D_GRD2_CRF_STATUS = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grd_titleContainer = new com.genexus.webpanels.GXWebGrid(context);
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      AV25W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV8C_TAM02_APP_ID = "" ;
      H001C2_A597TBW01_DISP_DATETIME = new String[] {""} ;
      H001C2_A596TBW01_APP_ID = new String[] {""} ;
      H001C2_A595TBW01_SESSION_ID = new String[] {""} ;
      H001C2_A599TBW01_FREE_SAVE_1 = new String[] {""} ;
      H001C2_n599TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      H001C2_A598TBW01_LINE_NO = new long[1] ;
      A597TBW01_DISP_DATETIME = "" ;
      A596TBW01_APP_ID = "" ;
      A595TBW01_SESSION_ID = "" ;
      A599TBW01_FREE_SAVE_1 = "" ;
      H001C3_AGRID1_nRecordCount = new int[1] ;
      AV78Pgmname = "" ;
      AV16D_TBT01_OUTER_SUBJECT_ID = "" ;
      AV20H_INIT_FLG = "" ;
      AV21H_KNGN_FLG = "" ;
      AV7C_GAMEN_TITLE = "" ;
      A551TBM31_STATUS = "" ;
      A223TBM31_DEL_FLG = "" ;
      H001C4_A223TBM31_DEL_FLG = new String[] {""} ;
      H001C4_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H001C4_A551TBM31_STATUS = new String[] {""} ;
      H001C4_n551TBM31_STATUS = new boolean[] {false} ;
      H001C4_A218TBM31_CRF_ID = new short[1] ;
      H001C4_A217TBM31_STUDY_ID = new long[1] ;
      H001C4_A550TBM31_CRF_SNM = new String[] {""} ;
      H001C4_n550TBM31_CRF_SNM = new boolean[] {false} ;
      AV34W_ERR_MSG = "" ;
      H001C5_A161TBM01_SYS_ID = new String[] {""} ;
      H001C5_A514TBM01_SYS_VALUE = new String[] {""} ;
      H001C5_n514TBM01_SYS_VALUE = new boolean[] {false} ;
      A161TBM01_SYS_ID = "" ;
      A514TBM01_SYS_VALUE = "" ;
      AV42W_SYS_CRFID = "" ;
      AV33W_CRFID_COLS = new GxObjectCollection(Short.class, "internal", "");
      H001C6_A223TBM31_DEL_FLG = new String[] {""} ;
      H001C6_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H001C6_A551TBM31_STATUS = new String[] {""} ;
      H001C6_n551TBM31_STATUS = new boolean[] {false} ;
      H001C6_A218TBM31_CRF_ID = new short[1] ;
      H001C6_A217TBM31_STUDY_ID = new long[1] ;
      H001C7_A598TBW01_LINE_NO = new long[1] ;
      H001C7_A597TBW01_DISP_DATETIME = new String[] {""} ;
      H001C7_A596TBW01_APP_ID = new String[] {""} ;
      H001C7_A595TBW01_SESSION_ID = new String[] {""} ;
      H001C7_A599TBW01_FREE_SAVE_1 = new String[] {""} ;
      H001C7_n599TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      AV27W_B405_WP01_SD01 = new SdtB405_SD01(remoteHandle, context);
      H001C8_A246TBM33_STUDY_ID = new long[1] ;
      H001C8_A251TBM33_DEL_FLG = new String[] {""} ;
      H001C8_n251TBM33_DEL_FLG = new boolean[] {false} ;
      H001C8_A248TBM33_COND_NO = new short[1] ;
      H001C8_A247TBM33_CRF_ID = new short[1] ;
      H001C8_A249TBM33_EXPRESSION = new String[] {""} ;
      H001C8_n249TBM33_EXPRESSION = new boolean[] {false} ;
      H001C8_A250TBM33_PRIOR_NO = new byte[1] ;
      H001C8_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      A251TBM33_DEL_FLG = "" ;
      A249TBM33_EXPRESSION = "" ;
      GXv_int4 = new short [1] ;
      A488TBM36_DEL_FLG = "" ;
      H001C9_A484TBM36_STUDY_ID = new long[1] ;
      H001C9_A485TBM36_CRF_ID = new short[1] ;
      H001C9_A486TBM36_COND_NO = new short[1] ;
      H001C9_A487TBM36_SELECT_CRF_ID = new short[1] ;
      H001C9_A488TBM36_DEL_FLG = new String[] {""} ;
      H001C9_n488TBM36_DEL_FLG = new boolean[] {false} ;
      AV6BC_TBT02_CRF = new SdtTBT02_CRF(remoteHandle);
      AV41W_SESSION = httpContext.getWebSession();
      H001C10_A597TBW01_DISP_DATETIME = new String[] {""} ;
      H001C10_A596TBW01_APP_ID = new String[] {""} ;
      H001C10_A595TBW01_SESSION_ID = new String[] {""} ;
      H001C10_A598TBW01_LINE_NO = new long[1] ;
      AV5BC_FREE_WORK = new SdtTBW01_FREE_WORK(remoteHandle);
      GXv_SdtA_PAGING_SDT5 = new SdtA_PAGING_SDT [1] ;
      AV37W_MSG = "" ;
      A555TBT01_OUTER_SUBJECT_ID = "" ;
      A284TBT01_DEL_FLG = "" ;
      H001C11_A284TBT01_DEL_FLG = new String[] {""} ;
      H001C11_n284TBT01_DEL_FLG = new boolean[] {false} ;
      H001C11_A555TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      H001C11_n555TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      H001C11_A282TBT01_STUDY_ID = new long[1] ;
      H001C11_A283TBT01_SUBJECT_ID = new int[1] ;
      AV28W_B405_WP01_SD01_CRF_ITEM = new SdtB405_SD01_CRF_Item(remoteHandle, context);
      H001C12_A223TBM31_DEL_FLG = new String[] {""} ;
      H001C12_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H001C12_A551TBM31_STATUS = new String[] {""} ;
      H001C12_n551TBM31_STATUS = new boolean[] {false} ;
      H001C12_A218TBM31_CRF_ID = new short[1] ;
      H001C12_A217TBM31_STUDY_ID = new long[1] ;
      H001C13_A294TBT02_CRF_ID = new short[1] ;
      H001C13_A293TBT02_SUBJECT_ID = new int[1] ;
      H001C13_A292TBT02_STUDY_ID = new long[1] ;
      H001C13_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      H001C13_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      H001C14_A189TBM21_DEL_FLG = new String[] {""} ;
      H001C14_n189TBM21_DEL_FLG = new boolean[] {false} ;
      H001C14_A513TBM21_STATUS = new String[] {""} ;
      H001C14_n513TBM21_STATUS = new boolean[] {false} ;
      H001C14_A187TBM21_STUDY_NM = new String[] {""} ;
      H001C14_n187TBM21_STUDY_NM = new boolean[] {false} ;
      H001C14_A186TBM21_STUDY_ID = new long[1] ;
      A189TBM21_DEL_FLG = "" ;
      A513TBM21_STATUS = "" ;
      A187TBM21_STUDY_NM = "" ;
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV35W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXv_char7 = new String [1] ;
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
      Grd_titleColumn = new com.genexus.webpanels.GXWebColumn();
      lblTextblock36_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
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
      lblTextblock18_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTxt_auto_sel_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grd_titleRow = new com.genexus.webpanels.GXWebRow();
      subGrd_title_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      lblBtn_sel_Jsonclick = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char8 = "" ;
      GXt_char9 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b405_wp01_kanja_crf_list__default(),
         new Object[] {
             new Object[] {
            H001C2_A597TBW01_DISP_DATETIME, H001C2_A596TBW01_APP_ID, H001C2_A595TBW01_SESSION_ID, H001C2_A599TBW01_FREE_SAVE_1, H001C2_n599TBW01_FREE_SAVE_1, H001C2_A598TBW01_LINE_NO
            }
            , new Object[] {
            H001C3_AGRID1_nRecordCount
            }
            , new Object[] {
            H001C4_A223TBM31_DEL_FLG, H001C4_n223TBM31_DEL_FLG, H001C4_A551TBM31_STATUS, H001C4_n551TBM31_STATUS, H001C4_A218TBM31_CRF_ID, H001C4_A217TBM31_STUDY_ID, H001C4_A550TBM31_CRF_SNM, H001C4_n550TBM31_CRF_SNM
            }
            , new Object[] {
            H001C5_A161TBM01_SYS_ID, H001C5_A514TBM01_SYS_VALUE, H001C5_n514TBM01_SYS_VALUE
            }
            , new Object[] {
            H001C6_A223TBM31_DEL_FLG, H001C6_n223TBM31_DEL_FLG, H001C6_A551TBM31_STATUS, H001C6_n551TBM31_STATUS, H001C6_A218TBM31_CRF_ID, H001C6_A217TBM31_STUDY_ID
            }
            , new Object[] {
            H001C7_A598TBW01_LINE_NO, H001C7_A597TBW01_DISP_DATETIME, H001C7_A596TBW01_APP_ID, H001C7_A595TBW01_SESSION_ID, H001C7_A599TBW01_FREE_SAVE_1, H001C7_n599TBW01_FREE_SAVE_1
            }
            , new Object[] {
            H001C8_A246TBM33_STUDY_ID, H001C8_A251TBM33_DEL_FLG, H001C8_n251TBM33_DEL_FLG, H001C8_A248TBM33_COND_NO, H001C8_A247TBM33_CRF_ID, H001C8_A249TBM33_EXPRESSION, H001C8_n249TBM33_EXPRESSION, H001C8_A250TBM33_PRIOR_NO, H001C8_n250TBM33_PRIOR_NO
            }
            , new Object[] {
            H001C9_A484TBM36_STUDY_ID, H001C9_A485TBM36_CRF_ID, H001C9_A486TBM36_COND_NO, H001C9_A487TBM36_SELECT_CRF_ID, H001C9_A488TBM36_DEL_FLG, H001C9_n488TBM36_DEL_FLG
            }
            , new Object[] {
            H001C10_A597TBW01_DISP_DATETIME, H001C10_A596TBW01_APP_ID, H001C10_A595TBW01_SESSION_ID, H001C10_A598TBW01_LINE_NO
            }
            , new Object[] {
            H001C11_A284TBT01_DEL_FLG, H001C11_n284TBT01_DEL_FLG, H001C11_A555TBT01_OUTER_SUBJECT_ID, H001C11_n555TBT01_OUTER_SUBJECT_ID, H001C11_A282TBT01_STUDY_ID, H001C11_A283TBT01_SUBJECT_ID
            }
            , new Object[] {
            H001C12_A223TBM31_DEL_FLG, H001C12_n223TBM31_DEL_FLG, H001C12_A551TBM31_STATUS, H001C12_n551TBM31_STATUS, H001C12_A218TBM31_CRF_ID, H001C12_A217TBM31_STUDY_ID
            }
            , new Object[] {
            H001C13_A294TBT02_CRF_ID, H001C13_A293TBT02_SUBJECT_ID, H001C13_A292TBT02_STUDY_ID, H001C13_A370TBT02_CRF_LATEST_VERSION, H001C13_n370TBT02_CRF_LATEST_VERSION
            }
            , new Object[] {
            H001C14_A189TBM21_DEL_FLG, H001C14_n189TBM21_DEL_FLG, H001C14_A513TBM21_STATUS, H001C14_n513TBM21_STATUS, H001C14_A187TBM21_STUDY_NM, H001C14_n187TBM21_STUDY_NM, H001C14_A186TBM21_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV78Pgmname = "B405_WP01_KANJA_CRF_LIST" ;
      /* GeneXus formulas. */
      AV78Pgmname = "B405_WP01_KANJA_CRF_LIST" ;
      Gx_err = (short)(0) ;
      edtavD_crfsnm_Enabled = 0 ;
      edtavD_grd1_hikensha_Enabled = 0 ;
      edtavD_grd2_crf_status_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV24P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV24P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte A250TBM33_PRIOR_NO ;
   private byte AV90GXLvl753 ;
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
   private short wcpOAV23P_COL_COUNT ;
   private short nRC_Grd_title ;
   private short nGXsfl_166_idx=1 ;
   private short nRC_Grid2 ;
   private short nGXsfl_194_idx=1 ;
   private short nRC_Grid1 ;
   private short nGXsfl_175_idx=1 ;
   private short AV23P_COL_COUNT ;
   private short subGrid1_Rows ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private short AV18H_COL_COUNT ;
   private short A218TBM31_CRF_ID ;
   private short A248TBM33_COND_NO ;
   private short A247TBM33_CRF_ID ;
   private short AV30W_COND_HYOKA ;
   private short GXv_int4[] ;
   private short A487TBM36_SELECT_CRF_ID ;
   private short A485TBM36_CRF_ID ;
   private short A486TBM36_COND_NO ;
   private short AV32W_CRFID_COL ;
   private short AV40W_SEL_LINE_NO ;
   private short AV43W_TBM31_CRF_ID ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short nGXsfl_175_fel_idx=1 ;
   private short subGrid1_Borderwidth ;
   private short subGrd_title_Borderwidth ;
   private short subGrid2_Borderwidth ;
   private int GRID1_nFirstRecordOnPage ;
   private int subGrd_title_Islastpage ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int GRID1_nCurrentRecord ;
   private int GRID1_nRecordCount ;
   private int GRID1_IsPaging ;
   private int edtavD_crfsnm_Enabled ;
   private int edtavD_grd1_hikensha_Enabled ;
   private int edtavD_grd2_crf_status_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int tblTbl_list_Width ;
   private int AV86GXV31 ;
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
   private int A283TBT01_SUBJECT_ID ;
   private int AV45W_TBT01_SUBJECT_ID ;
   private int A293TBT02_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private int tblTbl_grd1_hidden_Visible ;
   private int AV80GXV30 ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrd_title_Selectioncolor ;
   private int subGrd_title_Hoveringcolor ;
   private int idxLst ;
   private int subGrd_title_Backcolor ;
   private int subGrd_title_Allbackcolor ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd1_hikensha_Visible ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private long A598TBW01_LINE_NO ;
   private long AV15D_STUDY_ID ;
   private long AV46W_TOP_LINE_NO ;
   private long A217TBM31_STUDY_ID ;
   private long A246TBM33_STUDY_ID ;
   private long A484TBM36_STUDY_ID ;
   private long AV29W_CNT ;
   private long A282TBT01_STUDY_ID ;
   private long AV44W_TBT01_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_166_idx="0001" ;
   private String sGXsfl_194_idx="0001" ;
   private String sGXsfl_175_idx="0001" ;
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
   private String lblBtn_sel_Internalname ;
   private String edtTBW01_LINE_NO_Internalname ;
   private String subGrid2_Internalname ;
   private String edtavD_grd2_crf_status_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV78Pgmname ;
   private String edtavD_tbt01_outer_subject_id_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_disp_datetime_Internalname ;
   private String edtavH_col_count_Internalname ;
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
   private String tblTbl_list_Internalname ;
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
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sGXsfl_175_fel_idx="0001" ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String tblTbl_grd1_hidden_Internalname ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_disp_datetime_Jsonclick ;
   private String edtavH_col_count_Jsonclick ;
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
   private String lblBtn_sel_Caption ;
   private String tblTbl_grid_header_Internalname ;
   private String subGrd_title_Internalname ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
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
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtavD_tbt01_outer_subject_id_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_auto_sel_Internalname ;
   private String lblTxt_auto_sel_Jsonclick ;
   private String subGrd_title_Class ;
   private String subGrd_title_Linesclass ;
   private String tblTbl_in_grid_header2_Internalname ;
   private String ROClassString ;
   private String edtavD_crfsnm_Jsonclick ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String tblTbl_in_grid3_Internalname ;
   private String edtavD_grd2_crf_status_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_Internalname ;
   private String GXt_char2 ;
   private String tblTbl_in_grid2_Internalname ;
   private String GXt_char1 ;
   private String edtavD_grd1_hikensha_Jsonclick ;
   private String lblBtn_sel_Jsonclick ;
   private String edtTBW01_LINE_NO_Jsonclick ;
   private String GXt_char8 ;
   private String GXt_char9 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV12D_GRD1_CHECK ;
   private boolean n599TBW01_FREE_SAVE_1 ;
   private boolean AV9W_CRF_SEL_ONLY ;
   private boolean AV11D_GRD_CHK_ALL ;
   private boolean returnInSub ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n551TBM31_STATUS ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n514TBM01_SYS_VALUE ;
   private boolean AV31W_COND_OK ;
   private boolean n251TBM33_DEL_FLG ;
   private boolean n249TBM33_EXPRESSION ;
   private boolean n250TBM33_PRIOR_NO ;
   private boolean n488TBM36_DEL_FLG ;
   private boolean n284TBT01_DEL_FLG ;
   private boolean n555TBT01_OUTER_SUBJECT_ID ;
   private boolean AV38W_NO_SEL_CRF ;
   private boolean AV39W_RES_FLG ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean AV36W_GRID_READ_FLG ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n513TBM21_STATUS ;
   private boolean n187TBM21_STUDY_NM ;
   private String A599TBW01_FREE_SAVE_1 ;
   private String AV22H_SRCH_FLG ;
   private String AV19H_DISP_DATETIME ;
   private String A550TBM31_CRF_SNM ;
   private String AV10D_CRFSNM ;
   private String AV13D_GRD1_HIKENSHA ;
   private String AV14D_GRD2_CRF_STATUS ;
   private String AV8C_TAM02_APP_ID ;
   private String A597TBW01_DISP_DATETIME ;
   private String A596TBW01_APP_ID ;
   private String A595TBW01_SESSION_ID ;
   private String AV16D_TBT01_OUTER_SUBJECT_ID ;
   private String AV20H_INIT_FLG ;
   private String AV21H_KNGN_FLG ;
   private String AV7C_GAMEN_TITLE ;
   private String A551TBM31_STATUS ;
   private String A223TBM31_DEL_FLG ;
   private String AV34W_ERR_MSG ;
   private String A161TBM01_SYS_ID ;
   private String A514TBM01_SYS_VALUE ;
   private String AV42W_SYS_CRFID ;
   private String A251TBM33_DEL_FLG ;
   private String A249TBM33_EXPRESSION ;
   private String A488TBM36_DEL_FLG ;
   private String AV37W_MSG ;
   private String A555TBT01_OUTER_SUBJECT_ID ;
   private String A284TBT01_DEL_FLG ;
   private String A189TBM21_DEL_FLG ;
   private String A513TBM21_STATUS ;
   private String A187TBM21_STUDY_NM ;
   private String AV35W_ERRCD ;
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
   private SdtA_LOGIN_SDT AV25W_A_LOGIN_SDT ;
   private HTMLChoice cmbavD_study_id ;
   private ICheckbox chkavW_crf_sel_only ;
   private ICheckbox chkavD_grd_chk_all ;
   private ICheckbox chkavD_grd1_check ;
   private IDataStoreProvider pr_default ;
   private String[] H001C2_A597TBW01_DISP_DATETIME ;
   private String[] H001C2_A596TBW01_APP_ID ;
   private String[] H001C2_A595TBW01_SESSION_ID ;
   private String[] H001C2_A599TBW01_FREE_SAVE_1 ;
   private boolean[] H001C2_n599TBW01_FREE_SAVE_1 ;
   private long[] H001C2_A598TBW01_LINE_NO ;
   private int[] H001C3_AGRID1_nRecordCount ;
   private String[] H001C4_A223TBM31_DEL_FLG ;
   private boolean[] H001C4_n223TBM31_DEL_FLG ;
   private String[] H001C4_A551TBM31_STATUS ;
   private boolean[] H001C4_n551TBM31_STATUS ;
   private short[] H001C4_A218TBM31_CRF_ID ;
   private long[] H001C4_A217TBM31_STUDY_ID ;
   private String[] H001C4_A550TBM31_CRF_SNM ;
   private boolean[] H001C4_n550TBM31_CRF_SNM ;
   private String[] H001C5_A161TBM01_SYS_ID ;
   private String[] H001C5_A514TBM01_SYS_VALUE ;
   private boolean[] H001C5_n514TBM01_SYS_VALUE ;
   private String[] H001C6_A223TBM31_DEL_FLG ;
   private boolean[] H001C6_n223TBM31_DEL_FLG ;
   private String[] H001C6_A551TBM31_STATUS ;
   private boolean[] H001C6_n551TBM31_STATUS ;
   private short[] H001C6_A218TBM31_CRF_ID ;
   private long[] H001C6_A217TBM31_STUDY_ID ;
   private long[] H001C7_A598TBW01_LINE_NO ;
   private String[] H001C7_A597TBW01_DISP_DATETIME ;
   private String[] H001C7_A596TBW01_APP_ID ;
   private String[] H001C7_A595TBW01_SESSION_ID ;
   private String[] H001C7_A599TBW01_FREE_SAVE_1 ;
   private boolean[] H001C7_n599TBW01_FREE_SAVE_1 ;
   private long[] H001C8_A246TBM33_STUDY_ID ;
   private String[] H001C8_A251TBM33_DEL_FLG ;
   private boolean[] H001C8_n251TBM33_DEL_FLG ;
   private short[] H001C8_A248TBM33_COND_NO ;
   private short[] H001C8_A247TBM33_CRF_ID ;
   private String[] H001C8_A249TBM33_EXPRESSION ;
   private boolean[] H001C8_n249TBM33_EXPRESSION ;
   private byte[] H001C8_A250TBM33_PRIOR_NO ;
   private boolean[] H001C8_n250TBM33_PRIOR_NO ;
   private long[] H001C9_A484TBM36_STUDY_ID ;
   private short[] H001C9_A485TBM36_CRF_ID ;
   private short[] H001C9_A486TBM36_COND_NO ;
   private short[] H001C9_A487TBM36_SELECT_CRF_ID ;
   private String[] H001C9_A488TBM36_DEL_FLG ;
   private boolean[] H001C9_n488TBM36_DEL_FLG ;
   private String[] H001C10_A597TBW01_DISP_DATETIME ;
   private String[] H001C10_A596TBW01_APP_ID ;
   private String[] H001C10_A595TBW01_SESSION_ID ;
   private long[] H001C10_A598TBW01_LINE_NO ;
   private String[] H001C11_A284TBT01_DEL_FLG ;
   private boolean[] H001C11_n284TBT01_DEL_FLG ;
   private String[] H001C11_A555TBT01_OUTER_SUBJECT_ID ;
   private boolean[] H001C11_n555TBT01_OUTER_SUBJECT_ID ;
   private long[] H001C11_A282TBT01_STUDY_ID ;
   private int[] H001C11_A283TBT01_SUBJECT_ID ;
   private String[] H001C12_A223TBM31_DEL_FLG ;
   private boolean[] H001C12_n223TBM31_DEL_FLG ;
   private String[] H001C12_A551TBM31_STATUS ;
   private boolean[] H001C12_n551TBM31_STATUS ;
   private short[] H001C12_A218TBM31_CRF_ID ;
   private long[] H001C12_A217TBM31_STUDY_ID ;
   private short[] H001C13_A294TBT02_CRF_ID ;
   private int[] H001C13_A293TBT02_SUBJECT_ID ;
   private long[] H001C13_A292TBT02_STUDY_ID ;
   private short[] H001C13_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] H001C13_n370TBT02_CRF_LATEST_VERSION ;
   private String[] H001C14_A189TBM21_DEL_FLG ;
   private boolean[] H001C14_n189TBM21_DEL_FLG ;
   private String[] H001C14_A513TBM21_STATUS ;
   private boolean[] H001C14_n513TBM21_STATUS ;
   private String[] H001C14_A187TBM21_STUDY_NM ;
   private boolean[] H001C14_n187TBM21_STUDY_NM ;
   private long[] H001C14_A186TBM21_STUDY_ID ;
   private com.genexus.webpanels.WebSession AV41W_SESSION ;
   private GxObjectCollection AV33W_CRFID_COLS ;
   private SdtTBW01_FREE_WORK AV5BC_FREE_WORK ;
   private SdtTBT02_CRF AV6BC_TBT02_CRF ;
   private SdtA_PAGING_SDT AV17H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT5[] ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtB405_SD01 AV27W_B405_WP01_SD01 ;
   private SdtB405_SD01_CRF_Item AV28W_B405_WP01_SD01_CRF_ITEM ;
}

final  class b405_wp01_kanja_crf_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001C4( com.genexus.internet.HttpContext httpContext ,
                                          long AV15D_STUDY_ID ,
                                          long A217TBM31_STUDY_ID ,
                                          short A218TBM31_CRF_ID ,
                                          String A551TBM31_STATUS ,
                                          String A223TBM31_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int10 ;
      GXv_int10 = new byte [1] ;
      Object[] GXv_Object11 ;
      GXv_Object11 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_SNM`" ;
      scmdbuf = scmdbuf + " FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_CRF_ID` <> 0)" ;
      scmdbuf = scmdbuf + " and (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1')" ;
      scmdbuf = scmdbuf + " and (`TBM31_DEL_FLG` = '0')" ;
      if ( ! (0==AV15D_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBM31_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_H001C6( com.genexus.internet.HttpContext httpContext ,
                                          long AV15D_STUDY_ID ,
                                          long A217TBM31_STUDY_ID ,
                                          short A218TBM31_CRF_ID ,
                                          String A551TBM31_STATUS ,
                                          String A223TBM31_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int12 ;
      GXv_int12 = new byte [1] ;
      Object[] GXv_Object13 ;
      GXv_Object13 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_CRF_ID` <> 0)" ;
      scmdbuf = scmdbuf + " and (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1')" ;
      scmdbuf = scmdbuf + " and (`TBM31_DEL_FLG` = '0')" ;
      if ( ! (0==AV15D_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBM31_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_H001C9( com.genexus.internet.HttpContext httpContext ,
                                          short A487TBM36_SELECT_CRF_ID ,
                                          GxObjectCollection AV33W_CRFID_COLS ,
                                          String A488TBM36_DEL_FLG ,
                                          long A246TBM33_STUDY_ID ,
                                          short A247TBM33_CRF_ID ,
                                          short A248TBM33_COND_NO ,
                                          long A484TBM36_STUDY_ID ,
                                          short A485TBM36_CRF_ID ,
                                          short A486TBM36_COND_NO )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int14 ;
      GXv_int14 = new byte [3] ;
      Object[] GXv_Object15 ;
      GXv_Object15 = new Object [2] ;
      scmdbuf = "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`," ;
      scmdbuf = scmdbuf + " `TBM36_DEL_FLG` FROM `TBM36_CRF_SELECT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` = ? and `TBM36_COND_NO` = ?)" ;
      scmdbuf = scmdbuf + " and (" + GXutil.toValueList("mysql", AV33W_CRFID_COLS, "`TBM36_SELECT_CRF_ID` IN (", ")") + ")" ;
      scmdbuf = scmdbuf + " and (`TBM36_DEL_FLG` = '0')" ;
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H001C11( com.genexus.internet.HttpContext httpContext ,
                                           long AV15D_STUDY_ID ,
                                           String AV16D_TBT01_OUTER_SUBJECT_ID ,
                                           long A282TBT01_STUDY_ID ,
                                           String A555TBT01_OUTER_SUBJECT_ID ,
                                           String A284TBT01_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int17 ;
      GXv_int17 = new byte [2] ;
      Object[] GXv_Object18 ;
      GXv_Object18 = new Object [2] ;
      scmdbuf = "SELECT `TBT01_DEL_FLG`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`" ;
      scmdbuf = scmdbuf + " FROM `TBT01_SUBJECT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT01_DEL_FLG` = '0')" ;
      if ( ! (0==AV15D_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBT01_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16D_TBT01_OUTER_SUBJECT_ID)==0) )
      {
         sWhereString = sWhereString + " and (`TBT01_OUTER_SUBJECT_ID` = ?)" ;
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT01_SUBJECT_ID`" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H001C12( com.genexus.internet.HttpContext httpContext ,
                                           long AV15D_STUDY_ID ,
                                           long A217TBM31_STUDY_ID ,
                                           short A218TBM31_CRF_ID ,
                                           String A551TBM31_STATUS ,
                                           String A223TBM31_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int19 ;
      GXv_int19 = new byte [1] ;
      Object[] GXv_Object20 ;
      GXv_Object20 = new Object [2] ;
      scmdbuf = "SELECT `TBM31_DEL_FLG`, `TBM31_STATUS`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM31_CRF_ID` <> 0)" ;
      scmdbuf = scmdbuf + " and (`TBM31_STATUS` = '0' or `TBM31_STATUS` = '1')" ;
      scmdbuf = scmdbuf + " and (`TBM31_DEL_FLG` = '0')" ;
      if ( ! (0==AV15D_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBM31_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int19[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_H001C4(httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 4 :
                  return conditional_H001C6(httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 7 :
                  return conditional_H001C9(httpContext, ((Number) dynConstraints[0]).shortValue() , (GxObjectCollection)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() );
            case 9 :
                  return conditional_H001C11(httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 10 :
                  return conditional_H001C12(httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001C2", "SELECT `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_FREE_SAVE_1`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE (`TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ?) AND (? = '1') ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001C3", "SELECT COUNT(*) FROM `TBW01_FREE_WORK` WHERE (`TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ?) AND (? = '1') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H001C4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001C5", "SELECT `TBM01_SYS_ID`, `TBM01_SYS_VALUE` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = '016' ORDER BY `TBM01_SYS_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001C6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001C7", "SELECT `TBW01_LINE_NO`, `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_FREE_SAVE_1` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ? ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001C8", "SELECT `TBM33_STUDY_ID`, `TBM33_DEL_FLG`, `TBM33_COND_NO`, `TBM33_CRF_ID`, `TBM33_EXPRESSION`, `TBM33_PRIOR_NO` FROM `TBM33_CRF_COND` WHERE (`TBM33_CRF_ID` = ?) AND (`TBM33_STUDY_ID` = ?) AND (`TBM33_DEL_FLG` = '0') ORDER BY `TBM33_PRIOR_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001C9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001C10", "SELECT `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ? ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H001C11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001C12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H001C13", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_CRF_LATEST_VERSION` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001C14", "SELECT `TBM21_DEL_FLG`, `TBM21_STATUS`, `TBM21_STUDY_NM`, `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE (`TBM21_STATUS` IN ('0','1')) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getLongVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               break;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               break;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               break;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               break;
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
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               break;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               break;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[5]).shortValue());
               }
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               break;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 6);
               }
               break;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[1]).longValue());
               }
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

