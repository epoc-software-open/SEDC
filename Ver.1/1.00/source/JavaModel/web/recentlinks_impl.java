/*
               File: recentlinks_impl
        Description: Recent Links web component
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:42.2
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recentlinks_impl extends GXWebComponent
{
   public recentlinks_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recentlinks_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recentlinks_impl.class ));
   }

   public recentlinks_impl( int remoteHandle ,
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
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetNextPar( ) ;
               sSFPrefix = httpContext.GetNextPar( ) ;
               AV6FormCaption = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FormCaption", AV6FormCaption);
               AV7FormPgmName = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7FormPgmName", AV7FormPgmName);
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV6FormCaption,AV7FormPgmName});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Links") == 0 )
            {
               nRC_Links = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               nGXsfl_7_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               sGXsfl_7_idx = httpContext.GetNextPar( ) ;
               sPrefix = httpContext.GetNextPar( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxnrlinks_newrow( nRC_Links, nGXsfl_7_idx, sGXsfl_7_idx, sPrefix) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Links") == 0 )
            {
               /* GeneXus formulas. */
               Gx_err = (short)(0) ;
               AV6FormCaption = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FormCaption", AV6FormCaption);
               AV7FormPgmName = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7FormPgmName", AV7FormPgmName);
               sPrefix = httpContext.GetNextPar( ) ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxgrlinks_refresh( AV6FormCaption, AV7FormPgmName, sPrefix) ;
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
         }
      }
      httpContext.setTheme("Style2");
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! httpContext.isAjaxCallMode( ) )
      {
         pa022( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! httpContext.isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
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
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.writeText( "<title>") ;
         httpContext.writeText( "Recent Links web component") ;
         httpContext.writeTextNL( "</title>") ;
         if ( GXutil.len( sDynURL) > 0 )
         {
            httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
         }
         define_styles( ) ;
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
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         FormProcess = ((nGXWrapped==0) ? " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,false,false)\" onkeydown=\"gx.evt.onkeypress(null,false,false)\"" : "") ;
         httpContext.writeText( "<body") ;
         httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;white-space: nowrap;") ;
         httpContext.writeText( "\""+FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV6FormCaption)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7FormPgmName)) ;
            httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("recentlinks") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
            GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         }
      }
   }

   public void renderHtmlCloseForm022( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_Links", GXutil.ltrim( localUtil.ntoc( nRC_Links, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6FormCaption", GXutil.rtrim( wcpOAV6FormCaption));
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7FormPgmName", GXutil.rtrim( wcpOAV7FormPgmName));
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORMCAPTION", GXutil.rtrim( AV6FormCaption));
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORMPGMNAME", GXutil.rtrim( AV7FormPgmName));
      if ( ( GXutil.len( sPrefix) != 0 ) && httpContext.isAjaxRequest( ) )
      {
         httpContext.AddJavascriptSource("recentlinks.js", "?1451424");
      }
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", "notset");
      define_styles( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
         httpContext.SendComponentObjects();
         httpContext.SendServerCommands();
         httpContext.SendState();
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
         include_jscripts( ) ;
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
      }
   }

   public void wb020( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "recentlinks");
         }
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         wb_table1_2_022( true) ;
      }
      else
      {
         wb_table1_2_022( false) ;
      }
      return  ;
   }

   public void wb_table1_2_022e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_13_022( true) ;
      }
      else
      {
         wb_table2_13_022( false) ;
      }
      return  ;
   }

   public void wb_table2_13_022e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start022( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) != 0 )
      {
         GXKey = context.getSiteKey( ) ;
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
         Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
         Form.getMeta().addItem("Description", "Recent Links web component", (short)(0)) ;
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup020( ) ;
         }
      }
   }

   public void ws022( )
   {
      start022( ) ;
      evt022( ) ;
   }

   public void evt022( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
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
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup020( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup020( ) ;
                           }
                           if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "LINKS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup020( ) ;
                           }
                           nGXsfl_7_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_7_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_7_idx, 4, 0)), (short)(4), "0") ;
                           lblPlace_Internalname = sPrefix+"PLACE_"+sGXsfl_7_idx ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "LINKS.LOAD") == 0 )
                              {
                                 if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       /* Execute user event: e11022 */
                                       e11022 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "CANCEL") == 0 )
                              {
                                 if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup020( ) ;
                                 }
                                 if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                    }
                                 }
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

   public void we022( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm022( ) ;
         }
      }
   }

   public void pa022( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
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
         }
         if ( ! ( httpContext.isAjaxCallMode( ) || httpContext.isFullAjaxMode( ) ) )
         {
            if ( GXutil.len( sPrefix) == 0 )
            {
               if ( nGotPars == 0 )
               {
                  entryPointCalled = false ;
                  gxfirstwebparm = httpContext.GetNextPar( ) ;
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

   public void gxnrlinks_newrow( short nRC_Links ,
                                 short nGXsfl_7_idx ,
                                 String sGXsfl_7_idx ,
                                 String sPrefix )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      lblPlace_Internalname = sPrefix+"PLACE_"+sGXsfl_7_idx ;
      while ( nGXsfl_7_idx <= nRC_Links )
      {
         sendrow_72( ) ;
         nGXsfl_7_idx = (short)(((subLinks_Islastpage==1)&&(nGXsfl_7_idx+1>sublinks_recordsperpage( )) ? 1 : nGXsfl_7_idx+1)) ;
         sGXsfl_7_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_7_idx, 4, 0)), (short)(4), "0") ;
         lblPlace_Internalname = sPrefix+"PLACE_"+sGXsfl_7_idx ;
      }
      httpContext.GX_webresponse.addString(LinksContainer.ToJavascriptSource());
      /* End function gxnrLinks_newrow */
   }

   public void gxgrlinks_refresh( String AV6FormCaption ,
                                  String AV7FormPgmName ,
                                  String sPrefix )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.disableOutput();
      rf022( ) ;
      httpContext.enableOutput();
      httpContext.GX_webresponse.addString(LinksContainer.ToJavascriptSource());
      /* End function gxgrLinks_refresh */
   }

   public void refresh( )
   {
      rf022( ) ;
      /* End function Refresh */
   }

   public void rf022( )
   {
      LinksContainer.setPageSize( sublinks_recordsperpage( ) );
      wbStart = (short)(7) ;
      nGXsfl_7_idx = (short)(1) ;
      sGXsfl_7_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_7_idx, 4, 0)), (short)(4), "0") ;
      lblPlace_Internalname = sPrefix+"PLACE_"+sGXsfl_7_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         lblPlace_Internalname = sPrefix+"PLACE_"+sGXsfl_7_idx ;
         /* Execute user event: e11022 */
         e11022 ();
         wbEnd = (short)(7) ;
         wb020( ) ;
      }
   }

   public int sublinks_pagecount( )
   {
      return -1 ;
   }

   public int sublinks_recordcount( )
   {
      return -1 ;
   }

   public int sublinks_recordsperpage( )
   {
      return -1 ;
   }

   public int sublinks_currentpage( )
   {
      return -1 ;
   }

   public void strup020( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         /* Read saved values. */
         nRC_Links = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_Links"), ".", ",")) ;
         wcpOAV6FormCaption = httpContext.cgiGet( sPrefix+"wcpOAV6FormCaption") ;
         wcpOAV7FormPgmName = httpContext.cgiGet( sPrefix+"wcpOAV7FormPgmName") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   private void e11022( )
   {
      /* Links_Load Routine */
      AV11RecentLinksItems.fromxml(AV8Session.getValue("RecentLinks"), "");
      if ( (GXutil.strcmp("", AV7FormPgmName)==0) || ( GXutil.strcmp(GXutil.substring( AV7FormPgmName, 1, 1), "T") != 0 ) )
      {
         AV9i = 1 ;
         while ( AV9i <= AV11RecentLinksItems.size() )
         {
            AV12RecentLinksItem = (SdtLinkList_LinkItem)((SdtLinkList_LinkItem)AV11RecentLinksItems.elementAt(-1+AV9i));
            if ( GXutil.strcmp(GXutil.trim( AV12RecentLinksItem.getgxTv_SdtLinkList_LinkItem_Caption()), GXutil.trim( AV6FormCaption)) == 0 )
            {
               AV11RecentLinksItems.remove(AV9i);
            }
            else
            {
               AV9i = (int)(AV9i+1) ;
            }
         }
         while ( AV11RecentLinksItems.size() > 8 - 1 )
         {
            AV11RecentLinksItems.remove(1);
         }
         AV12RecentLinksItem = (SdtLinkList_LinkItem)new SdtLinkList_LinkItem(remoteHandle, context);
         AV12RecentLinksItem.setgxTv_SdtLinkList_LinkItem_Caption( GXutil.trim( AV6FormCaption) );
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12RecentLinksItem", AV12RecentLinksItem);
         AV12RecentLinksItem.setgxTv_SdtLinkList_LinkItem_Url( AV10Request.getScriptName()+"?"+AV10Request.getQuerystring() );
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12RecentLinksItem", AV12RecentLinksItem);
         AV11RecentLinksItems.add(AV12RecentLinksItem, 0);
         AV8Session.setValue("RecentLinks", AV11RecentLinksItems.toxml(false, "LinkList", "SmartEDC_SHIZUOKA"));
      }
      AV9i = 1 ;
      while ( AV9i <= AV11RecentLinksItems.size() )
      {
         AV12RecentLinksItem = (SdtLinkList_LinkItem)((SdtLinkList_LinkItem)AV11RecentLinksItems.elementAt(-1+AV9i));
         lblPlace_Caption = AV12RecentLinksItem.getgxTv_SdtLinkList_LinkItem_Caption() ;
         if ( AV9i < AV11RecentLinksItems.size() )
         {
            lblPlace_Link = formatLink(AV12RecentLinksItem.getgxTv_SdtLinkList_LinkItem_Url())  ;
         }
         else
         {
            lblPlace_Link = "" ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(7) ;
         }
         sendrow_72( ) ;
         AV9i = (int)(AV9i+1) ;
      }
   }

   public void wb_table2_13_022( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblBottomline_Internalname, tblBottomline_Internalname, "", "HorizontalLine", 0, "", "", 0, 0, sStyleString, "none", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_13_022e( true) ;
      }
      else
      {
         wb_table2_13_022e( false) ;
      }
   }

   public void wb_table1_2_022( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable_Internalname, tblTable_Internalname, "", "RecentLinksTable", 0, "", "", 0, 0, sStyleString, "none", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:1%\">") ;
         /* Text block */
         ClassString = "RecentLink" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblRecenttext_Internalname, "Recents: ", "", "", lblRecenttext_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_RecentLinks.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /*  Grid Control  */
         LinksContainer.SetIsFreestyle(true);
         LinksContainer.SetWrapped(nGXWrapped);
         if ( LinksContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+sPrefix+"LinksContainer"+"DivS\" gxgridid=\"7\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subLinks_Internalname, subLinks_Internalname, "", "RecentLinksTable", 0, "", "", 1, 2, sStyleString, "", 0);
            LinksContainer.AddObjectProperty("GridName", "Links");
         }
         else
         {
            LinksContainer.AddObjectProperty("GridName", "Links");
            LinksContainer.AddObjectProperty("Class", GXutil.rtrim( "RecentLinksTable"));
            LinksContainer.AddObjectProperty("Class", "RecentLinksTable");
            LinksContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subLinks_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("CmpContext", sPrefix);
            LinksContainer.AddObjectProperty("InMasterPage", "false");
            LinksColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            LinksContainer.AddColumnProperties(LinksColumn);
            LinksColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            LinksContainer.AddColumnProperties(LinksColumn);
            LinksColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            LinksColumn.AddObjectProperty("Value", lblPlace_Caption);
            LinksContainer.AddColumnProperties(LinksColumn);
            LinksColumn = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            LinksContainer.AddColumnProperties(LinksColumn);
            LinksContainer.AddObjectProperty("Allowselection", "true");
            LinksContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subLinks_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Allowhover", "true");
            LinksContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subLinks_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            LinksContainer.AddObjectProperty("Allowcollapsing", ((subLinks_Allowcollapsing==1) ? "true" : "false"));
            LinksContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subLinks_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 7 )
      {
         wbEnd = (short)(0) ;
         nRC_Links = (short)(nGXsfl_7_idx-1) ;
         if ( LinksContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"LinksContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Links", LinksContainer);
            GxWebStd.gx_hidden_field( httpContext, sPrefix+"LinksContainerData", LinksContainer.ToJavascriptSource());
            if ( httpContext.isAjaxRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, sPrefix+"LinksContainerData"+"V", LinksContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"LinksContainerData"+"V"+"\" value='"+LinksContainer.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"td100\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_022e( true) ;
      }
      else
      {
         wb_table1_2_022e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV6FormCaption = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FormCaption", AV6FormCaption);
      AV7FormPgmName = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7FormPgmName", AV7FormPgmName);
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
      pa022( ) ;
      ws022( ) ;
      we022( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV6FormCaption = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV7FormPgmName = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa022( ) ;
      wcparametersget( ) ;
   }

   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "recentlinks");
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
      }
      pa022( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV6FormCaption = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FormCaption", AV6FormCaption);
         AV7FormPgmName = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7FormPgmName", AV7FormPgmName);
      }
      wcpOAV6FormCaption = httpContext.cgiGet( sPrefix+"wcpOAV6FormCaption") ;
      wcpOAV7FormPgmName = httpContext.cgiGet( sPrefix+"wcpOAV7FormPgmName") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV6FormCaption, wcpOAV6FormCaption) != 0 ) || ( GXutil.strcmp(AV7FormPgmName, wcpOAV7FormPgmName) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV6FormCaption = AV6FormCaption ;
      wcpOAV7FormPgmName = AV7FormPgmName ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV6FormCaption = httpContext.cgiGet( sPrefix+"AV6FormCaption_CTRL") ;
      if ( GXutil.len( sCtrlAV6FormCaption) > 0 )
      {
         AV6FormCaption = httpContext.cgiGet( sCtrlAV6FormCaption) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FormCaption", AV6FormCaption);
      }
      else
      {
         AV6FormCaption = httpContext.cgiGet( sPrefix+"AV6FormCaption_PARM") ;
      }
      sCtrlAV7FormPgmName = httpContext.cgiGet( sPrefix+"AV7FormPgmName_CTRL") ;
      if ( GXutil.len( sCtrlAV7FormPgmName) > 0 )
      {
         AV7FormPgmName = httpContext.cgiGet( sCtrlAV7FormPgmName) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7FormPgmName", AV7FormPgmName);
      }
      else
      {
         AV7FormPgmName = httpContext.cgiGet( sPrefix+"AV7FormPgmName_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa022( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws022( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws022( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6FormCaption_PARM", GXutil.rtrim( AV6FormCaption));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6FormCaption)) > 0 )
      {
         GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6FormCaption_CTRL", GXutil.rtrim( sCtrlAV6FormCaption));
      }
      GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7FormPgmName_PARM", GXutil.rtrim( AV7FormPgmName));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7FormPgmName)) > 0 )
      {
         GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7FormPgmName_CTRL", GXutil.rtrim( sCtrlAV7FormPgmName));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we022( ) ;
      cleanup();
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName ;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14514222");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("recentlinks.js", "?14514222");
      }
      /* End function include_jscripts */
   }

   public void sendrow_72( )
   {
      wb020( ) ;
      LinksRow = GXWebRow.GetNew(context,LinksContainer) ;
      if ( subLinks_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subLinks_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subLinks_Class, "") != 0 )
         {
            subLinks_Linesclass = subLinks_Class+"Odd" ;
         }
      }
      else if ( subLinks_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subLinks_Backstyle = (byte)(0) ;
         subLinks_Backcolor = subLinks_Allbackcolor ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"LinksContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subLinks_Backcolor, 9, 0)));
         if ( GXutil.strcmp(subLinks_Class, "") != 0 )
         {
            subLinks_Linesclass = subLinks_Class+"Uniform" ;
         }
      }
      else if ( subLinks_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subLinks_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subLinks_Class, "") != 0 )
         {
            subLinks_Linesclass = subLinks_Class+"Odd" ;
         }
         subLinks_Backcolor = (int)(0xFFFFFF) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"LinksContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subLinks_Backcolor, 9, 0)));
      }
      else if ( subLinks_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subLinks_Backstyle = (byte)(1) ;
         if ( ((int)(nGXsfl_7_idx/ (double) (0)) % (2)) == 0 )
         {
            subLinks_Backcolor = (int)(0x0) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"LinksContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subLinks_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subLinks_Class, "") != 0 )
            {
               subLinks_Linesclass = subLinks_Class+"Even" ;
            }
         }
         else
         {
            subLinks_Backcolor = (int)(0xFFFFFF) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"LinksContainerDiv", "Backcolor", GXutil.ltrim( GXutil.str( subLinks_Backcolor, 9, 0)));
            if ( GXutil.strcmp(subLinks_Class, "") != 0 )
            {
               subLinks_Linesclass = subLinks_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      LinksRow.AddColumnProperties("row", -1, httpContext.isAjaxCallMode( ), new Object[] {"",subLinks_Linesclass,""});
      LinksRow.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      /* Text block */
      ClassString = "RecentLink" ;
      StyleString = "" ;
      LinksRow.AddColumnProperties("label", 1, httpContext.isAjaxCallMode( ), new Object[] {lblPlace_Internalname,lblPlace_Caption,lblPlace_Link,"",lblPlace_Jsonclick,"",StyleString,ClassString,new Integer(0),"",new Integer(1),new Integer(1),new Integer(0)});
      if ( LinksContainer.GetWrapped() == 1 )
      {
         LinksContainer.CloseTag("cell");
      }
      LinksRow.AddColumnProperties("cell", -1, httpContext.isAjaxCallMode( ), new Object[] {"",""});
      if ( LinksContainer.GetWrapped() == 1 )
      {
         LinksContainer.CloseTag("cell");
      }
      if ( LinksContainer.GetWrapped() == 1 )
      {
         LinksContainer.CloseTag("row");
      }
      /* End of Columns property logic. */
      LinksContainer.AddRow(LinksRow);
      nGXsfl_7_idx = (short)(((subLinks_Islastpage==1)&&(nGXsfl_7_idx+1>sublinks_recordsperpage( )) ? 1 : nGXsfl_7_idx+1)) ;
      sGXsfl_7_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_7_idx, 4, 0)), (short)(4), "0") ;
      lblPlace_Internalname = sPrefix+"PLACE_"+sGXsfl_7_idx ;
      /* End function sendrow_72 */
   }

   public void init_default_properties( )
   {
      lblRecenttext_Internalname = sPrefix+"RECENTTEXT" ;
      tblTable_Internalname = sPrefix+"TABLE" ;
      tblBottomline_Internalname = sPrefix+"BOTTOMLINE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subLinks_Internalname = sPrefix+"LINKS" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      lblPlace_Jsonclick = "" ;
      lblPlace_Link = "" ;
      subLinks_Class = "RecentLinksTable" ;
      subLinks_Allowcollapsing = (byte)(0) ;
      lblPlace_Caption = "Place" ;
      subLinks_Backcolorstyle = (byte)(0) ;
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
      wcpOAV6FormCaption = "" ;
      wcpOAV7FormPgmName = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV6FormCaption = "" ;
      AV7FormPgmName = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXt_char3 = "" ;
      GXt_char4 = "" ;
      GX_FocusControl = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      lblPlace_Internalname = "" ;
      GXDecQS = "" ;
      LinksContainer = new com.genexus.webpanels.GXWebGrid(context);
      AV11RecentLinksItems = new GxObjectCollection(SdtLinkList_LinkItem.class, "LinkList.LinkItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV8Session = httpContext.getWebSession();
      AV12RecentLinksItem = new SdtLinkList_LinkItem(remoteHandle, context);
      AV10Request = httpContext.getHttpRequest();
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblRecenttext_Jsonclick = "" ;
      LinksColumn = new com.genexus.webpanels.GXWebColumn();
      GXt_char5 = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV6FormCaption = "" ;
      sCtrlAV7FormPgmName = "" ;
      GXt_char6 = "" ;
      LinksRow = new com.genexus.webpanels.GXWebRow();
      subLinks_Linesclass = "" ;
      GXt_char7 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subLinks_Backcolorstyle ;
   private byte subLinks_Allowcollapsing ;
   private byte subLinks_Collapsed ;
   private byte subLinks_Backstyle ;
   private short nRC_Links ;
   private short nGXsfl_7_idx=1 ;
   private short Gx_err ;
   private short wbEnd ;
   private short wbStart ;
   private int subLinks_Islastpage ;
   private int AV9i ;
   private int subLinks_Selectioncolor ;
   private int subLinks_Hoveringcolor ;
   private int idxLst ;
   private int subLinks_Backcolor ;
   private int subLinks_Allbackcolor ;
   private String wcpOAV6FormCaption ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV6FormCaption ;
   private String sGXsfl_7_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXt_char3 ;
   private String GXt_char4 ;
   private String GX_FocusControl ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String lblPlace_Internalname ;
   private String GXDecQS ;
   private String lblPlace_Caption ;
   private String lblPlace_Link ;
   private String sStyleString ;
   private String tblBottomline_Internalname ;
   private String tblTable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String lblRecenttext_Internalname ;
   private String lblRecenttext_Jsonclick ;
   private String subLinks_Internalname ;
   private String GXt_char5 ;
   private String sCtrlAV6FormCaption ;
   private String sCtrlAV7FormPgmName ;
   private String GXt_char6 ;
   private String subLinks_Class ;
   private String subLinks_Linesclass ;
   private String lblPlace_Jsonclick ;
   private String GXt_char7 ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private String wcpOAV7FormPgmName ;
   private String AV7FormPgmName ;
   private com.genexus.webpanels.GXWebGrid LinksContainer ;
   private com.genexus.webpanels.GXWebRow LinksRow ;
   private com.genexus.webpanels.GXWebColumn LinksColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10Request ;
   private com.genexus.webpanels.WebSession AV8Session ;
   private GxObjectCollection AV11RecentLinksItems ;
   private SdtLinkList_LinkItem AV12RecentLinksItem ;
}

