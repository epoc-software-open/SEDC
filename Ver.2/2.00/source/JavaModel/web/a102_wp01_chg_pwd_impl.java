/*
               File: a102_wp01_chg_pwd_impl
        Description: パスワード変更
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:43.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a102_wp01_chg_pwd_impl extends GXWebPanel
{
   public a102_wp01_chg_pwd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public a102_wp01_chg_pwd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a102_wp01_chg_pwd_impl.class ));
   }

   public a102_wp01_chg_pwd_impl( int remoteHandle ,
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
         pa0G2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws0G2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we0G2( ) ;
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
      httpContext.writeValue( "パスワード変更") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317164354");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("a102_wp01_chg_pwd") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0G2( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
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
      return "A102_WP01_CHG_PWD" ;
   }

   public String getPgmdesc( )
   {
      return "パスワード変更" ;
   }

   public void wb0G0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_0G2( true) ;
      }
      else
      {
         wb_table1_2_0G2( false) ;
      }
      return  ;
   }

   public void wb_table1_2_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      wbLoad = true ;
   }

   public void start0G2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "パスワード変更", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0G0( ) ;
   }

   public void ws0G2( )
   {
      start0G2( ) ;
      evt0G2( ) ;
   }

   public void evt0G2( )
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
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e110G2 */
                        e110G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_END'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e120G2 */
                        e120G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e130G2 */
                        e130G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e140G2 */
                        e140G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'BTN_UPD_EXEC'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e150G2 */
                        e150G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e160G2 */
                        e160G2 ();
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
                        /* No code required for Cancel button. It is implemented as the Reset button. */
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
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0G2( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0G2( ) ;
         }
      }
   }

   public void pa0G2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
         }
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf0G2( ) ;
      /* End function Refresh */
   }

   public void rf0G2( )
   {
      /* Execute user event: e140G2 */
      e140G2 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: e160G2 */
         e160G2 ();
         wb0G0( ) ;
      }
   }

   public void strup0G0( )
   {
      /* Before Start, stand alone formulas. */
      AV23Pgmname = "A102_WP01_CHG_PWD" ;
      Gx_err = (short)(0) ;
      edtavD_tam07_user_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_user_id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavD_tam07_user_id_Enabled, 5, 0)));
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e130G2 */
      e130G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV12D_TAM07_USER_ID = httpContext.cgiGet( edtavD_tam07_user_id_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_USER_ID", AV12D_TAM07_USER_ID);
         AV9D_TAM07_PWD = httpContext.cgiGet( edtavD_tam07_pwd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9D_TAM07_PWD", AV9D_TAM07_PWD);
         AV11D_TAM07_PWD_NEW = httpContext.cgiGet( edtavD_tam07_pwd_new_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD_NEW", AV11D_TAM07_PWD_NEW);
         AV10D_TAM07_PWD_CFM = httpContext.cgiGet( edtavD_tam07_pwd_cfm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10D_TAM07_PWD_CFM", AV10D_TAM07_PWD_CFM);
         AV13H_INIT_FLG = httpContext.cgiGet( edtavH_init_flg_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
         /* Read saved values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e130G2 */
      e130G2 ();
      if (returnInSub) return;
   }

   public void e130G2( )
   {
      /* Start Routine */
      AV8C_TAM02_APP_ID = "A102" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8C_TAM02_APP_ID", AV8C_TAM02_APP_ID);
      /* Execute user subroutine: S112 */
      S112 ();
      if (returnInSub) return;
      tblTbl_hidden_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTbl_hidden_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTbl_hidden_Visible, 5, 0)));
      AV13H_INIT_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
      lblTxt_js_event_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
      /* Execute user subroutine: S122 */
      S122 ();
      if (returnInSub) return;
   }

   public void e140G2( )
   {
      /* Refresh Routine */
      if ( GXutil.strcmp(AV13H_INIT_FLG, "0") == 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "INFO", "画面起動") ;
         /* Execute user subroutine: S132 */
         S132 ();
         if (returnInSub) return;
         GX_FocusControl = edtavD_tam07_pwd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      AV13H_INIT_FLG = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13H_INIT_FLG", AV13H_INIT_FLG);
      /* Execute user subroutine: S142 */
      S142 ();
      if (returnInSub) return;
   }

   public void e110G2( )
   {
      /* 'BTN_UPD' Routine */
      AV17W_ERRFLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
      /* Execute user subroutine: S152 */
      S152 ();
      if (returnInSub) return;
      if ( ! AV17W_ERRFLG )
      {
         GXt_char1 = AV19W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AG00016", "", "", "", "", "", GXv_char2) ;
         a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
         GXt_char1 = AV15W_A821_JS ;
         GXv_char2[0] = GXt_char1 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK_CANCEL", AV19W_MSG, "", "BTN_UPD_EXEC", "", GXv_char2) ;
         a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
         AV15W_A821_JS = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15W_A821_JS", AV15W_A821_JS);
      }
   }

   public void e150G2( )
   {
      /* 'BTN_UPD_EXEC' Routine */
      AV5BC_TAM07_USER.Load(AV14W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id());
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new b801_pc01_md5(remoteHandle, context).execute( AV11D_TAM07_PWD_NEW, GXv_char2) ;
      a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD_NEW", AV11D_TAM07_PWD_NEW);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_pwd( GXt_char1 );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_user_id( AV14W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( AV23Pgmname );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5BC_TAM07_USER", AV5BC_TAM07_USER);
      AV5BC_TAM07_USER.Save();
      if ( AV5BC_TAM07_USER.Success() )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "a102_wp01_chg_pwd");
         GXt_char1 = AV19W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AG00007", "", "", "", "", "", GXv_char2) ;
         a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
         GXt_char1 = AV15W_A821_JS ;
         GXv_char2[0] = GXt_char1 ;
         new a821_pc01_msgbox(remoteHandle, context).execute( "OK", AV19W_MSG, "", "BTN_END", "", GXv_char2) ;
         a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
         AV15W_A821_JS = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15W_A821_JS", AV15W_A821_JS);
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "a102_wp01_chg_pwd");
         AV7C_BCMSGS = AV5BC_TAM07_USER.GetMessages() ;
         AV24GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24GXV1", GXutil.ltrim( GXutil.str( AV24GXV1, 8, 0)));
         while ( AV24GXV1 <= AV7C_BCMSGS.size() )
         {
            AV6C_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV7C_BCMSGS.elementAt(-1+AV24GXV1));
            if ( GXutil.strcmp(AV6C_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
            {
               GXt_char1 = AV19W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
               a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
               AV19W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
            }
            else
            {
               AV19W_MSG = AV6C_BCMSG.getgxTv_SdtMessages_Message_Description() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
            }
            AV24GXV1 = (int)(AV24GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24GXV1", GXutil.ltrim( GXutil.str( AV24GXV1, 8, 0)));
         }
         httpContext.GX_msglist.addItem(AV19W_MSG);
      }
   }

   public void e120G2( )
   {
      /* 'BTN_END' Routine */
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S152( )
   {
      /* 'SUB_INPUT_CHK' Routine */
      /* Execute user subroutine: S162 */
      S162 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV9D_TAM07_PWD)==0) )
      {
         GXt_char1 = AV19W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "現パスワード", "", "", "", "", GXv_char2) ;
         a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
         httpContext.GX_msglist.addItem(AV19W_MSG);
         edtavD_tam07_pwd_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_Backcolor, 9, 0)));
         if ( ! AV17W_ERRFLG )
         {
            GX_FocusControl = edtavD_tam07_pwd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         AV17W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
      }
      else
      {
         AV25GXLvl195 = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25GXLvl195", GXutil.str( AV25GXLvl195, 1, 0));
         /* Using cursor H000G2 */
         pr_default.execute(0, new Object[] {AV14W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id()});
         if ( Gx_err != 0 )
         {
            AV25GXLvl195 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25GXLvl195", GXutil.str( AV25GXLvl195, 1, 0));
         }
         while ( (pr_default.getStatus(0) != 101) )
         {
            A55TAM07_USER_ID = H000G2_A55TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
            A214TAM07_DEL_FLG = H000G2_A214TAM07_DEL_FLG[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A214TAM07_DEL_FLG", A214TAM07_DEL_FLG);
            n214TAM07_DEL_FLG = H000G2_n214TAM07_DEL_FLG[0] ;
            A210TAM07_PWD = H000G2_A210TAM07_PWD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A210TAM07_PWD", A210TAM07_PWD);
            n210TAM07_PWD = H000G2_n210TAM07_PWD[0] ;
            AV25GXLvl195 = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25GXLvl195", GXutil.str( AV25GXLvl195, 1, 0));
            if ( GXutil.strcmp(A214TAM07_DEL_FLG, "0") == 0 )
            {
               GXt_char1 = AV20W_TAM07_PWD ;
               GXv_char2[0] = GXt_char1 ;
               new b801_pc01_md5(remoteHandle, context).execute( AV9D_TAM07_PWD, GXv_char2) ;
               a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9D_TAM07_PWD", AV9D_TAM07_PWD);
               AV20W_TAM07_PWD = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20W_TAM07_PWD", AV20W_TAM07_PWD);
               if ( GXutil.strcmp(A210TAM07_PWD, AV20W_TAM07_PWD) != 0 )
               {
                  GXt_char1 = AV19W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00002", "現パスワード", "", "", "", "", GXv_char2) ;
                  a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
                  AV19W_MSG = GXt_char1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
                  httpContext.GX_msglist.addItem(AV19W_MSG);
                  edtavD_tam07_pwd_Backcolor = UIFactory.getColor( 255, 192, 203) ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_Backcolor, 9, 0)));
                  if ( ! AV17W_ERRFLG )
                  {
                     GX_FocusControl = edtavD_tam07_pwd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  AV17W_ERRFLG = true ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
               }
            }
            else
            {
               GXt_char1 = AV19W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00013", "", "", "", "", "", GXv_char2) ;
               a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
               AV19W_MSG = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
               httpContext.GX_msglist.addItem(AV19W_MSG);
               edtavD_tam07_pwd_Backcolor = UIFactory.getColor( 255, 192, 203) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_Backcolor, 9, 0)));
               if ( ! AV17W_ERRFLG )
               {
                  GX_FocusControl = edtavD_tam07_pwd_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               AV17W_ERRFLG = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV25GXLvl195 == 0 )
         {
            GXt_char1 = AV19W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
            AV19W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
            httpContext.GX_msglist.addItem(AV19W_MSG);
            edtavD_tam07_user_id_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_user_id_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_user_id_Backcolor, 9, 0)));
            edtavD_tam07_pwd_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_Backcolor, 9, 0)));
            if ( ! AV17W_ERRFLG )
            {
               GX_FocusControl = edtavD_tam07_pwd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            AV17W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
         }
      }
      if ( (GXutil.strcmp("", AV11D_TAM07_PWD_NEW)==0) )
      {
         GXt_char1 = AV19W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "新パスワード", "", "", "", "", GXv_char2) ;
         a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
         httpContext.GX_msglist.addItem(AV19W_MSG);
         edtavD_tam07_pwd_new_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_new_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_new_Backcolor, 9, 0)));
         if ( ! AV17W_ERRFLG )
         {
            GX_FocusControl = edtavD_tam07_pwd_new_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         AV17W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
      }
      else
      {
         if ( new a807_pc02_1byte_check(remoteHandle, context).executeUdp( AV11D_TAM07_PWD_NEW) != 0 )
         {
            GXt_char1 = AV19W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00020", "新パスワード", "", "", "", "", GXv_char2) ;
            a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
            AV19W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
            httpContext.GX_msglist.addItem(AV19W_MSG);
            edtavD_tam07_pwd_new_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_new_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_new_Backcolor, 9, 0)));
            if ( ! AV17W_ERRFLG )
            {
               GX_FocusControl = edtavD_tam07_pwd_new_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            AV17W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
         }
      }
      if ( (GXutil.strcmp("", AV10D_TAM07_PWD_CFM)==0) )
      {
         GXt_char1 = AV19W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "確認パスワード", "", "", "", "", GXv_char2) ;
         a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
         httpContext.GX_msglist.addItem(AV19W_MSG);
         edtavD_tam07_pwd_cfm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_cfm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_cfm_Backcolor, 9, 0)));
         if ( ! AV17W_ERRFLG )
         {
            GX_FocusControl = edtavD_tam07_pwd_cfm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         AV17W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
      }
      else
      {
         if ( new a807_pc02_1byte_check(remoteHandle, context).executeUdp( AV10D_TAM07_PWD_CFM) != 0 )
         {
            GXt_char1 = AV19W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00020", "確認パスワード", "", "", "", "", GXv_char2) ;
            a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
            AV19W_MSG = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
            httpContext.GX_msglist.addItem(AV19W_MSG);
            edtavD_tam07_pwd_cfm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_cfm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_cfm_Backcolor, 9, 0)));
            if ( ! AV17W_ERRFLG )
            {
               GX_FocusControl = edtavD_tam07_pwd_cfm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            AV17W_ERRFLG = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
         }
      }
      if ( ( GXutil.strcmp(AV11D_TAM07_PWD_NEW, AV10D_TAM07_PWD_CFM) != 0 ) && ! (GXutil.strcmp("", AV11D_TAM07_PWD_NEW)==0) && ! (GXutil.strcmp("", AV10D_TAM07_PWD_CFM)==0) )
      {
         GXt_char1 = AV19W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00009", "", "", "", "", "", GXv_char2) ;
         a102_wp01_chg_pwd_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19W_MSG = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19W_MSG", AV19W_MSG);
         httpContext.GX_msglist.addItem(AV19W_MSG);
         edtavD_tam07_pwd_new_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_new_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_new_Backcolor, 9, 0)));
         edtavD_tam07_pwd_cfm_Backcolor = UIFactory.getColor( 255, 192, 203) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_cfm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_cfm_Backcolor, 9, 0)));
         if ( ! AV17W_ERRFLG )
         {
            GX_FocusControl = edtavD_tam07_pwd_cfm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         AV17W_ERRFLG = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17W_ERRFLG", AV17W_ERRFLG);
      }
   }

   public void S162( )
   {
      /* 'SUB_BACKCOLOR_INIT' Routine */
      edtavD_tam07_pwd_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_Backcolor, 9, 0)));
      edtavD_tam07_pwd_new_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_new_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_new_Backcolor, 9, 0)));
      edtavD_tam07_pwd_cfm_Backcolor = UIFactory.getColor( 255, 255, 255) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavD_tam07_pwd_cfm_Internalname, "Backcolor", GXutil.ltrim( GXutil.str( edtavD_tam07_pwd_cfm_Backcolor, 9, 0)));
   }

   public void S132( )
   {
      /* 'SUB_ITEM_EDIT' Routine */
      AV12D_TAM07_USER_ID = AV14W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12D_TAM07_USER_ID", AV12D_TAM07_USER_ID);
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV14W_A_LOGIN_SDT;
      GXv_char2[0] = AV16W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV14W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      a102_wp01_chg_pwd_impl.this.AV16W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16W_ERRCD", AV16W_ERRCD);
      if ( GXutil.strcmp(AV16W_ERRCD, "0") != 0 )
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
      AV15W_A821_JS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15W_A821_JS", AV15W_A821_JS);
      AV9D_TAM07_PWD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9D_TAM07_PWD", AV9D_TAM07_PWD);
      AV11D_TAM07_PWD_NEW = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11D_TAM07_PWD_NEW", AV11D_TAM07_PWD_NEW);
      AV10D_TAM07_PWD_CFM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10D_TAM07_PWD_CFM", AV10D_TAM07_PWD_CFM);
   }

   public void S142( )
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
      if ( ! (GXutil.strcmp("", AV15W_A821_JS)==0) )
      {
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+"if (!confirmFlg) {" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxt_js_event_Internalname, "Caption", lblTxt_js_event_Caption);
         lblTxt_js_event_Caption = lblTxt_js_event_Caption+AV15W_A821_JS ;
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

   public void S172( )
   {
      /* 'SUB_ERROR' Routine */
      AV18W_ERRLOG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "ERR", AV18W_ERRLOG) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a102_wp01_chg_pwd");
   }

   protected void nextLoad( )
   {
   }

   protected void e160G2( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 300, 10, 0)) + "px" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 560, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableBody", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0G2( true) ;
      }
      else
      {
         wb_table2_5_0G2( false) ;
      }
      return  ;
   }

   public void wb_table2_5_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0G2e( true) ;
      }
      else
      {
         wb_table1_2_0G2e( false) ;
      }
   }

   public void wb_table2_5_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableBg", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td background=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "0d5d6cad-971c-410d-8334-33c792e25a79", "", context.getHttpContext().getTheme( )))+"\"  style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         wb_table3_9_0G2( true) ;
      }
      else
      {
         wb_table3_9_0G2( false) ;
      }
      return  ;
   }

   public void wb_table3_9_0G2e( boolean wbgen )
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
         wb_table2_5_0G2e( true) ;
      }
      else
      {
         wb_table2_5_0G2e( false) ;
      }
   }

   public void wb_table3_9_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top;height:100%\">") ;
         wb_table4_12_0G2( true) ;
      }
      else
      {
         wb_table4_12_0G2( false) ;
      }
      return  ;
   }

   public void wb_table4_12_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_53_0G2( true) ;
      }
      else
      {
         wb_table5_53_0G2( false) ;
      }
      return  ;
   }

   public void wb_table5_53_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_9_0G2e( true) ;
      }
      else
      {
         wb_table3_9_0G2e( false) ;
      }
   }

   public void wb_table5_53_0G2( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTxt_js_event_Internalname, lblTxt_js_event_Caption, "", "", lblTxt_js_event_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_A102_WP01_CHG_PWD.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavH_init_flg_Internalname, GXutil.rtrim( AV13H_INIT_FLG), GXutil.rtrim( localUtil.format( AV13H_INIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavH_init_flg_Jsonclick, 0, "Attribute", "", "", "", 1, 1, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_53_0G2e( true) ;
      }
      else
      {
         wb_table5_53_0G2e( false) ;
      }
   }

   public void wb_table4_12_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "TableMain", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_15_0G2( true) ;
      }
      else
      {
         wb_table6_15_0G2( false) ;
      }
      return  ;
   }

   public void wb_table6_15_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"height:2px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table7_28_0G2( true) ;
      }
      else
      {
         wb_table7_28_0G2( false) ;
      }
      return  ;
   }

   public void wb_table7_28_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_12_0G2e( true) ;
      }
      else
      {
         wb_table4_12_0G2e( false) ;
      }
   }

   public void wb_table7_28_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 500, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "TableForm", 0, "", "", 0, 1, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<th style=\"WIDTH: 140px\">") ;
         httpContext.writeText( "ログインID") ;
         httpContext.writeText( "</th>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_user_id_Internalname, GXutil.rtrim( AV12D_TAM07_USER_ID), GXutil.rtrim( localUtil.format( AV12D_TAM07_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam07_user_id_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtavD_tam07_user_id_Enabled, 0, "text", "", 20, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<th>") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "&nbsp;現パスワード") ;
         httpContext.writeText( "</th>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_pwd_Internalname, GXutil.rtrim( AV9D_TAM07_PWD), GXutil.rtrim( localUtil.format( AV9D_TAM07_PWD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam07_pwd_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavD_tam07_pwd_Backcolor)+";", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "", "left", "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<th>") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "&nbsp;新パスワード") ;
         httpContext.writeText( "</th>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_pwd_new_Internalname, GXutil.rtrim( AV11D_TAM07_PWD_NEW), GXutil.rtrim( localUtil.format( AV11D_TAM07_PWD_NEW, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam07_pwd_new_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavD_tam07_pwd_new_Backcolor)+";", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "", "left", "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<th>") ;
         /* Static images/pictures */
         ClassString = "Image" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage9_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "&nbsp;確認パスワード") ;
         httpContext.writeText( "</th>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtavD_tam07_pwd_cfm_Internalname, GXutil.rtrim( AV10D_TAM07_PWD_CFM), GXutil.rtrim( localUtil.format( AV10D_TAM07_PWD_CFM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavD_tam07_pwd_cfm_Jsonclick, 0, "AttributeImeOff", "background:"+WebUtils.getHTMLColor( edtavD_tam07_pwd_cfm_Backcolor)+";", "", "", 1, 1, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(1), (byte)(0), (byte)(-1), true, "", "left", "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "&nbsp;（新パスワード再入力）") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td align=\"center\" class=\"Submit\" colspan=\"2\" >") ;
         wb_table8_46_0G2( true) ;
      }
      else
      {
         wb_table8_46_0G2( false) ;
      }
      return  ;
   }

   public void wb_table8_46_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_28_0G2e( true) ;
      }
      else
      {
         wb_table7_28_0G2e( false) ;
      }
   }

   public void wb_table8_46_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTbl_upd_btnset_Internalname, tblTbl_upd_btnset_Internalname, "", "Table", 0, "center", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "更新（F4）", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_UPD\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_46_0G2e( true) ;
      }
      else
      {
         wb_table8_46_0G2e( false) ;
      }
   }

   public void wb_table6_15_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 500, 10, 0)) + "px" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, "パスワード変更", "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockPTitle", 0, "", 1, 1, (short)(0), "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         wb_table9_20_0G2( true) ;
      }
      else
      {
         wb_table9_20_0G2( false) ;
      }
      return  ;
   }

   public void wb_table9_20_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_15_0G2e( true) ;
      }
      else
      {
         wb_table6_15_0G2e( false) ;
      }
   }

   public void wb_table9_20_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, "閉じる（F9）", "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_END\\'."+"'", "", "TextBlockBtn100", 5, "", 1, 1, (short)(0), "HLP_A102_WP01_CHG_PWD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_20_0G2e( true) ;
      }
      else
      {
         wb_table9_20_0G2e( false) ;
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
      pa0G2( ) ;
      ws0G2( ) ;
      we0G2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317164416");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("a102_wp01_chg_pwd.js", "?20177317164416");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      tblTable10_Internalname = "TABLE10" ;
      tblTable8_Internalname = "TABLE8" ;
      edtavD_tam07_user_id_Internalname = "vD_TAM07_USER_ID" ;
      imgImage5_Internalname = "IMAGE5" ;
      edtavD_tam07_pwd_Internalname = "vD_TAM07_PWD" ;
      imgImage7_Internalname = "IMAGE7" ;
      edtavD_tam07_pwd_new_Internalname = "vD_TAM07_PWD_NEW" ;
      imgImage9_Internalname = "IMAGE9" ;
      edtavD_tam07_pwd_cfm_Internalname = "vD_TAM07_PWD_CFM" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      tblTbl_upd_btnset_Internalname = "TBL_UPD_BTNSET" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable5_Internalname = "TABLE5" ;
      lblTxt_js_event_Internalname = "TXT_JS_EVENT" ;
      edtavH_init_flg_Internalname = "vH_INIT_FLG" ;
      tblTbl_hidden_Internalname = "TBL_HIDDEN" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtavD_tam07_pwd_cfm_Jsonclick = "" ;
      edtavD_tam07_pwd_cfm_Backstyle = (byte)(-1) ;
      edtavD_tam07_pwd_new_Jsonclick = "" ;
      edtavD_tam07_pwd_new_Backstyle = (byte)(-1) ;
      edtavD_tam07_pwd_Jsonclick = "" ;
      edtavD_tam07_pwd_Backstyle = (byte)(-1) ;
      edtavD_tam07_user_id_Jsonclick = "" ;
      edtavD_tam07_user_id_Enabled = 1 ;
      edtavH_init_flg_Jsonclick = "" ;
      edtavD_tam07_pwd_cfm_Backcolor = (int)(0xFFFFFF) ;
      edtavD_tam07_pwd_new_Backcolor = (int)(0xFFFFFF) ;
      edtavD_tam07_user_id_Backcolor = (int)(0x0) ;
      edtavD_tam07_pwd_Backcolor = (int)(0xFFFFFF) ;
      lblTxt_js_event_Caption = "TXT_JS_EVENT" ;
      tblTbl_hidden_Visible = 1 ;
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
                  /* Execute user subroutine: S172 */
                  S172 ();
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
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXKey = "" ;
      AV23Pgmname = "" ;
      AV12D_TAM07_USER_ID = "" ;
      AV9D_TAM07_PWD = "" ;
      AV11D_TAM07_PWD_NEW = "" ;
      AV10D_TAM07_PWD_CFM = "" ;
      AV13H_INIT_FLG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV19W_MSG = "" ;
      AV15W_A821_JS = "" ;
      AV5BC_TAM07_USER = new SdtTAM07_USER(remoteHandle);
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV7C_BCMSGS = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle);
      AV6C_BCMSG = new SdtMessages_Message(remoteHandle, context);
      A214TAM07_DEL_FLG = "" ;
      A210TAM07_PWD = "" ;
      scmdbuf = "" ;
      H000G2_A55TAM07_USER_ID = new String[] {""} ;
      H000G2_A214TAM07_DEL_FLG = new String[] {""} ;
      H000G2_n214TAM07_DEL_FLG = new boolean[] {false} ;
      H000G2_A210TAM07_PWD = new String[] {""} ;
      H000G2_n210TAM07_PWD = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      AV20W_TAM07_PWD = "" ;
      GXt_char1 = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV16W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXEncryptionTmp = "" ;
      AV18W_ERRLOG = "" ;
      sStyleString = "" ;
      lblTxt_js_event_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a102_wp01_chg_pwd__default(),
         new Object[] {
             new Object[] {
            H000G2_A55TAM07_USER_ID, H000G2_A214TAM07_DEL_FLG, H000G2_n214TAM07_DEL_FLG, H000G2_A210TAM07_PWD, H000G2_n210TAM07_PWD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "A102_WP01_CHG_PWD" ;
      /* GeneXus formulas. */
      AV23Pgmname = "A102_WP01_CHG_PWD" ;
      Gx_err = (short)(0) ;
      edtavD_tam07_user_id_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV25GXLvl195 ;
   private byte nGXWrapped ;
   private byte edtavD_tam07_pwd_cfm_Backstyle ;
   private byte edtavD_tam07_pwd_new_Backstyle ;
   private byte edtavD_tam07_pwd_Backstyle ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavD_tam07_user_id_Enabled ;
   private int tblTbl_hidden_Visible ;
   private int AV24GXV1 ;
   private int edtavD_tam07_pwd_Backcolor ;
   private int edtavD_tam07_user_id_Backcolor ;
   private int edtavD_tam07_pwd_new_Backcolor ;
   private int edtavD_tam07_pwd_cfm_Backcolor ;
   private int GXActiveErrHndl ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXKey ;
   private String AV23Pgmname ;
   private String edtavD_tam07_user_id_Internalname ;
   private String edtavD_tam07_pwd_Internalname ;
   private String edtavD_tam07_pwd_new_Internalname ;
   private String edtavD_tam07_pwd_cfm_Internalname ;
   private String edtavH_init_flg_Internalname ;
   private String tblTbl_hidden_Internalname ;
   private String lblTxt_js_event_Caption ;
   private String lblTxt_js_event_Internalname ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXEncryptionTmp ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String tblTable2_Internalname ;
   private String tblTable3_Internalname ;
   private String lblTxt_js_event_Jsonclick ;
   private String TempTags ;
   private String edtavH_init_flg_Jsonclick ;
   private String tblTable5_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String tblTable4_Internalname ;
   private String edtavD_tam07_user_id_Jsonclick ;
   private String imgImage5_Internalname ;
   private String edtavD_tam07_pwd_Jsonclick ;
   private String imgImage7_Internalname ;
   private String edtavD_tam07_pwd_new_Jsonclick ;
   private String imgImage9_Internalname ;
   private String edtavD_tam07_pwd_cfm_Jsonclick ;
   private String tblTbl_upd_btnset_Internalname ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String tblTable8_Internalname ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String tblTable10_Internalname ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean AV17W_ERRFLG ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n210TAM07_PWD ;
   private String AV12D_TAM07_USER_ID ;
   private String AV9D_TAM07_PWD ;
   private String AV11D_TAM07_PWD_NEW ;
   private String AV10D_TAM07_PWD_CFM ;
   private String AV13H_INIT_FLG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV19W_MSG ;
   private String AV15W_A821_JS ;
   private String A214TAM07_DEL_FLG ;
   private String A210TAM07_PWD ;
   private String A55TAM07_USER_ID ;
   private String AV20W_TAM07_PWD ;
   private String AV16W_ERRCD ;
   private String AV18W_ERRLOG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private String[] H000G2_A55TAM07_USER_ID ;
   private String[] H000G2_A214TAM07_DEL_FLG ;
   private boolean[] H000G2_n214TAM07_DEL_FLG ;
   private String[] H000G2_A210TAM07_PWD ;
   private boolean[] H000G2_n210TAM07_PWD ;
   private GxObjectCollection AV7C_BCMSGS ;
   private SdtTAM07_USER AV5BC_TAM07_USER ;
   private SdtMessages_Message AV6C_BCMSG ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class a102_wp01_chg_pwd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000G2", "SELECT `TAM07_USER_ID`, `TAM07_DEL_FLG`, `TAM07_PWD` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
      }
   }

}

