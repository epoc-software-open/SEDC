/*
               File: b407_wp01_design_import_impl
        Description: 試験情報インポート
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:29.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b407_wp01_design_import_impl extends GXWebPanel
{
   public b407_wp01_design_import_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b407_wp01_design_import_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b407_wp01_design_import_impl.class ));
   }

   public b407_wp01_design_import_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavD_base_flg = UIFactory.getCheckbox(this);
      chkavD_site_flg = UIFactory.getCheckbox(this);
      chkavD_staff_flg = UIFactory.getCheckbox(this);
      chkavD_list_chk = UIFactory.getCheckbox(this);
      chkavD_subject_chk = UIFactory.getCheckbox(this);
      chkavD_grd_all_chk = UIFactory.getCheckbox(this);
      chkavCtlcheck = UIFactory.getCheckbox(this);
      chkavH_base_enabled = UIFactory.getCheckbox(this);
      chkavH_list_enabled = UIFactory.getCheckbox(this);
      chkavH_site_enabled = UIFactory.getCheckbox(this);
      chkavH_staff_enabled = UIFactory.getCheckbox(this);
      chkavH_subject_enabled = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_206 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_206_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_206_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_206, nGXsfl_206_idx, sGXsfl_206_idx) ;
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
            AV14P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14P_MOVE_KBN", GXutil.str( AV14P_MOVE_KBN, 1, 0));
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
         pa2K2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws2K2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we2K2( ) ;
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
      httpContext.writeValue( "試験情報インポート") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513312968");
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
      GXEncryptionTmp = "b407_wp01_design_import"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b407_wp01_design_import") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm2K2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "B407_sd01_import_list_c", AV5B407_SD01_IMPORT_LIST_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("B407_sd01_import_list_c", AV5B407_SD01_IMPORT_LIST_C);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV8H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV8H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_206", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_206, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV66Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV29C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_APP_ID", GetHash( "", String.valueOf(AV29C_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV14P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV16W_A821_JS));
      GxWebStd.gx_hidden_field( httpContext, "vH_SRCH_FLG", GXutil.rtrim( AV11H_SRCH_FLG));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV21W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GXCCtlgxBlob = "vD_UPLOAD_FILE" + "_gxBlob" ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, GXutil.rtrim( AV7D_UPLOAD_FILE));
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
      return "B407_WP01_DESIGN_IMPORT" ;
   }

   public String getPgmdesc( )
   {
      return "試験情報インポート" ;
   }

   public void wb2K0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_2K2( true) ;
      }
      else
      {
         wb_table1_2_2K2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_225_2K2( true) ;
      }
      else
      {
         wb_table2_225_2K2( false) ;
      }
      return  ;
   }

   public void wb_table2_225_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start2K2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験情報インポート", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0223") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0223", "");
         }
      }
      wbErr = false ;
      strup2K0( ) ;
   }

   public void ws2K2( )
   {
      start2K2( ) ;
      evt2K2( ) ;
   }

   public void evt2K2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_IMPORT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e112K2 */
                        e112K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_IMPORT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e122K2 */
                        e122K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPLOAD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e132K2 */
                        e132K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VD_GRD_ALL_CHK.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e142K2 */
                        e142K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e152K2 */
                        e152K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e162K2 */
                        e162K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e172K2 */
                        e172K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e182K2 */
                        e182K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e192K2 */
                        e192K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e202K2 */
                        e202K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e212K2 */
                        e212K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e222K2 */
                        e222K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e232K2 */
                        e232K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e242K2 */
                        e242K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e252K2 */
                        e252K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e262K2 */
                        e262K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e272K2 */
                        e272K2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e282K2 */
                        e282K2 ();
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
                        nGXsfl_206_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_206_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_206_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_2062( ) ;
                        AV60GXV1 = (short)(nGXsfl_206_idx+GRID1_nFirstRecordOnPage) ;
                        if ( ( AV5B407_SD01_IMPORT_LIST_C.size() >= AV60GXV1 ) && ( AV60GXV1 > 0 ) )
                        {
                           AV5B407_SD01_IMPORT_LIST_C.currentItem( ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)) );
                           ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)).setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check( GXutil.strtobool( httpContext.cgiGet( chkavCtlcheck.getInternalname())) );
                           ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)).setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname) );
                           ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)).setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm( httpContext.cgiGet( edtavCtltbm31_crf_nm_Internalname) );
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0223") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0223", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0223") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0223", "");
                        }
                        if ( (GXutil.strcmp("", AV7D_UPLOAD_FILE)==0) )
                        {
                           GXCCtl = "vD_UPLOAD_FILE_" + sGXsfl_206_idx ;
                           GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
                           AV7D_UPLOAD_FILE = httpContext.cgiGet( GXCCtlgxBlob) ;
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e292K2 */
                              e292K2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e302K2 */
                              e302K2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e312K2 */
                              e312K2 ();
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
                  else if ( nCmpId == 223 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0223") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0223", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we2K2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2K2( ) ;
         }
      }
   }

   public void pa2K2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b407_wp01_design_import")), "b407_wp01_design_import") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b407_wp01_design_import"))) ;
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
                  AV14P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14P_MOVE_KBN", GXutil.str( AV14P_MOVE_KBN, 1, 0));
               }
            }
         }
         chkavD_base_flg.setName( "vD_BASE_FLG" );
         chkavD_base_flg.setWebtags( "" );
         chkavD_base_flg.setCaption( "基本情報を取り込む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_base_flg.getInternalname(), "Caption", chkavD_base_flg.getCaption());
         chkavD_base_flg.setCheckedValue( "false" );
         chkavD_site_flg.setName( "vD_SITE_FLG" );
         chkavD_site_flg.setWebtags( "" );
         chkavD_site_flg.setCaption( "施設情報を取り込む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_site_flg.getInternalname(), "Caption", chkavD_site_flg.getCaption());
         chkavD_site_flg.setCheckedValue( "false" );
         chkavD_staff_flg.setName( "vD_STAFF_FLG" );
         chkavD_staff_flg.setWebtags( "" );
         chkavD_staff_flg.setCaption( "参加スタッフ情報を取り込む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_staff_flg.getInternalname(), "Caption", chkavD_staff_flg.getCaption());
         chkavD_staff_flg.setCheckedValue( "false" );
         chkavD_list_chk.setName( "vD_LIST_CHK" );
         chkavD_list_chk.setWebtags( "" );
         chkavD_list_chk.setCaption( "選択肢リストを取り込む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_list_chk.getInternalname(), "Caption", chkavD_list_chk.getCaption());
         chkavD_list_chk.setCheckedValue( "false" );
         chkavD_subject_chk.setName( "vD_SUBJECT_CHK" );
         chkavD_subject_chk.setWebtags( "" );
         chkavD_subject_chk.setCaption( "患者データを取り込む" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_subject_chk.getInternalname(), "Caption", chkavD_subject_chk.getCaption());
         chkavD_subject_chk.setCheckedValue( "false" );
         chkavD_grd_all_chk.setName( "vD_GRD_ALL_CHK" );
         chkavD_grd_all_chk.setWebtags( "" );
         chkavD_grd_all_chk.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_grd_all_chk.getInternalname(), "Caption", chkavD_grd_all_chk.getCaption());
         chkavD_grd_all_chk.setCheckedValue( "false" );
         GXCCtl = "CTLCHECK_" + sGXsfl_206_idx ;
         chkavCtlcheck.setName( GXCCtl );
         chkavCtlcheck.setWebtags( "" );
         chkavCtlcheck.setCaption( "" );
         chkavCtlcheck.setCheckedValue( "false" );
         chkavH_base_enabled.setName( "vH_BASE_ENABLED" );
         chkavH_base_enabled.setWebtags( "" );
         chkavH_base_enabled.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavH_base_enabled.getInternalname(), "Caption", chkavH_base_enabled.getCaption());
         chkavH_base_enabled.setCheckedValue( "false" );
         chkavH_list_enabled.setName( "vH_LIST_ENABLED" );
         chkavH_list_enabled.setWebtags( "" );
         chkavH_list_enabled.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavH_list_enabled.getInternalname(), "Caption", chkavH_list_enabled.getCaption());
         chkavH_list_enabled.setCheckedValue( "false" );
         chkavH_site_enabled.setName( "vH_SITE_ENABLED" );
         chkavH_site_enabled.setWebtags( "" );
         chkavH_site_enabled.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavH_site_enabled.getInternalname(), "Caption", chkavH_site_enabled.getCaption());
         chkavH_site_enabled.setCheckedValue( "false" );
         chkavH_staff_enabled.setName( "vH_STAFF_ENABLED" );
         chkavH_staff_enabled.setWebtags( "" );
         chkavH_staff_enabled.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavH_staff_enabled.getInternalname(), "Caption", chkavH_staff_enabled.getCaption());
         chkavH_staff_enabled.setCheckedValue( "false" );
         chkavH_subject_enabled.setName( "vH_SUBJECT_ENABLED" );
         chkavH_subject_enabled.setWebtags( "" );
         chkavH_subject_enabled.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavH_subject_enabled.getInternalname(), "Caption", chkavH_subject_enabled.getCaption());
         chkavH_subject_enabled.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_206 ,
                                 short nGXsfl_206_idx ,
                                 String sGXsfl_206_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_2062( ) ;
      while ( nGXsfl_206_idx <= nRC_GXsfl_206 )
      {
         sendrow_2062( ) ;
         nGXsfl_206_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_206_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_206_idx+1)) ;
         sGXsfl_206_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_206_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_2062( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf2K2( ) ;
      /* End function Refresh */
   }

   public void rf2K2( )
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
      wbStart = (short)(206) ;
      nGXsfl_206_idx = (short)(1) ;
      sGXsfl_206_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_206_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2062( ) ;
      nGXsfl_206_Refreshing = (short)(1) ;
      /* Execute user event: e302K2 */
      e302K2 ();
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
         subsflControlProps_2062( ) ;
         /* Execute user event: e312K2 */
         e312K2 ();
         wbEnd = (short)(206) ;
         wb2K0( ) ;
      }
      nGXsfl_206_Refreshing = (short)(0) ;
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
      return AV5B407_SD01_IMPORT_LIST_C.size() ;
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

   public void strup2K0( )
   {
      /* Before Start, stand alone formulas. */
      AV66Pgmname = "B407_WP01_DESIGN_IMPORT" ;
      AV65Pgmdesc = "試験情報インポート" ;
      Gx_err = (short)(0) ;
      edtavD_upload_file_Width = 500 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "Width", GXutil.ltrim( GXutil.str( edtavD_upload_file_Width, 9, 0)));
      edtavD_upload_file_Display = (short)(2) ;
      edtavD_study_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_study_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_study_id_Enabled, 5, 0)));
      edtavD_study_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_study_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_study_nm_Enabled, 5, 0)));
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltbm31_crf_nm_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e292K2 */
      e292K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "B407_sd01_import_list_c"), AV5B407_SD01_IMPORT_LIST_C);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV8H_A_PAGING_SDT);
         /* Read variables values. */
         AV7D_UPLOAD_FILE = httpContext.cgiGet( edtavD_upload_file_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_UPLOAD_FILE", AV7D_UPLOAD_FILE);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_STUDY_ID");
            GX_FocusControl = edtavD_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40D_STUDY_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40D_STUDY_ID", GXutil.ltrim( GXutil.str( AV40D_STUDY_ID, 10, 0)));
         }
         else
         {
            AV40D_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtavD_study_id_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40D_STUDY_ID", GXutil.ltrim( GXutil.str( AV40D_STUDY_ID, 10, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_chg_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_chg_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_CHG_STUDY_ID");
            GX_FocusControl = edtavD_chg_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48D_CHG_STUDY_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48D_CHG_STUDY_ID", GXutil.ltrim( GXutil.str( AV48D_CHG_STUDY_ID, 10, 0)));
         }
         else
         {
            AV48D_CHG_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtavD_chg_study_id_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48D_CHG_STUDY_ID", GXutil.ltrim( GXutil.str( AV48D_CHG_STUDY_ID, 10, 0)));
         }
         AV41D_STUDY_NM = httpContext.cgiGet( edtavD_study_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41D_STUDY_NM", AV41D_STUDY_NM);
         AV35D_BASE_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_base_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35D_BASE_FLG", AV35D_BASE_FLG);
         AV38D_SITE_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_site_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38D_SITE_FLG", AV38D_SITE_FLG);
         AV39D_STAFF_FLG = GXutil.strtobool( httpContext.cgiGet( chkavD_staff_flg.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39D_STAFF_FLG", AV39D_STAFF_FLG);
         AV37D_LIST_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_list_chk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37D_LIST_CHK", AV37D_LIST_CHK);
         AV42D_SUBJECT_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_subject_chk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42D_SUBJECT_CHK", AV42D_SUBJECT_CHK);
         AV36D_GRD_ALL_CHK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_all_chk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36D_GRD_ALL_CHK", AV36D_GRD_ALL_CHK);
         AV9H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
         AV10H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_KNGN_FLG", AV10H_KNGN_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         AV43H_BASE_ENABLED = GXutil.strtobool( httpContext.cgiGet( chkavH_base_enabled.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43H_BASE_ENABLED", AV43H_BASE_ENABLED);
         AV44H_LIST_ENABLED = GXutil.strtobool( httpContext.cgiGet( chkavH_list_enabled.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44H_LIST_ENABLED", AV44H_LIST_ENABLED);
         AV45H_SITE_ENABLED = GXutil.strtobool( httpContext.cgiGet( chkavH_site_enabled.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45H_SITE_ENABLED", AV45H_SITE_ENABLED);
         AV46H_STAFF_ENABLED = GXutil.strtobool( httpContext.cgiGet( chkavH_staff_enabled.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46H_STAFF_ENABLED", AV46H_STAFF_ENABLED);
         AV47H_SUBJECT_ENABLED = GXutil.strtobool( httpContext.cgiGet( chkavH_subject_enabled.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47H_SUBJECT_ENABLED", AV47H_SUBJECT_ENABLED);
         AV50D_ORIGINAL_NAME = httpContext.cgiGet( edtavD_original_name_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50D_ORIGINAL_NAME", AV50D_ORIGINAL_NAME);
         AV55H_FILE_PATH_NAME = httpContext.cgiGet( edtavH_file_path_name_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55H_FILE_PATH_NAME", AV55H_FILE_PATH_NAME);
         /* Read saved values. */
         nRC_GXsfl_206 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_206"), ".", ",")) ;
         AV14P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0223") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0223", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_GXsfl_206 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_206"), ".", ",")) ;
         nGXsfl_206_fel_idx = (short)(0) ;
         while ( nGXsfl_206_fel_idx < nRC_GXsfl_206 )
         {
            nGXsfl_206_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_206_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_206_fel_idx+1)) ;
            sGXsfl_206_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_206_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_2062( ) ;
            AV60GXV1 = (short)(nGXsfl_206_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV60GXV1 = (short)(nGXsfl_206_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV5B407_SD01_IMPORT_LIST_C.size() >= AV60GXV1 ) && ( AV60GXV1 > 0 ) )
            {
               AV5B407_SD01_IMPORT_LIST_C.currentItem( ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)) );
               ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)).setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check( GXutil.strtobool( httpContext.cgiGet( chkavCtlcheck.getInternalname())) );
               ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)).setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id( httpContext.cgiGet( edtavCtltbm31_crf_id_Internalname) );
               ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)).setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm( httpContext.cgiGet( edtavCtltbm31_crf_nm_Internalname) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0223") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0223", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0223") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0223", "");
            }
            if ( (GXutil.strcmp("", AV7D_UPLOAD_FILE)==0) )
            {
               GXCCtl = "vD_UPLOAD_FILE_" + sGXsfl_206_fel_idx ;
               GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
               AV7D_UPLOAD_FILE = httpContext.cgiGet( GXCCtlgxBlob) ;
            }
            AV5B407_SD01_IMPORT_LIST_C.currentItem( ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)) );
         }
         if ( nGXsfl_206_fel_idx == 0 )
         {
            nGXsfl_206_idx = (short)(1) ;
            sGXsfl_206_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_206_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_2062( ) ;
         }
         nGXsfl_206_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         if ( (GXutil.strcmp("", AV7D_UPLOAD_FILE)==0) )
         {
            GXCCtlgxBlob = "vD_UPLOAD_FILE" + "_gxBlob" ;
            AV7D_UPLOAD_FILE = httpContext.cgiGet( GXCCtlgxBlob) ;
         }
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
      /* Execute user event: e292K2 */
      e292K2 ();
      if (returnInSub) return;
   }

   public void e292K2( )
   {
      /* Start Routine */
      AV29C_APP_ID = "B407" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29C_APP_ID", AV29C_APP_ID);
      AV30C_GAMEN_TITLE = AV65Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30C_GAMEN_TITLE", AV30C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV9H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV15W_A_LOGIN_SDT,AV29C_APP_ID,AV30C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0223",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e302K2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV9H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV66Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         AV25W_MSG = AV27W_SESSION.getValue(AV66Pgmname+"_MSG") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         if ( ! (GXutil.strcmp("", AV25W_MSG)==0) )
         {
            AV27W_SESSION.remove(AV66Pgmname+"_MSG");
            httpContext.GX_msglist.addItem(AV25W_MSG);
         }
      }
      AV9H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9H_INIT_FLG", AV9H_INIT_FLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
   }

   public void e112K2( )
   {
      /* 'BTN_IMPORT' Routine */
      if ( (GXutil.strcmp("", AV7D_UPLOAD_FILE)==0) )
      {
         GXt_char1 = AV25W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00007", "インポートファイル", "", "", "", "", GXv_char2) ;
         b407_wp01_design_import_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         httpContext.GX_msglist.addItem(AV25W_MSG);
      }
      else
      {
         if ( AV5B407_SD01_IMPORT_LIST_C.size() == 0 )
         {
            GXt_char1 = AV25W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00007", "ファイル読込ボタンを押下し、インポートする情報", "", "", "", "", GXv_char2) ;
            b407_wp01_design_import_impl.this.GXt_char1 = GXv_char2[0] ;
            AV25W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
            httpContext.GX_msglist.addItem(AV25W_MSG);
         }
         else
         {
            AV49W_SEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49W_SEL_FLG", AV49W_SEL_FLG);
            AV67GXV6 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67GXV6", GXutil.ltrim( GXutil.str( AV67GXV6, 8, 0)));
            while ( AV67GXV6 <= AV5B407_SD01_IMPORT_LIST_C.size() )
            {
               AV6B407_SD01_IMPORT_LIST_I = (SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV67GXV6));
               if ( AV6B407_SD01_IMPORT_LIST_I.getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check() )
               {
                  AV49W_SEL_FLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV49W_SEL_FLG", AV49W_SEL_FLG);
                  if (true) break;
               }
               AV67GXV6 = (int)(AV67GXV6+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67GXV6", GXutil.ltrim( GXutil.str( AV67GXV6, 8, 0)));
            }
            if ( ! AV49W_SEL_FLG )
            {
               GXt_char1 = AV25W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00007", "インポートするCRFデザイン", "", "", "", "", GXv_char2) ;
               b407_wp01_design_import_impl.this.GXt_char1 = GXv_char2[0] ;
               AV25W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
               httpContext.GX_msglist.addItem(AV25W_MSG);
            }
            else
            {
               GXt_char1 = AV25W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00035", "インポート", "", "", "", "", GXv_char2) ;
               b407_wp01_design_import_impl.this.GXt_char1 = GXv_char2[0] ;
               AV25W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
               GXt_char1 = AV16W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV25W_MSG, "", "BTN_IMPORT_EXEC", "", GXv_char2) ;
               b407_wp01_design_import_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
               AV16W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16W_A821_JS", AV16W_A821_JS);
            }
         }
      }
   }

   public void e122K2( )
   {
      /* 'BTN_IMPORT_EXEC' Routine */
      GXv_char2[0] = AV20W_ERRCD ;
      GXv_objcol_svchar3[0] = AV34W_ERRMSG_COL ;
      new b407_pc02_design_import(remoteHandle, context).execute( AV55H_FILE_PATH_NAME, AV40D_STUDY_ID, AV48D_CHG_STUDY_ID, AV35D_BASE_FLG, AV38D_SITE_FLG, AV39D_STAFF_FLG, AV37D_LIST_CHK, AV42D_SUBJECT_CHK, AV5B407_SD01_IMPORT_LIST_C, GXv_char2, GXv_objcol_svchar3) ;
      b407_wp01_design_import_impl.this.AV20W_ERRCD = GXv_char2[0] ;
      AV34W_ERRMSG_COL = GXv_objcol_svchar3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55H_FILE_PATH_NAME", AV55H_FILE_PATH_NAME);
      httpContext.ajax_rsp_assign_attri("", false, "AV40D_STUDY_ID", GXutil.ltrim( GXutil.str( AV40D_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV48D_CHG_STUDY_ID", GXutil.ltrim( GXutil.str( AV48D_CHG_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV35D_BASE_FLG", AV35D_BASE_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV38D_SITE_FLG", AV38D_SITE_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV39D_STAFF_FLG", AV39D_STAFF_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV37D_LIST_CHK", AV37D_LIST_CHK);
      httpContext.ajax_rsp_assign_attri("", false, "AV42D_SUBJECT_CHK", AV42D_SUBJECT_CHK);
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRCD", AV20W_ERRCD);
      if ( GXutil.strcmp(AV20W_ERRCD, "0") != 0 )
      {
         AV68GXV7 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68GXV7", GXutil.ltrim( GXutil.str( AV68GXV7, 8, 0)));
         while ( AV68GXV7 <= AV34W_ERRMSG_COL.size() )
         {
            AV25W_MSG = (String)AV34W_ERRMSG_COL.elementAt(-1+AV68GXV7) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
            httpContext.GX_msglist.addItem(AV25W_MSG);
            AV68GXV7 = (int)(AV68GXV7+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68GXV7", GXutil.ltrim( GXutil.str( AV68GXV7, 8, 0)));
         }
      }
      else
      {
         AV56W_LOG_MSG = "インポート[試験ID:" + GXutil.trim( GXutil.str( AV40D_STUDY_ID, 10, 0)) + " " + "変更後試験ID:" + GXutil.trim( GXutil.str( AV48D_CHG_STUDY_ID, 10, 0)) + " " + "基本情報CHK:" + (AV35D_BASE_FLG ? "On" : "Off") + " " + "施設情報CHK:" + (AV38D_SITE_FLG ? "On" : "Off") + " " + "参加スタッフ情報CHK:" + (AV39D_STAFF_FLG ? "On" : "Off") + " " + "選択肢リストCHK:" + (AV37D_LIST_CHK ? "On" : "Off") + " " + "患者データCHK:" + (AV42D_SUBJECT_CHK ? "On" : "Off") + " " + "CRF選択:" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56W_LOG_MSG", AV56W_LOG_MSG);
         AV57W_CNT = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57W_CNT", GXutil.ltrim( GXutil.str( AV57W_CNT, 4, 0)));
         AV69GXV8 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69GXV8", GXutil.ltrim( GXutil.str( AV69GXV8, 8, 0)));
         while ( AV69GXV8 <= AV5B407_SD01_IMPORT_LIST_C.size() )
         {
            AV6B407_SD01_IMPORT_LIST_I = (SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV69GXV8));
            if ( AV6B407_SD01_IMPORT_LIST_I.getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check() )
            {
               if ( AV57W_CNT > 0 )
               {
                  AV56W_LOG_MSG = AV56W_LOG_MSG + "," ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV56W_LOG_MSG", AV56W_LOG_MSG);
               }
               AV56W_LOG_MSG = AV56W_LOG_MSG + AV6B407_SD01_IMPORT_LIST_I.getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56W_LOG_MSG", AV56W_LOG_MSG);
               AV57W_CNT = (short)(AV57W_CNT+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57W_CNT", GXutil.ltrim( GXutil.str( AV57W_CNT, 4, 0)));
            }
            AV69GXV8 = (int)(AV69GXV8+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69GXV8", GXutil.ltrim( GXutil.str( AV69GXV8, 8, 0)));
         }
         AV56W_LOG_MSG = AV56W_LOG_MSG + "]" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56W_LOG_MSG", AV56W_LOG_MSG);
         new a804_pc01_syslog(remoteHandle, context).execute( AV66Pgmname, "INFO", AV56W_LOG_MSG) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56W_LOG_MSG", AV56W_LOG_MSG);
         GXt_char1 = AV25W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AG00036", "インポート", "", "", "", "", GXv_char2) ;
         b407_wp01_design_import_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         AV27W_SESSION.setValue(AV66Pgmname+"_MSG", AV25W_MSG);
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b407_wp01_design_import"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_MOVE_KBN,1,0))) ;
         httpContext.wjLoc = formatLink("b407_wp01_design_import") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e132K2( )
   {
      /* 'BTN_UPLOAD' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPLOAD", AV10H_KNGN_FLG, "") )
      {
         if ( (GXutil.strcmp("", AV7D_UPLOAD_FILE)==0) )
         {
            GXt_char1 = AV25W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00007", "ファイル", "", "", "", "", GXv_char2) ;
            b407_wp01_design_import_impl.this.GXt_char1 = GXv_char2[0] ;
            AV25W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
            httpContext.GX_msglist.addItem(AV25W_MSG);
         }
         else
         {
            AV51W_LEN = (short)(GXutil.len( AV50D_ORIGINAL_NAME)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51W_LEN", GXutil.ltrim( GXutil.str( AV51W_LEN, 4, 0)));
            if ( AV51W_LEN > 4 )
            {
               AV52W_POS = (short)(AV51W_LEN-4+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52W_POS", GXutil.ltrim( GXutil.str( AV52W_POS, 4, 0)));
               AV54W_FILE_EXT = GXutil.lower( GXutil.substring( AV50D_ORIGINAL_NAME, AV52W_POS, 4)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV54W_FILE_EXT", AV54W_FILE_EXT);
               if ( ( GXutil.strcmp(AV54W_FILE_EXT, ".csv") != 0 ) && ( GXutil.strcmp(AV54W_FILE_EXT, ".zip") != 0 ) )
               {
                  AV21W_ERRFLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERRFLG", AV21W_ERRFLG);
               }
            }
            else
            {
               AV21W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERRFLG", AV21W_ERRFLG);
            }
            if ( AV21W_ERRFLG )
            {
               GXt_char1 = AV25W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00002", "選択したファイル", "", "", "", "", GXv_char2) ;
               b407_wp01_design_import_impl.this.GXt_char1 = GXv_char2[0] ;
               AV25W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
               httpContext.GX_msglist.addItem(AV25W_MSG);
            }
            else
            {
               /* Execute user subroutine: S172 */
               S172 ();
               if (returnInSub) return;
            }
         }
      }
   }

   public void e142K2( )
   {
      /* D_grd_all_chk_Click Routine */
      AV70GXV9 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70GXV9", GXutil.ltrim( GXutil.str( AV70GXV9, 8, 0)));
      while ( AV70GXV9 <= AV5B407_SD01_IMPORT_LIST_C.size() )
      {
         AV6B407_SD01_IMPORT_LIST_I = (SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV70GXV9));
         AV6B407_SD01_IMPORT_LIST_I.setgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check( AV36D_GRD_ALL_CHK );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6B407_SD01_IMPORT_LIST_I", AV6B407_SD01_IMPORT_LIST_I);
         AV70GXV9 = (int)(AV70GXV9+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70GXV9", GXutil.ltrim( GXutil.str( AV70GXV9, 8, 0)));
      }
      httpContext.doAjaxRefresh();
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV14P_MOVE_KBN == 1 )
      {
         AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV27W_SESSION.getValue(AV66Pgmname+"_PAGE"))) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      }
   }

   public void S172( )
   {
      /* 'SUB_UPLOAD' Routine */
      AV35D_BASE_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35D_BASE_FLG", AV35D_BASE_FLG);
      AV38D_SITE_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38D_SITE_FLG", AV38D_SITE_FLG);
      AV39D_STAFF_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39D_STAFF_FLG", AV39D_STAFF_FLG);
      AV37D_LIST_CHK = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37D_LIST_CHK", AV37D_LIST_CHK);
      AV42D_SUBJECT_CHK = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42D_SUBJECT_CHK", AV42D_SUBJECT_CHK);
      AV5B407_SD01_IMPORT_LIST_C.clear();
      gx_BV206 = true ;
      GXv_int4[0] = AV40D_STUDY_ID ;
      GXv_char2[0] = AV41D_STUDY_NM ;
      GXv_boolean5[0] = AV43H_BASE_ENABLED ;
      GXv_boolean6[0] = AV45H_SITE_ENABLED ;
      GXv_boolean7[0] = AV46H_STAFF_ENABLED ;
      GXv_boolean8[0] = AV44H_LIST_ENABLED ;
      GXv_boolean9[0] = AV47H_SUBJECT_ENABLED ;
      GXv_objcol_svchar3[0] = AV5B407_SD01_IMPORT_LIST_C ;
      GXv_char10[0] = AV55H_FILE_PATH_NAME ;
      GXv_char11[0] = AV20W_ERRCD ;
      GXv_objcol_svchar12[0] = AV34W_ERRMSG_COL ;
      new b407_pc01_design_upload(remoteHandle, context).execute( AV7D_UPLOAD_FILE, AV50D_ORIGINAL_NAME, AV54W_FILE_EXT, GXv_int4, GXv_char2, GXv_boolean5, GXv_boolean6, GXv_boolean7, GXv_boolean8, GXv_boolean9, GXv_objcol_svchar3, GXv_char10, GXv_char11, GXv_objcol_svchar12) ;
      b407_wp01_design_import_impl.this.AV40D_STUDY_ID = GXv_int4[0] ;
      b407_wp01_design_import_impl.this.AV41D_STUDY_NM = GXv_char2[0] ;
      b407_wp01_design_import_impl.this.AV43H_BASE_ENABLED = GXv_boolean5[0] ;
      b407_wp01_design_import_impl.this.AV45H_SITE_ENABLED = GXv_boolean6[0] ;
      b407_wp01_design_import_impl.this.AV46H_STAFF_ENABLED = GXv_boolean7[0] ;
      b407_wp01_design_import_impl.this.AV44H_LIST_ENABLED = GXv_boolean8[0] ;
      b407_wp01_design_import_impl.this.AV47H_SUBJECT_ENABLED = GXv_boolean9[0] ;
      AV5B407_SD01_IMPORT_LIST_C = GXv_objcol_svchar3[0] ;
      b407_wp01_design_import_impl.this.AV55H_FILE_PATH_NAME = GXv_char10[0] ;
      b407_wp01_design_import_impl.this.AV20W_ERRCD = GXv_char11[0] ;
      AV34W_ERRMSG_COL = GXv_objcol_svchar12[0] ;
      gx_BV206 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_UPLOAD_FILE", AV7D_UPLOAD_FILE);
      httpContext.ajax_rsp_assign_attri("", false, "AV50D_ORIGINAL_NAME", AV50D_ORIGINAL_NAME);
      httpContext.ajax_rsp_assign_attri("", false, "AV54W_FILE_EXT", AV54W_FILE_EXT);
      httpContext.ajax_rsp_assign_attri("", false, "AV40D_STUDY_ID", GXutil.ltrim( GXutil.str( AV40D_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV41D_STUDY_NM", AV41D_STUDY_NM);
      httpContext.ajax_rsp_assign_attri("", false, "AV43H_BASE_ENABLED", AV43H_BASE_ENABLED);
      httpContext.ajax_rsp_assign_attri("", false, "AV45H_SITE_ENABLED", AV45H_SITE_ENABLED);
      httpContext.ajax_rsp_assign_attri("", false, "AV46H_STAFF_ENABLED", AV46H_STAFF_ENABLED);
      httpContext.ajax_rsp_assign_attri("", false, "AV44H_LIST_ENABLED", AV44H_LIST_ENABLED);
      httpContext.ajax_rsp_assign_attri("", false, "AV47H_SUBJECT_ENABLED", AV47H_SUBJECT_ENABLED);
      httpContext.ajax_rsp_assign_attri("", false, "AV55H_FILE_PATH_NAME", AV55H_FILE_PATH_NAME);
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRCD", AV20W_ERRCD);
      if ( GXutil.strcmp(AV20W_ERRCD, "0") != 0 )
      {
         tblTbl_study_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_study_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_study_Visible, 5, 0)));
         AV71GXV10 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71GXV10", GXutil.ltrim( GXutil.str( AV71GXV10, 8, 0)));
         while ( AV71GXV10 <= AV34W_ERRMSG_COL.size() )
         {
            AV25W_MSG = (String)AV34W_ERRMSG_COL.elementAt(-1+AV71GXV10) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
            httpContext.GX_msglist.addItem(AV25W_MSG);
            AV71GXV10 = (int)(AV71GXV10+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71GXV10", GXutil.ltrim( GXutil.str( AV71GXV10, 8, 0)));
         }
      }
      else
      {
         tblTbl_study_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_study_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_study_Visible, 5, 0)));
         chkavD_base_flg.setVisible( (AV43H_BASE_ENABLED ? 1 : 0) );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_base_flg.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavD_base_flg.getVisible(), 5, 0)));
         chkavD_site_flg.setVisible( (AV45H_SITE_ENABLED ? 1 : 0) );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_site_flg.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavD_site_flg.getVisible(), 5, 0)));
         chkavD_staff_flg.setVisible( (AV46H_STAFF_ENABLED ? 1 : 0) );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_staff_flg.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavD_staff_flg.getVisible(), 5, 0)));
         chkavD_list_chk.setVisible( (AV44H_LIST_ENABLED ? 1 : 0) );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_list_chk.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavD_list_chk.getVisible(), 5, 0)));
         chkavD_subject_chk.setVisible( (AV47H_SUBJECT_ENABLED ? 1 : 0) );
         httpContext.ajax_rsp_assign_prop("", false, chkavD_subject_chk.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavD_subject_chk.getVisible(), 5, 0)));
         new a804_pc01_syslog(remoteHandle, context).execute( AV66Pgmname, "INFO", "ファイル読込："+AV50D_ORIGINAL_NAME) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT13[0] = AV15W_A_LOGIN_SDT;
      GXv_char11[0] = AV20W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT13, GXv_char11) ;
      AV15W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT13[0] ;
      b407_wp01_design_import_impl.this.AV20W_ERRCD = GXv_char11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRCD", AV20W_ERRCD);
      if ( GXutil.strcmp(AV20W_ERRCD, "0") != 0 )
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
      AV7D_UPLOAD_FILE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_UPLOAD_FILE", AV7D_UPLOAD_FILE);
      AV55H_FILE_PATH_NAME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55H_FILE_PATH_NAME", AV55H_FILE_PATH_NAME);
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      AV5B407_SD01_IMPORT_LIST_C.clear();
      gx_BV206 = true ;
      AV16W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16W_A821_JS", AV16W_A821_JS);
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV16W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV16W_A821_JS ;
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var upFile = document.getElementById('"+edtavD_upload_file_Internalname+"');" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	if (upFile.addEventListener) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"		upFile.addEventListener('focus', function(){upFileBlur();}, false);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	} else if (window.attachEvent) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"		upFile.attachEvent('onfocus',function(){upFileBlur();});" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	upFileBlur();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function upFileBlur() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	setTimeout('document.getElementById(\\'"+edtavD_upload_file_Internalname+"\\').blur()',300);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblText_onclick_Caption = "<script language=\"javascript\">" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"function func_copyParams(){" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"var _filename = MAINFORM."+edtavD_upload_file_Internalname+".value;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"MAINFORM."+edtavD_original_name_Internalname+".value = _filename.substring(_filename.lastIndexOf('\\\\')+1, _filename.length);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"return true;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblTxt_btn_upload_Jsonclick = "func_copyParams()" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upload_Internalname, "Jsonclick", lblTxt_btn_upload_Jsonclick);
   }

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char11[0] = AV10H_KNGN_FLG ;
      GXv_char10[0] = AV20W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV29C_APP_ID, GXv_char11, GXv_char10) ;
      b407_wp01_design_import_impl.this.AV10H_KNGN_FLG = GXv_char11[0] ;
      b407_wp01_design_import_impl.this.AV20W_ERRCD = GXv_char10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29C_APP_ID", AV29C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_KNGN_FLG", AV10H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERRCD", AV20W_ERRCD);
      if ( GXutil.strcmp(AV20W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S182( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV66Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b407_wp01_design_import");
   }

   public void e152K2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e162K2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      }
      else
      {
         AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e172K2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e182K2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e192K2( )
   {
      /* 'PAGE01' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e202K2( )
   {
      /* 'PAGE02' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e212K2( )
   {
      /* 'PAGE03' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e222K2( )
   {
      /* 'PAGE04' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e232K2( )
   {
      /* 'PAGE05' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e242K2( )
   {
      /* 'PAGE06' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e252K2( )
   {
      /* 'PAGE07' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e262K2( )
   {
      /* 'PAGE08' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e272K2( )
   {
      /* 'PAGE09' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e282K2( )
   {
      /* 'PAGE10' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S162( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      AV8H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8H_A_PAGING_SDT", AV8H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT14[0] = AV8H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT14) ;
      AV8H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT14[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_study_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_study_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_study_Visible, 5, 0)));
         tblTbl_list_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         tblTbl_list_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV11H_SRCH_FLG, "1") == 0 ) && ! AV21W_ERRFLG )
         {
            GXt_char1 = AV25W_MSG ;
            GXv_char11[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char11) ;
            b407_wp01_design_import_impl.this.GXt_char1 = GXv_char11[0] ;
            AV25W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
            httpContext.GX_msglist.addItem(AV25W_MSG);
         }
      }
      else
      {
         tblTbl_study_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_study_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_study_Visible, 5, 0)));
         tblTbl_list_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         tblTbl_list_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   private void e312K2( )
   {
      /* Grid1_Load Routine */
      AV60GXV1 = (short)(1) ;
      while ( AV60GXV1 <= AV5B407_SD01_IMPORT_LIST_C.size() )
      {
         AV5B407_SD01_IMPORT_LIST_C.currentItem( ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5B407_SD01_IMPORT_LIST_C", AV5B407_SD01_IMPORT_LIST_C);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(206) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_2062( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         AV60GXV1 = (short)(AV60GXV1+1) ;
      }
   }

   public void wb_table2_225_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblText_onclick_Internalname, lblText_onclick_Caption, "", "", lblText_onclick_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_import_exec_Internalname, "BTN_IMPORT_EXEC", "", "", lblBtn_import_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_IMPORT_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV9H_INIT_FLG), GXutil.rtrim( localUtil.format( AV9H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 232,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV10H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV10H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(232);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(233);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B407_WP01_DESIGN_IMPORT.htm");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavH_base_enabled.getInternalname(), GXutil.booltostr( AV43H_BASE_ENABLED), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(234, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(234);\"");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavH_list_enabled.getInternalname(), GXutil.booltostr( AV44H_LIST_ENABLED), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(235, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(235);\"");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavH_site_enabled.getInternalname(), GXutil.booltostr( AV45H_SITE_ENABLED), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(236, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(236);\"");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 237,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavH_staff_enabled.getInternalname(), GXutil.booltostr( AV46H_STAFF_ENABLED), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(237, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(237);\"");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 238,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavH_subject_enabled.getInternalname(), GXutil.booltostr( AV47H_SUBJECT_ENABLED), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(238, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(238);\"");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_original_name_Internalname, GXutil.rtrim( AV50D_ORIGINAL_NAME), GXutil.rtrim( localUtil.format( AV50D_ORIGINAL_NAME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_original_name_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 60, "px", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B407_WP01_DESIGN_IMPORT.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 240,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_file_path_name_Internalname, GXutil.rtrim( AV55H_FILE_PATH_NAME), GXutil.rtrim( localUtil.format( AV55H_FILE_PATH_NAME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(240);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_file_path_name_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 100, "px", 1, "row", 300, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_225_2K2e( true) ;
      }
      else
      {
         wb_table2_225_2K2e( false) ;
      }
   }

   public void wb_table1_2_2K2( boolean wbgen )
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
         wb_table3_6_2K2( true) ;
      }
      else
      {
         wb_table3_6_2K2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_2K2e( boolean wbgen )
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
         wb_table1_2_2K2e( true) ;
      }
      else
      {
         wb_table1_2_2K2e( false) ;
      }
   }

   public void wb_table3_6_2K2( boolean wbgen )
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
         wb_table4_12_2K2( true) ;
      }
      else
      {
         wb_table4_12_2K2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table5_18_2K2( true) ;
      }
      else
      {
         wb_table5_18_2K2( false) ;
      }
      return  ;
   }

   public void wb_table5_18_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0223"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0223"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0223"+"");
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
         wb_table3_6_2K2e( true) ;
      }
      else
      {
         wb_table3_6_2K2e( false) ;
      }
   }

   public void wb_table5_18_2K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_21_2K2( true) ;
      }
      else
      {
         wb_table6_21_2K2( false) ;
      }
      return  ;
   }

   public void wb_table6_21_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_33_2K2( true) ;
      }
      else
      {
         wb_table7_33_2K2( false) ;
      }
      return  ;
   }

   public void wb_table7_33_2K2e( boolean wbgen )
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
         httpContext.writeText( "<td style=\"height:7px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_61_2K2( true) ;
      }
      else
      {
         wb_table8_61_2K2( false) ;
      }
      return  ;
   }

   public void wb_table8_61_2K2e( boolean wbgen )
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
         wb_table9_101_2K2( true) ;
      }
      else
      {
         wb_table9_101_2K2( false) ;
      }
      return  ;
   }

   public void wb_table9_101_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_18_2K2e( true) ;
      }
      else
      {
         wb_table5_18_2K2e( false) ;
      }
   }

   public void wb_table9_101_2K2( boolean wbgen )
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
         wb_table10_104_2K2( true) ;
      }
      else
      {
         wb_table10_104_2K2( false) ;
      }
      return  ;
   }

   public void wb_table10_104_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_199_2K2( true) ;
      }
      else
      {
         wb_table11_199_2K2( false) ;
      }
      return  ;
   }

   public void wb_table11_199_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"206\">") ;
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
      if ( wbEnd == 206 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_206 = (short)(nGXsfl_206_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV60GXV1 = nGXsfl_206_idx ;
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
         wb_table9_101_2K2e( true) ;
      }
      else
      {
         wb_table9_101_2K2e( false) ;
      }
   }

   public void wb_table11_199_2K2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_grd_all_chk.getInternalname(), GXutil.booltostr( AV36D_GRD_ALL_CHK), "", 1, 1, "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(202, this, 'true', 'false');gx.ajax.executeCliEvent('e142k2_client',this);gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(202);\"");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, "選択", "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, "CRF", "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_199_2K2e( true) ;
      }
      else
      {
         wb_table11_199_2K2e( false) ;
      }
   }

   public void wb_table10_104_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_110_2K2( true) ;
      }
      else
      {
         wb_table12_110_2K2( false) ;
      }
      return  ;
   }

   public void wb_table12_110_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_104_2K2e( true) ;
      }
      else
      {
         wb_table10_104_2K2e( false) ;
      }
   }

   public void wb_table12_110_2K2( boolean wbgen )
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
         wb_table13_113_2K2( true) ;
      }
      else
      {
         wb_table13_113_2K2( false) ;
      }
      return  ;
   }

   public void wb_table13_113_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_119_2K2( true) ;
      }
      else
      {
         wb_table14_119_2K2( false) ;
      }
      return  ;
   }

   public void wb_table14_119_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_125_2K2( true) ;
      }
      else
      {
         wb_table15_125_2K2( false) ;
      }
      return  ;
   }

   public void wb_table15_125_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_131_2K2( true) ;
      }
      else
      {
         wb_table16_131_2K2( false) ;
      }
      return  ;
   }

   public void wb_table16_131_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_137_2K2( true) ;
      }
      else
      {
         wb_table17_137_2K2( false) ;
      }
      return  ;
   }

   public void wb_table17_137_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_143_2K2( true) ;
      }
      else
      {
         wb_table18_143_2K2( false) ;
      }
      return  ;
   }

   public void wb_table18_143_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_149_2K2( true) ;
      }
      else
      {
         wb_table19_149_2K2( false) ;
      }
      return  ;
   }

   public void wb_table19_149_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_155_2K2( true) ;
      }
      else
      {
         wb_table20_155_2K2( false) ;
      }
      return  ;
   }

   public void wb_table20_155_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_161_2K2( true) ;
      }
      else
      {
         wb_table21_161_2K2( false) ;
      }
      return  ;
   }

   public void wb_table21_161_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_167_2K2( true) ;
      }
      else
      {
         wb_table22_167_2K2( false) ;
      }
      return  ;
   }

   public void wb_table22_167_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_173_2K2( true) ;
      }
      else
      {
         wb_table23_173_2K2( false) ;
      }
      return  ;
   }

   public void wb_table23_173_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_179_2K2( true) ;
      }
      else
      {
         wb_table24_179_2K2( false) ;
      }
      return  ;
   }

   public void wb_table24_179_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_185_2K2( true) ;
      }
      else
      {
         wb_table25_185_2K2( false) ;
      }
      return  ;
   }

   public void wb_table25_185_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_191_2K2( true) ;
      }
      else
      {
         wb_table26_191_2K2( false) ;
      }
      return  ;
   }

   public void wb_table26_191_2K2e( boolean wbgen )
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
         wb_table12_110_2K2e( true) ;
      }
      else
      {
         wb_table12_110_2K2e( false) ;
      }
   }

   public void wb_table26_191_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_191_2K2e( true) ;
      }
      else
      {
         wb_table26_191_2K2e( false) ;
      }
   }

   public void wb_table25_185_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_185_2K2e( true) ;
      }
      else
      {
         wb_table25_185_2K2e( false) ;
      }
   }

   public void wb_table24_179_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_179_2K2e( true) ;
      }
      else
      {
         wb_table24_179_2K2e( false) ;
      }
   }

   public void wb_table23_173_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_173_2K2e( true) ;
      }
      else
      {
         wb_table23_173_2K2e( false) ;
      }
   }

   public void wb_table22_167_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_167_2K2e( true) ;
      }
      else
      {
         wb_table22_167_2K2e( false) ;
      }
   }

   public void wb_table21_161_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_161_2K2e( true) ;
      }
      else
      {
         wb_table21_161_2K2e( false) ;
      }
   }

   public void wb_table20_155_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_155_2K2e( true) ;
      }
      else
      {
         wb_table20_155_2K2e( false) ;
      }
   }

   public void wb_table19_149_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_149_2K2e( true) ;
      }
      else
      {
         wb_table19_149_2K2e( false) ;
      }
   }

   public void wb_table18_143_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_143_2K2e( true) ;
      }
      else
      {
         wb_table18_143_2K2e( false) ;
      }
   }

   public void wb_table17_137_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_137_2K2e( true) ;
      }
      else
      {
         wb_table17_137_2K2e( false) ;
      }
   }

   public void wb_table16_131_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_131_2K2e( true) ;
      }
      else
      {
         wb_table16_131_2K2e( false) ;
      }
   }

   public void wb_table15_125_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_125_2K2e( true) ;
      }
      else
      {
         wb_table15_125_2K2e( false) ;
      }
   }

   public void wb_table14_119_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_119_2K2e( true) ;
      }
      else
      {
         wb_table14_119_2K2e( false) ;
      }
   }

   public void wb_table13_113_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_113_2K2e( true) ;
      }
      else
      {
         wb_table13_113_2K2e( false) ;
      }
   }

   public void wb_table8_61_2K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_study_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 725, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_study_Internalname, tblTbl_study_Internalname, "", "TableForm", 0, "", "", 1, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"2\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "インポートする情報を選択してください。", "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#FFFFFF;", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, "試験ID", "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table27_69_2K2( true) ;
      }
      else
      {
         wb_table27_69_2K2( false) ;
      }
      return  ;
   }

   public void wb_table27_69_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, "試験名", "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_study_nm_Internalname, GXutil.rtrim( AV41D_STUDY_NM), GXutil.rtrim( localUtil.format( AV41D_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_study_nm_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_study_nm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table28_83_2K2( true) ;
      }
      else
      {
         wb_table28_83_2K2( false) ;
      }
      return  ;
   }

   public void wb_table28_83_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_61_2K2e( true) ;
      }
      else
      {
         wb_table8_61_2K2e( false) ;
      }
   }

   public void wb_table28_83_2K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "Table", 0, "", "", 1, 4, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "AttributeChk" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_base_flg.getInternalname(), GXutil.booltostr( AV35D_BASE_FLG), "", chkavD_base_flg.getVisible(), 1, "true", "基本情報を取り込む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(86, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(86);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "AttributeChk" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_site_flg.getInternalname(), GXutil.booltostr( AV38D_SITE_FLG), "", chkavD_site_flg.getVisible(), 1, "true", "施設情報を取り込む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(88, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(88);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "AttributeChk" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_staff_flg.getInternalname(), GXutil.booltostr( AV39D_STAFF_FLG), "", chkavD_staff_flg.getVisible(), 1, "true", "参加スタッフ情報を取り込む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(90, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(90);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "Table" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_list_chk.getInternalname(), GXutil.booltostr( AV37D_LIST_CHK), "", chkavD_list_chk.getVisible(), 1, "true", "選択肢リストを取り込む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(93, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(93);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         ClassString = "Table" ;
         StyleString = "" ;
         GxWebStd.gx_checkbox_ctrl( httpContext, chkavD_subject_chk.getInternalname(), GXutil.booltostr( AV42D_SUBJECT_CHK), "", chkavD_subject_chk.getVisible(), 1, "true", "患者データを取り込む", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(95, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(95);\"");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_83_2K2e( true) ;
      }
      else
      {
         wb_table28_83_2K2e( false) ;
      }
   }

   public void wb_table27_69_2K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV40D_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtavD_study_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40D_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV40D_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_study_id_Jsonclick, 0, "Attribute", "", "", "", 1, edtavD_study_id_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "※試験IDを変更しインポートする場合、IDを入力します。", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_chg_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV48D_CHG_STUDY_ID, (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48D_CHG_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_chg_study_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_69_2K2e( true) ;
      }
      else
      {
         wb_table27_69_2K2e( false) ;
      }
   }

   public void wb_table7_33_2K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_info_Internalname, tblTbl_info_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "【注意事項】", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\"  style=\"width:30px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "(1)", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "インポートファイルを選択→ファイル読込ボタン押下→インポートする情報の選択チェック→インポートボタン押下の順に行ってください。", "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "(2)", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "インポートファイルは「試験情報エクスポート」画面で出力されるファイルフォーマットに対応しています。", "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "(3)", "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "データは、選択した情報を「DBより全て削除→CSVデータをDB登録」で反映されます。", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "color:#0000FF;", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_33_2K2e( true) ;
      }
      else
      {
         wb_table7_33_2K2e( false) ;
      }
   }

   public void wb_table6_21_2K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 725, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "TableForm", 0, "", "", 1, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "インポートファイル", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "Image" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_206_idx + "',0)\"" ;
         edtavD_upload_file_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "Filetype", edtavD_upload_file_Filetype);
         if ( ! (GXutil.strcmp("", AV7D_UPLOAD_FILE)==0) )
         {
            gxblobfileaux.setSource( AV7D_UPLOAD_FILE );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavD_upload_file_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavD_upload_file_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV7D_UPLOAD_FILE = gxblobfileaux.getAbsoluteName() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7D_UPLOAD_FILE", AV7D_UPLOAD_FILE);
               edtavD_upload_file_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "Filetype", edtavD_upload_file_Filetype);
               gxblobfileaux.setBlobToDelete();
            }
         }
         GxWebStd.gx_blob_field( httpContext, edtavD_upload_file_Internalname, GXutil.rtrim( AV7D_UPLOAD_FILE), httpContext.getResourceRelative(AV7D_UPLOAD_FILE), ((GXutil.strcmp("", edtavD_upload_file_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavD_upload_file_Filetype)==0) ? AV7D_UPLOAD_FILE : edtavD_upload_file_Filetype)) : edtavD_upload_file_Contenttype), false, "", edtavD_upload_file_Parameters, edtavD_upload_file_Display, 1, 1, "", "", 0, -1, edtavD_upload_file_Width, "px", 60, "px", 0, 0, 0, edtavD_upload_file_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(26);\"", "", "", "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "URL", httpContext.getResourceRelative(AV7D_UPLOAD_FILE));
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr style=\"text-align:center\">") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"2\" >") ;
         wb_table29_29_2K2( true) ;
      }
      else
      {
         wb_table29_29_2K2( false) ;
      }
      return  ;
   }

   public void wb_table29_29_2K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_21_2K2e( true) ;
      }
      else
      {
         wb_table6_21_2K2e( false) ;
      }
   }

   public void wb_table29_29_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upload_Internalname, "ファイル読込", "", "", lblTxt_btn_upload_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPLOAD\\'."+"'", "background:transparent;", "TextBlockBtnList120", 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table29_29_2K2e( true) ;
      }
      else
      {
         wb_table29_29_2K2e( false) ;
      }
   }

   public void wb_table4_12_2K2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_import_Internalname, "インポート", "", "", lblTxt_btn_import_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_IMPORT\\'."+"'", "", "TextBlockBtnList120", 5, "", 1, 1, (short)(0), "HLP_B407_WP01_DESIGN_IMPORT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_2K2e( true) ;
      }
      else
      {
         wb_table4_12_2K2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV14P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_MOVE_KBN", GXutil.str( AV14P_MOVE_KBN, 1, 0));
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
      pa2K2( ) ;
      ws2K2( ) ;
      we2K2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513313484");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b407_wp01_design_import.js", "?202071513313484");
      /* End function include_jscripts */
   }

   public void subsflControlProps_2062( )
   {
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_206_idx );
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_206_idx ;
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_206_idx ;
   }

   public void subsflControlProps_fel_2062( )
   {
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_206_fel_idx );
      edtavCtltbm31_crf_id_Internalname = "CTLTBM31_CRF_ID_"+sGXsfl_206_fel_idx ;
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_206_fel_idx ;
   }

   public void sendrow_2062( )
   {
      subsflControlProps_2062( ) ;
      wb2K0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_206_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_206_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_206_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_206_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_206_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_206_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grid_header3_Internalname+"_"+sGXsfl_206_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"",new Integer(725),"","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:60px\""});
         /* Check box */
         TempTags = " " + ((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 212,'',false,'"+sGXsfl_206_idx+"',206)\"" : " ") ;
         ClassString = "AttributeChk" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlcheck.getInternalname(),GXutil.booltostr( ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)).getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(212, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(212);\"" : " ")});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable4_Internalname+"_"+sGXsfl_206_idx,new Integer(1),"Table","","","","","","",new Integer(0),new Integer(0),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_id_Internalname,GXutil.rtrim( ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)).getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm31_crf_id_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm31_crf_id_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(206),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_nm_Internalname,GXutil.rtrim( ((SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem)AV5B407_SD01_IMPORT_LIST_C.elementAt(-1+AV60GXV1)).getgxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm31_crf_nm_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm31_crf_nm_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(206),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
         GXCCtl = "vD_UPLOAD_FILE_" + sGXsfl_206_idx ;
         GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
         GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, GXutil.rtrim( AV7D_UPLOAD_FILE));
         /* End of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( 1 > 0 )
            {
               if ( ((int)((nGXsfl_206_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_206_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_206_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_206_idx+1)) ;
         sGXsfl_206_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_206_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_2062( ) ;
      }
      /* End function sendrow_2062 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_import_Internalname = "TXT_BTN_IMPORT" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavD_upload_file_Internalname = "vD_UPLOAD_FILE" ;
      lblTxt_btn_upload_Internalname = "TXT_BTN_UPLOAD" ;
      tblTable9_Internalname = "TABLE9" ;
      tblTable6_Internalname = "TABLE6" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      tblTbl_info_Internalname = "TBL_INFO" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtavD_study_id_Internalname = "vD_STUDY_ID" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavD_chg_study_id_Internalname = "vD_CHG_STUDY_ID" ;
      tblTable3_Internalname = "TABLE3" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtavD_study_nm_Internalname = "vD_STUDY_NM" ;
      chkavD_base_flg.setInternalname( "vD_BASE_FLG" );
      chkavD_site_flg.setInternalname( "vD_SITE_FLG" );
      chkavD_staff_flg.setInternalname( "vD_STAFF_FLG" );
      chkavD_list_chk.setInternalname( "vD_LIST_CHK" );
      chkavD_subject_chk.setInternalname( "vD_SUBJECT_CHK" );
      tblTable8_Internalname = "TABLE8" ;
      tblTbl_study_Internalname = "TBL_STUDY" ;
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
      tblTable4_Internalname = "TABLE4" ;
      tblTbl_grid_header3_Internalname = "TBL_GRID_HEADER3" ;
      tblTbl_list_Internalname = "TBL_LIST" ;
      tblTable5_Internalname = "TABLE5" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblText_onclick_Internalname = "TEXT_ONCLICK" ;
      lblBtn_import_exec_Internalname = "BTN_IMPORT_EXEC" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      chkavH_base_enabled.setInternalname( "vH_BASE_ENABLED" );
      chkavH_list_enabled.setInternalname( "vH_LIST_ENABLED" );
      chkavH_site_enabled.setInternalname( "vH_SITE_ENABLED" );
      chkavH_staff_enabled.setInternalname( "vH_STAFF_ENABLED" );
      chkavH_subject_enabled.setInternalname( "vH_SUBJECT_ENABLED" );
      edtavD_original_name_Internalname = "vD_ORIGINAL_NAME" ;
      edtavH_file_path_name_Internalname = "vH_FILE_PATH_NAME" ;
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
      edtavD_upload_file_Jsonclick = "" ;
      edtavD_upload_file_Parameters = "" ;
      edtavD_upload_file_Contenttype = "text/csv" ;
      edtavD_upload_file_Filetype = "" ;
      edtavD_upload_file_Width = 250 ;
      edtavD_upload_file_Display = (short)(0) ;
      edtavD_chg_study_id_Jsonclick = "" ;
      edtavD_study_id_Jsonclick = "" ;
      edtavD_study_id_Enabled = 1 ;
      edtavD_study_nm_Jsonclick = "" ;
      edtavD_study_nm_Enabled = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltbm31_crf_nm_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavH_file_path_name_Jsonclick = "" ;
      edtavD_original_name_Jsonclick = "" ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblText_onclick_Jsonclick = "" ;
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
      lblText_onclick_Caption = "Text_onclick" ;
      chkavD_subject_chk.setVisible( 1 );
      chkavD_list_chk.setVisible( 1 );
      chkavD_staff_flg.setVisible( 1 );
      chkavD_site_flg.setVisible( 1 );
      chkavD_base_flg.setVisible( 1 );
      tblTbl_study_Visible = 1 ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      chkavH_subject_enabled.setCaption( "" );
      chkavH_staff_enabled.setCaption( "" );
      chkavH_site_enabled.setCaption( "" );
      chkavH_list_enabled.setCaption( "" );
      chkavH_base_enabled.setCaption( "" );
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
                  /* Execute user subroutine: S182 */
                  S182 ();
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
      AV5B407_SD01_IMPORT_LIST_C = new GxObjectCollection(SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem.class, "B407_SD01_IMPORT_LIST.B407_SD01_IMPORT_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV8H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV66Pgmname = "" ;
      AV29C_APP_ID = "" ;
      AV16W_A821_JS = "" ;
      AV11H_SRCH_FLG = "" ;
      GXCCtlgxBlob = "" ;
      AV7D_UPLOAD_FILE = "" ;
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
      GXCCtl = "" ;
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV65Pgmdesc = "" ;
      AV41D_STUDY_NM = "" ;
      AV9H_INIT_FLG = "" ;
      AV10H_KNGN_FLG = "" ;
      AV50D_ORIGINAL_NAME = "" ;
      AV55H_FILE_PATH_NAME = "" ;
      AV30C_GAMEN_TITLE = "" ;
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV25W_MSG = "" ;
      AV27W_SESSION = httpContext.getWebSession();
      AV6B407_SD01_IMPORT_LIST_I = new SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem(remoteHandle, context);
      AV20W_ERRCD = "" ;
      AV34W_ERRMSG_COL = new GxObjectCollection(String.class, "internal", "");
      AV56W_LOG_MSG = "" ;
      AV54W_FILE_EXT = "" ;
      GXv_int4 = new long [1] ;
      GXv_char2 = new String [1] ;
      GXv_boolean5 = new boolean [1] ;
      GXv_boolean6 = new boolean [1] ;
      GXv_boolean7 = new boolean [1] ;
      GXv_boolean8 = new boolean [1] ;
      GXv_boolean9 = new boolean [1] ;
      GXv_objcol_svchar3 = new GxObjectCollection [1] ;
      GXv_objcol_svchar12 = new GxObjectCollection [1] ;
      GXv_SdtA_LOGIN_SDT13 = new SdtA_LOGIN_SDT [1] ;
      lblTxt_btn_upload_Jsonclick = "" ;
      GXv_char10 = new String [1] ;
      GXv_SdtA_PAGING_SDT14 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char11 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblBtn_import_exec_Jsonclick = "" ;
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
      lblTextblock17_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      lblTxt_btn_import_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b407_wp01_design_import__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV66Pgmname = "B407_WP01_DESIGN_IMPORT" ;
      AV65Pgmdesc = "試験情報インポート" ;
      /* GeneXus formulas. */
      AV66Pgmname = "B407_WP01_DESIGN_IMPORT" ;
      AV65Pgmdesc = "試験情報インポート" ;
      Gx_err = (short)(0) ;
      edtavD_upload_file_Width = 500 ;
      edtavD_upload_file_Display = (short)(2) ;
      edtavD_study_id_Enabled = 0 ;
      edtavD_study_nm_Enabled = 0 ;
      edtavCtltbm31_crf_id_Enabled = 0 ;
      edtavCtltbm31_crf_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV14P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV14P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_206 ;
   private short nGXsfl_206_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV60GXV1 ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_206_Refreshing=0 ;
   private short Gx_err ;
   private short edtavD_upload_file_Display ;
   private short nGXsfl_206_fel_idx=1 ;
   private short AV57W_CNT ;
   private short AV51W_LEN ;
   private short AV52W_POS ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int edtavD_upload_file_Width ;
   private int edtavD_study_id_Enabled ;
   private int edtavD_study_nm_Enabled ;
   private int edtavCtltbm31_crf_id_Enabled ;
   private int edtavCtltbm31_crf_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV67GXV6 ;
   private int AV68GXV7 ;
   private int AV69GXV8 ;
   private int AV70GXV9 ;
   private int tblTbl_study_Visible ;
   private int AV71GXV10 ;
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
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nRecordCount ;
   private long AV40D_STUDY_ID ;
   private long AV48D_CHG_STUDY_ID ;
   private long GXv_int4[] ;
   private long GRID1_nCurrentRecord ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_206_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV66Pgmname ;
   private String GXCCtlgxBlob ;
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
   private String GXCCtl ;
   private String GXDecQS ;
   private String AV65Pgmdesc ;
   private String edtavD_upload_file_Internalname ;
   private String edtavD_study_id_Internalname ;
   private String edtavD_study_nm_Internalname ;
   private String edtavD_chg_study_id_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String edtavD_original_name_Internalname ;
   private String edtavH_file_path_name_Internalname ;
   private String sGXsfl_206_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String GXv_char2[] ;
   private String tblTbl_study_Internalname ;
   private String lblText_onclick_Caption ;
   private String lblText_onclick_Internalname ;
   private String lblTxt_btn_upload_Jsonclick ;
   private String lblTxt_btn_upload_Internalname ;
   private String GXv_char10[] ;
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
   private String GXt_char1 ;
   private String GXv_char11[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblText_onclick_Jsonclick ;
   private String lblBtn_import_exec_Internalname ;
   private String lblBtn_import_exec_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String edtavD_original_name_Jsonclick ;
   private String edtavH_file_path_name_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable5_Internalname ;
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
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtavD_study_nm_Jsonclick ;
   private String tblTable8_Internalname ;
   private String tblTable3_Internalname ;
   private String edtavD_study_id_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavD_chg_study_id_Jsonclick ;
   private String tblTbl_info_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String tblTable6_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtavD_upload_file_Filetype ;
   private String edtavD_upload_file_Contenttype ;
   private String edtavD_upload_file_Parameters ;
   private String edtavD_upload_file_Jsonclick ;
   private String tblTable9_Internalname ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_import_Internalname ;
   private String lblTxt_btn_import_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_header3_Internalname ;
   private String tblTable4_Internalname ;
   private String ROClassString ;
   private String edtavCtltbm31_crf_id_Jsonclick ;
   private String edtavCtltbm31_crf_nm_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV21W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV35D_BASE_FLG ;
   private boolean AV38D_SITE_FLG ;
   private boolean AV39D_STAFF_FLG ;
   private boolean AV37D_LIST_CHK ;
   private boolean AV42D_SUBJECT_CHK ;
   private boolean AV36D_GRD_ALL_CHK ;
   private boolean AV43H_BASE_ENABLED ;
   private boolean AV44H_LIST_ENABLED ;
   private boolean AV45H_SITE_ENABLED ;
   private boolean AV46H_STAFF_ENABLED ;
   private boolean AV47H_SUBJECT_ENABLED ;
   private boolean returnInSub ;
   private boolean AV49W_SEL_FLG ;
   private boolean gx_BV206 ;
   private boolean GXv_boolean5[] ;
   private boolean GXv_boolean6[] ;
   private boolean GXv_boolean7[] ;
   private boolean GXv_boolean8[] ;
   private boolean GXv_boolean9[] ;
   private String AV7D_UPLOAD_FILE ;
   private String AV29C_APP_ID ;
   private String AV16W_A821_JS ;
   private String AV11H_SRCH_FLG ;
   private String AV41D_STUDY_NM ;
   private String AV9H_INIT_FLG ;
   private String AV10H_KNGN_FLG ;
   private String AV50D_ORIGINAL_NAME ;
   private String AV55H_FILE_PATH_NAME ;
   private String AV30C_GAMEN_TITLE ;
   private String AV25W_MSG ;
   private String AV20W_ERRCD ;
   private String AV56W_LOG_MSG ;
   private String AV54W_FILE_EXT ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.webpanels.WebSession AV27W_SESSION ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private ICheckbox chkavD_base_flg ;
   private ICheckbox chkavD_site_flg ;
   private ICheckbox chkavD_staff_flg ;
   private ICheckbox chkavD_list_chk ;
   private ICheckbox chkavD_subject_chk ;
   private ICheckbox chkavD_grd_all_chk ;
   private ICheckbox chkavCtlcheck ;
   private ICheckbox chkavH_base_enabled ;
   private ICheckbox chkavH_list_enabled ;
   private ICheckbox chkavH_site_enabled ;
   private ICheckbox chkavH_staff_enabled ;
   private ICheckbox chkavH_subject_enabled ;
   private IDataStoreProvider pr_default ;
   private GxObjectCollection AV5B407_SD01_IMPORT_LIST_C ;
   private GxObjectCollection AV34W_ERRMSG_COL ;
   private GxObjectCollection GXv_objcol_svchar3[] ;
   private GxObjectCollection GXv_objcol_svchar12[] ;
   private SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem AV6B407_SD01_IMPORT_LIST_I ;
   private SdtA_PAGING_SDT AV8H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT14[] ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT13[] ;
}

final  class b407_wp01_design_import__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

