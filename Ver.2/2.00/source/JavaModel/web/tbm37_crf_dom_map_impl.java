/*
               File: tbm37_crf_dom_map_impl
        Description: CRF-ドメインマッピングマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:46.72
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm37_crf_dom_map_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM37_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm37_crt_user_id0N22( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM37_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm37_upd_user_id0N22( Gx_mode) ;
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
         Form.getMeta().addItem("description", "CRF-ドメインマッピングマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm37_crf_dom_map_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm37_crf_dom_map_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm37_crf_dom_map_impl.class ));
   }

   public tbm37_crf_dom_map_impl( int remoteHandle ,
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
         wb_table1_2_0N22( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0N22e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0N22( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0N22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0N22( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0N22e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRF-ドメインマッピングマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         wb_table3_28_0N22( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0N22e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0N22e( true) ;
      }
      else
      {
         wb_table1_2_0N22e( false) ;
      }
   }

   public void wb_table3_28_0N22( boolean wbgen )
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
         wb_table4_34_0N22( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0N22e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM37_CRF_DOM_MAP.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM37_CRF_DOM_MAP.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0N22e( true) ;
      }
      else
      {
         wb_table3_28_0N22e( false) ;
      }
   }

   public void wb_table4_34_0N22( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_study_id_Internalname, "試験ID", "", "", lblTextblocktbm37_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A79TBM37_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM37_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A79TBM37_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A79TBM37_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm37_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A80TBM37_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM37_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A80TBM37_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A80TBM37_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crf_item_grp_div_Internalname, "項目・グループ識別区分", "", "", lblTextblocktbm37_crf_item_grp_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRF_ITEM_GRP_DIV_Internalname, GXutil.rtrim( A81TBM37_CRF_ITEM_GRP_DIV), GXutil.rtrim( localUtil.format( A81TBM37_CRF_ITEM_GRP_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_CRF_ITEM_GRP_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_CRF_ITEM_GRP_DIV_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_DIV", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crf_item_grp_cd_Internalname, "CRF項目コード", "", "", lblTextblocktbm37_crf_item_grp_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A82TBM37_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A82TBM37_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_CRF_ITEM_GRP_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_CRF_ITEM_GRP_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_visit_no_Internalname, "VISIT番号", "", "", lblTextblocktbm37_visit_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_VISIT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A83TBM37_VISIT_NO, (byte)(6), (byte)(0), ".", "")), ((edtTBM37_VISIT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A83TBM37_VISIT_NO), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A83TBM37_VISIT_NO), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_VISIT_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_VISIT_NO_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_VISIT_NO", "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbm37_dom_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_CD_Internalname, GXutil.rtrim( A84TBM37_DOM_CD), GXutil.rtrim( localUtil.format( A84TBM37_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_DOM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_DOM_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbm37_dom_var_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_VAR_NM_Internalname, GXutil.rtrim( A500TBM37_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A500TBM37_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_DOM_VAR_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_DOM_VAR_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_VAR_NM", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_itm_grp_oid_Internalname, "OID", "", "", lblTextblocktbm37_dom_itm_grp_oid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_ITM_GRP_OID_Internalname, GXutil.rtrim( A85TBM37_DOM_ITM_GRP_OID), GXutil.rtrim( localUtil.format( A85TBM37_DOM_ITM_GRP_OID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_DOM_ITM_GRP_OID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_DOM_ITM_GRP_OID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_itm_grp_attr_seq_Internalname, "ドメイン内項目グループ内連番", "", "", lblTextblocktbm37_dom_itm_grp_attr_seq_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname, GXutil.ltrim( localUtil.ntoc( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")), ((edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A501TBM37_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A501TBM37_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_itm_grp_rowno_Internalname, "項目グループ行番号", "", "", lblTextblocktbm37_dom_itm_grp_rowno_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_ITM_GRP_ROWNO_Internalname, GXutil.ltrim( localUtil.ntoc( A86TBM37_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")), ((edtTBM37_DOM_ITM_GRP_ROWNO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A86TBM37_DOM_ITM_GRP_ROWNO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A86TBM37_DOM_ITM_GRP_ROWNO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_DOM_ITM_GRP_ROWNO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_DOM_ITM_GRP_ROWNO_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm37_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DEL_FLG_Internalname, GXutil.rtrim( A433TBM37_DEL_FLG), GXutil.rtrim( localUtil.format( A433TBM37_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm37_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM37_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRT_DATETIME_Internalname, localUtil.format(A434TBM37_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A434TBM37_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM37_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM37_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm37_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRT_USER_ID_Internalname, GXutil.rtrim( A435TBM37_CRT_USER_ID), GXutil.rtrim( localUtil.format( A435TBM37_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm37_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRT_PROG_NM_Internalname, GXutil.rtrim( A436TBM37_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A436TBM37_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm37_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM37_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_UPD_DATETIME_Internalname, localUtil.format(A437TBM37_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A437TBM37_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM37_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM37_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm37_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_UPD_USER_ID_Internalname, GXutil.rtrim( A438TBM37_UPD_USER_ID), GXutil.rtrim( localUtil.format( A438TBM37_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm37_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_UPD_PROG_NM_Internalname, GXutil.rtrim( A439TBM37_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A439TBM37_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm37_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A440TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM37_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A440TBM37_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A440TBM37_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM37_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM37_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0N22e( true) ;
      }
      else
      {
         wb_table4_34_0N22e( false) ;
      }
   }

   public void wb_table2_5_0N22( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM37_CRF_DOM_MAP.htm");
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
         wb_table2_5_0N22e( true) ;
      }
      else
      {
         wb_table2_5_0N22e( false) ;
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
      /* Execute user event: e110N2 */
      e110N2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A79TBM37_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
            }
            else
            {
               A79TBM37_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM37_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A80TBM37_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
            }
            else
            {
               A80TBM37_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM37_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
            }
            A81TBM37_CRF_ITEM_GRP_DIV = httpContext.cgiGet( edtTBM37_CRF_ITEM_GRP_DIV_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
            A82TBM37_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBM37_CRF_ITEM_GRP_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_VISIT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_VISIT_NO_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_VISIT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_VISIT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A83TBM37_VISIT_NO = 0 ;
               n83TBM37_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A83TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A83TBM37_VISIT_NO, 6, 0)));
            }
            else
            {
               A83TBM37_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM37_VISIT_NO_Internalname), ".", ",")) ;
               n83TBM37_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A83TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A83TBM37_VISIT_NO, 6, 0)));
            }
            n83TBM37_VISIT_NO = ((0==A83TBM37_VISIT_NO) ? true : false) ;
            A84TBM37_DOM_CD = httpContext.cgiGet( edtTBM37_DOM_CD_Internalname) ;
            n84TBM37_DOM_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A84TBM37_DOM_CD", A84TBM37_DOM_CD);
            n84TBM37_DOM_CD = ((GXutil.strcmp("", A84TBM37_DOM_CD)==0) ? true : false) ;
            A500TBM37_DOM_VAR_NM = httpContext.cgiGet( edtTBM37_DOM_VAR_NM_Internalname) ;
            n500TBM37_DOM_VAR_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A500TBM37_DOM_VAR_NM", A500TBM37_DOM_VAR_NM);
            n500TBM37_DOM_VAR_NM = ((GXutil.strcmp("", A500TBM37_DOM_VAR_NM)==0) ? true : false) ;
            A85TBM37_DOM_ITM_GRP_OID = httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_OID_Internalname) ;
            n85TBM37_DOM_ITM_GRP_OID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A85TBM37_DOM_ITM_GRP_OID", A85TBM37_DOM_ITM_GRP_OID);
            n85TBM37_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A85TBM37_DOM_ITM_GRP_OID)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_DOM_ITM_GRP_ATTR_SEQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A501TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
               n501TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A501TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            else
            {
               A501TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",")) ;
               n501TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A501TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            n501TBM37_DOM_ITM_GRP_ATTR_SEQ = ((0==A501TBM37_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_DOM_ITM_GRP_ROWNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_DOM_ITM_GRP_ROWNO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A86TBM37_DOM_ITM_GRP_ROWNO = (short)(0) ;
               n86TBM37_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A86TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A86TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            else
            {
               A86TBM37_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ROWNO_Internalname), ".", ",")) ;
               n86TBM37_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A86TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A86TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            n86TBM37_DOM_ITM_GRP_ROWNO = ((0==A86TBM37_DOM_ITM_GRP_ROWNO) ? true : false) ;
            A433TBM37_DEL_FLG = httpContext.cgiGet( edtTBM37_DEL_FLG_Internalname) ;
            n433TBM37_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A433TBM37_DEL_FLG", A433TBM37_DEL_FLG);
            n433TBM37_DEL_FLG = ((GXutil.strcmp("", A433TBM37_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM37_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM37_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A434TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n434TBM37_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A434TBM37_CRT_DATETIME", localUtil.ttoc( A434TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A434TBM37_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM37_CRT_DATETIME_Internalname)) ;
               n434TBM37_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A434TBM37_CRT_DATETIME", localUtil.ttoc( A434TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n434TBM37_CRT_DATETIME = (GXutil.nullDate().equals(A434TBM37_CRT_DATETIME) ? true : false) ;
            A435TBM37_CRT_USER_ID = httpContext.cgiGet( edtTBM37_CRT_USER_ID_Internalname) ;
            n435TBM37_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A435TBM37_CRT_USER_ID", A435TBM37_CRT_USER_ID);
            n435TBM37_CRT_USER_ID = ((GXutil.strcmp("", A435TBM37_CRT_USER_ID)==0) ? true : false) ;
            A436TBM37_CRT_PROG_NM = httpContext.cgiGet( edtTBM37_CRT_PROG_NM_Internalname) ;
            n436TBM37_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A436TBM37_CRT_PROG_NM", A436TBM37_CRT_PROG_NM);
            n436TBM37_CRT_PROG_NM = ((GXutil.strcmp("", A436TBM37_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM37_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM37_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A437TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n437TBM37_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A437TBM37_UPD_DATETIME", localUtil.ttoc( A437TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A437TBM37_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM37_UPD_DATETIME_Internalname)) ;
               n437TBM37_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A437TBM37_UPD_DATETIME", localUtil.ttoc( A437TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n437TBM37_UPD_DATETIME = (GXutil.nullDate().equals(A437TBM37_UPD_DATETIME) ? true : false) ;
            A438TBM37_UPD_USER_ID = httpContext.cgiGet( edtTBM37_UPD_USER_ID_Internalname) ;
            n438TBM37_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A438TBM37_UPD_USER_ID", A438TBM37_UPD_USER_ID);
            n438TBM37_UPD_USER_ID = ((GXutil.strcmp("", A438TBM37_UPD_USER_ID)==0) ? true : false) ;
            A439TBM37_UPD_PROG_NM = httpContext.cgiGet( edtTBM37_UPD_PROG_NM_Internalname) ;
            n439TBM37_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A439TBM37_UPD_PROG_NM", A439TBM37_UPD_PROG_NM);
            n439TBM37_UPD_PROG_NM = ((GXutil.strcmp("", A439TBM37_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A440TBM37_UPD_CNT = 0 ;
               n440TBM37_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A440TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)));
            }
            else
            {
               A440TBM37_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM37_UPD_CNT_Internalname), ".", ",") ;
               n440TBM37_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A440TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)));
            }
            n440TBM37_UPD_CNT = ((0==A440TBM37_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z79TBM37_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z79TBM37_STUDY_ID"), ".", ",") ;
            Z80TBM37_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z80TBM37_CRF_ID"), ".", ",")) ;
            Z81TBM37_CRF_ITEM_GRP_DIV = httpContext.cgiGet( "Z81TBM37_CRF_ITEM_GRP_DIV") ;
            Z82TBM37_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z82TBM37_CRF_ITEM_GRP_CD") ;
            Z434TBM37_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z434TBM37_CRT_DATETIME"), 0) ;
            n434TBM37_CRT_DATETIME = (GXutil.nullDate().equals(A434TBM37_CRT_DATETIME) ? true : false) ;
            Z435TBM37_CRT_USER_ID = httpContext.cgiGet( "Z435TBM37_CRT_USER_ID") ;
            n435TBM37_CRT_USER_ID = ((GXutil.strcmp("", A435TBM37_CRT_USER_ID)==0) ? true : false) ;
            Z437TBM37_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z437TBM37_UPD_DATETIME"), 0) ;
            n437TBM37_UPD_DATETIME = (GXutil.nullDate().equals(A437TBM37_UPD_DATETIME) ? true : false) ;
            Z438TBM37_UPD_USER_ID = httpContext.cgiGet( "Z438TBM37_UPD_USER_ID") ;
            n438TBM37_UPD_USER_ID = ((GXutil.strcmp("", A438TBM37_UPD_USER_ID)==0) ? true : false) ;
            Z440TBM37_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z440TBM37_UPD_CNT"), ".", ",") ;
            n440TBM37_UPD_CNT = ((0==A440TBM37_UPD_CNT) ? true : false) ;
            Z83TBM37_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( "Z83TBM37_VISIT_NO"), ".", ",")) ;
            n83TBM37_VISIT_NO = ((0==A83TBM37_VISIT_NO) ? true : false) ;
            Z84TBM37_DOM_CD = httpContext.cgiGet( "Z84TBM37_DOM_CD") ;
            n84TBM37_DOM_CD = ((GXutil.strcmp("", A84TBM37_DOM_CD)==0) ? true : false) ;
            Z500TBM37_DOM_VAR_NM = httpContext.cgiGet( "Z500TBM37_DOM_VAR_NM") ;
            n500TBM37_DOM_VAR_NM = ((GXutil.strcmp("", A500TBM37_DOM_VAR_NM)==0) ? true : false) ;
            Z85TBM37_DOM_ITM_GRP_OID = httpContext.cgiGet( "Z85TBM37_DOM_ITM_GRP_OID") ;
            n85TBM37_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A85TBM37_DOM_ITM_GRP_OID)==0) ? true : false) ;
            Z501TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( "Z501TBM37_DOM_ITM_GRP_ATTR_SEQ"), ".", ",")) ;
            n501TBM37_DOM_ITM_GRP_ATTR_SEQ = ((0==A501TBM37_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            Z86TBM37_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( "Z86TBM37_DOM_ITM_GRP_ROWNO"), ".", ",")) ;
            n86TBM37_DOM_ITM_GRP_ROWNO = ((0==A86TBM37_DOM_ITM_GRP_ROWNO) ? true : false) ;
            Z433TBM37_DEL_FLG = httpContext.cgiGet( "Z433TBM37_DEL_FLG") ;
            n433TBM37_DEL_FLG = ((GXutil.strcmp("", A433TBM37_DEL_FLG)==0) ? true : false) ;
            Z436TBM37_CRT_PROG_NM = httpContext.cgiGet( "Z436TBM37_CRT_PROG_NM") ;
            n436TBM37_CRT_PROG_NM = ((GXutil.strcmp("", A436TBM37_CRT_PROG_NM)==0) ? true : false) ;
            Z439TBM37_UPD_PROG_NM = httpContext.cgiGet( "Z439TBM37_UPD_PROG_NM") ;
            n439TBM37_UPD_PROG_NM = ((GXutil.strcmp("", A439TBM37_UPD_PROG_NM)==0) ? true : false) ;
            O440TBM37_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O440TBM37_UPD_CNT"), ".", ",") ;
            n440TBM37_UPD_CNT = ((0==A440TBM37_UPD_CNT) ? true : false) ;
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
               A79TBM37_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
               A80TBM37_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
               A81TBM37_CRF_ITEM_GRP_DIV = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
               A82TBM37_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
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
                     /* Execute user event: e110N2 */
                     e110N2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120N2 */
                     e120N2 ();
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
         /* Execute user event: e120N2 */
         e120N2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0N22( ) ;
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
      disableAttributes0N22( ) ;
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

   public void resetCaption0N0( )
   {
   }

   public void e110N2( )
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

   public void e120N2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A80TBM37_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A81TBM37_CRF_ITEM_GRP_DIV + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A82TBM37_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A83TBM37_VISIT_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A84TBM37_DOM_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A500TBM37_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A85TBM37_DOM_ITM_GRP_OID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A86TBM37_DOM_ITM_GRP_ROWNO, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A433TBM37_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A434TBM37_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm37_crf_dom_map_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A434TBM37_CRT_DATETIME", localUtil.ttoc( A434TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A435TBM37_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A436TBM37_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A437TBM37_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm37_crf_dom_map_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A437TBM37_UPD_DATETIME", localUtil.ttoc( A437TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A438TBM37_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A439TBM37_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0N22( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z434TBM37_CRT_DATETIME = T000N3_A434TBM37_CRT_DATETIME[0] ;
            Z435TBM37_CRT_USER_ID = T000N3_A435TBM37_CRT_USER_ID[0] ;
            Z437TBM37_UPD_DATETIME = T000N3_A437TBM37_UPD_DATETIME[0] ;
            Z438TBM37_UPD_USER_ID = T000N3_A438TBM37_UPD_USER_ID[0] ;
            Z440TBM37_UPD_CNT = T000N3_A440TBM37_UPD_CNT[0] ;
            Z83TBM37_VISIT_NO = T000N3_A83TBM37_VISIT_NO[0] ;
            Z84TBM37_DOM_CD = T000N3_A84TBM37_DOM_CD[0] ;
            Z500TBM37_DOM_VAR_NM = T000N3_A500TBM37_DOM_VAR_NM[0] ;
            Z85TBM37_DOM_ITM_GRP_OID = T000N3_A85TBM37_DOM_ITM_GRP_OID[0] ;
            Z501TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N3_A501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
            Z86TBM37_DOM_ITM_GRP_ROWNO = T000N3_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
            Z433TBM37_DEL_FLG = T000N3_A433TBM37_DEL_FLG[0] ;
            Z436TBM37_CRT_PROG_NM = T000N3_A436TBM37_CRT_PROG_NM[0] ;
            Z439TBM37_UPD_PROG_NM = T000N3_A439TBM37_UPD_PROG_NM[0] ;
         }
         else
         {
            Z434TBM37_CRT_DATETIME = A434TBM37_CRT_DATETIME ;
            Z435TBM37_CRT_USER_ID = A435TBM37_CRT_USER_ID ;
            Z437TBM37_UPD_DATETIME = A437TBM37_UPD_DATETIME ;
            Z438TBM37_UPD_USER_ID = A438TBM37_UPD_USER_ID ;
            Z440TBM37_UPD_CNT = A440TBM37_UPD_CNT ;
            Z83TBM37_VISIT_NO = A83TBM37_VISIT_NO ;
            Z84TBM37_DOM_CD = A84TBM37_DOM_CD ;
            Z500TBM37_DOM_VAR_NM = A500TBM37_DOM_VAR_NM ;
            Z85TBM37_DOM_ITM_GRP_OID = A85TBM37_DOM_ITM_GRP_OID ;
            Z501TBM37_DOM_ITM_GRP_ATTR_SEQ = A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
            Z86TBM37_DOM_ITM_GRP_ROWNO = A86TBM37_DOM_ITM_GRP_ROWNO ;
            Z433TBM37_DEL_FLG = A433TBM37_DEL_FLG ;
            Z436TBM37_CRT_PROG_NM = A436TBM37_CRT_PROG_NM ;
            Z439TBM37_UPD_PROG_NM = A439TBM37_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z79TBM37_STUDY_ID = A79TBM37_STUDY_ID ;
         Z80TBM37_CRF_ID = A80TBM37_CRF_ID ;
         Z81TBM37_CRF_ITEM_GRP_DIV = A81TBM37_CRF_ITEM_GRP_DIV ;
         Z82TBM37_CRF_ITEM_GRP_CD = A82TBM37_CRF_ITEM_GRP_CD ;
         Z434TBM37_CRT_DATETIME = A434TBM37_CRT_DATETIME ;
         Z435TBM37_CRT_USER_ID = A435TBM37_CRT_USER_ID ;
         Z437TBM37_UPD_DATETIME = A437TBM37_UPD_DATETIME ;
         Z438TBM37_UPD_USER_ID = A438TBM37_UPD_USER_ID ;
         Z440TBM37_UPD_CNT = A440TBM37_UPD_CNT ;
         Z83TBM37_VISIT_NO = A83TBM37_VISIT_NO ;
         Z84TBM37_DOM_CD = A84TBM37_DOM_CD ;
         Z500TBM37_DOM_VAR_NM = A500TBM37_DOM_VAR_NM ;
         Z85TBM37_DOM_ITM_GRP_OID = A85TBM37_DOM_ITM_GRP_OID ;
         Z501TBM37_DOM_ITM_GRP_ATTR_SEQ = A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
         Z86TBM37_DOM_ITM_GRP_ROWNO = A86TBM37_DOM_ITM_GRP_ROWNO ;
         Z433TBM37_DEL_FLG = A433TBM37_DEL_FLG ;
         Z436TBM37_CRT_PROG_NM = A436TBM37_CRT_PROG_NM ;
         Z439TBM37_UPD_PROG_NM = A439TBM37_UPD_PROG_NM ;
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

   public void load0N22( )
   {
      /* Using cursor T000N4 */
      pr_default.execute(2, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A434TBM37_CRT_DATETIME = T000N4_A434TBM37_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A434TBM37_CRT_DATETIME", localUtil.ttoc( A434TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n434TBM37_CRT_DATETIME = T000N4_n434TBM37_CRT_DATETIME[0] ;
         A435TBM37_CRT_USER_ID = T000N4_A435TBM37_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TBM37_CRT_USER_ID", A435TBM37_CRT_USER_ID);
         n435TBM37_CRT_USER_ID = T000N4_n435TBM37_CRT_USER_ID[0] ;
         A437TBM37_UPD_DATETIME = T000N4_A437TBM37_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437TBM37_UPD_DATETIME", localUtil.ttoc( A437TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n437TBM37_UPD_DATETIME = T000N4_n437TBM37_UPD_DATETIME[0] ;
         A438TBM37_UPD_USER_ID = T000N4_A438TBM37_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A438TBM37_UPD_USER_ID", A438TBM37_UPD_USER_ID);
         n438TBM37_UPD_USER_ID = T000N4_n438TBM37_UPD_USER_ID[0] ;
         A440TBM37_UPD_CNT = T000N4_A440TBM37_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A440TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)));
         n440TBM37_UPD_CNT = T000N4_n440TBM37_UPD_CNT[0] ;
         A83TBM37_VISIT_NO = T000N4_A83TBM37_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A83TBM37_VISIT_NO, 6, 0)));
         n83TBM37_VISIT_NO = T000N4_n83TBM37_VISIT_NO[0] ;
         A84TBM37_DOM_CD = T000N4_A84TBM37_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84TBM37_DOM_CD", A84TBM37_DOM_CD);
         n84TBM37_DOM_CD = T000N4_n84TBM37_DOM_CD[0] ;
         A500TBM37_DOM_VAR_NM = T000N4_A500TBM37_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A500TBM37_DOM_VAR_NM", A500TBM37_DOM_VAR_NM);
         n500TBM37_DOM_VAR_NM = T000N4_n500TBM37_DOM_VAR_NM[0] ;
         A85TBM37_DOM_ITM_GRP_OID = T000N4_A85TBM37_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A85TBM37_DOM_ITM_GRP_OID", A85TBM37_DOM_ITM_GRP_OID);
         n85TBM37_DOM_ITM_GRP_OID = T000N4_n85TBM37_DOM_ITM_GRP_OID[0] ;
         A501TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N4_A501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A501TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n501TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N4_n501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A86TBM37_DOM_ITM_GRP_ROWNO = T000N4_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A86TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A86TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
         n86TBM37_DOM_ITM_GRP_ROWNO = T000N4_n86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A433TBM37_DEL_FLG = T000N4_A433TBM37_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433TBM37_DEL_FLG", A433TBM37_DEL_FLG);
         n433TBM37_DEL_FLG = T000N4_n433TBM37_DEL_FLG[0] ;
         A436TBM37_CRT_PROG_NM = T000N4_A436TBM37_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436TBM37_CRT_PROG_NM", A436TBM37_CRT_PROG_NM);
         n436TBM37_CRT_PROG_NM = T000N4_n436TBM37_CRT_PROG_NM[0] ;
         A439TBM37_UPD_PROG_NM = T000N4_A439TBM37_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A439TBM37_UPD_PROG_NM", A439TBM37_UPD_PROG_NM);
         n439TBM37_UPD_PROG_NM = T000N4_n439TBM37_UPD_PROG_NM[0] ;
         zm0N22( -8) ;
      }
      pr_default.close(2);
      onLoadActions0N22( ) ;
   }

   public void onLoadActions0N22( )
   {
      AV9Pgmname = "TBM37_CRF_DOM_MAP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0N22( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM37_CRF_DOM_MAP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A434TBM37_CRT_DATETIME) || (( A434TBM37_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A434TBM37_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM37_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM37_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A437TBM37_UPD_DATETIME) || (( A437TBM37_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A437TBM37_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM37_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM37_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0N22( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0N22( )
   {
      /* Using cursor T000N5 */
      pr_default.execute(3, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound22 = (short)(1) ;
      }
      else
      {
         RcdFound22 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000N3 */
      pr_default.execute(1, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0N22( 8) ;
         RcdFound22 = (short)(1) ;
         A79TBM37_STUDY_ID = T000N3_A79TBM37_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
         A80TBM37_CRF_ID = T000N3_A80TBM37_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
         A81TBM37_CRF_ITEM_GRP_DIV = T000N3_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
         A82TBM37_CRF_ITEM_GRP_CD = T000N3_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
         A434TBM37_CRT_DATETIME = T000N3_A434TBM37_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A434TBM37_CRT_DATETIME", localUtil.ttoc( A434TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n434TBM37_CRT_DATETIME = T000N3_n434TBM37_CRT_DATETIME[0] ;
         A435TBM37_CRT_USER_ID = T000N3_A435TBM37_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TBM37_CRT_USER_ID", A435TBM37_CRT_USER_ID);
         n435TBM37_CRT_USER_ID = T000N3_n435TBM37_CRT_USER_ID[0] ;
         A437TBM37_UPD_DATETIME = T000N3_A437TBM37_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437TBM37_UPD_DATETIME", localUtil.ttoc( A437TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n437TBM37_UPD_DATETIME = T000N3_n437TBM37_UPD_DATETIME[0] ;
         A438TBM37_UPD_USER_ID = T000N3_A438TBM37_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A438TBM37_UPD_USER_ID", A438TBM37_UPD_USER_ID);
         n438TBM37_UPD_USER_ID = T000N3_n438TBM37_UPD_USER_ID[0] ;
         A440TBM37_UPD_CNT = T000N3_A440TBM37_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A440TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)));
         n440TBM37_UPD_CNT = T000N3_n440TBM37_UPD_CNT[0] ;
         A83TBM37_VISIT_NO = T000N3_A83TBM37_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A83TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A83TBM37_VISIT_NO, 6, 0)));
         n83TBM37_VISIT_NO = T000N3_n83TBM37_VISIT_NO[0] ;
         A84TBM37_DOM_CD = T000N3_A84TBM37_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A84TBM37_DOM_CD", A84TBM37_DOM_CD);
         n84TBM37_DOM_CD = T000N3_n84TBM37_DOM_CD[0] ;
         A500TBM37_DOM_VAR_NM = T000N3_A500TBM37_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A500TBM37_DOM_VAR_NM", A500TBM37_DOM_VAR_NM);
         n500TBM37_DOM_VAR_NM = T000N3_n500TBM37_DOM_VAR_NM[0] ;
         A85TBM37_DOM_ITM_GRP_OID = T000N3_A85TBM37_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A85TBM37_DOM_ITM_GRP_OID", A85TBM37_DOM_ITM_GRP_OID);
         n85TBM37_DOM_ITM_GRP_OID = T000N3_n85TBM37_DOM_ITM_GRP_OID[0] ;
         A501TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N3_A501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A501TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n501TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N3_n501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A86TBM37_DOM_ITM_GRP_ROWNO = T000N3_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A86TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A86TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
         n86TBM37_DOM_ITM_GRP_ROWNO = T000N3_n86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A433TBM37_DEL_FLG = T000N3_A433TBM37_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433TBM37_DEL_FLG", A433TBM37_DEL_FLG);
         n433TBM37_DEL_FLG = T000N3_n433TBM37_DEL_FLG[0] ;
         A436TBM37_CRT_PROG_NM = T000N3_A436TBM37_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436TBM37_CRT_PROG_NM", A436TBM37_CRT_PROG_NM);
         n436TBM37_CRT_PROG_NM = T000N3_n436TBM37_CRT_PROG_NM[0] ;
         A439TBM37_UPD_PROG_NM = T000N3_A439TBM37_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A439TBM37_UPD_PROG_NM", A439TBM37_UPD_PROG_NM);
         n439TBM37_UPD_PROG_NM = T000N3_n439TBM37_UPD_PROG_NM[0] ;
         O440TBM37_UPD_CNT = A440TBM37_UPD_CNT ;
         n440TBM37_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A440TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)));
         Z79TBM37_STUDY_ID = A79TBM37_STUDY_ID ;
         Z80TBM37_CRF_ID = A80TBM37_CRF_ID ;
         Z81TBM37_CRF_ITEM_GRP_DIV = A81TBM37_CRF_ITEM_GRP_DIV ;
         Z82TBM37_CRF_ITEM_GRP_CD = A82TBM37_CRF_ITEM_GRP_CD ;
         sMode22 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0N22( ) ;
         if ( AnyError == 1 )
         {
            RcdFound22 = (short)(0) ;
            initializeNonKey0N22( ) ;
         }
         Gx_mode = sMode22 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound22 = (short)(0) ;
         initializeNonKey0N22( ) ;
         sMode22 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode22 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0N22( ) ;
      if ( RcdFound22 == 0 )
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
      RcdFound22 = (short)(0) ;
      /* Using cursor T000N6 */
      pr_default.execute(4, new Object[] {new Long(A79TBM37_STUDY_ID), new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), new Short(A80TBM37_CRF_ID), new Long(A79TBM37_STUDY_ID), A81TBM37_CRF_ITEM_GRP_DIV, A81TBM37_CRF_ITEM_GRP_DIV, new Short(A80TBM37_CRF_ID), new Long(A79TBM37_STUDY_ID), A82TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000N6_A79TBM37_STUDY_ID[0] < A79TBM37_STUDY_ID ) || ( T000N6_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( T000N6_A80TBM37_CRF_ID[0] < A80TBM37_CRF_ID ) || ( T000N6_A80TBM37_CRF_ID[0] == A80TBM37_CRF_ID ) && ( T000N6_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N6_A81TBM37_CRF_ITEM_GRP_DIV[0], A81TBM37_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T000N6_A81TBM37_CRF_ITEM_GRP_DIV[0], A81TBM37_CRF_ITEM_GRP_DIV) == 0 ) && ( T000N6_A80TBM37_CRF_ID[0] == A80TBM37_CRF_ID ) && ( T000N6_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N6_A82TBM37_CRF_ITEM_GRP_CD[0], A82TBM37_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000N6_A79TBM37_STUDY_ID[0] > A79TBM37_STUDY_ID ) || ( T000N6_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( T000N6_A80TBM37_CRF_ID[0] > A80TBM37_CRF_ID ) || ( T000N6_A80TBM37_CRF_ID[0] == A80TBM37_CRF_ID ) && ( T000N6_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N6_A81TBM37_CRF_ITEM_GRP_DIV[0], A81TBM37_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T000N6_A81TBM37_CRF_ITEM_GRP_DIV[0], A81TBM37_CRF_ITEM_GRP_DIV) == 0 ) && ( T000N6_A80TBM37_CRF_ID[0] == A80TBM37_CRF_ID ) && ( T000N6_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N6_A82TBM37_CRF_ITEM_GRP_CD[0], A82TBM37_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            A79TBM37_STUDY_ID = T000N6_A79TBM37_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
            A80TBM37_CRF_ID = T000N6_A80TBM37_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
            A81TBM37_CRF_ITEM_GRP_DIV = T000N6_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
            A82TBM37_CRF_ITEM_GRP_CD = T000N6_A82TBM37_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
            RcdFound22 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound22 = (short)(0) ;
      /* Using cursor T000N7 */
      pr_default.execute(5, new Object[] {new Long(A79TBM37_STUDY_ID), new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), new Short(A80TBM37_CRF_ID), new Long(A79TBM37_STUDY_ID), A81TBM37_CRF_ITEM_GRP_DIV, A81TBM37_CRF_ITEM_GRP_DIV, new Short(A80TBM37_CRF_ID), new Long(A79TBM37_STUDY_ID), A82TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000N7_A79TBM37_STUDY_ID[0] > A79TBM37_STUDY_ID ) || ( T000N7_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( T000N7_A80TBM37_CRF_ID[0] > A80TBM37_CRF_ID ) || ( T000N7_A80TBM37_CRF_ID[0] == A80TBM37_CRF_ID ) && ( T000N7_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N7_A81TBM37_CRF_ITEM_GRP_DIV[0], A81TBM37_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T000N7_A81TBM37_CRF_ITEM_GRP_DIV[0], A81TBM37_CRF_ITEM_GRP_DIV) == 0 ) && ( T000N7_A80TBM37_CRF_ID[0] == A80TBM37_CRF_ID ) && ( T000N7_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N7_A82TBM37_CRF_ITEM_GRP_CD[0], A82TBM37_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000N7_A79TBM37_STUDY_ID[0] < A79TBM37_STUDY_ID ) || ( T000N7_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( T000N7_A80TBM37_CRF_ID[0] < A80TBM37_CRF_ID ) || ( T000N7_A80TBM37_CRF_ID[0] == A80TBM37_CRF_ID ) && ( T000N7_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N7_A81TBM37_CRF_ITEM_GRP_DIV[0], A81TBM37_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T000N7_A81TBM37_CRF_ITEM_GRP_DIV[0], A81TBM37_CRF_ITEM_GRP_DIV) == 0 ) && ( T000N7_A80TBM37_CRF_ID[0] == A80TBM37_CRF_ID ) && ( T000N7_A79TBM37_STUDY_ID[0] == A79TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N7_A82TBM37_CRF_ITEM_GRP_CD[0], A82TBM37_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            A79TBM37_STUDY_ID = T000N7_A79TBM37_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
            A80TBM37_CRF_ID = T000N7_A80TBM37_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
            A81TBM37_CRF_ITEM_GRP_DIV = T000N7_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
            A82TBM37_CRF_ITEM_GRP_CD = T000N7_A82TBM37_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
            RcdFound22 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0N22( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0N22( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound22 == 1 )
         {
            if ( ( A79TBM37_STUDY_ID != Z79TBM37_STUDY_ID ) || ( A80TBM37_CRF_ID != Z80TBM37_CRF_ID ) || ( GXutil.strcmp(A81TBM37_CRF_ITEM_GRP_DIV, Z81TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A82TBM37_CRF_ITEM_GRP_CD, Z82TBM37_CRF_ITEM_GRP_CD) != 0 ) )
            {
               A79TBM37_STUDY_ID = Z79TBM37_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
               A80TBM37_CRF_ID = Z80TBM37_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
               A81TBM37_CRF_ITEM_GRP_DIV = Z81TBM37_CRF_ITEM_GRP_DIV ;
               httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
               A82TBM37_CRF_ITEM_GRP_CD = Z82TBM37_CRF_ITEM_GRP_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM37_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0N22( ) ;
               GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A79TBM37_STUDY_ID != Z79TBM37_STUDY_ID ) || ( A80TBM37_CRF_ID != Z80TBM37_CRF_ID ) || ( GXutil.strcmp(A81TBM37_CRF_ITEM_GRP_DIV, Z81TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A82TBM37_CRF_ITEM_GRP_CD, Z82TBM37_CRF_ITEM_GRP_CD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0N22( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM37_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0N22( ) ;
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
      if ( ( A79TBM37_STUDY_ID != Z79TBM37_STUDY_ID ) || ( A80TBM37_CRF_ID != Z80TBM37_CRF_ID ) || ( GXutil.strcmp(A81TBM37_CRF_ITEM_GRP_DIV, Z81TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A82TBM37_CRF_ITEM_GRP_CD, Z82TBM37_CRF_ITEM_GRP_CD) != 0 ) )
      {
         A79TBM37_STUDY_ID = Z79TBM37_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
         A80TBM37_CRF_ID = Z80TBM37_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
         A81TBM37_CRF_ITEM_GRP_DIV = Z81TBM37_CRF_ITEM_GRP_DIV ;
         httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
         A82TBM37_CRF_ITEM_GRP_CD = Z82TBM37_CRF_ITEM_GRP_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM37_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
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
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM37_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM37_VISIT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0N22( ) ;
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM37_VISIT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0N22( ) ;
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
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM37_VISIT_NO_Internalname ;
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
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM37_VISIT_NO_Internalname ;
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
      scanStart0N22( ) ;
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound22 != 0 )
         {
            scanNext0N22( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM37_VISIT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0N22( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0N22( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000N2 */
         pr_default.execute(0, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM37_CRF_DOM_MAP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z434TBM37_CRT_DATETIME.equals( T000N2_A434TBM37_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z435TBM37_CRT_USER_ID, T000N2_A435TBM37_CRT_USER_ID[0]) != 0 ) || !( Z437TBM37_UPD_DATETIME.equals( T000N2_A437TBM37_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z438TBM37_UPD_USER_ID, T000N2_A438TBM37_UPD_USER_ID[0]) != 0 ) || ( Z440TBM37_UPD_CNT != T000N2_A440TBM37_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z83TBM37_VISIT_NO != T000N2_A83TBM37_VISIT_NO[0] ) || ( GXutil.strcmp(Z84TBM37_DOM_CD, T000N2_A84TBM37_DOM_CD[0]) != 0 ) || ( GXutil.strcmp(Z500TBM37_DOM_VAR_NM, T000N2_A500TBM37_DOM_VAR_NM[0]) != 0 ) || ( GXutil.strcmp(Z85TBM37_DOM_ITM_GRP_OID, T000N2_A85TBM37_DOM_ITM_GRP_OID[0]) != 0 ) || ( Z501TBM37_DOM_ITM_GRP_ATTR_SEQ != T000N2_A501TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z86TBM37_DOM_ITM_GRP_ROWNO != T000N2_A86TBM37_DOM_ITM_GRP_ROWNO[0] ) || ( GXutil.strcmp(Z433TBM37_DEL_FLG, T000N2_A433TBM37_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z436TBM37_CRT_PROG_NM, T000N2_A436TBM37_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z439TBM37_UPD_PROG_NM, T000N2_A439TBM37_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM37_CRF_DOM_MAP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0N22( )
   {
      beforeValidate0N22( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0N22( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0N22( 0) ;
         checkOptimisticConcurrency0N22( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0N22( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0N22( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000N8 */
                  pr_default.execute(6, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD, new Boolean(n434TBM37_CRT_DATETIME), A434TBM37_CRT_DATETIME, new Boolean(n435TBM37_CRT_USER_ID), A435TBM37_CRT_USER_ID, new Boolean(n437TBM37_UPD_DATETIME), A437TBM37_UPD_DATETIME, new Boolean(n438TBM37_UPD_USER_ID), A438TBM37_UPD_USER_ID, new Boolean(n440TBM37_UPD_CNT), new Long(A440TBM37_UPD_CNT), new Boolean(n83TBM37_VISIT_NO), new Integer(A83TBM37_VISIT_NO), new Boolean(n84TBM37_DOM_CD), A84TBM37_DOM_CD, new Boolean(n500TBM37_DOM_VAR_NM), A500TBM37_DOM_VAR_NM, new Boolean(n85TBM37_DOM_ITM_GRP_OID), A85TBM37_DOM_ITM_GRP_OID, new Boolean(n501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n86TBM37_DOM_ITM_GRP_ROWNO), new Short(A86TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n433TBM37_DEL_FLG), A433TBM37_DEL_FLG, new Boolean(n436TBM37_CRT_PROG_NM), A436TBM37_CRT_PROG_NM, new Boolean(n439TBM37_UPD_PROG_NM), A439TBM37_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM37_CRF_DOM_MAP") ;
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
                        resetCaption0N0( ) ;
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
            load0N22( ) ;
         }
         endLevel0N22( ) ;
      }
      closeExtendedTableCursors0N22( ) ;
   }

   public void update0N22( )
   {
      beforeValidate0N22( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0N22( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0N22( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0N22( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0N22( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000N9 */
                  pr_default.execute(7, new Object[] {new Boolean(n434TBM37_CRT_DATETIME), A434TBM37_CRT_DATETIME, new Boolean(n435TBM37_CRT_USER_ID), A435TBM37_CRT_USER_ID, new Boolean(n437TBM37_UPD_DATETIME), A437TBM37_UPD_DATETIME, new Boolean(n438TBM37_UPD_USER_ID), A438TBM37_UPD_USER_ID, new Boolean(n440TBM37_UPD_CNT), new Long(A440TBM37_UPD_CNT), new Boolean(n83TBM37_VISIT_NO), new Integer(A83TBM37_VISIT_NO), new Boolean(n84TBM37_DOM_CD), A84TBM37_DOM_CD, new Boolean(n500TBM37_DOM_VAR_NM), A500TBM37_DOM_VAR_NM, new Boolean(n85TBM37_DOM_ITM_GRP_OID), A85TBM37_DOM_ITM_GRP_OID, new Boolean(n501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A501TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n86TBM37_DOM_ITM_GRP_ROWNO), new Short(A86TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n433TBM37_DEL_FLG), A433TBM37_DEL_FLG, new Boolean(n436TBM37_CRT_PROG_NM), A436TBM37_CRT_PROG_NM, new Boolean(n439TBM37_UPD_PROG_NM), A439TBM37_UPD_PROG_NM, new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM37_CRF_DOM_MAP") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM37_CRF_DOM_MAP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0N22( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0N0( ) ;
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
         endLevel0N22( ) ;
      }
      closeExtendedTableCursors0N22( ) ;
   }

   public void deferredUpdate0N22( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0N22( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0N22( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0N22( ) ;
         afterConfirm0N22( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0N22( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000N10 */
               pr_default.execute(8, new Object[] {new Long(A79TBM37_STUDY_ID), new Short(A80TBM37_CRF_ID), A81TBM37_CRF_ITEM_GRP_DIV, A82TBM37_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM37_CRF_DOM_MAP") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound22 == 0 )
                     {
                        initAll0N22( ) ;
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
                     resetCaption0N0( ) ;
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
      sMode22 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0N22( ) ;
      Gx_mode = sMode22 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0N22( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM37_CRF_DOM_MAP" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0N22( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0N22( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm37_crf_dom_map");
         if ( AnyError == 0 )
         {
            confirmValues0N0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm37_crf_dom_map");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0N22( )
   {
      /* Scan By routine */
      /* Using cursor T000N11 */
      pr_default.execute(9);
      RcdFound22 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A79TBM37_STUDY_ID = T000N11_A79TBM37_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
         A80TBM37_CRF_ID = T000N11_A80TBM37_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
         A81TBM37_CRF_ITEM_GRP_DIV = T000N11_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
         A82TBM37_CRF_ITEM_GRP_CD = T000N11_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0N22( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound22 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A79TBM37_STUDY_ID = T000N11_A79TBM37_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
         A80TBM37_CRF_ID = T000N11_A80TBM37_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
         A81TBM37_CRF_ITEM_GRP_DIV = T000N11_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
         A82TBM37_CRF_ITEM_GRP_CD = T000N11_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
      }
   }

   public void scanEnd0N22( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0N22( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0N22( )
   {
      /* Before Insert Rules */
      A434TBM37_CRT_DATETIME = GXutil.now( ) ;
      n434TBM37_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A434TBM37_CRT_DATETIME", localUtil.ttoc( A434TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A435TBM37_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm37_crf_dom_map_impl.this.GXt_char1 = GXv_char2[0] ;
      A435TBM37_CRT_USER_ID = GXt_char1 ;
      n435TBM37_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TBM37_CRT_USER_ID", A435TBM37_CRT_USER_ID);
      A437TBM37_UPD_DATETIME = GXutil.now( ) ;
      n437TBM37_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A437TBM37_UPD_DATETIME", localUtil.ttoc( A437TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A438TBM37_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm37_crf_dom_map_impl.this.GXt_char1 = GXv_char2[0] ;
      A438TBM37_UPD_USER_ID = GXt_char1 ;
      n438TBM37_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A438TBM37_UPD_USER_ID", A438TBM37_UPD_USER_ID);
      A440TBM37_UPD_CNT = (long)(O440TBM37_UPD_CNT+1) ;
      n440TBM37_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A440TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0N22( )
   {
      /* Before Update Rules */
      A437TBM37_UPD_DATETIME = GXutil.now( ) ;
      n437TBM37_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A437TBM37_UPD_DATETIME", localUtil.ttoc( A437TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A438TBM37_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm37_crf_dom_map_impl.this.GXt_char1 = GXv_char2[0] ;
      A438TBM37_UPD_USER_ID = GXt_char1 ;
      n438TBM37_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A438TBM37_UPD_USER_ID", A438TBM37_UPD_USER_ID);
      A440TBM37_UPD_CNT = (long)(O440TBM37_UPD_CNT+1) ;
      n440TBM37_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A440TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0N22( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0N22( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0N22( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0N22( )
   {
      edtTBM37_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_STUDY_ID_Enabled, 5, 0)));
      edtTBM37_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_CRF_ID_Enabled, 5, 0)));
      edtTBM37_CRF_ITEM_GRP_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_CRF_ITEM_GRP_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_CRF_ITEM_GRP_DIV_Enabled, 5, 0)));
      edtTBM37_CRF_ITEM_GRP_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_CRF_ITEM_GRP_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_CRF_ITEM_GRP_CD_Enabled, 5, 0)));
      edtTBM37_VISIT_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_VISIT_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_VISIT_NO_Enabled, 5, 0)));
      edtTBM37_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_DOM_CD_Enabled, 5, 0)));
      edtTBM37_DOM_VAR_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_DOM_VAR_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_DOM_VAR_NM_Enabled, 5, 0)));
      edtTBM37_DOM_ITM_GRP_OID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_DOM_ITM_GRP_OID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_DOM_ITM_GRP_OID_Enabled, 5, 0)));
      edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Enabled, 5, 0)));
      edtTBM37_DOM_ITM_GRP_ROWNO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_DOM_ITM_GRP_ROWNO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_DOM_ITM_GRP_ROWNO_Enabled, 5, 0)));
      edtTBM37_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_DEL_FLG_Enabled, 5, 0)));
      edtTBM37_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM37_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM37_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM37_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM37_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM37_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM37_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM37_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM37_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0N0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRF-ドメインマッピングマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317144937");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm37_crf_dom_map") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0N22( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z79TBM37_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z79TBM37_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z80TBM37_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z80TBM37_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z81TBM37_CRF_ITEM_GRP_DIV", GXutil.rtrim( Z81TBM37_CRF_ITEM_GRP_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z82TBM37_CRF_ITEM_GRP_CD", GXutil.rtrim( Z82TBM37_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z434TBM37_CRT_DATETIME", localUtil.ttoc( Z434TBM37_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z435TBM37_CRT_USER_ID", GXutil.rtrim( Z435TBM37_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z437TBM37_UPD_DATETIME", localUtil.ttoc( Z437TBM37_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z438TBM37_UPD_USER_ID", GXutil.rtrim( Z438TBM37_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z440TBM37_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z440TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z83TBM37_VISIT_NO", GXutil.ltrim( localUtil.ntoc( Z83TBM37_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z84TBM37_DOM_CD", GXutil.rtrim( Z84TBM37_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z500TBM37_DOM_VAR_NM", GXutil.rtrim( Z500TBM37_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z85TBM37_DOM_ITM_GRP_OID", GXutil.rtrim( Z85TBM37_DOM_ITM_GRP_OID));
      GxWebStd.gx_hidden_field( httpContext, "Z501TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( localUtil.ntoc( Z501TBM37_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z86TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( localUtil.ntoc( Z86TBM37_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z433TBM37_DEL_FLG", GXutil.rtrim( Z433TBM37_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z436TBM37_CRT_PROG_NM", GXutil.rtrim( Z436TBM37_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z439TBM37_UPD_PROG_NM", GXutil.rtrim( Z439TBM37_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O440TBM37_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O440TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM37_CRF_DOM_MAP" ;
   }

   public String getPgmdesc( )
   {
      return "CRF-ドメインマッピングマスタ" ;
   }

   public void initializeNonKey0N22( )
   {
      A434TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n434TBM37_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A434TBM37_CRT_DATETIME", localUtil.ttoc( A434TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n434TBM37_CRT_DATETIME = (GXutil.nullDate().equals(A434TBM37_CRT_DATETIME) ? true : false) ;
      A435TBM37_CRT_USER_ID = "" ;
      n435TBM37_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TBM37_CRT_USER_ID", A435TBM37_CRT_USER_ID);
      n435TBM37_CRT_USER_ID = ((GXutil.strcmp("", A435TBM37_CRT_USER_ID)==0) ? true : false) ;
      A437TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n437TBM37_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A437TBM37_UPD_DATETIME", localUtil.ttoc( A437TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n437TBM37_UPD_DATETIME = (GXutil.nullDate().equals(A437TBM37_UPD_DATETIME) ? true : false) ;
      A438TBM37_UPD_USER_ID = "" ;
      n438TBM37_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A438TBM37_UPD_USER_ID", A438TBM37_UPD_USER_ID);
      n438TBM37_UPD_USER_ID = ((GXutil.strcmp("", A438TBM37_UPD_USER_ID)==0) ? true : false) ;
      A440TBM37_UPD_CNT = 0 ;
      n440TBM37_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A440TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)));
      n440TBM37_UPD_CNT = ((0==A440TBM37_UPD_CNT) ? true : false) ;
      A83TBM37_VISIT_NO = 0 ;
      n83TBM37_VISIT_NO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A83TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A83TBM37_VISIT_NO, 6, 0)));
      n83TBM37_VISIT_NO = ((0==A83TBM37_VISIT_NO) ? true : false) ;
      A84TBM37_DOM_CD = "" ;
      n84TBM37_DOM_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A84TBM37_DOM_CD", A84TBM37_DOM_CD);
      n84TBM37_DOM_CD = ((GXutil.strcmp("", A84TBM37_DOM_CD)==0) ? true : false) ;
      A500TBM37_DOM_VAR_NM = "" ;
      n500TBM37_DOM_VAR_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A500TBM37_DOM_VAR_NM", A500TBM37_DOM_VAR_NM);
      n500TBM37_DOM_VAR_NM = ((GXutil.strcmp("", A500TBM37_DOM_VAR_NM)==0) ? true : false) ;
      A85TBM37_DOM_ITM_GRP_OID = "" ;
      n85TBM37_DOM_ITM_GRP_OID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A85TBM37_DOM_ITM_GRP_OID", A85TBM37_DOM_ITM_GRP_OID);
      n85TBM37_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A85TBM37_DOM_ITM_GRP_OID)==0) ? true : false) ;
      A501TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
      n501TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A501TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
      n501TBM37_DOM_ITM_GRP_ATTR_SEQ = ((0==A501TBM37_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
      A86TBM37_DOM_ITM_GRP_ROWNO = (short)(0) ;
      n86TBM37_DOM_ITM_GRP_ROWNO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A86TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A86TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
      n86TBM37_DOM_ITM_GRP_ROWNO = ((0==A86TBM37_DOM_ITM_GRP_ROWNO) ? true : false) ;
      A433TBM37_DEL_FLG = "" ;
      n433TBM37_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A433TBM37_DEL_FLG", A433TBM37_DEL_FLG);
      n433TBM37_DEL_FLG = ((GXutil.strcmp("", A433TBM37_DEL_FLG)==0) ? true : false) ;
      A436TBM37_CRT_PROG_NM = "" ;
      n436TBM37_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A436TBM37_CRT_PROG_NM", A436TBM37_CRT_PROG_NM);
      n436TBM37_CRT_PROG_NM = ((GXutil.strcmp("", A436TBM37_CRT_PROG_NM)==0) ? true : false) ;
      A439TBM37_UPD_PROG_NM = "" ;
      n439TBM37_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A439TBM37_UPD_PROG_NM", A439TBM37_UPD_PROG_NM);
      n439TBM37_UPD_PROG_NM = ((GXutil.strcmp("", A439TBM37_UPD_PROG_NM)==0) ? true : false) ;
      O440TBM37_UPD_CNT = A440TBM37_UPD_CNT ;
      n440TBM37_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A440TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A440TBM37_UPD_CNT, 10, 0)));
   }

   public void initAll0N22( )
   {
      A79TBM37_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A79TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A79TBM37_STUDY_ID, 10, 0)));
      A80TBM37_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A80TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A80TBM37_CRF_ID, 4, 0)));
      A81TBM37_CRF_ITEM_GRP_DIV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A81TBM37_CRF_ITEM_GRP_DIV", A81TBM37_CRF_ITEM_GRP_DIV);
      A82TBM37_CRF_ITEM_GRP_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A82TBM37_CRF_ITEM_GRP_CD", A82TBM37_CRF_ITEM_GRP_CD);
      initializeNonKey0N22( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317144947");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm37_crf_dom_map.js", "?20177317144948");
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
      lblTextblocktbm37_study_id_Internalname = "TEXTBLOCKTBM37_STUDY_ID" ;
      edtTBM37_STUDY_ID_Internalname = "TBM37_STUDY_ID" ;
      lblTextblocktbm37_crf_id_Internalname = "TEXTBLOCKTBM37_CRF_ID" ;
      edtTBM37_CRF_ID_Internalname = "TBM37_CRF_ID" ;
      lblTextblocktbm37_crf_item_grp_div_Internalname = "TEXTBLOCKTBM37_CRF_ITEM_GRP_DIV" ;
      edtTBM37_CRF_ITEM_GRP_DIV_Internalname = "TBM37_CRF_ITEM_GRP_DIV" ;
      lblTextblocktbm37_crf_item_grp_cd_Internalname = "TEXTBLOCKTBM37_CRF_ITEM_GRP_CD" ;
      edtTBM37_CRF_ITEM_GRP_CD_Internalname = "TBM37_CRF_ITEM_GRP_CD" ;
      lblTextblocktbm37_visit_no_Internalname = "TEXTBLOCKTBM37_VISIT_NO" ;
      edtTBM37_VISIT_NO_Internalname = "TBM37_VISIT_NO" ;
      lblTextblocktbm37_dom_cd_Internalname = "TEXTBLOCKTBM37_DOM_CD" ;
      edtTBM37_DOM_CD_Internalname = "TBM37_DOM_CD" ;
      lblTextblocktbm37_dom_var_nm_Internalname = "TEXTBLOCKTBM37_DOM_VAR_NM" ;
      edtTBM37_DOM_VAR_NM_Internalname = "TBM37_DOM_VAR_NM" ;
      lblTextblocktbm37_dom_itm_grp_oid_Internalname = "TEXTBLOCKTBM37_DOM_ITM_GRP_OID" ;
      edtTBM37_DOM_ITM_GRP_OID_Internalname = "TBM37_DOM_ITM_GRP_OID" ;
      lblTextblocktbm37_dom_itm_grp_attr_seq_Internalname = "TEXTBLOCKTBM37_DOM_ITM_GRP_ATTR_SEQ" ;
      edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname = "TBM37_DOM_ITM_GRP_ATTR_SEQ" ;
      lblTextblocktbm37_dom_itm_grp_rowno_Internalname = "TEXTBLOCKTBM37_DOM_ITM_GRP_ROWNO" ;
      edtTBM37_DOM_ITM_GRP_ROWNO_Internalname = "TBM37_DOM_ITM_GRP_ROWNO" ;
      lblTextblocktbm37_del_flg_Internalname = "TEXTBLOCKTBM37_DEL_FLG" ;
      edtTBM37_DEL_FLG_Internalname = "TBM37_DEL_FLG" ;
      lblTextblocktbm37_crt_datetime_Internalname = "TEXTBLOCKTBM37_CRT_DATETIME" ;
      edtTBM37_CRT_DATETIME_Internalname = "TBM37_CRT_DATETIME" ;
      lblTextblocktbm37_crt_user_id_Internalname = "TEXTBLOCKTBM37_CRT_USER_ID" ;
      edtTBM37_CRT_USER_ID_Internalname = "TBM37_CRT_USER_ID" ;
      lblTextblocktbm37_crt_prog_nm_Internalname = "TEXTBLOCKTBM37_CRT_PROG_NM" ;
      edtTBM37_CRT_PROG_NM_Internalname = "TBM37_CRT_PROG_NM" ;
      lblTextblocktbm37_upd_datetime_Internalname = "TEXTBLOCKTBM37_UPD_DATETIME" ;
      edtTBM37_UPD_DATETIME_Internalname = "TBM37_UPD_DATETIME" ;
      lblTextblocktbm37_upd_user_id_Internalname = "TEXTBLOCKTBM37_UPD_USER_ID" ;
      edtTBM37_UPD_USER_ID_Internalname = "TBM37_UPD_USER_ID" ;
      lblTextblocktbm37_upd_prog_nm_Internalname = "TEXTBLOCKTBM37_UPD_PROG_NM" ;
      edtTBM37_UPD_PROG_NM_Internalname = "TBM37_UPD_PROG_NM" ;
      lblTextblocktbm37_upd_cnt_Internalname = "TEXTBLOCKTBM37_UPD_CNT" ;
      edtTBM37_UPD_CNT_Internalname = "TBM37_UPD_CNT" ;
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
      edtTBM37_UPD_CNT_Jsonclick = "" ;
      edtTBM37_UPD_CNT_Enabled = 1 ;
      edtTBM37_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM37_UPD_PROG_NM_Enabled = 1 ;
      edtTBM37_UPD_USER_ID_Jsonclick = "" ;
      edtTBM37_UPD_USER_ID_Enabled = 1 ;
      edtTBM37_UPD_DATETIME_Jsonclick = "" ;
      edtTBM37_UPD_DATETIME_Enabled = 1 ;
      edtTBM37_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM37_CRT_PROG_NM_Enabled = 1 ;
      edtTBM37_CRT_USER_ID_Jsonclick = "" ;
      edtTBM37_CRT_USER_ID_Enabled = 1 ;
      edtTBM37_CRT_DATETIME_Jsonclick = "" ;
      edtTBM37_CRT_DATETIME_Enabled = 1 ;
      edtTBM37_DEL_FLG_Jsonclick = "" ;
      edtTBM37_DEL_FLG_Enabled = 1 ;
      edtTBM37_DOM_ITM_GRP_ROWNO_Jsonclick = "" ;
      edtTBM37_DOM_ITM_GRP_ROWNO_Enabled = 1 ;
      edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Jsonclick = "" ;
      edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Enabled = 1 ;
      edtTBM37_DOM_ITM_GRP_OID_Jsonclick = "" ;
      edtTBM37_DOM_ITM_GRP_OID_Enabled = 1 ;
      edtTBM37_DOM_VAR_NM_Jsonclick = "" ;
      edtTBM37_DOM_VAR_NM_Enabled = 1 ;
      edtTBM37_DOM_CD_Jsonclick = "" ;
      edtTBM37_DOM_CD_Enabled = 1 ;
      edtTBM37_VISIT_NO_Jsonclick = "" ;
      edtTBM37_VISIT_NO_Enabled = 1 ;
      edtTBM37_CRF_ITEM_GRP_CD_Jsonclick = "" ;
      edtTBM37_CRF_ITEM_GRP_CD_Enabled = 1 ;
      edtTBM37_CRF_ITEM_GRP_DIV_Jsonclick = "" ;
      edtTBM37_CRF_ITEM_GRP_DIV_Enabled = 1 ;
      edtTBM37_CRF_ID_Jsonclick = "" ;
      edtTBM37_CRF_ID_Enabled = 1 ;
      edtTBM37_STUDY_ID_Jsonclick = "" ;
      edtTBM37_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm37_crt_user_id0N22( String Gx_mode )
   {
      GXt_char1 = A435TBM37_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm37_crf_dom_map_impl.this.GXt_char1 = GXv_char2[0] ;
      A435TBM37_CRT_USER_ID = GXt_char1 ;
      n435TBM37_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TBM37_CRT_USER_ID", A435TBM37_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A435TBM37_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm37_upd_user_id0N22( String Gx_mode )
   {
      GXt_char1 = A438TBM37_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm37_crf_dom_map_impl.this.GXt_char1 = GXv_char2[0] ;
      A438TBM37_UPD_USER_ID = GXt_char1 ;
      n438TBM37_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A438TBM37_UPD_USER_ID", A438TBM37_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A438TBM37_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM37_VISIT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm37_crf_item_grp_cd( long GX_Parm1 ,
                                            short GX_Parm2 ,
                                            String GX_Parm3 ,
                                            String GX_Parm4 ,
                                            java.util.Date GX_Parm5 ,
                                            String GX_Parm6 ,
                                            java.util.Date GX_Parm7 ,
                                            String GX_Parm8 ,
                                            long GX_Parm9 ,
                                            int GX_Parm10 ,
                                            String GX_Parm11 ,
                                            String GX_Parm12 ,
                                            String GX_Parm13 ,
                                            short GX_Parm14 ,
                                            short GX_Parm15 ,
                                            String GX_Parm16 ,
                                            String GX_Parm17 ,
                                            String GX_Parm18 )
   {
      A79TBM37_STUDY_ID = GX_Parm1 ;
      A80TBM37_CRF_ID = GX_Parm2 ;
      A81TBM37_CRF_ITEM_GRP_DIV = GX_Parm3 ;
      A82TBM37_CRF_ITEM_GRP_CD = GX_Parm4 ;
      A434TBM37_CRT_DATETIME = GX_Parm5 ;
      n434TBM37_CRT_DATETIME = false ;
      A435TBM37_CRT_USER_ID = GX_Parm6 ;
      n435TBM37_CRT_USER_ID = false ;
      A437TBM37_UPD_DATETIME = GX_Parm7 ;
      n437TBM37_UPD_DATETIME = false ;
      A438TBM37_UPD_USER_ID = GX_Parm8 ;
      n438TBM37_UPD_USER_ID = false ;
      A440TBM37_UPD_CNT = GX_Parm9 ;
      n440TBM37_UPD_CNT = false ;
      A83TBM37_VISIT_NO = GX_Parm10 ;
      n83TBM37_VISIT_NO = false ;
      A84TBM37_DOM_CD = GX_Parm11 ;
      n84TBM37_DOM_CD = false ;
      A500TBM37_DOM_VAR_NM = GX_Parm12 ;
      n500TBM37_DOM_VAR_NM = false ;
      A85TBM37_DOM_ITM_GRP_OID = GX_Parm13 ;
      n85TBM37_DOM_ITM_GRP_OID = false ;
      A501TBM37_DOM_ITM_GRP_ATTR_SEQ = GX_Parm14 ;
      n501TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
      A86TBM37_DOM_ITM_GRP_ROWNO = GX_Parm15 ;
      n86TBM37_DOM_ITM_GRP_ROWNO = false ;
      A433TBM37_DEL_FLG = GX_Parm16 ;
      n433TBM37_DEL_FLG = false ;
      A436TBM37_CRT_PROG_NM = GX_Parm17 ;
      n436TBM37_CRT_PROG_NM = false ;
      A439TBM37_UPD_PROG_NM = GX_Parm18 ;
      n439TBM37_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A434TBM37_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A435TBM37_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A437TBM37_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A438TBM37_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A440TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A83TBM37_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A84TBM37_DOM_CD));
      isValidOutput.add(GXutil.rtrim( A500TBM37_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( A85TBM37_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A501TBM37_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A86TBM37_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A433TBM37_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A436TBM37_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A439TBM37_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z79TBM37_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z80TBM37_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z81TBM37_CRF_ITEM_GRP_DIV));
      isValidOutput.add(GXutil.rtrim( Z82TBM37_CRF_ITEM_GRP_CD));
      isValidOutput.add(localUtil.ttoc( Z434TBM37_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z435TBM37_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z437TBM37_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z438TBM37_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z440TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z83TBM37_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z84TBM37_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z500TBM37_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( Z85TBM37_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z501TBM37_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z86TBM37_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z433TBM37_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z436TBM37_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z439TBM37_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O440TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z81TBM37_CRF_ITEM_GRP_DIV = "" ;
      Z82TBM37_CRF_ITEM_GRP_CD = "" ;
      Z434TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z435TBM37_CRT_USER_ID = "" ;
      Z437TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z438TBM37_UPD_USER_ID = "" ;
      Z84TBM37_DOM_CD = "" ;
      Z500TBM37_DOM_VAR_NM = "" ;
      Z85TBM37_DOM_ITM_GRP_OID = "" ;
      Z433TBM37_DEL_FLG = "" ;
      Z436TBM37_CRT_PROG_NM = "" ;
      Z439TBM37_UPD_PROG_NM = "" ;
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
      lblTextblocktbm37_study_id_Jsonclick = "" ;
      lblTextblocktbm37_crf_id_Jsonclick = "" ;
      lblTextblocktbm37_crf_item_grp_div_Jsonclick = "" ;
      A81TBM37_CRF_ITEM_GRP_DIV = "" ;
      lblTextblocktbm37_crf_item_grp_cd_Jsonclick = "" ;
      A82TBM37_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbm37_visit_no_Jsonclick = "" ;
      lblTextblocktbm37_dom_cd_Jsonclick = "" ;
      A84TBM37_DOM_CD = "" ;
      lblTextblocktbm37_dom_var_nm_Jsonclick = "" ;
      A500TBM37_DOM_VAR_NM = "" ;
      lblTextblocktbm37_dom_itm_grp_oid_Jsonclick = "" ;
      A85TBM37_DOM_ITM_GRP_OID = "" ;
      lblTextblocktbm37_dom_itm_grp_attr_seq_Jsonclick = "" ;
      lblTextblocktbm37_dom_itm_grp_rowno_Jsonclick = "" ;
      lblTextblocktbm37_del_flg_Jsonclick = "" ;
      A433TBM37_DEL_FLG = "" ;
      lblTextblocktbm37_crt_datetime_Jsonclick = "" ;
      A434TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm37_crt_user_id_Jsonclick = "" ;
      A435TBM37_CRT_USER_ID = "" ;
      lblTextblocktbm37_crt_prog_nm_Jsonclick = "" ;
      A436TBM37_CRT_PROG_NM = "" ;
      lblTextblocktbm37_upd_datetime_Jsonclick = "" ;
      A437TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm37_upd_user_id_Jsonclick = "" ;
      A438TBM37_UPD_USER_ID = "" ;
      lblTextblocktbm37_upd_prog_nm_Jsonclick = "" ;
      A439TBM37_UPD_PROG_NM = "" ;
      lblTextblocktbm37_upd_cnt_Jsonclick = "" ;
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
      T000N4_A79TBM37_STUDY_ID = new long[1] ;
      T000N4_A80TBM37_CRF_ID = new short[1] ;
      T000N4_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N4_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N4_A434TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N4_n434TBM37_CRT_DATETIME = new boolean[] {false} ;
      T000N4_A435TBM37_CRT_USER_ID = new String[] {""} ;
      T000N4_n435TBM37_CRT_USER_ID = new boolean[] {false} ;
      T000N4_A437TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N4_n437TBM37_UPD_DATETIME = new boolean[] {false} ;
      T000N4_A438TBM37_UPD_USER_ID = new String[] {""} ;
      T000N4_n438TBM37_UPD_USER_ID = new boolean[] {false} ;
      T000N4_A440TBM37_UPD_CNT = new long[1] ;
      T000N4_n440TBM37_UPD_CNT = new boolean[] {false} ;
      T000N4_A83TBM37_VISIT_NO = new int[1] ;
      T000N4_n83TBM37_VISIT_NO = new boolean[] {false} ;
      T000N4_A84TBM37_DOM_CD = new String[] {""} ;
      T000N4_n84TBM37_DOM_CD = new boolean[] {false} ;
      T000N4_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      T000N4_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      T000N4_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      T000N4_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000N4_A501TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000N4_n501TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000N4_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000N4_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000N4_A433TBM37_DEL_FLG = new String[] {""} ;
      T000N4_n433TBM37_DEL_FLG = new boolean[] {false} ;
      T000N4_A436TBM37_CRT_PROG_NM = new String[] {""} ;
      T000N4_n436TBM37_CRT_PROG_NM = new boolean[] {false} ;
      T000N4_A439TBM37_UPD_PROG_NM = new String[] {""} ;
      T000N4_n439TBM37_UPD_PROG_NM = new boolean[] {false} ;
      T000N5_A79TBM37_STUDY_ID = new long[1] ;
      T000N5_A80TBM37_CRF_ID = new short[1] ;
      T000N5_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N5_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N3_A79TBM37_STUDY_ID = new long[1] ;
      T000N3_A80TBM37_CRF_ID = new short[1] ;
      T000N3_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N3_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N3_A434TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N3_n434TBM37_CRT_DATETIME = new boolean[] {false} ;
      T000N3_A435TBM37_CRT_USER_ID = new String[] {""} ;
      T000N3_n435TBM37_CRT_USER_ID = new boolean[] {false} ;
      T000N3_A437TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N3_n437TBM37_UPD_DATETIME = new boolean[] {false} ;
      T000N3_A438TBM37_UPD_USER_ID = new String[] {""} ;
      T000N3_n438TBM37_UPD_USER_ID = new boolean[] {false} ;
      T000N3_A440TBM37_UPD_CNT = new long[1] ;
      T000N3_n440TBM37_UPD_CNT = new boolean[] {false} ;
      T000N3_A83TBM37_VISIT_NO = new int[1] ;
      T000N3_n83TBM37_VISIT_NO = new boolean[] {false} ;
      T000N3_A84TBM37_DOM_CD = new String[] {""} ;
      T000N3_n84TBM37_DOM_CD = new boolean[] {false} ;
      T000N3_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      T000N3_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      T000N3_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      T000N3_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000N3_A501TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000N3_n501TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000N3_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000N3_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000N3_A433TBM37_DEL_FLG = new String[] {""} ;
      T000N3_n433TBM37_DEL_FLG = new boolean[] {false} ;
      T000N3_A436TBM37_CRT_PROG_NM = new String[] {""} ;
      T000N3_n436TBM37_CRT_PROG_NM = new boolean[] {false} ;
      T000N3_A439TBM37_UPD_PROG_NM = new String[] {""} ;
      T000N3_n439TBM37_UPD_PROG_NM = new boolean[] {false} ;
      sMode22 = "" ;
      T000N6_A79TBM37_STUDY_ID = new long[1] ;
      T000N6_A80TBM37_CRF_ID = new short[1] ;
      T000N6_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N6_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N7_A79TBM37_STUDY_ID = new long[1] ;
      T000N7_A80TBM37_CRF_ID = new short[1] ;
      T000N7_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N7_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N2_A79TBM37_STUDY_ID = new long[1] ;
      T000N2_A80TBM37_CRF_ID = new short[1] ;
      T000N2_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N2_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N2_A434TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N2_n434TBM37_CRT_DATETIME = new boolean[] {false} ;
      T000N2_A435TBM37_CRT_USER_ID = new String[] {""} ;
      T000N2_n435TBM37_CRT_USER_ID = new boolean[] {false} ;
      T000N2_A437TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N2_n437TBM37_UPD_DATETIME = new boolean[] {false} ;
      T000N2_A438TBM37_UPD_USER_ID = new String[] {""} ;
      T000N2_n438TBM37_UPD_USER_ID = new boolean[] {false} ;
      T000N2_A440TBM37_UPD_CNT = new long[1] ;
      T000N2_n440TBM37_UPD_CNT = new boolean[] {false} ;
      T000N2_A83TBM37_VISIT_NO = new int[1] ;
      T000N2_n83TBM37_VISIT_NO = new boolean[] {false} ;
      T000N2_A84TBM37_DOM_CD = new String[] {""} ;
      T000N2_n84TBM37_DOM_CD = new boolean[] {false} ;
      T000N2_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      T000N2_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      T000N2_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      T000N2_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000N2_A501TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000N2_n501TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000N2_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000N2_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000N2_A433TBM37_DEL_FLG = new String[] {""} ;
      T000N2_n433TBM37_DEL_FLG = new boolean[] {false} ;
      T000N2_A436TBM37_CRT_PROG_NM = new String[] {""} ;
      T000N2_n436TBM37_CRT_PROG_NM = new boolean[] {false} ;
      T000N2_A439TBM37_UPD_PROG_NM = new String[] {""} ;
      T000N2_n439TBM37_UPD_PROG_NM = new boolean[] {false} ;
      T000N11_A79TBM37_STUDY_ID = new long[1] ;
      T000N11_A80TBM37_CRF_ID = new short[1] ;
      T000N11_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N11_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm37_crf_dom_map__default(),
         new Object[] {
             new Object[] {
            T000N2_A79TBM37_STUDY_ID, T000N2_A80TBM37_CRF_ID, T000N2_A81TBM37_CRF_ITEM_GRP_DIV, T000N2_A82TBM37_CRF_ITEM_GRP_CD, T000N2_A434TBM37_CRT_DATETIME, T000N2_n434TBM37_CRT_DATETIME, T000N2_A435TBM37_CRT_USER_ID, T000N2_n435TBM37_CRT_USER_ID, T000N2_A437TBM37_UPD_DATETIME, T000N2_n437TBM37_UPD_DATETIME,
            T000N2_A438TBM37_UPD_USER_ID, T000N2_n438TBM37_UPD_USER_ID, T000N2_A440TBM37_UPD_CNT, T000N2_n440TBM37_UPD_CNT, T000N2_A83TBM37_VISIT_NO, T000N2_n83TBM37_VISIT_NO, T000N2_A84TBM37_DOM_CD, T000N2_n84TBM37_DOM_CD, T000N2_A500TBM37_DOM_VAR_NM, T000N2_n500TBM37_DOM_VAR_NM,
            T000N2_A85TBM37_DOM_ITM_GRP_OID, T000N2_n85TBM37_DOM_ITM_GRP_OID, T000N2_A501TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N2_n501TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N2_A86TBM37_DOM_ITM_GRP_ROWNO, T000N2_n86TBM37_DOM_ITM_GRP_ROWNO, T000N2_A433TBM37_DEL_FLG, T000N2_n433TBM37_DEL_FLG, T000N2_A436TBM37_CRT_PROG_NM, T000N2_n436TBM37_CRT_PROG_NM,
            T000N2_A439TBM37_UPD_PROG_NM, T000N2_n439TBM37_UPD_PROG_NM
            }
            , new Object[] {
            T000N3_A79TBM37_STUDY_ID, T000N3_A80TBM37_CRF_ID, T000N3_A81TBM37_CRF_ITEM_GRP_DIV, T000N3_A82TBM37_CRF_ITEM_GRP_CD, T000N3_A434TBM37_CRT_DATETIME, T000N3_n434TBM37_CRT_DATETIME, T000N3_A435TBM37_CRT_USER_ID, T000N3_n435TBM37_CRT_USER_ID, T000N3_A437TBM37_UPD_DATETIME, T000N3_n437TBM37_UPD_DATETIME,
            T000N3_A438TBM37_UPD_USER_ID, T000N3_n438TBM37_UPD_USER_ID, T000N3_A440TBM37_UPD_CNT, T000N3_n440TBM37_UPD_CNT, T000N3_A83TBM37_VISIT_NO, T000N3_n83TBM37_VISIT_NO, T000N3_A84TBM37_DOM_CD, T000N3_n84TBM37_DOM_CD, T000N3_A500TBM37_DOM_VAR_NM, T000N3_n500TBM37_DOM_VAR_NM,
            T000N3_A85TBM37_DOM_ITM_GRP_OID, T000N3_n85TBM37_DOM_ITM_GRP_OID, T000N3_A501TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N3_n501TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N3_A86TBM37_DOM_ITM_GRP_ROWNO, T000N3_n86TBM37_DOM_ITM_GRP_ROWNO, T000N3_A433TBM37_DEL_FLG, T000N3_n433TBM37_DEL_FLG, T000N3_A436TBM37_CRT_PROG_NM, T000N3_n436TBM37_CRT_PROG_NM,
            T000N3_A439TBM37_UPD_PROG_NM, T000N3_n439TBM37_UPD_PROG_NM
            }
            , new Object[] {
            T000N4_A79TBM37_STUDY_ID, T000N4_A80TBM37_CRF_ID, T000N4_A81TBM37_CRF_ITEM_GRP_DIV, T000N4_A82TBM37_CRF_ITEM_GRP_CD, T000N4_A434TBM37_CRT_DATETIME, T000N4_n434TBM37_CRT_DATETIME, T000N4_A435TBM37_CRT_USER_ID, T000N4_n435TBM37_CRT_USER_ID, T000N4_A437TBM37_UPD_DATETIME, T000N4_n437TBM37_UPD_DATETIME,
            T000N4_A438TBM37_UPD_USER_ID, T000N4_n438TBM37_UPD_USER_ID, T000N4_A440TBM37_UPD_CNT, T000N4_n440TBM37_UPD_CNT, T000N4_A83TBM37_VISIT_NO, T000N4_n83TBM37_VISIT_NO, T000N4_A84TBM37_DOM_CD, T000N4_n84TBM37_DOM_CD, T000N4_A500TBM37_DOM_VAR_NM, T000N4_n500TBM37_DOM_VAR_NM,
            T000N4_A85TBM37_DOM_ITM_GRP_OID, T000N4_n85TBM37_DOM_ITM_GRP_OID, T000N4_A501TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N4_n501TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N4_A86TBM37_DOM_ITM_GRP_ROWNO, T000N4_n86TBM37_DOM_ITM_GRP_ROWNO, T000N4_A433TBM37_DEL_FLG, T000N4_n433TBM37_DEL_FLG, T000N4_A436TBM37_CRT_PROG_NM, T000N4_n436TBM37_CRT_PROG_NM,
            T000N4_A439TBM37_UPD_PROG_NM, T000N4_n439TBM37_UPD_PROG_NM
            }
            , new Object[] {
            T000N5_A79TBM37_STUDY_ID, T000N5_A80TBM37_CRF_ID, T000N5_A81TBM37_CRF_ITEM_GRP_DIV, T000N5_A82TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T000N6_A79TBM37_STUDY_ID, T000N6_A80TBM37_CRF_ID, T000N6_A81TBM37_CRF_ITEM_GRP_DIV, T000N6_A82TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T000N7_A79TBM37_STUDY_ID, T000N7_A80TBM37_CRF_ID, T000N7_A81TBM37_CRF_ITEM_GRP_DIV, T000N7_A82TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000N11_A79TBM37_STUDY_ID, T000N11_A80TBM37_CRF_ID, T000N11_A81TBM37_CRF_ITEM_GRP_DIV, T000N11_A82TBM37_CRF_ITEM_GRP_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM37_CRF_DOM_MAP" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z80TBM37_CRF_ID ;
   private short Z501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short Z86TBM37_DOM_ITM_GRP_ROWNO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A80TBM37_CRF_ID ;
   private short A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A86TBM37_DOM_ITM_GRP_ROWNO ;
   private short RcdFound22 ;
   private short Gx_err ;
   private int Z83TBM37_VISIT_NO ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM37_STUDY_ID_Enabled ;
   private int edtTBM37_CRF_ID_Enabled ;
   private int edtTBM37_CRF_ITEM_GRP_DIV_Enabled ;
   private int edtTBM37_CRF_ITEM_GRP_CD_Enabled ;
   private int A83TBM37_VISIT_NO ;
   private int edtTBM37_VISIT_NO_Enabled ;
   private int edtTBM37_DOM_CD_Enabled ;
   private int edtTBM37_DOM_VAR_NM_Enabled ;
   private int edtTBM37_DOM_ITM_GRP_OID_Enabled ;
   private int edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Enabled ;
   private int edtTBM37_DOM_ITM_GRP_ROWNO_Enabled ;
   private int edtTBM37_DEL_FLG_Enabled ;
   private int edtTBM37_CRT_DATETIME_Enabled ;
   private int edtTBM37_CRT_USER_ID_Enabled ;
   private int edtTBM37_CRT_PROG_NM_Enabled ;
   private int edtTBM37_UPD_DATETIME_Enabled ;
   private int edtTBM37_UPD_USER_ID_Enabled ;
   private int edtTBM37_UPD_PROG_NM_Enabled ;
   private int edtTBM37_UPD_CNT_Enabled ;
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
   private long Z79TBM37_STUDY_ID ;
   private long Z440TBM37_UPD_CNT ;
   private long O440TBM37_UPD_CNT ;
   private long A79TBM37_STUDY_ID ;
   private long A440TBM37_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM37_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm37_study_id_Internalname ;
   private String lblTextblocktbm37_study_id_Jsonclick ;
   private String edtTBM37_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm37_crf_id_Internalname ;
   private String lblTextblocktbm37_crf_id_Jsonclick ;
   private String edtTBM37_CRF_ID_Internalname ;
   private String edtTBM37_CRF_ID_Jsonclick ;
   private String lblTextblocktbm37_crf_item_grp_div_Internalname ;
   private String lblTextblocktbm37_crf_item_grp_div_Jsonclick ;
   private String edtTBM37_CRF_ITEM_GRP_DIV_Internalname ;
   private String edtTBM37_CRF_ITEM_GRP_DIV_Jsonclick ;
   private String lblTextblocktbm37_crf_item_grp_cd_Internalname ;
   private String lblTextblocktbm37_crf_item_grp_cd_Jsonclick ;
   private String edtTBM37_CRF_ITEM_GRP_CD_Internalname ;
   private String edtTBM37_CRF_ITEM_GRP_CD_Jsonclick ;
   private String lblTextblocktbm37_visit_no_Internalname ;
   private String lblTextblocktbm37_visit_no_Jsonclick ;
   private String edtTBM37_VISIT_NO_Internalname ;
   private String edtTBM37_VISIT_NO_Jsonclick ;
   private String lblTextblocktbm37_dom_cd_Internalname ;
   private String lblTextblocktbm37_dom_cd_Jsonclick ;
   private String edtTBM37_DOM_CD_Internalname ;
   private String edtTBM37_DOM_CD_Jsonclick ;
   private String lblTextblocktbm37_dom_var_nm_Internalname ;
   private String lblTextblocktbm37_dom_var_nm_Jsonclick ;
   private String edtTBM37_DOM_VAR_NM_Internalname ;
   private String edtTBM37_DOM_VAR_NM_Jsonclick ;
   private String lblTextblocktbm37_dom_itm_grp_oid_Internalname ;
   private String lblTextblocktbm37_dom_itm_grp_oid_Jsonclick ;
   private String edtTBM37_DOM_ITM_GRP_OID_Internalname ;
   private String edtTBM37_DOM_ITM_GRP_OID_Jsonclick ;
   private String lblTextblocktbm37_dom_itm_grp_attr_seq_Internalname ;
   private String lblTextblocktbm37_dom_itm_grp_attr_seq_Jsonclick ;
   private String edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname ;
   private String edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Jsonclick ;
   private String lblTextblocktbm37_dom_itm_grp_rowno_Internalname ;
   private String lblTextblocktbm37_dom_itm_grp_rowno_Jsonclick ;
   private String edtTBM37_DOM_ITM_GRP_ROWNO_Internalname ;
   private String edtTBM37_DOM_ITM_GRP_ROWNO_Jsonclick ;
   private String lblTextblocktbm37_del_flg_Internalname ;
   private String lblTextblocktbm37_del_flg_Jsonclick ;
   private String edtTBM37_DEL_FLG_Internalname ;
   private String edtTBM37_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm37_crt_datetime_Internalname ;
   private String lblTextblocktbm37_crt_datetime_Jsonclick ;
   private String edtTBM37_CRT_DATETIME_Internalname ;
   private String edtTBM37_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm37_crt_user_id_Internalname ;
   private String lblTextblocktbm37_crt_user_id_Jsonclick ;
   private String edtTBM37_CRT_USER_ID_Internalname ;
   private String edtTBM37_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm37_crt_prog_nm_Internalname ;
   private String lblTextblocktbm37_crt_prog_nm_Jsonclick ;
   private String edtTBM37_CRT_PROG_NM_Internalname ;
   private String edtTBM37_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm37_upd_datetime_Internalname ;
   private String lblTextblocktbm37_upd_datetime_Jsonclick ;
   private String edtTBM37_UPD_DATETIME_Internalname ;
   private String edtTBM37_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm37_upd_user_id_Internalname ;
   private String lblTextblocktbm37_upd_user_id_Jsonclick ;
   private String edtTBM37_UPD_USER_ID_Internalname ;
   private String edtTBM37_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm37_upd_prog_nm_Internalname ;
   private String lblTextblocktbm37_upd_prog_nm_Jsonclick ;
   private String edtTBM37_UPD_PROG_NM_Internalname ;
   private String edtTBM37_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm37_upd_cnt_Internalname ;
   private String lblTextblocktbm37_upd_cnt_Jsonclick ;
   private String edtTBM37_UPD_CNT_Internalname ;
   private String edtTBM37_UPD_CNT_Jsonclick ;
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
   private String sMode22 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z434TBM37_CRT_DATETIME ;
   private java.util.Date Z437TBM37_UPD_DATETIME ;
   private java.util.Date A434TBM37_CRT_DATETIME ;
   private java.util.Date A437TBM37_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n83TBM37_VISIT_NO ;
   private boolean n84TBM37_DOM_CD ;
   private boolean n500TBM37_DOM_VAR_NM ;
   private boolean n85TBM37_DOM_ITM_GRP_OID ;
   private boolean n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n433TBM37_DEL_FLG ;
   private boolean n434TBM37_CRT_DATETIME ;
   private boolean n435TBM37_CRT_USER_ID ;
   private boolean n436TBM37_CRT_PROG_NM ;
   private boolean n437TBM37_UPD_DATETIME ;
   private boolean n438TBM37_UPD_USER_ID ;
   private boolean n439TBM37_UPD_PROG_NM ;
   private boolean n440TBM37_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z81TBM37_CRF_ITEM_GRP_DIV ;
   private String Z82TBM37_CRF_ITEM_GRP_CD ;
   private String Z435TBM37_CRT_USER_ID ;
   private String Z438TBM37_UPD_USER_ID ;
   private String Z84TBM37_DOM_CD ;
   private String Z500TBM37_DOM_VAR_NM ;
   private String Z85TBM37_DOM_ITM_GRP_OID ;
   private String Z433TBM37_DEL_FLG ;
   private String Z436TBM37_CRT_PROG_NM ;
   private String Z439TBM37_UPD_PROG_NM ;
   private String A81TBM37_CRF_ITEM_GRP_DIV ;
   private String A82TBM37_CRF_ITEM_GRP_CD ;
   private String A84TBM37_DOM_CD ;
   private String A500TBM37_DOM_VAR_NM ;
   private String A85TBM37_DOM_ITM_GRP_OID ;
   private String A433TBM37_DEL_FLG ;
   private String A435TBM37_CRT_USER_ID ;
   private String A436TBM37_CRT_PROG_NM ;
   private String A438TBM37_UPD_USER_ID ;
   private String A439TBM37_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000N4_A79TBM37_STUDY_ID ;
   private short[] T000N4_A80TBM37_CRF_ID ;
   private String[] T000N4_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N4_A82TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000N4_A434TBM37_CRT_DATETIME ;
   private boolean[] T000N4_n434TBM37_CRT_DATETIME ;
   private String[] T000N4_A435TBM37_CRT_USER_ID ;
   private boolean[] T000N4_n435TBM37_CRT_USER_ID ;
   private java.util.Date[] T000N4_A437TBM37_UPD_DATETIME ;
   private boolean[] T000N4_n437TBM37_UPD_DATETIME ;
   private String[] T000N4_A438TBM37_UPD_USER_ID ;
   private boolean[] T000N4_n438TBM37_UPD_USER_ID ;
   private long[] T000N4_A440TBM37_UPD_CNT ;
   private boolean[] T000N4_n440TBM37_UPD_CNT ;
   private int[] T000N4_A83TBM37_VISIT_NO ;
   private boolean[] T000N4_n83TBM37_VISIT_NO ;
   private String[] T000N4_A84TBM37_DOM_CD ;
   private boolean[] T000N4_n84TBM37_DOM_CD ;
   private String[] T000N4_A500TBM37_DOM_VAR_NM ;
   private boolean[] T000N4_n500TBM37_DOM_VAR_NM ;
   private String[] T000N4_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] T000N4_n85TBM37_DOM_ITM_GRP_OID ;
   private short[] T000N4_A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000N4_n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000N4_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000N4_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] T000N4_A433TBM37_DEL_FLG ;
   private boolean[] T000N4_n433TBM37_DEL_FLG ;
   private String[] T000N4_A436TBM37_CRT_PROG_NM ;
   private boolean[] T000N4_n436TBM37_CRT_PROG_NM ;
   private String[] T000N4_A439TBM37_UPD_PROG_NM ;
   private boolean[] T000N4_n439TBM37_UPD_PROG_NM ;
   private long[] T000N5_A79TBM37_STUDY_ID ;
   private short[] T000N5_A80TBM37_CRF_ID ;
   private String[] T000N5_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N5_A82TBM37_CRF_ITEM_GRP_CD ;
   private long[] T000N3_A79TBM37_STUDY_ID ;
   private short[] T000N3_A80TBM37_CRF_ID ;
   private String[] T000N3_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N3_A82TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000N3_A434TBM37_CRT_DATETIME ;
   private boolean[] T000N3_n434TBM37_CRT_DATETIME ;
   private String[] T000N3_A435TBM37_CRT_USER_ID ;
   private boolean[] T000N3_n435TBM37_CRT_USER_ID ;
   private java.util.Date[] T000N3_A437TBM37_UPD_DATETIME ;
   private boolean[] T000N3_n437TBM37_UPD_DATETIME ;
   private String[] T000N3_A438TBM37_UPD_USER_ID ;
   private boolean[] T000N3_n438TBM37_UPD_USER_ID ;
   private long[] T000N3_A440TBM37_UPD_CNT ;
   private boolean[] T000N3_n440TBM37_UPD_CNT ;
   private int[] T000N3_A83TBM37_VISIT_NO ;
   private boolean[] T000N3_n83TBM37_VISIT_NO ;
   private String[] T000N3_A84TBM37_DOM_CD ;
   private boolean[] T000N3_n84TBM37_DOM_CD ;
   private String[] T000N3_A500TBM37_DOM_VAR_NM ;
   private boolean[] T000N3_n500TBM37_DOM_VAR_NM ;
   private String[] T000N3_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] T000N3_n85TBM37_DOM_ITM_GRP_OID ;
   private short[] T000N3_A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000N3_n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000N3_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000N3_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] T000N3_A433TBM37_DEL_FLG ;
   private boolean[] T000N3_n433TBM37_DEL_FLG ;
   private String[] T000N3_A436TBM37_CRT_PROG_NM ;
   private boolean[] T000N3_n436TBM37_CRT_PROG_NM ;
   private String[] T000N3_A439TBM37_UPD_PROG_NM ;
   private boolean[] T000N3_n439TBM37_UPD_PROG_NM ;
   private long[] T000N6_A79TBM37_STUDY_ID ;
   private short[] T000N6_A80TBM37_CRF_ID ;
   private String[] T000N6_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N6_A82TBM37_CRF_ITEM_GRP_CD ;
   private long[] T000N7_A79TBM37_STUDY_ID ;
   private short[] T000N7_A80TBM37_CRF_ID ;
   private String[] T000N7_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N7_A82TBM37_CRF_ITEM_GRP_CD ;
   private long[] T000N2_A79TBM37_STUDY_ID ;
   private short[] T000N2_A80TBM37_CRF_ID ;
   private String[] T000N2_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N2_A82TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000N2_A434TBM37_CRT_DATETIME ;
   private boolean[] T000N2_n434TBM37_CRT_DATETIME ;
   private String[] T000N2_A435TBM37_CRT_USER_ID ;
   private boolean[] T000N2_n435TBM37_CRT_USER_ID ;
   private java.util.Date[] T000N2_A437TBM37_UPD_DATETIME ;
   private boolean[] T000N2_n437TBM37_UPD_DATETIME ;
   private String[] T000N2_A438TBM37_UPD_USER_ID ;
   private boolean[] T000N2_n438TBM37_UPD_USER_ID ;
   private long[] T000N2_A440TBM37_UPD_CNT ;
   private boolean[] T000N2_n440TBM37_UPD_CNT ;
   private int[] T000N2_A83TBM37_VISIT_NO ;
   private boolean[] T000N2_n83TBM37_VISIT_NO ;
   private String[] T000N2_A84TBM37_DOM_CD ;
   private boolean[] T000N2_n84TBM37_DOM_CD ;
   private String[] T000N2_A500TBM37_DOM_VAR_NM ;
   private boolean[] T000N2_n500TBM37_DOM_VAR_NM ;
   private String[] T000N2_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] T000N2_n85TBM37_DOM_ITM_GRP_OID ;
   private short[] T000N2_A501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000N2_n501TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000N2_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000N2_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] T000N2_A433TBM37_DEL_FLG ;
   private boolean[] T000N2_n433TBM37_DEL_FLG ;
   private String[] T000N2_A436TBM37_CRT_PROG_NM ;
   private boolean[] T000N2_n436TBM37_CRT_PROG_NM ;
   private String[] T000N2_A439TBM37_UPD_PROG_NM ;
   private boolean[] T000N2_n439TBM37_UPD_PROG_NM ;
   private long[] T000N11_A79TBM37_STUDY_ID ;
   private short[] T000N11_A80TBM37_CRF_ID ;
   private String[] T000N11_A81TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N11_A82TBM37_CRF_ITEM_GRP_CD ;
}

