/*
               File: tbt16_import_history_impl
        Description: 選択一覧取込履歴テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:20.76
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
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "選択一覧取込履歴テーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"選択一覧取込履歴テーブル"+"</legend>") ;
         wb_table3_27_1F50( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1F50e( boolean wbgen )
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

   public void wb_table3_27_1F50( boolean wbgen )
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
         wb_table4_33_1F50( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1F50e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT16_IMPORT_HISTORY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT16_IMPORT_HISTORY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1F50e( true) ;
      }
      else
      {
         wb_table3_27_1F50e( false) ;
      }
   }

   public void wb_table4_33_1F50( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_import_no_Internalname, "取込番号", "", "", lblTextblocktbt16_import_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_IMPORT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A823TBT16_IMPORT_NO, (byte)(10), (byte)(0), ".", "")), ((edtTBT16_IMPORT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A823TBT16_IMPORT_NO), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A823TBT16_IMPORT_NO), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBT16_IMPORT_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_IMPORT_NO_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_import_file_nm_Internalname, "取込ファイル名", "", "", lblTextblocktbt16_import_file_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A824TBT16_IMPORT_FILE_NM", A824TBT16_IMPORT_FILE_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT16_IMPORT_FILE_NM_Internalname, GXutil.rtrim( A824TBT16_IMPORT_FILE_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", (short)(0), 1, edtTBT16_IMPORT_FILE_NM_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "200", -1, "", true, "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_file_nm_Internalname, "実ファイル名", "", "", lblTextblocktbt16_file_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A825TBT16_FILE_NM", A825TBT16_FILE_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT16_FILE_NM_Internalname, GXutil.rtrim( A825TBT16_FILE_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", (short)(0), 1, edtTBT16_FILE_NM_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "200", -1, "", true, "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_import_datetime_Internalname, "取込日時", "", "", lblTextblocktbt16_import_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A826TBT16_IMPORT_DATETIME", localUtil.ttoc( A826TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT16_IMPORT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_IMPORT_DATETIME_Internalname, localUtil.format(A826TBT16_IMPORT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A826TBT16_IMPORT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBT16_IMPORT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_IMPORT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT16_IMPORT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT16_IMPORT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt16_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A827TBT16_DEL_FLG", A827TBT16_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_DEL_FLG_Internalname, GXutil.rtrim( A827TBT16_DEL_FLG), GXutil.rtrim( localUtil.format( A827TBT16_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBT16_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt16_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A828TBT16_CRT_DATETIME", localUtil.ttoc( A828TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT16_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_CRT_DATETIME_Internalname, localUtil.format(A828TBT16_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A828TBT16_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBT16_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT16_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT16_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_crt_user_id_Internalname, "ID", "", "", lblTextblocktbt16_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A829TBT16_CRT_USER_ID", A829TBT16_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_CRT_USER_ID_Internalname, GXutil.rtrim( A829TBT16_CRT_USER_ID), GXutil.rtrim( localUtil.format( A829TBT16_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBT16_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt16_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A830TBT16_CRT_PROG_NM", A830TBT16_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_CRT_PROG_NM_Internalname, GXutil.rtrim( A830TBT16_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A830TBT16_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBT16_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt16_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A831TBT16_UPD_DATETIME", localUtil.ttoc( A831TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT16_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_UPD_DATETIME_Internalname, localUtil.format(A831TBT16_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A831TBT16_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(78);\"", "", "", "", "", edtTBT16_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT16_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT16_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_upd_user_id_Internalname, "ID", "", "", lblTextblocktbt16_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A832TBT16_UPD_USER_ID", A832TBT16_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_UPD_USER_ID_Internalname, GXutil.rtrim( A832TBT16_UPD_USER_ID), GXutil.rtrim( localUtil.format( A832TBT16_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBT16_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt16_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A833TBT16_UPD_PROG_NM", A833TBT16_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_UPD_PROG_NM_Internalname, GXutil.rtrim( A833TBT16_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A833TBT16_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBT16_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt16_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt16_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT16_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A834TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT16_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A834TBT16_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A834TBT16_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBT16_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT16_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT16_IMPORT_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1F50e( true) ;
      }
      else
      {
         wb_table4_33_1F50e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT16_IMPORT_HISTORY.htm");
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
               A823TBT16_IMPORT_NO = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
            }
            else
            {
               A823TBT16_IMPORT_NO = localUtil.ctol( httpContext.cgiGet( edtTBT16_IMPORT_NO_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
            }
            A824TBT16_IMPORT_FILE_NM = httpContext.cgiGet( edtTBT16_IMPORT_FILE_NM_Internalname) ;
            n824TBT16_IMPORT_FILE_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A824TBT16_IMPORT_FILE_NM", A824TBT16_IMPORT_FILE_NM);
            n824TBT16_IMPORT_FILE_NM = ((GXutil.strcmp("", A824TBT16_IMPORT_FILE_NM)==0) ? true : false) ;
            A825TBT16_FILE_NM = httpContext.cgiGet( edtTBT16_FILE_NM_Internalname) ;
            n825TBT16_FILE_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A825TBT16_FILE_NM", A825TBT16_FILE_NM);
            n825TBT16_FILE_NM = ((GXutil.strcmp("", A825TBT16_FILE_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT16_IMPORT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"取込日時"}), 1, "TBT16_IMPORT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_IMPORT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A826TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n826TBT16_IMPORT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A826TBT16_IMPORT_DATETIME", localUtil.ttoc( A826TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A826TBT16_IMPORT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT16_IMPORT_DATETIME_Internalname)) ;
               n826TBT16_IMPORT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A826TBT16_IMPORT_DATETIME", localUtil.ttoc( A826TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n826TBT16_IMPORT_DATETIME = (GXutil.nullDate().equals(A826TBT16_IMPORT_DATETIME) ? true : false) ;
            A827TBT16_DEL_FLG = httpContext.cgiGet( edtTBT16_DEL_FLG_Internalname) ;
            n827TBT16_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A827TBT16_DEL_FLG", A827TBT16_DEL_FLG);
            n827TBT16_DEL_FLG = ((GXutil.strcmp("", A827TBT16_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT16_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBT16_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A828TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n828TBT16_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828TBT16_CRT_DATETIME", localUtil.ttoc( A828TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A828TBT16_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT16_CRT_DATETIME_Internalname)) ;
               n828TBT16_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828TBT16_CRT_DATETIME", localUtil.ttoc( A828TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n828TBT16_CRT_DATETIME = (GXutil.nullDate().equals(A828TBT16_CRT_DATETIME) ? true : false) ;
            A829TBT16_CRT_USER_ID = httpContext.cgiGet( edtTBT16_CRT_USER_ID_Internalname) ;
            n829TBT16_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A829TBT16_CRT_USER_ID", A829TBT16_CRT_USER_ID);
            n829TBT16_CRT_USER_ID = ((GXutil.strcmp("", A829TBT16_CRT_USER_ID)==0) ? true : false) ;
            A830TBT16_CRT_PROG_NM = httpContext.cgiGet( edtTBT16_CRT_PROG_NM_Internalname) ;
            n830TBT16_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A830TBT16_CRT_PROG_NM", A830TBT16_CRT_PROG_NM);
            n830TBT16_CRT_PROG_NM = ((GXutil.strcmp("", A830TBT16_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT16_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBT16_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A831TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n831TBT16_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TBT16_UPD_DATETIME", localUtil.ttoc( A831TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A831TBT16_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT16_UPD_DATETIME_Internalname)) ;
               n831TBT16_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TBT16_UPD_DATETIME", localUtil.ttoc( A831TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n831TBT16_UPD_DATETIME = (GXutil.nullDate().equals(A831TBT16_UPD_DATETIME) ? true : false) ;
            A832TBT16_UPD_USER_ID = httpContext.cgiGet( edtTBT16_UPD_USER_ID_Internalname) ;
            n832TBT16_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A832TBT16_UPD_USER_ID", A832TBT16_UPD_USER_ID);
            n832TBT16_UPD_USER_ID = ((GXutil.strcmp("", A832TBT16_UPD_USER_ID)==0) ? true : false) ;
            A833TBT16_UPD_PROG_NM = httpContext.cgiGet( edtTBT16_UPD_PROG_NM_Internalname) ;
            n833TBT16_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A833TBT16_UPD_PROG_NM", A833TBT16_UPD_PROG_NM);
            n833TBT16_UPD_PROG_NM = ((GXutil.strcmp("", A833TBT16_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT16_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT16_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT16_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT16_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A834TBT16_UPD_CNT = 0 ;
               n834TBT16_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
            }
            else
            {
               A834TBT16_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT16_UPD_CNT_Internalname), ".", ",") ;
               n834TBT16_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
            }
            n834TBT16_UPD_CNT = ((0==A834TBT16_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z823TBT16_IMPORT_NO = localUtil.ctol( httpContext.cgiGet( "Z823TBT16_IMPORT_NO"), ".", ",") ;
            Z828TBT16_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z828TBT16_CRT_DATETIME"), 0) ;
            n828TBT16_CRT_DATETIME = (GXutil.nullDate().equals(A828TBT16_CRT_DATETIME) ? true : false) ;
            Z829TBT16_CRT_USER_ID = httpContext.cgiGet( "Z829TBT16_CRT_USER_ID") ;
            n829TBT16_CRT_USER_ID = ((GXutil.strcmp("", A829TBT16_CRT_USER_ID)==0) ? true : false) ;
            Z831TBT16_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z831TBT16_UPD_DATETIME"), 0) ;
            n831TBT16_UPD_DATETIME = (GXutil.nullDate().equals(A831TBT16_UPD_DATETIME) ? true : false) ;
            Z832TBT16_UPD_USER_ID = httpContext.cgiGet( "Z832TBT16_UPD_USER_ID") ;
            n832TBT16_UPD_USER_ID = ((GXutil.strcmp("", A832TBT16_UPD_USER_ID)==0) ? true : false) ;
            Z834TBT16_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z834TBT16_UPD_CNT"), ".", ",") ;
            n834TBT16_UPD_CNT = ((0==A834TBT16_UPD_CNT) ? true : false) ;
            Z824TBT16_IMPORT_FILE_NM = httpContext.cgiGet( "Z824TBT16_IMPORT_FILE_NM") ;
            n824TBT16_IMPORT_FILE_NM = ((GXutil.strcmp("", A824TBT16_IMPORT_FILE_NM)==0) ? true : false) ;
            Z825TBT16_FILE_NM = httpContext.cgiGet( "Z825TBT16_FILE_NM") ;
            n825TBT16_FILE_NM = ((GXutil.strcmp("", A825TBT16_FILE_NM)==0) ? true : false) ;
            Z826TBT16_IMPORT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z826TBT16_IMPORT_DATETIME"), 0) ;
            n826TBT16_IMPORT_DATETIME = (GXutil.nullDate().equals(A826TBT16_IMPORT_DATETIME) ? true : false) ;
            Z827TBT16_DEL_FLG = httpContext.cgiGet( "Z827TBT16_DEL_FLG") ;
            n827TBT16_DEL_FLG = ((GXutil.strcmp("", A827TBT16_DEL_FLG)==0) ? true : false) ;
            Z830TBT16_CRT_PROG_NM = httpContext.cgiGet( "Z830TBT16_CRT_PROG_NM") ;
            n830TBT16_CRT_PROG_NM = ((GXutil.strcmp("", A830TBT16_CRT_PROG_NM)==0) ? true : false) ;
            Z833TBT16_UPD_PROG_NM = httpContext.cgiGet( "Z833TBT16_UPD_PROG_NM") ;
            n833TBT16_UPD_PROG_NM = ((GXutil.strcmp("", A833TBT16_UPD_PROG_NM)==0) ? true : false) ;
            O834TBT16_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O834TBT16_UPD_CNT"), ".", ",") ;
            n834TBT16_UPD_CNT = ((0==A834TBT16_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV9Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A823TBT16_IMPORT_NO = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e121F2( )
   {
      /* After Trn Routine */
   }

   public void S1139( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1F50( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z828TBT16_CRT_DATETIME = T001F3_A828TBT16_CRT_DATETIME[0] ;
            Z829TBT16_CRT_USER_ID = T001F3_A829TBT16_CRT_USER_ID[0] ;
            Z831TBT16_UPD_DATETIME = T001F3_A831TBT16_UPD_DATETIME[0] ;
            Z832TBT16_UPD_USER_ID = T001F3_A832TBT16_UPD_USER_ID[0] ;
            Z834TBT16_UPD_CNT = T001F3_A834TBT16_UPD_CNT[0] ;
            Z824TBT16_IMPORT_FILE_NM = T001F3_A824TBT16_IMPORT_FILE_NM[0] ;
            Z825TBT16_FILE_NM = T001F3_A825TBT16_FILE_NM[0] ;
            Z826TBT16_IMPORT_DATETIME = T001F3_A826TBT16_IMPORT_DATETIME[0] ;
            Z827TBT16_DEL_FLG = T001F3_A827TBT16_DEL_FLG[0] ;
            Z830TBT16_CRT_PROG_NM = T001F3_A830TBT16_CRT_PROG_NM[0] ;
            Z833TBT16_UPD_PROG_NM = T001F3_A833TBT16_UPD_PROG_NM[0] ;
         }
         else
         {
            Z828TBT16_CRT_DATETIME = A828TBT16_CRT_DATETIME ;
            Z829TBT16_CRT_USER_ID = A829TBT16_CRT_USER_ID ;
            Z831TBT16_UPD_DATETIME = A831TBT16_UPD_DATETIME ;
            Z832TBT16_UPD_USER_ID = A832TBT16_UPD_USER_ID ;
            Z834TBT16_UPD_CNT = A834TBT16_UPD_CNT ;
            Z824TBT16_IMPORT_FILE_NM = A824TBT16_IMPORT_FILE_NM ;
            Z825TBT16_FILE_NM = A825TBT16_FILE_NM ;
            Z826TBT16_IMPORT_DATETIME = A826TBT16_IMPORT_DATETIME ;
            Z827TBT16_DEL_FLG = A827TBT16_DEL_FLG ;
            Z830TBT16_CRT_PROG_NM = A830TBT16_CRT_PROG_NM ;
            Z833TBT16_UPD_PROG_NM = A833TBT16_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z823TBT16_IMPORT_NO = A823TBT16_IMPORT_NO ;
         Z828TBT16_CRT_DATETIME = A828TBT16_CRT_DATETIME ;
         Z829TBT16_CRT_USER_ID = A829TBT16_CRT_USER_ID ;
         Z831TBT16_UPD_DATETIME = A831TBT16_UPD_DATETIME ;
         Z832TBT16_UPD_USER_ID = A832TBT16_UPD_USER_ID ;
         Z834TBT16_UPD_CNT = A834TBT16_UPD_CNT ;
         Z824TBT16_IMPORT_FILE_NM = A824TBT16_IMPORT_FILE_NM ;
         Z825TBT16_FILE_NM = A825TBT16_FILE_NM ;
         Z826TBT16_IMPORT_DATETIME = A826TBT16_IMPORT_DATETIME ;
         Z827TBT16_DEL_FLG = A827TBT16_DEL_FLG ;
         Z830TBT16_CRT_PROG_NM = A830TBT16_CRT_PROG_NM ;
         Z833TBT16_UPD_PROG_NM = A833TBT16_UPD_PROG_NM ;
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
      pr_default.execute(2, new Object[] {new Long(A823TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A828TBT16_CRT_DATETIME = T001F4_A828TBT16_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A828TBT16_CRT_DATETIME", localUtil.ttoc( A828TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n828TBT16_CRT_DATETIME = T001F4_n828TBT16_CRT_DATETIME[0] ;
         A829TBT16_CRT_USER_ID = T001F4_A829TBT16_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TBT16_CRT_USER_ID", A829TBT16_CRT_USER_ID);
         n829TBT16_CRT_USER_ID = T001F4_n829TBT16_CRT_USER_ID[0] ;
         A831TBT16_UPD_DATETIME = T001F4_A831TBT16_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TBT16_UPD_DATETIME", localUtil.ttoc( A831TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n831TBT16_UPD_DATETIME = T001F4_n831TBT16_UPD_DATETIME[0] ;
         A832TBT16_UPD_USER_ID = T001F4_A832TBT16_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TBT16_UPD_USER_ID", A832TBT16_UPD_USER_ID);
         n832TBT16_UPD_USER_ID = T001F4_n832TBT16_UPD_USER_ID[0] ;
         A834TBT16_UPD_CNT = T001F4_A834TBT16_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
         n834TBT16_UPD_CNT = T001F4_n834TBT16_UPD_CNT[0] ;
         A824TBT16_IMPORT_FILE_NM = T001F4_A824TBT16_IMPORT_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A824TBT16_IMPORT_FILE_NM", A824TBT16_IMPORT_FILE_NM);
         n824TBT16_IMPORT_FILE_NM = T001F4_n824TBT16_IMPORT_FILE_NM[0] ;
         A825TBT16_FILE_NM = T001F4_A825TBT16_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A825TBT16_FILE_NM", A825TBT16_FILE_NM);
         n825TBT16_FILE_NM = T001F4_n825TBT16_FILE_NM[0] ;
         A826TBT16_IMPORT_DATETIME = T001F4_A826TBT16_IMPORT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A826TBT16_IMPORT_DATETIME", localUtil.ttoc( A826TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n826TBT16_IMPORT_DATETIME = T001F4_n826TBT16_IMPORT_DATETIME[0] ;
         A827TBT16_DEL_FLG = T001F4_A827TBT16_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A827TBT16_DEL_FLG", A827TBT16_DEL_FLG);
         n827TBT16_DEL_FLG = T001F4_n827TBT16_DEL_FLG[0] ;
         A830TBT16_CRT_PROG_NM = T001F4_A830TBT16_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TBT16_CRT_PROG_NM", A830TBT16_CRT_PROG_NM);
         n830TBT16_CRT_PROG_NM = T001F4_n830TBT16_CRT_PROG_NM[0] ;
         A833TBT16_UPD_PROG_NM = T001F4_A833TBT16_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TBT16_UPD_PROG_NM", A833TBT16_UPD_PROG_NM);
         n833TBT16_UPD_PROG_NM = T001F4_n833TBT16_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A826TBT16_IMPORT_DATETIME) || (( A826TBT16_IMPORT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A826TBT16_IMPORT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　取込日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A828TBT16_CRT_DATETIME) || (( A828TBT16_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A828TBT16_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A831TBT16_UPD_DATETIME) || (( A831TBT16_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A831TBT16_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
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
      pr_default.execute(3, new Object[] {new Long(A823TBT16_IMPORT_NO)});
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
      pr_default.execute(1, new Object[] {new Long(A823TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1F50( 9) ;
         RcdFound50 = (short)(1) ;
         A823TBT16_IMPORT_NO = T001F3_A823TBT16_IMPORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
         A828TBT16_CRT_DATETIME = T001F3_A828TBT16_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A828TBT16_CRT_DATETIME", localUtil.ttoc( A828TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n828TBT16_CRT_DATETIME = T001F3_n828TBT16_CRT_DATETIME[0] ;
         A829TBT16_CRT_USER_ID = T001F3_A829TBT16_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TBT16_CRT_USER_ID", A829TBT16_CRT_USER_ID);
         n829TBT16_CRT_USER_ID = T001F3_n829TBT16_CRT_USER_ID[0] ;
         A831TBT16_UPD_DATETIME = T001F3_A831TBT16_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TBT16_UPD_DATETIME", localUtil.ttoc( A831TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n831TBT16_UPD_DATETIME = T001F3_n831TBT16_UPD_DATETIME[0] ;
         A832TBT16_UPD_USER_ID = T001F3_A832TBT16_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TBT16_UPD_USER_ID", A832TBT16_UPD_USER_ID);
         n832TBT16_UPD_USER_ID = T001F3_n832TBT16_UPD_USER_ID[0] ;
         A834TBT16_UPD_CNT = T001F3_A834TBT16_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
         n834TBT16_UPD_CNT = T001F3_n834TBT16_UPD_CNT[0] ;
         A824TBT16_IMPORT_FILE_NM = T001F3_A824TBT16_IMPORT_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A824TBT16_IMPORT_FILE_NM", A824TBT16_IMPORT_FILE_NM);
         n824TBT16_IMPORT_FILE_NM = T001F3_n824TBT16_IMPORT_FILE_NM[0] ;
         A825TBT16_FILE_NM = T001F3_A825TBT16_FILE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A825TBT16_FILE_NM", A825TBT16_FILE_NM);
         n825TBT16_FILE_NM = T001F3_n825TBT16_FILE_NM[0] ;
         A826TBT16_IMPORT_DATETIME = T001F3_A826TBT16_IMPORT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A826TBT16_IMPORT_DATETIME", localUtil.ttoc( A826TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n826TBT16_IMPORT_DATETIME = T001F3_n826TBT16_IMPORT_DATETIME[0] ;
         A827TBT16_DEL_FLG = T001F3_A827TBT16_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A827TBT16_DEL_FLG", A827TBT16_DEL_FLG);
         n827TBT16_DEL_FLG = T001F3_n827TBT16_DEL_FLG[0] ;
         A830TBT16_CRT_PROG_NM = T001F3_A830TBT16_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TBT16_CRT_PROG_NM", A830TBT16_CRT_PROG_NM);
         n830TBT16_CRT_PROG_NM = T001F3_n830TBT16_CRT_PROG_NM[0] ;
         A833TBT16_UPD_PROG_NM = T001F3_A833TBT16_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A833TBT16_UPD_PROG_NM", A833TBT16_UPD_PROG_NM);
         n833TBT16_UPD_PROG_NM = T001F3_n833TBT16_UPD_PROG_NM[0] ;
         O834TBT16_UPD_CNT = A834TBT16_UPD_CNT ;
         n834TBT16_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
         Z823TBT16_IMPORT_NO = A823TBT16_IMPORT_NO ;
         sMode50 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1F50( ) ;
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
      pr_default.execute(4, new Object[] {new Long(A823TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001F6_A823TBT16_IMPORT_NO[0] < A823TBT16_IMPORT_NO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001F6_A823TBT16_IMPORT_NO[0] > A823TBT16_IMPORT_NO ) ) )
         {
            A823TBT16_IMPORT_NO = T001F6_A823TBT16_IMPORT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
            RcdFound50 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound50 = (short)(0) ;
      /* Using cursor T001F7 */
      pr_default.execute(5, new Object[] {new Long(A823TBT16_IMPORT_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001F7_A823TBT16_IMPORT_NO[0] > A823TBT16_IMPORT_NO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001F7_A823TBT16_IMPORT_NO[0] < A823TBT16_IMPORT_NO ) ) )
         {
            A823TBT16_IMPORT_NO = T001F7_A823TBT16_IMPORT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
            RcdFound50 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1F50( ) ;
      if ( RcdFound50 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBT16_IMPORT_NO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBT16_IMPORT_NO_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A823TBT16_IMPORT_NO != Z823TBT16_IMPORT_NO )
         {
            A823TBT16_IMPORT_NO = Z823TBT16_IMPORT_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
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
         if ( A823TBT16_IMPORT_NO != Z823TBT16_IMPORT_NO )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( A823TBT16_IMPORT_NO != Z823TBT16_IMPORT_NO )
      {
         A823TBT16_IMPORT_NO = Z823TBT16_IMPORT_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT16_IMPORT_NO");
         AnyError = (short)(1) ;
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
      scanStart1F50( ) ;
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart1F50( ) ;
      if ( RcdFound50 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {new Long(A823TBT16_IMPORT_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT16_IMPORT_HISTORY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z828TBT16_CRT_DATETIME.equals( T001F2_A828TBT16_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z829TBT16_CRT_USER_ID, T001F2_A829TBT16_CRT_USER_ID[0]) != 0 ) || !( Z831TBT16_UPD_DATETIME.equals( T001F2_A831TBT16_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z832TBT16_UPD_USER_ID, T001F2_A832TBT16_UPD_USER_ID[0]) != 0 ) || ( Z834TBT16_UPD_CNT != T001F2_A834TBT16_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z824TBT16_IMPORT_FILE_NM, T001F2_A824TBT16_IMPORT_FILE_NM[0]) != 0 ) || ( GXutil.strcmp(Z825TBT16_FILE_NM, T001F2_A825TBT16_FILE_NM[0]) != 0 ) || !( Z826TBT16_IMPORT_DATETIME.equals( T001F2_A826TBT16_IMPORT_DATETIME[0] ) ) || ( GXutil.strcmp(Z827TBT16_DEL_FLG, T001F2_A827TBT16_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z830TBT16_CRT_PROG_NM, T001F2_A830TBT16_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z833TBT16_UPD_PROG_NM, T001F2_A833TBT16_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(6, new Object[] {new Boolean(n828TBT16_CRT_DATETIME), A828TBT16_CRT_DATETIME, new Boolean(n829TBT16_CRT_USER_ID), A829TBT16_CRT_USER_ID, new Boolean(n831TBT16_UPD_DATETIME), A831TBT16_UPD_DATETIME, new Boolean(n832TBT16_UPD_USER_ID), A832TBT16_UPD_USER_ID, new Boolean(n834TBT16_UPD_CNT), new Long(A834TBT16_UPD_CNT), new Boolean(n824TBT16_IMPORT_FILE_NM), A824TBT16_IMPORT_FILE_NM, new Boolean(n825TBT16_FILE_NM), A825TBT16_FILE_NM, new Boolean(n826TBT16_IMPORT_DATETIME), A826TBT16_IMPORT_DATETIME, new Boolean(n827TBT16_DEL_FLG), A827TBT16_DEL_FLG, new Boolean(n830TBT16_CRT_PROG_NM), A830TBT16_CRT_PROG_NM, new Boolean(n833TBT16_UPD_PROG_NM), A833TBT16_UPD_PROG_NM});
                  /* Retrieving last key number assigned */
                  /* Using cursor T001F9 */
                  pr_default.execute(7);
                  A823TBT16_IMPORT_NO = T001F9_A823TBT16_IMPORT_NO[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
                  pr_default.close(7);
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
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
                  pr_default.execute(8, new Object[] {new Boolean(n828TBT16_CRT_DATETIME), A828TBT16_CRT_DATETIME, new Boolean(n829TBT16_CRT_USER_ID), A829TBT16_CRT_USER_ID, new Boolean(n831TBT16_UPD_DATETIME), A831TBT16_UPD_DATETIME, new Boolean(n832TBT16_UPD_USER_ID), A832TBT16_UPD_USER_ID, new Boolean(n834TBT16_UPD_CNT), new Long(A834TBT16_UPD_CNT), new Boolean(n824TBT16_IMPORT_FILE_NM), A824TBT16_IMPORT_FILE_NM, new Boolean(n825TBT16_FILE_NM), A825TBT16_FILE_NM, new Boolean(n826TBT16_IMPORT_DATETIME), A826TBT16_IMPORT_DATETIME, new Boolean(n827TBT16_DEL_FLG), A827TBT16_DEL_FLG, new Boolean(n830TBT16_CRT_PROG_NM), A830TBT16_CRT_PROG_NM, new Boolean(n833TBT16_UPD_PROG_NM), A833TBT16_UPD_PROG_NM, new Long(A823TBT16_IMPORT_NO)});
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               pr_default.execute(9, new Object[] {new Long(A823TBT16_IMPORT_NO)});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
      /* Using cursor T001F12 */
      pr_default.execute(10);
      RcdFound50 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A823TBT16_IMPORT_NO = T001F12_A823TBT16_IMPORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F50( )
   {
      pr_default.readNext(10);
      RcdFound50 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound50 = (short)(1) ;
         A823TBT16_IMPORT_NO = T001F12_A823TBT16_IMPORT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
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
      A828TBT16_CRT_DATETIME = GXutil.now( ) ;
      n828TBT16_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828TBT16_CRT_DATETIME", localUtil.ttoc( A828TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A829TBT16_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt16_import_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A829TBT16_CRT_USER_ID = GXt_char3 ;
      n829TBT16_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A829TBT16_CRT_USER_ID", A829TBT16_CRT_USER_ID);
      A831TBT16_UPD_DATETIME = GXutil.now( ) ;
      n831TBT16_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TBT16_UPD_DATETIME", localUtil.ttoc( A831TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A832TBT16_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt16_import_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A832TBT16_UPD_USER_ID = GXt_char3 ;
      n832TBT16_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TBT16_UPD_USER_ID", A832TBT16_UPD_USER_ID);
      A834TBT16_UPD_CNT = (long)(O834TBT16_UPD_CNT+1) ;
      n834TBT16_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1F50( )
   {
      /* Before Update Rules */
      A831TBT16_UPD_DATETIME = GXutil.now( ) ;
      n831TBT16_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TBT16_UPD_DATETIME", localUtil.ttoc( A831TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A832TBT16_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt16_import_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A832TBT16_UPD_USER_ID = GXt_char3 ;
      n832TBT16_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TBT16_UPD_USER_ID", A832TBT16_UPD_USER_ID);
      A834TBT16_UPD_CNT = (long)(O834TBT16_UPD_CNT+1) ;
      n834TBT16_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "選択一覧取込履歴テーブル") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbt16_import_history") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1F50( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z823TBT16_IMPORT_NO", GXutil.ltrim( localUtil.ntoc( Z823TBT16_IMPORT_NO, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z828TBT16_CRT_DATETIME", localUtil.ttoc( Z828TBT16_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z829TBT16_CRT_USER_ID", GXutil.rtrim( Z829TBT16_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z831TBT16_UPD_DATETIME", localUtil.ttoc( Z831TBT16_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z832TBT16_UPD_USER_ID", GXutil.rtrim( Z832TBT16_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z834TBT16_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z834TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z824TBT16_IMPORT_FILE_NM", GXutil.rtrim( Z824TBT16_IMPORT_FILE_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z825TBT16_FILE_NM", GXutil.rtrim( Z825TBT16_FILE_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z826TBT16_IMPORT_DATETIME", localUtil.ttoc( Z826TBT16_IMPORT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z827TBT16_DEL_FLG", GXutil.rtrim( Z827TBT16_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z830TBT16_CRT_PROG_NM", GXutil.rtrim( Z830TBT16_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z833TBT16_UPD_PROG_NM", GXutil.rtrim( Z833TBT16_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O834TBT16_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O834TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey1F50( )
   {
      A828TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n828TBT16_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828TBT16_CRT_DATETIME", localUtil.ttoc( A828TBT16_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n828TBT16_CRT_DATETIME = (GXutil.nullDate().equals(A828TBT16_CRT_DATETIME) ? true : false) ;
      A829TBT16_CRT_USER_ID = "" ;
      n829TBT16_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A829TBT16_CRT_USER_ID", A829TBT16_CRT_USER_ID);
      n829TBT16_CRT_USER_ID = ((GXutil.strcmp("", A829TBT16_CRT_USER_ID)==0) ? true : false) ;
      A831TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n831TBT16_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TBT16_UPD_DATETIME", localUtil.ttoc( A831TBT16_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n831TBT16_UPD_DATETIME = (GXutil.nullDate().equals(A831TBT16_UPD_DATETIME) ? true : false) ;
      A832TBT16_UPD_USER_ID = "" ;
      n832TBT16_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TBT16_UPD_USER_ID", A832TBT16_UPD_USER_ID);
      n832TBT16_UPD_USER_ID = ((GXutil.strcmp("", A832TBT16_UPD_USER_ID)==0) ? true : false) ;
      A834TBT16_UPD_CNT = 0 ;
      n834TBT16_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
      n834TBT16_UPD_CNT = ((0==A834TBT16_UPD_CNT) ? true : false) ;
      A824TBT16_IMPORT_FILE_NM = "" ;
      n824TBT16_IMPORT_FILE_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A824TBT16_IMPORT_FILE_NM", A824TBT16_IMPORT_FILE_NM);
      n824TBT16_IMPORT_FILE_NM = ((GXutil.strcmp("", A824TBT16_IMPORT_FILE_NM)==0) ? true : false) ;
      A825TBT16_FILE_NM = "" ;
      n825TBT16_FILE_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A825TBT16_FILE_NM", A825TBT16_FILE_NM);
      n825TBT16_FILE_NM = ((GXutil.strcmp("", A825TBT16_FILE_NM)==0) ? true : false) ;
      A826TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n826TBT16_IMPORT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A826TBT16_IMPORT_DATETIME", localUtil.ttoc( A826TBT16_IMPORT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n826TBT16_IMPORT_DATETIME = (GXutil.nullDate().equals(A826TBT16_IMPORT_DATETIME) ? true : false) ;
      A827TBT16_DEL_FLG = "" ;
      n827TBT16_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A827TBT16_DEL_FLG", A827TBT16_DEL_FLG);
      n827TBT16_DEL_FLG = ((GXutil.strcmp("", A827TBT16_DEL_FLG)==0) ? true : false) ;
      A830TBT16_CRT_PROG_NM = "" ;
      n830TBT16_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A830TBT16_CRT_PROG_NM", A830TBT16_CRT_PROG_NM);
      n830TBT16_CRT_PROG_NM = ((GXutil.strcmp("", A830TBT16_CRT_PROG_NM)==0) ? true : false) ;
      A833TBT16_UPD_PROG_NM = "" ;
      n833TBT16_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A833TBT16_UPD_PROG_NM", A833TBT16_UPD_PROG_NM);
      n833TBT16_UPD_PROG_NM = ((GXutil.strcmp("", A833TBT16_UPD_PROG_NM)==0) ? true : false) ;
      O834TBT16_UPD_CNT = A834TBT16_UPD_CNT ;
      n834TBT16_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TBT16_UPD_CNT", GXutil.ltrim( GXutil.str( A834TBT16_UPD_CNT, 10, 0)));
   }

   public void initAll1F50( )
   {
      A823TBT16_IMPORT_NO = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A823TBT16_IMPORT_NO", GXutil.ltrim( GXutil.str( A823TBT16_IMPORT_NO, 10, 0)));
      initializeNonKey1F50( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14572196");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbt16_import_history.js", "?14572196");
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
      GXt_char3 = A829TBT16_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt16_import_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A829TBT16_CRT_USER_ID = GXt_char3 ;
      n829TBT16_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A829TBT16_CRT_USER_ID", A829TBT16_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A829TBT16_CRT_USER_ID))+"\"");
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
      GXt_char3 = A832TBT16_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt16_import_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A832TBT16_UPD_USER_ID = GXt_char3 ;
      n832TBT16_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TBT16_UPD_USER_ID", A832TBT16_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A832TBT16_UPD_USER_ID))+"\"");
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
      A823TBT16_IMPORT_NO = GX_Parm1 ;
      A828TBT16_CRT_DATETIME = GX_Parm2 ;
      n828TBT16_CRT_DATETIME = false ;
      A829TBT16_CRT_USER_ID = GX_Parm3 ;
      n829TBT16_CRT_USER_ID = false ;
      A831TBT16_UPD_DATETIME = GX_Parm4 ;
      n831TBT16_UPD_DATETIME = false ;
      A832TBT16_UPD_USER_ID = GX_Parm5 ;
      n832TBT16_UPD_USER_ID = false ;
      A834TBT16_UPD_CNT = GX_Parm6 ;
      n834TBT16_UPD_CNT = false ;
      A824TBT16_IMPORT_FILE_NM = GX_Parm7 ;
      n824TBT16_IMPORT_FILE_NM = false ;
      A825TBT16_FILE_NM = GX_Parm8 ;
      n825TBT16_FILE_NM = false ;
      A826TBT16_IMPORT_DATETIME = GX_Parm9 ;
      n826TBT16_IMPORT_DATETIME = false ;
      A827TBT16_DEL_FLG = GX_Parm10 ;
      n827TBT16_DEL_FLG = false ;
      A830TBT16_CRT_PROG_NM = GX_Parm11 ;
      n830TBT16_CRT_PROG_NM = false ;
      A833TBT16_UPD_PROG_NM = GX_Parm12 ;
      n833TBT16_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A828TBT16_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A829TBT16_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A831TBT16_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A832TBT16_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A834TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A824TBT16_IMPORT_FILE_NM));
      isValidOutput.add(GXutil.rtrim( A825TBT16_FILE_NM));
      isValidOutput.add(localUtil.format(A826TBT16_IMPORT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A827TBT16_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A830TBT16_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A833TBT16_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z823TBT16_IMPORT_NO, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z828TBT16_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z829TBT16_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z831TBT16_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z832TBT16_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z834TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z824TBT16_IMPORT_FILE_NM));
      isValidOutput.add(GXutil.rtrim( Z825TBT16_FILE_NM));
      isValidOutput.add(localUtil.ttoc( Z826TBT16_IMPORT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z827TBT16_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z830TBT16_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z833TBT16_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O834TBT16_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
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
               default:
                  /* Execute user subroutine: S1139 */
                  S1139 ();
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
      A824TBT16_IMPORT_FILE_NM = "" ;
      lblTextblocktbt16_file_nm_Jsonclick = "" ;
      A825TBT16_FILE_NM = "" ;
      lblTextblocktbt16_import_datetime_Jsonclick = "" ;
      A826TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt16_del_flg_Jsonclick = "" ;
      A827TBT16_DEL_FLG = "" ;
      lblTextblocktbt16_crt_datetime_Jsonclick = "" ;
      A828TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt16_crt_user_id_Jsonclick = "" ;
      A829TBT16_CRT_USER_ID = "" ;
      lblTextblocktbt16_crt_prog_nm_Jsonclick = "" ;
      A830TBT16_CRT_PROG_NM = "" ;
      lblTextblocktbt16_upd_datetime_Jsonclick = "" ;
      A831TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt16_upd_user_id_Jsonclick = "" ;
      A832TBT16_UPD_USER_ID = "" ;
      lblTextblocktbt16_upd_prog_nm_Jsonclick = "" ;
      A833TBT16_UPD_PROG_NM = "" ;
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
      Z828TBT16_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z829TBT16_CRT_USER_ID = "" ;
      Z831TBT16_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z832TBT16_UPD_USER_ID = "" ;
      Z824TBT16_IMPORT_FILE_NM = "" ;
      Z825TBT16_FILE_NM = "" ;
      Z826TBT16_IMPORT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z827TBT16_DEL_FLG = "" ;
      Z830TBT16_CRT_PROG_NM = "" ;
      Z833TBT16_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T001F4_A823TBT16_IMPORT_NO = new long[1] ;
      T001F4_A828TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F4_n828TBT16_CRT_DATETIME = new boolean[] {false} ;
      T001F4_A829TBT16_CRT_USER_ID = new String[] {""} ;
      T001F4_n829TBT16_CRT_USER_ID = new boolean[] {false} ;
      T001F4_A831TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F4_n831TBT16_UPD_DATETIME = new boolean[] {false} ;
      T001F4_A832TBT16_UPD_USER_ID = new String[] {""} ;
      T001F4_n832TBT16_UPD_USER_ID = new boolean[] {false} ;
      T001F4_A834TBT16_UPD_CNT = new long[1] ;
      T001F4_n834TBT16_UPD_CNT = new boolean[] {false} ;
      T001F4_A824TBT16_IMPORT_FILE_NM = new String[] {""} ;
      T001F4_n824TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      T001F4_A825TBT16_FILE_NM = new String[] {""} ;
      T001F4_n825TBT16_FILE_NM = new boolean[] {false} ;
      T001F4_A826TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F4_n826TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      T001F4_A827TBT16_DEL_FLG = new String[] {""} ;
      T001F4_n827TBT16_DEL_FLG = new boolean[] {false} ;
      T001F4_A830TBT16_CRT_PROG_NM = new String[] {""} ;
      T001F4_n830TBT16_CRT_PROG_NM = new boolean[] {false} ;
      T001F4_A833TBT16_UPD_PROG_NM = new String[] {""} ;
      T001F4_n833TBT16_UPD_PROG_NM = new boolean[] {false} ;
      T001F5_A823TBT16_IMPORT_NO = new long[1] ;
      T001F3_A823TBT16_IMPORT_NO = new long[1] ;
      T001F3_A828TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F3_n828TBT16_CRT_DATETIME = new boolean[] {false} ;
      T001F3_A829TBT16_CRT_USER_ID = new String[] {""} ;
      T001F3_n829TBT16_CRT_USER_ID = new boolean[] {false} ;
      T001F3_A831TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F3_n831TBT16_UPD_DATETIME = new boolean[] {false} ;
      T001F3_A832TBT16_UPD_USER_ID = new String[] {""} ;
      T001F3_n832TBT16_UPD_USER_ID = new boolean[] {false} ;
      T001F3_A834TBT16_UPD_CNT = new long[1] ;
      T001F3_n834TBT16_UPD_CNT = new boolean[] {false} ;
      T001F3_A824TBT16_IMPORT_FILE_NM = new String[] {""} ;
      T001F3_n824TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      T001F3_A825TBT16_FILE_NM = new String[] {""} ;
      T001F3_n825TBT16_FILE_NM = new boolean[] {false} ;
      T001F3_A826TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F3_n826TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      T001F3_A827TBT16_DEL_FLG = new String[] {""} ;
      T001F3_n827TBT16_DEL_FLG = new boolean[] {false} ;
      T001F3_A830TBT16_CRT_PROG_NM = new String[] {""} ;
      T001F3_n830TBT16_CRT_PROG_NM = new boolean[] {false} ;
      T001F3_A833TBT16_UPD_PROG_NM = new String[] {""} ;
      T001F3_n833TBT16_UPD_PROG_NM = new boolean[] {false} ;
      sMode50 = "" ;
      T001F6_A823TBT16_IMPORT_NO = new long[1] ;
      T001F7_A823TBT16_IMPORT_NO = new long[1] ;
      T001F2_A823TBT16_IMPORT_NO = new long[1] ;
      T001F2_A828TBT16_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F2_n828TBT16_CRT_DATETIME = new boolean[] {false} ;
      T001F2_A829TBT16_CRT_USER_ID = new String[] {""} ;
      T001F2_n829TBT16_CRT_USER_ID = new boolean[] {false} ;
      T001F2_A831TBT16_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F2_n831TBT16_UPD_DATETIME = new boolean[] {false} ;
      T001F2_A832TBT16_UPD_USER_ID = new String[] {""} ;
      T001F2_n832TBT16_UPD_USER_ID = new boolean[] {false} ;
      T001F2_A834TBT16_UPD_CNT = new long[1] ;
      T001F2_n834TBT16_UPD_CNT = new boolean[] {false} ;
      T001F2_A824TBT16_IMPORT_FILE_NM = new String[] {""} ;
      T001F2_n824TBT16_IMPORT_FILE_NM = new boolean[] {false} ;
      T001F2_A825TBT16_FILE_NM = new String[] {""} ;
      T001F2_n825TBT16_FILE_NM = new boolean[] {false} ;
      T001F2_A826TBT16_IMPORT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001F2_n826TBT16_IMPORT_DATETIME = new boolean[] {false} ;
      T001F2_A827TBT16_DEL_FLG = new String[] {""} ;
      T001F2_n827TBT16_DEL_FLG = new boolean[] {false} ;
      T001F2_A830TBT16_CRT_PROG_NM = new String[] {""} ;
      T001F2_n830TBT16_CRT_PROG_NM = new boolean[] {false} ;
      T001F2_A833TBT16_UPD_PROG_NM = new String[] {""} ;
      T001F2_n833TBT16_UPD_PROG_NM = new boolean[] {false} ;
      T001F9_A823TBT16_IMPORT_NO = new long[1] ;
      T001F12_A823TBT16_IMPORT_NO = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt16_import_history__default(),
         new Object[] {
             new Object[] {
            T001F2_A823TBT16_IMPORT_NO, T001F2_A828TBT16_CRT_DATETIME, T001F2_n828TBT16_CRT_DATETIME, T001F2_A829TBT16_CRT_USER_ID, T001F2_n829TBT16_CRT_USER_ID, T001F2_A831TBT16_UPD_DATETIME, T001F2_n831TBT16_UPD_DATETIME, T001F2_A832TBT16_UPD_USER_ID, T001F2_n832TBT16_UPD_USER_ID, T001F2_A834TBT16_UPD_CNT,
            T001F2_n834TBT16_UPD_CNT, T001F2_A824TBT16_IMPORT_FILE_NM, T001F2_n824TBT16_IMPORT_FILE_NM, T001F2_A825TBT16_FILE_NM, T001F2_n825TBT16_FILE_NM, T001F2_A826TBT16_IMPORT_DATETIME, T001F2_n826TBT16_IMPORT_DATETIME, T001F2_A827TBT16_DEL_FLG, T001F2_n827TBT16_DEL_FLG, T001F2_A830TBT16_CRT_PROG_NM,
            T001F2_n830TBT16_CRT_PROG_NM, T001F2_A833TBT16_UPD_PROG_NM, T001F2_n833TBT16_UPD_PROG_NM
            }
            , new Object[] {
            T001F3_A823TBT16_IMPORT_NO, T001F3_A828TBT16_CRT_DATETIME, T001F3_n828TBT16_CRT_DATETIME, T001F3_A829TBT16_CRT_USER_ID, T001F3_n829TBT16_CRT_USER_ID, T001F3_A831TBT16_UPD_DATETIME, T001F3_n831TBT16_UPD_DATETIME, T001F3_A832TBT16_UPD_USER_ID, T001F3_n832TBT16_UPD_USER_ID, T001F3_A834TBT16_UPD_CNT,
            T001F3_n834TBT16_UPD_CNT, T001F3_A824TBT16_IMPORT_FILE_NM, T001F3_n824TBT16_IMPORT_FILE_NM, T001F3_A825TBT16_FILE_NM, T001F3_n825TBT16_FILE_NM, T001F3_A826TBT16_IMPORT_DATETIME, T001F3_n826TBT16_IMPORT_DATETIME, T001F3_A827TBT16_DEL_FLG, T001F3_n827TBT16_DEL_FLG, T001F3_A830TBT16_CRT_PROG_NM,
            T001F3_n830TBT16_CRT_PROG_NM, T001F3_A833TBT16_UPD_PROG_NM, T001F3_n833TBT16_UPD_PROG_NM
            }
            , new Object[] {
            T001F4_A823TBT16_IMPORT_NO, T001F4_A828TBT16_CRT_DATETIME, T001F4_n828TBT16_CRT_DATETIME, T001F4_A829TBT16_CRT_USER_ID, T001F4_n829TBT16_CRT_USER_ID, T001F4_A831TBT16_UPD_DATETIME, T001F4_n831TBT16_UPD_DATETIME, T001F4_A832TBT16_UPD_USER_ID, T001F4_n832TBT16_UPD_USER_ID, T001F4_A834TBT16_UPD_CNT,
            T001F4_n834TBT16_UPD_CNT, T001F4_A824TBT16_IMPORT_FILE_NM, T001F4_n824TBT16_IMPORT_FILE_NM, T001F4_A825TBT16_FILE_NM, T001F4_n825TBT16_FILE_NM, T001F4_A826TBT16_IMPORT_DATETIME, T001F4_n826TBT16_IMPORT_DATETIME, T001F4_A827TBT16_DEL_FLG, T001F4_n827TBT16_DEL_FLG, T001F4_A830TBT16_CRT_PROG_NM,
            T001F4_n830TBT16_CRT_PROG_NM, T001F4_A833TBT16_UPD_PROG_NM, T001F4_n833TBT16_UPD_PROG_NM
            }
            , new Object[] {
            T001F5_A823TBT16_IMPORT_NO
            }
            , new Object[] {
            T001F6_A823TBT16_IMPORT_NO
            }
            , new Object[] {
            T001F7_A823TBT16_IMPORT_NO
            }
            , new Object[] {
            }
            , new Object[] {
            T001F9_A823TBT16_IMPORT_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001F12_A823TBT16_IMPORT_NO
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
   private long A823TBT16_IMPORT_NO ;
   private long A834TBT16_UPD_CNT ;
   private long Z823TBT16_IMPORT_NO ;
   private long Z834TBT16_UPD_CNT ;
   private long O834TBT16_UPD_CNT ;
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
   private String ClassString ;
   private String StyleString ;
   private String grpGroupdata_Internalname ;
   private String tblTable1_Internalname ;
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
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A826TBT16_IMPORT_DATETIME ;
   private java.util.Date A828TBT16_CRT_DATETIME ;
   private java.util.Date A831TBT16_UPD_DATETIME ;
   private java.util.Date Z828TBT16_CRT_DATETIME ;
   private java.util.Date Z831TBT16_UPD_DATETIME ;
   private java.util.Date Z826TBT16_IMPORT_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n824TBT16_IMPORT_FILE_NM ;
   private boolean n825TBT16_FILE_NM ;
   private boolean n826TBT16_IMPORT_DATETIME ;
   private boolean n827TBT16_DEL_FLG ;
   private boolean n828TBT16_CRT_DATETIME ;
   private boolean n829TBT16_CRT_USER_ID ;
   private boolean n830TBT16_CRT_PROG_NM ;
   private boolean n831TBT16_UPD_DATETIME ;
   private boolean n832TBT16_UPD_USER_ID ;
   private boolean n833TBT16_UPD_PROG_NM ;
   private boolean n834TBT16_UPD_CNT ;
   private boolean Gx_longc ;
   private String A824TBT16_IMPORT_FILE_NM ;
   private String A825TBT16_FILE_NM ;
   private String A827TBT16_DEL_FLG ;
   private String A829TBT16_CRT_USER_ID ;
   private String A830TBT16_CRT_PROG_NM ;
   private String A832TBT16_UPD_USER_ID ;
   private String A833TBT16_UPD_PROG_NM ;
   private String Z829TBT16_CRT_USER_ID ;
   private String Z832TBT16_UPD_USER_ID ;
   private String Z824TBT16_IMPORT_FILE_NM ;
   private String Z825TBT16_FILE_NM ;
   private String Z827TBT16_DEL_FLG ;
   private String Z830TBT16_CRT_PROG_NM ;
   private String Z833TBT16_UPD_PROG_NM ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T001F4_A823TBT16_IMPORT_NO ;
   private java.util.Date[] T001F4_A828TBT16_CRT_DATETIME ;
   private boolean[] T001F4_n828TBT16_CRT_DATETIME ;
   private String[] T001F4_A829TBT16_CRT_USER_ID ;
   private boolean[] T001F4_n829TBT16_CRT_USER_ID ;
   private java.util.Date[] T001F4_A831TBT16_UPD_DATETIME ;
   private boolean[] T001F4_n831TBT16_UPD_DATETIME ;
   private String[] T001F4_A832TBT16_UPD_USER_ID ;
   private boolean[] T001F4_n832TBT16_UPD_USER_ID ;
   private long[] T001F4_A834TBT16_UPD_CNT ;
   private boolean[] T001F4_n834TBT16_UPD_CNT ;
   private String[] T001F4_A824TBT16_IMPORT_FILE_NM ;
   private boolean[] T001F4_n824TBT16_IMPORT_FILE_NM ;
   private String[] T001F4_A825TBT16_FILE_NM ;
   private boolean[] T001F4_n825TBT16_FILE_NM ;
   private java.util.Date[] T001F4_A826TBT16_IMPORT_DATETIME ;
   private boolean[] T001F4_n826TBT16_IMPORT_DATETIME ;
   private String[] T001F4_A827TBT16_DEL_FLG ;
   private boolean[] T001F4_n827TBT16_DEL_FLG ;
   private String[] T001F4_A830TBT16_CRT_PROG_NM ;
   private boolean[] T001F4_n830TBT16_CRT_PROG_NM ;
   private String[] T001F4_A833TBT16_UPD_PROG_NM ;
   private boolean[] T001F4_n833TBT16_UPD_PROG_NM ;
   private long[] T001F5_A823TBT16_IMPORT_NO ;
   private long[] T001F3_A823TBT16_IMPORT_NO ;
   private java.util.Date[] T001F3_A828TBT16_CRT_DATETIME ;
   private boolean[] T001F3_n828TBT16_CRT_DATETIME ;
   private String[] T001F3_A829TBT16_CRT_USER_ID ;
   private boolean[] T001F3_n829TBT16_CRT_USER_ID ;
   private java.util.Date[] T001F3_A831TBT16_UPD_DATETIME ;
   private boolean[] T001F3_n831TBT16_UPD_DATETIME ;
   private String[] T001F3_A832TBT16_UPD_USER_ID ;
   private boolean[] T001F3_n832TBT16_UPD_USER_ID ;
   private long[] T001F3_A834TBT16_UPD_CNT ;
   private boolean[] T001F3_n834TBT16_UPD_CNT ;
   private String[] T001F3_A824TBT16_IMPORT_FILE_NM ;
   private boolean[] T001F3_n824TBT16_IMPORT_FILE_NM ;
   private String[] T001F3_A825TBT16_FILE_NM ;
   private boolean[] T001F3_n825TBT16_FILE_NM ;
   private java.util.Date[] T001F3_A826TBT16_IMPORT_DATETIME ;
   private boolean[] T001F3_n826TBT16_IMPORT_DATETIME ;
   private String[] T001F3_A827TBT16_DEL_FLG ;
   private boolean[] T001F3_n827TBT16_DEL_FLG ;
   private String[] T001F3_A830TBT16_CRT_PROG_NM ;
   private boolean[] T001F3_n830TBT16_CRT_PROG_NM ;
   private String[] T001F3_A833TBT16_UPD_PROG_NM ;
   private boolean[] T001F3_n833TBT16_UPD_PROG_NM ;
   private long[] T001F6_A823TBT16_IMPORT_NO ;
   private long[] T001F7_A823TBT16_IMPORT_NO ;
   private long[] T001F2_A823TBT16_IMPORT_NO ;
   private java.util.Date[] T001F2_A828TBT16_CRT_DATETIME ;
   private boolean[] T001F2_n828TBT16_CRT_DATETIME ;
   private String[] T001F2_A829TBT16_CRT_USER_ID ;
   private boolean[] T001F2_n829TBT16_CRT_USER_ID ;
   private java.util.Date[] T001F2_A831TBT16_UPD_DATETIME ;
   private boolean[] T001F2_n831TBT16_UPD_DATETIME ;
   private String[] T001F2_A832TBT16_UPD_USER_ID ;
   private boolean[] T001F2_n832TBT16_UPD_USER_ID ;
   private long[] T001F2_A834TBT16_UPD_CNT ;
   private boolean[] T001F2_n834TBT16_UPD_CNT ;
   private String[] T001F2_A824TBT16_IMPORT_FILE_NM ;
   private boolean[] T001F2_n824TBT16_IMPORT_FILE_NM ;
   private String[] T001F2_A825TBT16_FILE_NM ;
   private boolean[] T001F2_n825TBT16_FILE_NM ;
   private java.util.Date[] T001F2_A826TBT16_IMPORT_DATETIME ;
   private boolean[] T001F2_n826TBT16_IMPORT_DATETIME ;
   private String[] T001F2_A827TBT16_DEL_FLG ;
   private boolean[] T001F2_n827TBT16_DEL_FLG ;
   private String[] T001F2_A830TBT16_CRT_PROG_NM ;
   private boolean[] T001F2_n830TBT16_CRT_PROG_NM ;
   private String[] T001F2_A833TBT16_UPD_PROG_NM ;
   private boolean[] T001F2_n833TBT16_UPD_PROG_NM ;
   private long[] T001F9_A823TBT16_IMPORT_NO ;
   private long[] T001F12_A823TBT16_IMPORT_NO ;
}

final  class tbt16_import_history__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001F2", "SELECT `TBT16_IMPORT_NO`, `TBT16_CRT_DATETIME`, `TBT16_CRT_USER_ID`, `TBT16_UPD_DATETIME`, `TBT16_UPD_USER_ID`, `TBT16_UPD_CNT`, `TBT16_IMPORT_FILE_NM`, `TBT16_FILE_NM`, `TBT16_IMPORT_DATETIME`, `TBT16_DEL_FLG`, `TBT16_CRT_PROG_NM`, `TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` WHERE `TBT16_IMPORT_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001F3", "SELECT `TBT16_IMPORT_NO`, `TBT16_CRT_DATETIME`, `TBT16_CRT_USER_ID`, `TBT16_UPD_DATETIME`, `TBT16_UPD_USER_ID`, `TBT16_UPD_CNT`, `TBT16_IMPORT_FILE_NM`, `TBT16_FILE_NM`, `TBT16_IMPORT_DATETIME`, `TBT16_DEL_FLG`, `TBT16_CRT_PROG_NM`, `TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` WHERE `TBT16_IMPORT_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001F4", "SELECT TM1.`TBT16_IMPORT_NO`, TM1.`TBT16_CRT_DATETIME`, TM1.`TBT16_CRT_USER_ID`, TM1.`TBT16_UPD_DATETIME`, TM1.`TBT16_UPD_USER_ID`, TM1.`TBT16_UPD_CNT`, TM1.`TBT16_IMPORT_FILE_NM`, TM1.`TBT16_FILE_NM`, TM1.`TBT16_IMPORT_DATETIME`, TM1.`TBT16_DEL_FLG`, TM1.`TBT16_CRT_PROG_NM`, TM1.`TBT16_UPD_PROG_NM` FROM `TBT16_IMPORT_HISTORY` TM1 WHERE TM1.`TBT16_IMPORT_NO` = ? ORDER BY TM1.`TBT16_IMPORT_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T001F5", "SELECT `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` WHERE `TBT16_IMPORT_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001F6", "SELECT `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` WHERE ( `TBT16_IMPORT_NO` > ?) ORDER BY `TBT16_IMPORT_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001F7", "SELECT `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` WHERE ( `TBT16_IMPORT_NO` < ?) ORDER BY `TBT16_IMPORT_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001F8", "INSERT INTO `TBT16_IMPORT_HISTORY` (`TBT16_CRT_DATETIME`, `TBT16_CRT_USER_ID`, `TBT16_UPD_DATETIME`, `TBT16_UPD_USER_ID`, `TBT16_UPD_CNT`, `TBT16_IMPORT_FILE_NM`, `TBT16_FILE_NM`, `TBT16_IMPORT_DATETIME`, `TBT16_DEL_FLG`, `TBT16_CRT_PROG_NM`, `TBT16_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new ForEachCursor("T001F9", "SELECT LAST_INSERT_ID() ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T001F10", "UPDATE `TBT16_IMPORT_HISTORY` SET `TBT16_CRT_DATETIME`=?, `TBT16_CRT_USER_ID`=?, `TBT16_UPD_DATETIME`=?, `TBT16_UPD_USER_ID`=?, `TBT16_UPD_CNT`=?, `TBT16_IMPORT_FILE_NM`=?, `TBT16_FILE_NM`=?, `TBT16_IMPORT_DATETIME`=?, `TBT16_DEL_FLG`=?, `TBT16_CRT_PROG_NM`=?, `TBT16_UPD_PROG_NM`=?  WHERE `TBT16_IMPORT_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T001F11", "DELETE FROM `TBT16_IMPORT_HISTORY`  WHERE `TBT16_IMPORT_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T001F12", "SELECT `TBT16_IMPORT_NO` FROM `TBT16_IMPORT_HISTORY` ORDER BY `TBT16_IMPORT_NO` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
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
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
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
               break;
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
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

