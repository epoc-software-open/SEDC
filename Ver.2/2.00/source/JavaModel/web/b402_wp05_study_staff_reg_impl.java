/*
               File: b402_wp05_study_staff_reg_impl
        Description: 試験登録（参加スタッフ選択）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:42.25
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp05_study_staff_reg_impl extends GXWebPanel
{
   public b402_wp05_study_staff_reg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public b402_wp05_study_staff_reg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_wp05_study_staff_reg_impl.class ));
   }

   public b402_wp05_study_staff_reg_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavD_grd_check = UIFactory.getCheckbox(this);
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
            nRC_GXsfl_153 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_153_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_153_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( nRC_GXsfl_153, nGXsfl_153_idx, sGXsfl_153_idx) ;
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
            AV14P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14P_MOVE_KBN", GXutil.str( AV14P_MOVE_KBN, 1, 0));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV16P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16P_STUDY_ID", GXutil.ltrim( GXutil.str( AV16P_STUDY_ID, 10, 0)));
               AV15P_SITE_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15P_SITE_ID", AV15P_SITE_ID);
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
         pa172( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws172( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we172( ) ;
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
      httpContext.writeValue( "試験登録（参加スタッフ選択）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317174239");
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
      GXEncryptionTmp = "b402_wp05_study_staff_reg"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14P_MOVE_KBN,1,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15P_SITE_ID)) ;
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("b402_wp05_study_staff_reg") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey)+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm172( )
   {
      /* Send hidden variables. */
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_SRCH_FLG", GXutil.rtrim( AV13H_SRCH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "GXH_vH_DISP_DATETIME", GXutil.rtrim( AV10H_DISP_DATETIME));
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "H_a_paging_sdt", AV9H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("H_a_paging_sdt", AV9H_A_PAGING_SDT);
      }
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_153", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_153, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vC_APP_ID", GXutil.rtrim( AV5C_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "gxhash_vC_APP_ID", GetHash( "", String.valueOf(AV5C_APP_ID)));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vP_STUDY_ID", GXutil.ltrim( localUtil.ntoc( AV16P_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TBM21_STUDY_NM", GXutil.rtrim( A367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_SITE_ID", GXutil.rtrim( A57TAM08_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "vP_SITE_ID", GXutil.rtrim( AV15P_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "TAM08_SITE_NM", GXutil.rtrim( A319TAM08_SITE_NM));
      GxWebStd.gx_hidden_field( httpContext, "vP_MOVE_KBN", GXutil.ltrim( localUtil.ntoc( AV14P_MOVE_KBN, (byte)(1), (byte)(0), ".", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vH_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vH_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      }
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_GRID_READ_FLG", AV24W_GRID_READ_FLG);
      GxWebStd.gx_hidden_field( httpContext, "vW_A821_JS", GXutil.rtrim( AV19W_A821_JS));
      GxWebStd.gx_boolean_hidden_field( httpContext, "vW_ERRFLG", AV23W_ERRFLG);
      GxWebStd.gx_hidden_field( httpContext, "TBW01_FREE_SAVE_1", A685TBW01_FREE_SAVE_1);
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
      return "B402_WP05_STUDY_STAFF_REG" ;
   }

   public String getPgmdesc( )
   {
      return "試験登録（参加スタッフ選択）" ;
   }

   public void wb170( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_172( true) ;
      }
      else
      {
         wb_table1_2_172( false) ;
      }
      return  ;
   }

   public void wb_table1_2_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_172_172( true) ;
      }
      else
      {
         wb_table2_172_172( false) ;
      }
      return  ;
   }

   public void wb_table2_172_172e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start172( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "試験登録（参加スタッフ選択）", (short)(0)) ;
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
         OldWebcomp2 = httpContext.cgiGet( "W0170") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0170", "");
         }
      }
      wbErr = false ;
      strup170( ) ;
   }

   public void ws172( )
   {
      start172( ) ;
      evt172( ) ;
   }

   public void evt172( )
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
                        /* Execute user event: e11172 */
                        e11172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_CAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12172 */
                        e12172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_REG_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13172 */
                        e13172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_FIRST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e14172 */
                        e14172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_LAST'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e15172 */
                        e15172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_BACK'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e16172 */
                        e16172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE_NEXT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e17172 */
                        e17172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE01'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e18172 */
                        e18172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE02'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e19172 */
                        e19172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE03'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e20172 */
                        e20172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE04'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e21172 */
                        e21172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE05'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e22172 */
                        e22172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE06'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e23172 */
                        e23172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE07'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e24172 */
                        e24172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE08'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e25172 */
                        e25172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE09'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e26172 */
                        e26172 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'PAGE10'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e27172 */
                        e27172 ();
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'BTN_AUTH'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'BTN_AUTH'") == 0 ) )
                     {
                        nGXsfl_153_idx = (short)(GXutil.lval( sEvtType)) ;
                        sGXsfl_153_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_153_idx, 4, 0)), (short)(4), "0") ;
                        subsflControlProps_1532( ) ;
                        AV7D_GRD_CHECK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_check.getInternalname())) ;
                        A54TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") ;
                        AV30D_GRD_USER_ID = httpContext.cgiGet( edtavD_grd_user_id_Internalname) ;
                        AV8D_GRD_USER_NM = httpContext.cgiGet( edtavD_grd_user_nm_Internalname) ;
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0170") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0170", "");
                        }
                        OldWebcomp1 = httpContext.cgiGet( "W0009") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
                        {
                           WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
                           WebComp_Webcomp1_Component = OldWebcomp1 ;
                           WebComp_Webcomp1.componentrestorestate("W0009", "");
                        }
                        OldWebcomp2 = httpContext.cgiGet( "W0170") ;
                        if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
                        {
                           WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                           WebComp_Webcomp2_Component = OldWebcomp2 ;
                           WebComp_Webcomp2.componentrestorestate("W0170", "");
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e28172 */
                              e28172 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e29172 */
                              e29172 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e30172 */
                              e30172 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "'BTN_AUTH'") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: e31172 */
                              e31172 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 Rfr0gs = false ;
                                 /* Set Refresh If H_srch_flg Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV13H_SRCH_FLG) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
                                 /* Set Refresh If H_disp_datetime Changed */
                                 if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DISP_DATETIME"), AV10H_DISP_DATETIME) != 0 )
                                 {
                                    Rfr0gs = true ;
                                 }
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
                  else if ( nCmpId == 170 )
                  {
                     OldWebcomp2 = httpContext.cgiGet( "W0170") ;
                     if ( ( GXutil.len( OldWebcomp2) == 0 ) || ( GXutil.strcmp(OldWebcomp2, WebComp_Webcomp2_Component) != 0 ) )
                     {
                        WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
                        WebComp_Webcomp2_Component = OldWebcomp2 ;
                     }
                     if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
                     {
                        WebComp_Webcomp2.componentprocess("W0170", "", sEvt);
                     }
                     WebComp_Webcomp2_Component = OldWebcomp2 ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we172( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm172( ) ;
         }
      }
   }

   public void pa172( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         if ( ( GxWebError == 0 ) && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
            if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "b402_wp05_study_staff_reg")), "b402_wp05_study_staff_reg") == 0 ) )
            {
               httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "b402_wp05_study_staff_reg"))) ;
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
                  AV14P_MOVE_KBN = (byte)(GXutil.lval( gxfirstwebparm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14P_MOVE_KBN", GXutil.str( AV14P_MOVE_KBN, 1, 0));
                  if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
                  {
                     AV16P_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16P_STUDY_ID", GXutil.ltrim( GXutil.str( AV16P_STUDY_ID, 10, 0)));
                     AV15P_SITE_ID = httpContext.GetNextPar( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV15P_SITE_ID", AV15P_SITE_ID);
                  }
               }
            }
         }
         GXCCtl = "vD_GRD_CHECK_" + sGXsfl_153_idx ;
         chkavD_grd_check.setName( GXCCtl );
         chkavD_grd_check.setWebtags( "" );
         chkavD_grd_check.setCaption( "" );
         chkavD_grd_check.setCheckedValue( "false" );
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( short nRC_GXsfl_153 ,
                                 short nGXsfl_153_idx ,
                                 String sGXsfl_153_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1532( ) ;
      while ( nGXsfl_153_idx <= nRC_GXsfl_153 )
      {
         sendrow_1532( ) ;
         nGXsfl_153_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_153_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_153_idx+1)) ;
         sGXsfl_153_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_153_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1532( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void refresh( )
   {
      rf172( ) ;
      /* End function Refresh */
   }

   public void rf172( )
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
      wbStart = (short)(153) ;
      nGXsfl_153_idx = (short)(1) ;
      sGXsfl_153_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_153_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1532( ) ;
      nGXsfl_153_Refreshing = (short)(1) ;
      /* Execute user event: e29172 */
      e29172 ();
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
         subsflControlProps_1532( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         /* Using cursor H00172 */
         pr_default.execute(0, new Object[] {AV17W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV5C_APP_ID, AV10H_DISP_DATETIME, AV13H_SRCH_FLG, new Integer(GXPagingFrom2), new Long(GXPagingTo2)});
         nGXsfl_153_idx = (short)(1) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A685TBW01_FREE_SAVE_1 = H00172_A685TBW01_FREE_SAVE_1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A685TBW01_FREE_SAVE_1", A685TBW01_FREE_SAVE_1);
            n685TBW01_FREE_SAVE_1 = H00172_n685TBW01_FREE_SAVE_1[0] ;
            A53TBW01_DISP_DATETIME = H00172_A53TBW01_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
            A52TBW01_APP_ID = H00172_A52TBW01_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
            A51TBW01_SESSION_ID = H00172_A51TBW01_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
            A54TBW01_LINE_NO = H00172_A54TBW01_LINE_NO[0] ;
            /* Execute user event: e30172 */
            e30172 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         pr_default.close(0);
         wbEnd = (short)(153) ;
         wb170( ) ;
      }
      nGXsfl_153_Refreshing = (short)(0) ;
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
      /* Using cursor H00173 */
      pr_default.execute(1, new Object[] {AV17W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id(), AV5C_APP_ID, AV10H_DISP_DATETIME, AV13H_SRCH_FLG});
      GRID1_nRecordCount = H00173_AGRID1_nRecordCount[0] ;
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

   public void strup170( )
   {
      /* Before Start, stand alone formulas. */
      AV35Pgmname = "B402_WP05_STUDY_STAFF_REG" ;
      AV34Pgmdesc = "試験登録（参加スタッフ選択）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_user_id_Enabled = 0 ;
      edtavD_grd_user_nm_Enabled = 0 ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e28172 */
      e28172 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "H_a_paging_sdt"), AV9H_A_PAGING_SDT);
         /* Read variables values. */
         AV11H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
         AV13H_SRCH_FLG = httpContext.cgiGet( edtavH_srch_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_SRCH_FLG", AV13H_SRCH_FLG);
         AV12H_KNGN_FLG = httpContext.cgiGet( edtavH_kngn_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
         AV10H_DISP_DATETIME = httpContext.cgiGet( edtavH_disp_datetime_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_DISP_DATETIME", AV10H_DISP_DATETIME);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CTLREC_CNT");
            GX_FocusControl = edtavCtlrec_cnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( 0 );
         }
         else
         {
            AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( localUtil.ctol( httpContext.cgiGet( edtavCtlrec_cnt_Internalname), ".", ",") );
         }
         /* Read saved values. */
         nRC_GXsfl_153 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_153"), ".", ",")) ;
         AV14P_MOVE_KBN = (byte)(localUtil.ctol( httpContext.cgiGet( "vP_MOVE_KBN"), ".", ",")) ;
         AV16P_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "vP_STUDY_ID"), ".", ",") ;
         AV15P_SITE_ID = httpContext.cgiGet( "vP_SITE_ID") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ".", ",") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ".", ",")) ;
         OldWebcomp1 = httpContext.cgiGet( "W0009") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
         {
            WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
            WebComp_Webcomp1_Component = OldWebcomp1 ;
            WebComp_Webcomp1.componentrestorestate("W0009", "");
         }
         OldWebcomp2 = httpContext.cgiGet( "W0170") ;
         if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
         {
            WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
            WebComp_Webcomp2_Component = OldWebcomp2 ;
            WebComp_Webcomp2.componentrestorestate("W0170", "");
         }
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ".", ",")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_SRCH_FLG"), AV13H_SRCH_FLG) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vH_DISP_DATETIME"), AV10H_DISP_DATETIME) != 0 )
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
      /* Execute user event: e28172 */
      e28172 ();
      if (returnInSub) return;
   }

   public void e28172( )
   {
      /* Start Routine */
      AV5C_APP_ID = "B402" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      AV6C_GAMEN_TITLE = AV34Pgmdesc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6C_GAMEN_TITLE", AV6C_GAMEN_TITLE);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV11H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      AV24W_GRID_READ_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24W_GRID_READ_FLG", AV24W_GRID_READ_FLG);
      if ( (GXutil.strcmp("", AV10H_DISP_DATETIME)==0) )
      {
         GXt_char1 = AV10H_DISP_DATETIME ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
         b402_wp05_study_staff_reg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV10H_DISP_DATETIME = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_DISP_DATETIME", AV10H_DISP_DATETIME);
         if ( AV14P_MOVE_KBN != 0 )
         {
            /* Execute user subroutine: S122 */
            S122 ();
            if (returnInSub) return;
         }
      }
      /* Execute user subroutine: S132 */
      S132 ();
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
         WebComp_Webcomp1.componentprepare(new Object[] {"W0009","",AV17W_A_LOGIN_SDT,AV5C_APP_ID,AV6C_GAMEN_TITLE,AV10H_DISP_DATETIME});
         WebComp_Webcomp1.componentbind(new Object[] {"","","","vH_DISP_DATETIME"});
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
         WebComp_Webcomp2.componentprepare(new Object[] {"W0170",""});
         WebComp_Webcomp2.componentbind(new Object[] {});
      }
   }

   public void e29172( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV11H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV35Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S142 */
         S142 ();
         if (returnInSub) return;
         /* Execute user subroutine: S152 */
         S152 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: S162 */
         S162 ();
         if (returnInSub) return;
      }
      AV11H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11H_INIT_FLG", AV11H_INIT_FLG);
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

   private void e30172( )
   {
      /* Grid1_Load Routine */
      edtTBW01_LINE_NO_Visible = 0 ;
      AV28W_STUDY_STAFF.fromxml(A685TBW01_FREE_SAVE_1, "");
      AV7D_GRD_CHECK = AV28W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_Check() ;
      AV30D_GRD_USER_ID = AV28W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_User_id() ;
      AV8D_GRD_USER_NM = AV28W_STUDY_STAFF.getgxTv_SdtB402_SD02_STUDY_STAFF_User_nm() ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(153) ;
      }
      sendrow_1532( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
   }

   public void e11172( )
   {
      /* 'BTN_REG' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV12H_KNGN_FLG, "") )
      {
         /* Execute user subroutine: S162 */
         S162 ();
         if (returnInSub) return;
         GXv_int3[0] = AV20W_ERR_CD ;
         GXv_char2[0] = AV21W_ERR_MSG ;
         new b402_pc09_study_staff_work_chk(remoteHandle, context).execute( AV5C_APP_ID, AV10H_DISP_DATETIME, GXv_int3, GXv_char2) ;
         b402_wp05_study_staff_reg_impl.this.AV20W_ERR_CD = GXv_int3[0] ;
         b402_wp05_study_staff_reg_impl.this.AV21W_ERR_MSG = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_DISP_DATETIME", AV10H_DISP_DATETIME);
         httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERR_CD", GXutil.ltrim( GXutil.str( AV20W_ERR_CD, 4, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERR_MSG", AV21W_ERR_MSG);
         if ( AV20W_ERR_CD == 0 )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AG00015", "", "", "", "", "", GXv_char2) ;
            b402_wp05_study_staff_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
            GXt_char1 = AV19W_A821_JS ;
            GXv_char2[0] = GXt_char1 ;
            new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV26W_MSG, "", "BTN_REG_EXEC", "", GXv_char2) ;
            b402_wp05_study_staff_reg_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
            AV19W_A821_JS = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19W_A821_JS", AV19W_A821_JS);
         }
         else
         {
            httpContext.GX_msglist.addItem(AV21W_ERR_MSG);
         }
      }
   }

   public void e13172( )
   {
      /* 'BTN_REG_EXEC' Routine */
      if ( new a402_pc02_btn_kengn_check(remoteHandle, context).executeUdp( "REG", AV12H_KNGN_FLG, "") )
      {
         GXv_int3[0] = AV20W_ERR_CD ;
         GXv_char2[0] = AV21W_ERR_MSG ;
         new b402_pc10_study_staff_reg(remoteHandle, context).execute( AV5C_APP_ID, AV10H_DISP_DATETIME, GXv_int3, GXv_char2) ;
         b402_wp05_study_staff_reg_impl.this.AV20W_ERR_CD = GXv_int3[0] ;
         b402_wp05_study_staff_reg_impl.this.AV21W_ERR_MSG = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_DISP_DATETIME", AV10H_DISP_DATETIME);
         httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERR_CD", GXutil.ltrim( GXutil.str( AV20W_ERR_CD, 4, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERR_MSG", AV21W_ERR_MSG);
         if ( AV20W_ERR_CD == 0 )
         {
            new b805_pc01_work_del(remoteHandle, context).execute( AV5C_APP_ID, AV10H_DISP_DATETIME) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
            httpContext.ajax_rsp_assign_attri("", false, "AV10H_DISP_DATETIME", AV10H_DISP_DATETIME);
            GXKey = context.getSiteKey( ) ;
            GXEncryptionTmp = "b402_wp04_study_staff_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_STUDY_ID,10,0))) ;
            httpContext.wjLoc = formatLink("b402_wp04_study_staff_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV21W_ERR_MSG);
         }
      }
   }

   public void e12172( )
   {
      /* 'BTN_CAN' Routine */
      new b805_pc01_work_del(remoteHandle, context).execute( AV5C_APP_ID, AV10H_DISP_DATETIME) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_DISP_DATETIME", AV10H_DISP_DATETIME);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b402_wp04_study_staff_list"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(1,9,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_STUDY_ID,10,0))) ;
      httpContext.wjLoc = formatLink("b402_wp04_study_staff_list") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e31172( )
   {
      /* 'BTN_AUTH' Routine */
      if ( AV7D_GRD_CHECK )
      {
         AV25W_LINE_NO = A54TBW01_LINE_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25W_LINE_NO", GXutil.ltrim( GXutil.str( AV25W_LINE_NO, 10, 0)));
         /* Execute user subroutine: S162 */
         S162 ();
         if (returnInSub) return;
         /* Execute user subroutine: S212 */
         S212 ();
         if (returnInSub) return;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b402_wp06_study_staff_auth_sel"+GXutil.URLEncode(GXutil.rtrim(AV5C_APP_ID)) + "," + GXutil.URLEncode(GXutil.rtrim(AV10H_DISP_DATETIME)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV25W_LINE_NO,10,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16P_STUDY_ID,10,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV15P_SITE_ID)) ;
         httpContext.wjLoc = formatLink("b402_wp06_study_staff_auth_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         GXt_char1 = AV26W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00007", "チェック", "", "", "", "", GXv_char2) ;
         b402_wp05_study_staff_reg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
         httpContext.GX_msglist.addItem(AV26W_MSG);
      }
   }

   public void S152( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      /* Using cursor H00174 */
      pr_default.execute(2, new Object[] {new Long(AV16P_STUDY_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A63TBM21_STUDY_ID = H00174_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A367TBM21_STUDY_NM = H00174_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = H00174_n367TBM21_STUDY_NM[0] ;
         lblTxt_study_Caption = A367TBM21_STUDY_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_study_Internalname, "Caption", lblTxt_study_Caption);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor H00175 */
      pr_default.execute(3, new Object[] {AV15P_SITE_ID});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A57TAM08_SITE_ID = H00175_A57TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
         A319TAM08_SITE_NM = H00175_A319TAM08_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
         n319TAM08_SITE_NM = H00175_n319TAM08_SITE_NM[0] ;
         lblTxt_site_Caption = A319TAM08_SITE_NM ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_site_Internalname, "Caption", lblTxt_site_Caption);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV13H_SRCH_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_SRCH_FLG", AV13H_SRCH_FLG);
      if ( AV14P_MOVE_KBN == 0 )
      {
         GXv_int3[0] = AV20W_ERR_CD ;
         GXv_char2[0] = AV21W_ERR_MSG ;
         new b402_pc07_study_staff_work_init(remoteHandle, context).execute( AV5C_APP_ID, AV10H_DISP_DATETIME, AV16P_STUDY_ID, AV15P_SITE_ID, GXv_int3, GXv_char2) ;
         b402_wp05_study_staff_reg_impl.this.AV20W_ERR_CD = GXv_int3[0] ;
         b402_wp05_study_staff_reg_impl.this.AV21W_ERR_MSG = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
         httpContext.ajax_rsp_assign_attri("", false, "AV10H_DISP_DATETIME", AV10H_DISP_DATETIME);
         httpContext.ajax_rsp_assign_attri("", false, "AV16P_STUDY_ID", GXutil.ltrim( GXutil.str( AV16P_STUDY_ID, 10, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV15P_SITE_ID", AV15P_SITE_ID);
         httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERR_CD", GXutil.ltrim( GXutil.str( AV20W_ERR_CD, 4, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERR_MSG", AV21W_ERR_MSG);
         if ( AV20W_ERR_CD == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp05_study_staff_reg");
            AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
         }
         else
         {
            httpContext.GX_msglist.addItem(AV21W_ERR_MSG);
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp05_study_staff_reg");
         }
      }
      else
      {
         /* Execute user subroutine: S122 */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: S222 */
      S222 ();
      if (returnInSub) return;
   }

   public void S162( )
   {
      /* 'SUB_GRID_TO_WORK' Routine */
      if ( ! AV24W_GRID_READ_FLG )
      {
         AV24W_GRID_READ_FLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24W_GRID_READ_FLG", AV24W_GRID_READ_FLG);
         AV28W_STUDY_STAFF = (SdtB402_SD02_STUDY_STAFF)new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
         /* Start For Each Line in Grid1 */
         nRC_GXsfl_153 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_153"), ".", ",")) ;
         nGXsfl_153_fel_idx = (short)(0) ;
         while ( nGXsfl_153_fel_idx < nRC_GXsfl_153 )
         {
            nGXsfl_153_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_153_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_153_fel_idx+1)) ;
            sGXsfl_153_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_153_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1532( ) ;
            AV7D_GRD_CHECK = GXutil.strtobool( httpContext.cgiGet( chkavD_grd_check.getInternalname())) ;
            A54TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") ;
            AV30D_GRD_USER_ID = httpContext.cgiGet( edtavD_grd_user_id_Internalname) ;
            AV8D_GRD_USER_NM = httpContext.cgiGet( edtavD_grd_user_nm_Internalname) ;
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0170") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0170", "");
            }
            OldWebcomp1 = httpContext.cgiGet( "W0009") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp1_Component)==0) && ! (GXutil.strcmp("", OldWebcomp1)==0) )
            {
               WebComp_Webcomp1 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp1 + "_impl", remoteHandle, context);
               WebComp_Webcomp1_Component = OldWebcomp1 ;
               WebComp_Webcomp1.componentrestorestate("W0009", "");
            }
            OldWebcomp2 = httpContext.cgiGet( "W0170") ;
            if ( (GXutil.strcmp("", WebComp_Webcomp2_Component)==0) && ! (GXutil.strcmp("", OldWebcomp2)==0) )
            {
               WebComp_Webcomp2 = WebUtils.getWebComponent(getClass(), "" + OldWebcomp2 + "_impl", remoteHandle, context);
               WebComp_Webcomp2_Component = OldWebcomp2 ;
               WebComp_Webcomp2.componentrestorestate("W0170", "");
            }
            AV28W_STUDY_STAFF.setgxTv_SdtB402_SD02_STUDY_STAFF_Check( AV7D_GRD_CHECK );
            httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28W_STUDY_STAFF", AV28W_STUDY_STAFF);
            GXv_int3[0] = AV20W_ERR_CD ;
            GXv_char2[0] = AV21W_ERR_MSG ;
            new b402_pc08_study_staff_work_upd(remoteHandle, context).execute( AV5C_APP_ID, AV10H_DISP_DATETIME, A54TBW01_LINE_NO, AV28W_STUDY_STAFF, GXv_int3, GXv_char2) ;
            b402_wp05_study_staff_reg_impl.this.AV20W_ERR_CD = GXv_int3[0] ;
            b402_wp05_study_staff_reg_impl.this.AV21W_ERR_MSG = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
            httpContext.ajax_rsp_assign_attri("", false, "AV10H_DISP_DATETIME", AV10H_DISP_DATETIME);
            httpContext.ajax_rsp_assign_attri("", false, "AV20W_ERR_CD", GXutil.ltrim( GXutil.str( AV20W_ERR_CD, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV21W_ERR_MSG", AV21W_ERR_MSG);
            if ( AV20W_ERR_CD != 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_153_fel_idx == 0 )
         {
            nGXsfl_153_idx = (short)(1) ;
            sGXsfl_153_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_153_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1532( ) ;
         }
         nGXsfl_153_fel_idx = (short)(1) ;
         if ( AV20W_ERR_CD == 0 )
         {
            Application.commit(context, remoteHandle, "DEFAULT", "b402_wp05_study_staff_reg");
         }
         else
         {
            httpContext.GX_msglist.addItem(AV21W_ERR_MSG);
            Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp05_study_staff_reg");
         }
      }
   }

   public void S172( )
   {
      /* 'SUB_SELECT_EDIT' Routine */
   }

   public void S212( )
   {
      /* 'SUB_SESSION_SET' Routine */
      AV27W_SESSION.setValue(AV35Pgmname+"_DISP_DATETIME", AV10H_DISP_DATETIME);
      AV27W_SESSION.setValue(AV35Pgmname+"_PAGE", GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no(), 10, 0));
   }

   public void S122( )
   {
      /* 'SUB_SESSION_GET' Routine */
      AV10H_DISP_DATETIME = AV27W_SESSION.getValue(AV35Pgmname+"_DISP_DATETIME") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10H_DISP_DATETIME", AV10H_DISP_DATETIME);
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(GXutil.lval( AV27W_SESSION.getValue(AV35Pgmname+"_PAGE"))) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
   }

   public void S222( )
   {
      /* 'SUB_SESSION_REMOVE' Routine */
      AV27W_SESSION.remove(AV35Pgmname+"_DISP_DATETIME");
      AV27W_SESSION.remove(AV35Pgmname+"_PAGE");
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV22W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b402_wp05_study_staff_reg_impl.this.AV22W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_ERRCD", AV22W_ERRCD);
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      Form.getJscriptsrc().add("js/acom.js") ;
   }

   public void S132( )
   {
      /* 'SUB_CLER' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      AV13H_SRCH_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_SRCH_FLG", AV13H_SRCH_FLG);
      AV18W_A819_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18W_A819_JS", AV18W_A819_JS);
   }

   public void S192( )
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
      if ( ! (GXutil.strcmp("", AV19W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV19W_A821_JS ;
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
      GXv_char2[0] = AV12H_KNGN_FLG ;
      GXv_char5[0] = AV22W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV5C_APP_ID, GXv_char2, GXv_char5) ;
      b402_wp05_study_staff_reg_impl.this.AV12H_KNGN_FLG = GXv_char2[0] ;
      b402_wp05_study_staff_reg_impl.this.AV22W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5C_APP_ID", AV5C_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV22W_ERRCD", AV22W_ERRCD);
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV35Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b402_wp05_study_staff_reg");
   }

   public void e14172( )
   {
      /* 'PAGE_FIRST' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e15172( )
   {
      /* 'PAGE_LAST' Routine */
      if ( subgrid1_pagecount( ) < 1 )
      {
         AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      }
      else
      {
         AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(subgrid1_pagecount( )) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e16172( )
   {
      /* 'PAGE_BACK' Routine */
      if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e17172( )
   {
      /* 'PAGE_NEXT' Routine */
      if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()+1) );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      }
      httpContext.doAjaxRefresh();
   }

   public void e18172( )
   {
      /* 'PAGE01' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e19172( )
   {
      /* 'PAGE02' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e20172( )
   {
      /* 'PAGE03' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e21172( )
   {
      /* 'PAGE04' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e22172( )
   {
      /* 'PAGE05' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e23172( )
   {
      /* 'PAGE06' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e24172( )
   {
      /* 'PAGE07' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e25172( )
   {
      /* 'PAGE08' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e26172( )
   {
      /* 'PAGE09' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void e27172( )
   {
      /* 'PAGE10' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'SUB_EDIT_PAGE' Routine */
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_row( (short)(subGrid1_Rows) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      AV9H_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Rec_cnt( subgrid1_recordcount( ) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9H_A_PAGING_SDT", AV9H_A_PAGING_SDT);
      GXv_SdtA_PAGING_SDT6[0] = AV9H_A_PAGING_SDT;
      new a820_pc01_paging(remoteHandle, context).execute( GXv_SdtA_PAGING_SDT6) ;
      AV9H_A_PAGING_SDT = GXv_SdtA_PAGING_SDT6[0] ;
      lblTxt_page01_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Caption", lblTxt_page01_Caption);
      lblTxt_page02_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Caption", lblTxt_page02_Caption);
      lblTxt_page03_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Caption", lblTxt_page03_Caption);
      lblTxt_page04_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Caption", lblTxt_page04_Caption);
      lblTxt_page05_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Caption", lblTxt_page05_Caption);
      lblTxt_page06_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Caption", lblTxt_page06_Caption);
      lblTxt_page07_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Caption", lblTxt_page07_Caption);
      lblTxt_page08_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Caption", lblTxt_page08_Caption);
      lblTxt_page09_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Caption", lblTxt_page09_Caption);
      lblTxt_page10_Caption = GXutil.trim( GXutil.str( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10(), 10, 0)) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Caption", lblTxt_page10_Caption);
      tblTbl_page01_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp01() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page01_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page01_Visible, 5, 0)));
      tblTbl_page02_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp02() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page02_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page02_Visible, 5, 0)));
      tblTbl_page03_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp03() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page03_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page03_Visible, 5, 0)));
      tblTbl_page04_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp04() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page04_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page04_Visible, 5, 0)));
      tblTbl_page05_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp05() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page05_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page05_Visible, 5, 0)));
      tblTbl_page06_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp06() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page06_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page06_Visible, 5, 0)));
      tblTbl_page07_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp07() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page07_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page07_Visible, 5, 0)));
      tblTbl_page08_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp08() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page08_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page08_Visible, 5, 0)));
      tblTbl_page09_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp09() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page09_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page09_Visible, 5, 0)));
      tblTbl_page10_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp10() ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_page10_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_page10_Visible, 5, 0)));
      tblTbl_page_Visible = AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_area() ;
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
      if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page01_Caption, ".") )
      {
         lblTxt_page01_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page01_Internalname, "Class", lblTxt_page01_Class);
      }
      else if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page02_Caption, ".") )
      {
         lblTxt_page02_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page02_Internalname, "Class", lblTxt_page02_Class);
      }
      else if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page03_Caption, ".") )
      {
         lblTxt_page03_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page03_Internalname, "Class", lblTxt_page03_Class);
      }
      else if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page04_Caption, ".") )
      {
         lblTxt_page04_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page04_Internalname, "Class", lblTxt_page04_Class);
      }
      else if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page05_Caption, ".") )
      {
         lblTxt_page05_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page05_Internalname, "Class", lblTxt_page05_Class);
      }
      else if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page06_Caption, ".") )
      {
         lblTxt_page06_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page06_Internalname, "Class", lblTxt_page06_Class);
      }
      else if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page07_Caption, ".") )
      {
         lblTxt_page07_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page07_Internalname, "Class", lblTxt_page07_Class);
      }
      else if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page08_Caption, ".") )
      {
         lblTxt_page08_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page08_Internalname, "Class", lblTxt_page08_Class);
      }
      else if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page09_Caption, ".") )
      {
         lblTxt_page09_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page09_Internalname, "Class", lblTxt_page09_Class);
      }
      else if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() == GXutil.val( lblTxt_page10_Caption, ".") )
      {
         lblTxt_page10_Class = "TextBlockPageSel" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_page10_Internalname, "Class", lblTxt_page10_Class);
      }
      if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_back() == 1 )
      {
         lblTxt_back_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      else
      {
         lblTxt_back_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_back_Internalname, "Class", lblTxt_back_Class);
      }
      if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_next() == 1 )
      {
         lblTxt_next_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      else
      {
         lblTxt_next_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_next_Internalname, "Class", lblTxt_next_Class);
      }
      if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_first() == 1 )
      {
         lblTxt_first_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      else
      {
         lblTxt_first_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_first_Internalname, "Class", lblTxt_first_Class);
      }
      if ( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_disp_last() == 1 )
      {
         lblTxt_last_Class = "TextBlockPage" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      else
      {
         lblTxt_last_Class = "TextBlockPageDis" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_last_Internalname, "Class", lblTxt_last_Class);
      }
      subgrid1_gotopage( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) ;
      if ( subgrid1_recordcount( ) <= 0 )
      {
         tblTbl_list_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         if ( ( GXutil.strcmp(AV13H_SRCH_FLG, "1") == 0 ) && ! AV23W_ERRFLG )
         {
            GXt_char1 = AV26W_MSG ;
            GXv_char5[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char5) ;
            b402_wp05_study_staff_reg_impl.this.GXt_char1 = GXv_char5[0] ;
            AV26W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26W_MSG", AV26W_MSG);
            httpContext.GX_msglist.addItem(AV26W_MSG);
         }
      }
      else
      {
         tblTbl_list_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, tblTbl_list_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_list_Visible, 5, 0)));
         lblTxt_rec_cnt_Caption = "(全"+GXutil.trim( GXutil.str( subgrid1_recordcount( ), 10, 0))+"件)" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_rec_cnt_Internalname, "Caption", lblTxt_rec_cnt_Caption);
      }
   }

   public void S182( )
   {
      /* 'SUB_BTN_EDIT' Routine */
      GXt_boolean7 = false ;
      GXv_boolean8[0] = GXt_boolean7 ;
      new a402_pc02_btn_kengn_check(remoteHandle, context).execute( "REG", AV12H_KNGN_FLG, "", GXv_boolean8) ;
      b402_wp05_study_staff_reg_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12H_KNGN_FLG", AV12H_KNGN_FLG);
      lblTxt_btn_reg_Visible = (GXt_boolean7 ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_btn_reg_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTxt_btn_reg_Visible, 5, 0)));
   }

   public void wb_table2_172_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'" + sGXsfl_153_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV11H_INIT_FLG), GXutil.rtrim( localUtil.format( AV11H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'" + sGXsfl_153_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_srch_flg_Internalname, GXutil.rtrim( AV13H_SRCH_FLG), GXutil.rtrim( localUtil.format( AV13H_SRCH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(177);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_srch_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_153_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_kngn_flg_Internalname, GXutil.rtrim( AV12H_KNGN_FLG), GXutil.rtrim( localUtil.format( AV12H_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(178);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_kngn_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "<br>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_exec_Internalname, "TXT_BTN_REG_EXEC", "", "", lblTxt_btn_reg_exec_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG_EXEC\\'."+"'", "", "TextBlock", 5, "", 1, 1, (short)(1), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         wb_table3_180_172( true) ;
      }
      else
      {
         wb_table3_180_172( false) ;
      }
      return  ;
   }

   public void wb_table3_180_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_153_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavCtlrec_cnt_Internalname, GXutil.ltrim( localUtil.ntoc( AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt(), (byte)(10), (byte)(0), ".", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9H_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtlrec_cnt_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_172_172e( true) ;
      }
      else
      {
         wb_table2_172_172e( false) ;
      }
   }

   public void wb_table3_180_172( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_153_idx + "',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_disp_datetime_Internalname, GXutil.rtrim( AV10H_DISP_DATETIME), GXutil.rtrim( localUtil.format( AV10H_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_disp_datetime_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_180_172e( true) ;
      }
      else
      {
         wb_table3_180_172e( false) ;
      }
   }

   public void wb_table1_2_172( boolean wbgen )
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
         wb_table4_6_172( true) ;
      }
      else
      {
         wb_table4_6_172( false) ;
      }
      return  ;
   }

   public void wb_table4_6_172e( boolean wbgen )
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
         wb_table1_2_172e( true) ;
      }
      else
      {
         wb_table1_2_172e( false) ;
      }
   }

   public void wb_table4_6_172( boolean wbgen )
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
         wb_table5_12_172( true) ;
      }
      else
      {
         wb_table5_12_172( false) ;
      }
      return  ;
   }

   public void wb_table5_12_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table6_20_172( true) ;
      }
      else
      {
         wb_table6_20_172( false) ;
      }
      return  ;
   }

   public void wb_table6_20_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:19px\">") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "W0170"+"", GXutil.rtrim( WebComp_Webcomp2_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0170"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Webcomp2_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWebcomp2), GXutil.lower( WebComp_Webcomp2_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0170"+"");
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
         wb_table4_6_172e( true) ;
      }
      else
      {
         wb_table4_6_172e( false) ;
      }
   }

   public void wb_table6_20_172( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_23_172( true) ;
      }
      else
      {
         wb_table7_23_172( false) ;
      }
      return  ;
   }

   public void wb_table7_23_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_20_172e( true) ;
      }
      else
      {
         wb_table6_20_172e( false) ;
      }
   }

   public void wb_table7_23_172( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_26_172( true) ;
      }
      else
      {
         wb_table8_26_172( false) ;
      }
      return  ;
   }

   public void wb_table8_26_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:20px\">") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:bottom\">") ;
         wb_table9_43_172( true) ;
      }
      else
      {
         wb_table9_43_172( false) ;
      }
      return  ;
   }

   public void wb_table9_43_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_23_172e( true) ;
      }
      else
      {
         wb_table7_23_172e( false) ;
      }
   }

   public void wb_table9_43_172( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTbl_list_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_list_Internalname, tblTbl_list_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:25px\">") ;
         wb_table10_46_172( true) ;
      }
      else
      {
         wb_table10_46_172( false) ;
      }
      return  ;
   }

   public void wb_table10_46_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:200px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\"  style=\"height:5px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         wb_table11_142_172( true) ;
      }
      else
      {
         wb_table11_142_172( false) ;
      }
      return  ;
   }

   public void wb_table11_142_172e( boolean wbgen )
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" gxgridid=\"153\">") ;
            sStyleString = "" ;
            GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "FreeStyleGridBase", 0, "", "", 0, 0, sStyleString, "none", 0);
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
            Grid1Column.AddObjectProperty("Value", GXutil.booltostr( AV7D_GRD_CHECK));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTBW01_LINE_NO_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV30D_GRD_USER_ID));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_user_id_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV8D_GRD_USER_NM));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavD_grd_user_nm_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", lblTxt_btn_auth_Caption);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 153 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_153 = (short)(nGXsfl_153_idx-1) ;
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
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_43_172e( true) ;
      }
      else
      {
         wb_table9_43_172e( false) ;
      }
   }

   public void wb_table11_142_172( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_grid_header_Internalname, tblTbl_grid_header_Internalname, "", "TableGridHeader", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:45px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, "参加者", "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:120px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, "ユーザーID", "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:250px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, "ユーザー名", "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockGridHeader", 0, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:70px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table11_142_172e( true) ;
      }
      else
      {
         wb_table11_142_172e( false) ;
      }
   }

   public void wb_table10_46_172( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_page_area_Internalname, tblTbl_page_area_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_rec_cnt_Internalname, lblTxt_rec_cnt_Caption, "", "", lblTxt_rec_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table12_52_172( true) ;
      }
      else
      {
         wb_table12_52_172( false) ;
      }
      return  ;
   }

   public void wb_table12_52_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_46_172e( true) ;
      }
      else
      {
         wb_table10_46_172e( false) ;
      }
   }

   public void wb_table12_52_172( boolean wbgen )
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
         wb_table13_55_172( true) ;
      }
      else
      {
         wb_table13_55_172( false) ;
      }
      return  ;
   }

   public void wb_table13_55_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table14_61_172( true) ;
      }
      else
      {
         wb_table14_61_172( false) ;
      }
      return  ;
   }

   public void wb_table14_61_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table15_67_172( true) ;
      }
      else
      {
         wb_table15_67_172( false) ;
      }
      return  ;
   }

   public void wb_table15_67_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table16_73_172( true) ;
      }
      else
      {
         wb_table16_73_172( false) ;
      }
      return  ;
   }

   public void wb_table16_73_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table17_79_172( true) ;
      }
      else
      {
         wb_table17_79_172( false) ;
      }
      return  ;
   }

   public void wb_table17_79_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table18_85_172( true) ;
      }
      else
      {
         wb_table18_85_172( false) ;
      }
      return  ;
   }

   public void wb_table18_85_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table19_91_172( true) ;
      }
      else
      {
         wb_table19_91_172( false) ;
      }
      return  ;
   }

   public void wb_table19_91_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table20_97_172( true) ;
      }
      else
      {
         wb_table20_97_172( false) ;
      }
      return  ;
   }

   public void wb_table20_97_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table21_103_172( true) ;
      }
      else
      {
         wb_table21_103_172( false) ;
      }
      return  ;
   }

   public void wb_table21_103_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table22_109_172( true) ;
      }
      else
      {
         wb_table22_109_172( false) ;
      }
      return  ;
   }

   public void wb_table22_109_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table23_115_172( true) ;
      }
      else
      {
         wb_table23_115_172( false) ;
      }
      return  ;
   }

   public void wb_table23_115_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table24_121_172( true) ;
      }
      else
      {
         wb_table24_121_172( false) ;
      }
      return  ;
   }

   public void wb_table24_121_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table25_127_172( true) ;
      }
      else
      {
         wb_table25_127_172( false) ;
      }
      return  ;
   }

   public void wb_table25_127_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table26_133_172( true) ;
      }
      else
      {
         wb_table26_133_172( false) ;
      }
      return  ;
   }

   public void wb_table26_133_172e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table12_52_172e( true) ;
      }
      else
      {
         wb_table12_52_172e( false) ;
      }
   }

   public void wb_table26_133_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_last_Internalname, "最後へ", "", "", lblTxt_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_LAST\\'."+"'", "", lblTxt_last_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table26_133_172e( true) ;
      }
      else
      {
         wb_table26_133_172e( false) ;
      }
   }

   public void wb_table25_127_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_next_Internalname, "次へ", "", "", lblTxt_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_NEXT\\'."+"'", "", lblTxt_next_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table25_127_172e( true) ;
      }
      else
      {
         wb_table25_127_172e( false) ;
      }
   }

   public void wb_table24_121_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page10_Internalname, lblTxt_page10_Caption, "", "", lblTxt_page10_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE10\\'."+"'", "", lblTxt_page10_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table24_121_172e( true) ;
      }
      else
      {
         wb_table24_121_172e( false) ;
      }
   }

   public void wb_table23_115_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page09_Internalname, lblTxt_page09_Caption, "", "", lblTxt_page09_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE09\\'."+"'", "", lblTxt_page09_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table23_115_172e( true) ;
      }
      else
      {
         wb_table23_115_172e( false) ;
      }
   }

   public void wb_table22_109_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page08_Internalname, lblTxt_page08_Caption, "", "", lblTxt_page08_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE08\\'."+"'", "", lblTxt_page08_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table22_109_172e( true) ;
      }
      else
      {
         wb_table22_109_172e( false) ;
      }
   }

   public void wb_table21_103_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page07_Internalname, lblTxt_page07_Caption, "", "", lblTxt_page07_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE07\\'."+"'", "", lblTxt_page07_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table21_103_172e( true) ;
      }
      else
      {
         wb_table21_103_172e( false) ;
      }
   }

   public void wb_table20_97_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page06_Internalname, lblTxt_page06_Caption, "", "", lblTxt_page06_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE06\\'."+"'", "", lblTxt_page06_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table20_97_172e( true) ;
      }
      else
      {
         wb_table20_97_172e( false) ;
      }
   }

   public void wb_table19_91_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page05_Internalname, lblTxt_page05_Caption, "", "", lblTxt_page05_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE05\\'."+"'", "", lblTxt_page05_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table19_91_172e( true) ;
      }
      else
      {
         wb_table19_91_172e( false) ;
      }
   }

   public void wb_table18_85_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page04_Internalname, lblTxt_page04_Caption, "", "", lblTxt_page04_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE04\\'."+"'", "", lblTxt_page04_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table18_85_172e( true) ;
      }
      else
      {
         wb_table18_85_172e( false) ;
      }
   }

   public void wb_table17_79_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page03_Internalname, lblTxt_page03_Caption, "", "", lblTxt_page03_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE03\\'."+"'", "", lblTxt_page03_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table17_79_172e( true) ;
      }
      else
      {
         wb_table17_79_172e( false) ;
      }
   }

   public void wb_table16_73_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page02_Internalname, lblTxt_page02_Caption, "", "", lblTxt_page02_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE02\\'."+"'", "", lblTxt_page02_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table16_73_172e( true) ;
      }
      else
      {
         wb_table16_73_172e( false) ;
      }
   }

   public void wb_table15_67_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_page01_Internalname, lblTxt_page01_Caption, "", "", lblTxt_page01_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE01\\'."+"'", "", lblTxt_page01_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table15_67_172e( true) ;
      }
      else
      {
         wb_table15_67_172e( false) ;
      }
   }

   public void wb_table14_61_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_back_Internalname, "前へ", "", "", lblTxt_back_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_BACK\\'."+"'", "", lblTxt_back_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table14_61_172e( true) ;
      }
      else
      {
         wb_table14_61_172e( false) ;
      }
   }

   public void wb_table13_55_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_first_Internalname, "最初へ", "", "", lblTxt_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PAGE_FIRST\\'."+"'", "", lblTxt_first_Class, 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table13_55_172e( true) ;
      }
      else
      {
         wb_table13_55_172e( false) ;
      }
   }

   public void wb_table8_26_172( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:70px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, "試験", "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 295, "px", 0, "px", "SectionWordBreak", "");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_study_Internalname, lblTxt_study_Caption, "", "", lblTxt_study_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"ItemTitle\"  style=\"width:70px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, "施設", "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:300px\">") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSection2_Internalname, 1, 295, "px", 0, "px", "SectionWordBreak", "");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_site_Internalname, lblTxt_site_Caption, "", "", lblTxt_site_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_26_172e( true) ;
      }
      else
      {
         wb_table8_26_172e( false) ;
      }
   }

   public void wb_table5_12_172( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_btn_reg_Internalname, "登録（F3）", "", "", lblTxt_btn_reg_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_REG\\'."+"'", "", "TextBlockBtnList100", 5, "", lblTxt_btn_reg_Visible, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, "戻る（F11）", "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CAN\\'."+"'", "", "TextBlockBtnList100", 5, "", 1, 1, (short)(0), "HLP_B402_WP05_STUDY_STAFF_REG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_12_172e( true) ;
      }
      else
      {
         wb_table5_12_172e( false) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV14P_MOVE_KBN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14P_MOVE_KBN", GXutil.str( AV14P_MOVE_KBN, 1, 0));
      AV16P_STUDY_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16P_STUDY_ID", GXutil.ltrim( GXutil.str( AV16P_STUDY_ID, 10, 0)));
      AV15P_SITE_ID = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15P_SITE_ID", AV15P_SITE_ID);
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
      pa172( ) ;
      ws172( ) ;
      we172( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317174686");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("b402_wp05_study_staff_reg.js", "?20177317174686");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1532( )
   {
      chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_153_idx );
      edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_153_idx ;
      edtavD_grd_user_id_Internalname = "vD_GRD_USER_ID_"+sGXsfl_153_idx ;
      edtavD_grd_user_nm_Internalname = "vD_GRD_USER_NM_"+sGXsfl_153_idx ;
      lblTxt_btn_auth_Internalname = "TXT_BTN_AUTH_"+sGXsfl_153_idx ;
   }

   public void subsflControlProps_fel_1532( )
   {
      chkavD_grd_check.setInternalname( "vD_GRD_CHECK_"+sGXsfl_153_fel_idx );
      edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO_"+sGXsfl_153_fel_idx ;
      edtavD_grd_user_id_Internalname = "vD_GRD_USER_ID_"+sGXsfl_153_fel_idx ;
      edtavD_grd_user_nm_Internalname = "vD_GRD_USER_NM_"+sGXsfl_153_fel_idx ;
      lblTxt_btn_auth_Internalname = "TXT_BTN_AUTH_"+sGXsfl_153_fel_idx ;
   }

   public void sendrow_1532( )
   {
      subsflControlProps_1532( ) ;
      wb170( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_153_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)(((nGXsfl_153_idx-1)/ (double) (1)) % (2))) == 0 )
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
            if ( ( 1 == 0 ) && ( nGXsfl_153_idx == 1 ) )
            {
               httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_153_idx+"\">") ;
            }
            if ( 1 > 0 )
            {
               if ( ( 1 == 1 ) || ( ((int)((nGXsfl_153_idx) % (1))) - 1 == 0 ) )
               {
                  httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" gxrow=\""+sGXsfl_153_idx+"\">") ;
               }
            }
         }
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""});
         /* Table start */
         Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTbl_grid_Internalname+"_"+sGXsfl_153_idx,new Integer(1),"TableGridTM-1","","","","","","",new Integer(0),new Integer(1),"","","","px","px"});
         Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:45px\""});
         /* Check box */
         TempTags = " " + ((chkavD_grd_check.getEnabled()!=0)&&(chkavD_grd_check.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 159,'',false,'"+sGXsfl_153_idx+"',153)\"" : " ") ;
         ClassString = "ReadonlyAttributeImeOff" ;
         StyleString = "" ;
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavD_grd_check.getInternalname(),GXutil.booltostr( AV7D_GRD_CHECK),"",new Integer(1),new Integer(1),"true","",StyleString,ClassString,"",TempTags+((chkavD_grd_check.getEnabled()!=0)&&(chkavD_grd_check.getVisible()!=0) ? " onclick=\"gx.fn.checkboxClick(159, this, 'true', 'false');gx.evt.onchange(this);\" " : " ")+((chkavD_grd_check.getEnabled()!=0)&&(chkavD_grd_check.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(159);\"" : " ")});
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTBW01_LINE_NO_Internalname,GXutil.ltrim( localUtil.ntoc( A54TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")),localUtil.format( DecimalUtil.doubleToDec(A54TBW01_LINE_NO), "ZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTBW01_LINE_NO_Jsonclick,new Integer(0),"Attribute","color:#FF0000;",ROClassString,"",new Integer(edtTBW01_LINE_NO_Visible),new Integer(0),new Integer(0),"text","",new Integer(10),"chr",new Integer(1),"row",new Integer(10),new Integer(0),new Integer(0),new Integer(153),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:120px\""});
         /* Div Control */
         Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection3_Internalname+"_"+sGXsfl_153_idx,new Integer(1),new Integer(115),"px",new Integer(0),"px","SectionWordBreak",""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_user_id_Enabled!=0)&&(edtavD_grd_user_id_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 163,'',false,'"+sGXsfl_153_idx+"',153)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_user_id_Internalname,GXutil.rtrim( AV30D_GRD_USER_ID),"",TempTags+((edtavD_grd_user_id_Enabled!=0)&&(edtavD_grd_user_id_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_user_id_Enabled!=0)&&(edtavD_grd_user_id_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(163);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_user_id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_user_id_Enabled),new Integer(0),"text","",new Integer(80),"chr",new Integer(1),"row",new Integer(128),new Integer(0),new Integer(0),new Integer(153),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:250px\""});
         /* Single line edit */
         TempTags = " " + ((edtavD_grd_user_nm_Enabled!=0)&&(edtavD_grd_user_nm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 165,'',false,'"+sGXsfl_153_idx+"',153)\"" : " ") ;
         ROClassString = "ReadonlyAttribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavD_grd_user_nm_Internalname,GXutil.rtrim( AV8D_GRD_USER_NM),"",TempTags+((edtavD_grd_user_nm_Enabled!=0)&&(edtavD_grd_user_nm_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavD_grd_user_nm_Enabled!=0)&&(edtavD_grd_user_nm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(165);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavD_grd_user_nm_Jsonclick,new Integer(0),"ReadonlyAttribute","",ROClassString,"",new Integer(1),new Integer(edtavD_grd_user_nm_Enabled),new Integer(0),"text","",new Integer(30),"chr",new Integer(1),"row",new Integer(30),new Integer(0),new Integer(0),new Integer(153),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
         if ( Grid1Container.GetWrapped() == 1 )
         {
            Grid1Container.CloseTag("cell");
         }
         Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"",""+" style=\"width:70px\""});
         /* Text block */
         Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTxt_btn_auth_Internalname,"権限","","",lblTxt_btn_auth_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'BTN_AUTH\\'."+sGXsfl_153_idx+"'","","TextBlockBtn060s",new Integer(5),"",new Integer(1),new Integer(1),new Integer(0)});
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
         /* End of Columns property logic. */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            if ( 1 > 0 )
            {
               if ( ((int)((nGXsfl_153_idx) % (1))) == 0 )
               {
                  httpContext.writeTextNL( "</tr>") ;
               }
            }
         }
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_153_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_153_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_153_idx+1)) ;
         sGXsfl_153_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_153_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1532( ) ;
      }
      /* End function sendrow_1532 */
   }

   public void init_default_properties( )
   {
      lblTxt_btn_reg_Internalname = "TXT_BTN_REG" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      cellMenu_bg_Internalname = "MENU_BG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      lblTxt_study_Internalname = "TXT_STUDY" ;
      divSection1_Internalname = "SECTION1" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      lblTxt_site_Internalname = "TXT_SITE" ;
      divSection2_Internalname = "SECTION2" ;
      tblTable10_Internalname = "TABLE10" ;
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
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      tblTbl_grid_header_Internalname = "TBL_GRID_HEADER" ;
      divSection3_Internalname = "SECTION3" ;
      tblTbl_grid_Internalname = "TBL_GRID" ;
      tblTbl_list_Internalname = "TBL_LIST" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      edtavH_srch_flg_Internalname = "vH_SRCH_FLG" ;
      edtavH_kngn_flg_Internalname = "vH_KNGN_FLG" ;
      lblTxt_btn_reg_exec_Internalname = "TXT_BTN_REG_EXEC" ;
      edtavH_disp_datetime_Internalname = "vH_DISP_DATETIME" ;
      tblTable5_Internalname = "TABLE5" ;
      edtavCtlrec_cnt_Internalname = "CTLREC_CNT" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_grd_user_nm_Jsonclick = "" ;
      edtavD_grd_user_nm_Visible = 1 ;
      edtavD_grd_user_id_Jsonclick = "" ;
      edtavD_grd_user_id_Visible = 1 ;
      edtTBW01_LINE_NO_Jsonclick = "" ;
      chkavD_grd_check.setVisible( 1 );
      chkavD_grd_check.setEnabled( 1 );
      subGrid1_Class = "FreeStyleGridBase" ;
      lblTxt_btn_reg_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTxt_btn_auth_Caption = "権限" ;
      edtavD_grd_user_nm_Enabled = 1 ;
      edtavD_grd_user_id_Enabled = 1 ;
      edtTBW01_LINE_NO_Visible = 1 ;
      edtavH_disp_datetime_Jsonclick = "" ;
      edtavCtlrec_cnt_Jsonclick = "" ;
      edtavH_kngn_flg_Jsonclick = "" ;
      edtavH_srch_flg_Jsonclick = "" ;
      edtavH_init_flg_Jsonclick = "" ;
      lblTxt_rec_cnt_Caption = "(全100件)" ;
      tblTbl_list_Visible = 1 ;
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
      lblTxt_site_Caption = "施設名" ;
      lblTxt_study_Caption = "試験名" ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
      subGrid1_Borderwidth = (short)(0) ;
      subGrid1_Backcolorstyle = (byte)(0) ;
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
                  /* Execute user subroutine: S232 */
                  S232 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      wcpOAV15P_SITE_ID = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15P_SITE_ID = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV13H_SRCH_FLG = "" ;
      AV10H_DISP_DATETIME = "" ;
      AV9H_A_PAGING_SDT = new SdtA_PAGING_SDT(remoteHandle, context);
      AV5C_APP_ID = "" ;
      AV35Pgmname = "" ;
      A367TBM21_STUDY_NM = "" ;
      A57TAM08_SITE_ID = "" ;
      A319TAM08_SITE_NM = "" ;
      AV19W_A821_JS = "" ;
      A685TBW01_FREE_SAVE_1 = "" ;
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
      edtTBW01_LINE_NO_Internalname = "" ;
      AV30D_GRD_USER_ID = "" ;
      edtavD_grd_user_id_Internalname = "" ;
      AV8D_GRD_USER_NM = "" ;
      edtavD_grd_user_nm_Internalname = "" ;
      GXDecQS = "" ;
      GXCCtl = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      scmdbuf = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      H00172_A685TBW01_FREE_SAVE_1 = new String[] {""} ;
      H00172_n685TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      H00172_A53TBW01_DISP_DATETIME = new String[] {""} ;
      H00172_A52TBW01_APP_ID = new String[] {""} ;
      H00172_A51TBW01_SESSION_ID = new String[] {""} ;
      H00172_A54TBW01_LINE_NO = new long[1] ;
      A53TBW01_DISP_DATETIME = "" ;
      A52TBW01_APP_ID = "" ;
      A51TBW01_SESSION_ID = "" ;
      H00173_AGRID1_nRecordCount = new long[1] ;
      AV34Pgmdesc = "" ;
      AV11H_INIT_FLG = "" ;
      AV12H_KNGN_FLG = "" ;
      AV6C_GAMEN_TITLE = "" ;
      AV28W_STUDY_STAFF = new SdtB402_SD02_STUDY_STAFF(remoteHandle, context);
      AV21W_ERR_MSG = "" ;
      AV26W_MSG = "" ;
      H00174_A63TBM21_STUDY_ID = new long[1] ;
      H00174_A367TBM21_STUDY_NM = new String[] {""} ;
      H00174_n367TBM21_STUDY_NM = new boolean[] {false} ;
      H00175_A57TAM08_SITE_ID = new String[] {""} ;
      H00175_A319TAM08_SITE_NM = new String[] {""} ;
      H00175_n319TAM08_SITE_NM = new boolean[] {false} ;
      GXv_int3 = new short [1] ;
      AV27W_SESSION = httpContext.getWebSession();
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV22W_ERRCD = "" ;
      AV18W_A819_JS = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtA_PAGING_SDT6 = new SdtA_PAGING_SDT [1] ;
      GXt_char1 = "" ;
      GXv_char5 = new String [1] ;
      GXv_boolean8 = new boolean [1] ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      lblTxt_btn_reg_exec_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblTextblock18_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
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
      lblTxt_study_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTxt_site_Jsonclick = "" ;
      lblTxt_btn_reg_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      lblTxt_btn_auth_Internalname = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      lblTxt_btn_auth_Jsonclick = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_wp05_study_staff_reg__default(),
         new Object[] {
             new Object[] {
            H00172_A685TBW01_FREE_SAVE_1, H00172_n685TBW01_FREE_SAVE_1, H00172_A53TBW01_DISP_DATETIME, H00172_A52TBW01_APP_ID, H00172_A51TBW01_SESSION_ID, H00172_A54TBW01_LINE_NO
            }
            , new Object[] {
            H00173_AGRID1_nRecordCount
            }
            , new Object[] {
            H00174_A63TBM21_STUDY_ID, H00174_A367TBM21_STUDY_NM, H00174_n367TBM21_STUDY_NM
            }
            , new Object[] {
            H00175_A57TAM08_SITE_ID, H00175_A319TAM08_SITE_NM, H00175_n319TAM08_SITE_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV35Pgmname = "B402_WP05_STUDY_STAFF_REG" ;
      AV34Pgmdesc = "試験登録（参加スタッフ選択）" ;
      /* GeneXus formulas. */
      AV35Pgmname = "B402_WP05_STUDY_STAFF_REG" ;
      AV34Pgmdesc = "試験登録（参加スタッフ選択）" ;
      Gx_err = (short)(0) ;
      edtavD_grd_user_id_Enabled = 0 ;
      edtavD_grd_user_nm_Enabled = 0 ;
      WebComp_Webcomp1 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Webcomp2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV14P_MOVE_KBN ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV14P_MOVE_KBN ;
   private byte GRID1_nEOF ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_153 ;
   private short nGXsfl_153_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short subGrid1_Borderwidth ;
   private short nGXsfl_153_Refreshing=0 ;
   private short Gx_err ;
   private short AV20W_ERR_CD ;
   private short nGXsfl_153_fel_idx=1 ;
   private short GXv_int3[] ;
   private int subGrid1_Rows ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int edtavD_grd_user_id_Enabled ;
   private int edtavD_grd_user_nm_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int edtTBW01_LINE_NO_Visible ;
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
   private int tblTbl_list_Visible ;
   private int lblTxt_btn_reg_Visible ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavD_grd_user_id_Visible ;
   private int edtavD_grd_user_nm_Visible ;
   private long wcpOAV16P_STUDY_ID ;
   private long AV16P_STUDY_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long A63TBM21_STUDY_ID ;
   private long A54TBW01_LINE_NO ;
   private long GXPagingTo2 ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long AV25W_LINE_NO ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_153_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV35Pgmname ;
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
   private String edtTBW01_LINE_NO_Internalname ;
   private String edtavD_grd_user_id_Internalname ;
   private String edtavD_grd_user_nm_Internalname ;
   private String GXDecQS ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV34Pgmdesc ;
   private String edtavH_init_flg_Internalname ;
   private String edtavH_srch_flg_Internalname ;
   private String edtavH_kngn_flg_Internalname ;
   private String edtavH_disp_datetime_Internalname ;
   private String edtavCtlrec_cnt_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String lblTxt_study_Caption ;
   private String lblTxt_study_Internalname ;
   private String lblTxt_site_Caption ;
   private String lblTxt_site_Internalname ;
   private String sGXsfl_153_fel_idx="0001" ;
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
   private String tblTbl_list_Internalname ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String lblTxt_rec_cnt_Caption ;
   private String lblTxt_rec_cnt_Internalname ;
   private String lblTxt_btn_reg_Internalname ;
   private String sStyleString ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String edtavH_srch_flg_Jsonclick ;
   private String edtavH_kngn_flg_Jsonclick ;
   private String lblTxt_btn_reg_exec_Internalname ;
   private String lblTxt_btn_reg_exec_Jsonclick ;
   private String edtavCtlrec_cnt_Jsonclick ;
   private String tblTable5_Internalname ;
   private String edtavH_disp_datetime_Jsonclick ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String cellMenu_bg_Internalname ;
   private String tblTable3_Internalname ;
   private String tblTable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String subGrid1_Internalname ;
   private String lblTxt_btn_auth_Caption ;
   private String tblTbl_grid_header_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String tblTbl_page_area_Internalname ;
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
   private String divSection1_Internalname ;
   private String lblTxt_study_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String divSection2_Internalname ;
   private String lblTxt_site_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTxt_btn_reg_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String lblTxt_btn_auth_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTbl_grid_Internalname ;
   private String ROClassString ;
   private String edtTBW01_LINE_NO_Jsonclick ;
   private String divSection3_Internalname ;
   private String edtavD_grd_user_id_Jsonclick ;
   private String edtavD_grd_user_nm_Jsonclick ;
   private String lblTxt_btn_auth_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV24W_GRID_READ_FLG ;
   private boolean AV23W_ERRFLG ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV7D_GRD_CHECK ;
   private boolean n685TBW01_FREE_SAVE_1 ;
   private boolean returnInSub ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n319TAM08_SITE_NM ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String A685TBW01_FREE_SAVE_1 ;
   private String wcpOAV15P_SITE_ID ;
   private String AV15P_SITE_ID ;
   private String AV13H_SRCH_FLG ;
   private String AV10H_DISP_DATETIME ;
   private String AV5C_APP_ID ;
   private String A367TBM21_STUDY_NM ;
   private String A57TAM08_SITE_ID ;
   private String A319TAM08_SITE_NM ;
   private String AV19W_A821_JS ;
   private String AV30D_GRD_USER_ID ;
   private String AV8D_GRD_USER_NM ;
   private String A53TBW01_DISP_DATETIME ;
   private String A52TBW01_APP_ID ;
   private String A51TBW01_SESSION_ID ;
   private String AV11H_INIT_FLG ;
   private String AV12H_KNGN_FLG ;
   private String AV6C_GAMEN_TITLE ;
   private String AV21W_ERR_MSG ;
   private String AV26W_MSG ;
   private String AV22W_ERRCD ;
   private String AV18W_A819_JS ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Webcomp1 ;
   private GXWebComponent WebComp_Webcomp2 ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private ICheckbox chkavD_grd_check ;
   private IDataStoreProvider pr_default ;
   private String[] H00172_A685TBW01_FREE_SAVE_1 ;
   private boolean[] H00172_n685TBW01_FREE_SAVE_1 ;
   private String[] H00172_A53TBW01_DISP_DATETIME ;
   private String[] H00172_A52TBW01_APP_ID ;
   private String[] H00172_A51TBW01_SESSION_ID ;
   private long[] H00172_A54TBW01_LINE_NO ;
   private long[] H00173_AGRID1_nRecordCount ;
   private long[] H00174_A63TBM21_STUDY_ID ;
   private String[] H00174_A367TBM21_STUDY_NM ;
   private boolean[] H00174_n367TBM21_STUDY_NM ;
   private String[] H00175_A57TAM08_SITE_ID ;
   private String[] H00175_A319TAM08_SITE_NM ;
   private boolean[] H00175_n319TAM08_SITE_NM ;
   private com.genexus.webpanels.WebSession AV27W_SESSION ;
   private SdtA_PAGING_SDT AV9H_A_PAGING_SDT ;
   private SdtA_PAGING_SDT GXv_SdtA_PAGING_SDT6[] ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
   private SdtB402_SD02_STUDY_STAFF AV28W_STUDY_STAFF ;
}

final  class b402_wp05_study_staff_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00172", "SELECT `TBW01_FREE_SAVE_1`, `TBW01_DISP_DATETIME`, `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE (`TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ?) AND (? = '1') ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`  LIMIT ?, ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00173", "SELECT COUNT(*) FROM `TBW01_FREE_WORK` WHERE (`TBW01_SESSION_ID` = ? and `TBW01_APP_ID` = ? and `TBW01_DISP_DATETIME` = ?) AND (? = '1') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H00174", "SELECT `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ORDER BY `TBM21_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00175", "SELECT `TAM08_SITE_ID`, `TAM08_SITE_NM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ORDER BY `TAM08_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               stmt.setVarchar(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               stmt.setVarchar(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
      }
   }

}

