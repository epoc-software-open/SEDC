/*
               File: webpanel1_impl
        Description: Web Panel1
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:51.82
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webpanel1_impl extends GXWebPanel
{
   public webpanel1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webpanel1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webpanel1_impl.class ));
   }

   public webpanel1_impl( int remoteHandle ,
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
            nRC_GXsfl_42 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_42_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_42_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_42, nGXsfl_42_idx, sGXsfl_42_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
         {
            nRC_GXsfl_33 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_33_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_33_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid3_newrow( nRC_GXsfl_33, nGXsfl_33_idx, sGXsfl_33_idx) ;
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
         pa2C2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws2C2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we2C2( ) ;
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
      httpContext.writeValue( "Web Panel1") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317205184");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("webpanel1") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm2C2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "B716_sd3_data_grp", AV5B716_SD3_DATA_GRP);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("B716_sd3_data_grp", AV5B716_SD3_DATA_GRP);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_33", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_33, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
      httpContext.SendAjaxEncryptionKey();
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      httpContext.writeTextNL( "</form>") ;
      include_jscripts( ) ;
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
   }

   public String getPgmname( )
   {
      return "WebPanel1" ;
   }

   public String getPgmdesc( )
   {
      return "Web Panel1" ;
   }

   public void wb2C0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         wb_table1_2_2C2( true) ;
      }
      else
      {
         wb_table1_2_2C2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_2C2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start2C2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "Web Panel1", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2C0( ) ;
   }

   public void ws2C2( )
   {
      start2C2( ) ;
      evt2C2( ) ;
   }

   public void evt2C2( )
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
                     else if ( GXutil.strcmp(sEvt, "'TEST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e112C2 */
                        e112C2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID3.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) )
                     {
                        nGXsfl_33_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_33_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_33_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_332( ) ;
                        AV11GXV1 = nGXsfl_33_idx ;
                        if ( ( AV5B716_SD3_DATA_GRP.size() >= AV11GXV1 ) && ( AV11GXV1 > 0 ) )
                        {
                           AV5B716_SD3_DATA_GRP.currentItem( ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)) );
                           ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtlvisit_no1_Internalname), ".", ",")) );
                           ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid( httpContext.cgiGet( edtavCtldom_itm_grp_oid1_Internalname) );
                           ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtldom_itm_grp_rowno1_Internalname), ".", ",")) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID3.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e122C2 */
                              e122C2 ();
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
                           sEvtType = GXutil.right( sEvt, 4) ;
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                           if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 )
                           {
                              nGXsfl_42_idx = (short)(GXutil.lval( sEvtType)) ;
                              sGXsfl_42_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_42_idx, 4, 0)), (short)(4), "0") + sGXsfl_33_idx ;
                              subsflControlProps_423( ) ;
                              AV15GXV5 = nGXsfl_42_idx ;
                              if ( ( ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().size() >= AV15GXV5 ) && ( AV15GXV5 > 0 ) )
                              {
                                 ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().currentItem( ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)) );
                                 ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)).setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm( httpContext.cgiGet( edtavCtldom_var_nm_Internalname) );
                                 ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)).setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd( httpContext.cgiGet( edtavCtlcrf_item_grp_cd_Internalname) );
                              }
                              sEvtType = GXutil.right( sEvt, 1) ;
                              if ( GXutil.strcmp(sEvtType, ".") == 0 )
                              {
                                 sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                                 if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    dynload_actions( ) ;
                                    /* Execute user event: e132C3 */
                                    e132C3 ();
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
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we2C2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2C2( ) ;
         }
      }
   }

   public void pa2C2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid3_newrow( short nRC_GXsfl_33 ,
                                 short nGXsfl_33_idx ,
                                 String sGXsfl_33_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_332( ) ;
      while ( nGXsfl_33_idx <= nRC_GXsfl_33 )
      {
         sendrow_332( ) ;
         nGXsfl_33_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_33_idx+1)) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_33_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      httpContext.GX_webresponse.addString(Grid3Container.ToJavascriptSource());
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_42 ,
                                 short nGXsfl_42_idx ,
                                 String sGXsfl_42_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_423( ) ;
      while ( nGXsfl_42_idx <= nRC_GXsfl_42 )
      {
         sendrow_423( ) ;
         nGXsfl_42_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_42_idx+1)) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_42_idx, 4, 0)), (short)(4), "0") + sGXsfl_33_idx ;
         subsflControlProps_423( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf2C2( ) ;
      /* End function Refresh */
   }

   public void rf2C2( )
   {
      Grid3Container.AddObjectProperty("GridName", "Grid3");
      Grid3Container.AddObjectProperty("CmpContext", "");
      Grid3Container.AddObjectProperty("InMasterPage", "false");
      Grid3Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1"));
      Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid3Container.AddObjectProperty("Class", "FreeStyleGridTM-1");
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid3_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(33) ;
      nGXsfl_33_idx = (short)(1) ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_33_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_332( ) ;
      nGXsfl_33_Refreshing = (short)(1) ;
      Grid3Container.setPageSize( subgrid3_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_332( ) ;
         /* Execute user event: e122C2 */
         e122C2 ();
         wbEnd = (short)(33) ;
         wb2C0( ) ;
      }
      nGXsfl_33_Refreshing = (short)(0) ;
   }

   public void rf2C3( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(42) ;
      nGXsfl_42_idx = (short)(1) ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_42_idx, 4, 0)), (short)(4), "0") + sGXsfl_33_idx ;
      subsflControlProps_423( ) ;
      nGXsfl_42_Refreshing = (short)(1) ;
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_423( ) ;
         /* Execute user event: e132C3 */
         e132C3 ();
         wbEnd = (short)(42) ;
         wb2C0( ) ;
      }
      nGXsfl_42_Refreshing = (short)(0) ;
   }

   public int subgrid3_pagecount( )
   {
      return -1 ;
   }

   public int subgrid3_recordcount( )
   {
      return -1 ;
   }

   public int subgrid3_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid3_currentpage( )
   {
      return -1 ;
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

   public void strup2C0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavW_seq_pos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavW_seq_pos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavW_seq_pos_Enabled, 5, 0)));
      edtavCtlvisit_no1_Enabled = 0 ;
      edtavCtldom_itm_grp_oid1_Enabled = 0 ;
      edtavCtldom_itm_grp_rowno1_Enabled = 0 ;
      edtavCtldom_var_nm_Enabled = 0 ;
      edtavCtlcrf_item_grp_cd_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "B716_sd3_data_grp"), AV5B716_SD3_DATA_GRP);
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_study_id_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_study_id_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_STUDY_ID");
            GX_FocusControl = edtavD_study_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7D_STUDY_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_STUDY_ID", GXutil.ltrim( GXutil.str( AV7D_STUDY_ID, 10, 0)));
         }
         else
         {
            AV7D_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtavD_study_id_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_STUDY_ID", GXutil.ltrim( GXutil.str( AV7D_STUDY_ID, 10, 0)));
         }
         AV6D_DOM_CD = httpContext.cgiGet( edtavD_dom_cd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6D_DOM_CD", AV6D_DOM_CD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavW_seq_pos_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavW_seq_pos_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vW_SEQ_POS");
            GX_FocusControl = edtavW_seq_pos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8W_SEQ_POS = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8W_SEQ_POS", GXutil.ltrim( GXutil.str( AV8W_SEQ_POS, 4, 0)));
         }
         else
         {
            AV8W_SEQ_POS = (short)(localUtil.ctol( httpContext.cgiGet( edtavW_seq_pos_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8W_SEQ_POS", GXutil.ltrim( GXutil.str( AV8W_SEQ_POS, 4, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_33 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_33"), ".", ",")) ;
         nRC_GXsfl_33 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_33"), ".", ",")) ;
         nGXsfl_33_fel_idx = (short)(0) ;
         while ( nGXsfl_33_fel_idx < nRC_GXsfl_33 )
         {
            nGXsfl_33_fel_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_33_fel_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_33_fel_idx+1)) ;
            sGXsfl_33_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_33_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_332( ) ;
            AV11GXV1 = nGXsfl_33_fel_idx ;
            AV11GXV1 = nGXsfl_33_fel_idx ;
            if ( ( AV5B716_SD3_DATA_GRP.size() >= AV11GXV1 ) && ( AV11GXV1 > 0 ) )
            {
               AV5B716_SD3_DATA_GRP.currentItem( ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)) );
               ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no( (int)(localUtil.ctol( httpContext.cgiGet( edtavCtlvisit_no1_Internalname), ".", ",")) );
               ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid( httpContext.cgiGet( edtavCtldom_itm_grp_oid1_Internalname) );
               ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).setgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtldom_itm_grp_rowno1_Internalname), ".", ",")) );
            }
            AV5B716_SD3_DATA_GRP.currentItem( ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)) );
            GXCCtl = "nRC_GXsfl_42_" + sGXsfl_33_fel_idx ;
            nRC_GXsfl_42 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",")) ;
            nGXsfl_42_fel_idx = (short)(0) ;
            while ( nGXsfl_42_fel_idx < nRC_GXsfl_42 )
            {
               nGXsfl_42_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_42_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_42_fel_idx+1)) ;
               sGXsfl_42_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_42_fel_idx, 4, 0)), (short)(4), "0") + sGXsfl_33_fel_idx ;
               subsflControlProps_fel_423( ) ;
               AV15GXV5 = nGXsfl_42_fel_idx ;
               AV15GXV5 = nGXsfl_42_fel_idx ;
               if ( ( ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().size() >= AV15GXV5 ) && ( AV15GXV5 > 0 ) )
               {
                  ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().currentItem( ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)) );
                  ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)).setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm( httpContext.cgiGet( edtavCtldom_var_nm_Internalname) );
                  ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)).setgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd( httpContext.cgiGet( edtavCtlcrf_item_grp_cd_Internalname) );
               }
               ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().currentItem( ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)) );
            }
            if ( nGXsfl_42_fel_idx == 0 )
            {
               nGXsfl_42_idx = (short)(1) ;
               sGXsfl_42_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_42_idx, 4, 0)), (short)(4), "0") + sGXsfl_33_idx ;
               subsflControlProps_423( ) ;
            }
            nGXsfl_42_fel_idx = (short)(1) ;
         }
         if ( nGXsfl_33_fel_idx == 0 )
         {
            nGXsfl_33_idx = (short)(1) ;
            sGXsfl_33_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_33_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_332( ) ;
         }
         nGXsfl_33_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   public void e112C2( )
   {
      /* 'TEST' Routine */
      GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem1[0] = AV5B716_SD3_DATA_GRP ;
      GXv_int2[0] = AV8W_SEQ_POS ;
      new b716_pc02_dom_map_get(remoteHandle, context).execute( AV7D_STUDY_ID, AV6D_DOM_CD, GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem1, GXv_int2) ;
      AV5B716_SD3_DATA_GRP = GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem1[0] ;
      webpanel1_impl.this.AV8W_SEQ_POS = GXv_int2[0] ;
      gx_BV33 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_STUDY_ID", GXutil.ltrim( GXutil.str( AV7D_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV6D_DOM_CD", AV6D_DOM_CD);
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_SEQ_POS", GXutil.ltrim( GXutil.str( AV8W_SEQ_POS, 4, 0)));
   }

   private void e122C2( )
   {
      /* Grid3_Load Routine */
      AV11GXV1 = (short)(1) ;
      while ( AV11GXV1 <= AV5B716_SD3_DATA_GRP.size() )
      {
         AV5B716_SD3_DATA_GRP.currentItem( ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5B716_SD3_DATA_GRP", AV5B716_SD3_DATA_GRP);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(33) ;
         }
         sendrow_332( ) ;
         AV11GXV1 = (short)(AV11GXV1+1) ;
      }
   }

   private void e132C3( )
   {
      /* Grid1_Load Routine */
      AV15GXV5 = (short)(1) ;
      while ( AV15GXV5 <= ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().size() )
      {
         ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().currentItem( ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(42) ;
         }
         sendrow_423( ) ;
         AV15GXV5 = (short)(AV15GXV5+1) ;
      }
   }

   public void wb_table1_2_2C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 10000, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "D_STUDY_ID", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'" + sGXsfl_33_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_study_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV7D_STUDY_ID, (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7D_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(7);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_study_id_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "D_DOM_CD", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'" + sGXsfl_33_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_dom_cd_Internalname, GXutil.rtrim( AV6D_DOM_CD), GXutil.rtrim( localUtil.format( AV6D_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(12);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_dom_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 33, 2, 0)+","+"null"+");", "TEST", bttButton1_Jsonclick, 5, "TEST", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'TEST\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "W_SEQ_POS", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_33_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavW_seq_pos_Internalname, GXutil.ltrim( localUtil.ntoc( AV8W_SEQ_POS, (byte)(4), (byte)(0), ".", "")), ((edtavW_seq_pos_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8W_SEQ_POS), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8W_SEQ_POS), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(21);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavW_seq_pos_Jsonclick, 0, "Attribute", "", "", "", 1, edtavW_seq_pos_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_25_2C2( true) ;
      }
      else
      {
         wb_table2_25_2C2( false) ;
      }
      return  ;
   }

   public void wb_table2_25_2C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /*  Grid Control  */
         Grid3Container.SetIsFreestyle(true);
         Grid3Container.SetWrapped(nGXWrapped);
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid3Container"+"DivS\" gxgridid=\"33\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid3_Internalname, subGrid3_Internalname, "", "FreeStyleGridTM-1", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid3Container.AddObjectProperty("GridName", "Grid3");
         }
         else
         {
            Grid3Container.AddObjectProperty("GridName", "Grid3");
            Grid3Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1"));
            Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid3Container.AddObjectProperty("Class", "FreeStyleGridTM-1");
            Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid3_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("CmpContext", "");
            Grid3Container.AddObjectProperty("InMasterPage", "false");
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlvisit_no1_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtldom_itm_grp_oid1_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtldom_itm_grp_rowno1_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid3Container.AddColumnProperties(Grid3Column);
            Grid3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 33 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_33 = (short)(nGXsfl_33_idx-1) ;
         if ( Grid3Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV11GXV1 = nGXsfl_33_idx ;
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid3Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid3", Grid3Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData", Grid3Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"V", Grid3Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid3ContainerData"+"V"+"\" value='"+Grid3Container.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_2C2e( true) ;
      }
      else
      {
         wb_table1_2_2C2e( false) ;
      }
   }

   public void wb_table2_25_2C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "VISIT_NO", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "GRP_OID", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, "GRP_ROWNO", "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_WebPanel1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_25_2C2e( true) ;
      }
      else
      {
         wb_table2_25_2C2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
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
      pa2C2( ) ;
      ws2C2( ) ;
      we2C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317205259");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("webpanel1.js", "?20177317205259");
      /* End function include_jscripts */
   }

   public void subsflControlProps_423( )
   {
      edtavCtldom_var_nm_Internalname = "CTLDOM_VAR_NM_"+sGXsfl_42_idx ;
      edtavCtlcrf_item_grp_cd_Internalname = "CTLCRF_ITEM_GRP_CD_"+sGXsfl_42_idx ;
   }

   public void subsflControlProps_fel_423( )
   {
      edtavCtldom_var_nm_Internalname = "CTLDOM_VAR_NM_"+sGXsfl_42_fel_idx ;
      edtavCtlcrf_item_grp_cd_Internalname = "CTLCRF_ITEM_GRP_CD_"+sGXsfl_42_fel_idx ;
   }

   public void sendrow_423( )
   {
      subsflControlProps_423( ) ;
      wb2C0( ) ;
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
         if ( ((int)(((nGXsfl_42_idx-1)/ (double) (200)) % (2))) == 0 )
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
         if ( ( 200 == 0 ) && ( nGXsfl_42_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_42_idx+"\">") ;
         }
         if ( 200 > 0 )
         {
            if ( ( 200 == 1 ) || ( ((int)((nGXsfl_42_idx) % (200))) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_42_idx+"\">") ;
            }
         }
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtldom_var_nm_Internalname,GXutil.rtrim( ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)).getgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Dom_var_nm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtldom_var_nm_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtldom_var_nm_Enabled),new Integer(0),"text","",new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(42),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("row");
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcrf_item_grp_cd_Internalname,GXutil.rtrim( ((SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem)((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_var().elementAt(-1+AV15GXV5)).getgxTv_SdtB716_SD3_DOM_VAR_B716_SD3_DOM_VARItem_Crf_item_grp_cd()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcrf_item_grp_cd_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtlcrf_item_grp_cd_Enabled),new Integer(0),"text","",new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(42),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
         if ( 200 > 0 )
         {
            if ( ((int)((nGXsfl_42_idx) % (200))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_42_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_42_idx+1)) ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_42_idx, 4, 0)), (short)(4), "0") + sGXsfl_33_idx ;
      subsflControlProps_423( ) ;
      /* End function sendrow_423 */
   }

   public void subsflControlProps_332( )
   {
      edtavCtlvisit_no1_Internalname = "CTLVISIT_NO1_"+sGXsfl_33_idx ;
      edtavCtldom_itm_grp_oid1_Internalname = "CTLDOM_ITM_GRP_OID1_"+sGXsfl_33_idx ;
      edtavCtldom_itm_grp_rowno1_Internalname = "CTLDOM_ITM_GRP_ROWNO1_"+sGXsfl_33_idx ;
      subGrid1_Internalname = "GRID1_"+sGXsfl_33_idx ;
   }

   public void subsflControlProps_fel_332( )
   {
      edtavCtlvisit_no1_Internalname = "CTLVISIT_NO1_"+sGXsfl_33_fel_idx ;
      edtavCtldom_itm_grp_oid1_Internalname = "CTLDOM_ITM_GRP_OID1_"+sGXsfl_33_fel_idx ;
      edtavCtldom_itm_grp_rowno1_Internalname = "CTLDOM_ITM_GRP_ROWNO1_"+sGXsfl_33_fel_idx ;
      subGrid1_Internalname = "GRID1_"+sGXsfl_33_fel_idx ;
   }

   public void sendrow_332( )
   {
      subsflControlProps_332( ) ;
      wb2C0( ) ;
      Grid3Row = GXWebRow.GetNew(context,Grid3Container) ;
      if ( subGrid3_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         subGrid3_Backcolor = subGrid3_Allbackcolor ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Uniform" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
         subGrid3_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid3_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( ((int)(((nGXsfl_33_idx-1)/ (double) (1)) % (2))) == 0 )
         {
            subGrid3_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
         }
         else
         {
            subGrid3_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Even" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid3Container.GetWrapped() == 1 )
      {
         if ( ( 1 == 0 ) && ( nGXsfl_33_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid3_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_33_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)((nGXsfl_33_idx) % (1))) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid3_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_33_idx+"\">") ;
            }
         }
      }
      Grid3Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid3_Linesclass,""});
      Grid3Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlvisit_no1_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no(), (byte)(6), (byte)(0), ".", "")),((edtavCtlvisit_no1_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no()), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Visit_no()), "ZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlvisit_no1_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtlvisit_no1_Enabled),new Integer(0),"text","",new Integer(6),"chr",new Integer(1),"row",new Integer(6),new Integer(0),new Integer(0),new Integer(33),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      Grid3Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtldom_itm_grp_oid1_Internalname,GXutil.rtrim( ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_oid()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtldom_itm_grp_oid1_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtldom_itm_grp_oid1_Enabled),new Integer(0),"text","",new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(33),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      Grid3Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtldom_itm_grp_rowno1_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno(), (byte)(4), (byte)(0), ".", "")),((edtavCtldom_itm_grp_rowno1_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem)AV5B716_SD3_DATA_GRP.elementAt(-1+AV11GXV1)).getgxTv_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem_Dom_itm_grp_rowno()), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtldom_itm_grp_rowno1_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtldom_itm_grp_rowno1_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(33),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      Grid3Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
      /*  Child Grid Control  */
      Grid3Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid1Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid1Container.Clear();
      }
      Grid1Container.SetIsFreestyle(true);
      Grid1Container.SetWrapped(nGXWrapped);
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"42\">") ;
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "none", 0);
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
         Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtldom_var_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcrf_item_grp_cd_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
      rf2C3( ) ;
      nRC_GXsfl_42 = (short)(nGXsfl_42_idx-1) ;
      GXCCtl = "nRC_GXsfl_42_" + sGXsfl_33_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_42, (byte)(4), (byte)(0), ".", "")));
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "</table>") ;
      }
      else
      {
         if ( ! isAjaxCallMode( ) )
         {
            GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"_"+sGXsfl_33_idx, Grid1Container.ToJavascriptSource());
         }
         if ( isAjaxCallMode( ) )
         {
            Grid3Row.AddGrid("Grid1", Grid1Container);
         }
         if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
         {
            GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V_"+sGXsfl_33_idx, Grid1Container.GridValuesHidden());
         }
         else
         {
            httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V_"+sGXsfl_33_idx+"\" value='"+Grid1Container.GridValuesHidden()+"'>") ;
         }
      }
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("cell");
      }
      if ( Grid3Container.GetWrapped() == 1 )
      {
         Grid3Container.CloseTag("row");
      }
      /* End of Columns property logic. */
      if ( Grid3Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_33_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid3Container.AddRow(Grid3Row);
      nGXsfl_33_idx = (short)(((subGrid3_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid3_recordsperpage( )) ? 1 : nGXsfl_33_idx+1)) ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_33_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_332( ) ;
      /* End function sendrow_332 */
   }

   public void init_default_properties( )
   {
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavD_study_id_Internalname = "vD_STUDY_ID" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavD_dom_cd_Internalname = "vD_DOM_CD" ;
      bttButton1_Internalname = "BUTTON1" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtavW_seq_pos_Internalname = "vW_SEQ_POS" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1_"+sGXsfl_33_idx ;
      subGrid3_Internalname = "GRID3" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavCtldom_itm_grp_rowno1_Jsonclick = "" ;
      edtavCtldom_itm_grp_oid1_Jsonclick = "" ;
      edtavCtlvisit_no1_Jsonclick = "" ;
      subGrid3_Class = "FreeStyleGridTM-1" ;
      edtavCtlcrf_item_grp_cd_Jsonclick = "" ;
      edtavCtlcrf_item_grp_cd_Enabled = 0 ;
      edtavCtldom_var_nm_Jsonclick = "" ;
      edtavCtldom_var_nm_Enabled = 0 ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid3_Allowcollapsing = (byte)(0) ;
      edtavCtldom_itm_grp_rowno1_Enabled = 0 ;
      edtavCtldom_itm_grp_oid1_Enabled = 0 ;
      edtavCtlvisit_no1_Enabled = 0 ;
      edtavW_seq_pos_Jsonclick = "" ;
      edtavW_seq_pos_Enabled = 1 ;
      edtavD_dom_cd_Jsonclick = "" ;
      edtavD_study_id_Jsonclick = "" ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      subGrid3_Borderwidth = (short)(0) ;
      subGrid3_Backcolorstyle = (byte)(0) ;
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV5B716_SD3_DATA_GRP = new GxObjectCollection(SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem.class, "B716_SD2_DOM_MAP.B716_SD2_DOM_MAPItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      edtavCtlvisit_no1_Internalname = "" ;
      edtavCtldom_itm_grp_oid1_Internalname = "" ;
      edtavCtldom_itm_grp_rowno1_Internalname = "" ;
      edtavCtldom_var_nm_Internalname = "" ;
      edtavCtlcrf_item_grp_cd_Internalname = "" ;
      GXKey = "" ;
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV6D_DOM_CD = "" ;
      GXCCtl = "" ;
      GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem1 = new GxObjectCollection [1] ;
      GXv_int2 = new short [1] ;
      sStyleString = "" ;
      lblTextblock2_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock1_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttButton1_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      subGrid3_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavW_seq_pos_Enabled = 0 ;
      edtavCtlvisit_no1_Enabled = 0 ;
      edtavCtldom_itm_grp_oid1_Enabled = 0 ;
      edtavCtldom_itm_grp_rowno1_Enabled = 0 ;
      edtavCtldom_var_nm_Enabled = 0 ;
      edtavCtlcrf_item_grp_cd_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid3_Allowselection ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GRID3_nEOF ;
   private byte GRID1_nEOF ;
   private short nRC_GXsfl_42 ;
   private short nGXsfl_42_idx=1 ;
   private short nRC_GXsfl_33 ;
   private short nGXsfl_33_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV11GXV1 ;
   private short AV15GXV5 ;
   private short subGrid3_Borderwidth ;
   private short nGXsfl_33_Refreshing=0 ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_42_Refreshing=0 ;
   private short Gx_err ;
   private short AV8W_SEQ_POS ;
   private short nGXsfl_33_fel_idx=1 ;
   private short nGXsfl_42_fel_idx=1 ;
   private short GXv_int2[] ;
   private int subGrid3_Islastpage ;
   private int subGrid1_Islastpage ;
   private int edtavW_seq_pos_Enabled ;
   private int edtavCtlvisit_no1_Enabled ;
   private int edtavCtldom_itm_grp_oid1_Enabled ;
   private int edtavCtldom_itm_grp_rowno1_Enabled ;
   private int edtavCtldom_var_nm_Enabled ;
   private int edtavCtlcrf_item_grp_cd_Enabled ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long AV7D_STUDY_ID ;
   private long GRID3_nFirstRecordOnPage ;
   private long GRID1_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_42_idx="0001" ;
   private String sGXsfl_33_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCtlvisit_no1_Internalname ;
   private String edtavCtldom_itm_grp_oid1_Internalname ;
   private String edtavCtldom_itm_grp_rowno1_Internalname ;
   private String edtavCtldom_var_nm_Internalname ;
   private String edtavCtlcrf_item_grp_cd_Internalname ;
   private String GXKey ;
   private String edtavW_seq_pos_Internalname ;
   private String edtavD_study_id_Internalname ;
   private String edtavD_dom_cd_Internalname ;
   private String sGXsfl_33_fel_idx="0001" ;
   private String GXCCtl ;
   private String sGXsfl_42_fel_idx="0001" ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String TempTags ;
   private String edtavD_study_id_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavD_dom_cd_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtavW_seq_pos_Jsonclick ;
   private String subGrid3_Internalname ;
   private String tblTable2_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavCtldom_var_nm_Jsonclick ;
   private String edtavCtlcrf_item_grp_cd_Jsonclick ;
   private String subGrid1_Internalname ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String edtavCtlvisit_no1_Jsonclick ;
   private String edtavCtldom_itm_grp_oid1_Jsonclick ;
   private String edtavCtldom_itm_grp_rowno1_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gx_BV33 ;
   private String AV6D_DOM_CD ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GxObjectCollection AV5B716_SD3_DATA_GRP ;
   private GxObjectCollection GXv_objcol_SdtB716_SD2_DOM_MAP_B716_SD2_DOM_MAPItem1[] ;
}

