/*
               File: tbm24_map_item_impl
        Description: マッピング済部品マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:24.18
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm24_map_item_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM24_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm24_crt_user_id0W31( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM24_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm24_upd_user_id0W31( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A64TBM24_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A64TBM24_STUDY_ID) ;
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
         Form.getMeta().addItem("description", "マッピング済部品マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm24_map_item_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm24_map_item_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm24_map_item_impl.class ));
   }

   public tbm24_map_item_impl( int remoteHandle ,
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
         wb_table1_2_0W31( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0W31e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0W31( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0W31( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0W31( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0W31e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "マッピング済部品マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM24_MAP_ITEM.htm");
         wb_table3_28_0W31( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0W31e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0W31e( true) ;
      }
      else
      {
         wb_table1_2_0W31e( false) ;
      }
   }

   public void wb_table3_28_0W31( boolean wbgen )
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
         wb_table4_34_0W31( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0W31e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM24_MAP_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM24_MAP_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0W31e( true) ;
      }
      else
      {
         wb_table3_28_0W31e( false) ;
      }
   }

   public void wb_table4_34_0W31( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_study_id_Internalname, "試験ID", "", "", lblTextblocktbm24_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A64TBM24_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM24_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A64TBM24_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A64TBM24_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbm24_dom_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_CD_Internalname, GXutil.rtrim( A65TBM24_DOM_CD), GXutil.rtrim( localUtil.format( A65TBM24_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_DOM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_DOM_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbm24_dom_var_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_VAR_NM_Internalname, GXutil.rtrim( A66TBM24_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A66TBM24_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_DOM_VAR_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_DOM_VAR_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_VAR_NM", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_itm_grp_oid_Internalname, "OID", "", "", lblTextblocktbm24_dom_itm_grp_oid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_ITM_GRP_OID_Internalname, GXutil.rtrim( A702TBM24_DOM_ITM_GRP_OID), GXutil.rtrim( localUtil.format( A702TBM24_DOM_ITM_GRP_OID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_DOM_ITM_GRP_OID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_DOM_ITM_GRP_OID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_itm_grp_attr_seq_Internalname, "ドメイン内項目グループ内連番", "", "", lblTextblocktbm24_dom_itm_grp_attr_seq_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname, GXutil.ltrim( localUtil.ntoc( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")), ((edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A703TBM24_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A703TBM24_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_itm_grp_rowno_Internalname, "項目グループ行番号", "", "", lblTextblocktbm24_dom_itm_grp_rowno_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_ITM_GRP_ROWNO_Internalname, GXutil.ltrim( localUtil.ntoc( A704TBM24_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")), ((edtTBM24_DOM_ITM_GRP_ROWNO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A704TBM24_DOM_ITM_GRP_ROWNO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A704TBM24_DOM_ITM_GRP_ROWNO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_DOM_ITM_GRP_ROWNO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_DOM_ITM_GRP_ROWNO_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crf_item_nm_Internalname, "CRF項目名", "", "", lblTextblocktbm24_crf_item_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM24_CRF_ITEM_NM_Internalname, GXutil.rtrim( A705TBM24_CRF_ITEM_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", (short)(0), 1, edtTBM24_CRF_ITEM_NM_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, "", "", (byte)(-1), true, "", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crf_item_div_Internalname, "CRF項目区分", "", "", lblTextblocktbm24_crf_item_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CRF_ITEM_DIV_Internalname, GXutil.rtrim( A67TBM24_CRF_ITEM_DIV), GXutil.rtrim( localUtil.format( A67TBM24_CRF_ITEM_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_CRF_ITEM_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_CRF_ITEM_DIV_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_identification_cd_Internalname, "識別・選択リストコード", "", "", lblTextblocktbm24_identification_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_IDENTIFICATION_CD_Internalname, GXutil.rtrim( A635TBM24_IDENTIFICATION_CD), GXutil.rtrim( localUtil.format( A635TBM24_IDENTIFICATION_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_IDENTIFICATION_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_IDENTIFICATION_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_text_maxlength_Internalname, "テキスト最大文字数", "", "", lblTextblocktbm24_text_maxlength_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_TEXT_MAXLENGTH_Internalname, GXutil.ltrim( localUtil.ntoc( A636TBM24_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")), ((edtTBM24_TEXT_MAXLENGTH_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A636TBM24_TEXT_MAXLENGTH), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A636TBM24_TEXT_MAXLENGTH), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_TEXT_MAXLENGTH_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_TEXT_MAXLENGTH_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_text_maxrows_Internalname, "テキスト最大行数", "", "", lblTextblocktbm24_text_maxrows_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_TEXT_MAXROWS_Internalname, GXutil.ltrim( localUtil.ntoc( A637TBM24_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")), ((edtTBM24_TEXT_MAXROWS_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A637TBM24_TEXT_MAXROWS), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A637TBM24_TEXT_MAXROWS), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_TEXT_MAXROWS_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_TEXT_MAXROWS_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_decimal_digits_Internalname, "小数点以下桁数", "", "", lblTextblocktbm24_decimal_digits_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DECIMAL_DIGITS_Internalname, GXutil.ltrim( localUtil.ntoc( A638TBM24_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")), ((edtTBM24_DECIMAL_DIGITS_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A638TBM24_DECIMAL_DIGITS), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A638TBM24_DECIMAL_DIGITS), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_DECIMAL_DIGITS_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_DECIMAL_DIGITS_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_text_Internalname, "表示テキスト", "", "", lblTextblocktbm24_text_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM24_TEXT_Internalname, GXutil.rtrim( A639TBM24_TEXT), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", (short)(0), 1, edtTBM24_TEXT_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, "", "", (byte)(-1), true, "", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_fixed_value_Internalname, "固定値", "", "", lblTextblocktbm24_fixed_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_FIXED_VALUE_Internalname, GXutil.rtrim( A640TBM24_FIXED_VALUE), GXutil.rtrim( localUtil.format( A640TBM24_FIXED_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_FIXED_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_FIXED_VALUE_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_chk_false_inner_value_Internalname, "チェックボックスfalse時内部値", "", "", lblTextblocktbm24_chk_false_inner_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CHK_FALSE_INNER_VALUE_Internalname, GXutil.rtrim( A641TBM24_CHK_FALSE_INNER_VALUE), GXutil.rtrim( localUtil.format( A641TBM24_CHK_FALSE_INNER_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_CHK_FALSE_INNER_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_CHK_FALSE_INNER_VALUE_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_required_input_flg_Internalname, "必須入力フラグ", "", "", lblTextblocktbm24_required_input_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_REQUIRED_INPUT_FLG_Internalname, GXutil.rtrim( A706TBM24_REQUIRED_INPUT_FLG), GXutil.rtrim( localUtil.format( A706TBM24_REQUIRED_INPUT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_REQUIRED_INPUT_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_REQUIRED_INPUT_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_min_value_Internalname, "入力下限値", "", "", lblTextblocktbm24_min_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_MIN_VALUE_Internalname, GXutil.rtrim( A707TBM24_MIN_VALUE), GXutil.rtrim( localUtil.format( A707TBM24_MIN_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_MIN_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_MIN_VALUE_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_max_value_Internalname, "入力上限値", "", "", lblTextblocktbm24_max_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_MAX_VALUE_Internalname, GXutil.rtrim( A708TBM24_MAX_VALUE), GXutil.rtrim( localUtil.format( A708TBM24_MAX_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_MAX_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_MAX_VALUE_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_order_Internalname, "表示順", "", "", lblTextblocktbm24_order_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A543TBM24_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBM24_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A543TBM24_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A543TBM24_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_ORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_ORDER_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm24_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DEL_FLG_Internalname, GXutil.rtrim( A544TBM24_DEL_FLG), GXutil.rtrim( localUtil.format( A544TBM24_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm24_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM24_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CRT_DATETIME_Internalname, localUtil.format(A545TBM24_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A545TBM24_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM24_MAP_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM24_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM24_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm24_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CRT_USER_ID_Internalname, GXutil.rtrim( A546TBM24_CRT_USER_ID), GXutil.rtrim( localUtil.format( A546TBM24_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm24_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CRT_PROG_NM_Internalname, GXutil.rtrim( A547TBM24_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A547TBM24_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm24_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM24_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_UPD_DATETIME_Internalname, localUtil.format(A548TBM24_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A548TBM24_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM24_MAP_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM24_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM24_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm24_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_UPD_USER_ID_Internalname, GXutil.rtrim( A549TBM24_UPD_USER_ID), GXutil.rtrim( localUtil.format( A549TBM24_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm24_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_UPD_PROG_NM_Internalname, GXutil.rtrim( A550TBM24_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A550TBM24_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm24_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A551TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM24_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A551TBM24_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A551TBM24_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM24_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM24_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0W31e( true) ;
      }
      else
      {
         wb_table4_34_0W31e( false) ;
      }
   }

   public void wb_table2_5_0W31( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM24_MAP_ITEM.htm");
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
         wb_table2_5_0W31e( true) ;
      }
      else
      {
         wb_table2_5_0W31e( false) ;
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
      /* Execute user event: e110W2 */
      e110W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A64TBM24_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
            }
            else
            {
               A64TBM24_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM24_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
            }
            A65TBM24_DOM_CD = httpContext.cgiGet( edtTBM24_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
            A66TBM24_DOM_VAR_NM = httpContext.cgiGet( edtTBM24_DOM_VAR_NM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
            A702TBM24_DOM_ITM_GRP_OID = httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_OID_Internalname) ;
            n702TBM24_DOM_ITM_GRP_OID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A702TBM24_DOM_ITM_GRP_OID", A702TBM24_DOM_ITM_GRP_OID);
            n702TBM24_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A702TBM24_DOM_ITM_GRP_OID)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_DOM_ITM_GRP_ATTR_SEQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A703TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
               n703TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A703TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            else
            {
               A703TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",")) ;
               n703TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A703TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            n703TBM24_DOM_ITM_GRP_ATTR_SEQ = ((0==A703TBM24_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_DOM_ITM_GRP_ROWNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_DOM_ITM_GRP_ROWNO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A704TBM24_DOM_ITM_GRP_ROWNO = (short)(0) ;
               n704TBM24_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A704TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A704TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            else
            {
               A704TBM24_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ROWNO_Internalname), ".", ",")) ;
               n704TBM24_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A704TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A704TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            n704TBM24_DOM_ITM_GRP_ROWNO = ((0==A704TBM24_DOM_ITM_GRP_ROWNO) ? true : false) ;
            A705TBM24_CRF_ITEM_NM = httpContext.cgiGet( edtTBM24_CRF_ITEM_NM_Internalname) ;
            n705TBM24_CRF_ITEM_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A705TBM24_CRF_ITEM_NM", A705TBM24_CRF_ITEM_NM);
            n705TBM24_CRF_ITEM_NM = ((GXutil.strcmp("", A705TBM24_CRF_ITEM_NM)==0) ? true : false) ;
            A67TBM24_CRF_ITEM_DIV = httpContext.cgiGet( edtTBM24_CRF_ITEM_DIV_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
            A635TBM24_IDENTIFICATION_CD = httpContext.cgiGet( edtTBM24_IDENTIFICATION_CD_Internalname) ;
            n635TBM24_IDENTIFICATION_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A635TBM24_IDENTIFICATION_CD", A635TBM24_IDENTIFICATION_CD);
            n635TBM24_IDENTIFICATION_CD = ((GXutil.strcmp("", A635TBM24_IDENTIFICATION_CD)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXLENGTH_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXLENGTH_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_TEXT_MAXLENGTH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_TEXT_MAXLENGTH_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A636TBM24_TEXT_MAXLENGTH = (short)(0) ;
               n636TBM24_TEXT_MAXLENGTH = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A636TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A636TBM24_TEXT_MAXLENGTH, 3, 0)));
            }
            else
            {
               A636TBM24_TEXT_MAXLENGTH = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXLENGTH_Internalname), ".", ",")) ;
               n636TBM24_TEXT_MAXLENGTH = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A636TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A636TBM24_TEXT_MAXLENGTH, 3, 0)));
            }
            n636TBM24_TEXT_MAXLENGTH = ((0==A636TBM24_TEXT_MAXLENGTH) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXROWS_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXROWS_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_TEXT_MAXROWS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_TEXT_MAXROWS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A637TBM24_TEXT_MAXROWS = (byte)(0) ;
               n637TBM24_TEXT_MAXROWS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A637TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A637TBM24_TEXT_MAXROWS, 2, 0)));
            }
            else
            {
               A637TBM24_TEXT_MAXROWS = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXROWS_Internalname), ".", ",")) ;
               n637TBM24_TEXT_MAXROWS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A637TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A637TBM24_TEXT_MAXROWS, 2, 0)));
            }
            n637TBM24_TEXT_MAXROWS = ((0==A637TBM24_TEXT_MAXROWS) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DECIMAL_DIGITS_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DECIMAL_DIGITS_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_DECIMAL_DIGITS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_DECIMAL_DIGITS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A638TBM24_DECIMAL_DIGITS = (byte)(0) ;
               n638TBM24_DECIMAL_DIGITS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A638TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A638TBM24_DECIMAL_DIGITS, 2, 0)));
            }
            else
            {
               A638TBM24_DECIMAL_DIGITS = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM24_DECIMAL_DIGITS_Internalname), ".", ",")) ;
               n638TBM24_DECIMAL_DIGITS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A638TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A638TBM24_DECIMAL_DIGITS, 2, 0)));
            }
            n638TBM24_DECIMAL_DIGITS = ((0==A638TBM24_DECIMAL_DIGITS) ? true : false) ;
            A639TBM24_TEXT = httpContext.cgiGet( edtTBM24_TEXT_Internalname) ;
            n639TBM24_TEXT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A639TBM24_TEXT", A639TBM24_TEXT);
            n639TBM24_TEXT = ((GXutil.strcmp("", A639TBM24_TEXT)==0) ? true : false) ;
            A640TBM24_FIXED_VALUE = httpContext.cgiGet( edtTBM24_FIXED_VALUE_Internalname) ;
            n640TBM24_FIXED_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A640TBM24_FIXED_VALUE", A640TBM24_FIXED_VALUE);
            n640TBM24_FIXED_VALUE = ((GXutil.strcmp("", A640TBM24_FIXED_VALUE)==0) ? true : false) ;
            A641TBM24_CHK_FALSE_INNER_VALUE = httpContext.cgiGet( edtTBM24_CHK_FALSE_INNER_VALUE_Internalname) ;
            n641TBM24_CHK_FALSE_INNER_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A641TBM24_CHK_FALSE_INNER_VALUE", A641TBM24_CHK_FALSE_INNER_VALUE);
            n641TBM24_CHK_FALSE_INNER_VALUE = ((GXutil.strcmp("", A641TBM24_CHK_FALSE_INNER_VALUE)==0) ? true : false) ;
            A706TBM24_REQUIRED_INPUT_FLG = httpContext.cgiGet( edtTBM24_REQUIRED_INPUT_FLG_Internalname) ;
            n706TBM24_REQUIRED_INPUT_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A706TBM24_REQUIRED_INPUT_FLG", A706TBM24_REQUIRED_INPUT_FLG);
            n706TBM24_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A706TBM24_REQUIRED_INPUT_FLG)==0) ? true : false) ;
            A707TBM24_MIN_VALUE = httpContext.cgiGet( edtTBM24_MIN_VALUE_Internalname) ;
            n707TBM24_MIN_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A707TBM24_MIN_VALUE", A707TBM24_MIN_VALUE);
            n707TBM24_MIN_VALUE = ((GXutil.strcmp("", A707TBM24_MIN_VALUE)==0) ? true : false) ;
            A708TBM24_MAX_VALUE = httpContext.cgiGet( edtTBM24_MAX_VALUE_Internalname) ;
            n708TBM24_MAX_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A708TBM24_MAX_VALUE", A708TBM24_MAX_VALUE);
            n708TBM24_MAX_VALUE = ((GXutil.strcmp("", A708TBM24_MAX_VALUE)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A543TBM24_ORDER = 0 ;
               n543TBM24_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_ORDER", GXutil.ltrim( GXutil.str( A543TBM24_ORDER, 5, 0)));
            }
            else
            {
               A543TBM24_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM24_ORDER_Internalname), ".", ",")) ;
               n543TBM24_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_ORDER", GXutil.ltrim( GXutil.str( A543TBM24_ORDER, 5, 0)));
            }
            n543TBM24_ORDER = ((0==A543TBM24_ORDER) ? true : false) ;
            A544TBM24_DEL_FLG = httpContext.cgiGet( edtTBM24_DEL_FLG_Internalname) ;
            n544TBM24_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_DEL_FLG", A544TBM24_DEL_FLG);
            n544TBM24_DEL_FLG = ((GXutil.strcmp("", A544TBM24_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM24_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM24_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n545TBM24_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_CRT_DATETIME", localUtil.ttoc( A545TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A545TBM24_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM24_CRT_DATETIME_Internalname)) ;
               n545TBM24_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_CRT_DATETIME", localUtil.ttoc( A545TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n545TBM24_CRT_DATETIME = (GXutil.nullDate().equals(A545TBM24_CRT_DATETIME) ? true : false) ;
            A546TBM24_CRT_USER_ID = httpContext.cgiGet( edtTBM24_CRT_USER_ID_Internalname) ;
            n546TBM24_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_CRT_USER_ID", A546TBM24_CRT_USER_ID);
            n546TBM24_CRT_USER_ID = ((GXutil.strcmp("", A546TBM24_CRT_USER_ID)==0) ? true : false) ;
            A547TBM24_CRT_PROG_NM = httpContext.cgiGet( edtTBM24_CRT_PROG_NM_Internalname) ;
            n547TBM24_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A547TBM24_CRT_PROG_NM", A547TBM24_CRT_PROG_NM);
            n547TBM24_CRT_PROG_NM = ((GXutil.strcmp("", A547TBM24_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM24_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM24_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n548TBM24_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_UPD_DATETIME", localUtil.ttoc( A548TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A548TBM24_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM24_UPD_DATETIME_Internalname)) ;
               n548TBM24_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_UPD_DATETIME", localUtil.ttoc( A548TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n548TBM24_UPD_DATETIME = (GXutil.nullDate().equals(A548TBM24_UPD_DATETIME) ? true : false) ;
            A549TBM24_UPD_USER_ID = httpContext.cgiGet( edtTBM24_UPD_USER_ID_Internalname) ;
            n549TBM24_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_UPD_USER_ID", A549TBM24_UPD_USER_ID);
            n549TBM24_UPD_USER_ID = ((GXutil.strcmp("", A549TBM24_UPD_USER_ID)==0) ? true : false) ;
            A550TBM24_UPD_PROG_NM = httpContext.cgiGet( edtTBM24_UPD_PROG_NM_Internalname) ;
            n550TBM24_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A550TBM24_UPD_PROG_NM", A550TBM24_UPD_PROG_NM);
            n550TBM24_UPD_PROG_NM = ((GXutil.strcmp("", A550TBM24_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A551TBM24_UPD_CNT = 0 ;
               n551TBM24_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A551TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)));
            }
            else
            {
               A551TBM24_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM24_UPD_CNT_Internalname), ".", ",") ;
               n551TBM24_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A551TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)));
            }
            n551TBM24_UPD_CNT = ((0==A551TBM24_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z64TBM24_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z64TBM24_STUDY_ID"), ".", ",") ;
            Z65TBM24_DOM_CD = httpContext.cgiGet( "Z65TBM24_DOM_CD") ;
            Z66TBM24_DOM_VAR_NM = httpContext.cgiGet( "Z66TBM24_DOM_VAR_NM") ;
            Z67TBM24_CRF_ITEM_DIV = httpContext.cgiGet( "Z67TBM24_CRF_ITEM_DIV") ;
            Z545TBM24_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z545TBM24_CRT_DATETIME"), 0) ;
            n545TBM24_CRT_DATETIME = (GXutil.nullDate().equals(A545TBM24_CRT_DATETIME) ? true : false) ;
            Z546TBM24_CRT_USER_ID = httpContext.cgiGet( "Z546TBM24_CRT_USER_ID") ;
            n546TBM24_CRT_USER_ID = ((GXutil.strcmp("", A546TBM24_CRT_USER_ID)==0) ? true : false) ;
            Z548TBM24_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z548TBM24_UPD_DATETIME"), 0) ;
            n548TBM24_UPD_DATETIME = (GXutil.nullDate().equals(A548TBM24_UPD_DATETIME) ? true : false) ;
            Z549TBM24_UPD_USER_ID = httpContext.cgiGet( "Z549TBM24_UPD_USER_ID") ;
            n549TBM24_UPD_USER_ID = ((GXutil.strcmp("", A549TBM24_UPD_USER_ID)==0) ? true : false) ;
            Z551TBM24_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z551TBM24_UPD_CNT"), ".", ",") ;
            n551TBM24_UPD_CNT = ((0==A551TBM24_UPD_CNT) ? true : false) ;
            Z702TBM24_DOM_ITM_GRP_OID = httpContext.cgiGet( "Z702TBM24_DOM_ITM_GRP_OID") ;
            n702TBM24_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A702TBM24_DOM_ITM_GRP_OID)==0) ? true : false) ;
            Z703TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( "Z703TBM24_DOM_ITM_GRP_ATTR_SEQ"), ".", ",")) ;
            n703TBM24_DOM_ITM_GRP_ATTR_SEQ = ((0==A703TBM24_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            Z704TBM24_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( "Z704TBM24_DOM_ITM_GRP_ROWNO"), ".", ",")) ;
            n704TBM24_DOM_ITM_GRP_ROWNO = ((0==A704TBM24_DOM_ITM_GRP_ROWNO) ? true : false) ;
            Z705TBM24_CRF_ITEM_NM = httpContext.cgiGet( "Z705TBM24_CRF_ITEM_NM") ;
            n705TBM24_CRF_ITEM_NM = ((GXutil.strcmp("", A705TBM24_CRF_ITEM_NM)==0) ? true : false) ;
            Z635TBM24_IDENTIFICATION_CD = httpContext.cgiGet( "Z635TBM24_IDENTIFICATION_CD") ;
            n635TBM24_IDENTIFICATION_CD = ((GXutil.strcmp("", A635TBM24_IDENTIFICATION_CD)==0) ? true : false) ;
            Z636TBM24_TEXT_MAXLENGTH = (short)(localUtil.ctol( httpContext.cgiGet( "Z636TBM24_TEXT_MAXLENGTH"), ".", ",")) ;
            n636TBM24_TEXT_MAXLENGTH = ((0==A636TBM24_TEXT_MAXLENGTH) ? true : false) ;
            Z637TBM24_TEXT_MAXROWS = (byte)(localUtil.ctol( httpContext.cgiGet( "Z637TBM24_TEXT_MAXROWS"), ".", ",")) ;
            n637TBM24_TEXT_MAXROWS = ((0==A637TBM24_TEXT_MAXROWS) ? true : false) ;
            Z638TBM24_DECIMAL_DIGITS = (byte)(localUtil.ctol( httpContext.cgiGet( "Z638TBM24_DECIMAL_DIGITS"), ".", ",")) ;
            n638TBM24_DECIMAL_DIGITS = ((0==A638TBM24_DECIMAL_DIGITS) ? true : false) ;
            Z639TBM24_TEXT = httpContext.cgiGet( "Z639TBM24_TEXT") ;
            n639TBM24_TEXT = ((GXutil.strcmp("", A639TBM24_TEXT)==0) ? true : false) ;
            Z640TBM24_FIXED_VALUE = httpContext.cgiGet( "Z640TBM24_FIXED_VALUE") ;
            n640TBM24_FIXED_VALUE = ((GXutil.strcmp("", A640TBM24_FIXED_VALUE)==0) ? true : false) ;
            Z641TBM24_CHK_FALSE_INNER_VALUE = httpContext.cgiGet( "Z641TBM24_CHK_FALSE_INNER_VALUE") ;
            n641TBM24_CHK_FALSE_INNER_VALUE = ((GXutil.strcmp("", A641TBM24_CHK_FALSE_INNER_VALUE)==0) ? true : false) ;
            Z706TBM24_REQUIRED_INPUT_FLG = httpContext.cgiGet( "Z706TBM24_REQUIRED_INPUT_FLG") ;
            n706TBM24_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A706TBM24_REQUIRED_INPUT_FLG)==0) ? true : false) ;
            Z707TBM24_MIN_VALUE = httpContext.cgiGet( "Z707TBM24_MIN_VALUE") ;
            n707TBM24_MIN_VALUE = ((GXutil.strcmp("", A707TBM24_MIN_VALUE)==0) ? true : false) ;
            Z708TBM24_MAX_VALUE = httpContext.cgiGet( "Z708TBM24_MAX_VALUE") ;
            n708TBM24_MAX_VALUE = ((GXutil.strcmp("", A708TBM24_MAX_VALUE)==0) ? true : false) ;
            Z543TBM24_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z543TBM24_ORDER"), ".", ",")) ;
            n543TBM24_ORDER = ((0==A543TBM24_ORDER) ? true : false) ;
            Z544TBM24_DEL_FLG = httpContext.cgiGet( "Z544TBM24_DEL_FLG") ;
            n544TBM24_DEL_FLG = ((GXutil.strcmp("", A544TBM24_DEL_FLG)==0) ? true : false) ;
            Z547TBM24_CRT_PROG_NM = httpContext.cgiGet( "Z547TBM24_CRT_PROG_NM") ;
            n547TBM24_CRT_PROG_NM = ((GXutil.strcmp("", A547TBM24_CRT_PROG_NM)==0) ? true : false) ;
            Z550TBM24_UPD_PROG_NM = httpContext.cgiGet( "Z550TBM24_UPD_PROG_NM") ;
            n550TBM24_UPD_PROG_NM = ((GXutil.strcmp("", A550TBM24_UPD_PROG_NM)==0) ? true : false) ;
            O551TBM24_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O551TBM24_UPD_CNT"), ".", ",") ;
            n551TBM24_UPD_CNT = ((0==A551TBM24_UPD_CNT) ? true : false) ;
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
               A64TBM24_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
               A65TBM24_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
               A66TBM24_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
               A67TBM24_CRF_ITEM_DIV = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
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
                     /* Execute user event: e110W2 */
                     e110W2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120W2 */
                     e120W2 ();
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
         /* Execute user event: e120W2 */
         e120W2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0W31( ) ;
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
      disableAttributes0W31( ) ;
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

   public void resetCaption0W0( )
   {
   }

   public void e110W2( )
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

   public void e120W2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A65TBM24_DOM_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A66TBM24_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A702TBM24_DOM_ITM_GRP_OID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A704TBM24_DOM_ITM_GRP_ROWNO, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A705TBM24_CRF_ITEM_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A67TBM24_CRF_ITEM_DIV + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A635TBM24_IDENTIFICATION_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A636TBM24_TEXT_MAXLENGTH, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A637TBM24_TEXT_MAXROWS, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A638TBM24_DECIMAL_DIGITS, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A639TBM24_TEXT + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A640TBM24_FIXED_VALUE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A641TBM24_CHK_FALSE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A706TBM24_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A707TBM24_MIN_VALUE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A708TBM24_MAX_VALUE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A543TBM24_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A544TBM24_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A545TBM24_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm24_map_item_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_CRT_DATETIME", localUtil.ttoc( A545TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A546TBM24_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A547TBM24_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A548TBM24_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm24_map_item_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_UPD_DATETIME", localUtil.ttoc( A548TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A549TBM24_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A550TBM24_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0W31( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z545TBM24_CRT_DATETIME = T000W3_A545TBM24_CRT_DATETIME[0] ;
            Z546TBM24_CRT_USER_ID = T000W3_A546TBM24_CRT_USER_ID[0] ;
            Z548TBM24_UPD_DATETIME = T000W3_A548TBM24_UPD_DATETIME[0] ;
            Z549TBM24_UPD_USER_ID = T000W3_A549TBM24_UPD_USER_ID[0] ;
            Z551TBM24_UPD_CNT = T000W3_A551TBM24_UPD_CNT[0] ;
            Z702TBM24_DOM_ITM_GRP_OID = T000W3_A702TBM24_DOM_ITM_GRP_OID[0] ;
            Z703TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W3_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
            Z704TBM24_DOM_ITM_GRP_ROWNO = T000W3_A704TBM24_DOM_ITM_GRP_ROWNO[0] ;
            Z705TBM24_CRF_ITEM_NM = T000W3_A705TBM24_CRF_ITEM_NM[0] ;
            Z635TBM24_IDENTIFICATION_CD = T000W3_A635TBM24_IDENTIFICATION_CD[0] ;
            Z636TBM24_TEXT_MAXLENGTH = T000W3_A636TBM24_TEXT_MAXLENGTH[0] ;
            Z637TBM24_TEXT_MAXROWS = T000W3_A637TBM24_TEXT_MAXROWS[0] ;
            Z638TBM24_DECIMAL_DIGITS = T000W3_A638TBM24_DECIMAL_DIGITS[0] ;
            Z639TBM24_TEXT = T000W3_A639TBM24_TEXT[0] ;
            Z640TBM24_FIXED_VALUE = T000W3_A640TBM24_FIXED_VALUE[0] ;
            Z641TBM24_CHK_FALSE_INNER_VALUE = T000W3_A641TBM24_CHK_FALSE_INNER_VALUE[0] ;
            Z706TBM24_REQUIRED_INPUT_FLG = T000W3_A706TBM24_REQUIRED_INPUT_FLG[0] ;
            Z707TBM24_MIN_VALUE = T000W3_A707TBM24_MIN_VALUE[0] ;
            Z708TBM24_MAX_VALUE = T000W3_A708TBM24_MAX_VALUE[0] ;
            Z543TBM24_ORDER = T000W3_A543TBM24_ORDER[0] ;
            Z544TBM24_DEL_FLG = T000W3_A544TBM24_DEL_FLG[0] ;
            Z547TBM24_CRT_PROG_NM = T000W3_A547TBM24_CRT_PROG_NM[0] ;
            Z550TBM24_UPD_PROG_NM = T000W3_A550TBM24_UPD_PROG_NM[0] ;
         }
         else
         {
            Z545TBM24_CRT_DATETIME = A545TBM24_CRT_DATETIME ;
            Z546TBM24_CRT_USER_ID = A546TBM24_CRT_USER_ID ;
            Z548TBM24_UPD_DATETIME = A548TBM24_UPD_DATETIME ;
            Z549TBM24_UPD_USER_ID = A549TBM24_UPD_USER_ID ;
            Z551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
            Z702TBM24_DOM_ITM_GRP_OID = A702TBM24_DOM_ITM_GRP_OID ;
            Z703TBM24_DOM_ITM_GRP_ATTR_SEQ = A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
            Z704TBM24_DOM_ITM_GRP_ROWNO = A704TBM24_DOM_ITM_GRP_ROWNO ;
            Z705TBM24_CRF_ITEM_NM = A705TBM24_CRF_ITEM_NM ;
            Z635TBM24_IDENTIFICATION_CD = A635TBM24_IDENTIFICATION_CD ;
            Z636TBM24_TEXT_MAXLENGTH = A636TBM24_TEXT_MAXLENGTH ;
            Z637TBM24_TEXT_MAXROWS = A637TBM24_TEXT_MAXROWS ;
            Z638TBM24_DECIMAL_DIGITS = A638TBM24_DECIMAL_DIGITS ;
            Z639TBM24_TEXT = A639TBM24_TEXT ;
            Z640TBM24_FIXED_VALUE = A640TBM24_FIXED_VALUE ;
            Z641TBM24_CHK_FALSE_INNER_VALUE = A641TBM24_CHK_FALSE_INNER_VALUE ;
            Z706TBM24_REQUIRED_INPUT_FLG = A706TBM24_REQUIRED_INPUT_FLG ;
            Z707TBM24_MIN_VALUE = A707TBM24_MIN_VALUE ;
            Z708TBM24_MAX_VALUE = A708TBM24_MAX_VALUE ;
            Z543TBM24_ORDER = A543TBM24_ORDER ;
            Z544TBM24_DEL_FLG = A544TBM24_DEL_FLG ;
            Z547TBM24_CRT_PROG_NM = A547TBM24_CRT_PROG_NM ;
            Z550TBM24_UPD_PROG_NM = A550TBM24_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z65TBM24_DOM_CD = A65TBM24_DOM_CD ;
         Z66TBM24_DOM_VAR_NM = A66TBM24_DOM_VAR_NM ;
         Z67TBM24_CRF_ITEM_DIV = A67TBM24_CRF_ITEM_DIV ;
         Z545TBM24_CRT_DATETIME = A545TBM24_CRT_DATETIME ;
         Z546TBM24_CRT_USER_ID = A546TBM24_CRT_USER_ID ;
         Z548TBM24_UPD_DATETIME = A548TBM24_UPD_DATETIME ;
         Z549TBM24_UPD_USER_ID = A549TBM24_UPD_USER_ID ;
         Z551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
         Z702TBM24_DOM_ITM_GRP_OID = A702TBM24_DOM_ITM_GRP_OID ;
         Z703TBM24_DOM_ITM_GRP_ATTR_SEQ = A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
         Z704TBM24_DOM_ITM_GRP_ROWNO = A704TBM24_DOM_ITM_GRP_ROWNO ;
         Z705TBM24_CRF_ITEM_NM = A705TBM24_CRF_ITEM_NM ;
         Z635TBM24_IDENTIFICATION_CD = A635TBM24_IDENTIFICATION_CD ;
         Z636TBM24_TEXT_MAXLENGTH = A636TBM24_TEXT_MAXLENGTH ;
         Z637TBM24_TEXT_MAXROWS = A637TBM24_TEXT_MAXROWS ;
         Z638TBM24_DECIMAL_DIGITS = A638TBM24_DECIMAL_DIGITS ;
         Z639TBM24_TEXT = A639TBM24_TEXT ;
         Z640TBM24_FIXED_VALUE = A640TBM24_FIXED_VALUE ;
         Z641TBM24_CHK_FALSE_INNER_VALUE = A641TBM24_CHK_FALSE_INNER_VALUE ;
         Z706TBM24_REQUIRED_INPUT_FLG = A706TBM24_REQUIRED_INPUT_FLG ;
         Z707TBM24_MIN_VALUE = A707TBM24_MIN_VALUE ;
         Z708TBM24_MAX_VALUE = A708TBM24_MAX_VALUE ;
         Z543TBM24_ORDER = A543TBM24_ORDER ;
         Z544TBM24_DEL_FLG = A544TBM24_DEL_FLG ;
         Z547TBM24_CRT_PROG_NM = A547TBM24_CRT_PROG_NM ;
         Z550TBM24_UPD_PROG_NM = A550TBM24_UPD_PROG_NM ;
         Z64TBM24_STUDY_ID = A64TBM24_STUDY_ID ;
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

   public void load0W31( )
   {
      /* Using cursor T000W5 */
      pr_default.execute(3, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A545TBM24_CRT_DATETIME = T000W5_A545TBM24_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_CRT_DATETIME", localUtil.ttoc( A545TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n545TBM24_CRT_DATETIME = T000W5_n545TBM24_CRT_DATETIME[0] ;
         A546TBM24_CRT_USER_ID = T000W5_A546TBM24_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_CRT_USER_ID", A546TBM24_CRT_USER_ID);
         n546TBM24_CRT_USER_ID = T000W5_n546TBM24_CRT_USER_ID[0] ;
         A548TBM24_UPD_DATETIME = T000W5_A548TBM24_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_UPD_DATETIME", localUtil.ttoc( A548TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n548TBM24_UPD_DATETIME = T000W5_n548TBM24_UPD_DATETIME[0] ;
         A549TBM24_UPD_USER_ID = T000W5_A549TBM24_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_UPD_USER_ID", A549TBM24_UPD_USER_ID);
         n549TBM24_UPD_USER_ID = T000W5_n549TBM24_UPD_USER_ID[0] ;
         A551TBM24_UPD_CNT = T000W5_A551TBM24_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)));
         n551TBM24_UPD_CNT = T000W5_n551TBM24_UPD_CNT[0] ;
         A702TBM24_DOM_ITM_GRP_OID = T000W5_A702TBM24_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A702TBM24_DOM_ITM_GRP_OID", A702TBM24_DOM_ITM_GRP_OID);
         n702TBM24_DOM_ITM_GRP_OID = T000W5_n702TBM24_DOM_ITM_GRP_OID[0] ;
         A703TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n703TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A704TBM24_DOM_ITM_GRP_ROWNO = T000W5_A704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A704TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
         n704TBM24_DOM_ITM_GRP_ROWNO = T000W5_n704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A705TBM24_CRF_ITEM_NM = T000W5_A705TBM24_CRF_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705TBM24_CRF_ITEM_NM", A705TBM24_CRF_ITEM_NM);
         n705TBM24_CRF_ITEM_NM = T000W5_n705TBM24_CRF_ITEM_NM[0] ;
         A635TBM24_IDENTIFICATION_CD = T000W5_A635TBM24_IDENTIFICATION_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A635TBM24_IDENTIFICATION_CD", A635TBM24_IDENTIFICATION_CD);
         n635TBM24_IDENTIFICATION_CD = T000W5_n635TBM24_IDENTIFICATION_CD[0] ;
         A636TBM24_TEXT_MAXLENGTH = T000W5_A636TBM24_TEXT_MAXLENGTH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A636TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A636TBM24_TEXT_MAXLENGTH, 3, 0)));
         n636TBM24_TEXT_MAXLENGTH = T000W5_n636TBM24_TEXT_MAXLENGTH[0] ;
         A637TBM24_TEXT_MAXROWS = T000W5_A637TBM24_TEXT_MAXROWS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A637TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A637TBM24_TEXT_MAXROWS, 2, 0)));
         n637TBM24_TEXT_MAXROWS = T000W5_n637TBM24_TEXT_MAXROWS[0] ;
         A638TBM24_DECIMAL_DIGITS = T000W5_A638TBM24_DECIMAL_DIGITS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A638TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A638TBM24_DECIMAL_DIGITS, 2, 0)));
         n638TBM24_DECIMAL_DIGITS = T000W5_n638TBM24_DECIMAL_DIGITS[0] ;
         A639TBM24_TEXT = T000W5_A639TBM24_TEXT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A639TBM24_TEXT", A639TBM24_TEXT);
         n639TBM24_TEXT = T000W5_n639TBM24_TEXT[0] ;
         A640TBM24_FIXED_VALUE = T000W5_A640TBM24_FIXED_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A640TBM24_FIXED_VALUE", A640TBM24_FIXED_VALUE);
         n640TBM24_FIXED_VALUE = T000W5_n640TBM24_FIXED_VALUE[0] ;
         A641TBM24_CHK_FALSE_INNER_VALUE = T000W5_A641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A641TBM24_CHK_FALSE_INNER_VALUE", A641TBM24_CHK_FALSE_INNER_VALUE);
         n641TBM24_CHK_FALSE_INNER_VALUE = T000W5_n641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A706TBM24_REQUIRED_INPUT_FLG = T000W5_A706TBM24_REQUIRED_INPUT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706TBM24_REQUIRED_INPUT_FLG", A706TBM24_REQUIRED_INPUT_FLG);
         n706TBM24_REQUIRED_INPUT_FLG = T000W5_n706TBM24_REQUIRED_INPUT_FLG[0] ;
         A707TBM24_MIN_VALUE = T000W5_A707TBM24_MIN_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707TBM24_MIN_VALUE", A707TBM24_MIN_VALUE);
         n707TBM24_MIN_VALUE = T000W5_n707TBM24_MIN_VALUE[0] ;
         A708TBM24_MAX_VALUE = T000W5_A708TBM24_MAX_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708TBM24_MAX_VALUE", A708TBM24_MAX_VALUE);
         n708TBM24_MAX_VALUE = T000W5_n708TBM24_MAX_VALUE[0] ;
         A543TBM24_ORDER = T000W5_A543TBM24_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_ORDER", GXutil.ltrim( GXutil.str( A543TBM24_ORDER, 5, 0)));
         n543TBM24_ORDER = T000W5_n543TBM24_ORDER[0] ;
         A544TBM24_DEL_FLG = T000W5_A544TBM24_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_DEL_FLG", A544TBM24_DEL_FLG);
         n544TBM24_DEL_FLG = T000W5_n544TBM24_DEL_FLG[0] ;
         A547TBM24_CRT_PROG_NM = T000W5_A547TBM24_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A547TBM24_CRT_PROG_NM", A547TBM24_CRT_PROG_NM);
         n547TBM24_CRT_PROG_NM = T000W5_n547TBM24_CRT_PROG_NM[0] ;
         A550TBM24_UPD_PROG_NM = T000W5_A550TBM24_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM24_UPD_PROG_NM", A550TBM24_UPD_PROG_NM);
         n550TBM24_UPD_PROG_NM = T000W5_n550TBM24_UPD_PROG_NM[0] ;
         zm0W31( -8) ;
      }
      pr_default.close(3);
      onLoadActions0W31( ) ;
   }

   public void onLoadActions0W31( )
   {
      AV9Pgmname = "TBM24_MAP_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0W31( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM24_MAP_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000W4 */
      pr_default.execute(2, new Object[] {new Long(A64TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'マッピング済部品マスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A545TBM24_CRT_DATETIME) || (( A545TBM24_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A545TBM24_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM24_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A548TBM24_UPD_DATETIME) || (( A548TBM24_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A548TBM24_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM24_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0W31( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A64TBM24_STUDY_ID )
   {
      /* Using cursor T000W4 */
      pr_default.execute(2, new Object[] {new Long(A64TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'マッピング済部品マスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
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

   public void getKey0W31( )
   {
      /* Using cursor T000W6 */
      pr_default.execute(4, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000W3 */
      pr_default.execute(1, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0W31( 8) ;
         RcdFound31 = (short)(1) ;
         A65TBM24_DOM_CD = T000W3_A65TBM24_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
         A66TBM24_DOM_VAR_NM = T000W3_A66TBM24_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
         A67TBM24_CRF_ITEM_DIV = T000W3_A67TBM24_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
         A545TBM24_CRT_DATETIME = T000W3_A545TBM24_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_CRT_DATETIME", localUtil.ttoc( A545TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n545TBM24_CRT_DATETIME = T000W3_n545TBM24_CRT_DATETIME[0] ;
         A546TBM24_CRT_USER_ID = T000W3_A546TBM24_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_CRT_USER_ID", A546TBM24_CRT_USER_ID);
         n546TBM24_CRT_USER_ID = T000W3_n546TBM24_CRT_USER_ID[0] ;
         A548TBM24_UPD_DATETIME = T000W3_A548TBM24_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_UPD_DATETIME", localUtil.ttoc( A548TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n548TBM24_UPD_DATETIME = T000W3_n548TBM24_UPD_DATETIME[0] ;
         A549TBM24_UPD_USER_ID = T000W3_A549TBM24_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_UPD_USER_ID", A549TBM24_UPD_USER_ID);
         n549TBM24_UPD_USER_ID = T000W3_n549TBM24_UPD_USER_ID[0] ;
         A551TBM24_UPD_CNT = T000W3_A551TBM24_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)));
         n551TBM24_UPD_CNT = T000W3_n551TBM24_UPD_CNT[0] ;
         A702TBM24_DOM_ITM_GRP_OID = T000W3_A702TBM24_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A702TBM24_DOM_ITM_GRP_OID", A702TBM24_DOM_ITM_GRP_OID);
         n702TBM24_DOM_ITM_GRP_OID = T000W3_n702TBM24_DOM_ITM_GRP_OID[0] ;
         A703TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W3_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n703TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W3_n703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A704TBM24_DOM_ITM_GRP_ROWNO = T000W3_A704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A704TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
         n704TBM24_DOM_ITM_GRP_ROWNO = T000W3_n704TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A705TBM24_CRF_ITEM_NM = T000W3_A705TBM24_CRF_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705TBM24_CRF_ITEM_NM", A705TBM24_CRF_ITEM_NM);
         n705TBM24_CRF_ITEM_NM = T000W3_n705TBM24_CRF_ITEM_NM[0] ;
         A635TBM24_IDENTIFICATION_CD = T000W3_A635TBM24_IDENTIFICATION_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A635TBM24_IDENTIFICATION_CD", A635TBM24_IDENTIFICATION_CD);
         n635TBM24_IDENTIFICATION_CD = T000W3_n635TBM24_IDENTIFICATION_CD[0] ;
         A636TBM24_TEXT_MAXLENGTH = T000W3_A636TBM24_TEXT_MAXLENGTH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A636TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A636TBM24_TEXT_MAXLENGTH, 3, 0)));
         n636TBM24_TEXT_MAXLENGTH = T000W3_n636TBM24_TEXT_MAXLENGTH[0] ;
         A637TBM24_TEXT_MAXROWS = T000W3_A637TBM24_TEXT_MAXROWS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A637TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A637TBM24_TEXT_MAXROWS, 2, 0)));
         n637TBM24_TEXT_MAXROWS = T000W3_n637TBM24_TEXT_MAXROWS[0] ;
         A638TBM24_DECIMAL_DIGITS = T000W3_A638TBM24_DECIMAL_DIGITS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A638TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A638TBM24_DECIMAL_DIGITS, 2, 0)));
         n638TBM24_DECIMAL_DIGITS = T000W3_n638TBM24_DECIMAL_DIGITS[0] ;
         A639TBM24_TEXT = T000W3_A639TBM24_TEXT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A639TBM24_TEXT", A639TBM24_TEXT);
         n639TBM24_TEXT = T000W3_n639TBM24_TEXT[0] ;
         A640TBM24_FIXED_VALUE = T000W3_A640TBM24_FIXED_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A640TBM24_FIXED_VALUE", A640TBM24_FIXED_VALUE);
         n640TBM24_FIXED_VALUE = T000W3_n640TBM24_FIXED_VALUE[0] ;
         A641TBM24_CHK_FALSE_INNER_VALUE = T000W3_A641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A641TBM24_CHK_FALSE_INNER_VALUE", A641TBM24_CHK_FALSE_INNER_VALUE);
         n641TBM24_CHK_FALSE_INNER_VALUE = T000W3_n641TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A706TBM24_REQUIRED_INPUT_FLG = T000W3_A706TBM24_REQUIRED_INPUT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706TBM24_REQUIRED_INPUT_FLG", A706TBM24_REQUIRED_INPUT_FLG);
         n706TBM24_REQUIRED_INPUT_FLG = T000W3_n706TBM24_REQUIRED_INPUT_FLG[0] ;
         A707TBM24_MIN_VALUE = T000W3_A707TBM24_MIN_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707TBM24_MIN_VALUE", A707TBM24_MIN_VALUE);
         n707TBM24_MIN_VALUE = T000W3_n707TBM24_MIN_VALUE[0] ;
         A708TBM24_MAX_VALUE = T000W3_A708TBM24_MAX_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708TBM24_MAX_VALUE", A708TBM24_MAX_VALUE);
         n708TBM24_MAX_VALUE = T000W3_n708TBM24_MAX_VALUE[0] ;
         A543TBM24_ORDER = T000W3_A543TBM24_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_ORDER", GXutil.ltrim( GXutil.str( A543TBM24_ORDER, 5, 0)));
         n543TBM24_ORDER = T000W3_n543TBM24_ORDER[0] ;
         A544TBM24_DEL_FLG = T000W3_A544TBM24_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_DEL_FLG", A544TBM24_DEL_FLG);
         n544TBM24_DEL_FLG = T000W3_n544TBM24_DEL_FLG[0] ;
         A547TBM24_CRT_PROG_NM = T000W3_A547TBM24_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A547TBM24_CRT_PROG_NM", A547TBM24_CRT_PROG_NM);
         n547TBM24_CRT_PROG_NM = T000W3_n547TBM24_CRT_PROG_NM[0] ;
         A550TBM24_UPD_PROG_NM = T000W3_A550TBM24_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM24_UPD_PROG_NM", A550TBM24_UPD_PROG_NM);
         n550TBM24_UPD_PROG_NM = T000W3_n550TBM24_UPD_PROG_NM[0] ;
         A64TBM24_STUDY_ID = T000W3_A64TBM24_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
         O551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
         n551TBM24_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)));
         Z64TBM24_STUDY_ID = A64TBM24_STUDY_ID ;
         Z65TBM24_DOM_CD = A65TBM24_DOM_CD ;
         Z66TBM24_DOM_VAR_NM = A66TBM24_DOM_VAR_NM ;
         Z67TBM24_CRF_ITEM_DIV = A67TBM24_CRF_ITEM_DIV ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0W31( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey0W31( ) ;
         }
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey0W31( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0W31( ) ;
      if ( RcdFound31 == 0 )
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
      RcdFound31 = (short)(0) ;
      /* Using cursor T000W7 */
      pr_default.execute(5, new Object[] {new Long(A64TBM24_STUDY_ID), new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A65TBM24_DOM_CD, new Long(A64TBM24_STUDY_ID), A66TBM24_DOM_VAR_NM, A66TBM24_DOM_VAR_NM, A65TBM24_DOM_CD, new Long(A64TBM24_STUDY_ID), A67TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000W7_A64TBM24_STUDY_ID[0] < A64TBM24_STUDY_ID ) || ( T000W7_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W7_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) < 0 ) || ( GXutil.strcmp(T000W7_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) == 0 ) && ( T000W7_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W7_A66TBM24_DOM_VAR_NM[0], A66TBM24_DOM_VAR_NM) < 0 ) || ( GXutil.strcmp(T000W7_A66TBM24_DOM_VAR_NM[0], A66TBM24_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T000W7_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) == 0 ) && ( T000W7_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W7_A67TBM24_CRF_ITEM_DIV[0], A67TBM24_CRF_ITEM_DIV) < 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000W7_A64TBM24_STUDY_ID[0] > A64TBM24_STUDY_ID ) || ( T000W7_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W7_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) > 0 ) || ( GXutil.strcmp(T000W7_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) == 0 ) && ( T000W7_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W7_A66TBM24_DOM_VAR_NM[0], A66TBM24_DOM_VAR_NM) > 0 ) || ( GXutil.strcmp(T000W7_A66TBM24_DOM_VAR_NM[0], A66TBM24_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T000W7_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) == 0 ) && ( T000W7_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W7_A67TBM24_CRF_ITEM_DIV[0], A67TBM24_CRF_ITEM_DIV) > 0 ) ) )
         {
            A64TBM24_STUDY_ID = T000W7_A64TBM24_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
            A65TBM24_DOM_CD = T000W7_A65TBM24_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
            A66TBM24_DOM_VAR_NM = T000W7_A66TBM24_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
            A67TBM24_CRF_ITEM_DIV = T000W7_A67TBM24_CRF_ITEM_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T000W8 */
      pr_default.execute(6, new Object[] {new Long(A64TBM24_STUDY_ID), new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A65TBM24_DOM_CD, new Long(A64TBM24_STUDY_ID), A66TBM24_DOM_VAR_NM, A66TBM24_DOM_VAR_NM, A65TBM24_DOM_CD, new Long(A64TBM24_STUDY_ID), A67TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000W8_A64TBM24_STUDY_ID[0] > A64TBM24_STUDY_ID ) || ( T000W8_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) > 0 ) || ( GXutil.strcmp(T000W8_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) == 0 ) && ( T000W8_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A66TBM24_DOM_VAR_NM[0], A66TBM24_DOM_VAR_NM) > 0 ) || ( GXutil.strcmp(T000W8_A66TBM24_DOM_VAR_NM[0], A66TBM24_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T000W8_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) == 0 ) && ( T000W8_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A67TBM24_CRF_ITEM_DIV[0], A67TBM24_CRF_ITEM_DIV) > 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000W8_A64TBM24_STUDY_ID[0] < A64TBM24_STUDY_ID ) || ( T000W8_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) < 0 ) || ( GXutil.strcmp(T000W8_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) == 0 ) && ( T000W8_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A66TBM24_DOM_VAR_NM[0], A66TBM24_DOM_VAR_NM) < 0 ) || ( GXutil.strcmp(T000W8_A66TBM24_DOM_VAR_NM[0], A66TBM24_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T000W8_A65TBM24_DOM_CD[0], A65TBM24_DOM_CD) == 0 ) && ( T000W8_A64TBM24_STUDY_ID[0] == A64TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A67TBM24_CRF_ITEM_DIV[0], A67TBM24_CRF_ITEM_DIV) < 0 ) ) )
         {
            A64TBM24_STUDY_ID = T000W8_A64TBM24_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
            A65TBM24_DOM_CD = T000W8_A65TBM24_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
            A66TBM24_DOM_VAR_NM = T000W8_A66TBM24_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
            A67TBM24_CRF_ITEM_DIV = T000W8_A67TBM24_CRF_ITEM_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0W31( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0W31( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound31 == 1 )
         {
            if ( ( A64TBM24_STUDY_ID != Z64TBM24_STUDY_ID ) || ( GXutil.strcmp(A65TBM24_DOM_CD, Z65TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A66TBM24_DOM_VAR_NM, Z66TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A67TBM24_CRF_ITEM_DIV, Z67TBM24_CRF_ITEM_DIV) != 0 ) )
            {
               A64TBM24_STUDY_ID = Z64TBM24_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
               A65TBM24_DOM_CD = Z65TBM24_DOM_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
               A66TBM24_DOM_VAR_NM = Z66TBM24_DOM_VAR_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
               A67TBM24_CRF_ITEM_DIV = Z67TBM24_CRF_ITEM_DIV ;
               httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM24_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0W31( ) ;
               GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A64TBM24_STUDY_ID != Z64TBM24_STUDY_ID ) || ( GXutil.strcmp(A65TBM24_DOM_CD, Z65TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A66TBM24_DOM_VAR_NM, Z66TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A67TBM24_CRF_ITEM_DIV, Z67TBM24_CRF_ITEM_DIV) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0W31( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM24_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0W31( ) ;
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
      if ( ( A64TBM24_STUDY_ID != Z64TBM24_STUDY_ID ) || ( GXutil.strcmp(A65TBM24_DOM_CD, Z65TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A66TBM24_DOM_VAR_NM, Z66TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A67TBM24_CRF_ITEM_DIV, Z67TBM24_CRF_ITEM_DIV) != 0 ) )
      {
         A64TBM24_STUDY_ID = Z64TBM24_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
         A65TBM24_DOM_CD = Z65TBM24_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
         A66TBM24_DOM_VAR_NM = Z66TBM24_DOM_VAR_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
         A67TBM24_CRF_ITEM_DIV = Z67TBM24_CRF_ITEM_DIV ;
         httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
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
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM24_DOM_ITM_GRP_OID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0W31( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM24_DOM_ITM_GRP_OID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0W31( ) ;
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
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM24_DOM_ITM_GRP_OID_Internalname ;
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
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM24_DOM_ITM_GRP_OID_Internalname ;
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
      scanStart0W31( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound31 != 0 )
         {
            scanNext0W31( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM24_DOM_ITM_GRP_OID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0W31( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0W31( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000W2 */
         pr_default.execute(0, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM24_MAP_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z545TBM24_CRT_DATETIME.equals( T000W2_A545TBM24_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z546TBM24_CRT_USER_ID, T000W2_A546TBM24_CRT_USER_ID[0]) != 0 ) || !( Z548TBM24_UPD_DATETIME.equals( T000W2_A548TBM24_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z549TBM24_UPD_USER_ID, T000W2_A549TBM24_UPD_USER_ID[0]) != 0 ) || ( Z551TBM24_UPD_CNT != T000W2_A551TBM24_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z702TBM24_DOM_ITM_GRP_OID, T000W2_A702TBM24_DOM_ITM_GRP_OID[0]) != 0 ) || ( Z703TBM24_DOM_ITM_GRP_ATTR_SEQ != T000W2_A703TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ) || ( Z704TBM24_DOM_ITM_GRP_ROWNO != T000W2_A704TBM24_DOM_ITM_GRP_ROWNO[0] ) || ( GXutil.strcmp(Z705TBM24_CRF_ITEM_NM, T000W2_A705TBM24_CRF_ITEM_NM[0]) != 0 ) || ( GXutil.strcmp(Z635TBM24_IDENTIFICATION_CD, T000W2_A635TBM24_IDENTIFICATION_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z636TBM24_TEXT_MAXLENGTH != T000W2_A636TBM24_TEXT_MAXLENGTH[0] ) || ( Z637TBM24_TEXT_MAXROWS != T000W2_A637TBM24_TEXT_MAXROWS[0] ) || ( Z638TBM24_DECIMAL_DIGITS != T000W2_A638TBM24_DECIMAL_DIGITS[0] ) || ( GXutil.strcmp(Z639TBM24_TEXT, T000W2_A639TBM24_TEXT[0]) != 0 ) || ( GXutil.strcmp(Z640TBM24_FIXED_VALUE, T000W2_A640TBM24_FIXED_VALUE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z641TBM24_CHK_FALSE_INNER_VALUE, T000W2_A641TBM24_CHK_FALSE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z706TBM24_REQUIRED_INPUT_FLG, T000W2_A706TBM24_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z707TBM24_MIN_VALUE, T000W2_A707TBM24_MIN_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z708TBM24_MAX_VALUE, T000W2_A708TBM24_MAX_VALUE[0]) != 0 ) || ( Z543TBM24_ORDER != T000W2_A543TBM24_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z544TBM24_DEL_FLG, T000W2_A544TBM24_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z547TBM24_CRT_PROG_NM, T000W2_A547TBM24_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z550TBM24_UPD_PROG_NM, T000W2_A550TBM24_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM24_MAP_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0W31( )
   {
      beforeValidate0W31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0W31( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0W31( 0) ;
         checkOptimisticConcurrency0W31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0W31( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0W31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000W9 */
                  pr_default.execute(7, new Object[] {A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV, new Boolean(n545TBM24_CRT_DATETIME), A545TBM24_CRT_DATETIME, new Boolean(n546TBM24_CRT_USER_ID), A546TBM24_CRT_USER_ID, new Boolean(n548TBM24_UPD_DATETIME), A548TBM24_UPD_DATETIME, new Boolean(n549TBM24_UPD_USER_ID), A549TBM24_UPD_USER_ID, new Boolean(n551TBM24_UPD_CNT), new Long(A551TBM24_UPD_CNT), new Boolean(n702TBM24_DOM_ITM_GRP_OID), A702TBM24_DOM_ITM_GRP_OID, new Boolean(n703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Short(A703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n704TBM24_DOM_ITM_GRP_ROWNO), new Short(A704TBM24_DOM_ITM_GRP_ROWNO), new Boolean(n705TBM24_CRF_ITEM_NM), A705TBM24_CRF_ITEM_NM, new Boolean(n635TBM24_IDENTIFICATION_CD), A635TBM24_IDENTIFICATION_CD, new Boolean(n636TBM24_TEXT_MAXLENGTH), new Short(A636TBM24_TEXT_MAXLENGTH), new Boolean(n637TBM24_TEXT_MAXROWS), new Byte(A637TBM24_TEXT_MAXROWS), new Boolean(n638TBM24_DECIMAL_DIGITS), new Byte(A638TBM24_DECIMAL_DIGITS), new Boolean(n639TBM24_TEXT), A639TBM24_TEXT, new Boolean(n640TBM24_FIXED_VALUE), A640TBM24_FIXED_VALUE, new Boolean(n641TBM24_CHK_FALSE_INNER_VALUE), A641TBM24_CHK_FALSE_INNER_VALUE, new Boolean(n706TBM24_REQUIRED_INPUT_FLG), A706TBM24_REQUIRED_INPUT_FLG, new Boolean(n707TBM24_MIN_VALUE), A707TBM24_MIN_VALUE, new Boolean(n708TBM24_MAX_VALUE), A708TBM24_MAX_VALUE, new Boolean(n543TBM24_ORDER), new Integer(A543TBM24_ORDER), new Boolean(n544TBM24_DEL_FLG), A544TBM24_DEL_FLG, new Boolean(n547TBM24_CRT_PROG_NM), A547TBM24_CRT_PROG_NM, new Boolean(n550TBM24_UPD_PROG_NM), A550TBM24_UPD_PROG_NM, new Long(A64TBM24_STUDY_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM24_MAP_ITEM") ;
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
                        resetCaption0W0( ) ;
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
            load0W31( ) ;
         }
         endLevel0W31( ) ;
      }
      closeExtendedTableCursors0W31( ) ;
   }

   public void update0W31( )
   {
      beforeValidate0W31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0W31( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0W31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0W31( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0W31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000W10 */
                  pr_default.execute(8, new Object[] {new Boolean(n545TBM24_CRT_DATETIME), A545TBM24_CRT_DATETIME, new Boolean(n546TBM24_CRT_USER_ID), A546TBM24_CRT_USER_ID, new Boolean(n548TBM24_UPD_DATETIME), A548TBM24_UPD_DATETIME, new Boolean(n549TBM24_UPD_USER_ID), A549TBM24_UPD_USER_ID, new Boolean(n551TBM24_UPD_CNT), new Long(A551TBM24_UPD_CNT), new Boolean(n702TBM24_DOM_ITM_GRP_OID), A702TBM24_DOM_ITM_GRP_OID, new Boolean(n703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Short(A703TBM24_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n704TBM24_DOM_ITM_GRP_ROWNO), new Short(A704TBM24_DOM_ITM_GRP_ROWNO), new Boolean(n705TBM24_CRF_ITEM_NM), A705TBM24_CRF_ITEM_NM, new Boolean(n635TBM24_IDENTIFICATION_CD), A635TBM24_IDENTIFICATION_CD, new Boolean(n636TBM24_TEXT_MAXLENGTH), new Short(A636TBM24_TEXT_MAXLENGTH), new Boolean(n637TBM24_TEXT_MAXROWS), new Byte(A637TBM24_TEXT_MAXROWS), new Boolean(n638TBM24_DECIMAL_DIGITS), new Byte(A638TBM24_DECIMAL_DIGITS), new Boolean(n639TBM24_TEXT), A639TBM24_TEXT, new Boolean(n640TBM24_FIXED_VALUE), A640TBM24_FIXED_VALUE, new Boolean(n641TBM24_CHK_FALSE_INNER_VALUE), A641TBM24_CHK_FALSE_INNER_VALUE, new Boolean(n706TBM24_REQUIRED_INPUT_FLG), A706TBM24_REQUIRED_INPUT_FLG, new Boolean(n707TBM24_MIN_VALUE), A707TBM24_MIN_VALUE, new Boolean(n708TBM24_MAX_VALUE), A708TBM24_MAX_VALUE, new Boolean(n543TBM24_ORDER), new Integer(A543TBM24_ORDER), new Boolean(n544TBM24_DEL_FLG), A544TBM24_DEL_FLG, new Boolean(n547TBM24_CRT_PROG_NM), A547TBM24_CRT_PROG_NM, new Boolean(n550TBM24_UPD_PROG_NM), A550TBM24_UPD_PROG_NM, new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM24_MAP_ITEM") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM24_MAP_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0W31( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0W0( ) ;
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
         endLevel0W31( ) ;
      }
      closeExtendedTableCursors0W31( ) ;
   }

   public void deferredUpdate0W31( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0W31( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0W31( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0W31( ) ;
         afterConfirm0W31( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0W31( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000W11 */
               pr_default.execute(9, new Object[] {new Long(A64TBM24_STUDY_ID), A65TBM24_DOM_CD, A66TBM24_DOM_VAR_NM, A67TBM24_CRF_ITEM_DIV});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM24_MAP_ITEM") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound31 == 0 )
                     {
                        initAll0W31( ) ;
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
                     resetCaption0W0( ) ;
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
      sMode31 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0W31( ) ;
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0W31( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM24_MAP_ITEM" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0W31( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0W31( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm24_map_item");
         if ( AnyError == 0 )
         {
            confirmValues0W0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm24_map_item");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0W31( )
   {
      /* Scan By routine */
      /* Using cursor T000W12 */
      pr_default.execute(10);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A64TBM24_STUDY_ID = T000W12_A64TBM24_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
         A65TBM24_DOM_CD = T000W12_A65TBM24_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
         A66TBM24_DOM_VAR_NM = T000W12_A66TBM24_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
         A67TBM24_CRF_ITEM_DIV = T000W12_A67TBM24_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0W31( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A64TBM24_STUDY_ID = T000W12_A64TBM24_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
         A65TBM24_DOM_CD = T000W12_A65TBM24_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
         A66TBM24_DOM_VAR_NM = T000W12_A66TBM24_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
         A67TBM24_CRF_ITEM_DIV = T000W12_A67TBM24_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
      }
   }

   public void scanEnd0W31( )
   {
      pr_default.close(10);
   }

   public void afterConfirm0W31( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0W31( )
   {
      /* Before Insert Rules */
      A545TBM24_CRT_DATETIME = GXutil.now( ) ;
      n545TBM24_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_CRT_DATETIME", localUtil.ttoc( A545TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A546TBM24_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A546TBM24_CRT_USER_ID = GXt_char1 ;
      n546TBM24_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_CRT_USER_ID", A546TBM24_CRT_USER_ID);
      A548TBM24_UPD_DATETIME = GXutil.now( ) ;
      n548TBM24_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_UPD_DATETIME", localUtil.ttoc( A548TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A549TBM24_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A549TBM24_UPD_USER_ID = GXt_char1 ;
      n549TBM24_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_UPD_USER_ID", A549TBM24_UPD_USER_ID);
      A551TBM24_UPD_CNT = (long)(O551TBM24_UPD_CNT+1) ;
      n551TBM24_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A551TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0W31( )
   {
      /* Before Update Rules */
      A548TBM24_UPD_DATETIME = GXutil.now( ) ;
      n548TBM24_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_UPD_DATETIME", localUtil.ttoc( A548TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A549TBM24_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A549TBM24_UPD_USER_ID = GXt_char1 ;
      n549TBM24_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_UPD_USER_ID", A549TBM24_UPD_USER_ID);
      A551TBM24_UPD_CNT = (long)(O551TBM24_UPD_CNT+1) ;
      n551TBM24_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A551TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0W31( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0W31( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0W31( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0W31( )
   {
      edtTBM24_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_STUDY_ID_Enabled, 5, 0)));
      edtTBM24_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_DOM_CD_Enabled, 5, 0)));
      edtTBM24_DOM_VAR_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_DOM_VAR_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_DOM_VAR_NM_Enabled, 5, 0)));
      edtTBM24_DOM_ITM_GRP_OID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_DOM_ITM_GRP_OID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_DOM_ITM_GRP_OID_Enabled, 5, 0)));
      edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Enabled, 5, 0)));
      edtTBM24_DOM_ITM_GRP_ROWNO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_DOM_ITM_GRP_ROWNO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_DOM_ITM_GRP_ROWNO_Enabled, 5, 0)));
      edtTBM24_CRF_ITEM_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_CRF_ITEM_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_CRF_ITEM_NM_Enabled, 5, 0)));
      edtTBM24_CRF_ITEM_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_CRF_ITEM_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_CRF_ITEM_DIV_Enabled, 5, 0)));
      edtTBM24_IDENTIFICATION_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_IDENTIFICATION_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_IDENTIFICATION_CD_Enabled, 5, 0)));
      edtTBM24_TEXT_MAXLENGTH_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_TEXT_MAXLENGTH_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_TEXT_MAXLENGTH_Enabled, 5, 0)));
      edtTBM24_TEXT_MAXROWS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_TEXT_MAXROWS_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_TEXT_MAXROWS_Enabled, 5, 0)));
      edtTBM24_DECIMAL_DIGITS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_DECIMAL_DIGITS_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_DECIMAL_DIGITS_Enabled, 5, 0)));
      edtTBM24_TEXT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_TEXT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_TEXT_Enabled, 5, 0)));
      edtTBM24_FIXED_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_FIXED_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_FIXED_VALUE_Enabled, 5, 0)));
      edtTBM24_CHK_FALSE_INNER_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_CHK_FALSE_INNER_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_CHK_FALSE_INNER_VALUE_Enabled, 5, 0)));
      edtTBM24_REQUIRED_INPUT_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_REQUIRED_INPUT_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_REQUIRED_INPUT_FLG_Enabled, 5, 0)));
      edtTBM24_MIN_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_MIN_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_MIN_VALUE_Enabled, 5, 0)));
      edtTBM24_MAX_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_MAX_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_MAX_VALUE_Enabled, 5, 0)));
      edtTBM24_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_ORDER_Enabled, 5, 0)));
      edtTBM24_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_DEL_FLG_Enabled, 5, 0)));
      edtTBM24_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM24_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM24_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM24_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM24_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM24_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM24_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM24_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM24_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0W0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "マッピング済部品マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?2017731715280");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm24_map_item") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0W31( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z64TBM24_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z64TBM24_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z65TBM24_DOM_CD", GXutil.rtrim( Z65TBM24_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z66TBM24_DOM_VAR_NM", GXutil.rtrim( Z66TBM24_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z67TBM24_CRF_ITEM_DIV", GXutil.rtrim( Z67TBM24_CRF_ITEM_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z545TBM24_CRT_DATETIME", localUtil.ttoc( Z545TBM24_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z546TBM24_CRT_USER_ID", GXutil.rtrim( Z546TBM24_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z548TBM24_UPD_DATETIME", localUtil.ttoc( Z548TBM24_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z549TBM24_UPD_USER_ID", GXutil.rtrim( Z549TBM24_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z551TBM24_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z551TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z702TBM24_DOM_ITM_GRP_OID", GXutil.rtrim( Z702TBM24_DOM_ITM_GRP_OID));
      GxWebStd.gx_hidden_field( httpContext, "Z703TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( localUtil.ntoc( Z703TBM24_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z704TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( localUtil.ntoc( Z704TBM24_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z705TBM24_CRF_ITEM_NM", GXutil.rtrim( Z705TBM24_CRF_ITEM_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z635TBM24_IDENTIFICATION_CD", GXutil.rtrim( Z635TBM24_IDENTIFICATION_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z636TBM24_TEXT_MAXLENGTH", GXutil.ltrim( localUtil.ntoc( Z636TBM24_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z637TBM24_TEXT_MAXROWS", GXutil.ltrim( localUtil.ntoc( Z637TBM24_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z638TBM24_DECIMAL_DIGITS", GXutil.ltrim( localUtil.ntoc( Z638TBM24_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z639TBM24_TEXT", GXutil.rtrim( Z639TBM24_TEXT));
      GxWebStd.gx_hidden_field( httpContext, "Z640TBM24_FIXED_VALUE", GXutil.rtrim( Z640TBM24_FIXED_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z641TBM24_CHK_FALSE_INNER_VALUE", GXutil.rtrim( Z641TBM24_CHK_FALSE_INNER_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z706TBM24_REQUIRED_INPUT_FLG", GXutil.rtrim( Z706TBM24_REQUIRED_INPUT_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z707TBM24_MIN_VALUE", GXutil.rtrim( Z707TBM24_MIN_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z708TBM24_MAX_VALUE", GXutil.rtrim( Z708TBM24_MAX_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z543TBM24_ORDER", GXutil.ltrim( localUtil.ntoc( Z543TBM24_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z544TBM24_DEL_FLG", GXutil.rtrim( Z544TBM24_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z547TBM24_CRT_PROG_NM", GXutil.rtrim( Z547TBM24_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z550TBM24_UPD_PROG_NM", GXutil.rtrim( Z550TBM24_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O551TBM24_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O551TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM24_MAP_ITEM" ;
   }

   public String getPgmdesc( )
   {
      return "マッピング済部品マスタ" ;
   }

   public void initializeNonKey0W31( )
   {
      A545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n545TBM24_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_CRT_DATETIME", localUtil.ttoc( A545TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n545TBM24_CRT_DATETIME = (GXutil.nullDate().equals(A545TBM24_CRT_DATETIME) ? true : false) ;
      A546TBM24_CRT_USER_ID = "" ;
      n546TBM24_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_CRT_USER_ID", A546TBM24_CRT_USER_ID);
      n546TBM24_CRT_USER_ID = ((GXutil.strcmp("", A546TBM24_CRT_USER_ID)==0) ? true : false) ;
      A548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n548TBM24_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_UPD_DATETIME", localUtil.ttoc( A548TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n548TBM24_UPD_DATETIME = (GXutil.nullDate().equals(A548TBM24_UPD_DATETIME) ? true : false) ;
      A549TBM24_UPD_USER_ID = "" ;
      n549TBM24_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_UPD_USER_ID", A549TBM24_UPD_USER_ID);
      n549TBM24_UPD_USER_ID = ((GXutil.strcmp("", A549TBM24_UPD_USER_ID)==0) ? true : false) ;
      A551TBM24_UPD_CNT = 0 ;
      n551TBM24_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A551TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)));
      n551TBM24_UPD_CNT = ((0==A551TBM24_UPD_CNT) ? true : false) ;
      A702TBM24_DOM_ITM_GRP_OID = "" ;
      n702TBM24_DOM_ITM_GRP_OID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A702TBM24_DOM_ITM_GRP_OID", A702TBM24_DOM_ITM_GRP_OID);
      n702TBM24_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A702TBM24_DOM_ITM_GRP_OID)==0) ? true : false) ;
      A703TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
      n703TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A703TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
      n703TBM24_DOM_ITM_GRP_ATTR_SEQ = ((0==A703TBM24_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
      A704TBM24_DOM_ITM_GRP_ROWNO = (short)(0) ;
      n704TBM24_DOM_ITM_GRP_ROWNO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A704TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A704TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
      n704TBM24_DOM_ITM_GRP_ROWNO = ((0==A704TBM24_DOM_ITM_GRP_ROWNO) ? true : false) ;
      A705TBM24_CRF_ITEM_NM = "" ;
      n705TBM24_CRF_ITEM_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A705TBM24_CRF_ITEM_NM", A705TBM24_CRF_ITEM_NM);
      n705TBM24_CRF_ITEM_NM = ((GXutil.strcmp("", A705TBM24_CRF_ITEM_NM)==0) ? true : false) ;
      A635TBM24_IDENTIFICATION_CD = "" ;
      n635TBM24_IDENTIFICATION_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A635TBM24_IDENTIFICATION_CD", A635TBM24_IDENTIFICATION_CD);
      n635TBM24_IDENTIFICATION_CD = ((GXutil.strcmp("", A635TBM24_IDENTIFICATION_CD)==0) ? true : false) ;
      A636TBM24_TEXT_MAXLENGTH = (short)(0) ;
      n636TBM24_TEXT_MAXLENGTH = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A636TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A636TBM24_TEXT_MAXLENGTH, 3, 0)));
      n636TBM24_TEXT_MAXLENGTH = ((0==A636TBM24_TEXT_MAXLENGTH) ? true : false) ;
      A637TBM24_TEXT_MAXROWS = (byte)(0) ;
      n637TBM24_TEXT_MAXROWS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A637TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A637TBM24_TEXT_MAXROWS, 2, 0)));
      n637TBM24_TEXT_MAXROWS = ((0==A637TBM24_TEXT_MAXROWS) ? true : false) ;
      A638TBM24_DECIMAL_DIGITS = (byte)(0) ;
      n638TBM24_DECIMAL_DIGITS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A638TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A638TBM24_DECIMAL_DIGITS, 2, 0)));
      n638TBM24_DECIMAL_DIGITS = ((0==A638TBM24_DECIMAL_DIGITS) ? true : false) ;
      A639TBM24_TEXT = "" ;
      n639TBM24_TEXT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A639TBM24_TEXT", A639TBM24_TEXT);
      n639TBM24_TEXT = ((GXutil.strcmp("", A639TBM24_TEXT)==0) ? true : false) ;
      A640TBM24_FIXED_VALUE = "" ;
      n640TBM24_FIXED_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A640TBM24_FIXED_VALUE", A640TBM24_FIXED_VALUE);
      n640TBM24_FIXED_VALUE = ((GXutil.strcmp("", A640TBM24_FIXED_VALUE)==0) ? true : false) ;
      A641TBM24_CHK_FALSE_INNER_VALUE = "" ;
      n641TBM24_CHK_FALSE_INNER_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A641TBM24_CHK_FALSE_INNER_VALUE", A641TBM24_CHK_FALSE_INNER_VALUE);
      n641TBM24_CHK_FALSE_INNER_VALUE = ((GXutil.strcmp("", A641TBM24_CHK_FALSE_INNER_VALUE)==0) ? true : false) ;
      A706TBM24_REQUIRED_INPUT_FLG = "" ;
      n706TBM24_REQUIRED_INPUT_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A706TBM24_REQUIRED_INPUT_FLG", A706TBM24_REQUIRED_INPUT_FLG);
      n706TBM24_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A706TBM24_REQUIRED_INPUT_FLG)==0) ? true : false) ;
      A707TBM24_MIN_VALUE = "" ;
      n707TBM24_MIN_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A707TBM24_MIN_VALUE", A707TBM24_MIN_VALUE);
      n707TBM24_MIN_VALUE = ((GXutil.strcmp("", A707TBM24_MIN_VALUE)==0) ? true : false) ;
      A708TBM24_MAX_VALUE = "" ;
      n708TBM24_MAX_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A708TBM24_MAX_VALUE", A708TBM24_MAX_VALUE);
      n708TBM24_MAX_VALUE = ((GXutil.strcmp("", A708TBM24_MAX_VALUE)==0) ? true : false) ;
      A543TBM24_ORDER = 0 ;
      n543TBM24_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_ORDER", GXutil.ltrim( GXutil.str( A543TBM24_ORDER, 5, 0)));
      n543TBM24_ORDER = ((0==A543TBM24_ORDER) ? true : false) ;
      A544TBM24_DEL_FLG = "" ;
      n544TBM24_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_DEL_FLG", A544TBM24_DEL_FLG);
      n544TBM24_DEL_FLG = ((GXutil.strcmp("", A544TBM24_DEL_FLG)==0) ? true : false) ;
      A547TBM24_CRT_PROG_NM = "" ;
      n547TBM24_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A547TBM24_CRT_PROG_NM", A547TBM24_CRT_PROG_NM);
      n547TBM24_CRT_PROG_NM = ((GXutil.strcmp("", A547TBM24_CRT_PROG_NM)==0) ? true : false) ;
      A550TBM24_UPD_PROG_NM = "" ;
      n550TBM24_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A550TBM24_UPD_PROG_NM", A550TBM24_UPD_PROG_NM);
      n550TBM24_UPD_PROG_NM = ((GXutil.strcmp("", A550TBM24_UPD_PROG_NM)==0) ? true : false) ;
      O551TBM24_UPD_CNT = A551TBM24_UPD_CNT ;
      n551TBM24_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A551TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A551TBM24_UPD_CNT, 10, 0)));
   }

   public void initAll0W31( )
   {
      A64TBM24_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A64TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A64TBM24_STUDY_ID, 10, 0)));
      A65TBM24_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65TBM24_DOM_CD", A65TBM24_DOM_CD);
      A66TBM24_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A66TBM24_DOM_VAR_NM", A66TBM24_DOM_VAR_NM);
      A67TBM24_CRF_ITEM_DIV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A67TBM24_CRF_ITEM_DIV", A67TBM24_CRF_ITEM_DIV);
      initializeNonKey0W31( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317152816");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm24_map_item.js", "?20177317152818");
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
      lblTextblocktbm24_study_id_Internalname = "TEXTBLOCKTBM24_STUDY_ID" ;
      edtTBM24_STUDY_ID_Internalname = "TBM24_STUDY_ID" ;
      lblTextblocktbm24_dom_cd_Internalname = "TEXTBLOCKTBM24_DOM_CD" ;
      edtTBM24_DOM_CD_Internalname = "TBM24_DOM_CD" ;
      lblTextblocktbm24_dom_var_nm_Internalname = "TEXTBLOCKTBM24_DOM_VAR_NM" ;
      edtTBM24_DOM_VAR_NM_Internalname = "TBM24_DOM_VAR_NM" ;
      lblTextblocktbm24_dom_itm_grp_oid_Internalname = "TEXTBLOCKTBM24_DOM_ITM_GRP_OID" ;
      edtTBM24_DOM_ITM_GRP_OID_Internalname = "TBM24_DOM_ITM_GRP_OID" ;
      lblTextblocktbm24_dom_itm_grp_attr_seq_Internalname = "TEXTBLOCKTBM24_DOM_ITM_GRP_ATTR_SEQ" ;
      edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname = "TBM24_DOM_ITM_GRP_ATTR_SEQ" ;
      lblTextblocktbm24_dom_itm_grp_rowno_Internalname = "TEXTBLOCKTBM24_DOM_ITM_GRP_ROWNO" ;
      edtTBM24_DOM_ITM_GRP_ROWNO_Internalname = "TBM24_DOM_ITM_GRP_ROWNO" ;
      lblTextblocktbm24_crf_item_nm_Internalname = "TEXTBLOCKTBM24_CRF_ITEM_NM" ;
      edtTBM24_CRF_ITEM_NM_Internalname = "TBM24_CRF_ITEM_NM" ;
      lblTextblocktbm24_crf_item_div_Internalname = "TEXTBLOCKTBM24_CRF_ITEM_DIV" ;
      edtTBM24_CRF_ITEM_DIV_Internalname = "TBM24_CRF_ITEM_DIV" ;
      lblTextblocktbm24_identification_cd_Internalname = "TEXTBLOCKTBM24_IDENTIFICATION_CD" ;
      edtTBM24_IDENTIFICATION_CD_Internalname = "TBM24_IDENTIFICATION_CD" ;
      lblTextblocktbm24_text_maxlength_Internalname = "TEXTBLOCKTBM24_TEXT_MAXLENGTH" ;
      edtTBM24_TEXT_MAXLENGTH_Internalname = "TBM24_TEXT_MAXLENGTH" ;
      lblTextblocktbm24_text_maxrows_Internalname = "TEXTBLOCKTBM24_TEXT_MAXROWS" ;
      edtTBM24_TEXT_MAXROWS_Internalname = "TBM24_TEXT_MAXROWS" ;
      lblTextblocktbm24_decimal_digits_Internalname = "TEXTBLOCKTBM24_DECIMAL_DIGITS" ;
      edtTBM24_DECIMAL_DIGITS_Internalname = "TBM24_DECIMAL_DIGITS" ;
      lblTextblocktbm24_text_Internalname = "TEXTBLOCKTBM24_TEXT" ;
      edtTBM24_TEXT_Internalname = "TBM24_TEXT" ;
      lblTextblocktbm24_fixed_value_Internalname = "TEXTBLOCKTBM24_FIXED_VALUE" ;
      edtTBM24_FIXED_VALUE_Internalname = "TBM24_FIXED_VALUE" ;
      lblTextblocktbm24_chk_false_inner_value_Internalname = "TEXTBLOCKTBM24_CHK_FALSE_INNER_VALUE" ;
      edtTBM24_CHK_FALSE_INNER_VALUE_Internalname = "TBM24_CHK_FALSE_INNER_VALUE" ;
      lblTextblocktbm24_required_input_flg_Internalname = "TEXTBLOCKTBM24_REQUIRED_INPUT_FLG" ;
      edtTBM24_REQUIRED_INPUT_FLG_Internalname = "TBM24_REQUIRED_INPUT_FLG" ;
      lblTextblocktbm24_min_value_Internalname = "TEXTBLOCKTBM24_MIN_VALUE" ;
      edtTBM24_MIN_VALUE_Internalname = "TBM24_MIN_VALUE" ;
      lblTextblocktbm24_max_value_Internalname = "TEXTBLOCKTBM24_MAX_VALUE" ;
      edtTBM24_MAX_VALUE_Internalname = "TBM24_MAX_VALUE" ;
      lblTextblocktbm24_order_Internalname = "TEXTBLOCKTBM24_ORDER" ;
      edtTBM24_ORDER_Internalname = "TBM24_ORDER" ;
      lblTextblocktbm24_del_flg_Internalname = "TEXTBLOCKTBM24_DEL_FLG" ;
      edtTBM24_DEL_FLG_Internalname = "TBM24_DEL_FLG" ;
      lblTextblocktbm24_crt_datetime_Internalname = "TEXTBLOCKTBM24_CRT_DATETIME" ;
      edtTBM24_CRT_DATETIME_Internalname = "TBM24_CRT_DATETIME" ;
      lblTextblocktbm24_crt_user_id_Internalname = "TEXTBLOCKTBM24_CRT_USER_ID" ;
      edtTBM24_CRT_USER_ID_Internalname = "TBM24_CRT_USER_ID" ;
      lblTextblocktbm24_crt_prog_nm_Internalname = "TEXTBLOCKTBM24_CRT_PROG_NM" ;
      edtTBM24_CRT_PROG_NM_Internalname = "TBM24_CRT_PROG_NM" ;
      lblTextblocktbm24_upd_datetime_Internalname = "TEXTBLOCKTBM24_UPD_DATETIME" ;
      edtTBM24_UPD_DATETIME_Internalname = "TBM24_UPD_DATETIME" ;
      lblTextblocktbm24_upd_user_id_Internalname = "TEXTBLOCKTBM24_UPD_USER_ID" ;
      edtTBM24_UPD_USER_ID_Internalname = "TBM24_UPD_USER_ID" ;
      lblTextblocktbm24_upd_prog_nm_Internalname = "TEXTBLOCKTBM24_UPD_PROG_NM" ;
      edtTBM24_UPD_PROG_NM_Internalname = "TBM24_UPD_PROG_NM" ;
      lblTextblocktbm24_upd_cnt_Internalname = "TEXTBLOCKTBM24_UPD_CNT" ;
      edtTBM24_UPD_CNT_Internalname = "TBM24_UPD_CNT" ;
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
      edtTBM24_UPD_CNT_Jsonclick = "" ;
      edtTBM24_UPD_CNT_Enabled = 1 ;
      edtTBM24_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM24_UPD_PROG_NM_Enabled = 1 ;
      edtTBM24_UPD_USER_ID_Jsonclick = "" ;
      edtTBM24_UPD_USER_ID_Enabled = 1 ;
      edtTBM24_UPD_DATETIME_Jsonclick = "" ;
      edtTBM24_UPD_DATETIME_Enabled = 1 ;
      edtTBM24_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM24_CRT_PROG_NM_Enabled = 1 ;
      edtTBM24_CRT_USER_ID_Jsonclick = "" ;
      edtTBM24_CRT_USER_ID_Enabled = 1 ;
      edtTBM24_CRT_DATETIME_Jsonclick = "" ;
      edtTBM24_CRT_DATETIME_Enabled = 1 ;
      edtTBM24_DEL_FLG_Jsonclick = "" ;
      edtTBM24_DEL_FLG_Enabled = 1 ;
      edtTBM24_ORDER_Jsonclick = "" ;
      edtTBM24_ORDER_Enabled = 1 ;
      edtTBM24_MAX_VALUE_Jsonclick = "" ;
      edtTBM24_MAX_VALUE_Enabled = 1 ;
      edtTBM24_MIN_VALUE_Jsonclick = "" ;
      edtTBM24_MIN_VALUE_Enabled = 1 ;
      edtTBM24_REQUIRED_INPUT_FLG_Jsonclick = "" ;
      edtTBM24_REQUIRED_INPUT_FLG_Enabled = 1 ;
      edtTBM24_CHK_FALSE_INNER_VALUE_Jsonclick = "" ;
      edtTBM24_CHK_FALSE_INNER_VALUE_Enabled = 1 ;
      edtTBM24_FIXED_VALUE_Jsonclick = "" ;
      edtTBM24_FIXED_VALUE_Enabled = 1 ;
      edtTBM24_TEXT_Enabled = 1 ;
      edtTBM24_DECIMAL_DIGITS_Jsonclick = "" ;
      edtTBM24_DECIMAL_DIGITS_Enabled = 1 ;
      edtTBM24_TEXT_MAXROWS_Jsonclick = "" ;
      edtTBM24_TEXT_MAXROWS_Enabled = 1 ;
      edtTBM24_TEXT_MAXLENGTH_Jsonclick = "" ;
      edtTBM24_TEXT_MAXLENGTH_Enabled = 1 ;
      edtTBM24_IDENTIFICATION_CD_Jsonclick = "" ;
      edtTBM24_IDENTIFICATION_CD_Enabled = 1 ;
      edtTBM24_CRF_ITEM_DIV_Jsonclick = "" ;
      edtTBM24_CRF_ITEM_DIV_Enabled = 1 ;
      edtTBM24_CRF_ITEM_NM_Enabled = 1 ;
      edtTBM24_DOM_ITM_GRP_ROWNO_Jsonclick = "" ;
      edtTBM24_DOM_ITM_GRP_ROWNO_Enabled = 1 ;
      edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Jsonclick = "" ;
      edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Enabled = 1 ;
      edtTBM24_DOM_ITM_GRP_OID_Jsonclick = "" ;
      edtTBM24_DOM_ITM_GRP_OID_Enabled = 1 ;
      edtTBM24_DOM_VAR_NM_Jsonclick = "" ;
      edtTBM24_DOM_VAR_NM_Enabled = 1 ;
      edtTBM24_DOM_CD_Jsonclick = "" ;
      edtTBM24_DOM_CD_Enabled = 1 ;
      edtTBM24_STUDY_ID_Jsonclick = "" ;
      edtTBM24_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm24_crt_user_id0W31( String Gx_mode )
   {
      GXt_char1 = A546TBM24_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A546TBM24_CRT_USER_ID = GXt_char1 ;
      n546TBM24_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_CRT_USER_ID", A546TBM24_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A546TBM24_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm24_upd_user_id0W31( String Gx_mode )
   {
      GXt_char1 = A549TBM24_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm24_map_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A549TBM24_UPD_USER_ID = GXt_char1 ;
      n549TBM24_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_UPD_USER_ID", A549TBM24_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A549TBM24_UPD_USER_ID))+"\"");
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
      /* Using cursor T000W13 */
      pr_default.execute(11, new Object[] {new Long(A64TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("'マッピング済部品マスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(11);
      GX_FocusControl = edtTBM24_DOM_ITM_GRP_OID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm24_study_id( long GX_Parm1 )
   {
      A64TBM24_STUDY_ID = GX_Parm1 ;
      /* Using cursor T000W13 */
      pr_default.execute(11, new Object[] {new Long(A64TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("'マッピング済部品マスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
      }
      pr_default.close(11);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm24_crf_item_div( long GX_Parm1 ,
                                         String GX_Parm2 ,
                                         String GX_Parm3 ,
                                         String GX_Parm4 ,
                                         java.util.Date GX_Parm5 ,
                                         String GX_Parm6 ,
                                         java.util.Date GX_Parm7 ,
                                         String GX_Parm8 ,
                                         long GX_Parm9 ,
                                         String GX_Parm10 ,
                                         short GX_Parm11 ,
                                         short GX_Parm12 ,
                                         String GX_Parm13 ,
                                         String GX_Parm14 ,
                                         short GX_Parm15 ,
                                         byte GX_Parm16 ,
                                         byte GX_Parm17 ,
                                         String GX_Parm18 ,
                                         String GX_Parm19 ,
                                         String GX_Parm20 ,
                                         String GX_Parm21 ,
                                         String GX_Parm22 ,
                                         String GX_Parm23 ,
                                         int GX_Parm24 ,
                                         String GX_Parm25 ,
                                         String GX_Parm26 ,
                                         String GX_Parm27 )
   {
      A64TBM24_STUDY_ID = GX_Parm1 ;
      A65TBM24_DOM_CD = GX_Parm2 ;
      A66TBM24_DOM_VAR_NM = GX_Parm3 ;
      A67TBM24_CRF_ITEM_DIV = GX_Parm4 ;
      A545TBM24_CRT_DATETIME = GX_Parm5 ;
      n545TBM24_CRT_DATETIME = false ;
      A546TBM24_CRT_USER_ID = GX_Parm6 ;
      n546TBM24_CRT_USER_ID = false ;
      A548TBM24_UPD_DATETIME = GX_Parm7 ;
      n548TBM24_UPD_DATETIME = false ;
      A549TBM24_UPD_USER_ID = GX_Parm8 ;
      n549TBM24_UPD_USER_ID = false ;
      A551TBM24_UPD_CNT = GX_Parm9 ;
      n551TBM24_UPD_CNT = false ;
      A702TBM24_DOM_ITM_GRP_OID = GX_Parm10 ;
      n702TBM24_DOM_ITM_GRP_OID = false ;
      A703TBM24_DOM_ITM_GRP_ATTR_SEQ = GX_Parm11 ;
      n703TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
      A704TBM24_DOM_ITM_GRP_ROWNO = GX_Parm12 ;
      n704TBM24_DOM_ITM_GRP_ROWNO = false ;
      A705TBM24_CRF_ITEM_NM = GX_Parm13 ;
      n705TBM24_CRF_ITEM_NM = false ;
      A635TBM24_IDENTIFICATION_CD = GX_Parm14 ;
      n635TBM24_IDENTIFICATION_CD = false ;
      A636TBM24_TEXT_MAXLENGTH = GX_Parm15 ;
      n636TBM24_TEXT_MAXLENGTH = false ;
      A637TBM24_TEXT_MAXROWS = GX_Parm16 ;
      n637TBM24_TEXT_MAXROWS = false ;
      A638TBM24_DECIMAL_DIGITS = GX_Parm17 ;
      n638TBM24_DECIMAL_DIGITS = false ;
      A639TBM24_TEXT = GX_Parm18 ;
      n639TBM24_TEXT = false ;
      A640TBM24_FIXED_VALUE = GX_Parm19 ;
      n640TBM24_FIXED_VALUE = false ;
      A641TBM24_CHK_FALSE_INNER_VALUE = GX_Parm20 ;
      n641TBM24_CHK_FALSE_INNER_VALUE = false ;
      A706TBM24_REQUIRED_INPUT_FLG = GX_Parm21 ;
      n706TBM24_REQUIRED_INPUT_FLG = false ;
      A707TBM24_MIN_VALUE = GX_Parm22 ;
      n707TBM24_MIN_VALUE = false ;
      A708TBM24_MAX_VALUE = GX_Parm23 ;
      n708TBM24_MAX_VALUE = false ;
      A543TBM24_ORDER = GX_Parm24 ;
      n543TBM24_ORDER = false ;
      A544TBM24_DEL_FLG = GX_Parm25 ;
      n544TBM24_DEL_FLG = false ;
      A547TBM24_CRT_PROG_NM = GX_Parm26 ;
      n547TBM24_CRT_PROG_NM = false ;
      A550TBM24_UPD_PROG_NM = GX_Parm27 ;
      n550TBM24_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A545TBM24_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A546TBM24_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A548TBM24_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A549TBM24_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A551TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A702TBM24_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A703TBM24_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A704TBM24_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A705TBM24_CRF_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( A635TBM24_IDENTIFICATION_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A636TBM24_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A637TBM24_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A638TBM24_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A639TBM24_TEXT));
      isValidOutput.add(GXutil.rtrim( A640TBM24_FIXED_VALUE));
      isValidOutput.add(GXutil.rtrim( A641TBM24_CHK_FALSE_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( A706TBM24_REQUIRED_INPUT_FLG));
      isValidOutput.add(GXutil.rtrim( A707TBM24_MIN_VALUE));
      isValidOutput.add(GXutil.rtrim( A708TBM24_MAX_VALUE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A543TBM24_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A544TBM24_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A547TBM24_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A550TBM24_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z64TBM24_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z65TBM24_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z66TBM24_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( Z67TBM24_CRF_ITEM_DIV));
      isValidOutput.add(localUtil.ttoc( Z545TBM24_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z546TBM24_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z548TBM24_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z549TBM24_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z551TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z702TBM24_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z703TBM24_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z704TBM24_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z705TBM24_CRF_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( Z635TBM24_IDENTIFICATION_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z636TBM24_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z637TBM24_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z638TBM24_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z639TBM24_TEXT));
      isValidOutput.add(GXutil.rtrim( Z640TBM24_FIXED_VALUE));
      isValidOutput.add(GXutil.rtrim( Z641TBM24_CHK_FALSE_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( Z706TBM24_REQUIRED_INPUT_FLG));
      isValidOutput.add(GXutil.rtrim( Z707TBM24_MIN_VALUE));
      isValidOutput.add(GXutil.rtrim( Z708TBM24_MAX_VALUE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z543TBM24_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z544TBM24_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z547TBM24_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z550TBM24_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O551TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z65TBM24_DOM_CD = "" ;
      Z66TBM24_DOM_VAR_NM = "" ;
      Z67TBM24_CRF_ITEM_DIV = "" ;
      Z545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z546TBM24_CRT_USER_ID = "" ;
      Z548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z549TBM24_UPD_USER_ID = "" ;
      Z702TBM24_DOM_ITM_GRP_OID = "" ;
      Z705TBM24_CRF_ITEM_NM = "" ;
      Z635TBM24_IDENTIFICATION_CD = "" ;
      Z639TBM24_TEXT = "" ;
      Z640TBM24_FIXED_VALUE = "" ;
      Z641TBM24_CHK_FALSE_INNER_VALUE = "" ;
      Z706TBM24_REQUIRED_INPUT_FLG = "" ;
      Z707TBM24_MIN_VALUE = "" ;
      Z708TBM24_MAX_VALUE = "" ;
      Z544TBM24_DEL_FLG = "" ;
      Z547TBM24_CRT_PROG_NM = "" ;
      Z550TBM24_UPD_PROG_NM = "" ;
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
      lblTextblocktbm24_study_id_Jsonclick = "" ;
      lblTextblocktbm24_dom_cd_Jsonclick = "" ;
      A65TBM24_DOM_CD = "" ;
      lblTextblocktbm24_dom_var_nm_Jsonclick = "" ;
      A66TBM24_DOM_VAR_NM = "" ;
      lblTextblocktbm24_dom_itm_grp_oid_Jsonclick = "" ;
      A702TBM24_DOM_ITM_GRP_OID = "" ;
      lblTextblocktbm24_dom_itm_grp_attr_seq_Jsonclick = "" ;
      lblTextblocktbm24_dom_itm_grp_rowno_Jsonclick = "" ;
      lblTextblocktbm24_crf_item_nm_Jsonclick = "" ;
      A705TBM24_CRF_ITEM_NM = "" ;
      lblTextblocktbm24_crf_item_div_Jsonclick = "" ;
      A67TBM24_CRF_ITEM_DIV = "" ;
      lblTextblocktbm24_identification_cd_Jsonclick = "" ;
      A635TBM24_IDENTIFICATION_CD = "" ;
      lblTextblocktbm24_text_maxlength_Jsonclick = "" ;
      lblTextblocktbm24_text_maxrows_Jsonclick = "" ;
      lblTextblocktbm24_decimal_digits_Jsonclick = "" ;
      lblTextblocktbm24_text_Jsonclick = "" ;
      A639TBM24_TEXT = "" ;
      lblTextblocktbm24_fixed_value_Jsonclick = "" ;
      A640TBM24_FIXED_VALUE = "" ;
      lblTextblocktbm24_chk_false_inner_value_Jsonclick = "" ;
      A641TBM24_CHK_FALSE_INNER_VALUE = "" ;
      lblTextblocktbm24_required_input_flg_Jsonclick = "" ;
      A706TBM24_REQUIRED_INPUT_FLG = "" ;
      lblTextblocktbm24_min_value_Jsonclick = "" ;
      A707TBM24_MIN_VALUE = "" ;
      lblTextblocktbm24_max_value_Jsonclick = "" ;
      A708TBM24_MAX_VALUE = "" ;
      lblTextblocktbm24_order_Jsonclick = "" ;
      lblTextblocktbm24_del_flg_Jsonclick = "" ;
      A544TBM24_DEL_FLG = "" ;
      lblTextblocktbm24_crt_datetime_Jsonclick = "" ;
      A545TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm24_crt_user_id_Jsonclick = "" ;
      A546TBM24_CRT_USER_ID = "" ;
      lblTextblocktbm24_crt_prog_nm_Jsonclick = "" ;
      A547TBM24_CRT_PROG_NM = "" ;
      lblTextblocktbm24_upd_datetime_Jsonclick = "" ;
      A548TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm24_upd_user_id_Jsonclick = "" ;
      A549TBM24_UPD_USER_ID = "" ;
      lblTextblocktbm24_upd_prog_nm_Jsonclick = "" ;
      A550TBM24_UPD_PROG_NM = "" ;
      lblTextblocktbm24_upd_cnt_Jsonclick = "" ;
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
      T000W5_A65TBM24_DOM_CD = new String[] {""} ;
      T000W5_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W5_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W5_A545TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W5_n545TBM24_CRT_DATETIME = new boolean[] {false} ;
      T000W5_A546TBM24_CRT_USER_ID = new String[] {""} ;
      T000W5_n546TBM24_CRT_USER_ID = new boolean[] {false} ;
      T000W5_A548TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W5_n548TBM24_UPD_DATETIME = new boolean[] {false} ;
      T000W5_A549TBM24_UPD_USER_ID = new String[] {""} ;
      T000W5_n549TBM24_UPD_USER_ID = new boolean[] {false} ;
      T000W5_A551TBM24_UPD_CNT = new long[1] ;
      T000W5_n551TBM24_UPD_CNT = new boolean[] {false} ;
      T000W5_A702TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      T000W5_n702TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000W5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000W5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000W5_A704TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000W5_n704TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000W5_A705TBM24_CRF_ITEM_NM = new String[] {""} ;
      T000W5_n705TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      T000W5_A635TBM24_IDENTIFICATION_CD = new String[] {""} ;
      T000W5_n635TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      T000W5_A636TBM24_TEXT_MAXLENGTH = new short[1] ;
      T000W5_n636TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      T000W5_A637TBM24_TEXT_MAXROWS = new byte[1] ;
      T000W5_n637TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      T000W5_A638TBM24_DECIMAL_DIGITS = new byte[1] ;
      T000W5_n638TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      T000W5_A639TBM24_TEXT = new String[] {""} ;
      T000W5_n639TBM24_TEXT = new boolean[] {false} ;
      T000W5_A640TBM24_FIXED_VALUE = new String[] {""} ;
      T000W5_n640TBM24_FIXED_VALUE = new boolean[] {false} ;
      T000W5_A641TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      T000W5_n641TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      T000W5_A706TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000W5_n706TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000W5_A707TBM24_MIN_VALUE = new String[] {""} ;
      T000W5_n707TBM24_MIN_VALUE = new boolean[] {false} ;
      T000W5_A708TBM24_MAX_VALUE = new String[] {""} ;
      T000W5_n708TBM24_MAX_VALUE = new boolean[] {false} ;
      T000W5_A543TBM24_ORDER = new int[1] ;
      T000W5_n543TBM24_ORDER = new boolean[] {false} ;
      T000W5_A544TBM24_DEL_FLG = new String[] {""} ;
      T000W5_n544TBM24_DEL_FLG = new boolean[] {false} ;
      T000W5_A547TBM24_CRT_PROG_NM = new String[] {""} ;
      T000W5_n547TBM24_CRT_PROG_NM = new boolean[] {false} ;
      T000W5_A550TBM24_UPD_PROG_NM = new String[] {""} ;
      T000W5_n550TBM24_UPD_PROG_NM = new boolean[] {false} ;
      T000W5_A64TBM24_STUDY_ID = new long[1] ;
      T000W4_A64TBM24_STUDY_ID = new long[1] ;
      T000W6_A64TBM24_STUDY_ID = new long[1] ;
      T000W6_A65TBM24_DOM_CD = new String[] {""} ;
      T000W6_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W6_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W3_A65TBM24_DOM_CD = new String[] {""} ;
      T000W3_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W3_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W3_A545TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W3_n545TBM24_CRT_DATETIME = new boolean[] {false} ;
      T000W3_A546TBM24_CRT_USER_ID = new String[] {""} ;
      T000W3_n546TBM24_CRT_USER_ID = new boolean[] {false} ;
      T000W3_A548TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W3_n548TBM24_UPD_DATETIME = new boolean[] {false} ;
      T000W3_A549TBM24_UPD_USER_ID = new String[] {""} ;
      T000W3_n549TBM24_UPD_USER_ID = new boolean[] {false} ;
      T000W3_A551TBM24_UPD_CNT = new long[1] ;
      T000W3_n551TBM24_UPD_CNT = new boolean[] {false} ;
      T000W3_A702TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      T000W3_n702TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000W3_A703TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000W3_n703TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000W3_A704TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000W3_n704TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000W3_A705TBM24_CRF_ITEM_NM = new String[] {""} ;
      T000W3_n705TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      T000W3_A635TBM24_IDENTIFICATION_CD = new String[] {""} ;
      T000W3_n635TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      T000W3_A636TBM24_TEXT_MAXLENGTH = new short[1] ;
      T000W3_n636TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      T000W3_A637TBM24_TEXT_MAXROWS = new byte[1] ;
      T000W3_n637TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      T000W3_A638TBM24_DECIMAL_DIGITS = new byte[1] ;
      T000W3_n638TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      T000W3_A639TBM24_TEXT = new String[] {""} ;
      T000W3_n639TBM24_TEXT = new boolean[] {false} ;
      T000W3_A640TBM24_FIXED_VALUE = new String[] {""} ;
      T000W3_n640TBM24_FIXED_VALUE = new boolean[] {false} ;
      T000W3_A641TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      T000W3_n641TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      T000W3_A706TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000W3_n706TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000W3_A707TBM24_MIN_VALUE = new String[] {""} ;
      T000W3_n707TBM24_MIN_VALUE = new boolean[] {false} ;
      T000W3_A708TBM24_MAX_VALUE = new String[] {""} ;
      T000W3_n708TBM24_MAX_VALUE = new boolean[] {false} ;
      T000W3_A543TBM24_ORDER = new int[1] ;
      T000W3_n543TBM24_ORDER = new boolean[] {false} ;
      T000W3_A544TBM24_DEL_FLG = new String[] {""} ;
      T000W3_n544TBM24_DEL_FLG = new boolean[] {false} ;
      T000W3_A547TBM24_CRT_PROG_NM = new String[] {""} ;
      T000W3_n547TBM24_CRT_PROG_NM = new boolean[] {false} ;
      T000W3_A550TBM24_UPD_PROG_NM = new String[] {""} ;
      T000W3_n550TBM24_UPD_PROG_NM = new boolean[] {false} ;
      T000W3_A64TBM24_STUDY_ID = new long[1] ;
      sMode31 = "" ;
      T000W7_A64TBM24_STUDY_ID = new long[1] ;
      T000W7_A65TBM24_DOM_CD = new String[] {""} ;
      T000W7_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W7_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W8_A64TBM24_STUDY_ID = new long[1] ;
      T000W8_A65TBM24_DOM_CD = new String[] {""} ;
      T000W8_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W8_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W2_A65TBM24_DOM_CD = new String[] {""} ;
      T000W2_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W2_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W2_A545TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W2_n545TBM24_CRT_DATETIME = new boolean[] {false} ;
      T000W2_A546TBM24_CRT_USER_ID = new String[] {""} ;
      T000W2_n546TBM24_CRT_USER_ID = new boolean[] {false} ;
      T000W2_A548TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W2_n548TBM24_UPD_DATETIME = new boolean[] {false} ;
      T000W2_A549TBM24_UPD_USER_ID = new String[] {""} ;
      T000W2_n549TBM24_UPD_USER_ID = new boolean[] {false} ;
      T000W2_A551TBM24_UPD_CNT = new long[1] ;
      T000W2_n551TBM24_UPD_CNT = new boolean[] {false} ;
      T000W2_A702TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      T000W2_n702TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000W2_A703TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000W2_n703TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000W2_A704TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000W2_n704TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000W2_A705TBM24_CRF_ITEM_NM = new String[] {""} ;
      T000W2_n705TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      T000W2_A635TBM24_IDENTIFICATION_CD = new String[] {""} ;
      T000W2_n635TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      T000W2_A636TBM24_TEXT_MAXLENGTH = new short[1] ;
      T000W2_n636TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      T000W2_A637TBM24_TEXT_MAXROWS = new byte[1] ;
      T000W2_n637TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      T000W2_A638TBM24_DECIMAL_DIGITS = new byte[1] ;
      T000W2_n638TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      T000W2_A639TBM24_TEXT = new String[] {""} ;
      T000W2_n639TBM24_TEXT = new boolean[] {false} ;
      T000W2_A640TBM24_FIXED_VALUE = new String[] {""} ;
      T000W2_n640TBM24_FIXED_VALUE = new boolean[] {false} ;
      T000W2_A641TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      T000W2_n641TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      T000W2_A706TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000W2_n706TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000W2_A707TBM24_MIN_VALUE = new String[] {""} ;
      T000W2_n707TBM24_MIN_VALUE = new boolean[] {false} ;
      T000W2_A708TBM24_MAX_VALUE = new String[] {""} ;
      T000W2_n708TBM24_MAX_VALUE = new boolean[] {false} ;
      T000W2_A543TBM24_ORDER = new int[1] ;
      T000W2_n543TBM24_ORDER = new boolean[] {false} ;
      T000W2_A544TBM24_DEL_FLG = new String[] {""} ;
      T000W2_n544TBM24_DEL_FLG = new boolean[] {false} ;
      T000W2_A547TBM24_CRT_PROG_NM = new String[] {""} ;
      T000W2_n547TBM24_CRT_PROG_NM = new boolean[] {false} ;
      T000W2_A550TBM24_UPD_PROG_NM = new String[] {""} ;
      T000W2_n550TBM24_UPD_PROG_NM = new boolean[] {false} ;
      T000W2_A64TBM24_STUDY_ID = new long[1] ;
      T000W12_A64TBM24_STUDY_ID = new long[1] ;
      T000W12_A65TBM24_DOM_CD = new String[] {""} ;
      T000W12_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W12_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      T000W13_A64TBM24_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm24_map_item__default(),
         new Object[] {
             new Object[] {
            T000W2_A65TBM24_DOM_CD, T000W2_A66TBM24_DOM_VAR_NM, T000W2_A67TBM24_CRF_ITEM_DIV, T000W2_A545TBM24_CRT_DATETIME, T000W2_n545TBM24_CRT_DATETIME, T000W2_A546TBM24_CRT_USER_ID, T000W2_n546TBM24_CRT_USER_ID, T000W2_A548TBM24_UPD_DATETIME, T000W2_n548TBM24_UPD_DATETIME, T000W2_A549TBM24_UPD_USER_ID,
            T000W2_n549TBM24_UPD_USER_ID, T000W2_A551TBM24_UPD_CNT, T000W2_n551TBM24_UPD_CNT, T000W2_A702TBM24_DOM_ITM_GRP_OID, T000W2_n702TBM24_DOM_ITM_GRP_OID, T000W2_A703TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W2_n703TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W2_A704TBM24_DOM_ITM_GRP_ROWNO, T000W2_n704TBM24_DOM_ITM_GRP_ROWNO, T000W2_A705TBM24_CRF_ITEM_NM,
            T000W2_n705TBM24_CRF_ITEM_NM, T000W2_A635TBM24_IDENTIFICATION_CD, T000W2_n635TBM24_IDENTIFICATION_CD, T000W2_A636TBM24_TEXT_MAXLENGTH, T000W2_n636TBM24_TEXT_MAXLENGTH, T000W2_A637TBM24_TEXT_MAXROWS, T000W2_n637TBM24_TEXT_MAXROWS, T000W2_A638TBM24_DECIMAL_DIGITS, T000W2_n638TBM24_DECIMAL_DIGITS, T000W2_A639TBM24_TEXT,
            T000W2_n639TBM24_TEXT, T000W2_A640TBM24_FIXED_VALUE, T000W2_n640TBM24_FIXED_VALUE, T000W2_A641TBM24_CHK_FALSE_INNER_VALUE, T000W2_n641TBM24_CHK_FALSE_INNER_VALUE, T000W2_A706TBM24_REQUIRED_INPUT_FLG, T000W2_n706TBM24_REQUIRED_INPUT_FLG, T000W2_A707TBM24_MIN_VALUE, T000W2_n707TBM24_MIN_VALUE, T000W2_A708TBM24_MAX_VALUE,
            T000W2_n708TBM24_MAX_VALUE, T000W2_A543TBM24_ORDER, T000W2_n543TBM24_ORDER, T000W2_A544TBM24_DEL_FLG, T000W2_n544TBM24_DEL_FLG, T000W2_A547TBM24_CRT_PROG_NM, T000W2_n547TBM24_CRT_PROG_NM, T000W2_A550TBM24_UPD_PROG_NM, T000W2_n550TBM24_UPD_PROG_NM, T000W2_A64TBM24_STUDY_ID
            }
            , new Object[] {
            T000W3_A65TBM24_DOM_CD, T000W3_A66TBM24_DOM_VAR_NM, T000W3_A67TBM24_CRF_ITEM_DIV, T000W3_A545TBM24_CRT_DATETIME, T000W3_n545TBM24_CRT_DATETIME, T000W3_A546TBM24_CRT_USER_ID, T000W3_n546TBM24_CRT_USER_ID, T000W3_A548TBM24_UPD_DATETIME, T000W3_n548TBM24_UPD_DATETIME, T000W3_A549TBM24_UPD_USER_ID,
            T000W3_n549TBM24_UPD_USER_ID, T000W3_A551TBM24_UPD_CNT, T000W3_n551TBM24_UPD_CNT, T000W3_A702TBM24_DOM_ITM_GRP_OID, T000W3_n702TBM24_DOM_ITM_GRP_OID, T000W3_A703TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W3_n703TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W3_A704TBM24_DOM_ITM_GRP_ROWNO, T000W3_n704TBM24_DOM_ITM_GRP_ROWNO, T000W3_A705TBM24_CRF_ITEM_NM,
            T000W3_n705TBM24_CRF_ITEM_NM, T000W3_A635TBM24_IDENTIFICATION_CD, T000W3_n635TBM24_IDENTIFICATION_CD, T000W3_A636TBM24_TEXT_MAXLENGTH, T000W3_n636TBM24_TEXT_MAXLENGTH, T000W3_A637TBM24_TEXT_MAXROWS, T000W3_n637TBM24_TEXT_MAXROWS, T000W3_A638TBM24_DECIMAL_DIGITS, T000W3_n638TBM24_DECIMAL_DIGITS, T000W3_A639TBM24_TEXT,
            T000W3_n639TBM24_TEXT, T000W3_A640TBM24_FIXED_VALUE, T000W3_n640TBM24_FIXED_VALUE, T000W3_A641TBM24_CHK_FALSE_INNER_VALUE, T000W3_n641TBM24_CHK_FALSE_INNER_VALUE, T000W3_A706TBM24_REQUIRED_INPUT_FLG, T000W3_n706TBM24_REQUIRED_INPUT_FLG, T000W3_A707TBM24_MIN_VALUE, T000W3_n707TBM24_MIN_VALUE, T000W3_A708TBM24_MAX_VALUE,
            T000W3_n708TBM24_MAX_VALUE, T000W3_A543TBM24_ORDER, T000W3_n543TBM24_ORDER, T000W3_A544TBM24_DEL_FLG, T000W3_n544TBM24_DEL_FLG, T000W3_A547TBM24_CRT_PROG_NM, T000W3_n547TBM24_CRT_PROG_NM, T000W3_A550TBM24_UPD_PROG_NM, T000W3_n550TBM24_UPD_PROG_NM, T000W3_A64TBM24_STUDY_ID
            }
            , new Object[] {
            T000W4_A64TBM24_STUDY_ID
            }
            , new Object[] {
            T000W5_A65TBM24_DOM_CD, T000W5_A66TBM24_DOM_VAR_NM, T000W5_A67TBM24_CRF_ITEM_DIV, T000W5_A545TBM24_CRT_DATETIME, T000W5_n545TBM24_CRT_DATETIME, T000W5_A546TBM24_CRT_USER_ID, T000W5_n546TBM24_CRT_USER_ID, T000W5_A548TBM24_UPD_DATETIME, T000W5_n548TBM24_UPD_DATETIME, T000W5_A549TBM24_UPD_USER_ID,
            T000W5_n549TBM24_UPD_USER_ID, T000W5_A551TBM24_UPD_CNT, T000W5_n551TBM24_UPD_CNT, T000W5_A702TBM24_DOM_ITM_GRP_OID, T000W5_n702TBM24_DOM_ITM_GRP_OID, T000W5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W5_A704TBM24_DOM_ITM_GRP_ROWNO, T000W5_n704TBM24_DOM_ITM_GRP_ROWNO, T000W5_A705TBM24_CRF_ITEM_NM,
            T000W5_n705TBM24_CRF_ITEM_NM, T000W5_A635TBM24_IDENTIFICATION_CD, T000W5_n635TBM24_IDENTIFICATION_CD, T000W5_A636TBM24_TEXT_MAXLENGTH, T000W5_n636TBM24_TEXT_MAXLENGTH, T000W5_A637TBM24_TEXT_MAXROWS, T000W5_n637TBM24_TEXT_MAXROWS, T000W5_A638TBM24_DECIMAL_DIGITS, T000W5_n638TBM24_DECIMAL_DIGITS, T000W5_A639TBM24_TEXT,
            T000W5_n639TBM24_TEXT, T000W5_A640TBM24_FIXED_VALUE, T000W5_n640TBM24_FIXED_VALUE, T000W5_A641TBM24_CHK_FALSE_INNER_VALUE, T000W5_n641TBM24_CHK_FALSE_INNER_VALUE, T000W5_A706TBM24_REQUIRED_INPUT_FLG, T000W5_n706TBM24_REQUIRED_INPUT_FLG, T000W5_A707TBM24_MIN_VALUE, T000W5_n707TBM24_MIN_VALUE, T000W5_A708TBM24_MAX_VALUE,
            T000W5_n708TBM24_MAX_VALUE, T000W5_A543TBM24_ORDER, T000W5_n543TBM24_ORDER, T000W5_A544TBM24_DEL_FLG, T000W5_n544TBM24_DEL_FLG, T000W5_A547TBM24_CRT_PROG_NM, T000W5_n547TBM24_CRT_PROG_NM, T000W5_A550TBM24_UPD_PROG_NM, T000W5_n550TBM24_UPD_PROG_NM, T000W5_A64TBM24_STUDY_ID
            }
            , new Object[] {
            T000W6_A64TBM24_STUDY_ID, T000W6_A65TBM24_DOM_CD, T000W6_A66TBM24_DOM_VAR_NM, T000W6_A67TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            T000W7_A64TBM24_STUDY_ID, T000W7_A65TBM24_DOM_CD, T000W7_A66TBM24_DOM_VAR_NM, T000W7_A67TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            T000W8_A64TBM24_STUDY_ID, T000W8_A65TBM24_DOM_CD, T000W8_A66TBM24_DOM_VAR_NM, T000W8_A67TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000W12_A64TBM24_STUDY_ID, T000W12_A65TBM24_DOM_CD, T000W12_A66TBM24_DOM_VAR_NM, T000W12_A67TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            T000W13_A64TBM24_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM24_MAP_ITEM" ;
   }

   private byte Z637TBM24_TEXT_MAXROWS ;
   private byte Z638TBM24_DECIMAL_DIGITS ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A637TBM24_TEXT_MAXROWS ;
   private byte A638TBM24_DECIMAL_DIGITS ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short Z704TBM24_DOM_ITM_GRP_ROWNO ;
   private short Z636TBM24_TEXT_MAXLENGTH ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short A704TBM24_DOM_ITM_GRP_ROWNO ;
   private short A636TBM24_TEXT_MAXLENGTH ;
   private short RcdFound31 ;
   private short Gx_err ;
   private int Z543TBM24_ORDER ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM24_STUDY_ID_Enabled ;
   private int edtTBM24_DOM_CD_Enabled ;
   private int edtTBM24_DOM_VAR_NM_Enabled ;
   private int edtTBM24_DOM_ITM_GRP_OID_Enabled ;
   private int edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Enabled ;
   private int edtTBM24_DOM_ITM_GRP_ROWNO_Enabled ;
   private int edtTBM24_CRF_ITEM_NM_Enabled ;
   private int edtTBM24_CRF_ITEM_DIV_Enabled ;
   private int edtTBM24_IDENTIFICATION_CD_Enabled ;
   private int edtTBM24_TEXT_MAXLENGTH_Enabled ;
   private int edtTBM24_TEXT_MAXROWS_Enabled ;
   private int edtTBM24_DECIMAL_DIGITS_Enabled ;
   private int edtTBM24_TEXT_Enabled ;
   private int edtTBM24_FIXED_VALUE_Enabled ;
   private int edtTBM24_CHK_FALSE_INNER_VALUE_Enabled ;
   private int edtTBM24_REQUIRED_INPUT_FLG_Enabled ;
   private int edtTBM24_MIN_VALUE_Enabled ;
   private int edtTBM24_MAX_VALUE_Enabled ;
   private int A543TBM24_ORDER ;
   private int edtTBM24_ORDER_Enabled ;
   private int edtTBM24_DEL_FLG_Enabled ;
   private int edtTBM24_CRT_DATETIME_Enabled ;
   private int edtTBM24_CRT_USER_ID_Enabled ;
   private int edtTBM24_CRT_PROG_NM_Enabled ;
   private int edtTBM24_UPD_DATETIME_Enabled ;
   private int edtTBM24_UPD_USER_ID_Enabled ;
   private int edtTBM24_UPD_PROG_NM_Enabled ;
   private int edtTBM24_UPD_CNT_Enabled ;
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
   private long Z64TBM24_STUDY_ID ;
   private long Z551TBM24_UPD_CNT ;
   private long O551TBM24_UPD_CNT ;
   private long A64TBM24_STUDY_ID ;
   private long A551TBM24_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM24_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm24_study_id_Internalname ;
   private String lblTextblocktbm24_study_id_Jsonclick ;
   private String edtTBM24_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm24_dom_cd_Internalname ;
   private String lblTextblocktbm24_dom_cd_Jsonclick ;
   private String edtTBM24_DOM_CD_Internalname ;
   private String edtTBM24_DOM_CD_Jsonclick ;
   private String lblTextblocktbm24_dom_var_nm_Internalname ;
   private String lblTextblocktbm24_dom_var_nm_Jsonclick ;
   private String edtTBM24_DOM_VAR_NM_Internalname ;
   private String edtTBM24_DOM_VAR_NM_Jsonclick ;
   private String lblTextblocktbm24_dom_itm_grp_oid_Internalname ;
   private String lblTextblocktbm24_dom_itm_grp_oid_Jsonclick ;
   private String edtTBM24_DOM_ITM_GRP_OID_Internalname ;
   private String edtTBM24_DOM_ITM_GRP_OID_Jsonclick ;
   private String lblTextblocktbm24_dom_itm_grp_attr_seq_Internalname ;
   private String lblTextblocktbm24_dom_itm_grp_attr_seq_Jsonclick ;
   private String edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname ;
   private String edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Jsonclick ;
   private String lblTextblocktbm24_dom_itm_grp_rowno_Internalname ;
   private String lblTextblocktbm24_dom_itm_grp_rowno_Jsonclick ;
   private String edtTBM24_DOM_ITM_GRP_ROWNO_Internalname ;
   private String edtTBM24_DOM_ITM_GRP_ROWNO_Jsonclick ;
   private String lblTextblocktbm24_crf_item_nm_Internalname ;
   private String lblTextblocktbm24_crf_item_nm_Jsonclick ;
   private String edtTBM24_CRF_ITEM_NM_Internalname ;
   private String lblTextblocktbm24_crf_item_div_Internalname ;
   private String lblTextblocktbm24_crf_item_div_Jsonclick ;
   private String edtTBM24_CRF_ITEM_DIV_Internalname ;
   private String edtTBM24_CRF_ITEM_DIV_Jsonclick ;
   private String lblTextblocktbm24_identification_cd_Internalname ;
   private String lblTextblocktbm24_identification_cd_Jsonclick ;
   private String edtTBM24_IDENTIFICATION_CD_Internalname ;
   private String edtTBM24_IDENTIFICATION_CD_Jsonclick ;
   private String lblTextblocktbm24_text_maxlength_Internalname ;
   private String lblTextblocktbm24_text_maxlength_Jsonclick ;
   private String edtTBM24_TEXT_MAXLENGTH_Internalname ;
   private String edtTBM24_TEXT_MAXLENGTH_Jsonclick ;
   private String lblTextblocktbm24_text_maxrows_Internalname ;
   private String lblTextblocktbm24_text_maxrows_Jsonclick ;
   private String edtTBM24_TEXT_MAXROWS_Internalname ;
   private String edtTBM24_TEXT_MAXROWS_Jsonclick ;
   private String lblTextblocktbm24_decimal_digits_Internalname ;
   private String lblTextblocktbm24_decimal_digits_Jsonclick ;
   private String edtTBM24_DECIMAL_DIGITS_Internalname ;
   private String edtTBM24_DECIMAL_DIGITS_Jsonclick ;
   private String lblTextblocktbm24_text_Internalname ;
   private String lblTextblocktbm24_text_Jsonclick ;
   private String edtTBM24_TEXT_Internalname ;
   private String lblTextblocktbm24_fixed_value_Internalname ;
   private String lblTextblocktbm24_fixed_value_Jsonclick ;
   private String edtTBM24_FIXED_VALUE_Internalname ;
   private String edtTBM24_FIXED_VALUE_Jsonclick ;
   private String lblTextblocktbm24_chk_false_inner_value_Internalname ;
   private String lblTextblocktbm24_chk_false_inner_value_Jsonclick ;
   private String edtTBM24_CHK_FALSE_INNER_VALUE_Internalname ;
   private String edtTBM24_CHK_FALSE_INNER_VALUE_Jsonclick ;
   private String lblTextblocktbm24_required_input_flg_Internalname ;
   private String lblTextblocktbm24_required_input_flg_Jsonclick ;
   private String edtTBM24_REQUIRED_INPUT_FLG_Internalname ;
   private String edtTBM24_REQUIRED_INPUT_FLG_Jsonclick ;
   private String lblTextblocktbm24_min_value_Internalname ;
   private String lblTextblocktbm24_min_value_Jsonclick ;
   private String edtTBM24_MIN_VALUE_Internalname ;
   private String edtTBM24_MIN_VALUE_Jsonclick ;
   private String lblTextblocktbm24_max_value_Internalname ;
   private String lblTextblocktbm24_max_value_Jsonclick ;
   private String edtTBM24_MAX_VALUE_Internalname ;
   private String edtTBM24_MAX_VALUE_Jsonclick ;
   private String lblTextblocktbm24_order_Internalname ;
   private String lblTextblocktbm24_order_Jsonclick ;
   private String edtTBM24_ORDER_Internalname ;
   private String edtTBM24_ORDER_Jsonclick ;
   private String lblTextblocktbm24_del_flg_Internalname ;
   private String lblTextblocktbm24_del_flg_Jsonclick ;
   private String edtTBM24_DEL_FLG_Internalname ;
   private String edtTBM24_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm24_crt_datetime_Internalname ;
   private String lblTextblocktbm24_crt_datetime_Jsonclick ;
   private String edtTBM24_CRT_DATETIME_Internalname ;
   private String edtTBM24_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm24_crt_user_id_Internalname ;
   private String lblTextblocktbm24_crt_user_id_Jsonclick ;
   private String edtTBM24_CRT_USER_ID_Internalname ;
   private String edtTBM24_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm24_crt_prog_nm_Internalname ;
   private String lblTextblocktbm24_crt_prog_nm_Jsonclick ;
   private String edtTBM24_CRT_PROG_NM_Internalname ;
   private String edtTBM24_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm24_upd_datetime_Internalname ;
   private String lblTextblocktbm24_upd_datetime_Jsonclick ;
   private String edtTBM24_UPD_DATETIME_Internalname ;
   private String edtTBM24_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm24_upd_user_id_Internalname ;
   private String lblTextblocktbm24_upd_user_id_Jsonclick ;
   private String edtTBM24_UPD_USER_ID_Internalname ;
   private String edtTBM24_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm24_upd_prog_nm_Internalname ;
   private String lblTextblocktbm24_upd_prog_nm_Jsonclick ;
   private String edtTBM24_UPD_PROG_NM_Internalname ;
   private String edtTBM24_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm24_upd_cnt_Internalname ;
   private String lblTextblocktbm24_upd_cnt_Jsonclick ;
   private String edtTBM24_UPD_CNT_Internalname ;
   private String edtTBM24_UPD_CNT_Jsonclick ;
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
   private String sMode31 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z545TBM24_CRT_DATETIME ;
   private java.util.Date Z548TBM24_UPD_DATETIME ;
   private java.util.Date A545TBM24_CRT_DATETIME ;
   private java.util.Date A548TBM24_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n702TBM24_DOM_ITM_GRP_OID ;
   private boolean n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean n705TBM24_CRF_ITEM_NM ;
   private boolean n635TBM24_IDENTIFICATION_CD ;
   private boolean n636TBM24_TEXT_MAXLENGTH ;
   private boolean n637TBM24_TEXT_MAXROWS ;
   private boolean n638TBM24_DECIMAL_DIGITS ;
   private boolean n639TBM24_TEXT ;
   private boolean n640TBM24_FIXED_VALUE ;
   private boolean n641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean n706TBM24_REQUIRED_INPUT_FLG ;
   private boolean n707TBM24_MIN_VALUE ;
   private boolean n708TBM24_MAX_VALUE ;
   private boolean n543TBM24_ORDER ;
   private boolean n544TBM24_DEL_FLG ;
   private boolean n545TBM24_CRT_DATETIME ;
   private boolean n546TBM24_CRT_USER_ID ;
   private boolean n547TBM24_CRT_PROG_NM ;
   private boolean n548TBM24_UPD_DATETIME ;
   private boolean n549TBM24_UPD_USER_ID ;
   private boolean n550TBM24_UPD_PROG_NM ;
   private boolean n551TBM24_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z65TBM24_DOM_CD ;
   private String Z66TBM24_DOM_VAR_NM ;
   private String Z67TBM24_CRF_ITEM_DIV ;
   private String Z546TBM24_CRT_USER_ID ;
   private String Z549TBM24_UPD_USER_ID ;
   private String Z702TBM24_DOM_ITM_GRP_OID ;
   private String Z705TBM24_CRF_ITEM_NM ;
   private String Z635TBM24_IDENTIFICATION_CD ;
   private String Z639TBM24_TEXT ;
   private String Z640TBM24_FIXED_VALUE ;
   private String Z641TBM24_CHK_FALSE_INNER_VALUE ;
   private String Z706TBM24_REQUIRED_INPUT_FLG ;
   private String Z707TBM24_MIN_VALUE ;
   private String Z708TBM24_MAX_VALUE ;
   private String Z544TBM24_DEL_FLG ;
   private String Z547TBM24_CRT_PROG_NM ;
   private String Z550TBM24_UPD_PROG_NM ;
   private String A65TBM24_DOM_CD ;
   private String A66TBM24_DOM_VAR_NM ;
   private String A702TBM24_DOM_ITM_GRP_OID ;
   private String A705TBM24_CRF_ITEM_NM ;
   private String A67TBM24_CRF_ITEM_DIV ;
   private String A635TBM24_IDENTIFICATION_CD ;
   private String A639TBM24_TEXT ;
   private String A640TBM24_FIXED_VALUE ;
   private String A641TBM24_CHK_FALSE_INNER_VALUE ;
   private String A706TBM24_REQUIRED_INPUT_FLG ;
   private String A707TBM24_MIN_VALUE ;
   private String A708TBM24_MAX_VALUE ;
   private String A544TBM24_DEL_FLG ;
   private String A546TBM24_CRT_USER_ID ;
   private String A547TBM24_CRT_PROG_NM ;
   private String A549TBM24_UPD_USER_ID ;
   private String A550TBM24_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000W5_A65TBM24_DOM_CD ;
   private String[] T000W5_A66TBM24_DOM_VAR_NM ;
   private String[] T000W5_A67TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] T000W5_A545TBM24_CRT_DATETIME ;
   private boolean[] T000W5_n545TBM24_CRT_DATETIME ;
   private String[] T000W5_A546TBM24_CRT_USER_ID ;
   private boolean[] T000W5_n546TBM24_CRT_USER_ID ;
   private java.util.Date[] T000W5_A548TBM24_UPD_DATETIME ;
   private boolean[] T000W5_n548TBM24_UPD_DATETIME ;
   private String[] T000W5_A549TBM24_UPD_USER_ID ;
   private boolean[] T000W5_n549TBM24_UPD_USER_ID ;
   private long[] T000W5_A551TBM24_UPD_CNT ;
   private boolean[] T000W5_n551TBM24_UPD_CNT ;
   private String[] T000W5_A702TBM24_DOM_ITM_GRP_OID ;
   private boolean[] T000W5_n702TBM24_DOM_ITM_GRP_OID ;
   private short[] T000W5_A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000W5_n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000W5_A704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000W5_n704TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] T000W5_A705TBM24_CRF_ITEM_NM ;
   private boolean[] T000W5_n705TBM24_CRF_ITEM_NM ;
   private String[] T000W5_A635TBM24_IDENTIFICATION_CD ;
   private boolean[] T000W5_n635TBM24_IDENTIFICATION_CD ;
   private short[] T000W5_A636TBM24_TEXT_MAXLENGTH ;
   private boolean[] T000W5_n636TBM24_TEXT_MAXLENGTH ;
   private byte[] T000W5_A637TBM24_TEXT_MAXROWS ;
   private boolean[] T000W5_n637TBM24_TEXT_MAXROWS ;
   private byte[] T000W5_A638TBM24_DECIMAL_DIGITS ;
   private boolean[] T000W5_n638TBM24_DECIMAL_DIGITS ;
   private String[] T000W5_A639TBM24_TEXT ;
   private boolean[] T000W5_n639TBM24_TEXT ;
   private String[] T000W5_A640TBM24_FIXED_VALUE ;
   private boolean[] T000W5_n640TBM24_FIXED_VALUE ;
   private String[] T000W5_A641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] T000W5_n641TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] T000W5_A706TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] T000W5_n706TBM24_REQUIRED_INPUT_FLG ;
   private String[] T000W5_A707TBM24_MIN_VALUE ;
   private boolean[] T000W5_n707TBM24_MIN_VALUE ;
   private String[] T000W5_A708TBM24_MAX_VALUE ;
   private boolean[] T000W5_n708TBM24_MAX_VALUE ;
   private int[] T000W5_A543TBM24_ORDER ;
   private boolean[] T000W5_n543TBM24_ORDER ;
   private String[] T000W5_A544TBM24_DEL_FLG ;
   private boolean[] T000W5_n544TBM24_DEL_FLG ;
   private String[] T000W5_A547TBM24_CRT_PROG_NM ;
   private boolean[] T000W5_n547TBM24_CRT_PROG_NM ;
   private String[] T000W5_A550TBM24_UPD_PROG_NM ;
   private boolean[] T000W5_n550TBM24_UPD_PROG_NM ;
   private long[] T000W5_A64TBM24_STUDY_ID ;
   private long[] T000W4_A64TBM24_STUDY_ID ;
   private long[] T000W6_A64TBM24_STUDY_ID ;
   private String[] T000W6_A65TBM24_DOM_CD ;
   private String[] T000W6_A66TBM24_DOM_VAR_NM ;
   private String[] T000W6_A67TBM24_CRF_ITEM_DIV ;
   private String[] T000W3_A65TBM24_DOM_CD ;
   private String[] T000W3_A66TBM24_DOM_VAR_NM ;
   private String[] T000W3_A67TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] T000W3_A545TBM24_CRT_DATETIME ;
   private boolean[] T000W3_n545TBM24_CRT_DATETIME ;
   private String[] T000W3_A546TBM24_CRT_USER_ID ;
   private boolean[] T000W3_n546TBM24_CRT_USER_ID ;
   private java.util.Date[] T000W3_A548TBM24_UPD_DATETIME ;
   private boolean[] T000W3_n548TBM24_UPD_DATETIME ;
   private String[] T000W3_A549TBM24_UPD_USER_ID ;
   private boolean[] T000W3_n549TBM24_UPD_USER_ID ;
   private long[] T000W3_A551TBM24_UPD_CNT ;
   private boolean[] T000W3_n551TBM24_UPD_CNT ;
   private String[] T000W3_A702TBM24_DOM_ITM_GRP_OID ;
   private boolean[] T000W3_n702TBM24_DOM_ITM_GRP_OID ;
   private short[] T000W3_A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000W3_n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000W3_A704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000W3_n704TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] T000W3_A705TBM24_CRF_ITEM_NM ;
   private boolean[] T000W3_n705TBM24_CRF_ITEM_NM ;
   private String[] T000W3_A635TBM24_IDENTIFICATION_CD ;
   private boolean[] T000W3_n635TBM24_IDENTIFICATION_CD ;
   private short[] T000W3_A636TBM24_TEXT_MAXLENGTH ;
   private boolean[] T000W3_n636TBM24_TEXT_MAXLENGTH ;
   private byte[] T000W3_A637TBM24_TEXT_MAXROWS ;
   private boolean[] T000W3_n637TBM24_TEXT_MAXROWS ;
   private byte[] T000W3_A638TBM24_DECIMAL_DIGITS ;
   private boolean[] T000W3_n638TBM24_DECIMAL_DIGITS ;
   private String[] T000W3_A639TBM24_TEXT ;
   private boolean[] T000W3_n639TBM24_TEXT ;
   private String[] T000W3_A640TBM24_FIXED_VALUE ;
   private boolean[] T000W3_n640TBM24_FIXED_VALUE ;
   private String[] T000W3_A641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] T000W3_n641TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] T000W3_A706TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] T000W3_n706TBM24_REQUIRED_INPUT_FLG ;
   private String[] T000W3_A707TBM24_MIN_VALUE ;
   private boolean[] T000W3_n707TBM24_MIN_VALUE ;
   private String[] T000W3_A708TBM24_MAX_VALUE ;
   private boolean[] T000W3_n708TBM24_MAX_VALUE ;
   private int[] T000W3_A543TBM24_ORDER ;
   private boolean[] T000W3_n543TBM24_ORDER ;
   private String[] T000W3_A544TBM24_DEL_FLG ;
   private boolean[] T000W3_n544TBM24_DEL_FLG ;
   private String[] T000W3_A547TBM24_CRT_PROG_NM ;
   private boolean[] T000W3_n547TBM24_CRT_PROG_NM ;
   private String[] T000W3_A550TBM24_UPD_PROG_NM ;
   private boolean[] T000W3_n550TBM24_UPD_PROG_NM ;
   private long[] T000W3_A64TBM24_STUDY_ID ;
   private long[] T000W7_A64TBM24_STUDY_ID ;
   private String[] T000W7_A65TBM24_DOM_CD ;
   private String[] T000W7_A66TBM24_DOM_VAR_NM ;
   private String[] T000W7_A67TBM24_CRF_ITEM_DIV ;
   private long[] T000W8_A64TBM24_STUDY_ID ;
   private String[] T000W8_A65TBM24_DOM_CD ;
   private String[] T000W8_A66TBM24_DOM_VAR_NM ;
   private String[] T000W8_A67TBM24_CRF_ITEM_DIV ;
   private String[] T000W2_A65TBM24_DOM_CD ;
   private String[] T000W2_A66TBM24_DOM_VAR_NM ;
   private String[] T000W2_A67TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] T000W2_A545TBM24_CRT_DATETIME ;
   private boolean[] T000W2_n545TBM24_CRT_DATETIME ;
   private String[] T000W2_A546TBM24_CRT_USER_ID ;
   private boolean[] T000W2_n546TBM24_CRT_USER_ID ;
   private java.util.Date[] T000W2_A548TBM24_UPD_DATETIME ;
   private boolean[] T000W2_n548TBM24_UPD_DATETIME ;
   private String[] T000W2_A549TBM24_UPD_USER_ID ;
   private boolean[] T000W2_n549TBM24_UPD_USER_ID ;
   private long[] T000W2_A551TBM24_UPD_CNT ;
   private boolean[] T000W2_n551TBM24_UPD_CNT ;
   private String[] T000W2_A702TBM24_DOM_ITM_GRP_OID ;
   private boolean[] T000W2_n702TBM24_DOM_ITM_GRP_OID ;
   private short[] T000W2_A703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000W2_n703TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000W2_A704TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000W2_n704TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] T000W2_A705TBM24_CRF_ITEM_NM ;
   private boolean[] T000W2_n705TBM24_CRF_ITEM_NM ;
   private String[] T000W2_A635TBM24_IDENTIFICATION_CD ;
   private boolean[] T000W2_n635TBM24_IDENTIFICATION_CD ;
   private short[] T000W2_A636TBM24_TEXT_MAXLENGTH ;
   private boolean[] T000W2_n636TBM24_TEXT_MAXLENGTH ;
   private byte[] T000W2_A637TBM24_TEXT_MAXROWS ;
   private boolean[] T000W2_n637TBM24_TEXT_MAXROWS ;
   private byte[] T000W2_A638TBM24_DECIMAL_DIGITS ;
   private boolean[] T000W2_n638TBM24_DECIMAL_DIGITS ;
   private String[] T000W2_A639TBM24_TEXT ;
   private boolean[] T000W2_n639TBM24_TEXT ;
   private String[] T000W2_A640TBM24_FIXED_VALUE ;
   private boolean[] T000W2_n640TBM24_FIXED_VALUE ;
   private String[] T000W2_A641TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] T000W2_n641TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] T000W2_A706TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] T000W2_n706TBM24_REQUIRED_INPUT_FLG ;
   private String[] T000W2_A707TBM24_MIN_VALUE ;
   private boolean[] T000W2_n707TBM24_MIN_VALUE ;
   private String[] T000W2_A708TBM24_MAX_VALUE ;
   private boolean[] T000W2_n708TBM24_MAX_VALUE ;
   private int[] T000W2_A543TBM24_ORDER ;
   private boolean[] T000W2_n543TBM24_ORDER ;
   private String[] T000W2_A544TBM24_DEL_FLG ;
   private boolean[] T000W2_n544TBM24_DEL_FLG ;
   private String[] T000W2_A547TBM24_CRT_PROG_NM ;
   private boolean[] T000W2_n547TBM24_CRT_PROG_NM ;
   private String[] T000W2_A550TBM24_UPD_PROG_NM ;
   private boolean[] T000W2_n550TBM24_UPD_PROG_NM ;
   private long[] T000W2_A64TBM24_STUDY_ID ;
   private long[] T000W12_A64TBM24_STUDY_ID ;
   private String[] T000W12_A65TBM24_DOM_CD ;
   private String[] T000W12_A66TBM24_DOM_VAR_NM ;
   private String[] T000W12_A67TBM24_CRF_ITEM_DIV ;
   private long[] T000W13_A64TBM24_STUDY_ID ;
}

