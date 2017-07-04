/*
               File: tbt13_crf_res_his_impl
        Description: CRF入力結果履歴テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:44.95
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt13_crf_res_his_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBT13_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbt13_crt_user_id1258( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBT13_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbt13_upd_user_id1258( Gx_mode) ;
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
         Form.getMeta().addItem("description", "CRF入力結果履歴テーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbt13_crf_res_his_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt13_crf_res_his_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt13_crf_res_his_impl.class ));
   }

   public tbt13_crf_res_his_impl( int remoteHandle ,
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
         wb_table1_2_1258( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1258e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1258( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1258( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1258( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1258e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRF入力結果履歴テーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TBT13_CRF_RES_HIS.htm");
         wb_table3_28_1258( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1258e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1258e( true) ;
      }
      else
      {
         wb_table1_2_1258e( false) ;
      }
   }

   public void wb_table3_28_1258( boolean wbgen )
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
         wb_table4_34_1258( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1258e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT13_CRF_RES_HIS.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT13_CRF_RES_HIS.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1258e( true) ;
      }
      else
      {
         wb_table3_28_1258e( false) ;
      }
   }

   public void wb_table4_34_1258( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_study_id_Internalname, "試験ID", "", "", lblTextblocktbt13_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A101TBT13_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT13_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A101TBT13_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A101TBT13_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt13_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A102TBT13_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT13_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A102TBT13_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A102TBT13_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_crf_id_Internalname, "CRFID", "", "", lblTextblocktbt13_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A103TBT13_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBT13_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A103TBT13_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A103TBT13_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_crf_eda_no_Internalname, "CRF枝番", "", "", lblTextblocktbt13_crf_eda_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_CRF_EDA_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A938TBT13_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")), ((edtTBT13_CRF_EDA_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A938TBT13_CRF_EDA_NO), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A938TBT13_CRF_EDA_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_CRF_EDA_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_CRF_EDA_NO_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_crf_version_Internalname, "CRF更新バージョン", "", "", lblTextblocktbt13_crf_version_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_CRF_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A104TBT13_CRF_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBT13_CRF_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A104TBT13_CRF_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A104TBT13_CRF_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_CRF_VERSION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_CRF_VERSION_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_VERSION", "right", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_crf_item_grp_div_Internalname, "項目・グループ識別区分", "", "", lblTextblocktbt13_crf_item_grp_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_CRF_ITEM_GRP_DIV_Internalname, GXutil.rtrim( A105TBT13_CRF_ITEM_GRP_DIV), GXutil.rtrim( localUtil.format( A105TBT13_CRF_ITEM_GRP_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_CRF_ITEM_GRP_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_CRF_ITEM_GRP_DIV_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_DIV", "left", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_crf_item_grp_cd_Internalname, "CRF項目・項目グループコード", "", "", lblTextblocktbt13_crf_item_grp_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A106TBT13_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A106TBT13_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_CRF_ITEM_GRP_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_CRF_ITEM_GRP_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_crf_value_Internalname, "入力値", "", "", lblTextblocktbt13_crf_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT13_CRF_VALUE_Internalname, GXutil.rtrim( A597TBT13_CRF_VALUE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", (short)(0), 1, edtTBT13_CRF_VALUE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, "", "", (byte)(-1), true, "", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_edit_flg_Internalname, "変更フラグ", "", "", lblTextblocktbt13_edit_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_EDIT_FLG_Internalname, GXutil.rtrim( A680TBT13_EDIT_FLG), GXutil.rtrim( localUtil.format( A680TBT13_EDIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_EDIT_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_EDIT_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt13_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_DEL_FLG_Internalname, GXutil.rtrim( A598TBT13_DEL_FLG), GXutil.rtrim( localUtil.format( A598TBT13_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt13_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT13_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_CRT_DATETIME_Internalname, localUtil.format(A599TBT13_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A599TBT13_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT13_CRF_RES_HIS.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT13_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT13_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt13_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_CRT_USER_ID_Internalname, GXutil.rtrim( A600TBT13_CRT_USER_ID), GXutil.rtrim( localUtil.format( A600TBT13_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt13_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_CRT_PROG_NM_Internalname, GXutil.rtrim( A601TBT13_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A601TBT13_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt13_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT13_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_UPD_DATETIME_Internalname, localUtil.format(A602TBT13_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A602TBT13_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT13_CRF_RES_HIS.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT13_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT13_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt13_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_UPD_USER_ID_Internalname, GXutil.rtrim( A603TBT13_UPD_USER_ID), GXutil.rtrim( localUtil.format( A603TBT13_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt13_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_UPD_PROG_NM_Internalname, GXutil.rtrim( A604TBT13_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A604TBT13_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt13_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt13_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT13_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A605TBT13_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT13_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A605TBT13_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A605TBT13_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT13_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT13_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBT13_CRF_RES_HIS.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1258e( true) ;
      }
      else
      {
         wb_table4_34_1258e( false) ;
      }
   }

   public void wb_table2_5_1258( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT13_CRF_RES_HIS.htm");
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
         wb_table2_5_1258e( true) ;
      }
      else
      {
         wb_table2_5_1258e( false) ;
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
      /* Execute user event: e11122 */
      e11122 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT13_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A101TBT13_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
            }
            else
            {
               A101TBT13_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT13_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT13_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT13_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A102TBT13_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A102TBT13_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT13_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT13_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT13_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A103TBT13_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
            }
            else
            {
               A103TBT13_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT13_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_CRF_EDA_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_CRF_EDA_NO_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT13_CRF_EDA_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT13_CRF_EDA_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A938TBT13_CRF_EDA_NO = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
            }
            else
            {
               A938TBT13_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBT13_CRF_EDA_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_CRF_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_CRF_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT13_CRF_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT13_CRF_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A104TBT13_CRF_VERSION = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
            }
            else
            {
               A104TBT13_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT13_CRF_VERSION_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
            }
            A105TBT13_CRF_ITEM_GRP_DIV = httpContext.cgiGet( edtTBT13_CRF_ITEM_GRP_DIV_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
            A106TBT13_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBT13_CRF_ITEM_GRP_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
            A597TBT13_CRF_VALUE = httpContext.cgiGet( edtTBT13_CRF_VALUE_Internalname) ;
            n597TBT13_CRF_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A597TBT13_CRF_VALUE", A597TBT13_CRF_VALUE);
            n597TBT13_CRF_VALUE = ((GXutil.strcmp("", A597TBT13_CRF_VALUE)==0) ? true : false) ;
            A680TBT13_EDIT_FLG = httpContext.cgiGet( edtTBT13_EDIT_FLG_Internalname) ;
            n680TBT13_EDIT_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A680TBT13_EDIT_FLG", A680TBT13_EDIT_FLG);
            n680TBT13_EDIT_FLG = ((GXutil.strcmp("", A680TBT13_EDIT_FLG)==0) ? true : false) ;
            A598TBT13_DEL_FLG = httpContext.cgiGet( edtTBT13_DEL_FLG_Internalname) ;
            n598TBT13_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A598TBT13_DEL_FLG", A598TBT13_DEL_FLG);
            n598TBT13_DEL_FLG = ((GXutil.strcmp("", A598TBT13_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT13_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT13_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT13_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n599TBT13_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A599TBT13_CRT_DATETIME", localUtil.ttoc( A599TBT13_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A599TBT13_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT13_CRT_DATETIME_Internalname)) ;
               n599TBT13_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A599TBT13_CRT_DATETIME", localUtil.ttoc( A599TBT13_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n599TBT13_CRT_DATETIME = (GXutil.nullDate().equals(A599TBT13_CRT_DATETIME) ? true : false) ;
            A600TBT13_CRT_USER_ID = httpContext.cgiGet( edtTBT13_CRT_USER_ID_Internalname) ;
            n600TBT13_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A600TBT13_CRT_USER_ID", A600TBT13_CRT_USER_ID);
            n600TBT13_CRT_USER_ID = ((GXutil.strcmp("", A600TBT13_CRT_USER_ID)==0) ? true : false) ;
            A601TBT13_CRT_PROG_NM = httpContext.cgiGet( edtTBT13_CRT_PROG_NM_Internalname) ;
            n601TBT13_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A601TBT13_CRT_PROG_NM", A601TBT13_CRT_PROG_NM);
            n601TBT13_CRT_PROG_NM = ((GXutil.strcmp("", A601TBT13_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT13_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT13_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT13_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n602TBT13_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602TBT13_UPD_DATETIME", localUtil.ttoc( A602TBT13_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A602TBT13_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT13_UPD_DATETIME_Internalname)) ;
               n602TBT13_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602TBT13_UPD_DATETIME", localUtil.ttoc( A602TBT13_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n602TBT13_UPD_DATETIME = (GXutil.nullDate().equals(A602TBT13_UPD_DATETIME) ? true : false) ;
            A603TBT13_UPD_USER_ID = httpContext.cgiGet( edtTBT13_UPD_USER_ID_Internalname) ;
            n603TBT13_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A603TBT13_UPD_USER_ID", A603TBT13_UPD_USER_ID);
            n603TBT13_UPD_USER_ID = ((GXutil.strcmp("", A603TBT13_UPD_USER_ID)==0) ? true : false) ;
            A604TBT13_UPD_PROG_NM = httpContext.cgiGet( edtTBT13_UPD_PROG_NM_Internalname) ;
            n604TBT13_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A604TBT13_UPD_PROG_NM", A604TBT13_UPD_PROG_NM);
            n604TBT13_UPD_PROG_NM = ((GXutil.strcmp("", A604TBT13_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT13_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT13_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT13_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A605TBT13_UPD_CNT = 0 ;
               n605TBT13_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A605TBT13_UPD_CNT", GXutil.ltrim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)));
            }
            else
            {
               A605TBT13_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT13_UPD_CNT_Internalname), ".", ",") ;
               n605TBT13_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A605TBT13_UPD_CNT", GXutil.ltrim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)));
            }
            n605TBT13_UPD_CNT = ((0==A605TBT13_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z101TBT13_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z101TBT13_STUDY_ID"), ".", ",") ;
            Z102TBT13_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z102TBT13_SUBJECT_ID"), ".", ",")) ;
            Z103TBT13_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z103TBT13_CRF_ID"), ".", ",")) ;
            Z938TBT13_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z938TBT13_CRF_EDA_NO"), ".", ",")) ;
            Z104TBT13_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z104TBT13_CRF_VERSION"), ".", ",")) ;
            Z105TBT13_CRF_ITEM_GRP_DIV = httpContext.cgiGet( "Z105TBT13_CRF_ITEM_GRP_DIV") ;
            Z106TBT13_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z106TBT13_CRF_ITEM_GRP_CD") ;
            Z599TBT13_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z599TBT13_CRT_DATETIME"), 0) ;
            n599TBT13_CRT_DATETIME = (GXutil.nullDate().equals(A599TBT13_CRT_DATETIME) ? true : false) ;
            Z600TBT13_CRT_USER_ID = httpContext.cgiGet( "Z600TBT13_CRT_USER_ID") ;
            n600TBT13_CRT_USER_ID = ((GXutil.strcmp("", A600TBT13_CRT_USER_ID)==0) ? true : false) ;
            Z602TBT13_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z602TBT13_UPD_DATETIME"), 0) ;
            n602TBT13_UPD_DATETIME = (GXutil.nullDate().equals(A602TBT13_UPD_DATETIME) ? true : false) ;
            Z603TBT13_UPD_USER_ID = httpContext.cgiGet( "Z603TBT13_UPD_USER_ID") ;
            n603TBT13_UPD_USER_ID = ((GXutil.strcmp("", A603TBT13_UPD_USER_ID)==0) ? true : false) ;
            Z605TBT13_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z605TBT13_UPD_CNT"), ".", ",") ;
            n605TBT13_UPD_CNT = ((0==A605TBT13_UPD_CNT) ? true : false) ;
            Z597TBT13_CRF_VALUE = httpContext.cgiGet( "Z597TBT13_CRF_VALUE") ;
            n597TBT13_CRF_VALUE = ((GXutil.strcmp("", A597TBT13_CRF_VALUE)==0) ? true : false) ;
            Z680TBT13_EDIT_FLG = httpContext.cgiGet( "Z680TBT13_EDIT_FLG") ;
            n680TBT13_EDIT_FLG = ((GXutil.strcmp("", A680TBT13_EDIT_FLG)==0) ? true : false) ;
            Z598TBT13_DEL_FLG = httpContext.cgiGet( "Z598TBT13_DEL_FLG") ;
            n598TBT13_DEL_FLG = ((GXutil.strcmp("", A598TBT13_DEL_FLG)==0) ? true : false) ;
            Z601TBT13_CRT_PROG_NM = httpContext.cgiGet( "Z601TBT13_CRT_PROG_NM") ;
            n601TBT13_CRT_PROG_NM = ((GXutil.strcmp("", A601TBT13_CRT_PROG_NM)==0) ? true : false) ;
            Z604TBT13_UPD_PROG_NM = httpContext.cgiGet( "Z604TBT13_UPD_PROG_NM") ;
            n604TBT13_UPD_PROG_NM = ((GXutil.strcmp("", A604TBT13_UPD_PROG_NM)==0) ? true : false) ;
            O605TBT13_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O605TBT13_UPD_CNT"), ".", ",") ;
            n605TBT13_UPD_CNT = ((0==A605TBT13_UPD_CNT) ? true : false) ;
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
               A101TBT13_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
               A102TBT13_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
               A103TBT13_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
               A938TBT13_CRF_EDA_NO = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
               A104TBT13_CRF_VERSION = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
               A105TBT13_CRF_ITEM_GRP_DIV = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
               A106TBT13_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
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
                     /* Execute user event: e11122 */
                     e11122 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12122 */
                     e12122 ();
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
         /* Execute user event: e12122 */
         e12122 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1258( ) ;
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
      disableAttributes1258( ) ;
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

   public void resetCaption120( )
   {
   }

   public void e11122( )
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

   public void e12122( )
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

   public void zm1258( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z599TBT13_CRT_DATETIME = T00123_A599TBT13_CRT_DATETIME[0] ;
            Z600TBT13_CRT_USER_ID = T00123_A600TBT13_CRT_USER_ID[0] ;
            Z602TBT13_UPD_DATETIME = T00123_A602TBT13_UPD_DATETIME[0] ;
            Z603TBT13_UPD_USER_ID = T00123_A603TBT13_UPD_USER_ID[0] ;
            Z605TBT13_UPD_CNT = T00123_A605TBT13_UPD_CNT[0] ;
            Z597TBT13_CRF_VALUE = T00123_A597TBT13_CRF_VALUE[0] ;
            Z680TBT13_EDIT_FLG = T00123_A680TBT13_EDIT_FLG[0] ;
            Z598TBT13_DEL_FLG = T00123_A598TBT13_DEL_FLG[0] ;
            Z601TBT13_CRT_PROG_NM = T00123_A601TBT13_CRT_PROG_NM[0] ;
            Z604TBT13_UPD_PROG_NM = T00123_A604TBT13_UPD_PROG_NM[0] ;
         }
         else
         {
            Z599TBT13_CRT_DATETIME = A599TBT13_CRT_DATETIME ;
            Z600TBT13_CRT_USER_ID = A600TBT13_CRT_USER_ID ;
            Z602TBT13_UPD_DATETIME = A602TBT13_UPD_DATETIME ;
            Z603TBT13_UPD_USER_ID = A603TBT13_UPD_USER_ID ;
            Z605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
            Z597TBT13_CRF_VALUE = A597TBT13_CRF_VALUE ;
            Z680TBT13_EDIT_FLG = A680TBT13_EDIT_FLG ;
            Z598TBT13_DEL_FLG = A598TBT13_DEL_FLG ;
            Z601TBT13_CRT_PROG_NM = A601TBT13_CRT_PROG_NM ;
            Z604TBT13_UPD_PROG_NM = A604TBT13_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z101TBT13_STUDY_ID = A101TBT13_STUDY_ID ;
         Z102TBT13_SUBJECT_ID = A102TBT13_SUBJECT_ID ;
         Z103TBT13_CRF_ID = A103TBT13_CRF_ID ;
         Z938TBT13_CRF_EDA_NO = A938TBT13_CRF_EDA_NO ;
         Z104TBT13_CRF_VERSION = A104TBT13_CRF_VERSION ;
         Z105TBT13_CRF_ITEM_GRP_DIV = A105TBT13_CRF_ITEM_GRP_DIV ;
         Z106TBT13_CRF_ITEM_GRP_CD = A106TBT13_CRF_ITEM_GRP_CD ;
         Z599TBT13_CRT_DATETIME = A599TBT13_CRT_DATETIME ;
         Z600TBT13_CRT_USER_ID = A600TBT13_CRT_USER_ID ;
         Z602TBT13_UPD_DATETIME = A602TBT13_UPD_DATETIME ;
         Z603TBT13_UPD_USER_ID = A603TBT13_UPD_USER_ID ;
         Z605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
         Z597TBT13_CRF_VALUE = A597TBT13_CRF_VALUE ;
         Z680TBT13_EDIT_FLG = A680TBT13_EDIT_FLG ;
         Z598TBT13_DEL_FLG = A598TBT13_DEL_FLG ;
         Z601TBT13_CRT_PROG_NM = A601TBT13_CRT_PROG_NM ;
         Z604TBT13_UPD_PROG_NM = A604TBT13_UPD_PROG_NM ;
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

   public void load1258( )
   {
      /* Using cursor T00124 */
      pr_default.execute(2, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound58 = (short)(1) ;
         A599TBT13_CRT_DATETIME = T00124_A599TBT13_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A599TBT13_CRT_DATETIME", localUtil.ttoc( A599TBT13_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n599TBT13_CRT_DATETIME = T00124_n599TBT13_CRT_DATETIME[0] ;
         A600TBT13_CRT_USER_ID = T00124_A600TBT13_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A600TBT13_CRT_USER_ID", A600TBT13_CRT_USER_ID);
         n600TBT13_CRT_USER_ID = T00124_n600TBT13_CRT_USER_ID[0] ;
         A602TBT13_UPD_DATETIME = T00124_A602TBT13_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602TBT13_UPD_DATETIME", localUtil.ttoc( A602TBT13_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n602TBT13_UPD_DATETIME = T00124_n602TBT13_UPD_DATETIME[0] ;
         A603TBT13_UPD_USER_ID = T00124_A603TBT13_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603TBT13_UPD_USER_ID", A603TBT13_UPD_USER_ID);
         n603TBT13_UPD_USER_ID = T00124_n603TBT13_UPD_USER_ID[0] ;
         A605TBT13_UPD_CNT = T00124_A605TBT13_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A605TBT13_UPD_CNT", GXutil.ltrim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)));
         n605TBT13_UPD_CNT = T00124_n605TBT13_UPD_CNT[0] ;
         A597TBT13_CRF_VALUE = T00124_A597TBT13_CRF_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597TBT13_CRF_VALUE", A597TBT13_CRF_VALUE);
         n597TBT13_CRF_VALUE = T00124_n597TBT13_CRF_VALUE[0] ;
         A680TBT13_EDIT_FLG = T00124_A680TBT13_EDIT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A680TBT13_EDIT_FLG", A680TBT13_EDIT_FLG);
         n680TBT13_EDIT_FLG = T00124_n680TBT13_EDIT_FLG[0] ;
         A598TBT13_DEL_FLG = T00124_A598TBT13_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A598TBT13_DEL_FLG", A598TBT13_DEL_FLG);
         n598TBT13_DEL_FLG = T00124_n598TBT13_DEL_FLG[0] ;
         A601TBT13_CRT_PROG_NM = T00124_A601TBT13_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A601TBT13_CRT_PROG_NM", A601TBT13_CRT_PROG_NM);
         n601TBT13_CRT_PROG_NM = T00124_n601TBT13_CRT_PROG_NM[0] ;
         A604TBT13_UPD_PROG_NM = T00124_A604TBT13_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A604TBT13_UPD_PROG_NM", A604TBT13_UPD_PROG_NM);
         n604TBT13_UPD_PROG_NM = T00124_n604TBT13_UPD_PROG_NM[0] ;
         zm1258( -8) ;
      }
      pr_default.close(2);
      onLoadActions1258( ) ;
   }

   public void onLoadActions1258( )
   {
      AV9Pgmname = "TBT13_CRF_RES_HIS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable1258( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT13_CRF_RES_HIS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A599TBT13_CRT_DATETIME) || (( A599TBT13_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A599TBT13_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBT13_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT13_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A602TBT13_UPD_DATETIME) || (( A602TBT13_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A602TBT13_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBT13_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT13_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1258( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1258( )
   {
      /* Using cursor T00125 */
      pr_default.execute(3, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound58 = (short)(1) ;
      }
      else
      {
         RcdFound58 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00123 */
      pr_default.execute(1, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1258( 8) ;
         RcdFound58 = (short)(1) ;
         A101TBT13_STUDY_ID = T00123_A101TBT13_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
         A102TBT13_SUBJECT_ID = T00123_A102TBT13_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
         A103TBT13_CRF_ID = T00123_A103TBT13_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
         A938TBT13_CRF_EDA_NO = T00123_A938TBT13_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
         A104TBT13_CRF_VERSION = T00123_A104TBT13_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
         A105TBT13_CRF_ITEM_GRP_DIV = T00123_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
         A106TBT13_CRF_ITEM_GRP_CD = T00123_A106TBT13_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
         A599TBT13_CRT_DATETIME = T00123_A599TBT13_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A599TBT13_CRT_DATETIME", localUtil.ttoc( A599TBT13_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n599TBT13_CRT_DATETIME = T00123_n599TBT13_CRT_DATETIME[0] ;
         A600TBT13_CRT_USER_ID = T00123_A600TBT13_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A600TBT13_CRT_USER_ID", A600TBT13_CRT_USER_ID);
         n600TBT13_CRT_USER_ID = T00123_n600TBT13_CRT_USER_ID[0] ;
         A602TBT13_UPD_DATETIME = T00123_A602TBT13_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602TBT13_UPD_DATETIME", localUtil.ttoc( A602TBT13_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n602TBT13_UPD_DATETIME = T00123_n602TBT13_UPD_DATETIME[0] ;
         A603TBT13_UPD_USER_ID = T00123_A603TBT13_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603TBT13_UPD_USER_ID", A603TBT13_UPD_USER_ID);
         n603TBT13_UPD_USER_ID = T00123_n603TBT13_UPD_USER_ID[0] ;
         A605TBT13_UPD_CNT = T00123_A605TBT13_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A605TBT13_UPD_CNT", GXutil.ltrim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)));
         n605TBT13_UPD_CNT = T00123_n605TBT13_UPD_CNT[0] ;
         A597TBT13_CRF_VALUE = T00123_A597TBT13_CRF_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A597TBT13_CRF_VALUE", A597TBT13_CRF_VALUE);
         n597TBT13_CRF_VALUE = T00123_n597TBT13_CRF_VALUE[0] ;
         A680TBT13_EDIT_FLG = T00123_A680TBT13_EDIT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A680TBT13_EDIT_FLG", A680TBT13_EDIT_FLG);
         n680TBT13_EDIT_FLG = T00123_n680TBT13_EDIT_FLG[0] ;
         A598TBT13_DEL_FLG = T00123_A598TBT13_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A598TBT13_DEL_FLG", A598TBT13_DEL_FLG);
         n598TBT13_DEL_FLG = T00123_n598TBT13_DEL_FLG[0] ;
         A601TBT13_CRT_PROG_NM = T00123_A601TBT13_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A601TBT13_CRT_PROG_NM", A601TBT13_CRT_PROG_NM);
         n601TBT13_CRT_PROG_NM = T00123_n601TBT13_CRT_PROG_NM[0] ;
         A604TBT13_UPD_PROG_NM = T00123_A604TBT13_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A604TBT13_UPD_PROG_NM", A604TBT13_UPD_PROG_NM);
         n604TBT13_UPD_PROG_NM = T00123_n604TBT13_UPD_PROG_NM[0] ;
         O605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
         n605TBT13_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A605TBT13_UPD_CNT", GXutil.ltrim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)));
         Z101TBT13_STUDY_ID = A101TBT13_STUDY_ID ;
         Z102TBT13_SUBJECT_ID = A102TBT13_SUBJECT_ID ;
         Z103TBT13_CRF_ID = A103TBT13_CRF_ID ;
         Z938TBT13_CRF_EDA_NO = A938TBT13_CRF_EDA_NO ;
         Z104TBT13_CRF_VERSION = A104TBT13_CRF_VERSION ;
         Z105TBT13_CRF_ITEM_GRP_DIV = A105TBT13_CRF_ITEM_GRP_DIV ;
         Z106TBT13_CRF_ITEM_GRP_CD = A106TBT13_CRF_ITEM_GRP_CD ;
         sMode58 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1258( ) ;
         if ( AnyError == 1 )
         {
            RcdFound58 = (short)(0) ;
            initializeNonKey1258( ) ;
         }
         Gx_mode = sMode58 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound58 = (short)(0) ;
         initializeNonKey1258( ) ;
         sMode58 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode58 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1258( ) ;
      if ( RcdFound58 == 0 )
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
      RcdFound58 = (short)(0) ;
      /* Using cursor T00126 */
      pr_default.execute(4, new Object[] {new Long(A101TBT13_STUDY_ID), new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), new Short(A103TBT13_CRF_ID), new Short(A103TBT13_CRF_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), new Byte(A938TBT13_CRF_EDA_NO), new Byte(A938TBT13_CRF_EDA_NO), new Short(A103TBT13_CRF_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), new Short(A104TBT13_CRF_VERSION), new Short(A104TBT13_CRF_VERSION), new Byte(A938TBT13_CRF_EDA_NO), new Short(A103TBT13_CRF_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), A105TBT13_CRF_ITEM_GRP_DIV, A105TBT13_CRF_ITEM_GRP_DIV, new Short(A104TBT13_CRF_VERSION), new Byte(A938TBT13_CRF_EDA_NO), new Short(A103TBT13_CRF_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), A106TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00126_A101TBT13_STUDY_ID[0] < A101TBT13_STUDY_ID ) || ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] < A102TBT13_SUBJECT_ID ) || ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00126_A103TBT13_CRF_ID[0] < A103TBT13_CRF_ID ) || ( T00126_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00126_A938TBT13_CRF_EDA_NO[0] < A938TBT13_CRF_EDA_NO ) || ( T00126_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00126_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00126_A104TBT13_CRF_VERSION[0] < A104TBT13_CRF_VERSION ) || ( T00126_A104TBT13_CRF_VERSION[0] == A104TBT13_CRF_VERSION ) && ( T00126_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00126_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( GXutil.strcmp(T00126_A105TBT13_CRF_ITEM_GRP_DIV[0], A105TBT13_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T00126_A105TBT13_CRF_ITEM_GRP_DIV[0], A105TBT13_CRF_ITEM_GRP_DIV) == 0 ) && ( T00126_A104TBT13_CRF_VERSION[0] == A104TBT13_CRF_VERSION ) && ( T00126_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00126_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( GXutil.strcmp(T00126_A106TBT13_CRF_ITEM_GRP_CD[0], A106TBT13_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00126_A101TBT13_STUDY_ID[0] > A101TBT13_STUDY_ID ) || ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] > A102TBT13_SUBJECT_ID ) || ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00126_A103TBT13_CRF_ID[0] > A103TBT13_CRF_ID ) || ( T00126_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00126_A938TBT13_CRF_EDA_NO[0] > A938TBT13_CRF_EDA_NO ) || ( T00126_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00126_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00126_A104TBT13_CRF_VERSION[0] > A104TBT13_CRF_VERSION ) || ( T00126_A104TBT13_CRF_VERSION[0] == A104TBT13_CRF_VERSION ) && ( T00126_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00126_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( GXutil.strcmp(T00126_A105TBT13_CRF_ITEM_GRP_DIV[0], A105TBT13_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T00126_A105TBT13_CRF_ITEM_GRP_DIV[0], A105TBT13_CRF_ITEM_GRP_DIV) == 0 ) && ( T00126_A104TBT13_CRF_VERSION[0] == A104TBT13_CRF_VERSION ) && ( T00126_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00126_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00126_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00126_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( GXutil.strcmp(T00126_A106TBT13_CRF_ITEM_GRP_CD[0], A106TBT13_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            A101TBT13_STUDY_ID = T00126_A101TBT13_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
            A102TBT13_SUBJECT_ID = T00126_A102TBT13_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
            A103TBT13_CRF_ID = T00126_A103TBT13_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
            A938TBT13_CRF_EDA_NO = T00126_A938TBT13_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
            A104TBT13_CRF_VERSION = T00126_A104TBT13_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
            A105TBT13_CRF_ITEM_GRP_DIV = T00126_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
            A106TBT13_CRF_ITEM_GRP_CD = T00126_A106TBT13_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
            RcdFound58 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound58 = (short)(0) ;
      /* Using cursor T00127 */
      pr_default.execute(5, new Object[] {new Long(A101TBT13_STUDY_ID), new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), new Short(A103TBT13_CRF_ID), new Short(A103TBT13_CRF_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), new Byte(A938TBT13_CRF_EDA_NO), new Byte(A938TBT13_CRF_EDA_NO), new Short(A103TBT13_CRF_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), new Short(A104TBT13_CRF_VERSION), new Short(A104TBT13_CRF_VERSION), new Byte(A938TBT13_CRF_EDA_NO), new Short(A103TBT13_CRF_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), A105TBT13_CRF_ITEM_GRP_DIV, A105TBT13_CRF_ITEM_GRP_DIV, new Short(A104TBT13_CRF_VERSION), new Byte(A938TBT13_CRF_EDA_NO), new Short(A103TBT13_CRF_ID), new Integer(A102TBT13_SUBJECT_ID), new Long(A101TBT13_STUDY_ID), A106TBT13_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00127_A101TBT13_STUDY_ID[0] > A101TBT13_STUDY_ID ) || ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] > A102TBT13_SUBJECT_ID ) || ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00127_A103TBT13_CRF_ID[0] > A103TBT13_CRF_ID ) || ( T00127_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00127_A938TBT13_CRF_EDA_NO[0] > A938TBT13_CRF_EDA_NO ) || ( T00127_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00127_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00127_A104TBT13_CRF_VERSION[0] > A104TBT13_CRF_VERSION ) || ( T00127_A104TBT13_CRF_VERSION[0] == A104TBT13_CRF_VERSION ) && ( T00127_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00127_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( GXutil.strcmp(T00127_A105TBT13_CRF_ITEM_GRP_DIV[0], A105TBT13_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T00127_A105TBT13_CRF_ITEM_GRP_DIV[0], A105TBT13_CRF_ITEM_GRP_DIV) == 0 ) && ( T00127_A104TBT13_CRF_VERSION[0] == A104TBT13_CRF_VERSION ) && ( T00127_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00127_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( GXutil.strcmp(T00127_A106TBT13_CRF_ITEM_GRP_CD[0], A106TBT13_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00127_A101TBT13_STUDY_ID[0] < A101TBT13_STUDY_ID ) || ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] < A102TBT13_SUBJECT_ID ) || ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00127_A103TBT13_CRF_ID[0] < A103TBT13_CRF_ID ) || ( T00127_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00127_A938TBT13_CRF_EDA_NO[0] < A938TBT13_CRF_EDA_NO ) || ( T00127_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00127_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( T00127_A104TBT13_CRF_VERSION[0] < A104TBT13_CRF_VERSION ) || ( T00127_A104TBT13_CRF_VERSION[0] == A104TBT13_CRF_VERSION ) && ( T00127_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00127_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( GXutil.strcmp(T00127_A105TBT13_CRF_ITEM_GRP_DIV[0], A105TBT13_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T00127_A105TBT13_CRF_ITEM_GRP_DIV[0], A105TBT13_CRF_ITEM_GRP_DIV) == 0 ) && ( T00127_A104TBT13_CRF_VERSION[0] == A104TBT13_CRF_VERSION ) && ( T00127_A938TBT13_CRF_EDA_NO[0] == A938TBT13_CRF_EDA_NO ) && ( T00127_A103TBT13_CRF_ID[0] == A103TBT13_CRF_ID ) && ( T00127_A102TBT13_SUBJECT_ID[0] == A102TBT13_SUBJECT_ID ) && ( T00127_A101TBT13_STUDY_ID[0] == A101TBT13_STUDY_ID ) && ( GXutil.strcmp(T00127_A106TBT13_CRF_ITEM_GRP_CD[0], A106TBT13_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            A101TBT13_STUDY_ID = T00127_A101TBT13_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
            A102TBT13_SUBJECT_ID = T00127_A102TBT13_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
            A103TBT13_CRF_ID = T00127_A103TBT13_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
            A938TBT13_CRF_EDA_NO = T00127_A938TBT13_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
            A104TBT13_CRF_VERSION = T00127_A104TBT13_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
            A105TBT13_CRF_ITEM_GRP_DIV = T00127_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
            A106TBT13_CRF_ITEM_GRP_CD = T00127_A106TBT13_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
            RcdFound58 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1258( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1258( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound58 == 1 )
         {
            if ( ( A101TBT13_STUDY_ID != Z101TBT13_STUDY_ID ) || ( A102TBT13_SUBJECT_ID != Z102TBT13_SUBJECT_ID ) || ( A103TBT13_CRF_ID != Z103TBT13_CRF_ID ) || ( A938TBT13_CRF_EDA_NO != Z938TBT13_CRF_EDA_NO ) || ( A104TBT13_CRF_VERSION != Z104TBT13_CRF_VERSION ) || ( GXutil.strcmp(A105TBT13_CRF_ITEM_GRP_DIV, Z105TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A106TBT13_CRF_ITEM_GRP_CD, Z106TBT13_CRF_ITEM_GRP_CD) != 0 ) )
            {
               A101TBT13_STUDY_ID = Z101TBT13_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
               A102TBT13_SUBJECT_ID = Z102TBT13_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
               A103TBT13_CRF_ID = Z103TBT13_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
               A938TBT13_CRF_EDA_NO = Z938TBT13_CRF_EDA_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
               A104TBT13_CRF_VERSION = Z104TBT13_CRF_VERSION ;
               httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
               A105TBT13_CRF_ITEM_GRP_DIV = Z105TBT13_CRF_ITEM_GRP_DIV ;
               httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
               A106TBT13_CRF_ITEM_GRP_CD = Z106TBT13_CRF_ITEM_GRP_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBT13_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1258( ) ;
               GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A101TBT13_STUDY_ID != Z101TBT13_STUDY_ID ) || ( A102TBT13_SUBJECT_ID != Z102TBT13_SUBJECT_ID ) || ( A103TBT13_CRF_ID != Z103TBT13_CRF_ID ) || ( A938TBT13_CRF_EDA_NO != Z938TBT13_CRF_EDA_NO ) || ( A104TBT13_CRF_VERSION != Z104TBT13_CRF_VERSION ) || ( GXutil.strcmp(A105TBT13_CRF_ITEM_GRP_DIV, Z105TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A106TBT13_CRF_ITEM_GRP_CD, Z106TBT13_CRF_ITEM_GRP_CD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1258( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBT13_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1258( ) ;
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
      if ( ( A101TBT13_STUDY_ID != Z101TBT13_STUDY_ID ) || ( A102TBT13_SUBJECT_ID != Z102TBT13_SUBJECT_ID ) || ( A103TBT13_CRF_ID != Z103TBT13_CRF_ID ) || ( A938TBT13_CRF_EDA_NO != Z938TBT13_CRF_EDA_NO ) || ( A104TBT13_CRF_VERSION != Z104TBT13_CRF_VERSION ) || ( GXutil.strcmp(A105TBT13_CRF_ITEM_GRP_DIV, Z105TBT13_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A106TBT13_CRF_ITEM_GRP_CD, Z106TBT13_CRF_ITEM_GRP_CD) != 0 ) )
      {
         A101TBT13_STUDY_ID = Z101TBT13_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
         A102TBT13_SUBJECT_ID = Z102TBT13_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
         A103TBT13_CRF_ID = Z103TBT13_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
         A938TBT13_CRF_EDA_NO = Z938TBT13_CRF_EDA_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
         A104TBT13_CRF_VERSION = Z104TBT13_CRF_VERSION ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
         A105TBT13_CRF_ITEM_GRP_DIV = Z105TBT13_CRF_ITEM_GRP_DIV ;
         httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
         A106TBT13_CRF_ITEM_GRP_CD = Z106TBT13_CRF_ITEM_GRP_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBT13_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
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
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT13_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT13_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBT13_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1258( ) ;
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT13_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1258( ) ;
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
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT13_CRF_VALUE_Internalname ;
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
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT13_CRF_VALUE_Internalname ;
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
      scanStart1258( ) ;
      if ( RcdFound58 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound58 != 0 )
         {
            scanNext1258( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT13_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1258( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1258( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00122 */
         pr_default.execute(0, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT13_CRF_RES_HIS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z599TBT13_CRT_DATETIME.equals( T00122_A599TBT13_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z600TBT13_CRT_USER_ID, T00122_A600TBT13_CRT_USER_ID[0]) != 0 ) || !( Z602TBT13_UPD_DATETIME.equals( T00122_A602TBT13_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z603TBT13_UPD_USER_ID, T00122_A603TBT13_UPD_USER_ID[0]) != 0 ) || ( Z605TBT13_UPD_CNT != T00122_A605TBT13_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z597TBT13_CRF_VALUE, T00122_A597TBT13_CRF_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z680TBT13_EDIT_FLG, T00122_A680TBT13_EDIT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z598TBT13_DEL_FLG, T00122_A598TBT13_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z601TBT13_CRT_PROG_NM, T00122_A601TBT13_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z604TBT13_UPD_PROG_NM, T00122_A604TBT13_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT13_CRF_RES_HIS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1258( )
   {
      beforeValidate1258( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1258( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1258( 0) ;
         checkOptimisticConcurrency1258( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1258( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1258( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00128 */
                  pr_default.execute(6, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD, new Boolean(n599TBT13_CRT_DATETIME), A599TBT13_CRT_DATETIME, new Boolean(n600TBT13_CRT_USER_ID), A600TBT13_CRT_USER_ID, new Boolean(n602TBT13_UPD_DATETIME), A602TBT13_UPD_DATETIME, new Boolean(n603TBT13_UPD_USER_ID), A603TBT13_UPD_USER_ID, new Boolean(n605TBT13_UPD_CNT), new Long(A605TBT13_UPD_CNT), new Boolean(n597TBT13_CRF_VALUE), A597TBT13_CRF_VALUE, new Boolean(n680TBT13_EDIT_FLG), A680TBT13_EDIT_FLG, new Boolean(n598TBT13_DEL_FLG), A598TBT13_DEL_FLG, new Boolean(n601TBT13_CRT_PROG_NM), A601TBT13_CRT_PROG_NM, new Boolean(n604TBT13_UPD_PROG_NM), A604TBT13_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
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
                        resetCaption120( ) ;
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
            load1258( ) ;
         }
         endLevel1258( ) ;
      }
      closeExtendedTableCursors1258( ) ;
   }

   public void update1258( )
   {
      beforeValidate1258( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1258( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1258( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1258( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1258( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00129 */
                  pr_default.execute(7, new Object[] {new Boolean(n599TBT13_CRT_DATETIME), A599TBT13_CRT_DATETIME, new Boolean(n600TBT13_CRT_USER_ID), A600TBT13_CRT_USER_ID, new Boolean(n602TBT13_UPD_DATETIME), A602TBT13_UPD_DATETIME, new Boolean(n603TBT13_UPD_USER_ID), A603TBT13_UPD_USER_ID, new Boolean(n605TBT13_UPD_CNT), new Long(A605TBT13_UPD_CNT), new Boolean(n597TBT13_CRF_VALUE), A597TBT13_CRF_VALUE, new Boolean(n680TBT13_EDIT_FLG), A680TBT13_EDIT_FLG, new Boolean(n598TBT13_DEL_FLG), A598TBT13_DEL_FLG, new Boolean(n601TBT13_CRT_PROG_NM), A601TBT13_CRT_PROG_NM, new Boolean(n604TBT13_UPD_PROG_NM), A604TBT13_UPD_PROG_NM, new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT13_CRF_RES_HIS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1258( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption120( ) ;
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
         endLevel1258( ) ;
      }
      closeExtendedTableCursors1258( ) ;
   }

   public void deferredUpdate1258( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1258( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1258( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1258( ) ;
         afterConfirm1258( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1258( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001210 */
               pr_default.execute(8, new Object[] {new Long(A101TBT13_STUDY_ID), new Integer(A102TBT13_SUBJECT_ID), new Short(A103TBT13_CRF_ID), new Byte(A938TBT13_CRF_EDA_NO), new Short(A104TBT13_CRF_VERSION), A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound58 == 0 )
                     {
                        initAll1258( ) ;
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
                     resetCaption120( ) ;
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
      sMode58 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1258( ) ;
      Gx_mode = sMode58 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1258( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT13_CRF_RES_HIS" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel1258( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1258( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbt13_crf_res_his");
         if ( AnyError == 0 )
         {
            confirmValues120( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbt13_crf_res_his");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1258( )
   {
      /* Scan By routine */
      /* Using cursor T001211 */
      pr_default.execute(9);
      RcdFound58 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound58 = (short)(1) ;
         A101TBT13_STUDY_ID = T001211_A101TBT13_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
         A102TBT13_SUBJECT_ID = T001211_A102TBT13_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
         A103TBT13_CRF_ID = T001211_A103TBT13_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
         A938TBT13_CRF_EDA_NO = T001211_A938TBT13_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
         A104TBT13_CRF_VERSION = T001211_A104TBT13_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
         A105TBT13_CRF_ITEM_GRP_DIV = T001211_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
         A106TBT13_CRF_ITEM_GRP_CD = T001211_A106TBT13_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1258( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound58 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound58 = (short)(1) ;
         A101TBT13_STUDY_ID = T001211_A101TBT13_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
         A102TBT13_SUBJECT_ID = T001211_A102TBT13_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
         A103TBT13_CRF_ID = T001211_A103TBT13_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
         A938TBT13_CRF_EDA_NO = T001211_A938TBT13_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
         A104TBT13_CRF_VERSION = T001211_A104TBT13_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
         A105TBT13_CRF_ITEM_GRP_DIV = T001211_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
         A106TBT13_CRF_ITEM_GRP_CD = T001211_A106TBT13_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
      }
   }

   public void scanEnd1258( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1258( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1258( )
   {
      /* Before Insert Rules */
      A599TBT13_CRT_DATETIME = GXutil.now( ) ;
      n599TBT13_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A599TBT13_CRT_DATETIME", localUtil.ttoc( A599TBT13_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A600TBT13_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_impl.this.GXt_char1 = GXv_char2[0] ;
      A600TBT13_CRT_USER_ID = GXt_char1 ;
      n600TBT13_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A600TBT13_CRT_USER_ID", A600TBT13_CRT_USER_ID);
      A602TBT13_UPD_DATETIME = GXutil.now( ) ;
      n602TBT13_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602TBT13_UPD_DATETIME", localUtil.ttoc( A602TBT13_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A603TBT13_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_impl.this.GXt_char1 = GXv_char2[0] ;
      A603TBT13_UPD_USER_ID = GXt_char1 ;
      n603TBT13_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A603TBT13_UPD_USER_ID", A603TBT13_UPD_USER_ID);
      A605TBT13_UPD_CNT = (long)(O605TBT13_UPD_CNT+1) ;
      n605TBT13_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A605TBT13_UPD_CNT", GXutil.ltrim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1258( )
   {
      /* Before Update Rules */
      A602TBT13_UPD_DATETIME = GXutil.now( ) ;
      n602TBT13_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602TBT13_UPD_DATETIME", localUtil.ttoc( A602TBT13_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A603TBT13_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_impl.this.GXt_char1 = GXv_char2[0] ;
      A603TBT13_UPD_USER_ID = GXt_char1 ;
      n603TBT13_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A603TBT13_UPD_USER_ID", A603TBT13_UPD_USER_ID);
      A605TBT13_UPD_CNT = (long)(O605TBT13_UPD_CNT+1) ;
      n605TBT13_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A605TBT13_UPD_CNT", GXutil.ltrim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)));
   }

   public void beforeDelete1258( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1258( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1258( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1258( )
   {
      edtTBT13_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_STUDY_ID_Enabled, 5, 0)));
      edtTBT13_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT13_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_CRF_ID_Enabled, 5, 0)));
      edtTBT13_CRF_EDA_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_CRF_EDA_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_CRF_EDA_NO_Enabled, 5, 0)));
      edtTBT13_CRF_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_CRF_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_CRF_VERSION_Enabled, 5, 0)));
      edtTBT13_CRF_ITEM_GRP_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_CRF_ITEM_GRP_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_CRF_ITEM_GRP_DIV_Enabled, 5, 0)));
      edtTBT13_CRF_ITEM_GRP_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_CRF_ITEM_GRP_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_CRF_ITEM_GRP_CD_Enabled, 5, 0)));
      edtTBT13_CRF_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_CRF_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_CRF_VALUE_Enabled, 5, 0)));
      edtTBT13_EDIT_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_EDIT_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_EDIT_FLG_Enabled, 5, 0)));
      edtTBT13_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_DEL_FLG_Enabled, 5, 0)));
      edtTBT13_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_CRT_DATETIME_Enabled, 5, 0)));
      edtTBT13_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_CRT_USER_ID_Enabled, 5, 0)));
      edtTBT13_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBT13_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_UPD_DATETIME_Enabled, 5, 0)));
      edtTBT13_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_UPD_USER_ID_Enabled, 5, 0)));
      edtTBT13_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBT13_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT13_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT13_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues120( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRF入力結果履歴テーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317154732");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbt13_crf_res_his") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1258( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z101TBT13_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z101TBT13_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z102TBT13_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z102TBT13_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z103TBT13_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z103TBT13_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z938TBT13_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( Z938TBT13_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z104TBT13_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( Z104TBT13_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z105TBT13_CRF_ITEM_GRP_DIV", GXutil.rtrim( Z105TBT13_CRF_ITEM_GRP_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z106TBT13_CRF_ITEM_GRP_CD", GXutil.rtrim( Z106TBT13_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z599TBT13_CRT_DATETIME", localUtil.ttoc( Z599TBT13_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z600TBT13_CRT_USER_ID", GXutil.rtrim( Z600TBT13_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z602TBT13_UPD_DATETIME", localUtil.ttoc( Z602TBT13_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z603TBT13_UPD_USER_ID", GXutil.rtrim( Z603TBT13_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z605TBT13_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z605TBT13_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z597TBT13_CRF_VALUE", GXutil.rtrim( Z597TBT13_CRF_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z680TBT13_EDIT_FLG", GXutil.rtrim( Z680TBT13_EDIT_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z598TBT13_DEL_FLG", GXutil.rtrim( Z598TBT13_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z601TBT13_CRT_PROG_NM", GXutil.rtrim( Z601TBT13_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z604TBT13_UPD_PROG_NM", GXutil.rtrim( Z604TBT13_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O605TBT13_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O605TBT13_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBT13_CRF_RES_HIS" ;
   }

   public String getPgmdesc( )
   {
      return "CRF入力結果履歴テーブル" ;
   }

   public void initializeNonKey1258( )
   {
      A599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n599TBT13_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A599TBT13_CRT_DATETIME", localUtil.ttoc( A599TBT13_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n599TBT13_CRT_DATETIME = (GXutil.nullDate().equals(A599TBT13_CRT_DATETIME) ? true : false) ;
      A600TBT13_CRT_USER_ID = "" ;
      n600TBT13_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A600TBT13_CRT_USER_ID", A600TBT13_CRT_USER_ID);
      n600TBT13_CRT_USER_ID = ((GXutil.strcmp("", A600TBT13_CRT_USER_ID)==0) ? true : false) ;
      A602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n602TBT13_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602TBT13_UPD_DATETIME", localUtil.ttoc( A602TBT13_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n602TBT13_UPD_DATETIME = (GXutil.nullDate().equals(A602TBT13_UPD_DATETIME) ? true : false) ;
      A603TBT13_UPD_USER_ID = "" ;
      n603TBT13_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A603TBT13_UPD_USER_ID", A603TBT13_UPD_USER_ID);
      n603TBT13_UPD_USER_ID = ((GXutil.strcmp("", A603TBT13_UPD_USER_ID)==0) ? true : false) ;
      A605TBT13_UPD_CNT = 0 ;
      n605TBT13_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A605TBT13_UPD_CNT", GXutil.ltrim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)));
      n605TBT13_UPD_CNT = ((0==A605TBT13_UPD_CNT) ? true : false) ;
      A597TBT13_CRF_VALUE = "" ;
      n597TBT13_CRF_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A597TBT13_CRF_VALUE", A597TBT13_CRF_VALUE);
      n597TBT13_CRF_VALUE = ((GXutil.strcmp("", A597TBT13_CRF_VALUE)==0) ? true : false) ;
      A680TBT13_EDIT_FLG = "" ;
      n680TBT13_EDIT_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A680TBT13_EDIT_FLG", A680TBT13_EDIT_FLG);
      n680TBT13_EDIT_FLG = ((GXutil.strcmp("", A680TBT13_EDIT_FLG)==0) ? true : false) ;
      A598TBT13_DEL_FLG = "" ;
      n598TBT13_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A598TBT13_DEL_FLG", A598TBT13_DEL_FLG);
      n598TBT13_DEL_FLG = ((GXutil.strcmp("", A598TBT13_DEL_FLG)==0) ? true : false) ;
      A601TBT13_CRT_PROG_NM = "" ;
      n601TBT13_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A601TBT13_CRT_PROG_NM", A601TBT13_CRT_PROG_NM);
      n601TBT13_CRT_PROG_NM = ((GXutil.strcmp("", A601TBT13_CRT_PROG_NM)==0) ? true : false) ;
      A604TBT13_UPD_PROG_NM = "" ;
      n604TBT13_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A604TBT13_UPD_PROG_NM", A604TBT13_UPD_PROG_NM);
      n604TBT13_UPD_PROG_NM = ((GXutil.strcmp("", A604TBT13_UPD_PROG_NM)==0) ? true : false) ;
      O605TBT13_UPD_CNT = A605TBT13_UPD_CNT ;
      n605TBT13_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A605TBT13_UPD_CNT", GXutil.ltrim( GXutil.str( A605TBT13_UPD_CNT, 10, 0)));
   }

   public void initAll1258( )
   {
      A101TBT13_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A101TBT13_STUDY_ID", GXutil.ltrim( GXutil.str( A101TBT13_STUDY_ID, 10, 0)));
      A102TBT13_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A102TBT13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A102TBT13_SUBJECT_ID, 6, 0)));
      A103TBT13_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A103TBT13_CRF_ID", GXutil.ltrim( GXutil.str( A103TBT13_CRF_ID, 4, 0)));
      A938TBT13_CRF_EDA_NO = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A938TBT13_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A938TBT13_CRF_EDA_NO, 2, 0)));
      A104TBT13_CRF_VERSION = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A104TBT13_CRF_VERSION", GXutil.ltrim( GXutil.str( A104TBT13_CRF_VERSION, 4, 0)));
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A105TBT13_CRF_ITEM_GRP_DIV", A105TBT13_CRF_ITEM_GRP_DIV);
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A106TBT13_CRF_ITEM_GRP_CD", A106TBT13_CRF_ITEM_GRP_CD);
      initializeNonKey1258( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?8960");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317154740");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbt13_crf_res_his.js", "?20177317154742");
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
      lblTextblocktbt13_study_id_Internalname = "TEXTBLOCKTBT13_STUDY_ID" ;
      edtTBT13_STUDY_ID_Internalname = "TBT13_STUDY_ID" ;
      lblTextblocktbt13_subject_id_Internalname = "TEXTBLOCKTBT13_SUBJECT_ID" ;
      edtTBT13_SUBJECT_ID_Internalname = "TBT13_SUBJECT_ID" ;
      lblTextblocktbt13_crf_id_Internalname = "TEXTBLOCKTBT13_CRF_ID" ;
      edtTBT13_CRF_ID_Internalname = "TBT13_CRF_ID" ;
      lblTextblocktbt13_crf_eda_no_Internalname = "TEXTBLOCKTBT13_CRF_EDA_NO" ;
      edtTBT13_CRF_EDA_NO_Internalname = "TBT13_CRF_EDA_NO" ;
      lblTextblocktbt13_crf_version_Internalname = "TEXTBLOCKTBT13_CRF_VERSION" ;
      edtTBT13_CRF_VERSION_Internalname = "TBT13_CRF_VERSION" ;
      lblTextblocktbt13_crf_item_grp_div_Internalname = "TEXTBLOCKTBT13_CRF_ITEM_GRP_DIV" ;
      edtTBT13_CRF_ITEM_GRP_DIV_Internalname = "TBT13_CRF_ITEM_GRP_DIV" ;
      lblTextblocktbt13_crf_item_grp_cd_Internalname = "TEXTBLOCKTBT13_CRF_ITEM_GRP_CD" ;
      edtTBT13_CRF_ITEM_GRP_CD_Internalname = "TBT13_CRF_ITEM_GRP_CD" ;
      lblTextblocktbt13_crf_value_Internalname = "TEXTBLOCKTBT13_CRF_VALUE" ;
      edtTBT13_CRF_VALUE_Internalname = "TBT13_CRF_VALUE" ;
      lblTextblocktbt13_edit_flg_Internalname = "TEXTBLOCKTBT13_EDIT_FLG" ;
      edtTBT13_EDIT_FLG_Internalname = "TBT13_EDIT_FLG" ;
      lblTextblocktbt13_del_flg_Internalname = "TEXTBLOCKTBT13_DEL_FLG" ;
      edtTBT13_DEL_FLG_Internalname = "TBT13_DEL_FLG" ;
      lblTextblocktbt13_crt_datetime_Internalname = "TEXTBLOCKTBT13_CRT_DATETIME" ;
      edtTBT13_CRT_DATETIME_Internalname = "TBT13_CRT_DATETIME" ;
      lblTextblocktbt13_crt_user_id_Internalname = "TEXTBLOCKTBT13_CRT_USER_ID" ;
      edtTBT13_CRT_USER_ID_Internalname = "TBT13_CRT_USER_ID" ;
      lblTextblocktbt13_crt_prog_nm_Internalname = "TEXTBLOCKTBT13_CRT_PROG_NM" ;
      edtTBT13_CRT_PROG_NM_Internalname = "TBT13_CRT_PROG_NM" ;
      lblTextblocktbt13_upd_datetime_Internalname = "TEXTBLOCKTBT13_UPD_DATETIME" ;
      edtTBT13_UPD_DATETIME_Internalname = "TBT13_UPD_DATETIME" ;
      lblTextblocktbt13_upd_user_id_Internalname = "TEXTBLOCKTBT13_UPD_USER_ID" ;
      edtTBT13_UPD_USER_ID_Internalname = "TBT13_UPD_USER_ID" ;
      lblTextblocktbt13_upd_prog_nm_Internalname = "TEXTBLOCKTBT13_UPD_PROG_NM" ;
      edtTBT13_UPD_PROG_NM_Internalname = "TBT13_UPD_PROG_NM" ;
      lblTextblocktbt13_upd_cnt_Internalname = "TEXTBLOCKTBT13_UPD_CNT" ;
      edtTBT13_UPD_CNT_Internalname = "TBT13_UPD_CNT" ;
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
      edtTBT13_UPD_CNT_Jsonclick = "" ;
      edtTBT13_UPD_CNT_Enabled = 1 ;
      edtTBT13_UPD_PROG_NM_Jsonclick = "" ;
      edtTBT13_UPD_PROG_NM_Enabled = 1 ;
      edtTBT13_UPD_USER_ID_Jsonclick = "" ;
      edtTBT13_UPD_USER_ID_Enabled = 1 ;
      edtTBT13_UPD_DATETIME_Jsonclick = "" ;
      edtTBT13_UPD_DATETIME_Enabled = 1 ;
      edtTBT13_CRT_PROG_NM_Jsonclick = "" ;
      edtTBT13_CRT_PROG_NM_Enabled = 1 ;
      edtTBT13_CRT_USER_ID_Jsonclick = "" ;
      edtTBT13_CRT_USER_ID_Enabled = 1 ;
      edtTBT13_CRT_DATETIME_Jsonclick = "" ;
      edtTBT13_CRT_DATETIME_Enabled = 1 ;
      edtTBT13_DEL_FLG_Jsonclick = "" ;
      edtTBT13_DEL_FLG_Enabled = 1 ;
      edtTBT13_EDIT_FLG_Jsonclick = "" ;
      edtTBT13_EDIT_FLG_Enabled = 1 ;
      edtTBT13_CRF_VALUE_Enabled = 1 ;
      edtTBT13_CRF_ITEM_GRP_CD_Jsonclick = "" ;
      edtTBT13_CRF_ITEM_GRP_CD_Enabled = 1 ;
      edtTBT13_CRF_ITEM_GRP_DIV_Jsonclick = "" ;
      edtTBT13_CRF_ITEM_GRP_DIV_Enabled = 1 ;
      edtTBT13_CRF_VERSION_Jsonclick = "" ;
      edtTBT13_CRF_VERSION_Enabled = 1 ;
      edtTBT13_CRF_EDA_NO_Jsonclick = "" ;
      edtTBT13_CRF_EDA_NO_Enabled = 1 ;
      edtTBT13_CRF_ID_Jsonclick = "" ;
      edtTBT13_CRF_ID_Enabled = 1 ;
      edtTBT13_SUBJECT_ID_Jsonclick = "" ;
      edtTBT13_SUBJECT_ID_Enabled = 1 ;
      edtTBT13_STUDY_ID_Jsonclick = "" ;
      edtTBT13_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbt13_crt_user_id1258( String Gx_mode )
   {
      GXt_char1 = A600TBT13_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_impl.this.GXt_char1 = GXv_char2[0] ;
      A600TBT13_CRT_USER_ID = GXt_char1 ;
      n600TBT13_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A600TBT13_CRT_USER_ID", A600TBT13_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A600TBT13_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbt13_upd_user_id1258( String Gx_mode )
   {
      GXt_char1 = A603TBT13_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt13_crf_res_his_impl.this.GXt_char1 = GXv_char2[0] ;
      A603TBT13_UPD_USER_ID = GXt_char1 ;
      n603TBT13_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A603TBT13_UPD_USER_ID", A603TBT13_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A603TBT13_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBT13_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt13_crf_item_grp_cd( long GX_Parm1 ,
                                            int GX_Parm2 ,
                                            short GX_Parm3 ,
                                            byte GX_Parm4 ,
                                            short GX_Parm5 ,
                                            String GX_Parm6 ,
                                            String GX_Parm7 ,
                                            java.util.Date GX_Parm8 ,
                                            String GX_Parm9 ,
                                            java.util.Date GX_Parm10 ,
                                            String GX_Parm11 ,
                                            long GX_Parm12 ,
                                            String GX_Parm13 ,
                                            String GX_Parm14 ,
                                            String GX_Parm15 ,
                                            String GX_Parm16 ,
                                            String GX_Parm17 )
   {
      A101TBT13_STUDY_ID = GX_Parm1 ;
      A102TBT13_SUBJECT_ID = GX_Parm2 ;
      A103TBT13_CRF_ID = GX_Parm3 ;
      A938TBT13_CRF_EDA_NO = GX_Parm4 ;
      A104TBT13_CRF_VERSION = GX_Parm5 ;
      A105TBT13_CRF_ITEM_GRP_DIV = GX_Parm6 ;
      A106TBT13_CRF_ITEM_GRP_CD = GX_Parm7 ;
      A599TBT13_CRT_DATETIME = GX_Parm8 ;
      n599TBT13_CRT_DATETIME = false ;
      A600TBT13_CRT_USER_ID = GX_Parm9 ;
      n600TBT13_CRT_USER_ID = false ;
      A602TBT13_UPD_DATETIME = GX_Parm10 ;
      n602TBT13_UPD_DATETIME = false ;
      A603TBT13_UPD_USER_ID = GX_Parm11 ;
      n603TBT13_UPD_USER_ID = false ;
      A605TBT13_UPD_CNT = GX_Parm12 ;
      n605TBT13_UPD_CNT = false ;
      A597TBT13_CRF_VALUE = GX_Parm13 ;
      n597TBT13_CRF_VALUE = false ;
      A680TBT13_EDIT_FLG = GX_Parm14 ;
      n680TBT13_EDIT_FLG = false ;
      A598TBT13_DEL_FLG = GX_Parm15 ;
      n598TBT13_DEL_FLG = false ;
      A601TBT13_CRT_PROG_NM = GX_Parm16 ;
      n601TBT13_CRT_PROG_NM = false ;
      A604TBT13_UPD_PROG_NM = GX_Parm17 ;
      n604TBT13_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A599TBT13_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A600TBT13_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A602TBT13_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A603TBT13_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A605TBT13_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A597TBT13_CRF_VALUE));
      isValidOutput.add(GXutil.rtrim( A680TBT13_EDIT_FLG));
      isValidOutput.add(GXutil.rtrim( A598TBT13_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A601TBT13_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A604TBT13_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z101TBT13_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z102TBT13_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z103TBT13_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z938TBT13_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z104TBT13_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z105TBT13_CRF_ITEM_GRP_DIV));
      isValidOutput.add(GXutil.rtrim( Z106TBT13_CRF_ITEM_GRP_CD));
      isValidOutput.add(localUtil.ttoc( Z599TBT13_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z600TBT13_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z602TBT13_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z603TBT13_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z605TBT13_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z597TBT13_CRF_VALUE));
      isValidOutput.add(GXutil.rtrim( Z680TBT13_EDIT_FLG));
      isValidOutput.add(GXutil.rtrim( Z598TBT13_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z601TBT13_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z604TBT13_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O605TBT13_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z105TBT13_CRF_ITEM_GRP_DIV = "" ;
      Z106TBT13_CRF_ITEM_GRP_CD = "" ;
      Z599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z600TBT13_CRT_USER_ID = "" ;
      Z602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z603TBT13_UPD_USER_ID = "" ;
      Z597TBT13_CRF_VALUE = "" ;
      Z680TBT13_EDIT_FLG = "" ;
      Z598TBT13_DEL_FLG = "" ;
      Z601TBT13_CRT_PROG_NM = "" ;
      Z604TBT13_UPD_PROG_NM = "" ;
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
      lblTextblocktbt13_study_id_Jsonclick = "" ;
      lblTextblocktbt13_subject_id_Jsonclick = "" ;
      lblTextblocktbt13_crf_id_Jsonclick = "" ;
      lblTextblocktbt13_crf_eda_no_Jsonclick = "" ;
      lblTextblocktbt13_crf_version_Jsonclick = "" ;
      lblTextblocktbt13_crf_item_grp_div_Jsonclick = "" ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      lblTextblocktbt13_crf_item_grp_cd_Jsonclick = "" ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbt13_crf_value_Jsonclick = "" ;
      A597TBT13_CRF_VALUE = "" ;
      lblTextblocktbt13_edit_flg_Jsonclick = "" ;
      A680TBT13_EDIT_FLG = "" ;
      lblTextblocktbt13_del_flg_Jsonclick = "" ;
      A598TBT13_DEL_FLG = "" ;
      lblTextblocktbt13_crt_datetime_Jsonclick = "" ;
      A599TBT13_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt13_crt_user_id_Jsonclick = "" ;
      A600TBT13_CRT_USER_ID = "" ;
      lblTextblocktbt13_crt_prog_nm_Jsonclick = "" ;
      A601TBT13_CRT_PROG_NM = "" ;
      lblTextblocktbt13_upd_datetime_Jsonclick = "" ;
      A602TBT13_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt13_upd_user_id_Jsonclick = "" ;
      A603TBT13_UPD_USER_ID = "" ;
      lblTextblocktbt13_upd_prog_nm_Jsonclick = "" ;
      A604TBT13_UPD_PROG_NM = "" ;
      lblTextblocktbt13_upd_cnt_Jsonclick = "" ;
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
      T00124_A101TBT13_STUDY_ID = new long[1] ;
      T00124_A102TBT13_SUBJECT_ID = new int[1] ;
      T00124_A103TBT13_CRF_ID = new short[1] ;
      T00124_A938TBT13_CRF_EDA_NO = new byte[1] ;
      T00124_A104TBT13_CRF_VERSION = new short[1] ;
      T00124_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00124_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00124_A599TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00124_n599TBT13_CRT_DATETIME = new boolean[] {false} ;
      T00124_A600TBT13_CRT_USER_ID = new String[] {""} ;
      T00124_n600TBT13_CRT_USER_ID = new boolean[] {false} ;
      T00124_A602TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00124_n602TBT13_UPD_DATETIME = new boolean[] {false} ;
      T00124_A603TBT13_UPD_USER_ID = new String[] {""} ;
      T00124_n603TBT13_UPD_USER_ID = new boolean[] {false} ;
      T00124_A605TBT13_UPD_CNT = new long[1] ;
      T00124_n605TBT13_UPD_CNT = new boolean[] {false} ;
      T00124_A597TBT13_CRF_VALUE = new String[] {""} ;
      T00124_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      T00124_A680TBT13_EDIT_FLG = new String[] {""} ;
      T00124_n680TBT13_EDIT_FLG = new boolean[] {false} ;
      T00124_A598TBT13_DEL_FLG = new String[] {""} ;
      T00124_n598TBT13_DEL_FLG = new boolean[] {false} ;
      T00124_A601TBT13_CRT_PROG_NM = new String[] {""} ;
      T00124_n601TBT13_CRT_PROG_NM = new boolean[] {false} ;
      T00124_A604TBT13_UPD_PROG_NM = new String[] {""} ;
      T00124_n604TBT13_UPD_PROG_NM = new boolean[] {false} ;
      T00125_A101TBT13_STUDY_ID = new long[1] ;
      T00125_A102TBT13_SUBJECT_ID = new int[1] ;
      T00125_A103TBT13_CRF_ID = new short[1] ;
      T00125_A938TBT13_CRF_EDA_NO = new byte[1] ;
      T00125_A104TBT13_CRF_VERSION = new short[1] ;
      T00125_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00125_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00123_A101TBT13_STUDY_ID = new long[1] ;
      T00123_A102TBT13_SUBJECT_ID = new int[1] ;
      T00123_A103TBT13_CRF_ID = new short[1] ;
      T00123_A938TBT13_CRF_EDA_NO = new byte[1] ;
      T00123_A104TBT13_CRF_VERSION = new short[1] ;
      T00123_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00123_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00123_A599TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00123_n599TBT13_CRT_DATETIME = new boolean[] {false} ;
      T00123_A600TBT13_CRT_USER_ID = new String[] {""} ;
      T00123_n600TBT13_CRT_USER_ID = new boolean[] {false} ;
      T00123_A602TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00123_n602TBT13_UPD_DATETIME = new boolean[] {false} ;
      T00123_A603TBT13_UPD_USER_ID = new String[] {""} ;
      T00123_n603TBT13_UPD_USER_ID = new boolean[] {false} ;
      T00123_A605TBT13_UPD_CNT = new long[1] ;
      T00123_n605TBT13_UPD_CNT = new boolean[] {false} ;
      T00123_A597TBT13_CRF_VALUE = new String[] {""} ;
      T00123_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      T00123_A680TBT13_EDIT_FLG = new String[] {""} ;
      T00123_n680TBT13_EDIT_FLG = new boolean[] {false} ;
      T00123_A598TBT13_DEL_FLG = new String[] {""} ;
      T00123_n598TBT13_DEL_FLG = new boolean[] {false} ;
      T00123_A601TBT13_CRT_PROG_NM = new String[] {""} ;
      T00123_n601TBT13_CRT_PROG_NM = new boolean[] {false} ;
      T00123_A604TBT13_UPD_PROG_NM = new String[] {""} ;
      T00123_n604TBT13_UPD_PROG_NM = new boolean[] {false} ;
      sMode58 = "" ;
      T00126_A101TBT13_STUDY_ID = new long[1] ;
      T00126_A102TBT13_SUBJECT_ID = new int[1] ;
      T00126_A103TBT13_CRF_ID = new short[1] ;
      T00126_A938TBT13_CRF_EDA_NO = new byte[1] ;
      T00126_A104TBT13_CRF_VERSION = new short[1] ;
      T00126_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00126_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00127_A101TBT13_STUDY_ID = new long[1] ;
      T00127_A102TBT13_SUBJECT_ID = new int[1] ;
      T00127_A103TBT13_CRF_ID = new short[1] ;
      T00127_A938TBT13_CRF_EDA_NO = new byte[1] ;
      T00127_A104TBT13_CRF_VERSION = new short[1] ;
      T00127_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00127_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00122_A101TBT13_STUDY_ID = new long[1] ;
      T00122_A102TBT13_SUBJECT_ID = new int[1] ;
      T00122_A103TBT13_CRF_ID = new short[1] ;
      T00122_A938TBT13_CRF_EDA_NO = new byte[1] ;
      T00122_A104TBT13_CRF_VERSION = new short[1] ;
      T00122_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00122_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00122_A599TBT13_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00122_n599TBT13_CRT_DATETIME = new boolean[] {false} ;
      T00122_A600TBT13_CRT_USER_ID = new String[] {""} ;
      T00122_n600TBT13_CRT_USER_ID = new boolean[] {false} ;
      T00122_A602TBT13_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00122_n602TBT13_UPD_DATETIME = new boolean[] {false} ;
      T00122_A603TBT13_UPD_USER_ID = new String[] {""} ;
      T00122_n603TBT13_UPD_USER_ID = new boolean[] {false} ;
      T00122_A605TBT13_UPD_CNT = new long[1] ;
      T00122_n605TBT13_UPD_CNT = new boolean[] {false} ;
      T00122_A597TBT13_CRF_VALUE = new String[] {""} ;
      T00122_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      T00122_A680TBT13_EDIT_FLG = new String[] {""} ;
      T00122_n680TBT13_EDIT_FLG = new boolean[] {false} ;
      T00122_A598TBT13_DEL_FLG = new String[] {""} ;
      T00122_n598TBT13_DEL_FLG = new boolean[] {false} ;
      T00122_A601TBT13_CRT_PROG_NM = new String[] {""} ;
      T00122_n601TBT13_CRT_PROG_NM = new boolean[] {false} ;
      T00122_A604TBT13_UPD_PROG_NM = new String[] {""} ;
      T00122_n604TBT13_UPD_PROG_NM = new boolean[] {false} ;
      T001211_A101TBT13_STUDY_ID = new long[1] ;
      T001211_A102TBT13_SUBJECT_ID = new int[1] ;
      T001211_A103TBT13_CRF_ID = new short[1] ;
      T001211_A938TBT13_CRF_EDA_NO = new byte[1] ;
      T001211_A104TBT13_CRF_VERSION = new short[1] ;
      T001211_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T001211_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt13_crf_res_his__default(),
         new Object[] {
             new Object[] {
            T00122_A101TBT13_STUDY_ID, T00122_A102TBT13_SUBJECT_ID, T00122_A103TBT13_CRF_ID, T00122_A938TBT13_CRF_EDA_NO, T00122_A104TBT13_CRF_VERSION, T00122_A105TBT13_CRF_ITEM_GRP_DIV, T00122_A106TBT13_CRF_ITEM_GRP_CD, T00122_A599TBT13_CRT_DATETIME, T00122_n599TBT13_CRT_DATETIME, T00122_A600TBT13_CRT_USER_ID,
            T00122_n600TBT13_CRT_USER_ID, T00122_A602TBT13_UPD_DATETIME, T00122_n602TBT13_UPD_DATETIME, T00122_A603TBT13_UPD_USER_ID, T00122_n603TBT13_UPD_USER_ID, T00122_A605TBT13_UPD_CNT, T00122_n605TBT13_UPD_CNT, T00122_A597TBT13_CRF_VALUE, T00122_n597TBT13_CRF_VALUE, T00122_A680TBT13_EDIT_FLG,
            T00122_n680TBT13_EDIT_FLG, T00122_A598TBT13_DEL_FLG, T00122_n598TBT13_DEL_FLG, T00122_A601TBT13_CRT_PROG_NM, T00122_n601TBT13_CRT_PROG_NM, T00122_A604TBT13_UPD_PROG_NM, T00122_n604TBT13_UPD_PROG_NM
            }
            , new Object[] {
            T00123_A101TBT13_STUDY_ID, T00123_A102TBT13_SUBJECT_ID, T00123_A103TBT13_CRF_ID, T00123_A938TBT13_CRF_EDA_NO, T00123_A104TBT13_CRF_VERSION, T00123_A105TBT13_CRF_ITEM_GRP_DIV, T00123_A106TBT13_CRF_ITEM_GRP_CD, T00123_A599TBT13_CRT_DATETIME, T00123_n599TBT13_CRT_DATETIME, T00123_A600TBT13_CRT_USER_ID,
            T00123_n600TBT13_CRT_USER_ID, T00123_A602TBT13_UPD_DATETIME, T00123_n602TBT13_UPD_DATETIME, T00123_A603TBT13_UPD_USER_ID, T00123_n603TBT13_UPD_USER_ID, T00123_A605TBT13_UPD_CNT, T00123_n605TBT13_UPD_CNT, T00123_A597TBT13_CRF_VALUE, T00123_n597TBT13_CRF_VALUE, T00123_A680TBT13_EDIT_FLG,
            T00123_n680TBT13_EDIT_FLG, T00123_A598TBT13_DEL_FLG, T00123_n598TBT13_DEL_FLG, T00123_A601TBT13_CRT_PROG_NM, T00123_n601TBT13_CRT_PROG_NM, T00123_A604TBT13_UPD_PROG_NM, T00123_n604TBT13_UPD_PROG_NM
            }
            , new Object[] {
            T00124_A101TBT13_STUDY_ID, T00124_A102TBT13_SUBJECT_ID, T00124_A103TBT13_CRF_ID, T00124_A938TBT13_CRF_EDA_NO, T00124_A104TBT13_CRF_VERSION, T00124_A105TBT13_CRF_ITEM_GRP_DIV, T00124_A106TBT13_CRF_ITEM_GRP_CD, T00124_A599TBT13_CRT_DATETIME, T00124_n599TBT13_CRT_DATETIME, T00124_A600TBT13_CRT_USER_ID,
            T00124_n600TBT13_CRT_USER_ID, T00124_A602TBT13_UPD_DATETIME, T00124_n602TBT13_UPD_DATETIME, T00124_A603TBT13_UPD_USER_ID, T00124_n603TBT13_UPD_USER_ID, T00124_A605TBT13_UPD_CNT, T00124_n605TBT13_UPD_CNT, T00124_A597TBT13_CRF_VALUE, T00124_n597TBT13_CRF_VALUE, T00124_A680TBT13_EDIT_FLG,
            T00124_n680TBT13_EDIT_FLG, T00124_A598TBT13_DEL_FLG, T00124_n598TBT13_DEL_FLG, T00124_A601TBT13_CRT_PROG_NM, T00124_n601TBT13_CRT_PROG_NM, T00124_A604TBT13_UPD_PROG_NM, T00124_n604TBT13_UPD_PROG_NM
            }
            , new Object[] {
            T00125_A101TBT13_STUDY_ID, T00125_A102TBT13_SUBJECT_ID, T00125_A103TBT13_CRF_ID, T00125_A938TBT13_CRF_EDA_NO, T00125_A104TBT13_CRF_VERSION, T00125_A105TBT13_CRF_ITEM_GRP_DIV, T00125_A106TBT13_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T00126_A101TBT13_STUDY_ID, T00126_A102TBT13_SUBJECT_ID, T00126_A103TBT13_CRF_ID, T00126_A938TBT13_CRF_EDA_NO, T00126_A104TBT13_CRF_VERSION, T00126_A105TBT13_CRF_ITEM_GRP_DIV, T00126_A106TBT13_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T00127_A101TBT13_STUDY_ID, T00127_A102TBT13_SUBJECT_ID, T00127_A103TBT13_CRF_ID, T00127_A938TBT13_CRF_EDA_NO, T00127_A104TBT13_CRF_VERSION, T00127_A105TBT13_CRF_ITEM_GRP_DIV, T00127_A106TBT13_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001211_A101TBT13_STUDY_ID, T001211_A102TBT13_SUBJECT_ID, T001211_A103TBT13_CRF_ID, T001211_A938TBT13_CRF_EDA_NO, T001211_A104TBT13_CRF_VERSION, T001211_A105TBT13_CRF_ITEM_GRP_DIV, T001211_A106TBT13_CRF_ITEM_GRP_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT13_CRF_RES_HIS" ;
   }

   private byte Z938TBT13_CRF_EDA_NO ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A938TBT13_CRF_EDA_NO ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z103TBT13_CRF_ID ;
   private short Z104TBT13_CRF_VERSION ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A103TBT13_CRF_ID ;
   private short A104TBT13_CRF_VERSION ;
   private short RcdFound58 ;
   private short Gx_err ;
   private int Z102TBT13_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT13_STUDY_ID_Enabled ;
   private int A102TBT13_SUBJECT_ID ;
   private int edtTBT13_SUBJECT_ID_Enabled ;
   private int edtTBT13_CRF_ID_Enabled ;
   private int edtTBT13_CRF_EDA_NO_Enabled ;
   private int edtTBT13_CRF_VERSION_Enabled ;
   private int edtTBT13_CRF_ITEM_GRP_DIV_Enabled ;
   private int edtTBT13_CRF_ITEM_GRP_CD_Enabled ;
   private int edtTBT13_CRF_VALUE_Enabled ;
   private int edtTBT13_EDIT_FLG_Enabled ;
   private int edtTBT13_DEL_FLG_Enabled ;
   private int edtTBT13_CRT_DATETIME_Enabled ;
   private int edtTBT13_CRT_USER_ID_Enabled ;
   private int edtTBT13_CRT_PROG_NM_Enabled ;
   private int edtTBT13_UPD_DATETIME_Enabled ;
   private int edtTBT13_UPD_USER_ID_Enabled ;
   private int edtTBT13_UPD_PROG_NM_Enabled ;
   private int edtTBT13_UPD_CNT_Enabled ;
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
   private long Z101TBT13_STUDY_ID ;
   private long Z605TBT13_UPD_CNT ;
   private long O605TBT13_UPD_CNT ;
   private long A101TBT13_STUDY_ID ;
   private long A605TBT13_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBT13_STUDY_ID_Internalname ;
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
   private String lblTextblocktbt13_study_id_Internalname ;
   private String lblTextblocktbt13_study_id_Jsonclick ;
   private String edtTBT13_STUDY_ID_Jsonclick ;
   private String lblTextblocktbt13_subject_id_Internalname ;
   private String lblTextblocktbt13_subject_id_Jsonclick ;
   private String edtTBT13_SUBJECT_ID_Internalname ;
   private String edtTBT13_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbt13_crf_id_Internalname ;
   private String lblTextblocktbt13_crf_id_Jsonclick ;
   private String edtTBT13_CRF_ID_Internalname ;
   private String edtTBT13_CRF_ID_Jsonclick ;
   private String lblTextblocktbt13_crf_eda_no_Internalname ;
   private String lblTextblocktbt13_crf_eda_no_Jsonclick ;
   private String edtTBT13_CRF_EDA_NO_Internalname ;
   private String edtTBT13_CRF_EDA_NO_Jsonclick ;
   private String lblTextblocktbt13_crf_version_Internalname ;
   private String lblTextblocktbt13_crf_version_Jsonclick ;
   private String edtTBT13_CRF_VERSION_Internalname ;
   private String edtTBT13_CRF_VERSION_Jsonclick ;
   private String lblTextblocktbt13_crf_item_grp_div_Internalname ;
   private String lblTextblocktbt13_crf_item_grp_div_Jsonclick ;
   private String edtTBT13_CRF_ITEM_GRP_DIV_Internalname ;
   private String edtTBT13_CRF_ITEM_GRP_DIV_Jsonclick ;
   private String lblTextblocktbt13_crf_item_grp_cd_Internalname ;
   private String lblTextblocktbt13_crf_item_grp_cd_Jsonclick ;
   private String edtTBT13_CRF_ITEM_GRP_CD_Internalname ;
   private String edtTBT13_CRF_ITEM_GRP_CD_Jsonclick ;
   private String lblTextblocktbt13_crf_value_Internalname ;
   private String lblTextblocktbt13_crf_value_Jsonclick ;
   private String edtTBT13_CRF_VALUE_Internalname ;
   private String lblTextblocktbt13_edit_flg_Internalname ;
   private String lblTextblocktbt13_edit_flg_Jsonclick ;
   private String edtTBT13_EDIT_FLG_Internalname ;
   private String edtTBT13_EDIT_FLG_Jsonclick ;
   private String lblTextblocktbt13_del_flg_Internalname ;
   private String lblTextblocktbt13_del_flg_Jsonclick ;
   private String edtTBT13_DEL_FLG_Internalname ;
   private String edtTBT13_DEL_FLG_Jsonclick ;
   private String lblTextblocktbt13_crt_datetime_Internalname ;
   private String lblTextblocktbt13_crt_datetime_Jsonclick ;
   private String edtTBT13_CRT_DATETIME_Internalname ;
   private String edtTBT13_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbt13_crt_user_id_Internalname ;
   private String lblTextblocktbt13_crt_user_id_Jsonclick ;
   private String edtTBT13_CRT_USER_ID_Internalname ;
   private String edtTBT13_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbt13_crt_prog_nm_Internalname ;
   private String lblTextblocktbt13_crt_prog_nm_Jsonclick ;
   private String edtTBT13_CRT_PROG_NM_Internalname ;
   private String edtTBT13_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbt13_upd_datetime_Internalname ;
   private String lblTextblocktbt13_upd_datetime_Jsonclick ;
   private String edtTBT13_UPD_DATETIME_Internalname ;
   private String edtTBT13_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbt13_upd_user_id_Internalname ;
   private String lblTextblocktbt13_upd_user_id_Jsonclick ;
   private String edtTBT13_UPD_USER_ID_Internalname ;
   private String edtTBT13_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbt13_upd_prog_nm_Internalname ;
   private String lblTextblocktbt13_upd_prog_nm_Jsonclick ;
   private String edtTBT13_UPD_PROG_NM_Internalname ;
   private String edtTBT13_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbt13_upd_cnt_Internalname ;
   private String lblTextblocktbt13_upd_cnt_Jsonclick ;
   private String edtTBT13_UPD_CNT_Internalname ;
   private String edtTBT13_UPD_CNT_Jsonclick ;
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
   private String sMode58 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z599TBT13_CRT_DATETIME ;
   private java.util.Date Z602TBT13_UPD_DATETIME ;
   private java.util.Date A599TBT13_CRT_DATETIME ;
   private java.util.Date A602TBT13_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n597TBT13_CRF_VALUE ;
   private boolean n680TBT13_EDIT_FLG ;
   private boolean n598TBT13_DEL_FLG ;
   private boolean n599TBT13_CRT_DATETIME ;
   private boolean n600TBT13_CRT_USER_ID ;
   private boolean n601TBT13_CRT_PROG_NM ;
   private boolean n602TBT13_UPD_DATETIME ;
   private boolean n603TBT13_UPD_USER_ID ;
   private boolean n604TBT13_UPD_PROG_NM ;
   private boolean n605TBT13_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z105TBT13_CRF_ITEM_GRP_DIV ;
   private String Z106TBT13_CRF_ITEM_GRP_CD ;
   private String Z600TBT13_CRT_USER_ID ;
   private String Z603TBT13_UPD_USER_ID ;
   private String Z597TBT13_CRF_VALUE ;
   private String Z680TBT13_EDIT_FLG ;
   private String Z598TBT13_DEL_FLG ;
   private String Z601TBT13_CRT_PROG_NM ;
   private String Z604TBT13_UPD_PROG_NM ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String A597TBT13_CRF_VALUE ;
   private String A680TBT13_EDIT_FLG ;
   private String A598TBT13_DEL_FLG ;
   private String A600TBT13_CRT_USER_ID ;
   private String A601TBT13_CRT_PROG_NM ;
   private String A603TBT13_UPD_USER_ID ;
   private String A604TBT13_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T00124_A101TBT13_STUDY_ID ;
   private int[] T00124_A102TBT13_SUBJECT_ID ;
   private short[] T00124_A103TBT13_CRF_ID ;
   private byte[] T00124_A938TBT13_CRF_EDA_NO ;
   private short[] T00124_A104TBT13_CRF_VERSION ;
   private String[] T00124_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] T00124_A106TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T00124_A599TBT13_CRT_DATETIME ;
   private boolean[] T00124_n599TBT13_CRT_DATETIME ;
   private String[] T00124_A600TBT13_CRT_USER_ID ;
   private boolean[] T00124_n600TBT13_CRT_USER_ID ;
   private java.util.Date[] T00124_A602TBT13_UPD_DATETIME ;
   private boolean[] T00124_n602TBT13_UPD_DATETIME ;
   private String[] T00124_A603TBT13_UPD_USER_ID ;
   private boolean[] T00124_n603TBT13_UPD_USER_ID ;
   private long[] T00124_A605TBT13_UPD_CNT ;
   private boolean[] T00124_n605TBT13_UPD_CNT ;
   private String[] T00124_A597TBT13_CRF_VALUE ;
   private boolean[] T00124_n597TBT13_CRF_VALUE ;
   private String[] T00124_A680TBT13_EDIT_FLG ;
   private boolean[] T00124_n680TBT13_EDIT_FLG ;
   private String[] T00124_A598TBT13_DEL_FLG ;
   private boolean[] T00124_n598TBT13_DEL_FLG ;
   private String[] T00124_A601TBT13_CRT_PROG_NM ;
   private boolean[] T00124_n601TBT13_CRT_PROG_NM ;
   private String[] T00124_A604TBT13_UPD_PROG_NM ;
   private boolean[] T00124_n604TBT13_UPD_PROG_NM ;
   private long[] T00125_A101TBT13_STUDY_ID ;
   private int[] T00125_A102TBT13_SUBJECT_ID ;
   private short[] T00125_A103TBT13_CRF_ID ;
   private byte[] T00125_A938TBT13_CRF_EDA_NO ;
   private short[] T00125_A104TBT13_CRF_VERSION ;
   private String[] T00125_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] T00125_A106TBT13_CRF_ITEM_GRP_CD ;
   private long[] T00123_A101TBT13_STUDY_ID ;
   private int[] T00123_A102TBT13_SUBJECT_ID ;
   private short[] T00123_A103TBT13_CRF_ID ;
   private byte[] T00123_A938TBT13_CRF_EDA_NO ;
   private short[] T00123_A104TBT13_CRF_VERSION ;
   private String[] T00123_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] T00123_A106TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T00123_A599TBT13_CRT_DATETIME ;
   private boolean[] T00123_n599TBT13_CRT_DATETIME ;
   private String[] T00123_A600TBT13_CRT_USER_ID ;
   private boolean[] T00123_n600TBT13_CRT_USER_ID ;
   private java.util.Date[] T00123_A602TBT13_UPD_DATETIME ;
   private boolean[] T00123_n602TBT13_UPD_DATETIME ;
   private String[] T00123_A603TBT13_UPD_USER_ID ;
   private boolean[] T00123_n603TBT13_UPD_USER_ID ;
   private long[] T00123_A605TBT13_UPD_CNT ;
   private boolean[] T00123_n605TBT13_UPD_CNT ;
   private String[] T00123_A597TBT13_CRF_VALUE ;
   private boolean[] T00123_n597TBT13_CRF_VALUE ;
   private String[] T00123_A680TBT13_EDIT_FLG ;
   private boolean[] T00123_n680TBT13_EDIT_FLG ;
   private String[] T00123_A598TBT13_DEL_FLG ;
   private boolean[] T00123_n598TBT13_DEL_FLG ;
   private String[] T00123_A601TBT13_CRT_PROG_NM ;
   private boolean[] T00123_n601TBT13_CRT_PROG_NM ;
   private String[] T00123_A604TBT13_UPD_PROG_NM ;
   private boolean[] T00123_n604TBT13_UPD_PROG_NM ;
   private long[] T00126_A101TBT13_STUDY_ID ;
   private int[] T00126_A102TBT13_SUBJECT_ID ;
   private short[] T00126_A103TBT13_CRF_ID ;
   private byte[] T00126_A938TBT13_CRF_EDA_NO ;
   private short[] T00126_A104TBT13_CRF_VERSION ;
   private String[] T00126_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] T00126_A106TBT13_CRF_ITEM_GRP_CD ;
   private long[] T00127_A101TBT13_STUDY_ID ;
   private int[] T00127_A102TBT13_SUBJECT_ID ;
   private short[] T00127_A103TBT13_CRF_ID ;
   private byte[] T00127_A938TBT13_CRF_EDA_NO ;
   private short[] T00127_A104TBT13_CRF_VERSION ;
   private String[] T00127_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] T00127_A106TBT13_CRF_ITEM_GRP_CD ;
   private long[] T00122_A101TBT13_STUDY_ID ;
   private int[] T00122_A102TBT13_SUBJECT_ID ;
   private short[] T00122_A103TBT13_CRF_ID ;
   private byte[] T00122_A938TBT13_CRF_EDA_NO ;
   private short[] T00122_A104TBT13_CRF_VERSION ;
   private String[] T00122_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] T00122_A106TBT13_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T00122_A599TBT13_CRT_DATETIME ;
   private boolean[] T00122_n599TBT13_CRT_DATETIME ;
   private String[] T00122_A600TBT13_CRT_USER_ID ;
   private boolean[] T00122_n600TBT13_CRT_USER_ID ;
   private java.util.Date[] T00122_A602TBT13_UPD_DATETIME ;
   private boolean[] T00122_n602TBT13_UPD_DATETIME ;
   private String[] T00122_A603TBT13_UPD_USER_ID ;
   private boolean[] T00122_n603TBT13_UPD_USER_ID ;
   private long[] T00122_A605TBT13_UPD_CNT ;
   private boolean[] T00122_n605TBT13_UPD_CNT ;
   private String[] T00122_A597TBT13_CRF_VALUE ;
   private boolean[] T00122_n597TBT13_CRF_VALUE ;
   private String[] T00122_A680TBT13_EDIT_FLG ;
   private boolean[] T00122_n680TBT13_EDIT_FLG ;
   private String[] T00122_A598TBT13_DEL_FLG ;
   private boolean[] T00122_n598TBT13_DEL_FLG ;
   private String[] T00122_A601TBT13_CRT_PROG_NM ;
   private boolean[] T00122_n601TBT13_CRT_PROG_NM ;
   private String[] T00122_A604TBT13_UPD_PROG_NM ;
   private boolean[] T00122_n604TBT13_UPD_PROG_NM ;
   private long[] T001211_A101TBT13_STUDY_ID ;
   private int[] T001211_A102TBT13_SUBJECT_ID ;
   private short[] T001211_A103TBT13_CRF_ID ;
   private byte[] T001211_A938TBT13_CRF_EDA_NO ;
   private short[] T001211_A104TBT13_CRF_VERSION ;
   private String[] T001211_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] T001211_A106TBT13_CRF_ITEM_GRP_CD ;
}

final  class tbt13_crf_res_his__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00122", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_CNT`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00123", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_CNT`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00124", "SELECT TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_EDA_NO`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD`, TM1.`TBT13_CRT_DATETIME`, TM1.`TBT13_CRT_USER_ID`, TM1.`TBT13_UPD_DATETIME`, TM1.`TBT13_UPD_USER_ID`, TM1.`TBT13_UPD_CNT`, TM1.`TBT13_CRF_VALUE`, TM1.`TBT13_EDIT_FLG`, TM1.`TBT13_DEL_FLG`, TM1.`TBT13_CRT_PROG_NM`, TM1.`TBT13_UPD_PROG_NM` FROM `TBT13_CRF_RES_HIS` TM1 WHERE TM1.`TBT13_STUDY_ID` = ? and TM1.`TBT13_SUBJECT_ID` = ? and TM1.`TBT13_CRF_ID` = ? and TM1.`TBT13_CRF_EDA_NO` = ? and TM1.`TBT13_CRF_VERSION` = ? and TM1.`TBT13_CRF_ITEM_GRP_DIV` = ? and TM1.`TBT13_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBT13_STUDY_ID`, TM1.`TBT13_SUBJECT_ID`, TM1.`TBT13_CRF_ID`, TM1.`TBT13_CRF_EDA_NO`, TM1.`TBT13_CRF_VERSION`, TM1.`TBT13_CRF_ITEM_GRP_DIV`, TM1.`TBT13_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00125", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00126", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD` FROM `TBT13_CRF_RES_HIS` WHERE ( `TBT13_STUDY_ID` > ? or `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` > ? or `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_ID` > ? or `TBT13_CRF_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_EDA_NO` > ? or `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_VERSION` > ? or `TBT13_CRF_VERSION` = ? and `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_ITEM_GRP_DIV` > ? or `TBT13_CRF_ITEM_GRP_DIV` = ? and `TBT13_CRF_VERSION` = ? and `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_ITEM_GRP_CD` > ?) ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00127", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD` FROM `TBT13_CRF_RES_HIS` WHERE ( `TBT13_STUDY_ID` < ? or `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` < ? or `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_ID` < ? or `TBT13_CRF_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_EDA_NO` < ? or `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_VERSION` < ? or `TBT13_CRF_VERSION` = ? and `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_ITEM_GRP_DIV` < ? or `TBT13_CRF_ITEM_GRP_DIV` = ? and `TBT13_CRF_VERSION` = ? and `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_STUDY_ID` = ? and `TBT13_CRF_ITEM_GRP_CD` < ?) ORDER BY `TBT13_STUDY_ID` DESC, `TBT13_SUBJECT_ID` DESC, `TBT13_CRF_ID` DESC, `TBT13_CRF_EDA_NO` DESC, `TBT13_CRF_VERSION` DESC, `TBT13_CRF_ITEM_GRP_DIV` DESC, `TBT13_CRF_ITEM_GRP_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00128", "INSERT INTO `TBT13_CRF_RES_HIS`(`TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRT_DATETIME`, `TBT13_CRT_USER_ID`, `TBT13_UPD_DATETIME`, `TBT13_UPD_USER_ID`, `TBT13_UPD_CNT`, `TBT13_CRF_VALUE`, `TBT13_EDIT_FLG`, `TBT13_DEL_FLG`, `TBT13_CRT_PROG_NM`, `TBT13_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00129", "UPDATE `TBT13_CRF_RES_HIS` SET `TBT13_CRT_DATETIME`=?, `TBT13_CRT_USER_ID`=?, `TBT13_UPD_DATETIME`=?, `TBT13_UPD_USER_ID`=?, `TBT13_UPD_CNT`=?, `TBT13_CRF_VALUE`=?, `TBT13_EDIT_FLG`=?, `TBT13_DEL_FLG`=?, `TBT13_CRT_PROG_NM`=?, `TBT13_UPD_PROG_NM`=?  WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001210", "DELETE FROM `TBT13_CRF_RES_HIS`  WHERE `TBT13_STUDY_ID` = ? AND `TBT13_SUBJECT_ID` = ? AND `TBT13_CRF_ID` = ? AND `TBT13_CRF_EDA_NO` = ? AND `TBT13_CRF_VERSION` = ? AND `TBT13_CRF_ITEM_GRP_DIV` = ? AND `TBT13_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001211", "SELECT `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD` FROM `TBT13_CRF_RES_HIS` ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
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
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
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
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setLong(20, ((Number) parms[19]).longValue());
               stmt.setVarchar(21, (String)parms[20], 1, false);
               stmt.setVarchar(22, (String)parms[21], 1, false);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setShort(25, ((Number) parms[24]).shortValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setLong(27, ((Number) parms[26]).longValue());
               stmt.setVarchar(28, (String)parms[27], 50, false);
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
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setLong(20, ((Number) parms[19]).longValue());
               stmt.setVarchar(21, (String)parms[20], 1, false);
               stmt.setVarchar(22, (String)parms[21], 1, false);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setShort(25, ((Number) parms[24]).shortValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setLong(27, ((Number) parms[26]).longValue());
               stmt.setVarchar(28, (String)parms[27], 50, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[14], 128);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[16]).longValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[18], 2000);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[26], 40);
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
               stmt.setShort(15, ((Number) parms[24]).shortValue());
               stmt.setVarchar(16, (String)parms[25], 1, false);
               stmt.setVarchar(17, (String)parms[26], 50, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               return;
      }
   }

}

