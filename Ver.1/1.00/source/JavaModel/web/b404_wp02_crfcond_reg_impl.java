/*
               File: b404_wp02_crfcond_reg_impl
        Description: CRF選択条件登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:3:23.22
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
            nGXsfl_66_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_66_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_66_idx, sGXsfl_66_idx) ;
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
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         pa172( ) ;
         if ( ! httpContext.isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            ws172( ) ;
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               we172( ) ;
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
      httpContext.writeText( "CRF選択条件登録") ;
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
      httpContext.AddJavascriptSource("calendar.js", "?58720");
      httpContext.AddJavascriptSource("calendar-setup.js", "?58720");
      httpContext.AddJavascriptSource("calendar-ja.js", "?58720");
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,false,false)\" onkeydown=\"gx.evt.onkeypress(null,false,false)\"" ;
      httpContext.writeText( "<body") ;
      httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;") ;
      httpContext.writeText( "\""+FormProcess+">") ;
      httpContext.skipLines( 1 );
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_CRF_ID,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV15P_COND_NO,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("b404_wp02_crfcond_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm172( )
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
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV17P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_CRF_ID", GXutil.ltrim( localUtil.ntoc( AV16P_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_COND_NO", GXutil.ltrim( localUtil.ntoc( AV15P_COND_NO, (byte)(4), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vD_GRID_CRFCOND_REG", AV9D_GRID_CRFCOND_REG);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vD_GRID_CRFCOND_REG", AV9D_GRID_CRFCOND_REG);
      }
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

   public void wb170( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_172( true) ;
      }
      else
      {
         wb_table1_2_172( false) ;
      }
      return  ;
   }

   public void wb_table1_2_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_106_172( true) ;
      }
      else
      {
         wb_table2_106_172( false) ;
      }
      return  ;
   }

   public void wb_table2_106_172e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start172( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "CRF選択条件登録", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0104") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0104", "");
         }
      }
      wbErr = false ;
      strup170( ) ;
   }

   public void ws172( )
   {
      start172( ) ;
      evt172( ) ;
   }

   public void evt172( )
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
                        /* Execute user event: e11172 */
                        e11172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12172 */
                        e12172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13172 */
                        e13172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14172 */
                        e14172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15172 */
                        e15172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16172 */
                        e16172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DLT_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e17172 */
                        e17172 ();
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
                        nGXsfl_66_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
                        chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_66_idx );
                        edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_66_idx ;
                        AV41GXV6 = nGXsfl_66_idx ;
                        if ( AV9D_GRID_CRFCOND_REG.size() >= AV41GXV6 )
                        {
                           Currentitem0 = (((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)));
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
                        OldWebcomp2 = httpContext.cgiGet( "W0104") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0104", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0104") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0104", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e18172 */
                              e18172 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e19172 */
                              e19172 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e20172 */
                              e20172 ();
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
                  else if ( nCmpId == 104 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0104") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0104", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we172( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm172( ) ;
         }
      }
   }

   public void pa172( )
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
         GXCCtl = "CTLCHECK_" + sGXsfl_66_idx ;
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

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_66_idx ,
                                 String sGXsfl_66_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_66_idx );
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_66_idx ;
      while ( nGXsfl_66_idx <= nRC_Grid1 )
      {
         sendrow_662( ) ;
         nGXsfl_66_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_66_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_66_idx+1)) ;
         sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
         chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_66_idx );
         edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_66_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf172( ) ;
      /* End function Refresh */
   }

   public void rf172( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(66) ;
      nGXsfl_66_idx = (short)(1) ;
      sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_66_idx );
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_66_idx ;
      /* Execute user event: e19172 */
      e19172 ();
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
         chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_66_idx );
         edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_66_idx ;
         /* Execute user event: e20172 */
         e20172 ();
         wbEnd = (short)(66) ;
         wb170( ) ;
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
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public void strup170( )
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
      /* Execute user event: e18172 */
      e18172 ();
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_prior_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_prior_no_Internalname), ".", ",") > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBM33_PRIOR_NO");
            GX_FocusControl = edtavCtltbm33_prior_no_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( (byte)(0) );
         }
         else
         {
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCtltbm33_prior_no_Internalname), ".", ",")) );
         }
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression( httpContext.cgiGet( edtavCtltbm33_expression_Internalname) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm33_crt_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "CTLTBM33_CRT_DATETIME");
            GX_FocusControl = edtavCtltbm33_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbm33_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbm33_upd_datetime_Internalname), (byte)(6), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "CTLTBM33_UPD_DATETIME");
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
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0104") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0104", "");
         }
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         nGXsfl_66_fel_idx = (short)(0) ;
         while ( nGXsfl_66_fel_idx < nRC_Grid1 )
         {
            nGXsfl_66_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_66_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_66_fel_idx+1)) ;
            sGXsfl_66_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_fel_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_66_fel_idx );
            edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_66_fel_idx ;
            AV41GXV6 = nGXsfl_66_fel_idx ;
            AV41GXV6 = nGXsfl_66_fel_idx ;
            if ( AV9D_GRID_CRFCOND_REG.size() >= AV41GXV6 )
            {
               Currentitem0 = (((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)));
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
            OldWebcomp2 = httpContext.cgiGet( "W0104") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0104", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0104") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0104", "");
            }
            Currentitem0 = (((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)));
         }
         if ( nGXsfl_66_fel_idx == 0 )
         {
            nGXsfl_66_idx = (short)(1) ;
            sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
            chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_66_idx );
            edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_66_idx ;
         }
         nGXsfl_66_fel_idx = (short)(1) ;
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
      /* Execute user event: e18172 */
      e18172 ();
      if (returnInSub) return;
   }

   public void e18172( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B404" ;
      AV7C_GAMEN_TITLE = AV49Pgmdesc ;
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV20W_A_LOGIN_SDT,AV6C_APP_ID,AV7C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0104",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e19172( )
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

   private void e20172( )
   {
      /* Grid1_Load Routine */
      AV41GXV6 = (short)(1) ;
      while ( AV41GXV6 <= AV9D_GRID_CRFCOND_REG.size() )
      {
         Currentitem0 = ( ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9D_GRID_CRFCOND_REG", AV9D_GRID_CRFCOND_REG);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(66) ;
         }
         sendrow_662( ) ;
         AV41GXV6 = (short)(AV41GXV6+1) ;
      }
   }

   public void e11172( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "0") == 0 )
         {
            AV29W_ERRFLG = false ;
            /* Execute user subroutine: S162 */
            S162 ();
            if (returnInSub) return;
            if ( ! AV29W_ERRFLG )
            {
               GXt_char2 = AV31W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char3) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV31W_MSG = GXt_char2 ;
               GXt_char2 = AV24W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV31W_MSG, "", "BTN_REG_EXEC", "", GXv_char3) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV24W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e15172( )
   {
      /* 'BTN_REG_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV13H_KNGN_FLG, "") )
      {
         AV51GXLvl138 = (byte)(0) ;
         /* Using cursor H00172 */
         pr_default.execute(0, new Object[] {new Long(AV17P_STUDY_ID), AV32W_SYS_CRFID});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A247TBM33_CRF_ID = H00172_A247TBM33_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
            A246TBM33_STUDY_ID = H00172_A246TBM33_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
            A248TBM33_COND_NO = H00172_A248TBM33_COND_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
            AV51GXLvl138 = (byte)(1) ;
            AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( (short)(A248TBM33_COND_NO+1) );
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
            GXv_char3[0] = AV30W_ERRMSG ;
            new b404_pc01_tbm36_reg(remoteHandle, context).execute( "0", AV5BC_CRF_COND, AV9D_GRID_CRFCOND_REG, AV32W_SYS_CRFID, GXv_char3) ;
            b404_wp02_crfcond_reg_impl.this.AV30W_ERRMSG = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
            if ( (GXutil.strcmp("", AV30W_ERRMSG)==0) )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               GXKey = context.getSiteKey( ) ;
               GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) ;
               httpContext.wjLoc = formatLink("b404_wp02_crfcond_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
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
            GXt_char2 = AV31W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF_COND.GetMessages(), (byte)(0), GXv_char3) ;
            b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV31W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV31W_MSG);
         }
      }
   }

   public void e12172( )
   {
      /* 'BTN_UPD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            AV29W_ERRFLG = false ;
            /* Execute user subroutine: S162 */
            S162 ();
            if (returnInSub) return;
            if ( ! AV29W_ERRFLG )
            {
               GXt_char2 = AV31W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char3) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV31W_MSG = GXt_char2 ;
               GXt_char2 = AV24W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV31W_MSG, "", "BTN_UPD_EXEC", "", GXv_char3) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV24W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e16172( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "UPD", AV13H_KNGN_FLG, "") )
      {
         AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( AV50Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
         AV5BC_CRF_COND.Save();
         if ( AV5BC_CRF_COND.Success() )
         {
            GXv_char3[0] = AV30W_ERRMSG ;
            new b404_pc01_tbm36_reg(remoteHandle, context).execute( "1", AV5BC_CRF_COND, AV9D_GRID_CRFCOND_REG, AV32W_SYS_CRFID, GXv_char3) ;
            b404_wp02_crfcond_reg_impl.this.AV30W_ERRMSG = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
            if ( (GXutil.strcmp("", AV30W_ERRMSG)==0) )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               GXKey = context.getSiteKey( ) ;
               GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) ;
               httpContext.wjLoc = formatLink("b404_wp01_crfcond_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
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
            GXt_char2 = AV31W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF_COND.GetMessages(), (byte)(0), GXv_char3) ;
            b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV31W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV31W_MSG);
         }
      }
   }

   public void e13172( )
   {
      /* 'BTN_DLT' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV13H_KNGN_FLG, "") )
      {
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            AV29W_ERRFLG = false ;
            /* Execute user subroutine: S162 */
            S162 ();
            if (returnInSub) return;
            if ( ! AV29W_ERRFLG )
            {
               GXt_char2 = AV31W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char3) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV31W_MSG = GXt_char2 ;
               GXt_char2 = AV24W_A821_JS ;
               GXv_char3[0] = GXt_char2 ;
               new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV31W_MSG, "", "BTN_DLT_EXEC", "", GXv_char3) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV24W_A821_JS = GXt_char2 ;
            }
         }
      }
   }

   public void e17172( )
   {
      /* 'BTN_DLT_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "DLT", AV13H_KNGN_FLG, "") )
      {
         GXv_char3[0] = AV30W_ERRMSG ;
         new b404_pc01_tbm36_reg(remoteHandle, context).execute( "2", AV5BC_CRF_COND, AV9D_GRID_CRFCOND_REG, AV32W_SYS_CRFID, GXv_char3) ;
         b404_wp02_crfcond_reg_impl.this.AV30W_ERRMSG = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
         if ( (GXutil.strcmp("", AV30W_ERRMSG)==0) )
         {
            AV5BC_CRF_COND.Delete();
            if ( AV5BC_CRF_COND.Success() )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               GXKey = context.getSiteKey( ) ;
               GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) ;
               httpContext.wjLoc = formatLink("b404_wp01_crfcond_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            }
            else
            {
               Application.rollback(context, remoteHandle, "DEFAULT", "b404_wp02_crfcond_reg");
               GXt_char2 = AV31W_MSG ;
               GXv_char3[0] = GXt_char2 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_CRF_COND.GetMessages(), (byte)(0), GXv_char3) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               AV31W_MSG = GXt_char2 ;
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

   public void e14172( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV17P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b404_wp01_crfcond_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void S162( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      GXv_int4[0] = AV27W_ERR_CD ;
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5[0] = AV18W_A_CHK_RESULT_SDT ;
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6[0] = AV21W_A_RESULT_MSG_SDT ;
      new b404_pc02_crfcond_chk(remoteHandle, context).execute( AV5BC_CRF_COND, AV26W_DEL_FLG, GXv_int4, GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5, GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6) ;
      b404_wp02_crfcond_reg_impl.this.AV27W_ERR_CD = GXv_int4[0] ;
      AV18W_A_CHK_RESULT_SDT = GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5[0] ;
      AV21W_A_RESULT_MSG_SDT = GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6[0] ;
      if ( AV27W_ERR_CD == 1 )
      {
         AV29W_ERRFLG = true ;
      }
      if ( AV21W_A_RESULT_MSG_SDT.size() > 0 )
      {
         AV52GXV14 = 1 ;
         while ( AV52GXV14 <= AV21W_A_RESULT_MSG_SDT.size() )
         {
            AV22W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)((SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)AV21W_A_RESULT_MSG_SDT.elementAt(-1+AV52GXV14));
            httpContext.GX_msglist.addItem(AV22W_A_RESULT_MSG_SDT_ITEM.getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
            AV52GXV14 = (int)(AV52GXV14+1) ;
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
      while ( AV53GXV15 <= AV18W_A_CHK_RESULT_SDT.size() )
      {
         AV19W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)((SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)AV18W_A_CHK_RESULT_SDT.elementAt(-1+AV53GXV15));
         /* Execute user subroutine: S192 */
         S192 ();
         if (returnInSub) return;
         AV53GXV15 = (int)(AV53GXV15+1) ;
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
         }
      }
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H00173 */
      pr_default.execute(1, new Object[] {new Long(AV17P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A186TBM21_STUDY_ID = H00173_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A187TBM21_STUDY_NM = H00173_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = H00173_n187TBM21_STUDY_NM[0] ;
         GXt_char2 = AV10D_TBM21_STUDY_NM ;
         GXv_char3[0] = GXt_char2 ;
         new a803_pc01_htmlescape(remoteHandle, context).execute( A187TBM21_STUDY_NM, GXv_char3) ;
         b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         AV10D_TBM21_STUDY_NM = GXt_char2 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_TBM21_STUDY_NM", AV10D_TBM21_STUDY_NM);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      GXt_char2 = AV32W_SYS_CRFID ;
      GXv_char3[0] = GXt_char2 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "016", GXv_char3) ;
      b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
      AV32W_SYS_CRFID = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
      if ( ! (0==AV17P_STUDY_ID) && ! (0==AV16P_CRF_ID) && ! (0==AV15P_COND_NO) )
      {
         AV14H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         AV5BC_CRF_COND.Load(AV17P_STUDY_ID, AV16P_CRF_ID, AV15P_COND_NO);
         if ( AV5BC_CRF_COND.Fail() )
         {
            GXt_char2 = AV31W_MSG ;
            GXv_char3[0] = GXt_char2 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char3) ;
            b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
            AV31W_MSG = GXt_char2 ;
            httpContext.GX_msglist.addItem(AV31W_MSG);
         }
         else
         {
            AV55GXLvl420 = (byte)(0) ;
            /* Using cursor H00174 */
            pr_default.execute(2, new Object[] {AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id()});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A8TAM07_USER_ID = H00174_A8TAM07_USER_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
               A2TAM07_USER_NM = H00174_A2TAM07_USER_NM[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               n2TAM07_USER_NM = H00174_n2TAM07_USER_NM[0] ;
               AV55GXLvl420 = (byte)(1) ;
               GXt_char2 = AV8D_CRT_USER_NM ;
               GXv_char3[0] = GXt_char2 ;
               new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
               b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
               AV8D_CRT_USER_NM = GXt_char2 ;
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
               /* Using cursor H00175 */
               pr_default.execute(3, new Object[] {AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id()});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A8TAM07_USER_ID = H00175_A8TAM07_USER_ID[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
                  A2TAM07_USER_NM = H00175_A2TAM07_USER_NM[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  n2TAM07_USER_NM = H00175_n2TAM07_USER_NM[0] ;
                  AV56GXLvl435 = (byte)(1) ;
                  GXt_char2 = AV11D_UPD_USER_NM ;
                  GXv_char3[0] = GXt_char2 ;
                  new a803_pc01_htmlescape(remoteHandle, context).execute( A2TAM07_USER_NM, GXv_char3) ;
                  b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
                  AV11D_UPD_USER_NM = GXt_char2 ;
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
      gx_BV66 = true ;
      GXt_char2 = AV33W_NC_CRFID ;
      GXv_char3[0] = GXt_char2 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "004", GXv_char3) ;
      b404_wp02_crfcond_reg_impl.this.GXt_char2 = GXv_char3[0] ;
      AV33W_NC_CRFID = GXt_char2 ;
      /* Using cursor H00176 */
      pr_default.execute(4, new Object[] {new Long(AV17P_STUDY_ID), AV33W_NC_CRFID});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A217TBM31_STUDY_ID = H00176_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A223TBM31_DEL_FLG = H00176_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = H00176_n223TBM31_DEL_FLG[0] ;
         A218TBM31_CRF_ID = H00176_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         A219TBM31_CRF_NM = H00176_A219TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A219TBM31_CRF_NM", A219TBM31_CRF_NM);
         n219TBM31_CRF_NM = H00176_n219TBM31_CRF_NM[0] ;
         A221TBM31_ORDER = H00176_A221TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TBM31_ORDER", GXutil.ltrim( GXutil.str( A221TBM31_ORDER, 5, 0)));
         n221TBM31_ORDER = H00176_n221TBM31_ORDER[0] ;
         AV25W_CRFCOND_REG_ITEM = (SdtB404_SD02_CRFCOND_REG_Item)new SdtB404_SD02_CRFCOND_REG_Item(remoteHandle, context);
         AV25W_CRFCOND_REG_ITEM.setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check( false );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_CRFCOND_REG_ITEM", AV25W_CRFCOND_REG_ITEM);
         AV25W_CRFCOND_REG_ITEM.setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id( A218TBM31_CRF_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_CRFCOND_REG_ITEM", AV25W_CRFCOND_REG_ITEM);
         AV25W_CRFCOND_REG_ITEM.setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm( A219TBM31_CRF_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_CRFCOND_REG_ITEM", AV25W_CRFCOND_REG_ITEM);
         if ( GXutil.strcmp(AV14H_MODE, "1") == 0 )
         {
            /* Using cursor H00177 */
            pr_default.execute(5, new Object[] {new Long(AV17P_STUDY_ID), new Short(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id()), new Short(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no()), new Short(AV25W_CRFCOND_REG_ITEM.getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id())});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A487TBM36_SELECT_CRF_ID = H00177_A487TBM36_SELECT_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
               A486TBM36_COND_NO = H00177_A486TBM36_COND_NO[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
               A485TBM36_CRF_ID = H00177_A485TBM36_CRF_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
               A484TBM36_STUDY_ID = H00177_A484TBM36_STUDY_ID[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
               AV25W_CRFCOND_REG_ITEM.setgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check( true );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25W_CRFCOND_REG_ITEM", AV25W_CRFCOND_REG_ITEM);
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(5);
         }
         AV9D_GRID_CRFCOND_REG.add(AV25W_CRFCOND_REG_ITEM, 0);
         gx_BV66 = true ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT7[0] = AV20W_A_LOGIN_SDT;
      GXv_char3[0] = AV28W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT7, GXv_char3) ;
      AV20W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT7[0] ;
      b404_wp02_crfcond_reg_impl.this.AV28W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV28W_ERRCD, "0") != 0 )
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
      AV24W_A821_JS = "" ;
      AV23W_A819_JS = "" ;
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
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( (byte)(0) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      GXt_dtime8 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( GXt_dtime8 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_CRF_COND", AV5BC_CRF_COND);
      GXt_dtime8 = GXutil.resetTime( GXutil.nullDate() );
      AV5BC_CRF_COND.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime( GXt_dtime8 );
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
      GXv_char3[0] = AV13H_KNGN_FLG ;
      GXv_char9[0] = AV28W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char3, GXv_char9) ;
      b404_wp02_crfcond_reg_impl.this.AV13H_KNGN_FLG = GXv_char3[0] ;
      b404_wp02_crfcond_reg_impl.this.AV28W_ERRCD = GXv_char9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
      if ( GXutil.strcmp(AV28W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S22643( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV50Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
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
         GXt_boolean10 = false ;
         GXv_boolean11[0] = GXt_boolean10 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "UPD", AV13H_KNGN_FLG, "", GXv_boolean11) ;
         b404_wp02_crfcond_reg_impl.this.GXt_boolean10 = GXv_boolean11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_upd_Visible = (GXt_boolean10 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upd_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upd_Visible, 5, 0)));
         GXt_boolean10 = false ;
         GXv_boolean11[0] = GXt_boolean10 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "DLT", AV13H_KNGN_FLG, "", GXv_boolean11) ;
         b404_wp02_crfcond_reg_impl.this.GXt_boolean10 = GXv_boolean11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_dlt_Visible = (GXt_boolean10 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
      }
      else
      {
         GXt_boolean10 = false ;
         GXv_boolean11[0] = GXt_boolean10 ;
         new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV13H_KNGN_FLG, "", GXv_boolean11) ;
         b404_wp02_crfcond_reg_impl.this.GXt_boolean10 = GXv_boolean11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         lblTxt_btn_reg_Visible = (GXt_boolean10 ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      }
   }

   public void wb_table2_106_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "BTN_REG_EXEC", "", "", lblTextblock2_Jsonclick, "E\\'BTN_REG_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "BTN_UPD_EXEC", "", "", lblTextblock1_Jsonclick, "E\\'BTN_UPD_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "BTN_DLT_EXEC", "", "", lblTextblock3_Jsonclick, "E\\'BTN_DLT_EXEC\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_INIT_FLG", AV12H_INIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV12H_INIT_FLG), GXutil.rtrim( localUtil.format( AV12H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtavH_init_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV14H_MODE", AV14H_MODE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV14H_MODE), GXutil.rtrim( localUtil.format( AV14H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "", "", "", "", edtavH_mode_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_KNGN_FLG", AV13H_KNGN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV13H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV13H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(115);\"", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV32W_SYS_CRFID", AV32W_SYS_CRFID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_sys_crfid_Internalname, GXutil.rtrim( AV32W_SYS_CRFID), GXutil.rtrim( localUtil.format( AV32W_SYS_CRFID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(116);\"", "", "", "", "", edtavW_sys_crfid_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id()", GXutil.ltrim( GXutil.str( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id(), 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_crf_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id(), (byte)(4), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(117);\"", "", "", "", "", edtavCtltbm33_crf_id_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "<br>") ;
         httpContext.writeText( "&nbsp;&nbsp; ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_106_172e( true) ;
      }
      else
      {
         wb_table2_106_172e( false) ;
      }
   }

   public void wb_table1_2_172( boolean wbgen )
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
         wb_table3_6_172( true) ;
      }
      else
      {
         wb_table3_6_172( false) ;
      }
      return  ;
   }

   public void wb_table3_6_172e( boolean wbgen )
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
         wb_table1_2_172e( true) ;
      }
      else
      {
         wb_table1_2_172e( false) ;
      }
   }

   public void wb_table3_6_172( boolean wbgen )
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
         wb_table4_12_172( true) ;
      }
      else
      {
         wb_table4_12_172( false) ;
      }
      return  ;
   }

   public void wb_table4_12_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\"  style=\"height:100%\">") ;
         wb_table5_24_172( true) ;
      }
      else
      {
         wb_table5_24_172( false) ;
      }
      return  ;
   }

   public void wb_table5_24_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0104"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         httpContext.writeText( " id=\""+"gxHTMLWrpW0104"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0104"+"");
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
         wb_table3_6_172e( true) ;
      }
      else
      {
         wb_table3_6_172e( false) ;
      }
   }

   public void wb_table5_24_172( boolean wbgen )
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
         httpContext.writeText( "<td valign=\"bottom\" >") ;
         wb_table6_30_172( true) ;
      }
      else
      {
         wb_table6_30_172( false) ;
      }
      return  ;
   }

   public void wb_table6_30_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_72_172( true) ;
      }
      else
      {
         wb_table7_72_172( false) ;
      }
      return  ;
   }

   public void wb_table7_72_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_24_172e( true) ;
      }
      else
      {
         wb_table5_24_172e( false) ;
      }
   }

   public void wb_table7_72_172( boolean wbgen )
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
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, "作成日時", "", "", lblTextblock67_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime()", localUtil.ttoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm33_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_crt_datetime_Internalname, localUtil.format(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm33_crt_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltbm33_crt_datetime_Visible, edtavCtltbm33_crt_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm33_crt_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltbm33_crt_datetime_Visible==0)||(edtavCtltbm33_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, "更新日時", "", "", lblTextblock72_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime()", localUtil.ttoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime(), 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtltbm33_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_upd_datetime_Internalname, localUtil.format(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime(), "9999/99/99 99:99:99"), "", "", "", "", "", edtavCtltbm33_upd_datetime_Jsonclick, 0, ClassString, StyleString, "", edtavCtltbm33_upd_datetime_Visible, edtavCtltbm33_upd_datetime_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltbm33_upd_datetime_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtavCtltbm33_upd_datetime_Visible==0)||(edtavCtltbm33_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, "作成ユーザー名", "", "", lblTextblock70_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_CRT_USER_NM", AV8D_CRT_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_crt_user_nm_Internalname, GXutil.rtrim( AV8D_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV8D_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtavD_crt_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_crt_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, "更新ユーザー名", "", "", lblTextblock73_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_UPD_USER_NM", AV11D_UPD_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_upd_user_nm_Internalname, GXutil.rtrim( AV11D_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV11D_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(92);\"", "", "", "", "", edtavD_upd_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_upd_user_nm_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, "作成プログラムID", "", "", lblTextblock71_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm()", AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_crt_prog_nm_Internalname, GXutil.rtrim( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm(), "")), "", "", "", "", "", edtavCtltbm33_crt_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm33_crt_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, "更新プログラムID", "", "", lblTextblock74_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm()", AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm());
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_upd_prog_nm_Internalname, GXutil.rtrim( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm(), "")), "", "", "", "", "", edtavCtltbm33_upd_prog_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm33_upd_prog_nm_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_72_172e( true) ;
      }
      else
      {
         wb_table7_72_172e( false) ;
      }
   }

   public void wb_table6_30_172( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgImage10_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:350px\">") ;
         httpContext.writeText( "<div style=\"WIDTH: 345px\" class=\"SectionWordBreak\" id=\"Section1\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id()", GXutil.ltrim( GXutil.str( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id(), 10, 0)));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id(), (byte)(10), (byte)(0), ".", "")), ((edtavCtltbm33_study_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id()), "ZZZZZZZZZ9")), "", "", "", "", "", edtavCtltbm33_study_id_Jsonclick, 0, ClassString, StyleString, "", 1, edtavCtltbm33_study_id_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "&nbsp;", "", "", lblTextblock4_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_B404_WP02_CRFCOND_REG.htm");
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_TBM21_STUDY_NM", AV10D_TBM21_STUDY_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tbm21_study_nm_Internalname, GXutil.rtrim( AV10D_TBM21_STUDY_NM), GXutil.rtrim( localUtil.format( AV10D_TBM21_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(40);\"", "", "", "", "", edtavD_tbm21_study_nm_Jsonclick, 0, ClassString, StyleString, "", 1, edtavD_tbm21_study_nm_Enabled, 0, 20, "chr", 1, "row", 100, (byte)(0), (short)(1), 0, (byte)(1), (byte)(1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage11_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "条件番号", "", "", lblTextblock17_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "<div style=\"WIDTH: 360px\" class=\"SectionWordBreak\" id=\"Section2\">") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no()", GXutil.ltrim( GXutil.str( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no(), 4, 0)));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_cond_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no(), (byte)(4), (byte)(0), ".", "")), ((edtavCtltbm33_cond_no_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no()), "ZZZ9")), "", "", "", "", "", edtavCtltbm33_cond_no_Jsonclick, 0, ClassString, StyleString, "", edtavCtltbm33_cond_no_Visible, edtavCtltbm33_cond_no_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage12_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", 1, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "条件名", "", "", lblTextblock18_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm()", AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm33_cond_nm_Backcolor) + ";" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_cond_nm_Internalname, GXutil.rtrim( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm()), GXutil.rtrim( localUtil.format( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(51);\"", "", "", "", "", edtavCtltbm33_cond_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "優先順", "", "", lblTextblock46_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no()", GXutil.ltrim( GXutil.str( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no(), 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "AttributeNum" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltbm33_prior_no_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no(), (byte)(2), (byte)(0), ".", "")), ((1!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no()), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no()), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(56);\"", "", "", "", "", edtavCtltbm33_prior_no_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, "判定ロジック", "", "", lblTextblock49_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression()", AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression());
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_66_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm33_expression_Backcolor) + ";" ;
         ClassString = "Attribute" ;
         StyleString = "background:" + WebUtils.getHTMLColor( edtavCtltbm33_expression_Backcolor) + ";" ;
         GxWebStd.gx_html_textarea( httpContext, edtavCtltbm33_expression_Internalname, GXutil.rtrim( AV5BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression()), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(61);\"", (short)(0), 1, 1, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "選択CRF", "", "", lblTextblock44_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"66\">") ;
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
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbm31_crf_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "true");
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", "true");
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 66 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_66_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV41GXV6 = nGXsfl_66_idx ;
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
         wb_table6_30_172e( true) ;
      }
      else
      {
         wb_table6_30_172e( false) ;
      }
   }

   public void wb_table4_12_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "E\\'BTN_REG\\'.", StyleString, ClassString, 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "E\\'BTN_UPD\\'.", StyleString, ClassString, 5, "", lblTxt_btn_upd_Visible, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "削除（F6）", "", "", lblTxt_btn_dlt_Jsonclick, "E\\'BTN_DLT\\'.", StyleString, ClassString, 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtnList100" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "戻る（F11）", "", "", lblTxt_btn_can_Jsonclick, "E\\'BTN_CAN\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_B404_WP02_CRFCOND_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_172e( true) ;
      }
      else
      {
         wb_table4_12_172e( false) ;
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
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa172( ) ;
      ws172( ) ;
      we172( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1532833");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("b404_wp02_crfcond_reg.js", "?1532833");
      /* End function include_jscripts */
   }

   public void sendrow_662( )
   {
      wb170( ) ;
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
         if ( ((int)(nGXsfl_66_idx/ (double) (1)) % (2)) == 0 )
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
         if ( ( 1 == 0 ) && ( nGXsfl_66_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_66_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)(nGXsfl_66_idx) % (1)) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_66_idx+"\">") ;
            }
         }
      }
      Grid1Row.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""+" style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+";height:30px;width:30px\""});
      /* Check box */
      TempTags = " " + ((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'',false,'"+sGXsfl_66_idx+"',66)\"" : " ") ;
      ClassString = "ReadonlyAttributeImeOff" ;
      StyleString = "" ;
      Grid1Row.AddColumnProperties("checkbox", 1, httpContext.isAjaxCallMode( ), new Object[] {chkavCtlcheck.getInternalname(),GXutil.booltostr( ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)).getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check()),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,TempTags+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(69, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavCtlcheck.getEnabled()!=0)&&(chkavCtlcheck.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(69);\"" : " ")});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      ROClassString = ClassString ;
      Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavCtltbm31_crf_nm_Internalname,GXutil.rtrim( ((SdtB404_SD02_CRFCOND_REG_Item)AV9D_GRID_CRFCOND_REG.elementAt(-1+AV41GXV6)).getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm()),"","","","","","",edtavCtltbm31_crf_nm_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(1),new Integer(edtavCtltbm31_crf_nm_Enabled),new Integer(0),new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(66),new Integer(1),new Integer(1),new Boolean(true),"left"});
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
            if ( ((int)(nGXsfl_66_idx) % (1)) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_66_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_66_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_66_idx+1)) ;
      sGXsfl_66_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_66_idx, 4, 0)), (short)(4), "0") ;
      chkavCtlcheck.setInternalname( "CTLCHECK_"+sGXsfl_66_idx );
      edtavCtltbm31_crf_nm_Internalname = "CTLTBM31_CRF_NM_"+sGXsfl_66_idx ;
      /* End function sendrow_662 */
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
      imgImage11_Internalname = "IMAGE11" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtavCtltbm33_cond_no_Internalname = "CTLTBM33_COND_NO" ;
      imgImage12_Internalname = "IMAGE12" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtavCtltbm33_cond_nm_Internalname = "CTLTBM33_COND_NM" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtavCtltbm33_prior_no_Internalname = "CTLTBM33_PRIOR_NO" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtavCtltbm33_expression_Internalname = "CTLTBM33_EXPRESSION" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
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
      subGrid1_Width = 820 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
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
                  /* Execute user subroutine: S22643 */
                  S22643 ();
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
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV9D_GRID_CRFCOND_REG = new GxObjectCollection(SdtB404_SD02_CRFCOND_REG_Item.class, "B404_SD02_CRFCOND_REG.Item", "SmartEDC_SHIZUOKA", remoteHandle);
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
      Currentitem0 = new SdtB404_SD02_CRFCOND_REG_Item(remoteHandle, context);
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV50Pgmname = "" ;
      AV49Pgmdesc = "" ;
      AV10D_TBM21_STUDY_NM = "" ;
      AV8D_CRT_USER_NM = "" ;
      AV11D_UPD_USER_NM = "" ;
      AV12H_INIT_FLG = "" ;
      AV14H_MODE = "" ;
      AV13H_KNGN_FLG = "" ;
      AV32W_SYS_CRFID = "" ;
      AV6C_APP_ID = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV20W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV31W_MSG = "" ;
      AV24W_A821_JS = "" ;
      scmdbuf = "" ;
      H00172_A247TBM33_CRF_ID = new short[1] ;
      H00172_A246TBM33_STUDY_ID = new long[1] ;
      H00172_A248TBM33_COND_NO = new short[1] ;
      AV30W_ERRMSG = "" ;
      GXv_int4 = new byte [1] ;
      AV18W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5 = new GxObjectCollection [1] ;
      AV21W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6 = new GxObjectCollection [1] ;
      AV22W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV19W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      H00173_A186TBM21_STUDY_ID = new long[1] ;
      H00173_A187TBM21_STUDY_NM = new String[] {""} ;
      H00173_n187TBM21_STUDY_NM = new boolean[] {false} ;
      A187TBM21_STUDY_NM = "" ;
      H00174_A8TAM07_USER_ID = new String[] {""} ;
      H00174_A2TAM07_USER_NM = new String[] {""} ;
      H00174_n2TAM07_USER_NM = new boolean[] {false} ;
      A8TAM07_USER_ID = "" ;
      A2TAM07_USER_NM = "" ;
      H00175_A8TAM07_USER_ID = new String[] {""} ;
      H00175_A2TAM07_USER_NM = new String[] {""} ;
      H00175_n2TAM07_USER_NM = new boolean[] {false} ;
      AV33W_NC_CRFID = "" ;
      H00176_A217TBM31_STUDY_ID = new long[1] ;
      H00176_A223TBM31_DEL_FLG = new String[] {""} ;
      H00176_n223TBM31_DEL_FLG = new boolean[] {false} ;
      H00176_A218TBM31_CRF_ID = new short[1] ;
      H00176_A219TBM31_CRF_NM = new String[] {""} ;
      H00176_n219TBM31_CRF_NM = new boolean[] {false} ;
      H00176_A221TBM31_ORDER = new int[1] ;
      H00176_n221TBM31_ORDER = new boolean[] {false} ;
      A223TBM31_DEL_FLG = "" ;
      A219TBM31_CRF_NM = "" ;
      AV25W_CRFCOND_REG_ITEM = new SdtB404_SD02_CRFCOND_REG_Item(remoteHandle, context);
      H00177_A487TBM36_SELECT_CRF_ID = new short[1] ;
      H00177_A486TBM36_COND_NO = new short[1] ;
      H00177_A485TBM36_CRF_ID = new short[1] ;
      H00177_A484TBM36_STUDY_ID = new long[1] ;
      GXv_SdtA_LOGIN_SDT7 = new SdtA_LOGIN_SDT [1] ;
      AV28W_ERRCD = "" ;
      AV23W_A819_JS = "" ;
      GXt_dtime8 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char3 = new String [1] ;
      GXv_char9 = new String [1] ;
      GXv_boolean11 = new boolean [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      TempTags = "" ;
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
      GXt_char1 = "" ;
      ROClassString = "" ;
      GXt_char2 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b404_wp02_crfcond_reg__default(),
         new Object[] {
             new Object[] {
            H00172_A247TBM33_CRF_ID, H00172_A246TBM33_STUDY_ID, H00172_A248TBM33_COND_NO
            }
            , new Object[] {
            H00173_A186TBM21_STUDY_ID, H00173_A187TBM21_STUDY_NM, H00173_n187TBM21_STUDY_NM
            }
            , new Object[] {
            H00174_A8TAM07_USER_ID, H00174_A2TAM07_USER_NM, H00174_n2TAM07_USER_NM
            }
            , new Object[] {
            H00175_A8TAM07_USER_ID, H00175_A2TAM07_USER_NM, H00175_n2TAM07_USER_NM
            }
            , new Object[] {
            H00176_A217TBM31_STUDY_ID, H00176_A223TBM31_DEL_FLG, H00176_n223TBM31_DEL_FLG, H00176_A218TBM31_CRF_ID, H00176_A219TBM31_CRF_NM, H00176_n219TBM31_CRF_NM, H00176_A221TBM31_ORDER, H00176_n221TBM31_ORDER
            }
            , new Object[] {
            H00177_A487TBM36_SELECT_CRF_ID, H00177_A486TBM36_COND_NO, H00177_A485TBM36_CRF_ID, H00177_A484TBM36_STUDY_ID
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
   private byte AV51GXLvl138 ;
   private byte AV27W_ERR_CD ;
   private byte GXv_int4[] ;
   private byte AV55GXLvl420 ;
   private byte AV56GXLvl435 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavCtltbm33_expression_Backstyle ;
   private byte edtavCtltbm33_cond_nm_Backstyle ;
   private short wcpOAV16P_CRF_ID ;
   private short wcpOAV15P_COND_NO ;
   private short nRC_Grid1 ;
   private short nGXsfl_66_idx=1 ;
   private short AV16P_CRF_ID ;
   private short AV15P_COND_NO ;
   private short wbEnd ;
   private short wbStart ;
   private short AV41GXV6 ;
   private short nCmpId ;
   private short Gx_err ;
   private short nGXsfl_66_fel_idx=1 ;
   private short A247TBM33_CRF_ID ;
   private short A248TBM33_COND_NO ;
   private short A218TBM31_CRF_ID ;
   private short A487TBM36_SELECT_CRF_ID ;
   private short A486TBM36_COND_NO ;
   private short A485TBM36_CRF_ID ;
   private short subGrid1_Borderwidth ;
   private int subGrid1_Islastpage ;
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
   private int A221TBM31_ORDER ;
   private int GXActiveErrHndl ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_upd_Visible ;
   private int lblTxt_btn_dlt_Visible ;
   private int subGrid1_Width ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private long wcpOAV17P_STUDY_ID ;
   private long AV17P_STUDY_ID ;
   private long A246TBM33_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private long A484TBM36_STUDY_ID ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_66_idx="0001" ;
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
   private String edtavCtltbm31_crf_nm_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV50Pgmname ;
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
   private String sGXsfl_66_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String GXv_char3[] ;
   private String GXv_char9[] ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_dlt_Internalname ;
   private String sStyleString ;
   private String ClassString ;
   private String StyleString ;
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
   private String edtavCtltbm33_study_id_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtavD_tbm21_study_nm_Jsonclick ;
   private String imgImage11_Internalname ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
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
   private String GXt_char1 ;
   private String ROClassString ;
   private String edtavCtltbm31_crf_nm_Jsonclick ;
   private String GXt_char2 ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime8 ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV29W_ERRFLG ;
   private boolean AV26W_DEL_FLG ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n2TAM07_USER_NM ;
   private boolean gx_BV66 ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n219TBM31_CRF_NM ;
   private boolean n221TBM31_ORDER ;
   private boolean GXt_boolean10 ;
   private boolean GXv_boolean11[] ;
   private String AV10D_TBM21_STUDY_NM ;
   private String AV8D_CRT_USER_NM ;
   private String AV11D_UPD_USER_NM ;
   private String AV12H_INIT_FLG ;
   private String AV14H_MODE ;
   private String AV13H_KNGN_FLG ;
   private String AV32W_SYS_CRFID ;
   private String AV6C_APP_ID ;
   private String AV7C_GAMEN_TITLE ;
   private String AV31W_MSG ;
   private String AV24W_A821_JS ;
   private String AV30W_ERRMSG ;
   private String A187TBM21_STUDY_NM ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String AV33W_NC_CRFID ;
   private String A223TBM31_DEL_FLG ;
   private String A219TBM31_CRF_NM ;
   private String AV28W_ERRCD ;
   private String AV23W_A819_JS ;
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
   private short[] H00172_A247TBM33_CRF_ID ;
   private long[] H00172_A246TBM33_STUDY_ID ;
   private short[] H00172_A248TBM33_COND_NO ;
   private long[] H00173_A186TBM21_STUDY_ID ;
   private String[] H00173_A187TBM21_STUDY_NM ;
   private boolean[] H00173_n187TBM21_STUDY_NM ;
   private String[] H00174_A8TAM07_USER_ID ;
   private String[] H00174_A2TAM07_USER_NM ;
   private boolean[] H00174_n2TAM07_USER_NM ;
   private String[] H00175_A8TAM07_USER_ID ;
   private String[] H00175_A2TAM07_USER_NM ;
   private boolean[] H00175_n2TAM07_USER_NM ;
   private long[] H00176_A217TBM31_STUDY_ID ;
   private String[] H00176_A223TBM31_DEL_FLG ;
   private boolean[] H00176_n223TBM31_DEL_FLG ;
   private short[] H00176_A218TBM31_CRF_ID ;
   private String[] H00176_A219TBM31_CRF_NM ;
   private boolean[] H00176_n219TBM31_CRF_NM ;
   private int[] H00176_A221TBM31_ORDER ;
   private boolean[] H00176_n221TBM31_ORDER ;
   private short[] H00177_A487TBM36_SELECT_CRF_ID ;
   private short[] H00177_A486TBM36_COND_NO ;
   private short[] H00177_A485TBM36_CRF_ID ;
   private long[] H00177_A484TBM36_STUDY_ID ;
   private GxObjectCollection AV9D_GRID_CRFCOND_REG ;
   private GxObjectCollection AV18W_A_CHK_RESULT_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem5[] ;
   private GxObjectCollection AV21W_A_RESULT_MSG_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem6[] ;
   private SdtB404_SD02_CRFCOND_REG_Item Currentitem0 ;
   private SdtB404_SD02_CRFCOND_REG_Item AV25W_CRFCOND_REG_ITEM ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV19W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV20W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT7[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV22W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b404_wp02_crfcond_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00172", "SELECT `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE (`TBM33_STUDY_ID` = ?) AND (`TBM33_CRF_ID` = ?) ORDER BY `TBM33_STUDY_ID` DESC, `TBM33_CRF_ID` DESC, `TBM33_COND_NO` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00173", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00174", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00175", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00176", "SELECT `TBM31_STUDY_ID`, `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_CRF_NM`, `TBM31_ORDER` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_CRF_ID` <> ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_ORDER`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("H00177", "SELECT `TBM36_SELECT_CRF_ID`, `TBM36_COND_NO`, `TBM36_CRF_ID`, `TBM36_STUDY_ID` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` = ? and `TBM36_COND_NO` = ? and `TBM36_SELECT_CRF_ID` = ? ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               break;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
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
               stmt.setVarchar(2, (String)parms[1], 100);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 100);
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
      }
   }

}

