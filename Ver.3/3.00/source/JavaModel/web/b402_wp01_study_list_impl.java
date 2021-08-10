/*
               File: b402_wp01_study_list_impl
        Description: �����o�^�i�ꗗ�j
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:23:18.53
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp01_study_list_impl extends GXWebPanel
{
   public b402_wp01_study_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp01_study_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp01_study_list_impl.class ));
   }

   public b402_wp01_study_list_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavD_status = new HTMLChoice();
      radavD_del_flg = new HTMLChoice();
      cmbavCtltbm21_status = new HTMLChoice();
      cmbavCtltbm21_del_flg = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_162 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_162_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_162_idx = httpContext.GetNextPar( ) ;
            AV27D_SPACE = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_GXsfl_162, nGXsfl_162_idx, sGXsfl_162_idx, AV27D_SPACE) ;
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
         pa0X2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws0X2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we0X2( ) ;
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
      httpContext.writeValue( "�����o�^�i�ꗗ�j") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513231864");
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
      GXEncryptionTmp = "b402_wp01_study_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_MOVE_KBN,1,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp01_study_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0X2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "B402_sd08_study_list_c", AV30B402_SD08_STUDY_LIST_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("B402_sd08_study_list_c", AV30B402_SD08_STUDY_LIST_C);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_162", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_162, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV5C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_APP_ID", GetHash( "", String.valueOf(AV5C_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV17P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_A_LOGIN_SDT", AV18W_A_LOGIN_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_A_LOGIN_SDT", AV18W_A_LOGIN_SDT);
      }
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV24W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STATUS", GXutil.rtrim( A607TBM21_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_DEL_FLG", GXutil.rtrim( A369TBM21_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
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
      return "B402_WP01_STUDY_LIST" ;
   }

   public String getPgmdesc( )
   {
      return "�����o�^�i�ꗗ�j" ;
   }

   public void wb0X0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0X2( true) ;
      }
      else
      {
         wb_table1_2_0X2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_181_0X2( true) ;
      }
      else
      {
         wb_table2_181_0X2( false) ;
      }
      return  ;
   }

   public void wb_table2_181_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0X2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "�����o�^�i�ꗗ�j", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0179") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0179", "");
         }
      }
      wbErr = false ;
      strup0X0( ) ;
   }

   public void ws0X2( )
   {
      start0X2( ) ;
      evt0X2( ) ;
   }

   public void evt0X2( )
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
                        /* Execute user event: e110X2 */
                        e110X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120X2 */
                        e120X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130X2 */
                        e130X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140X2 */
                        e140X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150X2 */
                        e150X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e160X2 */
                        e160X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e170X2 */
                        e170X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e180X2 */
                        e180X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e190X2 */
                        e190X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e200X2 */
                        e200X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e210X2 */
                        e210X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e220X2 */
                        e220X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e230X2 */
                        e230X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e240X2 */
                        e240X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e250X2 */
                        e250X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e260X2 */
                        e260X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e270X2 */
                        e270X2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) )
                     {
                        nGXsfl_162_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_162_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_162_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1622( ) ;
                        AV34GXV1 = (short)(nGXsfl_162_idx+GRID2_nFirstRecordOnPage) ;
                        if ( ( AV30B402_SD08_STUDY_LIST_C.size() >= AV34GXV1 ) && ( AV34GXV1 > 0 ) )
                        {
                           AV30B402_SD08_STUDY_LIST_C.currentItem( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)) );
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM21_STUDY_ID");
                              GX_FocusControl = edtavCtltbm21_study_id_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id( 0 );
                           }
                           else
                           {
                              ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") );
                           }
                           AV27D_SPACE = httpContext.cgiGet( edtavD_space_Internalname) ;
                           ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm( httpContext.cgiGet( edtavCtltbm21_study_nm_Internalname) );
                           cmbavCtltbm21_status.setName( cmbavCtltbm21_status.getInternalname() );
                           cmbavCtltbm21_status.setValue( httpContext.cgiGet( cmbavCtltbm21_status.getInternalname()) );
                           ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status( httpContext.cgiGet( cmbavCtltbm21_status.getInternalname()) );
                           cmbavCtltbm21_del_flg.setName( cmbavCtltbm21_del_flg.getInternalname() );
                           cmbavCtltbm21_del_flg.setValue( httpContext.cgiGet( cmbavCtltbm21_del_flg.getInternalname()) );
                           ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg( httpContext.cgiGet( cmbavCtltbm21_del_flg.getInternalname()) );
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0179") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0179", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0179") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0179", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e280X2 */
                              e280X2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e290X2 */
                              e290X2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e300X2 */
                              e300X2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e310X2 */
                              e310X2 ();
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
                  else if ( nCmpId == 179 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0179") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0179", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0X2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0X2( ) ;
         }
      }
   }

   public void pa0X2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp01_study_list")), "b402_wp01_study_list") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp01_study_list"))) ;
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
               }
            }
         }
         radavD_status.setName( "vD_STATUS" );
         radavD_status.setWebtags( "" );
         radavD_del_flg.setName( "vD_DEL_FLG" );
         radavD_del_flg.setWebtags( "" );
         GXCCtl = "CTLTBM21_STATUS_" + sGXsfl_162_idx ;
         cmbavCtltbm21_status.setName( GXCCtl );
         cmbavCtltbm21_status.setWebtags( "" );
         if ( cmbavCtltbm21_status.getItemCount() > 0 )
         {
            if ( ( AV34GXV1 > 0 ) && ( AV30B402_SD08_STUDY_LIST_C.size() >= AV34GXV1 ) && (GXutil.strcmp("", ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status())==0) )
            {
               ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status( cmbavCtltbm21_status.getValidValue(((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status()) );
            }
         }
         GXCCtl = "CTLTBM21_DEL_FLG_" + sGXsfl_162_idx ;
         cmbavCtltbm21_del_flg.setName( GXCCtl );
         cmbavCtltbm21_del_flg.setWebtags( "" );
         if ( cmbavCtltbm21_del_flg.getItemCount() > 0 )
         {
            if ( ( AV34GXV1 > 0 ) && ( AV30B402_SD08_STUDY_LIST_C.size() >= AV34GXV1 ) && (GXutil.strcmp("", ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg())==0) )
            {
               ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg( cmbavCtltbm21_del_flg.getValidValue(((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg()) );
            }
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid2_newrow( short nRC_GXsfl_162 ,
                                 short nGXsfl_162_idx ,
                                 String sGXsfl_162_idx ,
                                 String AV27D_SPACE )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1622( ) ;
      while ( nGXsfl_162_idx <= nRC_GXsfl_162 )
      {
         sendrow_1622( ) ;
         nGXsfl_162_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_162_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_162_idx+1)) ;
         sGXsfl_162_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_162_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1622( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void refresh( )
   {
      rf0X2( ) ;
      /* End function Refresh */
   }

   public void rf0X2( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid2Container.AddObjectProperty("Class", "FreeStyleGridBase");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(162) ;
      nGXsfl_162_idx = (short)(1) ;
      sGXsfl_162_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_162_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1622( ) ;
      nGXsfl_162_Refreshing = (short)(1) ;
      /* Execute user event: e290X2 */
      e290X2 ();
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
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
         subsflControlProps_1622( ) ;
         /* Execute user event: e310X2 */
         e310X2 ();
         wbEnd = (short)(162) ;
         wb0X0( ) ;
      }
      nGXsfl_162_Refreshing = (short)(0) ;
   }

   public int subgrid2_pagecount( )
   {
      GRID2_nRecordCount = subgrid2_recordcount( ) ;
      if ( ((int)((GRID2_nRecordCount) % (subgrid2_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID2_nRecordCount/ (double) (subgrid2_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID2_nRecordCount/ (double) (subgrid2_recordsperpage( )))+1) ;
   }

   public int subgrid2_recordcount( )
   {
      return AV30B402_SD08_STUDY_LIST_C.size() ;
   }

   public int subgrid2_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid2_currentpage( )
   {
      return (int)(GXutil.Int( GRID2_nFirstRecordOnPage/ (double) (subgrid2_recordsperpage( )))+1) ;
   }

   public short subgrid2_firstpage( )
   {
      GRID2_nFirstRecordOnPage = 0 ;
      return (short)(0) ;
   }

   public short subgrid2_nextpage( )
   {
      GRID2_nRecordCount = subgrid2_recordcount( ) ;
      if ( ( GRID2_nRecordCount >= subgrid2_recordsperpage( ) ) && ( GRID2_nEOF == 0 ) )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage+subgrid2_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(((GRID2_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid2_previouspage( )
   {
      if ( GRID2_nFirstRecordOnPage >= subgrid2_recordsperpage( ) )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage-subgrid2_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      return (short)(0) ;
   }

   public short subgrid2_lastpage( )
   {
      GRID2_nRecordCount = subgrid2_recordcount( ) ;
      if ( GRID2_nRecordCount > subgrid2_recordsperpage( ) )
      {
         if ( ((int)((GRID2_nRecordCount) % (subgrid2_recordsperpage( )))) == 0 )
         {
            GRID2_nFirstRecordOnPage = (long)(GRID2_nRecordCount-subgrid2_recordsperpage( )) ;
         }
         else
         {
            GRID2_nFirstRecordOnPage = (long)(GRID2_nRecordCount-((int)((GRID2_nRecordCount) % (subgrid2_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      return (short)(0) ;
   }

   public int subgrid2_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID2_nFirstRecordOnPage = (long)(subgrid2_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      return 0 ;
   }

   public void strup0X0( )
   {
      /* Before Start, stand alone formulas. */
      AV41Pgmname = "B402_WP01_STUDY_LIST" ;
      AV40Pgmdesc = "�����o�^�i�ꗗ�j" ;
      Gx_err = (short)(0) ;
      edtavCtltbm21_study_id_Enabled = 0 ;
      edtavD_space_Enabled = 0 ;
      edtavCtltbm21_study_nm_Enabled = 0 ;
      cmbavCtltbm21_status.setEnabled( 0 );
      cmbavCtltbm21_del_flg.setEnabled( 0 );
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e280X2 */
      e280X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "B402_sd08_study_list_c"), AV30B402_SD08_STUDY_LIST_C);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV10H_A_PAGING_SDT);
         /* Read variables values. */
         AV9D_STUDY_NM = httpContext.cgiGet( edtavD_study_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_STUDY_NM", AV9D_STUDY_NM);
         AV8D_STATUS = httpContext.cgiGet( radavD_status.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_STATUS", AV8D_STATUS);
         AV7D_DEL_FLG = httpContext.cgiGet( radavD_del_flg.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DEL_FLG", AV7D_DEL_FLG);
         AV12H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         AV14H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_SRCH_FLG", AV14H_SRCH_FLG);
         AV13H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         AV11H_DEL_FLG = httpContext.cgiGet( edtavH_del_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_DEL_FLG", AV11H_DEL_FLG);
         AV16H_STUDY_NM = httpContext.cgiGet( edtavH_study_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16H_STUDY_NM", AV16H_STUDY_NM);
         AV15H_STATUS = httpContext.cgiGet( edtavH_status_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15H_STATUS", AV15H_STATUS);
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
         nRC_GXsfl_162 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_162"), ".", ",")) ;
         AV17P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID2_nFirstRecordOnPage"), ".", ",") ;
         GRID2_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID2_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0179") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0179", "");
         }
         subGrid2_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID2_Rows"), ".", ",")) ;
         nRC_GXsfl_162 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_162"), ".", ",")) ;
         nGXsfl_162_fel_idx = (short)(0) ;
         while ( nGXsfl_162_fel_idx < nRC_GXsfl_162 )
         {
            nGXsfl_162_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_162_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_162_fel_idx+1)) ;
            sGXsfl_162_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_162_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1622( ) ;
            AV34GXV1 = (short)(nGXsfl_162_fel_idx+GRID2_nFirstRecordOnPage) ;
            AV34GXV1 = (short)(nGXsfl_162_fel_idx+GRID2_nFirstRecordOnPage) ;
            if ( ( AV30B402_SD08_STUDY_LIST_C.size() >= AV34GXV1 ) && ( AV34GXV1 > 0 ) )
            {
               AV30B402_SD08_STUDY_LIST_C.currentItem( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") > 9999999999L ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM21_STUDY_ID");
                  GX_FocusControl = edtavCtltbm21_study_id_Internalname ;
                  wbErr = true ;
                  ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id( 0 );
               }
               else
               {
                  ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id( localUtil.ctol( httpContext.cgiGet( edtavCtltbm21_study_id_Internalname), ".", ",") );
               }
               AV27D_SPACE = httpContext.cgiGet( edtavD_space_Internalname) ;
               ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm( httpContext.cgiGet( edtavCtltbm21_study_nm_Internalname) );
               cmbavCtltbm21_status.setName( cmbavCtltbm21_status.getInternalname() );
               cmbavCtltbm21_status.setValue( httpContext.cgiGet( cmbavCtltbm21_status.getInternalname()) );
               ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status( httpContext.cgiGet( cmbavCtltbm21_status.getInternalname()) );
               cmbavCtltbm21_del_flg.setName( cmbavCtltbm21_del_flg.getInternalname() );
               cmbavCtltbm21_del_flg.setValue( httpContext.cgiGet( cmbavCtltbm21_del_flg.getInternalname()) );
               ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg( httpContext.cgiGet( cmbavCtltbm21_del_flg.getInternalname()) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0179") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0179", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0179") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0179", "");
            }
            AV30B402_SD08_STUDY_LIST_C.currentItem( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)) );
         }
         if ( nGXsfl_162_fel_idx == 0 )
         {
            nGXsfl_162_idx = (short)(1) ;
            sGXsfl_162_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_162_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1622( ) ;
         }
         nGXsfl_162_fel_idx = (short)(1) ;
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
      /* Execute user event: e280X2 */
      e280X2 ();
      if (returnInSub) return;
   }

   public void e280X2( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      AV6C_GAMEN_TITLE = AV40Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_GAMEN_TITLE", AV6C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV12H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      AV27D_SPACE = "�@" ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV18W_A_LOGIN_SDT,AV5C_APP_ID,AV6C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0179",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e290X2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV12H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV41Pgmname, "INFO", "��ʋN��") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV12H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
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
   }

   public void e110X2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV13H_KNGN_FLG, "") )
      {
         AV26W_SESSION.setValue(AV41Pgmname+"_PAGE", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp02_study_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) ;
         httpContext.wjLoc = formatLink("b402_wp02_study_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e120X2( )
   {
      /* 'BTN_SRCH' Routine */
      AV14H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_SRCH_FLG", AV14H_SRCH_FLG);
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
   }

   public void S212( )
   {
      /* 'SUB_SRCH' Routine */
      GXv_SdtA_USER_STUDY_SDT1[0] = AV18W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_User_study_sdt();
      new b799_pc13_get_user_study(remoteHandle, context).execute( AV18W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_SdtA_USER_STUDY_SDT1) ;
      AV18W_A_LOGIN_SDT.setgxTv_SdtA_LOGIN_SDT_User_study_sdt( GXv_SdtA_USER_STUDY_SDT1[0] );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18W_A_LOGIN_SDT", AV18W_A_LOGIN_SDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18W_A_LOGIN_SDT", AV18W_A_LOGIN_SDT);
      AV26W_SESSION.setValue("Com_Login_Info", AV18W_A_LOGIN_SDT.toxml(false, true, "A_LOGIN_SDT", "tablet-EDC_GXXEV3U3"));
      AV30B402_SD08_STUDY_LIST_C.clear();
      gx_BV162 = true ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           new Long(A63TBM21_STUDY_ID) ,
                                           AV18W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn() ,
                                           AV18W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg() ,
                                           AV16H_STUDY_NM ,
                                           AV15H_STATUS ,
                                           AV11H_DEL_FLG ,
                                           AV18W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_User_study_sdt().getgxTv_SdtA_USER_STUDY_SDT_Study_id() ,
                                           A367TBM21_STUDY_NM ,
                                           A607TBM21_STATUS ,
                                           A369TBM21_DEL_FLG },
                                           new int[] {
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV16H_STUDY_NM = GXutil.padr( GXutil.rtrim( AV16H_STUDY_NM), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_STUDY_NM", AV16H_STUDY_NM);
      /* Using cursor H000X2 */
      pr_default.execute(0, new Object[] {lV16H_STUDY_NM, AV15H_STATUS, AV11H_DEL_FLG});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A369TBM21_DEL_FLG = H000X2_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = H000X2_n369TBM21_DEL_FLG[0] ;
         A607TBM21_STATUS = H000X2_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = H000X2_n607TBM21_STATUS[0] ;
         A367TBM21_STUDY_NM = H000X2_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H000X2_n367TBM21_STUDY_NM[0] ;
         A63TBM21_STUDY_ID = H000X2_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         AV31B402_SD08_STUDY_LIST_I = (SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)new SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem(remoteHandle, context);
         AV31B402_SD08_STUDY_LIST_I.setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id( A63TBM21_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31B402_SD08_STUDY_LIST_I", AV31B402_SD08_STUDY_LIST_I);
         AV31B402_SD08_STUDY_LIST_I.setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm( A367TBM21_STUDY_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31B402_SD08_STUDY_LIST_I", AV31B402_SD08_STUDY_LIST_I);
         AV31B402_SD08_STUDY_LIST_I.setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status( A607TBM21_STATUS );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31B402_SD08_STUDY_LIST_I", AV31B402_SD08_STUDY_LIST_I);
         AV31B402_SD08_STUDY_LIST_I.setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg( A369TBM21_DEL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31B402_SD08_STUDY_LIST_I", AV31B402_SD08_STUDY_LIST_I);
         AV30B402_SD08_STUDY_LIST_C.add(AV31B402_SD08_STUDY_LIST_I, 0);
         gx_BV162 = true ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void e130X2( )
   {
      /* 'BTN_CLER' Routine */
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
   }

   public void e300X2( )
   {
      /* 'BTN_SEL' Routine */
      AV26W_SESSION.setValue(AV41Pgmname+"_PAGE", GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp02_study_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)(AV30B402_SD08_STUDY_LIST_C.currentItem())).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id(),10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp02_study_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV17P_MOVE_KBN == 1 )
      {
         /* Execute user subroutine: S232 */
         S232 ();
         if (returnInSub) return;
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV26W_SESSION.getValue(AV41Pgmname+"_PAGE"))) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
      }
   }

   public void S152( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
      cmbavCtltbm21_status.removeAllItems();
      cmbavCtltbm21_status.addItem("", "", (short)(0));
      AV44GXV8 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44GXV8", GXutil.ltrim( GXutil.str( AV44GXV8, 8, 0)));
      AV43GXV7 = gxdomainct_status.getValues() ;
      while ( AV44GXV8 <= AV43GXV7.size() )
      {
         AV28W_STATUS = (String)AV43GXV7.elementAt(-1+AV44GXV8) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_STATUS", AV28W_STATUS);
         cmbavCtltbm21_status.addItem(AV28W_STATUS, gxdomainct_status.getDescription(httpContext,(String)AV28W_STATUS), (short)(0));
         AV44GXV8 = (int)(AV44GXV8+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44GXV8", GXutil.ltrim( GXutil.str( AV44GXV8, 8, 0)));
      }
      cmbavCtltbm21_del_flg.removeAllItems();
      cmbavCtltbm21_del_flg.addItem("", "", (short)(0));
      AV46GXV10 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GXV10", GXutil.ltrim( GXutil.str( AV46GXV10, 8, 0)));
      AV45GXV9 = gxdomainct_del_flg.getValues() ;
      while ( AV46GXV10 <= AV45GXV9.size() )
      {
         AV22W_DEL_FLG = (String)AV45GXV9.elementAt(-1+AV46GXV10) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22W_DEL_FLG", AV22W_DEL_FLG);
         cmbavCtltbm21_del_flg.addItem(AV22W_DEL_FLG, gxdomainct_del_flg.getDescription(httpContext,(String)AV22W_DEL_FLG), (short)(0));
         AV46GXV10 = (int)(AV46GXV10+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46GXV10", GXutil.ltrim( GXutil.str( AV46GXV10, 8, 0)));
      }
      radavD_status.removeAllItems();
      radavD_status.addItem("", "�S��", (short)(0));
      radavD_status.addItem("0", gxdomainct_status.getDescription(httpContext,(String)"0"), (short)(0));
      radavD_status.addItem("1", gxdomainct_status.getDescription(httpContext,(String)"1"), (short)(0));
      radavD_status.addItem("2", gxdomainct_status.getDescription(httpContext,(String)"2"), (short)(0));
      radavD_status.addItem("9", gxdomainct_status.getDescription(httpContext,(String)"9"), (short)(0));
      radavD_del_flg.removeAllItems();
      radavD_del_flg.addItem("", "�S��", (short)(0));
      radavD_del_flg.addItem("0", gxdomainct_del_flg.getDescription(httpContext,(String)"0"), (short)(0));
      radavD_del_flg.addItem("1", gxdomainct_del_flg.getDescription(httpContext,(String)"1"), (short)(0));
   }

   public void S192( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV26W_SESSION.setValue(AV41Pgmname+"_STUDY_NM", AV9D_STUDY_NM);
      AV26W_SESSION.setValue(AV41Pgmname+"_STATUS", AV8D_STATUS);
      AV26W_SESSION.setValue(AV41Pgmname+"_DEL_FLG", AV7D_DEL_FLG);
      AV26W_SESSION.setValue(AV41Pgmname+"_SRCH_FLG", AV14H_SRCH_FLG);
   }

   public void S232( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV9D_STUDY_NM = AV26W_SESSION.getValue(AV41Pgmname+"_STUDY_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_STUDY_NM", AV9D_STUDY_NM);
      AV8D_STATUS = AV26W_SESSION.getValue(AV41Pgmname+"_STATUS") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_STATUS", AV8D_STATUS);
      AV7D_DEL_FLG = AV26W_SESSION.getValue(AV41Pgmname+"_DEL_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DEL_FLG", AV7D_DEL_FLG);
      AV14H_SRCH_FLG = AV26W_SESSION.getValue(AV41Pgmname+"_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_SRCH_FLG", AV14H_SRCH_FLG);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV26W_SESSION.remove(AV41Pgmname+"_STUDY_NM");
      AV26W_SESSION.remove(AV41Pgmname+"_STATUS");
      AV26W_SESSION.remove(AV41Pgmname+"_DEL_FLG");
      AV26W_SESSION.remove(AV41Pgmname+"_SRCH_FLG");
   }

   public void S202( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV16H_STUDY_NM = AV9D_STUDY_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_STUDY_NM", AV16H_STUDY_NM);
      AV15H_STATUS = AV8D_STATUS ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_STATUS", AV15H_STATUS);
      AV11H_DEL_FLG = AV7D_DEL_FLG ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_DEL_FLG", AV11H_DEL_FLG);
   }

   public void S162( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      GXt_boolean2 = false ;
      GXv_boolean3[0] = GXt_boolean2 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV13H_KNGN_FLG, "", GXv_boolean3) ;
      b402_wp01_study_list_impl.this.GXt_boolean2 = GXv_boolean3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean2 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      if ( ( GXutil.strcmp(AV18W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(), new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "008")) == 0 ) && ( GXutil.strcmp(AV18W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg(), "1") != 0 ) )
      {
         lblTxt_btn_reg_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV18W_A_LOGIN_SDT;
      GXv_char5[0] = AV23W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char5) ;
      AV18W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_wp01_study_list_impl.this.AV23W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRCD", AV23W_ERRCD);
      if ( GXutil.strcmp(AV23W_ERRCD, "0") != 0 )
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
      AV9D_STUDY_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_STUDY_NM", AV9D_STUDY_NM);
      AV8D_STATUS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_STATUS", AV8D_STATUS);
      AV7D_DEL_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DEL_FLG", AV7D_DEL_FLG);
      AV16H_STUDY_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16H_STUDY_NM", AV16H_STUDY_NM);
      AV15H_STATUS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_STATUS", AV15H_STATUS);
      AV11H_DEL_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_DEL_FLG", AV11H_DEL_FLG);
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV14H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14H_SRCH_FLG", AV14H_SRCH_FLG);
      AV30B402_SD08_STUDY_LIST_C.clear();
      gx_BV162 = true ;
      AV19W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19W_A819_JS", AV19W_A819_JS);
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
      GXv_char5[0] = AV13H_KNGN_FLG ;
      GXv_char6[0] = AV23W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV5C_APP_ID, GXv_char5, GXv_char6) ;
      b402_wp01_study_list_impl.this.AV13H_KNGN_FLG = GXv_char5[0] ;
      b402_wp01_study_list_impl.this.AV23W_ERRCD = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRCD", AV23W_ERRCD);
      if ( GXutil.strcmp(AV23W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV41Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp01_study_list");
   }

   public void e140X2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e150X2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid2_pagecount( ) < 1 )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      else
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid2_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e160X2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e170X2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e180X2( )
   {
      /* 'PAGE01' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e190X2( )
   {
      /* 'PAGE02' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e200X2( )
   {
      /* 'PAGE03' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e210X2( )
   {
      /* 'PAGE04' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e220X2( )
   {
      /* 'PAGE05' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e230X2( )
   {
      /* 'PAGE06' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e240X2( )
   {
      /* 'PAGE07' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e250X2( )
   {
      /* 'PAGE08' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e260X2( )
   {
      /* 'PAGE09' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e270X2( )
   {
      /* 'PAGE10' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid2_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid2_recordcount( ) );
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
      subgrid2_gotopage( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid2_recordcount( ) <= 0 )
      {
         tblTbl_list_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV14H_SRCH_FLG, "1") == 0 ) && ! AV24W_ERRFLG )
         {
            GXt_char8 = AV25W_MSG ;
            GXv_char6[0] = GXt_char8 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char6) ;
            b402_wp01_study_list_impl.this.GXt_char8 = GXv_char6[0] ;
            AV25W_MSG = GXt_char8 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25W_MSG", AV25W_MSG);
            httpContext.GX_msglist.addItem(AV25W_MSG);
         }
      }
      else
      {
         tblTbl_list_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(�S"+GXutil.trim( GXutil.str( subgrid2_recordcount( ), 10, 0))+"��)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   private void e310X2( )
   {
      /* Grid2_Load Routine */
      AV34GXV1 = (short)(1) ;
      while ( AV34GXV1 <= AV30B402_SD08_STUDY_LIST_C.size() )
      {
         AV30B402_SD08_STUDY_LIST_C.currentItem( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30B402_SD08_STUDY_LIST_C", AV30B402_SD08_STUDY_LIST_C);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(162) ;
         }
         if ( ( subGrid2_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
         {
            sendrow_1622( ) ;
            GRID2_nEOF = (byte)(0) ;
            if ( GRID2_nCurrentRecord + 1 >= subgrid2_recordcount( ) )
            {
               GRID2_nEOF = (byte)(1) ;
            }
         }
         GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
         AV34GXV1 = (short)(AV34GXV1+1) ;
      }
   }

   public void wb_table2_181_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV14H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV14H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV13H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV13H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(187);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_del_flg_Internalname, GXutil.rtrim( AV11H_DEL_FLG), GXutil.rtrim( localUtil.format( AV11H_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(188);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_del_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_study_nm_Internalname, GXutil.rtrim( AV16H_STUDY_NM), GXutil.rtrim( localUtil.format( AV16H_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_study_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_status_Internalname, GXutil.rtrim( AV15H_STATUS), GXutil.rtrim( localUtil.format( AV15H_STATUS, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_status_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP01_STUDY_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_181_0X2e( true) ;
      }
      else
      {
         wb_table2_181_0X2e( false) ;
      }
   }

   public void wb_table1_2_0X2( boolean wbgen )
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
         wb_table3_6_0X2( true) ;
      }
      else
      {
         wb_table3_6_0X2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_0X2e( boolean wbgen )
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
         wb_table1_2_0X2e( true) ;
      }
      else
      {
         wb_table1_2_0X2e( false) ;
      }
   }

   public void wb_table3_6_0X2( boolean wbgen )
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
         wb_table4_12_0X2( true) ;
      }
      else
      {
         wb_table4_12_0X2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table5_18_0X2( true) ;
      }
      else
      {
         wb_table5_18_0X2( false) ;
      }
      return  ;
   }

   public void wb_table5_18_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0179"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0179"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0179"+"");
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
         wb_table3_6_0X2e( true) ;
      }
      else
      {
         wb_table3_6_0X2e( false) ;
      }
   }

   public void wb_table5_18_0X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_21_0X2( true) ;
      }
      else
      {
         wb_table6_21_0X2( false) ;
      }
      return  ;
   }

   public void wb_table6_21_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_18_0X2e( true) ;
      }
      else
      {
         wb_table5_18_0X2e( false) ;
      }
   }

   public void wb_table6_21_0X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_24_0X2( true) ;
      }
      else
      {
         wb_table7_24_0X2( false) ;
      }
      return  ;
   }

   public void wb_table7_24_0X2e( boolean wbgen )
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
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         wb_table8_52_0X2( true) ;
      }
      else
      {
         wb_table8_52_0X2( false) ;
      }
      return  ;
   }

   public void wb_table8_52_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_21_0X2e( true) ;
      }
      else
      {
         wb_table6_21_0X2e( false) ;
      }
   }

   public void wb_table8_52_0X2( boolean wbgen )
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
         wb_table9_55_0X2( true) ;
      }
      else
      {
         wb_table9_55_0X2( false) ;
      }
      return  ;
   }

   public void wb_table9_55_0X2e( boolean wbgen )
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
         wb_table10_151_0X2( true) ;
      }
      else
      {
         wb_table10_151_0X2( false) ;
      }
      return  ;
   }

   public void wb_table10_151_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /*  Grid Control  */
         Grid2Container.SetIsFreestyle(true);
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"162\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "FreeStyleGridBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
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
            Grid2Column.AddObjectProperty("Value", lblBtn_sel2_Caption);
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm21_study_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Value", GXutil.rtrim( AV27D_SPACE));
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_space_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm21_study_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavCtltbm21_status.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavCtltbm21_del_flg.getEnabled(), (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 162 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_162 = (short)(nGXsfl_162_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV34GXV1 = nGXsfl_162_idx ;
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_52_0X2e( true) ;
      }
      else
      {
         wb_table8_52_0X2e( false) ;
      }
   }

   public void wb_table10_151_0X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 935, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "����", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "���", "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "�폜", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_151_0X2e( true) ;
      }
      else
      {
         wb_table10_151_0X2e( false) ;
      }
   }

   public void wb_table9_55_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_61_0X2( true) ;
      }
      else
      {
         wb_table11_61_0X2( false) ;
      }
      return  ;
   }

   public void wb_table11_61_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_55_0X2e( true) ;
      }
      else
      {
         wb_table9_55_0X2e( false) ;
      }
   }

   public void wb_table11_61_0X2( boolean wbgen )
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
         wb_table12_64_0X2( true) ;
      }
      else
      {
         wb_table12_64_0X2( false) ;
      }
      return  ;
   }

   public void wb_table12_64_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_70_0X2( true) ;
      }
      else
      {
         wb_table13_70_0X2( false) ;
      }
      return  ;
   }

   public void wb_table13_70_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_76_0X2( true) ;
      }
      else
      {
         wb_table14_76_0X2( false) ;
      }
      return  ;
   }

   public void wb_table14_76_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_82_0X2( true) ;
      }
      else
      {
         wb_table15_82_0X2( false) ;
      }
      return  ;
   }

   public void wb_table15_82_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_88_0X2( true) ;
      }
      else
      {
         wb_table16_88_0X2( false) ;
      }
      return  ;
   }

   public void wb_table16_88_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_94_0X2( true) ;
      }
      else
      {
         wb_table17_94_0X2( false) ;
      }
      return  ;
   }

   public void wb_table17_94_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_100_0X2( true) ;
      }
      else
      {
         wb_table18_100_0X2( false) ;
      }
      return  ;
   }

   public void wb_table18_100_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_106_0X2( true) ;
      }
      else
      {
         wb_table19_106_0X2( false) ;
      }
      return  ;
   }

   public void wb_table19_106_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_112_0X2( true) ;
      }
      else
      {
         wb_table20_112_0X2( false) ;
      }
      return  ;
   }

   public void wb_table20_112_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_118_0X2( true) ;
      }
      else
      {
         wb_table21_118_0X2( false) ;
      }
      return  ;
   }

   public void wb_table21_118_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_124_0X2( true) ;
      }
      else
      {
         wb_table22_124_0X2( false) ;
      }
      return  ;
   }

   public void wb_table22_124_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_130_0X2( true) ;
      }
      else
      {
         wb_table23_130_0X2( false) ;
      }
      return  ;
   }

   public void wb_table23_130_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_136_0X2( true) ;
      }
      else
      {
         wb_table24_136_0X2( false) ;
      }
      return  ;
   }

   public void wb_table24_136_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_142_0X2( true) ;
      }
      else
      {
         wb_table25_142_0X2( false) ;
      }
      return  ;
   }

   public void wb_table25_142_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_61_0X2e( true) ;
      }
      else
      {
         wb_table11_61_0X2e( false) ;
      }
   }

   public void wb_table25_142_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "�Ō��", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_142_0X2e( true) ;
      }
      else
      {
         wb_table25_142_0X2e( false) ;
      }
   }

   public void wb_table24_136_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "����", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_136_0X2e( true) ;
      }
      else
      {
         wb_table24_136_0X2e( false) ;
      }
   }

   public void wb_table23_130_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_130_0X2e( true) ;
      }
      else
      {
         wb_table23_130_0X2e( false) ;
      }
   }

   public void wb_table22_124_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_124_0X2e( true) ;
      }
      else
      {
         wb_table22_124_0X2e( false) ;
      }
   }

   public void wb_table21_118_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_118_0X2e( true) ;
      }
      else
      {
         wb_table21_118_0X2e( false) ;
      }
   }

   public void wb_table20_112_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_112_0X2e( true) ;
      }
      else
      {
         wb_table20_112_0X2e( false) ;
      }
   }

   public void wb_table19_106_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_106_0X2e( true) ;
      }
      else
      {
         wb_table19_106_0X2e( false) ;
      }
   }

   public void wb_table18_100_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_100_0X2e( true) ;
      }
      else
      {
         wb_table18_100_0X2e( false) ;
      }
   }

   public void wb_table17_94_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_94_0X2e( true) ;
      }
      else
      {
         wb_table17_94_0X2e( false) ;
      }
   }

   public void wb_table16_88_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_88_0X2e( true) ;
      }
      else
      {
         wb_table16_88_0X2e( false) ;
      }
   }

   public void wb_table15_82_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_82_0X2e( true) ;
      }
      else
      {
         wb_table15_82_0X2e( false) ;
      }
   }

   public void wb_table14_76_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_76_0X2e( true) ;
      }
      else
      {
         wb_table14_76_0X2e( false) ;
      }
   }

   public void wb_table13_70_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "�O��", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_70_0X2e( true) ;
      }
      else
      {
         wb_table13_70_0X2e( false) ;
      }
   }

   public void wb_table12_64_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "�ŏ���", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_64_0X2e( true) ;
      }
      else
      {
         wb_table12_64_0X2e( false) ;
      }
   }

   public void wb_table7_24_0X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 935, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "������", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_study_nm_Internalname, GXutil.rtrim( AV9D_STUDY_NM), GXutil.rtrim( localUtil.format( AV9D_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_study_nm_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "���", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Radio button */
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_status, radavD_status.getInternalname(), GXutil.rtrim( AV8D_STATUS), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavD_status.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(33);\"", "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:60px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, "�폜", "", "", lblTextblock84_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:220px\">") ;
         /* Radio button */
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_162_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_del_flg, radavD_del_flg.getInternalname(), GXutil.rtrim( AV7D_DEL_FLG), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavD_del_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(37);\"", "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"6\" >") ;
         wb_table26_40_0X2( true) ;
      }
      else
      {
         wb_table26_40_0X2( false) ;
      }
      return  ;
   }

   public void wb_table26_40_0X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_24_0X2e( true) ;
      }
      else
      {
         wb_table7_24_0X2e( false) ;
      }
   }

   public void wb_table26_40_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "�����iF5�j", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "�N���A�iF6�j", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_40_0X2e( true) ;
      }
      else
      {
         wb_table26_40_0X2e( false) ;
      }
   }

   public void wb_table4_12_0X2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "�V�K�iF3�j", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP01_STUDY_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_0X2e( true) ;
      }
      else
      {
         wb_table4_12_0X2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV17P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_MOVE_KBN", GXutil.str( AV17P_MOVE_KBN, 1, 0));
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
      pa0X2( ) ;
      ws0X2( ) ;
      we0X2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513232351");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp01_study_list.js", "?202071513232351");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1622( )
   {
      lblBtn_sel2_Internalname = "BTN_SEL2_"+sGXsfl_162_idx ;
      edtavCtltbm21_study_id_Internalname = "CTLTBM21_STUDY_ID_"+sGXsfl_162_idx ;
      edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_162_idx ;
      edtavCtltbm21_study_nm_Internalname = "CTLTBM21_STUDY_NM_"+sGXsfl_162_idx ;
      cmbavCtltbm21_status.setInternalname( "CTLTBM21_STATUS_"+sGXsfl_162_idx );
      cmbavCtltbm21_del_flg.setInternalname( "CTLTBM21_DEL_FLG_"+sGXsfl_162_idx );
   }

   public void subsflControlProps_fel_1622( )
   {
      lblBtn_sel2_Internalname = "BTN_SEL2_"+sGXsfl_162_fel_idx ;
      edtavCtltbm21_study_id_Internalname = "CTLTBM21_STUDY_ID_"+sGXsfl_162_fel_idx ;
      edtavD_space_Internalname = "vD_SPACE_"+sGXsfl_162_fel_idx ;
      edtavCtltbm21_study_nm_Internalname = "CTLTBM21_STUDY_NM_"+sGXsfl_162_fel_idx ;
      cmbavCtltbm21_status.setInternalname( "CTLTBM21_STATUS_"+sGXsfl_162_fel_idx );
      cmbavCtltbm21_del_flg.setInternalname( "CTLTBM21_DEL_FLG_"+sGXsfl_162_fel_idx );
   }

   public void sendrow_1622( )
   {
      subsflControlProps_1622( ) ;
      wb0X0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_162_idx <= subgrid2_recordsperpage( ) * 1 ) )
      {
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
            if ( ((int)(((nGXsfl_162_idx-1)/ (double) (1)) % (2))) == 0 )
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
         if ( Grid2Container.GetWrapped() == 1 )
         {
            if ( ( 1 == 0 ) && ( nGXsfl_162_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_162_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_162_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_162_idx+"\">") ;
               }
            }
         }
         Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid2_Linesclass,""});
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid2Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grid_header3_Internalname+"_"+sGXsfl_162_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"",new Integer(935),"","px","px"});
         Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
         /* Text block */
         Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_sel2_Internalname,"�I��","","",lblBtn_sel2_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_SEL\\'."+sGXsfl_162_idx+"'","","TextBlockBtn040s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm21_study_id_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id(), (byte)(10), (byte)(0), ".", "")),((edtavCtltbm21_study_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id()), "ZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm21_study_id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm21_study_id_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(162),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Single line edit */
         TempTags = " " + ((edtavD_space_Enabled!=0)&&(edtavD_space_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 171,'',false,'"+sGXsfl_162_idx+"',162)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_space_Internalname,GXutil.rtrim( AV27D_SPACE),"",TempTags+((edtavD_space_Enabled!=0)&&(edtavD_space_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_space_Enabled!=0)&&(edtavD_space_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(171);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_space_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_space_Enabled),new Integer(0),"text","",new Integer(1),"chr",new Integer(1),"row",new Integer(1),new Integer(0),new Integer(0),new Integer(162),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm21_study_nm_Internalname,GXutil.rtrim( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm21_study_nm_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm21_study_nm_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(162),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         if ( ( nGXsfl_162_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CTLTBM21_STATUS_" + sGXsfl_162_idx ;
            cmbavCtltbm21_status.setName( GXCCtl );
            cmbavCtltbm21_status.setWebtags( "" );
            if ( cmbavCtltbm21_status.getItemCount() > 0 )
            {
               if ( ( AV34GXV1 > 0 ) && ( AV30B402_SD08_STUDY_LIST_C.size() >= AV34GXV1 ) && (GXutil.strcmp("", ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status())==0) )
               {
                  ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status( cmbavCtltbm21_status.getValidValue(((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status()) );
               }
            }
         }
         /* ComboBox */
         Grid2Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavCtltbm21_status,cmbavCtltbm21_status.getInternalname(),GXutil.rtrim( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status()),new Integer(1),cmbavCtltbm21_status.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(1),new Integer(cmbavCtltbm21_status.getEnabled()),new Integer(0),new Integer(0),new Integer(1),"chr",new Integer(0),"","","Attribute","","","",new Boolean(true)});
         cmbavCtltbm21_status.setValue( GXutil.rtrim( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm21_status.getInternalname(), "Values", cmbavCtltbm21_status.ToJavascriptSource());
         if ( Grid2Container.GetWrapped() == 1 )
         {
            Grid2Container.CloseTag("cell");
         }
         Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         if ( ( nGXsfl_162_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CTLTBM21_DEL_FLG_" + sGXsfl_162_idx ;
            cmbavCtltbm21_del_flg.setName( GXCCtl );
            cmbavCtltbm21_del_flg.setWebtags( "" );
            if ( cmbavCtltbm21_del_flg.getItemCount() > 0 )
            {
               if ( ( AV34GXV1 > 0 ) && ( AV30B402_SD08_STUDY_LIST_C.size() >= AV34GXV1 ) && (GXutil.strcmp("", ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg())==0) )
               {
                  ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg( cmbavCtltbm21_del_flg.getValidValue(((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg()) );
               }
            }
         }
         /* ComboBox */
         Grid2Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavCtltbm21_del_flg,cmbavCtltbm21_del_flg.getInternalname(),GXutil.rtrim( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg()),new Integer(1),cmbavCtltbm21_del_flg.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(1),new Integer(cmbavCtltbm21_del_flg.getEnabled()),new Integer(0),new Integer(0),new Integer(1),"chr",new Integer(0),"","","Attribute","","","",new Boolean(true)});
         cmbavCtltbm21_del_flg.setValue( GXutil.rtrim( ((SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)AV30B402_SD08_STUDY_LIST_C.elementAt(-1+AV34GXV1)).getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtltbm21_del_flg.getInternalname(), "Values", cmbavCtltbm21_del_flg.ToJavascriptSource());
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
         if ( Grid2Container.GetWrapped() == 1 )
         {
            if ( 1 > 0 )
            {
               if ( ((int)((nGXsfl_162_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid2Container.AddRow(Grid2Row);
         nGXsfl_162_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_162_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_162_idx+1)) ;
         sGXsfl_162_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_162_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1622( ) ;
      }
      /* End function sendrow_1622 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavD_study_nm_Internalname = "vD_STUDY_NM" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      radavD_status.setInternalname( "vD_STATUS" );
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      radavD_del_flg.setInternalname( "vD_DEL_FLG" );
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
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTbl_grid_header3_Internalname = "TBL_GRID_HEADER3" ;
      tblTbl_list_Internalname = "TBL_LIST" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_del_flg_Internalname = "vH_DEL_FLG" ;
      edtavH_study_nm_Internalname = "vH_STUDY_NM" ;
      edtavH_status_Internalname = "vH_STATUS" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid2_Internalname = "GRID2" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      cmbavCtltbm21_del_flg.setJsonclick( "" );
      cmbavCtltbm21_status.setJsonclick( "" );
      edtavCtltbm21_study_nm_Jsonclick = "" ;
      edtavD_space_Jsonclick = "" ;
      edtavD_space_Visible = 1 ;
      edtavCtltbm21_study_id_Jsonclick = "" ;
      subGrid2_Class = "FreeStyleGridBase" ;
      lblTxt_btn_reg_Visible = 1 ;
      radavD_del_flg.setJsonclick( "" );
      radavD_status.setJsonclick( "" );
      edtavD_study_nm_Jsonclick = "" ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      cmbavCtltbm21_del_flg.setEnabled( 0 );
      cmbavCtltbm21_status.setEnabled( 0 );
      edtavCtltbm21_study_nm_Enabled = 0 ;
      edtavD_space_Enabled = 1 ;
      edtavCtltbm21_study_id_Enabled = 0 ;
      lblBtn_sel2_Caption = "�I��" ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_status_Jsonclick = "" ;
      edtavH_study_nm_Jsonclick = "" ;
      edtavH_del_flg_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "(�S100��)" ;
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
      subGrid2_Borderwidth = (short)(0) ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      subGrid2_Rows = 10 ;
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
      AV27D_SPACE = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV30B402_SD08_STUDY_LIST_C = new GxObjectCollection(SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem.class, "B402_SD08_STUDY_LIST.B402_SD08_STUDY_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV10H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV41Pgmname = "" ;
      AV5C_APP_ID = "" ;
      AV18W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      A367TBM21_STUDY_NM = "" ;
      A607TBM21_STATUS = "" ;
      A369TBM21_DEL_FLG = "" ;
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
      edtavD_space_Internalname = "" ;
      edtavCtltbm21_study_nm_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      AV40Pgmdesc = "" ;
      AV9D_STUDY_NM = "" ;
      AV8D_STATUS = "" ;
      AV7D_DEL_FLG = "" ;
      AV12H_INIT_FLG = "" ;
      AV14H_SRCH_FLG = "" ;
      AV13H_KNGN_FLG = "" ;
      AV11H_DEL_FLG = "" ;
      AV16H_STUDY_NM = "" ;
      AV15H_STATUS = "" ;
      AV6C_GAMEN_TITLE = "" ;
      AV26W_SESSION = httpContext.getWebSession();
      GXv_SdtA_USER_STUDY_SDT1 = new SdtA_USER_STUDY_SDT [1] ;
      scmdbuf = "" ;
      lV16H_STUDY_NM = "" ;
      H000X2_A369TBM21_DEL_FLG = new String[] {""} ;
      H000X2_n369TBM21_DEL_FLG = new boolean[] {false} ;
      H000X2_A607TBM21_STATUS = new String[] {""} ;
      H000X2_n607TBM21_STATUS = new boolean[] {false} ;
      H000X2_A367TBM21_STUDY_NM = new String[] {""} ;
      H000X2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H000X2_A63TBM21_STUDY_ID = new long[1] ;
      AV31B402_SD08_STUDY_LIST_I = new SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem(remoteHandle, context);
      AV43GXV7 = new GxObjectCollection(String.class, "internal", "");
      AV28W_STATUS = "" ;
      AV45GXV9 = new GxObjectCollection(String.class, "internal", "");
      AV22W_DEL_FLG = "" ;
      GXv_boolean3 = new boolean [1] ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV23W_ERRCD = "" ;
      AV19W_A819_JS = "" ;
      GXv_char5 = new String [1] ;
      GXv_SdtA_PAGING_SDT7 = new SdtA_PAGING_SDT [1] ;
      AV25W_MSG = "" ;
      GXt_char8 = "" ;
      GXv_char6 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock13_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
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
      lblTextblock84_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblBtn_sel2_Internalname = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      lblBtn_sel2_Jsonclick = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp01_study_list__default(),
         new Object[] {
             new Object[] {
            H000X2_A369TBM21_DEL_FLG, H000X2_n369TBM21_DEL_FLG, H000X2_A607TBM21_STATUS, H000X2_n607TBM21_STATUS, H000X2_A367TBM21_STUDY_NM, H000X2_n367TBM21_STUDY_NM, H000X2_A63TBM21_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV41Pgmname = "B402_WP01_STUDY_LIST" ;
      AV40Pgmdesc = "�����o�^�i�ꗗ�j" ;
      /* GeneXus formulas. */
      AV41Pgmname = "B402_WP01_STUDY_LIST" ;
      AV40Pgmdesc = "�����o�^�i�ꗗ�j" ;
      Gx_err = (short)(0) ;
      edtavCtltbm21_study_id_Enabled = 0 ;
      edtavD_space_Enabled = 0 ;
      edtavCtltbm21_study_nm_Enabled = 0 ;
      cmbavCtltbm21_status.setEnabled( 0 );
      cmbavCtltbm21_del_flg.setEnabled( 0 );
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV17P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV17P_MOVE_KBN ;
   private byte GRID2_nEOF ;
   private byte nDonePA ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid2_Backstyle ;
   private short nRC_GXsfl_162 ;
   private short nGXsfl_162_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV34GXV1 ;
   private short nCmpId ;
   private short subGrid2_Borderwidth ;
   private short nGXsfl_162_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_162_fel_idx=1 ;
   private int subGrid2_Rows ;
   private int subGrid2_Islastpage ;
   private int edtavCtltbm21_study_id_Enabled ;
   private int edtavD_space_Enabled ;
   private int edtavCtltbm21_study_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV44GXV8 ;
   private int AV46GXV10 ;
   private int lblTxt_btn_reg_Visible ;
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
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int idxLst ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int edtavD_space_Visible ;
   private long GRID2_nFirstRecordOnPage ;
   private long A63TBM21_STUDY_ID ;
   private long GRID2_nRecordCount ;
   private long GRID2_nCurrentRecord ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_162_idx="0001" ;
   private String AV27D_SPACE ;
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
   private String edtavD_space_Internalname ;
   private String edtavCtltbm21_study_nm_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV40Pgmdesc ;
   private String edtavD_study_nm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_del_flg_Internalname ;
   private String edtavH_study_nm_Internalname ;
   private String edtavH_status_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String sGXsfl_162_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String lblTxt_btn_reg_Internalname ;
   private String GXv_char5[] ;
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
   private String GXt_char8 ;
   private String GXv_char6[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_del_flg_Jsonclick ;
   private String edtavH_study_nm_Jsonclick ;
   private String edtavH_status_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid2_Internalname ;
   private String lblBtn_sel2_Caption ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
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
   private String edtavD_study_nm_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblBtn_sel2_Internalname ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String tblTbl_grid_header3_Internalname ;
   private String lblBtn_sel2_Jsonclick ;
   private String ROClassString ;
   private String edtavCtltbm21_study_id_Jsonclick ;
   private String edtavD_space_Jsonclick ;
   private String edtavCtltbm21_study_nm_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV24W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean gx_BV162 ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean GXt_boolean2 ;
   private boolean GXv_boolean3[] ;
   private String AV5C_APP_ID ;
   private String A367TBM21_STUDY_NM ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private String AV9D_STUDY_NM ;
   private String AV8D_STATUS ;
   private String AV7D_DEL_FLG ;
   private String AV12H_INIT_FLG ;
   private String AV14H_SRCH_FLG ;
   private String AV13H_KNGN_FLG ;
   private String AV11H_DEL_FLG ;
   private String AV16H_STUDY_NM ;
   private String AV15H_STATUS ;
   private String AV6C_GAMEN_TITLE ;
   private String AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ;
   private String AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg ;
   private String lV16H_STUDY_NM ;
   private String AV28W_STATUS ;
   private String AV22W_DEL_FLG ;
   private String AV23W_ERRCD ;
   private String AV19W_A819_JS ;
   private String AV25W_MSG ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice radavD_status ;
   private HTMLChoice radavD_del_flg ;
   private HTMLChoice cmbavCtltbm21_status ;
   private HTMLChoice cmbavCtltbm21_del_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H000X2_A369TBM21_DEL_FLG ;
   private boolean[] H000X2_n369TBM21_DEL_FLG ;
   private String[] H000X2_A607TBM21_STATUS ;
   private boolean[] H000X2_n607TBM21_STATUS ;
   private String[] H000X2_A367TBM21_STUDY_NM ;
   private boolean[] H000X2_n367TBM21_STUDY_NM ;
   private long[] H000X2_A63TBM21_STUDY_ID ;
   private com.genexus.webpanels.WebSession AV26W_SESSION ;
   private GxObjectCollection AV30B402_SD08_STUDY_LIST_C ;
   private GxObjectCollection AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_User_study_sdt_getgxTv_SdtA_USER_STUDY_SDT_Study_id ;
   private GxObjectCollection AV43GXV7 ;
   private GxObjectCollection AV45GXV9 ;
   private SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem AV31B402_SD08_STUDY_LIST_I ;
   private SdtA_PAGING_SDT AV10H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT7[] ;
   private SdtA_LOGIN_SDT AV18W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtA_USER_STUDY_SDT GXv_SdtA_USER_STUDY_SDT1[] ;
}

final  class b402_wp01_study_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long A63TBM21_STUDY_ID ,
                                          String AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ,
                                          String AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg ,
                                          String AV16H_STUDY_NM ,
                                          String AV15H_STATUS ,
                                          String AV11H_DEL_FLG ,
                                          GxObjectCollection AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_User_study_sdt_getgxTv_SdtA_USER_STUDY_SDT_Study_id ,
                                          String A367TBM21_STUDY_NM ,
                                          String A607TBM21_STATUS ,
                                          String A369TBM21_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int9 ;
      GXv_int9 = new byte [3] ;
      Object[] GXv_Object10 ;
      GXv_Object10 = new Object [2] ;
      scmdbuf = "SELECT `TBM21_DEL_FLG`, `TBM21_STATUS`, `TBM21_STUDY_NM`, `TBM21_STUDY_ID` FROM `TBM21_STUDY`" ;
      if ( ( GXutil.strcmp(AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn, "99") != 0 ) && ( GXutil.strcmp(AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg, "1") != 0 ) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_User_study_sdt_getgxTv_SdtA_USER_STUDY_SDT_Study_id, "`TBM21_STUDY_ID` IN (", ")") + ")" ;
         }
         else
         {
            sWhereString = sWhereString + " (" + GXutil.toValueList("mysql", AV18W_A_LOGIN_SDT_getgxTv_SdtA_LOGIN_SDT_User_study_sdt_getgxTv_SdtA_USER_STUDY_SDT_Study_id, "`TBM21_STUDY_ID` IN (", ")") + ")" ;
         }
      }
      if ( ! (GXutil.strcmp("", AV16H_STUDY_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM21_STUDY_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM21_STUDY_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15H_STATUS)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM21_STATUS` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM21_STATUS` = ?)" ;
         }
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11H_DEL_FLG)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM21_DEL_FLG` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM21_DEL_FLG` = ?)" ;
         }
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TBM21_STUDY_ID`" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_H000X2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (GxObjectCollection)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
                  stmt.setVarchar(sIdx, (String)parms[3], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 1);
               }
               return;
      }
   }

}

