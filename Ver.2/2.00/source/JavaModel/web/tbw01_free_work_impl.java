/*
               File: tbw01_free_work_impl
        Description: 汎用ワークテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:4.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw01_free_work_impl extends GXWebPanel
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
         Form.getMeta().addItem("description", "汎用ワークテーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbw01_free_work_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw01_free_work_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw01_free_work_impl.class ));
   }

   public tbw01_free_work_impl( int remoteHandle ,
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
         wb_table1_2_1540( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1540e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1540( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1540( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1540( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1540e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "汎用ワークテーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TBW01_FREE_WORK.htm");
         wb_table3_28_1540( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1540e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1540e( true) ;
      }
      else
      {
         wb_table1_2_1540e( false) ;
      }
   }

   public void wb_table3_28_1540( boolean wbgen )
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
         wb_table4_34_1540( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1540e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW01_FREE_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW01_FREE_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1540e( true) ;
      }
      else
      {
         wb_table3_28_1540e( false) ;
      }
   }

   public void wb_table4_34_1540( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw01_session_id_Internalname, "ID", "", "", lblTextblocktbw01_session_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW01_SESSION_ID_Internalname, GXutil.rtrim( A51TBW01_SESSION_ID), GXutil.rtrim( localUtil.format( A51TBW01_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW01_SESSION_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW01_SESSION_ID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SESSION_ID", "left", "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw01_app_id_Internalname, "ID", "", "", lblTextblocktbw01_app_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW01_APP_ID_Internalname, GXutil.rtrim( A52TBW01_APP_ID), GXutil.rtrim( localUtil.format( A52TBW01_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW01_APP_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW01_APP_ID_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_APP_ID", "left", "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw01_disp_datetime_Internalname, "ブラウザ表示日時", "", "", lblTextblocktbw01_disp_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW01_DISP_DATETIME_Internalname, GXutil.rtrim( A53TBW01_DISP_DATETIME), GXutil.rtrim( localUtil.format( A53TBW01_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW01_DISP_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW01_DISP_DATETIME_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_Y4MD_HMS_C", "left", "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw01_line_no_Internalname, "行番号", "", "", lblTextblocktbw01_line_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW01_LINE_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A54TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")), ((edtTBW01_LINE_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54TBW01_LINE_NO), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A54TBW01_LINE_NO), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW01_LINE_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW01_LINE_NO_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw01_free_save_1_Internalname, "汎用領域1", "", "", lblTextblocktbw01_free_save_1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW01_FREE_SAVE_1_Internalname, A685TBW01_FREE_SAVE_1, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", (short)(0), 1, edtTBW01_FREE_SAVE_1_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, "", "", (byte)(-1), true, "", "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw01_free_save_2_Internalname, "汎用領域2", "", "", lblTextblocktbw01_free_save_2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW01_FREE_SAVE_2_Internalname, A686TBW01_FREE_SAVE_2, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", (short)(0), 1, edtTBW01_FREE_SAVE_2_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, "", "", (byte)(-1), true, "", "HLP_TBW01_FREE_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1540e( true) ;
      }
      else
      {
         wb_table4_34_1540e( false) ;
      }
   }

   public void wb_table2_5_1540( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW01_FREE_WORK.htm");
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
         wb_table2_5_1540e( true) ;
      }
      else
      {
         wb_table2_5_1540e( false) ;
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
      /* Execute user event: e11152 */
      e11152 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A51TBW01_SESSION_ID = httpContext.cgiGet( edtTBW01_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
            A52TBW01_APP_ID = httpContext.cgiGet( edtTBW01_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
            A53TBW01_DISP_DATETIME = httpContext.cgiGet( edtTBW01_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW01_LINE_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW01_LINE_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A54TBW01_LINE_NO = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
            }
            else
            {
               A54TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( edtTBW01_LINE_NO_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
            }
            A685TBW01_FREE_SAVE_1 = httpContext.cgiGet( edtTBW01_FREE_SAVE_1_Internalname) ;
            n685TBW01_FREE_SAVE_1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A685TBW01_FREE_SAVE_1", A685TBW01_FREE_SAVE_1);
            n685TBW01_FREE_SAVE_1 = ((GXutil.strcmp("", A685TBW01_FREE_SAVE_1)==0) ? true : false) ;
            A686TBW01_FREE_SAVE_2 = httpContext.cgiGet( edtTBW01_FREE_SAVE_2_Internalname) ;
            n686TBW01_FREE_SAVE_2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A686TBW01_FREE_SAVE_2", A686TBW01_FREE_SAVE_2);
            n686TBW01_FREE_SAVE_2 = ((GXutil.strcmp("", A686TBW01_FREE_SAVE_2)==0) ? true : false) ;
            /* Read saved values. */
            Z51TBW01_SESSION_ID = httpContext.cgiGet( "Z51TBW01_SESSION_ID") ;
            Z52TBW01_APP_ID = httpContext.cgiGet( "Z52TBW01_APP_ID") ;
            Z53TBW01_DISP_DATETIME = httpContext.cgiGet( "Z53TBW01_DISP_DATETIME") ;
            Z54TBW01_LINE_NO = localUtil.ctol( httpContext.cgiGet( "Z54TBW01_LINE_NO"), ".", ",") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV8Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A51TBW01_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
               A52TBW01_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
               A53TBW01_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
               A54TBW01_LINE_NO = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
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
                     /* Execute user event: e11152 */
                     e11152 ();
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
            initAll1540( ) ;
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
      disableAttributes1540( ) ;
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

   public void resetCaption150( )
   {
   }

   public void e11152( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_BC_FLG", AV7W_BC_FLG);
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm1540( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z51TBW01_SESSION_ID = A51TBW01_SESSION_ID ;
         Z52TBW01_APP_ID = A52TBW01_APP_ID ;
         Z53TBW01_DISP_DATETIME = A53TBW01_DISP_DATETIME ;
         Z54TBW01_LINE_NO = A54TBW01_LINE_NO ;
         Z685TBW01_FREE_SAVE_1 = A685TBW01_FREE_SAVE_1 ;
         Z686TBW01_FREE_SAVE_2 = A686TBW01_FREE_SAVE_2 ;
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

   public void load1540( )
   {
      /* Using cursor T00154 */
      pr_default.execute(2, new Object[] {A51TBW01_SESSION_ID, A52TBW01_APP_ID, A53TBW01_DISP_DATETIME, new Long(A54TBW01_LINE_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A685TBW01_FREE_SAVE_1 = T00154_A685TBW01_FREE_SAVE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685TBW01_FREE_SAVE_1", A685TBW01_FREE_SAVE_1);
         n685TBW01_FREE_SAVE_1 = T00154_n685TBW01_FREE_SAVE_1[0] ;
         A686TBW01_FREE_SAVE_2 = T00154_A686TBW01_FREE_SAVE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686TBW01_FREE_SAVE_2", A686TBW01_FREE_SAVE_2);
         n686TBW01_FREE_SAVE_2 = T00154_n686TBW01_FREE_SAVE_2[0] ;
         zm1540( -1) ;
      }
      pr_default.close(2);
      onLoadActions1540( ) ;
   }

   public void onLoadActions1540( )
   {
      AV8Pgmname = "TBW01_FREE_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1540( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW01_FREE_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void closeExtendedTableCursors1540( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1540( )
   {
      /* Using cursor T00155 */
      pr_default.execute(3, new Object[] {A51TBW01_SESSION_ID, A52TBW01_APP_ID, A53TBW01_DISP_DATETIME, new Long(A54TBW01_LINE_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound40 = (short)(1) ;
      }
      else
      {
         RcdFound40 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00153 */
      pr_default.execute(1, new Object[] {A51TBW01_SESSION_ID, A52TBW01_APP_ID, A53TBW01_DISP_DATETIME, new Long(A54TBW01_LINE_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1540( 1) ;
         RcdFound40 = (short)(1) ;
         A51TBW01_SESSION_ID = T00153_A51TBW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
         A52TBW01_APP_ID = T00153_A52TBW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
         A53TBW01_DISP_DATETIME = T00153_A53TBW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
         A54TBW01_LINE_NO = T00153_A54TBW01_LINE_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
         A685TBW01_FREE_SAVE_1 = T00153_A685TBW01_FREE_SAVE_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685TBW01_FREE_SAVE_1", A685TBW01_FREE_SAVE_1);
         n685TBW01_FREE_SAVE_1 = T00153_n685TBW01_FREE_SAVE_1[0] ;
         A686TBW01_FREE_SAVE_2 = T00153_A686TBW01_FREE_SAVE_2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686TBW01_FREE_SAVE_2", A686TBW01_FREE_SAVE_2);
         n686TBW01_FREE_SAVE_2 = T00153_n686TBW01_FREE_SAVE_2[0] ;
         Z51TBW01_SESSION_ID = A51TBW01_SESSION_ID ;
         Z52TBW01_APP_ID = A52TBW01_APP_ID ;
         Z53TBW01_DISP_DATETIME = A53TBW01_DISP_DATETIME ;
         Z54TBW01_LINE_NO = A54TBW01_LINE_NO ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1540( ) ;
         if ( AnyError == 1 )
         {
            RcdFound40 = (short)(0) ;
            initializeNonKey1540( ) ;
         }
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound40 = (short)(0) ;
         initializeNonKey1540( ) ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1540( ) ;
      if ( RcdFound40 == 0 )
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
      RcdFound40 = (short)(0) ;
      /* Using cursor T00156 */
      pr_default.execute(4, new Object[] {A51TBW01_SESSION_ID, A51TBW01_SESSION_ID, A52TBW01_APP_ID, A52TBW01_APP_ID, A51TBW01_SESSION_ID, A53TBW01_DISP_DATETIME, A53TBW01_DISP_DATETIME, A52TBW01_APP_ID, A51TBW01_SESSION_ID, new Long(A54TBW01_LINE_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00156_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) < 0 ) || ( GXutil.strcmp(T00156_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00156_A52TBW01_APP_ID[0], A52TBW01_APP_ID) < 0 ) || ( GXutil.strcmp(T00156_A52TBW01_APP_ID[0], A52TBW01_APP_ID) == 0 ) && ( GXutil.strcmp(T00156_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00156_A53TBW01_DISP_DATETIME[0], A53TBW01_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T00156_A53TBW01_DISP_DATETIME[0], A53TBW01_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00156_A52TBW01_APP_ID[0], A52TBW01_APP_ID) == 0 ) && ( GXutil.strcmp(T00156_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( T00156_A54TBW01_LINE_NO[0] < A54TBW01_LINE_NO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00156_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) > 0 ) || ( GXutil.strcmp(T00156_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00156_A52TBW01_APP_ID[0], A52TBW01_APP_ID) > 0 ) || ( GXutil.strcmp(T00156_A52TBW01_APP_ID[0], A52TBW01_APP_ID) == 0 ) && ( GXutil.strcmp(T00156_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00156_A53TBW01_DISP_DATETIME[0], A53TBW01_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T00156_A53TBW01_DISP_DATETIME[0], A53TBW01_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00156_A52TBW01_APP_ID[0], A52TBW01_APP_ID) == 0 ) && ( GXutil.strcmp(T00156_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( T00156_A54TBW01_LINE_NO[0] > A54TBW01_LINE_NO ) ) )
         {
            A51TBW01_SESSION_ID = T00156_A51TBW01_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
            A52TBW01_APP_ID = T00156_A52TBW01_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
            A53TBW01_DISP_DATETIME = T00156_A53TBW01_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
            A54TBW01_LINE_NO = T00156_A54TBW01_LINE_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
            RcdFound40 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound40 = (short)(0) ;
      /* Using cursor T00157 */
      pr_default.execute(5, new Object[] {A51TBW01_SESSION_ID, A51TBW01_SESSION_ID, A52TBW01_APP_ID, A52TBW01_APP_ID, A51TBW01_SESSION_ID, A53TBW01_DISP_DATETIME, A53TBW01_DISP_DATETIME, A52TBW01_APP_ID, A51TBW01_SESSION_ID, new Long(A54TBW01_LINE_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00157_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) > 0 ) || ( GXutil.strcmp(T00157_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00157_A52TBW01_APP_ID[0], A52TBW01_APP_ID) > 0 ) || ( GXutil.strcmp(T00157_A52TBW01_APP_ID[0], A52TBW01_APP_ID) == 0 ) && ( GXutil.strcmp(T00157_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00157_A53TBW01_DISP_DATETIME[0], A53TBW01_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T00157_A53TBW01_DISP_DATETIME[0], A53TBW01_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00157_A52TBW01_APP_ID[0], A52TBW01_APP_ID) == 0 ) && ( GXutil.strcmp(T00157_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( T00157_A54TBW01_LINE_NO[0] > A54TBW01_LINE_NO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00157_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) < 0 ) || ( GXutil.strcmp(T00157_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00157_A52TBW01_APP_ID[0], A52TBW01_APP_ID) < 0 ) || ( GXutil.strcmp(T00157_A52TBW01_APP_ID[0], A52TBW01_APP_ID) == 0 ) && ( GXutil.strcmp(T00157_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00157_A53TBW01_DISP_DATETIME[0], A53TBW01_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T00157_A53TBW01_DISP_DATETIME[0], A53TBW01_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00157_A52TBW01_APP_ID[0], A52TBW01_APP_ID) == 0 ) && ( GXutil.strcmp(T00157_A51TBW01_SESSION_ID[0], A51TBW01_SESSION_ID) == 0 ) && ( T00157_A54TBW01_LINE_NO[0] < A54TBW01_LINE_NO ) ) )
         {
            A51TBW01_SESSION_ID = T00157_A51TBW01_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
            A52TBW01_APP_ID = T00157_A52TBW01_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
            A53TBW01_DISP_DATETIME = T00157_A53TBW01_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
            A54TBW01_LINE_NO = T00157_A54TBW01_LINE_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
            RcdFound40 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1540( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1540( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound40 == 1 )
         {
            if ( ( GXutil.strcmp(A51TBW01_SESSION_ID, Z51TBW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A52TBW01_APP_ID, Z52TBW01_APP_ID) != 0 ) || ( GXutil.strcmp(A53TBW01_DISP_DATETIME, Z53TBW01_DISP_DATETIME) != 0 ) || ( A54TBW01_LINE_NO != Z54TBW01_LINE_NO ) )
            {
               A51TBW01_SESSION_ID = Z51TBW01_SESSION_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
               A52TBW01_APP_ID = Z52TBW01_APP_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
               A53TBW01_DISP_DATETIME = Z53TBW01_DISP_DATETIME ;
               httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
               A54TBW01_LINE_NO = Z54TBW01_LINE_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW01_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1540( ) ;
               GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A51TBW01_SESSION_ID, Z51TBW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A52TBW01_APP_ID, Z52TBW01_APP_ID) != 0 ) || ( GXutil.strcmp(A53TBW01_DISP_DATETIME, Z53TBW01_DISP_DATETIME) != 0 ) || ( A54TBW01_LINE_NO != Z54TBW01_LINE_NO ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1540( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW01_SESSION_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1540( ) ;
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
      if ( ( GXutil.strcmp(A51TBW01_SESSION_ID, Z51TBW01_SESSION_ID) != 0 ) || ( GXutil.strcmp(A52TBW01_APP_ID, Z52TBW01_APP_ID) != 0 ) || ( GXutil.strcmp(A53TBW01_DISP_DATETIME, Z53TBW01_DISP_DATETIME) != 0 ) || ( A54TBW01_LINE_NO != Z54TBW01_LINE_NO ) )
      {
         A51TBW01_SESSION_ID = Z51TBW01_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
         A52TBW01_APP_ID = Z52TBW01_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
         A53TBW01_DISP_DATETIME = Z53TBW01_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
         A54TBW01_LINE_NO = Z54TBW01_LINE_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW01_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
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
      if ( RcdFound40 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW01_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW01_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBW01_FREE_SAVE_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1540( ) ;
      if ( RcdFound40 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW01_FREE_SAVE_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1540( ) ;
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
      if ( RcdFound40 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW01_FREE_SAVE_1_Internalname ;
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
      if ( RcdFound40 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW01_FREE_SAVE_1_Internalname ;
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
      scanStart1540( ) ;
      if ( RcdFound40 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound40 != 0 )
         {
            scanNext1540( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW01_FREE_SAVE_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1540( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1540( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00152 */
         pr_default.execute(0, new Object[] {A51TBW01_SESSION_ID, A52TBW01_APP_ID, A53TBW01_DISP_DATETIME, new Long(A54TBW01_LINE_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW01_FREE_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW01_FREE_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1540( )
   {
      beforeValidate1540( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1540( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1540( 0) ;
         checkOptimisticConcurrency1540( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1540( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1540( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00158 */
                  pr_default.execute(6, new Object[] {A51TBW01_SESSION_ID, A52TBW01_APP_ID, A53TBW01_DISP_DATETIME, new Long(A54TBW01_LINE_NO), new Boolean(n685TBW01_FREE_SAVE_1), A685TBW01_FREE_SAVE_1, new Boolean(n686TBW01_FREE_SAVE_2), A686TBW01_FREE_SAVE_2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW01_FREE_WORK") ;
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption150( ) ;
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
            load1540( ) ;
         }
         endLevel1540( ) ;
      }
      closeExtendedTableCursors1540( ) ;
   }

   public void update1540( )
   {
      beforeValidate1540( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1540( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1540( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1540( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1540( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00159 */
                  pr_default.execute(7, new Object[] {new Boolean(n685TBW01_FREE_SAVE_1), A685TBW01_FREE_SAVE_1, new Boolean(n686TBW01_FREE_SAVE_2), A686TBW01_FREE_SAVE_2, A51TBW01_SESSION_ID, A52TBW01_APP_ID, A53TBW01_DISP_DATETIME, new Long(A54TBW01_LINE_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW01_FREE_WORK") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW01_FREE_WORK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1540( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption150( ) ;
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
         endLevel1540( ) ;
      }
      closeExtendedTableCursors1540( ) ;
   }

   public void deferredUpdate1540( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1540( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1540( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1540( ) ;
         afterConfirm1540( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1540( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001510 */
               pr_default.execute(8, new Object[] {A51TBW01_SESSION_ID, A52TBW01_APP_ID, A53TBW01_DISP_DATETIME, new Long(A54TBW01_LINE_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW01_FREE_WORK") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound40 == 0 )
                     {
                        initAll1540( ) ;
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
                     resetCaption150( ) ;
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
      sMode40 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1540( ) ;
      Gx_mode = sMode40 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1540( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW01_FREE_WORK" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel1540( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1540( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw01_free_work");
         if ( AnyError == 0 )
         {
            confirmValues150( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw01_free_work");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1540( )
   {
      /* Scan By routine */
      /* Using cursor T001511 */
      pr_default.execute(9);
      RcdFound40 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A51TBW01_SESSION_ID = T001511_A51TBW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
         A52TBW01_APP_ID = T001511_A52TBW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
         A53TBW01_DISP_DATETIME = T001511_A53TBW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
         A54TBW01_LINE_NO = T001511_A54TBW01_LINE_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1540( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound40 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A51TBW01_SESSION_ID = T001511_A51TBW01_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
         A52TBW01_APP_ID = T001511_A52TBW01_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
         A53TBW01_DISP_DATETIME = T001511_A53TBW01_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
         A54TBW01_LINE_NO = T001511_A54TBW01_LINE_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
      }
   }

   public void scanEnd1540( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1540( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1540( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1540( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1540( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1540( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1540( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1540( )
   {
      edtTBW01_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW01_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW01_SESSION_ID_Enabled, 5, 0)));
      edtTBW01_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW01_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW01_APP_ID_Enabled, 5, 0)));
      edtTBW01_DISP_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW01_DISP_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW01_DISP_DATETIME_Enabled, 5, 0)));
      edtTBW01_LINE_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW01_LINE_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW01_LINE_NO_Enabled, 5, 0)));
      edtTBW01_FREE_SAVE_1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW01_FREE_SAVE_1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW01_FREE_SAVE_1_Enabled, 5, 0)));
      edtTBW01_FREE_SAVE_2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW01_FREE_SAVE_2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW01_FREE_SAVE_2_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues150( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "汎用ワークテーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?201773171661");
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" ;
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbw01_free_work") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1540( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z51TBW01_SESSION_ID", GXutil.rtrim( Z51TBW01_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z52TBW01_APP_ID", GXutil.rtrim( Z52TBW01_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z53TBW01_DISP_DATETIME", GXutil.rtrim( Z53TBW01_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z54TBW01_LINE_NO", GXutil.ltrim( localUtil.ntoc( Z54TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")));
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

   public String getPgmname( )
   {
      return "TBW01_FREE_WORK" ;
   }

   public String getPgmdesc( )
   {
      return "汎用ワークテーブル" ;
   }

   public void initializeNonKey1540( )
   {
      A685TBW01_FREE_SAVE_1 = "" ;
      n685TBW01_FREE_SAVE_1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A685TBW01_FREE_SAVE_1", A685TBW01_FREE_SAVE_1);
      n685TBW01_FREE_SAVE_1 = ((GXutil.strcmp("", A685TBW01_FREE_SAVE_1)==0) ? true : false) ;
      A686TBW01_FREE_SAVE_2 = "" ;
      n686TBW01_FREE_SAVE_2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A686TBW01_FREE_SAVE_2", A686TBW01_FREE_SAVE_2);
      n686TBW01_FREE_SAVE_2 = ((GXutil.strcmp("", A686TBW01_FREE_SAVE_2)==0) ? true : false) ;
   }

   public void initAll1540( )
   {
      A51TBW01_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A51TBW01_SESSION_ID", A51TBW01_SESSION_ID);
      A52TBW01_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A52TBW01_APP_ID", A52TBW01_APP_ID);
      A53TBW01_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A53TBW01_DISP_DATETIME", A53TBW01_DISP_DATETIME);
      A54TBW01_LINE_NO = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54TBW01_LINE_NO", GXutil.ltrim( GXutil.str( A54TBW01_LINE_NO, 10, 0)));
      initializeNonKey1540( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201773171664");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbw01_free_work.js", "?201773171664");
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
      lblTextblocktbw01_session_id_Internalname = "TEXTBLOCKTBW01_SESSION_ID" ;
      edtTBW01_SESSION_ID_Internalname = "TBW01_SESSION_ID" ;
      lblTextblocktbw01_app_id_Internalname = "TEXTBLOCKTBW01_APP_ID" ;
      edtTBW01_APP_ID_Internalname = "TBW01_APP_ID" ;
      lblTextblocktbw01_disp_datetime_Internalname = "TEXTBLOCKTBW01_DISP_DATETIME" ;
      edtTBW01_DISP_DATETIME_Internalname = "TBW01_DISP_DATETIME" ;
      lblTextblocktbw01_line_no_Internalname = "TEXTBLOCKTBW01_LINE_NO" ;
      edtTBW01_LINE_NO_Internalname = "TBW01_LINE_NO" ;
      lblTextblocktbw01_free_save_1_Internalname = "TEXTBLOCKTBW01_FREE_SAVE_1" ;
      edtTBW01_FREE_SAVE_1_Internalname = "TBW01_FREE_SAVE_1" ;
      lblTextblocktbw01_free_save_2_Internalname = "TEXTBLOCKTBW01_FREE_SAVE_2" ;
      edtTBW01_FREE_SAVE_2_Internalname = "TBW01_FREE_SAVE_2" ;
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
      edtTBW01_FREE_SAVE_2_Enabled = 1 ;
      edtTBW01_FREE_SAVE_1_Enabled = 1 ;
      edtTBW01_LINE_NO_Jsonclick = "" ;
      edtTBW01_LINE_NO_Enabled = 1 ;
      edtTBW01_DISP_DATETIME_Jsonclick = "" ;
      edtTBW01_DISP_DATETIME_Enabled = 1 ;
      edtTBW01_APP_ID_Jsonclick = "" ;
      edtTBW01_APP_ID_Enabled = 1 ;
      edtTBW01_SESSION_ID_Jsonclick = "" ;
      edtTBW01_SESSION_ID_Enabled = 1 ;
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtTBW01_FREE_SAVE_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw01_line_no( String GX_Parm1 ,
                                    String GX_Parm2 ,
                                    String GX_Parm3 ,
                                    long GX_Parm4 ,
                                    String GX_Parm5 ,
                                    String GX_Parm6 )
   {
      A51TBW01_SESSION_ID = GX_Parm1 ;
      A52TBW01_APP_ID = GX_Parm2 ;
      A53TBW01_DISP_DATETIME = GX_Parm3 ;
      A54TBW01_LINE_NO = GX_Parm4 ;
      A685TBW01_FREE_SAVE_1 = GX_Parm5 ;
      n685TBW01_FREE_SAVE_1 = false ;
      A686TBW01_FREE_SAVE_2 = GX_Parm6 ;
      n686TBW01_FREE_SAVE_2 = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A685TBW01_FREE_SAVE_1);
      isValidOutput.add(A686TBW01_FREE_SAVE_2);
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z51TBW01_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z52TBW01_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z53TBW01_DISP_DATETIME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z54TBW01_LINE_NO, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(Z685TBW01_FREE_SAVE_1);
      isValidOutput.add(Z686TBW01_FREE_SAVE_2);
      isValidOutput.add(GXutil.rtrim( ZV8Pgmname));
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
      Z51TBW01_SESSION_ID = "" ;
      Z52TBW01_APP_ID = "" ;
      Z53TBW01_DISP_DATETIME = "" ;
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
      lblTextblocktbw01_session_id_Jsonclick = "" ;
      A51TBW01_SESSION_ID = "" ;
      lblTextblocktbw01_app_id_Jsonclick = "" ;
      A52TBW01_APP_ID = "" ;
      lblTextblocktbw01_disp_datetime_Jsonclick = "" ;
      A53TBW01_DISP_DATETIME = "" ;
      lblTextblocktbw01_line_no_Jsonclick = "" ;
      lblTextblocktbw01_free_save_1_Jsonclick = "" ;
      A685TBW01_FREE_SAVE_1 = "" ;
      lblTextblocktbw01_free_save_2_Jsonclick = "" ;
      A686TBW01_FREE_SAVE_2 = "" ;
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
      Gx_mode = "" ;
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      Z685TBW01_FREE_SAVE_1 = "" ;
      Z686TBW01_FREE_SAVE_2 = "" ;
      T00154_A51TBW01_SESSION_ID = new String[] {""} ;
      T00154_A52TBW01_APP_ID = new String[] {""} ;
      T00154_A53TBW01_DISP_DATETIME = new String[] {""} ;
      T00154_A54TBW01_LINE_NO = new long[1] ;
      T00154_A685TBW01_FREE_SAVE_1 = new String[] {""} ;
      T00154_n685TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      T00154_A686TBW01_FREE_SAVE_2 = new String[] {""} ;
      T00154_n686TBW01_FREE_SAVE_2 = new boolean[] {false} ;
      T00155_A51TBW01_SESSION_ID = new String[] {""} ;
      T00155_A52TBW01_APP_ID = new String[] {""} ;
      T00155_A53TBW01_DISP_DATETIME = new String[] {""} ;
      T00155_A54TBW01_LINE_NO = new long[1] ;
      T00153_A51TBW01_SESSION_ID = new String[] {""} ;
      T00153_A52TBW01_APP_ID = new String[] {""} ;
      T00153_A53TBW01_DISP_DATETIME = new String[] {""} ;
      T00153_A54TBW01_LINE_NO = new long[1] ;
      T00153_A685TBW01_FREE_SAVE_1 = new String[] {""} ;
      T00153_n685TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      T00153_A686TBW01_FREE_SAVE_2 = new String[] {""} ;
      T00153_n686TBW01_FREE_SAVE_2 = new boolean[] {false} ;
      sMode40 = "" ;
      T00156_A51TBW01_SESSION_ID = new String[] {""} ;
      T00156_A52TBW01_APP_ID = new String[] {""} ;
      T00156_A53TBW01_DISP_DATETIME = new String[] {""} ;
      T00156_A54TBW01_LINE_NO = new long[1] ;
      T00157_A51TBW01_SESSION_ID = new String[] {""} ;
      T00157_A52TBW01_APP_ID = new String[] {""} ;
      T00157_A53TBW01_DISP_DATETIME = new String[] {""} ;
      T00157_A54TBW01_LINE_NO = new long[1] ;
      T00152_A51TBW01_SESSION_ID = new String[] {""} ;
      T00152_A52TBW01_APP_ID = new String[] {""} ;
      T00152_A53TBW01_DISP_DATETIME = new String[] {""} ;
      T00152_A54TBW01_LINE_NO = new long[1] ;
      T00152_A685TBW01_FREE_SAVE_1 = new String[] {""} ;
      T00152_n685TBW01_FREE_SAVE_1 = new boolean[] {false} ;
      T00152_A686TBW01_FREE_SAVE_2 = new String[] {""} ;
      T00152_n686TBW01_FREE_SAVE_2 = new boolean[] {false} ;
      T001511_A51TBW01_SESSION_ID = new String[] {""} ;
      T001511_A52TBW01_APP_ID = new String[] {""} ;
      T001511_A53TBW01_DISP_DATETIME = new String[] {""} ;
      T001511_A54TBW01_LINE_NO = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw01_free_work__default(),
         new Object[] {
             new Object[] {
            T00152_A51TBW01_SESSION_ID, T00152_A52TBW01_APP_ID, T00152_A53TBW01_DISP_DATETIME, T00152_A54TBW01_LINE_NO, T00152_A685TBW01_FREE_SAVE_1, T00152_n685TBW01_FREE_SAVE_1, T00152_A686TBW01_FREE_SAVE_2, T00152_n686TBW01_FREE_SAVE_2
            }
            , new Object[] {
            T00153_A51TBW01_SESSION_ID, T00153_A52TBW01_APP_ID, T00153_A53TBW01_DISP_DATETIME, T00153_A54TBW01_LINE_NO, T00153_A685TBW01_FREE_SAVE_1, T00153_n685TBW01_FREE_SAVE_1, T00153_A686TBW01_FREE_SAVE_2, T00153_n686TBW01_FREE_SAVE_2
            }
            , new Object[] {
            T00154_A51TBW01_SESSION_ID, T00154_A52TBW01_APP_ID, T00154_A53TBW01_DISP_DATETIME, T00154_A54TBW01_LINE_NO, T00154_A685TBW01_FREE_SAVE_1, T00154_n685TBW01_FREE_SAVE_1, T00154_A686TBW01_FREE_SAVE_2, T00154_n686TBW01_FREE_SAVE_2
            }
            , new Object[] {
            T00155_A51TBW01_SESSION_ID, T00155_A52TBW01_APP_ID, T00155_A53TBW01_DISP_DATETIME, T00155_A54TBW01_LINE_NO
            }
            , new Object[] {
            T00156_A51TBW01_SESSION_ID, T00156_A52TBW01_APP_ID, T00156_A53TBW01_DISP_DATETIME, T00156_A54TBW01_LINE_NO
            }
            , new Object[] {
            T00157_A51TBW01_SESSION_ID, T00157_A52TBW01_APP_ID, T00157_A53TBW01_DISP_DATETIME, T00157_A54TBW01_LINE_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001511_A51TBW01_SESSION_ID, T001511_A52TBW01_APP_ID, T001511_A53TBW01_DISP_DATETIME, T001511_A54TBW01_LINE_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW01_FREE_WORK" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound40 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW01_SESSION_ID_Enabled ;
   private int edtTBW01_APP_ID_Enabled ;
   private int edtTBW01_DISP_DATETIME_Enabled ;
   private int edtTBW01_LINE_NO_Enabled ;
   private int edtTBW01_FREE_SAVE_1_Enabled ;
   private int edtTBW01_FREE_SAVE_2_Enabled ;
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
   private long Z54TBW01_LINE_NO ;
   private long A54TBW01_LINE_NO ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW01_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw01_session_id_Internalname ;
   private String lblTextblocktbw01_session_id_Jsonclick ;
   private String edtTBW01_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw01_app_id_Internalname ;
   private String lblTextblocktbw01_app_id_Jsonclick ;
   private String edtTBW01_APP_ID_Internalname ;
   private String edtTBW01_APP_ID_Jsonclick ;
   private String lblTextblocktbw01_disp_datetime_Internalname ;
   private String lblTextblocktbw01_disp_datetime_Jsonclick ;
   private String edtTBW01_DISP_DATETIME_Internalname ;
   private String edtTBW01_DISP_DATETIME_Jsonclick ;
   private String lblTextblocktbw01_line_no_Internalname ;
   private String lblTextblocktbw01_line_no_Jsonclick ;
   private String edtTBW01_LINE_NO_Internalname ;
   private String edtTBW01_LINE_NO_Jsonclick ;
   private String lblTextblocktbw01_free_save_1_Internalname ;
   private String lblTextblocktbw01_free_save_1_Jsonclick ;
   private String edtTBW01_FREE_SAVE_1_Internalname ;
   private String lblTextblocktbw01_free_save_2_Internalname ;
   private String lblTextblocktbw01_free_save_2_Jsonclick ;
   private String edtTBW01_FREE_SAVE_2_Internalname ;
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
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode40 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n685TBW01_FREE_SAVE_1 ;
   private boolean n686TBW01_FREE_SAVE_2 ;
   private boolean toggleJsOutput ;
   private String A685TBW01_FREE_SAVE_1 ;
   private String A686TBW01_FREE_SAVE_2 ;
   private String Z685TBW01_FREE_SAVE_1 ;
   private String Z686TBW01_FREE_SAVE_2 ;
   private String Z51TBW01_SESSION_ID ;
   private String Z52TBW01_APP_ID ;
   private String Z53TBW01_DISP_DATETIME ;
   private String A51TBW01_SESSION_ID ;
   private String A52TBW01_APP_ID ;
   private String A53TBW01_DISP_DATETIME ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T00154_A51TBW01_SESSION_ID ;
   private String[] T00154_A52TBW01_APP_ID ;
   private String[] T00154_A53TBW01_DISP_DATETIME ;
   private long[] T00154_A54TBW01_LINE_NO ;
   private String[] T00154_A685TBW01_FREE_SAVE_1 ;
   private boolean[] T00154_n685TBW01_FREE_SAVE_1 ;
   private String[] T00154_A686TBW01_FREE_SAVE_2 ;
   private boolean[] T00154_n686TBW01_FREE_SAVE_2 ;
   private String[] T00155_A51TBW01_SESSION_ID ;
   private String[] T00155_A52TBW01_APP_ID ;
   private String[] T00155_A53TBW01_DISP_DATETIME ;
   private long[] T00155_A54TBW01_LINE_NO ;
   private String[] T00153_A51TBW01_SESSION_ID ;
   private String[] T00153_A52TBW01_APP_ID ;
   private String[] T00153_A53TBW01_DISP_DATETIME ;
   private long[] T00153_A54TBW01_LINE_NO ;
   private String[] T00153_A685TBW01_FREE_SAVE_1 ;
   private boolean[] T00153_n685TBW01_FREE_SAVE_1 ;
   private String[] T00153_A686TBW01_FREE_SAVE_2 ;
   private boolean[] T00153_n686TBW01_FREE_SAVE_2 ;
   private String[] T00156_A51TBW01_SESSION_ID ;
   private String[] T00156_A52TBW01_APP_ID ;
   private String[] T00156_A53TBW01_DISP_DATETIME ;
   private long[] T00156_A54TBW01_LINE_NO ;
   private String[] T00157_A51TBW01_SESSION_ID ;
   private String[] T00157_A52TBW01_APP_ID ;
   private String[] T00157_A53TBW01_DISP_DATETIME ;
   private long[] T00157_A54TBW01_LINE_NO ;
   private String[] T00152_A51TBW01_SESSION_ID ;
   private String[] T00152_A52TBW01_APP_ID ;
   private String[] T00152_A53TBW01_DISP_DATETIME ;
   private long[] T00152_A54TBW01_LINE_NO ;
   private String[] T00152_A685TBW01_FREE_SAVE_1 ;
   private boolean[] T00152_n685TBW01_FREE_SAVE_1 ;
   private String[] T00152_A686TBW01_FREE_SAVE_2 ;
   private boolean[] T00152_n686TBW01_FREE_SAVE_2 ;
   private String[] T001511_A51TBW01_SESSION_ID ;
   private String[] T001511_A52TBW01_APP_ID ;
   private String[] T001511_A53TBW01_DISP_DATETIME ;
   private long[] T001511_A54TBW01_LINE_NO ;
}

final  class tbw01_free_work__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00152", "SELECT `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`, `TBW01_FREE_SAVE_1`, `TBW01_FREE_SAVE_2` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00153", "SELECT `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`, `TBW01_FREE_SAVE_1`, `TBW01_FREE_SAVE_2` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00154", "SELECT TM1.`TBW01_SESSION_ID`, TM1.`TBW01_APP_ID`, TM1.`TBW01_DISP_DATETIME`, TM1.`TBW01_LINE_NO`, TM1.`TBW01_FREE_SAVE_1`, TM1.`TBW01_FREE_SAVE_2` FROM `TBW01_FREE_WORK` TM1 WHERE TM1.`TBW01_SESSION_ID` = ? and TM1.`TBW01_APP_ID` = ? and TM1.`TBW01_DISP_DATETIME` = ? and TM1.`TBW01_LINE_NO` = ? ORDER BY TM1.`TBW01_SESSION_ID`, TM1.`TBW01_APP_ID`, TM1.`TBW01_DISP_DATETIME`, TM1.`TBW01_LINE_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00155", "SELECT `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00156", "SELECT `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE ( `TBW01_SESSION_ID` > ? or `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` > ? or `TBW01_APP_ID` = ? and `TBW01_SESSION_ID` = ? and `TBW01_DISP_DATETIME` > ? or `TBW01_DISP_DATETIME` = ? and `TBW01_APP_ID` = ? and `TBW01_SESSION_ID` = ? and `TBW01_LINE_NO` > ?) ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00157", "SELECT `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` WHERE ( `TBW01_SESSION_ID` < ? or `TBW01_SESSION_ID` = ? and `TBW01_APP_ID` < ? or `TBW01_APP_ID` = ? and `TBW01_SESSION_ID` = ? and `TBW01_DISP_DATETIME` < ? or `TBW01_DISP_DATETIME` = ? and `TBW01_APP_ID` = ? and `TBW01_SESSION_ID` = ? and `TBW01_LINE_NO` < ?) ORDER BY `TBW01_SESSION_ID` DESC, `TBW01_APP_ID` DESC, `TBW01_DISP_DATETIME` DESC, `TBW01_LINE_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00158", "INSERT INTO `TBW01_FREE_WORK`(`TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`, `TBW01_FREE_SAVE_1`, `TBW01_FREE_SAVE_2`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00159", "UPDATE `TBW01_FREE_WORK` SET `TBW01_FREE_SAVE_1`=?, `TBW01_FREE_SAVE_2`=?  WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T001510", "DELETE FROM `TBW01_FREE_WORK`  WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T001511", "SELECT `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` FROM `TBW01_FREE_WORK` ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getLongVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               stmt.setVarchar(4, (String)parms[3], 7, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 14, false);
               stmt.setVarchar(7, (String)parms[6], 14, false);
               stmt.setVarchar(8, (String)parms[7], 7, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               stmt.setVarchar(4, (String)parms[3], 7, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 14, false);
               stmt.setVarchar(7, (String)parms[6], 14, false);
               stmt.setVarchar(8, (String)parms[7], 7, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(5, (String)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(6, (String)parms[7]);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(1, (String)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(2, (String)parms[3]);
               }
               stmt.setVarchar(3, (String)parms[4], 50, false);
               stmt.setVarchar(4, (String)parms[5], 7, false);
               stmt.setVarchar(5, (String)parms[6], 14, false);
               stmt.setLong(6, ((Number) parms[7]).longValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

