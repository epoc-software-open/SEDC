/*
               File: tam02_sel_impl
        Description: メニューIDマスタ検索プロンプト
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:46.55
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam02_sel_impl extends GXDataArea
{
   public tam02_sel_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam02_sel_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam02_sel_impl.class ));
   }

   public tam02_sel_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      httpContext.setDefaultTheme("Style1");
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
            nRC_GXsfl_31 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_31_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_31_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_31, nGXsfl_31_idx, sGXsfl_31_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV6cTAM020_MENU_ID_TREE_1 = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM020_MENU_ID_TREE_1", AV6cTAM020_MENU_ID_TREE_1);
            AV7cTAM020_MENU_ID_TREE_2 = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM020_MENU_ID_TREE_2", AV7cTAM020_MENU_ID_TREE_2);
            AV8cTAM020_MENU_NM = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM020_MENU_NM", AV8cTAM020_MENU_NM);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cTAM020_MENU_ID_TREE_1, AV7cTAM020_MENU_ID_TREE_2, AV8cTAM020_MENU_NM) ;
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
            AV10pTAM010_SYS_ID = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10pTAM010_SYS_ID", AV10pTAM010_SYS_ID);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV11pTAM020_MENU_ID_TREE_1 = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11pTAM020_MENU_ID_TREE_1", AV11pTAM020_MENU_ID_TREE_1);
               AV12pTAM020_MENU_ID_TREE_2 = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12pTAM020_MENU_ID_TREE_2", AV12pTAM020_MENU_ID_TREE_2);
               AV13pTAM020_MENU_ID_TREE_3 = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM020_MENU_ID_TREE_3", AV13pTAM020_MENU_ID_TREE_3);
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
      pa242( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start242( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317204666");
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
      GXEncryptionTmp = "tam02_sel"+GXutil.URLEncode(GXutil.rtrim(AV10pTAM010_SYS_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV11pTAM020_MENU_ID_TREE_1)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12pTAM020_MENU_ID_TREE_2)) + "," + GXutil.URLEncode(GXutil.rtrim(AV13pTAM020_MENU_ID_TREE_3)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam02_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM020_MENU_ID_TREE_1", GXutil.rtrim( AV6cTAM020_MENU_ID_TREE_1));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM020_MENU_ID_TREE_2", GXutil.rtrim( AV7cTAM020_MENU_ID_TREE_2));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM020_MENU_NM", GXutil.rtrim( AV8cTAM020_MENU_NM));
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_31", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_31, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM010_SYS_ID", GXutil.rtrim( AV10pTAM010_SYS_ID));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM020_MENU_ID_TREE_1", GXutil.rtrim( AV11pTAM020_MENU_ID_TREE_1));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM020_MENU_ID_TREE_2", GXutil.rtrim( AV12pTAM020_MENU_ID_TREE_2));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM020_MENU_ID_TREE_3", GXutil.rtrim( AV13pTAM020_MENU_ID_TREE_3));
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
         we242( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt242( ) ;
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
      GXEncryptionTmp = "tam02_sel"+GXutil.URLEncode(GXutil.rtrim(AV10pTAM010_SYS_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV11pTAM020_MENU_ID_TREE_1)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12pTAM020_MENU_ID_TREE_2)) + "," + GXutil.URLEncode(GXutil.rtrim(AV13pTAM020_MENU_ID_TREE_3)) ;
      return formatLink("tam02_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public String getPgmname( )
   {
      return "TAM02_SEL" ;
   }

   public String getPgmdesc( )
   {
      return "メニューIDマスタ検索プロンプト" ;
   }

   public void wb240( )
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
         wb_table1_2_242( true) ;
      }
      else
      {
         wb_table1_2_242( false) ;
      }
      return  ;
   }

   public void wb_table1_2_242e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start242( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "メニューIDマスタ検索プロンプト", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup240( ) ;
   }

   public void ws242( )
   {
      start242( ) ;
      evt242( ) ;
   }

   public void evt242( )
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
                           nGXsfl_31_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_31_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_31_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_312( ) ;
                           AV9LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           A2TAM02_MENU_ID_TREE_1 = httpContext.cgiGet( edtTAM02_MENU_ID_TREE_1_Internalname) ;
                           A3TAM02_MENU_ID_TREE_2 = httpContext.cgiGet( edtTAM02_MENU_ID_TREE_2_Internalname) ;
                           A4TAM02_MENU_ID_TREE_3 = httpContext.cgiGet( edtTAM02_MENU_ID_TREE_3_Internalname) ;
                           A211TAM02_MENU_NM = httpContext.cgiGet( edtTAM02_MENU_NM_Internalname) ;
                           n211TAM02_MENU_NM = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e11242 */
                                 e11242 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e12242 */
                                 e12242 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctam020_menu_id_tree_1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM020_MENU_ID_TREE_1"), AV6cTAM020_MENU_ID_TREE_1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam020_menu_id_tree_2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM020_MENU_ID_TREE_2"), AV7cTAM020_MENU_ID_TREE_2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctam020_menu_nm Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM020_MENU_NM"), AV8cTAM020_MENU_NM) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: e13242 */
                                       e13242 ();
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

   public void we242( )
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

   public void pa242( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "tam02_sel")), "tam02_sel") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "tam02_sel"))) ;
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
                  AV10pTAM010_SYS_ID = gxfirstwebparm ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10pTAM010_SYS_ID", AV10pTAM010_SYS_ID);
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV11pTAM020_MENU_ID_TREE_1 = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV11pTAM020_MENU_ID_TREE_1", AV11pTAM020_MENU_ID_TREE_1);
                     AV12pTAM020_MENU_ID_TREE_2 = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV12pTAM020_MENU_ID_TREE_2", AV12pTAM020_MENU_ID_TREE_2);
                     AV13pTAM020_MENU_ID_TREE_3 = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM020_MENU_ID_TREE_3", AV13pTAM020_MENU_ID_TREE_3);
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

   public void gxnrgrid1_newrow( short nRC_GXsfl_31 ,
                                 short nGXsfl_31_idx ,
                                 String sGXsfl_31_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_312( ) ;
      while ( nGXsfl_31_idx <= nRC_GXsfl_31 )
      {
         sendrow_312( ) ;
         nGXsfl_31_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_31_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_31_idx+1)) ;
         sGXsfl_31_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_31_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_312( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cTAM020_MENU_ID_TREE_1 ,
                                  String AV7cTAM020_MENU_ID_TREE_2 ,
                                  String AV8cTAM020_MENU_NM )
   {
      /* GeneXus formulas. */
      AV20Pgmname = "TAM02_SEL" ;
      Gx_err = (short)(0) ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      rf242( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf242( ) ;
      /* End function Refresh */
   }

   public void rf242( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "Grid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      wbStart = (short)(31) ;
      nGXsfl_31_idx = (short)(1) ;
      sGXsfl_31_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_31_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_312( ) ;
      nGXsfl_31_Refreshing = (short)(1) ;
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_312( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV6cTAM020_MENU_ID_TREE_1 ,
                                              AV7cTAM020_MENU_ID_TREE_2 ,
                                              AV8cTAM020_MENU_NM ,
                                              A2TAM02_MENU_ID_TREE_1 ,
                                              A3TAM02_MENU_ID_TREE_2 ,
                                              A211TAM02_MENU_NM },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         lV8cTAM020_MENU_NM = GXutil.padr( GXutil.rtrim( AV8cTAM020_MENU_NM), 50, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM020_MENU_NM", AV8cTAM020_MENU_NM);
         /* Using cursor H00242 */
         pr_default.execute(0, new Object[] {AV6cTAM020_MENU_ID_TREE_1, AV7cTAM020_MENU_ID_TREE_2, lV8cTAM020_MENU_NM, new Integer(GXPagingFrom2), new Long(GXPagingTo2)});
         nGXsfl_31_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A1TAM01_SYS_ID = H00242_A1TAM01_SYS_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
            A211TAM02_MENU_NM = H00242_A211TAM02_MENU_NM[0] ;
            n211TAM02_MENU_NM = H00242_n211TAM02_MENU_NM[0] ;
            A4TAM02_MENU_ID_TREE_3 = H00242_A4TAM02_MENU_ID_TREE_3[0] ;
            A3TAM02_MENU_ID_TREE_2 = H00242_A3TAM02_MENU_ID_TREE_2[0] ;
            A2TAM02_MENU_ID_TREE_1 = H00242_A2TAM02_MENU_ID_TREE_1[0] ;
            /* Execute user event: e12242 */
            e12242 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(31) ;
         wb240( ) ;
      }
      nGXsfl_31_Refreshing = (short)(0) ;
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV6cTAM020_MENU_ID_TREE_1 ,
                                           AV7cTAM020_MENU_ID_TREE_2 ,
                                           AV8cTAM020_MENU_NM ,
                                           A2TAM02_MENU_ID_TREE_1 ,
                                           A3TAM02_MENU_ID_TREE_2 ,
                                           A211TAM02_MENU_NM },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV8cTAM020_MENU_NM = GXutil.padr( GXutil.rtrim( AV8cTAM020_MENU_NM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM020_MENU_NM", AV8cTAM020_MENU_NM);
      /* Using cursor H00243 */
      pr_default.execute(1, new Object[] {AV6cTAM020_MENU_ID_TREE_1, AV7cTAM020_MENU_ID_TREE_2, lV8cTAM020_MENU_NM});
      GRID1_nRecordCount = H00243_AGRID1_nRecordCount[0] ;
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

   public void strup240( )
   {
      /* Before Start, stand alone formulas. */
      AV20Pgmname = "TAM02_SEL" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e11242 */
      e11242 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cTAM020_MENU_ID_TREE_1 = httpContext.cgiGet( edtavCtam020_menu_id_tree_1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM020_MENU_ID_TREE_1", AV6cTAM020_MENU_ID_TREE_1);
         AV7cTAM020_MENU_ID_TREE_2 = httpContext.cgiGet( edtavCtam020_menu_id_tree_2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTAM020_MENU_ID_TREE_2", AV7cTAM020_MENU_ID_TREE_2);
         AV8cTAM020_MENU_NM = httpContext.cgiGet( edtavCtam020_menu_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTAM020_MENU_NM", AV8cTAM020_MENU_NM);
         /* Read saved values. */
         nRC_GXsfl_31 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_31"), ".", ",")) ;
         AV10pTAM010_SYS_ID = httpContext.cgiGet( "vPTAM010_SYS_ID") ;
         AV11pTAM020_MENU_ID_TREE_1 = httpContext.cgiGet( "vPTAM020_MENU_ID_TREE_1") ;
         AV12pTAM020_MENU_ID_TREE_2 = httpContext.cgiGet( "vPTAM020_MENU_ID_TREE_2") ;
         AV13pTAM020_MENU_ID_TREE_3 = httpContext.cgiGet( "vPTAM020_MENU_ID_TREE_3") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM020_MENU_ID_TREE_1"), AV6cTAM020_MENU_ID_TREE_1) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM020_MENU_ID_TREE_2"), AV7cTAM020_MENU_ID_TREE_2) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM020_MENU_NM"), AV8cTAM020_MENU_NM) != 0 )
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
      /* Execute user event: e11242 */
      e11242 ();
      if (returnInSub) return;
   }

   public void e11242( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "選択リスト %1", "メニューIDマスタ", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV5C_TAM02_APP_ID = "TAM02" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_TAM02_APP_ID", AV5C_TAM02_APP_ID);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV15W_ERRCD, "0") == 0 )
      {
         /* Execute user subroutine: S122 */
         S122 ();
         if (returnInSub) return;
      }
   }

   private void e12242( )
   {
      /* Load Routine */
      AV9LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV19Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_312( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   public void GXEnter( )
   {
      /* Execute user event: e13242 */
      e13242 ();
      if (returnInSub) return;
   }

   public void e13242( )
   {
      /* Enter Routine */
      AV10pTAM010_SYS_ID = A1TAM01_SYS_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pTAM010_SYS_ID", AV10pTAM010_SYS_ID);
      AV11pTAM020_MENU_ID_TREE_1 = A2TAM02_MENU_ID_TREE_1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pTAM020_MENU_ID_TREE_1", AV11pTAM020_MENU_ID_TREE_1);
      AV12pTAM020_MENU_ID_TREE_2 = A3TAM02_MENU_ID_TREE_2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pTAM020_MENU_ID_TREE_2", AV12pTAM020_MENU_ID_TREE_2);
      AV13pTAM020_MENU_ID_TREE_3 = A4TAM02_MENU_ID_TREE_3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM020_MENU_ID_TREE_3", AV13pTAM020_MENU_ID_TREE_3);
      httpContext.setWebReturnParms(new Object[] {AV10pTAM010_SYS_ID,AV11pTAM020_MENU_ID_TREE_1,AV12pTAM020_MENU_ID_TREE_2,AV13pTAM020_MENU_ID_TREE_3});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT1[0] = AV14W_A_LOGIN_SDT;
      GXv_char2[0] = AV15W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV14W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      tam02_sel_impl.this.AV15W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15W_ERRCD", AV15W_ERRCD);
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
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
      GXv_char2[0] = AV16W_KNGN_FLG ;
      GXv_char3[0] = AV15W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV5C_TAM02_APP_ID, GXv_char2, GXv_char3) ;
      tam02_sel_impl.this.AV16W_KNGN_FLG = GXv_char2[0] ;
      tam02_sel_impl.this.AV15W_ERRCD = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_TAM02_APP_ID", AV5C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV16W_KNGN_FLG", AV16W_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV15W_ERRCD", AV15W_ERRCD);
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV20Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "tam02_sel");
   }

   public void wb_table1_2_242( boolean wbgen )
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
         GxWebStd.gx_group_start( httpContext, grpGroup1_Internalname, "Filters", 1, 0, "px", 0, "px", "FieldSet", "", "HLP_TAM02_SEL.htm");
         wb_table2_9_242( true) ;
      }
      else
      {
         wb_table2_9_242( false) ;
      }
      return  ;
   }

   public void wb_table2_9_242e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroup2_Internalname, "選択リスト", 1, 0, "px", 0, "px", "FieldSet", "", "HLP_TAM02_SEL.htm");
         wb_table3_28_242( true) ;
      }
      else
      {
         wb_table3_28_242( false) ;
      }
      return  ;
   }

   public void wb_table3_28_242e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_242e( true) ;
      }
      else
      {
         wb_table1_2_242e( false) ;
      }
   }

   public void wb_table3_28_242( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"31\">") ;
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 130, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "メニューID（階層１）") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 130, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "メニューID（階層２）") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 130, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "メニューID（階層３）") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 300, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "メニュー名") ;
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
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV9LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2TAM02_MENU_ID_TREE_1));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3TAM02_MENU_ID_TREE_2));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4TAM02_MENU_ID_TREE_3));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A211TAM02_MENU_NM));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtTAM02_MENU_NM_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 31 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_31 = (short)(nGXsfl_31_idx-1) ;
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
         wb_table4_39_242( true) ;
      }
      else
      {
         wb_table4_39_242( false) ;
      }
      return  ;
   }

   public void wb_table4_39_242e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_242e( true) ;
      }
      else
      {
         wb_table3_28_242e( false) ;
      }
   }

   public void wb_table4_39_242( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 31, 2, 0)+","+"null"+");", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM02_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_39_242e( true) ;
      }
      else
      {
         wb_table4_39_242e( false) ;
      }
   }

   public void wb_table2_9_242( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:150px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam020_menu_id_tree_1_Internalname, "メニューID（階層１）", "", "", lblTextblocktam020_menu_id_tree_1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_31_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam020_menu_id_tree_1_Internalname, GXutil.rtrim( AV6cTAM020_MENU_ID_TREE_1), GXutil.rtrim( localUtil.format( AV6cTAM020_MENU_ID_TREE_1, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(14);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam020_menu_id_tree_1_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM02_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam020_menu_id_tree_2_Internalname, "メニューID（階層２）", "", "", lblTextblocktam020_menu_id_tree_2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_31_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam020_menu_id_tree_2_Internalname, GXutil.rtrim( AV7cTAM020_MENU_ID_TREE_2), GXutil.rtrim( localUtil.format( AV7cTAM020_MENU_ID_TREE_2, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam020_menu_id_tree_2_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM02_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam020_menu_nm_Internalname, "メニュー名", "", "", lblTextblocktam020_menu_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM02_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'" + sGXsfl_31_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam020_menu_nm_Internalname, GXutil.rtrim( AV8cTAM020_MENU_NM), GXutil.rtrim( localUtil.format( AV8cTAM020_MENU_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtam020_menu_nm_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM02_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_9_242e( true) ;
      }
      else
      {
         wb_table2_9_242e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV10pTAM010_SYS_ID = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pTAM010_SYS_ID", AV10pTAM010_SYS_ID);
      AV11pTAM020_MENU_ID_TREE_1 = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pTAM020_MENU_ID_TREE_1", AV11pTAM020_MENU_ID_TREE_1);
      AV12pTAM020_MENU_ID_TREE_2 = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pTAM020_MENU_ID_TREE_2", AV12pTAM020_MENU_ID_TREE_2);
      AV13pTAM020_MENU_ID_TREE_3 = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTAM020_MENU_ID_TREE_3", AV13pTAM020_MENU_ID_TREE_3);
   }

   public String getresponse( String sGXDynURL )
   {
      httpContext.setDefaultTheme("Style1");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa242( ) ;
      ws242( ) ;
      we242( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122814");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317204719");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam02_sel.js", "?20177317204719");
      /* End function include_jscripts */
   }

   public void subsflControlProps_312( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_31_idx ;
      edtTAM02_MENU_ID_TREE_1_Internalname = "TAM02_MENU_ID_TREE_1_"+sGXsfl_31_idx ;
      edtTAM02_MENU_ID_TREE_2_Internalname = "TAM02_MENU_ID_TREE_2_"+sGXsfl_31_idx ;
      edtTAM02_MENU_ID_TREE_3_Internalname = "TAM02_MENU_ID_TREE_3_"+sGXsfl_31_idx ;
      edtTAM02_MENU_NM_Internalname = "TAM02_MENU_NM_"+sGXsfl_31_idx ;
   }

   public void subsflControlProps_fel_312( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_31_fel_idx ;
      edtTAM02_MENU_ID_TREE_1_Internalname = "TAM02_MENU_ID_TREE_1_"+sGXsfl_31_fel_idx ;
      edtTAM02_MENU_ID_TREE_2_Internalname = "TAM02_MENU_ID_TREE_2_"+sGXsfl_31_fel_idx ;
      edtTAM02_MENU_ID_TREE_3_Internalname = "TAM02_MENU_ID_TREE_3_"+sGXsfl_31_fel_idx ;
      edtTAM02_MENU_NM_Internalname = "TAM02_MENU_NM_"+sGXsfl_31_fel_idx ;
   }

   public void sendrow_312( )
   {
      subsflControlProps_312( ) ;
      wb240( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_31_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_31_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_31_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1TAM01_SYS_ID))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2TAM02_MENU_ID_TREE_1))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3TAM02_MENU_ID_TREE_2))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4TAM02_MENU_ID_TREE_3))+"'"+"]);" ;
         ClassString = "Image" ;
         StyleString = "" ;
         AV9LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV9LinkSelection)==0)&&(GXutil.strcmp("", AV19Linkselection_GXI)==0))||!(GXutil.strcmp("", AV9LinkSelection)==0)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,((GXutil.strcmp("", AV9LinkSelection)==0) ? AV19Linkselection_GXI : httpContext.getResourceRelative(AV9LinkSelection)),edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","選択",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","''","",new Integer(1),new Boolean(AV9LinkSelection_IsBlob),new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM02_MENU_ID_TREE_1_Internalname,GXutil.rtrim( A2TAM02_MENU_ID_TREE_1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM02_MENU_ID_TREE_1_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(130),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(31),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM02_MENU_ID_TREE_2_Internalname,GXutil.rtrim( A3TAM02_MENU_ID_TREE_2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM02_MENU_ID_TREE_2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(130),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(31),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM02_MENU_ID_TREE_3_Internalname,GXutil.rtrim( A4TAM02_MENU_ID_TREE_3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM02_MENU_ID_TREE_3_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(130),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(31),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         edtTAM02_MENU_NM_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1TAM01_SYS_ID))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2TAM02_MENU_ID_TREE_1))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3TAM02_MENU_ID_TREE_2))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4TAM02_MENU_ID_TREE_3))+"'"+"]);" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM02_MENU_NM_Internalname,GXutil.rtrim( A211TAM02_MENU_NM),"","","'"+""+"'"+",false,"+"'"+""+"'",edtTAM02_MENU_NM_Link,"","選択","",edtTAM02_MENU_NM_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(300),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(31),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_31_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_31_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_31_idx+1)) ;
         sGXsfl_31_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_31_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_312( ) ;
      }
      /* End function sendrow_312 */
   }

   public void init_default_properties( )
   {
      lblTextblocktam020_menu_id_tree_1_Internalname = "TEXTBLOCKTAM020_MENU_ID_TREE_1" ;
      edtavCtam020_menu_id_tree_1_Internalname = "vCTAM020_MENU_ID_TREE_1" ;
      lblTextblocktam020_menu_id_tree_2_Internalname = "TEXTBLOCKTAM020_MENU_ID_TREE_2" ;
      edtavCtam020_menu_id_tree_2_Internalname = "vCTAM020_MENU_ID_TREE_2" ;
      lblTextblocktam020_menu_nm_Internalname = "TEXTBLOCKTAM020_MENU_NM" ;
      edtavCtam020_menu_nm_Internalname = "vCTAM020_MENU_NM" ;
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
      edtTAM02_MENU_NM_Jsonclick = "" ;
      edtTAM02_MENU_ID_TREE_3_Jsonclick = "" ;
      edtTAM02_MENU_ID_TREE_2_Jsonclick = "" ;
      edtTAM02_MENU_ID_TREE_1_Jsonclick = "" ;
      edtavCtam020_menu_nm_Jsonclick = "" ;
      edtavCtam020_menu_id_tree_2_Jsonclick = "" ;
      edtavCtam020_menu_id_tree_1_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtTAM02_MENU_NM_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "Grid" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "メニューIDマスタ検索プロンプト" );
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
      wcpOAV10pTAM010_SYS_ID = "" ;
      wcpOAV11pTAM020_MENU_ID_TREE_1 = "" ;
      wcpOAV12pTAM020_MENU_ID_TREE_2 = "" ;
      wcpOAV13pTAM020_MENU_ID_TREE_3 = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6cTAM020_MENU_ID_TREE_1 = "" ;
      AV7cTAM020_MENU_ID_TREE_2 = "" ;
      AV8cTAM020_MENU_NM = "" ;
      AV10pTAM010_SYS_ID = "" ;
      AV11pTAM020_MENU_ID_TREE_1 = "" ;
      AV12pTAM020_MENU_ID_TREE_2 = "" ;
      AV13pTAM020_MENU_ID_TREE_3 = "" ;
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
      AV9LinkSelection = "" ;
      edtavLinkselection_Internalname = "" ;
      A2TAM02_MENU_ID_TREE_1 = "" ;
      edtTAM02_MENU_ID_TREE_1_Internalname = "" ;
      A3TAM02_MENU_ID_TREE_2 = "" ;
      edtTAM02_MENU_ID_TREE_2_Internalname = "" ;
      A4TAM02_MENU_ID_TREE_3 = "" ;
      edtTAM02_MENU_ID_TREE_3_Internalname = "" ;
      A211TAM02_MENU_NM = "" ;
      edtTAM02_MENU_NM_Internalname = "" ;
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV20Pgmname = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      lV8cTAM020_MENU_NM = "" ;
      H00242_A1TAM01_SYS_ID = new String[] {""} ;
      H00242_A211TAM02_MENU_NM = new String[] {""} ;
      H00242_n211TAM02_MENU_NM = new boolean[] {false} ;
      H00242_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      H00242_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      H00242_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      A1TAM01_SYS_ID = "" ;
      H00243_AGRID1_nRecordCount = new long[1] ;
      AV5C_TAM02_APP_ID = "" ;
      AV15W_ERRCD = "" ;
      AV19Linkselection_GXI = "" ;
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV16W_KNGN_FLG = "" ;
      GXv_char2 = new String [1] ;
      GXv_char3 = new String [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      TempTags = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      lblTextblocktam020_menu_id_tree_1_Jsonclick = "" ;
      lblTextblocktam020_menu_id_tree_2_Jsonclick = "" ;
      lblTextblocktam020_menu_nm_Jsonclick = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam02_sel__default(),
         new Object[] {
             new Object[] {
            H00242_A1TAM01_SYS_ID, H00242_A211TAM02_MENU_NM, H00242_n211TAM02_MENU_NM, H00242_A4TAM02_MENU_ID_TREE_3, H00242_A3TAM02_MENU_ID_TREE_2, H00242_A2TAM02_MENU_ID_TREE_1
            }
            , new Object[] {
            H00243_AGRID1_nRecordCount
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV20Pgmname = "TAM02_SEL" ;
      /* GeneXus formulas. */
      AV20Pgmname = "TAM02_SEL" ;
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
   private short nRC_GXsfl_31 ;
   private short nGXsfl_31_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short Gx_err ;
   private short nGXsfl_31_Refreshing=0 ;
   private int subGrid1_Rows ;
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
   private String sGXsfl_31_idx="0001" ;
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
   private String edtTAM02_MENU_ID_TREE_1_Internalname ;
   private String edtTAM02_MENU_ID_TREE_2_Internalname ;
   private String edtTAM02_MENU_ID_TREE_3_Internalname ;
   private String edtTAM02_MENU_NM_Internalname ;
   private String GXDecQS ;
   private String AV20Pgmname ;
   private String scmdbuf ;
   private String edtavCtam020_menu_id_tree_1_Internalname ;
   private String edtavCtam020_menu_id_tree_2_Internalname ;
   private String edtavCtam020_menu_nm_Internalname ;
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
   private String edtTAM02_MENU_NM_Link ;
   private String tblTable4_Internalname ;
   private String TempTags ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblocktam020_menu_id_tree_1_Internalname ;
   private String lblTextblocktam020_menu_id_tree_1_Jsonclick ;
   private String edtavCtam020_menu_id_tree_1_Jsonclick ;
   private String lblTextblocktam020_menu_id_tree_2_Internalname ;
   private String lblTextblocktam020_menu_id_tree_2_Jsonclick ;
   private String edtavCtam020_menu_id_tree_2_Jsonclick ;
   private String lblTextblocktam020_menu_nm_Internalname ;
   private String lblTextblocktam020_menu_nm_Jsonclick ;
   private String edtavCtam020_menu_nm_Jsonclick ;
   private String sGXsfl_31_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTAM02_MENU_ID_TREE_1_Jsonclick ;
   private String edtTAM02_MENU_ID_TREE_2_Jsonclick ;
   private String edtTAM02_MENU_ID_TREE_3_Jsonclick ;
   private String edtTAM02_MENU_NM_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n211TAM02_MENU_NM ;
   private boolean returnInSub ;
   private boolean AV9LinkSelection_IsBlob ;
   private String wcpOAV10pTAM010_SYS_ID ;
   private String wcpOAV11pTAM020_MENU_ID_TREE_1 ;
   private String wcpOAV12pTAM020_MENU_ID_TREE_2 ;
   private String wcpOAV13pTAM020_MENU_ID_TREE_3 ;
   private String AV6cTAM020_MENU_ID_TREE_1 ;
   private String AV7cTAM020_MENU_ID_TREE_2 ;
   private String AV8cTAM020_MENU_NM ;
   private String AV10pTAM010_SYS_ID ;
   private String AV11pTAM020_MENU_ID_TREE_1 ;
   private String AV12pTAM020_MENU_ID_TREE_2 ;
   private String AV13pTAM020_MENU_ID_TREE_3 ;
   private String A2TAM02_MENU_ID_TREE_1 ;
   private String A3TAM02_MENU_ID_TREE_2 ;
   private String A4TAM02_MENU_ID_TREE_3 ;
   private String A211TAM02_MENU_NM ;
   private String lV8cTAM020_MENU_NM ;
   private String A1TAM01_SYS_ID ;
   private String AV5C_TAM02_APP_ID ;
   private String AV15W_ERRCD ;
   private String AV19Linkselection_GXI ;
   private String AV16W_KNGN_FLG ;
   private String AV9LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H00242_A1TAM01_SYS_ID ;
   private String[] H00242_A211TAM02_MENU_NM ;
   private boolean[] H00242_n211TAM02_MENU_NM ;
   private String[] H00242_A4TAM02_MENU_ID_TREE_3 ;
   private String[] H00242_A3TAM02_MENU_ID_TREE_2 ;
   private String[] H00242_A2TAM02_MENU_ID_TREE_1 ;
   private long[] H00243_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

final  class tam02_sel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00242( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV6cTAM020_MENU_ID_TREE_1 ,
                                          String AV7cTAM020_MENU_ID_TREE_2 ,
                                          String AV8cTAM020_MENU_NM ,
                                          String A2TAM02_MENU_ID_TREE_1 ,
                                          String A3TAM02_MENU_ID_TREE_2 ,
                                          String A211TAM02_MENU_NM )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int4 ;
      GXv_int4 = new byte [5] ;
      Object[] GXv_Object5 ;
      GXv_Object5 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " `TAM01_SYS_ID`, `TAM02_MENU_NM`, `TAM02_MENU_ID_TREE_3`, `TAM02_MENU_ID_TREE_2`," ;
      sSelectString = sSelectString + " `TAM02_MENU_ID_TREE_1`" ;
      sFromString = " FROM `TAM02_MENU`" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV6cTAM020_MENU_ID_TREE_1)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAM02_MENU_ID_TREE_1` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAM02_MENU_ID_TREE_1` = ?)" ;
         }
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7cTAM020_MENU_ID_TREE_2)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAM02_MENU_ID_TREE_2` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAM02_MENU_ID_TREE_2` = ?)" ;
         }
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cTAM020_MENU_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAM02_MENU_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAM02_MENU_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         sWhereString = " WHERE" + sWhereString ;
      }
      sOrderString = sOrderString + " ORDER BY `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3`" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_H00243( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV6cTAM020_MENU_ID_TREE_1 ,
                                          String AV7cTAM020_MENU_ID_TREE_2 ,
                                          String AV8cTAM020_MENU_NM ,
                                          String A2TAM02_MENU_ID_TREE_1 ,
                                          String A3TAM02_MENU_ID_TREE_2 ,
                                          String A211TAM02_MENU_NM )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int6 ;
      GXv_int6 = new byte [3] ;
      Object[] GXv_Object7 ;
      GXv_Object7 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM `TAM02_MENU`" ;
      if ( ! (GXutil.strcmp("", AV6cTAM020_MENU_ID_TREE_1)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAM02_MENU_ID_TREE_1` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAM02_MENU_ID_TREE_1` = ?)" ;
         }
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7cTAM020_MENU_ID_TREE_2)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAM02_MENU_ID_TREE_2` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAM02_MENU_ID_TREE_2` = ?)" ;
         }
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cTAM020_MENU_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAM02_MENU_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAM02_MENU_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
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
            case 0 :
                  return conditional_H00242(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
            case 1 :
                  return conditional_H00243(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00242", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00243", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
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
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 50);
               }
               return;
      }
   }

}

