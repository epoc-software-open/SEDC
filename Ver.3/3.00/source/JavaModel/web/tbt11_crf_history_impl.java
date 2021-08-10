/*
               File: tbt11_crf_history_impl
        Description: CRF修正履歴テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:3.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt11_crf_history_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"TBT11_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asatbt11_crt_user_id0Q56( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"TBT11_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asatbt11_upd_user_id0Q56( Gx_mode) ;
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
         Form.getMeta().addItem("description", "CRF修正履歴テーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbt11_crf_history_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt11_crf_history_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt11_crf_history_impl.class ));
   }

   public tbt11_crf_history_impl( int remoteHandle ,
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
         wb_table1_2_0Q56( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0Q56e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0Q56( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0Q56( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0Q56( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0Q56e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRF修正履歴テーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TBT11_CRF_HISTORY.htm");
         wb_table3_28_0Q56( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0Q56e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0Q56e( true) ;
      }
      else
      {
         wb_table1_2_0Q56e( false) ;
      }
   }

   public void wb_table3_28_0Q56( boolean wbgen )
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
         wb_table4_34_0Q56( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0Q56e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT11_CRF_HISTORY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT11_CRF_HISTORY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0Q56e( true) ;
      }
      else
      {
         wb_table3_28_0Q56e( false) ;
      }
   }

   public void wb_table4_34_0Q56( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_study_id_Internalname, "試験ID", "", "", lblTextblocktbt11_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A92TBT11_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT11_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A92TBT11_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A92TBT11_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt11_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A93TBT11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT11_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A93TBT11_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A93TBT11_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crf_id_Internalname, "CRFID", "", "", lblTextblocktbt11_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A94TBT11_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBT11_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A94TBT11_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A94TBT11_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crf_eda_no_Internalname, "CRF枝番", "", "", lblTextblocktbt11_crf_eda_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRF_EDA_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A936TBT11_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")), ((edtTBT11_CRF_EDA_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A936TBT11_CRF_EDA_NO), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A936TBT11_CRF_EDA_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_CRF_EDA_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_CRF_EDA_NO_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crf_version_Internalname, "CRF更新バージョン", "", "", lblTextblocktbt11_crf_version_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRF_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A95TBT11_CRF_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBT11_CRF_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A95TBT11_CRF_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A95TBT11_CRF_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_CRF_VERSION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_CRF_VERSION_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_VERSION", "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crf_input_level_Internalname, "CRF入力権限レベル", "", "", lblTextblocktbt11_crf_input_level_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRF_INPUT_LEVEL_Internalname, GXutil.ltrim( localUtil.ntoc( A665TBT11_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")), ((edtTBT11_CRF_INPUT_LEVEL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A665TBT11_CRF_INPUT_LEVEL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A665TBT11_CRF_INPUT_LEVEL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_CRF_INPUT_LEVEL_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_CRF_INPUT_LEVEL_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upload_datetime_Internalname, "アップロード日時", "", "", lblTextblocktbt11_upload_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT11_UPLOAD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPLOAD_DATETIME_Internalname, localUtil.format(A666TBT11_UPLOAD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A666TBT11_UPLOAD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_UPLOAD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_UPLOAD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_UPLOAD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT11_UPLOAD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upload_user_id_Internalname, "ID", "", "", lblTextblocktbt11_upload_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPLOAD_USER_ID_Internalname, GXutil.rtrim( A667TBT11_UPLOAD_USER_ID), GXutil.rtrim( localUtil.format( A667TBT11_UPLOAD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_UPLOAD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_UPLOAD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upload_auth_cd_Internalname, "アップロード時権限コード", "", "", lblTextblocktbt11_upload_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPLOAD_AUTH_CD_Internalname, GXutil.rtrim( A668TBT11_UPLOAD_AUTH_CD), GXutil.rtrim( localUtil.format( A668TBT11_UPLOAD_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_UPLOAD_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_UPLOAD_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_dm_arrival_flg_Internalname, "DM到着フラグ", "", "", lblTextblocktbt11_dm_arrival_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_DM_ARRIVAL_FLG_Internalname, GXutil.rtrim( A669TBT11_DM_ARRIVAL_FLG), GXutil.rtrim( localUtil.format( A669TBT11_DM_ARRIVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_DM_ARRIVAL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_DM_ARRIVAL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_dm_arrival_datetime_Internalname, "DM到着日時", "", "", lblTextblocktbt11_dm_arrival_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT11_DM_ARRIVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_DM_ARRIVAL_DATETIME_Internalname, localUtil.format(A670TBT11_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A670TBT11_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_DM_ARRIVAL_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_DM_ARRIVAL_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_DM_ARRIVAL_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT11_DM_ARRIVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_approval_flg_Internalname, "承認フラグ", "", "", lblTextblocktbt11_approval_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_APPROVAL_FLG_Internalname, GXutil.rtrim( A671TBT11_APPROVAL_FLG), GXutil.rtrim( localUtil.format( A671TBT11_APPROVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_APPROVAL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_APPROVAL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_approval_datetime_Internalname, "承認日時", "", "", lblTextblocktbt11_approval_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT11_APPROVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_APPROVAL_DATETIME_Internalname, localUtil.format(A672TBT11_APPROVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A672TBT11_APPROVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_APPROVAL_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_APPROVAL_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_APPROVAL_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT11_APPROVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_approval_user_id_Internalname, "ID", "", "", lblTextblocktbt11_approval_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_APPROVAL_USER_ID_Internalname, GXutil.rtrim( A673TBT11_APPROVAL_USER_ID), GXutil.rtrim( localUtil.format( A673TBT11_APPROVAL_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_APPROVAL_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_APPROVAL_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_approval_auth_cd_Internalname, "承認時権限コード", "", "", lblTextblocktbt11_approval_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_APPROVAL_AUTH_CD_Internalname, GXutil.rtrim( A674TBT11_APPROVAL_AUTH_CD), GXutil.rtrim( localUtil.format( A674TBT11_APPROVAL_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_APPROVAL_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_APPROVAL_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_signature_flg_Internalname, "署名フラグ", "", "", lblTextblocktbt11_signature_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_SIGNATURE_FLG_Internalname, GXutil.rtrim( A993TBT11_SIGNATURE_FLG), GXutil.rtrim( localUtil.format( A993TBT11_SIGNATURE_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_SIGNATURE_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_SIGNATURE_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_signature_datetime_Internalname, "署名日時", "", "", lblTextblocktbt11_signature_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT11_SIGNATURE_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_SIGNATURE_DATETIME_Internalname, localUtil.format(A994TBT11_SIGNATURE_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A994TBT11_SIGNATURE_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_SIGNATURE_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_SIGNATURE_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_SIGNATURE_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT11_SIGNATURE_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_signature_user_id_Internalname, "ID", "", "", lblTextblocktbt11_signature_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_SIGNATURE_USER_ID_Internalname, GXutil.rtrim( A995TBT11_SIGNATURE_USER_ID), GXutil.rtrim( localUtil.format( A995TBT11_SIGNATURE_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_SIGNATURE_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_SIGNATURE_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_input_end_flg_Internalname, "データ固定フラグ", "", "", lblTextblocktbt11_input_end_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_INPUT_END_FLG_Internalname, GXutil.rtrim( A675TBT11_INPUT_END_FLG), GXutil.rtrim( localUtil.format( A675TBT11_INPUT_END_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_INPUT_END_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_INPUT_END_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_input_end_datetime_Internalname, "データ固定日時", "", "", lblTextblocktbt11_input_end_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT11_INPUT_END_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_INPUT_END_DATETIME_Internalname, localUtil.format(A676TBT11_INPUT_END_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A676TBT11_INPUT_END_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_INPUT_END_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_INPUT_END_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_INPUT_END_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT11_INPUT_END_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_input_end_user_id_Internalname, "ID", "", "", lblTextblocktbt11_input_end_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_INPUT_END_USER_ID_Internalname, GXutil.rtrim( A677TBT11_INPUT_END_USER_ID), GXutil.rtrim( localUtil.format( A677TBT11_INPUT_END_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_INPUT_END_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_INPUT_END_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_input_end_auth_cd_Internalname, "データ固定時権限コード", "", "", lblTextblocktbt11_input_end_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_INPUT_END_AUTH_CD_Internalname, GXutil.rtrim( A678TBT11_INPUT_END_AUTH_CD), GXutil.rtrim( localUtil.format( A678TBT11_INPUT_END_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_INPUT_END_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_INPUT_END_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_riyu_Internalname, "変更理由", "", "", lblTextblocktbt11_upd_riyu_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT11_UPD_RIYU_Internalname, GXutil.rtrim( A891TBT11_UPD_RIYU), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(149);\"", (short)(0), 1, edtTBT11_UPD_RIYU_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, "", "", (byte)(-1), true, "", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt11_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_DEL_FLG_Internalname, GXutil.rtrim( A457TBT11_DEL_FLG), GXutil.rtrim( localUtil.format( A457TBT11_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt11_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT11_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRT_DATETIME_Internalname, localUtil.format(A458TBT11_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A458TBT11_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT11_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt11_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRT_USER_ID_Internalname, GXutil.rtrim( A459TBT11_CRT_USER_ID), GXutil.rtrim( localUtil.format( A459TBT11_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt11_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRT_PROG_NM_Internalname, GXutil.rtrim( A460TBT11_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A460TBT11_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt11_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT11_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPD_DATETIME_Internalname, localUtil.format(A461TBT11_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A461TBT11_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT11_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt11_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPD_USER_ID_Internalname, GXutil.rtrim( A462TBT11_UPD_USER_ID), GXutil.rtrim( localUtil.format( A462TBT11_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt11_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPD_PROG_NM_Internalname, GXutil.rtrim( A463TBT11_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A463TBT11_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt11_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A464TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT11_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A464TBT11_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A464TBT11_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT11_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT11_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0Q56e( true) ;
      }
      else
      {
         wb_table4_34_0Q56e( false) ;
      }
   }

   public void wb_table2_5_0Q56( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT11_CRF_HISTORY.htm");
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
         wb_table2_5_0Q56e( true) ;
      }
      else
      {
         wb_table2_5_0Q56e( false) ;
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
      /* Execute user event: e110Q2 */
      e110Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A92TBT11_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
            }
            else
            {
               A92TBT11_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT11_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A93TBT11_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A93TBT11_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT11_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A94TBT11_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
            }
            else
            {
               A94TBT11_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_EDA_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_EDA_NO_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_CRF_EDA_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_CRF_EDA_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A936TBT11_CRF_EDA_NO = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
            }
            else
            {
               A936TBT11_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_EDA_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_CRF_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_CRF_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A95TBT11_CRF_VERSION = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
            }
            else
            {
               A95TBT11_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_VERSION_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_INPUT_LEVEL_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_INPUT_LEVEL_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_CRF_INPUT_LEVEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A665TBT11_CRF_INPUT_LEVEL = (byte)(0) ;
               n665TBT11_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A665TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A665TBT11_CRF_INPUT_LEVEL, 2, 0)));
            }
            else
            {
               A665TBT11_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_INPUT_LEVEL_Internalname), ".", ",")) ;
               n665TBT11_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A665TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A665TBT11_CRF_INPUT_LEVEL, 2, 0)));
            }
            n665TBT11_CRF_INPUT_LEVEL = ((0==A665TBT11_CRF_INPUT_LEVEL) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_UPLOAD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT11_UPLOAD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_UPLOAD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n666TBT11_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A666TBT11_UPLOAD_DATETIME", localUtil.ttoc( A666TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A666TBT11_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_UPLOAD_DATETIME_Internalname)) ;
               n666TBT11_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A666TBT11_UPLOAD_DATETIME", localUtil.ttoc( A666TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n666TBT11_UPLOAD_DATETIME = (GXutil.nullDate().equals(A666TBT11_UPLOAD_DATETIME) ? true : false) ;
            A667TBT11_UPLOAD_USER_ID = httpContext.cgiGet( edtTBT11_UPLOAD_USER_ID_Internalname) ;
            n667TBT11_UPLOAD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A667TBT11_UPLOAD_USER_ID", A667TBT11_UPLOAD_USER_ID);
            n667TBT11_UPLOAD_USER_ID = ((GXutil.strcmp("", A667TBT11_UPLOAD_USER_ID)==0) ? true : false) ;
            A668TBT11_UPLOAD_AUTH_CD = httpContext.cgiGet( edtTBT11_UPLOAD_AUTH_CD_Internalname) ;
            n668TBT11_UPLOAD_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A668TBT11_UPLOAD_AUTH_CD", A668TBT11_UPLOAD_AUTH_CD);
            n668TBT11_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A668TBT11_UPLOAD_AUTH_CD)==0) ? true : false) ;
            A669TBT11_DM_ARRIVAL_FLG = httpContext.cgiGet( edtTBT11_DM_ARRIVAL_FLG_Internalname) ;
            n669TBT11_DM_ARRIVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A669TBT11_DM_ARRIVAL_FLG", A669TBT11_DM_ARRIVAL_FLG);
            n669TBT11_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A669TBT11_DM_ARRIVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_DM_ARRIVAL_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT11_DM_ARRIVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_DM_ARRIVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n670TBT11_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A670TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A670TBT11_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_DM_ARRIVAL_DATETIME_Internalname)) ;
               n670TBT11_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A670TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n670TBT11_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A670TBT11_DM_ARRIVAL_DATETIME) ? true : false) ;
            A671TBT11_APPROVAL_FLG = httpContext.cgiGet( edtTBT11_APPROVAL_FLG_Internalname) ;
            n671TBT11_APPROVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A671TBT11_APPROVAL_FLG", A671TBT11_APPROVAL_FLG);
            n671TBT11_APPROVAL_FLG = ((GXutil.strcmp("", A671TBT11_APPROVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_APPROVAL_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT11_APPROVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_APPROVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n672TBT11_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A672TBT11_APPROVAL_DATETIME", localUtil.ttoc( A672TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A672TBT11_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_APPROVAL_DATETIME_Internalname)) ;
               n672TBT11_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A672TBT11_APPROVAL_DATETIME", localUtil.ttoc( A672TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n672TBT11_APPROVAL_DATETIME = (GXutil.nullDate().equals(A672TBT11_APPROVAL_DATETIME) ? true : false) ;
            A673TBT11_APPROVAL_USER_ID = httpContext.cgiGet( edtTBT11_APPROVAL_USER_ID_Internalname) ;
            n673TBT11_APPROVAL_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A673TBT11_APPROVAL_USER_ID", A673TBT11_APPROVAL_USER_ID);
            n673TBT11_APPROVAL_USER_ID = ((GXutil.strcmp("", A673TBT11_APPROVAL_USER_ID)==0) ? true : false) ;
            A674TBT11_APPROVAL_AUTH_CD = httpContext.cgiGet( edtTBT11_APPROVAL_AUTH_CD_Internalname) ;
            n674TBT11_APPROVAL_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A674TBT11_APPROVAL_AUTH_CD", A674TBT11_APPROVAL_AUTH_CD);
            n674TBT11_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A674TBT11_APPROVAL_AUTH_CD)==0) ? true : false) ;
            A993TBT11_SIGNATURE_FLG = httpContext.cgiGet( edtTBT11_SIGNATURE_FLG_Internalname) ;
            n993TBT11_SIGNATURE_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A993TBT11_SIGNATURE_FLG", A993TBT11_SIGNATURE_FLG);
            n993TBT11_SIGNATURE_FLG = ((GXutil.strcmp("", A993TBT11_SIGNATURE_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_SIGNATURE_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT11_SIGNATURE_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_SIGNATURE_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A994TBT11_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n994TBT11_SIGNATURE_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A994TBT11_SIGNATURE_DATETIME", localUtil.ttoc( A994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A994TBT11_SIGNATURE_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_SIGNATURE_DATETIME_Internalname)) ;
               n994TBT11_SIGNATURE_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A994TBT11_SIGNATURE_DATETIME", localUtil.ttoc( A994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n994TBT11_SIGNATURE_DATETIME = (GXutil.nullDate().equals(A994TBT11_SIGNATURE_DATETIME) ? true : false) ;
            A995TBT11_SIGNATURE_USER_ID = httpContext.cgiGet( edtTBT11_SIGNATURE_USER_ID_Internalname) ;
            n995TBT11_SIGNATURE_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A995TBT11_SIGNATURE_USER_ID", A995TBT11_SIGNATURE_USER_ID);
            n995TBT11_SIGNATURE_USER_ID = ((GXutil.strcmp("", A995TBT11_SIGNATURE_USER_ID)==0) ? true : false) ;
            A675TBT11_INPUT_END_FLG = httpContext.cgiGet( edtTBT11_INPUT_END_FLG_Internalname) ;
            n675TBT11_INPUT_END_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A675TBT11_INPUT_END_FLG", A675TBT11_INPUT_END_FLG);
            n675TBT11_INPUT_END_FLG = ((GXutil.strcmp("", A675TBT11_INPUT_END_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_INPUT_END_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT11_INPUT_END_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_INPUT_END_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n676TBT11_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A676TBT11_INPUT_END_DATETIME", localUtil.ttoc( A676TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A676TBT11_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_INPUT_END_DATETIME_Internalname)) ;
               n676TBT11_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A676TBT11_INPUT_END_DATETIME", localUtil.ttoc( A676TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n676TBT11_INPUT_END_DATETIME = (GXutil.nullDate().equals(A676TBT11_INPUT_END_DATETIME) ? true : false) ;
            A677TBT11_INPUT_END_USER_ID = httpContext.cgiGet( edtTBT11_INPUT_END_USER_ID_Internalname) ;
            n677TBT11_INPUT_END_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A677TBT11_INPUT_END_USER_ID", A677TBT11_INPUT_END_USER_ID);
            n677TBT11_INPUT_END_USER_ID = ((GXutil.strcmp("", A677TBT11_INPUT_END_USER_ID)==0) ? true : false) ;
            A678TBT11_INPUT_END_AUTH_CD = httpContext.cgiGet( edtTBT11_INPUT_END_AUTH_CD_Internalname) ;
            n678TBT11_INPUT_END_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A678TBT11_INPUT_END_AUTH_CD", A678TBT11_INPUT_END_AUTH_CD);
            n678TBT11_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A678TBT11_INPUT_END_AUTH_CD)==0) ? true : false) ;
            A891TBT11_UPD_RIYU = httpContext.cgiGet( edtTBT11_UPD_RIYU_Internalname) ;
            n891TBT11_UPD_RIYU = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A891TBT11_UPD_RIYU", A891TBT11_UPD_RIYU);
            n891TBT11_UPD_RIYU = ((GXutil.strcmp("", A891TBT11_UPD_RIYU)==0) ? true : false) ;
            A457TBT11_DEL_FLG = httpContext.cgiGet( edtTBT11_DEL_FLG_Internalname) ;
            n457TBT11_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A457TBT11_DEL_FLG", A457TBT11_DEL_FLG);
            n457TBT11_DEL_FLG = ((GXutil.strcmp("", A457TBT11_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT11_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n458TBT11_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A458TBT11_CRT_DATETIME", localUtil.ttoc( A458TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A458TBT11_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_CRT_DATETIME_Internalname)) ;
               n458TBT11_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A458TBT11_CRT_DATETIME", localUtil.ttoc( A458TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n458TBT11_CRT_DATETIME = (GXutil.nullDate().equals(A458TBT11_CRT_DATETIME) ? true : false) ;
            A459TBT11_CRT_USER_ID = httpContext.cgiGet( edtTBT11_CRT_USER_ID_Internalname) ;
            n459TBT11_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A459TBT11_CRT_USER_ID", A459TBT11_CRT_USER_ID);
            n459TBT11_CRT_USER_ID = ((GXutil.strcmp("", A459TBT11_CRT_USER_ID)==0) ? true : false) ;
            A460TBT11_CRT_PROG_NM = httpContext.cgiGet( edtTBT11_CRT_PROG_NM_Internalname) ;
            n460TBT11_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A460TBT11_CRT_PROG_NM", A460TBT11_CRT_PROG_NM);
            n460TBT11_CRT_PROG_NM = ((GXutil.strcmp("", A460TBT11_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT11_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n461TBT11_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A461TBT11_UPD_DATETIME", localUtil.ttoc( A461TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A461TBT11_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_UPD_DATETIME_Internalname)) ;
               n461TBT11_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A461TBT11_UPD_DATETIME", localUtil.ttoc( A461TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n461TBT11_UPD_DATETIME = (GXutil.nullDate().equals(A461TBT11_UPD_DATETIME) ? true : false) ;
            A462TBT11_UPD_USER_ID = httpContext.cgiGet( edtTBT11_UPD_USER_ID_Internalname) ;
            n462TBT11_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A462TBT11_UPD_USER_ID", A462TBT11_UPD_USER_ID);
            n462TBT11_UPD_USER_ID = ((GXutil.strcmp("", A462TBT11_UPD_USER_ID)==0) ? true : false) ;
            A463TBT11_UPD_PROG_NM = httpContext.cgiGet( edtTBT11_UPD_PROG_NM_Internalname) ;
            n463TBT11_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A463TBT11_UPD_PROG_NM", A463TBT11_UPD_PROG_NM);
            n463TBT11_UPD_PROG_NM = ((GXutil.strcmp("", A463TBT11_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A464TBT11_UPD_CNT = 0 ;
               n464TBT11_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
            }
            else
            {
               A464TBT11_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT11_UPD_CNT_Internalname), ".", ",") ;
               n464TBT11_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
            }
            n464TBT11_UPD_CNT = ((0==A464TBT11_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z92TBT11_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z92TBT11_STUDY_ID"), ".", ",") ;
            Z93TBT11_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z93TBT11_SUBJECT_ID"), ".", ",")) ;
            Z94TBT11_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z94TBT11_CRF_ID"), ".", ",")) ;
            Z936TBT11_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z936TBT11_CRF_EDA_NO"), ".", ",")) ;
            Z95TBT11_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z95TBT11_CRF_VERSION"), ".", ",")) ;
            Z458TBT11_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z458TBT11_CRT_DATETIME"), 0) ;
            n458TBT11_CRT_DATETIME = (GXutil.nullDate().equals(A458TBT11_CRT_DATETIME) ? true : false) ;
            Z459TBT11_CRT_USER_ID = httpContext.cgiGet( "Z459TBT11_CRT_USER_ID") ;
            n459TBT11_CRT_USER_ID = ((GXutil.strcmp("", A459TBT11_CRT_USER_ID)==0) ? true : false) ;
            Z461TBT11_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z461TBT11_UPD_DATETIME"), 0) ;
            n461TBT11_UPD_DATETIME = (GXutil.nullDate().equals(A461TBT11_UPD_DATETIME) ? true : false) ;
            Z462TBT11_UPD_USER_ID = httpContext.cgiGet( "Z462TBT11_UPD_USER_ID") ;
            n462TBT11_UPD_USER_ID = ((GXutil.strcmp("", A462TBT11_UPD_USER_ID)==0) ? true : false) ;
            Z464TBT11_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z464TBT11_UPD_CNT"), ".", ",") ;
            n464TBT11_UPD_CNT = ((0==A464TBT11_UPD_CNT) ? true : false) ;
            Z665TBT11_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z665TBT11_CRF_INPUT_LEVEL"), ".", ",")) ;
            n665TBT11_CRF_INPUT_LEVEL = ((0==A665TBT11_CRF_INPUT_LEVEL) ? true : false) ;
            Z666TBT11_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z666TBT11_UPLOAD_DATETIME"), 0) ;
            n666TBT11_UPLOAD_DATETIME = (GXutil.nullDate().equals(A666TBT11_UPLOAD_DATETIME) ? true : false) ;
            Z667TBT11_UPLOAD_USER_ID = httpContext.cgiGet( "Z667TBT11_UPLOAD_USER_ID") ;
            n667TBT11_UPLOAD_USER_ID = ((GXutil.strcmp("", A667TBT11_UPLOAD_USER_ID)==0) ? true : false) ;
            Z668TBT11_UPLOAD_AUTH_CD = httpContext.cgiGet( "Z668TBT11_UPLOAD_AUTH_CD") ;
            n668TBT11_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A668TBT11_UPLOAD_AUTH_CD)==0) ? true : false) ;
            Z669TBT11_DM_ARRIVAL_FLG = httpContext.cgiGet( "Z669TBT11_DM_ARRIVAL_FLG") ;
            n669TBT11_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A669TBT11_DM_ARRIVAL_FLG)==0) ? true : false) ;
            Z670TBT11_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z670TBT11_DM_ARRIVAL_DATETIME"), 0) ;
            n670TBT11_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A670TBT11_DM_ARRIVAL_DATETIME) ? true : false) ;
            Z671TBT11_APPROVAL_FLG = httpContext.cgiGet( "Z671TBT11_APPROVAL_FLG") ;
            n671TBT11_APPROVAL_FLG = ((GXutil.strcmp("", A671TBT11_APPROVAL_FLG)==0) ? true : false) ;
            Z672TBT11_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z672TBT11_APPROVAL_DATETIME"), 0) ;
            n672TBT11_APPROVAL_DATETIME = (GXutil.nullDate().equals(A672TBT11_APPROVAL_DATETIME) ? true : false) ;
            Z673TBT11_APPROVAL_USER_ID = httpContext.cgiGet( "Z673TBT11_APPROVAL_USER_ID") ;
            n673TBT11_APPROVAL_USER_ID = ((GXutil.strcmp("", A673TBT11_APPROVAL_USER_ID)==0) ? true : false) ;
            Z674TBT11_APPROVAL_AUTH_CD = httpContext.cgiGet( "Z674TBT11_APPROVAL_AUTH_CD") ;
            n674TBT11_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A674TBT11_APPROVAL_AUTH_CD)==0) ? true : false) ;
            Z993TBT11_SIGNATURE_FLG = httpContext.cgiGet( "Z993TBT11_SIGNATURE_FLG") ;
            n993TBT11_SIGNATURE_FLG = ((GXutil.strcmp("", A993TBT11_SIGNATURE_FLG)==0) ? true : false) ;
            Z994TBT11_SIGNATURE_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z994TBT11_SIGNATURE_DATETIME"), 0) ;
            n994TBT11_SIGNATURE_DATETIME = (GXutil.nullDate().equals(A994TBT11_SIGNATURE_DATETIME) ? true : false) ;
            Z995TBT11_SIGNATURE_USER_ID = httpContext.cgiGet( "Z995TBT11_SIGNATURE_USER_ID") ;
            n995TBT11_SIGNATURE_USER_ID = ((GXutil.strcmp("", A995TBT11_SIGNATURE_USER_ID)==0) ? true : false) ;
            Z675TBT11_INPUT_END_FLG = httpContext.cgiGet( "Z675TBT11_INPUT_END_FLG") ;
            n675TBT11_INPUT_END_FLG = ((GXutil.strcmp("", A675TBT11_INPUT_END_FLG)==0) ? true : false) ;
            Z676TBT11_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z676TBT11_INPUT_END_DATETIME"), 0) ;
            n676TBT11_INPUT_END_DATETIME = (GXutil.nullDate().equals(A676TBT11_INPUT_END_DATETIME) ? true : false) ;
            Z677TBT11_INPUT_END_USER_ID = httpContext.cgiGet( "Z677TBT11_INPUT_END_USER_ID") ;
            n677TBT11_INPUT_END_USER_ID = ((GXutil.strcmp("", A677TBT11_INPUT_END_USER_ID)==0) ? true : false) ;
            Z678TBT11_INPUT_END_AUTH_CD = httpContext.cgiGet( "Z678TBT11_INPUT_END_AUTH_CD") ;
            n678TBT11_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A678TBT11_INPUT_END_AUTH_CD)==0) ? true : false) ;
            Z891TBT11_UPD_RIYU = httpContext.cgiGet( "Z891TBT11_UPD_RIYU") ;
            n891TBT11_UPD_RIYU = ((GXutil.strcmp("", A891TBT11_UPD_RIYU)==0) ? true : false) ;
            Z457TBT11_DEL_FLG = httpContext.cgiGet( "Z457TBT11_DEL_FLG") ;
            n457TBT11_DEL_FLG = ((GXutil.strcmp("", A457TBT11_DEL_FLG)==0) ? true : false) ;
            Z460TBT11_CRT_PROG_NM = httpContext.cgiGet( "Z460TBT11_CRT_PROG_NM") ;
            n460TBT11_CRT_PROG_NM = ((GXutil.strcmp("", A460TBT11_CRT_PROG_NM)==0) ? true : false) ;
            Z463TBT11_UPD_PROG_NM = httpContext.cgiGet( "Z463TBT11_UPD_PROG_NM") ;
            n463TBT11_UPD_PROG_NM = ((GXutil.strcmp("", A463TBT11_UPD_PROG_NM)==0) ? true : false) ;
            O464TBT11_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O464TBT11_UPD_CNT"), ".", ",") ;
            n464TBT11_UPD_CNT = ((0==A464TBT11_UPD_CNT) ? true : false) ;
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
               A92TBT11_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
               A93TBT11_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
               A94TBT11_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
               A936TBT11_CRF_EDA_NO = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
               A95TBT11_CRF_VERSION = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
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
                     /* Execute user event: e110Q2 */
                     e110Q2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120Q2 */
                     e120Q2 ();
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
         /* Execute user event: e120Q2 */
         e120Q2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0Q56( ) ;
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
      disableAttributes0Q56( ) ;
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

   public void resetCaption0Q0( )
   {
   }

   public void e110Q2( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_BC_FLG", AV8W_BC_FLG);
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e120Q2( )
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

   public void zm0Q56( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z458TBT11_CRT_DATETIME = T000Q3_A458TBT11_CRT_DATETIME[0] ;
            Z459TBT11_CRT_USER_ID = T000Q3_A459TBT11_CRT_USER_ID[0] ;
            Z461TBT11_UPD_DATETIME = T000Q3_A461TBT11_UPD_DATETIME[0] ;
            Z462TBT11_UPD_USER_ID = T000Q3_A462TBT11_UPD_USER_ID[0] ;
            Z464TBT11_UPD_CNT = T000Q3_A464TBT11_UPD_CNT[0] ;
            Z665TBT11_CRF_INPUT_LEVEL = T000Q3_A665TBT11_CRF_INPUT_LEVEL[0] ;
            Z666TBT11_UPLOAD_DATETIME = T000Q3_A666TBT11_UPLOAD_DATETIME[0] ;
            Z667TBT11_UPLOAD_USER_ID = T000Q3_A667TBT11_UPLOAD_USER_ID[0] ;
            Z668TBT11_UPLOAD_AUTH_CD = T000Q3_A668TBT11_UPLOAD_AUTH_CD[0] ;
            Z669TBT11_DM_ARRIVAL_FLG = T000Q3_A669TBT11_DM_ARRIVAL_FLG[0] ;
            Z670TBT11_DM_ARRIVAL_DATETIME = T000Q3_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
            Z671TBT11_APPROVAL_FLG = T000Q3_A671TBT11_APPROVAL_FLG[0] ;
            Z672TBT11_APPROVAL_DATETIME = T000Q3_A672TBT11_APPROVAL_DATETIME[0] ;
            Z673TBT11_APPROVAL_USER_ID = T000Q3_A673TBT11_APPROVAL_USER_ID[0] ;
            Z674TBT11_APPROVAL_AUTH_CD = T000Q3_A674TBT11_APPROVAL_AUTH_CD[0] ;
            Z993TBT11_SIGNATURE_FLG = T000Q3_A993TBT11_SIGNATURE_FLG[0] ;
            Z994TBT11_SIGNATURE_DATETIME = T000Q3_A994TBT11_SIGNATURE_DATETIME[0] ;
            Z995TBT11_SIGNATURE_USER_ID = T000Q3_A995TBT11_SIGNATURE_USER_ID[0] ;
            Z675TBT11_INPUT_END_FLG = T000Q3_A675TBT11_INPUT_END_FLG[0] ;
            Z676TBT11_INPUT_END_DATETIME = T000Q3_A676TBT11_INPUT_END_DATETIME[0] ;
            Z677TBT11_INPUT_END_USER_ID = T000Q3_A677TBT11_INPUT_END_USER_ID[0] ;
            Z678TBT11_INPUT_END_AUTH_CD = T000Q3_A678TBT11_INPUT_END_AUTH_CD[0] ;
            Z891TBT11_UPD_RIYU = T000Q3_A891TBT11_UPD_RIYU[0] ;
            Z457TBT11_DEL_FLG = T000Q3_A457TBT11_DEL_FLG[0] ;
            Z460TBT11_CRT_PROG_NM = T000Q3_A460TBT11_CRT_PROG_NM[0] ;
            Z463TBT11_UPD_PROG_NM = T000Q3_A463TBT11_UPD_PROG_NM[0] ;
         }
         else
         {
            Z458TBT11_CRT_DATETIME = A458TBT11_CRT_DATETIME ;
            Z459TBT11_CRT_USER_ID = A459TBT11_CRT_USER_ID ;
            Z461TBT11_UPD_DATETIME = A461TBT11_UPD_DATETIME ;
            Z462TBT11_UPD_USER_ID = A462TBT11_UPD_USER_ID ;
            Z464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
            Z665TBT11_CRF_INPUT_LEVEL = A665TBT11_CRF_INPUT_LEVEL ;
            Z666TBT11_UPLOAD_DATETIME = A666TBT11_UPLOAD_DATETIME ;
            Z667TBT11_UPLOAD_USER_ID = A667TBT11_UPLOAD_USER_ID ;
            Z668TBT11_UPLOAD_AUTH_CD = A668TBT11_UPLOAD_AUTH_CD ;
            Z669TBT11_DM_ARRIVAL_FLG = A669TBT11_DM_ARRIVAL_FLG ;
            Z670TBT11_DM_ARRIVAL_DATETIME = A670TBT11_DM_ARRIVAL_DATETIME ;
            Z671TBT11_APPROVAL_FLG = A671TBT11_APPROVAL_FLG ;
            Z672TBT11_APPROVAL_DATETIME = A672TBT11_APPROVAL_DATETIME ;
            Z673TBT11_APPROVAL_USER_ID = A673TBT11_APPROVAL_USER_ID ;
            Z674TBT11_APPROVAL_AUTH_CD = A674TBT11_APPROVAL_AUTH_CD ;
            Z993TBT11_SIGNATURE_FLG = A993TBT11_SIGNATURE_FLG ;
            Z994TBT11_SIGNATURE_DATETIME = A994TBT11_SIGNATURE_DATETIME ;
            Z995TBT11_SIGNATURE_USER_ID = A995TBT11_SIGNATURE_USER_ID ;
            Z675TBT11_INPUT_END_FLG = A675TBT11_INPUT_END_FLG ;
            Z676TBT11_INPUT_END_DATETIME = A676TBT11_INPUT_END_DATETIME ;
            Z677TBT11_INPUT_END_USER_ID = A677TBT11_INPUT_END_USER_ID ;
            Z678TBT11_INPUT_END_AUTH_CD = A678TBT11_INPUT_END_AUTH_CD ;
            Z891TBT11_UPD_RIYU = A891TBT11_UPD_RIYU ;
            Z457TBT11_DEL_FLG = A457TBT11_DEL_FLG ;
            Z460TBT11_CRT_PROG_NM = A460TBT11_CRT_PROG_NM ;
            Z463TBT11_UPD_PROG_NM = A463TBT11_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z92TBT11_STUDY_ID = A92TBT11_STUDY_ID ;
         Z93TBT11_SUBJECT_ID = A93TBT11_SUBJECT_ID ;
         Z94TBT11_CRF_ID = A94TBT11_CRF_ID ;
         Z936TBT11_CRF_EDA_NO = A936TBT11_CRF_EDA_NO ;
         Z95TBT11_CRF_VERSION = A95TBT11_CRF_VERSION ;
         Z458TBT11_CRT_DATETIME = A458TBT11_CRT_DATETIME ;
         Z459TBT11_CRT_USER_ID = A459TBT11_CRT_USER_ID ;
         Z461TBT11_UPD_DATETIME = A461TBT11_UPD_DATETIME ;
         Z462TBT11_UPD_USER_ID = A462TBT11_UPD_USER_ID ;
         Z464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
         Z665TBT11_CRF_INPUT_LEVEL = A665TBT11_CRF_INPUT_LEVEL ;
         Z666TBT11_UPLOAD_DATETIME = A666TBT11_UPLOAD_DATETIME ;
         Z667TBT11_UPLOAD_USER_ID = A667TBT11_UPLOAD_USER_ID ;
         Z668TBT11_UPLOAD_AUTH_CD = A668TBT11_UPLOAD_AUTH_CD ;
         Z669TBT11_DM_ARRIVAL_FLG = A669TBT11_DM_ARRIVAL_FLG ;
         Z670TBT11_DM_ARRIVAL_DATETIME = A670TBT11_DM_ARRIVAL_DATETIME ;
         Z671TBT11_APPROVAL_FLG = A671TBT11_APPROVAL_FLG ;
         Z672TBT11_APPROVAL_DATETIME = A672TBT11_APPROVAL_DATETIME ;
         Z673TBT11_APPROVAL_USER_ID = A673TBT11_APPROVAL_USER_ID ;
         Z674TBT11_APPROVAL_AUTH_CD = A674TBT11_APPROVAL_AUTH_CD ;
         Z993TBT11_SIGNATURE_FLG = A993TBT11_SIGNATURE_FLG ;
         Z994TBT11_SIGNATURE_DATETIME = A994TBT11_SIGNATURE_DATETIME ;
         Z995TBT11_SIGNATURE_USER_ID = A995TBT11_SIGNATURE_USER_ID ;
         Z675TBT11_INPUT_END_FLG = A675TBT11_INPUT_END_FLG ;
         Z676TBT11_INPUT_END_DATETIME = A676TBT11_INPUT_END_DATETIME ;
         Z677TBT11_INPUT_END_USER_ID = A677TBT11_INPUT_END_USER_ID ;
         Z678TBT11_INPUT_END_AUTH_CD = A678TBT11_INPUT_END_AUTH_CD ;
         Z891TBT11_UPD_RIYU = A891TBT11_UPD_RIYU ;
         Z457TBT11_DEL_FLG = A457TBT11_DEL_FLG ;
         Z460TBT11_CRT_PROG_NM = A460TBT11_CRT_PROG_NM ;
         Z463TBT11_UPD_PROG_NM = A463TBT11_UPD_PROG_NM ;
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

   public void load0Q56( )
   {
      /* Using cursor T000Q4 */
      pr_default.execute(2, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound56 = (short)(1) ;
         A458TBT11_CRT_DATETIME = T000Q4_A458TBT11_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A458TBT11_CRT_DATETIME", localUtil.ttoc( A458TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n458TBT11_CRT_DATETIME = T000Q4_n458TBT11_CRT_DATETIME[0] ;
         A459TBT11_CRT_USER_ID = T000Q4_A459TBT11_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A459TBT11_CRT_USER_ID", A459TBT11_CRT_USER_ID);
         n459TBT11_CRT_USER_ID = T000Q4_n459TBT11_CRT_USER_ID[0] ;
         A461TBT11_UPD_DATETIME = T000Q4_A461TBT11_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A461TBT11_UPD_DATETIME", localUtil.ttoc( A461TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n461TBT11_UPD_DATETIME = T000Q4_n461TBT11_UPD_DATETIME[0] ;
         A462TBT11_UPD_USER_ID = T000Q4_A462TBT11_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A462TBT11_UPD_USER_ID", A462TBT11_UPD_USER_ID);
         n462TBT11_UPD_USER_ID = T000Q4_n462TBT11_UPD_USER_ID[0] ;
         A464TBT11_UPD_CNT = T000Q4_A464TBT11_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
         n464TBT11_UPD_CNT = T000Q4_n464TBT11_UPD_CNT[0] ;
         A665TBT11_CRF_INPUT_LEVEL = T000Q4_A665TBT11_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A665TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A665TBT11_CRF_INPUT_LEVEL, 2, 0)));
         n665TBT11_CRF_INPUT_LEVEL = T000Q4_n665TBT11_CRF_INPUT_LEVEL[0] ;
         A666TBT11_UPLOAD_DATETIME = T000Q4_A666TBT11_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A666TBT11_UPLOAD_DATETIME", localUtil.ttoc( A666TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n666TBT11_UPLOAD_DATETIME = T000Q4_n666TBT11_UPLOAD_DATETIME[0] ;
         A667TBT11_UPLOAD_USER_ID = T000Q4_A667TBT11_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667TBT11_UPLOAD_USER_ID", A667TBT11_UPLOAD_USER_ID);
         n667TBT11_UPLOAD_USER_ID = T000Q4_n667TBT11_UPLOAD_USER_ID[0] ;
         A668TBT11_UPLOAD_AUTH_CD = T000Q4_A668TBT11_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A668TBT11_UPLOAD_AUTH_CD", A668TBT11_UPLOAD_AUTH_CD);
         n668TBT11_UPLOAD_AUTH_CD = T000Q4_n668TBT11_UPLOAD_AUTH_CD[0] ;
         A669TBT11_DM_ARRIVAL_FLG = T000Q4_A669TBT11_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669TBT11_DM_ARRIVAL_FLG", A669TBT11_DM_ARRIVAL_FLG);
         n669TBT11_DM_ARRIVAL_FLG = T000Q4_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = T000Q4_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A670TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n670TBT11_DM_ARRIVAL_DATETIME = T000Q4_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A671TBT11_APPROVAL_FLG = T000Q4_A671TBT11_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A671TBT11_APPROVAL_FLG", A671TBT11_APPROVAL_FLG);
         n671TBT11_APPROVAL_FLG = T000Q4_n671TBT11_APPROVAL_FLG[0] ;
         A672TBT11_APPROVAL_DATETIME = T000Q4_A672TBT11_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A672TBT11_APPROVAL_DATETIME", localUtil.ttoc( A672TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n672TBT11_APPROVAL_DATETIME = T000Q4_n672TBT11_APPROVAL_DATETIME[0] ;
         A673TBT11_APPROVAL_USER_ID = T000Q4_A673TBT11_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673TBT11_APPROVAL_USER_ID", A673TBT11_APPROVAL_USER_ID);
         n673TBT11_APPROVAL_USER_ID = T000Q4_n673TBT11_APPROVAL_USER_ID[0] ;
         A674TBT11_APPROVAL_AUTH_CD = T000Q4_A674TBT11_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A674TBT11_APPROVAL_AUTH_CD", A674TBT11_APPROVAL_AUTH_CD);
         n674TBT11_APPROVAL_AUTH_CD = T000Q4_n674TBT11_APPROVAL_AUTH_CD[0] ;
         A993TBT11_SIGNATURE_FLG = T000Q4_A993TBT11_SIGNATURE_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A993TBT11_SIGNATURE_FLG", A993TBT11_SIGNATURE_FLG);
         n993TBT11_SIGNATURE_FLG = T000Q4_n993TBT11_SIGNATURE_FLG[0] ;
         A994TBT11_SIGNATURE_DATETIME = T000Q4_A994TBT11_SIGNATURE_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A994TBT11_SIGNATURE_DATETIME", localUtil.ttoc( A994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n994TBT11_SIGNATURE_DATETIME = T000Q4_n994TBT11_SIGNATURE_DATETIME[0] ;
         A995TBT11_SIGNATURE_USER_ID = T000Q4_A995TBT11_SIGNATURE_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A995TBT11_SIGNATURE_USER_ID", A995TBT11_SIGNATURE_USER_ID);
         n995TBT11_SIGNATURE_USER_ID = T000Q4_n995TBT11_SIGNATURE_USER_ID[0] ;
         A675TBT11_INPUT_END_FLG = T000Q4_A675TBT11_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A675TBT11_INPUT_END_FLG", A675TBT11_INPUT_END_FLG);
         n675TBT11_INPUT_END_FLG = T000Q4_n675TBT11_INPUT_END_FLG[0] ;
         A676TBT11_INPUT_END_DATETIME = T000Q4_A676TBT11_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A676TBT11_INPUT_END_DATETIME", localUtil.ttoc( A676TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n676TBT11_INPUT_END_DATETIME = T000Q4_n676TBT11_INPUT_END_DATETIME[0] ;
         A677TBT11_INPUT_END_USER_ID = T000Q4_A677TBT11_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A677TBT11_INPUT_END_USER_ID", A677TBT11_INPUT_END_USER_ID);
         n677TBT11_INPUT_END_USER_ID = T000Q4_n677TBT11_INPUT_END_USER_ID[0] ;
         A678TBT11_INPUT_END_AUTH_CD = T000Q4_A678TBT11_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A678TBT11_INPUT_END_AUTH_CD", A678TBT11_INPUT_END_AUTH_CD);
         n678TBT11_INPUT_END_AUTH_CD = T000Q4_n678TBT11_INPUT_END_AUTH_CD[0] ;
         A891TBT11_UPD_RIYU = T000Q4_A891TBT11_UPD_RIYU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A891TBT11_UPD_RIYU", A891TBT11_UPD_RIYU);
         n891TBT11_UPD_RIYU = T000Q4_n891TBT11_UPD_RIYU[0] ;
         A457TBT11_DEL_FLG = T000Q4_A457TBT11_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457TBT11_DEL_FLG", A457TBT11_DEL_FLG);
         n457TBT11_DEL_FLG = T000Q4_n457TBT11_DEL_FLG[0] ;
         A460TBT11_CRT_PROG_NM = T000Q4_A460TBT11_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460TBT11_CRT_PROG_NM", A460TBT11_CRT_PROG_NM);
         n460TBT11_CRT_PROG_NM = T000Q4_n460TBT11_CRT_PROG_NM[0] ;
         A463TBT11_UPD_PROG_NM = T000Q4_A463TBT11_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A463TBT11_UPD_PROG_NM", A463TBT11_UPD_PROG_NM);
         n463TBT11_UPD_PROG_NM = T000Q4_n463TBT11_UPD_PROG_NM[0] ;
         zm0Q56( -13) ;
      }
      pr_default.close(2);
      onLoadActions0Q56( ) ;
   }

   public void onLoadActions0Q56( )
   {
      AV9Pgmname = "TBT11_CRF_HISTORY" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0Q56( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT11_CRF_HISTORY" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A666TBT11_UPLOAD_DATETIME) || (( A666TBT11_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A666TBT11_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "TBT11_UPLOAD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_UPLOAD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A670TBT11_DM_ARRIVAL_DATETIME) || (( A670TBT11_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A670TBT11_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "TBT11_DM_ARRIVAL_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_DM_ARRIVAL_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A672TBT11_APPROVAL_DATETIME) || (( A672TBT11_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A672TBT11_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "TBT11_APPROVAL_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_APPROVAL_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A994TBT11_SIGNATURE_DATETIME) || (( A994TBT11_SIGNATURE_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A994TBT11_SIGNATURE_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　署名日時 は範囲外です", "OutOfRange", 1, "TBT11_SIGNATURE_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_SIGNATURE_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A676TBT11_INPUT_END_DATETIME) || (( A676TBT11_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A676TBT11_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "TBT11_INPUT_END_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_INPUT_END_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A458TBT11_CRT_DATETIME) || (( A458TBT11_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A458TBT11_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBT11_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A461TBT11_UPD_DATETIME) || (( A461TBT11_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A461TBT11_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBT11_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0Q56( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0Q56( )
   {
      /* Using cursor T000Q5 */
      pr_default.execute(3, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound56 = (short)(1) ;
      }
      else
      {
         RcdFound56 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000Q3 */
      pr_default.execute(1, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Q56( 13) ;
         RcdFound56 = (short)(1) ;
         A92TBT11_STUDY_ID = T000Q3_A92TBT11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
         A93TBT11_SUBJECT_ID = T000Q3_A93TBT11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
         A94TBT11_CRF_ID = T000Q3_A94TBT11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
         A936TBT11_CRF_EDA_NO = T000Q3_A936TBT11_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
         A95TBT11_CRF_VERSION = T000Q3_A95TBT11_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
         A458TBT11_CRT_DATETIME = T000Q3_A458TBT11_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A458TBT11_CRT_DATETIME", localUtil.ttoc( A458TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n458TBT11_CRT_DATETIME = T000Q3_n458TBT11_CRT_DATETIME[0] ;
         A459TBT11_CRT_USER_ID = T000Q3_A459TBT11_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A459TBT11_CRT_USER_ID", A459TBT11_CRT_USER_ID);
         n459TBT11_CRT_USER_ID = T000Q3_n459TBT11_CRT_USER_ID[0] ;
         A461TBT11_UPD_DATETIME = T000Q3_A461TBT11_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A461TBT11_UPD_DATETIME", localUtil.ttoc( A461TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n461TBT11_UPD_DATETIME = T000Q3_n461TBT11_UPD_DATETIME[0] ;
         A462TBT11_UPD_USER_ID = T000Q3_A462TBT11_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A462TBT11_UPD_USER_ID", A462TBT11_UPD_USER_ID);
         n462TBT11_UPD_USER_ID = T000Q3_n462TBT11_UPD_USER_ID[0] ;
         A464TBT11_UPD_CNT = T000Q3_A464TBT11_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
         n464TBT11_UPD_CNT = T000Q3_n464TBT11_UPD_CNT[0] ;
         A665TBT11_CRF_INPUT_LEVEL = T000Q3_A665TBT11_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A665TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A665TBT11_CRF_INPUT_LEVEL, 2, 0)));
         n665TBT11_CRF_INPUT_LEVEL = T000Q3_n665TBT11_CRF_INPUT_LEVEL[0] ;
         A666TBT11_UPLOAD_DATETIME = T000Q3_A666TBT11_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A666TBT11_UPLOAD_DATETIME", localUtil.ttoc( A666TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n666TBT11_UPLOAD_DATETIME = T000Q3_n666TBT11_UPLOAD_DATETIME[0] ;
         A667TBT11_UPLOAD_USER_ID = T000Q3_A667TBT11_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667TBT11_UPLOAD_USER_ID", A667TBT11_UPLOAD_USER_ID);
         n667TBT11_UPLOAD_USER_ID = T000Q3_n667TBT11_UPLOAD_USER_ID[0] ;
         A668TBT11_UPLOAD_AUTH_CD = T000Q3_A668TBT11_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A668TBT11_UPLOAD_AUTH_CD", A668TBT11_UPLOAD_AUTH_CD);
         n668TBT11_UPLOAD_AUTH_CD = T000Q3_n668TBT11_UPLOAD_AUTH_CD[0] ;
         A669TBT11_DM_ARRIVAL_FLG = T000Q3_A669TBT11_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669TBT11_DM_ARRIVAL_FLG", A669TBT11_DM_ARRIVAL_FLG);
         n669TBT11_DM_ARRIVAL_FLG = T000Q3_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = T000Q3_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A670TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n670TBT11_DM_ARRIVAL_DATETIME = T000Q3_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A671TBT11_APPROVAL_FLG = T000Q3_A671TBT11_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A671TBT11_APPROVAL_FLG", A671TBT11_APPROVAL_FLG);
         n671TBT11_APPROVAL_FLG = T000Q3_n671TBT11_APPROVAL_FLG[0] ;
         A672TBT11_APPROVAL_DATETIME = T000Q3_A672TBT11_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A672TBT11_APPROVAL_DATETIME", localUtil.ttoc( A672TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n672TBT11_APPROVAL_DATETIME = T000Q3_n672TBT11_APPROVAL_DATETIME[0] ;
         A673TBT11_APPROVAL_USER_ID = T000Q3_A673TBT11_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673TBT11_APPROVAL_USER_ID", A673TBT11_APPROVAL_USER_ID);
         n673TBT11_APPROVAL_USER_ID = T000Q3_n673TBT11_APPROVAL_USER_ID[0] ;
         A674TBT11_APPROVAL_AUTH_CD = T000Q3_A674TBT11_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A674TBT11_APPROVAL_AUTH_CD", A674TBT11_APPROVAL_AUTH_CD);
         n674TBT11_APPROVAL_AUTH_CD = T000Q3_n674TBT11_APPROVAL_AUTH_CD[0] ;
         A993TBT11_SIGNATURE_FLG = T000Q3_A993TBT11_SIGNATURE_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A993TBT11_SIGNATURE_FLG", A993TBT11_SIGNATURE_FLG);
         n993TBT11_SIGNATURE_FLG = T000Q3_n993TBT11_SIGNATURE_FLG[0] ;
         A994TBT11_SIGNATURE_DATETIME = T000Q3_A994TBT11_SIGNATURE_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A994TBT11_SIGNATURE_DATETIME", localUtil.ttoc( A994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n994TBT11_SIGNATURE_DATETIME = T000Q3_n994TBT11_SIGNATURE_DATETIME[0] ;
         A995TBT11_SIGNATURE_USER_ID = T000Q3_A995TBT11_SIGNATURE_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A995TBT11_SIGNATURE_USER_ID", A995TBT11_SIGNATURE_USER_ID);
         n995TBT11_SIGNATURE_USER_ID = T000Q3_n995TBT11_SIGNATURE_USER_ID[0] ;
         A675TBT11_INPUT_END_FLG = T000Q3_A675TBT11_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A675TBT11_INPUT_END_FLG", A675TBT11_INPUT_END_FLG);
         n675TBT11_INPUT_END_FLG = T000Q3_n675TBT11_INPUT_END_FLG[0] ;
         A676TBT11_INPUT_END_DATETIME = T000Q3_A676TBT11_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A676TBT11_INPUT_END_DATETIME", localUtil.ttoc( A676TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n676TBT11_INPUT_END_DATETIME = T000Q3_n676TBT11_INPUT_END_DATETIME[0] ;
         A677TBT11_INPUT_END_USER_ID = T000Q3_A677TBT11_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A677TBT11_INPUT_END_USER_ID", A677TBT11_INPUT_END_USER_ID);
         n677TBT11_INPUT_END_USER_ID = T000Q3_n677TBT11_INPUT_END_USER_ID[0] ;
         A678TBT11_INPUT_END_AUTH_CD = T000Q3_A678TBT11_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A678TBT11_INPUT_END_AUTH_CD", A678TBT11_INPUT_END_AUTH_CD);
         n678TBT11_INPUT_END_AUTH_CD = T000Q3_n678TBT11_INPUT_END_AUTH_CD[0] ;
         A891TBT11_UPD_RIYU = T000Q3_A891TBT11_UPD_RIYU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A891TBT11_UPD_RIYU", A891TBT11_UPD_RIYU);
         n891TBT11_UPD_RIYU = T000Q3_n891TBT11_UPD_RIYU[0] ;
         A457TBT11_DEL_FLG = T000Q3_A457TBT11_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457TBT11_DEL_FLG", A457TBT11_DEL_FLG);
         n457TBT11_DEL_FLG = T000Q3_n457TBT11_DEL_FLG[0] ;
         A460TBT11_CRT_PROG_NM = T000Q3_A460TBT11_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460TBT11_CRT_PROG_NM", A460TBT11_CRT_PROG_NM);
         n460TBT11_CRT_PROG_NM = T000Q3_n460TBT11_CRT_PROG_NM[0] ;
         A463TBT11_UPD_PROG_NM = T000Q3_A463TBT11_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A463TBT11_UPD_PROG_NM", A463TBT11_UPD_PROG_NM);
         n463TBT11_UPD_PROG_NM = T000Q3_n463TBT11_UPD_PROG_NM[0] ;
         O464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
         n464TBT11_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
         Z92TBT11_STUDY_ID = A92TBT11_STUDY_ID ;
         Z93TBT11_SUBJECT_ID = A93TBT11_SUBJECT_ID ;
         Z94TBT11_CRF_ID = A94TBT11_CRF_ID ;
         Z936TBT11_CRF_EDA_NO = A936TBT11_CRF_EDA_NO ;
         Z95TBT11_CRF_VERSION = A95TBT11_CRF_VERSION ;
         sMode56 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0Q56( ) ;
         if ( AnyError == 1 )
         {
            RcdFound56 = (short)(0) ;
            initializeNonKey0Q56( ) ;
         }
         Gx_mode = sMode56 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound56 = (short)(0) ;
         initializeNonKey0Q56( ) ;
         sMode56 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode56 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Q56( ) ;
      if ( RcdFound56 == 0 )
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
      RcdFound56 = (short)(0) ;
      /* Using cursor T000Q6 */
      pr_default.execute(4, new Object[] {new Long(A92TBT11_STUDY_ID), new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Integer(A93TBT11_SUBJECT_ID), new Long(A92TBT11_STUDY_ID), new Short(A94TBT11_CRF_ID), new Short(A94TBT11_CRF_ID), new Integer(A93TBT11_SUBJECT_ID), new Long(A92TBT11_STUDY_ID), new Byte(A936TBT11_CRF_EDA_NO), new Byte(A936TBT11_CRF_EDA_NO), new Short(A94TBT11_CRF_ID), new Integer(A93TBT11_SUBJECT_ID), new Long(A92TBT11_STUDY_ID), new Short(A95TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000Q6_A92TBT11_STUDY_ID[0] < A92TBT11_STUDY_ID ) || ( T000Q6_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q6_A93TBT11_SUBJECT_ID[0] < A93TBT11_SUBJECT_ID ) || ( T000Q6_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q6_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q6_A94TBT11_CRF_ID[0] < A94TBT11_CRF_ID ) || ( T000Q6_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( T000Q6_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q6_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q6_A936TBT11_CRF_EDA_NO[0] < A936TBT11_CRF_EDA_NO ) || ( T000Q6_A936TBT11_CRF_EDA_NO[0] == A936TBT11_CRF_EDA_NO ) && ( T000Q6_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( T000Q6_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q6_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q6_A95TBT11_CRF_VERSION[0] < A95TBT11_CRF_VERSION ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000Q6_A92TBT11_STUDY_ID[0] > A92TBT11_STUDY_ID ) || ( T000Q6_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q6_A93TBT11_SUBJECT_ID[0] > A93TBT11_SUBJECT_ID ) || ( T000Q6_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q6_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q6_A94TBT11_CRF_ID[0] > A94TBT11_CRF_ID ) || ( T000Q6_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( T000Q6_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q6_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q6_A936TBT11_CRF_EDA_NO[0] > A936TBT11_CRF_EDA_NO ) || ( T000Q6_A936TBT11_CRF_EDA_NO[0] == A936TBT11_CRF_EDA_NO ) && ( T000Q6_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( T000Q6_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q6_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q6_A95TBT11_CRF_VERSION[0] > A95TBT11_CRF_VERSION ) ) )
         {
            A92TBT11_STUDY_ID = T000Q6_A92TBT11_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
            A93TBT11_SUBJECT_ID = T000Q6_A93TBT11_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
            A94TBT11_CRF_ID = T000Q6_A94TBT11_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
            A936TBT11_CRF_EDA_NO = T000Q6_A936TBT11_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
            A95TBT11_CRF_VERSION = T000Q6_A95TBT11_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
            RcdFound56 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound56 = (short)(0) ;
      /* Using cursor T000Q7 */
      pr_default.execute(5, new Object[] {new Long(A92TBT11_STUDY_ID), new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Integer(A93TBT11_SUBJECT_ID), new Long(A92TBT11_STUDY_ID), new Short(A94TBT11_CRF_ID), new Short(A94TBT11_CRF_ID), new Integer(A93TBT11_SUBJECT_ID), new Long(A92TBT11_STUDY_ID), new Byte(A936TBT11_CRF_EDA_NO), new Byte(A936TBT11_CRF_EDA_NO), new Short(A94TBT11_CRF_ID), new Integer(A93TBT11_SUBJECT_ID), new Long(A92TBT11_STUDY_ID), new Short(A95TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000Q7_A92TBT11_STUDY_ID[0] > A92TBT11_STUDY_ID ) || ( T000Q7_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q7_A93TBT11_SUBJECT_ID[0] > A93TBT11_SUBJECT_ID ) || ( T000Q7_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q7_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q7_A94TBT11_CRF_ID[0] > A94TBT11_CRF_ID ) || ( T000Q7_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( T000Q7_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q7_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q7_A936TBT11_CRF_EDA_NO[0] > A936TBT11_CRF_EDA_NO ) || ( T000Q7_A936TBT11_CRF_EDA_NO[0] == A936TBT11_CRF_EDA_NO ) && ( T000Q7_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( T000Q7_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q7_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q7_A95TBT11_CRF_VERSION[0] > A95TBT11_CRF_VERSION ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000Q7_A92TBT11_STUDY_ID[0] < A92TBT11_STUDY_ID ) || ( T000Q7_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q7_A93TBT11_SUBJECT_ID[0] < A93TBT11_SUBJECT_ID ) || ( T000Q7_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q7_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q7_A94TBT11_CRF_ID[0] < A94TBT11_CRF_ID ) || ( T000Q7_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( T000Q7_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q7_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q7_A936TBT11_CRF_EDA_NO[0] < A936TBT11_CRF_EDA_NO ) || ( T000Q7_A936TBT11_CRF_EDA_NO[0] == A936TBT11_CRF_EDA_NO ) && ( T000Q7_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( T000Q7_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( T000Q7_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( T000Q7_A95TBT11_CRF_VERSION[0] < A95TBT11_CRF_VERSION ) ) )
         {
            A92TBT11_STUDY_ID = T000Q7_A92TBT11_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
            A93TBT11_SUBJECT_ID = T000Q7_A93TBT11_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
            A94TBT11_CRF_ID = T000Q7_A94TBT11_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
            A936TBT11_CRF_EDA_NO = T000Q7_A936TBT11_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
            A95TBT11_CRF_VERSION = T000Q7_A95TBT11_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
            RcdFound56 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0Q56( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0Q56( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound56 == 1 )
         {
            if ( ( A92TBT11_STUDY_ID != Z92TBT11_STUDY_ID ) || ( A93TBT11_SUBJECT_ID != Z93TBT11_SUBJECT_ID ) || ( A94TBT11_CRF_ID != Z94TBT11_CRF_ID ) || ( A936TBT11_CRF_EDA_NO != Z936TBT11_CRF_EDA_NO ) || ( A95TBT11_CRF_VERSION != Z95TBT11_CRF_VERSION ) )
            {
               A92TBT11_STUDY_ID = Z92TBT11_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
               A93TBT11_SUBJECT_ID = Z93TBT11_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
               A94TBT11_CRF_ID = Z94TBT11_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
               A936TBT11_CRF_EDA_NO = Z936TBT11_CRF_EDA_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
               A95TBT11_CRF_VERSION = Z95TBT11_CRF_VERSION ;
               httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBT11_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0Q56( ) ;
               GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A92TBT11_STUDY_ID != Z92TBT11_STUDY_ID ) || ( A93TBT11_SUBJECT_ID != Z93TBT11_SUBJECT_ID ) || ( A94TBT11_CRF_ID != Z94TBT11_CRF_ID ) || ( A936TBT11_CRF_EDA_NO != Z936TBT11_CRF_EDA_NO ) || ( A95TBT11_CRF_VERSION != Z95TBT11_CRF_VERSION ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0Q56( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBT11_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0Q56( ) ;
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
      if ( ( A92TBT11_STUDY_ID != Z92TBT11_STUDY_ID ) || ( A93TBT11_SUBJECT_ID != Z93TBT11_SUBJECT_ID ) || ( A94TBT11_CRF_ID != Z94TBT11_CRF_ID ) || ( A936TBT11_CRF_EDA_NO != Z936TBT11_CRF_EDA_NO ) || ( A95TBT11_CRF_VERSION != Z95TBT11_CRF_VERSION ) )
      {
         A92TBT11_STUDY_ID = Z92TBT11_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
         A93TBT11_SUBJECT_ID = Z93TBT11_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
         A94TBT11_CRF_ID = Z94TBT11_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
         A936TBT11_CRF_EDA_NO = Z936TBT11_CRF_EDA_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
         A95TBT11_CRF_VERSION = Z95TBT11_CRF_VERSION ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBT11_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
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
      if ( RcdFound56 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT11_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0Q56( ) ;
      if ( RcdFound56 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0Q56( ) ;
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
      if ( RcdFound56 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
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
      if ( RcdFound56 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
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
      scanStart0Q56( ) ;
      if ( RcdFound56 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound56 != 0 )
         {
            scanNext0Q56( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0Q56( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0Q56( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000Q2 */
         pr_default.execute(0, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT11_CRF_HISTORY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z458TBT11_CRT_DATETIME.equals( T000Q2_A458TBT11_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z459TBT11_CRT_USER_ID, T000Q2_A459TBT11_CRT_USER_ID[0]) != 0 ) || !( Z461TBT11_UPD_DATETIME.equals( T000Q2_A461TBT11_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z462TBT11_UPD_USER_ID, T000Q2_A462TBT11_UPD_USER_ID[0]) != 0 ) || ( Z464TBT11_UPD_CNT != T000Q2_A464TBT11_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z665TBT11_CRF_INPUT_LEVEL != T000Q2_A665TBT11_CRF_INPUT_LEVEL[0] ) || !( Z666TBT11_UPLOAD_DATETIME.equals( T000Q2_A666TBT11_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z667TBT11_UPLOAD_USER_ID, T000Q2_A667TBT11_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z668TBT11_UPLOAD_AUTH_CD, T000Q2_A668TBT11_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z669TBT11_DM_ARRIVAL_FLG, T000Q2_A669TBT11_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z670TBT11_DM_ARRIVAL_DATETIME.equals( T000Q2_A670TBT11_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z671TBT11_APPROVAL_FLG, T000Q2_A671TBT11_APPROVAL_FLG[0]) != 0 ) || !( Z672TBT11_APPROVAL_DATETIME.equals( T000Q2_A672TBT11_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z673TBT11_APPROVAL_USER_ID, T000Q2_A673TBT11_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z674TBT11_APPROVAL_AUTH_CD, T000Q2_A674TBT11_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z993TBT11_SIGNATURE_FLG, T000Q2_A993TBT11_SIGNATURE_FLG[0]) != 0 ) || !( Z994TBT11_SIGNATURE_DATETIME.equals( T000Q2_A994TBT11_SIGNATURE_DATETIME[0] ) ) || ( GXutil.strcmp(Z995TBT11_SIGNATURE_USER_ID, T000Q2_A995TBT11_SIGNATURE_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z675TBT11_INPUT_END_FLG, T000Q2_A675TBT11_INPUT_END_FLG[0]) != 0 ) || !( Z676TBT11_INPUT_END_DATETIME.equals( T000Q2_A676TBT11_INPUT_END_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z677TBT11_INPUT_END_USER_ID, T000Q2_A677TBT11_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z678TBT11_INPUT_END_AUTH_CD, T000Q2_A678TBT11_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z891TBT11_UPD_RIYU, T000Q2_A891TBT11_UPD_RIYU[0]) != 0 ) || ( GXutil.strcmp(Z457TBT11_DEL_FLG, T000Q2_A457TBT11_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z460TBT11_CRT_PROG_NM, T000Q2_A460TBT11_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z463TBT11_UPD_PROG_NM, T000Q2_A463TBT11_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT11_CRF_HISTORY"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Q56( )
   {
      beforeValidate0Q56( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q56( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Q56( 0) ;
         checkOptimisticConcurrency0Q56( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q56( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Q56( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q8 */
                  pr_default.execute(6, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION), new Boolean(n458TBT11_CRT_DATETIME), A458TBT11_CRT_DATETIME, new Boolean(n459TBT11_CRT_USER_ID), A459TBT11_CRT_USER_ID, new Boolean(n461TBT11_UPD_DATETIME), A461TBT11_UPD_DATETIME, new Boolean(n462TBT11_UPD_USER_ID), A462TBT11_UPD_USER_ID, new Boolean(n464TBT11_UPD_CNT), new Long(A464TBT11_UPD_CNT), new Boolean(n665TBT11_CRF_INPUT_LEVEL), new Byte(A665TBT11_CRF_INPUT_LEVEL), new Boolean(n666TBT11_UPLOAD_DATETIME), A666TBT11_UPLOAD_DATETIME, new Boolean(n667TBT11_UPLOAD_USER_ID), A667TBT11_UPLOAD_USER_ID, new Boolean(n668TBT11_UPLOAD_AUTH_CD), A668TBT11_UPLOAD_AUTH_CD, new Boolean(n669TBT11_DM_ARRIVAL_FLG), A669TBT11_DM_ARRIVAL_FLG, new Boolean(n670TBT11_DM_ARRIVAL_DATETIME), A670TBT11_DM_ARRIVAL_DATETIME, new Boolean(n671TBT11_APPROVAL_FLG), A671TBT11_APPROVAL_FLG, new Boolean(n672TBT11_APPROVAL_DATETIME), A672TBT11_APPROVAL_DATETIME, new Boolean(n673TBT11_APPROVAL_USER_ID), A673TBT11_APPROVAL_USER_ID, new Boolean(n674TBT11_APPROVAL_AUTH_CD), A674TBT11_APPROVAL_AUTH_CD, new Boolean(n993TBT11_SIGNATURE_FLG), A993TBT11_SIGNATURE_FLG, new Boolean(n994TBT11_SIGNATURE_DATETIME), A994TBT11_SIGNATURE_DATETIME, new Boolean(n995TBT11_SIGNATURE_USER_ID), A995TBT11_SIGNATURE_USER_ID, new Boolean(n675TBT11_INPUT_END_FLG), A675TBT11_INPUT_END_FLG, new Boolean(n676TBT11_INPUT_END_DATETIME), A676TBT11_INPUT_END_DATETIME, new Boolean(n677TBT11_INPUT_END_USER_ID), A677TBT11_INPUT_END_USER_ID, new Boolean(n678TBT11_INPUT_END_AUTH_CD), A678TBT11_INPUT_END_AUTH_CD, new Boolean(n891TBT11_UPD_RIYU), A891TBT11_UPD_RIYU, new Boolean(n457TBT11_DEL_FLG), A457TBT11_DEL_FLG, new Boolean(n460TBT11_CRT_PROG_NM), A460TBT11_CRT_PROG_NM, new Boolean(n463TBT11_UPD_PROG_NM), A463TBT11_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
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
                        resetCaption0Q0( ) ;
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
            load0Q56( ) ;
         }
         endLevel0Q56( ) ;
      }
      closeExtendedTableCursors0Q56( ) ;
   }

   public void update0Q56( )
   {
      beforeValidate0Q56( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q56( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q56( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q56( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Q56( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q9 */
                  pr_default.execute(7, new Object[] {new Boolean(n458TBT11_CRT_DATETIME), A458TBT11_CRT_DATETIME, new Boolean(n459TBT11_CRT_USER_ID), A459TBT11_CRT_USER_ID, new Boolean(n461TBT11_UPD_DATETIME), A461TBT11_UPD_DATETIME, new Boolean(n462TBT11_UPD_USER_ID), A462TBT11_UPD_USER_ID, new Boolean(n464TBT11_UPD_CNT), new Long(A464TBT11_UPD_CNT), new Boolean(n665TBT11_CRF_INPUT_LEVEL), new Byte(A665TBT11_CRF_INPUT_LEVEL), new Boolean(n666TBT11_UPLOAD_DATETIME), A666TBT11_UPLOAD_DATETIME, new Boolean(n667TBT11_UPLOAD_USER_ID), A667TBT11_UPLOAD_USER_ID, new Boolean(n668TBT11_UPLOAD_AUTH_CD), A668TBT11_UPLOAD_AUTH_CD, new Boolean(n669TBT11_DM_ARRIVAL_FLG), A669TBT11_DM_ARRIVAL_FLG, new Boolean(n670TBT11_DM_ARRIVAL_DATETIME), A670TBT11_DM_ARRIVAL_DATETIME, new Boolean(n671TBT11_APPROVAL_FLG), A671TBT11_APPROVAL_FLG, new Boolean(n672TBT11_APPROVAL_DATETIME), A672TBT11_APPROVAL_DATETIME, new Boolean(n673TBT11_APPROVAL_USER_ID), A673TBT11_APPROVAL_USER_ID, new Boolean(n674TBT11_APPROVAL_AUTH_CD), A674TBT11_APPROVAL_AUTH_CD, new Boolean(n993TBT11_SIGNATURE_FLG), A993TBT11_SIGNATURE_FLG, new Boolean(n994TBT11_SIGNATURE_DATETIME), A994TBT11_SIGNATURE_DATETIME, new Boolean(n995TBT11_SIGNATURE_USER_ID), A995TBT11_SIGNATURE_USER_ID, new Boolean(n675TBT11_INPUT_END_FLG), A675TBT11_INPUT_END_FLG, new Boolean(n676TBT11_INPUT_END_DATETIME), A676TBT11_INPUT_END_DATETIME, new Boolean(n677TBT11_INPUT_END_USER_ID), A677TBT11_INPUT_END_USER_ID, new Boolean(n678TBT11_INPUT_END_AUTH_CD), A678TBT11_INPUT_END_AUTH_CD, new Boolean(n891TBT11_UPD_RIYU), A891TBT11_UPD_RIYU, new Boolean(n457TBT11_DEL_FLG), A457TBT11_DEL_FLG, new Boolean(n460TBT11_CRT_PROG_NM), A460TBT11_CRT_PROG_NM, new Boolean(n463TBT11_UPD_PROG_NM), A463TBT11_UPD_PROG_NM, new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT11_CRF_HISTORY"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Q56( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0Q0( ) ;
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
         endLevel0Q56( ) ;
      }
      closeExtendedTableCursors0Q56( ) ;
   }

   public void deferredUpdate0Q56( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0Q56( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q56( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Q56( ) ;
         afterConfirm0Q56( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Q56( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000Q10 */
               pr_default.execute(8, new Object[] {new Long(A92TBT11_STUDY_ID), new Integer(A93TBT11_SUBJECT_ID), new Short(A94TBT11_CRF_ID), new Byte(A936TBT11_CRF_EDA_NO), new Short(A95TBT11_CRF_VERSION)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound56 == 0 )
                     {
                        initAll0Q56( ) ;
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
                     resetCaption0Q0( ) ;
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
      sMode56 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0Q56( ) ;
      Gx_mode = sMode56 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0Q56( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT11_CRF_HISTORY" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0Q56( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Q56( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbt11_crf_history");
         if ( AnyError == 0 )
         {
            confirmValues0Q0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbt11_crf_history");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0Q56( )
   {
      /* Scan By routine */
      /* Using cursor T000Q11 */
      pr_default.execute(9);
      RcdFound56 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound56 = (short)(1) ;
         A92TBT11_STUDY_ID = T000Q11_A92TBT11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
         A93TBT11_SUBJECT_ID = T000Q11_A93TBT11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
         A94TBT11_CRF_ID = T000Q11_A94TBT11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
         A936TBT11_CRF_EDA_NO = T000Q11_A936TBT11_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
         A95TBT11_CRF_VERSION = T000Q11_A95TBT11_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Q56( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound56 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound56 = (short)(1) ;
         A92TBT11_STUDY_ID = T000Q11_A92TBT11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
         A93TBT11_SUBJECT_ID = T000Q11_A93TBT11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
         A94TBT11_CRF_ID = T000Q11_A94TBT11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
         A936TBT11_CRF_EDA_NO = T000Q11_A936TBT11_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
         A95TBT11_CRF_VERSION = T000Q11_A95TBT11_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
      }
   }

   public void scanEnd0Q56( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0Q56( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Q56( )
   {
      /* Before Insert Rules */
      A458TBT11_CRT_DATETIME = GXutil.now( ) ;
      n458TBT11_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458TBT11_CRT_DATETIME", localUtil.ttoc( A458TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A459TBT11_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A459TBT11_CRT_USER_ID = GXt_char1 ;
      n459TBT11_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A459TBT11_CRT_USER_ID", A459TBT11_CRT_USER_ID);
      A461TBT11_UPD_DATETIME = GXutil.now( ) ;
      n461TBT11_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A461TBT11_UPD_DATETIME", localUtil.ttoc( A461TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A462TBT11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A462TBT11_UPD_USER_ID = GXt_char1 ;
      n462TBT11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A462TBT11_UPD_USER_ID", A462TBT11_UPD_USER_ID);
      A464TBT11_UPD_CNT = (long)(O464TBT11_UPD_CNT+1) ;
      n464TBT11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0Q56( )
   {
      /* Before Update Rules */
      A461TBT11_UPD_DATETIME = GXutil.now( ) ;
      n461TBT11_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A461TBT11_UPD_DATETIME", localUtil.ttoc( A461TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A462TBT11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A462TBT11_UPD_USER_ID = GXt_char1 ;
      n462TBT11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A462TBT11_UPD_USER_ID", A462TBT11_UPD_USER_ID);
      A464TBT11_UPD_CNT = (long)(O464TBT11_UPD_CNT+1) ;
      n464TBT11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0Q56( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Q56( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Q56( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Q56( )
   {
      edtTBT11_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_STUDY_ID_Enabled, 5, 0)));
      edtTBT11_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT11_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRF_ID_Enabled, 5, 0)));
      edtTBT11_CRF_EDA_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRF_EDA_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRF_EDA_NO_Enabled, 5, 0)));
      edtTBT11_CRF_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRF_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRF_VERSION_Enabled, 5, 0)));
      edtTBT11_CRF_INPUT_LEVEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRF_INPUT_LEVEL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRF_INPUT_LEVEL_Enabled, 5, 0)));
      edtTBT11_UPLOAD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPLOAD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPLOAD_DATETIME_Enabled, 5, 0)));
      edtTBT11_UPLOAD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPLOAD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPLOAD_USER_ID_Enabled, 5, 0)));
      edtTBT11_UPLOAD_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPLOAD_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPLOAD_AUTH_CD_Enabled, 5, 0)));
      edtTBT11_DM_ARRIVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_DM_ARRIVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_DM_ARRIVAL_FLG_Enabled, 5, 0)));
      edtTBT11_DM_ARRIVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_DM_ARRIVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_DM_ARRIVAL_DATETIME_Enabled, 5, 0)));
      edtTBT11_APPROVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_APPROVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_APPROVAL_FLG_Enabled, 5, 0)));
      edtTBT11_APPROVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_APPROVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_APPROVAL_DATETIME_Enabled, 5, 0)));
      edtTBT11_APPROVAL_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_APPROVAL_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_APPROVAL_USER_ID_Enabled, 5, 0)));
      edtTBT11_APPROVAL_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_APPROVAL_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_APPROVAL_AUTH_CD_Enabled, 5, 0)));
      edtTBT11_SIGNATURE_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_SIGNATURE_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_SIGNATURE_FLG_Enabled, 5, 0)));
      edtTBT11_SIGNATURE_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_SIGNATURE_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_SIGNATURE_DATETIME_Enabled, 5, 0)));
      edtTBT11_SIGNATURE_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_SIGNATURE_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_SIGNATURE_USER_ID_Enabled, 5, 0)));
      edtTBT11_INPUT_END_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_INPUT_END_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_INPUT_END_FLG_Enabled, 5, 0)));
      edtTBT11_INPUT_END_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_INPUT_END_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_INPUT_END_DATETIME_Enabled, 5, 0)));
      edtTBT11_INPUT_END_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_INPUT_END_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_INPUT_END_USER_ID_Enabled, 5, 0)));
      edtTBT11_INPUT_END_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_INPUT_END_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_INPUT_END_AUTH_CD_Enabled, 5, 0)));
      edtTBT11_UPD_RIYU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_RIYU_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_RIYU_Enabled, 5, 0)));
      edtTBT11_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_DEL_FLG_Enabled, 5, 0)));
      edtTBT11_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRT_DATETIME_Enabled, 5, 0)));
      edtTBT11_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRT_USER_ID_Enabled, 5, 0)));
      edtTBT11_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBT11_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_DATETIME_Enabled, 5, 0)));
      edtTBT11_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_USER_ID_Enabled, 5, 0)));
      edtTBT11_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBT11_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0Q0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRF修正履歴テーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151320611");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbt11_crf_history") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0Q56( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z92TBT11_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z92TBT11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z93TBT11_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z93TBT11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z94TBT11_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z94TBT11_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z936TBT11_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( Z936TBT11_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z95TBT11_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( Z95TBT11_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z458TBT11_CRT_DATETIME", localUtil.ttoc( Z458TBT11_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z459TBT11_CRT_USER_ID", GXutil.rtrim( Z459TBT11_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z461TBT11_UPD_DATETIME", localUtil.ttoc( Z461TBT11_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z462TBT11_UPD_USER_ID", GXutil.rtrim( Z462TBT11_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z464TBT11_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z464TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z665TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( localUtil.ntoc( Z665TBT11_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z666TBT11_UPLOAD_DATETIME", localUtil.ttoc( Z666TBT11_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z667TBT11_UPLOAD_USER_ID", GXutil.rtrim( Z667TBT11_UPLOAD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z668TBT11_UPLOAD_AUTH_CD", GXutil.rtrim( Z668TBT11_UPLOAD_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z669TBT11_DM_ARRIVAL_FLG", GXutil.rtrim( Z669TBT11_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z670TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( Z670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z671TBT11_APPROVAL_FLG", GXutil.rtrim( Z671TBT11_APPROVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z672TBT11_APPROVAL_DATETIME", localUtil.ttoc( Z672TBT11_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z673TBT11_APPROVAL_USER_ID", GXutil.rtrim( Z673TBT11_APPROVAL_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z674TBT11_APPROVAL_AUTH_CD", GXutil.rtrim( Z674TBT11_APPROVAL_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z993TBT11_SIGNATURE_FLG", GXutil.rtrim( Z993TBT11_SIGNATURE_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z994TBT11_SIGNATURE_DATETIME", localUtil.ttoc( Z994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z995TBT11_SIGNATURE_USER_ID", GXutil.rtrim( Z995TBT11_SIGNATURE_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z675TBT11_INPUT_END_FLG", GXutil.rtrim( Z675TBT11_INPUT_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z676TBT11_INPUT_END_DATETIME", localUtil.ttoc( Z676TBT11_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z677TBT11_INPUT_END_USER_ID", GXutil.rtrim( Z677TBT11_INPUT_END_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z678TBT11_INPUT_END_AUTH_CD", GXutil.rtrim( Z678TBT11_INPUT_END_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z891TBT11_UPD_RIYU", GXutil.rtrim( Z891TBT11_UPD_RIYU));
      GxWebStd.gx_hidden_field( httpContext, "Z457TBT11_DEL_FLG", GXutil.rtrim( Z457TBT11_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z460TBT11_CRT_PROG_NM", GXutil.rtrim( Z460TBT11_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z463TBT11_UPD_PROG_NM", GXutil.rtrim( Z463TBT11_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O464TBT11_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O464TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBT11_CRF_HISTORY" ;
   }

   public String getPgmdesc( )
   {
      return "CRF修正履歴テーブル" ;
   }

   public void initializeNonKey0Q56( )
   {
      A458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n458TBT11_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458TBT11_CRT_DATETIME", localUtil.ttoc( A458TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n458TBT11_CRT_DATETIME = (GXutil.nullDate().equals(A458TBT11_CRT_DATETIME) ? true : false) ;
      A459TBT11_CRT_USER_ID = "" ;
      n459TBT11_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A459TBT11_CRT_USER_ID", A459TBT11_CRT_USER_ID);
      n459TBT11_CRT_USER_ID = ((GXutil.strcmp("", A459TBT11_CRT_USER_ID)==0) ? true : false) ;
      A461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n461TBT11_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A461TBT11_UPD_DATETIME", localUtil.ttoc( A461TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n461TBT11_UPD_DATETIME = (GXutil.nullDate().equals(A461TBT11_UPD_DATETIME) ? true : false) ;
      A462TBT11_UPD_USER_ID = "" ;
      n462TBT11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A462TBT11_UPD_USER_ID", A462TBT11_UPD_USER_ID);
      n462TBT11_UPD_USER_ID = ((GXutil.strcmp("", A462TBT11_UPD_USER_ID)==0) ? true : false) ;
      A464TBT11_UPD_CNT = 0 ;
      n464TBT11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
      n464TBT11_UPD_CNT = ((0==A464TBT11_UPD_CNT) ? true : false) ;
      A665TBT11_CRF_INPUT_LEVEL = (byte)(0) ;
      n665TBT11_CRF_INPUT_LEVEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A665TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A665TBT11_CRF_INPUT_LEVEL, 2, 0)));
      n665TBT11_CRF_INPUT_LEVEL = ((0==A665TBT11_CRF_INPUT_LEVEL) ? true : false) ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n666TBT11_UPLOAD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A666TBT11_UPLOAD_DATETIME", localUtil.ttoc( A666TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n666TBT11_UPLOAD_DATETIME = (GXutil.nullDate().equals(A666TBT11_UPLOAD_DATETIME) ? true : false) ;
      A667TBT11_UPLOAD_USER_ID = "" ;
      n667TBT11_UPLOAD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A667TBT11_UPLOAD_USER_ID", A667TBT11_UPLOAD_USER_ID);
      n667TBT11_UPLOAD_USER_ID = ((GXutil.strcmp("", A667TBT11_UPLOAD_USER_ID)==0) ? true : false) ;
      A668TBT11_UPLOAD_AUTH_CD = "" ;
      n668TBT11_UPLOAD_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A668TBT11_UPLOAD_AUTH_CD", A668TBT11_UPLOAD_AUTH_CD);
      n668TBT11_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A668TBT11_UPLOAD_AUTH_CD)==0) ? true : false) ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      n669TBT11_DM_ARRIVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A669TBT11_DM_ARRIVAL_FLG", A669TBT11_DM_ARRIVAL_FLG);
      n669TBT11_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A669TBT11_DM_ARRIVAL_FLG)==0) ? true : false) ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n670TBT11_DM_ARRIVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A670TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n670TBT11_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A670TBT11_DM_ARRIVAL_DATETIME) ? true : false) ;
      A671TBT11_APPROVAL_FLG = "" ;
      n671TBT11_APPROVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A671TBT11_APPROVAL_FLG", A671TBT11_APPROVAL_FLG);
      n671TBT11_APPROVAL_FLG = ((GXutil.strcmp("", A671TBT11_APPROVAL_FLG)==0) ? true : false) ;
      A672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n672TBT11_APPROVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A672TBT11_APPROVAL_DATETIME", localUtil.ttoc( A672TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n672TBT11_APPROVAL_DATETIME = (GXutil.nullDate().equals(A672TBT11_APPROVAL_DATETIME) ? true : false) ;
      A673TBT11_APPROVAL_USER_ID = "" ;
      n673TBT11_APPROVAL_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A673TBT11_APPROVAL_USER_ID", A673TBT11_APPROVAL_USER_ID);
      n673TBT11_APPROVAL_USER_ID = ((GXutil.strcmp("", A673TBT11_APPROVAL_USER_ID)==0) ? true : false) ;
      A674TBT11_APPROVAL_AUTH_CD = "" ;
      n674TBT11_APPROVAL_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A674TBT11_APPROVAL_AUTH_CD", A674TBT11_APPROVAL_AUTH_CD);
      n674TBT11_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A674TBT11_APPROVAL_AUTH_CD)==0) ? true : false) ;
      A993TBT11_SIGNATURE_FLG = "" ;
      n993TBT11_SIGNATURE_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A993TBT11_SIGNATURE_FLG", A993TBT11_SIGNATURE_FLG);
      n993TBT11_SIGNATURE_FLG = ((GXutil.strcmp("", A993TBT11_SIGNATURE_FLG)==0) ? true : false) ;
      A994TBT11_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n994TBT11_SIGNATURE_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A994TBT11_SIGNATURE_DATETIME", localUtil.ttoc( A994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n994TBT11_SIGNATURE_DATETIME = (GXutil.nullDate().equals(A994TBT11_SIGNATURE_DATETIME) ? true : false) ;
      A995TBT11_SIGNATURE_USER_ID = "" ;
      n995TBT11_SIGNATURE_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A995TBT11_SIGNATURE_USER_ID", A995TBT11_SIGNATURE_USER_ID);
      n995TBT11_SIGNATURE_USER_ID = ((GXutil.strcmp("", A995TBT11_SIGNATURE_USER_ID)==0) ? true : false) ;
      A675TBT11_INPUT_END_FLG = "" ;
      n675TBT11_INPUT_END_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A675TBT11_INPUT_END_FLG", A675TBT11_INPUT_END_FLG);
      n675TBT11_INPUT_END_FLG = ((GXutil.strcmp("", A675TBT11_INPUT_END_FLG)==0) ? true : false) ;
      A676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n676TBT11_INPUT_END_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A676TBT11_INPUT_END_DATETIME", localUtil.ttoc( A676TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n676TBT11_INPUT_END_DATETIME = (GXutil.nullDate().equals(A676TBT11_INPUT_END_DATETIME) ? true : false) ;
      A677TBT11_INPUT_END_USER_ID = "" ;
      n677TBT11_INPUT_END_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A677TBT11_INPUT_END_USER_ID", A677TBT11_INPUT_END_USER_ID);
      n677TBT11_INPUT_END_USER_ID = ((GXutil.strcmp("", A677TBT11_INPUT_END_USER_ID)==0) ? true : false) ;
      A678TBT11_INPUT_END_AUTH_CD = "" ;
      n678TBT11_INPUT_END_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A678TBT11_INPUT_END_AUTH_CD", A678TBT11_INPUT_END_AUTH_CD);
      n678TBT11_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A678TBT11_INPUT_END_AUTH_CD)==0) ? true : false) ;
      A891TBT11_UPD_RIYU = "" ;
      n891TBT11_UPD_RIYU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A891TBT11_UPD_RIYU", A891TBT11_UPD_RIYU);
      n891TBT11_UPD_RIYU = ((GXutil.strcmp("", A891TBT11_UPD_RIYU)==0) ? true : false) ;
      A457TBT11_DEL_FLG = "" ;
      n457TBT11_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A457TBT11_DEL_FLG", A457TBT11_DEL_FLG);
      n457TBT11_DEL_FLG = ((GXutil.strcmp("", A457TBT11_DEL_FLG)==0) ? true : false) ;
      A460TBT11_CRT_PROG_NM = "" ;
      n460TBT11_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A460TBT11_CRT_PROG_NM", A460TBT11_CRT_PROG_NM);
      n460TBT11_CRT_PROG_NM = ((GXutil.strcmp("", A460TBT11_CRT_PROG_NM)==0) ? true : false) ;
      A463TBT11_UPD_PROG_NM = "" ;
      n463TBT11_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A463TBT11_UPD_PROG_NM", A463TBT11_UPD_PROG_NM);
      n463TBT11_UPD_PROG_NM = ((GXutil.strcmp("", A463TBT11_UPD_PROG_NM)==0) ? true : false) ;
      O464TBT11_UPD_CNT = A464TBT11_UPD_CNT ;
      n464TBT11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A464TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A464TBT11_UPD_CNT, 10, 0)));
   }

   public void initAll0Q56( )
   {
      A92TBT11_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A92TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A92TBT11_STUDY_ID, 10, 0)));
      A93TBT11_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A93TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A93TBT11_SUBJECT_ID, 6, 0)));
      A94TBT11_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A94TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A94TBT11_CRF_ID, 4, 0)));
      A936TBT11_CRF_EDA_NO = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A936TBT11_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A936TBT11_CRF_EDA_NO, 2, 0)));
      A95TBT11_CRF_VERSION = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A95TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A95TBT11_CRF_VERSION, 4, 0)));
      initializeNonKey0Q56( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151320621");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbt11_crf_history.js", "?20207151320621");
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
      lblTextblocktbt11_study_id_Internalname = "TEXTBLOCKTBT11_STUDY_ID" ;
      edtTBT11_STUDY_ID_Internalname = "TBT11_STUDY_ID" ;
      lblTextblocktbt11_subject_id_Internalname = "TEXTBLOCKTBT11_SUBJECT_ID" ;
      edtTBT11_SUBJECT_ID_Internalname = "TBT11_SUBJECT_ID" ;
      lblTextblocktbt11_crf_id_Internalname = "TEXTBLOCKTBT11_CRF_ID" ;
      edtTBT11_CRF_ID_Internalname = "TBT11_CRF_ID" ;
      lblTextblocktbt11_crf_eda_no_Internalname = "TEXTBLOCKTBT11_CRF_EDA_NO" ;
      edtTBT11_CRF_EDA_NO_Internalname = "TBT11_CRF_EDA_NO" ;
      lblTextblocktbt11_crf_version_Internalname = "TEXTBLOCKTBT11_CRF_VERSION" ;
      edtTBT11_CRF_VERSION_Internalname = "TBT11_CRF_VERSION" ;
      lblTextblocktbt11_crf_input_level_Internalname = "TEXTBLOCKTBT11_CRF_INPUT_LEVEL" ;
      edtTBT11_CRF_INPUT_LEVEL_Internalname = "TBT11_CRF_INPUT_LEVEL" ;
      lblTextblocktbt11_upload_datetime_Internalname = "TEXTBLOCKTBT11_UPLOAD_DATETIME" ;
      edtTBT11_UPLOAD_DATETIME_Internalname = "TBT11_UPLOAD_DATETIME" ;
      lblTextblocktbt11_upload_user_id_Internalname = "TEXTBLOCKTBT11_UPLOAD_USER_ID" ;
      edtTBT11_UPLOAD_USER_ID_Internalname = "TBT11_UPLOAD_USER_ID" ;
      lblTextblocktbt11_upload_auth_cd_Internalname = "TEXTBLOCKTBT11_UPLOAD_AUTH_CD" ;
      edtTBT11_UPLOAD_AUTH_CD_Internalname = "TBT11_UPLOAD_AUTH_CD" ;
      lblTextblocktbt11_dm_arrival_flg_Internalname = "TEXTBLOCKTBT11_DM_ARRIVAL_FLG" ;
      edtTBT11_DM_ARRIVAL_FLG_Internalname = "TBT11_DM_ARRIVAL_FLG" ;
      lblTextblocktbt11_dm_arrival_datetime_Internalname = "TEXTBLOCKTBT11_DM_ARRIVAL_DATETIME" ;
      edtTBT11_DM_ARRIVAL_DATETIME_Internalname = "TBT11_DM_ARRIVAL_DATETIME" ;
      lblTextblocktbt11_approval_flg_Internalname = "TEXTBLOCKTBT11_APPROVAL_FLG" ;
      edtTBT11_APPROVAL_FLG_Internalname = "TBT11_APPROVAL_FLG" ;
      lblTextblocktbt11_approval_datetime_Internalname = "TEXTBLOCKTBT11_APPROVAL_DATETIME" ;
      edtTBT11_APPROVAL_DATETIME_Internalname = "TBT11_APPROVAL_DATETIME" ;
      lblTextblocktbt11_approval_user_id_Internalname = "TEXTBLOCKTBT11_APPROVAL_USER_ID" ;
      edtTBT11_APPROVAL_USER_ID_Internalname = "TBT11_APPROVAL_USER_ID" ;
      lblTextblocktbt11_approval_auth_cd_Internalname = "TEXTBLOCKTBT11_APPROVAL_AUTH_CD" ;
      edtTBT11_APPROVAL_AUTH_CD_Internalname = "TBT11_APPROVAL_AUTH_CD" ;
      lblTextblocktbt11_signature_flg_Internalname = "TEXTBLOCKTBT11_SIGNATURE_FLG" ;
      edtTBT11_SIGNATURE_FLG_Internalname = "TBT11_SIGNATURE_FLG" ;
      lblTextblocktbt11_signature_datetime_Internalname = "TEXTBLOCKTBT11_SIGNATURE_DATETIME" ;
      edtTBT11_SIGNATURE_DATETIME_Internalname = "TBT11_SIGNATURE_DATETIME" ;
      lblTextblocktbt11_signature_user_id_Internalname = "TEXTBLOCKTBT11_SIGNATURE_USER_ID" ;
      edtTBT11_SIGNATURE_USER_ID_Internalname = "TBT11_SIGNATURE_USER_ID" ;
      lblTextblocktbt11_input_end_flg_Internalname = "TEXTBLOCKTBT11_INPUT_END_FLG" ;
      edtTBT11_INPUT_END_FLG_Internalname = "TBT11_INPUT_END_FLG" ;
      lblTextblocktbt11_input_end_datetime_Internalname = "TEXTBLOCKTBT11_INPUT_END_DATETIME" ;
      edtTBT11_INPUT_END_DATETIME_Internalname = "TBT11_INPUT_END_DATETIME" ;
      lblTextblocktbt11_input_end_user_id_Internalname = "TEXTBLOCKTBT11_INPUT_END_USER_ID" ;
      edtTBT11_INPUT_END_USER_ID_Internalname = "TBT11_INPUT_END_USER_ID" ;
      lblTextblocktbt11_input_end_auth_cd_Internalname = "TEXTBLOCKTBT11_INPUT_END_AUTH_CD" ;
      edtTBT11_INPUT_END_AUTH_CD_Internalname = "TBT11_INPUT_END_AUTH_CD" ;
      lblTextblocktbt11_upd_riyu_Internalname = "TEXTBLOCKTBT11_UPD_RIYU" ;
      edtTBT11_UPD_RIYU_Internalname = "TBT11_UPD_RIYU" ;
      lblTextblocktbt11_del_flg_Internalname = "TEXTBLOCKTBT11_DEL_FLG" ;
      edtTBT11_DEL_FLG_Internalname = "TBT11_DEL_FLG" ;
      lblTextblocktbt11_crt_datetime_Internalname = "TEXTBLOCKTBT11_CRT_DATETIME" ;
      edtTBT11_CRT_DATETIME_Internalname = "TBT11_CRT_DATETIME" ;
      lblTextblocktbt11_crt_user_id_Internalname = "TEXTBLOCKTBT11_CRT_USER_ID" ;
      edtTBT11_CRT_USER_ID_Internalname = "TBT11_CRT_USER_ID" ;
      lblTextblocktbt11_crt_prog_nm_Internalname = "TEXTBLOCKTBT11_CRT_PROG_NM" ;
      edtTBT11_CRT_PROG_NM_Internalname = "TBT11_CRT_PROG_NM" ;
      lblTextblocktbt11_upd_datetime_Internalname = "TEXTBLOCKTBT11_UPD_DATETIME" ;
      edtTBT11_UPD_DATETIME_Internalname = "TBT11_UPD_DATETIME" ;
      lblTextblocktbt11_upd_user_id_Internalname = "TEXTBLOCKTBT11_UPD_USER_ID" ;
      edtTBT11_UPD_USER_ID_Internalname = "TBT11_UPD_USER_ID" ;
      lblTextblocktbt11_upd_prog_nm_Internalname = "TEXTBLOCKTBT11_UPD_PROG_NM" ;
      edtTBT11_UPD_PROG_NM_Internalname = "TBT11_UPD_PROG_NM" ;
      lblTextblocktbt11_upd_cnt_Internalname = "TEXTBLOCKTBT11_UPD_CNT" ;
      edtTBT11_UPD_CNT_Internalname = "TBT11_UPD_CNT" ;
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
      edtTBT11_UPD_CNT_Jsonclick = "" ;
      edtTBT11_UPD_CNT_Enabled = 1 ;
      edtTBT11_UPD_PROG_NM_Jsonclick = "" ;
      edtTBT11_UPD_PROG_NM_Enabled = 1 ;
      edtTBT11_UPD_USER_ID_Jsonclick = "" ;
      edtTBT11_UPD_USER_ID_Enabled = 1 ;
      edtTBT11_UPD_DATETIME_Jsonclick = "" ;
      edtTBT11_UPD_DATETIME_Enabled = 1 ;
      edtTBT11_CRT_PROG_NM_Jsonclick = "" ;
      edtTBT11_CRT_PROG_NM_Enabled = 1 ;
      edtTBT11_CRT_USER_ID_Jsonclick = "" ;
      edtTBT11_CRT_USER_ID_Enabled = 1 ;
      edtTBT11_CRT_DATETIME_Jsonclick = "" ;
      edtTBT11_CRT_DATETIME_Enabled = 1 ;
      edtTBT11_DEL_FLG_Jsonclick = "" ;
      edtTBT11_DEL_FLG_Enabled = 1 ;
      edtTBT11_UPD_RIYU_Enabled = 1 ;
      edtTBT11_INPUT_END_AUTH_CD_Jsonclick = "" ;
      edtTBT11_INPUT_END_AUTH_CD_Enabled = 1 ;
      edtTBT11_INPUT_END_USER_ID_Jsonclick = "" ;
      edtTBT11_INPUT_END_USER_ID_Enabled = 1 ;
      edtTBT11_INPUT_END_DATETIME_Jsonclick = "" ;
      edtTBT11_INPUT_END_DATETIME_Enabled = 1 ;
      edtTBT11_INPUT_END_FLG_Jsonclick = "" ;
      edtTBT11_INPUT_END_FLG_Enabled = 1 ;
      edtTBT11_SIGNATURE_USER_ID_Jsonclick = "" ;
      edtTBT11_SIGNATURE_USER_ID_Enabled = 1 ;
      edtTBT11_SIGNATURE_DATETIME_Jsonclick = "" ;
      edtTBT11_SIGNATURE_DATETIME_Enabled = 1 ;
      edtTBT11_SIGNATURE_FLG_Jsonclick = "" ;
      edtTBT11_SIGNATURE_FLG_Enabled = 1 ;
      edtTBT11_APPROVAL_AUTH_CD_Jsonclick = "" ;
      edtTBT11_APPROVAL_AUTH_CD_Enabled = 1 ;
      edtTBT11_APPROVAL_USER_ID_Jsonclick = "" ;
      edtTBT11_APPROVAL_USER_ID_Enabled = 1 ;
      edtTBT11_APPROVAL_DATETIME_Jsonclick = "" ;
      edtTBT11_APPROVAL_DATETIME_Enabled = 1 ;
      edtTBT11_APPROVAL_FLG_Jsonclick = "" ;
      edtTBT11_APPROVAL_FLG_Enabled = 1 ;
      edtTBT11_DM_ARRIVAL_DATETIME_Jsonclick = "" ;
      edtTBT11_DM_ARRIVAL_DATETIME_Enabled = 1 ;
      edtTBT11_DM_ARRIVAL_FLG_Jsonclick = "" ;
      edtTBT11_DM_ARRIVAL_FLG_Enabled = 1 ;
      edtTBT11_UPLOAD_AUTH_CD_Jsonclick = "" ;
      edtTBT11_UPLOAD_AUTH_CD_Enabled = 1 ;
      edtTBT11_UPLOAD_USER_ID_Jsonclick = "" ;
      edtTBT11_UPLOAD_USER_ID_Enabled = 1 ;
      edtTBT11_UPLOAD_DATETIME_Jsonclick = "" ;
      edtTBT11_UPLOAD_DATETIME_Enabled = 1 ;
      edtTBT11_CRF_INPUT_LEVEL_Jsonclick = "" ;
      edtTBT11_CRF_INPUT_LEVEL_Enabled = 1 ;
      edtTBT11_CRF_VERSION_Jsonclick = "" ;
      edtTBT11_CRF_VERSION_Enabled = 1 ;
      edtTBT11_CRF_EDA_NO_Jsonclick = "" ;
      edtTBT11_CRF_EDA_NO_Enabled = 1 ;
      edtTBT11_CRF_ID_Jsonclick = "" ;
      edtTBT11_CRF_ID_Enabled = 1 ;
      edtTBT11_SUBJECT_ID_Jsonclick = "" ;
      edtTBT11_SUBJECT_ID_Enabled = 1 ;
      edtTBT11_STUDY_ID_Jsonclick = "" ;
      edtTBT11_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx9asatbt11_crt_user_id0Q56( String Gx_mode )
   {
      GXt_char1 = A459TBT11_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A459TBT11_CRT_USER_ID = GXt_char1 ;
      n459TBT11_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A459TBT11_CRT_USER_ID", A459TBT11_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A459TBT11_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx11asatbt11_upd_user_id0Q56( String Gx_mode )
   {
      GXt_char1 = A462TBT11_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt11_crf_history_impl.this.GXt_char1 = GXv_char2[0] ;
      A462TBT11_UPD_USER_ID = GXt_char1 ;
      n462TBT11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A462TBT11_UPD_USER_ID", A462TBT11_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A462TBT11_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt11_crf_version( long GX_Parm1 ,
                                        int GX_Parm2 ,
                                        short GX_Parm3 ,
                                        byte GX_Parm4 ,
                                        short GX_Parm5 ,
                                        java.util.Date GX_Parm6 ,
                                        String GX_Parm7 ,
                                        java.util.Date GX_Parm8 ,
                                        String GX_Parm9 ,
                                        long GX_Parm10 ,
                                        byte GX_Parm11 ,
                                        java.util.Date GX_Parm12 ,
                                        String GX_Parm13 ,
                                        String GX_Parm14 ,
                                        String GX_Parm15 ,
                                        java.util.Date GX_Parm16 ,
                                        String GX_Parm17 ,
                                        java.util.Date GX_Parm18 ,
                                        String GX_Parm19 ,
                                        String GX_Parm20 ,
                                        String GX_Parm21 ,
                                        java.util.Date GX_Parm22 ,
                                        String GX_Parm23 ,
                                        String GX_Parm24 ,
                                        java.util.Date GX_Parm25 ,
                                        String GX_Parm26 ,
                                        String GX_Parm27 ,
                                        String GX_Parm28 ,
                                        String GX_Parm29 ,
                                        String GX_Parm30 ,
                                        String GX_Parm31 )
   {
      A92TBT11_STUDY_ID = GX_Parm1 ;
      A93TBT11_SUBJECT_ID = GX_Parm2 ;
      A94TBT11_CRF_ID = GX_Parm3 ;
      A936TBT11_CRF_EDA_NO = GX_Parm4 ;
      A95TBT11_CRF_VERSION = GX_Parm5 ;
      A458TBT11_CRT_DATETIME = GX_Parm6 ;
      n458TBT11_CRT_DATETIME = false ;
      A459TBT11_CRT_USER_ID = GX_Parm7 ;
      n459TBT11_CRT_USER_ID = false ;
      A461TBT11_UPD_DATETIME = GX_Parm8 ;
      n461TBT11_UPD_DATETIME = false ;
      A462TBT11_UPD_USER_ID = GX_Parm9 ;
      n462TBT11_UPD_USER_ID = false ;
      A464TBT11_UPD_CNT = GX_Parm10 ;
      n464TBT11_UPD_CNT = false ;
      A665TBT11_CRF_INPUT_LEVEL = GX_Parm11 ;
      n665TBT11_CRF_INPUT_LEVEL = false ;
      A666TBT11_UPLOAD_DATETIME = GX_Parm12 ;
      n666TBT11_UPLOAD_DATETIME = false ;
      A667TBT11_UPLOAD_USER_ID = GX_Parm13 ;
      n667TBT11_UPLOAD_USER_ID = false ;
      A668TBT11_UPLOAD_AUTH_CD = GX_Parm14 ;
      n668TBT11_UPLOAD_AUTH_CD = false ;
      A669TBT11_DM_ARRIVAL_FLG = GX_Parm15 ;
      n669TBT11_DM_ARRIVAL_FLG = false ;
      A670TBT11_DM_ARRIVAL_DATETIME = GX_Parm16 ;
      n670TBT11_DM_ARRIVAL_DATETIME = false ;
      A671TBT11_APPROVAL_FLG = GX_Parm17 ;
      n671TBT11_APPROVAL_FLG = false ;
      A672TBT11_APPROVAL_DATETIME = GX_Parm18 ;
      n672TBT11_APPROVAL_DATETIME = false ;
      A673TBT11_APPROVAL_USER_ID = GX_Parm19 ;
      n673TBT11_APPROVAL_USER_ID = false ;
      A674TBT11_APPROVAL_AUTH_CD = GX_Parm20 ;
      n674TBT11_APPROVAL_AUTH_CD = false ;
      A993TBT11_SIGNATURE_FLG = GX_Parm21 ;
      n993TBT11_SIGNATURE_FLG = false ;
      A994TBT11_SIGNATURE_DATETIME = GX_Parm22 ;
      n994TBT11_SIGNATURE_DATETIME = false ;
      A995TBT11_SIGNATURE_USER_ID = GX_Parm23 ;
      n995TBT11_SIGNATURE_USER_ID = false ;
      A675TBT11_INPUT_END_FLG = GX_Parm24 ;
      n675TBT11_INPUT_END_FLG = false ;
      A676TBT11_INPUT_END_DATETIME = GX_Parm25 ;
      n676TBT11_INPUT_END_DATETIME = false ;
      A677TBT11_INPUT_END_USER_ID = GX_Parm26 ;
      n677TBT11_INPUT_END_USER_ID = false ;
      A678TBT11_INPUT_END_AUTH_CD = GX_Parm27 ;
      n678TBT11_INPUT_END_AUTH_CD = false ;
      A891TBT11_UPD_RIYU = GX_Parm28 ;
      n891TBT11_UPD_RIYU = false ;
      A457TBT11_DEL_FLG = GX_Parm29 ;
      n457TBT11_DEL_FLG = false ;
      A460TBT11_CRT_PROG_NM = GX_Parm30 ;
      n460TBT11_CRT_PROG_NM = false ;
      A463TBT11_UPD_PROG_NM = GX_Parm31 ;
      n463TBT11_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A458TBT11_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A459TBT11_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A461TBT11_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A462TBT11_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A464TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A665TBT11_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.format(A666TBT11_UPLOAD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A667TBT11_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A668TBT11_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A669TBT11_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.format(A670TBT11_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A671TBT11_APPROVAL_FLG));
      isValidOutput.add(localUtil.format(A672TBT11_APPROVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A673TBT11_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( A674TBT11_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A993TBT11_SIGNATURE_FLG));
      isValidOutput.add(localUtil.format(A994TBT11_SIGNATURE_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A995TBT11_SIGNATURE_USER_ID));
      isValidOutput.add(GXutil.rtrim( A675TBT11_INPUT_END_FLG));
      isValidOutput.add(localUtil.format(A676TBT11_INPUT_END_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A677TBT11_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( A678TBT11_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A891TBT11_UPD_RIYU));
      isValidOutput.add(GXutil.rtrim( A457TBT11_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A460TBT11_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A463TBT11_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z92TBT11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z93TBT11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z94TBT11_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z936TBT11_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z95TBT11_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z458TBT11_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z459TBT11_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z461TBT11_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z462TBT11_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z464TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z665TBT11_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z666TBT11_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z667TBT11_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z668TBT11_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z669TBT11_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z670TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z671TBT11_APPROVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z672TBT11_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z673TBT11_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z674TBT11_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z993TBT11_SIGNATURE_FLG));
      isValidOutput.add(localUtil.ttoc( Z994TBT11_SIGNATURE_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z995TBT11_SIGNATURE_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z675TBT11_INPUT_END_FLG));
      isValidOutput.add(localUtil.ttoc( Z676TBT11_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z677TBT11_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z678TBT11_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z891TBT11_UPD_RIYU));
      isValidOutput.add(GXutil.rtrim( Z457TBT11_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z460TBT11_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z463TBT11_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O464TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z459TBT11_CRT_USER_ID = "" ;
      Z461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z462TBT11_UPD_USER_ID = "" ;
      Z666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z667TBT11_UPLOAD_USER_ID = "" ;
      Z668TBT11_UPLOAD_AUTH_CD = "" ;
      Z669TBT11_DM_ARRIVAL_FLG = "" ;
      Z670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z671TBT11_APPROVAL_FLG = "" ;
      Z672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z673TBT11_APPROVAL_USER_ID = "" ;
      Z674TBT11_APPROVAL_AUTH_CD = "" ;
      Z993TBT11_SIGNATURE_FLG = "" ;
      Z994TBT11_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z995TBT11_SIGNATURE_USER_ID = "" ;
      Z675TBT11_INPUT_END_FLG = "" ;
      Z676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z677TBT11_INPUT_END_USER_ID = "" ;
      Z678TBT11_INPUT_END_AUTH_CD = "" ;
      Z891TBT11_UPD_RIYU = "" ;
      Z457TBT11_DEL_FLG = "" ;
      Z460TBT11_CRT_PROG_NM = "" ;
      Z463TBT11_UPD_PROG_NM = "" ;
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
      lblTextblocktbt11_study_id_Jsonclick = "" ;
      lblTextblocktbt11_subject_id_Jsonclick = "" ;
      lblTextblocktbt11_crf_id_Jsonclick = "" ;
      lblTextblocktbt11_crf_eda_no_Jsonclick = "" ;
      lblTextblocktbt11_crf_version_Jsonclick = "" ;
      lblTextblocktbt11_crf_input_level_Jsonclick = "" ;
      lblTextblocktbt11_upload_datetime_Jsonclick = "" ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_upload_user_id_Jsonclick = "" ;
      A667TBT11_UPLOAD_USER_ID = "" ;
      lblTextblocktbt11_upload_auth_cd_Jsonclick = "" ;
      A668TBT11_UPLOAD_AUTH_CD = "" ;
      lblTextblocktbt11_dm_arrival_flg_Jsonclick = "" ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      lblTextblocktbt11_dm_arrival_datetime_Jsonclick = "" ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_approval_flg_Jsonclick = "" ;
      A671TBT11_APPROVAL_FLG = "" ;
      lblTextblocktbt11_approval_datetime_Jsonclick = "" ;
      A672TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_approval_user_id_Jsonclick = "" ;
      A673TBT11_APPROVAL_USER_ID = "" ;
      lblTextblocktbt11_approval_auth_cd_Jsonclick = "" ;
      A674TBT11_APPROVAL_AUTH_CD = "" ;
      lblTextblocktbt11_signature_flg_Jsonclick = "" ;
      A993TBT11_SIGNATURE_FLG = "" ;
      lblTextblocktbt11_signature_datetime_Jsonclick = "" ;
      A994TBT11_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_signature_user_id_Jsonclick = "" ;
      A995TBT11_SIGNATURE_USER_ID = "" ;
      lblTextblocktbt11_input_end_flg_Jsonclick = "" ;
      A675TBT11_INPUT_END_FLG = "" ;
      lblTextblocktbt11_input_end_datetime_Jsonclick = "" ;
      A676TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_input_end_user_id_Jsonclick = "" ;
      A677TBT11_INPUT_END_USER_ID = "" ;
      lblTextblocktbt11_input_end_auth_cd_Jsonclick = "" ;
      A678TBT11_INPUT_END_AUTH_CD = "" ;
      lblTextblocktbt11_upd_riyu_Jsonclick = "" ;
      A891TBT11_UPD_RIYU = "" ;
      lblTextblocktbt11_del_flg_Jsonclick = "" ;
      A457TBT11_DEL_FLG = "" ;
      lblTextblocktbt11_crt_datetime_Jsonclick = "" ;
      A458TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_crt_user_id_Jsonclick = "" ;
      A459TBT11_CRT_USER_ID = "" ;
      lblTextblocktbt11_crt_prog_nm_Jsonclick = "" ;
      A460TBT11_CRT_PROG_NM = "" ;
      lblTextblocktbt11_upd_datetime_Jsonclick = "" ;
      A461TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_upd_user_id_Jsonclick = "" ;
      A462TBT11_UPD_USER_ID = "" ;
      lblTextblocktbt11_upd_prog_nm_Jsonclick = "" ;
      A463TBT11_UPD_PROG_NM = "" ;
      lblTextblocktbt11_upd_cnt_Jsonclick = "" ;
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
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T000Q4_A92TBT11_STUDY_ID = new long[1] ;
      T000Q4_A93TBT11_SUBJECT_ID = new int[1] ;
      T000Q4_A94TBT11_CRF_ID = new short[1] ;
      T000Q4_A936TBT11_CRF_EDA_NO = new byte[1] ;
      T000Q4_A95TBT11_CRF_VERSION = new short[1] ;
      T000Q4_A458TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n458TBT11_CRT_DATETIME = new boolean[] {false} ;
      T000Q4_A459TBT11_CRT_USER_ID = new String[] {""} ;
      T000Q4_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      T000Q4_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      T000Q4_A462TBT11_UPD_USER_ID = new String[] {""} ;
      T000Q4_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      T000Q4_A464TBT11_UPD_CNT = new long[1] ;
      T000Q4_n464TBT11_UPD_CNT = new boolean[] {false} ;
      T000Q4_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      T000Q4_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000Q4_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      T000Q4_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      T000Q4_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      T000Q4_A668TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      T000Q4_n668TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000Q4_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      T000Q4_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000Q4_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000Q4_A671TBT11_APPROVAL_FLG = new String[] {""} ;
      T000Q4_n671TBT11_APPROVAL_FLG = new boolean[] {false} ;
      T000Q4_A672TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n672TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      T000Q4_A673TBT11_APPROVAL_USER_ID = new String[] {""} ;
      T000Q4_n673TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      T000Q4_A674TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      T000Q4_n674TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000Q4_A993TBT11_SIGNATURE_FLG = new String[] {""} ;
      T000Q4_n993TBT11_SIGNATURE_FLG = new boolean[] {false} ;
      T000Q4_A994TBT11_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n994TBT11_SIGNATURE_DATETIME = new boolean[] {false} ;
      T000Q4_A995TBT11_SIGNATURE_USER_ID = new String[] {""} ;
      T000Q4_n995TBT11_SIGNATURE_USER_ID = new boolean[] {false} ;
      T000Q4_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      T000Q4_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      T000Q4_A676TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n676TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      T000Q4_A677TBT11_INPUT_END_USER_ID = new String[] {""} ;
      T000Q4_n677TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      T000Q4_A678TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      T000Q4_n678TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000Q4_A891TBT11_UPD_RIYU = new String[] {""} ;
      T000Q4_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      T000Q4_A457TBT11_DEL_FLG = new String[] {""} ;
      T000Q4_n457TBT11_DEL_FLG = new boolean[] {false} ;
      T000Q4_A460TBT11_CRT_PROG_NM = new String[] {""} ;
      T000Q4_n460TBT11_CRT_PROG_NM = new boolean[] {false} ;
      T000Q4_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      T000Q4_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      T000Q5_A92TBT11_STUDY_ID = new long[1] ;
      T000Q5_A93TBT11_SUBJECT_ID = new int[1] ;
      T000Q5_A94TBT11_CRF_ID = new short[1] ;
      T000Q5_A936TBT11_CRF_EDA_NO = new byte[1] ;
      T000Q5_A95TBT11_CRF_VERSION = new short[1] ;
      T000Q3_A92TBT11_STUDY_ID = new long[1] ;
      T000Q3_A93TBT11_SUBJECT_ID = new int[1] ;
      T000Q3_A94TBT11_CRF_ID = new short[1] ;
      T000Q3_A936TBT11_CRF_EDA_NO = new byte[1] ;
      T000Q3_A95TBT11_CRF_VERSION = new short[1] ;
      T000Q3_A458TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n458TBT11_CRT_DATETIME = new boolean[] {false} ;
      T000Q3_A459TBT11_CRT_USER_ID = new String[] {""} ;
      T000Q3_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      T000Q3_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      T000Q3_A462TBT11_UPD_USER_ID = new String[] {""} ;
      T000Q3_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      T000Q3_A464TBT11_UPD_CNT = new long[1] ;
      T000Q3_n464TBT11_UPD_CNT = new boolean[] {false} ;
      T000Q3_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      T000Q3_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000Q3_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      T000Q3_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      T000Q3_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      T000Q3_A668TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      T000Q3_n668TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000Q3_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      T000Q3_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000Q3_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000Q3_A671TBT11_APPROVAL_FLG = new String[] {""} ;
      T000Q3_n671TBT11_APPROVAL_FLG = new boolean[] {false} ;
      T000Q3_A672TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n672TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      T000Q3_A673TBT11_APPROVAL_USER_ID = new String[] {""} ;
      T000Q3_n673TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      T000Q3_A674TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      T000Q3_n674TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000Q3_A993TBT11_SIGNATURE_FLG = new String[] {""} ;
      T000Q3_n993TBT11_SIGNATURE_FLG = new boolean[] {false} ;
      T000Q3_A994TBT11_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n994TBT11_SIGNATURE_DATETIME = new boolean[] {false} ;
      T000Q3_A995TBT11_SIGNATURE_USER_ID = new String[] {""} ;
      T000Q3_n995TBT11_SIGNATURE_USER_ID = new boolean[] {false} ;
      T000Q3_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      T000Q3_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      T000Q3_A676TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n676TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      T000Q3_A677TBT11_INPUT_END_USER_ID = new String[] {""} ;
      T000Q3_n677TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      T000Q3_A678TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      T000Q3_n678TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000Q3_A891TBT11_UPD_RIYU = new String[] {""} ;
      T000Q3_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      T000Q3_A457TBT11_DEL_FLG = new String[] {""} ;
      T000Q3_n457TBT11_DEL_FLG = new boolean[] {false} ;
      T000Q3_A460TBT11_CRT_PROG_NM = new String[] {""} ;
      T000Q3_n460TBT11_CRT_PROG_NM = new boolean[] {false} ;
      T000Q3_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      T000Q3_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      sMode56 = "" ;
      T000Q6_A92TBT11_STUDY_ID = new long[1] ;
      T000Q6_A93TBT11_SUBJECT_ID = new int[1] ;
      T000Q6_A94TBT11_CRF_ID = new short[1] ;
      T000Q6_A936TBT11_CRF_EDA_NO = new byte[1] ;
      T000Q6_A95TBT11_CRF_VERSION = new short[1] ;
      T000Q7_A92TBT11_STUDY_ID = new long[1] ;
      T000Q7_A93TBT11_SUBJECT_ID = new int[1] ;
      T000Q7_A94TBT11_CRF_ID = new short[1] ;
      T000Q7_A936TBT11_CRF_EDA_NO = new byte[1] ;
      T000Q7_A95TBT11_CRF_VERSION = new short[1] ;
      T000Q2_A92TBT11_STUDY_ID = new long[1] ;
      T000Q2_A93TBT11_SUBJECT_ID = new int[1] ;
      T000Q2_A94TBT11_CRF_ID = new short[1] ;
      T000Q2_A936TBT11_CRF_EDA_NO = new byte[1] ;
      T000Q2_A95TBT11_CRF_VERSION = new short[1] ;
      T000Q2_A458TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n458TBT11_CRT_DATETIME = new boolean[] {false} ;
      T000Q2_A459TBT11_CRT_USER_ID = new String[] {""} ;
      T000Q2_n459TBT11_CRT_USER_ID = new boolean[] {false} ;
      T000Q2_A461TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n461TBT11_UPD_DATETIME = new boolean[] {false} ;
      T000Q2_A462TBT11_UPD_USER_ID = new String[] {""} ;
      T000Q2_n462TBT11_UPD_USER_ID = new boolean[] {false} ;
      T000Q2_A464TBT11_UPD_CNT = new long[1] ;
      T000Q2_n464TBT11_UPD_CNT = new boolean[] {false} ;
      T000Q2_A665TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      T000Q2_n665TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000Q2_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      T000Q2_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      T000Q2_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      T000Q2_A668TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      T000Q2_n668TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000Q2_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      T000Q2_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000Q2_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000Q2_A671TBT11_APPROVAL_FLG = new String[] {""} ;
      T000Q2_n671TBT11_APPROVAL_FLG = new boolean[] {false} ;
      T000Q2_A672TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n672TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      T000Q2_A673TBT11_APPROVAL_USER_ID = new String[] {""} ;
      T000Q2_n673TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      T000Q2_A674TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      T000Q2_n674TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000Q2_A993TBT11_SIGNATURE_FLG = new String[] {""} ;
      T000Q2_n993TBT11_SIGNATURE_FLG = new boolean[] {false} ;
      T000Q2_A994TBT11_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n994TBT11_SIGNATURE_DATETIME = new boolean[] {false} ;
      T000Q2_A995TBT11_SIGNATURE_USER_ID = new String[] {""} ;
      T000Q2_n995TBT11_SIGNATURE_USER_ID = new boolean[] {false} ;
      T000Q2_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      T000Q2_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      T000Q2_A676TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n676TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      T000Q2_A677TBT11_INPUT_END_USER_ID = new String[] {""} ;
      T000Q2_n677TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      T000Q2_A678TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      T000Q2_n678TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000Q2_A891TBT11_UPD_RIYU = new String[] {""} ;
      T000Q2_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      T000Q2_A457TBT11_DEL_FLG = new String[] {""} ;
      T000Q2_n457TBT11_DEL_FLG = new boolean[] {false} ;
      T000Q2_A460TBT11_CRT_PROG_NM = new String[] {""} ;
      T000Q2_n460TBT11_CRT_PROG_NM = new boolean[] {false} ;
      T000Q2_A463TBT11_UPD_PROG_NM = new String[] {""} ;
      T000Q2_n463TBT11_UPD_PROG_NM = new boolean[] {false} ;
      T000Q11_A92TBT11_STUDY_ID = new long[1] ;
      T000Q11_A93TBT11_SUBJECT_ID = new int[1] ;
      T000Q11_A94TBT11_CRF_ID = new short[1] ;
      T000Q11_A936TBT11_CRF_EDA_NO = new byte[1] ;
      T000Q11_A95TBT11_CRF_VERSION = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt11_crf_history__default(),
         new Object[] {
             new Object[] {
            T000Q2_A92TBT11_STUDY_ID, T000Q2_A93TBT11_SUBJECT_ID, T000Q2_A94TBT11_CRF_ID, T000Q2_A936TBT11_CRF_EDA_NO, T000Q2_A95TBT11_CRF_VERSION, T000Q2_A458TBT11_CRT_DATETIME, T000Q2_n458TBT11_CRT_DATETIME, T000Q2_A459TBT11_CRT_USER_ID, T000Q2_n459TBT11_CRT_USER_ID, T000Q2_A461TBT11_UPD_DATETIME,
            T000Q2_n461TBT11_UPD_DATETIME, T000Q2_A462TBT11_UPD_USER_ID, T000Q2_n462TBT11_UPD_USER_ID, T000Q2_A464TBT11_UPD_CNT, T000Q2_n464TBT11_UPD_CNT, T000Q2_A665TBT11_CRF_INPUT_LEVEL, T000Q2_n665TBT11_CRF_INPUT_LEVEL, T000Q2_A666TBT11_UPLOAD_DATETIME, T000Q2_n666TBT11_UPLOAD_DATETIME, T000Q2_A667TBT11_UPLOAD_USER_ID,
            T000Q2_n667TBT11_UPLOAD_USER_ID, T000Q2_A668TBT11_UPLOAD_AUTH_CD, T000Q2_n668TBT11_UPLOAD_AUTH_CD, T000Q2_A669TBT11_DM_ARRIVAL_FLG, T000Q2_n669TBT11_DM_ARRIVAL_FLG, T000Q2_A670TBT11_DM_ARRIVAL_DATETIME, T000Q2_n670TBT11_DM_ARRIVAL_DATETIME, T000Q2_A671TBT11_APPROVAL_FLG, T000Q2_n671TBT11_APPROVAL_FLG, T000Q2_A672TBT11_APPROVAL_DATETIME,
            T000Q2_n672TBT11_APPROVAL_DATETIME, T000Q2_A673TBT11_APPROVAL_USER_ID, T000Q2_n673TBT11_APPROVAL_USER_ID, T000Q2_A674TBT11_APPROVAL_AUTH_CD, T000Q2_n674TBT11_APPROVAL_AUTH_CD, T000Q2_A993TBT11_SIGNATURE_FLG, T000Q2_n993TBT11_SIGNATURE_FLG, T000Q2_A994TBT11_SIGNATURE_DATETIME, T000Q2_n994TBT11_SIGNATURE_DATETIME, T000Q2_A995TBT11_SIGNATURE_USER_ID,
            T000Q2_n995TBT11_SIGNATURE_USER_ID, T000Q2_A675TBT11_INPUT_END_FLG, T000Q2_n675TBT11_INPUT_END_FLG, T000Q2_A676TBT11_INPUT_END_DATETIME, T000Q2_n676TBT11_INPUT_END_DATETIME, T000Q2_A677TBT11_INPUT_END_USER_ID, T000Q2_n677TBT11_INPUT_END_USER_ID, T000Q2_A678TBT11_INPUT_END_AUTH_CD, T000Q2_n678TBT11_INPUT_END_AUTH_CD, T000Q2_A891TBT11_UPD_RIYU,
            T000Q2_n891TBT11_UPD_RIYU, T000Q2_A457TBT11_DEL_FLG, T000Q2_n457TBT11_DEL_FLG, T000Q2_A460TBT11_CRT_PROG_NM, T000Q2_n460TBT11_CRT_PROG_NM, T000Q2_A463TBT11_UPD_PROG_NM, T000Q2_n463TBT11_UPD_PROG_NM
            }
            , new Object[] {
            T000Q3_A92TBT11_STUDY_ID, T000Q3_A93TBT11_SUBJECT_ID, T000Q3_A94TBT11_CRF_ID, T000Q3_A936TBT11_CRF_EDA_NO, T000Q3_A95TBT11_CRF_VERSION, T000Q3_A458TBT11_CRT_DATETIME, T000Q3_n458TBT11_CRT_DATETIME, T000Q3_A459TBT11_CRT_USER_ID, T000Q3_n459TBT11_CRT_USER_ID, T000Q3_A461TBT11_UPD_DATETIME,
            T000Q3_n461TBT11_UPD_DATETIME, T000Q3_A462TBT11_UPD_USER_ID, T000Q3_n462TBT11_UPD_USER_ID, T000Q3_A464TBT11_UPD_CNT, T000Q3_n464TBT11_UPD_CNT, T000Q3_A665TBT11_CRF_INPUT_LEVEL, T000Q3_n665TBT11_CRF_INPUT_LEVEL, T000Q3_A666TBT11_UPLOAD_DATETIME, T000Q3_n666TBT11_UPLOAD_DATETIME, T000Q3_A667TBT11_UPLOAD_USER_ID,
            T000Q3_n667TBT11_UPLOAD_USER_ID, T000Q3_A668TBT11_UPLOAD_AUTH_CD, T000Q3_n668TBT11_UPLOAD_AUTH_CD, T000Q3_A669TBT11_DM_ARRIVAL_FLG, T000Q3_n669TBT11_DM_ARRIVAL_FLG, T000Q3_A670TBT11_DM_ARRIVAL_DATETIME, T000Q3_n670TBT11_DM_ARRIVAL_DATETIME, T000Q3_A671TBT11_APPROVAL_FLG, T000Q3_n671TBT11_APPROVAL_FLG, T000Q3_A672TBT11_APPROVAL_DATETIME,
            T000Q3_n672TBT11_APPROVAL_DATETIME, T000Q3_A673TBT11_APPROVAL_USER_ID, T000Q3_n673TBT11_APPROVAL_USER_ID, T000Q3_A674TBT11_APPROVAL_AUTH_CD, T000Q3_n674TBT11_APPROVAL_AUTH_CD, T000Q3_A993TBT11_SIGNATURE_FLG, T000Q3_n993TBT11_SIGNATURE_FLG, T000Q3_A994TBT11_SIGNATURE_DATETIME, T000Q3_n994TBT11_SIGNATURE_DATETIME, T000Q3_A995TBT11_SIGNATURE_USER_ID,
            T000Q3_n995TBT11_SIGNATURE_USER_ID, T000Q3_A675TBT11_INPUT_END_FLG, T000Q3_n675TBT11_INPUT_END_FLG, T000Q3_A676TBT11_INPUT_END_DATETIME, T000Q3_n676TBT11_INPUT_END_DATETIME, T000Q3_A677TBT11_INPUT_END_USER_ID, T000Q3_n677TBT11_INPUT_END_USER_ID, T000Q3_A678TBT11_INPUT_END_AUTH_CD, T000Q3_n678TBT11_INPUT_END_AUTH_CD, T000Q3_A891TBT11_UPD_RIYU,
            T000Q3_n891TBT11_UPD_RIYU, T000Q3_A457TBT11_DEL_FLG, T000Q3_n457TBT11_DEL_FLG, T000Q3_A460TBT11_CRT_PROG_NM, T000Q3_n460TBT11_CRT_PROG_NM, T000Q3_A463TBT11_UPD_PROG_NM, T000Q3_n463TBT11_UPD_PROG_NM
            }
            , new Object[] {
            T000Q4_A92TBT11_STUDY_ID, T000Q4_A93TBT11_SUBJECT_ID, T000Q4_A94TBT11_CRF_ID, T000Q4_A936TBT11_CRF_EDA_NO, T000Q4_A95TBT11_CRF_VERSION, T000Q4_A458TBT11_CRT_DATETIME, T000Q4_n458TBT11_CRT_DATETIME, T000Q4_A459TBT11_CRT_USER_ID, T000Q4_n459TBT11_CRT_USER_ID, T000Q4_A461TBT11_UPD_DATETIME,
            T000Q4_n461TBT11_UPD_DATETIME, T000Q4_A462TBT11_UPD_USER_ID, T000Q4_n462TBT11_UPD_USER_ID, T000Q4_A464TBT11_UPD_CNT, T000Q4_n464TBT11_UPD_CNT, T000Q4_A665TBT11_CRF_INPUT_LEVEL, T000Q4_n665TBT11_CRF_INPUT_LEVEL, T000Q4_A666TBT11_UPLOAD_DATETIME, T000Q4_n666TBT11_UPLOAD_DATETIME, T000Q4_A667TBT11_UPLOAD_USER_ID,
            T000Q4_n667TBT11_UPLOAD_USER_ID, T000Q4_A668TBT11_UPLOAD_AUTH_CD, T000Q4_n668TBT11_UPLOAD_AUTH_CD, T000Q4_A669TBT11_DM_ARRIVAL_FLG, T000Q4_n669TBT11_DM_ARRIVAL_FLG, T000Q4_A670TBT11_DM_ARRIVAL_DATETIME, T000Q4_n670TBT11_DM_ARRIVAL_DATETIME, T000Q4_A671TBT11_APPROVAL_FLG, T000Q4_n671TBT11_APPROVAL_FLG, T000Q4_A672TBT11_APPROVAL_DATETIME,
            T000Q4_n672TBT11_APPROVAL_DATETIME, T000Q4_A673TBT11_APPROVAL_USER_ID, T000Q4_n673TBT11_APPROVAL_USER_ID, T000Q4_A674TBT11_APPROVAL_AUTH_CD, T000Q4_n674TBT11_APPROVAL_AUTH_CD, T000Q4_A993TBT11_SIGNATURE_FLG, T000Q4_n993TBT11_SIGNATURE_FLG, T000Q4_A994TBT11_SIGNATURE_DATETIME, T000Q4_n994TBT11_SIGNATURE_DATETIME, T000Q4_A995TBT11_SIGNATURE_USER_ID,
            T000Q4_n995TBT11_SIGNATURE_USER_ID, T000Q4_A675TBT11_INPUT_END_FLG, T000Q4_n675TBT11_INPUT_END_FLG, T000Q4_A676TBT11_INPUT_END_DATETIME, T000Q4_n676TBT11_INPUT_END_DATETIME, T000Q4_A677TBT11_INPUT_END_USER_ID, T000Q4_n677TBT11_INPUT_END_USER_ID, T000Q4_A678TBT11_INPUT_END_AUTH_CD, T000Q4_n678TBT11_INPUT_END_AUTH_CD, T000Q4_A891TBT11_UPD_RIYU,
            T000Q4_n891TBT11_UPD_RIYU, T000Q4_A457TBT11_DEL_FLG, T000Q4_n457TBT11_DEL_FLG, T000Q4_A460TBT11_CRT_PROG_NM, T000Q4_n460TBT11_CRT_PROG_NM, T000Q4_A463TBT11_UPD_PROG_NM, T000Q4_n463TBT11_UPD_PROG_NM
            }
            , new Object[] {
            T000Q5_A92TBT11_STUDY_ID, T000Q5_A93TBT11_SUBJECT_ID, T000Q5_A94TBT11_CRF_ID, T000Q5_A936TBT11_CRF_EDA_NO, T000Q5_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            T000Q6_A92TBT11_STUDY_ID, T000Q6_A93TBT11_SUBJECT_ID, T000Q6_A94TBT11_CRF_ID, T000Q6_A936TBT11_CRF_EDA_NO, T000Q6_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            T000Q7_A92TBT11_STUDY_ID, T000Q7_A93TBT11_SUBJECT_ID, T000Q7_A94TBT11_CRF_ID, T000Q7_A936TBT11_CRF_EDA_NO, T000Q7_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Q11_A92TBT11_STUDY_ID, T000Q11_A93TBT11_SUBJECT_ID, T000Q11_A94TBT11_CRF_ID, T000Q11_A936TBT11_CRF_EDA_NO, T000Q11_A95TBT11_CRF_VERSION
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT11_CRF_HISTORY" ;
   }

   private byte Z936TBT11_CRF_EDA_NO ;
   private byte Z665TBT11_CRF_INPUT_LEVEL ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte A665TBT11_CRF_INPUT_LEVEL ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z94TBT11_CRF_ID ;
   private short Z95TBT11_CRF_VERSION ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short RcdFound56 ;
   private short Gx_err ;
   private int Z93TBT11_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT11_STUDY_ID_Enabled ;
   private int A93TBT11_SUBJECT_ID ;
   private int edtTBT11_SUBJECT_ID_Enabled ;
   private int edtTBT11_CRF_ID_Enabled ;
   private int edtTBT11_CRF_EDA_NO_Enabled ;
   private int edtTBT11_CRF_VERSION_Enabled ;
   private int edtTBT11_CRF_INPUT_LEVEL_Enabled ;
   private int edtTBT11_UPLOAD_DATETIME_Enabled ;
   private int edtTBT11_UPLOAD_USER_ID_Enabled ;
   private int edtTBT11_UPLOAD_AUTH_CD_Enabled ;
   private int edtTBT11_DM_ARRIVAL_FLG_Enabled ;
   private int edtTBT11_DM_ARRIVAL_DATETIME_Enabled ;
   private int edtTBT11_APPROVAL_FLG_Enabled ;
   private int edtTBT11_APPROVAL_DATETIME_Enabled ;
   private int edtTBT11_APPROVAL_USER_ID_Enabled ;
   private int edtTBT11_APPROVAL_AUTH_CD_Enabled ;
   private int edtTBT11_SIGNATURE_FLG_Enabled ;
   private int edtTBT11_SIGNATURE_DATETIME_Enabled ;
   private int edtTBT11_SIGNATURE_USER_ID_Enabled ;
   private int edtTBT11_INPUT_END_FLG_Enabled ;
   private int edtTBT11_INPUT_END_DATETIME_Enabled ;
   private int edtTBT11_INPUT_END_USER_ID_Enabled ;
   private int edtTBT11_INPUT_END_AUTH_CD_Enabled ;
   private int edtTBT11_UPD_RIYU_Enabled ;
   private int edtTBT11_DEL_FLG_Enabled ;
   private int edtTBT11_CRT_DATETIME_Enabled ;
   private int edtTBT11_CRT_USER_ID_Enabled ;
   private int edtTBT11_CRT_PROG_NM_Enabled ;
   private int edtTBT11_UPD_DATETIME_Enabled ;
   private int edtTBT11_UPD_USER_ID_Enabled ;
   private int edtTBT11_UPD_PROG_NM_Enabled ;
   private int edtTBT11_UPD_CNT_Enabled ;
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
   private long Z92TBT11_STUDY_ID ;
   private long Z464TBT11_UPD_CNT ;
   private long O464TBT11_UPD_CNT ;
   private long A92TBT11_STUDY_ID ;
   private long A464TBT11_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBT11_STUDY_ID_Internalname ;
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
   private String lblTextblocktbt11_study_id_Internalname ;
   private String lblTextblocktbt11_study_id_Jsonclick ;
   private String edtTBT11_STUDY_ID_Jsonclick ;
   private String lblTextblocktbt11_subject_id_Internalname ;
   private String lblTextblocktbt11_subject_id_Jsonclick ;
   private String edtTBT11_SUBJECT_ID_Internalname ;
   private String edtTBT11_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbt11_crf_id_Internalname ;
   private String lblTextblocktbt11_crf_id_Jsonclick ;
   private String edtTBT11_CRF_ID_Internalname ;
   private String edtTBT11_CRF_ID_Jsonclick ;
   private String lblTextblocktbt11_crf_eda_no_Internalname ;
   private String lblTextblocktbt11_crf_eda_no_Jsonclick ;
   private String edtTBT11_CRF_EDA_NO_Internalname ;
   private String edtTBT11_CRF_EDA_NO_Jsonclick ;
   private String lblTextblocktbt11_crf_version_Internalname ;
   private String lblTextblocktbt11_crf_version_Jsonclick ;
   private String edtTBT11_CRF_VERSION_Internalname ;
   private String edtTBT11_CRF_VERSION_Jsonclick ;
   private String lblTextblocktbt11_crf_input_level_Internalname ;
   private String lblTextblocktbt11_crf_input_level_Jsonclick ;
   private String edtTBT11_CRF_INPUT_LEVEL_Internalname ;
   private String edtTBT11_CRF_INPUT_LEVEL_Jsonclick ;
   private String lblTextblocktbt11_upload_datetime_Internalname ;
   private String lblTextblocktbt11_upload_datetime_Jsonclick ;
   private String edtTBT11_UPLOAD_DATETIME_Internalname ;
   private String edtTBT11_UPLOAD_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_upload_user_id_Internalname ;
   private String lblTextblocktbt11_upload_user_id_Jsonclick ;
   private String edtTBT11_UPLOAD_USER_ID_Internalname ;
   private String edtTBT11_UPLOAD_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_upload_auth_cd_Internalname ;
   private String lblTextblocktbt11_upload_auth_cd_Jsonclick ;
   private String edtTBT11_UPLOAD_AUTH_CD_Internalname ;
   private String edtTBT11_UPLOAD_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt11_dm_arrival_flg_Internalname ;
   private String lblTextblocktbt11_dm_arrival_flg_Jsonclick ;
   private String edtTBT11_DM_ARRIVAL_FLG_Internalname ;
   private String edtTBT11_DM_ARRIVAL_FLG_Jsonclick ;
   private String lblTextblocktbt11_dm_arrival_datetime_Internalname ;
   private String lblTextblocktbt11_dm_arrival_datetime_Jsonclick ;
   private String edtTBT11_DM_ARRIVAL_DATETIME_Internalname ;
   private String edtTBT11_DM_ARRIVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_approval_flg_Internalname ;
   private String lblTextblocktbt11_approval_flg_Jsonclick ;
   private String edtTBT11_APPROVAL_FLG_Internalname ;
   private String edtTBT11_APPROVAL_FLG_Jsonclick ;
   private String lblTextblocktbt11_approval_datetime_Internalname ;
   private String lblTextblocktbt11_approval_datetime_Jsonclick ;
   private String edtTBT11_APPROVAL_DATETIME_Internalname ;
   private String edtTBT11_APPROVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_approval_user_id_Internalname ;
   private String lblTextblocktbt11_approval_user_id_Jsonclick ;
   private String edtTBT11_APPROVAL_USER_ID_Internalname ;
   private String edtTBT11_APPROVAL_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_approval_auth_cd_Internalname ;
   private String lblTextblocktbt11_approval_auth_cd_Jsonclick ;
   private String edtTBT11_APPROVAL_AUTH_CD_Internalname ;
   private String edtTBT11_APPROVAL_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt11_signature_flg_Internalname ;
   private String lblTextblocktbt11_signature_flg_Jsonclick ;
   private String edtTBT11_SIGNATURE_FLG_Internalname ;
   private String edtTBT11_SIGNATURE_FLG_Jsonclick ;
   private String lblTextblocktbt11_signature_datetime_Internalname ;
   private String lblTextblocktbt11_signature_datetime_Jsonclick ;
   private String edtTBT11_SIGNATURE_DATETIME_Internalname ;
   private String edtTBT11_SIGNATURE_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_signature_user_id_Internalname ;
   private String lblTextblocktbt11_signature_user_id_Jsonclick ;
   private String edtTBT11_SIGNATURE_USER_ID_Internalname ;
   private String edtTBT11_SIGNATURE_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_input_end_flg_Internalname ;
   private String lblTextblocktbt11_input_end_flg_Jsonclick ;
   private String edtTBT11_INPUT_END_FLG_Internalname ;
   private String edtTBT11_INPUT_END_FLG_Jsonclick ;
   private String lblTextblocktbt11_input_end_datetime_Internalname ;
   private String lblTextblocktbt11_input_end_datetime_Jsonclick ;
   private String edtTBT11_INPUT_END_DATETIME_Internalname ;
   private String edtTBT11_INPUT_END_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_input_end_user_id_Internalname ;
   private String lblTextblocktbt11_input_end_user_id_Jsonclick ;
   private String edtTBT11_INPUT_END_USER_ID_Internalname ;
   private String edtTBT11_INPUT_END_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_input_end_auth_cd_Internalname ;
   private String lblTextblocktbt11_input_end_auth_cd_Jsonclick ;
   private String edtTBT11_INPUT_END_AUTH_CD_Internalname ;
   private String edtTBT11_INPUT_END_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt11_upd_riyu_Internalname ;
   private String lblTextblocktbt11_upd_riyu_Jsonclick ;
   private String edtTBT11_UPD_RIYU_Internalname ;
   private String lblTextblocktbt11_del_flg_Internalname ;
   private String lblTextblocktbt11_del_flg_Jsonclick ;
   private String edtTBT11_DEL_FLG_Internalname ;
   private String edtTBT11_DEL_FLG_Jsonclick ;
   private String lblTextblocktbt11_crt_datetime_Internalname ;
   private String lblTextblocktbt11_crt_datetime_Jsonclick ;
   private String edtTBT11_CRT_DATETIME_Internalname ;
   private String edtTBT11_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_crt_user_id_Internalname ;
   private String lblTextblocktbt11_crt_user_id_Jsonclick ;
   private String edtTBT11_CRT_USER_ID_Internalname ;
   private String edtTBT11_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_crt_prog_nm_Internalname ;
   private String lblTextblocktbt11_crt_prog_nm_Jsonclick ;
   private String edtTBT11_CRT_PROG_NM_Internalname ;
   private String edtTBT11_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbt11_upd_datetime_Internalname ;
   private String lblTextblocktbt11_upd_datetime_Jsonclick ;
   private String edtTBT11_UPD_DATETIME_Internalname ;
   private String edtTBT11_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_upd_user_id_Internalname ;
   private String lblTextblocktbt11_upd_user_id_Jsonclick ;
   private String edtTBT11_UPD_USER_ID_Internalname ;
   private String edtTBT11_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_upd_prog_nm_Internalname ;
   private String lblTextblocktbt11_upd_prog_nm_Jsonclick ;
   private String edtTBT11_UPD_PROG_NM_Internalname ;
   private String edtTBT11_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbt11_upd_cnt_Internalname ;
   private String lblTextblocktbt11_upd_cnt_Jsonclick ;
   private String edtTBT11_UPD_CNT_Internalname ;
   private String edtTBT11_UPD_CNT_Jsonclick ;
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
   private String sMode56 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z458TBT11_CRT_DATETIME ;
   private java.util.Date Z461TBT11_UPD_DATETIME ;
   private java.util.Date Z666TBT11_UPLOAD_DATETIME ;
   private java.util.Date Z670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z672TBT11_APPROVAL_DATETIME ;
   private java.util.Date Z994TBT11_SIGNATURE_DATETIME ;
   private java.util.Date Z676TBT11_INPUT_END_DATETIME ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A672TBT11_APPROVAL_DATETIME ;
   private java.util.Date A994TBT11_SIGNATURE_DATETIME ;
   private java.util.Date A676TBT11_INPUT_END_DATETIME ;
   private java.util.Date A458TBT11_CRT_DATETIME ;
   private java.util.Date A461TBT11_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n665TBT11_CRF_INPUT_LEVEL ;
   private boolean n666TBT11_UPLOAD_DATETIME ;
   private boolean n667TBT11_UPLOAD_USER_ID ;
   private boolean n668TBT11_UPLOAD_AUTH_CD ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n671TBT11_APPROVAL_FLG ;
   private boolean n672TBT11_APPROVAL_DATETIME ;
   private boolean n673TBT11_APPROVAL_USER_ID ;
   private boolean n674TBT11_APPROVAL_AUTH_CD ;
   private boolean n993TBT11_SIGNATURE_FLG ;
   private boolean n994TBT11_SIGNATURE_DATETIME ;
   private boolean n995TBT11_SIGNATURE_USER_ID ;
   private boolean n675TBT11_INPUT_END_FLG ;
   private boolean n676TBT11_INPUT_END_DATETIME ;
   private boolean n677TBT11_INPUT_END_USER_ID ;
   private boolean n678TBT11_INPUT_END_AUTH_CD ;
   private boolean n891TBT11_UPD_RIYU ;
   private boolean n457TBT11_DEL_FLG ;
   private boolean n458TBT11_CRT_DATETIME ;
   private boolean n459TBT11_CRT_USER_ID ;
   private boolean n460TBT11_CRT_PROG_NM ;
   private boolean n461TBT11_UPD_DATETIME ;
   private boolean n462TBT11_UPD_USER_ID ;
   private boolean n463TBT11_UPD_PROG_NM ;
   private boolean n464TBT11_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z459TBT11_CRT_USER_ID ;
   private String Z462TBT11_UPD_USER_ID ;
   private String Z667TBT11_UPLOAD_USER_ID ;
   private String Z668TBT11_UPLOAD_AUTH_CD ;
   private String Z669TBT11_DM_ARRIVAL_FLG ;
   private String Z671TBT11_APPROVAL_FLG ;
   private String Z673TBT11_APPROVAL_USER_ID ;
   private String Z674TBT11_APPROVAL_AUTH_CD ;
   private String Z993TBT11_SIGNATURE_FLG ;
   private String Z995TBT11_SIGNATURE_USER_ID ;
   private String Z675TBT11_INPUT_END_FLG ;
   private String Z677TBT11_INPUT_END_USER_ID ;
   private String Z678TBT11_INPUT_END_AUTH_CD ;
   private String Z891TBT11_UPD_RIYU ;
   private String Z457TBT11_DEL_FLG ;
   private String Z460TBT11_CRT_PROG_NM ;
   private String Z463TBT11_UPD_PROG_NM ;
   private String A667TBT11_UPLOAD_USER_ID ;
   private String A668TBT11_UPLOAD_AUTH_CD ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A671TBT11_APPROVAL_FLG ;
   private String A673TBT11_APPROVAL_USER_ID ;
   private String A674TBT11_APPROVAL_AUTH_CD ;
   private String A993TBT11_SIGNATURE_FLG ;
   private String A995TBT11_SIGNATURE_USER_ID ;
   private String A675TBT11_INPUT_END_FLG ;
   private String A677TBT11_INPUT_END_USER_ID ;
   private String A678TBT11_INPUT_END_AUTH_CD ;
   private String A891TBT11_UPD_RIYU ;
   private String A457TBT11_DEL_FLG ;
   private String A459TBT11_CRT_USER_ID ;
   private String A460TBT11_CRT_PROG_NM ;
   private String A462TBT11_UPD_USER_ID ;
   private String A463TBT11_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000Q4_A92TBT11_STUDY_ID ;
   private int[] T000Q4_A93TBT11_SUBJECT_ID ;
   private short[] T000Q4_A94TBT11_CRF_ID ;
   private byte[] T000Q4_A936TBT11_CRF_EDA_NO ;
   private short[] T000Q4_A95TBT11_CRF_VERSION ;
   private java.util.Date[] T000Q4_A458TBT11_CRT_DATETIME ;
   private boolean[] T000Q4_n458TBT11_CRT_DATETIME ;
   private String[] T000Q4_A459TBT11_CRT_USER_ID ;
   private boolean[] T000Q4_n459TBT11_CRT_USER_ID ;
   private java.util.Date[] T000Q4_A461TBT11_UPD_DATETIME ;
   private boolean[] T000Q4_n461TBT11_UPD_DATETIME ;
   private String[] T000Q4_A462TBT11_UPD_USER_ID ;
   private boolean[] T000Q4_n462TBT11_UPD_USER_ID ;
   private long[] T000Q4_A464TBT11_UPD_CNT ;
   private boolean[] T000Q4_n464TBT11_UPD_CNT ;
   private byte[] T000Q4_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] T000Q4_n665TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] T000Q4_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] T000Q4_n666TBT11_UPLOAD_DATETIME ;
   private String[] T000Q4_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] T000Q4_n667TBT11_UPLOAD_USER_ID ;
   private String[] T000Q4_A668TBT11_UPLOAD_AUTH_CD ;
   private boolean[] T000Q4_n668TBT11_UPLOAD_AUTH_CD ;
   private String[] T000Q4_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] T000Q4_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000Q4_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] T000Q4_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] T000Q4_A671TBT11_APPROVAL_FLG ;
   private boolean[] T000Q4_n671TBT11_APPROVAL_FLG ;
   private java.util.Date[] T000Q4_A672TBT11_APPROVAL_DATETIME ;
   private boolean[] T000Q4_n672TBT11_APPROVAL_DATETIME ;
   private String[] T000Q4_A673TBT11_APPROVAL_USER_ID ;
   private boolean[] T000Q4_n673TBT11_APPROVAL_USER_ID ;
   private String[] T000Q4_A674TBT11_APPROVAL_AUTH_CD ;
   private boolean[] T000Q4_n674TBT11_APPROVAL_AUTH_CD ;
   private String[] T000Q4_A993TBT11_SIGNATURE_FLG ;
   private boolean[] T000Q4_n993TBT11_SIGNATURE_FLG ;
   private java.util.Date[] T000Q4_A994TBT11_SIGNATURE_DATETIME ;
   private boolean[] T000Q4_n994TBT11_SIGNATURE_DATETIME ;
   private String[] T000Q4_A995TBT11_SIGNATURE_USER_ID ;
   private boolean[] T000Q4_n995TBT11_SIGNATURE_USER_ID ;
   private String[] T000Q4_A675TBT11_INPUT_END_FLG ;
   private boolean[] T000Q4_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] T000Q4_A676TBT11_INPUT_END_DATETIME ;
   private boolean[] T000Q4_n676TBT11_INPUT_END_DATETIME ;
   private String[] T000Q4_A677TBT11_INPUT_END_USER_ID ;
   private boolean[] T000Q4_n677TBT11_INPUT_END_USER_ID ;
   private String[] T000Q4_A678TBT11_INPUT_END_AUTH_CD ;
   private boolean[] T000Q4_n678TBT11_INPUT_END_AUTH_CD ;
   private String[] T000Q4_A891TBT11_UPD_RIYU ;
   private boolean[] T000Q4_n891TBT11_UPD_RIYU ;
   private String[] T000Q4_A457TBT11_DEL_FLG ;
   private boolean[] T000Q4_n457TBT11_DEL_FLG ;
   private String[] T000Q4_A460TBT11_CRT_PROG_NM ;
   private boolean[] T000Q4_n460TBT11_CRT_PROG_NM ;
   private String[] T000Q4_A463TBT11_UPD_PROG_NM ;
   private boolean[] T000Q4_n463TBT11_UPD_PROG_NM ;
   private long[] T000Q5_A92TBT11_STUDY_ID ;
   private int[] T000Q5_A93TBT11_SUBJECT_ID ;
   private short[] T000Q5_A94TBT11_CRF_ID ;
   private byte[] T000Q5_A936TBT11_CRF_EDA_NO ;
   private short[] T000Q5_A95TBT11_CRF_VERSION ;
   private long[] T000Q3_A92TBT11_STUDY_ID ;
   private int[] T000Q3_A93TBT11_SUBJECT_ID ;
   private short[] T000Q3_A94TBT11_CRF_ID ;
   private byte[] T000Q3_A936TBT11_CRF_EDA_NO ;
   private short[] T000Q3_A95TBT11_CRF_VERSION ;
   private java.util.Date[] T000Q3_A458TBT11_CRT_DATETIME ;
   private boolean[] T000Q3_n458TBT11_CRT_DATETIME ;
   private String[] T000Q3_A459TBT11_CRT_USER_ID ;
   private boolean[] T000Q3_n459TBT11_CRT_USER_ID ;
   private java.util.Date[] T000Q3_A461TBT11_UPD_DATETIME ;
   private boolean[] T000Q3_n461TBT11_UPD_DATETIME ;
   private String[] T000Q3_A462TBT11_UPD_USER_ID ;
   private boolean[] T000Q3_n462TBT11_UPD_USER_ID ;
   private long[] T000Q3_A464TBT11_UPD_CNT ;
   private boolean[] T000Q3_n464TBT11_UPD_CNT ;
   private byte[] T000Q3_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] T000Q3_n665TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] T000Q3_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] T000Q3_n666TBT11_UPLOAD_DATETIME ;
   private String[] T000Q3_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] T000Q3_n667TBT11_UPLOAD_USER_ID ;
   private String[] T000Q3_A668TBT11_UPLOAD_AUTH_CD ;
   private boolean[] T000Q3_n668TBT11_UPLOAD_AUTH_CD ;
   private String[] T000Q3_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] T000Q3_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000Q3_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] T000Q3_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] T000Q3_A671TBT11_APPROVAL_FLG ;
   private boolean[] T000Q3_n671TBT11_APPROVAL_FLG ;
   private java.util.Date[] T000Q3_A672TBT11_APPROVAL_DATETIME ;
   private boolean[] T000Q3_n672TBT11_APPROVAL_DATETIME ;
   private String[] T000Q3_A673TBT11_APPROVAL_USER_ID ;
   private boolean[] T000Q3_n673TBT11_APPROVAL_USER_ID ;
   private String[] T000Q3_A674TBT11_APPROVAL_AUTH_CD ;
   private boolean[] T000Q3_n674TBT11_APPROVAL_AUTH_CD ;
   private String[] T000Q3_A993TBT11_SIGNATURE_FLG ;
   private boolean[] T000Q3_n993TBT11_SIGNATURE_FLG ;
   private java.util.Date[] T000Q3_A994TBT11_SIGNATURE_DATETIME ;
   private boolean[] T000Q3_n994TBT11_SIGNATURE_DATETIME ;
   private String[] T000Q3_A995TBT11_SIGNATURE_USER_ID ;
   private boolean[] T000Q3_n995TBT11_SIGNATURE_USER_ID ;
   private String[] T000Q3_A675TBT11_INPUT_END_FLG ;
   private boolean[] T000Q3_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] T000Q3_A676TBT11_INPUT_END_DATETIME ;
   private boolean[] T000Q3_n676TBT11_INPUT_END_DATETIME ;
   private String[] T000Q3_A677TBT11_INPUT_END_USER_ID ;
   private boolean[] T000Q3_n677TBT11_INPUT_END_USER_ID ;
   private String[] T000Q3_A678TBT11_INPUT_END_AUTH_CD ;
   private boolean[] T000Q3_n678TBT11_INPUT_END_AUTH_CD ;
   private String[] T000Q3_A891TBT11_UPD_RIYU ;
   private boolean[] T000Q3_n891TBT11_UPD_RIYU ;
   private String[] T000Q3_A457TBT11_DEL_FLG ;
   private boolean[] T000Q3_n457TBT11_DEL_FLG ;
   private String[] T000Q3_A460TBT11_CRT_PROG_NM ;
   private boolean[] T000Q3_n460TBT11_CRT_PROG_NM ;
   private String[] T000Q3_A463TBT11_UPD_PROG_NM ;
   private boolean[] T000Q3_n463TBT11_UPD_PROG_NM ;
   private long[] T000Q6_A92TBT11_STUDY_ID ;
   private int[] T000Q6_A93TBT11_SUBJECT_ID ;
   private short[] T000Q6_A94TBT11_CRF_ID ;
   private byte[] T000Q6_A936TBT11_CRF_EDA_NO ;
   private short[] T000Q6_A95TBT11_CRF_VERSION ;
   private long[] T000Q7_A92TBT11_STUDY_ID ;
   private int[] T000Q7_A93TBT11_SUBJECT_ID ;
   private short[] T000Q7_A94TBT11_CRF_ID ;
   private byte[] T000Q7_A936TBT11_CRF_EDA_NO ;
   private short[] T000Q7_A95TBT11_CRF_VERSION ;
   private long[] T000Q2_A92TBT11_STUDY_ID ;
   private int[] T000Q2_A93TBT11_SUBJECT_ID ;
   private short[] T000Q2_A94TBT11_CRF_ID ;
   private byte[] T000Q2_A936TBT11_CRF_EDA_NO ;
   private short[] T000Q2_A95TBT11_CRF_VERSION ;
   private java.util.Date[] T000Q2_A458TBT11_CRT_DATETIME ;
   private boolean[] T000Q2_n458TBT11_CRT_DATETIME ;
   private String[] T000Q2_A459TBT11_CRT_USER_ID ;
   private boolean[] T000Q2_n459TBT11_CRT_USER_ID ;
   private java.util.Date[] T000Q2_A461TBT11_UPD_DATETIME ;
   private boolean[] T000Q2_n461TBT11_UPD_DATETIME ;
   private String[] T000Q2_A462TBT11_UPD_USER_ID ;
   private boolean[] T000Q2_n462TBT11_UPD_USER_ID ;
   private long[] T000Q2_A464TBT11_UPD_CNT ;
   private boolean[] T000Q2_n464TBT11_UPD_CNT ;
   private byte[] T000Q2_A665TBT11_CRF_INPUT_LEVEL ;
   private boolean[] T000Q2_n665TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] T000Q2_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] T000Q2_n666TBT11_UPLOAD_DATETIME ;
   private String[] T000Q2_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] T000Q2_n667TBT11_UPLOAD_USER_ID ;
   private String[] T000Q2_A668TBT11_UPLOAD_AUTH_CD ;
   private boolean[] T000Q2_n668TBT11_UPLOAD_AUTH_CD ;
   private String[] T000Q2_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] T000Q2_n669TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000Q2_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] T000Q2_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] T000Q2_A671TBT11_APPROVAL_FLG ;
   private boolean[] T000Q2_n671TBT11_APPROVAL_FLG ;
   private java.util.Date[] T000Q2_A672TBT11_APPROVAL_DATETIME ;
   private boolean[] T000Q2_n672TBT11_APPROVAL_DATETIME ;
   private String[] T000Q2_A673TBT11_APPROVAL_USER_ID ;
   private boolean[] T000Q2_n673TBT11_APPROVAL_USER_ID ;
   private String[] T000Q2_A674TBT11_APPROVAL_AUTH_CD ;
   private boolean[] T000Q2_n674TBT11_APPROVAL_AUTH_CD ;
   private String[] T000Q2_A993TBT11_SIGNATURE_FLG ;
   private boolean[] T000Q2_n993TBT11_SIGNATURE_FLG ;
   private java.util.Date[] T000Q2_A994TBT11_SIGNATURE_DATETIME ;
   private boolean[] T000Q2_n994TBT11_SIGNATURE_DATETIME ;
   private String[] T000Q2_A995TBT11_SIGNATURE_USER_ID ;
   private boolean[] T000Q2_n995TBT11_SIGNATURE_USER_ID ;
   private String[] T000Q2_A675TBT11_INPUT_END_FLG ;
   private boolean[] T000Q2_n675TBT11_INPUT_END_FLG ;
   private java.util.Date[] T000Q2_A676TBT11_INPUT_END_DATETIME ;
   private boolean[] T000Q2_n676TBT11_INPUT_END_DATETIME ;
   private String[] T000Q2_A677TBT11_INPUT_END_USER_ID ;
   private boolean[] T000Q2_n677TBT11_INPUT_END_USER_ID ;
   private String[] T000Q2_A678TBT11_INPUT_END_AUTH_CD ;
   private boolean[] T000Q2_n678TBT11_INPUT_END_AUTH_CD ;
   private String[] T000Q2_A891TBT11_UPD_RIYU ;
   private boolean[] T000Q2_n891TBT11_UPD_RIYU ;
   private String[] T000Q2_A457TBT11_DEL_FLG ;
   private boolean[] T000Q2_n457TBT11_DEL_FLG ;
   private String[] T000Q2_A460TBT11_CRT_PROG_NM ;
   private boolean[] T000Q2_n460TBT11_CRT_PROG_NM ;
   private String[] T000Q2_A463TBT11_UPD_PROG_NM ;
   private boolean[] T000Q2_n463TBT11_UPD_PROG_NM ;
   private long[] T000Q11_A92TBT11_STUDY_ID ;
   private int[] T000Q11_A93TBT11_SUBJECT_ID ;
   private short[] T000Q11_A94TBT11_CRF_ID ;
   private byte[] T000Q11_A936TBT11_CRF_EDA_NO ;
   private short[] T000Q11_A95TBT11_CRF_VERSION ;
}

