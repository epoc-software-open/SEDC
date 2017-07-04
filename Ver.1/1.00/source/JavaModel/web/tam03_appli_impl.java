/*
               File: tam03_appli_impl
        Description: アプリケーションマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:53.27
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam03_appli_impl extends GXWebPanel
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A88TAM03_APP_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
         A127TAM03_APP_NM = httpContext.GetNextPar( ) ;
         n127TAM03_APP_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
         A128TAM03_SUB_MENU_FLG = httpContext.GetNextPar( ) ;
         n128TAM03_SUB_MENU_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
         A89TAM03_KIDO_PG = httpContext.GetNextPar( ) ;
         n89TAM03_KIDO_PG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         A90TAM03_DEL_FLG = httpContext.GetNextPar( ) ;
         n90TAM03_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
         A91TAM03_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n91TAM03_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A92TAM03_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n92TAM03_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
         A93TAM03_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n93TAM03_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
         A94TAM03_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n94TAM03_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A95TAM03_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n95TAM03_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
         A96TAM03_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n96TAM03_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
         A97TAM03_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n97TAM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_088( AV14Pgmname, Gx_mode, A88TAM03_APP_ID, A127TAM03_APP_NM, A128TAM03_SUB_MENU_FLG, A89TAM03_KIDO_PG, A90TAM03_DEL_FLG, A91TAM03_CRT_DATETIME, A92TAM03_CRT_USER_ID, A93TAM03_CRT_PROG_NM, A94TAM03_UPD_DATETIME, A95TAM03_UPD_USER_ID, A96TAM03_UPD_PROG_NM, A97TAM03_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A88TAM03_APP_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
         A127TAM03_APP_NM = httpContext.GetNextPar( ) ;
         n127TAM03_APP_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
         A128TAM03_SUB_MENU_FLG = httpContext.GetNextPar( ) ;
         n128TAM03_SUB_MENU_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
         A89TAM03_KIDO_PG = httpContext.GetNextPar( ) ;
         n89TAM03_KIDO_PG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         A90TAM03_DEL_FLG = httpContext.GetNextPar( ) ;
         n90TAM03_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
         A91TAM03_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n91TAM03_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A92TAM03_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n92TAM03_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
         A93TAM03_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n93TAM03_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
         A94TAM03_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n94TAM03_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A95TAM03_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n95TAM03_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
         A96TAM03_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n96TAM03_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
         A97TAM03_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n97TAM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_27_088( AV14Pgmname, Gx_mode, A88TAM03_APP_ID, A127TAM03_APP_NM, A128TAM03_SUB_MENU_FLG, A89TAM03_KIDO_PG, A90TAM03_DEL_FLG, A91TAM03_CRT_DATETIME, A92TAM03_CRT_USER_ID, A93TAM03_CRT_PROG_NM, A94TAM03_UPD_DATETIME, A95TAM03_UPD_USER_ID, A96TAM03_UPD_PROG_NM, A97TAM03_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action28") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A88TAM03_APP_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
         A127TAM03_APP_NM = httpContext.GetNextPar( ) ;
         n127TAM03_APP_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
         A128TAM03_SUB_MENU_FLG = httpContext.GetNextPar( ) ;
         n128TAM03_SUB_MENU_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
         A89TAM03_KIDO_PG = httpContext.GetNextPar( ) ;
         n89TAM03_KIDO_PG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         A90TAM03_DEL_FLG = httpContext.GetNextPar( ) ;
         n90TAM03_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
         A91TAM03_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n91TAM03_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A92TAM03_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n92TAM03_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
         A93TAM03_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n93TAM03_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
         A94TAM03_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n94TAM03_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A95TAM03_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n95TAM03_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
         A96TAM03_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n96TAM03_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
         A97TAM03_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n97TAM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_28_088( AV14Pgmname, Gx_mode, A88TAM03_APP_ID, A127TAM03_APP_NM, A128TAM03_SUB_MENU_FLG, A89TAM03_KIDO_PG, A90TAM03_DEL_FLG, A91TAM03_CRT_DATETIME, A92TAM03_CRT_USER_ID, A93TAM03_CRT_PROG_NM, A94TAM03_UPD_DATETIME, A95TAM03_UPD_USER_ID, A96TAM03_UPD_PROG_NM, A97TAM03_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"TAM03_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asatam03_crt_user_id088( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"TAM03_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asatam03_upd_user_id088( Gx_mode) ;
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
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      GXKey = context.getSiteKey( ) ;
      radTAM03_SUB_MENU_FLG.setName( "TAM03_SUB_MENU_FLG" );
      radTAM03_SUB_MENU_FLG.setWebtags( "" );
      radTAM03_SUB_MENU_FLG.addItem("0", "アプリケーション", (short)(0));
      radTAM03_SUB_MENU_FLG.addItem("1", "サブメニュー", (short)(0));
      radTAM03_DEL_FLG.setName( "TAM03_DEL_FLG" );
      radTAM03_DEL_FLG.setWebtags( "" );
      radTAM03_DEL_FLG.addItem("0", "利用可能", (short)(0));
      radTAM03_DEL_FLG.addItem("1", "利用不可", (short)(0));
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "アプリケーションマスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM03_APP_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tam03_appli_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam03_appli_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam03_appli_impl.class ));
   }

   public tam03_appli_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radTAM03_SUB_MENU_FLG = new HTMLChoice();
      radTAM03_DEL_FLG = new HTMLChoice();
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
      {
         userMain( ) ;
         if ( ! httpContext.isFullAjaxMode( ) )
         {
            draw( ) ;
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

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Event 'Enter' not assigned to any button. */
         /* Form start */
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_088( true) ;
      }
      return  ;
   }

   public void wb_table1_2_088e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm088( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_088( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_088( true) ;
      }
      return  ;
   }

   public void wb_table2_5_088e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"アプリケーションマスタ"+"</legend>") ;
         wb_table3_27_088( true) ;
      }
      return  ;
   }

   public void wb_table3_27_088e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_088e( true) ;
      }
      else
      {
         wb_table1_2_088e( false) ;
      }
   }

   public void wb_table3_27_088( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_33_088( true) ;
      }
      return  ;
   }

   public void wb_table4_33_088e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_108_088( true) ;
      }
      return  ;
   }

   public void wb_table5_108_088e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_088e( true) ;
      }
      else
      {
         wb_table3_27_088e( false) ;
      }
   }

   public void wb_table5_108_088( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "EENTER.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "E\\'BTN_CLER\\'.", StyleString, ClassString, 5, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockBtn060" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "ECHECK.", StyleString, ClassString, 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_108_088e( true) ;
      }
      else
      {
         wb_table5_108_088e( false) ;
      }
   }

   public void wb_table4_33_088( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\"  style=\"width:130px\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage19_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage19_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAM03_APPLI.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_app_id_Internalname, "アプリケーションID", "", "", lblTextblocktam03_app_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_APP_ID_Internalname, GXutil.rtrim( A88TAM03_APP_ID), GXutil.rtrim( localUtil.format( A88TAM03_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "", "", "", "", edtTAM03_APP_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM03_APP_ID_Enabled, 1, 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_43_088( true) ;
      }
      return  ;
   }

   public void wb_table6_43_088e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", "Style2"), "", "", "", "Style2", imgImage20_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "HLP_TAM03_APPLI.htm");
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_app_nm_Internalname, "アプリケーション名", "", "", lblTextblocktam03_app_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_APP_NM_Internalname, GXutil.rtrim( A127TAM03_APP_NM), GXutil.rtrim( localUtil.format( A127TAM03_APP_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "", "", "", "", edtTAM03_APP_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM03_APP_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_sub_menu_flg_Internalname, "サブメニューフラグ", "", "", lblTextblocktam03_sub_menu_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAM03_SUB_MENU_FLG, radTAM03_SUB_MENU_FLG.getInternalname(), A128TAM03_SUB_MENU_FLG, "", 1, radTAM03_SUB_MENU_FLG.getEnabled(), 0, 0, StyleString, ClassString, 0, radTAM03_SUB_MENU_FLG.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_kido_pg_Internalname, "起動プログラム", "", "", lblTextblocktam03_kido_pg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "AttributeImeOff" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_KIDO_PG_Internalname, GXutil.rtrim( A89TAM03_KIDO_PG), GXutil.rtrim( localUtil.format( A89TAM03_KIDO_PG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "", "", "", "", edtTAM03_KIDO_PG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM03_KIDO_PG_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam01_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAM03_DEL_FLG, radTAM03_DEL_FLG.getInternalname(), A90TAM03_DEL_FLG, "", 1, radTAM03_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, 0, radTAM03_DEL_FLG.getJsonclick(), "", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam03_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM03_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_CRT_DATETIME_Internalname, localUtil.format(A91TAM03_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A91TAM03_CRT_DATETIME, "9999/99/99 99:99:99"), "", "", "", "", "", edtTAM03_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", edtTAM03_CRT_DATETIME_Visible, edtTAM03_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_TAM03_APPLI.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM03_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtTAM03_CRT_DATETIME_Visible==0)||(edtTAM03_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM03_APPLI.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam03_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_CRT_USER_ID_Internalname, GXutil.rtrim( A92TAM03_CRT_USER_ID), GXutil.rtrim( localUtil.format( A92TAM03_CRT_USER_ID, "")), "", "", "", "", "", edtTAM03_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM03_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam03_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_CRT_PROG_NM_Internalname, GXutil.rtrim( A93TAM03_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A93TAM03_CRT_PROG_NM, "")), "", "", "", "", "", edtTAM03_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", edtTAM03_CRT_PROG_NM_Visible, edtTAM03_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam03_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM03_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_UPD_DATETIME_Internalname, localUtil.format(A94TAM03_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A94TAM03_UPD_DATETIME, "9999/99/99 99:99:99"), "", "", "", "", "", edtTAM03_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", edtTAM03_UPD_DATETIME_Visible, edtTAM03_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "right", "HLP_TAM03_APPLI.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM03_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((edtTAM03_UPD_DATETIME_Visible==0)||(edtTAM03_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM03_APPLI.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam03_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_UPD_USER_ID_Internalname, GXutil.rtrim( A95TAM03_UPD_USER_ID), GXutil.rtrim( localUtil.format( A95TAM03_UPD_USER_ID, "")), "", "", "", "", "", edtTAM03_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM03_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam03_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_UPD_PROG_NM_Internalname, GXutil.rtrim( A96TAM03_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A96TAM03_UPD_PROG_NM, "")), "", "", "", "", "", edtTAM03_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", edtTAM03_UPD_PROG_NM_Visible, edtTAM03_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(1), true, "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_088e( true) ;
      }
      else
      {
         wb_table4_33_088e( false) ;
      }
   }

   public void wb_table6_43_088( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" >") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "※", "", "", lblTextblock2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         ClassString = "TextBlockItemTitle" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "サブメニュー用のアプリケーションIDには、<br>配下の機能のアプリケーションIDの頭2桁を設定して下さい。", "", "", lblTextblock1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(1), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_43_088e( true) ;
      }
      else
      {
         wb_table6_43_088e( false) ;
      }
   }

   public void wb_table2_5_088( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTabletoolbar_Internalname, tblTabletoolbar_Internalname, "", "ViewTable", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_5_088e( true) ;
      }
      else
      {
         wb_table2_5_088e( false) ;
      }
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e11082 */
      e11082 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A88TAM03_APP_ID = httpContext.cgiGet( edtTAM03_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
            A127TAM03_APP_NM = httpContext.cgiGet( edtTAM03_APP_NM_Internalname) ;
            n127TAM03_APP_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
            n127TAM03_APP_NM = ((GXutil.strcmp("", A127TAM03_APP_NM)==0) ? true : false) ;
            A128TAM03_SUB_MENU_FLG = httpContext.cgiGet( radTAM03_SUB_MENU_FLG.getInternalname()) ;
            n128TAM03_SUB_MENU_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
            n128TAM03_SUB_MENU_FLG = ((GXutil.strcmp("", A128TAM03_SUB_MENU_FLG)==0) ? true : false) ;
            A89TAM03_KIDO_PG = httpContext.cgiGet( edtTAM03_KIDO_PG_Internalname) ;
            n89TAM03_KIDO_PG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
            n89TAM03_KIDO_PG = ((GXutil.strcmp("", A89TAM03_KIDO_PG)==0) ? true : false) ;
            A90TAM03_DEL_FLG = httpContext.cgiGet( radTAM03_DEL_FLG.getInternalname()) ;
            n90TAM03_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
            n90TAM03_DEL_FLG = ((GXutil.strcmp("", A90TAM03_DEL_FLG)==0) ? true : false) ;
            A91TAM03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM03_CRT_DATETIME_Internalname)) ;
            n91TAM03_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A92TAM03_CRT_USER_ID = httpContext.cgiGet( edtTAM03_CRT_USER_ID_Internalname) ;
            n92TAM03_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
            A93TAM03_CRT_PROG_NM = httpContext.cgiGet( edtTAM03_CRT_PROG_NM_Internalname) ;
            n93TAM03_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
            A94TAM03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM03_UPD_DATETIME_Internalname)) ;
            n94TAM03_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A95TAM03_UPD_USER_ID = httpContext.cgiGet( edtTAM03_UPD_USER_ID_Internalname) ;
            n95TAM03_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
            A96TAM03_UPD_PROG_NM = httpContext.cgiGet( edtTAM03_UPD_PROG_NM_Internalname) ;
            n96TAM03_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
            /* Read saved values. */
            Z88TAM03_APP_ID = httpContext.cgiGet( "Z88TAM03_APP_ID") ;
            Z91TAM03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z91TAM03_CRT_DATETIME"), 0) ;
            n91TAM03_CRT_DATETIME = (GXutil.nullDate().equals(A91TAM03_CRT_DATETIME) ? true : false) ;
            Z92TAM03_CRT_USER_ID = httpContext.cgiGet( "Z92TAM03_CRT_USER_ID") ;
            n92TAM03_CRT_USER_ID = ((GXutil.strcmp("", A92TAM03_CRT_USER_ID)==0) ? true : false) ;
            Z94TAM03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z94TAM03_UPD_DATETIME"), 0) ;
            n94TAM03_UPD_DATETIME = (GXutil.nullDate().equals(A94TAM03_UPD_DATETIME) ? true : false) ;
            Z95TAM03_UPD_USER_ID = httpContext.cgiGet( "Z95TAM03_UPD_USER_ID") ;
            n95TAM03_UPD_USER_ID = ((GXutil.strcmp("", A95TAM03_UPD_USER_ID)==0) ? true : false) ;
            Z97TAM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z97TAM03_UPD_CNT"), ".", ",") ;
            n97TAM03_UPD_CNT = ((0==A97TAM03_UPD_CNT) ? true : false) ;
            Z127TAM03_APP_NM = httpContext.cgiGet( "Z127TAM03_APP_NM") ;
            n127TAM03_APP_NM = ((GXutil.strcmp("", A127TAM03_APP_NM)==0) ? true : false) ;
            Z128TAM03_SUB_MENU_FLG = httpContext.cgiGet( "Z128TAM03_SUB_MENU_FLG") ;
            n128TAM03_SUB_MENU_FLG = ((GXutil.strcmp("", A128TAM03_SUB_MENU_FLG)==0) ? true : false) ;
            Z89TAM03_KIDO_PG = httpContext.cgiGet( "Z89TAM03_KIDO_PG") ;
            n89TAM03_KIDO_PG = ((GXutil.strcmp("", A89TAM03_KIDO_PG)==0) ? true : false) ;
            Z90TAM03_DEL_FLG = httpContext.cgiGet( "Z90TAM03_DEL_FLG") ;
            n90TAM03_DEL_FLG = ((GXutil.strcmp("", A90TAM03_DEL_FLG)==0) ? true : false) ;
            Z93TAM03_CRT_PROG_NM = httpContext.cgiGet( "Z93TAM03_CRT_PROG_NM") ;
            n93TAM03_CRT_PROG_NM = ((GXutil.strcmp("", A93TAM03_CRT_PROG_NM)==0) ? true : false) ;
            Z96TAM03_UPD_PROG_NM = httpContext.cgiGet( "Z96TAM03_UPD_PROG_NM") ;
            n96TAM03_UPD_PROG_NM = ((GXutil.strcmp("", A96TAM03_UPD_PROG_NM)==0) ? true : false) ;
            A97TAM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z97TAM03_UPD_CNT"), ".", ",") ;
            n97TAM03_UPD_CNT = false ;
            n97TAM03_UPD_CNT = ((0==A97TAM03_UPD_CNT) ? true : false) ;
            O97TAM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O97TAM03_UPD_CNT"), ".", ",") ;
            n97TAM03_UPD_CNT = ((0==A97TAM03_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A97TAM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "TAM03_UPD_CNT"), ".", ",") ;
            n97TAM03_UPD_CNT = ((0==A97TAM03_UPD_CNT) ? true : false) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ".", ",")) ;
            AV14Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A88TAM03_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
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
                  if ( GXutil.strcmp(sEvt, "START") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e11082 */
                     e11082 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12082 */
                     e12082 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_enter( ) ;
                     /* No code required for Cancel button. It is implemented as the Reset button. */
                  }
                  else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_first( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_previous( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_next( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_last( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_select( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_delete( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_check( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     afterkeyloadscreen( ) ;
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

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll088( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         imgBtn_delete2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_delete2_Enabled, 5, 0)));
      }
   }

   public void disable_std_buttons_dsp( )
   {
      imgBtn_delete2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_delete2_Visible, 5, 0)));
      imgBtn_delete2_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_delete2_separator_Visible, 5, 0)));
      imgBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_first_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_first_Visible, 5, 0)));
      imgBtn_first_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_first_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_first_separator_Visible, 5, 0)));
      imgBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_previous_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_previous_Visible, 5, 0)));
      imgBtn_previous_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_previous_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_previous_separator_Visible, 5, 0)));
      imgBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_next_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_next_Visible, 5, 0)));
      imgBtn_next_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_next_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_next_separator_Visible, 5, 0)));
      imgBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_last_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_last_Visible, 5, 0)));
      imgBtn_last_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_last_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_last_separator_Visible, 5, 0)));
      imgBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_select_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_select_Visible, 5, 0)));
      imgBtn_select_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_select_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_select_separator_Visible, 5, 0)));
      imgBtn_delete2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_delete2_Visible, 5, 0)));
      imgBtn_delete2_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_delete2_separator_Visible, 5, 0)));
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         imgBtn_enter2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_enter2_Visible, 5, 0)));
         imgBtn_enter2_separator_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_enter2_separator_Visible, 5, 0)));
      }
      disableAttributes088( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
         }
      }
   }

   public void confirm_080( )
   {
      beforeValidate088( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls088( ) ;
         }
         else
         {
            checkExtendedTable088( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors088( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
      if ( AnyError == 0 )
      {
         confirmValues080( ) ;
      }
   }

   public void resetCaption080( )
   {
   }

   public void e11082( )
   {
      /* Start Routine */
      AV7C_TAM02_APP_ID = "TAM03" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_TAM02_APP_ID", AV7C_TAM02_APP_ID);
      /* Execute user subroutine: S112 */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      imgBtn_cancel2_Jsonclick = "(window.open('', '_self').opener = window).close();" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_cancel2_Internalname, "Jsonclick", imgBtn_cancel2_Jsonclick);
      lblBtn_cancel_Jsonclick = "(window.open('', '_self').opener = window).close()" ;
      httpContext.ajax_rsp_assign_prop("", false, lblBtn_cancel_Internalname, "Jsonclick", lblBtn_cancel_Jsonclick);
      new a804_pc01_syslog(remoteHandle, context).execute( AV14Pgmname, "INFO", "画面起動") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      if ( GXutil.strcmp(AV9W_ERRCD, "0") == 0 )
      {
         /* Execute user subroutine: S122 */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      GXt_char2 = AV12W_MSG ;
      GXv_char3[0] = GXt_char2 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char3) ;
      tam03_appli_impl.this.GXt_char2 = GXv_char3[0] ;
      AV12W_MSG = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_MSG", AV12W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV12W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e12082( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tam03_appli")  ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV8W_A_LOGIN_SDT;
      GXv_char3[0] = AV9W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV8W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      tam03_appli_impl.this.AV9W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV9W_ERRCD, "0") != 0 )
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
      GXv_char3[0] = AV10W_KNGN_FLG ;
      GXv_char5[0] = AV9W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV7C_TAM02_APP_ID, GXv_char3, GXv_char5) ;
      tam03_appli_impl.this.AV10W_KNGN_FLG = GXv_char3[0] ;
      tam03_appli_impl.this.AV9W_ERRCD = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_TAM02_APP_ID", AV7C_TAM02_APP_ID);
      if ( GXutil.strcmp(AV9W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S13109( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV14Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm088( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z91TAM03_CRT_DATETIME = T00083_A91TAM03_CRT_DATETIME[0] ;
            Z92TAM03_CRT_USER_ID = T00083_A92TAM03_CRT_USER_ID[0] ;
            Z94TAM03_UPD_DATETIME = T00083_A94TAM03_UPD_DATETIME[0] ;
            Z95TAM03_UPD_USER_ID = T00083_A95TAM03_UPD_USER_ID[0] ;
            Z97TAM03_UPD_CNT = T00083_A97TAM03_UPD_CNT[0] ;
            Z127TAM03_APP_NM = T00083_A127TAM03_APP_NM[0] ;
            Z128TAM03_SUB_MENU_FLG = T00083_A128TAM03_SUB_MENU_FLG[0] ;
            Z89TAM03_KIDO_PG = T00083_A89TAM03_KIDO_PG[0] ;
            Z90TAM03_DEL_FLG = T00083_A90TAM03_DEL_FLG[0] ;
            Z93TAM03_CRT_PROG_NM = T00083_A93TAM03_CRT_PROG_NM[0] ;
            Z96TAM03_UPD_PROG_NM = T00083_A96TAM03_UPD_PROG_NM[0] ;
         }
         else
         {
            Z91TAM03_CRT_DATETIME = A91TAM03_CRT_DATETIME ;
            Z92TAM03_CRT_USER_ID = A92TAM03_CRT_USER_ID ;
            Z94TAM03_UPD_DATETIME = A94TAM03_UPD_DATETIME ;
            Z95TAM03_UPD_USER_ID = A95TAM03_UPD_USER_ID ;
            Z97TAM03_UPD_CNT = A97TAM03_UPD_CNT ;
            Z127TAM03_APP_NM = A127TAM03_APP_NM ;
            Z128TAM03_SUB_MENU_FLG = A128TAM03_SUB_MENU_FLG ;
            Z89TAM03_KIDO_PG = A89TAM03_KIDO_PG ;
            Z90TAM03_DEL_FLG = A90TAM03_DEL_FLG ;
            Z93TAM03_CRT_PROG_NM = A93TAM03_CRT_PROG_NM ;
            Z96TAM03_UPD_PROG_NM = A96TAM03_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
         Z91TAM03_CRT_DATETIME = A91TAM03_CRT_DATETIME ;
         Z92TAM03_CRT_USER_ID = A92TAM03_CRT_USER_ID ;
         Z94TAM03_UPD_DATETIME = A94TAM03_UPD_DATETIME ;
         Z95TAM03_UPD_USER_ID = A95TAM03_UPD_USER_ID ;
         Z97TAM03_UPD_CNT = A97TAM03_UPD_CNT ;
         Z127TAM03_APP_NM = A127TAM03_APP_NM ;
         Z128TAM03_SUB_MENU_FLG = A128TAM03_SUB_MENU_FLG ;
         Z89TAM03_KIDO_PG = A89TAM03_KIDO_PG ;
         Z90TAM03_DEL_FLG = A90TAM03_DEL_FLG ;
         Z93TAM03_CRT_PROG_NM = A93TAM03_CRT_PROG_NM ;
         Z96TAM03_UPD_PROG_NM = A96TAM03_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTAM03_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM03_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM03_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM03_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM03_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM03_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_UPD_PROG_NM_Enabled, 5, 0)));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTAM03_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM03_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM03_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM03_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM03_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM03_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtTAM03_APP_ID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM03_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_APP_ID_Enabled, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM03_CRT_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM03_CRT_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM03_CRT_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM03_CRT_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM03_UPD_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM03_UPD_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM03_UPD_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM03_UPD_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A128TAM03_SUB_MENU_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A128TAM03_SUB_MENU_FLG = "0" ;
         n128TAM03_SUB_MENU_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A90TAM03_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A90TAM03_DEL_FLG = "0" ;
         n90TAM03_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A93TAM03_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A93TAM03_CRT_PROG_NM = AV14Pgmname ;
         n93TAM03_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A96TAM03_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A96TAM03_UPD_PROG_NM = AV14Pgmname ;
         n96TAM03_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         imgBtn_delete2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_delete2_Enabled, 5, 0)));
      }
      else
      {
         imgBtn_delete2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_delete2_Enabled, 5, 0)));
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         imgBtn_enter2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_enter2_Enabled, 5, 0)));
      }
      else
      {
         imgBtn_enter2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_enter2_Enabled, 5, 0)));
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         lblBtn_cancel_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_cancel_Internalname, "Enabled", GXutil.ltrim( GXutil.str( lblBtn_cancel_Enabled, 5, 0)));
      }
      else
      {
         lblBtn_cancel_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblBtn_cancel_Internalname, "Enabled", GXutil.ltrim( GXutil.str( lblBtn_cancel_Enabled, 5, 0)));
      }
   }

   public void load088( )
   {
      /* Using cursor T00084 */
      pr_default.execute(2, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A91TAM03_CRT_DATETIME = T00084_A91TAM03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n91TAM03_CRT_DATETIME = T00084_n91TAM03_CRT_DATETIME[0] ;
         A92TAM03_CRT_USER_ID = T00084_A92TAM03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
         n92TAM03_CRT_USER_ID = T00084_n92TAM03_CRT_USER_ID[0] ;
         A94TAM03_UPD_DATETIME = T00084_A94TAM03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n94TAM03_UPD_DATETIME = T00084_n94TAM03_UPD_DATETIME[0] ;
         A95TAM03_UPD_USER_ID = T00084_A95TAM03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
         n95TAM03_UPD_USER_ID = T00084_n95TAM03_UPD_USER_ID[0] ;
         A97TAM03_UPD_CNT = T00084_A97TAM03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
         n97TAM03_UPD_CNT = T00084_n97TAM03_UPD_CNT[0] ;
         A127TAM03_APP_NM = T00084_A127TAM03_APP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
         n127TAM03_APP_NM = T00084_n127TAM03_APP_NM[0] ;
         A128TAM03_SUB_MENU_FLG = T00084_A128TAM03_SUB_MENU_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
         n128TAM03_SUB_MENU_FLG = T00084_n128TAM03_SUB_MENU_FLG[0] ;
         A89TAM03_KIDO_PG = T00084_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = T00084_n89TAM03_KIDO_PG[0] ;
         A90TAM03_DEL_FLG = T00084_A90TAM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
         n90TAM03_DEL_FLG = T00084_n90TAM03_DEL_FLG[0] ;
         A93TAM03_CRT_PROG_NM = T00084_A93TAM03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
         n93TAM03_CRT_PROG_NM = T00084_n93TAM03_CRT_PROG_NM[0] ;
         A96TAM03_UPD_PROG_NM = T00084_A96TAM03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
         n96TAM03_UPD_PROG_NM = T00084_n96TAM03_UPD_PROG_NM[0] ;
         zm088( -29) ;
      }
      pr_default.close(2);
      onLoadActions088( ) ;
   }

   public void onLoadActions088( )
   {
      AV14Pgmname = "TAM03_APPLI" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void checkExtendedTable088( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV14Pgmname = "TAM03_APPLI" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void closeExtendedTableCursors088( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey088( )
   {
      /* Using cursor T00085 */
      pr_default.execute(3, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound8 = (short)(1) ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00083 */
      pr_default.execute(1, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm088( 29) ;
         RcdFound8 = (short)(1) ;
         A88TAM03_APP_ID = T00083_A88TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
         A91TAM03_CRT_DATETIME = T00083_A91TAM03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n91TAM03_CRT_DATETIME = T00083_n91TAM03_CRT_DATETIME[0] ;
         A92TAM03_CRT_USER_ID = T00083_A92TAM03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
         n92TAM03_CRT_USER_ID = T00083_n92TAM03_CRT_USER_ID[0] ;
         A94TAM03_UPD_DATETIME = T00083_A94TAM03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n94TAM03_UPD_DATETIME = T00083_n94TAM03_UPD_DATETIME[0] ;
         A95TAM03_UPD_USER_ID = T00083_A95TAM03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
         n95TAM03_UPD_USER_ID = T00083_n95TAM03_UPD_USER_ID[0] ;
         A97TAM03_UPD_CNT = T00083_A97TAM03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
         n97TAM03_UPD_CNT = T00083_n97TAM03_UPD_CNT[0] ;
         A127TAM03_APP_NM = T00083_A127TAM03_APP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
         n127TAM03_APP_NM = T00083_n127TAM03_APP_NM[0] ;
         A128TAM03_SUB_MENU_FLG = T00083_A128TAM03_SUB_MENU_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
         n128TAM03_SUB_MENU_FLG = T00083_n128TAM03_SUB_MENU_FLG[0] ;
         A89TAM03_KIDO_PG = T00083_A89TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
         n89TAM03_KIDO_PG = T00083_n89TAM03_KIDO_PG[0] ;
         A90TAM03_DEL_FLG = T00083_A90TAM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
         n90TAM03_DEL_FLG = T00083_n90TAM03_DEL_FLG[0] ;
         A93TAM03_CRT_PROG_NM = T00083_A93TAM03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
         n93TAM03_CRT_PROG_NM = T00083_n93TAM03_CRT_PROG_NM[0] ;
         A96TAM03_UPD_PROG_NM = T00083_A96TAM03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
         n96TAM03_UPD_PROG_NM = T00083_n96TAM03_UPD_PROG_NM[0] ;
         O97TAM03_UPD_CNT = A97TAM03_UPD_CNT ;
         n97TAM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
         Z88TAM03_APP_ID = A88TAM03_APP_ID ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load088( ) ;
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound8 = (short)(0) ;
         initializeNonKey088( ) ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey088( ) ;
      if ( RcdFound8 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T00086 */
      pr_default.execute(4, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00086_A88TAM03_APP_ID[0], A88TAM03_APP_ID) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00086_A88TAM03_APP_ID[0], A88TAM03_APP_ID) > 0 ) ) )
         {
            A88TAM03_APP_ID = T00086_A88TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T00087 */
      pr_default.execute(5, new Object[] {A88TAM03_APP_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00087_A88TAM03_APP_ID[0], A88TAM03_APP_ID) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00087_A88TAM03_APP_ID[0], A88TAM03_APP_ID) < 0 ) ) )
         {
            A88TAM03_APP_ID = T00087_A88TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey088( ) ;
      if ( RcdFound8 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM03_APP_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM03_APP_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A88TAM03_APP_ID, Z88TAM03_APP_ID) != 0 )
         {
            A88TAM03_APP_ID = Z88TAM03_APP_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAM03_APP_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM03_APP_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTAM03_APP_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update088( ) ;
            GX_FocusControl = edtTAM03_APP_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( GXutil.strcmp(A88TAM03_APP_ID, Z88TAM03_APP_ID) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTAM03_APP_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert088( ) ;
            if ( AnyError == 1 )
            {
               GX_FocusControl = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM03_APP_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM03_APP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAM03_APP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert088( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( GXutil.strcmp(A88TAM03_APP_ID, Z88TAM03_APP_ID) != 0 )
      {
         A88TAM03_APP_ID = Z88TAM03_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey088( ) ;
      if ( RcdFound8 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM03_APP_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM03_APP_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A88TAM03_APP_ID, Z88TAM03_APP_ID) != 0 )
         {
            A88TAM03_APP_ID = Z88TAM03_APP_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "TAM03_APP_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM03_APP_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            update_check( ) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(A88TAM03_APP_ID, Z88TAM03_APP_ID) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM03_APP_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM03_APP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert_check( ) ;
            }
         }
      }
      Application.rollback(context, remoteHandle, "DEFAULT", "tam03_appli");
      GX_FocusControl = edtTAM03_APP_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_080( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTAM03_APP_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart088( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM03_APP_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd088( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM03_APP_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_next( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM03_APP_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart088( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound8 != 0 )
         {
            scanNext088( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM03_APP_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd088( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency088( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00082 */
         pr_default.execute(0, new Object[] {A88TAM03_APP_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM03_APPLI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z91TAM03_CRT_DATETIME.equals( T00082_A91TAM03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z92TAM03_CRT_USER_ID, T00082_A92TAM03_CRT_USER_ID[0]) != 0 ) || !( Z94TAM03_UPD_DATETIME.equals( T00082_A94TAM03_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z95TAM03_UPD_USER_ID, T00082_A95TAM03_UPD_USER_ID[0]) != 0 ) || ( Z97TAM03_UPD_CNT != T00082_A97TAM03_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z127TAM03_APP_NM, T00082_A127TAM03_APP_NM[0]) != 0 ) || ( GXutil.strcmp(Z128TAM03_SUB_MENU_FLG, T00082_A128TAM03_SUB_MENU_FLG[0]) != 0 ) || ( GXutil.strcmp(Z89TAM03_KIDO_PG, T00082_A89TAM03_KIDO_PG[0]) != 0 ) || ( GXutil.strcmp(Z90TAM03_DEL_FLG, T00082_A90TAM03_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z93TAM03_CRT_PROG_NM, T00082_A93TAM03_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z96TAM03_UPD_PROG_NM, T00082_A96TAM03_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM03_APPLI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert088( )
   {
      beforeValidate088( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable088( ) ;
      }
      if ( AnyError == 0 )
      {
         zm088( 0) ;
         checkOptimisticConcurrency088( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm088( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert088( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00088 */
                  pr_default.execute(6, new Object[] {A88TAM03_APP_ID, new Boolean(n91TAM03_CRT_DATETIME), A91TAM03_CRT_DATETIME, new Boolean(n92TAM03_CRT_USER_ID), A92TAM03_CRT_USER_ID, new Boolean(n94TAM03_UPD_DATETIME), A94TAM03_UPD_DATETIME, new Boolean(n95TAM03_UPD_USER_ID), A95TAM03_UPD_USER_ID, new Boolean(n97TAM03_UPD_CNT), new Long(A97TAM03_UPD_CNT), new Boolean(n127TAM03_APP_NM), A127TAM03_APP_NM, new Boolean(n128TAM03_SUB_MENU_FLG), A128TAM03_SUB_MENU_FLG, new Boolean(n89TAM03_KIDO_PG), A89TAM03_KIDO_PG, new Boolean(n90TAM03_DEL_FLG), A90TAM03_DEL_FLG, new Boolean(n93TAM03_CRT_PROG_NM), A93TAM03_CRT_PROG_NM, new Boolean(n96TAM03_UPD_PROG_NM), A96TAM03_UPD_PROG_NM});
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A88TAM03_APP_ID, A127TAM03_APP_NM, A128TAM03_SUB_MENU_FLG, A89TAM03_KIDO_PG, A90TAM03_DEL_FLG, A91TAM03_CRT_DATETIME, A92TAM03_CRT_USER_ID, A93TAM03_CRT_PROG_NM, A94TAM03_UPD_DATETIME, A95TAM03_UPD_USER_ID, A96TAM03_UPD_PROG_NM, A97TAM03_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
                     httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
                        resetCaption080( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load088( ) ;
         }
         endLevel088( ) ;
      }
      closeExtendedTableCursors088( ) ;
   }

   public void update088( )
   {
      beforeValidate088( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable088( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency088( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm088( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate088( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00089 */
                  pr_default.execute(7, new Object[] {new Boolean(n91TAM03_CRT_DATETIME), A91TAM03_CRT_DATETIME, new Boolean(n92TAM03_CRT_USER_ID), A92TAM03_CRT_USER_ID, new Boolean(n94TAM03_UPD_DATETIME), A94TAM03_UPD_DATETIME, new Boolean(n95TAM03_UPD_USER_ID), A95TAM03_UPD_USER_ID, new Boolean(n97TAM03_UPD_CNT), new Long(A97TAM03_UPD_CNT), new Boolean(n127TAM03_APP_NM), A127TAM03_APP_NM, new Boolean(n128TAM03_SUB_MENU_FLG), A128TAM03_SUB_MENU_FLG, new Boolean(n89TAM03_KIDO_PG), A89TAM03_KIDO_PG, new Boolean(n90TAM03_DEL_FLG), A90TAM03_DEL_FLG, new Boolean(n93TAM03_CRT_PROG_NM), A93TAM03_CRT_PROG_NM, new Boolean(n96TAM03_UPD_PROG_NM), A96TAM03_UPD_PROG_NM, A88TAM03_APP_ID});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM03_APPLI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate088( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A88TAM03_APP_ID, A127TAM03_APP_NM, A128TAM03_SUB_MENU_FLG, A89TAM03_KIDO_PG, A90TAM03_DEL_FLG, A91TAM03_CRT_DATETIME, A92TAM03_CRT_USER_ID, A93TAM03_CRT_PROG_NM, A94TAM03_UPD_DATETIME, A95TAM03_UPD_USER_ID, A96TAM03_UPD_PROG_NM, A97TAM03_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
                     httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption080( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel088( ) ;
      }
      closeExtendedTableCursors088( ) ;
   }

   public void deferredUpdate088( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate088( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency088( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls088( ) ;
         afterConfirm088( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete088( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000810 */
               pr_default.execute(8, new Object[] {A88TAM03_APP_ID});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A88TAM03_APP_ID, A127TAM03_APP_NM, A128TAM03_SUB_MENU_FLG, A89TAM03_KIDO_PG, A90TAM03_DEL_FLG, A91TAM03_CRT_DATETIME, A92TAM03_CRT_USER_ID, A93TAM03_CRT_PROG_NM, A94TAM03_UPD_DATETIME, A95TAM03_UPD_USER_ID, A96TAM03_UPD_PROG_NM, A97TAM03_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
                  httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound8 == 0 )
                     {
                        initAll088( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
                     resetCaption080( ) ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode8 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel088( ) ;
      Gx_mode = sMode8 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls088( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV14Pgmname = "TAM03_APPLI" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000811 */
         pr_default.execute(9, new Object[] {A88TAM03_APP_ID});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"アプリケーション権限マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000812 */
         pr_default.execute(10, new Object[] {A88TAM03_APP_ID});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"メニューIDマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel088( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete088( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tam03_appli");
         if ( AnyError == 0 )
         {
            confirmValues080( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tam03_appli");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart088( )
   {
      /* Using cursor T000813 */
      pr_default.execute(11);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A88TAM03_APP_ID = T000813_A88TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext088( )
   {
      pr_default.readNext(11);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A88TAM03_APP_ID = T000813_A88TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
      }
   }

   public void scanEnd088( )
   {
      pr_default.close(11);
   }

   public void afterConfirm088( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A88TAM03_APP_ID)==0) )
      {
         httpContext.GX_msglist.addItem("アプリケーションIDを入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 7 < GXutil.byteCount( A88TAM03_APP_ID, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("アプリケーションIDは半角7桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( (GXutil.strcmp("", A127TAM03_APP_NM)==0) )
      {
         httpContext.GX_msglist.addItem("アプリケーション名を入力してください", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 40 < GXutil.byteCount( A127TAM03_APP_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("アプリケーション名は全角20桁又は半角40桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( 40 < GXutil.byteCount( A89TAM03_KIDO_PG, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("起動プログラムは半角40桁以内になるようにしてください。", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert088( )
   {
      /* Before Insert Rules */
      A91TAM03_CRT_DATETIME = GXutil.now( ) ;
      n91TAM03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A92TAM03_CRT_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam03_appli_impl.this.GXt_char2 = GXv_char5[0] ;
      A92TAM03_CRT_USER_ID = GXt_char2 ;
      n92TAM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
      A94TAM03_UPD_DATETIME = GXutil.now( ) ;
      n94TAM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A95TAM03_UPD_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam03_appli_impl.this.GXt_char2 = GXv_char5[0] ;
      A95TAM03_UPD_USER_ID = GXt_char2 ;
      n95TAM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
      A97TAM03_UPD_CNT = (long)(O97TAM03_UPD_CNT+1) ;
      n97TAM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate088( )
   {
      /* Before Update Rules */
      A94TAM03_UPD_DATETIME = GXutil.now( ) ;
      n94TAM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char2 = A95TAM03_UPD_USER_ID ;
      GXv_char5[0] = GXt_char2 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam03_appli_impl.this.GXt_char2 = GXv_char5[0] ;
      A95TAM03_UPD_USER_ID = GXt_char2 ;
      n95TAM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
      A97TAM03_UPD_CNT = (long)(O97TAM03_UPD_CNT+1) ;
      n97TAM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
   }

   public void beforeDelete088( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete088( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate088( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes088( )
   {
      edtTAM03_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_APP_ID_Enabled, 5, 0)));
      edtTAM03_APP_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_APP_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_APP_NM_Enabled, 5, 0)));
      radTAM03_SUB_MENU_FLG.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radTAM03_SUB_MENU_FLG.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radTAM03_SUB_MENU_FLG.getEnabled(), 5, 0)));
      edtTAM03_KIDO_PG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_KIDO_PG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_KIDO_PG_Enabled, 5, 0)));
      radTAM03_DEL_FLG.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radTAM03_DEL_FLG.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radTAM03_DEL_FLG.getEnabled(), 5, 0)));
      edtTAM03_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM03_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM03_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM03_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM03_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM03_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues080( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "アプリケーションマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
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
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;") ;
      httpContext.writeText( "\""+FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tam03_appli") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm088( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z88TAM03_APP_ID", GXutil.rtrim( Z88TAM03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z91TAM03_CRT_DATETIME", localUtil.ttoc( Z91TAM03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z92TAM03_CRT_USER_ID", GXutil.rtrim( Z92TAM03_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z94TAM03_UPD_DATETIME", localUtil.ttoc( Z94TAM03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z95TAM03_UPD_USER_ID", GXutil.rtrim( Z95TAM03_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z97TAM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z97TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z127TAM03_APP_NM", GXutil.rtrim( Z127TAM03_APP_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z128TAM03_SUB_MENU_FLG", GXutil.rtrim( Z128TAM03_SUB_MENU_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z89TAM03_KIDO_PG", GXutil.rtrim( Z89TAM03_KIDO_PG));
      GxWebStd.gx_hidden_field( httpContext, "Z90TAM03_DEL_FLG", GXutil.rtrim( Z90TAM03_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z93TAM03_CRT_PROG_NM", GXutil.rtrim( Z93TAM03_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z96TAM03_UPD_PROG_NM", GXutil.rtrim( Z96TAM03_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O97TAM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O97TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "TAM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A97TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV14Pgmname));
      GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
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

   public void initializeNonKey088( )
   {
      A91TAM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n91TAM03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n91TAM03_CRT_DATETIME = (GXutil.nullDate().equals(A91TAM03_CRT_DATETIME) ? true : false) ;
      A92TAM03_CRT_USER_ID = "" ;
      n92TAM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
      n92TAM03_CRT_USER_ID = ((GXutil.strcmp("", A92TAM03_CRT_USER_ID)==0) ? true : false) ;
      A94TAM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n94TAM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n94TAM03_UPD_DATETIME = (GXutil.nullDate().equals(A94TAM03_UPD_DATETIME) ? true : false) ;
      A95TAM03_UPD_USER_ID = "" ;
      n95TAM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
      n95TAM03_UPD_USER_ID = ((GXutil.strcmp("", A95TAM03_UPD_USER_ID)==0) ? true : false) ;
      A97TAM03_UPD_CNT = 0 ;
      n97TAM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
      A127TAM03_APP_NM = "" ;
      n127TAM03_APP_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
      n127TAM03_APP_NM = ((GXutil.strcmp("", A127TAM03_APP_NM)==0) ? true : false) ;
      A89TAM03_KIDO_PG = "" ;
      n89TAM03_KIDO_PG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
      n89TAM03_KIDO_PG = ((GXutil.strcmp("", A89TAM03_KIDO_PG)==0) ? true : false) ;
      A128TAM03_SUB_MENU_FLG = "0" ;
      n128TAM03_SUB_MENU_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
      A90TAM03_DEL_FLG = "0" ;
      n90TAM03_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
      A93TAM03_CRT_PROG_NM = AV14Pgmname ;
      n93TAM03_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
      A96TAM03_UPD_PROG_NM = AV14Pgmname ;
      n96TAM03_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
      O97TAM03_UPD_CNT = A97TAM03_UPD_CNT ;
      n97TAM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
   }

   public void initAll088( )
   {
      A88TAM03_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
      initializeNonKey088( ) ;
   }

   public void standaloneModalInsert( )
   {
      A128TAM03_SUB_MENU_FLG = i128TAM03_SUB_MENU_FLG ;
      n128TAM03_SUB_MENU_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
      A90TAM03_DEL_FLG = i90TAM03_DEL_FLG ;
      n90TAM03_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
      A93TAM03_CRT_PROG_NM = i93TAM03_CRT_PROG_NM ;
      n93TAM03_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
      A96TAM03_UPD_PROG_NM = i96TAM03_UPD_PROG_NM ;
      n96TAM03_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1453559");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tam03_appli.js", "?1453559");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgBtn_first_Internalname = "BTN_FIRST" ;
      imgBtn_first_separator_Internalname = "BTN_FIRST_SEPARATOR" ;
      imgBtn_previous_Internalname = "BTN_PREVIOUS" ;
      imgBtn_previous_separator_Internalname = "BTN_PREVIOUS_SEPARATOR" ;
      imgBtn_next_Internalname = "BTN_NEXT" ;
      imgBtn_next_separator_Internalname = "BTN_NEXT_SEPARATOR" ;
      imgBtn_last_Internalname = "BTN_LAST" ;
      imgBtn_last_separator_Internalname = "BTN_LAST_SEPARATOR" ;
      imgBtn_select_Internalname = "BTN_SELECT" ;
      imgBtn_select_separator_Internalname = "BTN_SELECT_SEPARATOR" ;
      imgBtn_enter2_Internalname = "BTN_ENTER2" ;
      imgBtn_enter2_separator_Internalname = "BTN_ENTER2_SEPARATOR" ;
      imgBtn_cancel2_Internalname = "BTN_CANCEL2" ;
      imgBtn_cancel2_separator_Internalname = "BTN_CANCEL2_SEPARATOR" ;
      imgBtn_delete2_Internalname = "BTN_DELETE2" ;
      imgBtn_delete2_separator_Internalname = "BTN_DELETE2_SEPARATOR" ;
      tblTabletoolbar_Internalname = "TABLETOOLBAR" ;
      imgImage19_Internalname = "IMAGE19" ;
      lblTextblocktam03_app_id_Internalname = "TEXTBLOCKTAM03_APP_ID" ;
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      tblTable3_Internalname = "TABLE3" ;
      imgImage20_Internalname = "IMAGE20" ;
      lblTextblocktam03_app_nm_Internalname = "TEXTBLOCKTAM03_APP_NM" ;
      edtTAM03_APP_NM_Internalname = "TAM03_APP_NM" ;
      lblTextblocktam03_sub_menu_flg_Internalname = "TEXTBLOCKTAM03_SUB_MENU_FLG" ;
      radTAM03_SUB_MENU_FLG.setInternalname( "TAM03_SUB_MENU_FLG" );
      lblTextblocktam03_kido_pg_Internalname = "TEXTBLOCKTAM03_KIDO_PG" ;
      edtTAM03_KIDO_PG_Internalname = "TAM03_KIDO_PG" ;
      lblTextblocktam01_del_flg_Internalname = "TEXTBLOCKTAM01_DEL_FLG" ;
      radTAM03_DEL_FLG.setInternalname( "TAM03_DEL_FLG" );
      lblTextblocktam03_crt_datetime_Internalname = "TEXTBLOCKTAM03_CRT_DATETIME" ;
      edtTAM03_CRT_DATETIME_Internalname = "TAM03_CRT_DATETIME" ;
      lblTextblocktam03_crt_user_id_Internalname = "TEXTBLOCKTAM03_CRT_USER_ID" ;
      edtTAM03_CRT_USER_ID_Internalname = "TAM03_CRT_USER_ID" ;
      lblTextblocktam03_crt_prog_nm_Internalname = "TEXTBLOCKTAM03_CRT_PROG_NM" ;
      edtTAM03_CRT_PROG_NM_Internalname = "TAM03_CRT_PROG_NM" ;
      lblTextblocktam03_upd_datetime_Internalname = "TEXTBLOCKTAM03_UPD_DATETIME" ;
      edtTAM03_UPD_DATETIME_Internalname = "TAM03_UPD_DATETIME" ;
      lblTextblocktam03_upd_user_id_Internalname = "TEXTBLOCKTAM03_UPD_USER_ID" ;
      edtTAM03_UPD_USER_ID_Internalname = "TAM03_UPD_USER_ID" ;
      lblTextblocktam03_upd_prog_nm_Internalname = "TEXTBLOCKTAM03_UPD_PROG_NM" ;
      edtTAM03_UPD_PROG_NM_Internalname = "TAM03_UPD_PROG_NM" ;
      tblTable2_Internalname = "TABLE2" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      lblBtn_cancel_Internalname = "BTN_CANCEL" ;
      tblTable4_Internalname = "TABLE4" ;
      tblTable1_Internalname = "TABLE1" ;
      grpGroupdata_Internalname = "GROUPDATA" ;
      tblTablemain_Internalname = "TABLEMAIN" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      imgBtn_delete2_separator_Visible = 1 ;
      imgBtn_delete2_Enabled = 1 ;
      imgBtn_delete2_Visible = 1 ;
      imgBtn_cancel2_separator_Visible = 1 ;
      imgBtn_cancel2_Visible = 1 ;
      imgBtn_enter2_separator_Visible = 1 ;
      imgBtn_enter2_Enabled = 1 ;
      imgBtn_enter2_Visible = 1 ;
      imgBtn_select_separator_Visible = 1 ;
      imgBtn_select_Visible = 1 ;
      imgBtn_last_separator_Visible = 1 ;
      imgBtn_last_Visible = 1 ;
      imgBtn_next_separator_Visible = 1 ;
      imgBtn_next_Visible = 1 ;
      imgBtn_previous_separator_Visible = 1 ;
      imgBtn_previous_Visible = 1 ;
      imgBtn_first_separator_Visible = 1 ;
      imgBtn_first_Visible = 1 ;
      edtTAM03_UPD_PROG_NM_Jsonclick = "" ;
      edtTAM03_UPD_PROG_NM_Enabled = 0 ;
      edtTAM03_UPD_PROG_NM_Visible = 1 ;
      edtTAM03_UPD_USER_ID_Jsonclick = "" ;
      edtTAM03_UPD_USER_ID_Enabled = 0 ;
      edtTAM03_UPD_DATETIME_Jsonclick = "" ;
      edtTAM03_UPD_DATETIME_Enabled = 0 ;
      edtTAM03_UPD_DATETIME_Visible = 1 ;
      edtTAM03_CRT_PROG_NM_Jsonclick = "" ;
      edtTAM03_CRT_PROG_NM_Enabled = 0 ;
      edtTAM03_CRT_PROG_NM_Visible = 1 ;
      edtTAM03_CRT_USER_ID_Jsonclick = "" ;
      edtTAM03_CRT_USER_ID_Enabled = 0 ;
      edtTAM03_CRT_DATETIME_Jsonclick = "" ;
      edtTAM03_CRT_DATETIME_Enabled = 0 ;
      edtTAM03_CRT_DATETIME_Visible = 1 ;
      radTAM03_DEL_FLG.setJsonclick( "" );
      radTAM03_DEL_FLG.setEnabled( 1 );
      edtTAM03_KIDO_PG_Jsonclick = "" ;
      edtTAM03_KIDO_PG_Enabled = 1 ;
      radTAM03_SUB_MENU_FLG.setJsonclick( "" );
      radTAM03_SUB_MENU_FLG.setEnabled( 1 );
      edtTAM03_APP_NM_Jsonclick = "" ;
      edtTAM03_APP_NM_Enabled = 1 ;
      imgImage20_Visible = 1 ;
      edtTAM03_APP_ID_Jsonclick = "" ;
      edtTAM03_APP_ID_Enabled = 1 ;
      imgImage19_Visible = 1 ;
      lblBtn_cancel_Enabled = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx7asatam03_crt_user_id088( String Gx_mode )
   {
      GXt_char6 = A92TAM03_CRT_USER_ID ;
      GXv_char5[0] = GXt_char6 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam03_appli_impl.this.GXt_char6 = GXv_char5[0] ;
      A92TAM03_CRT_USER_ID = GXt_char6 ;
      n92TAM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A92TAM03_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx9asatam03_upd_user_id088( String Gx_mode )
   {
      GXt_char6 = A95TAM03_UPD_USER_ID ;
      GXv_char5[0] = GXt_char6 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char5) ;
      tam03_appli_impl.this.GXt_char6 = GXv_char5[0] ;
      A95TAM03_UPD_USER_ID = GXt_char6 ;
      n95TAM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A95TAM03_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_26_088( String AV14Pgmname ,
                          String Gx_mode ,
                          String A88TAM03_APP_ID ,
                          String A127TAM03_APP_NM ,
                          String A128TAM03_SUB_MENU_FLG ,
                          String A89TAM03_KIDO_PG ,
                          String A90TAM03_DEL_FLG ,
                          java.util.Date A91TAM03_CRT_DATETIME ,
                          String A92TAM03_CRT_USER_ID ,
                          String A93TAM03_CRT_PROG_NM ,
                          java.util.Date A94TAM03_UPD_DATETIME ,
                          String A95TAM03_UPD_USER_ID ,
                          String A96TAM03_UPD_PROG_NM ,
                          long A97TAM03_UPD_CNT )
   {
      new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A88TAM03_APP_ID, A127TAM03_APP_NM, A128TAM03_SUB_MENU_FLG, A89TAM03_KIDO_PG, A90TAM03_DEL_FLG, A91TAM03_CRT_DATETIME, A92TAM03_CRT_USER_ID, A93TAM03_CRT_PROG_NM, A94TAM03_UPD_DATETIME, A95TAM03_UPD_USER_ID, A96TAM03_UPD_PROG_NM, A97TAM03_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
      httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_27_088( String AV14Pgmname ,
                          String Gx_mode ,
                          String A88TAM03_APP_ID ,
                          String A127TAM03_APP_NM ,
                          String A128TAM03_SUB_MENU_FLG ,
                          String A89TAM03_KIDO_PG ,
                          String A90TAM03_DEL_FLG ,
                          java.util.Date A91TAM03_CRT_DATETIME ,
                          String A92TAM03_CRT_USER_ID ,
                          String A93TAM03_CRT_PROG_NM ,
                          java.util.Date A94TAM03_UPD_DATETIME ,
                          String A95TAM03_UPD_USER_ID ,
                          String A96TAM03_UPD_PROG_NM ,
                          long A97TAM03_UPD_CNT )
   {
      new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A88TAM03_APP_ID, A127TAM03_APP_NM, A128TAM03_SUB_MENU_FLG, A89TAM03_KIDO_PG, A90TAM03_DEL_FLG, A91TAM03_CRT_DATETIME, A92TAM03_CRT_USER_ID, A93TAM03_CRT_PROG_NM, A94TAM03_UPD_DATETIME, A95TAM03_UPD_USER_ID, A96TAM03_UPD_PROG_NM, A97TAM03_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
      httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_28_088( String AV14Pgmname ,
                          String Gx_mode ,
                          String A88TAM03_APP_ID ,
                          String A127TAM03_APP_NM ,
                          String A128TAM03_SUB_MENU_FLG ,
                          String A89TAM03_KIDO_PG ,
                          String A90TAM03_DEL_FLG ,
                          java.util.Date A91TAM03_CRT_DATETIME ,
                          String A92TAM03_CRT_USER_ID ,
                          String A93TAM03_CRT_PROG_NM ,
                          java.util.Date A94TAM03_UPD_DATETIME ,
                          String A95TAM03_UPD_USER_ID ,
                          String A96TAM03_UPD_PROG_NM ,
                          long A97TAM03_UPD_CNT )
   {
      new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A88TAM03_APP_ID, A127TAM03_APP_NM, A128TAM03_SUB_MENU_FLG, A89TAM03_KIDO_PG, A90TAM03_DEL_FLG, A91TAM03_CRT_DATETIME, A92TAM03_CRT_USER_ID, A93TAM03_CRT_PROG_NM, A94TAM03_UPD_DATETIME, A95TAM03_UPD_USER_ID, A96TAM03_UPD_PROG_NM, A97TAM03_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A88TAM03_APP_ID", A88TAM03_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A127TAM03_APP_NM", A127TAM03_APP_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A128TAM03_SUB_MENU_FLG", A128TAM03_SUB_MENU_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A89TAM03_KIDO_PG", A89TAM03_KIDO_PG);
      httpContext.ajax_rsp_assign_attri("", false, "A90TAM03_DEL_FLG", A90TAM03_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A91TAM03_CRT_DATETIME", localUtil.ttoc( A91TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A92TAM03_CRT_USER_ID", A92TAM03_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A93TAM03_CRT_PROG_NM", A93TAM03_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A94TAM03_UPD_DATETIME", localUtil.ttoc( A94TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A95TAM03_UPD_USER_ID", A95TAM03_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A96TAM03_UPD_PROG_NM", A96TAM03_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A97TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A97TAM03_UPD_CNT, 10, 0)));
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      GX_FocusControl = edtTAM03_APP_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tam03_app_id( String GX_Parm1 ,
                                   java.util.Date GX_Parm2 ,
                                   String GX_Parm3 ,
                                   java.util.Date GX_Parm4 ,
                                   String GX_Parm5 ,
                                   long GX_Parm6 ,
                                   String GX_Parm7 ,
                                   String GX_Parm8 ,
                                   String GX_Parm9 ,
                                   String GX_Parm10 ,
                                   String GX_Parm11 ,
                                   String GX_Parm12 )
   {
      A88TAM03_APP_ID = GX_Parm1 ;
      A91TAM03_CRT_DATETIME = GX_Parm2 ;
      n91TAM03_CRT_DATETIME = false ;
      A92TAM03_CRT_USER_ID = GX_Parm3 ;
      n92TAM03_CRT_USER_ID = false ;
      A94TAM03_UPD_DATETIME = GX_Parm4 ;
      n94TAM03_UPD_DATETIME = false ;
      A95TAM03_UPD_USER_ID = GX_Parm5 ;
      n95TAM03_UPD_USER_ID = false ;
      A97TAM03_UPD_CNT = GX_Parm6 ;
      n97TAM03_UPD_CNT = false ;
      A127TAM03_APP_NM = GX_Parm7 ;
      n127TAM03_APP_NM = false ;
      A128TAM03_SUB_MENU_FLG = GX_Parm8 ;
      n128TAM03_SUB_MENU_FLG = false ;
      A89TAM03_KIDO_PG = GX_Parm9 ;
      n89TAM03_KIDO_PG = false ;
      A90TAM03_DEL_FLG = GX_Parm10 ;
      n90TAM03_DEL_FLG = false ;
      A93TAM03_CRT_PROG_NM = GX_Parm11 ;
      n93TAM03_CRT_PROG_NM = false ;
      A96TAM03_UPD_PROG_NM = GX_Parm12 ;
      n96TAM03_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A91TAM03_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A92TAM03_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A94TAM03_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A95TAM03_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A97TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A127TAM03_APP_NM));
      isValidOutput.add(GXutil.rtrim( A128TAM03_SUB_MENU_FLG));
      isValidOutput.add(GXutil.rtrim( A89TAM03_KIDO_PG));
      isValidOutput.add(GXutil.rtrim( A90TAM03_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A93TAM03_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A96TAM03_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV14Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z88TAM03_APP_ID));
      isValidOutput.add(localUtil.ttoc( Z91TAM03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z92TAM03_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z94TAM03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z95TAM03_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z97TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z127TAM03_APP_NM));
      isValidOutput.add(GXutil.rtrim( Z128TAM03_SUB_MENU_FLG));
      isValidOutput.add(GXutil.rtrim( Z89TAM03_KIDO_PG));
      isValidOutput.add(GXutil.rtrim( Z90TAM03_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z93TAM03_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z96TAM03_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV14Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O97TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(edtTAM03_APP_ID_Enabled);
      isValidOutput.add(edtTAM03_CRT_DATETIME_Visible);
      isValidOutput.add(edtTAM03_CRT_PROG_NM_Visible);
      isValidOutput.add(edtTAM03_UPD_DATETIME_Visible);
      isValidOutput.add(edtTAM03_UPD_PROG_NM_Visible);
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(lblBtn_cancel_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
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
                  /* Execute user subroutine: S13109 */
                  S13109 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      sPrefix = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14Pgmname = "" ;
      Gx_mode = "" ;
      A88TAM03_APP_ID = "" ;
      A127TAM03_APP_NM = "" ;
      A128TAM03_SUB_MENU_FLG = "" ;
      A89TAM03_KIDO_PG = "" ;
      A90TAM03_DEL_FLG = "" ;
      A91TAM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A92TAM03_CRT_USER_ID = "" ;
      A93TAM03_CRT_PROG_NM = "" ;
      A94TAM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A95TAM03_UPD_USER_ID = "" ;
      A96TAM03_UPD_PROG_NM = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblBtn_cancel_Jsonclick = "" ;
      lblTextblocktam03_app_id_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblocktam03_app_nm_Jsonclick = "" ;
      lblTextblocktam03_sub_menu_flg_Jsonclick = "" ;
      lblTextblocktam03_kido_pg_Jsonclick = "" ;
      lblTextblocktam01_del_flg_Jsonclick = "" ;
      lblTextblocktam03_crt_datetime_Jsonclick = "" ;
      lblTextblocktam03_crt_user_id_Jsonclick = "" ;
      lblTextblocktam03_crt_prog_nm_Jsonclick = "" ;
      lblTextblocktam03_upd_datetime_Jsonclick = "" ;
      lblTextblocktam03_upd_user_id_Jsonclick = "" ;
      lblTextblocktam03_upd_prog_nm_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      imgBtn_first_Jsonclick = "" ;
      imgBtn_first_separator_Jsonclick = "" ;
      imgBtn_previous_Jsonclick = "" ;
      imgBtn_previous_separator_Jsonclick = "" ;
      imgBtn_next_Jsonclick = "" ;
      imgBtn_next_separator_Jsonclick = "" ;
      imgBtn_last_Jsonclick = "" ;
      imgBtn_last_separator_Jsonclick = "" ;
      imgBtn_select_Jsonclick = "" ;
      imgBtn_select_separator_Jsonclick = "" ;
      imgBtn_enter2_Jsonclick = "" ;
      imgBtn_enter2_separator_Jsonclick = "" ;
      imgBtn_cancel2_Jsonclick = "" ;
      imgBtn_cancel2_separator_Jsonclick = "" ;
      imgBtn_delete2_Jsonclick = "" ;
      imgBtn_delete2_separator_Jsonclick = "" ;
      Z88TAM03_APP_ID = "" ;
      Z91TAM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z92TAM03_CRT_USER_ID = "" ;
      Z94TAM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z95TAM03_UPD_USER_ID = "" ;
      Z127TAM03_APP_NM = "" ;
      Z128TAM03_SUB_MENU_FLG = "" ;
      Z89TAM03_KIDO_PG = "" ;
      Z90TAM03_DEL_FLG = "" ;
      Z93TAM03_CRT_PROG_NM = "" ;
      Z96TAM03_UPD_PROG_NM = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7C_TAM02_APP_ID = "" ;
      AV9W_ERRCD = "" ;
      AV12W_MSG = "" ;
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      GXEncryptionTmp = "" ;
      AV10W_KNGN_FLG = "" ;
      GXv_char3 = new String [1] ;
      T00084_A88TAM03_APP_ID = new String[] {""} ;
      T00084_A91TAM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00084_n91TAM03_CRT_DATETIME = new boolean[] {false} ;
      T00084_A92TAM03_CRT_USER_ID = new String[] {""} ;
      T00084_n92TAM03_CRT_USER_ID = new boolean[] {false} ;
      T00084_A94TAM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00084_n94TAM03_UPD_DATETIME = new boolean[] {false} ;
      T00084_A95TAM03_UPD_USER_ID = new String[] {""} ;
      T00084_n95TAM03_UPD_USER_ID = new boolean[] {false} ;
      T00084_A97TAM03_UPD_CNT = new long[1] ;
      T00084_n97TAM03_UPD_CNT = new boolean[] {false} ;
      T00084_A127TAM03_APP_NM = new String[] {""} ;
      T00084_n127TAM03_APP_NM = new boolean[] {false} ;
      T00084_A128TAM03_SUB_MENU_FLG = new String[] {""} ;
      T00084_n128TAM03_SUB_MENU_FLG = new boolean[] {false} ;
      T00084_A89TAM03_KIDO_PG = new String[] {""} ;
      T00084_n89TAM03_KIDO_PG = new boolean[] {false} ;
      T00084_A90TAM03_DEL_FLG = new String[] {""} ;
      T00084_n90TAM03_DEL_FLG = new boolean[] {false} ;
      T00084_A93TAM03_CRT_PROG_NM = new String[] {""} ;
      T00084_n93TAM03_CRT_PROG_NM = new boolean[] {false} ;
      T00084_A96TAM03_UPD_PROG_NM = new String[] {""} ;
      T00084_n96TAM03_UPD_PROG_NM = new boolean[] {false} ;
      T00085_A88TAM03_APP_ID = new String[] {""} ;
      T00083_A88TAM03_APP_ID = new String[] {""} ;
      T00083_A91TAM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00083_n91TAM03_CRT_DATETIME = new boolean[] {false} ;
      T00083_A92TAM03_CRT_USER_ID = new String[] {""} ;
      T00083_n92TAM03_CRT_USER_ID = new boolean[] {false} ;
      T00083_A94TAM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00083_n94TAM03_UPD_DATETIME = new boolean[] {false} ;
      T00083_A95TAM03_UPD_USER_ID = new String[] {""} ;
      T00083_n95TAM03_UPD_USER_ID = new boolean[] {false} ;
      T00083_A97TAM03_UPD_CNT = new long[1] ;
      T00083_n97TAM03_UPD_CNT = new boolean[] {false} ;
      T00083_A127TAM03_APP_NM = new String[] {""} ;
      T00083_n127TAM03_APP_NM = new boolean[] {false} ;
      T00083_A128TAM03_SUB_MENU_FLG = new String[] {""} ;
      T00083_n128TAM03_SUB_MENU_FLG = new boolean[] {false} ;
      T00083_A89TAM03_KIDO_PG = new String[] {""} ;
      T00083_n89TAM03_KIDO_PG = new boolean[] {false} ;
      T00083_A90TAM03_DEL_FLG = new String[] {""} ;
      T00083_n90TAM03_DEL_FLG = new boolean[] {false} ;
      T00083_A93TAM03_CRT_PROG_NM = new String[] {""} ;
      T00083_n93TAM03_CRT_PROG_NM = new boolean[] {false} ;
      T00083_A96TAM03_UPD_PROG_NM = new String[] {""} ;
      T00083_n96TAM03_UPD_PROG_NM = new boolean[] {false} ;
      sMode8 = "" ;
      T00086_A88TAM03_APP_ID = new String[] {""} ;
      T00087_A88TAM03_APP_ID = new String[] {""} ;
      T00082_A88TAM03_APP_ID = new String[] {""} ;
      T00082_A91TAM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00082_n91TAM03_CRT_DATETIME = new boolean[] {false} ;
      T00082_A92TAM03_CRT_USER_ID = new String[] {""} ;
      T00082_n92TAM03_CRT_USER_ID = new boolean[] {false} ;
      T00082_A94TAM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00082_n94TAM03_UPD_DATETIME = new boolean[] {false} ;
      T00082_A95TAM03_UPD_USER_ID = new String[] {""} ;
      T00082_n95TAM03_UPD_USER_ID = new boolean[] {false} ;
      T00082_A97TAM03_UPD_CNT = new long[1] ;
      T00082_n97TAM03_UPD_CNT = new boolean[] {false} ;
      T00082_A127TAM03_APP_NM = new String[] {""} ;
      T00082_n127TAM03_APP_NM = new boolean[] {false} ;
      T00082_A128TAM03_SUB_MENU_FLG = new String[] {""} ;
      T00082_n128TAM03_SUB_MENU_FLG = new boolean[] {false} ;
      T00082_A89TAM03_KIDO_PG = new String[] {""} ;
      T00082_n89TAM03_KIDO_PG = new boolean[] {false} ;
      T00082_A90TAM03_DEL_FLG = new String[] {""} ;
      T00082_n90TAM03_DEL_FLG = new boolean[] {false} ;
      T00082_A93TAM03_CRT_PROG_NM = new String[] {""} ;
      T00082_n93TAM03_CRT_PROG_NM = new boolean[] {false} ;
      T00082_A96TAM03_UPD_PROG_NM = new String[] {""} ;
      T00082_n96TAM03_UPD_PROG_NM = new boolean[] {false} ;
      T000811_A17TAM04_AUTH_CD = new String[] {""} ;
      T000811_A88TAM03_APP_ID = new String[] {""} ;
      T000812_A1TAM01_SYS_ID = new String[] {""} ;
      T000812_A11TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T000812_A12TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T000812_A13TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      T000813_A88TAM03_APP_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      i128TAM03_SUB_MENU_FLG = "" ;
      i90TAM03_DEL_FLG = "" ;
      i93TAM03_CRT_PROG_NM = "" ;
      i96TAM03_UPD_PROG_NM = "" ;
      GXv_char5 = new String [1] ;
      GXt_char6 = "" ;
      ZV14Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam03_appli__default(),
         new Object[] {
             new Object[] {
            T00082_A88TAM03_APP_ID, T00082_A91TAM03_CRT_DATETIME, T00082_n91TAM03_CRT_DATETIME, T00082_A92TAM03_CRT_USER_ID, T00082_n92TAM03_CRT_USER_ID, T00082_A94TAM03_UPD_DATETIME, T00082_n94TAM03_UPD_DATETIME, T00082_A95TAM03_UPD_USER_ID, T00082_n95TAM03_UPD_USER_ID, T00082_A97TAM03_UPD_CNT,
            T00082_n97TAM03_UPD_CNT, T00082_A127TAM03_APP_NM, T00082_n127TAM03_APP_NM, T00082_A128TAM03_SUB_MENU_FLG, T00082_n128TAM03_SUB_MENU_FLG, T00082_A89TAM03_KIDO_PG, T00082_n89TAM03_KIDO_PG, T00082_A90TAM03_DEL_FLG, T00082_n90TAM03_DEL_FLG, T00082_A93TAM03_CRT_PROG_NM,
            T00082_n93TAM03_CRT_PROG_NM, T00082_A96TAM03_UPD_PROG_NM, T00082_n96TAM03_UPD_PROG_NM
            }
            , new Object[] {
            T00083_A88TAM03_APP_ID, T00083_A91TAM03_CRT_DATETIME, T00083_n91TAM03_CRT_DATETIME, T00083_A92TAM03_CRT_USER_ID, T00083_n92TAM03_CRT_USER_ID, T00083_A94TAM03_UPD_DATETIME, T00083_n94TAM03_UPD_DATETIME, T00083_A95TAM03_UPD_USER_ID, T00083_n95TAM03_UPD_USER_ID, T00083_A97TAM03_UPD_CNT,
            T00083_n97TAM03_UPD_CNT, T00083_A127TAM03_APP_NM, T00083_n127TAM03_APP_NM, T00083_A128TAM03_SUB_MENU_FLG, T00083_n128TAM03_SUB_MENU_FLG, T00083_A89TAM03_KIDO_PG, T00083_n89TAM03_KIDO_PG, T00083_A90TAM03_DEL_FLG, T00083_n90TAM03_DEL_FLG, T00083_A93TAM03_CRT_PROG_NM,
            T00083_n93TAM03_CRT_PROG_NM, T00083_A96TAM03_UPD_PROG_NM, T00083_n96TAM03_UPD_PROG_NM
            }
            , new Object[] {
            T00084_A88TAM03_APP_ID, T00084_A91TAM03_CRT_DATETIME, T00084_n91TAM03_CRT_DATETIME, T00084_A92TAM03_CRT_USER_ID, T00084_n92TAM03_CRT_USER_ID, T00084_A94TAM03_UPD_DATETIME, T00084_n94TAM03_UPD_DATETIME, T00084_A95TAM03_UPD_USER_ID, T00084_n95TAM03_UPD_USER_ID, T00084_A97TAM03_UPD_CNT,
            T00084_n97TAM03_UPD_CNT, T00084_A127TAM03_APP_NM, T00084_n127TAM03_APP_NM, T00084_A128TAM03_SUB_MENU_FLG, T00084_n128TAM03_SUB_MENU_FLG, T00084_A89TAM03_KIDO_PG, T00084_n89TAM03_KIDO_PG, T00084_A90TAM03_DEL_FLG, T00084_n90TAM03_DEL_FLG, T00084_A93TAM03_CRT_PROG_NM,
            T00084_n93TAM03_CRT_PROG_NM, T00084_A96TAM03_UPD_PROG_NM, T00084_n96TAM03_UPD_PROG_NM
            }
            , new Object[] {
            T00085_A88TAM03_APP_ID
            }
            , new Object[] {
            T00086_A88TAM03_APP_ID
            }
            , new Object[] {
            T00087_A88TAM03_APP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000811_A17TAM04_AUTH_CD, T000811_A88TAM03_APP_ID
            }
            , new Object[] {
            T000812_A1TAM01_SYS_ID, T000812_A11TAM02_MENU_ID_TREE_1, T000812_A12TAM02_MENU_ID_TREE_2, T000812_A13TAM02_MENU_ID_TREE_3
            }
            , new Object[] {
            T000813_A88TAM03_APP_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z96TAM03_UPD_PROG_NM = AV14Pgmname ;
      n96TAM03_UPD_PROG_NM = false ;
      Z93TAM03_CRT_PROG_NM = AV14Pgmname ;
      n93TAM03_CRT_PROG_NM = false ;
      AV14Pgmname = "TAM03_APPLI" ;
      Z90TAM03_DEL_FLG = "0" ;
      n90TAM03_DEL_FLG = false ;
      Z128TAM03_SUB_MENU_FLG = "0" ;
      n128TAM03_SUB_MENU_FLG = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound8 ;
   private short Gx_err ;
   private int trnEnded ;
   private int lblBtn_cancel_Enabled ;
   private int imgImage19_Visible ;
   private int edtTAM03_APP_ID_Enabled ;
   private int imgImage20_Visible ;
   private int edtTAM03_APP_NM_Enabled ;
   private int edtTAM03_KIDO_PG_Enabled ;
   private int edtTAM03_CRT_DATETIME_Visible ;
   private int edtTAM03_CRT_DATETIME_Enabled ;
   private int edtTAM03_CRT_USER_ID_Enabled ;
   private int edtTAM03_CRT_PROG_NM_Visible ;
   private int edtTAM03_CRT_PROG_NM_Enabled ;
   private int edtTAM03_UPD_DATETIME_Visible ;
   private int edtTAM03_UPD_DATETIME_Enabled ;
   private int edtTAM03_UPD_USER_ID_Enabled ;
   private int edtTAM03_UPD_PROG_NM_Visible ;
   private int edtTAM03_UPD_PROG_NM_Enabled ;
   private int imgBtn_first_Visible ;
   private int imgBtn_first_separator_Visible ;
   private int imgBtn_previous_Visible ;
   private int imgBtn_previous_separator_Visible ;
   private int imgBtn_next_Visible ;
   private int imgBtn_next_separator_Visible ;
   private int imgBtn_last_Visible ;
   private int imgBtn_last_separator_Visible ;
   private int imgBtn_select_Visible ;
   private int imgBtn_select_separator_Visible ;
   private int imgBtn_enter2_Visible ;
   private int imgBtn_enter2_Enabled ;
   private int imgBtn_enter2_separator_Visible ;
   private int imgBtn_cancel2_Visible ;
   private int imgBtn_cancel2_separator_Visible ;
   private int imgBtn_delete2_Visible ;
   private int imgBtn_delete2_Enabled ;
   private int imgBtn_delete2_separator_Visible ;
   private int GXActiveErrHndl ;
   private int GX_JID ;
   private int idxLst ;
   private long A97TAM03_UPD_CNT ;
   private long Z97TAM03_UPD_CNT ;
   private long O97TAM03_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV14Pgmname ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTAM03_APP_ID_Internalname ;
   private String sStyleString ;
   private String tblTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String grpGroupdata_Internalname ;
   private String tblTable1_Internalname ;
   private String tblTable4_Internalname ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblBtn_cancel_Internalname ;
   private String lblBtn_cancel_Jsonclick ;
   private String tblTable2_Internalname ;
   private String imgImage19_Internalname ;
   private String lblTextblocktam03_app_id_Internalname ;
   private String lblTextblocktam03_app_id_Jsonclick ;
   private String TempTags ;
   private String edtTAM03_APP_ID_Jsonclick ;
   private String imgImage20_Internalname ;
   private String lblTextblocktam03_app_nm_Internalname ;
   private String lblTextblocktam03_app_nm_Jsonclick ;
   private String edtTAM03_APP_NM_Internalname ;
   private String edtTAM03_APP_NM_Jsonclick ;
   private String lblTextblocktam03_sub_menu_flg_Internalname ;
   private String lblTextblocktam03_sub_menu_flg_Jsonclick ;
   private String lblTextblocktam03_kido_pg_Internalname ;
   private String lblTextblocktam03_kido_pg_Jsonclick ;
   private String edtTAM03_KIDO_PG_Internalname ;
   private String edtTAM03_KIDO_PG_Jsonclick ;
   private String lblTextblocktam01_del_flg_Internalname ;
   private String lblTextblocktam01_del_flg_Jsonclick ;
   private String lblTextblocktam03_crt_datetime_Internalname ;
   private String lblTextblocktam03_crt_datetime_Jsonclick ;
   private String edtTAM03_CRT_DATETIME_Internalname ;
   private String edtTAM03_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktam03_crt_user_id_Internalname ;
   private String lblTextblocktam03_crt_user_id_Jsonclick ;
   private String edtTAM03_CRT_USER_ID_Internalname ;
   private String edtTAM03_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktam03_crt_prog_nm_Internalname ;
   private String lblTextblocktam03_crt_prog_nm_Jsonclick ;
   private String edtTAM03_CRT_PROG_NM_Internalname ;
   private String edtTAM03_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktam03_upd_datetime_Internalname ;
   private String lblTextblocktam03_upd_datetime_Jsonclick ;
   private String edtTAM03_UPD_DATETIME_Internalname ;
   private String edtTAM03_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktam03_upd_user_id_Internalname ;
   private String lblTextblocktam03_upd_user_id_Jsonclick ;
   private String edtTAM03_UPD_USER_ID_Internalname ;
   private String edtTAM03_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktam03_upd_prog_nm_Internalname ;
   private String lblTextblocktam03_upd_prog_nm_Jsonclick ;
   private String edtTAM03_UPD_PROG_NM_Internalname ;
   private String edtTAM03_UPD_PROG_NM_Jsonclick ;
   private String tblTable3_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String tblTabletoolbar_Internalname ;
   private String imgBtn_first_Internalname ;
   private String imgBtn_first_Jsonclick ;
   private String imgBtn_first_separator_Internalname ;
   private String imgBtn_first_separator_Jsonclick ;
   private String imgBtn_previous_Internalname ;
   private String imgBtn_previous_Jsonclick ;
   private String imgBtn_previous_separator_Internalname ;
   private String imgBtn_previous_separator_Jsonclick ;
   private String imgBtn_next_Internalname ;
   private String imgBtn_next_Jsonclick ;
   private String imgBtn_next_separator_Internalname ;
   private String imgBtn_next_separator_Jsonclick ;
   private String imgBtn_last_Internalname ;
   private String imgBtn_last_Jsonclick ;
   private String imgBtn_last_separator_Internalname ;
   private String imgBtn_last_separator_Jsonclick ;
   private String imgBtn_select_Internalname ;
   private String imgBtn_select_Jsonclick ;
   private String imgBtn_select_separator_Internalname ;
   private String imgBtn_select_separator_Jsonclick ;
   private String imgBtn_enter2_Internalname ;
   private String imgBtn_enter2_Jsonclick ;
   private String imgBtn_enter2_separator_Internalname ;
   private String imgBtn_enter2_separator_Jsonclick ;
   private String imgBtn_cancel2_Internalname ;
   private String imgBtn_cancel2_Jsonclick ;
   private String imgBtn_cancel2_separator_Internalname ;
   private String imgBtn_cancel2_separator_Jsonclick ;
   private String imgBtn_delete2_Internalname ;
   private String imgBtn_delete2_Jsonclick ;
   private String imgBtn_delete2_separator_Internalname ;
   private String imgBtn_delete2_separator_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String GXv_char3[] ;
   private String sMode8 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String GXt_char6 ;
   private String ZV14Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A91TAM03_CRT_DATETIME ;
   private java.util.Date A94TAM03_UPD_DATETIME ;
   private java.util.Date Z91TAM03_CRT_DATETIME ;
   private java.util.Date Z94TAM03_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n127TAM03_APP_NM ;
   private boolean n128TAM03_SUB_MENU_FLG ;
   private boolean n89TAM03_KIDO_PG ;
   private boolean n90TAM03_DEL_FLG ;
   private boolean n91TAM03_CRT_DATETIME ;
   private boolean n92TAM03_CRT_USER_ID ;
   private boolean n93TAM03_CRT_PROG_NM ;
   private boolean n94TAM03_UPD_DATETIME ;
   private boolean n95TAM03_UPD_USER_ID ;
   private boolean n96TAM03_UPD_PROG_NM ;
   private boolean n97TAM03_UPD_CNT ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A88TAM03_APP_ID ;
   private String A127TAM03_APP_NM ;
   private String A128TAM03_SUB_MENU_FLG ;
   private String A89TAM03_KIDO_PG ;
   private String A90TAM03_DEL_FLG ;
   private String A92TAM03_CRT_USER_ID ;
   private String A93TAM03_CRT_PROG_NM ;
   private String A95TAM03_UPD_USER_ID ;
   private String A96TAM03_UPD_PROG_NM ;
   private String Z88TAM03_APP_ID ;
   private String Z92TAM03_CRT_USER_ID ;
   private String Z95TAM03_UPD_USER_ID ;
   private String Z127TAM03_APP_NM ;
   private String Z128TAM03_SUB_MENU_FLG ;
   private String Z89TAM03_KIDO_PG ;
   private String Z90TAM03_DEL_FLG ;
   private String Z93TAM03_CRT_PROG_NM ;
   private String Z96TAM03_UPD_PROG_NM ;
   private String AV7C_TAM02_APP_ID ;
   private String AV9W_ERRCD ;
   private String AV12W_MSG ;
   private String AV10W_KNGN_FLG ;
   private String i128TAM03_SUB_MENU_FLG ;
   private String i90TAM03_DEL_FLG ;
   private String i93TAM03_CRT_PROG_NM ;
   private String i96TAM03_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice radTAM03_SUB_MENU_FLG ;
   private HTMLChoice radTAM03_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private String[] T00084_A88TAM03_APP_ID ;
   private java.util.Date[] T00084_A91TAM03_CRT_DATETIME ;
   private boolean[] T00084_n91TAM03_CRT_DATETIME ;
   private String[] T00084_A92TAM03_CRT_USER_ID ;
   private boolean[] T00084_n92TAM03_CRT_USER_ID ;
   private java.util.Date[] T00084_A94TAM03_UPD_DATETIME ;
   private boolean[] T00084_n94TAM03_UPD_DATETIME ;
   private String[] T00084_A95TAM03_UPD_USER_ID ;
   private boolean[] T00084_n95TAM03_UPD_USER_ID ;
   private long[] T00084_A97TAM03_UPD_CNT ;
   private boolean[] T00084_n97TAM03_UPD_CNT ;
   private String[] T00084_A127TAM03_APP_NM ;
   private boolean[] T00084_n127TAM03_APP_NM ;
   private String[] T00084_A128TAM03_SUB_MENU_FLG ;
   private boolean[] T00084_n128TAM03_SUB_MENU_FLG ;
   private String[] T00084_A89TAM03_KIDO_PG ;
   private boolean[] T00084_n89TAM03_KIDO_PG ;
   private String[] T00084_A90TAM03_DEL_FLG ;
   private boolean[] T00084_n90TAM03_DEL_FLG ;
   private String[] T00084_A93TAM03_CRT_PROG_NM ;
   private boolean[] T00084_n93TAM03_CRT_PROG_NM ;
   private String[] T00084_A96TAM03_UPD_PROG_NM ;
   private boolean[] T00084_n96TAM03_UPD_PROG_NM ;
   private String[] T00085_A88TAM03_APP_ID ;
   private String[] T00083_A88TAM03_APP_ID ;
   private java.util.Date[] T00083_A91TAM03_CRT_DATETIME ;
   private boolean[] T00083_n91TAM03_CRT_DATETIME ;
   private String[] T00083_A92TAM03_CRT_USER_ID ;
   private boolean[] T00083_n92TAM03_CRT_USER_ID ;
   private java.util.Date[] T00083_A94TAM03_UPD_DATETIME ;
   private boolean[] T00083_n94TAM03_UPD_DATETIME ;
   private String[] T00083_A95TAM03_UPD_USER_ID ;
   private boolean[] T00083_n95TAM03_UPD_USER_ID ;
   private long[] T00083_A97TAM03_UPD_CNT ;
   private boolean[] T00083_n97TAM03_UPD_CNT ;
   private String[] T00083_A127TAM03_APP_NM ;
   private boolean[] T00083_n127TAM03_APP_NM ;
   private String[] T00083_A128TAM03_SUB_MENU_FLG ;
   private boolean[] T00083_n128TAM03_SUB_MENU_FLG ;
   private String[] T00083_A89TAM03_KIDO_PG ;
   private boolean[] T00083_n89TAM03_KIDO_PG ;
   private String[] T00083_A90TAM03_DEL_FLG ;
   private boolean[] T00083_n90TAM03_DEL_FLG ;
   private String[] T00083_A93TAM03_CRT_PROG_NM ;
   private boolean[] T00083_n93TAM03_CRT_PROG_NM ;
   private String[] T00083_A96TAM03_UPD_PROG_NM ;
   private boolean[] T00083_n96TAM03_UPD_PROG_NM ;
   private String[] T00086_A88TAM03_APP_ID ;
   private String[] T00087_A88TAM03_APP_ID ;
   private String[] T00082_A88TAM03_APP_ID ;
   private java.util.Date[] T00082_A91TAM03_CRT_DATETIME ;
   private boolean[] T00082_n91TAM03_CRT_DATETIME ;
   private String[] T00082_A92TAM03_CRT_USER_ID ;
   private boolean[] T00082_n92TAM03_CRT_USER_ID ;
   private java.util.Date[] T00082_A94TAM03_UPD_DATETIME ;
   private boolean[] T00082_n94TAM03_UPD_DATETIME ;
   private String[] T00082_A95TAM03_UPD_USER_ID ;
   private boolean[] T00082_n95TAM03_UPD_USER_ID ;
   private long[] T00082_A97TAM03_UPD_CNT ;
   private boolean[] T00082_n97TAM03_UPD_CNT ;
   private String[] T00082_A127TAM03_APP_NM ;
   private boolean[] T00082_n127TAM03_APP_NM ;
   private String[] T00082_A128TAM03_SUB_MENU_FLG ;
   private boolean[] T00082_n128TAM03_SUB_MENU_FLG ;
   private String[] T00082_A89TAM03_KIDO_PG ;
   private boolean[] T00082_n89TAM03_KIDO_PG ;
   private String[] T00082_A90TAM03_DEL_FLG ;
   private boolean[] T00082_n90TAM03_DEL_FLG ;
   private String[] T00082_A93TAM03_CRT_PROG_NM ;
   private boolean[] T00082_n93TAM03_CRT_PROG_NM ;
   private String[] T00082_A96TAM03_UPD_PROG_NM ;
   private boolean[] T00082_n96TAM03_UPD_PROG_NM ;
   private String[] T000811_A17TAM04_AUTH_CD ;
   private String[] T000811_A88TAM03_APP_ID ;
   private String[] T000812_A1TAM01_SYS_ID ;
   private String[] T000812_A11TAM02_MENU_ID_TREE_1 ;
   private String[] T000812_A12TAM02_MENU_ID_TREE_2 ;
   private String[] T000812_A13TAM02_MENU_ID_TREE_3 ;
   private String[] T000813_A88TAM03_APP_ID ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class tam03_appli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00082", "SELECT `TAM03_APP_ID`, `TAM03_CRT_DATETIME`, `TAM03_CRT_USER_ID`, `TAM03_UPD_DATETIME`, `TAM03_UPD_USER_ID`, `TAM03_UPD_CNT`, `TAM03_APP_NM`, `TAM03_SUB_MENU_FLG`, `TAM03_KIDO_PG`, `TAM03_DEL_FLG`, `TAM03_CRT_PROG_NM`, `TAM03_UPD_PROG_NM` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00083", "SELECT `TAM03_APP_ID`, `TAM03_CRT_DATETIME`, `TAM03_CRT_USER_ID`, `TAM03_UPD_DATETIME`, `TAM03_UPD_USER_ID`, `TAM03_UPD_CNT`, `TAM03_APP_NM`, `TAM03_SUB_MENU_FLG`, `TAM03_KIDO_PG`, `TAM03_DEL_FLG`, `TAM03_CRT_PROG_NM`, `TAM03_UPD_PROG_NM` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00084", "SELECT TM1.`TAM03_APP_ID`, TM1.`TAM03_CRT_DATETIME`, TM1.`TAM03_CRT_USER_ID`, TM1.`TAM03_UPD_DATETIME`, TM1.`TAM03_UPD_USER_ID`, TM1.`TAM03_UPD_CNT`, TM1.`TAM03_APP_NM`, TM1.`TAM03_SUB_MENU_FLG`, TM1.`TAM03_KIDO_PG`, TM1.`TAM03_DEL_FLG`, TM1.`TAM03_CRT_PROG_NM`, TM1.`TAM03_UPD_PROG_NM` FROM `TAM03_APPLI` TM1 WHERE TM1.`TAM03_APP_ID` = ? ORDER BY TM1.`TAM03_APP_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T00085", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00086", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE ( `TAM03_APP_ID` > ?) ORDER BY `TAM03_APP_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00087", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE ( `TAM03_APP_ID` < ?) ORDER BY `TAM03_APP_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00088", "INSERT INTO `TAM03_APPLI` (`TAM03_APP_ID`, `TAM03_CRT_DATETIME`, `TAM03_CRT_USER_ID`, `TAM03_UPD_DATETIME`, `TAM03_UPD_USER_ID`, `TAM03_UPD_CNT`, `TAM03_APP_NM`, `TAM03_SUB_MENU_FLG`, `TAM03_KIDO_PG`, `TAM03_DEL_FLG`, `TAM03_CRT_PROG_NM`, `TAM03_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00089", "UPDATE `TAM03_APPLI` SET `TAM03_CRT_DATETIME`=?, `TAM03_CRT_USER_ID`=?, `TAM03_UPD_DATETIME`=?, `TAM03_UPD_USER_ID`=?, `TAM03_UPD_CNT`=?, `TAM03_APP_NM`=?, `TAM03_SUB_MENU_FLG`=?, `TAM03_KIDO_PG`=?, `TAM03_DEL_FLG`=?, `TAM03_CRT_PROG_NM`=?, `TAM03_UPD_PROG_NM`=?  WHERE `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000810", "DELETE FROM `TAM03_APPLI`  WHERE `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000811", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM03_APP_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000812", "SELECT `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3` FROM `TAM02_MENU` WHERE `TAM02_APP_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000813", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` ORDER BY `TAM03_APP_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 128);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[10]).longValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 40);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 40);
               }
               break;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 128);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setVarchar(12, (String)parms[22], 7, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 7);
               break;
      }
   }

}

