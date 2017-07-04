/*
               File: tbm43_study_cdisc_item_impl
        Description: 試験別CDISC項目マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:30.89
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm43_study_cdisc_item_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM43_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm43_crt_user_id1J54( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM43_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm43_upd_user_id1J54( Gx_mode) ;
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
      Form.getMeta().addItem("Description", "試験別CDISC項目マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbm43_study_cdisc_item_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm43_study_cdisc_item_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm43_study_cdisc_item_impl.class ));
   }

   public tbm43_study_cdisc_item_impl( int remoteHandle ,
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
         wb_table1_2_1J54( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1J54e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1J54( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1J54( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1J54( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1J54e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"試験別CDISC項目マスタ"+"</legend>") ;
         wb_table3_27_1J54( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1J54e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1J54e( true) ;
      }
      else
      {
         wb_table1_2_1J54e( false) ;
      }
   }

   public void wb_table3_27_1J54( boolean wbgen )
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
         wb_table4_33_1J54( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1J54e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1J54e( true) ;
      }
      else
      {
         wb_table3_27_1J54e( false) ;
      }
   }

   public void wb_table4_33_1J54( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_study_id_Internalname, "ID", "", "", lblTextblocktbm43_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A894TBM43_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM43_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A894TBM43_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A894TBM43_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM43_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbm43_dom_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_DOM_CD_Internalname, GXutil.rtrim( A895TBM43_DOM_CD), GXutil.rtrim( localUtil.format( A895TBM43_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM43_DOM_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_DOM_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbm43_dom_var_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_DOM_VAR_NM_Internalname, GXutil.rtrim( A896TBM43_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A896TBM43_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM43_DOM_VAR_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_DOM_VAR_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_var_desc_Internalname, "ドメイン変数説明", "", "", lblTextblocktbm43_var_desc_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A897TBM43_VAR_DESC", A897TBM43_VAR_DESC);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_VAR_DESC_Internalname, GXutil.rtrim( A897TBM43_VAR_DESC), GXutil.rtrim( localUtil.format( A897TBM43_VAR_DESC, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM43_VAR_DESC_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_VAR_DESC_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_sdtm_flg_Internalname, "SDTM定義フラグ", "", "", lblTextblocktbm43_sdtm_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A898TBM43_SDTM_FLG", A898TBM43_SDTM_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_SDTM_FLG_Internalname, GXutil.rtrim( A898TBM43_SDTM_FLG), GXutil.rtrim( localUtil.format( A898TBM43_SDTM_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM43_SDTM_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_SDTM_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_cdash_flg_Internalname, "CDASH定義フラグ", "", "", lblTextblocktbm43_cdash_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A899TBM43_CDASH_FLG", A899TBM43_CDASH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_CDASH_FLG_Internalname, GXutil.rtrim( A899TBM43_CDASH_FLG), GXutil.rtrim( localUtil.format( A899TBM43_CDASH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM43_CDASH_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_CDASH_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_input_type_div_Internalname, "入力値型区分", "", "", lblTextblocktbm43_input_type_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A900TBM43_INPUT_TYPE_DIV", A900TBM43_INPUT_TYPE_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_INPUT_TYPE_DIV_Internalname, GXutil.rtrim( A900TBM43_INPUT_TYPE_DIV), GXutil.rtrim( localUtil.format( A900TBM43_INPUT_TYPE_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM43_INPUT_TYPE_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_INPUT_TYPE_DIV_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_required_flg_Internalname, "必須入力フラグ", "", "", lblTextblocktbm43_required_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A901TBM43_REQUIRED_FLG", A901TBM43_REQUIRED_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_REQUIRED_FLG_Internalname, GXutil.rtrim( A901TBM43_REQUIRED_FLG), GXutil.rtrim( localUtil.format( A901TBM43_REQUIRED_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM43_REQUIRED_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_REQUIRED_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_sas_field_nm_Internalname, "SASフィールド名", "", "", lblTextblocktbm43_sas_field_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A902TBM43_SAS_FIELD_NM", A902TBM43_SAS_FIELD_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_SAS_FIELD_NM_Internalname, GXutil.rtrim( A902TBM43_SAS_FIELD_NM), GXutil.rtrim( localUtil.format( A902TBM43_SAS_FIELD_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM43_SAS_FIELD_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_SAS_FIELD_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_odm_data_type_Internalname, "ODMデータタイプ", "", "", lblTextblocktbm43_odm_data_type_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A903TBM43_ODM_DATA_TYPE", A903TBM43_ODM_DATA_TYPE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_ODM_DATA_TYPE_Internalname, GXutil.rtrim( A903TBM43_ODM_DATA_TYPE), GXutil.rtrim( localUtil.format( A903TBM43_ODM_DATA_TYPE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM43_ODM_DATA_TYPE_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_ODM_DATA_TYPE_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_note_Internalname, "備考", "", "", lblTextblocktbm43_note_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A904TBM43_NOTE", A904TBM43_NOTE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM43_NOTE_Internalname, GXutil.rtrim( A904TBM43_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", (short)(0), 1, edtTBM43_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_order_Internalname, "表示順", "", "", lblTextblocktbm43_order_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A905TBM43_ORDER", GXutil.ltrim( GXutil.str( A905TBM43_ORDER, 5, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A905TBM43_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBM43_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A905TBM43_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A905TBM43_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM43_ORDER_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_ORDER_Enabled, 0, 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_version_Internalname, "バージョン情報", "", "", lblTextblocktbm43_version_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A907TBM43_VERSION", A907TBM43_VERSION);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_VERSION_Internalname, GXutil.rtrim( A907TBM43_VERSION), GXutil.rtrim( localUtil.format( A907TBM43_VERSION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBM43_VERSION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_VERSION_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm43_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A906TBM43_DEL_FLG", A906TBM43_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_DEL_FLG_Internalname, GXutil.rtrim( A906TBM43_DEL_FLG), GXutil.rtrim( localUtil.format( A906TBM43_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBM43_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm43_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A919TBM43_CRT_DATETIME", localUtil.ttoc( A919TBM43_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM43_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_CRT_DATETIME_Internalname, localUtil.format(A919TBM43_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A919TBM43_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(108);\"", "", "", "", "", edtTBM43_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM43_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM43_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_crt_user_id_Internalname, "ID", "", "", lblTextblocktbm43_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A912TBM43_CRT_USER_ID", A912TBM43_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_CRT_USER_ID_Internalname, GXutil.rtrim( A912TBM43_CRT_USER_ID), GXutil.rtrim( localUtil.format( A912TBM43_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtTBM43_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm43_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A913TBM43_CRT_PROG_NM", A913TBM43_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_CRT_PROG_NM_Internalname, GXutil.rtrim( A913TBM43_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A913TBM43_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "", "", "", "", edtTBM43_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm43_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A920TBM43_UPD_DATETIME", localUtil.ttoc( A920TBM43_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM43_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_UPD_DATETIME_Internalname, localUtil.format(A920TBM43_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A920TBM43_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(123);\"", "", "", "", "", edtTBM43_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM43_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM43_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_upd_user_id_Internalname, "ID", "", "", lblTextblocktbm43_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A914TBM43_UPD_USER_ID", A914TBM43_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_UPD_USER_ID_Internalname, GXutil.rtrim( A914TBM43_UPD_USER_ID), GXutil.rtrim( localUtil.format( A914TBM43_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(128);\"", "", "", "", "", edtTBM43_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm43_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A915TBM43_UPD_PROG_NM", A915TBM43_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_UPD_PROG_NM_Internalname, GXutil.rtrim( A915TBM43_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A915TBM43_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(133);\"", "", "", "", "", edtTBM43_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm43_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm43_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM43_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A921TBM43_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM43_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A921TBM43_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A921TBM43_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(138);\"", "", "", "", "", edtTBM43_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM43_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1J54e( true) ;
      }
      else
      {
         wb_table4_33_1J54e( false) ;
      }
   }

   public void wb_table2_5_1J54( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM43_STUDY_CDISC_ITEM.htm");
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
         wb_table2_5_1J54e( true) ;
      }
      else
      {
         wb_table2_5_1J54e( false) ;
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
      /* Execute user event: e111J2 */
      e111J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM43_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM43_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM43_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A894TBM43_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
            }
            else
            {
               A894TBM43_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM43_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
            }
            A895TBM43_DOM_CD = httpContext.cgiGet( edtTBM43_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
            A896TBM43_DOM_VAR_NM = httpContext.cgiGet( edtTBM43_DOM_VAR_NM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
            A897TBM43_VAR_DESC = httpContext.cgiGet( edtTBM43_VAR_DESC_Internalname) ;
            n897TBM43_VAR_DESC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A897TBM43_VAR_DESC", A897TBM43_VAR_DESC);
            n897TBM43_VAR_DESC = ((GXutil.strcmp("", A897TBM43_VAR_DESC)==0) ? true : false) ;
            A898TBM43_SDTM_FLG = httpContext.cgiGet( edtTBM43_SDTM_FLG_Internalname) ;
            n898TBM43_SDTM_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A898TBM43_SDTM_FLG", A898TBM43_SDTM_FLG);
            n898TBM43_SDTM_FLG = ((GXutil.strcmp("", A898TBM43_SDTM_FLG)==0) ? true : false) ;
            A899TBM43_CDASH_FLG = httpContext.cgiGet( edtTBM43_CDASH_FLG_Internalname) ;
            n899TBM43_CDASH_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A899TBM43_CDASH_FLG", A899TBM43_CDASH_FLG);
            n899TBM43_CDASH_FLG = ((GXutil.strcmp("", A899TBM43_CDASH_FLG)==0) ? true : false) ;
            A900TBM43_INPUT_TYPE_DIV = httpContext.cgiGet( edtTBM43_INPUT_TYPE_DIV_Internalname) ;
            n900TBM43_INPUT_TYPE_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A900TBM43_INPUT_TYPE_DIV", A900TBM43_INPUT_TYPE_DIV);
            n900TBM43_INPUT_TYPE_DIV = ((GXutil.strcmp("", A900TBM43_INPUT_TYPE_DIV)==0) ? true : false) ;
            A901TBM43_REQUIRED_FLG = httpContext.cgiGet( edtTBM43_REQUIRED_FLG_Internalname) ;
            n901TBM43_REQUIRED_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A901TBM43_REQUIRED_FLG", A901TBM43_REQUIRED_FLG);
            n901TBM43_REQUIRED_FLG = ((GXutil.strcmp("", A901TBM43_REQUIRED_FLG)==0) ? true : false) ;
            A902TBM43_SAS_FIELD_NM = httpContext.cgiGet( edtTBM43_SAS_FIELD_NM_Internalname) ;
            n902TBM43_SAS_FIELD_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A902TBM43_SAS_FIELD_NM", A902TBM43_SAS_FIELD_NM);
            n902TBM43_SAS_FIELD_NM = ((GXutil.strcmp("", A902TBM43_SAS_FIELD_NM)==0) ? true : false) ;
            A903TBM43_ODM_DATA_TYPE = httpContext.cgiGet( edtTBM43_ODM_DATA_TYPE_Internalname) ;
            n903TBM43_ODM_DATA_TYPE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A903TBM43_ODM_DATA_TYPE", A903TBM43_ODM_DATA_TYPE);
            n903TBM43_ODM_DATA_TYPE = ((GXutil.strcmp("", A903TBM43_ODM_DATA_TYPE)==0) ? true : false) ;
            A904TBM43_NOTE = httpContext.cgiGet( edtTBM43_NOTE_Internalname) ;
            n904TBM43_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A904TBM43_NOTE", A904TBM43_NOTE);
            n904TBM43_NOTE = ((GXutil.strcmp("", A904TBM43_NOTE)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM43_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM43_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM43_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM43_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A905TBM43_ORDER = 0 ;
               n905TBM43_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A905TBM43_ORDER", GXutil.ltrim( GXutil.str( A905TBM43_ORDER, 5, 0)));
            }
            else
            {
               A905TBM43_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM43_ORDER_Internalname), ".", ",")) ;
               n905TBM43_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A905TBM43_ORDER", GXutil.ltrim( GXutil.str( A905TBM43_ORDER, 5, 0)));
            }
            n905TBM43_ORDER = ((0==A905TBM43_ORDER) ? true : false) ;
            A907TBM43_VERSION = httpContext.cgiGet( edtTBM43_VERSION_Internalname) ;
            n907TBM43_VERSION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A907TBM43_VERSION", A907TBM43_VERSION);
            n907TBM43_VERSION = ((GXutil.strcmp("", A907TBM43_VERSION)==0) ? true : false) ;
            A906TBM43_DEL_FLG = httpContext.cgiGet( edtTBM43_DEL_FLG_Internalname) ;
            n906TBM43_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A906TBM43_DEL_FLG", A906TBM43_DEL_FLG);
            n906TBM43_DEL_FLG = ((GXutil.strcmp("", A906TBM43_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM43_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM43_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM43_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A919TBM43_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n919TBM43_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A919TBM43_CRT_DATETIME", localUtil.ttoc( A919TBM43_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A919TBM43_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM43_CRT_DATETIME_Internalname)) ;
               n919TBM43_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A919TBM43_CRT_DATETIME", localUtil.ttoc( A919TBM43_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n919TBM43_CRT_DATETIME = (GXutil.nullDate().equals(A919TBM43_CRT_DATETIME) ? true : false) ;
            A912TBM43_CRT_USER_ID = httpContext.cgiGet( edtTBM43_CRT_USER_ID_Internalname) ;
            n912TBM43_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A912TBM43_CRT_USER_ID", A912TBM43_CRT_USER_ID);
            n912TBM43_CRT_USER_ID = ((GXutil.strcmp("", A912TBM43_CRT_USER_ID)==0) ? true : false) ;
            A913TBM43_CRT_PROG_NM = httpContext.cgiGet( edtTBM43_CRT_PROG_NM_Internalname) ;
            n913TBM43_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A913TBM43_CRT_PROG_NM", A913TBM43_CRT_PROG_NM);
            n913TBM43_CRT_PROG_NM = ((GXutil.strcmp("", A913TBM43_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM43_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM43_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM43_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A920TBM43_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n920TBM43_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A920TBM43_UPD_DATETIME", localUtil.ttoc( A920TBM43_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A920TBM43_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM43_UPD_DATETIME_Internalname)) ;
               n920TBM43_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A920TBM43_UPD_DATETIME", localUtil.ttoc( A920TBM43_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n920TBM43_UPD_DATETIME = (GXutil.nullDate().equals(A920TBM43_UPD_DATETIME) ? true : false) ;
            A914TBM43_UPD_USER_ID = httpContext.cgiGet( edtTBM43_UPD_USER_ID_Internalname) ;
            n914TBM43_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A914TBM43_UPD_USER_ID", A914TBM43_UPD_USER_ID);
            n914TBM43_UPD_USER_ID = ((GXutil.strcmp("", A914TBM43_UPD_USER_ID)==0) ? true : false) ;
            A915TBM43_UPD_PROG_NM = httpContext.cgiGet( edtTBM43_UPD_PROG_NM_Internalname) ;
            n915TBM43_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A915TBM43_UPD_PROG_NM", A915TBM43_UPD_PROG_NM);
            n915TBM43_UPD_PROG_NM = ((GXutil.strcmp("", A915TBM43_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM43_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM43_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM43_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM43_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A921TBM43_UPD_CNT = 0 ;
               n921TBM43_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
            }
            else
            {
               A921TBM43_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM43_UPD_CNT_Internalname), ".", ",") ;
               n921TBM43_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
            }
            n921TBM43_UPD_CNT = ((0==A921TBM43_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z894TBM43_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z894TBM43_STUDY_ID"), ".", ",") ;
            Z895TBM43_DOM_CD = httpContext.cgiGet( "Z895TBM43_DOM_CD") ;
            Z896TBM43_DOM_VAR_NM = httpContext.cgiGet( "Z896TBM43_DOM_VAR_NM") ;
            Z919TBM43_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z919TBM43_CRT_DATETIME"), 0) ;
            n919TBM43_CRT_DATETIME = (GXutil.nullDate().equals(A919TBM43_CRT_DATETIME) ? true : false) ;
            Z912TBM43_CRT_USER_ID = httpContext.cgiGet( "Z912TBM43_CRT_USER_ID") ;
            n912TBM43_CRT_USER_ID = ((GXutil.strcmp("", A912TBM43_CRT_USER_ID)==0) ? true : false) ;
            Z920TBM43_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z920TBM43_UPD_DATETIME"), 0) ;
            n920TBM43_UPD_DATETIME = (GXutil.nullDate().equals(A920TBM43_UPD_DATETIME) ? true : false) ;
            Z914TBM43_UPD_USER_ID = httpContext.cgiGet( "Z914TBM43_UPD_USER_ID") ;
            n914TBM43_UPD_USER_ID = ((GXutil.strcmp("", A914TBM43_UPD_USER_ID)==0) ? true : false) ;
            Z921TBM43_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z921TBM43_UPD_CNT"), ".", ",") ;
            n921TBM43_UPD_CNT = ((0==A921TBM43_UPD_CNT) ? true : false) ;
            Z897TBM43_VAR_DESC = httpContext.cgiGet( "Z897TBM43_VAR_DESC") ;
            n897TBM43_VAR_DESC = ((GXutil.strcmp("", A897TBM43_VAR_DESC)==0) ? true : false) ;
            Z898TBM43_SDTM_FLG = httpContext.cgiGet( "Z898TBM43_SDTM_FLG") ;
            n898TBM43_SDTM_FLG = ((GXutil.strcmp("", A898TBM43_SDTM_FLG)==0) ? true : false) ;
            Z899TBM43_CDASH_FLG = httpContext.cgiGet( "Z899TBM43_CDASH_FLG") ;
            n899TBM43_CDASH_FLG = ((GXutil.strcmp("", A899TBM43_CDASH_FLG)==0) ? true : false) ;
            Z900TBM43_INPUT_TYPE_DIV = httpContext.cgiGet( "Z900TBM43_INPUT_TYPE_DIV") ;
            n900TBM43_INPUT_TYPE_DIV = ((GXutil.strcmp("", A900TBM43_INPUT_TYPE_DIV)==0) ? true : false) ;
            Z901TBM43_REQUIRED_FLG = httpContext.cgiGet( "Z901TBM43_REQUIRED_FLG") ;
            n901TBM43_REQUIRED_FLG = ((GXutil.strcmp("", A901TBM43_REQUIRED_FLG)==0) ? true : false) ;
            Z902TBM43_SAS_FIELD_NM = httpContext.cgiGet( "Z902TBM43_SAS_FIELD_NM") ;
            n902TBM43_SAS_FIELD_NM = ((GXutil.strcmp("", A902TBM43_SAS_FIELD_NM)==0) ? true : false) ;
            Z903TBM43_ODM_DATA_TYPE = httpContext.cgiGet( "Z903TBM43_ODM_DATA_TYPE") ;
            n903TBM43_ODM_DATA_TYPE = ((GXutil.strcmp("", A903TBM43_ODM_DATA_TYPE)==0) ? true : false) ;
            Z904TBM43_NOTE = httpContext.cgiGet( "Z904TBM43_NOTE") ;
            n904TBM43_NOTE = ((GXutil.strcmp("", A904TBM43_NOTE)==0) ? true : false) ;
            Z905TBM43_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z905TBM43_ORDER"), ".", ",")) ;
            n905TBM43_ORDER = ((0==A905TBM43_ORDER) ? true : false) ;
            Z907TBM43_VERSION = httpContext.cgiGet( "Z907TBM43_VERSION") ;
            n907TBM43_VERSION = ((GXutil.strcmp("", A907TBM43_VERSION)==0) ? true : false) ;
            Z906TBM43_DEL_FLG = httpContext.cgiGet( "Z906TBM43_DEL_FLG") ;
            n906TBM43_DEL_FLG = ((GXutil.strcmp("", A906TBM43_DEL_FLG)==0) ? true : false) ;
            Z913TBM43_CRT_PROG_NM = httpContext.cgiGet( "Z913TBM43_CRT_PROG_NM") ;
            n913TBM43_CRT_PROG_NM = ((GXutil.strcmp("", A913TBM43_CRT_PROG_NM)==0) ? true : false) ;
            Z915TBM43_UPD_PROG_NM = httpContext.cgiGet( "Z915TBM43_UPD_PROG_NM") ;
            n915TBM43_UPD_PROG_NM = ((GXutil.strcmp("", A915TBM43_UPD_PROG_NM)==0) ? true : false) ;
            O921TBM43_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O921TBM43_UPD_CNT"), ".", ",") ;
            n921TBM43_UPD_CNT = ((0==A921TBM43_UPD_CNT) ? true : false) ;
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
               A894TBM43_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
               A895TBM43_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
               A896TBM43_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
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
                     /* Execute user event: e111J2 */
                     e111J2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e121J2 */
                     e121J2 ();
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
         /* Execute user event: e121J2 */
         e121J2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1J54( ) ;
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
      disableAttributes1J54( ) ;
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

   public void resetCaption1J0( )
   {
   }

   public void e111J2( )
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

   public void e121J2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV8W_TXT = "" ;
      AV8W_TXT = AV8W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + "ドメインコード:" + A895TBM43_DOM_CD + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + "ドメイン変数名:" + A896TBM43_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A897TBM43_VAR_DESC + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A898TBM43_SDTM_FLG + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A899TBM43_CDASH_FLG + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A900TBM43_INPUT_TYPE_DIV + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A901TBM43_REQUIRED_FLG + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A902TBM43_SAS_FIELD_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A904TBM43_NOTE + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A905TBM43_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A906TBM43_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV8W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A919TBM43_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm43_study_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A919TBM43_CRT_DATETIME", localUtil.ttoc( A919TBM43_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV8W_TXT = AV8W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A912TBM43_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A913TBM43_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV8W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A920TBM43_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm43_study_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A920TBM43_UPD_DATETIME", localUtil.ttoc( A920TBM43_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV8W_TXT = AV8W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A914TBM43_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + A915TBM43_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV8W_TXT = GXutil.strReplace( AV8W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV8W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1172( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1J54( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z919TBM43_CRT_DATETIME = T001J3_A919TBM43_CRT_DATETIME[0] ;
            Z912TBM43_CRT_USER_ID = T001J3_A912TBM43_CRT_USER_ID[0] ;
            Z920TBM43_UPD_DATETIME = T001J3_A920TBM43_UPD_DATETIME[0] ;
            Z914TBM43_UPD_USER_ID = T001J3_A914TBM43_UPD_USER_ID[0] ;
            Z921TBM43_UPD_CNT = T001J3_A921TBM43_UPD_CNT[0] ;
            Z897TBM43_VAR_DESC = T001J3_A897TBM43_VAR_DESC[0] ;
            Z898TBM43_SDTM_FLG = T001J3_A898TBM43_SDTM_FLG[0] ;
            Z899TBM43_CDASH_FLG = T001J3_A899TBM43_CDASH_FLG[0] ;
            Z900TBM43_INPUT_TYPE_DIV = T001J3_A900TBM43_INPUT_TYPE_DIV[0] ;
            Z901TBM43_REQUIRED_FLG = T001J3_A901TBM43_REQUIRED_FLG[0] ;
            Z902TBM43_SAS_FIELD_NM = T001J3_A902TBM43_SAS_FIELD_NM[0] ;
            Z903TBM43_ODM_DATA_TYPE = T001J3_A903TBM43_ODM_DATA_TYPE[0] ;
            Z904TBM43_NOTE = T001J3_A904TBM43_NOTE[0] ;
            Z905TBM43_ORDER = T001J3_A905TBM43_ORDER[0] ;
            Z907TBM43_VERSION = T001J3_A907TBM43_VERSION[0] ;
            Z906TBM43_DEL_FLG = T001J3_A906TBM43_DEL_FLG[0] ;
            Z913TBM43_CRT_PROG_NM = T001J3_A913TBM43_CRT_PROG_NM[0] ;
            Z915TBM43_UPD_PROG_NM = T001J3_A915TBM43_UPD_PROG_NM[0] ;
         }
         else
         {
            Z919TBM43_CRT_DATETIME = A919TBM43_CRT_DATETIME ;
            Z912TBM43_CRT_USER_ID = A912TBM43_CRT_USER_ID ;
            Z920TBM43_UPD_DATETIME = A920TBM43_UPD_DATETIME ;
            Z914TBM43_UPD_USER_ID = A914TBM43_UPD_USER_ID ;
            Z921TBM43_UPD_CNT = A921TBM43_UPD_CNT ;
            Z897TBM43_VAR_DESC = A897TBM43_VAR_DESC ;
            Z898TBM43_SDTM_FLG = A898TBM43_SDTM_FLG ;
            Z899TBM43_CDASH_FLG = A899TBM43_CDASH_FLG ;
            Z900TBM43_INPUT_TYPE_DIV = A900TBM43_INPUT_TYPE_DIV ;
            Z901TBM43_REQUIRED_FLG = A901TBM43_REQUIRED_FLG ;
            Z902TBM43_SAS_FIELD_NM = A902TBM43_SAS_FIELD_NM ;
            Z903TBM43_ODM_DATA_TYPE = A903TBM43_ODM_DATA_TYPE ;
            Z904TBM43_NOTE = A904TBM43_NOTE ;
            Z905TBM43_ORDER = A905TBM43_ORDER ;
            Z907TBM43_VERSION = A907TBM43_VERSION ;
            Z906TBM43_DEL_FLG = A906TBM43_DEL_FLG ;
            Z913TBM43_CRT_PROG_NM = A913TBM43_CRT_PROG_NM ;
            Z915TBM43_UPD_PROG_NM = A915TBM43_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z894TBM43_STUDY_ID = A894TBM43_STUDY_ID ;
         Z895TBM43_DOM_CD = A895TBM43_DOM_CD ;
         Z896TBM43_DOM_VAR_NM = A896TBM43_DOM_VAR_NM ;
         Z919TBM43_CRT_DATETIME = A919TBM43_CRT_DATETIME ;
         Z912TBM43_CRT_USER_ID = A912TBM43_CRT_USER_ID ;
         Z920TBM43_UPD_DATETIME = A920TBM43_UPD_DATETIME ;
         Z914TBM43_UPD_USER_ID = A914TBM43_UPD_USER_ID ;
         Z921TBM43_UPD_CNT = A921TBM43_UPD_CNT ;
         Z897TBM43_VAR_DESC = A897TBM43_VAR_DESC ;
         Z898TBM43_SDTM_FLG = A898TBM43_SDTM_FLG ;
         Z899TBM43_CDASH_FLG = A899TBM43_CDASH_FLG ;
         Z900TBM43_INPUT_TYPE_DIV = A900TBM43_INPUT_TYPE_DIV ;
         Z901TBM43_REQUIRED_FLG = A901TBM43_REQUIRED_FLG ;
         Z902TBM43_SAS_FIELD_NM = A902TBM43_SAS_FIELD_NM ;
         Z903TBM43_ODM_DATA_TYPE = A903TBM43_ODM_DATA_TYPE ;
         Z904TBM43_NOTE = A904TBM43_NOTE ;
         Z905TBM43_ORDER = A905TBM43_ORDER ;
         Z907TBM43_VERSION = A907TBM43_VERSION ;
         Z906TBM43_DEL_FLG = A906TBM43_DEL_FLG ;
         Z913TBM43_CRT_PROG_NM = A913TBM43_CRT_PROG_NM ;
         Z915TBM43_UPD_PROG_NM = A915TBM43_UPD_PROG_NM ;
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

   public void load1J54( )
   {
      /* Using cursor T001J4 */
      pr_default.execute(2, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound54 = (short)(1) ;
         A919TBM43_CRT_DATETIME = T001J4_A919TBM43_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A919TBM43_CRT_DATETIME", localUtil.ttoc( A919TBM43_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n919TBM43_CRT_DATETIME = T001J4_n919TBM43_CRT_DATETIME[0] ;
         A912TBM43_CRT_USER_ID = T001J4_A912TBM43_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A912TBM43_CRT_USER_ID", A912TBM43_CRT_USER_ID);
         n912TBM43_CRT_USER_ID = T001J4_n912TBM43_CRT_USER_ID[0] ;
         A920TBM43_UPD_DATETIME = T001J4_A920TBM43_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A920TBM43_UPD_DATETIME", localUtil.ttoc( A920TBM43_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n920TBM43_UPD_DATETIME = T001J4_n920TBM43_UPD_DATETIME[0] ;
         A914TBM43_UPD_USER_ID = T001J4_A914TBM43_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914TBM43_UPD_USER_ID", A914TBM43_UPD_USER_ID);
         n914TBM43_UPD_USER_ID = T001J4_n914TBM43_UPD_USER_ID[0] ;
         A921TBM43_UPD_CNT = T001J4_A921TBM43_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
         n921TBM43_UPD_CNT = T001J4_n921TBM43_UPD_CNT[0] ;
         A897TBM43_VAR_DESC = T001J4_A897TBM43_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A897TBM43_VAR_DESC", A897TBM43_VAR_DESC);
         n897TBM43_VAR_DESC = T001J4_n897TBM43_VAR_DESC[0] ;
         A898TBM43_SDTM_FLG = T001J4_A898TBM43_SDTM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898TBM43_SDTM_FLG", A898TBM43_SDTM_FLG);
         n898TBM43_SDTM_FLG = T001J4_n898TBM43_SDTM_FLG[0] ;
         A899TBM43_CDASH_FLG = T001J4_A899TBM43_CDASH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A899TBM43_CDASH_FLG", A899TBM43_CDASH_FLG);
         n899TBM43_CDASH_FLG = T001J4_n899TBM43_CDASH_FLG[0] ;
         A900TBM43_INPUT_TYPE_DIV = T001J4_A900TBM43_INPUT_TYPE_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A900TBM43_INPUT_TYPE_DIV", A900TBM43_INPUT_TYPE_DIV);
         n900TBM43_INPUT_TYPE_DIV = T001J4_n900TBM43_INPUT_TYPE_DIV[0] ;
         A901TBM43_REQUIRED_FLG = T001J4_A901TBM43_REQUIRED_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A901TBM43_REQUIRED_FLG", A901TBM43_REQUIRED_FLG);
         n901TBM43_REQUIRED_FLG = T001J4_n901TBM43_REQUIRED_FLG[0] ;
         A902TBM43_SAS_FIELD_NM = T001J4_A902TBM43_SAS_FIELD_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A902TBM43_SAS_FIELD_NM", A902TBM43_SAS_FIELD_NM);
         n902TBM43_SAS_FIELD_NM = T001J4_n902TBM43_SAS_FIELD_NM[0] ;
         A903TBM43_ODM_DATA_TYPE = T001J4_A903TBM43_ODM_DATA_TYPE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A903TBM43_ODM_DATA_TYPE", A903TBM43_ODM_DATA_TYPE);
         n903TBM43_ODM_DATA_TYPE = T001J4_n903TBM43_ODM_DATA_TYPE[0] ;
         A904TBM43_NOTE = T001J4_A904TBM43_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A904TBM43_NOTE", A904TBM43_NOTE);
         n904TBM43_NOTE = T001J4_n904TBM43_NOTE[0] ;
         A905TBM43_ORDER = T001J4_A905TBM43_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A905TBM43_ORDER", GXutil.ltrim( GXutil.str( A905TBM43_ORDER, 5, 0)));
         n905TBM43_ORDER = T001J4_n905TBM43_ORDER[0] ;
         A907TBM43_VERSION = T001J4_A907TBM43_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A907TBM43_VERSION", A907TBM43_VERSION);
         n907TBM43_VERSION = T001J4_n907TBM43_VERSION[0] ;
         A906TBM43_DEL_FLG = T001J4_A906TBM43_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A906TBM43_DEL_FLG", A906TBM43_DEL_FLG);
         n906TBM43_DEL_FLG = T001J4_n906TBM43_DEL_FLG[0] ;
         A913TBM43_CRT_PROG_NM = T001J4_A913TBM43_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A913TBM43_CRT_PROG_NM", A913TBM43_CRT_PROG_NM);
         n913TBM43_CRT_PROG_NM = T001J4_n913TBM43_CRT_PROG_NM[0] ;
         A915TBM43_UPD_PROG_NM = T001J4_A915TBM43_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A915TBM43_UPD_PROG_NM", A915TBM43_UPD_PROG_NM);
         n915TBM43_UPD_PROG_NM = T001J4_n915TBM43_UPD_PROG_NM[0] ;
         zm1J54( -8) ;
      }
      pr_default.close(2);
      onLoadActions1J54( ) ;
   }

   public void onLoadActions1J54( )
   {
      AV9Pgmname = "TBM43_STUDY_CDISC_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable1J54( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM43_STUDY_CDISC_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A919TBM43_CRT_DATETIME) || (( A919TBM43_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A919TBM43_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A920TBM43_UPD_DATETIME) || (( A920TBM43_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A920TBM43_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1J54( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1J54( )
   {
      /* Using cursor T001J5 */
      pr_default.execute(3, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound54 = (short)(1) ;
      }
      else
      {
         RcdFound54 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001J3 */
      pr_default.execute(1, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1J54( 8) ;
         RcdFound54 = (short)(1) ;
         A894TBM43_STUDY_ID = T001J3_A894TBM43_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
         A895TBM43_DOM_CD = T001J3_A895TBM43_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
         A896TBM43_DOM_VAR_NM = T001J3_A896TBM43_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
         A919TBM43_CRT_DATETIME = T001J3_A919TBM43_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A919TBM43_CRT_DATETIME", localUtil.ttoc( A919TBM43_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n919TBM43_CRT_DATETIME = T001J3_n919TBM43_CRT_DATETIME[0] ;
         A912TBM43_CRT_USER_ID = T001J3_A912TBM43_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A912TBM43_CRT_USER_ID", A912TBM43_CRT_USER_ID);
         n912TBM43_CRT_USER_ID = T001J3_n912TBM43_CRT_USER_ID[0] ;
         A920TBM43_UPD_DATETIME = T001J3_A920TBM43_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A920TBM43_UPD_DATETIME", localUtil.ttoc( A920TBM43_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n920TBM43_UPD_DATETIME = T001J3_n920TBM43_UPD_DATETIME[0] ;
         A914TBM43_UPD_USER_ID = T001J3_A914TBM43_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914TBM43_UPD_USER_ID", A914TBM43_UPD_USER_ID);
         n914TBM43_UPD_USER_ID = T001J3_n914TBM43_UPD_USER_ID[0] ;
         A921TBM43_UPD_CNT = T001J3_A921TBM43_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
         n921TBM43_UPD_CNT = T001J3_n921TBM43_UPD_CNT[0] ;
         A897TBM43_VAR_DESC = T001J3_A897TBM43_VAR_DESC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A897TBM43_VAR_DESC", A897TBM43_VAR_DESC);
         n897TBM43_VAR_DESC = T001J3_n897TBM43_VAR_DESC[0] ;
         A898TBM43_SDTM_FLG = T001J3_A898TBM43_SDTM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898TBM43_SDTM_FLG", A898TBM43_SDTM_FLG);
         n898TBM43_SDTM_FLG = T001J3_n898TBM43_SDTM_FLG[0] ;
         A899TBM43_CDASH_FLG = T001J3_A899TBM43_CDASH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A899TBM43_CDASH_FLG", A899TBM43_CDASH_FLG);
         n899TBM43_CDASH_FLG = T001J3_n899TBM43_CDASH_FLG[0] ;
         A900TBM43_INPUT_TYPE_DIV = T001J3_A900TBM43_INPUT_TYPE_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A900TBM43_INPUT_TYPE_DIV", A900TBM43_INPUT_TYPE_DIV);
         n900TBM43_INPUT_TYPE_DIV = T001J3_n900TBM43_INPUT_TYPE_DIV[0] ;
         A901TBM43_REQUIRED_FLG = T001J3_A901TBM43_REQUIRED_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A901TBM43_REQUIRED_FLG", A901TBM43_REQUIRED_FLG);
         n901TBM43_REQUIRED_FLG = T001J3_n901TBM43_REQUIRED_FLG[0] ;
         A902TBM43_SAS_FIELD_NM = T001J3_A902TBM43_SAS_FIELD_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A902TBM43_SAS_FIELD_NM", A902TBM43_SAS_FIELD_NM);
         n902TBM43_SAS_FIELD_NM = T001J3_n902TBM43_SAS_FIELD_NM[0] ;
         A903TBM43_ODM_DATA_TYPE = T001J3_A903TBM43_ODM_DATA_TYPE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A903TBM43_ODM_DATA_TYPE", A903TBM43_ODM_DATA_TYPE);
         n903TBM43_ODM_DATA_TYPE = T001J3_n903TBM43_ODM_DATA_TYPE[0] ;
         A904TBM43_NOTE = T001J3_A904TBM43_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A904TBM43_NOTE", A904TBM43_NOTE);
         n904TBM43_NOTE = T001J3_n904TBM43_NOTE[0] ;
         A905TBM43_ORDER = T001J3_A905TBM43_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A905TBM43_ORDER", GXutil.ltrim( GXutil.str( A905TBM43_ORDER, 5, 0)));
         n905TBM43_ORDER = T001J3_n905TBM43_ORDER[0] ;
         A907TBM43_VERSION = T001J3_A907TBM43_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A907TBM43_VERSION", A907TBM43_VERSION);
         n907TBM43_VERSION = T001J3_n907TBM43_VERSION[0] ;
         A906TBM43_DEL_FLG = T001J3_A906TBM43_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A906TBM43_DEL_FLG", A906TBM43_DEL_FLG);
         n906TBM43_DEL_FLG = T001J3_n906TBM43_DEL_FLG[0] ;
         A913TBM43_CRT_PROG_NM = T001J3_A913TBM43_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A913TBM43_CRT_PROG_NM", A913TBM43_CRT_PROG_NM);
         n913TBM43_CRT_PROG_NM = T001J3_n913TBM43_CRT_PROG_NM[0] ;
         A915TBM43_UPD_PROG_NM = T001J3_A915TBM43_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A915TBM43_UPD_PROG_NM", A915TBM43_UPD_PROG_NM);
         n915TBM43_UPD_PROG_NM = T001J3_n915TBM43_UPD_PROG_NM[0] ;
         O921TBM43_UPD_CNT = A921TBM43_UPD_CNT ;
         n921TBM43_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
         Z894TBM43_STUDY_ID = A894TBM43_STUDY_ID ;
         Z895TBM43_DOM_CD = A895TBM43_DOM_CD ;
         Z896TBM43_DOM_VAR_NM = A896TBM43_DOM_VAR_NM ;
         sMode54 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1J54( ) ;
         Gx_mode = sMode54 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound54 = (short)(0) ;
         initializeNonKey1J54( ) ;
         sMode54 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode54 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1J54( ) ;
      if ( RcdFound54 == 0 )
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
      RcdFound54 = (short)(0) ;
      /* Using cursor T001J6 */
      pr_default.execute(4, new Object[] {new Long(A894TBM43_STUDY_ID), new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A895TBM43_DOM_CD, new Long(A894TBM43_STUDY_ID), A896TBM43_DOM_VAR_NM});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001J6_A894TBM43_STUDY_ID[0] < A894TBM43_STUDY_ID ) || ( T001J6_A894TBM43_STUDY_ID[0] == A894TBM43_STUDY_ID ) && ( GXutil.strcmp(T001J6_A895TBM43_DOM_CD[0], A895TBM43_DOM_CD) < 0 ) || ( GXutil.strcmp(T001J6_A895TBM43_DOM_CD[0], A895TBM43_DOM_CD) == 0 ) && ( T001J6_A894TBM43_STUDY_ID[0] == A894TBM43_STUDY_ID ) && ( GXutil.strcmp(T001J6_A896TBM43_DOM_VAR_NM[0], A896TBM43_DOM_VAR_NM) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001J6_A894TBM43_STUDY_ID[0] > A894TBM43_STUDY_ID ) || ( T001J6_A894TBM43_STUDY_ID[0] == A894TBM43_STUDY_ID ) && ( GXutil.strcmp(T001J6_A895TBM43_DOM_CD[0], A895TBM43_DOM_CD) > 0 ) || ( GXutil.strcmp(T001J6_A895TBM43_DOM_CD[0], A895TBM43_DOM_CD) == 0 ) && ( T001J6_A894TBM43_STUDY_ID[0] == A894TBM43_STUDY_ID ) && ( GXutil.strcmp(T001J6_A896TBM43_DOM_VAR_NM[0], A896TBM43_DOM_VAR_NM) > 0 ) ) )
         {
            A894TBM43_STUDY_ID = T001J6_A894TBM43_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
            A895TBM43_DOM_CD = T001J6_A895TBM43_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
            A896TBM43_DOM_VAR_NM = T001J6_A896TBM43_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
            RcdFound54 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound54 = (short)(0) ;
      /* Using cursor T001J7 */
      pr_default.execute(5, new Object[] {new Long(A894TBM43_STUDY_ID), new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A895TBM43_DOM_CD, new Long(A894TBM43_STUDY_ID), A896TBM43_DOM_VAR_NM});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001J7_A894TBM43_STUDY_ID[0] > A894TBM43_STUDY_ID ) || ( T001J7_A894TBM43_STUDY_ID[0] == A894TBM43_STUDY_ID ) && ( GXutil.strcmp(T001J7_A895TBM43_DOM_CD[0], A895TBM43_DOM_CD) > 0 ) || ( GXutil.strcmp(T001J7_A895TBM43_DOM_CD[0], A895TBM43_DOM_CD) == 0 ) && ( T001J7_A894TBM43_STUDY_ID[0] == A894TBM43_STUDY_ID ) && ( GXutil.strcmp(T001J7_A896TBM43_DOM_VAR_NM[0], A896TBM43_DOM_VAR_NM) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001J7_A894TBM43_STUDY_ID[0] < A894TBM43_STUDY_ID ) || ( T001J7_A894TBM43_STUDY_ID[0] == A894TBM43_STUDY_ID ) && ( GXutil.strcmp(T001J7_A895TBM43_DOM_CD[0], A895TBM43_DOM_CD) < 0 ) || ( GXutil.strcmp(T001J7_A895TBM43_DOM_CD[0], A895TBM43_DOM_CD) == 0 ) && ( T001J7_A894TBM43_STUDY_ID[0] == A894TBM43_STUDY_ID ) && ( GXutil.strcmp(T001J7_A896TBM43_DOM_VAR_NM[0], A896TBM43_DOM_VAR_NM) < 0 ) ) )
         {
            A894TBM43_STUDY_ID = T001J7_A894TBM43_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
            A895TBM43_DOM_CD = T001J7_A895TBM43_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
            A896TBM43_DOM_VAR_NM = T001J7_A896TBM43_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
            RcdFound54 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1J54( ) ;
      if ( RcdFound54 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM43_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A894TBM43_STUDY_ID != Z894TBM43_STUDY_ID ) || ( GXutil.strcmp(A895TBM43_DOM_CD, Z895TBM43_DOM_CD) != 0 ) || ( GXutil.strcmp(A896TBM43_DOM_VAR_NM, Z896TBM43_DOM_VAR_NM) != 0 ) )
         {
            A894TBM43_STUDY_ID = Z894TBM43_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
            A895TBM43_DOM_CD = Z895TBM43_DOM_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
            A896TBM43_DOM_VAR_NM = Z896TBM43_DOM_VAR_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM43_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update1J54( ) ;
            GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A894TBM43_STUDY_ID != Z894TBM43_STUDY_ID ) || ( GXutil.strcmp(A895TBM43_DOM_CD, Z895TBM43_DOM_CD) != 0 ) || ( GXutil.strcmp(A896TBM43_DOM_VAR_NM, Z896TBM43_DOM_VAR_NM) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert1J54( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM43_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1J54( ) ;
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
      if ( ( A894TBM43_STUDY_ID != Z894TBM43_STUDY_ID ) || ( GXutil.strcmp(A895TBM43_DOM_CD, Z895TBM43_DOM_CD) != 0 ) || ( GXutil.strcmp(A896TBM43_DOM_VAR_NM, Z896TBM43_DOM_VAR_NM) != 0 ) )
      {
         A894TBM43_STUDY_ID = Z894TBM43_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
         A895TBM43_DOM_CD = Z895TBM43_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
         A896TBM43_DOM_VAR_NM = Z896TBM43_DOM_VAR_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM43_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM43_STUDY_ID_Internalname ;
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
      if ( RcdFound54 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM43_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBM43_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1J54( ) ;
      if ( RcdFound54 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM43_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J54( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound54 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM43_VAR_DESC_Internalname ;
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
      if ( RcdFound54 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM43_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1J54( ) ;
      if ( RcdFound54 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound54 != 0 )
         {
            scanNext1J54( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM43_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J54( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1J54( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001J2 */
         pr_default.execute(0, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM43_STUDY_CDISC_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z919TBM43_CRT_DATETIME.equals( T001J2_A919TBM43_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z912TBM43_CRT_USER_ID, T001J2_A912TBM43_CRT_USER_ID[0]) != 0 ) || !( Z920TBM43_UPD_DATETIME.equals( T001J2_A920TBM43_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z914TBM43_UPD_USER_ID, T001J2_A914TBM43_UPD_USER_ID[0]) != 0 ) || ( Z921TBM43_UPD_CNT != T001J2_A921TBM43_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z897TBM43_VAR_DESC, T001J2_A897TBM43_VAR_DESC[0]) != 0 ) || ( GXutil.strcmp(Z898TBM43_SDTM_FLG, T001J2_A898TBM43_SDTM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z899TBM43_CDASH_FLG, T001J2_A899TBM43_CDASH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z900TBM43_INPUT_TYPE_DIV, T001J2_A900TBM43_INPUT_TYPE_DIV[0]) != 0 ) || ( GXutil.strcmp(Z901TBM43_REQUIRED_FLG, T001J2_A901TBM43_REQUIRED_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z902TBM43_SAS_FIELD_NM, T001J2_A902TBM43_SAS_FIELD_NM[0]) != 0 ) || ( GXutil.strcmp(Z903TBM43_ODM_DATA_TYPE, T001J2_A903TBM43_ODM_DATA_TYPE[0]) != 0 ) || ( GXutil.strcmp(Z904TBM43_NOTE, T001J2_A904TBM43_NOTE[0]) != 0 ) || ( Z905TBM43_ORDER != T001J2_A905TBM43_ORDER[0] ) || ( GXutil.strcmp(Z907TBM43_VERSION, T001J2_A907TBM43_VERSION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z906TBM43_DEL_FLG, T001J2_A906TBM43_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z913TBM43_CRT_PROG_NM, T001J2_A913TBM43_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z915TBM43_UPD_PROG_NM, T001J2_A915TBM43_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM43_STUDY_CDISC_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J54( )
   {
      beforeValidate1J54( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J54( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J54( 0) ;
         checkOptimisticConcurrency1J54( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J54( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J54( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001J8 */
                  pr_default.execute(6, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM, new Boolean(n919TBM43_CRT_DATETIME), A919TBM43_CRT_DATETIME, new Boolean(n912TBM43_CRT_USER_ID), A912TBM43_CRT_USER_ID, new Boolean(n920TBM43_UPD_DATETIME), A920TBM43_UPD_DATETIME, new Boolean(n914TBM43_UPD_USER_ID), A914TBM43_UPD_USER_ID, new Boolean(n921TBM43_UPD_CNT), new Long(A921TBM43_UPD_CNT), new Boolean(n897TBM43_VAR_DESC), A897TBM43_VAR_DESC, new Boolean(n898TBM43_SDTM_FLG), A898TBM43_SDTM_FLG, new Boolean(n899TBM43_CDASH_FLG), A899TBM43_CDASH_FLG, new Boolean(n900TBM43_INPUT_TYPE_DIV), A900TBM43_INPUT_TYPE_DIV, new Boolean(n901TBM43_REQUIRED_FLG), A901TBM43_REQUIRED_FLG, new Boolean(n902TBM43_SAS_FIELD_NM), A902TBM43_SAS_FIELD_NM, new Boolean(n903TBM43_ODM_DATA_TYPE), A903TBM43_ODM_DATA_TYPE, new Boolean(n904TBM43_NOTE), A904TBM43_NOTE, new Boolean(n905TBM43_ORDER), new Integer(A905TBM43_ORDER), new Boolean(n907TBM43_VERSION), A907TBM43_VERSION, new Boolean(n906TBM43_DEL_FLG), A906TBM43_DEL_FLG, new Boolean(n913TBM43_CRT_PROG_NM), A913TBM43_CRT_PROG_NM, new Boolean(n915TBM43_UPD_PROG_NM), A915TBM43_UPD_PROG_NM});
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
                        resetCaption1J0( ) ;
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
            load1J54( ) ;
         }
         endLevel1J54( ) ;
      }
      closeExtendedTableCursors1J54( ) ;
   }

   public void update1J54( )
   {
      beforeValidate1J54( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J54( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J54( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J54( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1J54( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001J9 */
                  pr_default.execute(7, new Object[] {new Boolean(n919TBM43_CRT_DATETIME), A919TBM43_CRT_DATETIME, new Boolean(n912TBM43_CRT_USER_ID), A912TBM43_CRT_USER_ID, new Boolean(n920TBM43_UPD_DATETIME), A920TBM43_UPD_DATETIME, new Boolean(n914TBM43_UPD_USER_ID), A914TBM43_UPD_USER_ID, new Boolean(n921TBM43_UPD_CNT), new Long(A921TBM43_UPD_CNT), new Boolean(n897TBM43_VAR_DESC), A897TBM43_VAR_DESC, new Boolean(n898TBM43_SDTM_FLG), A898TBM43_SDTM_FLG, new Boolean(n899TBM43_CDASH_FLG), A899TBM43_CDASH_FLG, new Boolean(n900TBM43_INPUT_TYPE_DIV), A900TBM43_INPUT_TYPE_DIV, new Boolean(n901TBM43_REQUIRED_FLG), A901TBM43_REQUIRED_FLG, new Boolean(n902TBM43_SAS_FIELD_NM), A902TBM43_SAS_FIELD_NM, new Boolean(n903TBM43_ODM_DATA_TYPE), A903TBM43_ODM_DATA_TYPE, new Boolean(n904TBM43_NOTE), A904TBM43_NOTE, new Boolean(n905TBM43_ORDER), new Integer(A905TBM43_ORDER), new Boolean(n907TBM43_VERSION), A907TBM43_VERSION, new Boolean(n906TBM43_DEL_FLG), A906TBM43_DEL_FLG, new Boolean(n913TBM43_CRT_PROG_NM), A913TBM43_CRT_PROG_NM, new Boolean(n915TBM43_UPD_PROG_NM), A915TBM43_UPD_PROG_NM, new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM43_STUDY_CDISC_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1J54( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption1J0( ) ;
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
         endLevel1J54( ) ;
      }
      closeExtendedTableCursors1J54( ) ;
   }

   public void deferredUpdate1J54( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J54( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J54( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J54( ) ;
         afterConfirm1J54( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J54( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001J10 */
               pr_default.execute(8, new Object[] {new Long(A894TBM43_STUDY_ID), A895TBM43_DOM_CD, A896TBM43_DOM_VAR_NM});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound54 == 0 )
                     {
                        initAll1J54( ) ;
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
                     resetCaption1J0( ) ;
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
      sMode54 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J54( ) ;
      Gx_mode = sMode54 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J54( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM43_STUDY_CDISC_ITEM" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel1J54( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1J54( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm43_study_cdisc_item");
         if ( AnyError == 0 )
         {
            confirmValues1J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm43_study_cdisc_item");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J54( )
   {
      /* Using cursor T001J11 */
      pr_default.execute(9);
      RcdFound54 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound54 = (short)(1) ;
         A894TBM43_STUDY_ID = T001J11_A894TBM43_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
         A895TBM43_DOM_CD = T001J11_A895TBM43_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
         A896TBM43_DOM_VAR_NM = T001J11_A896TBM43_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J54( )
   {
      pr_default.readNext(9);
      RcdFound54 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound54 = (short)(1) ;
         A894TBM43_STUDY_ID = T001J11_A894TBM43_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
         A895TBM43_DOM_CD = T001J11_A895TBM43_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
         A896TBM43_DOM_VAR_NM = T001J11_A896TBM43_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
      }
   }

   public void scanEnd1J54( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1J54( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J54( )
   {
      /* Before Insert Rules */
      A919TBM43_CRT_DATETIME = GXutil.now( ) ;
      n919TBM43_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A919TBM43_CRT_DATETIME", localUtil.ttoc( A919TBM43_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A912TBM43_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm43_study_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A912TBM43_CRT_USER_ID = GXt_char3 ;
      n912TBM43_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A912TBM43_CRT_USER_ID", A912TBM43_CRT_USER_ID);
      A920TBM43_UPD_DATETIME = GXutil.now( ) ;
      n920TBM43_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A920TBM43_UPD_DATETIME", localUtil.ttoc( A920TBM43_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A914TBM43_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm43_study_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A914TBM43_UPD_USER_ID = GXt_char3 ;
      n914TBM43_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A914TBM43_UPD_USER_ID", A914TBM43_UPD_USER_ID);
      A921TBM43_UPD_CNT = (long)(O921TBM43_UPD_CNT+1) ;
      n921TBM43_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1J54( )
   {
      /* Before Update Rules */
      A920TBM43_UPD_DATETIME = GXutil.now( ) ;
      n920TBM43_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A920TBM43_UPD_DATETIME", localUtil.ttoc( A920TBM43_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A914TBM43_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm43_study_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A914TBM43_UPD_USER_ID = GXt_char3 ;
      n914TBM43_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A914TBM43_UPD_USER_ID", A914TBM43_UPD_USER_ID);
      A921TBM43_UPD_CNT = (long)(O921TBM43_UPD_CNT+1) ;
      n921TBM43_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
   }

   public void beforeDelete1J54( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J54( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J54( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J54( )
   {
      edtTBM43_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_STUDY_ID_Enabled, 5, 0)));
      edtTBM43_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_DOM_CD_Enabled, 5, 0)));
      edtTBM43_DOM_VAR_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_DOM_VAR_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_DOM_VAR_NM_Enabled, 5, 0)));
      edtTBM43_VAR_DESC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_VAR_DESC_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_VAR_DESC_Enabled, 5, 0)));
      edtTBM43_SDTM_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_SDTM_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_SDTM_FLG_Enabled, 5, 0)));
      edtTBM43_CDASH_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_CDASH_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_CDASH_FLG_Enabled, 5, 0)));
      edtTBM43_INPUT_TYPE_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_INPUT_TYPE_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_INPUT_TYPE_DIV_Enabled, 5, 0)));
      edtTBM43_REQUIRED_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_REQUIRED_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_REQUIRED_FLG_Enabled, 5, 0)));
      edtTBM43_SAS_FIELD_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_SAS_FIELD_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_SAS_FIELD_NM_Enabled, 5, 0)));
      edtTBM43_ODM_DATA_TYPE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_ODM_DATA_TYPE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_ODM_DATA_TYPE_Enabled, 5, 0)));
      edtTBM43_NOTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_NOTE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_NOTE_Enabled, 5, 0)));
      edtTBM43_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_ORDER_Enabled, 5, 0)));
      edtTBM43_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_VERSION_Enabled, 5, 0)));
      edtTBM43_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_DEL_FLG_Enabled, 5, 0)));
      edtTBM43_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM43_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM43_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM43_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM43_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM43_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM43_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM43_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM43_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1J0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "試験別CDISC項目マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm43_study_cdisc_item") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1J54( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z894TBM43_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z894TBM43_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z895TBM43_DOM_CD", GXutil.rtrim( Z895TBM43_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z896TBM43_DOM_VAR_NM", GXutil.rtrim( Z896TBM43_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z919TBM43_CRT_DATETIME", localUtil.ttoc( Z919TBM43_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z912TBM43_CRT_USER_ID", GXutil.rtrim( Z912TBM43_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z920TBM43_UPD_DATETIME", localUtil.ttoc( Z920TBM43_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z914TBM43_UPD_USER_ID", GXutil.rtrim( Z914TBM43_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z921TBM43_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z921TBM43_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z897TBM43_VAR_DESC", GXutil.rtrim( Z897TBM43_VAR_DESC));
      GxWebStd.gx_hidden_field( httpContext, "Z898TBM43_SDTM_FLG", GXutil.rtrim( Z898TBM43_SDTM_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z899TBM43_CDASH_FLG", GXutil.rtrim( Z899TBM43_CDASH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z900TBM43_INPUT_TYPE_DIV", GXutil.rtrim( Z900TBM43_INPUT_TYPE_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z901TBM43_REQUIRED_FLG", GXutil.rtrim( Z901TBM43_REQUIRED_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z902TBM43_SAS_FIELD_NM", GXutil.rtrim( Z902TBM43_SAS_FIELD_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z903TBM43_ODM_DATA_TYPE", GXutil.rtrim( Z903TBM43_ODM_DATA_TYPE));
      GxWebStd.gx_hidden_field( httpContext, "Z904TBM43_NOTE", GXutil.rtrim( Z904TBM43_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z905TBM43_ORDER", GXutil.ltrim( localUtil.ntoc( Z905TBM43_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z907TBM43_VERSION", GXutil.rtrim( Z907TBM43_VERSION));
      GxWebStd.gx_hidden_field( httpContext, "Z906TBM43_DEL_FLG", GXutil.rtrim( Z906TBM43_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z913TBM43_CRT_PROG_NM", GXutil.rtrim( Z913TBM43_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z915TBM43_UPD_PROG_NM", GXutil.rtrim( Z915TBM43_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O921TBM43_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O921TBM43_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey1J54( )
   {
      A919TBM43_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n919TBM43_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A919TBM43_CRT_DATETIME", localUtil.ttoc( A919TBM43_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n919TBM43_CRT_DATETIME = (GXutil.nullDate().equals(A919TBM43_CRT_DATETIME) ? true : false) ;
      A912TBM43_CRT_USER_ID = "" ;
      n912TBM43_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A912TBM43_CRT_USER_ID", A912TBM43_CRT_USER_ID);
      n912TBM43_CRT_USER_ID = ((GXutil.strcmp("", A912TBM43_CRT_USER_ID)==0) ? true : false) ;
      A920TBM43_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n920TBM43_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A920TBM43_UPD_DATETIME", localUtil.ttoc( A920TBM43_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n920TBM43_UPD_DATETIME = (GXutil.nullDate().equals(A920TBM43_UPD_DATETIME) ? true : false) ;
      A914TBM43_UPD_USER_ID = "" ;
      n914TBM43_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A914TBM43_UPD_USER_ID", A914TBM43_UPD_USER_ID);
      n914TBM43_UPD_USER_ID = ((GXutil.strcmp("", A914TBM43_UPD_USER_ID)==0) ? true : false) ;
      A921TBM43_UPD_CNT = 0 ;
      n921TBM43_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
      n921TBM43_UPD_CNT = ((0==A921TBM43_UPD_CNT) ? true : false) ;
      A897TBM43_VAR_DESC = "" ;
      n897TBM43_VAR_DESC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A897TBM43_VAR_DESC", A897TBM43_VAR_DESC);
      n897TBM43_VAR_DESC = ((GXutil.strcmp("", A897TBM43_VAR_DESC)==0) ? true : false) ;
      A898TBM43_SDTM_FLG = "" ;
      n898TBM43_SDTM_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A898TBM43_SDTM_FLG", A898TBM43_SDTM_FLG);
      n898TBM43_SDTM_FLG = ((GXutil.strcmp("", A898TBM43_SDTM_FLG)==0) ? true : false) ;
      A899TBM43_CDASH_FLG = "" ;
      n899TBM43_CDASH_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A899TBM43_CDASH_FLG", A899TBM43_CDASH_FLG);
      n899TBM43_CDASH_FLG = ((GXutil.strcmp("", A899TBM43_CDASH_FLG)==0) ? true : false) ;
      A900TBM43_INPUT_TYPE_DIV = "" ;
      n900TBM43_INPUT_TYPE_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A900TBM43_INPUT_TYPE_DIV", A900TBM43_INPUT_TYPE_DIV);
      n900TBM43_INPUT_TYPE_DIV = ((GXutil.strcmp("", A900TBM43_INPUT_TYPE_DIV)==0) ? true : false) ;
      A901TBM43_REQUIRED_FLG = "" ;
      n901TBM43_REQUIRED_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A901TBM43_REQUIRED_FLG", A901TBM43_REQUIRED_FLG);
      n901TBM43_REQUIRED_FLG = ((GXutil.strcmp("", A901TBM43_REQUIRED_FLG)==0) ? true : false) ;
      A902TBM43_SAS_FIELD_NM = "" ;
      n902TBM43_SAS_FIELD_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A902TBM43_SAS_FIELD_NM", A902TBM43_SAS_FIELD_NM);
      n902TBM43_SAS_FIELD_NM = ((GXutil.strcmp("", A902TBM43_SAS_FIELD_NM)==0) ? true : false) ;
      A903TBM43_ODM_DATA_TYPE = "" ;
      n903TBM43_ODM_DATA_TYPE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A903TBM43_ODM_DATA_TYPE", A903TBM43_ODM_DATA_TYPE);
      n903TBM43_ODM_DATA_TYPE = ((GXutil.strcmp("", A903TBM43_ODM_DATA_TYPE)==0) ? true : false) ;
      A904TBM43_NOTE = "" ;
      n904TBM43_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A904TBM43_NOTE", A904TBM43_NOTE);
      n904TBM43_NOTE = ((GXutil.strcmp("", A904TBM43_NOTE)==0) ? true : false) ;
      A905TBM43_ORDER = 0 ;
      n905TBM43_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A905TBM43_ORDER", GXutil.ltrim( GXutil.str( A905TBM43_ORDER, 5, 0)));
      n905TBM43_ORDER = ((0==A905TBM43_ORDER) ? true : false) ;
      A907TBM43_VERSION = "" ;
      n907TBM43_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A907TBM43_VERSION", A907TBM43_VERSION);
      n907TBM43_VERSION = ((GXutil.strcmp("", A907TBM43_VERSION)==0) ? true : false) ;
      A906TBM43_DEL_FLG = "" ;
      n906TBM43_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A906TBM43_DEL_FLG", A906TBM43_DEL_FLG);
      n906TBM43_DEL_FLG = ((GXutil.strcmp("", A906TBM43_DEL_FLG)==0) ? true : false) ;
      A913TBM43_CRT_PROG_NM = "" ;
      n913TBM43_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A913TBM43_CRT_PROG_NM", A913TBM43_CRT_PROG_NM);
      n913TBM43_CRT_PROG_NM = ((GXutil.strcmp("", A913TBM43_CRT_PROG_NM)==0) ? true : false) ;
      A915TBM43_UPD_PROG_NM = "" ;
      n915TBM43_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A915TBM43_UPD_PROG_NM", A915TBM43_UPD_PROG_NM);
      n915TBM43_UPD_PROG_NM = ((GXutil.strcmp("", A915TBM43_UPD_PROG_NM)==0) ? true : false) ;
      O921TBM43_UPD_CNT = A921TBM43_UPD_CNT ;
      n921TBM43_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A921TBM43_UPD_CNT", GXutil.ltrim( GXutil.str( A921TBM43_UPD_CNT, 10, 0)));
   }

   public void initAll1J54( )
   {
      A894TBM43_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A894TBM43_STUDY_ID", GXutil.ltrim( GXutil.str( A894TBM43_STUDY_ID, 10, 0)));
      A895TBM43_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A895TBM43_DOM_CD", A895TBM43_DOM_CD);
      A896TBM43_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A896TBM43_DOM_VAR_NM", A896TBM43_DOM_VAR_NM);
      initializeNonKey1J54( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14573292");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm43_study_cdisc_item.js", "?14573292");
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
      lblTextblocktbm43_study_id_Internalname = "TEXTBLOCKTBM43_STUDY_ID" ;
      edtTBM43_STUDY_ID_Internalname = "TBM43_STUDY_ID" ;
      lblTextblocktbm43_dom_cd_Internalname = "TEXTBLOCKTBM43_DOM_CD" ;
      edtTBM43_DOM_CD_Internalname = "TBM43_DOM_CD" ;
      lblTextblocktbm43_dom_var_nm_Internalname = "TEXTBLOCKTBM43_DOM_VAR_NM" ;
      edtTBM43_DOM_VAR_NM_Internalname = "TBM43_DOM_VAR_NM" ;
      lblTextblocktbm43_var_desc_Internalname = "TEXTBLOCKTBM43_VAR_DESC" ;
      edtTBM43_VAR_DESC_Internalname = "TBM43_VAR_DESC" ;
      lblTextblocktbm43_sdtm_flg_Internalname = "TEXTBLOCKTBM43_SDTM_FLG" ;
      edtTBM43_SDTM_FLG_Internalname = "TBM43_SDTM_FLG" ;
      lblTextblocktbm43_cdash_flg_Internalname = "TEXTBLOCKTBM43_CDASH_FLG" ;
      edtTBM43_CDASH_FLG_Internalname = "TBM43_CDASH_FLG" ;
      lblTextblocktbm43_input_type_div_Internalname = "TEXTBLOCKTBM43_INPUT_TYPE_DIV" ;
      edtTBM43_INPUT_TYPE_DIV_Internalname = "TBM43_INPUT_TYPE_DIV" ;
      lblTextblocktbm43_required_flg_Internalname = "TEXTBLOCKTBM43_REQUIRED_FLG" ;
      edtTBM43_REQUIRED_FLG_Internalname = "TBM43_REQUIRED_FLG" ;
      lblTextblocktbm43_sas_field_nm_Internalname = "TEXTBLOCKTBM43_SAS_FIELD_NM" ;
      edtTBM43_SAS_FIELD_NM_Internalname = "TBM43_SAS_FIELD_NM" ;
      lblTextblocktbm43_odm_data_type_Internalname = "TEXTBLOCKTBM43_ODM_DATA_TYPE" ;
      edtTBM43_ODM_DATA_TYPE_Internalname = "TBM43_ODM_DATA_TYPE" ;
      lblTextblocktbm43_note_Internalname = "TEXTBLOCKTBM43_NOTE" ;
      edtTBM43_NOTE_Internalname = "TBM43_NOTE" ;
      lblTextblocktbm43_order_Internalname = "TEXTBLOCKTBM43_ORDER" ;
      edtTBM43_ORDER_Internalname = "TBM43_ORDER" ;
      lblTextblocktbm43_version_Internalname = "TEXTBLOCKTBM43_VERSION" ;
      edtTBM43_VERSION_Internalname = "TBM43_VERSION" ;
      lblTextblocktbm43_del_flg_Internalname = "TEXTBLOCKTBM43_DEL_FLG" ;
      edtTBM43_DEL_FLG_Internalname = "TBM43_DEL_FLG" ;
      lblTextblocktbm43_crt_datetime_Internalname = "TEXTBLOCKTBM43_CRT_DATETIME" ;
      edtTBM43_CRT_DATETIME_Internalname = "TBM43_CRT_DATETIME" ;
      lblTextblocktbm43_crt_user_id_Internalname = "TEXTBLOCKTBM43_CRT_USER_ID" ;
      edtTBM43_CRT_USER_ID_Internalname = "TBM43_CRT_USER_ID" ;
      lblTextblocktbm43_crt_prog_nm_Internalname = "TEXTBLOCKTBM43_CRT_PROG_NM" ;
      edtTBM43_CRT_PROG_NM_Internalname = "TBM43_CRT_PROG_NM" ;
      lblTextblocktbm43_upd_datetime_Internalname = "TEXTBLOCKTBM43_UPD_DATETIME" ;
      edtTBM43_UPD_DATETIME_Internalname = "TBM43_UPD_DATETIME" ;
      lblTextblocktbm43_upd_user_id_Internalname = "TEXTBLOCKTBM43_UPD_USER_ID" ;
      edtTBM43_UPD_USER_ID_Internalname = "TBM43_UPD_USER_ID" ;
      lblTextblocktbm43_upd_prog_nm_Internalname = "TEXTBLOCKTBM43_UPD_PROG_NM" ;
      edtTBM43_UPD_PROG_NM_Internalname = "TBM43_UPD_PROG_NM" ;
      lblTextblocktbm43_upd_cnt_Internalname = "TEXTBLOCKTBM43_UPD_CNT" ;
      edtTBM43_UPD_CNT_Internalname = "TBM43_UPD_CNT" ;
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
      edtTBM43_UPD_CNT_Jsonclick = "" ;
      edtTBM43_UPD_CNT_Enabled = 1 ;
      edtTBM43_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM43_UPD_PROG_NM_Enabled = 1 ;
      edtTBM43_UPD_USER_ID_Jsonclick = "" ;
      edtTBM43_UPD_USER_ID_Enabled = 1 ;
      edtTBM43_UPD_DATETIME_Jsonclick = "" ;
      edtTBM43_UPD_DATETIME_Enabled = 1 ;
      edtTBM43_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM43_CRT_PROG_NM_Enabled = 1 ;
      edtTBM43_CRT_USER_ID_Jsonclick = "" ;
      edtTBM43_CRT_USER_ID_Enabled = 1 ;
      edtTBM43_CRT_DATETIME_Jsonclick = "" ;
      edtTBM43_CRT_DATETIME_Enabled = 1 ;
      edtTBM43_DEL_FLG_Jsonclick = "" ;
      edtTBM43_DEL_FLG_Enabled = 1 ;
      edtTBM43_VERSION_Jsonclick = "" ;
      edtTBM43_VERSION_Enabled = 1 ;
      edtTBM43_ORDER_Jsonclick = "" ;
      edtTBM43_ORDER_Enabled = 1 ;
      edtTBM43_NOTE_Enabled = 1 ;
      edtTBM43_ODM_DATA_TYPE_Jsonclick = "" ;
      edtTBM43_ODM_DATA_TYPE_Enabled = 1 ;
      edtTBM43_SAS_FIELD_NM_Jsonclick = "" ;
      edtTBM43_SAS_FIELD_NM_Enabled = 1 ;
      edtTBM43_REQUIRED_FLG_Jsonclick = "" ;
      edtTBM43_REQUIRED_FLG_Enabled = 1 ;
      edtTBM43_INPUT_TYPE_DIV_Jsonclick = "" ;
      edtTBM43_INPUT_TYPE_DIV_Enabled = 1 ;
      edtTBM43_CDASH_FLG_Jsonclick = "" ;
      edtTBM43_CDASH_FLG_Enabled = 1 ;
      edtTBM43_SDTM_FLG_Jsonclick = "" ;
      edtTBM43_SDTM_FLG_Enabled = 1 ;
      edtTBM43_VAR_DESC_Jsonclick = "" ;
      edtTBM43_VAR_DESC_Enabled = 1 ;
      edtTBM43_DOM_VAR_NM_Jsonclick = "" ;
      edtTBM43_DOM_VAR_NM_Enabled = 1 ;
      edtTBM43_DOM_CD_Jsonclick = "" ;
      edtTBM43_DOM_CD_Enabled = 1 ;
      edtTBM43_STUDY_ID_Jsonclick = "" ;
      edtTBM43_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm43_crt_user_id1J54( String Gx_mode )
   {
      GXt_char3 = A912TBM43_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm43_study_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A912TBM43_CRT_USER_ID = GXt_char3 ;
      n912TBM43_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A912TBM43_CRT_USER_ID", A912TBM43_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A912TBM43_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm43_upd_user_id1J54( String Gx_mode )
   {
      GXt_char3 = A914TBM43_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm43_study_cdisc_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A914TBM43_UPD_USER_ID = GXt_char3 ;
      n914TBM43_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A914TBM43_UPD_USER_ID", A914TBM43_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A914TBM43_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM43_VAR_DESC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm43_dom_var_nm( long GX_Parm1 ,
                                       String GX_Parm2 ,
                                       String GX_Parm3 ,
                                       java.util.Date GX_Parm4 ,
                                       String GX_Parm5 ,
                                       java.util.Date GX_Parm6 ,
                                       String GX_Parm7 ,
                                       long GX_Parm8 ,
                                       String GX_Parm9 ,
                                       String GX_Parm10 ,
                                       String GX_Parm11 ,
                                       String GX_Parm12 ,
                                       String GX_Parm13 ,
                                       String GX_Parm14 ,
                                       String GX_Parm15 ,
                                       String GX_Parm16 ,
                                       int GX_Parm17 ,
                                       String GX_Parm18 ,
                                       String GX_Parm19 ,
                                       String GX_Parm20 ,
                                       String GX_Parm21 )
   {
      A894TBM43_STUDY_ID = GX_Parm1 ;
      A895TBM43_DOM_CD = GX_Parm2 ;
      A896TBM43_DOM_VAR_NM = GX_Parm3 ;
      A919TBM43_CRT_DATETIME = GX_Parm4 ;
      n919TBM43_CRT_DATETIME = false ;
      A912TBM43_CRT_USER_ID = GX_Parm5 ;
      n912TBM43_CRT_USER_ID = false ;
      A920TBM43_UPD_DATETIME = GX_Parm6 ;
      n920TBM43_UPD_DATETIME = false ;
      A914TBM43_UPD_USER_ID = GX_Parm7 ;
      n914TBM43_UPD_USER_ID = false ;
      A921TBM43_UPD_CNT = GX_Parm8 ;
      n921TBM43_UPD_CNT = false ;
      A897TBM43_VAR_DESC = GX_Parm9 ;
      n897TBM43_VAR_DESC = false ;
      A898TBM43_SDTM_FLG = GX_Parm10 ;
      n898TBM43_SDTM_FLG = false ;
      A899TBM43_CDASH_FLG = GX_Parm11 ;
      n899TBM43_CDASH_FLG = false ;
      A900TBM43_INPUT_TYPE_DIV = GX_Parm12 ;
      n900TBM43_INPUT_TYPE_DIV = false ;
      A901TBM43_REQUIRED_FLG = GX_Parm13 ;
      n901TBM43_REQUIRED_FLG = false ;
      A902TBM43_SAS_FIELD_NM = GX_Parm14 ;
      n902TBM43_SAS_FIELD_NM = false ;
      A903TBM43_ODM_DATA_TYPE = GX_Parm15 ;
      n903TBM43_ODM_DATA_TYPE = false ;
      A904TBM43_NOTE = GX_Parm16 ;
      n904TBM43_NOTE = false ;
      A905TBM43_ORDER = GX_Parm17 ;
      n905TBM43_ORDER = false ;
      A907TBM43_VERSION = GX_Parm18 ;
      n907TBM43_VERSION = false ;
      A906TBM43_DEL_FLG = GX_Parm19 ;
      n906TBM43_DEL_FLG = false ;
      A913TBM43_CRT_PROG_NM = GX_Parm20 ;
      n913TBM43_CRT_PROG_NM = false ;
      A915TBM43_UPD_PROG_NM = GX_Parm21 ;
      n915TBM43_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A919TBM43_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A912TBM43_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A920TBM43_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A914TBM43_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A921TBM43_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A897TBM43_VAR_DESC));
      isValidOutput.add(GXutil.rtrim( A898TBM43_SDTM_FLG));
      isValidOutput.add(GXutil.rtrim( A899TBM43_CDASH_FLG));
      isValidOutput.add(GXutil.rtrim( A900TBM43_INPUT_TYPE_DIV));
      isValidOutput.add(GXutil.rtrim( A901TBM43_REQUIRED_FLG));
      isValidOutput.add(GXutil.rtrim( A902TBM43_SAS_FIELD_NM));
      isValidOutput.add(GXutil.rtrim( A903TBM43_ODM_DATA_TYPE));
      isValidOutput.add(GXutil.rtrim( A904TBM43_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A905TBM43_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A907TBM43_VERSION));
      isValidOutput.add(GXutil.rtrim( A906TBM43_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A913TBM43_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A915TBM43_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z894TBM43_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z895TBM43_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z896TBM43_DOM_VAR_NM));
      isValidOutput.add(localUtil.ttoc( Z919TBM43_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z912TBM43_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z920TBM43_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z914TBM43_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z921TBM43_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z897TBM43_VAR_DESC));
      isValidOutput.add(GXutil.rtrim( Z898TBM43_SDTM_FLG));
      isValidOutput.add(GXutil.rtrim( Z899TBM43_CDASH_FLG));
      isValidOutput.add(GXutil.rtrim( Z900TBM43_INPUT_TYPE_DIV));
      isValidOutput.add(GXutil.rtrim( Z901TBM43_REQUIRED_FLG));
      isValidOutput.add(GXutil.rtrim( Z902TBM43_SAS_FIELD_NM));
      isValidOutput.add(GXutil.rtrim( Z903TBM43_ODM_DATA_TYPE));
      isValidOutput.add(GXutil.rtrim( Z904TBM43_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z905TBM43_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z907TBM43_VERSION));
      isValidOutput.add(GXutil.rtrim( Z906TBM43_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z913TBM43_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z915TBM43_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O921TBM43_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1172 */
                  S1172 ();
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
      lblTextblocktbm43_study_id_Jsonclick = "" ;
      lblTextblocktbm43_dom_cd_Jsonclick = "" ;
      A895TBM43_DOM_CD = "" ;
      lblTextblocktbm43_dom_var_nm_Jsonclick = "" ;
      A896TBM43_DOM_VAR_NM = "" ;
      lblTextblocktbm43_var_desc_Jsonclick = "" ;
      A897TBM43_VAR_DESC = "" ;
      lblTextblocktbm43_sdtm_flg_Jsonclick = "" ;
      A898TBM43_SDTM_FLG = "" ;
      lblTextblocktbm43_cdash_flg_Jsonclick = "" ;
      A899TBM43_CDASH_FLG = "" ;
      lblTextblocktbm43_input_type_div_Jsonclick = "" ;
      A900TBM43_INPUT_TYPE_DIV = "" ;
      lblTextblocktbm43_required_flg_Jsonclick = "" ;
      A901TBM43_REQUIRED_FLG = "" ;
      lblTextblocktbm43_sas_field_nm_Jsonclick = "" ;
      A902TBM43_SAS_FIELD_NM = "" ;
      lblTextblocktbm43_odm_data_type_Jsonclick = "" ;
      A903TBM43_ODM_DATA_TYPE = "" ;
      lblTextblocktbm43_note_Jsonclick = "" ;
      A904TBM43_NOTE = "" ;
      lblTextblocktbm43_order_Jsonclick = "" ;
      lblTextblocktbm43_version_Jsonclick = "" ;
      A907TBM43_VERSION = "" ;
      lblTextblocktbm43_del_flg_Jsonclick = "" ;
      A906TBM43_DEL_FLG = "" ;
      lblTextblocktbm43_crt_datetime_Jsonclick = "" ;
      A919TBM43_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm43_crt_user_id_Jsonclick = "" ;
      A912TBM43_CRT_USER_ID = "" ;
      lblTextblocktbm43_crt_prog_nm_Jsonclick = "" ;
      A913TBM43_CRT_PROG_NM = "" ;
      lblTextblocktbm43_upd_datetime_Jsonclick = "" ;
      A920TBM43_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm43_upd_user_id_Jsonclick = "" ;
      A914TBM43_UPD_USER_ID = "" ;
      lblTextblocktbm43_upd_prog_nm_Jsonclick = "" ;
      A915TBM43_UPD_PROG_NM = "" ;
      lblTextblocktbm43_upd_cnt_Jsonclick = "" ;
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
      Z895TBM43_DOM_CD = "" ;
      Z896TBM43_DOM_VAR_NM = "" ;
      Z919TBM43_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z912TBM43_CRT_USER_ID = "" ;
      Z920TBM43_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z914TBM43_UPD_USER_ID = "" ;
      Z897TBM43_VAR_DESC = "" ;
      Z898TBM43_SDTM_FLG = "" ;
      Z899TBM43_CDASH_FLG = "" ;
      Z900TBM43_INPUT_TYPE_DIV = "" ;
      Z901TBM43_REQUIRED_FLG = "" ;
      Z902TBM43_SAS_FIELD_NM = "" ;
      Z903TBM43_ODM_DATA_TYPE = "" ;
      Z904TBM43_NOTE = "" ;
      Z907TBM43_VERSION = "" ;
      Z906TBM43_DEL_FLG = "" ;
      Z913TBM43_CRT_PROG_NM = "" ;
      Z915TBM43_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV8W_TXT = "" ;
      T001J4_A894TBM43_STUDY_ID = new long[1] ;
      T001J4_A895TBM43_DOM_CD = new String[] {""} ;
      T001J4_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      T001J4_A919TBM43_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001J4_n919TBM43_CRT_DATETIME = new boolean[] {false} ;
      T001J4_A912TBM43_CRT_USER_ID = new String[] {""} ;
      T001J4_n912TBM43_CRT_USER_ID = new boolean[] {false} ;
      T001J4_A920TBM43_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001J4_n920TBM43_UPD_DATETIME = new boolean[] {false} ;
      T001J4_A914TBM43_UPD_USER_ID = new String[] {""} ;
      T001J4_n914TBM43_UPD_USER_ID = new boolean[] {false} ;
      T001J4_A921TBM43_UPD_CNT = new long[1] ;
      T001J4_n921TBM43_UPD_CNT = new boolean[] {false} ;
      T001J4_A897TBM43_VAR_DESC = new String[] {""} ;
      T001J4_n897TBM43_VAR_DESC = new boolean[] {false} ;
      T001J4_A898TBM43_SDTM_FLG = new String[] {""} ;
      T001J4_n898TBM43_SDTM_FLG = new boolean[] {false} ;
      T001J4_A899TBM43_CDASH_FLG = new String[] {""} ;
      T001J4_n899TBM43_CDASH_FLG = new boolean[] {false} ;
      T001J4_A900TBM43_INPUT_TYPE_DIV = new String[] {""} ;
      T001J4_n900TBM43_INPUT_TYPE_DIV = new boolean[] {false} ;
      T001J4_A901TBM43_REQUIRED_FLG = new String[] {""} ;
      T001J4_n901TBM43_REQUIRED_FLG = new boolean[] {false} ;
      T001J4_A902TBM43_SAS_FIELD_NM = new String[] {""} ;
      T001J4_n902TBM43_SAS_FIELD_NM = new boolean[] {false} ;
      T001J4_A903TBM43_ODM_DATA_TYPE = new String[] {""} ;
      T001J4_n903TBM43_ODM_DATA_TYPE = new boolean[] {false} ;
      T001J4_A904TBM43_NOTE = new String[] {""} ;
      T001J4_n904TBM43_NOTE = new boolean[] {false} ;
      T001J4_A905TBM43_ORDER = new int[1] ;
      T001J4_n905TBM43_ORDER = new boolean[] {false} ;
      T001J4_A907TBM43_VERSION = new String[] {""} ;
      T001J4_n907TBM43_VERSION = new boolean[] {false} ;
      T001J4_A906TBM43_DEL_FLG = new String[] {""} ;
      T001J4_n906TBM43_DEL_FLG = new boolean[] {false} ;
      T001J4_A913TBM43_CRT_PROG_NM = new String[] {""} ;
      T001J4_n913TBM43_CRT_PROG_NM = new boolean[] {false} ;
      T001J4_A915TBM43_UPD_PROG_NM = new String[] {""} ;
      T001J4_n915TBM43_UPD_PROG_NM = new boolean[] {false} ;
      T001J5_A894TBM43_STUDY_ID = new long[1] ;
      T001J5_A895TBM43_DOM_CD = new String[] {""} ;
      T001J5_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      T001J3_A894TBM43_STUDY_ID = new long[1] ;
      T001J3_A895TBM43_DOM_CD = new String[] {""} ;
      T001J3_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      T001J3_A919TBM43_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001J3_n919TBM43_CRT_DATETIME = new boolean[] {false} ;
      T001J3_A912TBM43_CRT_USER_ID = new String[] {""} ;
      T001J3_n912TBM43_CRT_USER_ID = new boolean[] {false} ;
      T001J3_A920TBM43_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001J3_n920TBM43_UPD_DATETIME = new boolean[] {false} ;
      T001J3_A914TBM43_UPD_USER_ID = new String[] {""} ;
      T001J3_n914TBM43_UPD_USER_ID = new boolean[] {false} ;
      T001J3_A921TBM43_UPD_CNT = new long[1] ;
      T001J3_n921TBM43_UPD_CNT = new boolean[] {false} ;
      T001J3_A897TBM43_VAR_DESC = new String[] {""} ;
      T001J3_n897TBM43_VAR_DESC = new boolean[] {false} ;
      T001J3_A898TBM43_SDTM_FLG = new String[] {""} ;
      T001J3_n898TBM43_SDTM_FLG = new boolean[] {false} ;
      T001J3_A899TBM43_CDASH_FLG = new String[] {""} ;
      T001J3_n899TBM43_CDASH_FLG = new boolean[] {false} ;
      T001J3_A900TBM43_INPUT_TYPE_DIV = new String[] {""} ;
      T001J3_n900TBM43_INPUT_TYPE_DIV = new boolean[] {false} ;
      T001J3_A901TBM43_REQUIRED_FLG = new String[] {""} ;
      T001J3_n901TBM43_REQUIRED_FLG = new boolean[] {false} ;
      T001J3_A902TBM43_SAS_FIELD_NM = new String[] {""} ;
      T001J3_n902TBM43_SAS_FIELD_NM = new boolean[] {false} ;
      T001J3_A903TBM43_ODM_DATA_TYPE = new String[] {""} ;
      T001J3_n903TBM43_ODM_DATA_TYPE = new boolean[] {false} ;
      T001J3_A904TBM43_NOTE = new String[] {""} ;
      T001J3_n904TBM43_NOTE = new boolean[] {false} ;
      T001J3_A905TBM43_ORDER = new int[1] ;
      T001J3_n905TBM43_ORDER = new boolean[] {false} ;
      T001J3_A907TBM43_VERSION = new String[] {""} ;
      T001J3_n907TBM43_VERSION = new boolean[] {false} ;
      T001J3_A906TBM43_DEL_FLG = new String[] {""} ;
      T001J3_n906TBM43_DEL_FLG = new boolean[] {false} ;
      T001J3_A913TBM43_CRT_PROG_NM = new String[] {""} ;
      T001J3_n913TBM43_CRT_PROG_NM = new boolean[] {false} ;
      T001J3_A915TBM43_UPD_PROG_NM = new String[] {""} ;
      T001J3_n915TBM43_UPD_PROG_NM = new boolean[] {false} ;
      sMode54 = "" ;
      T001J6_A894TBM43_STUDY_ID = new long[1] ;
      T001J6_A895TBM43_DOM_CD = new String[] {""} ;
      T001J6_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      T001J7_A894TBM43_STUDY_ID = new long[1] ;
      T001J7_A895TBM43_DOM_CD = new String[] {""} ;
      T001J7_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      T001J2_A894TBM43_STUDY_ID = new long[1] ;
      T001J2_A895TBM43_DOM_CD = new String[] {""} ;
      T001J2_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      T001J2_A919TBM43_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001J2_n919TBM43_CRT_DATETIME = new boolean[] {false} ;
      T001J2_A912TBM43_CRT_USER_ID = new String[] {""} ;
      T001J2_n912TBM43_CRT_USER_ID = new boolean[] {false} ;
      T001J2_A920TBM43_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001J2_n920TBM43_UPD_DATETIME = new boolean[] {false} ;
      T001J2_A914TBM43_UPD_USER_ID = new String[] {""} ;
      T001J2_n914TBM43_UPD_USER_ID = new boolean[] {false} ;
      T001J2_A921TBM43_UPD_CNT = new long[1] ;
      T001J2_n921TBM43_UPD_CNT = new boolean[] {false} ;
      T001J2_A897TBM43_VAR_DESC = new String[] {""} ;
      T001J2_n897TBM43_VAR_DESC = new boolean[] {false} ;
      T001J2_A898TBM43_SDTM_FLG = new String[] {""} ;
      T001J2_n898TBM43_SDTM_FLG = new boolean[] {false} ;
      T001J2_A899TBM43_CDASH_FLG = new String[] {""} ;
      T001J2_n899TBM43_CDASH_FLG = new boolean[] {false} ;
      T001J2_A900TBM43_INPUT_TYPE_DIV = new String[] {""} ;
      T001J2_n900TBM43_INPUT_TYPE_DIV = new boolean[] {false} ;
      T001J2_A901TBM43_REQUIRED_FLG = new String[] {""} ;
      T001J2_n901TBM43_REQUIRED_FLG = new boolean[] {false} ;
      T001J2_A902TBM43_SAS_FIELD_NM = new String[] {""} ;
      T001J2_n902TBM43_SAS_FIELD_NM = new boolean[] {false} ;
      T001J2_A903TBM43_ODM_DATA_TYPE = new String[] {""} ;
      T001J2_n903TBM43_ODM_DATA_TYPE = new boolean[] {false} ;
      T001J2_A904TBM43_NOTE = new String[] {""} ;
      T001J2_n904TBM43_NOTE = new boolean[] {false} ;
      T001J2_A905TBM43_ORDER = new int[1] ;
      T001J2_n905TBM43_ORDER = new boolean[] {false} ;
      T001J2_A907TBM43_VERSION = new String[] {""} ;
      T001J2_n907TBM43_VERSION = new boolean[] {false} ;
      T001J2_A906TBM43_DEL_FLG = new String[] {""} ;
      T001J2_n906TBM43_DEL_FLG = new boolean[] {false} ;
      T001J2_A913TBM43_CRT_PROG_NM = new String[] {""} ;
      T001J2_n913TBM43_CRT_PROG_NM = new boolean[] {false} ;
      T001J2_A915TBM43_UPD_PROG_NM = new String[] {""} ;
      T001J2_n915TBM43_UPD_PROG_NM = new boolean[] {false} ;
      T001J11_A894TBM43_STUDY_ID = new long[1] ;
      T001J11_A895TBM43_DOM_CD = new String[] {""} ;
      T001J11_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm43_study_cdisc_item__default(),
         new Object[] {
             new Object[] {
            T001J2_A894TBM43_STUDY_ID, T001J2_A895TBM43_DOM_CD, T001J2_A896TBM43_DOM_VAR_NM, T001J2_A919TBM43_CRT_DATETIME, T001J2_n919TBM43_CRT_DATETIME, T001J2_A912TBM43_CRT_USER_ID, T001J2_n912TBM43_CRT_USER_ID, T001J2_A920TBM43_UPD_DATETIME, T001J2_n920TBM43_UPD_DATETIME, T001J2_A914TBM43_UPD_USER_ID,
            T001J2_n914TBM43_UPD_USER_ID, T001J2_A921TBM43_UPD_CNT, T001J2_n921TBM43_UPD_CNT, T001J2_A897TBM43_VAR_DESC, T001J2_n897TBM43_VAR_DESC, T001J2_A898TBM43_SDTM_FLG, T001J2_n898TBM43_SDTM_FLG, T001J2_A899TBM43_CDASH_FLG, T001J2_n899TBM43_CDASH_FLG, T001J2_A900TBM43_INPUT_TYPE_DIV,
            T001J2_n900TBM43_INPUT_TYPE_DIV, T001J2_A901TBM43_REQUIRED_FLG, T001J2_n901TBM43_REQUIRED_FLG, T001J2_A902TBM43_SAS_FIELD_NM, T001J2_n902TBM43_SAS_FIELD_NM, T001J2_A903TBM43_ODM_DATA_TYPE, T001J2_n903TBM43_ODM_DATA_TYPE, T001J2_A904TBM43_NOTE, T001J2_n904TBM43_NOTE, T001J2_A905TBM43_ORDER,
            T001J2_n905TBM43_ORDER, T001J2_A907TBM43_VERSION, T001J2_n907TBM43_VERSION, T001J2_A906TBM43_DEL_FLG, T001J2_n906TBM43_DEL_FLG, T001J2_A913TBM43_CRT_PROG_NM, T001J2_n913TBM43_CRT_PROG_NM, T001J2_A915TBM43_UPD_PROG_NM, T001J2_n915TBM43_UPD_PROG_NM
            }
            , new Object[] {
            T001J3_A894TBM43_STUDY_ID, T001J3_A895TBM43_DOM_CD, T001J3_A896TBM43_DOM_VAR_NM, T001J3_A919TBM43_CRT_DATETIME, T001J3_n919TBM43_CRT_DATETIME, T001J3_A912TBM43_CRT_USER_ID, T001J3_n912TBM43_CRT_USER_ID, T001J3_A920TBM43_UPD_DATETIME, T001J3_n920TBM43_UPD_DATETIME, T001J3_A914TBM43_UPD_USER_ID,
            T001J3_n914TBM43_UPD_USER_ID, T001J3_A921TBM43_UPD_CNT, T001J3_n921TBM43_UPD_CNT, T001J3_A897TBM43_VAR_DESC, T001J3_n897TBM43_VAR_DESC, T001J3_A898TBM43_SDTM_FLG, T001J3_n898TBM43_SDTM_FLG, T001J3_A899TBM43_CDASH_FLG, T001J3_n899TBM43_CDASH_FLG, T001J3_A900TBM43_INPUT_TYPE_DIV,
            T001J3_n900TBM43_INPUT_TYPE_DIV, T001J3_A901TBM43_REQUIRED_FLG, T001J3_n901TBM43_REQUIRED_FLG, T001J3_A902TBM43_SAS_FIELD_NM, T001J3_n902TBM43_SAS_FIELD_NM, T001J3_A903TBM43_ODM_DATA_TYPE, T001J3_n903TBM43_ODM_DATA_TYPE, T001J3_A904TBM43_NOTE, T001J3_n904TBM43_NOTE, T001J3_A905TBM43_ORDER,
            T001J3_n905TBM43_ORDER, T001J3_A907TBM43_VERSION, T001J3_n907TBM43_VERSION, T001J3_A906TBM43_DEL_FLG, T001J3_n906TBM43_DEL_FLG, T001J3_A913TBM43_CRT_PROG_NM, T001J3_n913TBM43_CRT_PROG_NM, T001J3_A915TBM43_UPD_PROG_NM, T001J3_n915TBM43_UPD_PROG_NM
            }
            , new Object[] {
            T001J4_A894TBM43_STUDY_ID, T001J4_A895TBM43_DOM_CD, T001J4_A896TBM43_DOM_VAR_NM, T001J4_A919TBM43_CRT_DATETIME, T001J4_n919TBM43_CRT_DATETIME, T001J4_A912TBM43_CRT_USER_ID, T001J4_n912TBM43_CRT_USER_ID, T001J4_A920TBM43_UPD_DATETIME, T001J4_n920TBM43_UPD_DATETIME, T001J4_A914TBM43_UPD_USER_ID,
            T001J4_n914TBM43_UPD_USER_ID, T001J4_A921TBM43_UPD_CNT, T001J4_n921TBM43_UPD_CNT, T001J4_A897TBM43_VAR_DESC, T001J4_n897TBM43_VAR_DESC, T001J4_A898TBM43_SDTM_FLG, T001J4_n898TBM43_SDTM_FLG, T001J4_A899TBM43_CDASH_FLG, T001J4_n899TBM43_CDASH_FLG, T001J4_A900TBM43_INPUT_TYPE_DIV,
            T001J4_n900TBM43_INPUT_TYPE_DIV, T001J4_A901TBM43_REQUIRED_FLG, T001J4_n901TBM43_REQUIRED_FLG, T001J4_A902TBM43_SAS_FIELD_NM, T001J4_n902TBM43_SAS_FIELD_NM, T001J4_A903TBM43_ODM_DATA_TYPE, T001J4_n903TBM43_ODM_DATA_TYPE, T001J4_A904TBM43_NOTE, T001J4_n904TBM43_NOTE, T001J4_A905TBM43_ORDER,
            T001J4_n905TBM43_ORDER, T001J4_A907TBM43_VERSION, T001J4_n907TBM43_VERSION, T001J4_A906TBM43_DEL_FLG, T001J4_n906TBM43_DEL_FLG, T001J4_A913TBM43_CRT_PROG_NM, T001J4_n913TBM43_CRT_PROG_NM, T001J4_A915TBM43_UPD_PROG_NM, T001J4_n915TBM43_UPD_PROG_NM
            }
            , new Object[] {
            T001J5_A894TBM43_STUDY_ID, T001J5_A895TBM43_DOM_CD, T001J5_A896TBM43_DOM_VAR_NM
            }
            , new Object[] {
            T001J6_A894TBM43_STUDY_ID, T001J6_A895TBM43_DOM_CD, T001J6_A896TBM43_DOM_VAR_NM
            }
            , new Object[] {
            T001J7_A894TBM43_STUDY_ID, T001J7_A895TBM43_DOM_CD, T001J7_A896TBM43_DOM_VAR_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001J11_A894TBM43_STUDY_ID, T001J11_A895TBM43_DOM_CD, T001J11_A896TBM43_DOM_VAR_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM43_STUDY_CDISC_ITEM" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound54 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM43_STUDY_ID_Enabled ;
   private int edtTBM43_DOM_CD_Enabled ;
   private int edtTBM43_DOM_VAR_NM_Enabled ;
   private int edtTBM43_VAR_DESC_Enabled ;
   private int edtTBM43_SDTM_FLG_Enabled ;
   private int edtTBM43_CDASH_FLG_Enabled ;
   private int edtTBM43_INPUT_TYPE_DIV_Enabled ;
   private int edtTBM43_REQUIRED_FLG_Enabled ;
   private int edtTBM43_SAS_FIELD_NM_Enabled ;
   private int edtTBM43_ODM_DATA_TYPE_Enabled ;
   private int edtTBM43_NOTE_Enabled ;
   private int A905TBM43_ORDER ;
   private int edtTBM43_ORDER_Enabled ;
   private int edtTBM43_VERSION_Enabled ;
   private int edtTBM43_DEL_FLG_Enabled ;
   private int edtTBM43_CRT_DATETIME_Enabled ;
   private int edtTBM43_CRT_USER_ID_Enabled ;
   private int edtTBM43_CRT_PROG_NM_Enabled ;
   private int edtTBM43_UPD_DATETIME_Enabled ;
   private int edtTBM43_UPD_USER_ID_Enabled ;
   private int edtTBM43_UPD_PROG_NM_Enabled ;
   private int edtTBM43_UPD_CNT_Enabled ;
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
   private int Z905TBM43_ORDER ;
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A894TBM43_STUDY_ID ;
   private long A921TBM43_UPD_CNT ;
   private long Z894TBM43_STUDY_ID ;
   private long Z921TBM43_UPD_CNT ;
   private long O921TBM43_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM43_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm43_study_id_Internalname ;
   private String lblTextblocktbm43_study_id_Jsonclick ;
   private String edtTBM43_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm43_dom_cd_Internalname ;
   private String lblTextblocktbm43_dom_cd_Jsonclick ;
   private String edtTBM43_DOM_CD_Internalname ;
   private String edtTBM43_DOM_CD_Jsonclick ;
   private String lblTextblocktbm43_dom_var_nm_Internalname ;
   private String lblTextblocktbm43_dom_var_nm_Jsonclick ;
   private String edtTBM43_DOM_VAR_NM_Internalname ;
   private String edtTBM43_DOM_VAR_NM_Jsonclick ;
   private String lblTextblocktbm43_var_desc_Internalname ;
   private String lblTextblocktbm43_var_desc_Jsonclick ;
   private String edtTBM43_VAR_DESC_Internalname ;
   private String edtTBM43_VAR_DESC_Jsonclick ;
   private String lblTextblocktbm43_sdtm_flg_Internalname ;
   private String lblTextblocktbm43_sdtm_flg_Jsonclick ;
   private String edtTBM43_SDTM_FLG_Internalname ;
   private String edtTBM43_SDTM_FLG_Jsonclick ;
   private String lblTextblocktbm43_cdash_flg_Internalname ;
   private String lblTextblocktbm43_cdash_flg_Jsonclick ;
   private String edtTBM43_CDASH_FLG_Internalname ;
   private String edtTBM43_CDASH_FLG_Jsonclick ;
   private String lblTextblocktbm43_input_type_div_Internalname ;
   private String lblTextblocktbm43_input_type_div_Jsonclick ;
   private String edtTBM43_INPUT_TYPE_DIV_Internalname ;
   private String edtTBM43_INPUT_TYPE_DIV_Jsonclick ;
   private String lblTextblocktbm43_required_flg_Internalname ;
   private String lblTextblocktbm43_required_flg_Jsonclick ;
   private String edtTBM43_REQUIRED_FLG_Internalname ;
   private String edtTBM43_REQUIRED_FLG_Jsonclick ;
   private String lblTextblocktbm43_sas_field_nm_Internalname ;
   private String lblTextblocktbm43_sas_field_nm_Jsonclick ;
   private String edtTBM43_SAS_FIELD_NM_Internalname ;
   private String edtTBM43_SAS_FIELD_NM_Jsonclick ;
   private String lblTextblocktbm43_odm_data_type_Internalname ;
   private String lblTextblocktbm43_odm_data_type_Jsonclick ;
   private String edtTBM43_ODM_DATA_TYPE_Internalname ;
   private String edtTBM43_ODM_DATA_TYPE_Jsonclick ;
   private String lblTextblocktbm43_note_Internalname ;
   private String lblTextblocktbm43_note_Jsonclick ;
   private String edtTBM43_NOTE_Internalname ;
   private String lblTextblocktbm43_order_Internalname ;
   private String lblTextblocktbm43_order_Jsonclick ;
   private String edtTBM43_ORDER_Internalname ;
   private String edtTBM43_ORDER_Jsonclick ;
   private String lblTextblocktbm43_version_Internalname ;
   private String lblTextblocktbm43_version_Jsonclick ;
   private String edtTBM43_VERSION_Internalname ;
   private String edtTBM43_VERSION_Jsonclick ;
   private String lblTextblocktbm43_del_flg_Internalname ;
   private String lblTextblocktbm43_del_flg_Jsonclick ;
   private String edtTBM43_DEL_FLG_Internalname ;
   private String edtTBM43_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm43_crt_datetime_Internalname ;
   private String lblTextblocktbm43_crt_datetime_Jsonclick ;
   private String edtTBM43_CRT_DATETIME_Internalname ;
   private String edtTBM43_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm43_crt_user_id_Internalname ;
   private String lblTextblocktbm43_crt_user_id_Jsonclick ;
   private String edtTBM43_CRT_USER_ID_Internalname ;
   private String edtTBM43_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm43_crt_prog_nm_Internalname ;
   private String lblTextblocktbm43_crt_prog_nm_Jsonclick ;
   private String edtTBM43_CRT_PROG_NM_Internalname ;
   private String edtTBM43_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm43_upd_datetime_Internalname ;
   private String lblTextblocktbm43_upd_datetime_Jsonclick ;
   private String edtTBM43_UPD_DATETIME_Internalname ;
   private String edtTBM43_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm43_upd_user_id_Internalname ;
   private String lblTextblocktbm43_upd_user_id_Jsonclick ;
   private String edtTBM43_UPD_USER_ID_Internalname ;
   private String edtTBM43_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm43_upd_prog_nm_Internalname ;
   private String lblTextblocktbm43_upd_prog_nm_Jsonclick ;
   private String edtTBM43_UPD_PROG_NM_Internalname ;
   private String edtTBM43_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm43_upd_cnt_Internalname ;
   private String lblTextblocktbm43_upd_cnt_Jsonclick ;
   private String edtTBM43_UPD_CNT_Internalname ;
   private String edtTBM43_UPD_CNT_Jsonclick ;
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
   private String sMode54 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A919TBM43_CRT_DATETIME ;
   private java.util.Date A920TBM43_UPD_DATETIME ;
   private java.util.Date Z919TBM43_CRT_DATETIME ;
   private java.util.Date Z920TBM43_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n897TBM43_VAR_DESC ;
   private boolean n898TBM43_SDTM_FLG ;
   private boolean n899TBM43_CDASH_FLG ;
   private boolean n900TBM43_INPUT_TYPE_DIV ;
   private boolean n901TBM43_REQUIRED_FLG ;
   private boolean n902TBM43_SAS_FIELD_NM ;
   private boolean n903TBM43_ODM_DATA_TYPE ;
   private boolean n904TBM43_NOTE ;
   private boolean n905TBM43_ORDER ;
   private boolean n907TBM43_VERSION ;
   private boolean n906TBM43_DEL_FLG ;
   private boolean n919TBM43_CRT_DATETIME ;
   private boolean n912TBM43_CRT_USER_ID ;
   private boolean n913TBM43_CRT_PROG_NM ;
   private boolean n920TBM43_UPD_DATETIME ;
   private boolean n914TBM43_UPD_USER_ID ;
   private boolean n915TBM43_UPD_PROG_NM ;
   private boolean n921TBM43_UPD_CNT ;
   private boolean Gx_longc ;
   private String A895TBM43_DOM_CD ;
   private String A896TBM43_DOM_VAR_NM ;
   private String A897TBM43_VAR_DESC ;
   private String A898TBM43_SDTM_FLG ;
   private String A899TBM43_CDASH_FLG ;
   private String A900TBM43_INPUT_TYPE_DIV ;
   private String A901TBM43_REQUIRED_FLG ;
   private String A902TBM43_SAS_FIELD_NM ;
   private String A903TBM43_ODM_DATA_TYPE ;
   private String A904TBM43_NOTE ;
   private String A907TBM43_VERSION ;
   private String A906TBM43_DEL_FLG ;
   private String A912TBM43_CRT_USER_ID ;
   private String A913TBM43_CRT_PROG_NM ;
   private String A914TBM43_UPD_USER_ID ;
   private String A915TBM43_UPD_PROG_NM ;
   private String Z895TBM43_DOM_CD ;
   private String Z896TBM43_DOM_VAR_NM ;
   private String Z912TBM43_CRT_USER_ID ;
   private String Z914TBM43_UPD_USER_ID ;
   private String Z897TBM43_VAR_DESC ;
   private String Z898TBM43_SDTM_FLG ;
   private String Z899TBM43_CDASH_FLG ;
   private String Z900TBM43_INPUT_TYPE_DIV ;
   private String Z901TBM43_REQUIRED_FLG ;
   private String Z902TBM43_SAS_FIELD_NM ;
   private String Z903TBM43_ODM_DATA_TYPE ;
   private String Z904TBM43_NOTE ;
   private String Z907TBM43_VERSION ;
   private String Z906TBM43_DEL_FLG ;
   private String Z913TBM43_CRT_PROG_NM ;
   private String Z915TBM43_UPD_PROG_NM ;
   private String AV7W_BC_FLG ;
   private String AV8W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T001J4_A894TBM43_STUDY_ID ;
   private String[] T001J4_A895TBM43_DOM_CD ;
   private String[] T001J4_A896TBM43_DOM_VAR_NM ;
   private java.util.Date[] T001J4_A919TBM43_CRT_DATETIME ;
   private boolean[] T001J4_n919TBM43_CRT_DATETIME ;
   private String[] T001J4_A912TBM43_CRT_USER_ID ;
   private boolean[] T001J4_n912TBM43_CRT_USER_ID ;
   private java.util.Date[] T001J4_A920TBM43_UPD_DATETIME ;
   private boolean[] T001J4_n920TBM43_UPD_DATETIME ;
   private String[] T001J4_A914TBM43_UPD_USER_ID ;
   private boolean[] T001J4_n914TBM43_UPD_USER_ID ;
   private long[] T001J4_A921TBM43_UPD_CNT ;
   private boolean[] T001J4_n921TBM43_UPD_CNT ;
   private String[] T001J4_A897TBM43_VAR_DESC ;
   private boolean[] T001J4_n897TBM43_VAR_DESC ;
   private String[] T001J4_A898TBM43_SDTM_FLG ;
   private boolean[] T001J4_n898TBM43_SDTM_FLG ;
   private String[] T001J4_A899TBM43_CDASH_FLG ;
   private boolean[] T001J4_n899TBM43_CDASH_FLG ;
   private String[] T001J4_A900TBM43_INPUT_TYPE_DIV ;
   private boolean[] T001J4_n900TBM43_INPUT_TYPE_DIV ;
   private String[] T001J4_A901TBM43_REQUIRED_FLG ;
   private boolean[] T001J4_n901TBM43_REQUIRED_FLG ;
   private String[] T001J4_A902TBM43_SAS_FIELD_NM ;
   private boolean[] T001J4_n902TBM43_SAS_FIELD_NM ;
   private String[] T001J4_A903TBM43_ODM_DATA_TYPE ;
   private boolean[] T001J4_n903TBM43_ODM_DATA_TYPE ;
   private String[] T001J4_A904TBM43_NOTE ;
   private boolean[] T001J4_n904TBM43_NOTE ;
   private int[] T001J4_A905TBM43_ORDER ;
   private boolean[] T001J4_n905TBM43_ORDER ;
   private String[] T001J4_A907TBM43_VERSION ;
   private boolean[] T001J4_n907TBM43_VERSION ;
   private String[] T001J4_A906TBM43_DEL_FLG ;
   private boolean[] T001J4_n906TBM43_DEL_FLG ;
   private String[] T001J4_A913TBM43_CRT_PROG_NM ;
   private boolean[] T001J4_n913TBM43_CRT_PROG_NM ;
   private String[] T001J4_A915TBM43_UPD_PROG_NM ;
   private boolean[] T001J4_n915TBM43_UPD_PROG_NM ;
   private long[] T001J5_A894TBM43_STUDY_ID ;
   private String[] T001J5_A895TBM43_DOM_CD ;
   private String[] T001J5_A896TBM43_DOM_VAR_NM ;
   private long[] T001J3_A894TBM43_STUDY_ID ;
   private String[] T001J3_A895TBM43_DOM_CD ;
   private String[] T001J3_A896TBM43_DOM_VAR_NM ;
   private java.util.Date[] T001J3_A919TBM43_CRT_DATETIME ;
   private boolean[] T001J3_n919TBM43_CRT_DATETIME ;
   private String[] T001J3_A912TBM43_CRT_USER_ID ;
   private boolean[] T001J3_n912TBM43_CRT_USER_ID ;
   private java.util.Date[] T001J3_A920TBM43_UPD_DATETIME ;
   private boolean[] T001J3_n920TBM43_UPD_DATETIME ;
   private String[] T001J3_A914TBM43_UPD_USER_ID ;
   private boolean[] T001J3_n914TBM43_UPD_USER_ID ;
   private long[] T001J3_A921TBM43_UPD_CNT ;
   private boolean[] T001J3_n921TBM43_UPD_CNT ;
   private String[] T001J3_A897TBM43_VAR_DESC ;
   private boolean[] T001J3_n897TBM43_VAR_DESC ;
   private String[] T001J3_A898TBM43_SDTM_FLG ;
   private boolean[] T001J3_n898TBM43_SDTM_FLG ;
   private String[] T001J3_A899TBM43_CDASH_FLG ;
   private boolean[] T001J3_n899TBM43_CDASH_FLG ;
   private String[] T001J3_A900TBM43_INPUT_TYPE_DIV ;
   private boolean[] T001J3_n900TBM43_INPUT_TYPE_DIV ;
   private String[] T001J3_A901TBM43_REQUIRED_FLG ;
   private boolean[] T001J3_n901TBM43_REQUIRED_FLG ;
   private String[] T001J3_A902TBM43_SAS_FIELD_NM ;
   private boolean[] T001J3_n902TBM43_SAS_FIELD_NM ;
   private String[] T001J3_A903TBM43_ODM_DATA_TYPE ;
   private boolean[] T001J3_n903TBM43_ODM_DATA_TYPE ;
   private String[] T001J3_A904TBM43_NOTE ;
   private boolean[] T001J3_n904TBM43_NOTE ;
   private int[] T001J3_A905TBM43_ORDER ;
   private boolean[] T001J3_n905TBM43_ORDER ;
   private String[] T001J3_A907TBM43_VERSION ;
   private boolean[] T001J3_n907TBM43_VERSION ;
   private String[] T001J3_A906TBM43_DEL_FLG ;
   private boolean[] T001J3_n906TBM43_DEL_FLG ;
   private String[] T001J3_A913TBM43_CRT_PROG_NM ;
   private boolean[] T001J3_n913TBM43_CRT_PROG_NM ;
   private String[] T001J3_A915TBM43_UPD_PROG_NM ;
   private boolean[] T001J3_n915TBM43_UPD_PROG_NM ;
   private long[] T001J6_A894TBM43_STUDY_ID ;
   private String[] T001J6_A895TBM43_DOM_CD ;
   private String[] T001J6_A896TBM43_DOM_VAR_NM ;
   private long[] T001J7_A894TBM43_STUDY_ID ;
   private String[] T001J7_A895TBM43_DOM_CD ;
   private String[] T001J7_A896TBM43_DOM_VAR_NM ;
   private long[] T001J2_A894TBM43_STUDY_ID ;
   private String[] T001J2_A895TBM43_DOM_CD ;
   private String[] T001J2_A896TBM43_DOM_VAR_NM ;
   private java.util.Date[] T001J2_A919TBM43_CRT_DATETIME ;
   private boolean[] T001J2_n919TBM43_CRT_DATETIME ;
   private String[] T001J2_A912TBM43_CRT_USER_ID ;
   private boolean[] T001J2_n912TBM43_CRT_USER_ID ;
   private java.util.Date[] T001J2_A920TBM43_UPD_DATETIME ;
   private boolean[] T001J2_n920TBM43_UPD_DATETIME ;
   private String[] T001J2_A914TBM43_UPD_USER_ID ;
   private boolean[] T001J2_n914TBM43_UPD_USER_ID ;
   private long[] T001J2_A921TBM43_UPD_CNT ;
   private boolean[] T001J2_n921TBM43_UPD_CNT ;
   private String[] T001J2_A897TBM43_VAR_DESC ;
   private boolean[] T001J2_n897TBM43_VAR_DESC ;
   private String[] T001J2_A898TBM43_SDTM_FLG ;
   private boolean[] T001J2_n898TBM43_SDTM_FLG ;
   private String[] T001J2_A899TBM43_CDASH_FLG ;
   private boolean[] T001J2_n899TBM43_CDASH_FLG ;
   private String[] T001J2_A900TBM43_INPUT_TYPE_DIV ;
   private boolean[] T001J2_n900TBM43_INPUT_TYPE_DIV ;
   private String[] T001J2_A901TBM43_REQUIRED_FLG ;
   private boolean[] T001J2_n901TBM43_REQUIRED_FLG ;
   private String[] T001J2_A902TBM43_SAS_FIELD_NM ;
   private boolean[] T001J2_n902TBM43_SAS_FIELD_NM ;
   private String[] T001J2_A903TBM43_ODM_DATA_TYPE ;
   private boolean[] T001J2_n903TBM43_ODM_DATA_TYPE ;
   private String[] T001J2_A904TBM43_NOTE ;
   private boolean[] T001J2_n904TBM43_NOTE ;
   private int[] T001J2_A905TBM43_ORDER ;
   private boolean[] T001J2_n905TBM43_ORDER ;
   private String[] T001J2_A907TBM43_VERSION ;
   private boolean[] T001J2_n907TBM43_VERSION ;
   private String[] T001J2_A906TBM43_DEL_FLG ;
   private boolean[] T001J2_n906TBM43_DEL_FLG ;
   private String[] T001J2_A913TBM43_CRT_PROG_NM ;
   private boolean[] T001J2_n913TBM43_CRT_PROG_NM ;
   private String[] T001J2_A915TBM43_UPD_PROG_NM ;
   private boolean[] T001J2_n915TBM43_UPD_PROG_NM ;
   private long[] T001J11_A894TBM43_STUDY_ID ;
   private String[] T001J11_A895TBM43_DOM_CD ;
   private String[] T001J11_A896TBM43_DOM_VAR_NM ;
}

final  class tbm43_study_cdisc_item__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001J2", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`, `TBM43_CRT_DATETIME`, `TBM43_CRT_USER_ID`, `TBM43_UPD_DATETIME`, `TBM43_UPD_USER_ID`, `TBM43_UPD_CNT`, `TBM43_VAR_DESC`, `TBM43_SDTM_FLG`, `TBM43_CDASH_FLG`, `TBM43_INPUT_TYPE_DIV`, `TBM43_REQUIRED_FLG`, `TBM43_SAS_FIELD_NM`, `TBM43_ODM_DATA_TYPE`, `TBM43_NOTE`, `TBM43_ORDER`, `TBM43_VERSION`, `TBM43_DEL_FLG`, `TBM43_CRT_PROG_NM`, `TBM43_UPD_PROG_NM` FROM `TBM43_STUDY_CDISC_ITEM` WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001J3", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`, `TBM43_CRT_DATETIME`, `TBM43_CRT_USER_ID`, `TBM43_UPD_DATETIME`, `TBM43_UPD_USER_ID`, `TBM43_UPD_CNT`, `TBM43_VAR_DESC`, `TBM43_SDTM_FLG`, `TBM43_CDASH_FLG`, `TBM43_INPUT_TYPE_DIV`, `TBM43_REQUIRED_FLG`, `TBM43_SAS_FIELD_NM`, `TBM43_ODM_DATA_TYPE`, `TBM43_NOTE`, `TBM43_ORDER`, `TBM43_VERSION`, `TBM43_DEL_FLG`, `TBM43_CRT_PROG_NM`, `TBM43_UPD_PROG_NM` FROM `TBM43_STUDY_CDISC_ITEM` WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001J4", "SELECT TM1.`TBM43_STUDY_ID`, TM1.`TBM43_DOM_CD`, TM1.`TBM43_DOM_VAR_NM`, TM1.`TBM43_CRT_DATETIME`, TM1.`TBM43_CRT_USER_ID`, TM1.`TBM43_UPD_DATETIME`, TM1.`TBM43_UPD_USER_ID`, TM1.`TBM43_UPD_CNT`, TM1.`TBM43_VAR_DESC`, TM1.`TBM43_SDTM_FLG`, TM1.`TBM43_CDASH_FLG`, TM1.`TBM43_INPUT_TYPE_DIV`, TM1.`TBM43_REQUIRED_FLG`, TM1.`TBM43_SAS_FIELD_NM`, TM1.`TBM43_ODM_DATA_TYPE`, TM1.`TBM43_NOTE`, TM1.`TBM43_ORDER`, TM1.`TBM43_VERSION`, TM1.`TBM43_DEL_FLG`, TM1.`TBM43_CRT_PROG_NM`, TM1.`TBM43_UPD_PROG_NM` FROM `TBM43_STUDY_CDISC_ITEM` TM1 WHERE TM1.`TBM43_STUDY_ID` = ? and TM1.`TBM43_DOM_CD` = ? and TM1.`TBM43_DOM_VAR_NM` = ? ORDER BY TM1.`TBM43_STUDY_ID`, TM1.`TBM43_DOM_CD`, TM1.`TBM43_DOM_VAR_NM` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T001J5", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM` FROM `TBM43_STUDY_CDISC_ITEM` WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001J6", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM` FROM `TBM43_STUDY_CDISC_ITEM` WHERE ( `TBM43_STUDY_ID` > ? or `TBM43_STUDY_ID` = ? and `TBM43_DOM_CD` > ? or `TBM43_DOM_CD` = ? and `TBM43_STUDY_ID` = ? and `TBM43_DOM_VAR_NM` > ?) ORDER BY `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001J7", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM` FROM `TBM43_STUDY_CDISC_ITEM` WHERE ( `TBM43_STUDY_ID` < ? or `TBM43_STUDY_ID` = ? and `TBM43_DOM_CD` < ? or `TBM43_DOM_CD` = ? and `TBM43_STUDY_ID` = ? and `TBM43_DOM_VAR_NM` < ?) ORDER BY `TBM43_STUDY_ID` DESC, `TBM43_DOM_CD` DESC, `TBM43_DOM_VAR_NM` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001J8", "INSERT INTO `TBM43_STUDY_CDISC_ITEM` (`TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`, `TBM43_CRT_DATETIME`, `TBM43_CRT_USER_ID`, `TBM43_UPD_DATETIME`, `TBM43_UPD_USER_ID`, `TBM43_UPD_CNT`, `TBM43_VAR_DESC`, `TBM43_SDTM_FLG`, `TBM43_CDASH_FLG`, `TBM43_INPUT_TYPE_DIV`, `TBM43_REQUIRED_FLG`, `TBM43_SAS_FIELD_NM`, `TBM43_ODM_DATA_TYPE`, `TBM43_NOTE`, `TBM43_ORDER`, `TBM43_VERSION`, `TBM43_DEL_FLG`, `TBM43_CRT_PROG_NM`, `TBM43_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001J9", "UPDATE `TBM43_STUDY_CDISC_ITEM` SET `TBM43_CRT_DATETIME`=?, `TBM43_CRT_USER_ID`=?, `TBM43_UPD_DATETIME`=?, `TBM43_UPD_USER_ID`=?, `TBM43_UPD_CNT`=?, `TBM43_VAR_DESC`=?, `TBM43_SDTM_FLG`=?, `TBM43_CDASH_FLG`=?, `TBM43_INPUT_TYPE_DIV`=?, `TBM43_REQUIRED_FLG`=?, `TBM43_SAS_FIELD_NM`=?, `TBM43_ODM_DATA_TYPE`=?, `TBM43_NOTE`=?, `TBM43_ORDER`=?, `TBM43_VERSION`=?, `TBM43_DEL_FLG`=?, `TBM43_CRT_PROG_NM`=?, `TBM43_UPD_PROG_NM`=?  WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new UpdateCursor("T001J10", "DELETE FROM `TBM43_STUDY_CDISC_ITEM`  WHERE `TBM43_STUDY_ID` = ? AND `TBM43_DOM_CD` = ? AND `TBM43_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new ForEachCursor("T001J11", "SELECT `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM` FROM `TBM43_STUDY_CDISC_ITEM` ORDER BY `TBM43_STUDY_ID`, `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 128);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[12]).longValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 100);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 50);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 20);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 1000);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 40);
               }
               break;
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
               stmt.setLong(19, ((Number) parms[36]).longValue());
               stmt.setVarchar(20, (String)parms[37], 2, false);
               stmt.setVarchar(21, (String)parms[38], 50, false);
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               break;
      }
   }

}

