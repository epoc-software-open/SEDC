/*
               File: tam07_sel_impl
        Description: ユーザマスタ検索プロンプト
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:50.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam07_sel_impl extends GXDataArea
{
   public tam07_sel_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam07_sel_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam07_sel_impl.class ));
   }

   public tam07_sel_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynavCtam07_kngn_ptn_kbn = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vCTAM07_KNGN_PTN_KBN") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvctam07_kngn_ptn_kbn2B2( ) ;
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
            nRC_GXsfl_26 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_26_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_26_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_26, nGXsfl_26_idx, sGXsfl_26_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV5cTAM07_KNGN_PTN_KBN = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5cTAM07_KNGN_PTN_KBN", AV5cTAM07_KNGN_PTN_KBN);
            AV6cTAM07_USER_NM = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM07_USER_NM", AV6cTAM07_USER_NM);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV5cTAM07_KNGN_PTN_KBN, AV6cTAM07_USER_NM) ;
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
            AV8pTAM07_USER_ID = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8pTAM07_USER_ID", AV8pTAM07_USER_ID);
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
         MasterPageObj.setDataArea(this,true);
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
      pa2B2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2B2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317205049");
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
      GXEncryptionTmp = "tam07_sel"+GXutil.URLEncode(GXutil.rtrim(AV8pTAM07_USER_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam07_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM07_KNGN_PTN_KBN", GXutil.rtrim( AV5cTAM07_KNGN_PTN_KBN));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM07_USER_NM", GXutil.rtrim( AV6cTAM07_USER_NM));
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_26", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_26, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM07_USER_ID", GXutil.rtrim( AV8pTAM07_USER_ID));
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
         we2B2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2B2( ) ;
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
      GXEncryptionTmp = "tam07_sel"+GXutil.URLEncode(GXutil.rtrim(AV8pTAM07_USER_ID)) ;
      return formatLink("tam07_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public String getPgmname( )
   {
      return "TAM07_SEL" ;
   }

   public String getPgmdesc( )
   {
      return "ユーザマスタ検索プロンプト" ;
   }

   public void wb2B0( )
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
         wb_table1_2_2B2( true) ;
      }
      else
      {
         wb_table1_2_2B2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_2B2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start2B2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "ユーザマスタ検索プロンプト", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2B0( ) ;
   }

   public void ws2B2( )
   {
      start2B2( ) ;
      evt2B2( ) ;
   }

   public void evt2B2( )
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
                           nGXsfl_26_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_262( ) ;
                           AV7LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           A55TAM07_USER_ID = httpContext.cgiGet( edtTAM07_USER_ID_Internalname) ;
                           A205TAM07_USER_NM = httpContext.cgiGet( edtTAM07_USER_NM_Internalname) ;
                           n205TAM07_USER_NM = false ;
                           A285TAM04_AUTH_NM = httpContext.cgiGet( edtTAM04_AUTH_NM_Internalname) ;
                           n285TAM04_AUTH_NM = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e112B2 */
                                 e112B2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e122B2 */
                                 e122B2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctam07_kngn_ptn_kbn Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM07_KNGN_PTN_KBN"), AV5cTAM07_KNGN_PTN_KBN) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam07_user_nm Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM07_USER_NM"), AV6cTAM07_USER_NM) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: e132B2 */
                                       e132B2 ();
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

   public void we2B2( )
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

   public void pa2B2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "tam07_sel")), "tam07_sel") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "tam07_sel"))) ;
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
                  AV8pTAM07_USER_ID = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV8pTAM07_USER_ID", AV8pTAM07_USER_ID);
               }
            }
         }
         dynavCtam07_kngn_ptn_kbn.setName( "vCTAM07_KNGN_PTN_KBN" );
         dynavCtam07_kngn_ptn_kbn.setWebtags( "" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlvvctam07_kngn_ptn_kbn2B2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvctam07_kngn_ptn_kbn_data2B2( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvctam07_kngn_ptn_kbn_html2B2( )
   {
      String gxdynajaxvalue ;
      gxdlvvctam07_kngn_ptn_kbn_data2B2( ) ;
      gxdynajaxindex = 1 ;
      dynavCtam07_kngn_ptn_kbn.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavCtam07_kngn_ptn_kbn.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavCtam07_kngn_ptn_kbn.getItemCount() > 0 )
      {
         AV5cTAM07_KNGN_PTN_KBN = dynavCtam07_kngn_ptn_kbn.getValidValue(AV5cTAM07_KNGN_PTN_KBN) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5cTAM07_KNGN_PTN_KBN", AV5cTAM07_KNGN_PTN_KBN);
      }
   }

   protected void gxdlvvctam07_kngn_ptn_kbn_data2B2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add("");
      gxdynajaxctrldescr.add("");
      /* Using cursor H002B2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H002B2_A13TAM04_AUTH_CD[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H002B2_A285TAM04_AUTH_NM[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_26 ,
                                 short nGXsfl_26_idx ,
                                 String sGXsfl_26_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_262( ) ;
      while ( nGXsfl_26_idx <= nRC_GXsfl_26 )
      {
         sendrow_262( ) ;
         nGXsfl_26_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_26_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_26_idx+1)) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_262( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV5cTAM07_KNGN_PTN_KBN ,
                                  String AV6cTAM07_USER_NM )
   {
      /* GeneXus formulas. */
      AV16Pgmname = "TAM07_SEL" ;
      Gx_err = (short)(0) ;
      dynavCtam07_kngn_ptn_kbn.setName( "vCTAM07_KNGN_PTN_KBN" );
      dynavCtam07_kngn_ptn_kbn.setWebtags( "" );
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      rf2B2( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf2B2( ) ;
      /* End function Refresh */
   }

   public void rf2B2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "Grid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      wbStart = (short)(26) ;
      nGXsfl_26_idx = (short)(1) ;
      sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_262( ) ;
      nGXsfl_26_Refreshing = (short)(1) ;
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_262( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV5cTAM07_KNGN_PTN_KBN ,
                                              AV6cTAM07_USER_NM ,
                                              A56TAM07_AUTH_CD ,
                                              A205TAM07_USER_NM },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         lV6cTAM07_USER_NM = GXutil.padr( GXutil.rtrim( AV6cTAM07_USER_NM), 30, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM07_USER_NM", AV6cTAM07_USER_NM);
         /* Using cursor H002B3 */
         pr_default.execute(1, new Object[] {AV5cTAM07_KNGN_PTN_KBN, lV6cTAM07_USER_NM, new Integer(GXPagingFrom2), new Long(GXPagingTo2)});
         nGXsfl_26_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A56TAM07_AUTH_CD = H002B3_A56TAM07_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A56TAM07_AUTH_CD", A56TAM07_AUTH_CD);
            n56TAM07_AUTH_CD = H002B3_n56TAM07_AUTH_CD[0] ;
            A285TAM04_AUTH_NM = H002B3_A285TAM04_AUTH_NM[0] ;
            n285TAM04_AUTH_NM = H002B3_n285TAM04_AUTH_NM[0] ;
            A205TAM07_USER_NM = H002B3_A205TAM07_USER_NM[0] ;
            n205TAM07_USER_NM = H002B3_n205TAM07_USER_NM[0] ;
            A55TAM07_USER_ID = H002B3_A55TAM07_USER_ID[0] ;
            A285TAM04_AUTH_NM = H002B3_A285TAM04_AUTH_NM[0] ;
            n285TAM04_AUTH_NM = H002B3_n285TAM04_AUTH_NM[0] ;
            /* Execute user event: e122B2 */
            e122B2 ();
            pr_default.readNext(1);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         pr_default.close(1);
         wbEnd = (short)(26) ;
         wb2B0( ) ;
      }
      nGXsfl_26_Refreshing = (short)(0) ;
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
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV5cTAM07_KNGN_PTN_KBN ,
                                           AV6cTAM07_USER_NM ,
                                           A56TAM07_AUTH_CD ,
                                           A205TAM07_USER_NM },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV6cTAM07_USER_NM = GXutil.padr( GXutil.rtrim( AV6cTAM07_USER_NM), 30, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM07_USER_NM", AV6cTAM07_USER_NM);
      /* Using cursor H002B4 */
      pr_default.execute(2, new Object[] {AV5cTAM07_KNGN_PTN_KBN, lV6cTAM07_USER_NM});
      GRID1_nRecordCount = H002B4_AGRID1_nRecordCount[0] ;
      pr_default.close(2);
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

   public void strup2B0( )
   {
      /* Before Start, stand alone formulas. */
      AV16Pgmname = "TAM07_SEL" ;
      Gx_err = (short)(0) ;
      gxvvctam07_kngn_ptn_kbn_html2B2( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e112B2 */
      e112B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         dynavCtam07_kngn_ptn_kbn.setName( dynavCtam07_kngn_ptn_kbn.getInternalname() );
         dynavCtam07_kngn_ptn_kbn.setValue( httpContext.cgiGet( dynavCtam07_kngn_ptn_kbn.getInternalname()) );
         AV5cTAM07_KNGN_PTN_KBN = httpContext.cgiGet( dynavCtam07_kngn_ptn_kbn.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5cTAM07_KNGN_PTN_KBN", AV5cTAM07_KNGN_PTN_KBN);
         AV6cTAM07_USER_NM = httpContext.cgiGet( edtavCtam07_user_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM07_USER_NM", AV6cTAM07_USER_NM);
         /* Read saved values. */
         nRC_GXsfl_26 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_26"), ".", ",")) ;
         AV8pTAM07_USER_ID = httpContext.cgiGet( "vPTAM07_USER_ID") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM07_KNGN_PTN_KBN"), AV5cTAM07_KNGN_PTN_KBN) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM07_USER_NM"), AV6cTAM07_USER_NM) != 0 )
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
      /* Execute user event: e112B2 */
      e112B2 ();
      if (returnInSub) return;
   }

   public void e112B2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "選択リスト %1", "ユーザーマスタ", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV9C_TAM02_APP_ID = "TAM07" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_TAM02_APP_ID", AV9C_TAM02_APP_ID);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV11W_ERRCD, "0") == 0 )
      {
         /* Execute user subroutine: S122 */
         S122 ();
         if (returnInSub) return;
      }
   }

   private void e122B2( )
   {
      /* Load Routine */
      AV7LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV15Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_262( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   public void GXEnter( )
   {
      /* Execute user event: e132B2 */
      e132B2 ();
      if (returnInSub) return;
   }

   public void e132B2( )
   {
      /* Enter Routine */
      AV8pTAM07_USER_ID = A55TAM07_USER_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8pTAM07_USER_ID", AV8pTAM07_USER_ID);
      httpContext.setWebReturnParms(new Object[] {AV8pTAM07_USER_ID});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT1[0] = AV10W_A_LOGIN_SDT;
      GXv_char2[0] = AV11W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV10W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      tam07_sel_impl.this.AV11W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11W_ERRCD", AV11W_ERRCD);
      if ( GXutil.strcmp(AV11W_ERRCD, "0") != 0 )
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
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV12W_KNGN_FLG ;
      GXv_char3[0] = AV11W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_TAM02_APP_ID, GXv_char2, GXv_char3) ;
      tam07_sel_impl.this.AV12W_KNGN_FLG = GXv_char2[0] ;
      tam07_sel_impl.this.AV11W_ERRCD = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_TAM02_APP_ID", AV9C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_KNGN_FLG", AV12W_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV11W_ERRCD", AV11W_ERRCD);
      if ( GXutil.strcmp(AV11W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S132( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV16Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "tam07_sel");
   }

   public void wb_table1_2_2B2( boolean wbgen )
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
         GxWebStd.gx_group_start( httpContext, grpGroup1_Internalname, "Filters", 1, 0, "px", 0, "px", "FieldSet", "", "HLP_TAM07_SEL.htm");
         wb_table2_9_2B2( true) ;
      }
      else
      {
         wb_table2_9_2B2( false) ;
      }
      return  ;
   }

   public void wb_table2_9_2B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroup2_Internalname, "選択リスト", 1, 0, "px", 0, "px", "FieldSet", "", "HLP_TAM07_SEL.htm");
         wb_table3_23_2B2( true) ;
      }
      else
      {
         wb_table3_23_2B2( false) ;
      }
      return  ;
   }

   public void wb_table3_23_2B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_2B2e( true) ;
      }
      else
      {
         wb_table1_2_2B2e( false) ;
      }
   }

   public void wb_table3_23_2B2( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"26\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "Grid", 0, "", "", 0, 1, sStyleString, "", 0);
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ユーザーID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 250, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "氏名") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 300, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "権限パターン名") ;
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
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV7LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A55TAM07_USER_ID));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A205TAM07_USER_NM));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtTAM07_USER_NM_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A285TAM04_AUTH_NM));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 26 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_26 = (short)(nGXsfl_26_idx-1) ;
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
         wb_table4_33_2B2( true) ;
      }
      else
      {
         wb_table4_33_2B2( false) ;
      }
      return  ;
   }

   public void wb_table4_33_2B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_23_2B2e( true) ;
      }
      else
      {
         wb_table3_23_2B2e( false) ;
      }
   }

   public void wb_table4_33_2B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 26, 2, 0)+","+"null"+");", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM07_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_2B2e( true) ;
      }
      else
      {
         wb_table4_33_2B2e( false) ;
      }
   }

   public void wb_table2_9_2B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:120px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_kngn_ptn_kbn_Internalname, "権限パターン区分", "", "", lblTextblocktam07_kngn_ptn_kbn_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_26_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, dynavCtam07_kngn_ptn_kbn, dynavCtam07_kngn_ptn_kbn.getInternalname(), GXutil.rtrim( AV5cTAM07_KNGN_PTN_KBN), 1, dynavCtam07_kngn_ptn_kbn.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 40, "chr", 0, "", "", "AttributeImeOff", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(14);\"", "", true, "HLP_TAM07_SEL.htm");
         dynavCtam07_kngn_ptn_kbn.setValue( GXutil.rtrim( AV5cTAM07_KNGN_PTN_KBN) );
         httpContext.ajax_rsp_assign_prop("", false, dynavCtam07_kngn_ptn_kbn.getInternalname(), "Values", dynavCtam07_kngn_ptn_kbn.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_user_nm_Internalname, "氏名", "", "", lblTextblocktam07_user_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_26_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam07_user_nm_Internalname, GXutil.rtrim( AV6cTAM07_USER_NM), GXutil.rtrim( localUtil.format( AV6cTAM07_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam07_user_nm_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM07_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_9_2B2e( true) ;
      }
      else
      {
         wb_table2_9_2B2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV8pTAM07_USER_ID = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8pTAM07_USER_ID", AV8pTAM07_USER_ID);
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
      pa2B2( ) ;
      ws2B2( ) ;
      we2B2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317205085");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam07_sel.js", "?20177317205085");
      /* End function include_jscripts */
   }

   public void subsflControlProps_262( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_26_idx ;
      edtTAM07_USER_ID_Internalname = "TAM07_USER_ID_"+sGXsfl_26_idx ;
      edtTAM07_USER_NM_Internalname = "TAM07_USER_NM_"+sGXsfl_26_idx ;
      edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_26_idx ;
   }

   public void subsflControlProps_fel_262( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_26_fel_idx ;
      edtTAM07_USER_ID_Internalname = "TAM07_USER_ID_"+sGXsfl_26_fel_idx ;
      edtTAM07_USER_NM_Internalname = "TAM07_USER_NM_"+sGXsfl_26_fel_idx ;
      edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_26_fel_idx ;
   }

   public void sendrow_262( )
   {
      subsflControlProps_262( ) ;
      wb2B0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_26_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_26_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_26_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A55TAM07_USER_ID))+"'"+"]);" ;
         ClassString = "Image" ;
         StyleString = "" ;
         AV7LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV7LinkSelection)==0)&&(GXutil.strcmp("", AV15Linkselection_GXI)==0))||!(GXutil.strcmp("", AV7LinkSelection)==0)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,((GXutil.strcmp("", AV7LinkSelection)==0) ? AV15Linkselection_GXI : httpContext.getResourceRelative(AV7LinkSelection)),edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","選択",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","''","",new Integer(1),new Boolean(AV7LinkSelection_IsBlob),new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM07_USER_ID_Internalname,GXutil.rtrim( A55TAM07_USER_ID),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM07_USER_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_USER_ID","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         edtTAM07_USER_NM_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A55TAM07_USER_ID))+"'"+"]);" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM07_USER_NM_Internalname,GXutil.rtrim( A205TAM07_USER_NM),"","","'"+""+"'"+",false,"+"'"+""+"'",edtTAM07_USER_NM_Link,"","選択","",edtTAM07_USER_NM_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(250),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM04_AUTH_NM_Internalname,GXutil.rtrim( A285TAM04_AUTH_NM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM04_AUTH_NM_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(300),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_26_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_26_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_26_idx+1)) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_262( ) ;
      }
      /* End function sendrow_262 */
   }

   public void init_default_properties( )
   {
      lblTextblocktam07_kngn_ptn_kbn_Internalname = "TEXTBLOCKTAM07_KNGN_PTN_KBN" ;
      dynavCtam07_kngn_ptn_kbn.setInternalname( "vCTAM07_KNGN_PTN_KBN" );
      lblTextblocktam07_user_nm_Internalname = "TEXTBLOCKTAM07_USER_NM" ;
      edtavCtam07_user_nm_Internalname = "vCTAM07_USER_NM" ;
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
      edtTAM04_AUTH_NM_Jsonclick = "" ;
      edtTAM07_USER_NM_Jsonclick = "" ;
      edtTAM07_USER_ID_Jsonclick = "" ;
      edtavCtam07_user_nm_Jsonclick = "" ;
      dynavCtam07_kngn_ptn_kbn.setJsonclick( "" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtTAM07_USER_NM_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "Grid" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "ユーザマスタ検索プロンプト" );
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
                  /* Execute user subroutine: S132 */
                  S132 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV8pTAM07_USER_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5cTAM07_KNGN_PTN_KBN = "" ;
      AV6cTAM07_USER_NM = "" ;
      AV8pTAM07_USER_ID = "" ;
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
      AV7LinkSelection = "" ;
      edtavLinkselection_Internalname = "" ;
      A55TAM07_USER_ID = "" ;
      edtTAM07_USER_ID_Internalname = "" ;
      A205TAM07_USER_NM = "" ;
      edtTAM07_USER_NM_Internalname = "" ;
      A285TAM04_AUTH_NM = "" ;
      edtTAM04_AUTH_NM_Internalname = "" ;
      GXDecQS = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H002B2_A13TAM04_AUTH_CD = new String[] {""} ;
      H002B2_A285TAM04_AUTH_NM = new String[] {""} ;
      H002B2_n285TAM04_AUTH_NM = new boolean[] {false} ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV16Pgmname = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lV6cTAM07_USER_NM = "" ;
      A56TAM07_AUTH_CD = "" ;
      H002B3_A56TAM07_AUTH_CD = new String[] {""} ;
      H002B3_n56TAM07_AUTH_CD = new boolean[] {false} ;
      H002B3_A285TAM04_AUTH_NM = new String[] {""} ;
      H002B3_n285TAM04_AUTH_NM = new boolean[] {false} ;
      H002B3_A205TAM07_USER_NM = new String[] {""} ;
      H002B3_n205TAM07_USER_NM = new boolean[] {false} ;
      H002B3_A55TAM07_USER_ID = new String[] {""} ;
      H002B4_AGRID1_nRecordCount = new long[1] ;
      AV9C_TAM02_APP_ID = "" ;
      AV11W_ERRCD = "" ;
      AV15Linkselection_GXI = "" ;
      AV10W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV12W_KNGN_FLG = "" ;
      GXv_char2 = new String [1] ;
      GXv_char3 = new String [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      TempTags = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      lblTextblocktam07_kngn_ptn_kbn_Jsonclick = "" ;
      lblTextblocktam07_user_nm_Jsonclick = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam07_sel__default(),
         new Object[] {
             new Object[] {
            H002B2_A13TAM04_AUTH_CD, H002B2_A285TAM04_AUTH_NM, H002B2_n285TAM04_AUTH_NM
            }
            , new Object[] {
            H002B3_A56TAM07_AUTH_CD, H002B3_n56TAM07_AUTH_CD, H002B3_A285TAM04_AUTH_NM, H002B3_n285TAM04_AUTH_NM, H002B3_A205TAM07_USER_NM, H002B3_n205TAM07_USER_NM, H002B3_A55TAM07_USER_ID
            }
            , new Object[] {
            H002B4_AGRID1_nRecordCount
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV16Pgmname = "TAM07_SEL" ;
      /* GeneXus formulas. */
      AV16Pgmname = "TAM07_SEL" ;
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
   private short nRC_GXsfl_26 ;
   private short nGXsfl_26_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short Gx_err ;
   private short nGXsfl_26_Refreshing=0 ;
   private int subGrid1_Rows ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXActiveErrHndl ;
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
   private String sGXsfl_26_idx="0001" ;
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
   private String edtTAM07_USER_ID_Internalname ;
   private String edtTAM07_USER_NM_Internalname ;
   private String edtTAM04_AUTH_NM_Internalname ;
   private String GXDecQS ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV16Pgmname ;
   private String edtavCtam07_user_nm_Internalname ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
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
   private String edtTAM07_USER_NM_Link ;
   private String tblTable4_Internalname ;
   private String TempTags ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblocktam07_kngn_ptn_kbn_Internalname ;
   private String lblTextblocktam07_kngn_ptn_kbn_Jsonclick ;
   private String lblTextblocktam07_user_nm_Internalname ;
   private String lblTextblocktam07_user_nm_Jsonclick ;
   private String edtavCtam07_user_nm_Jsonclick ;
   private String sGXsfl_26_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTAM07_USER_ID_Jsonclick ;
   private String edtTAM07_USER_NM_Jsonclick ;
   private String edtTAM04_AUTH_NM_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n205TAM07_USER_NM ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean n56TAM07_AUTH_CD ;
   private boolean returnInSub ;
   private boolean AV7LinkSelection_IsBlob ;
   private String wcpOAV8pTAM07_USER_ID ;
   private String AV5cTAM07_KNGN_PTN_KBN ;
   private String AV6cTAM07_USER_NM ;
   private String AV8pTAM07_USER_ID ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String A285TAM04_AUTH_NM ;
   private String lV6cTAM07_USER_NM ;
   private String A56TAM07_AUTH_CD ;
   private String AV9C_TAM02_APP_ID ;
   private String AV11W_ERRCD ;
   private String AV15Linkselection_GXI ;
   private String AV12W_KNGN_FLG ;
   private String AV7LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice dynavCtam07_kngn_ptn_kbn ;
   private IDataStoreProvider pr_default ;
   private String[] H002B2_A13TAM04_AUTH_CD ;
   private String[] H002B2_A285TAM04_AUTH_NM ;
   private boolean[] H002B2_n285TAM04_AUTH_NM ;
   private String[] H002B3_A56TAM07_AUTH_CD ;
   private boolean[] H002B3_n56TAM07_AUTH_CD ;
   private String[] H002B3_A285TAM04_AUTH_NM ;
   private boolean[] H002B3_n285TAM04_AUTH_NM ;
   private String[] H002B3_A205TAM07_USER_NM ;
   private boolean[] H002B3_n205TAM07_USER_NM ;
   private String[] H002B3_A55TAM07_USER_ID ;
   private long[] H002B4_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

final  class tam07_sel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H002B3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV5cTAM07_KNGN_PTN_KBN ,
                                          String AV6cTAM07_USER_NM ,
                                          String A56TAM07_AUTH_CD ,
                                          String A205TAM07_USER_NM )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int4 ;
      GXv_int4 = new byte [4] ;
      Object[] GXv_Object5 ;
      GXv_Object5 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " T1.`TAM07_AUTH_CD` AS TAM07_AUTH_CD, T2.`TAM04_AUTH_NM`, T1.`TAM07_USER_NM`, T1.`TAM07_USER_ID`" ;
      sFromString = " FROM (`TAM07_USER` T1 LEFT JOIN `TAM04_KNGN` T2 ON T2.`TAM04_AUTH_CD` = T1.`TAM07_AUTH_CD`)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV5cTAM07_KNGN_PTN_KBN)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.`TAM07_AUTH_CD` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.`TAM07_AUTH_CD` = ?)" ;
         }
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV6cTAM07_USER_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.`TAM07_USER_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.`TAM07_USER_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         sWhereString = " WHERE" + sWhereString ;
      }
      sOrderString = sOrderString + " ORDER BY T1.`TAM07_USER_ID`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_H002B4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV5cTAM07_KNGN_PTN_KBN ,
                                          String AV6cTAM07_USER_NM ,
                                          String A56TAM07_AUTH_CD ,
                                          String A205TAM07_USER_NM )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int6 ;
      GXv_int6 = new byte [2] ;
      Object[] GXv_Object7 ;
      GXv_Object7 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM (`TAM07_USER` T1 LEFT JOIN `TAM04_KNGN` T2 ON T2.`TAM04_AUTH_CD`" ;
      scmdbuf = scmdbuf + " = T1.`TAM07_AUTH_CD`)" ;
      if ( ! (GXutil.strcmp("", AV5cTAM07_KNGN_PTN_KBN)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.`TAM07_AUTH_CD` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.`TAM07_AUTH_CD` = ?)" ;
         }
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV6cTAM07_USER_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.`TAM07_USER_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.`TAM07_USER_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + "" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_H002B3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
            case 2 :
                  return conditional_H002B4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002B2", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H002B3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H002B4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[2], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 30);
               }
               return;
      }
   }

}

