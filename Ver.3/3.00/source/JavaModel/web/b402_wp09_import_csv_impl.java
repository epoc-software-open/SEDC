/*
               File: b402_wp09_import_csv_impl
        Description: CSV取込画面
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:24:43.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp09_import_csv_impl extends GXWebPanel
{
   public b402_wp09_import_csv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp09_import_csv_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp09_import_csv_impl.class ));
   }

   public b402_wp09_import_csv_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_moji_cd = new HTMLChoice();
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
            nRC_GXsfl_156 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_156_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_156_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_156, nGXsfl_156_idx, sGXsfl_156_idx) ;
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
            AV13P_RUN_DIV = (short)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13P_RUN_DIV", GXutil.ltrim( GXutil.str( AV13P_RUN_DIV, 4, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
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
         pa1C2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1C2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1C2( ) ;
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
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513244334");
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
      GXEncryptionTmp = "b402_wp09_import_csv"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13P_RUN_DIV,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp09_import_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1C2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "W_b402_sd05_import_csv_list", AV18W_B402_SD05_IMPORT_CSV_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("W_b402_sd05_import_csv_list", AV18W_B402_SD05_IMPORT_CSV_LIST);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV10H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_156", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_156, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV6C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_APP_ID", GetHash( "", String.valueOf(AV6C_APP_ID)));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBT16_IMPORT_DATETIME", localUtil.ttoc( A840TBT16_IMPORT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "TBT16_IMPORT_NO", GXutil.ltrim( localUtil.ntoc( A190TBT16_IMPORT_NO, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBT16_FILE_NM", GXutil.rtrim( A839TBT16_FILE_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBT16_IMPORT_FILE_NM", GXutil.rtrim( A838TBT16_IMPORT_FILE_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBT16_DEL_FLG", GXutil.rtrim( A841TBT16_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV17W_A821_JS));
      GxWebStd.gx_hidden_field( httpContext, "vW_A819_JS", GXutil.rtrim( AV16W_A819_JS));
      GxWebStd.gx_hidden_field( httpContext, "vP_RUN_DIV", GXutil.ltrim( localUtil.ntoc( AV13P_RUN_DIV, (byte)(4), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vW_B402_SD05_IMPORT_CSV_LIST", AV18W_B402_SD05_IMPORT_CSV_LIST);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vW_B402_SD05_IMPORT_CSV_LIST", AV18W_B402_SD05_IMPORT_CSV_LIST);
      }
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV14P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      GXCCtlgxBlob = "vD_UPLOAD_FILE" + "_gxBlob" ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, GXutil.rtrim( AV9D_UPLOAD_FILE));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
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
      return "B402_WP09_IMPORT_CSV" ;
   }

   public String getPgmdesc( )
   {
      return "CSV取込画面" ;
   }

   public void wb1C0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1C2( true) ;
      }
      else
      {
         wb_table1_2_1C2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_176_1C2( true) ;
      }
      else
      {
         wb_table2_176_1C2( false) ;
      }
      return  ;
   }

   public void wb_table2_176_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1C2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "CSV取込画面", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0174") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0174", "");
         }
      }
      wbErr = false ;
      strup1C0( ) ;
   }

   public void ws1C2( )
   {
      start1C2( ) ;
      evt1C2( ) ;
   }

   public void evt1C2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPLOAD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e111C2 */
                        e111C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121C2 */
                        e121C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131C2 */
                        e131C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141C2 */
                        e141C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151C2 */
                        e151C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161C2 */
                        e161C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171C2 */
                        e171C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181C2 */
                        e181C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191C2 */
                        e191C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201C2 */
                        e201C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211C2 */
                        e211C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221C2 */
                        e221C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231C2 */
                        e231C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241C2 */
                        e241C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251C2 */
                        e251C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261C2 */
                        e261C2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'BTN_DOWNLOAD'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'BTN_DOWNLOAD'") == 0 ) )
                     {
                        nGXsfl_156_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_156_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_156_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1562( ) ;
                        AV32GXV1 = (short)(nGXsfl_156_idx+GRID1_nFirstRecordOnPage) ;
                        if ( ( AV18W_B402_SD05_IMPORT_CSV_LIST.size() >= AV32GXV1 ) && ( AV32GXV1 > 0 ) )
                        {
                           AV18W_B402_SD05_IMPORT_CSV_LIST.currentItem( ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)) );
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt16_import_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt16_import_no_Internalname), ".", ",") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBT16_IMPORT_NO");
                              GX_FocusControl = edtavCtltbt16_import_no_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no( 0 );
                           }
                           else
                           {
                              ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no( localUtil.ctol( httpContext.cgiGet( edtavCtltbt16_import_no_Internalname), ".", ",") );
                           }
                           ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm( httpContext.cgiGet( edtavCtltbt16_import_file_nm_Internalname) );
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbt16_import_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBT16_IMPORT_DATETIME");
                              GX_FocusControl = edtavCtltbt16_import_datetime_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime( GXutil.nullDate() );
                           }
                           else
                           {
                              ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbt16_import_datetime_Internalname)) );
                           }
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0174") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0174", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0174") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0174", "");
                        }
                        if ( (GXutil.strcmp("", AV9D_UPLOAD_FILE)==0) )
                        {
                           GXCCtl = "vD_UPLOAD_FILE_" + sGXsfl_156_idx ;
                           GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
                           AV9D_UPLOAD_FILE = httpContext.cgiGet( GXCCtlgxBlob) ;
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e271C2 */
                              e271C2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e281C2 */
                              e281C2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e291C2 */
                              e291C2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_DOWNLOAD'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e301C2 */
                              e301C2 ();
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
                  else if ( nCmpId == 174 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0174") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0174", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1C2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1C2( ) ;
         }
      }
   }

   public void pa1C2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp09_import_csv")), "b402_wp09_import_csv") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp09_import_csv"))) ;
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
                  AV13P_RUN_DIV = (short)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV13P_RUN_DIV", GXutil.ltrim( GXutil.str( AV13P_RUN_DIV, 4, 0)));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV14P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
                  }
               }
            }
         }
         cmbavD_moji_cd.setName( "vD_MOJI_CD" );
         cmbavD_moji_cd.setWebtags( "" );
         cmbavD_moji_cd.addItem("UTF-8", "UTF-8", (short)(0));
         cmbavD_moji_cd.addItem("MS932", "Shift_JIS", (short)(0));
         if ( cmbavD_moji_cd.getItemCount() > 0 )
         {
            AV29D_MOJI_CD = cmbavD_moji_cd.getValidValue(AV29D_MOJI_CD) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29D_MOJI_CD", AV29D_MOJI_CD);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_156 ,
                                 short nGXsfl_156_idx ,
                                 String sGXsfl_156_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1562( ) ;
      while ( nGXsfl_156_idx <= nRC_GXsfl_156 )
      {
         sendrow_1562( ) ;
         nGXsfl_156_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_156_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_156_idx+1)) ;
         sGXsfl_156_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_156_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1562( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1C2( ) ;
      /* End function Refresh */
   }

   public void rf1C2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGridBase");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(156) ;
      nGXsfl_156_idx = (short)(1) ;
      sGXsfl_156_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_156_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1562( ) ;
      nGXsfl_156_Refreshing = (short)(1) ;
      /* Execute user event: e281C2 */
      e281C2 ();
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
         subsflControlProps_1562( ) ;
         /* Execute user event: e291C2 */
         e291C2 ();
         wbEnd = (short)(156) ;
         wb1C0( ) ;
      }
      nGXsfl_156_Refreshing = (short)(0) ;
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
      return AV18W_B402_SD05_IMPORT_CSV_LIST.size() ;
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

   public void strup1C0( )
   {
      /* Before Start, stand alone formulas. */
      AV37Pgmname = "B402_WP09_IMPORT_CSV" ;
      Gx_err = (short)(0) ;
      edtavCtltbt16_import_no_Enabled = 0 ;
      edtavCtltbt16_import_file_nm_Enabled = 0 ;
      edtavCtltbt16_import_datetime_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e271C2 */
      e271C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "W_b402_sd05_import_csv_list"), AV18W_B402_SD05_IMPORT_CSV_LIST);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV10H_A_PAGING_SDT);
         /* Read variables values. */
         AV9D_UPLOAD_FILE = httpContext.cgiGet( edtavD_upload_file_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPLOAD_FILE", AV9D_UPLOAD_FILE);
         cmbavD_moji_cd.setName( cmbavD_moji_cd.getInternalname() );
         cmbavD_moji_cd.setValue( httpContext.cgiGet( cmbavD_moji_cd.getInternalname()) );
         AV29D_MOJI_CD = httpContext.cgiGet( cmbavD_moji_cd.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29D_MOJI_CD", AV29D_MOJI_CD);
         AV8D_ORIGINAL_NAME = httpContext.cgiGet( edtavD_original_name_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8D_ORIGINAL_NAME", AV8D_ORIGINAL_NAME);
         AV11H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
         AV12H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         /* Read saved values. */
         nRC_GXsfl_156 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_156"), ".", ",")) ;
         AV13P_RUN_DIV = (short)(localUtil.ctol( httpContext.cgiGet( "vP_RUN_DIV"), ".", ",")) ;
         AV14P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0174") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0174", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         nRC_GXsfl_156 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_156"), ".", ",")) ;
         nGXsfl_156_fel_idx = (short)(0) ;
         while ( nGXsfl_156_fel_idx < nRC_GXsfl_156 )
         {
            nGXsfl_156_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_156_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_156_fel_idx+1)) ;
            sGXsfl_156_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_156_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1562( ) ;
            AV32GXV1 = (short)(nGXsfl_156_fel_idx+GRID1_nFirstRecordOnPage) ;
            AV32GXV1 = (short)(nGXsfl_156_fel_idx+GRID1_nFirstRecordOnPage) ;
            if ( ( AV18W_B402_SD05_IMPORT_CSV_LIST.size() >= AV32GXV1 ) && ( AV32GXV1 > 0 ) )
            {
               AV18W_B402_SD05_IMPORT_CSV_LIST.currentItem( ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)) );
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt16_import_no_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtltbt16_import_no_Internalname), ".", ",") > 9999999999L ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLTBT16_IMPORT_NO");
                  GX_FocusControl = edtavCtltbt16_import_no_Internalname ;
                  wbErr = true ;
                  ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no( 0 );
               }
               else
               {
                  ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no( localUtil.ctol( httpContext.cgiGet( edtavCtltbt16_import_no_Internalname), ".", ",") );
               }
               ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm( httpContext.cgiGet( edtavCtltbt16_import_file_nm_Internalname) );
               if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtltbt16_import_datetime_Internalname), (byte)(0), (byte)(0)) == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CTLTBT16_IMPORT_DATETIME");
                  GX_FocusControl = edtavCtltbt16_import_datetime_Internalname ;
                  wbErr = true ;
                  ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime( GXutil.nullDate() );
               }
               else
               {
                  ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime( localUtil.ctot( httpContext.cgiGet( edtavCtltbt16_import_datetime_Internalname)) );
               }
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0174") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0174", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0174") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0174", "");
            }
            if ( (GXutil.strcmp("", AV9D_UPLOAD_FILE)==0) )
            {
               GXCCtl = "vD_UPLOAD_FILE_" + sGXsfl_156_fel_idx ;
               GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
               AV9D_UPLOAD_FILE = httpContext.cgiGet( GXCCtlgxBlob) ;
            }
            AV18W_B402_SD05_IMPORT_CSV_LIST.currentItem( ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)) );
         }
         if ( nGXsfl_156_fel_idx == 0 )
         {
            nGXsfl_156_idx = (short)(1) ;
            sGXsfl_156_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_156_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1562( ) ;
         }
         nGXsfl_156_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         if ( (GXutil.strcmp("", AV9D_UPLOAD_FILE)==0) )
         {
            GXCCtlgxBlob = "vD_UPLOAD_FILE" + "_gxBlob" ;
            AV9D_UPLOAD_FILE = httpContext.cgiGet( GXCCtlgxBlob) ;
         }
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e271C2 */
      e271C2 ();
      if (returnInSub) return;
   }

   public void e271C2( )
   {
      /* Start Routine */
      AV6C_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      if ( AV13P_RUN_DIV == 1 )
      {
         AV7C_GAMEN_TITLE = "マッピング済部品取込" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7C_GAMEN_TITLE", AV7C_GAMEN_TITLE);
      }
      else if ( AV13P_RUN_DIV == 2 )
      {
         AV7C_GAMEN_TITLE = "選択肢一覧取込" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7C_GAMEN_TITLE", AV7C_GAMEN_TITLE);
      }
      Form.setCaption( AV7C_GAMEN_TITLE );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption());
      AV20W_DATETIME = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20W_DATETIME", localUtil.ttoc( AV20W_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      GXt_char1 = AV26W_FILE_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV15W_A_LOGIN_SDT, "", "CSV_UPLOAD_PATH", GXv_char2) ;
      b402_wp09_import_csv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26W_FILE_PATH = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26W_FILE_PATH", AV26W_FILE_PATH);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV11H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblText_onclick_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      edtavD_original_name_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_original_name_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavD_original_name_Visible, 5, 0)));
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV15W_A_LOGIN_SDT,AV6C_APP_ID,AV7C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0174",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e281C2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV11H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV37Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      AV11H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      edtavD_upload_file_Display = (short)(2) ;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
   }

   private void e291C2( )
   {
      /* Grid1_Load Routine */
      AV32GXV1 = (short)(1) ;
      while ( AV32GXV1 <= AV18W_B402_SD05_IMPORT_CSV_LIST.size() )
      {
         AV18W_B402_SD05_IMPORT_CSV_LIST.currentItem( ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18W_B402_SD05_IMPORT_CSV_LIST", AV18W_B402_SD05_IMPORT_CSV_LIST);
         lblTxt_btn_csv_download_Visible = 0 ;
         if ( GXutil.strcmp(((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)(AV18W_B402_SD05_IMPORT_CSV_LIST.currentItem())).getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg(), "0") == 0 )
         {
            lblTxt_btn_csv_download_Visible = 1 ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(156) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1562( ) ;
            GRID1_nEOF = (byte)(0) ;
            if ( GRID1_nCurrentRecord + 1 >= subgrid1_recordcount( ) )
            {
               GRID1_nEOF = (byte)(1) ;
            }
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         AV32GXV1 = (short)(AV32GXV1+1) ;
      }
   }

   public void e111C2( )
   {
      /* 'BTN_UPLOAD' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV12H_KNGN_FLG, "") )
      {
         if ( (GXutil.strcmp("", AV9D_UPLOAD_FILE)==0) )
         {
            GXt_char1 = AV28W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "CSVファイル", "", "", "", "", GXv_char2) ;
            b402_wp09_import_csv_impl.this.GXt_char1 = GXv_char2[0] ;
            AV28W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
         }
         else
         {
            /* Execute user subroutine: S192 */
            S192 ();
            if (returnInSub) return;
            if ( ( AV13P_RUN_DIV == 2 ) && ( AV21W_ERR_CD == 0 ) )
            {
               /* Execute user subroutine: S202 */
               S202 ();
               if (returnInSub) return;
               if ( AV21W_ERR_CD == 0 )
               {
                  new b402_pc24_import_csv_del(remoteHandle, context).execute( ) ;
               }
            }
            if ( AV21W_ERR_CD == 0 )
            {
               Application.commit(context, remoteHandle, "DEFAULT", "b402_wp09_import_csv");
               /* Execute user subroutine: S152 */
               S152 ();
               if (returnInSub) return;
               GXt_char1 = AV28W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00015", "", "", "", "", "", GXv_char2) ;
               b402_wp09_import_csv_impl.this.GXt_char1 = GXv_char2[0] ;
               AV28W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
               httpContext.GX_msglist.addItem(AV28W_MSG);
            }
            else
            {
               Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp09_import_csv");
               AV24W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24W_ERRFLG", AV24W_ERRFLG);
            }
         }
      }
   }

   public void e121C2( )
   {
      /* 'BTN_CAN' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp07_crf_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp07_crf_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e301C2( )
   {
      /* 'BTN_DOWNLOAD' Routine */
      AV25W_FILE_NAME = ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)(AV18W_B402_SD05_IMPORT_CSV_LIST.currentItem())).getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25W_FILE_NAME", AV25W_FILE_NAME);
      AV27W_IMPORT_FILE_NAME = ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)(AV18W_B402_SD05_IMPORT_CSV_LIST.currentItem())).getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27W_IMPORT_FILE_NAME", AV27W_IMPORT_FILE_NAME);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "aa811_pc02_download_dialog"+GXutil.URLEncode(GXutil.rtrim(AV26W_FILE_PATH)) + "," + GXutil.URLEncode(GXutil.rtrim(AV25W_FILE_NAME)) + "," + GXutil.URLEncode(GXutil.rtrim(AV27W_IMPORT_FILE_NAME)) ;
      httpContext.wjLoc = formatLink("aa811_pc02_download_dialog") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(0) ;
   }

   public void S162( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
   }

   public void S142( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S152( )
   {
      /* 'SUB_SRCH' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV18W_B402_SD05_IMPORT_CSV_LIST.clear();
      gx_BV156 = true ;
      /* Using cursor H001C2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A190TBT16_IMPORT_NO = H001C2_A190TBT16_IMPORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
         A839TBT16_FILE_NM = H001C2_A839TBT16_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TBT16_FILE_NM", A839TBT16_FILE_NM);
         n839TBT16_FILE_NM = H001C2_n839TBT16_FILE_NM[0] ;
         A838TBT16_IMPORT_FILE_NM = H001C2_A838TBT16_IMPORT_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A838TBT16_IMPORT_FILE_NM", A838TBT16_IMPORT_FILE_NM);
         n838TBT16_IMPORT_FILE_NM = H001C2_n838TBT16_IMPORT_FILE_NM[0] ;
         A841TBT16_DEL_FLG = H001C2_A841TBT16_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TBT16_DEL_FLG", A841TBT16_DEL_FLG);
         n841TBT16_DEL_FLG = H001C2_n841TBT16_DEL_FLG[0] ;
         A840TBT16_IMPORT_DATETIME = H001C2_A840TBT16_IMPORT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TBT16_IMPORT_DATETIME", localUtil.ttoc( A840TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n840TBT16_IMPORT_DATETIME = H001C2_n840TBT16_IMPORT_DATETIME[0] ;
         AV19W_B402_SD05_IMPORT_CSV_LIST_Item = (SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)new SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem(remoteHandle, context);
         AV19W_B402_SD05_IMPORT_CSV_LIST_Item.setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no( A190TBT16_IMPORT_NO );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_B402_SD05_IMPORT_CSV_LIST_Item", AV19W_B402_SD05_IMPORT_CSV_LIST_Item);
         AV19W_B402_SD05_IMPORT_CSV_LIST_Item.setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm( A839TBT16_FILE_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_B402_SD05_IMPORT_CSV_LIST_Item", AV19W_B402_SD05_IMPORT_CSV_LIST_Item);
         AV19W_B402_SD05_IMPORT_CSV_LIST_Item.setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm( A838TBT16_IMPORT_FILE_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_B402_SD05_IMPORT_CSV_LIST_Item", AV19W_B402_SD05_IMPORT_CSV_LIST_Item);
         AV19W_B402_SD05_IMPORT_CSV_LIST_Item.setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime( A840TBT16_IMPORT_DATETIME );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_B402_SD05_IMPORT_CSV_LIST_Item", AV19W_B402_SD05_IMPORT_CSV_LIST_Item);
         AV19W_B402_SD05_IMPORT_CSV_LIST_Item.setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg( A841TBT16_DEL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_B402_SD05_IMPORT_CSV_LIST_Item", AV19W_B402_SD05_IMPORT_CSV_LIST_Item);
         AV18W_B402_SD05_IMPORT_CSV_LIST.add(AV19W_B402_SD05_IMPORT_CSV_LIST_Item, 0);
         gx_BV156 = true ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S192( )
   {
      /* 'SUB_UPLOAD' Routine */
      if ( AV13P_RUN_DIV == 1 )
      {
         GXv_int3[0] = AV21W_ERR_CD ;
         GXv_objcol_svchar4[0] = AV22W_ERR_MSG ;
         new b402_pc17_map_item_mst_reg(remoteHandle, context).execute( AV14P_STUDY_ID, AV9D_UPLOAD_FILE, AV29D_MOJI_CD, GXv_int3, GXv_objcol_svchar4) ;
         b402_wp09_import_csv_impl.this.AV21W_ERR_CD = GXv_int3[0] ;
         AV22W_ERR_MSG = GXv_objcol_svchar4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPLOAD_FILE", AV9D_UPLOAD_FILE);
         httpContext.ajax_rsp_assign_attri("", false, "AV29D_MOJI_CD", AV29D_MOJI_CD);
         httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERR_CD", GXutil.ltrim( GXutil.str( AV21W_ERR_CD, 4, 0)));
      }
      else if ( AV13P_RUN_DIV == 2 )
      {
         GXv_char2[0] = AV25W_FILE_NAME ;
         GXv_int3[0] = AV21W_ERR_CD ;
         GXv_objcol_svchar4[0] = AV22W_ERR_MSG ;
         new b402_pc18_sel_list_mst_reg(remoteHandle, context).execute( AV14P_STUDY_ID, AV9D_UPLOAD_FILE, AV29D_MOJI_CD, GXv_char2, GXv_int3, GXv_objcol_svchar4) ;
         b402_wp09_import_csv_impl.this.AV25W_FILE_NAME = GXv_char2[0] ;
         b402_wp09_import_csv_impl.this.AV21W_ERR_CD = GXv_int3[0] ;
         AV22W_ERR_MSG = GXv_objcol_svchar4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPLOAD_FILE", AV9D_UPLOAD_FILE);
         httpContext.ajax_rsp_assign_attri("", false, "AV29D_MOJI_CD", AV29D_MOJI_CD);
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_FILE_NAME", AV25W_FILE_NAME);
         httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERR_CD", GXutil.ltrim( GXutil.str( AV21W_ERR_CD, 4, 0)));
      }
      if ( AV21W_ERR_CD != 0 )
      {
         AV39GXV6 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39GXV6", GXutil.ltrim( GXutil.str( AV39GXV6, 8, 0)));
         while ( AV39GXV6 <= AV22W_ERR_MSG.size() )
         {
            AV28W_MSG = (String)AV22W_ERR_MSG.elementAt(-1+AV39GXV6) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
            httpContext.GX_msglist.addItem(AV28W_MSG);
            AV39GXV6 = (int)(AV39GXV6+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39GXV6", GXutil.ltrim( GXutil.str( AV39GXV6, 8, 0)));
         }
      }
   }

   public void S202( )
   {
      /* 'SUB_REKI_REG' Routine */
      AV5BC_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm( AV8D_ORIGINAL_NAME );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMPORT_HISTORY", AV5BC_IMPORT_HISTORY);
      AV5BC_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm( AV25W_FILE_NAME );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMPORT_HISTORY", AV5BC_IMPORT_HISTORY);
      AV5BC_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime( AV20W_DATETIME );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMPORT_HISTORY", AV5BC_IMPORT_HISTORY);
      AV5BC_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg( "0" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMPORT_HISTORY", AV5BC_IMPORT_HISTORY);
      AV5BC_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm( AV37Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMPORT_HISTORY", AV5BC_IMPORT_HISTORY);
      AV5BC_IMPORT_HISTORY.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm( AV37Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_IMPORT_HISTORY", AV5BC_IMPORT_HISTORY);
      AV5BC_IMPORT_HISTORY.Save();
      if ( AV5BC_IMPORT_HISTORY.Success() )
      {
      }
      else
      {
         GXt_char1 = AV28W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV5BC_IMPORT_HISTORY.GetMessages(), (byte)(0), GXv_char2) ;
         b402_wp09_import_csv_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28W_MSG", AV28W_MSG);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV15W_A_LOGIN_SDT;
      GXv_char2[0] = AV23W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV15W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b402_wp09_import_csv_impl.this.AV23W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRCD", AV23W_ERRCD);
      if ( GXutil.strcmp(AV23W_ERRCD, "0") != 0 )
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
      /* 'SUB_CLER' Routine */
      AV17W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17W_A821_JS", AV17W_A821_JS);
      AV16W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16W_A819_JS", AV16W_A819_JS);
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
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
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function proc() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"ST_CLICK_SPACE();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      if ( ! (GXutil.strcmp("", AV17W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV17W_A821_JS ;
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
      if ( ! (GXutil.strcmp("", AV16W_A819_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV16W_A819_JS ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      }
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	var upFile = document.getElementById('"+edtavD_upload_file_Internalname+"');" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	if (upFile.addEventListener) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"		upFile.addEventListener('focus', function(){upFileBlur();}, false);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	} else if (window.attachEvent) {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"		upFile.attachEvent('onfocus',function(){upFileBlur();});" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	upFileBlur();" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"timerID = setTimeout('proc()', 10);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"function upFileBlur() {" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"	setTimeout('document.getElementById(\\'"+edtavD_upload_file_Internalname+"\\').blur()',300);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblTxt_js_event_Caption = lblTxt_js_event_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      lblText_onclick_Caption = "<script language=\"javascript\">" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"function func_copyParams(){" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"var _filename = MAINFORM."+edtavD_upload_file_Internalname+".value;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"MAINFORM."+edtavD_original_name_Internalname+".value = _filename.substring(_filename.lastIndexOf('\\\\')+1, _filename.length);" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"return true;" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"}" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblText_onclick_Caption = lblText_onclick_Caption+"</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblText_onclick_Internalname, "Caption", lblText_onclick_Caption);
      lblTxt_btn_upload_Jsonclick = "func_copyParams()" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upload_Internalname, "Jsonclick", lblTxt_btn_upload_Jsonclick);
   }

   public void S132( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV12H_KNGN_FLG ;
      GXv_char6[0] = AV23W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_APP_ID, GXv_char2, GXv_char6) ;
      b402_wp09_import_csv_impl.this.AV12H_KNGN_FLG = GXv_char2[0] ;
      b402_wp09_import_csv_impl.this.AV23W_ERRCD = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_APP_ID", AV6C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV23W_ERRCD", AV23W_ERRCD);
      if ( GXutil.strcmp(AV23W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S232( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV37Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp09_import_csv");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e131C2( )
   {
      /* 'PAGE_FIRST' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e141C2( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      else
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e151C2( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e161C2( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e171C2( )
   {
      /* 'PAGE01' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e181C2( )
   {
      /* 'PAGE02' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e191C2( )
   {
      /* 'PAGE03' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201C2( )
   {
      /* 'PAGE04' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e211C2( )
   {
      /* 'PAGE05' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e221C2( )
   {
      /* 'PAGE06' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231C2( )
   {
      /* 'PAGE07' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241C2( )
   {
      /* 'PAGE08' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251C2( )
   {
      /* 'PAGE09' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261C2( )
   {
      /* 'PAGE10' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      AV10H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10H_A_PAGING_SDT", AV10H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT7[0] = AV10H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT7) ;
      AV10H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT7[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_Visible, 5, 0)));
      lblTxt_page01_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      lblTxt_page02_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      lblTxt_page03_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      lblTxt_page04_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      lblTxt_page05_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      lblTxt_page06_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      lblTxt_page07_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      lblTxt_page08_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      lblTxt_page09_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      lblTxt_page10_Class = "TextBlockPage" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S212( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      GXt_boolean8 = false ;
      GXv_boolean9[0] = GXt_boolean8 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV12H_KNGN_FLG, "", GXv_boolean9) ;
      b402_wp09_import_csv_impl.this.GXt_boolean8 = GXv_boolean9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
      lblTxt_btn_upload_Visible = (GXt_boolean8 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_upload_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_upload_Visible, 5, 0)));
   }

   public void S222( )
   {
      /* 'SUB_FORM_EDIT' Routine */
      if ( AV13P_RUN_DIV == 2 )
      {
         tblTable4_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTable4_Visible, 5, 0)));
      }
      else
      {
         tblTable4_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTable4_Visible, 5, 0)));
      }
   }

   public void wb_table2_176_1C2( boolean wbgen )
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
         httpContext.writeText( "<p>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblText_onclick_Internalname, lblText_onclick_Caption, "", "", lblText_onclick_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'" + sGXsfl_156_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV11H_INIT_FLG), GXutil.rtrim( localUtil.format( AV11H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_156_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV12H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV12H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 30, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</p>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_156_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(183);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_176_1C2e( true) ;
      }
      else
      {
         wb_table2_176_1C2e( false) ;
      }
   }

   public void wb_table1_2_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table3_6_1C2( true) ;
      }
      else
      {
         wb_table3_6_1C2( false) ;
      }
      return  ;
   }

   public void wb_table3_6_1C2e( boolean wbgen )
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
         wb_table1_2_1C2e( true) ;
      }
      else
      {
         wb_table1_2_1C2e( false) ;
      }
   }

   public void wb_table3_6_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
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
         wb_table4_12_1C2( true) ;
      }
      else
      {
         wb_table4_12_1C2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table5_20_1C2( true) ;
      }
      else
      {
         wb_table5_20_1C2( false) ;
      }
      return  ;
   }

   public void wb_table5_20_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0174"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0174"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0174"+"");
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
         wb_table3_6_1C2e( true) ;
      }
      else
      {
         wb_table3_6_1C2e( false) ;
      }
   }

   public void wb_table5_20_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 279, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 843, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:46px;width:850px\">") ;
         wb_table6_23_1C2( true) ;
      }
      else
      {
         wb_table6_23_1C2( false) ;
      }
      return  ;
   }

   public void wb_table6_23_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_156_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_original_name_Internalname, GXutil.rtrim( AV8D_ORIGINAL_NAME), GXutil.rtrim( localUtil.format( AV8D_ORIGINAL_NAME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_original_name_Jsonclick, 0, "Attribute", "", "", "", edtavD_original_name_Visible, edtavD_original_name_Enabled, 0, "text", "", 220, "px", 15, "px", 200, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table7_42_1C2( true) ;
      }
      else
      {
         wb_table7_42_1C2( false) ;
      }
      return  ;
   }

   public void wb_table7_42_1C2e( boolean wbgen )
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
         wb_table5_20_1C2e( true) ;
      }
      else
      {
         wb_table5_20_1C2e( false) ;
      }
   }

   public void wb_table7_42_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTable4_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom;height:20px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "【取込履歴】", "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockPTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_50_1C2( true) ;
      }
      else
      {
         wb_table8_50_1C2( false) ;
      }
      return  ;
   }

   public void wb_table8_50_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table9_145_1C2( true) ;
      }
      else
      {
         wb_table9_145_1C2( false) ;
      }
      return  ;
   }

   public void wb_table9_145_1C2e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"156\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridBase", 0, "", "", 0, 0, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridBase"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridBase");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt16_import_no_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt16_import_file_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltbt16_import_datetime_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_btn_csv_download_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 156 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_156 = (short)(nGXsfl_156_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV32GXV1 = nGXsfl_156_idx ;
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
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_42_1C2e( true) ;
      }
      else
      {
         wb_table7_42_1C2e( false) ;
      }
   }

   public void wb_table9_145_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 27, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "No.", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "ファイル名", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "取込日時", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_145_1C2e( true) ;
      }
      else
      {
         wb_table9_145_1C2e( false) ;
      }
   }

   public void wb_table8_50_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page_area_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page_area_Internalname, tblTbl_page_area_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_56_1C2( true) ;
      }
      else
      {
         wb_table10_56_1C2( false) ;
      }
      return  ;
   }

   public void wb_table10_56_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_50_1C2e( true) ;
      }
      else
      {
         wb_table8_50_1C2e( false) ;
      }
   }

   public void wb_table10_56_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page_Internalname, tblTbl_page_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table11_59_1C2( true) ;
      }
      else
      {
         wb_table11_59_1C2( false) ;
      }
      return  ;
   }

   public void wb_table11_59_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_65_1C2( true) ;
      }
      else
      {
         wb_table12_65_1C2( false) ;
      }
      return  ;
   }

   public void wb_table12_65_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_71_1C2( true) ;
      }
      else
      {
         wb_table13_71_1C2( false) ;
      }
      return  ;
   }

   public void wb_table13_71_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_77_1C2( true) ;
      }
      else
      {
         wb_table14_77_1C2( false) ;
      }
      return  ;
   }

   public void wb_table14_77_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_83_1C2( true) ;
      }
      else
      {
         wb_table15_83_1C2( false) ;
      }
      return  ;
   }

   public void wb_table15_83_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_89_1C2( true) ;
      }
      else
      {
         wb_table16_89_1C2( false) ;
      }
      return  ;
   }

   public void wb_table16_89_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_95_1C2( true) ;
      }
      else
      {
         wb_table17_95_1C2( false) ;
      }
      return  ;
   }

   public void wb_table17_95_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_101_1C2( true) ;
      }
      else
      {
         wb_table18_101_1C2( false) ;
      }
      return  ;
   }

   public void wb_table18_101_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_107_1C2( true) ;
      }
      else
      {
         wb_table19_107_1C2( false) ;
      }
      return  ;
   }

   public void wb_table19_107_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_113_1C2( true) ;
      }
      else
      {
         wb_table20_113_1C2( false) ;
      }
      return  ;
   }

   public void wb_table20_113_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_119_1C2( true) ;
      }
      else
      {
         wb_table21_119_1C2( false) ;
      }
      return  ;
   }

   public void wb_table21_119_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_125_1C2( true) ;
      }
      else
      {
         wb_table22_125_1C2( false) ;
      }
      return  ;
   }

   public void wb_table22_125_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_131_1C2( true) ;
      }
      else
      {
         wb_table23_131_1C2( false) ;
      }
      return  ;
   }

   public void wb_table23_131_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_137_1C2( true) ;
      }
      else
      {
         wb_table24_137_1C2( false) ;
      }
      return  ;
   }

   public void wb_table24_137_1C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_56_1C2e( true) ;
      }
      else
      {
         wb_table10_56_1C2e( false) ;
      }
   }

   public void wb_table24_137_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_last_Internalname, tblTbl_last_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:52px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_137_1C2e( true) ;
      }
      else
      {
         wb_table24_137_1C2e( false) ;
      }
   }

   public void wb_table23_131_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_next_Internalname, tblTbl_next_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:42px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_131_1C2e( true) ;
      }
      else
      {
         wb_table23_131_1C2e( false) ;
      }
   }

   public void wb_table22_125_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page10_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page10_Internalname, tblTbl_page10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_125_1C2e( true) ;
      }
      else
      {
         wb_table22_125_1C2e( false) ;
      }
   }

   public void wb_table21_119_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page09_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page09_Internalname, tblTbl_page09_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_119_1C2e( true) ;
      }
      else
      {
         wb_table21_119_1C2e( false) ;
      }
   }

   public void wb_table20_113_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page08_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page08_Internalname, tblTbl_page08_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_113_1C2e( true) ;
      }
      else
      {
         wb_table20_113_1C2e( false) ;
      }
   }

   public void wb_table19_107_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page07_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page07_Internalname, tblTbl_page07_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_107_1C2e( true) ;
      }
      else
      {
         wb_table19_107_1C2e( false) ;
      }
   }

   public void wb_table18_101_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page06_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page06_Internalname, tblTbl_page06_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_101_1C2e( true) ;
      }
      else
      {
         wb_table18_101_1C2e( false) ;
      }
   }

   public void wb_table17_95_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page05_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page05_Internalname, tblTbl_page05_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_95_1C2e( true) ;
      }
      else
      {
         wb_table17_95_1C2e( false) ;
      }
   }

   public void wb_table16_89_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page04_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page04_Internalname, tblTbl_page04_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_89_1C2e( true) ;
      }
      else
      {
         wb_table16_89_1C2e( false) ;
      }
   }

   public void wb_table15_83_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page03_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page03_Internalname, tblTbl_page03_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_83_1C2e( true) ;
      }
      else
      {
         wb_table15_83_1C2e( false) ;
      }
   }

   public void wb_table14_77_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page02_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page02_Internalname, tblTbl_page02_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_77_1C2e( true) ;
      }
      else
      {
         wb_table14_77_1C2e( false) ;
      }
   }

   public void wb_table13_71_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page01_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_page01_Internalname, tblTbl_page01_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:29px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_71_1C2e( true) ;
      }
      else
      {
         wb_table13_71_1C2e( false) ;
      }
   }

   public void wb_table12_65_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 42, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_back_Internalname, tblTbl_back_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_65_1C2e( true) ;
      }
      else
      {
         wb_table12_65_1C2e( false) ;
      }
   }

   public void wb_table11_59_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 52, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_first_Internalname, tblTbl_first_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_59_1C2e( true) ;
      }
      else
      {
         wb_table11_59_1C2e( false) ;
      }
   }

   public void wb_table6_23_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:110px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "CSVファイル", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         ClassString = "Image" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_156_idx + "',0)\"" ;
         edtavD_upload_file_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "Filetype", edtavD_upload_file_Filetype);
         if ( ! (GXutil.strcmp("", AV9D_UPLOAD_FILE)==0) )
         {
            gxblobfileaux.setSource( AV9D_UPLOAD_FILE );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavD_upload_file_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavD_upload_file_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV9D_UPLOAD_FILE = gxblobfileaux.getAbsoluteName() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9D_UPLOAD_FILE", AV9D_UPLOAD_FILE);
               edtavD_upload_file_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "Filetype", edtavD_upload_file_Filetype);
               gxblobfileaux.setBlobToDelete();
            }
         }
         GxWebStd.gx_blob_field( httpContext, edtavD_upload_file_Internalname, GXutil.rtrim( AV9D_UPLOAD_FILE), httpContext.getResourceRelative(AV9D_UPLOAD_FILE), ((GXutil.strcmp("", edtavD_upload_file_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavD_upload_file_Filetype)==0) ? AV9D_UPLOAD_FILE : edtavD_upload_file_Filetype)) : edtavD_upload_file_Contenttype), false, "", edtavD_upload_file_Parameters, edtavD_upload_file_Display, 1, 1, "", "", 0, 0, 300, "px", 16, "px", 0, 0, 0, edtavD_upload_file_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(28);\"", "", "", "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.ajax_rsp_assign_prop("", false, edtavD_upload_file_Internalname, "URL", httpContext.getResourceRelative(AV9D_UPLOAD_FILE));
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "ファイル文字コード", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_156_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_moji_cd, cmbavD_moji_cd.getInternalname(), GXutil.rtrim( AV29D_MOJI_CD), 1, cmbavD_moji_cd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 20, "chr", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(33);\"", "", true, "HLP_B402_WP09_IMPORT_CSV.htm");
         cmbavD_moji_cd.setValue( GXutil.rtrim( AV29D_MOJI_CD) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_moji_cd.getInternalname(), "Values", cmbavD_moji_cd.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_23_1C2e( true) ;
      }
      else
      {
         wb_table6_23_1C2e( false) ;
      }
   }

   public void wb_table4_12_1C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_upload_Internalname, "アップロード（F3）", "", "", lblTxt_btn_upload_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPLOAD\\'."+"'", "", "TextBlockBtnList120", 5, "", lblTxt_btn_upload_Visible, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_can_Internalname, "戻る（F11）", "", "", lblTxt_btn_can_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B402_WP09_IMPORT_CSV.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_1C2e( true) ;
      }
      else
      {
         wb_table4_12_1C2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV13P_RUN_DIV = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13P_RUN_DIV", GXutil.ltrim( GXutil.str( AV13P_RUN_DIV, 4, 0)));
      AV14P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_STUDY_ID", GXutil.ltrim( GXutil.str( AV14P_STUDY_ID, 10, 0)));
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
      pa1C2( ) ;
      ws1C2( ) ;
      we1C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513244826");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp09_import_csv.js", "?202071513244828");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1562( )
   {
      edtavCtltbt16_import_no_Internalname = "CTLTBT16_IMPORT_NO_"+sGXsfl_156_idx ;
      edtavCtltbt16_import_file_nm_Internalname = "CTLTBT16_IMPORT_FILE_NM_"+sGXsfl_156_idx ;
      edtavCtltbt16_import_datetime_Internalname = "CTLTBT16_IMPORT_DATETIME_"+sGXsfl_156_idx ;
      lblTxt_btn_csv_download_Internalname = "TXT_BTN_CSV_DOWNLOAD_"+sGXsfl_156_idx ;
   }

   public void subsflControlProps_fel_1562( )
   {
      edtavCtltbt16_import_no_Internalname = "CTLTBT16_IMPORT_NO_"+sGXsfl_156_fel_idx ;
      edtavCtltbt16_import_file_nm_Internalname = "CTLTBT16_IMPORT_FILE_NM_"+sGXsfl_156_fel_idx ;
      edtavCtltbt16_import_datetime_Internalname = "CTLTBT16_IMPORT_DATETIME_"+sGXsfl_156_fel_idx ;
      lblTxt_btn_csv_download_Internalname = "TXT_BTN_CSV_DOWNLOAD_"+sGXsfl_156_fel_idx ;
   }

   public void sendrow_1562( )
   {
      subsflControlProps_1562( ) ;
      wb1C0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_156_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_156_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_156_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_156_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_156_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_156_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"vertical-align:top\""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grid_Internalname+"_"+sGXsfl_156_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"height:36px;width:45px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbt16_import_no_Internalname,GXutil.ltrim( localUtil.ntoc( ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no(), (byte)(10), (byte)(0), ".", "")),((edtavCtltbt16_import_no_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no()), "ZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbt16_import_no_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbt16_import_no_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(156),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:300px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbt16_import_file_nm_Internalname,GXutil.rtrim( ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbt16_import_file_nm_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbt16_import_file_nm_Enabled),new Integer(0),"text","",new Integer(280),"px",new Integer(1),"row",new Integer(200),new Integer(0),new Integer(0),new Integer(156),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:200px\""});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltbt16_import_datetime_Internalname,localUtil.format(((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime(), "9999/99/99 99:99:99"),localUtil.format( ((SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)AV18W_B402_SD05_IMPORT_CSV_LIST.elementAt(-1+AV32GXV1)).getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime(), "9999/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltbt16_import_datetime_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavCtltbt16_import_datetime_Enabled),new Integer(0),"text","",new Integer(19),"chr",new Integer(1),"row",new Integer(19),new Integer(0),new Integer(0),new Integer(156),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:200px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_btn_csv_download_Internalname,"CSVダウンロード","","",lblTxt_btn_csv_download_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_DOWNLOAD\\'."+sGXsfl_156_idx+"'","","TextBlockBtn150",new Integer(5),"",new Integer(lblTxt_btn_csv_download_Visible),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("row");
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("table");
         }
         /* End of table */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("row");
         }
         GXCCtl = "vD_UPLOAD_FILE_" + sGXsfl_156_idx ;
         GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
         GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, GXutil.rtrim( AV9D_UPLOAD_FILE));
         /* End of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( 1 > 0 )
            {
               if ( ((int)((nGXsfl_156_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_156_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_156_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_156_idx+1)) ;
         sGXsfl_156_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_156_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1562( ) ;
      }
      /* End function sendrow_1562 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_upload_Internalname = "TXT_BTN_UPLOAD" ;
      lblTxt_btn_can_Internalname = "TXT_BTN_CAN" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtavD_upload_file_Internalname = "vD_UPLOAD_FILE" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      cmbavD_moji_cd.setInternalname( "vD_MOJI_CD" );
      tblTable10_Internalname = "TABLE10" ;
      edtavD_original_name_Internalname = "vD_ORIGINAL_NAME" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      lblTxt_rec_cnt_Internalname = "TXT_REC_CNT" ;
      lblTxt_first_Internalname = "TXT_FIRST" ;
      tblTbl_first_Internalname = "TBL_FIRST" ;
      lblTxt_back_Internalname = "TXT_BACK" ;
      tblTbl_back_Internalname = "TBL_BACK" ;
      lblTxt_page01_Internalname = "TXT_PAGE01" ;
      tblTbl_page01_Internalname = "TBL_PAGE01" ;
      lblTxt_page02_Internalname = "TXT_PAGE02" ;
      tblTbl_page02_Internalname = "TBL_PAGE02" ;
      lblTxt_page03_Internalname = "TXT_PAGE03" ;
      tblTbl_page03_Internalname = "TBL_PAGE03" ;
      lblTxt_page04_Internalname = "TXT_PAGE04" ;
      tblTbl_page04_Internalname = "TBL_PAGE04" ;
      lblTxt_page05_Internalname = "TXT_PAGE05" ;
      tblTbl_page05_Internalname = "TBL_PAGE05" ;
      lblTxt_page06_Internalname = "TXT_PAGE06" ;
      tblTbl_page06_Internalname = "TBL_PAGE06" ;
      lblTxt_page07_Internalname = "TXT_PAGE07" ;
      tblTbl_page07_Internalname = "TBL_PAGE07" ;
      lblTxt_page08_Internalname = "TXT_PAGE08" ;
      tblTbl_page08_Internalname = "TBL_PAGE08" ;
      lblTxt_page09_Internalname = "TXT_PAGE09" ;
      tblTbl_page09_Internalname = "TBL_PAGE09" ;
      lblTxt_page10_Internalname = "TXT_PAGE10" ;
      tblTbl_page10_Internalname = "TBL_PAGE10" ;
      lblTxt_next_Internalname = "TXT_NEXT" ;
      tblTbl_next_Internalname = "TBL_NEXT" ;
      lblTxt_last_Internalname = "TXT_LAST" ;
      tblTbl_last_Internalname = "TBL_LAST" ;
      tblTbl_page_Internalname = "TBL_PAGE" ;
      tblTbl_page_area_Internalname = "TBL_PAGE_AREA" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTbl_grid_Internalname = "TBL_GRID" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      lblText_onclick_Internalname = "TEXT_ONCLICK" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      lblTxt_btn_csv_download_Visible = 1 ;
      edtavCtltbt16_import_datetime_Jsonclick = "" ;
      edtavCtltbt16_import_file_nm_Jsonclick = "" ;
      edtavCtltbt16_import_no_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGridBase" ;
      lblTxt_btn_upload_Visible = 1 ;
      cmbavD_moji_cd.setJsonclick( "" );
      edtavD_upload_file_Jsonclick = "" ;
      edtavD_upload_file_Parameters = "" ;
      edtavD_upload_file_Contenttype = "text/csv" ;
      edtavD_upload_file_Filetype = "" ;
      edtavD_upload_file_Display = (short)(0) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTxt_btn_csv_download_Caption = "CSVダウンロード" ;
      edtavCtltbt16_import_datetime_Enabled = 0 ;
      edtavCtltbt16_import_file_nm_Enabled = 0 ;
      edtavCtltbt16_import_no_Enabled = 0 ;
      edtavD_original_name_Jsonclick = "" ;
      edtavD_original_name_Enabled = 1 ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblText_onclick_Jsonclick = "" ;
      tblTable4_Visible = 1 ;
      lblTxt_rec_cnt_Caption = "(全100件)" ;
      tblTbl_page_area_Visible = 1 ;
      lblTxt_last_Class = "TextBlockPage" ;
      lblTxt_first_Class = "TextBlockPage" ;
      lblTxt_next_Class = "TextBlockPage" ;
      lblTxt_back_Class = "TextBlockPage" ;
      lblTxt_page10_Class = "TextBlockPage" ;
      lblTxt_page09_Class = "TextBlockPage" ;
      lblTxt_page08_Class = "TextBlockPage" ;
      lblTxt_page07_Class = "TextBlockPage" ;
      lblTxt_page06_Class = "TextBlockPage" ;
      lblTxt_page05_Class = "TextBlockPage" ;
      lblTxt_page04_Class = "TextBlockPage" ;
      lblTxt_page03_Class = "TextBlockPage" ;
      lblTxt_page02_Class = "TextBlockPage" ;
      lblTxt_page01_Class = "TextBlockPage" ;
      tblTbl_page_Visible = 1 ;
      tblTbl_page10_Visible = 1 ;
      tblTbl_page09_Visible = 1 ;
      tblTbl_page08_Visible = 1 ;
      tblTbl_page07_Visible = 1 ;
      tblTbl_page06_Visible = 1 ;
      tblTbl_page05_Visible = 1 ;
      tblTbl_page04_Visible = 1 ;
      tblTbl_page03_Visible = 1 ;
      tblTbl_page02_Visible = 1 ;
      tblTbl_page01_Visible = 1 ;
      lblTxt_page10_Caption = "10" ;
      lblTxt_page09_Caption = "9" ;
      lblTxt_page08_Caption = "8" ;
      lblTxt_page07_Caption = "7" ;
      lblTxt_page06_Caption = "6" ;
      lblTxt_page05_Caption = "5" ;
      lblTxt_page04_Caption = "4" ;
      lblTxt_page03_Caption = "3" ;
      lblTxt_page02_Caption = "2" ;
      lblTxt_page01_Caption = "1" ;
      edtavD_original_name_Visible = 1 ;
      lblText_onclick_Caption = "Text_onclick" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      subGrid1_Rows = 10 ;
      Form.setCaption( "CSV取込画面" );
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
                  /* Execute user subroutine: S232 */
                  S232 ();
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
      AV18W_B402_SD05_IMPORT_CSV_LIST = new GxObjectCollection(SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem.class, "B402_SD05_IMPORT_CSV_LIST.B402_SD05_IMPORT_CSV_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV10H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV37Pgmname = "" ;
      AV6C_APP_ID = "" ;
      A840TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A839TBT16_FILE_NM = "" ;
      A838TBT16_IMPORT_FILE_NM = "" ;
      A841TBT16_DEL_FLG = "" ;
      AV17W_A821_JS = "" ;
      AV16W_A819_JS = "" ;
      GXCCtlgxBlob = "" ;
      AV9D_UPLOAD_FILE = "" ;
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
      edtavCtltbt16_import_no_Internalname = "" ;
      edtavCtltbt16_import_file_nm_Internalname = "" ;
      edtavCtltbt16_import_datetime_Internalname = "" ;
      GXCCtl = "" ;
      GXDecQS = "" ;
      AV29D_MOJI_CD = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV8D_ORIGINAL_NAME = "" ;
      AV11H_INIT_FLG = "" ;
      AV12H_KNGN_FLG = "" ;
      AV7C_GAMEN_TITLE = "" ;
      AV20W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV26W_FILE_PATH = "" ;
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV28W_MSG = "" ;
      AV25W_FILE_NAME = "" ;
      AV27W_IMPORT_FILE_NAME = "" ;
      scmdbuf = "" ;
      H001C2_A190TBT16_IMPORT_NO = new long[1] ;
      H001C2_A839TBT16_FILE_NM = new String[] {""} ;
      H001C2_n839TBT16_FILE_NM = new boolean[] {false} ;
      H001C2_A838TBT16_IMPORT_FILE_NM = new String[] {""} ;
      H001C2_n838TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      H001C2_A841TBT16_DEL_FLG = new String[] {""} ;
      H001C2_n841TBT16_DEL_FLG = new boolean[] {false} ;
      H001C2_A840TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      H001C2_n840TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      AV19W_B402_SD05_IMPORT_CSV_LIST_Item = new SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem(remoteHandle, context);
      AV22W_ERR_MSG = new GxObjectCollection(String.class, "internal", "");
      GXv_int3 = new short [1] ;
      GXv_objcol_svchar4 = new GxObjectCollection [1] ;
      AV5BC_IMPORT_HISTORY = new SdtTBT16_IMPORT_HISTORY(remoteHandle);
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV23W_ERRCD = "" ;
      lblTxt_btn_upload_Jsonclick = "" ;
      GXv_char2 = new String [1] ;
      GXv_char6 = new String [1] ;
      GXv_SdtA_PAGING_SDT7 = new SdtA_PAGING_SDT [1] ;
      GXv_boolean9 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock30_Jsonclick = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock18_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTxt_rec_cnt_Jsonclick = "" ;
      lblTxt_last_Jsonclick = "" ;
      lblTxt_next_Jsonclick = "" ;
      lblTxt_page10_Jsonclick = "" ;
      lblTxt_page09_Jsonclick = "" ;
      lblTxt_page08_Jsonclick = "" ;
      lblTxt_page07_Jsonclick = "" ;
      lblTxt_page06_Jsonclick = "" ;
      lblTxt_page05_Jsonclick = "" ;
      lblTxt_page04_Jsonclick = "" ;
      lblTxt_page03_Jsonclick = "" ;
      lblTxt_page02_Jsonclick = "" ;
      lblTxt_page01_Jsonclick = "" ;
      lblTxt_back_Jsonclick = "" ;
      lblTxt_first_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      lblTextblock31_Jsonclick = "" ;
      lblTxt_btn_can_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblTxt_btn_csv_download_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      lblTxt_btn_csv_download_Jsonclick = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp09_import_csv__default(),
         new Object[] {
             new Object[] {
            H001C2_A190TBT16_IMPORT_NO, H001C2_A839TBT16_FILE_NM, H001C2_n839TBT16_FILE_NM, H001C2_A838TBT16_IMPORT_FILE_NM, H001C2_n838TBT16_IMPORT_FILE_NM, H001C2_A841TBT16_DEL_FLG, H001C2_n841TBT16_DEL_FLG, H001C2_A840TBT16_IMPORT_DATETIME, H001C2_n840TBT16_IMPORT_DATETIME
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV37Pgmname = "B402_WP09_IMPORT_CSV" ;
      /* GeneXus formulas. */
      AV37Pgmname = "B402_WP09_IMPORT_CSV" ;
      Gx_err = (short)(0) ;
      edtavCtltbt16_import_no_Enabled = 0 ;
      edtavCtltbt16_import_file_nm_Enabled = 0 ;
      edtavCtltbt16_import_datetime_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short wcpOAV13P_RUN_DIV ;
   private short nRC_GXsfl_156 ;
   private short nGXsfl_156_idx=1 ;
   private short AV13P_RUN_DIV ;
   private short wbEnd ;
   private short wbStart ;
   private short AV32GXV1 ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_156_Refreshing=0 ;
   private short Gx_err ;
   private short nGXsfl_156_fel_idx=1 ;
   private short edtavD_upload_file_Display ;
   private short AV21W_ERR_CD ;
   private short GXv_int3[] ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int edtavCtltbt16_import_no_Enabled ;
   private int edtavCtltbt16_import_file_nm_Enabled ;
   private int edtavCtltbt16_import_datetime_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtavD_original_name_Visible ;
   private int lblTxt_btn_csv_download_Visible ;
   private int AV39GXV6 ;
   private int GXActiveErrHndl ;
   private int tblTbl_page01_Visible ;
   private int tblTbl_page02_Visible ;
   private int tblTbl_page03_Visible ;
   private int tblTbl_page04_Visible ;
   private int tblTbl_page05_Visible ;
   private int tblTbl_page06_Visible ;
   private int tblTbl_page07_Visible ;
   private int tblTbl_page08_Visible ;
   private int tblTbl_page09_Visible ;
   private int tblTbl_page10_Visible ;
   private int tblTbl_page_Visible ;
   private int tblTbl_page_area_Visible ;
   private int lblTxt_btn_upload_Visible ;
   private int tblTable4_Visible ;
   private int edtavD_original_name_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private long wcpOAV14P_STUDY_ID ;
   private long AV14P_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long A190TBT16_IMPORT_NO ;
   private long GRID1_nRecordCount ;
   private long GRID1_nCurrentRecord ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_156_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV37Pgmname ;
   private String GXCCtlgxBlob ;
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
   private String edtavCtltbt16_import_no_Internalname ;
   private String edtavCtltbt16_import_file_nm_Internalname ;
   private String edtavCtltbt16_import_datetime_Internalname ;
   private String GXCCtl ;
   private String GXDecQS ;
   private String edtavD_upload_file_Internalname ;
   private String edtavD_original_name_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String sGXsfl_156_fel_idx="0001" ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblText_onclick_Caption ;
   private String lblText_onclick_Internalname ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String lblTxt_btn_upload_Jsonclick ;
   private String lblTxt_btn_upload_Internalname ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String lblTxt_page01_Caption ;
   private String lblTxt_page01_Internalname ;
   private String lblTxt_page02_Caption ;
   private String lblTxt_page02_Internalname ;
   private String lblTxt_page03_Caption ;
   private String lblTxt_page03_Internalname ;
   private String lblTxt_page04_Caption ;
   private String lblTxt_page04_Internalname ;
   private String lblTxt_page05_Caption ;
   private String lblTxt_page05_Internalname ;
   private String lblTxt_page06_Caption ;
   private String lblTxt_page06_Internalname ;
   private String lblTxt_page07_Caption ;
   private String lblTxt_page07_Internalname ;
   private String lblTxt_page08_Caption ;
   private String lblTxt_page08_Internalname ;
   private String lblTxt_page09_Caption ;
   private String lblTxt_page09_Internalname ;
   private String lblTxt_page10_Caption ;
   private String lblTxt_page10_Internalname ;
   private String tblTbl_page01_Internalname ;
   private String tblTbl_page02_Internalname ;
   private String tblTbl_page03_Internalname ;
   private String tblTbl_page04_Internalname ;
   private String tblTbl_page05_Internalname ;
   private String tblTbl_page06_Internalname ;
   private String tblTbl_page07_Internalname ;
   private String tblTbl_page08_Internalname ;
   private String tblTbl_page09_Internalname ;
   private String tblTbl_page10_Internalname ;
   private String tblTbl_page_Internalname ;
   private String lblTxt_page01_Class ;
   private String lblTxt_page02_Class ;
   private String lblTxt_page03_Class ;
   private String lblTxt_page04_Class ;
   private String lblTxt_page05_Class ;
   private String lblTxt_page06_Class ;
   private String lblTxt_page07_Class ;
   private String lblTxt_page08_Class ;
   private String lblTxt_page09_Class ;
   private String lblTxt_page10_Class ;
   private String lblTxt_back_Class ;
   private String lblTxt_back_Internalname ;
   private String lblTxt_next_Class ;
   private String lblTxt_next_Internalname ;
   private String lblTxt_first_Class ;
   private String lblTxt_first_Internalname ;
   private String lblTxt_last_Class ;
   private String lblTxt_last_Internalname ;
   private String tblTbl_page_area_Internalname ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String tblTable4_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String lblText_onclick_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String edtavD_original_name_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String subGrid1_Internalname ;
   private String lblTxt_btn_csv_download_Caption ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTxt_rec_cnt_Jsonclick ;
   private String tblTbl_last_Internalname ;
   private String lblTxt_last_Jsonclick ;
   private String tblTbl_next_Internalname ;
   private String lblTxt_next_Jsonclick ;
   private String lblTxt_page10_Jsonclick ;
   private String lblTxt_page09_Jsonclick ;
   private String lblTxt_page08_Jsonclick ;
   private String lblTxt_page07_Jsonclick ;
   private String lblTxt_page06_Jsonclick ;
   private String lblTxt_page05_Jsonclick ;
   private String lblTxt_page04_Jsonclick ;
   private String lblTxt_page03_Jsonclick ;
   private String lblTxt_page02_Jsonclick ;
   private String lblTxt_page01_Jsonclick ;
   private String tblTbl_back_Internalname ;
   private String lblTxt_back_Jsonclick ;
   private String tblTbl_first_Internalname ;
   private String lblTxt_first_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtavD_upload_file_Filetype ;
   private String edtavD_upload_file_Contenttype ;
   private String edtavD_upload_file_Parameters ;
   private String edtavD_upload_file_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_can_Internalname ;
   private String lblTxt_btn_can_Jsonclick ;
   private String lblTxt_btn_csv_download_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_Internalname ;
   private String ROClassString ;
   private String edtavCtltbt16_import_no_Jsonclick ;
   private String edtavCtltbt16_import_file_nm_Jsonclick ;
   private String edtavCtltbt16_import_datetime_Jsonclick ;
   private String lblTxt_btn_csv_download_Jsonclick ;
   private String Gx_emsg ;
   private java.util.Date A840TBT16_IMPORT_DATETIME ;
   private java.util.Date AV20W_DATETIME ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV24W_ERRFLG ;
   private boolean gx_BV156 ;
   private boolean n839TBT16_FILE_NM ;
   private boolean n838TBT16_IMPORT_FILE_NM ;
   private boolean n841TBT16_DEL_FLG ;
   private boolean n840TBT16_IMPORT_DATETIME ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean9[] ;
   private String AV9D_UPLOAD_FILE ;
   private String AV6C_APP_ID ;
   private String A839TBT16_FILE_NM ;
   private String A838TBT16_IMPORT_FILE_NM ;
   private String A841TBT16_DEL_FLG ;
   private String AV17W_A821_JS ;
   private String AV16W_A819_JS ;
   private String AV29D_MOJI_CD ;
   private String AV8D_ORIGINAL_NAME ;
   private String AV11H_INIT_FLG ;
   private String AV12H_KNGN_FLG ;
   private String AV7C_GAMEN_TITLE ;
   private String AV26W_FILE_PATH ;
   private String AV28W_MSG ;
   private String AV25W_FILE_NAME ;
   private String AV27W_IMPORT_FILE_NAME ;
   private String AV23W_ERRCD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private SdtTBT16_IMPORT_HISTORY AV5BC_IMPORT_HISTORY ;
   private HTMLChoice cmbavD_moji_cd ;
   private IDataStoreProvider pr_default ;
   private long[] H001C2_A190TBT16_IMPORT_NO ;
   private String[] H001C2_A839TBT16_FILE_NM ;
   private boolean[] H001C2_n839TBT16_FILE_NM ;
   private String[] H001C2_A838TBT16_IMPORT_FILE_NM ;
   private boolean[] H001C2_n838TBT16_IMPORT_FILE_NM ;
   private String[] H001C2_A841TBT16_DEL_FLG ;
   private boolean[] H001C2_n841TBT16_DEL_FLG ;
   private java.util.Date[] H001C2_A840TBT16_IMPORT_DATETIME ;
   private boolean[] H001C2_n840TBT16_IMPORT_DATETIME ;
   private GxObjectCollection AV18W_B402_SD05_IMPORT_CSV_LIST ;
   private GxObjectCollection AV22W_ERR_MSG ;
   private GxObjectCollection GXv_objcol_svchar4[] ;
   private SdtA_PAGING_SDT AV10H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT7[] ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem AV19W_B402_SD05_IMPORT_CSV_LIST_Item ;
}

final  class b402_wp09_import_csv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001C2", "SELECT `TBT16_IMPORT_NO`, `TBT16_FILE_NM`, `TBT16_IMPORT_FILE_NM`, `TBT16_DEL_FLG`, `TBT16_IMPORT_DATETIME` FROM `TBT16_IMPORT_HISTORY` ORDER BY `TBT16_IMPORT_DATETIME` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

