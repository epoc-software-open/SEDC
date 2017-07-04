/*
               File: a202_wp01_kngn_ptn_reg_impl
        Description: 権限パターンマスタメンテナンス（権限）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:53.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a202_wp01_kngn_ptn_reg_impl extends GXWebPanel
{
   public a202_wp01_kngn_ptn_reg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a202_wp01_kngn_ptn_reg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a202_wp01_kngn_ptn_reg_impl.class ));
   }

   public a202_wp01_kngn_ptn_reg_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radavD_tam05_kngn_flg = new HTMLChoice();
      radavD_grd_menu_tam05_kngn_flg = new HTMLChoice();
      radavD_grd_riyo_tam05_kngn_flg = new HTMLChoice();
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
            nRC_GXsfl_92 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_92_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_92_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_92, nGXsfl_92_idx, sGXsfl_92_idx) ;
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
            AV10P_TAM04_KNGN_PTN_KBN = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10P_TAM04_KNGN_PTN_KBN", AV10P_TAM04_KNGN_PTN_KBN);
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
         pa0R2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws0R2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we0R2( ) ;
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
      httpContext.writeValue( "権限パターンマスタメンテナンス（権限）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317165381");
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
      GXEncryptionTmp = "a202_wp01_kngn_ptn_reg"+GXutil.URLEncode(GXutil.rtrim(AV10P_TAM04_KNGN_PTN_KBN)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a202_wp01_kngn_ptn_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0R2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Bc_kngn_ptn", AV14BC_KNGN_PTN);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Bc_kngn_ptn", AV14BC_KNGN_PTN);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_a202_sd01_appli_kngn_list", AV11W_A202_SD01_APPLI_KNGN_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_a202_sd01_appli_kngn_list", AV11W_A202_SD01_APPLI_KNGN_LIST);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_92", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_92, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV54Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vW_GMN_EDIT_FLG", GXutil.rtrim( AV43W_GMN_EDIT_FLG));
      GxWebStd.gx_hidden_field( httpContext, "vC_TAM02_APP_ID", GXutil.rtrim( AV19C_TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_TAM02_APP_ID", GetHash( "", String.valueOf(AV19C_TAM02_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "vP_TAM04_KNGN_PTN_KBN", GXutil.rtrim( AV10P_TAM04_KNGN_PTN_KBN));
      GxWebStd.gx_hidden_field( httpContext, "vW_IKKATU_FLG", GXutil.rtrim( AV44W_IKKATU_FLG));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_A202_SD01_APPLI_KNGN_LIST", AV11W_A202_SD01_APPLI_KNGN_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_A202_SD01_APPLI_KNGN_LIST", AV11W_A202_SD01_APPLI_KNGN_LIST);
      }
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV38W_A821_JS));
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_ID", GXutil.rtrim( A55TAM07_USER_ID));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBC_KNGN_PTN", AV14BC_KNGN_PTN);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBC_KNGN_PTN", AV14BC_KNGN_PTN);
      }
      GxWebStd.gx_hidden_field( httpContext, "TAM07_USER_NM", GXutil.rtrim( A205TAM07_USER_NM));
      GxWebStd.gx_hidden_field( httpContext, "TAM03_APP_ID", GXutil.rtrim( A12TAM03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM03_APP_NM", GXutil.rtrim( A314TAM03_APP_NM));
      GxWebStd.gx_hidden_field( httpContext, "TAM03_SUB_MENU_FLG", GXutil.rtrim( A315TAM03_SUB_MENU_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TAM04_AUTH_CD", GXutil.rtrim( A13TAM04_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_KNGN_FLG", GXutil.rtrim( A288TAM05_KNGN_FLG));
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
      return "A202_WP01_KNGN_PTN_REG" ;
   }

   public String getPgmdesc( )
   {
      return "権限パターンマスタメンテナンス（権限）" ;
   }

   public void wb0R0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0R2( true) ;
      }
      else
      {
         wb_table1_2_0R2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0R2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "権限パターンマスタメンテナンス（権限）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0151") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0151", "");
         }
      }
      wbErr = false ;
      strup0R0( ) ;
   }

   public void ws0R2( )
   {
      start0R2( ) ;
      evt0R2( ) ;
   }

   public void evt0R2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e110R2 */
                        e110R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120R2 */
                        e120R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130R2 */
                        e130R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140R2 */
                        e140R2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_IKKATU'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150R2 */
                        e150R2 ();
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
                        nGXsfl_92_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_92_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_92_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_922( ) ;
                        AV7D_GRD_TAM03_APP_ID = httpContext.cgiGet( edtavD_grd_tam03_app_id_Internalname) ;
                        AV8D_GRD_TAM03_APP_NM = httpContext.cgiGet( edtavD_grd_tam03_app_nm_Internalname) ;
                        AV5D_GRD_MENU_TAM05_KNGN_FLG = httpContext.cgiGet( radavD_grd_menu_tam05_kngn_flg.getInternalname()) ;
                        AV9D_GRD_TAM03_SUB_MENU_FLG = httpContext.cgiGet( edtavD_grd_tam03_sub_menu_flg_Internalname) ;
                        AV6D_GRD_RIYO_TAM05_KNGN_FLG = httpContext.cgiGet( radavD_grd_riyo_tam05_kngn_flg.getInternalname()) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0151") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0151", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0151") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0151", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e160R2 */
                              e160R2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e170R2 */
                              e170R2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e180R2 */
                              e180R2 ();
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
                  else if ( nCmpId == 151 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0151") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0151", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0R2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0R2( ) ;
         }
      }
   }

   public void pa0R2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "a202_wp01_kngn_ptn_reg")), "a202_wp01_kngn_ptn_reg") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "a202_wp01_kngn_ptn_reg"))) ;
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
                  AV10P_TAM04_KNGN_PTN_KBN = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10P_TAM04_KNGN_PTN_KBN", AV10P_TAM04_KNGN_PTN_KBN);
               }
            }
         }
         radavD_tam05_kngn_flg.setName( "vD_TAM05_KNGN_FLG" );
         radavD_tam05_kngn_flg.setWebtags( "" );
         radavD_tam05_kngn_flg.addItem("1", "閲覧権限", (short)(0));
         radavD_tam05_kngn_flg.addItem("2", "入力権限", (short)(0));
         radavD_tam05_kngn_flg.addItem("0", "利用不可", (short)(0));
         GXCCtl = "vD_GRD_MENU_TAM05_KNGN_FLG_" + sGXsfl_92_idx ;
         radavD_grd_menu_tam05_kngn_flg.setName( GXCCtl );
         radavD_grd_menu_tam05_kngn_flg.setWebtags( "" );
         radavD_grd_menu_tam05_kngn_flg.addItem("1", "表示", (short)(0));
         radavD_grd_menu_tam05_kngn_flg.addItem("0", "非表示", (short)(0));
         GXCCtl = "vD_GRD_RIYO_TAM05_KNGN_FLG_" + sGXsfl_92_idx ;
         radavD_grd_riyo_tam05_kngn_flg.setName( GXCCtl );
         radavD_grd_riyo_tam05_kngn_flg.setWebtags( "" );
         radavD_grd_riyo_tam05_kngn_flg.addItem("1", "閲覧権限", (short)(0));
         radavD_grd_riyo_tam05_kngn_flg.addItem("2", "入力権限", (short)(0));
         radavD_grd_riyo_tam05_kngn_flg.addItem("0", "利用不可", (short)(0));
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_92 ,
                                 short nGXsfl_92_idx ,
                                 String sGXsfl_92_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_922( ) ;
      while ( nGXsfl_92_idx <= nRC_GXsfl_92 )
      {
         sendrow_922( ) ;
         nGXsfl_92_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_92_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_92_idx+1)) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_92_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_922( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf0R2( ) ;
      /* End function Refresh */
   }

   public void rf0R2( )
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
      wbStart = (short)(92) ;
      nGXsfl_92_idx = (short)(1) ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_92_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_922( ) ;
      nGXsfl_92_Refreshing = (short)(1) ;
      /* Execute user event: e170R2 */
      e170R2 ();
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
         subsflControlProps_922( ) ;
         /* Execute user event: e180R2 */
         e180R2 ();
         wbEnd = (short)(92) ;
         wb0R0( ) ;
      }
      nGXsfl_92_Refreshing = (short)(0) ;
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

   public void strup0R0( )
   {
      /* Before Start, stand alone formulas. */
      AV54Pgmname = "A202_WP01_KNGN_PTN_REG" ;
      AV53Pgmdesc = "権限パターンマスタメンテナンス（権限）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_tam03_app_id_Enabled = 0 ;
      edtavD_grd_tam03_app_nm_Enabled = 0 ;
      edtavCtltam04_crt_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_crt_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam04_crt_datetime_Enabled, 5, 0)));
      edtavCtltam04_upd_datetime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_upd_datetime_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam04_upd_datetime_Enabled, 5, 0)));
      edtavD_tam04_crt_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam04_crt_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_tam04_crt_user_nm_Enabled, 5, 0)));
      edtavD_tam04_upd_user_nm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam04_upd_user_nm_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_tam04_upd_user_nm_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e160R2 */
      e160R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Bc_kngn_ptn"), AV14BC_KNGN_PTN);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_a202_sd01_appli_kngn_list"), AV11W_A202_SD01_APPLI_KNGN_LIST);
         /* Read variables values. */
         AV14BC_KNGN_PTN.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd( httpContext.cgiGet( edtavCtltam04_auth_cd_Internalname) );
         AV20D_TAM03_APP_ID = httpContext.cgiGet( edtavD_tam03_app_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20D_TAM03_APP_ID", AV20D_TAM03_APP_ID);
         AV24D_TAM05_KNGN_FLG = httpContext.cgiGet( radavD_tam05_kngn_flg.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24D_TAM05_KNGN_FLG", AV24D_TAM05_KNGN_FLG);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltam04_crt_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTAM04_CRT_DATETIME");
            GX_FocusControl = edtavCtltam04_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14BC_KNGN_PTN.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime( GXutil.nullDate() );
         }
         else
         {
            AV14BC_KNGN_PTN.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltam04_crt_datetime_Internalname)) );
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltam04_upd_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTAM04_UPD_DATETIME");
            GX_FocusControl = edtavCtltam04_upd_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14BC_KNGN_PTN.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime( GXutil.nullDate() );
         }
         else
         {
            AV14BC_KNGN_PTN.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltam04_upd_datetime_Internalname)) );
         }
         AV22D_TAM04_CRT_USER_NM = httpContext.cgiGet( edtavD_tam04_crt_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22D_TAM04_CRT_USER_NM", AV22D_TAM04_CRT_USER_NM);
         AV23D_TAM04_UPD_USER_NM = httpContext.cgiGet( edtavD_tam04_upd_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23D_TAM04_UPD_USER_NM", AV23D_TAM04_UPD_USER_NM);
         AV27H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27H_INIT_FLG", AV27H_INIT_FLG);
         AV28H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28H_KNGN_FLG", AV28H_KNGN_FLG);
         AV29H_MODE = httpContext.cgiGet( edtavH_mode_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29H_MODE", AV29H_MODE);
         AV12W_TAM04_KNGN_PTN_KBN = httpContext.cgiGet( edtavW_tam04_kngn_ptn_kbn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12W_TAM04_KNGN_PTN_KBN", AV12W_TAM04_KNGN_PTN_KBN);
         AV30H_TAM03_APP_ID = httpContext.cgiGet( edtavH_tam03_app_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_TAM03_APP_ID", AV30H_TAM03_APP_ID);
         AV14BC_KNGN_PTN.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id( httpContext.cgiGet( edtavCtltam04_crt_user_id_Internalname) );
         AV14BC_KNGN_PTN.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id( httpContext.cgiGet( edtavCtltam04_upd_user_id_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavW_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavW_cnt_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vW_CNT");
            GX_FocusControl = edtavW_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39W_CNT = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39W_CNT", GXutil.ltrim( GXutil.str( AV39W_CNT, 4, 0)));
         }
         else
         {
            AV39W_CNT = (short)(localUtil.ctol( httpContext.cgiGet( edtavW_cnt_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39W_CNT", GXutil.ltrim( GXutil.str( AV39W_CNT, 4, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_92 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_92"), ".", ",")) ;
         AV10P_TAM04_KNGN_PTN_KBN = httpContext.cgiGet( "vP_TAM04_KNGN_PTN_KBN") ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0151") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0151", "");
         }
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
      /* Execute user event: e160R2 */
      e160R2 ();
      if (returnInSub) return;
   }

   public void e160R2( )
   {
      /* Start Routine */
      AV19C_TAM02_APP_ID = "A202" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19C_TAM02_APP_ID", AV19C_TAM02_APP_ID);
      AV18C_GAMEN_TITLE = AV53Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18C_GAMEN_TITLE", AV18C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV27H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27H_INIT_FLG", AV27H_INIT_FLG);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV34W_A_LOGIN_SDT,AV19C_TAM02_APP_ID,AV18C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0151",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e170R2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV27H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV54Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
      }
      AV27H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27H_INIT_FLG", AV27H_INIT_FLG);
      if ( GXutil.strcmp(AV43W_GMN_EDIT_FLG, "1") != 0 )
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
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

   private void e180R2( )
   {
      /* Grid1_Load Routine */
      AV55GXV7 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55GXV7", GXutil.ltrim( GXutil.str( AV55GXV7, 8, 0)));
      while ( AV55GXV7 <= AV11W_A202_SD01_APPLI_KNGN_LIST.size() )
      {
         AV37W_A202_SD01_APPLI_KNGN_LIST_Item = (SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)((SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)AV11W_A202_SD01_APPLI_KNGN_LIST.elementAt(-1+AV55GXV7));
         if ( GXutil.strcmp(AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg(), "1") == 0 )
         {
            AV7D_GRD_TAM03_APP_ID = AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id() ;
            AV8D_GRD_TAM03_APP_NM = AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm() ;
            AV9D_GRD_TAM03_SUB_MENU_FLG = AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg() ;
            AV5D_GRD_MENU_TAM05_KNGN_FLG = AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg() ;
            AV6D_GRD_RIYO_TAM05_KNGN_FLG = AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg() ;
            edtavD_grd_tam03_sub_menu_flg_Visible = 0 ;
            if ( GXutil.strcmp(AV9D_GRD_TAM03_SUB_MENU_FLG, "1") == 0 )
            {
               radavD_grd_menu_tam05_kngn_flg.setVisible( 1 );
               radavD_grd_riyo_tam05_kngn_flg.setVisible( 0 );
            }
            else
            {
               radavD_grd_menu_tam05_kngn_flg.setVisible( 0 );
               radavD_grd_riyo_tam05_kngn_flg.setVisible( 1 );
            }
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(92) ;
            }
            sendrow_922( ) ;
         }
         AV55GXV7 = (int)(AV55GXV7+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55GXV7", GXutil.ltrim( GXutil.str( AV55GXV7, 8, 0)));
      }
   }

   public void e110R2( )
   {
      /* 'BTN_UPD' Routine */
      if ( GXutil.strcmp(AV29H_MODE, "1") == 0 )
      {
         if ( ! AV41W_ERRFLG )
         {
            GXt_char1 = AV45W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char2) ;
            a202_wp01_kngn_ptn_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV45W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_MSG", AV45W_MSG);
            GXt_char1 = AV38W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV45W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
            a202_wp01_kngn_ptn_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_MSG", AV45W_MSG);
            AV38W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38W_A821_JS", AV38W_A821_JS);
         }
      }
   }

   public void e140R2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      AV41W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41W_ERRFLG", AV41W_ERRFLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      if ( ! AV41W_ERRFLG )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a202_wp01_kngn_ptn_reg");
         GXt_char1 = AV45W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00104", "", "", "", "", "", GXv_char2) ;
         a202_wp01_kngn_ptn_reg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_MSG", AV45W_MSG);
         httpContext.GX_msglist.addItem(AV45W_MSG);
         AV29H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29H_MODE", AV29H_MODE);
         AV12W_TAM04_KNGN_PTN_KBN = AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12W_TAM04_KNGN_PTN_KBN", AV12W_TAM04_KNGN_PTN_KBN);
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S222 */
         S222 ();
         if (returnInSub) return;
         GX_FocusControl = edtavD_tam03_app_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a202_wp01_kngn_ptn_reg");
      }
   }

   public void e120R2( )
   {
      /* 'BTN_CAN' Routine */
      AV43W_GMN_EDIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43W_GMN_EDIT_FLG", AV43W_GMN_EDIT_FLG);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a201_wp01_kngn_ptn_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("a201_wp01_kngn_ptn_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e150R2( )
   {
      /* 'BTN_IKKATU' Routine */
      AV44W_IKKATU_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44W_IKKATU_FLG", AV44W_IKKATU_FLG);
   }

   public void e130R2( )
   {
      /* 'BTN_SRCH' Routine */
      AV30H_TAM03_APP_ID = AV20D_TAM03_APP_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30H_TAM03_APP_ID", AV30H_TAM03_APP_ID);
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( ! (GXutil.strcmp("", AV10P_TAM04_KNGN_PTN_KBN)==0) )
      {
         AV29H_MODE = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29H_MODE", AV29H_MODE);
         AV12W_TAM04_KNGN_PTN_KBN = AV10P_TAM04_KNGN_PTN_KBN ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12W_TAM04_KNGN_PTN_KBN", AV12W_TAM04_KNGN_PTN_KBN);
         /* Execute user subroutine: S202 */
         S202 ();
         if (returnInSub) return;
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         GX_FocusControl = edtavD_tam03_app_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      AV24D_TAM05_KNGN_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24D_TAM05_KNGN_FLG", AV24D_TAM05_KNGN_FLG);
   }

   public void S152( )
   {
      /* 'SUB_GRD_SAVE' Routine */
      AV43W_GMN_EDIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43W_GMN_EDIT_FLG", AV43W_GMN_EDIT_FLG);
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_92 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_92"), ".", ",")) ;
      nGXsfl_92_fel_idx = (short)(0) ;
      while ( nGXsfl_92_fel_idx < nRC_GXsfl_92 )
      {
         nGXsfl_92_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_92_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_92_fel_idx+1)) ;
         sGXsfl_92_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_92_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_922( ) ;
         AV7D_GRD_TAM03_APP_ID = httpContext.cgiGet( edtavD_grd_tam03_app_id_Internalname) ;
         AV8D_GRD_TAM03_APP_NM = httpContext.cgiGet( edtavD_grd_tam03_app_nm_Internalname) ;
         AV5D_GRD_MENU_TAM05_KNGN_FLG = httpContext.cgiGet( radavD_grd_menu_tam05_kngn_flg.getInternalname()) ;
         AV9D_GRD_TAM03_SUB_MENU_FLG = httpContext.cgiGet( edtavD_grd_tam03_sub_menu_flg_Internalname) ;
         AV6D_GRD_RIYO_TAM05_KNGN_FLG = httpContext.cgiGet( radavD_grd_riyo_tam05_kngn_flg.getInternalname()) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0151") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0151", "");
         }
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0151") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0151", "");
         }
         if ( GXutil.strcmp(AV44W_IKKATU_FLG, "1") == 0 )
         {
            AV5D_GRD_MENU_TAM05_KNGN_FLG = "1" ;
            AV6D_GRD_RIYO_TAM05_KNGN_FLG = AV24D_TAM05_KNGN_FLG ;
         }
         AV57GXV8 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57GXV8", GXutil.ltrim( GXutil.str( AV57GXV8, 8, 0)));
         while ( AV57GXV8 <= AV11W_A202_SD01_APPLI_KNGN_LIST.size() )
         {
            AV37W_A202_SD01_APPLI_KNGN_LIST_Item = (SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)((SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)AV11W_A202_SD01_APPLI_KNGN_LIST.elementAt(-1+AV57GXV8));
            if ( GXutil.strcmp(AV7D_GRD_TAM03_APP_ID, AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id()) == 0 )
            {
               if ( GXutil.strcmp(AV9D_GRD_TAM03_SUB_MENU_FLG, "1") == 0 )
               {
                  AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg( AV5D_GRD_MENU_TAM05_KNGN_FLG );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
               }
               else
               {
                  AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg( AV6D_GRD_RIYO_TAM05_KNGN_FLG );
                  httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
               }
               if (true) break;
            }
            AV57GXV8 = (int)(AV57GXV8+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57GXV8", GXutil.ltrim( GXutil.str( AV57GXV8, 8, 0)));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_92_fel_idx == 0 )
      {
         nGXsfl_92_idx = (short)(1) ;
         sGXsfl_92_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_92_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_922( ) ;
      }
      nGXsfl_92_fel_idx = (short)(1) ;
   }

   public void S202( )
   {
      /* 'SUB_DATA_LOAD' Routine */
      AV14BC_KNGN_PTN.Load(AV12W_TAM04_KNGN_PTN_KBN);
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new a803_pc01_htmlescape(remoteHandle, context).execute( AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm(), GXv_char2) ;
      a202_wp01_kngn_ptn_reg_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14BC_KNGN_PTN", AV14BC_KNGN_PTN);
      lblTxt_auth_name_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_auth_name_Internalname, "Caption", lblTxt_auth_name_Caption);
   }

   public void S222( )
   {
      /* 'SUB_DATA_LOAD_GRD' Routine */
      AV39W_CNT = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39W_CNT", GXutil.ltrim( GXutil.str( AV39W_CNT, 4, 0)));
      AV58GXV9 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58GXV9", GXutil.ltrim( GXutil.str( AV58GXV9, 8, 0)));
      while ( AV58GXV9 <= AV11W_A202_SD01_APPLI_KNGN_LIST.size() )
      {
         AV37W_A202_SD01_APPLI_KNGN_LIST_Item = (SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)((SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)AV11W_A202_SD01_APPLI_KNGN_LIST.elementAt(-1+AV58GXV9));
         AV42W_EXST_FLG = "0" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42W_EXST_FLG", AV42W_EXST_FLG);
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV30H_TAM03_APP_ID ,
                                              A12TAM03_APP_ID },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV30H_TAM03_APP_ID = GXutil.padr( GXutil.rtrim( AV30H_TAM03_APP_ID), 7, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30H_TAM03_APP_ID", AV30H_TAM03_APP_ID);
         /* Using cursor H000R2 */
         pr_default.execute(0, new Object[] {lV30H_TAM03_APP_ID});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A12TAM03_APP_ID = H000R2_A12TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
            if ( GXutil.strcmp(AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id(), A12TAM03_APP_ID) == 0 )
            {
               AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg( "1" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
               AV42W_EXST_FLG = "1" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42W_EXST_FLG", AV42W_EXST_FLG);
               AV39W_CNT = (short)(AV39W_CNT+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39W_CNT", GXutil.ltrim( GXutil.str( AV39W_CNT, 4, 0)));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( GXutil.strcmp(AV42W_EXST_FLG, "0") == 0 )
         {
            AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg( "0" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
         }
         AV58GXV9 = (int)(AV58GXV9+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58GXV9", GXutil.ltrim( GXutil.str( AV58GXV9, 8, 0)));
      }
      AV43W_GMN_EDIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43W_GMN_EDIT_FLG", AV43W_GMN_EDIT_FLG);
   }

   public void S212( )
   {
      /* 'SUB_DISP_NM' Routine */
      AV60GXLvl395 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60GXLvl395", GXutil.str( AV60GXLvl395, 1, 0));
      /* Using cursor H000R3 */
      pr_default.execute(1, new Object[] {AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id()});
      if ( Gx_err != 0 )
      {
         AV60GXLvl395 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60GXLvl395", GXutil.str( AV60GXLvl395, 1, 0));
      }
      while ( (pr_default.getStatus(1) != 101) )
      {
         A55TAM07_USER_ID = H000R3_A55TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
         A205TAM07_USER_NM = H000R3_A205TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
         n205TAM07_USER_NM = H000R3_n205TAM07_USER_NM[0] ;
         AV60GXLvl395 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60GXLvl395", GXutil.str( AV60GXLvl395, 1, 0));
         GXt_char1 = AV22D_TAM04_CRT_USER_NM ;
         GXv_char2[0] = GXt_char1 ;
         new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
         a202_wp01_kngn_ptn_reg_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
         AV22D_TAM04_CRT_USER_NM = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22D_TAM04_CRT_USER_NM", AV22D_TAM04_CRT_USER_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV60GXLvl395 == 0 )
      {
         AV22D_TAM04_CRT_USER_NM = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22D_TAM04_CRT_USER_NM", AV22D_TAM04_CRT_USER_NM);
      }
      AV61GXLvl405 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61GXLvl405", GXutil.str( AV61GXLvl405, 1, 0));
      /* Using cursor H000R4 */
      pr_default.execute(2, new Object[] {AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id()});
      if ( Gx_err != 0 )
      {
         AV61GXLvl405 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61GXLvl405", GXutil.str( AV61GXLvl405, 1, 0));
      }
      while ( (pr_default.getStatus(2) != 101) )
      {
         A55TAM07_USER_ID = H000R4_A55TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
         A205TAM07_USER_NM = H000R4_A205TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
         n205TAM07_USER_NM = H000R4_n205TAM07_USER_NM[0] ;
         AV61GXLvl405 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61GXLvl405", GXutil.str( AV61GXLvl405, 1, 0));
         GXt_char1 = AV23D_TAM04_UPD_USER_NM ;
         GXv_char2[0] = GXt_char1 ;
         new a803_pc01_htmlescape(remoteHandle, context).execute( A205TAM07_USER_NM, GXv_char2) ;
         a202_wp01_kngn_ptn_reg_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
         AV23D_TAM04_UPD_USER_NM = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23D_TAM04_UPD_USER_NM", AV23D_TAM04_UPD_USER_NM);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV61GXLvl405 == 0 )
      {
         AV23D_TAM04_UPD_USER_NM = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23D_TAM04_UPD_USER_NM", AV23D_TAM04_UPD_USER_NM);
      }
   }

   public void S192( )
   {
      /* 'SUB_REG' Routine */
      if ( GXutil.strcmp(AV29H_MODE, "0") == 0 )
      {
         AV14BC_KNGN_PTN.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm( AV54Pgmname );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14BC_KNGN_PTN", AV14BC_KNGN_PTN);
      }
      else
      {
         AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().clear();
      }
      AV14BC_KNGN_PTN.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm( AV54Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14BC_KNGN_PTN", AV14BC_KNGN_PTN);
      AV62GXV10 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62GXV10", GXutil.ltrim( GXutil.str( AV62GXV10, 8, 0)));
      while ( AV62GXV10 <= AV11W_A202_SD01_APPLI_KNGN_LIST.size() )
      {
         AV37W_A202_SD01_APPLI_KNGN_LIST_Item = (SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)((SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)AV11W_A202_SD01_APPLI_KNGN_LIST.elementAt(-1+AV62GXV10));
         if ( GXutil.strcmp(AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg(), "0") != 0 )
         {
            AV13BC_APPLI_KNGN = (SdtTAM04BC_KNGN_TAM05_APPLI)new SdtTAM04BC_KNGN_TAM05_APPLI( remoteHandle, context);
            AV13BC_APPLI_KNGN.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam03_app_id( AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13BC_APPLI_KNGN", AV13BC_APPLI_KNGN);
            AV13BC_APPLI_KNGN.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_kngn_flg( AV37W_A202_SD01_APPLI_KNGN_LIST_Item.getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg() );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13BC_APPLI_KNGN", AV13BC_APPLI_KNGN);
            AV13BC_APPLI_KNGN.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_del_flg( "0" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13BC_APPLI_KNGN", AV13BC_APPLI_KNGN);
            AV13BC_APPLI_KNGN.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_crt_prog_nm( AV54Pgmname );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13BC_APPLI_KNGN", AV13BC_APPLI_KNGN);
            AV13BC_APPLI_KNGN.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Tam05_upd_prog_nm( AV54Pgmname );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13BC_APPLI_KNGN", AV13BC_APPLI_KNGN);
            AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam05_appli().add(AV13BC_APPLI_KNGN, 0);
         }
         AV62GXV10 = (int)(AV62GXV10+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62GXV10", GXutil.ltrim( GXutil.str( AV62GXV10, 8, 0)));
      }
      AV14BC_KNGN_PTN.Save();
      if ( ! AV14BC_KNGN_PTN.Success() )
      {
         AV41W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41W_ERRFLG", AV41W_ERRFLG);
         AV17C_BCMSGS = AV14BC_KNGN_PTN.GetMessages() ;
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
      }
   }

   public void S242( )
   {
      /* 'SUB_BC_ERRMSG' Routine */
      AV63GXV11 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63GXV11", GXutil.ltrim( GXutil.str( AV63GXV11, 8, 0)));
      while ( AV63GXV11 <= AV17C_BCMSGS.size() )
      {
         AV16C_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV17C_BCMSGS.elementAt(-1+AV63GXV11));
         if ( GXutil.strcmp(AV16C_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
         {
            GXt_char1 = AV45W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
            a202_wp01_kngn_ptn_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV45W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_MSG", AV45W_MSG);
         }
         else if ( GXutil.strcmp(AV16C_BCMSG.getgxTv_SdtMessages_Message_Id(), "RecordWasChanged") == 0 )
         {
            GXt_char1 = AV45W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
            a202_wp01_kngn_ptn_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV45W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_MSG", AV45W_MSG);
         }
         else
         {
            AV45W_MSG = AV16C_BCMSG.getgxTv_SdtMessages_Message_Description() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45W_MSG", AV45W_MSG);
         }
         httpContext.GX_msglist.addItem(AV45W_MSG);
         AV63GXV11 = (int)(AV63GXV11+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63GXV11", GXutil.ltrim( GXutil.str( AV63GXV11, 8, 0)));
      }
   }

   public void S232( )
   {
      /* 'SUB_GET_SDT' Routine */
      AV11W_A202_SD01_APPLI_KNGN_LIST.clear();
      /* Using cursor H000R5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A12TAM03_APP_ID = H000R5_A12TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
         A314TAM03_APP_NM = H000R5_A314TAM03_APP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
         n314TAM03_APP_NM = H000R5_n314TAM03_APP_NM[0] ;
         A315TAM03_SUB_MENU_FLG = H000R5_A315TAM03_SUB_MENU_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
         n315TAM03_SUB_MENU_FLG = H000R5_n315TAM03_SUB_MENU_FLG[0] ;
         AV37W_A202_SD01_APPLI_KNGN_LIST_Item = (SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)new SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem(remoteHandle, context);
         AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id( A12TAM03_APP_ID );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
         AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm( A314TAM03_APP_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
         AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg( A315TAM03_SUB_MENU_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
         if ( GXutil.strcmp(AV29H_MODE, "1") == 0 )
         {
            AV65GXLvl507 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65GXLvl507", GXutil.str( AV65GXLvl507, 1, 0));
            /* Using cursor H000R6 */
            pr_default.execute(4, new Object[] {AV12W_TAM04_KNGN_PTN_KBN, A12TAM03_APP_ID});
            if ( Gx_err != 0 )
            {
               AV65GXLvl507 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65GXLvl507", GXutil.str( AV65GXLvl507, 1, 0));
            }
            while ( (pr_default.getStatus(4) != 101) )
            {
               A13TAM04_AUTH_CD = H000R6_A13TAM04_AUTH_CD[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
               A288TAM05_KNGN_FLG = H000R6_A288TAM05_KNGN_FLG[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A288TAM05_KNGN_FLG", A288TAM05_KNGN_FLG);
               n288TAM05_KNGN_FLG = H000R6_n288TAM05_KNGN_FLG[0] ;
               AV65GXLvl507 = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65GXLvl507", GXutil.str( AV65GXLvl507, 1, 0));
               AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg( A288TAM05_KNGN_FLG );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
            if ( AV65GXLvl507 == 0 )
            {
               AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg( "0" );
               httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
            }
         }
         else
         {
            AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg( "0" );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
         }
         AV37W_A202_SD01_APPLI_KNGN_LIST_Item.setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg( "0" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV37W_A202_SD01_APPLI_KNGN_LIST_Item", AV37W_A202_SD01_APPLI_KNGN_LIST_Item);
         AV11W_A202_SD01_APPLI_KNGN_LIST.add(AV37W_A202_SD01_APPLI_KNGN_LIST_Item, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV34W_A_LOGIN_SDT;
      GXv_char2[0] = AV40W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV34W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      a202_wp01_kngn_ptn_reg_impl.this.AV40W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40W_ERRCD", AV40W_ERRCD);
      if ( GXutil.strcmp(AV40W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      Form.getJscriptsrc().add("js/acom.js") ;
   }

   public void S162( )
   {
      /* 'SUB_VISIBLE' Routine */
      if ( GXutil.strcmp(AV29H_MODE, "0") == 0 )
      {
      }
      else
      {
         tblTbl_upd_btnset_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_upd_btnset_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_upd_btnset_Visible, 5, 0)));
         edtavCtltam04_crt_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_crt_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam04_crt_datetime_Visible, 5, 0)));
         edtavCtltam04_upd_datetime_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_upd_datetime_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtltam04_upd_datetime_Visible, 5, 0)));
         edtavCtltam04_auth_cd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltam04_auth_cd_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltam04_auth_cd_Enabled, 5, 0)));
      }
      /* Execute user subroutine: S252 */
      S252 ();
      if (returnInSub) return;
   }

   public void S122( )
   {
      /* 'SUB_CLER' Routine */
      AV38W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38W_A821_JS", AV38W_A821_JS);
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
      if ( ! (GXutil.strcmp("", AV38W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV38W_A821_JS ;
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
      GXv_char2[0] = AV28H_KNGN_FLG ;
      GXv_char4[0] = AV40W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV19C_TAM02_APP_ID, GXv_char2, GXv_char4) ;
      a202_wp01_kngn_ptn_reg_impl.this.AV28H_KNGN_FLG = GXv_char2[0] ;
      a202_wp01_kngn_ptn_reg_impl.this.AV40W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19C_TAM02_APP_ID", AV19C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV28H_KNGN_FLG", AV28H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV40W_ERRCD", AV40W_ERRCD);
      if ( GXutil.strcmp(AV40W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S262( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV54Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a202_wp01_kngn_ptn_reg");
   }

   public void S252( )
   {
      /* 'SUB_BTN_EDIT' Routine */
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      if ( AV39W_CNT <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         GXt_char1 = AV45W_MSG ;
         GXv_char4[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
         a202_wp01_kngn_ptn_reg_impl.this.GXt_char1 = GXv_char4[0] ;
         AV45W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45W_MSG", AV45W_MSG);
         httpContext.GX_msglist.addItem(AV45W_MSG);
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( AV39W_CNT, 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void wb_table1_2_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:9px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;width:910px\">") ;
         wb_table2_6_0R2( true) ;
      }
      else
      {
         wb_table2_6_0R2( false) ;
      }
      return  ;
   }

   public void wb_table2_6_0R2e( boolean wbgen )
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
         wb_table1_2_0R2e( true) ;
      }
      else
      {
         wb_table1_2_0R2e( false) ;
      }
   }

   public void wb_table2_6_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
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
         wb_table3_12_0R2( true) ;
      }
      else
      {
         wb_table3_12_0R2( false) ;
      }
      return  ;
   }

   public void wb_table3_12_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table4_26_0R2( true) ;
      }
      else
      {
         wb_table4_26_0R2( false) ;
      }
      return  ;
   }

   public void wb_table4_26_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_126_0R2( true) ;
      }
      else
      {
         wb_table5_126_0R2( false) ;
      }
      return  ;
   }

   public void wb_table5_126_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0151"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0151"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0151"+"");
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
         wb_table2_6_0R2e( true) ;
      }
      else
      {
         wb_table2_6_0R2e( false) ;
      }
   }

   public void wb_table5_126_0R2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV27H_INIT_FLG), GXutil.rtrim( localUtil.format( AV27H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV28H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV28H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_mode_Internalname, GXutil.rtrim( AV29H_MODE), GXutil.rtrim( localUtil.format( AV29H_MODE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_mode_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_tam04_kngn_ptn_kbn_Internalname, GXutil.rtrim( AV12W_TAM04_KNGN_PTN_KBN), GXutil.rtrim( localUtil.format( AV12W_TAM04_KNGN_PTN_KBN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_tam04_kngn_ptn_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_tam03_app_id_Internalname, GXutil.rtrim( AV30H_TAM03_APP_ID), GXutil.rtrim( localUtil.format( AV30H_TAM03_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_tam03_app_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_exec_Internalname, "BTN_REG_EXEC", "", "", lblTxt_btn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         wb_table6_136_0R2( true) ;
      }
      else
      {
         wb_table6_136_0R2( false) ;
      }
      return  ;
   }

   public void wb_table6_136_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV39W_CNT, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39W_CNT), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(148);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_126_0R2e( true) ;
      }
      else
      {
         wb_table5_126_0R2e( false) ;
      }
   }

   public void wb_table6_136_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "TAM04_CRT_USER_ID", "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_crt_user_id_Internalname, GXutil.rtrim( AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id()), GXutil.rtrim( localUtil.format( AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_crt_user_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "TAM04_UPD_USER_ID", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_upd_user_id_Internalname, GXutil.rtrim( AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id()), GXutil.rtrim( localUtil.format( AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_upd_user_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_136_0R2e( true) ;
      }
      else
      {
         wb_table6_136_0R2e( false) ;
      }
   }

   public void wb_table4_26_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 850, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_32_0R2( true) ;
      }
      else
      {
         wb_table7_32_0R2( false) ;
      }
      return  ;
   }

   public void wb_table7_32_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_46_0R2( true) ;
      }
      else
      {
         wb_table8_46_0R2( false) ;
      }
      return  ;
   }

   public void wb_table8_46_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table9_50_0R2( true) ;
      }
      else
      {
         wb_table9_50_0R2( false) ;
      }
      return  ;
   }

   public void wb_table9_50_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom;height:25px\">") ;
         wb_table10_64_0R2( true) ;
      }
      else
      {
         wb_table10_64_0R2( false) ;
      }
      return  ;
   }

   public void wb_table10_64_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_82_0R2( true) ;
      }
      else
      {
         wb_table11_82_0R2( false) ;
      }
      return  ;
   }

   public void wb_table11_82_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"92\">") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV7D_GRD_TAM03_APP_ID));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_tam03_app_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV8D_GRD_TAM03_APP_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_tam03_app_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV5D_GRD_MENU_TAM05_KNGN_FLG));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( radavD_grd_menu_tam05_kngn_flg.getVisible(), (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV9D_GRD_TAM03_SUB_MENU_FLG));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavD_grd_tam03_sub_menu_flg_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV6D_GRD_RIYO_TAM05_KNGN_FLG));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( radavD_grd_riyo_tam05_kngn_flg.getVisible(), (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 92 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_92 = (short)(nGXsfl_92_idx-1) ;
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
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_107_0R2( true) ;
      }
      else
      {
         wb_table12_107_0R2( false) ;
      }
      return  ;
   }

   public void wb_table12_107_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_26_0R2e( true) ;
      }
      else
      {
         wb_table4_26_0R2e( false) ;
      }
   }

   public void wb_table12_107_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable13_Internalname, tblTable13_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, "作成日時", "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltam04_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_crt_datetime_Internalname, localUtil.format(AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_crt_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltam04_crt_datetime_Visible, edtavCtltam04_crt_datetime_Enabled, 0, "text", "", 200, "px", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltam04_crt_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltam04_crt_datetime_Visible==0)||(edtavCtltam04_crt_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, "更新日時", "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCtltam04_upd_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_upd_datetime_Internalname, localUtil.format(AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime(), "9999/99/99 99:99:99"), localUtil.format( AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime(), "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_upd_datetime_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtavCtltam04_upd_datetime_Visible, edtavCtltam04_upd_datetime_Enabled, 0, "text", "", 200, "px", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtltam04_upd_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtltam04_upd_datetime_Visible==0)||(edtavCtltam04_upd_datetime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, "作成ユーザ名", "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam04_crt_user_nm_Internalname, GXutil.rtrim( AV22D_TAM04_CRT_USER_NM), GXutil.rtrim( localUtil.format( AV22D_TAM04_CRT_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam04_crt_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_tam04_crt_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, "更新ユーザ名", "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam04_upd_user_nm_Internalname, GXutil.rtrim( AV23D_TAM04_UPD_USER_NM), GXutil.rtrim( localUtil.format( AV23D_TAM04_UPD_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam04_upd_user_nm_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_tam04_upd_user_nm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(1), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_107_0R2e( true) ;
      }
      else
      {
         wb_table12_107_0R2e( false) ;
      }
   }

   public void wb_table11_82_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable15_Internalname, tblTable15_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"ItemTitle\"  style=\"width:350px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, "使用可能アプリケーション", "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"center\" class=\"ItemTitle\"  style=\"width:130px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, "メニュー表示", "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"center\" class=\"ItemTitle\"  style=\"width:345px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, "利用情報", "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_82_0R2e( true) ;
      }
      else
      {
         wb_table11_82_0R2e( false) ;
      }
   }

   public void wb_table10_64_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page_area_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page_area_Internalname, tblTbl_page_area_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom;width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table13_72_0R2( true) ;
      }
      else
      {
         wb_table13_72_0R2( false) ;
      }
      return  ;
   }

   public void wb_table13_72_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_64_0R2e( true) ;
      }
      else
      {
         wb_table10_64_0R2e( false) ;
      }
   }

   public void wb_table13_72_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\"  style=\"width:140px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, "利用権限一括変更", "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_IKKATU\\'."+"'", "", "TextBlockBtn120", 5, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radavD_tam05_kngn_flg, radavD_tam05_kngn_flg.getInternalname(), GXutil.rtrim( AV24D_TAM05_KNGN_FLG), "", 1, 1, 0, 0, StyleString, ClassString, "", 0, radavD_tam05_kngn_flg.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(77);\"", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_72_0R2e( true) ;
      }
      else
      {
         wb_table13_72_0R2e( false) ;
      }
   }

   public void wb_table9_50_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable12_Internalname, tblTable12_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:422px\">") ;
         wb_table14_53_0R2( true) ;
      }
      else
      {
         wb_table14_53_0R2( false) ;
      }
      return  ;
   }

   public void wb_table14_53_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\"  style=\"width:50%\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_50_0R2e( true) ;
      }
      else
      {
         wb_table9_50_0R2e( false) ;
      }
   }

   public void wb_table14_53_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable11_Internalname, tblTable11_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:115px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "アプリケーション　　", "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam03_app_id_Internalname, GXutil.rtrim( AV20D_TAM03_APP_ID), GXutil.rtrim( localUtil.format( AV20D_TAM03_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam03_app_id_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, 1, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, "絞込み（F5）", "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn120", 5, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_53_0R2e( true) ;
      }
      else
      {
         wb_table14_53_0R2e( false) ;
      }
   }

   public void wb_table8_46_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:1px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:1px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_46_0R2e( true) ;
      }
      else
      {
         wb_table8_46_0R2e( false) ;
      }
   }

   public void wb_table7_32_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"height:25px;width:115px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "権限パターン区分", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:40px\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_92_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtltam04_auth_cd_Internalname, GXutil.rtrim( AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd()), GXutil.rtrim( localUtil.format( AV14BC_KNGN_PTN.getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd(), "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtltam04_auth_cd_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavCtltam04_auth_cd_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:90px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, "権限パターン名", "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_auth_name_Internalname, lblTxt_auth_name_Caption, "", "", lblTxt_auth_name_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(1), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_32_0R2e( true) ;
      }
      else
      {
         wb_table7_32_0R2e( false) ;
      }
   }

   public void wb_table3_12_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:226px\">") ;
         wb_table15_15_0R2( true) ;
      }
      else
      {
         wb_table15_15_0R2( false) ;
      }
      return  ;
   }

   public void wb_table15_15_0R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_12_0R2e( true) ;
      }
      else
      {
         wb_table3_12_0R2e( false) ;
      }
   }

   public void wb_table15_15_0R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_upd_btnset_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:155px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "更新（F4）", "", "", lblTxt_btn_upd_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:1px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:1px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:1px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:111px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F10）", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_A202_WP01_KNGN_PTN_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_15_0R2e( true) ;
      }
      else
      {
         wb_table15_15_0R2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV10P_TAM04_KNGN_PTN_KBN = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10P_TAM04_KNGN_PTN_KBN", AV10P_TAM04_KNGN_PTN_KBN);
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
      pa0R2( ) ;
      ws0R2( ) ;
      we0R2( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?8960");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317165853");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a202_wp01_kngn_ptn_reg.js", "?20177317165853");
      /* End function include_jscripts */
   }

   public void subsflControlProps_922( )
   {
      edtavD_grd_tam03_app_id_Internalname = "vD_GRD_TAM03_APP_ID_"+sGXsfl_92_idx ;
      edtavD_grd_tam03_app_nm_Internalname = "vD_GRD_TAM03_APP_NM_"+sGXsfl_92_idx ;
      radavD_grd_menu_tam05_kngn_flg.setInternalname( "vD_GRD_MENU_TAM05_KNGN_FLG_"+sGXsfl_92_idx );
      edtavD_grd_tam03_sub_menu_flg_Internalname = "vD_GRD_TAM03_SUB_MENU_FLG_"+sGXsfl_92_idx ;
      radavD_grd_riyo_tam05_kngn_flg.setInternalname( "vD_GRD_RIYO_TAM05_KNGN_FLG_"+sGXsfl_92_idx );
   }

   public void subsflControlProps_fel_922( )
   {
      edtavD_grd_tam03_app_id_Internalname = "vD_GRD_TAM03_APP_ID_"+sGXsfl_92_fel_idx ;
      edtavD_grd_tam03_app_nm_Internalname = "vD_GRD_TAM03_APP_NM_"+sGXsfl_92_fel_idx ;
      radavD_grd_menu_tam05_kngn_flg.setInternalname( "vD_GRD_MENU_TAM05_KNGN_FLG_"+sGXsfl_92_fel_idx );
      edtavD_grd_tam03_sub_menu_flg_Internalname = "vD_GRD_TAM03_SUB_MENU_FLG_"+sGXsfl_92_fel_idx ;
      radavD_grd_riyo_tam05_kngn_flg.setInternalname( "vD_GRD_RIYO_TAM05_KNGN_FLG_"+sGXsfl_92_fel_idx );
   }

   public void sendrow_922( )
   {
      subsflControlProps_922( ) ;
      wb0R0( ) ;
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
         if ( ((int)(((nGXsfl_92_idx-1)/ (double) (1)) % (2))) == 0 )
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
         if ( ( 1 == 0 ) && ( nGXsfl_92_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_92_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)((nGXsfl_92_idx) % (1))) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_92_idx+"\">") ;
            }
         }
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:78px\""});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd_tam03_app_id_Enabled!=0)&&(edtavD_grd_tam03_app_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 95,'',false,'"+sGXsfl_92_idx+"',92)\"" : " ") ;
      ROClassString = "ReadonlyAttribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_tam03_app_id_Internalname,GXutil.rtrim( AV7D_GRD_TAM03_APP_ID),"",TempTags+((edtavD_grd_tam03_app_id_Enabled!=0)&&(edtavD_grd_tam03_app_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_tam03_app_id_Enabled!=0)&&(edtavD_grd_tam03_app_id_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(95);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_tam03_app_id_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_tam03_app_id_Enabled),new Integer(0),"text","",new Integer(7),"chr",new Integer(1),"row",new Integer(7),new Integer(0),new Integer(0),new Integer(92),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:265px\""});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd_tam03_app_nm_Enabled!=0)&&(edtavD_grd_tam03_app_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 97,'',false,'"+sGXsfl_92_idx+"',92)\"" : " ") ;
      ROClassString = "ReadonlyAttribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_tam03_app_nm_Internalname,GXutil.rtrim( AV8D_GRD_TAM03_APP_NM),"",TempTags+((edtavD_grd_tam03_app_nm_Enabled!=0)&&(edtavD_grd_tam03_app_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_tam03_app_nm_Enabled!=0)&&(edtavD_grd_tam03_app_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(97);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_tam03_app_nm_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_tam03_app_nm_Enabled),new Integer(0),"text","",new Integer(40),"chr",new Integer(1),"row",new Integer(40),new Integer(0),new Integer(0),new Integer(92),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:130px\""});
      /* Radio button */
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      TempTags = " " + ((radavD_grd_menu_tam05_kngn_flg.getEnabled()!=0)&&(radavD_grd_menu_tam05_kngn_flg.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'',false,'"+sGXsfl_92_idx+"',92)\"" : " ") ;
      if ( ( nGXsfl_92_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "vD_GRD_MENU_TAM05_KNGN_FLG_" + sGXsfl_92_idx ;
         radavD_grd_menu_tam05_kngn_flg.setName( GXCCtl );
         radavD_grd_menu_tam05_kngn_flg.setWebtags( "" );
         radavD_grd_menu_tam05_kngn_flg.addItem("1", "表示", (short)(0));
         radavD_grd_menu_tam05_kngn_flg.addItem("0", "非表示", (short)(0));
      }
      Grid1Row.AddColumnProperties("radio", 2, isAjaxCallMode( ), new Object[] {radavD_grd_menu_tam05_kngn_flg,radavD_grd_menu_tam05_kngn_flg.getInternalname(),GXutil.rtrim( AV5D_GRD_MENU_TAM05_KNGN_FLG),"",new Integer(radavD_grd_menu_tam05_kngn_flg.getVisible()),new Integer(1),new Integer(0),new Integer(0),StyleString,ClassString,"",new Integer(0),radavD_grd_menu_tam05_kngn_flg.getJsonclick(),"'"+""+"'"+",false,"+"'"+""+"'",TempTags+((radavD_grd_menu_tam05_kngn_flg.getEnabled()!=0)&&(radavD_grd_menu_tam05_kngn_flg.getVisible()!=0) ? " onclick=\"gx.evt.onchange(this);\" " : " ")+((radavD_grd_menu_tam05_kngn_flg.getEnabled()!=0)&&(radavD_grd_menu_tam05_kngn_flg.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(99);\"" : " ")});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd_tam03_sub_menu_flg_Enabled!=0)&&(edtavD_grd_tam03_sub_menu_flg_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_92_idx+"',92)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_tam03_sub_menu_flg_Internalname,GXutil.rtrim( AV9D_GRD_TAM03_SUB_MENU_FLG),"",TempTags+((edtavD_grd_tam03_sub_menu_flg_Enabled!=0)&&(edtavD_grd_tam03_sub_menu_flg_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_tam03_sub_menu_flg_Enabled!=0)&&(edtavD_grd_tam03_sub_menu_flg_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(100);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_tam03_sub_menu_flg_Jsonclick,new Integer(0),"Attribute","color:#FF0000;",ROClassString,"",new Integer(edtavD_grd_tam03_sub_menu_flg_Visible),new Integer(1),new Integer(0),"text","",new Integer(1),"chr",new Integer(1),"row",new Integer(1),new Integer(0),new Integer(0),new Integer(92),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:345px\""});
      /* Radio button */
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      TempTags = " " + ((radavD_grd_riyo_tam05_kngn_flg.getEnabled()!=0)&&(radavD_grd_riyo_tam05_kngn_flg.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 102,'',false,'"+sGXsfl_92_idx+"',92)\"" : " ") ;
      if ( ( nGXsfl_92_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "vD_GRD_RIYO_TAM05_KNGN_FLG_" + sGXsfl_92_idx ;
         radavD_grd_riyo_tam05_kngn_flg.setName( GXCCtl );
         radavD_grd_riyo_tam05_kngn_flg.setWebtags( "" );
         radavD_grd_riyo_tam05_kngn_flg.addItem("1", "閲覧権限", (short)(0));
         radavD_grd_riyo_tam05_kngn_flg.addItem("2", "入力権限", (short)(0));
         radavD_grd_riyo_tam05_kngn_flg.addItem("0", "利用不可", (short)(0));
      }
      Grid1Row.AddColumnProperties("radio", 2, isAjaxCallMode( ), new Object[] {radavD_grd_riyo_tam05_kngn_flg,radavD_grd_riyo_tam05_kngn_flg.getInternalname(),GXutil.rtrim( AV6D_GRD_RIYO_TAM05_KNGN_FLG),"",new Integer(radavD_grd_riyo_tam05_kngn_flg.getVisible()),new Integer(1),new Integer(0),new Integer(0),StyleString,ClassString,"",new Integer(0),radavD_grd_riyo_tam05_kngn_flg.getJsonclick(),"'"+""+"'"+",false,"+"'"+""+"'",TempTags+((radavD_grd_riyo_tam05_kngn_flg.getEnabled()!=0)&&(radavD_grd_riyo_tam05_kngn_flg.getVisible()!=0) ? " onclick=\"gx.evt.onchange(this);\" " : " ")+((radavD_grd_riyo_tam05_kngn_flg.getEnabled()!=0)&&(radavD_grd_riyo_tam05_kngn_flg.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(102);\"" : " ")});
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
            if ( ((int)((nGXsfl_92_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_92_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_92_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_92_idx+1)) ;
      sGXsfl_92_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_92_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_922( ) ;
      /* End function sendrow_922 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_upd_Internalname = "TXT_BTN_UPD" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      tblTable6_Internalname = "TABLE6" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtavCtltam04_auth_cd_Internalname = "CTLTAM04_AUTH_CD" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      lblTxt_auth_name_Internalname = "TXT_AUTH_NAME" ;
      tblTable10_Internalname = "TABLE10" ;
      tblTable4_Internalname = "TABLE4" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtavD_tam03_app_id_Internalname = "vD_TAM03_APP_ID" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      tblTable11_Internalname = "TABLE11" ;
      tblTable12_Internalname = "TABLE12" ;
      lblTxt_rec_cnt_Internalname = "TXT_REC_CNT" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      radavD_tam05_kngn_flg.setInternalname( "vD_TAM05_KNGN_FLG" );
      tblTable9_Internalname = "TABLE9" ;
      tblTbl_page_area_Internalname = "TBL_PAGE_AREA" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      tblTable15_Internalname = "TABLE15" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtavCtltam04_crt_datetime_Internalname = "CTLTAM04_CRT_DATETIME" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtavCtltam04_upd_datetime_Internalname = "CTLTAM04_UPD_DATETIME" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtavD_tam04_crt_user_nm_Internalname = "vD_TAM04_CRT_USER_NM" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtavD_tam04_upd_user_nm_Internalname = "vD_TAM04_UPD_USER_NM" ;
      tblTable13_Internalname = "TABLE13" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_mode_Internalname = "vH_MODE" ;
      edtavW_tam04_kngn_ptn_kbn_Internalname = "vW_TAM04_KNGN_PTN_KBN" ;
      edtavH_tam03_app_id_Internalname = "vH_TAM03_APP_ID" ;
      lblTxt_btn_reg_exec_Internalname = "TXT_BTN_REG_EXEC" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtavCtltam04_crt_user_id_Internalname = "CTLTAM04_CRT_USER_ID" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtavCtltam04_upd_user_id_Internalname = "CTLTAM04_UPD_USER_ID" ;
      tblTable7_Internalname = "TABLE7" ;
      edtavW_cnt_Internalname = "vW_CNT" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      radavD_grd_riyo_tam05_kngn_flg.setJsonclick( "" );
      radavD_grd_riyo_tam05_kngn_flg.setEnabled( 1 );
      edtavD_grd_tam03_sub_menu_flg_Jsonclick = "" ;
      edtavD_grd_tam03_sub_menu_flg_Enabled = 1 ;
      radavD_grd_menu_tam05_kngn_flg.setJsonclick( "" );
      radavD_grd_menu_tam05_kngn_flg.setEnabled( 1 );
      edtavD_grd_tam03_app_nm_Jsonclick = "" ;
      edtavD_grd_tam03_app_nm_Visible = 1 ;
      edtavD_grd_tam03_app_id_Jsonclick = "" ;
      edtavD_grd_tam03_app_id_Visible = 1 ;
      subGrid1_Class = "FreeStyleGridTM-1" ;
      edtavCtltam04_auth_cd_Jsonclick = "" ;
      edtavCtltam04_auth_cd_Enabled = 1 ;
      edtavD_tam03_app_id_Jsonclick = "" ;
      radavD_tam05_kngn_flg.setJsonclick( "" );
      edtavD_tam04_upd_user_nm_Jsonclick = "" ;
      edtavD_tam04_upd_user_nm_Enabled = 1 ;
      edtavD_tam04_crt_user_nm_Jsonclick = "" ;
      edtavD_tam04_crt_user_nm_Enabled = 1 ;
      edtavCtltam04_upd_datetime_Jsonclick = "" ;
      edtavCtltam04_upd_datetime_Enabled = 0 ;
      edtavCtltam04_upd_datetime_Visible = 1 ;
      edtavCtltam04_crt_datetime_Jsonclick = "" ;
      edtavCtltam04_crt_datetime_Enabled = 0 ;
      edtavCtltam04_crt_datetime_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      radavD_grd_riyo_tam05_kngn_flg.setVisible( 1 );
      edtavD_grd_tam03_sub_menu_flg_Visible = 1 ;
      radavD_grd_menu_tam05_kngn_flg.setVisible( 1 );
      edtavD_grd_tam03_app_nm_Enabled = 1 ;
      edtavD_grd_tam03_app_id_Enabled = 1 ;
      edtavCtltam04_upd_user_id_Jsonclick = "" ;
      edtavCtltam04_crt_user_id_Jsonclick = "" ;
      edtavW_cnt_Jsonclick = "" ;
      edtavH_tam03_app_id_Jsonclick = "" ;
      edtavW_tam04_kngn_ptn_kbn_Jsonclick = "" ;
      edtavH_mode_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "TXT_REC_CNT" ;
      tblTbl_page_area_Visible = 1 ;
      edtavCtltam04_auth_cd_Enabled = 1 ;
      tblTbl_upd_btnset_Visible = 1 ;
      lblTxt_auth_name_Caption = "権限パターン名" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      edtavCtltam04_upd_datetime_Enabled = -1 ;
      edtavCtltam04_crt_datetime_Enabled = -1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
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
                  /* Execute user subroutine: S262 */
                  S262 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV10P_TAM04_KNGN_PTN_KBN = "" ;
      AV14BC_KNGN_PTN = new SdtTAM04BC_KNGN(remoteHandle);
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV10P_TAM04_KNGN_PTN_KBN = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV11W_A202_SD01_APPLI_KNGN_LIST = new GxObjectCollection(SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem.class, "A202_SD01_APPLI_KNGN_LIST.A202_SD01_APPLI_KNGN_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV54Pgmname = "" ;
      AV43W_GMN_EDIT_FLG = "" ;
      AV19C_TAM02_APP_ID = "" ;
      AV44W_IKKATU_FLG = "" ;
      AV38W_A821_JS = "" ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      A12TAM03_APP_ID = "" ;
      A314TAM03_APP_NM = "" ;
      A315TAM03_SUB_MENU_FLG = "" ;
      A13TAM04_AUTH_CD = "" ;
      A288TAM05_KNGN_FLG = "" ;
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
      AV7D_GRD_TAM03_APP_ID = "" ;
      edtavD_grd_tam03_app_id_Internalname = "" ;
      AV8D_GRD_TAM03_APP_NM = "" ;
      edtavD_grd_tam03_app_nm_Internalname = "" ;
      AV5D_GRD_MENU_TAM05_KNGN_FLG = "" ;
      AV9D_GRD_TAM03_SUB_MENU_FLG = "" ;
      edtavD_grd_tam03_sub_menu_flg_Internalname = "" ;
      AV6D_GRD_RIYO_TAM05_KNGN_FLG = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV53Pgmdesc = "" ;
      AV20D_TAM03_APP_ID = "" ;
      AV24D_TAM05_KNGN_FLG = "" ;
      AV22D_TAM04_CRT_USER_NM = "" ;
      AV23D_TAM04_UPD_USER_NM = "" ;
      AV27H_INIT_FLG = "" ;
      AV28H_KNGN_FLG = "" ;
      AV29H_MODE = "" ;
      AV12W_TAM04_KNGN_PTN_KBN = "" ;
      AV30H_TAM03_APP_ID = "" ;
      AV18C_GAMEN_TITLE = "" ;
      AV34W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV37W_A202_SD01_APPLI_KNGN_LIST_Item = new SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem(remoteHandle, context);
      AV45W_MSG = "" ;
      AV42W_EXST_FLG = "" ;
      scmdbuf = "" ;
      lV30H_TAM03_APP_ID = "" ;
      H000R2_A12TAM03_APP_ID = new String[] {""} ;
      H000R3_A55TAM07_USER_ID = new String[] {""} ;
      H000R3_A205TAM07_USER_NM = new String[] {""} ;
      H000R3_n205TAM07_USER_NM = new boolean[] {false} ;
      H000R4_A55TAM07_USER_ID = new String[] {""} ;
      H000R4_A205TAM07_USER_NM = new String[] {""} ;
      H000R4_n205TAM07_USER_NM = new boolean[] {false} ;
      AV13BC_APPLI_KNGN = new SdtTAM04BC_KNGN_TAM05_APPLI(remoteHandle);
      AV17C_BCMSGS = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle);
      AV16C_BCMSG = new SdtMessages_Message(remoteHandle, context);
      H000R5_A12TAM03_APP_ID = new String[] {""} ;
      H000R5_A314TAM03_APP_NM = new String[] {""} ;
      H000R5_n314TAM03_APP_NM = new boolean[] {false} ;
      H000R5_A315TAM03_SUB_MENU_FLG = new String[] {""} ;
      H000R5_n315TAM03_SUB_MENU_FLG = new boolean[] {false} ;
      H000R6_A12TAM03_APP_ID = new String[] {""} ;
      H000R6_A13TAM04_AUTH_CD = new String[] {""} ;
      H000R6_A288TAM05_KNGN_FLG = new String[] {""} ;
      H000R6_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV40W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTxt_btn_reg_exec_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock24_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTxt_rec_cnt_Jsonclick = "" ;
      lblTextblock48_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock54_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTxt_auth_name_Jsonclick = "" ;
      lblTxt_btn_upd_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a202_wp01_kngn_ptn_reg__default(),
         new Object[] {
             new Object[] {
            H000R2_A12TAM03_APP_ID
            }
            , new Object[] {
            H000R3_A55TAM07_USER_ID, H000R3_A205TAM07_USER_NM, H000R3_n205TAM07_USER_NM
            }
            , new Object[] {
            H000R4_A55TAM07_USER_ID, H000R4_A205TAM07_USER_NM, H000R4_n205TAM07_USER_NM
            }
            , new Object[] {
            H000R5_A12TAM03_APP_ID, H000R5_A314TAM03_APP_NM, H000R5_n314TAM03_APP_NM, H000R5_A315TAM03_SUB_MENU_FLG, H000R5_n315TAM03_SUB_MENU_FLG
            }
            , new Object[] {
            H000R6_A12TAM03_APP_ID, H000R6_A13TAM04_AUTH_CD, H000R6_A288TAM05_KNGN_FLG, H000R6_n288TAM05_KNGN_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV54Pgmname = "A202_WP01_KNGN_PTN_REG" ;
      AV53Pgmdesc = "権限パターンマスタメンテナンス（権限）" ;
      /* GeneXus formulas. */
      AV54Pgmname = "A202_WP01_KNGN_PTN_REG" ;
      AV53Pgmdesc = "権限パターンマスタメンテナンス（権限）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_tam03_app_id_Enabled = 0 ;
      edtavD_grd_tam03_app_nm_Enabled = 0 ;
      edtavCtltam04_crt_datetime_Enabled = 0 ;
      edtavCtltam04_upd_datetime_Enabled = 0 ;
      edtavD_tam04_crt_user_nm_Enabled = 0 ;
      edtavD_tam04_upd_user_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV60GXLvl395 ;
   private byte AV61GXLvl405 ;
   private byte AV65GXLvl507 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte GRID1_nEOF ;
   private short nRC_GXsfl_92 ;
   private short nGXsfl_92_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_92_Refreshing=0 ;
   private short Gx_err ;
   private short AV39W_CNT ;
   private short nGXsfl_92_fel_idx=1 ;
   private int subGrid1_Islastpage ;
   private int edtavD_grd_tam03_app_id_Enabled ;
   private int edtavD_grd_tam03_app_nm_Enabled ;
   private int edtavCtltam04_crt_datetime_Enabled ;
   private int edtavCtltam04_upd_datetime_Enabled ;
   private int edtavD_tam04_crt_user_nm_Enabled ;
   private int edtavD_tam04_upd_user_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV55GXV7 ;
   private int edtavD_grd_tam03_sub_menu_flg_Visible ;
   private int AV57GXV8 ;
   private int AV58GXV9 ;
   private int AV62GXV10 ;
   private int AV63GXV11 ;
   private int GXActiveErrHndl ;
   private int tblTbl_upd_btnset_Visible ;
   private int edtavCtltam04_crt_datetime_Visible ;
   private int edtavCtltam04_upd_datetime_Visible ;
   private int edtavCtltam04_auth_cd_Enabled ;
   private int tblTbl_page_area_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_tam03_app_id_Visible ;
   private int edtavD_grd_tam03_app_nm_Visible ;
   private int edtavD_grd_tam03_sub_menu_flg_Enabled ;
   private long GRID1_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_92_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV54Pgmname ;
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
   private String edtavD_grd_tam03_app_id_Internalname ;
   private String edtavD_grd_tam03_app_nm_Internalname ;
   private String edtavD_grd_tam03_sub_menu_flg_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String AV53Pgmdesc ;
   private String edtavCtltam04_crt_datetime_Internalname ;
   private String edtavCtltam04_upd_datetime_Internalname ;
   private String edtavD_tam04_crt_user_nm_Internalname ;
   private String edtavD_tam04_upd_user_nm_Internalname ;
   private String edtavCtltam04_auth_cd_Internalname ;
   private String edtavD_tam03_app_id_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_mode_Internalname ;
   private String edtavW_tam04_kngn_ptn_kbn_Internalname ;
   private String edtavH_tam03_app_id_Internalname ;
   private String edtavCtltam04_crt_user_id_Internalname ;
   private String edtavCtltam04_upd_user_id_Internalname ;
   private String edtavW_cnt_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String sGXsfl_92_fel_idx="0001" ;
   private String lblTxt_auth_name_Caption ;
   private String lblTxt_auth_name_Internalname ;
   private String scmdbuf ;
   private String tblTbl_upd_btnset_Internalname ;
   private String GXv_char2[] ;
   private String tblTbl_page_area_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String sStyleString ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_mode_Jsonclick ;
   private String edtavW_tam04_kngn_ptn_kbn_Jsonclick ;
   private String edtavH_tam03_app_id_Jsonclick ;
   private String lblTxt_btn_reg_exec_Internalname ;
   private String lblTxt_btn_reg_exec_Jsonclick ;
   private String edtavW_cnt_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtavCtltam04_crt_user_id_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtavCtltam04_upd_user_id_Jsonclick ;
   private String tblTable5_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String tblTable13_Internalname ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtavCtltam04_crt_datetime_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtavCtltam04_upd_datetime_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtavD_tam04_crt_user_nm_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtavD_tam04_upd_user_nm_Jsonclick ;
   private String tblTable15_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String lblTxt_rec_cnt_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String tblTable12_Internalname ;
   private String tblTable11_Internalname ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtavD_tam03_app_id_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String tblTable4_Internalname ;
   private String tblTable10_Internalname ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtavCtltam04_auth_cd_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String lblTxt_auth_name_Jsonclick ;
   private String tblTable6_Internalname ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_upd_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavD_grd_tam03_app_id_Jsonclick ;
   private String edtavD_grd_tam03_app_nm_Jsonclick ;
   private String edtavD_grd_tam03_sub_menu_flg_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV41W_ERRFLG ;
   private boolean n205TAM07_USER_NM ;
   private boolean n314TAM03_APP_NM ;
   private boolean n315TAM03_SUB_MENU_FLG ;
   private boolean n288TAM05_KNGN_FLG ;
   private String wcpOAV10P_TAM04_KNGN_PTN_KBN ;
   private String AV10P_TAM04_KNGN_PTN_KBN ;
   private String AV43W_GMN_EDIT_FLG ;
   private String AV19C_TAM02_APP_ID ;
   private String AV44W_IKKATU_FLG ;
   private String AV38W_A821_JS ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String A12TAM03_APP_ID ;
   private String A314TAM03_APP_NM ;
   private String A315TAM03_SUB_MENU_FLG ;
   private String A13TAM04_AUTH_CD ;
   private String A288TAM05_KNGN_FLG ;
   private String AV7D_GRD_TAM03_APP_ID ;
   private String AV8D_GRD_TAM03_APP_NM ;
   private String AV5D_GRD_MENU_TAM05_KNGN_FLG ;
   private String AV9D_GRD_TAM03_SUB_MENU_FLG ;
   private String AV6D_GRD_RIYO_TAM05_KNGN_FLG ;
   private String AV20D_TAM03_APP_ID ;
   private String AV24D_TAM05_KNGN_FLG ;
   private String AV22D_TAM04_CRT_USER_NM ;
   private String AV23D_TAM04_UPD_USER_NM ;
   private String AV27H_INIT_FLG ;
   private String AV28H_KNGN_FLG ;
   private String AV29H_MODE ;
   private String AV12W_TAM04_KNGN_PTN_KBN ;
   private String AV30H_TAM03_APP_ID ;
   private String AV18C_GAMEN_TITLE ;
   private String AV45W_MSG ;
   private String AV42W_EXST_FLG ;
   private String lV30H_TAM03_APP_ID ;
   private String AV40W_ERRCD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtTAM04BC_KNGN AV14BC_KNGN_PTN ;
   private HTMLChoice radavD_tam05_kngn_flg ;
   private HTMLChoice radavD_grd_menu_tam05_kngn_flg ;
   private HTMLChoice radavD_grd_riyo_tam05_kngn_flg ;
   private IDataStoreProvider pr_default ;
   private String[] H000R2_A12TAM03_APP_ID ;
   private String[] H000R3_A55TAM07_USER_ID ;
   private String[] H000R3_A205TAM07_USER_NM ;
   private boolean[] H000R3_n205TAM07_USER_NM ;
   private String[] H000R4_A55TAM07_USER_ID ;
   private String[] H000R4_A205TAM07_USER_NM ;
   private boolean[] H000R4_n205TAM07_USER_NM ;
   private String[] H000R5_A12TAM03_APP_ID ;
   private String[] H000R5_A314TAM03_APP_NM ;
   private boolean[] H000R5_n314TAM03_APP_NM ;
   private String[] H000R5_A315TAM03_SUB_MENU_FLG ;
   private boolean[] H000R5_n315TAM03_SUB_MENU_FLG ;
   private String[] H000R6_A12TAM03_APP_ID ;
   private String[] H000R6_A13TAM04_AUTH_CD ;
   private String[] H000R6_A288TAM05_KNGN_FLG ;
   private boolean[] H000R6_n288TAM05_KNGN_FLG ;
   private GxObjectCollection AV11W_A202_SD01_APPLI_KNGN_LIST ;
   private GxObjectCollection AV17C_BCMSGS ;
   private SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem AV37W_A202_SD01_APPLI_KNGN_LIST_Item ;
   private SdtTAM04BC_KNGN_TAM05_APPLI AV13BC_APPLI_KNGN ;
   private SdtMessages_Message AV16C_BCMSG ;
   private SdtA_LOGIN_SDT AV34W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class a202_wp01_kngn_ptn_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV30H_TAM03_APP_ID ,
                                          String A12TAM03_APP_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [1] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI`" ;
      if ( ! (GXutil.strcmp("", AV30H_TAM03_APP_ID)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAM03_APP_ID` like CONCAT(?, '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAM03_APP_ID` like CONCAT(?, '%'))" ;
         }
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TAM03_APP_ID`" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_H000R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H000R3", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000R4", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H000R5", "SELECT `TAM03_APP_ID`, `TAM03_APP_NM`, `TAM03_SUB_MENU_FLG` FROM `TAM03_APPLI` ORDER BY `TAM03_APP_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H000R6", "SELECT `TAM03_APP_ID`, `TAM04_AUTH_CD`, `TAM05_KNGN_FLG` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? and `TAM03_APP_ID` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[1], 7);
               }
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
      }
   }

}

