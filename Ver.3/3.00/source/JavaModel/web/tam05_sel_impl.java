/*
               File: tam05_sel_impl
        Description: アプリケーション権限マスタ検索プロンプト
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:45.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam05_sel_impl extends GXDataArea
{
   public tam05_sel_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam05_sel_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam05_sel_impl.class ));
   }

   public tam05_sel_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            nRC_GXsfl_51 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_51_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_51_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_51, nGXsfl_51_idx, sGXsfl_51_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV6cTAM04_KNGN_PTN_KBN = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM04_KNGN_PTN_KBN", AV6cTAM04_KNGN_PTN_KBN);
            AV7cTAM03_APP_ID = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM03_APP_ID", AV7cTAM03_APP_ID);
            AV8cTAM05_KNGN_FLG = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM05_KNGN_FLG", AV8cTAM05_KNGN_FLG);
            AV9cTAM05_DEL_FLG = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTAM05_DEL_FLG", AV9cTAM05_DEL_FLG);
            AV10cTAM05_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTAM05_CRT_DATETIME", localUtil.ttoc( AV10cTAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            AV11cTAM05_CRT_USER_ID = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTAM05_CRT_USER_ID", AV11cTAM05_CRT_USER_ID);
            AV12cTAM05_CRT_PROG_NM = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cTAM05_CRT_PROG_NM", AV12cTAM05_CRT_PROG_NM);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cTAM04_KNGN_PTN_KBN, AV7cTAM03_APP_ID, AV8cTAM05_KNGN_FLG, AV9cTAM05_DEL_FLG, AV10cTAM05_CRT_DATETIME, AV11cTAM05_CRT_USER_ID, AV12cTAM05_CRT_PROG_NM) ;
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
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
            AV13pTAM04_KNGN_PTN_KBN = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM04_KNGN_PTN_KBN", AV13pTAM04_KNGN_PTN_KBN);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14pTAM03_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pTAM03_APP_ID", AV14pTAM03_APP_ID);
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
         MasterPageObj = new promptmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa2A2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2A2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513304514");
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-ja.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "tam05_sel"+GXutil.URLEncode(GXutil.rtrim(AV13pTAM04_KNGN_PTN_KBN)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pTAM03_APP_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam05_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM04_KNGN_PTN_KBN", GXutil.rtrim( AV6cTAM04_KNGN_PTN_KBN));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM03_APP_ID", GXutil.rtrim( AV7cTAM03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_KNGN_FLG", GXutil.rtrim( AV8cTAM05_KNGN_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_DEL_FLG", GXutil.rtrim( AV9cTAM05_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_CRT_DATETIME", localUtil.format(AV10cTAM05_CRT_DATETIME, "9999/99/99 99:99:99"));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_CRT_USER_ID", GXutil.rtrim( AV11cTAM05_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM05_CRT_PROG_NM", GXutil.rtrim( AV12cTAM05_CRT_PROG_NM));
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_51", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_51, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM04_KNGN_PTN_KBN", GXutil.rtrim( AV13pTAM04_KNGN_PTN_KBN));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM03_APP_ID", GXutil.rtrim( AV14pTAM03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
      httpContext.SendAjaxEncryptionKey();
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      httpContext.writeTextNL( "</form>") ;
      include_jscripts( ) ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we2A2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2A2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "tam05_sel"+GXutil.URLEncode(GXutil.rtrim(AV13pTAM04_KNGN_PTN_KBN)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pTAM03_APP_ID)) ;
      return formatLink("tam05_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public String getPgmname( )
   {
      return "TAM05_SEL" ;
   }

   public String getPgmdesc( )
   {
      return "アプリケーション権限マスタ検索プロンプト" ;
   }

   public void wb2A0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         wb_table1_2_2A2( true) ;
      }
      else
      {
         wb_table1_2_2A2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_2A2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start2A2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "アプリケーション権限マスタ検索プロンプト", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2A0( ) ;
   }

   public void ws2A2( )
   {
      start2A2( ) ;
      evt2A2( ) ;
   }

   public void evt2A2( )
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
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
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
                           /* No code required for Cancel button. It is implemented as the Reset button. */
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_51_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_512( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           A13TAM04_AUTH_CD = httpContext.cgiGet( edtTAM04_AUTH_CD_Internalname) ;
                           A12TAM03_APP_ID = httpContext.cgiGet( edtTAM03_APP_ID_Internalname) ;
                           A288TAM05_KNGN_FLG = httpContext.cgiGet( edtTAM05_KNGN_FLG_Internalname) ;
                           n288TAM05_KNGN_FLG = false ;
                           A289TAM05_DEL_FLG = httpContext.cgiGet( edtTAM05_DEL_FLG_Internalname) ;
                           n289TAM05_DEL_FLG = false ;
                           A290TAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_CRT_DATETIME_Internalname)) ;
                           n290TAM05_CRT_DATETIME = false ;
                           A291TAM05_CRT_USER_ID = httpContext.cgiGet( edtTAM05_CRT_USER_ID_Internalname) ;
                           n291TAM05_CRT_USER_ID = false ;
                           A293TAM05_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_UPD_DATETIME_Internalname)) ;
                           n293TAM05_UPD_DATETIME = false ;
                           A294TAM05_UPD_USER_ID = httpContext.cgiGet( edtTAM05_UPD_USER_ID_Internalname) ;
                           n294TAM05_UPD_USER_ID = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e112A2 */
                                 e112A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e122A2 */
                                 e122A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctam04_kngn_ptn_kbn Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM04_KNGN_PTN_KBN"), AV6cTAM04_KNGN_PTN_KBN) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam03_app_id Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM03_APP_ID"), AV7cTAM03_APP_ID) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_kngn_flg Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_KNGN_FLG"), AV8cTAM05_KNGN_FLG) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_del_flg Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_DEL_FLG"), AV9cTAM05_DEL_FLG) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_crt_datetime Changed */
                                    if ( !( localUtil.ctot( httpContext.cgiGet( "GXH_vCTAM05_CRT_DATETIME")).equals( AV10cTAM05_CRT_DATETIME ) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_crt_user_id Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_CRT_USER_ID"), AV11cTAM05_CRT_USER_ID) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam05_crt_prog_nm Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_CRT_PROG_NM"), AV12cTAM05_CRT_PROG_NM) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: e132A2 */
                                       e132A2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2A2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa2A2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "tam05_sel")), "tam05_sel") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "tam05_sel"))) ;
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
                  AV13pTAM04_KNGN_PTN_KBN = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM04_KNGN_PTN_KBN", AV13pTAM04_KNGN_PTN_KBN);
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV14pTAM03_APP_ID = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14pTAM03_APP_ID", AV14pTAM03_APP_ID);
                  }
               }
            }
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_51 ,
                                 short nGXsfl_51_idx ,
                                 String sGXsfl_51_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_512( ) ;
      while ( nGXsfl_51_idx <= nRC_GXsfl_51 )
      {
         sendrow_512( ) ;
         nGXsfl_51_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_51_idx+1)) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_512( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cTAM04_KNGN_PTN_KBN ,
                                  String AV7cTAM03_APP_ID ,
                                  String AV8cTAM05_KNGN_FLG ,
                                  String AV9cTAM05_DEL_FLG ,
                                  java.util.Date AV10cTAM05_CRT_DATETIME ,
                                  String AV11cTAM05_CRT_USER_ID ,
                                  String AV12cTAM05_CRT_PROG_NM )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      rf2A2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf2A2( ) ;
      /* End function Refresh */
   }

   public void rf2A2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "Grid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      wbStart = (short)(51) ;
      nGXsfl_51_idx = (short)(1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_512( ) ;
      nGXsfl_51_Refreshing = (short)(1) ;
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_512( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         lV6cTAM04_KNGN_PTN_KBN = GXutil.padr( GXutil.rtrim( AV6cTAM04_KNGN_PTN_KBN), 2, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM04_KNGN_PTN_KBN", AV6cTAM04_KNGN_PTN_KBN);
         lV7cTAM03_APP_ID = GXutil.padr( GXutil.rtrim( AV7cTAM03_APP_ID), 7, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM03_APP_ID", AV7cTAM03_APP_ID);
         lV8cTAM05_KNGN_FLG = GXutil.padr( GXutil.rtrim( AV8cTAM05_KNGN_FLG), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM05_KNGN_FLG", AV8cTAM05_KNGN_FLG);
         lV9cTAM05_DEL_FLG = GXutil.padr( GXutil.rtrim( AV9cTAM05_DEL_FLG), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTAM05_DEL_FLG", AV9cTAM05_DEL_FLG);
         lV11cTAM05_CRT_USER_ID = GXutil.padr( GXutil.rtrim( AV11cTAM05_CRT_USER_ID), 128, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTAM05_CRT_USER_ID", AV11cTAM05_CRT_USER_ID);
         lV12cTAM05_CRT_PROG_NM = GXutil.padr( GXutil.rtrim( AV12cTAM05_CRT_PROG_NM), 40, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTAM05_CRT_PROG_NM", AV12cTAM05_CRT_PROG_NM);
         /* Using cursor H002A2 */
         pr_default.execute(0, new Object[] {lV6cTAM04_KNGN_PTN_KBN, lV7cTAM03_APP_ID, lV8cTAM05_KNGN_FLG, lV9cTAM05_DEL_FLG, AV10cTAM05_CRT_DATETIME, lV11cTAM05_CRT_USER_ID, lV12cTAM05_CRT_PROG_NM, new Integer(GXPagingFrom2), new Long(GXPagingTo2)});
         nGXsfl_51_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A292TAM05_CRT_PROG_NM = H002A2_A292TAM05_CRT_PROG_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A292TAM05_CRT_PROG_NM", A292TAM05_CRT_PROG_NM);
            n292TAM05_CRT_PROG_NM = H002A2_n292TAM05_CRT_PROG_NM[0] ;
            A294TAM05_UPD_USER_ID = H002A2_A294TAM05_UPD_USER_ID[0] ;
            n294TAM05_UPD_USER_ID = H002A2_n294TAM05_UPD_USER_ID[0] ;
            A293TAM05_UPD_DATETIME = H002A2_A293TAM05_UPD_DATETIME[0] ;
            n293TAM05_UPD_DATETIME = H002A2_n293TAM05_UPD_DATETIME[0] ;
            A291TAM05_CRT_USER_ID = H002A2_A291TAM05_CRT_USER_ID[0] ;
            n291TAM05_CRT_USER_ID = H002A2_n291TAM05_CRT_USER_ID[0] ;
            A290TAM05_CRT_DATETIME = H002A2_A290TAM05_CRT_DATETIME[0] ;
            n290TAM05_CRT_DATETIME = H002A2_n290TAM05_CRT_DATETIME[0] ;
            A289TAM05_DEL_FLG = H002A2_A289TAM05_DEL_FLG[0] ;
            n289TAM05_DEL_FLG = H002A2_n289TAM05_DEL_FLG[0] ;
            A288TAM05_KNGN_FLG = H002A2_A288TAM05_KNGN_FLG[0] ;
            n288TAM05_KNGN_FLG = H002A2_n288TAM05_KNGN_FLG[0] ;
            A12TAM03_APP_ID = H002A2_A12TAM03_APP_ID[0] ;
            A13TAM04_AUTH_CD = H002A2_A13TAM04_AUTH_CD[0] ;
            /* Execute user event: e122A2 */
            e122A2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(51) ;
         wb2A0( ) ;
      }
      nGXsfl_51_Refreshing = (short)(0) ;
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
      lV6cTAM04_KNGN_PTN_KBN = GXutil.padr( GXutil.rtrim( AV6cTAM04_KNGN_PTN_KBN), 2, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM04_KNGN_PTN_KBN", AV6cTAM04_KNGN_PTN_KBN);
      lV7cTAM03_APP_ID = GXutil.padr( GXutil.rtrim( AV7cTAM03_APP_ID), 7, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM03_APP_ID", AV7cTAM03_APP_ID);
      lV8cTAM05_KNGN_FLG = GXutil.padr( GXutil.rtrim( AV8cTAM05_KNGN_FLG), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM05_KNGN_FLG", AV8cTAM05_KNGN_FLG);
      lV9cTAM05_DEL_FLG = GXutil.padr( GXutil.rtrim( AV9cTAM05_DEL_FLG), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cTAM05_DEL_FLG", AV9cTAM05_DEL_FLG);
      lV11cTAM05_CRT_USER_ID = GXutil.padr( GXutil.rtrim( AV11cTAM05_CRT_USER_ID), 128, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cTAM05_CRT_USER_ID", AV11cTAM05_CRT_USER_ID);
      lV12cTAM05_CRT_PROG_NM = GXutil.padr( GXutil.rtrim( AV12cTAM05_CRT_PROG_NM), 40, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cTAM05_CRT_PROG_NM", AV12cTAM05_CRT_PROG_NM);
      /* Using cursor H002A3 */
      pr_default.execute(1, new Object[] {lV6cTAM04_KNGN_PTN_KBN, lV7cTAM03_APP_ID, lV8cTAM05_KNGN_FLG, lV9cTAM05_DEL_FLG, AV10cTAM05_CRT_DATETIME, lV11cTAM05_CRT_USER_ID, lV12cTAM05_CRT_PROG_NM});
      GRID1_nRecordCount = H002A3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
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

   public void strup2A0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e112A2 */
      e112A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cTAM04_KNGN_PTN_KBN = httpContext.cgiGet( edtavCtam04_kngn_ptn_kbn_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM04_KNGN_PTN_KBN", AV6cTAM04_KNGN_PTN_KBN);
         AV7cTAM03_APP_ID = httpContext.cgiGet( edtavCtam03_app_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM03_APP_ID", AV7cTAM03_APP_ID);
         AV8cTAM05_KNGN_FLG = httpContext.cgiGet( edtavCtam05_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM05_KNGN_FLG", AV8cTAM05_KNGN_FLG);
         AV9cTAM05_DEL_FLG = httpContext.cgiGet( edtavCtam05_del_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTAM05_DEL_FLG", AV9cTAM05_DEL_FLG);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtam05_crt_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCTAM05_CRT_DATETIME");
            GX_FocusControl = edtavCtam05_crt_datetime_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cTAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTAM05_CRT_DATETIME", localUtil.ttoc( AV10cTAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         }
         else
         {
            AV10cTAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtavCtam05_crt_datetime_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cTAM05_CRT_DATETIME", localUtil.ttoc( AV10cTAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         }
         AV11cTAM05_CRT_USER_ID = httpContext.cgiGet( edtavCtam05_crt_user_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTAM05_CRT_USER_ID", AV11cTAM05_CRT_USER_ID);
         AV12cTAM05_CRT_PROG_NM = httpContext.cgiGet( edtavCtam05_crt_prog_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTAM05_CRT_PROG_NM", AV12cTAM05_CRT_PROG_NM);
         /* Read saved values. */
         nRC_GXsfl_51 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_51"), ".", ",")) ;
         AV13pTAM04_KNGN_PTN_KBN = httpContext.cgiGet( "vPTAM04_KNGN_PTN_KBN") ;
         AV14pTAM03_APP_ID = httpContext.cgiGet( "vPTAM03_APP_ID") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM04_KNGN_PTN_KBN"), AV6cTAM04_KNGN_PTN_KBN) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM03_APP_ID"), AV7cTAM03_APP_ID) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_KNGN_FLG"), AV8cTAM05_KNGN_FLG) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_DEL_FLG"), AV9cTAM05_DEL_FLG) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( localUtil.ctot( httpContext.cgiGet( "GXH_vCTAM05_CRT_DATETIME")).equals( AV10cTAM05_CRT_DATETIME ) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_CRT_USER_ID"), AV11cTAM05_CRT_USER_ID) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM05_CRT_PROG_NM"), AV12cTAM05_CRT_PROG_NM) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e112A2 */
      e112A2 ();
      if (returnInSub) return;
   }

   public void e112A2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "選択リスト %1", "アプリケーション権限マスタ", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
   }

   private void e122A2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_512( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   public void GXEnter( )
   {
      /* Execute user event: e132A2 */
      e132A2 ();
      if (returnInSub) return;
   }

   public void e132A2( )
   {
      /* Enter Routine */
      AV13pTAM04_KNGN_PTN_KBN = A13TAM04_AUTH_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM04_KNGN_PTN_KBN", AV13pTAM04_KNGN_PTN_KBN);
      AV14pTAM03_APP_ID = A12TAM03_APP_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pTAM03_APP_ID", AV14pTAM03_APP_ID);
      httpContext.setWebReturnParms(new Object[] {AV13pTAM04_KNGN_PTN_KBN,AV14pTAM03_APP_ID});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void wb_table1_2_2A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroup1_Internalname, "Filters", 1, 0, "px", 0, "px", "FieldSet", "", "HLP_TAM05_SEL.htm");
         wb_table2_9_2A2( true) ;
      }
      else
      {
         wb_table2_9_2A2( false) ;
      }
      return  ;
   }

   public void wb_table2_9_2A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroup2_Internalname, "選択リスト", 1, 0, "px", 0, "px", "FieldSet", "", "HLP_TAM05_SEL.htm");
         wb_table3_48_2A2( true) ;
      }
      else
      {
         wb_table3_48_2A2( false) ;
      }
      return  ;
   }

   public void wb_table3_48_2A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_2A2e( true) ;
      }
      else
      {
         wb_table1_2_2A2e( false) ;
      }
   }

   public void wb_table3_48_2A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"51\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "Grid", 0, "", "", 1, 0, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "権限パターン区分") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "アプリケーションID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "権限フラグ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "削除フラグ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "作成日時") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "作成ユーザーID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "更新日時") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "更新ユーザーID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "Grid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13TAM04_AUTH_CD));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12TAM03_APP_ID));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A288TAM05_KNGN_FLG));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtTAM05_KNGN_FLG_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A289TAM05_DEL_FLG));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A291TAM05_CRT_USER_ID));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A294TAM05_UPD_USER_ID));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 51 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_51 = (short)(nGXsfl_51_idx-1) ;
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
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table4_63_2A2( true) ;
      }
      else
      {
         wb_table4_63_2A2( false) ;
      }
      return  ;
   }

   public void wb_table4_63_2A2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_48_2A2e( true) ;
      }
      else
      {
         wb_table3_48_2A2e( false) ;
      }
   }

   public void wb_table4_63_2A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_63_2A2e( true) ;
      }
      else
      {
         wb_table4_63_2A2e( false) ;
      }
   }

   public void wb_table2_9_2A2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_kngn_ptn_kbn_Internalname, "権限パターン区分", "", "", lblTextblocktam04_kngn_ptn_kbn_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam04_kngn_ptn_kbn_Internalname, GXutil.rtrim( AV6cTAM04_KNGN_PTN_KBN), GXutil.rtrim( localUtil.format( AV6cTAM04_KNGN_PTN_KBN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(14);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam04_kngn_ptn_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_app_id_Internalname, "アプリケーションID", "", "", lblTextblocktam03_app_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam03_app_id_Internalname, GXutil.rtrim( AV7cTAM03_APP_ID), GXutil.rtrim( localUtil.format( AV7cTAM03_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam03_app_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_kngn_flg_Internalname, "権限フラグ", "", "", lblTextblocktam05_kngn_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_kngn_flg_Internalname, GXutil.rtrim( AV8cTAM05_KNGN_FLG), GXutil.rtrim( localUtil.format( AV8cTAM05_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam05_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam05_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_del_flg_Internalname, GXutil.rtrim( AV9cTAM05_DEL_FLG), GXutil.rtrim( localUtil.format( AV9cTAM05_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam05_del_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam05_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCtam05_crt_datetime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_crt_datetime_Internalname, localUtil.format(AV10cTAM05_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( AV10cTAM05_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam05_crt_datetime_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAM05_SEL.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtam05_crt_datetime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM05_SEL.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam05_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_crt_user_id_Internalname, GXutil.rtrim( AV11cTAM05_CRT_USER_ID), GXutil.rtrim( localUtil.format( AV11cTAM05_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam05_crt_user_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam05_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam05_crt_prog_nm_Internalname, GXutil.rtrim( AV12cTAM05_CRT_PROG_NM), GXutil.rtrim( localUtil.format( AV12cTAM05_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam05_crt_prog_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM05_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_9_2A2e( true) ;
      }
      else
      {
         wb_table2_9_2A2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV13pTAM04_KNGN_PTN_KBN = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM04_KNGN_PTN_KBN", AV13pTAM04_KNGN_PTN_KBN);
      AV14pTAM03_APP_ID = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pTAM03_APP_ID", AV14pTAM03_APP_ID);
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
      pa2A2( ) ;
      ws2A2( ) ;
      we2A2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
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
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513304556");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam05_sel.js", "?202071513304556");
      /* End function include_jscripts */
   }

   public void subsflControlProps_512( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_51_idx ;
      edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_51_idx ;
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_51_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_51_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_51_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_51_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_51_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_51_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_51_idx ;
   }

   public void subsflControlProps_fel_512( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_51_fel_idx ;
      edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD_"+sGXsfl_51_fel_idx ;
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_51_fel_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_51_fel_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_51_fel_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_51_fel_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_51_fel_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_51_fel_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_51_fel_idx ;
   }

   public void sendrow_512( )
   {
      subsflControlProps_512( ) ;
      wb2A0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_51_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_51_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+subGrid1_Linesclass+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_51_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13TAM04_AUTH_CD))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12TAM03_APP_ID))+"'"+"]);" ;
         ClassString = "Image" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)),edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","選択",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","''","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM04_AUTH_CD_Internalname,GXutil.rtrim( A13TAM04_AUTH_CD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM04_AUTH_CD_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_AUTH_CD","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM03_APP_ID_Internalname,GXutil.rtrim( A12TAM03_APP_ID),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM03_APP_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         edtTAM05_KNGN_FLG_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13TAM04_AUTH_CD))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12TAM03_APP_ID))+"'"+"]);" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_KNGN_FLG_Internalname,GXutil.rtrim( A288TAM05_KNGN_FLG),"","","'"+""+"'"+",false,"+"'"+""+"'",edtTAM05_KNGN_FLG_Link,"","選択","",edtTAM05_KNGN_FLG_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_FLG","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_DEL_FLG_Internalname,GXutil.rtrim( A289TAM05_DEL_FLG),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_DEL_FLG_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_FLG","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_CRT_DATETIME_Internalname,localUtil.format(A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99"),localUtil.format( A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_CRT_DATETIME_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_Y4MD_HMS","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_CRT_USER_ID_Internalname,GXutil.rtrim( A291TAM05_CRT_USER_ID),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_CRT_USER_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_TS_USER_ID","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_UPD_DATETIME_Internalname,localUtil.format(A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99"),localUtil.format( A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_UPD_DATETIME_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_Y4MD_HMS","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_UPD_USER_ID_Internalname,GXutil.rtrim( A294TAM05_UPD_USER_ID),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_UPD_USER_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(51),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_TS_USER_ID","left"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_51_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_51_idx+1)) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_51_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_512( ) ;
      }
      /* End function sendrow_512 */
   }

   public void init_default_properties( )
   {
      lblTextblocktam04_kngn_ptn_kbn_Internalname = "TEXTBLOCKTAM04_KNGN_PTN_KBN" ;
      edtavCtam04_kngn_ptn_kbn_Internalname = "vCTAM04_KNGN_PTN_KBN" ;
      lblTextblocktam03_app_id_Internalname = "TEXTBLOCKTAM03_APP_ID" ;
      edtavCtam03_app_id_Internalname = "vCTAM03_APP_ID" ;
      lblTextblocktam05_kngn_flg_Internalname = "TEXTBLOCKTAM05_KNGN_FLG" ;
      edtavCtam05_kngn_flg_Internalname = "vCTAM05_KNGN_FLG" ;
      lblTextblocktam05_del_flg_Internalname = "TEXTBLOCKTAM05_DEL_FLG" ;
      edtavCtam05_del_flg_Internalname = "vCTAM05_DEL_FLG" ;
      lblTextblocktam05_crt_datetime_Internalname = "TEXTBLOCKTAM05_CRT_DATETIME" ;
      edtavCtam05_crt_datetime_Internalname = "vCTAM05_CRT_DATETIME" ;
      lblTextblocktam05_crt_user_id_Internalname = "TEXTBLOCKTAM05_CRT_USER_ID" ;
      edtavCtam05_crt_user_id_Internalname = "vCTAM05_CRT_USER_ID" ;
      lblTextblocktam05_crt_prog_nm_Internalname = "TEXTBLOCKTAM05_CRT_PROG_NM" ;
      edtavCtam05_crt_prog_nm_Internalname = "vCTAM05_CRT_PROG_NM" ;
      tblTable2_Internalname = "TABLE2" ;
      grpGroup1_Internalname = "GROUP1" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      grpGroup2_Internalname = "GROUP2" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtTAM05_UPD_USER_ID_Jsonclick = "" ;
      edtTAM05_UPD_DATETIME_Jsonclick = "" ;
      edtTAM05_CRT_USER_ID_Jsonclick = "" ;
      edtTAM05_CRT_DATETIME_Jsonclick = "" ;
      edtTAM05_DEL_FLG_Jsonclick = "" ;
      edtTAM05_KNGN_FLG_Jsonclick = "" ;
      edtTAM03_APP_ID_Jsonclick = "" ;
      edtTAM04_AUTH_CD_Jsonclick = "" ;
      edtavCtam05_crt_prog_nm_Jsonclick = "" ;
      edtavCtam05_crt_user_id_Jsonclick = "" ;
      edtavCtam05_crt_datetime_Jsonclick = "" ;
      edtavCtam05_del_flg_Jsonclick = "" ;
      edtavCtam05_kngn_flg_Jsonclick = "" ;
      edtavCtam03_app_id_Jsonclick = "" ;
      edtavCtam04_kngn_ptn_kbn_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtTAM05_KNGN_FLG_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "Grid" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "アプリケーション権限マスタ検索プロンプト" );
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
   public void initialize( )
   {
      wcpOAV13pTAM04_KNGN_PTN_KBN = "" ;
      wcpOAV14pTAM03_APP_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6cTAM04_KNGN_PTN_KBN = "" ;
      AV7cTAM03_APP_ID = "" ;
      AV8cTAM05_KNGN_FLG = "" ;
      AV9cTAM05_DEL_FLG = "" ;
      AV10cTAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV11cTAM05_CRT_USER_ID = "" ;
      AV12cTAM05_CRT_PROG_NM = "" ;
      AV13pTAM04_KNGN_PTN_KBN = "" ;
      AV14pTAM03_APP_ID = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV5LinkSelection = "" ;
      edtavLinkselection_Internalname = "" ;
      A13TAM04_AUTH_CD = "" ;
      edtTAM04_AUTH_CD_Internalname = "" ;
      A12TAM03_APP_ID = "" ;
      edtTAM03_APP_ID_Internalname = "" ;
      A288TAM05_KNGN_FLG = "" ;
      edtTAM05_KNGN_FLG_Internalname = "" ;
      A289TAM05_DEL_FLG = "" ;
      edtTAM05_DEL_FLG_Internalname = "" ;
      A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      edtTAM05_CRT_DATETIME_Internalname = "" ;
      A291TAM05_CRT_USER_ID = "" ;
      edtTAM05_CRT_USER_ID_Internalname = "" ;
      A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      edtTAM05_UPD_DATETIME_Internalname = "" ;
      A294TAM05_UPD_USER_ID = "" ;
      edtTAM05_UPD_USER_ID_Internalname = "" ;
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV6cTAM04_KNGN_PTN_KBN = "" ;
      lV7cTAM03_APP_ID = "" ;
      lV8cTAM05_KNGN_FLG = "" ;
      lV9cTAM05_DEL_FLG = "" ;
      lV11cTAM05_CRT_USER_ID = "" ;
      lV12cTAM05_CRT_PROG_NM = "" ;
      H002A2_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      H002A2_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      H002A2_A294TAM05_UPD_USER_ID = new String[] {""} ;
      H002A2_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      H002A2_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H002A2_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      H002A2_A291TAM05_CRT_USER_ID = new String[] {""} ;
      H002A2_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      H002A2_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H002A2_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      H002A2_A289TAM05_DEL_FLG = new String[] {""} ;
      H002A2_n289TAM05_DEL_FLG = new boolean[] {false} ;
      H002A2_A288TAM05_KNGN_FLG = new String[] {""} ;
      H002A2_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      H002A2_A12TAM03_APP_ID = new String[] {""} ;
      H002A2_A13TAM04_AUTH_CD = new String[] {""} ;
      A292TAM05_CRT_PROG_NM = "" ;
      H002A3_AGRID1_nRecordCount = new long[1] ;
      AV17Linkselection_GXI = "" ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      TempTags = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      lblTextblocktam04_kngn_ptn_kbn_Jsonclick = "" ;
      lblTextblocktam03_app_id_Jsonclick = "" ;
      lblTextblocktam05_kngn_flg_Jsonclick = "" ;
      lblTextblocktam05_del_flg_Jsonclick = "" ;
      lblTextblocktam05_crt_datetime_Jsonclick = "" ;
      lblTextblocktam05_crt_user_id_Jsonclick = "" ;
      lblTextblocktam05_crt_prog_nm_Jsonclick = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam05_sel__default(),
         new Object[] {
             new Object[] {
            H002A2_A292TAM05_CRT_PROG_NM, H002A2_n292TAM05_CRT_PROG_NM, H002A2_A294TAM05_UPD_USER_ID, H002A2_n294TAM05_UPD_USER_ID, H002A2_A293TAM05_UPD_DATETIME, H002A2_n293TAM05_UPD_DATETIME, H002A2_A291TAM05_CRT_USER_ID, H002A2_n291TAM05_CRT_USER_ID, H002A2_A290TAM05_CRT_DATETIME, H002A2_n290TAM05_CRT_DATETIME,
            H002A2_A289TAM05_DEL_FLG, H002A2_n289TAM05_DEL_FLG, H002A2_A288TAM05_KNGN_FLG, H002A2_n288TAM05_KNGN_FLG, H002A2_A12TAM03_APP_ID, H002A2_A13TAM04_AUTH_CD
            }
            , new Object[] {
            H002A3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_51 ;
   private short nGXsfl_51_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short Gx_err ;
   private short nGXsfl_51_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXPagingTo2 ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_51_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtTAM04_AUTH_CD_Internalname ;
   private String edtTAM03_APP_ID_Internalname ;
   private String edtTAM05_KNGN_FLG_Internalname ;
   private String edtTAM05_DEL_FLG_Internalname ;
   private String edtTAM05_CRT_DATETIME_Internalname ;
   private String edtTAM05_CRT_USER_ID_Internalname ;
   private String edtTAM05_UPD_DATETIME_Internalname ;
   private String edtTAM05_UPD_USER_ID_Internalname ;
   private String GXDecQS ;
   private String scmdbuf ;
   private String edtavCtam04_kngn_ptn_kbn_Internalname ;
   private String edtavCtam03_app_id_Internalname ;
   private String edtavCtam05_kngn_flg_Internalname ;
   private String edtavCtam05_del_flg_Internalname ;
   private String edtavCtam05_crt_datetime_Internalname ;
   private String edtavCtam05_crt_user_id_Internalname ;
   private String edtavCtam05_crt_prog_nm_Internalname ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String grpGroup1_Internalname ;
   private String grpGroup2_Internalname ;
   private String tblTable3_Internalname ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String edtTAM05_KNGN_FLG_Link ;
   private String tblTable4_Internalname ;
   private String TempTags ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblocktam04_kngn_ptn_kbn_Internalname ;
   private String lblTextblocktam04_kngn_ptn_kbn_Jsonclick ;
   private String edtavCtam04_kngn_ptn_kbn_Jsonclick ;
   private String lblTextblocktam03_app_id_Internalname ;
   private String lblTextblocktam03_app_id_Jsonclick ;
   private String edtavCtam03_app_id_Jsonclick ;
   private String lblTextblocktam05_kngn_flg_Internalname ;
   private String lblTextblocktam05_kngn_flg_Jsonclick ;
   private String edtavCtam05_kngn_flg_Jsonclick ;
   private String lblTextblocktam05_del_flg_Internalname ;
   private String lblTextblocktam05_del_flg_Jsonclick ;
   private String edtavCtam05_del_flg_Jsonclick ;
   private String lblTextblocktam05_crt_datetime_Internalname ;
   private String lblTextblocktam05_crt_datetime_Jsonclick ;
   private String edtavCtam05_crt_datetime_Jsonclick ;
   private String lblTextblocktam05_crt_user_id_Internalname ;
   private String lblTextblocktam05_crt_user_id_Jsonclick ;
   private String edtavCtam05_crt_user_id_Jsonclick ;
   private String lblTextblocktam05_crt_prog_nm_Internalname ;
   private String lblTextblocktam05_crt_prog_nm_Jsonclick ;
   private String edtavCtam05_crt_prog_nm_Jsonclick ;
   private String sGXsfl_51_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTAM04_AUTH_CD_Jsonclick ;
   private String edtTAM03_APP_ID_Jsonclick ;
   private String edtTAM05_KNGN_FLG_Jsonclick ;
   private String edtTAM05_DEL_FLG_Jsonclick ;
   private String edtTAM05_CRT_DATETIME_Jsonclick ;
   private String edtTAM05_CRT_USER_ID_Jsonclick ;
   private String edtTAM05_UPD_DATETIME_Jsonclick ;
   private String edtTAM05_UPD_USER_ID_Jsonclick ;
   private java.util.Date AV10cTAM05_CRT_DATETIME ;
   private java.util.Date A290TAM05_CRT_DATETIME ;
   private java.util.Date A293TAM05_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n288TAM05_KNGN_FLG ;
   private boolean n289TAM05_DEL_FLG ;
   private boolean n290TAM05_CRT_DATETIME ;
   private boolean n291TAM05_CRT_USER_ID ;
   private boolean n293TAM05_UPD_DATETIME ;
   private boolean n294TAM05_UPD_USER_ID ;
   private boolean n292TAM05_CRT_PROG_NM ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String wcpOAV13pTAM04_KNGN_PTN_KBN ;
   private String wcpOAV14pTAM03_APP_ID ;
   private String AV6cTAM04_KNGN_PTN_KBN ;
   private String AV7cTAM03_APP_ID ;
   private String AV8cTAM05_KNGN_FLG ;
   private String AV9cTAM05_DEL_FLG ;
   private String AV11cTAM05_CRT_USER_ID ;
   private String AV12cTAM05_CRT_PROG_NM ;
   private String AV13pTAM04_KNGN_PTN_KBN ;
   private String AV14pTAM03_APP_ID ;
   private String A13TAM04_AUTH_CD ;
   private String A12TAM03_APP_ID ;
   private String A288TAM05_KNGN_FLG ;
   private String A289TAM05_DEL_FLG ;
   private String A291TAM05_CRT_USER_ID ;
   private String A294TAM05_UPD_USER_ID ;
   private String lV6cTAM04_KNGN_PTN_KBN ;
   private String lV7cTAM03_APP_ID ;
   private String lV8cTAM05_KNGN_FLG ;
   private String lV9cTAM05_DEL_FLG ;
   private String lV11cTAM05_CRT_USER_ID ;
   private String lV12cTAM05_CRT_PROG_NM ;
   private String A292TAM05_CRT_PROG_NM ;
   private String AV17Linkselection_GXI ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H002A2_A292TAM05_CRT_PROG_NM ;
   private boolean[] H002A2_n292TAM05_CRT_PROG_NM ;
   private String[] H002A2_A294TAM05_UPD_USER_ID ;
   private boolean[] H002A2_n294TAM05_UPD_USER_ID ;
   private java.util.Date[] H002A2_A293TAM05_UPD_DATETIME ;
   private boolean[] H002A2_n293TAM05_UPD_DATETIME ;
   private String[] H002A2_A291TAM05_CRT_USER_ID ;
   private boolean[] H002A2_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] H002A2_A290TAM05_CRT_DATETIME ;
   private boolean[] H002A2_n290TAM05_CRT_DATETIME ;
   private String[] H002A2_A289TAM05_DEL_FLG ;
   private boolean[] H002A2_n289TAM05_DEL_FLG ;
   private String[] H002A2_A288TAM05_KNGN_FLG ;
   private boolean[] H002A2_n288TAM05_KNGN_FLG ;
   private String[] H002A2_A12TAM03_APP_ID ;
   private String[] H002A2_A13TAM04_AUTH_CD ;
   private long[] H002A3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tam05_sel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002A2", "SELECT `TAM05_CRT_PROG_NM`, `TAM05_UPD_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_CRT_DATETIME`, `TAM05_DEL_FLG`, `TAM05_KNGN_FLG`, `TAM03_APP_ID`, `TAM04_AUTH_CD` FROM `TAM05_APPLI_KNGN` WHERE (`TAM04_AUTH_CD` like ?) AND (`TAM03_APP_ID` like ?) AND (`TAM05_KNGN_FLG` like ?) AND (`TAM05_DEL_FLG` like ?) AND (`TAM05_CRT_DATETIME` >= ?) AND (`TAM05_CRT_USER_ID` like ?) AND (`TAM05_CRT_PROG_NM` like ?) ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID`  LIMIT ?, ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H002A3", "SELECT COUNT(*) FROM `TAM05_APPLI_KNGN` WHERE (`TAM04_AUTH_CD` like ?) AND (`TAM03_APP_ID` like ?) AND (`TAM05_KNGN_FLG` like ?) AND (`TAM05_DEL_FLG` like ?) AND (`TAM05_CRT_DATETIME` >= ?) AND (`TAM05_CRT_USER_ID` like ?) AND (`TAM05_CRT_PROG_NM` like ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 1);
               stmt.setVarchar(4, (String)parms[3], 1);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 128);
               stmt.setVarchar(7, (String)parms[6], 40);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 1);
               stmt.setVarchar(4, (String)parms[3], 1);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setVarchar(6, (String)parms[5], 128);
               stmt.setVarchar(7, (String)parms[6], 40);
               return;
      }
   }

}

