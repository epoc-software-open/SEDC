/*
               File: taw01_api_sdt_work_impl
        Description: アプリケーションSDTテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:4.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class taw01_api_sdt_work_impl extends GXWebPanel
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
      Form.getMeta().addItem("Description", "アプリケーションSDTテーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public taw01_api_sdt_work_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public taw01_api_sdt_work_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( taw01_api_sdt_work_impl.class ));
   }

   public taw01_api_sdt_work_impl( int remoteHandle ,
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
         wb_table1_2_0B11( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0B11e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0B11( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0B11( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0B11( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0B11e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"アプリケーションSDTテーブル"+"</legend>") ;
         wb_table3_27_0B11( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0B11e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0B11e( true) ;
      }
      else
      {
         wb_table1_2_0B11e( false) ;
      }
   }

   public void wb_table3_27_0B11( boolean wbgen )
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
         wb_table4_33_0B11( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0B11e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TAW01_API_SDT_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TAW01_API_SDT_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0B11e( true) ;
      }
      else
      {
         wb_table3_27_0B11e( false) ;
      }
   }

   public void wb_table4_33_0B11( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktaw01_session_id_Internalname, "セッションID", "", "", lblTextblocktaw01_session_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAW01_SESSION_ID_Internalname, GXutil.rtrim( A66TAW01_SESSION_ID), GXutil.rtrim( localUtil.format( A66TAW01_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTAW01_SESSION_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAW01_SESSION_ID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktaw01_app_id_Internalname, "画面ID", "", "", lblTextblocktaw01_app_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAW01_APP_ID_Internalname, GXutil.rtrim( A67TAW01_APP_ID), GXutil.rtrim( localUtil.format( A67TAW01_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTAW01_APP_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAW01_APP_ID_Enabled, 0, 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktaw01_disp_datetime_Internalname, "表示日時", "", "", lblTextblocktaw01_disp_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAW01_DISP_DATETIME_Internalname, GXutil.rtrim( A160TAW01_DISP_DATETIME), GXutil.rtrim( localUtil.format( A160TAW01_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTAW01_DISP_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAW01_DISP_DATETIME_Enabled, 0, 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktaw01_crt_date_Internalname, "作成日付", "", "", lblTextblocktaw01_crt_date_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A68TAW01_CRT_DATE", localUtil.format(A68TAW01_CRT_DATE, "99/99/99"));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAW01_CRT_DATE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAW01_CRT_DATE_Internalname, localUtil.format(A68TAW01_CRT_DATE, "99/99/99"), localUtil.format( A68TAW01_CRT_DATE, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'YMD',0,24,'jap',false,0);"+";gx.evt.onblur(53);\"", "", "", "", "", edtTAW01_CRT_DATE_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAW01_CRT_DATE_Enabled, 0, 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAW01_API_SDT_WORK.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAW01_CRT_DATE_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTAW01_CRT_DATE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktaw01_sdt_save_1_Internalname, "SDT格納領域1", "", "", lblTextblocktaw01_sdt_save_1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A69TAW01_SDT_SAVE_1", A69TAW01_SDT_SAVE_1);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTAW01_SDT_SAVE_1_Internalname, A69TAW01_SDT_SAVE_1, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", (short)(0), 1, edtTAW01_SDT_SAVE_1_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "2097152", -1, "", true, "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktaw01_sdt_save_2_Internalname, "SDT格納領域2", "", "", lblTextblocktaw01_sdt_save_2_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A70TAW01_SDT_SAVE_2", A70TAW01_SDT_SAVE_2);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTAW01_SDT_SAVE_2_Internalname, A70TAW01_SDT_SAVE_2, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", (short)(0), 1, edtTAW01_SDT_SAVE_2_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "2097152", -1, "", true, "HLP_TAW01_API_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0B11e( true) ;
      }
      else
      {
         wb_table4_33_0B11e( false) ;
      }
   }

   public void wb_table2_5_0B11( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAW01_API_SDT_WORK.htm");
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
         wb_table2_5_0B11e( true) ;
      }
      else
      {
         wb_table2_5_0B11e( false) ;
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
      /* Execute user event: e110B2 */
      e110B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A66TAW01_SESSION_ID = httpContext.cgiGet( edtTAW01_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
            A67TAW01_APP_ID = httpContext.cgiGet( edtTAW01_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
            A160TAW01_DISP_DATETIME = httpContext.cgiGet( edtTAW01_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
            if ( localUtil.vcdate( httpContext.cgiGet( edtTAW01_CRT_DATE_Internalname), (byte)(6)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {"作成日付"}), 1, "TAW01_CRT_DATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAW01_CRT_DATE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A68TAW01_CRT_DATE = GXutil.nullDate() ;
               n68TAW01_CRT_DATE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A68TAW01_CRT_DATE", localUtil.format(A68TAW01_CRT_DATE, "99/99/99"));
            }
            else
            {
               A68TAW01_CRT_DATE = localUtil.ctod( httpContext.cgiGet( edtTAW01_CRT_DATE_Internalname), 6) ;
               n68TAW01_CRT_DATE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A68TAW01_CRT_DATE", localUtil.format(A68TAW01_CRT_DATE, "99/99/99"));
            }
            n68TAW01_CRT_DATE = (GXutil.nullDate().equals(A68TAW01_CRT_DATE) ? true : false) ;
            A69TAW01_SDT_SAVE_1 = httpContext.cgiGet( edtTAW01_SDT_SAVE_1_Internalname) ;
            n69TAW01_SDT_SAVE_1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69TAW01_SDT_SAVE_1", A69TAW01_SDT_SAVE_1);
            n69TAW01_SDT_SAVE_1 = ((GXutil.strcmp("", A69TAW01_SDT_SAVE_1)==0) ? true : false) ;
            A70TAW01_SDT_SAVE_2 = httpContext.cgiGet( edtTAW01_SDT_SAVE_2_Internalname) ;
            n70TAW01_SDT_SAVE_2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A70TAW01_SDT_SAVE_2", A70TAW01_SDT_SAVE_2);
            n70TAW01_SDT_SAVE_2 = ((GXutil.strcmp("", A70TAW01_SDT_SAVE_2)==0) ? true : false) ;
            /* Read saved values. */
            Z66TAW01_SESSION_ID = httpContext.cgiGet( "Z66TAW01_SESSION_ID") ;
            Z67TAW01_APP_ID = httpContext.cgiGet( "Z67TAW01_APP_ID") ;
            Z160TAW01_DISP_DATETIME = httpContext.cgiGet( "Z160TAW01_DISP_DATETIME") ;
            Z68TAW01_CRT_DATE = localUtil.ctod( httpContext.cgiGet( "Z68TAW01_CRT_DATE"), 0) ;
            n68TAW01_CRT_DATE = (GXutil.nullDate().equals(A68TAW01_CRT_DATE) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV8Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A66TAW01_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
               A67TAW01_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
               A160TAW01_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
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
                     /* Execute user event: e110B2 */
                     e110B2 ();
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0B11( ) ;
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
      disableAttributes0B11( ) ;
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

   public void resetCaption0B0( )
   {
   }

   public void e110B2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_BC_FLG", AV7W_BC_FLG);
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void zm0B11( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z68TAW01_CRT_DATE = T000B3_A68TAW01_CRT_DATE[0] ;
         }
         else
         {
            Z68TAW01_CRT_DATE = A68TAW01_CRT_DATE ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z66TAW01_SESSION_ID = A66TAW01_SESSION_ID ;
         Z67TAW01_APP_ID = A67TAW01_APP_ID ;
         Z160TAW01_DISP_DATETIME = A160TAW01_DISP_DATETIME ;
         Z68TAW01_CRT_DATE = A68TAW01_CRT_DATE ;
         Z69TAW01_SDT_SAVE_1 = A69TAW01_SDT_SAVE_1 ;
         Z70TAW01_SDT_SAVE_2 = A70TAW01_SDT_SAVE_2 ;
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

   public void load0B11( )
   {
      /* Using cursor T000B4 */
      pr_default.execute(2, new Object[] {A66TAW01_SESSION_ID, A67TAW01_APP_ID, A160TAW01_DISP_DATETIME});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A68TAW01_CRT_DATE = T000B4_A68TAW01_CRT_DATE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TAW01_CRT_DATE", localUtil.format(A68TAW01_CRT_DATE, "99/99/99"));
         n68TAW01_CRT_DATE = T000B4_n68TAW01_CRT_DATE[0] ;
         A69TAW01_SDT_SAVE_1 = T000B4_A69TAW01_SDT_SAVE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TAW01_SDT_SAVE_1", A69TAW01_SDT_SAVE_1);
         n69TAW01_SDT_SAVE_1 = T000B4_n69TAW01_SDT_SAVE_1[0] ;
         A70TAW01_SDT_SAVE_2 = T000B4_A70TAW01_SDT_SAVE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70TAW01_SDT_SAVE_2", A70TAW01_SDT_SAVE_2);
         n70TAW01_SDT_SAVE_2 = T000B4_n70TAW01_SDT_SAVE_2[0] ;
         zm0B11( -2) ;
      }
      pr_default.close(2);
      onLoadActions0B11( ) ;
   }

   public void onLoadActions0B11( )
   {
      AV8Pgmname = "TAW01_API_SDT_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable0B11( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TAW01_API_SDT_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      if ( ! ( GXutil.nullDate().equals(A68TAW01_CRT_DATE) || (( A68TAW01_CRT_DATE.after( localUtil.ymdtod( 1000, 1, 1) ) ) || ( A68TAW01_CRT_DATE.equals( localUtil.ymdtod( 1000, 1, 1) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日付 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0B11( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0B11( )
   {
      /* Using cursor T000B5 */
      pr_default.execute(3, new Object[] {A66TAW01_SESSION_ID, A67TAW01_APP_ID, A160TAW01_DISP_DATETIME});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000B3 */
      pr_default.execute(1, new Object[] {A66TAW01_SESSION_ID, A67TAW01_APP_ID, A160TAW01_DISP_DATETIME});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0B11( 2) ;
         RcdFound11 = (short)(1) ;
         A66TAW01_SESSION_ID = T000B3_A66TAW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
         A67TAW01_APP_ID = T000B3_A67TAW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
         A160TAW01_DISP_DATETIME = T000B3_A160TAW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
         A68TAW01_CRT_DATE = T000B3_A68TAW01_CRT_DATE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TAW01_CRT_DATE", localUtil.format(A68TAW01_CRT_DATE, "99/99/99"));
         n68TAW01_CRT_DATE = T000B3_n68TAW01_CRT_DATE[0] ;
         A69TAW01_SDT_SAVE_1 = T000B3_A69TAW01_SDT_SAVE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TAW01_SDT_SAVE_1", A69TAW01_SDT_SAVE_1);
         n69TAW01_SDT_SAVE_1 = T000B3_n69TAW01_SDT_SAVE_1[0] ;
         A70TAW01_SDT_SAVE_2 = T000B3_A70TAW01_SDT_SAVE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70TAW01_SDT_SAVE_2", A70TAW01_SDT_SAVE_2);
         n70TAW01_SDT_SAVE_2 = T000B3_n70TAW01_SDT_SAVE_2[0] ;
         Z66TAW01_SESSION_ID = A66TAW01_SESSION_ID ;
         Z67TAW01_APP_ID = A67TAW01_APP_ID ;
         Z160TAW01_DISP_DATETIME = A160TAW01_DISP_DATETIME ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0B11( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey0B11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0B11( ) ;
      if ( RcdFound11 == 0 )
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
      RcdFound11 = (short)(0) ;
      /* Using cursor T000B6 */
      pr_default.execute(4, new Object[] {A66TAW01_SESSION_ID, A66TAW01_SESSION_ID, A67TAW01_APP_ID, A67TAW01_APP_ID, A66TAW01_SESSION_ID, A160TAW01_DISP_DATETIME});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000B6_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) < 0 ) || ( GXutil.strcmp(T000B6_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000B6_A67TAW01_APP_ID[0], A67TAW01_APP_ID) < 0 ) || ( GXutil.strcmp(T000B6_A67TAW01_APP_ID[0], A67TAW01_APP_ID) == 0 ) && ( GXutil.strcmp(T000B6_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000B6_A160TAW01_DISP_DATETIME[0], A160TAW01_DISP_DATETIME) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000B6_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) > 0 ) || ( GXutil.strcmp(T000B6_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000B6_A67TAW01_APP_ID[0], A67TAW01_APP_ID) > 0 ) || ( GXutil.strcmp(T000B6_A67TAW01_APP_ID[0], A67TAW01_APP_ID) == 0 ) && ( GXutil.strcmp(T000B6_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000B6_A160TAW01_DISP_DATETIME[0], A160TAW01_DISP_DATETIME) > 0 ) ) )
         {
            A66TAW01_SESSION_ID = T000B6_A66TAW01_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
            A67TAW01_APP_ID = T000B6_A67TAW01_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
            A160TAW01_DISP_DATETIME = T000B6_A160TAW01_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound11 = (short)(0) ;
      /* Using cursor T000B7 */
      pr_default.execute(5, new Object[] {A66TAW01_SESSION_ID, A66TAW01_SESSION_ID, A67TAW01_APP_ID, A67TAW01_APP_ID, A66TAW01_SESSION_ID, A160TAW01_DISP_DATETIME});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000B7_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) > 0 ) || ( GXutil.strcmp(T000B7_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000B7_A67TAW01_APP_ID[0], A67TAW01_APP_ID) > 0 ) || ( GXutil.strcmp(T000B7_A67TAW01_APP_ID[0], A67TAW01_APP_ID) == 0 ) && ( GXutil.strcmp(T000B7_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000B7_A160TAW01_DISP_DATETIME[0], A160TAW01_DISP_DATETIME) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000B7_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) < 0 ) || ( GXutil.strcmp(T000B7_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000B7_A67TAW01_APP_ID[0], A67TAW01_APP_ID) < 0 ) || ( GXutil.strcmp(T000B7_A67TAW01_APP_ID[0], A67TAW01_APP_ID) == 0 ) && ( GXutil.strcmp(T000B7_A66TAW01_SESSION_ID[0], A66TAW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000B7_A160TAW01_DISP_DATETIME[0], A160TAW01_DISP_DATETIME) < 0 ) ) )
         {
            A66TAW01_SESSION_ID = T000B7_A66TAW01_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
            A67TAW01_APP_ID = T000B7_A67TAW01_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
            A160TAW01_DISP_DATETIME = T000B7_A160TAW01_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0B11( ) ;
      if ( RcdFound11 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAW01_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A66TAW01_SESSION_ID, Z66TAW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A67TAW01_APP_ID, Z67TAW01_APP_ID) != 0 ) || ( GXutil.strcmp(A160TAW01_DISP_DATETIME, Z160TAW01_DISP_DATETIME) != 0 ) )
         {
            A66TAW01_SESSION_ID = Z66TAW01_SESSION_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
            A67TAW01_APP_ID = Z67TAW01_APP_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
            A160TAW01_DISP_DATETIME = Z160TAW01_DISP_DATETIME ;
            httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAW01_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0B11( ) ;
            GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A66TAW01_SESSION_ID, Z66TAW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A67TAW01_APP_ID, Z67TAW01_APP_ID) != 0 ) || ( GXutil.strcmp(A160TAW01_DISP_DATETIME, Z160TAW01_DISP_DATETIME) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0B11( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAW01_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0B11( ) ;
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
      if ( ( GXutil.strcmp(A66TAW01_SESSION_ID, Z66TAW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A67TAW01_APP_ID, Z67TAW01_APP_ID) != 0 ) || ( GXutil.strcmp(A160TAW01_DISP_DATETIME, Z160TAW01_DISP_DATETIME) != 0 ) )
      {
         A66TAW01_SESSION_ID = Z66TAW01_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
         A67TAW01_APP_ID = Z67TAW01_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
         A160TAW01_DISP_DATETIME = Z160TAW01_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAW01_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAW01_SESSION_ID_Internalname ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAW01_SESSION_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTAW01_CRT_DATE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAW01_CRT_DATE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0B11( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAW01_CRT_DATE_Internalname ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAW01_CRT_DATE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound11 != 0 )
         {
            scanNext0B11( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAW01_CRT_DATE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0B11( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0B11( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000B2 */
         pr_default.execute(0, new Object[] {A66TAW01_SESSION_ID, A67TAW01_APP_ID, A160TAW01_DISP_DATETIME});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAW01_API_SDT_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( Z68TAW01_CRT_DATE.equals( T000B2_A68TAW01_CRT_DATE[0] ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAW01_API_SDT_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0B11( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0B11( 0) ;
         checkOptimisticConcurrency0B11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B11( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0B11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B8 */
                  pr_default.execute(6, new Object[] {A66TAW01_SESSION_ID, A67TAW01_APP_ID, A160TAW01_DISP_DATETIME, new Boolean(n68TAW01_CRT_DATE), A68TAW01_CRT_DATE, new Boolean(n69TAW01_SDT_SAVE_1), A69TAW01_SDT_SAVE_1, new Boolean(n70TAW01_SDT_SAVE_2), A70TAW01_SDT_SAVE_2});
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
                        resetCaption0B0( ) ;
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
            load0B11( ) ;
         }
         endLevel0B11( ) ;
      }
      closeExtendedTableCursors0B11( ) ;
   }

   public void update0B11( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B11( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0B11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B9 */
                  pr_default.execute(7, new Object[] {new Boolean(n68TAW01_CRT_DATE), A68TAW01_CRT_DATE, new Boolean(n69TAW01_SDT_SAVE_1), A69TAW01_SDT_SAVE_1, new Boolean(n70TAW01_SDT_SAVE_2), A70TAW01_SDT_SAVE_2, A66TAW01_SESSION_ID, A67TAW01_APP_ID, A160TAW01_DISP_DATETIME});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAW01_API_SDT_WORK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0B11( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0B0( ) ;
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
         endLevel0B11( ) ;
      }
      closeExtendedTableCursors0B11( ) ;
   }

   public void deferredUpdate0B11( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0B11( ) ;
         afterConfirm0B11( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0B11( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000B10 */
               pr_default.execute(8, new Object[] {A66TAW01_SESSION_ID, A67TAW01_APP_ID, A160TAW01_DISP_DATETIME});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound11 == 0 )
                     {
                        initAll0B11( ) ;
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
                     resetCaption0B0( ) ;
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0B11( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0B11( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TAW01_API_SDT_WORK" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel0B11( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "taw01_api_sdt_work");
         if ( AnyError == 0 )
         {
            confirmValues0B0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "taw01_api_sdt_work");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0B11( )
   {
      /* Using cursor T000B11 */
      pr_default.execute(9);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A66TAW01_SESSION_ID = T000B11_A66TAW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
         A67TAW01_APP_ID = T000B11_A67TAW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
         A160TAW01_DISP_DATETIME = T000B11_A160TAW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0B11( )
   {
      pr_default.readNext(9);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A66TAW01_SESSION_ID = T000B11_A66TAW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
         A67TAW01_APP_ID = T000B11_A67TAW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
         A160TAW01_DISP_DATETIME = T000B11_A160TAW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
      }
   }

   public void scanEnd0B11( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0B11( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0B11( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0B11( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0B11( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0B11( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0B11( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0B11( )
   {
      edtTAW01_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAW01_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAW01_SESSION_ID_Enabled, 5, 0)));
      edtTAW01_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAW01_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAW01_APP_ID_Enabled, 5, 0)));
      edtTAW01_DISP_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAW01_DISP_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAW01_DISP_DATETIME_Enabled, 5, 0)));
      edtTAW01_CRT_DATE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAW01_CRT_DATE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAW01_CRT_DATE_Enabled, 5, 0)));
      edtTAW01_SDT_SAVE_1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAW01_SDT_SAVE_1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAW01_SDT_SAVE_1_Enabled, 5, 0)));
      edtTAW01_SDT_SAVE_2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAW01_SDT_SAVE_2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAW01_SDT_SAVE_2_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0B0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "アプリケーションSDTテーブル") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("taw01_api_sdt_work") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0B11( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z66TAW01_SESSION_ID", GXutil.rtrim( Z66TAW01_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z67TAW01_APP_ID", GXutil.rtrim( Z67TAW01_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z160TAW01_DISP_DATETIME", GXutil.rtrim( Z160TAW01_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z68TAW01_CRT_DATE", localUtil.dtoc( Z68TAW01_CRT_DATE, 0, "/"));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV8Pgmname));
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

   public void initializeNonKey0B11( )
   {
      A68TAW01_CRT_DATE = GXutil.nullDate() ;
      n68TAW01_CRT_DATE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A68TAW01_CRT_DATE", localUtil.format(A68TAW01_CRT_DATE, "99/99/99"));
      n68TAW01_CRT_DATE = (GXutil.nullDate().equals(A68TAW01_CRT_DATE) ? true : false) ;
      A69TAW01_SDT_SAVE_1 = "" ;
      n69TAW01_SDT_SAVE_1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69TAW01_SDT_SAVE_1", A69TAW01_SDT_SAVE_1);
      n69TAW01_SDT_SAVE_1 = ((GXutil.strcmp("", A69TAW01_SDT_SAVE_1)==0) ? true : false) ;
      A70TAW01_SDT_SAVE_2 = "" ;
      n70TAW01_SDT_SAVE_2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A70TAW01_SDT_SAVE_2", A70TAW01_SDT_SAVE_2);
      n70TAW01_SDT_SAVE_2 = ((GXutil.strcmp("", A70TAW01_SDT_SAVE_2)==0) ? true : false) ;
   }

   public void initAll0B11( )
   {
      A66TAW01_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A66TAW01_SESSION_ID", A66TAW01_SESSION_ID);
      A67TAW01_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A67TAW01_APP_ID", A67TAW01_APP_ID);
      A160TAW01_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A160TAW01_DISP_DATETIME", A160TAW01_DISP_DATETIME);
      initializeNonKey0B11( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1454532");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("taw01_api_sdt_work.js", "?1454532");
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
      lblTextblocktaw01_session_id_Internalname = "TEXTBLOCKTAW01_SESSION_ID" ;
      edtTAW01_SESSION_ID_Internalname = "TAW01_SESSION_ID" ;
      lblTextblocktaw01_app_id_Internalname = "TEXTBLOCKTAW01_APP_ID" ;
      edtTAW01_APP_ID_Internalname = "TAW01_APP_ID" ;
      lblTextblocktaw01_disp_datetime_Internalname = "TEXTBLOCKTAW01_DISP_DATETIME" ;
      edtTAW01_DISP_DATETIME_Internalname = "TAW01_DISP_DATETIME" ;
      lblTextblocktaw01_crt_date_Internalname = "TEXTBLOCKTAW01_CRT_DATE" ;
      edtTAW01_CRT_DATE_Internalname = "TAW01_CRT_DATE" ;
      lblTextblocktaw01_sdt_save_1_Internalname = "TEXTBLOCKTAW01_SDT_SAVE_1" ;
      edtTAW01_SDT_SAVE_1_Internalname = "TAW01_SDT_SAVE_1" ;
      lblTextblocktaw01_sdt_save_2_Internalname = "TEXTBLOCKTAW01_SDT_SAVE_2" ;
      edtTAW01_SDT_SAVE_2_Internalname = "TAW01_SDT_SAVE_2" ;
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
      edtTAW01_SDT_SAVE_2_Enabled = 1 ;
      edtTAW01_SDT_SAVE_1_Enabled = 1 ;
      edtTAW01_CRT_DATE_Jsonclick = "" ;
      edtTAW01_CRT_DATE_Enabled = 1 ;
      edtTAW01_DISP_DATETIME_Jsonclick = "" ;
      edtTAW01_DISP_DATETIME_Enabled = 1 ;
      edtTAW01_APP_ID_Jsonclick = "" ;
      edtTAW01_APP_ID_Enabled = 1 ;
      edtTAW01_SESSION_ID_Jsonclick = "" ;
      edtTAW01_SESSION_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      GX_FocusControl = edtTAW01_CRT_DATE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Taw01_disp_datetime( String GX_Parm1 ,
                                          String GX_Parm2 ,
                                          String GX_Parm3 ,
                                          java.util.Date GX_Parm4 ,
                                          String GX_Parm5 ,
                                          String GX_Parm6 )
   {
      A66TAW01_SESSION_ID = GX_Parm1 ;
      A67TAW01_APP_ID = GX_Parm2 ;
      A160TAW01_DISP_DATETIME = GX_Parm3 ;
      A68TAW01_CRT_DATE = GX_Parm4 ;
      n68TAW01_CRT_DATE = false ;
      A69TAW01_SDT_SAVE_1 = GX_Parm5 ;
      n69TAW01_SDT_SAVE_1 = false ;
      A70TAW01_SDT_SAVE_2 = GX_Parm6 ;
      n70TAW01_SDT_SAVE_2 = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A68TAW01_CRT_DATE, "99/99/99"));
      isValidOutput.add(A69TAW01_SDT_SAVE_1);
      isValidOutput.add(A70TAW01_SDT_SAVE_2);
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z66TAW01_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z67TAW01_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z160TAW01_DISP_DATETIME));
      isValidOutput.add(localUtil.dtoc( Z68TAW01_CRT_DATE, 0, "/"));
      isValidOutput.add(Z69TAW01_SDT_SAVE_1);
      isValidOutput.add(Z70TAW01_SDT_SAVE_2);
      isValidOutput.add(GXutil.rtrim( ZV8Pgmname));
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
   public void initialize( )
   {
      sPrefix = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      lblTextblocktaw01_session_id_Jsonclick = "" ;
      A66TAW01_SESSION_ID = "" ;
      lblTextblocktaw01_app_id_Jsonclick = "" ;
      A67TAW01_APP_ID = "" ;
      lblTextblocktaw01_disp_datetime_Jsonclick = "" ;
      A160TAW01_DISP_DATETIME = "" ;
      lblTextblocktaw01_crt_date_Jsonclick = "" ;
      A68TAW01_CRT_DATE = GXutil.nullDate() ;
      lblTextblocktaw01_sdt_save_1_Jsonclick = "" ;
      A69TAW01_SDT_SAVE_1 = "" ;
      lblTextblocktaw01_sdt_save_2_Jsonclick = "" ;
      A70TAW01_SDT_SAVE_2 = "" ;
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
      Z66TAW01_SESSION_ID = "" ;
      Z67TAW01_APP_ID = "" ;
      Z160TAW01_DISP_DATETIME = "" ;
      Z68TAW01_CRT_DATE = GXutil.nullDate() ;
      Gx_mode = "" ;
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      Z69TAW01_SDT_SAVE_1 = "" ;
      Z70TAW01_SDT_SAVE_2 = "" ;
      T000B4_A66TAW01_SESSION_ID = new String[] {""} ;
      T000B4_A67TAW01_APP_ID = new String[] {""} ;
      T000B4_A160TAW01_DISP_DATETIME = new String[] {""} ;
      T000B4_A68TAW01_CRT_DATE = new java.util.Date[] {GXutil.nullDate()} ;
      T000B4_n68TAW01_CRT_DATE = new boolean[] {false} ;
      T000B4_A69TAW01_SDT_SAVE_1 = new String[] {""} ;
      T000B4_n69TAW01_SDT_SAVE_1 = new boolean[] {false} ;
      T000B4_A70TAW01_SDT_SAVE_2 = new String[] {""} ;
      T000B4_n70TAW01_SDT_SAVE_2 = new boolean[] {false} ;
      T000B5_A66TAW01_SESSION_ID = new String[] {""} ;
      T000B5_A67TAW01_APP_ID = new String[] {""} ;
      T000B5_A160TAW01_DISP_DATETIME = new String[] {""} ;
      T000B3_A66TAW01_SESSION_ID = new String[] {""} ;
      T000B3_A67TAW01_APP_ID = new String[] {""} ;
      T000B3_A160TAW01_DISP_DATETIME = new String[] {""} ;
      T000B3_A68TAW01_CRT_DATE = new java.util.Date[] {GXutil.nullDate()} ;
      T000B3_n68TAW01_CRT_DATE = new boolean[] {false} ;
      T000B3_A69TAW01_SDT_SAVE_1 = new String[] {""} ;
      T000B3_n69TAW01_SDT_SAVE_1 = new boolean[] {false} ;
      T000B3_A70TAW01_SDT_SAVE_2 = new String[] {""} ;
      T000B3_n70TAW01_SDT_SAVE_2 = new boolean[] {false} ;
      sMode11 = "" ;
      T000B6_A66TAW01_SESSION_ID = new String[] {""} ;
      T000B6_A67TAW01_APP_ID = new String[] {""} ;
      T000B6_A160TAW01_DISP_DATETIME = new String[] {""} ;
      T000B7_A66TAW01_SESSION_ID = new String[] {""} ;
      T000B7_A67TAW01_APP_ID = new String[] {""} ;
      T000B7_A160TAW01_DISP_DATETIME = new String[] {""} ;
      T000B2_A66TAW01_SESSION_ID = new String[] {""} ;
      T000B2_A67TAW01_APP_ID = new String[] {""} ;
      T000B2_A160TAW01_DISP_DATETIME = new String[] {""} ;
      T000B2_A68TAW01_CRT_DATE = new java.util.Date[] {GXutil.nullDate()} ;
      T000B2_n68TAW01_CRT_DATE = new boolean[] {false} ;
      T000B2_A69TAW01_SDT_SAVE_1 = new String[] {""} ;
      T000B2_n69TAW01_SDT_SAVE_1 = new boolean[] {false} ;
      T000B2_A70TAW01_SDT_SAVE_2 = new String[] {""} ;
      T000B2_n70TAW01_SDT_SAVE_2 = new boolean[] {false} ;
      T000B11_A66TAW01_SESSION_ID = new String[] {""} ;
      T000B11_A67TAW01_APP_ID = new String[] {""} ;
      T000B11_A160TAW01_DISP_DATETIME = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new taw01_api_sdt_work__default(),
         new Object[] {
             new Object[] {
            T000B2_A66TAW01_SESSION_ID, T000B2_A67TAW01_APP_ID, T000B2_A160TAW01_DISP_DATETIME, T000B2_A68TAW01_CRT_DATE, T000B2_n68TAW01_CRT_DATE, T000B2_A69TAW01_SDT_SAVE_1, T000B2_n69TAW01_SDT_SAVE_1, T000B2_A70TAW01_SDT_SAVE_2, T000B2_n70TAW01_SDT_SAVE_2
            }
            , new Object[] {
            T000B3_A66TAW01_SESSION_ID, T000B3_A67TAW01_APP_ID, T000B3_A160TAW01_DISP_DATETIME, T000B3_A68TAW01_CRT_DATE, T000B3_n68TAW01_CRT_DATE, T000B3_A69TAW01_SDT_SAVE_1, T000B3_n69TAW01_SDT_SAVE_1, T000B3_A70TAW01_SDT_SAVE_2, T000B3_n70TAW01_SDT_SAVE_2
            }
            , new Object[] {
            T000B4_A66TAW01_SESSION_ID, T000B4_A67TAW01_APP_ID, T000B4_A160TAW01_DISP_DATETIME, T000B4_A68TAW01_CRT_DATE, T000B4_n68TAW01_CRT_DATE, T000B4_A69TAW01_SDT_SAVE_1, T000B4_n69TAW01_SDT_SAVE_1, T000B4_A70TAW01_SDT_SAVE_2, T000B4_n70TAW01_SDT_SAVE_2
            }
            , new Object[] {
            T000B5_A66TAW01_SESSION_ID, T000B5_A67TAW01_APP_ID, T000B5_A160TAW01_DISP_DATETIME
            }
            , new Object[] {
            T000B6_A66TAW01_SESSION_ID, T000B6_A67TAW01_APP_ID, T000B6_A160TAW01_DISP_DATETIME
            }
            , new Object[] {
            T000B7_A66TAW01_SESSION_ID, T000B7_A67TAW01_APP_ID, T000B7_A160TAW01_DISP_DATETIME
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000B11_A66TAW01_SESSION_ID, T000B11_A67TAW01_APP_ID, T000B11_A160TAW01_DISP_DATETIME
            }
         }
      );
      AV8Pgmname = "TAW01_API_SDT_WORK" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound11 ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTAW01_SESSION_ID_Enabled ;
   private int edtTAW01_APP_ID_Enabled ;
   private int edtTAW01_DISP_DATETIME_Enabled ;
   private int edtTAW01_CRT_DATE_Enabled ;
   private int edtTAW01_SDT_SAVE_1_Enabled ;
   private int edtTAW01_SDT_SAVE_2_Enabled ;
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
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTAW01_SESSION_ID_Internalname ;
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
   private String lblTextblocktaw01_session_id_Internalname ;
   private String lblTextblocktaw01_session_id_Jsonclick ;
   private String edtTAW01_SESSION_ID_Jsonclick ;
   private String lblTextblocktaw01_app_id_Internalname ;
   private String lblTextblocktaw01_app_id_Jsonclick ;
   private String edtTAW01_APP_ID_Internalname ;
   private String edtTAW01_APP_ID_Jsonclick ;
   private String lblTextblocktaw01_disp_datetime_Internalname ;
   private String lblTextblocktaw01_disp_datetime_Jsonclick ;
   private String edtTAW01_DISP_DATETIME_Internalname ;
   private String edtTAW01_DISP_DATETIME_Jsonclick ;
   private String lblTextblocktaw01_crt_date_Internalname ;
   private String lblTextblocktaw01_crt_date_Jsonclick ;
   private String edtTAW01_CRT_DATE_Internalname ;
   private String edtTAW01_CRT_DATE_Jsonclick ;
   private String lblTextblocktaw01_sdt_save_1_Internalname ;
   private String lblTextblocktaw01_sdt_save_1_Jsonclick ;
   private String edtTAW01_SDT_SAVE_1_Internalname ;
   private String lblTextblocktaw01_sdt_save_2_Internalname ;
   private String lblTextblocktaw01_sdt_save_2_Jsonclick ;
   private String edtTAW01_SDT_SAVE_2_Internalname ;
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
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode11 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String ZV8Pgmname ;
   private java.util.Date A68TAW01_CRT_DATE ;
   private java.util.Date Z68TAW01_CRT_DATE ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n68TAW01_CRT_DATE ;
   private boolean n69TAW01_SDT_SAVE_1 ;
   private boolean n70TAW01_SDT_SAVE_2 ;
   private String A69TAW01_SDT_SAVE_1 ;
   private String A70TAW01_SDT_SAVE_2 ;
   private String Z69TAW01_SDT_SAVE_1 ;
   private String Z70TAW01_SDT_SAVE_2 ;
   private String A66TAW01_SESSION_ID ;
   private String A67TAW01_APP_ID ;
   private String A160TAW01_DISP_DATETIME ;
   private String Z66TAW01_SESSION_ID ;
   private String Z67TAW01_APP_ID ;
   private String Z160TAW01_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000B4_A66TAW01_SESSION_ID ;
   private String[] T000B4_A67TAW01_APP_ID ;
   private String[] T000B4_A160TAW01_DISP_DATETIME ;
   private java.util.Date[] T000B4_A68TAW01_CRT_DATE ;
   private boolean[] T000B4_n68TAW01_CRT_DATE ;
   private String[] T000B4_A69TAW01_SDT_SAVE_1 ;
   private boolean[] T000B4_n69TAW01_SDT_SAVE_1 ;
   private String[] T000B4_A70TAW01_SDT_SAVE_2 ;
   private boolean[] T000B4_n70TAW01_SDT_SAVE_2 ;
   private String[] T000B5_A66TAW01_SESSION_ID ;
   private String[] T000B5_A67TAW01_APP_ID ;
   private String[] T000B5_A160TAW01_DISP_DATETIME ;
   private String[] T000B3_A66TAW01_SESSION_ID ;
   private String[] T000B3_A67TAW01_APP_ID ;
   private String[] T000B3_A160TAW01_DISP_DATETIME ;
   private java.util.Date[] T000B3_A68TAW01_CRT_DATE ;
   private boolean[] T000B3_n68TAW01_CRT_DATE ;
   private String[] T000B3_A69TAW01_SDT_SAVE_1 ;
   private boolean[] T000B3_n69TAW01_SDT_SAVE_1 ;
   private String[] T000B3_A70TAW01_SDT_SAVE_2 ;
   private boolean[] T000B3_n70TAW01_SDT_SAVE_2 ;
   private String[] T000B6_A66TAW01_SESSION_ID ;
   private String[] T000B6_A67TAW01_APP_ID ;
   private String[] T000B6_A160TAW01_DISP_DATETIME ;
   private String[] T000B7_A66TAW01_SESSION_ID ;
   private String[] T000B7_A67TAW01_APP_ID ;
   private String[] T000B7_A160TAW01_DISP_DATETIME ;
   private String[] T000B2_A66TAW01_SESSION_ID ;
   private String[] T000B2_A67TAW01_APP_ID ;
   private String[] T000B2_A160TAW01_DISP_DATETIME ;
   private java.util.Date[] T000B2_A68TAW01_CRT_DATE ;
   private boolean[] T000B2_n68TAW01_CRT_DATE ;
   private String[] T000B2_A69TAW01_SDT_SAVE_1 ;
   private boolean[] T000B2_n69TAW01_SDT_SAVE_1 ;
   private String[] T000B2_A70TAW01_SDT_SAVE_2 ;
   private boolean[] T000B2_n70TAW01_SDT_SAVE_2 ;
   private String[] T000B11_A66TAW01_SESSION_ID ;
   private String[] T000B11_A67TAW01_APP_ID ;
   private String[] T000B11_A160TAW01_DISP_DATETIME ;
}

final  class taw01_api_sdt_work__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000B2", "SELECT `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME`, `TAW01_CRT_DATE`, `TAW01_SDT_SAVE_1`, `TAW01_SDT_SAVE_2` FROM `TAW01_API_SDT_WORK` WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B3", "SELECT `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME`, `TAW01_CRT_DATE`, `TAW01_SDT_SAVE_1`, `TAW01_SDT_SAVE_2` FROM `TAW01_API_SDT_WORK` WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B4", "SELECT TM1.`TAW01_SESSION_ID`, TM1.`TAW01_APP_ID`, TM1.`TAW01_DISP_DATETIME`, TM1.`TAW01_CRT_DATE`, TM1.`TAW01_SDT_SAVE_1`, TM1.`TAW01_SDT_SAVE_2` FROM `TAW01_API_SDT_WORK` TM1 WHERE TM1.`TAW01_SESSION_ID` = ? and TM1.`TAW01_APP_ID` = ? and TM1.`TAW01_DISP_DATETIME` = ? ORDER BY TM1.`TAW01_SESSION_ID`, TM1.`TAW01_APP_ID`, TM1.`TAW01_DISP_DATETIME` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000B5", "SELECT `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME` FROM `TAW01_API_SDT_WORK` WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000B6", "SELECT `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME` FROM `TAW01_API_SDT_WORK` WHERE ( `TAW01_SESSION_ID` > ? or `TAW01_SESSION_ID` = ? and `TAW01_APP_ID` > ? or `TAW01_APP_ID` = ? and `TAW01_SESSION_ID` = ? and `TAW01_DISP_DATETIME` > ?) ORDER BY `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000B7", "SELECT `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME` FROM `TAW01_API_SDT_WORK` WHERE ( `TAW01_SESSION_ID` < ? or `TAW01_SESSION_ID` = ? and `TAW01_APP_ID` < ? or `TAW01_APP_ID` = ? and `TAW01_SESSION_ID` = ? and `TAW01_DISP_DATETIME` < ?) ORDER BY `TAW01_SESSION_ID` DESC, `TAW01_APP_ID` DESC, `TAW01_DISP_DATETIME` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000B8", "INSERT INTO `TAW01_API_SDT_WORK` (`TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME`, `TAW01_CRT_DATE`, `TAW01_SDT_SAVE_1`, `TAW01_SDT_SAVE_2`) VALUES (?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000B9", "UPDATE `TAW01_API_SDT_WORK` SET `TAW01_CRT_DATE`=?, `TAW01_SDT_SAVE_1`=?, `TAW01_SDT_SAVE_2`=?  WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ?", GX_NOMASK)
         ,new UpdateCursor("T000B10", "DELETE FROM `TAW01_API_SDT_WORK`  WHERE `TAW01_SESSION_ID` = ? AND `TAW01_APP_ID` = ? AND `TAW01_DISP_DATETIME` = ?", GX_NOMASK)
         ,new ForEachCursor("T000B11", "SELECT `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME` FROM `TAW01_API_SDT_WORK` ORDER BY `TAW01_SESSION_ID`, `TAW01_APP_ID`, `TAW01_DISP_DATETIME` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               stmt.setVarchar(4, (String)parms[3], 7, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 14, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               stmt.setVarchar(4, (String)parms[3], 7, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 14, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(5, (String)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(6, (String)parms[8]);
               }
               break;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(2, (String)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(3, (String)parms[5]);
               }
               stmt.setVarchar(4, (String)parms[6], 50, false);
               stmt.setVarchar(5, (String)parms[7], 7, false);
               stmt.setVarchar(6, (String)parms[8], 14, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               break;
      }
   }

}

