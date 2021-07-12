/*
               File: tbt16_import_history_impl
        Description: 選択一覧取込履歴テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:3.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt16_import_history_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"TBT16_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asatbt16_crt_user_id1F50( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"TBT16_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asatbt16_upd_user_id1F50( Gx_mode) ;
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "選択一覧取込履歴テーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbt16_import_history_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt16_import_history_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt16_import_history_impl.class ));
   }

   public tbt16_import_history_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
         /* Form start */
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1F50( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1F50e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1F50( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1F50( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1F50( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1F50e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "選択一覧取込履歴テーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         wb_table3_28_1F50( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1F50e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1F50e( true) ;
      }
      else
      {
         wb_table1_2_1F50e( false) ;
      }
   }

   public void wb_table3_28_1F50( boolean wbgen )
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
         wb_table4_34_1F50( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1F50e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT16_IMPORT_HISTORY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT16_IMPORT_HISTORY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1F50e( true) ;
      }
      else
      {
         wb_table3_28_1F50e( false) ;
      }
   }

   public void wb_table4_34_1F50( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Container", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_import_no_Internalname, "取込番号", "", "", lblTextblocktbt16_import_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_IMPORT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A190TBT16_IMPORT_NO, (byte)(10), (byte)(0), ".", "")), ((edtTBT16_IMPORT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A190TBT16_IMPORT_NO), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A190TBT16_IMPORT_NO), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_IMPORT_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_IMPORT_NO_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_import_file_nm_Internalname, "取込ファイル名", "", "", lblTextblocktbt16_import_file_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT16_IMPORT_FILE_NM_Internalname, GXutil.rtrim( A838TBT16_IMPORT_FILE_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", (short)(0), 1, edtTBT16_IMPORT_FILE_NM_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, "", "", (byte)(-1), true, "", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_file_nm_Internalname, "実ファイル名", "", "", lblTextblocktbt16_file_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT16_FILE_NM_Internalname, GXutil.rtrim( A839TBT16_FILE_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", (short)(0), 1, edtTBT16_FILE_NM_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, "", "", (byte)(-1), true, "", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_import_datetime_Internalname, "取込日時", "", "", lblTextblocktbt16_import_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT16_IMPORT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_IMPORT_DATETIME_Internalname, localUtil.format(A840TBT16_IMPORT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A840TBT16_IMPORT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_IMPORT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_IMPORT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT16_IMPORT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT16_IMPORT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt16_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_DEL_FLG_Internalname, GXutil.rtrim( A841TBT16_DEL_FLG), GXutil.rtrim( localUtil.format( A841TBT16_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt16_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT16_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_CRT_DATETIME_Internalname, localUtil.format(A842TBT16_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A842TBT16_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT16_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT16_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_crt_user_id_Internalname, "ID", "", "", lblTextblocktbt16_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_CRT_USER_ID_Internalname, GXutil.rtrim( A843TBT16_CRT_USER_ID), GXutil.rtrim( localUtil.format( A843TBT16_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt16_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_CRT_PROG_NM_Internalname, GXutil.rtrim( A844TBT16_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A844TBT16_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt16_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT16_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_UPD_DATETIME_Internalname, localUtil.format(A845TBT16_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A845TBT16_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT16_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT16_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_upd_user_id_Internalname, "ID", "", "", lblTextblocktbt16_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_UPD_USER_ID_Internalname, GXutil.rtrim( A846TBT16_UPD_USER_ID), GXutil.rtrim( localUtil.format( A846TBT16_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt16_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_UPD_PROG_NM_Internalname, GXutil.rtrim( A847TBT16_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A847TBT16_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt16_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A848TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT16_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A848TBT16_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A848TBT16_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT16_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT16_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1F50e( true) ;
      }
      else
      {
         wb_table4_34_1F50e( false) ;
      }
   }

   public void wb_table2_5_1F50( boolean wbgen )
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
         GxWebStd.gx_div_start( httpContext, divSectiontoolbar_Internalname, 1, 0, "px", 0, "px", "ToolbarMain", "");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT16_IMPORT_HISTORY.htm");
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
         wb_table2_5_1F50e( true) ;
      }
      else
      {
         wb_table2_5_1F50e( false) ;
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
      /* Execute user event: e111F2 */
      e111F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT16_IMPORT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT16_IMPORT_NO_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT16_IMPORT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A190TBT16_IMPORT_NO = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
            }
            else
            {
               A190TBT16_IMPORT_NO = localUtil.ctol( httpContext.cgiGet( edtTBT16_IMPORT_NO_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
            }
            A838TBT16_IMPORT_FILE_NM = httpContext.cgiGet( edtTBT16_IMPORT_FILE_NM_Internalname) ;
            n838TBT16_IMPORT_FILE_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A838TBT16_IMPORT_FILE_NM", A838TBT16_IMPORT_FILE_NM);
            n838TBT16_IMPORT_FILE_NM = ((GXutil.strcmp("", A838TBT16_IMPORT_FILE_NM)==0) ? true : false) ;
            A839TBT16_FILE_NM = httpContext.cgiGet( edtTBT16_FILE_NM_Internalname) ;
            n839TBT16_FILE_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A839TBT16_FILE_NM", A839TBT16_FILE_NM);
            n839TBT16_FILE_NM = ((GXutil.strcmp("", A839TBT16_FILE_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT16_IMPORT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT16_IMPORT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_IMPORT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A840TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n840TBT16_IMPORT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TBT16_IMPORT_DATETIME", localUtil.ttoc( A840TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A840TBT16_IMPORT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT16_IMPORT_DATETIME_Internalname)) ;
               n840TBT16_IMPORT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TBT16_IMPORT_DATETIME", localUtil.ttoc( A840TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n840TBT16_IMPORT_DATETIME = (GXutil.nullDate().equals(A840TBT16_IMPORT_DATETIME) ? true : false) ;
            A841TBT16_DEL_FLG = httpContext.cgiGet( edtTBT16_DEL_FLG_Internalname) ;
            n841TBT16_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TBT16_DEL_FLG", A841TBT16_DEL_FLG);
            n841TBT16_DEL_FLG = ((GXutil.strcmp("", A841TBT16_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT16_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT16_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A842TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n842TBT16_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A842TBT16_CRT_DATETIME", localUtil.ttoc( A842TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A842TBT16_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT16_CRT_DATETIME_Internalname)) ;
               n842TBT16_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A842TBT16_CRT_DATETIME", localUtil.ttoc( A842TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n842TBT16_CRT_DATETIME = (GXutil.nullDate().equals(A842TBT16_CRT_DATETIME) ? true : false) ;
            A843TBT16_CRT_USER_ID = httpContext.cgiGet( edtTBT16_CRT_USER_ID_Internalname) ;
            n843TBT16_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A843TBT16_CRT_USER_ID", A843TBT16_CRT_USER_ID);
            n843TBT16_CRT_USER_ID = ((GXutil.strcmp("", A843TBT16_CRT_USER_ID)==0) ? true : false) ;
            A844TBT16_CRT_PROG_NM = httpContext.cgiGet( edtTBT16_CRT_PROG_NM_Internalname) ;
            n844TBT16_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A844TBT16_CRT_PROG_NM", A844TBT16_CRT_PROG_NM);
            n844TBT16_CRT_PROG_NM = ((GXutil.strcmp("", A844TBT16_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT16_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT16_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A845TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n845TBT16_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A845TBT16_UPD_DATETIME", localUtil.ttoc( A845TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A845TBT16_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT16_UPD_DATETIME_Internalname)) ;
               n845TBT16_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A845TBT16_UPD_DATETIME", localUtil.ttoc( A845TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n845TBT16_UPD_DATETIME = (GXutil.nullDate().equals(A845TBT16_UPD_DATETIME) ? true : false) ;
            A846TBT16_UPD_USER_ID = httpContext.cgiGet( edtTBT16_UPD_USER_ID_Internalname) ;
            n846TBT16_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A846TBT16_UPD_USER_ID", A846TBT16_UPD_USER_ID);
            n846TBT16_UPD_USER_ID = ((GXutil.strcmp("", A846TBT16_UPD_USER_ID)==0) ? true : false) ;
            A847TBT16_UPD_PROG_NM = httpContext.cgiGet( edtTBT16_UPD_PROG_NM_Internalname) ;
            n847TBT16_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A847TBT16_UPD_PROG_NM", A847TBT16_UPD_PROG_NM);
            n847TBT16_UPD_PROG_NM = ((GXutil.strcmp("", A847TBT16_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT16_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT16_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT16_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A848TBT16_UPD_CNT = 0 ;
               n848TBT16_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A848TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A848TBT16_UPD_CNT, 10, 0)));
            }
            else
            {
               A848TBT16_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT16_UPD_CNT_Internalname), ".", ",") ;
               n848TBT16_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A848TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A848TBT16_UPD_CNT, 10, 0)));
            }
            n848TBT16_UPD_CNT = ((0==A848TBT16_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z190TBT16_IMPORT_NO = localUtil.ctol( httpContext.cgiGet( "Z190TBT16_IMPORT_NO"), ".", ",") ;
            Z842TBT16_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z842TBT16_CRT_DATETIME"), 0) ;
            n842TBT16_CRT_DATETIME = (GXutil.nullDate().equals(A842TBT16_CRT_DATETIME) ? true : false) ;
            Z843TBT16_CRT_USER_ID = httpContext.cgiGet( "Z843TBT16_CRT_USER_ID") ;
            n843TBT16_CRT_USER_ID = ((GXutil.strcmp("", A843TBT16_CRT_USER_ID)==0) ? true : false) ;
            Z845TBT16_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z845TBT16_UPD_DATETIME"), 0) ;
            n845TBT16_UPD_DATETIME = (GXutil.nullDate().equals(A845TBT16_UPD_DATETIME) ? true : false) ;
            Z846TBT16_UPD_USER_ID = httpContext.cgiGet( "Z846TBT16_UPD_USER_ID") ;
            n846TBT16_UPD_USER_ID = ((GXutil.strcmp("", A846TBT16_UPD_USER_ID)==0) ? true : false) ;
            Z848TBT16_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z848TBT16_UPD_CNT"), ".", ",") ;
            n848TBT16_UPD_CNT = ((0==A848TBT16_UPD_CNT) ? true : false) ;
            Z838TBT16_IMPORT_FILE_NM = httpContext.cgiGet( "Z838TBT16_IMPORT_FILE_NM") ;
            n838TBT16_IMPORT_FILE_NM = ((GXutil.strcmp("", A838TBT16_IMPORT_FILE_NM)==0) ? true : false) ;
            Z839TBT16_FILE_NM = httpContext.cgiGet( "Z839TBT16_FILE_NM") ;
            n839TBT16_FILE_NM = ((GXutil.strcmp("", A839TBT16_FILE_NM)==0) ? true : false) ;
            Z840TBT16_IMPORT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z840TBT16_IMPORT_DATETIME"), 0) ;
            n840TBT16_IMPORT_DATETIME = (GXutil.nullDate().equals(A840TBT16_IMPORT_DATETIME) ? true : false) ;
            Z841TBT16_DEL_FLG = httpContext.cgiGet( "Z841TBT16_DEL_FLG") ;
            n841TBT16_DEL_FLG = ((GXutil.strcmp("", A841TBT16_DEL_FLG)==0) ? true : false) ;
            Z844TBT16_CRT_PROG_NM = httpContext.cgiGet( "Z844TBT16_CRT_PROG_NM") ;
            n844TBT16_CRT_PROG_NM = ((GXutil.strcmp("", A844TBT16_CRT_PROG_NM)==0) ? true : false) ;
            Z847TBT16_UPD_PROG_NM = httpContext.cgiGet( "Z847TBT16_UPD_PROG_NM") ;
            n847TBT16_UPD_PROG_NM = ((GXutil.strcmp("", A847TBT16_UPD_PROG_NM)==0) ? true : false) ;
            O848TBT16_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O848TBT16_UPD_CNT"), ".", ",") ;
            n848TBT16_UPD_CNT = ((0==A848TBT16_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV9Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A190TBT16_IMPORT_NO = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
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
                     /* Execute user event: e111F2 */
                     e111F2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e121F2 */
                     e121F2 ();
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
         /* Execute user event: e121F2 */
         e121F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1F50( ) ;
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
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)));
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
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)));
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         imgBtn_enter2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_enter2_Visible, 5, 0)));
         imgBtn_enter2_separator_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_enter2_separator_Visible, 5, 0)));
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_enter_Visible, 5, 0)));
      }
      disableAttributes1F50( ) ;
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

   public void resetCaption1F0( )
   {
   }

   public void e111F2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_BC_FLG", AV7W_BC_FLG);
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e121F2( )
   {
      /* After Trn Routine */
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm1F50( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z842TBT16_CRT_DATETIME = T001F3_A842TBT16_CRT_DATETIME[0] ;
            Z843TBT16_CRT_USER_ID = T001F3_A843TBT16_CRT_USER_ID[0] ;
            Z845TBT16_UPD_DATETIME = T001F3_A845TBT16_UPD_DATETIME[0] ;
            Z846TBT16_UPD_USER_ID = T001F3_A846TBT16_UPD_USER_ID[0] ;
            Z848TBT16_UPD_CNT = T001F3_A848TBT16_UPD_CNT[0] ;
            Z838TBT16_IMPORT_FILE_NM = T001F3_A838TBT16_IMPORT_FILE_NM[0] ;
            Z839TBT16_FILE_NM = T001F3_A839TBT16_FILE_NM[0] ;
            Z840TBT16_IMPORT_DATETIME = T001F3_A840TBT16_IMPORT_DATETIME[0] ;
            Z841TBT16_DEL_FLG = T001F3_A841TBT16_DEL_FLG[0] ;
            Z844TBT16_CRT_PROG_NM = T001F3_A844TBT16_CRT_PROG_NM[0] ;
            Z847TBT16_UPD_PROG_NM = T001F3_A847TBT16_UPD_PROG_NM[0] ;
         }
         else
         {
            Z842TBT16_CRT_DATETIME = A842TBT16_CRT_DATETIME ;
            Z843TBT16_CRT_USER_ID = A843TBT16_CRT_USER_ID ;
            Z845TBT16_UPD_DATETIME = A845TBT16_UPD_DATETIME ;
            Z846TBT16_UPD_USER_ID = A846TBT16_UPD_USER_ID ;
            Z848TBT16_UPD_CNT = A848TBT16_UPD_CNT ;
            Z838TBT16_IMPORT_FILE_NM = A838TBT16_IMPORT_FILE_NM ;
            Z839TBT16_FILE_NM = A839TBT16_FILE_NM ;
            Z840TBT16_IMPORT_DATETIME = A840TBT16_IMPORT_DATETIME ;
            Z841TBT16_DEL_FLG = A841TBT16_DEL_FLG ;
            Z844TBT16_CRT_PROG_NM = A844TBT16_CRT_PROG_NM ;
            Z847TBT16_UPD_PROG_NM = A847TBT16_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z190TBT16_IMPORT_NO = A190TBT16_IMPORT_NO ;
         Z842TBT16_CRT_DATETIME = A842TBT16_CRT_DATETIME ;
         Z843TBT16_CRT_USER_ID = A843TBT16_CRT_USER_ID ;
         Z845TBT16_UPD_DATETIME = A845TBT16_UPD_DATETIME ;
         Z846TBT16_UPD_USER_ID = A846TBT16_UPD_USER_ID ;
         Z848TBT16_UPD_CNT = A848TBT16_UPD_CNT ;
         Z838TBT16_IMPORT_FILE_NM = A838TBT16_IMPORT_FILE_NM ;
         Z839TBT16_FILE_NM = A839TBT16_FILE_NM ;
         Z840TBT16_IMPORT_DATETIME = A840TBT16_IMPORT_DATETIME ;
         Z841TBT16_DEL_FLG = A841TBT16_DEL_FLG ;
         Z844TBT16_CRT_PROG_NM = A844TBT16_CRT_PROG_NM ;
         Z847TBT16_UPD_PROG_NM = A847TBT16_UPD_PROG_NM ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
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
   }

   public void load1F50( )
   {
      /* Using cursor T001F4 */
      pr_default.execute(2, new Object[] {new Long(A190TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A842TBT16_CRT_DATETIME = T001F4_A842TBT16_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A842TBT16_CRT_DATETIME", localUtil.ttoc( A842TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n842TBT16_CRT_DATETIME = T001F4_n842TBT16_CRT_DATETIME[0] ;
         A843TBT16_CRT_USER_ID = T001F4_A843TBT16_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A843TBT16_CRT_USER_ID", A843TBT16_CRT_USER_ID);
         n843TBT16_CRT_USER_ID = T001F4_n843TBT16_CRT_USER_ID[0] ;
         A845TBT16_UPD_DATETIME = T001F4_A845TBT16_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A845TBT16_UPD_DATETIME", localUtil.ttoc( A845TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n845TBT16_UPD_DATETIME = T001F4_n845TBT16_UPD_DATETIME[0] ;
         A846TBT16_UPD_USER_ID = T001F4_A846TBT16_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A846TBT16_UPD_USER_ID", A846TBT16_UPD_USER_ID);
         n846TBT16_UPD_USER_ID = T001F4_n846TBT16_UPD_USER_ID[0] ;
         A848TBT16_UPD_CNT = T001F4_A848TBT16_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A848TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A848TBT16_UPD_CNT, 10, 0)));
         n848TBT16_UPD_CNT = T001F4_n848TBT16_UPD_CNT[0] ;
         A838TBT16_IMPORT_FILE_NM = T001F4_A838TBT16_IMPORT_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A838TBT16_IMPORT_FILE_NM", A838TBT16_IMPORT_FILE_NM);
         n838TBT16_IMPORT_FILE_NM = T001F4_n838TBT16_IMPORT_FILE_NM[0] ;
         A839TBT16_FILE_NM = T001F4_A839TBT16_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TBT16_FILE_NM", A839TBT16_FILE_NM);
         n839TBT16_FILE_NM = T001F4_n839TBT16_FILE_NM[0] ;
         A840TBT16_IMPORT_DATETIME = T001F4_A840TBT16_IMPORT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TBT16_IMPORT_DATETIME", localUtil.ttoc( A840TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n840TBT16_IMPORT_DATETIME = T001F4_n840TBT16_IMPORT_DATETIME[0] ;
         A841TBT16_DEL_FLG = T001F4_A841TBT16_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TBT16_DEL_FLG", A841TBT16_DEL_FLG);
         n841TBT16_DEL_FLG = T001F4_n841TBT16_DEL_FLG[0] ;
         A844TBT16_CRT_PROG_NM = T001F4_A844TBT16_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A844TBT16_CRT_PROG_NM", A844TBT16_CRT_PROG_NM);
         n844TBT16_CRT_PROG_NM = T001F4_n844TBT16_CRT_PROG_NM[0] ;
         A847TBT16_UPD_PROG_NM = T001F4_A847TBT16_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A847TBT16_UPD_PROG_NM", A847TBT16_UPD_PROG_NM);
         n847TBT16_UPD_PROG_NM = T001F4_n847TBT16_UPD_PROG_NM[0] ;
         zm1F50( -9) ;
      }
      pr_default.close(2);
      onLoadActions1F50( ) ;
   }

   public void onLoadActions1F50( )
   {
      AV9Pgmname = "TBT16_IMPORT_HISTORY" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable1F50( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT16_IMPORT_HISTORY" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A840TBT16_IMPORT_DATETIME) || (( A840TBT16_IMPORT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A840TBT16_IMPORT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　取込日時 は範囲外です", "OutOfRange", 1, "TBT16_IMPORT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT16_IMPORT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A842TBT16_CRT_DATETIME) || (( A842TBT16_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A842TBT16_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBT16_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT16_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A845TBT16_UPD_DATETIME) || (( A845TBT16_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A845TBT16_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBT16_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT16_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1F50( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1F50( )
   {
      /* Using cursor T001F5 */
      pr_default.execute(3, new Object[] {new Long(A190TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound50 = (short)(1) ;
      }
      else
      {
         RcdFound50 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001F3 */
      pr_default.execute(1, new Object[] {new Long(A190TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1F50( 9) ;
         RcdFound50 = (short)(1) ;
         A190TBT16_IMPORT_NO = T001F3_A190TBT16_IMPORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
         A842TBT16_CRT_DATETIME = T001F3_A842TBT16_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A842TBT16_CRT_DATETIME", localUtil.ttoc( A842TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n842TBT16_CRT_DATETIME = T001F3_n842TBT16_CRT_DATETIME[0] ;
         A843TBT16_CRT_USER_ID = T001F3_A843TBT16_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A843TBT16_CRT_USER_ID", A843TBT16_CRT_USER_ID);
         n843TBT16_CRT_USER_ID = T001F3_n843TBT16_CRT_USER_ID[0] ;
         A845TBT16_UPD_DATETIME = T001F3_A845TBT16_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A845TBT16_UPD_DATETIME", localUtil.ttoc( A845TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n845TBT16_UPD_DATETIME = T001F3_n845TBT16_UPD_DATETIME[0] ;
         A846TBT16_UPD_USER_ID = T001F3_A846TBT16_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A846TBT16_UPD_USER_ID", A846TBT16_UPD_USER_ID);
         n846TBT16_UPD_USER_ID = T001F3_n846TBT16_UPD_USER_ID[0] ;
         A848TBT16_UPD_CNT = T001F3_A848TBT16_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A848TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A848TBT16_UPD_CNT, 10, 0)));
         n848TBT16_UPD_CNT = T001F3_n848TBT16_UPD_CNT[0] ;
         A838TBT16_IMPORT_FILE_NM = T001F3_A838TBT16_IMPORT_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A838TBT16_IMPORT_FILE_NM", A838TBT16_IMPORT_FILE_NM);
         n838TBT16_IMPORT_FILE_NM = T001F3_n838TBT16_IMPORT_FILE_NM[0] ;
         A839TBT16_FILE_NM = T001F3_A839TBT16_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A839TBT16_FILE_NM", A839TBT16_FILE_NM);
         n839TBT16_FILE_NM = T001F3_n839TBT16_FILE_NM[0] ;
         A840TBT16_IMPORT_DATETIME = T001F3_A840TBT16_IMPORT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TBT16_IMPORT_DATETIME", localUtil.ttoc( A840TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n840TBT16_IMPORT_DATETIME = T001F3_n840TBT16_IMPORT_DATETIME[0] ;
         A841TBT16_DEL_FLG = T001F3_A841TBT16_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TBT16_DEL_FLG", A841TBT16_DEL_FLG);
         n841TBT16_DEL_FLG = T001F3_n841TBT16_DEL_FLG[0] ;
         A844TBT16_CRT_PROG_NM = T001F3_A844TBT16_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A844TBT16_CRT_PROG_NM", A844TBT16_CRT_PROG_NM);
         n844TBT16_CRT_PROG_NM = T001F3_n844TBT16_CRT_PROG_NM[0] ;
         A847TBT16_UPD_PROG_NM = T001F3_A847TBT16_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A847TBT16_UPD_PROG_NM", A847TBT16_UPD_PROG_NM);
         n847TBT16_UPD_PROG_NM = T001F3_n847TBT16_UPD_PROG_NM[0] ;
         O848TBT16_UPD_CNT = A848TBT16_UPD_CNT ;
         n848TBT16_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A848TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A848TBT16_UPD_CNT, 10, 0)));
         Z190TBT16_IMPORT_NO = A190TBT16_IMPORT_NO ;
         sMode50 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1F50( ) ;
         if ( AnyError == 1 )
         {
            RcdFound50 = (short)(0) ;
            initializeNonKey1F50( ) ;
         }
         Gx_mode = sMode50 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound50 = (short)(0) ;
         initializeNonKey1F50( ) ;
         sMode50 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode50 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1F50( ) ;
      if ( RcdFound50 == 0 )
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
      RcdFound50 = (short)(0) ;
      /* Using cursor T001F6 */
      pr_default.execute(4, new Object[] {new Long(A190TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001F6_A190TBT16_IMPORT_NO[0] < A190TBT16_IMPORT_NO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001F6_A190TBT16_IMPORT_NO[0] > A190TBT16_IMPORT_NO ) ) )
         {
            A190TBT16_IMPORT_NO = T001F6_A190TBT16_IMPORT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
            RcdFound50 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound50 = (short)(0) ;
      /* Using cursor T001F7 */
      pr_default.execute(5, new Object[] {new Long(A190TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001F7_A190TBT16_IMPORT_NO[0] > A190TBT16_IMPORT_NO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001F7_A190TBT16_IMPORT_NO[0] < A190TBT16_IMPORT_NO ) ) )
         {
            A190TBT16_IMPORT_NO = T001F7_A190TBT16_IMPORT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
            RcdFound50 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1F50( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1F50( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound50 == 1 )
         {
            if ( A190TBT16_IMPORT_NO != Z190TBT16_IMPORT_NO )
            {
               A190TBT16_IMPORT_NO = Z190TBT16_IMPORT_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBT16_IMPORT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1F50( ) ;
               GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A190TBT16_IMPORT_NO != Z190TBT16_IMPORT_NO )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1F50( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBT16_IMPORT_NO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1F50( ) ;
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
      if ( A190TBT16_IMPORT_NO != Z190TBT16_IMPORT_NO )
      {
         A190TBT16_IMPORT_NO = Z190TBT16_IMPORT_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBT16_IMPORT_NO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
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

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT16_IMPORT_NO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBT16_IMPORT_FILE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1F50( ) ;
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT16_IMPORT_FILE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F50( ) ;
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
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT16_IMPORT_FILE_NM_Internalname ;
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
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT16_IMPORT_FILE_NM_Internalname ;
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
      scanStart1F50( ) ;
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound50 != 0 )
         {
            scanNext1F50( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT16_IMPORT_FILE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F50( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1F50( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001F2 */
         pr_default.execute(0, new Object[] {new Long(A190TBT16_IMPORT_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT16_IMPORT_HISTORY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z842TBT16_CRT_DATETIME.equals( T001F2_A842TBT16_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z843TBT16_CRT_USER_ID, T001F2_A843TBT16_CRT_USER_ID[0]) != 0 ) || !( Z845TBT16_UPD_DATETIME.equals( T001F2_A845TBT16_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z846TBT16_UPD_USER_ID, T001F2_A846TBT16_UPD_USER_ID[0]) != 0 ) || ( Z848TBT16_UPD_CNT != T001F2_A848TBT16_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z838TBT16_IMPORT_FILE_NM, T001F2_A838TBT16_IMPORT_FILE_NM[0]) != 0 ) || ( GXutil.strcmp(Z839TBT16_FILE_NM, T001F2_A839TBT16_FILE_NM[0]) != 0 ) || !( Z840TBT16_IMPORT_DATETIME.equals( T001F2_A840TBT16_IMPORT_DATETIME[0] ) ) || ( GXutil.strcmp(Z841TBT16_DEL_FLG, T001F2_A841TBT16_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z844TBT16_CRT_PROG_NM, T001F2_A844TBT16_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z847TBT16_UPD_PROG_NM, T001F2_A847TBT16_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT16_IMPORT_HISTORY"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F50( )
   {
      beforeValidate1F50( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F50( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F50( 0) ;
         checkOptimisticConcurrency1F50( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F50( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F50( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001F8 */
                  pr_default.execute(6, new Object[] {new Boolean(n842TBT16_CRT_DATETIME), A842TBT16_CRT_DATETIME, new Boolean(n843TBT16_CRT_USER_ID), A843TBT16_CRT_USER_ID, new Boolean(n845TBT16_UPD_DATETIME), A845TBT16_UPD_DATETIME, new Boolean(n846TBT16_UPD_USER_ID), A846TBT16_UPD_USER_ID, new Boolean(n848TBT16_UPD_CNT), new Long(A848TBT16_UPD_CNT), new Boolean(n838TBT16_IMPORT_FILE_NM), A838TBT16_IMPORT_FILE_NM, new Boolean(n839TBT16_FILE_NM), A839TBT16_FILE_NM, new Boolean(n840TBT16_IMPORT_DATETIME), A840TBT16_IMPORT_DATETIME, new Boolean(n841TBT16_DEL_FLG), A841TBT16_DEL_FLG, new Boolean(n844TBT16_CRT_PROG_NM), A844TBT16_CRT_PROG_NM, new Boolean(n847TBT16_UPD_PROG_NM), A847TBT16_UPD_PROG_NM});
                  /* Retrieving last key number assigned */
                  /* Using cursor T001F9 */
                  pr_default.execute(7);
                  A190TBT16_IMPORT_NO = T001F9_A190TBT16_IMPORT_NO[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT16_IMPORT_HISTORY") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption1F0( ) ;
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
            load1F50( ) ;
         }
         endLevel1F50( ) ;
      }
      closeExtendedTableCursors1F50( ) ;
   }

   public void update1F50( )
   {
      beforeValidate1F50( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F50( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F50( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F50( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1F50( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001F10 */
                  pr_default.execute(8, new Object[] {new Boolean(n842TBT16_CRT_DATETIME), A842TBT16_CRT_DATETIME, new Boolean(n843TBT16_CRT_USER_ID), A843TBT16_CRT_USER_ID, new Boolean(n845TBT16_UPD_DATETIME), A845TBT16_UPD_DATETIME, new Boolean(n846TBT16_UPD_USER_ID), A846TBT16_UPD_USER_ID, new Boolean(n848TBT16_UPD_CNT), new Long(A848TBT16_UPD_CNT), new Boolean(n838TBT16_IMPORT_FILE_NM), A838TBT16_IMPORT_FILE_NM, new Boolean(n839TBT16_FILE_NM), A839TBT16_FILE_NM, new Boolean(n840TBT16_IMPORT_DATETIME), A840TBT16_IMPORT_DATETIME, new Boolean(n841TBT16_DEL_FLG), A841TBT16_DEL_FLG, new Boolean(n844TBT16_CRT_PROG_NM), A844TBT16_CRT_PROG_NM, new Boolean(n847TBT16_UPD_PROG_NM), A847TBT16_UPD_PROG_NM, new Long(A190TBT16_IMPORT_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT16_IMPORT_HISTORY") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT16_IMPORT_HISTORY"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1F50( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption1F0( ) ;
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
         endLevel1F50( ) ;
      }
      closeExtendedTableCursors1F50( ) ;
   }

   public void deferredUpdate1F50( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F50( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F50( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F50( ) ;
         afterConfirm1F50( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F50( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001F11 */
               pr_default.execute(9, new Object[] {new Long(A190TBT16_IMPORT_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT16_IMPORT_HISTORY") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound50 == 0 )
                     {
                        initAll1F50( ) ;
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
                     resetCaption1F0( ) ;
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
      sMode50 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F50( ) ;
      Gx_mode = sMode50 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F50( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT16_IMPORT_HISTORY" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel1F50( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1F50( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbt16_import_history");
         if ( AnyError == 0 )
         {
            confirmValues1F0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbt16_import_history");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1F50( )
   {
      /* Scan By routine */
      /* Using cursor T001F12 */
      pr_default.execute(10);
      RcdFound50 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A190TBT16_IMPORT_NO = T001F12_A190TBT16_IMPORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F50( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound50 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A190TBT16_IMPORT_NO = T001F12_A190TBT16_IMPORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
      }
   }

   public void scanEnd1F50( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1F50( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F50( )
   {
      /* Before Insert Rules */
      A842TBT16_CRT_DATETIME = GXutil.now( ) ;
      n842TBT16_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A842TBT16_CRT_DATETIME", localUtil.ttoc( A842TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A843TBT16_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt16_import_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A843TBT16_CRT_USER_ID = GXt_char1 ;
      n843TBT16_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A843TBT16_CRT_USER_ID", A843TBT16_CRT_USER_ID);
      A845TBT16_UPD_DATETIME = GXutil.now( ) ;
      n845TBT16_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A845TBT16_UPD_DATETIME", localUtil.ttoc( A845TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A846TBT16_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt16_import_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A846TBT16_UPD_USER_ID = GXt_char1 ;
      n846TBT16_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A846TBT16_UPD_USER_ID", A846TBT16_UPD_USER_ID);
      A848TBT16_UPD_CNT = (long)(O848TBT16_UPD_CNT+1) ;
      n848TBT16_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A848TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A848TBT16_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1F50( )
   {
      /* Before Update Rules */
      A845TBT16_UPD_DATETIME = GXutil.now( ) ;
      n845TBT16_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A845TBT16_UPD_DATETIME", localUtil.ttoc( A845TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A846TBT16_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt16_import_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A846TBT16_UPD_USER_ID = GXt_char1 ;
      n846TBT16_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A846TBT16_UPD_USER_ID", A846TBT16_UPD_USER_ID);
      A848TBT16_UPD_CNT = (long)(O848TBT16_UPD_CNT+1) ;
      n848TBT16_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A848TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A848TBT16_UPD_CNT, 10, 0)));
   }

   public void beforeDelete1F50( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F50( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F50( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F50( )
   {
      edtTBT16_IMPORT_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_IMPORT_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_IMPORT_NO_Enabled, 5, 0)));
      edtTBT16_IMPORT_FILE_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_IMPORT_FILE_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_IMPORT_FILE_NM_Enabled, 5, 0)));
      edtTBT16_FILE_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_FILE_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_FILE_NM_Enabled, 5, 0)));
      edtTBT16_IMPORT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_IMPORT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_IMPORT_DATETIME_Enabled, 5, 0)));
      edtTBT16_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_DEL_FLG_Enabled, 5, 0)));
      edtTBT16_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_CRT_DATETIME_Enabled, 5, 0)));
      edtTBT16_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_CRT_USER_ID_Enabled, 5, 0)));
      edtTBT16_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBT16_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_UPD_DATETIME_Enabled, 5, 0)));
      edtTBT16_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_UPD_USER_ID_Enabled, 5, 0)));
      edtTBT16_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBT16_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT16_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT16_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1F0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "選択一覧取込履歴テーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151322459");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbt16_import_history") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1F50( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z190TBT16_IMPORT_NO", GXutil.ltrim( localUtil.ntoc( Z190TBT16_IMPORT_NO, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z842TBT16_CRT_DATETIME", localUtil.ttoc( Z842TBT16_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z843TBT16_CRT_USER_ID", GXutil.rtrim( Z843TBT16_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z845TBT16_UPD_DATETIME", localUtil.ttoc( Z845TBT16_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z846TBT16_UPD_USER_ID", GXutil.rtrim( Z846TBT16_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z848TBT16_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z848TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z838TBT16_IMPORT_FILE_NM", GXutil.rtrim( Z838TBT16_IMPORT_FILE_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z839TBT16_FILE_NM", GXutil.rtrim( Z839TBT16_FILE_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z840TBT16_IMPORT_DATETIME", localUtil.ttoc( Z840TBT16_IMPORT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z841TBT16_DEL_FLG", GXutil.rtrim( Z841TBT16_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z844TBT16_CRT_PROG_NM", GXutil.rtrim( Z844TBT16_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z847TBT16_UPD_PROG_NM", GXutil.rtrim( Z847TBT16_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O848TBT16_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O848TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV9Pgmname));
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
      return "TBT16_IMPORT_HISTORY" ;
   }

   public String getPgmdesc( )
   {
      return "選択一覧取込履歴テーブル" ;
   }

   public void initializeNonKey1F50( )
   {
      A842TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n842TBT16_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A842TBT16_CRT_DATETIME", localUtil.ttoc( A842TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n842TBT16_CRT_DATETIME = (GXutil.nullDate().equals(A842TBT16_CRT_DATETIME) ? true : false) ;
      A843TBT16_CRT_USER_ID = "" ;
      n843TBT16_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A843TBT16_CRT_USER_ID", A843TBT16_CRT_USER_ID);
      n843TBT16_CRT_USER_ID = ((GXutil.strcmp("", A843TBT16_CRT_USER_ID)==0) ? true : false) ;
      A845TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n845TBT16_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A845TBT16_UPD_DATETIME", localUtil.ttoc( A845TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n845TBT16_UPD_DATETIME = (GXutil.nullDate().equals(A845TBT16_UPD_DATETIME) ? true : false) ;
      A846TBT16_UPD_USER_ID = "" ;
      n846TBT16_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A846TBT16_UPD_USER_ID", A846TBT16_UPD_USER_ID);
      n846TBT16_UPD_USER_ID = ((GXutil.strcmp("", A846TBT16_UPD_USER_ID)==0) ? true : false) ;
      A848TBT16_UPD_CNT = 0 ;
      n848TBT16_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A848TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A848TBT16_UPD_CNT, 10, 0)));
      n848TBT16_UPD_CNT = ((0==A848TBT16_UPD_CNT) ? true : false) ;
      A838TBT16_IMPORT_FILE_NM = "" ;
      n838TBT16_IMPORT_FILE_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A838TBT16_IMPORT_FILE_NM", A838TBT16_IMPORT_FILE_NM);
      n838TBT16_IMPORT_FILE_NM = ((GXutil.strcmp("", A838TBT16_IMPORT_FILE_NM)==0) ? true : false) ;
      A839TBT16_FILE_NM = "" ;
      n839TBT16_FILE_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A839TBT16_FILE_NM", A839TBT16_FILE_NM);
      n839TBT16_FILE_NM = ((GXutil.strcmp("", A839TBT16_FILE_NM)==0) ? true : false) ;
      A840TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n840TBT16_IMPORT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TBT16_IMPORT_DATETIME", localUtil.ttoc( A840TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n840TBT16_IMPORT_DATETIME = (GXutil.nullDate().equals(A840TBT16_IMPORT_DATETIME) ? true : false) ;
      A841TBT16_DEL_FLG = "" ;
      n841TBT16_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TBT16_DEL_FLG", A841TBT16_DEL_FLG);
      n841TBT16_DEL_FLG = ((GXutil.strcmp("", A841TBT16_DEL_FLG)==0) ? true : false) ;
      A844TBT16_CRT_PROG_NM = "" ;
      n844TBT16_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A844TBT16_CRT_PROG_NM", A844TBT16_CRT_PROG_NM);
      n844TBT16_CRT_PROG_NM = ((GXutil.strcmp("", A844TBT16_CRT_PROG_NM)==0) ? true : false) ;
      A847TBT16_UPD_PROG_NM = "" ;
      n847TBT16_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A847TBT16_UPD_PROG_NM", A847TBT16_UPD_PROG_NM);
      n847TBT16_UPD_PROG_NM = ((GXutil.strcmp("", A847TBT16_UPD_PROG_NM)==0) ? true : false) ;
      O848TBT16_UPD_CNT = A848TBT16_UPD_CNT ;
      n848TBT16_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A848TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A848TBT16_UPD_CNT, 10, 0)));
   }

   public void initAll1F50( )
   {
      A190TBT16_IMPORT_NO = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A190TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A190TBT16_IMPORT_NO, 10, 0)));
      initializeNonKey1F50( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?1830155");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151322462");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbt16_import_history.js", "?20207151322462");
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
      divSectiontoolbar_Internalname = "SECTIONTOOLBAR" ;
      tblTabletoolbar_Internalname = "TABLETOOLBAR" ;
      lblTextblocktbt16_import_no_Internalname = "TEXTBLOCKTBT16_IMPORT_NO" ;
      edtTBT16_IMPORT_NO_Internalname = "TBT16_IMPORT_NO" ;
      lblTextblocktbt16_import_file_nm_Internalname = "TEXTBLOCKTBT16_IMPORT_FILE_NM" ;
      edtTBT16_IMPORT_FILE_NM_Internalname = "TBT16_IMPORT_FILE_NM" ;
      lblTextblocktbt16_file_nm_Internalname = "TEXTBLOCKTBT16_FILE_NM" ;
      edtTBT16_FILE_NM_Internalname = "TBT16_FILE_NM" ;
      lblTextblocktbt16_import_datetime_Internalname = "TEXTBLOCKTBT16_IMPORT_DATETIME" ;
      edtTBT16_IMPORT_DATETIME_Internalname = "TBT16_IMPORT_DATETIME" ;
      lblTextblocktbt16_del_flg_Internalname = "TEXTBLOCKTBT16_DEL_FLG" ;
      edtTBT16_DEL_FLG_Internalname = "TBT16_DEL_FLG" ;
      lblTextblocktbt16_crt_datetime_Internalname = "TEXTBLOCKTBT16_CRT_DATETIME" ;
      edtTBT16_CRT_DATETIME_Internalname = "TBT16_CRT_DATETIME" ;
      lblTextblocktbt16_crt_user_id_Internalname = "TEXTBLOCKTBT16_CRT_USER_ID" ;
      edtTBT16_CRT_USER_ID_Internalname = "TBT16_CRT_USER_ID" ;
      lblTextblocktbt16_crt_prog_nm_Internalname = "TEXTBLOCKTBT16_CRT_PROG_NM" ;
      edtTBT16_CRT_PROG_NM_Internalname = "TBT16_CRT_PROG_NM" ;
      lblTextblocktbt16_upd_datetime_Internalname = "TEXTBLOCKTBT16_UPD_DATETIME" ;
      edtTBT16_UPD_DATETIME_Internalname = "TBT16_UPD_DATETIME" ;
      lblTextblocktbt16_upd_user_id_Internalname = "TEXTBLOCKTBT16_UPD_USER_ID" ;
      edtTBT16_UPD_USER_ID_Internalname = "TBT16_UPD_USER_ID" ;
      lblTextblocktbt16_upd_prog_nm_Internalname = "TEXTBLOCKTBT16_UPD_PROG_NM" ;
      edtTBT16_UPD_PROG_NM_Internalname = "TBT16_UPD_PROG_NM" ;
      lblTextblocktbt16_upd_cnt_Internalname = "TEXTBLOCKTBT16_UPD_CNT" ;
      edtTBT16_UPD_CNT_Internalname = "TBT16_UPD_CNT" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
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
      edtTBT16_UPD_CNT_Jsonclick = "" ;
      edtTBT16_UPD_CNT_Enabled = 1 ;
      edtTBT16_UPD_PROG_NM_Jsonclick = "" ;
      edtTBT16_UPD_PROG_NM_Enabled = 1 ;
      edtTBT16_UPD_USER_ID_Jsonclick = "" ;
      edtTBT16_UPD_USER_ID_Enabled = 1 ;
      edtTBT16_UPD_DATETIME_Jsonclick = "" ;
      edtTBT16_UPD_DATETIME_Enabled = 1 ;
      edtTBT16_CRT_PROG_NM_Jsonclick = "" ;
      edtTBT16_CRT_PROG_NM_Enabled = 1 ;
      edtTBT16_CRT_USER_ID_Jsonclick = "" ;
      edtTBT16_CRT_USER_ID_Enabled = 1 ;
      edtTBT16_CRT_DATETIME_Jsonclick = "" ;
      edtTBT16_CRT_DATETIME_Enabled = 1 ;
      edtTBT16_DEL_FLG_Jsonclick = "" ;
      edtTBT16_DEL_FLG_Enabled = 1 ;
      edtTBT16_IMPORT_DATETIME_Jsonclick = "" ;
      edtTBT16_IMPORT_DATETIME_Enabled = 1 ;
      edtTBT16_FILE_NM_Enabled = 1 ;
      edtTBT16_IMPORT_FILE_NM_Enabled = 1 ;
      edtTBT16_IMPORT_NO_Jsonclick = "" ;
      edtTBT16_IMPORT_NO_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx5asatbt16_crt_user_id1F50( String Gx_mode )
   {
      GXt_char1 = A843TBT16_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt16_import_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A843TBT16_CRT_USER_ID = GXt_char1 ;
      n843TBT16_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A843TBT16_CRT_USER_ID", A843TBT16_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A843TBT16_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx7asatbt16_upd_user_id1F50( String Gx_mode )
   {
      GXt_char1 = A846TBT16_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt16_import_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A846TBT16_UPD_USER_ID = GXt_char1 ;
      n846TBT16_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A846TBT16_UPD_USER_ID", A846TBT16_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A846TBT16_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBT16_IMPORT_FILE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt16_import_no( long GX_Parm1 ,
                                      java.util.Date GX_Parm2 ,
                                      String GX_Parm3 ,
                                      java.util.Date GX_Parm4 ,
                                      String GX_Parm5 ,
                                      long GX_Parm6 ,
                                      String GX_Parm7 ,
                                      String GX_Parm8 ,
                                      java.util.Date GX_Parm9 ,
                                      String GX_Parm10 ,
                                      String GX_Parm11 ,
                                      String GX_Parm12 )
   {
      A190TBT16_IMPORT_NO = GX_Parm1 ;
      A842TBT16_CRT_DATETIME = GX_Parm2 ;
      n842TBT16_CRT_DATETIME = false ;
      A843TBT16_CRT_USER_ID = GX_Parm3 ;
      n843TBT16_CRT_USER_ID = false ;
      A845TBT16_UPD_DATETIME = GX_Parm4 ;
      n845TBT16_UPD_DATETIME = false ;
      A846TBT16_UPD_USER_ID = GX_Parm5 ;
      n846TBT16_UPD_USER_ID = false ;
      A848TBT16_UPD_CNT = GX_Parm6 ;
      n848TBT16_UPD_CNT = false ;
      A838TBT16_IMPORT_FILE_NM = GX_Parm7 ;
      n838TBT16_IMPORT_FILE_NM = false ;
      A839TBT16_FILE_NM = GX_Parm8 ;
      n839TBT16_FILE_NM = false ;
      A840TBT16_IMPORT_DATETIME = GX_Parm9 ;
      n840TBT16_IMPORT_DATETIME = false ;
      A841TBT16_DEL_FLG = GX_Parm10 ;
      n841TBT16_DEL_FLG = false ;
      A844TBT16_CRT_PROG_NM = GX_Parm11 ;
      n844TBT16_CRT_PROG_NM = false ;
      A847TBT16_UPD_PROG_NM = GX_Parm12 ;
      n847TBT16_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A842TBT16_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A843TBT16_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A845TBT16_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A846TBT16_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A848TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A838TBT16_IMPORT_FILE_NM));
      isValidOutput.add(GXutil.rtrim( A839TBT16_FILE_NM));
      isValidOutput.add(localUtil.format(A840TBT16_IMPORT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A841TBT16_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A844TBT16_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A847TBT16_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z190TBT16_IMPORT_NO, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z842TBT16_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z843TBT16_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z845TBT16_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z846TBT16_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z848TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z838TBT16_IMPORT_FILE_NM));
      isValidOutput.add(GXutil.rtrim( Z839TBT16_FILE_NM));
      isValidOutput.add(localUtil.ttoc( Z840TBT16_IMPORT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z841TBT16_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z844TBT16_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z847TBT16_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O848TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
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
               default:
                  /* Execute user subroutine: S112 */
                  S112 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      sPrefix = "" ;
      Z842TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z843TBT16_CRT_USER_ID = "" ;
      Z845TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z846TBT16_UPD_USER_ID = "" ;
      Z838TBT16_IMPORT_FILE_NM = "" ;
      Z839TBT16_FILE_NM = "" ;
      Z840TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z841TBT16_DEL_FLG = "" ;
      Z844TBT16_CRT_PROG_NM = "" ;
      Z847TBT16_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      lblTextblocktbt16_import_no_Jsonclick = "" ;
      lblTextblocktbt16_import_file_nm_Jsonclick = "" ;
      A838TBT16_IMPORT_FILE_NM = "" ;
      lblTextblocktbt16_file_nm_Jsonclick = "" ;
      A839TBT16_FILE_NM = "" ;
      lblTextblocktbt16_import_datetime_Jsonclick = "" ;
      A840TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt16_del_flg_Jsonclick = "" ;
      A841TBT16_DEL_FLG = "" ;
      lblTextblocktbt16_crt_datetime_Jsonclick = "" ;
      A842TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt16_crt_user_id_Jsonclick = "" ;
      A843TBT16_CRT_USER_ID = "" ;
      lblTextblocktbt16_crt_prog_nm_Jsonclick = "" ;
      A844TBT16_CRT_PROG_NM = "" ;
      lblTextblocktbt16_upd_datetime_Jsonclick = "" ;
      A845TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt16_upd_user_id_Jsonclick = "" ;
      A846TBT16_UPD_USER_ID = "" ;
      lblTextblocktbt16_upd_prog_nm_Jsonclick = "" ;
      A847TBT16_UPD_PROG_NM = "" ;
      lblTextblocktbt16_upd_cnt_Jsonclick = "" ;
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
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T001F4_A190TBT16_IMPORT_NO = new long[1] ;
      T001F4_A842TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F4_n842TBT16_CRT_DATETIME = new boolean[] {false} ;
      T001F4_A843TBT16_CRT_USER_ID = new String[] {""} ;
      T001F4_n843TBT16_CRT_USER_ID = new boolean[] {false} ;
      T001F4_A845TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F4_n845TBT16_UPD_DATETIME = new boolean[] {false} ;
      T001F4_A846TBT16_UPD_USER_ID = new String[] {""} ;
      T001F4_n846TBT16_UPD_USER_ID = new boolean[] {false} ;
      T001F4_A848TBT16_UPD_CNT = new long[1] ;
      T001F4_n848TBT16_UPD_CNT = new boolean[] {false} ;
      T001F4_A838TBT16_IMPORT_FILE_NM = new String[] {""} ;
      T001F4_n838TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      T001F4_A839TBT16_FILE_NM = new String[] {""} ;
      T001F4_n839TBT16_FILE_NM = new boolean[] {false} ;
      T001F4_A840TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F4_n840TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      T001F4_A841TBT16_DEL_FLG = new String[] {""} ;
      T001F4_n841TBT16_DEL_FLG = new boolean[] {false} ;
      T001F4_A844TBT16_CRT_PROG_NM = new String[] {""} ;
      T001F4_n844TBT16_CRT_PROG_NM = new boolean[] {false} ;
      T001F4_A847TBT16_UPD_PROG_NM = new String[] {""} ;
      T001F4_n847TBT16_UPD_PROG_NM = new boolean[] {false} ;
      T001F5_A190TBT16_IMPORT_NO = new long[1] ;
      T001F3_A190TBT16_IMPORT_NO = new long[1] ;
      T001F3_A842TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F3_n842TBT16_CRT_DATETIME = new boolean[] {false} ;
      T001F3_A843TBT16_CRT_USER_ID = new String[] {""} ;
      T001F3_n843TBT16_CRT_USER_ID = new boolean[] {false} ;
      T001F3_A845TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F3_n845TBT16_UPD_DATETIME = new boolean[] {false} ;
      T001F3_A846TBT16_UPD_USER_ID = new String[] {""} ;
      T001F3_n846TBT16_UPD_USER_ID = new boolean[] {false} ;
      T001F3_A848TBT16_UPD_CNT = new long[1] ;
      T001F3_n848TBT16_UPD_CNT = new boolean[] {false} ;
      T001F3_A838TBT16_IMPORT_FILE_NM = new String[] {""} ;
      T001F3_n838TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      T001F3_A839TBT16_FILE_NM = new String[] {""} ;
      T001F3_n839TBT16_FILE_NM = new boolean[] {false} ;
      T001F3_A840TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F3_n840TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      T001F3_A841TBT16_DEL_FLG = new String[] {""} ;
      T001F3_n841TBT16_DEL_FLG = new boolean[] {false} ;
      T001F3_A844TBT16_CRT_PROG_NM = new String[] {""} ;
      T001F3_n844TBT16_CRT_PROG_NM = new boolean[] {false} ;
      T001F3_A847TBT16_UPD_PROG_NM = new String[] {""} ;
      T001F3_n847TBT16_UPD_PROG_NM = new boolean[] {false} ;
      sMode50 = "" ;
      T001F6_A190TBT16_IMPORT_NO = new long[1] ;
      T001F7_A190TBT16_IMPORT_NO = new long[1] ;
      T001F2_A190TBT16_IMPORT_NO = new long[1] ;
      T001F2_A842TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F2_n842TBT16_CRT_DATETIME = new boolean[] {false} ;
      T001F2_A843TBT16_CRT_USER_ID = new String[] {""} ;
      T001F2_n843TBT16_CRT_USER_ID = new boolean[] {false} ;
      T001F2_A845TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F2_n845TBT16_UPD_DATETIME = new boolean[] {false} ;
      T001F2_A846TBT16_UPD_USER_ID = new String[] {""} ;
      T001F2_n846TBT16_UPD_USER_ID = new boolean[] {false} ;
      T001F2_A848TBT16_UPD_CNT = new long[1] ;
      T001F2_n848TBT16_UPD_CNT = new boolean[] {false} ;
      T001F2_A838TBT16_IMPORT_FILE_NM = new String[] {""} ;
      T001F2_n838TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      T001F2_A839TBT16_FILE_NM = new String[] {""} ;
      T001F2_n839TBT16_FILE_NM = new boolean[] {false} ;
      T001F2_A840TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F2_n840TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      T001F2_A841TBT16_DEL_FLG = new String[] {""} ;
      T001F2_n841TBT16_DEL_FLG = new boolean[] {false} ;
      T001F2_A844TBT16_CRT_PROG_NM = new String[] {""} ;
      T001F2_n844TBT16_CRT_PROG_NM = new boolean[] {false} ;
      T001F2_A847TBT16_UPD_PROG_NM = new String[] {""} ;
      T001F2_n847TBT16_UPD_PROG_NM = new boolean[] {false} ;
      T001F9_A190TBT16_IMPORT_NO = new long[1] ;
      T001F12_A190TBT16_IMPORT_NO = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt16_import_history__default(),
         new Object[] {
             new Object[] {
            T001F2_A190TBT16_IMPORT_NO, T001F2_A842TBT16_CRT_DATETIME, T001F2_n842TBT16_CRT_DATETIME, T001F2_A843TBT16_CRT_USER_ID, T001F2_n843TBT16_CRT_USER_ID, T001F2_A845TBT16_UPD_DATETIME, T001F2_n845TBT16_UPD_DATETIME, T001F2_A846TBT16_UPD_USER_ID, T001F2_n846TBT16_UPD_USER_ID, T001F2_A848TBT16_UPD_CNT,
            T001F2_n848TBT16_UPD_CNT, T001F2_A838TBT16_IMPORT_FILE_NM, T001F2_n838TBT16_IMPORT_FILE_NM, T001F2_A839TBT16_FILE_NM, T001F2_n839TBT16_FILE_NM, T001F2_A840TBT16_IMPORT_DATETIME, T001F2_n840TBT16_IMPORT_DATETIME, T001F2_A841TBT16_DEL_FLG, T001F2_n841TBT16_DEL_FLG, T001F2_A844TBT16_CRT_PROG_NM,
            T001F2_n844TBT16_CRT_PROG_NM, T001F2_A847TBT16_UPD_PROG_NM, T001F2_n847TBT16_UPD_PROG_NM
            }
            , new Object[] {
            T001F3_A190TBT16_IMPORT_NO, T001F3_A842TBT16_CRT_DATETIME, T001F3_n842TBT16_CRT_DATETIME, T001F3_A843TBT16_CRT_USER_ID, T001F3_n843TBT16_CRT_USER_ID, T001F3_A845TBT16_UPD_DATETIME, T001F3_n845TBT16_UPD_DATETIME, T001F3_A846TBT16_UPD_USER_ID, T001F3_n846TBT16_UPD_USER_ID, T001F3_A848TBT16_UPD_CNT,
            T001F3_n848TBT16_UPD_CNT, T001F3_A838TBT16_IMPORT_FILE_NM, T001F3_n838TBT16_IMPORT_FILE_NM, T001F3_A839TBT16_FILE_NM, T001F3_n839TBT16_FILE_NM, T001F3_A840TBT16_IMPORT_DATETIME, T001F3_n840TBT16_IMPORT_DATETIME, T001F3_A841TBT16_DEL_FLG, T001F3_n841TBT16_DEL_FLG, T001F3_A844TBT16_CRT_PROG_NM,
            T001F3_n844TBT16_CRT_PROG_NM, T001F3_A847TBT16_UPD_PROG_NM, T001F3_n847TBT16_UPD_PROG_NM
            }
            , new Object[] {
            T001F4_A190TBT16_IMPORT_NO, T001F4_A842TBT16_CRT_DATETIME, T001F4_n842TBT16_CRT_DATETIME, T001F4_A843TBT16_CRT_USER_ID, T001F4_n843TBT16_CRT_USER_ID, T001F4_A845TBT16_UPD_DATETIME, T001F4_n845TBT16_UPD_DATETIME, T001F4_A846TBT16_UPD_USER_ID, T001F4_n846TBT16_UPD_USER_ID, T001F4_A848TBT16_UPD_CNT,
            T001F4_n848TBT16_UPD_CNT, T001F4_A838TBT16_IMPORT_FILE_NM, T001F4_n838TBT16_IMPORT_FILE_NM, T001F4_A839TBT16_FILE_NM, T001F4_n839TBT16_FILE_NM, T001F4_A840TBT16_IMPORT_DATETIME, T001F4_n840TBT16_IMPORT_DATETIME, T001F4_A841TBT16_DEL_FLG, T001F4_n841TBT16_DEL_FLG, T001F4_A844TBT16_CRT_PROG_NM,
            T001F4_n844TBT16_CRT_PROG_NM, T001F4_A847TBT16_UPD_PROG_NM, T001F4_n847TBT16_UPD_PROG_NM
            }
            , new Object[] {
            T001F5_A190TBT16_IMPORT_NO
            }
            , new Object[] {
            T001F6_A190TBT16_IMPORT_NO
            }
            , new Object[] {
            T001F7_A190TBT16_IMPORT_NO
            }
            , new Object[] {
            }
            , new Object[] {
            T001F9_A190TBT16_IMPORT_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001F12_A190TBT16_IMPORT_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT16_IMPORT_HISTORY" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound50 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT16_IMPORT_NO_Enabled ;
   private int edtTBT16_IMPORT_FILE_NM_Enabled ;
   private int edtTBT16_FILE_NM_Enabled ;
   private int edtTBT16_IMPORT_DATETIME_Enabled ;
   private int edtTBT16_DEL_FLG_Enabled ;
   private int edtTBT16_CRT_DATETIME_Enabled ;
   private int edtTBT16_CRT_USER_ID_Enabled ;
   private int edtTBT16_CRT_PROG_NM_Enabled ;
   private int edtTBT16_UPD_DATETIME_Enabled ;
   private int edtTBT16_UPD_USER_ID_Enabled ;
   private int edtTBT16_UPD_PROG_NM_Enabled ;
   private int edtTBT16_UPD_CNT_Enabled ;
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
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long Z190TBT16_IMPORT_NO ;
   private long Z848TBT16_UPD_CNT ;
   private long O848TBT16_UPD_CNT ;
   private long A190TBT16_IMPORT_NO ;
   private long A848TBT16_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBT16_IMPORT_NO_Internalname ;
   private String sStyleString ;
   private String tblTablemain_Internalname ;
   private String grpGroupdata_Internalname ;
   private String tblTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String TempTags ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblocktbt16_import_no_Internalname ;
   private String lblTextblocktbt16_import_no_Jsonclick ;
   private String edtTBT16_IMPORT_NO_Jsonclick ;
   private String lblTextblocktbt16_import_file_nm_Internalname ;
   private String lblTextblocktbt16_import_file_nm_Jsonclick ;
   private String edtTBT16_IMPORT_FILE_NM_Internalname ;
   private String lblTextblocktbt16_file_nm_Internalname ;
   private String lblTextblocktbt16_file_nm_Jsonclick ;
   private String edtTBT16_FILE_NM_Internalname ;
   private String lblTextblocktbt16_import_datetime_Internalname ;
   private String lblTextblocktbt16_import_datetime_Jsonclick ;
   private String edtTBT16_IMPORT_DATETIME_Internalname ;
   private String edtTBT16_IMPORT_DATETIME_Jsonclick ;
   private String lblTextblocktbt16_del_flg_Internalname ;
   private String lblTextblocktbt16_del_flg_Jsonclick ;
   private String edtTBT16_DEL_FLG_Internalname ;
   private String edtTBT16_DEL_FLG_Jsonclick ;
   private String lblTextblocktbt16_crt_datetime_Internalname ;
   private String lblTextblocktbt16_crt_datetime_Jsonclick ;
   private String edtTBT16_CRT_DATETIME_Internalname ;
   private String edtTBT16_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbt16_crt_user_id_Internalname ;
   private String lblTextblocktbt16_crt_user_id_Jsonclick ;
   private String edtTBT16_CRT_USER_ID_Internalname ;
   private String edtTBT16_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbt16_crt_prog_nm_Internalname ;
   private String lblTextblocktbt16_crt_prog_nm_Jsonclick ;
   private String edtTBT16_CRT_PROG_NM_Internalname ;
   private String edtTBT16_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbt16_upd_datetime_Internalname ;
   private String lblTextblocktbt16_upd_datetime_Jsonclick ;
   private String edtTBT16_UPD_DATETIME_Internalname ;
   private String edtTBT16_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbt16_upd_user_id_Internalname ;
   private String lblTextblocktbt16_upd_user_id_Jsonclick ;
   private String edtTBT16_UPD_USER_ID_Internalname ;
   private String edtTBT16_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbt16_upd_prog_nm_Internalname ;
   private String lblTextblocktbt16_upd_prog_nm_Jsonclick ;
   private String edtTBT16_UPD_PROG_NM_Internalname ;
   private String edtTBT16_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbt16_upd_cnt_Internalname ;
   private String lblTextblocktbt16_upd_cnt_Jsonclick ;
   private String edtTBT16_UPD_CNT_Internalname ;
   private String edtTBT16_UPD_CNT_Jsonclick ;
   private String tblTabletoolbar_Internalname ;
   private String divSectiontoolbar_Internalname ;
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
   private String AV9Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode50 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z842TBT16_CRT_DATETIME ;
   private java.util.Date Z845TBT16_UPD_DATETIME ;
   private java.util.Date Z840TBT16_IMPORT_DATETIME ;
   private java.util.Date A840TBT16_IMPORT_DATETIME ;
   private java.util.Date A842TBT16_CRT_DATETIME ;
   private java.util.Date A845TBT16_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n838TBT16_IMPORT_FILE_NM ;
   private boolean n839TBT16_FILE_NM ;
   private boolean n840TBT16_IMPORT_DATETIME ;
   private boolean n841TBT16_DEL_FLG ;
   private boolean n842TBT16_CRT_DATETIME ;
   private boolean n843TBT16_CRT_USER_ID ;
   private boolean n844TBT16_CRT_PROG_NM ;
   private boolean n845TBT16_UPD_DATETIME ;
   private boolean n846TBT16_UPD_USER_ID ;
   private boolean n847TBT16_UPD_PROG_NM ;
   private boolean n848TBT16_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z843TBT16_CRT_USER_ID ;
   private String Z846TBT16_UPD_USER_ID ;
   private String Z838TBT16_IMPORT_FILE_NM ;
   private String Z839TBT16_FILE_NM ;
   private String Z841TBT16_DEL_FLG ;
   private String Z844TBT16_CRT_PROG_NM ;
   private String Z847TBT16_UPD_PROG_NM ;
   private String A838TBT16_IMPORT_FILE_NM ;
   private String A839TBT16_FILE_NM ;
   private String A841TBT16_DEL_FLG ;
   private String A843TBT16_CRT_USER_ID ;
   private String A844TBT16_CRT_PROG_NM ;
   private String A846TBT16_UPD_USER_ID ;
   private String A847TBT16_UPD_PROG_NM ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T001F4_A190TBT16_IMPORT_NO ;
   private java.util.Date[] T001F4_A842TBT16_CRT_DATETIME ;
   private boolean[] T001F4_n842TBT16_CRT_DATETIME ;
   private String[] T001F4_A843TBT16_CRT_USER_ID ;
   private boolean[] T001F4_n843TBT16_CRT_USER_ID ;
   private java.util.Date[] T001F4_A845TBT16_UPD_DATETIME ;
   private boolean[] T001F4_n845TBT16_UPD_DATETIME ;
   private String[] T001F4_A846TBT16_UPD_USER_ID ;
   private boolean[] T001F4_n846TBT16_UPD_USER_ID ;
   private long[] T001F4_A848TBT16_UPD_CNT ;
   private boolean[] T001F4_n848TBT16_UPD_CNT ;
   private String[] T001F4_A838TBT16_IMPORT_FILE_NM ;
   private boolean[] T001F4_n838TBT16_IMPORT_FILE_NM ;
   private String[] T001F4_A839TBT16_FILE_NM ;
   private boolean[] T001F4_n839TBT16_FILE_NM ;
   private java.util.Date[] T001F4_A840TBT16_IMPORT_DATETIME ;
   private boolean[] T001F4_n840TBT16_IMPORT_DATETIME ;
   private String[] T001F4_A841TBT16_DEL_FLG ;
   private boolean[] T001F4_n841TBT16_DEL_FLG ;
   private String[] T001F4_A844TBT16_CRT_PROG_NM ;
   private boolean[] T001F4_n844TBT16_CRT_PROG_NM ;
   private String[] T001F4_A847TBT16_UPD_PROG_NM ;
   private boolean[] T001F4_n847TBT16_UPD_PROG_NM ;
   private long[] T001F5_A190TBT16_IMPORT_NO ;
   private long[] T001F3_A190TBT16_IMPORT_NO ;
   private java.util.Date[] T001F3_A842TBT16_CRT_DATETIME ;
   private boolean[] T001F3_n842TBT16_CRT_DATETIME ;
   private String[] T001F3_A843TBT16_CRT_USER_ID ;
   private boolean[] T001F3_n843TBT16_CRT_USER_ID ;
   private java.util.Date[] T001F3_A845TBT16_UPD_DATETIME ;
   private boolean[] T001F3_n845TBT16_UPD_DATETIME ;
   private String[] T001F3_A846TBT16_UPD_USER_ID ;
   private boolean[] T001F3_n846TBT16_UPD_USER_ID ;
   private long[] T001F3_A848TBT16_UPD_CNT ;
   private boolean[] T001F3_n848TBT16_UPD_CNT ;
   private String[] T001F3_A838TBT16_IMPORT_FILE_NM ;
   private boolean[] T001F3_n838TBT16_IMPORT_FILE_NM ;
   private String[] T001F3_A839TBT16_FILE_NM ;
   private boolean[] T001F3_n839TBT16_FILE_NM ;
   private java.util.Date[] T001F3_A840TBT16_IMPORT_DATETIME ;
   private boolean[] T001F3_n840TBT16_IMPORT_DATETIME ;
   private String[] T001F3_A841TBT16_DEL_FLG ;
   private boolean[] T001F3_n841TBT16_DEL_FLG ;
   private String[] T001F3_A844TBT16_CRT_PROG_NM ;
   private boolean[] T001F3_n844TBT16_CRT_PROG_NM ;
   private String[] T001F3_A847TBT16_UPD_PROG_NM ;
   private boolean[] T001F3_n847TBT16_UPD_PROG_NM ;
   private long[] T001F6_A190TBT16_IMPORT_NO ;
   private long[] T001F7_A190TBT16_IMPORT_NO ;
   private long[] T001F2_A190TBT16_IMPORT_NO ;
   private java.util.Date[] T001F2_A842TBT16_CRT_DATETIME ;
   private boolean[] T001F2_n842TBT16_CRT_DATETIME ;
   private String[] T001F2_A843TBT16_CRT_USER_ID ;
   private boolean[] T001F2_n843TBT16_CRT_USER_ID ;
   private java.util.Date[] T001F2_A845TBT16_UPD_DATETIME ;
   private boolean[] T001F2_n845TBT16_UPD_DATETIME ;
   private String[] T001F2_A846TBT16_UPD_USER_ID ;
   private boolean[] T001F2_n846TBT16_UPD_USER_ID ;
   private long[] T001F2_A848TBT16_UPD_CNT ;
   private boolean[] T001F2_n848TBT16_UPD_CNT ;
   private String[] T001F2_A838TBT16_IMPORT_FILE_NM ;
   private boolean[] T001F2_n838TBT16_IMPORT_FILE_NM ;
   private String[] T001F2_A839TBT16_FILE_NM ;
   private boolean[] T001F2_n839TBT16_FILE_NM ;
   private java.util.Date[] T001F2_A840TBT16_IMPORT_DATETIME ;
   private boolean[] T001F2_n840TBT16_IMPORT_DATETIME ;
   private String[] T001F2_A841TBT16_DEL_FLG ;
   private boolean[] T001F2_n841TBT16_DEL_FLG ;
   private String[] T001F2_A844TBT16_CRT_PROG_NM ;
   private boolean[] T001F2_n844TBT16_CRT_PROG_NM ;
   private String[] T001F2_A847TBT16_UPD_PROG_NM ;
   private boolean[] T001F2_n847TBT16_UPD_PROG_NM ;
   private long[] T001F9_A190TBT16_IMPORT_NO ;
   private long[] T001F12_A190TBT16_IMPORT_NO ;
}

final  class tbt16_import_history__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001F2", "SELECT `TBT16_IMPORT_NO`, `TBT16_CRT_DATETIME`, `TBT16_CRT_USER_ID`, `TBT16_UPD_DATETIME`, `TBT16_UPD_USER_ID`, `TBT16_UPD_CNT`, `TBT16_IMPORT_FILE_NM`, `TBT16_FILE_NM`, `TBT16_IMPORT_DATETIME`, `TBT16_DEL_FLG`, `TBT16_CRT_PROG_NM`, `TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` WHERE `TBT16_IMPORT_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001F3", "SELECT `TBT16_IMPORT_NO`, `TBT16_CRT_DATETIME`, `TBT16_CRT_USER_ID`, `TBT16_UPD_DATETIME`, `TBT16_UPD_USER_ID`, `TBT16_UPD_CNT`, `TBT16_IMPORT_FILE_NM`, `TBT16_FILE_NM`, `TBT16_IMPORT_DATETIME`, `TBT16_DEL_FLG`, `TBT16_CRT_PROG_NM`, `TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` WHERE `TBT16_IMPORT_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001F4", "SELECT TM1.`TBT16_IMPORT_NO`, TM1.`TBT16_CRT_DATETIME`, TM1.`TBT16_CRT_USER_ID`, TM1.`TBT16_UPD_DATETIME`, TM1.`TBT16_UPD_USER_ID`, TM1.`TBT16_UPD_CNT`, TM1.`TBT16_IMPORT_FILE_NM`, TM1.`TBT16_FILE_NM`, TM1.`TBT16_IMPORT_DATETIME`, TM1.`TBT16_DEL_FLG`, TM1.`TBT16_CRT_PROG_NM`, TM1.`TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` TM1 WHERE TM1.`TBT16_IMPORT_NO` = ? ORDER BY TM1.`TBT16_IMPORT_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001F5", "SELECT `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` WHERE `TBT16_IMPORT_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001F6", "SELECT `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` WHERE ( `TBT16_IMPORT_NO` > ?) ORDER BY `TBT16_IMPORT_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001F7", "SELECT `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` WHERE ( `TBT16_IMPORT_NO` < ?) ORDER BY `TBT16_IMPORT_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001F8", "INSERT INTO `TBT16_IMPORT_HISTORY`(`TBT16_CRT_DATETIME`, `TBT16_CRT_USER_ID`, `TBT16_UPD_DATETIME`, `TBT16_UPD_USER_ID`, `TBT16_UPD_CNT`, `TBT16_IMPORT_FILE_NM`, `TBT16_FILE_NM`, `TBT16_IMPORT_DATETIME`, `TBT16_DEL_FLG`, `TBT16_CRT_PROG_NM`, `TBT16_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new ForEachCursor("T001F9", "SELECT LAST_INSERT_ID() ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001F10", "UPDATE `TBT16_IMPORT_HISTORY` SET `TBT16_CRT_DATETIME`=?, `TBT16_CRT_USER_ID`=?, `TBT16_UPD_DATETIME`=?, `TBT16_UPD_USER_ID`=?, `TBT16_UPD_CNT`=?, `TBT16_IMPORT_FILE_NM`=?, `TBT16_FILE_NM`=?, `TBT16_IMPORT_DATETIME`=?, `TBT16_DEL_FLG`=?, `TBT16_CRT_PROG_NM`=?, `TBT16_UPD_PROG_NM`=?  WHERE `TBT16_IMPORT_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T001F11", "DELETE FROM `TBT16_IMPORT_HISTORY`  WHERE `TBT16_IMPORT_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T001F12", "SELECT `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` ORDER BY `TBT16_IMPORT_NO` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
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
                  stmt.setVarchar(6, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
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
                  stmt.setVarchar(6, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
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
               stmt.setLong(12, ((Number) parms[22]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

