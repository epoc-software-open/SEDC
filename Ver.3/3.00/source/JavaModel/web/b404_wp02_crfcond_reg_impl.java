/*
               File: b404_wp02_crfcond_reg_impl
        Description: CRF選択条件登録
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:24:21.45
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b404_wp02_crfcond_reg_impl extends GXWebPanel
{
   public b404_wp02_crfcond_reg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b404_wp02_crfcond_reg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b404_wp02_crfcond_reg_impl.class ));
   }

   public b404_wp02_crfcond_reg_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            nRC_GXsfl_68 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_68_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_68_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_68, nGXsfl_68_idx, sGXsfl_68_idx) ;
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
            AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV16P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
               AV15P_COND_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15P_COND_NO", GXutil.ltrim( GXutil.str( AV15P_COND_NO, 4, 0)));
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
         pa192( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws192( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we192( ) ;
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
      httpContext.writeValue( "CRF選択条件登録") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513242154");
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
      GXEncryptionTmp = "b404_wp02_crfcond_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_CRF_ID,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_COND_NO,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b404_wp02_crfcond_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm192( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_crf_cond", AV5BC_CRF_COND);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_crf_cond", AV5BC_CRF_COND);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "D_grid_crfcond_reg", AV9D_GRID_CRFCOND_REG);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("D_grid_crfcond_reg", AV9D_GRID_CRFCOND_REG);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_68", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_68, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV50Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV6C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_APP_ID", GetHash( "", String.valueOf(AV6C_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV17P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV16P_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_COND_NO", GXutil.ltrim( localUtil.ntoc( AV15P_COND_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_ID", GXutil.rtrim( A55TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_NM", GXutil.rtrim( A205TAM07_USER_NM));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBC_CRF_COND", AV5BC_CRF_COND);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBC_CRF_COND", AV5BC_CRF_COND);
      }
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV24W_A821_JS));
      GxWebStd.gx_hidden_field( httpContext, "vW_A819_JS", GXutil.rtrim( AV23W_A819_JS));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_ORDER", GXutil.ltrim( localUtil.ntoc( A395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_DEL_FLG", GXutil.rtrim( A397TBM31_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_NM", GXutil.rtrim( A393TBM31_CRF_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM36_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A35TBM36_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM36_CRF_ID", GXutil.ltrim( localUtil.ntoc( A36TBM36_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM36_COND_NO", GXutil.ltrim( localUtil.ntoc( A37TBM36_COND_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM36_SELECT_CRF_ID", GXutil.ltrim( localUtil.ntoc( A38TBM36_SELECT_CRF_ID, (byte)(4), (byte)(0), ".", "")));
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
      return "B404_WP02_CRFCOND_REG" ;
   }

   public String getPgmdesc( )
   {
      return "CRF選択条件登録" ;
   }

   public void wb190( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_192( true) ;
      }
      else
      {
         wb_table1_2_192( false) ;
      }
      return  ;
   }

   public void wb_table1_2_192e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_109_192( true) ;
      }
      else
      {
         wb_table2_109_192( false) ;
      }
      return  ;
   }

   public void wb_table2_109_192e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start192( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "CRF選択条件登録", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0107") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0107", "");
         }
      }
      wbErr = false ;
      strup190( ) ;
   }

   public void ws192( )
   {
      start192( ) ;
      evt192( ) ;
   }

   public void evt192( )
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
                        /* Execute user event: e11192 */
                        e11192 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12192 */
                        e12192 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13192 */
                        e13192 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14192 */
                        e14192 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15192 */
                        e15192 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16192 */
                        e16192 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e17192 */
                        e17192 ();
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
                        nGXsfl_68_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_68_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_68_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_682( ) ;
                        AV41GXV6 = nGXsfl_68_idx ;
                        if ( ( AV9D_GRID_CRFCOND_REG.size() >= AV41GXV6 ) && ( AV41GXV6 > 0 ) )
                        {
                           AV9D_GRID_CRFCOND_REG.currentItem( ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)) );
                           ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)).setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check( GXutil.strtobool( httpContext.cgiGet( chkavCtlcheck.getInternalname())) );
                           ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)).setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm( httpContext.cgiGet( edtavCtltbm31_crf_nm_Internalname) );
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0107") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0107", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0107") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0107", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e18192 */
                              e18192 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e19192 */
                              e19192 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e20192 */
                              e20192 ();
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
                  else if ( nCmpId == 107 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0107") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0107", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we192( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm192( ) ;
         }
      }
   }

   public void pa192( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b404_wp02_crfcond_reg")), "b404_wp02_crfcond_reg") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b404_wp02_crfcond_reg"))) ;
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
                  AV17P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV16P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
                     AV15P_COND_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV15P_COND_NO", GXutil.ltrim( GXutil.str( AV15P_COND_NO, 4, 0)));
                  }
               }
            }
         }
         GXCCtl = "CTLCHECK_" + sGXsfl_68_idx ;
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

   public void gxnrgrid1_newrow( short nRC_GXsfl_68 ,
                                 short nGXsfl_68_idx ,
                                 String sGXsfl_68_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_682( ) ;
      while ( nGXsfl_68_idx <= nRC_GXsfl_68 )
      {
         sendrow_682( ) ;
         nGXsfl_68_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_68_idx+1)) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_68_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf192( ) ;
      /* End function Refresh */
   }

   public void rf192( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 820, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
      wbStart = (short)(68) ;
      nGXsfl_68_idx = (short)(1) ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_68_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_682( ) ;
      nGXsfl_68_Refreshing = (short)(1) ;
      /* Execute user event: e19192 */
      e19192 ();
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
         subsflControlProps_682( ) ;
         /* Execute user event: e20192 */
         e20192 ();
         wbEnd = (short)(68) ;
         wb190( ) ;
      }
      nGXsfl_68_Refreshing = (short)(0) ;
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

   public void strup190( )
   {
      /* Before Start, stand alone formulas. */
      AV50Pgmname = "B404_WP02_CRFCOND_REG" ;
      AV49Pgmdesc = "CRF選択条件登録" ;
      Gx_err = (short)(0) ;
      edtavCtltbm33_study_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_study_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm33_study_id_Enabled, 5, 0)));
      edtavD_tbm21_study_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tbm21_study_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_tbm21_study_nm_Enabled, 5, 0)));
      edtavCtltbm33_cond_no_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_cond_no_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm33_cond_no_Enabled, 5, 0)));
      edtavCtltbm31_crf_nm_Enabled = 0 ;
      edtavCtltbm33_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm33_crt_datetime_Enabled, 5, 0)));
      edtavCtltbm33_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm33_upd_datetime_Enabled, 5, 0)));
      edtavD_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_crt_user_nm_Enabled, 5, 0)));
      edtavD_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_upd_user_nm_Enabled, 5, 0)));
      edtavCtltbm33_crt_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_crt_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm33_crt_prog_nm_Enabled, 5, 0)));
      edtavCtltbm33_upd_prog_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_upd_prog_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltbm33_upd_prog_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e18192 */
      e18192 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_crf_cond"), AV5BC_CRF_COND);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "D_grid_crfcond_reg"), AV9D_GRID_CRFCOND_REG);
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM33_STUDY_ID");
            GX_FocusControl = edtavCtltbm33_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( 0 );
         }
         else
         {
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_study_id_Internalname), ".", ",") );
         }
         AV10D_TBM21_STUDY_NM = httpContext.cgiGet( edtavD_tbm21_study_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_TBM21_STUDY_NM", AV10D_TBM21_STUDY_NM);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_cond_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_cond_no_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM33_COND_NO");
            GX_FocusControl = edtavCtltbm33_cond_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( (short)(0) );
         }
         else
         {
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_cond_no_Internalname), ".", ",")) );
         }
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm( httpContext.cgiGet( edtavCtltbm33_cond_nm_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_prior_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_prior_no_Internalname), ".", ",") > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM33_PRIOR_NO");
            GX_FocusControl = edtavCtltbm33_prior_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( (short)(0) );
         }
         else
         {
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_prior_no_Internalname), ".", ",")) );
         }
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression( httpContext.cgiGet( edtavCtltbm33_expression_Internalname) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm33_crt_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM33_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm33_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm33_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm33_upd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBM33_UPD_DATETIME");
            GX_FocusControl = edtavCtltbm33_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm33_upd_datetime_Internalname)) );
         }
         AV8D_CRT_USER_NM = httpContext.cgiGet( edtavD_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
         AV11D_UPD_USER_NM = httpContext.cgiGet( edtavD_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm( httpContext.cgiGet( edtavCtltbm33_crt_prog_nm_Internalname) );
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( httpContext.cgiGet( edtavCtltbm33_upd_prog_nm_Internalname) );
         AV12H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         AV14H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         AV13H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         AV32W_SYS_CRFID = httpContext.cgiGet( edtavW_sys_crfid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_crf_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_crf_id_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM33_CRF_ID");
            GX_FocusControl = edtavCtltbm33_crf_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( (short)(0) );
         }
         else
         {
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_crf_id_Internalname), ".", ",")) );
         }
         /* Read saved values. */
         nRC_GXsfl_68 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), ".", ",")) ;
         AV17P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV16P_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "vP_CRF_ID"), ".", ",")) ;
         AV15P_COND_NO = (short)(localUtil.ctol( httpContext.cgiGet( "vP_COND_NO"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0107") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0107", "");
         }
         nRC_GXsfl_68 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), ".", ",")) ;
         nGXsfl_68_fel_idx = (short)(0) ;
         while ( nGXsfl_68_fel_idx < nRC_GXsfl_68 )
         {
            nGXsfl_68_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_68_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_68_fel_idx+1)) ;
            sGXsfl_68_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_68_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_682( ) ;
            AV41GXV6 = nGXsfl_68_fel_idx ;
            AV41GXV6 = nGXsfl_68_fel_idx ;
            if ( ( AV9D_GRID_CRFCOND_REG.size() >= AV41GXV6 ) && ( AV41GXV6 > 0 ) )
            {
               AV9D_GRID_CRFCOND_REG.currentItem( ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)) );
               ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)).setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check( GXutil.strtobool( httpContext.cgiGet( chkavCtlcheck.getInternalname())) );
               ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)).setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm( httpContext.cgiGet( edtavCtltbm31_crf_nm_Internalname) );
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0107") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0107", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0107") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0107", "");
            }
            AV9D_GRID_CRFCOND_REG.currentItem( ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)) );
         }
         if ( nGXsfl_68_fel_idx == 0 )
         {
            nGXsfl_68_idx = (short)(1) ;
            sGXsfl_68_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_68_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_682( ) ;
         }
         nGXsfl_68_fel_idx = (short)(1) ;
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
      /* Execute user event: e18192 */
      e18192 ();
      if (returnInSub) return;
   }

   public void e18192( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B404" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      AV7C_GAMEN_TITLE = AV49Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_GAMEN_TITLE", AV7C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV12H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV20W_A_LOGIN_SDT,AV6C_APP_ID,AV7C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0107",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e19192( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV12H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV50Pgmname, "INFO", "画面起動") ;
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
   }

   private void e20192( )
   {
      /* Grid1_Load Routine */
      AV41GXV6 = (short)(1) ;
      while ( AV41GXV6 <= AV9D_GRID_CRFCOND_REG.size() )
      {
         AV9D_GRID_CRFCOND_REG.currentItem( ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9D_GRID_CRFCOND_REG", AV9D_GRID_CRFCOND_REG);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(68) ;
         }
         sendrow_682( ) ;
         AV41GXV6 = (short)(AV41GXV6+1) ;
      }
   }

   public void e11192( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "0") == 0 )
         {
            AV29W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_ERRFLG", AV29W_ERRFLG);
            /* Execute user subroutine: S162 */
            S162 ();
            if (returnInSub) return;
            if ( ! AV29W_ERRFLG )
            {
               GXt_char1 = AV31W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               AV31W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
               GXt_char1 = AV24W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV31W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
               AV24W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
            }
         }
      }
   }

   public void e15192( )
   {
      /* 'BTN_REG_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV13H_KNGN_FLG, "") )
      {
         AV51GXLvl138 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51GXLvl138", GXutil.str( AV51GXLvl138, 1, 0));
         /* Using cursor H00192 */
         pr_default.execute(0, new Object[] {new Long(AV17P_STUDY_ID), AV32W_SYS_CRFID});
         if ( Gx_err != 0 )
         {
            AV51GXLvl138 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51GXLvl138", GXutil.str( AV51GXLvl138, 1, 0));
         }
         while ( (pr_default.getStatus(0) != 101) )
         {
            A77TBM33_CRF_ID = H00192_A77TBM33_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A77TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A77TBM33_CRF_ID, 4, 0)));
            A76TBM33_STUDY_ID = H00192_A76TBM33_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A76TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A76TBM33_STUDY_ID, 10, 0)));
            A78TBM33_COND_NO = H00192_A78TBM33_COND_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A78TBM33_COND_NO", GXutil.ltrim( GXutil.str( A78TBM33_COND_NO, 4, 0)));
            AV51GXLvl138 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51GXLvl138", GXutil.str( AV51GXLvl138, 1, 0));
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( (short)(A78TBM33_COND_NO+1) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV51GXLvl138 == 0 )
         {
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( (short)(1) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         }
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( (short)(GXutil.lval( AV32W_SYS_CRFID)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div( "2" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd( "" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg( "" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg( "1" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm( AV50Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( AV50Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.Save();
         if ( AV5BC_CRF_COND.Success() )
         {
            GXv_char2[0] = AV30W_ERRMSG ;
            new b404_pc01_tbm36_reg(remoteHandle, context).execute( "0", AV5BC_CRF_COND, AV9D_GRID_CRFCOND_REG, AV32W_SYS_CRFID, GXv_char2) ;
            b404_wp02_crfcond_reg_impl.this.AV30W_ERRMSG = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
            httpContext.ajax_rsp_assign_attri("", false, "AV30W_ERRMSG", AV30W_ERRMSG);
            if ( (GXutil.strcmp("", AV30W_ERRMSG)==0) )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               GXKey = context.getSiteKey( ) ;
               GXEncryptionTmp = "b404_wp02_crfcond_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) ;
               httpContext.wjLoc = formatLink("b404_wp02_crfcond_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
            else
            {
               Application.rollback(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               httpContext.GX_msglist.addItem(AV30W_ERRMSG);
            }
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
            GXt_char1 = AV31W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF_COND.GetMessages(), (byte)(0), GXv_char2) ;
            b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV31W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
            httpContext.GX_msglist.addItem(AV31W_MSG);
         }
      }
   }

   public void e12192( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            AV29W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_ERRFLG", AV29W_ERRFLG);
            /* Execute user subroutine: S162 */
            S162 ();
            if (returnInSub) return;
            if ( ! AV29W_ERRFLG )
            {
               GXt_char1 = AV31W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char2) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               AV31W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
               GXt_char1 = AV24W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV31W_MSG, "", "BTN_UPD_EXEC", "", GXv_char2) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
               AV24W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
            }
         }
      }
   }

   public void e16192( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV13H_KNGN_FLG, "") )
      {
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( AV50Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.Save();
         if ( AV5BC_CRF_COND.Success() )
         {
            GXv_char2[0] = AV30W_ERRMSG ;
            new b404_pc01_tbm36_reg(remoteHandle, context).execute( "1", AV5BC_CRF_COND, AV9D_GRID_CRFCOND_REG, AV32W_SYS_CRFID, GXv_char2) ;
            b404_wp02_crfcond_reg_impl.this.AV30W_ERRMSG = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
            httpContext.ajax_rsp_assign_attri("", false, "AV30W_ERRMSG", AV30W_ERRMSG);
            if ( (GXutil.strcmp("", AV30W_ERRMSG)==0) )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               GXKey = context.getSiteKey( ) ;
               GXEncryptionTmp = "b404_wp01_crfcond_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) ;
               httpContext.wjLoc = formatLink("b404_wp01_crfcond_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
            else
            {
               Application.rollback(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               httpContext.GX_msglist.addItem(AV30W_ERRMSG);
            }
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
            GXt_char1 = AV31W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF_COND.GetMessages(), (byte)(0), GXv_char2) ;
            b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV31W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
            httpContext.GX_msglist.addItem(AV31W_MSG);
         }
      }
   }

   public void e13192( )
   {
      /* 'BTN_DLT' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            AV29W_ERRFLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29W_ERRFLG", AV29W_ERRFLG);
            /* Execute user subroutine: S162 */
            S162 ();
            if (returnInSub) return;
            if ( ! AV29W_ERRFLG )
            {
               GXt_char1 = AV31W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               AV31W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
               GXt_char1 = AV24W_A821_JS ;
               GXv_char2[0] = GXt_char1 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV31W_MSG, "", "BTN_DLT_EXEC", "", GXv_char2) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
               AV24W_A821_JS = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
            }
         }
      }
   }

   public void e17192( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV13H_KNGN_FLG, "") )
      {
         GXv_char2[0] = AV30W_ERRMSG ;
         new b404_pc01_tbm36_reg(remoteHandle, context).execute( "2", AV5BC_CRF_COND, AV9D_GRID_CRFCOND_REG, AV32W_SYS_CRFID, GXv_char2) ;
         b404_wp02_crfcond_reg_impl.this.AV30W_ERRMSG = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
         httpContext.ajax_rsp_assign_attri("", false, "AV30W_ERRMSG", AV30W_ERRMSG);
         if ( (GXutil.strcmp("", AV30W_ERRMSG)==0) )
         {
            AV5BC_CRF_COND.Delete();
            if ( AV5BC_CRF_COND.Success() )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               GXKey = context.getSiteKey( ) ;
               GXEncryptionTmp = "b404_wp01_crfcond_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) ;
               httpContext.wjLoc = formatLink("b404_wp01_crfcond_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
            else
            {
               Application.rollback(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               GXt_char1 = AV31W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF_COND.GetMessages(), (byte)(0), GXv_char2) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               AV31W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
               httpContext.GX_msglist.addItem(AV31W_MSG);
            }
         }
         else
         {
            Application.rollback(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
            httpContext.GX_msglist.addItem(AV30W_ERRMSG);
         }
      }
   }

   public void e14192( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b404_wp01_crfcond_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b404_wp01_crfcond_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S162( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      GXv_int3[0] = AV27W_ERR_CD ;
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] = AV18W_A_CHK_RESULT_SDT ;
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] = AV21W_A_RESULT_MSG_SDT ;
      new b404_pc02_crfcond_chk(remoteHandle, context).execute( AV5BC_CRF_COND, AV26W_DEL_FLG, GXv_int3, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5) ;
      b404_wp02_crfcond_reg_impl.this.AV27W_ERR_CD = GXv_int3[0] ;
      AV18W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[0] ;
      AV21W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_ERR_CD", GXutil.str( AV27W_ERR_CD, 1, 0));
      if ( AV27W_ERR_CD == 1 )
      {
         AV29W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29W_ERRFLG", AV29W_ERRFLG);
      }
      if ( AV21W_A_RESULT_MSG_SDT.size() > 0 )
      {
         AV52GXV14 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52GXV14", GXutil.ltrim( GXutil.str( AV52GXV14, 8, 0)));
         while ( AV52GXV14 <= AV21W_A_RESULT_MSG_SDT.size() )
         {
            AV22W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV21W_A_RESULT_MSG_SDT.elementAt(-1+AV52GXV14));
            httpContext.GX_msglist.addItem(AV22W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
            AV52GXV14 = (int)(AV52GXV14+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52GXV14", GXutil.ltrim( GXutil.str( AV52GXV14, 8, 0)));
         }
         /* Execute user subroutine: S182 */
         S182 ();
         if (returnInSub) return;
      }
   }

   public void S172( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavCtltbm33_cond_nm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_cond_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm33_cond_nm_Backcolor, 9, 0)));
      edtavCtltbm33_expression_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_expression_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm33_expression_Backcolor, 9, 0)));
   }

   public void S182( )
   {
      /* 'SUB_ERRDISP' Routine */
      AV53GXV15 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53GXV15", GXutil.ltrim( GXutil.str( AV53GXV15, 8, 0)));
      while ( AV53GXV15 <= AV18W_A_CHK_RESULT_SDT.size() )
      {
         AV19W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV18W_A_CHK_RESULT_SDT.elementAt(-1+AV53GXV15));
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
         AV53GXV15 = (int)(AV53GXV15+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53GXV15", GXutil.ltrim( GXutil.str( AV53GXV15, 8, 0)));
      }
   }

   public void S192( )
   {
      /* 'SUB_ERRDISP_HEAD' Routine */
      if ( GXutil.strcmp(AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM33_COND_NM") == 0 )
      {
         edtavCtltbm33_cond_nm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_cond_nm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm33_cond_nm_Backcolor, 9, 0)));
         if ( AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm33_cond_nm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( GXutil.strcmp(AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(), "TBM33_EXPRESSION") == 0 )
      {
         edtavCtltbm33_expression_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_expression_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavCtltbm33_expression_Backcolor, 9, 0)));
         if ( AV19W_A_CHK_RESULT_SDT_ITEM.getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus() )
         {
            GX_FocusControl = edtavCtltbm33_expression_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H00193 */
      pr_default.execute(1, new Object[] {new Long(AV17P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A63TBM21_STUDY_ID = H00193_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H00193_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H00193_n367TBM21_STUDY_NM[0] ;
         GXt_char1 = AV10D_TBM21_STUDY_NM ;
         GXv_char2[0] = GXt_char1 ;
         new a803_pc01_htmlescape(remoteHandle, context).execute( A367TBM21_STUDY_NM, GXv_char2) ;
         b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         AV10D_TBM21_STUDY_NM = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_TBM21_STUDY_NM", AV10D_TBM21_STUDY_NM);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      GXt_char1 = AV32W_SYS_CRFID ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "016", GXv_char2) ;
      b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32W_SYS_CRFID = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
      if ( ! (0==AV17P_STUDY_ID) && ! (0==AV16P_CRF_ID) && ! (0==AV15P_COND_NO) )
      {
         AV14H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         AV5BC_CRF_COND.Load(AV17P_STUDY_ID, AV16P_CRF_ID, AV15P_COND_NO);
         if ( AV5BC_CRF_COND.Fail() )
         {
            GXt_char1 = AV31W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV31W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31W_MSG", AV31W_MSG);
            httpContext.GX_msglist.addItem(AV31W_MSG);
         }
         else
         {
            AV55GXLvl420 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55GXLvl420", GXutil.str( AV55GXLvl420, 1, 0));
            /* Using cursor H00194 */
            pr_default.execute(2, new Object[] {AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id()});
            if ( Gx_err != 0 )
            {
               AV55GXLvl420 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55GXLvl420", GXutil.str( AV55GXLvl420, 1, 0));
            }
            while ( (pr_default.getStatus(2) != 101) )
            {
               A55TAM07_USER_ID = H00194_A55TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
               A205TAM07_USER_NM = H00194_A205TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               n205TAM07_USER_NM = H00194_n205TAM07_USER_NM[0] ;
               AV55GXLvl420 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55GXLvl420", GXutil.str( AV55GXLvl420, 1, 0));
               GXt_char1 = AV8D_CRT_USER_NM ;
               GXv_char2[0] = GXt_char1 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
               AV8D_CRT_USER_NM = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            if ( AV55GXLvl420 == 0 )
            {
               AV8D_CRT_USER_NM = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
            }
            if ( GXutil.strcmp(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id(), AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id()) == 0 )
            {
               AV11D_UPD_USER_NM = AV8D_CRT_USER_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
            }
            else
            {
               AV56GXLvl435 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56GXLvl435", GXutil.str( AV56GXLvl435, 1, 0));
               /* Using cursor H00195 */
               pr_default.execute(3, new Object[] {AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id()});
               if ( Gx_err != 0 )
               {
                  AV56GXLvl435 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV56GXLvl435", GXutil.str( AV56GXLvl435, 1, 0));
               }
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A55TAM07_USER_ID = H00195_A55TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
                  A205TAM07_USER_NM = H00195_A205TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  n205TAM07_USER_NM = H00195_n205TAM07_USER_NM[0] ;
                  AV56GXLvl435 = (byte)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV56GXLvl435", GXutil.str( AV56GXLvl435, 1, 0));
                  GXt_char1 = AV11D_UPD_USER_NM ;
                  GXv_char2[0] = GXt_char1 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
                  b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
                  AV11D_UPD_USER_NM = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(3);
               if ( AV56GXLvl435 == 0 )
               {
                  AV11D_UPD_USER_NM = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
               }
            }
         }
         edtavCtltbm33_cond_no_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_cond_no_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm33_cond_no_Visible, 5, 0)));
         edtavCtltbm33_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm33_crt_datetime_Visible, 5, 0)));
         edtavCtltbm33_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm33_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltbm33_cond_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV14H_MODE = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( AV17P_STUDY_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         edtavCtltbm33_cond_no_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_cond_no_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm33_cond_no_Visible, 5, 0)));
         edtavCtltbm33_crt_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm33_crt_datetime_Visible, 5, 0)));
         edtavCtltbm33_upd_datetime_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltbm33_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltbm33_upd_datetime_Visible, 5, 0)));
         GX_FocusControl = edtavCtltbm33_cond_no_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
   }

   public void S212( )
   {
      /* 'SUB_GRD_DATA_EDIT' Routine */
      AV9D_GRID_CRFCOND_REG.clear();
      gx_BV68 = true ;
      GXt_char1 = AV33W_NC_CRFID ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "004", GXv_char2) ;
      b404_wp02_crfcond_reg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33W_NC_CRFID = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33W_NC_CRFID", AV33W_NC_CRFID);
      /* Using cursor H00196 */
      pr_default.execute(4, new Object[] {new Long(AV17P_STUDY_ID), AV33W_NC_CRFID});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A68TBM31_STUDY_ID = H00196_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A397TBM31_DEL_FLG = H00196_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = H00196_n397TBM31_DEL_FLG[0] ;
         A69TBM31_CRF_ID = H00196_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A393TBM31_CRF_NM = H00196_A393TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
         n393TBM31_CRF_NM = H00196_n393TBM31_CRF_NM[0] ;
         A395TBM31_ORDER = H00196_A395TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
         n395TBM31_ORDER = H00196_n395TBM31_ORDER[0] ;
         AV25W_CRFCOND_REG_ITEM = (SdtB404_SD02_CRFCOND_REG_Item)new SdtB404_SD02_CRFCOND_REG_Item(remoteHandle, context);
         AV25W_CRFCOND_REG_ITEM.setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check( false );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_CRFCOND_REG_ITEM", AV25W_CRFCOND_REG_ITEM);
         AV25W_CRFCOND_REG_ITEM.setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id( A69TBM31_CRF_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_CRFCOND_REG_ITEM", AV25W_CRFCOND_REG_ITEM);
         AV25W_CRFCOND_REG_ITEM.setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm( A393TBM31_CRF_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_CRFCOND_REG_ITEM", AV25W_CRFCOND_REG_ITEM);
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            /* Using cursor H00197 */
            pr_default.execute(5, new Object[] {new Long(AV17P_STUDY_ID), new Short(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id()), new Short(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no()), new Short(AV25W_CRFCOND_REG_ITEM.getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id())});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A38TBM36_SELECT_CRF_ID = H00197_A38TBM36_SELECT_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A38TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A38TBM36_SELECT_CRF_ID, 4, 0)));
               A37TBM36_COND_NO = H00197_A37TBM36_COND_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A37TBM36_COND_NO", GXutil.ltrim( GXutil.str( A37TBM36_COND_NO, 4, 0)));
               A36TBM36_CRF_ID = H00197_A36TBM36_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A36TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A36TBM36_CRF_ID, 4, 0)));
               A35TBM36_STUDY_ID = H00197_A35TBM36_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A35TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A35TBM36_STUDY_ID, 10, 0)));
               AV25W_CRFCOND_REG_ITEM.setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_CRFCOND_REG_ITEM", AV25W_CRFCOND_REG_ITEM);
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
         }
         AV9D_GRID_CRFCOND_REG.add(AV25W_CRFCOND_REG_ITEM, 0);
         gx_BV68 = true ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV20W_A_LOGIN_SDT;
      GXv_char2[0] = AV28W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char2) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      b404_wp02_crfcond_reg_impl.this.AV28W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRCD", AV28W_ERRCD);
      if ( GXutil.strcmp(AV28W_ERRCD, "0") != 0 )
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
      AV24W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_A821_JS", AV24W_A821_JS);
      AV23W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_A819_JS", AV23W_A819_JS);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( 0 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( (short)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( GXt_dtime7 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime( GXt_dtime7 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV8D_CRT_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
      AV11D_UPD_USER_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
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
      if ( ! (GXutil.strcmp("", AV23W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV23W_A819_JS ;
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
      GXv_char2[0] = AV13H_KNGN_FLG ;
      GXv_char8[0] = AV28W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char2, GXv_char8) ;
      b404_wp02_crfcond_reg_impl.this.AV13H_KNGN_FLG = GXv_char2[0] ;
      b404_wp02_crfcond_reg_impl.this.AV28W_ERRCD = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV28W_ERRCD", AV28W_ERRCD);
      if ( GXutil.strcmp(AV28W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S222( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV50Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
   }

   public void S202( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      lblTxt_btn_reg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_upd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
      lblTxt_btn_dlt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
      if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
      {
         GXt_boolean9 = false ;
         GXv_boolean10[0] = GXt_boolean9 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV13H_KNGN_FLG, "", GXv_boolean10) ;
         b404_wp02_crfcond_reg_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_upd_Visible = (GXt_boolean9 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
         GXt_boolean9 = false ;
         GXv_boolean10[0] = GXt_boolean9 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV13H_KNGN_FLG, "", GXv_boolean10) ;
         b404_wp02_crfcond_reg_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_dlt_Visible = (GXt_boolean9 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
      }
      else
      {
         GXt_boolean9 = false ;
         GXv_boolean10[0] = GXt_boolean9 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV13H_KNGN_FLG, "", GXv_boolean10) ;
         b404_wp02_crfcond_reg_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_reg_Visible = (GXt_boolean9 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      }
   }

   public void wb_table2_109_192( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "BTN_REG_EXEC", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "BTN_UPD_EXEC", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "BTN_DLT_EXEC", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV14H_MODE), GXutil.rtrim( localUtil.format( AV14H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_mode_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV13H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV13H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_sys_crfid_Internalname, GXutil.rtrim( AV32W_SYS_CRFID), GXutil.rtrim( localUtil.format( AV32W_SYS_CRFID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_sys_crfid_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_crf_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm33_crf_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         httpContext.writeText( "&nbsp;&nbsp; ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_109_192e( true) ;
      }
      else
      {
         wb_table2_109_192e( false) ;
      }
   }

   public void wb_table1_2_192( boolean wbgen )
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
         wb_table3_6_192( true) ;
      }
      else
      {
         wb_table3_6_192( false) ;
      }
      return  ;
   }

   public void wb_table3_6_192e( boolean wbgen )
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
         wb_table1_2_192e( true) ;
      }
      else
      {
         wb_table1_2_192e( false) ;
      }
   }

   public void wb_table3_6_192( boolean wbgen )
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
         wb_table4_12_192( true) ;
      }
      else
      {
         wb_table4_12_192( false) ;
      }
      return  ;
   }

   public void wb_table4_12_192e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_24_192( true) ;
      }
      else
      {
         wb_table5_24_192( false) ;
      }
      return  ;
   }

   public void wb_table5_24_192e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0107"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0107"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0107"+"");
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
         wb_table3_6_192e( true) ;
      }
      else
      {
         wb_table3_6_192e( false) ;
      }
   }

   public void wb_table5_24_192( boolean wbgen )
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
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         wb_table6_30_192( true) ;
      }
      else
      {
         wb_table6_30_192( false) ;
      }
      return  ;
   }

   public void wb_table6_30_192e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_75_192( true) ;
      }
      else
      {
         wb_table7_75_192( false) ;
      }
      return  ;
   }

   public void wb_table7_75_192e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_24_192e( true) ;
      }
      else
      {
         wb_table5_24_192e( false) ;
      }
   }

   public void wb_table7_75_192( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 945, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable12_Internalname, tblTable12_Internalname, "", "TableFormTM-1", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼管理情報") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, "作成日時", "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm33_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_crt_datetime_Internalname, localUtil.format(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm33_crt_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltbm33_crt_datetime_Visible, edtavCtltbm33_crt_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm33_crt_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltbm33_crt_datetime_Visible==0)||(edtavCtltbm33_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, "更新日時", "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltbm33_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_upd_datetime_Internalname, localUtil.format(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm33_upd_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltbm33_upd_datetime_Visible, edtavCtltbm33_upd_datetime_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm33_upd_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltbm33_upd_datetime_Visible==0)||(edtavCtltbm33_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, "作成ユーザー名", "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV8D_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV8D_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_crt_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_crt_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, "更新ユーザー名", "", "", lblTextblock73_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV11D_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV11D_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_upd_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_upd_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, "作成プログラムID", "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm33_crt_prog_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltbm33_crt_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, "更新プログラムID", "", "", lblTextblock74_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm33_upd_prog_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltbm33_upd_prog_nm_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_75_192e( true) ;
      }
      else
      {
         wb_table7_75_192e( false) ;
      }
   }

   public void wb_table6_30_192( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 945, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"FormTitle\" colspan=\"4\" >") ;
         httpContext.writeText( "▼CRF選択条件") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage10_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 345, "px", 0, "px", "SectionWordBreak", "");
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id(), (byte)(10), (byte)(0), ".", "")), ((edtavCtltbm33_study_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id()), "ZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm33_study_id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltbm33_study_id_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "&nbsp;", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B404_WP02_CRFCOND_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tbm21_study_nm_Internalname, GXutil.rtrim( AV10D_TBM21_STUDY_NM), GXutil.rtrim( localUtil.format( AV10D_TBM21_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tbm21_study_nm_Jsonclick, 0, "ReadonlyAttributeImeOff", "", "", "", 1, edtavD_tbm21_study_nm_Enabled, 0, "text", "", 20, "chr", 1, "row", 100, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage11_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "条件番号", "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection2_Internalname, 1, 360, "px", 0, "px", "SectionWordBreak", "");
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_cond_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no(), (byte)(4), (byte)(0), ".", "")), ((edtavCtltbm33_cond_no_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no()), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm33_cond_no_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltbm33_cond_no_Visible, edtavCtltbm33_cond_no_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage12_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "条件名", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_cond_nm_Internalname, GXutil.rtrim( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm33_cond_nm_Jsonclick, 0, "AttributeImeOn", "background:"+WebUtils.getHTMLColor( edtavCtltbm33_cond_nm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "優先順", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_prior_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no(), (byte)(3), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no()), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltbm33_prior_no_Jsonclick, 0, "AttributeNum", "", "", "", 1, 1, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, "判定ロジック", "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm33_expression_Backcolor) + ";" ;
         ClassString = "Attribute" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm33_expression_Backcolor) + ";" ;
         GxWebStd.gx_html_textarea( httpContext, edtavCtltbm33_expression_Internalname, GXutil.rtrim( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression()), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "選択CRF", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"68\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 820, 10, 0)) + "px" + ";" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 1, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( 820, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
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
      if ( wbEnd == 68 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_68 = (short)(nGXsfl_68_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV41GXV6 = nGXsfl_68_idx ;
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
         wb_table6_30_192e( true) ;
      }
      else
      {
         wb_table6_30_192e( false) ;
      }
   }

   public void wb_table4_12_192( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DLT\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "戻る（F11）", "", "", lblTxt_btn_can_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_192e( true) ;
      }
      else
      {
         wb_table4_12_192e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV17P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17P_STUDY_ID", GXutil.ltrim( GXutil.str( AV17P_STUDY_ID, 10, 0)));
      AV16P_CRF_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_CRF_ID", GXutil.ltrim( GXutil.str( AV16P_CRF_ID, 4, 0)));
      AV15P_COND_NO = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_COND_NO", GXutil.ltrim( GXutil.str( AV15P_COND_NO, 4, 0)));
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
      pa192( ) ;
      ws192( ) ;
      we192( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513242673");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b404_wp02_crfcond_reg.js", "?202071513242675");
      /* End function include_jscripts */
   }

   public void subsflControlProps_682( )
   {
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_68_idx );
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_68_idx ;
   }

   public void subsflControlProps_fel_682( )
   {
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_68_fel_idx );
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_68_fel_idx ;
   }

   public void sendrow_682( )
   {
      subsflControlProps_682( ) ;
      wb190( ) ;
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
         if ( ((int)(((nGXsfl_68_idx-1)/ (double) (1)) % (2))) == 0 )
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
         if ( ( 1 == 0 ) && ( nGXsfl_68_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_68_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)((nGXsfl_68_idx) % (1))) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_68_idx+"\">") ;
            }
         }
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:30px;width:30px\""});
      /* Check box */
      TempTags = " " + ((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
      ClassString = "ReadonlyAttributeImeOff" ;
      StyleString = "" ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavCtlcheck.getInternalname(),GXutil.booltostr( ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)).getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(71, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(71);\"" : " ")});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection3_Internalname+"_"+sGXsfl_68_idx,new Integer(1),new Integer(785),"px",new Integer(0),"px","SectionWordBreak",""});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_nm_Internalname,GXutil.rtrim( ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)).getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbm31_crf_nm_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbm31_crf_nm_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(68),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
            if ( ((int)((nGXsfl_68_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_68_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_68_idx+1)) ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_68_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_682( ) ;
      /* End function sendrow_682 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_upd_Internalname = "TXT_BTN_UPD" ;
      lblTxt_btn_dlt_Internalname = "TXT_BTN_DLT" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      imgImage10_Internalname = "IMAGE10" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavCtltbm33_study_id_Internalname = "CTLTBM33_STUDY_ID" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtavD_tbm21_study_nm_Internalname = "vD_TBM21_STUDY_NM" ;
      divSection1_Internalname = "SECTION1" ;
      imgImage11_Internalname = "IMAGE11" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtavCtltbm33_cond_no_Internalname = "CTLTBM33_COND_NO" ;
      divSection2_Internalname = "SECTION2" ;
      imgImage12_Internalname = "IMAGE12" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavCtltbm33_cond_nm_Internalname = "CTLTBM33_COND_NM" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtavCtltbm33_prior_no_Internalname = "CTLTBM33_PRIOR_NO" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtavCtltbm33_expression_Internalname = "CTLTBM33_EXPRESSION" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      divSection3_Internalname = "SECTION3" ;
      tblTable10_Internalname = "TABLE10" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtavCtltbm33_crt_datetime_Internalname = "CTLTBM33_CRT_DATETIME" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtavCtltbm33_upd_datetime_Internalname = "CTLTBM33_UPD_DATETIME" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtavD_crt_user_nm_Internalname = "vD_CRT_USER_NM" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtavD_upd_user_nm_Internalname = "vD_UPD_USER_NM" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtavCtltbm33_crt_prog_nm_Internalname = "CTLTBM33_CRT_PROG_NM" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtavCtltbm33_upd_prog_nm_Internalname = "CTLTBM33_UPD_PROG_NM" ;
      tblTable12_Internalname = "TABLE12" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_mode_Internalname = "vH_MODE" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavW_sys_crfid_Internalname = "vW_SYS_CRFID" ;
      edtavCtltbm33_crf_id_Internalname = "CTLTBM33_CRF_ID" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavCtltbm31_crf_nm_Jsonclick = "" ;
      chkavCtlcheck.setVisible( 1 );
      chkavCtlcheck.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGrid" ;
      lblTxt_btn_dlt_Visible = 1 ;
      lblTxt_btn_upd_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtltbm31_crf_nm_Enabled = 0 ;
      edtavCtltbm33_expression_Backstyle = (byte)(-1) ;
      edtavCtltbm33_expression_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm33_prior_no_Jsonclick = "" ;
      edtavCtltbm33_cond_nm_Jsonclick = "" ;
      edtavCtltbm33_cond_nm_Backstyle = (byte)(-1) ;
      edtavCtltbm33_cond_nm_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm33_cond_no_Jsonclick = "" ;
      edtavCtltbm33_cond_no_Enabled = 0 ;
      edtavCtltbm33_cond_no_Visible = 1 ;
      edtavD_tbm21_study_nm_Jsonclick = "" ;
      edtavD_tbm21_study_nm_Enabled = 1 ;
      edtavCtltbm33_study_id_Jsonclick = "" ;
      edtavCtltbm33_study_id_Enabled = 0 ;
      edtavCtltbm33_upd_prog_nm_Jsonclick = "" ;
      edtavCtltbm33_upd_prog_nm_Enabled = 0 ;
      edtavCtltbm33_crt_prog_nm_Jsonclick = "" ;
      edtavCtltbm33_crt_prog_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Jsonclick = "" ;
      edtavD_upd_user_nm_Enabled = 1 ;
      edtavD_crt_user_nm_Jsonclick = "" ;
      edtavD_crt_user_nm_Enabled = 1 ;
      edtavCtltbm33_upd_datetime_Jsonclick = "" ;
      edtavCtltbm33_upd_datetime_Enabled = 0 ;
      edtavCtltbm33_upd_datetime_Visible = 1 ;
      edtavCtltbm33_crt_datetime_Jsonclick = "" ;
      edtavCtltbm33_crt_datetime_Enabled = 0 ;
      edtavCtltbm33_crt_datetime_Visible = 1 ;
      edtavCtltbm33_crf_id_Jsonclick = "" ;
      edtavW_sys_crfid_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavCtltbm33_expression_Backcolor = (int)(0xFFFFFF) ;
      edtavCtltbm33_cond_nm_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltbm33_upd_prog_nm_Enabled = -1 ;
      edtavCtltbm33_crt_prog_nm_Enabled = -1 ;
      edtavCtltbm33_upd_datetime_Enabled = -1 ;
      edtavCtltbm33_crt_datetime_Enabled = -1 ;
      edtavCtltbm33_cond_no_Enabled = -1 ;
      edtavCtltbm33_study_id_Enabled = -1 ;
      subGrid1_Width = 820 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
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
                  /* Execute user subroutine: S222 */
                  S222 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV5BC_CRF_COND = new SdtTBM33_CRF_COND(remoteHandle);
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV9D_GRID_CRFCOND_REG = new GxObjectCollection(SdtB404_SD02_CRFCOND_REG_Item.class, "B404_SD02_CRFCOND_REG.Item", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV50Pgmname = "" ;
      AV6C_APP_ID = "" ;
      A367TBM21_STUDY_NM = "" ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      AV24W_A821_JS = "" ;
      AV23W_A819_JS = "" ;
      A397TBM31_DEL_FLG = "" ;
      A393TBM31_CRF_NM = "" ;
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
      edtavCtltbm31_crf_nm_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV49Pgmdesc = "" ;
      AV10D_TBM21_STUDY_NM = "" ;
      AV8D_CRT_USER_NM = "" ;
      AV11D_UPD_USER_NM = "" ;
      AV12H_INIT_FLG = "" ;
      AV14H_MODE = "" ;
      AV13H_KNGN_FLG = "" ;
      AV32W_SYS_CRFID = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV31W_MSG = "" ;
      scmdbuf = "" ;
      H00192_A77TBM33_CRF_ID = new short[1] ;
      H00192_A76TBM33_STUDY_ID = new long[1] ;
      H00192_A78TBM33_COND_NO = new short[1] ;
      AV30W_ERRMSG = "" ;
      GXv_int3 = new byte [1] ;
      AV18W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4 = new GxObjectCollection [1] ;
      AV21W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5 = new GxObjectCollection [1] ;
      AV22W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV19W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      H00193_A63TBM21_STUDY_ID = new long[1] ;
      H00193_A367TBM21_STUDY_NM = new String[] {""} ;
      H00193_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H00194_A55TAM07_USER_ID = new String[] {""} ;
      H00194_A205TAM07_USER_NM = new String[] {""} ;
      H00194_n205TAM07_USER_NM = new boolean[] {false} ;
      H00195_A55TAM07_USER_ID = new String[] {""} ;
      H00195_A205TAM07_USER_NM = new String[] {""} ;
      H00195_n205TAM07_USER_NM = new boolean[] {false} ;
      AV33W_NC_CRFID = "" ;
      GXt_char1 = "" ;
      H00196_A68TBM31_STUDY_ID = new long[1] ;
      H00196_A397TBM31_DEL_FLG = new String[] {""} ;
      H00196_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H00196_A69TBM31_CRF_ID = new short[1] ;
      H00196_A393TBM31_CRF_NM = new String[] {""} ;
      H00196_n393TBM31_CRF_NM = new boolean[] {false} ;
      H00196_A395TBM31_ORDER = new int[1] ;
      H00196_n395TBM31_ORDER = new boolean[] {false} ;
      AV25W_CRFCOND_REG_ITEM = new SdtB404_SD02_CRFCOND_REG_Item(remoteHandle, context);
      H00197_A38TBM36_SELECT_CRF_ID = new short[1] ;
      H00197_A37TBM36_COND_NO = new short[1] ;
      H00197_A36TBM36_CRF_ID = new short[1] ;
      H00197_A35TBM36_STUDY_ID = new long[1] ;
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV28W_ERRCD = "" ;
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char2 = new String [1] ;
      GXv_char8 = new String [1] ;
      GXv_boolean10 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock72_Jsonclick = "" ;
      lblTextblock70_Jsonclick = "" ;
      lblTextblock73_Jsonclick = "" ;
      lblTextblock71_Jsonclick = "" ;
      lblTextblock74_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
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
      pr_default = new DataStoreProvider(context, remoteHandle, new b404_wp02_crfcond_reg__default(),
         new Object[] {
             new Object[] {
            H00192_A77TBM33_CRF_ID, H00192_A76TBM33_STUDY_ID, H00192_A78TBM33_COND_NO
            }
            , new Object[] {
            H00193_A63TBM21_STUDY_ID, H00193_A367TBM21_STUDY_NM, H00193_n367TBM21_STUDY_NM
            }
            , new Object[] {
            H00194_A55TAM07_USER_ID, H00194_A205TAM07_USER_NM, H00194_n205TAM07_USER_NM
            }
            , new Object[] {
            H00195_A55TAM07_USER_ID, H00195_A205TAM07_USER_NM, H00195_n205TAM07_USER_NM
            }
            , new Object[] {
            H00196_A68TBM31_STUDY_ID, H00196_A397TBM31_DEL_FLG, H00196_n397TBM31_DEL_FLG, H00196_A69TBM31_CRF_ID, H00196_A393TBM31_CRF_NM, H00196_n393TBM31_CRF_NM, H00196_A395TBM31_ORDER, H00196_n395TBM31_ORDER
            }
            , new Object[] {
            H00197_A38TBM36_SELECT_CRF_ID, H00197_A37TBM36_COND_NO, H00197_A36TBM36_CRF_ID, H00197_A35TBM36_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV50Pgmname = "B404_WP02_CRFCOND_REG" ;
      AV49Pgmdesc = "CRF選択条件登録" ;
      /* GeneXus formulas. */
      AV50Pgmname = "B404_WP02_CRFCOND_REG" ;
      AV49Pgmdesc = "CRF選択条件登録" ;
      Gx_err = (short)(0) ;
      edtavCtltbm33_study_id_Enabled = 0 ;
      edtavD_tbm21_study_nm_Enabled = 0 ;
      edtavCtltbm33_cond_no_Enabled = 0 ;
      edtavCtltbm31_crf_nm_Enabled = 0 ;
      edtavCtltbm33_crt_datetime_Enabled = 0 ;
      edtavCtltbm33_upd_datetime_Enabled = 0 ;
      edtavD_crt_user_nm_Enabled = 0 ;
      edtavD_upd_user_nm_Enabled = 0 ;
      edtavCtltbm33_crt_prog_nm_Enabled = 0 ;
      edtavCtltbm33_upd_prog_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV51GXLvl138 ;
   private byte AV27W_ERR_CD ;
   private byte GXv_int3[] ;
   private byte AV55GXLvl420 ;
   private byte AV56GXLvl435 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavCtltbm33_expression_Backstyle ;
   private byte edtavCtltbm33_cond_nm_Backstyle ;
   private byte GRID1_nEOF ;
   private short wcpOAV16P_CRF_ID ;
   private short wcpOAV15P_COND_NO ;
   private short nRC_GXsfl_68 ;
   private short nGXsfl_68_idx=1 ;
   private short AV16P_CRF_ID ;
   private short AV15P_COND_NO ;
   private short A69TBM31_CRF_ID ;
   private short A36TBM36_CRF_ID ;
   private short A37TBM36_COND_NO ;
   private short A38TBM36_SELECT_CRF_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short AV41GXV6 ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_68_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_68_fel_idx=1 ;
   private short A77TBM33_CRF_ID ;
   private short A78TBM33_COND_NO ;
   private int A395TBM31_ORDER ;
   private int subGrid1_Islastpage ;
   private int subGrid1_Width ;
   private int edtavCtltbm33_study_id_Enabled ;
   private int edtavD_tbm21_study_nm_Enabled ;
   private int edtavCtltbm33_cond_no_Enabled ;
   private int edtavCtltbm31_crf_nm_Enabled ;
   private int edtavCtltbm33_crt_datetime_Enabled ;
   private int edtavCtltbm33_upd_datetime_Enabled ;
   private int edtavD_crt_user_nm_Enabled ;
   private int edtavD_upd_user_nm_Enabled ;
   private int edtavCtltbm33_crt_prog_nm_Enabled ;
   private int edtavCtltbm33_upd_prog_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV52GXV14 ;
   private int edtavCtltbm33_cond_nm_Backcolor ;
   private int edtavCtltbm33_expression_Backcolor ;
   private int AV53GXV15 ;
   private int edtavCtltbm33_cond_no_Visible ;
   private int edtavCtltbm33_crt_datetime_Visible ;
   private int edtavCtltbm33_upd_datetime_Visible ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_upd_Visible ;
   private int lblTxt_btn_dlt_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private long wcpOAV17P_STUDY_ID ;
   private long AV17P_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A35TBM36_STUDY_ID ;
   private long A76TBM33_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_68_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV50Pgmname ;
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
   private String edtavCtltbm31_crf_nm_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV49Pgmdesc ;
   private String edtavCtltbm33_study_id_Internalname ;
   private String edtavD_tbm21_study_nm_Internalname ;
   private String edtavCtltbm33_cond_no_Internalname ;
   private String edtavCtltbm33_crt_datetime_Internalname ;
   private String edtavCtltbm33_upd_datetime_Internalname ;
   private String edtavD_crt_user_nm_Internalname ;
   private String edtavD_upd_user_nm_Internalname ;
   private String edtavCtltbm33_crt_prog_nm_Internalname ;
   private String edtavCtltbm33_upd_prog_nm_Internalname ;
   private String edtavCtltbm33_cond_nm_Internalname ;
   private String edtavCtltbm33_prior_no_Internalname ;
   private String edtavCtltbm33_expression_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavW_sys_crfid_Internalname ;
   private String edtavCtltbm33_crf_id_Internalname ;
   private String sGXsfl_68_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_dlt_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavW_sys_crfid_Jsonclick ;
   private String edtavCtltbm33_crf_id_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable12_Internalname ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtavCtltbm33_crt_datetime_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtavCtltbm33_upd_datetime_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtavD_crt_user_nm_Jsonclick ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String edtavD_upd_user_nm_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtavCtltbm33_crt_prog_nm_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtavCtltbm33_upd_prog_nm_Jsonclick ;
   private String tblTable10_Internalname ;
   private String imgImage10_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String divSection1_Internalname ;
   private String edtavCtltbm33_study_id_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtavD_tbm21_study_nm_Jsonclick ;
   private String imgImage11_Internalname ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String divSection2_Internalname ;
   private String edtavCtltbm33_cond_no_Jsonclick ;
   private String imgImage12_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtavCtltbm33_cond_nm_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtavCtltbm33_prior_no_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String subGrid1_Internalname ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_upd_Jsonclick ;
   private String lblTxt_btn_dlt_Jsonclick ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String divSection3_Internalname ;
   private String ROClassString ;
   private String edtavCtltbm31_crf_nm_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime7 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV29W_ERRFLG ;
   private boolean AV26W_DEL_FLG ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n205TAM07_USER_NM ;
   private boolean gx_BV68 ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n395TBM31_ORDER ;
   private boolean GXt_boolean9 ;
   private boolean GXv_boolean10[] ;
   private String AV6C_APP_ID ;
   private String A367TBM21_STUDY_NM ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String AV24W_A821_JS ;
   private String AV23W_A819_JS ;
   private String A397TBM31_DEL_FLG ;
   private String A393TBM31_CRF_NM ;
   private String AV10D_TBM21_STUDY_NM ;
   private String AV8D_CRT_USER_NM ;
   private String AV11D_UPD_USER_NM ;
   private String AV12H_INIT_FLG ;
   private String AV14H_MODE ;
   private String AV13H_KNGN_FLG ;
   private String AV32W_SYS_CRFID ;
   private String AV7C_GAMEN_TITLE ;
   private String AV31W_MSG ;
   private String AV30W_ERRMSG ;
   private String AV33W_NC_CRFID ;
   private String AV28W_ERRCD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTBM33_CRF_COND AV5BC_CRF_COND ;
   private ICheckbox chkavCtlcheck ;
   private IDataStoreProvider pr_default ;
   private short[] H00192_A77TBM33_CRF_ID ;
   private long[] H00192_A76TBM33_STUDY_ID ;
   private short[] H00192_A78TBM33_COND_NO ;
   private long[] H00193_A63TBM21_STUDY_ID ;
   private String[] H00193_A367TBM21_STUDY_NM ;
   private boolean[] H00193_n367TBM21_STUDY_NM ;
   private String[] H00194_A55TAM07_USER_ID ;
   private String[] H00194_A205TAM07_USER_NM ;
   private boolean[] H00194_n205TAM07_USER_NM ;
   private String[] H00195_A55TAM07_USER_ID ;
   private String[] H00195_A205TAM07_USER_NM ;
   private boolean[] H00195_n205TAM07_USER_NM ;
   private long[] H00196_A68TBM31_STUDY_ID ;
   private String[] H00196_A397TBM31_DEL_FLG ;
   private boolean[] H00196_n397TBM31_DEL_FLG ;
   private short[] H00196_A69TBM31_CRF_ID ;
   private String[] H00196_A393TBM31_CRF_NM ;
   private boolean[] H00196_n393TBM31_CRF_NM ;
   private int[] H00196_A395TBM31_ORDER ;
   private boolean[] H00196_n395TBM31_ORDER ;
   private short[] H00197_A38TBM36_SELECT_CRF_ID ;
   private short[] H00197_A37TBM36_COND_NO ;
   private short[] H00197_A36TBM36_CRF_ID ;
   private long[] H00197_A35TBM36_STUDY_ID ;
   private GxObjectCollection AV9D_GRID_CRFCOND_REG ;
   private GxObjectCollection AV18W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem4[] ;
   private GxObjectCollection AV21W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem5[] ;
   private SdtB404_SD02_CRFCOND_REG_Item AV25W_CRFCOND_REG_ITEM ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV19W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV22W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b404_wp02_crfcond_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00192", "SELECT `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE (`TBM33_STUDY_ID` = ?) AND (`TBM33_CRF_ID` = ?) ORDER BY `TBM33_STUDY_ID` DESC, `TBM33_CRF_ID` DESC, `TBM33_COND_NO` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00193", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00194", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00195", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00196", "SELECT `TBM31_STUDY_ID`, `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_CRF_NM`, `TBM31_ORDER` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_CRF_ID` <> ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_ORDER`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00197", "SELECT `TBM36_SELECT_CRF_ID`, `TBM36_COND_NO`, `TBM36_CRF_ID`, `TBM36_STUDY_ID` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` = ? and `TBM36_COND_NO` = ? and `TBM36_SELECT_CRF_ID` = ? ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
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
               stmt.setVarchar(2, (String)parms[1], 100);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 100);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

