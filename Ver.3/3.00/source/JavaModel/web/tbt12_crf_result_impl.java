/*
               File: tbt12_crf_result_impl
        Description: CRF入力結果テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:10.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt12_crf_result_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBT12_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbt12_crt_user_id0R57( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBT12_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbt12_upd_user_id0R57( Gx_mode) ;
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
         Form.getMeta().addItem("description", "CRF入力結果テーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbt12_crf_result_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt12_crf_result_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt12_crf_result_impl.class ));
   }

   public tbt12_crf_result_impl( int remoteHandle ,
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
         wb_table1_2_0R57( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0R57e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0R57( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0R57( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0R57( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0R57e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRF入力結果テーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TBT12_CRF_RESULT.htm");
         wb_table3_28_0R57( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0R57e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0R57e( true) ;
      }
      else
      {
         wb_table1_2_0R57e( false) ;
      }
   }

   public void wb_table3_28_0R57( boolean wbgen )
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
         wb_table4_34_0R57( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0R57e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT12_CRF_RESULT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT12_CRF_RESULT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0R57e( true) ;
      }
      else
      {
         wb_table3_28_0R57e( false) ;
      }
   }

   public void wb_table4_34_0R57( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_study_id_Internalname, "試験ID", "", "", lblTextblocktbt12_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A96TBT12_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT12_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A96TBT12_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A96TBT12_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt12_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A97TBT12_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT12_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A97TBT12_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A97TBT12_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_crf_id_Internalname, "CRFID", "", "", lblTextblocktbt12_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A98TBT12_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBT12_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A98TBT12_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A98TBT12_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_crf_eda_no_Internalname, "CRF枝番", "", "", lblTextblocktbt12_crf_eda_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_CRF_EDA_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A937TBT12_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")), ((edtTBT12_CRF_EDA_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A937TBT12_CRF_EDA_NO), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A937TBT12_CRF_EDA_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_CRF_EDA_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_CRF_EDA_NO_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_crf_item_grp_div_Internalname, "項目・グループ識別区分", "", "", lblTextblocktbt12_crf_item_grp_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_CRF_ITEM_GRP_DIV_Internalname, GXutil.rtrim( A99TBT12_CRF_ITEM_GRP_DIV), GXutil.rtrim( localUtil.format( A99TBT12_CRF_ITEM_GRP_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_CRF_ITEM_GRP_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_CRF_ITEM_GRP_DIV_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_DIV", "left", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_crf_item_grp_cd_Internalname, "CRF項目・項目グループコード", "", "", lblTextblocktbt12_crf_item_grp_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A100TBT12_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A100TBT12_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_CRF_ITEM_GRP_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_CRF_ITEM_GRP_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_crf_value_Internalname, "入力値", "", "", lblTextblocktbt12_crf_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT12_CRF_VALUE_Internalname, GXutil.rtrim( A465TBT12_CRF_VALUE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", (short)(0), 1, edtTBT12_CRF_VALUE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, "", "", (byte)(-1), true, "", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_edit_flg_Internalname, "変更フラグ", "", "", lblTextblocktbt12_edit_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_EDIT_FLG_Internalname, GXutil.rtrim( A679TBT12_EDIT_FLG), GXutil.rtrim( localUtil.format( A679TBT12_EDIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_EDIT_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_EDIT_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt12_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_DEL_FLG_Internalname, GXutil.rtrim( A473TBT12_DEL_FLG), GXutil.rtrim( localUtil.format( A473TBT12_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt12_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT12_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_CRT_DATETIME_Internalname, localUtil.format(A466TBT12_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A466TBT12_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT12_CRF_RESULT.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT12_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT12_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt12_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_CRT_USER_ID_Internalname, GXutil.rtrim( A467TBT12_CRT_USER_ID), GXutil.rtrim( localUtil.format( A467TBT12_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt12_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_CRT_PROG_NM_Internalname, GXutil.rtrim( A468TBT12_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A468TBT12_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt12_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT12_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_UPD_DATETIME_Internalname, localUtil.format(A469TBT12_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A469TBT12_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT12_CRF_RESULT.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT12_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT12_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt12_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_UPD_USER_ID_Internalname, GXutil.rtrim( A470TBT12_UPD_USER_ID), GXutil.rtrim( localUtil.format( A470TBT12_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt12_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_UPD_PROG_NM_Internalname, GXutil.rtrim( A471TBT12_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A471TBT12_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt12_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt12_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT12_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A472TBT12_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT12_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A472TBT12_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A472TBT12_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT12_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT12_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBT12_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0R57e( true) ;
      }
      else
      {
         wb_table4_34_0R57e( false) ;
      }
   }

   public void wb_table2_5_0R57( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT12_CRF_RESULT.htm");
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
         wb_table2_5_0R57e( true) ;
      }
      else
      {
         wb_table2_5_0R57e( false) ;
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
      /* Execute user event: e110R2 */
      e110R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT12_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A96TBT12_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
            }
            else
            {
               A96TBT12_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT12_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT12_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT12_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A97TBT12_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A97TBT12_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT12_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT12_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT12_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A98TBT12_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
            }
            else
            {
               A98TBT12_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT12_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_CRF_EDA_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_CRF_EDA_NO_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT12_CRF_EDA_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT12_CRF_EDA_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A937TBT12_CRF_EDA_NO = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
            }
            else
            {
               A937TBT12_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBT12_CRF_EDA_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
            }
            A99TBT12_CRF_ITEM_GRP_DIV = httpContext.cgiGet( edtTBT12_CRF_ITEM_GRP_DIV_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
            A100TBT12_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBT12_CRF_ITEM_GRP_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
            A465TBT12_CRF_VALUE = httpContext.cgiGet( edtTBT12_CRF_VALUE_Internalname) ;
            n465TBT12_CRF_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A465TBT12_CRF_VALUE", A465TBT12_CRF_VALUE);
            n465TBT12_CRF_VALUE = ((GXutil.strcmp("", A465TBT12_CRF_VALUE)==0) ? true : false) ;
            A679TBT12_EDIT_FLG = httpContext.cgiGet( edtTBT12_EDIT_FLG_Internalname) ;
            n679TBT12_EDIT_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A679TBT12_EDIT_FLG", A679TBT12_EDIT_FLG);
            n679TBT12_EDIT_FLG = ((GXutil.strcmp("", A679TBT12_EDIT_FLG)==0) ? true : false) ;
            A473TBT12_DEL_FLG = httpContext.cgiGet( edtTBT12_DEL_FLG_Internalname) ;
            n473TBT12_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A473TBT12_DEL_FLG", A473TBT12_DEL_FLG);
            n473TBT12_DEL_FLG = ((GXutil.strcmp("", A473TBT12_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT12_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT12_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT12_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n466TBT12_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A466TBT12_CRT_DATETIME", localUtil.ttoc( A466TBT12_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A466TBT12_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT12_CRT_DATETIME_Internalname)) ;
               n466TBT12_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A466TBT12_CRT_DATETIME", localUtil.ttoc( A466TBT12_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n466TBT12_CRT_DATETIME = (GXutil.nullDate().equals(A466TBT12_CRT_DATETIME) ? true : false) ;
            A467TBT12_CRT_USER_ID = httpContext.cgiGet( edtTBT12_CRT_USER_ID_Internalname) ;
            n467TBT12_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A467TBT12_CRT_USER_ID", A467TBT12_CRT_USER_ID);
            n467TBT12_CRT_USER_ID = ((GXutil.strcmp("", A467TBT12_CRT_USER_ID)==0) ? true : false) ;
            A468TBT12_CRT_PROG_NM = httpContext.cgiGet( edtTBT12_CRT_PROG_NM_Internalname) ;
            n468TBT12_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A468TBT12_CRT_PROG_NM", A468TBT12_CRT_PROG_NM);
            n468TBT12_CRT_PROG_NM = ((GXutil.strcmp("", A468TBT12_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT12_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT12_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT12_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n469TBT12_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A469TBT12_UPD_DATETIME", localUtil.ttoc( A469TBT12_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A469TBT12_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT12_UPD_DATETIME_Internalname)) ;
               n469TBT12_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A469TBT12_UPD_DATETIME", localUtil.ttoc( A469TBT12_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n469TBT12_UPD_DATETIME = (GXutil.nullDate().equals(A469TBT12_UPD_DATETIME) ? true : false) ;
            A470TBT12_UPD_USER_ID = httpContext.cgiGet( edtTBT12_UPD_USER_ID_Internalname) ;
            n470TBT12_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A470TBT12_UPD_USER_ID", A470TBT12_UPD_USER_ID);
            n470TBT12_UPD_USER_ID = ((GXutil.strcmp("", A470TBT12_UPD_USER_ID)==0) ? true : false) ;
            A471TBT12_UPD_PROG_NM = httpContext.cgiGet( edtTBT12_UPD_PROG_NM_Internalname) ;
            n471TBT12_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A471TBT12_UPD_PROG_NM", A471TBT12_UPD_PROG_NM);
            n471TBT12_UPD_PROG_NM = ((GXutil.strcmp("", A471TBT12_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT12_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT12_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT12_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A472TBT12_UPD_CNT = 0 ;
               n472TBT12_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A472TBT12_UPD_CNT", GXutil.ltrim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)));
            }
            else
            {
               A472TBT12_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT12_UPD_CNT_Internalname), ".", ",") ;
               n472TBT12_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A472TBT12_UPD_CNT", GXutil.ltrim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)));
            }
            n472TBT12_UPD_CNT = ((0==A472TBT12_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z96TBT12_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z96TBT12_STUDY_ID"), ".", ",") ;
            Z97TBT12_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z97TBT12_SUBJECT_ID"), ".", ",")) ;
            Z98TBT12_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z98TBT12_CRF_ID"), ".", ",")) ;
            Z937TBT12_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z937TBT12_CRF_EDA_NO"), ".", ",")) ;
            Z99TBT12_CRF_ITEM_GRP_DIV = httpContext.cgiGet( "Z99TBT12_CRF_ITEM_GRP_DIV") ;
            Z100TBT12_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z100TBT12_CRF_ITEM_GRP_CD") ;
            Z466TBT12_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z466TBT12_CRT_DATETIME"), 0) ;
            n466TBT12_CRT_DATETIME = (GXutil.nullDate().equals(A466TBT12_CRT_DATETIME) ? true : false) ;
            Z467TBT12_CRT_USER_ID = httpContext.cgiGet( "Z467TBT12_CRT_USER_ID") ;
            n467TBT12_CRT_USER_ID = ((GXutil.strcmp("", A467TBT12_CRT_USER_ID)==0) ? true : false) ;
            Z469TBT12_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z469TBT12_UPD_DATETIME"), 0) ;
            n469TBT12_UPD_DATETIME = (GXutil.nullDate().equals(A469TBT12_UPD_DATETIME) ? true : false) ;
            Z470TBT12_UPD_USER_ID = httpContext.cgiGet( "Z470TBT12_UPD_USER_ID") ;
            n470TBT12_UPD_USER_ID = ((GXutil.strcmp("", A470TBT12_UPD_USER_ID)==0) ? true : false) ;
            Z472TBT12_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z472TBT12_UPD_CNT"), ".", ",") ;
            n472TBT12_UPD_CNT = ((0==A472TBT12_UPD_CNT) ? true : false) ;
            Z465TBT12_CRF_VALUE = httpContext.cgiGet( "Z465TBT12_CRF_VALUE") ;
            n465TBT12_CRF_VALUE = ((GXutil.strcmp("", A465TBT12_CRF_VALUE)==0) ? true : false) ;
            Z679TBT12_EDIT_FLG = httpContext.cgiGet( "Z679TBT12_EDIT_FLG") ;
            n679TBT12_EDIT_FLG = ((GXutil.strcmp("", A679TBT12_EDIT_FLG)==0) ? true : false) ;
            Z473TBT12_DEL_FLG = httpContext.cgiGet( "Z473TBT12_DEL_FLG") ;
            n473TBT12_DEL_FLG = ((GXutil.strcmp("", A473TBT12_DEL_FLG)==0) ? true : false) ;
            Z468TBT12_CRT_PROG_NM = httpContext.cgiGet( "Z468TBT12_CRT_PROG_NM") ;
            n468TBT12_CRT_PROG_NM = ((GXutil.strcmp("", A468TBT12_CRT_PROG_NM)==0) ? true : false) ;
            Z471TBT12_UPD_PROG_NM = httpContext.cgiGet( "Z471TBT12_UPD_PROG_NM") ;
            n471TBT12_UPD_PROG_NM = ((GXutil.strcmp("", A471TBT12_UPD_PROG_NM)==0) ? true : false) ;
            O472TBT12_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O472TBT12_UPD_CNT"), ".", ",") ;
            n472TBT12_UPD_CNT = ((0==A472TBT12_UPD_CNT) ? true : false) ;
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
               A96TBT12_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
               A97TBT12_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
               A98TBT12_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
               A937TBT12_CRF_EDA_NO = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
               A99TBT12_CRF_ITEM_GRP_DIV = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
               A100TBT12_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
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
                     /* Execute user event: e110R2 */
                     e110R2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120R2 */
                     e120R2 ();
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
         /* Execute user event: e120R2 */
         e120R2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0R57( ) ;
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
      disableAttributes0R57( ) ;
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

   public void resetCaption0R0( )
   {
   }

   public void e110R2( )
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

   public void e120R2( )
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

   public void zm0R57( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z466TBT12_CRT_DATETIME = T000R3_A466TBT12_CRT_DATETIME[0] ;
            Z467TBT12_CRT_USER_ID = T000R3_A467TBT12_CRT_USER_ID[0] ;
            Z469TBT12_UPD_DATETIME = T000R3_A469TBT12_UPD_DATETIME[0] ;
            Z470TBT12_UPD_USER_ID = T000R3_A470TBT12_UPD_USER_ID[0] ;
            Z472TBT12_UPD_CNT = T000R3_A472TBT12_UPD_CNT[0] ;
            Z465TBT12_CRF_VALUE = T000R3_A465TBT12_CRF_VALUE[0] ;
            Z679TBT12_EDIT_FLG = T000R3_A679TBT12_EDIT_FLG[0] ;
            Z473TBT12_DEL_FLG = T000R3_A473TBT12_DEL_FLG[0] ;
            Z468TBT12_CRT_PROG_NM = T000R3_A468TBT12_CRT_PROG_NM[0] ;
            Z471TBT12_UPD_PROG_NM = T000R3_A471TBT12_UPD_PROG_NM[0] ;
         }
         else
         {
            Z466TBT12_CRT_DATETIME = A466TBT12_CRT_DATETIME ;
            Z467TBT12_CRT_USER_ID = A467TBT12_CRT_USER_ID ;
            Z469TBT12_UPD_DATETIME = A469TBT12_UPD_DATETIME ;
            Z470TBT12_UPD_USER_ID = A470TBT12_UPD_USER_ID ;
            Z472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
            Z465TBT12_CRF_VALUE = A465TBT12_CRF_VALUE ;
            Z679TBT12_EDIT_FLG = A679TBT12_EDIT_FLG ;
            Z473TBT12_DEL_FLG = A473TBT12_DEL_FLG ;
            Z468TBT12_CRT_PROG_NM = A468TBT12_CRT_PROG_NM ;
            Z471TBT12_UPD_PROG_NM = A471TBT12_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z96TBT12_STUDY_ID = A96TBT12_STUDY_ID ;
         Z97TBT12_SUBJECT_ID = A97TBT12_SUBJECT_ID ;
         Z98TBT12_CRF_ID = A98TBT12_CRF_ID ;
         Z937TBT12_CRF_EDA_NO = A937TBT12_CRF_EDA_NO ;
         Z99TBT12_CRF_ITEM_GRP_DIV = A99TBT12_CRF_ITEM_GRP_DIV ;
         Z100TBT12_CRF_ITEM_GRP_CD = A100TBT12_CRF_ITEM_GRP_CD ;
         Z466TBT12_CRT_DATETIME = A466TBT12_CRT_DATETIME ;
         Z467TBT12_CRT_USER_ID = A467TBT12_CRT_USER_ID ;
         Z469TBT12_UPD_DATETIME = A469TBT12_UPD_DATETIME ;
         Z470TBT12_UPD_USER_ID = A470TBT12_UPD_USER_ID ;
         Z472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
         Z465TBT12_CRF_VALUE = A465TBT12_CRF_VALUE ;
         Z679TBT12_EDIT_FLG = A679TBT12_EDIT_FLG ;
         Z473TBT12_DEL_FLG = A473TBT12_DEL_FLG ;
         Z468TBT12_CRT_PROG_NM = A468TBT12_CRT_PROG_NM ;
         Z471TBT12_UPD_PROG_NM = A471TBT12_UPD_PROG_NM ;
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

   public void load0R57( )
   {
      /* Using cursor T000R4 */
      pr_default.execute(2, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound57 = (short)(1) ;
         A466TBT12_CRT_DATETIME = T000R4_A466TBT12_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A466TBT12_CRT_DATETIME", localUtil.ttoc( A466TBT12_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n466TBT12_CRT_DATETIME = T000R4_n466TBT12_CRT_DATETIME[0] ;
         A467TBT12_CRT_USER_ID = T000R4_A467TBT12_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A467TBT12_CRT_USER_ID", A467TBT12_CRT_USER_ID);
         n467TBT12_CRT_USER_ID = T000R4_n467TBT12_CRT_USER_ID[0] ;
         A469TBT12_UPD_DATETIME = T000R4_A469TBT12_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A469TBT12_UPD_DATETIME", localUtil.ttoc( A469TBT12_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n469TBT12_UPD_DATETIME = T000R4_n469TBT12_UPD_DATETIME[0] ;
         A470TBT12_UPD_USER_ID = T000R4_A470TBT12_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A470TBT12_UPD_USER_ID", A470TBT12_UPD_USER_ID);
         n470TBT12_UPD_USER_ID = T000R4_n470TBT12_UPD_USER_ID[0] ;
         A472TBT12_UPD_CNT = T000R4_A472TBT12_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A472TBT12_UPD_CNT", GXutil.ltrim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)));
         n472TBT12_UPD_CNT = T000R4_n472TBT12_UPD_CNT[0] ;
         A465TBT12_CRF_VALUE = T000R4_A465TBT12_CRF_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A465TBT12_CRF_VALUE", A465TBT12_CRF_VALUE);
         n465TBT12_CRF_VALUE = T000R4_n465TBT12_CRF_VALUE[0] ;
         A679TBT12_EDIT_FLG = T000R4_A679TBT12_EDIT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A679TBT12_EDIT_FLG", A679TBT12_EDIT_FLG);
         n679TBT12_EDIT_FLG = T000R4_n679TBT12_EDIT_FLG[0] ;
         A473TBT12_DEL_FLG = T000R4_A473TBT12_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A473TBT12_DEL_FLG", A473TBT12_DEL_FLG);
         n473TBT12_DEL_FLG = T000R4_n473TBT12_DEL_FLG[0] ;
         A468TBT12_CRT_PROG_NM = T000R4_A468TBT12_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A468TBT12_CRT_PROG_NM", A468TBT12_CRT_PROG_NM);
         n468TBT12_CRT_PROG_NM = T000R4_n468TBT12_CRT_PROG_NM[0] ;
         A471TBT12_UPD_PROG_NM = T000R4_A471TBT12_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A471TBT12_UPD_PROG_NM", A471TBT12_UPD_PROG_NM);
         n471TBT12_UPD_PROG_NM = T000R4_n471TBT12_UPD_PROG_NM[0] ;
         zm0R57( -8) ;
      }
      pr_default.close(2);
      onLoadActions0R57( ) ;
   }

   public void onLoadActions0R57( )
   {
      AV9Pgmname = "TBT12_CRF_RESULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0R57( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT12_CRF_RESULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A466TBT12_CRT_DATETIME) || (( A466TBT12_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A466TBT12_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBT12_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT12_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A469TBT12_UPD_DATETIME) || (( A469TBT12_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A469TBT12_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBT12_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT12_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0R57( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0R57( )
   {
      /* Using cursor T000R5 */
      pr_default.execute(3, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound57 = (short)(1) ;
      }
      else
      {
         RcdFound57 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000R3 */
      pr_default.execute(1, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0R57( 8) ;
         RcdFound57 = (short)(1) ;
         A96TBT12_STUDY_ID = T000R3_A96TBT12_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
         A97TBT12_SUBJECT_ID = T000R3_A97TBT12_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
         A98TBT12_CRF_ID = T000R3_A98TBT12_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
         A937TBT12_CRF_EDA_NO = T000R3_A937TBT12_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
         A99TBT12_CRF_ITEM_GRP_DIV = T000R3_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
         A100TBT12_CRF_ITEM_GRP_CD = T000R3_A100TBT12_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
         A466TBT12_CRT_DATETIME = T000R3_A466TBT12_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A466TBT12_CRT_DATETIME", localUtil.ttoc( A466TBT12_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n466TBT12_CRT_DATETIME = T000R3_n466TBT12_CRT_DATETIME[0] ;
         A467TBT12_CRT_USER_ID = T000R3_A467TBT12_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A467TBT12_CRT_USER_ID", A467TBT12_CRT_USER_ID);
         n467TBT12_CRT_USER_ID = T000R3_n467TBT12_CRT_USER_ID[0] ;
         A469TBT12_UPD_DATETIME = T000R3_A469TBT12_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A469TBT12_UPD_DATETIME", localUtil.ttoc( A469TBT12_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n469TBT12_UPD_DATETIME = T000R3_n469TBT12_UPD_DATETIME[0] ;
         A470TBT12_UPD_USER_ID = T000R3_A470TBT12_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A470TBT12_UPD_USER_ID", A470TBT12_UPD_USER_ID);
         n470TBT12_UPD_USER_ID = T000R3_n470TBT12_UPD_USER_ID[0] ;
         A472TBT12_UPD_CNT = T000R3_A472TBT12_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A472TBT12_UPD_CNT", GXutil.ltrim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)));
         n472TBT12_UPD_CNT = T000R3_n472TBT12_UPD_CNT[0] ;
         A465TBT12_CRF_VALUE = T000R3_A465TBT12_CRF_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A465TBT12_CRF_VALUE", A465TBT12_CRF_VALUE);
         n465TBT12_CRF_VALUE = T000R3_n465TBT12_CRF_VALUE[0] ;
         A679TBT12_EDIT_FLG = T000R3_A679TBT12_EDIT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A679TBT12_EDIT_FLG", A679TBT12_EDIT_FLG);
         n679TBT12_EDIT_FLG = T000R3_n679TBT12_EDIT_FLG[0] ;
         A473TBT12_DEL_FLG = T000R3_A473TBT12_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A473TBT12_DEL_FLG", A473TBT12_DEL_FLG);
         n473TBT12_DEL_FLG = T000R3_n473TBT12_DEL_FLG[0] ;
         A468TBT12_CRT_PROG_NM = T000R3_A468TBT12_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A468TBT12_CRT_PROG_NM", A468TBT12_CRT_PROG_NM);
         n468TBT12_CRT_PROG_NM = T000R3_n468TBT12_CRT_PROG_NM[0] ;
         A471TBT12_UPD_PROG_NM = T000R3_A471TBT12_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A471TBT12_UPD_PROG_NM", A471TBT12_UPD_PROG_NM);
         n471TBT12_UPD_PROG_NM = T000R3_n471TBT12_UPD_PROG_NM[0] ;
         O472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
         n472TBT12_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A472TBT12_UPD_CNT", GXutil.ltrim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)));
         Z96TBT12_STUDY_ID = A96TBT12_STUDY_ID ;
         Z97TBT12_SUBJECT_ID = A97TBT12_SUBJECT_ID ;
         Z98TBT12_CRF_ID = A98TBT12_CRF_ID ;
         Z937TBT12_CRF_EDA_NO = A937TBT12_CRF_EDA_NO ;
         Z99TBT12_CRF_ITEM_GRP_DIV = A99TBT12_CRF_ITEM_GRP_DIV ;
         Z100TBT12_CRF_ITEM_GRP_CD = A100TBT12_CRF_ITEM_GRP_CD ;
         sMode57 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0R57( ) ;
         if ( AnyError == 1 )
         {
            RcdFound57 = (short)(0) ;
            initializeNonKey0R57( ) ;
         }
         Gx_mode = sMode57 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound57 = (short)(0) ;
         initializeNonKey0R57( ) ;
         sMode57 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode57 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0R57( ) ;
      if ( RcdFound57 == 0 )
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
      RcdFound57 = (short)(0) ;
      /* Using cursor T000R6 */
      pr_default.execute(4, new Object[] {new Long(A96TBT12_STUDY_ID), new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Integer(A97TBT12_SUBJECT_ID), new Long(A96TBT12_STUDY_ID), new Short(A98TBT12_CRF_ID), new Short(A98TBT12_CRF_ID), new Integer(A97TBT12_SUBJECT_ID), new Long(A96TBT12_STUDY_ID), new Byte(A937TBT12_CRF_EDA_NO), new Byte(A937TBT12_CRF_EDA_NO), new Short(A98TBT12_CRF_ID), new Integer(A97TBT12_SUBJECT_ID), new Long(A96TBT12_STUDY_ID), A99TBT12_CRF_ITEM_GRP_DIV, A99TBT12_CRF_ITEM_GRP_DIV, new Byte(A937TBT12_CRF_EDA_NO), new Short(A98TBT12_CRF_ID), new Integer(A97TBT12_SUBJECT_ID), new Long(A96TBT12_STUDY_ID), A100TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000R6_A96TBT12_STUDY_ID[0] < A96TBT12_STUDY_ID ) || ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R6_A97TBT12_SUBJECT_ID[0] < A97TBT12_SUBJECT_ID ) || ( T000R6_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R6_A98TBT12_CRF_ID[0] < A98TBT12_CRF_ID ) || ( T000R6_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R6_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R6_A937TBT12_CRF_EDA_NO[0] < A937TBT12_CRF_EDA_NO ) || ( T000R6_A937TBT12_CRF_EDA_NO[0] == A937TBT12_CRF_EDA_NO ) && ( T000R6_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R6_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( GXutil.strcmp(T000R6_A99TBT12_CRF_ITEM_GRP_DIV[0], A99TBT12_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T000R6_A99TBT12_CRF_ITEM_GRP_DIV[0], A99TBT12_CRF_ITEM_GRP_DIV) == 0 ) && ( T000R6_A937TBT12_CRF_EDA_NO[0] == A937TBT12_CRF_EDA_NO ) && ( T000R6_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R6_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( GXutil.strcmp(T000R6_A100TBT12_CRF_ITEM_GRP_CD[0], A100TBT12_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000R6_A96TBT12_STUDY_ID[0] > A96TBT12_STUDY_ID ) || ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R6_A97TBT12_SUBJECT_ID[0] > A97TBT12_SUBJECT_ID ) || ( T000R6_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R6_A98TBT12_CRF_ID[0] > A98TBT12_CRF_ID ) || ( T000R6_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R6_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R6_A937TBT12_CRF_EDA_NO[0] > A937TBT12_CRF_EDA_NO ) || ( T000R6_A937TBT12_CRF_EDA_NO[0] == A937TBT12_CRF_EDA_NO ) && ( T000R6_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R6_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( GXutil.strcmp(T000R6_A99TBT12_CRF_ITEM_GRP_DIV[0], A99TBT12_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T000R6_A99TBT12_CRF_ITEM_GRP_DIV[0], A99TBT12_CRF_ITEM_GRP_DIV) == 0 ) && ( T000R6_A937TBT12_CRF_EDA_NO[0] == A937TBT12_CRF_EDA_NO ) && ( T000R6_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R6_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R6_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( GXutil.strcmp(T000R6_A100TBT12_CRF_ITEM_GRP_CD[0], A100TBT12_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            A96TBT12_STUDY_ID = T000R6_A96TBT12_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
            A97TBT12_SUBJECT_ID = T000R6_A97TBT12_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
            A98TBT12_CRF_ID = T000R6_A98TBT12_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
            A937TBT12_CRF_EDA_NO = T000R6_A937TBT12_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
            A99TBT12_CRF_ITEM_GRP_DIV = T000R6_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
            A100TBT12_CRF_ITEM_GRP_CD = T000R6_A100TBT12_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
            RcdFound57 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound57 = (short)(0) ;
      /* Using cursor T000R7 */
      pr_default.execute(5, new Object[] {new Long(A96TBT12_STUDY_ID), new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Integer(A97TBT12_SUBJECT_ID), new Long(A96TBT12_STUDY_ID), new Short(A98TBT12_CRF_ID), new Short(A98TBT12_CRF_ID), new Integer(A97TBT12_SUBJECT_ID), new Long(A96TBT12_STUDY_ID), new Byte(A937TBT12_CRF_EDA_NO), new Byte(A937TBT12_CRF_EDA_NO), new Short(A98TBT12_CRF_ID), new Integer(A97TBT12_SUBJECT_ID), new Long(A96TBT12_STUDY_ID), A99TBT12_CRF_ITEM_GRP_DIV, A99TBT12_CRF_ITEM_GRP_DIV, new Byte(A937TBT12_CRF_EDA_NO), new Short(A98TBT12_CRF_ID), new Integer(A97TBT12_SUBJECT_ID), new Long(A96TBT12_STUDY_ID), A100TBT12_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000R7_A96TBT12_STUDY_ID[0] > A96TBT12_STUDY_ID ) || ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R7_A97TBT12_SUBJECT_ID[0] > A97TBT12_SUBJECT_ID ) || ( T000R7_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R7_A98TBT12_CRF_ID[0] > A98TBT12_CRF_ID ) || ( T000R7_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R7_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R7_A937TBT12_CRF_EDA_NO[0] > A937TBT12_CRF_EDA_NO ) || ( T000R7_A937TBT12_CRF_EDA_NO[0] == A937TBT12_CRF_EDA_NO ) && ( T000R7_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R7_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( GXutil.strcmp(T000R7_A99TBT12_CRF_ITEM_GRP_DIV[0], A99TBT12_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T000R7_A99TBT12_CRF_ITEM_GRP_DIV[0], A99TBT12_CRF_ITEM_GRP_DIV) == 0 ) && ( T000R7_A937TBT12_CRF_EDA_NO[0] == A937TBT12_CRF_EDA_NO ) && ( T000R7_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R7_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( GXutil.strcmp(T000R7_A100TBT12_CRF_ITEM_GRP_CD[0], A100TBT12_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000R7_A96TBT12_STUDY_ID[0] < A96TBT12_STUDY_ID ) || ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R7_A97TBT12_SUBJECT_ID[0] < A97TBT12_SUBJECT_ID ) || ( T000R7_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R7_A98TBT12_CRF_ID[0] < A98TBT12_CRF_ID ) || ( T000R7_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R7_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( T000R7_A937TBT12_CRF_EDA_NO[0] < A937TBT12_CRF_EDA_NO ) || ( T000R7_A937TBT12_CRF_EDA_NO[0] == A937TBT12_CRF_EDA_NO ) && ( T000R7_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R7_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( GXutil.strcmp(T000R7_A99TBT12_CRF_ITEM_GRP_DIV[0], A99TBT12_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T000R7_A99TBT12_CRF_ITEM_GRP_DIV[0], A99TBT12_CRF_ITEM_GRP_DIV) == 0 ) && ( T000R7_A937TBT12_CRF_EDA_NO[0] == A937TBT12_CRF_EDA_NO ) && ( T000R7_A98TBT12_CRF_ID[0] == A98TBT12_CRF_ID ) && ( T000R7_A97TBT12_SUBJECT_ID[0] == A97TBT12_SUBJECT_ID ) && ( T000R7_A96TBT12_STUDY_ID[0] == A96TBT12_STUDY_ID ) && ( GXutil.strcmp(T000R7_A100TBT12_CRF_ITEM_GRP_CD[0], A100TBT12_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            A96TBT12_STUDY_ID = T000R7_A96TBT12_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
            A97TBT12_SUBJECT_ID = T000R7_A97TBT12_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
            A98TBT12_CRF_ID = T000R7_A98TBT12_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
            A937TBT12_CRF_EDA_NO = T000R7_A937TBT12_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
            A99TBT12_CRF_ITEM_GRP_DIV = T000R7_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
            A100TBT12_CRF_ITEM_GRP_CD = T000R7_A100TBT12_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
            RcdFound57 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0R57( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0R57( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound57 == 1 )
         {
            if ( ( A96TBT12_STUDY_ID != Z96TBT12_STUDY_ID ) || ( A97TBT12_SUBJECT_ID != Z97TBT12_SUBJECT_ID ) || ( A98TBT12_CRF_ID != Z98TBT12_CRF_ID ) || ( A937TBT12_CRF_EDA_NO != Z937TBT12_CRF_EDA_NO ) || ( GXutil.strcmp(A99TBT12_CRF_ITEM_GRP_DIV, Z99TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A100TBT12_CRF_ITEM_GRP_CD, Z100TBT12_CRF_ITEM_GRP_CD) != 0 ) )
            {
               A96TBT12_STUDY_ID = Z96TBT12_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
               A97TBT12_SUBJECT_ID = Z97TBT12_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
               A98TBT12_CRF_ID = Z98TBT12_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
               A937TBT12_CRF_EDA_NO = Z937TBT12_CRF_EDA_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
               A99TBT12_CRF_ITEM_GRP_DIV = Z99TBT12_CRF_ITEM_GRP_DIV ;
               httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
               A100TBT12_CRF_ITEM_GRP_CD = Z100TBT12_CRF_ITEM_GRP_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBT12_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0R57( ) ;
               GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A96TBT12_STUDY_ID != Z96TBT12_STUDY_ID ) || ( A97TBT12_SUBJECT_ID != Z97TBT12_SUBJECT_ID ) || ( A98TBT12_CRF_ID != Z98TBT12_CRF_ID ) || ( A937TBT12_CRF_EDA_NO != Z937TBT12_CRF_EDA_NO ) || ( GXutil.strcmp(A99TBT12_CRF_ITEM_GRP_DIV, Z99TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A100TBT12_CRF_ITEM_GRP_CD, Z100TBT12_CRF_ITEM_GRP_CD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0R57( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBT12_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0R57( ) ;
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
      if ( ( A96TBT12_STUDY_ID != Z96TBT12_STUDY_ID ) || ( A97TBT12_SUBJECT_ID != Z97TBT12_SUBJECT_ID ) || ( A98TBT12_CRF_ID != Z98TBT12_CRF_ID ) || ( A937TBT12_CRF_EDA_NO != Z937TBT12_CRF_EDA_NO ) || ( GXutil.strcmp(A99TBT12_CRF_ITEM_GRP_DIV, Z99TBT12_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A100TBT12_CRF_ITEM_GRP_CD, Z100TBT12_CRF_ITEM_GRP_CD) != 0 ) )
      {
         A96TBT12_STUDY_ID = Z96TBT12_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
         A97TBT12_SUBJECT_ID = Z97TBT12_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
         A98TBT12_CRF_ID = Z98TBT12_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
         A937TBT12_CRF_EDA_NO = Z937TBT12_CRF_EDA_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
         A99TBT12_CRF_ITEM_GRP_DIV = Z99TBT12_CRF_ITEM_GRP_DIV ;
         httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
         A100TBT12_CRF_ITEM_GRP_CD = Z100TBT12_CRF_ITEM_GRP_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBT12_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
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
      if ( RcdFound57 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT12_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT12_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBT12_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0R57( ) ;
      if ( RcdFound57 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT12_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0R57( ) ;
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
      if ( RcdFound57 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT12_CRF_VALUE_Internalname ;
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
      if ( RcdFound57 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT12_CRF_VALUE_Internalname ;
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
      scanStart0R57( ) ;
      if ( RcdFound57 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound57 != 0 )
         {
            scanNext0R57( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT12_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0R57( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0R57( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000R2 */
         pr_default.execute(0, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT12_CRF_RESULT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z466TBT12_CRT_DATETIME.equals( T000R2_A466TBT12_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z467TBT12_CRT_USER_ID, T000R2_A467TBT12_CRT_USER_ID[0]) != 0 ) || !( Z469TBT12_UPD_DATETIME.equals( T000R2_A469TBT12_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z470TBT12_UPD_USER_ID, T000R2_A470TBT12_UPD_USER_ID[0]) != 0 ) || ( Z472TBT12_UPD_CNT != T000R2_A472TBT12_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z465TBT12_CRF_VALUE, T000R2_A465TBT12_CRF_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z679TBT12_EDIT_FLG, T000R2_A679TBT12_EDIT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z473TBT12_DEL_FLG, T000R2_A473TBT12_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z468TBT12_CRT_PROG_NM, T000R2_A468TBT12_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z471TBT12_UPD_PROG_NM, T000R2_A471TBT12_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT12_CRF_RESULT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0R57( )
   {
      beforeValidate0R57( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0R57( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0R57( 0) ;
         checkOptimisticConcurrency0R57( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0R57( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0R57( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000R8 */
                  pr_default.execute(6, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD, new Boolean(n466TBT12_CRT_DATETIME), A466TBT12_CRT_DATETIME, new Boolean(n467TBT12_CRT_USER_ID), A467TBT12_CRT_USER_ID, new Boolean(n469TBT12_UPD_DATETIME), A469TBT12_UPD_DATETIME, new Boolean(n470TBT12_UPD_USER_ID), A470TBT12_UPD_USER_ID, new Boolean(n472TBT12_UPD_CNT), new Long(A472TBT12_UPD_CNT), new Boolean(n465TBT12_CRF_VALUE), A465TBT12_CRF_VALUE, new Boolean(n679TBT12_EDIT_FLG), A679TBT12_EDIT_FLG, new Boolean(n473TBT12_DEL_FLG), A473TBT12_DEL_FLG, new Boolean(n468TBT12_CRT_PROG_NM), A468TBT12_CRT_PROG_NM, new Boolean(n471TBT12_UPD_PROG_NM), A471TBT12_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
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
                        resetCaption0R0( ) ;
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
            load0R57( ) ;
         }
         endLevel0R57( ) ;
      }
      closeExtendedTableCursors0R57( ) ;
   }

   public void update0R57( )
   {
      beforeValidate0R57( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0R57( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0R57( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0R57( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0R57( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000R9 */
                  pr_default.execute(7, new Object[] {new Boolean(n466TBT12_CRT_DATETIME), A466TBT12_CRT_DATETIME, new Boolean(n467TBT12_CRT_USER_ID), A467TBT12_CRT_USER_ID, new Boolean(n469TBT12_UPD_DATETIME), A469TBT12_UPD_DATETIME, new Boolean(n470TBT12_UPD_USER_ID), A470TBT12_UPD_USER_ID, new Boolean(n472TBT12_UPD_CNT), new Long(A472TBT12_UPD_CNT), new Boolean(n465TBT12_CRF_VALUE), A465TBT12_CRF_VALUE, new Boolean(n679TBT12_EDIT_FLG), A679TBT12_EDIT_FLG, new Boolean(n473TBT12_DEL_FLG), A473TBT12_DEL_FLG, new Boolean(n468TBT12_CRT_PROG_NM), A468TBT12_CRT_PROG_NM, new Boolean(n471TBT12_UPD_PROG_NM), A471TBT12_UPD_PROG_NM, new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT12_CRF_RESULT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0R57( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0R0( ) ;
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
         endLevel0R57( ) ;
      }
      closeExtendedTableCursors0R57( ) ;
   }

   public void deferredUpdate0R57( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0R57( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0R57( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0R57( ) ;
         afterConfirm0R57( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0R57( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000R10 */
               pr_default.execute(8, new Object[] {new Long(A96TBT12_STUDY_ID), new Integer(A97TBT12_SUBJECT_ID), new Short(A98TBT12_CRF_ID), new Byte(A937TBT12_CRF_EDA_NO), A99TBT12_CRF_ITEM_GRP_DIV, A100TBT12_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound57 == 0 )
                     {
                        initAll0R57( ) ;
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
                     resetCaption0R0( ) ;
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
      sMode57 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0R57( ) ;
      Gx_mode = sMode57 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0R57( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT12_CRF_RESULT" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0R57( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0R57( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbt12_crf_result");
         if ( AnyError == 0 )
         {
            confirmValues0R0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbt12_crf_result");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0R57( )
   {
      /* Scan By routine */
      /* Using cursor T000R11 */
      pr_default.execute(9);
      RcdFound57 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound57 = (short)(1) ;
         A96TBT12_STUDY_ID = T000R11_A96TBT12_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
         A97TBT12_SUBJECT_ID = T000R11_A97TBT12_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
         A98TBT12_CRF_ID = T000R11_A98TBT12_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
         A937TBT12_CRF_EDA_NO = T000R11_A937TBT12_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
         A99TBT12_CRF_ITEM_GRP_DIV = T000R11_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
         A100TBT12_CRF_ITEM_GRP_CD = T000R11_A100TBT12_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0R57( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound57 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound57 = (short)(1) ;
         A96TBT12_STUDY_ID = T000R11_A96TBT12_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
         A97TBT12_SUBJECT_ID = T000R11_A97TBT12_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
         A98TBT12_CRF_ID = T000R11_A98TBT12_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
         A937TBT12_CRF_EDA_NO = T000R11_A937TBT12_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
         A99TBT12_CRF_ITEM_GRP_DIV = T000R11_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
         A100TBT12_CRF_ITEM_GRP_CD = T000R11_A100TBT12_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
      }
   }

   public void scanEnd0R57( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0R57( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0R57( )
   {
      /* Before Insert Rules */
      A466TBT12_CRT_DATETIME = GXutil.now( ) ;
      n466TBT12_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A466TBT12_CRT_DATETIME", localUtil.ttoc( A466TBT12_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A467TBT12_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_impl.this.GXt_char1 = GXv_char2[0] ;
      A467TBT12_CRT_USER_ID = GXt_char1 ;
      n467TBT12_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A467TBT12_CRT_USER_ID", A467TBT12_CRT_USER_ID);
      A469TBT12_UPD_DATETIME = GXutil.now( ) ;
      n469TBT12_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A469TBT12_UPD_DATETIME", localUtil.ttoc( A469TBT12_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A470TBT12_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_impl.this.GXt_char1 = GXv_char2[0] ;
      A470TBT12_UPD_USER_ID = GXt_char1 ;
      n470TBT12_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A470TBT12_UPD_USER_ID", A470TBT12_UPD_USER_ID);
      A472TBT12_UPD_CNT = (long)(O472TBT12_UPD_CNT+1) ;
      n472TBT12_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A472TBT12_UPD_CNT", GXutil.ltrim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0R57( )
   {
      /* Before Update Rules */
      A469TBT12_UPD_DATETIME = GXutil.now( ) ;
      n469TBT12_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A469TBT12_UPD_DATETIME", localUtil.ttoc( A469TBT12_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A470TBT12_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_impl.this.GXt_char1 = GXv_char2[0] ;
      A470TBT12_UPD_USER_ID = GXt_char1 ;
      n470TBT12_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A470TBT12_UPD_USER_ID", A470TBT12_UPD_USER_ID);
      A472TBT12_UPD_CNT = (long)(O472TBT12_UPD_CNT+1) ;
      n472TBT12_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A472TBT12_UPD_CNT", GXutil.ltrim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0R57( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0R57( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0R57( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0R57( )
   {
      edtTBT12_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_STUDY_ID_Enabled, 5, 0)));
      edtTBT12_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT12_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_CRF_ID_Enabled, 5, 0)));
      edtTBT12_CRF_EDA_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_CRF_EDA_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_CRF_EDA_NO_Enabled, 5, 0)));
      edtTBT12_CRF_ITEM_GRP_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_CRF_ITEM_GRP_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_CRF_ITEM_GRP_DIV_Enabled, 5, 0)));
      edtTBT12_CRF_ITEM_GRP_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_CRF_ITEM_GRP_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_CRF_ITEM_GRP_CD_Enabled, 5, 0)));
      edtTBT12_CRF_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_CRF_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_CRF_VALUE_Enabled, 5, 0)));
      edtTBT12_EDIT_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_EDIT_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_EDIT_FLG_Enabled, 5, 0)));
      edtTBT12_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_DEL_FLG_Enabled, 5, 0)));
      edtTBT12_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_CRT_DATETIME_Enabled, 5, 0)));
      edtTBT12_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_CRT_USER_ID_Enabled, 5, 0)));
      edtTBT12_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBT12_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_UPD_DATETIME_Enabled, 5, 0)));
      edtTBT12_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_UPD_USER_ID_Enabled, 5, 0)));
      edtTBT12_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBT12_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT12_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT12_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0R0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRF入力結果テーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513201195");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbt12_crf_result") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0R57( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z96TBT12_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z96TBT12_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z97TBT12_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z97TBT12_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z98TBT12_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z98TBT12_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z937TBT12_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( Z937TBT12_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z99TBT12_CRF_ITEM_GRP_DIV", GXutil.rtrim( Z99TBT12_CRF_ITEM_GRP_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z100TBT12_CRF_ITEM_GRP_CD", GXutil.rtrim( Z100TBT12_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z466TBT12_CRT_DATETIME", localUtil.ttoc( Z466TBT12_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z467TBT12_CRT_USER_ID", GXutil.rtrim( Z467TBT12_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z469TBT12_UPD_DATETIME", localUtil.ttoc( Z469TBT12_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z470TBT12_UPD_USER_ID", GXutil.rtrim( Z470TBT12_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z472TBT12_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z472TBT12_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z465TBT12_CRF_VALUE", GXutil.rtrim( Z465TBT12_CRF_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z679TBT12_EDIT_FLG", GXutil.rtrim( Z679TBT12_EDIT_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z473TBT12_DEL_FLG", GXutil.rtrim( Z473TBT12_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z468TBT12_CRT_PROG_NM", GXutil.rtrim( Z468TBT12_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z471TBT12_UPD_PROG_NM", GXutil.rtrim( Z471TBT12_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O472TBT12_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O472TBT12_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBT12_CRF_RESULT" ;
   }

   public String getPgmdesc( )
   {
      return "CRF入力結果テーブル" ;
   }

   public void initializeNonKey0R57( )
   {
      A466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n466TBT12_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A466TBT12_CRT_DATETIME", localUtil.ttoc( A466TBT12_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n466TBT12_CRT_DATETIME = (GXutil.nullDate().equals(A466TBT12_CRT_DATETIME) ? true : false) ;
      A467TBT12_CRT_USER_ID = "" ;
      n467TBT12_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A467TBT12_CRT_USER_ID", A467TBT12_CRT_USER_ID);
      n467TBT12_CRT_USER_ID = ((GXutil.strcmp("", A467TBT12_CRT_USER_ID)==0) ? true : false) ;
      A469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n469TBT12_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A469TBT12_UPD_DATETIME", localUtil.ttoc( A469TBT12_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n469TBT12_UPD_DATETIME = (GXutil.nullDate().equals(A469TBT12_UPD_DATETIME) ? true : false) ;
      A470TBT12_UPD_USER_ID = "" ;
      n470TBT12_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A470TBT12_UPD_USER_ID", A470TBT12_UPD_USER_ID);
      n470TBT12_UPD_USER_ID = ((GXutil.strcmp("", A470TBT12_UPD_USER_ID)==0) ? true : false) ;
      A472TBT12_UPD_CNT = 0 ;
      n472TBT12_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A472TBT12_UPD_CNT", GXutil.ltrim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)));
      n472TBT12_UPD_CNT = ((0==A472TBT12_UPD_CNT) ? true : false) ;
      A465TBT12_CRF_VALUE = "" ;
      n465TBT12_CRF_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A465TBT12_CRF_VALUE", A465TBT12_CRF_VALUE);
      n465TBT12_CRF_VALUE = ((GXutil.strcmp("", A465TBT12_CRF_VALUE)==0) ? true : false) ;
      A679TBT12_EDIT_FLG = "" ;
      n679TBT12_EDIT_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A679TBT12_EDIT_FLG", A679TBT12_EDIT_FLG);
      n679TBT12_EDIT_FLG = ((GXutil.strcmp("", A679TBT12_EDIT_FLG)==0) ? true : false) ;
      A473TBT12_DEL_FLG = "" ;
      n473TBT12_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A473TBT12_DEL_FLG", A473TBT12_DEL_FLG);
      n473TBT12_DEL_FLG = ((GXutil.strcmp("", A473TBT12_DEL_FLG)==0) ? true : false) ;
      A468TBT12_CRT_PROG_NM = "" ;
      n468TBT12_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A468TBT12_CRT_PROG_NM", A468TBT12_CRT_PROG_NM);
      n468TBT12_CRT_PROG_NM = ((GXutil.strcmp("", A468TBT12_CRT_PROG_NM)==0) ? true : false) ;
      A471TBT12_UPD_PROG_NM = "" ;
      n471TBT12_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A471TBT12_UPD_PROG_NM", A471TBT12_UPD_PROG_NM);
      n471TBT12_UPD_PROG_NM = ((GXutil.strcmp("", A471TBT12_UPD_PROG_NM)==0) ? true : false) ;
      O472TBT12_UPD_CNT = A472TBT12_UPD_CNT ;
      n472TBT12_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A472TBT12_UPD_CNT", GXutil.ltrim( GXutil.str( A472TBT12_UPD_CNT, 10, 0)));
   }

   public void initAll0R57( )
   {
      A96TBT12_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A96TBT12_STUDY_ID", GXutil.ltrim( GXutil.str( A96TBT12_STUDY_ID, 10, 0)));
      A97TBT12_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A97TBT12_SUBJECT_ID", GXutil.ltrim( GXutil.str( A97TBT12_SUBJECT_ID, 6, 0)));
      A98TBT12_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A98TBT12_CRF_ID", GXutil.ltrim( GXutil.str( A98TBT12_CRF_ID, 4, 0)));
      A937TBT12_CRF_EDA_NO = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A937TBT12_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A937TBT12_CRF_EDA_NO, 2, 0)));
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A99TBT12_CRF_ITEM_GRP_DIV", A99TBT12_CRF_ITEM_GRP_DIV);
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A100TBT12_CRF_ITEM_GRP_CD", A100TBT12_CRF_ITEM_GRP_CD);
      initializeNonKey0R57( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151320120");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbt12_crf_result.js", "?20207151320120");
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
      lblTextblocktbt12_study_id_Internalname = "TEXTBLOCKTBT12_STUDY_ID" ;
      edtTBT12_STUDY_ID_Internalname = "TBT12_STUDY_ID" ;
      lblTextblocktbt12_subject_id_Internalname = "TEXTBLOCKTBT12_SUBJECT_ID" ;
      edtTBT12_SUBJECT_ID_Internalname = "TBT12_SUBJECT_ID" ;
      lblTextblocktbt12_crf_id_Internalname = "TEXTBLOCKTBT12_CRF_ID" ;
      edtTBT12_CRF_ID_Internalname = "TBT12_CRF_ID" ;
      lblTextblocktbt12_crf_eda_no_Internalname = "TEXTBLOCKTBT12_CRF_EDA_NO" ;
      edtTBT12_CRF_EDA_NO_Internalname = "TBT12_CRF_EDA_NO" ;
      lblTextblocktbt12_crf_item_grp_div_Internalname = "TEXTBLOCKTBT12_CRF_ITEM_GRP_DIV" ;
      edtTBT12_CRF_ITEM_GRP_DIV_Internalname = "TBT12_CRF_ITEM_GRP_DIV" ;
      lblTextblocktbt12_crf_item_grp_cd_Internalname = "TEXTBLOCKTBT12_CRF_ITEM_GRP_CD" ;
      edtTBT12_CRF_ITEM_GRP_CD_Internalname = "TBT12_CRF_ITEM_GRP_CD" ;
      lblTextblocktbt12_crf_value_Internalname = "TEXTBLOCKTBT12_CRF_VALUE" ;
      edtTBT12_CRF_VALUE_Internalname = "TBT12_CRF_VALUE" ;
      lblTextblocktbt12_edit_flg_Internalname = "TEXTBLOCKTBT12_EDIT_FLG" ;
      edtTBT12_EDIT_FLG_Internalname = "TBT12_EDIT_FLG" ;
      lblTextblocktbt12_del_flg_Internalname = "TEXTBLOCKTBT12_DEL_FLG" ;
      edtTBT12_DEL_FLG_Internalname = "TBT12_DEL_FLG" ;
      lblTextblocktbt12_crt_datetime_Internalname = "TEXTBLOCKTBT12_CRT_DATETIME" ;
      edtTBT12_CRT_DATETIME_Internalname = "TBT12_CRT_DATETIME" ;
      lblTextblocktbt12_crt_user_id_Internalname = "TEXTBLOCKTBT12_CRT_USER_ID" ;
      edtTBT12_CRT_USER_ID_Internalname = "TBT12_CRT_USER_ID" ;
      lblTextblocktbt12_crt_prog_nm_Internalname = "TEXTBLOCKTBT12_CRT_PROG_NM" ;
      edtTBT12_CRT_PROG_NM_Internalname = "TBT12_CRT_PROG_NM" ;
      lblTextblocktbt12_upd_datetime_Internalname = "TEXTBLOCKTBT12_UPD_DATETIME" ;
      edtTBT12_UPD_DATETIME_Internalname = "TBT12_UPD_DATETIME" ;
      lblTextblocktbt12_upd_user_id_Internalname = "TEXTBLOCKTBT12_UPD_USER_ID" ;
      edtTBT12_UPD_USER_ID_Internalname = "TBT12_UPD_USER_ID" ;
      lblTextblocktbt12_upd_prog_nm_Internalname = "TEXTBLOCKTBT12_UPD_PROG_NM" ;
      edtTBT12_UPD_PROG_NM_Internalname = "TBT12_UPD_PROG_NM" ;
      lblTextblocktbt12_upd_cnt_Internalname = "TEXTBLOCKTBT12_UPD_CNT" ;
      edtTBT12_UPD_CNT_Internalname = "TBT12_UPD_CNT" ;
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
      edtTBT12_UPD_CNT_Jsonclick = "" ;
      edtTBT12_UPD_CNT_Enabled = 1 ;
      edtTBT12_UPD_PROG_NM_Jsonclick = "" ;
      edtTBT12_UPD_PROG_NM_Enabled = 1 ;
      edtTBT12_UPD_USER_ID_Jsonclick = "" ;
      edtTBT12_UPD_USER_ID_Enabled = 1 ;
      edtTBT12_UPD_DATETIME_Jsonclick = "" ;
      edtTBT12_UPD_DATETIME_Enabled = 1 ;
      edtTBT12_CRT_PROG_NM_Jsonclick = "" ;
      edtTBT12_CRT_PROG_NM_Enabled = 1 ;
      edtTBT12_CRT_USER_ID_Jsonclick = "" ;
      edtTBT12_CRT_USER_ID_Enabled = 1 ;
      edtTBT12_CRT_DATETIME_Jsonclick = "" ;
      edtTBT12_CRT_DATETIME_Enabled = 1 ;
      edtTBT12_DEL_FLG_Jsonclick = "" ;
      edtTBT12_DEL_FLG_Enabled = 1 ;
      edtTBT12_EDIT_FLG_Jsonclick = "" ;
      edtTBT12_EDIT_FLG_Enabled = 1 ;
      edtTBT12_CRF_VALUE_Enabled = 1 ;
      edtTBT12_CRF_ITEM_GRP_CD_Jsonclick = "" ;
      edtTBT12_CRF_ITEM_GRP_CD_Enabled = 1 ;
      edtTBT12_CRF_ITEM_GRP_DIV_Jsonclick = "" ;
      edtTBT12_CRF_ITEM_GRP_DIV_Enabled = 1 ;
      edtTBT12_CRF_EDA_NO_Jsonclick = "" ;
      edtTBT12_CRF_EDA_NO_Enabled = 1 ;
      edtTBT12_CRF_ID_Jsonclick = "" ;
      edtTBT12_CRF_ID_Enabled = 1 ;
      edtTBT12_SUBJECT_ID_Jsonclick = "" ;
      edtTBT12_SUBJECT_ID_Enabled = 1 ;
      edtTBT12_STUDY_ID_Jsonclick = "" ;
      edtTBT12_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbt12_crt_user_id0R57( String Gx_mode )
   {
      GXt_char1 = A467TBT12_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_impl.this.GXt_char1 = GXv_char2[0] ;
      A467TBT12_CRT_USER_ID = GXt_char1 ;
      n467TBT12_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A467TBT12_CRT_USER_ID", A467TBT12_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A467TBT12_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbt12_upd_user_id0R57( String Gx_mode )
   {
      GXt_char1 = A470TBT12_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt12_crf_result_impl.this.GXt_char1 = GXv_char2[0] ;
      A470TBT12_UPD_USER_ID = GXt_char1 ;
      n470TBT12_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A470TBT12_UPD_USER_ID", A470TBT12_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A470TBT12_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBT12_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt12_crf_item_grp_cd( long GX_Parm1 ,
                                            int GX_Parm2 ,
                                            short GX_Parm3 ,
                                            byte GX_Parm4 ,
                                            String GX_Parm5 ,
                                            String GX_Parm6 ,
                                            java.util.Date GX_Parm7 ,
                                            String GX_Parm8 ,
                                            java.util.Date GX_Parm9 ,
                                            String GX_Parm10 ,
                                            long GX_Parm11 ,
                                            String GX_Parm12 ,
                                            String GX_Parm13 ,
                                            String GX_Parm14 ,
                                            String GX_Parm15 ,
                                            String GX_Parm16 )
   {
      A96TBT12_STUDY_ID = GX_Parm1 ;
      A97TBT12_SUBJECT_ID = GX_Parm2 ;
      A98TBT12_CRF_ID = GX_Parm3 ;
      A937TBT12_CRF_EDA_NO = GX_Parm4 ;
      A99TBT12_CRF_ITEM_GRP_DIV = GX_Parm5 ;
      A100TBT12_CRF_ITEM_GRP_CD = GX_Parm6 ;
      A466TBT12_CRT_DATETIME = GX_Parm7 ;
      n466TBT12_CRT_DATETIME = false ;
      A467TBT12_CRT_USER_ID = GX_Parm8 ;
      n467TBT12_CRT_USER_ID = false ;
      A469TBT12_UPD_DATETIME = GX_Parm9 ;
      n469TBT12_UPD_DATETIME = false ;
      A470TBT12_UPD_USER_ID = GX_Parm10 ;
      n470TBT12_UPD_USER_ID = false ;
      A472TBT12_UPD_CNT = GX_Parm11 ;
      n472TBT12_UPD_CNT = false ;
      A465TBT12_CRF_VALUE = GX_Parm12 ;
      n465TBT12_CRF_VALUE = false ;
      A679TBT12_EDIT_FLG = GX_Parm13 ;
      n679TBT12_EDIT_FLG = false ;
      A473TBT12_DEL_FLG = GX_Parm14 ;
      n473TBT12_DEL_FLG = false ;
      A468TBT12_CRT_PROG_NM = GX_Parm15 ;
      n468TBT12_CRT_PROG_NM = false ;
      A471TBT12_UPD_PROG_NM = GX_Parm16 ;
      n471TBT12_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A466TBT12_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A467TBT12_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A469TBT12_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A470TBT12_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A472TBT12_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A465TBT12_CRF_VALUE));
      isValidOutput.add(GXutil.rtrim( A679TBT12_EDIT_FLG));
      isValidOutput.add(GXutil.rtrim( A473TBT12_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A468TBT12_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A471TBT12_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z96TBT12_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z97TBT12_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z98TBT12_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z937TBT12_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z99TBT12_CRF_ITEM_GRP_DIV));
      isValidOutput.add(GXutil.rtrim( Z100TBT12_CRF_ITEM_GRP_CD));
      isValidOutput.add(localUtil.ttoc( Z466TBT12_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z467TBT12_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z469TBT12_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z470TBT12_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z472TBT12_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z465TBT12_CRF_VALUE));
      isValidOutput.add(GXutil.rtrim( Z679TBT12_EDIT_FLG));
      isValidOutput.add(GXutil.rtrim( Z473TBT12_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z468TBT12_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z471TBT12_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O472TBT12_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z99TBT12_CRF_ITEM_GRP_DIV = "" ;
      Z100TBT12_CRF_ITEM_GRP_CD = "" ;
      Z466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z467TBT12_CRT_USER_ID = "" ;
      Z469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z470TBT12_UPD_USER_ID = "" ;
      Z465TBT12_CRF_VALUE = "" ;
      Z679TBT12_EDIT_FLG = "" ;
      Z473TBT12_DEL_FLG = "" ;
      Z468TBT12_CRT_PROG_NM = "" ;
      Z471TBT12_UPD_PROG_NM = "" ;
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
      lblTextblocktbt12_study_id_Jsonclick = "" ;
      lblTextblocktbt12_subject_id_Jsonclick = "" ;
      lblTextblocktbt12_crf_id_Jsonclick = "" ;
      lblTextblocktbt12_crf_eda_no_Jsonclick = "" ;
      lblTextblocktbt12_crf_item_grp_div_Jsonclick = "" ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      lblTextblocktbt12_crf_item_grp_cd_Jsonclick = "" ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbt12_crf_value_Jsonclick = "" ;
      A465TBT12_CRF_VALUE = "" ;
      lblTextblocktbt12_edit_flg_Jsonclick = "" ;
      A679TBT12_EDIT_FLG = "" ;
      lblTextblocktbt12_del_flg_Jsonclick = "" ;
      A473TBT12_DEL_FLG = "" ;
      lblTextblocktbt12_crt_datetime_Jsonclick = "" ;
      A466TBT12_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt12_crt_user_id_Jsonclick = "" ;
      A467TBT12_CRT_USER_ID = "" ;
      lblTextblocktbt12_crt_prog_nm_Jsonclick = "" ;
      A468TBT12_CRT_PROG_NM = "" ;
      lblTextblocktbt12_upd_datetime_Jsonclick = "" ;
      A469TBT12_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt12_upd_user_id_Jsonclick = "" ;
      A470TBT12_UPD_USER_ID = "" ;
      lblTextblocktbt12_upd_prog_nm_Jsonclick = "" ;
      A471TBT12_UPD_PROG_NM = "" ;
      lblTextblocktbt12_upd_cnt_Jsonclick = "" ;
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
      T000R4_A96TBT12_STUDY_ID = new long[1] ;
      T000R4_A97TBT12_SUBJECT_ID = new int[1] ;
      T000R4_A98TBT12_CRF_ID = new short[1] ;
      T000R4_A937TBT12_CRF_EDA_NO = new byte[1] ;
      T000R4_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000R4_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000R4_A466TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000R4_n466TBT12_CRT_DATETIME = new boolean[] {false} ;
      T000R4_A467TBT12_CRT_USER_ID = new String[] {""} ;
      T000R4_n467TBT12_CRT_USER_ID = new boolean[] {false} ;
      T000R4_A469TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000R4_n469TBT12_UPD_DATETIME = new boolean[] {false} ;
      T000R4_A470TBT12_UPD_USER_ID = new String[] {""} ;
      T000R4_n470TBT12_UPD_USER_ID = new boolean[] {false} ;
      T000R4_A472TBT12_UPD_CNT = new long[1] ;
      T000R4_n472TBT12_UPD_CNT = new boolean[] {false} ;
      T000R4_A465TBT12_CRF_VALUE = new String[] {""} ;
      T000R4_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      T000R4_A679TBT12_EDIT_FLG = new String[] {""} ;
      T000R4_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      T000R4_A473TBT12_DEL_FLG = new String[] {""} ;
      T000R4_n473TBT12_DEL_FLG = new boolean[] {false} ;
      T000R4_A468TBT12_CRT_PROG_NM = new String[] {""} ;
      T000R4_n468TBT12_CRT_PROG_NM = new boolean[] {false} ;
      T000R4_A471TBT12_UPD_PROG_NM = new String[] {""} ;
      T000R4_n471TBT12_UPD_PROG_NM = new boolean[] {false} ;
      T000R5_A96TBT12_STUDY_ID = new long[1] ;
      T000R5_A97TBT12_SUBJECT_ID = new int[1] ;
      T000R5_A98TBT12_CRF_ID = new short[1] ;
      T000R5_A937TBT12_CRF_EDA_NO = new byte[1] ;
      T000R5_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000R5_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000R3_A96TBT12_STUDY_ID = new long[1] ;
      T000R3_A97TBT12_SUBJECT_ID = new int[1] ;
      T000R3_A98TBT12_CRF_ID = new short[1] ;
      T000R3_A937TBT12_CRF_EDA_NO = new byte[1] ;
      T000R3_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000R3_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000R3_A466TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000R3_n466TBT12_CRT_DATETIME = new boolean[] {false} ;
      T000R3_A467TBT12_CRT_USER_ID = new String[] {""} ;
      T000R3_n467TBT12_CRT_USER_ID = new boolean[] {false} ;
      T000R3_A469TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000R3_n469TBT12_UPD_DATETIME = new boolean[] {false} ;
      T000R3_A470TBT12_UPD_USER_ID = new String[] {""} ;
      T000R3_n470TBT12_UPD_USER_ID = new boolean[] {false} ;
      T000R3_A472TBT12_UPD_CNT = new long[1] ;
      T000R3_n472TBT12_UPD_CNT = new boolean[] {false} ;
      T000R3_A465TBT12_CRF_VALUE = new String[] {""} ;
      T000R3_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      T000R3_A679TBT12_EDIT_FLG = new String[] {""} ;
      T000R3_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      T000R3_A473TBT12_DEL_FLG = new String[] {""} ;
      T000R3_n473TBT12_DEL_FLG = new boolean[] {false} ;
      T000R3_A468TBT12_CRT_PROG_NM = new String[] {""} ;
      T000R3_n468TBT12_CRT_PROG_NM = new boolean[] {false} ;
      T000R3_A471TBT12_UPD_PROG_NM = new String[] {""} ;
      T000R3_n471TBT12_UPD_PROG_NM = new boolean[] {false} ;
      sMode57 = "" ;
      T000R6_A96TBT12_STUDY_ID = new long[1] ;
      T000R6_A97TBT12_SUBJECT_ID = new int[1] ;
      T000R6_A98TBT12_CRF_ID = new short[1] ;
      T000R6_A937TBT12_CRF_EDA_NO = new byte[1] ;
      T000R6_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000R6_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000R7_A96TBT12_STUDY_ID = new long[1] ;
      T000R7_A97TBT12_SUBJECT_ID = new int[1] ;
      T000R7_A98TBT12_CRF_ID = new short[1] ;
      T000R7_A937TBT12_CRF_EDA_NO = new byte[1] ;
      T000R7_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000R7_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000R2_A96TBT12_STUDY_ID = new long[1] ;
      T000R2_A97TBT12_SUBJECT_ID = new int[1] ;
      T000R2_A98TBT12_CRF_ID = new short[1] ;
      T000R2_A937TBT12_CRF_EDA_NO = new byte[1] ;
      T000R2_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000R2_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000R2_A466TBT12_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000R2_n466TBT12_CRT_DATETIME = new boolean[] {false} ;
      T000R2_A467TBT12_CRT_USER_ID = new String[] {""} ;
      T000R2_n467TBT12_CRT_USER_ID = new boolean[] {false} ;
      T000R2_A469TBT12_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000R2_n469TBT12_UPD_DATETIME = new boolean[] {false} ;
      T000R2_A470TBT12_UPD_USER_ID = new String[] {""} ;
      T000R2_n470TBT12_UPD_USER_ID = new boolean[] {false} ;
      T000R2_A472TBT12_UPD_CNT = new long[1] ;
      T000R2_n472TBT12_UPD_CNT = new boolean[] {false} ;
      T000R2_A465TBT12_CRF_VALUE = new String[] {""} ;
      T000R2_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      T000R2_A679TBT12_EDIT_FLG = new String[] {""} ;
      T000R2_n679TBT12_EDIT_FLG = new boolean[] {false} ;
      T000R2_A473TBT12_DEL_FLG = new String[] {""} ;
      T000R2_n473TBT12_DEL_FLG = new boolean[] {false} ;
      T000R2_A468TBT12_CRT_PROG_NM = new String[] {""} ;
      T000R2_n468TBT12_CRT_PROG_NM = new boolean[] {false} ;
      T000R2_A471TBT12_UPD_PROG_NM = new String[] {""} ;
      T000R2_n471TBT12_UPD_PROG_NM = new boolean[] {false} ;
      T000R11_A96TBT12_STUDY_ID = new long[1] ;
      T000R11_A97TBT12_SUBJECT_ID = new int[1] ;
      T000R11_A98TBT12_CRF_ID = new short[1] ;
      T000R11_A937TBT12_CRF_EDA_NO = new byte[1] ;
      T000R11_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000R11_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt12_crf_result__default(),
         new Object[] {
             new Object[] {
            T000R2_A96TBT12_STUDY_ID, T000R2_A97TBT12_SUBJECT_ID, T000R2_A98TBT12_CRF_ID, T000R2_A937TBT12_CRF_EDA_NO, T000R2_A99TBT12_CRF_ITEM_GRP_DIV, T000R2_A100TBT12_CRF_ITEM_GRP_CD, T000R2_A466TBT12_CRT_DATETIME, T000R2_n466TBT12_CRT_DATETIME, T000R2_A467TBT12_CRT_USER_ID, T000R2_n467TBT12_CRT_USER_ID,
            T000R2_A469TBT12_UPD_DATETIME, T000R2_n469TBT12_UPD_DATETIME, T000R2_A470TBT12_UPD_USER_ID, T000R2_n470TBT12_UPD_USER_ID, T000R2_A472TBT12_UPD_CNT, T000R2_n472TBT12_UPD_CNT, T000R2_A465TBT12_CRF_VALUE, T000R2_n465TBT12_CRF_VALUE, T000R2_A679TBT12_EDIT_FLG, T000R2_n679TBT12_EDIT_FLG,
            T000R2_A473TBT12_DEL_FLG, T000R2_n473TBT12_DEL_FLG, T000R2_A468TBT12_CRT_PROG_NM, T000R2_n468TBT12_CRT_PROG_NM, T000R2_A471TBT12_UPD_PROG_NM, T000R2_n471TBT12_UPD_PROG_NM
            }
            , new Object[] {
            T000R3_A96TBT12_STUDY_ID, T000R3_A97TBT12_SUBJECT_ID, T000R3_A98TBT12_CRF_ID, T000R3_A937TBT12_CRF_EDA_NO, T000R3_A99TBT12_CRF_ITEM_GRP_DIV, T000R3_A100TBT12_CRF_ITEM_GRP_CD, T000R3_A466TBT12_CRT_DATETIME, T000R3_n466TBT12_CRT_DATETIME, T000R3_A467TBT12_CRT_USER_ID, T000R3_n467TBT12_CRT_USER_ID,
            T000R3_A469TBT12_UPD_DATETIME, T000R3_n469TBT12_UPD_DATETIME, T000R3_A470TBT12_UPD_USER_ID, T000R3_n470TBT12_UPD_USER_ID, T000R3_A472TBT12_UPD_CNT, T000R3_n472TBT12_UPD_CNT, T000R3_A465TBT12_CRF_VALUE, T000R3_n465TBT12_CRF_VALUE, T000R3_A679TBT12_EDIT_FLG, T000R3_n679TBT12_EDIT_FLG,
            T000R3_A473TBT12_DEL_FLG, T000R3_n473TBT12_DEL_FLG, T000R3_A468TBT12_CRT_PROG_NM, T000R3_n468TBT12_CRT_PROG_NM, T000R3_A471TBT12_UPD_PROG_NM, T000R3_n471TBT12_UPD_PROG_NM
            }
            , new Object[] {
            T000R4_A96TBT12_STUDY_ID, T000R4_A97TBT12_SUBJECT_ID, T000R4_A98TBT12_CRF_ID, T000R4_A937TBT12_CRF_EDA_NO, T000R4_A99TBT12_CRF_ITEM_GRP_DIV, T000R4_A100TBT12_CRF_ITEM_GRP_CD, T000R4_A466TBT12_CRT_DATETIME, T000R4_n466TBT12_CRT_DATETIME, T000R4_A467TBT12_CRT_USER_ID, T000R4_n467TBT12_CRT_USER_ID,
            T000R4_A469TBT12_UPD_DATETIME, T000R4_n469TBT12_UPD_DATETIME, T000R4_A470TBT12_UPD_USER_ID, T000R4_n470TBT12_UPD_USER_ID, T000R4_A472TBT12_UPD_CNT, T000R4_n472TBT12_UPD_CNT, T000R4_A465TBT12_CRF_VALUE, T000R4_n465TBT12_CRF_VALUE, T000R4_A679TBT12_EDIT_FLG, T000R4_n679TBT12_EDIT_FLG,
            T000R4_A473TBT12_DEL_FLG, T000R4_n473TBT12_DEL_FLG, T000R4_A468TBT12_CRT_PROG_NM, T000R4_n468TBT12_CRT_PROG_NM, T000R4_A471TBT12_UPD_PROG_NM, T000R4_n471TBT12_UPD_PROG_NM
            }
            , new Object[] {
            T000R5_A96TBT12_STUDY_ID, T000R5_A97TBT12_SUBJECT_ID, T000R5_A98TBT12_CRF_ID, T000R5_A937TBT12_CRF_EDA_NO, T000R5_A99TBT12_CRF_ITEM_GRP_DIV, T000R5_A100TBT12_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T000R6_A96TBT12_STUDY_ID, T000R6_A97TBT12_SUBJECT_ID, T000R6_A98TBT12_CRF_ID, T000R6_A937TBT12_CRF_EDA_NO, T000R6_A99TBT12_CRF_ITEM_GRP_DIV, T000R6_A100TBT12_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T000R7_A96TBT12_STUDY_ID, T000R7_A97TBT12_SUBJECT_ID, T000R7_A98TBT12_CRF_ID, T000R7_A937TBT12_CRF_EDA_NO, T000R7_A99TBT12_CRF_ITEM_GRP_DIV, T000R7_A100TBT12_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000R11_A96TBT12_STUDY_ID, T000R11_A97TBT12_SUBJECT_ID, T000R11_A98TBT12_CRF_ID, T000R11_A937TBT12_CRF_EDA_NO, T000R11_A99TBT12_CRF_ITEM_GRP_DIV, T000R11_A100TBT12_CRF_ITEM_GRP_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT12_CRF_RESULT" ;
   }

   private byte Z937TBT12_CRF_EDA_NO ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A937TBT12_CRF_EDA_NO ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z98TBT12_CRF_ID ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A98TBT12_CRF_ID ;
   private short RcdFound57 ;
   private short Gx_err ;
   private int Z97TBT12_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT12_STUDY_ID_Enabled ;
   private int A97TBT12_SUBJECT_ID ;
   private int edtTBT12_SUBJECT_ID_Enabled ;
   private int edtTBT12_CRF_ID_Enabled ;
   private int edtTBT12_CRF_EDA_NO_Enabled ;
   private int edtTBT12_CRF_ITEM_GRP_DIV_Enabled ;
   private int edtTBT12_CRF_ITEM_GRP_CD_Enabled ;
   private int edtTBT12_CRF_VALUE_Enabled ;
   private int edtTBT12_EDIT_FLG_Enabled ;
   private int edtTBT12_DEL_FLG_Enabled ;
   private int edtTBT12_CRT_DATETIME_Enabled ;
   private int edtTBT12_CRT_USER_ID_Enabled ;
   private int edtTBT12_CRT_PROG_NM_Enabled ;
   private int edtTBT12_UPD_DATETIME_Enabled ;
   private int edtTBT12_UPD_USER_ID_Enabled ;
   private int edtTBT12_UPD_PROG_NM_Enabled ;
   private int edtTBT12_UPD_CNT_Enabled ;
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
   private long Z96TBT12_STUDY_ID ;
   private long Z472TBT12_UPD_CNT ;
   private long O472TBT12_UPD_CNT ;
   private long A96TBT12_STUDY_ID ;
   private long A472TBT12_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBT12_STUDY_ID_Internalname ;
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
   private String lblTextblocktbt12_study_id_Internalname ;
   private String lblTextblocktbt12_study_id_Jsonclick ;
   private String edtTBT12_STUDY_ID_Jsonclick ;
   private String lblTextblocktbt12_subject_id_Internalname ;
   private String lblTextblocktbt12_subject_id_Jsonclick ;
   private String edtTBT12_SUBJECT_ID_Internalname ;
   private String edtTBT12_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbt12_crf_id_Internalname ;
   private String lblTextblocktbt12_crf_id_Jsonclick ;
   private String edtTBT12_CRF_ID_Internalname ;
   private String edtTBT12_CRF_ID_Jsonclick ;
   private String lblTextblocktbt12_crf_eda_no_Internalname ;
   private String lblTextblocktbt12_crf_eda_no_Jsonclick ;
   private String edtTBT12_CRF_EDA_NO_Internalname ;
   private String edtTBT12_CRF_EDA_NO_Jsonclick ;
   private String lblTextblocktbt12_crf_item_grp_div_Internalname ;
   private String lblTextblocktbt12_crf_item_grp_div_Jsonclick ;
   private String edtTBT12_CRF_ITEM_GRP_DIV_Internalname ;
   private String edtTBT12_CRF_ITEM_GRP_DIV_Jsonclick ;
   private String lblTextblocktbt12_crf_item_grp_cd_Internalname ;
   private String lblTextblocktbt12_crf_item_grp_cd_Jsonclick ;
   private String edtTBT12_CRF_ITEM_GRP_CD_Internalname ;
   private String edtTBT12_CRF_ITEM_GRP_CD_Jsonclick ;
   private String lblTextblocktbt12_crf_value_Internalname ;
   private String lblTextblocktbt12_crf_value_Jsonclick ;
   private String edtTBT12_CRF_VALUE_Internalname ;
   private String lblTextblocktbt12_edit_flg_Internalname ;
   private String lblTextblocktbt12_edit_flg_Jsonclick ;
   private String edtTBT12_EDIT_FLG_Internalname ;
   private String edtTBT12_EDIT_FLG_Jsonclick ;
   private String lblTextblocktbt12_del_flg_Internalname ;
   private String lblTextblocktbt12_del_flg_Jsonclick ;
   private String edtTBT12_DEL_FLG_Internalname ;
   private String edtTBT12_DEL_FLG_Jsonclick ;
   private String lblTextblocktbt12_crt_datetime_Internalname ;
   private String lblTextblocktbt12_crt_datetime_Jsonclick ;
   private String edtTBT12_CRT_DATETIME_Internalname ;
   private String edtTBT12_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbt12_crt_user_id_Internalname ;
   private String lblTextblocktbt12_crt_user_id_Jsonclick ;
   private String edtTBT12_CRT_USER_ID_Internalname ;
   private String edtTBT12_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbt12_crt_prog_nm_Internalname ;
   private String lblTextblocktbt12_crt_prog_nm_Jsonclick ;
   private String edtTBT12_CRT_PROG_NM_Internalname ;
   private String edtTBT12_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbt12_upd_datetime_Internalname ;
   private String lblTextblocktbt12_upd_datetime_Jsonclick ;
   private String edtTBT12_UPD_DATETIME_Internalname ;
   private String edtTBT12_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbt12_upd_user_id_Internalname ;
   private String lblTextblocktbt12_upd_user_id_Jsonclick ;
   private String edtTBT12_UPD_USER_ID_Internalname ;
   private String edtTBT12_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbt12_upd_prog_nm_Internalname ;
   private String lblTextblocktbt12_upd_prog_nm_Jsonclick ;
   private String edtTBT12_UPD_PROG_NM_Internalname ;
   private String edtTBT12_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbt12_upd_cnt_Internalname ;
   private String lblTextblocktbt12_upd_cnt_Jsonclick ;
   private String edtTBT12_UPD_CNT_Internalname ;
   private String edtTBT12_UPD_CNT_Jsonclick ;
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
   private String sMode57 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z466TBT12_CRT_DATETIME ;
   private java.util.Date Z469TBT12_UPD_DATETIME ;
   private java.util.Date A466TBT12_CRT_DATETIME ;
   private java.util.Date A469TBT12_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n679TBT12_EDIT_FLG ;
   private boolean n473TBT12_DEL_FLG ;
   private boolean n466TBT12_CRT_DATETIME ;
   private boolean n467TBT12_CRT_USER_ID ;
   private boolean n468TBT12_CRT_PROG_NM ;
   private boolean n469TBT12_UPD_DATETIME ;
   private boolean n470TBT12_UPD_USER_ID ;
   private boolean n471TBT12_UPD_PROG_NM ;
   private boolean n472TBT12_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z99TBT12_CRF_ITEM_GRP_DIV ;
   private String Z100TBT12_CRF_ITEM_GRP_CD ;
   private String Z467TBT12_CRT_USER_ID ;
   private String Z470TBT12_UPD_USER_ID ;
   private String Z465TBT12_CRF_VALUE ;
   private String Z679TBT12_EDIT_FLG ;
   private String Z473TBT12_DEL_FLG ;
   private String Z468TBT12_CRT_PROG_NM ;
   private String Z471TBT12_UPD_PROG_NM ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A465TBT12_CRF_VALUE ;
   private String A679TBT12_EDIT_FLG ;
   private String A473TBT12_DEL_FLG ;
   private String A467TBT12_CRT_USER_ID ;
   private String A468TBT12_CRT_PROG_NM ;
   private String A470TBT12_UPD_USER_ID ;
   private String A471TBT12_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000R4_A96TBT12_STUDY_ID ;
   private int[] T000R4_A97TBT12_SUBJECT_ID ;
   private short[] T000R4_A98TBT12_CRF_ID ;
   private byte[] T000R4_A937TBT12_CRF_EDA_NO ;
   private String[] T000R4_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] T000R4_A100TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000R4_A466TBT12_CRT_DATETIME ;
   private boolean[] T000R4_n466TBT12_CRT_DATETIME ;
   private String[] T000R4_A467TBT12_CRT_USER_ID ;
   private boolean[] T000R4_n467TBT12_CRT_USER_ID ;
   private java.util.Date[] T000R4_A469TBT12_UPD_DATETIME ;
   private boolean[] T000R4_n469TBT12_UPD_DATETIME ;
   private String[] T000R4_A470TBT12_UPD_USER_ID ;
   private boolean[] T000R4_n470TBT12_UPD_USER_ID ;
   private long[] T000R4_A472TBT12_UPD_CNT ;
   private boolean[] T000R4_n472TBT12_UPD_CNT ;
   private String[] T000R4_A465TBT12_CRF_VALUE ;
   private boolean[] T000R4_n465TBT12_CRF_VALUE ;
   private String[] T000R4_A679TBT12_EDIT_FLG ;
   private boolean[] T000R4_n679TBT12_EDIT_FLG ;
   private String[] T000R4_A473TBT12_DEL_FLG ;
   private boolean[] T000R4_n473TBT12_DEL_FLG ;
   private String[] T000R4_A468TBT12_CRT_PROG_NM ;
   private boolean[] T000R4_n468TBT12_CRT_PROG_NM ;
   private String[] T000R4_A471TBT12_UPD_PROG_NM ;
   private boolean[] T000R4_n471TBT12_UPD_PROG_NM ;
   private long[] T000R5_A96TBT12_STUDY_ID ;
   private int[] T000R5_A97TBT12_SUBJECT_ID ;
   private short[] T000R5_A98TBT12_CRF_ID ;
   private byte[] T000R5_A937TBT12_CRF_EDA_NO ;
   private String[] T000R5_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] T000R5_A100TBT12_CRF_ITEM_GRP_CD ;
   private long[] T000R3_A96TBT12_STUDY_ID ;
   private int[] T000R3_A97TBT12_SUBJECT_ID ;
   private short[] T000R3_A98TBT12_CRF_ID ;
   private byte[] T000R3_A937TBT12_CRF_EDA_NO ;
   private String[] T000R3_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] T000R3_A100TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000R3_A466TBT12_CRT_DATETIME ;
   private boolean[] T000R3_n466TBT12_CRT_DATETIME ;
   private String[] T000R3_A467TBT12_CRT_USER_ID ;
   private boolean[] T000R3_n467TBT12_CRT_USER_ID ;
   private java.util.Date[] T000R3_A469TBT12_UPD_DATETIME ;
   private boolean[] T000R3_n469TBT12_UPD_DATETIME ;
   private String[] T000R3_A470TBT12_UPD_USER_ID ;
   private boolean[] T000R3_n470TBT12_UPD_USER_ID ;
   private long[] T000R3_A472TBT12_UPD_CNT ;
   private boolean[] T000R3_n472TBT12_UPD_CNT ;
   private String[] T000R3_A465TBT12_CRF_VALUE ;
   private boolean[] T000R3_n465TBT12_CRF_VALUE ;
   private String[] T000R3_A679TBT12_EDIT_FLG ;
   private boolean[] T000R3_n679TBT12_EDIT_FLG ;
   private String[] T000R3_A473TBT12_DEL_FLG ;
   private boolean[] T000R3_n473TBT12_DEL_FLG ;
   private String[] T000R3_A468TBT12_CRT_PROG_NM ;
   private boolean[] T000R3_n468TBT12_CRT_PROG_NM ;
   private String[] T000R3_A471TBT12_UPD_PROG_NM ;
   private boolean[] T000R3_n471TBT12_UPD_PROG_NM ;
   private long[] T000R6_A96TBT12_STUDY_ID ;
   private int[] T000R6_A97TBT12_SUBJECT_ID ;
   private short[] T000R6_A98TBT12_CRF_ID ;
   private byte[] T000R6_A937TBT12_CRF_EDA_NO ;
   private String[] T000R6_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] T000R6_A100TBT12_CRF_ITEM_GRP_CD ;
   private long[] T000R7_A96TBT12_STUDY_ID ;
   private int[] T000R7_A97TBT12_SUBJECT_ID ;
   private short[] T000R7_A98TBT12_CRF_ID ;
   private byte[] T000R7_A937TBT12_CRF_EDA_NO ;
   private String[] T000R7_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] T000R7_A100TBT12_CRF_ITEM_GRP_CD ;
   private long[] T000R2_A96TBT12_STUDY_ID ;
   private int[] T000R2_A97TBT12_SUBJECT_ID ;
   private short[] T000R2_A98TBT12_CRF_ID ;
   private byte[] T000R2_A937TBT12_CRF_EDA_NO ;
   private String[] T000R2_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] T000R2_A100TBT12_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000R2_A466TBT12_CRT_DATETIME ;
   private boolean[] T000R2_n466TBT12_CRT_DATETIME ;
   private String[] T000R2_A467TBT12_CRT_USER_ID ;
   private boolean[] T000R2_n467TBT12_CRT_USER_ID ;
   private java.util.Date[] T000R2_A469TBT12_UPD_DATETIME ;
   private boolean[] T000R2_n469TBT12_UPD_DATETIME ;
   private String[] T000R2_A470TBT12_UPD_USER_ID ;
   private boolean[] T000R2_n470TBT12_UPD_USER_ID ;
   private long[] T000R2_A472TBT12_UPD_CNT ;
   private boolean[] T000R2_n472TBT12_UPD_CNT ;
   private String[] T000R2_A465TBT12_CRF_VALUE ;
   private boolean[] T000R2_n465TBT12_CRF_VALUE ;
   private String[] T000R2_A679TBT12_EDIT_FLG ;
   private boolean[] T000R2_n679TBT12_EDIT_FLG ;
   private String[] T000R2_A473TBT12_DEL_FLG ;
   private boolean[] T000R2_n473TBT12_DEL_FLG ;
   private String[] T000R2_A468TBT12_CRT_PROG_NM ;
   private boolean[] T000R2_n468TBT12_CRT_PROG_NM ;
   private String[] T000R2_A471TBT12_UPD_PROG_NM ;
   private boolean[] T000R2_n471TBT12_UPD_PROG_NM ;
   private long[] T000R11_A96TBT12_STUDY_ID ;
   private int[] T000R11_A97TBT12_SUBJECT_ID ;
   private short[] T000R11_A98TBT12_CRF_ID ;
   private byte[] T000R11_A937TBT12_CRF_EDA_NO ;
   private String[] T000R11_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] T000R11_A100TBT12_CRF_ITEM_GRP_CD ;
}

final  class tbt12_crf_result__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000R2", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_CNT`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000R3", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_CNT`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000R4", "SELECT TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_EDA_NO`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD`, TM1.`TBT12_CRT_DATETIME`, TM1.`TBT12_CRT_USER_ID`, TM1.`TBT12_UPD_DATETIME`, TM1.`TBT12_UPD_USER_ID`, TM1.`TBT12_UPD_CNT`, TM1.`TBT12_CRF_VALUE`, TM1.`TBT12_EDIT_FLG`, TM1.`TBT12_DEL_FLG`, TM1.`TBT12_CRT_PROG_NM`, TM1.`TBT12_UPD_PROG_NM` FROM `TBT12_CRF_RESULT` TM1 WHERE TM1.`TBT12_STUDY_ID` = ? and TM1.`TBT12_SUBJECT_ID` = ? and TM1.`TBT12_CRF_ID` = ? and TM1.`TBT12_CRF_EDA_NO` = ? and TM1.`TBT12_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT12_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT12_STUDY_ID`, TM1.`TBT12_SUBJECT_ID`, TM1.`TBT12_CRF_ID`, TM1.`TBT12_CRF_EDA_NO`, TM1.`TBT12_CRF_ITEM_GRP_DIV`, TM1.`TBT12_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000R5", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD` FROM `TBT12_CRF_RESULT` WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000R6", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD` FROM `TBT12_CRF_RESULT` WHERE ( `TBT12_STUDY_ID` > ? or `TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` > ? or `TBT12_SUBJECT_ID` = ? and `TBT12_STUDY_ID` = ? and `TBT12_CRF_ID` > ? or `TBT12_CRF_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_STUDY_ID` = ? and `TBT12_CRF_EDA_NO` > ? or `TBT12_CRF_EDA_NO` = ? and `TBT12_CRF_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_STUDY_ID` = ? and `TBT12_CRF_ITEM_GRP_DIV` > ? or `TBT12_CRF_ITEM_GRP_DIV` = ? and `TBT12_CRF_EDA_NO` = ? and `TBT12_CRF_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_STUDY_ID` = ? and `TBT12_CRF_ITEM_GRP_CD` > ?) ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000R7", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD` FROM `TBT12_CRF_RESULT` WHERE ( `TBT12_STUDY_ID` < ? or `TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` < ? or `TBT12_SUBJECT_ID` = ? and `TBT12_STUDY_ID` = ? and `TBT12_CRF_ID` < ? or `TBT12_CRF_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_STUDY_ID` = ? and `TBT12_CRF_EDA_NO` < ? or `TBT12_CRF_EDA_NO` = ? and `TBT12_CRF_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_STUDY_ID` = ? and `TBT12_CRF_ITEM_GRP_DIV` < ? or `TBT12_CRF_ITEM_GRP_DIV` = ? and `TBT12_CRF_EDA_NO` = ? and `TBT12_CRF_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_STUDY_ID` = ? and `TBT12_CRF_ITEM_GRP_CD` < ?) ORDER BY `TBT12_STUDY_ID` DESC, `TBT12_SUBJECT_ID` DESC, `TBT12_CRF_ID` DESC, `TBT12_CRF_EDA_NO` DESC, `TBT12_CRF_ITEM_GRP_DIV` DESC, `TBT12_CRF_ITEM_GRP_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000R8", "INSERT INTO `TBT12_CRF_RESULT`(`TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRT_DATETIME`, `TBT12_CRT_USER_ID`, `TBT12_UPD_DATETIME`, `TBT12_UPD_USER_ID`, `TBT12_UPD_CNT`, `TBT12_CRF_VALUE`, `TBT12_EDIT_FLG`, `TBT12_DEL_FLG`, `TBT12_CRT_PROG_NM`, `TBT12_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000R9", "UPDATE `TBT12_CRF_RESULT` SET `TBT12_CRT_DATETIME`=?, `TBT12_CRT_USER_ID`=?, `TBT12_UPD_DATETIME`=?, `TBT12_UPD_USER_ID`=?, `TBT12_UPD_CNT`=?, `TBT12_CRF_VALUE`=?, `TBT12_EDIT_FLG`=?, `TBT12_DEL_FLG`=?, `TBT12_CRT_PROG_NM`=?, `TBT12_UPD_PROG_NM`=?  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000R10", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? AND `TBT12_SUBJECT_ID` = ? AND `TBT12_CRF_ID` = ? AND `TBT12_CRF_EDA_NO` = ? AND `TBT12_CRF_ITEM_GRP_DIV` = ? AND `TBT12_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000R11", "SELECT `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD` FROM `TBT12_CRF_RESULT` ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ITEM_GRP_DIV`, `TBT12_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
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
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
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
               stmt.setVarchar(15, (String)parms[14], 1, false);
               stmt.setVarchar(16, (String)parms[15], 1, false);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setLong(20, ((Number) parms[19]).longValue());
               stmt.setVarchar(21, (String)parms[20], 50, false);
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
               stmt.setVarchar(15, (String)parms[14], 1, false);
               stmt.setVarchar(16, (String)parms[15], 1, false);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setLong(20, ((Number) parms[19]).longValue());
               stmt.setVarchar(21, (String)parms[20], 50, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[13], 128);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[15]).longValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[17], 2000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 2000);
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
               stmt.setLong(11, ((Number) parms[20]).longValue());
               stmt.setInt(12, ((Number) parms[21]).intValue());
               stmt.setShort(13, ((Number) parms[22]).shortValue());
               stmt.setByte(14, ((Number) parms[23]).byteValue());
               stmt.setVarchar(15, (String)parms[24], 1, false);
               stmt.setVarchar(16, (String)parms[25], 50, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setVarchar(5, (String)parms[4], 1, false);
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
      }
   }

}

