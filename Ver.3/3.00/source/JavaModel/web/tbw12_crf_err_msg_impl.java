/*
               File: tbw12_crf_err_msg_impl
        Description: CRF整合性エラーチェックメッセージワークテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:1.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw12_crf_err_msg_impl extends GXWebPanel
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
         Form.getMeta().addItem("description", "CRF整合性エラーチェックメッセージワークテーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbw12_crf_err_msg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw12_crf_err_msg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw12_crf_err_msg_impl.class ));
   }

   public tbw12_crf_err_msg_impl( int remoteHandle ,
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
         wb_table1_2_1D48( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1D48e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1D48( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1D48( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1D48( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1D48e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRF整合性エラーチェックメッセージワークテーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TBW12_CRF_ERR_MSG.htm");
         wb_table3_28_1D48( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1D48e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1D48e( true) ;
      }
      else
      {
         wb_table1_2_1D48e( false) ;
      }
   }

   public void wb_table3_28_1D48( boolean wbgen )
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
         wb_table4_34_1D48( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1D48e( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW12_CRF_ERR_MSG.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW12_CRF_ERR_MSG.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1D48e( true) ;
      }
      else
      {
         wb_table3_28_1D48e( false) ;
      }
   }

   public void wb_table4_34_1D48( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw12_session_id_Internalname, "ID", "", "", lblTextblocktbw12_session_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW12_SESSION_ID_Internalname, GXutil.rtrim( A179TBW12_SESSION_ID), GXutil.rtrim( localUtil.format( A179TBW12_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW12_SESSION_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW12_SESSION_ID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SESSION_ID", "left", "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw12_datetime_Internalname, "実行日時", "", "", lblTextblocktbw12_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW12_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW12_DATETIME_Internalname, localUtil.format(A180TBW12_DATETIME, "99/99/99 99:99"), localUtil.format( A180TBW12_DATETIME, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'YMD',5,24,'jap',false,0);"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW12_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW12_DATETIME_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW12_CRF_ERR_MSG.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW12_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW12_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw12_seq_Internalname, "SEQ番号", "", "", lblTextblocktbw12_seq_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW12_SEQ_Internalname, GXutil.ltrim( localUtil.ntoc( A181TBW12_SEQ, (byte)(4), (byte)(0), ".", "")), ((edtTBW12_SEQ_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A181TBW12_SEQ), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A181TBW12_SEQ), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW12_SEQ_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW12_SEQ_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw12_err_cd_Internalname, "エラーコード", "", "", lblTextblocktbw12_err_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW12_ERR_CD_Internalname, GXutil.ltrim( localUtil.ntoc( A778TBW12_ERR_CD, (byte)(2), (byte)(0), ".", "")), ((edtTBW12_ERR_CD_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A778TBW12_ERR_CD), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A778TBW12_ERR_CD), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW12_ERR_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW12_ERR_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw12_err_div_Internalname, "エラー区分（1：エラー、2：警告）", "", "", lblTextblocktbw12_err_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW12_ERR_DIV_Internalname, GXutil.ltrim( localUtil.ntoc( A776TBW12_ERR_DIV, (byte)(1), (byte)(0), ".", "")), ((edtTBW12_ERR_DIV_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A776TBW12_ERR_DIV), "9")) : localUtil.format( DecimalUtil.doubleToDec(A776TBW12_ERR_DIV), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW12_ERR_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW12_ERR_DIV_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw12_err_msg_Internalname, "エラーメッセージ", "", "", lblTextblocktbw12_err_msg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW12_ERR_MSG_Internalname, GXutil.rtrim( A777TBW12_ERR_MSG), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", (short)(0), 1, edtTBW12_ERR_MSG_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "3000", -1, "", "", (byte)(-1), true, "D_MSG", "HLP_TBW12_CRF_ERR_MSG.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1D48e( true) ;
      }
      else
      {
         wb_table4_34_1D48e( false) ;
      }
   }

   public void wb_table2_5_1D48( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW12_CRF_ERR_MSG.htm");
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
         wb_table2_5_1D48e( true) ;
      }
      else
      {
         wb_table2_5_1D48e( false) ;
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
      /* Execute user event: e111D2 */
      e111D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A179TBW12_SESSION_ID = httpContext.cgiGet( edtTBW12_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW12_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW12_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW12_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A180TBW12_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            else
            {
               A180TBW12_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW12_DATETIME_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW12_SEQ_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW12_SEQ_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW12_SEQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW12_SEQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A181TBW12_SEQ = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
            }
            else
            {
               A181TBW12_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW12_SEQ_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW12_ERR_CD_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW12_ERR_CD_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW12_ERR_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW12_ERR_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A778TBW12_ERR_CD = (byte)(0) ;
               n778TBW12_ERR_CD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A778TBW12_ERR_CD", GXutil.ltrim( GXutil.str( A778TBW12_ERR_CD, 2, 0)));
            }
            else
            {
               A778TBW12_ERR_CD = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW12_ERR_CD_Internalname), ".", ",")) ;
               n778TBW12_ERR_CD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A778TBW12_ERR_CD", GXutil.ltrim( GXutil.str( A778TBW12_ERR_CD, 2, 0)));
            }
            n778TBW12_ERR_CD = ((0==A778TBW12_ERR_CD) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW12_ERR_DIV_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW12_ERR_DIV_Internalname), ".", ",") > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW12_ERR_DIV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW12_ERR_DIV_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A776TBW12_ERR_DIV = (byte)(0) ;
               n776TBW12_ERR_DIV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A776TBW12_ERR_DIV", GXutil.str( A776TBW12_ERR_DIV, 1, 0));
            }
            else
            {
               A776TBW12_ERR_DIV = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW12_ERR_DIV_Internalname), ".", ",")) ;
               n776TBW12_ERR_DIV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A776TBW12_ERR_DIV", GXutil.str( A776TBW12_ERR_DIV, 1, 0));
            }
            n776TBW12_ERR_DIV = ((0==A776TBW12_ERR_DIV) ? true : false) ;
            A777TBW12_ERR_MSG = httpContext.cgiGet( edtTBW12_ERR_MSG_Internalname) ;
            n777TBW12_ERR_MSG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A777TBW12_ERR_MSG", A777TBW12_ERR_MSG);
            n777TBW12_ERR_MSG = ((GXutil.strcmp("", A777TBW12_ERR_MSG)==0) ? true : false) ;
            /* Read saved values. */
            Z179TBW12_SESSION_ID = httpContext.cgiGet( "Z179TBW12_SESSION_ID") ;
            Z180TBW12_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z180TBW12_DATETIME"), 0) ;
            Z181TBW12_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( "Z181TBW12_SEQ"), ".", ",")) ;
            Z778TBW12_ERR_CD = (byte)(localUtil.ctol( httpContext.cgiGet( "Z778TBW12_ERR_CD"), ".", ",")) ;
            n778TBW12_ERR_CD = ((0==A778TBW12_ERR_CD) ? true : false) ;
            Z776TBW12_ERR_DIV = (byte)(localUtil.ctol( httpContext.cgiGet( "Z776TBW12_ERR_DIV"), ".", ",")) ;
            n776TBW12_ERR_DIV = ((0==A776TBW12_ERR_DIV) ? true : false) ;
            Z777TBW12_ERR_MSG = httpContext.cgiGet( "Z777TBW12_ERR_MSG") ;
            n777TBW12_ERR_MSG = ((GXutil.strcmp("", A777TBW12_ERR_MSG)==0) ? true : false) ;
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
               A179TBW12_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
               A180TBW12_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A181TBW12_SEQ = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
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
                     /* Execute user event: e111D2 */
                     e111D2 ();
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
            initAll1D48( ) ;
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
      disableAttributes1D48( ) ;
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

   public void resetCaption1D0( )
   {
   }

   public void e111D2( )
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

   public void zm1D48( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z778TBW12_ERR_CD = T001D3_A778TBW12_ERR_CD[0] ;
            Z776TBW12_ERR_DIV = T001D3_A776TBW12_ERR_DIV[0] ;
            Z777TBW12_ERR_MSG = T001D3_A777TBW12_ERR_MSG[0] ;
         }
         else
         {
            Z778TBW12_ERR_CD = A778TBW12_ERR_CD ;
            Z776TBW12_ERR_DIV = A776TBW12_ERR_DIV ;
            Z777TBW12_ERR_MSG = A777TBW12_ERR_MSG ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z179TBW12_SESSION_ID = A179TBW12_SESSION_ID ;
         Z180TBW12_DATETIME = A180TBW12_DATETIME ;
         Z181TBW12_SEQ = A181TBW12_SEQ ;
         Z778TBW12_ERR_CD = A778TBW12_ERR_CD ;
         Z776TBW12_ERR_DIV = A776TBW12_ERR_DIV ;
         Z777TBW12_ERR_MSG = A777TBW12_ERR_MSG ;
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

   public void load1D48( )
   {
      /* Using cursor T001D4 */
      pr_default.execute(2, new Object[] {A179TBW12_SESSION_ID, A180TBW12_DATETIME, new Short(A181TBW12_SEQ)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound48 = (short)(1) ;
         A778TBW12_ERR_CD = T001D4_A778TBW12_ERR_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A778TBW12_ERR_CD", GXutil.ltrim( GXutil.str( A778TBW12_ERR_CD, 2, 0)));
         n778TBW12_ERR_CD = T001D4_n778TBW12_ERR_CD[0] ;
         A776TBW12_ERR_DIV = T001D4_A776TBW12_ERR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A776TBW12_ERR_DIV", GXutil.str( A776TBW12_ERR_DIV, 1, 0));
         n776TBW12_ERR_DIV = T001D4_n776TBW12_ERR_DIV[0] ;
         A777TBW12_ERR_MSG = T001D4_A777TBW12_ERR_MSG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A777TBW12_ERR_MSG", A777TBW12_ERR_MSG);
         n777TBW12_ERR_MSG = T001D4_n777TBW12_ERR_MSG[0] ;
         zm1D48( -2) ;
      }
      pr_default.close(2);
      onLoadActions1D48( ) ;
   }

   public void onLoadActions1D48( )
   {
      AV8Pgmname = "TBW12_CRF_ERR_MSG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1D48( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW12_CRF_ERR_MSG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      if ( ! ( GXutil.nullDate().equals(A180TBW12_DATETIME) || (( A180TBW12_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A180TBW12_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　実行日時 は範囲外です", "OutOfRange", 1, "TBW12_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW12_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1D48( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1D48( )
   {
      /* Using cursor T001D5 */
      pr_default.execute(3, new Object[] {A179TBW12_SESSION_ID, A180TBW12_DATETIME, new Short(A181TBW12_SEQ)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound48 = (short)(1) ;
      }
      else
      {
         RcdFound48 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001D3 */
      pr_default.execute(1, new Object[] {A179TBW12_SESSION_ID, A180TBW12_DATETIME, new Short(A181TBW12_SEQ)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1D48( 2) ;
         RcdFound48 = (short)(1) ;
         A179TBW12_SESSION_ID = T001D3_A179TBW12_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
         A180TBW12_DATETIME = T001D3_A180TBW12_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A181TBW12_SEQ = T001D3_A181TBW12_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
         A778TBW12_ERR_CD = T001D3_A778TBW12_ERR_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A778TBW12_ERR_CD", GXutil.ltrim( GXutil.str( A778TBW12_ERR_CD, 2, 0)));
         n778TBW12_ERR_CD = T001D3_n778TBW12_ERR_CD[0] ;
         A776TBW12_ERR_DIV = T001D3_A776TBW12_ERR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A776TBW12_ERR_DIV", GXutil.str( A776TBW12_ERR_DIV, 1, 0));
         n776TBW12_ERR_DIV = T001D3_n776TBW12_ERR_DIV[0] ;
         A777TBW12_ERR_MSG = T001D3_A777TBW12_ERR_MSG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A777TBW12_ERR_MSG", A777TBW12_ERR_MSG);
         n777TBW12_ERR_MSG = T001D3_n777TBW12_ERR_MSG[0] ;
         Z179TBW12_SESSION_ID = A179TBW12_SESSION_ID ;
         Z180TBW12_DATETIME = A180TBW12_DATETIME ;
         Z181TBW12_SEQ = A181TBW12_SEQ ;
         sMode48 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1D48( ) ;
         if ( AnyError == 1 )
         {
            RcdFound48 = (short)(0) ;
            initializeNonKey1D48( ) ;
         }
         Gx_mode = sMode48 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound48 = (short)(0) ;
         initializeNonKey1D48( ) ;
         sMode48 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode48 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1D48( ) ;
      if ( RcdFound48 == 0 )
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
      RcdFound48 = (short)(0) ;
      /* Using cursor T001D6 */
      pr_default.execute(4, new Object[] {A179TBW12_SESSION_ID, A179TBW12_SESSION_ID, A180TBW12_DATETIME, A180TBW12_DATETIME, A179TBW12_SESSION_ID, new Short(A181TBW12_SEQ)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001D6_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001D6_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) == 0 ) && T001D6_A180TBW12_DATETIME[0].before( A180TBW12_DATETIME ) || T001D6_A180TBW12_DATETIME[0].equals( A180TBW12_DATETIME ) && ( GXutil.strcmp(T001D6_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) == 0 ) && ( T001D6_A181TBW12_SEQ[0] < A181TBW12_SEQ ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001D6_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001D6_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) == 0 ) && T001D6_A180TBW12_DATETIME[0].after( A180TBW12_DATETIME ) || T001D6_A180TBW12_DATETIME[0].equals( A180TBW12_DATETIME ) && ( GXutil.strcmp(T001D6_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) == 0 ) && ( T001D6_A181TBW12_SEQ[0] > A181TBW12_SEQ ) ) )
         {
            A179TBW12_SESSION_ID = T001D6_A179TBW12_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
            A180TBW12_DATETIME = T001D6_A180TBW12_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A181TBW12_SEQ = T001D6_A181TBW12_SEQ[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
            RcdFound48 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound48 = (short)(0) ;
      /* Using cursor T001D7 */
      pr_default.execute(5, new Object[] {A179TBW12_SESSION_ID, A179TBW12_SESSION_ID, A180TBW12_DATETIME, A180TBW12_DATETIME, A179TBW12_SESSION_ID, new Short(A181TBW12_SEQ)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001D7_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001D7_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) == 0 ) && T001D7_A180TBW12_DATETIME[0].after( A180TBW12_DATETIME ) || T001D7_A180TBW12_DATETIME[0].equals( A180TBW12_DATETIME ) && ( GXutil.strcmp(T001D7_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) == 0 ) && ( T001D7_A181TBW12_SEQ[0] > A181TBW12_SEQ ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001D7_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001D7_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) == 0 ) && T001D7_A180TBW12_DATETIME[0].before( A180TBW12_DATETIME ) || T001D7_A180TBW12_DATETIME[0].equals( A180TBW12_DATETIME ) && ( GXutil.strcmp(T001D7_A179TBW12_SESSION_ID[0], A179TBW12_SESSION_ID) == 0 ) && ( T001D7_A181TBW12_SEQ[0] < A181TBW12_SEQ ) ) )
         {
            A179TBW12_SESSION_ID = T001D7_A179TBW12_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
            A180TBW12_DATETIME = T001D7_A180TBW12_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A181TBW12_SEQ = T001D7_A181TBW12_SEQ[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
            RcdFound48 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1D48( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1D48( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound48 == 1 )
         {
            if ( ( GXutil.strcmp(A179TBW12_SESSION_ID, Z179TBW12_SESSION_ID) != 0 ) || !( A180TBW12_DATETIME.equals( Z180TBW12_DATETIME ) ) || ( A181TBW12_SEQ != Z181TBW12_SEQ ) )
            {
               A179TBW12_SESSION_ID = Z179TBW12_SESSION_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
               A180TBW12_DATETIME = Z180TBW12_DATETIME ;
               httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A181TBW12_SEQ = Z181TBW12_SEQ ;
               httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW12_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1D48( ) ;
               GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A179TBW12_SESSION_ID, Z179TBW12_SESSION_ID) != 0 ) || !( A180TBW12_DATETIME.equals( Z180TBW12_DATETIME ) ) || ( A181TBW12_SEQ != Z181TBW12_SEQ ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1D48( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW12_SESSION_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1D48( ) ;
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
      if ( ( GXutil.strcmp(A179TBW12_SESSION_ID, Z179TBW12_SESSION_ID) != 0 ) || !( A180TBW12_DATETIME.equals( Z180TBW12_DATETIME ) ) || ( A181TBW12_SEQ != Z181TBW12_SEQ ) )
      {
         A179TBW12_SESSION_ID = Z179TBW12_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
         A180TBW12_DATETIME = Z180TBW12_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A181TBW12_SEQ = Z181TBW12_SEQ ;
         httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW12_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
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
      if ( RcdFound48 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW12_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW12_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBW12_ERR_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1D48( ) ;
      if ( RcdFound48 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW12_ERR_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1D48( ) ;
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
      if ( RcdFound48 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW12_ERR_CD_Internalname ;
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
      if ( RcdFound48 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW12_ERR_CD_Internalname ;
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
      scanStart1D48( ) ;
      if ( RcdFound48 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound48 != 0 )
         {
            scanNext1D48( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW12_ERR_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1D48( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1D48( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001D2 */
         pr_default.execute(0, new Object[] {A179TBW12_SESSION_ID, A180TBW12_DATETIME, new Short(A181TBW12_SEQ)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW12_CRF_ERR_MSG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z778TBW12_ERR_CD != T001D2_A778TBW12_ERR_CD[0] ) || ( Z776TBW12_ERR_DIV != T001D2_A776TBW12_ERR_DIV[0] ) || ( GXutil.strcmp(Z777TBW12_ERR_MSG, T001D2_A777TBW12_ERR_MSG[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW12_CRF_ERR_MSG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1D48( )
   {
      beforeValidate1D48( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1D48( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1D48( 0) ;
         checkOptimisticConcurrency1D48( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1D48( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1D48( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001D8 */
                  pr_default.execute(6, new Object[] {A179TBW12_SESSION_ID, A180TBW12_DATETIME, new Short(A181TBW12_SEQ), new Boolean(n778TBW12_ERR_CD), new Byte(A778TBW12_ERR_CD), new Boolean(n776TBW12_ERR_DIV), new Byte(A776TBW12_ERR_DIV), new Boolean(n777TBW12_ERR_MSG), A777TBW12_ERR_MSG});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW12_CRF_ERR_MSG") ;
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
                        resetCaption1D0( ) ;
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
            load1D48( ) ;
         }
         endLevel1D48( ) ;
      }
      closeExtendedTableCursors1D48( ) ;
   }

   public void update1D48( )
   {
      beforeValidate1D48( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1D48( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1D48( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1D48( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1D48( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001D9 */
                  pr_default.execute(7, new Object[] {new Boolean(n778TBW12_ERR_CD), new Byte(A778TBW12_ERR_CD), new Boolean(n776TBW12_ERR_DIV), new Byte(A776TBW12_ERR_DIV), new Boolean(n777TBW12_ERR_MSG), A777TBW12_ERR_MSG, A179TBW12_SESSION_ID, A180TBW12_DATETIME, new Short(A181TBW12_SEQ)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW12_CRF_ERR_MSG") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW12_CRF_ERR_MSG"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1D48( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption1D0( ) ;
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
         endLevel1D48( ) ;
      }
      closeExtendedTableCursors1D48( ) ;
   }

   public void deferredUpdate1D48( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1D48( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1D48( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1D48( ) ;
         afterConfirm1D48( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1D48( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001D10 */
               pr_default.execute(8, new Object[] {A179TBW12_SESSION_ID, A180TBW12_DATETIME, new Short(A181TBW12_SEQ)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW12_CRF_ERR_MSG") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound48 == 0 )
                     {
                        initAll1D48( ) ;
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
                     resetCaption1D0( ) ;
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
      sMode48 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1D48( ) ;
      Gx_mode = sMode48 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1D48( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW12_CRF_ERR_MSG" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel1D48( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1D48( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw12_crf_err_msg");
         if ( AnyError == 0 )
         {
            confirmValues1D0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw12_crf_err_msg");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1D48( )
   {
      /* Scan By routine */
      /* Using cursor T001D11 */
      pr_default.execute(9);
      RcdFound48 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound48 = (short)(1) ;
         A179TBW12_SESSION_ID = T001D11_A179TBW12_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
         A180TBW12_DATETIME = T001D11_A180TBW12_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A181TBW12_SEQ = T001D11_A181TBW12_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1D48( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound48 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound48 = (short)(1) ;
         A179TBW12_SESSION_ID = T001D11_A179TBW12_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
         A180TBW12_DATETIME = T001D11_A180TBW12_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A181TBW12_SEQ = T001D11_A181TBW12_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
      }
   }

   public void scanEnd1D48( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1D48( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1D48( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1D48( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1D48( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1D48( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1D48( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1D48( )
   {
      edtTBW12_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW12_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW12_SESSION_ID_Enabled, 5, 0)));
      edtTBW12_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW12_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW12_DATETIME_Enabled, 5, 0)));
      edtTBW12_SEQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW12_SEQ_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW12_SEQ_Enabled, 5, 0)));
      edtTBW12_ERR_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW12_ERR_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW12_ERR_CD_Enabled, 5, 0)));
      edtTBW12_ERR_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW12_ERR_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW12_ERR_DIV_Enabled, 5, 0)));
      edtTBW12_ERR_MSG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW12_ERR_MSG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW12_ERR_MSG_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1D0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRF整合性エラーチェックメッセージワークテーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151322176");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbw12_crf_err_msg") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1D48( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z179TBW12_SESSION_ID", GXutil.rtrim( Z179TBW12_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z180TBW12_DATETIME", localUtil.ttoc( Z180TBW12_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z181TBW12_SEQ", GXutil.ltrim( localUtil.ntoc( Z181TBW12_SEQ, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z778TBW12_ERR_CD", GXutil.ltrim( localUtil.ntoc( Z778TBW12_ERR_CD, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z776TBW12_ERR_DIV", GXutil.ltrim( localUtil.ntoc( Z776TBW12_ERR_DIV, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z777TBW12_ERR_MSG", GXutil.rtrim( Z777TBW12_ERR_MSG));
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
      return "TBW12_CRF_ERR_MSG" ;
   }

   public String getPgmdesc( )
   {
      return "CRF整合性エラーチェックメッセージワークテーブル" ;
   }

   public void initializeNonKey1D48( )
   {
      A778TBW12_ERR_CD = (byte)(0) ;
      n778TBW12_ERR_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A778TBW12_ERR_CD", GXutil.ltrim( GXutil.str( A778TBW12_ERR_CD, 2, 0)));
      n778TBW12_ERR_CD = ((0==A778TBW12_ERR_CD) ? true : false) ;
      A776TBW12_ERR_DIV = (byte)(0) ;
      n776TBW12_ERR_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A776TBW12_ERR_DIV", GXutil.str( A776TBW12_ERR_DIV, 1, 0));
      n776TBW12_ERR_DIV = ((0==A776TBW12_ERR_DIV) ? true : false) ;
      A777TBW12_ERR_MSG = "" ;
      n777TBW12_ERR_MSG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A777TBW12_ERR_MSG", A777TBW12_ERR_MSG);
      n777TBW12_ERR_MSG = ((GXutil.strcmp("", A777TBW12_ERR_MSG)==0) ? true : false) ;
   }

   public void initAll1D48( )
   {
      A179TBW12_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A179TBW12_SESSION_ID", A179TBW12_SESSION_ID);
      A180TBW12_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A180TBW12_DATETIME", localUtil.ttoc( A180TBW12_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      A181TBW12_SEQ = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A181TBW12_SEQ", GXutil.ltrim( GXutil.str( A181TBW12_SEQ, 4, 0)));
      initializeNonKey1D48( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151322178");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbw12_crf_err_msg.js", "?20207151322178");
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
      lblTextblocktbw12_session_id_Internalname = "TEXTBLOCKTBW12_SESSION_ID" ;
      edtTBW12_SESSION_ID_Internalname = "TBW12_SESSION_ID" ;
      lblTextblocktbw12_datetime_Internalname = "TEXTBLOCKTBW12_DATETIME" ;
      edtTBW12_DATETIME_Internalname = "TBW12_DATETIME" ;
      lblTextblocktbw12_seq_Internalname = "TEXTBLOCKTBW12_SEQ" ;
      edtTBW12_SEQ_Internalname = "TBW12_SEQ" ;
      lblTextblocktbw12_err_cd_Internalname = "TEXTBLOCKTBW12_ERR_CD" ;
      edtTBW12_ERR_CD_Internalname = "TBW12_ERR_CD" ;
      lblTextblocktbw12_err_div_Internalname = "TEXTBLOCKTBW12_ERR_DIV" ;
      edtTBW12_ERR_DIV_Internalname = "TBW12_ERR_DIV" ;
      lblTextblocktbw12_err_msg_Internalname = "TEXTBLOCKTBW12_ERR_MSG" ;
      edtTBW12_ERR_MSG_Internalname = "TBW12_ERR_MSG" ;
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
      edtTBW12_ERR_MSG_Enabled = 1 ;
      edtTBW12_ERR_DIV_Jsonclick = "" ;
      edtTBW12_ERR_DIV_Enabled = 1 ;
      edtTBW12_ERR_CD_Jsonclick = "" ;
      edtTBW12_ERR_CD_Enabled = 1 ;
      edtTBW12_SEQ_Jsonclick = "" ;
      edtTBW12_SEQ_Enabled = 1 ;
      edtTBW12_DATETIME_Jsonclick = "" ;
      edtTBW12_DATETIME_Enabled = 1 ;
      edtTBW12_SESSION_ID_Jsonclick = "" ;
      edtTBW12_SESSION_ID_Enabled = 1 ;
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
      GX_FocusControl = edtTBW12_ERR_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw12_seq( String GX_Parm1 ,
                                java.util.Date GX_Parm2 ,
                                short GX_Parm3 ,
                                byte GX_Parm4 ,
                                byte GX_Parm5 ,
                                String GX_Parm6 )
   {
      A179TBW12_SESSION_ID = GX_Parm1 ;
      A180TBW12_DATETIME = GX_Parm2 ;
      A181TBW12_SEQ = GX_Parm3 ;
      A778TBW12_ERR_CD = GX_Parm4 ;
      n778TBW12_ERR_CD = false ;
      A776TBW12_ERR_DIV = GX_Parm5 ;
      n776TBW12_ERR_DIV = false ;
      A777TBW12_ERR_MSG = GX_Parm6 ;
      n777TBW12_ERR_MSG = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A778TBW12_ERR_CD, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A776TBW12_ERR_DIV, (byte)(1), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A777TBW12_ERR_MSG));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z179TBW12_SESSION_ID));
      isValidOutput.add(localUtil.ttoc( Z180TBW12_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z181TBW12_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z778TBW12_ERR_CD, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z776TBW12_ERR_DIV, (byte)(1), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z777TBW12_ERR_MSG));
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
      Z179TBW12_SESSION_ID = "" ;
      Z180TBW12_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z777TBW12_ERR_MSG = "" ;
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
      lblTextblocktbw12_session_id_Jsonclick = "" ;
      A179TBW12_SESSION_ID = "" ;
      lblTextblocktbw12_datetime_Jsonclick = "" ;
      A180TBW12_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw12_seq_Jsonclick = "" ;
      lblTextblocktbw12_err_cd_Jsonclick = "" ;
      lblTextblocktbw12_err_div_Jsonclick = "" ;
      lblTextblocktbw12_err_msg_Jsonclick = "" ;
      A777TBW12_ERR_MSG = "" ;
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
      T001D4_A179TBW12_SESSION_ID = new String[] {""} ;
      T001D4_A180TBW12_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001D4_A181TBW12_SEQ = new short[1] ;
      T001D4_A778TBW12_ERR_CD = new byte[1] ;
      T001D4_n778TBW12_ERR_CD = new boolean[] {false} ;
      T001D4_A776TBW12_ERR_DIV = new byte[1] ;
      T001D4_n776TBW12_ERR_DIV = new boolean[] {false} ;
      T001D4_A777TBW12_ERR_MSG = new String[] {""} ;
      T001D4_n777TBW12_ERR_MSG = new boolean[] {false} ;
      T001D5_A179TBW12_SESSION_ID = new String[] {""} ;
      T001D5_A180TBW12_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001D5_A181TBW12_SEQ = new short[1] ;
      T001D3_A179TBW12_SESSION_ID = new String[] {""} ;
      T001D3_A180TBW12_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001D3_A181TBW12_SEQ = new short[1] ;
      T001D3_A778TBW12_ERR_CD = new byte[1] ;
      T001D3_n778TBW12_ERR_CD = new boolean[] {false} ;
      T001D3_A776TBW12_ERR_DIV = new byte[1] ;
      T001D3_n776TBW12_ERR_DIV = new boolean[] {false} ;
      T001D3_A777TBW12_ERR_MSG = new String[] {""} ;
      T001D3_n777TBW12_ERR_MSG = new boolean[] {false} ;
      sMode48 = "" ;
      T001D6_A179TBW12_SESSION_ID = new String[] {""} ;
      T001D6_A180TBW12_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001D6_A181TBW12_SEQ = new short[1] ;
      T001D7_A179TBW12_SESSION_ID = new String[] {""} ;
      T001D7_A180TBW12_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001D7_A181TBW12_SEQ = new short[1] ;
      T001D2_A179TBW12_SESSION_ID = new String[] {""} ;
      T001D2_A180TBW12_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001D2_A181TBW12_SEQ = new short[1] ;
      T001D2_A778TBW12_ERR_CD = new byte[1] ;
      T001D2_n778TBW12_ERR_CD = new boolean[] {false} ;
      T001D2_A776TBW12_ERR_DIV = new byte[1] ;
      T001D2_n776TBW12_ERR_DIV = new boolean[] {false} ;
      T001D2_A777TBW12_ERR_MSG = new String[] {""} ;
      T001D2_n777TBW12_ERR_MSG = new boolean[] {false} ;
      T001D11_A179TBW12_SESSION_ID = new String[] {""} ;
      T001D11_A180TBW12_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001D11_A181TBW12_SEQ = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw12_crf_err_msg__default(),
         new Object[] {
             new Object[] {
            T001D2_A179TBW12_SESSION_ID, T001D2_A180TBW12_DATETIME, T001D2_A181TBW12_SEQ, T001D2_A778TBW12_ERR_CD, T001D2_n778TBW12_ERR_CD, T001D2_A776TBW12_ERR_DIV, T001D2_n776TBW12_ERR_DIV, T001D2_A777TBW12_ERR_MSG, T001D2_n777TBW12_ERR_MSG
            }
            , new Object[] {
            T001D3_A179TBW12_SESSION_ID, T001D3_A180TBW12_DATETIME, T001D3_A181TBW12_SEQ, T001D3_A778TBW12_ERR_CD, T001D3_n778TBW12_ERR_CD, T001D3_A776TBW12_ERR_DIV, T001D3_n776TBW12_ERR_DIV, T001D3_A777TBW12_ERR_MSG, T001D3_n777TBW12_ERR_MSG
            }
            , new Object[] {
            T001D4_A179TBW12_SESSION_ID, T001D4_A180TBW12_DATETIME, T001D4_A181TBW12_SEQ, T001D4_A778TBW12_ERR_CD, T001D4_n778TBW12_ERR_CD, T001D4_A776TBW12_ERR_DIV, T001D4_n776TBW12_ERR_DIV, T001D4_A777TBW12_ERR_MSG, T001D4_n777TBW12_ERR_MSG
            }
            , new Object[] {
            T001D5_A179TBW12_SESSION_ID, T001D5_A180TBW12_DATETIME, T001D5_A181TBW12_SEQ
            }
            , new Object[] {
            T001D6_A179TBW12_SESSION_ID, T001D6_A180TBW12_DATETIME, T001D6_A181TBW12_SEQ
            }
            , new Object[] {
            T001D7_A179TBW12_SESSION_ID, T001D7_A180TBW12_DATETIME, T001D7_A181TBW12_SEQ
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001D11_A179TBW12_SESSION_ID, T001D11_A180TBW12_DATETIME, T001D11_A181TBW12_SEQ
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW12_CRF_ERR_MSG" ;
   }

   private byte Z778TBW12_ERR_CD ;
   private byte Z776TBW12_ERR_DIV ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A778TBW12_ERR_CD ;
   private byte A776TBW12_ERR_DIV ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z181TBW12_SEQ ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A181TBW12_SEQ ;
   private short RcdFound48 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW12_SESSION_ID_Enabled ;
   private int edtTBW12_DATETIME_Enabled ;
   private int edtTBW12_SEQ_Enabled ;
   private int edtTBW12_ERR_CD_Enabled ;
   private int edtTBW12_ERR_DIV_Enabled ;
   private int edtTBW12_ERR_MSG_Enabled ;
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
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW12_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw12_session_id_Internalname ;
   private String lblTextblocktbw12_session_id_Jsonclick ;
   private String edtTBW12_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw12_datetime_Internalname ;
   private String lblTextblocktbw12_datetime_Jsonclick ;
   private String edtTBW12_DATETIME_Internalname ;
   private String edtTBW12_DATETIME_Jsonclick ;
   private String lblTextblocktbw12_seq_Internalname ;
   private String lblTextblocktbw12_seq_Jsonclick ;
   private String edtTBW12_SEQ_Internalname ;
   private String edtTBW12_SEQ_Jsonclick ;
   private String lblTextblocktbw12_err_cd_Internalname ;
   private String lblTextblocktbw12_err_cd_Jsonclick ;
   private String edtTBW12_ERR_CD_Internalname ;
   private String edtTBW12_ERR_CD_Jsonclick ;
   private String lblTextblocktbw12_err_div_Internalname ;
   private String lblTextblocktbw12_err_div_Jsonclick ;
   private String edtTBW12_ERR_DIV_Internalname ;
   private String edtTBW12_ERR_DIV_Jsonclick ;
   private String lblTextblocktbw12_err_msg_Internalname ;
   private String lblTextblocktbw12_err_msg_Jsonclick ;
   private String edtTBW12_ERR_MSG_Internalname ;
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
   private String sMode48 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z180TBW12_DATETIME ;
   private java.util.Date A180TBW12_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n778TBW12_ERR_CD ;
   private boolean n776TBW12_ERR_DIV ;
   private boolean n777TBW12_ERR_MSG ;
   private boolean toggleJsOutput ;
   private String Z179TBW12_SESSION_ID ;
   private String Z777TBW12_ERR_MSG ;
   private String A179TBW12_SESSION_ID ;
   private String A777TBW12_ERR_MSG ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001D4_A179TBW12_SESSION_ID ;
   private java.util.Date[] T001D4_A180TBW12_DATETIME ;
   private short[] T001D4_A181TBW12_SEQ ;
   private byte[] T001D4_A778TBW12_ERR_CD ;
   private boolean[] T001D4_n778TBW12_ERR_CD ;
   private byte[] T001D4_A776TBW12_ERR_DIV ;
   private boolean[] T001D4_n776TBW12_ERR_DIV ;
   private String[] T001D4_A777TBW12_ERR_MSG ;
   private boolean[] T001D4_n777TBW12_ERR_MSG ;
   private String[] T001D5_A179TBW12_SESSION_ID ;
   private java.util.Date[] T001D5_A180TBW12_DATETIME ;
   private short[] T001D5_A181TBW12_SEQ ;
   private String[] T001D3_A179TBW12_SESSION_ID ;
   private java.util.Date[] T001D3_A180TBW12_DATETIME ;
   private short[] T001D3_A181TBW12_SEQ ;
   private byte[] T001D3_A778TBW12_ERR_CD ;
   private boolean[] T001D3_n778TBW12_ERR_CD ;
   private byte[] T001D3_A776TBW12_ERR_DIV ;
   private boolean[] T001D3_n776TBW12_ERR_DIV ;
   private String[] T001D3_A777TBW12_ERR_MSG ;
   private boolean[] T001D3_n777TBW12_ERR_MSG ;
   private String[] T001D6_A179TBW12_SESSION_ID ;
   private java.util.Date[] T001D6_A180TBW12_DATETIME ;
   private short[] T001D6_A181TBW12_SEQ ;
   private String[] T001D7_A179TBW12_SESSION_ID ;
   private java.util.Date[] T001D7_A180TBW12_DATETIME ;
   private short[] T001D7_A181TBW12_SEQ ;
   private String[] T001D2_A179TBW12_SESSION_ID ;
   private java.util.Date[] T001D2_A180TBW12_DATETIME ;
   private short[] T001D2_A181TBW12_SEQ ;
   private byte[] T001D2_A778TBW12_ERR_CD ;
   private boolean[] T001D2_n778TBW12_ERR_CD ;
   private byte[] T001D2_A776TBW12_ERR_DIV ;
   private boolean[] T001D2_n776TBW12_ERR_DIV ;
   private String[] T001D2_A777TBW12_ERR_MSG ;
   private boolean[] T001D2_n777TBW12_ERR_MSG ;
   private String[] T001D11_A179TBW12_SESSION_ID ;
   private java.util.Date[] T001D11_A180TBW12_DATETIME ;
   private short[] T001D11_A181TBW12_SEQ ;
}

final  class tbw12_crf_err_msg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001D2", "SELECT `TBW12_SESSION_ID`, `TBW12_DATETIME`, `TBW12_SEQ`, `TBW12_ERR_CD`, `TBW12_ERR_DIV`, `TBW12_ERR_MSG` FROM `TBW12_CRF_ERR_MSG` WHERE `TBW12_SESSION_ID` = ? AND `TBW12_DATETIME` = ? AND `TBW12_SEQ` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001D3", "SELECT `TBW12_SESSION_ID`, `TBW12_DATETIME`, `TBW12_SEQ`, `TBW12_ERR_CD`, `TBW12_ERR_DIV`, `TBW12_ERR_MSG` FROM `TBW12_CRF_ERR_MSG` WHERE `TBW12_SESSION_ID` = ? AND `TBW12_DATETIME` = ? AND `TBW12_SEQ` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001D4", "SELECT TM1.`TBW12_SESSION_ID`, TM1.`TBW12_DATETIME`, TM1.`TBW12_SEQ`, TM1.`TBW12_ERR_CD`, TM1.`TBW12_ERR_DIV`, TM1.`TBW12_ERR_MSG` FROM `TBW12_CRF_ERR_MSG` TM1 WHERE TM1.`TBW12_SESSION_ID` = ? and TM1.`TBW12_DATETIME` = ? and TM1.`TBW12_SEQ` = ? ORDER BY TM1.`TBW12_SESSION_ID`, TM1.`TBW12_DATETIME`, TM1.`TBW12_SEQ` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001D5", "SELECT `TBW12_SESSION_ID`, `TBW12_DATETIME`, `TBW12_SEQ` FROM `TBW12_CRF_ERR_MSG` WHERE `TBW12_SESSION_ID` = ? AND `TBW12_DATETIME` = ? AND `TBW12_SEQ` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001D6", "SELECT `TBW12_SESSION_ID`, `TBW12_DATETIME`, `TBW12_SEQ` FROM `TBW12_CRF_ERR_MSG` WHERE ( `TBW12_SESSION_ID` > ? or `TBW12_SESSION_ID` = ? and `TBW12_DATETIME` > ? or `TBW12_DATETIME` = ? and `TBW12_SESSION_ID` = ? and `TBW12_SEQ` > ?) ORDER BY `TBW12_SESSION_ID`, `TBW12_DATETIME`, `TBW12_SEQ`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001D7", "SELECT `TBW12_SESSION_ID`, `TBW12_DATETIME`, `TBW12_SEQ` FROM `TBW12_CRF_ERR_MSG` WHERE ( `TBW12_SESSION_ID` < ? or `TBW12_SESSION_ID` = ? and `TBW12_DATETIME` < ? or `TBW12_DATETIME` = ? and `TBW12_SESSION_ID` = ? and `TBW12_SEQ` < ?) ORDER BY `TBW12_SESSION_ID` DESC, `TBW12_DATETIME` DESC, `TBW12_SEQ` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001D8", "INSERT INTO `TBW12_CRF_ERR_MSG`(`TBW12_SESSION_ID`, `TBW12_DATETIME`, `TBW12_SEQ`, `TBW12_ERR_CD`, `TBW12_ERR_DIV`, `TBW12_ERR_MSG`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001D9", "UPDATE `TBW12_CRF_ERR_MSG` SET `TBW12_ERR_CD`=?, `TBW12_ERR_DIV`=?, `TBW12_ERR_MSG`=?  WHERE `TBW12_SESSION_ID` = ? AND `TBW12_DATETIME` = ? AND `TBW12_SEQ` = ?", GX_NOMASK)
         ,new UpdateCursor("T001D10", "DELETE FROM `TBW12_CRF_ERR_MSG`  WHERE `TBW12_SESSION_ID` = ? AND `TBW12_DATETIME` = ? AND `TBW12_SEQ` = ?", GX_NOMASK)
         ,new ForEachCursor("T001D11", "SELECT `TBW12_SESSION_ID`, `TBW12_DATETIME`, `TBW12_SEQ` FROM `TBW12_CRF_ERR_MSG` ORDER BY `TBW12_SESSION_ID`, `TBW12_DATETIME`, `TBW12_SEQ` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 3000);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 3000);
               }
               stmt.setVarchar(4, (String)parms[6], 50, false);
               stmt.setDateTime(5, (java.util.Date)parms[7], false);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

