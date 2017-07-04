/*
               File: tam01_sys_impl
        Description: システムIDマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:43.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam01_sys_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1TAM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A206TAM01_SYS_NM = httpContext.GetNextPar( ) ;
         n206TAM01_SYS_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
         A273TAM01_DEL_FLG = httpContext.GetNextPar( ) ;
         n273TAM01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
         A221TAM01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n221TAM01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A260TAM01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n260TAM01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
         A222TAM01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n222TAM01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
         A223TAM01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n223TAM01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A261TAM01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n261TAM01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
         A224TAM01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n224TAM01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
         A274TAM01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n274TAM01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_011( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A206TAM01_SYS_NM, A273TAM01_DEL_FLG, A221TAM01_CRT_DATETIME, A260TAM01_CRT_USER_ID, A222TAM01_CRT_PROG_NM, A223TAM01_UPD_DATETIME, A261TAM01_UPD_USER_ID, A224TAM01_UPD_PROG_NM, A274TAM01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1TAM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A206TAM01_SYS_NM = httpContext.GetNextPar( ) ;
         n206TAM01_SYS_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
         A273TAM01_DEL_FLG = httpContext.GetNextPar( ) ;
         n273TAM01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
         A221TAM01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n221TAM01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A260TAM01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n260TAM01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
         A222TAM01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n222TAM01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
         A223TAM01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n223TAM01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A261TAM01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n261TAM01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
         A224TAM01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n224TAM01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
         A274TAM01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n274TAM01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_011( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A206TAM01_SYS_NM, A273TAM01_DEL_FLG, A221TAM01_CRT_DATETIME, A260TAM01_CRT_USER_ID, A222TAM01_CRT_PROG_NM, A223TAM01_UPD_DATETIME, A261TAM01_UPD_USER_ID, A224TAM01_UPD_PROG_NM, A274TAM01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         AV14Pgmname = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1TAM01_SYS_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A206TAM01_SYS_NM = httpContext.GetNextPar( ) ;
         n206TAM01_SYS_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
         A273TAM01_DEL_FLG = httpContext.GetNextPar( ) ;
         n273TAM01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
         A221TAM01_CRT_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n221TAM01_CRT_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A260TAM01_CRT_USER_ID = httpContext.GetNextPar( ) ;
         n260TAM01_CRT_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
         A222TAM01_CRT_PROG_NM = httpContext.GetNextPar( ) ;
         n222TAM01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
         A223TAM01_UPD_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
         n223TAM01_UPD_DATETIME = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         A261TAM01_UPD_USER_ID = httpContext.GetNextPar( ) ;
         n261TAM01_UPD_USER_ID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
         A224TAM01_UPD_PROG_NM = httpContext.GetNextPar( ) ;
         n224TAM01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
         A274TAM01_UPD_CNT = GXutil.lval( httpContext.GetNextPar( )) ;
         n274TAM01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_011( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A206TAM01_SYS_NM, A273TAM01_DEL_FLG, A221TAM01_CRT_DATETIME, A260TAM01_CRT_USER_ID, A222TAM01_CRT_PROG_NM, A223TAM01_UPD_DATETIME, A261TAM01_UPD_USER_ID, A224TAM01_UPD_PROG_NM, A274TAM01_UPD_CNT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"TAM01_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asatam01_crt_user_id011( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"TAM01_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asatam01_upd_user_id011( Gx_mode) ;
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
      radTAM01_DEL_FLG.setName( "TAM01_DEL_FLG" );
      radTAM01_DEL_FLG.setWebtags( "" );
      radTAM01_DEL_FLG.addItem("0", "利用可能", (short)(0));
      radTAM01_DEL_FLG.addItem("1", "利用不可", (short)(0));
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "システムIDマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tam01_sys_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam01_sys_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam01_sys_impl.class ));
   }

   public tam01_sys_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      radTAM01_DEL_FLG = new HTMLChoice();
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
         wb_table1_2_011( true) ;
      }
      return  ;
   }

   public void wb_table1_2_011e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm011( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_011( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_011( true) ;
      }
      return  ;
   }

   public void wb_table2_5_011e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "システムIDマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TAM01_SYS.htm");
         wb_table3_28_011( true) ;
      }
      return  ;
   }

   public void wb_table3_28_011e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_011e( true) ;
      }
      else
      {
         wb_table1_2_011e( false) ;
      }
   }

   public void wb_table3_28_011( boolean wbgen )
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
         wb_table4_34_011( true) ;
      }
      return  ;
   }

   public void wb_table4_34_011e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_100_011( true) ;
      }
      return  ;
   }

   public void wb_table5_100_011e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_011e( true) ;
      }
      else
      {
         wb_table3_28_011e( false) ;
      }
   }

   public void wb_table5_100_011( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, "実行", "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, "クリア", "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_CLER\\'."+"'", "", "TextBlockBtn060", 5, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         httpContext.writeText( "&nbsp;") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:3px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblBtn_cancel_Internalname, "終了", "", "", lblBtn_cancel_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", "", "TextBlockBtn060", 5, "", 1, lblBtn_cancel_Enabled, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_100_011e( true) ;
      }
      else
      {
         wb_table5_100_011e( false) ;
      }
   }

   public void wb_table4_34_011( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgImage19_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage19_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_sys_id_Internalname, "システムID", "", "", lblTextblocktam01_sys_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM01_SYS_ID_Internalname, GXutil.rtrim( A1TAM01_SYS_ID), GXutil.rtrim( localUtil.format( A1TAM01_SYS_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM01_SYS_ID_Jsonclick, 0, "AttributeImeOff", "", "", "", 1, edtTAM01_SYS_ID_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Static images/pictures */
         ClassString = "ImageRequiredMark" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage20_Internalname, context.getHttpContext().getImagePath( "d5d6aaa9-3daa-4e25-b702-e0d1b5ef483e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgImage20_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_sys_nm_Internalname, "システム名", "", "", lblTextblocktam01_sys_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM01_SYS_NM_Internalname, GXutil.rtrim( A206TAM01_SYS_NM), GXutil.rtrim( localUtil.format( A206TAM01_SYS_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM01_SYS_NM_Jsonclick, 0, "AttributeImeOn", "", "", "", 1, edtTAM01_SYS_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "バージョン情報", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM01_VERSION_Internalname, GXutil.rtrim( A975TAM01_VERSION), GXutil.rtrim( localUtil.format( A975TAM01_VERSION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM01_VERSION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM01_VERSION_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "備考", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTAM01_BIKO_Internalname, GXutil.rtrim( A976TAM01_BIKO), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(56);\"", (short)(0), 1, edtTAM01_BIKO_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam01_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Radio button */
         ClassString = "ReadonlyAttribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         GxWebStd.gx_radio_ctrl( httpContext, radTAM01_DEL_FLG, radTAM01_DEL_FLG.getInternalname(), GXutil.rtrim( A273TAM01_DEL_FLG), "", 1, radTAM01_DEL_FLG.getEnabled(), 0, 0, StyleString, ClassString, "", 0, radTAM01_DEL_FLG.getJsonclick(), "'"+""+"'"+",false,"+"'"+""+"'", TempTags+" onclick=\"gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(61);\"", "HLP_TAM01_SYS.htm");
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam01_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAM01_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM01_CRT_DATETIME_Internalname, localUtil.format(A221TAM01_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A221TAM01_CRT_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM01_CRT_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM01_CRT_DATETIME_Visible, edtTAM01_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM01_SYS.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM01_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAM01_CRT_DATETIME_Visible==0)||(edtTAM01_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam01_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM01_CRT_USER_ID_Internalname, GXutil.rtrim( A260TAM01_CRT_USER_ID), GXutil.rtrim( localUtil.format( A260TAM01_CRT_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM01_CRT_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAM01_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam01_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM01_CRT_PROG_NM_Internalname, GXutil.rtrim( A222TAM01_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A222TAM01_CRT_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM01_CRT_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM01_CRT_PROG_NM_Visible, edtTAM01_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam01_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTAM01_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM01_UPD_DATETIME_Internalname, localUtil.format(A223TAM01_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A223TAM01_UPD_DATETIME, "9999/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM01_UPD_DATETIME_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM01_UPD_DATETIME_Visible, edtTAM01_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM01_SYS.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM01_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTAM01_UPD_DATETIME_Visible==0)||(edtTAM01_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam01_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM01_UPD_USER_ID_Internalname, GXutil.rtrim( A261TAM01_UPD_USER_ID), GXutil.rtrim( localUtil.format( A261TAM01_UPD_USER_ID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM01_UPD_USER_ID_Jsonclick, 0, "ReadonlyAttribute", "", "", "", 1, edtTAM01_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam01_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam01_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM01_SYS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         GxWebStd.gx_single_line_edit( httpContext, edtTAM01_UPD_PROG_NM_Internalname, GXutil.rtrim( A224TAM01_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A224TAM01_UPD_PROG_NM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM01_UPD_PROG_NM_Jsonclick, 0, "ReadonlyAttribute", "", "", "", edtTAM01_UPD_PROG_NM_Visible, edtTAM01_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM01_SYS.htm");
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
         wb_table4_34_011e( true) ;
      }
      else
      {
         wb_table4_34_011e( false) ;
      }
   }

   public void wb_table2_5_011( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BTN_SELECT\\'."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM01_SYS.htm");
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
         wb_table2_5_011e( true) ;
      }
      else
      {
         wb_table2_5_011e( false) ;
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
      /* Execute user event: e11012 */
      e11012 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A1TAM01_SYS_ID = httpContext.cgiGet( edtTAM01_SYS_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
            A206TAM01_SYS_NM = httpContext.cgiGet( edtTAM01_SYS_NM_Internalname) ;
            n206TAM01_SYS_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
            n206TAM01_SYS_NM = ((GXutil.strcmp("", A206TAM01_SYS_NM)==0) ? true : false) ;
            A975TAM01_VERSION = httpContext.cgiGet( edtTAM01_VERSION_Internalname) ;
            n975TAM01_VERSION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A975TAM01_VERSION", A975TAM01_VERSION);
            n975TAM01_VERSION = ((GXutil.strcmp("", A975TAM01_VERSION)==0) ? true : false) ;
            A976TAM01_BIKO = httpContext.cgiGet( edtTAM01_BIKO_Internalname) ;
            n976TAM01_BIKO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A976TAM01_BIKO", A976TAM01_BIKO);
            n976TAM01_BIKO = ((GXutil.strcmp("", A976TAM01_BIKO)==0) ? true : false) ;
            A273TAM01_DEL_FLG = httpContext.cgiGet( radTAM01_DEL_FLG.getInternalname()) ;
            n273TAM01_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
            n273TAM01_DEL_FLG = ((GXutil.strcmp("", A273TAM01_DEL_FLG)==0) ? true : false) ;
            A221TAM01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM01_CRT_DATETIME_Internalname)) ;
            n221TAM01_CRT_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A260TAM01_CRT_USER_ID = httpContext.cgiGet( edtTAM01_CRT_USER_ID_Internalname) ;
            n260TAM01_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
            A222TAM01_CRT_PROG_NM = httpContext.cgiGet( edtTAM01_CRT_PROG_NM_Internalname) ;
            n222TAM01_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
            A223TAM01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM01_UPD_DATETIME_Internalname)) ;
            n223TAM01_UPD_DATETIME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            A261TAM01_UPD_USER_ID = httpContext.cgiGet( edtTAM01_UPD_USER_ID_Internalname) ;
            n261TAM01_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
            A224TAM01_UPD_PROG_NM = httpContext.cgiGet( edtTAM01_UPD_PROG_NM_Internalname) ;
            n224TAM01_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
            /* Read saved values. */
            Z1TAM01_SYS_ID = httpContext.cgiGet( "Z1TAM01_SYS_ID") ;
            Z221TAM01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z221TAM01_CRT_DATETIME"), 0) ;
            n221TAM01_CRT_DATETIME = (GXutil.nullDate().equals(A221TAM01_CRT_DATETIME) ? true : false) ;
            Z260TAM01_CRT_USER_ID = httpContext.cgiGet( "Z260TAM01_CRT_USER_ID") ;
            n260TAM01_CRT_USER_ID = ((GXutil.strcmp("", A260TAM01_CRT_USER_ID)==0) ? true : false) ;
            Z223TAM01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z223TAM01_UPD_DATETIME"), 0) ;
            n223TAM01_UPD_DATETIME = (GXutil.nullDate().equals(A223TAM01_UPD_DATETIME) ? true : false) ;
            Z261TAM01_UPD_USER_ID = httpContext.cgiGet( "Z261TAM01_UPD_USER_ID") ;
            n261TAM01_UPD_USER_ID = ((GXutil.strcmp("", A261TAM01_UPD_USER_ID)==0) ? true : false) ;
            Z274TAM01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z274TAM01_UPD_CNT"), ".", ",") ;
            n274TAM01_UPD_CNT = ((0==A274TAM01_UPD_CNT) ? true : false) ;
            Z206TAM01_SYS_NM = httpContext.cgiGet( "Z206TAM01_SYS_NM") ;
            n206TAM01_SYS_NM = ((GXutil.strcmp("", A206TAM01_SYS_NM)==0) ? true : false) ;
            Z975TAM01_VERSION = httpContext.cgiGet( "Z975TAM01_VERSION") ;
            n975TAM01_VERSION = ((GXutil.strcmp("", A975TAM01_VERSION)==0) ? true : false) ;
            Z976TAM01_BIKO = httpContext.cgiGet( "Z976TAM01_BIKO") ;
            n976TAM01_BIKO = ((GXutil.strcmp("", A976TAM01_BIKO)==0) ? true : false) ;
            Z273TAM01_DEL_FLG = httpContext.cgiGet( "Z273TAM01_DEL_FLG") ;
            n273TAM01_DEL_FLG = ((GXutil.strcmp("", A273TAM01_DEL_FLG)==0) ? true : false) ;
            Z222TAM01_CRT_PROG_NM = httpContext.cgiGet( "Z222TAM01_CRT_PROG_NM") ;
            n222TAM01_CRT_PROG_NM = ((GXutil.strcmp("", A222TAM01_CRT_PROG_NM)==0) ? true : false) ;
            Z224TAM01_UPD_PROG_NM = httpContext.cgiGet( "Z224TAM01_UPD_PROG_NM") ;
            n224TAM01_UPD_PROG_NM = ((GXutil.strcmp("", A224TAM01_UPD_PROG_NM)==0) ? true : false) ;
            A274TAM01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z274TAM01_UPD_CNT"), ".", ",") ;
            n274TAM01_UPD_CNT = false ;
            n274TAM01_UPD_CNT = ((0==A274TAM01_UPD_CNT) ? true : false) ;
            O274TAM01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O274TAM01_UPD_CNT"), ".", ",") ;
            n274TAM01_UPD_CNT = ((0==A274TAM01_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A274TAM01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "TAM01_UPD_CNT"), ".", ",") ;
            n274TAM01_UPD_CNT = ((0==A274TAM01_UPD_CNT) ? true : false) ;
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
               A1TAM01_SYS_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
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
                     /* Execute user event: e11012 */
                     e11012 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_SELECT'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12012 */
                     e12012 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "'BTN_CLER'") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e13012 */
                     e13012 ();
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
            initAll011( ) ;
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
      disableAttributes011( ) ;
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

   public void confirm_010( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls011( ) ;
         }
         else
         {
            checkExtendedTable011( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors011( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      }
      if ( AnyError == 0 )
      {
         confirmValues010( ) ;
      }
   }

   public void resetCaption010( )
   {
   }

   public void e11012( )
   {
      /* Start Routine */
      AV7C_TAM02_APP_ID = "TAM01" ;
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
      tam01_sys_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12W_MSG = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12W_MSG", AV12W_MSG);
      imgBtn_delete2_Jsonclick = "confirm('"+AV12W_MSG+"')" ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Jsonclick", imgBtn_delete2_Jsonclick);
   }

   public void e12012( )
   {
      /* 'BTN_SELECT' Routine */
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "tam01_sel"+GXutil.URLEncode(GXutil.rtrim(A1TAM01_SYS_ID)) ;
      httpContext.popup(formatLink("tam01_sel") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey), new Object[] {"A1TAM01_SYS_ID"});
   }

   public void e13012( )
   {
      /* 'BTN_CLER' Routine */
      httpContext.wjLoc = formatLink("tam01_sys")  ;
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
      tam01_sys_impl.this.AV9W_ERRCD = GXv_char2[0] ;
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
      tam01_sys_impl.this.AV10W_KNGN_FLG = GXv_char2[0] ;
      tam01_sys_impl.this.AV9W_ERRCD = GXv_char4[0] ;
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

   public void zm011( int GX_JID )
   {
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z221TAM01_CRT_DATETIME = T00013_A221TAM01_CRT_DATETIME[0] ;
            Z260TAM01_CRT_USER_ID = T00013_A260TAM01_CRT_USER_ID[0] ;
            Z223TAM01_UPD_DATETIME = T00013_A223TAM01_UPD_DATETIME[0] ;
            Z261TAM01_UPD_USER_ID = T00013_A261TAM01_UPD_USER_ID[0] ;
            Z274TAM01_UPD_CNT = T00013_A274TAM01_UPD_CNT[0] ;
            Z206TAM01_SYS_NM = T00013_A206TAM01_SYS_NM[0] ;
            Z975TAM01_VERSION = T00013_A975TAM01_VERSION[0] ;
            Z976TAM01_BIKO = T00013_A976TAM01_BIKO[0] ;
            Z273TAM01_DEL_FLG = T00013_A273TAM01_DEL_FLG[0] ;
            Z222TAM01_CRT_PROG_NM = T00013_A222TAM01_CRT_PROG_NM[0] ;
            Z224TAM01_UPD_PROG_NM = T00013_A224TAM01_UPD_PROG_NM[0] ;
         }
         else
         {
            Z221TAM01_CRT_DATETIME = A221TAM01_CRT_DATETIME ;
            Z260TAM01_CRT_USER_ID = A260TAM01_CRT_USER_ID ;
            Z223TAM01_UPD_DATETIME = A223TAM01_UPD_DATETIME ;
            Z261TAM01_UPD_USER_ID = A261TAM01_UPD_USER_ID ;
            Z274TAM01_UPD_CNT = A274TAM01_UPD_CNT ;
            Z206TAM01_SYS_NM = A206TAM01_SYS_NM ;
            Z975TAM01_VERSION = A975TAM01_VERSION ;
            Z976TAM01_BIKO = A976TAM01_BIKO ;
            Z273TAM01_DEL_FLG = A273TAM01_DEL_FLG ;
            Z222TAM01_CRT_PROG_NM = A222TAM01_CRT_PROG_NM ;
            Z224TAM01_UPD_PROG_NM = A224TAM01_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -27 )
      {
         Z1TAM01_SYS_ID = A1TAM01_SYS_ID ;
         Z221TAM01_CRT_DATETIME = A221TAM01_CRT_DATETIME ;
         Z260TAM01_CRT_USER_ID = A260TAM01_CRT_USER_ID ;
         Z223TAM01_UPD_DATETIME = A223TAM01_UPD_DATETIME ;
         Z261TAM01_UPD_USER_ID = A261TAM01_UPD_USER_ID ;
         Z274TAM01_UPD_CNT = A274TAM01_UPD_CNT ;
         Z206TAM01_SYS_NM = A206TAM01_SYS_NM ;
         Z975TAM01_VERSION = A975TAM01_VERSION ;
         Z976TAM01_BIKO = A976TAM01_BIKO ;
         Z273TAM01_DEL_FLG = A273TAM01_DEL_FLG ;
         Z222TAM01_CRT_PROG_NM = A222TAM01_CRT_PROG_NM ;
         Z224TAM01_UPD_PROG_NM = A224TAM01_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTAM01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_UPD_PROG_NM_Enabled, 5, 0)));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTAM01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  )
      {
         edtTAM01_SYS_ID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM01_SYS_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_SYS_ID_Enabled, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM01_CRT_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM01_CRT_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM01_CRT_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM01_CRT_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM01_UPD_DATETIME_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_DATETIME_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM01_UPD_DATETIME_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         edtTAM01_UPD_PROG_NM_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_PROG_NM_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTAM01_UPD_PROG_NM_Visible, 5, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A273TAM01_DEL_FLG)==0) && ( Gx_BScreen == 0 ) )
      {
         A273TAM01_DEL_FLG = "0" ;
         n273TAM01_DEL_FLG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A222TAM01_CRT_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A222TAM01_CRT_PROG_NM = AV14Pgmname ;
         n222TAM01_CRT_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && (GXutil.strcmp("", A224TAM01_UPD_PROG_NM)==0) && ( Gx_BScreen == 0 ) )
      {
         A224TAM01_UPD_PROG_NM = AV14Pgmname ;
         n224TAM01_UPD_PROG_NM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
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

   public void load011( )
   {
      /* Using cursor T00014 */
      pr_default.execute(2, new Object[] {A1TAM01_SYS_ID});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A221TAM01_CRT_DATETIME = T00014_A221TAM01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n221TAM01_CRT_DATETIME = T00014_n221TAM01_CRT_DATETIME[0] ;
         A260TAM01_CRT_USER_ID = T00014_A260TAM01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
         n260TAM01_CRT_USER_ID = T00014_n260TAM01_CRT_USER_ID[0] ;
         A223TAM01_UPD_DATETIME = T00014_A223TAM01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n223TAM01_UPD_DATETIME = T00014_n223TAM01_UPD_DATETIME[0] ;
         A261TAM01_UPD_USER_ID = T00014_A261TAM01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
         n261TAM01_UPD_USER_ID = T00014_n261TAM01_UPD_USER_ID[0] ;
         A274TAM01_UPD_CNT = T00014_A274TAM01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
         n274TAM01_UPD_CNT = T00014_n274TAM01_UPD_CNT[0] ;
         A206TAM01_SYS_NM = T00014_A206TAM01_SYS_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
         n206TAM01_SYS_NM = T00014_n206TAM01_SYS_NM[0] ;
         A975TAM01_VERSION = T00014_A975TAM01_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A975TAM01_VERSION", A975TAM01_VERSION);
         n975TAM01_VERSION = T00014_n975TAM01_VERSION[0] ;
         A976TAM01_BIKO = T00014_A976TAM01_BIKO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A976TAM01_BIKO", A976TAM01_BIKO);
         n976TAM01_BIKO = T00014_n976TAM01_BIKO[0] ;
         A273TAM01_DEL_FLG = T00014_A273TAM01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
         n273TAM01_DEL_FLG = T00014_n273TAM01_DEL_FLG[0] ;
         A222TAM01_CRT_PROG_NM = T00014_A222TAM01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
         n222TAM01_CRT_PROG_NM = T00014_n222TAM01_CRT_PROG_NM[0] ;
         A224TAM01_UPD_PROG_NM = T00014_A224TAM01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
         n224TAM01_UPD_PROG_NM = T00014_n224TAM01_UPD_PROG_NM[0] ;
         zm011( -27) ;
      }
      pr_default.close(2);
      onLoadActions011( ) ;
   }

   public void onLoadActions011( )
   {
      AV14Pgmname = "TAM01_SYS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void checkExtendedTable011( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV14Pgmname = "TAM01_SYS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
   }

   public void closeExtendedTableCursors011( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey011( )
   {
      /* Using cursor T00015 */
      pr_default.execute(3, new Object[] {A1TAM01_SYS_ID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00013 */
      pr_default.execute(1, new Object[] {A1TAM01_SYS_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm011( 27) ;
         RcdFound1 = (short)(1) ;
         A1TAM01_SYS_ID = T00013_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         A221TAM01_CRT_DATETIME = T00013_A221TAM01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n221TAM01_CRT_DATETIME = T00013_n221TAM01_CRT_DATETIME[0] ;
         A260TAM01_CRT_USER_ID = T00013_A260TAM01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
         n260TAM01_CRT_USER_ID = T00013_n260TAM01_CRT_USER_ID[0] ;
         A223TAM01_UPD_DATETIME = T00013_A223TAM01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n223TAM01_UPD_DATETIME = T00013_n223TAM01_UPD_DATETIME[0] ;
         A261TAM01_UPD_USER_ID = T00013_A261TAM01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
         n261TAM01_UPD_USER_ID = T00013_n261TAM01_UPD_USER_ID[0] ;
         A274TAM01_UPD_CNT = T00013_A274TAM01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
         n274TAM01_UPD_CNT = T00013_n274TAM01_UPD_CNT[0] ;
         A206TAM01_SYS_NM = T00013_A206TAM01_SYS_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
         n206TAM01_SYS_NM = T00013_n206TAM01_SYS_NM[0] ;
         A975TAM01_VERSION = T00013_A975TAM01_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A975TAM01_VERSION", A975TAM01_VERSION);
         n975TAM01_VERSION = T00013_n975TAM01_VERSION[0] ;
         A976TAM01_BIKO = T00013_A976TAM01_BIKO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A976TAM01_BIKO", A976TAM01_BIKO);
         n976TAM01_BIKO = T00013_n976TAM01_BIKO[0] ;
         A273TAM01_DEL_FLG = T00013_A273TAM01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
         n273TAM01_DEL_FLG = T00013_n273TAM01_DEL_FLG[0] ;
         A222TAM01_CRT_PROG_NM = T00013_A222TAM01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
         n222TAM01_CRT_PROG_NM = T00013_n222TAM01_CRT_PROG_NM[0] ;
         A224TAM01_UPD_PROG_NM = T00013_A224TAM01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
         n224TAM01_UPD_PROG_NM = T00013_n224TAM01_UPD_PROG_NM[0] ;
         O274TAM01_UPD_CNT = A274TAM01_UPD_CNT ;
         n274TAM01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
         Z1TAM01_SYS_ID = A1TAM01_SYS_ID ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load011( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey011( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey011( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey011( ) ;
      if ( RcdFound1 == 0 )
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
      RcdFound1 = (short)(0) ;
      /* Using cursor T00016 */
      pr_default.execute(4, new Object[] {A1TAM01_SYS_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00016_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00016_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) > 0 ) ) )
         {
            A1TAM01_SYS_ID = T00016_A1TAM01_SYS_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T00017 */
      pr_default.execute(5, new Object[] {A1TAM01_SYS_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00017_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00017_A1TAM01_SYS_ID[0], A1TAM01_SYS_ID) < 0 ) ) )
         {
            A1TAM01_SYS_ID = T00017_A1TAM01_SYS_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey011( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert011( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 )
            {
               A1TAM01_SYS_ID = Z1TAM01_SYS_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAM01_SYS_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update011( ) ;
               GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert011( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM01_SYS_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert011( ) ;
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
      if ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 )
      {
         A1TAM01_SYS_ID = Z1TAM01_SYS_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
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
      getKey011( ) ;
      if ( RcdFound1 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM01_SYS_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 )
         {
            A1TAM01_SYS_ID = Z1TAM01_SYS_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "TAM01_SYS_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
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
         if ( GXutil.strcmp(A1TAM01_SYS_ID, Z1TAM01_SYS_ID) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM01_SYS_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tam01_sys");
      GX_FocusControl = edtTAM01_SYS_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_010( ) ;
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
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTAM01_SYS_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM01_SYS_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd011( ) ;
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
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM01_SYS_NM_Internalname ;
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
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM01_SYS_NM_Internalname ;
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
      scanStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1 != 0 )
         {
            scanNext011( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM01_SYS_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd011( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency011( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00012 */
         pr_default.execute(0, new Object[] {A1TAM01_SYS_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM01_SYS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z221TAM01_CRT_DATETIME.equals( T00012_A221TAM01_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z260TAM01_CRT_USER_ID, T00012_A260TAM01_CRT_USER_ID[0]) != 0 ) || !( Z223TAM01_UPD_DATETIME.equals( T00012_A223TAM01_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z261TAM01_UPD_USER_ID, T00012_A261TAM01_UPD_USER_ID[0]) != 0 ) || ( Z274TAM01_UPD_CNT != T00012_A274TAM01_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z206TAM01_SYS_NM, T00012_A206TAM01_SYS_NM[0]) != 0 ) || ( GXutil.strcmp(Z975TAM01_VERSION, T00012_A975TAM01_VERSION[0]) != 0 ) || ( GXutil.strcmp(Z976TAM01_BIKO, T00012_A976TAM01_BIKO[0]) != 0 ) || ( GXutil.strcmp(Z273TAM01_DEL_FLG, T00012_A273TAM01_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z222TAM01_CRT_PROG_NM, T00012_A222TAM01_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z224TAM01_UPD_PROG_NM, T00012_A224TAM01_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM01_SYS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         zm011( 0) ;
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00018 */
                  pr_default.execute(6, new Object[] {A1TAM01_SYS_ID, new Boolean(n221TAM01_CRT_DATETIME), A221TAM01_CRT_DATETIME, new Boolean(n260TAM01_CRT_USER_ID), A260TAM01_CRT_USER_ID, new Boolean(n223TAM01_UPD_DATETIME), A223TAM01_UPD_DATETIME, new Boolean(n261TAM01_UPD_USER_ID), A261TAM01_UPD_USER_ID, new Boolean(n274TAM01_UPD_CNT), new Long(A274TAM01_UPD_CNT), new Boolean(n206TAM01_SYS_NM), A206TAM01_SYS_NM, new Boolean(n975TAM01_VERSION), A975TAM01_VERSION, new Boolean(n976TAM01_BIKO), A976TAM01_BIKO, new Boolean(n273TAM01_DEL_FLG), A273TAM01_DEL_FLG, new Boolean(n222TAM01_CRT_PROG_NM), A222TAM01_CRT_PROG_NM, new Boolean(n224TAM01_UPD_PROG_NM), A224TAM01_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM01_SYS") ;
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     new tam01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A206TAM01_SYS_NM, A273TAM01_DEL_FLG, A221TAM01_CRT_DATETIME, A260TAM01_CRT_USER_ID, A222TAM01_CRT_PROG_NM, A223TAM01_UPD_DATETIME, A261TAM01_UPD_USER_ID, A224TAM01_UPD_PROG_NM, A274TAM01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption010( ) ;
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
            load011( ) ;
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void update011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00019 */
                  pr_default.execute(7, new Object[] {new Boolean(n221TAM01_CRT_DATETIME), A221TAM01_CRT_DATETIME, new Boolean(n260TAM01_CRT_USER_ID), A260TAM01_CRT_USER_ID, new Boolean(n223TAM01_UPD_DATETIME), A223TAM01_UPD_DATETIME, new Boolean(n261TAM01_UPD_USER_ID), A261TAM01_UPD_USER_ID, new Boolean(n274TAM01_UPD_CNT), new Long(A274TAM01_UPD_CNT), new Boolean(n206TAM01_SYS_NM), A206TAM01_SYS_NM, new Boolean(n975TAM01_VERSION), A975TAM01_VERSION, new Boolean(n976TAM01_BIKO), A976TAM01_BIKO, new Boolean(n273TAM01_DEL_FLG), A273TAM01_DEL_FLG, new Boolean(n222TAM01_CRT_PROG_NM), A222TAM01_CRT_PROG_NM, new Boolean(n224TAM01_UPD_PROG_NM), A224TAM01_UPD_PROG_NM, A1TAM01_SYS_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM01_SYS") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM01_SYS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate011( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     new tam01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A206TAM01_SYS_NM, A273TAM01_DEL_FLG, A221TAM01_CRT_DATETIME, A260TAM01_CRT_USER_ID, A222TAM01_CRT_PROG_NM, A223TAM01_UPD_DATETIME, A261TAM01_UPD_USER_ID, A224TAM01_UPD_PROG_NM, A274TAM01_UPD_CNT) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
                     httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                     httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
                     httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
                     httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption010( ) ;
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
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void deferredUpdate011( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls011( ) ;
         afterConfirm011( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete011( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000110 */
               pr_default.execute(8, new Object[] {A1TAM01_SYS_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM01_SYS") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  new tam01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A206TAM01_SYS_NM, A273TAM01_DEL_FLG, A221TAM01_CRT_DATETIME, A260TAM01_CRT_USER_ID, A222TAM01_CRT_PROG_NM, A223TAM01_UPD_DATETIME, A261TAM01_UPD_USER_ID, A224TAM01_UPD_PROG_NM, A274TAM01_UPD_CNT) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
                  httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
                  httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
                  httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
                  httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1 == 0 )
                     {
                        initAll011( ) ;
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
                     resetCaption010( ) ;
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
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel011( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls011( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV14Pgmname = "TAM01_SYS" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000111 */
         pr_default.execute(9, new Object[] {A1TAM01_SYS_ID});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"メニューIDマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
      }
   }

   public void endLevel011( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete011( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tam01_sys");
         if ( AnyError == 0 )
         {
            confirmValues010( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tam01_sys");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart011( )
   {
      /* Scan By routine */
      /* Using cursor T000112 */
      pr_default.execute(10);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1TAM01_SYS_ID = T000112_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext011( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1TAM01_SYS_ID = T000112_A1TAM01_SYS_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      }
   }

   public void scanEnd011( )
   {
      pr_default.close(10);
   }

   public void afterConfirm011( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A1TAM01_SYS_ID)==0) )
      {
         httpContext.GX_msglist.addItem("システムIDを入力してください", 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 2 < GXutil.byteCount( A1TAM01_SYS_ID, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("システムIDは半角2桁以内になるようにしてください。", 1, "TAM01_SYS_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM01_SYS_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (GXutil.strcmp("", A206TAM01_SYS_NM)==0) )
      {
         httpContext.GX_msglist.addItem("システム名を入力してください", 1, "TAM01_SYS_NM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM01_SYS_NM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( 40 < GXutil.byteCount( A206TAM01_SYS_NM, "Shift-JIS") )
      {
         httpContext.GX_msglist.addItem("システム名は全角20桁又は半角40桁以内になるようにしてください。", 1, "TAM01_SYS_NM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM01_SYS_NM_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert011( )
   {
      /* Before Insert Rules */
      A221TAM01_CRT_DATETIME = GXutil.now( ) ;
      n221TAM01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A260TAM01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam01_sys_impl.this.GXt_char1 = GXv_char4[0] ;
      A260TAM01_CRT_USER_ID = GXt_char1 ;
      n260TAM01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
      A223TAM01_UPD_DATETIME = GXutil.now( ) ;
      n223TAM01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A261TAM01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam01_sys_impl.this.GXt_char1 = GXv_char4[0] ;
      A261TAM01_UPD_USER_ID = GXt_char1 ;
      n261TAM01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
      A274TAM01_UPD_CNT = (long)(O274TAM01_UPD_CNT+1) ;
      n274TAM01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate011( )
   {
      /* Before Update Rules */
      A223TAM01_UPD_DATETIME = GXutil.now( ) ;
      n223TAM01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A261TAM01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam01_sys_impl.this.GXt_char1 = GXv_char4[0] ;
      A261TAM01_UPD_USER_ID = GXt_char1 ;
      n261TAM01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
      A274TAM01_UPD_CNT = (long)(O274TAM01_UPD_CNT+1) ;
      n274TAM01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
   }

   public void beforeDelete011( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete011( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate011( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes011( )
   {
      edtTAM01_SYS_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_SYS_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_SYS_ID_Enabled, 5, 0)));
      edtTAM01_SYS_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_SYS_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_SYS_NM_Enabled, 5, 0)));
      edtTAM01_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_VERSION_Enabled, 5, 0)));
      edtTAM01_BIKO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_BIKO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_BIKO_Enabled, 5, 0)));
      radTAM01_DEL_FLG.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, radTAM01_DEL_FLG.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( radTAM01_DEL_FLG.getEnabled(), 5, 0)));
      edtTAM01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM01_UPD_PROG_NM_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues010( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "システムIDマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317134547");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam01_sys") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm011( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z1TAM01_SYS_ID", GXutil.rtrim( Z1TAM01_SYS_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z221TAM01_CRT_DATETIME", localUtil.ttoc( Z221TAM01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z260TAM01_CRT_USER_ID", GXutil.rtrim( Z260TAM01_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z223TAM01_UPD_DATETIME", localUtil.ttoc( Z223TAM01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z261TAM01_UPD_USER_ID", GXutil.rtrim( Z261TAM01_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z274TAM01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z274TAM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z206TAM01_SYS_NM", GXutil.rtrim( Z206TAM01_SYS_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z975TAM01_VERSION", GXutil.rtrim( Z975TAM01_VERSION));
      GxWebStd.gx_hidden_field( httpContext, "Z976TAM01_BIKO", GXutil.rtrim( Z976TAM01_BIKO));
      GxWebStd.gx_hidden_field( httpContext, "Z273TAM01_DEL_FLG", GXutil.rtrim( Z273TAM01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z222TAM01_CRT_PROG_NM", GXutil.rtrim( Z222TAM01_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z224TAM01_UPD_PROG_NM", GXutil.rtrim( Z224TAM01_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O274TAM01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O274TAM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "TAM01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( A274TAM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TAM01_SYS" ;
   }

   public String getPgmdesc( )
   {
      return "システムIDマスタ" ;
   }

   public void initializeNonKey011( )
   {
      A221TAM01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n221TAM01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n221TAM01_CRT_DATETIME = (GXutil.nullDate().equals(A221TAM01_CRT_DATETIME) ? true : false) ;
      A260TAM01_CRT_USER_ID = "" ;
      n260TAM01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
      n260TAM01_CRT_USER_ID = ((GXutil.strcmp("", A260TAM01_CRT_USER_ID)==0) ? true : false) ;
      A223TAM01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n223TAM01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n223TAM01_UPD_DATETIME = (GXutil.nullDate().equals(A223TAM01_UPD_DATETIME) ? true : false) ;
      A261TAM01_UPD_USER_ID = "" ;
      n261TAM01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
      n261TAM01_UPD_USER_ID = ((GXutil.strcmp("", A261TAM01_UPD_USER_ID)==0) ? true : false) ;
      A274TAM01_UPD_CNT = 0 ;
      n274TAM01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
      A206TAM01_SYS_NM = "" ;
      n206TAM01_SYS_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
      n206TAM01_SYS_NM = ((GXutil.strcmp("", A206TAM01_SYS_NM)==0) ? true : false) ;
      A975TAM01_VERSION = "" ;
      n975TAM01_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A975TAM01_VERSION", A975TAM01_VERSION);
      n975TAM01_VERSION = ((GXutil.strcmp("", A975TAM01_VERSION)==0) ? true : false) ;
      A976TAM01_BIKO = "" ;
      n976TAM01_BIKO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A976TAM01_BIKO", A976TAM01_BIKO);
      n976TAM01_BIKO = ((GXutil.strcmp("", A976TAM01_BIKO)==0) ? true : false) ;
      A273TAM01_DEL_FLG = "0" ;
      n273TAM01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
      A222TAM01_CRT_PROG_NM = AV14Pgmname ;
      n222TAM01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
      A224TAM01_UPD_PROG_NM = AV14Pgmname ;
      n224TAM01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
      O274TAM01_UPD_CNT = A274TAM01_UPD_CNT ;
      n274TAM01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
   }

   public void initAll011( )
   {
      A1TAM01_SYS_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      initializeNonKey011( ) ;
   }

   public void standaloneModalInsert( )
   {
      A273TAM01_DEL_FLG = i273TAM01_DEL_FLG ;
      n273TAM01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
      A222TAM01_CRT_PROG_NM = i222TAM01_CRT_PROG_NM ;
      n222TAM01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
      A224TAM01_UPD_PROG_NM = i224TAM01_UPD_PROG_NM ;
      n224TAM01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?8960");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317134558");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam01_sys.js", "?20177317134558");
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
      lblTextblocktam01_sys_id_Internalname = "TEXTBLOCKTAM01_SYS_ID" ;
      edtTAM01_SYS_ID_Internalname = "TAM01_SYS_ID" ;
      imgImage20_Internalname = "IMAGE20" ;
      lblTextblocktam01_sys_nm_Internalname = "TEXTBLOCKTAM01_SYS_NM" ;
      edtTAM01_SYS_NM_Internalname = "TAM01_SYS_NM" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtTAM01_VERSION_Internalname = "TAM01_VERSION" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtTAM01_BIKO_Internalname = "TAM01_BIKO" ;
      lblTextblocktam01_del_flg_Internalname = "TEXTBLOCKTAM01_DEL_FLG" ;
      radTAM01_DEL_FLG.setInternalname( "TAM01_DEL_FLG" );
      lblTextblocktam01_crt_datetime_Internalname = "TEXTBLOCKTAM01_CRT_DATETIME" ;
      edtTAM01_CRT_DATETIME_Internalname = "TAM01_CRT_DATETIME" ;
      lblTextblocktam01_crt_user_id_Internalname = "TEXTBLOCKTAM01_CRT_USER_ID" ;
      edtTAM01_CRT_USER_ID_Internalname = "TAM01_CRT_USER_ID" ;
      lblTextblocktam01_crt_prog_nm_Internalname = "TEXTBLOCKTAM01_CRT_PROG_NM" ;
      edtTAM01_CRT_PROG_NM_Internalname = "TAM01_CRT_PROG_NM" ;
      lblTextblocktam01_upd_datetime_Internalname = "TEXTBLOCKTAM01_UPD_DATETIME" ;
      edtTAM01_UPD_DATETIME_Internalname = "TAM01_UPD_DATETIME" ;
      lblTextblocktam01_upd_user_id_Internalname = "TEXTBLOCKTAM01_UPD_USER_ID" ;
      edtTAM01_UPD_USER_ID_Internalname = "TAM01_UPD_USER_ID" ;
      lblTextblocktam01_upd_prog_nm_Internalname = "TEXTBLOCKTAM01_UPD_PROG_NM" ;
      edtTAM01_UPD_PROG_NM_Internalname = "TAM01_UPD_PROG_NM" ;
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
      edtTAM01_UPD_PROG_NM_Jsonclick = "" ;
      edtTAM01_UPD_PROG_NM_Enabled = 0 ;
      edtTAM01_UPD_PROG_NM_Visible = 1 ;
      edtTAM01_UPD_USER_ID_Jsonclick = "" ;
      edtTAM01_UPD_USER_ID_Enabled = 0 ;
      edtTAM01_UPD_DATETIME_Jsonclick = "" ;
      edtTAM01_UPD_DATETIME_Enabled = 0 ;
      edtTAM01_UPD_DATETIME_Visible = 1 ;
      edtTAM01_CRT_PROG_NM_Jsonclick = "" ;
      edtTAM01_CRT_PROG_NM_Enabled = 0 ;
      edtTAM01_CRT_PROG_NM_Visible = 1 ;
      edtTAM01_CRT_USER_ID_Jsonclick = "" ;
      edtTAM01_CRT_USER_ID_Enabled = 0 ;
      edtTAM01_CRT_DATETIME_Jsonclick = "" ;
      edtTAM01_CRT_DATETIME_Enabled = 0 ;
      edtTAM01_CRT_DATETIME_Visible = 1 ;
      radTAM01_DEL_FLG.setJsonclick( "" );
      radTAM01_DEL_FLG.setEnabled( 1 );
      edtTAM01_BIKO_Enabled = 1 ;
      edtTAM01_VERSION_Jsonclick = "" ;
      edtTAM01_VERSION_Enabled = 1 ;
      edtTAM01_SYS_NM_Jsonclick = "" ;
      edtTAM01_SYS_NM_Enabled = 1 ;
      imgImage20_Visible = 1 ;
      edtTAM01_SYS_ID_Jsonclick = "" ;
      edtTAM01_SYS_ID_Enabled = 1 ;
      imgImage19_Visible = 1 ;
      lblBtn_cancel_Enabled = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx7asatam01_crt_user_id011( String Gx_mode )
   {
      GXt_char1 = A260TAM01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam01_sys_impl.this.GXt_char1 = GXv_char4[0] ;
      A260TAM01_CRT_USER_ID = GXt_char1 ;
      n260TAM01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A260TAM01_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx9asatam01_upd_user_id011( String Gx_mode )
   {
      GXt_char1 = A261TAM01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam01_sys_impl.this.GXt_char1 = GXv_char4[0] ;
      A261TAM01_UPD_USER_ID = GXt_char1 ;
      n261TAM01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A261TAM01_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_24_011( String AV14Pgmname ,
                          String Gx_mode ,
                          String A1TAM01_SYS_ID ,
                          String A206TAM01_SYS_NM ,
                          String A273TAM01_DEL_FLG ,
                          java.util.Date A221TAM01_CRT_DATETIME ,
                          String A260TAM01_CRT_USER_ID ,
                          String A222TAM01_CRT_PROG_NM ,
                          java.util.Date A223TAM01_UPD_DATETIME ,
                          String A261TAM01_UPD_USER_ID ,
                          String A224TAM01_UPD_PROG_NM ,
                          long A274TAM01_UPD_CNT )
   {
      new tam01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A206TAM01_SYS_NM, A273TAM01_DEL_FLG, A221TAM01_CRT_DATETIME, A260TAM01_CRT_USER_ID, A222TAM01_CRT_PROG_NM, A223TAM01_UPD_DATETIME, A261TAM01_UPD_USER_ID, A224TAM01_UPD_PROG_NM, A274TAM01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
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

   public void xc_25_011( String AV14Pgmname ,
                          String Gx_mode ,
                          String A1TAM01_SYS_ID ,
                          String A206TAM01_SYS_NM ,
                          String A273TAM01_DEL_FLG ,
                          java.util.Date A221TAM01_CRT_DATETIME ,
                          String A260TAM01_CRT_USER_ID ,
                          String A222TAM01_CRT_PROG_NM ,
                          java.util.Date A223TAM01_UPD_DATETIME ,
                          String A261TAM01_UPD_USER_ID ,
                          String A224TAM01_UPD_PROG_NM ,
                          long A274TAM01_UPD_CNT )
   {
      new tam01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A206TAM01_SYS_NM, A273TAM01_DEL_FLG, A221TAM01_CRT_DATETIME, A260TAM01_CRT_USER_ID, A222TAM01_CRT_PROG_NM, A223TAM01_UPD_DATETIME, A261TAM01_UPD_USER_ID, A224TAM01_UPD_PROG_NM, A274TAM01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
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

   public void xc_26_011( String AV14Pgmname ,
                          String Gx_mode ,
                          String A1TAM01_SYS_ID ,
                          String A206TAM01_SYS_NM ,
                          String A273TAM01_DEL_FLG ,
                          java.util.Date A221TAM01_CRT_DATETIME ,
                          String A260TAM01_CRT_USER_ID ,
                          String A222TAM01_CRT_PROG_NM ,
                          java.util.Date A223TAM01_UPD_DATETIME ,
                          String A261TAM01_UPD_USER_ID ,
                          String A224TAM01_UPD_PROG_NM ,
                          long A274TAM01_UPD_CNT )
   {
      new tam01_pc01_datalog(remoteHandle, context).execute( AV14Pgmname, Gx_mode, A1TAM01_SYS_ID, A206TAM01_SYS_NM, A273TAM01_DEL_FLG, A221TAM01_CRT_DATETIME, A260TAM01_CRT_USER_ID, A222TAM01_CRT_PROG_NM, A223TAM01_UPD_DATETIME, A261TAM01_UPD_USER_ID, A224TAM01_UPD_PROG_NM, A274TAM01_UPD_CNT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A1TAM01_SYS_ID", A1TAM01_SYS_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A206TAM01_SYS_NM", A206TAM01_SYS_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A273TAM01_DEL_FLG", A273TAM01_DEL_FLG);
      httpContext.ajax_rsp_assign_attri("", false, "A221TAM01_CRT_DATETIME", localUtil.ttoc( A221TAM01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A260TAM01_CRT_USER_ID", A260TAM01_CRT_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A222TAM01_CRT_PROG_NM", A222TAM01_CRT_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A223TAM01_UPD_DATETIME", localUtil.ttoc( A223TAM01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A261TAM01_UPD_USER_ID", A261TAM01_UPD_USER_ID);
      httpContext.ajax_rsp_assign_attri("", false, "A224TAM01_UPD_PROG_NM", A224TAM01_UPD_PROG_NM);
      httpContext.ajax_rsp_assign_attri("", false, "A274TAM01_UPD_CNT", GXutil.ltrim( GXutil.str( A274TAM01_UPD_CNT, 10, 0)));
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
      GX_FocusControl = edtTAM01_SYS_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tam01_sys_id( String GX_Parm1 ,
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
      A1TAM01_SYS_ID = GX_Parm1 ;
      A221TAM01_CRT_DATETIME = GX_Parm2 ;
      n221TAM01_CRT_DATETIME = false ;
      A260TAM01_CRT_USER_ID = GX_Parm3 ;
      n260TAM01_CRT_USER_ID = false ;
      A223TAM01_UPD_DATETIME = GX_Parm4 ;
      n223TAM01_UPD_DATETIME = false ;
      A261TAM01_UPD_USER_ID = GX_Parm5 ;
      n261TAM01_UPD_USER_ID = false ;
      A274TAM01_UPD_CNT = GX_Parm6 ;
      n274TAM01_UPD_CNT = false ;
      A206TAM01_SYS_NM = GX_Parm7 ;
      n206TAM01_SYS_NM = false ;
      A975TAM01_VERSION = GX_Parm8 ;
      n975TAM01_VERSION = false ;
      A976TAM01_BIKO = GX_Parm9 ;
      n976TAM01_BIKO = false ;
      A273TAM01_DEL_FLG = GX_Parm10 ;
      n273TAM01_DEL_FLG = false ;
      A222TAM01_CRT_PROG_NM = GX_Parm11 ;
      n222TAM01_CRT_PROG_NM = false ;
      A224TAM01_UPD_PROG_NM = GX_Parm12 ;
      n224TAM01_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A221TAM01_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A260TAM01_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A223TAM01_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A261TAM01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A274TAM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A206TAM01_SYS_NM));
      isValidOutput.add(GXutil.rtrim( A975TAM01_VERSION));
      isValidOutput.add(GXutil.rtrim( A976TAM01_BIKO));
      isValidOutput.add(GXutil.rtrim( A273TAM01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A222TAM01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A224TAM01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV14Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z1TAM01_SYS_ID));
      isValidOutput.add(localUtil.ttoc( Z221TAM01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z260TAM01_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z223TAM01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z261TAM01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z274TAM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z206TAM01_SYS_NM));
      isValidOutput.add(GXutil.rtrim( Z975TAM01_VERSION));
      isValidOutput.add(GXutil.rtrim( Z976TAM01_BIKO));
      isValidOutput.add(GXutil.rtrim( Z273TAM01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z222TAM01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z224TAM01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV14Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O274TAM01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(edtTAM01_SYS_ID_Enabled);
      isValidOutput.add(edtTAM01_CRT_DATETIME_Visible);
      isValidOutput.add(edtTAM01_CRT_PROG_NM_Visible);
      isValidOutput.add(edtTAM01_UPD_DATETIME_Visible);
      isValidOutput.add(edtTAM01_UPD_PROG_NM_Visible);
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
      Z1TAM01_SYS_ID = "" ;
      Z221TAM01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z260TAM01_CRT_USER_ID = "" ;
      Z223TAM01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z261TAM01_UPD_USER_ID = "" ;
      Z206TAM01_SYS_NM = "" ;
      Z975TAM01_VERSION = "" ;
      Z976TAM01_BIKO = "" ;
      Z273TAM01_DEL_FLG = "" ;
      Z222TAM01_CRT_PROG_NM = "" ;
      Z224TAM01_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14Pgmname = "" ;
      Gx_mode = "" ;
      A1TAM01_SYS_ID = "" ;
      A206TAM01_SYS_NM = "" ;
      A273TAM01_DEL_FLG = "" ;
      A221TAM01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A260TAM01_CRT_USER_ID = "" ;
      A222TAM01_CRT_PROG_NM = "" ;
      A223TAM01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A261TAM01_UPD_USER_ID = "" ;
      A224TAM01_UPD_PROG_NM = "" ;
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
      lblTextblocktam01_sys_id_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblocktam01_sys_nm_Jsonclick = "" ;
      lblTextblock1_Jsonclick = "" ;
      A975TAM01_VERSION = "" ;
      lblTextblock2_Jsonclick = "" ;
      A976TAM01_BIKO = "" ;
      lblTextblocktam01_del_flg_Jsonclick = "" ;
      lblTextblocktam01_crt_datetime_Jsonclick = "" ;
      lblTextblocktam01_crt_user_id_Jsonclick = "" ;
      lblTextblocktam01_crt_prog_nm_Jsonclick = "" ;
      lblTextblocktam01_upd_datetime_Jsonclick = "" ;
      lblTextblocktam01_upd_user_id_Jsonclick = "" ;
      lblTextblocktam01_upd_prog_nm_Jsonclick = "" ;
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
      T00014_A1TAM01_SYS_ID = new String[] {""} ;
      T00014_A221TAM01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00014_n221TAM01_CRT_DATETIME = new boolean[] {false} ;
      T00014_A260TAM01_CRT_USER_ID = new String[] {""} ;
      T00014_n260TAM01_CRT_USER_ID = new boolean[] {false} ;
      T00014_A223TAM01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00014_n223TAM01_UPD_DATETIME = new boolean[] {false} ;
      T00014_A261TAM01_UPD_USER_ID = new String[] {""} ;
      T00014_n261TAM01_UPD_USER_ID = new boolean[] {false} ;
      T00014_A274TAM01_UPD_CNT = new long[1] ;
      T00014_n274TAM01_UPD_CNT = new boolean[] {false} ;
      T00014_A206TAM01_SYS_NM = new String[] {""} ;
      T00014_n206TAM01_SYS_NM = new boolean[] {false} ;
      T00014_A975TAM01_VERSION = new String[] {""} ;
      T00014_n975TAM01_VERSION = new boolean[] {false} ;
      T00014_A976TAM01_BIKO = new String[] {""} ;
      T00014_n976TAM01_BIKO = new boolean[] {false} ;
      T00014_A273TAM01_DEL_FLG = new String[] {""} ;
      T00014_n273TAM01_DEL_FLG = new boolean[] {false} ;
      T00014_A222TAM01_CRT_PROG_NM = new String[] {""} ;
      T00014_n222TAM01_CRT_PROG_NM = new boolean[] {false} ;
      T00014_A224TAM01_UPD_PROG_NM = new String[] {""} ;
      T00014_n224TAM01_UPD_PROG_NM = new boolean[] {false} ;
      T00015_A1TAM01_SYS_ID = new String[] {""} ;
      T00013_A1TAM01_SYS_ID = new String[] {""} ;
      T00013_A221TAM01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00013_n221TAM01_CRT_DATETIME = new boolean[] {false} ;
      T00013_A260TAM01_CRT_USER_ID = new String[] {""} ;
      T00013_n260TAM01_CRT_USER_ID = new boolean[] {false} ;
      T00013_A223TAM01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00013_n223TAM01_UPD_DATETIME = new boolean[] {false} ;
      T00013_A261TAM01_UPD_USER_ID = new String[] {""} ;
      T00013_n261TAM01_UPD_USER_ID = new boolean[] {false} ;
      T00013_A274TAM01_UPD_CNT = new long[1] ;
      T00013_n274TAM01_UPD_CNT = new boolean[] {false} ;
      T00013_A206TAM01_SYS_NM = new String[] {""} ;
      T00013_n206TAM01_SYS_NM = new boolean[] {false} ;
      T00013_A975TAM01_VERSION = new String[] {""} ;
      T00013_n975TAM01_VERSION = new boolean[] {false} ;
      T00013_A976TAM01_BIKO = new String[] {""} ;
      T00013_n976TAM01_BIKO = new boolean[] {false} ;
      T00013_A273TAM01_DEL_FLG = new String[] {""} ;
      T00013_n273TAM01_DEL_FLG = new boolean[] {false} ;
      T00013_A222TAM01_CRT_PROG_NM = new String[] {""} ;
      T00013_n222TAM01_CRT_PROG_NM = new boolean[] {false} ;
      T00013_A224TAM01_UPD_PROG_NM = new String[] {""} ;
      T00013_n224TAM01_UPD_PROG_NM = new boolean[] {false} ;
      sMode1 = "" ;
      T00016_A1TAM01_SYS_ID = new String[] {""} ;
      T00017_A1TAM01_SYS_ID = new String[] {""} ;
      T00012_A1TAM01_SYS_ID = new String[] {""} ;
      T00012_A221TAM01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00012_n221TAM01_CRT_DATETIME = new boolean[] {false} ;
      T00012_A260TAM01_CRT_USER_ID = new String[] {""} ;
      T00012_n260TAM01_CRT_USER_ID = new boolean[] {false} ;
      T00012_A223TAM01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00012_n223TAM01_UPD_DATETIME = new boolean[] {false} ;
      T00012_A261TAM01_UPD_USER_ID = new String[] {""} ;
      T00012_n261TAM01_UPD_USER_ID = new boolean[] {false} ;
      T00012_A274TAM01_UPD_CNT = new long[1] ;
      T00012_n274TAM01_UPD_CNT = new boolean[] {false} ;
      T00012_A206TAM01_SYS_NM = new String[] {""} ;
      T00012_n206TAM01_SYS_NM = new boolean[] {false} ;
      T00012_A975TAM01_VERSION = new String[] {""} ;
      T00012_n975TAM01_VERSION = new boolean[] {false} ;
      T00012_A976TAM01_BIKO = new String[] {""} ;
      T00012_n976TAM01_BIKO = new boolean[] {false} ;
      T00012_A273TAM01_DEL_FLG = new String[] {""} ;
      T00012_n273TAM01_DEL_FLG = new boolean[] {false} ;
      T00012_A222TAM01_CRT_PROG_NM = new String[] {""} ;
      T00012_n222TAM01_CRT_PROG_NM = new boolean[] {false} ;
      T00012_A224TAM01_UPD_PROG_NM = new String[] {""} ;
      T00012_n224TAM01_UPD_PROG_NM = new boolean[] {false} ;
      T000111_A1TAM01_SYS_ID = new String[] {""} ;
      T000111_A2TAM02_MENU_ID_TREE_1 = new String[] {""} ;
      T000111_A3TAM02_MENU_ID_TREE_2 = new String[] {""} ;
      T000111_A4TAM02_MENU_ID_TREE_3 = new String[] {""} ;
      T000112_A1TAM01_SYS_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i273TAM01_DEL_FLG = "" ;
      i222TAM01_CRT_PROG_NM = "" ;
      i224TAM01_UPD_PROG_NM = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      ZV14Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam01_sys__default(),
         new Object[] {
             new Object[] {
            T00012_A1TAM01_SYS_ID, T00012_A221TAM01_CRT_DATETIME, T00012_n221TAM01_CRT_DATETIME, T00012_A260TAM01_CRT_USER_ID, T00012_n260TAM01_CRT_USER_ID, T00012_A223TAM01_UPD_DATETIME, T00012_n223TAM01_UPD_DATETIME, T00012_A261TAM01_UPD_USER_ID, T00012_n261TAM01_UPD_USER_ID, T00012_A274TAM01_UPD_CNT,
            T00012_n274TAM01_UPD_CNT, T00012_A206TAM01_SYS_NM, T00012_n206TAM01_SYS_NM, T00012_A975TAM01_VERSION, T00012_n975TAM01_VERSION, T00012_A976TAM01_BIKO, T00012_n976TAM01_BIKO, T00012_A273TAM01_DEL_FLG, T00012_n273TAM01_DEL_FLG, T00012_A222TAM01_CRT_PROG_NM,
            T00012_n222TAM01_CRT_PROG_NM, T00012_A224TAM01_UPD_PROG_NM, T00012_n224TAM01_UPD_PROG_NM
            }
            , new Object[] {
            T00013_A1TAM01_SYS_ID, T00013_A221TAM01_CRT_DATETIME, T00013_n221TAM01_CRT_DATETIME, T00013_A260TAM01_CRT_USER_ID, T00013_n260TAM01_CRT_USER_ID, T00013_A223TAM01_UPD_DATETIME, T00013_n223TAM01_UPD_DATETIME, T00013_A261TAM01_UPD_USER_ID, T00013_n261TAM01_UPD_USER_ID, T00013_A274TAM01_UPD_CNT,
            T00013_n274TAM01_UPD_CNT, T00013_A206TAM01_SYS_NM, T00013_n206TAM01_SYS_NM, T00013_A975TAM01_VERSION, T00013_n975TAM01_VERSION, T00013_A976TAM01_BIKO, T00013_n976TAM01_BIKO, T00013_A273TAM01_DEL_FLG, T00013_n273TAM01_DEL_FLG, T00013_A222TAM01_CRT_PROG_NM,
            T00013_n222TAM01_CRT_PROG_NM, T00013_A224TAM01_UPD_PROG_NM, T00013_n224TAM01_UPD_PROG_NM
            }
            , new Object[] {
            T00014_A1TAM01_SYS_ID, T00014_A221TAM01_CRT_DATETIME, T00014_n221TAM01_CRT_DATETIME, T00014_A260TAM01_CRT_USER_ID, T00014_n260TAM01_CRT_USER_ID, T00014_A223TAM01_UPD_DATETIME, T00014_n223TAM01_UPD_DATETIME, T00014_A261TAM01_UPD_USER_ID, T00014_n261TAM01_UPD_USER_ID, T00014_A274TAM01_UPD_CNT,
            T00014_n274TAM01_UPD_CNT, T00014_A206TAM01_SYS_NM, T00014_n206TAM01_SYS_NM, T00014_A975TAM01_VERSION, T00014_n975TAM01_VERSION, T00014_A976TAM01_BIKO, T00014_n976TAM01_BIKO, T00014_A273TAM01_DEL_FLG, T00014_n273TAM01_DEL_FLG, T00014_A222TAM01_CRT_PROG_NM,
            T00014_n222TAM01_CRT_PROG_NM, T00014_A224TAM01_UPD_PROG_NM, T00014_n224TAM01_UPD_PROG_NM
            }
            , new Object[] {
            T00015_A1TAM01_SYS_ID
            }
            , new Object[] {
            T00016_A1TAM01_SYS_ID
            }
            , new Object[] {
            T00017_A1TAM01_SYS_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000111_A1TAM01_SYS_ID, T000111_A2TAM02_MENU_ID_TREE_1, T000111_A3TAM02_MENU_ID_TREE_2, T000111_A4TAM02_MENU_ID_TREE_3
            }
            , new Object[] {
            T000112_A1TAM01_SYS_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      Z224TAM01_UPD_PROG_NM = AV14Pgmname ;
      n224TAM01_UPD_PROG_NM = false ;
      Z222TAM01_CRT_PROG_NM = AV14Pgmname ;
      n222TAM01_CRT_PROG_NM = false ;
      AV14Pgmname = "TAM01_SYS" ;
      Z273TAM01_DEL_FLG = "0" ;
      n273TAM01_DEL_FLG = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1 ;
   private short Gx_err ;
   private int trnEnded ;
   private int lblBtn_cancel_Enabled ;
   private int imgImage19_Visible ;
   private int edtTAM01_SYS_ID_Enabled ;
   private int imgImage20_Visible ;
   private int edtTAM01_SYS_NM_Enabled ;
   private int edtTAM01_VERSION_Enabled ;
   private int edtTAM01_BIKO_Enabled ;
   private int edtTAM01_CRT_DATETIME_Visible ;
   private int edtTAM01_CRT_DATETIME_Enabled ;
   private int edtTAM01_CRT_USER_ID_Enabled ;
   private int edtTAM01_CRT_PROG_NM_Visible ;
   private int edtTAM01_CRT_PROG_NM_Enabled ;
   private int edtTAM01_UPD_DATETIME_Visible ;
   private int edtTAM01_UPD_DATETIME_Enabled ;
   private int edtTAM01_UPD_USER_ID_Enabled ;
   private int edtTAM01_UPD_PROG_NM_Visible ;
   private int edtTAM01_UPD_PROG_NM_Enabled ;
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
   private long Z274TAM01_UPD_CNT ;
   private long O274TAM01_UPD_CNT ;
   private long A274TAM01_UPD_CNT ;
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
   private String edtTAM01_SYS_ID_Internalname ;
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
   private String lblTextblocktam01_sys_id_Internalname ;
   private String lblTextblocktam01_sys_id_Jsonclick ;
   private String TempTags ;
   private String edtTAM01_SYS_ID_Jsonclick ;
   private String imgImage20_Internalname ;
   private String lblTextblocktam01_sys_nm_Internalname ;
   private String lblTextblocktam01_sys_nm_Jsonclick ;
   private String edtTAM01_SYS_NM_Internalname ;
   private String edtTAM01_SYS_NM_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtTAM01_VERSION_Internalname ;
   private String edtTAM01_VERSION_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtTAM01_BIKO_Internalname ;
   private String lblTextblocktam01_del_flg_Internalname ;
   private String lblTextblocktam01_del_flg_Jsonclick ;
   private String lblTextblocktam01_crt_datetime_Internalname ;
   private String lblTextblocktam01_crt_datetime_Jsonclick ;
   private String edtTAM01_CRT_DATETIME_Internalname ;
   private String edtTAM01_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktam01_crt_user_id_Internalname ;
   private String lblTextblocktam01_crt_user_id_Jsonclick ;
   private String edtTAM01_CRT_USER_ID_Internalname ;
   private String edtTAM01_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktam01_crt_prog_nm_Internalname ;
   private String lblTextblocktam01_crt_prog_nm_Jsonclick ;
   private String edtTAM01_CRT_PROG_NM_Internalname ;
   private String edtTAM01_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktam01_upd_datetime_Internalname ;
   private String lblTextblocktam01_upd_datetime_Jsonclick ;
   private String edtTAM01_UPD_DATETIME_Internalname ;
   private String edtTAM01_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktam01_upd_user_id_Internalname ;
   private String lblTextblocktam01_upd_user_id_Jsonclick ;
   private String edtTAM01_UPD_USER_ID_Internalname ;
   private String edtTAM01_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktam01_upd_prog_nm_Internalname ;
   private String lblTextblocktam01_upd_prog_nm_Jsonclick ;
   private String edtTAM01_UPD_PROG_NM_Internalname ;
   private String edtTAM01_UPD_PROG_NM_Jsonclick ;
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
   private String sMode1 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String div_Internalname ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String ZV14Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z221TAM01_CRT_DATETIME ;
   private java.util.Date Z223TAM01_UPD_DATETIME ;
   private java.util.Date A221TAM01_CRT_DATETIME ;
   private java.util.Date A223TAM01_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n206TAM01_SYS_NM ;
   private boolean n273TAM01_DEL_FLG ;
   private boolean n221TAM01_CRT_DATETIME ;
   private boolean n260TAM01_CRT_USER_ID ;
   private boolean n222TAM01_CRT_PROG_NM ;
   private boolean n223TAM01_UPD_DATETIME ;
   private boolean n261TAM01_UPD_USER_ID ;
   private boolean n224TAM01_UPD_PROG_NM ;
   private boolean n274TAM01_UPD_CNT ;
   private boolean wbErr ;
   private boolean n975TAM01_VERSION ;
   private boolean n976TAM01_BIKO ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z1TAM01_SYS_ID ;
   private String Z260TAM01_CRT_USER_ID ;
   private String Z261TAM01_UPD_USER_ID ;
   private String Z206TAM01_SYS_NM ;
   private String Z975TAM01_VERSION ;
   private String Z976TAM01_BIKO ;
   private String Z273TAM01_DEL_FLG ;
   private String Z222TAM01_CRT_PROG_NM ;
   private String Z224TAM01_UPD_PROG_NM ;
   private String A1TAM01_SYS_ID ;
   private String A206TAM01_SYS_NM ;
   private String A273TAM01_DEL_FLG ;
   private String A260TAM01_CRT_USER_ID ;
   private String A222TAM01_CRT_PROG_NM ;
   private String A261TAM01_UPD_USER_ID ;
   private String A224TAM01_UPD_PROG_NM ;
   private String A975TAM01_VERSION ;
   private String A976TAM01_BIKO ;
   private String AV7C_TAM02_APP_ID ;
   private String AV9W_ERRCD ;
   private String AV12W_MSG ;
   private String AV10W_KNGN_FLG ;
   private String i273TAM01_DEL_FLG ;
   private String i222TAM01_CRT_PROG_NM ;
   private String i224TAM01_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice radTAM01_DEL_FLG ;
   private IDataStoreProvider pr_default ;
   private String[] T00014_A1TAM01_SYS_ID ;
   private java.util.Date[] T00014_A221TAM01_CRT_DATETIME ;
   private boolean[] T00014_n221TAM01_CRT_DATETIME ;
   private String[] T00014_A260TAM01_CRT_USER_ID ;
   private boolean[] T00014_n260TAM01_CRT_USER_ID ;
   private java.util.Date[] T00014_A223TAM01_UPD_DATETIME ;
   private boolean[] T00014_n223TAM01_UPD_DATETIME ;
   private String[] T00014_A261TAM01_UPD_USER_ID ;
   private boolean[] T00014_n261TAM01_UPD_USER_ID ;
   private long[] T00014_A274TAM01_UPD_CNT ;
   private boolean[] T00014_n274TAM01_UPD_CNT ;
   private String[] T00014_A206TAM01_SYS_NM ;
   private boolean[] T00014_n206TAM01_SYS_NM ;
   private String[] T00014_A975TAM01_VERSION ;
   private boolean[] T00014_n975TAM01_VERSION ;
   private String[] T00014_A976TAM01_BIKO ;
   private boolean[] T00014_n976TAM01_BIKO ;
   private String[] T00014_A273TAM01_DEL_FLG ;
   private boolean[] T00014_n273TAM01_DEL_FLG ;
   private String[] T00014_A222TAM01_CRT_PROG_NM ;
   private boolean[] T00014_n222TAM01_CRT_PROG_NM ;
   private String[] T00014_A224TAM01_UPD_PROG_NM ;
   private boolean[] T00014_n224TAM01_UPD_PROG_NM ;
   private String[] T00015_A1TAM01_SYS_ID ;
   private String[] T00013_A1TAM01_SYS_ID ;
   private java.util.Date[] T00013_A221TAM01_CRT_DATETIME ;
   private boolean[] T00013_n221TAM01_CRT_DATETIME ;
   private String[] T00013_A260TAM01_CRT_USER_ID ;
   private boolean[] T00013_n260TAM01_CRT_USER_ID ;
   private java.util.Date[] T00013_A223TAM01_UPD_DATETIME ;
   private boolean[] T00013_n223TAM01_UPD_DATETIME ;
   private String[] T00013_A261TAM01_UPD_USER_ID ;
   private boolean[] T00013_n261TAM01_UPD_USER_ID ;
   private long[] T00013_A274TAM01_UPD_CNT ;
   private boolean[] T00013_n274TAM01_UPD_CNT ;
   private String[] T00013_A206TAM01_SYS_NM ;
   private boolean[] T00013_n206TAM01_SYS_NM ;
   private String[] T00013_A975TAM01_VERSION ;
   private boolean[] T00013_n975TAM01_VERSION ;
   private String[] T00013_A976TAM01_BIKO ;
   private boolean[] T00013_n976TAM01_BIKO ;
   private String[] T00013_A273TAM01_DEL_FLG ;
   private boolean[] T00013_n273TAM01_DEL_FLG ;
   private String[] T00013_A222TAM01_CRT_PROG_NM ;
   private boolean[] T00013_n222TAM01_CRT_PROG_NM ;
   private String[] T00013_A224TAM01_UPD_PROG_NM ;
   private boolean[] T00013_n224TAM01_UPD_PROG_NM ;
   private String[] T00016_A1TAM01_SYS_ID ;
   private String[] T00017_A1TAM01_SYS_ID ;
   private String[] T00012_A1TAM01_SYS_ID ;
   private java.util.Date[] T00012_A221TAM01_CRT_DATETIME ;
   private boolean[] T00012_n221TAM01_CRT_DATETIME ;
   private String[] T00012_A260TAM01_CRT_USER_ID ;
   private boolean[] T00012_n260TAM01_CRT_USER_ID ;
   private java.util.Date[] T00012_A223TAM01_UPD_DATETIME ;
   private boolean[] T00012_n223TAM01_UPD_DATETIME ;
   private String[] T00012_A261TAM01_UPD_USER_ID ;
   private boolean[] T00012_n261TAM01_UPD_USER_ID ;
   private long[] T00012_A274TAM01_UPD_CNT ;
   private boolean[] T00012_n274TAM01_UPD_CNT ;
   private String[] T00012_A206TAM01_SYS_NM ;
   private boolean[] T00012_n206TAM01_SYS_NM ;
   private String[] T00012_A975TAM01_VERSION ;
   private boolean[] T00012_n975TAM01_VERSION ;
   private String[] T00012_A976TAM01_BIKO ;
   private boolean[] T00012_n976TAM01_BIKO ;
   private String[] T00012_A273TAM01_DEL_FLG ;
   private boolean[] T00012_n273TAM01_DEL_FLG ;
   private String[] T00012_A222TAM01_CRT_PROG_NM ;
   private boolean[] T00012_n222TAM01_CRT_PROG_NM ;
   private String[] T00012_A224TAM01_UPD_PROG_NM ;
   private boolean[] T00012_n224TAM01_UPD_PROG_NM ;
   private String[] T000111_A1TAM01_SYS_ID ;
   private String[] T000111_A2TAM02_MENU_ID_TREE_1 ;
   private String[] T000111_A3TAM02_MENU_ID_TREE_2 ;
   private String[] T000111_A4TAM02_MENU_ID_TREE_3 ;
   private String[] T000112_A1TAM01_SYS_ID ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class tam01_sys__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00012", "SELECT `TAM01_SYS_ID`, `TAM01_CRT_DATETIME`, `TAM01_CRT_USER_ID`, `TAM01_UPD_DATETIME`, `TAM01_UPD_USER_ID`, `TAM01_UPD_CNT`, `TAM01_SYS_NM`, `TAM01_VERSION`, `TAM01_BIKO`, `TAM01_DEL_FLG`, `TAM01_CRT_PROG_NM`, `TAM01_UPD_PROG_NM` FROM `TAM01_SYS` WHERE `TAM01_SYS_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00013", "SELECT `TAM01_SYS_ID`, `TAM01_CRT_DATETIME`, `TAM01_CRT_USER_ID`, `TAM01_UPD_DATETIME`, `TAM01_UPD_USER_ID`, `TAM01_UPD_CNT`, `TAM01_SYS_NM`, `TAM01_VERSION`, `TAM01_BIKO`, `TAM01_DEL_FLG`, `TAM01_CRT_PROG_NM`, `TAM01_UPD_PROG_NM` FROM `TAM01_SYS` WHERE `TAM01_SYS_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00014", "SELECT TM1.`TAM01_SYS_ID`, TM1.`TAM01_CRT_DATETIME`, TM1.`TAM01_CRT_USER_ID`, TM1.`TAM01_UPD_DATETIME`, TM1.`TAM01_UPD_USER_ID`, TM1.`TAM01_UPD_CNT`, TM1.`TAM01_SYS_NM`, TM1.`TAM01_VERSION`, TM1.`TAM01_BIKO`, TM1.`TAM01_DEL_FLG`, TM1.`TAM01_CRT_PROG_NM`, TM1.`TAM01_UPD_PROG_NM` FROM `TAM01_SYS` TM1 WHERE TM1.`TAM01_SYS_ID` = ? ORDER BY TM1.`TAM01_SYS_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00015", "SELECT `TAM01_SYS_ID` FROM `TAM01_SYS` WHERE `TAM01_SYS_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00016", "SELECT `TAM01_SYS_ID` FROM `TAM01_SYS` WHERE ( `TAM01_SYS_ID` > ?) ORDER BY `TAM01_SYS_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00017", "SELECT `TAM01_SYS_ID` FROM `TAM01_SYS` WHERE ( `TAM01_SYS_ID` < ?) ORDER BY `TAM01_SYS_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00018", "INSERT INTO `TAM01_SYS`(`TAM01_SYS_ID`, `TAM01_CRT_DATETIME`, `TAM01_CRT_USER_ID`, `TAM01_UPD_DATETIME`, `TAM01_UPD_USER_ID`, `TAM01_UPD_CNT`, `TAM01_SYS_NM`, `TAM01_VERSION`, `TAM01_BIKO`, `TAM01_DEL_FLG`, `TAM01_CRT_PROG_NM`, `TAM01_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00019", "UPDATE `TAM01_SYS` SET `TAM01_CRT_DATETIME`=?, `TAM01_CRT_USER_ID`=?, `TAM01_UPD_DATETIME`=?, `TAM01_UPD_USER_ID`=?, `TAM01_UPD_CNT`=?, `TAM01_SYS_NM`=?, `TAM01_VERSION`=?, `TAM01_BIKO`=?, `TAM01_DEL_FLG`=?, `TAM01_CRT_PROG_NM`=?, `TAM01_UPD_PROG_NM`=?  WHERE `TAM01_SYS_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000110", "DELETE FROM `TAM01_SYS`  WHERE `TAM01_SYS_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000111", "SELECT `TAM01_SYS_ID`, `TAM02_MENU_ID_TREE_1`, `TAM02_MENU_ID_TREE_2`, `TAM02_MENU_ID_TREE_3` FROM `TAM02_MENU` WHERE `TAM01_SYS_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000112", "SELECT `TAM01_SYS_ID` FROM `TAM01_SYS` ORDER BY `TAM01_SYS_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 10 :
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
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
                  stmt.setVarchar(8, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 1000);
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
                  stmt.setVarchar(7, (String)parms[13], 10);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 1000);
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
               stmt.setVarchar(12, (String)parms[22], 2, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

