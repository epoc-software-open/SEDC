/*
               File: tam03_appli_impl
        Description: アプリケーションマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:37.73
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12TAM03_APP_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
         A314TAM03_APP_NM = httpContext.GetNextPar( ) ;
         n314TAM03_APP_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
         A315TAM03_SUB_MENU_FLG = httpContext.GetNextPar( ) ;
         n315TAM03_SUB_MENU_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
         A276TAM03_KIDO_PG = httpContext.GetNextPar( ) ;
         n276TAM03_KIDO_PG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
         A277TAM03_DEL_FLG = httpContext.GetNextPar( ) ;
         n277TAM03_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
         A278TAM03_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n278TAM03_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A279TAM03_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n279TAM03_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
         A280TAM03_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n280TAM03_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
         A281TAM03_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n281TAM03_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A282TAM03_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n282TAM03_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
         A283TAM03_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n283TAM03_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
         A284TAM03_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n284TAM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_088( AV14Pgmname, Gx_mode, A12TAM03_APP_ID, A314TAM03_APP_NM, A315TAM03_SUB_MENU_FLG, A276TAM03_KIDO_PG, A277TAM03_DEL_FLG, A278TAM03_CRT_DATETIME, A279TAM03_CRT_USER_ID, A280TAM03_CRT_PROG_NM, A281TAM03_UPD_DATETIME, A282TAM03_UPD_USER_ID, A283TAM03_UPD_PROG_NM, A284TAM03_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12TAM03_APP_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
         A314TAM03_APP_NM = httpContext.GetNextPar( ) ;
         n314TAM03_APP_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
         A315TAM03_SUB_MENU_FLG = httpContext.GetNextPar( ) ;
         n315TAM03_SUB_MENU_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
         A276TAM03_KIDO_PG = httpContext.GetNextPar( ) ;
         n276TAM03_KIDO_PG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
         A277TAM03_DEL_FLG = httpContext.GetNextPar( ) ;
         n277TAM03_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
         A278TAM03_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n278TAM03_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A279TAM03_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n279TAM03_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
         A280TAM03_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n280TAM03_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
         A281TAM03_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n281TAM03_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A282TAM03_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n282TAM03_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
         A283TAM03_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n283TAM03_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
         A284TAM03_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n284TAM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_27_088( AV14Pgmname, Gx_mode, A12TAM03_APP_ID, A314TAM03_APP_NM, A315TAM03_SUB_MENU_FLG, A276TAM03_KIDO_PG, A277TAM03_DEL_FLG, A278TAM03_CRT_DATETIME, A279TAM03_CRT_USER_ID, A280TAM03_CRT_PROG_NM, A281TAM03_UPD_DATETIME, A282TAM03_UPD_USER_ID, A283TAM03_UPD_PROG_NM, A284TAM03_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action28") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12TAM03_APP_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
         A314TAM03_APP_NM = httpContext.GetNextPar( ) ;
         n314TAM03_APP_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
         A315TAM03_SUB_MENU_FLG = httpContext.GetNextPar( ) ;
         n315TAM03_SUB_MENU_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
         A276TAM03_KIDO_PG = httpContext.GetNextPar( ) ;
         n276TAM03_KIDO_PG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
         A277TAM03_DEL_FLG = httpContext.GetNextPar( ) ;
         n277TAM03_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
         A278TAM03_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n278TAM03_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A279TAM03_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n279TAM03_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
         A280TAM03_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n280TAM03_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
         A281TAM03_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n281TAM03_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A282TAM03_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n282TAM03_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
         A283TAM03_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n283TAM03_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
         A284TAM03_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n284TAM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_28_088( AV14Pgmname, Gx_mode, A12TAM03_APP_ID, A314TAM03_APP_NM, A315TAM03_SUB_MENU_FLG, A276TAM03_KIDO_PG, A277TAM03_DEL_FLG, A278TAM03_CRT_DATETIME, A279TAM03_CRT_USER_ID, A280TAM03_CRT_PROG_NM, A281TAM03_UPD_DATETIME, A282TAM03_UPD_USER_ID, A283TAM03_UPD_PROG_NM, A284TAM03_UPD_CNT) ;
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
      GXKey = context.getSiteKey( ) ;
      radTAM03_SUB_MENU_FLG.setName( "TAM03_SUB_MENU_FLG" );
      radTAM03_SUB_MENU_FLG.setWebtags( "" );
      radTAM03_SUB_MENU_FLG.addItem("0", "アプリケーション", (short)(0));
      radTAM03_SUB_MENU_FLG.addItem("1", "サブメニュー", (short)(0));
      radTAM03_DEL_FLG.setName( "TAM03_DEL_FLG" );
      radTAM03_DEL_FLG.setWebtags( "" );
      radTAM03_DEL_FLG.addItem("0", "利用可能", (short)(0));
      radTAM03_DEL_FLG.addItem("1", "利用不可", (short)(0));
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "アプリケーションマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM03_APP_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
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
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         validateSpaRequest();
         userMain( ) ;
         if ( ! isFullAjaxMode( ) )
         {
            draw( ) ;
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
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "アプリケーションマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TAM03_APPLI.htm");
         wb_table3_28_088( true) ;
      }
      return  ;
   }

   public void wb_table3_28_088e( boolean wbgen )
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

   public void wb_table3_28_088( boolean wbgen )
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
         wb_table4_34_088( true) ;
      }
      return  ;
   }

   public void wb_table4_34_088e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_109_088( true) ;
      }
      return  ;
   }

   public void wb_table5_109_088e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_088e( true) ;
      }
      else
      {
         wb_table3_28_088e( false) ;
      }
   }

   public void wb_table5_109_088( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", "", "TextBlockBtn060", 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_109_088e( true) ;
      }
      else
      {
         wb_table5_109_088e( false) ;
      }
   }

   public void wb_table4_34_088( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:130px\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage19_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage19_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_app_id_Internalname, "アプリケーションID", "", "", lblTextblocktam03_app_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_APP_ID_Internalname, GXutil.rtrim( A12TAM03_APP_ID), GXutil.rtrim( localUtil.format( A12TAM03_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_APP_ID_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAM03_APP_ID_Enabled, 1, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_44_088( true) ;
      }
      return  ;
   }

   public void wb_table6_44_088e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage20_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_app_nm_Internalname, "アプリケーション名", "", "", lblTextblocktam03_app_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_APP_NM_Internalname, GXutil.rtrim( A314TAM03_APP_NM), GXutil.rtrim( localUtil.format( A314TAM03_APP_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_APP_NM_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAM03_APP_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_sub_menu_flg_Internalname, "サブメニューフラグ", "", "", lblTextblocktam03_sub_menu_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAM03_SUB_MENU_FLG, radTAM03_SUB_MENU_FLG.getInternalname(), GXutil.rtrim( A315TAM03_SUB_MENU_FLG), "", 1, radTAM03_SUB_MENU_FLG.getEnabled(), 0, 0, StyleString, ClassString, "", 0, radTAM03_SUB_MENU_FLG.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(60);\"", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_kido_pg_Internalname, "起動プログラム", "", "", lblTextblocktam03_kido_pg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_KIDO_PG_Internalname, GXutil.rtrim( A276TAM03_KIDO_PG), GXutil.rtrim( localUtil.format( A276TAM03_KIDO_PG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_KIDO_PG_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAM03_KIDO_PG_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam01_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAM03_DEL_FLG, radTAM03_DEL_FLG.getInternalname(), GXutil.rtrim( A277TAM03_DEL_FLG), "", 1, radTAM03_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, "", 0, radTAM03_DEL_FLG.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(70);\"", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam03_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAM03_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_CRT_DATETIME_Internalname, localUtil.format(A278TAM03_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A278TAM03_CRT_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_CRT_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM03_CRT_DATETIME_Visible, edtTAM03_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM03_APPLI.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM03_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAM03_CRT_DATETIME_Visible==0)||(edtTAM03_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam03_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_CRT_USER_ID_Internalname, GXutil.rtrim( A279TAM03_CRT_USER_ID), GXutil.rtrim( localUtil.format( A279TAM03_CRT_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_CRT_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAM03_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam03_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_CRT_PROG_NM_Internalname, GXutil.rtrim( A280TAM03_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A280TAM03_CRT_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_CRT_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM03_CRT_PROG_NM_Visible, edtTAM03_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam03_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAM03_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_UPD_DATETIME_Internalname, localUtil.format(A281TAM03_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A281TAM03_UPD_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_UPD_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM03_UPD_DATETIME_Visible, edtTAM03_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM03_APPLI.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM03_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAM03_UPD_DATETIME_Visible==0)||(edtTAM03_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam03_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_UPD_USER_ID_Internalname, GXutil.rtrim( A282TAM03_UPD_USER_ID), GXutil.rtrim( localUtil.format( A282TAM03_UPD_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_UPD_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAM03_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam03_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_UPD_PROG_NM_Internalname, GXutil.rtrim( A283TAM03_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A283TAM03_UPD_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_UPD_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM03_UPD_PROG_NM_Visible, edtTAM03_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_088e( true) ;
      }
      else
      {
         wb_table4_34_088e( false) ;
      }
   }

   public void wb_table6_44_088( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "※", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(0), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "サブメニュー用のアプリケーションIDには、<br>配下の機能のアプリケーションIDの頭2桁を設定して下さい。", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockItemTitle", 0, "", 1, 1, (short)(1), "HLP_TAM03_APPLI.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_44_088e( true) ;
      }
      else
      {
         wb_table6_44_088e( false) ;
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
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "ToolbarMain", "");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SELECT\\'."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM03_APPLI.htm");
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

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
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
            A12TAM03_APP_ID = httpContext.cgiGet( edtTAM03_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
            A314TAM03_APP_NM = httpContext.cgiGet( edtTAM03_APP_NM_Internalname) ;
            n314TAM03_APP_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
            n314TAM03_APP_NM = ((GXutil.strcmp("", A314TAM03_APP_NM)==0) ? true : false) ;
            A315TAM03_SUB_MENU_FLG = httpContext.cgiGet( radTAM03_SUB_MENU_FLG.getInternalname()) ;
            n315TAM03_SUB_MENU_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
            n315TAM03_SUB_MENU_FLG = ((GXutil.strcmp("", A315TAM03_SUB_MENU_FLG)==0) ? true : false) ;
            A276TAM03_KIDO_PG = httpContext.cgiGet( edtTAM03_KIDO_PG_Internalname) ;
            n276TAM03_KIDO_PG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
            n276TAM03_KIDO_PG = ((GXutil.strcmp("", A276TAM03_KIDO_PG)==0) ? true : false) ;
            A277TAM03_DEL_FLG = httpContext.cgiGet( radTAM03_DEL_FLG.getInternalname()) ;
            n277TAM03_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
            n277TAM03_DEL_FLG = ((GXutil.strcmp("", A277TAM03_DEL_FLG)==0) ? true : false) ;
            A278TAM03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM03_CRT_DATETIME_Internalname)) ;
            n278TAM03_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A279TAM03_CRT_USER_ID = httpContext.cgiGet( edtTAM03_CRT_USER_ID_Internalname) ;
            n279TAM03_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
            A280TAM03_CRT_PROG_NM = httpContext.cgiGet( edtTAM03_CRT_PROG_NM_Internalname) ;
            n280TAM03_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
            A281TAM03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM03_UPD_DATETIME_Internalname)) ;
            n281TAM03_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A282TAM03_UPD_USER_ID = httpContext.cgiGet( edtTAM03_UPD_USER_ID_Internalname) ;
            n282TAM03_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
            A283TAM03_UPD_PROG_NM = httpContext.cgiGet( edtTAM03_UPD_PROG_NM_Internalname) ;
            n283TAM03_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
            /* Read saved values. */
            Z12TAM03_APP_ID = httpContext.cgiGet( "Z12TAM03_APP_ID") ;
            Z278TAM03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z278TAM03_CRT_DATETIME"), 0) ;
            n278TAM03_CRT_DATETIME = (GXutil.nullDate().equals(A278TAM03_CRT_DATETIME) ? true : false) ;
            Z279TAM03_CRT_USER_ID = httpContext.cgiGet( "Z279TAM03_CRT_USER_ID") ;
            n279TAM03_CRT_USER_ID = ((GXutil.strcmp("", A279TAM03_CRT_USER_ID)==0) ? true : false) ;
            Z281TAM03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z281TAM03_UPD_DATETIME"), 0) ;
            n281TAM03_UPD_DATETIME = (GXutil.nullDate().equals(A281TAM03_UPD_DATETIME) ? true : false) ;
            Z282TAM03_UPD_USER_ID = httpContext.cgiGet( "Z282TAM03_UPD_USER_ID") ;
            n282TAM03_UPD_USER_ID = ((GXutil.strcmp("", A282TAM03_UPD_USER_ID)==0) ? true : false) ;
            Z284TAM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z284TAM03_UPD_CNT"), ".", ",") ;
            n284TAM03_UPD_CNT = ((0==A284TAM03_UPD_CNT) ? true : false) ;
            Z314TAM03_APP_NM = httpContext.cgiGet( "Z314TAM03_APP_NM") ;
            n314TAM03_APP_NM = ((GXutil.strcmp("", A314TAM03_APP_NM)==0) ? true : false) ;
            Z315TAM03_SUB_MENU_FLG = httpContext.cgiGet( "Z315TAM03_SUB_MENU_FLG") ;
            n315TAM03_SUB_MENU_FLG = ((GXutil.strcmp("", A315TAM03_SUB_MENU_FLG)==0) ? true : false) ;
            Z276TAM03_KIDO_PG = httpContext.cgiGet( "Z276TAM03_KIDO_PG") ;
            n276TAM03_KIDO_PG = ((GXutil.strcmp("", A276TAM03_KIDO_PG)==0) ? true : false) ;
            Z277TAM03_DEL_FLG = httpContext.cgiGet( "Z277TAM03_DEL_FLG") ;
            n277TAM03_DEL_FLG = ((GXutil.strcmp("", A277TAM03_DEL_FLG)==0) ? true : false) ;
            Z280TAM03_CRT_PROG_NM = httpContext.cgiGet( "Z280TAM03_CRT_PROG_NM") ;
            n280TAM03_CRT_PROG_NM = ((GXutil.strcmp("", A280TAM03_CRT_PROG_NM)==0) ? true : false) ;
            Z283TAM03_UPD_PROG_NM = httpContext.cgiGet( "Z283TAM03_UPD_PROG_NM") ;
            n283TAM03_UPD_PROG_NM = ((GXutil.strcmp("", A283TAM03_UPD_PROG_NM)==0) ? true : false) ;
            A284TAM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z284TAM03_UPD_CNT"), ".", ",") ;
            n284TAM03_UPD_CNT = false ;
            n284TAM03_UPD_CNT = ((0==A284TAM03_UPD_CNT) ? true : false) ;
            O284TAM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O284TAM03_UPD_CNT"), ".", ",") ;
            n284TAM03_UPD_CNT = ((0==A284TAM03_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A284TAM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "TAM03_UPD_CNT"), ".", ",") ;
            n284TAM03_UPD_CNT = ((0==A284TAM03_UPD_CNT) ? true : false) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ".", ",")) ;
            AV14Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = context.getSiteKey( ) ;
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A12TAM03_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
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
                  else if ( GXutil.strcmp(sEvt, "'BTN_SELECT'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12082 */
                     e12082 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e13082 */
                     e13082 ();
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
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
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
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
      GXt_char1 = AV12W_MSG ;
      GXv_char2[0] = GXt_char1 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
      tam03_appli_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12W_MSG = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_MSG", AV12W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV12W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e12082( )
   {
      /* 'BTN_SELECT' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "tam03_sel"+GXutil.URLEncode(GXutil.rtrim(A12TAM03_APP_ID)) ;
      httpContext.popup(formatLink("tam03_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"A12TAM03_APP_ID"});
   }

   public void e13082( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tam03_appli")  ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV8W_A_LOGIN_SDT;
      GXv_char2[0] = AV9W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV8W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      tam03_appli_impl.this.AV9W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9W_ERRCD", AV9W_ERRCD);
      if ( GXutil.strcmp(AV9W_ERRCD, "0") != 0 )
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
      /* 'SUB_AP_CHECK' Routine */
      GXv_char2[0] = AV10W_KNGN_FLG ;
      GXv_char4[0] = AV9W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV7C_TAM02_APP_ID, GXv_char2, GXv_char4) ;
      tam03_appli_impl.this.AV10W_KNGN_FLG = GXv_char2[0] ;
      tam03_appli_impl.this.AV9W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7C_TAM02_APP_ID", AV7C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_KNGN_FLG", AV10W_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV9W_ERRCD", AV9W_ERRCD);
      if ( GXutil.strcmp(AV9W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("2")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S132( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV14Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm088( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z278TAM03_CRT_DATETIME = T00083_A278TAM03_CRT_DATETIME[0] ;
            Z279TAM03_CRT_USER_ID = T00083_A279TAM03_CRT_USER_ID[0] ;
            Z281TAM03_UPD_DATETIME = T00083_A281TAM03_UPD_DATETIME[0] ;
            Z282TAM03_UPD_USER_ID = T00083_A282TAM03_UPD_USER_ID[0] ;
            Z284TAM03_UPD_CNT = T00083_A284TAM03_UPD_CNT[0] ;
            Z314TAM03_APP_NM = T00083_A314TAM03_APP_NM[0] ;
            Z315TAM03_SUB_MENU_FLG = T00083_A315TAM03_SUB_MENU_FLG[0] ;
            Z276TAM03_KIDO_PG = T00083_A276TAM03_KIDO_PG[0] ;
            Z277TAM03_DEL_FLG = T00083_A277TAM03_DEL_FLG[0] ;
            Z280TAM03_CRT_PROG_NM = T00083_A280TAM03_CRT_PROG_NM[0] ;
            Z283TAM03_UPD_PROG_NM = T00083_A283TAM03_UPD_PROG_NM[0] ;
         }
         else
         {
            Z278TAM03_CRT_DATETIME = A278TAM03_CRT_DATETIME ;
            Z279TAM03_CRT_USER_ID = A279TAM03_CRT_USER_ID ;
            Z281TAM03_UPD_DATETIME = A281TAM03_UPD_DATETIME ;
            Z282TAM03_UPD_USER_ID = A282TAM03_UPD_USER_ID ;
            Z284TAM03_UPD_CNT = A284TAM03_UPD_CNT ;
            Z314TAM03_APP_NM = A314TAM03_APP_NM ;
            Z315TAM03_SUB_MENU_FLG = A315TAM03_SUB_MENU_FLG ;
            Z276TAM03_KIDO_PG = A276TAM03_KIDO_PG ;
            Z277TAM03_DEL_FLG = A277TAM03_DEL_FLG ;
            Z280TAM03_CRT_PROG_NM = A280TAM03_CRT_PROG_NM ;
            Z283TAM03_UPD_PROG_NM = A283TAM03_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
         Z278TAM03_CRT_DATETIME = A278TAM03_CRT_DATETIME ;
         Z279TAM03_CRT_USER_ID = A279TAM03_CRT_USER_ID ;
         Z281TAM03_UPD_DATETIME = A281TAM03_UPD_DATETIME ;
         Z282TAM03_UPD_USER_ID = A282TAM03_UPD_USER_ID ;
         Z284TAM03_UPD_CNT = A284TAM03_UPD_CNT ;
         Z314TAM03_APP_NM = A314TAM03_APP_NM ;
         Z315TAM03_SUB_MENU_FLG = A315TAM03_SUB_MENU_FLG ;
         Z276TAM03_KIDO_PG = A276TAM03_KIDO_PG ;
         Z277TAM03_DEL_FLG = A277TAM03_DEL_FLG ;
         Z280TAM03_CRT_PROG_NM = A280TAM03_CRT_PROG_NM ;
         Z283TAM03_UPD_PROG_NM = A283TAM03_UPD_PROG_NM ;
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A315TAM03_SUB_MENU_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A315TAM03_SUB_MENU_FLG = "0" ;
         n315TAM03_SUB_MENU_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A277TAM03_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A277TAM03_DEL_FLG = "0" ;
         n277TAM03_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A280TAM03_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A280TAM03_CRT_PROG_NM = AV14Pgmname ;
         n280TAM03_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A283TAM03_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A283TAM03_UPD_PROG_NM = AV14Pgmname ;
         n283TAM03_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
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
      pr_default.execute(2, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A278TAM03_CRT_DATETIME = T00084_A278TAM03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n278TAM03_CRT_DATETIME = T00084_n278TAM03_CRT_DATETIME[0] ;
         A279TAM03_CRT_USER_ID = T00084_A279TAM03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
         n279TAM03_CRT_USER_ID = T00084_n279TAM03_CRT_USER_ID[0] ;
         A281TAM03_UPD_DATETIME = T00084_A281TAM03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n281TAM03_UPD_DATETIME = T00084_n281TAM03_UPD_DATETIME[0] ;
         A282TAM03_UPD_USER_ID = T00084_A282TAM03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
         n282TAM03_UPD_USER_ID = T00084_n282TAM03_UPD_USER_ID[0] ;
         A284TAM03_UPD_CNT = T00084_A284TAM03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
         n284TAM03_UPD_CNT = T00084_n284TAM03_UPD_CNT[0] ;
         A314TAM03_APP_NM = T00084_A314TAM03_APP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
         n314TAM03_APP_NM = T00084_n314TAM03_APP_NM[0] ;
         A315TAM03_SUB_MENU_FLG = T00084_A315TAM03_SUB_MENU_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
         n315TAM03_SUB_MENU_FLG = T00084_n315TAM03_SUB_MENU_FLG[0] ;
         A276TAM03_KIDO_PG = T00084_A276TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
         n276TAM03_KIDO_PG = T00084_n276TAM03_KIDO_PG[0] ;
         A277TAM03_DEL_FLG = T00084_A277TAM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
         n277TAM03_DEL_FLG = T00084_n277TAM03_DEL_FLG[0] ;
         A280TAM03_CRT_PROG_NM = T00084_A280TAM03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
         n280TAM03_CRT_PROG_NM = T00084_n280TAM03_CRT_PROG_NM[0] ;
         A283TAM03_UPD_PROG_NM = T00084_A283TAM03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
         n283TAM03_UPD_PROG_NM = T00084_n283TAM03_UPD_PROG_NM[0] ;
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
      pr_default.execute(3, new Object[] {A12TAM03_APP_ID});
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
      pr_default.execute(1, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm088( 29) ;
         RcdFound8 = (short)(1) ;
         A12TAM03_APP_ID = T00083_A12TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
         A278TAM03_CRT_DATETIME = T00083_A278TAM03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n278TAM03_CRT_DATETIME = T00083_n278TAM03_CRT_DATETIME[0] ;
         A279TAM03_CRT_USER_ID = T00083_A279TAM03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
         n279TAM03_CRT_USER_ID = T00083_n279TAM03_CRT_USER_ID[0] ;
         A281TAM03_UPD_DATETIME = T00083_A281TAM03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n281TAM03_UPD_DATETIME = T00083_n281TAM03_UPD_DATETIME[0] ;
         A282TAM03_UPD_USER_ID = T00083_A282TAM03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
         n282TAM03_UPD_USER_ID = T00083_n282TAM03_UPD_USER_ID[0] ;
         A284TAM03_UPD_CNT = T00083_A284TAM03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
         n284TAM03_UPD_CNT = T00083_n284TAM03_UPD_CNT[0] ;
         A314TAM03_APP_NM = T00083_A314TAM03_APP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
         n314TAM03_APP_NM = T00083_n314TAM03_APP_NM[0] ;
         A315TAM03_SUB_MENU_FLG = T00083_A315TAM03_SUB_MENU_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
         n315TAM03_SUB_MENU_FLG = T00083_n315TAM03_SUB_MENU_FLG[0] ;
         A276TAM03_KIDO_PG = T00083_A276TAM03_KIDO_PG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
         n276TAM03_KIDO_PG = T00083_n276TAM03_KIDO_PG[0] ;
         A277TAM03_DEL_FLG = T00083_A277TAM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
         n277TAM03_DEL_FLG = T00083_n277TAM03_DEL_FLG[0] ;
         A280TAM03_CRT_PROG_NM = T00083_A280TAM03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
         n280TAM03_CRT_PROG_NM = T00083_n280TAM03_CRT_PROG_NM[0] ;
         A283TAM03_UPD_PROG_NM = T00083_A283TAM03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
         n283TAM03_UPD_PROG_NM = T00083_n283TAM03_UPD_PROG_NM[0] ;
         O284TAM03_UPD_CNT = A284TAM03_UPD_CNT ;
         n284TAM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load088( ) ;
         if ( AnyError == 1 )
         {
            RcdFound8 = (short)(0) ;
            initializeNonKey088( ) ;
         }
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
      pr_default.execute(4, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00086_A12TAM03_APP_ID[0], A12TAM03_APP_ID) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00086_A12TAM03_APP_ID[0], A12TAM03_APP_ID) > 0 ) ) )
         {
            A12TAM03_APP_ID = T00086_A12TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T00087 */
      pr_default.execute(5, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00087_A12TAM03_APP_ID[0], A12TAM03_APP_ID) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00087_A12TAM03_APP_ID[0], A12TAM03_APP_ID) < 0 ) ) )
         {
            A12TAM03_APP_ID = T00087_A12TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey088( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
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
         if ( RcdFound8 == 1 )
         {
            if ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 )
            {
               A12TAM03_APP_ID = Z12TAM03_APP_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
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
            if ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 )
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
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 )
      {
         A12TAM03_APP_ID = Z12TAM03_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
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
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
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
         else if ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 )
         {
            A12TAM03_APP_ID = Z12TAM03_APP_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
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
         if ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 )
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart088( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_previous( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_next( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart088( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
         pr_default.execute(0, new Object[] {A12TAM03_APP_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM03_APPLI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z278TAM03_CRT_DATETIME.equals( T00082_A278TAM03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z279TAM03_CRT_USER_ID, T00082_A279TAM03_CRT_USER_ID[0]) != 0 ) || !( Z281TAM03_UPD_DATETIME.equals( T00082_A281TAM03_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z282TAM03_UPD_USER_ID, T00082_A282TAM03_UPD_USER_ID[0]) != 0 ) || ( Z284TAM03_UPD_CNT != T00082_A284TAM03_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z314TAM03_APP_NM, T00082_A314TAM03_APP_NM[0]) != 0 ) || ( GXutil.strcmp(Z315TAM03_SUB_MENU_FLG, T00082_A315TAM03_SUB_MENU_FLG[0]) != 0 ) || ( GXutil.strcmp(Z276TAM03_KIDO_PG, T00082_A276TAM03_KIDO_PG[0]) != 0 ) || ( GXutil.strcmp(Z277TAM03_DEL_FLG, T00082_A277TAM03_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z280TAM03_CRT_PROG_NM, T00082_A280TAM03_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z283TAM03_UPD_PROG_NM, T00082_A283TAM03_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(6, new Object[] {A12TAM03_APP_ID, new Boolean(n278TAM03_CRT_DATETIME), A278TAM03_CRT_DATETIME, new Boolean(n279TAM03_CRT_USER_ID), A279TAM03_CRT_USER_ID, new Boolean(n281TAM03_UPD_DATETIME), A281TAM03_UPD_DATETIME, new Boolean(n282TAM03_UPD_USER_ID), A282TAM03_UPD_USER_ID, new Boolean(n284TAM03_UPD_CNT), new Long(A284TAM03_UPD_CNT), new Boolean(n314TAM03_APP_NM), A314TAM03_APP_NM, new Boolean(n315TAM03_SUB_MENU_FLG), A315TAM03_SUB_MENU_FLG, new Boolean(n276TAM03_KIDO_PG), A276TAM03_KIDO_PG, new Boolean(n277TAM03_DEL_FLG), A277TAM03_DEL_FLG, new Boolean(n280TAM03_CRT_PROG_NM), A280TAM03_CRT_PROG_NM, new Boolean(n283TAM03_UPD_PROG_NM), A283TAM03_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM03_APPLI") ;
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A12TAM03_APP_ID, A314TAM03_APP_NM, A315TAM03_SUB_MENU_FLG, A276TAM03_KIDO_PG, A277TAM03_DEL_FLG, A278TAM03_CRT_DATETIME, A279TAM03_CRT_USER_ID, A280TAM03_CRT_PROG_NM, A281TAM03_UPD_DATETIME, A282TAM03_UPD_USER_ID, A283TAM03_UPD_PROG_NM, A284TAM03_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
                     httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
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
                  pr_default.execute(7, new Object[] {new Boolean(n278TAM03_CRT_DATETIME), A278TAM03_CRT_DATETIME, new Boolean(n279TAM03_CRT_USER_ID), A279TAM03_CRT_USER_ID, new Boolean(n281TAM03_UPD_DATETIME), A281TAM03_UPD_DATETIME, new Boolean(n282TAM03_UPD_USER_ID), A282TAM03_UPD_USER_ID, new Boolean(n284TAM03_UPD_CNT), new Long(A284TAM03_UPD_CNT), new Boolean(n314TAM03_APP_NM), A314TAM03_APP_NM, new Boolean(n315TAM03_SUB_MENU_FLG), A315TAM03_SUB_MENU_FLG, new Boolean(n276TAM03_KIDO_PG), A276TAM03_KIDO_PG, new Boolean(n277TAM03_DEL_FLG), A277TAM03_DEL_FLG, new Boolean(n280TAM03_CRT_PROG_NM), A280TAM03_CRT_PROG_NM, new Boolean(n283TAM03_UPD_PROG_NM), A283TAM03_UPD_PROG_NM, A12TAM03_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM03_APPLI") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM03_APPLI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate088( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A12TAM03_APP_ID, A314TAM03_APP_NM, A315TAM03_SUB_MENU_FLG, A276TAM03_KIDO_PG, A277TAM03_DEL_FLG, A278TAM03_CRT_DATETIME, A279TAM03_CRT_USER_ID, A280TAM03_CRT_PROG_NM, A281TAM03_UPD_DATETIME, A282TAM03_UPD_USER_ID, A283TAM03_UPD_PROG_NM, A284TAM03_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
                     httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
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
               pr_default.execute(8, new Object[] {A12TAM03_APP_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM03_APPLI") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A12TAM03_APP_ID, A314TAM03_APP_NM, A315TAM03_SUB_MENU_FLG, A276TAM03_KIDO_PG, A277TAM03_DEL_FLG, A278TAM03_CRT_DATETIME, A279TAM03_CRT_USER_ID, A280TAM03_CRT_PROG_NM, A281TAM03_UPD_DATETIME, A282TAM03_UPD_USER_ID, A283TAM03_UPD_PROG_NM, A284TAM03_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
                  httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "", true);
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
         pr_default.execute(9, new Object[] {A12TAM03_APP_ID});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"アプリケーション権限マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000812 */
         pr_default.execute(10, new Object[] {A12TAM03_APP_ID});
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
      /* Scan By routine */
      /* Using cursor T000813 */
      pr_default.execute(11);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A12TAM03_APP_ID = T000813_A12TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext088( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A12TAM03_APP_ID = T000813_A12TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
      }
   }

   public void scanEnd088( )
   {
      pr_default.close(11);
   }

   public void afterConfirm088( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A12TAM03_APP_ID)==0) )
      {
         httpContext.GX_msglist.addItem("アプリケーションIDを入力してください", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 7 < GXutil.byteCount( A12TAM03_APP_ID, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("アプリケーションIDは半角7桁以内になるようにしてください。", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A314TAM03_APP_NM)==0) )
      {
         httpContext.GX_msglist.addItem("アプリケーション名を入力してください", 1, "TAM03_APP_NM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_NM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 40 < GXutil.byteCount( A314TAM03_APP_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("アプリケーション名は全角20桁又は半角40桁以内になるようにしてください。", 1, "TAM03_APP_NM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_NM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 40 < GXutil.byteCount( A276TAM03_KIDO_PG, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("起動プログラムは半角40桁以内になるようにしてください。", 1, "TAM03_KIDO_PG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_KIDO_PG_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert088( )
   {
      /* Before Insert Rules */
      A278TAM03_CRT_DATETIME = GXutil.now( ) ;
      n278TAM03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A279TAM03_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam03_appli_impl.this.GXt_char1 = GXv_char4[0] ;
      A279TAM03_CRT_USER_ID = GXt_char1 ;
      n279TAM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
      A281TAM03_UPD_DATETIME = GXutil.now( ) ;
      n281TAM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A282TAM03_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam03_appli_impl.this.GXt_char1 = GXv_char4[0] ;
      A282TAM03_UPD_USER_ID = GXt_char1 ;
      n282TAM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
      A284TAM03_UPD_CNT = (long)(O284TAM03_UPD_CNT+1) ;
      n284TAM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate088( )
   {
      /* Before Update Rules */
      A281TAM03_UPD_DATETIME = GXutil.now( ) ;
      n281TAM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A282TAM03_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam03_appli_impl.this.GXt_char1 = GXv_char4[0] ;
      A282TAM03_UPD_USER_ID = GXt_char1 ;
      n282TAM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
      A284TAM03_UPD_CNT = (long)(O284TAM03_UPD_CNT+1) ;
      n284TAM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "アプリケーションマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513183925");
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-ja.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" ;
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam03_appli") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm088( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z12TAM03_APP_ID", GXutil.rtrim( Z12TAM03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z278TAM03_CRT_DATETIME", localUtil.ttoc( Z278TAM03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z279TAM03_CRT_USER_ID", GXutil.rtrim( Z279TAM03_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z281TAM03_UPD_DATETIME", localUtil.ttoc( Z281TAM03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z282TAM03_UPD_USER_ID", GXutil.rtrim( Z282TAM03_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z284TAM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z284TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z314TAM03_APP_NM", GXutil.rtrim( Z314TAM03_APP_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z315TAM03_SUB_MENU_FLG", GXutil.rtrim( Z315TAM03_SUB_MENU_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z276TAM03_KIDO_PG", GXutil.rtrim( Z276TAM03_KIDO_PG));
      GxWebStd.gx_hidden_field( httpContext, "Z277TAM03_DEL_FLG", GXutil.rtrim( Z277TAM03_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z280TAM03_CRT_PROG_NM", GXutil.rtrim( Z280TAM03_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z283TAM03_UPD_PROG_NM", GXutil.rtrim( Z283TAM03_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O284TAM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O284TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "TAM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A284TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public String getPgmname( )
   {
      return "TAM03_APPLI" ;
   }

   public String getPgmdesc( )
   {
      return "アプリケーションマスタ" ;
   }

   public void initializeNonKey088( )
   {
      A278TAM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n278TAM03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n278TAM03_CRT_DATETIME = (GXutil.nullDate().equals(A278TAM03_CRT_DATETIME) ? true : false) ;
      A279TAM03_CRT_USER_ID = "" ;
      n279TAM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
      n279TAM03_CRT_USER_ID = ((GXutil.strcmp("", A279TAM03_CRT_USER_ID)==0) ? true : false) ;
      A281TAM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n281TAM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n281TAM03_UPD_DATETIME = (GXutil.nullDate().equals(A281TAM03_UPD_DATETIME) ? true : false) ;
      A282TAM03_UPD_USER_ID = "" ;
      n282TAM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
      n282TAM03_UPD_USER_ID = ((GXutil.strcmp("", A282TAM03_UPD_USER_ID)==0) ? true : false) ;
      A284TAM03_UPD_CNT = 0 ;
      n284TAM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
      A314TAM03_APP_NM = "" ;
      n314TAM03_APP_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
      n314TAM03_APP_NM = ((GXutil.strcmp("", A314TAM03_APP_NM)==0) ? true : false) ;
      A276TAM03_KIDO_PG = "" ;
      n276TAM03_KIDO_PG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
      n276TAM03_KIDO_PG = ((GXutil.strcmp("", A276TAM03_KIDO_PG)==0) ? true : false) ;
      A315TAM03_SUB_MENU_FLG = "0" ;
      n315TAM03_SUB_MENU_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
      A277TAM03_DEL_FLG = "0" ;
      n277TAM03_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
      A280TAM03_CRT_PROG_NM = AV14Pgmname ;
      n280TAM03_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
      A283TAM03_UPD_PROG_NM = AV14Pgmname ;
      n283TAM03_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
      O284TAM03_UPD_CNT = A284TAM03_UPD_CNT ;
      n284TAM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
   }

   public void initAll088( )
   {
      A12TAM03_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
      initializeNonKey088( ) ;
   }

   public void standaloneModalInsert( )
   {
      A315TAM03_SUB_MENU_FLG = i315TAM03_SUB_MENU_FLG ;
      n315TAM03_SUB_MENU_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
      A277TAM03_DEL_FLG = i277TAM03_DEL_FLG ;
      n277TAM03_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
      A280TAM03_CRT_PROG_NM = i280TAM03_CRT_PROG_NM ;
      n280TAM03_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
      A283TAM03_UPD_PROG_NM = i283TAM03_UPD_PROG_NM ;
      n283TAM03_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?1830155");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513183931");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam03_appli.js", "?202071513183931");
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
      div_Internalname = "" ;
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
      GXt_char1 = A279TAM03_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam03_appli_impl.this.GXt_char1 = GXv_char4[0] ;
      A279TAM03_CRT_USER_ID = GXt_char1 ;
      n279TAM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279TAM03_CRT_USER_ID))+"\"");
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
      GXt_char1 = A282TAM03_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam03_appli_impl.this.GXt_char1 = GXv_char4[0] ;
      A282TAM03_UPD_USER_ID = GXt_char1 ;
      n282TAM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A282TAM03_UPD_USER_ID))+"\"");
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
                          String A12TAM03_APP_ID ,
                          String A314TAM03_APP_NM ,
                          String A315TAM03_SUB_MENU_FLG ,
                          String A276TAM03_KIDO_PG ,
                          String A277TAM03_DEL_FLG ,
                          java.util.Date A278TAM03_CRT_DATETIME ,
                          String A279TAM03_CRT_USER_ID ,
                          String A280TAM03_CRT_PROG_NM ,
                          java.util.Date A281TAM03_UPD_DATETIME ,
                          String A282TAM03_UPD_USER_ID ,
                          String A283TAM03_UPD_PROG_NM ,
                          long A284TAM03_UPD_CNT )
   {
      new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A12TAM03_APP_ID, A314TAM03_APP_NM, A315TAM03_SUB_MENU_FLG, A276TAM03_KIDO_PG, A277TAM03_DEL_FLG, A278TAM03_CRT_DATETIME, A279TAM03_CRT_USER_ID, A280TAM03_CRT_PROG_NM, A281TAM03_UPD_DATETIME, A282TAM03_UPD_USER_ID, A283TAM03_UPD_PROG_NM, A284TAM03_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
      httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
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
                          String A12TAM03_APP_ID ,
                          String A314TAM03_APP_NM ,
                          String A315TAM03_SUB_MENU_FLG ,
                          String A276TAM03_KIDO_PG ,
                          String A277TAM03_DEL_FLG ,
                          java.util.Date A278TAM03_CRT_DATETIME ,
                          String A279TAM03_CRT_USER_ID ,
                          String A280TAM03_CRT_PROG_NM ,
                          java.util.Date A281TAM03_UPD_DATETIME ,
                          String A282TAM03_UPD_USER_ID ,
                          String A283TAM03_UPD_PROG_NM ,
                          long A284TAM03_UPD_CNT )
   {
      new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A12TAM03_APP_ID, A314TAM03_APP_NM, A315TAM03_SUB_MENU_FLG, A276TAM03_KIDO_PG, A277TAM03_DEL_FLG, A278TAM03_CRT_DATETIME, A279TAM03_CRT_USER_ID, A280TAM03_CRT_PROG_NM, A281TAM03_UPD_DATETIME, A282TAM03_UPD_USER_ID, A283TAM03_UPD_PROG_NM, A284TAM03_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
      httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
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
                          String A12TAM03_APP_ID ,
                          String A314TAM03_APP_NM ,
                          String A315TAM03_SUB_MENU_FLG ,
                          String A276TAM03_KIDO_PG ,
                          String A277TAM03_DEL_FLG ,
                          java.util.Date A278TAM03_CRT_DATETIME ,
                          String A279TAM03_CRT_USER_ID ,
                          String A280TAM03_CRT_PROG_NM ,
                          java.util.Date A281TAM03_UPD_DATETIME ,
                          String A282TAM03_UPD_USER_ID ,
                          String A283TAM03_UPD_PROG_NM ,
                          long A284TAM03_UPD_CNT )
   {
      new tam03_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A12TAM03_APP_ID, A314TAM03_APP_NM, A315TAM03_SUB_MENU_FLG, A276TAM03_KIDO_PG, A277TAM03_DEL_FLG, A278TAM03_CRT_DATETIME, A279TAM03_CRT_USER_ID, A280TAM03_CRT_PROG_NM, A281TAM03_UPD_DATETIME, A282TAM03_UPD_USER_ID, A283TAM03_UPD_PROG_NM, A284TAM03_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A314TAM03_APP_NM", A314TAM03_APP_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A315TAM03_SUB_MENU_FLG", A315TAM03_SUB_MENU_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A276TAM03_KIDO_PG", A276TAM03_KIDO_PG);
      httpContext.ajax_rsp_assign_attri("", false, "A277TAM03_DEL_FLG", A277TAM03_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A278TAM03_CRT_DATETIME", localUtil.ttoc( A278TAM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A279TAM03_CRT_USER_ID", A279TAM03_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A280TAM03_CRT_PROG_NM", A280TAM03_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A281TAM03_UPD_DATETIME", localUtil.ttoc( A281TAM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A282TAM03_UPD_USER_ID", A282TAM03_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A283TAM03_UPD_PROG_NM", A283TAM03_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A284TAM03_UPD_CNT", GXutil.ltrim( GXutil.str( A284TAM03_UPD_CNT, 10, 0)));
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
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
      A12TAM03_APP_ID = GX_Parm1 ;
      A278TAM03_CRT_DATETIME = GX_Parm2 ;
      n278TAM03_CRT_DATETIME = false ;
      A279TAM03_CRT_USER_ID = GX_Parm3 ;
      n279TAM03_CRT_USER_ID = false ;
      A281TAM03_UPD_DATETIME = GX_Parm4 ;
      n281TAM03_UPD_DATETIME = false ;
      A282TAM03_UPD_USER_ID = GX_Parm5 ;
      n282TAM03_UPD_USER_ID = false ;
      A284TAM03_UPD_CNT = GX_Parm6 ;
      n284TAM03_UPD_CNT = false ;
      A314TAM03_APP_NM = GX_Parm7 ;
      n314TAM03_APP_NM = false ;
      A315TAM03_SUB_MENU_FLG = GX_Parm8 ;
      n315TAM03_SUB_MENU_FLG = false ;
      A276TAM03_KIDO_PG = GX_Parm9 ;
      n276TAM03_KIDO_PG = false ;
      A277TAM03_DEL_FLG = GX_Parm10 ;
      n277TAM03_DEL_FLG = false ;
      A280TAM03_CRT_PROG_NM = GX_Parm11 ;
      n280TAM03_CRT_PROG_NM = false ;
      A283TAM03_UPD_PROG_NM = GX_Parm12 ;
      n283TAM03_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A278TAM03_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A279TAM03_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A281TAM03_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A282TAM03_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A284TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A314TAM03_APP_NM));
      isValidOutput.add(GXutil.rtrim( A315TAM03_SUB_MENU_FLG));
      isValidOutput.add(GXutil.rtrim( A276TAM03_KIDO_PG));
      isValidOutput.add(GXutil.rtrim( A277TAM03_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A280TAM03_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A283TAM03_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV14Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z12TAM03_APP_ID));
      isValidOutput.add(localUtil.ttoc( Z278TAM03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z279TAM03_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z281TAM03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z282TAM03_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z284TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z314TAM03_APP_NM));
      isValidOutput.add(GXutil.rtrim( Z315TAM03_SUB_MENU_FLG));
      isValidOutput.add(GXutil.rtrim( Z276TAM03_KIDO_PG));
      isValidOutput.add(GXutil.rtrim( Z277TAM03_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z280TAM03_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z283TAM03_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV14Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O284TAM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S132 */
                  S132 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      sPrefix = "" ;
      Z12TAM03_APP_ID = "" ;
      Z278TAM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z279TAM03_CRT_USER_ID = "" ;
      Z281TAM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z282TAM03_UPD_USER_ID = "" ;
      Z314TAM03_APP_NM = "" ;
      Z315TAM03_SUB_MENU_FLG = "" ;
      Z276TAM03_KIDO_PG = "" ;
      Z277TAM03_DEL_FLG = "" ;
      Z280TAM03_CRT_PROG_NM = "" ;
      Z283TAM03_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14Pgmname = "" ;
      Gx_mode = "" ;
      A12TAM03_APP_ID = "" ;
      A314TAM03_APP_NM = "" ;
      A315TAM03_SUB_MENU_FLG = "" ;
      A276TAM03_KIDO_PG = "" ;
      A277TAM03_DEL_FLG = "" ;
      A278TAM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A279TAM03_CRT_USER_ID = "" ;
      A280TAM03_CRT_PROG_NM = "" ;
      A281TAM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A282TAM03_UPD_USER_ID = "" ;
      A283TAM03_UPD_PROG_NM = "" ;
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
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7C_TAM02_APP_ID = "" ;
      AV9W_ERRCD = "" ;
      AV12W_MSG = "" ;
      GXEncryptionTmp = "" ;
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV10W_KNGN_FLG = "" ;
      GXv_char2 = new String [1] ;
      T00084_A12TAM03_APP_ID = new String[] {""} ;
      T00084_A278TAM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00084_n278TAM03_CRT_DATETIME = new boolean[] {false} ;
      T00084_A279TAM03_CRT_USER_ID = new String[] {""} ;
      T00084_n279TAM03_CRT_USER_ID = new boolean[] {false} ;
      T00084_A281TAM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00084_n281TAM03_UPD_DATETIME = new boolean[] {false} ;
      T00084_A282TAM03_UPD_USER_ID = new String[] {""} ;
      T00084_n282TAM03_UPD_USER_ID = new boolean[] {false} ;
      T00084_A284TAM03_UPD_CNT = new long[1] ;
      T00084_n284TAM03_UPD_CNT = new boolean[] {false} ;
      T00084_A314TAM03_APP_NM = new String[] {""} ;
      T00084_n314TAM03_APP_NM = new boolean[] {false} ;
      T00084_A315TAM03_SUB_MENU_FLG = new String[] {""} ;
      T00084_n315TAM03_SUB_MENU_FLG = new boolean[] {false} ;
      T00084_A276TAM03_KIDO_PG = new String[] {""} ;
      T00084_n276TAM03_KIDO_PG = new boolean[] {false} ;
      T00084_A277TAM03_DEL_FLG = new String[] {""} ;
      T00084_n277TAM03_DEL_FLG = new boolean[] {false} ;
      T00084_A280TAM03_CRT_PROG_NM = new String[] {""} ;
      T00084_n280TAM03_CRT_PROG_NM = new boolean[] {false} ;
      T00084_A283TAM03_UPD_PROG_NM = new String[] {""} ;
      T00084_n283TAM03_UPD_PROG_NM = new boolean[] {false} ;
      T00085_A12TAM03_APP_ID = new String[] {""} ;
      T00083_A12TAM03_APP_ID = new String[] {""} ;
      T00083_A278TAM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00083_n278TAM03_CRT_DATETIME = new boolean[] {false} ;
      T00083_A279TAM03_CRT_USER_ID = new String[] {""} ;
      T00083_n279TAM03_CRT_USER_ID = new boolean[] {false} ;
      T00083_A281TAM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00083_n281TAM03_UPD_DATETIME = new boolean[] {false} ;
      T00083_A282TAM03_UPD_USER_ID = new String[] {""} ;
      T00083_n282TAM03_UPD_USER_ID = new boolean[] {false} ;
      T00083_A284TAM03_UPD_CNT = new long[1] ;
      T00083_n284TAM03_UPD_CNT = new boolean[] {false} ;
      T00083_A314TAM03_APP_NM = new String[] {""} ;
      T00083_n314TAM03_APP_NM = new boolean[] {false} ;
      T00083_A315TAM03_SUB_MENU_FLG = new String[] {""} ;
      T00083_n315TAM03_SUB_MENU_FLG = new boolean[] {false} ;
      T00083_A276TAM03_KIDO_PG = new String[] {""} ;
      T00083_n276TAM03_KIDO_PG = new boolean[] {false} ;
      T00083_A277TAM03_DEL_FLG = new String[] {""} ;
      T00083_n277TAM03_DEL_FLG = new boolean[] {false} ;
      T00083_A280TAM03_CRT_PROG_NM = new String[] {""} ;
      T00083_n280TAM03_CRT_PROG_NM = new boolean[] {false} ;
      T00083_A283TAM03_UPD_PROG_NM = new String[] {""} ;
      T00083_n283TAM03_UPD_PROG_NM = new boolean[] {false} ;
      sMode8 = "" ;
      T00086_A12TAM03_APP_ID = new String[] {""} ;
      T00087_A12TAM03_APP_ID = new String[] {""} ;
      T00082_A12TAM03_APP_ID = new String[] {""} ;
      T00082_A278TAM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00082_n278TAM03_CRT_DATETIME = new boolean[] {false} ;
      T00082_A279TAM03_CRT_USER_ID = new String[] {""} ;
      T00082_n279TAM03_CRT_USER_ID = new boolean[] {false} ;
      T00082_A281TAM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00082_n281TAM03_UPD_DATETIME = new boolean[] {false} ;
      T00082_A282TAM03_UPD_USER_ID = new String[] {""} ;
      T00082_n282TAM03_UPD_USER_ID = new boolean[] {false} ;
      T00082_A284TAM03_UPD_CNT = new long[1] ;
      T00082_n284TAM03_UPD_CNT = new boolean[] {false} ;
      T00082_A314TAM03_APP_NM = new String[] {""} ;
      T00082_n314TAM03_APP_NM = new boolean[] {false} ;
      T00082_A315TAM03_SUB_MENU_FLG = new String[] {""} ;
      T00082_n315TAM03_SUB_MENU_FLG = new boolean[] {false} ;
      T00082_A276TAM03_KIDO_PG = new String[] {""} ;
      T00082_n276TAM03_KIDO_PG = new boolean[] {false} ;
      T00082_A277TAM03_DEL_FLG = new String[] {""} ;
      T00082_n277TAM03_DEL_FLG = new boolean[] {false} ;
      T00082_A280TAM03_CRT_PROG_NM = new String[] {""} ;
      T00082_n280TAM03_CRT_PROG_NM = new boolean[] {false} ;
      T00082_A283TAM03_UPD_PROG_NM = new String[] {""} ;
      T00082_n283TAM03_UPD_PROG_NM = new boolean[] {false} ;
      T000811_A13TAM04_AUTH_CD = new String[] {""} ;
      T000811_A12TAM03_APP_ID = new String[] {""} ;
      T000812_A1TAM01_SYS_ID = new String[] {""} ;
      T000812_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T000812_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T000812_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      T000813_A12TAM03_APP_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i315TAM03_SUB_MENU_FLG = "" ;
      i277TAM03_DEL_FLG = "" ;
      i280TAM03_CRT_PROG_NM = "" ;
      i283TAM03_UPD_PROG_NM = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      ZV14Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam03_appli__default(),
         new Object[] {
             new Object[] {
            T00082_A12TAM03_APP_ID, T00082_A278TAM03_CRT_DATETIME, T00082_n278TAM03_CRT_DATETIME, T00082_A279TAM03_CRT_USER_ID, T00082_n279TAM03_CRT_USER_ID, T00082_A281TAM03_UPD_DATETIME, T00082_n281TAM03_UPD_DATETIME, T00082_A282TAM03_UPD_USER_ID, T00082_n282TAM03_UPD_USER_ID, T00082_A284TAM03_UPD_CNT,
            T00082_n284TAM03_UPD_CNT, T00082_A314TAM03_APP_NM, T00082_n314TAM03_APP_NM, T00082_A315TAM03_SUB_MENU_FLG, T00082_n315TAM03_SUB_MENU_FLG, T00082_A276TAM03_KIDO_PG, T00082_n276TAM03_KIDO_PG, T00082_A277TAM03_DEL_FLG, T00082_n277TAM03_DEL_FLG, T00082_A280TAM03_CRT_PROG_NM,
            T00082_n280TAM03_CRT_PROG_NM, T00082_A283TAM03_UPD_PROG_NM, T00082_n283TAM03_UPD_PROG_NM
            }
            , new Object[] {
            T00083_A12TAM03_APP_ID, T00083_A278TAM03_CRT_DATETIME, T00083_n278TAM03_CRT_DATETIME, T00083_A279TAM03_CRT_USER_ID, T00083_n279TAM03_CRT_USER_ID, T00083_A281TAM03_UPD_DATETIME, T00083_n281TAM03_UPD_DATETIME, T00083_A282TAM03_UPD_USER_ID, T00083_n282TAM03_UPD_USER_ID, T00083_A284TAM03_UPD_CNT,
            T00083_n284TAM03_UPD_CNT, T00083_A314TAM03_APP_NM, T00083_n314TAM03_APP_NM, T00083_A315TAM03_SUB_MENU_FLG, T00083_n315TAM03_SUB_MENU_FLG, T00083_A276TAM03_KIDO_PG, T00083_n276TAM03_KIDO_PG, T00083_A277TAM03_DEL_FLG, T00083_n277TAM03_DEL_FLG, T00083_A280TAM03_CRT_PROG_NM,
            T00083_n280TAM03_CRT_PROG_NM, T00083_A283TAM03_UPD_PROG_NM, T00083_n283TAM03_UPD_PROG_NM
            }
            , new Object[] {
            T00084_A12TAM03_APP_ID, T00084_A278TAM03_CRT_DATETIME, T00084_n278TAM03_CRT_DATETIME, T00084_A279TAM03_CRT_USER_ID, T00084_n279TAM03_CRT_USER_ID, T00084_A281TAM03_UPD_DATETIME, T00084_n281TAM03_UPD_DATETIME, T00084_A282TAM03_UPD_USER_ID, T00084_n282TAM03_UPD_USER_ID, T00084_A284TAM03_UPD_CNT,
            T00084_n284TAM03_UPD_CNT, T00084_A314TAM03_APP_NM, T00084_n314TAM03_APP_NM, T00084_A315TAM03_SUB_MENU_FLG, T00084_n315TAM03_SUB_MENU_FLG, T00084_A276TAM03_KIDO_PG, T00084_n276TAM03_KIDO_PG, T00084_A277TAM03_DEL_FLG, T00084_n277TAM03_DEL_FLG, T00084_A280TAM03_CRT_PROG_NM,
            T00084_n280TAM03_CRT_PROG_NM, T00084_A283TAM03_UPD_PROG_NM, T00084_n283TAM03_UPD_PROG_NM
            }
            , new Object[] {
            T00085_A12TAM03_APP_ID
            }
            , new Object[] {
            T00086_A12TAM03_APP_ID
            }
            , new Object[] {
            T00087_A12TAM03_APP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000811_A13TAM04_AUTH_CD, T000811_A12TAM03_APP_ID
            }
            , new Object[] {
            T000812_A1TAM01_SYS_ID, T000812_A2TAM02_MENU_ID_TREE_1, T000812_A3TAM02_MENU_ID_TREE_2, T000812_A4TAM02_MENU_ID_TREE_3
            }
            , new Object[] {
            T000813_A12TAM03_APP_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z283TAM03_UPD_PROG_NM = AV14Pgmname ;
      n283TAM03_UPD_PROG_NM = false ;
      Z280TAM03_CRT_PROG_NM = AV14Pgmname ;
      n280TAM03_CRT_PROG_NM = false ;
      AV14Pgmname = "TAM03_APPLI" ;
      Z277TAM03_DEL_FLG = "0" ;
      n277TAM03_DEL_FLG = false ;
      Z315TAM03_SUB_MENU_FLG = "0" ;
      n315TAM03_SUB_MENU_FLG = false ;
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
   private long Z284TAM03_UPD_CNT ;
   private long O284TAM03_UPD_CNT ;
   private long A284TAM03_UPD_CNT ;
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
   private String grpGroupdata_Internalname ;
   private String tblTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
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
   private String GXv_char2[] ;
   private String sMode8 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String div_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String ZV14Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z278TAM03_CRT_DATETIME ;
   private java.util.Date Z281TAM03_UPD_DATETIME ;
   private java.util.Date A278TAM03_CRT_DATETIME ;
   private java.util.Date A281TAM03_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n314TAM03_APP_NM ;
   private boolean n315TAM03_SUB_MENU_FLG ;
   private boolean n276TAM03_KIDO_PG ;
   private boolean n277TAM03_DEL_FLG ;
   private boolean n278TAM03_CRT_DATETIME ;
   private boolean n279TAM03_CRT_USER_ID ;
   private boolean n280TAM03_CRT_PROG_NM ;
   private boolean n281TAM03_UPD_DATETIME ;
   private boolean n282TAM03_UPD_USER_ID ;
   private boolean n283TAM03_UPD_PROG_NM ;
   private boolean n284TAM03_UPD_CNT ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z12TAM03_APP_ID ;
   private String Z279TAM03_CRT_USER_ID ;
   private String Z282TAM03_UPD_USER_ID ;
   private String Z314TAM03_APP_NM ;
   private String Z315TAM03_SUB_MENU_FLG ;
   private String Z276TAM03_KIDO_PG ;
   private String Z277TAM03_DEL_FLG ;
   private String Z280TAM03_CRT_PROG_NM ;
   private String Z283TAM03_UPD_PROG_NM ;
   private String A12TAM03_APP_ID ;
   private String A314TAM03_APP_NM ;
   private String A315TAM03_SUB_MENU_FLG ;
   private String A276TAM03_KIDO_PG ;
   private String A277TAM03_DEL_FLG ;
   private String A279TAM03_CRT_USER_ID ;
   private String A280TAM03_CRT_PROG_NM ;
   private String A282TAM03_UPD_USER_ID ;
   private String A283TAM03_UPD_PROG_NM ;
   private String AV7C_TAM02_APP_ID ;
   private String AV9W_ERRCD ;
   private String AV12W_MSG ;
   private String AV10W_KNGN_FLG ;
   private String i315TAM03_SUB_MENU_FLG ;
   private String i277TAM03_DEL_FLG ;
   private String i280TAM03_CRT_PROG_NM ;
   private String i283TAM03_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice radTAM03_SUB_MENU_FLG ;
   private HTMLChoice radTAM03_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private String[] T00084_A12TAM03_APP_ID ;
   private java.util.Date[] T00084_A278TAM03_CRT_DATETIME ;
   private boolean[] T00084_n278TAM03_CRT_DATETIME ;
   private String[] T00084_A279TAM03_CRT_USER_ID ;
   private boolean[] T00084_n279TAM03_CRT_USER_ID ;
   private java.util.Date[] T00084_A281TAM03_UPD_DATETIME ;
   private boolean[] T00084_n281TAM03_UPD_DATETIME ;
   private String[] T00084_A282TAM03_UPD_USER_ID ;
   private boolean[] T00084_n282TAM03_UPD_USER_ID ;
   private long[] T00084_A284TAM03_UPD_CNT ;
   private boolean[] T00084_n284TAM03_UPD_CNT ;
   private String[] T00084_A314TAM03_APP_NM ;
   private boolean[] T00084_n314TAM03_APP_NM ;
   private String[] T00084_A315TAM03_SUB_MENU_FLG ;
   private boolean[] T00084_n315TAM03_SUB_MENU_FLG ;
   private String[] T00084_A276TAM03_KIDO_PG ;
   private boolean[] T00084_n276TAM03_KIDO_PG ;
   private String[] T00084_A277TAM03_DEL_FLG ;
   private boolean[] T00084_n277TAM03_DEL_FLG ;
   private String[] T00084_A280TAM03_CRT_PROG_NM ;
   private boolean[] T00084_n280TAM03_CRT_PROG_NM ;
   private String[] T00084_A283TAM03_UPD_PROG_NM ;
   private boolean[] T00084_n283TAM03_UPD_PROG_NM ;
   private String[] T00085_A12TAM03_APP_ID ;
   private String[] T00083_A12TAM03_APP_ID ;
   private java.util.Date[] T00083_A278TAM03_CRT_DATETIME ;
   private boolean[] T00083_n278TAM03_CRT_DATETIME ;
   private String[] T00083_A279TAM03_CRT_USER_ID ;
   private boolean[] T00083_n279TAM03_CRT_USER_ID ;
   private java.util.Date[] T00083_A281TAM03_UPD_DATETIME ;
   private boolean[] T00083_n281TAM03_UPD_DATETIME ;
   private String[] T00083_A282TAM03_UPD_USER_ID ;
   private boolean[] T00083_n282TAM03_UPD_USER_ID ;
   private long[] T00083_A284TAM03_UPD_CNT ;
   private boolean[] T00083_n284TAM03_UPD_CNT ;
   private String[] T00083_A314TAM03_APP_NM ;
   private boolean[] T00083_n314TAM03_APP_NM ;
   private String[] T00083_A315TAM03_SUB_MENU_FLG ;
   private boolean[] T00083_n315TAM03_SUB_MENU_FLG ;
   private String[] T00083_A276TAM03_KIDO_PG ;
   private boolean[] T00083_n276TAM03_KIDO_PG ;
   private String[] T00083_A277TAM03_DEL_FLG ;
   private boolean[] T00083_n277TAM03_DEL_FLG ;
   private String[] T00083_A280TAM03_CRT_PROG_NM ;
   private boolean[] T00083_n280TAM03_CRT_PROG_NM ;
   private String[] T00083_A283TAM03_UPD_PROG_NM ;
   private boolean[] T00083_n283TAM03_UPD_PROG_NM ;
   private String[] T00086_A12TAM03_APP_ID ;
   private String[] T00087_A12TAM03_APP_ID ;
   private String[] T00082_A12TAM03_APP_ID ;
   private java.util.Date[] T00082_A278TAM03_CRT_DATETIME ;
   private boolean[] T00082_n278TAM03_CRT_DATETIME ;
   private String[] T00082_A279TAM03_CRT_USER_ID ;
   private boolean[] T00082_n279TAM03_CRT_USER_ID ;
   private java.util.Date[] T00082_A281TAM03_UPD_DATETIME ;
   private boolean[] T00082_n281TAM03_UPD_DATETIME ;
   private String[] T00082_A282TAM03_UPD_USER_ID ;
   private boolean[] T00082_n282TAM03_UPD_USER_ID ;
   private long[] T00082_A284TAM03_UPD_CNT ;
   private boolean[] T00082_n284TAM03_UPD_CNT ;
   private String[] T00082_A314TAM03_APP_NM ;
   private boolean[] T00082_n314TAM03_APP_NM ;
   private String[] T00082_A315TAM03_SUB_MENU_FLG ;
   private boolean[] T00082_n315TAM03_SUB_MENU_FLG ;
   private String[] T00082_A276TAM03_KIDO_PG ;
   private boolean[] T00082_n276TAM03_KIDO_PG ;
   private String[] T00082_A277TAM03_DEL_FLG ;
   private boolean[] T00082_n277TAM03_DEL_FLG ;
   private String[] T00082_A280TAM03_CRT_PROG_NM ;
   private boolean[] T00082_n280TAM03_CRT_PROG_NM ;
   private String[] T00082_A283TAM03_UPD_PROG_NM ;
   private boolean[] T00082_n283TAM03_UPD_PROG_NM ;
   private String[] T000811_A13TAM04_AUTH_CD ;
   private String[] T000811_A12TAM03_APP_ID ;
   private String[] T000812_A1TAM01_SYS_ID ;
   private String[] T000812_A2TAM02_MENU_ID_TREE_1 ;
   private String[] T000812_A3TAM02_MENU_ID_TREE_2 ;
   private String[] T000812_A4TAM02_MENU_ID_TREE_3 ;
   private String[] T000813_A12TAM03_APP_ID ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class tam03_appli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00082", "SELECT `TAM03_APP_ID`, `TAM03_CRT_DATETIME`, `TAM03_CRT_USER_ID`, `TAM03_UPD_DATETIME`, `TAM03_UPD_USER_ID`, `TAM03_UPD_CNT`, `TAM03_APP_NM`, `TAM03_SUB_MENU_FLG`, `TAM03_KIDO_PG`, `TAM03_DEL_FLG`, `TAM03_CRT_PROG_NM`, `TAM03_UPD_PROG_NM` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00083", "SELECT `TAM03_APP_ID`, `TAM03_CRT_DATETIME`, `TAM03_CRT_USER_ID`, `TAM03_UPD_DATETIME`, `TAM03_UPD_USER_ID`, `TAM03_UPD_CNT`, `TAM03_APP_NM`, `TAM03_SUB_MENU_FLG`, `TAM03_KIDO_PG`, `TAM03_DEL_FLG`, `TAM03_CRT_PROG_NM`, `TAM03_UPD_PROG_NM` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00084", "SELECT TM1.`TAM03_APP_ID`, TM1.`TAM03_CRT_DATETIME`, TM1.`TAM03_CRT_USER_ID`, TM1.`TAM03_UPD_DATETIME`, TM1.`TAM03_UPD_USER_ID`, TM1.`TAM03_UPD_CNT`, TM1.`TAM03_APP_NM`, TM1.`TAM03_SUB_MENU_FLG`, TM1.`TAM03_KIDO_PG`, TM1.`TAM03_DEL_FLG`, TM1.`TAM03_CRT_PROG_NM`, TM1.`TAM03_UPD_PROG_NM` FROM `TAM03_APPLI` TM1 WHERE TM1.`TAM03_APP_ID` = ? ORDER BY TM1.`TAM03_APP_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00085", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00086", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE ( `TAM03_APP_ID` > ?) ORDER BY `TAM03_APP_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00087", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE ( `TAM03_APP_ID` < ?) ORDER BY `TAM03_APP_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00088", "INSERT INTO `TAM03_APPLI`(`TAM03_APP_ID`, `TAM03_CRT_DATETIME`, `TAM03_CRT_USER_ID`, `TAM03_UPD_DATETIME`, `TAM03_UPD_USER_ID`, `TAM03_UPD_CNT`, `TAM03_APP_NM`, `TAM03_SUB_MENU_FLG`, `TAM03_KIDO_PG`, `TAM03_DEL_FLG`, `TAM03_CRT_PROG_NM`, `TAM03_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00089", "UPDATE `TAM03_APPLI` SET `TAM03_CRT_DATETIME`=?, `TAM03_CRT_USER_ID`=?, `TAM03_UPD_DATETIME`=?, `TAM03_UPD_USER_ID`=?, `TAM03_UPD_CNT`=?, `TAM03_APP_NM`=?, `TAM03_SUB_MENU_FLG`=?, `TAM03_KIDO_PG`=?, `TAM03_DEL_FLG`=?, `TAM03_CRT_PROG_NM`=?, `TAM03_UPD_PROG_NM`=?  WHERE `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000810", "DELETE FROM `TAM03_APPLI`  WHERE `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000811", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM03_APP_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000812", "SELECT `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3` FROM `TAM02_MENU` WHERE `TAM02_APP_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000813", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` ORDER BY `TAM03_APP_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               return;
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
               return;
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
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
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
               return;
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
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 7);
               return;
      }
   }

}

