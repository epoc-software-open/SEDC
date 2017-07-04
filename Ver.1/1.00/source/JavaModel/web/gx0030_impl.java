/*
               File: gx0030_impl
        Description: Selection List  ユーザーマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:45.4
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0030_impl extends GXDataArea
{
   public gx0030_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0030_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0030_impl.class ));
   }

   public gx0030_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vCTAM07_KNGN_PTN_KBN") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvctam07_kngn_ptn_kbn0L2( ) ;
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
            nGXsfl_26_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_26_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_Grid1, nGXsfl_26_idx, sGXsfl_26_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            /* GeneXus formulas. */
            AV15Pgmname = "Gx0030" ;
            Gx_err = (short)(0) ;
            dynavCtam07_kngn_ptn_kbn.setName( "vCTAM07_KNGN_PTN_KBN" );
            dynavCtam07_kngn_ptn_kbn.setWebtags( "" );
            Grid1_PageSize26 = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
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
            gxgrgrid1_refresh( Grid1_PageSize26, AV5cTAM07_KNGN_PTN_KBN, AV6cTAM07_USER_NM) ;
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
            AV8pTAM07_USER_ID = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8pTAM07_USER_ID", AV8pTAM07_USER_ID);
         }
      }
      httpContext.setTheme("Style2");
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
      pa0L2( ) ;
      gxajaxcallmode = (byte)((httpContext.isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0L2( ) ;
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
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV8pTAM07_USER_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("gx0030") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM07_KNGN_PTN_KBN", GXutil.rtrim( AV5cTAM07_KNGN_PTN_KBN));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vCTAM07_USER_NM", GXutil.rtrim( AV6cTAM07_USER_NM));
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "nRC_Grid1", GXutil.ltrim( localUtil.ntoc( nRC_Grid1, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPTAM07_USER_ID", GXutil.rtrim( AV8pTAM07_USER_ID));
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
         we0L2( ) ;
      }
   }

   public void dispatchEvents( )
   {
      evt0L2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public String getPgmname( )
   {
      return "Gx0030" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List  ユーザーマスタ" ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim(AV8pTAM07_USER_ID)) ;
      return formatLink("gx0030") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void wb0L0( )
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
         wb_table1_2_0L2( true) ;
      }
      else
      {
         wb_table1_2_0L2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0L2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0L2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "Selection List  ユーザーマスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0L0( ) ;
   }

   public void ws0L2( )
   {
      start0L2( ) ;
      evt0L2( ) ;
   }

   public void evt0L2( )
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
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM07_KNGN_PTN_KBN"), AV5cTAM07_KNGN_PTN_KBN) != 0 )
               {
                  GRID1_nFirstRecordOnPage = 0 ;
               }
               if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTAM07_USER_NM"), AV6cTAM07_USER_NM) != 0 )
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
                           nGXsfl_26_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
                           edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_26_idx ;
                           edtTAM07_USER_ID_Internalname = "TAM07_USER_ID_"+sGXsfl_26_idx ;
                           edtTAM07_USER_NM_Internalname = "TAM07_USER_NM_"+sGXsfl_26_idx ;
                           edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_26_idx ;
                           AV7LinkSelection = httpContext.cgiGet( "GXimg"+edtavLinkselection_Internalname) ;
                           A8TAM07_USER_ID = httpContext.cgiGet( edtTAM07_USER_ID_Internalname) ;
                           A2TAM07_USER_NM = httpContext.cgiGet( edtTAM07_USER_NM_Internalname) ;
                           n2TAM07_USER_NM = false ;
                           A98TAM04_AUTH_NM = httpContext.cgiGet( edtTAM04_AUTH_NM_Internalname) ;
                           n98TAM04_AUTH_NM = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e110L2 */
                                 e110L2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: e120L2 */
                                 e120L2 ();
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
                                       /* Execute user event: e130L2 */
                                       e130L2 ();
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

   public void we0L2( )
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

   public void pa0L2( )
   {
      if ( nDonePA == 0 )
      {
         dynavCtam07_kngn_ptn_kbn.setName( "vCTAM07_KNGN_PTN_KBN" );
         dynavCtam07_kngn_ptn_kbn.setWebtags( "" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlvvctam07_kngn_ptn_kbn0L2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvctam07_kngn_ptn_kbn_data0L2( ) ;
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

   public void gxvvctam07_kngn_ptn_kbn_html0L2( )
   {
      String gxdynajaxvalue ;
      gxdlvvctam07_kngn_ptn_kbn_data0L2( ) ;
      gxdynajaxindex = 1 ;
      dynavCtam07_kngn_ptn_kbn.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavCtam07_kngn_ptn_kbn.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         if ( ( dynavCtam07_kngn_ptn_kbn.getItemCount() > 0 ) && (GXutil.strcmp("", AV5cTAM07_KNGN_PTN_KBN)==0) )
         {
            AV5cTAM07_KNGN_PTN_KBN = dynavCtam07_kngn_ptn_kbn.getItemValue((short)(1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5cTAM07_KNGN_PTN_KBN", AV5cTAM07_KNGN_PTN_KBN);
         }
      }
   }

   public void gxdlvvctam07_kngn_ptn_kbn_data0L2( )
   {
      /* Using cursor H000L2 */
      pr_default.execute(0);
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add("");
      gxdynajaxctrldescr.add("");
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H000L2_A17TAM04_AUTH_CD[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H000L2_A98TAM04_AUTH_NM[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxnrgrid1_newrow( short nRC_Grid1 ,
                                 short nGXsfl_26_idx ,
                                 String sGXsfl_26_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_26_idx ;
      edtTAM07_USER_ID_Internalname = "TAM07_USER_ID_"+sGXsfl_26_idx ;
      edtTAM07_USER_NM_Internalname = "TAM07_USER_NM_"+sGXsfl_26_idx ;
      edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_26_idx ;
      while ( nGXsfl_26_idx <= nRC_Grid1 )
      {
         sendrow_262( ) ;
         nGXsfl_26_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_26_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_26_idx+1)) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
         edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_26_idx ;
         edtTAM07_USER_ID_Internalname = "TAM07_USER_ID_"+sGXsfl_26_idx ;
         edtTAM07_USER_NM_Internalname = "TAM07_USER_NM_"+sGXsfl_26_idx ;
         edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_26_idx ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int Grid1_PageSize26 ,
                                  String AV5cTAM07_KNGN_PTN_KBN ,
                                  String AV6cTAM07_USER_NM )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.disableOutput();
      subGrid1_Rows = (short)(Grid1_PageSize26) ;
      rf0L2( ) ;
      httpContext.enableOutput();
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxgrGrid1_refresh */
   }

   public void refresh( )
   {
      rf0L2( ) ;
      /* End function Refresh */
   }

   public void rf0L2( )
   {
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      wbStart = (short)(26) ;
      nGXsfl_26_idx = (short)(1) ;
      sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_26_idx ;
      edtTAM07_USER_ID_Internalname = "TAM07_USER_ID_"+sGXsfl_26_idx ;
      edtTAM07_USER_NM_Internalname = "TAM07_USER_NM_"+sGXsfl_26_idx ;
      edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_26_idx ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_26_idx ;
         edtTAM07_USER_ID_Internalname = "TAM07_USER_ID_"+sGXsfl_26_idx ;
         edtTAM07_USER_NM_Internalname = "TAM07_USER_NM_"+sGXsfl_26_idx ;
         edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_26_idx ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV5cTAM07_KNGN_PTN_KBN ,
                                              AV6cTAM07_USER_NM ,
                                              A14TAM07_AUTH_CD ,
                                              A2TAM07_USER_NM },
                                              new int[] {
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         lV6cTAM07_USER_NM = GXutil.padr( GXutil.rtrim( AV6cTAM07_USER_NM), 30, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM07_USER_NM", AV6cTAM07_USER_NM);
         /* Using cursor H000L3 */
         pr_default.execute(1, new Object[] {AV5cTAM07_KNGN_PTN_KBN, lV6cTAM07_USER_NM});
         nGXsfl_26_idx = (short)(1) ;
         GRID1_nEOF = (byte)(0) ;
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            A14TAM07_AUTH_CD = H000L3_A14TAM07_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14TAM07_AUTH_CD", A14TAM07_AUTH_CD);
            n14TAM07_AUTH_CD = H000L3_n14TAM07_AUTH_CD[0] ;
            A98TAM04_AUTH_NM = H000L3_A98TAM04_AUTH_NM[0] ;
            n98TAM04_AUTH_NM = H000L3_n98TAM04_AUTH_NM[0] ;
            A2TAM07_USER_NM = H000L3_A2TAM07_USER_NM[0] ;
            n2TAM07_USER_NM = H000L3_n2TAM07_USER_NM[0] ;
            A8TAM07_USER_ID = H000L3_A8TAM07_USER_ID[0] ;
            A98TAM04_AUTH_NM = H000L3_A98TAM04_AUTH_NM[0] ;
            n98TAM04_AUTH_NM = H000L3_n98TAM04_AUTH_NM[0] ;
            /* Execute user event: e120L2 */
            e120L2 ();
            pr_default.readNext(1);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         pr_default.close(1);
         wbEnd = (short)(26) ;
         wb0L0( ) ;
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
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV5cTAM07_KNGN_PTN_KBN ,
                                           AV6cTAM07_USER_NM ,
                                           A14TAM07_AUTH_CD ,
                                           A2TAM07_USER_NM },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV6cTAM07_USER_NM = GXutil.padr( GXutil.rtrim( AV6cTAM07_USER_NM), 30, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM07_USER_NM", AV6cTAM07_USER_NM);
      /* Using cursor H000L4 */
      pr_default.execute(2, new Object[] {AV5cTAM07_KNGN_PTN_KBN, lV6cTAM07_USER_NM});
      GRID1_nRecordCount = H000L4_AGRID1_nRecordCount[0] ;
      pr_default.close(2);
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

   public void strup0L0( )
   {
      /* Before Start, stand alone formulas. */
      AV15Pgmname = "Gx0030" ;
      Gx_err = (short)(0) ;
      gxvvctam07_kngn_ptn_kbn_html0L2( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e110L2 */
      e110L2 ();
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
         nRC_Grid1 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_Grid1"), ".", ",")) ;
         AV8pTAM07_USER_ID = httpContext.cgiGet( "vPTAM07_USER_ID") ;
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
      /* Execute user event: e110L2 */
      e110L2 ();
      if (returnInSub) return;
   }

   public void e110L2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "選択リスト %1", "ユーザーマスタ", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV9C_TAM02_APP_ID = "TAM07" ;
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

   private void e120L2( )
   {
      /* Load Routine */
      AV7LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", "Style2") ;
      if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
      {
         sendrow_262( ) ;
      }
      GRID1_nCurrentRecord = (int)(GRID1_nCurrentRecord+1) ;
   }

   public void GXEnter( )
   {
      /* Execute user event: e130L2 */
      e130L2 ();
      if (returnInSub) return;
   }

   public void e130L2( )
   {
      /* Enter Routine */
      AV8pTAM07_USER_ID = A8TAM07_USER_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8pTAM07_USER_ID", AV8pTAM07_USER_ID);
      httpContext.setWebReturnParms(new Object[] {AV8pTAM07_USER_ID});
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
      gx0030_impl.this.AV11W_ERRCD = GXv_char4[0] ;
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
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_TAM02_APP_ID, GXv_char4, GXv_char5) ;
      gx0030_impl.this.AV12W_KNGN_FLG = GXv_char4[0] ;
      gx0030_impl.this.AV11W_ERRCD = GXv_char5[0] ;
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
      Application.rollback(context, remoteHandle, "DEFAULT", "gx0030");
   }

   public void wb_table1_2_0L2( boolean wbgen )
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
         wb_table2_9_0L2( true) ;
      }
      else
      {
         wb_table2_9_0L2( false) ;
      }
      return  ;
   }

   public void wb_table2_9_0L2e( boolean wbgen )
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
         wb_table3_23_0L2( true) ;
      }
      else
      {
         wb_table3_23_0L2( false) ;
      }
      return  ;
   }

   public void wb_table3_23_0L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0L2e( true) ;
      }
      else
      {
         wb_table1_2_0L2e( false) ;
      }
   }

   public void wb_table3_23_0L2( boolean wbgen )
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
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "ユーザーID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 250, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "氏名") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 300, 4, 0))+"px"+" class=\""+subGrid1_Linesclass+"\" "+" style=\""+((-1==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "権限パターン名") ;
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
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV7LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8TAM07_USER_ID));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2TAM07_USER_NM));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtTAM07_USER_NM_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(httpContext.isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A98TAM04_AUTH_NM));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", "false");
            Grid1Container.AddObjectProperty("Allowcollapsing", ((subGrid1_Allowcollapsing==1) ? "true" : "false"));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(9), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 26 )
      {
         wbEnd = (short)(0) ;
         nRC_Grid1 = (short)(nGXsfl_26_idx-1) ;
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
         wb_table4_33_0L2( true) ;
      }
      else
      {
         wb_table4_33_0L2( false) ;
      }
      return  ;
   }

   public void wb_table4_33_0L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_23_0L2e( true) ;
      }
      else
      {
         wb_table3_23_0L2e( false) ;
      }
   }

   public void wb_table4_33_0L2( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 26, 3, 0)+","+"null"+");", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, 1, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0030.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0L2e( true) ;
      }
      else
      {
         wb_table4_33_0L2e( false) ;
      }
   }

   public void wb_table2_9_0L2( boolean wbgen )
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
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_kngn_ptn_kbn_Internalname, "権限パターン区分", "", "", lblTextblocktam07_kngn_ptn_kbn_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0030.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5cTAM07_KNGN_PTN_KBN", AV5cTAM07_KNGN_PTN_KBN);
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_26_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, dynavCtam07_kngn_ptn_kbn, dynavCtam07_kngn_ptn_kbn.getInternalname(), AV5cTAM07_KNGN_PTN_KBN, 1, dynavCtam07_kngn_ptn_kbn.getJsonclick(), 0, "", "svchar", "", 1, 1, 0, (short)(0), 40, "chr", 0, "", StyleString, ClassString, TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(14);\"", "", true, "HLP_Gx0030.htm");
         dynavCtam07_kngn_ptn_kbn.setValue( AV5cTAM07_KNGN_PTN_KBN );
         httpContext.ajax_rsp_assign_prop("", false, dynavCtam07_kngn_ptn_kbn.getInternalname(), "Values", dynavCtam07_kngn_ptn_kbn.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_user_nm_Internalname, "氏名", "", "", lblTextblocktam07_user_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_Gx0030.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTAM07_USER_NM", AV6cTAM07_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_26_idx + "',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtam07_user_nm_Internalname, GXutil.rtrim( AV6cTAM07_USER_NM), GXutil.rtrim( localUtil.format( AV6cTAM07_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(19);\"", "", "", "", "", edtavCtam07_user_nm_Jsonclick, 0, ClassString, StyleString, "", 1, 1, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_Gx0030.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_9_0L2e( true) ;
      }
      else
      {
         wb_table2_9_0L2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV8pTAM07_USER_ID = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8pTAM07_USER_ID", AV8pTAM07_USER_ID);
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
      pa0L2( ) ;
      ws0L2( ) ;
      we0L2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14574538");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("gx0030.js", "?14574538");
      /* End function include_jscripts */
   }

   public void sendrow_262( )
   {
      wb0L0( ) ;
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
            if ( ((int)(nGXsfl_26_idx) % (2)) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_26_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8TAM07_USER_ID))+"'"+"]);" ;
         ClassString = "Image" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("bitmap", 1, httpContext.isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,AV7LinkSelection,edtavLinkselection_Link,"","","Style2",new Integer(-1),new Integer(1),"","選択",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","''",""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM07_USER_ID_Internalname,GXutil.rtrim( A8TAM07_USER_ID),"","","","","","",edtTAM07_USER_ID_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(100),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(1),new Boolean(true),"left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         edtTAM07_USER_NM_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8TAM07_USER_ID))+"'"+"]);" ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM07_USER_NM_Internalname,GXutil.rtrim( A2TAM07_USER_NM),"","","",edtTAM07_USER_NM_Link,"","選択",edtTAM07_USER_NM_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(250),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(1),new Boolean(true),"left"});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((-1==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ROClassString = ClassString ;
         Grid1Row.AddColumnProperties("edit", 1, httpContext.isAjaxCallMode( ), new Object[] {edtTAM04_AUTH_NM_Internalname,GXutil.rtrim( A98TAM04_AUTH_NM),"","","","","","",edtTAM04_AUTH_NM_Jsonclick,new Integer(0),ClassString,StyleString,ROClassString,new Integer(-1),new Integer(0),new Integer(0),new Integer(300),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(26),new Integer(1),new Integer(1),new Boolean(true),"left"});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_26_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_26_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_26_idx+1)) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_26_idx, 4, 0)), (short)(4), "0") ;
         edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_26_idx ;
         edtTAM07_USER_ID_Internalname = "TAM07_USER_ID_"+sGXsfl_26_idx ;
         edtTAM07_USER_NM_Internalname = "TAM07_USER_NM_"+sGXsfl_26_idx ;
         edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM_"+sGXsfl_26_idx ;
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
      edtTAM07_USER_NM_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "Grid" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List  ユーザーマスタ" );
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
      wcpOAV8pTAM07_USER_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15Pgmname = "" ;
      AV5cTAM07_KNGN_PTN_KBN = "" ;
      AV6cTAM07_USER_NM = "" ;
      AV8pTAM07_USER_ID = "" ;
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
      edtTAM07_USER_ID_Internalname = "" ;
      edtTAM07_USER_NM_Internalname = "" ;
      edtTAM04_AUTH_NM_Internalname = "" ;
      AV7LinkSelection = "" ;
      A8TAM07_USER_ID = "" ;
      A2TAM07_USER_NM = "" ;
      A98TAM04_AUTH_NM = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H000L2_A17TAM04_AUTH_CD = new String[] {""} ;
      H000L2_A98TAM04_AUTH_NM = new String[] {""} ;
      H000L2_n98TAM04_AUTH_NM = new boolean[] {false} ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      lV6cTAM07_USER_NM = "" ;
      A14TAM07_AUTH_CD = "" ;
      H000L3_A14TAM07_AUTH_CD = new String[] {""} ;
      H000L3_n14TAM07_AUTH_CD = new boolean[] {false} ;
      H000L3_A98TAM04_AUTH_NM = new String[] {""} ;
      H000L3_n98TAM04_AUTH_NM = new boolean[] {false} ;
      H000L3_A2TAM07_USER_NM = new String[] {""} ;
      H000L3_n2TAM07_USER_NM = new boolean[] {false} ;
      H000L3_A8TAM07_USER_ID = new String[] {""} ;
      H000L4_AGRID1_nRecordCount = new int[1] ;
      AV9C_TAM02_APP_ID = "" ;
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
      GXt_char6 = "" ;
      TempTags = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      lblTextblocktam07_kngn_ptn_kbn_Jsonclick = "" ;
      lblTextblocktam07_user_nm_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GXt_char7 = "" ;
      ROClassString = "" ;
      GXt_char8 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new gx0030__default(),
         new Object[] {
             new Object[] {
            H000L2_A17TAM04_AUTH_CD, H000L2_A98TAM04_AUTH_NM, H000L2_n98TAM04_AUTH_NM
            }
            , new Object[] {
            H000L3_A14TAM07_AUTH_CD, H000L3_n14TAM07_AUTH_CD, H000L3_A98TAM04_AUTH_NM, H000L3_n98TAM04_AUTH_NM, H000L3_A2TAM07_USER_NM, H000L3_n2TAM07_USER_NM, H000L3_A8TAM07_USER_ID
            }
            , new Object[] {
            H000L4_AGRID1_nRecordCount
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV15Pgmname = "Gx0030" ;
      /* GeneXus formulas. */
      AV15Pgmname = "Gx0030" ;
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
   private short nGXsfl_26_idx=1 ;
   private short Gx_err ;
   private short wbEnd ;
   private short wbStart ;
   private short subGrid1_Rows ;
   private int Grid1_PageSize26 ;
   private int GRID1_nFirstRecordOnPage ;
   private int gxdynajaxindex ;
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
   private String sGXsfl_26_idx="0001" ;
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
   private String edtTAM07_USER_ID_Internalname ;
   private String edtTAM07_USER_NM_Internalname ;
   private String edtTAM04_AUTH_NM_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String edtavCtam07_user_nm_Internalname ;
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
   private String edtTAM07_USER_NM_Link ;
   private String GXt_char6 ;
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
   private String GXt_char7 ;
   private String ROClassString ;
   private String edtTAM07_USER_ID_Jsonclick ;
   private String edtTAM07_USER_NM_Jsonclick ;
   private String edtTAM04_AUTH_NM_Jsonclick ;
   private String GXt_char8 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n2TAM07_USER_NM ;
   private boolean n98TAM04_AUTH_NM ;
   private boolean n14TAM07_AUTH_CD ;
   private boolean returnInSub ;
   private String wcpOAV8pTAM07_USER_ID ;
   private String AV5cTAM07_KNGN_PTN_KBN ;
   private String AV6cTAM07_USER_NM ;
   private String AV8pTAM07_USER_ID ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String A98TAM04_AUTH_NM ;
   private String lV6cTAM07_USER_NM ;
   private String A14TAM07_AUTH_CD ;
   private String AV9C_TAM02_APP_ID ;
   private String AV11W_ERRCD ;
   private String AV12W_KNGN_FLG ;
   private String AV7LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXMasterPage MasterPageObj ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice dynavCtam07_kngn_ptn_kbn ;
   private IDataStoreProvider pr_default ;
   private String[] H000L2_A17TAM04_AUTH_CD ;
   private String[] H000L2_A98TAM04_AUTH_NM ;
   private boolean[] H000L2_n98TAM04_AUTH_NM ;
   private String[] H000L3_A14TAM07_AUTH_CD ;
   private boolean[] H000L3_n14TAM07_AUTH_CD ;
   private String[] H000L3_A98TAM04_AUTH_NM ;
   private boolean[] H000L3_n98TAM04_AUTH_NM ;
   private String[] H000L3_A2TAM07_USER_NM ;
   private boolean[] H000L3_n2TAM07_USER_NM ;
   private String[] H000L3_A8TAM07_USER_ID ;
   private int[] H000L4_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class gx0030__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000L3( com.genexus.internet.HttpContext httpContext ,
                                          String AV5cTAM07_KNGN_PTN_KBN ,
                                          String AV6cTAM07_USER_NM ,
                                          String A14TAM07_AUTH_CD ,
                                          String A2TAM07_USER_NM )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int9 ;
      GXv_int9 = new byte [2] ;
      Object[] GXv_Object10 ;
      GXv_Object10 = new Object [2] ;
      scmdbuf = "SELECT T1.`TAM07_AUTH_CD` AS TAM07_AUTH_CD, T2.`TAM04_AUTH_NM`, T1.`TAM07_USER_NM`," ;
      scmdbuf = scmdbuf + " T1.`TAM07_USER_ID` FROM (`TAM07_USER` T1 LEFT JOIN `TAM04_KNGN` T2 ON T2.`TAM04_AUTH_CD`" ;
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
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV6cTAM07_USER_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.`TAM07_USER_NM` like CONCAT('%', CONCAT(?, '%')))" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.`TAM07_USER_NM` like CONCAT('%', CONCAT(?, '%')))" ;
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
      scmdbuf = scmdbuf + " ORDER BY T1.`TAM07_USER_ID`" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H000L4( com.genexus.internet.HttpContext httpContext ,
                                          String AV5cTAM07_KNGN_PTN_KBN ,
                                          String AV6cTAM07_USER_NM ,
                                          String A14TAM07_AUTH_CD ,
                                          String A2TAM07_USER_NM )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int11 ;
      GXv_int11 = new byte [2] ;
      Object[] GXv_Object12 ;
      GXv_Object12 = new Object [2] ;
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
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV6cTAM07_USER_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.`TAM07_USER_NM` like CONCAT('%', CONCAT(?, '%')))" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.`TAM07_USER_NM` like CONCAT('%', CONCAT(?, '%')))" ;
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
            case 1 :
                  return conditional_H000L3(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
            case 2 :
                  return conditional_H000L4(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000L2", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H000L3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H000L4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               break;
            case 2 :
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
            case 1 :
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
               break;
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
               break;
      }
   }

}

