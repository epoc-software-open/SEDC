/*
               File: gx0070_impl
        Description: Selection List お知らせ情報テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:44.49
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0070_impl extends GXDataArea
{
   public gx0070_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0070_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0070_impl.class ));
   }

   public gx0070_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            nGXsfl_28_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_28_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_28_idx, sGXsfl_28_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            /* GeneXus formulas. */
            AV15Pgmname = "Gx0070" ;
            Gx_err = (short)(0) ;
            Grid1_PageSize28 = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
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
            gxgrgrid1_refresh( Grid1_PageSize28, AV6cTAT01_DATE_START_FROM, AV7cTAT01_DATE_START_TO) ;
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
            AV9pTAT01_INFO_NO = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9pTAT01_INFO_NO", GXutil.ltrim( GXutil.str( AV9pTAT01_INFO_NO, 6, 0)));
         }
      }
      httpContext.setTheme("Style1");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         MasterPageObj = new promptmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,true);
         MasterPageObj.webExecute();
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
      if ( httpContext.isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa0K2( ) ;
      gxajaxcallmode = (byte)((httpContext.isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0K2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( Form.getCaption()) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;"+"background-color:"+WebUtils.getHTMLColor( Form.getIBackground())+";") ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         httpContext.writeText( " background-image:url("+httpContext.convertURL( Form.getBackground())+")") ;
      }
      httpContext.writeText( "\""+FormProcess+">") ;
      httpContext.skipLines( 1 );
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9pTAT01_INFO_NO,6,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("gx0070") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAT01_DATE_START_FROM", localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAT01_DATE_START_TO", localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"));
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPTAT01_INFO_NO", GXutil.ltrim( localUtil.ntoc( AV9pTAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(6), (byte)(0), ".", "")));
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
      gxajaxcallmode = (byte)((httpContext.isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         we0K2( ) ;
      }
   }

   public void dispatchEvents( )
   {
      evt0K2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public String getPgmname( )
   {
      return "Gx0070" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List お知らせ情報テーブル" ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9pTAT01_INFO_NO,6,0))) ;
      return formatLink("gx0070") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void wb0K0( )
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
         wb_table1_2_0K2( true) ;
      }
      else
      {
         wb_table1_2_0K2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0K2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0K2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "Selection List お知らせ情報テーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0K0( ) ;
   }

   public void ws0K2( )
   {
      start0K2( ) ;
      evt0K2( ) ;
   }

   public void evt0K2( )
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
               if ( !( localUtil.ctod( httpContext.cgiGet( "GXH_vCTAT01_DATE_START_FROM"), 6).equals( AV6cTAT01_DATE_START_FROM ) ) )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( !( localUtil.ctod( httpContext.cgiGet( "GXH_vCTAT01_DATE_START_TO"), 6).equals( AV7cTAT01_DATE_START_TO ) ) )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
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
                           edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_28_idx ;
                           edtTAT01_INFO_NO_Internalname = "TAT01_INFO_NO_"+sGXsfl_28_idx ;
                           edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_28_idx ;
                           edtTAT01_DATE_END_Internalname = "TAT01_DATE_END_"+sGXsfl_28_idx ;
                           AV8LinkSelection = httpContext.cgiGet( "GXimg"+edtavLinkselection_Internalname) ;
                           A71TAT01_INFO_NO = (int)(localUtil.ctol( httpContext.cgiGet( edtTAT01_INFO_NO_Internalname), ".", ",")) ;
                           A4TAT01_DATE_START = localUtil.ctod( httpContext.cgiGet( edtTAT01_DATE_START_Internalname), 6) ;
                           n4TAT01_DATE_START = false ;
                           A5TAT01_DATE_END = localUtil.ctod( httpContext.cgiGet( edtTAT01_DATE_END_Internalname), 6) ;
                           n5TAT01_DATE_END = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e110K2 */
                                 e110K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e120K2 */
                                 e120K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctat01_date_start_from Changed */
                                    if ( !( localUtil.ctod( httpContext.cgiGet( "GXH_vCTAT01_DATE_START_FROM"), 6).equals( AV6cTAT01_DATE_START_FROM ) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctat01_date_start_to Changed */
                                    if ( !( localUtil.ctod( httpContext.cgiGet( "GXH_vCTAT01_DATE_START_TO"), 6).equals( AV7cTAT01_DATE_START_TO ) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: e130K2 */
                                       e130K2 ();
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

   public void we0K2( )
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

   public void pa0K2( )
   {
      if ( nDonePA == 0 )
      {
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_28_idx ,
                                 String sGXsfl_28_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_28_idx ;
      edtTAT01_INFO_NO_Internalname = "TAT01_INFO_NO_"+sGXsfl_28_idx ;
      edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_28_idx ;
      edtTAT01_DATE_END_Internalname = "TAT01_DATE_END_"+sGXsfl_28_idx ;
      while ( nGXsfl_28_idx <= nRC_Grid1 )
      {
         sendrow_282( ) ;
         nGXsfl_28_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_28_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_28_idx+1)) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_28_idx, 4, 0)), (short)(4), "0") ;
         edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_28_idx ;
         edtTAT01_INFO_NO_Internalname = "TAT01_INFO_NO_"+sGXsfl_28_idx ;
         edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_28_idx ;
         edtTAT01_DATE_END_Internalname = "TAT01_DATE_END_"+sGXsfl_28_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int Grid1_PageSize28 ,
                                  java.util.Date AV6cTAT01_DATE_START_FROM ,
                                  java.util.Date AV7cTAT01_DATE_START_TO )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.disableOutput();
      subGrid1_Rows = (short)(Grid1_PageSize28) ;
      rf0K2( ) ;
      httpContext.enableOutput();
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0K2( ) ;
      /* End function Refresh */
   }

   public void rf0K2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(28) ;
      nGXsfl_28_idx = (short)(1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_28_idx, 4, 0)), (short)(4), "0") ;
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_28_idx ;
      edtTAT01_INFO_NO_Internalname = "TAT01_INFO_NO_"+sGXsfl_28_idx ;
      edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_28_idx ;
      edtTAT01_DATE_END_Internalname = "TAT01_DATE_END_"+sGXsfl_28_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_28_idx ;
         edtTAT01_INFO_NO_Internalname = "TAT01_INFO_NO_"+sGXsfl_28_idx ;
         edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_28_idx ;
         edtTAT01_DATE_END_Internalname = "TAT01_DATE_END_"+sGXsfl_28_idx ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV6cTAT01_DATE_START_FROM ,
                                              AV7cTAT01_DATE_START_TO ,
                                              A4TAT01_DATE_START },
                                              new int[] {
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN
                                              }
         });
         /* Using cursor H000K2 */
         pr_default.execute(0, new Object[] {AV6cTAT01_DATE_START_FROM, AV7cTAT01_DATE_START_TO});
         nGXsfl_28_idx = (short)(1) ;
         GRID1_nEOF = (byte)(0) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            A5TAT01_DATE_END = H000K2_A5TAT01_DATE_END[0] ;
            n5TAT01_DATE_END = H000K2_n5TAT01_DATE_END[0] ;
            A4TAT01_DATE_START = H000K2_A4TAT01_DATE_START[0] ;
            n4TAT01_DATE_START = H000K2_n4TAT01_DATE_START[0] ;
            A71TAT01_INFO_NO = H000K2_A71TAT01_INFO_NO[0] ;
            /* Execute user event: e120K2 */
            e120K2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(28) ;
         wb0K0( ) ;
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV6cTAT01_DATE_START_FROM ,
                                           AV7cTAT01_DATE_START_TO ,
                                           A4TAT01_DATE_START },
                                           new int[] {
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor H000K3 */
      pr_default.execute(1, new Object[] {AV6cTAT01_DATE_START_FROM, AV7cTAT01_DATE_START_TO});
      GRID1_nRecordCount = H000K3_AGRID1_nRecordCount[0] ;
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
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (int)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
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

   public void strup0K0( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "Gx0070" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e110K2 */
      e110K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCtat01_date_start_from_Internalname), (byte)(6)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {"公開開始日"}), 1, "vCTAT01_DATE_START_FROM");
            GX_FocusControl = edtavCtat01_date_start_from_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cTAT01_DATE_START_FROM = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTAT01_DATE_START_FROM", localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"));
         }
         else
         {
            AV6cTAT01_DATE_START_FROM = localUtil.ctod( httpContext.cgiGet( edtavCtat01_date_start_from_Internalname), 6) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTAT01_DATE_START_FROM", localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCtat01_date_start_to_Internalname), (byte)(6)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {"公開開始日"}), 1, "vCTAT01_DATE_START_TO");
            GX_FocusControl = edtavCtat01_date_start_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cTAT01_DATE_START_TO = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTAT01_DATE_START_TO", localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"));
         }
         else
         {
            AV7cTAT01_DATE_START_TO = localUtil.ctod( httpContext.cgiGet( edtavCtat01_date_start_to_Internalname), 6) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTAT01_DATE_START_TO", localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"));
         }
         /* Read saved values. */
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV9pTAT01_INFO_NO = (int)(localUtil.ctol( httpContext.cgiGet( "vPTAT01_INFO_NO"), ".", ",")) ;
         GRID1_nFirstRecordOnPage = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
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
      /* Execute user event: e110K2 */
      e110K2 ();
      if (returnInSub) return;
   }

   public void e110K2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "選択リスト %1", "お知らせ情報テーブル", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV5C_TAM02_APP_ID = "TAT01" ;
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

   private void e120K2( )
   {
      /* Load Routine */
      AV8LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", "Style1") ;
      if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_282( ) ;
      }
      GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
   }

   public void GXEnter( )
   {
      /* Execute user event: e130K2 */
      e130K2 ();
      if (returnInSub) return;
   }

   public void e130K2( )
   {
      /* Enter Routine */
      AV9pTAT01_INFO_NO = A71TAT01_INFO_NO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pTAT01_INFO_NO", GXutil.ltrim( GXutil.str( AV9pTAT01_INFO_NO, 6, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV9pTAT01_INFO_NO)});
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV10W_A_LOGIN_SDT;
      GXv_char4[0] = AV11W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char4) ;
      AV10W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      gx0070_impl.this.AV11W_ERRCD = GXv_char4[0] ;
      if ( GXutil.strcmp(AV11W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      Form.getJscriptsrc().add("js/acom.js");
   }

   public void S122( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char4[0] = AV12W_KNGN_FLG ;
      GXv_char5[0] = AV11W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV5C_TAM02_APP_ID, GXv_char4, GXv_char5) ;
      gx0070_impl.this.AV12W_KNGN_FLG = GXv_char4[0] ;
      gx0070_impl.this.AV11W_ERRCD = GXv_char5[0] ;
      if ( GXutil.strcmp(AV11W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1393( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV15Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "gx0070");
   }

   public void wb_table1_2_0K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "center")+"\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         ClassString = "FieldSet" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroup1_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"Filters"+"</legend>") ;
         wb_table2_9_0K2( true) ;
      }
      else
      {
         wb_table2_9_0K2( false) ;
      }
      return  ;
   }

   public void wb_table2_9_0K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Control Group */
         ClassString = "FieldSet" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroup2_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"選択リスト"+"</legend>") ;
         wb_table3_25_0K2( true) ;
      }
      else
      {
         wb_table3_25_0K2( false) ;
      }
      return  ;
   }

   public void wb_table3_25_0K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0K2e( true) ;
      }
      else
      {
         wb_table1_2_0K2e( false) ;
      }
   }

   public void wb_table3_25_0K2( boolean wbgen )
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
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 130, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "お知らせ情報番号") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "公開開始日") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "公開終了日") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
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
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "Grid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV8LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A71TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtTAT01_INFO_NO_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A4TAT01_DATE_START, "9999/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A5TAT01_DATE_END, "9999/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "false");
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 28 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_28_idx-1) ;
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
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"text-align:"+httpContext.getCssProperty( "Align", "right")+"\">") ;
         wb_table4_35_0K2( true) ;
      }
      else
      {
         wb_table4_35_0K2( false) ;
      }
      return  ;
   }

   public void wb_table4_35_0K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_25_0K2e( true) ;
      }
      else
      {
         wb_table3_25_0K2e( false) ;
      }
   }

   public void wb_table4_35_0K2( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 28, 3, 0)+","+"null"+");", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, 1, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0070.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_35_0K2e( true) ;
      }
      else
      {
         wb_table4_35_0K2e( false) ;
      }
   }

   public void wb_table2_9_0K2( boolean wbgen )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat010_date_start_Internalname, "公開開始日", "", "", lblTextblocktat010_date_start_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0070.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_14_0K2( true) ;
      }
      else
      {
         wb_table5_14_0K2( false) ;
      }
      return  ;
   }

   public void wb_table5_14_0K2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_9_0K2e( true) ;
      }
      else
      {
         wb_table2_9_0K2e( false) ;
      }
   }

   public void wb_table5_14_0K2( boolean wbgen )
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
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAT01_DATE_START_FROM", localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'" + sGXsfl_28_idx + "',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtat01_date_start_from_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtat01_date_start_from_Internalname, localUtil.format(AV6cTAT01_DATE_START_FROM, "9999/99/99"), localUtil.format( AV6cTAT01_DATE_START_FROM, "9999/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',0,24,'jap',false,0);"+";gx.evt.onblur(17);\"", "", "", "", "", edtavCtat01_date_start_from_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_Gx0070.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtat01_date_start_from_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_Gx0070.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, "～", "", "", lblTextblock10_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0070.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTAT01_DATE_START_TO", localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_28_idx + "',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtavCtat01_date_start_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtat01_date_start_to_Internalname, localUtil.format(AV7cTAT01_DATE_START_TO, "9999/99/99"), localUtil.format( AV7cTAT01_DATE_START_TO, "9999/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',0,24,'jap',false,0);"+";gx.evt.onblur(21);\"", "", "", "", "", edtavCtat01_date_start_to_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_Gx0070.htm");
         GxWebStd.gx_bitmap( httpContext, edtavCtat01_date_start_to_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_Gx0070.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_14_0K2e( true) ;
      }
      else
      {
         wb_table5_14_0K2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV9pTAT01_INFO_NO = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pTAT01_INFO_NO", GXutil.ltrim( GXutil.str( AV9pTAT01_INFO_NO, 6, 0)));
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
      pa0K2( ) ;
      ws0K2( ) ;
      we0K2( ) ;
      if ( httpContext.isAjaxCallMode( ) )
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
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
      httpContext.AddThemeStyleSheetFile("", "Style1.css", "?14455155");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14574480");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("gx0070.js", "?14574480");
      /* End function include_jscripts */
   }

   public void sendrow_282( )
   {
      wb0K0( ) ;
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
            if ( ((int)(nGXsfl_28_idx) % (2)) == 0 )
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
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+subGrid1_Linesclass+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_28_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A71TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")))+"'"+"]);" ;
         ClassString = "Image" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("bitmap", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,AV8LinkSelection,edtavLinkselection_Link,"","","Style1",new Integer(-1),new Integer(1),"","選択",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","''",""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         edtTAT01_INFO_NO_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A71TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")))+"'"+"]);" ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAT01_INFO_NO_Internalname,GXutil.ltrim( localUtil.ntoc( A71TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A71TAT01_INFO_NO), "ZZZZZ9"),"","",edtTAT01_INFO_NO_Link,"","",edtTAT01_INFO_NO_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(130),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(28),new Integer(1),new Integer(1),new Boolean(true),"right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAT01_DATE_START_Internalname,localUtil.format(A4TAT01_DATE_START, "9999/99/99"),localUtil.format( A4TAT01_DATE_START, "9999/99/99"),"","","","","選択",edtTAT01_DATE_START_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(100),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(28),new Integer(1),new Integer(1),new Boolean(true),"right"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAT01_DATE_END_Internalname,localUtil.format(A5TAT01_DATE_END, "9999/99/99"),localUtil.format( A5TAT01_DATE_END, "9999/99/99"),"","","","","",edtTAT01_DATE_END_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(100),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(28),new Integer(1),new Integer(1),new Boolean(true),"right"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_28_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_28_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_28_idx+1)) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_28_idx, 4, 0)), (short)(4), "0") ;
         edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_28_idx ;
         edtTAT01_INFO_NO_Internalname = "TAT01_INFO_NO_"+sGXsfl_28_idx ;
         edtTAT01_DATE_START_Internalname = "TAT01_DATE_START_"+sGXsfl_28_idx ;
         edtTAT01_DATE_END_Internalname = "TAT01_DATE_END_"+sGXsfl_28_idx ;
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
      edtTAT01_INFO_NO_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "Grid" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List お知らせ情報テーブル" );
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
                  /* Execute user subroutine: S1393 */
                  S1393 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15Pgmname = "" ;
      AV6cTAT01_DATE_START_FROM = GXutil.nullDate() ;
      AV7cTAT01_DATE_START_TO = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      edtavLinkselection_Internalname = "" ;
      edtTAT01_INFO_NO_Internalname = "" ;
      edtTAT01_DATE_START_Internalname = "" ;
      edtTAT01_DATE_END_Internalname = "" ;
      AV8LinkSelection = "" ;
      A4TAT01_DATE_START = GXutil.nullDate() ;
      A5TAT01_DATE_END = GXutil.nullDate() ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      H000K2_A5TAT01_DATE_END = new java.util.Date[] {GXutil.nullDate()} ;
      H000K2_n5TAT01_DATE_END = new boolean[] {false} ;
      H000K2_A4TAT01_DATE_START = new java.util.Date[] {GXutil.nullDate()} ;
      H000K2_n4TAT01_DATE_START = new boolean[] {false} ;
      H000K2_A71TAT01_INFO_NO = new int[1] ;
      H000K3_AGRID1_nRecordCount = new int[1] ;
      AV5C_TAM02_APP_ID = "" ;
      AV11W_ERRCD = "" ;
      AV10W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV12W_KNGN_FLG = "" ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      subGrid1_Linesclass = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      TempTags = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      lblTextblocktat010_date_start_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      GXt_char6 = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GXt_char7 = "" ;
      ROClassString = "" ;
      GXt_char8 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new gx0070__default(),
         new Object[] {
             new Object[] {
            H000K2_A5TAT01_DATE_END, H000K2_n5TAT01_DATE_END, H000K2_A4TAT01_DATE_START, H000K2_n4TAT01_DATE_START, H000K2_A71TAT01_INFO_NO
            }
            , new Object[] {
            H000K3_AGRID1_nRecordCount
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV15Pgmname = "Gx0070" ;
      /* GeneXus formulas. */
      AV15Pgmname = "Gx0070" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_Grid1 ;
   private short nGXsfl_28_idx=1 ;
   private short Gx_err ;
   private short wbEnd ;
   private short wbStart ;
   private short subGrid1_Rows ;
   private int wcpOAV9pTAT01_INFO_NO ;
   private int Grid1_PageSize28 ;
   private int AV9pTAT01_INFO_NO ;
   private int GRID1_nFirstRecordOnPage ;
   private int A71TAT01_INFO_NO ;
   private int subGrid1_Islastpage ;
   private int GRID1_nCurrentRecord ;
   private int GRID1_nRecordCount ;
   private int GXActiveErrHndl ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_28_idx="0001" ;
   private String AV15Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
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
   private String scmdbuf ;
   private String edtavCtat01_date_start_from_Internalname ;
   private String edtavCtat01_date_start_to_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
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
   private String GXt_char2 ;
   private String GXt_char1 ;
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
   private String GXt_char6 ;
   private String GXt_char7 ;
   private String ROClassString ;
   private String edtTAT01_INFO_NO_Jsonclick ;
   private String edtTAT01_DATE_START_Jsonclick ;
   private String edtTAT01_DATE_END_Jsonclick ;
   private String GXt_char8 ;
   private String Gx_emsg ;
   private java.util.Date AV6cTAT01_DATE_START_FROM ;
   private java.util.Date AV7cTAT01_DATE_START_TO ;
   private java.util.Date A4TAT01_DATE_START ;
   private java.util.Date A5TAT01_DATE_END ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4TAT01_DATE_START ;
   private boolean n5TAT01_DATE_END ;
   private boolean returnInSub ;
   private String AV5C_TAM02_APP_ID ;
   private String AV11W_ERRCD ;
   private String AV12W_KNGN_FLG ;
   private String AV8LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXMasterPage MasterPageObj ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H000K2_A5TAT01_DATE_END ;
   private boolean[] H000K2_n5TAT01_DATE_END ;
   private java.util.Date[] H000K2_A4TAT01_DATE_START ;
   private boolean[] H000K2_n4TAT01_DATE_START ;
   private int[] H000K2_A71TAT01_INFO_NO ;
   private int[] H000K3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class gx0070__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000K2( com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV6cTAT01_DATE_START_FROM ,
                                          java.util.Date AV7cTAT01_DATE_START_TO ,
                                          java.util.Date A4TAT01_DATE_START )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int9 ;
      GXv_int9 = new byte [2] ;
      Object[] GXv_Object10 ;
      GXv_Object10 = new Object [2] ;
      scmdbuf = "SELECT `TAT01_DATE_END`, `TAT01_DATE_START`, `TAT01_INFO_NO` FROM `TAT01_INFO`" ;
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
         GXv_int9[0] = (byte)(1) ;
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
         GXv_int9[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE " + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TAT01_INFO_NO` DESC" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H000K3( com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV6cTAT01_DATE_START_FROM ,
                                          java.util.Date AV7cTAT01_DATE_START_TO ,
                                          java.util.Date A4TAT01_DATE_START )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int11 ;
      GXv_int11 = new byte [2] ;
      Object[] GXv_Object12 ;
      GXv_Object12 = new Object [2] ;
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
         GXv_int11[0] = (byte)(1) ;
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
         GXv_int11[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE " + sWhereString ;
      }
      scmdbuf = scmdbuf + "" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H000K2(httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] );
            case 1 :
                  return conditional_H000K3(httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000K3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               break;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               break;
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
               break;
      }
   }

}

