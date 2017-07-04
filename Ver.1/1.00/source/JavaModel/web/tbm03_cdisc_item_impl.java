/*
               File: tbm03_cdisc_item_impl
        Description: CDISC項目マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:19.77
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
         A162TBM03_DOM_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A162TBM03_DOM_CD) ;
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
      Form.getMeta().addItem("Description", "CDISC項目マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CDISC項目マスタ"+"</legend>") ;
         wb_table3_27_0F14( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0F14e( boolean wbgen )
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

   public void wb_table3_27_0F14( boolean wbgen )
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
         wb_table4_33_0F14( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0F14e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM03_CDISC_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM03_CDISC_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0F14e( true) ;
      }
      else
      {
         wb_table3_27_0F14e( false) ;
      }
   }

   public void wb_table4_33_0F14( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbm03_dom_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_DOM_CD_Internalname, GXutil.rtrim( A162TBM03_DOM_CD), GXutil.rtrim( localUtil.format( A162TBM03_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM03_DOM_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_DOM_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbm03_dom_var_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_DOM_VAR_NM_Internalname, GXutil.rtrim( A163TBM03_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A163TBM03_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM03_DOM_VAR_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_DOM_VAR_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_var_desc_Internalname, "ドメイン変数説明", "", "", lblTextblocktbm03_var_desc_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A164TBM03_VAR_DESC", A164TBM03_VAR_DESC);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_VAR_DESC_Internalname, GXutil.rtrim( A164TBM03_VAR_DESC), GXutil.rtrim( localUtil.format( A164TBM03_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM03_VAR_DESC_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_VAR_DESC_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_sdtm_flg_Internalname, "SDTM定義フラグ", "", "", lblTextblocktbm03_sdtm_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A165TBM03_SDTM_FLG", A165TBM03_SDTM_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_SDTM_FLG_Internalname, GXutil.rtrim( A165TBM03_SDTM_FLG), GXutil.rtrim( localUtil.format( A165TBM03_SDTM_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM03_SDTM_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_SDTM_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_cdash_flg_Internalname, "CDASH定義フラグ", "", "", lblTextblocktbm03_cdash_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A166TBM03_CDASH_FLG", A166TBM03_CDASH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_CDASH_FLG_Internalname, GXutil.rtrim( A166TBM03_CDASH_FLG), GXutil.rtrim( localUtil.format( A166TBM03_CDASH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM03_CDASH_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_CDASH_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_input_type_div_Internalname, "入力値型区分", "", "", lblTextblocktbm03_input_type_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A410TBM03_INPUT_TYPE_DIV", A410TBM03_INPUT_TYPE_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_INPUT_TYPE_DIV_Internalname, GXutil.rtrim( A410TBM03_INPUT_TYPE_DIV), GXutil.rtrim( localUtil.format( A410TBM03_INPUT_TYPE_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM03_INPUT_TYPE_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_INPUT_TYPE_DIV_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_required_flg_Internalname, "必須入力フラグ", "", "", lblTextblocktbm03_required_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A167TBM03_REQUIRED_FLG", A167TBM03_REQUIRED_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_REQUIRED_FLG_Internalname, GXutil.rtrim( A167TBM03_REQUIRED_FLG), GXutil.rtrim( localUtil.format( A167TBM03_REQUIRED_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM03_REQUIRED_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_REQUIRED_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_sas_field_nm_Internalname, "SASフィールド名", "", "", lblTextblocktbm03_sas_field_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A602TBM03_SAS_FIELD_NM", A602TBM03_SAS_FIELD_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_SAS_FIELD_NM_Internalname, GXutil.rtrim( A602TBM03_SAS_FIELD_NM), GXutil.rtrim( localUtil.format( A602TBM03_SAS_FIELD_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM03_SAS_FIELD_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_SAS_FIELD_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_odm_data_type_Internalname, "ODMデータタイプ", "", "", lblTextblocktbm03_odm_data_type_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A624TBM03_ODM_DATA_TYPE", A624TBM03_ODM_DATA_TYPE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_ODM_DATA_TYPE_Internalname, GXutil.rtrim( A624TBM03_ODM_DATA_TYPE), GXutil.rtrim( localUtil.format( A624TBM03_ODM_DATA_TYPE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM03_ODM_DATA_TYPE_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_ODM_DATA_TYPE_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_note_Internalname, "備考", "", "", lblTextblocktbm03_note_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A168TBM03_NOTE", A168TBM03_NOTE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM03_NOTE_Internalname, GXutil.rtrim( A168TBM03_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", (short)(0), 1, edtTBM03_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_order_Internalname, "表示順", "", "", lblTextblocktbm03_order_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A169TBM03_ORDER", GXutil.ltrim( GXutil.str( A169TBM03_ORDER, 5, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A169TBM03_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBM03_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A169TBM03_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A169TBM03_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM03_ORDER_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_ORDER_Enabled, 0, 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_version_Internalname, "バージョン情報", "", "", lblTextblocktbm03_version_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A885TBM03_VERSION", A885TBM03_VERSION);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_VERSION_Internalname, GXutil.rtrim( A885TBM03_VERSION), GXutil.rtrim( localUtil.format( A885TBM03_VERSION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM03_VERSION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_VERSION_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm03_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A178TBM03_DEL_FLG", A178TBM03_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_DEL_FLG_Internalname, GXutil.rtrim( A178TBM03_DEL_FLG), GXutil.rtrim( localUtil.format( A178TBM03_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBM03_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm03_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A179TBM03_CRT_DATETIME", localUtil.ttoc( A179TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM03_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_CRT_DATETIME_Internalname, localUtil.format(A179TBM03_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A179TBM03_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(103);\"", "", "", "", "", edtTBM03_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM03_CDISC_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM03_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM03_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm03_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A180TBM03_CRT_USER_ID", A180TBM03_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_CRT_USER_ID_Internalname, GXutil.rtrim( A180TBM03_CRT_USER_ID), GXutil.rtrim( localUtil.format( A180TBM03_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtTBM03_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm03_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A181TBM03_CRT_PROG_NM", A181TBM03_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_CRT_PROG_NM_Internalname, GXutil.rtrim( A181TBM03_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A181TBM03_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtTBM03_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm03_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM03_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_UPD_DATETIME_Internalname, localUtil.format(A182TBM03_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A182TBM03_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(118);\"", "", "", "", "", edtTBM03_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM03_CDISC_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM03_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM03_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm03_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A183TBM03_UPD_USER_ID", A183TBM03_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_UPD_USER_ID_Internalname, GXutil.rtrim( A183TBM03_UPD_USER_ID), GXutil.rtrim( localUtil.format( A183TBM03_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(123);\"", "", "", "", "", edtTBM03_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm03_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A184TBM03_UPD_PROG_NM", A184TBM03_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_UPD_PROG_NM_Internalname, GXutil.rtrim( A184TBM03_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A184TBM03_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(128);\"", "", "", "", "", edtTBM03_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm03_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm03_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM03_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A185TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM03_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A185TBM03_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A185TBM03_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(133);\"", "", "", "", "", edtTBM03_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM03_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM03_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0F14e( true) ;
      }
      else
      {
         wb_table4_33_0F14e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM03_CDISC_ITEM.htm");
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
            A162TBM03_DOM_CD = httpContext.cgiGet( edtTBM03_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
            A163TBM03_DOM_VAR_NM = httpContext.cgiGet( edtTBM03_DOM_VAR_NM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
            A164TBM03_VAR_DESC = httpContext.cgiGet( edtTBM03_VAR_DESC_Internalname) ;
            n164TBM03_VAR_DESC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A164TBM03_VAR_DESC", A164TBM03_VAR_DESC);
            n164TBM03_VAR_DESC = ((GXutil.strcmp("", A164TBM03_VAR_DESC)==0) ? true : false) ;
            A165TBM03_SDTM_FLG = httpContext.cgiGet( edtTBM03_SDTM_FLG_Internalname) ;
            n165TBM03_SDTM_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A165TBM03_SDTM_FLG", A165TBM03_SDTM_FLG);
            n165TBM03_SDTM_FLG = ((GXutil.strcmp("", A165TBM03_SDTM_FLG)==0) ? true : false) ;
            A166TBM03_CDASH_FLG = httpContext.cgiGet( edtTBM03_CDASH_FLG_Internalname) ;
            n166TBM03_CDASH_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A166TBM03_CDASH_FLG", A166TBM03_CDASH_FLG);
            n166TBM03_CDASH_FLG = ((GXutil.strcmp("", A166TBM03_CDASH_FLG)==0) ? true : false) ;
            A410TBM03_INPUT_TYPE_DIV = httpContext.cgiGet( edtTBM03_INPUT_TYPE_DIV_Internalname) ;
            n410TBM03_INPUT_TYPE_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A410TBM03_INPUT_TYPE_DIV", A410TBM03_INPUT_TYPE_DIV);
            n410TBM03_INPUT_TYPE_DIV = ((GXutil.strcmp("", A410TBM03_INPUT_TYPE_DIV)==0) ? true : false) ;
            A167TBM03_REQUIRED_FLG = httpContext.cgiGet( edtTBM03_REQUIRED_FLG_Internalname) ;
            n167TBM03_REQUIRED_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A167TBM03_REQUIRED_FLG", A167TBM03_REQUIRED_FLG);
            n167TBM03_REQUIRED_FLG = ((GXutil.strcmp("", A167TBM03_REQUIRED_FLG)==0) ? true : false) ;
            A602TBM03_SAS_FIELD_NM = httpContext.cgiGet( edtTBM03_SAS_FIELD_NM_Internalname) ;
            n602TBM03_SAS_FIELD_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602TBM03_SAS_FIELD_NM", A602TBM03_SAS_FIELD_NM);
            n602TBM03_SAS_FIELD_NM = ((GXutil.strcmp("", A602TBM03_SAS_FIELD_NM)==0) ? true : false) ;
            A624TBM03_ODM_DATA_TYPE = httpContext.cgiGet( edtTBM03_ODM_DATA_TYPE_Internalname) ;
            n624TBM03_ODM_DATA_TYPE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A624TBM03_ODM_DATA_TYPE", A624TBM03_ODM_DATA_TYPE);
            n624TBM03_ODM_DATA_TYPE = ((GXutil.strcmp("", A624TBM03_ODM_DATA_TYPE)==0) ? true : false) ;
            A168TBM03_NOTE = httpContext.cgiGet( edtTBM03_NOTE_Internalname) ;
            n168TBM03_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A168TBM03_NOTE", A168TBM03_NOTE);
            n168TBM03_NOTE = ((GXutil.strcmp("", A168TBM03_NOTE)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM03_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM03_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM03_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM03_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A169TBM03_ORDER = 0 ;
               n169TBM03_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A169TBM03_ORDER", GXutil.ltrim( GXutil.str( A169TBM03_ORDER, 5, 0)));
            }
            else
            {
               A169TBM03_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM03_ORDER_Internalname), ".", ",")) ;
               n169TBM03_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A169TBM03_ORDER", GXutil.ltrim( GXutil.str( A169TBM03_ORDER, 5, 0)));
            }
            n169TBM03_ORDER = ((0==A169TBM03_ORDER) ? true : false) ;
            A885TBM03_VERSION = httpContext.cgiGet( edtTBM03_VERSION_Internalname) ;
            n885TBM03_VERSION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A885TBM03_VERSION", A885TBM03_VERSION);
            n885TBM03_VERSION = ((GXutil.strcmp("", A885TBM03_VERSION)==0) ? true : false) ;
            A178TBM03_DEL_FLG = httpContext.cgiGet( edtTBM03_DEL_FLG_Internalname) ;
            n178TBM03_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A178TBM03_DEL_FLG", A178TBM03_DEL_FLG);
            n178TBM03_DEL_FLG = ((GXutil.strcmp("", A178TBM03_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM03_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM03_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM03_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A179TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n179TBM03_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A179TBM03_CRT_DATETIME", localUtil.ttoc( A179TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A179TBM03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM03_CRT_DATETIME_Internalname)) ;
               n179TBM03_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A179TBM03_CRT_DATETIME", localUtil.ttoc( A179TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n179TBM03_CRT_DATETIME = (GXutil.nullDate().equals(A179TBM03_CRT_DATETIME) ? true : false) ;
            A180TBM03_CRT_USER_ID = httpContext.cgiGet( edtTBM03_CRT_USER_ID_Internalname) ;
            n180TBM03_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A180TBM03_CRT_USER_ID", A180TBM03_CRT_USER_ID);
            n180TBM03_CRT_USER_ID = ((GXutil.strcmp("", A180TBM03_CRT_USER_ID)==0) ? true : false) ;
            A181TBM03_CRT_PROG_NM = httpContext.cgiGet( edtTBM03_CRT_PROG_NM_Internalname) ;
            n181TBM03_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A181TBM03_CRT_PROG_NM", A181TBM03_CRT_PROG_NM);
            n181TBM03_CRT_PROG_NM = ((GXutil.strcmp("", A181TBM03_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM03_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM03_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM03_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A182TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n182TBM03_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A182TBM03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM03_UPD_DATETIME_Internalname)) ;
               n182TBM03_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n182TBM03_UPD_DATETIME = (GXutil.nullDate().equals(A182TBM03_UPD_DATETIME) ? true : false) ;
            A183TBM03_UPD_USER_ID = httpContext.cgiGet( edtTBM03_UPD_USER_ID_Internalname) ;
            n183TBM03_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A183TBM03_UPD_USER_ID", A183TBM03_UPD_USER_ID);
            n183TBM03_UPD_USER_ID = ((GXutil.strcmp("", A183TBM03_UPD_USER_ID)==0) ? true : false) ;
            A184TBM03_UPD_PROG_NM = httpContext.cgiGet( edtTBM03_UPD_PROG_NM_Internalname) ;
            n184TBM03_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A184TBM03_UPD_PROG_NM", A184TBM03_UPD_PROG_NM);
            n184TBM03_UPD_PROG_NM = ((GXutil.strcmp("", A184TBM03_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM03_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM03_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM03_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM03_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A185TBM03_UPD_CNT = 0 ;
               n185TBM03_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
            }
            else
            {
               A185TBM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM03_UPD_CNT_Internalname), ".", ",") ;
               n185TBM03_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
            }
            n185TBM03_UPD_CNT = ((0==A185TBM03_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z162TBM03_DOM_CD = httpContext.cgiGet( "Z162TBM03_DOM_CD") ;
            Z163TBM03_DOM_VAR_NM = httpContext.cgiGet( "Z163TBM03_DOM_VAR_NM") ;
            Z179TBM03_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z179TBM03_CRT_DATETIME"), 0) ;
            n179TBM03_CRT_DATETIME = (GXutil.nullDate().equals(A179TBM03_CRT_DATETIME) ? true : false) ;
            Z180TBM03_CRT_USER_ID = httpContext.cgiGet( "Z180TBM03_CRT_USER_ID") ;
            n180TBM03_CRT_USER_ID = ((GXutil.strcmp("", A180TBM03_CRT_USER_ID)==0) ? true : false) ;
            Z182TBM03_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z182TBM03_UPD_DATETIME"), 0) ;
            n182TBM03_UPD_DATETIME = (GXutil.nullDate().equals(A182TBM03_UPD_DATETIME) ? true : false) ;
            Z183TBM03_UPD_USER_ID = httpContext.cgiGet( "Z183TBM03_UPD_USER_ID") ;
            n183TBM03_UPD_USER_ID = ((GXutil.strcmp("", A183TBM03_UPD_USER_ID)==0) ? true : false) ;
            Z185TBM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z185TBM03_UPD_CNT"), ".", ",") ;
            n185TBM03_UPD_CNT = ((0==A185TBM03_UPD_CNT) ? true : false) ;
            Z164TBM03_VAR_DESC = httpContext.cgiGet( "Z164TBM03_VAR_DESC") ;
            n164TBM03_VAR_DESC = ((GXutil.strcmp("", A164TBM03_VAR_DESC)==0) ? true : false) ;
            Z165TBM03_SDTM_FLG = httpContext.cgiGet( "Z165TBM03_SDTM_FLG") ;
            n165TBM03_SDTM_FLG = ((GXutil.strcmp("", A165TBM03_SDTM_FLG)==0) ? true : false) ;
            Z166TBM03_CDASH_FLG = httpContext.cgiGet( "Z166TBM03_CDASH_FLG") ;
            n166TBM03_CDASH_FLG = ((GXutil.strcmp("", A166TBM03_CDASH_FLG)==0) ? true : false) ;
            Z410TBM03_INPUT_TYPE_DIV = httpContext.cgiGet( "Z410TBM03_INPUT_TYPE_DIV") ;
            n410TBM03_INPUT_TYPE_DIV = ((GXutil.strcmp("", A410TBM03_INPUT_TYPE_DIV)==0) ? true : false) ;
            Z167TBM03_REQUIRED_FLG = httpContext.cgiGet( "Z167TBM03_REQUIRED_FLG") ;
            n167TBM03_REQUIRED_FLG = ((GXutil.strcmp("", A167TBM03_REQUIRED_FLG)==0) ? true : false) ;
            Z602TBM03_SAS_FIELD_NM = httpContext.cgiGet( "Z602TBM03_SAS_FIELD_NM") ;
            n602TBM03_SAS_FIELD_NM = ((GXutil.strcmp("", A602TBM03_SAS_FIELD_NM)==0) ? true : false) ;
            Z624TBM03_ODM_DATA_TYPE = httpContext.cgiGet( "Z624TBM03_ODM_DATA_TYPE") ;
            n624TBM03_ODM_DATA_TYPE = ((GXutil.strcmp("", A624TBM03_ODM_DATA_TYPE)==0) ? true : false) ;
            Z168TBM03_NOTE = httpContext.cgiGet( "Z168TBM03_NOTE") ;
            n168TBM03_NOTE = ((GXutil.strcmp("", A168TBM03_NOTE)==0) ? true : false) ;
            Z169TBM03_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z169TBM03_ORDER"), ".", ",")) ;
            n169TBM03_ORDER = ((0==A169TBM03_ORDER) ? true : false) ;
            Z885TBM03_VERSION = httpContext.cgiGet( "Z885TBM03_VERSION") ;
            n885TBM03_VERSION = ((GXutil.strcmp("", A885TBM03_VERSION)==0) ? true : false) ;
            Z178TBM03_DEL_FLG = httpContext.cgiGet( "Z178TBM03_DEL_FLG") ;
            n178TBM03_DEL_FLG = ((GXutil.strcmp("", A178TBM03_DEL_FLG)==0) ? true : false) ;
            Z181TBM03_CRT_PROG_NM = httpContext.cgiGet( "Z181TBM03_CRT_PROG_NM") ;
            n181TBM03_CRT_PROG_NM = ((GXutil.strcmp("", A181TBM03_CRT_PROG_NM)==0) ? true : false) ;
            Z184TBM03_UPD_PROG_NM = httpContext.cgiGet( "Z184TBM03_UPD_PROG_NM") ;
            n184TBM03_UPD_PROG_NM = ((GXutil.strcmp("", A184TBM03_UPD_PROG_NM)==0) ? true : false) ;
            O185TBM03_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O185TBM03_UPD_CNT"), ".", ",") ;
            n185TBM03_UPD_CNT = ((0==A185TBM03_UPD_CNT) ? true : false) ;
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
               A162TBM03_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
               A163TBM03_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120F2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "ドメインコード:" + A162TBM03_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A163TBM03_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A164TBM03_VAR_DESC + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A165TBM03_SDTM_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A166TBM03_CDASH_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A410TBM03_INPUT_TYPE_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A167TBM03_REQUIRED_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A602TBM03_SAS_FIELD_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A168TBM03_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A169TBM03_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A178TBM03_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A179TBM03_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm03_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A179TBM03_CRT_DATETIME", localUtil.ttoc( A179TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A180TBM03_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A181TBM03_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A182TBM03_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm03_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A183TBM03_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A184TBM03_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1171( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0F14( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z179TBM03_CRT_DATETIME = T000F3_A179TBM03_CRT_DATETIME[0] ;
            Z180TBM03_CRT_USER_ID = T000F3_A180TBM03_CRT_USER_ID[0] ;
            Z182TBM03_UPD_DATETIME = T000F3_A182TBM03_UPD_DATETIME[0] ;
            Z183TBM03_UPD_USER_ID = T000F3_A183TBM03_UPD_USER_ID[0] ;
            Z185TBM03_UPD_CNT = T000F3_A185TBM03_UPD_CNT[0] ;
            Z164TBM03_VAR_DESC = T000F3_A164TBM03_VAR_DESC[0] ;
            Z165TBM03_SDTM_FLG = T000F3_A165TBM03_SDTM_FLG[0] ;
            Z166TBM03_CDASH_FLG = T000F3_A166TBM03_CDASH_FLG[0] ;
            Z410TBM03_INPUT_TYPE_DIV = T000F3_A410TBM03_INPUT_TYPE_DIV[0] ;
            Z167TBM03_REQUIRED_FLG = T000F3_A167TBM03_REQUIRED_FLG[0] ;
            Z602TBM03_SAS_FIELD_NM = T000F3_A602TBM03_SAS_FIELD_NM[0] ;
            Z624TBM03_ODM_DATA_TYPE = T000F3_A624TBM03_ODM_DATA_TYPE[0] ;
            Z168TBM03_NOTE = T000F3_A168TBM03_NOTE[0] ;
            Z169TBM03_ORDER = T000F3_A169TBM03_ORDER[0] ;
            Z885TBM03_VERSION = T000F3_A885TBM03_VERSION[0] ;
            Z178TBM03_DEL_FLG = T000F3_A178TBM03_DEL_FLG[0] ;
            Z181TBM03_CRT_PROG_NM = T000F3_A181TBM03_CRT_PROG_NM[0] ;
            Z184TBM03_UPD_PROG_NM = T000F3_A184TBM03_UPD_PROG_NM[0] ;
         }
         else
         {
            Z179TBM03_CRT_DATETIME = A179TBM03_CRT_DATETIME ;
            Z180TBM03_CRT_USER_ID = A180TBM03_CRT_USER_ID ;
            Z182TBM03_UPD_DATETIME = A182TBM03_UPD_DATETIME ;
            Z183TBM03_UPD_USER_ID = A183TBM03_UPD_USER_ID ;
            Z185TBM03_UPD_CNT = A185TBM03_UPD_CNT ;
            Z164TBM03_VAR_DESC = A164TBM03_VAR_DESC ;
            Z165TBM03_SDTM_FLG = A165TBM03_SDTM_FLG ;
            Z166TBM03_CDASH_FLG = A166TBM03_CDASH_FLG ;
            Z410TBM03_INPUT_TYPE_DIV = A410TBM03_INPUT_TYPE_DIV ;
            Z167TBM03_REQUIRED_FLG = A167TBM03_REQUIRED_FLG ;
            Z602TBM03_SAS_FIELD_NM = A602TBM03_SAS_FIELD_NM ;
            Z624TBM03_ODM_DATA_TYPE = A624TBM03_ODM_DATA_TYPE ;
            Z168TBM03_NOTE = A168TBM03_NOTE ;
            Z169TBM03_ORDER = A169TBM03_ORDER ;
            Z885TBM03_VERSION = A885TBM03_VERSION ;
            Z178TBM03_DEL_FLG = A178TBM03_DEL_FLG ;
            Z181TBM03_CRT_PROG_NM = A181TBM03_CRT_PROG_NM ;
            Z184TBM03_UPD_PROG_NM = A184TBM03_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z163TBM03_DOM_VAR_NM = A163TBM03_DOM_VAR_NM ;
         Z179TBM03_CRT_DATETIME = A179TBM03_CRT_DATETIME ;
         Z180TBM03_CRT_USER_ID = A180TBM03_CRT_USER_ID ;
         Z182TBM03_UPD_DATETIME = A182TBM03_UPD_DATETIME ;
         Z183TBM03_UPD_USER_ID = A183TBM03_UPD_USER_ID ;
         Z185TBM03_UPD_CNT = A185TBM03_UPD_CNT ;
         Z164TBM03_VAR_DESC = A164TBM03_VAR_DESC ;
         Z165TBM03_SDTM_FLG = A165TBM03_SDTM_FLG ;
         Z166TBM03_CDASH_FLG = A166TBM03_CDASH_FLG ;
         Z410TBM03_INPUT_TYPE_DIV = A410TBM03_INPUT_TYPE_DIV ;
         Z167TBM03_REQUIRED_FLG = A167TBM03_REQUIRED_FLG ;
         Z602TBM03_SAS_FIELD_NM = A602TBM03_SAS_FIELD_NM ;
         Z624TBM03_ODM_DATA_TYPE = A624TBM03_ODM_DATA_TYPE ;
         Z168TBM03_NOTE = A168TBM03_NOTE ;
         Z169TBM03_ORDER = A169TBM03_ORDER ;
         Z885TBM03_VERSION = A885TBM03_VERSION ;
         Z178TBM03_DEL_FLG = A178TBM03_DEL_FLG ;
         Z181TBM03_CRT_PROG_NM = A181TBM03_CRT_PROG_NM ;
         Z184TBM03_UPD_PROG_NM = A184TBM03_UPD_PROG_NM ;
         Z162TBM03_DOM_CD = A162TBM03_DOM_CD ;
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
      pr_default.execute(3, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A179TBM03_CRT_DATETIME = T000F5_A179TBM03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179TBM03_CRT_DATETIME", localUtil.ttoc( A179TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n179TBM03_CRT_DATETIME = T000F5_n179TBM03_CRT_DATETIME[0] ;
         A180TBM03_CRT_USER_ID = T000F5_A180TBM03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180TBM03_CRT_USER_ID", A180TBM03_CRT_USER_ID);
         n180TBM03_CRT_USER_ID = T000F5_n180TBM03_CRT_USER_ID[0] ;
         A182TBM03_UPD_DATETIME = T000F5_A182TBM03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n182TBM03_UPD_DATETIME = T000F5_n182TBM03_UPD_DATETIME[0] ;
         A183TBM03_UPD_USER_ID = T000F5_A183TBM03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183TBM03_UPD_USER_ID", A183TBM03_UPD_USER_ID);
         n183TBM03_UPD_USER_ID = T000F5_n183TBM03_UPD_USER_ID[0] ;
         A185TBM03_UPD_CNT = T000F5_A185TBM03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
         n185TBM03_UPD_CNT = T000F5_n185TBM03_UPD_CNT[0] ;
         A164TBM03_VAR_DESC = T000F5_A164TBM03_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164TBM03_VAR_DESC", A164TBM03_VAR_DESC);
         n164TBM03_VAR_DESC = T000F5_n164TBM03_VAR_DESC[0] ;
         A165TBM03_SDTM_FLG = T000F5_A165TBM03_SDTM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165TBM03_SDTM_FLG", A165TBM03_SDTM_FLG);
         n165TBM03_SDTM_FLG = T000F5_n165TBM03_SDTM_FLG[0] ;
         A166TBM03_CDASH_FLG = T000F5_A166TBM03_CDASH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166TBM03_CDASH_FLG", A166TBM03_CDASH_FLG);
         n166TBM03_CDASH_FLG = T000F5_n166TBM03_CDASH_FLG[0] ;
         A410TBM03_INPUT_TYPE_DIV = T000F5_A410TBM03_INPUT_TYPE_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A410TBM03_INPUT_TYPE_DIV", A410TBM03_INPUT_TYPE_DIV);
         n410TBM03_INPUT_TYPE_DIV = T000F5_n410TBM03_INPUT_TYPE_DIV[0] ;
         A167TBM03_REQUIRED_FLG = T000F5_A167TBM03_REQUIRED_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A167TBM03_REQUIRED_FLG", A167TBM03_REQUIRED_FLG);
         n167TBM03_REQUIRED_FLG = T000F5_n167TBM03_REQUIRED_FLG[0] ;
         A602TBM03_SAS_FIELD_NM = T000F5_A602TBM03_SAS_FIELD_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602TBM03_SAS_FIELD_NM", A602TBM03_SAS_FIELD_NM);
         n602TBM03_SAS_FIELD_NM = T000F5_n602TBM03_SAS_FIELD_NM[0] ;
         A624TBM03_ODM_DATA_TYPE = T000F5_A624TBM03_ODM_DATA_TYPE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624TBM03_ODM_DATA_TYPE", A624TBM03_ODM_DATA_TYPE);
         n624TBM03_ODM_DATA_TYPE = T000F5_n624TBM03_ODM_DATA_TYPE[0] ;
         A168TBM03_NOTE = T000F5_A168TBM03_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A168TBM03_NOTE", A168TBM03_NOTE);
         n168TBM03_NOTE = T000F5_n168TBM03_NOTE[0] ;
         A169TBM03_ORDER = T000F5_A169TBM03_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169TBM03_ORDER", GXutil.ltrim( GXutil.str( A169TBM03_ORDER, 5, 0)));
         n169TBM03_ORDER = T000F5_n169TBM03_ORDER[0] ;
         A885TBM03_VERSION = T000F5_A885TBM03_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A885TBM03_VERSION", A885TBM03_VERSION);
         n885TBM03_VERSION = T000F5_n885TBM03_VERSION[0] ;
         A178TBM03_DEL_FLG = T000F5_A178TBM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A178TBM03_DEL_FLG", A178TBM03_DEL_FLG);
         n178TBM03_DEL_FLG = T000F5_n178TBM03_DEL_FLG[0] ;
         A181TBM03_CRT_PROG_NM = T000F5_A181TBM03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A181TBM03_CRT_PROG_NM", A181TBM03_CRT_PROG_NM);
         n181TBM03_CRT_PROG_NM = T000F5_n181TBM03_CRT_PROG_NM[0] ;
         A184TBM03_UPD_PROG_NM = T000F5_A184TBM03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184TBM03_UPD_PROG_NM", A184TBM03_UPD_PROG_NM);
         n184TBM03_UPD_PROG_NM = T000F5_n184TBM03_UPD_PROG_NM[0] ;
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
      pr_default.execute(2, new Object[] {A162TBM03_DOM_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError162 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CDISC項目マスタ・ドメインサブタイプ'", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError162 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A179TBM03_CRT_DATETIME) || (( A179TBM03_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A179TBM03_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A182TBM03_UPD_DATETIME) || (( A182TBM03_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A182TBM03_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0F14( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A162TBM03_DOM_CD )
   {
      /* Using cursor T000F6 */
      pr_default.execute(4, new Object[] {A162TBM03_DOM_CD});
      if ( (pr_default.getStatus(4) == 101) )
      {
         AnyError162 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CDISC項目マスタ・ドメインサブタイプ'", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError162 == 0 )
      {
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(4);
   }

   public void getKey0F14( )
   {
      /* Using cursor T000F7 */
      pr_default.execute(5, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound14 = (short)(1) ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000F3 */
      pr_default.execute(1, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0F14( 8) ;
         RcdFound14 = (short)(1) ;
         A163TBM03_DOM_VAR_NM = T000F3_A163TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
         A179TBM03_CRT_DATETIME = T000F3_A179TBM03_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A179TBM03_CRT_DATETIME", localUtil.ttoc( A179TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n179TBM03_CRT_DATETIME = T000F3_n179TBM03_CRT_DATETIME[0] ;
         A180TBM03_CRT_USER_ID = T000F3_A180TBM03_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180TBM03_CRT_USER_ID", A180TBM03_CRT_USER_ID);
         n180TBM03_CRT_USER_ID = T000F3_n180TBM03_CRT_USER_ID[0] ;
         A182TBM03_UPD_DATETIME = T000F3_A182TBM03_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n182TBM03_UPD_DATETIME = T000F3_n182TBM03_UPD_DATETIME[0] ;
         A183TBM03_UPD_USER_ID = T000F3_A183TBM03_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183TBM03_UPD_USER_ID", A183TBM03_UPD_USER_ID);
         n183TBM03_UPD_USER_ID = T000F3_n183TBM03_UPD_USER_ID[0] ;
         A185TBM03_UPD_CNT = T000F3_A185TBM03_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
         n185TBM03_UPD_CNT = T000F3_n185TBM03_UPD_CNT[0] ;
         A164TBM03_VAR_DESC = T000F3_A164TBM03_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164TBM03_VAR_DESC", A164TBM03_VAR_DESC);
         n164TBM03_VAR_DESC = T000F3_n164TBM03_VAR_DESC[0] ;
         A165TBM03_SDTM_FLG = T000F3_A165TBM03_SDTM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165TBM03_SDTM_FLG", A165TBM03_SDTM_FLG);
         n165TBM03_SDTM_FLG = T000F3_n165TBM03_SDTM_FLG[0] ;
         A166TBM03_CDASH_FLG = T000F3_A166TBM03_CDASH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166TBM03_CDASH_FLG", A166TBM03_CDASH_FLG);
         n166TBM03_CDASH_FLG = T000F3_n166TBM03_CDASH_FLG[0] ;
         A410TBM03_INPUT_TYPE_DIV = T000F3_A410TBM03_INPUT_TYPE_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A410TBM03_INPUT_TYPE_DIV", A410TBM03_INPUT_TYPE_DIV);
         n410TBM03_INPUT_TYPE_DIV = T000F3_n410TBM03_INPUT_TYPE_DIV[0] ;
         A167TBM03_REQUIRED_FLG = T000F3_A167TBM03_REQUIRED_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A167TBM03_REQUIRED_FLG", A167TBM03_REQUIRED_FLG);
         n167TBM03_REQUIRED_FLG = T000F3_n167TBM03_REQUIRED_FLG[0] ;
         A602TBM03_SAS_FIELD_NM = T000F3_A602TBM03_SAS_FIELD_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602TBM03_SAS_FIELD_NM", A602TBM03_SAS_FIELD_NM);
         n602TBM03_SAS_FIELD_NM = T000F3_n602TBM03_SAS_FIELD_NM[0] ;
         A624TBM03_ODM_DATA_TYPE = T000F3_A624TBM03_ODM_DATA_TYPE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A624TBM03_ODM_DATA_TYPE", A624TBM03_ODM_DATA_TYPE);
         n624TBM03_ODM_DATA_TYPE = T000F3_n624TBM03_ODM_DATA_TYPE[0] ;
         A168TBM03_NOTE = T000F3_A168TBM03_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A168TBM03_NOTE", A168TBM03_NOTE);
         n168TBM03_NOTE = T000F3_n168TBM03_NOTE[0] ;
         A169TBM03_ORDER = T000F3_A169TBM03_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169TBM03_ORDER", GXutil.ltrim( GXutil.str( A169TBM03_ORDER, 5, 0)));
         n169TBM03_ORDER = T000F3_n169TBM03_ORDER[0] ;
         A885TBM03_VERSION = T000F3_A885TBM03_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A885TBM03_VERSION", A885TBM03_VERSION);
         n885TBM03_VERSION = T000F3_n885TBM03_VERSION[0] ;
         A178TBM03_DEL_FLG = T000F3_A178TBM03_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A178TBM03_DEL_FLG", A178TBM03_DEL_FLG);
         n178TBM03_DEL_FLG = T000F3_n178TBM03_DEL_FLG[0] ;
         A181TBM03_CRT_PROG_NM = T000F3_A181TBM03_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A181TBM03_CRT_PROG_NM", A181TBM03_CRT_PROG_NM);
         n181TBM03_CRT_PROG_NM = T000F3_n181TBM03_CRT_PROG_NM[0] ;
         A184TBM03_UPD_PROG_NM = T000F3_A184TBM03_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184TBM03_UPD_PROG_NM", A184TBM03_UPD_PROG_NM);
         n184TBM03_UPD_PROG_NM = T000F3_n184TBM03_UPD_PROG_NM[0] ;
         A162TBM03_DOM_CD = T000F3_A162TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
         O185TBM03_UPD_CNT = A185TBM03_UPD_CNT ;
         n185TBM03_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
         Z162TBM03_DOM_CD = A162TBM03_DOM_CD ;
         Z163TBM03_DOM_VAR_NM = A163TBM03_DOM_VAR_NM ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0F14( ) ;
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
      /* Using cursor T000F8 */
      pr_default.execute(6, new Object[] {A162TBM03_DOM_CD, A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000F8_A162TBM03_DOM_CD[0], A162TBM03_DOM_CD) < 0 ) || ( GXutil.strcmp(T000F8_A162TBM03_DOM_CD[0], A162TBM03_DOM_CD) == 0 ) && ( GXutil.strcmp(T000F8_A163TBM03_DOM_VAR_NM[0], A163TBM03_DOM_VAR_NM) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000F8_A162TBM03_DOM_CD[0], A162TBM03_DOM_CD) > 0 ) || ( GXutil.strcmp(T000F8_A162TBM03_DOM_CD[0], A162TBM03_DOM_CD) == 0 ) && ( GXutil.strcmp(T000F8_A163TBM03_DOM_VAR_NM[0], A163TBM03_DOM_VAR_NM) > 0 ) ) )
         {
            A162TBM03_DOM_CD = T000F8_A162TBM03_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
            A163TBM03_DOM_VAR_NM = T000F8_A163TBM03_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
            RcdFound14 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound14 = (short)(0) ;
      /* Using cursor T000F9 */
      pr_default.execute(7, new Object[] {A162TBM03_DOM_CD, A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000F9_A162TBM03_DOM_CD[0], A162TBM03_DOM_CD) > 0 ) || ( GXutil.strcmp(T000F9_A162TBM03_DOM_CD[0], A162TBM03_DOM_CD) == 0 ) && ( GXutil.strcmp(T000F9_A163TBM03_DOM_VAR_NM[0], A163TBM03_DOM_VAR_NM) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000F9_A162TBM03_DOM_CD[0], A162TBM03_DOM_CD) < 0 ) || ( GXutil.strcmp(T000F9_A162TBM03_DOM_CD[0], A162TBM03_DOM_CD) == 0 ) && ( GXutil.strcmp(T000F9_A163TBM03_DOM_VAR_NM[0], A163TBM03_DOM_VAR_NM) < 0 ) ) )
         {
            A162TBM03_DOM_CD = T000F9_A162TBM03_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
            A163TBM03_DOM_VAR_NM = T000F9_A163TBM03_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
            RcdFound14 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0F14( ) ;
      if ( RcdFound14 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM03_DOM_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A162TBM03_DOM_CD, Z162TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A163TBM03_DOM_VAR_NM, Z163TBM03_DOM_VAR_NM) != 0 ) )
         {
            A162TBM03_DOM_CD = Z162TBM03_DOM_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
            A163TBM03_DOM_VAR_NM = Z163TBM03_DOM_VAR_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
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
         if ( ( GXutil.strcmp(A162TBM03_DOM_CD, Z162TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A163TBM03_DOM_VAR_NM, Z163TBM03_DOM_VAR_NM) != 0 ) )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A162TBM03_DOM_CD, Z162TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A163TBM03_DOM_VAR_NM, Z163TBM03_DOM_VAR_NM) != 0 ) )
      {
         A162TBM03_DOM_CD = Z162TBM03_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
         A163TBM03_DOM_VAR_NM = Z163TBM03_DOM_VAR_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
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
      scanStart0F14( ) ;
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart0F14( ) ;
      if ( RcdFound14 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM03_CDISC_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z179TBM03_CRT_DATETIME.equals( T000F2_A179TBM03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z180TBM03_CRT_USER_ID, T000F2_A180TBM03_CRT_USER_ID[0]) != 0 ) || !( Z182TBM03_UPD_DATETIME.equals( T000F2_A182TBM03_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z183TBM03_UPD_USER_ID, T000F2_A183TBM03_UPD_USER_ID[0]) != 0 ) || ( Z185TBM03_UPD_CNT != T000F2_A185TBM03_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z164TBM03_VAR_DESC, T000F2_A164TBM03_VAR_DESC[0]) != 0 ) || ( GXutil.strcmp(Z165TBM03_SDTM_FLG, T000F2_A165TBM03_SDTM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z166TBM03_CDASH_FLG, T000F2_A166TBM03_CDASH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z410TBM03_INPUT_TYPE_DIV, T000F2_A410TBM03_INPUT_TYPE_DIV[0]) != 0 ) || ( GXutil.strcmp(Z167TBM03_REQUIRED_FLG, T000F2_A167TBM03_REQUIRED_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z602TBM03_SAS_FIELD_NM, T000F2_A602TBM03_SAS_FIELD_NM[0]) != 0 ) || ( GXutil.strcmp(Z624TBM03_ODM_DATA_TYPE, T000F2_A624TBM03_ODM_DATA_TYPE[0]) != 0 ) || ( GXutil.strcmp(Z168TBM03_NOTE, T000F2_A168TBM03_NOTE[0]) != 0 ) || ( Z169TBM03_ORDER != T000F2_A169TBM03_ORDER[0] ) || ( GXutil.strcmp(Z885TBM03_VERSION, T000F2_A885TBM03_VERSION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z178TBM03_DEL_FLG, T000F2_A178TBM03_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z181TBM03_CRT_PROG_NM, T000F2_A181TBM03_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z184TBM03_UPD_PROG_NM, T000F2_A184TBM03_UPD_PROG_NM[0]) != 0 ) )
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
                  /* Using cursor T000F10 */
                  pr_default.execute(8, new Object[] {A163TBM03_DOM_VAR_NM, new Boolean(n179TBM03_CRT_DATETIME), A179TBM03_CRT_DATETIME, new Boolean(n180TBM03_CRT_USER_ID), A180TBM03_CRT_USER_ID, new Boolean(n182TBM03_UPD_DATETIME), A182TBM03_UPD_DATETIME, new Boolean(n183TBM03_UPD_USER_ID), A183TBM03_UPD_USER_ID, new Boolean(n185TBM03_UPD_CNT), new Long(A185TBM03_UPD_CNT), new Boolean(n164TBM03_VAR_DESC), A164TBM03_VAR_DESC, new Boolean(n165TBM03_SDTM_FLG), A165TBM03_SDTM_FLG, new Boolean(n166TBM03_CDASH_FLG), A166TBM03_CDASH_FLG, new Boolean(n410TBM03_INPUT_TYPE_DIV), A410TBM03_INPUT_TYPE_DIV, new Boolean(n167TBM03_REQUIRED_FLG), A167TBM03_REQUIRED_FLG, new Boolean(n602TBM03_SAS_FIELD_NM), A602TBM03_SAS_FIELD_NM, new Boolean(n624TBM03_ODM_DATA_TYPE), A624TBM03_ODM_DATA_TYPE, new Boolean(n168TBM03_NOTE), A168TBM03_NOTE, new Boolean(n169TBM03_ORDER), new Integer(A169TBM03_ORDER), new Boolean(n885TBM03_VERSION), A885TBM03_VERSION, new Boolean(n178TBM03_DEL_FLG), A178TBM03_DEL_FLG, new Boolean(n181TBM03_CRT_PROG_NM), A181TBM03_CRT_PROG_NM, new Boolean(n184TBM03_UPD_PROG_NM), A184TBM03_UPD_PROG_NM, A162TBM03_DOM_CD});
                  if ( (pr_default.getStatus(8) == 1) )
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
                  /* Using cursor T000F11 */
                  pr_default.execute(9, new Object[] {new Boolean(n179TBM03_CRT_DATETIME), A179TBM03_CRT_DATETIME, new Boolean(n180TBM03_CRT_USER_ID), A180TBM03_CRT_USER_ID, new Boolean(n182TBM03_UPD_DATETIME), A182TBM03_UPD_DATETIME, new Boolean(n183TBM03_UPD_USER_ID), A183TBM03_UPD_USER_ID, new Boolean(n185TBM03_UPD_CNT), new Long(A185TBM03_UPD_CNT), new Boolean(n164TBM03_VAR_DESC), A164TBM03_VAR_DESC, new Boolean(n165TBM03_SDTM_FLG), A165TBM03_SDTM_FLG, new Boolean(n166TBM03_CDASH_FLG), A166TBM03_CDASH_FLG, new Boolean(n410TBM03_INPUT_TYPE_DIV), A410TBM03_INPUT_TYPE_DIV, new Boolean(n167TBM03_REQUIRED_FLG), A167TBM03_REQUIRED_FLG, new Boolean(n602TBM03_SAS_FIELD_NM), A602TBM03_SAS_FIELD_NM, new Boolean(n624TBM03_ODM_DATA_TYPE), A624TBM03_ODM_DATA_TYPE, new Boolean(n168TBM03_NOTE), A168TBM03_NOTE, new Boolean(n169TBM03_ORDER), new Integer(A169TBM03_ORDER), new Boolean(n885TBM03_VERSION), A885TBM03_VERSION, new Boolean(n178TBM03_DEL_FLG), A178TBM03_DEL_FLG, new Boolean(n181TBM03_CRT_PROG_NM), A181TBM03_CRT_PROG_NM, new Boolean(n184TBM03_UPD_PROG_NM), A184TBM03_UPD_PROG_NM, A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
                  if ( (pr_default.getStatus(9) == 103) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               /* Using cursor T000F12 */
               pr_default.execute(10, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
      /* Using cursor T000F13 */
      pr_default.execute(11);
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A162TBM03_DOM_CD = T000F13_A162TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
         A163TBM03_DOM_VAR_NM = T000F13_A163TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0F14( )
   {
      pr_default.readNext(11);
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A162TBM03_DOM_CD = T000F13_A162TBM03_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
         A163TBM03_DOM_VAR_NM = T000F13_A163TBM03_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
      }
   }

   public void scanEnd0F14( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0F14( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0F14( )
   {
      /* Before Insert Rules */
      A179TBM03_CRT_DATETIME = GXutil.now( ) ;
      n179TBM03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A179TBM03_CRT_DATETIME", localUtil.ttoc( A179TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A180TBM03_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm03_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A180TBM03_CRT_USER_ID = GXt_char3 ;
      n180TBM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A180TBM03_CRT_USER_ID", A180TBM03_CRT_USER_ID);
      A182TBM03_UPD_DATETIME = GXutil.now( ) ;
      n182TBM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A183TBM03_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm03_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A183TBM03_UPD_USER_ID = GXt_char3 ;
      n183TBM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A183TBM03_UPD_USER_ID", A183TBM03_UPD_USER_ID);
      A185TBM03_UPD_CNT = (long)(O185TBM03_UPD_CNT+1) ;
      n185TBM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0F14( )
   {
      /* Before Update Rules */
      A182TBM03_UPD_DATETIME = GXutil.now( ) ;
      n182TBM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A183TBM03_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm03_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A183TBM03_UPD_USER_ID = GXt_char3 ;
      n183TBM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A183TBM03_UPD_USER_ID", A183TBM03_UPD_USER_ID);
      A185TBM03_UPD_CNT = (long)(O185TBM03_UPD_CNT+1) ;
      n185TBM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CDISC項目マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm03_cdisc_item") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0F14( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z162TBM03_DOM_CD", GXutil.rtrim( Z162TBM03_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z163TBM03_DOM_VAR_NM", GXutil.rtrim( Z163TBM03_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z179TBM03_CRT_DATETIME", localUtil.ttoc( Z179TBM03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z180TBM03_CRT_USER_ID", GXutil.rtrim( Z180TBM03_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z182TBM03_UPD_DATETIME", localUtil.ttoc( Z182TBM03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z183TBM03_UPD_USER_ID", GXutil.rtrim( Z183TBM03_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z185TBM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z185TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z164TBM03_VAR_DESC", GXutil.rtrim( Z164TBM03_VAR_DESC));
      GxWebStd.gx_hidden_field( httpContext, "Z165TBM03_SDTM_FLG", GXutil.rtrim( Z165TBM03_SDTM_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z166TBM03_CDASH_FLG", GXutil.rtrim( Z166TBM03_CDASH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z410TBM03_INPUT_TYPE_DIV", GXutil.rtrim( Z410TBM03_INPUT_TYPE_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z167TBM03_REQUIRED_FLG", GXutil.rtrim( Z167TBM03_REQUIRED_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z602TBM03_SAS_FIELD_NM", GXutil.rtrim( Z602TBM03_SAS_FIELD_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z624TBM03_ODM_DATA_TYPE", GXutil.rtrim( Z624TBM03_ODM_DATA_TYPE));
      GxWebStd.gx_hidden_field( httpContext, "Z168TBM03_NOTE", GXutil.rtrim( Z168TBM03_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z169TBM03_ORDER", GXutil.ltrim( localUtil.ntoc( Z169TBM03_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z885TBM03_VERSION", GXutil.rtrim( Z885TBM03_VERSION));
      GxWebStd.gx_hidden_field( httpContext, "Z178TBM03_DEL_FLG", GXutil.rtrim( Z178TBM03_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z181TBM03_CRT_PROG_NM", GXutil.rtrim( Z181TBM03_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z184TBM03_UPD_PROG_NM", GXutil.rtrim( Z184TBM03_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O185TBM03_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O185TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0F14( )
   {
      A179TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n179TBM03_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A179TBM03_CRT_DATETIME", localUtil.ttoc( A179TBM03_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n179TBM03_CRT_DATETIME = (GXutil.nullDate().equals(A179TBM03_CRT_DATETIME) ? true : false) ;
      A180TBM03_CRT_USER_ID = "" ;
      n180TBM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A180TBM03_CRT_USER_ID", A180TBM03_CRT_USER_ID);
      n180TBM03_CRT_USER_ID = ((GXutil.strcmp("", A180TBM03_CRT_USER_ID)==0) ? true : false) ;
      A182TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n182TBM03_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A182TBM03_UPD_DATETIME", localUtil.ttoc( A182TBM03_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n182TBM03_UPD_DATETIME = (GXutil.nullDate().equals(A182TBM03_UPD_DATETIME) ? true : false) ;
      A183TBM03_UPD_USER_ID = "" ;
      n183TBM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A183TBM03_UPD_USER_ID", A183TBM03_UPD_USER_ID);
      n183TBM03_UPD_USER_ID = ((GXutil.strcmp("", A183TBM03_UPD_USER_ID)==0) ? true : false) ;
      A185TBM03_UPD_CNT = 0 ;
      n185TBM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
      n185TBM03_UPD_CNT = ((0==A185TBM03_UPD_CNT) ? true : false) ;
      A164TBM03_VAR_DESC = "" ;
      n164TBM03_VAR_DESC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A164TBM03_VAR_DESC", A164TBM03_VAR_DESC);
      n164TBM03_VAR_DESC = ((GXutil.strcmp("", A164TBM03_VAR_DESC)==0) ? true : false) ;
      A165TBM03_SDTM_FLG = "" ;
      n165TBM03_SDTM_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A165TBM03_SDTM_FLG", A165TBM03_SDTM_FLG);
      n165TBM03_SDTM_FLG = ((GXutil.strcmp("", A165TBM03_SDTM_FLG)==0) ? true : false) ;
      A166TBM03_CDASH_FLG = "" ;
      n166TBM03_CDASH_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A166TBM03_CDASH_FLG", A166TBM03_CDASH_FLG);
      n166TBM03_CDASH_FLG = ((GXutil.strcmp("", A166TBM03_CDASH_FLG)==0) ? true : false) ;
      A410TBM03_INPUT_TYPE_DIV = "" ;
      n410TBM03_INPUT_TYPE_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A410TBM03_INPUT_TYPE_DIV", A410TBM03_INPUT_TYPE_DIV);
      n410TBM03_INPUT_TYPE_DIV = ((GXutil.strcmp("", A410TBM03_INPUT_TYPE_DIV)==0) ? true : false) ;
      A167TBM03_REQUIRED_FLG = "" ;
      n167TBM03_REQUIRED_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A167TBM03_REQUIRED_FLG", A167TBM03_REQUIRED_FLG);
      n167TBM03_REQUIRED_FLG = ((GXutil.strcmp("", A167TBM03_REQUIRED_FLG)==0) ? true : false) ;
      A602TBM03_SAS_FIELD_NM = "" ;
      n602TBM03_SAS_FIELD_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602TBM03_SAS_FIELD_NM", A602TBM03_SAS_FIELD_NM);
      n602TBM03_SAS_FIELD_NM = ((GXutil.strcmp("", A602TBM03_SAS_FIELD_NM)==0) ? true : false) ;
      A624TBM03_ODM_DATA_TYPE = "" ;
      n624TBM03_ODM_DATA_TYPE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A624TBM03_ODM_DATA_TYPE", A624TBM03_ODM_DATA_TYPE);
      n624TBM03_ODM_DATA_TYPE = ((GXutil.strcmp("", A624TBM03_ODM_DATA_TYPE)==0) ? true : false) ;
      A168TBM03_NOTE = "" ;
      n168TBM03_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A168TBM03_NOTE", A168TBM03_NOTE);
      n168TBM03_NOTE = ((GXutil.strcmp("", A168TBM03_NOTE)==0) ? true : false) ;
      A169TBM03_ORDER = 0 ;
      n169TBM03_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A169TBM03_ORDER", GXutil.ltrim( GXutil.str( A169TBM03_ORDER, 5, 0)));
      n169TBM03_ORDER = ((0==A169TBM03_ORDER) ? true : false) ;
      A885TBM03_VERSION = "" ;
      n885TBM03_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A885TBM03_VERSION", A885TBM03_VERSION);
      n885TBM03_VERSION = ((GXutil.strcmp("", A885TBM03_VERSION)==0) ? true : false) ;
      A178TBM03_DEL_FLG = "" ;
      n178TBM03_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A178TBM03_DEL_FLG", A178TBM03_DEL_FLG);
      n178TBM03_DEL_FLG = ((GXutil.strcmp("", A178TBM03_DEL_FLG)==0) ? true : false) ;
      A181TBM03_CRT_PROG_NM = "" ;
      n181TBM03_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A181TBM03_CRT_PROG_NM", A181TBM03_CRT_PROG_NM);
      n181TBM03_CRT_PROG_NM = ((GXutil.strcmp("", A181TBM03_CRT_PROG_NM)==0) ? true : false) ;
      A184TBM03_UPD_PROG_NM = "" ;
      n184TBM03_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A184TBM03_UPD_PROG_NM", A184TBM03_UPD_PROG_NM);
      n184TBM03_UPD_PROG_NM = ((GXutil.strcmp("", A184TBM03_UPD_PROG_NM)==0) ? true : false) ;
      O185TBM03_UPD_CNT = A185TBM03_UPD_CNT ;
      n185TBM03_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A185TBM03_UPD_CNT", GXutil.ltrim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)));
   }

   public void initAll0F14( )
   {
      A162TBM03_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A162TBM03_DOM_CD", A162TBM03_DOM_CD);
      A163TBM03_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A163TBM03_DOM_VAR_NM", A163TBM03_DOM_VAR_NM);
      initializeNonKey0F14( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14542193");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm03_cdisc_item.js", "?14542193");
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
      GXt_char3 = A180TBM03_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm03_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A180TBM03_CRT_USER_ID = GXt_char3 ;
      n180TBM03_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A180TBM03_CRT_USER_ID", A180TBM03_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A180TBM03_CRT_USER_ID))+"\"");
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
      GXt_char3 = A183TBM03_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm03_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A183TBM03_UPD_USER_ID = GXt_char3 ;
      n183TBM03_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A183TBM03_UPD_USER_ID", A183TBM03_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A183TBM03_UPD_USER_ID))+"\"");
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
      /* Using cursor T000F14 */
      pr_default.execute(12, new Object[] {A162TBM03_DOM_CD});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError162 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CDISC項目マスタ・ドメインサブタイプ'", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError162 == 0 )
      {
      }
      pr_default.close(12);
      GX_FocusControl = edtTBM03_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm03_dom_cd( String GX_Parm1 )
   {
      A162TBM03_DOM_CD = GX_Parm1 ;
      /* Using cursor T000F14 */
      pr_default.execute(12, new Object[] {A162TBM03_DOM_CD});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError162 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CDISC項目マスタ・ドメインサブタイプ'", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM03_DOM_CD_Internalname ;
      }
      if ( AnyError162 == 0 )
      {
      }
      pr_default.close(12);
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
      A162TBM03_DOM_CD = GX_Parm1 ;
      A163TBM03_DOM_VAR_NM = GX_Parm2 ;
      A179TBM03_CRT_DATETIME = GX_Parm3 ;
      n179TBM03_CRT_DATETIME = false ;
      A180TBM03_CRT_USER_ID = GX_Parm4 ;
      n180TBM03_CRT_USER_ID = false ;
      A182TBM03_UPD_DATETIME = GX_Parm5 ;
      n182TBM03_UPD_DATETIME = false ;
      A183TBM03_UPD_USER_ID = GX_Parm6 ;
      n183TBM03_UPD_USER_ID = false ;
      A185TBM03_UPD_CNT = GX_Parm7 ;
      n185TBM03_UPD_CNT = false ;
      A164TBM03_VAR_DESC = GX_Parm8 ;
      n164TBM03_VAR_DESC = false ;
      A165TBM03_SDTM_FLG = GX_Parm9 ;
      n165TBM03_SDTM_FLG = false ;
      A166TBM03_CDASH_FLG = GX_Parm10 ;
      n166TBM03_CDASH_FLG = false ;
      A410TBM03_INPUT_TYPE_DIV = GX_Parm11 ;
      n410TBM03_INPUT_TYPE_DIV = false ;
      A167TBM03_REQUIRED_FLG = GX_Parm12 ;
      n167TBM03_REQUIRED_FLG = false ;
      A602TBM03_SAS_FIELD_NM = GX_Parm13 ;
      n602TBM03_SAS_FIELD_NM = false ;
      A624TBM03_ODM_DATA_TYPE = GX_Parm14 ;
      n624TBM03_ODM_DATA_TYPE = false ;
      A168TBM03_NOTE = GX_Parm15 ;
      n168TBM03_NOTE = false ;
      A169TBM03_ORDER = GX_Parm16 ;
      n169TBM03_ORDER = false ;
      A885TBM03_VERSION = GX_Parm17 ;
      n885TBM03_VERSION = false ;
      A178TBM03_DEL_FLG = GX_Parm18 ;
      n178TBM03_DEL_FLG = false ;
      A181TBM03_CRT_PROG_NM = GX_Parm19 ;
      n181TBM03_CRT_PROG_NM = false ;
      A184TBM03_UPD_PROG_NM = GX_Parm20 ;
      n184TBM03_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A179TBM03_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A180TBM03_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A182TBM03_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A183TBM03_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A185TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A164TBM03_VAR_DESC));
      isValidOutput.add(GXutil.rtrim( A165TBM03_SDTM_FLG));
      isValidOutput.add(GXutil.rtrim( A166TBM03_CDASH_FLG));
      isValidOutput.add(GXutil.rtrim( A410TBM03_INPUT_TYPE_DIV));
      isValidOutput.add(GXutil.rtrim( A167TBM03_REQUIRED_FLG));
      isValidOutput.add(GXutil.rtrim( A602TBM03_SAS_FIELD_NM));
      isValidOutput.add(GXutil.rtrim( A624TBM03_ODM_DATA_TYPE));
      isValidOutput.add(GXutil.rtrim( A168TBM03_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A169TBM03_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A885TBM03_VERSION));
      isValidOutput.add(GXutil.rtrim( A178TBM03_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A181TBM03_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A184TBM03_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z162TBM03_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z163TBM03_DOM_VAR_NM));
      isValidOutput.add(localUtil.ttoc( Z179TBM03_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z180TBM03_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z182TBM03_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z183TBM03_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z185TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z164TBM03_VAR_DESC));
      isValidOutput.add(GXutil.rtrim( Z165TBM03_SDTM_FLG));
      isValidOutput.add(GXutil.rtrim( Z166TBM03_CDASH_FLG));
      isValidOutput.add(GXutil.rtrim( Z410TBM03_INPUT_TYPE_DIV));
      isValidOutput.add(GXutil.rtrim( Z167TBM03_REQUIRED_FLG));
      isValidOutput.add(GXutil.rtrim( Z602TBM03_SAS_FIELD_NM));
      isValidOutput.add(GXutil.rtrim( Z624TBM03_ODM_DATA_TYPE));
      isValidOutput.add(GXutil.rtrim( Z168TBM03_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z169TBM03_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z885TBM03_VERSION));
      isValidOutput.add(GXutil.rtrim( Z178TBM03_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z181TBM03_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z184TBM03_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O185TBM03_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      pr_default.close(12);
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
                  /* Execute user subroutine: S1171 */
                  S1171 ();
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
      A162TBM03_DOM_CD = "" ;
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
      A163TBM03_DOM_VAR_NM = "" ;
      lblTextblocktbm03_var_desc_Jsonclick = "" ;
      A164TBM03_VAR_DESC = "" ;
      lblTextblocktbm03_sdtm_flg_Jsonclick = "" ;
      A165TBM03_SDTM_FLG = "" ;
      lblTextblocktbm03_cdash_flg_Jsonclick = "" ;
      A166TBM03_CDASH_FLG = "" ;
      lblTextblocktbm03_input_type_div_Jsonclick = "" ;
      A410TBM03_INPUT_TYPE_DIV = "" ;
      lblTextblocktbm03_required_flg_Jsonclick = "" ;
      A167TBM03_REQUIRED_FLG = "" ;
      lblTextblocktbm03_sas_field_nm_Jsonclick = "" ;
      A602TBM03_SAS_FIELD_NM = "" ;
      lblTextblocktbm03_odm_data_type_Jsonclick = "" ;
      A624TBM03_ODM_DATA_TYPE = "" ;
      lblTextblocktbm03_note_Jsonclick = "" ;
      A168TBM03_NOTE = "" ;
      lblTextblocktbm03_order_Jsonclick = "" ;
      lblTextblocktbm03_version_Jsonclick = "" ;
      A885TBM03_VERSION = "" ;
      lblTextblocktbm03_del_flg_Jsonclick = "" ;
      A178TBM03_DEL_FLG = "" ;
      lblTextblocktbm03_crt_datetime_Jsonclick = "" ;
      A179TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm03_crt_user_id_Jsonclick = "" ;
      A180TBM03_CRT_USER_ID = "" ;
      lblTextblocktbm03_crt_prog_nm_Jsonclick = "" ;
      A181TBM03_CRT_PROG_NM = "" ;
      lblTextblocktbm03_upd_datetime_Jsonclick = "" ;
      A182TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm03_upd_user_id_Jsonclick = "" ;
      A183TBM03_UPD_USER_ID = "" ;
      lblTextblocktbm03_upd_prog_nm_Jsonclick = "" ;
      A184TBM03_UPD_PROG_NM = "" ;
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
      Z162TBM03_DOM_CD = "" ;
      Z163TBM03_DOM_VAR_NM = "" ;
      Z179TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z180TBM03_CRT_USER_ID = "" ;
      Z182TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z183TBM03_UPD_USER_ID = "" ;
      Z164TBM03_VAR_DESC = "" ;
      Z165TBM03_SDTM_FLG = "" ;
      Z166TBM03_CDASH_FLG = "" ;
      Z410TBM03_INPUT_TYPE_DIV = "" ;
      Z167TBM03_REQUIRED_FLG = "" ;
      Z602TBM03_SAS_FIELD_NM = "" ;
      Z624TBM03_ODM_DATA_TYPE = "" ;
      Z168TBM03_NOTE = "" ;
      Z885TBM03_VERSION = "" ;
      Z178TBM03_DEL_FLG = "" ;
      Z181TBM03_CRT_PROG_NM = "" ;
      Z184TBM03_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000F5_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F5_A179TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F5_n179TBM03_CRT_DATETIME = new boolean[] {false} ;
      T000F5_A180TBM03_CRT_USER_ID = new String[] {""} ;
      T000F5_n180TBM03_CRT_USER_ID = new boolean[] {false} ;
      T000F5_A182TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F5_n182TBM03_UPD_DATETIME = new boolean[] {false} ;
      T000F5_A183TBM03_UPD_USER_ID = new String[] {""} ;
      T000F5_n183TBM03_UPD_USER_ID = new boolean[] {false} ;
      T000F5_A185TBM03_UPD_CNT = new long[1] ;
      T000F5_n185TBM03_UPD_CNT = new boolean[] {false} ;
      T000F5_A164TBM03_VAR_DESC = new String[] {""} ;
      T000F5_n164TBM03_VAR_DESC = new boolean[] {false} ;
      T000F5_A165TBM03_SDTM_FLG = new String[] {""} ;
      T000F5_n165TBM03_SDTM_FLG = new boolean[] {false} ;
      T000F5_A166TBM03_CDASH_FLG = new String[] {""} ;
      T000F5_n166TBM03_CDASH_FLG = new boolean[] {false} ;
      T000F5_A410TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      T000F5_n410TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      T000F5_A167TBM03_REQUIRED_FLG = new String[] {""} ;
      T000F5_n167TBM03_REQUIRED_FLG = new boolean[] {false} ;
      T000F5_A602TBM03_SAS_FIELD_NM = new String[] {""} ;
      T000F5_n602TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      T000F5_A624TBM03_ODM_DATA_TYPE = new String[] {""} ;
      T000F5_n624TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      T000F5_A168TBM03_NOTE = new String[] {""} ;
      T000F5_n168TBM03_NOTE = new boolean[] {false} ;
      T000F5_A169TBM03_ORDER = new int[1] ;
      T000F5_n169TBM03_ORDER = new boolean[] {false} ;
      T000F5_A885TBM03_VERSION = new String[] {""} ;
      T000F5_n885TBM03_VERSION = new boolean[] {false} ;
      T000F5_A178TBM03_DEL_FLG = new String[] {""} ;
      T000F5_n178TBM03_DEL_FLG = new boolean[] {false} ;
      T000F5_A181TBM03_CRT_PROG_NM = new String[] {""} ;
      T000F5_n181TBM03_CRT_PROG_NM = new boolean[] {false} ;
      T000F5_A184TBM03_UPD_PROG_NM = new String[] {""} ;
      T000F5_n184TBM03_UPD_PROG_NM = new boolean[] {false} ;
      T000F5_A162TBM03_DOM_CD = new String[] {""} ;
      T000F4_A162TBM03_DOM_CD = new String[] {""} ;
      T000F6_A162TBM03_DOM_CD = new String[] {""} ;
      T000F7_A162TBM03_DOM_CD = new String[] {""} ;
      T000F7_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F3_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F3_A179TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F3_n179TBM03_CRT_DATETIME = new boolean[] {false} ;
      T000F3_A180TBM03_CRT_USER_ID = new String[] {""} ;
      T000F3_n180TBM03_CRT_USER_ID = new boolean[] {false} ;
      T000F3_A182TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F3_n182TBM03_UPD_DATETIME = new boolean[] {false} ;
      T000F3_A183TBM03_UPD_USER_ID = new String[] {""} ;
      T000F3_n183TBM03_UPD_USER_ID = new boolean[] {false} ;
      T000F3_A185TBM03_UPD_CNT = new long[1] ;
      T000F3_n185TBM03_UPD_CNT = new boolean[] {false} ;
      T000F3_A164TBM03_VAR_DESC = new String[] {""} ;
      T000F3_n164TBM03_VAR_DESC = new boolean[] {false} ;
      T000F3_A165TBM03_SDTM_FLG = new String[] {""} ;
      T000F3_n165TBM03_SDTM_FLG = new boolean[] {false} ;
      T000F3_A166TBM03_CDASH_FLG = new String[] {""} ;
      T000F3_n166TBM03_CDASH_FLG = new boolean[] {false} ;
      T000F3_A410TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      T000F3_n410TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      T000F3_A167TBM03_REQUIRED_FLG = new String[] {""} ;
      T000F3_n167TBM03_REQUIRED_FLG = new boolean[] {false} ;
      T000F3_A602TBM03_SAS_FIELD_NM = new String[] {""} ;
      T000F3_n602TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      T000F3_A624TBM03_ODM_DATA_TYPE = new String[] {""} ;
      T000F3_n624TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      T000F3_A168TBM03_NOTE = new String[] {""} ;
      T000F3_n168TBM03_NOTE = new boolean[] {false} ;
      T000F3_A169TBM03_ORDER = new int[1] ;
      T000F3_n169TBM03_ORDER = new boolean[] {false} ;
      T000F3_A885TBM03_VERSION = new String[] {""} ;
      T000F3_n885TBM03_VERSION = new boolean[] {false} ;
      T000F3_A178TBM03_DEL_FLG = new String[] {""} ;
      T000F3_n178TBM03_DEL_FLG = new boolean[] {false} ;
      T000F3_A181TBM03_CRT_PROG_NM = new String[] {""} ;
      T000F3_n181TBM03_CRT_PROG_NM = new boolean[] {false} ;
      T000F3_A184TBM03_UPD_PROG_NM = new String[] {""} ;
      T000F3_n184TBM03_UPD_PROG_NM = new boolean[] {false} ;
      T000F3_A162TBM03_DOM_CD = new String[] {""} ;
      sMode14 = "" ;
      T000F8_A162TBM03_DOM_CD = new String[] {""} ;
      T000F8_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F9_A162TBM03_DOM_CD = new String[] {""} ;
      T000F9_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F2_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      T000F2_A179TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F2_n179TBM03_CRT_DATETIME = new boolean[] {false} ;
      T000F2_A180TBM03_CRT_USER_ID = new String[] {""} ;
      T000F2_n180TBM03_CRT_USER_ID = new boolean[] {false} ;
      T000F2_A182TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000F2_n182TBM03_UPD_DATETIME = new boolean[] {false} ;
      T000F2_A183TBM03_UPD_USER_ID = new String[] {""} ;
      T000F2_n183TBM03_UPD_USER_ID = new boolean[] {false} ;
      T000F2_A185TBM03_UPD_CNT = new long[1] ;
      T000F2_n185TBM03_UPD_CNT = new boolean[] {false} ;
      T000F2_A164TBM03_VAR_DESC = new String[] {""} ;
      T000F2_n164TBM03_VAR_DESC = new boolean[] {false} ;
      T000F2_A165TBM03_SDTM_FLG = new String[] {""} ;
      T000F2_n165TBM03_SDTM_FLG = new boolean[] {false} ;
      T000F2_A166TBM03_CDASH_FLG = new String[] {""} ;
      T000F2_n166TBM03_CDASH_FLG = new boolean[] {false} ;
      T000F2_A410TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      T000F2_n410TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      T000F2_A167TBM03_REQUIRED_FLG = new String[] {""} ;
      T000F2_n167TBM03_REQUIRED_FLG = new boolean[] {false} ;
      T000F2_A602TBM03_SAS_FIELD_NM = new String[] {""} ;
      T000F2_n602TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      T000F2_A624TBM03_ODM_DATA_TYPE = new String[] {""} ;
      T000F2_n624TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      T000F2_A168TBM03_NOTE = new String[] {""} ;
      T000F2_n168TBM03_NOTE = new boolean[] {false} ;
      T000F2_A169TBM03_ORDER = new int[1] ;
      T000F2_n169TBM03_ORDER = new boolean[] {false} ;
      T000F2_A885TBM03_VERSION = new String[] {""} ;
      T000F2_n885TBM03_VERSION = new boolean[] {false} ;
      T000F2_A178TBM03_DEL_FLG = new String[] {""} ;
      T000F2_n178TBM03_DEL_FLG = new boolean[] {false} ;
      T000F2_A181TBM03_CRT_PROG_NM = new String[] {""} ;
      T000F2_n181TBM03_CRT_PROG_NM = new boolean[] {false} ;
      T000F2_A184TBM03_UPD_PROG_NM = new String[] {""} ;
      T000F2_n184TBM03_UPD_PROG_NM = new boolean[] {false} ;
      T000F2_A162TBM03_DOM_CD = new String[] {""} ;
      T000F13_A162TBM03_DOM_CD = new String[] {""} ;
      T000F13_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000F14_A162TBM03_DOM_CD = new String[] {""} ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm03_cdisc_item__default(),
         new Object[] {
             new Object[] {
            T000F2_A163TBM03_DOM_VAR_NM, T000F2_A179TBM03_CRT_DATETIME, T000F2_n179TBM03_CRT_DATETIME, T000F2_A180TBM03_CRT_USER_ID, T000F2_n180TBM03_CRT_USER_ID, T000F2_A182TBM03_UPD_DATETIME, T000F2_n182TBM03_UPD_DATETIME, T000F2_A183TBM03_UPD_USER_ID, T000F2_n183TBM03_UPD_USER_ID, T000F2_A185TBM03_UPD_CNT,
            T000F2_n185TBM03_UPD_CNT, T000F2_A164TBM03_VAR_DESC, T000F2_n164TBM03_VAR_DESC, T000F2_A165TBM03_SDTM_FLG, T000F2_n165TBM03_SDTM_FLG, T000F2_A166TBM03_CDASH_FLG, T000F2_n166TBM03_CDASH_FLG, T000F2_A410TBM03_INPUT_TYPE_DIV, T000F2_n410TBM03_INPUT_TYPE_DIV, T000F2_A167TBM03_REQUIRED_FLG,
            T000F2_n167TBM03_REQUIRED_FLG, T000F2_A602TBM03_SAS_FIELD_NM, T000F2_n602TBM03_SAS_FIELD_NM, T000F2_A624TBM03_ODM_DATA_TYPE, T000F2_n624TBM03_ODM_DATA_TYPE, T000F2_A168TBM03_NOTE, T000F2_n168TBM03_NOTE, T000F2_A169TBM03_ORDER, T000F2_n169TBM03_ORDER, T000F2_A885TBM03_VERSION,
            T000F2_n885TBM03_VERSION, T000F2_A178TBM03_DEL_FLG, T000F2_n178TBM03_DEL_FLG, T000F2_A181TBM03_CRT_PROG_NM, T000F2_n181TBM03_CRT_PROG_NM, T000F2_A184TBM03_UPD_PROG_NM, T000F2_n184TBM03_UPD_PROG_NM, T000F2_A162TBM03_DOM_CD
            }
            , new Object[] {
            T000F3_A163TBM03_DOM_VAR_NM, T000F3_A179TBM03_CRT_DATETIME, T000F3_n179TBM03_CRT_DATETIME, T000F3_A180TBM03_CRT_USER_ID, T000F3_n180TBM03_CRT_USER_ID, T000F3_A182TBM03_UPD_DATETIME, T000F3_n182TBM03_UPD_DATETIME, T000F3_A183TBM03_UPD_USER_ID, T000F3_n183TBM03_UPD_USER_ID, T000F3_A185TBM03_UPD_CNT,
            T000F3_n185TBM03_UPD_CNT, T000F3_A164TBM03_VAR_DESC, T000F3_n164TBM03_VAR_DESC, T000F3_A165TBM03_SDTM_FLG, T000F3_n165TBM03_SDTM_FLG, T000F3_A166TBM03_CDASH_FLG, T000F3_n166TBM03_CDASH_FLG, T000F3_A410TBM03_INPUT_TYPE_DIV, T000F3_n410TBM03_INPUT_TYPE_DIV, T000F3_A167TBM03_REQUIRED_FLG,
            T000F3_n167TBM03_REQUIRED_FLG, T000F3_A602TBM03_SAS_FIELD_NM, T000F3_n602TBM03_SAS_FIELD_NM, T000F3_A624TBM03_ODM_DATA_TYPE, T000F3_n624TBM03_ODM_DATA_TYPE, T000F3_A168TBM03_NOTE, T000F3_n168TBM03_NOTE, T000F3_A169TBM03_ORDER, T000F3_n169TBM03_ORDER, T000F3_A885TBM03_VERSION,
            T000F3_n885TBM03_VERSION, T000F3_A178TBM03_DEL_FLG, T000F3_n178TBM03_DEL_FLG, T000F3_A181TBM03_CRT_PROG_NM, T000F3_n181TBM03_CRT_PROG_NM, T000F3_A184TBM03_UPD_PROG_NM, T000F3_n184TBM03_UPD_PROG_NM, T000F3_A162TBM03_DOM_CD
            }
            , new Object[] {
            T000F4_A162TBM03_DOM_CD
            }
            , new Object[] {
            T000F5_A163TBM03_DOM_VAR_NM, T000F5_A179TBM03_CRT_DATETIME, T000F5_n179TBM03_CRT_DATETIME, T000F5_A180TBM03_CRT_USER_ID, T000F5_n180TBM03_CRT_USER_ID, T000F5_A182TBM03_UPD_DATETIME, T000F5_n182TBM03_UPD_DATETIME, T000F5_A183TBM03_UPD_USER_ID, T000F5_n183TBM03_UPD_USER_ID, T000F5_A185TBM03_UPD_CNT,
            T000F5_n185TBM03_UPD_CNT, T000F5_A164TBM03_VAR_DESC, T000F5_n164TBM03_VAR_DESC, T000F5_A165TBM03_SDTM_FLG, T000F5_n165TBM03_SDTM_FLG, T000F5_A166TBM03_CDASH_FLG, T000F5_n166TBM03_CDASH_FLG, T000F5_A410TBM03_INPUT_TYPE_DIV, T000F5_n410TBM03_INPUT_TYPE_DIV, T000F5_A167TBM03_REQUIRED_FLG,
            T000F5_n167TBM03_REQUIRED_FLG, T000F5_A602TBM03_SAS_FIELD_NM, T000F5_n602TBM03_SAS_FIELD_NM, T000F5_A624TBM03_ODM_DATA_TYPE, T000F5_n624TBM03_ODM_DATA_TYPE, T000F5_A168TBM03_NOTE, T000F5_n168TBM03_NOTE, T000F5_A169TBM03_ORDER, T000F5_n169TBM03_ORDER, T000F5_A885TBM03_VERSION,
            T000F5_n885TBM03_VERSION, T000F5_A178TBM03_DEL_FLG, T000F5_n178TBM03_DEL_FLG, T000F5_A181TBM03_CRT_PROG_NM, T000F5_n181TBM03_CRT_PROG_NM, T000F5_A184TBM03_UPD_PROG_NM, T000F5_n184TBM03_UPD_PROG_NM, T000F5_A162TBM03_DOM_CD
            }
            , new Object[] {
            T000F6_A162TBM03_DOM_CD
            }
            , new Object[] {
            T000F7_A162TBM03_DOM_CD, T000F7_A163TBM03_DOM_VAR_NM
            }
            , new Object[] {
            T000F8_A162TBM03_DOM_CD, T000F8_A163TBM03_DOM_VAR_NM
            }
            , new Object[] {
            T000F9_A162TBM03_DOM_CD, T000F9_A163TBM03_DOM_VAR_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000F13_A162TBM03_DOM_CD, T000F13_A163TBM03_DOM_VAR_NM
            }
            , new Object[] {
            T000F14_A162TBM03_DOM_CD
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
   private int A169TBM03_ORDER ;
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
   private int Z169TBM03_ORDER ;
   private int GX_JID ;
   private int AnyError162 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A185TBM03_UPD_CNT ;
   private long Z185TBM03_UPD_CNT ;
   private long O185TBM03_UPD_CNT ;
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
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A179TBM03_CRT_DATETIME ;
   private java.util.Date A182TBM03_UPD_DATETIME ;
   private java.util.Date Z179TBM03_CRT_DATETIME ;
   private java.util.Date Z182TBM03_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n164TBM03_VAR_DESC ;
   private boolean n165TBM03_SDTM_FLG ;
   private boolean n166TBM03_CDASH_FLG ;
   private boolean n410TBM03_INPUT_TYPE_DIV ;
   private boolean n167TBM03_REQUIRED_FLG ;
   private boolean n602TBM03_SAS_FIELD_NM ;
   private boolean n624TBM03_ODM_DATA_TYPE ;
   private boolean n168TBM03_NOTE ;
   private boolean n169TBM03_ORDER ;
   private boolean n885TBM03_VERSION ;
   private boolean n178TBM03_DEL_FLG ;
   private boolean n179TBM03_CRT_DATETIME ;
   private boolean n180TBM03_CRT_USER_ID ;
   private boolean n181TBM03_CRT_PROG_NM ;
   private boolean n182TBM03_UPD_DATETIME ;
   private boolean n183TBM03_UPD_USER_ID ;
   private boolean n184TBM03_UPD_PROG_NM ;
   private boolean n185TBM03_UPD_CNT ;
   private boolean Gx_longc ;
   private String A162TBM03_DOM_CD ;
   private String A163TBM03_DOM_VAR_NM ;
   private String A164TBM03_VAR_DESC ;
   private String A165TBM03_SDTM_FLG ;
   private String A166TBM03_CDASH_FLG ;
   private String A410TBM03_INPUT_TYPE_DIV ;
   private String A167TBM03_REQUIRED_FLG ;
   private String A602TBM03_SAS_FIELD_NM ;
   private String A624TBM03_ODM_DATA_TYPE ;
   private String A168TBM03_NOTE ;
   private String A885TBM03_VERSION ;
   private String A178TBM03_DEL_FLG ;
   private String A180TBM03_CRT_USER_ID ;
   private String A181TBM03_CRT_PROG_NM ;
   private String A183TBM03_UPD_USER_ID ;
   private String A184TBM03_UPD_PROG_NM ;
   private String Z162TBM03_DOM_CD ;
   private String Z163TBM03_DOM_VAR_NM ;
   private String Z180TBM03_CRT_USER_ID ;
   private String Z183TBM03_UPD_USER_ID ;
   private String Z164TBM03_VAR_DESC ;
   private String Z165TBM03_SDTM_FLG ;
   private String Z166TBM03_CDASH_FLG ;
   private String Z410TBM03_INPUT_TYPE_DIV ;
   private String Z167TBM03_REQUIRED_FLG ;
   private String Z602TBM03_SAS_FIELD_NM ;
   private String Z624TBM03_ODM_DATA_TYPE ;
   private String Z168TBM03_NOTE ;
   private String Z885TBM03_VERSION ;
   private String Z178TBM03_DEL_FLG ;
   private String Z181TBM03_CRT_PROG_NM ;
   private String Z184TBM03_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000F5_A163TBM03_DOM_VAR_NM ;
   private java.util.Date[] T000F5_A179TBM03_CRT_DATETIME ;
   private boolean[] T000F5_n179TBM03_CRT_DATETIME ;
   private String[] T000F5_A180TBM03_CRT_USER_ID ;
   private boolean[] T000F5_n180TBM03_CRT_USER_ID ;
   private java.util.Date[] T000F5_A182TBM03_UPD_DATETIME ;
   private boolean[] T000F5_n182TBM03_UPD_DATETIME ;
   private String[] T000F5_A183TBM03_UPD_USER_ID ;
   private boolean[] T000F5_n183TBM03_UPD_USER_ID ;
   private long[] T000F5_A185TBM03_UPD_CNT ;
   private boolean[] T000F5_n185TBM03_UPD_CNT ;
   private String[] T000F5_A164TBM03_VAR_DESC ;
   private boolean[] T000F5_n164TBM03_VAR_DESC ;
   private String[] T000F5_A165TBM03_SDTM_FLG ;
   private boolean[] T000F5_n165TBM03_SDTM_FLG ;
   private String[] T000F5_A166TBM03_CDASH_FLG ;
   private boolean[] T000F5_n166TBM03_CDASH_FLG ;
   private String[] T000F5_A410TBM03_INPUT_TYPE_DIV ;
   private boolean[] T000F5_n410TBM03_INPUT_TYPE_DIV ;
   private String[] T000F5_A167TBM03_REQUIRED_FLG ;
   private boolean[] T000F5_n167TBM03_REQUIRED_FLG ;
   private String[] T000F5_A602TBM03_SAS_FIELD_NM ;
   private boolean[] T000F5_n602TBM03_SAS_FIELD_NM ;
   private String[] T000F5_A624TBM03_ODM_DATA_TYPE ;
   private boolean[] T000F5_n624TBM03_ODM_DATA_TYPE ;
   private String[] T000F5_A168TBM03_NOTE ;
   private boolean[] T000F5_n168TBM03_NOTE ;
   private int[] T000F5_A169TBM03_ORDER ;
   private boolean[] T000F5_n169TBM03_ORDER ;
   private String[] T000F5_A885TBM03_VERSION ;
   private boolean[] T000F5_n885TBM03_VERSION ;
   private String[] T000F5_A178TBM03_DEL_FLG ;
   private boolean[] T000F5_n178TBM03_DEL_FLG ;
   private String[] T000F5_A181TBM03_CRT_PROG_NM ;
   private boolean[] T000F5_n181TBM03_CRT_PROG_NM ;
   private String[] T000F5_A184TBM03_UPD_PROG_NM ;
   private boolean[] T000F5_n184TBM03_UPD_PROG_NM ;
   private String[] T000F5_A162TBM03_DOM_CD ;
   private String[] T000F4_A162TBM03_DOM_CD ;
   private String[] T000F6_A162TBM03_DOM_CD ;
   private String[] T000F7_A162TBM03_DOM_CD ;
   private String[] T000F7_A163TBM03_DOM_VAR_NM ;
   private String[] T000F3_A163TBM03_DOM_VAR_NM ;
   private java.util.Date[] T000F3_A179TBM03_CRT_DATETIME ;
   private boolean[] T000F3_n179TBM03_CRT_DATETIME ;
   private String[] T000F3_A180TBM03_CRT_USER_ID ;
   private boolean[] T000F3_n180TBM03_CRT_USER_ID ;
   private java.util.Date[] T000F3_A182TBM03_UPD_DATETIME ;
   private boolean[] T000F3_n182TBM03_UPD_DATETIME ;
   private String[] T000F3_A183TBM03_UPD_USER_ID ;
   private boolean[] T000F3_n183TBM03_UPD_USER_ID ;
   private long[] T000F3_A185TBM03_UPD_CNT ;
   private boolean[] T000F3_n185TBM03_UPD_CNT ;
   private String[] T000F3_A164TBM03_VAR_DESC ;
   private boolean[] T000F3_n164TBM03_VAR_DESC ;
   private String[] T000F3_A165TBM03_SDTM_FLG ;
   private boolean[] T000F3_n165TBM03_SDTM_FLG ;
   private String[] T000F3_A166TBM03_CDASH_FLG ;
   private boolean[] T000F3_n166TBM03_CDASH_FLG ;
   private String[] T000F3_A410TBM03_INPUT_TYPE_DIV ;
   private boolean[] T000F3_n410TBM03_INPUT_TYPE_DIV ;
   private String[] T000F3_A167TBM03_REQUIRED_FLG ;
   private boolean[] T000F3_n167TBM03_REQUIRED_FLG ;
   private String[] T000F3_A602TBM03_SAS_FIELD_NM ;
   private boolean[] T000F3_n602TBM03_SAS_FIELD_NM ;
   private String[] T000F3_A624TBM03_ODM_DATA_TYPE ;
   private boolean[] T000F3_n624TBM03_ODM_DATA_TYPE ;
   private String[] T000F3_A168TBM03_NOTE ;
   private boolean[] T000F3_n168TBM03_NOTE ;
   private int[] T000F3_A169TBM03_ORDER ;
   private boolean[] T000F3_n169TBM03_ORDER ;
   private String[] T000F3_A885TBM03_VERSION ;
   private boolean[] T000F3_n885TBM03_VERSION ;
   private String[] T000F3_A178TBM03_DEL_FLG ;
   private boolean[] T000F3_n178TBM03_DEL_FLG ;
   private String[] T000F3_A181TBM03_CRT_PROG_NM ;
   private boolean[] T000F3_n181TBM03_CRT_PROG_NM ;
   private String[] T000F3_A184TBM03_UPD_PROG_NM ;
   private boolean[] T000F3_n184TBM03_UPD_PROG_NM ;
   private String[] T000F3_A162TBM03_DOM_CD ;
   private String[] T000F8_A162TBM03_DOM_CD ;
   private String[] T000F8_A163TBM03_DOM_VAR_NM ;
   private String[] T000F9_A162TBM03_DOM_CD ;
   private String[] T000F9_A163TBM03_DOM_VAR_NM ;
   private String[] T000F2_A163TBM03_DOM_VAR_NM ;
   private java.util.Date[] T000F2_A179TBM03_CRT_DATETIME ;
   private boolean[] T000F2_n179TBM03_CRT_DATETIME ;
   private String[] T000F2_A180TBM03_CRT_USER_ID ;
   private boolean[] T000F2_n180TBM03_CRT_USER_ID ;
   private java.util.Date[] T000F2_A182TBM03_UPD_DATETIME ;
   private boolean[] T000F2_n182TBM03_UPD_DATETIME ;
   private String[] T000F2_A183TBM03_UPD_USER_ID ;
   private boolean[] T000F2_n183TBM03_UPD_USER_ID ;
   private long[] T000F2_A185TBM03_UPD_CNT ;
   private boolean[] T000F2_n185TBM03_UPD_CNT ;
   private String[] T000F2_A164TBM03_VAR_DESC ;
   private boolean[] T000F2_n164TBM03_VAR_DESC ;
   private String[] T000F2_A165TBM03_SDTM_FLG ;
   private boolean[] T000F2_n165TBM03_SDTM_FLG ;
   private String[] T000F2_A166TBM03_CDASH_FLG ;
   private boolean[] T000F2_n166TBM03_CDASH_FLG ;
   private String[] T000F2_A410TBM03_INPUT_TYPE_DIV ;
   private boolean[] T000F2_n410TBM03_INPUT_TYPE_DIV ;
   private String[] T000F2_A167TBM03_REQUIRED_FLG ;
   private boolean[] T000F2_n167TBM03_REQUIRED_FLG ;
   private String[] T000F2_A602TBM03_SAS_FIELD_NM ;
   private boolean[] T000F2_n602TBM03_SAS_FIELD_NM ;
   private String[] T000F2_A624TBM03_ODM_DATA_TYPE ;
   private boolean[] T000F2_n624TBM03_ODM_DATA_TYPE ;
   private String[] T000F2_A168TBM03_NOTE ;
   private boolean[] T000F2_n168TBM03_NOTE ;
   private int[] T000F2_A169TBM03_ORDER ;
   private boolean[] T000F2_n169TBM03_ORDER ;
   private String[] T000F2_A885TBM03_VERSION ;
   private boolean[] T000F2_n885TBM03_VERSION ;
   private String[] T000F2_A178TBM03_DEL_FLG ;
   private boolean[] T000F2_n178TBM03_DEL_FLG ;
   private String[] T000F2_A181TBM03_CRT_PROG_NM ;
   private boolean[] T000F2_n181TBM03_CRT_PROG_NM ;
   private String[] T000F2_A184TBM03_UPD_PROG_NM ;
   private boolean[] T000F2_n184TBM03_UPD_PROG_NM ;
   private String[] T000F2_A162TBM03_DOM_CD ;
   private String[] T000F13_A162TBM03_DOM_CD ;
   private String[] T000F13_A163TBM03_DOM_VAR_NM ;
   private String[] T000F14_A162TBM03_DOM_CD ;
}

final  class tbm03_cdisc_item__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000F2", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F3", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F4", "SELECT `TBM02_DOM_CD` AS TBM03_DOM_CD FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F5", "SELECT TM1.`TBM03_DOM_VAR_NM`, TM1.`TBM03_CRT_DATETIME`, TM1.`TBM03_CRT_USER_ID`, TM1.`TBM03_UPD_DATETIME`, TM1.`TBM03_UPD_USER_ID`, TM1.`TBM03_UPD_CNT`, TM1.`TBM03_VAR_DESC`, TM1.`TBM03_SDTM_FLG`, TM1.`TBM03_CDASH_FLG`, TM1.`TBM03_INPUT_TYPE_DIV`, TM1.`TBM03_REQUIRED_FLG`, TM1.`TBM03_SAS_FIELD_NM`, TM1.`TBM03_ODM_DATA_TYPE`, TM1.`TBM03_NOTE`, TM1.`TBM03_ORDER`, TM1.`TBM03_VERSION`, TM1.`TBM03_DEL_FLG`, TM1.`TBM03_CRT_PROG_NM`, TM1.`TBM03_UPD_PROG_NM`, TM1.`TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` TM1 WHERE TM1.`TBM03_DOM_CD` = ? and TM1.`TBM03_DOM_VAR_NM` = ? ORDER BY TM1.`TBM03_DOM_CD`, TM1.`TBM03_DOM_VAR_NM` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000F6", "SELECT `TBM02_DOM_CD` AS TBM03_DOM_CD FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F7", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000F8", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE ( `TBM03_DOM_CD` > ? or `TBM03_DOM_CD` = ? and `TBM03_DOM_VAR_NM` > ?) ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000F9", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE ( `TBM03_DOM_CD` < ? or `TBM03_DOM_CD` = ? and `TBM03_DOM_VAR_NM` < ?) ORDER BY `TBM03_DOM_CD` DESC, `TBM03_DOM_VAR_NM` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000F10", "INSERT INTO `TBM03_CDISC_ITEM` (`TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000F11", "UPDATE `TBM03_CDISC_ITEM` SET `TBM03_CRT_DATETIME`=?, `TBM03_CRT_USER_ID`=?, `TBM03_UPD_DATETIME`=?, `TBM03_UPD_USER_ID`=?, `TBM03_UPD_CNT`=?, `TBM03_VAR_DESC`=?, `TBM03_SDTM_FLG`=?, `TBM03_CDASH_FLG`=?, `TBM03_INPUT_TYPE_DIV`=?, `TBM03_REQUIRED_FLG`=?, `TBM03_SAS_FIELD_NM`=?, `TBM03_ODM_DATA_TYPE`=?, `TBM03_NOTE`=?, `TBM03_ORDER`=?, `TBM03_VERSION`=?, `TBM03_DEL_FLG`=?, `TBM03_CRT_PROG_NM`=?, `TBM03_UPD_PROG_NM`=?  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new UpdateCursor("T000F12", "DELETE FROM `TBM03_CDISC_ITEM`  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new ForEachCursor("T000F13", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000F14", "SELECT `TBM02_DOM_CD` AS TBM03_DOM_CD FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               break;
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
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
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
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 8 :
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
               stmt.setVarchar(20, (String)parms[37], 2, false);
               break;
            case 9 :
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
               stmt.setVarchar(19, (String)parms[36], 2, false);
               stmt.setVarchar(20, (String)parms[37], 50, false);
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
      }
   }

}