final  class tbm37_crf_dom_map__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000N2", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N3", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N4", "SELECT TM1.`TBM37_STUDY_ID`, TM1.`TBM37_CRF_ID`, TM1.`TBM37_CRF_ITEM_GRP_DIV`, TM1.`TBM37_CRF_ITEM_GRP_CD`, TM1.`TBM37_CRT_DATETIME`, TM1.`TBM37_CRT_USER_ID`, TM1.`TBM37_UPD_DATETIME`, TM1.`TBM37_UPD_USER_ID`, TM1.`TBM37_UPD_CNT`, TM1.`TBM37_VISIT_NO`, TM1.`TBM37_DOM_CD`, TM1.`TBM37_DOM_VAR_NM`, TM1.`TBM37_DOM_ITM_GRP_OID`, TM1.`TBM37_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM37_DOM_ITM_GRP_ROWNO`, TM1.`TBM37_DEL_FLG`, TM1.`TBM37_CRT_PROG_NM`, TM1.`TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` TM1 WHERE TM1.`TBM37_STUDY_ID` = ? and TM1.`TBM37_CRF_ID` = ? and TM1.`TBM37_CRF_ITEM_GRP_DIV` = ? and TM1.`TBM37_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBM37_STUDY_ID`, TM1.`TBM37_CRF_ID`, TM1.`TBM37_CRF_ITEM_GRP_DIV`, TM1.`TBM37_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000N5", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N6", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE ( `TBM37_STUDY_ID` > ? or `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` > ? or `TBM37_CRF_ID` = ? and `TBM37_STUDY_ID` = ? and `TBM37_CRF_ITEM_GRP_DIV` > ? or `TBM37_CRF_ITEM_GRP_DIV` = ? and `TBM37_CRF_ID` = ? and `TBM37_STUDY_ID` = ? and `TBM37_CRF_ITEM_GRP_CD` > ?) ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000N7", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE ( `TBM37_STUDY_ID` < ? or `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` < ? or `TBM37_CRF_ID` = ? and `TBM37_STUDY_ID` = ? and `TBM37_CRF_ITEM_GRP_DIV` < ? or `TBM37_CRF_ITEM_GRP_DIV` = ? and `TBM37_CRF_ID` = ? and `TBM37_STUDY_ID` = ? and `TBM37_CRF_ITEM_GRP_CD` < ?) ORDER BY `TBM37_STUDY_ID` DESC, `TBM37_CRF_ID` DESC, `TBM37_CRF_ITEM_GRP_DIV` DESC, `TBM37_CRF_ITEM_GRP_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000N8", "INSERT INTO `TBM37_CRF_DOM_MAP`(`TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000N9", "UPDATE `TBM37_CRF_DOM_MAP` SET `TBM37_CRT_DATETIME`=?, `TBM37_CRT_USER_ID`=?, `TBM37_UPD_DATETIME`=?, `TBM37_UPD_USER_ID`=?, `TBM37_UPD_CNT`=?, `TBM37_VISIT_NO`=?, `TBM37_DOM_CD`=?, `TBM37_DOM_VAR_NM`=?, `TBM37_DOM_ITM_GRP_OID`=?, `TBM37_DOM_ITM_GRP_ATTR_SEQ`=?, `TBM37_DOM_ITM_GRP_ROWNO`=?, `TBM37_DEL_FLG`=?, `TBM37_CRT_PROG_NM`=?, `TBM37_UPD_PROG_NM`=?  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000N10", "DELETE FROM `TBM37_CRF_DOM_MAP`  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000N11", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 50);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 50);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[31], 40);
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
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 50);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 50);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 40);
               }
               stmt.setLong(15, ((Number) parms[28]).longValue());
               stmt.setShort(16, ((Number) parms[29]).shortValue());
               stmt.setVarchar(17, (String)parms[30], 1, false);
               stmt.setVarchar(18, (String)parms[31], 50, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               return;
      }
   }

}

