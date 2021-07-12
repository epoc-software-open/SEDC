/*
               File: tat01_info_impl
        Description: お知らせ情報テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:35.34
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tat01_info_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action28") == 0 )
      {
         AV16Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11TAT01_INFO_NO = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
         A207TAT01_DATE_START = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
         n207TAT01_DATE_START = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
         A208TAT01_DATE_END = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
         n208TAT01_DATE_END = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
         A209TAT01_INFO = httpContext.GetNextPar( ) ;
         n209TAT01_INFO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
         A304TAT01_DEL_FLG = httpContext.GetNextPar( ) ;
         n304TAT01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
         A305TAT01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n305TAT01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A306TAT01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n306TAT01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
         A307TAT01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n307TAT01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
         A308TAT01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n308TAT01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A309TAT01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n309TAT01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
         A310TAT01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n310TAT01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
         A311TAT01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n311TAT01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_28_077( AV16Pgmname, Gx_mode, A11TAT01_INFO_NO, A207TAT01_DATE_START, A208TAT01_DATE_END, A209TAT01_INFO, A304TAT01_DEL_FLG, A305TAT01_CRT_DATETIME, A306TAT01_CRT_USER_ID, A307TAT01_CRT_PROG_NM, A308TAT01_UPD_DATETIME, A309TAT01_UPD_USER_ID, A310TAT01_UPD_PROG_NM, A311TAT01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
      {
         AV16Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11TAT01_INFO_NO = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
         A207TAT01_DATE_START = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
         n207TAT01_DATE_START = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
         A208TAT01_DATE_END = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
         n208TAT01_DATE_END = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
         A209TAT01_INFO = httpContext.GetNextPar( ) ;
         n209TAT01_INFO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
         A304TAT01_DEL_FLG = httpContext.GetNextPar( ) ;
         n304TAT01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
         A305TAT01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n305TAT01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A306TAT01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n306TAT01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
         A307TAT01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n307TAT01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
         A308TAT01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n308TAT01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A309TAT01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n309TAT01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
         A310TAT01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n310TAT01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
         A311TAT01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n311TAT01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_077( AV16Pgmname, Gx_mode, A11TAT01_INFO_NO, A207TAT01_DATE_START, A208TAT01_DATE_END, A209TAT01_INFO, A304TAT01_DEL_FLG, A305TAT01_CRT_DATETIME, A306TAT01_CRT_USER_ID, A307TAT01_CRT_PROG_NM, A308TAT01_UPD_DATETIME, A309TAT01_UPD_USER_ID, A310TAT01_UPD_PROG_NM, A311TAT01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action30") == 0 )
      {
         AV16Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11TAT01_INFO_NO = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
         A207TAT01_DATE_START = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
         n207TAT01_DATE_START = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
         A208TAT01_DATE_END = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
         n208TAT01_DATE_END = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
         A209TAT01_INFO = httpContext.GetNextPar( ) ;
         n209TAT01_INFO = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
         A304TAT01_DEL_FLG = httpContext.GetNextPar( ) ;
         n304TAT01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
         A305TAT01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n305TAT01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A306TAT01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n306TAT01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
         A307TAT01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n307TAT01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
         A308TAT01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n308TAT01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A309TAT01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n309TAT01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
         A310TAT01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n310TAT01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
         A311TAT01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n311TAT01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_077( AV16Pgmname, Gx_mode, A11TAT01_INFO_NO, A207TAT01_DATE_START, A208TAT01_DATE_END, A209TAT01_INFO, A304TAT01_DEL_FLG, A305TAT01_CRT_DATETIME, A306TAT01_CRT_USER_ID, A307TAT01_CRT_PROG_NM, A308TAT01_UPD_DATETIME, A309TAT01_UPD_USER_ID, A310TAT01_UPD_PROG_NM, A311TAT01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"TAT01_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asatat01_crt_user_id077( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"TAT01_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asatat01_upd_user_id077( Gx_mode) ;
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
      radTAT01_DEL_FLG.setName( "TAT01_DEL_FLG" );
      radTAT01_DEL_FLG.setWebtags( "" );
      radTAT01_DEL_FLG.addItem("0", "利用可能", (short)(0));
      radTAT01_DEL_FLG.addItem("1", "利用不可", (short)(0));
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "お知らせ情報テーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tat01_info_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tat01_info_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tat01_info_impl.class ));
   }

   public tat01_info_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radTAT01_DEL_FLG = new HTMLChoice();
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
         wb_table1_2_077( true) ;
      }
      return  ;
   }

   public void wb_table1_2_077e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm077( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_077( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_077( true) ;
      }
      return  ;
   }

   public void wb_table2_5_077e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "お知らせ情報テーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TAT01_INFO.htm");
         wb_table3_28_077( true) ;
      }
      return  ;
   }

   public void wb_table3_28_077e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_077e( true) ;
      }
      else
      {
         wb_table1_2_077e( false) ;
      }
   }

   public void wb_table3_28_077( boolean wbgen )
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
         wb_table4_34_077( true) ;
      }
      return  ;
   }

   public void wb_table4_34_077e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_113_077( true) ;
      }
      return  ;
   }

   public void wb_table5_113_077e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_077e( true) ;
      }
      else
      {
         wb_table3_28_077e( false) ;
      }
   }

   public void wb_table5_113_077( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", "", "TextBlockBtn060", 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_113_077e( true) ;
      }
      else
      {
         wb_table5_113_077e( false) ;
      }
   }

   public void wb_table4_34_077( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:130px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_info_no_Internalname, "お知らせ情報番号", "", "", lblTextblocktat01_info_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_INFO_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A11TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")), ((edtTAT01_INFO_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11TAT01_INFO_NO), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A11TAT01_INFO_NO), "ZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_INFO_NO_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAT01_INFO_NO_Visible, edtTAT01_INFO_NO_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage20_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_info_kbn_Internalname, "お知らせ区分", "", "", lblTextblocktat01_info_kbn_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_45_077( true) ;
      }
      return  ;
   }

   public void wb_table6_45_077e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage23_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage23_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_date_start_Internalname, "公開開始日", "", "", lblTextblocktat01_date_start_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAT01_DATE_START_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_DATE_START_Internalname, localUtil.format(A207TAT01_DATE_START, "9999/99/99"), localUtil.format( A207TAT01_DATE_START, "9999/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',0,24,'jap',false,0);"+";gx.evt.onblur(57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_DATE_START_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAT01_DATE_START_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD", "right", "HLP_TAT01_INFO.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAT01_DATE_START_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAT01_DATE_START_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage21_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage21_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_date_end_Internalname, "公開終了日", "", "", lblTextblocktat01_date_end_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAT01_DATE_END_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_DATE_END_Internalname, localUtil.format(A208TAT01_DATE_END, "9999/99/99"), localUtil.format( A208TAT01_DATE_END, "9999/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',0,24,'jap',false,0);"+";gx.evt.onblur(63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_DATE_END_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAT01_DATE_END_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD", "right", "HLP_TAT01_INFO.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAT01_DATE_END_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAT01_DATE_END_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage22_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage22_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_info_Internalname, "情報内容", "", "", lblTextblocktat01_info_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         ClassString = "AttributeImeOn" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTAT01_INFO_Internalname, GXutil.rtrim( A209TAT01_INFO), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", (short)(0), 1, edtTAT01_INFO_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, "", "", (byte)(-1), true, "", "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktat01_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAT01_DEL_FLG, radTAT01_DEL_FLG.getInternalname(), GXutil.rtrim( A304TAT01_DEL_FLG), "", 1, radTAT01_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, "", 0, radTAT01_DEL_FLG.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktat01_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAT01_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_CRT_DATETIME_Internalname, localUtil.format(A305TAT01_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A305TAT01_CRT_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_CRT_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAT01_CRT_DATETIME_Visible, edtTAT01_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAT01_INFO.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAT01_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAT01_CRT_DATETIME_Visible==0)||(edtTAT01_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktat01_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_CRT_USER_ID_Internalname, GXutil.rtrim( A306TAT01_CRT_USER_ID), GXutil.rtrim( localUtil.format( A306TAT01_CRT_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_CRT_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAT01_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktat01_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_CRT_PROG_NM_Internalname, GXutil.rtrim( A307TAT01_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A307TAT01_CRT_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_CRT_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAT01_CRT_PROG_NM_Visible, edtTAT01_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktat01_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAT01_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_UPD_DATETIME_Internalname, localUtil.format(A308TAT01_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A308TAT01_UPD_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_UPD_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAT01_UPD_DATETIME_Visible, edtTAT01_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAT01_INFO.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAT01_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAT01_UPD_DATETIME_Visible==0)||(edtTAT01_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktat01_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_UPD_USER_ID_Internalname, GXutil.rtrim( A309TAT01_UPD_USER_ID), GXutil.rtrim( localUtil.format( A309TAT01_UPD_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_UPD_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAT01_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktat01_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_UPD_PROG_NM_Internalname, GXutil.rtrim( A310TAT01_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A310TAT01_UPD_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_UPD_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAT01_UPD_PROG_NM_Visible, edtTAT01_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAT01_INFO.htm");
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
         wb_table4_34_077e( true) ;
      }
      else
      {
         wb_table4_34_077e( false) ;
      }
   }

   public void wb_table6_45_077( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAT01_INFO_KBN_Internalname, GXutil.rtrim( A880TAT01_INFO_KBN), GXutil.rtrim( localUtil.format( A880TAT01_INFO_KBN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAT01_INFO_KBN_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAT01_INFO_KBN_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:10px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktat01_info_kbn2_Internalname, "（1:タブレット向け 2:管理者向け 9:両方）", "", "", lblTextblocktat01_info_kbn2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAT01_INFO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_45_077e( true) ;
      }
      else
      {
         wb_table6_45_077e( false) ;
      }
   }

   public void wb_table2_5_077( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SELECT\\'."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAT01_INFO.htm");
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
         wb_table2_5_077e( true) ;
      }
      else
      {
         wb_table2_5_077e( false) ;
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
      /* Execute user event: e11072 */
      e11072 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A11TAT01_INFO_NO = (int)(localUtil.ctol( httpContext.cgiGet( edtTAT01_INFO_NO_Internalname), ".", ",")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
            A880TAT01_INFO_KBN = httpContext.cgiGet( edtTAT01_INFO_KBN_Internalname) ;
            n880TAT01_INFO_KBN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A880TAT01_INFO_KBN", A880TAT01_INFO_KBN);
            n880TAT01_INFO_KBN = ((GXutil.strcmp("", A880TAT01_INFO_KBN)==0) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtTAT01_DATE_START_Internalname), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "TAT01_DATE_START");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAT01_DATE_START_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A207TAT01_DATE_START = GXutil.nullDate() ;
               n207TAT01_DATE_START = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
            }
            else
            {
               A207TAT01_DATE_START = localUtil.ctod( httpContext.cgiGet( edtTAT01_DATE_START_Internalname), 0) ;
               n207TAT01_DATE_START = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
            }
            n207TAT01_DATE_START = (GXutil.nullDate().equals(A207TAT01_DATE_START) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtTAT01_DATE_END_Internalname), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "TAT01_DATE_END");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAT01_DATE_END_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A208TAT01_DATE_END = GXutil.nullDate() ;
               n208TAT01_DATE_END = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
            }
            else
            {
               A208TAT01_DATE_END = localUtil.ctod( httpContext.cgiGet( edtTAT01_DATE_END_Internalname), 0) ;
               n208TAT01_DATE_END = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
            }
            n208TAT01_DATE_END = (GXutil.nullDate().equals(A208TAT01_DATE_END) ? true : false) ;
            A209TAT01_INFO = httpContext.cgiGet( edtTAT01_INFO_Internalname) ;
            n209TAT01_INFO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
            n209TAT01_INFO = ((GXutil.strcmp("", A209TAT01_INFO)==0) ? true : false) ;
            A304TAT01_DEL_FLG = httpContext.cgiGet( radTAT01_DEL_FLG.getInternalname()) ;
            n304TAT01_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
            n304TAT01_DEL_FLG = ((GXutil.strcmp("", A304TAT01_DEL_FLG)==0) ? true : false) ;
            A305TAT01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAT01_CRT_DATETIME_Internalname)) ;
            n305TAT01_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A306TAT01_CRT_USER_ID = httpContext.cgiGet( edtTAT01_CRT_USER_ID_Internalname) ;
            n306TAT01_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
            A307TAT01_CRT_PROG_NM = httpContext.cgiGet( edtTAT01_CRT_PROG_NM_Internalname) ;
            n307TAT01_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
            A308TAT01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAT01_UPD_DATETIME_Internalname)) ;
            n308TAT01_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A309TAT01_UPD_USER_ID = httpContext.cgiGet( edtTAT01_UPD_USER_ID_Internalname) ;
            n309TAT01_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
            A310TAT01_UPD_PROG_NM = httpContext.cgiGet( edtTAT01_UPD_PROG_NM_Internalname) ;
            n310TAT01_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
            /* Read saved values. */
            Z11TAT01_INFO_NO = (int)(localUtil.ctol( httpContext.cgiGet( "Z11TAT01_INFO_NO"), ".", ",")) ;
            Z305TAT01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z305TAT01_CRT_DATETIME"), 0) ;
            n305TAT01_CRT_DATETIME = (GXutil.nullDate().equals(A305TAT01_CRT_DATETIME) ? true : false) ;
            Z306TAT01_CRT_USER_ID = httpContext.cgiGet( "Z306TAT01_CRT_USER_ID") ;
            n306TAT01_CRT_USER_ID = ((GXutil.strcmp("", A306TAT01_CRT_USER_ID)==0) ? true : false) ;
            Z308TAT01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z308TAT01_UPD_DATETIME"), 0) ;
            n308TAT01_UPD_DATETIME = (GXutil.nullDate().equals(A308TAT01_UPD_DATETIME) ? true : false) ;
            Z309TAT01_UPD_USER_ID = httpContext.cgiGet( "Z309TAT01_UPD_USER_ID") ;
            n309TAT01_UPD_USER_ID = ((GXutil.strcmp("", A309TAT01_UPD_USER_ID)==0) ? true : false) ;
            Z311TAT01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z311TAT01_UPD_CNT"), ".", ",") ;
            n311TAT01_UPD_CNT = ((0==A311TAT01_UPD_CNT) ? true : false) ;
            Z880TAT01_INFO_KBN = httpContext.cgiGet( "Z880TAT01_INFO_KBN") ;
            n880TAT01_INFO_KBN = ((GXutil.strcmp("", A880TAT01_INFO_KBN)==0) ? true : false) ;
            Z207TAT01_DATE_START = localUtil.ctod( httpContext.cgiGet( "Z207TAT01_DATE_START"), 0) ;
            n207TAT01_DATE_START = (GXutil.nullDate().equals(A207TAT01_DATE_START) ? true : false) ;
            Z208TAT01_DATE_END = localUtil.ctod( httpContext.cgiGet( "Z208TAT01_DATE_END"), 0) ;
            n208TAT01_DATE_END = (GXutil.nullDate().equals(A208TAT01_DATE_END) ? true : false) ;
            Z209TAT01_INFO = httpContext.cgiGet( "Z209TAT01_INFO") ;
            n209TAT01_INFO = ((GXutil.strcmp("", A209TAT01_INFO)==0) ? true : false) ;
            Z304TAT01_DEL_FLG = httpContext.cgiGet( "Z304TAT01_DEL_FLG") ;
            n304TAT01_DEL_FLG = ((GXutil.strcmp("", A304TAT01_DEL_FLG)==0) ? true : false) ;
            Z307TAT01_CRT_PROG_NM = httpContext.cgiGet( "Z307TAT01_CRT_PROG_NM") ;
            n307TAT01_CRT_PROG_NM = ((GXutil.strcmp("", A307TAT01_CRT_PROG_NM)==0) ? true : false) ;
            Z310TAT01_UPD_PROG_NM = httpContext.cgiGet( "Z310TAT01_UPD_PROG_NM") ;
            n310TAT01_UPD_PROG_NM = ((GXutil.strcmp("", A310TAT01_UPD_PROG_NM)==0) ? true : false) ;
            A311TAT01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z311TAT01_UPD_CNT"), ".", ",") ;
            n311TAT01_UPD_CNT = false ;
            n311TAT01_UPD_CNT = ((0==A311TAT01_UPD_CNT) ? true : false) ;
            O311TAT01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O311TAT01_UPD_CNT"), ".", ",") ;
            n311TAT01_UPD_CNT = ((0==A311TAT01_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A311TAT01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "TAT01_UPD_CNT"), ".", ",") ;
            n311TAT01_UPD_CNT = ((0==A311TAT01_UPD_CNT) ? true : false) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ".", ",")) ;
            AV16Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A11TAT01_INFO_NO = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
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
                     /* Execute user event: e11072 */
                     e11072 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_SELECT'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12072 */
                     e12072 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e13072 */
                     e13072 ();
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
            initAll077( ) ;
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
      disableAttributes077( ) ;
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

   public void confirm_070( )
   {
      beforeValidate077( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls077( ) ;
         }
         else
         {
            checkExtendedTable077( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors077( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
      if ( AnyError == 0 )
      {
         confirmValues070( ) ;
      }
   }

   public void resetCaption070( )
   {
   }

   public void e11072( )
   {
      /* Start Routine */
      AV7C_TAM02_APP_ID = "TAT01" ;
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV16Pgmname, "INFO", "画面起動") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
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
      GXt_char1 = AV14W_MSG ;
      GXv_char2[0] = GXt_char1 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AG00005", "", "", "", "", "", GXv_char2) ;
      tat01_info_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14W_MSG = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14W_MSG", AV14W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV14W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e12072( )
   {
      /* 'BTN_SELECT' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "tat01_sel"+GXutil.URLEncode(GXutil.ltrim(GXutil.str(A11TAT01_INFO_NO,6,0))) ;
      httpContext.popup(formatLink("tat01_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"A11TAT01_INFO_NO"});
   }

   public void e13072( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tat01_info")  ;
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
      tat01_info_impl.this.AV9W_ERRCD = GXv_char2[0] ;
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
      tat01_info_impl.this.AV10W_KNGN_FLG = GXv_char2[0] ;
      tat01_info_impl.this.AV9W_ERRCD = GXv_char4[0] ;
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV16Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm077( int GX_JID )
   {
      if ( ( GX_JID == 31 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z305TAT01_CRT_DATETIME = T00073_A305TAT01_CRT_DATETIME[0] ;
            Z306TAT01_CRT_USER_ID = T00073_A306TAT01_CRT_USER_ID[0] ;
            Z308TAT01_UPD_DATETIME = T00073_A308TAT01_UPD_DATETIME[0] ;
            Z309TAT01_UPD_USER_ID = T00073_A309TAT01_UPD_USER_ID[0] ;
            Z311TAT01_UPD_CNT = T00073_A311TAT01_UPD_CNT[0] ;
            Z880TAT01_INFO_KBN = T00073_A880TAT01_INFO_KBN[0] ;
            Z207TAT01_DATE_START = T00073_A207TAT01_DATE_START[0] ;
            Z208TAT01_DATE_END = T00073_A208TAT01_DATE_END[0] ;
            Z209TAT01_INFO = T00073_A209TAT01_INFO[0] ;
            Z304TAT01_DEL_FLG = T00073_A304TAT01_DEL_FLG[0] ;
            Z307TAT01_CRT_PROG_NM = T00073_A307TAT01_CRT_PROG_NM[0] ;
            Z310TAT01_UPD_PROG_NM = T00073_A310TAT01_UPD_PROG_NM[0] ;
         }
         else
         {
            Z305TAT01_CRT_DATETIME = A305TAT01_CRT_DATETIME ;
            Z306TAT01_CRT_USER_ID = A306TAT01_CRT_USER_ID ;
            Z308TAT01_UPD_DATETIME = A308TAT01_UPD_DATETIME ;
            Z309TAT01_UPD_USER_ID = A309TAT01_UPD_USER_ID ;
            Z311TAT01_UPD_CNT = A311TAT01_UPD_CNT ;
            Z880TAT01_INFO_KBN = A880TAT01_INFO_KBN ;
            Z207TAT01_DATE_START = A207TAT01_DATE_START ;
            Z208TAT01_DATE_END = A208TAT01_DATE_END ;
            Z209TAT01_INFO = A209TAT01_INFO ;
            Z304TAT01_DEL_FLG = A304TAT01_DEL_FLG ;
            Z307TAT01_CRT_PROG_NM = A307TAT01_CRT_PROG_NM ;
            Z310TAT01_UPD_PROG_NM = A310TAT01_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -31 )
      {
         Z11TAT01_INFO_NO = A11TAT01_INFO_NO ;
         Z305TAT01_CRT_DATETIME = A305TAT01_CRT_DATETIME ;
         Z306TAT01_CRT_USER_ID = A306TAT01_CRT_USER_ID ;
         Z308TAT01_UPD_DATETIME = A308TAT01_UPD_DATETIME ;
         Z309TAT01_UPD_USER_ID = A309TAT01_UPD_USER_ID ;
         Z311TAT01_UPD_CNT = A311TAT01_UPD_CNT ;
         Z880TAT01_INFO_KBN = A880TAT01_INFO_KBN ;
         Z207TAT01_DATE_START = A207TAT01_DATE_START ;
         Z208TAT01_DATE_END = A208TAT01_DATE_END ;
         Z209TAT01_INFO = A209TAT01_INFO ;
         Z304TAT01_DEL_FLG = A304TAT01_DEL_FLG ;
         Z307TAT01_CRT_PROG_NM = A307TAT01_CRT_PROG_NM ;
         Z310TAT01_UPD_PROG_NM = A310TAT01_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTAT01_INFO_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_INFO_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_INFO_NO_Enabled, 5, 0)));
      edtTAT01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_CRT_DATETIME_Enabled, 5, 0)));
      edtTAT01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_CRT_USER_ID_Enabled, 5, 0)));
      edtTAT01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAT01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_UPD_DATETIME_Enabled, 5, 0)));
      edtTAT01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_UPD_USER_ID_Enabled, 5, 0)));
      edtTAT01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_UPD_PROG_NM_Enabled, 5, 0)));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTAT01_INFO_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_INFO_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_INFO_NO_Enabled, 5, 0)));
      edtTAT01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_CRT_DATETIME_Enabled, 5, 0)));
      edtTAT01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_CRT_USER_ID_Enabled, 5, 0)));
      edtTAT01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAT01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_UPD_DATETIME_Enabled, 5, 0)));
      edtTAT01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_UPD_USER_ID_Enabled, 5, 0)));
      edtTAT01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAT01_INFO_NO_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAT01_INFO_NO_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAT01_INFO_NO_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAT01_CRT_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAT01_CRT_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAT01_CRT_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAT01_CRT_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAT01_UPD_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAT01_UPD_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAT01_UPD_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAT01_UPD_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A304TAT01_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A304TAT01_DEL_FLG = "0" ;
         n304TAT01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A307TAT01_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A307TAT01_CRT_PROG_NM = AV16Pgmname ;
         n307TAT01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A310TAT01_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A310TAT01_UPD_PROG_NM = AV16Pgmname ;
         n310TAT01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
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

   public void load077( )
   {
      /* Using cursor T00074 */
      pr_default.execute(2, new Object[] {new Integer(A11TAT01_INFO_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A305TAT01_CRT_DATETIME = T00074_A305TAT01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n305TAT01_CRT_DATETIME = T00074_n305TAT01_CRT_DATETIME[0] ;
         A306TAT01_CRT_USER_ID = T00074_A306TAT01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
         n306TAT01_CRT_USER_ID = T00074_n306TAT01_CRT_USER_ID[0] ;
         A308TAT01_UPD_DATETIME = T00074_A308TAT01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n308TAT01_UPD_DATETIME = T00074_n308TAT01_UPD_DATETIME[0] ;
         A309TAT01_UPD_USER_ID = T00074_A309TAT01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
         n309TAT01_UPD_USER_ID = T00074_n309TAT01_UPD_USER_ID[0] ;
         A311TAT01_UPD_CNT = T00074_A311TAT01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
         n311TAT01_UPD_CNT = T00074_n311TAT01_UPD_CNT[0] ;
         A880TAT01_INFO_KBN = T00074_A880TAT01_INFO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A880TAT01_INFO_KBN", A880TAT01_INFO_KBN);
         n880TAT01_INFO_KBN = T00074_n880TAT01_INFO_KBN[0] ;
         A207TAT01_DATE_START = T00074_A207TAT01_DATE_START[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
         n207TAT01_DATE_START = T00074_n207TAT01_DATE_START[0] ;
         A208TAT01_DATE_END = T00074_A208TAT01_DATE_END[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
         n208TAT01_DATE_END = T00074_n208TAT01_DATE_END[0] ;
         A209TAT01_INFO = T00074_A209TAT01_INFO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
         n209TAT01_INFO = T00074_n209TAT01_INFO[0] ;
         A304TAT01_DEL_FLG = T00074_A304TAT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
         n304TAT01_DEL_FLG = T00074_n304TAT01_DEL_FLG[0] ;
         A307TAT01_CRT_PROG_NM = T00074_A307TAT01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
         n307TAT01_CRT_PROG_NM = T00074_n307TAT01_CRT_PROG_NM[0] ;
         A310TAT01_UPD_PROG_NM = T00074_A310TAT01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
         n310TAT01_UPD_PROG_NM = T00074_n310TAT01_UPD_PROG_NM[0] ;
         zm077( -31) ;
      }
      pr_default.close(2);
      onLoadActions077( ) ;
   }

   public void onLoadActions077( )
   {
      AV16Pgmname = "TAT01_INFO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
   }

   public void checkExtendedTable077( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV16Pgmname = "TAT01_INFO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      if ( ! ( GXutil.nullDate().equals(A207TAT01_DATE_START) || (( A207TAT01_DATE_START.after( localUtil.ymdtod( 1000, 1, 1) ) ) || ( A207TAT01_DATE_START.equals( localUtil.ymdtod( 1000, 1, 1) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　公開開始日 は範囲外です", "OutOfRange", 1, "TAT01_DATE_START");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAT01_DATE_START_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A208TAT01_DATE_END) || (( A208TAT01_DATE_END.after( localUtil.ymdtod( 1000, 1, 1) ) ) || ( A208TAT01_DATE_END.equals( localUtil.ymdtod( 1000, 1, 1) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　公開終了日 は範囲外です", "OutOfRange", 1, "TAT01_DATE_END");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAT01_DATE_END_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors077( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey077( )
   {
      /* Using cursor T00075 */
      pr_default.execute(3, new Object[] {new Integer(A11TAT01_INFO_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00073 */
      pr_default.execute(1, new Object[] {new Integer(A11TAT01_INFO_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm077( 31) ;
         RcdFound7 = (short)(1) ;
         A11TAT01_INFO_NO = T00073_A11TAT01_INFO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
         A305TAT01_CRT_DATETIME = T00073_A305TAT01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n305TAT01_CRT_DATETIME = T00073_n305TAT01_CRT_DATETIME[0] ;
         A306TAT01_CRT_USER_ID = T00073_A306TAT01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
         n306TAT01_CRT_USER_ID = T00073_n306TAT01_CRT_USER_ID[0] ;
         A308TAT01_UPD_DATETIME = T00073_A308TAT01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n308TAT01_UPD_DATETIME = T00073_n308TAT01_UPD_DATETIME[0] ;
         A309TAT01_UPD_USER_ID = T00073_A309TAT01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
         n309TAT01_UPD_USER_ID = T00073_n309TAT01_UPD_USER_ID[0] ;
         A311TAT01_UPD_CNT = T00073_A311TAT01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
         n311TAT01_UPD_CNT = T00073_n311TAT01_UPD_CNT[0] ;
         A880TAT01_INFO_KBN = T00073_A880TAT01_INFO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A880TAT01_INFO_KBN", A880TAT01_INFO_KBN);
         n880TAT01_INFO_KBN = T00073_n880TAT01_INFO_KBN[0] ;
         A207TAT01_DATE_START = T00073_A207TAT01_DATE_START[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
         n207TAT01_DATE_START = T00073_n207TAT01_DATE_START[0] ;
         A208TAT01_DATE_END = T00073_A208TAT01_DATE_END[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
         n208TAT01_DATE_END = T00073_n208TAT01_DATE_END[0] ;
         A209TAT01_INFO = T00073_A209TAT01_INFO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
         n209TAT01_INFO = T00073_n209TAT01_INFO[0] ;
         A304TAT01_DEL_FLG = T00073_A304TAT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
         n304TAT01_DEL_FLG = T00073_n304TAT01_DEL_FLG[0] ;
         A307TAT01_CRT_PROG_NM = T00073_A307TAT01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
         n307TAT01_CRT_PROG_NM = T00073_n307TAT01_CRT_PROG_NM[0] ;
         A310TAT01_UPD_PROG_NM = T00073_A310TAT01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
         n310TAT01_UPD_PROG_NM = T00073_n310TAT01_UPD_PROG_NM[0] ;
         O311TAT01_UPD_CNT = A311TAT01_UPD_CNT ;
         n311TAT01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
         Z11TAT01_INFO_NO = A11TAT01_INFO_NO ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load077( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey077( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey077( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey077( ) ;
      if ( RcdFound7 == 0 )
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
      RcdFound7 = (short)(0) ;
      /* Using cursor T00076 */
      pr_default.execute(4, new Object[] {new Integer(A11TAT01_INFO_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00076_A11TAT01_INFO_NO[0] < A11TAT01_INFO_NO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00076_A11TAT01_INFO_NO[0] > A11TAT01_INFO_NO ) ) )
         {
            A11TAT01_INFO_NO = T00076_A11TAT01_INFO_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T00077 */
      pr_default.execute(5, new Object[] {new Integer(A11TAT01_INFO_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00077_A11TAT01_INFO_NO[0] > A11TAT01_INFO_NO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00077_A11TAT01_INFO_NO[0] < A11TAT01_INFO_NO ) ) )
         {
            A11TAT01_INFO_NO = T00077_A11TAT01_INFO_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey077( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert077( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( A11TAT01_INFO_NO != Z11TAT01_INFO_NO )
            {
               A11TAT01_INFO_NO = Z11TAT01_INFO_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAT01_INFO_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAT01_INFO_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update077( ) ;
               GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A11TAT01_INFO_NO != Z11TAT01_INFO_NO )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert077( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAT01_INFO_NO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTAT01_INFO_NO_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert077( ) ;
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
      if ( A11TAT01_INFO_NO != Z11TAT01_INFO_NO )
      {
         A11TAT01_INFO_NO = Z11TAT01_INFO_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAT01_INFO_NO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAT01_INFO_NO_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
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
      getKey077( ) ;
      if ( RcdFound7 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAT01_INFO_NO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAT01_INFO_NO_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A11TAT01_INFO_NO != Z11TAT01_INFO_NO )
         {
            A11TAT01_INFO_NO = Z11TAT01_INFO_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "TAT01_INFO_NO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAT01_INFO_NO_Internalname ;
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
         if ( A11TAT01_INFO_NO != Z11TAT01_INFO_NO )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAT01_INFO_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAT01_INFO_NO_Internalname ;
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tat01_info");
      GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_070( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAT01_INFO_NO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAT01_INFO_NO_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart077( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd077( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
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
      scanStart077( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound7 != 0 )
         {
            scanNext077( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd077( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency077( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00072 */
         pr_default.execute(0, new Object[] {new Integer(A11TAT01_INFO_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAT01_INFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z305TAT01_CRT_DATETIME.equals( T00072_A305TAT01_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z306TAT01_CRT_USER_ID, T00072_A306TAT01_CRT_USER_ID[0]) != 0 ) || !( Z308TAT01_UPD_DATETIME.equals( T00072_A308TAT01_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z309TAT01_UPD_USER_ID, T00072_A309TAT01_UPD_USER_ID[0]) != 0 ) || ( Z311TAT01_UPD_CNT != T00072_A311TAT01_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z880TAT01_INFO_KBN, T00072_A880TAT01_INFO_KBN[0]) != 0 ) || !( Z207TAT01_DATE_START.equals( T00072_A207TAT01_DATE_START[0] ) ) || !( Z208TAT01_DATE_END.equals( T00072_A208TAT01_DATE_END[0] ) ) || ( GXutil.strcmp(Z209TAT01_INFO, T00072_A209TAT01_INFO[0]) != 0 ) || ( GXutil.strcmp(Z304TAT01_DEL_FLG, T00072_A304TAT01_DEL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z307TAT01_CRT_PROG_NM, T00072_A307TAT01_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z310TAT01_UPD_PROG_NM, T00072_A310TAT01_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAT01_INFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert077( )
   {
      beforeValidate077( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable077( ) ;
      }
      if ( AnyError == 0 )
      {
         zm077( 0) ;
         checkOptimisticConcurrency077( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm077( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert077( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00078 */
                  pr_default.execute(6, new Object[] {new Boolean(n305TAT01_CRT_DATETIME), A305TAT01_CRT_DATETIME, new Boolean(n306TAT01_CRT_USER_ID), A306TAT01_CRT_USER_ID, new Boolean(n308TAT01_UPD_DATETIME), A308TAT01_UPD_DATETIME, new Boolean(n309TAT01_UPD_USER_ID), A309TAT01_UPD_USER_ID, new Boolean(n311TAT01_UPD_CNT), new Long(A311TAT01_UPD_CNT), new Boolean(n880TAT01_INFO_KBN), A880TAT01_INFO_KBN, new Boolean(n207TAT01_DATE_START), A207TAT01_DATE_START, new Boolean(n208TAT01_DATE_END), A208TAT01_DATE_END, new Boolean(n209TAT01_INFO), A209TAT01_INFO, new Boolean(n304TAT01_DEL_FLG), A304TAT01_DEL_FLG, new Boolean(n307TAT01_CRT_PROG_NM), A307TAT01_CRT_PROG_NM, new Boolean(n310TAT01_UPD_PROG_NM), A310TAT01_UPD_PROG_NM});
                  /* Retrieving last key number assigned */
                  /* Using cursor T00079 */
                  pr_default.execute(7);
                  A11TAT01_INFO_NO = T00079_A11TAT01_INFO_NO[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAT01_INFO") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tat01_pc01_datalog(remoteHandle, context).execute( AV16Pgmname, Gx_mode, A11TAT01_INFO_NO, A207TAT01_DATE_START, A208TAT01_DATE_END, A209TAT01_INFO, A304TAT01_DEL_FLG, A305TAT01_CRT_DATETIME, A306TAT01_CRT_USER_ID, A307TAT01_CRT_PROG_NM, A308TAT01_UPD_DATETIME, A309TAT01_UPD_USER_ID, A310TAT01_UPD_PROG_NM, A311TAT01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
                     httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
                     httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption070( ) ;
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
            load077( ) ;
         }
         endLevel077( ) ;
      }
      closeExtendedTableCursors077( ) ;
   }

   public void update077( )
   {
      beforeValidate077( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable077( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency077( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm077( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate077( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000710 */
                  pr_default.execute(8, new Object[] {new Boolean(n305TAT01_CRT_DATETIME), A305TAT01_CRT_DATETIME, new Boolean(n306TAT01_CRT_USER_ID), A306TAT01_CRT_USER_ID, new Boolean(n308TAT01_UPD_DATETIME), A308TAT01_UPD_DATETIME, new Boolean(n309TAT01_UPD_USER_ID), A309TAT01_UPD_USER_ID, new Boolean(n311TAT01_UPD_CNT), new Long(A311TAT01_UPD_CNT), new Boolean(n880TAT01_INFO_KBN), A880TAT01_INFO_KBN, new Boolean(n207TAT01_DATE_START), A207TAT01_DATE_START, new Boolean(n208TAT01_DATE_END), A208TAT01_DATE_END, new Boolean(n209TAT01_INFO), A209TAT01_INFO, new Boolean(n304TAT01_DEL_FLG), A304TAT01_DEL_FLG, new Boolean(n307TAT01_CRT_PROG_NM), A307TAT01_CRT_PROG_NM, new Boolean(n310TAT01_UPD_PROG_NM), A310TAT01_UPD_PROG_NM, new Integer(A11TAT01_INFO_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAT01_INFO") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAT01_INFO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate077( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tat01_pc01_datalog(remoteHandle, context).execute( AV16Pgmname, Gx_mode, A11TAT01_INFO_NO, A207TAT01_DATE_START, A208TAT01_DATE_END, A209TAT01_INFO, A304TAT01_DEL_FLG, A305TAT01_CRT_DATETIME, A306TAT01_CRT_USER_ID, A307TAT01_CRT_PROG_NM, A308TAT01_UPD_DATETIME, A309TAT01_UPD_USER_ID, A310TAT01_UPD_PROG_NM, A311TAT01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
                     httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
                     httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption070( ) ;
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
         endLevel077( ) ;
      }
      closeExtendedTableCursors077( ) ;
   }

   public void deferredUpdate077( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate077( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency077( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls077( ) ;
         afterConfirm077( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete077( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000711 */
               pr_default.execute(9, new Object[] {new Integer(A11TAT01_INFO_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAT01_INFO") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tat01_pc01_datalog(remoteHandle, context).execute( AV16Pgmname, Gx_mode, A11TAT01_INFO_NO, A207TAT01_DATE_START, A208TAT01_DATE_END, A209TAT01_INFO, A304TAT01_DEL_FLG, A305TAT01_CRT_DATETIME, A306TAT01_CRT_USER_ID, A307TAT01_CRT_PROG_NM, A308TAT01_UPD_DATETIME, A309TAT01_UPD_USER_ID, A310TAT01_UPD_PROG_NM, A311TAT01_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
                  httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
                  httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
                  httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
                  httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound7 == 0 )
                     {
                        initAll077( ) ;
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
                     resetCaption070( ) ;
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel077( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls077( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV16Pgmname = "TAT01_INFO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      }
   }

   public void endLevel077( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete077( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tat01_info");
         if ( AnyError == 0 )
         {
            confirmValues070( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tat01_info");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart077( )
   {
      /* Scan By routine */
      /* Using cursor T000712 */
      pr_default.execute(10);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A11TAT01_INFO_NO = T000712_A11TAT01_INFO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext077( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A11TAT01_INFO_NO = T000712_A11TAT01_INFO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
      }
   }

   public void scanEnd077( )
   {
      pr_default.close(10);
   }

   public void afterConfirm077( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A880TAT01_INFO_KBN)==0) )
      {
         httpContext.GX_msglist.addItem("お知らせ区分を入力してください", 1, "TAT01_INFO_KBN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( GXutil.nullDate().equals(A207TAT01_DATE_START) )
      {
         httpContext.GX_msglist.addItem("公開開始日を入力してください", 1, "TAT01_DATE_START");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAT01_DATE_START_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( GXutil.nullDate().equals(A208TAT01_DATE_END) )
      {
         httpContext.GX_msglist.addItem("公開終了日を入力してください", 1, "TAT01_DATE_END");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAT01_DATE_END_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A209TAT01_INFO)==0) )
      {
         httpContext.GX_msglist.addItem("情報内容を入力してください", 1, "TAT01_INFO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAT01_INFO_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 2000 < GXutil.byteCount( A209TAT01_INFO, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("情報内容は全角1000桁又は半角2000桁以内になるようにしてください。", 1, "TAT01_INFO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAT01_INFO_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert077( )
   {
      /* Before Insert Rules */
      A305TAT01_CRT_DATETIME = GXutil.now( ) ;
      n305TAT01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A306TAT01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tat01_info_impl.this.GXt_char1 = GXv_char4[0] ;
      A306TAT01_CRT_USER_ID = GXt_char1 ;
      n306TAT01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
      A308TAT01_UPD_DATETIME = GXutil.now( ) ;
      n308TAT01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A309TAT01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tat01_info_impl.this.GXt_char1 = GXv_char4[0] ;
      A309TAT01_UPD_USER_ID = GXt_char1 ;
      n309TAT01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
      A311TAT01_UPD_CNT = (long)(O311TAT01_UPD_CNT+1) ;
      n311TAT01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate077( )
   {
      /* Before Update Rules */
      A308TAT01_UPD_DATETIME = GXutil.now( ) ;
      n308TAT01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A309TAT01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tat01_info_impl.this.GXt_char1 = GXv_char4[0] ;
      A309TAT01_UPD_USER_ID = GXt_char1 ;
      n309TAT01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
      A311TAT01_UPD_CNT = (long)(O311TAT01_UPD_CNT+1) ;
      n311TAT01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
   }

   public void beforeDelete077( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete077( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate077( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes077( )
   {
      edtTAT01_INFO_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_INFO_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_INFO_NO_Enabled, 5, 0)));
      edtTAT01_INFO_KBN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_INFO_KBN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_INFO_KBN_Enabled, 5, 0)));
      edtTAT01_DATE_START_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_DATE_START_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_DATE_START_Enabled, 5, 0)));
      edtTAT01_DATE_END_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_DATE_END_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_DATE_END_Enabled, 5, 0)));
      edtTAT01_INFO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_INFO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_INFO_Enabled, 5, 0)));
      radTAT01_DEL_FLG.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radTAT01_DEL_FLG.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radTAT01_DEL_FLG.getEnabled(), 5, 0)));
      edtTAT01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_CRT_DATETIME_Enabled, 5, 0)));
      edtTAT01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_CRT_USER_ID_Enabled, 5, 0)));
      edtTAT01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAT01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_UPD_DATETIME_Enabled, 5, 0)));
      edtTAT01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_UPD_USER_ID_Enabled, 5, 0)));
      edtTAT01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAT01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAT01_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues070( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "お知らせ情報テーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513183684");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tat01_info") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm077( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z11TAT01_INFO_NO", GXutil.ltrim( localUtil.ntoc( Z11TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z305TAT01_CRT_DATETIME", localUtil.ttoc( Z305TAT01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z306TAT01_CRT_USER_ID", GXutil.rtrim( Z306TAT01_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z308TAT01_UPD_DATETIME", localUtil.ttoc( Z308TAT01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z309TAT01_UPD_USER_ID", GXutil.rtrim( Z309TAT01_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z311TAT01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z311TAT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z880TAT01_INFO_KBN", GXutil.rtrim( Z880TAT01_INFO_KBN));
      GxWebStd.gx_hidden_field( httpContext, "Z207TAT01_DATE_START", localUtil.dtoc( Z207TAT01_DATE_START, 0, "/"));
      GxWebStd.gx_hidden_field( httpContext, "Z208TAT01_DATE_END", localUtil.dtoc( Z208TAT01_DATE_END, 0, "/"));
      GxWebStd.gx_hidden_field( httpContext, "Z209TAT01_INFO", GXutil.rtrim( Z209TAT01_INFO));
      GxWebStd.gx_hidden_field( httpContext, "Z304TAT01_DEL_FLG", GXutil.rtrim( Z304TAT01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z307TAT01_CRT_PROG_NM", GXutil.rtrim( Z307TAT01_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z310TAT01_UPD_PROG_NM", GXutil.rtrim( Z310TAT01_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O311TAT01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O311TAT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "TAT01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A311TAT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV16Pgmname));
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
      return "TAT01_INFO" ;
   }

   public String getPgmdesc( )
   {
      return "お知らせ情報テーブル" ;
   }

   public void initializeNonKey077( )
   {
      A305TAT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n305TAT01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n305TAT01_CRT_DATETIME = (GXutil.nullDate().equals(A305TAT01_CRT_DATETIME) ? true : false) ;
      A306TAT01_CRT_USER_ID = "" ;
      n306TAT01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
      n306TAT01_CRT_USER_ID = ((GXutil.strcmp("", A306TAT01_CRT_USER_ID)==0) ? true : false) ;
      A308TAT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n308TAT01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n308TAT01_UPD_DATETIME = (GXutil.nullDate().equals(A308TAT01_UPD_DATETIME) ? true : false) ;
      A309TAT01_UPD_USER_ID = "" ;
      n309TAT01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
      n309TAT01_UPD_USER_ID = ((GXutil.strcmp("", A309TAT01_UPD_USER_ID)==0) ? true : false) ;
      A311TAT01_UPD_CNT = 0 ;
      n311TAT01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
      A880TAT01_INFO_KBN = "" ;
      n880TAT01_INFO_KBN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A880TAT01_INFO_KBN", A880TAT01_INFO_KBN);
      n880TAT01_INFO_KBN = ((GXutil.strcmp("", A880TAT01_INFO_KBN)==0) ? true : false) ;
      A207TAT01_DATE_START = GXutil.nullDate() ;
      n207TAT01_DATE_START = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
      n207TAT01_DATE_START = (GXutil.nullDate().equals(A207TAT01_DATE_START) ? true : false) ;
      A208TAT01_DATE_END = GXutil.nullDate() ;
      n208TAT01_DATE_END = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
      n208TAT01_DATE_END = (GXutil.nullDate().equals(A208TAT01_DATE_END) ? true : false) ;
      A209TAT01_INFO = "" ;
      n209TAT01_INFO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
      n209TAT01_INFO = ((GXutil.strcmp("", A209TAT01_INFO)==0) ? true : false) ;
      A304TAT01_DEL_FLG = "0" ;
      n304TAT01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
      A307TAT01_CRT_PROG_NM = AV16Pgmname ;
      n307TAT01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
      A310TAT01_UPD_PROG_NM = AV16Pgmname ;
      n310TAT01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
      O311TAT01_UPD_CNT = A311TAT01_UPD_CNT ;
      n311TAT01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
   }

   public void initAll077( )
   {
      A11TAT01_INFO_NO = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
      initializeNonKey077( ) ;
   }

   public void standaloneModalInsert( )
   {
      A304TAT01_DEL_FLG = i304TAT01_DEL_FLG ;
      n304TAT01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
      A307TAT01_CRT_PROG_NM = i307TAT01_CRT_PROG_NM ;
      n307TAT01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
      A310TAT01_UPD_PROG_NM = i310TAT01_UPD_PROG_NM ;
      n310TAT01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?1830155");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513183692");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tat01_info.js", "?202071513183692");
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
      lblTextblocktat01_info_no_Internalname = "TEXTBLOCKTAT01_INFO_NO" ;
      edtTAT01_INFO_NO_Internalname = "TAT01_INFO_NO" ;
      imgImage20_Internalname = "IMAGE20" ;
      lblTextblocktat01_info_kbn_Internalname = "TEXTBLOCKTAT01_INFO_KBN" ;
      edtTAT01_INFO_KBN_Internalname = "TAT01_INFO_KBN" ;
      lblTextblocktat01_info_kbn2_Internalname = "TEXTBLOCKTAT01_INFO_KBN2" ;
      tblTable3_Internalname = "TABLE3" ;
      imgImage23_Internalname = "IMAGE23" ;
      lblTextblocktat01_date_start_Internalname = "TEXTBLOCKTAT01_DATE_START" ;
      edtTAT01_DATE_START_Internalname = "TAT01_DATE_START" ;
      imgImage21_Internalname = "IMAGE21" ;
      lblTextblocktat01_date_end_Internalname = "TEXTBLOCKTAT01_DATE_END" ;
      edtTAT01_DATE_END_Internalname = "TAT01_DATE_END" ;
      imgImage22_Internalname = "IMAGE22" ;
      lblTextblocktat01_info_Internalname = "TEXTBLOCKTAT01_INFO" ;
      edtTAT01_INFO_Internalname = "TAT01_INFO" ;
      lblTextblocktat01_del_flg_Internalname = "TEXTBLOCKTAT01_DEL_FLG" ;
      radTAT01_DEL_FLG.setInternalname( "TAT01_DEL_FLG" );
      lblTextblocktat01_crt_datetime_Internalname = "TEXTBLOCKTAT01_CRT_DATETIME" ;
      edtTAT01_CRT_DATETIME_Internalname = "TAT01_CRT_DATETIME" ;
      lblTextblocktat01_crt_user_id_Internalname = "TEXTBLOCKTAT01_CRT_USER_ID" ;
      edtTAT01_CRT_USER_ID_Internalname = "TAT01_CRT_USER_ID" ;
      lblTextblocktat01_crt_prog_nm_Internalname = "TEXTBLOCKTAT01_CRT_PROG_NM" ;
      edtTAT01_CRT_PROG_NM_Internalname = "TAT01_CRT_PROG_NM" ;
      lblTextblocktat01_upd_datetime_Internalname = "TEXTBLOCKTAT01_UPD_DATETIME" ;
      edtTAT01_UPD_DATETIME_Internalname = "TAT01_UPD_DATETIME" ;
      lblTextblocktat01_upd_user_id_Internalname = "TEXTBLOCKTAT01_UPD_USER_ID" ;
      edtTAT01_UPD_USER_ID_Internalname = "TAT01_UPD_USER_ID" ;
      lblTextblocktat01_upd_prog_nm_Internalname = "TEXTBLOCKTAT01_UPD_PROG_NM" ;
      edtTAT01_UPD_PROG_NM_Internalname = "TAT01_UPD_PROG_NM" ;
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
      edtTAT01_INFO_KBN_Jsonclick = "" ;
      edtTAT01_INFO_KBN_Enabled = 1 ;
      edtTAT01_UPD_PROG_NM_Jsonclick = "" ;
      edtTAT01_UPD_PROG_NM_Enabled = 0 ;
      edtTAT01_UPD_PROG_NM_Visible = 1 ;
      edtTAT01_UPD_USER_ID_Jsonclick = "" ;
      edtTAT01_UPD_USER_ID_Enabled = 0 ;
      edtTAT01_UPD_DATETIME_Jsonclick = "" ;
      edtTAT01_UPD_DATETIME_Enabled = 0 ;
      edtTAT01_UPD_DATETIME_Visible = 1 ;
      edtTAT01_CRT_PROG_NM_Jsonclick = "" ;
      edtTAT01_CRT_PROG_NM_Enabled = 0 ;
      edtTAT01_CRT_PROG_NM_Visible = 1 ;
      edtTAT01_CRT_USER_ID_Jsonclick = "" ;
      edtTAT01_CRT_USER_ID_Enabled = 0 ;
      edtTAT01_CRT_DATETIME_Jsonclick = "" ;
      edtTAT01_CRT_DATETIME_Enabled = 0 ;
      edtTAT01_CRT_DATETIME_Visible = 1 ;
      radTAT01_DEL_FLG.setJsonclick( "" );
      radTAT01_DEL_FLG.setEnabled( 1 );
      edtTAT01_INFO_Enabled = 1 ;
      imgImage22_Visible = 1 ;
      edtTAT01_DATE_END_Jsonclick = "" ;
      edtTAT01_DATE_END_Enabled = 1 ;
      imgImage21_Visible = 1 ;
      edtTAT01_DATE_START_Jsonclick = "" ;
      edtTAT01_DATE_START_Enabled = 1 ;
      imgImage23_Visible = 1 ;
      imgImage20_Visible = 1 ;
      edtTAT01_INFO_NO_Jsonclick = "" ;
      edtTAT01_INFO_NO_Enabled = 0 ;
      edtTAT01_INFO_NO_Visible = 1 ;
      lblBtn_cancel_Enabled = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx9asatat01_crt_user_id077( String Gx_mode )
   {
      GXt_char1 = A306TAT01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tat01_info_impl.this.GXt_char1 = GXv_char4[0] ;
      A306TAT01_CRT_USER_ID = GXt_char1 ;
      n306TAT01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A306TAT01_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx11asatat01_upd_user_id077( String Gx_mode )
   {
      GXt_char1 = A309TAT01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tat01_info_impl.this.GXt_char1 = GXv_char4[0] ;
      A309TAT01_UPD_USER_ID = GXt_char1 ;
      n309TAT01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A309TAT01_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_28_077( String AV16Pgmname ,
                          String Gx_mode ,
                          int A11TAT01_INFO_NO ,
                          java.util.Date A207TAT01_DATE_START ,
                          java.util.Date A208TAT01_DATE_END ,
                          String A209TAT01_INFO ,
                          String A304TAT01_DEL_FLG ,
                          java.util.Date A305TAT01_CRT_DATETIME ,
                          String A306TAT01_CRT_USER_ID ,
                          String A307TAT01_CRT_PROG_NM ,
                          java.util.Date A308TAT01_UPD_DATETIME ,
                          String A309TAT01_UPD_USER_ID ,
                          String A310TAT01_UPD_PROG_NM ,
                          long A311TAT01_UPD_CNT )
   {
      new tat01_pc01_datalog(remoteHandle, context).execute( AV16Pgmname, Gx_mode, A11TAT01_INFO_NO, A207TAT01_DATE_START, A208TAT01_DATE_END, A209TAT01_INFO, A304TAT01_DEL_FLG, A305TAT01_CRT_DATETIME, A306TAT01_CRT_USER_ID, A307TAT01_CRT_PROG_NM, A308TAT01_UPD_DATETIME, A309TAT01_UPD_USER_ID, A310TAT01_UPD_PROG_NM, A311TAT01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
      httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
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

   public void xc_29_077( String AV16Pgmname ,
                          String Gx_mode ,
                          int A11TAT01_INFO_NO ,
                          java.util.Date A207TAT01_DATE_START ,
                          java.util.Date A208TAT01_DATE_END ,
                          String A209TAT01_INFO ,
                          String A304TAT01_DEL_FLG ,
                          java.util.Date A305TAT01_CRT_DATETIME ,
                          String A306TAT01_CRT_USER_ID ,
                          String A307TAT01_CRT_PROG_NM ,
                          java.util.Date A308TAT01_UPD_DATETIME ,
                          String A309TAT01_UPD_USER_ID ,
                          String A310TAT01_UPD_PROG_NM ,
                          long A311TAT01_UPD_CNT )
   {
      new tat01_pc01_datalog(remoteHandle, context).execute( AV16Pgmname, Gx_mode, A11TAT01_INFO_NO, A207TAT01_DATE_START, A208TAT01_DATE_END, A209TAT01_INFO, A304TAT01_DEL_FLG, A305TAT01_CRT_DATETIME, A306TAT01_CRT_USER_ID, A307TAT01_CRT_PROG_NM, A308TAT01_UPD_DATETIME, A309TAT01_UPD_USER_ID, A310TAT01_UPD_PROG_NM, A311TAT01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
      httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
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

   public void xc_30_077( String AV16Pgmname ,
                          String Gx_mode ,
                          int A11TAT01_INFO_NO ,
                          java.util.Date A207TAT01_DATE_START ,
                          java.util.Date A208TAT01_DATE_END ,
                          String A209TAT01_INFO ,
                          String A304TAT01_DEL_FLG ,
                          java.util.Date A305TAT01_CRT_DATETIME ,
                          String A306TAT01_CRT_USER_ID ,
                          String A307TAT01_CRT_PROG_NM ,
                          java.util.Date A308TAT01_UPD_DATETIME ,
                          String A309TAT01_UPD_USER_ID ,
                          String A310TAT01_UPD_PROG_NM ,
                          long A311TAT01_UPD_CNT )
   {
      new tat01_pc01_datalog(remoteHandle, context).execute( AV16Pgmname, Gx_mode, A11TAT01_INFO_NO, A207TAT01_DATE_START, A208TAT01_DATE_END, A209TAT01_INFO, A304TAT01_DEL_FLG, A305TAT01_CRT_DATETIME, A306TAT01_CRT_USER_ID, A307TAT01_CRT_PROG_NM, A308TAT01_UPD_DATETIME, A309TAT01_UPD_USER_ID, A310TAT01_UPD_PROG_NM, A311TAT01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A11TAT01_INFO_NO", GXutil.ltrim( GXutil.str( A11TAT01_INFO_NO, 6, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "A207TAT01_DATE_START", localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A208TAT01_DATE_END", localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A209TAT01_INFO", A209TAT01_INFO);
      httpContext.ajax_rsp_assign_attri("", false, "A304TAT01_DEL_FLG", A304TAT01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A305TAT01_CRT_DATETIME", localUtil.ttoc( A305TAT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A306TAT01_CRT_USER_ID", A306TAT01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A307TAT01_CRT_PROG_NM", A307TAT01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A308TAT01_UPD_DATETIME", localUtil.ttoc( A308TAT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A309TAT01_UPD_USER_ID", A309TAT01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A310TAT01_UPD_PROG_NM", A310TAT01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A311TAT01_UPD_CNT", GXutil.ltrim( GXutil.str( A311TAT01_UPD_CNT, 10, 0)));
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
      GX_FocusControl = edtTAT01_INFO_KBN_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tat01_info_no( int GX_Parm1 ,
                                    java.util.Date GX_Parm2 ,
                                    String GX_Parm3 ,
                                    java.util.Date GX_Parm4 ,
                                    String GX_Parm5 ,
                                    long GX_Parm6 ,
                                    String GX_Parm7 ,
                                    java.util.Date GX_Parm8 ,
                                    java.util.Date GX_Parm9 ,
                                    String GX_Parm10 ,
                                    String GX_Parm11 ,
                                    String GX_Parm12 ,
                                    String GX_Parm13 )
   {
      A11TAT01_INFO_NO = GX_Parm1 ;
      A305TAT01_CRT_DATETIME = GX_Parm2 ;
      n305TAT01_CRT_DATETIME = false ;
      A306TAT01_CRT_USER_ID = GX_Parm3 ;
      n306TAT01_CRT_USER_ID = false ;
      A308TAT01_UPD_DATETIME = GX_Parm4 ;
      n308TAT01_UPD_DATETIME = false ;
      A309TAT01_UPD_USER_ID = GX_Parm5 ;
      n309TAT01_UPD_USER_ID = false ;
      A311TAT01_UPD_CNT = GX_Parm6 ;
      n311TAT01_UPD_CNT = false ;
      A880TAT01_INFO_KBN = GX_Parm7 ;
      n880TAT01_INFO_KBN = false ;
      A207TAT01_DATE_START = GX_Parm8 ;
      n207TAT01_DATE_START = false ;
      A208TAT01_DATE_END = GX_Parm9 ;
      n208TAT01_DATE_END = false ;
      A209TAT01_INFO = GX_Parm10 ;
      n209TAT01_INFO = false ;
      A304TAT01_DEL_FLG = GX_Parm11 ;
      n304TAT01_DEL_FLG = false ;
      A307TAT01_CRT_PROG_NM = GX_Parm12 ;
      n307TAT01_CRT_PROG_NM = false ;
      A310TAT01_UPD_PROG_NM = GX_Parm13 ;
      n310TAT01_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A305TAT01_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A306TAT01_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A308TAT01_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A309TAT01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A311TAT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A880TAT01_INFO_KBN));
      isValidOutput.add(localUtil.format(A207TAT01_DATE_START, "9999/99/99"));
      isValidOutput.add(localUtil.format(A208TAT01_DATE_END, "9999/99/99"));
      isValidOutput.add(GXutil.rtrim( A209TAT01_INFO));
      isValidOutput.add(GXutil.rtrim( A304TAT01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A307TAT01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A310TAT01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV16Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z11TAT01_INFO_NO, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z305TAT01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z306TAT01_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z308TAT01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z309TAT01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z311TAT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z880TAT01_INFO_KBN));
      isValidOutput.add(localUtil.dtoc( Z207TAT01_DATE_START, 0, "/"));
      isValidOutput.add(localUtil.dtoc( Z208TAT01_DATE_END, 0, "/"));
      isValidOutput.add(GXutil.rtrim( Z209TAT01_INFO));
      isValidOutput.add(GXutil.rtrim( Z304TAT01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z307TAT01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z310TAT01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV16Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O311TAT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(edtTAT01_INFO_NO_Visible);
      isValidOutput.add(edtTAT01_CRT_DATETIME_Visible);
      isValidOutput.add(edtTAT01_CRT_PROG_NM_Visible);
      isValidOutput.add(edtTAT01_UPD_DATETIME_Visible);
      isValidOutput.add(edtTAT01_UPD_PROG_NM_Visible);
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
      Z305TAT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z306TAT01_CRT_USER_ID = "" ;
      Z308TAT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z309TAT01_UPD_USER_ID = "" ;
      Z880TAT01_INFO_KBN = "" ;
      Z207TAT01_DATE_START = GXutil.nullDate() ;
      Z208TAT01_DATE_END = GXutil.nullDate() ;
      Z209TAT01_INFO = "" ;
      Z304TAT01_DEL_FLG = "" ;
      Z307TAT01_CRT_PROG_NM = "" ;
      Z310TAT01_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV16Pgmname = "" ;
      Gx_mode = "" ;
      A207TAT01_DATE_START = GXutil.nullDate() ;
      A208TAT01_DATE_END = GXutil.nullDate() ;
      A209TAT01_INFO = "" ;
      A304TAT01_DEL_FLG = "" ;
      A305TAT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A306TAT01_CRT_USER_ID = "" ;
      A307TAT01_CRT_PROG_NM = "" ;
      A308TAT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A309TAT01_UPD_USER_ID = "" ;
      A310TAT01_UPD_PROG_NM = "" ;
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
      lblTextblocktat01_info_no_Jsonclick = "" ;
      lblTextblocktat01_info_kbn_Jsonclick = "" ;
      lblTextblocktat01_date_start_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblocktat01_date_end_Jsonclick = "" ;
      lblTextblocktat01_info_Jsonclick = "" ;
      lblTextblocktat01_del_flg_Jsonclick = "" ;
      lblTextblocktat01_crt_datetime_Jsonclick = "" ;
      lblTextblocktat01_crt_user_id_Jsonclick = "" ;
      lblTextblocktat01_crt_prog_nm_Jsonclick = "" ;
      lblTextblocktat01_upd_datetime_Jsonclick = "" ;
      lblTextblocktat01_upd_user_id_Jsonclick = "" ;
      lblTextblocktat01_upd_prog_nm_Jsonclick = "" ;
      A880TAT01_INFO_KBN = "" ;
      lblTextblocktat01_info_kbn2_Jsonclick = "" ;
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
      AV14W_MSG = "" ;
      GXEncryptionTmp = "" ;
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV10W_KNGN_FLG = "" ;
      GXv_char2 = new String [1] ;
      T00074_A11TAT01_INFO_NO = new int[1] ;
      T00074_A305TAT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00074_n305TAT01_CRT_DATETIME = new boolean[] {false} ;
      T00074_A306TAT01_CRT_USER_ID = new String[] {""} ;
      T00074_n306TAT01_CRT_USER_ID = new boolean[] {false} ;
      T00074_A308TAT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00074_n308TAT01_UPD_DATETIME = new boolean[] {false} ;
      T00074_A309TAT01_UPD_USER_ID = new String[] {""} ;
      T00074_n309TAT01_UPD_USER_ID = new boolean[] {false} ;
      T00074_A311TAT01_UPD_CNT = new long[1] ;
      T00074_n311TAT01_UPD_CNT = new boolean[] {false} ;
      T00074_A880TAT01_INFO_KBN = new String[] {""} ;
      T00074_n880TAT01_INFO_KBN = new boolean[] {false} ;
      T00074_A207TAT01_DATE_START = new java.util.Date[] {GXutil.nullDate()} ;
      T00074_n207TAT01_DATE_START = new boolean[] {false} ;
      T00074_A208TAT01_DATE_END = new java.util.Date[] {GXutil.nullDate()} ;
      T00074_n208TAT01_DATE_END = new boolean[] {false} ;
      T00074_A209TAT01_INFO = new String[] {""} ;
      T00074_n209TAT01_INFO = new boolean[] {false} ;
      T00074_A304TAT01_DEL_FLG = new String[] {""} ;
      T00074_n304TAT01_DEL_FLG = new boolean[] {false} ;
      T00074_A307TAT01_CRT_PROG_NM = new String[] {""} ;
      T00074_n307TAT01_CRT_PROG_NM = new boolean[] {false} ;
      T00074_A310TAT01_UPD_PROG_NM = new String[] {""} ;
      T00074_n310TAT01_UPD_PROG_NM = new boolean[] {false} ;
      T00075_A11TAT01_INFO_NO = new int[1] ;
      T00073_A11TAT01_INFO_NO = new int[1] ;
      T00073_A305TAT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00073_n305TAT01_CRT_DATETIME = new boolean[] {false} ;
      T00073_A306TAT01_CRT_USER_ID = new String[] {""} ;
      T00073_n306TAT01_CRT_USER_ID = new boolean[] {false} ;
      T00073_A308TAT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00073_n308TAT01_UPD_DATETIME = new boolean[] {false} ;
      T00073_A309TAT01_UPD_USER_ID = new String[] {""} ;
      T00073_n309TAT01_UPD_USER_ID = new boolean[] {false} ;
      T00073_A311TAT01_UPD_CNT = new long[1] ;
      T00073_n311TAT01_UPD_CNT = new boolean[] {false} ;
      T00073_A880TAT01_INFO_KBN = new String[] {""} ;
      T00073_n880TAT01_INFO_KBN = new boolean[] {false} ;
      T00073_A207TAT01_DATE_START = new java.util.Date[] {GXutil.nullDate()} ;
      T00073_n207TAT01_DATE_START = new boolean[] {false} ;
      T00073_A208TAT01_DATE_END = new java.util.Date[] {GXutil.nullDate()} ;
      T00073_n208TAT01_DATE_END = new boolean[] {false} ;
      T00073_A209TAT01_INFO = new String[] {""} ;
      T00073_n209TAT01_INFO = new boolean[] {false} ;
      T00073_A304TAT01_DEL_FLG = new String[] {""} ;
      T00073_n304TAT01_DEL_FLG = new boolean[] {false} ;
      T00073_A307TAT01_CRT_PROG_NM = new String[] {""} ;
      T00073_n307TAT01_CRT_PROG_NM = new boolean[] {false} ;
      T00073_A310TAT01_UPD_PROG_NM = new String[] {""} ;
      T00073_n310TAT01_UPD_PROG_NM = new boolean[] {false} ;
      sMode7 = "" ;
      T00076_A11TAT01_INFO_NO = new int[1] ;
      T00077_A11TAT01_INFO_NO = new int[1] ;
      T00072_A11TAT01_INFO_NO = new int[1] ;
      T00072_A305TAT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00072_n305TAT01_CRT_DATETIME = new boolean[] {false} ;
      T00072_A306TAT01_CRT_USER_ID = new String[] {""} ;
      T00072_n306TAT01_CRT_USER_ID = new boolean[] {false} ;
      T00072_A308TAT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00072_n308TAT01_UPD_DATETIME = new boolean[] {false} ;
      T00072_A309TAT01_UPD_USER_ID = new String[] {""} ;
      T00072_n309TAT01_UPD_USER_ID = new boolean[] {false} ;
      T00072_A311TAT01_UPD_CNT = new long[1] ;
      T00072_n311TAT01_UPD_CNT = new boolean[] {false} ;
      T00072_A880TAT01_INFO_KBN = new String[] {""} ;
      T00072_n880TAT01_INFO_KBN = new boolean[] {false} ;
      T00072_A207TAT01_DATE_START = new java.util.Date[] {GXutil.nullDate()} ;
      T00072_n207TAT01_DATE_START = new boolean[] {false} ;
      T00072_A208TAT01_DATE_END = new java.util.Date[] {GXutil.nullDate()} ;
      T00072_n208TAT01_DATE_END = new boolean[] {false} ;
      T00072_A209TAT01_INFO = new String[] {""} ;
      T00072_n209TAT01_INFO = new boolean[] {false} ;
      T00072_A304TAT01_DEL_FLG = new String[] {""} ;
      T00072_n304TAT01_DEL_FLG = new boolean[] {false} ;
      T00072_A307TAT01_CRT_PROG_NM = new String[] {""} ;
      T00072_n307TAT01_CRT_PROG_NM = new boolean[] {false} ;
      T00072_A310TAT01_UPD_PROG_NM = new String[] {""} ;
      T00072_n310TAT01_UPD_PROG_NM = new boolean[] {false} ;
      T00079_A11TAT01_INFO_NO = new int[1] ;
      T000712_A11TAT01_INFO_NO = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i304TAT01_DEL_FLG = "" ;
      i307TAT01_CRT_PROG_NM = "" ;
      i310TAT01_UPD_PROG_NM = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      ZV16Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tat01_info__default(),
         new Object[] {
             new Object[] {
            T00072_A11TAT01_INFO_NO, T00072_A305TAT01_CRT_DATETIME, T00072_n305TAT01_CRT_DATETIME, T00072_A306TAT01_CRT_USER_ID, T00072_n306TAT01_CRT_USER_ID, T00072_A308TAT01_UPD_DATETIME, T00072_n308TAT01_UPD_DATETIME, T00072_A309TAT01_UPD_USER_ID, T00072_n309TAT01_UPD_USER_ID, T00072_A311TAT01_UPD_CNT,
            T00072_n311TAT01_UPD_CNT, T00072_A880TAT01_INFO_KBN, T00072_n880TAT01_INFO_KBN, T00072_A207TAT01_DATE_START, T00072_n207TAT01_DATE_START, T00072_A208TAT01_DATE_END, T00072_n208TAT01_DATE_END, T00072_A209TAT01_INFO, T00072_n209TAT01_INFO, T00072_A304TAT01_DEL_FLG,
            T00072_n304TAT01_DEL_FLG, T00072_A307TAT01_CRT_PROG_NM, T00072_n307TAT01_CRT_PROG_NM, T00072_A310TAT01_UPD_PROG_NM, T00072_n310TAT01_UPD_PROG_NM
            }
            , new Object[] {
            T00073_A11TAT01_INFO_NO, T00073_A305TAT01_CRT_DATETIME, T00073_n305TAT01_CRT_DATETIME, T00073_A306TAT01_CRT_USER_ID, T00073_n306TAT01_CRT_USER_ID, T00073_A308TAT01_UPD_DATETIME, T00073_n308TAT01_UPD_DATETIME, T00073_A309TAT01_UPD_USER_ID, T00073_n309TAT01_UPD_USER_ID, T00073_A311TAT01_UPD_CNT,
            T00073_n311TAT01_UPD_CNT, T00073_A880TAT01_INFO_KBN, T00073_n880TAT01_INFO_KBN, T00073_A207TAT01_DATE_START, T00073_n207TAT01_DATE_START, T00073_A208TAT01_DATE_END, T00073_n208TAT01_DATE_END, T00073_A209TAT01_INFO, T00073_n209TAT01_INFO, T00073_A304TAT01_DEL_FLG,
            T00073_n304TAT01_DEL_FLG, T00073_A307TAT01_CRT_PROG_NM, T00073_n307TAT01_CRT_PROG_NM, T00073_A310TAT01_UPD_PROG_NM, T00073_n310TAT01_UPD_PROG_NM
            }
            , new Object[] {
            T00074_A11TAT01_INFO_NO, T00074_A305TAT01_CRT_DATETIME, T00074_n305TAT01_CRT_DATETIME, T00074_A306TAT01_CRT_USER_ID, T00074_n306TAT01_CRT_USER_ID, T00074_A308TAT01_UPD_DATETIME, T00074_n308TAT01_UPD_DATETIME, T00074_A309TAT01_UPD_USER_ID, T00074_n309TAT01_UPD_USER_ID, T00074_A311TAT01_UPD_CNT,
            T00074_n311TAT01_UPD_CNT, T00074_A880TAT01_INFO_KBN, T00074_n880TAT01_INFO_KBN, T00074_A207TAT01_DATE_START, T00074_n207TAT01_DATE_START, T00074_A208TAT01_DATE_END, T00074_n208TAT01_DATE_END, T00074_A209TAT01_INFO, T00074_n209TAT01_INFO, T00074_A304TAT01_DEL_FLG,
            T00074_n304TAT01_DEL_FLG, T00074_A307TAT01_CRT_PROG_NM, T00074_n307TAT01_CRT_PROG_NM, T00074_A310TAT01_UPD_PROG_NM, T00074_n310TAT01_UPD_PROG_NM
            }
            , new Object[] {
            T00075_A11TAT01_INFO_NO
            }
            , new Object[] {
            T00076_A11TAT01_INFO_NO
            }
            , new Object[] {
            T00077_A11TAT01_INFO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            T00079_A11TAT01_INFO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000712_A11TAT01_INFO_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z310TAT01_UPD_PROG_NM = AV16Pgmname ;
      n310TAT01_UPD_PROG_NM = false ;
      Z307TAT01_CRT_PROG_NM = AV16Pgmname ;
      n307TAT01_CRT_PROG_NM = false ;
      AV16Pgmname = "TAT01_INFO" ;
      Z304TAT01_DEL_FLG = "0" ;
      n304TAT01_DEL_FLG = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound7 ;
   private short Gx_err ;
   private int Z11TAT01_INFO_NO ;
   private int A11TAT01_INFO_NO ;
   private int trnEnded ;
   private int lblBtn_cancel_Enabled ;
   private int edtTAT01_INFO_NO_Enabled ;
   private int edtTAT01_INFO_NO_Visible ;
   private int imgImage20_Visible ;
   private int imgImage23_Visible ;
   private int edtTAT01_DATE_START_Enabled ;
   private int imgImage21_Visible ;
   private int edtTAT01_DATE_END_Enabled ;
   private int imgImage22_Visible ;
   private int edtTAT01_INFO_Enabled ;
   private int edtTAT01_CRT_DATETIME_Visible ;
   private int edtTAT01_CRT_DATETIME_Enabled ;
   private int edtTAT01_CRT_USER_ID_Enabled ;
   private int edtTAT01_CRT_PROG_NM_Visible ;
   private int edtTAT01_CRT_PROG_NM_Enabled ;
   private int edtTAT01_UPD_DATETIME_Visible ;
   private int edtTAT01_UPD_DATETIME_Enabled ;
   private int edtTAT01_UPD_USER_ID_Enabled ;
   private int edtTAT01_UPD_PROG_NM_Visible ;
   private int edtTAT01_UPD_PROG_NM_Enabled ;
   private int edtTAT01_INFO_KBN_Enabled ;
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
   private long Z311TAT01_UPD_CNT ;
   private long O311TAT01_UPD_CNT ;
   private long A311TAT01_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV16Pgmname ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTAT01_INFO_KBN_Internalname ;
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
   private String lblTextblocktat01_info_no_Internalname ;
   private String lblTextblocktat01_info_no_Jsonclick ;
   private String edtTAT01_INFO_NO_Internalname ;
   private String edtTAT01_INFO_NO_Jsonclick ;
   private String imgImage20_Internalname ;
   private String lblTextblocktat01_info_kbn_Internalname ;
   private String lblTextblocktat01_info_kbn_Jsonclick ;
   private String imgImage23_Internalname ;
   private String lblTextblocktat01_date_start_Internalname ;
   private String lblTextblocktat01_date_start_Jsonclick ;
   private String TempTags ;
   private String edtTAT01_DATE_START_Internalname ;
   private String edtTAT01_DATE_START_Jsonclick ;
   private String imgImage21_Internalname ;
   private String lblTextblocktat01_date_end_Internalname ;
   private String lblTextblocktat01_date_end_Jsonclick ;
   private String edtTAT01_DATE_END_Internalname ;
   private String edtTAT01_DATE_END_Jsonclick ;
   private String imgImage22_Internalname ;
   private String lblTextblocktat01_info_Internalname ;
   private String lblTextblocktat01_info_Jsonclick ;
   private String edtTAT01_INFO_Internalname ;
   private String lblTextblocktat01_del_flg_Internalname ;
   private String lblTextblocktat01_del_flg_Jsonclick ;
   private String lblTextblocktat01_crt_datetime_Internalname ;
   private String lblTextblocktat01_crt_datetime_Jsonclick ;
   private String edtTAT01_CRT_DATETIME_Internalname ;
   private String edtTAT01_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktat01_crt_user_id_Internalname ;
   private String lblTextblocktat01_crt_user_id_Jsonclick ;
   private String edtTAT01_CRT_USER_ID_Internalname ;
   private String edtTAT01_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktat01_crt_prog_nm_Internalname ;
   private String lblTextblocktat01_crt_prog_nm_Jsonclick ;
   private String edtTAT01_CRT_PROG_NM_Internalname ;
   private String edtTAT01_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktat01_upd_datetime_Internalname ;
   private String lblTextblocktat01_upd_datetime_Jsonclick ;
   private String edtTAT01_UPD_DATETIME_Internalname ;
   private String edtTAT01_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktat01_upd_user_id_Internalname ;
   private String lblTextblocktat01_upd_user_id_Jsonclick ;
   private String edtTAT01_UPD_USER_ID_Internalname ;
   private String edtTAT01_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktat01_upd_prog_nm_Internalname ;
   private String lblTextblocktat01_upd_prog_nm_Jsonclick ;
   private String edtTAT01_UPD_PROG_NM_Internalname ;
   private String edtTAT01_UPD_PROG_NM_Jsonclick ;
   private String tblTable3_Internalname ;
   private String edtTAT01_INFO_KBN_Jsonclick ;
   private String lblTextblocktat01_info_kbn2_Internalname ;
   private String lblTextblocktat01_info_kbn2_Jsonclick ;
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
   private String sMode7 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String div_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String ZV16Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z305TAT01_CRT_DATETIME ;
   private java.util.Date Z308TAT01_UPD_DATETIME ;
   private java.util.Date A305TAT01_CRT_DATETIME ;
   private java.util.Date A308TAT01_UPD_DATETIME ;
   private java.util.Date Z207TAT01_DATE_START ;
   private java.util.Date Z208TAT01_DATE_END ;
   private java.util.Date A207TAT01_DATE_START ;
   private java.util.Date A208TAT01_DATE_END ;
   private boolean entryPointCalled ;
   private boolean n207TAT01_DATE_START ;
   private boolean n208TAT01_DATE_END ;
   private boolean n209TAT01_INFO ;
   private boolean n304TAT01_DEL_FLG ;
   private boolean n305TAT01_CRT_DATETIME ;
   private boolean n306TAT01_CRT_USER_ID ;
   private boolean n307TAT01_CRT_PROG_NM ;
   private boolean n308TAT01_UPD_DATETIME ;
   private boolean n309TAT01_UPD_USER_ID ;
   private boolean n310TAT01_UPD_PROG_NM ;
   private boolean n311TAT01_UPD_CNT ;
   private boolean wbErr ;
   private boolean n880TAT01_INFO_KBN ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z306TAT01_CRT_USER_ID ;
   private String Z309TAT01_UPD_USER_ID ;
   private String Z880TAT01_INFO_KBN ;
   private String Z209TAT01_INFO ;
   private String Z304TAT01_DEL_FLG ;
   private String Z307TAT01_CRT_PROG_NM ;
   private String Z310TAT01_UPD_PROG_NM ;
   private String A209TAT01_INFO ;
   private String A304TAT01_DEL_FLG ;
   private String A306TAT01_CRT_USER_ID ;
   private String A307TAT01_CRT_PROG_NM ;
   private String A309TAT01_UPD_USER_ID ;
   private String A310TAT01_UPD_PROG_NM ;
   private String A880TAT01_INFO_KBN ;
   private String AV7C_TAM02_APP_ID ;
   private String AV9W_ERRCD ;
   private String AV14W_MSG ;
   private String AV10W_KNGN_FLG ;
   private String i304TAT01_DEL_FLG ;
   private String i307TAT01_CRT_PROG_NM ;
   private String i310TAT01_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice radTAT01_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private int[] T00074_A11TAT01_INFO_NO ;
   private java.util.Date[] T00074_A305TAT01_CRT_DATETIME ;
   private boolean[] T00074_n305TAT01_CRT_DATETIME ;
   private String[] T00074_A306TAT01_CRT_USER_ID ;
   private boolean[] T00074_n306TAT01_CRT_USER_ID ;
   private java.util.Date[] T00074_A308TAT01_UPD_DATETIME ;
   private boolean[] T00074_n308TAT01_UPD_DATETIME ;
   private String[] T00074_A309TAT01_UPD_USER_ID ;
   private boolean[] T00074_n309TAT01_UPD_USER_ID ;
   private long[] T00074_A311TAT01_UPD_CNT ;
   private boolean[] T00074_n311TAT01_UPD_CNT ;
   private String[] T00074_A880TAT01_INFO_KBN ;
   private boolean[] T00074_n880TAT01_INFO_KBN ;
   private java.util.Date[] T00074_A207TAT01_DATE_START ;
   private boolean[] T00074_n207TAT01_DATE_START ;
   private java.util.Date[] T00074_A208TAT01_DATE_END ;
   private boolean[] T00074_n208TAT01_DATE_END ;
   private String[] T00074_A209TAT01_INFO ;
   private boolean[] T00074_n209TAT01_INFO ;
   private String[] T00074_A304TAT01_DEL_FLG ;
   private boolean[] T00074_n304TAT01_DEL_FLG ;
   private String[] T00074_A307TAT01_CRT_PROG_NM ;
   private boolean[] T00074_n307TAT01_CRT_PROG_NM ;
   private String[] T00074_A310TAT01_UPD_PROG_NM ;
   private boolean[] T00074_n310TAT01_UPD_PROG_NM ;
   private int[] T00075_A11TAT01_INFO_NO ;
   private int[] T00073_A11TAT01_INFO_NO ;
   private java.util.Date[] T00073_A305TAT01_CRT_DATETIME ;
   private boolean[] T00073_n305TAT01_CRT_DATETIME ;
   private String[] T00073_A306TAT01_CRT_USER_ID ;
   private boolean[] T00073_n306TAT01_CRT_USER_ID ;
   private java.util.Date[] T00073_A308TAT01_UPD_DATETIME ;
   private boolean[] T00073_n308TAT01_UPD_DATETIME ;
   private String[] T00073_A309TAT01_UPD_USER_ID ;
   private boolean[] T00073_n309TAT01_UPD_USER_ID ;
   private long[] T00073_A311TAT01_UPD_CNT ;
   private boolean[] T00073_n311TAT01_UPD_CNT ;
   private String[] T00073_A880TAT01_INFO_KBN ;
   private boolean[] T00073_n880TAT01_INFO_KBN ;
   private java.util.Date[] T00073_A207TAT01_DATE_START ;
   private boolean[] T00073_n207TAT01_DATE_START ;
   private java.util.Date[] T00073_A208TAT01_DATE_END ;
   private boolean[] T00073_n208TAT01_DATE_END ;
   private String[] T00073_A209TAT01_INFO ;
   private boolean[] T00073_n209TAT01_INFO ;
   private String[] T00073_A304TAT01_DEL_FLG ;
   private boolean[] T00073_n304TAT01_DEL_FLG ;
   private String[] T00073_A307TAT01_CRT_PROG_NM ;
   private boolean[] T00073_n307TAT01_CRT_PROG_NM ;
   private String[] T00073_A310TAT01_UPD_PROG_NM ;
   private boolean[] T00073_n310TAT01_UPD_PROG_NM ;
   private int[] T00076_A11TAT01_INFO_NO ;
   private int[] T00077_A11TAT01_INFO_NO ;
   private int[] T00072_A11TAT01_INFO_NO ;
   private java.util.Date[] T00072_A305TAT01_CRT_DATETIME ;
   private boolean[] T00072_n305TAT01_CRT_DATETIME ;
   private String[] T00072_A306TAT01_CRT_USER_ID ;
   private boolean[] T00072_n306TAT01_CRT_USER_ID ;
   private java.util.Date[] T00072_A308TAT01_UPD_DATETIME ;
   private boolean[] T00072_n308TAT01_UPD_DATETIME ;
   private String[] T00072_A309TAT01_UPD_USER_ID ;
   private boolean[] T00072_n309TAT01_UPD_USER_ID ;
   private long[] T00072_A311TAT01_UPD_CNT ;
   private boolean[] T00072_n311TAT01_UPD_CNT ;
   private String[] T00072_A880TAT01_INFO_KBN ;
   private boolean[] T00072_n880TAT01_INFO_KBN ;
   private java.util.Date[] T00072_A207TAT01_DATE_START ;
   private boolean[] T00072_n207TAT01_DATE_START ;
   private java.util.Date[] T00072_A208TAT01_DATE_END ;
   private boolean[] T00072_n208TAT01_DATE_END ;
   private String[] T00072_A209TAT01_INFO ;
   private boolean[] T00072_n209TAT01_INFO ;
   private String[] T00072_A304TAT01_DEL_FLG ;
   private boolean[] T00072_n304TAT01_DEL_FLG ;
   private String[] T00072_A307TAT01_CRT_PROG_NM ;
   private boolean[] T00072_n307TAT01_CRT_PROG_NM ;
   private String[] T00072_A310TAT01_UPD_PROG_NM ;
   private boolean[] T00072_n310TAT01_UPD_PROG_NM ;
   private int[] T00079_A11TAT01_INFO_NO ;
   private int[] T000712_A11TAT01_INFO_NO ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class tat01_info__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00072", "SELECT `TAT01_INFO_NO`, `TAT01_CRT_DATETIME`, `TAT01_CRT_USER_ID`, `TAT01_UPD_DATETIME`, `TAT01_UPD_USER_ID`, `TAT01_UPD_CNT`, `TAT01_INFO_KBN`, `TAT01_DATE_START`, `TAT01_DATE_END`, `TAT01_INFO`, `TAT01_DEL_FLG`, `TAT01_CRT_PROG_NM`, `TAT01_UPD_PROG_NM` FROM `TAT01_INFO` WHERE `TAT01_INFO_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00073", "SELECT `TAT01_INFO_NO`, `TAT01_CRT_DATETIME`, `TAT01_CRT_USER_ID`, `TAT01_UPD_DATETIME`, `TAT01_UPD_USER_ID`, `TAT01_UPD_CNT`, `TAT01_INFO_KBN`, `TAT01_DATE_START`, `TAT01_DATE_END`, `TAT01_INFO`, `TAT01_DEL_FLG`, `TAT01_CRT_PROG_NM`, `TAT01_UPD_PROG_NM` FROM `TAT01_INFO` WHERE `TAT01_INFO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00074", "SELECT TM1.`TAT01_INFO_NO`, TM1.`TAT01_CRT_DATETIME`, TM1.`TAT01_CRT_USER_ID`, TM1.`TAT01_UPD_DATETIME`, TM1.`TAT01_UPD_USER_ID`, TM1.`TAT01_UPD_CNT`, TM1.`TAT01_INFO_KBN`, TM1.`TAT01_DATE_START`, TM1.`TAT01_DATE_END`, TM1.`TAT01_INFO`, TM1.`TAT01_DEL_FLG`, TM1.`TAT01_CRT_PROG_NM`, TM1.`TAT01_UPD_PROG_NM` FROM `TAT01_INFO` TM1 WHERE TM1.`TAT01_INFO_NO` = ? ORDER BY TM1.`TAT01_INFO_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00075", "SELECT `TAT01_INFO_NO` FROM `TAT01_INFO` WHERE `TAT01_INFO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00076", "SELECT `TAT01_INFO_NO` FROM `TAT01_INFO` WHERE ( `TAT01_INFO_NO` > ?) ORDER BY `TAT01_INFO_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00077", "SELECT `TAT01_INFO_NO` FROM `TAT01_INFO` WHERE ( `TAT01_INFO_NO` < ?) ORDER BY `TAT01_INFO_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00078", "INSERT INTO `TAT01_INFO`(`TAT01_CRT_DATETIME`, `TAT01_CRT_USER_ID`, `TAT01_UPD_DATETIME`, `TAT01_UPD_USER_ID`, `TAT01_UPD_CNT`, `TAT01_INFO_KBN`, `TAT01_DATE_START`, `TAT01_DATE_END`, `TAT01_INFO`, `TAT01_DEL_FLG`, `TAT01_CRT_PROG_NM`, `TAT01_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new ForEachCursor("T00079", "SELECT LAST_INSERT_ID() ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000710", "UPDATE `TAT01_INFO` SET `TAT01_CRT_DATETIME`=?, `TAT01_CRT_USER_ID`=?, `TAT01_UPD_DATETIME`=?, `TAT01_UPD_USER_ID`=?, `TAT01_UPD_CNT`=?, `TAT01_INFO_KBN`=?, `TAT01_DATE_START`=?, `TAT01_DATE_END`=?, `TAT01_INFO`=?, `TAT01_DEL_FLG`=?, `TAT01_CRT_PROG_NM`=?, `TAT01_UPD_PROG_NM`=?  WHERE `TAT01_INFO_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T000711", "DELETE FROM `TAT01_INFO`  WHERE `TAT01_INFO_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T000712", "SELECT `TAT01_INFO_NO` FROM `TAT01_INFO` ORDER BY `TAT01_INFO_NO` ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 6 :
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
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 2000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               return;
            case 8 :
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
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 2000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               stmt.setInt(13, ((Number) parms[24]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