final  class tbm24_map_item__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000W2", "SELECT `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W3", "SELECT `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W4", "SELECT `TBM21_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W5", "SELECT TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV`, TM1.`TBM24_CRT_DATETIME`, TM1.`TBM24_CRT_USER_ID`, TM1.`TBM24_UPD_DATETIME`, TM1.`TBM24_UPD_USER_ID`, TM1.`TBM24_UPD_CNT`, TM1.`TBM24_DOM_ITM_GRP_OID`, TM1.`TBM24_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM24_DOM_ITM_GRP_ROWNO`, TM1.`TBM24_CRF_ITEM_NM`, TM1.`TBM24_IDENTIFICATION_CD`, TM1.`TBM24_TEXT_MAXLENGTH`, TM1.`TBM24_TEXT_MAXROWS`, TM1.`TBM24_DECIMAL_DIGITS`, TM1.`TBM24_TEXT`, TM1.`TBM24_FIXED_VALUE`, TM1.`TBM24_CHK_FALSE_INNER_VALUE`, TM1.`TBM24_REQUIRED_INPUT_FLG`, TM1.`TBM24_MIN_VALUE`, TM1.`TBM24_MAX_VALUE`, TM1.`TBM24_ORDER`, TM1.`TBM24_DEL_FLG`, TM1.`TBM24_CRT_PROG_NM`, TM1.`TBM24_UPD_PROG_NM`, TM1.`TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` TM1 WHERE TM1.`TBM24_STUDY_ID` = ? and TM1.`TBM24_DOM_CD` = ? and TM1.`TBM24_DOM_VAR_NM` = ? and TM1.`TBM24_CRF_ITEM_DIV` = ? ORDER BY TM1.`TBM24_STUDY_ID`, TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000W6", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W7", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE ( `TBM24_STUDY_ID` > ? or `TBM24_STUDY_ID` = ? and `TBM24_DOM_CD` > ? or `TBM24_DOM_CD` = ? and `TBM24_STUDY_ID` = ? and `TBM24_DOM_VAR_NM` > ? or `TBM24_DOM_VAR_NM` = ? and `TBM24_DOM_CD` = ? and `TBM24_STUDY_ID` = ? and `TBM24_CRF_ITEM_DIV` > ?) ORDER BY `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000W8", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE ( `TBM24_STUDY_ID` < ? or `TBM24_STUDY_ID` = ? and `TBM24_DOM_CD` < ? or `TBM24_DOM_CD` = ? and `TBM24_STUDY_ID` = ? and `TBM24_DOM_VAR_NM` < ? or `TBM24_DOM_VAR_NM` = ? and `TBM24_DOM_CD` = ? and `TBM24_STUDY_ID` = ? and `TBM24_CRF_ITEM_DIV` < ?) ORDER BY `TBM24_STUDY_ID` DESC, `TBM24_DOM_CD` DESC, `TBM24_DOM_VAR_NM` DESC, `TBM24_CRF_ITEM_DIV` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000W9", "INSERT INTO `TBM24_MAP_ITEM`(`TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000W10", "UPDATE `TBM24_MAP_ITEM` SET `TBM24_CRT_DATETIME`=?, `TBM24_CRT_USER_ID`=?, `TBM24_UPD_DATETIME`=?, `TBM24_UPD_USER_ID`=?, `TBM24_UPD_CNT`=?, `TBM24_DOM_ITM_GRP_OID`=?, `TBM24_DOM_ITM_GRP_ATTR_SEQ`=?, `TBM24_DOM_ITM_GRP_ROWNO`=?, `TBM24_CRF_ITEM_NM`=?, `TBM24_IDENTIFICATION_CD`=?, `TBM24_TEXT_MAXLENGTH`=?, `TBM24_TEXT_MAXROWS`=?, `TBM24_DECIMAL_DIGITS`=?, `TBM24_TEXT`=?, `TBM24_FIXED_VALUE`=?, `TBM24_CHK_FALSE_INNER_VALUE`=?, `TBM24_REQUIRED_INPUT_FLG`=?, `TBM24_MIN_VALUE`=?, `TBM24_MAX_VALUE`=?, `TBM24_ORDER`=?, `TBM24_DEL_FLG`=?, `TBM24_CRT_PROG_NM`=?, `TBM24_UPD_PROG_NM`=?  WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?", GX_NOMASK)
         ,new UpdateCursor("T000W11", "DELETE FROM `TBM24_MAP_ITEM`  WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?", GX_NOMASK)
         ,new ForEachCursor("T000W12", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` ORDER BY `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000W13", "SELECT `TBM21_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(27) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(27) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((short[]) buf[15])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(27) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 20, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 20, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 20, false);
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
                  stmt.setVarchar(9, (String)parms[14], 50);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 200);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 50);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 200);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 100);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 100);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 10);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[40], 10);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[46], 40);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[48], 40);
               }
               stmt.setLong(27, ((Number) parms[49]).longValue());
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
                  stmt.setVarchar(6, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 200);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 50);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 200);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 100);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 100);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 10);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 10);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[39]).intValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 40);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 40);
               }
               stmt.setLong(24, ((Number) parms[46]).longValue());
               stmt.setVarchar(25, (String)parms[47], 2, false);
               stmt.setVarchar(26, (String)parms[48], 50, false);
               stmt.setVarchar(27, (String)parms[49], 20, false);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

