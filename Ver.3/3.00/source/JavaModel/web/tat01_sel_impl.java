/*
               File: tat01_sel_impl
        Description: お知らせ情報テーブル検索プロンプト
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:44.6
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tat01_sel_impl extends GXDataArea
{
   public tat01_sel_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tat01_sel_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tat01_sel_impl.class ));
   }

   public tat01_sel_impl( int remoteHandle ,
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
            nRC_GXsfl_28 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_28_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_28_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_28, nGXsfl_28_idx, sGXsfl_28_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV6cTAT01_DATE_START_FROM = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTAT01_DATE_START_FROM", localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"));
            AV7cTAT01_DATE_START_TO = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTAT01_DATE_START_TO", localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"));
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cTAT01_DATE_START_FROM, AV7cTAT01_DATE_START_TO) ;
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
            AV9pTAT01_INFO_NO = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9pTAT01_INFO_NO", GXutil.ltrim( GXutil.str( AV9pTAT01_INFO_NO, 6, 0)));
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
      pa282( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start282( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151330449");
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
      GXEncryptionTmp = "tat01_sel"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9pTAT01_INFO_NO,6,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tat01_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAT01_DATE_START_FROM", localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAT01_DATE_START_TO", localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"));
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_28", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_28, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPTAT01_INFO_NO", GXutil.ltrim( localUtil.ntoc( AV9pTAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")));
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
         we282( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt282( ) ;
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
      GXEncryptionTmp = "tat01_sel"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9pTAT01_INFO_NO,6,0))) ;
      return formatLink("tat01_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public String getPgmname( )
   {
      return "TAT01_SEL" ;
   }

   public String getPgmdesc( )
   {
      return "お知らせ情報テーブル検索プロンプト" ;
   }

   public void wb280( )
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
         wb_table1_2_282( true) ;
      }
      else
      {
         wb_table1_2_282( false) ;
      }
      return  ;
   }

   public void wb_table1_2_282e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start282( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "お知らせ情報テーブル検索プロンプト", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup280( ) ;
   }

   public void ws282( )
   {
      start282( ) ;
      evt282( ) ;
   }

   public void evt282( )
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
                           nGXsfl_28_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_28_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_28_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_282( ) ;
                           AV8LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           A11TAT01_INFO_NO = (int)(localUtil.ctol( httpContext.cgiGet( edtTAT01_INFO_NO_Internalname), ".", ",")) ;
                           A207TAT01_DATE_START = localUtil.ctod( httpContext.cgiGet( edtTAT01_DATE_START_Internalname), 0) ;
                           n207TAT01_DATE_START = false ;
                           A208TAT01_DATE_END = localUtil.ctod( httpContext.cgiGet( edtTAT01_DATE_END_Internalname), 0) ;
                           n208TAT01_DATE_END = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e11282 */
                                 e11282 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e12282 */
                                 e12282 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctat01_date_start_from Changed */
                                    if ( !( localUtil.ctod( httpContext.cgiGet( "GXH_vCTAT01_DATE_START_FROM"), 0).equals( AV6cTAT01_DATE_START_FROM ) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctat01_date_start_to Changed */
                                    if ( !( localUtil.ctod( httpContext.cgiGet( "GXH_vCTAT01_DATE_START_TO"), 0).equals( AV7cTAT01_DATE_START_TO ) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: e13282 */
                                       e13282 ();
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

   public void we282( )
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

   public void pa282( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "tat01_sel")), "tat01_sel") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "tat01_sel"))) ;
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
                  AV9pTAT01_INFO_NO = (int)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9pTAT01_INFO_NO", GXutil.ltrim( GXutil.str( AV9pTAT01_INFO_NO, 6, 0)));
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

   public void gxnrgrid1_newrow( short nRC_GXsfl_28 ,
                                 short nGXsfl_28_idx ,
                                 String sGXsfl_28_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_282( ) ;
      while ( nGXsfl_28_idx <= nRC_GXsfl_28 )
      {
         sendrow_282( ) ;
         nGXsfl_28_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_28_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_28_idx+1)) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_28_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_282( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  java.util.Date AV6cTAT01_DATE_START_FROM ,
                                  java.util.Date AV7cTAT01_DATE_START_TO )
   {
      /* GeneXus formulas. */
      AV16Pgmname = "TAT01_SEL" ;
      Gx_err = (short)(0) ;
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      rf282( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf282( ) ;
      /* End function Refresh */
   }

   public void rf282( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "Grid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      wbStart = (short)(28) ;
      nGXsfl_28_idx = (short)(1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_28_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_282( ) ;
      nGXsfl_28_Refreshing = (short)(1) ;
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_282( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV6cTAT01_DATE_START_FROM ,
                                              AV7cTAT01_DATE_START_TO ,
                                              A207TAT01_DATE_START },
                                              new int[] {
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN
                                              }
         });
         /* Using cursor H00282 */
         pr_default.execute(0, new Object[] {AV6cTAT01_DATE_START_FROM, AV7cTAT01_DATE_START_TO, new Integer(GXPagingFrom2), new Long(GXPagingTo2)});
         nGXsfl_28_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A208TAT01_DATE_END = H00282_A208TAT01_DATE_END[0] ;
            n208TAT01_DATE_END = H00282_n208TAT01_DATE_END[0] ;
            A207TAT01_DATE_START = H00282_A207TAT01_DATE_START[0] ;
            n207TAT01_DATE_START = H00282_n207TAT01_DATE_START[0] ;
            A11TAT01_INFO_NO = H00282_A11TAT01_INFO_NO[0] ;
            /* Execute user event: e12282 */
            e12282 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(28) ;
         wb280( ) ;
      }
      nGXsfl_28_Refreshing = (short)(0) ;
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
                                           AV6cTAT01_DATE_START_FROM ,
                                           AV7cTAT01_DATE_START_TO ,
                                           A207TAT01_DATE_START },
                                           new int[] {
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H00283 */
      pr_default.execute(1, new Object[] {AV6cTAT01_DATE_START_FROM, AV7cTAT01_DATE_START_TO});
      GRID1_nRecordCount = H00283_AGRID1_nRecordCount[0] ;
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

   public void strup280( )
   {
      /* Before Start, stand alone formulas. */
      AV16Pgmname = "TAT01_SEL" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e11282 */
      e11282 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCtat01_date_start_from_Internalname), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCTAT01_DATE_START_FROM");
            GX_FocusControl = edtavCtat01_date_start_from_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cTAT01_DATE_START_FROM = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTAT01_DATE_START_FROM", localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"));
         }
         else
         {
            AV6cTAT01_DATE_START_FROM = localUtil.ctod( httpContext.cgiGet( edtavCtat01_date_start_from_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTAT01_DATE_START_FROM", localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCtat01_date_start_to_Internalname), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCTAT01_DATE_START_TO");
            GX_FocusControl = edtavCtat01_date_start_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cTAT01_DATE_START_TO = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTAT01_DATE_START_TO", localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"));
         }
         else
         {
            AV7cTAT01_DATE_START_TO = localUtil.ctod( httpContext.cgiGet( edtavCtat01_date_start_to_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTAT01_DATE_START_TO", localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"));
         }
         /* Read saved values. */
         nRC_GXsfl_28 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_28"), ".", ",")) ;
         AV9pTAT01_INFO_NO = (int)(localUtil.ctol( httpContext.cgiGet( "vPTAT01_INFO_NO"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( !( localUtil.ctod( httpContext.cgiGet( "GXH_vCTAT01_DATE_START_FROM"), 0).equals( AV6cTAT01_DATE_START_FROM ) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( localUtil.ctod( httpContext.cgiGet( "GXH_vCTAT01_DATE_START_TO"), 0).equals( AV7cTAT01_DATE_START_TO ) ) )
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
      /* Execute user event: e11282 */
      e11282 ();
      if (returnInSub) return;
   }

   public void e11282( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "選択リスト %1", "お知らせ情報テーブル", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV5C_TAM02_APP_ID = "TAT01" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_TAM02_APP_ID", AV5C_TAM02_APP_ID);
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

   private void e12282( )
   {
      /* Load Routine */
      AV8LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV15Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_282( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   public void GXEnter( )
   {
      /* Execute user event: e13282 */
      e13282 ();
      if (returnInSub) return;
   }

   public void e13282( )
   {
      /* Enter Routine */
      AV9pTAT01_INFO_NO = A11TAT01_INFO_NO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pTAT01_INFO_NO", GXutil.ltrim( GXutil.str( AV9pTAT01_INFO_NO, 6, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV9pTAT01_INFO_NO)});
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
      tat01_sel_impl.this.AV11W_ERRCD = GXv_char2[0] ;
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
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV5C_TAM02_APP_ID, GXv_char2, GXv_char3) ;
      tat01_sel_impl.this.AV12W_KNGN_FLG = GXv_char2[0] ;
      tat01_sel_impl.this.AV11W_ERRCD = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_TAM02_APP_ID", AV5C_TAM02_APP_ID);
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tat01_sel");
   }

   public void wb_table1_2_282( boolean wbgen )
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
         GxWebStd.gx_group_start( httpContext, grpGroup1_Internalname, "Filters", 1, 0, "px", 0, "px", "FieldSet", "", "HLP_TAT01_SEL.htm");
         wb_table2_9_282( true) ;
      }
      else
      {
         wb_table2_9_282( false) ;
      }
      return  ;
   }

   public void wb_table2_9_282e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroup2_Internalname, "選択リスト", 1, 0, "px", 0, "px", "FieldSet", "", "HLP_TAT01_SEL.htm");
         wb_table3_25_282( true) ;
      }
      else
      {
         wb_table3_25_282( false) ;
      }
      return  ;
   }

   public void wb_table3_25_282e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_282e( true) ;
      }
      else
      {
         wb_table1_2_282e( false) ;
      }
   }

   public void wb_table3_25_282( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"28\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 130, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "お知らせ情報番号") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "公開開始日") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "公開終了日") ;
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
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV8LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtTAT01_INFO_NO_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 28 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_28 = (short)(nGXsfl_28_idx-1) ;
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
         wb_table4_35_282( true) ;
      }
      else
      {
         wb_table4_35_282( false) ;
      }
      return  ;
   }

   public void wb_table4_35_282e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_25_282e( true) ;
      }
      else
      {
         wb_table3_25_282e( false) ;
      }
   }

   public void wb_table4_35_282( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 28, 2, 0)+","+"null"+");", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAT01_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_35_282e( true) ;
      }
      else
      {
         wb_table4_35_282e( false) ;
      }
   }

   public void wb_table2_9_282( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:80px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat010_date_start_Internalname, "公開開始日", "", "", lblTextblocktat010_date_start_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_14_282( true) ;
      }
      else
      {
         wb_table5_14_282( false) ;
      }
      return  ;
   }

   public void wb_table5_14_282e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_9_282e( true) ;
      }
      else
      {
         wb_table2_9_282e( false) ;
      }
   }

   public void wb_table5_14_282( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'" + sGXsfl_28_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCtat01_date_start_from_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtat01_date_start_from_Internalname, localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"), localUtil.format( AV6cTAT01_DATE_START_FROM, "9999/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',0,24,'jap',false,0);"+";gx.evt.onblur(17);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtat01_date_start_from_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAT01_SEL.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtat01_date_start_from_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAT01_SEL.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "～", "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_TAT01_SEL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_28_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCtat01_date_start_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtat01_date_start_to_Internalname, localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"), localUtil.format( AV7cTAT01_DATE_START_TO, "9999/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',0,24,'jap',false,0);"+";gx.evt.onblur(21);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtat01_date_start_to_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAT01_SEL.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtat01_date_start_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAT01_SEL.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_14_282e( true) ;
      }
      else
      {
         wb_table5_14_282e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV9pTAT01_INFO_NO = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pTAT01_INFO_NO", GXutil.ltrim( GXutil.str( AV9pTAT01_INFO_NO, 6, 0)));
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
      pa282( ) ;
      ws282( ) ;
      we282( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316820");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513304436");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tat01_sel.js", "?202071513304436");
      /* End function include_jscripts */
   }

   public void subsflControlProps_282( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_28_idx ;
      edtTAT01_INFO_NO_Internalname = "TAT01_INFO_NO_"+sGXsfl_28_idx ;
      edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_28_idx ;
      edtTAT01_DATE_END_Internalname = "TAT01_DATE_END_"+sGXsfl_28_idx ;
   }

   public void subsflControlProps_fel_282( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_28_fel_idx ;
      edtTAT01_INFO_NO_Internalname = "TAT01_INFO_NO_"+sGXsfl_28_fel_idx ;
      edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_28_fel_idx ;
      edtTAT01_DATE_END_Internalname = "TAT01_DATE_END_"+sGXsfl_28_fel_idx ;
   }

   public void sendrow_282( )
   {
      subsflControlProps_282( ) ;
      wb280( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_28_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_28_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_28_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")))+"'"+"]);" ;
         ClassString = "Image" ;
         StyleString = "" ;
         AV8LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV8LinkSelection)==0)&&(GXutil.strcmp("", AV15Linkselection_GXI)==0))||!(GXutil.strcmp("", AV8LinkSelection)==0)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,((GXutil.strcmp("", AV8LinkSelection)==0) ? AV15Linkselection_GXI : httpContext.getResourceRelative(AV8LinkSelection)),edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","選択",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","''","",new Integer(1),new Boolean(AV8LinkSelection_IsBlob),new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         edtTAT01_INFO_NO_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")))+"'"+"]);" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAT01_INFO_NO_Internalname,GXutil.ltrim( localUtil.ntoc( A11TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A11TAT01_INFO_NO), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtTAT01_INFO_NO_Link,"","","",edtTAT01_INFO_NO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(130),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(28),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAT01_DATE_START_Internalname,localUtil.format(A207TAT01_DATE_START, "9999/99/99"),localUtil.format( A207TAT01_DATE_START, "9999/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","選択","",edtTAT01_DATE_START_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(28),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_Y4MD","right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAT01_DATE_END_Internalname,localUtil.format(A208TAT01_DATE_END, "9999/99/99"),localUtil.format( A208TAT01_DATE_END, "9999/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAT01_DATE_END_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(28),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_Y4MD","right"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_28_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_28_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_28_idx+1)) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_28_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_282( ) ;
      }
      /* End function sendrow_282 */
   }

   public void init_default_properties( )
   {
      lblTextblocktat010_date_start_Internalname = "TEXTBLOCKTAT010_DATE_START" ;
      edtavCtat01_date_start_from_Internalname = "vCTAT01_DATE_START_FROM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtavCtat01_date_start_to_Internalname = "vCTAT01_DATE_START_TO" ;
      tblTable5_Internalname = "TABLE5" ;
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
      edtTAT01_DATE_END_Jsonclick = "" ;
      edtTAT01_DATE_START_Jsonclick = "" ;
      edtTAT01_INFO_NO_Jsonclick = "" ;
      edtavCtat01_date_start_to_Jsonclick = "" ;
      edtavCtat01_date_start_from_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtTAT01_INFO_NO_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "Grid" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "お知らせ情報テーブル検索プロンプト" );
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6cTAT01_DATE_START_FROM = GXutil.nullDate() ;
      AV7cTAT01_DATE_START_TO = GXutil.nullDate() ;
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
      AV8LinkSelection = "" ;
      edtavLinkselection_Internalname = "" ;
      edtTAT01_INFO_NO_Internalname = "" ;
      A207TAT01_DATE_START = GXutil.nullDate() ;
      edtTAT01_DATE_START_Internalname = "" ;
      A208TAT01_DATE_END = GXutil.nullDate() ;
      edtTAT01_DATE_END_Internalname = "" ;
      GXDecQS = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV16Pgmname = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      scmdbuf = "" ;
      H00282_A208TAT01_DATE_END = new java.util.Date[] {GXutil.nullDate()} ;
      H00282_n208TAT01_DATE_END = new boolean[] {false} ;
      H00282_A207TAT01_DATE_START = new java.util.Date[] {GXutil.nullDate()} ;
      H00282_n207TAT01_DATE_START = new boolean[] {false} ;
      H00282_A11TAT01_INFO_NO = new int[1] ;
      H00283_AGRID1_nRecordCount = new long[1] ;
      AV5C_TAM02_APP_ID = "" ;
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
      lblTextblocktat010_date_start_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tat01_sel__default(),
         new Object[] {
             new Object[] {
            H00282_A208TAT01_DATE_END, H00282_n208TAT01_DATE_END, H00282_A207TAT01_DATE_START, H00282_n207TAT01_DATE_START, H00282_A11TAT01_INFO_NO
            }
            , new Object[] {
            H00283_AGRID1_nRecordCount
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV16Pgmname = "TAT01_SEL" ;
      /* GeneXus formulas. */
      AV16Pgmname = "TAT01_SEL" ;
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
   private short nRC_GXsfl_28 ;
   private short nGXsfl_28_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short Gx_err ;
   private short nGXsfl_28_Refreshing=0 ;
   private int wcpOAV9pTAT01_INFO_NO ;
   private int subGrid1_Rows ;
   private int AV9pTAT01_INFO_NO ;
   private int A11TAT01_INFO_NO ;
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
   private String sGXsfl_28_idx="0001" ;
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
   private String edtTAT01_INFO_NO_Internalname ;
   private String edtTAT01_DATE_START_Internalname ;
   private String edtTAT01_DATE_END_Internalname ;
   private String GXDecQS ;
   private String AV16Pgmname ;
   private String scmdbuf ;
   private String edtavCtat01_date_start_from_Internalname ;
   private String edtavCtat01_date_start_to_Internalname ;
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
   private String edtTAT01_INFO_NO_Link ;
   private String tblTable4_Internalname ;
   private String TempTags ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblocktat010_date_start_Internalname ;
   private String lblTextblocktat010_date_start_Jsonclick ;
   private String tblTable5_Internalname ;
   private String edtavCtat01_date_start_from_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtavCtat01_date_start_to_Jsonclick ;
   private String sGXsfl_28_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTAT01_INFO_NO_Jsonclick ;
   private String edtTAT01_DATE_START_Jsonclick ;
   private String edtTAT01_DATE_END_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date AV6cTAT01_DATE_START_FROM ;
   private java.util.Date AV7cTAT01_DATE_START_TO ;
   private java.util.Date A207TAT01_DATE_START ;
   private java.util.Date A208TAT01_DATE_END ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n207TAT01_DATE_START ;
   private boolean n208TAT01_DATE_END ;
   private boolean returnInSub ;
   private boolean AV8LinkSelection_IsBlob ;
   private String AV5C_TAM02_APP_ID ;
   private String AV11W_ERRCD ;
   private String AV15Linkselection_GXI ;
   private String AV12W_KNGN_FLG ;
   private String AV8LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H00282_A208TAT01_DATE_END ;
   private boolean[] H00282_n208TAT01_DATE_END ;
   private java.util.Date[] H00282_A207TAT01_DATE_START ;
   private boolean[] H00282_n207TAT01_DATE_START ;
   private int[] H00282_A11TAT01_INFO_NO ;
   private long[] H00283_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

final  class tat01_sel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00282( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV6cTAT01_DATE_START_FROM ,
                                          java.util.Date AV7cTAT01_DATE_START_TO ,
                                          java.util.Date A207TAT01_DATE_START )
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
      sSelectString = " `TAT01_DATE_END`, `TAT01_DATE_START`, `TAT01_INFO_NO`" ;
      sFromString = " FROM `TAT01_INFO`" ;
      sOrderString = "" ;
      if ( ! GXutil.nullDate().equals(AV6cTAT01_DATE_START_FROM) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAT01_DATE_START` >= ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAT01_DATE_START` >= ?)" ;
         }
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! GXutil.nullDate().equals(AV7cTAT01_DATE_START_TO) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAT01_DATE_START` <= ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAT01_DATE_START` <= ?)" ;
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
      sOrderString = sOrderString + " ORDER BY `TAT01_INFO_NO` DESC" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + " LIMIT " + "?" + ", " + "?" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_H00283( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV6cTAT01_DATE_START_FROM ,
                                          java.util.Date AV7cTAT01_DATE_START_TO ,
                                          java.util.Date A207TAT01_DATE_START )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int6 ;
      GXv_int6 = new byte [2] ;
      Object[] GXv_Object7 ;
      GXv_Object7 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM `TAT01_INFO`" ;
      if ( ! GXutil.nullDate().equals(AV6cTAT01_DATE_START_FROM) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAT01_DATE_START` >= ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAT01_DATE_START` >= ?)" ;
         }
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! GXutil.nullDate().equals(AV7cTAT01_DATE_START_TO) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TAT01_DATE_START` <= ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TAT01_DATE_START` <= ?)" ;
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
            case 0 :
                  return conditional_H00282(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] );
            case 1 :
                  return conditional_H00283(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00282", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00283", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3) ;
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
                  stmt.setDate(sIdx, (java.util.Date)parms[4]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
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
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[2]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[3]);
               }
               return;
      }
   }

}

