/*
               File: tbm03_cdisc_item_impl
        Description: CDISC項目マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:2.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm03_cdisc_item_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM03_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm03_crt_user_id0F14( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM03_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm03_upd_user_id0F14( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A59TBM03_DOM_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A59TBM03_DOM_CD) ;
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
         Form.getMeta().addItem("description", "CDISC項目マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm03_cdisc_item_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm03_cdisc_item_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm03_cdisc_item_impl.class ));
   }

   public tbm03_cdisc_item_impl( int remoteHandle ,
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
         wb_table1_2_0F14( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0F14e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0F14( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0F14( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0F14( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0F14e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CDISC項目マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM03_CDISC_ITEM.htm");
         wb_table3_28_0F14( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0F14e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0F14e( true) ;
      }
      else
      {
         wb_table1_2_0F14e( false) ;
      }
   }

   public void wb_table3_28_0F14( boolean wbgen )
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
         wb_table4_34_0F14( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0F14e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM03_CDISC_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM03_CDISC_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0F14e( true) ;
      }
      else
      {
         wb_table3_28_0F14e( false) ;
      }
   }

   public void wb_table4_34_0F14( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbm03_dom_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_DOM_CD_Internalname, GXutil.rtrim( A59TBM03_DOM_CD), GXutil.rtrim( localUtil.format( A59TBM03_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_DOM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_DOM_CD_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbm03_dom_var_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_DOM_VAR_NM_Internalname, GXutil.rtrim( A60TBM03_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A60TBM03_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_DOM_VAR_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_DOM_VAR_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_VAR_NM", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_var_desc_Internalname, "ドメイン変数説明", "", "", lblTextblocktbm03_var_desc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_VAR_DESC_Internalname, GXutil.rtrim( A346TBM03_VAR_DESC), GXutil.rtrim( localUtil.format( A346TBM03_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_VAR_DESC_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_VAR_DESC_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_sdtm_flg_Internalname, "SDTM定義フラグ", "", "", lblTextblocktbm03_sdtm_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_SDTM_FLG_Internalname, GXutil.rtrim( A347TBM03_SDTM_FLG), GXutil.rtrim( localUtil.format( A347TBM03_SDTM_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_SDTM_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_SDTM_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_cdash_flg_Internalname, "CDASH定義フラグ", "", "", lblTextblocktbm03_cdash_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_CDASH_FLG_Internalname, GXutil.rtrim( A348TBM03_CDASH_FLG), GXutil.rtrim( localUtil.format( A348TBM03_CDASH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_CDASH_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_CDASH_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_input_type_div_Internalname, "入力値型区分", "", "", lblTextblocktbm03_input_type_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_INPUT_TYPE_DIV_Internalname, GXutil.rtrim( A532TBM03_INPUT_TYPE_DIV), GXutil.rtrim( localUtil.format( A532TBM03_INPUT_TYPE_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_INPUT_TYPE_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_INPUT_TYPE_DIV_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_required_flg_Internalname, "必須入力フラグ", "", "", lblTextblocktbm03_required_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_REQUIRED_FLG_Internalname, GXutil.rtrim( A349TBM03_REQUIRED_FLG), GXutil.rtrim( localUtil.format( A349TBM03_REQUIRED_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_REQUIRED_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_REQUIRED_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_sas_field_nm_Internalname, "SASフィールド名", "", "", lblTextblocktbm03_sas_field_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_SAS_FIELD_NM_Internalname, GXutil.rtrim( A688TBM03_SAS_FIELD_NM), GXutil.rtrim( localUtil.format( A688TBM03_SAS_FIELD_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_SAS_FIELD_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_SAS_FIELD_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_odm_data_type_Internalname, "ODMデータタイプ", "", "", lblTextblocktbm03_odm_data_type_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_ODM_DATA_TYPE_Internalname, GXutil.rtrim( A709TBM03_ODM_DATA_TYPE), GXutil.rtrim( localUtil.format( A709TBM03_ODM_DATA_TYPE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_ODM_DATA_TYPE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_ODM_DATA_TYPE_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_note_Internalname, "備考", "", "", lblTextblocktbm03_note_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM03_NOTE_Internalname, GXutil.rtrim( A350TBM03_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", (short)(0), 1, edtTBM03_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_order_Internalname, "表示順", "", "", lblTextblocktbm03_order_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A61TBM03_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBM03_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A61TBM03_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A61TBM03_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_ORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_ORDER_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_version_Internalname, "バージョン情報", "", "", lblTextblocktbm03_version_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_VERSION_Internalname, GXutil.rtrim( A932TBM03_VERSION), GXutil.rtrim( localUtil.format( A932TBM03_VERSION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_VERSION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_VERSION_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm03_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_DEL_FLG_Internalname, GXutil.rtrim( A359TBM03_DEL_FLG), GXutil.rtrim( localUtil.format( A359TBM03_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm03_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM03_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_CRT_DATETIME_Internalname, localUtil.format(A360TBM03_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A360TBM03_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM03_CDISC_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM03_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM03_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm03_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_CRT_USER_ID_Internalname, GXutil.rtrim( A361TBM03_CRT_USER_ID), GXutil.rtrim( localUtil.format( A361TBM03_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm03_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_CRT_PROG_NM_Internalname, GXutil.rtrim( A362TBM03_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A362TBM03_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm03_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM03_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_UPD_DATETIME_Internalname, localUtil.format(A363TBM03_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A363TBM03_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM03_CDISC_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM03_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM03_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm03_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_UPD_USER_ID_Internalname, GXutil.rtrim( A364TBM03_UPD_USER_ID), GXutil.rtrim( localUtil.format( A364TBM03_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm03_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_UPD_PROG_NM_Internalname, GXutil.rtrim( A365TBM03_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A365TBM03_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm03_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A366TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM03_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A366TBM03_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A366TBM03_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM03_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM03_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0F14e( true) ;
      }
      else
      {
         wb_table4_34_0F14e( false) ;
      }
   }

   public void wb_table2_5_0F14( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM03_CDISC_ITEM.htm");
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
         wb_table2_5_0F14e( true) ;
      }
      else
      {
         wb_table2_5_0F14e( false) ;
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
      /* Execute user event: e110F2 */
      e110F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A59TBM03_DOM_CD = httpContext.cgiGet( edtTBM03_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
            A60TBM03_DOM_VAR_NM = httpContext.cgiGet( edtTBM03_DOM_VAR_NM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
            A346TBM03_VAR_DESC = httpContext.cgiGet( edtTBM03_VAR_DESC_Internalname) ;
            n346TBM03_VAR_DESC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A346TBM03_VAR_DESC", A346TBM03_VAR_DESC);
            n346TBM03_VAR_DESC = ((GXutil.strcmp("", A346TBM03_VAR_DESC)==0) ? true : false) ;
            A347TBM03_SDTM_FLG = httpContext.cgiGet( edtTBM03_SDTM_FLG_Internalname) ;
            n347TBM03_SDTM_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A347TBM03_SDTM_FLG", A347TBM03_SDTM_FLG);
            n347TBM03_SDTM_FLG = ((GXutil.strcmp("", A347TBM03_SDTM_FLG)==0) ? true : false) ;
            A348TBM03_CDASH_FLG = httpContext.cgiGet( edtTBM03_CDASH_FLG_Internalname) ;
            n348TBM03_CDASH_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A348TBM03_CDASH_FLG", A348TBM03_CDASH_FLG);
            n348TBM03_CDASH_FLG = ((GXutil.strcmp("", A348TBM03_CDASH_FLG)==0) ? true : false) ;
            A532TBM03_INPUT_TYPE_DIV = httpContext.cgiGet( edtTBM03_INPUT_TYPE_DIV_Internalname) ;
            n532TBM03_INPUT_TYPE_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A532TBM03_INPUT_TYPE_DIV", A532TBM03_INPUT_TYPE_DIV);
            n532TBM03_INPUT_TYPE_DIV = ((GXutil.strcmp("", A532TBM03_INPUT_TYPE_DIV)==0) ? true : false) ;
            A349TBM03_REQUIRED_FLG = httpContext.cgiGet( edtTBM03_REQUIRED_FLG_Internalname) ;
            n349TBM03_REQUIRED_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A349TBM03_REQUIRED_FLG", A349TBM03_REQUIRED_FLG);
            n349TBM03_REQUIRED_FLG = ((GXutil.strcmp("", A349TBM03_REQUIRED_FLG)==0) ? true : false) ;
            A688TBM03_SAS_FIELD_NM = httpContext.cgiGet( edtTBM03_SAS_FIELD_NM_Internalname) ;
            n688TBM03_SAS_FIELD_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A688TBM03_SAS_FIELD_NM", A688TBM03_SAS_FIELD_NM);
            n688TBM03_SAS_FIELD_NM = ((GXutil.strcmp("", A688TBM03_SAS_FIELD_NM)==0) ? true : false) ;
            A709TBM03_ODM_DATA_TYPE = httpContext.cgiGet( edtTBM03_ODM_DATA_TYPE_Internalname) ;
            n709TBM03_ODM_DATA_TYPE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A709TBM03_ODM_DATA_TYPE", A709TBM03_ODM_DATA_TYPE);
            n709TBM03_ODM_DATA_TYPE = ((GXutil.strcmp("", A709TBM03_ODM_DATA_TYPE)==0) ? true : false) ;
            A350TBM03_NOTE = httpContext.cgiGet( edtTBM03_NOTE_Internalname) ;
            n350TBM03_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A350TBM03_NOTE", A350TBM03_NOTE);
            n350TBM03_NOTE = ((GXutil.strcmp("", A350TBM03_NOTE)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM03_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM03_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM03_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM03_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A61TBM03_ORDER = 0 ;
               n61TBM03_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A61TBM03_ORDER", GXutil.ltrim( GXutil.str( A61TBM03_ORDER, 5, 0)));
            }
            else
            {
               A61TBM03_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM03_ORDER_Internalname), ".", ",")) ;
               n61TBM03_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A61TBM03_ORDER", GXutil.ltrim( GXutil.str( A61TBM03_ORDER, 5, 0)));
            }
            n61TBM03_ORDER = ((0==A61TBM03_ORDER) ? true : false) ;
            A932TBM03_VERSION = httpContext.cgiGet( edtTBM03_VERSION_Internalname) ;
            n932TBM03_VERSION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A932TBM03_VERSION", A932TBM03_VERSION);
            n932TBM03_VERSION = ((GXutil.strcmp("", A932TBM03_VERSION)==0) ? true : false) ;
            A359TBM03_DEL_FLG = httpContext.cgiGet( edtTBM03_DEL_FLG_Internalname) ;
            n359TBM03_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A359TBM03_DEL_FLG", A359TBM03_DEL_FLG);
            n359TBM03_DEL_FLG = ((GXutil.strcmp("", A359TBM03_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM03_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM03_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM03_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A360TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n360TBM03_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A360TBM03_CRT_DATETIME", localUtil.ttoc( A360TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A360TBM03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM03_CRT_DATETIME_Internalname)) ;
               n360TBM03_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A360TBM03_CRT_DATETIME", localUtil.ttoc( A360TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n360TBM03_CRT_DATETIME = (GXutil.nullDate().equals(A360TBM03_CRT_DATETIME) ? true : false) ;
            A361TBM03_CRT_USER_ID = httpContext.cgiGet( edtTBM03_CRT_USER_ID_Internalname) ;
            n361TBM03_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A361TBM03_CRT_USER_ID", A361TBM03_CRT_USER_ID);
            n361TBM03_CRT_USER_ID = ((GXutil.strcmp("", A361TBM03_CRT_USER_ID)==0) ? true : false) ;
            A362TBM03_CRT_PROG_NM = httpContext.cgiGet( edtTBM03_CRT_PROG_NM_Internalname) ;
            n362TBM03_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A362TBM03_CRT_PROG_NM", A362TBM03_CRT_PROG_NM);
            n362TBM03_CRT_PROG_NM = ((GXutil.strcmp("", A362TBM03_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM03_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM03_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM03_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A363TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n363TBM03_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A363TBM03_UPD_DATETIME", localUtil.ttoc( A363TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A363TBM03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM03_UPD_DATETIME_Internalname)) ;
               n363TBM03_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A363TBM03_UPD_DATETIME", localUtil.ttoc( A363TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n363TBM03_UPD_DATETIME = (GXutil.nullDate().equals(A363TBM03_UPD_DATETIME) ? true : false) ;
            A364TBM03_UPD_USER_ID = httpContext.cgiGet( edtTBM03_UPD_USER_ID_Internalname) ;
            n364TBM03_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A364TBM03_UPD_USER_ID", A364TBM03_UPD_USER_ID);
            n364TBM03_UPD_USER_ID = ((GXutil.strcmp("", A364TBM03_UPD_USER_ID)==0) ? true : false) ;
            A365TBM03_UPD_PROG_NM = httpContext.cgiGet( edtTBM03_UPD_PROG_NM_Internalname) ;
            n365TBM03_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A365TBM03_UPD_PROG_NM", A365TBM03_UPD_PROG_NM);
            n365TBM03_UPD_PROG_NM = ((GXutil.strcmp("", A365TBM03_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM03_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM03_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM03_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM03_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A366TBM03_UPD_CNT = 0 ;
               n366TBM03_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A366TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)));
            }
            else
            {
               A366TBM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM03_UPD_CNT_Internalname), ".", ",") ;
               n366TBM03_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A366TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)));
            }
            n366TBM03_UPD_CNT = ((0==A366TBM03_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z59TBM03_DOM_CD = httpContext.cgiGet( "Z59TBM03_DOM_CD") ;
            Z60TBM03_DOM_VAR_NM = httpContext.cgiGet( "Z60TBM03_DOM_VAR_NM") ;
            Z360TBM03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z360TBM03_CRT_DATETIME"), 0) ;
            n360TBM03_CRT_DATETIME = (GXutil.nullDate().equals(A360TBM03_CRT_DATETIME) ? true : false) ;
            Z361TBM03_CRT_USER_ID = httpContext.cgiGet( "Z361TBM03_CRT_USER_ID") ;
            n361TBM03_CRT_USER_ID = ((GXutil.strcmp("", A361TBM03_CRT_USER_ID)==0) ? true : false) ;
            Z363TBM03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z363TBM03_UPD_DATETIME"), 0) ;
            n363TBM03_UPD_DATETIME = (GXutil.nullDate().equals(A363TBM03_UPD_DATETIME) ? true : false) ;
            Z364TBM03_UPD_USER_ID = httpContext.cgiGet( "Z364TBM03_UPD_USER_ID") ;
            n364TBM03_UPD_USER_ID = ((GXutil.strcmp("", A364TBM03_UPD_USER_ID)==0) ? true : false) ;
            Z366TBM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z366TBM03_UPD_CNT"), ".", ",") ;
            n366TBM03_UPD_CNT = ((0==A366TBM03_UPD_CNT) ? true : false) ;
            Z346TBM03_VAR_DESC = httpContext.cgiGet( "Z346TBM03_VAR_DESC") ;
            n346TBM03_VAR_DESC = ((GXutil.strcmp("", A346TBM03_VAR_DESC)==0) ? true : false) ;
            Z347TBM03_SDTM_FLG = httpContext.cgiGet( "Z347TBM03_SDTM_FLG") ;
            n347TBM03_SDTM_FLG = ((GXutil.strcmp("", A347TBM03_SDTM_FLG)==0) ? true : false) ;
            Z348TBM03_CDASH_FLG = httpContext.cgiGet( "Z348TBM03_CDASH_FLG") ;
            n348TBM03_CDASH_FLG = ((GXutil.strcmp("", A348TBM03_CDASH_FLG)==0) ? true : false) ;
            Z532TBM03_INPUT_TYPE_DIV = httpContext.cgiGet( "Z532TBM03_INPUT_TYPE_DIV") ;
            n532TBM03_INPUT_TYPE_DIV = ((GXutil.strcmp("", A532TBM03_INPUT_TYPE_DIV)==0) ? true : false) ;
            Z349TBM03_REQUIRED_FLG = httpContext.cgiGet( "Z349TBM03_REQUIRED_FLG") ;
            n349TBM03_REQUIRED_FLG = ((GXutil.strcmp("", A349TBM03_REQUIRED_FLG)==0) ? true : false) ;
            Z688TBM03_SAS_FIELD_NM = httpContext.cgiGet( "Z688TBM03_SAS_FIELD_NM") ;
            n688TBM03_SAS_FIELD_NM = ((GXutil.strcmp("", A688TBM03_SAS_FIELD_NM)==0) ? true : false) ;
            Z709TBM03_ODM_DATA_TYPE = httpContext.cgiGet( "Z709TBM03_ODM_DATA_TYPE") ;
            n709TBM03_ODM_DATA_TYPE = ((GXutil.strcmp("", A709TBM03_ODM_DATA_TYPE)==0) ? true : false) ;
            Z350TBM03_NOTE = httpContext.cgiGet( "Z350TBM03_NOTE") ;
            n350TBM03_NOTE = ((GXutil.strcmp("", A350TBM03_NOTE)==0) ? true : false) ;
            Z61TBM03_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z61TBM03_ORDER"), ".", ",")) ;
            n61TBM03_ORDER = ((0==A61TBM03_ORDER) ? true : false) ;
            Z932TBM03_VERSION = httpContext.cgiGet( "Z932TBM03_VERSION") ;
            n932TBM03_VERSION = ((GXutil.strcmp("", A932TBM03_VERSION)==0) ? true : false) ;
            Z359TBM03_DEL_FLG = httpContext.cgiGet( "Z359TBM03_DEL_FLG") ;
            n359TBM03_DEL_FLG = ((GXutil.strcmp("", A359TBM03_DEL_FLG)==0) ? true : false) ;
            Z362TBM03_CRT_PROG_NM = httpContext.cgiGet( "Z362TBM03_CRT_PROG_NM") ;
            n362TBM03_CRT_PROG_NM = ((GXutil.strcmp("", A362TBM03_CRT_PROG_NM)==0) ? true : false) ;
            Z365TBM03_UPD_PROG_NM = httpContext.cgiGet( "Z365TBM03_UPD_PROG_NM") ;
            n365TBM03_UPD_PROG_NM = ((GXutil.strcmp("", A365TBM03_UPD_PROG_NM)==0) ? true : false) ;
            O366TBM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O366TBM03_UPD_CNT"), ".", ",") ;
            n366TBM03_UPD_CNT = ((0==A366TBM03_UPD_CNT) ? true : false) ;
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
               A59TBM03_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
               A60TBM03_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
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
                     /* Execute user event: e110F2 */
                     e110F2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120F2 */
                     e120F2 ();
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
         /* Execute user event: e120F2 */
         e120F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0F14( ) ;
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
      disableAttributes0F14( ) ;
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

   public void resetCaption0F0( )
   {
   }

   public void e110F2( )
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

   public void e120F2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "ドメインコード:" + A59TBM03_DOM_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A60TBM03_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A346TBM03_VAR_DESC + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A347TBM03_SDTM_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A348TBM03_CDASH_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A532TBM03_INPUT_TYPE_DIV + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A349TBM03_REQUIRED_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A688TBM03_SAS_FIELD_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A350TBM03_NOTE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A61TBM03_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A359TBM03_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A360TBM03_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm03_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A360TBM03_CRT_DATETIME", localUtil.ttoc( A360TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A361TBM03_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A362TBM03_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A363TBM03_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm03_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A363TBM03_UPD_DATETIME", localUtil.ttoc( A363TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A364TBM03_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A365TBM03_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
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

   public void zm0F14( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z360TBM03_CRT_DATETIME = T000F3_A360TBM03_CRT_DATETIME[0] ;
            Z361TBM03_CRT_USER_ID = T000F3_A361TBM03_CRT_USER_ID[0] ;
            Z363TBM03_UPD_DATETIME = T000F3_A363TBM03_UPD_DATETIME[0] ;
            Z364TBM03_UPD_USER_ID = T000F3_A364TBM03_UPD_USER_ID[0] ;
            Z366TBM03_UPD_CNT = T000F3_A366TBM03_UPD_CNT[0] ;
            Z346TBM03_VAR_DESC = T000F3_A346TBM03_VAR_DESC[0] ;
            Z347TBM03_SDTM_FLG = T000F3_A347TBM03_SDTM_FLG[0] ;
            Z348TBM03_CDASH_FLG = T000F3_A348TBM03_CDASH_FLG[0] ;
            Z532TBM03_INPUT_TYPE_DIV = T000F3_A532TBM03_INPUT_TYPE_DIV[0] ;
            Z349TBM03_REQUIRED_FLG = T000F3_A349TBM03_REQUIRED_FLG[0] ;
            Z688TBM03_SAS_FIELD_NM = T000F3_A688TBM03_SAS_FIELD_NM[0] ;
            Z709TBM03_ODM_DATA_TYPE = T000F3_A709TBM03_ODM_DATA_TYPE[0] ;
            Z350TBM03_NOTE = T000F3_A350TBM03_NOTE[0] ;
            Z61TBM03_ORDER = T000F3_A61TBM03_ORDER[0] ;
            Z932TBM03_VERSION = T000F3_A932TBM03_VERSION[0] ;
            Z359TBM03_DEL_FLG = T000F3_A359TBM03_DEL_FLG[0] ;
            Z362TBM03_CRT_PROG_NM = T000F3_A362TBM03_CRT_PROG_NM[0] ;
            Z365TBM03_UPD_PROG_NM = T000F3_A365TBM03_UPD_PROG_NM[0] ;
         }
         else
         {
            Z360TBM03_CRT_DATETIME = A360TBM03_CRT_DATETIME ;
            Z361TBM03_CRT_USER_ID = A361TBM03_CRT_USER_ID ;
            Z363TBM03_UPD_DATETIME = A363TBM03_UPD_DATETIME ;
            Z364TBM03_UPD_USER_ID = A364TBM03_UPD_USER_ID ;
            Z366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
            Z346TBM03_VAR_DESC = A346TBM03_VAR_DESC ;
            Z347TBM03_SDTM_FLG = A347TBM03_SDTM_FLG ;
            Z348TBM03_CDASH_FLG = A348TBM03_CDASH_FLG ;
            Z532TBM03_INPUT_TYPE_DIV = A532TBM03_INPUT_TYPE_DIV ;
            Z349TBM03_REQUIRED_FLG = A349TBM03_REQUIRED_FLG ;
            Z688TBM03_SAS_FIELD_NM = A688TBM03_SAS_FIELD_NM ;
            Z709TBM03_ODM_DATA_TYPE = A709TBM03_ODM_DATA_TYPE ;
            Z350TBM03_NOTE = A350TBM03_NOTE ;
            Z61TBM03_ORDER = A61TBM03_ORDER ;
            Z932TBM03_VERSION = A932TBM03_VERSION ;
            Z359TBM03_DEL_FLG = A359TBM03_DEL_FLG ;
            Z362TBM03_CRT_PROG_NM = A362TBM03_CRT_PROG_NM ;
            Z365TBM03_UPD_PROG_NM = A365TBM03_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z60TBM03_DOM_VAR_NM = A60TBM03_DOM_VAR_NM ;
         Z360TBM03_CRT_DATETIME = A360TBM03_CRT_DATETIME ;
         Z361TBM03_CRT_USER_ID = A361TBM03_CRT_USER_ID ;
         Z363TBM03_UPD_DATETIME = A363TBM03_UPD_DATETIME ;
         Z364TBM03_UPD_USER_ID = A364TBM03_UPD_USER_ID ;
         Z366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
         Z346TBM03_VAR_DESC = A346TBM03_VAR_DESC ;
         Z347TBM03_SDTM_FLG = A347TBM03_SDTM_FLG ;
         Z348TBM03_CDASH_FLG = A348TBM03_CDASH_FLG ;
         Z532TBM03_INPUT_TYPE_DIV = A532TBM03_INPUT_TYPE_DIV ;
         Z349TBM03_REQUIRED_FLG = A349TBM03_REQUIRED_FLG ;
         Z688TBM03_SAS_FIELD_NM = A688TBM03_SAS_FIELD_NM ;
         Z709TBM03_ODM_DATA_TYPE = A709TBM03_ODM_DATA_TYPE ;
         Z350TBM03_NOTE = A350TBM03_NOTE ;
         Z61TBM03_ORDER = A61TBM03_ORDER ;
         Z932TBM03_VERSION = A932TBM03_VERSION ;
         Z359TBM03_DEL_FLG = A359TBM03_DEL_FLG ;
         Z362TBM03_CRT_PROG_NM = A362TBM03_CRT_PROG_NM ;
         Z365TBM03_UPD_PROG_NM = A365TBM03_UPD_PROG_NM ;
         Z59TBM03_DOM_CD = A59TBM03_DOM_CD ;
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

   public void load0F14( )
   {
      /* Using cursor T000F5 */
      pr_default.execute(3, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A360TBM03_CRT_DATETIME = T000F5_A360TBM03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A360TBM03_CRT_DATETIME", localUtil.ttoc( A360TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n360TBM03_CRT_DATETIME = T000F5_n360TBM03_CRT_DATETIME[0] ;
         A361TBM03_CRT_USER_ID = T000F5_A361TBM03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361TBM03_CRT_USER_ID", A361TBM03_CRT_USER_ID);
         n361TBM03_CRT_USER_ID = T000F5_n361TBM03_CRT_USER_ID[0] ;
         A363TBM03_UPD_DATETIME = T000F5_A363TBM03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A363TBM03_UPD_DATETIME", localUtil.ttoc( A363TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n363TBM03_UPD_DATETIME = T000F5_n363TBM03_UPD_DATETIME[0] ;
         A364TBM03_UPD_USER_ID = T000F5_A364TBM03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A364TBM03_UPD_USER_ID", A364TBM03_UPD_USER_ID);
         n364TBM03_UPD_USER_ID = T000F5_n364TBM03_UPD_USER_ID[0] ;
         A366TBM03_UPD_CNT = T000F5_A366TBM03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A366TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)));
         n366TBM03_UPD_CNT = T000F5_n366TBM03_UPD_CNT[0] ;
         A346TBM03_VAR_DESC = T000F5_A346TBM03_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBM03_VAR_DESC", A346TBM03_VAR_DESC);
         n346TBM03_VAR_DESC = T000F5_n346TBM03_VAR_DESC[0] ;
         A347TBM03_SDTM_FLG = T000F5_A347TBM03_SDTM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A347TBM03_SDTM_FLG", A347TBM03_SDTM_FLG);
         n347TBM03_SDTM_FLG = T000F5_n347TBM03_SDTM_FLG[0] ;
         A348TBM03_CDASH_FLG = T000F5_A348TBM03_CDASH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A348TBM03_CDASH_FLG", A348TBM03_CDASH_FLG);
         n348TBM03_CDASH_FLG = T000F5_n348TBM03_CDASH_FLG[0] ;
         A532TBM03_INPUT_TYPE_DIV = T000F5_A532TBM03_INPUT_TYPE_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A532TBM03_INPUT_TYPE_DIV", A532TBM03_INPUT_TYPE_DIV);
         n532TBM03_INPUT_TYPE_DIV = T000F5_n532TBM03_INPUT_TYPE_DIV[0] ;
         A349TBM03_REQUIRED_FLG = T000F5_A349TBM03_REQUIRED_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A349TBM03_REQUIRED_FLG", A349TBM03_REQUIRED_FLG);
         n349TBM03_REQUIRED_FLG = T000F5_n349TBM03_REQUIRED_FLG[0] ;
         A688TBM03_SAS_FIELD_NM = T000F5_A688TBM03_SAS_FIELD_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688TBM03_SAS_FIELD_NM", A688TBM03_SAS_FIELD_NM);
         n688TBM03_SAS_FIELD_NM = T000F5_n688TBM03_SAS_FIELD_NM[0] ;
         A709TBM03_ODM_DATA_TYPE = T000F5_A709TBM03_ODM_DATA_TYPE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709TBM03_ODM_DATA_TYPE", A709TBM03_ODM_DATA_TYPE);
         n709TBM03_ODM_DATA_TYPE = T000F5_n709TBM03_ODM_DATA_TYPE[0] ;
         A350TBM03_NOTE = T000F5_A350TBM03_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A350TBM03_NOTE", A350TBM03_NOTE);
         n350TBM03_NOTE = T000F5_n350TBM03_NOTE[0] ;
         A61TBM03_ORDER = T000F5_A61TBM03_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61TBM03_ORDER", GXutil.ltrim( GXutil.str( A61TBM03_ORDER, 5, 0)));
         n61TBM03_ORDER = T000F5_n61TBM03_ORDER[0] ;
         A932TBM03_VERSION = T000F5_A932TBM03_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A932TBM03_VERSION", A932TBM03_VERSION);
         n932TBM03_VERSION = T000F5_n932TBM03_VERSION[0] ;
         A359TBM03_DEL_FLG = T000F5_A359TBM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A359TBM03_DEL_FLG", A359TBM03_DEL_FLG);
         n359TBM03_DEL_FLG = T000F5_n359TBM03_DEL_FLG[0] ;
         A362TBM03_CRT_PROG_NM = T000F5_A362TBM03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362TBM03_CRT_PROG_NM", A362TBM03_CRT_PROG_NM);
         n362TBM03_CRT_PROG_NM = T000F5_n362TBM03_CRT_PROG_NM[0] ;
         A365TBM03_UPD_PROG_NM = T000F5_A365TBM03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365TBM03_UPD_PROG_NM", A365TBM03_UPD_PROG_NM);
         n365TBM03_UPD_PROG_NM = T000F5_n365TBM03_UPD_PROG_NM[0] ;
         zm0F14( -8) ;
      }
      pr_default.close(3);
      onLoadActions0F14( ) ;
   }

   public void onLoadActions0F14( )
   {
      AV9Pgmname = "TBM03_CDISC_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0F14( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM03_CDISC_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000F4 */
      pr_default.execute(2, new Object[] {A59TBM03_DOM_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CDISC項目マスタ・ドメインサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A360TBM03_CRT_DATETIME) || (( A360TBM03_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A360TBM03_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM03_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A363TBM03_UPD_DATETIME) || (( A363TBM03_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A363TBM03_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM03_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0F14( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A59TBM03_DOM_CD )
   {
      /* Using cursor T000F4 */
      pr_default.execute(2, new Object[] {A59TBM03_DOM_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CDISC項目マスタ・ドメインサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(2);
   }

   public void getKey0F14( )
   {
      /* Using cursor T000F6 */
      pr_default.execute(4, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound14 = (short)(1) ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000F3 */
      pr_default.execute(1, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0F14( 8) ;
         RcdFound14 = (short)(1) ;
         A60TBM03_DOM_VAR_NM = T000F3_A60TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
         A360TBM03_CRT_DATETIME = T000F3_A360TBM03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A360TBM03_CRT_DATETIME", localUtil.ttoc( A360TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n360TBM03_CRT_DATETIME = T000F3_n360TBM03_CRT_DATETIME[0] ;
         A361TBM03_CRT_USER_ID = T000F3_A361TBM03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361TBM03_CRT_USER_ID", A361TBM03_CRT_USER_ID);
         n361TBM03_CRT_USER_ID = T000F3_n361TBM03_CRT_USER_ID[0] ;
         A363TBM03_UPD_DATETIME = T000F3_A363TBM03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A363TBM03_UPD_DATETIME", localUtil.ttoc( A363TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n363TBM03_UPD_DATETIME = T000F3_n363TBM03_UPD_DATETIME[0] ;
         A364TBM03_UPD_USER_ID = T000F3_A364TBM03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A364TBM03_UPD_USER_ID", A364TBM03_UPD_USER_ID);
         n364TBM03_UPD_USER_ID = T000F3_n364TBM03_UPD_USER_ID[0] ;
         A366TBM03_UPD_CNT = T000F3_A366TBM03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A366TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)));
         n366TBM03_UPD_CNT = T000F3_n366TBM03_UPD_CNT[0] ;
         A346TBM03_VAR_DESC = T000F3_A346TBM03_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBM03_VAR_DESC", A346TBM03_VAR_DESC);
         n346TBM03_VAR_DESC = T000F3_n346TBM03_VAR_DESC[0] ;
         A347TBM03_SDTM_FLG = T000F3_A347TBM03_SDTM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A347TBM03_SDTM_FLG", A347TBM03_SDTM_FLG);
         n347TBM03_SDTM_FLG = T000F3_n347TBM03_SDTM_FLG[0] ;
         A348TBM03_CDASH_FLG = T000F3_A348TBM03_CDASH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A348TBM03_CDASH_FLG", A348TBM03_CDASH_FLG);
         n348TBM03_CDASH_FLG = T000F3_n348TBM03_CDASH_FLG[0] ;
         A532TBM03_INPUT_TYPE_DIV = T000F3_A532TBM03_INPUT_TYPE_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A532TBM03_INPUT_TYPE_DIV", A532TBM03_INPUT_TYPE_DIV);
         n532TBM03_INPUT_TYPE_DIV = T000F3_n532TBM03_INPUT_TYPE_DIV[0] ;
         A349TBM03_REQUIRED_FLG = T000F3_A349TBM03_REQUIRED_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A349TBM03_REQUIRED_FLG", A349TBM03_REQUIRED_FLG);
         n349TBM03_REQUIRED_FLG = T000F3_n349TBM03_REQUIRED_FLG[0] ;
         A688TBM03_SAS_FIELD_NM = T000F3_A688TBM03_SAS_FIELD_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688TBM03_SAS_FIELD_NM", A688TBM03_SAS_FIELD_NM);
         n688TBM03_SAS_FIELD_NM = T000F3_n688TBM03_SAS_FIELD_NM[0] ;
         A709TBM03_ODM_DATA_TYPE = T000F3_A709TBM03_ODM_DATA_TYPE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709TBM03_ODM_DATA_TYPE", A709TBM03_ODM_DATA_TYPE);
         n709TBM03_ODM_DATA_TYPE = T000F3_n709TBM03_ODM_DATA_TYPE[0] ;
         A350TBM03_NOTE = T000F3_A350TBM03_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A350TBM03_NOTE", A350TBM03_NOTE);
         n350TBM03_NOTE = T000F3_n350TBM03_NOTE[0] ;
         A61TBM03_ORDER = T000F3_A61TBM03_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A61TBM03_ORDER", GXutil.ltrim( GXutil.str( A61TBM03_ORDER, 5, 0)));
         n61TBM03_ORDER = T000F3_n61TBM03_ORDER[0] ;
         A932TBM03_VERSION = T000F3_A932TBM03_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A932TBM03_VERSION", A932TBM03_VERSION);
         n932TBM03_VERSION = T000F3_n932TBM03_VERSION[0] ;
         A359TBM03_DEL_FLG = T000F3_A359TBM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A359TBM03_DEL_FLG", A359TBM03_DEL_FLG);
         n359TBM03_DEL_FLG = T000F3_n359TBM03_DEL_FLG[0] ;
         A362TBM03_CRT_PROG_NM = T000F3_A362TBM03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362TBM03_CRT_PROG_NM", A362TBM03_CRT_PROG_NM);
         n362TBM03_CRT_PROG_NM = T000F3_n362TBM03_CRT_PROG_NM[0] ;
         A365TBM03_UPD_PROG_NM = T000F3_A365TBM03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365TBM03_UPD_PROG_NM", A365TBM03_UPD_PROG_NM);
         n365TBM03_UPD_PROG_NM = T000F3_n365TBM03_UPD_PROG_NM[0] ;
         A59TBM03_DOM_CD = T000F3_A59TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
         O366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
         n366TBM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A366TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)));
         Z59TBM03_DOM_CD = A59TBM03_DOM_CD ;
         Z60TBM03_DOM_VAR_NM = A60TBM03_DOM_VAR_NM ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0F14( ) ;
         if ( AnyError == 1 )
         {
            RcdFound14 = (short)(0) ;
            initializeNonKey0F14( ) ;
         }
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound14 = (short)(0) ;
         initializeNonKey0F14( ) ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode14 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0F14( ) ;
      if ( RcdFound14 == 0 )
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
      RcdFound14 = (short)(0) ;
      /* Using cursor T000F7 */
      pr_default.execute(5, new Object[] {A59TBM03_DOM_CD, A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000F7_A59TBM03_DOM_CD[0], A59TBM03_DOM_CD) < 0 ) || ( GXutil.strcmp(T000F7_A59TBM03_DOM_CD[0], A59TBM03_DOM_CD) == 0 ) && ( GXutil.strcmp(T000F7_A60TBM03_DOM_VAR_NM[0], A60TBM03_DOM_VAR_NM) < 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000F7_A59TBM03_DOM_CD[0], A59TBM03_DOM_CD) > 0 ) || ( GXutil.strcmp(T000F7_A59TBM03_DOM_CD[0], A59TBM03_DOM_CD) == 0 ) && ( GXutil.strcmp(T000F7_A60TBM03_DOM_VAR_NM[0], A60TBM03_DOM_VAR_NM) > 0 ) ) )
         {
            A59TBM03_DOM_CD = T000F7_A59TBM03_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
            A60TBM03_DOM_VAR_NM = T000F7_A60TBM03_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
            RcdFound14 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound14 = (short)(0) ;
      /* Using cursor T000F8 */
      pr_default.execute(6, new Object[] {A59TBM03_DOM_CD, A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000F8_A59TBM03_DOM_CD[0], A59TBM03_DOM_CD) > 0 ) || ( GXutil.strcmp(T000F8_A59TBM03_DOM_CD[0], A59TBM03_DOM_CD) == 0 ) && ( GXutil.strcmp(T000F8_A60TBM03_DOM_VAR_NM[0], A60TBM03_DOM_VAR_NM) > 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000F8_A59TBM03_DOM_CD[0], A59TBM03_DOM_CD) < 0 ) || ( GXutil.strcmp(T000F8_A59TBM03_DOM_CD[0], A59TBM03_DOM_CD) == 0 ) && ( GXutil.strcmp(T000F8_A60TBM03_DOM_VAR_NM[0], A60TBM03_DOM_VAR_NM) < 0 ) ) )
         {
            A59TBM03_DOM_CD = T000F8_A59TBM03_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
            A60TBM03_DOM_VAR_NM = T000F8_A60TBM03_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
            RcdFound14 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0F14( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0F14( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound14 == 1 )
         {
            if ( ( GXutil.strcmp(A59TBM03_DOM_CD, Z59TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A60TBM03_DOM_VAR_NM, Z60TBM03_DOM_VAR_NM) != 0 ) )
            {
               A59TBM03_DOM_CD = Z59TBM03_DOM_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
               A60TBM03_DOM_VAR_NM = Z60TBM03_DOM_VAR_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM03_DOM_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0F14( ) ;
               GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A59TBM03_DOM_CD, Z59TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A60TBM03_DOM_VAR_NM, Z60TBM03_DOM_VAR_NM) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0F14( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM03_DOM_CD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0F14( ) ;
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
      if ( ( GXutil.strcmp(A59TBM03_DOM_CD, Z59TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A60TBM03_DOM_VAR_NM, Z60TBM03_DOM_VAR_NM) != 0 ) )
      {
         A59TBM03_DOM_CD = Z59TBM03_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
         A60TBM03_DOM_VAR_NM = Z60TBM03_DOM_VAR_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
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
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM03_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0F14( ) ;
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM03_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0F14( ) ;
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
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM03_VAR_DESC_Internalname ;
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
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM03_VAR_DESC_Internalname ;
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
      scanStart0F14( ) ;
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound14 != 0 )
         {
            scanNext0F14( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM03_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0F14( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0F14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000F2 */
         pr_default.execute(0, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM03_CDISC_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z360TBM03_CRT_DATETIME.equals( T000F2_A360TBM03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z361TBM03_CRT_USER_ID, T000F2_A361TBM03_CRT_USER_ID[0]) != 0 ) || !( Z363TBM03_UPD_DATETIME.equals( T000F2_A363TBM03_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z364TBM03_UPD_USER_ID, T000F2_A364TBM03_UPD_USER_ID[0]) != 0 ) || ( Z366TBM03_UPD_CNT != T000F2_A366TBM03_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z346TBM03_VAR_DESC, T000F2_A346TBM03_VAR_DESC[0]) != 0 ) || ( GXutil.strcmp(Z347TBM03_SDTM_FLG, T000F2_A347TBM03_SDTM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z348TBM03_CDASH_FLG, T000F2_A348TBM03_CDASH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z532TBM03_INPUT_TYPE_DIV, T000F2_A532TBM03_INPUT_TYPE_DIV[0]) != 0 ) || ( GXutil.strcmp(Z349TBM03_REQUIRED_FLG, T000F2_A349TBM03_REQUIRED_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z688TBM03_SAS_FIELD_NM, T000F2_A688TBM03_SAS_FIELD_NM[0]) != 0 ) || ( GXutil.strcmp(Z709TBM03_ODM_DATA_TYPE, T000F2_A709TBM03_ODM_DATA_TYPE[0]) != 0 ) || ( GXutil.strcmp(Z350TBM03_NOTE, T000F2_A350TBM03_NOTE[0]) != 0 ) || ( Z61TBM03_ORDER != T000F2_A61TBM03_ORDER[0] ) || ( GXutil.strcmp(Z932TBM03_VERSION, T000F2_A932TBM03_VERSION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z359TBM03_DEL_FLG, T000F2_A359TBM03_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z362TBM03_CRT_PROG_NM, T000F2_A362TBM03_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z365TBM03_UPD_PROG_NM, T000F2_A365TBM03_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM03_CDISC_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0F14( )
   {
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0F14( 0) ;
         checkOptimisticConcurrency0F14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F14( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0F14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000F9 */
                  pr_default.execute(7, new Object[] {A60TBM03_DOM_VAR_NM, new Boolean(n360TBM03_CRT_DATETIME), A360TBM03_CRT_DATETIME, new Boolean(n361TBM03_CRT_USER_ID), A361TBM03_CRT_USER_ID, new Boolean(n363TBM03_UPD_DATETIME), A363TBM03_UPD_DATETIME, new Boolean(n364TBM03_UPD_USER_ID), A364TBM03_UPD_USER_ID, new Boolean(n366TBM03_UPD_CNT), new Long(A366TBM03_UPD_CNT), new Boolean(n346TBM03_VAR_DESC), A346TBM03_VAR_DESC, new Boolean(n347TBM03_SDTM_FLG), A347TBM03_SDTM_FLG, new Boolean(n348TBM03_CDASH_FLG), A348TBM03_CDASH_FLG, new Boolean(n532TBM03_INPUT_TYPE_DIV), A532TBM03_INPUT_TYPE_DIV, new Boolean(n349TBM03_REQUIRED_FLG), A349TBM03_REQUIRED_FLG, new Boolean(n688TBM03_SAS_FIELD_NM), A688TBM03_SAS_FIELD_NM, new Boolean(n709TBM03_ODM_DATA_TYPE), A709TBM03_ODM_DATA_TYPE, new Boolean(n350TBM03_NOTE), A350TBM03_NOTE, new Boolean(n61TBM03_ORDER), new Integer(A61TBM03_ORDER), new Boolean(n932TBM03_VERSION), A932TBM03_VERSION, new Boolean(n359TBM03_DEL_FLG), A359TBM03_DEL_FLG, new Boolean(n362TBM03_CRT_PROG_NM), A362TBM03_CRT_PROG_NM, new Boolean(n365TBM03_UPD_PROG_NM), A365TBM03_UPD_PROG_NM, A59TBM03_DOM_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption0F0( ) ;
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
            load0F14( ) ;
         }
         endLevel0F14( ) ;
      }
      closeExtendedTableCursors0F14( ) ;
   }

   public void update0F14( )
   {
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F14( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0F14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000F10 */
                  pr_default.execute(8, new Object[] {new Boolean(n360TBM03_CRT_DATETIME), A360TBM03_CRT_DATETIME, new Boolean(n361TBM03_CRT_USER_ID), A361TBM03_CRT_USER_ID, new Boolean(n363TBM03_UPD_DATETIME), A363TBM03_UPD_DATETIME, new Boolean(n364TBM03_UPD_USER_ID), A364TBM03_UPD_USER_ID, new Boolean(n366TBM03_UPD_CNT), new Long(A366TBM03_UPD_CNT), new Boolean(n346TBM03_VAR_DESC), A346TBM03_VAR_DESC, new Boolean(n347TBM03_SDTM_FLG), A347TBM03_SDTM_FLG, new Boolean(n348TBM03_CDASH_FLG), A348TBM03_CDASH_FLG, new Boolean(n532TBM03_INPUT_TYPE_DIV), A532TBM03_INPUT_TYPE_DIV, new Boolean(n349TBM03_REQUIRED_FLG), A349TBM03_REQUIRED_FLG, new Boolean(n688TBM03_SAS_FIELD_NM), A688TBM03_SAS_FIELD_NM, new Boolean(n709TBM03_ODM_DATA_TYPE), A709TBM03_ODM_DATA_TYPE, new Boolean(n350TBM03_NOTE), A350TBM03_NOTE, new Boolean(n61TBM03_ORDER), new Integer(A61TBM03_ORDER), new Boolean(n932TBM03_VERSION), A932TBM03_VERSION, new Boolean(n359TBM03_DEL_FLG), A359TBM03_DEL_FLG, new Boolean(n362TBM03_CRT_PROG_NM), A362TBM03_CRT_PROG_NM, new Boolean(n365TBM03_UPD_PROG_NM), A365TBM03_UPD_PROG_NM, A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM03_CDISC_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0F14( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0F0( ) ;
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
         endLevel0F14( ) ;
      }
      closeExtendedTableCursors0F14( ) ;
   }

   public void deferredUpdate0F14( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0F14( ) ;
         afterConfirm0F14( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0F14( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000F11 */
               pr_default.execute(9, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound14 == 0 )
                     {
                        initAll0F14( ) ;
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
                     resetCaption0F0( ) ;
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
      sMode14 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0F14( ) ;
      Gx_mode = sMode14 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0F14( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM03_CDISC_ITEM" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0F14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm03_cdisc_item");
         if ( AnyError == 0 )
         {
            confirmValues0F0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm03_cdisc_item");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0F14( )
   {
      /* Scan By routine */
      /* Using cursor T000F12 */
      pr_default.execute(10);
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A59TBM03_DOM_CD = T000F12_A59TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
         A60TBM03_DOM_VAR_NM = T000F12_A60TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0F14( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A59TBM03_DOM_CD = T000F12_A59TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
         A60TBM03_DOM_VAR_NM = T000F12_A60TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
      }
   }

   public void scanEnd0F14( )
   {
      pr_default.close(10);
   }

   public void afterConfirm0F14( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0F14( )
   {
      /* Before Insert Rules */
      A360TBM03_CRT_DATETIME = GXutil.now( ) ;
      n360TBM03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A360TBM03_CRT_DATETIME", localUtil.ttoc( A360TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A361TBM03_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A361TBM03_CRT_USER_ID = GXt_char1 ;
      n361TBM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A361TBM03_CRT_USER_ID", A361TBM03_CRT_USER_ID);
      A363TBM03_UPD_DATETIME = GXutil.now( ) ;
      n363TBM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A363TBM03_UPD_DATETIME", localUtil.ttoc( A363TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A364TBM03_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A364TBM03_UPD_USER_ID = GXt_char1 ;
      n364TBM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A364TBM03_UPD_USER_ID", A364TBM03_UPD_USER_ID);
      A366TBM03_UPD_CNT = (long)(O366TBM03_UPD_CNT+1) ;
      n366TBM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A366TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0F14( )
   {
      /* Before Update Rules */
      A363TBM03_UPD_DATETIME = GXutil.now( ) ;
      n363TBM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A363TBM03_UPD_DATETIME", localUtil.ttoc( A363TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A364TBM03_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A364TBM03_UPD_USER_ID = GXt_char1 ;
      n364TBM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A364TBM03_UPD_USER_ID", A364TBM03_UPD_USER_ID);
      A366TBM03_UPD_CNT = (long)(O366TBM03_UPD_CNT+1) ;
      n366TBM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A366TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0F14( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0F14( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0F14( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0F14( )
   {
      edtTBM03_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_DOM_CD_Enabled, 5, 0)));
      edtTBM03_DOM_VAR_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_DOM_VAR_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_DOM_VAR_NM_Enabled, 5, 0)));
      edtTBM03_VAR_DESC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_VAR_DESC_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_VAR_DESC_Enabled, 5, 0)));
      edtTBM03_SDTM_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_SDTM_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_SDTM_FLG_Enabled, 5, 0)));
      edtTBM03_CDASH_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_CDASH_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_CDASH_FLG_Enabled, 5, 0)));
      edtTBM03_INPUT_TYPE_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_INPUT_TYPE_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_INPUT_TYPE_DIV_Enabled, 5, 0)));
      edtTBM03_REQUIRED_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_REQUIRED_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_REQUIRED_FLG_Enabled, 5, 0)));
      edtTBM03_SAS_FIELD_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_SAS_FIELD_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_SAS_FIELD_NM_Enabled, 5, 0)));
      edtTBM03_ODM_DATA_TYPE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_ODM_DATA_TYPE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_ODM_DATA_TYPE_Enabled, 5, 0)));
      edtTBM03_NOTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_NOTE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_NOTE_Enabled, 5, 0)));
      edtTBM03_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_ORDER_Enabled, 5, 0)));
      edtTBM03_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_VERSION_Enabled, 5, 0)));
      edtTBM03_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_DEL_FLG_Enabled, 5, 0)));
      edtTBM03_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM03_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM03_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM03_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM03_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM03_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM03_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM03_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM03_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0F0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CDISC項目マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151319417");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm03_cdisc_item") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0F14( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z59TBM03_DOM_CD", GXutil.rtrim( Z59TBM03_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z60TBM03_DOM_VAR_NM", GXutil.rtrim( Z60TBM03_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z360TBM03_CRT_DATETIME", localUtil.ttoc( Z360TBM03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z361TBM03_CRT_USER_ID", GXutil.rtrim( Z361TBM03_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z363TBM03_UPD_DATETIME", localUtil.ttoc( Z363TBM03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z364TBM03_UPD_USER_ID", GXutil.rtrim( Z364TBM03_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z366TBM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z366TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z346TBM03_VAR_DESC", GXutil.rtrim( Z346TBM03_VAR_DESC));
      GxWebStd.gx_hidden_field( httpContext, "Z347TBM03_SDTM_FLG", GXutil.rtrim( Z347TBM03_SDTM_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z348TBM03_CDASH_FLG", GXutil.rtrim( Z348TBM03_CDASH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z532TBM03_INPUT_TYPE_DIV", GXutil.rtrim( Z532TBM03_INPUT_TYPE_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z349TBM03_REQUIRED_FLG", GXutil.rtrim( Z349TBM03_REQUIRED_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z688TBM03_SAS_FIELD_NM", GXutil.rtrim( Z688TBM03_SAS_FIELD_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z709TBM03_ODM_DATA_TYPE", GXutil.rtrim( Z709TBM03_ODM_DATA_TYPE));
      GxWebStd.gx_hidden_field( httpContext, "Z350TBM03_NOTE", GXutil.rtrim( Z350TBM03_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z61TBM03_ORDER", GXutil.ltrim( localUtil.ntoc( Z61TBM03_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z932TBM03_VERSION", GXutil.rtrim( Z932TBM03_VERSION));
      GxWebStd.gx_hidden_field( httpContext, "Z359TBM03_DEL_FLG", GXutil.rtrim( Z359TBM03_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z362TBM03_CRT_PROG_NM", GXutil.rtrim( Z362TBM03_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z365TBM03_UPD_PROG_NM", GXutil.rtrim( Z365TBM03_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O366TBM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O366TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM03_CDISC_ITEM" ;
   }

   public String getPgmdesc( )
   {
      return "CDISC項目マスタ" ;
   }

   public void initializeNonKey0F14( )
   {
      A360TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n360TBM03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A360TBM03_CRT_DATETIME", localUtil.ttoc( A360TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n360TBM03_CRT_DATETIME = (GXutil.nullDate().equals(A360TBM03_CRT_DATETIME) ? true : false) ;
      A361TBM03_CRT_USER_ID = "" ;
      n361TBM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A361TBM03_CRT_USER_ID", A361TBM03_CRT_USER_ID);
      n361TBM03_CRT_USER_ID = ((GXutil.strcmp("", A361TBM03_CRT_USER_ID)==0) ? true : false) ;
      A363TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n363TBM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A363TBM03_UPD_DATETIME", localUtil.ttoc( A363TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n363TBM03_UPD_DATETIME = (GXutil.nullDate().equals(A363TBM03_UPD_DATETIME) ? true : false) ;
      A364TBM03_UPD_USER_ID = "" ;
      n364TBM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A364TBM03_UPD_USER_ID", A364TBM03_UPD_USER_ID);
      n364TBM03_UPD_USER_ID = ((GXutil.strcmp("", A364TBM03_UPD_USER_ID)==0) ? true : false) ;
      A366TBM03_UPD_CNT = 0 ;
      n366TBM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A366TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)));
      n366TBM03_UPD_CNT = ((0==A366TBM03_UPD_CNT) ? true : false) ;
      A346TBM03_VAR_DESC = "" ;
      n346TBM03_VAR_DESC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A346TBM03_VAR_DESC", A346TBM03_VAR_DESC);
      n346TBM03_VAR_DESC = ((GXutil.strcmp("", A346TBM03_VAR_DESC)==0) ? true : false) ;
      A347TBM03_SDTM_FLG = "" ;
      n347TBM03_SDTM_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A347TBM03_SDTM_FLG", A347TBM03_SDTM_FLG);
      n347TBM03_SDTM_FLG = ((GXutil.strcmp("", A347TBM03_SDTM_FLG)==0) ? true : false) ;
      A348TBM03_CDASH_FLG = "" ;
      n348TBM03_CDASH_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A348TBM03_CDASH_FLG", A348TBM03_CDASH_FLG);
      n348TBM03_CDASH_FLG = ((GXutil.strcmp("", A348TBM03_CDASH_FLG)==0) ? true : false) ;
      A532TBM03_INPUT_TYPE_DIV = "" ;
      n532TBM03_INPUT_TYPE_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A532TBM03_INPUT_TYPE_DIV", A532TBM03_INPUT_TYPE_DIV);
      n532TBM03_INPUT_TYPE_DIV = ((GXutil.strcmp("", A532TBM03_INPUT_TYPE_DIV)==0) ? true : false) ;
      A349TBM03_REQUIRED_FLG = "" ;
      n349TBM03_REQUIRED_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A349TBM03_REQUIRED_FLG", A349TBM03_REQUIRED_FLG);
      n349TBM03_REQUIRED_FLG = ((GXutil.strcmp("", A349TBM03_REQUIRED_FLG)==0) ? true : false) ;
      A688TBM03_SAS_FIELD_NM = "" ;
      n688TBM03_SAS_FIELD_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A688TBM03_SAS_FIELD_NM", A688TBM03_SAS_FIELD_NM);
      n688TBM03_SAS_FIELD_NM = ((GXutil.strcmp("", A688TBM03_SAS_FIELD_NM)==0) ? true : false) ;
      A709TBM03_ODM_DATA_TYPE = "" ;
      n709TBM03_ODM_DATA_TYPE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A709TBM03_ODM_DATA_TYPE", A709TBM03_ODM_DATA_TYPE);
      n709TBM03_ODM_DATA_TYPE = ((GXutil.strcmp("", A709TBM03_ODM_DATA_TYPE)==0) ? true : false) ;
      A350TBM03_NOTE = "" ;
      n350TBM03_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A350TBM03_NOTE", A350TBM03_NOTE);
      n350TBM03_NOTE = ((GXutil.strcmp("", A350TBM03_NOTE)==0) ? true : false) ;
      A61TBM03_ORDER = 0 ;
      n61TBM03_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A61TBM03_ORDER", GXutil.ltrim( GXutil.str( A61TBM03_ORDER, 5, 0)));
      n61TBM03_ORDER = ((0==A61TBM03_ORDER) ? true : false) ;
      A932TBM03_VERSION = "" ;
      n932TBM03_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A932TBM03_VERSION", A932TBM03_VERSION);
      n932TBM03_VERSION = ((GXutil.strcmp("", A932TBM03_VERSION)==0) ? true : false) ;
      A359TBM03_DEL_FLG = "" ;
      n359TBM03_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A359TBM03_DEL_FLG", A359TBM03_DEL_FLG);
      n359TBM03_DEL_FLG = ((GXutil.strcmp("", A359TBM03_DEL_FLG)==0) ? true : false) ;
      A362TBM03_CRT_PROG_NM = "" ;
      n362TBM03_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A362TBM03_CRT_PROG_NM", A362TBM03_CRT_PROG_NM);
      n362TBM03_CRT_PROG_NM = ((GXutil.strcmp("", A362TBM03_CRT_PROG_NM)==0) ? true : false) ;
      A365TBM03_UPD_PROG_NM = "" ;
      n365TBM03_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A365TBM03_UPD_PROG_NM", A365TBM03_UPD_PROG_NM);
      n365TBM03_UPD_PROG_NM = ((GXutil.strcmp("", A365TBM03_UPD_PROG_NM)==0) ? true : false) ;
      O366TBM03_UPD_CNT = A366TBM03_UPD_CNT ;
      n366TBM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A366TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A366TBM03_UPD_CNT, 10, 0)));
   }

   public void initAll0F14( )
   {
      A59TBM03_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A59TBM03_DOM_CD", A59TBM03_DOM_CD);
      A60TBM03_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A60TBM03_DOM_VAR_NM", A60TBM03_DOM_VAR_NM);
      initializeNonKey0F14( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151319423");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm03_cdisc_item.js", "?20207151319423");
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
      lblTextblocktbm03_dom_cd_Internalname = "TEXTBLOCKTBM03_DOM_CD" ;
      edtTBM03_DOM_CD_Internalname = "TBM03_DOM_CD" ;
      lblTextblocktbm03_dom_var_nm_Internalname = "TEXTBLOCKTBM03_DOM_VAR_NM" ;
      edtTBM03_DOM_VAR_NM_Internalname = "TBM03_DOM_VAR_NM" ;
      lblTextblocktbm03_var_desc_Internalname = "TEXTBLOCKTBM03_VAR_DESC" ;
      edtTBM03_VAR_DESC_Internalname = "TBM03_VAR_DESC" ;
      lblTextblocktbm03_sdtm_flg_Internalname = "TEXTBLOCKTBM03_SDTM_FLG" ;
      edtTBM03_SDTM_FLG_Internalname = "TBM03_SDTM_FLG" ;
      lblTextblocktbm03_cdash_flg_Internalname = "TEXTBLOCKTBM03_CDASH_FLG" ;
      edtTBM03_CDASH_FLG_Internalname = "TBM03_CDASH_FLG" ;
      lblTextblocktbm03_input_type_div_Internalname = "TEXTBLOCKTBM03_INPUT_TYPE_DIV" ;
      edtTBM03_INPUT_TYPE_DIV_Internalname = "TBM03_INPUT_TYPE_DIV" ;
      lblTextblocktbm03_required_flg_Internalname = "TEXTBLOCKTBM03_REQUIRED_FLG" ;
      edtTBM03_REQUIRED_FLG_Internalname = "TBM03_REQUIRED_FLG" ;
      lblTextblocktbm03_sas_field_nm_Internalname = "TEXTBLOCKTBM03_SAS_FIELD_NM" ;
      edtTBM03_SAS_FIELD_NM_Internalname = "TBM03_SAS_FIELD_NM" ;
      lblTextblocktbm03_odm_data_type_Internalname = "TEXTBLOCKTBM03_ODM_DATA_TYPE" ;
      edtTBM03_ODM_DATA_TYPE_Internalname = "TBM03_ODM_DATA_TYPE" ;
      lblTextblocktbm03_note_Internalname = "TEXTBLOCKTBM03_NOTE" ;
      edtTBM03_NOTE_Internalname = "TBM03_NOTE" ;
      lblTextblocktbm03_order_Internalname = "TEXTBLOCKTBM03_ORDER" ;
      edtTBM03_ORDER_Internalname = "TBM03_ORDER" ;
      lblTextblocktbm03_version_Internalname = "TEXTBLOCKTBM03_VERSION" ;
      edtTBM03_VERSION_Internalname = "TBM03_VERSION" ;
      lblTextblocktbm03_del_flg_Internalname = "TEXTBLOCKTBM03_DEL_FLG" ;
      edtTBM03_DEL_FLG_Internalname = "TBM03_DEL_FLG" ;
      lblTextblocktbm03_crt_datetime_Internalname = "TEXTBLOCKTBM03_CRT_DATETIME" ;
      edtTBM03_CRT_DATETIME_Internalname = "TBM03_CRT_DATETIME" ;
      lblTextblocktbm03_crt_user_id_Internalname = "TEXTBLOCKTBM03_CRT_USER_ID" ;
      edtTBM03_CRT_USER_ID_Internalname = "TBM03_CRT_USER_ID" ;
      lblTextblocktbm03_crt_prog_nm_Internalname = "TEXTBLOCKTBM03_CRT_PROG_NM" ;
      edtTBM03_CRT_PROG_NM_Internalname = "TBM03_CRT_PROG_NM" ;
      lblTextblocktbm03_upd_datetime_Internalname = "TEXTBLOCKTBM03_UPD_DATETIME" ;
      edtTBM03_UPD_DATETIME_Internalname = "TBM03_UPD_DATETIME" ;
      lblTextblocktbm03_upd_user_id_Internalname = "TEXTBLOCKTBM03_UPD_USER_ID" ;
      edtTBM03_UPD_USER_ID_Internalname = "TBM03_UPD_USER_ID" ;
      lblTextblocktbm03_upd_prog_nm_Internalname = "TEXTBLOCKTBM03_UPD_PROG_NM" ;
      edtTBM03_UPD_PROG_NM_Internalname = "TBM03_UPD_PROG_NM" ;
      lblTextblocktbm03_upd_cnt_Internalname = "TEXTBLOCKTBM03_UPD_CNT" ;
      edtTBM03_UPD_CNT_Internalname = "TBM03_UPD_CNT" ;
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
      edtTBM03_UPD_CNT_Jsonclick = "" ;
      edtTBM03_UPD_CNT_Enabled = 1 ;
      edtTBM03_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM03_UPD_PROG_NM_Enabled = 1 ;
      edtTBM03_UPD_USER_ID_Jsonclick = "" ;
      edtTBM03_UPD_USER_ID_Enabled = 1 ;
      edtTBM03_UPD_DATETIME_Jsonclick = "" ;
      edtTBM03_UPD_DATETIME_Enabled = 1 ;
      edtTBM03_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM03_CRT_PROG_NM_Enabled = 1 ;
      edtTBM03_CRT_USER_ID_Jsonclick = "" ;
      edtTBM03_CRT_USER_ID_Enabled = 1 ;
      edtTBM03_CRT_DATETIME_Jsonclick = "" ;
      edtTBM03_CRT_DATETIME_Enabled = 1 ;
      edtTBM03_DEL_FLG_Jsonclick = "" ;
      edtTBM03_DEL_FLG_Enabled = 1 ;
      edtTBM03_VERSION_Jsonclick = "" ;
      edtTBM03_VERSION_Enabled = 1 ;
      edtTBM03_ORDER_Jsonclick = "" ;
      edtTBM03_ORDER_Enabled = 1 ;
      edtTBM03_NOTE_Enabled = 1 ;
      edtTBM03_ODM_DATA_TYPE_Jsonclick = "" ;
      edtTBM03_ODM_DATA_TYPE_Enabled = 1 ;
      edtTBM03_SAS_FIELD_NM_Jsonclick = "" ;
      edtTBM03_SAS_FIELD_NM_Enabled = 1 ;
      edtTBM03_REQUIRED_FLG_Jsonclick = "" ;
      edtTBM03_REQUIRED_FLG_Enabled = 1 ;
      edtTBM03_INPUT_TYPE_DIV_Jsonclick = "" ;
      edtTBM03_INPUT_TYPE_DIV_Enabled = 1 ;
      edtTBM03_CDASH_FLG_Jsonclick = "" ;
      edtTBM03_CDASH_FLG_Enabled = 1 ;
      edtTBM03_SDTM_FLG_Jsonclick = "" ;
      edtTBM03_SDTM_FLG_Enabled = 1 ;
      edtTBM03_VAR_DESC_Jsonclick = "" ;
      edtTBM03_VAR_DESC_Enabled = 1 ;
      edtTBM03_DOM_VAR_NM_Jsonclick = "" ;
      edtTBM03_DOM_VAR_NM_Enabled = 1 ;
      edtTBM03_DOM_CD_Jsonclick = "" ;
      edtTBM03_DOM_CD_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm03_crt_user_id0F14( String Gx_mode )
   {
      GXt_char1 = A361TBM03_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A361TBM03_CRT_USER_ID = GXt_char1 ;
      n361TBM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A361TBM03_CRT_USER_ID", A361TBM03_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A361TBM03_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm03_upd_user_id0F14( String Gx_mode )
   {
      GXt_char1 = A364TBM03_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A364TBM03_UPD_USER_ID = GXt_char1 ;
      n364TBM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A364TBM03_UPD_USER_ID", A364TBM03_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A364TBM03_UPD_USER_ID))+"\"");
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
      /* Using cursor T000F13 */
      pr_default.execute(11, new Object[] {A59TBM03_DOM_CD});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("'CDISC項目マスタ・ドメインサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(11);
      GX_FocusControl = edtTBM03_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm03_dom_cd( String GX_Parm1 )
   {
      A59TBM03_DOM_CD = GX_Parm1 ;
      /* Using cursor T000F13 */
      pr_default.execute(11, new Object[] {A59TBM03_DOM_CD});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("'CDISC項目マスタ・ドメインサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
      }
      pr_default.close(11);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm03_dom_var_nm( String GX_Parm1 ,
                                       String GX_Parm2 ,
                                       java.util.Date GX_Parm3 ,
                                       String GX_Parm4 ,
                                       java.util.Date GX_Parm5 ,
                                       String GX_Parm6 ,
                                       long GX_Parm7 ,
                                       String GX_Parm8 ,
                                       String GX_Parm9 ,
                                       String GX_Parm10 ,
                                       String GX_Parm11 ,
                                       String GX_Parm12 ,
                                       String GX_Parm13 ,
                                       String GX_Parm14 ,
                                       String GX_Parm15 ,
                                       int GX_Parm16 ,
                                       String GX_Parm17 ,
                                       String GX_Parm18 ,
                                       String GX_Parm19 ,
                                       String GX_Parm20 )
   {
      A59TBM03_DOM_CD = GX_Parm1 ;
      A60TBM03_DOM_VAR_NM = GX_Parm2 ;
      A360TBM03_CRT_DATETIME = GX_Parm3 ;
      n360TBM03_CRT_DATETIME = false ;
      A361TBM03_CRT_USER_ID = GX_Parm4 ;
      n361TBM03_CRT_USER_ID = false ;
      A363TBM03_UPD_DATETIME = GX_Parm5 ;
      n363TBM03_UPD_DATETIME = false ;
      A364TBM03_UPD_USER_ID = GX_Parm6 ;
      n364TBM03_UPD_USER_ID = false ;
      A366TBM03_UPD_CNT = GX_Parm7 ;
      n366TBM03_UPD_CNT = false ;
      A346TBM03_VAR_DESC = GX_Parm8 ;
      n346TBM03_VAR_DESC = false ;
      A347TBM03_SDTM_FLG = GX_Parm9 ;
      n347TBM03_SDTM_FLG = false ;
      A348TBM03_CDASH_FLG = GX_Parm10 ;
      n348TBM03_CDASH_FLG = false ;
      A532TBM03_INPUT_TYPE_DIV = GX_Parm11 ;
      n532TBM03_INPUT_TYPE_DIV = false ;
      A349TBM03_REQUIRED_FLG = GX_Parm12 ;
      n349TBM03_REQUIRED_FLG = false ;
      A688TBM03_SAS_FIELD_NM = GX_Parm13 ;
      n688TBM03_SAS_FIELD_NM = false ;
      A709TBM03_ODM_DATA_TYPE = GX_Parm14 ;
      n709TBM03_ODM_DATA_TYPE = false ;
      A350TBM03_NOTE = GX_Parm15 ;
      n350TBM03_NOTE = false ;
      A61TBM03_ORDER = GX_Parm16 ;
      n61TBM03_ORDER = false ;
      A932TBM03_VERSION = GX_Parm17 ;
      n932TBM03_VERSION = false ;
      A359TBM03_DEL_FLG = GX_Parm18 ;
      n359TBM03_DEL_FLG = false ;
      A362TBM03_CRT_PROG_NM = GX_Parm19 ;
      n362TBM03_CRT_PROG_NM = false ;
      A365TBM03_UPD_PROG_NM = GX_Parm20 ;
      n365TBM03_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A360TBM03_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A361TBM03_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A363TBM03_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A364TBM03_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A366TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A346TBM03_VAR_DESC));
      isValidOutput.add(GXutil.rtrim( A347TBM03_SDTM_FLG));
      isValidOutput.add(GXutil.rtrim( A348TBM03_CDASH_FLG));
      isValidOutput.add(GXutil.rtrim( A532TBM03_INPUT_TYPE_DIV));
      isValidOutput.add(GXutil.rtrim( A349TBM03_REQUIRED_FLG));
      isValidOutput.add(GXutil.rtrim( A688TBM03_SAS_FIELD_NM));
      isValidOutput.add(GXutil.rtrim( A709TBM03_ODM_DATA_TYPE));
      isValidOutput.add(GXutil.rtrim( A350TBM03_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A61TBM03_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A932TBM03_VERSION));
      isValidOutput.add(GXutil.rtrim( A359TBM03_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A362TBM03_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A365TBM03_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z59TBM03_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z60TBM03_DOM_VAR_NM));
      isValidOutput.add(localUtil.ttoc( Z360TBM03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z361TBM03_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z363TBM03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z364TBM03_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z366TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z346TBM03_VAR_DESC));
      isValidOutput.add(GXutil.rtrim( Z347TBM03_SDTM_FLG));
      isValidOutput.add(GXutil.rtrim( Z348TBM03_CDASH_FLG));
      isValidOutput.add(GXutil.rtrim( Z532TBM03_INPUT_TYPE_DIV));
      isValidOutput.add(GXutil.rtrim( Z349TBM03_REQUIRED_FLG));
      isValidOutput.add(GXutil.rtrim( Z688TBM03_SAS_FIELD_NM));
      isValidOutput.add(GXutil.rtrim( Z709TBM03_ODM_DATA_TYPE));
      isValidOutput.add(GXutil.rtrim( Z350TBM03_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z61TBM03_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z932TBM03_VERSION));
      isValidOutput.add(GXutil.rtrim( Z359TBM03_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z362TBM03_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z365TBM03_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O366TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      pr_default.close(11);
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
      Z59TBM03_DOM_CD = "" ;
      Z60TBM03_DOM_VAR_NM = "" ;
      Z360TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z361TBM03_CRT_USER_ID = "" ;
      Z363TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z364TBM03_UPD_USER_ID = "" ;
      Z346TBM03_VAR_DESC = "" ;
      Z347TBM03_SDTM_FLG = "" ;
      Z348TBM03_CDASH_FLG = "" ;
      Z532TBM03_INPUT_TYPE_DIV = "" ;
      Z349TBM03_REQUIRED_FLG = "" ;
      Z688TBM03_SAS_FIELD_NM = "" ;
      Z709TBM03_ODM_DATA_TYPE = "" ;
      Z350TBM03_NOTE = "" ;
      Z932TBM03_VERSION = "" ;
      Z359TBM03_DEL_FLG = "" ;
      Z362TBM03_CRT_PROG_NM = "" ;
      Z365TBM03_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A59TBM03_DOM_CD = "" ;
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
      lblTextblocktbm03_dom_cd_Jsonclick = "" ;
      lblTextblocktbm03_dom_var_nm_Jsonclick = "" ;
      A60TBM03_DOM_VAR_NM = "" ;
      lblTextblocktbm03_var_desc_Jsonclick = "" ;
      A346TBM03_VAR_DESC = "" ;
      lblTextblocktbm03_sdtm_flg_Jsonclick = "" ;
      A347TBM03_SDTM_FLG = "" ;
      lblTextblocktbm03_cdash_flg_Jsonclick = "" ;
      A348TBM03_CDASH_FLG = "" ;
      lblTextblocktbm03_input_type_div_Jsonclick = "" ;
      A532TBM03_INPUT_TYPE_DIV = "" ;
      lblTextblocktbm03_required_flg_Jsonclick = "" ;
      A349TBM03_REQUIRED_FLG = "" ;
      lblTextblocktbm03_sas_field_nm_Jsonclick = "" ;
      A688TBM03_SAS_FIELD_NM = "" ;
      lblTextblocktbm03_odm_data_type_Jsonclick = "" ;
      A709TBM03_ODM_DATA_TYPE = "" ;
      lblTextblocktbm03_note_Jsonclick = "" ;
      A350TBM03_NOTE = "" ;
      lblTextblocktbm03_order_Jsonclick = "" ;
      lblTextblocktbm03_version_Jsonclick = "" ;
      A932TBM03_VERSION = "" ;
      lblTextblocktbm03_del_flg_Jsonclick = "" ;
      A359TBM03_DEL_FLG = "" ;
      lblTextblocktbm03_crt_datetime_Jsonclick = "" ;
      A360TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm03_crt_user_id_Jsonclick = "" ;
      A361TBM03_CRT_USER_ID = "" ;
      lblTextblocktbm03_crt_prog_nm_Jsonclick = "" ;
      A362TBM03_CRT_PROG_NM = "" ;
      lblTextblocktbm03_upd_datetime_Jsonclick = "" ;
      A363TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm03_upd_user_id_Jsonclick = "" ;
      A364TBM03_UPD_USER_ID = "" ;
      lblTextblocktbm03_upd_prog_nm_Jsonclick = "" ;
      A365TBM03_UPD_PROG_NM = "" ;
      lblTextblocktbm03_upd_cnt_Jsonclick = "" ;
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
      AV7W_TXT = "" ;
      T000F5_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F5_A360TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F5_n360TBM03_CRT_DATETIME = new boolean[] {false} ;
      T000F5_A361TBM03_CRT_USER_ID = new String[] {""} ;
      T000F5_n361TBM03_CRT_USER_ID = new boolean[] {false} ;
      T000F5_A363TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F5_n363TBM03_UPD_DATETIME = new boolean[] {false} ;
      T000F5_A364TBM03_UPD_USER_ID = new String[] {""} ;
      T000F5_n364TBM03_UPD_USER_ID = new boolean[] {false} ;
      T000F5_A366TBM03_UPD_CNT = new long[1] ;
      T000F5_n366TBM03_UPD_CNT = new boolean[] {false} ;
      T000F5_A346TBM03_VAR_DESC = new String[] {""} ;
      T000F5_n346TBM03_VAR_DESC = new boolean[] {false} ;
      T000F5_A347TBM03_SDTM_FLG = new String[] {""} ;
      T000F5_n347TBM03_SDTM_FLG = new boolean[] {false} ;
      T000F5_A348TBM03_CDASH_FLG = new String[] {""} ;
      T000F5_n348TBM03_CDASH_FLG = new boolean[] {false} ;
      T000F5_A532TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      T000F5_n532TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      T000F5_A349TBM03_REQUIRED_FLG = new String[] {""} ;
      T000F5_n349TBM03_REQUIRED_FLG = new boolean[] {false} ;
      T000F5_A688TBM03_SAS_FIELD_NM = new String[] {""} ;
      T000F5_n688TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      T000F5_A709TBM03_ODM_DATA_TYPE = new String[] {""} ;
      T000F5_n709TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      T000F5_A350TBM03_NOTE = new String[] {""} ;
      T000F5_n350TBM03_NOTE = new boolean[] {false} ;
      T000F5_A61TBM03_ORDER = new int[1] ;
      T000F5_n61TBM03_ORDER = new boolean[] {false} ;
      T000F5_A932TBM03_VERSION = new String[] {""} ;
      T000F5_n932TBM03_VERSION = new boolean[] {false} ;
      T000F5_A359TBM03_DEL_FLG = new String[] {""} ;
      T000F5_n359TBM03_DEL_FLG = new boolean[] {false} ;
      T000F5_A362TBM03_CRT_PROG_NM = new String[] {""} ;
      T000F5_n362TBM03_CRT_PROG_NM = new boolean[] {false} ;
      T000F5_A365TBM03_UPD_PROG_NM = new String[] {""} ;
      T000F5_n365TBM03_UPD_PROG_NM = new boolean[] {false} ;
      T000F5_A59TBM03_DOM_CD = new String[] {""} ;
      T000F4_A59TBM03_DOM_CD = new String[] {""} ;
      T000F6_A59TBM03_DOM_CD = new String[] {""} ;
      T000F6_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F3_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F3_A360TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F3_n360TBM03_CRT_DATETIME = new boolean[] {false} ;
      T000F3_A361TBM03_CRT_USER_ID = new String[] {""} ;
      T000F3_n361TBM03_CRT_USER_ID = new boolean[] {false} ;
      T000F3_A363TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F3_n363TBM03_UPD_DATETIME = new boolean[] {false} ;
      T000F3_A364TBM03_UPD_USER_ID = new String[] {""} ;
      T000F3_n364TBM03_UPD_USER_ID = new boolean[] {false} ;
      T000F3_A366TBM03_UPD_CNT = new long[1] ;
      T000F3_n366TBM03_UPD_CNT = new boolean[] {false} ;
      T000F3_A346TBM03_VAR_DESC = new String[] {""} ;
      T000F3_n346TBM03_VAR_DESC = new boolean[] {false} ;
      T000F3_A347TBM03_SDTM_FLG = new String[] {""} ;
      T000F3_n347TBM03_SDTM_FLG = new boolean[] {false} ;
      T000F3_A348TBM03_CDASH_FLG = new String[] {""} ;
      T000F3_n348TBM03_CDASH_FLG = new boolean[] {false} ;
      T000F3_A532TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      T000F3_n532TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      T000F3_A349TBM03_REQUIRED_FLG = new String[] {""} ;
      T000F3_n349TBM03_REQUIRED_FLG = new boolean[] {false} ;
      T000F3_A688TBM03_SAS_FIELD_NM = new String[] {""} ;
      T000F3_n688TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      T000F3_A709TBM03_ODM_DATA_TYPE = new String[] {""} ;
      T000F3_n709TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      T000F3_A350TBM03_NOTE = new String[] {""} ;
      T000F3_n350TBM03_NOTE = new boolean[] {false} ;
      T000F3_A61TBM03_ORDER = new int[1] ;
      T000F3_n61TBM03_ORDER = new boolean[] {false} ;
      T000F3_A932TBM03_VERSION = new String[] {""} ;
      T000F3_n932TBM03_VERSION = new boolean[] {false} ;
      T000F3_A359TBM03_DEL_FLG = new String[] {""} ;
      T000F3_n359TBM03_DEL_FLG = new boolean[] {false} ;
      T000F3_A362TBM03_CRT_PROG_NM = new String[] {""} ;
      T000F3_n362TBM03_CRT_PROG_NM = new boolean[] {false} ;
      T000F3_A365TBM03_UPD_PROG_NM = new String[] {""} ;
      T000F3_n365TBM03_UPD_PROG_NM = new boolean[] {false} ;
      T000F3_A59TBM03_DOM_CD = new String[] {""} ;
      sMode14 = "" ;
      T000F7_A59TBM03_DOM_CD = new String[] {""} ;
      T000F7_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F8_A59TBM03_DOM_CD = new String[] {""} ;
      T000F8_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F2_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F2_A360TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F2_n360TBM03_CRT_DATETIME = new boolean[] {false} ;
      T000F2_A361TBM03_CRT_USER_ID = new String[] {""} ;
      T000F2_n361TBM03_CRT_USER_ID = new boolean[] {false} ;
      T000F2_A363TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F2_n363TBM03_UPD_DATETIME = new boolean[] {false} ;
      T000F2_A364TBM03_UPD_USER_ID = new String[] {""} ;
      T000F2_n364TBM03_UPD_USER_ID = new boolean[] {false} ;
      T000F2_A366TBM03_UPD_CNT = new long[1] ;
      T000F2_n366TBM03_UPD_CNT = new boolean[] {false} ;
      T000F2_A346TBM03_VAR_DESC = new String[] {""} ;
      T000F2_n346TBM03_VAR_DESC = new boolean[] {false} ;
      T000F2_A347TBM03_SDTM_FLG = new String[] {""} ;
      T000F2_n347TBM03_SDTM_FLG = new boolean[] {false} ;
      T000F2_A348TBM03_CDASH_FLG = new String[] {""} ;
      T000F2_n348TBM03_CDASH_FLG = new boolean[] {false} ;
      T000F2_A532TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      T000F2_n532TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      T000F2_A349TBM03_REQUIRED_FLG = new String[] {""} ;
      T000F2_n349TBM03_REQUIRED_FLG = new boolean[] {false} ;
      T000F2_A688TBM03_SAS_FIELD_NM = new String[] {""} ;
      T000F2_n688TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      T000F2_A709TBM03_ODM_DATA_TYPE = new String[] {""} ;
      T000F2_n709TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      T000F2_A350TBM03_NOTE = new String[] {""} ;
      T000F2_n350TBM03_NOTE = new boolean[] {false} ;
      T000F2_A61TBM03_ORDER = new int[1] ;
      T000F2_n61TBM03_ORDER = new boolean[] {false} ;
      T000F2_A932TBM03_VERSION = new String[] {""} ;
      T000F2_n932TBM03_VERSION = new boolean[] {false} ;
      T000F2_A359TBM03_DEL_FLG = new String[] {""} ;
      T000F2_n359TBM03_DEL_FLG = new boolean[] {false} ;
      T000F2_A362TBM03_CRT_PROG_NM = new String[] {""} ;
      T000F2_n362TBM03_CRT_PROG_NM = new boolean[] {false} ;
      T000F2_A365TBM03_UPD_PROG_NM = new String[] {""} ;
      T000F2_n365TBM03_UPD_PROG_NM = new boolean[] {false} ;
      T000F2_A59TBM03_DOM_CD = new String[] {""} ;
      T000F12_A59TBM03_DOM_CD = new String[] {""} ;
      T000F12_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      T000F13_A59TBM03_DOM_CD = new String[] {""} ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm03_cdisc_item__default(),
         new Object[] {
             new Object[] {
            T000F2_A60TBM03_DOM_VAR_NM, T000F2_A360TBM03_CRT_DATETIME, T000F2_n360TBM03_CRT_DATETIME, T000F2_A361TBM03_CRT_USER_ID, T000F2_n361TBM03_CRT_USER_ID, T000F2_A363TBM03_UPD_DATETIME, T000F2_n363TBM03_UPD_DATETIME, T000F2_A364TBM03_UPD_USER_ID, T000F2_n364TBM03_UPD_USER_ID, T000F2_A366TBM03_UPD_CNT,
            T000F2_n366TBM03_UPD_CNT, T000F2_A346TBM03_VAR_DESC, T000F2_n346TBM03_VAR_DESC, T000F2_A347TBM03_SDTM_FLG, T000F2_n347TBM03_SDTM_FLG, T000F2_A348TBM03_CDASH_FLG, T000F2_n348TBM03_CDASH_FLG, T000F2_A532TBM03_INPUT_TYPE_DIV, T000F2_n532TBM03_INPUT_TYPE_DIV, T000F2_A349TBM03_REQUIRED_FLG,
            T000F2_n349TBM03_REQUIRED_FLG, T000F2_A688TBM03_SAS_FIELD_NM, T000F2_n688TBM03_SAS_FIELD_NM, T000F2_A709TBM03_ODM_DATA_TYPE, T000F2_n709TBM03_ODM_DATA_TYPE, T000F2_A350TBM03_NOTE, T000F2_n350TBM03_NOTE, T000F2_A61TBM03_ORDER, T000F2_n61TBM03_ORDER, T000F2_A932TBM03_VERSION,
            T000F2_n932TBM03_VERSION, T000F2_A359TBM03_DEL_FLG, T000F2_n359TBM03_DEL_FLG, T000F2_A362TBM03_CRT_PROG_NM, T000F2_n362TBM03_CRT_PROG_NM, T000F2_A365TBM03_UPD_PROG_NM, T000F2_n365TBM03_UPD_PROG_NM, T000F2_A59TBM03_DOM_CD
            }
            , new Object[] {
            T000F3_A60TBM03_DOM_VAR_NM, T000F3_A360TBM03_CRT_DATETIME, T000F3_n360TBM03_CRT_DATETIME, T000F3_A361TBM03_CRT_USER_ID, T000F3_n361TBM03_CRT_USER_ID, T000F3_A363TBM03_UPD_DATETIME, T000F3_n363TBM03_UPD_DATETIME, T000F3_A364TBM03_UPD_USER_ID, T000F3_n364TBM03_UPD_USER_ID, T000F3_A366TBM03_UPD_CNT,
            T000F3_n366TBM03_UPD_CNT, T000F3_A346TBM03_VAR_DESC, T000F3_n346TBM03_VAR_DESC, T000F3_A347TBM03_SDTM_FLG, T000F3_n347TBM03_SDTM_FLG, T000F3_A348TBM03_CDASH_FLG, T000F3_n348TBM03_CDASH_FLG, T000F3_A532TBM03_INPUT_TYPE_DIV, T000F3_n532TBM03_INPUT_TYPE_DIV, T000F3_A349TBM03_REQUIRED_FLG,
            T000F3_n349TBM03_REQUIRED_FLG, T000F3_A688TBM03_SAS_FIELD_NM, T000F3_n688TBM03_SAS_FIELD_NM, T000F3_A709TBM03_ODM_DATA_TYPE, T000F3_n709TBM03_ODM_DATA_TYPE, T000F3_A350TBM03_NOTE, T000F3_n350TBM03_NOTE, T000F3_A61TBM03_ORDER, T000F3_n61TBM03_ORDER, T000F3_A932TBM03_VERSION,
            T000F3_n932TBM03_VERSION, T000F3_A359TBM03_DEL_FLG, T000F3_n359TBM03_DEL_FLG, T000F3_A362TBM03_CRT_PROG_NM, T000F3_n362TBM03_CRT_PROG_NM, T000F3_A365TBM03_UPD_PROG_NM, T000F3_n365TBM03_UPD_PROG_NM, T000F3_A59TBM03_DOM_CD
            }
            , new Object[] {
            T000F4_A59TBM03_DOM_CD
            }
            , new Object[] {
            T000F5_A60TBM03_DOM_VAR_NM, T000F5_A360TBM03_CRT_DATETIME, T000F5_n360TBM03_CRT_DATETIME, T000F5_A361TBM03_CRT_USER_ID, T000F5_n361TBM03_CRT_USER_ID, T000F5_A363TBM03_UPD_DATETIME, T000F5_n363TBM03_UPD_DATETIME, T000F5_A364TBM03_UPD_USER_ID, T000F5_n364TBM03_UPD_USER_ID, T000F5_A366TBM03_UPD_CNT,
            T000F5_n366TBM03_UPD_CNT, T000F5_A346TBM03_VAR_DESC, T000F5_n346TBM03_VAR_DESC, T000F5_A347TBM03_SDTM_FLG, T000F5_n347TBM03_SDTM_FLG, T000F5_A348TBM03_CDASH_FLG, T000F5_n348TBM03_CDASH_FLG, T000F5_A532TBM03_INPUT_TYPE_DIV, T000F5_n532TBM03_INPUT_TYPE_DIV, T000F5_A349TBM03_REQUIRED_FLG,
            T000F5_n349TBM03_REQUIRED_FLG, T000F5_A688TBM03_SAS_FIELD_NM, T000F5_n688TBM03_SAS_FIELD_NM, T000F5_A709TBM03_ODM_DATA_TYPE, T000F5_n709TBM03_ODM_DATA_TYPE, T000F5_A350TBM03_NOTE, T000F5_n350TBM03_NOTE, T000F5_A61TBM03_ORDER, T000F5_n61TBM03_ORDER, T000F5_A932TBM03_VERSION,
            T000F5_n932TBM03_VERSION, T000F5_A359TBM03_DEL_FLG, T000F5_n359TBM03_DEL_FLG, T000F5_A362TBM03_CRT_PROG_NM, T000F5_n362TBM03_CRT_PROG_NM, T000F5_A365TBM03_UPD_PROG_NM, T000F5_n365TBM03_UPD_PROG_NM, T000F5_A59TBM03_DOM_CD
            }
            , new Object[] {
            T000F6_A59TBM03_DOM_CD, T000F6_A60TBM03_DOM_VAR_NM
            }
            , new Object[] {
            T000F7_A59TBM03_DOM_CD, T000F7_A60TBM03_DOM_VAR_NM
            }
            , new Object[] {
            T000F8_A59TBM03_DOM_CD, T000F8_A60TBM03_DOM_VAR_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000F12_A59TBM03_DOM_CD, T000F12_A60TBM03_DOM_VAR_NM
            }
            , new Object[] {
            T000F13_A59TBM03_DOM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM03_CDISC_ITEM" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound14 ;
   private short Gx_err ;
   private int Z61TBM03_ORDER ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM03_DOM_CD_Enabled ;
   private int edtTBM03_DOM_VAR_NM_Enabled ;
   private int edtTBM03_VAR_DESC_Enabled ;
   private int edtTBM03_SDTM_FLG_Enabled ;
   private int edtTBM03_CDASH_FLG_Enabled ;
   private int edtTBM03_INPUT_TYPE_DIV_Enabled ;
   private int edtTBM03_REQUIRED_FLG_Enabled ;
   private int edtTBM03_SAS_FIELD_NM_Enabled ;
   private int edtTBM03_ODM_DATA_TYPE_Enabled ;
   private int edtTBM03_NOTE_Enabled ;
   private int A61TBM03_ORDER ;
   private int edtTBM03_ORDER_Enabled ;
   private int edtTBM03_VERSION_Enabled ;
   private int edtTBM03_DEL_FLG_Enabled ;
   private int edtTBM03_CRT_DATETIME_Enabled ;
   private int edtTBM03_CRT_USER_ID_Enabled ;
   private int edtTBM03_CRT_PROG_NM_Enabled ;
   private int edtTBM03_UPD_DATETIME_Enabled ;
   private int edtTBM03_UPD_USER_ID_Enabled ;
   private int edtTBM03_UPD_PROG_NM_Enabled ;
   private int edtTBM03_UPD_CNT_Enabled ;
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
   private long Z366TBM03_UPD_CNT ;
   private long O366TBM03_UPD_CNT ;
   private long A366TBM03_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM03_DOM_CD_Internalname ;
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
   private String lblTextblocktbm03_dom_cd_Internalname ;
   private String lblTextblocktbm03_dom_cd_Jsonclick ;
   private String edtTBM03_DOM_CD_Jsonclick ;
   private String lblTextblocktbm03_dom_var_nm_Internalname ;
   private String lblTextblocktbm03_dom_var_nm_Jsonclick ;
   private String edtTBM03_DOM_VAR_NM_Internalname ;
   private String edtTBM03_DOM_VAR_NM_Jsonclick ;
   private String lblTextblocktbm03_var_desc_Internalname ;
   private String lblTextblocktbm03_var_desc_Jsonclick ;
   private String edtTBM03_VAR_DESC_Internalname ;
   private String edtTBM03_VAR_DESC_Jsonclick ;
   private String lblTextblocktbm03_sdtm_flg_Internalname ;
   private String lblTextblocktbm03_sdtm_flg_Jsonclick ;
   private String edtTBM03_SDTM_FLG_Internalname ;
   private String edtTBM03_SDTM_FLG_Jsonclick ;
   private String lblTextblocktbm03_cdash_flg_Internalname ;
   private String lblTextblocktbm03_cdash_flg_Jsonclick ;
   private String edtTBM03_CDASH_FLG_Internalname ;
   private String edtTBM03_CDASH_FLG_Jsonclick ;
   private String lblTextblocktbm03_input_type_div_Internalname ;
   private String lblTextblocktbm03_input_type_div_Jsonclick ;
   private String edtTBM03_INPUT_TYPE_DIV_Internalname ;
   private String edtTBM03_INPUT_TYPE_DIV_Jsonclick ;
   private String lblTextblocktbm03_required_flg_Internalname ;
   private String lblTextblocktbm03_required_flg_Jsonclick ;
   private String edtTBM03_REQUIRED_FLG_Internalname ;
   private String edtTBM03_REQUIRED_FLG_Jsonclick ;
   private String lblTextblocktbm03_sas_field_nm_Internalname ;
   private String lblTextblocktbm03_sas_field_nm_Jsonclick ;
   private String edtTBM03_SAS_FIELD_NM_Internalname ;
   private String edtTBM03_SAS_FIELD_NM_Jsonclick ;
   private String lblTextblocktbm03_odm_data_type_Internalname ;
   private String lblTextblocktbm03_odm_data_type_Jsonclick ;
   private String edtTBM03_ODM_DATA_TYPE_Internalname ;
   private String edtTBM03_ODM_DATA_TYPE_Jsonclick ;
   private String lblTextblocktbm03_note_Internalname ;
   private String lblTextblocktbm03_note_Jsonclick ;
   private String edtTBM03_NOTE_Internalname ;
   private String lblTextblocktbm03_order_Internalname ;
   private String lblTextblocktbm03_order_Jsonclick ;
   private String edtTBM03_ORDER_Internalname ;
   private String edtTBM03_ORDER_Jsonclick ;
   private String lblTextblocktbm03_version_Internalname ;
   private String lblTextblocktbm03_version_Jsonclick ;
   private String edtTBM03_VERSION_Internalname ;
   private String edtTBM03_VERSION_Jsonclick ;
   private String lblTextblocktbm03_del_flg_Internalname ;
   private String lblTextblocktbm03_del_flg_Jsonclick ;
   private String edtTBM03_DEL_FLG_Internalname ;
   private String edtTBM03_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm03_crt_datetime_Internalname ;
   private String lblTextblocktbm03_crt_datetime_Jsonclick ;
   private String edtTBM03_CRT_DATETIME_Internalname ;
   private String edtTBM03_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm03_crt_user_id_Internalname ;
   private String lblTextblocktbm03_crt_user_id_Jsonclick ;
   private String edtTBM03_CRT_USER_ID_Internalname ;
   private String edtTBM03_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm03_crt_prog_nm_Internalname ;
   private String lblTextblocktbm03_crt_prog_nm_Jsonclick ;
   private String edtTBM03_CRT_PROG_NM_Internalname ;
   private String edtTBM03_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm03_upd_datetime_Internalname ;
   private String lblTextblocktbm03_upd_datetime_Jsonclick ;
   private String edtTBM03_UPD_DATETIME_Internalname ;
   private String edtTBM03_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm03_upd_user_id_Internalname ;
   private String lblTextblocktbm03_upd_user_id_Jsonclick ;
   private String edtTBM03_UPD_USER_ID_Internalname ;
   private String edtTBM03_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm03_upd_prog_nm_Internalname ;
   private String lblTextblocktbm03_upd_prog_nm_Jsonclick ;
   private String edtTBM03_UPD_PROG_NM_Internalname ;
   private String edtTBM03_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm03_upd_cnt_Internalname ;
   private String lblTextblocktbm03_upd_cnt_Jsonclick ;
   private String edtTBM03_UPD_CNT_Internalname ;
   private String edtTBM03_UPD_CNT_Jsonclick ;
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
   private String sMode14 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z360TBM03_CRT_DATETIME ;
   private java.util.Date Z363TBM03_UPD_DATETIME ;
   private java.util.Date A360TBM03_CRT_DATETIME ;
   private java.util.Date A363TBM03_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n346TBM03_VAR_DESC ;
   private boolean n347TBM03_SDTM_FLG ;
   private boolean n348TBM03_CDASH_FLG ;
   private boolean n532TBM03_INPUT_TYPE_DIV ;
   private boolean n349TBM03_REQUIRED_FLG ;
   private boolean n688TBM03_SAS_FIELD_NM ;
   private boolean n709TBM03_ODM_DATA_TYPE ;
   private boolean n350TBM03_NOTE ;
   private boolean n61TBM03_ORDER ;
   private boolean n932TBM03_VERSION ;
   private boolean n359TBM03_DEL_FLG ;
   private boolean n360TBM03_CRT_DATETIME ;
   private boolean n361TBM03_CRT_USER_ID ;
   private boolean n362TBM03_CRT_PROG_NM ;
   private boolean n363TBM03_UPD_DATETIME ;
   private boolean n364TBM03_UPD_USER_ID ;
   private boolean n365TBM03_UPD_PROG_NM ;
   private boolean n366TBM03_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z59TBM03_DOM_CD ;
   private String Z60TBM03_DOM_VAR_NM ;
   private String Z361TBM03_CRT_USER_ID ;
   private String Z364TBM03_UPD_USER_ID ;
   private String Z346TBM03_VAR_DESC ;
   private String Z347TBM03_SDTM_FLG ;
   private String Z348TBM03_CDASH_FLG ;
   private String Z532TBM03_INPUT_TYPE_DIV ;
   private String Z349TBM03_REQUIRED_FLG ;
   private String Z688TBM03_SAS_FIELD_NM ;
   private String Z709TBM03_ODM_DATA_TYPE ;
   private String Z350TBM03_NOTE ;
   private String Z932TBM03_VERSION ;
   private String Z359TBM03_DEL_FLG ;
   private String Z362TBM03_CRT_PROG_NM ;
   private String Z365TBM03_UPD_PROG_NM ;
   private String A59TBM03_DOM_CD ;
   private String A60TBM03_DOM_VAR_NM ;
   private String A346TBM03_VAR_DESC ;
   private String A347TBM03_SDTM_FLG ;
   private String A348TBM03_CDASH_FLG ;
   private String A532TBM03_INPUT_TYPE_DIV ;
   private String A349TBM03_REQUIRED_FLG ;
   private String A688TBM03_SAS_FIELD_NM ;
   private String A709TBM03_ODM_DATA_TYPE ;
   private String A350TBM03_NOTE ;
   private String A932TBM03_VERSION ;
   private String A359TBM03_DEL_FLG ;
   private String A361TBM03_CRT_USER_ID ;
   private String A362TBM03_CRT_PROG_NM ;
   private String A364TBM03_UPD_USER_ID ;
   private String A365TBM03_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000F5_A60TBM03_DOM_VAR_NM ;
   private java.util.Date[] T000F5_A360TBM03_CRT_DATETIME ;
   private boolean[] T000F5_n360TBM03_CRT_DATETIME ;
   private String[] T000F5_A361TBM03_CRT_USER_ID ;
   private boolean[] T000F5_n361TBM03_CRT_USER_ID ;
   private java.util.Date[] T000F5_A363TBM03_UPD_DATETIME ;
   private boolean[] T000F5_n363TBM03_UPD_DATETIME ;
   private String[] T000F5_A364TBM03_UPD_USER_ID ;
   private boolean[] T000F5_n364TBM03_UPD_USER_ID ;
   private long[] T000F5_A366TBM03_UPD_CNT ;
   private boolean[] T000F5_n366TBM03_UPD_CNT ;
   private String[] T000F5_A346TBM03_VAR_DESC ;
   private boolean[] T000F5_n346TBM03_VAR_DESC ;
   private String[] T000F5_A347TBM03_SDTM_FLG ;
   private boolean[] T000F5_n347TBM03_SDTM_FLG ;
   private String[] T000F5_A348TBM03_CDASH_FLG ;
   private boolean[] T000F5_n348TBM03_CDASH_FLG ;
   private String[] T000F5_A532TBM03_INPUT_TYPE_DIV ;
   private boolean[] T000F5_n532TBM03_INPUT_TYPE_DIV ;
   private String[] T000F5_A349TBM03_REQUIRED_FLG ;
   private boolean[] T000F5_n349TBM03_REQUIRED_FLG ;
   private String[] T000F5_A688TBM03_SAS_FIELD_NM ;
   private boolean[] T000F5_n688TBM03_SAS_FIELD_NM ;
   private String[] T000F5_A709TBM03_ODM_DATA_TYPE ;
   private boolean[] T000F5_n709TBM03_ODM_DATA_TYPE ;
   private String[] T000F5_A350TBM03_NOTE ;
   private boolean[] T000F5_n350TBM03_NOTE ;
   private int[] T000F5_A61TBM03_ORDER ;
   private boolean[] T000F5_n61TBM03_ORDER ;
   private String[] T000F5_A932TBM03_VERSION ;
   private boolean[] T000F5_n932TBM03_VERSION ;
   private String[] T000F5_A359TBM03_DEL_FLG ;
   private boolean[] T000F5_n359TBM03_DEL_FLG ;
   private String[] T000F5_A362TBM03_CRT_PROG_NM ;
   private boolean[] T000F5_n362TBM03_CRT_PROG_NM ;
   private String[] T000F5_A365TBM03_UPD_PROG_NM ;
   private boolean[] T000F5_n365TBM03_UPD_PROG_NM ;
   private String[] T000F5_A59TBM03_DOM_CD ;
   private String[] T000F4_A59TBM03_DOM_CD ;
   private String[] T000F6_A59TBM03_DOM_CD ;
   private String[] T000F6_A60TBM03_DOM_VAR_NM ;
   private String[] T000F3_A60TBM03_DOM_VAR_NM ;
   private java.util.Date[] T000F3_A360TBM03_CRT_DATETIME ;
   private boolean[] T000F3_n360TBM03_CRT_DATETIME ;
   private String[] T000F3_A361TBM03_CRT_USER_ID ;
   private boolean[] T000F3_n361TBM03_CRT_USER_ID ;
   private java.util.Date[] T000F3_A363TBM03_UPD_DATETIME ;
   private boolean[] T000F3_n363TBM03_UPD_DATETIME ;
   private String[] T000F3_A364TBM03_UPD_USER_ID ;
   private boolean[] T000F3_n364TBM03_UPD_USER_ID ;
   private long[] T000F3_A366TBM03_UPD_CNT ;
   private boolean[] T000F3_n366TBM03_UPD_CNT ;
   private String[] T000F3_A346TBM03_VAR_DESC ;
   private boolean[] T000F3_n346TBM03_VAR_DESC ;
   private String[] T000F3_A347TBM03_SDTM_FLG ;
   private boolean[] T000F3_n347TBM03_SDTM_FLG ;
   private String[] T000F3_A348TBM03_CDASH_FLG ;
   private boolean[] T000F3_n348TBM03_CDASH_FLG ;
   private String[] T000F3_A532TBM03_INPUT_TYPE_DIV ;
   private boolean[] T000F3_n532TBM03_INPUT_TYPE_DIV ;
   private String[] T000F3_A349TBM03_REQUIRED_FLG ;
   private boolean[] T000F3_n349TBM03_REQUIRED_FLG ;
   private String[] T000F3_A688TBM03_SAS_FIELD_NM ;
   private boolean[] T000F3_n688TBM03_SAS_FIELD_NM ;
   private String[] T000F3_A709TBM03_ODM_DATA_TYPE ;
   private boolean[] T000F3_n709TBM03_ODM_DATA_TYPE ;
   private String[] T000F3_A350TBM03_NOTE ;
   private boolean[] T000F3_n350TBM03_NOTE ;
   private int[] T000F3_A61TBM03_ORDER ;
   private boolean[] T000F3_n61TBM03_ORDER ;
   private String[] T000F3_A932TBM03_VERSION ;
   private boolean[] T000F3_n932TBM03_VERSION ;
   private String[] T000F3_A359TBM03_DEL_FLG ;
   private boolean[] T000F3_n359TBM03_DEL_FLG ;
   private String[] T000F3_A362TBM03_CRT_PROG_NM ;
   private boolean[] T000F3_n362TBM03_CRT_PROG_NM ;
   private String[] T000F3_A365TBM03_UPD_PROG_NM ;
   private boolean[] T000F3_n365TBM03_UPD_PROG_NM ;
   private String[] T000F3_A59TBM03_DOM_CD ;
   private String[] T000F7_A59TBM03_DOM_CD ;
   private String[] T000F7_A60TBM03_DOM_VAR_NM ;
   private String[] T000F8_A59TBM03_DOM_CD ;
   private String[] T000F8_A60TBM03_DOM_VAR_NM ;
   private String[] T000F2_A60TBM03_DOM_VAR_NM ;
   private java.util.Date[] T000F2_A360TBM03_CRT_DATETIME ;
   private boolean[] T000F2_n360TBM03_CRT_DATETIME ;
   private String[] T000F2_A361TBM03_CRT_USER_ID ;
   private boolean[] T000F2_n361TBM03_CRT_USER_ID ;
   private java.util.Date[] T000F2_A363TBM03_UPD_DATETIME ;
   private boolean[] T000F2_n363TBM03_UPD_DATETIME ;
   private String[] T000F2_A364TBM03_UPD_USER_ID ;
   private boolean[] T000F2_n364TBM03_UPD_USER_ID ;
   private long[] T000F2_A366TBM03_UPD_CNT ;
   private boolean[] T000F2_n366TBM03_UPD_CNT ;
   private String[] T000F2_A346TBM03_VAR_DESC ;
   private boolean[] T000F2_n346TBM03_VAR_DESC ;
   private String[] T000F2_A347TBM03_SDTM_FLG ;
   private boolean[] T000F2_n347TBM03_SDTM_FLG ;
   private String[] T000F2_A348TBM03_CDASH_FLG ;
   private boolean[] T000F2_n348TBM03_CDASH_FLG ;
   private String[] T000F2_A532TBM03_INPUT_TYPE_DIV ;
   private boolean[] T000F2_n532TBM03_INPUT_TYPE_DIV ;
   private String[] T000F2_A349TBM03_REQUIRED_FLG ;
   private boolean[] T000F2_n349TBM03_REQUIRED_FLG ;
   private String[] T000F2_A688TBM03_SAS_FIELD_NM ;
   private boolean[] T000F2_n688TBM03_SAS_FIELD_NM ;
   private String[] T000F2_A709TBM03_ODM_DATA_TYPE ;
   private boolean[] T000F2_n709TBM03_ODM_DATA_TYPE ;
   private String[] T000F2_A350TBM03_NOTE ;
   private boolean[] T000F2_n350TBM03_NOTE ;
   private int[] T000F2_A61TBM03_ORDER ;
   private boolean[] T000F2_n61TBM03_ORDER ;
   private String[] T000F2_A932TBM03_VERSION ;
   private boolean[] T000F2_n932TBM03_VERSION ;
   private String[] T000F2_A359TBM03_DEL_FLG ;
   private boolean[] T000F2_n359TBM03_DEL_FLG ;
   private String[] T000F2_A362TBM03_CRT_PROG_NM ;
   private boolean[] T000F2_n362TBM03_CRT_PROG_NM ;
   private String[] T000F2_A365TBM03_UPD_PROG_NM ;
   private boolean[] T000F2_n365TBM03_UPD_PROG_NM ;
   private String[] T000F2_A59TBM03_DOM_CD ;
   private String[] T000F12_A59TBM03_DOM_CD ;
   private String[] T000F12_A60TBM03_DOM_VAR_NM ;
   private String[] T000F13_A59TBM03_DOM_CD ;
}

final  class tbm03_cdisc_item__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000F2", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F3", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F4", "SELECT `TBM02_DOM_CD` AS TBM03_DOM_CD FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F5", "SELECT TM1.`TBM03_DOM_VAR_NM`, TM1.`TBM03_CRT_DATETIME`, TM1.`TBM03_CRT_USER_ID`, TM1.`TBM03_UPD_DATETIME`, TM1.`TBM03_UPD_USER_ID`, TM1.`TBM03_UPD_CNT`, TM1.`TBM03_VAR_DESC`, TM1.`TBM03_SDTM_FLG`, TM1.`TBM03_CDASH_FLG`, TM1.`TBM03_INPUT_TYPE_DIV`, TM1.`TBM03_REQUIRED_FLG`, TM1.`TBM03_SAS_FIELD_NM`, TM1.`TBM03_ODM_DATA_TYPE`, TM1.`TBM03_NOTE`, TM1.`TBM03_ORDER`, TM1.`TBM03_VERSION`, TM1.`TBM03_DEL_FLG`, TM1.`TBM03_CRT_PROG_NM`, TM1.`TBM03_UPD_PROG_NM`, TM1.`TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` TM1 WHERE TM1.`TBM03_DOM_CD` = ? and TM1.`TBM03_DOM_VAR_NM` = ? ORDER BY TM1.`TBM03_DOM_CD`, TM1.`TBM03_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000F6", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F7", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE ( `TBM03_DOM_CD` > ? or `TBM03_DOM_CD` = ? and `TBM03_DOM_VAR_NM` > ?) ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000F8", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE ( `TBM03_DOM_CD` < ? or `TBM03_DOM_CD` = ? and `TBM03_DOM_VAR_NM` < ?) ORDER BY `TBM03_DOM_CD` DESC, `TBM03_DOM_VAR_NM` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000F9", "INSERT INTO `TBM03_CDISC_ITEM`(`TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000F10", "UPDATE `TBM03_CDISC_ITEM` SET `TBM03_CRT_DATETIME`=?, `TBM03_CRT_USER_ID`=?, `TBM03_UPD_DATETIME`=?, `TBM03_UPD_USER_ID`=?, `TBM03_UPD_CNT`=?, `TBM03_VAR_DESC`=?, `TBM03_SDTM_FLG`=?, `TBM03_CDASH_FLG`=?, `TBM03_INPUT_TYPE_DIV`=?, `TBM03_REQUIRED_FLG`=?, `TBM03_SAS_FIELD_NM`=?, `TBM03_ODM_DATA_TYPE`=?, `TBM03_NOTE`=?, `TBM03_ORDER`=?, `TBM03_VERSION`=?, `TBM03_DEL_FLG`=?, `TBM03_CRT_PROG_NM`=?, `TBM03_UPD_PROG_NM`=?  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new UpdateCursor("T000F11", "DELETE FROM `TBM03_CDISC_ITEM`  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new ForEachCursor("T000F12", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000F13", "SELECT `TBM02_DOM_CD` AS TBM03_DOM_CD FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
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
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
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
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 11 :
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
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setVarchar(2, (String)parms[1], 16, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
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
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 50);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 1000);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 20);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 40);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 40);
               }
               stmt.setVarchar(20, (String)parms[37], 16, false);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 50);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1000);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 20);
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
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 40);
               }
               stmt.setVarchar(19, (String)parms[36], 16, false);
               stmt.setVarchar(20, (String)parms[37], 50, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
      }
   }

}

