/*
               File: a212_wp01_cdisc_item_list_impl
        Description: �h���C���ϐ��}�X�^�����e�i���X�i�ꗗ�j
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:14.98
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a212_wp01_cdisc_item_list_impl extends GXWebPanel
{
   public a212_wp01_cdisc_item_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a212_wp01_cdisc_item_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a212_wp01_cdisc_item_list_impl.class ));
   }

   public a212_wp01_cdisc_item_list_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavD_dom_cd = new HTMLChoice();
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
            nRC_GXsfl_201 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_201_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_201_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_201, nGXsfl_201_idx, sGXsfl_201_idx) ;
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
            AV26P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26P_MOVE_KBN", GXutil.str( AV26P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV27P_MOVE_KBN_2 = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27P_MOVE_KBN_2", GXutil.str( AV27P_MOVE_KBN_2, 1, 0));
               AV25P_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25P_DOM_CD", AV25P_DOM_CD);
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
         pa1W2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1W2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1W2( ) ;
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
      httpContext.writeValue( "�h���C���ϐ��}�X�^�����e�i���X�i�ꗗ�j") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513301529");
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
      GXEncryptionTmp = "a212_wp01_cdisc_item_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV27P_MOVE_KBN_2,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV25P_DOM_CD)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a212_wp01_cdisc_item_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1W2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV17H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV17H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_201", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_201, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV53Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vC_TAM02_APP_ID", GXutil.rtrim( AV6C_TAM02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_TAM02_APP_ID", GetHash( "", String.valueOf(AV6C_TAM02_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV26P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN_2", GXutil.ltrim( localUtil.ntoc( AV27P_MOVE_KBN_2, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_DOM_CD", GXutil.rtrim( AV25P_DOM_CD));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "TBM02_DOM_CD", GXutil.rtrim( A49TBM02_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM02_DOM_JNM", GXutil.rtrim( A611TBM02_DOM_JNM));
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV30W_A821_JS));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSD_A212_SD01_LIST_C", AV44SD_A212_SD01_LIST_C);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSD_A212_SD01_LIST_C", AV44SD_A212_SD01_LIST_C);
      }
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV34W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "TBM03_DOM_CD", GXutil.rtrim( A59TBM03_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "TBM03_DOM_VAR_NM", GXutil.rtrim( A60TBM03_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "TBM03_VAR_DESC", GXutil.rtrim( A346TBM03_VAR_DESC));
      GxWebStd.gx_hidden_field( httpContext, "TBM03_ORDER", GXutil.ltrim( localUtil.ntoc( A61TBM03_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM03_VERSION", GXutil.rtrim( A932TBM03_VERSION));
      GxWebStd.gx_hidden_field( httpContext, "TBM03_DEL_FLG", GXutil.rtrim( A359TBM03_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
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
      return "A212_WP01_CDISC_ITEM_LIST" ;
   }

   public String getPgmdesc( )
   {
      return "�h���C���ϐ��}�X�^�����e�i���X�i�ꗗ�j" ;
   }

   public void wb1W0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1W2( true) ;
      }
      else
      {
         wb_table1_2_1W2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_225_1W2( true) ;
      }
      else
      {
         wb_table2_225_1W2( false) ;
      }
      return  ;
   }

   public void wb_table2_225_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start1W2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "�h���C���ϐ��}�X�^�����e�i���X�i�ꗗ�j", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0223") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0223", "");
         }
      }
      wbErr = false ;
      strup1W0( ) ;
   }

   public void ws1W2( )
   {
      start1W2( ) ;
      evt1W2( ) ;
   }

   public void evt1W2( )
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
                        /* Execute user event: e111W2 */
                        e111W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CSV'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e121W2 */
                        e121W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_SRCH'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e131W2 */
                        e131W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e141W2 */
                        e141W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_EDIT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e151W2 */
                        e151W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_IMPORT_CDISC_ITEM'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e161W2 */
                        e161W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_DOMAIN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e171W2 */
                        e171W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e181W2 */
                        e181W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e191W2 */
                        e191W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e201W2 */
                        e201W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e211W2 */
                        e211W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e221W2 */
                        e221W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e231W2 */
                        e231W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e241W2 */
                        e241W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e251W2 */
                        e251W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e261W2 */
                        e261W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e271W2 */
                        e271W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e281W2 */
                        e281W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e291W2 */
                        e291W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e301W2 */
                        e301W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e311W2 */
                        e311W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT01_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e321W2 */
                        e321W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT01_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e331W2 */
                        e331W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT02_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e341W2 */
                        e341W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT02_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e351W2 */
                        e351W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT03_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e361W2 */
                        e361W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT03_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e371W2 */
                        e371W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT04_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e381W2 */
                        e381W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT04_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e391W2 */
                        e391W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT05_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e401W2 */
                        e401W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT05_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e411W2 */
                        e411W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT06_ASC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e421W2 */
                        e421W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SORT06_DESC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e431W2 */
                        e431W2 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'BTN_SEL'") == 0 ) )
                     {
                        nGXsfl_201_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_201_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_201_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_2012( ) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",") > 9999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_LINE");
                           GX_FocusControl = edtavD_grd_line_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV11D_GRD_LINE = (short)(0) ;
                        }
                        else
                        {
                           AV11D_GRD_LINE = (short)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_line_Internalname), ".", ",")) ;
                        }
                        AV39D_GRD_DOM_CD = httpContext.cgiGet( edtavD_grd_dom_cd_Internalname) ;
                        AV40D_GRD_DOM_VAR_NM = httpContext.cgiGet( edtavD_grd_dom_var_nm_Internalname) ;
                        AV41D_GRD_VAR_DESC = httpContext.cgiGet( edtavD_grd_var_desc_Internalname) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_order_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavD_grd_order_Internalname), ".", ",") > 99999 ) ) )
                        {
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vD_GRD_ORDER");
                           GX_FocusControl = edtavD_grd_order_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           AV42D_GRD_ORDER = 0 ;
                        }
                        else
                        {
                           AV42D_GRD_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtavD_grd_order_Internalname), ".", ",")) ;
                        }
                        AV43D_GRD_VERSION = httpContext.cgiGet( edtavD_grd_version_Internalname) ;
                        AV10D_GRD_DEL = httpContext.cgiGet( edtavD_grd_del_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0223") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0223", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0223") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0223", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e441W2 */
                              e441W2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e451W2 */
                              e451W2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e461W2 */
                              e461W2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_SEL'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e471W2 */
                              e471W2 ();
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
                  else if ( nCmpId == 223 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0223") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0223", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we1W2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1W2( ) ;
         }
      }
   }

   public void pa1W2( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "a212_wp01_cdisc_item_list")), "a212_wp01_cdisc_item_list") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "a212_wp01_cdisc_item_list"))) ;
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
                  AV26P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26P_MOVE_KBN", GXutil.str( AV26P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV27P_MOVE_KBN_2 = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27P_MOVE_KBN_2", GXutil.str( AV27P_MOVE_KBN_2, 1, 0));
                     AV25P_DOM_CD = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV25P_DOM_CD", AV25P_DOM_CD);
                  }
               }
            }
         }
         cmbavD_dom_cd.setName( "vD_DOM_CD" );
         cmbavD_dom_cd.setWebtags( "" );
         if ( cmbavD_dom_cd.getItemCount() > 0 )
         {
            AV7D_DOM_CD = cmbavD_dom_cd.getValidValue(AV7D_DOM_CD) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_201 ,
                                 short nGXsfl_201_idx ,
                                 String sGXsfl_201_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_2012( ) ;
      while ( nGXsfl_201_idx <= nRC_GXsfl_201 )
      {
         sendrow_2012( ) ;
         nGXsfl_201_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_201_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_201_idx+1)) ;
         sGXsfl_201_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_201_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_2012( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf1W2( ) ;
      /* End function Refresh */
   }

   public void rf1W2( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1"));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      wbStart = (short)(201) ;
      nGXsfl_201_idx = (short)(1) ;
      sGXsfl_201_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_201_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2012( ) ;
      nGXsfl_201_Refreshing = (short)(1) ;
      /* Execute user event: e451W2 */
      e451W2 ();
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
         subsflControlProps_2012( ) ;
         /* Execute user event: e461W2 */
         e461W2 ();
         wbEnd = (short)(201) ;
         wb1W0( ) ;
      }
      nGXsfl_201_Refreshing = (short)(0) ;
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
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
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
      subGrid1_Islastpage = 1 ;
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

   public void strup1W0( )
   {
      /* Before Start, stand alone formulas. */
      AV53Pgmname = "A212_WP01_CDISC_ITEM_LIST" ;
      AV52Pgmdesc = "�h���C���ϐ��}�X�^�����e�i���X�i�ꗗ�j" ;
      Gx_err = (short)(0) ;
      edtavD_grd_line_Enabled = 0 ;
      edtavD_grd_dom_cd_Enabled = 0 ;
      edtavD_grd_dom_var_nm_Enabled = 0 ;
      edtavD_grd_var_desc_Enabled = 0 ;
      edtavD_grd_order_Enabled = 0 ;
      edtavD_grd_version_Enabled = 0 ;
      edtavD_grd_del_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e441W2 */
      e441W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV17H_A_PAGING_SDT);
         /* Read variables values. */
         cmbavD_dom_cd.setName( cmbavD_dom_cd.getInternalname() );
         cmbavD_dom_cd.setValue( httpContext.cgiGet( cmbavD_dom_cd.getInternalname()) );
         AV7D_DOM_CD = httpContext.cgiGet( cmbavD_dom_cd.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         AV9D_DOM_VAR_NM = httpContext.cgiGet( edtavD_dom_var_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
         AV16D_VAR_DESC = httpContext.cgiGet( edtavD_var_desc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16D_VAR_DESC", AV16D_VAR_DESC);
         AV14D_LINE = httpContext.cgiGet( edtavD_line_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14D_LINE", AV14D_LINE);
         AV20H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
         AV23H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23H_SRCH_FLG", AV23H_SRCH_FLG);
         AV21H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
         AV18H_DOM_CD = httpContext.cgiGet( edtavH_dom_cd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
         AV19H_DOM_VAR_NM = httpContext.cgiGet( edtavH_dom_var_nm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
         AV24H_VAR_DESC = httpContext.cgiGet( edtavH_var_desc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
         AV22H_SORT = httpContext.cgiGet( edtavH_sort_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22H_SORT", AV22H_SORT);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLMAX_ROW");
            GX_FocusControl = edtavCtlmax_row_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(0) );
         }
         else
         {
            AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(localUtil.ctol( httpContext.cgiGet( edtavCtlmax_row_Internalname), ".", ",")) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_asdc_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_asdc_kbn_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SORT_ASDC_KBN");
            GX_FocusControl = edtavH_sort_asdc_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47H_SORT_ASDC_KBN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV47H_SORT_ASDC_KBN, 4, 0)));
         }
         else
         {
            AV47H_SORT_ASDC_KBN = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_sort_asdc_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV47H_SORT_ASDC_KBN, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_item_kbn_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavH_sort_item_kbn_Internalname), ".", ",") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vH_SORT_ITEM_KBN");
            GX_FocusControl = edtavH_sort_item_kbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48H_SORT_ITEM_KBN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
         }
         else
         {
            AV48H_SORT_ITEM_KBN = (short)(localUtil.ctol( httpContext.cgiGet( edtavH_sort_item_kbn_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_201 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_201"), ".", ",")) ;
         AV26P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV27P_MOVE_KBN_2 = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN_2"), ".", ",")) ;
         AV25P_DOM_CD = httpContext.cgiGet( "vP_DOM_CD") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0223") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0223", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
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
      /* Execute user event: e441W2 */
      e441W2 ();
      if (returnInSub) return;
   }

   public void e441W2( )
   {
      /* Start Routine */
      AV6C_TAM02_APP_ID = "A212" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_TAM02_APP_ID", AV6C_TAM02_APP_ID);
      AV5C_GAMEN_TITLE = AV52Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_GAMEN_TITLE", AV5C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV20H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV28W_A_LOGIN_SDT,AV6C_TAM02_APP_ID,AV5C_GAMEN_TITLE,""});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0223",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
   }

   public void e451W2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV20H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV53Pgmname, "INFO", "��ʋN��") ;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      AV20H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20H_INIT_FLG", AV20H_INIT_FLG);
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: S172 */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: S182 */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: S192 */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: S202 */
      S202 ();
      if (returnInSub) return;
   }

   private void e461W2( )
   {
      /* Grid1_Load Routine */
      AV54GXV2 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GXV2", GXutil.ltrim( GXutil.str( AV54GXV2, 8, 0)));
      while ( AV54GXV2 <= AV44SD_A212_SD01_LIST_C.size() )
      {
         AV45SD_A212_SD01_LIST_I = (SdtA212_SD01_LIST_A212_SD01_LISTItem)((SdtA212_SD01_LIST_A212_SD01_LISTItem)AV44SD_A212_SD01_LIST_C.elementAt(-1+AV54GXV2));
         AV11D_GRD_LINE = (short)(AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no()) ;
         AV39D_GRD_DOM_CD = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd() ;
         AV40D_GRD_DOM_VAR_NM = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm() ;
         AV41D_GRD_VAR_DESC = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc() ;
         AV42D_GRD_ORDER = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order() ;
         AV43D_GRD_VERSION = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version() ;
         if ( GXutil.strcmp(AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg(), "0") == 0 )
         {
            AV10D_GRD_DEL = "���p�\" ;
         }
         else if ( GXutil.strcmp(AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg(), "1") == 0 )
         {
            AV10D_GRD_DEL = "���p�s��" ;
         }
         else
         {
            AV10D_GRD_DEL = "" ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(201) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_2012( ) ;
            GRID1_nEOF = (byte)(1) ;
            if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
            {
               GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
            }
         }
         if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
         {
            GRID1_nEOF = (byte)(0) ;
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         AV54GXV2 = (int)(AV54GXV2+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54GXV2", GXutil.ltrim( GXutil.str( AV54GXV2, 8, 0)));
      }
   }

   public void e111W2( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV21H_KNGN_FLG, "") )
      {
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a213_wp01_cdisc_item_mst"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18H_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim("")) ;
         httpContext.wjLoc = formatLink("a213_wp01_cdisc_item_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e121W2( )
   {
      /* 'BTN_CSV' Routine */
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV37W_RTN_MSG)==0) )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "aa212_pc01_cdisc_item_csv"+GXutil.URLEncode(GXutil.rtrim(AV18H_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV19H_DOM_VAR_NM)) + "," + GXutil.URLEncode(GXutil.rtrim(AV24H_VAR_DESC)) + "," + GXutil.URLEncode(GXutil.rtrim(AV37W_RTN_MSG)) ;
         httpContext.wjLoc = formatLink("aa212_pc01_cdisc_item_csv") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(0) ;
         if ( ! (GXutil.strcmp("", AV37W_RTN_MSG)==0) )
         {
            httpContext.GX_msglist.addItem(AV37W_RTN_MSG);
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(AV37W_RTN_MSG);
      }
   }

   public void e131W2( )
   {
      /* 'BTN_SRCH' Routine */
      AV34W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34W_ERRFLG", AV34W_ERRFLG);
      /* Execute user subroutine: S232 */
      S232 ();
      if (returnInSub) return;
      if ( ! AV34W_ERRFLG )
      {
         AV23H_SRCH_FLG = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23H_SRCH_FLG", AV23H_SRCH_FLG);
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S252 */
         S252 ();
         if (returnInSub) return;
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
   }

   public void e141W2( )
   {
      /* 'BTN_CLER' Routine */
      AV48H_SORT_ITEM_KBN = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      AV47H_SORT_ASDC_KBN = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV47H_SORT_ASDC_KBN, 4, 0)));
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: S262 */
      S262 ();
      if (returnInSub) return;
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
   }

   public void e151W2( )
   {
      /* 'BTN_EDIT' Routine */
      if ( AV44SD_A212_SD01_LIST_C.size() > 0 )
      {
         GXt_char1 = AV36W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00028", "", "", "", "", "", GXv_char2) ;
         a212_wp01_cdisc_item_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36W_MSG", AV36W_MSG);
         if ( new a807_pc01_cha_num_check(remoteHandle, context).executeUdp( AV14D_LINE) == 1 )
         {
            AV55GXV3 = 1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55GXV3", GXutil.ltrim( GXutil.str( AV55GXV3, 8, 0)));
            while ( AV55GXV3 <= AV44SD_A212_SD01_LIST_C.size() )
            {
               AV45SD_A212_SD01_LIST_I = (SdtA212_SD01_LIST_A212_SD01_LISTItem)((SdtA212_SD01_LIST_A212_SD01_LISTItem)AV44SD_A212_SD01_LIST_C.elementAt(-1+AV55GXV3));
               if ( AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no() == GXutil.val( AV14D_LINE, ".") )
               {
                  AV31W_DOM_CD = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV31W_DOM_CD", AV31W_DOM_CD);
                  AV32W_DOM_VAR_NM = AV45SD_A212_SD01_LIST_I.getgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32W_DOM_VAR_NM", AV32W_DOM_VAR_NM);
                  AV36W_MSG = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV36W_MSG", AV36W_MSG);
                  if (true) break;
               }
               AV55GXV3 = (int)(AV55GXV3+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55GXV3", GXutil.ltrim( GXutil.str( AV55GXV3, 8, 0)));
            }
         }
         if ( (GXutil.strcmp("", AV36W_MSG)==0) )
         {
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "a213_wp01_cdisc_item_mst"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV31W_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV32W_DOM_VAR_NM)) ;
            httpContext.wjLoc = formatLink("a213_wp01_cdisc_item_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV36W_MSG);
            edtavD_line_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_line_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_line_Backcolor, 9, 0)));
            GX_FocusControl = edtavD_line_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
   }

   public void e161W2( )
   {
      /* 'BTN_IMPORT_CDISC_ITEM' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a211_wp01_import_cdisc_item"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV18H_DOM_CD)) ;
      httpContext.wjLoc = formatLink("a211_wp01_import_cdisc_item") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e171W2( )
   {
      /* 'BTN_DOMAIN' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a208_wp01_domain_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) ;
      httpContext.wjLoc = formatLink("a208_wp01_domain_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e471W2( )
   {
      /* 'BTN_SEL' Routine */
      /* Execute user subroutine: S212 */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: S272 */
      S272 ();
      if (returnInSub) return;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a213_wp01_cdisc_item_mst"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV26P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV39D_GRD_DOM_CD)) + "," + GXutil.URLEncode(GXutil.rtrim(AV40D_GRD_DOM_VAR_NM)) ;
      httpContext.wjLoc = formatLink("a213_wp01_cdisc_item_mst") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S152( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      if ( AV26P_MOVE_KBN == 0 )
      {
         GX_FocusControl = cmbavD_dom_cd.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         if ( AV27P_MOVE_KBN_2 == 1 )
         {
            /* Execute user subroutine: S312 */
            S312 ();
            if (returnInSub) return;
            /* Execute user subroutine: S242 */
            S242 ();
            if (returnInSub) return;
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            /* Execute user subroutine: S252 */
            S252 ();
            if (returnInSub) return;
            /* Execute user subroutine: S322 */
            S322 ();
            if (returnInSub) return;
         }
         else
         {
            /* Execute user subroutine: S272 */
            S272 ();
            if (returnInSub) return;
            /* Execute user subroutine: S262 */
            S262 ();
            if (returnInSub) return;
            /* Execute user subroutine: S212 */
            S212 ();
            if (returnInSub) return;
            /* Execute user subroutine: S122 */
            S122 ();
            if (returnInSub) return;
         }
      }
      else
      {
         GX_FocusControl = edtavD_dom_var_nm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         /* Execute user subroutine: S312 */
         S312 ();
         if (returnInSub) return;
         AV7D_DOM_CD = AV25P_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
         /* Execute user subroutine: S242 */
         S242 ();
         if (returnInSub) return;
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         /* Execute user subroutine: S252 */
         S252 ();
         if (returnInSub) return;
         /* Execute user subroutine: S322 */
         S322 ();
         if (returnInSub) return;
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
   }

   public void S162( )
   {
      /* 'SUB_COMBO_EDIT' Routine */
      cmbavD_dom_cd.removeAllItems();
      cmbavD_dom_cd.addItem("", "", (short)(0));
      /* Using cursor H001W2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A611TBM02_DOM_JNM = H001W2_A611TBM02_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A611TBM02_DOM_JNM", A611TBM02_DOM_JNM);
         n611TBM02_DOM_JNM = H001W2_n611TBM02_DOM_JNM[0] ;
         A49TBM02_DOM_CD = H001W2_A49TBM02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
         cmbavD_dom_cd.addItem(A49TBM02_DOM_CD, A49TBM02_DOM_CD+":"+A611TBM02_DOM_JNM, (short)(0));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S212( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV38W_SESSION.setValue("A212_DOM_CD", AV18H_DOM_CD);
      AV38W_SESSION.setValue("A212_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      AV38W_SESSION.setValue("A212_DOM_VAR_DESC", AV24H_VAR_DESC);
      AV38W_SESSION.setValue("A212_SORT_ITEM_KBN", GXutil.trim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      AV38W_SESSION.setValue("A212_SORT_ASDC_KBN", GXutil.trim( GXutil.str( AV47H_SORT_ASDC_KBN, 4, 0)));
      AV38W_SESSION.setValue("A212_PAGE", GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
      AV38W_SESSION.setValue("A212_SRCH_FLG", AV23H_SRCH_FLG);
   }

   public void S312( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV7D_DOM_CD = AV38W_SESSION.getValue("A212_DOM_CD") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV9D_DOM_VAR_NM = AV38W_SESSION.getValue("A212_DOM_VAR_NM") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
      AV16D_VAR_DESC = AV38W_SESSION.getValue("A212_DOM_VAR_DESC") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16D_VAR_DESC", AV16D_VAR_DESC);
      AV48H_SORT_ITEM_KBN = (short)(GXutil.lval( AV38W_SESSION.getValue("A212_SORT_ITEM_KBN"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      AV47H_SORT_ASDC_KBN = (short)(GXutil.lval( AV38W_SESSION.getValue("A212_SORT_ASDC_KBN"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV47H_SORT_ASDC_KBN, 4, 0)));
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV38W_SESSION.getValue("A212_PAGE"))) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      AV23H_SRCH_FLG = AV38W_SESSION.getValue("A212_SRCH_FLG") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23H_SRCH_FLG", AV23H_SRCH_FLG);
   }

   public void S262( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV38W_SESSION.remove("A212_DOM_CD");
      AV38W_SESSION.remove("A212_DOM_VAR_NM");
      AV38W_SESSION.remove("A212_DOM_VAR_DESC");
      AV38W_SESSION.remove("A212_SORT_ITEM_KBN");
      AV38W_SESSION.remove("A212_SORT_ASDC_KBN");
      AV38W_SESSION.remove("A212_PAGE");
      AV38W_SESSION.remove("A212_SRCH_FLG");
   }

   public void S282( )
   {
      /* 'SUB_SDT_SAVE' Routine */
      AV38W_SESSION.setValue("A212_SD01_LIST", AV44SD_A212_SD01_LIST_C.toxml(false, true, "A212_SD01_LIST", "tablet-EDC_GXXEV3U3"));
   }

   public void S132( )
   {
      /* 'SUB_SDT_GET' Routine */
      AV44SD_A212_SD01_LIST_C.fromxml(AV38W_SESSION.getValue("A212_SD01_LIST"), "");
   }

   public void S272( )
   {
      /* 'SUB_SDT_REMOVE' Routine */
      AV38W_SESSION.remove("A212_SD01_LIST");
   }

   public void S242( )
   {
      /* 'SUB_SAVE_CONDITION' Routine */
      AV18H_DOM_CD = AV7D_DOM_CD ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
      AV19H_DOM_VAR_NM = AV9D_DOM_VAR_NM ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      AV24H_VAR_DESC = AV16D_VAR_DESC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
   }

   public void S232( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S332 */
      S332 ();
      if (returnInSub) return;
   }

   public void S252( )
   {
      /* 'SUB_DATA_GET' Routine */
      AV44SD_A212_SD01_LIST_C.clear();
      AV46W_CNT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46W_CNT", GXutil.ltrim( GXutil.str( AV46W_CNT, 10, 0)));
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV18H_DOM_CD ,
                                           AV19H_DOM_VAR_NM ,
                                           AV24H_VAR_DESC ,
                                           A59TBM03_DOM_CD ,
                                           A60TBM03_DOM_VAR_NM ,
                                           A346TBM03_VAR_DESC ,
                                           AV23H_SRCH_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV18H_DOM_CD = GXutil.padr( GXutil.rtrim( AV18H_DOM_CD), 16, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
      lV19H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV19H_DOM_VAR_NM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      lV24H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV24H_VAR_DESC), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
      /* Using cursor H001W3 */
      pr_default.execute(1, new Object[] {AV23H_SRCH_FLG, lV18H_DOM_CD, lV19H_DOM_VAR_NM, lV24H_VAR_DESC});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A346TBM03_VAR_DESC = H001W3_A346TBM03_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBM03_VAR_DESC", A346TBM03_VAR_DESC);
         n346TBM03_VAR_DESC = H001W3_n346TBM03_VAR_DESC[0] ;
         A60TBM03_DOM_VAR_NM = H001W3_A60TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
         A59TBM03_DOM_CD = H001W3_A59TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
         A61TBM03_ORDER = H001W3_A61TBM03_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61TBM03_ORDER", GXutil.ltrim( GXutil.str( A61TBM03_ORDER, 5, 0)));
         n61TBM03_ORDER = H001W3_n61TBM03_ORDER[0] ;
         A932TBM03_VERSION = H001W3_A932TBM03_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A932TBM03_VERSION", A932TBM03_VERSION);
         n932TBM03_VERSION = H001W3_n932TBM03_VERSION[0] ;
         A359TBM03_DEL_FLG = H001W3_A359TBM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A359TBM03_DEL_FLG", A359TBM03_DEL_FLG);
         n359TBM03_DEL_FLG = H001W3_n359TBM03_DEL_FLG[0] ;
         AV46W_CNT = (long)(AV46W_CNT+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46W_CNT", GXutil.ltrim( GXutil.str( AV46W_CNT, 10, 0)));
         AV45SD_A212_SD01_LIST_I = (SdtA212_SD01_LIST_A212_SD01_LISTItem)new SdtA212_SD01_LIST_A212_SD01_LISTItem(remoteHandle, context);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no( AV46W_CNT );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd( A59TBM03_DOM_CD );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm( A60TBM03_DOM_VAR_NM );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc( A346TBM03_VAR_DESC );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order( A61TBM03_ORDER );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version( A932TBM03_VERSION );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg( A359TBM03_DEL_FLG );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV44SD_A212_SD01_LIST_C.add(AV45SD_A212_SD01_LIST_I, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
   }

   public void S332( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavD_line_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_line_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_line_Backcolor, 9, 0)));
   }

   public void S222( )
   {
      /* 'SUB_CSV_CHECK' Routine */
      AV58GXLvl613 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58GXLvl613", GXutil.str( AV58GXLvl613, 1, 0));
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV18H_DOM_CD ,
                                           AV19H_DOM_VAR_NM ,
                                           AV24H_VAR_DESC ,
                                           A59TBM03_DOM_CD ,
                                           A60TBM03_DOM_VAR_NM ,
                                           A346TBM03_VAR_DESC },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV18H_DOM_CD = GXutil.padr( GXutil.rtrim( AV18H_DOM_CD), 16, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
      lV19H_DOM_VAR_NM = GXutil.padr( GXutil.rtrim( AV19H_DOM_VAR_NM), 50, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      lV24H_VAR_DESC = GXutil.padr( GXutil.rtrim( AV24H_VAR_DESC), 100, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
      /* Using cursor H001W4 */
      pr_default.execute(2, new Object[] {lV18H_DOM_CD, lV19H_DOM_VAR_NM, lV24H_VAR_DESC});
      if ( Gx_err != 0 )
      {
         AV58GXLvl613 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58GXLvl613", GXutil.str( AV58GXLvl613, 1, 0));
      }
      while ( (pr_default.getStatus(2) != 101) )
      {
         A346TBM03_VAR_DESC = H001W4_A346TBM03_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBM03_VAR_DESC", A346TBM03_VAR_DESC);
         n346TBM03_VAR_DESC = H001W4_n346TBM03_VAR_DESC[0] ;
         A60TBM03_DOM_VAR_NM = H001W4_A60TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
         A59TBM03_DOM_CD = H001W4_A59TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
         AV58GXLvl613 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58GXLvl613", GXutil.str( AV58GXLvl613, 1, 0));
         AV37W_RTN_MSG = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37W_RTN_MSG", AV37W_RTN_MSG);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV58GXLvl613 == 0 )
      {
         GXt_char1 = AV37W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         a212_wp01_cdisc_item_list_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37W_RTN_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37W_RTN_MSG", AV37W_RTN_MSG);
      }
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV28W_A_LOGIN_SDT;
      GXv_char2[0] = AV33W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV28W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      a212_wp01_cdisc_item_list_impl.this.AV33W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33W_ERRCD", AV33W_ERRCD);
      if ( GXutil.strcmp(AV33W_ERRCD, "0") != 0 )
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
      AV44SD_A212_SD01_LIST_C.clear();
      AV7D_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7D_DOM_CD", AV7D_DOM_CD);
      AV9D_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_DOM_VAR_NM", AV9D_DOM_VAR_NM);
      AV16D_VAR_DESC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16D_VAR_DESC", AV16D_VAR_DESC);
      AV18H_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18H_DOM_CD", AV18H_DOM_CD);
      AV19H_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19H_DOM_VAR_NM", AV19H_DOM_VAR_NM);
      AV24H_VAR_DESC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24H_VAR_DESC", AV24H_VAR_DESC);
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      AV23H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23H_SRCH_FLG", AV23H_SRCH_FLG);
      AV29W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29W_A819_JS", AV29W_A819_JS);
      AV35W_F7FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35W_F7FLG", AV35W_F7FLG);
      AV14D_LINE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14D_LINE", AV14D_LINE);
      /* Execute user subroutine: S332 */
      S332 ();
      if (returnInSub) return;
   }

   public void S182( )
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
      if ( ! (GXutil.strcmp("", AV30W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV30W_A821_JS ;
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

   public void S142( )
   {
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV21H_KNGN_FLG ;
      GXv_char4[0] = AV33W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV6C_TAM02_APP_ID, GXv_char2, GXv_char4) ;
      a212_wp01_cdisc_item_list_impl.this.AV21H_KNGN_FLG = GXv_char2[0] ;
      a212_wp01_cdisc_item_list_impl.this.AV33W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_TAM02_APP_ID", AV6C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV33W_ERRCD", AV33W_ERRCD);
      if ( GXutil.strcmp(AV33W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S342( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV53Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a212_wp01_cdisc_item_list");
   }

   public void e181W2( )
   {
      /* 'PAGE_FIRST' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e191W2( )
   {
      /* 'PAGE_LAST' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e201W2( )
   {
      /* 'PAGE_BACK' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e211W2( )
   {
      /* 'PAGE_NEXT' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e221W2( )
   {
      /* 'PAGE01' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e231W2( )
   {
      /* 'PAGE02' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e241W2( )
   {
      /* 'PAGE03' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e251W2( )
   {
      /* 'PAGE04' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e261W2( )
   {
      /* 'PAGE05' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e271W2( )
   {
      /* 'PAGE06' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e281W2( )
   {
      /* 'PAGE07' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e291W2( )
   {
      /* 'PAGE08' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e301W2( )
   {
      /* 'PAGE09' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e311W2( )
   {
      /* 'PAGE10' Routine */
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( AV44SD_A212_SD01_LIST_C.size() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT5[0] = AV17H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT5) ;
      AV17H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT5[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( AV44SD_A212_SD01_LIST_C.size() <= 0 )
      {
         tblTbl_page_area_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         tblTbl_edit_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_edit_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_edit_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV23H_SRCH_FLG, "1") == 0 ) && ! AV34W_ERRFLG )
         {
            GXt_char1 = AV36W_MSG ;
            GXv_char4[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
            a212_wp01_cdisc_item_list_impl.this.GXt_char1 = GXv_char4[0] ;
            AV36W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36W_MSG", AV36W_MSG);
            httpContext.GX_msglist.addItem(AV36W_MSG);
         }
      }
      else
      {
         tblTbl_page_area_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_page_area_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page_area_Visible, 5, 0)));
         tblTbl_grid_header_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_grid_header_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_grid_header_Visible, 5, 0)));
         tblTbl_edit_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_edit_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_edit_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(�S"+GXutil.trim( GXutil.str( AV44SD_A212_SD01_LIST_C.size(), 10, 0))+"��)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S172( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      lblTxt_btn_reg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      lblTxt_btn_reg2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      GXt_boolean6 = false ;
      GXv_boolean7[0] = GXt_boolean6 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV21H_KNGN_FLG, "", GXv_boolean7) ;
      a212_wp01_cdisc_item_list_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21H_KNGN_FLG", AV21H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean6 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
      if ( ( lblTxt_btn_reg_Visible == ( 0 )) )
      {
         lblTxt_btn_reg2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg2_Visible, 5, 0)));
      }
   }

   public void e321W2( )
   {
      /* 'SORT01_ASC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void e331W2( )
   {
      /* 'SORT01_DESC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S302 */
      S302 ();
      if (returnInSub) return;
   }

   public void e341W2( )
   {
      /* 'SORT02_ASC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void e351W2( )
   {
      /* 'SORT02_DESC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S302 */
      S302 ();
      if (returnInSub) return;
   }

   public void e361W2( )
   {
      /* 'SORT03_ASC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void e371W2( )
   {
      /* 'SORT03_DESC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S302 */
      S302 ();
      if (returnInSub) return;
   }

   public void e381W2( )
   {
      /* 'SORT04_ASC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void e391W2( )
   {
      /* 'SORT04_DESC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S302 */
      S302 ();
      if (returnInSub) return;
   }

   public void e401W2( )
   {
      /* 'SORT05_ASC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void e411W2( )
   {
      /* 'SORT05_DESC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S302 */
      S302 ();
      if (returnInSub) return;
   }

   public void e421W2( )
   {
      /* 'SORT06_ASC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S292 */
      S292 ();
      if (returnInSub) return;
   }

   public void e431W2( )
   {
      /* 'SORT06_DESC' Routine */
      AV48H_SORT_ITEM_KBN = (short)(6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48H_SORT_ITEM_KBN", GXutil.ltrim( GXutil.str( AV48H_SORT_ITEM_KBN, 4, 0)));
      /* Execute user subroutine: S302 */
      S302 ();
      if (returnInSub) return;
   }

   public void S292( )
   {
      /* 'SUB_SORT_AS_RPOC' Routine */
      AV47H_SORT_ASDC_KBN = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV47H_SORT_ASDC_KBN, 4, 0)));
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      /* Execute user subroutine: S322 */
      S322 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void S302( )
   {
      /* 'SUB_SORT_DESC_RPOC' Routine */
      AV47H_SORT_ASDC_KBN = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47H_SORT_ASDC_KBN", GXutil.ltrim( GXutil.str( AV47H_SORT_ASDC_KBN, 4, 0)));
      AV17H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17H_A_PAGING_SDT", AV17H_A_PAGING_SDT);
      /* Execute user subroutine: S322 */
      S322 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
   }

   public void S322( )
   {
      /* 'SUB_SORT_EXEC' Routine */
      /* Execute user subroutine: S132 */
      S132 ();
      if (returnInSub) return;
      if ( ( AV48H_SORT_ITEM_KBN == 1 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("TBM03_DOM_CD");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 1 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("[TBM03_DOM_CD]");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 2 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("TBM03_DOM_VAR_NM");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 2 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("[TBM03_DOM_VAR_NM]");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 3 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("TBM03_VAR_DESC");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 3 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("[TBM03_VAR_DESC]");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 4 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("TBM03_ORDER");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 4 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("[TBM03_ORDER]");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 5 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("TBM03_VERSION");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 5 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("[TBM03_VERSION]");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 6 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("TBM03_DEL_FLG");
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 6 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         AV44SD_A212_SD01_LIST_C.sort("[TBM03_DEL_FLG]");
      }
      else
      {
         AV44SD_A212_SD01_LIST_C.sort("TBM03_DOM_CD,TBM03_DOM_VAR_NM");
      }
      AV46W_CNT = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46W_CNT", GXutil.ltrim( GXutil.str( AV46W_CNT, 10, 0)));
      AV61GXV4 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61GXV4", GXutil.ltrim( GXutil.str( AV61GXV4, 8, 0)));
      while ( AV61GXV4 <= AV44SD_A212_SD01_LIST_C.size() )
      {
         AV45SD_A212_SD01_LIST_I = (SdtA212_SD01_LIST_A212_SD01_LISTItem)((SdtA212_SD01_LIST_A212_SD01_LISTItem)AV44SD_A212_SD01_LIST_C.elementAt(-1+AV61GXV4));
         AV45SD_A212_SD01_LIST_I.setgxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no( AV46W_CNT );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV45SD_A212_SD01_LIST_I", AV45SD_A212_SD01_LIST_I);
         AV46W_CNT = (long)(AV46W_CNT+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46W_CNT", GXutil.ltrim( GXutil.str( AV46W_CNT, 10, 0)));
         AV61GXV4 = (int)(AV61GXV4+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61GXV4", GXutil.ltrim( GXutil.str( AV61GXV4, 8, 0)));
      }
      /* Execute user subroutine: S282 */
      S282 ();
      if (returnInSub) return;
   }

   public void S202( )
   {
      /* 'SUB_EDIT_SORT' Routine */
      lblTxt_sort01_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_asc_Internalname, "Class", lblTxt_sort01_asc_Class);
      lblTxt_sort01_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_desc_Internalname, "Class", lblTxt_sort01_desc_Class);
      lblTxt_sort02_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_asc_Internalname, "Class", lblTxt_sort02_asc_Class);
      lblTxt_sort02_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_desc_Internalname, "Class", lblTxt_sort02_desc_Class);
      lblTxt_sort03_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_asc_Internalname, "Class", lblTxt_sort03_asc_Class);
      lblTxt_sort03_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_desc_Internalname, "Class", lblTxt_sort03_desc_Class);
      lblTxt_sort04_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort04_asc_Internalname, "Class", lblTxt_sort04_asc_Class);
      lblTxt_sort04_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort04_desc_Internalname, "Class", lblTxt_sort04_desc_Class);
      lblTxt_sort05_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort05_asc_Internalname, "Class", lblTxt_sort05_asc_Class);
      lblTxt_sort05_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort05_desc_Internalname, "Class", lblTxt_sort05_desc_Class);
      lblTxt_sort06_asc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort06_asc_Internalname, "Class", lblTxt_sort06_asc_Class);
      lblTxt_sort06_desc_Class = "TextBlockSort" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort06_desc_Internalname, "Class", lblTxt_sort06_desc_Class);
      if ( ( AV48H_SORT_ITEM_KBN == 1 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort01_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_asc_Internalname, "Class", lblTxt_sort01_asc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 1 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort01_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort01_desc_Internalname, "Class", lblTxt_sort01_desc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 2 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort02_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_asc_Internalname, "Class", lblTxt_sort02_asc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 2 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort02_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort02_desc_Internalname, "Class", lblTxt_sort02_desc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 3 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort03_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_asc_Internalname, "Class", lblTxt_sort03_asc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 3 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort03_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort03_desc_Internalname, "Class", lblTxt_sort03_desc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 4 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort04_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort04_asc_Internalname, "Class", lblTxt_sort04_asc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 4 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort04_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort04_desc_Internalname, "Class", lblTxt_sort04_desc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 5 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort05_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort05_asc_Internalname, "Class", lblTxt_sort05_asc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 5 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort05_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort05_desc_Internalname, "Class", lblTxt_sort05_desc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 6 ) && ( AV47H_SORT_ASDC_KBN == 0 ) )
      {
         lblTxt_sort06_asc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort06_asc_Internalname, "Class", lblTxt_sort06_asc_Class);
      }
      else if ( ( AV48H_SORT_ITEM_KBN == 6 ) && ( AV47H_SORT_ASDC_KBN == 1 ) )
      {
         lblTxt_sort06_desc_Class = "TextBlockSortSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_sort06_desc_Internalname, "Class", lblTxt_sort06_desc_Class);
      }
   }

   public void wb_table2_225_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "<br>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV20H_INIT_FLG), GXutil.rtrim( localUtil.format( AV20H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 230,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV23H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV23H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(230);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV21H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV21H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 232,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_cd_Internalname, GXutil.rtrim( AV18H_DOM_CD), GXutil.rtrim( localUtil.format( AV18H_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(232);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_dom_cd_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_dom_var_nm_Internalname, GXutil.rtrim( AV19H_DOM_VAR_NM), GXutil.rtrim( localUtil.format( AV19H_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(233);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_dom_var_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_var_desc_Internalname, GXutil.rtrim( AV24H_VAR_DESC), GXutil.rtrim( localUtil.format( AV24H_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_var_desc_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sort_Internalname, GXutil.rtrim( AV22H_SORT), GXutil.rtrim( localUtil.format( AV22H_SORT, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(235);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sort_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         wb_table3_236_1W2( true) ;
      }
      else
      {
         wb_table3_236_1W2( false) ;
      }
      return  ;
   }

   public void wb_table3_236_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_244_1W2( true) ;
      }
      else
      {
         wb_table4_244_1W2( false) ;
      }
      return  ;
   }

   public void wb_table4_244_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_225_1W2e( true) ;
      }
      else
      {
         wb_table2_225_1W2e( false) ;
      }
   }

   public void wb_table4_244_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 247,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sort_asdc_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV47H_SORT_ASDC_KBN, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47H_SORT_ASDC_KBN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(247);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sort_asdc_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 250,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_sort_item_kbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV48H_SORT_ITEM_KBN, (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48H_SORT_ITEM_KBN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(250);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_sort_item_kbn_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_244_1W2e( true) ;
      }
      else
      {
         wb_table4_244_1W2e( false) ;
      }
   }

   public void wb_table3_236_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "MAX_ROW", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlmax_row_Internalname, GXutil.ltrim( localUtil.ntoc( AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row(), (byte)(4), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row()), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlmax_row_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_236_1W2e( true) ;
      }
      else
      {
         wb_table3_236_1W2e( false) ;
      }
   }

   public void wb_table1_2_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table5_6_1W2( true) ;
      }
      else
      {
         wb_table5_6_1W2( false) ;
      }
      return  ;
   }

   public void wb_table5_6_1W2e( boolean wbgen )
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
         wb_table1_2_1W2e( true) ;
      }
      else
      {
         wb_table1_2_1W2e( false) ;
      }
   }

   public void wb_table5_6_1W2( boolean wbgen )
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
         wb_table6_12_1W2( true) ;
      }
      else
      {
         wb_table6_12_1W2( false) ;
      }
      return  ;
   }

   public void wb_table6_12_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table7_28_1W2( true) ;
      }
      else
      {
         wb_table7_28_1W2( false) ;
      }
      return  ;
   }

   public void wb_table7_28_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0223"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0223"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0223"+"");
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
         wb_table5_6_1W2e( true) ;
      }
      else
      {
         wb_table5_6_1W2e( false) ;
      }
   }

   public void wb_table7_28_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_31_1W2( true) ;
      }
      else
      {
         wb_table8_31_1W2( false) ;
      }
      return  ;
   }

   public void wb_table8_31_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_28_1W2e( true) ;
      }
      else
      {
         wb_table7_28_1W2e( false) ;
      }
   }

   public void wb_table8_31_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table9_34_1W2( true) ;
      }
      else
      {
         wb_table9_34_1W2( false) ;
      }
      return  ;
   }

   public void wb_table9_34_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:20px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table10_61_1W2( true) ;
      }
      else
      {
         wb_table10_61_1W2( false) ;
      }
      return  ;
   }

   public void wb_table10_61_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table11_153_1W2( true) ;
      }
      else
      {
         wb_table11_153_1W2( false) ;
      }
      return  ;
   }

   public void wb_table11_153_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table12_167_1W2( true) ;
      }
      else
      {
         wb_table12_167_1W2( false) ;
      }
      return  ;
   }

   public void wb_table12_167_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         /*  Grid Control  */
         Grid1Container.SetIsFreestyle(true);
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"201\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridTM-1", 0, "", "", 0, 1, sStyleString, "none", 0);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGridTM-1"));
            Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Rules", GXutil.rtrim( "none"));
            Grid1Container.AddObjectProperty("Class", "FreeStyleGridTM-1");
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
            Grid1Column.AddObjectProperty("Value", lblBtn_sel_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV11D_GRD_LINE, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_line_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV39D_GRD_DOM_CD));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_dom_cd_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV40D_GRD_DOM_VAR_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_dom_var_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV41D_GRD_VAR_DESC));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_var_desc_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42D_GRD_ORDER, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_order_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV43D_GRD_VERSION));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_version_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV10D_GRD_DEL));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_del_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 201 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_201 = (short)(nGXsfl_201_idx-1) ;
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_31_1W2e( true) ;
      }
      else
      {
         wb_table8_31_1W2e( false) ;
      }
   }

   public void wb_table12_167_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_grid_header_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table13_170_1W2( true) ;
      }
      else
      {
         wb_table13_170_1W2( false) ;
      }
      return  ;
   }

   public void wb_table13_170_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_167_1W2e( true) ;
      }
      else
      {
         wb_table12_167_1W2e( false) ;
      }
   }

   public void wb_table13_170_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_in_grid_header_Internalname, tblTbl_in_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:50px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "�s", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:160px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, "�h���C���R�[�h", "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort01_desc_Internalname, "��", "", "", lblTxt_sort01_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT01_DESC\\'."+"'", "font-family:'�l�r �o�S�V�b�N'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort01_desc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort01_asc_Internalname, "��", "", "", lblTxt_sort01_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT01_ASC\\'."+"'", "", lblTxt_sort01_asc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:150px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, "�h���C���ϐ���", "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort02_desc_Internalname, "��", "", "", lblTxt_sort02_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT02_DESC\\'."+"'", "font-family:'�l�r �o�S�V�b�N'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort02_desc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort02_asc_Internalname, "��", "", "", lblTxt_sort02_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT02_ASC\\'."+"'", "", lblTxt_sort02_asc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, "�h���C���ϐ�����", "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort03_desc_Internalname, "��", "", "", lblTxt_sort03_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT03_DESC\\'."+"'", "font-family:'�l�r �o�S�V�b�N'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort03_desc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort03_asc_Internalname, "��", "", "", lblTxt_sort03_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT03_ASC\\'."+"'", "", lblTxt_sort03_asc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "�\����", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort04_desc_Internalname, "��", "", "", lblTxt_sort04_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT04_DESC\\'."+"'", "font-family:'�l�r �o�S�V�b�N'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort04_desc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort04_asc_Internalname, "��", "", "", lblTxt_sort04_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT04_ASC\\'."+"'", "", lblTxt_sort04_asc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, "Version", "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort05_desc_Internalname, "��", "", "", lblTxt_sort05_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT05_DESC\\'."+"'", "font-family:'�l�r �o�S�V�b�N'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort05_desc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort05_asc_Internalname, "��", "", "", lblTxt_sort05_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT05_ASC\\'."+"'", "", lblTxt_sort05_asc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "�폜�t���O", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort06_desc_Internalname, "��", "", "", lblTxt_sort06_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT06_DESC\\'."+"'", "font-family:'�l�r �o�S�V�b�N'; font-size:10.0pt; font-weight:normal; font-style:normal;", lblTxt_sort06_desc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_sort06_asc_Internalname, "��", "", "", lblTxt_sort06_asc_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SORT06_ASC\\'."+"'", "", lblTxt_sort06_asc_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_170_1W2e( true) ;
      }
      else
      {
         wb_table13_170_1W2e( false) ;
      }
   }

   public void wb_table11_153_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_edit_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         GxWebStd.gx_table_start( httpContext, tblTbl_edit_Internalname, tblTbl_edit_Internalname, "", "Table", 0, "right", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, "�s�ԍ��F", "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_line_Internalname, GXutil.rtrim( AV14D_LINE), GXutil.rtrim( localUtil.format( AV14D_LINE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(158);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_line_Jsonclick, 0, "AttributeNum", "background:"+WebUtils.getHTMLColor( edtavD_line_Backcolor)+";", "", "", 1, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "�ҏW�iF7�j", "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_EDIT\\'."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_153_1W2e( true) ;
      }
      else
      {
         wb_table11_153_1W2e( false) ;
      }
   }

   public void wb_table10_61_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_67_1W2( true) ;
      }
      else
      {
         wb_table14_67_1W2( false) ;
      }
      return  ;
   }

   public void wb_table14_67_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_61_1W2e( true) ;
      }
      else
      {
         wb_table10_61_1W2e( false) ;
      }
   }

   public void wb_table14_67_1W2( boolean wbgen )
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
         httpContext.writeText( "<td style=\"width:9px\">") ;
         wb_table15_70_1W2( true) ;
      }
      else
      {
         wb_table15_70_1W2( false) ;
      }
      return  ;
   }

   public void wb_table15_70_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:46px\">") ;
         wb_table16_76_1W2( true) ;
      }
      else
      {
         wb_table16_76_1W2( false) ;
      }
      return  ;
   }

   public void wb_table16_76_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_82_1W2( true) ;
      }
      else
      {
         wb_table17_82_1W2( false) ;
      }
      return  ;
   }

   public void wb_table17_82_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_88_1W2( true) ;
      }
      else
      {
         wb_table18_88_1W2( false) ;
      }
      return  ;
   }

   public void wb_table18_88_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_94_1W2( true) ;
      }
      else
      {
         wb_table19_94_1W2( false) ;
      }
      return  ;
   }

   public void wb_table19_94_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_100_1W2( true) ;
      }
      else
      {
         wb_table20_100_1W2( false) ;
      }
      return  ;
   }

   public void wb_table20_100_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_106_1W2( true) ;
      }
      else
      {
         wb_table21_106_1W2( false) ;
      }
      return  ;
   }

   public void wb_table21_106_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_112_1W2( true) ;
      }
      else
      {
         wb_table22_112_1W2( false) ;
      }
      return  ;
   }

   public void wb_table22_112_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_118_1W2( true) ;
      }
      else
      {
         wb_table23_118_1W2( false) ;
      }
      return  ;
   }

   public void wb_table23_118_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_124_1W2( true) ;
      }
      else
      {
         wb_table24_124_1W2( false) ;
      }
      return  ;
   }

   public void wb_table24_124_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_130_1W2( true) ;
      }
      else
      {
         wb_table25_130_1W2( false) ;
      }
      return  ;
   }

   public void wb_table25_130_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_136_1W2( true) ;
      }
      else
      {
         wb_table26_136_1W2( false) ;
      }
      return  ;
   }

   public void wb_table26_136_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table27_142_1W2( true) ;
      }
      else
      {
         wb_table27_142_1W2( false) ;
      }
      return  ;
   }

   public void wb_table27_142_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table28_148_1W2( true) ;
      }
      else
      {
         wb_table28_148_1W2( false) ;
      }
      return  ;
   }

   public void wb_table28_148_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_67_1W2e( true) ;
      }
      else
      {
         wb_table14_67_1W2e( false) ;
      }
   }

   public void wb_table28_148_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "�Ō��", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table28_148_1W2e( true) ;
      }
      else
      {
         wb_table28_148_1W2e( false) ;
      }
   }

   public void wb_table27_142_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 45, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_next_Internalname, tblTbl_next_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "����", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table27_142_1W2e( true) ;
      }
      else
      {
         wb_table27_142_1W2e( false) ;
      }
   }

   public void wb_table26_136_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page10_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page10_Internalname, tblTbl_page10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_136_1W2e( true) ;
      }
      else
      {
         wb_table26_136_1W2e( false) ;
      }
   }

   public void wb_table25_130_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page09_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page09_Internalname, tblTbl_page09_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_130_1W2e( true) ;
      }
      else
      {
         wb_table25_130_1W2e( false) ;
      }
   }

   public void wb_table24_124_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page08_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page08_Internalname, tblTbl_page08_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_124_1W2e( true) ;
      }
      else
      {
         wb_table24_124_1W2e( false) ;
      }
   }

   public void wb_table23_118_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page07_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page07_Internalname, tblTbl_page07_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_118_1W2e( true) ;
      }
      else
      {
         wb_table23_118_1W2e( false) ;
      }
   }

   public void wb_table22_112_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page06_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page06_Internalname, tblTbl_page06_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_112_1W2e( true) ;
      }
      else
      {
         wb_table22_112_1W2e( false) ;
      }
   }

   public void wb_table21_106_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page05_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page05_Internalname, tblTbl_page05_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_106_1W2e( true) ;
      }
      else
      {
         wb_table21_106_1W2e( false) ;
      }
   }

   public void wb_table20_100_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page04_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page04_Internalname, tblTbl_page04_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_100_1W2e( true) ;
      }
      else
      {
         wb_table20_100_1W2e( false) ;
      }
   }

   public void wb_table19_94_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page03_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page03_Internalname, tblTbl_page03_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_94_1W2e( true) ;
      }
      else
      {
         wb_table19_94_1W2e( false) ;
      }
   }

   public void wb_table18_88_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page02_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page02_Internalname, tblTbl_page02_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_88_1W2e( true) ;
      }
      else
      {
         wb_table18_88_1W2e( false) ;
      }
   }

   public void wb_table17_82_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_page01_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 32, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page01_Internalname, tblTbl_page01_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_82_1W2e( true) ;
      }
      else
      {
         wb_table17_82_1W2e( false) ;
      }
   }

   public void wb_table16_76_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 45, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_back_Internalname, tblTbl_back_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "�O��", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_76_1W2e( true) ;
      }
      else
      {
         wb_table16_76_1W2e( false) ;
      }
   }

   public void wb_table15_70_1W2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "�ŏ���", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_70_1W2e( true) ;
      }
      else
      {
         wb_table15_70_1W2e( false) ;
      }
   }

   public void wb_table9_34_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:100px\">") ;
         httpContext.writeText( "�h���C���R�[�h") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:580px\">") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         /* ComboBox */
         GxWebStd.gx_combobox_ctrl1( httpContext, cmbavD_dom_cd, cmbavD_dom_cd.getInternalname(), GXutil.rtrim( AV7D_DOM_CD), 1, cmbavD_dom_cd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, 1, 0, (short)(0), 16, "chr", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", true, "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         cmbavD_dom_cd.setValue( GXutil.rtrim( AV7D_DOM_CD) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavD_dom_cd.getInternalname(), "Values", cmbavD_dom_cd.ToJavascriptSource());
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "�h���C���ϐ���") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_dom_var_nm_Internalname, GXutil.rtrim( AV9D_DOM_VAR_NM), GXutil.rtrim( localUtil.format( AV9D_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_dom_var_nm_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_VAR_NM", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\" >") ;
         httpContext.writeText( "�h���C���ϐ�����") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_201_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_var_desc_Internalname, GXutil.rtrim( AV16D_VAR_DESC), GXutil.rtrim( localUtil.format( AV16D_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_var_desc_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"2\" >") ;
         wb_table29_49_1W2( true) ;
      }
      else
      {
         wb_table29_49_1W2( false) ;
      }
      return  ;
   }

   public void wb_table29_49_1W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_34_1W2e( true) ;
      }
      else
      {
         wb_table9_34_1W2e( false) ;
      }
   }

   public void wb_table29_49_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "Table", 0, "center", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "�����iF5�j", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SRCH\\'."+"'", "background:transparent;", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "�N���A�iF6�j", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table29_49_1W2e( true) ;
      }
      else
      {
         wb_table29_49_1W2e( false) ;
      }
   }

   public void wb_table6_12_1W2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "�V�K�iF3�j", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtn100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg2_Internalname, "�V�K�iF3�j", "", "", lblTxt_btn_reg2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockBtnList100_Disabled", 0, "", lblTxt_btn_reg2_Visible, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "CSV�o�́iF4�j", "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CSV\\'."+"'", "", "TextBlockBtn120", 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, "�h���C���ϐ��捞�iF8�j", "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_IMPORT_CDISC_ITEM\\'."+"'", "", "TextBlockBtn150", 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_domain_Internalname, "�h���C���}�X�^�����e�i���X�iF9�j", "", "", lblBtn_domain_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_DOMAIN\\'."+"'", "", "TextBlockBtnList200", 5, "", 1, 1, (short)(0), "HLP_A212_WP01_CDISC_ITEM_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_12_1W2e( true) ;
      }
      else
      {
         wb_table6_12_1W2e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV26P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26P_MOVE_KBN", GXutil.str( AV26P_MOVE_KBN, 1, 0));
      AV27P_MOVE_KBN_2 = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27P_MOVE_KBN_2", GXutil.str( AV27P_MOVE_KBN_2, 1, 0));
      AV25P_DOM_CD = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25P_DOM_CD", AV25P_DOM_CD);
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
      pa1W2( ) ;
      ws1W2( ) ;
      we1W2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513302190");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a212_wp01_cdisc_item_list.js", "?202071513302190");
      /* End function include_jscripts */
   }

   public void subsflControlProps_2012( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_201_idx ;
      edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_201_idx ;
      edtavD_grd_dom_cd_Internalname = "vD_GRD_DOM_CD_"+sGXsfl_201_idx ;
      edtavD_grd_dom_var_nm_Internalname = "vD_GRD_DOM_VAR_NM_"+sGXsfl_201_idx ;
      edtavD_grd_var_desc_Internalname = "vD_GRD_VAR_DESC_"+sGXsfl_201_idx ;
      edtavD_grd_order_Internalname = "vD_GRD_ORDER_"+sGXsfl_201_idx ;
      edtavD_grd_version_Internalname = "vD_GRD_VERSION_"+sGXsfl_201_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_201_idx ;
   }

   public void subsflControlProps_fel_2012( )
   {
      lblBtn_sel_Internalname = "BTN_SEL_"+sGXsfl_201_fel_idx ;
      edtavD_grd_line_Internalname = "vD_GRD_LINE_"+sGXsfl_201_fel_idx ;
      edtavD_grd_dom_cd_Internalname = "vD_GRD_DOM_CD_"+sGXsfl_201_fel_idx ;
      edtavD_grd_dom_var_nm_Internalname = "vD_GRD_DOM_VAR_NM_"+sGXsfl_201_fel_idx ;
      edtavD_grd_var_desc_Internalname = "vD_GRD_VAR_DESC_"+sGXsfl_201_fel_idx ;
      edtavD_grd_order_Internalname = "vD_GRD_ORDER_"+sGXsfl_201_fel_idx ;
      edtavD_grd_version_Internalname = "vD_GRD_VERSION_"+sGXsfl_201_fel_idx ;
      edtavD_grd_del_Internalname = "vD_GRD_DEL_"+sGXsfl_201_fel_idx ;
   }

   public void sendrow_2012( )
   {
      subsflControlProps_2012( ) ;
      wb1W0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_201_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_201_idx-1)/ (double) (1)) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0xFFFFFF) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
         }
         /* Start of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( ( 1 == 0 ) && ( nGXsfl_201_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_201_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_201_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_201_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblBtn_sel_Internalname,"�I��","","",lblBtn_sel_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_SEL\\'."+sGXsfl_201_idx+"'","","TextBlockBtn040s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:50px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 206,'',false,'"+sGXsfl_201_idx+"',201)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_line_Internalname,GXutil.ltrim( localUtil.ntoc( AV11D_GRD_LINE, (byte)(4), (byte)(0), ".", "")),((edtavD_grd_line_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11D_GRD_LINE), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11D_GRD_LINE), "ZZZ9")),TempTags+((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_line_Enabled!=0)&&(edtavD_grd_line_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(206);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_line_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_line_Enabled),new Integer(0),"text","",new Integer(4),"chr",new Integer(1),"row",new Integer(4),new Integer(0),new Integer(0),new Integer(201),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:160px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_dom_cd_Enabled!=0)&&(edtavD_grd_dom_cd_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 208,'',false,'"+sGXsfl_201_idx+"',201)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_dom_cd_Internalname,GXutil.rtrim( AV39D_GRD_DOM_CD),"",TempTags+((edtavD_grd_dom_cd_Enabled!=0)&&(edtavD_grd_dom_cd_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_dom_cd_Enabled!=0)&&(edtavD_grd_dom_cd_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(208);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_dom_cd_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_dom_cd_Enabled),new Integer(0),"text","",new Integer(16),"chr",new Integer(1),"row",new Integer(16),new Integer(0),new Integer(0),new Integer(201),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:150px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_dom_var_nm_Enabled!=0)&&(edtavD_grd_dom_var_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 210,'',false,'"+sGXsfl_201_idx+"',201)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_dom_var_nm_Internalname,GXutil.rtrim( AV40D_GRD_DOM_VAR_NM),"",TempTags+((edtavD_grd_dom_var_nm_Enabled!=0)&&(edtavD_grd_dom_var_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_dom_var_nm_Enabled!=0)&&(edtavD_grd_dom_var_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(210);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_dom_var_nm_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_dom_var_nm_Enabled),new Integer(0),"text","",new Integer(50),"chr",new Integer(1),"row",new Integer(50),new Integer(0),new Integer(0),new Integer(201),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:300px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_var_desc_Enabled!=0)&&(edtavD_grd_var_desc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 212,'',false,'"+sGXsfl_201_idx+"',201)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_var_desc_Internalname,GXutil.rtrim( AV41D_GRD_VAR_DESC),"",TempTags+((edtavD_grd_var_desc_Enabled!=0)&&(edtavD_grd_var_desc_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_var_desc_Enabled!=0)&&(edtavD_grd_var_desc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(212);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_var_desc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_var_desc_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(100),new Integer(0),new Integer(0),new Integer(201),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_order_Enabled!=0)&&(edtavD_grd_order_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 214,'',false,'"+sGXsfl_201_idx+"',201)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_order_Internalname,GXutil.ltrim( localUtil.ntoc( AV42D_GRD_ORDER, (byte)(5), (byte)(0), ".", "")),((edtavD_grd_order_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42D_GRD_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV42D_GRD_ORDER), "ZZZZ9")),TempTags+((edtavD_grd_order_Enabled!=0)&&(edtavD_grd_order_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_order_Enabled!=0)&&(edtavD_grd_order_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(214);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_order_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_order_Enabled),new Integer(0),"text","",new Integer(5),"chr",new Integer(1),"row",new Integer(5),new Integer(0),new Integer(0),new Integer(201),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_version_Enabled!=0)&&(edtavD_grd_version_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 216,'',false,'"+sGXsfl_201_idx+"',201)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_version_Internalname,GXutil.rtrim( AV43D_GRD_VERSION),"",TempTags+((edtavD_grd_version_Enabled!=0)&&(edtavD_grd_version_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_version_Enabled!=0)&&(edtavD_grd_version_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(216);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_version_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_version_Enabled),new Integer(0),"text","",new Integer(20),"chr",new Integer(1),"row",new Integer(20),new Integer(0),new Integer(0),new Integer(201),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:100px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 218,'',false,'"+sGXsfl_201_idx+"',201)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_del_Internalname,GXutil.rtrim( AV10D_GRD_DEL),"",TempTags+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_del_Enabled!=0)&&(edtavD_grd_del_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(218);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_del_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_del_Enabled),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(201),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
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
               if ( ((int)((nGXsfl_201_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_201_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_201_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_201_idx+1)) ;
         sGXsfl_201_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_201_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_2012( ) ;
      }
      /* End function sendrow_2012 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTxt_btn_reg2_Internalname = "TXT_BTN_REG2" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      lblBtn_domain_Internalname = "BTN_DOMAIN" ;
      tblTable8_Internalname = "TABLE8" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      cmbavD_dom_cd.setInternalname( "vD_DOM_CD" );
      edtavD_dom_var_nm_Internalname = "vD_DOM_VAR_NM" ;
      edtavD_var_desc_Internalname = "vD_VAR_DESC" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      tblTable9_Internalname = "TABLE9" ;
      tblTable5_Internalname = "TABLE5" ;
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
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtavD_line_Internalname = "vD_LINE" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      tblTbl_edit_Internalname = "TBL_EDIT" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      lblTxt_sort01_desc_Internalname = "TXT_SORT01_DESC" ;
      lblTxt_sort01_asc_Internalname = "TXT_SORT01_ASC" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      lblTxt_sort02_desc_Internalname = "TXT_SORT02_DESC" ;
      lblTxt_sort02_asc_Internalname = "TXT_SORT02_ASC" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      lblTxt_sort03_desc_Internalname = "TXT_SORT03_DESC" ;
      lblTxt_sort03_asc_Internalname = "TXT_SORT03_ASC" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTxt_sort04_desc_Internalname = "TXT_SORT04_DESC" ;
      lblTxt_sort04_asc_Internalname = "TXT_SORT04_ASC" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      lblTxt_sort05_desc_Internalname = "TXT_SORT05_DESC" ;
      lblTxt_sort05_asc_Internalname = "TXT_SORT05_ASC" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      lblTxt_sort06_desc_Internalname = "TXT_SORT06_DESC" ;
      lblTxt_sort06_asc_Internalname = "TXT_SORT06_ASC" ;
      tblTbl_in_grid_header_Internalname = "TBL_IN_GRID_HEADER" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      edtavH_dom_cd_Internalname = "vH_DOM_CD" ;
      edtavH_dom_var_nm_Internalname = "vH_DOM_VAR_NM" ;
      edtavH_var_desc_Internalname = "vH_VAR_DESC" ;
      edtavH_sort_Internalname = "vH_SORT" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCtlmax_row_Internalname = "CTLMAX_ROW" ;
      tblTable7_Internalname = "TABLE7" ;
      edtavH_sort_asdc_kbn_Internalname = "vH_SORT_ASDC_KBN" ;
      edtavH_sort_item_kbn_Internalname = "vH_SORT_ITEM_KBN" ;
      tblTable6_Internalname = "TABLE6" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_grd_del_Jsonclick = "" ;
      edtavD_grd_del_Visible = 1 ;
      edtavD_grd_version_Jsonclick = "" ;
      edtavD_grd_version_Visible = 1 ;
      edtavD_grd_order_Jsonclick = "" ;
      edtavD_grd_order_Visible = 1 ;
      edtavD_grd_var_desc_Jsonclick = "" ;
      edtavD_grd_var_desc_Visible = 1 ;
      edtavD_grd_dom_var_nm_Jsonclick = "" ;
      edtavD_grd_dom_var_nm_Visible = 1 ;
      edtavD_grd_dom_cd_Jsonclick = "" ;
      edtavD_grd_dom_cd_Visible = 1 ;
      edtavD_grd_line_Jsonclick = "" ;
      edtavD_grd_line_Visible = 1 ;
      subGrid1_Class = "FreeStyleGridTM-1" ;
      lblTxt_btn_reg2_Visible = 1 ;
      lblTxt_btn_reg_Visible = 1 ;
      edtavD_var_desc_Jsonclick = "" ;
      edtavD_dom_var_nm_Jsonclick = "" ;
      cmbavD_dom_cd.setJsonclick( "" );
      edtavD_line_Jsonclick = "" ;
      edtavD_line_Backstyle = (byte)(-1) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      edtavD_grd_del_Enabled = 1 ;
      edtavD_grd_version_Enabled = 1 ;
      edtavD_grd_order_Enabled = 1 ;
      edtavD_grd_var_desc_Enabled = 1 ;
      edtavD_grd_dom_var_nm_Enabled = 1 ;
      edtavD_grd_dom_cd_Enabled = 1 ;
      edtavD_grd_line_Enabled = 1 ;
      lblBtn_sel_Caption = "�I��" ;
      edtavCtlmax_row_Jsonclick = "" ;
      edtavH_sort_item_kbn_Jsonclick = "" ;
      edtavH_sort_asdc_kbn_Jsonclick = "" ;
      edtavH_sort_Jsonclick = "" ;
      edtavH_var_desc_Jsonclick = "" ;
      edtavH_dom_var_nm_Jsonclick = "" ;
      edtavH_dom_cd_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_sort06_desc_Class = "TextBlockSort" ;
      lblTxt_sort06_asc_Class = "TextBlockSort" ;
      lblTxt_sort05_desc_Class = "TextBlockSort" ;
      lblTxt_sort05_asc_Class = "TextBlockSort" ;
      lblTxt_sort04_desc_Class = "TextBlockSort" ;
      lblTxt_sort04_asc_Class = "TextBlockSort" ;
      lblTxt_sort03_desc_Class = "TextBlockSort" ;
      lblTxt_sort03_asc_Class = "TextBlockSort" ;
      lblTxt_sort02_desc_Class = "TextBlockSort" ;
      lblTxt_sort02_asc_Class = "TextBlockSort" ;
      lblTxt_sort01_desc_Class = "TextBlockSort" ;
      lblTxt_sort01_asc_Class = "TextBlockSort" ;
      lblTxt_rec_cnt_Caption = "TXT_REC_CNT" ;
      tblTbl_edit_Visible = 1 ;
      tblTbl_grid_header_Visible = 1 ;
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
      edtavD_line_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(3) ;
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
                  /* Execute user subroutine: S342 */
                  S342 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV25P_DOM_CD = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV25P_DOM_CD = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV17H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV53Pgmname = "" ;
      AV6C_TAM02_APP_ID = "" ;
      A49TBM02_DOM_CD = "" ;
      A611TBM02_DOM_JNM = "" ;
      AV30W_A821_JS = "" ;
      AV44SD_A212_SD01_LIST_C = new GxObjectCollection(SdtA212_SD01_LIST_A212_SD01_LISTItem.class, "A212_SD01_LIST.A212_SD01_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      A59TBM03_DOM_CD = "" ;
      A60TBM03_DOM_VAR_NM = "" ;
      A346TBM03_VAR_DESC = "" ;
      A932TBM03_VERSION = "" ;
      A359TBM03_DEL_FLG = "" ;
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
      edtavD_grd_line_Internalname = "" ;
      AV39D_GRD_DOM_CD = "" ;
      edtavD_grd_dom_cd_Internalname = "" ;
      AV40D_GRD_DOM_VAR_NM = "" ;
      edtavD_grd_dom_var_nm_Internalname = "" ;
      AV41D_GRD_VAR_DESC = "" ;
      edtavD_grd_var_desc_Internalname = "" ;
      edtavD_grd_order_Internalname = "" ;
      AV43D_GRD_VERSION = "" ;
      edtavD_grd_version_Internalname = "" ;
      AV10D_GRD_DEL = "" ;
      edtavD_grd_del_Internalname = "" ;
      GXDecQS = "" ;
      AV7D_DOM_CD = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      AV52Pgmdesc = "" ;
      AV9D_DOM_VAR_NM = "" ;
      AV16D_VAR_DESC = "" ;
      AV14D_LINE = "" ;
      AV20H_INIT_FLG = "" ;
      AV23H_SRCH_FLG = "" ;
      AV21H_KNGN_FLG = "" ;
      AV18H_DOM_CD = "" ;
      AV19H_DOM_VAR_NM = "" ;
      AV24H_VAR_DESC = "" ;
      AV22H_SORT = "" ;
      AV5C_GAMEN_TITLE = "" ;
      AV28W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV45SD_A212_SD01_LIST_I = new SdtA212_SD01_LIST_A212_SD01_LISTItem(remoteHandle, context);
      AV37W_RTN_MSG = "" ;
      AV36W_MSG = "" ;
      AV31W_DOM_CD = "" ;
      AV32W_DOM_VAR_NM = "" ;
      scmdbuf = "" ;
      H001W2_A611TBM02_DOM_JNM = new String[] {""} ;
      H001W2_n611TBM02_DOM_JNM = new boolean[] {false} ;
      H001W2_A49TBM02_DOM_CD = new String[] {""} ;
      AV38W_SESSION = httpContext.getWebSession();
      lV18H_DOM_CD = "" ;
      lV19H_DOM_VAR_NM = "" ;
      lV24H_VAR_DESC = "" ;
      H001W3_A346TBM03_VAR_DESC = new String[] {""} ;
      H001W3_n346TBM03_VAR_DESC = new boolean[] {false} ;
      H001W3_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      H001W3_A59TBM03_DOM_CD = new String[] {""} ;
      H001W3_A61TBM03_ORDER = new int[1] ;
      H001W3_n61TBM03_ORDER = new boolean[] {false} ;
      H001W3_A932TBM03_VERSION = new String[] {""} ;
      H001W3_n932TBM03_VERSION = new boolean[] {false} ;
      H001W3_A359TBM03_DEL_FLG = new String[] {""} ;
      H001W3_n359TBM03_DEL_FLG = new boolean[] {false} ;
      H001W4_A346TBM03_VAR_DESC = new String[] {""} ;
      H001W4_n346TBM03_VAR_DESC = new boolean[] {false} ;
      H001W4_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      H001W4_A59TBM03_DOM_CD = new String[] {""} ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV33W_ERRCD = "" ;
      AV29W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtA_PAGING_SDT5 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXv_boolean7 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock1_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock34_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTxt_sort01_desc_Jsonclick = "" ;
      lblTxt_sort01_asc_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTxt_sort02_desc_Jsonclick = "" ;
      lblTxt_sort02_asc_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTxt_sort03_desc_Jsonclick = "" ;
      lblTxt_sort03_asc_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTxt_sort04_desc_Jsonclick = "" ;
      lblTxt_sort04_asc_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTxt_sort05_desc_Jsonclick = "" ;
      lblTxt_sort05_asc_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTxt_sort06_desc_Jsonclick = "" ;
      lblTxt_sort06_asc_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
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
      lblTextblock45_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTxt_btn_reg2_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
      lblBtn_domain_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblBtn_sel_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblBtn_sel_Jsonclick = "" ;
      ROClassString = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a212_wp01_cdisc_item_list__default(),
         new Object[] {
             new Object[] {
            H001W2_A611TBM02_DOM_JNM, H001W2_n611TBM02_DOM_JNM, H001W2_A49TBM02_DOM_CD
            }
            , new Object[] {
            H001W3_A346TBM03_VAR_DESC, H001W3_n346TBM03_VAR_DESC, H001W3_A60TBM03_DOM_VAR_NM, H001W3_A59TBM03_DOM_CD, H001W3_A61TBM03_ORDER, H001W3_n61TBM03_ORDER, H001W3_A932TBM03_VERSION, H001W3_n932TBM03_VERSION, H001W3_A359TBM03_DEL_FLG, H001W3_n359TBM03_DEL_FLG
            }
            , new Object[] {
            H001W4_A346TBM03_VAR_DESC, H001W4_n346TBM03_VAR_DESC, H001W4_A60TBM03_DOM_VAR_NM, H001W4_A59TBM03_DOM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV53Pgmname = "A212_WP01_CDISC_ITEM_LIST" ;
      AV52Pgmdesc = "�h���C���ϐ��}�X�^�����e�i���X�i�ꗗ�j" ;
      /* GeneXus formulas. */
      AV53Pgmname = "A212_WP01_CDISC_ITEM_LIST" ;
      AV52Pgmdesc = "�h���C���ϐ��}�X�^�����e�i���X�i�ꗗ�j" ;
      Gx_err = (short)(0) ;
      edtavD_grd_line_Enabled = 0 ;
      edtavD_grd_dom_cd_Enabled = 0 ;
      edtavD_grd_dom_var_nm_Enabled = 0 ;
      edtavD_grd_var_desc_Enabled = 0 ;
      edtavD_grd_order_Enabled = 0 ;
      edtavD_grd_version_Enabled = 0 ;
      edtavD_grd_del_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV26P_MOVE_KBN ;
   private byte wcpOAV27P_MOVE_KBN_2 ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV26P_MOVE_KBN ;
   private byte AV27P_MOVE_KBN_2 ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte AV58GXLvl613 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte edtavD_line_Backstyle ;
   private short nRC_GXsfl_201 ;
   private short nGXsfl_201_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV11D_GRD_LINE ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_201_Refreshing=0 ;
   private short Gx_err ;
   private short AV47H_SORT_ASDC_KBN ;
   private short AV48H_SORT_ITEM_KBN ;
   private int A61TBM03_ORDER ;
   private int subGrid1_Rows ;
   private int AV42D_GRD_ORDER ;
   private int subGrid1_Islastpage ;
   private int edtavD_grd_line_Enabled ;
   private int edtavD_grd_dom_cd_Enabled ;
   private int edtavD_grd_dom_var_nm_Enabled ;
   private int edtavD_grd_var_desc_Enabled ;
   private int edtavD_grd_order_Enabled ;
   private int edtavD_grd_version_Enabled ;
   private int edtavD_grd_del_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV54GXV2 ;
   private int AV55GXV3 ;
   private int edtavD_line_Backcolor ;
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
   private int tblTbl_grid_header_Visible ;
   private int tblTbl_edit_Visible ;
   private int lblTxt_btn_reg_Visible ;
   private int lblTxt_btn_reg2_Visible ;
   private int AV61GXV4 ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_line_Visible ;
   private int edtavD_grd_dom_cd_Visible ;
   private int edtavD_grd_dom_var_nm_Visible ;
   private int edtavD_grd_var_desc_Visible ;
   private int edtavD_grd_order_Visible ;
   private int edtavD_grd_version_Visible ;
   private int edtavD_grd_del_Visible ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nRecordCount ;
   private long GRID1_nCurrentRecord ;
   private long AV46W_CNT ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_201_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV53Pgmname ;
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
   private String edtavD_grd_line_Internalname ;
   private String edtavD_grd_dom_cd_Internalname ;
   private String edtavD_grd_dom_var_nm_Internalname ;
   private String edtavD_grd_var_desc_Internalname ;
   private String edtavD_grd_order_Internalname ;
   private String edtavD_grd_version_Internalname ;
   private String edtavD_grd_del_Internalname ;
   private String GXDecQS ;
   private String AV52Pgmdesc ;
   private String edtavD_dom_var_nm_Internalname ;
   private String edtavD_var_desc_Internalname ;
   private String AV14D_LINE ;
   private String edtavD_line_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_dom_cd_Internalname ;
   private String edtavH_dom_var_nm_Internalname ;
   private String edtavH_var_desc_Internalname ;
   private String edtavH_sort_Internalname ;
   private String edtavCtlmax_row_Internalname ;
   private String edtavH_sort_asdc_kbn_Internalname ;
   private String edtavH_sort_item_kbn_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String GXv_char2[] ;
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
   private String tblTbl_grid_header_Internalname ;
   private String tblTbl_edit_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
   private String lblTxt_btn_reg2_Internalname ;
   private String lblTxt_sort01_asc_Class ;
   private String lblTxt_sort01_asc_Internalname ;
   private String lblTxt_sort01_desc_Class ;
   private String lblTxt_sort01_desc_Internalname ;
   private String lblTxt_sort02_asc_Class ;
   private String lblTxt_sort02_asc_Internalname ;
   private String lblTxt_sort02_desc_Class ;
   private String lblTxt_sort02_desc_Internalname ;
   private String lblTxt_sort03_asc_Class ;
   private String lblTxt_sort03_asc_Internalname ;
   private String lblTxt_sort03_desc_Class ;
   private String lblTxt_sort03_desc_Internalname ;
   private String lblTxt_sort04_asc_Class ;
   private String lblTxt_sort04_asc_Internalname ;
   private String lblTxt_sort04_desc_Class ;
   private String lblTxt_sort04_desc_Internalname ;
   private String lblTxt_sort05_asc_Class ;
   private String lblTxt_sort05_asc_Internalname ;
   private String lblTxt_sort05_desc_Class ;
   private String lblTxt_sort05_desc_Internalname ;
   private String lblTxt_sort06_asc_Class ;
   private String lblTxt_sort06_asc_Internalname ;
   private String lblTxt_sort06_desc_Class ;
   private String lblTxt_sort06_desc_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String edtavH_dom_cd_Jsonclick ;
   private String edtavH_dom_var_nm_Jsonclick ;
   private String edtavH_var_desc_Jsonclick ;
   private String edtavH_sort_Jsonclick ;
   private String tblTable6_Internalname ;
   private String edtavH_sort_asdc_kbn_Jsonclick ;
   private String edtavH_sort_item_kbn_Jsonclick ;
   private String tblTable7_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCtlmax_row_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String lblBtn_sel_Caption ;
   private String tblTbl_in_grid_header_Internalname ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String lblTxt_sort01_desc_Jsonclick ;
   private String lblTxt_sort01_asc_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String lblTxt_sort02_desc_Jsonclick ;
   private String lblTxt_sort02_asc_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String lblTxt_sort03_desc_Jsonclick ;
   private String lblTxt_sort03_asc_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTxt_sort04_desc_Jsonclick ;
   private String lblTxt_sort04_asc_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String lblTxt_sort05_desc_Jsonclick ;
   private String lblTxt_sort05_asc_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String lblTxt_sort06_desc_Jsonclick ;
   private String lblTxt_sort06_asc_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtavD_line_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
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
   private String tblTable5_Internalname ;
   private String edtavD_dom_var_nm_Jsonclick ;
   private String edtavD_var_desc_Jsonclick ;
   private String tblTable9_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String tblTable8_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTxt_btn_reg2_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String lblBtn_domain_Internalname ;
   private String lblBtn_domain_Jsonclick ;
   private String lblBtn_sel_Internalname ;
   private String sGXsfl_201_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String lblBtn_sel_Jsonclick ;
   private String ROClassString ;
   private String edtavD_grd_line_Jsonclick ;
   private String edtavD_grd_dom_cd_Jsonclick ;
   private String edtavD_grd_dom_var_nm_Jsonclick ;
   private String edtavD_grd_var_desc_Jsonclick ;
   private String edtavD_grd_order_Jsonclick ;
   private String edtavD_grd_version_Jsonclick ;
   private String edtavD_grd_del_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV34W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean n611TBM02_DOM_JNM ;
   private boolean n346TBM03_VAR_DESC ;
   private boolean n61TBM03_ORDER ;
   private boolean n932TBM03_VERSION ;
   private boolean n359TBM03_DEL_FLG ;
   private boolean AV35W_F7FLG ;
   private boolean GXt_boolean6 ;
   private boolean GXv_boolean7[] ;
   private String wcpOAV25P_DOM_CD ;
   private String AV25P_DOM_CD ;
   private String AV6C_TAM02_APP_ID ;
   private String A49TBM02_DOM_CD ;
   private String A611TBM02_DOM_JNM ;
   private String AV30W_A821_JS ;
   private String A59TBM03_DOM_CD ;
   private String A60TBM03_DOM_VAR_NM ;
   private String A346TBM03_VAR_DESC ;
   private String A932TBM03_VERSION ;
   private String A359TBM03_DEL_FLG ;
   private String AV39D_GRD_DOM_CD ;
   private String AV40D_GRD_DOM_VAR_NM ;
   private String AV41D_GRD_VAR_DESC ;
   private String AV43D_GRD_VERSION ;
   private String AV10D_GRD_DEL ;
   private String AV7D_DOM_CD ;
   private String AV9D_DOM_VAR_NM ;
   private String AV16D_VAR_DESC ;
   private String AV20H_INIT_FLG ;
   private String AV23H_SRCH_FLG ;
   private String AV21H_KNGN_FLG ;
   private String AV18H_DOM_CD ;
   private String AV19H_DOM_VAR_NM ;
   private String AV24H_VAR_DESC ;
   private String AV22H_SORT ;
   private String AV5C_GAMEN_TITLE ;
   private String AV37W_RTN_MSG ;
   private String AV36W_MSG ;
   private String AV31W_DOM_CD ;
   private String AV32W_DOM_VAR_NM ;
   private String lV18H_DOM_CD ;
   private String lV19H_DOM_VAR_NM ;
   private String lV24H_VAR_DESC ;
   private String AV33W_ERRCD ;
   private String AV29W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private HTMLChoice cmbavD_dom_cd ;
   private IDataStoreProvider pr_default ;
   private String[] H001W2_A611TBM02_DOM_JNM ;
   private boolean[] H001W2_n611TBM02_DOM_JNM ;
   private String[] H001W2_A49TBM02_DOM_CD ;
   private String[] H001W3_A346TBM03_VAR_DESC ;
   private boolean[] H001W3_n346TBM03_VAR_DESC ;
   private String[] H001W3_A60TBM03_DOM_VAR_NM ;
   private String[] H001W3_A59TBM03_DOM_CD ;
   private int[] H001W3_A61TBM03_ORDER ;
   private boolean[] H001W3_n61TBM03_ORDER ;
   private String[] H001W3_A932TBM03_VERSION ;
   private boolean[] H001W3_n932TBM03_VERSION ;
   private String[] H001W3_A359TBM03_DEL_FLG ;
   private boolean[] H001W3_n359TBM03_DEL_FLG ;
   private String[] H001W4_A346TBM03_VAR_DESC ;
   private boolean[] H001W4_n346TBM03_VAR_DESC ;
   private String[] H001W4_A60TBM03_DOM_VAR_NM ;
   private String[] H001W4_A59TBM03_DOM_CD ;
   private com.genexus.webpanels.WebSession AV38W_SESSION ;
   private GxObjectCollection AV44SD_A212_SD01_LIST_C ;
   private SdtA_PAGING_SDT AV17H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT5[] ;
   private SdtA_LOGIN_SDT AV28W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA212_SD01_LIST_A212_SD01_LISTItem AV45SD_A212_SD01_LIST_I ;
}

final  class a212_wp01_cdisc_item_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001W3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV18H_DOM_CD ,
                                          String AV19H_DOM_VAR_NM ,
                                          String AV24H_VAR_DESC ,
                                          String A59TBM03_DOM_CD ,
                                          String A60TBM03_DOM_VAR_NM ,
                                          String A346TBM03_VAR_DESC ,
                                          String AV23H_SRCH_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int8 ;
      GXv_int8 = new byte [4] ;
      Object[] GXv_Object9 ;
      GXv_Object9 = new Object [2] ;
      scmdbuf = "SELECT `TBM03_VAR_DESC`, `TBM03_DOM_VAR_NM`, `TBM03_DOM_CD`, `TBM03_ORDER`, `TBM03_VERSION`," ;
      scmdbuf = scmdbuf + " `TBM03_DEL_FLG` FROM `TBM03_CDISC_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (? = '1')" ;
      if ( ! (GXutil.strcmp("", AV18H_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM03_DOM_CD` like CONCAT(?, '%'))" ;
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19H_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM03_DOM_VAR_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24H_VAR_DESC)==0) )
      {
         sWhereString = sWhereString + " and (`TBM03_VAR_DESC` like CONCAT(CONCAT('%', ?), '%'))" ;
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_H001W4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV18H_DOM_CD ,
                                          String AV19H_DOM_VAR_NM ,
                                          String AV24H_VAR_DESC ,
                                          String A59TBM03_DOM_CD ,
                                          String A60TBM03_DOM_VAR_NM ,
                                          String A346TBM03_VAR_DESC )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int10 ;
      GXv_int10 = new byte [3] ;
      Object[] GXv_Object11 ;
      GXv_Object11 = new Object [2] ;
      scmdbuf = "SELECT `TBM03_VAR_DESC`, `TBM03_DOM_VAR_NM`, `TBM03_DOM_CD` FROM `TBM03_CDISC_ITEM`" ;
      if ( ! (GXutil.strcmp("", AV18H_DOM_CD)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM03_DOM_CD` like CONCAT(?, '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM03_DOM_CD` like CONCAT(?, '%'))" ;
         }
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19H_DOM_VAR_NM)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM03_DOM_VAR_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM03_DOM_VAR_NM` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24H_VAR_DESC)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBM03_VAR_DESC` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBM03_VAR_DESC` like CONCAT(CONCAT('%', ?), '%'))" ;
         }
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_H001W3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 2 :
                  return conditional_H001W4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001W2", "SELECT `TBM02_DOM_JNM`, `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` ORDER BY `TBM02_DOM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001W4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
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
                  stmt.setVarchar(sIdx, (String)parms[4], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 100);
               }
               return;
      }
   }

}

