/*
               File: tbm01_system_impl
        Description: システム規定値マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:0.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm01_system_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         AV15Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A58TBM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
         A608TBM01_SYS_VALUE = httpContext.GetNextPar( ) ;
         n608TBM01_SYS_VALUE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
         A609TBM01_NOTE = httpContext.GetNextPar( ) ;
         n609TBM01_NOTE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
         A351TBM01_DEL_FLG = httpContext.GetNextPar( ) ;
         n351TBM01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
         A352TBM01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n352TBM01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A353TBM01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n353TBM01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
         A354TBM01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n354TBM01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
         A355TBM01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n355TBM01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A356TBM01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n356TBM01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
         A357TBM01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n357TBM01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
         A358TBM01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n358TBM01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_0E13( AV15Pgmname, Gx_mode, A58TBM01_SYS_ID, A608TBM01_SYS_VALUE, A609TBM01_NOTE, A351TBM01_DEL_FLG, A352TBM01_CRT_DATETIME, A353TBM01_CRT_USER_ID, A354TBM01_CRT_PROG_NM, A355TBM01_UPD_DATETIME, A356TBM01_UPD_USER_ID, A357TBM01_UPD_PROG_NM, A358TBM01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         AV15Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A58TBM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
         A608TBM01_SYS_VALUE = httpContext.GetNextPar( ) ;
         n608TBM01_SYS_VALUE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
         A609TBM01_NOTE = httpContext.GetNextPar( ) ;
         n609TBM01_NOTE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
         A351TBM01_DEL_FLG = httpContext.GetNextPar( ) ;
         n351TBM01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
         A352TBM01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n352TBM01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A353TBM01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n353TBM01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
         A354TBM01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n354TBM01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
         A355TBM01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n355TBM01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A356TBM01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n356TBM01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
         A357TBM01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n357TBM01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
         A358TBM01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n358TBM01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_0E13( AV15Pgmname, Gx_mode, A58TBM01_SYS_ID, A608TBM01_SYS_VALUE, A609TBM01_NOTE, A351TBM01_DEL_FLG, A352TBM01_CRT_DATETIME, A353TBM01_CRT_USER_ID, A354TBM01_CRT_PROG_NM, A355TBM01_UPD_DATETIME, A356TBM01_UPD_USER_ID, A357TBM01_UPD_PROG_NM, A358TBM01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
      {
         AV15Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A58TBM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
         A608TBM01_SYS_VALUE = httpContext.GetNextPar( ) ;
         n608TBM01_SYS_VALUE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
         A609TBM01_NOTE = httpContext.GetNextPar( ) ;
         n609TBM01_NOTE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
         A351TBM01_DEL_FLG = httpContext.GetNextPar( ) ;
         n351TBM01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
         A352TBM01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n352TBM01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A353TBM01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n353TBM01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
         A354TBM01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n354TBM01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
         A355TBM01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n355TBM01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A356TBM01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n356TBM01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
         A357TBM01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n357TBM01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
         A358TBM01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n358TBM01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_27_0E13( AV15Pgmname, Gx_mode, A58TBM01_SYS_ID, A608TBM01_SYS_VALUE, A609TBM01_NOTE, A351TBM01_DEL_FLG, A352TBM01_CRT_DATETIME, A353TBM01_CRT_USER_ID, A354TBM01_CRT_PROG_NM, A355TBM01_UPD_DATETIME, A356TBM01_UPD_USER_ID, A357TBM01_UPD_PROG_NM, A358TBM01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"TBM01_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asatbm01_crt_user_id0E13( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"TBM01_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asatbm01_upd_user_id0E13( Gx_mode) ;
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
      radTBM01_DEL_FLG.setName( "TBM01_DEL_FLG" );
      radTBM01_DEL_FLG.setWebtags( "" );
      radTBM01_DEL_FLG.addItem("0", "利用可能", (short)(0));
      radTBM01_DEL_FLG.addItem("1", "利用不可", (short)(0));
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "システム規定値マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm01_system_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm01_system_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm01_system_impl.class ));
   }

   public tbm01_system_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radTBM01_DEL_FLG = new HTMLChoice();
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
         wb_table1_2_0E13( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0E13e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0E13( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0E13( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0E13( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0E13e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "システム規定値マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM01_SYSTEM.htm");
         wb_table3_28_0E13( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0E13e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0E13e( true) ;
      }
      else
      {
         wb_table1_2_0E13e( false) ;
      }
   }

   public void wb_table3_28_0E13( boolean wbgen )
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
         wb_table4_34_0E13( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0E13e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_97_0E13( true) ;
      }
      return  ;
   }

   public void wb_table5_97_0E13e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0E13e( true) ;
      }
      else
      {
         wb_table3_28_0E13e( false) ;
      }
   }

   public void wb_table5_97_0E13( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", "", "TextBlockBtn060", 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_97_0E13e( true) ;
      }
      else
      {
         wb_table5_97_0E13e( false) ;
      }
   }

   public void wb_table4_34_0E13( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:110px\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage19_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage19_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_sys_id_Internalname, "規定値キーワード", "", "", lblTextblocktbm01_sys_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM01_SYS_ID_Internalname, GXutil.rtrim( A58TBM01_SYS_ID), GXutil.rtrim( localUtil.format( A58TBM01_SYS_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM01_SYS_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM01_SYS_ID_Enabled, 1, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage20_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_sys_value_Internalname, "規定値", "", "", lblTextblocktbm01_sys_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM01_SYS_VALUE_Internalname, GXutil.rtrim( A608TBM01_SYS_VALUE), GXutil.rtrim( localUtil.format( A608TBM01_SYS_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM01_SYS_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM01_SYS_VALUE_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_note_Internalname, "備考", "", "", lblTextblocktbm01_note_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM01_NOTE_Internalname, GXutil.rtrim( A609TBM01_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(51);\"", (short)(0), 1, edtTBM01_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm01_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTBM01_DEL_FLG, radTBM01_DEL_FLG.getInternalname(), GXutil.rtrim( A351TBM01_DEL_FLG), "", 1, radTBM01_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, "", 0, radTBM01_DEL_FLG.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(56);\"", "HLP_TBM01_SYSTEM.htm");
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm01_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTBM01_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM01_CRT_DATETIME_Internalname, localUtil.format(A352TBM01_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A352TBM01_CRT_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM01_CRT_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTBM01_CRT_DATETIME_Visible, edtTBM01_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM01_SYSTEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM01_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTBM01_CRT_DATETIME_Visible==0)||(edtTBM01_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm01_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBM01_CRT_USER_ID_Internalname, GXutil.rtrim( A353TBM01_CRT_USER_ID), GXutil.rtrim( localUtil.format( A353TBM01_CRT_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM01_CRT_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTBM01_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm01_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBM01_CRT_PROG_NM_Internalname, GXutil.rtrim( A354TBM01_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A354TBM01_CRT_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM01_CRT_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTBM01_CRT_PROG_NM_Visible, edtTBM01_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm01_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTBM01_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM01_UPD_DATETIME_Internalname, localUtil.format(A355TBM01_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A355TBM01_UPD_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM01_UPD_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTBM01_UPD_DATETIME_Visible, edtTBM01_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM01_SYSTEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM01_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTBM01_UPD_DATETIME_Visible==0)||(edtTBM01_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm01_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBM01_UPD_USER_ID_Internalname, GXutil.rtrim( A356TBM01_UPD_USER_ID), GXutil.rtrim( localUtil.format( A356TBM01_UPD_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM01_UPD_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTBM01_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm01_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBM01_UPD_PROG_NM_Internalname, GXutil.rtrim( A357TBM01_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A357TBM01_UPD_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM01_UPD_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTBM01_UPD_PROG_NM_Visible, edtTBM01_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm01_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm01_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTBM01_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A358TBM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM01_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A358TBM01_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A358TBM01_UPD_CNT), "ZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM01_UPD_CNT_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTBM01_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM01_SYSTEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0E13e( true) ;
      }
      else
      {
         wb_table4_34_0E13e( false) ;
      }
   }

   public void wb_table2_5_0E13( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SELECT\\'."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM01_SYSTEM.htm");
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
         wb_table2_5_0E13e( true) ;
      }
      else
      {
         wb_table2_5_0E13e( false) ;
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
      /* Execute user event: e110E2 */
      e110E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A58TBM01_SYS_ID = httpContext.cgiGet( edtTBM01_SYS_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
            A608TBM01_SYS_VALUE = httpContext.cgiGet( edtTBM01_SYS_VALUE_Internalname) ;
            n608TBM01_SYS_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
            n608TBM01_SYS_VALUE = ((GXutil.strcmp("", A608TBM01_SYS_VALUE)==0) ? true : false) ;
            A609TBM01_NOTE = httpContext.cgiGet( edtTBM01_NOTE_Internalname) ;
            n609TBM01_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
            n609TBM01_NOTE = ((GXutil.strcmp("", A609TBM01_NOTE)==0) ? true : false) ;
            A351TBM01_DEL_FLG = httpContext.cgiGet( radTBM01_DEL_FLG.getInternalname()) ;
            n351TBM01_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
            n351TBM01_DEL_FLG = ((GXutil.strcmp("", A351TBM01_DEL_FLG)==0) ? true : false) ;
            A352TBM01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM01_CRT_DATETIME_Internalname)) ;
            n352TBM01_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A353TBM01_CRT_USER_ID = httpContext.cgiGet( edtTBM01_CRT_USER_ID_Internalname) ;
            n353TBM01_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
            A354TBM01_CRT_PROG_NM = httpContext.cgiGet( edtTBM01_CRT_PROG_NM_Internalname) ;
            n354TBM01_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
            A355TBM01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM01_UPD_DATETIME_Internalname)) ;
            n355TBM01_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A356TBM01_UPD_USER_ID = httpContext.cgiGet( edtTBM01_UPD_USER_ID_Internalname) ;
            n356TBM01_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
            A357TBM01_UPD_PROG_NM = httpContext.cgiGet( edtTBM01_UPD_PROG_NM_Internalname) ;
            n357TBM01_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
            A358TBM01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM01_UPD_CNT_Internalname), ".", ",") ;
            n358TBM01_UPD_CNT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
            /* Read saved values. */
            Z58TBM01_SYS_ID = httpContext.cgiGet( "Z58TBM01_SYS_ID") ;
            Z352TBM01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z352TBM01_CRT_DATETIME"), 0) ;
            n352TBM01_CRT_DATETIME = (GXutil.nullDate().equals(A352TBM01_CRT_DATETIME) ? true : false) ;
            Z353TBM01_CRT_USER_ID = httpContext.cgiGet( "Z353TBM01_CRT_USER_ID") ;
            n353TBM01_CRT_USER_ID = ((GXutil.strcmp("", A353TBM01_CRT_USER_ID)==0) ? true : false) ;
            Z355TBM01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z355TBM01_UPD_DATETIME"), 0) ;
            n355TBM01_UPD_DATETIME = (GXutil.nullDate().equals(A355TBM01_UPD_DATETIME) ? true : false) ;
            Z356TBM01_UPD_USER_ID = httpContext.cgiGet( "Z356TBM01_UPD_USER_ID") ;
            n356TBM01_UPD_USER_ID = ((GXutil.strcmp("", A356TBM01_UPD_USER_ID)==0) ? true : false) ;
            Z358TBM01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z358TBM01_UPD_CNT"), ".", ",") ;
            n358TBM01_UPD_CNT = ((0==A358TBM01_UPD_CNT) ? true : false) ;
            Z608TBM01_SYS_VALUE = httpContext.cgiGet( "Z608TBM01_SYS_VALUE") ;
            n608TBM01_SYS_VALUE = ((GXutil.strcmp("", A608TBM01_SYS_VALUE)==0) ? true : false) ;
            Z609TBM01_NOTE = httpContext.cgiGet( "Z609TBM01_NOTE") ;
            n609TBM01_NOTE = ((GXutil.strcmp("", A609TBM01_NOTE)==0) ? true : false) ;
            Z351TBM01_DEL_FLG = httpContext.cgiGet( "Z351TBM01_DEL_FLG") ;
            n351TBM01_DEL_FLG = ((GXutil.strcmp("", A351TBM01_DEL_FLG)==0) ? true : false) ;
            Z354TBM01_CRT_PROG_NM = httpContext.cgiGet( "Z354TBM01_CRT_PROG_NM") ;
            n354TBM01_CRT_PROG_NM = ((GXutil.strcmp("", A354TBM01_CRT_PROG_NM)==0) ? true : false) ;
            Z357TBM01_UPD_PROG_NM = httpContext.cgiGet( "Z357TBM01_UPD_PROG_NM") ;
            n357TBM01_UPD_PROG_NM = ((GXutil.strcmp("", A357TBM01_UPD_PROG_NM)==0) ? true : false) ;
            O358TBM01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O358TBM01_UPD_CNT"), ".", ",") ;
            n358TBM01_UPD_CNT = ((0==A358TBM01_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ".", ",")) ;
            AV15Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A58TBM01_SYS_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
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
                     /* Execute user event: e110E2 */
                     e110E2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_SELECT'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120E2 */
                     e120E2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e130E2 */
                     e130E2 ();
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
            initAll0E13( ) ;
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
      disableAttributes0E13( ) ;
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

   public void confirm_0E0( )
   {
      beforeValidate0E13( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0E13( ) ;
         }
         else
         {
            checkExtendedTable0E13( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors0E13( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
      if ( AnyError == 0 )
      {
         confirmValues0E0( ) ;
      }
   }

   public void resetCaption0E0( )
   {
   }

   public void e110E2( )
   {
      /* Start Routine */
      AV9C_TAM02_APP_ID = "TBM01" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_TAM02_APP_ID", AV9C_TAM02_APP_ID);
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV15Pgmname, "INFO", "画面起動") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      if ( GXutil.strcmp(AV11W_ERRCD, "0") == 0 )
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
      GXt_char1 = AV13W_MSG ;
      GXv_char2[0] = GXt_char1 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
      tbm01_system_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13W_MSG = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13W_MSG", AV13W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV13W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e120E2( )
   {
      /* 'BTN_SELECT' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "tbm01_sel"+GXutil.URLEncode(GXutil.rtrim("")) ;
      httpContext.popup(formatLink("tbm01_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"A58TBM01_SYS_ID"});
   }

   public void e130E2( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tbm01_system")  ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S112( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV10W_A_LOGIN_SDT;
      GXv_char2[0] = AV11W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV10W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      tbm01_system_impl.this.AV11W_ERRCD = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11W_ERRCD", AV11W_ERRCD);
      if ( GXutil.strcmp(AV11W_ERRCD, "0") != 0 )
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
      GXv_char2[0] = AV12W_KNGN_FLG ;
      GXv_char4[0] = AV11W_ERRCD ;
      new a402_pc01_kengen_check(remoteHandle, context).execute( AV9C_TAM02_APP_ID, GXv_char2, GXv_char4) ;
      tbm01_system_impl.this.AV12W_KNGN_FLG = GXv_char2[0] ;
      tbm01_system_impl.this.AV11W_ERRCD = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9C_TAM02_APP_ID", AV9C_TAM02_APP_ID);
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_KNGN_FLG", AV12W_KNGN_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "AV11W_ERRCD", AV11W_ERRCD);
      if ( GXutil.strcmp(AV11W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV15Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm0E13( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z352TBM01_CRT_DATETIME = T000E3_A352TBM01_CRT_DATETIME[0] ;
            Z353TBM01_CRT_USER_ID = T000E3_A353TBM01_CRT_USER_ID[0] ;
            Z355TBM01_UPD_DATETIME = T000E3_A355TBM01_UPD_DATETIME[0] ;
            Z356TBM01_UPD_USER_ID = T000E3_A356TBM01_UPD_USER_ID[0] ;
            Z358TBM01_UPD_CNT = T000E3_A358TBM01_UPD_CNT[0] ;
            Z608TBM01_SYS_VALUE = T000E3_A608TBM01_SYS_VALUE[0] ;
            Z609TBM01_NOTE = T000E3_A609TBM01_NOTE[0] ;
            Z351TBM01_DEL_FLG = T000E3_A351TBM01_DEL_FLG[0] ;
            Z354TBM01_CRT_PROG_NM = T000E3_A354TBM01_CRT_PROG_NM[0] ;
            Z357TBM01_UPD_PROG_NM = T000E3_A357TBM01_UPD_PROG_NM[0] ;
         }
         else
         {
            Z352TBM01_CRT_DATETIME = A352TBM01_CRT_DATETIME ;
            Z353TBM01_CRT_USER_ID = A353TBM01_CRT_USER_ID ;
            Z355TBM01_UPD_DATETIME = A355TBM01_UPD_DATETIME ;
            Z356TBM01_UPD_USER_ID = A356TBM01_UPD_USER_ID ;
            Z358TBM01_UPD_CNT = A358TBM01_UPD_CNT ;
            Z608TBM01_SYS_VALUE = A608TBM01_SYS_VALUE ;
            Z609TBM01_NOTE = A609TBM01_NOTE ;
            Z351TBM01_DEL_FLG = A351TBM01_DEL_FLG ;
            Z354TBM01_CRT_PROG_NM = A354TBM01_CRT_PROG_NM ;
            Z357TBM01_UPD_PROG_NM = A357TBM01_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z58TBM01_SYS_ID = A58TBM01_SYS_ID ;
         Z352TBM01_CRT_DATETIME = A352TBM01_CRT_DATETIME ;
         Z353TBM01_CRT_USER_ID = A353TBM01_CRT_USER_ID ;
         Z355TBM01_UPD_DATETIME = A355TBM01_UPD_DATETIME ;
         Z356TBM01_UPD_USER_ID = A356TBM01_UPD_USER_ID ;
         Z358TBM01_UPD_CNT = A358TBM01_UPD_CNT ;
         Z608TBM01_SYS_VALUE = A608TBM01_SYS_VALUE ;
         Z609TBM01_NOTE = A609TBM01_NOTE ;
         Z351TBM01_DEL_FLG = A351TBM01_DEL_FLG ;
         Z354TBM01_CRT_PROG_NM = A354TBM01_CRT_PROG_NM ;
         Z357TBM01_UPD_PROG_NM = A357TBM01_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTBM01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM01_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_CNT_Enabled, 5, 0)));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTBM01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM01_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_CNT_Enabled, 5, 0)));
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtTBM01_SYS_ID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTBM01_SYS_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_SYS_ID_Enabled, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTBM01_CRT_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTBM01_CRT_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTBM01_CRT_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTBM01_CRT_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTBM01_UPD_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTBM01_UPD_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTBM01_UPD_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTBM01_UPD_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A351TBM01_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A351TBM01_DEL_FLG = "0" ;
         n351TBM01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A354TBM01_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A354TBM01_CRT_PROG_NM = AV15Pgmname ;
         n354TBM01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A357TBM01_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A357TBM01_UPD_PROG_NM = AV15Pgmname ;
         n357TBM01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
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

   public void load0E13( )
   {
      /* Using cursor T000E4 */
      pr_default.execute(2, new Object[] {A58TBM01_SYS_ID});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A352TBM01_CRT_DATETIME = T000E4_A352TBM01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n352TBM01_CRT_DATETIME = T000E4_n352TBM01_CRT_DATETIME[0] ;
         A353TBM01_CRT_USER_ID = T000E4_A353TBM01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
         n353TBM01_CRT_USER_ID = T000E4_n353TBM01_CRT_USER_ID[0] ;
         A355TBM01_UPD_DATETIME = T000E4_A355TBM01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n355TBM01_UPD_DATETIME = T000E4_n355TBM01_UPD_DATETIME[0] ;
         A356TBM01_UPD_USER_ID = T000E4_A356TBM01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
         n356TBM01_UPD_USER_ID = T000E4_n356TBM01_UPD_USER_ID[0] ;
         A358TBM01_UPD_CNT = T000E4_A358TBM01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
         n358TBM01_UPD_CNT = T000E4_n358TBM01_UPD_CNT[0] ;
         A608TBM01_SYS_VALUE = T000E4_A608TBM01_SYS_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
         n608TBM01_SYS_VALUE = T000E4_n608TBM01_SYS_VALUE[0] ;
         A609TBM01_NOTE = T000E4_A609TBM01_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
         n609TBM01_NOTE = T000E4_n609TBM01_NOTE[0] ;
         A351TBM01_DEL_FLG = T000E4_A351TBM01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
         n351TBM01_DEL_FLG = T000E4_n351TBM01_DEL_FLG[0] ;
         A354TBM01_CRT_PROG_NM = T000E4_A354TBM01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
         n354TBM01_CRT_PROG_NM = T000E4_n354TBM01_CRT_PROG_NM[0] ;
         A357TBM01_UPD_PROG_NM = T000E4_A357TBM01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
         n357TBM01_UPD_PROG_NM = T000E4_n357TBM01_UPD_PROG_NM[0] ;
         zm0E13( -28) ;
      }
      pr_default.close(2);
      onLoadActions0E13( ) ;
   }

   public void onLoadActions0E13( )
   {
      AV15Pgmname = "TBM01_SYSTEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
   }

   public void checkExtendedTable0E13( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV15Pgmname = "TBM01_SYSTEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
   }

   public void closeExtendedTableCursors0E13( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0E13( )
   {
      /* Using cursor T000E5 */
      pr_default.execute(3, new Object[] {A58TBM01_SYS_ID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound13 = (short)(1) ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000E3 */
      pr_default.execute(1, new Object[] {A58TBM01_SYS_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0E13( 28) ;
         RcdFound13 = (short)(1) ;
         A58TBM01_SYS_ID = T000E3_A58TBM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
         A352TBM01_CRT_DATETIME = T000E3_A352TBM01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n352TBM01_CRT_DATETIME = T000E3_n352TBM01_CRT_DATETIME[0] ;
         A353TBM01_CRT_USER_ID = T000E3_A353TBM01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
         n353TBM01_CRT_USER_ID = T000E3_n353TBM01_CRT_USER_ID[0] ;
         A355TBM01_UPD_DATETIME = T000E3_A355TBM01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n355TBM01_UPD_DATETIME = T000E3_n355TBM01_UPD_DATETIME[0] ;
         A356TBM01_UPD_USER_ID = T000E3_A356TBM01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
         n356TBM01_UPD_USER_ID = T000E3_n356TBM01_UPD_USER_ID[0] ;
         A358TBM01_UPD_CNT = T000E3_A358TBM01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
         n358TBM01_UPD_CNT = T000E3_n358TBM01_UPD_CNT[0] ;
         A608TBM01_SYS_VALUE = T000E3_A608TBM01_SYS_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
         n608TBM01_SYS_VALUE = T000E3_n608TBM01_SYS_VALUE[0] ;
         A609TBM01_NOTE = T000E3_A609TBM01_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
         n609TBM01_NOTE = T000E3_n609TBM01_NOTE[0] ;
         A351TBM01_DEL_FLG = T000E3_A351TBM01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
         n351TBM01_DEL_FLG = T000E3_n351TBM01_DEL_FLG[0] ;
         A354TBM01_CRT_PROG_NM = T000E3_A354TBM01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
         n354TBM01_CRT_PROG_NM = T000E3_n354TBM01_CRT_PROG_NM[0] ;
         A357TBM01_UPD_PROG_NM = T000E3_A357TBM01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
         n357TBM01_UPD_PROG_NM = T000E3_n357TBM01_UPD_PROG_NM[0] ;
         O358TBM01_UPD_CNT = A358TBM01_UPD_CNT ;
         n358TBM01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
         Z58TBM01_SYS_ID = A58TBM01_SYS_ID ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0E13( ) ;
         if ( AnyError == 1 )
         {
            RcdFound13 = (short)(0) ;
            initializeNonKey0E13( ) ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound13 = (short)(0) ;
         initializeNonKey0E13( ) ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0E13( ) ;
      if ( RcdFound13 == 0 )
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
      RcdFound13 = (short)(0) ;
      /* Using cursor T000E6 */
      pr_default.execute(4, new Object[] {A58TBM01_SYS_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000E6_A58TBM01_SYS_ID[0], A58TBM01_SYS_ID) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000E6_A58TBM01_SYS_ID[0], A58TBM01_SYS_ID) > 0 ) ) )
         {
            A58TBM01_SYS_ID = T000E6_A58TBM01_SYS_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
            RcdFound13 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound13 = (short)(0) ;
      /* Using cursor T000E7 */
      pr_default.execute(5, new Object[] {A58TBM01_SYS_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000E7_A58TBM01_SYS_ID[0], A58TBM01_SYS_ID) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000E7_A58TBM01_SYS_ID[0], A58TBM01_SYS_ID) < 0 ) ) )
         {
            A58TBM01_SYS_ID = T000E7_A58TBM01_SYS_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
            RcdFound13 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0E13( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0E13( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound13 == 1 )
         {
            if ( GXutil.strcmp(A58TBM01_SYS_ID, Z58TBM01_SYS_ID) != 0 )
            {
               A58TBM01_SYS_ID = Z58TBM01_SYS_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM01_SYS_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0E13( ) ;
               GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A58TBM01_SYS_ID, Z58TBM01_SYS_ID) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0E13( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM01_SYS_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0E13( ) ;
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
      if ( GXutil.strcmp(A58TBM01_SYS_ID, Z58TBM01_SYS_ID) != 0 )
      {
         A58TBM01_SYS_ID = Z58TBM01_SYS_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
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
      getKey0E13( ) ;
      if ( RcdFound13 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM01_SYS_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, Z58TBM01_SYS_ID) != 0 )
         {
            A58TBM01_SYS_ID = Z58TBM01_SYS_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "TBM01_SYS_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
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
         if ( GXutil.strcmp(A58TBM01_SYS_ID, Z58TBM01_SYS_ID) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM01_SYS_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm01_system");
      GX_FocusControl = edtTBM01_SYS_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_0E0( ) ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM01_SYS_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0E13( ) ;
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM01_SYS_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0E13( ) ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM01_SYS_VALUE_Internalname ;
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
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM01_SYS_VALUE_Internalname ;
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
      scanStart0E13( ) ;
      if ( RcdFound13 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound13 != 0 )
         {
            scanNext0E13( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM01_SYS_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0E13( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0E13( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000E2 */
         pr_default.execute(0, new Object[] {A58TBM01_SYS_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM01_SYSTEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z352TBM01_CRT_DATETIME.equals( T000E2_A352TBM01_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z353TBM01_CRT_USER_ID, T000E2_A353TBM01_CRT_USER_ID[0]) != 0 ) || !( Z355TBM01_UPD_DATETIME.equals( T000E2_A355TBM01_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z356TBM01_UPD_USER_ID, T000E2_A356TBM01_UPD_USER_ID[0]) != 0 ) || ( Z358TBM01_UPD_CNT != T000E2_A358TBM01_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z608TBM01_SYS_VALUE, T000E2_A608TBM01_SYS_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z609TBM01_NOTE, T000E2_A609TBM01_NOTE[0]) != 0 ) || ( GXutil.strcmp(Z351TBM01_DEL_FLG, T000E2_A351TBM01_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z354TBM01_CRT_PROG_NM, T000E2_A354TBM01_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z357TBM01_UPD_PROG_NM, T000E2_A357TBM01_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM01_SYSTEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0E13( )
   {
      beforeValidate0E13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0E13( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0E13( 0) ;
         checkOptimisticConcurrency0E13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0E13( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0E13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000E8 */
                  pr_default.execute(6, new Object[] {A58TBM01_SYS_ID, new Boolean(n352TBM01_CRT_DATETIME), A352TBM01_CRT_DATETIME, new Boolean(n353TBM01_CRT_USER_ID), A353TBM01_CRT_USER_ID, new Boolean(n355TBM01_UPD_DATETIME), A355TBM01_UPD_DATETIME, new Boolean(n356TBM01_UPD_USER_ID), A356TBM01_UPD_USER_ID, new Boolean(n358TBM01_UPD_CNT), new Long(A358TBM01_UPD_CNT), new Boolean(n608TBM01_SYS_VALUE), A608TBM01_SYS_VALUE, new Boolean(n609TBM01_NOTE), A609TBM01_NOTE, new Boolean(n351TBM01_DEL_FLG), A351TBM01_DEL_FLG, new Boolean(n354TBM01_CRT_PROG_NM), A354TBM01_CRT_PROG_NM, new Boolean(n357TBM01_UPD_PROG_NM), A357TBM01_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM01_SYSTEM") ;
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tbm01_pc01_datalog(remoteHandle, context).execute( AV15Pgmname, Gx_mode, A58TBM01_SYS_ID, A608TBM01_SYS_VALUE, A609TBM01_NOTE, A351TBM01_DEL_FLG, A352TBM01_CRT_DATETIME, A353TBM01_CRT_USER_ID, A354TBM01_CRT_PROG_NM, A355TBM01_UPD_DATETIME, A356TBM01_UPD_USER_ID, A357TBM01_UPD_PROG_NM, A358TBM01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
                     httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
                     httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption0E0( ) ;
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
            load0E13( ) ;
         }
         endLevel0E13( ) ;
      }
      closeExtendedTableCursors0E13( ) ;
   }

   public void update0E13( )
   {
      beforeValidate0E13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0E13( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0E13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0E13( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0E13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000E9 */
                  pr_default.execute(7, new Object[] {new Boolean(n352TBM01_CRT_DATETIME), A352TBM01_CRT_DATETIME, new Boolean(n353TBM01_CRT_USER_ID), A353TBM01_CRT_USER_ID, new Boolean(n355TBM01_UPD_DATETIME), A355TBM01_UPD_DATETIME, new Boolean(n356TBM01_UPD_USER_ID), A356TBM01_UPD_USER_ID, new Boolean(n358TBM01_UPD_CNT), new Long(A358TBM01_UPD_CNT), new Boolean(n608TBM01_SYS_VALUE), A608TBM01_SYS_VALUE, new Boolean(n609TBM01_NOTE), A609TBM01_NOTE, new Boolean(n351TBM01_DEL_FLG), A351TBM01_DEL_FLG, new Boolean(n354TBM01_CRT_PROG_NM), A354TBM01_CRT_PROG_NM, new Boolean(n357TBM01_UPD_PROG_NM), A357TBM01_UPD_PROG_NM, A58TBM01_SYS_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM01_SYSTEM") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM01_SYSTEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0E13( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tbm01_pc01_datalog(remoteHandle, context).execute( AV15Pgmname, Gx_mode, A58TBM01_SYS_ID, A608TBM01_SYS_VALUE, A609TBM01_NOTE, A351TBM01_DEL_FLG, A352TBM01_CRT_DATETIME, A353TBM01_CRT_USER_ID, A354TBM01_CRT_PROG_NM, A355TBM01_UPD_DATETIME, A356TBM01_UPD_USER_ID, A357TBM01_UPD_PROG_NM, A358TBM01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
                     httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
                     httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0E0( ) ;
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
         endLevel0E13( ) ;
      }
      closeExtendedTableCursors0E13( ) ;
   }

   public void deferredUpdate0E13( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0E13( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0E13( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0E13( ) ;
         afterConfirm0E13( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0E13( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000E10 */
               pr_default.execute(8, new Object[] {A58TBM01_SYS_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM01_SYSTEM") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tbm01_pc01_datalog(remoteHandle, context).execute( AV15Pgmname, Gx_mode, A58TBM01_SYS_ID, A608TBM01_SYS_VALUE, A609TBM01_NOTE, A351TBM01_DEL_FLG, A352TBM01_CRT_DATETIME, A353TBM01_CRT_USER_ID, A354TBM01_CRT_PROG_NM, A355TBM01_UPD_DATETIME, A356TBM01_UPD_USER_ID, A357TBM01_UPD_PROG_NM, A358TBM01_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
                  httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
                  httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound13 == 0 )
                     {
                        initAll0E13( ) ;
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
                     resetCaption0E0( ) ;
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
      sMode13 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0E13( ) ;
      Gx_mode = sMode13 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0E13( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV15Pgmname = "TBM01_SYSTEM" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      }
   }

   public void endLevel0E13( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0E13( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm01_system");
         if ( AnyError == 0 )
         {
            confirmValues0E0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm01_system");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0E13( )
   {
      /* Scan By routine */
      /* Using cursor T000E11 */
      pr_default.execute(9);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A58TBM01_SYS_ID = T000E11_A58TBM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0E13( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A58TBM01_SYS_ID = T000E11_A58TBM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
      }
   }

   public void scanEnd0E13( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0E13( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A58TBM01_SYS_ID)==0) )
      {
         httpContext.GX_msglist.addItem("規定値キーワードを入力してください", 1, "TBM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 20 < GXutil.byteCount( A58TBM01_SYS_ID, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("規定値キーワードは半角20桁以内になるようにしてください。", 1, "TBM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A608TBM01_SYS_VALUE)==0) )
      {
         httpContext.GX_msglist.addItem("規定値を入力してください", 1, "TBM01_SYS_VALUE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM01_SYS_VALUE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 100 < GXutil.byteCount( A608TBM01_SYS_VALUE, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("規定値は全角50桁又は半角100桁以内になるようにしてください。", 1, "TBM01_SYS_VALUE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM01_SYS_VALUE_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert0E13( )
   {
      /* Before Insert Rules */
      A352TBM01_CRT_DATETIME = GXutil.now( ) ;
      n352TBM01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A353TBM01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm01_system_impl.this.GXt_char1 = GXv_char4[0] ;
      A353TBM01_CRT_USER_ID = GXt_char1 ;
      n353TBM01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
      A355TBM01_UPD_DATETIME = GXutil.now( ) ;
      n355TBM01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A356TBM01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm01_system_impl.this.GXt_char1 = GXv_char4[0] ;
      A356TBM01_UPD_USER_ID = GXt_char1 ;
      n356TBM01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
      A358TBM01_UPD_CNT = (long)(O358TBM01_UPD_CNT+1) ;
      n358TBM01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0E13( )
   {
      /* Before Update Rules */
      A355TBM01_UPD_DATETIME = GXutil.now( ) ;
      n355TBM01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A356TBM01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm01_system_impl.this.GXt_char1 = GXv_char4[0] ;
      A356TBM01_UPD_USER_ID = GXt_char1 ;
      n356TBM01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
      A358TBM01_UPD_CNT = (long)(O358TBM01_UPD_CNT+1) ;
      n358TBM01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0E13( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0E13( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0E13( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0E13( )
   {
      edtTBM01_SYS_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_SYS_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_SYS_ID_Enabled, 5, 0)));
      edtTBM01_SYS_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_SYS_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_SYS_VALUE_Enabled, 5, 0)));
      edtTBM01_NOTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_NOTE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_NOTE_Enabled, 5, 0)));
      radTBM01_DEL_FLG.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radTBM01_DEL_FLG.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radTBM01_DEL_FLG.getEnabled(), 5, 0)));
      edtTBM01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM01_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM01_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM01_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0E0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "システム規定値マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151319189");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm01_system") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0E13( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z58TBM01_SYS_ID", GXutil.rtrim( Z58TBM01_SYS_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z352TBM01_CRT_DATETIME", localUtil.ttoc( Z352TBM01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z353TBM01_CRT_USER_ID", GXutil.rtrim( Z353TBM01_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z355TBM01_UPD_DATETIME", localUtil.ttoc( Z355TBM01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z356TBM01_UPD_USER_ID", GXutil.rtrim( Z356TBM01_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z358TBM01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z358TBM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z608TBM01_SYS_VALUE", GXutil.rtrim( Z608TBM01_SYS_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z609TBM01_NOTE", GXutil.rtrim( Z609TBM01_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z351TBM01_DEL_FLG", GXutil.rtrim( Z351TBM01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z354TBM01_CRT_PROG_NM", GXutil.rtrim( Z354TBM01_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z357TBM01_UPD_PROG_NM", GXutil.rtrim( Z357TBM01_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O358TBM01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O358TBM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV15Pgmname));
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
      return "TBM01_SYSTEM" ;
   }

   public String getPgmdesc( )
   {
      return "システム規定値マスタ" ;
   }

   public void initializeNonKey0E13( )
   {
      A352TBM01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n352TBM01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n352TBM01_CRT_DATETIME = (GXutil.nullDate().equals(A352TBM01_CRT_DATETIME) ? true : false) ;
      A353TBM01_CRT_USER_ID = "" ;
      n353TBM01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
      n353TBM01_CRT_USER_ID = ((GXutil.strcmp("", A353TBM01_CRT_USER_ID)==0) ? true : false) ;
      A355TBM01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n355TBM01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n355TBM01_UPD_DATETIME = (GXutil.nullDate().equals(A355TBM01_UPD_DATETIME) ? true : false) ;
      A356TBM01_UPD_USER_ID = "" ;
      n356TBM01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
      n356TBM01_UPD_USER_ID = ((GXutil.strcmp("", A356TBM01_UPD_USER_ID)==0) ? true : false) ;
      A358TBM01_UPD_CNT = 0 ;
      n358TBM01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
      n358TBM01_UPD_CNT = ((0==A358TBM01_UPD_CNT) ? true : false) ;
      A608TBM01_SYS_VALUE = "" ;
      n608TBM01_SYS_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
      n608TBM01_SYS_VALUE = ((GXutil.strcmp("", A608TBM01_SYS_VALUE)==0) ? true : false) ;
      A609TBM01_NOTE = "" ;
      n609TBM01_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
      n609TBM01_NOTE = ((GXutil.strcmp("", A609TBM01_NOTE)==0) ? true : false) ;
      A351TBM01_DEL_FLG = "0" ;
      n351TBM01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
      A354TBM01_CRT_PROG_NM = AV15Pgmname ;
      n354TBM01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
      A357TBM01_UPD_PROG_NM = AV15Pgmname ;
      n357TBM01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
      O358TBM01_UPD_CNT = A358TBM01_UPD_CNT ;
      n358TBM01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
   }

   public void initAll0E13( )
   {
      A58TBM01_SYS_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
      initializeNonKey0E13( ) ;
   }

   public void standaloneModalInsert( )
   {
      A351TBM01_DEL_FLG = i351TBM01_DEL_FLG ;
      n351TBM01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
      A354TBM01_CRT_PROG_NM = i354TBM01_CRT_PROG_NM ;
      n354TBM01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
      A357TBM01_UPD_PROG_NM = i357TBM01_UPD_PROG_NM ;
      n357TBM01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?1830155");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151319195");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm01_system.js", "?20207151319195");
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
      lblTextblocktbm01_sys_id_Internalname = "TEXTBLOCKTBM01_SYS_ID" ;
      edtTBM01_SYS_ID_Internalname = "TBM01_SYS_ID" ;
      imgImage20_Internalname = "IMAGE20" ;
      lblTextblocktbm01_sys_value_Internalname = "TEXTBLOCKTBM01_SYS_VALUE" ;
      edtTBM01_SYS_VALUE_Internalname = "TBM01_SYS_VALUE" ;
      lblTextblocktbm01_note_Internalname = "TEXTBLOCKTBM01_NOTE" ;
      edtTBM01_NOTE_Internalname = "TBM01_NOTE" ;
      lblTextblocktbm01_del_flg_Internalname = "TEXTBLOCKTBM01_DEL_FLG" ;
      radTBM01_DEL_FLG.setInternalname( "TBM01_DEL_FLG" );
      lblTextblocktbm01_crt_datetime_Internalname = "TEXTBLOCKTBM01_CRT_DATETIME" ;
      edtTBM01_CRT_DATETIME_Internalname = "TBM01_CRT_DATETIME" ;
      lblTextblocktbm01_crt_user_id_Internalname = "TEXTBLOCKTBM01_CRT_USER_ID" ;
      edtTBM01_CRT_USER_ID_Internalname = "TBM01_CRT_USER_ID" ;
      lblTextblocktbm01_crt_prog_nm_Internalname = "TEXTBLOCKTBM01_CRT_PROG_NM" ;
      edtTBM01_CRT_PROG_NM_Internalname = "TBM01_CRT_PROG_NM" ;
      lblTextblocktbm01_upd_datetime_Internalname = "TEXTBLOCKTBM01_UPD_DATETIME" ;
      edtTBM01_UPD_DATETIME_Internalname = "TBM01_UPD_DATETIME" ;
      lblTextblocktbm01_upd_user_id_Internalname = "TEXTBLOCKTBM01_UPD_USER_ID" ;
      edtTBM01_UPD_USER_ID_Internalname = "TBM01_UPD_USER_ID" ;
      lblTextblocktbm01_upd_prog_nm_Internalname = "TEXTBLOCKTBM01_UPD_PROG_NM" ;
      edtTBM01_UPD_PROG_NM_Internalname = "TBM01_UPD_PROG_NM" ;
      lblTextblocktbm01_upd_cnt_Internalname = "TEXTBLOCKTBM01_UPD_CNT" ;
      edtTBM01_UPD_CNT_Internalname = "TBM01_UPD_CNT" ;
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
      edtTBM01_UPD_CNT_Jsonclick = "" ;
      edtTBM01_UPD_CNT_Enabled = 0 ;
      edtTBM01_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM01_UPD_PROG_NM_Enabled = 0 ;
      edtTBM01_UPD_PROG_NM_Visible = 1 ;
      edtTBM01_UPD_USER_ID_Jsonclick = "" ;
      edtTBM01_UPD_USER_ID_Enabled = 0 ;
      edtTBM01_UPD_DATETIME_Jsonclick = "" ;
      edtTBM01_UPD_DATETIME_Enabled = 0 ;
      edtTBM01_UPD_DATETIME_Visible = 1 ;
      edtTBM01_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM01_CRT_PROG_NM_Enabled = 0 ;
      edtTBM01_CRT_PROG_NM_Visible = 1 ;
      edtTBM01_CRT_USER_ID_Jsonclick = "" ;
      edtTBM01_CRT_USER_ID_Enabled = 0 ;
      edtTBM01_CRT_DATETIME_Jsonclick = "" ;
      edtTBM01_CRT_DATETIME_Enabled = 0 ;
      edtTBM01_CRT_DATETIME_Visible = 1 ;
      radTBM01_DEL_FLG.setJsonclick( "" );
      radTBM01_DEL_FLG.setEnabled( 1 );
      edtTBM01_NOTE_Enabled = 1 ;
      edtTBM01_SYS_VALUE_Jsonclick = "" ;
      edtTBM01_SYS_VALUE_Enabled = 1 ;
      imgImage20_Visible = 1 ;
      edtTBM01_SYS_ID_Jsonclick = "" ;
      edtTBM01_SYS_ID_Enabled = 1 ;
      imgImage19_Visible = 1 ;
      lblBtn_cancel_Enabled = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx7asatbm01_crt_user_id0E13( String Gx_mode )
   {
      GXt_char1 = A353TBM01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm01_system_impl.this.GXt_char1 = GXv_char4[0] ;
      A353TBM01_CRT_USER_ID = GXt_char1 ;
      n353TBM01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A353TBM01_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx9asatbm01_upd_user_id0E13( String Gx_mode )
   {
      GXt_char1 = A356TBM01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm01_system_impl.this.GXt_char1 = GXv_char4[0] ;
      A356TBM01_UPD_USER_ID = GXt_char1 ;
      n356TBM01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A356TBM01_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_25_0E13( String AV15Pgmname ,
                           String Gx_mode ,
                           String A58TBM01_SYS_ID ,
                           String A608TBM01_SYS_VALUE ,
                           String A609TBM01_NOTE ,
                           String A351TBM01_DEL_FLG ,
                           java.util.Date A352TBM01_CRT_DATETIME ,
                           String A353TBM01_CRT_USER_ID ,
                           String A354TBM01_CRT_PROG_NM ,
                           java.util.Date A355TBM01_UPD_DATETIME ,
                           String A356TBM01_UPD_USER_ID ,
                           String A357TBM01_UPD_PROG_NM ,
                           long A358TBM01_UPD_CNT )
   {
      new tbm01_pc01_datalog(remoteHandle, context).execute( AV15Pgmname, Gx_mode, A58TBM01_SYS_ID, A608TBM01_SYS_VALUE, A609TBM01_NOTE, A351TBM01_DEL_FLG, A352TBM01_CRT_DATETIME, A353TBM01_CRT_USER_ID, A354TBM01_CRT_PROG_NM, A355TBM01_UPD_DATETIME, A356TBM01_UPD_USER_ID, A357TBM01_UPD_PROG_NM, A358TBM01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
      httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
      httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
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

   public void xc_26_0E13( String AV15Pgmname ,
                           String Gx_mode ,
                           String A58TBM01_SYS_ID ,
                           String A608TBM01_SYS_VALUE ,
                           String A609TBM01_NOTE ,
                           String A351TBM01_DEL_FLG ,
                           java.util.Date A352TBM01_CRT_DATETIME ,
                           String A353TBM01_CRT_USER_ID ,
                           String A354TBM01_CRT_PROG_NM ,
                           java.util.Date A355TBM01_UPD_DATETIME ,
                           String A356TBM01_UPD_USER_ID ,
                           String A357TBM01_UPD_PROG_NM ,
                           long A358TBM01_UPD_CNT )
   {
      new tbm01_pc01_datalog(remoteHandle, context).execute( AV15Pgmname, Gx_mode, A58TBM01_SYS_ID, A608TBM01_SYS_VALUE, A609TBM01_NOTE, A351TBM01_DEL_FLG, A352TBM01_CRT_DATETIME, A353TBM01_CRT_USER_ID, A354TBM01_CRT_PROG_NM, A355TBM01_UPD_DATETIME, A356TBM01_UPD_USER_ID, A357TBM01_UPD_PROG_NM, A358TBM01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
      httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
      httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
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

   public void xc_27_0E13( String AV15Pgmname ,
                           String Gx_mode ,
                           String A58TBM01_SYS_ID ,
                           String A608TBM01_SYS_VALUE ,
                           String A609TBM01_NOTE ,
                           String A351TBM01_DEL_FLG ,
                           java.util.Date A352TBM01_CRT_DATETIME ,
                           String A353TBM01_CRT_USER_ID ,
                           String A354TBM01_CRT_PROG_NM ,
                           java.util.Date A355TBM01_UPD_DATETIME ,
                           String A356TBM01_UPD_USER_ID ,
                           String A357TBM01_UPD_PROG_NM ,
                           long A358TBM01_UPD_CNT )
   {
      new tbm01_pc01_datalog(remoteHandle, context).execute( AV15Pgmname, Gx_mode, A58TBM01_SYS_ID, A608TBM01_SYS_VALUE, A609TBM01_NOTE, A351TBM01_DEL_FLG, A352TBM01_CRT_DATETIME, A353TBM01_CRT_USER_ID, A354TBM01_CRT_PROG_NM, A355TBM01_UPD_DATETIME, A356TBM01_UPD_USER_ID, A357TBM01_UPD_PROG_NM, A358TBM01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A58TBM01_SYS_ID", A58TBM01_SYS_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A608TBM01_SYS_VALUE", A608TBM01_SYS_VALUE);
      httpContext.ajax_rsp_assign_attri("", false, "A609TBM01_NOTE", A609TBM01_NOTE);
      httpContext.ajax_rsp_assign_attri("", false, "A351TBM01_DEL_FLG", A351TBM01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A352TBM01_CRT_DATETIME", localUtil.ttoc( A352TBM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A353TBM01_CRT_USER_ID", A353TBM01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A354TBM01_CRT_PROG_NM", A354TBM01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A355TBM01_UPD_DATETIME", localUtil.ttoc( A355TBM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A356TBM01_UPD_USER_ID", A356TBM01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A357TBM01_UPD_PROG_NM", A357TBM01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A358TBM01_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBM01_UPD_CNT, 10, 0)));
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
      GX_FocusControl = edtTBM01_SYS_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm01_sys_id( String GX_Parm1 ,
                                   java.util.Date GX_Parm2 ,
                                   String GX_Parm3 ,
                                   java.util.Date GX_Parm4 ,
                                   String GX_Parm5 ,
                                   long GX_Parm6 ,
                                   String GX_Parm7 ,
                                   String GX_Parm8 ,
                                   String GX_Parm9 ,
                                   String GX_Parm10 ,
                                   String GX_Parm11 )
   {
      A58TBM01_SYS_ID = GX_Parm1 ;
      A352TBM01_CRT_DATETIME = GX_Parm2 ;
      n352TBM01_CRT_DATETIME = false ;
      A353TBM01_CRT_USER_ID = GX_Parm3 ;
      n353TBM01_CRT_USER_ID = false ;
      A355TBM01_UPD_DATETIME = GX_Parm4 ;
      n355TBM01_UPD_DATETIME = false ;
      A356TBM01_UPD_USER_ID = GX_Parm5 ;
      n356TBM01_UPD_USER_ID = false ;
      A358TBM01_UPD_CNT = GX_Parm6 ;
      n358TBM01_UPD_CNT = false ;
      A608TBM01_SYS_VALUE = GX_Parm7 ;
      n608TBM01_SYS_VALUE = false ;
      A609TBM01_NOTE = GX_Parm8 ;
      n609TBM01_NOTE = false ;
      A351TBM01_DEL_FLG = GX_Parm9 ;
      n351TBM01_DEL_FLG = false ;
      A354TBM01_CRT_PROG_NM = GX_Parm10 ;
      n354TBM01_CRT_PROG_NM = false ;
      A357TBM01_UPD_PROG_NM = GX_Parm11 ;
      n357TBM01_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A352TBM01_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A353TBM01_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A355TBM01_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A356TBM01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A358TBM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A608TBM01_SYS_VALUE));
      isValidOutput.add(GXutil.rtrim( A609TBM01_NOTE));
      isValidOutput.add(GXutil.rtrim( A351TBM01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A354TBM01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A357TBM01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV15Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z58TBM01_SYS_ID));
      isValidOutput.add(localUtil.ttoc( Z352TBM01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z353TBM01_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z355TBM01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z356TBM01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z358TBM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z608TBM01_SYS_VALUE));
      isValidOutput.add(GXutil.rtrim( Z609TBM01_NOTE));
      isValidOutput.add(GXutil.rtrim( Z351TBM01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z354TBM01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z357TBM01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV15Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O358TBM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(edtTBM01_SYS_ID_Enabled);
      isValidOutput.add(edtTBM01_CRT_DATETIME_Visible);
      isValidOutput.add(edtTBM01_CRT_PROG_NM_Visible);
      isValidOutput.add(edtTBM01_UPD_DATETIME_Visible);
      isValidOutput.add(edtTBM01_UPD_PROG_NM_Visible);
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
      Z58TBM01_SYS_ID = "" ;
      Z352TBM01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z353TBM01_CRT_USER_ID = "" ;
      Z355TBM01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z356TBM01_UPD_USER_ID = "" ;
      Z608TBM01_SYS_VALUE = "" ;
      Z609TBM01_NOTE = "" ;
      Z351TBM01_DEL_FLG = "" ;
      Z354TBM01_CRT_PROG_NM = "" ;
      Z357TBM01_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15Pgmname = "" ;
      Gx_mode = "" ;
      A58TBM01_SYS_ID = "" ;
      A608TBM01_SYS_VALUE = "" ;
      A609TBM01_NOTE = "" ;
      A351TBM01_DEL_FLG = "" ;
      A352TBM01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A353TBM01_CRT_USER_ID = "" ;
      A354TBM01_CRT_PROG_NM = "" ;
      A355TBM01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A356TBM01_UPD_USER_ID = "" ;
      A357TBM01_UPD_PROG_NM = "" ;
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
      lblTextblocktbm01_sys_id_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblocktbm01_sys_value_Jsonclick = "" ;
      lblTextblocktbm01_note_Jsonclick = "" ;
      lblTextblocktbm01_del_flg_Jsonclick = "" ;
      lblTextblocktbm01_crt_datetime_Jsonclick = "" ;
      lblTextblocktbm01_crt_user_id_Jsonclick = "" ;
      lblTextblocktbm01_crt_prog_nm_Jsonclick = "" ;
      lblTextblocktbm01_upd_datetime_Jsonclick = "" ;
      lblTextblocktbm01_upd_user_id_Jsonclick = "" ;
      lblTextblocktbm01_upd_prog_nm_Jsonclick = "" ;
      lblTextblocktbm01_upd_cnt_Jsonclick = "" ;
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
      AV9C_TAM02_APP_ID = "" ;
      AV11W_ERRCD = "" ;
      AV13W_MSG = "" ;
      GXEncryptionTmp = "" ;
      AV10W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV12W_KNGN_FLG = "" ;
      GXv_char2 = new String [1] ;
      T000E4_A58TBM01_SYS_ID = new String[] {""} ;
      T000E4_A352TBM01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000E4_n352TBM01_CRT_DATETIME = new boolean[] {false} ;
      T000E4_A353TBM01_CRT_USER_ID = new String[] {""} ;
      T000E4_n353TBM01_CRT_USER_ID = new boolean[] {false} ;
      T000E4_A355TBM01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000E4_n355TBM01_UPD_DATETIME = new boolean[] {false} ;
      T000E4_A356TBM01_UPD_USER_ID = new String[] {""} ;
      T000E4_n356TBM01_UPD_USER_ID = new boolean[] {false} ;
      T000E4_A358TBM01_UPD_CNT = new long[1] ;
      T000E4_n358TBM01_UPD_CNT = new boolean[] {false} ;
      T000E4_A608TBM01_SYS_VALUE = new String[] {""} ;
      T000E4_n608TBM01_SYS_VALUE = new boolean[] {false} ;
      T000E4_A609TBM01_NOTE = new String[] {""} ;
      T000E4_n609TBM01_NOTE = new boolean[] {false} ;
      T000E4_A351TBM01_DEL_FLG = new String[] {""} ;
      T000E4_n351TBM01_DEL_FLG = new boolean[] {false} ;
      T000E4_A354TBM01_CRT_PROG_NM = new String[] {""} ;
      T000E4_n354TBM01_CRT_PROG_NM = new boolean[] {false} ;
      T000E4_A357TBM01_UPD_PROG_NM = new String[] {""} ;
      T000E4_n357TBM01_UPD_PROG_NM = new boolean[] {false} ;
      T000E5_A58TBM01_SYS_ID = new String[] {""} ;
      T000E3_A58TBM01_SYS_ID = new String[] {""} ;
      T000E3_A352TBM01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000E3_n352TBM01_CRT_DATETIME = new boolean[] {false} ;
      T000E3_A353TBM01_CRT_USER_ID = new String[] {""} ;
      T000E3_n353TBM01_CRT_USER_ID = new boolean[] {false} ;
      T000E3_A355TBM01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000E3_n355TBM01_UPD_DATETIME = new boolean[] {false} ;
      T000E3_A356TBM01_UPD_USER_ID = new String[] {""} ;
      T000E3_n356TBM01_UPD_USER_ID = new boolean[] {false} ;
      T000E3_A358TBM01_UPD_CNT = new long[1] ;
      T000E3_n358TBM01_UPD_CNT = new boolean[] {false} ;
      T000E3_A608TBM01_SYS_VALUE = new String[] {""} ;
      T000E3_n608TBM01_SYS_VALUE = new boolean[] {false} ;
      T000E3_A609TBM01_NOTE = new String[] {""} ;
      T000E3_n609TBM01_NOTE = new boolean[] {false} ;
      T000E3_A351TBM01_DEL_FLG = new String[] {""} ;
      T000E3_n351TBM01_DEL_FLG = new boolean[] {false} ;
      T000E3_A354TBM01_CRT_PROG_NM = new String[] {""} ;
      T000E3_n354TBM01_CRT_PROG_NM = new boolean[] {false} ;
      T000E3_A357TBM01_UPD_PROG_NM = new String[] {""} ;
      T000E3_n357TBM01_UPD_PROG_NM = new boolean[] {false} ;
      sMode13 = "" ;
      T000E6_A58TBM01_SYS_ID = new String[] {""} ;
      T000E7_A58TBM01_SYS_ID = new String[] {""} ;
      T000E2_A58TBM01_SYS_ID = new String[] {""} ;
      T000E2_A352TBM01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000E2_n352TBM01_CRT_DATETIME = new boolean[] {false} ;
      T000E2_A353TBM01_CRT_USER_ID = new String[] {""} ;
      T000E2_n353TBM01_CRT_USER_ID = new boolean[] {false} ;
      T000E2_A355TBM01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000E2_n355TBM01_UPD_DATETIME = new boolean[] {false} ;
      T000E2_A356TBM01_UPD_USER_ID = new String[] {""} ;
      T000E2_n356TBM01_UPD_USER_ID = new boolean[] {false} ;
      T000E2_A358TBM01_UPD_CNT = new long[1] ;
      T000E2_n358TBM01_UPD_CNT = new boolean[] {false} ;
      T000E2_A608TBM01_SYS_VALUE = new String[] {""} ;
      T000E2_n608TBM01_SYS_VALUE = new boolean[] {false} ;
      T000E2_A609TBM01_NOTE = new String[] {""} ;
      T000E2_n609TBM01_NOTE = new boolean[] {false} ;
      T000E2_A351TBM01_DEL_FLG = new String[] {""} ;
      T000E2_n351TBM01_DEL_FLG = new boolean[] {false} ;
      T000E2_A354TBM01_CRT_PROG_NM = new String[] {""} ;
      T000E2_n354TBM01_CRT_PROG_NM = new boolean[] {false} ;
      T000E2_A357TBM01_UPD_PROG_NM = new String[] {""} ;
      T000E2_n357TBM01_UPD_PROG_NM = new boolean[] {false} ;
      T000E11_A58TBM01_SYS_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i351TBM01_DEL_FLG = "" ;
      i354TBM01_CRT_PROG_NM = "" ;
      i357TBM01_UPD_PROG_NM = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      ZV15Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm01_system__default(),
         new Object[] {
             new Object[] {
            T000E2_A58TBM01_SYS_ID, T000E2_A352TBM01_CRT_DATETIME, T000E2_n352TBM01_CRT_DATETIME, T000E2_A353TBM01_CRT_USER_ID, T000E2_n353TBM01_CRT_USER_ID, T000E2_A355TBM01_UPD_DATETIME, T000E2_n355TBM01_UPD_DATETIME, T000E2_A356TBM01_UPD_USER_ID, T000E2_n356TBM01_UPD_USER_ID, T000E2_A358TBM01_UPD_CNT,
            T000E2_n358TBM01_UPD_CNT, T000E2_A608TBM01_SYS_VALUE, T000E2_n608TBM01_SYS_VALUE, T000E2_A609TBM01_NOTE, T000E2_n609TBM01_NOTE, T000E2_A351TBM01_DEL_FLG, T000E2_n351TBM01_DEL_FLG, T000E2_A354TBM01_CRT_PROG_NM, T000E2_n354TBM01_CRT_PROG_NM, T000E2_A357TBM01_UPD_PROG_NM,
            T000E2_n357TBM01_UPD_PROG_NM
            }
            , new Object[] {
            T000E3_A58TBM01_SYS_ID, T000E3_A352TBM01_CRT_DATETIME, T000E3_n352TBM01_CRT_DATETIME, T000E3_A353TBM01_CRT_USER_ID, T000E3_n353TBM01_CRT_USER_ID, T000E3_A355TBM01_UPD_DATETIME, T000E3_n355TBM01_UPD_DATETIME, T000E3_A356TBM01_UPD_USER_ID, T000E3_n356TBM01_UPD_USER_ID, T000E3_A358TBM01_UPD_CNT,
            T000E3_n358TBM01_UPD_CNT, T000E3_A608TBM01_SYS_VALUE, T000E3_n608TBM01_SYS_VALUE, T000E3_A609TBM01_NOTE, T000E3_n609TBM01_NOTE, T000E3_A351TBM01_DEL_FLG, T000E3_n351TBM01_DEL_FLG, T000E3_A354TBM01_CRT_PROG_NM, T000E3_n354TBM01_CRT_PROG_NM, T000E3_A357TBM01_UPD_PROG_NM,
            T000E3_n357TBM01_UPD_PROG_NM
            }
            , new Object[] {
            T000E4_A58TBM01_SYS_ID, T000E4_A352TBM01_CRT_DATETIME, T000E4_n352TBM01_CRT_DATETIME, T000E4_A353TBM01_CRT_USER_ID, T000E4_n353TBM01_CRT_USER_ID, T000E4_A355TBM01_UPD_DATETIME, T000E4_n355TBM01_UPD_DATETIME, T000E4_A356TBM01_UPD_USER_ID, T000E4_n356TBM01_UPD_USER_ID, T000E4_A358TBM01_UPD_CNT,
            T000E4_n358TBM01_UPD_CNT, T000E4_A608TBM01_SYS_VALUE, T000E4_n608TBM01_SYS_VALUE, T000E4_A609TBM01_NOTE, T000E4_n609TBM01_NOTE, T000E4_A351TBM01_DEL_FLG, T000E4_n351TBM01_DEL_FLG, T000E4_A354TBM01_CRT_PROG_NM, T000E4_n354TBM01_CRT_PROG_NM, T000E4_A357TBM01_UPD_PROG_NM,
            T000E4_n357TBM01_UPD_PROG_NM
            }
            , new Object[] {
            T000E5_A58TBM01_SYS_ID
            }
            , new Object[] {
            T000E6_A58TBM01_SYS_ID
            }
            , new Object[] {
            T000E7_A58TBM01_SYS_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000E11_A58TBM01_SYS_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z357TBM01_UPD_PROG_NM = AV15Pgmname ;
      n357TBM01_UPD_PROG_NM = false ;
      Z354TBM01_CRT_PROG_NM = AV15Pgmname ;
      n354TBM01_CRT_PROG_NM = false ;
      AV15Pgmname = "TBM01_SYSTEM" ;
      Z351TBM01_DEL_FLG = "0" ;
      n351TBM01_DEL_FLG = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound13 ;
   private short Gx_err ;
   private int trnEnded ;
   private int lblBtn_cancel_Enabled ;
   private int imgImage19_Visible ;
   private int edtTBM01_SYS_ID_Enabled ;
   private int imgImage20_Visible ;
   private int edtTBM01_SYS_VALUE_Enabled ;
   private int edtTBM01_NOTE_Enabled ;
   private int edtTBM01_CRT_DATETIME_Visible ;
   private int edtTBM01_CRT_DATETIME_Enabled ;
   private int edtTBM01_CRT_USER_ID_Enabled ;
   private int edtTBM01_CRT_PROG_NM_Visible ;
   private int edtTBM01_CRT_PROG_NM_Enabled ;
   private int edtTBM01_UPD_DATETIME_Visible ;
   private int edtTBM01_UPD_DATETIME_Enabled ;
   private int edtTBM01_UPD_USER_ID_Enabled ;
   private int edtTBM01_UPD_PROG_NM_Visible ;
   private int edtTBM01_UPD_PROG_NM_Enabled ;
   private int edtTBM01_UPD_CNT_Enabled ;
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
   private long Z358TBM01_UPD_CNT ;
   private long O358TBM01_UPD_CNT ;
   private long A358TBM01_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV15Pgmname ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM01_SYS_ID_Internalname ;
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
   private String lblTextblocktbm01_sys_id_Internalname ;
   private String lblTextblocktbm01_sys_id_Jsonclick ;
   private String TempTags ;
   private String edtTBM01_SYS_ID_Jsonclick ;
   private String imgImage20_Internalname ;
   private String lblTextblocktbm01_sys_value_Internalname ;
   private String lblTextblocktbm01_sys_value_Jsonclick ;
   private String edtTBM01_SYS_VALUE_Internalname ;
   private String edtTBM01_SYS_VALUE_Jsonclick ;
   private String lblTextblocktbm01_note_Internalname ;
   private String lblTextblocktbm01_note_Jsonclick ;
   private String edtTBM01_NOTE_Internalname ;
   private String lblTextblocktbm01_del_flg_Internalname ;
   private String lblTextblocktbm01_del_flg_Jsonclick ;
   private String lblTextblocktbm01_crt_datetime_Internalname ;
   private String lblTextblocktbm01_crt_datetime_Jsonclick ;
   private String edtTBM01_CRT_DATETIME_Internalname ;
   private String edtTBM01_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm01_crt_user_id_Internalname ;
   private String lblTextblocktbm01_crt_user_id_Jsonclick ;
   private String edtTBM01_CRT_USER_ID_Internalname ;
   private String edtTBM01_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm01_crt_prog_nm_Internalname ;
   private String lblTextblocktbm01_crt_prog_nm_Jsonclick ;
   private String edtTBM01_CRT_PROG_NM_Internalname ;
   private String edtTBM01_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm01_upd_datetime_Internalname ;
   private String lblTextblocktbm01_upd_datetime_Jsonclick ;
   private String edtTBM01_UPD_DATETIME_Internalname ;
   private String edtTBM01_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm01_upd_user_id_Internalname ;
   private String lblTextblocktbm01_upd_user_id_Jsonclick ;
   private String edtTBM01_UPD_USER_ID_Internalname ;
   private String edtTBM01_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm01_upd_prog_nm_Internalname ;
   private String lblTextblocktbm01_upd_prog_nm_Jsonclick ;
   private String edtTBM01_UPD_PROG_NM_Internalname ;
   private String edtTBM01_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm01_upd_cnt_Internalname ;
   private String lblTextblocktbm01_upd_cnt_Jsonclick ;
   private String edtTBM01_UPD_CNT_Internalname ;
   private String edtTBM01_UPD_CNT_Jsonclick ;
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
   private String sMode13 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String div_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String ZV15Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z352TBM01_CRT_DATETIME ;
   private java.util.Date Z355TBM01_UPD_DATETIME ;
   private java.util.Date A352TBM01_CRT_DATETIME ;
   private java.util.Date A355TBM01_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n608TBM01_SYS_VALUE ;
   private boolean n609TBM01_NOTE ;
   private boolean n351TBM01_DEL_FLG ;
   private boolean n352TBM01_CRT_DATETIME ;
   private boolean n353TBM01_CRT_USER_ID ;
   private boolean n354TBM01_CRT_PROG_NM ;
   private boolean n355TBM01_UPD_DATETIME ;
   private boolean n356TBM01_UPD_USER_ID ;
   private boolean n357TBM01_UPD_PROG_NM ;
   private boolean n358TBM01_UPD_CNT ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z58TBM01_SYS_ID ;
   private String Z353TBM01_CRT_USER_ID ;
   private String Z356TBM01_UPD_USER_ID ;
   private String Z608TBM01_SYS_VALUE ;
   private String Z609TBM01_NOTE ;
   private String Z351TBM01_DEL_FLG ;
   private String Z354TBM01_CRT_PROG_NM ;
   private String Z357TBM01_UPD_PROG_NM ;
   private String A58TBM01_SYS_ID ;
   private String A608TBM01_SYS_VALUE ;
   private String A609TBM01_NOTE ;
   private String A351TBM01_DEL_FLG ;
   private String A353TBM01_CRT_USER_ID ;
   private String A354TBM01_CRT_PROG_NM ;
   private String A356TBM01_UPD_USER_ID ;
   private String A357TBM01_UPD_PROG_NM ;
   private String AV9C_TAM02_APP_ID ;
   private String AV11W_ERRCD ;
   private String AV13W_MSG ;
   private String AV12W_KNGN_FLG ;
   private String i351TBM01_DEL_FLG ;
   private String i354TBM01_CRT_PROG_NM ;
   private String i357TBM01_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice radTBM01_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private String[] T000E4_A58TBM01_SYS_ID ;
   private java.util.Date[] T000E4_A352TBM01_CRT_DATETIME ;
   private boolean[] T000E4_n352TBM01_CRT_DATETIME ;
   private String[] T000E4_A353TBM01_CRT_USER_ID ;
   private boolean[] T000E4_n353TBM01_CRT_USER_ID ;
   private java.util.Date[] T000E4_A355TBM01_UPD_DATETIME ;
   private boolean[] T000E4_n355TBM01_UPD_DATETIME ;
   private String[] T000E4_A356TBM01_UPD_USER_ID ;
   private boolean[] T000E4_n356TBM01_UPD_USER_ID ;
   private long[] T000E4_A358TBM01_UPD_CNT ;
   private boolean[] T000E4_n358TBM01_UPD_CNT ;
   private String[] T000E4_A608TBM01_SYS_VALUE ;
   private boolean[] T000E4_n608TBM01_SYS_VALUE ;
   private String[] T000E4_A609TBM01_NOTE ;
   private boolean[] T000E4_n609TBM01_NOTE ;
   private String[] T000E4_A351TBM01_DEL_FLG ;
   private boolean[] T000E4_n351TBM01_DEL_FLG ;
   private String[] T000E4_A354TBM01_CRT_PROG_NM ;
   private boolean[] T000E4_n354TBM01_CRT_PROG_NM ;
   private String[] T000E4_A357TBM01_UPD_PROG_NM ;
   private boolean[] T000E4_n357TBM01_UPD_PROG_NM ;
   private String[] T000E5_A58TBM01_SYS_ID ;
   private String[] T000E3_A58TBM01_SYS_ID ;
   private java.util.Date[] T000E3_A352TBM01_CRT_DATETIME ;
   private boolean[] T000E3_n352TBM01_CRT_DATETIME ;
   private String[] T000E3_A353TBM01_CRT_USER_ID ;
   private boolean[] T000E3_n353TBM01_CRT_USER_ID ;
   private java.util.Date[] T000E3_A355TBM01_UPD_DATETIME ;
   private boolean[] T000E3_n355TBM01_UPD_DATETIME ;
   private String[] T000E3_A356TBM01_UPD_USER_ID ;
   private boolean[] T000E3_n356TBM01_UPD_USER_ID ;
   private long[] T000E3_A358TBM01_UPD_CNT ;
   private boolean[] T000E3_n358TBM01_UPD_CNT ;
   private String[] T000E3_A608TBM01_SYS_VALUE ;
   private boolean[] T000E3_n608TBM01_SYS_VALUE ;
   private String[] T000E3_A609TBM01_NOTE ;
   private boolean[] T000E3_n609TBM01_NOTE ;
   private String[] T000E3_A351TBM01_DEL_FLG ;
   private boolean[] T000E3_n351TBM01_DEL_FLG ;
   private String[] T000E3_A354TBM01_CRT_PROG_NM ;
   private boolean[] T000E3_n354TBM01_CRT_PROG_NM ;
   private String[] T000E3_A357TBM01_UPD_PROG_NM ;
   private boolean[] T000E3_n357TBM01_UPD_PROG_NM ;
   private String[] T000E6_A58TBM01_SYS_ID ;
   private String[] T000E7_A58TBM01_SYS_ID ;
   private String[] T000E2_A58TBM01_SYS_ID ;
   private java.util.Date[] T000E2_A352TBM01_CRT_DATETIME ;
   private boolean[] T000E2_n352TBM01_CRT_DATETIME ;
   private String[] T000E2_A353TBM01_CRT_USER_ID ;
   private boolean[] T000E2_n353TBM01_CRT_USER_ID ;
   private java.util.Date[] T000E2_A355TBM01_UPD_DATETIME ;
   private boolean[] T000E2_n355TBM01_UPD_DATETIME ;
   private String[] T000E2_A356TBM01_UPD_USER_ID ;
   private boolean[] T000E2_n356TBM01_UPD_USER_ID ;
   private long[] T000E2_A358TBM01_UPD_CNT ;
   private boolean[] T000E2_n358TBM01_UPD_CNT ;
   private String[] T000E2_A608TBM01_SYS_VALUE ;
   private boolean[] T000E2_n608TBM01_SYS_VALUE ;
   private String[] T000E2_A609TBM01_NOTE ;
   private boolean[] T000E2_n609TBM01_NOTE ;
   private String[] T000E2_A351TBM01_DEL_FLG ;
   private boolean[] T000E2_n351TBM01_DEL_FLG ;
   private String[] T000E2_A354TBM01_CRT_PROG_NM ;
   private boolean[] T000E2_n354TBM01_CRT_PROG_NM ;
   private String[] T000E2_A357TBM01_UPD_PROG_NM ;
   private boolean[] T000E2_n357TBM01_UPD_PROG_NM ;
   private String[] T000E11_A58TBM01_SYS_ID ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class tbm01_system__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000E2", "SELECT `TBM01_SYS_ID`, `TBM01_CRT_DATETIME`, `TBM01_CRT_USER_ID`, `TBM01_UPD_DATETIME`, `TBM01_UPD_USER_ID`, `TBM01_UPD_CNT`, `TBM01_SYS_VALUE`, `TBM01_NOTE`, `TBM01_DEL_FLG`, `TBM01_CRT_PROG_NM`, `TBM01_UPD_PROG_NM` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000E3", "SELECT `TBM01_SYS_ID`, `TBM01_CRT_DATETIME`, `TBM01_CRT_USER_ID`, `TBM01_UPD_DATETIME`, `TBM01_UPD_USER_ID`, `TBM01_UPD_CNT`, `TBM01_SYS_VALUE`, `TBM01_NOTE`, `TBM01_DEL_FLG`, `TBM01_CRT_PROG_NM`, `TBM01_UPD_PROG_NM` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000E4", "SELECT TM1.`TBM01_SYS_ID`, TM1.`TBM01_CRT_DATETIME`, TM1.`TBM01_CRT_USER_ID`, TM1.`TBM01_UPD_DATETIME`, TM1.`TBM01_UPD_USER_ID`, TM1.`TBM01_UPD_CNT`, TM1.`TBM01_SYS_VALUE`, TM1.`TBM01_NOTE`, TM1.`TBM01_DEL_FLG`, TM1.`TBM01_CRT_PROG_NM`, TM1.`TBM01_UPD_PROG_NM` FROM `TBM01_SYSTEM` TM1 WHERE TM1.`TBM01_SYS_ID` = ? ORDER BY TM1.`TBM01_SYS_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000E5", "SELECT `TBM01_SYS_ID` FROM `TBM01_SYSTEM` WHERE `TBM01_SYS_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000E6", "SELECT `TBM01_SYS_ID` FROM `TBM01_SYSTEM` WHERE ( `TBM01_SYS_ID` > ?) ORDER BY `TBM01_SYS_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000E7", "SELECT `TBM01_SYS_ID` FROM `TBM01_SYSTEM` WHERE ( `TBM01_SYS_ID` < ?) ORDER BY `TBM01_SYS_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000E8", "INSERT INTO `TBM01_SYSTEM`(`TBM01_SYS_ID`, `TBM01_CRT_DATETIME`, `TBM01_CRT_USER_ID`, `TBM01_UPD_DATETIME`, `TBM01_UPD_USER_ID`, `TBM01_UPD_CNT`, `TBM01_SYS_VALUE`, `TBM01_NOTE`, `TBM01_DEL_FLG`, `TBM01_CRT_PROG_NM`, `TBM01_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000E9", "UPDATE `TBM01_SYSTEM` SET `TBM01_CRT_DATETIME`=?, `TBM01_CRT_USER_ID`=?, `TBM01_UPD_DATETIME`=?, `TBM01_UPD_USER_ID`=?, `TBM01_UPD_CNT`=?, `TBM01_SYS_VALUE`=?, `TBM01_NOTE`=?, `TBM01_DEL_FLG`=?, `TBM01_CRT_PROG_NM`=?, `TBM01_UPD_PROG_NM`=?  WHERE `TBM01_SYS_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000E10", "DELETE FROM `TBM01_SYSTEM`  WHERE `TBM01_SYS_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000E11", "SELECT `TBM01_SYS_ID` FROM `TBM01_SYSTEM` ORDER BY `TBM01_SYS_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
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
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 1000);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 1000);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               stmt.setVarchar(11, (String)parms[20], 20, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
      }
   }

}