final  class tbt11_crf_history__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000Q2", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_SIGNATURE_FLG`, `TBT11_SIGNATURE_DATETIME`, `TBT11_SIGNATURE_USER_ID`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Q3", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_SIGNATURE_FLG`, `TBT11_SIGNATURE_DATETIME`, `TBT11_SIGNATURE_USER_ID`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Q4", "SELECT TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_EDA_NO`, TM1.`TBT11_CRF_VERSION`, TM1.`TBT11_CRT_DATETIME`, TM1.`TBT11_CRT_USER_ID`, TM1.`TBT11_UPD_DATETIME`, TM1.`TBT11_UPD_USER_ID`, TM1.`TBT11_UPD_CNT`, TM1.`TBT11_CRF_INPUT_LEVEL`, TM1.`TBT11_UPLOAD_DATETIME`, TM1.`TBT11_UPLOAD_USER_ID`, TM1.`TBT11_UPLOAD_AUTH_CD`, TM1.`TBT11_DM_ARRIVAL_FLG`, TM1.`TBT11_DM_ARRIVAL_DATETIME`, TM1.`TBT11_APPROVAL_FLG`, TM1.`TBT11_APPROVAL_DATETIME`, TM1.`TBT11_APPROVAL_USER_ID`, TM1.`TBT11_APPROVAL_AUTH_CD`, TM1.`TBT11_SIGNATURE_FLG`, TM1.`TBT11_SIGNATURE_DATETIME`, TM1.`TBT11_SIGNATURE_USER_ID`, TM1.`TBT11_INPUT_END_FLG`, TM1.`TBT11_INPUT_END_DATETIME`, TM1.`TBT11_INPUT_END_USER_ID`, TM1.`TBT11_INPUT_END_AUTH_CD`, TM1.`TBT11_UPD_RIYU`, TM1.`TBT11_DEL_FLG`, TM1.`TBT11_CRT_PROG_NM`, TM1.`TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` TM1 WHERE TM1.`TBT11_STUDY_ID` = ? and TM1.`TBT11_SUBJECT_ID` = ? and TM1.`TBT11_CRF_ID` = ? and TM1.`TBT11_CRF_EDA_NO` = ? and TM1.`TBT11_CRF_VERSION` = ? ORDER BY TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_EDA_NO`, TM1.`TBT11_CRF_VERSION` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000Q5", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Q6", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE ( `TBT11_STUDY_ID` > ? or `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` > ? or `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_ID` > ? or `TBT11_CRF_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_EDA_NO` > ? or `TBT11_CRF_EDA_NO` = ? and `TBT11_CRF_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_VERSION` > ?) ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000Q7", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE ( `TBT11_STUDY_ID` < ? or `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` < ? or `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_ID` < ? or `TBT11_CRF_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_EDA_NO` < ? or `TBT11_CRF_EDA_NO` = ? and `TBT11_CRF_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_VERSION` < ?) ORDER BY `TBT11_STUDY_ID` DESC, `TBT11_SUBJECT_ID` DESC, `TBT11_CRF_ID` DESC, `TBT11_CRF_EDA_NO` DESC, `TBT11_CRF_VERSION` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000Q8", "INSERT INTO `TBT11_CRF_HISTORY`(`TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_SIGNATURE_FLG`, `TBT11_SIGNATURE_DATETIME`, `TBT11_SIGNATURE_USER_ID`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000Q9", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_CRT_DATETIME`=?, `TBT11_CRT_USER_ID`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_CNT`=?, `TBT11_CRF_INPUT_LEVEL`=?, `TBT11_UPLOAD_DATETIME`=?, `TBT11_UPLOAD_USER_ID`=?, `TBT11_UPLOAD_AUTH_CD`=?, `TBT11_DM_ARRIVAL_FLG`=?, `TBT11_DM_ARRIVAL_DATETIME`=?, `TBT11_APPROVAL_FLG`=?, `TBT11_APPROVAL_DATETIME`=?, `TBT11_APPROVAL_USER_ID`=?, `TBT11_APPROVAL_AUTH_CD`=?, `TBT11_SIGNATURE_FLG`=?, `TBT11_SIGNATURE_DATETIME`=?, `TBT11_SIGNATURE_USER_ID`=?, `TBT11_INPUT_END_FLG`=?, `TBT11_INPUT_END_DATETIME`=?, `TBT11_INPUT_END_USER_ID`=?, `TBT11_INPUT_END_AUTH_CD`=?, `TBT11_UPD_RIYU`=?, `TBT11_DEL_FLG`=?, `TBT11_CRT_PROG_NM`=?, `TBT11_UPD_PROG_NM`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK)
         ,new UpdateCursor("T000Q10", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_EDA_NO` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK)
         ,new ForEachCursor("T000Q11", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_CRF_VERSION` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(25) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(25) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(25) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setLong(14, ((Number) parms[13]).longValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setLong(14, ((Number) parms[13]).longValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[10], false);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[12], 128);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[14]).longValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[20], 128);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[30], false);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[32], 128);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[38], false);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[40], 128);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[44], false);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[46], 128);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[50], 2000);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[54], 40);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[56], 40);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 2);
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
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 128);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 128);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 2000);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 40);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 40);
               }
               stmt.setLong(27, ((Number) parms[52]).longValue());
               stmt.setInt(28, ((Number) parms[53]).intValue());
               stmt.setShort(29, ((Number) parms[54]).shortValue());
               stmt.setByte(30, ((Number) parms[55]).byteValue());
               stmt.setShort(31, ((Number) parms[56]).shortValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

