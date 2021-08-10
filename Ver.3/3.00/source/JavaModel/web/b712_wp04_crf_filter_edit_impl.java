/*
               File: b712_wp04_crf_filter_edit_impl
        Description: CRFフィルタ編集（入力）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:21.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b712_wp04_crf_filter_edit_impl extends GXWebPanel
{
   public b712_wp04_crf_filter_edit_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b712_wp04_crf_filter_edit_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b712_wp04_crf_filter_edit_impl.class ));
   }

   public b712_wp04_crf_filter_edit_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavD_grd_f_sel = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_75 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_75_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_75_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_75, nGXsfl_75_idx, sGXsfl_75_idx) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_100 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_100_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_100_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( nRC_GXsfl_100, nGXsfl_100_idx, sGXsfl_100_idx) ;
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
            AV18P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV31P_FILTER_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31P_FILTER_NO", GXutil.ltrim( GXutil.str( AV31P_FILTER_NO, 4, 0)));
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
         pa2H2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws2H2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we2H2( ) ;
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
      httpContext.writeValue( "CRFフィルタ編集（入力）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513312156");
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
      GXEncryptionTmp = "b712_wp04_crf_filter_edit"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV31P_FILTER_NO,4,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b712_wp04_crf_filter_edit") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm2H2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sd_c712_sd10_c", AV32SD_C712_SD10_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sd_c712_sd10_c", AV32SD_C712_SD10_C);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_75, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_100, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV18P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV40Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vP_FILTER_NO", GXutil.ltrim( localUtil.ntoc( AV31P_FILTER_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A977TBM45_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_FILTER_NO", GXutil.ltrim( localUtil.ntoc( A978TBM45_FILTER_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_DEL_FLG", GXutil.rtrim( A982TBM45_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_FILETR_NM", GXutil.rtrim( A980TBM45_FILETR_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM45_IN_CRF_ID", GXutil.rtrim( A981TBM45_IN_CRF_ID));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV21W_A821_JS));
      GxWebStd.gx_hidden_field( httpContext, "TBM31_CRF_NM", GXutil.rtrim( A393TBM31_CRF_NM));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_C712_SD10_C", AV32SD_C712_SD10_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_C712_SD10_C", AV32SD_C712_SD10_C);
      }
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
      return "B712_WP04_CRF_FILTER_EDIT" ;
   }

   public String getPgmdesc( )
   {
      return "CRFフィルタ編集（入力）" ;
   }

   public void wb2H0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_2H2( true) ;
      }
      else
      {
         wb_table1_2_2H2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_88_2H2( true) ;
      }
      else
      {
         wb_table2_88_2H2( false) ;
      }
      return  ;
   }

   public void wb_table2_88_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start2H2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "CRFフィルタ編集（入力）", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2H0( ) ;
   }

   public void ws2H2( )
   {
      start2H2( ) ;
      evt2H2( ) ;
   }

   public void evt2H2( )
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
                        /* Execute user event: e112H2 */
                        e112H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e122H2 */
                        e122H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DEL'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e132H2 */
                        e132H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DEL_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e142H2 */
                        e142H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e152H2 */
                        e152H2 ();
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
                     if ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 )
                     {
                        nGXsfl_100_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1004( ) ;
                        AV37GXV1 = nGXsfl_100_idx ;
                        if ( ( AV32SD_C712_SD10_C.size() >= AV37GXV1 ) && ( AV37GXV1 > 0 ) )
                        {
                           AV32SD_C712_SD10_C.currentItem( ((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV32SD_C712_SD10_C.elementAt(-1+AV37GXV1)) );
                           ((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV32SD_C712_SD10_C.elementAt(-1+AV37GXV1)).setgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlcrfid_Internalname), ".", ",")) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e162H4 */
                              e162H4 ();
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
                     else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                     {
                        nGXsfl_75_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_752( ) ;
                        if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavD_grd_f_sel.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavD_grd_f_sel.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_F_SEL");
                           GX_FocusControl = chkavD_grd_f_sel.getInternalname() ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV28D_GRD_F_SEL = (byte)(0) ;
                        }
                        else
                        {
                           AV28D_GRD_F_SEL = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavD_grd_f_sel.getInternalname()), "1")==0) ? 1 : 0)) ;
                        }
                        AV29D_GRD_CRF_SNM = httpContext.cgiGet( edtavD_grd_crf_snm_Internalname) ;
                        A69TBM31_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",")) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e172H2 */
                              e172H2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e182H2 */
                              e182H2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e192H2 */
                              e192H2 ();
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
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we2H2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2H2( ) ;
         }
      }
   }

   public void pa2H2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b712_wp04_crf_filter_edit")), "b712_wp04_crf_filter_edit") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b712_wp04_crf_filter_edit"))) ;
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
                  AV18P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV31P_FILTER_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV31P_FILTER_NO", GXutil.ltrim( GXutil.str( AV31P_FILTER_NO, 4, 0)));
                  }
               }
            }
         }
         GXCCtl = "vD_GRD_F_SEL_" + sGXsfl_75_idx ;
         chkavD_grd_f_sel.setName( GXCCtl );
         chkavD_grd_f_sel.setWebtags( "" );
         chkavD_grd_f_sel.setCaption( "" );
         chkavD_grd_f_sel.setCheckedValue( "0" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_75 ,
                                 short nGXsfl_75_idx ,
                                 String sGXsfl_75_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_752( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         sendrow_752( ) ;
         nGXsfl_75_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_75_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_75_idx+1)) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_752( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( short nRC_GXsfl_100 ,
                                 short nGXsfl_100_idx ,
                                 String sGXsfl_100_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1004( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         sendrow_1004( ) ;
         nGXsfl_100_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_100_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_100_idx+1)) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1004( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void refresh( )
   {
      rf2H2( ) ;
      rf2H4( ) ;
      /* End function Refresh */
   }

   public void rf2H2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(75) ;
      nGXsfl_75_idx = (short)(1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_752( ) ;
      nGXsfl_75_Refreshing = (short)(1) ;
      /* Execute user event: e182H2 */
      e182H2 ();
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_752( ) ;
         /* Using cursor H002H2 */
         pr_default.execute(0, new Object[] {new Long(AV18P_STUDY_ID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A393TBM31_CRF_NM = H002H2_A393TBM31_CRF_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
            n393TBM31_CRF_NM = H002H2_n393TBM31_CRF_NM[0] ;
            A397TBM31_DEL_FLG = H002H2_A397TBM31_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
            n397TBM31_DEL_FLG = H002H2_n397TBM31_DEL_FLG[0] ;
            A68TBM31_STUDY_ID = H002H2_A68TBM31_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
            A69TBM31_CRF_ID = H002H2_A69TBM31_CRF_ID[0] ;
            /* Execute user event: e192H2 */
            e192H2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wbEnd = (short)(75) ;
         wb2H0( ) ;
      }
      nGXsfl_75_Refreshing = (short)(0) ;
   }

   public void rf2H4( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", "Grid");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      wbStart = (short)(100) ;
      nGXsfl_100_idx = (short)(1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1004( ) ;
      nGXsfl_100_Refreshing = (short)(1) ;
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1004( ) ;
         /* Execute user event: e162H4 */
         e162H4 ();
         wbEnd = (short)(100) ;
         wb2H0( ) ;
      }
      nGXsfl_100_Refreshing = (short)(0) ;
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

   public int subgrid2_pagecount( )
   {
      return -1 ;
   }

   public int subgrid2_recordcount( )
   {
      return -1 ;
   }

   public int subgrid2_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid2_currentpage( )
   {
      return -1 ;
   }

   public void strup2H0( )
   {
      /* Before Start, stand alone formulas. */
      AV40Pgmname = "B712_WP04_CRF_FILTER_EDIT" ;
      AV39Pgmdesc = "CRFフィルタ編集（入力）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_crf_snm_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e172H2 */
      e172H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sd_c712_sd10_c"), AV32SD_C712_SD10_C);
         /* Read variables values. */
         AV11D_GRD_F_NAME = httpContext.cgiGet( edtavD_grd_f_name_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_F_NAME", AV11D_GRD_F_NAME);
         /* Read saved values. */
         nRC_GXsfl_75 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), ".", ",")) ;
         nRC_GXsfl_100 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), ".", ",")) ;
         AV18P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV31P_FILTER_NO = (short)(localUtil.ctol( httpContext.cgiGet( "vP_FILTER_NO"), ".", ",")) ;
         nRC_GXsfl_100 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), ".", ",")) ;
         nGXsfl_100_fel_idx = (short)(0) ;
         while ( nGXsfl_100_fel_idx < nRC_GXsfl_100 )
         {
            nGXsfl_100_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_100_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_100_fel_idx+1)) ;
            sGXsfl_100_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1004( ) ;
            AV37GXV1 = nGXsfl_100_fel_idx ;
            AV37GXV1 = nGXsfl_100_fel_idx ;
            if ( ( AV32SD_C712_SD10_C.size() >= AV37GXV1 ) && ( AV37GXV1 > 0 ) )
            {
               AV32SD_C712_SD10_C.currentItem( ((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV32SD_C712_SD10_C.elementAt(-1+AV37GXV1)) );
               ((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV32SD_C712_SD10_C.elementAt(-1+AV37GXV1)).setgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlcrfid_Internalname), ".", ",")) );
            }
            AV32SD_C712_SD10_C.currentItem( ((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV32SD_C712_SD10_C.elementAt(-1+AV37GXV1)) );
         }
         if ( nGXsfl_100_fel_idx == 0 )
         {
            nGXsfl_100_idx = (short)(1) ;
            sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1004( ) ;
         }
         nGXsfl_100_fel_idx = (short)(1) ;
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
      /* Execute user event: e172H2 */
      e172H2 ();
      if (returnInSub) return;
   }

   public void e172H2( )
   {
      /* Start Routine */
      AV7C_APP_ID = "B712" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_APP_ID", AV7C_APP_ID);
      AV8C_GAMEN_TITLE = AV39Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_GAMEN_TITLE", AV8C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV15H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15H_INIT_FLG", AV15H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
   }

   public void e182H2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV30HTTP_REQUEST.getMethod(), "GET") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S122 */
         S122 ();
         if (returnInSub) return;
         GX_FocusControl = edtavD_grd_f_name_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      if ( AV31P_FILTER_NO == 0 )
      {
         lblTxt_btn_dlt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
      }
      else
      {
         lblTxt_btn_dlt_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_dlt_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_dlt_Visible, 5, 0)));
      }
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
   }

   public void e112H2( )
   {
      /* 'BTN_REG' Routine */
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV11D_GRD_F_NAME)==0) )
      {
         GXt_char1 = AV24W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "フィルタ名", "", "", "", "", GXv_char2) ;
         b712_wp04_crf_filter_edit_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
         httpContext.GX_msglist.addItem(AV24W_MSG);
      }
      else
      {
         if ( AV32SD_C712_SD10_C.size() == 0 )
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00007", "CRF", "", "", "", "", GXv_char2) ;
            b712_wp04_crf_filter_edit_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            httpContext.GX_msglist.addItem(AV24W_MSG);
         }
         else
         {
            GXt_char1 = AV24W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
            b712_wp04_crf_filter_edit_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            GXt_char1 = AV21W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV24W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
            b712_wp04_crf_filter_edit_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
            AV21W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
         }
      }
   }

   public void e122H2( )
   {
      /* 'BTN_REG_EXEC' Routine */
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      GXv_char2[0] = AV34W_RTN_MSG ;
      new b712_pc03_crf_filer_save(remoteHandle, context).execute( (byte)(0), AV18P_STUDY_ID, AV31P_FILTER_NO, AV11D_GRD_F_NAME, AV32SD_C712_SD10_C, GXv_char2) ;
      b712_wp04_crf_filter_edit_impl.this.AV34W_RTN_MSG = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV31P_FILTER_NO", GXutil.ltrim( GXutil.str( AV31P_FILTER_NO, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_F_NAME", AV11D_GRD_F_NAME);
      httpContext.ajax_rsp_assign_attri("", false, "AV34W_RTN_MSG", AV34W_RTN_MSG);
      if ( (GXutil.strcmp("", AV34W_RTN_MSG)==0) )
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV34W_RTN_MSG);
      }
   }

   public void e132H2( )
   {
      /* 'BTN_DEL' Routine */
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      GXt_char1 = AV24W_MSG ;
      GXv_char2[0] = GXt_char1 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
      b712_wp04_crf_filter_edit_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24W_MSG = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
      GXt_char1 = AV21W_A821_JS ;
      GXv_char2[0] = GXt_char1 ;
      new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV24W_MSG, "", "BTN_DEL_EXEC", "", GXv_char2) ;
      b712_wp04_crf_filter_edit_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_MSG", AV24W_MSG);
      AV21W_A821_JS = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21W_A821_JS", AV21W_A821_JS);
   }

   public void e142H2( )
   {
      /* 'BTN_DEL_EXEC' Routine */
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
      GXv_char2[0] = AV34W_RTN_MSG ;
      new b712_pc03_crf_filer_save(remoteHandle, context).execute( (byte)(1), AV18P_STUDY_ID, AV31P_FILTER_NO, AV11D_GRD_F_NAME, AV32SD_C712_SD10_C, GXv_char2) ;
      b712_wp04_crf_filter_edit_impl.this.AV34W_RTN_MSG = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV31P_FILTER_NO", GXutil.ltrim( GXutil.str( AV31P_FILTER_NO, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_F_NAME", AV11D_GRD_F_NAME);
      httpContext.ajax_rsp_assign_attri("", false, "AV34W_RTN_MSG", AV34W_RTN_MSG);
      if ( (GXutil.strcmp("", AV34W_RTN_MSG)==0) )
      {
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV34W_RTN_MSG);
      }
   }

   public void e152H2( )
   {
      /* 'BTN_CAN' Routine */
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
   }

   public void S122( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      AV11D_GRD_F_NAME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_F_NAME", AV11D_GRD_F_NAME);
      if ( AV31P_FILTER_NO == 0 )
      {
         AV32SD_C712_SD10_C.clear();
         gx_BV100 = true ;
      }
      else
      {
         /* Using cursor H002H3 */
         pr_default.execute(1, new Object[] {new Long(AV18P_STUDY_ID), new Short(AV31P_FILTER_NO)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A982TBM45_DEL_FLG = H002H3_A982TBM45_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A982TBM45_DEL_FLG", A982TBM45_DEL_FLG);
            n982TBM45_DEL_FLG = H002H3_n982TBM45_DEL_FLG[0] ;
            A978TBM45_FILTER_NO = H002H3_A978TBM45_FILTER_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
            A977TBM45_STUDY_ID = H002H3_A977TBM45_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
            A980TBM45_FILETR_NM = H002H3_A980TBM45_FILETR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A980TBM45_FILETR_NM", A980TBM45_FILETR_NM);
            n980TBM45_FILETR_NM = H002H3_n980TBM45_FILETR_NM[0] ;
            A981TBM45_IN_CRF_ID = H002H3_A981TBM45_IN_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A981TBM45_IN_CRF_ID", A981TBM45_IN_CRF_ID);
            n981TBM45_IN_CRF_ID = H002H3_n981TBM45_IN_CRF_ID[0] ;
            AV11D_GRD_F_NAME = A980TBM45_FILETR_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11D_GRD_F_NAME", AV11D_GRD_F_NAME);
            AV32SD_C712_SD10_C.fromJSonString(A981TBM45_IN_CRF_ID);
            gx_BV100 = true ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S152( )
   {
      /* 'SUB_CRF_FILTER_LIST' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b712_wp03_crf_filter_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV18P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b712_wp03_crf_filter_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV19W_A_LOGIN_SDT;
      GXv_char2[0] = AV22W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV19W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b712_wp04_crf_filter_edit_impl.this.AV22W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_ERRCD", AV22W_ERRCD);
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      Form.getJscriptsrc().add("js/acom.js") ;
   }

   public void S142( )
   {
      /* 'SUB_GRD_CHK_SAVE' Routine */
      AV32SD_C712_SD10_C.clear();
      gx_BV100 = true ;
      /* Start For Each Line in Grid1 */
      nRC_GXsfl_75 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), ".", ",")) ;
      nGXsfl_75_fel_idx = (short)(0) ;
      while ( nGXsfl_75_fel_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_75_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_75_fel_idx+1)) ;
         sGXsfl_75_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_fel_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_fel_752( ) ;
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavD_grd_f_sel.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavD_grd_f_sel.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_F_SEL");
            GX_FocusControl = chkavD_grd_f_sel.getInternalname() ;
            wbErr = true ;
            AV28D_GRD_F_SEL = (byte)(0) ;
         }
         else
         {
            AV28D_GRD_F_SEL = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavD_grd_f_sel.getInternalname()), "1")==0) ? 1 : 0)) ;
         }
         AV29D_GRD_CRF_SNM = httpContext.cgiGet( edtavD_grd_crf_snm_Internalname) ;
         A69TBM31_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",")) ;
         if ( AV28D_GRD_F_SEL == 1 )
         {
            AV33SD_C712_SD10_I = (SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)new SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem(remoteHandle, context);
            AV33SD_C712_SD10_I.setgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid( A69TBM31_CRF_ID );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33SD_C712_SD10_I", AV33SD_C712_SD10_I);
            AV32SD_C712_SD10_C.add(AV33SD_C712_SD10_I, 0);
            gx_BV100 = true ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_75_fel_idx == 0 )
      {
         nGXsfl_75_idx = (short)(1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_752( ) ;
      }
      nGXsfl_75_fel_idx = (short)(1) ;
   }

   public void S132( )
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
      if ( ! (GXutil.strcmp("", AV21W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV21W_A821_JS ;
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

   public void S162( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV40Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b712_wp04_crf_filter_edit");
   }

   private void e192H2( )
   {
      /* Grid1_Load Routine */
      edtTBM31_CRF_ID_Visible = 0 ;
      AV29D_GRD_CRF_SNM = A393TBM31_CRF_NM ;
      AV28D_GRD_F_SEL = (byte)(0) ;
      AV45GXV2 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45GXV2", GXutil.ltrim( GXutil.str( AV45GXV2, 8, 0)));
      while ( AV45GXV2 <= AV32SD_C712_SD10_C.size() )
      {
         AV33SD_C712_SD10_I = (SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV32SD_C712_SD10_C.elementAt(-1+AV45GXV2));
         if ( A69TBM31_CRF_ID == AV33SD_C712_SD10_I.getgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid() )
         {
            AV28D_GRD_F_SEL = (byte)(1) ;
            if (true) break;
         }
         AV45GXV2 = (int)(AV45GXV2+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45GXV2", GXutil.ltrim( GXutil.str( AV45GXV2, 8, 0)));
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(75) ;
      }
      sendrow_752( ) ;
   }

   private void e162H4( )
   {
      /* Grid2_Load Routine */
      AV37GXV1 = (short)(1) ;
      while ( AV37GXV1 <= AV32SD_C712_SD10_C.size() )
      {
         AV32SD_C712_SD10_C.currentItem( ((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV32SD_C712_SD10_C.elementAt(-1+AV37GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV32SD_C712_SD10_C", AV32SD_C712_SD10_C);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(100) ;
         }
         sendrow_1004( ) ;
         AV37GXV1 = (short)(AV37GXV1+1) ;
      }
   }

   public void wb_table2_88_2H2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "<br>") ;
         httpContext.writeText( "<span></span>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_exec_Internalname, "TXT_BTN_REG_EXEC", "", "", lblTxt_btn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_del_exec_Internalname, "TXT_BTN_DEL_EXEC", "", "", lblTxt_btn_del_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DEL_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /*  Grid Control  */
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" gxgridid=\"100\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "Grid", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid2_Backcolorstyle == 0 )
            {
               subGrid2_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Title" ;
               }
            }
            else
            {
               subGrid2_Titlebackstyle = (byte)(1) ;
               if ( subGrid2_Backcolorstyle == 1 )
               {
                  subGrid2_Titlebackcolor = subGrid2_Allbackcolor ;
                  if ( GXutil.len( subGrid2_Class) > 0 )
                  {
                     subGrid2_Linesclass = subGrid2_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid2_Class) > 0 )
                  {
                     subGrid2_Linesclass = subGrid2_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+subGrid2_Linesclass+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CRFID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", "Grid");
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("CmpContext", "");
            Grid2Container.AddObjectProperty("InMasterPage", "false");
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 100 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_100 = (short)(nGXsfl_100_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV37GXV1 = nGXsfl_100_idx ;
            sStyleString = " style=\"display:none;\"" ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_88_2H2e( true) ;
      }
      else
      {
         wb_table2_88_2H2e( false) ;
      }
   }

   public void wb_table1_2_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 534, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBody", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\" rowspan=\"3\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"center\"  style=\"height:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "2c4dd041-bc05-4078-b5a7-f8ce2f3cf741", "", context.getHttpContext().getTheme( )))+"\" rowspan=\"3\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_9_2H2( true) ;
      }
      else
      {
         wb_table3_9_2H2( false) ;
      }
      return  ;
   }

   public void wb_table3_9_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_2H2e( true) ;
      }
      else
      {
         wb_table1_2_2H2e( false) ;
      }
   }

   public void wb_table3_9_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 530, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table4_14_2H2( true) ;
      }
      else
      {
         wb_table4_14_2H2( false) ;
      }
      return  ;
   }

   public void wb_table4_14_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table5_23_2H2( true) ;
      }
      else
      {
         wb_table5_23_2H2( false) ;
      }
      return  ;
   }

   public void wb_table5_23_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"vertical-align:top;height:100%\">") ;
         wb_table6_47_2H2( true) ;
      }
      else
      {
         wb_table6_47_2H2( false) ;
      }
      return  ;
   }

   public void wb_table6_47_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\"  style=\"height:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_9_2H2e( true) ;
      }
      else
      {
         wb_table3_9_2H2e( false) ;
      }
   }

   public void wb_table6_47_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_50_2H2( true) ;
      }
      else
      {
         wb_table7_50_2H2( false) ;
      }
      return  ;
   }

   public void wb_table7_50_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_47_2H2e( true) ;
      }
      else
      {
         wb_table6_47_2H2e( false) ;
      }
   }

   public void wb_table7_50_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table8_58_2H2( true) ;
      }
      else
      {
         wb_table8_58_2H2( false) ;
      }
      return  ;
   }

   public void wb_table8_58_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table9_69_2H2( true) ;
      }
      else
      {
         wb_table9_69_2H2( false) ;
      }
      return  ;
   }

   public void wb_table9_69_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 490, "px", 300, "px", "SectionScroll_NoLineY", "");
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"75\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridTM-1s", 0, "", "", 0, 1, sStyleString, "none", 0);
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
            Grid1Container.SetIsFreestyle(true);
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1s"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1s");
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28D_GRD_F_SEL, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV29D_GRD_CRF_SNM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_crf_snm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTBM31_CRF_ID_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 75 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_75 = (short)(nGXsfl_75_idx-1) ;
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
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_50_2H2e( true) ;
      }
      else
      {
         wb_table7_50_2H2e( false) ;
      }
   }

   public void wb_table9_69_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header2_Internalname, tblTbl_grid_header2_Internalname, "", "TableGridHeader_s", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:415px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "CRF ", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader_s", 0, "", 1, 1, (short)(0), "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_69_2H2e( true) ;
      }
      else
      {
         wb_table9_69_2H2e( false) ;
      }
   }

   public void wb_table8_58_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 470, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:80px\">") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "&nbsp;") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "フィルタ名", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_75_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_grd_f_name_Internalname, GXutil.rtrim( AV11D_GRD_F_NAME), GXutil.rtrim( localUtil.format( AV11D_GRD_F_NAME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_grd_f_name_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_58_2H2e( true) ;
      }
      else
      {
         wb_table8_58_2H2e( false) ;
      }
   }

   public void wb_table5_23_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_26_2H2( true) ;
      }
      else
      {
         wb_table10_26_2H2( false) ;
      }
      return  ;
   }

   public void wb_table10_26_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_23_2H2e( true) ;
      }
      else
      {
         wb_table5_23_2H2e( false) ;
      }
   }

   public void wb_table10_26_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_29_2H2( true) ;
      }
      else
      {
         wb_table11_29_2H2( false) ;
      }
      return  ;
   }

   public void wb_table11_29_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_40_2H2( true) ;
      }
      else
      {
         wb_table12_40_2H2( false) ;
      }
      return  ;
   }

   public void wb_table12_40_2H2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_26_2H2e( true) ;
      }
      else
      {
         wb_table10_26_2H2e( false) ;
      }
   }

   public void wb_table12_40_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "right", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "戻る", "", "", lblTxt_btn_reg2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_40_2H2e( true) ;
      }
      else
      {
         wb_table12_40_2H2e( false) ;
      }
   }

   public void wb_table11_29_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upd_Internalname, "登録", "", "", lblTxt_btn_upd_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_dlt_Internalname, "削除", "", "", lblTxt_btn_dlt_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DEL\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_dlt_Visible, 1, (short)(0), "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_29_2H2e( true) ;
      }
      else
      {
         wb_table11_29_2H2e( false) ;
      }
   }

   public void wb_table4_14_2H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:20px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "CRFフィルタ編集", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockPTitle", 0, "", 1, 1, (short)(0), "HLP_B712_WP04_CRF_FILTER_EDIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_14_2H2e( true) ;
      }
      else
      {
         wb_table4_14_2H2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV18P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18P_STUDY_ID", GXutil.ltrim( GXutil.str( AV18P_STUDY_ID, 10, 0)));
      AV31P_FILTER_NO = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31P_FILTER_NO", GXutil.ltrim( GXutil.str( AV31P_FILTER_NO, 4, 0)));
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
      pa2H2( ) ;
      ws2H2( ) ;
      we2H2( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513312248");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b712_wp04_crf_filter_edit.js", "?202071513312248");
      /* End function include_jscripts */
   }

   public void subsflControlProps_752( )
   {
      chkavD_grd_f_sel.setInternalname( "vD_GRD_F_SEL_"+sGXsfl_75_idx );
      edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_75_idx ;
      edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_752( )
   {
      chkavD_grd_f_sel.setInternalname( "vD_GRD_F_SEL_"+sGXsfl_75_fel_idx );
      edtavD_grd_crf_snm_Internalname = "vD_GRD_CRF_SNM_"+sGXsfl_75_fel_idx ;
      edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID_"+sGXsfl_75_fel_idx ;
   }

   public void sendrow_752( )
   {
      subsflControlProps_752( ) ;
      wb2H0( ) ;
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
         if ( ((int)(((nGXsfl_75_idx-1)/ (double) (1)) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xF5F5F5) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( ( 1 == 0 ) && ( nGXsfl_75_idx == 1 ) )
         {
            httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_75_idx+"\">") ;
         }
         if ( 1 > 0 )
         {
            if ( ( 1 == 1 ) || ( ((int)((nGXsfl_75_idx) % (1))) - 1 == 0 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_75_idx+"\">") ;
            }
         }
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
      /* Check box */
      TempTags = " " + ((chkavD_grd_f_sel.getEnabled()!=0)&&(chkavD_grd_f_sel.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 78,'',false,'"+sGXsfl_75_idx+"',75)\"" : " ") ;
      ClassString = "ReadonlyAttribute" ;
      StyleString = "" ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavD_grd_f_sel.getInternalname(),GXutil.str( AV28D_GRD_F_SEL, 1, 0),"",new Integer(1),new Integer(1),"1","",StyleString,ClassString,"",TempTags+((chkavD_grd_f_sel.getEnabled()!=0)&&(chkavD_grd_f_sel.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(78, this, 1, 0);gx.evt.onchange(this);\" " : " ")+((chkavD_grd_f_sel.getEnabled()!=0)&&(chkavD_grd_f_sel.getVisible()!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(78);\"" : " ")});
      if ( Grid1Container.GetWrapped() == 1 )
      {
         Grid1Container.CloseTag("cell");
      }
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:415px\""});
      /* Single line edit */
      TempTags = " " + ((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_75_idx+"',75)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_crf_snm_Internalname,GXutil.rtrim( AV29D_GRD_CRF_SNM),"",TempTags+((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_crf_snm_Enabled!=0)&&(edtavD_grd_crf_snm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(80);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_crf_snm_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_crf_snm_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBM31_CRF_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A69TBM31_CRF_ID), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBM31_CRF_ID_Jsonclick,new Integer(0),"Attribute","color:#FF0000;",ROClassString,"",new Integer(edtTBM31_CRF_ID_Visible),new Integer(0),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_CRF_ID","right"});
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
            if ( ((int)((nGXsfl_75_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_75_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_75_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_75_idx+1)) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_752( ) ;
      /* End function sendrow_752 */
   }

   public void subsflControlProps_1004( )
   {
      edtavCtlcrfid_Internalname = "CTLCRFID_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_1004( )
   {
      edtavCtlcrfid_Internalname = "CTLCRFID_"+sGXsfl_100_fel_idx ;
   }

   public void sendrow_1004( )
   {
      subsflControlProps_1004( ) ;
      wb2H0( ) ;
      Grid2Row = GXWebRow.GetNew(context,Grid2Container) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0x0) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+subGrid2_Linesclass+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_100_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlcrfid_Enabled!=0)&&(edtavCtlcrfid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 101,'',false,'"+sGXsfl_100_idx+"',100)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcrfid_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV32SD_C712_SD10_C.elementAt(-1+AV37GXV1)).getgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid(), (byte)(4), (byte)(0), ".", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem)AV32SD_C712_SD10_C.elementAt(-1+AV37GXV1)).getgxTv_SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem_Crfid()), "ZZZ9")),TempTags+((edtavCtlcrfid_Enabled!=0)&&(edtavCtlcrfid_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlcrfid_Enabled!=0)&&(edtavCtlcrfid_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(101);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcrfid_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(100),new Integer(1),new Integer(-1),new Integer(0),new Boolean(false),"","right"});
      Grid2Container.AddRow(Grid2Row);
      nGXsfl_100_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_100_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_100_idx+1)) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_100_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1004( ) ;
      /* End function sendrow_1004 */
   }

   public void init_default_properties( )
   {
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      tblTable9_Internalname = "TABLE9" ;
      lblTxt_btn_upd_Internalname = "TXT_BTN_UPD" ;
      lblTxt_btn_dlt_Internalname = "TXT_BTN_DLT" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      lblTxt_btn_reg2_Internalname = "TXT_BTN_REG2" ;
      tblTable10_Internalname = "TABLE10" ;
      tblTable6_Internalname = "TABLE6" ;
      tblTable5_Internalname = "TABLE5" ;
      imgImage2_Internalname = "IMAGE2" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtavD_grd_f_name_Internalname = "vD_GRD_F_NAME" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      tblTbl_grid_header2_Internalname = "TBL_GRID_HEADER2" ;
      divSection1_Internalname = "SECTION1" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblTxt_btn_reg_exec_Internalname = "TXT_BTN_REG_EXEC" ;
      lblTxt_btn_del_exec_Internalname = "TXT_BTN_DEL_EXEC" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavCtlcrfid_Jsonclick = "" ;
      edtavCtlcrfid_Visible = -1 ;
      edtavCtlcrfid_Enabled = 1 ;
      edtTBM31_CRF_ID_Jsonclick = "" ;
      edtavD_grd_crf_snm_Jsonclick = "" ;
      edtavD_grd_crf_snm_Visible = 1 ;
      chkavD_grd_f_sel.setVisible( 1 );
      chkavD_grd_f_sel.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridTM-1s" ;
      lblTxt_btn_dlt_Visible = 1 ;
      edtavD_grd_f_name_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtTBM31_CRF_ID_Visible = 1 ;
      edtavD_grd_crf_snm_Enabled = 1 ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Class = "Grid" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid2_Backcolorstyle = (byte)(0) ;
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
                  /* Execute user subroutine: S162 */
                  S162 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV32SD_C712_SD10_C = new GxObjectCollection(SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem.class, "C712_SD10_IN_CRF_ID.C712_SD10_IN_CRF_IDItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV40Pgmname = "" ;
      A982TBM45_DEL_FLG = "" ;
      A980TBM45_FILETR_NM = "" ;
      A981TBM45_IN_CRF_ID = "" ;
      AV21W_A821_JS = "" ;
      A393TBM31_CRF_NM = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      edtavCtlcrfid_Internalname = "" ;
      AV29D_GRD_CRF_SNM = "" ;
      edtavD_grd_crf_snm_Internalname = "" ;
      edtTBM31_CRF_ID_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      H002H2_A393TBM31_CRF_NM = new String[] {""} ;
      H002H2_n393TBM31_CRF_NM = new boolean[] {false} ;
      H002H2_A397TBM31_DEL_FLG = new String[] {""} ;
      H002H2_n397TBM31_DEL_FLG = new boolean[] {false} ;
      H002H2_A68TBM31_STUDY_ID = new long[1] ;
      H002H2_A69TBM31_CRF_ID = new short[1] ;
      A397TBM31_DEL_FLG = "" ;
      AV39Pgmdesc = "" ;
      AV11D_GRD_F_NAME = "" ;
      AV7C_APP_ID = "" ;
      AV8C_GAMEN_TITLE = "" ;
      AV15H_INIT_FLG = "" ;
      AV30HTTP_REQUEST = httpContext.getHttpRequest();
      AV24W_MSG = "" ;
      AV34W_RTN_MSG = "" ;
      GXt_char1 = "" ;
      H002H3_A982TBM45_DEL_FLG = new String[] {""} ;
      H002H3_n982TBM45_DEL_FLG = new boolean[] {false} ;
      H002H3_A978TBM45_FILTER_NO = new short[1] ;
      H002H3_A977TBM45_STUDY_ID = new long[1] ;
      H002H3_A980TBM45_FILETR_NM = new String[] {""} ;
      H002H3_n980TBM45_FILETR_NM = new boolean[] {false} ;
      H002H3_A981TBM45_IN_CRF_ID = new String[] {""} ;
      H002H3_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      AV19W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV22W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      AV33SD_C712_SD10_I = new SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem(remoteHandle, context);
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      lblTxt_btn_reg_exec_Jsonclick = "" ;
      lblTxt_btn_del_exec_Jsonclick = "" ;
      subGrid2_Linesclass = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock34_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      TempTags = "" ;
      lblTxt_btn_reg2_Jsonclick = "" ;
      lblTxt_btn_upd_Jsonclick = "" ;
      lblTxt_btn_dlt_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b712_wp04_crf_filter_edit__default(),
         new Object[] {
             new Object[] {
            H002H2_A393TBM31_CRF_NM, H002H2_n393TBM31_CRF_NM, H002H2_A397TBM31_DEL_FLG, H002H2_n397TBM31_DEL_FLG, H002H2_A68TBM31_STUDY_ID, H002H2_A69TBM31_CRF_ID
            }
            , new Object[] {
            H002H3_A982TBM45_DEL_FLG, H002H3_n982TBM45_DEL_FLG, H002H3_A978TBM45_FILTER_NO, H002H3_A977TBM45_STUDY_ID, H002H3_A980TBM45_FILETR_NM, H002H3_n980TBM45_FILETR_NM, H002H3_A981TBM45_IN_CRF_ID, H002H3_n981TBM45_IN_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV40Pgmname = "B712_WP04_CRF_FILTER_EDIT" ;
      AV39Pgmdesc = "CRFフィルタ編集（入力）" ;
      /* GeneXus formulas. */
      AV40Pgmname = "B712_WP04_CRF_FILTER_EDIT" ;
      AV39Pgmdesc = "CRFフィルタ編集（入力）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_crf_snm_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV28D_GRD_F_SEL ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Titlebackstyle ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backstyle ;
   private byte GRID1_nEOF ;
   private byte GRID2_nEOF ;
   private short wcpOAV31P_FILTER_NO ;
   private short nRC_GXsfl_75 ;
   private short nGXsfl_75_idx=1 ;
   private short nRC_GXsfl_100 ;
   private short nGXsfl_100_idx=1 ;
   private short AV31P_FILTER_NO ;
   private short A978TBM45_FILTER_NO ;
   private short wbEnd ;
   private short wbStart ;
   private short AV37GXV1 ;
   private short A69TBM31_CRF_ID ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_75_Refreshing=0 ;
   private short nGXsfl_100_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_100_fel_idx=1 ;
   private short nGXsfl_75_fel_idx=1 ;
   private int subGrid1_Islastpage ;
   private int subGrid2_Islastpage ;
   private int edtavD_grd_crf_snm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int lblTxt_btn_dlt_Visible ;
   private int GXActiveErrHndl ;
   private int edtTBM31_CRF_ID_Visible ;
   private int AV45GXV2 ;
   private int subGrid2_Titlebackcolor ;
   private int subGrid2_Allbackcolor ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_crf_snm_Visible ;
   private int subGrid2_Backcolor ;
   private int edtavCtlcrfid_Enabled ;
   private int edtavCtlcrfid_Visible ;
   private long wcpOAV18P_STUDY_ID ;
   private long AV18P_STUDY_ID ;
   private long A977TBM45_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long A68TBM31_STUDY_ID ;
   private long GRID2_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_75_idx="0001" ;
   private String sGXsfl_100_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV40Pgmname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCtlcrfid_Internalname ;
   private String edtavD_grd_crf_snm_Internalname ;
   private String edtTBM31_CRF_ID_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV39Pgmdesc ;
   private String edtavD_grd_f_name_Internalname ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblTxt_btn_dlt_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblTxt_btn_reg_exec_Internalname ;
   private String lblTxt_btn_reg_exec_Jsonclick ;
   private String lblTxt_btn_del_exec_Internalname ;
   private String lblTxt_btn_del_exec_Jsonclick ;
   private String subGrid2_Internalname ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divSection1_Internalname ;
   private String subGrid1_Internalname ;
   private String tblTbl_grid_header2_Internalname ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String tblTbl_grid_header_Internalname ;
   private String imgImage2_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String TempTags ;
   private String edtavD_grd_f_name_Jsonclick ;
   private String tblTable5_Internalname ;
   private String tblTable6_Internalname ;
   private String tblTable10_Internalname ;
   private String lblTxt_btn_reg2_Internalname ;
   private String lblTxt_btn_reg2_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_upd_Internalname ;
   private String lblTxt_btn_upd_Jsonclick ;
   private String lblTxt_btn_dlt_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavD_grd_crf_snm_Jsonclick ;
   private String edtTBM31_CRF_ID_Jsonclick ;
   private String edtavCtlcrfid_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean returnInSub ;
   private boolean gx_BV100 ;
   private boolean n982TBM45_DEL_FLG ;
   private boolean n980TBM45_FILETR_NM ;
   private boolean n981TBM45_IN_CRF_ID ;
   private String A982TBM45_DEL_FLG ;
   private String A980TBM45_FILETR_NM ;
   private String A981TBM45_IN_CRF_ID ;
   private String AV21W_A821_JS ;
   private String A393TBM31_CRF_NM ;
   private String AV29D_GRD_CRF_SNM ;
   private String A397TBM31_DEL_FLG ;
   private String AV11D_GRD_F_NAME ;
   private String AV7C_APP_ID ;
   private String AV8C_GAMEN_TITLE ;
   private String AV15H_INIT_FLG ;
   private String AV24W_MSG ;
   private String AV34W_RTN_MSG ;
   private String AV22W_ERRCD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV30HTTP_REQUEST ;
   private ICheckbox chkavD_grd_f_sel ;
   private IDataStoreProvider pr_default ;
   private String[] H002H2_A393TBM31_CRF_NM ;
   private boolean[] H002H2_n393TBM31_CRF_NM ;
   private String[] H002H2_A397TBM31_DEL_FLG ;
   private boolean[] H002H2_n397TBM31_DEL_FLG ;
   private long[] H002H2_A68TBM31_STUDY_ID ;
   private short[] H002H2_A69TBM31_CRF_ID ;
   private String[] H002H3_A982TBM45_DEL_FLG ;
   private boolean[] H002H3_n982TBM45_DEL_FLG ;
   private short[] H002H3_A978TBM45_FILTER_NO ;
   private long[] H002H3_A977TBM45_STUDY_ID ;
   private String[] H002H3_A980TBM45_FILETR_NM ;
   private boolean[] H002H3_n980TBM45_FILETR_NM ;
   private String[] H002H3_A981TBM45_IN_CRF_ID ;
   private boolean[] H002H3_n981TBM45_IN_CRF_ID ;
   private GxObjectCollection AV32SD_C712_SD10_C ;
   private SdtC712_SD10_IN_CRF_ID_C712_SD10_IN_CRF_IDItem AV33SD_C712_SD10_I ;
   private SdtA_LOGIN_SDT AV19W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b712_wp04_crf_filter_edit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002H2", "SELECT `TBM31_CRF_NM`, `TBM31_DEL_FLG`, `TBM31_STUDY_ID`, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H002H3", "SELECT `TBM45_DEL_FLG`, `TBM45_FILTER_NO`, `TBM45_STUDY_ID`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID` FROM `TBM45_CRF_FILETR` WHERE (`TBM45_STUDY_ID` = ? and `TBM45_FILTER_NO` = ?) AND (`TBM45_DEL_FLG` = '0') ORDER BY `TBM45_STUDY_ID`, `TBM45_FILTER_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

